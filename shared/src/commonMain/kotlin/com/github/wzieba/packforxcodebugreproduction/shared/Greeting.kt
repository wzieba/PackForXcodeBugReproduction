package com.github.wzieba.packforxcodebugreproduction.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
