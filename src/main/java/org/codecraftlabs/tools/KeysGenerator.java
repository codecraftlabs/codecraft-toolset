package org.codecraftlabs.tools;

import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import static java.lang.System.getProperty;

public class KeysGenerator {
    private static final String ACCESS_KEY_DEFAULT_SIZE = "120";
    private static final String SECRET_KEY_DEFAULT_SIZE = "240";
    private static final String APP_ACCESS_KEY_SIZE_PROP = "app.accessKeySize";
    private static final String APP_SECRET_KEY_SIZE_PROP = "app.secretKeySize";

    public String[] generateKeys() throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance("HMACSHA1");
        generator.init(getKeySize(APP_ACCESS_KEY_SIZE_PROP, ACCESS_KEY_DEFAULT_SIZE));
        byte[] accessKey = generator.generateKey().getEncoded();
        generator.init(getKeySize(APP_SECRET_KEY_SIZE_PROP, SECRET_KEY_DEFAULT_SIZE));
        byte[] secretKey = generator.generateKey().getEncoded();

        String encodedAccessKey = Base64.getEncoder().encodeToString(accessKey);
        String encodedSecretKey = Base64.getEncoder().encodeToString(secretKey);

        return new String[]{encodedAccessKey, encodedSecretKey};
    }

    public String generatePassword() throws NoSuchAlgorithmException {
        KeyGenerator generator = KeyGenerator.getInstance("HMACSHA1");
        generator.init(getKeySize(APP_ACCESS_KEY_SIZE_PROP, ACCESS_KEY_DEFAULT_SIZE));
        var key = generator.generateKey().getEncoded();
        return Base64.getEncoder().encodeToString(key);
    }

    private int getKeySize(String keyName, String defaultValue) {
        String keySize = getProperty(keyName, defaultValue);
        return Integer.parseInt(keySize);
    }
}
