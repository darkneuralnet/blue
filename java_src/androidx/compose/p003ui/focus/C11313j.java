package androidx.compose.p003ui.focus;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0003\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u000b"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "", "e", "forced", "refreshFocusEvents", "c", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "childNode", "f", "g", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,242:1\n87#2:243\n87#2:245\n87#2:247\n324#3:244\n324#3:246\n324#3:248\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n55#1:243\n185#1:245\n209#1:247\n55#1:244\n185#1:246\n209#1:248\n*E\n"})
/* renamed from: androidx.compose.ui.focus.j */
/* loaded from: classes.dex */
public final class C11313j {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.focus.j$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11314a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37185Xv1.values().length];
            try {
                iArr[EnumC37185Xv1.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37185Xv1.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37185Xv1.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC37185Xv1.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.focus.j$b */
    /* loaded from: classes.dex */
    public static final class C11315b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ FocusTargetModifierNode f52994g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11315b(FocusTargetModifierNode focusTargetModifierNode) {
            super(0);
            this.f52994g = focusTargetModifierNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f52994g.m68833e0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "it", "", C17296a.f69688o, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.j$c */
    /* loaded from: classes.dex */
    public static final class C11316c extends Lambda implements Function1<FocusTargetModifierNode, Boolean> {

        /* renamed from: g */
        public static final C11316c f52995g = new C11316c();

        public C11316c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FocusTargetModifierNode it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C11313j.m68770e(it));
        }
    }

    /* renamed from: a */
    public static final boolean m68774a(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        FocusTargetModifierNode m68761f = C11317k.m68761f(focusTargetModifierNode);
        if (m68761f != null) {
            return m68772c(m68761f, z, z2);
        }
        return true;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m68773b(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m68774a(focusTargetModifierNode, z, z2);
    }

    /* renamed from: c */
    public static final boolean m68772c(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i = C11314a.$EnumSwitchMapping$0[focusTargetModifierNode.m68830h0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (m68774a(focusTargetModifierNode, z, z2)) {
                    focusTargetModifierNode.m68827k0(EnumC37185Xv1.Inactive);
                    if (z2) {
                        C51303wv1.m6104b(focusTargetModifierNode);
                    }
                } else {
                    return false;
                }
            } else if (z) {
                focusTargetModifierNode.m68827k0(EnumC37185Xv1.Inactive);
                if (z2) {
                    C51303wv1.m6104b(focusTargetModifierNode);
                    return z;
                }
                return z;
            } else {
                return z;
            }
        } else {
            focusTargetModifierNode.m68827k0(EnumC37185Xv1.Inactive);
            if (z2) {
                C51303wv1.m6104b(focusTargetModifierNode);
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m68771d(FocusTargetModifierNode focusTargetModifierNode) {
        C42835ie3.m33645a(focusTargetModifierNode, new C11315b(focusTargetModifierNode));
        int i = C11314a.$EnumSwitchMapping$0[focusTargetModifierNode.m68830h0().ordinal()];
        if (i == 3 || i == 4) {
            focusTargetModifierNode.m68827k0(EnumC37185Xv1.Active);
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m68770e(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        if (focusTargetModifierNode.mo8445r().m39254Q()) {
            if (!focusTargetModifierNode.m68833e0().mo68789h()) {
                return C11322m.m68739k(focusTargetModifierNode, C11299c.f52961b.m68806b(), C11316c.f52995g);
            }
            int i = C11314a.$EnumSwitchMapping$0[focusTargetModifierNode.m68830h0().ordinal()];
            boolean z = true;
            if (i != 1 && i != 2) {
                FocusTargetModifierNode focusTargetModifierNode2 = null;
                if (i != 3) {
                    if (i == 4) {
                        InterfaceC41563gV2.AbstractC20914c m6663f = C51083wZ0.m6663f(focusTargetModifierNode, K83.m99169a(1024));
                        if (m6663f instanceof FocusTargetModifierNode) {
                            focusTargetModifierNode2 = m6663f;
                        }
                        FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode2;
                        if (focusTargetModifierNode3 != null) {
                            return m68769f(focusTargetModifierNode3, focusTargetModifierNode);
                        }
                        if (!m68768g(focusTargetModifierNode) || !m68771d(focusTargetModifierNode)) {
                            z = false;
                        }
                        if (z) {
                            C51303wv1.m6104b(focusTargetModifierNode);
                        }
                        return z;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!m68773b(focusTargetModifierNode, false, false, 3, null) || !m68771d(focusTargetModifierNode)) {
                    z = false;
                }
                if (z) {
                    C51303wv1.m6104b(focusTargetModifierNode);
                }
                return z;
            }
            C51303wv1.m6104b(focusTargetModifierNode);
            return true;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: f */
    public static final boolean m68769f(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        InterfaceC41563gV2.AbstractC20914c m6663f = C51083wZ0.m6663f(focusTargetModifierNode2, K83.m99169a(1024));
        FocusTargetModifierNode focusTargetModifierNode3 = null;
        if (!(m6663f instanceof FocusTargetModifierNode)) {
            m6663f = null;
        }
        if (Intrinsics.areEqual((FocusTargetModifierNode) m6663f, focusTargetModifierNode)) {
            int i = C11314a.$EnumSwitchMapping$0[focusTargetModifierNode.m68830h0().ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                if (i != 3) {
                    if (i == 4) {
                        InterfaceC41563gV2.AbstractC20914c m6663f2 = C51083wZ0.m6663f(focusTargetModifierNode, K83.m99169a(1024));
                        if (m6663f2 instanceof FocusTargetModifierNode) {
                            focusTargetModifierNode3 = m6663f2;
                        }
                        FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode3;
                        if (focusTargetModifierNode4 == null && m68768g(focusTargetModifierNode)) {
                            focusTargetModifierNode.m68827k0(EnumC37185Xv1.Active);
                            C51303wv1.m6104b(focusTargetModifierNode);
                            return m68769f(focusTargetModifierNode, focusTargetModifierNode2);
                        } else if (focusTargetModifierNode4 == null || !m68769f(focusTargetModifierNode4, focusTargetModifierNode)) {
                            return false;
                        } else {
                            boolean m68769f = m68769f(focusTargetModifierNode, focusTargetModifierNode2);
                            if (focusTargetModifierNode.m68831g0() != EnumC37185Xv1.ActiveParent) {
                                z = false;
                            }
                            if (z) {
                                return m68769f;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (C11317k.m68761f(focusTargetModifierNode) != null) {
                    if (!m68773b(focusTargetModifierNode, false, false, 3, null) || !m68771d(focusTargetModifierNode2)) {
                        z = false;
                    }
                    if (z) {
                        C51303wv1.m6104b(focusTargetModifierNode2);
                    }
                    return z;
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            boolean m68771d = m68771d(focusTargetModifierNode2);
            if (m68771d) {
                focusTargetModifierNode.m68827k0(EnumC37185Xv1.ActiveParent);
                C51303wv1.m6104b(focusTargetModifierNode2);
                C51303wv1.m6104b(focusTargetModifierNode);
                return m68771d;
            }
            return m68771d;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    /* renamed from: g */
    public static final boolean m68768g(FocusTargetModifierNode focusTargetModifierNode) {
        C33829Jm2 mo84222r1;
        InterfaceC43181jD3 m99759o0;
        H83 m39260J = focusTargetModifierNode.m39260J();
        if (m39260J == null || (mo84222r1 = m39260J.mo84222r1()) == null || (m99759o0 = mo84222r1.m99759o0()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return m99759o0.requestFocus();
    }
}
