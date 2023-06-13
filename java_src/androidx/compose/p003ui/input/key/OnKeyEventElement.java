package androidx.compose.p003ui.input.key;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001e\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000eø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Landroidx/compose/ui/input/key/OnKeyEventElement;", "LrV2;", "Lpk2;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lkotlin/Function1;", "Lik2;", "b", "Lkotlin/jvm/functions/Function1;", "getOnKeyEvent", "()Lkotlin/jvm/functions/Function1;", "onKeyEvent", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.key.OnKeyEventElement */
/* loaded from: classes.dex */
public final class OnKeyEventElement extends AbstractC48086rV2<C47045pk2> {

    /* renamed from: b */
    public final Function1<C42894ik2, Boolean> f53069b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnKeyEventElement(Function1<? super C42894ik2, Boolean> onKeyEvent) {
        Intrinsics.checkNotNullParameter(onKeyEvent, "onKeyEvent");
        this.f53069b = onKeyEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnKeyEventElement) && Intrinsics.areEqual(this.f53069b, ((OnKeyEventElement) obj).f53069b);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C47045pk2 mo15844a() {
        return new C47045pk2(this.f53069b, null);
    }

    public int hashCode() {
        return this.f53069b.hashCode();
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C47045pk2 mo15842g(C47045pk2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m18867e0(this.f53069b);
        node.m18866f0(null);
        return node;
    }

    public String toString() {
        return "OnKeyEventElement(onKeyEvent=" + this.f53069b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
