### RESTful API using Spring 

``` mermaid
classDiagram
    class User {
        -Long id
        -String name
        -Long account
        -Agency agency
    }
    
    class Agency {
        -Long id
        -String name
    }

    User --> Agency
```
#### ✨ Done so far
- Set controllers to User and Agency
- Added Integration w Postgresql
- Modified Constructors and Getters/Setters to lombok sintax
- Exception Handling
