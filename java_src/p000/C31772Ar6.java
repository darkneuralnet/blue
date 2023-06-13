package p000;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroid/view/View;", C17296a.f69688o, "(Landroid/view/View;)Landroidx/fragment/app/Fragment;", "fragment-ktx_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Ar6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31772Ar6 {
    /* renamed from: a */
    public static final <F extends Fragment> F m115022a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        F f = (F) FragmentManager.m67328k0(view);
        Intrinsics.checkNotNullExpressionValue(f, "findFragment(this)");
        return f;
    }
}
