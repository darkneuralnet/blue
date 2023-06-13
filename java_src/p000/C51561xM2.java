package p000;

import android.security.keystore.KeyGenParameterSpec;
import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
@Deprecated
/* renamed from: xM2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51561xM2 {

    /* renamed from: a */
    public static final KeyGenParameterSpec f117448a = m5422a("_androidx_security_master_key_");

    /* renamed from: b */
    public static Object f117449b = new Object();

    private C51561xM2() {
    }

    /* renamed from: a */
    public static KeyGenParameterSpec m5422a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }

    /* renamed from: b */
    public static void m5421b(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e) {
            throw new GeneralSecurityException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static String m5420c(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        m5418e(keyGenParameterSpec);
        synchronized (f117449b) {
            if (!m5419d(keyGenParameterSpec.getKeystoreAlias())) {
                m5421b(keyGenParameterSpec);
            }
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    /* renamed from: d */
    public static boolean m5419d(String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    /* renamed from: e */
    public static void m5418e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() == 256) {
            if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                if (keyGenParameterSpec.getPurposes() == 3) {
                    if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                        }
                        return;
                    }
                    throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                }
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            }
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
    }
}
