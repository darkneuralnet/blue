package p000;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, m28432d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "fragment-ktx_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: iy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43033iy1 {
    /* renamed from: a */
    public static final void m31554a(Fragment fragment, String requestKey, Bundle result) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        fragment.getParentFragmentManager().m67419A1(requestKey, result);
    }
}
