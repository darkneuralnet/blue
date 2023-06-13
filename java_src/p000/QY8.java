package p000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: QY8 */
/* loaded from: classes6.dex */
public final class QY8 extends TU8 implements Serializable {

    /* renamed from: b */
    public final MessageDigest f30516b;

    /* renamed from: c */
    public final int f30517c;

    /* renamed from: d */
    public final boolean f30518d;

    /* renamed from: e */
    public final String f30519e;

    public QY8(String str, String str2) {
        MessageDigest m88407e = m88407e("SHA-256");
        this.f30516b = m88407e;
        this.f30517c = m88407e.getDigestLength();
        this.f30519e = "Hashing.sha256()";
        this.f30518d = m88406f(m88407e);
    }

    /* renamed from: e */
    public static MessageDigest m88407e(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public static boolean m88406f(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.f30519e;
    }

    @Override // p000.LW8
    public final WW8 zze() {
        if (this.f30518d) {
            try {
                return new GY8((MessageDigest) this.f30516b.clone(), this.f30517c, null);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new GY8(m88407e(this.f30516b.getAlgorithm()), this.f30517c, null);
    }
}
