package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
/* renamed from: Dh9 */
/* loaded from: classes6.dex */
public interface Dh9 extends IInterface {
    /* renamed from: L0 */
    void mo28245L0(Status status, boolean z, Bundle bundle) throws RemoteException;

    /* renamed from: N0 */
    void mo106417N0(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) throws RemoteException;

    /* renamed from: V1 */
    void mo106416V1(int i, FullWallet fullWallet, Bundle bundle) throws RemoteException;

    /* renamed from: X2 */
    void mo11176X2(Status status, PaymentData paymentData, Bundle bundle) throws RemoteException;

    /* renamed from: Y */
    void mo106415Y(int i, MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    /* renamed from: e3 */
    void mo106414e3(int i, Bundle bundle) throws RemoteException;

    /* renamed from: o2 */
    void mo28244o2(int i, boolean z, Bundle bundle) throws RemoteException;
}
