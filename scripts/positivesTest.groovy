import groovy.transform.CompileStatic

class NumbersService {
    List<Integer> findPositives(Collection<Integer> numbers) {
        def result = []
        for (int i in numbers) {
            if (i > 0) result << i
        }

        return result
    }
}

class NumbersTest {
    int iterations = 1
    int numbersCount = 5_000_000

    void runTest() {
        def service = new NumbersService()

        for (int i in 0..<iterations) {
            def array = generateNumbers(numbersCount)

            def start = System.currentTimeMillis()
            def result = service.findPositives(array)
            def end = System.currentTimeMillis()
            println "Found ${result.size()} positives in ${end - start}ms"
        }
    }

    List<Integer> generateNumbers(int count) {
        def array = new ArrayList(count)
        def random = new Random()
        for (int i in 0..<numbersCount) {
            array[i] = random.nextInt()
        }

        return array
    }
}

// Run the test
def start = System.currentTimeMillis()
def test = new NumbersTest(iterations: 5, numbersCount: 1_000_000)
test.runTest()

println "Overall time: ${System.currentTimeMillis() - start}ms"
