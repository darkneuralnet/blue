package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView$D;", "", "resId", "Landroid/graphics/drawable/Drawable;", "b", "", "c", "Landroid/content/Context;", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: qr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47712qr6 {
    /* renamed from: a */
    public static final Context m16904a(RecyclerView.AbstractC11834D abstractC11834D) {
        Intrinsics.checkNotNullParameter(abstractC11834D, "<this>");
        Context context = abstractC11834D.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
        return context;
    }

    /* renamed from: b */
    public static final Drawable m16903b(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        Intrinsics.checkNotNullParameter(abstractC11834D, "<this>");
        return NA0.m94299e(m16904a(abstractC11834D), i);
    }

    /* renamed from: c */
    public static final String m16902c(RecyclerView.AbstractC11834D abstractC11834D, int i) {
        Intrinsics.checkNotNullParameter(abstractC11834D, "<this>");
        String string = m16904a(abstractC11834D).getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(resId)");
        return string;
    }
}
