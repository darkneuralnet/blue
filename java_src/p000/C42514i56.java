package p000;

import android.content.Context;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, m28432d2 = {"Landroid/widget/Toast;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutId", "", Entry.TYPE_TEXT, C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: i56  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42514i56 {
    /* renamed from: a */
    public static final Toast m34478a(Toast toast, Context context, int i, String text) {
        Intrinsics.checkNotNullParameter(toast, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        toast.setView(C40788fB0.m41762t(context, i, null));
        toast.setDuration(1);
        toast.setGravity(87, 0, context.getResources().getDimensionPixelSize(C37044Xf4.command_center_toast_y_offset_bottom));
        toast.setText(text);
        return toast;
    }
}
