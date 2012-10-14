import groovy.transform.CompileStatic

//@CompileStatic
class NumbersService {
    List<Integer> findPositives(Collection<Integer> numbers) {
        def result = []
        for (int i in numbers) {
            if (i > 0) result << i
        }

        return result
    }
}

// Generate random numbers.
def numbersCount = 5_000_000
def array = new ArrayList(numbersCount)
def random = new Random()
for (int i in 0..<numbersCount) {
    array[i] = random.nextInt()
}

def service = new NumbersService()
def start = System.currentTimeMillis()
def result = service.findPositives(array)

def end = System.currentTimeMillis()
println "Found ${result.size()} positives in ${end - start}ms"
