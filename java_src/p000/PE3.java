package p000;

import android.os.Parcel;
import com.adyen.checkout.core.exception.NoConstructorException;
/* renamed from: PE3 */
/* loaded from: classes.dex */
public final class PE3 {
    private PE3() {
        throw new NoConstructorException();
    }

    /* renamed from: a */
    public static boolean m90552a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    /* renamed from: b */
    public static void m90551b(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
