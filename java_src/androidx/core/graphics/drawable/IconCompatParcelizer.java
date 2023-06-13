package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f54291a = versionedParcel.m65759p(iconCompat.f54291a, 1);
        iconCompat.f54293c = versionedParcel.m65765j(iconCompat.f54293c, 2);
        iconCompat.f54294d = versionedParcel.m65757r(iconCompat.f54294d, 3);
        iconCompat.f54295e = versionedParcel.m65759p(iconCompat.f54295e, 4);
        iconCompat.f54296f = versionedParcel.m65759p(iconCompat.f54296f, 5);
        iconCompat.f54297g = (ColorStateList) versionedParcel.m65757r(iconCompat.f54297g, 6);
        iconCompat.f54299i = versionedParcel.m65755t(iconCompat.f54299i, 7);
        iconCompat.f54300j = versionedParcel.m65755t(iconCompat.f54300j, 8);
        iconCompat.m67692o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.m65751x(true, true);
        iconCompat.m67691p(versionedParcel.m65769f());
        int i = iconCompat.f54291a;
        if (-1 != i) {
            versionedParcel.m65783F(i, 1);
        }
        byte[] bArr = iconCompat.f54293c;
        if (bArr != null) {
            versionedParcel.m65787B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f54294d;
        if (parcelable != null) {
            versionedParcel.m65781H(parcelable, 3);
        }
        int i2 = iconCompat.f54295e;
        if (i2 != 0) {
            versionedParcel.m65783F(i2, 4);
        }
        int i3 = iconCompat.f54296f;
        if (i3 != 0) {
            versionedParcel.m65783F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f54297g;
        if (colorStateList != null) {
            versionedParcel.m65781H(colorStateList, 6);
        }
        String str = iconCompat.f54299i;
        if (str != null) {
            versionedParcel.m65779J(str, 7);
        }
        String str2 = iconCompat.f54300j;
        if (str2 != null) {
            versionedParcel.m65779J(str2, 8);
        }
    }
}
