# Spring Notes

## Annotations
The following annotations are for the AppConfig spring file to go through and find beans.
##### @Repository("BEAN_NAME")
	Beans do not need to be named but doing in explicitly can be useful for tracing
##### @Service("BEAN_NAME")

##### @Autowired
	Autowired means that when the class you have "Auto wired" is called spring will auto "wire" together if required.
	Using this on a setXYZ is Setter injection.
##### @ComponentScan({"YOUR_PACKAGE_NAME_HERE"})
	This componet scan will find all the beans in the package that you have specified.
	Will find the above annotaions as well as @Component
##### Singletons / Prototypes
    As default all beans will be made as a singleton unless annottated as prototype.
    @Scope(XYZ.SCOPE_PROTOTYPE) or @Scope("prototype")
    Prototype will give you a new instance every time
## Java config

##### @PropertySource("application.properties")
    @Bean
        public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
            return new PropertySourcesPlaceholderConfigurer();
        }
    Not 100% sure what this does but it is nessessary in the AppConfig File.