# Spring Boot Security OAuth Example

#### Securing REST API with Spring Security OAuth2

To run this repo, please follow these command :

1. Paste this command to your terminal

    `mvn clean spring-boot:run`

2. Launch POSTMAN to generate TOKEN

    ![Authorization Tab](img/oauth.png "Authorization Tab")

    ![Header Tab](img/header.png "Header Tab")

    ![Body Tab](img/body.png "Body Tab")


3. Accessing Token

    ![Accessing Resource with Token](img/getOauth.png "Accessing Resource with Token")

4. Accessing endpoint without Token

    ![Accessing without Token](img/noOauth.png "Accessing without Token")