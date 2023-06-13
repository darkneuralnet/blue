package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
/* renamed from: i99  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42557i99 extends C32826Fe7 {
    public C42557i99(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    /* renamed from: e5 */
    public final void m34389e5(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, Dh9 dh9) throws RemoteException {
        Parcel m106773c5 = m106773c5();
        MP7.m95309c(m106773c5, isReadyToPayRequest);
        MP7.m95309c(m106773c5, bundle);
        MP7.m95308d(m106773c5, dh9);
        m106772d5(14, m106773c5);
    }

    /* renamed from: f5 */
    public final void m34388f5(PaymentDataRequest paymentDataRequest, Bundle bundle, Dh9 dh9) throws RemoteException {
        Parcel m106773c5 = m106773c5();
        MP7.m95309c(m106773c5, paymentDataRequest);
        MP7.m95309c(m106773c5, bundle);
        MP7.m95308d(m106773c5, dh9);
        m106772d5(19, m106773c5);
    }
}
