package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
/* renamed from: com.google.crypto.tink.shaded.protobuf.m */
/* loaded from: classes6.dex */
public class C18219m {

    /* renamed from: b */
    public static boolean f74178b = true;

    /* renamed from: c */
    public static volatile C18219m f74179c;

    /* renamed from: d */
    public static final C18219m f74180d = new C18219m(true);

    /* renamed from: a */
    public final Map<C18220a, AbstractC18230t.C18235e<?, ?>> f74181a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.m$a */
    /* loaded from: classes6.dex */
    public static final class C18220a {

        /* renamed from: a */
        public final Object f74182a;

        /* renamed from: b */
        public final int f74183b;

        public C18220a(Object obj, int i) {
            this.f74182a = obj;
            this.f74183b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C18220a)) {
                return false;
            }
            C18220a c18220a = (C18220a) obj;
            if (this.f74182a != c18220a.f74182a || this.f74183b != c18220a.f74183b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f74182a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f74183b;
        }
    }

    public C18219m() {
        this.f74181a = new HashMap();
    }

    /* renamed from: b */
    public static C18219m m47528b() {
        C18219m c18219m = f74179c;
        if (c18219m == null) {
            synchronized (C18219m.class) {
                c18219m = f74179c;
                if (c18219m == null) {
                    if (f74178b) {
                        c18219m = C33090Gi1.m104876a();
                    } else {
                        c18219m = f74180d;
                    }
                    f74179c = c18219m;
                }
            }
        }
        return c18219m;
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC18149F> AbstractC18230t.C18235e<ContainingType, ?> m47529a(ContainingType containingtype, int i) {
        return (AbstractC18230t.C18235e<ContainingType, ?>) this.f74181a.get(new C18220a(containingtype, i));
    }

    public C18219m(boolean z) {
        this.f74181a = Collections.emptyMap();
    }
}
