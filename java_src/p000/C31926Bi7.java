package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.zzbq;
/* renamed from: Bi7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31926Bi7 extends AbstractC50004uj7 {

    /* renamed from: a */
    public final /* synthetic */ zzbq f2725a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31926Bi7(C48236rk7 c48236rk7, GoogleApiClient googleApiClient, zzbq zzbqVar) {
        super(googleApiClient);
        this.f2725a = zzbqVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(TA7 ta7) throws RemoteException {
        ta7.m84241v(this.f2725a, this);
    }
}
