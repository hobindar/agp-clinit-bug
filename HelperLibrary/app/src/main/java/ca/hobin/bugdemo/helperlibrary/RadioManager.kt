package ca.hobin.bugdemo.helperlibrary

import android.util.Log

class RadioManager {
    fun getRadioVersion(): String? {
        if (!supportsBuildClass()) {
            Log.e("AgbBugDemo", "Cannot get radio version")
            return null
        }

        val deviceManagerClass = Class.forName("android.os.Build")
        val getRadioVersionMethod = deviceManagerClass.getMethod("getRadioVersion")
        return getRadioVersionMethod.invoke(null) as String
    }

    private fun supportsBuildClass(): Boolean {
        try {
            Class.forName("android.os.Build")
        } catch (e: ClassNotFoundException) {
            Log.e("AgpBugDemo", "Build class is not available")
            return false
        }
        return true
    }
}
