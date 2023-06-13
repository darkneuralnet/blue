package p000;

import android.util.Range;
import android.util.Size;
/* renamed from: jp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43541jp6 implements InterfaceC42355hp6 {

    /* renamed from: a */
    public final InterfaceC42355hp6 f93409a;

    /* renamed from: b */
    public final Range<Integer> f93410b;

    /* renamed from: c */
    public final Range<Integer> f93411c;

    public C43541jp6(InterfaceC42355hp6 interfaceC42355hp6) {
        this.f93409a = interfaceC42355hp6;
        int mo29867h = interfaceC42355hp6.mo29867h();
        this.f93410b = Range.create(Integer.valueOf(mo29867h), Integer.valueOf(((int) Math.ceil(4096.0d / mo29867h)) * mo29867h));
        int mo29869f = interfaceC42355hp6.mo29869f();
        this.f93411c = Range.create(Integer.valueOf(mo29869f), Integer.valueOf(((int) Math.ceil(2160.0d / mo29869f)) * mo29869f));
    }

    /* renamed from: i */
    public static InterfaceC42355hp6 m29866i(InterfaceC42355hp6 interfaceC42355hp6, Size size) {
        boolean z = false;
        if (!(interfaceC42355hp6 instanceof C43541jp6)) {
            if (Q21.m89097a(C46846pP2.class) == null) {
                if (size != null && !interfaceC42355hp6.mo29868g(size.getWidth(), size.getHeight())) {
                    C33928Jx2.m99522l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, interfaceC42355hp6.mo29871d(), interfaceC42355hp6.mo29870e()));
                }
            }
            z = true;
        }
        if (z) {
            return new C43541jp6(interfaceC42355hp6);
        }
        return interfaceC42355hp6;
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: a */
    public Range<Integer> mo29874a(int i) {
        boolean z;
        if (this.f93411c.contains((Range<Integer>) Integer.valueOf(i)) && i % this.f93409a.mo29869f() == 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Not supported height: " + i + " which is not in " + this.f93411c + " or can not be divided by alignment " + this.f93409a.mo29869f());
        return this.f93410b;
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: b */
    public Range<Integer> mo29873b() {
        return this.f93409a.mo29873b();
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: c */
    public Range<Integer> mo29872c(int i) {
        boolean z;
        if (this.f93410b.contains((Range<Integer>) Integer.valueOf(i)) && i % this.f93409a.mo29867h() == 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Not supported width: " + i + " which is not in " + this.f93410b + " or can not be divided by alignment " + this.f93409a.mo29867h());
        return this.f93411c;
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: d */
    public Range<Integer> mo29871d() {
        return this.f93410b;
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: e */
    public Range<Integer> mo29870e() {
        return this.f93411c;
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: f */
    public int mo29869f() {
        return this.f93409a.mo29869f();
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: g */
    public boolean mo29868g(int i, int i2) {
        if (this.f93410b.contains((Range<Integer>) Integer.valueOf(i)) && this.f93411c.contains((Range<Integer>) Integer.valueOf(i2)) && i % this.f93409a.mo29867h() == 0 && i2 % this.f93409a.mo29869f() == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC42355hp6
    /* renamed from: h */
    public int mo29867h() {
        return this.f93409a.mo29867h();
    }
}
