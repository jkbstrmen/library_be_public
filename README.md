# Library backend

## Week 1:

### Prerequisites
* Knowledge of Git and GitHub
* Installed software
  * Java 17
  * Maven

### Objective
* Implement minimal Spring REST application
* Spring:
  * Describe Spring Framework
  * Describe Maven
  * Describe REST Api
  * Implement Customer Controller CRUD methods
  * update .gitignore
* Tools:
  * Introduce Postman. Demo Postman - Spring interaction

### Notes
* Put emphasis on code organization into packages.
* Put emphasis on naming convention

**Customer example:**

```java 
package sk.umb.example.library.customer.controller;

public class CustomerController {
}
```

### Homework
####  Using Customer controller as an example, implement controllers for following functionalities:

**Category**

```java 
package sk.umb.example.library.category.controller;

public class CategoryController {
}
```

**Book**

```java 
package sk.umb.example.library.book.controller;

public class BookController {
}
```

**Borrowing**

```java 
package sk.umb.example.library.borrowing.controller;

public class BorrowingController {
}
```

#### For each functionality implement methods

* List resource   / GET
* Retrieve detail / GET
* Create resource / POST 
* Update resource / PUT
* Delete resource / DELETE