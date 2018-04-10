<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.3.1/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.js"></script>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class="ui input">
    <input type="text" placeholder="username" id="username">
</div>
<div class="ui input">
    <input type="text" placeholder="psw" id="psw">
</div>
<button class="ui button" onclick="checkLogin()">checkLogin</button>

<script type="text/javascript">
    function checkLogin() {
        var username = $('#username').val();
        var psw = $('#psw').val();
        $.ajax({
            url: "/user/checkLogin",
            type: "POST",
            dataType: "json",
            data: {username: username, psw: psw},
            success: function (data) {
                alert(data);
            }
        })
    }
</script>
</body>
</html>