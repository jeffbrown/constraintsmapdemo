package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Widget)
class WidgetSpec extends Specification {

    void "test accessing the constraints property"() {
        when:
        def propValue = Widget.constraints

        then:
        propValue instanceof Map
        propValue.containsKey 'width'
        propValue.containsKey 'height'
    }
}
