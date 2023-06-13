package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "child", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Ljava/lang/Integer;", "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ft4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41207ft4 {
    /* renamed from: a */
    public static final Integer m40591a(RecyclerView recyclerView, View child) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(child);
        if (childAdapterPosition == -1) {
            return null;
        }
        return Integer.valueOf(childAdapterPosition);
    }
}
