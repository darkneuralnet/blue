package androidx.compose.p003ui.layout;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012#\u0010\u0018\u001a\u001f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0002\b\u0013ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R7\u0010\u0018\u001a\u001f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0002\b\u00138\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"Landroidx/compose/ui/layout/LayoutModifierElement;", "LrV2;", "LCm2;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lkotlin/Function3;", "LzO2;", "LvO2;", "Lkz0;", "LyO2;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function3;", "getMeasure", "()Lkotlin/jvm/functions/Function3;", "measure", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.LayoutModifierElement */
/* loaded from: classes.dex */
final class LayoutModifierElement extends AbstractC48086rV2<C32191Cm2> {

    /* renamed from: b */
    public final Function3<InterfaceC52765zO2, InterfaceC50393vO2, C44228kz0, InterfaceC52172yO2> f53073b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutModifierElement(Function3<? super InterfaceC52765zO2, ? super InterfaceC50393vO2, ? super C44228kz0, ? extends InterfaceC52172yO2> measure) {
        Intrinsics.checkNotNullParameter(measure, "measure");
        this.f53073b = measure;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutModifierElement) && Intrinsics.areEqual(this.f53073b, ((LayoutModifierElement) obj).f53073b);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C32191Cm2 mo15844a() {
        return new C32191Cm2(this.f53073b);
    }

    public int hashCode() {
        return this.f53073b.hashCode();
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C32191Cm2 mo15842g(C32191Cm2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m111723e0(this.f53073b);
        return node;
    }

    public String toString() {
        return "LayoutModifierElement(measure=" + this.f53073b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
