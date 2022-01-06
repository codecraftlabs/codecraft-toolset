package org.codecraftlabs.tools;

import javax.annotation.Nonnull;
import java.security.NoSuchAlgorithmException;

import static java.lang.System.getProperty;
import static java.util.Base64.getEncoder;
import static javax.crypto.KeyGenerator.getInstance;

public final class KeysGenerator {
    private static final String ACCESS_KEY_DEFAULT_SIZE = "120";
    private static final String SECRET_KEY_DEFAULT_SIZE = "240";
    private static final String APP_ACCESS_KEY_SIZE_PROP = "app.accessKeySize";
    private static final String APP_SECRET_KEY_SIZE_PROP = "app.secretKeySize";
    private static final String ALGORITHM_NAME = "HMACSHA1";

    @Nonnull
    public String[] generateKeys() throws NoSuchAlgorithmException {
        var generator = getInstance(ALGORITHM_NAME);

        generator.init(getKeySize(APP_ACCESS_KEY_SIZE_PROP, ACCESS_KEY_DEFAULT_SIZE));
        var accessKey = generator.generateKey().getEncoded();

        generator.init(getKeySize(APP_SECRET_KEY_SIZE_PROP, SECRET_KEY_DEFAULT_SIZE));
        var secretKey = generator.generateKey().getEncoded();

        var encodedAccessKey = getEncoder().encodeToString(accessKey);
        var encodedSecretKey = getEncoder().encodeToString(secretKey);

        return new String[]{encodedAccessKey, encodedSecretKey};
    }

    @Nonnull
    public String generatePassword() throws NoSuchAlgorithmException {
        var generator = getInstance(ALGORITHM_NAME);
        generator.init(getKeySize(APP_ACCESS_KEY_SIZE_PROP, ACCESS_KEY_DEFAULT_SIZE));
        var key = generator.generateKey().getEncoded();
        return getEncoder().encodeToString(key);
    }

    private int getKeySize(@Nonnull String keyName, @Nonnull String defaultValue) {
        var keySize = getProperty(keyName, defaultValue);
        return Integer.parseInt(keySize);
    }
}
