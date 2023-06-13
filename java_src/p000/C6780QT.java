package p000;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: QT */
/* loaded from: classes6.dex */
public final class C6780QT {

    /* renamed from: a */
    public static MA8 f30410a;

    private C6780QT() {
    }

    /* renamed from: a */
    public static C6378PT m88495a(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap, "image must not be null");
        try {
            return new C6378PT(m88492d().mo95612K(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static C6378PT m88494b(int i) {
        try {
            return new C6378PT(m88492d().mo95611i(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public static void m88493c(MA8 ma8) {
        if (f30410a != null) {
            return;
        }
        f30410a = (MA8) Preconditions.checkNotNull(ma8, "delegate must not be null");
    }

    /* renamed from: d */
    public static MA8 m88492d() {
        return (MA8) Preconditions.checkNotNull(f30410a, "IBitmapDescriptorFactory is not initialized");
    }
}
