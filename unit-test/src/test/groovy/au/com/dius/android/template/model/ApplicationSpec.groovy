package au.com.dius.android.template.model

import spock.lang.Specification

class ApplicationSpec extends Specification {

  def "Standard spock unit test"() {
    when:
      def app = new Application(name: 'someApp', released: new Date(), version: '1.0')
    then:
      app.name == 'someApp'
  }
}
