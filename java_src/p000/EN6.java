package p000;

import android.os.Bundle;
import android.os.RemoteException;
/* renamed from: EN6 */
/* loaded from: classes6.dex */
public class EN6<T> extends AbstractBinderC39079cK6 {

    /* renamed from: a */
    public final C42061hK6 f7391a;

    /* renamed from: b */
    public final C37929aO6<T> f7392b;

    /* renamed from: c */
    public final /* synthetic */ YN6 f7393c;

    public EN6(YN6 yn6, C42061hK6 c42061hK6, C37929aO6<T> c37929aO6) {
        this.f7393c = yn6;
        this.f7391a = c42061hK6;
        this.f7392b = c37929aO6;
    }

    @Override // p000.InterfaceC40282eK6
    /* renamed from: b */
    public void mo43029b(Bundle bundle) throws RemoteException {
        this.f7393c.f45805a.m1532b();
        this.f7391a.m36535d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
