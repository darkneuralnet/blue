package p000;

import android.content.Context;
import p000.InterfaceC32531Dy0;
/* renamed from: LW0 */
/* loaded from: classes5.dex */
public final class LW0 implements InterfaceC32531Dy0 {

    /* renamed from: b */
    public final Context f21619b;

    /* renamed from: c */
    public final InterfaceC32531Dy0.InterfaceC1677a f21620c;

    public LW0(Context context, InterfaceC32531Dy0.InterfaceC1677a interfaceC1677a) {
        this.f21619b = context.getApplicationContext();
        this.f21620c = interfaceC1677a;
    }

    /* renamed from: a */
    public final void m96720a() {
        C49094tB5.m12919a(this.f21619b).m12916d(this.f21620c);
    }

    /* renamed from: b */
    public final void m96719b() {
        C49094tB5.m12919a(this.f21619b).m12915e(this.f21620c);
    }

    @Override // p000.InterfaceC32227Cq2
    public void onDestroy() {
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStart() {
        m96720a();
    }

    @Override // p000.InterfaceC32227Cq2
    public void onStop() {
        m96719b();
    }
}
