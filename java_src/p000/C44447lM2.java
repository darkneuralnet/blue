package p000;

import android.view.View;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.C39011cD1;
/* renamed from: lM2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44447lM2 implements C39011cD1.InterfaceC13466h, C39011cD1.InterfaceC13470l, C39011cD1.InterfaceC13471m, C39011cD1.InterfaceC13460b {

    /* renamed from: a */
    public final C39011cD1 f95910a;

    /* renamed from: b */
    public final Map<String, C25676a> f95911b = new HashMap();

    /* renamed from: c */
    public final Map<C40889fM2, C25676a> f95912c = new HashMap();

    /* renamed from: lM2$a */
    /* loaded from: classes6.dex */
    public class C25676a {

        /* renamed from: a */
        public final Set<C40889fM2> f95913a = new HashSet();

        /* renamed from: b */
        public C39011cD1.InterfaceC13466h f95914b;

        /* renamed from: c */
        public C39011cD1.InterfaceC13470l f95915c;

        /* renamed from: d */
        public C39011cD1.InterfaceC13471m f95916d;

        /* renamed from: e */
        public C39011cD1.InterfaceC13460b f95917e;

        public C25676a() {
        }

        /* renamed from: e */
        public C40889fM2 m27405e(MarkerOptions markerOptions) {
            C40889fM2 m61685c = C44447lM2.this.f95910a.m61685c(markerOptions);
            this.f95913a.add(m61685c);
            C44447lM2.this.f95912c.put(m61685c, this);
            return m61685c;
        }

        /* renamed from: f */
        public void m27404f() {
            for (C40889fM2 c40889fM2 : this.f95913a) {
                c40889fM2.m41528f();
                C44447lM2.this.f95912c.remove(c40889fM2);
            }
            this.f95913a.clear();
        }

        /* renamed from: g */
        public boolean m27403g(C40889fM2 c40889fM2) {
            if (this.f95913a.remove(c40889fM2)) {
                C44447lM2.this.f95912c.remove(c40889fM2);
                c40889fM2.m41528f();
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public void m27402h(C39011cD1.InterfaceC13466h interfaceC13466h) {
            this.f95914b = interfaceC13466h;
        }

        /* renamed from: i */
        public void m27401i(C39011cD1.InterfaceC13470l interfaceC13470l) {
            this.f95915c = interfaceC13470l;
        }
    }

    public C44447lM2(C39011cD1 c39011cD1) {
        this.f95910a = c39011cD1;
    }

    @Override // p000.C39011cD1.InterfaceC13466h
    /* renamed from: b */
    public void mo27414b(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.f95914b != null) {
            c25676a.f95914b.mo27414b(c40889fM2);
        }
    }

    @Override // p000.C39011cD1.InterfaceC13470l
    /* renamed from: c */
    public boolean mo27413c(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.f95915c != null) {
            return c25676a.f95915c.mo27413c(c40889fM2);
        }
        return false;
    }

    /* renamed from: e */
    public C25676a m27411e() {
        return new C25676a();
    }

    /* renamed from: f */
    public boolean m27410f(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.m27403g(c40889fM2)) {
            return true;
        }
        return false;
    }

    @Override // p000.C39011cD1.InterfaceC13460b
    public View getInfoContents(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.f95917e != null) {
            return c25676a.f95917e.getInfoContents(c40889fM2);
        }
        return null;
    }

    @Override // p000.C39011cD1.InterfaceC13460b
    public View getInfoWindow(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.f95917e != null) {
            return c25676a.f95917e.getInfoWindow(c40889fM2);
        }
        return null;
    }

    @Override // p000.C39011cD1.InterfaceC13471m
    public void onMarkerDrag(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.f95916d != null) {
            c25676a.f95916d.onMarkerDrag(c40889fM2);
        }
    }

    @Override // p000.C39011cD1.InterfaceC13471m
    public void onMarkerDragEnd(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.f95916d != null) {
            c25676a.f95916d.onMarkerDragEnd(c40889fM2);
        }
    }

    @Override // p000.C39011cD1.InterfaceC13471m
    public void onMarkerDragStart(C40889fM2 c40889fM2) {
        C25676a c25676a = this.f95912c.get(c40889fM2);
        if (c25676a != null && c25676a.f95916d != null) {
            c25676a.f95916d.onMarkerDragStart(c40889fM2);
        }
    }
}
