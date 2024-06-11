### Understanding Compilation and Execution in Java Project Directorie

To understand why you were able to compile within the src directory and not in bin, it's important to review the structure of your project and the purpose of each directory.

#### Directory Structure in Java Projects
- src: Typically contains the source files (.java).
- bin: Typically contains the compiled files (.class).

#### Compiling and Running Java Files
1. Compiling in the src Directory:
When you compile the code in the src directory, you are in the location where the source file (.java) is located. This makes compilation easier because you can reference the file directly.

´
cd src
javac --enable-preview --release 16 TerminalTest.java
`
The above command compiles TerminalTest.java in the src directory, generating the TerminalTest.class file in the same directory.

2. Compiling in the bin Directory:
Compiling from the bin directory requires you to reference the full path of the source file, which is in the src directory. You also need to specify where the compiled files should be placed.

`
cd bin
javac --enable-preview --release 16 -d . ../src/TerminalTest.java
`
The -d . command specifies that the compiled files should be placed in the current directory (bin). ../src/TerminalTest.java is the relative path to the source file.

#### Running the Compiled File

1.Running from the src Directory:
If the compiled file (TerminalTest.class) is in the src directory, you can run it from there:
`
cd src
java --enable-preview TerminalTest
`

2. Running from the bin Directory:
If the compiled file is in the bin directory, you should be in that directory to run it:
`
cd bin
java --enable-preview TerminalTest
`