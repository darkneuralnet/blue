package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.C31583zt;
/* renamed from: Jg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC33774Jg1 {

    /* renamed from: Jg1$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC4179a {
        /* renamed from: a */
        public final AbstractC4179a m100035a(String str, int i) {
            mo180e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final AbstractC4179a m100034b(String str, long j) {
            mo180e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final AbstractC4179a m100033c(String str, String str2) {
            mo180e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC33774Jg1 mo181d();

        /* renamed from: e */
        public abstract Map<String, String> mo180e();

        /* renamed from: f */
        public abstract AbstractC4179a mo179f(Map<String, String> map);

        /* renamed from: g */
        public abstract AbstractC4179a mo178g(Integer num);

        /* renamed from: h */
        public abstract AbstractC4179a mo177h(C43989kb1 c43989kb1);

        /* renamed from: i */
        public abstract AbstractC4179a mo176i(long j);

        /* renamed from: j */
        public abstract AbstractC4179a mo175j(String str);

        /* renamed from: k */
        public abstract AbstractC4179a mo174k(long j);
    }

    /* renamed from: a */
    public static AbstractC4179a m100041a() {
        return new C31583zt.C31585b().mo179f(new HashMap());
    }

    /* renamed from: b */
    public final String m100040b(String str) {
        String str2 = mo187c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo187c();

    /* renamed from: d */
    public abstract Integer mo186d();

    /* renamed from: e */
    public abstract C43989kb1 mo185e();

    /* renamed from: f */
    public abstract long mo184f();

    /* renamed from: g */
    public final int m100039g(String str) {
        String str2 = mo187c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m100038h(String str) {
        String str2 = mo187c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m100037i() {
        return Collections.unmodifiableMap(mo187c());
    }

    /* renamed from: j */
    public abstract String mo183j();

    /* renamed from: k */
    public abstract long mo182k();

    /* renamed from: l */
    public AbstractC4179a m100036l() {
        return new C31583zt.C31585b().mo175j(mo183j()).mo178g(mo186d()).mo177h(mo185e()).mo176i(mo184f()).mo174k(mo182k()).mo179f(new HashMap(mo187c()));
    }
}
