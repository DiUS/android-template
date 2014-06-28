package au.com.dius.android.template.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApplicationTest {

  @Test
  public void shouldExpectMoreCodeAndLessReadabilityWithJunitTypeTests(){
    Application application = mock(Application.class);
    when(application.getName()).thenReturn("Sure thing");
    assertThat(application.getName(), is("Sure things"));
  }
}