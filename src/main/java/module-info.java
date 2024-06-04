module jpms.spring {
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.core;

    opens org.example to spring.core, spring.beans, spring.context, spring.web;
}