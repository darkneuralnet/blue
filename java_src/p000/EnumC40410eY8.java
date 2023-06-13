package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
/* renamed from: eY8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC40410eY8 implements KX8 {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;
    

    /* renamed from: d */
    public static final Unsafe f78533d;

    /* renamed from: e */
    public static final int f78534e;

    static {
        Unsafe m42793d = m42793d();
        f78533d = m42793d;
        f78534e = m42793d.arrayBaseOffset(byte[].class);
        if (m42793d.arrayIndexScale(byte[].class) == 1) {
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static final long m42795b(byte[] bArr, int i) {
        return f78533d.getLong(bArr, i + f78534e);
    }

    /* renamed from: c */
    public static final long m42794c(byte[] bArr, int i) {
        return Long.reverseBytes(f78533d.getLong(bArr, i + f78534e));
    }

    /* renamed from: d */
    public static Unsafe m42793d() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new UX8());
        }
    }

    @Override // p000.KX8
    /* renamed from: a */
    public final /* synthetic */ long mo42796a(byte[] bArr, int i) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return m42794c(bArr, i);
            }
            throw null;
        }
        return m42795b(bArr, i);
    }
}
