<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring rocks the web</title>
</head>
<body>
<h1>INDEX.FTL</h1>
<h2>Spring web</h2>
<h1> <a href="/restaurants">JSON</a><br><a href="/restUse.html">Ajax</a></h1>
<#if name??>
<h1>Hola ${name!"yuhu"}</h1>
</#if>
<#if rest??>
<ul>
    <#list rest as item>

        <div>
            <li>${item.code!""}</li>
            <li>${item.name!""}</li>
            <li>${item.images!""}</li>
            <li>${item.numero!""}</li>
            <li>${item.address!""}</li>
            <li>${item.website!""}</li>
            <li>${item.type!""}</li>
            <li>${item.mitjana!""}</li>
            <img src="${item.images!""}" width="340" height="340">
        </div>
        <br><br><br><br>
    </#list>
</ul>
</#if>
</body>
</html>