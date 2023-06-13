package p000;

import co.bird.android.feature.complaintresolution.ComplaintResolutionActivity;
import dagger.MembersInjector;
/* renamed from: wq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51252wq0 implements MembersInjector<ComplaintResolutionActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f116615a;

    /* renamed from: b */
    public final Y94<C22454gl> f116616b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f116617c;

    /* renamed from: d */
    public final Y94<C53041zr0> f116618d;

    /* renamed from: b */
    public static void m6273b(ComplaintResolutionActivity complaintResolutionActivity, C53041zr0 c53041zr0) {
        complaintResolutionActivity.f63684j = c53041zr0;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ComplaintResolutionActivity complaintResolutionActivity) {
        C4650Ky.m98043b(complaintResolutionActivity, this.f116615a.get());
        C4650Ky.m98042c(complaintResolutionActivity, this.f116616b.get());
        C4650Ky.m98041d(complaintResolutionActivity, this.f116617c.get());
        m6273b(complaintResolutionActivity, this.f116618d.get());
    }
}
