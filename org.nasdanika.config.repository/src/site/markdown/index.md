# Nasdanika Configuration

Nasdanika configuration provides a model and an editor for creating hierarchical configurations. It is different from properties/JSON/YAML/XML configurations in the following aspects:

* Properties and services are supported:
  * Property - an object accessed by a String key.
  * Service -  an object accessed by a Class key, e.g. an interface.
* Value literals are interpolated using already defined and parent values. Interpolation means expansion of ``{{key[|default value]}}`` tokens.
* Values can be any objects, not just strings. Configuration items (properties and services) may define classpaths to use for object instantiation.
* Scripted values are supported.
* Validation of the model. 

The model was originally created to provide input for code generation models, but it can be used by any application willing to separate the configuration loading concern from the core
application logic.  

## Creating a model

* Install Configuration editor from ``http://www.nasdanika.org/products/config/repository``.
* File > New > Other > Nasdanika/Configuration Model.
* Select Configuration as the root model element.
* Add and configure properties, services, and configuration categories.
* Right-click on the model root or other model element and select "Validate" context menu item to validate the model.

## Creating configuration (context) from the model

Configuration model clients use [Context](apidocs/model/index.html?org/nasdanika/config/Context.html) interface to retrieve
configuration objects.

The code below shows how to load a model from a bundle resource:

```java
Bundle bundle = FrameworkUtil.getBundle(this.getClass());
URL testModelURL = bundle.getResource("test-models/test.nsdconf");
		
ResourceSet resourceSet = new ResourceSetImpl();
resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
resourceSet.getPackageRegistry().put(ConfigPackage.eNS_URI, ConfigPackage.eINSTANCE);
URI uri = URI.createURI(testModelURL.toString());
Resource resource = resourceSet.getResource(uri, true);
Configuration configuration = (Configuration) resource.getContents().get(0);
IProgressMonitor progressMonitor = new NullProgressMonitor();
SubMonitor subMonitor = SubMonitor.convert(progressMonitor, configuration.getConfigWorkSize());
Context context = configuration.createContext(new SimpleMutableContext(), subMonitor);
Object propertyValue = context.get("myStringProperty");
```

Full code is available in [ConfigurationModelTest.java](https://github.com/Nasdanika/config/blob/master/org.nasdanika.config.tests/src/org/nasdanika/config/tests/ConfigurationModelTest.java).

## Overview of model classes

This section provides a quick overview of the configuration model classes. 
See [Model API Documentation](apidocs/model) for more details.

### Configuration

* Base URL - URL which is used as a base when resolving class path elements, default includes and includes. The base URL itself is resolved relative to the model URL.
* Class Path - If not empty, a URLClassLoader is constructed which used parent context class loader as its parent. The class loader is available to client code through ``Context.getClassLoader()`` method and is also used as a parent for class loaders created by configuration items contained in the configuration. 
* Default Includes - includes which provide default properties and services. Default property/service is shadowed by the parent context property/service with the same name/type. 
* Description - Configuration description.
* Include - References to configurations defined elsewhere to be included into this configuration. Contexts created by included configurations are chained in the order 
* Includes - Locations of configuration models, properties files, JSON files, and YAML files to include into this configuration.

#### Configuration category

* Base URL - Same as above, but resolved relative to the containing element base URL. 
* Class Path - Same as above, class loader uses containing element class loader as its parent.
* Default Includes - Same as above.
* Description - Same as above.
* Include - Same as above.
* Includes - Same as above.
* Name - Category name, shall be unique among categories and properties within containing element.

#### Property

* Base URL - Same as above.
* Class Path - Same as above.
* Default - default properties are shadowed by parent properties with the same name and come into play only if parent context doesn't have property with the given name. Non-default properties shadow parent's properties.
* Default Includes - Same as above.
* Description - Same as above.
* Include - Same as above.
* Includes - Same as above.
* Name - Same as above.
* Scripted - True indicates that values are actually scripts to be executed to compute actual property value. See JavaDoc for more details. 
* Values - Property values. See [ValueConfigurationItem](apidocs/model/index.html?org/nasdanika/config/ValueConfigurationItem.html) documentation for more details. 
* Value Type - fully qualified class name of the value. If blank, defaults to ``java.lang.String``. If value type implements [Provider](apidocs/model/index.html?org/nasdanika/config/Provider.html), then ``Provider.get(Context,SubMonitor)`` method is invoked to retrieve actual value. 

#### Service

* Base URL - Same as above.
* Class Path - Same as above.
* Default - Same as above.
* Default Includes - Same as above.
* Description - Same as above.
* Include - Same as above.
* Includes - Same as above.
* Scripted - Same as above.
* Service Type - fully qualified name of the class/interface which this service shall be registered (keyed) with. In case of multiple values the service will be registered with the  array type with component type of the service type, e.g. ``java.util.List[]`` if service type is ``java.util.List``.  
* Values - Same as above.
* Value Type - Same as above.

## API Documentation

* [Model](apidocs/model)
* [Edit](apidocs/edit)
* [Editor](apidocs/editor)

## P2 Repository

 * ``http://www.nasdanika.org/products/config/repository``
 * [Archived](http://www.nasdanika.org/products/config/org.nasdanika.config.repository-0.1.0-SNAPSHOT.zip)
 
## How to contribute

As an open source project we use the [Fork and Pull Model](https://help.github.com/articles/about-collaborative-development-models/).
You can find more information about collaborative development at GitHub in this article - [Collaborating with issues and pull requests](https://help.github.com/categories/collaborating-with-issues-and-pull-requests).

When you contribute code, please make sure that the changes are clearly identifiable. In particular, avoid making non-functional changes in the code which you do not touch, 
e.g. auto-formatting of an entire compilation unit. 
