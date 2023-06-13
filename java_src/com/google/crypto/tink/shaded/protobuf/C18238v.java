package com.google.crypto.tink.shaded.protobuf;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.v */
/* loaded from: classes6.dex */
public final class C18238v {

    /* renamed from: a */
    public static final Charset f74217a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f74218b = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: c */
    public static final Charset f74219c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f74220d;

    /* renamed from: e */
    public static final ByteBuffer f74221e;

    /* renamed from: f */
    public static final AbstractC18211h f74222f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18239a extends InterfaceC18247i<Boolean> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18240b extends InterfaceC18247i<Double> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC18241c {
        int getNumber();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC18242d<T extends InterfaceC18241c> {
        T findValueByNumber(int i);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC18243e {
        /* renamed from: a */
        boolean m47413a(int i);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC18244f extends InterfaceC18247i<Float> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC18245g extends InterfaceC18247i<Integer> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$h */
    /* loaded from: classes6.dex */
    public interface InterfaceC18246h extends InterfaceC18247i<Long> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$i */
    /* loaded from: classes6.dex */
    public interface InterfaceC18247i<E> extends List<E>, RandomAccess {
        /* renamed from: k */
        InterfaceC18247i<E> mo47397k(int i);

        /* renamed from: r */
        void mo47412r();

        /* renamed from: t */
        boolean mo47396t();
    }

    static {
        byte[] bArr = new byte[0];
        f74220d = bArr;
        f74221e = ByteBuffer.wrap(bArr);
        f74222f = AbstractC18211h.m47675f(bArr);
    }

    private C18238v() {
    }

    /* renamed from: a */
    public static <T> T m47423a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <T> T m47422b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m47421c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m47420d(byte[] bArr) {
        return m47419e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m47419e(byte[] bArr, int i, int i2) {
        int m47415i = m47415i(i2, bArr, i, i2);
        if (m47415i == 0) {
            return 1;
        }
        return m47415i;
    }

    /* renamed from: f */
    public static int m47418f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m47417g(byte[] bArr) {
        return C18172T.m47833m(bArr);
    }

    /* renamed from: h */
    public static Object m47416h(Object obj, Object obj2) {
        return ((InterfaceC18149F) obj).toBuilder().mo47793f3((InterfaceC18149F) obj2).mo47456E();
    }

    /* renamed from: i */
    public static int m47415i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m47414j(byte[] bArr) {
        return new String(bArr, f74218b);
    }
}
