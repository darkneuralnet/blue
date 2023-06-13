package p000;

import androidx.compose.p003ui.focus.InterfaceC11302e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R3\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LSv1;", "LRv1;", "LgV2$c;", "Landroidx/compose/ui/focus/e;", "focusProperties", "", "m", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "l", "Lkotlin/jvm/functions/Function1;", "getFocusPropertiesScope", "()Lkotlin/jvm/functions/Function1;", "e0", "(Lkotlin/jvm/functions/Function1;)V", "focusPropertiesScope", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36015Sv1 extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC35781Rv1 {

    /* renamed from: l */
    public Function1<? super InterfaceC11302e, Unit> f34471l;

    public C36015Sv1(Function1<? super InterfaceC11302e, Unit> focusPropertiesScope) {
        Intrinsics.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        this.f34471l = focusPropertiesScope;
    }

    /* renamed from: e0 */
    public final void m84619e0(Function1<? super InterfaceC11302e, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f34471l = function1;
    }

    @Override // p000.InterfaceC35781Rv1
    /* renamed from: m */
    public void mo29727m(InterfaceC11302e focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f34471l.invoke(focusProperties);
    }
}
