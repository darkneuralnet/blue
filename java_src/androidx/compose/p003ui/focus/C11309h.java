package androidx.compose.p003ui.focus;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Landroidx/compose/ui/focus/h;", "", "", "e", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "", "onFound", "c", "(Lkotlin/jvm/functions/Function1;)Z", "LLX2;", "LUv1;", C17296a.f69688o, "LLX2;", DateTokenConverter.CONVERTER_KEY, "()LLX2;", "getFocusRequesterNodes$ui_release$annotations", "()V", "focusRequesterNodes", "<init>", "b", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,201:1\n1182#2:202\n1161#2,2:203\n1182#2:217\n1161#2,2:218\n1#3:205\n460#4,7:206\n48#4:227\n467#4,4:243\n460#4,11:247\n460#4,11:258\n87#5:213\n340#6:214\n206#6,2:215\n208#6,7:220\n215#6,15:228\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n53#1:202\n53#1:203,2\n85#1:217\n85#1:218,2\n84#1:206,7\n85#1:227\n84#1:243,4\n113#1:247,11\n138#1:258,11\n85#1:213\n85#1:214\n85#1:215,2\n85#1:220,7\n85#1:228,15\n*E\n"})
/* renamed from: androidx.compose.ui.focus.h */
/* loaded from: classes.dex */
public final class C11309h {

    /* renamed from: c */
    public static final int f52989c = 0;

    /* renamed from: a */
    public final LX2<InterfaceC36483Uv1> f52992a = new LX2<>(new InterfaceC36483Uv1[16], 0);

    /* renamed from: b */
    public static final C11310a f52988b = new C11310a(null);

    /* renamed from: d */
    public static final C11309h f52990d = new C11309h();

    /* renamed from: e */
    public static final C11309h f52991e = new C11309h();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, m28432d2 = {"Landroidx/compose/ui/focus/h$a;", "", "Landroidx/compose/ui/focus/h;", "Default", "Landroidx/compose/ui/focus/h;", "b", "()Landroidx/compose/ui/focus/h;", "Cancel", C17296a.f69688o, "getCancel$annotations", "()V", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.h$a */
    /* loaded from: classes.dex */
    public static final class C11310a {
        public /* synthetic */ C11310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C11309h m68778a() {
            return C11309h.f52991e;
        }

        /* renamed from: b */
        public final C11309h m68777b() {
            return C11309h.f52990d;
        }

        private C11310a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "it", "", C17296a.f69688o, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.focus.h$b */
    /* loaded from: classes.dex */
    public static final class C11311b extends Lambda implements Function1<FocusTargetModifierNode, Boolean> {

        /* renamed from: g */
        public static final C11311b f52993g = new C11311b();

        public C11311b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FocusTargetModifierNode it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C11313j.m68770e(it));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0063, code lost:
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m68781c(Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        if (!Intrinsics.areEqual(this, f52990d)) {
            if (!Intrinsics.areEqual(this, f52991e)) {
                if (this.f52992a.m96687x()) {
                    LX2<InterfaceC36483Uv1> lx2 = this.f52992a;
                    int m96690u = lx2.m96690u();
                    if (m96690u <= 0) {
                        return false;
                    }
                    InterfaceC36483Uv1[] m96691s = lx2.m96691s();
                    int i = 0;
                    boolean z = false;
                    do {
                        InterfaceC36483Uv1 interfaceC36483Uv1 = m96691s[i];
                        int m99169a = K83.m99169a(1024);
                        if (interfaceC36483Uv1.mo8445r().m39254Q()) {
                            LX2 lx22 = new LX2(new InterfaceC41563gV2.AbstractC20914c[16], 0);
                            InterfaceC41563gV2.AbstractC20914c m39261I = interfaceC36483Uv1.mo8445r().m39261I();
                            if (m39261I == null) {
                                C51083wZ0.m6668a(lx22, interfaceC36483Uv1.mo8445r());
                            } else {
                                lx22.m96701b(m39261I);
                            }
                            while (true) {
                                if (!lx22.m96687x()) {
                                    break;
                                }
                                InterfaceC41563gV2.AbstractC20914c abstractC20914c = (InterfaceC41563gV2.AbstractC20914c) lx22.m96707C(lx22.m96690u() - 1);
                                if ((abstractC20914c.m39262G() & m99169a) == 0) {
                                    C51083wZ0.m6668a(lx22, abstractC20914c);
                                } else {
                                    while (true) {
                                        if (abstractC20914c == null) {
                                            break;
                                        } else if ((abstractC20914c.m39258M() & m99169a) != 0) {
                                            if ((abstractC20914c instanceof FocusTargetModifierNode) && onFound.invoke((FocusTargetModifierNode) abstractC20914c).booleanValue()) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            abstractC20914c = abstractC20914c.m39261I();
                                        }
                                    }
                                }
                            }
                            i++;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } while (i < m96690u);
                    return z;
                }
                throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
            }
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
    }

    /* renamed from: d */
    public final LX2<InterfaceC36483Uv1> m68780d() {
        return this.f52992a;
    }

    /* renamed from: e */
    public final void m68779e() {
        m68781c(C11311b.f52993g);
    }
}
