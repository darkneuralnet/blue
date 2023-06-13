package p000;

import androidx.compose.p003ui.graphics.C11327b;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a7\u0010\u0013\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f*N\b\u0002\u0010\"\"#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u00042#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006#"}, m28432d2 = {"LgM5;", "hostState", "LgV2;", "modifier", "Lkotlin/Function1;", "LcM5;", "", "snackbar", "b", "(LgM5;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V", "LeM5;", "", "hasAction", "LQ1;", "accessibilityManager", "", "h", "current", "content", C17296a.f69688o, "(LcM5;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V", "Llf;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "LsP5;", "f", "(Llf;ZLkotlin/jvm/functions/Function0;LEt0;II)LsP5;", "g", "(Llf;ZLEt0;I)LsP5;", "Lkotlin/ParameterName;", "name", "FadeInFadeOutTransition", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n76#2:374\n76#2:396\n25#3:375\n460#3,13:408\n473#3,3:428\n25#3:433\n25#3:440\n1114#4,6:376\n1114#4,6:434\n1114#4,6:441\n1549#5:382\n1620#5,3:383\n1620#5,3:386\n67#6,6:389\n73#6:421\n77#6:432\n75#7:395\n76#7,11:397\n89#7:431\n33#8,6:422\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n157#1:374\n316#1:396\n262#1:375\n316#1:408,13\n316#1:428,3\n348#1:433\n361#1:440\n262#1:376,6\n348#1:434,6\n361#1:441,6\n265#1:382\n265#1:383,3\n270#1:386,3\n316#1:389,6\n316#1:421\n316#1:432\n316#1:395\n316#1:397,11\n316#1:431\n318#1:422,6\n*E\n"})
/* renamed from: fM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40892fM5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,373:1\n67#2,6:374\n73#2:406\n77#2:411\n75#3:380\n76#3,11:382\n89#3:410\n76#4:381\n460#5,13:393\n473#5,3:407\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n299#1:374,6\n299#1:406\n299#1:411\n299#1:380\n299#1:382,11\n299#1:410\n299#1:381\n299#1:393,13\n299#1:407,3\n*E\n"})
    /* renamed from: fM5$a */
    /* loaded from: classes.dex */
    public static final class C20366a extends Lambda implements Function3<Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit>, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39096cM5 f79919g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC39096cM5 f79920h;

        /* renamed from: i */
        public final /* synthetic */ List<InterfaceC39096cM5> f79921i;

        /* renamed from: j */
        public final /* synthetic */ C51776xj1<InterfaceC39096cM5> f79922j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fM5$a$a */
        /* loaded from: classes.dex */
        public static final class C20367a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC39096cM5 f79923g;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: fM5$a$a$a */
            /* loaded from: classes.dex */
            public static final class C20368a extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ InterfaceC39096cM5 f79924g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C20368a(InterfaceC39096cM5 interfaceC39096cM5) {
                    super(0);
                    this.f79924g = interfaceC39096cM5;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    this.f79924g.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20367a(InterfaceC39096cM5 interfaceC39096cM5) {
                super(1);
                this.f79923g = interfaceC39096cM5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C47128ps5.m18613M(semantics, C37627Zs2.f49423b.m72370b());
                C47128ps5.m18589j(semantics, null, new C20368a(this.f79923g), 1, null);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fM5$a$b */
        /* loaded from: classes.dex */
        public static final class C20369b extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC39096cM5 f79925g;

            /* renamed from: h */
            public final /* synthetic */ C51776xj1<InterfaceC39096cM5> f79926h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: fM5$a$b$a */
            /* loaded from: classes.dex */
            public static final class C20370a extends Lambda implements Function1<C51183wj1<InterfaceC39096cM5>, Boolean> {

                /* renamed from: g */
                public final /* synthetic */ InterfaceC39096cM5 f79927g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C20370a(InterfaceC39096cM5 interfaceC39096cM5) {
                    super(1);
                    this.f79927g = interfaceC39096cM5;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Boolean invoke(C51183wj1<InterfaceC39096cM5> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(it.m6443c(), this.f79927g));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20369b(InterfaceC39096cM5 interfaceC39096cM5, C51776xj1<InterfaceC39096cM5> c51776xj1) {
                super(0);
                this.f79925g = interfaceC39096cM5;
                this.f79926h = c51776xj1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (Intrinsics.areEqual(this.f79925g, this.f79926h.m4795a())) {
                    return;
                }
                CollectionsKt__MutableCollectionsKt.removeAll((List) this.f79926h.m4794b(), (Function1) new C20370a(this.f79925g));
                InterfaceC45941ns4 m4793c = this.f79926h.m4793c();
                if (m4793c != null) {
                    m4793c.invalidate();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20366a(InterfaceC39096cM5 interfaceC39096cM5, InterfaceC39096cM5 interfaceC39096cM52, List<InterfaceC39096cM5> list, C51776xj1<InterfaceC39096cM5> c51776xj1) {
            super(3);
            this.f79919g = interfaceC39096cM5;
            this.f79920h = interfaceC39096cM52;
            this.f79921i = list;
            this.f79922j = c51776xj1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC32720Et0, ? super Integer, ? extends Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke((Function2<? super InterfaceC32720Et0, ? super Integer, Unit>) function2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> children, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            int i3;
            List filterNotNull;
            Intrinsics.checkNotNullParameter(children, "children");
            if ((i & 14) == 0) {
                i2 = i | (interfaceC32720Et0.mo89629I(children) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-94104314, i2, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
            }
            boolean areEqual = Intrinsics.areEqual(this.f79919g, this.f79920h);
            int i4 = areEqual ? 150 : 75;
            if (areEqual) {
                filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(this.f79921i);
                if (filterNotNull.size() != 1) {
                    i3 = 75;
                    InterfaceC48627sP5 m41504f = C40892fM5.m41504f(C26160mf.m25220j(i4, i3, C42549i91.m34394c()), areEqual, new C20369b(this.f79919g, this.f79922j), interfaceC32720Et0, 0, 0);
                    InterfaceC48627sP5 m41503g = C40892fM5.m41503g(C26160mf.m25220j(i4, i3, C42549i91.m34395b()), areEqual, interfaceC32720Et0, 0);
                    InterfaceC41563gV2 m40620b = C41198fs5.m40620b(C11327b.m68712c(InterfaceC41563gV2.f82354b0, ((Number) m41503g.getValue()).floatValue(), ((Number) m41503g.getValue()).floatValue(), ((Number) m41504f.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null), false, new C20367a(this.f79919g), 1, null);
                    interfaceC32720Et0.mo89638F(733328855);
                    InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, interfaceC32720Et0, 0);
                    interfaceC32720Et0.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m40620b);
                    if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                        C52468yt0.m2335c();
                    }
                    interfaceC32720Et0.mo89557h();
                    if (!interfaceC32720Et0.mo89521t()) {
                        interfaceC32720Et0.mo89617M(m113415a);
                    } else {
                        interfaceC32720Et0.mo89566e();
                    }
                    interfaceC32720Et0.mo89620L();
                    InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
                    C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                    C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                    C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                    C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                    interfaceC32720Et0.mo89530q();
                    m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                    interfaceC32720Et0.mo89638F(2058660585);
                    C40689f10 c40689f10 = C40689f10.f79291a;
                    children.invoke(interfaceC32720Et0, Integer.valueOf(i2 & 14));
                    interfaceC32720Et0.mo89605Q();
                    interfaceC32720Et0.mo89563f();
                    interfaceC32720Et0.mo89605Q();
                    interfaceC32720Et0.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                        return;
                    }
                    C35528Qt0.m87817Y();
                    return;
                }
            }
            i3 = 0;
            InterfaceC48627sP5 m41504f2 = C40892fM5.m41504f(C26160mf.m25220j(i4, i3, C42549i91.m34394c()), areEqual, new C20369b(this.f79919g, this.f79922j), interfaceC32720Et0, 0, 0);
            InterfaceC48627sP5 m41503g2 = C40892fM5.m41503g(C26160mf.m25220j(i4, i3, C42549i91.m34395b()), areEqual, interfaceC32720Et0, 0);
            InterfaceC41563gV2 m40620b2 = C41198fs5.m40620b(C11327b.m68712c(InterfaceC41563gV2.f82354b0, ((Number) m41503g2.getValue()).floatValue(), ((Number) m41503g2.getValue()).floatValue(), ((Number) m41504f2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null), false, new C20367a(this.f79919g), 1, null);
            interfaceC32720Et0.mo89638F(733328855);
            InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m40620b2);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            }
            interfaceC32720Et0.mo89557h();
            if (!interfaceC32720Et0.mo89521t()) {
            }
            interfaceC32720Et0.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a2, m44729h2, c0757a2.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
            interfaceC32720Et0.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            C40689f10 c40689f102 = C40689f10.f79291a;
            children.invoke(interfaceC32720Et0, Integer.valueOf(i2 & 14));
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fM5$b */
    /* loaded from: classes.dex */
    public static final class C20371b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<InterfaceC39096cM5, InterfaceC32720Et0, Integer, Unit> f79928g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC39096cM5 f79929h;

        /* renamed from: i */
        public final /* synthetic */ int f79930i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20371b(Function3<? super InterfaceC39096cM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC39096cM5 interfaceC39096cM5, int i) {
            super(2);
            this.f79928g = function3;
            this.f79929h = interfaceC39096cM5;
            this.f79930i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2041982076, i, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:319)");
            }
            Function3<InterfaceC39096cM5, InterfaceC32720Et0, Integer, Unit> function3 = this.f79928g;
            InterfaceC39096cM5 interfaceC39096cM5 = this.f79929h;
            Intrinsics.checkNotNull(interfaceC39096cM5);
            function3.invoke(interfaceC39096cM5, interfaceC32720Et0, Integer.valueOf((this.f79930i >> 3) & 112));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fM5$c */
    /* loaded from: classes.dex */
    public static final class C20372c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC39096cM5 f79931g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f79932h;

        /* renamed from: i */
        public final /* synthetic */ Function3<InterfaceC39096cM5, InterfaceC32720Et0, Integer, Unit> f79933i;

        /* renamed from: j */
        public final /* synthetic */ int f79934j;

        /* renamed from: k */
        public final /* synthetic */ int f79935k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20372c(InterfaceC39096cM5 interfaceC39096cM5, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC39096cM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f79931g = interfaceC39096cM5;
            this.f79932h = interfaceC41563gV2;
            this.f79933i = function3;
            this.f79934j = i;
            this.f79935k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C40892fM5.m41509a(this.f79931g, this.f79932h, this.f79933i, interfaceC32720Et0, C47127ps4.m18626a(this.f79934j | 1), this.f79935k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", m28418f = "SnackbarHost.kt", m28417i = {}, m28416l = {164}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fM5$d */
    /* loaded from: classes.dex */
    public static final class C20373d extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79936h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC39096cM5 f79937i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC6631Q1 f79938j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20373d(InterfaceC39096cM5 interfaceC39096cM5, InterfaceC6631Q1 interfaceC6631Q1, Continuation<? super C20373d> continuation) {
            super(2, continuation);
            this.f79937i = interfaceC39096cM5;
            this.f79938j = interfaceC6631Q1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20373d(this.f79937i, this.f79938j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C20373d) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            boolean z;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79936h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC39096cM5 interfaceC39096cM5 = this.f79937i;
                if (interfaceC39096cM5 != null) {
                    EnumC40299eM5 m61522c = interfaceC39096cM5.m61522c();
                    if (this.f79937i.m61523b() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long m41502h = C40892fM5.m41502h(m61522c, z, this.f79938j);
                    this.f79936h = 1;
                    if (C48120rZ0.m15768a(m41502h, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            this.f79937i.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fM5$e */
    /* loaded from: classes.dex */
    public static final class C20374e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C41485gM5 f79939g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f79940h;

        /* renamed from: i */
        public final /* synthetic */ Function3<InterfaceC39096cM5, InterfaceC32720Et0, Integer, Unit> f79941i;

        /* renamed from: j */
        public final /* synthetic */ int f79942j;

        /* renamed from: k */
        public final /* synthetic */ int f79943k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20374e(C41485gM5 c41485gM5, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC39096cM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i, int i2) {
            super(2);
            this.f79939g = c41485gM5;
            this.f79940h = interfaceC41563gV2;
            this.f79941i = function3;
            this.f79942j = i;
            this.f79943k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C40892fM5.m41508b(this.f79939g, this.f79940h, this.f79941i, interfaceC32720Et0, C47127ps4.m18626a(this.f79942j | 1), this.f79943k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fM5$f */
    /* loaded from: classes.dex */
    public /* synthetic */ class C20375f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC40299eM5.values().length];
            try {
                iArr[EnumC40299eM5.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC40299eM5.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC40299eM5.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fM5$g */
    /* loaded from: classes.dex */
    public static final class C20376g extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C20376g f79944g = new C20376g();

        public C20376g() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", m28418f = "SnackbarHost.kt", m28417i = {}, m28416l = {350}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fM5$h */
    /* loaded from: classes.dex */
    public static final class C20377h extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79945h;

        /* renamed from: i */
        public final /* synthetic */ C26560ne<Float, C28366sf> f79946i;

        /* renamed from: j */
        public final /* synthetic */ boolean f79947j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC25753lf<Float> f79948k;

        /* renamed from: l */
        public final /* synthetic */ Function0<Unit> f79949l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20377h(C26560ne<Float, C28366sf> c26560ne, boolean z, InterfaceC25753lf<Float> interfaceC25753lf, Function0<Unit> function0, Continuation<? super C20377h> continuation) {
            super(2, continuation);
            this.f79946i = c26560ne;
            this.f79947j = z;
            this.f79948k = interfaceC25753lf;
            this.f79949l = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20377h(this.f79946i, this.f79947j, this.f79948k, this.f79949l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C20377h) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            float f;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79945h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C26560ne<Float, C28366sf> c26560ne = this.f79946i;
                if (this.f79947j) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                Float boxFloat = Boxing.boxFloat(f);
                InterfaceC25753lf<Float> interfaceC25753lf = this.f79948k;
                this.f79945h = 1;
                if (C26560ne.m23393f(c26560ne, boxFloat, interfaceC25753lf, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f79949l.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", m28418f = "SnackbarHost.kt", m28417i = {}, m28416l = {363}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fM5$i */
    /* loaded from: classes.dex */
    public static final class C20378i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79950h;

        /* renamed from: i */
        public final /* synthetic */ C26560ne<Float, C28366sf> f79951i;

        /* renamed from: j */
        public final /* synthetic */ boolean f79952j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC25753lf<Float> f79953k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20378i(C26560ne<Float, C28366sf> c26560ne, boolean z, InterfaceC25753lf<Float> interfaceC25753lf, Continuation<? super C20378i> continuation) {
            super(2, continuation);
            this.f79951i = c26560ne;
            this.f79952j = z;
            this.f79953k = interfaceC25753lf;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20378i(this.f79951i, this.f79952j, this.f79953k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C20378i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            float f;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79950h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C26560ne<Float, C28366sf> c26560ne = this.f79951i;
                if (this.f79952j) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                Float boxFloat = Boxing.boxFloat(f);
                InterfaceC25753lf<Float> interfaceC25753lf = this.f79953k;
                this.f79950h = 1;
                if (C26560ne.m23393f(c26560ne, boxFloat, interfaceC25753lf, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9 A[LOOP:2: B:70:0x01e7->B:71:0x01e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m41509a(InterfaceC39096cM5 interfaceC39096cM5, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC39096cM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        InterfaceC41563gV2 interfaceC41563gV22;
        Object mo89635G;
        C51776xj1 c51776xj1;
        int size;
        int i7;
        int collectionSizeOrDefault;
        List mutableList;
        List<InterfaceC39096cM5> filterNotNull;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2036134589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC39096cM5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (mo89518u.mo89629I(function3)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            if ((i3 & 731) != 146 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC41563gV22 = obj;
            } else {
                if (i8 == 0) {
                    interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                } else {
                    interfaceC41563gV22 = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(2036134589, i3, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:256)");
                }
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new C51776xj1();
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                c51776xj1 = (C51776xj1) mo89635G;
                if (!Intrinsics.areEqual(interfaceC39096cM5, c51776xj1.m4795a())) {
                    c51776xj1.m4792d(interfaceC39096cM5);
                    List<C51183wj1> m4794b = c51776xj1.m4794b();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m4794b, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (C51183wj1 c51183wj1 : m4794b) {
                        arrayList.add((InterfaceC39096cM5) c51183wj1.m6443c());
                    }
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(interfaceC39096cM5)) {
                        mutableList.add(interfaceC39096cM5);
                    }
                    c51776xj1.m4794b().clear();
                    filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(mutableList);
                    List m4794b2 = c51776xj1.m4794b();
                    for (InterfaceC39096cM5 interfaceC39096cM52 : filterNotNull) {
                        m4794b2.add(new C51183wj1(interfaceC39096cM52, C43575jt0.m29791b(mo89518u, -94104314, true, new C20366a(interfaceC39096cM52, interfaceC39096cM5, mutableList, c51776xj1))));
                    }
                }
                int i9 = (i3 >> 3) & 14;
                mo89518u.mo89638F(733328855);
                int i10 = i9 >> 3;
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, (i10 & 112) | (i10 & 14));
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(interfaceC41563gV22);
                int i11 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i11 >> 3) & 112));
                mo89518u.mo89638F(2058660585);
                C40689f10 c40689f10 = C40689f10.f79291a;
                c51776xj1.m4791e(C52468yt0.m2336b(mo89518u, 0));
                mo89518u.mo89638F(-1656513320);
                List m4794b3 = c51776xj1.m4794b();
                size = m4794b3.size();
                for (i7 = 0; i7 < size; i7++) {
                    C51183wj1 c51183wj12 = (C51183wj1) m4794b3.get(i7);
                    InterfaceC39096cM5 interfaceC39096cM53 = (InterfaceC39096cM5) c51183wj12.m6445a();
                    Function3<Function2<? super InterfaceC32720Et0, ? super Integer, Unit>, InterfaceC32720Et0, Integer, Unit> m6444b = c51183wj12.m6444b();
                    mo89518u.mo89623K(-208579897, interfaceC39096cM53);
                    m6444b.invoke(C43575jt0.m29791b(mo89518u, 2041982076, true, new C20371b(function3, interfaceC39096cM53, i3)), mo89518u, 6);
                    mo89518u.mo89608P();
                }
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new C20372c(interfaceC39096cM5, interfaceC41563gV22, function3, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) != 146) {
        }
        if (i8 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
        }
        mo89518u.mo89605Q();
        c51776xj1 = (C51776xj1) mo89635G;
        if (!Intrinsics.areEqual(interfaceC39096cM5, c51776xj1.m4795a())) {
        }
        int i92 = (i3 >> 3) & 14;
        mo89518u.mo89638F(733328855);
        int i102 = i92 >> 3;
        InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, (i102 & 112) | (i102 & 14));
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(interfaceC41563gV22);
        int i112 = ((((i92 << 3) & 112) << 9) & 7168) | 6;
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2, m44729h2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i112 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        C40689f10 c40689f102 = C40689f10.f79291a;
        c51776xj1.m4791e(C52468yt0.m2336b(mo89518u, 0));
        mo89518u.mo89638F(-1656513320);
        List m4794b32 = c51776xj1.m4794b();
        size = m4794b32.size();
        while (i7 < size) {
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: b */
    public static final void m41508b(C41485gM5 hostState, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC39096cM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(hostState, "hostState");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(hostState)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89629I(function3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i7 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (i8 != 0) {
                function3 = C50689vt0.f114849a.m7868a();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(431012348, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)");
            }
            InterfaceC39096cM5 m39570a = hostState.m39570a();
            Y91.m75533f(m39570a, new C20373d(m39570a, (InterfaceC6631Q1) mo89518u.mo89572c(C42399hu0.m35616c()), null), mo89518u, 64);
            m41509a(hostState.m39570a(), interfaceC41563gV2, function3, mo89518u, (i3 & 112) | (i3 & 896), 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        Function3<? super InterfaceC39096cM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function32 = function3;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C20374e(hostState, interfaceC41563gV22, function32, i, i2));
        }
    }

    /* renamed from: f */
    public static final InterfaceC48627sP5<Float> m41504f(InterfaceC25753lf<Float> interfaceC25753lf, boolean z, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        float f;
        interfaceC32720Et0.mo89638F(1016418159);
        if ((i2 & 4) != 0) {
            function0 = C20376g.f79944g;
        }
        Function0<Unit> function02 = function0;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            mo89635G = C28794te.m11987b(f, 0.0f, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C26560ne c26560ne = (C26560ne) mo89635G;
        Y91.m75533f(Boolean.valueOf(z), new C20377h(c26560ne, z, interfaceC25753lf, function02, null), interfaceC32720Et0, ((i >> 3) & 14) | 64);
        InterfaceC48627sP5<Float> m23392g = c26560ne.m23392g();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m23392g;
    }

    /* renamed from: g */
    public static final InterfaceC48627sP5<Float> m41503g(InterfaceC25753lf<Float> interfaceC25753lf, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        float f;
        interfaceC32720Et0.mo89638F(2003504988);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            if (!z) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            mo89635G = C28794te.m11987b(f, 0.0f, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C26560ne c26560ne = (C26560ne) mo89635G;
        Y91.m75533f(Boolean.valueOf(z), new C20378i(c26560ne, z, interfaceC25753lf, null), interfaceC32720Et0, ((i >> 3) & 14) | 64);
        InterfaceC48627sP5<Float> m23392g = c26560ne.m23392g();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m23392g;
    }

    /* renamed from: h */
    public static final long m41502h(EnumC40299eM5 enumC40299eM5, boolean z, InterfaceC6631Q1 interfaceC6631Q1) {
        long j;
        Intrinsics.checkNotNullParameter(enumC40299eM5, "<this>");
        int i = C20375f.$EnumSwitchMapping$0[enumC40299eM5.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    j = 4000;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j = AbstractComponentTracker.LINGERING_TIMEOUT;
            }
        } else {
            j = LongCompanionObject.MAX_VALUE;
        }
        long j2 = j;
        if (interfaceC6631Q1 == null) {
            return j2;
        }
        return interfaceC6631Q1.mo30268a(j2, true, true, z);
    }
}
