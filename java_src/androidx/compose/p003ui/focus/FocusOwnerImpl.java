package androidx.compose.p003ui.focus;

import android.view.KeyEvent;
import androidx.compose.p003ui.focus.C11299c;
import androidx.compose.p003ui.focus.C11309h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010<\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020;\u0012\u0004\u0012\u00020\u00020:¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u001aH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0002J\u001d\u0010!\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\rR(\u0010*\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R \u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010/\u0012\u0004\b2\u0010)\u001a\u0004\b0\u00101R\"\u00109\u001a\u0002048\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107\"\u0004\b\"\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006?"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "LQv1;", "", "b", "l", "", "force", "n", "refreshFocusEvents", "h", "Landroidx/compose/ui/focus/c;", "focusDirection", "i", "(I)Z", "Lik2;", "keyEvent", "g", "(Landroid/view/KeyEvent;)Z", "LQb5;", "event", "m", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "node", "c", "Lvv1;", DateTokenConverter.CONVERTER_KEY, "LRv1;", "k", "LOs4;", "j", "LvZ0;", "Lrk2;", "q", "r", C17296a.f69688o, "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "p", "()Landroidx/compose/ui/focus/FocusTargetModifierNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "getRootFocusNode$ui_release$annotations", "()V", "rootFocusNode", "LAv1;", "LAv1;", "focusInvalidationManager", "LgV2;", "LgV2;", "f", "()LgV2;", "getModifier$annotations", "modifier", "Lpm2;", "Lpm2;", "o", "()Lpm2;", "(Lpm2;)V", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/Function0;", "onRequestApplyChangesListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,275:1\n224#1:279\n225#1:281\n226#1,3:288\n229#1:297\n224#1:301\n225#1:303\n226#1,3:310\n229#1:319\n93#2:276\n93#2:278\n95#2:298\n95#2:300\n87#2,7:333\n87#2:348\n324#3:277\n320#3:280\n324#3:299\n320#3:302\n320#3:320\n262#3,7:341\n270#3,3:350\n51#4,6:282\n33#4,6:291\n51#4,6:304\n33#4,6:313\n51#4,6:321\n33#4,6:327\n47#5:340\n196#6:349\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n177#1:279\n177#1:281\n177#1:288,3\n177#1:297\n194#1:301\n194#1:303\n194#1:310,3\n194#1:319\n175#1:276\n178#1:278\n192#1:298\n195#1:300\n242#1:333,7\n243#1:348\n175#1:277\n177#1:280\n192#1:299\n194#1:302\n224#1:320\n242#1:341,7\n242#1:350,3\n177#1:282,6\n177#1:291,6\n194#1:304,6\n194#1:313,6\n225#1:321,6\n228#1:327,6\n242#1:340\n243#1:349\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl */
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements InterfaceC35547Qv1 {

    /* renamed from: a */
    public FocusTargetModifierNode f52948a;

    /* renamed from: b */
    public final C31803Av1 f52949b;

    /* renamed from: c */
    public final InterfaceC41563gV2 f52950c;

    /* renamed from: d */
    public EnumC47065pm2 f52951d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11293a {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "it", "", C17296a.f69688o, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$b */
    /* loaded from: classes.dex */
    public static final class C11294b extends Lambda implements Function1<FocusTargetModifierNode, Boolean> {

        /* renamed from: g */
        public static final C11294b f52952g = new C11294b();

        public C11294b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FocusTargetModifierNode it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C11313j.m68770e(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "destination", "", C17296a.f69688o, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,275:1\n87#2:276\n324#3:277\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n*L\n152#1:276\n152#1:277\n*E\n"})
    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$c */
    /* loaded from: classes.dex */
    public static final class C11295c extends Lambda implements Function1<FocusTargetModifierNode, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ FocusTargetModifierNode f52953g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11295c(FocusTargetModifierNode focusTargetModifierNode) {
            super(1);
            this.f52953g = focusTargetModifierNode;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FocusTargetModifierNode destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            if (Intrinsics.areEqual(destination, this.f52953g)) {
                return Boolean.FALSE;
            }
            InterfaceC41563gV2.AbstractC20914c m6663f = C51083wZ0.m6663f(destination, K83.m99169a(1024));
            if (!(m6663f instanceof FocusTargetModifierNode)) {
                m6663f = null;
            }
            if (((FocusTargetModifierNode) m6663f) != null) {
                return Boolean.valueOf(C11313j.m68770e(destination));
            }
            throw new IllegalStateException("Focus search landed at the root.".toString());
        }
    }

    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.f52948a = new FocusTargetModifierNode();
        this.f52949b = new C31803Av1(onRequestApplyChangesListener);
        this.f52950c = new AbstractC48086rV2<FocusTargetModifierNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // p000.AbstractC48086rV2
            /* renamed from: h */
            public FocusTargetModifierNode mo15844a() {
                return FocusOwnerImpl.this.m68844p();
            }

            public int hashCode() {
                return FocusOwnerImpl.this.m68844p().hashCode();
            }

            @Override // p000.AbstractC48086rV2
            /* renamed from: j */
            public FocusTargetModifierNode mo15842g(FocusTargetModifierNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
                return node;
            }
        };
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: a */
    public void mo68858a(EnumC47065pm2 enumC47065pm2) {
        Intrinsics.checkNotNullParameter(enumC47065pm2, "<set-?>");
        this.f52951d = enumC47065pm2;
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: b */
    public void mo68857b() {
        if (this.f52948a.m68830h0() == EnumC37185Xv1.Inactive) {
            this.f52948a.m68827k0(EnumC37185Xv1.Active);
        }
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: c */
    public void mo68856c(FocusTargetModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f52949b.m114953f(node);
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: d */
    public void mo68855d(InterfaceC50710vv1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f52949b.m114955d(node);
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: f */
    public InterfaceC41563gV2 mo68854f() {
        return this.f52950c;
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: g */
    public boolean mo68853g(KeyEvent keyEvent) {
        int i;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetModifierNode m68765b = C11317k.m68765b(this.f52948a);
        if (m68765b != null) {
            InterfaceC48231rk2 m68843q = m68843q(m68765b);
            List<InterfaceC41563gV2.AbstractC20914c> list = null;
            if (m68843q == null) {
                InterfaceC41563gV2.AbstractC20914c m6663f = C51083wZ0.m6663f(m68765b, K83.m99169a(8192));
                if (!(m6663f instanceof InterfaceC48231rk2)) {
                    m6663f = null;
                }
                m68843q = (InterfaceC48231rk2) m6663f;
            }
            if (m68843q != null) {
                List<InterfaceC41563gV2.AbstractC20914c> m6666c = C51083wZ0.m6666c(m68843q, K83.m99169a(8192));
                if (m6666c instanceof List) {
                    list = m6666c;
                }
                if (list != null && list.size() - 1 >= 0) {
                    while (true) {
                        int i2 = i - 1;
                        if (((InterfaceC48231rk2) list.get(i)).mo15484n(keyEvent)) {
                            return true;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (m68843q.mo15484n(keyEvent) || m68843q.mo15483w(keyEvent)) {
                    return true;
                }
                if (list != null) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((InterfaceC48231rk2) list.get(i3)).mo15483w(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: h */
    public void mo68852h(boolean z, boolean z2) {
        EnumC37185Xv1 enumC37185Xv1;
        EnumC37185Xv1 m68830h0 = this.f52948a.m68830h0();
        if (C11313j.m68772c(this.f52948a, z, z2)) {
            FocusTargetModifierNode focusTargetModifierNode = this.f52948a;
            int i = C11293a.$EnumSwitchMapping$0[m68830h0.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4) {
                    enumC37185Xv1 = EnumC37185Xv1.Inactive;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                enumC37185Xv1 = EnumC37185Xv1.Active;
            }
            focusTargetModifierNode.m68827k0(enumC37185Xv1);
        }
    }

    @Override // p000.InterfaceC32037Bv1
    /* renamed from: i */
    public boolean mo68851i(int i) {
        FocusTargetModifierNode m68765b = C11317k.m68765b(this.f52948a);
        if (m68765b == null) {
            return false;
        }
        C11309h m68766a = C11317k.m68766a(m68765b, i, m68845o());
        C11309h.C11310a c11310a = C11309h.f52988b;
        if (Intrinsics.areEqual(m68766a, c11310a.m68778a())) {
            return false;
        }
        if (Intrinsics.areEqual(m68766a, c11310a.m68777b())) {
            if (!C11317k.m68762e(this.f52948a, i, m68845o(), new C11295c(m68765b)) && !m68842r(i)) {
                return false;
            }
            return true;
        }
        return m68766a.m68781c(C11294b.f52952g);
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: j */
    public C35055Os4 mo68850j() {
        FocusTargetModifierNode m68765b = C11317k.m68765b(this.f52948a);
        if (m68765b != null) {
            return C11317k.m68763d(m68765b);
        }
        return null;
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: k */
    public void mo68849k(InterfaceC35781Rv1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f52949b.m114954e(node);
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: l */
    public void mo68848l() {
        C11313j.m68772c(this.f52948a, true, true);
    }

    @Override // p000.InterfaceC35547Qv1
    /* renamed from: m */
    public boolean mo68847m(C35371Qb5 event) {
        InterfaceC34903Ob5 interfaceC34903Ob5;
        int i;
        Intrinsics.checkNotNullParameter(event, "event");
        FocusTargetModifierNode m68765b = C11317k.m68765b(this.f52948a);
        List<InterfaceC41563gV2.AbstractC20914c> list = null;
        if (m68765b != null) {
            InterfaceC41563gV2.AbstractC20914c m6663f = C51083wZ0.m6663f(m68765b, K83.m99169a(16384));
            if (!(m6663f instanceof InterfaceC34903Ob5)) {
                m6663f = null;
            }
            interfaceC34903Ob5 = (InterfaceC34903Ob5) m6663f;
        } else {
            interfaceC34903Ob5 = null;
        }
        if (interfaceC34903Ob5 != null) {
            List<InterfaceC41563gV2.AbstractC20914c> m6666c = C51083wZ0.m6666c(interfaceC34903Ob5, K83.m99169a(16384));
            if (m6666c instanceof List) {
                list = m6666c;
            }
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i2 = i - 1;
                    if (((InterfaceC34903Ob5) list.get(i)).mo90074l(event)) {
                        return true;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    i = i2;
                }
            }
            if (interfaceC34903Ob5.mo90074l(event) || interfaceC34903Ob5.mo90073u(event)) {
                return true;
            }
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((InterfaceC34903Ob5) list.get(i3)).mo90073u(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC32037Bv1
    /* renamed from: n */
    public void mo68846n(boolean z) {
        mo68852h(z, true);
    }

    /* renamed from: o */
    public EnumC47065pm2 m68845o() {
        EnumC47065pm2 enumC47065pm2 = this.f52951d;
        if (enumC47065pm2 != null) {
            return enumC47065pm2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    /* renamed from: p */
    public final FocusTargetModifierNode m68844p() {
        return this.f52948a;
    }

    /* renamed from: q */
    public final InterfaceC48231rk2 m68843q(InterfaceC50490vZ0 interfaceC50490vZ0) {
        boolean z;
        int m99169a = K83.m99169a(1024) | K83.m99169a(8192);
        if (interfaceC50490vZ0.mo8445r().m39254Q()) {
            InterfaceC41563gV2.AbstractC20914c mo8445r = interfaceC50490vZ0.mo8445r();
            InterfaceC48231rk2 interfaceC48231rk2 = null;
            if ((mo8445r.m39262G() & m99169a) != 0) {
                for (InterfaceC41563gV2.AbstractC20914c m39261I = mo8445r.m39261I(); m39261I != null; m39261I = m39261I.m39261I()) {
                    if ((m39261I.m39258M() & m99169a) != 0) {
                        if ((K83.m99169a(1024) & m39261I.m39258M()) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            return interfaceC48231rk2;
                        }
                        if (m39261I instanceof InterfaceC48231rk2) {
                            interfaceC48231rk2 = m39261I;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
            }
            return interfaceC48231rk2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: r */
    public final boolean m68842r(int i) {
        boolean m68811l;
        if (this.f52948a.m68831g0().mo76100b() && !this.f52948a.m68831g0().mo76101a()) {
            C11299c.C11300a c11300a = C11299c.f52961b;
            if (C11299c.m68811l(i, c11300a.m68803e())) {
                m68811l = true;
            } else {
                m68811l = C11299c.m68811l(i, c11300a.m68802f());
            }
            if (m68811l) {
                mo68846n(false);
                if (!this.f52948a.m68831g0().mo76101a()) {
                    return false;
                }
                return mo68851i(i);
            }
        }
        return false;
    }
}
