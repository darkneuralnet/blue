package androidx.compose.p003ui.layout;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LgV2;", "", "layoutId", "b", "LvO2;", C17296a.f69688o, "(LvO2;)Ljava/lang/Object;", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.a */
/* loaded from: classes.dex */
public final class C11335a {
    /* renamed from: a */
    public static final Object m68615a(InterfaceC50393vO2 interfaceC50393vO2) {
        InterfaceC48843sm2 interfaceC48843sm2;
        Intrinsics.checkNotNullParameter(interfaceC50393vO2, "<this>");
        Object mo77401c = interfaceC50393vO2.mo77401c();
        if (mo77401c instanceof InterfaceC48843sm2) {
            interfaceC48843sm2 = (InterfaceC48843sm2) mo77401c;
        } else {
            interfaceC48843sm2 = null;
        }
        if (interfaceC48843sm2 == null) {
            return null;
        }
        return interfaceC48843sm2.getLayoutId();
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m68614b(InterfaceC41563gV2 interfaceC41563gV2, Object layoutId) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        return interfaceC41563gV2.mo39266t0(new LayoutIdModifierElement(layoutId));
    }
}
