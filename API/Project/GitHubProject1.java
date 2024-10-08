<?xml version="1.0" encoding="UTF-8"?>
<con:soapui-project id="166f6c34-38d5-43e3-b947-1345bc127797" created="3.49.0" activeEnvironment="Default environment" encryptionMode="Not encrypted" name="API_Project" projectVersion="" updated="3.49.0 2023-10-13T06:54:34Z" xmlns:con="http://eviware.com/soapui/config">
  <con:settings>
    <con:setting id="IncludeOverview">true</con:setting>
    <con:setting id="IncludeResults">true</con:setting>
    <con:setting id="FlowLayout">false</con:setting>
    <con:setting id="ErrorDetails">true</con:setting>
    <con:setting id="IncludeCoverage">true</con:setting>
  </con:settings>
  <con:interface xsi:type="con:RestService" id="4481dcf7-8a72-49d5-b1b8-74868b29143a" wadlVersion="http://wadl.dev.java.net/2009/02" name="https://api.github.com" type="rest" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <con:settings id="f0e7ff25-629b-4416-b5bb-ad0369696d66"/>
    <con:definitionCache type="TEXT" rootPart=""/>
    <con:endpoints>
      <con:endpoint>https://api.github.com</con:endpoint>
    </con:endpoints>
    <con:resource name="Emails" path="/user/emails" id="ff6d10e3-2ef9-4a74-8ef6-2328df3f3c80">
      <con:settings/>
      <con:parameters/>
      <con:method name="Emails" id="4fca7b5f-0afc-49a3-b24d-125bee0d226d" method="GET">
        <con:settings/>
        <con:parameters/>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json; charset=utf-8</con:mediaType>
          <con:status>200</con:status>
          <con:params/>
          <con:element>Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="2476c2e4-6be4-40d7-b607-6b754d173702" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://api.github.com</con:endpoint>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:parameters/>
        </con:request>
      </con:method>
    </con:resource>
    <con:resource name="Keys" path="/user/keys" id="e470f760-3501-4d8b-a59f-3c46ff99ae3e">
      <con:settings/>
      <con:parameters/>
      <con:method name="Keys" id="c58df01d-e61f-4435-b39f-e4ca1bde139e" method="POST">
        <con:settings/>
        <con:parameters/>
        <con:representation type="FAULT">
          <con:mediaType>application/json; charset=utf-8</con:mediaType>
          <con:status>400</con:status>
          <con:params/>
          <con:element xmlns:keys="https://api.github.com/user/keys">keys:Fault</con:element>
        </con:representation>
        <con:representation type="REQUEST">
          <con:mediaType>application/json</con:mediaType>
          <con:params/>
        </con:representation>
        <con:representation type="RESPONSE">
          <con:mediaType>application/json; charset=utf-8</con:mediaType>
          <con:status>201</con:status>
          <con:params/>
          <con:element xmlns:keys="https://api.github.com/user/keys">keys:Response</con:element>
        </con:representation>
        <con:request name="Request 1" id="88959d8d-28dc-4b12-8a9e-88f7d97dd1a0" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://api.github.com</con:endpoint>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:parameters/>
        </con:request>
      </con:method>
    </con:resource>
    <con:resource name="KeyId" path="/user/keys/{keyId}" id="c62e0042-158a-42f1-a424-71ae860c8549">
      <con:settings/>
      <con:parameters/>
      <con:method name="KeyId" id="0477f3b4-a56a-404c-b324-85d71550b6eb" method="DELETE">
        <con:settings/>
        <con:parameters>
          <con:parameter required="true">
            <con:name>keyId</con:name>
            <con:value>keyId</con:value>
            <con:style>TEMPLATE</con:style>
            <con:default>keyId</con:default>
            <con:path xsi:nil="true"/>
            <con:description xsi:nil="true"/>
          </con:parameter>
        </con:parameters>
        <con:representation type="REQUEST">
          <con:mediaType>application/json</con:mediaType>
          <con:params/>
        </con:representation>
        <con:representation type="RESPONSE">
          <con:mediaType xsi:nil="true"/>
          <con:status>204</con:status>
          <con:params/>
          <con:element>data</con:element>
        </con:representation>
        <con:representation type="FAULT">
          <con:mediaType>application/json; charset=utf-8</con:mediaType>
          <con:status>404</con:status>
          <con:params/>
          <con:element xmlns:ns="https://api.github.com/user/keys">ns:Fault</con:element>
        </con:representation>
        <con:request name="Request 1" id="ca35be29-0199-4328-935e-1f2643b259d7" mediaType="application/json">
          <con:settings/>
          <con:endpoint>https://api.github.com</con:endpoint>
          <con:credentials>
            <con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
            <con:authType>No Authorization</con:authType>
          </con:credentials>
          <con:parameters>
            <con:entry key="keyId" value="keyId"/>
          </con:parameters>
          <con:parameterOrder>
            <con:entry>keyId</con:entry>
          </con:parameterOrder>
        </con:request>
      </con:method>
    </con:resource>
  </con:interface>
  <con:testSuite id="dec244ff-5e9a-44df-a2c6-9755cd5e2862" name="https://api.github.com Test Suite">
    <con:settings id="af90b88b-2d9e-49ed-84e6-7352286fa92a"/>
    <con:runType>SEQUENTIAL</con:runType>
    <con:testCase id="501e0005-82b4-4ea2-ae32-2cf059b31759" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="Test Case" searchProperties="true" timeout="0">
      <con:settings>
        <con:setting id="GeneratableJUnitReport@Style">Multiple Pages</con:setting>
        <con:setting id="GeneratableJUnitReport@Folder">C:\Users\003NER744\FST\API_Project</con:setting>
        <con:setting id="GeneratableJUnitReport@Modify">false</con:setting>
      </con:settings>
      <con:testStep type="restrequest" name="Request 1" id="bcadc416-fdbc-4729-aa0e-b1014b102caa">
        <con:settings/>
        <con:config service="https://api.github.com" resourcePath="/user/emails" methodName="Emails" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Request 1" id="2476c2e4-6be4-40d7-b607-6b754d173702" mediaType="application/json">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://api.github.com</con:endpoint>
            <con:request/>
            <con:originalUri>https://api.github.com/user/emails</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="efd00362-37d2-48dc-b316-c0e4aaf25c6e" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>GITHUB_API_TOKEN</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters/>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Request 2" id="803e9080-4bbe-4c77-afe3-a5e2c9827dbe">
        <con:settings/>
        <con:config service="https://api.github.com" resourcePath="/user/keys" methodName="Keys" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Request 2" id="88959d8d-28dc-4b12-8a9e-88f7d97dd1a0" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://api.github.com</con:endpoint>
            <con:request>{
	"title":"TestKey",
	"key":"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOvuqUgXzZsAMGdeNXKTG1E6bH0OWG96tAzbjohTXjDi"
}</con:request>
            <con:originalUri>https://api.github.com/user/keys</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="d5f6de82-3bf1-4bee-a7a4-ed8ed30ae3a6" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200,201</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>GITHUB_API_TOKEN</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters/>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:testStep type="transfer" name="Property Transfer" id="84494ef3-9704-4013-9903-dbb7df59d869">
        <con:settings/>
        <con:config xsi:type="con:PropertyTransfersStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:transfers setNullOnMissingSource="true" transferTextContent="true" failOnError="true" ignoreEmpty="false" transferToAll="false" entitize="false" transferChildNodes="false">
            <con:name>getID</con:name>
            <con:sourceType>Response</con:sourceType>
            <con:sourceStep>Request 2</con:sourceStep>
            <con:sourcePath>$['id']</con:sourcePath>
            <con:targetType>keyId</con:targetType>
            <con:targetStep>Request 3</con:targetStep>
            <con:targetPath/>
            <con:type>JSONPATH</con:type>
            <con:targetTransferType>XPATH</con:targetTransferType>
            <con:upgraded>true</con:upgraded>
          </con:transfers>
        </con:config>
      </con:testStep>
      <con:testStep type="restrequest" name="Request 3" id="44b782ba-1cf8-4627-928b-9da8ae57e011">
        <con:settings/>
        <con:config service="https://api.github.com" resourcePath="/user/keys/{keyId}" methodName="KeyId" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <con:restRequest name="Request 3" id="ca35be29-0199-4328-935e-1f2643b259d7" mediaType="application/json" postQueryString="false">
            <con:settings>
              <con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
            </con:settings>
            <con:endpoint>https://api.github.com</con:endpoint>
            <con:request/>
            <con:originalUri>https://api.github.com/user/keys</con:originalUri>
            <con:assertion type="Valid HTTP Status Codes" id="1486dc41-4e49-43a3-af51-cd96bb3cee24" name="Valid HTTP Status Codes">
              <con:settings/>
              <con:configuration>
                <codes>200,204</codes>
              </con:configuration>
            </con:assertion>
            <con:credentials>
              <con:selectedAuthProfile>GITHUB_API_TOKEN</con:selectedAuthProfile>
              <con:authType>No Authorization</con:authType>
            </con:credentials>
            <con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
            <con:parameters>
              <con:entry key="keyId" value="89719982"/>
            </con:parameters>
            <con:parameterOrder>
              <con:entry>keyId</con:entry>
            </con:parameterOrder>
          </con:restRequest>
        </con:config>
      </con:testStep>
      <con:properties/>
      <con:reportParameters/>
    </con:testCase>
    <con:properties/>
    <con:reportParameters/>
  </con:testSuite>
  <con:requirements/>
  <con:properties/>
  <con:wssContainer/>
  <con:databaseConnectionContainer/>
  <con:jmsConnectionContainer/>
  <con:oAuth2ProfileContainer>
    <con:oAuth2Profile>
      <con:name>GITHUB_API_TOKEN</con:name>
      <con:type>OAuth 2.0</con:type>
      <con:accessToken>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</con:accessToken>
      <con:accessTokenPosition>HEADER</con:accessTokenPosition>
      <con:accessTokenStartingStatus>ENTERED_MANUALLY</con:accessTokenStartingStatus>
      <con:oAuth2Flow>AUTHORIZATION_CODE_GRANT</con:oAuth2Flow>
      <con:refreshAccessTokenMethod>AUTOMATIC</con:refreshAccessTokenMethod>
      <con:jwtConfiguration/>
      <con:responseType>id_token</con:responseType>
    </con:oAuth2Profile>
  </con:oAuth2ProfileContainer>
  <con:oAuth1ProfileContainer/>
  <con:reporting>
    <con:xmlTemplates/>
    <con:parameters/>
  </con:reporting>
  <con:eventHandlers type="RequestFilter.filterRequest" name="RequestFilter.filterRequest">
    <con:script>// Sample event script to add custom HTTP header to all outgoing REST, SOAP and HTTP(S) calls
// This code is often used for adding custom authentication to ReadyAPI functional tests

// If hardcoding the token, uncomment and change line 5
// token = '4567'

// If your token is parameterized in Project level custom property, uncomment line 8
// token = request.parent.testCase.testSuite.project.getProperty('auth_token').getValue()

// To modify all outgoing calls, remove comments from lines 11 to 16
// headers = request.requestHeaders
// if (headers.containsKey('auth_token2') == false) {
//   headers.put('auth_token2', token)
//   request.requestHeaders = headers
// }</con:script>
  </con:eventHandlers>
  <con:eventHandlers type="TestRunListener.afterStep" name="TestRunListener.afterStep">
    <con:script>
// Save all test step results into files
// Change the directory path in line 5 to a location where you want to store details
// then uncomment lines 5 to 10

// filePath = 'C:\\tempOutputDirectory\\'
// fos = new java.io.FileOutputStream(filePath + testStepResult.testStep.label + '.txt', true)
// pw = new java.io.PrintWriter(fos)
// testStepResult.writeTo(pw)
// pw.close()
// fos.close()</con:script>
  </con:eventHandlers>
  <con:authRepository>
    <con:oAuth20AuthEntry>
      <con:name>GITHUB_API_TOKEN</con:name>
      <con:type>OAuth 2.0</con:type>
      <con:accessToken>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</con:accessToken>
      <con:accessTokenPosition>HEADER</con:accessTokenPosition>
      <con:accessTokenStartingStatus>ENTERED_MANUALLY</con:accessTokenStartingStatus>
      <con:oAuth2Flow>AUTHORIZATION_CODE_GRANT</con:oAuth2Flow>
      <con:refreshAccessTokenMethod>AUTOMATIC</con:refreshAccessTokenMethod>
      <con:jwtConfiguration/>
      <con:responseType>id_token</con:responseType>
    </con:oAuth20AuthEntry>
  </con:authRepository>
  <con:tags/>
</con:soapui-project>