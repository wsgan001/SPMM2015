


<export:resource />
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/><meta name="layout" content="main" /><title>Reiseziel List</title></head><body><div class="nav"><span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span><span class="menuButton"><g:link class="create" action="create">New Reiseziel</g:link></span></div><div class="body"><h1>Reiseziel List</h1><g:if test="${flash.message}"><div class="message">${flash.message}</div></g:if><div class="list"><table><thead><tr><g:sortableColumn property="id" title="Id" /><g:sortableColumn property="resisedomizil" title="Resisedomizil" /></tr></thead><tbody><g:each in="${reisezielInstanceList}" status="i" var="reisezielInstance"><tr class="${(i % 2) == 0 ? 'odd' : 'even'}"><td><g:link action="show" id="${reisezielInstance.id}">${fieldValue(bean:reisezielInstance, field:'id')}</g:link></td><td>${fieldValue(bean:reisezielInstance, field:'resisedomizil')}</td></tr></g:each></tbody></table></div><div class="paginateButtons"><g:paginate total="${Reiseziel.count()}" /></div></div>
<export:formats formats="['xml']" />
</body>
</html>
