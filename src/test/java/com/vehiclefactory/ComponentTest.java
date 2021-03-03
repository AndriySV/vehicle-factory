package com.vehiclefactory;

import com.outsidesscope.OutsideScopeExample;
import com.vehiclefactory.component.ComponentExample;
import com.vehiclefactory.component.ControllerExample;
import com.vehiclefactory.component.RepositoryExample;
import com.vehiclefactory.component.ServiceExample;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ComponentTest {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    RepositoryExample repositoryExample2;

    @Test
    public void givenInScopeComponents_whenSearchingInApplicationContext_thenFindThem() {
        RepositoryExample repositoryExample = applicationContext.getBean(RepositoryExample.class);
        assertNotNull(repositoryExample);

        assertNotNull(applicationContext.getBean(ControllerExample.class));
        assertNotNull(applicationContext.getBean(ServiceExample.class));
        assertNotNull(applicationContext.getBean(ComponentExample.class));
        assertNotNull(applicationContext.getBean(OutsideScopeExample.class));
    }

    @Test
    public void repExampleTest() {
        assertNotNull(repositoryExample2);
    }
}
