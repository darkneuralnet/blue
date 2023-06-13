package p000;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, m28432d2 = {"LgV5;", "", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", C17296a.f69688o, "Landroid/app/ActivityManager;", "activityManager", "", "b", "<init>", "()V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: gV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41566gV5 {

    /* renamed from: a */
    public static final C41566gV5 f82368a = new C41566gV5();

    private C41566gV5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Uri m39241a(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m39240b(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
