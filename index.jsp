<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.util.*" %>

<%
    // Get the ServletContext object
    ServletContext context = request.getServletContext();

    // Retrieve a context parameter
    String exampleParam = context.getInitParameter("exampleParam");

    // Retrieve a context attribute
    String exampleAttribute = (String) context.getAttribute("exampleAttribute");
%>

<!DOCTYPE html>
<html>
<head>
    <title>ServletContext Example</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #8660a0;
            color: #ebe4e4;
            padding: 20px;
            margin: 0;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            background-color: #b42f35;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #0056b3;
            font-size: 24px;
            margin-bottom: 20px;
        }
        p {
            font-size: 18px;
            line-height: 1.6;
        }
        .highlight {
            background-color: #e6f7ff;
            padding: 5px 10px;
            border-left: 4px solid #0056b3;
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>ServletContext Example</h1>
        <p>Welcome to a type of servlet context interface</p>
        <p>be happy to see you</p>
    </div>
</body>
</html>
