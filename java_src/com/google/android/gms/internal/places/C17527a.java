package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.AbstractC17530c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
/* renamed from: com.google.android.gms.internal.places.a */
/* loaded from: classes5.dex */
public class C17527a {

    /* renamed from: c */
    public static volatile C17527a f71144c;

    /* renamed from: a */
    public final Map<C17528a, AbstractC17530c.C17535e<?, ?>> f71146a;

    /* renamed from: b */
    public static final Class<?> f71143b = m51232a();

    /* renamed from: d */
    public static final C17527a f71145d = new C17527a(true);

    /* renamed from: com.google.android.gms.internal.places.a$a */
    /* loaded from: classes5.dex */
    public static final class C17528a {

        /* renamed from: a */
        public final Object f71147a;

        /* renamed from: b */
        public final int f71148b;

        public C17528a(Object obj, int i) {
            this.f71147a = obj;
            this.f71148b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17528a)) {
                return false;
            }
            C17528a c17528a = (C17528a) obj;
            if (this.f71147a != c17528a.f71147a || this.f71148b != c17528a.f71148b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f71147a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f71148b;
        }
    }

    public C17527a() {
        this.f71146a = new HashMap();
    }

    /* renamed from: a */
    public static Class<?> m51232a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C17527a m51231b() {
        C17527a c17527a = f71144c;
        if (c17527a == null) {
            synchronized (C17527a.class) {
                c17527a = f71144c;
                if (c17527a == null) {
                    c17527a = C32961Ft7.m106287b();
                    f71144c = c17527a;
                }
            }
        }
        return c17527a;
    }

    /* renamed from: c */
    public final <ContainingType extends InterfaceC52815zT7> AbstractC17530c.C17535e<ContainingType, ?> m51230c(ContainingType containingtype, int i) {
        return (AbstractC17530c.C17535e<ContainingType, ?>) this.f71146a.get(new C17528a(containingtype, i));
    }

    public C17527a(boolean z) {
        this.f71146a = Collections.emptyMap();
    }
}
