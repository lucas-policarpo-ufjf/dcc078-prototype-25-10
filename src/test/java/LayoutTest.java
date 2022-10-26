import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminLayoutTest {

    @Test
    void shouldCloneCorrectly() throws CloneNotSupportedException {
        Layout layout = new Layout("admin","bem vindo admin!","todos direitos reservados");
        Layout layoutClone = layout.clone();

        layoutClone.setName("admin clone");
        layoutClone.setHeader("ola admin!");

        assertEquals("Layout{name='admin', header='bem vindo admin!', footer='todos direitos reservados'}",layout.toString());
        assertEquals("Layout{name='admin clone', header='ola admin!', footer='todos direitos reservados'}",layoutClone.toString());
    }


}