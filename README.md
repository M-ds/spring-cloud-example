# Spring Cloud

Within this project some basic concepts are explained regarding Spring Cloud and microservices.

## Examples

| Url      |      Possible value   |      Response   |
|----------|:---------------------:|------------------|
|http://localhost:9191/course/find/{uuid} | d99072ed-a6e4-4a43-a730-2077393abdfc, 2d2f0685-7e51-4a35-93a6-2f345623497d, 81ae5ba6-7323-4381-b5e9-95579c1a514f, 7f32aa0c-4753-4be0-b73e-6a558de66220, 4353bf05-b2d3-45e6-9453-79489ab8edde | Returns Employee object |
|http://localhost:9191/course/find/all-student-courses?ids= | need to be sent via Query Parameters. Ids are similar to the ids above  | Array of Employees |
|http://localhost:9191/course/save |  Course object | Returns boolean value. True when successful, false when unsuccessful |
|http://localhost:9191/student/find/{id} |  1, 2, 3 | Returns Student with course object |

### Course Object to save:

```JSON
{
  "name": "example",
  "schoolType": "HIGHSCHOOL"
}
```

schooltype options:

- HIGHSCHOOL
- UNIVERSITY
