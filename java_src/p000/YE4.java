package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, m28432d2 = {"Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "colorRes", C17296a.f69688o, "repair_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: YE4 */
/* loaded from: classes3.dex */
public final class YE4 {
    /* renamed from: a */
    public static final Drawable m75392a(Drawable drawable, Context context, int i) {
        Drawable m90834r = P61.m90834r(drawable);
        Intrinsics.checkNotNullExpressionValue(m90834r, "wrap(this)");
        m90834r.setTint(NA0.m94301c(context, i));
        return m90834r;
    }
}
