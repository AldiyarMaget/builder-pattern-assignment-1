[README.md](https://github.com/user-attachments/files/22309152/README.md)
# Minecraft Builder — Course Assignment

**The author:** Khassenov Aldiyar (SE-2413)  
**Repository contents:** Sources and report (`REPORT.pdf').

## Project structure
``
/ (root)
├─ src/
│  ├─ Main.java # entry point, usage demonstration
│  ├─ Minecraft.java# main product class with fields (private final) and nested static Builder
│  └─ World.java# auxiliary class that uses the builder to create objects
,─ REPORT.pdf # task report
└─ README.md
```

> Note: each `public class` must be in its own file with the appropriate name (for example, `Minecraft` in `Minecraft.java `).

## Brief description of the implementation
- `Minecraft' is a product class, the fields are made `private final'.  
- Inside `Minecraft` there is a nested `public static class MinecraftBuilder` that implements the Builder pattern (fluent API). The builder methods set the values and at the end of `build()` creates an instance of `Minecraft`.  
- `World` contains examples of pre-configured assemblies (`createWorld()', `joinServer()`).
- `Main` demonstrates the use of the builder and methods of `World`.

Details and explanations can be found in `REPORT.pdf` (at the root of the repository).

## Requirements
- JDK 8 or higher.

## Build and launch (from the root of the project)
1. Go to the project folder (where the `src/` folder is located).
2. Run in the terminal:
``bash
# compilation of all sources in the src/ folder to the out directory
javac -d out src/*.java

# launch
java -cp out Main
```

## Expected minimum output
Depending on the contents of `Main` and `World`, at least the following may appear:
``
World created
```
(In `World.createWorld()`/`joinServer()`, the code has the output `System.out.println(...)` — this will be displayed in the console.)

## What is included in the REPORT.pdf
The 'REPORT.pdf` file at the root contains brief information about the repository files and what is implemented (using Builder, listing the fields of the `Minecraft' class, usage examples). Open the `REPORT.pdf' for details.
