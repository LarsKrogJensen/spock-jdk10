import spock.lang.Specification

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
}
