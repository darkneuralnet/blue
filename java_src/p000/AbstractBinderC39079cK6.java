package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: cK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39079cK6 extends BinderC44469lO6 implements InterfaceC40282eK6 {
    public AbstractBinderC39079cK6() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // p000.BinderC44469lO6
    /* renamed from: c5 */
    public final boolean mo27338c5(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo43029b((Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
