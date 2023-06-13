package p000;

import android.view.accessibility.AccessibilityManager;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"Leh;", "", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "", "originalTimeout", "uiContentFlags", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eh */
/* loaded from: classes.dex */
public final class C20088eh {

    /* renamed from: a */
    public static final C20088eh f78691a = new C20088eh();

    private C20088eh() {
    }

    /* renamed from: a */
    public final int m42623a(AccessibilityManager accessibilityManager, int i, int i2) {
        int recommendedTimeoutMillis;
        Intrinsics.checkNotNullParameter(accessibilityManager, "accessibilityManager");
        recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i, i2);
        return recommendedTimeoutMillis;
    }
}
