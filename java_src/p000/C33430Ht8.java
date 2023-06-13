package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.C17477a;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* renamed from: Ht8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33430Ht8 extends BaseImplementation.ApiMethodImpl<Status, C45001mH8> {

    /* renamed from: a */
    public final zze f14149a;

    public C33430Ht8(zze zzeVar, GoogleApiClient googleApiClient) {
        super(C17477a.f70292p, googleApiClient);
        this.f14149a = zzeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(C45001mH8 c45001mH8) throws RemoteException {
        C45001mH8 c45001mH82 = c45001mH8;
        JA8 ja8 = new JA8(this);
        try {
            zze zzeVar = this.f14149a;
            zzeVar.getClass();
            C35536Qt8 c35536Qt8 = zzeVar.f70334j;
            int m88004f = c35536Qt8.m88004f();
            byte[] bArr = new byte[m88004f];
            C35464Ql8.m88005e(c35536Qt8, bArr, 0, m88004f);
            zzeVar.f70327c = bArr;
            ((InterfaceC38942c59) c45001mH82.getService()).mo1737D(ja8, this.f14149a);
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            setFailedResult(new Status(10, "MessageProducer"));
        }
    }
}
