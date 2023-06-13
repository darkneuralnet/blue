package p000;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: si6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48807si6 {
    private C48807si6() {
    }

    /* renamed from: a */
    public static Integer m13790a() {
        return V30.m80462a();
    }

    /* renamed from: b */
    public static int m13789b() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & ByteCompanionObject.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        }
        return i;
    }

    /* renamed from: c */
    public static final byte m13788c(char c) {
        if (c < '!' || c > '~') {
            throw new TinkBugException("Not a printable ASCII character: " + c);
        }
        return (byte) c;
    }

    /* renamed from: d */
    public static final Q70 m13787d(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = m13788c(str.charAt(i));
        }
        return Q70.m88906a(bArr);
    }
}
