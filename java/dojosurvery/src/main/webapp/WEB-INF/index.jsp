
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Dojo Survey</title>
        <link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
        <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </head>

    <body>
        <div class="container">
            <form action= "/results" method="POST">
                <label for="name"> Name: </label>
                <input type= "text" placeholder="Name here" name="name">

                <label for="location"> Dojo Location: </label>
                    <select name="location">
                        <option value= "San Jose"> San Jose </option>
                        <option value= "Austin"> Austin </option>
                    </select>
                
                    <label for="language"> Favorite Language: </label>
                    <select name="language">
                        <option value= "Python"> Python </option>
                        <option value= "Java"> Java </option>
                    </select>
                
                <label for="comment"> Comment (Optional) </label>
                <textarea name="comment" placeholer="Thanks for your comment!"></textarea>

                <button type="submit"> Submit </button>
            </form>
        </div>
    </body>
</html>