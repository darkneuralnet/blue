package p000;

import androidx.compose.p003ui.focus.C11317k;
import androidx.compose.p003ui.focus.FocusTargetModifierNode;
import com.facebook.share.internal.C17296a;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000e"}, m28432d2 = {"LZv1;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Lkotlin/Comparator;", "focusTarget1", "focusTarget2", "", C17296a.f69688o, "LJm2;", "layoutNode", "LLX2;", "b", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,273:1\n48#2:274\n523#2:275\n523#2:276\n1182#3:277\n1161#3,2:278\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n252#1:274\n256#1:275\n257#1:276\n264#1:277\n264#1:278,2\n*E\n"})
/* renamed from: Zv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37653Zv1 implements Comparator<FocusTargetModifierNode> {

    /* renamed from: b */
    public static final C37653Zv1 f49476b = new C37653Zv1();

    private C37653Zv1() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        C33829Jm2 c33829Jm2;
        if (focusTargetModifierNode != null) {
            if (focusTargetModifierNode2 != null) {
                int i = 0;
                if (C11317k.m68760g(focusTargetModifierNode) && C11317k.m68760g(focusTargetModifierNode2)) {
                    H83 m39260J = focusTargetModifierNode.m39260J();
                    C33829Jm2 c33829Jm22 = null;
                    if (m39260J != null) {
                        c33829Jm2 = m39260J.mo84222r1();
                    } else {
                        c33829Jm2 = null;
                    }
                    if (c33829Jm2 != null) {
                        H83 m39260J2 = focusTargetModifierNode2.m39260J();
                        if (m39260J2 != null) {
                            c33829Jm22 = m39260J2.mo84222r1();
                        }
                        if (c33829Jm22 != null) {
                            if (Intrinsics.areEqual(c33829Jm2, c33829Jm22)) {
                                return 0;
                            }
                            LX2<C33829Jm2> m72300b = m72300b(c33829Jm2);
                            LX2<C33829Jm2> m72300b2 = m72300b(c33829Jm22);
                            int min = Math.min(m72300b.m96690u() - 1, m72300b2.m96690u() - 1);
                            if (min >= 0) {
                                while (Intrinsics.areEqual(m72300b.m96691s()[i], m72300b2.m96691s()[i])) {
                                    if (i != min) {
                                        i++;
                                    }
                                }
                                return Intrinsics.compare(m72300b.m96691s()[i].m99753q0(), m72300b2.m96691s()[i].m99753q0());
                            }
                            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (C11317k.m68760g(focusTargetModifierNode)) {
                    return -1;
                } else {
                    if (!C11317k.m68760g(focusTargetModifierNode2)) {
                        return 0;
                    }
                    return 1;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: b */
    public final LX2<C33829Jm2> m72300b(C33829Jm2 c33829Jm2) {
        LX2<C33829Jm2> lx2 = new LX2<>(new C33829Jm2[16], 0);
        while (c33829Jm2 != null) {
            lx2.m96702a(0, c33829Jm2);
            c33829Jm2 = c33829Jm2.m99756p0();
        }
        return lx2;
    }
}
