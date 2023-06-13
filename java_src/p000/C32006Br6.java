package p000;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Landroid/content/Context;", "Landroidx/activity/ComponentActivity;", C17296a.f69688o, "android-view-lifecycle_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Br6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32006Br6 {
    /* renamed from: a */
    public static final ComponentActivity m113432a(Context context) {
        ComponentActivity componentActivity;
        ContextWrapper contextWrapper;
        Context baseContext;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof ComponentActivity) {
            componentActivity = (ComponentActivity) context;
        } else {
            componentActivity = null;
        }
        if (componentActivity == null) {
            if (context instanceof ContextWrapper) {
                contextWrapper = (ContextWrapper) context;
            } else {
                contextWrapper = null;
            }
            if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
                return null;
            }
            return m113432a(baseContext);
        }
        return componentActivity;
    }
}
