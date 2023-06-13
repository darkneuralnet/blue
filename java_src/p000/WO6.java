package p000;

import android.content.Context;
import android.content.Intent;
/* renamed from: WO6 */
/* loaded from: classes6.dex */
public final class WO6 implements UM6 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC39114cO5 f40952a;

    /* renamed from: b */
    public final /* synthetic */ Intent f40953b;

    /* renamed from: c */
    public final /* synthetic */ Context f40954c;

    /* renamed from: d */
    public final /* synthetic */ C39124cP6 f40955d;

    public WO6(C39124cP6 c39124cP6, AbstractC39114cO5 abstractC39114cO5, Intent intent, Context context) {
        this.f40955d = c39124cP6;
        this.f40952a = abstractC39114cO5;
        this.f40953b = intent;
        this.f40954c = context;
    }

    @Override // p000.UM6
    /* renamed from: a */
    public final void mo78494a() {
        r0.f60548g.post(new ZO6(this.f40955d, this.f40952a, 5, 0));
    }

    @Override // p000.UM6
    /* renamed from: b */
    public final void mo78492b() {
        C42061hK6 c42061hK6;
        if (this.f40953b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            c42061hK6 = this.f40955d.f38875a;
            c42061hK6.m36537b("Splits copied and verified more than once.", new Object[0]);
            return;
        }
        this.f40953b.putExtra("triggered_from_app_after_verification", true);
        this.f40954c.sendBroadcast(this.f40953b);
    }

    @Override // p000.UM6
    /* renamed from: a */
    public final void mo78493a(int i) {
        r0.f60548g.post(new ZO6(this.f40955d, this.f40952a, 6, i));
    }
}
