/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.langserver.completions.consts;

/**
 * Snippet for the Ballerina language constructs.
 */
public enum Snippet {
    ABORT("abort;"),
    ANNOTATION_DEFINITION("annotation ${1:name}{\n\t${2 }\n}"),
    BIND("bind ${1:__connector} with ${2:__endpoint}"),
    BREAK("break;"),
    CONNECTOR_ACTION("action ${1:name} (${2}) (${3}) {\n\t${4}\n}"),
    CONNECTOR_DEFINITION("connector ${1:name} (${2}) {\n\t${3}\n}"),
    NEXT("next;"),
    FUNCTION("function ${1:name} (${2}) {\n\t${3}\n}"),
    TRANSFORMER("transformer<${1:Source} ${2:a},${3:Target} ${4:b}>{\n\t${5}\n}"),
    ENDPOINT("endpoint <${1:constraint}> ${2:__endpoint} {\n\t${3}\n}"),
    ENUM("enum ${1:name} {\n\t\n}"),
    FORK("fork {\n\t${1}\n} join (${2:all}) (map ${3:results}) {\n\t${4}\n}"),
    IF("if (${1:true}) {\n\t${2}\n}"),
    ITERATE("iterate (${1}) {\n\t${2}\n}"),
    MAIN_FUNCTION("function main (string[] args) {\n\t${1}\n}"),
    NAMESPACE_DECLARATION("xmlns \"${1}\" as ${2:ns};"),
    REPLY("reply ${1};"),
    RESOURCE("resource ${1:name} (http:Connection conn, http:InRequest inRequest) {\n\t${2}\n}"),
    RETURN("return;"),
    SERVICE("service<${1:http}> ${2:serviceName}{\n\tresource ${3:resourceName}" +
            " (http:Connection conn, http:InRequest inRequest) {\n\t}\n}"),
    STRUCT_DEFINITION("struct ${1:name}{\n\t${2}\n}"),
    TRANSACTION("transaction with retries(${1}) {\n\t${2}\n} failed {\n\t${3}\n}"),
    TRIGGER_WORKER("${1} -> ${2};"),
    TRY_CATCH("try {\n\t${1}\n} catch (${2:error} ${3:err}) {\n\t${4}\n}"),
    WHILE("while (${1:true}) {\n\t${2}\n}"),
    WORKER_REPLY("${1} <- ${2};"),
    WORKER("worker ${1:name} {\n\t${2}\n}"),
    XML_ATTRIBUTE_REFERENCE("\"${1}\"@[\"${2}\"]");

    private String value;

    Snippet(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
