@Grab(group='com.github.groovy-wslite', module='groovy-wslite', version='0.7.1')
import wslite.rest.*

def pluginName = args.size() > 0 ? args[0] : "shiro"

println "Getting data..."
def client = new RESTClient("http://localhost:9343")
def response = client.get(path: "/api/v1.0/plugins")

def plugins = response.json.pluginList
def selectedPlugins = plugins.findAll { plugin -> plugin.name =~ pluginName }

for (p in selectedPlugins) {
    println "Found ${p.name} ${p.version}"
}

println "There are ${plugins.size()} plugins matching '${pluginName}'"
