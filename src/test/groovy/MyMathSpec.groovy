import spock.lang.Specification

import static org.hamcrest.Matchers.hasKey
import static spock.util.matcher.HamcrestSupport.that

class MyMathSpec extends Specification {
    def "should add"() {
        given:
        def a = 10
        def b = 2

        when:
        def result = MyMath.add(a, b)

        then:
        result == 12
    }

    def "map should have..."() {
        given:
        def map = [1: "one"]

        expect:
        that map, hasKey(1)
    }

    def "lambdas"() {
        given:
        def list = [1,2,3,4,5]

        def bd = 1.23
        def sample = new Sample().tap {
            username = "arne"
        }

        expect:
        1 in list
    }
}

class Sample {

    String username, email

    List<String> labels = []

    void addLabel(value) {
        labels << value
    }

}