<head>
  <meta name="layout" content="main">
  <title>Send a message!</title>
  <g:javascript library="jquery" plugin="jquery" />
</head>
<body>
  <p>Send a message:</p>
  <g:form name="myform" action="send">
    <g:textField name="message"/>
    <g:submitButton name="Send"/>
  </g:form>
  <g:if test="${flash.message}">
    <p style="color: gray;">Message sent: ${flash.message.encodeAsHTML()}</p>
  </g:if>
  <g:javascript>
$(function() {
    $("#message").focus();
});
</g:javascript>
</body>
