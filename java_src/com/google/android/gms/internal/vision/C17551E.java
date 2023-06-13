package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
/* renamed from: com.google.android.gms.internal.vision.E */
/* loaded from: classes6.dex */
public class C17551E {

    /* renamed from: b */
    public static volatile C17551E f71216b;

    /* renamed from: c */
    public static volatile C17551E f71217c;

    /* renamed from: d */
    public static final C17551E f71218d = new C17551E(true);

    /* renamed from: a */
    public final Map<C17552a, AbstractC17554G.C17558d<?, ?>> f71219a;

    /* renamed from: com.google.android.gms.internal.vision.E$a */
    /* loaded from: classes6.dex */
    public static final class C17552a {

        /* renamed from: a */
        public final Object f71220a;

        /* renamed from: b */
        public final int f71221b;

        public C17552a(Object obj, int i) {
            this.f71220a = obj;
            this.f71221b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17552a)) {
                return false;
            }
            C17552a c17552a = (C17552a) obj;
            if (this.f71220a != c17552a.f71220a || this.f71221b != c17552a.f71221b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f71220a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f71221b;
        }
    }

    public C17551E() {
        this.f71219a = new HashMap();
    }

    /* renamed from: b */
    public static C17551E m50997b() {
        C17551E c17551e = f71216b;
        if (c17551e == null) {
            synchronized (C17551E.class) {
                c17551e = f71216b;
                if (c17551e == null) {
                    c17551e = f71218d;
                    f71216b = c17551e;
                }
            }
        }
        return c17551e;
    }

    /* renamed from: c */
    public static C17551E m50996c() {
        C17551E c17551e = f71217c;
        if (c17551e != null) {
            return c17551e;
        }
        synchronized (C17551E.class) {
            C17551E c17551e2 = f71217c;
            if (c17551e2 != null) {
                return c17551e2;
            }
            C17551E m3731b = AbstractC52106yG8.m3731b(C17551E.class);
            f71217c = m3731b;
            return m3731b;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends InterfaceC44489lQ8> AbstractC17554G.C17558d<ContainingType, ?> m50998a(ContainingType containingtype, int i) {
        return (AbstractC17554G.C17558d<ContainingType, ?>) this.f71219a.get(new C17552a(containingtype, i));
    }

    public C17551E(boolean z) {
        this.f71219a = Collections.emptyMap();
    }
}
