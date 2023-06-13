package com.google.protobuf;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.t */
/* loaded from: classes6.dex */
public final class C18544t {

    /* renamed from: a */
    public static final Charset f74872a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f74873b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final Charset f74874c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f74875d;

    /* renamed from: e */
    public static final ByteBuffer f74876e;

    /* renamed from: f */
    public static final AbstractC18516f f74877f;

    /* renamed from: com.google.protobuf.t$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18545a extends InterfaceC18553i<Boolean> {
    }

    /* renamed from: com.google.protobuf.t$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18546b extends InterfaceC18553i<Double> {
    }

    /* renamed from: com.google.protobuf.t$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC18547c {
        int getNumber();
    }

    /* renamed from: com.google.protobuf.t$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC18548d<T extends InterfaceC18547c> {
        T findValueByNumber(int i);
    }

    /* renamed from: com.google.protobuf.t$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC18549e {
        /* renamed from: a */
        boolean mo33504a(int i);
    }

    /* renamed from: com.google.protobuf.t$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC18550f extends InterfaceC18553i<Float> {
    }

    /* renamed from: com.google.protobuf.t$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC18551g extends InterfaceC18553i<Integer> {
        /* renamed from: L2 */
        void mo45990L2(int i);

        int getInt(int i);

        @Override // com.google.protobuf.C18544t.InterfaceC18553i
        /* renamed from: k */
        InterfaceC18553i<Integer> mo45959k(int i);
    }

    /* renamed from: com.google.protobuf.t$h */
    /* loaded from: classes6.dex */
    public interface InterfaceC18552h extends InterfaceC18553i<Long> {
    }

    /* renamed from: com.google.protobuf.t$i */
    /* loaded from: classes6.dex */
    public interface InterfaceC18553i<E> extends List<E>, RandomAccess {
        /* renamed from: k */
        InterfaceC18553i<E> mo45959k(int i);

        /* renamed from: r */
        void mo45989r();

        /* renamed from: t */
        boolean mo45974t();
    }

    static {
        byte[] bArr = new byte[0];
        f74875d = bArr;
        f74876e = ByteBuffer.wrap(bArr);
        f74877f = AbstractC18516f.m46275f(bArr);
    }

    private C18544t() {
    }

    /* renamed from: a */
    public static <T> T m46000a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <T> T m45999b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m45998c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m45997d(byte[] bArr) {
        return m45996e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m45996e(byte[] bArr, int i, int i2) {
        int m45992i = m45992i(i2, bArr, i, i2);
        if (m45992i == 0) {
            return 1;
        }
        return m45992i;
    }

    /* renamed from: f */
    public static int m45995f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m45994g(byte[] bArr) {
        return C18483O.m46375m(bArr);
    }

    /* renamed from: h */
    public static Object m45993h(Object obj, Object obj2) {
        return ((InterfaceC18462D) obj).toBuilder().mo46331j0((InterfaceC18462D) obj2).mo46033E();
    }

    /* renamed from: i */
    public static int m45992i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m45991j(byte[] bArr) {
        return new String(bArr, f74873b);
    }
}
