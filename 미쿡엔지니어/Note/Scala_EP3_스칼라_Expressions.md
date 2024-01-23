## 1. Expressions

- Basic Arithmetic Expression
- Conditional Expression
- Negation
- Block Expression
- Function as an Expression
- Case Classes and Pattern Matching
- Collection Operations

## 2. Expressions vs Instructions (Statements)

- Expressions: a block code that evaluates to a value and has a type.

    - Returns a Value: Every expression yields a value when evaluated.

    - Has a Type: Every expression in Scala has a type, which might be as specific as Int or String, or more generic like Any.

    - Immutability and Functional Style: Expressions align with Scala's functional programming style, where computations are performed without side effects.

        - `1 + 2` is an expression that evaluates to 3.

        - `if (a > b) a else b` is a conditional expression that evaluates to either a or b.

        - `{ val x = 10; x + 20}` is a block expression that evaluatees to 30. 

- Instructions (Statements): In many imperative programming languages, an instruction, or a statement, is a piece of code that performs an action. Instructions might change the state of program, but they do not return a value and do not have a type

    - Does Not Return a Value: Instructions typically perform an action but do not return a value. In scala, such instructions would be considered to return Unit, which is similar to void in languages like C or Java.
    - Mutability and Imperative Style: Instructions align more wit imperative programming, where the state of the program is changed sequentially through commands.
        - println("Hello, Scala") is a statement that prints to the console and returns Unit

## 3. Scala's Approach

- Unified Concept: Scala blurs the traditional distinction betwewen expressions and instructions. `In Scala, almost everything is an expression`, even actions that would traditionally be considered instructions. For instance, a while loop in Scala is an expression that returns Unit.

- Functional Paradigm Emphasis: Scala encourages a functional programming style, `emphasizing expressions over instructions.` This is evident in its treatment of constructs like loops and conditionals as expressions that return values.

- Side Effects: In Scala, operations that cause side effects (like printing to the console or modifying a variable) are typically discouraged in favor of a more functional style. However, they are still possible and are used when necessary.