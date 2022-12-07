package example.teamcity.plugin;

import jetbrains.buildServer.serverSide.impl.ProjectEx;
import org.junit.Test;
import org.mockito.Mockito;

public class MockTest {

    @Test
    public void throwsExceptionWhenMocking() {
        Mockito.mock(ProjectEx.class);
    }
}
