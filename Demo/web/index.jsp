<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f0f0f0; text-align: center; margin-top: 50px; }
        h1 { color: #333; }
        form { margin-top: 20px; }
        input[type='text'] { padding: 10px; width: 200px; margin-right: 10px; }
        input[type='submit'] { padding: 10px 20px; }
    </style>
</head>
<body>
    <h1>Welcome to Our Website</h1>
    <form action="welcome" method="post">
        <input type="text" name="username" placeholder="Enter your name" />
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
