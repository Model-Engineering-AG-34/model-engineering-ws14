package at.ac.tuwien.big.forms.alloygen;

import at.ac.tuwien.big.forms.EntityModel;
import java.io.File;
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
    fsa.generateFile(name, _builder);
  }
}
