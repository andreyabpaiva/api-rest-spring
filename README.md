### API REST using Spring 


> Class Diagram - scope

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
