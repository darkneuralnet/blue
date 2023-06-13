package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: Y70 */
/* loaded from: classes.dex */
public interface Y70 {

    /* renamed from: Y70$a */
    /* loaded from: classes.dex */
    public static class C9639a {

        /* renamed from: a */
        public byte[] f44574a;

        /* renamed from: b */
        public String f44575b;

        /* renamed from: c */
        public long f44576c;

        /* renamed from: d */
        public long f44577d;

        /* renamed from: e */
        public long f44578e;

        /* renamed from: f */
        public long f44579f;

        /* renamed from: g */
        public Map<String, String> f44580g = Collections.emptyMap();

        /* renamed from: h */
        public List<AH1> f44581h;

        /* renamed from: a */
        public boolean m75667a() {
            return m75666b(System.currentTimeMillis());
        }

        /* renamed from: b */
        public boolean m75666b(long j) {
            return this.f44578e < j;
        }

        /* renamed from: c */
        public boolean m75665c(long j) {
            return this.f44579f < j;
        }
    }

    /* renamed from: c */
    void mo4203c();

    /* renamed from: d */
    void mo4202d(String str, boolean z);

    /* renamed from: e */
    void mo4201e(String str, C9639a c9639a);

    C9639a get(String str);
}
