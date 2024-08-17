<%-- 
    Document   : saludar
    Created on : 13 ago 2024, 1:31:45 a.m.
    Author     : grenn
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title><s:property value="titulo"/></title><%-- variable del archivo de propiedades "titulo" --%>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1><%-- Variable del archivo de propiedades "titulo" --%>
        <s:form>
            <s:textfield name="nombre"/>
            <s:submit  key="persona.boton" name="submit"/><%--Variable del archivo de propiedades "boton" --%>
            <div>
                <s:property value="valor"/><%-- Variable del archivo de propiedades "valor" --%>
                <s:property value="nombre"/><%-- Variable que retorna el metodo getNombre() en MostrarPersonaAction.java--%>
            </div>
        </s:form>
    </body>
</html>
