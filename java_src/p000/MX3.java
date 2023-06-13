package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: MX3 */
/* loaded from: classes6.dex */
public final class MX3 {

    /* renamed from: a */
    public final InterfaceC32160Ci7 f23224a;

    public MX3(InterfaceC32160Ci7 interfaceC32160Ci7) {
        this.f23224a = (InterfaceC32160Ci7) Preconditions.checkNotNull(interfaceC32160Ci7);
    }

    /* renamed from: a */
    public void m95179a() {
        try {
            this.f23224a.mo93582f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MX3)) {
            return false;
        }
        try {
            return this.f23224a.mo93583D0(((MX3) obj).f23224a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f23224a.zzh();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
