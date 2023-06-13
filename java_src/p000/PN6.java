package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.review.ReviewInfo;
/* renamed from: PN6 */
/* loaded from: classes6.dex */
public final class PN6 extends EN6<ReviewInfo> {
    public PN6(YN6 yn6, C37929aO6 c37929aO6) {
        super(yn6, new C42061hK6("OnRequestInstallCallback"), c37929aO6);
    }

    @Override // p000.EN6, p000.InterfaceC40282eK6
    /* renamed from: b */
    public final void mo43029b(Bundle bundle) throws RemoteException {
        super.mo43029b(bundle);
        this.f7392b.m71485e(ReviewInfo.m48461b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
