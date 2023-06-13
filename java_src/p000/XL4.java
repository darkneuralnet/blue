package p000;

import java.io.File;
import java.util.List;
import p000.IS0;
import p000.JS0;
import p000.WU2;
/* renamed from: XL4 */
/* loaded from: classes5.dex */
public class XL4 implements JS0, IS0.InterfaceC3534a<Object> {

    /* renamed from: b */
    public final JS0.InterfaceC4085a f42996b;

    /* renamed from: c */
    public final C46305oV0<?> f42997c;

    /* renamed from: d */
    public int f42998d;

    /* renamed from: e */
    public int f42999e = -1;

    /* renamed from: f */
    public InterfaceC38133ak2 f43000f;

    /* renamed from: g */
    public List<WU2<File, ?>> f43001g;

    /* renamed from: h */
    public int f43002h;

    /* renamed from: i */
    public volatile WU2.C9060a<?> f43003i;

    /* renamed from: j */
    public File f43004j;

    /* renamed from: k */
    public YL4 f43005k;

    public XL4(C46305oV0<?> c46305oV0, JS0.InterfaceC4085a interfaceC4085a) {
        this.f42997c = c46305oV0;
        this.f42996b = interfaceC4085a;
    }

    /* renamed from: a */
    public final boolean m77100a() {
        return this.f43002h < this.f43001g.size();
    }

    @Override // p000.JS0
    /* renamed from: b */
    public boolean mo77099b() {
        NC1.m94206a("ResourceCacheGenerator.startNext");
        try {
            List<InterfaceC38133ak2> m20982c = this.f42997c.m20982c();
            boolean z = false;
            if (m20982c.isEmpty()) {
                return false;
            }
            List<Class<?>> m20972m = this.f42997c.m20972m();
            if (m20972m.isEmpty()) {
                if (File.class.equals(this.f42997c.m20967r())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f42997c.m20976i() + " to " + this.f42997c.m20967r());
            }
            while (true) {
                if (this.f43001g != null && m77100a()) {
                    this.f43003i = null;
                    while (!z && m77100a()) {
                        List<WU2<File, ?>> list = this.f43001g;
                        int i = this.f43002h;
                        this.f43002h = i + 1;
                        this.f43003i = list.get(i).mo19951b(this.f43004j, this.f42997c.m20965t(), this.f42997c.m20979f(), this.f42997c.m20974k());
                        if (this.f43003i != null && this.f42997c.m20964u(this.f43003i.f41160c.mo6834a())) {
                            this.f43003i.f41160c.mo19946e(this.f42997c.m20973l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i2 = this.f42999e + 1;
                this.f42999e = i2;
                if (i2 >= m20972m.size()) {
                    int i3 = this.f42998d + 1;
                    this.f42998d = i3;
                    if (i3 >= m20982c.size()) {
                        return false;
                    }
                    this.f42999e = 0;
                }
                InterfaceC38133ak2 interfaceC38133ak2 = m20982c.get(this.f42998d);
                Class<?> cls = m20972m.get(this.f42999e);
                this.f43005k = new YL4(this.f42997c.m20983b(), interfaceC38133ak2, this.f42997c.m20969p(), this.f42997c.m20965t(), this.f42997c.m20979f(), this.f42997c.m20966s(cls), cls, this.f42997c.m20974k());
                File mo1853a = this.f42997c.m20981d().mo1853a(this.f43005k);
                this.f43004j = mo1853a;
                if (mo1853a != null) {
                    this.f43000f = interfaceC38133ak2;
                    this.f43001g = this.f42997c.m20975j(mo1853a);
                    this.f43002h = 0;
                }
            }
        } finally {
            NC1.m94202e();
        }
    }

    @Override // p000.IS0.InterfaceC3534a
    /* renamed from: c */
    public void mo77098c(Object obj) {
        this.f42996b.mo15879c(this.f43000f, obj, this.f43003i.f41160c, ZS0.RESOURCE_DISK_CACHE, this.f43005k);
    }

    @Override // p000.JS0
    public void cancel() {
        WU2.C9060a<?> c9060a = this.f43003i;
        if (c9060a != null) {
            c9060a.f41160c.cancel();
        }
    }

    @Override // p000.IS0.InterfaceC3534a
    /* renamed from: d */
    public void mo77097d(Exception exc) {
        this.f42996b.mo15881a(this.f43005k, exc, this.f43003i.f41160c, ZS0.RESOURCE_DISK_CACHE);
    }
}
