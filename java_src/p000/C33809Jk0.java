package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Jk0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33809Jk0 {

    /* renamed from: e */
    public static final C33809Jk0 f18096e = new C4215a().m99893b();

    /* renamed from: a */
    public final C47248q46 f18097a;

    /* renamed from: b */
    public final List<C48953sx2> f18098b;

    /* renamed from: c */
    public final SC1 f18099c;

    /* renamed from: d */
    public final String f18100d;

    /* renamed from: Jk0$a */
    /* loaded from: classes5.dex */
    public static final class C4215a {

        /* renamed from: a */
        public C47248q46 f18101a = null;

        /* renamed from: b */
        public List<C48953sx2> f18102b = new ArrayList();

        /* renamed from: c */
        public SC1 f18103c = null;

        /* renamed from: d */
        public String f18104d = "";

        /* renamed from: a */
        public C4215a m99894a(C48953sx2 c48953sx2) {
            this.f18102b.add(c48953sx2);
            return this;
        }

        /* renamed from: b */
        public C33809Jk0 m99893b() {
            return new C33809Jk0(this.f18101a, Collections.unmodifiableList(this.f18102b), this.f18103c, this.f18104d);
        }

        /* renamed from: c */
        public C4215a m99892c(String str) {
            this.f18104d = str;
            return this;
        }

        /* renamed from: d */
        public C4215a m99891d(SC1 sc1) {
            this.f18103c = sc1;
            return this;
        }

        /* renamed from: e */
        public C4215a m99890e(C47248q46 c47248q46) {
            this.f18101a = c47248q46;
            return this;
        }
    }

    public C33809Jk0(C47248q46 c47248q46, List<C48953sx2> list, SC1 sc1, String str) {
        this.f18097a = c47248q46;
        this.f18098b = list;
        this.f18099c = sc1;
        this.f18100d = str;
    }

    /* renamed from: e */
    public static C4215a m99896e() {
        return new C4215a();
    }

    @K94(tag = 4)
    /* renamed from: a */
    public String m99900a() {
        return this.f18100d;
    }

    @K94(tag = 3)
    /* renamed from: b */
    public SC1 m99899b() {
        return this.f18099c;
    }

    @K94(tag = 2)
    /* renamed from: c */
    public List<C48953sx2> m99898c() {
        return this.f18098b;
    }

    @K94(tag = 1)
    /* renamed from: d */
    public C47248q46 m99897d() {
        return this.f18097a;
    }

    /* renamed from: f */
    public byte[] m99895f() {
        return E94.m109340a(this);
    }
}
