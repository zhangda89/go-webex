<!DOCTYPE html>
<html>
<head>
  <title>upload file</title>
</head>
<body>
  <form enctype="multipart/form-data" action="/upload" method="post">
    <input type="file" name="uploadfile"/>
    <input type="hidden" name="token" value="{ . }"/>
    <input type="submit" name="Upload" />
  </form>
</body>
</html>