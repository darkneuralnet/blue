package p000;

import android.view.PointerIcon;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, m28432d2 = {"Ltc;", "", "Landroid/view/View;", "view", "LdX3;", "icon", "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tc */
/* loaded from: classes.dex */
public final class C28792tc {

    /* renamed from: a */
    public static final C28792tc f110785a = new C28792tc();

    private C28792tc() {
    }

    /* renamed from: a */
    public final void m12014a(View view, InterfaceC39804dX3 interfaceC39804dX3) {
        PointerIcon systemIcon;
        Intrinsics.checkNotNullParameter(view, "view");
        if (interfaceC39804dX3 instanceof C29599vd) {
            systemIcon = ((C29599vd) interfaceC39804dX3).m8338a();
        } else if (interfaceC39804dX3 instanceof C29924wd) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((C29924wd) interfaceC39804dX3).m6589a());
            Intrinsics.checkNotNullExpressionValue(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            Intrinsics.checkNotNullExpressionValue(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (!Intrinsics.areEqual(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
