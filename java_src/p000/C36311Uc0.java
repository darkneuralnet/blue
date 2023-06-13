package p000;

import android.graphics.Typeface;
/* renamed from: Uc0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36311Uc0 extends P06 {

    /* renamed from: a */
    public final Typeface f37661a;

    /* renamed from: b */
    public final InterfaceC8332a f37662b;

    /* renamed from: c */
    public boolean f37663c;

    /* renamed from: Uc0$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC8332a {
        /* renamed from: a */
        void mo76376a(Typeface typeface);
    }

    public C36311Uc0(InterfaceC8332a interfaceC8332a, Typeface typeface) {
        this.f37661a = typeface;
        this.f37662b = interfaceC8332a;
    }

    @Override // p000.P06
    /* renamed from: a */
    public void mo49941a(int i) {
        m81266d(this.f37661a);
    }

    @Override // p000.P06
    /* renamed from: b */
    public void mo49940b(Typeface typeface, boolean z) {
        m81266d(typeface);
    }

    /* renamed from: c */
    public void m81267c() {
        this.f37663c = true;
    }

    /* renamed from: d */
    public final void m81266d(Typeface typeface) {
        if (!this.f37663c) {
            this.f37662b.mo76376a(typeface);
        }
    }
}
