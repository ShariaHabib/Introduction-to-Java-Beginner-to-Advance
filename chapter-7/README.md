# A Closer Look at Methods & Classes

- It is possible to define two or more methods within the same class that share the same name, as long as their parameter declarations are different. This is called method overloading. Overloaded methods must differ in type/number of parameter.

- Objects can be passed as parameter.

- Call by value means that the function receives a copy of the argument's value, and any modifications made to the parameter inside the function do not affect the original argument outside the function. This is used for passing primitive types, such as integers or booleans, or immutable objects like strings.

- Call by reference means that the function receives a reference to the original argument, and any modifications made to the parameter inside the function will also modify the original argument outside the function. This is used for passing mutable objects, such as arrays or objects.

- In call by value, the function can only access the value of the argument, while in call by reference, the function can access and modify the original object itself.

- "static" is used to define a class-level variable or method, which means that it belongs to the class itself rather than to any specific instance of the class. This means that the static variable or method can be accessed using the class name, rather than through an object instance of the class.

- Varargs (variable-length arguments) is a feature that allows a method to accept an arbitrary number of arguments of the same type. This can be useful when the exact number of arguments needed by a method is unknown at compile time or when it varies depending on the situation. Varargs are declared using the ellipsis (...) notation after the type of the argument in the method signature. Within the method, the varargs parameter is treated as an array of the specified type.
