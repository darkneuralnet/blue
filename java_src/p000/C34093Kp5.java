package p000;

import android.app.Activity;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Landroid/app/Activity;", "", "keepScreenOn", "", C17296a.f69688o, "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Kp5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34093Kp5 {
    /* renamed from: a */
    public static final void m98261a(Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (z) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
    }
}
