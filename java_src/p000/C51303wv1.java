package p000;

import androidx.compose.p003ui.focus.FocusTargetModifierNode;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0001¨\u0006\u0006"}, m28432d2 = {"Lvv1;", "LWv1;", C17296a.f69688o, "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,75:1\n87#2:76\n91#2:106\n87#2:107\n87#2:118\n340#3:77\n206#3,2:78\n208#3,7:83\n215#3,15:91\n78#3,9:109\n88#3,7:120\n1182#4:80\n1161#4,2:81\n48#5:90\n47#6:108\n196#7:119\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n45#1:76\n65#1:106\n65#1:107\n68#1:118\n45#1:77\n45#1:78,2\n45#1:83,7\n45#1:91,15\n65#1:109,9\n65#1:120,7\n45#1:80\n45#1:81,2\n45#1:90\n65#1:108\n68#1:119\n*E\n"})
/* renamed from: wv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51303wv1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wv1$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C29994a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37185Xv1.values().length];
            try {
                iArr[EnumC37185Xv1.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37185Xv1.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37185Xv1.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC37185Xv1.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0034, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC36951Wv1 m6105a(InterfaceC50710vv1 interfaceC50710vv1) {
        Intrinsics.checkNotNullParameter(interfaceC50710vv1, "<this>");
        int m99169a = K83.m99169a(1024);
        if (interfaceC50710vv1.mo8445r().m39254Q()) {
            LX2 lx2 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
            InterfaceC41563gV2.AbstractC20914c m39261I = interfaceC50710vv1.mo8445r().m39261I();
            if (m39261I == null) {
                C51083wZ0.m6667b(lx2, interfaceC50710vv1.mo8445r());
            } else {
                lx2.m96701b(m39261I);
            }
            while (lx2.m96687x()) {
                InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx2.m96707C(lx2.m96690u() - 1);
                if ((abstractC20914c.m39262G() & m99169a) == 0) {
                    C51083wZ0.m6667b(lx2, abstractC20914c);
                } else {
                    while (true) {
                        if (abstractC20914c == null) {
                            break;
                        } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                            if (abstractC20914c instanceof FocusTargetModifierNode) {
                                EnumC37185Xv1 m68830h0 = ((FocusTargetModifierNode) abstractC20914c).m68830h0();
                                int i = C29994a.$EnumSwitchMapping$0[m68830h0.ordinal()];
                                if (i == 1 || i == 2 || i == 3) {
                                    return m68830h0;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            abstractC20914c = abstractC20914c.m39261I();
                        }
                    }
                }
            }
            return EnumC37185Xv1.Inactive;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public static final void m6104b(FocusTargetModifierNode focusTargetModifierNode) {
        F83 m99764m0;
        boolean z;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int m99169a = K83.m99169a(4096) | K83.m99169a(1024);
        if (focusTargetModifierNode.mo8445r().m39254Q()) {
            InterfaceC41563gV2.AbstractC20914c m39256O = focusTargetModifierNode.mo8445r().m39256O();
            C33829Jm2 m6661h = C51083wZ0.m6661h(focusTargetModifierNode);
            while (m6661h != null) {
                if ((m6661h.m99764m0().m107677l().m39262G() & m99169a) != 0) {
                    while (m39256O != null) {
                        if ((m39256O.m39258M() & m99169a) != 0) {
                            if ((K83.m99169a(1024) & m39256O.m39258M()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                return;
                            }
                            if (m39256O instanceof InterfaceC50710vv1) {
                                InterfaceC50710vv1 interfaceC50710vv1 = (InterfaceC50710vv1) m39256O;
                                interfaceC50710vv1.mo7774F(m6105a(interfaceC50710vv1));
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                        m39256O = m39256O.m39256O();
                    }
                }
                m6661h = m6661h.m99756p0();
                if (m6661h != null && (m99764m0 = m6661h.m99764m0()) != null) {
                    m39256O = m99764m0.m107674o();
                } else {
                    m39256O = null;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
