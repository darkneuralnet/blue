package androidx.compose.p003ui.layout;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Landroidx/compose/ui/layout/LayoutIdModifierElement;", "LrV2;", "Lrm2;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/Object;", "layoutId", "<init>", "(Ljava/lang/Object;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.LayoutIdModifierElement */
/* loaded from: classes.dex */
final class LayoutIdModifierElement extends AbstractC48086rV2<C48251rm2> {

    /* renamed from: b */
    public final Object f53072b;

    public LayoutIdModifierElement(Object layoutId) {
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        this.f53072b = layoutId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdModifierElement) && Intrinsics.areEqual(this.f53072b, ((LayoutIdModifierElement) obj).f53072b);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C48251rm2 mo15844a() {
        return new C48251rm2(this.f53072b);
    }

    public int hashCode() {
        return this.f53072b.hashCode();
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C48251rm2 mo15842g(C48251rm2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m15407e0(this.f53072b);
        return node;
    }

    public String toString() {
        return "LayoutIdModifierElement(layoutId=" + this.f53072b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
