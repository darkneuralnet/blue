package p000;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
/* renamed from: H9 */
/* loaded from: classes6.dex */
public class C3045H9 {
    /* renamed from: a */
    public static AlgorithmParameters m104282a(String str, Provider provider) throws NoSuchAlgorithmException {
        if (provider == null) {
            return AlgorithmParameters.getInstance(str);
        }
        return AlgorithmParameters.getInstance(str, provider);
    }
}
