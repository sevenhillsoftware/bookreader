package tuoyo.misc;

import java.io.InputStream;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserTest {

    @Test
    public void testLoadUsers() throws Exception {
        final InputStream bookStream = Thread.currentThread()
                .getContextClassLoader().getResourceAsStream("books.json");
        final String json = IOUtils.toString(bookStream);
        IOUtils.closeQuietly(bookStream);

        final List<User> userList = new ObjectMapper().readValue(json,
                new TypeReference<List<User>>() {
                });
        Assert.assertNotNull(userList);
    }
}
