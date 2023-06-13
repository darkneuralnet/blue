package p000;

import androidx.compose.p003ui.focus.FocusTargetModifierNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bJ'\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LAv1;", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "node", "", "f", "Lvv1;", DateTokenConverter.CONVERTER_KEY, "LRv1;", "e", "T", "", "g", "(Ljava/util/Set;Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/Function0;", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "onRequestApplyChangesListener", "b", "Ljava/util/Set;", "focusTargetNodes", "c", "focusEventNodes", "focusPropertiesNodes", "Lkotlin/jvm/functions/Function0;", "invalidateNodes", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Av1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31803Av1 {

    /* renamed from: a */
    public final Function1<Function0<Unit>, Unit> f1357a;

    /* renamed from: b */
    public Set<FocusTargetModifierNode> f1358b;

    /* renamed from: c */
    public Set<InterfaceC50710vv1> f1359c;

    /* renamed from: d */
    public Set<InterfaceC35781Rv1> f1360d;

    /* renamed from: e */
    public final Function0<Unit> f1361e;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,141:1\n1855#2:142\n1856#2:173\n1855#2:174\n1856#2:205\n1855#2,2:206\n87#3:143\n87#3:175\n340#4:144\n206#4,2:145\n208#4,7:150\n215#4,15:158\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n1182#5:147\n1161#5,2:148\n1182#5:179\n1161#5,2:180\n48#6:157\n48#6:189\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager$invalidateNodes$1\n*L\n64#1:142\n64#1:173\n73#1:174\n73#1:205\n121#1:206,2\n65#1:143\n87#1:175\n65#1:144\n65#1:145,2\n65#1:150,7\n65#1:158,15\n87#1:176\n87#1:177,2\n87#1:182,7\n87#1:190,15\n65#1:147\n65#1:148,2\n87#1:179\n87#1:180,2\n65#1:157\n87#1:189\n*E\n"})
    /* renamed from: Av1$a */
    /* loaded from: classes.dex */
    public static final class C0303a extends Lambda implements Function0<Unit> {
        public C0303a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC36951Wv1 interfaceC36951Wv1;
            Set set = C31803Av1.this.f1360d;
            C31803Av1 c31803Av1 = C31803Av1.this;
            Iterator it = set.iterator();
            while (true) {
                int i = 16;
                if (it.hasNext()) {
                    InterfaceC35781Rv1 interfaceC35781Rv1 = (InterfaceC35781Rv1) it.next();
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
                                            c31803Av1.f1358b.add((FocusTargetModifierNode) abstractC20914c);
                                        }
                                    } else {
                                        abstractC20914c = abstractC20914c.m39261I();
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    C31803Av1.this.f1360d.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Set<InterfaceC50710vv1> set2 = C31803Av1.this.f1359c;
                    C31803Av1 c31803Av12 = C31803Av1.this;
                    for (InterfaceC50710vv1 interfaceC50710vv1 : set2) {
                        if (!interfaceC50710vv1.mo8445r().m39254Q()) {
                            interfaceC50710vv1.mo7774F(EnumC37185Xv1.Inactive);
                        } else {
                            int m99169a2 = K83.m99169a(1024);
                            if (interfaceC50710vv1.mo8445r().m39254Q()) {
                                LX2 lx22 = new LX2(new InterfaceC41563gV2.AbstractC20914c[i], 0);
                                InterfaceC41563gV2.AbstractC20914c m39261I2 = interfaceC50710vv1.mo8445r().m39261I();
                                if (m39261I2 == null) {
                                    C51083wZ0.m6667b(lx22, interfaceC50710vv1.mo8445r());
                                } else {
                                    lx22.m96701b(m39261I2);
                                }
                                FocusTargetModifierNode focusTargetModifierNode = null;
                                boolean z = true;
                                boolean z2 = false;
                                while (lx22.m96687x()) {
                                    InterfaceC41563gV2.AbstractC20914c abstractC20914c2 = (InterfaceC41563gV2.AbstractC20914c) lx22.m96707C(lx22.m96690u() - 1);
                                    if ((abstractC20914c2.m39262G() & m99169a2) == 0) {
                                        C51083wZ0.m6667b(lx22, abstractC20914c2);
                                    } else {
                                        while (true) {
                                            if (abstractC20914c2 == null) {
                                                break;
                                            } else if ((abstractC20914c2.m39258M() & m99169a2) != 0) {
                                                if (abstractC20914c2 instanceof FocusTargetModifierNode) {
                                                    FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) abstractC20914c2;
                                                    if (focusTargetModifierNode != null) {
                                                        z2 = true;
                                                    }
                                                    if (c31803Av12.f1358b.contains(focusTargetModifierNode2)) {
                                                        linkedHashSet.add(focusTargetModifierNode2);
                                                        z = false;
                                                    }
                                                    focusTargetModifierNode = focusTargetModifierNode2;
                                                }
                                            } else {
                                                abstractC20914c2 = abstractC20914c2.m39261I();
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    if (z2) {
                                        interfaceC36951Wv1 = C51303wv1.m6105a(interfaceC50710vv1);
                                    } else if (focusTargetModifierNode == null || (interfaceC36951Wv1 = focusTargetModifierNode.m68831g0()) == null) {
                                        interfaceC36951Wv1 = EnumC37185Xv1.Inactive;
                                    }
                                    interfaceC50710vv1.mo7774F(interfaceC36951Wv1);
                                }
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                        i = 16;
                    }
                    C31803Av1.this.f1359c.clear();
                    for (FocusTargetModifierNode focusTargetModifierNode3 : C31803Av1.this.f1358b) {
                        if (focusTargetModifierNode3.m39254Q()) {
                            InterfaceC36951Wv1 m68831g0 = focusTargetModifierNode3.m68831g0();
                            focusTargetModifierNode3.m68829i0();
                            if (!Intrinsics.areEqual(m68831g0, focusTargetModifierNode3.m68831g0()) || linkedHashSet.contains(focusTargetModifierNode3)) {
                                C51303wv1.m6104b(focusTargetModifierNode3);
                            }
                        }
                    }
                    C31803Av1.this.f1358b.clear();
                    linkedHashSet.clear();
                    if (C31803Av1.this.f1360d.isEmpty()) {
                        if (C31803Av1.this.f1359c.isEmpty()) {
                            if (!C31803Av1.this.f1358b.isEmpty()) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            return;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31803Av1(Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.f1357a = onRequestApplyChangesListener;
        this.f1358b = new LinkedHashSet();
        this.f1359c = new LinkedHashSet();
        this.f1360d = new LinkedHashSet();
        this.f1361e = new C0303a();
    }

    /* renamed from: d */
    public final void m114955d(InterfaceC50710vv1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m114952g(this.f1359c, node);
    }

    /* renamed from: e */
    public final void m114954e(InterfaceC35781Rv1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m114952g(this.f1360d, node);
    }

    /* renamed from: f */
    public final void m114953f(FocusTargetModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m114952g(this.f1358b, node);
    }

    /* renamed from: g */
    public final <T> void m114952g(Set<T> set, T t) {
        if (set.contains(t)) {
            return;
        }
        set.add(t);
        if (this.f1358b.size() + this.f1359c.size() + this.f1360d.size() == 1) {
            this.f1357a.invoke(this.f1361e);
        }
    }
}
