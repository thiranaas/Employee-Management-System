# Employee Management System

A simple Java console program demonstrating inheritance and method overriding using an `Employee` base class and three subclasses: `Manager`, `Developer`, and `Intern`.

## Features
- Common fields (`id`, `name`, `salary`) handled by the `Employee` base class.
- Subclasses add their own field:
  - `Manager` → `department`
  - `Developer` → `language`
  - `Intern` → `duration`
- Each subclass overrides `display()` to print its specific details.
- User selects the employee category at runtime via console input.

## Example

```
Enter the Employee name:
John
Enter the Employee id:
101
Enter the Employee salary:
50000
Enter the Employee category (1-Manager, 2-Developer, 3-Intern):
2
Enter the Programming Language:
Java

Developer Details:
ID:101
Name:John
Salary:50000
Language:Java
```

## Concepts Demonstrated
- Inheritance (`extends`)
- Constructor chaining (`super()`)
- Method overriding (`display()`)
- Basic console I/O with `Scanner`

## Notes
- Invalid category input (anything other than 1, 2, or 3) prints an "Invalid Employee category" message.
- The class is named `main`; the file should be saved as `main.java` to compile correctly.

If you find this basic project useful, please star the repo.
