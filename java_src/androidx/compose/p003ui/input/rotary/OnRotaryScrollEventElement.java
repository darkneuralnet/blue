package androidx.compose.p003ui.input.rotary;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Landroidx/compose/ui/input/rotary/OnRotaryScrollEventElement;", "LrV2;", "LPb5;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lkotlin/Function1;", "LQb5;", "b", "Lkotlin/jvm/functions/Function1;", "getOnRotaryScrollEvent", "()Lkotlin/jvm/functions/Function1;", "onRotaryScrollEvent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.rotary.OnRotaryScrollEventElement */
/* loaded from: classes.dex */
public final class OnRotaryScrollEventElement extends AbstractC48086rV2<C35137Pb5> {

    /* renamed from: b */
    public final Function1<C35371Qb5, Boolean> f53071b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnRotaryScrollEventElement(Function1<? super C35371Qb5, Boolean> onRotaryScrollEvent) {
        Intrinsics.checkNotNullParameter(onRotaryScrollEvent, "onRotaryScrollEvent");
        this.f53071b = onRotaryScrollEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnRotaryScrollEventElement) && Intrinsics.areEqual(this.f53071b, ((OnRotaryScrollEventElement) obj).f53071b);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C35137Pb5 mo15844a() {
        return new C35137Pb5(this.f53071b, null);
    }

    public int hashCode() {
        return this.f53071b.hashCode();
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C35137Pb5 mo15842g(C35137Pb5 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m90076e0(this.f53071b);
        node.m90075f0(null);
        return node;
    }

    public String toString() {
        return "OnRotaryScrollEventElement(onRotaryScrollEvent=" + this.f53071b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
