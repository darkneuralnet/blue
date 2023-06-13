package com.google.protobuf;

import com.google.protobuf.AbstractC18536r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
/* renamed from: com.google.protobuf.k */
/* loaded from: classes6.dex */
public class C18525k {

    /* renamed from: b */
    public static boolean f74834b = true;

    /* renamed from: c */
    public static volatile C18525k f74835c;

    /* renamed from: d */
    public static final C18525k f74836d = new C18525k(true);

    /* renamed from: a */
    public final Map<C18526a, AbstractC18536r.C18541e<?, ?>> f74837a;

    /* renamed from: com.google.protobuf.k$a */
    /* loaded from: classes6.dex */
    public static final class C18526a {

        /* renamed from: a */
        public final Object f74838a;

        /* renamed from: b */
        public final int f74839b;

        public C18526a(Object obj, int i) {
            this.f74838a = obj;
            this.f74839b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C18526a)) {
                return false;
            }
            C18526a c18526a = (C18526a) obj;
            if (this.f74838a != c18526a.f74838a || this.f74839b != c18526a.f74839b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f74838a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f74839b;
        }
    }

    public C18525k() {
        this.f74837a = new HashMap();
    }

    /* renamed from: b */
    public static C18525k m46121b() {
        C18525k c18525k = f74835c;
        if (c18525k == null) {
            synchronized (C18525k.class) {
                c18525k = f74835c;
                if (c18525k == null) {
                    if (f74834b) {
                        c18525k = C32856Fi1.m106738a();
                    } else {
                        c18525k = f74836d;
                    }
                    f74835c = c18525k;
                }
            }
        }
        return c18525k;
    }

    /* renamed from: a */
    public <ContainingType extends InterfaceC18462D> AbstractC18536r.C18541e<ContainingType, ?> m46122a(ContainingType containingtype, int i) {
        return (AbstractC18536r.C18541e<ContainingType, ?>) this.f74837a.get(new C18526a(containingtype, i));
    }

    public C18525k(boolean z) {
        this.f74837a = Collections.emptyMap();
    }
}
