package p000;

import androidx.compose.p003ui.focus.FocusTargetModifierNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\rH\u0003\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\rH\u0003\"%\u0010\u0016\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00118@X\u0080\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LgV2$b;", "element", "", "e", "LgV2$c;", "node", "f", "", "c", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "phase", "b", "LRv1;", "h", "", "i", "LK83;", "g", "(I)Z", "getIncludeSelfInTraversal-H91voCI$annotations", "(I)V", "includeSelfInTraversal", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,283:1\n51#1:287\n51#1:289\n51#1:291\n51#1:293\n51#1:295\n51#1:297\n51#1:299\n51#1:301\n51#1:303\n51#1:305\n51#1:307\n51#1:310\n51#1:312\n51#1:314\n51#1:316\n51#1:318\n51#1:320\n51#1:322\n51#1:324\n51#1:326\n51#1:328\n51#1:330\n51#1:332\n51#1:334\n51#1:336\n81#2:284\n67#2:285\n69#2:286\n85#2:288\n71#2:290\n73#2:292\n75#2:294\n77#2:296\n91#2:298\n89#2:300\n83#2:302\n79#2:304\n81#2:306\n67#2:308\n69#2:309\n71#2:311\n73#2:313\n75#2:315\n77#2:317\n79#2:319\n81#2:321\n83#2:323\n85#2:325\n87#2:327\n89#2:329\n91#2:331\n93#2:333\n95#2:335\n69#2:337\n69#2:339\n83#2:340\n71#2:342\n73#2:344\n79#2:346\n87#2:348\n89#2:350\n91#2:352\n87#2:354\n196#3:338\n196#3:341\n196#3:343\n196#3:345\n196#3:347\n196#3:349\n196#3:351\n196#3:353\n340#4:355\n206#4,2:356\n208#4,7:361\n215#4,15:369\n1182#5:358\n1161#5,2:359\n48#6:368\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n103#1:287\n106#1:289\n109#1:291\n112#1:293\n115#1:295\n121#1:297\n124#1:299\n127#1:301\n130#1:303\n133#1:305\n140#1:307\n149#1:310\n152#1:312\n155#1:314\n158#1:316\n161#1:318\n164#1:320\n167#1:322\n170#1:324\n173#1:326\n176#1:328\n179#1:330\n182#1:332\n185#1:334\n188#1:336\n59#1:284\n101#1:285\n103#1:286\n106#1:288\n109#1:290\n112#1:292\n115#1:294\n121#1:296\n124#1:298\n127#1:300\n130#1:302\n133#1:304\n140#1:306\n147#1:308\n149#1:309\n152#1:311\n155#1:313\n158#1:315\n161#1:317\n164#1:319\n167#1:321\n170#1:323\n173#1:325\n176#1:327\n179#1:329\n182#1:331\n185#1:333\n188#1:335\n209#1:337\n212#1:339\n216#1:340\n219#1:342\n222#1:344\n225#1:346\n228#1:348\n237#1:350\n246#1:352\n253#1:354\n209#1:338\n216#1:341\n219#1:343\n222#1:345\n225#1:347\n228#1:349\n237#1:351\n246#1:353\n253#1:355\n253#1:356,2\n253#1:361,7\n253#1:369,15\n253#1:358\n253#1:359,2\n253#1:368\n*E\n"})
/* renamed from: L83 */
/* loaded from: classes.dex */
public final class L83 {
    /* renamed from: a */
    public static final void m97667a(InterfaceC41563gV2.AbstractC20914c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m97666b(node, 1);
    }

    /* renamed from: b */
    public static final void m97666b(InterfaceC41563gV2.AbstractC20914c abstractC20914c, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (abstractC20914c.m39254Q()) {
            boolean z8 = true;
            if ((K83.m99169a(2) & abstractC20914c.m39258M()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (abstractC20914c instanceof InterfaceC32425Dm2)) {
                C33127Gm2.m104765b((InterfaceC32425Dm2) abstractC20914c);
                if (i == 2) {
                    C51083wZ0.m6662g(abstractC20914c, K83.m99169a(2)).m104354E2();
                }
            }
            if ((K83.m99169a(256) & abstractC20914c.m39258M()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (abstractC20914c instanceof TC1)) {
                C51083wZ0.m6661h(abstractC20914c).m99828G0();
            }
            if ((K83.m99169a(4) & abstractC20914c.m39258M()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && (abstractC20914c instanceof E61)) {
                F61.m107744a((E61) abstractC20914c);
            }
            if ((K83.m99169a(8) & abstractC20914c.m39258M()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && (abstractC20914c instanceof InterfaceC41791gs5)) {
                C42384hs5.m35681c((InterfaceC41791gs5) abstractC20914c);
            }
            if ((K83.m99169a(64) & abstractC20914c.m39258M()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && (abstractC20914c instanceof TE3)) {
                UE3.m81792a((TE3) abstractC20914c);
            }
            if ((K83.m99169a(1024) & abstractC20914c.m39258M()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (abstractC20914c instanceof FocusTargetModifierNode)) {
                if (i == 2) {
                    abstractC20914c.mo39253T();
                } else {
                    C51083wZ0.m6660i(abstractC20914c).mo31015B().mo68856c((FocusTargetModifierNode) abstractC20914c);
                }
            }
            if ((K83.m99169a(2048) & abstractC20914c.m39258M()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && (abstractC20914c instanceof InterfaceC35781Rv1)) {
                InterfaceC35781Rv1 interfaceC35781Rv1 = (InterfaceC35781Rv1) abstractC20914c;
                if (m97659i(interfaceC35781Rv1)) {
                    if (i == 2) {
                        m97660h(interfaceC35781Rv1);
                    } else {
                        C51083wZ0.m6660i(abstractC20914c).mo31015B().mo68849k(interfaceC35781Rv1);
                    }
                }
            }
            if ((K83.m99169a(4096) & abstractC20914c.m39258M()) == 0) {
                z8 = false;
            }
            if (z8 && (abstractC20914c instanceof InterfaceC50710vv1) && i != 2) {
                C51083wZ0.m6660i(abstractC20914c).mo31015B().mo68855d((InterfaceC50710vv1) abstractC20914c);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public static final void m97665c(InterfaceC41563gV2.AbstractC20914c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m97666b(node, 2);
    }

    /* renamed from: d */
    public static final void m97664d(InterfaceC41563gV2.AbstractC20914c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m97666b(node, 0);
    }

    /* renamed from: e */
    public static final int m97663e(InterfaceC41563gV2.InterfaceC20913b element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int m99169a = K83.m99169a(1);
        if (element instanceof InterfaceC31957Bm2) {
            m99169a |= K83.m99169a(2);
        }
        if (element instanceof InterfaceC43706k62) {
            m99169a |= K83.m99169a(512);
        }
        if (element instanceof D61) {
            m99169a |= K83.m99169a(4);
        }
        if (element instanceof InterfaceC40012ds5) {
            m99169a |= K83.m99169a(8);
        }
        if (element instanceof InterfaceC47512qX3) {
            m99169a |= K83.m99169a(16);
        }
        if ((element instanceof InterfaceC42749iV2) || (element instanceof InterfaceC46307oV2)) {
            m99169a |= K83.m99169a(32);
        }
        if (element instanceof InterfaceC50118uv1) {
            m99169a |= K83.m99169a(4096);
        }
        if (element instanceof InterfaceC35079Ov1) {
            m99169a |= K83.m99169a(2048);
        }
        if (element instanceof InterfaceC35648Rg3) {
            m99169a |= K83.m99169a(256);
        }
        if (element instanceof SE3) {
            m99169a |= K83.m99169a(64);
        }
        if ((element instanceof InterfaceC39290ch3) || (element instanceof InterfaceC41679gh3) || (element instanceof WC2)) {
            return m99169a | K83.m99169a(128);
        }
        return m99169a;
    }

    /* renamed from: f */
    public static final int m97662f(InterfaceC41563gV2.AbstractC20914c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int m99169a = K83.m99169a(1);
        if (node instanceof InterfaceC32425Dm2) {
            m99169a |= K83.m99169a(2);
        }
        if (node instanceof E61) {
            m99169a |= K83.m99169a(4);
        }
        if (node instanceof InterfaceC41791gs5) {
            m99169a |= K83.m99169a(8);
        }
        if (node instanceof InterfaceC48105rX3) {
            m99169a |= K83.m99169a(16);
        }
        if (node instanceof InterfaceC45121mV2) {
            m99169a |= K83.m99169a(32);
        }
        if (node instanceof TE3) {
            m99169a |= K83.m99169a(64);
        }
        if (node instanceof InterfaceC44100km2) {
            m99169a |= K83.m99169a(128);
        }
        if (node instanceof TC1) {
            m99169a |= K83.m99169a(256);
        }
        if (node instanceof InterfaceC44299l62) {
            m99169a |= K83.m99169a(512);
        }
        if (node instanceof FocusTargetModifierNode) {
            m99169a |= K83.m99169a(1024);
        }
        if (node instanceof InterfaceC35781Rv1) {
            m99169a |= K83.m99169a(2048);
        }
        if (node instanceof InterfaceC50710vv1) {
            m99169a |= K83.m99169a(4096);
        }
        if (node instanceof InterfaceC48231rk2) {
            m99169a |= K83.m99169a(8192);
        }
        if (node instanceof InterfaceC34903Ob5) {
            return m99169a | K83.m99169a(16384);
        }
        return m99169a;
    }

    /* renamed from: g */
    public static final boolean m97661g(int i) {
        return (i & K83.m99169a(128)) != 0;
    }

    /* renamed from: h */
    public static final void m97660h(InterfaceC35781Rv1 interfaceC35781Rv1) {
        int m99169a = K83.m99169a(1024);
        if (interfaceC35781Rv1.mo8445r().m39254Q()) {
            LX2 lx2 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
            InterfaceC41563gV2.AbstractC20914c m39261I = interfaceC35781Rv1.mo8445r().m39261I();
            if (m39261I == null) {
                C51083wZ0.m6667b(lx2, interfaceC35781Rv1.mo8445r());
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
                                C51083wZ0.m6660i(interfaceC35781Rv1).mo31015B().mo68856c((FocusTargetModifierNode) abstractC20914c);
                            }
                        } else {
                            abstractC20914c = abstractC20914c.m39261I();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public static final boolean m97659i(InterfaceC35781Rv1 interfaceC35781Rv1) {
        C33737Jc0 c33737Jc0 = C33737Jc0.f17897a;
        c33737Jc0.m100121j();
        interfaceC35781Rv1.mo29727m(c33737Jc0);
        return c33737Jc0.m100122i();
    }
}
