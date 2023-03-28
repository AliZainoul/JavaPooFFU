# Assume that you have this architecture file tree:
Tree of your directory structure:
  ```├── README.md
  ├── main.java
  └── src
      ├── Circle.java
      ├── Rectangle.java
      ├── Shape.java
      └── Triangle.java
  ```


# Compile the program with this command:
  - Open a command prompt and type in:
  ```
  javac -d bin src/*.java main.java && java -cp bin main
  ```

# After compilation, the architecture tree will be the following:
```
.
├── README.md
├── bin
│   ├── Circle.class
│   ├── Rectangle.class
│   ├── Shape.class
│   ├── Triangle.class
│   └── main.class
├── main.java
└── src
    ├── Circle.java
    ├── Rectangle.java
    ├── Shape.java
    └── Triangle.java
```

- Remark that all class files are within the bin directory,
  it is a good usage to do so.
