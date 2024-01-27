## 1. Calling function with arguments

- Call by value
    
    - The argument expression is evaluated once, and the resulting value is passed to the function.
    - This evaluation happens before the function call.

- Call by name(Lazy evaluation)

    - The expression is passed directly to the function, and it's evaluated every time it's used within the function.

- Code Sample

    ```Scala

    def callByValue(x: Long): Unit = {
        println(s"Value ${x}")
        println(s"Value ${x}")
    }

    def callByName(x: => Long): Unit = {
        println(s"Value ${x}") // evaluate
        println(s"Value ${x}") // evaluate again
    }

    ```