package androidx.compose.p003ui.focus;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "LrV2;", "Ltv1;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lkotlin/Function1;", "LWv1;", "", "b", "Lkotlin/jvm/functions/Function1;", "getOnFocusChanged", "()Lkotlin/jvm/functions/Function1;", "onFocusChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusChangedElement */
/* loaded from: classes.dex */
final class FocusChangedElement extends AbstractC48086rV2<C49525tv1> {

    /* renamed from: b */
    public final Function1<InterfaceC36951Wv1, Unit> f52947b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(Function1<? super InterfaceC36951Wv1, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        this.f52947b = onFocusChanged;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && Intrinsics.areEqual(this.f52947b, ((FocusChangedElement) obj).f52947b);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C49525tv1 mo15844a() {
        return new C49525tv1(this.f52947b);
    }

    public int hashCode() {
        return this.f52947b.hashCode();
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C49525tv1 mo15842g(C49525tv1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m11221e0(this.f52947b);
        return node;
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f52947b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
