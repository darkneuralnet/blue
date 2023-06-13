package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC44199kw1;
import p000.C1577Df;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001ao\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0085\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a{\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001e\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"", Entry.TYPE_TEXT, "LgV2;", "modifier", "LG26;", "style", "Lkotlin/Function1;", "Li26;", "", "onTextLayout", "Ln26;", "overflow", "", "softWrap", "", "maxLines", "minLines", "b", "(Ljava/lang/String;LgV2;LG26;Lkotlin/jvm/functions/Function1;IZIILEt0;II)V", "LDf;", "", "LL22;", "inlineContent", "c", "(LDf;LgV2;LG26;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;LEt0;II)V", C17296a.f69688o, "(LDf;LgV2;LG26;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;LEt0;II)V", "LVr5;", "selectionRegistrar", "LRi5;", "", DateTokenConverter.CONVERTER_KEY, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,319:1\n76#2:320\n76#2:321\n76#2:322\n76#2:330\n76#2:332\n76#2:355\n76#2:356\n76#2:357\n76#2:358\n76#2:367\n25#3:323\n286#3,8:338\n294#3,2:352\n25#3:359\n456#3,14:379\n1114#4,6:324\n1114#4,6:360\n120#5:331\n121#5,5:333\n127#5,6:346\n134#5:354\n74#5:366\n75#5,11:368\n88#5:393\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n81#1:320\n82#1:321\n83#1:322\n139#1:330\n142#1:332\n188#1:355\n189#1:356\n190#1:357\n191#1:358\n253#1:367\n103#1:323\n142#1:338,8\n142#1:352,2\n213#1:359\n253#1:379,14\n103#1:324,6\n213#1:360,6\n142#1:331\n142#1:333,5\n142#1:346,6\n142#1:354\n253#1:366\n253#1:368,11\n253#1:393\n*E\n"})
/* renamed from: UE */
/* loaded from: classes.dex */
public final class C8222UE {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$a */
    /* loaded from: classes.dex */
    public static final class C8223a extends Lambda implements Function1<C42484i26, Unit> {

        /* renamed from: g */
        public static final C8223a f37052g = new C8223a();

        public C8223a() {
            super(1);
        }

        /* renamed from: invoke */
        public final void invoke2(C42484i26 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42484i26 c42484i26) {
            invoke2(c42484i26);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$b */
    /* loaded from: classes.dex */
    public static final class C8224b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f37053g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f37054h;

        /* renamed from: i */
        public final /* synthetic */ G26 f37055i;

        /* renamed from: j */
        public final /* synthetic */ Function1<C42484i26, Unit> f37056j;

        /* renamed from: k */
        public final /* synthetic */ int f37057k;

        /* renamed from: l */
        public final /* synthetic */ boolean f37058l;

        /* renamed from: m */
        public final /* synthetic */ int f37059m;

        /* renamed from: n */
        public final /* synthetic */ int f37060n;

        /* renamed from: o */
        public final /* synthetic */ int f37061o;

        /* renamed from: p */
        public final /* synthetic */ int f37062p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8224b(String str, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, Function1<? super C42484i26, Unit> function1, int i, boolean z, int i2, int i3, int i4, int i5) {
            super(2);
            this.f37053g = str;
            this.f37054h = interfaceC41563gV2;
            this.f37055i = g26;
            this.f37056j = function1;
            this.f37057k = i;
            this.f37058l = z;
            this.f37059m = i2;
            this.f37060n = i3;
            this.f37061o = i4;
            this.f37062p = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C8222UE.m81804b(this.f37053g, this.f37054h, this.f37055i, this.f37056j, this.f37057k, this.f37058l, this.f37059m, this.f37060n, interfaceC32720Et0, C47127ps4.m18626a(this.f37061o | 1), this.f37062p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$c */
    /* loaded from: classes.dex */
    public static final class C8225c extends Lambda implements Function1<C42484i26, Unit> {

        /* renamed from: g */
        public static final C8225c f37063g = new C8225c();

        public C8225c() {
            super(1);
        }

        /* renamed from: invoke */
        public final void invoke2(C42484i26 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42484i26 c42484i26) {
            invoke2(c42484i26);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$d */
    /* loaded from: classes.dex */
    public static final class C8226d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C1577Df f37064g;

        /* renamed from: h */
        public final /* synthetic */ List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> f37065h;

        /* renamed from: i */
        public final /* synthetic */ int f37066i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8226d(C1577Df c1577Df, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> list, int i) {
            super(2);
            this.f37064g = c1577Df;
            this.f37065h = list;
            this.f37066i = i;
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
                C35528Qt0.m87816Z(1749415830, i, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:256)");
            }
            JC0.m101030a(this.f37064g, this.f37065h, interfaceC32720Et0, (this.f37066i & 14) | 64);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$e */
    /* loaded from: classes.dex */
    public static final class C8227e extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C1577Df f37067g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f37068h;

        /* renamed from: i */
        public final /* synthetic */ G26 f37069i;

        /* renamed from: j */
        public final /* synthetic */ Function1<C42484i26, Unit> f37070j;

        /* renamed from: k */
        public final /* synthetic */ int f37071k;

        /* renamed from: l */
        public final /* synthetic */ boolean f37072l;

        /* renamed from: m */
        public final /* synthetic */ int f37073m;

        /* renamed from: n */
        public final /* synthetic */ int f37074n;

        /* renamed from: o */
        public final /* synthetic */ Map<String, L22> f37075o;

        /* renamed from: p */
        public final /* synthetic */ int f37076p;

        /* renamed from: q */
        public final /* synthetic */ int f37077q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8227e(C1577Df c1577Df, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, Function1<? super C42484i26, Unit> function1, int i, boolean z, int i2, int i3, Map<String, L22> map, int i4, int i5) {
            super(2);
            this.f37067g = c1577Df;
            this.f37068h = interfaceC41563gV2;
            this.f37069i = g26;
            this.f37070j = function1;
            this.f37071k = i;
            this.f37072l = z;
            this.f37073m = i2;
            this.f37074n = i3;
            this.f37075o = map;
            this.f37076p = i4;
            this.f37077q = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C8222UE.m81803c(this.f37067g, this.f37068h, this.f37069i, this.f37070j, this.f37071k, this.f37072l, this.f37073m, this.f37074n, this.f37075o, interfaceC32720Et0, C47127ps4.m18626a(this.f37076p | 1), this.f37077q);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$f */
    /* loaded from: classes.dex */
    public static final class C8228f extends Lambda implements Function1<C42484i26, Unit> {

        /* renamed from: g */
        public static final C8228f f37078g = new C8228f();

        public C8228f() {
            super(1);
        }

        /* renamed from: invoke */
        public final void invoke2(C42484i26 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42484i26 c42484i26) {
            invoke2(c42484i26);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$g */
    /* loaded from: classes.dex */
    public static final class C8229g extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C1577Df f37079g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f37080h;

        /* renamed from: i */
        public final /* synthetic */ G26 f37081i;

        /* renamed from: j */
        public final /* synthetic */ Function1<C42484i26, Unit> f37082j;

        /* renamed from: k */
        public final /* synthetic */ int f37083k;

        /* renamed from: l */
        public final /* synthetic */ boolean f37084l;

        /* renamed from: m */
        public final /* synthetic */ int f37085m;

        /* renamed from: n */
        public final /* synthetic */ Map<String, L22> f37086n;

        /* renamed from: o */
        public final /* synthetic */ int f37087o;

        /* renamed from: p */
        public final /* synthetic */ int f37088p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8229g(C1577Df c1577Df, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, Function1<? super C42484i26, Unit> function1, int i, boolean z, int i2, Map<String, L22> map, int i3, int i4) {
            super(2);
            this.f37079g = c1577Df;
            this.f37080h = interfaceC41563gV2;
            this.f37081i = g26;
            this.f37082j = function1;
            this.f37083k = i;
            this.f37084l = z;
            this.f37085m = i2;
            this.f37086n = map;
            this.f37087o = i3;
            this.f37088p = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C8222UE.m81805a(this.f37079g, this.f37080h, this.f37081i, this.f37082j, this.f37083k, this.f37084l, this.f37085m, this.f37086n, interfaceC32720Et0, C47127ps4.m18626a(this.f37087o | 1), this.f37088p);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$h */
    /* loaded from: classes.dex */
    public static final class C8230h extends Lambda implements Function0<Long> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC36685Vr5 f37089g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8230h(InterfaceC36685Vr5 interfaceC36685Vr5) {
            super(0);
            this.f37089g = interfaceC36685Vr5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(this.f37089g.m79334f());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UE$i */
    /* loaded from: classes.dex */
    public static final class C8231i extends Lambda implements Function0<Long> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC36685Vr5 f37090g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8231i(InterfaceC36685Vr5 interfaceC36685Vr5) {
            super(0);
            this.f37090g = interfaceC36685Vr5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(this.f37090g.m79334f());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    /* renamed from: UE$j */
    /* loaded from: classes.dex */
    public static final class C8232j extends Lambda implements Function0<InterfaceC32018Bt0> {

        /* renamed from: g */
        public final /* synthetic */ Function0 f37091g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8232j(Function0 function0) {
            super(0);
            this.f37091g = function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Bt0] */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC32018Bt0 invoke() {
            return this.f37091g.invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTi5;", "", "it", C17296a.f69688o, "(LTi5;J)Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: UE$k */
    /* loaded from: classes.dex */
    public static final class C8233k extends Lambda implements Function2<InterfaceC36136Ti5, Long, Long> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC36685Vr5 f37092g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8233k(InterfaceC36685Vr5 interfaceC36685Vr5) {
            super(2);
            this.f37092g = interfaceC36685Vr5;
        }

        /* renamed from: a */
        public final Long m81801a(InterfaceC36136Ti5 Saver, long j) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            if (C36919Wr5.m77781b(this.f37092g, j)) {
                return Long.valueOf(j);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Long invoke(InterfaceC36136Ti5 interfaceC36136Ti5, Long l) {
            return m81801a(interfaceC36136Ti5, l.longValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "it", C17296a.f69688o, "(J)Ljava/lang/Long;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: UE$l */
    /* loaded from: classes.dex */
    public static final class C8234l extends Lambda implements Function1<Long, Long> {

        /* renamed from: g */
        public static final C8234l f37093g = new C8234l();

        public C8234l() {
            super(1);
        }

        /* renamed from: a */
        public final Long m81800a(long j) {
            return Long.valueOf(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Long invoke(Long l) {
            return m81800a(l.longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m81805a(C1577Df text, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, Function1 function1, int i, boolean z, int i2, Map map, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4) {
        int i5;
        int i6;
        Object obj;
        int i7;
        Object obj2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Map map2;
        boolean z3;
        int i13;
        InterfaceC41563gV2 interfaceC41563gV22;
        G26 g262;
        Function1 function12;
        int i14;
        Map map3;
        Map emptyMap;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(text, "text");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-648605928);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (mo89518u.mo89539n(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= mo89518u.mo89539n(interfaceC41563gV2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                obj = g26;
                i5 |= mo89518u.mo89539n(obj) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    obj2 = function1;
                    i5 |= mo89518u.mo89629I(obj2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i9 = i;
                        i5 |= mo89518u.mo89527r(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ImageMetadata.EDGE_MODE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                                i5 |= mo89518u.mo89536o(z2) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i5 |= mo89518u.mo89527r(i2) ? 1048576 : 524288;
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                            i5 |= 4194304;
                        }
                        if (i12 != 128 && (23967451 & i5) == 4793490 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV22 = interfaceC41563gV2;
                            i13 = i2;
                            g262 = obj;
                            function12 = obj2;
                            z3 = z2;
                            i14 = i9;
                            map3 = map;
                        } else {
                            InterfaceC41563gV2.C20912a c20912a = i15 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                            G26 m105898a = i6 != 0 ? G26.f10825d.m105898a() : obj;
                            C8228f c8228f = i7 != 0 ? C8228f.f37078g : obj2;
                            int m24540a = i8 != 0 ? C45449n26.f99264a.m24540a() : i9;
                            boolean z4 = i10 != 0 ? true : z2;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i2;
                            if (i12 != 0) {
                                emptyMap = MapsKt__MapsKt.emptyMap();
                                map2 = emptyMap;
                            } else {
                                map2 = map;
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:288)");
                            }
                            m81803c(text, c20912a, m105898a, c8228f, m24540a, z4, i16, 1, map2, mo89518u, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (i5 & 3670016), 0);
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            z3 = z4;
                            i13 = i16;
                            interfaceC41563gV22 = c20912a;
                            g262 = m105898a;
                            function12 = c8228f;
                            i14 = m24540a;
                            map3 = map2;
                        }
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C8229g(text, interfaceC41563gV22, g262, function12, i14, z3, i13, map3, i3, i4));
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (i12 != 128) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    m81803c(text, c20912a, m105898a, c8228f, m24540a, z4, i16, 1, map2, mo89518u, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (i5 & 3670016), 0);
                    if (C35528Qt0.m87827O()) {
                    }
                    z3 = z4;
                    i13 = i16;
                    interfaceC41563gV22 = c20912a;
                    g262 = m105898a;
                    function12 = c8228f;
                    i14 = m24540a;
                    map3 = map2;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                obj2 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (i12 != 128) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                m81803c(text, c20912a, m105898a, c8228f, m24540a, z4, i16, 1, map2, mo89518u, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (i5 & 3670016), 0);
                if (C35528Qt0.m87827O()) {
                }
                z3 = z4;
                i13 = i16;
                interfaceC41563gV22 = c20912a;
                g262 = m105898a;
                function12 = c8228f;
                i14 = m24540a;
                map3 = map2;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj = g26;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            obj2 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (i12 != 128) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            m81803c(text, c20912a, m105898a, c8228f, m24540a, z4, i16, 1, map2, mo89518u, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (i5 & 3670016), 0);
            if (C35528Qt0.m87827O()) {
            }
            z3 = z4;
            i13 = i16;
            interfaceC41563gV22 = c20912a;
            g262 = m105898a;
            function12 = c8228f;
            i14 = m24540a;
            map3 = map2;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        obj = g26;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        obj2 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (i12 != 128) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        m81803c(text, c20912a, m105898a, c8228f, m24540a, z4, i16, 1, map2, mo89518u, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (i5 & 3670016), 0);
        if (C35528Qt0.m87827O()) {
        }
        z3 = z4;
        i13 = i16;
        interfaceC41563gV22 = c20912a;
        g262 = m105898a;
        function12 = c8228f;
        i14 = m24540a;
        map3 = map2;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m81804b(String text, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, Function1<? super C42484i26, Unit> function1, int i, boolean z, int i2, int i3, InterfaceC32720Et0 interfaceC32720Et0, int i4, int i5) {
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        int i7;
        Object obj;
        int i8;
        C8223a c8223a;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Object mo89635G;
        InterfaceC36685Vr5 interfaceC36685Vr5;
        InterfaceC36685Vr5 interfaceC36685Vr52;
        InterfaceC41563gV2 interfaceC41563gV22;
        F26 f26;
        int i14;
        boolean z2;
        int i15;
        Q06 q06;
        Function1<? super C42484i26, Unit> function12;
        boolean z3;
        int i16;
        InterfaceC41563gV2 interfaceC41563gV23;
        Function1<? super C42484i26, Unit> function13;
        int i17;
        int i18;
        G26 g262;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(text, "text");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1542716361);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (mo89518u.mo89539n(text) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            c20912a = interfaceC41563gV2;
            i6 |= mo89518u.mo89539n(c20912a) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                obj = g26;
                i6 |= mo89518u.mo89539n(obj) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    c8223a = function1;
                    i6 |= mo89518u.mo89629I(c8223a) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= mo89518u.mo89527r(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ImageMetadata.EDGE_MODE;
                        } else if ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                            i6 |= mo89518u.mo89536o(z) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= mo89518u.mo89527r(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= mo89518u.mo89527r(i3) ? 8388608 : 4194304;
                        }
                        if ((i6 & 23967451) != 4793490 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            i17 = i2;
                            interfaceC41563gV23 = c20912a;
                            g262 = obj;
                            function13 = c8223a;
                            i16 = i10;
                            z3 = z;
                            i18 = i3;
                        } else {
                            if (i19 != 0) {
                                c20912a = InterfaceC41563gV2.f82354b0;
                            }
                            G26 m105898a = i7 != 0 ? G26.f10825d.m105898a() : obj;
                            if (i8 != 0) {
                                c8223a = C8223a.f37052g;
                            }
                            if (i9 != 0) {
                                i10 = C45449n26.f99264a.m24540a();
                            }
                            boolean z4 = i11 != 0 ? true : z;
                            int i20 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i21 = i13 != 0 ? 1 : i3;
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(1542716361, i4, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:60)");
                            }
                            EI1.m109242c(i21, i20);
                            InterfaceC36685Vr5 interfaceC36685Vr53 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
                            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            AbstractC44199kw1.InterfaceC25559b interfaceC25559b = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                            mo89518u.mo89638F(959238681);
                            long longValue = interfaceC36685Vr53 == null ? 0L : ((Number) C35550Qv4.m87571b(new Object[]{text, interfaceC36685Vr53}, m81802d(interfaceC36685Vr53), null, new C8230h(interfaceC36685Vr53), mo89518u, 72, 4)).longValue();
                            mo89518u.mo89605Q();
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            InterfaceC41563gV2 interfaceC41563gV24 = c20912a;
                            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                interfaceC36685Vr5 = interfaceC36685Vr53;
                                mo89635G = new Q06(new F26(new T06(new C1577Df(text, null, null, 6, null), m105898a, i20, i21, z4, i10, interfaceC41273g01, interfaceC25559b, null, 256, null), longValue));
                                mo89518u.mo89503z(mo89635G);
                            } else {
                                interfaceC36685Vr5 = interfaceC36685Vr53;
                            }
                            mo89518u.mo89605Q();
                            Q06 q062 = (Q06) mo89635G;
                            F26 m89144h = q062.m89144h();
                            if (mo89518u.mo89521t()) {
                                interfaceC36685Vr52 = interfaceC36685Vr5;
                                interfaceC41563gV22 = interfaceC41563gV24;
                                f26 = m89144h;
                                i14 = i21;
                                z2 = z4;
                                i15 = i10;
                                q06 = q062;
                                function12 = c8223a;
                            } else {
                                interfaceC41563gV22 = interfaceC41563gV24;
                                f26 = m89144h;
                                boolean z5 = z4;
                                interfaceC36685Vr52 = interfaceC36685Vr5;
                                z2 = z4;
                                q06 = q062;
                                i14 = i21;
                                i15 = i10;
                                function12 = c8223a;
                                q06.m89141k(JC0.m101026e(m89144h.m108076i(), text, m105898a, interfaceC41273g01, interfaceC25559b, z5, i10, i20, i14));
                            }
                            f26.m108071n(function12);
                            q06.m89140l(interfaceC36685Vr52);
                            mo89518u.mo89638F(959240076);
                            if (interfaceC36685Vr52 != null) {
                                f26.m108068q(((B26) mo89518u.mo89572c(C26.m112949b())).m114777a());
                            }
                            mo89518u.mo89605Q();
                            InterfaceC41563gV2 mo39266t0 = interfaceC41563gV22.mo39266t0(q06.m89145g());
                            InterfaceC51579xO2 m89146f = q06.m89146f();
                            mo89518u.mo89638F(544976794);
                            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                            InterfaceC41563gV2 m109806c = C32486Dt0.m109806c(mo89518u, mo39266t0);
                            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                            mo89518u.mo89638F(1405779621);
                            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                                C52468yt0.m2335c();
                            }
                            mo89518u.mo89557h();
                            if (mo89518u.mo89521t()) {
                                mo89518u.mo89617M(new C8232j(m113415a));
                            } else {
                                mo89518u.mo89566e();
                            }
                            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                            C38680bf6.m64191b(m64192a, m89146f, c0757a.m113412d());
                            C38680bf6.m64191b(m64192a, interfaceC41273g012, c0757a.m113414b());
                            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                            C38680bf6.m64191b(m64192a, m109806c, c0757a.m113411e());
                            mo89518u.mo89563f();
                            mo89518u.mo89605Q();
                            mo89518u.mo89605Q();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            z3 = z2;
                            i16 = i15;
                            interfaceC41563gV23 = interfaceC41563gV22;
                            function13 = function12;
                            i17 = i20;
                            i18 = i14;
                            g262 = m105898a;
                        }
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C8224b(text, interfaceC41563gV23, g262, function13, i16, z3, i17, i18, i4, i5));
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    if ((i6 & 23967451) != 4793490) {
                    }
                    if (i19 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    EI1.m109242c(i21, i20);
                    InterfaceC36685Vr5 interfaceC36685Vr532 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
                    InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    AbstractC44199kw1.InterfaceC25559b interfaceC25559b2 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                    mo89518u.mo89638F(959238681);
                    if (interfaceC36685Vr532 == null) {
                    }
                    mo89518u.mo89605Q();
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    InterfaceC41563gV2 interfaceC41563gV242 = c20912a;
                    if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    Q06 q0622 = (Q06) mo89635G;
                    F26 m89144h2 = q0622.m89144h();
                    if (mo89518u.mo89521t()) {
                    }
                    f26.m108071n(function12);
                    q06.m89140l(interfaceC36685Vr52);
                    mo89518u.mo89638F(959240076);
                    if (interfaceC36685Vr52 != null) {
                    }
                    mo89518u.mo89605Q();
                    InterfaceC41563gV2 mo39266t02 = interfaceC41563gV22.mo39266t0(q06.m89145g());
                    InterfaceC51579xO2 m89146f2 = q06.m89146f();
                    mo89518u.mo89638F(544976794);
                    InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC41563gV2 m109806c2 = C32486Dt0.m109806c(mo89518u, mo39266t02);
                    InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
                    mo89518u.mo89638F(1405779621);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    }
                    mo89518u.mo89557h();
                    if (mo89518u.mo89521t()) {
                    }
                    InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a2, m89146f2, c0757a2.m113412d());
                    C38680bf6.m64191b(m64192a2, interfaceC41273g0122, c0757a2.m113414b());
                    C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
                    C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
                    C38680bf6.m64191b(m64192a2, m109806c2, c0757a2.m113411e());
                    mo89518u.mo89563f();
                    mo89518u.mo89605Q();
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                    }
                    z3 = z2;
                    i16 = i15;
                    interfaceC41563gV23 = interfaceC41563gV22;
                    function13 = function12;
                    i17 = i20;
                    i18 = i14;
                    g262 = m105898a;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                c8223a = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                if ((i6 & 23967451) != 4793490) {
                }
                if (i19 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                EI1.m109242c(i21, i20);
                InterfaceC36685Vr5 interfaceC36685Vr5322 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
                InterfaceC41273g01 interfaceC41273g0132 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                AbstractC44199kw1.InterfaceC25559b interfaceC25559b22 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                mo89518u.mo89638F(959238681);
                if (interfaceC36685Vr5322 == null) {
                }
                mo89518u.mo89605Q();
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                InterfaceC41563gV2 interfaceC41563gV2422 = c20912a;
                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                }
                mo89518u.mo89605Q();
                Q06 q06222 = (Q06) mo89635G;
                F26 m89144h22 = q06222.m89144h();
                if (mo89518u.mo89521t()) {
                }
                f26.m108071n(function12);
                q06.m89140l(interfaceC36685Vr52);
                mo89518u.mo89638F(959240076);
                if (interfaceC36685Vr52 != null) {
                }
                mo89518u.mo89605Q();
                InterfaceC41563gV2 mo39266t022 = interfaceC41563gV22.mo39266t0(q06.m89145g());
                InterfaceC51579xO2 m89146f22 = q06.m89146f();
                mo89518u.mo89638F(544976794);
                InterfaceC41273g01 interfaceC41273g01222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC41563gV2 m109806c22 = C32486Dt0.m109806c(mo89518u, mo39266t022);
                InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
                mo89518u.mo89638F(1405779621);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                }
                mo89518u.mo89557h();
                if (mo89518u.mo89521t()) {
                }
                InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a22, m89146f22, c0757a22.m113412d());
                C38680bf6.m64191b(m64192a22, interfaceC41273g01222, c0757a22.m113414b());
                C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a22.m113413c());
                C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
                C38680bf6.m64191b(m64192a22, m109806c22, c0757a22.m113411e());
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                }
                z3 = z2;
                i16 = i15;
                interfaceC41563gV23 = interfaceC41563gV22;
                function13 = function12;
                i17 = i20;
                i18 = i14;
                g262 = m105898a;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj = g26;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            c8223a = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            if ((i6 & 23967451) != 4793490) {
            }
            if (i19 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            EI1.m109242c(i21, i20);
            InterfaceC36685Vr5 interfaceC36685Vr53222 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
            InterfaceC41273g01 interfaceC41273g01322 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            AbstractC44199kw1.InterfaceC25559b interfaceC25559b222 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
            mo89518u.mo89638F(959238681);
            if (interfaceC36685Vr53222 == null) {
            }
            mo89518u.mo89605Q();
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            InterfaceC41563gV2 interfaceC41563gV24222 = c20912a;
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            }
            mo89518u.mo89605Q();
            Q06 q062222 = (Q06) mo89635G;
            F26 m89144h222 = q062222.m89144h();
            if (mo89518u.mo89521t()) {
            }
            f26.m108071n(function12);
            q06.m89140l(interfaceC36685Vr52);
            mo89518u.mo89638F(959240076);
            if (interfaceC36685Vr52 != null) {
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 mo39266t0222 = interfaceC41563gV22.mo39266t0(q06.m89145g());
            InterfaceC51579xO2 m89146f222 = q06.m89146f();
            mo89518u.mo89638F(544976794);
            InterfaceC41273g01 interfaceC41273g012222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC41563gV2 m109806c222 = C32486Dt0.m109806c(mo89518u, mo39266t0222);
            InterfaceC32018Bt0.C0757a c0757a222 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a222 = c0757a222.m113415a();
            mo89518u.mo89638F(1405779621);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
            }
            InterfaceC32720Et0 m64192a222 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a222, m89146f222, c0757a222.m113412d());
            C38680bf6.m64191b(m64192a222, interfaceC41273g012222, c0757a222.m113414b());
            C38680bf6.m64191b(m64192a222, enumC47065pm2222, c0757a222.m113413c());
            C38680bf6.m64191b(m64192a222, interfaceC33869Jq6222, c0757a222.m113410f());
            C38680bf6.m64191b(m64192a222, m109806c222, c0757a222.m113411e());
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            z3 = z2;
            i16 = i15;
            interfaceC41563gV23 = interfaceC41563gV22;
            function13 = function12;
            i17 = i20;
            i18 = i14;
            g262 = m105898a;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        c20912a = interfaceC41563gV2;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        obj = g26;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        c8223a = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        if ((i6 & 23967451) != 4793490) {
        }
        if (i19 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        EI1.m109242c(i21, i20);
        InterfaceC36685Vr5 interfaceC36685Vr532222 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
        InterfaceC41273g01 interfaceC41273g013222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        AbstractC44199kw1.InterfaceC25559b interfaceC25559b2222 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
        mo89518u.mo89638F(959238681);
        if (interfaceC36685Vr532222 == null) {
        }
        mo89518u.mo89605Q();
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        InterfaceC41563gV2 interfaceC41563gV242222 = c20912a;
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
        }
        mo89518u.mo89605Q();
        Q06 q0622222 = (Q06) mo89635G;
        F26 m89144h2222 = q0622222.m89144h();
        if (mo89518u.mo89521t()) {
        }
        f26.m108071n(function12);
        q06.m89140l(interfaceC36685Vr52);
        mo89518u.mo89638F(959240076);
        if (interfaceC36685Vr52 != null) {
        }
        mo89518u.mo89605Q();
        InterfaceC41563gV2 mo39266t02222 = interfaceC41563gV22.mo39266t0(q06.m89145g());
        InterfaceC51579xO2 m89146f2222 = q06.m89146f();
        mo89518u.mo89638F(544976794);
        InterfaceC41273g01 interfaceC41273g0122222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC41563gV2 m109806c2222 = C32486Dt0.m109806c(mo89518u, mo39266t02222);
        InterfaceC32018Bt0.C0757a c0757a2222 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a2222 = c0757a2222.m113415a();
        mo89518u.mo89638F(1405779621);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
        }
        InterfaceC32720Et0 m64192a2222 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2222, m89146f2222, c0757a2222.m113412d());
        C38680bf6.m64191b(m64192a2222, interfaceC41273g0122222, c0757a2222.m113414b());
        C38680bf6.m64191b(m64192a2222, enumC47065pm22222, c0757a2222.m113413c());
        C38680bf6.m64191b(m64192a2222, interfaceC33869Jq62222, c0757a2222.m113410f());
        C38680bf6.m64191b(m64192a2222, m109806c2222, c0757a2222.m113411e());
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        z3 = z2;
        i16 = i15;
        interfaceC41563gV23 = interfaceC41563gV22;
        function13 = function12;
        i17 = i20;
        i18 = i14;
        g262 = m105898a;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m81803c(C1577Df text, InterfaceC41563gV2 interfaceC41563gV2, G26 g26, Function1<? super C42484i26, Unit> function1, int i, boolean z, int i2, int i3, Map<String, L22> map, InterfaceC32720Et0 interfaceC32720Et0, int i4, int i5) {
        int i6;
        int i7;
        Object obj;
        int i8;
        C8225c c8225c;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Map<String, L22> map2;
        InterfaceC36685Vr5 interfaceC36685Vr5;
        List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> list;
        long longValue;
        Object mo89635G;
        List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> list2;
        int i15;
        long j;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36685Vr5 interfaceC36685Vr52;
        Map<String, L22> map3;
        int i16;
        int i17;
        Function1<? super C42484i26, Unit> function12;
        InterfaceC41563gV2 interfaceC41563gV23;
        Function1<? super C42484i26, Unit> function13;
        int i18;
        boolean z2;
        G26 g262;
        Map<String, L22> map4;
        int i19;
        int i20;
        Map<String, L22> emptyMap;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(text, "text");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(851408699);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (mo89518u.mo89539n(text) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= mo89518u.mo89539n(interfaceC41563gV2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                obj = g26;
                i6 |= mo89518u.mo89539n(obj) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    c8225c = function1;
                    i6 |= mo89518u.mo89629I(c8225c) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= mo89518u.mo89527r(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ImageMetadata.EDGE_MODE;
                        } else if ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                            i6 |= mo89518u.mo89536o(z) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= mo89518u.mo89527r(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= mo89518u.mo89527r(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        if (i14 != 256 && (191739611 & i6) == 38347922 && mo89518u.mo89575b()) {
                            mo89518u.mo89548k();
                            interfaceC41563gV23 = interfaceC41563gV2;
                            z2 = z;
                            i19 = i3;
                            g262 = obj;
                            function13 = c8225c;
                            i18 = i10;
                            i20 = i2;
                            map4 = map;
                        } else {
                            InterfaceC41563gV2.C20912a c20912a = i21 != 0 ? InterfaceC41563gV2.f82354b0 : interfaceC41563gV2;
                            G26 m105898a = i7 != 0 ? G26.f10825d.m105898a() : obj;
                            if (i8 != 0) {
                                c8225c = C8225c.f37063g;
                            }
                            if (i9 != 0) {
                                i10 = C45449n26.f99264a.m24540a();
                            }
                            boolean z3 = i11 != 0 ? true : z;
                            int i22 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i23 = i13 != 0 ? 1 : i3;
                            if (i14 != 0) {
                                emptyMap = MapsKt__MapsKt.emptyMap();
                                map2 = emptyMap;
                            } else {
                                map2 = map;
                            }
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87816Z(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:170)");
                            }
                            EI1.m109242c(i23, i22);
                            interfaceC36685Vr5 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
                            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            AbstractC44199kw1.InterfaceC25559b interfaceC25559b = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                            long m114777a = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
                            Pair<List<C1577Df.C1580b<TU3>>, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>>> m101029b = JC0.m101029b(text, map2);
                            List<C1577Df.C1580b<TU3>> component1 = m101029b.component1();
                            List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> component2 = m101029b.component2();
                            mo89518u.mo89638F(959243860);
                            if (interfaceC36685Vr5 == null) {
                                list = component2;
                                longValue = 0;
                            } else {
                                list = component2;
                                longValue = ((Number) C35550Qv4.m87571b(new Object[]{text, interfaceC36685Vr5}, m81802d(interfaceC36685Vr5), null, new C8231i(interfaceC36685Vr5), mo89518u, 72, 4)).longValue();
                            }
                            mo89518u.mo89605Q();
                            mo89518u.mo89638F(-492369756);
                            mo89635G = mo89518u.mo89635G();
                            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                                list2 = list;
                                i15 = i6;
                                j = m114777a;
                                interfaceC41563gV22 = c20912a;
                                interfaceC36685Vr52 = interfaceC36685Vr5;
                                map3 = map2;
                                i16 = i23;
                                i17 = i22;
                                function12 = c8225c;
                                Q06 q06 = new Q06(new F26(new T06(text, m105898a, i22, i23, z3, i10, interfaceC41273g01, interfaceC25559b, component1, null), longValue));
                                mo89518u.mo89503z(q06);
                                mo89635G = q06;
                            } else {
                                list2 = list;
                                i15 = i6;
                                j = m114777a;
                                interfaceC41563gV22 = c20912a;
                                interfaceC36685Vr52 = interfaceC36685Vr5;
                                map3 = map2;
                                i16 = i23;
                                i17 = i22;
                                function12 = c8225c;
                            }
                            mo89518u.mo89605Q();
                            Q06 q062 = (Q06) mo89635G;
                            F26 m89144h = q062.m89144h();
                            if (!mo89518u.mo89521t()) {
                                q062.m89141k(JC0.m101028c(m89144h.m108076i(), text, m105898a, interfaceC41273g01, interfaceC25559b, z3, i10, i17, i16, component1));
                            }
                            Function1<? super C42484i26, Unit> function14 = function12;
                            m89144h.m108071n(function14);
                            m89144h.m108068q(j);
                            q062.m89140l(interfaceC36685Vr52);
                            Function2<InterfaceC32720Et0, Integer, Unit> m18566a = list2.isEmpty() ? C47133pt0.f104216a.m18566a() : C43575jt0.m29791b(mo89518u, 1749415830, true, new C8226d(text, list2, i15));
                            InterfaceC41563gV2 interfaceC41563gV24 = interfaceC41563gV22;
                            InterfaceC41563gV2 mo39266t0 = interfaceC41563gV24.mo39266t0(q062.m89145g());
                            InterfaceC51579xO2 m89146f = q062.m89146f();
                            mo89518u.mo89638F(-1323940314);
                            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(mo39266t0);
                            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                                C52468yt0.m2335c();
                            }
                            mo89518u.mo89557h();
                            if (mo89518u.mo89521t()) {
                                mo89518u.mo89617M(m113415a);
                            } else {
                                mo89518u.mo89566e();
                            }
                            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                            C38680bf6.m64191b(m64192a, m89146f, c0757a.m113412d());
                            C38680bf6.m64191b(m64192a, interfaceC41273g012, c0757a.m113414b());
                            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                            mo89518u.mo89638F(2058660585);
                            m18566a.invoke(mo89518u, 0);
                            mo89518u.mo89605Q();
                            mo89518u.mo89563f();
                            mo89518u.mo89605Q();
                            if (C35528Qt0.m87827O()) {
                                C35528Qt0.m87817Y();
                            }
                            interfaceC41563gV23 = interfaceC41563gV24;
                            function13 = function14;
                            i18 = i10;
                            z2 = z3;
                            g262 = m105898a;
                            map4 = map3;
                            i19 = i16;
                            i20 = i17;
                        }
                        mo89512w = mo89518u.mo89512w();
                        if (mo89512w == null) {
                            return;
                        }
                        mo89512w.mo20405a(new C8227e(text, interfaceC41563gV23, g262, function13, i18, z2, i20, i19, map4, i4, i5));
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 != 256) {
                    }
                    if (i21 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (C35528Qt0.m87827O()) {
                    }
                    EI1.m109242c(i23, i22);
                    interfaceC36685Vr5 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
                    InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    AbstractC44199kw1.InterfaceC25559b interfaceC25559b2 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                    long m114777a2 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
                    Pair<List<C1577Df.C1580b<TU3>>, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>>> m101029b2 = JC0.m101029b(text, map2);
                    List<C1577Df.C1580b<TU3>> component12 = m101029b2.component1();
                    List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> component22 = m101029b2.component2();
                    mo89518u.mo89638F(959243860);
                    if (interfaceC36685Vr5 == null) {
                    }
                    mo89518u.mo89605Q();
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    }
                    mo89518u.mo89605Q();
                    Q06 q0622 = (Q06) mo89635G;
                    F26 m89144h2 = q0622.m89144h();
                    if (!mo89518u.mo89521t()) {
                    }
                    Function1<? super C42484i26, Unit> function142 = function12;
                    m89144h2.m108071n(function142);
                    m89144h2.m108068q(j);
                    q0622.m89140l(interfaceC36685Vr52);
                    if (list2.isEmpty()) {
                    }
                    InterfaceC41563gV2 interfaceC41563gV242 = interfaceC41563gV22;
                    InterfaceC41563gV2 mo39266t02 = interfaceC41563gV242.mo39266t0(q0622.m89145g());
                    InterfaceC51579xO2 m89146f2 = q0622.m89146f();
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(mo39266t02);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    }
                    mo89518u.mo89557h();
                    if (mo89518u.mo89521t()) {
                    }
                    InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a2, m89146f2, c0757a2.m113412d());
                    C38680bf6.m64191b(m64192a2, interfaceC41273g0122, c0757a2.m113414b());
                    C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
                    C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
                    m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    m18566a.invoke(mo89518u, 0);
                    mo89518u.mo89605Q();
                    mo89518u.mo89563f();
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                    }
                    interfaceC41563gV23 = interfaceC41563gV242;
                    function13 = function142;
                    i18 = i10;
                    z2 = z3;
                    g262 = m105898a;
                    map4 = map3;
                    i19 = i16;
                    i20 = i17;
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                    }
                }
                c8225c = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 != 256) {
                }
                if (i21 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                EI1.m109242c(i23, i22);
                interfaceC36685Vr5 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
                InterfaceC41273g01 interfaceC41273g0132 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                AbstractC44199kw1.InterfaceC25559b interfaceC25559b22 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
                long m114777a22 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
                Pair<List<C1577Df.C1580b<TU3>>, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>>> m101029b22 = JC0.m101029b(text, map2);
                List<C1577Df.C1580b<TU3>> component122 = m101029b22.component1();
                List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> component222 = m101029b22.component2();
                mo89518u.mo89638F(959243860);
                if (interfaceC36685Vr5 == null) {
                }
                mo89518u.mo89605Q();
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                }
                mo89518u.mo89605Q();
                Q06 q06222 = (Q06) mo89635G;
                F26 m89144h22 = q06222.m89144h();
                if (!mo89518u.mo89521t()) {
                }
                Function1<? super C42484i26, Unit> function1422 = function12;
                m89144h22.m108071n(function1422);
                m89144h22.m108068q(j);
                q06222.m89140l(interfaceC36685Vr52);
                if (list2.isEmpty()) {
                }
                InterfaceC41563gV2 interfaceC41563gV2422 = interfaceC41563gV22;
                InterfaceC41563gV2 mo39266t022 = interfaceC41563gV2422.mo39266t0(q06222.m89145g());
                InterfaceC51579xO2 m89146f22 = q06222.m89146f();
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(mo39266t022);
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                }
                mo89518u.mo89557h();
                if (mo89518u.mo89521t()) {
                }
                InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a22, m89146f22, c0757a22.m113412d());
                C38680bf6.m64191b(m64192a22, interfaceC41273g01222, c0757a22.m113414b());
                C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a22.m113413c());
                C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
                m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                m18566a.invoke(mo89518u, 0);
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV23 = interfaceC41563gV2422;
                function13 = function1422;
                i18 = i10;
                z2 = z3;
                g262 = m105898a;
                map4 = map3;
                i19 = i16;
                i20 = i17;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj = g26;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            c8225c = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 != 256) {
            }
            if (i21 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            EI1.m109242c(i23, i22);
            interfaceC36685Vr5 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
            InterfaceC41273g01 interfaceC41273g01322 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            AbstractC44199kw1.InterfaceC25559b interfaceC25559b222 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
            long m114777a222 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
            Pair<List<C1577Df.C1580b<TU3>>, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>>> m101029b222 = JC0.m101029b(text, map2);
            List<C1577Df.C1580b<TU3>> component1222 = m101029b222.component1();
            List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> component2222 = m101029b222.component2();
            mo89518u.mo89638F(959243860);
            if (interfaceC36685Vr5 == null) {
            }
            mo89518u.mo89605Q();
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            }
            mo89518u.mo89605Q();
            Q06 q062222 = (Q06) mo89635G;
            F26 m89144h222 = q062222.m89144h();
            if (!mo89518u.mo89521t()) {
            }
            Function1<? super C42484i26, Unit> function14222 = function12;
            m89144h222.m108071n(function14222);
            m89144h222.m108068q(j);
            q062222.m89140l(interfaceC36685Vr52);
            if (list2.isEmpty()) {
            }
            InterfaceC41563gV2 interfaceC41563gV24222 = interfaceC41563gV22;
            InterfaceC41563gV2 mo39266t0222 = interfaceC41563gV24222.mo39266t0(q062222.m89145g());
            InterfaceC51579xO2 m89146f222 = q062222.m89146f();
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a222 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a222 = c0757a222.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a222 = C31723Am2.m115273a(mo39266t0222);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
            }
            InterfaceC32720Et0 m64192a222 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a222, m89146f222, c0757a222.m113412d());
            C38680bf6.m64191b(m64192a222, interfaceC41273g012222, c0757a222.m113414b());
            C38680bf6.m64191b(m64192a222, enumC47065pm2222, c0757a222.m113413c());
            C38680bf6.m64191b(m64192a222, interfaceC33869Jq6222, c0757a222.m113410f());
            m115273a222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            m18566a.invoke(mo89518u, 0);
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV23 = interfaceC41563gV24222;
            function13 = function14222;
            i18 = i10;
            z2 = z3;
            g262 = m105898a;
            map4 = map3;
            i19 = i16;
            i20 = i17;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        obj = g26;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        c8225c = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 != 256) {
        }
        if (i21 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        EI1.m109242c(i23, i22);
        interfaceC36685Vr5 = (InterfaceC36685Vr5) mo89518u.mo89572c(C36919Wr5.m77782a());
        InterfaceC41273g01 interfaceC41273g013222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        AbstractC44199kw1.InterfaceC25559b interfaceC25559b2222 = (AbstractC44199kw1.InterfaceC25559b) mo89518u.mo89572c(C42399hu0.m35610i());
        long m114777a2222 = ((B26) mo89518u.mo89572c(C26.m112949b())).m114777a();
        Pair<List<C1577Df.C1580b<TU3>>, List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>>> m101029b2222 = JC0.m101029b(text, map2);
        List<C1577Df.C1580b<TU3>> component12222 = m101029b2222.component1();
        List<C1577Df.C1580b<Function3<String, InterfaceC32720Et0, Integer, Unit>>> component22222 = m101029b2222.component2();
        mo89518u.mo89638F(959243860);
        if (interfaceC36685Vr5 == null) {
        }
        mo89518u.mo89605Q();
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
        }
        mo89518u.mo89605Q();
        Q06 q0622222 = (Q06) mo89635G;
        F26 m89144h2222 = q0622222.m89144h();
        if (!mo89518u.mo89521t()) {
        }
        Function1<? super C42484i26, Unit> function142222 = function12;
        m89144h2222.m108071n(function142222);
        m89144h2222.m108068q(j);
        q0622222.m89140l(interfaceC36685Vr52);
        if (list2.isEmpty()) {
        }
        InterfaceC41563gV2 interfaceC41563gV242222 = interfaceC41563gV22;
        InterfaceC41563gV2 mo39266t02222 = interfaceC41563gV242222.mo39266t0(q0622222.m89145g());
        InterfaceC51579xO2 m89146f2222 = q0622222.m89146f();
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62222 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2222 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a2222 = c0757a2222.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2222 = C31723Am2.m115273a(mo39266t02222);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
        }
        InterfaceC32720Et0 m64192a2222 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2222, m89146f2222, c0757a2222.m113412d());
        C38680bf6.m64191b(m64192a2222, interfaceC41273g0122222, c0757a2222.m113414b());
        C38680bf6.m64191b(m64192a2222, enumC47065pm22222, c0757a2222.m113413c());
        C38680bf6.m64191b(m64192a2222, interfaceC33869Jq62222, c0757a2222.m113410f());
        m115273a2222.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        m18566a.invoke(mo89518u, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV23 = interfaceC41563gV242222;
        function13 = function142222;
        i18 = i10;
        z2 = z3;
        g262 = m105898a;
        map4 = map3;
        i19 = i16;
        i20 = i17;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: d */
    public static final InterfaceC35668Ri5<Long, Long> m81802d(InterfaceC36685Vr5 interfaceC36685Vr5) {
        return C35902Si5.m85006a(new C8233k(interfaceC36685Vr5), C8234l.f37093g);
    }
}
