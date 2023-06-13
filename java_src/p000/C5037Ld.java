package p000;

import androidx.compose.p003ui.draw.C11289a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import net.danlew.android.joda.DateUtils;
import p000.C46390oe0;
import p000.C48841sm0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a3\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"LCe3;", "position", "", "isStartHandle", "LUL4;", "direction", "handlesCrossed", "LgV2;", "modifier", "Lkotlin/Function0;", "", "content", "c", "(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;LEt0;I)V", C17296a.f69688o, "(LgV2;ZLUL4;ZLEt0;I)V", "f", "Le80;", "", "radius", "LMW1;", "e", "LLE1;", "handleReferencePoint", "b", "(JLLE1;Lkotlin/jvm/functions/Function2;LEt0;I)V", "h", "areHandlesCrossed", "g", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n558#2,17:332\n50#3:349\n49#3:350\n1114#4,6:351\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n194#1:332,17\n232#1:349\n232#1:350\n232#1:351,6\n*E\n"})
/* renamed from: Ld */
/* loaded from: classes.dex */
public final class C5037Ld {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ld$a */
    /* loaded from: classes.dex */
    public static final class C5038a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f21776g;

        /* renamed from: h */
        public final /* synthetic */ boolean f21777h;

        /* renamed from: i */
        public final /* synthetic */ UL4 f21778i;

        /* renamed from: j */
        public final /* synthetic */ boolean f21779j;

        /* renamed from: k */
        public final /* synthetic */ int f21780k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5038a(InterfaceC41563gV2 interfaceC41563gV2, boolean z, UL4 ul4, boolean z2, int i) {
            super(2);
            this.f21776g = interfaceC41563gV2;
            this.f21777h = z;
            this.f21778i = ul4;
            this.f21779j = z2;
            this.f21780k = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C5037Ld.m96550a(this.f21776g, this.f21777h, this.f21778i, this.f21779j, interfaceC32720Et0, C47127ps4.m18626a(this.f21780k | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ld$b */
    /* loaded from: classes.dex */
    public static final class C5039b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f21781g;

        /* renamed from: h */
        public final /* synthetic */ LE1 f21782h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f21783i;

        /* renamed from: j */
        public final /* synthetic */ int f21784j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5039b(long j, LE1 le1, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f21781g = j;
            this.f21782h = le1;
            this.f21783i = function2;
            this.f21784j = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C5037Ld.m96549b(this.f21781g, this.f21782h, this.f21783i, interfaceC32720Et0, C47127ps4.m18626a(this.f21784j | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n50#2:332\n49#2:333\n1114#3,6:334\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$SelectionHandle$1\n*L\n74#1:332\n74#1:333\n74#1:334,6\n*E\n"})
    /* renamed from: Ld$c */
    /* loaded from: classes.dex */
    public static final class C5040c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f21785g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f21786h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21787i;

        /* renamed from: j */
        public final /* synthetic */ long f21788j;

        /* renamed from: k */
        public final /* synthetic */ int f21789k;

        /* renamed from: l */
        public final /* synthetic */ UL4 f21790l;

        /* renamed from: m */
        public final /* synthetic */ boolean f21791m;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ld$c$a */
        /* loaded from: classes.dex */
        public static final class C5041a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f21792g;

            /* renamed from: h */
            public final /* synthetic */ long f21793h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5041a(boolean z, long j) {
                super(1);
                this.f21792g = z;
                this.f21793h = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                HE1 he1;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C48314rs5<C35749Rr5> m84736d = C35983Sr5.m84736d();
                if (this.f21792g) {
                    he1 = HE1.SelectionStart;
                } else {
                    he1 = HE1.SelectionEnd;
                }
                semantics.mo13560a(m84736d, new C35749Rr5(he1, this.f21793h, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5040c(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC41563gV2 interfaceC41563gV2, boolean z, long j, int i, UL4 ul4, boolean z2) {
            super(2);
            this.f21785g = function2;
            this.f21786h = interfaceC41563gV2;
            this.f21787i = z;
            this.f21788j = j;
            this.f21789k = i;
            this.f21790l = ul4;
            this.f21791m = z2;
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
                C35528Qt0.m87816Z(732099485, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
            }
            if (this.f21785g == null) {
                interfaceC32720Et0.mo89638F(386443790);
                InterfaceC41563gV2 interfaceC41563gV2 = this.f21786h;
                Boolean valueOf = Boolean.valueOf(this.f21787i);
                C32120Ce3 m111955d = C32120Ce3.m111955d(this.f21788j);
                boolean z = this.f21787i;
                long j = this.f21788j;
                interfaceC32720Et0.mo89638F(511388516);
                boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(m111955d);
                Object mo89635G = interfaceC32720Et0.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new C5041a(z, j);
                    interfaceC32720Et0.mo89503z(mo89635G);
                }
                interfaceC32720Et0.mo89605Q();
                InterfaceC41563gV2 m40620b = C41198fs5.m40620b(interfaceC41563gV2, false, (Function1) mo89635G, 1, null);
                boolean z2 = this.f21787i;
                UL4 ul4 = this.f21790l;
                boolean z3 = this.f21791m;
                int i2 = this.f21789k;
                C5037Ld.m96550a(m40620b, z2, ul4, z3, interfaceC32720Et0, (i2 & 112) | (i2 & 896) | (i2 & 7168));
                interfaceC32720Et0.mo89605Q();
            } else {
                interfaceC32720Et0.mo89638F(386444465);
                this.f21785g.invoke(interfaceC32720Et0, Integer.valueOf((this.f21789k >> 15) & 14));
                interfaceC32720Et0.mo89605Q();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ld$d */
    /* loaded from: classes.dex */
    public static final class C5042d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f21794g;

        /* renamed from: h */
        public final /* synthetic */ boolean f21795h;

        /* renamed from: i */
        public final /* synthetic */ UL4 f21796i;

        /* renamed from: j */
        public final /* synthetic */ boolean f21797j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC41563gV2 f21798k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f21799l;

        /* renamed from: m */
        public final /* synthetic */ int f21800m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5042d(long j, boolean z, UL4 ul4, boolean z2, InterfaceC41563gV2 interfaceC41563gV2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f21794g = j;
            this.f21795h = z;
            this.f21796i = ul4;
            this.f21797j = z2;
            this.f21798k = interfaceC41563gV2;
            this.f21799l = function2;
            this.f21800m = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C5037Ld.m96548c(this.f21794g, this.f21795h, this.f21796i, this.f21797j, this.f21798k, this.f21799l, interfaceC32720Et0, C47127ps4.m18626a(this.f21800m | 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n76#2:332\n83#3,3:333\n1114#4,6:336\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1\n*L\n114#1:332\n116#1:333,3\n116#1:336,6\n*E\n"})
    /* renamed from: Ld$e */
    /* loaded from: classes.dex */
    public static final class C5043e extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21801g;

        /* renamed from: h */
        public final /* synthetic */ UL4 f21802h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21803i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ld$e$a */
        /* loaded from: classes.dex */
        public static final class C5044a extends Lambda implements Function1<C40166e80, H61> {

            /* renamed from: g */
            public final /* synthetic */ long f21804g;

            /* renamed from: h */
            public final /* synthetic */ boolean f21805h;

            /* renamed from: i */
            public final /* synthetic */ UL4 f21806i;

            /* renamed from: j */
            public final /* synthetic */ boolean f21807j;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,331:1\n173#2,6:332\n261#2,11:338\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n*L\n125#1:332,6\n125#1:338,11\n*E\n"})
            /* renamed from: Ld$e$a$a */
            /* loaded from: classes.dex */
            public static final class C5045a extends Lambda implements Function1<InterfaceC42558iA0, Unit> {

                /* renamed from: g */
                public final /* synthetic */ boolean f21808g;

                /* renamed from: h */
                public final /* synthetic */ UL4 f21809h;

                /* renamed from: i */
                public final /* synthetic */ boolean f21810i;

                /* renamed from: j */
                public final /* synthetic */ MW1 f21811j;

                /* renamed from: k */
                public final /* synthetic */ C48841sm0 f21812k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5045a(boolean z, UL4 ul4, boolean z2, MW1 mw1, C48841sm0 c48841sm0) {
                    super(1);
                    this.f21808g = z;
                    this.f21809h = ul4;
                    this.f21810i = z2;
                    this.f21811j = mw1;
                    this.f21812k = c48841sm0;
                }

                /* renamed from: a */
                public final void m96540a(InterfaceC42558iA0 onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.mo34387n0();
                    if (C5037Ld.m96543h(this.f21808g, this.f21809h, this.f21810i)) {
                        MW1 mw1 = this.f21811j;
                        C48841sm0 c48841sm0 = this.f21812k;
                        long mo96359l0 = onDrawWithContent.mo96359l0();
                        C61 mo20750d0 = onDrawWithContent.mo20750d0();
                        long mo20721h = mo20750d0.mo20721h();
                        mo20750d0.mo20724a().mo25245v();
                        mo20750d0.mo20722c().mo19025d(-1.0f, 1.0f, mo96359l0);
                        I61.m102949a0(onDrawWithContent, mw1, 0L, 0.0f, null, c48841sm0, 0, 46, null);
                        mo20750d0.mo20724a().mo25251p();
                        mo20750d0.mo20723b(mo20721h);
                        return;
                    }
                    I61.m102949a0(onDrawWithContent, this.f21811j, 0L, 0.0f, null, this.f21812k, 0, 46, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC42558iA0 interfaceC42558iA0) {
                    m96540a(interfaceC42558iA0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5044a(long j, boolean z, UL4 ul4, boolean z2) {
                super(1);
                this.f21804g = j;
                this.f21805h = z;
                this.f21806i = ul4;
                this.f21807j = z2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final H61 invoke(C40166e80 drawWithCache) {
                Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                return drawWithCache.m43235d(new C5045a(this.f21805h, this.f21806i, this.f21807j, C5037Ld.m96546e(drawWithCache, C51465xB5.m5730i(drawWithCache.m43232h()) / 2.0f), C48841sm0.C28383a.m13699b(C48841sm0.f109227b, this.f21804g, 0, 2, null)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5043e(boolean z, UL4 ul4, boolean z2) {
            super(3);
            this.f21801g = z;
            this.f21802h = ul4;
            this.f21803i = z2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
            if (r0 == p000.InterfaceC32720Et0.f8257a.m108267a()) goto L18;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC41563gV2 m96542a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Object obj;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-1538687176);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1538687176, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:112)");
            }
            long m114776b = ((B26) interfaceC32720Et0.mo89572c(C26.m112949b())).m114776b();
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            Object[] objArr = {C47063pm0.m18747i(m114776b), Boolean.valueOf(this.f21801g), this.f21802h, Boolean.valueOf(this.f21803i)};
            boolean z = this.f21801g;
            UL4 ul4 = this.f21802h;
            boolean z2 = this.f21803i;
            interfaceC32720Et0.mo89638F(-568225417);
            boolean z3 = false;
            for (int i2 = 0; i2 < 4; i2++) {
                z3 |= interfaceC32720Et0.mo89539n(objArr[i2]);
            }
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (!z3) {
                obj = mo89635G;
            }
            C5044a c5044a = new C5044a(m114776b, z, ul4, z2);
            interfaceC32720Et0.mo89503z(c5044a);
            obj = c5044a;
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 mo39266t0 = composed.mo39266t0(C11289a.m68866b(c20912a, (Function1) obj));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return mo39266t0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m96542a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final void m96550a(InterfaceC41563gV2 modifier, boolean z, UL4 direction, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(direction, "direction");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(47957398);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(modifier)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(direction)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89536o(z2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(47957398, i, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            DN5.m110552a(m96545f(BB5.m114245x(modifier, C35983Sr5.m84737c(), C35983Sr5.m84738b()), z, direction, z2), mo89518u, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C5038a(modifier, z, direction, z2, i));
        }
    }

    /* renamed from: b */
    public static final void m96549b(long j, LE1 handleReferencePoint, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int roundToInt;
        int roundToInt2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(handleReferencePoint, "handleReferencePoint");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1409050158);
        if ((i & 14) == 0) {
            if (mo89518u.mo89524s(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(handleReferencePoint)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89629I(content)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1409050158, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:224)");
            }
            roundToInt = MathKt__MathJVMKt.roundToInt(C32120Ce3.m111944o(j));
            roundToInt2 = MathKt__MathJVMKt.roundToInt(C32120Ce3.m111943p(j));
            long m114704a = B52.m114704a(roundToInt, roundToInt2);
            A52 m116119b = A52.m116119b(m114704a);
            mo89518u.mo89638F(511388516);
            boolean mo89539n = mo89518u.mo89539n(m116119b) | mo89518u.mo89539n(handleReferencePoint);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new JE1(handleReferencePoint, m114704a, null);
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C30242xd.m4931a((JE1) mo89635G, null, new AY3(false, false, false, null, true, false, 15, null), content, mo89518u, ((i2 << 3) & 7168) | 384, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C5039b(j, handleReferencePoint, content, i));
        }
    }

    /* renamed from: c */
    public static final void m96548c(long j, boolean z, UL4 direction, boolean z2, InterfaceC41563gV2 modifier, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        LE1 le1;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-616295642);
        if ((i & 14) == 0) {
            if (mo89518u.mo89524s(j)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(direction)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89536o(z2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (mo89518u.mo89539n(modifier)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (mo89518u.mo89629I(function2)) {
                i3 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((374491 & i9) == 74898 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-616295642, i9, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            if (m96543h(z, direction, z2)) {
                le1 = LE1.TopRight;
            } else {
                le1 = LE1.TopLeft;
            }
            m96549b(j, le1, C43575jt0.m29791b(mo89518u, 732099485, true, new C5040c(function2, modifier, z, j, i9, direction, z2)), mo89518u, (i9 & 14) | 384);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C5042d(j, z, direction, z2, modifier, function2, i));
        }
    }

    /* renamed from: e */
    public static final MW1 m96546e(C40166e80 c40166e80, float f) {
        Intrinsics.checkNotNullParameter(c40166e80, "<this>");
        int ceil = ((int) Math.ceil(f)) * 2;
        IE1 ie1 = IE1.f14826a;
        MW1 m102773c = ie1.m102773c();
        InterfaceC45204me0 m102775a = ie1.m102775a();
        C46390oe0 m102774b = ie1.m102774b();
        if (m102773c == null || m102775a == null || ceil > m102773c.getWidth() || ceil > m102773c.getHeight()) {
            m102773c = OW1.m92123b(ceil, ceil, NW1.f24729b.m93818a(), false, null, 24, null);
            ie1.m102770f(m102773c);
            m102775a = C48761se0.m13917a(m102773c);
            ie1.m102772d(m102775a);
        }
        MW1 mw1 = m102773c;
        InterfaceC45204me0 interfaceC45204me0 = m102775a;
        if (m102774b == null) {
            m102774b = new C46390oe0();
            ie1.m102771e(m102774b);
        }
        C46390oe0 c46390oe0 = m102774b;
        EnumC47065pm2 layoutDirection = c40166e80.getLayoutDirection();
        long m112663a = CB5.m112663a(mw1.getWidth(), mw1.getHeight());
        C46390oe0.C27018a m20741o = c46390oe0.m20741o();
        InterfaceC41273g01 m20736a = m20741o.m20736a();
        EnumC47065pm2 m20735b = m20741o.m20735b();
        InterfaceC45204me0 m20734c = m20741o.m20734c();
        long m20733d = m20741o.m20733d();
        C46390oe0.C27018a m20741o2 = c46390oe0.m20741o();
        m20741o2.m20727j(c40166e80);
        m20741o2.m20726k(layoutDirection);
        m20741o2.m20728i(interfaceC45204me0);
        m20741o2.m20725l(m112663a);
        interfaceC45204me0.mo25245v();
        I61.m102945z0(c46390oe0, C47063pm0.f104050b.m18732a(), 0L, c46390oe0.mo96360h(), 0.0f, null, null, C5016LW.f21593b.m96746a(), 58, null);
        I61.m102945z0(c46390oe0, C50619vm0.m8178c(4278190080L), C32120Ce3.f4427b.m111932c(), CB5.m112663a(f, f), 0.0f, null, null, 0, 120, null);
        I61.m102955J(c46390oe0, C50619vm0.m8178c(4278190080L), f, C33056Ge3.m104938a(f, f), 0.0f, null, null, 0, 120, null);
        interfaceC45204me0.mo25251p();
        C46390oe0.C27018a m20741o3 = c46390oe0.m20741o();
        m20741o3.m20727j(m20736a);
        m20741o3.m20726k(m20735b);
        m20741o3.m20728i(m20734c);
        m20741o3.m20725l(m20733d);
        return mw1;
    }

    /* renamed from: f */
    public static final InterfaceC41563gV2 m96545f(InterfaceC41563gV2 interfaceC41563gV2, boolean z, UL4 direction, boolean z2) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return C32486Dt0.m109807b(interfaceC41563gV2, null, new C5043e(z, direction, z2), 1, null);
    }

    /* renamed from: g */
    public static final boolean m96544g(UL4 direction, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        if ((direction == UL4.Ltr && !z) || (direction == UL4.Rtl && z)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m96543h(boolean z, UL4 ul4, boolean z2) {
        if (z) {
            return m96544g(ul4, z2);
        }
        if (!m96544g(ul4, z2)) {
            return true;
        }
        return false;
    }
}
