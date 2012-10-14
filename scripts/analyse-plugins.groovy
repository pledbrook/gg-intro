@Grab(group='com.github.groovy-wslite', module='groovy-wslite', version='0.7.1')
import wslite.rest.*

def client = new RESTClient("http://localhost:9343")
def response = client.get(path: "/api/v1.0/plugins")

assert 200 == response.statusCode
println ">> " + response.json.pluginList.findAll { it.name =~ "shiro" }.collect { [ it.name, it.version ] }
