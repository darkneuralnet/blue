package p000;

import java.io.File;
import java.util.List;
import p000.IS0;
import p000.JS0;
import p000.WU2;
/* renamed from: BS0 */
/* loaded from: classes5.dex */
public class BS0 implements JS0, IS0.InterfaceC3534a<Object> {

    /* renamed from: b */
    public final List<InterfaceC38133ak2> f2327b;

    /* renamed from: c */
    public final C46305oV0<?> f2328c;

    /* renamed from: d */
    public final JS0.InterfaceC4085a f2329d;

    /* renamed from: e */
    public int f2330e;

    /* renamed from: f */
    public InterfaceC38133ak2 f2331f;

    /* renamed from: g */
    public List<WU2<File, ?>> f2332g;

    /* renamed from: h */
    public int f2333h;

    /* renamed from: i */
    public volatile WU2.C9060a<?> f2334i;

    /* renamed from: j */
    public File f2335j;

    public BS0(C46305oV0<?> c46305oV0, JS0.InterfaceC4085a interfaceC4085a) {
        this(c46305oV0.m20982c(), c46305oV0, interfaceC4085a);
    }

    /* renamed from: a */
    public final boolean m114034a() {
        return this.f2333h < this.f2332g.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (m114034a() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r7.f2332g;
        r3 = r7.f2333h;
        r7.f2333h = r3 + 1;
        r7.f2334i = r0.get(r3).mo19951b(r7.f2335j, r7.f2328c.m20965t(), r7.f2328c.m20979f(), r7.f2328c.m20974k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r7.f2334i == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r7.f2328c.m20964u(r7.f2334i.f41160c.mo6834a()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.f2334i.f41160c.mo19946e(r7.f2328c.m20973l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r7.f2334i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r1 != false) goto L30;
     */
    @Override // p000.JS0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo77099b() {
        NC1.m94206a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f2332g != null && m114034a()) {
                    break;
                }
                int i = this.f2330e + 1;
                this.f2330e = i;
                if (i >= this.f2327b.size()) {
                    return false;
                }
                InterfaceC38133ak2 interfaceC38133ak2 = this.f2327b.get(this.f2330e);
                File mo1853a = this.f2328c.m20981d().mo1853a(new CS0(interfaceC38133ak2, this.f2328c.m20969p()));
                this.f2335j = mo1853a;
                if (mo1853a != null) {
                    this.f2331f = interfaceC38133ak2;
                    this.f2332g = this.f2328c.m20975j(mo1853a);
                    this.f2333h = 0;
                }
            } finally {
                NC1.m94202e();
            }
        }
    }

    @Override // p000.IS0.InterfaceC3534a
    /* renamed from: c */
    public void mo77098c(Object obj) {
        this.f2329d.mo15879c(this.f2331f, obj, this.f2334i.f41160c, ZS0.DATA_DISK_CACHE, this.f2331f);
    }

    @Override // p000.JS0
    public void cancel() {
        WU2.C9060a<?> c9060a = this.f2334i;
        if (c9060a != null) {
            c9060a.f41160c.cancel();
        }
    }

    @Override // p000.IS0.InterfaceC3534a
    /* renamed from: d */
    public void mo77097d(Exception exc) {
        this.f2329d.mo15881a(this.f2331f, exc, this.f2334i.f41160c, ZS0.DATA_DISK_CACHE);
    }

    public BS0(List<InterfaceC38133ak2> list, C46305oV0<?> c46305oV0, JS0.InterfaceC4085a interfaceC4085a) {
        this.f2330e = -1;
        this.f2327b = list;
        this.f2328c = c46305oV0;
        this.f2329d = interfaceC4085a;
    }
}
