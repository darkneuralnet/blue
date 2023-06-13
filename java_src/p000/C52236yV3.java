package p000;

import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.XE1;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"LyV3;", "LWE1;", "LXE1;", "hapticFeedbackType", "", C17296a.f69688o, "(I)V", "Landroid/view/View;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yV3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52236yV3 implements WE1 {

    /* renamed from: a */
    public final View f119604a;

    public C52236yV3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f119604a = view;
    }

    @Override // p000.WE1
    /* renamed from: a */
    public void mo3442a(int i) {
        XE1.C9386a c9386a = XE1.f42907a;
        if (XE1.m77171b(i, c9386a.m77170a())) {
            this.f119604a.performHapticFeedback(0);
        } else if (XE1.m77171b(i, c9386a.m77169b())) {
            this.f119604a.performHapticFeedback(9);
        }
    }
}
