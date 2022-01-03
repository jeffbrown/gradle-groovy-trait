package gradledeps.host

import gradledeps.lib.HelperFromLibrary

class Host implements HelperFromLibrary
{
    void run()
    {
        println getString()
    }
}