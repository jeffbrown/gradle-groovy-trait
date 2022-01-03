package gradledeps.lib

import org.apache.log4j.Appender

trait HelperFromLibrary {
    private Appender appender

    String getString() {
        appender.toString()
    }
}