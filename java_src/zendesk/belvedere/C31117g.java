package zendesk.belvedere;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.C31103c;
import zendesk.belvedere.C31106d;
/* renamed from: zendesk.belvedere.g */
/* loaded from: classes8.dex */
public class C31117g {

    /* renamed from: a */
    public final XX1 f121850a;

    /* renamed from: b */
    public final InterfaceC31116f f121851b;

    /* renamed from: c */
    public final C31098b f121852c;

    /* renamed from: d */
    public final C31103c.InterfaceC31105b f121853d = new C31120c();

    /* renamed from: zendesk.belvedere.g$a */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC31118a implements View.OnClickListener {
        public View$OnClickListenerC31118a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C31117g.this.f121851b.mo688i(C31117g.this.f121850a.mo717g(), C31117g.this.f121852c);
        }
    }

    /* renamed from: zendesk.belvedere.g$b */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC31119b implements View.OnClickListener {
        public View$OnClickListenerC31119b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C31117g.this.f121851b.mo688i(C31117g.this.f121850a.mo712l(), C31117g.this.f121852c);
        }
    }

    /* renamed from: zendesk.belvedere.g$c */
    /* loaded from: classes8.dex */
    public class C31120c implements C31103c.InterfaceC31105b {
        public C31120c() {
        }

        @Override // zendesk.belvedere.C31103c.InterfaceC31105b
        /* renamed from: a */
        public boolean mo698a(C31106d.AbstractC31108b abstractC31108b) {
            MediaResult m733d = abstractC31108b.m733d();
            long mo716h = C31117g.this.f121850a.mo716h();
            if ((m733d != null && m733d.m780i() <= mo716h) || mo716h == -1) {
                abstractC31108b.m731f(!abstractC31108b.m732e());
                List m699k = C31117g.this.m699k(m733d, abstractC31108b.m732e());
                C31117g.this.f121851b.mo692e(m699k.size());
                C31117g.this.f121851b.mo691f(m699k.size());
                ArrayList arrayList = new ArrayList();
                arrayList.add(m733d);
                if (abstractC31108b.m732e()) {
                    C31117g.this.f121852c.m752I9(arrayList);
                    return true;
                }
                C31117g.this.f121852c.m753G9(arrayList);
                return true;
            }
            C31117g.this.f121851b.mo690g(C44092kl4.belvedere_image_stream_file_too_large);
            return false;
        }

        @Override // zendesk.belvedere.C31103c.InterfaceC31105b
        /* renamed from: b */
        public void mo697b() {
            if (C31117g.this.f121850a.mo722b()) {
                C31117g.this.f121851b.mo688i(C31117g.this.f121850a.mo714j(), C31117g.this.f121852c);
            }
        }
    }

    public C31117g(XX1 xx1, InterfaceC31116f interfaceC31116f, C31098b c31098b) {
        this.f121850a = xx1;
        this.f121851b = interfaceC31116f;
        this.f121852c = c31098b;
    }

    /* renamed from: e */
    public void m705e() {
        this.f121852c.m747T9(null, null);
        this.f121852c.m749P9(0, 0, 0.0f);
        this.f121852c.m754E9();
    }

    /* renamed from: f */
    public void m704f() {
        m701i();
        m703g();
        this.f121851b.mo692e(this.f121850a.mo715i().size());
        this.f121851b.mo691f(this.f121850a.mo715i().size());
    }

    /* renamed from: g */
    public final void m703g() {
        if (this.f121850a.mo719e()) {
            this.f121851b.mo694c(new View$OnClickListenerC31118a());
        }
        if (this.f121850a.mo723a()) {
            this.f121851b.mo695b(new View$OnClickListenerC31119b());
        }
    }

    /* renamed from: h */
    public void m702h(int i, int i2, float f) {
        if (f >= 0.0f) {
            this.f121852c.m749P9(i, i2, f);
        }
    }

    /* renamed from: i */
    public final void m701i() {
        boolean z;
        if (!this.f121850a.mo720d() && !this.f121851b.mo689h()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        this.f121851b.mo693d(z2);
        this.f121851b.mo696a(this.f121850a.mo718f(), this.f121850a.mo715i(), z2, this.f121850a.mo722b(), this.f121853d);
        this.f121852c.m748S9();
    }

    /* renamed from: j */
    public void m700j() {
        this.f121852c.m751J9(this.f121850a.mo715i());
    }

    /* renamed from: k */
    public final List<MediaResult> m699k(MediaResult mediaResult, boolean z) {
        if (z) {
            return this.f121850a.mo713k(mediaResult);
        }
        return this.f121850a.mo721c(mediaResult);
    }
}
