package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f54275a = (IconCompat) versionedParcel.m65753v(remoteActionCompat.f54275a, 1);
        remoteActionCompat.f54276b = versionedParcel.m65763l(remoteActionCompat.f54276b, 2);
        remoteActionCompat.f54277c = versionedParcel.m65763l(remoteActionCompat.f54277c, 3);
        remoteActionCompat.f54278d = (PendingIntent) versionedParcel.m65757r(remoteActionCompat.f54278d, 4);
        remoteActionCompat.f54279e = versionedParcel.m65767h(remoteActionCompat.f54279e, 5);
        remoteActionCompat.f54280f = versionedParcel.m65767h(remoteActionCompat.f54280f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.m65751x(false, false);
        versionedParcel.m65776M(remoteActionCompat.f54275a, 1);
        versionedParcel.m65785D(remoteActionCompat.f54276b, 2);
        versionedParcel.m65785D(remoteActionCompat.f54277c, 3);
        versionedParcel.m65781H(remoteActionCompat.f54278d, 4);
        versionedParcel.m65749z(remoteActionCompat.f54279e, 5);
        versionedParcel.m65749z(remoteActionCompat.f54280f, 6);
    }
}
