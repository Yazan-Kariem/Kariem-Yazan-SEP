module com.example.sakancom {
    requires java.sql;
    requires junit;
    requires io.cucumber.junit;
    requires io.cucumber.java;
    requires java.desktop;
    opens Sakancom.loginFeature;
    exports Sakancom.loginFeature;
}