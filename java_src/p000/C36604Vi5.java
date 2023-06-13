package p000;

import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0084\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001aq\u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\"\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b0\u00101\"\u0017\u00104\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, m28432d2 = {"Lm71;", "drawerState", "LgM5;", "snackbarHostState", "LXi5;", "f", "(Lm71;LgM5;LEt0;II)LXi5;", "LgV2;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Lbj1;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "LPm0;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "drawerGesturesEnabled", "Lhy5;", "drawerShape", "Lk61;", "drawerElevation", "Lpm0;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "LPD3;", "content", C17296a.f69688o, "(LgV2;LXi5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLhy5;FJJJJJLkotlin/jvm/functions/Function3;LEt0;III)V", "isFabDocked", "fabPosition", "snackbar", "fab", "b", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;I)V", "LU94;", "Laj1;", "LU94;", "e", "()LU94;", "LocalFabPlacement", "F", "FabSpacing", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,375:1\n25#2:376\n25#2:383\n83#2,3:390\n1114#3,6:377\n1114#3,6:384\n1114#3,6:393\n154#4:399\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n65#1:376\n66#1:383\n237#1:390,3\n65#1:377,6\n66#1:384,6\n237#1:393,6\n372#1:399\n*E\n"})
/* renamed from: Vi5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36604Vi5 {

    /* renamed from: a */
    public static final U94<C38122aj1> f39509a = C41806gu0.m37350d(C8728a.f39511g);

    /* renamed from: b */
    public static final float f39510b = C43705k61.m29303g(16);

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Laj1;", "b", "()Laj1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vi5$a */
    /* loaded from: classes.dex */
    public static final class C8728a extends Lambda implements Function0<C38122aj1> {

        /* renamed from: g */
        public static final C8728a f39511g = new C8728a();

        public C8728a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C38122aj1 invoke() {
            return null;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vi5$b */
    /* loaded from: classes.dex */
    public static final class C8729b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> f39512g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8729b(Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
            super(2);
            this.f39512g = function3;
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
                C35528Qt0.m87816Z(100842932, i, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
            }
            this.f39512g.invoke(InterfaceC41563gV2.f82354b0, interfaceC32720Et0, 54);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vi5$c */
    /* loaded from: classes.dex */
    public static final class C8730c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: A */
        public final /* synthetic */ int f39513A;

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f39514g;

        /* renamed from: h */
        public final /* synthetic */ C37072Xi5 f39515h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39516i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39517j;

        /* renamed from: k */
        public final /* synthetic */ Function3<C41485gM5, InterfaceC32720Et0, Integer, Unit> f39518k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39519l;

        /* renamed from: m */
        public final /* synthetic */ int f39520m;

        /* renamed from: n */
        public final /* synthetic */ boolean f39521n;

        /* renamed from: o */
        public final /* synthetic */ Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> f39522o;

        /* renamed from: p */
        public final /* synthetic */ boolean f39523p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC42444hy5 f39524q;

        /* renamed from: r */
        public final /* synthetic */ float f39525r;

        /* renamed from: s */
        public final /* synthetic */ long f39526s;

        /* renamed from: t */
        public final /* synthetic */ long f39527t;

        /* renamed from: u */
        public final /* synthetic */ long f39528u;

        /* renamed from: v */
        public final /* synthetic */ long f39529v;

        /* renamed from: w */
        public final /* synthetic */ long f39530w;

        /* renamed from: x */
        public final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> f39531x;

        /* renamed from: y */
        public final /* synthetic */ int f39532y;

        /* renamed from: z */
        public final /* synthetic */ int f39533z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8730c(InterfaceC41563gV2 interfaceC41563gV2, C37072Xi5 c37072Xi5, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function3<? super C41485gM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, int i, boolean z, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, boolean z2, InterfaceC42444hy5 interfaceC42444hy5, float f, long j, long j2, long j3, long j4, long j5, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function33, int i2, int i3, int i4) {
            super(2);
            this.f39514g = interfaceC41563gV2;
            this.f39515h = c37072Xi5;
            this.f39516i = function2;
            this.f39517j = function22;
            this.f39518k = function3;
            this.f39519l = function23;
            this.f39520m = i;
            this.f39521n = z;
            this.f39522o = function32;
            this.f39523p = z2;
            this.f39524q = interfaceC42444hy5;
            this.f39525r = f;
            this.f39526s = j;
            this.f39527t = j2;
            this.f39528u = j3;
            this.f39529v = j4;
            this.f39530w = j5;
            this.f39531x = function33;
            this.f39532y = i2;
            this.f39533z = i3;
            this.f39513A = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C36604Vi5.m79545a(this.f39514g, this.f39515h, this.f39516i, this.f39517j, this.f39518k, this.f39519l, this.f39520m, this.f39521n, this.f39522o, this.f39523p, this.f39524q, this.f39525r, this.f39526s, this.f39527t, this.f39528u, this.f39529v, this.f39530w, this.f39531x, interfaceC32720Et0, C47127ps4.m18626a(this.f39532y | 1), C47127ps4.m18626a(this.f39533z), this.f39513A);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vi5$d */
    /* loaded from: classes.dex */
    public static final class C8731d extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f39534g;

        /* renamed from: h */
        public final /* synthetic */ long f39535h;

        /* renamed from: i */
        public final /* synthetic */ int f39536i;

        /* renamed from: j */
        public final /* synthetic */ boolean f39537j;

        /* renamed from: k */
        public final /* synthetic */ int f39538k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39539l;

        /* renamed from: m */
        public final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> f39540m;

        /* renamed from: n */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39541n;

        /* renamed from: o */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39542o;

        /* renamed from: p */
        public final /* synthetic */ int f39543p;

        /* renamed from: q */
        public final /* synthetic */ Function3<C41485gM5, InterfaceC32720Et0, Integer, Unit> f39544q;

        /* renamed from: r */
        public final /* synthetic */ C37072Xi5 f39545r;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Vi5$d$a */
        /* loaded from: classes.dex */
        public static final class C8732a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f39546g;

            /* renamed from: h */
            public final /* synthetic */ int f39547h;

            /* renamed from: i */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39548i;

            /* renamed from: j */
            public final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> f39549j;

            /* renamed from: k */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39550k;

            /* renamed from: l */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39551l;

            /* renamed from: m */
            public final /* synthetic */ int f39552m;

            /* renamed from: n */
            public final /* synthetic */ int f39553n;

            /* renamed from: o */
            public final /* synthetic */ Function3<C41485gM5, InterfaceC32720Et0, Integer, Unit> f39554o;

            /* renamed from: p */
            public final /* synthetic */ C37072Xi5 f39555p;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Vi5$d$a$a */
            /* loaded from: classes.dex */
            public static final class C8733a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ Function3<C41485gM5, InterfaceC32720Et0, Integer, Unit> f39556g;

                /* renamed from: h */
                public final /* synthetic */ C37072Xi5 f39557h;

                /* renamed from: i */
                public final /* synthetic */ int f39558i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C8733a(Function3<? super C41485gM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, C37072Xi5 c37072Xi5, int i) {
                    super(2);
                    this.f39556g = function3;
                    this.f39557h = c37072Xi5;
                    this.f39558i = i;
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
                        C35528Qt0.m87816Z(533782017, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                    }
                    this.f39556g.invoke(this.f39557h.m76538b(), interfaceC32720Et0, Integer.valueOf((this.f39558i >> 9) & 112));
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8732a(boolean z, int i, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, int i2, int i3, Function3<? super C41485gM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, C37072Xi5 c37072Xi5) {
                super(2);
                this.f39546g = z;
                this.f39547h = i;
                this.f39548i = function2;
                this.f39549j = function3;
                this.f39550k = function22;
                this.f39551l = function23;
                this.f39552m = i2;
                this.f39553n = i3;
                this.f39554o = function32;
                this.f39555p = c37072Xi5;
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
                    C35528Qt0.m87816Z(-1128984656, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                }
                boolean z = this.f39546g;
                int i2 = this.f39547h;
                Function2<InterfaceC32720Et0, Integer, Unit> function2 = this.f39548i;
                Function3<PD3, InterfaceC32720Et0, Integer, Unit> function3 = this.f39549j;
                InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, 533782017, true, new C8733a(this.f39554o, this.f39555p, this.f39552m));
                Function2<InterfaceC32720Et0, Integer, Unit> function22 = this.f39550k;
                Function2<InterfaceC32720Et0, Integer, Unit> function23 = this.f39551l;
                int i3 = this.f39552m;
                C36604Vi5.m79544b(z, i2, function2, function3, m29791b, function22, function23, interfaceC32720Et0, ((i3 >> 21) & 14) | 24576 | ((i3 >> 15) & 112) | (i3 & 896) | ((this.f39553n >> 12) & 7168) | (458752 & i3) | ((i3 << 9) & 3670016));
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8731d(long j, long j2, int i, boolean z, int i2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, int i3, Function3<? super C41485gM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, C37072Xi5 c37072Xi5) {
            super(3);
            this.f39534g = j;
            this.f39535h = j2;
            this.f39536i = i;
            this.f39537j = z;
            this.f39538k = i2;
            this.f39539l = function2;
            this.f39540m = function3;
            this.f39541n = function22;
            this.f39542o = function23;
            this.f39543p = i3;
            this.f39544q = function32;
            this.f39545r = c37072Xi5;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC41563gV2 childModifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
            if ((i & 14) == 0) {
                i2 = i | (interfaceC32720Et0.mo89539n(childModifier) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1823402604, i2, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
            }
            long j = this.f39534g;
            long j2 = this.f39535h;
            InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, -1128984656, true, new C8732a(this.f39537j, this.f39538k, this.f39539l, this.f39540m, this.f39541n, this.f39542o, this.f39543p, this.f39536i, this.f39544q, this.f39545r));
            int i3 = 1572864 | (i2 & 14);
            int i4 = this.f39536i;
            NV5.m93838a(childModifier, null, j, j2, null, 0.0f, m29791b, interfaceC32720Et0, i3 | ((i4 >> 9) & 896) | ((i4 >> 9) & 7168), 50);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vi5$e */
    /* loaded from: classes.dex */
    public static final class C8734e extends Lambda implements Function2<InterfaceC37973aT5, C44228kz0, InterfaceC52172yO2> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39559g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39560h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39561i;

        /* renamed from: j */
        public final /* synthetic */ int f39562j;

        /* renamed from: k */
        public final /* synthetic */ boolean f39563k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39564l;

        /* renamed from: m */
        public final /* synthetic */ int f39565m;

        /* renamed from: n */
        public final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> f39566n;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,375:1\n151#2,3:376\n33#2,4:379\n154#2,2:383\n38#2:385\n156#2:386\n171#2,13:387\n151#2,3:400\n33#2,4:403\n154#2,2:407\n38#2:409\n156#2:410\n171#2,13:411\n151#2,3:424\n33#2,4:427\n154#2,2:431\n38#2:433\n156#2:434\n171#2,13:435\n171#2,13:448\n151#2,3:461\n33#2,4:464\n154#2,2:468\n38#2:470\n156#2:471\n171#2,13:472\n151#2,3:485\n33#2,4:488\n154#2,2:492\n38#2:494\n156#2:495\n33#2,6:496\n33#2,6:502\n33#2,6:508\n33#2,6:514\n33#2,6:520\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$1$1$1\n*L\n244#1:376,3\n244#1:379,4\n244#1:383,2\n244#1:385\n244#1:386\n248#1:387,13\n250#1:400,3\n250#1:403,4\n250#1:407,2\n250#1:409\n250#1:410\n254#1:411,13\n257#1:424,3\n257#1:427,4\n257#1:431,2\n257#1:433\n257#1:434\n262#1:435,13\n263#1:448,13\n294#1:461,3\n294#1:464,4\n294#1:468,2\n294#1:470\n294#1:471\n296#1:472,13\n323#1:485,3\n323#1:488,4\n323#1:492,2\n323#1:494\n323#1:495\n327#1:496,6\n330#1:502,6\n333#1:508,6\n337#1:514,6\n341#1:520,6\n*E\n"})
        /* renamed from: Vi5$e$a */
        /* loaded from: classes.dex */
        public static final class C8735a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC37973aT5 f39567g;

            /* renamed from: h */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39568h;

            /* renamed from: i */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39569i;

            /* renamed from: j */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39570j;

            /* renamed from: k */
            public final /* synthetic */ int f39571k;

            /* renamed from: l */
            public final /* synthetic */ int f39572l;

            /* renamed from: m */
            public final /* synthetic */ boolean f39573m;

            /* renamed from: n */
            public final /* synthetic */ int f39574n;

            /* renamed from: o */
            public final /* synthetic */ long f39575o;

            /* renamed from: p */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39576p;

            /* renamed from: q */
            public final /* synthetic */ int f39577q;

            /* renamed from: r */
            public final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> f39578r;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Vi5$e$a$a */
            /* loaded from: classes.dex */
            public static final class C8736a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ InterfaceC37973aT5 f39579g;

                /* renamed from: h */
                public final /* synthetic */ int f39580h;

                /* renamed from: i */
                public final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> f39581i;

                /* renamed from: j */
                public final /* synthetic */ int f39582j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C8736a(InterfaceC37973aT5 interfaceC37973aT5, int i, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i2) {
                    super(2);
                    this.f39579g = interfaceC37973aT5;
                    this.f39580h = i;
                    this.f39581i = function3;
                    this.f39582j = i2;
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
                        C35528Qt0.m87816Z(-1132241596, i, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:319)");
                    }
                    this.f39581i.invoke(ND3.m94188e(0.0f, 0.0f, 0.0f, this.f39579g.mo3398w(this.f39580h), 7, null), interfaceC32720Et0, Integer.valueOf((this.f39582j >> 6) & 112));
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Vi5$e$a$b */
            /* loaded from: classes.dex */
            public static final class C8737b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C38122aj1 f39583g;

                /* renamed from: h */
                public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39584h;

                /* renamed from: i */
                public final /* synthetic */ int f39585i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C8737b(C38122aj1 c38122aj1, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
                    super(2);
                    this.f39583g = c38122aj1;
                    this.f39584h = function2;
                    this.f39585i = i;
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
                        C35528Qt0.m87816Z(1529070963, i, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:288)");
                    }
                    C41806gu0.m37353a(new W94[]{C36604Vi5.m79541e().m81907c(this.f39583g)}, this.f39584h, interfaceC32720Et0, ((this.f39585i >> 15) & 112) | 8);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8735a(InterfaceC37973aT5 interfaceC37973aT5, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, int i, int i2, boolean z, int i3, long j, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, int i4, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
                super(1);
                this.f39567g = interfaceC37973aT5;
                this.f39568h = function2;
                this.f39569i = function22;
                this.f39570j = function23;
                this.f39571k = i;
                this.f39572l = i2;
                this.f39573m = z;
                this.f39574n = i3;
                this.f39575o = j;
                this.f39576p = function24;
                this.f39577q = i4;
                this.f39578r = function3;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x022c  */
            /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x026d  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0279  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x02a8 A[LOOP:4: B:119:0x02a6->B:120:0x02a8, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02db A[LOOP:5: B:122:0x02d9->B:123:0x02db, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x030b A[LOOP:6: B:125:0x0309->B:126:0x030b, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:129:0x0328 A[LOOP:7: B:128:0x0326->B:129:0x0328, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0346 A[LOOP:8: B:131:0x0344->B:132:0x0346, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0364  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01e6 A[LOOP:3: B:85:0x01e4->B:86:0x01e6, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m79537a(OU3.AbstractC6015a layout) {
                Object obj;
                int lastIndex;
                int i;
                Object obj2;
                int lastIndex2;
                int i2;
                C38122aj1 c38122aj1;
                ArrayList arrayList;
                int size;
                int i3;
                Object obj3;
                int lastIndex3;
                OU3 ou3;
                int i4;
                Integer num;
                int i5;
                int size2;
                int size3;
                int i6;
                int size4;
                int i7;
                int size5;
                int i8;
                int size6;
                int i9;
                int size7;
                int i10;
                int i11;
                int i12;
                int i13;
                int m70826a;
                int mo3416F0;
                int m70826a2;
                Object obj4;
                int lastIndex4;
                int i14;
                Object obj5;
                int lastIndex5;
                int i15;
                int i16;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<InterfaceC50393vO2> mo71334q0 = this.f39567g.mo71334q0(EnumC36838Wi5.TopBar, this.f39568h);
                long j = this.f39575o;
                ArrayList arrayList2 = new ArrayList(mo71334q0.size());
                int size8 = mo71334q0.size();
                int i17 = 0;
                for (int i18 = 0; i18 < size8; i18++) {
                    arrayList2.add(mo71334q0.get(i18).mo8763P0(j));
                }
                if (arrayList2.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList2.get(0);
                    int m92229d1 = ((OU3) obj).m92229d1();
                    lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                    if (1 <= lastIndex) {
                        int i19 = 1;
                        while (true) {
                            Object obj6 = arrayList2.get(i19);
                            int m92229d12 = ((OU3) obj6).m92229d1();
                            if (m92229d1 < m92229d12) {
                                obj = obj6;
                                m92229d1 = m92229d12;
                            }
                            if (i19 == lastIndex) {
                                break;
                            }
                            i19++;
                        }
                    }
                }
                OU3 ou32 = (OU3) obj;
                if (ou32 != null) {
                    i = ou32.m92229d1();
                } else {
                    i = 0;
                }
                List<InterfaceC50393vO2> mo71334q02 = this.f39567g.mo71334q0(EnumC36838Wi5.Snackbar, this.f39569i);
                long j2 = this.f39575o;
                ArrayList arrayList3 = new ArrayList(mo71334q02.size());
                int size9 = mo71334q02.size();
                for (int i20 = 0; i20 < size9; i20++) {
                    arrayList3.add(mo71334q02.get(i20).mo8763P0(j2));
                }
                if (arrayList3.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = arrayList3.get(0);
                    int m92229d13 = ((OU3) obj2).m92229d1();
                    lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                    if (1 <= lastIndex2) {
                        int i21 = 1;
                        while (true) {
                            Object obj7 = arrayList3.get(i21);
                            int m92229d14 = ((OU3) obj7).m92229d1();
                            if (m92229d13 < m92229d14) {
                                obj2 = obj7;
                                m92229d13 = m92229d14;
                            }
                            if (i21 == lastIndex2) {
                                break;
                            }
                            i21++;
                        }
                    }
                }
                OU3 ou33 = (OU3) obj2;
                if (ou33 != null) {
                    i2 = ou33.m92229d1();
                } else {
                    i2 = 0;
                }
                List<InterfaceC50393vO2> mo71334q03 = this.f39567g.mo71334q0(EnumC36838Wi5.Fab, this.f39570j);
                long j3 = this.f39575o;
                ArrayList arrayList4 = new ArrayList(mo71334q03.size());
                int size10 = mo71334q03.size();
                for (int i22 = 0; i22 < size10; i22++) {
                    arrayList4.add(mo71334q03.get(i22).mo8763P0(j3));
                }
                if (!arrayList4.isEmpty()) {
                    if (arrayList4.isEmpty()) {
                        obj4 = null;
                    } else {
                        obj4 = arrayList4.get(0);
                        int m92226i1 = ((OU3) obj4).m92226i1();
                        lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                        if (1 <= lastIndex4) {
                            int i23 = 1;
                            while (true) {
                                Object obj8 = arrayList4.get(i23);
                                int m92226i12 = ((OU3) obj8).m92226i1();
                                if (m92226i1 < m92226i12) {
                                    obj4 = obj8;
                                    m92226i1 = m92226i12;
                                }
                                if (i23 == lastIndex4) {
                                    break;
                                }
                                i23++;
                            }
                        }
                    }
                    OU3 ou34 = (OU3) obj4;
                    if (ou34 != null) {
                        i14 = ou34.m92226i1();
                    } else {
                        i14 = 0;
                    }
                    if (arrayList4.isEmpty()) {
                        obj5 = null;
                    } else {
                        obj5 = arrayList4.get(0);
                        int m92229d15 = ((OU3) obj5).m92229d1();
                        lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                        if (1 <= lastIndex5) {
                            int i24 = 1;
                            while (true) {
                                Object obj9 = arrayList4.get(i24);
                                int m92229d16 = ((OU3) obj9).m92229d1();
                                if (m92229d15 < m92229d16) {
                                    m92229d15 = m92229d16;
                                    obj5 = obj9;
                                }
                                if (i24 == lastIndex5) {
                                    break;
                                }
                                i24++;
                            }
                        }
                    }
                    OU3 ou35 = (OU3) obj5;
                    if (ou35 != null) {
                        i15 = ou35.m92229d1();
                    } else {
                        i15 = 0;
                    }
                    if (i14 != 0 && i15 != 0) {
                        if (C38715bj1.m64071e(this.f39571k, C38715bj1.f58000b.m64067a())) {
                            if (this.f39567g.getLayoutDirection() == EnumC47065pm2.Ltr) {
                                i16 = (this.f39572l - this.f39567g.mo3416F0(C36604Vi5.f39510b)) - i14;
                            } else {
                                i16 = this.f39567g.mo3416F0(C36604Vi5.f39510b);
                            }
                        } else {
                            i16 = (this.f39572l - i14) / 2;
                        }
                        c38122aj1 = new C38122aj1(this.f39573m, i16, i14, i15);
                        List<InterfaceC50393vO2> mo71334q04 = this.f39567g.mo71334q0(EnumC36838Wi5.BottomBar, C43575jt0.m29790c(1529070963, true, new C8737b(c38122aj1, this.f39576p, this.f39577q)));
                        long j4 = this.f39575o;
                        arrayList = new ArrayList(mo71334q04.size());
                        size = mo71334q04.size();
                        for (i3 = 0; i3 < size; i3++) {
                            arrayList.add(mo71334q04.get(i3).mo8763P0(j4));
                        }
                        if (!arrayList.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList.get(0);
                            int m92229d17 = ((OU3) obj3).m92229d1();
                            lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex3) {
                                int i25 = 1;
                                while (true) {
                                    Object obj10 = arrayList.get(i25);
                                    int m92229d18 = ((OU3) obj10).m92229d1();
                                    if (m92229d17 < m92229d18) {
                                        obj3 = obj10;
                                        m92229d17 = m92229d18;
                                    }
                                    if (i25 == lastIndex3) {
                                        break;
                                    }
                                    i25++;
                                }
                            }
                        }
                        ou3 = (OU3) obj3;
                        if (ou3 == null) {
                            i4 = ou3.m92229d1();
                        } else {
                            i4 = 0;
                        }
                        if (c38122aj1 == null) {
                            InterfaceC37973aT5 interfaceC37973aT5 = this.f39567g;
                            boolean z = this.f39573m;
                            if (i4 == 0) {
                                m70826a = c38122aj1.m70826a();
                                mo3416F0 = interfaceC37973aT5.mo3416F0(C36604Vi5.f39510b);
                            } else if (z) {
                                m70826a2 = i4 + (c38122aj1.m70826a() / 2);
                                num = Integer.valueOf(m70826a2);
                            } else {
                                m70826a = c38122aj1.m70826a() + i4;
                                mo3416F0 = interfaceC37973aT5.mo3416F0(C36604Vi5.f39510b);
                            }
                            m70826a2 = m70826a + mo3416F0;
                            num = Integer.valueOf(m70826a2);
                        } else {
                            num = null;
                        }
                        if (i2 == 0) {
                            if (num != null) {
                                i13 = num.intValue();
                            } else {
                                i13 = i4;
                            }
                            i5 = i2 + i13;
                        } else {
                            i5 = 0;
                        }
                        int i26 = this.f39574n - i;
                        InterfaceC37973aT5 interfaceC37973aT52 = this.f39567g;
                        List<InterfaceC50393vO2> mo71334q05 = interfaceC37973aT52.mo71334q0(EnumC36838Wi5.MainContent, C43575jt0.m29790c(-1132241596, true, new C8736a(interfaceC37973aT52, i4, this.f39578r, this.f39577q)));
                        long j5 = this.f39575o;
                        ArrayList arrayList5 = new ArrayList(mo71334q05.size());
                        size2 = mo71334q05.size();
                        while (i17 < size2) {
                            arrayList5.add(mo71334q05.get(i17).mo8763P0(C44228kz0.m28072e(j5, 0, 0, 0, i26, 7, null)));
                            i17++;
                            mo71334q05 = mo71334q05;
                            j5 = j5;
                        }
                        size3 = arrayList5.size();
                        i6 = 0;
                        while (i6 < size3) {
                            OU3.AbstractC6015a.m92209n(layout, (OU3) arrayList5.get(i6), 0, i, 0.0f, 4, null);
                            i6++;
                            arrayList5 = arrayList5;
                            i4 = i4;
                        }
                        int i27 = i4;
                        size4 = arrayList2.size();
                        for (i7 = 0; i7 < size4; i7++) {
                            OU3.AbstractC6015a.m92209n(layout, (OU3) arrayList2.get(i7), 0, 0, 0.0f, 4, null);
                        }
                        int i28 = this.f39574n;
                        size5 = arrayList3.size();
                        for (i8 = 0; i8 < size5; i8++) {
                            OU3.AbstractC6015a.m92209n(layout, (OU3) arrayList3.get(i8), 0, i28 - i5, 0.0f, 4, null);
                        }
                        int i29 = this.f39574n;
                        size6 = arrayList.size();
                        for (i9 = 0; i9 < size6; i9++) {
                            OU3.AbstractC6015a.m92209n(layout, (OU3) arrayList.get(i9), 0, i29 - i27, 0.0f, 4, null);
                        }
                        int i30 = this.f39574n;
                        size7 = arrayList4.size();
                        for (i10 = 0; i10 < size7; i10++) {
                            OU3 ou36 = (OU3) arrayList4.get(i10);
                            if (c38122aj1 != null) {
                                i11 = c38122aj1.m70825b();
                            } else {
                                i11 = 0;
                            }
                            if (num != null) {
                                i12 = num.intValue();
                            } else {
                                i12 = 0;
                            }
                            OU3.AbstractC6015a.m92209n(layout, ou36, i11, i30 - i12, 0.0f, 4, null);
                        }
                    }
                }
                c38122aj1 = null;
                List<InterfaceC50393vO2> mo71334q042 = this.f39567g.mo71334q0(EnumC36838Wi5.BottomBar, C43575jt0.m29790c(1529070963, true, new C8737b(c38122aj1, this.f39576p, this.f39577q)));
                long j42 = this.f39575o;
                arrayList = new ArrayList(mo71334q042.size());
                size = mo71334q042.size();
                while (i3 < size) {
                }
                if (!arrayList.isEmpty()) {
                }
                ou3 = (OU3) obj3;
                if (ou3 == null) {
                }
                if (c38122aj1 == null) {
                }
                if (i2 == 0) {
                }
                int i262 = this.f39574n - i;
                InterfaceC37973aT5 interfaceC37973aT522 = this.f39567g;
                List<InterfaceC50393vO2> mo71334q052 = interfaceC37973aT522.mo71334q0(EnumC36838Wi5.MainContent, C43575jt0.m29790c(-1132241596, true, new C8736a(interfaceC37973aT522, i4, this.f39578r, this.f39577q)));
                long j52 = this.f39575o;
                ArrayList arrayList52 = new ArrayList(mo71334q052.size());
                size2 = mo71334q052.size();
                while (i17 < size2) {
                }
                size3 = arrayList52.size();
                i6 = 0;
                while (i6 < size3) {
                }
                int i272 = i4;
                size4 = arrayList2.size();
                while (i7 < size4) {
                }
                int i282 = this.f39574n;
                size5 = arrayList3.size();
                while (i8 < size5) {
                }
                int i292 = this.f39574n;
                size6 = arrayList.size();
                while (i9 < size6) {
                }
                int i302 = this.f39574n;
                size7 = arrayList4.size();
                while (i10 < size7) {
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m79537a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8734e(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, int i, boolean z, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, int i2, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
            super(2);
            this.f39559g = function2;
            this.f39560h = function22;
            this.f39561i = function23;
            this.f39562j = i;
            this.f39563k = z;
            this.f39564l = function24;
            this.f39565m = i2;
            this.f39566n = function3;
        }

        /* renamed from: a */
        public final InterfaceC52172yO2 m79538a(InterfaceC37973aT5 SubcomposeLayout, long j) {
            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
            int m28063n = C44228kz0.m28063n(j);
            int m28064m = C44228kz0.m28064m(j);
            return InterfaceC52765zO2.m1430Y(SubcomposeLayout, m28063n, m28064m, null, new C8735a(SubcomposeLayout, this.f39559g, this.f39560h, this.f39561i, this.f39562j, m28063n, this.f39563k, m28064m, C44228kz0.m28072e(j, 0, 0, 0, 0, 10, null), this.f39564l, this.f39565m, this.f39566n), 4, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(InterfaceC37973aT5 interfaceC37973aT5, C44228kz0 c44228kz0) {
            return m79538a(interfaceC37973aT5, c44228kz0.m28058s());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vi5$f */
    /* loaded from: classes.dex */
    public static final class C8738f extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f39586g;

        /* renamed from: h */
        public final /* synthetic */ int f39587h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39588i;

        /* renamed from: j */
        public final /* synthetic */ Function3<PD3, InterfaceC32720Et0, Integer, Unit> f39589j;

        /* renamed from: k */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39590k;

        /* renamed from: l */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39591l;

        /* renamed from: m */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f39592m;

        /* renamed from: n */
        public final /* synthetic */ int f39593n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8738f(boolean z, int i, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, int i2) {
            super(2);
            this.f39586g = z;
            this.f39587h = i;
            this.f39588i = function2;
            this.f39589j = function3;
            this.f39590k = function22;
            this.f39591l = function23;
            this.f39592m = function24;
            this.f39593n = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C36604Vi5.m79544b(this.f39586g, this.f39587h, this.f39588i, this.f39589j, this.f39590k, this.f39591l, this.f39592m, interfaceC32720Et0, C47127ps4.m18626a(this.f39593n | 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b8, code lost:
        if (r0.mo89524s(r55) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d2, code lost:
        if (r0.mo89524s(r57) == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m79545a(InterfaceC41563gV2 interfaceC41563gV2, C37072Xi5 c37072Xi5, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function3<? super C41485gM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, int i, boolean z, Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, boolean z2, InterfaceC42444hy5 interfaceC42444hy5, float f, long j, long j2, long j3, long j4, long j5, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        InterfaceC41563gV2 interfaceC41563gV22;
        C37072Xi5 c37072Xi52;
        Function2<InterfaceC32720Et0, Integer, Unit> m9615a;
        Function2<InterfaceC32720Et0, Integer, Unit> m9614b;
        Function3<C41485gM5, InterfaceC32720Et0, Integer, Unit> m9613c;
        Function2<InterfaceC32720Et0, Integer, Unit> m9612d;
        boolean z3;
        KC0 kc0;
        InterfaceC42444hy5 interfaceC42444hy52;
        boolean z4;
        int i17;
        long j6;
        long j7;
        long j8;
        int i18;
        long j9;
        long j10;
        boolean z5;
        long j11;
        long j12;
        int i19;
        int i20;
        long j13;
        InterfaceC41563gV2 interfaceC41563gV23;
        C37072Xi5 c37072Xi53;
        Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function33;
        InterfaceC42444hy5 interfaceC42444hy53;
        long j14;
        float f2;
        C37072Xi5 c37072Xi54;
        C37072Xi5 c37072Xi55;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24;
        float f3;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function34;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function25;
        boolean z6;
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function26;
        int i21;
        InterfaceC42444hy5 interfaceC42444hy54;
        Function3<? super C41485gM5, ? super InterfaceC32720Et0, ? super Integer, Unit> function35;
        boolean z7;
        InterfaceC36874Wm5 mo89512w;
        int i22;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1037492569);
        int i25 = i4 & 1;
        if (i25 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (mo89518u.mo89539n(interfaceC41563gV2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i4 & 2) == 0 && mo89518u.mo89539n(c37072Xi5)) {
                i24 = 32;
                i5 |= i24;
            }
            i24 = 16;
            i5 |= i24;
        }
        int i26 = i4 & 4;
        if (i26 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= mo89518u.mo89629I(function2) ? 256 : 128;
            i6 = i4 & 8;
            int i27 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= mo89518u.mo89629I(function22) ? 2048 : 1024;
                i7 = i4 & 16;
                int i28 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= mo89518u.mo89629I(function3) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ImageMetadata.EDGE_MODE;
                    obj = function23;
                } else {
                    obj = function23;
                    if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                        i5 |= mo89518u.mo89629I(obj) ? 131072 : 65536;
                    }
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    i10 = i;
                } else {
                    i10 = i;
                    if ((i2 & 3670016) == 0) {
                        i5 |= mo89518u.mo89527r(i10) ? 1048576 : 524288;
                    }
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= mo89518u.mo89536o(z) ? 8388608 : 4194304;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= mo89518u.mo89629I(function32) ? 67108864 : 33554432;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= mo89518u.mo89536o(z2) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    if ((i4 & 1024) == 0 && mo89518u.mo89539n(interfaceC42444hy5)) {
                        i23 = 4;
                        i14 = i3 | i23;
                    }
                    i23 = 2;
                    i14 = i3 | i23;
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= mo89518u.mo89533p(f) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && mo89518u.mo89524s(j)) {
                        i22 = 256;
                        i14 |= i22;
                    }
                    i22 = 128;
                    i14 |= i22;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i27 = 1024;
                    i14 |= i27;
                }
                if ((i3 & 57344) == 0) {
                    if ((i4 & 16384) != 0) {
                    }
                    i28 = 8192;
                    i14 |= i28;
                }
                if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                    i14 |= ((i4 & DateUtils.FORMAT_ABBREV_WEEKDAY) == 0 && mo89518u.mo89524s(j4)) ? 131072 : 65536;
                }
                if ((i3 & 3670016) == 0) {
                    i14 |= ((i4 & 65536) == 0 && mo89518u.mo89524s(j5)) ? 1048576 : 524288;
                }
                if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0) {
                    if ((i3 & 29360128) == 0) {
                        i16 = mo89518u.mo89629I(content) ? 8388608 : 4194304;
                    }
                    if ((i5 & 1533916891) != 306783378 && (i14 & 23967451) == 4793490 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV23 = interfaceC41563gV2;
                        c37072Xi55 = c37072Xi5;
                        function25 = function2;
                        function26 = function22;
                        function35 = function3;
                        function34 = function32;
                        interfaceC42444hy54 = interfaceC42444hy5;
                        f3 = f;
                        j15 = j;
                        j16 = j2;
                        j17 = j3;
                        j18 = j4;
                        j19 = j5;
                        function24 = obj;
                        i21 = i10;
                        z7 = z;
                        z6 = z2;
                    } else {
                        mo89518u.mo89626J();
                        if ((i2 & 1) == 0 && !mo89518u.mo89545l()) {
                            mo89518u.mo89548k();
                            if ((i4 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i4 & 1024) != 0) {
                                i14 &= -15;
                            }
                            int i29 = i14;
                            if ((i4 & 4096) != 0) {
                                i29 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i29 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i29 &= -57345;
                            }
                            if ((32768 & i4) != 0) {
                                i29 &= -458753;
                            }
                            if ((i4 & 65536) != 0) {
                                i29 &= -3670017;
                            }
                            c37072Xi53 = c37072Xi5;
                            m9615a = function2;
                            m9614b = function22;
                            z3 = z;
                            function33 = function32;
                            z5 = z2;
                            f2 = f;
                            j8 = j;
                            j14 = j2;
                            j13 = j3;
                            j12 = j4;
                            j11 = j5;
                            i19 = i29;
                            i20 = i5;
                            m9612d = obj;
                            interfaceC41563gV23 = interfaceC41563gV2;
                            m9613c = function3;
                            interfaceC42444hy53 = interfaceC42444hy5;
                        } else {
                            InterfaceC41563gV2 interfaceC41563gV24 = i25 == 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                            if ((i4 & 2) == 0) {
                                interfaceC41563gV22 = interfaceC41563gV24;
                                c37072Xi52 = m79540f(null, null, mo89518u, 0, 3);
                                i5 &= -113;
                            } else {
                                interfaceC41563gV22 = interfaceC41563gV24;
                                c37072Xi52 = c37072Xi5;
                            }
                            m9615a = i26 == 0 ? C50097ut0.f113138a.m9615a() : function2;
                            m9614b = i6 == 0 ? C50097ut0.f113138a.m9614b() : function22;
                            m9613c = i7 == 0 ? C50097ut0.f113138a.m9613c() : function3;
                            m9612d = i8 == 0 ? C50097ut0.f113138a.m9612d() : function23;
                            if (i9 != 0) {
                                i10 = C38715bj1.f58000b.m64067a();
                            }
                            z3 = i11 == 0 ? false : z;
                            Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function36 = i12 == 0 ? null : function32;
                            boolean z8 = i13 == 0 ? true : z2;
                            C37072Xi5 c37072Xi56 = c37072Xi52;
                            Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function37 = function36;
                            if ((i4 & 1024) == 0) {
                                kc0 = TM2.f35372a.m83730b(mo89518u, 6).m109566c();
                                i14 &= -15;
                            } else {
                                kc0 = interfaceC42444hy5;
                            }
                            int i30 = i14;
                            float m29274a = i15 == 0 ? C43715k71.f93955a.m29274a() : f;
                            if ((i4 & 4096) == 0) {
                                interfaceC42444hy52 = kc0;
                                boolean z9 = z8;
                                i17 = i30 & (-897);
                                j6 = TM2.f35372a.m83731a(mo89518u, 6).m94896n();
                                z4 = z9;
                            } else {
                                interfaceC42444hy52 = kc0;
                                z4 = z8;
                                i17 = i30;
                                j6 = j;
                            }
                            float f4 = m29274a;
                            if ((i4 & 8192) == 0) {
                                j7 = C34763Nm0.m93468b(j6, mo89518u, (i17 >> 6) & 14);
                                i17 &= -7169;
                            } else {
                                j7 = j2;
                            }
                            if ((i4 & 16384) == 0) {
                                j8 = j6;
                                i18 = 6;
                                j9 = C43715k71.f93955a.m29273b(mo89518u, 6);
                                i17 &= -57345;
                            } else {
                                j8 = j6;
                                i18 = 6;
                                j9 = j3;
                            }
                            if ((32768 & i4) == 0) {
                                j10 = TM2.f35372a.m83731a(mo89518u, i18).m94907c();
                                i17 &= -458753;
                            } else {
                                j10 = j4;
                            }
                            if ((i4 & 65536) == 0) {
                                z5 = z4;
                                j12 = j10;
                                i19 = i17 & (-3670017);
                                i20 = i5;
                                j11 = C34763Nm0.m93468b(j10, mo89518u, (i17 >> 15) & 14);
                                interfaceC41563gV23 = interfaceC41563gV22;
                                c37072Xi53 = c37072Xi56;
                                function33 = function37;
                                interfaceC42444hy53 = interfaceC42444hy52;
                                j13 = j9;
                            } else {
                                z5 = z4;
                                j11 = j5;
                                j12 = j10;
                                i19 = i17;
                                i20 = i5;
                                j13 = j9;
                                interfaceC41563gV23 = interfaceC41563gV22;
                                c37072Xi53 = c37072Xi56;
                                function33 = function37;
                                interfaceC42444hy53 = interfaceC42444hy52;
                            }
                            j14 = j7;
                            f2 = f4;
                        }
                        mo89518u.mo89650B();
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(1037492569, i20, i19, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                        }
                        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function27 = m9615a;
                        InterfaceC42389ht0 m29791b = C43575jt0.m29791b(mo89518u, 1823402604, true, new C8731d(j12, j11, i19, z3, i10, m9615a, content, m9612d, m9614b, i20, m9613c, c37072Xi53));
                        if (function33 == null) {
                            mo89518u.mo89638F(-1013848234);
                            c37072Xi54 = c37072Xi53;
                            int i31 = i19 << 12;
                            C44308l71.m27840a(function33, interfaceC41563gV23, c37072Xi53.m76539a(), z5, interfaceC42444hy53, f2, j8, j14, j13, C43575jt0.m29791b(mo89518u, 100842932, true, new C8729b(m29791b)), mo89518u, ((i20 >> 24) & 14) | 805306368 | ((i20 << 3) & 112) | ((i20 >> 18) & 7168) | (i31 & 57344) | (i31 & ImageMetadata.JPEG_GPS_COORDINATES) | (i31 & 3670016) | (i31 & 29360128) | (i31 & 234881024), 0);
                            mo89518u.mo89605Q();
                        } else {
                            c37072Xi54 = c37072Xi53;
                            mo89518u.mo89638F(-1013847725);
                            m29791b.invoke(interfaceC41563gV23, mo89518u, Integer.valueOf((i20 & 14) | 48));
                            mo89518u.mo89605Q();
                        }
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        c37072Xi55 = c37072Xi54;
                        function24 = m9612d;
                        f3 = f2;
                        j15 = j8;
                        j16 = j14;
                        j17 = j13;
                        j18 = j12;
                        j19 = j11;
                        function34 = function33;
                        function25 = function27;
                        int i32 = i10;
                        z6 = z5;
                        function26 = m9614b;
                        i21 = i32;
                        boolean z10 = z3;
                        interfaceC42444hy54 = interfaceC42444hy53;
                        function35 = m9613c;
                        z7 = z10;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w != null) {
                        return;
                    }
                    mo89512w.mo20405a(new C8730c(interfaceC41563gV23, c37072Xi55, function25, function26, function35, function24, i21, z7, function34, z6, interfaceC42444hy54, f3, j15, j16, j17, j18, j19, content, i2, i3, i4));
                    return;
                }
                i16 = 12582912;
                i14 |= i16;
                if ((i5 & 1533916891) != 306783378) {
                }
                mo89518u.mo89626J();
                if ((i2 & 1) == 0) {
                }
                if (i25 == 0) {
                }
                if ((i4 & 2) == 0) {
                }
                if (i26 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                C37072Xi5 c37072Xi562 = c37072Xi52;
                Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function372 = function36;
                if ((i4 & 1024) == 0) {
                }
                int i302 = i14;
                if (i15 == 0) {
                }
                if ((i4 & 4096) == 0) {
                }
                float f42 = m29274a;
                if ((i4 & 8192) == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((32768 & i4) == 0) {
                }
                if ((i4 & 65536) == 0) {
                }
                j14 = j7;
                f2 = f42;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                }
                Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function272 = m9615a;
                InterfaceC42389ht0 m29791b2 = C43575jt0.m29791b(mo89518u, 1823402604, true, new C8731d(j12, j11, i19, z3, i10, m9615a, content, m9612d, m9614b, i20, m9613c, c37072Xi53));
                if (function33 == null) {
                }
                if (C35528Qt0.m87827O()) {
                }
                c37072Xi55 = c37072Xi54;
                function24 = m9612d;
                f3 = f2;
                j15 = j8;
                j16 = j14;
                j17 = j13;
                j18 = j12;
                j19 = j11;
                function34 = function33;
                function25 = function272;
                int i322 = i10;
                z6 = z5;
                function26 = m9614b;
                i21 = i322;
                boolean z102 = z3;
                interfaceC42444hy54 = interfaceC42444hy53;
                function35 = m9613c;
                z7 = z102;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                }
            }
            i7 = i4 & 16;
            int i282 = 16384;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0) {
            }
            i14 |= i16;
            if ((i5 & 1533916891) != 306783378) {
            }
            mo89518u.mo89626J();
            if ((i2 & 1) == 0) {
            }
            if (i25 == 0) {
            }
            if ((i4 & 2) == 0) {
            }
            if (i26 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            C37072Xi5 c37072Xi5622 = c37072Xi52;
            Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3722 = function36;
            if ((i4 & 1024) == 0) {
            }
            int i3022 = i14;
            if (i15 == 0) {
            }
            if ((i4 & 4096) == 0) {
            }
            float f422 = m29274a;
            if ((i4 & 8192) == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((32768 & i4) == 0) {
            }
            if ((i4 & 65536) == 0) {
            }
            j14 = j7;
            f2 = f422;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2722 = m9615a;
            InterfaceC42389ht0 m29791b22 = C43575jt0.m29791b(mo89518u, 1823402604, true, new C8731d(j12, j11, i19, z3, i10, m9615a, content, m9612d, m9614b, i20, m9613c, c37072Xi53));
            if (function33 == null) {
            }
            if (C35528Qt0.m87827O()) {
            }
            c37072Xi55 = c37072Xi54;
            function24 = m9612d;
            f3 = f2;
            j15 = j8;
            j16 = j14;
            j17 = j13;
            j18 = j12;
            j19 = j11;
            function34 = function33;
            function25 = function2722;
            int i3222 = i10;
            z6 = z5;
            function26 = m9614b;
            i21 = i3222;
            boolean z1022 = z3;
            interfaceC42444hy54 = interfaceC42444hy53;
            function35 = m9613c;
            z7 = z1022;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        i6 = i4 & 8;
        int i272 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2822 = 16384;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i4 & DateUtils.FORMAT_NUMERIC_DATE) == 0) {
        }
        i14 |= i16;
        if ((i5 & 1533916891) != 306783378) {
        }
        mo89518u.mo89626J();
        if ((i2 & 1) == 0) {
        }
        if (i25 == 0) {
        }
        if ((i4 & 2) == 0) {
        }
        if (i26 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        C37072Xi5 c37072Xi56222 = c37072Xi52;
        Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function37222 = function36;
        if ((i4 & 1024) == 0) {
        }
        int i30222 = i14;
        if (i15 == 0) {
        }
        if ((i4 & 4096) == 0) {
        }
        float f4222 = m29274a;
        if ((i4 & 8192) == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((32768 & i4) == 0) {
        }
        if ((i4 & 65536) == 0) {
        }
        j14 = j7;
        f2 = f4222;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function27222 = m9615a;
        InterfaceC42389ht0 m29791b222 = C43575jt0.m29791b(mo89518u, 1823402604, true, new C8731d(j12, j11, i19, z3, i10, m9615a, content, m9612d, m9614b, i20, m9613c, c37072Xi53));
        if (function33 == null) {
        }
        if (C35528Qt0.m87827O()) {
        }
        c37072Xi55 = c37072Xi54;
        function24 = m9612d;
        f3 = f2;
        j15 = j8;
        j16 = j14;
        j17 = j13;
        j18 = j12;
        j19 = j11;
        function34 = function33;
        function25 = function27222;
        int i32222 = i10;
        z6 = z5;
        function26 = m9614b;
        i21 = i32222;
        boolean z10222 = z3;
        interfaceC42444hy54 = interfaceC42444hy53;
        function35 = m9613c;
        z7 = z10222;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* renamed from: b */
    public static final void m79544b(boolean z, int i, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function22, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function23, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function24, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1401632215);
        if ((i2 & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (mo89518u.mo89527r(i)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i2 & 896) == 0) {
            if (mo89518u.mo89629I(function2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        if ((i2 & 7168) == 0) {
            if (mo89518u.mo89629I(function3)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((57344 & i2) == 0) {
            if (mo89518u.mo89629I(function22)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((458752 & i2) == 0) {
            if (mo89518u.mo89629I(function23)) {
                i7 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((3670016 & i2) == 0) {
            if (mo89518u.mo89629I(function24)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        int i13 = i3;
        if ((2995931 & i13) == 599186 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1401632215, i13, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {function2, function22, function23, C38715bj1.m64074b(i), Boolean.valueOf(z), function24, function3};
            mo89518u.mo89638F(-568225417);
            int i14 = 0;
            boolean z2 = false;
            for (int i15 = 7; i14 < i15; i15 = 7) {
                z2 |= mo89518u.mo89539n(objArr[i14]);
                i14++;
            }
            Object mo89635G = mo89518u.mo89635G();
            if (!z2 && mo89635G != InterfaceC32720Et0.f8257a.m108267a()) {
                i4 = 1;
                i5 = 0;
            } else {
                i4 = 1;
                i5 = 0;
                C8734e c8734e = new C8734e(function2, function22, function23, i, z, function24, i13, function3);
                mo89518u.mo89503z(c8734e);
                mo89635G = c8734e;
            }
            mo89518u.mo89605Q();
            YS5.m75010a(null, (Function2) mo89635G, mo89518u, i5, i4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C8738f(z, i, function2, function3, function22, function23, function24, i2));
        }
    }

    /* renamed from: e */
    public static final U94<C38122aj1> m79541e() {
        return f39509a;
    }

    /* renamed from: f */
    public static final C37072Xi5 m79540f(C44901m71 c44901m71, C41485gM5 c41485gM5, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(1569641925);
        if ((i2 & 1) != 0) {
            c44901m71 = C44308l71.m27832i(EnumC46087o71.Closed, null, interfaceC32720Et0, 6, 2);
        }
        if ((i2 & 2) != 0) {
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C41485gM5();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            c41485gM5 = (C41485gM5) mo89635G;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C37072Xi5(c44901m71, c41485gM5);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        C37072Xi5 c37072Xi5 = (C37072Xi5) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c37072Xi5;
    }
}
