package androidx.compose.p003ui.focus;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0006"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "LWv1;", "", "onFocusChanged", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.b */
/* loaded from: classes.dex */
public final class C11298b {
    /* renamed from: a */
    public static final InterfaceC41563gV2 m68823a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC36951Wv1, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        return interfaceC41563gV2.mo39266t0(new FocusChangedElement(onFocusChanged));
    }
}
