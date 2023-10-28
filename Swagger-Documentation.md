# OpenAPI Definition

## Info

- **Title:** OpenAPI definition
- **Version:** v0

## Servers

- **Generated server URL:** [http://localhost:8080](http://localhost:8080)

## Security

- **Bearer Authentication**

## Paths

### /api/products/update (PUT)

- **Tags:** product-controller
- **Operation ID:** updateProduct
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "name": "string",
        "internalName": "string",
        "userId": 0,
        "details": "string",
        "maxProductsPerLocation": 0
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Content: */*
      - Schema:
        ```json
        {
          "name": "string",
          "internalName": "string",
          "userId": 0,
          "details": "string",
          "maxProductsPerLocation": 0
        }
        ```





# OpenAPI Definition

## Paths

### /api/parameters

#### GET

- **Tags:** parameter-controller
- **Operation ID:** getAllParameters
- **Responses:**
  - 200 OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "array",
          "items": [
            {
              "name": "string",
              "internalName": "string",
              "details": "string",
              "parameterType": "QUANTITY",
              "value": "string"
            }
          ]
        }
        ```

#### PUT

- **Tags:** parameter-controller
- **Operation ID:** updateParameter
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "name": "string",
        "internalName": "string",
        "details": "string",
        "parameterType": "QUANTITY",
        "value": "string"
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Content: */*
      - Schema:
        ```json
        {
          "name": "string",
          "internalName": "string",
          "details": "string",
          "parameterType": "QUANTITY",
          "value": "string"
        }
        ```


# OpenAPI Definition

## Paths

### /api/features/update

#### PUT

- **Tags:** feature-controller
- **Operation ID:** updateFeature
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "name": "string",
        "internalName": "string",
        "details": "string"
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Content: */*
      - Schema:
        ```json
        {
          "name": "string",
          "internalName": "string",
          "details": "string"
        }
        ```


# OpenAPI Definition

## Paths

### /api/register

#### POST

- **Tags:** product-controller
- **Operation ID:** registerUser
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "id": 0,
        "name": "string",
        "password": "string",
        "role": "string",
        "product": [
          {
            "id": 0,
            "name": "string",
            "internalName": "string",
            "details": "string",
            "userId": 0,
            "maxProductsPerLocation": 0,
            "features": [
              {
                "id": 0,
                "name": "string",
                "internalName": "string",
                "details": "string",
                "product": "string",
                "parameters": [
                  {
                    "id": 0,
                    "name": "string",
                    "internalName": "string",
                    "details": "string",
                    "parameterType": "QUANTITY",
                    "value": "string",
                    "feature": "string"
                  }
                ]
              }
            ]
          }
        ]
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "string"
        }
        ```



# OpenAPI Definition

## Paths

### /api/products/delete

#### POST

- **Tags:** product-controller
- **Operation ID:** deleteProduct
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Description: OK




# OpenAPI Definition

## Paths

### /api/products/add

#### POST

- **Tags:** product-controller
- **Operation ID:** addProduct
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "name": "string",
        "internalName": "string",
        "userId": 0,
        "details": "string",
        "maxProductsPerLocation": 0
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Description: OK




# OpenAPI Definition

## Paths

### /api/parameters/{featureInternalName}

#### POST

- **Tags:** parameter-controller
- **Operation ID:** addParameterToFeature
- **Parameters:**
  - name: featureInternalName
    - in: path
    - required: true
    - schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "name": "string",
        "internalName": "string",
        "details": "string",
        "parameterType": "QUANTITY",
        "value": "string"
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Description: OK




# OpenAPI Definition

## Paths

### /api/parameters/delete

#### POST

- **Tags:** parameter-controller
- **Operation ID:** deleteParameter
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Description: OK





# OpenAPI Definition

## Paths

### /api/features/{productInternalName}

#### POST

- **Tags:** feature-controller
- **Operation ID:** addFeatureToProduct
- **Parameters:**
  - Name: productInternalName
    - In: path
    - Required: true
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "name": "string",
        "internalName": "string",
        "details": "string"
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Description: OK




# OpenAPI Definition

## Paths

### /api/auth/token

#### POST

- **Tags:** api-auth-controller
- **Operation ID:** token
- **Request Body:**
  - Content: application/json
    - Schema:
      ```json
      {
        "username": "user",
        "password": "user"
      }
      ```
  - Required: true
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "token": "string"
        }
        ```

This Markdown representation outlines the specified path, request body, and responses. If you have more requests or questions, feel free to let me know!





# OpenAPI Definition

## Paths

### /api/products

#### GET

- **Tags:** product-controller
- **Operation ID:** getAllProducts
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "array",
          "items": [
            {
              "name": "string",
              "internalName": "string",
              "userId": 0,
              "details": "string",
              "maxProductsPerLocation": 0
            }
          ]
        }
        ```

Feel free to ask if you have any more paths to convert or any other questions!





# OpenAPI Definition

## Paths

### /api/products/{internalName}

#### GET

- **Tags:** product-controller
- **Operation ID:** getProductByInternalName
- **Parameters:**
  - Name: internalName
    - In: path
    - Required: true
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "name": "string",
          "internalName": "string",
          "userId": 0,
          "details": "string",
          "maxProductsPerLocation": 0
        }
        ```

Feel free to ask if you have more paths or any other questions!



### /api/products/{internalName}/features

#### GET

- **Tags:** product-controller
- **Operation ID:** getFeaturesByProductInternalName
- **Parameters:**
  - Name: internalName
    - In: path
    - Required: true
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "array",
          "items": [
            {
              "name": "string",
              "internalName": "string",
              "details": "string"
            }
          ]
        }
        ```

If you have more paths or need further adjustments, just let me know!





### /api/parameters/{parameterId}

#### GET

- **Tags:** parameter-controller
- **Operation ID:** getParameterByInternalName
- **Parameters:** None
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "name": "string",
          "internalName": "string",
          "details": "string",
          "parameterType": "QUANTITY",
          "value": "string"
        }
        ```

Feel free to ask if you have more paths or need further modifications!






### /api/parameters/feature/{featureInternalName}

#### GET

- **Tags:** parameter-controller
- **Operation ID:** getParametersByFeatureInternalName
- **Parameters:**
  - Name: featureInternalName
    - In: path
    - Required: true
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "array",
          "items": [
            {
              "name": "string",
              "internalName": "string",
              "details": "string",
              "parameterType": "QUANTITY",
              "value": "string"
            }
          ]
        }
        ```

Let me know if there's anything else you'd like!




### /api/features

#### GET

- **Tags:** feature-controller
- **Operation ID:** getAllFeatures
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "array",
          "items": [
            {
              "name": "string",
              "internalName": "string",
              "details": "string"
            }
          ]
        }
        ```

#### DELETE

- **Tags:** feature-controller
- **Operation ID:** deleteFeature
- **Parameters:**
  - Name: internalName
    - In: query
    - Required: true
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Responses:**
  - 200 OK
    - Description: OK

Let me know if there's anything else!




### /api/features/{internalName}

#### GET

- **Tags:** feature-controller
- **Operation ID:** getFeatureByInternalName
- **Parameters:**
  - Name: internalName
    - In: path
    - Required: true
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "name": "string",
          "internalName": "string",
          "details": "string"
        }
        ```

Let me know if you need anything else!





### /api/features/product/{productInternalName}

#### GET

- **Tags:** feature-controller
- **Operation ID:** getFeaturesByProductInternalName_1
- **Parameters:**
  - Name: productInternalName
    - In: path
    - Required: true
    - Schema:
      ```json
      {
        "type": "string"
      }
      ```
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "array",
          "items": [
            {
              "name": "string",
              "internalName": "string",
              "details": "string"
            }
          ]
        }
        ```

Feel free to reach out if you have any more requests!




# OpenAPI definition

## / (Root)

### GET

- **Tags:** Clients
- **Summary:** This method is used to get the clients.
- **Operation ID:** getClients_1
- **Responses:**
  - 200 OK
    - Description: OK
    - Content: */*
      - Schema:
        ```json
        {
          "type": "array",
          "items": {
            "type": "string"
          }
        }
        ```

## Components

### Schemas

#### ProductDTO

- Type: object
- Properties:
  - name:
    - Type: string
  - internalName:
    - Type: string
  - userId:
    - Type: integer
    - Format: int64
  - details:
    - Type: string
  - maxProductsPerLocation:
    - Type: integer
    - Format: int32

#### ParameterDTO

- Type: object
- Properties:
  - name:
    - Type: string
  - internalName:
    - Type: string
  - details:
    - Type: string
  - parameterType:
    - Type: string
    - Enum: ["QUANTITY", "PRICE", "OTHER"]
  - value:
    - Type: string

#### FeatureDTO

- Type: object
- Properties:
  - name:
    - Type: string
  - internalName:
    - Type: string
  - details:
    - Type: string





#### Feature

- Type: object
- Properties:
  - id:
    - Type: integer
    - Format: int64
  - name:
    - Type: string
  - internalName:
    - Type: string
  - details:
    - Type: string
  - product:
    - $ref: "#/components/schemas/Product"
  - parameters:
    - Type: array
    - Items:
      - id:
        - Type: integer
        - Format: int64
      - name:
        - Type: string
      - internalName:
        - Type: string
      - details:
        - Type: string
      - parameterType:
        - Type: string
        - Enum: ["QUANTITY", "PRICE", "OTHER"]
      - value:
        - Type: string
      - feature:
        - Type: object




#### Parameter

- Type: object
- Properties:
  - id:
    - Type: integer
    - Format: int64
  - name:
    - Type: string
  - internalName:
    - Type: string
  - details:
    - Type: string
  - parameterType:
    - Type: string
    - Enum: ["QUANTITY", "PRICE", "OTHER"]
  - value:
    - Type: string
  - feature:
    - $ref: "#/components/schemas/Feature"





#### Product

- Type: object
- Properties:
  - id:
    - Type: integer
    - Format: int64
  - name:
    - Type: string
  - internalName:
    - Type: string
  - details:
    - Type: string
  - userId:
    - Type: integer
    - Format: int64
  - maxProductsPerLocation:
    - Type: integer
    - Format: int32
  - features:
    - Type: array
    - Items:
      - id:
        - Type: integer
        - Format: int64
      - name:
        - Type: string
      - internalName:
        - Type: string
      - details:
        - Type: string
      - product:
        - $ref: "#/components/schemas/Product"
      - parameters:
        - Type: array
        - Items:
          - id:
            - Type: integer
            - Format: int64
          - name:
            - Type: string
          - internalName:
            - Type: string
          - details:
            - Type: string
          - parameterType:
            - Type: string
            - Enum: ["QUANTITY", "PRICE", "OTHER"]
          - value:
            - Type: string
          - feature:
            - $ref: "#/components/schemas/Feature"





#### Users

- Type: object
- Properties:
  - id:
    - Type: integer
    - Format: int64
  - name:
    - Type: string
  - password:
    - Type: string
  - role:
    - Type: string
  - product:
    - Type: array
    - Items:
      - id:
        - Type: integer
        - Format: int64
      - name:
        - Type: string
      - internalName:
        - Type: string
      - details:
        - Type: string
      - userId:
        - Type: integer
        - Format: int64
      - maxProductsPerLocation:
        - Type: integer
        - Format: int32
      - features:
        - Type: array
        - Items:
          - id:
            - Type: integer
            - Format: int64
          - name:
            - Type: string
          - internalName:
            - Type: string
          - details:
            - Type: string
          - product:
            - $ref: "#/components/schemas/Product"
          - parameters:
            - Type: array
            - Items:
              - id:
                - Type: integer
                - Format: int64
              - name:
                - Type: string
              - internalName:
                - Type: string
              - details:
                - Type: string
              - parameterType:
                - Type: string
                - Enum: ["QUANTITY", "PRICE", "OTHER"]
              - value:
                - Type: string
              - feature:
                - $ref: "#/components/schemas/Feature"




#### LoginBody

- Type: object
- Properties:
  - username:
    - Type: string
  - password:
    - Type: string

#### TokenDTO

- Type: object
- Properties:
  - token:
    - Type: string

#### Security Schemes

- Name: Bearer Authentication
  - Type: http
  - Scheme: bearer
  - Bearer Format: JWT

