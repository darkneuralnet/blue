package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: xj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51775xj0 {

    /* renamed from: a */
    public final QT8 f118011a;

    public C51775xj0(QT8 qt8) {
        this.f118011a = (QT8) Preconditions.checkNotNull(qt8);
    }

    /* renamed from: a */
    public void m4797a(LatLng latLng) {
        try {
            Preconditions.checkNotNull(latLng, "center must not be null.");
            this.f118011a.mo21412h4(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public void m4796b(double d) {
        try {
            this.f118011a.mo21411s1(d);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C51775xj0)) {
            return false;
        }
        try {
            return this.f118011a.mo21410v0(((C51775xj0) obj).f118011a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f118011a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
