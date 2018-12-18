StairStride

To use the API, send a request to the url in the following manner:
http://stairstride-env.r7ptt4khbc.eu-west-1.elasticbeanstalk.com /stair_count?flights=17,17&stride=2

Query Params:
- flights: comma seprated array of stair counts for each flight of stairs
- stride: the max number of steps that can be taken in a single stride

Returns a Json object in the format:
- totalStrides: minimum number of strides to go up the stairwell

Layout of project:
- src: divided into two packages:
    - request: Spring Boot Application exposing a REST api
    - logic: Simple function for business logic

Unit tests for logic are written in TestNG at `src/test/java/logic/StairCounterTest.java`
