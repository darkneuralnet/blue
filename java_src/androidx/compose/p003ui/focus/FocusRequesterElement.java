package androidx.compose.p003ui.focus;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "LrV2;", "LVv1;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Landroidx/compose/ui/focus/h;", "b", "Landroidx/compose/ui/focus/h;", "getFocusRequester", "()Landroidx/compose/ui/focus/h;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/h;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n735#2,2:85\n728#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n59#1:85,2\n61#1:87,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusRequesterElement */
/* loaded from: classes.dex */
final class FocusRequesterElement extends AbstractC48086rV2<C36717Vv1> {

    /* renamed from: b */
    public final C11309h f52956b;

    public FocusRequesterElement(C11309h focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f52956b = focusRequester;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.areEqual(this.f52956b, ((FocusRequesterElement) obj).f52956b);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C36717Vv1 mo15844a() {
        return new C36717Vv1(this.f52956b);
    }

    public int hashCode() {
        return this.f52956b.hashCode();
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C36717Vv1 mo15842g(C36717Vv1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m79230e0().m68780d().m96709A(node);
        node.m79229f0(this.f52956b);
        node.m79230e0().m68780d().m96701b(node);
        return node;
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f52956b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
