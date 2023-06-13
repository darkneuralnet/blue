package p000;

import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Landroid/view/View;", "LuA1;", "fullyDrawnReporterOwner", "", C17296a.f69688o, "(Landroid/view/View;LuA1;)V", "activity_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "ViewTreeFullyDrawnReporterOwner")
/* renamed from: Pt6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35300Pt6 {
    @JvmName(name = "set")
    /* renamed from: a */
    public static final void m89462a(View view, InterfaceC49674uA1 fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(C34965Oi4.report_drawn, fullyDrawnReporterOwner);
    }
}
