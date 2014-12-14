package at.ac.tuwien.big.forms.htmlgen;

import at.ac.tuwien.big.forms.FormModel;
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
    _builder.append("\t\t\t\t\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</html>");
    fsa.generateFile(_string, _builder);
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
    _builder.append("function(){\t\t\t\t ");
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
}
