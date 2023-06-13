package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* renamed from: pK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46805pK6 extends AbstractRunnableC43247jK6 {

    /* renamed from: c */
    public final /* synthetic */ C52733zK6 f103527c;

    public C46805pK6(C52733zK6 c52733zK6) {
        this.f103527c = c52733zK6;
    }

    @Override // p000.AbstractRunnableC43247jK6
    /* renamed from: a */
    public final void mo8889a() {
        IInterface iInterface;
        C42061hK6 c42061hK6;
        Context context;
        ServiceConnection serviceConnection;
        iInterface = this.f103527c.f121109k;
        if (iInterface != null) {
            c42061hK6 = this.f103527c.f121100b;
            c42061hK6.m36535d("Unbind from service.", new Object[0]);
            context = this.f103527c.f121099a;
            serviceConnection = this.f103527c.f121108j;
            context.unbindService(serviceConnection);
            this.f103527c.f121103e = false;
            this.f103527c.f121109k = null;
            this.f103527c.f121108j = null;
        }
    }
}
