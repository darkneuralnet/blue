package p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.util.TypedValue;
/* renamed from: Ri6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35669Ri6 {
    @TargetApi(17)
    /* renamed from: a */
    public static boolean m86426a(Resources resources) {
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: b */
    public static int m86425b(Resources resources, float f) {
        return (int) (f * resources.getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static int m86424c(Resources resources, float f) {
        return (int) TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }
}
