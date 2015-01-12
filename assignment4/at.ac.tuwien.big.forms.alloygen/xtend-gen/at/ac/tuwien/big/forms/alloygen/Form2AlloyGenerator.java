package at.ac.tuwien.big.forms.alloygen;

import at.ac.tuwien.big.forms.Attribute;
import at.ac.tuwien.big.forms.AttributeType;
import at.ac.tuwien.big.forms.Entity;
import at.ac.tuwien.big.forms.EntityModel;
import at.ac.tuwien.big.forms.EntityModelElement;
import at.ac.tuwien.big.forms.Enumeration;
import at.ac.tuwien.big.forms.Feature;
import at.ac.tuwien.big.forms.Literal;
import at.ac.tuwien.big.forms.Relationship;
import com.google.common.base.Objects;
import java.io.File;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class Form2AlloyGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    EntityModel entityModel = ((EntityModel) _get);
    URI _uRI = resource.getURI();
    String _fileString = _uRI.toFileString();
    File _file = new File(_fileString);
    String _name = _file.getName();
    String name = _name.replace(".forms", ".als");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module ME14");
    _builder.newLine();
    {
      EList<EntityModelElement> _entityModelElements = entityModel.getEntityModelElements();
      for(final EntityModelElement element : _entityModelElements) {
        CharSequence _generateEntityModelElement = this.generateEntityModelElement(element);
        _builder.append(_generateEntityModelElement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("fact {");
    _builder.newLine();
    {
      EList<EntityModelElement> _entityModelElements_1 = entityModel.getEntityModelElements();
      for(final EntityModelElement element_1 : _entityModelElements_1) {
        {
          if ((element_1 instanceof Entity)) {
            {
              EList<Feature> _features = ((Entity)element_1).getFeatures();
              for(final Feature feature : _features) {
                {
                  if ((feature instanceof Relationship)) {
                    CharSequence _generateRelationshipConstraints = this.generateRelationshipConstraints(((Relationship)feature), ((Entity)element_1));
                    _builder.append(_generateRelationshipConstraints, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(name, _builder);
  }
  
  public CharSequence generateRelationshipConstraints(final Relationship rel, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _lowerBound = rel.getLowerBound();
      boolean _notEquals = (_lowerBound != 1);
      if (_notEquals) {
        _builder.append("all v: ");
        String _name = entity.getName();
        _builder.append(_name, "");
        _builder.append(" | #v.");
        String _name_1 = rel.getName();
        _builder.append(_name_1, "");
        _builder.append(" >= ");
        int _lowerBound_1 = rel.getLowerBound();
        _builder.append(_lowerBound_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _upperBound = rel.getUpperBound();
      boolean _notEquals_1 = (_upperBound != (-1));
      if (_notEquals_1) {
        {
          int _lowerBound_2 = rel.getLowerBound();
          boolean _notEquals_2 = (_lowerBound_2 != 1);
          if (_notEquals_2) {
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("all v: ");
        String _name_2 = entity.getName();
        _builder.append(_name_2, "");
        _builder.append(" | #v.");
        String _name_3 = rel.getName();
        _builder.append(_name_3, "");
        _builder.append(" =< ");
        int _upperBound_1 = rel.getUpperBound();
        _builder.append(_upperBound_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Relationship _opposite = rel.getOpposite();
      boolean _notEquals_3 = (!Objects.equal(_opposite, null));
      if (_notEquals_3) {
        _builder.append("all e1: ");
        String _name_4 = entity.getName();
        _builder.append(_name_4, "");
        _builder.append(", e2: ");
        Entity _target = rel.getTarget();
        String _name_5 = _target.getName();
        _builder.append(_name_5, "");
        _builder.append(" | (e1.");
        String _name_6 = rel.getName();
        _builder.append(_name_6, "");
        _builder.append(" in e2 implies e2.");
        Relationship _opposite_1 = rel.getOpposite();
        String _name_7 = _opposite_1.getName();
        _builder.append(_name_7, "");
        _builder.append(" in e1) and (e2.");
        Relationship _opposite_2 = rel.getOpposite();
        String _name_8 = _opposite_2.getName();
        _builder.append(_name_8, "");
        _builder.append(" in e1 implies e1.");
        String _name_9 = rel.getName();
        _builder.append(_name_9, "");
        _builder.append(" in e2)");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateEntityModelElement(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sig ");
    String _name = entity.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = entity.getFeatures();
      boolean _hasElements = false;
      for(final Feature feature : _features) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\t", "");
        } else {
          _builder.appendImmediate(",\n", "");
        }
        CharSequence _generateFeature = this.generateFeature(feature);
        _builder.append(_generateFeature, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _generateEntityModelElement(final Enumeration enumeration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("enum ");
    String _name = enumeration.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Literal> _literals = enumeration.getLiterals();
      boolean _hasElements = false;
      for(final Literal literal : _literals) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\t", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_1 = literal.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _generateFeature(final Attribute attr) {
    CharSequence _xifexpression = null;
    AttributeType _type = attr.getType();
    boolean _equals = Objects.equal(_type, AttributeType.NONE);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      String _name = attr.getName();
      _builder.append(_name, "\t\t");
      _builder.append(": ");
      boolean _isMandatory = attr.isMandatory();
      String _multiplicity = this.getMultiplicity(_isMandatory);
      _builder.append(_multiplicity, "\t\t");
      _builder.append(" ");
      Enumeration _enumeration = attr.getEnumeration();
      String _name_1 = _enumeration.getName();
      _builder.append(_name_1, "\t\t");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t\t");
      String _name_2 = attr.getName();
      _builder_1.append(_name_2, "\t\t");
      _builder_1.append(": ");
      boolean _isMandatory_1 = attr.isMandatory();
      String _multiplicity_1 = this.getMultiplicity(_isMandatory_1);
      _builder_1.append(_multiplicity_1, "\t\t");
      _builder_1.append(" Int");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public String getMultiplicity(final boolean mandatory) {
    if (mandatory) {
      return "one";
    } else {
      return "lone";
    }
  }
  
  protected CharSequence _generateFeature(final Relationship rel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    String _name = rel.getName();
    _builder.append(_name, "\t\t");
    _builder.append(": ");
    String _multiplicity = this.getMultiplicity(rel);
    _builder.append(_multiplicity, "\t\t");
    _builder.append(" ");
    Entity _target = rel.getTarget();
    String _name_1 = _target.getName();
    _builder.append(_name_1, "\t\t");
    return _builder;
  }
  
  public String getMultiplicity(final Relationship rel) {
    String _xifexpression = null;
    int _lowerBound = rel.getLowerBound();
    boolean _equals = (_lowerBound == 0);
    if (_equals) {
      String _xifexpression_1 = null;
      int _upperBound = rel.getUpperBound();
      boolean _equals_1 = (_upperBound == 1);
      if (_equals_1) {
        _xifexpression_1 = "lone";
      } else {
        String _xifexpression_2 = null;
        int _upperBound_1 = rel.getUpperBound();
        boolean _equals_2 = (_upperBound_1 == (-1));
        if (_equals_2) {
          _xifexpression_2 = "set";
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    } else {
      String _xifexpression_3 = null;
      int _lowerBound_1 = rel.getLowerBound();
      boolean _equals_3 = (_lowerBound_1 == 1);
      if (_equals_3) {
        String _xifexpression_4 = null;
        int _upperBound_2 = rel.getUpperBound();
        boolean _equals_4 = (_upperBound_2 == 1);
        if (_equals_4) {
          _xifexpression_4 = "one";
        } else {
          String _xifexpression_5 = null;
          int _upperBound_3 = rel.getUpperBound();
          boolean _equals_5 = (_upperBound_3 == (-1));
          if (_equals_5) {
            _xifexpression_5 = "some";
          }
          _xifexpression_4 = _xifexpression_5;
        }
        _xifexpression_3 = _xifexpression_4;
      } else {
        _xifexpression_3 = "set";
      }
      _xifexpression = _xifexpression_3;
    }
    return _xifexpression;
  }
  
  public CharSequence generateEntityModelElement(final EObject entity) {
    if (entity instanceof Entity) {
      return _generateEntityModelElement((Entity)entity);
    } else if (entity instanceof Enumeration) {
      return _generateEntityModelElement((Enumeration)entity);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(entity).toString());
    }
  }
  
  public CharSequence generateFeature(final Feature attr) {
    if (attr instanceof Attribute) {
      return _generateFeature((Attribute)attr);
    } else if (attr instanceof Relationship) {
      return _generateFeature((Relationship)attr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attr).toString());
    }
  }
}
