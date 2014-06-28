package au.com.dius.android.template

import android.app.Activity
import android.widget.TextView
import org.robolectric.Robolectric
import pl.polidea.robospock.RoboSpecification

/**
 * Note: If robo spec's fail when run from android studio, set the working directory to:
 * <root>/android-template/app/src/main
 *
 * Run >> Edit Configurations >> Working Directory
 *
 * Good idea to set the default working directory for junit to the same
 */
class MainActivitySpec extends RoboSpecification {

  def "should load main activity"() {
    setup:
      Activity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get()
    when:
      TextView tv = mainActivity.findViewById(R.id.hello_world)
    then:
      tv.text.toString() == 'Hello world!'
  }
}
