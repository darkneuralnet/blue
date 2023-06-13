package p000;

import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u000b"}, m28432d2 = {"Lr2;", "", "Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r2 */
/* loaded from: classes.dex */
public final class C27757r2 {

    /* renamed from: a */
    public static final C27757r2 f106238a = new C27757r2();

    private C27757r2() {
    }

    /* renamed from: a */
    public final void m16624a(AccessibilityNodeInfo node, List<String> data) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(data, "data");
        node.setAvailableExtraData(data);
    }
}
