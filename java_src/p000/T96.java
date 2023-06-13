package p000;

import android.util.Base64;
import p000.C27731qu;
/* renamed from: T96 */
/* loaded from: classes5.dex */
public abstract class T96 {

    /* renamed from: T96$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC7673a {
        /* renamed from: a */
        public abstract T96 mo16801a();

        /* renamed from: b */
        public abstract AbstractC7673a mo16800b(String str);

        /* renamed from: c */
        public abstract AbstractC7673a mo16799c(byte[] bArr);

        /* renamed from: d */
        public abstract AbstractC7673a mo16798d(N24 n24);
    }

    /* renamed from: a */
    public static AbstractC7673a m84269a() {
        return new C27731qu.C27733b().mo16798d(N24.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo16804b();

    /* renamed from: c */
    public abstract byte[] mo16803c();

    /* renamed from: d */
    public abstract N24 mo16802d();

    /* renamed from: e */
    public boolean m84268e() {
        return mo16803c() != null;
    }

    /* renamed from: f */
    public T96 m84267f(N24 n24) {
        return m84269a().mo16800b(mo16804b()).mo16798d(n24).mo16799c(mo16803c()).mo16801a();
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = mo16804b();
        objArr[1] = mo16802d();
        if (mo16803c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(mo16803c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
