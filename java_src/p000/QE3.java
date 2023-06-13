package p000;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.share.internal.C17296a;
/* renamed from: QE3 */
/* loaded from: classes.dex */
public class QE3 {
    private QE3() {
    }

    /* renamed from: a */
    public static <T extends InterfaceC33149Go6> T m88709a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).m65791a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    /* renamed from: b */
    public static <T extends InterfaceC33149Go6> T m88708b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(QE3.class.getClassLoader());
            return (T) m88709a(bundle2.getParcelable(C17296a.f69688o));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
