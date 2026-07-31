# Web & API Rest
## 1- Client-Server Arquitecture.
The client-server architecture is the fundamental model of web.             

- Client (Front-end): It's who requests datas or services. It can be your browser, an application on the phone or even a smart tv.
- Server (Back-end): It's the computer (or set of cloud machines) that processes the requests, consults the database and sends the answers back.

> Restaurant analogy: The Client is the customer at the table looking at menu. The server is the kitchen who prepares the dish. The waiter who takes the dish to the kitchen and bring back to the table is the HTTP Protocol.

## 2- How HTTPS Requests work.
The HTTP (HyperText Transfer Protocol) is the default language who allows the communication between client and server. Each interaction splits in a request (Requirement) and a response.

 → HTTP methods: Indicate the action the customer wishes to perform.
> - GET: Requests data reading. Does not change the server state (ex: load your instagram feed)
> - POST: Create a new register in the server (ex: post a new photo on instagram or send a registration form).
> - PUT: Completely updates an existing record (ex: changing all your profile information).
> - DELETE: Remove a record from the server. 

## 3- HTTP Status Code
When the server responds, it sends a three-digit code indicating the result.

| Track/Code                | Meaning         | Describe                                                                                  |
|---------------------------|-----------------|-------------------------------------------------------------------------------------------|
| 2XX (Sucess)              |                 | The request was processed sucessfullly and the data was returned.                         |
| 200 OK                    | Default sucess  |                                                                                           |
| 201 Created               | Create          | A new resource has been sucessfully created.                                              |
| 4XX Client error          |                 |                                                                                           |
| 400 Bad Request           | Invalid Request | The client sent malformed or missing data (ex: miss to fill email on a registration form. |
| 404 Not Found             | Not Found       | The resource or page doesn't exists on the server.                                        |
| 500 Internal Server Error | Internal error  | A failure occurred in the server itself while attempting to process the request.          |

