package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.focus.C11299c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import p000.InterfaceC0587BG;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a5\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a \u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a=\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a \u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a \u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a\f\u0010\u0010\u001a\u00020\u0004*\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/c;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "c", "b", "focusedItem", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "i", "h", "g", "e", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,273:1\n187#1,3:306\n190#1,2:310\n193#1,5:313\n202#1,3:318\n205#1,2:322\n208#1,5:325\n1161#2,2:274\n1182#2:280\n1161#2,2:281\n1161#2,2:330\n1182#2:336\n1161#2,2:337\n1161#2,2:373\n1182#2:379\n1161#2,2:380\n87#3:276\n87#3:332\n87#3:375\n87#3:416\n340#4:277\n206#4,2:278\n208#4,7:283\n215#4,15:291\n340#4:333\n206#4,2:334\n208#4,7:339\n215#4,15:347\n340#4:376\n206#4,2:377\n208#4,7:382\n215#4,15:390\n324#4:417\n48#5:290\n53#5:309\n523#5:312\n53#5:321\n523#5:324\n48#5:346\n204#5,11:362\n48#5:389\n492#5,11:405\n53#5:418\n523#5:419\n523#5:420\n53#5:421\n523#5:422\n523#5:423\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n136#1:306,3\n136#1:310,2\n136#1:313,5\n139#1:318,3\n139#1:322,2\n139#1:325,5\n131#1:274,2\n132#1:280\n132#1:281,2\n158#1:330,2\n159#1:336\n159#1:337,2\n169#1:373,2\n170#1:379\n170#1:380,2\n132#1:276\n159#1:332\n170#1:375\n182#1:416\n132#1:277\n132#1:278,2\n132#1:283,7\n132#1:291,15\n159#1:333\n159#1:334,2\n159#1:339,7\n159#1:347,15\n170#1:376\n170#1:377,2\n170#1:382,7\n170#1:390,15\n182#1:417\n132#1:290\n136#1:309\n136#1:312\n139#1:321\n139#1:324\n159#1:346\n162#1:362,11\n170#1:389\n173#1:405,11\n189#1:418\n191#1:419\n193#1:420\n204#1:421\n206#1:422\n208#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.focus.l */
/* loaded from: classes.dex */
public final class C11319l {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.focus.l$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11320a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37185Xv1.values().length];
            try {
                iArr[EnumC37185Xv1.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37185Xv1.Active.ordinal()] = 2;
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LBG$a;", "", C17296a.f69688o, "(LBG$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.l$b */
    /* loaded from: classes.dex */
    public static final class C11321b extends Lambda implements Function1<InterfaceC0587BG.InterfaceC0588a, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ FocusTargetModifierNode f52996g;

        /* renamed from: h */
        public final /* synthetic */ FocusTargetModifierNode f52997h;

        /* renamed from: i */
        public final /* synthetic */ int f52998i;

        /* renamed from: j */
        public final /* synthetic */ Function1<FocusTargetModifierNode, Boolean> f52999j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11321b(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
            super(1);
            this.f52996g = focusTargetModifierNode;
            this.f52997h = focusTargetModifierNode2;
            this.f52998i = i;
            this.f52999j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC0587BG.InterfaceC0588a searchBeyondBounds) {
            boolean z;
            Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(C11319l.m68751i(this.f52996g, this.f52997h, this.f52998i, this.f52999j));
            if (!valueOf.booleanValue() && searchBeyondBounds.mo93408a()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            return valueOf;
        }
    }

    /* renamed from: b */
    public static final boolean m68758b(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        boolean z;
        EnumC37185Xv1 m68830h0 = focusTargetModifierNode.m68830h0();
        int[] iArr = C11320a.$EnumSwitchMapping$0;
        int i = iArr[m68830h0.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (!m68753g(focusTargetModifierNode, function1)) {
                        if (focusTargetModifierNode.m68833e0().mo68789h()) {
                            z = function1.invoke(focusTargetModifierNode).booleanValue();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return false;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return m68753g(focusTargetModifierNode, function1);
            }
        } else {
            FocusTargetModifierNode m68761f = C11317k.m68761f(focusTargetModifierNode);
            if (m68761f != null) {
                int i2 = iArr[m68761f.m68830h0().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    return m68756d(focusTargetModifierNode, m68761f, C11299c.f52961b.m68802f(), function1);
                } else if (!m68758b(m68761f, function1) && !m68756d(focusTargetModifierNode, m68761f, C11299c.f52961b.m68802f(), function1) && (!m68761f.m68833e0().mo68789h() || !function1.invoke(m68761f).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m68757c(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        int i = C11320a.$EnumSwitchMapping$0[focusTargetModifierNode.m68830h0().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (focusTargetModifierNode.m68833e0().mo68789h()) {
                        return function1.invoke(focusTargetModifierNode).booleanValue();
                    }
                    return m68752h(focusTargetModifierNode, function1);
                }
                throw new NoWhenBranchMatchedException();
            }
            return m68752h(focusTargetModifierNode, function1);
        }
        FocusTargetModifierNode m68761f = C11317k.m68761f(focusTargetModifierNode);
        if (m68761f != null) {
            if (m68757c(m68761f, function1) || m68756d(focusTargetModifierNode, m68761f, C11299c.f52961b.m68803e(), function1)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    /* renamed from: d */
    public static final boolean m68756d(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m68751i(focusTargetModifierNode, focusTargetModifierNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) C11297a.m68824a(focusTargetModifierNode, i, new C11321b(focusTargetModifierNode, focusTargetModifierNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m68755e(FocusTargetModifierNode focusTargetModifierNode) {
        InterfaceC41563gV2.AbstractC20914c m6663f = C51083wZ0.m6663f(focusTargetModifierNode, K83.m99169a(1024));
        if (!(m6663f instanceof FocusTargetModifierNode)) {
            m6663f = null;
        }
        if (((FocusTargetModifierNode) m6663f) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m68754f(FocusTargetModifierNode oneDimensionalFocusSearch, int i, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        C11299c.C11300a c11300a = C11299c.f52961b;
        if (C11299c.m68811l(i, c11300a.m68803e())) {
            return m68757c(oneDimensionalFocusSearch, onFound);
        }
        if (C11299c.m68811l(i, c11300a.m68802f())) {
            return m68758b(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    /* renamed from: g */
    public static final boolean m68753g(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        LX2 lx2 = new LX2(new FocusTargetModifierNode[16], 0);
        int m99169a = K83.m99169a(1024);
        if (focusTargetModifierNode.mo8445r().m39254Q()) {
            LX2 lx22 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
            InterfaceC41563gV2.AbstractC20914c m39261I = focusTargetModifierNode.mo8445r().m39261I();
            if (m39261I == null) {
                C51083wZ0.m6667b(lx22, focusTargetModifierNode.mo8445r());
            } else {
                lx22.m96701b(m39261I);
            }
            while (lx22.m96687x()) {
                InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx22.m96707C(lx22.m96690u() - 1);
                if ((abstractC20914c.m39262G() & m99169a) == 0) {
                    C51083wZ0.m6667b(lx22, abstractC20914c);
                } else {
                    while (true) {
                        if (abstractC20914c == null) {
                            break;
                        } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                            if (abstractC20914c instanceof FocusTargetModifierNode) {
                                lx2.m96701b((FocusTargetModifierNode) abstractC20914c);
                            }
                        } else {
                            abstractC20914c = abstractC20914c.m39261I();
                        }
                    }
                }
            }
            lx2.m96703G(C37653Zv1.f49476b);
            int m96690u = lx2.m96690u();
            if (m96690u <= 0) {
                return false;
            }
            int i = m96690u - 1;
            Object[] m96691s = lx2.m96691s();
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) m96691s[i];
                if (C11317k.m68760g(focusTargetModifierNode2) && m68758b(focusTargetModifierNode2, function1)) {
                    return true;
                }
                i--;
            } while (i >= 0);
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: h */
    public static final boolean m68752h(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        boolean z;
        LX2 lx2 = new LX2(new FocusTargetModifierNode[16], 0);
        int m99169a = K83.m99169a(1024);
        if (focusTargetModifierNode.mo8445r().m39254Q()) {
            LX2 lx22 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
            InterfaceC41563gV2.AbstractC20914c m39261I = focusTargetModifierNode.mo8445r().m39261I();
            if (m39261I == null) {
                C51083wZ0.m6667b(lx22, focusTargetModifierNode.mo8445r());
            } else {
                lx22.m96701b(m39261I);
            }
            while (lx22.m96687x()) {
                InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx22.m96707C(lx22.m96690u() - 1);
                if ((abstractC20914c.m39262G() & m99169a) == 0) {
                    C51083wZ0.m6667b(lx22, abstractC20914c);
                } else {
                    while (true) {
                        if (abstractC20914c == null) {
                            break;
                        } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                            if (abstractC20914c instanceof FocusTargetModifierNode) {
                                lx2.m96701b((FocusTargetModifierNode) abstractC20914c);
                            }
                        } else {
                            abstractC20914c = abstractC20914c.m39261I();
                        }
                    }
                }
            }
            lx2.m96703G(C37653Zv1.f49476b);
            int m96690u = lx2.m96690u();
            if (m96690u <= 0) {
                return false;
            }
            Object[] m96691s = lx2.m96691s();
            int i = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) m96691s[i];
                if (C11317k.m68760g(focusTargetModifierNode2) && m68757c(focusTargetModifierNode2, function1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                i++;
            } while (i < m96690u);
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: i */
    public static final boolean m68751i(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        boolean z;
        if (focusTargetModifierNode.m68830h0() == EnumC37185Xv1.ActiveParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LX2 lx2 = new LX2(new FocusTargetModifierNode[16], 0);
            int m99169a = K83.m99169a(1024);
            if (focusTargetModifierNode.mo8445r().m39254Q()) {
                LX2 lx22 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
                InterfaceC41563gV2.AbstractC20914c m39261I = focusTargetModifierNode.mo8445r().m39261I();
                if (m39261I == null) {
                    C51083wZ0.m6667b(lx22, focusTargetModifierNode.mo8445r());
                } else {
                    lx22.m96701b(m39261I);
                }
                while (lx22.m96687x()) {
                    InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx22.m96707C(lx22.m96690u() - 1);
                    if ((abstractC20914c.m39262G() & m99169a) == 0) {
                        C51083wZ0.m6667b(lx22, abstractC20914c);
                    } else {
                        while (true) {
                            if (abstractC20914c == null) {
                                break;
                            } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                                if (abstractC20914c instanceof FocusTargetModifierNode) {
                                    lx2.m96701b((FocusTargetModifierNode) abstractC20914c);
                                }
                            } else {
                                abstractC20914c = abstractC20914c.m39261I();
                            }
                        }
                    }
                }
                lx2.m96703G(C37653Zv1.f49476b);
                C11299c.C11300a c11300a = C11299c.f52961b;
                if (C11299c.m68811l(i, c11300a.m68803e())) {
                    IntRange intRange = new IntRange(0, lx2.m96690u() - 1);
                    int first = intRange.getFirst();
                    int last = intRange.getLast();
                    if (first <= last) {
                        boolean z2 = false;
                        while (true) {
                            if (z2) {
                                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) lx2.m96691s()[first];
                                if (C11317k.m68760g(focusTargetModifierNode3) && m68757c(focusTargetModifierNode3, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(lx2.m96691s()[first], focusTargetModifierNode2)) {
                                z2 = true;
                            }
                            if (first == last) {
                                break;
                            }
                            first++;
                        }
                    }
                } else if (C11299c.m68811l(i, c11300a.m68802f())) {
                    IntRange intRange2 = new IntRange(0, lx2.m96690u() - 1);
                    int first2 = intRange2.getFirst();
                    int last2 = intRange2.getLast();
                    if (first2 <= last2) {
                        boolean z3 = false;
                        while (true) {
                            if (z3) {
                                FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) lx2.m96691s()[last2];
                                if (C11317k.m68760g(focusTargetModifierNode4) && m68758b(focusTargetModifierNode4, function1)) {
                                    return true;
                                }
                            }
                            if (Intrinsics.areEqual(lx2.m96691s()[last2], focusTargetModifierNode2)) {
                                z3 = true;
                            }
                            if (last2 == first2) {
                                break;
                            }
                            last2--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                if (C11299c.m68811l(i, C11299c.f52961b.m68803e()) || !focusTargetModifierNode.m68833e0().mo68789h() || m68755e(focusTargetModifierNode)) {
                    return false;
                }
                return function1.invoke(focusTargetModifierNode).booleanValue();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
