package at.ac.tuwien.big.forms.htmlgen;

import at.ac.tuwien.big.forms.Attribute;
import at.ac.tuwien.big.forms.AttributePageElement;
import at.ac.tuwien.big.forms.AttributeType;
import at.ac.tuwien.big.forms.AttributeValueCondition;
import at.ac.tuwien.big.forms.Column;
import at.ac.tuwien.big.forms.CompositeCondition;
import at.ac.tuwien.big.forms.CompositeConditionType;
import at.ac.tuwien.big.forms.Condition;
import at.ac.tuwien.big.forms.ConditionType;
import at.ac.tuwien.big.forms.DateSelectionField;
import at.ac.tuwien.big.forms.Enumeration;
import at.ac.tuwien.big.forms.Form;
import at.ac.tuwien.big.forms.FormModel;
import at.ac.tuwien.big.forms.List;
import at.ac.tuwien.big.forms.Literal;
import at.ac.tuwien.big.forms.Page;
import at.ac.tuwien.big.forms.PageElement;
import at.ac.tuwien.big.forms.Relationship;
import at.ac.tuwien.big.forms.RelationshipPageElement;
import at.ac.tuwien.big.forms.SelectionField;
import at.ac.tuwien.big.forms.Table;
import at.ac.tuwien.big.forms.TextArea;
import at.ac.tuwien.big.forms.TextField;
import at.ac.tuwien.big.forms.TimeSelectionField;
import com.google.common.base.Objects;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class Form2HTMLGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    ResourceSet _resourceSet = resource.getResourceSet();
    final EList<Resource> listOfModels = _resourceSet.getResources();
    FormModel formModel = ((FormModel) null);
    for (final Resource model : listOfModels) {
      EList<EObject> _contents = model.getContents();
      EObject _get = _contents.get(0);
      if ((_get instanceof FormModel)) {
        EList<EObject> _contents_1 = model.getContents();
        EObject _get_1 = _contents_1.get(0);
        formModel = ((FormModel) _get_1);
      }
    }
    final File name = new File("output.html");
    String _string = name.toString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    CharSequence _generateHead = this.generateHead(formModel);
    _builder.append(_generateHead, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    CharSequence _generateForms = this.generateForms(formModel);
    _builder.append(_generateForms, "\t\t\t\t\t\t");
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</html>");
    fsa.generateFile(_string, _builder);
  }
  
  public CharSequence generateForms(final FormModel formModel) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Form> _forms = formModel.getForms();
      for(final Form form : _forms) {
        _builder.newLineIfNotEmpty();
        _builder.append("<div class=\"form\" id=\"");
        String _name = form.getName();
        _builder.append(_name, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<form action=\"#\" class=\"register\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<h1>");
        String _title = form.getTitle();
        _builder.append(_title, "\t\t");
        _builder.append("</h1>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("<h2>");
        String _description = form.getDescription();
        _builder.append(_description, "\t\t");
        _builder.append("</h2>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        CharSequence _generatePage = this.generatePage(form);
        _builder.append(_generatePage, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</form>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence generatePage(final Form form) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Page> _pages = form.getPages();
      for(final Page page : _pages) {
        _builder.newLineIfNotEmpty();
        _builder.append("<div class=\"page\" id=\"");
        String _title = page.getTitle();
        _builder.append(_title, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<fieldset class=\"row1\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<h3>");
        String _title_1 = page.getTitle();
        _builder.append(_title_1, "\t\t");
        _builder.append("</h3>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        CharSequence _generateElement = this.generateElement(page);
        _builder.append(_generateElement, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</fieldset>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateElement(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<PageElement> _pageElements = page.getPageElements();
      for(final PageElement element : _pageElements) {
        _builder.newLineIfNotEmpty();
        {
          if ((element instanceof AttributePageElement)) {
            CharSequence _generateAttributeElement = this.generateAttributeElement(((AttributePageElement) element));
            _builder.append(_generateAttributeElement, "");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((element instanceof RelationshipPageElement)) {
            CharSequence _generateRelationshipElement = this.generateRelationshipElement(((RelationshipPageElement) element));
            _builder.append(_generateRelationshipElement, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence generateAttributeElement(final AttributePageElement attrElement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((!(attrElement instanceof Column))) {
        _builder.newLineIfNotEmpty();
        _builder.append("<p>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<label for=\"");
        String _elementID = attrElement.getElementID();
        _builder.append(_elementID, "\t");
        _builder.append("\">");
        String _label = attrElement.getLabel();
        _builder.append(_label, "\t");
        {
          Attribute _attribute = attrElement.getAttribute();
          boolean _isMandatory = _attribute.isMandatory();
          if (_isMandatory) {
            _builder.append("<span>*</span>");
          }
        }
        _builder.append("</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _generateField = this.generateField(attrElement);
        _builder.append(_generateField, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateRelationshipElement(final RelationshipPageElement relElement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((relElement instanceof List)) {
        _builder.newLineIfNotEmpty();
        _builder.append("<div class=\"list\" id=\"");
        String _elementID = ((List)relElement).getElementID();
        _builder.append(_elementID, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<fieldset class=\"row1\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<legend class=\"legend\">");
        String _label = ((List)relElement).getLabel();
        _builder.append(_label, "\t\t");
        _builder.append(" List</legend>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("<ul></ul>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</fieldset>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    {
      if ((relElement instanceof Table)) {
        _builder.append("\t\t");
        _builder.append("<div class=\"table\" id=\"");
        String _elementID_1 = ((Table)relElement).getElementID();
        _builder.append(_elementID_1, "\t\t");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<fieldset class=\"row1\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("<legend class=\"legend\">");
        String _label_1 = ((Table)relElement).getLabel();
        _builder.append(_label_1, "\t\t\t\t");
        _builder.append(" Table</legend>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("<table>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t\t");
        _builder.append("<tr id=");
        String _elementID_2 = ((Table)relElement).getElementID();
        _builder.append(_elementID_2, "\t\t\t\t\t");
        _builder.append("_header>");
        _builder.newLineIfNotEmpty();
        {
          EList<Column> _columns = ((Table)relElement).getColumns();
          for(final Column column : _columns) {
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<th>");
            String _label_2 = column.getLabel();
            _builder.append(_label_2, "\t\t\t\t\t");
            _builder.append("</th>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t\t\t");
        _builder.append("</tr>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("</table>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("</fieldset>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence generateField(final AttributePageElement attrElement) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (attrElement instanceof TextField) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<input type=\"text\" id=\"");
        String _elementID = ((TextField)attrElement).getElementID();
        _builder.append(_elementID, "");
        _builder.append("\" ");
        {
          Attribute _attribute = ((TextField)attrElement).getAttribute();
          boolean _isMandatory = _attribute.isMandatory();
          if (_isMandatory) {
            _builder.append("class=\"mandatory\"");
          }
        }
        _builder.append("/>");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (attrElement instanceof DateSelectionField) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<input type=\"date\" id=\"");
        String _elementID = ((DateSelectionField)attrElement).getElementID();
        _builder.append(_elementID, "");
        _builder.append("\" ");
        {
          Attribute _attribute = ((DateSelectionField)attrElement).getAttribute();
          boolean _isMandatory = _attribute.isMandatory();
          if (_isMandatory) {
            _builder.append("class=\"mandatory\"");
          }
        }
        _builder.append("/>");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (attrElement instanceof TimeSelectionField) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<input type=\"time\" id=\"");
        String _elementID = ((TimeSelectionField)attrElement).getElementID();
        _builder.append(_elementID, "");
        _builder.append("\" ");
        {
          Attribute _attribute = ((TimeSelectionField)attrElement).getAttribute();
          boolean _isMandatory = _attribute.isMandatory();
          if (_isMandatory) {
            _builder.append("class=\"mandatory\"");
          }
        }
        _builder.append("/>");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (attrElement instanceof TextArea) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<textarea id=\"");
        String _elementID = ((TextArea)attrElement).getElementID();
        _builder.append(_elementID, "");
        _builder.append("\" ");
        {
          Attribute _attribute = ((TextArea)attrElement).getAttribute();
          boolean _isMandatory = _attribute.isMandatory();
          if (_isMandatory) {
            _builder.append("class=\"mandatory\"");
          }
        }
        _builder.append("></textarea>");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (attrElement instanceof SelectionField) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<select id=\"");
        String _elementID = ((SelectionField)attrElement).getElementID();
        _builder.append(_elementID, "");
        _builder.append("\" name=\"");
        Attribute _attribute = ((SelectionField)attrElement).getAttribute();
        String _name = _attribute.getName();
        _builder.append(_name, "");
        _builder.append("\" ");
        {
          Attribute _attribute_1 = ((SelectionField)attrElement).getAttribute();
          boolean _isMandatory = _attribute_1.isMandatory();
          if (_isMandatory) {
            _builder.append("class=\"mandatory\"");
          }
        }
        _builder.append(">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("<option value=\"default\"> </option>");
        _builder.newLine();
        {
          Attribute _attribute_2 = ((SelectionField)attrElement).getAttribute();
          AttributeType _type = _attribute_2.getType();
          boolean _equals = Objects.equal(_type, AttributeType.NONE);
          if (_equals) {
            {
              Attribute _attribute_3 = ((SelectionField)attrElement).getAttribute();
              Enumeration _enumeration = _attribute_3.getEnumeration();
              EList<Literal> _literals = _enumeration.getLiterals();
              for(final Literal literal : _literals) {
                _builder.append("\t\t\t\t\t");
                _builder.append("<option value=\"");
                String _name_1 = literal.getName();
                _builder.append(_name_1, "\t\t\t\t\t");
                _builder.append("\">");
                String _value = literal.getValue();
                _builder.append(_value, "\t\t\t\t\t");
                _builder.append("</option>");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            _builder.append("\t\t\t\t\t");
            _builder.append("<option value=\"true\">Yes</option>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("<option value=\"false\">No</option>");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t\t\t");
        _builder.append("</select>");
        _builder.newLine();
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public CharSequence generateHead(final FormModel formModel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<title>Form</title>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"../assets/form.css\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<script src=\"../assets/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<script src=\"../assets/form.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("$(document).ready(");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("function(){\t");
    _builder.newLine();
    {
      EList<Form> _forms = formModel.getForms();
      for(final Form form : _forms) {
        {
          boolean _isWelcomeForm = form.isWelcomeForm();
          if (_isWelcomeForm) {
            _builder.append("\t\t\t\t");
            _builder.append("form.addWelcomeForm(\'");
            String _title = form.getTitle();
            _builder.append(_title, "\t\t\t\t");
            _builder.append("\');");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Page> _pages = form.getPages();
          for(final Page page : _pages) {
            {
              Condition _condition = page.getCondition();
              boolean _notEquals = (!Objects.equal(_condition, null));
              if (_notEquals) {
                {
                  Condition _condition_1 = page.getCondition();
                  if ((_condition_1 instanceof CompositeCondition)) {
                    _builder.append("\t\t\t\t");
                    _builder.append("form.addCompositeCondition(\'");
                    Condition _condition_2 = page.getCondition();
                    String _conditionID = _condition_2.getConditionID();
                    _builder.append(_conditionID, "\t\t\t\t");
                    _builder.append("\', null, \'");
                    Condition _condition_3 = page.getCondition();
                    CompositeConditionType _compositionType = ((CompositeCondition) _condition_3).getCompositionType();
                    _builder.append(_compositionType, "\t\t\t\t");
                    _builder.append("\');");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                    Condition _condition_4 = page.getCondition();
                    EList<Condition> _composedConditions = ((CompositeCondition) _condition_4).getComposedConditions();
                    Condition _get = _composedConditions.get(0);
                    Condition _condition_5 = page.getCondition();
                    CharSequence _registerConditions = this.registerConditions(_get, ((CompositeCondition) _condition_5), page);
                    _builder.append(_registerConditions, "\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                    Condition _condition_6 = page.getCondition();
                    EList<Condition> _composedConditions_1 = ((CompositeCondition) _condition_6).getComposedConditions();
                    Condition _get_1 = _composedConditions_1.get(1);
                    Condition _condition_7 = page.getCondition();
                    CharSequence _registerConditions_1 = this.registerConditions(_get_1, ((CompositeCondition) _condition_7), page);
                    _builder.append(_registerConditions_1, "\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Condition _condition_8 = page.getCondition();
                  if ((_condition_8 instanceof AttributeValueCondition)) {
                    _builder.append("\t\t\t\t");
                    _builder.append("form.addAttributeValueCondition(\'");
                    Condition _condition_9 = page.getCondition();
                    String _conditionID_1 = _condition_9.getConditionID();
                    _builder.append(_conditionID_1, "\t\t\t\t");
                    _builder.append("\', ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                    _builder.append("null, \'");
                    String _title_1 = page.getTitle();
                    _builder.append(_title_1, "\t\t\t\t");
                    _builder.append("\', \'");
                    Condition _condition_10 = page.getCondition();
                    String _value = ((AttributeValueCondition) _condition_10).getValue();
                    _builder.append(_value, "\t\t\t\t");
                    _builder.append("\', ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t");
                    _builder.append("\'");
                    Condition _condition_11 = page.getCondition();
                    ConditionType _type = ((AttributeValueCondition) _condition_11).getType();
                    _builder.append(_type, "\t\t\t\t");
                    _builder.append("\');");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              EList<PageElement> _pageElements = page.getPageElements();
              for(final PageElement element : _pageElements) {
                {
                  if ((element instanceof TextField)) {
                    {
                      boolean _and = false;
                      String _format = ((TextField)element).getFormat();
                      boolean _notEquals_1 = (!Objects.equal(_format, null));
                      if (!_notEquals_1) {
                        _and = false;
                      } else {
                        String _format_1 = ((TextField)element).getFormat();
                        boolean _notEquals_2 = (!Objects.equal(_format_1, ""));
                        _and = _notEquals_2;
                      }
                      if (_and) {
                        _builder.append("\t\t\t\t");
                        _builder.append("form.addRegularExpression(\'");
                        String _elementID = ((TextField)element).getElementID();
                        _builder.append(_elementID, "\t\t\t\t");
                        _builder.append("\', \'");
                        String _format_2 = ((TextField)element).getFormat();
                        _builder.append(_format_2, "\t\t\t\t");
                        _builder.append("\');");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
                {
                  if ((element instanceof Table)) {
                    _builder.append("\t\t\t\t");
                    _builder.append("form.addRelationshipPageElement (\'");
                    String _title_2 = page.getTitle();
                    _builder.append(_title_2, "\t\t\t\t");
                    _builder.append("\', \'");
                    String _elementID_1 = ((Table)element).getElementID();
                    _builder.append(_elementID_1, "\t\t\t\t");
                    _builder.append("\', \'");
                    Form _editingForm = ((Table)element).getEditingForm();
                    String _title_3 = _editingForm.getTitle();
                    _builder.append(_title_3, "\t\t\t\t");
                    _builder.append("\',\'table\', \'");
                    Relationship _relationship = ((Table)element).getRelationship();
                    int _lowerBound = _relationship.getLowerBound();
                    _builder.append(_lowerBound, "\t\t\t\t");
                    _builder.append("\',\'");
                    Relationship _relationship_1 = ((Table)element).getRelationship();
                    int _upperBound = _relationship_1.getUpperBound();
                    _builder.append(_upperBound, "\t\t\t\t");
                    _builder.append("\');\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  if ((element instanceof List)) {
                    _builder.append("\t\t\t\t");
                    _builder.append("form.addRelationshipPageElement (\'");
                    String _title_4 = page.getTitle();
                    _builder.append(_title_4, "\t\t\t\t");
                    _builder.append("\',\'");
                    String _elementID_2 = ((List)element).getElementID();
                    _builder.append(_elementID_2, "\t\t\t\t");
                    _builder.append("\', \'");
                    Form _editingForm_1 = ((List)element).getEditingForm();
                    String _title_5 = _editingForm_1.getTitle();
                    _builder.append(_title_5, "\t\t\t\t");
                    _builder.append("\',\'list\', \'");
                    Relationship _relationship_2 = ((List)element).getRelationship();
                    int _lowerBound_1 = _relationship_2.getLowerBound();
                    _builder.append(_lowerBound_1, "\t\t\t\t");
                    _builder.append("\',\'");
                    Relationship _relationship_3 = ((List)element).getRelationship();
                    int _upperBound_1 = _relationship_3.getUpperBound();
                    _builder.append(_upperBound_1, "\t\t\t\t");
                    _builder.append("\');\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Condition _condition_12 = element.getCondition();
                  boolean _notEquals_3 = (!Objects.equal(_condition_12, null));
                  if (_notEquals_3) {
                    {
                      Condition _condition_13 = element.getCondition();
                      if ((_condition_13 instanceof CompositeCondition)) {
                        _builder.append("\t\t\t\t");
                        _builder.append("form.addCompositeCondition(\'");
                        Condition _condition_14 = element.getCondition();
                        String _conditionID_2 = _condition_14.getConditionID();
                        _builder.append(_conditionID_2, "\t\t\t\t");
                        _builder.append("\', null, \'");
                        Condition _condition_15 = element.getCondition();
                        CompositeConditionType _compositionType_1 = ((CompositeCondition) _condition_15).getCompositionType();
                        _builder.append(_compositionType_1, "\t\t\t\t");
                        _builder.append("\');");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t\t");
                        Condition _condition_16 = element.getCondition();
                        EList<Condition> _composedConditions_2 = ((CompositeCondition) _condition_16).getComposedConditions();
                        Condition _get_2 = _composedConditions_2.get(0);
                        Condition _condition_17 = element.getCondition();
                        CharSequence _registerConditions_2 = this.registerConditions(_get_2, ((CompositeCondition) _condition_17), element);
                        _builder.append(_registerConditions_2, "\t\t\t\t");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t\t");
                        Condition _condition_18 = element.getCondition();
                        EList<Condition> _composedConditions_3 = ((CompositeCondition) _condition_18).getComposedConditions();
                        Condition _get_3 = _composedConditions_3.get(1);
                        Condition _condition_19 = element.getCondition();
                        CharSequence _registerConditions_3 = this.registerConditions(_get_3, ((CompositeCondition) _condition_19), element);
                        _builder.append(_registerConditions_3, "\t\t\t\t");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    {
                      Condition _condition_20 = element.getCondition();
                      if ((_condition_20 instanceof AttributeValueCondition)) {
                        _builder.append("\t\t\t\t");
                        _builder.append("form.addAttributeValueCondition(\'");
                        Condition _condition_21 = element.getCondition();
                        String _conditionID_3 = _condition_21.getConditionID();
                        _builder.append(_conditionID_3, "\t\t\t\t");
                        _builder.append("\', ");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t\t");
                        _builder.append("null, \'");
                        String _elementID_3 = element.getElementID();
                        _builder.append(_elementID_3, "\t\t\t\t");
                        _builder.append("\', \'");
                        Condition _condition_22 = element.getCondition();
                        String _value_1 = ((AttributeValueCondition) _condition_22).getValue();
                        _builder.append(_value_1, "\t\t\t\t");
                        _builder.append("\', ");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t\t");
                        _builder.append("\'");
                        Condition _condition_23 = element.getCondition();
                        ConditionType _type_1 = ((AttributeValueCondition) _condition_23).getType();
                        _builder.append(_type_1, "\t\t\t\t");
                        _builder.append("\');");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("form.init();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</head>");
    return _builder;
  }
  
  public CharSequence registerConditions(final Condition cond, final CompositeCondition parentComposite, final Page containerPage) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((cond instanceof CompositeCondition)) {
        _builder.append("form.addCompositeCondition(\'");
        String _conditionID = ((CompositeCondition)cond).getConditionID();
        _builder.append(_conditionID, "");
        _builder.append("\', \'");
        String _conditionID_1 = parentComposite.getConditionID();
        _builder.append(_conditionID_1, "");
        _builder.append("\', \'");
        CompositeConditionType _compositionType = ((CompositeCondition) cond).getCompositionType();
        _builder.append(_compositionType, "");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        EList<Condition> _composedConditions = ((CompositeCondition)cond).getComposedConditions();
        Condition _get = _composedConditions.get(0);
        Object _registerConditions = this.registerConditions(_get, ((CompositeCondition)cond), containerPage);
        _builder.append(_registerConditions, "");
        _builder.newLineIfNotEmpty();
        EList<Condition> _composedConditions_1 = ((CompositeCondition)cond).getComposedConditions();
        Condition _get_1 = _composedConditions_1.get(1);
        Object _registerConditions_1 = this.registerConditions(_get_1, ((CompositeCondition)cond), containerPage);
        _builder.append(_registerConditions_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cond instanceof AttributeValueCondition)) {
        _builder.append("form.addAttributeValueCondition(\'");
        String _conditionID_2 = ((AttributeValueCondition)cond).getConditionID();
        _builder.append(_conditionID_2, "");
        _builder.append("\', ");
        _builder.newLineIfNotEmpty();
        String _conditionID_3 = parentComposite.getConditionID();
        _builder.append(_conditionID_3, "");
        _builder.append(", \'");
        String _title = containerPage.getTitle();
        _builder.append(_title, "");
        _builder.append("\', \'");
        String _value = ((AttributeValueCondition) cond).getValue();
        _builder.append(_value, "");
        _builder.append("\', ");
        _builder.newLineIfNotEmpty();
        _builder.append("\'");
        ConditionType _type = ((AttributeValueCondition) cond).getType();
        _builder.append(_type, "");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence registerConditions(final Condition cond, final CompositeCondition parentComposite, final PageElement containerPageElement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((cond instanceof CompositeCondition)) {
        _builder.append("form.addCompositeCondition(\'");
        String _conditionID = ((CompositeCondition)cond).getConditionID();
        _builder.append(_conditionID, "");
        _builder.append("\', \'");
        String _conditionID_1 = parentComposite.getConditionID();
        _builder.append(_conditionID_1, "");
        _builder.append("\', \'");
        CompositeConditionType _compositionType = ((CompositeCondition) cond).getCompositionType();
        _builder.append(_compositionType, "");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        EList<Condition> _composedConditions = ((CompositeCondition)cond).getComposedConditions();
        Condition _get = _composedConditions.get(0);
        Object _registerConditions = this.registerConditions(_get, ((CompositeCondition)cond), containerPageElement);
        _builder.append(_registerConditions, "");
        _builder.newLineIfNotEmpty();
        EList<Condition> _composedConditions_1 = ((CompositeCondition)cond).getComposedConditions();
        Condition _get_1 = _composedConditions_1.get(1);
        Object _registerConditions_1 = this.registerConditions(_get_1, ((CompositeCondition)cond), containerPageElement);
        _builder.append(_registerConditions_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cond instanceof AttributeValueCondition)) {
        _builder.append("form.addAttributeValueCondition(\'");
        String _conditionID_2 = ((AttributeValueCondition)cond).getConditionID();
        _builder.append(_conditionID_2, "");
        _builder.append("\', ");
        _builder.newLineIfNotEmpty();
        String _conditionID_3 = parentComposite.getConditionID();
        _builder.append(_conditionID_3, "");
        _builder.append(", \'");
        String _elementID = containerPageElement.getElementID();
        _builder.append(_elementID, "");
        _builder.append("\', \'");
        String _value = ((AttributeValueCondition) cond).getValue();
        _builder.append(_value, "");
        _builder.append("\', ");
        _builder.newLineIfNotEmpty();
        _builder.append("\'");
        ConditionType _type = ((AttributeValueCondition) cond).getType();
        _builder.append(_type, "");
        _builder.append("\');");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
}
