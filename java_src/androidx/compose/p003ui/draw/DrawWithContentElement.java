package androidx.compose.p003ui.draw;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R(\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "LrV2;", "LM61;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lkotlin/Function1;", "LiA0;", "", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.draw.DrawWithContentElement */
/* loaded from: classes.dex */
final class DrawWithContentElement extends AbstractC48086rV2<M61> {

    /* renamed from: b */
    public final Function1<InterfaceC42558iA0, Unit> f52938b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(Function1<? super InterfaceC42558iA0, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.f52938b = onDraw;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.areEqual(this.f52938b, ((DrawWithContentElement) obj).f52938b);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public M61 mo15844a() {
        return new M61(this.f52938b);
    }

    public int hashCode() {
        return this.f52938b.hashCode();
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public M61 mo15842g(M61 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m95825e0(this.f52938b);
        return node;
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.f52938b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
