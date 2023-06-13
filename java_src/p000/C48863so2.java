package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC48600sM5;
import p000.C25777lo;
import p000.InterfaceC32720Et0;
import p000.InterfaceC4360K9;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009a\u0001\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0099\u0001\u0010)\u001a\u0019\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%¢\u0006\u0002\b\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020#H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m28432d2 = {"LgV2;", "modifier", "LCo2;", TransferTable.COLUMN_STATE, "LPD3;", "contentPadding", "", "reverseLayout", "isVertical", "Lcu1;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsItemCount", "LK9$b;", "horizontalAlignment", "Llo$l;", "verticalArrangement", "LK9$c;", "verticalAlignment", "Llo$d;", "horizontalArrangement", "Lkotlin/Function1;", "Lyo2;", "", "Lkotlin/ExtensionFunctionType;", "content", C17296a.f69688o, "(LgV2;LCo2;LPD3;ZZLcu1;ZILK9$b;Llo$l;LK9$c;Llo$d;Lkotlin/jvm/functions/Function1;LEt0;III)V", "Lpo2;", "itemProvider", "b", "(Lpo2;LCo2;LEt0;I)V", "Lho2;", "beyondBoundsInfo", "Lno2;", "placementAnimator", "Lkotlin/Function2;", "LVn2;", "Lkz0;", "LyO2;", DateTokenConverter.CONVERTER_KEY, "(Lpo2;LCo2;Lho2;LPD3;ZZILK9$b;LK9$c;Llo$d;Llo$l;Lno2;LEt0;III)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,334:1\n25#2:335\n25#2:346\n50#2:357\n49#2:358\n83#2,3:366\n1114#3,6:336\n1114#3,3:347\n1117#3,3:353\n1114#3,6:359\n1114#3,6:369\n474#4,4:342\n478#4,2:350\n482#4:356\n474#5:352\n76#6:365\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n81#1:335\n82#1:346\n83#1:357\n83#1:358\n178#1:366,3\n81#1:336,6\n82#1:347,3\n82#1:353,3\n83#1:359,6\n178#1:369,6\n82#1:342,4\n82#1:350,2\n82#1:356\n82#1:352\n123#1:365\n*E\n"})
/* renamed from: so2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48863so2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: so2$a */
    /* loaded from: classes.dex */
    public static final class C28404a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41563gV2 f109307g;

        /* renamed from: h */
        public final /* synthetic */ C32209Co2 f109308h;

        /* renamed from: i */
        public final /* synthetic */ PD3 f109309i;

        /* renamed from: j */
        public final /* synthetic */ boolean f109310j;

        /* renamed from: k */
        public final /* synthetic */ boolean f109311k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC39436cu1 f109312l;

        /* renamed from: m */
        public final /* synthetic */ boolean f109313m;

        /* renamed from: n */
        public final /* synthetic */ int f109314n;

        /* renamed from: o */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4362b f109315o;

        /* renamed from: p */
        public final /* synthetic */ C25777lo.InterfaceC25789l f109316p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4363c f109317q;

        /* renamed from: r */
        public final /* synthetic */ C25777lo.InterfaceC25781d f109318r;

        /* renamed from: s */
        public final /* synthetic */ Function1<InterfaceC52420yo2, Unit> f109319s;

        /* renamed from: t */
        public final /* synthetic */ int f109320t;

        /* renamed from: u */
        public final /* synthetic */ int f109321u;

        /* renamed from: v */
        public final /* synthetic */ int f109322v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28404a(InterfaceC41563gV2 interfaceC41563gV2, C32209Co2 c32209Co2, PD3 pd3, boolean z, boolean z2, InterfaceC39436cu1 interfaceC39436cu1, boolean z3, int i, InterfaceC4360K9.InterfaceC4362b interfaceC4362b, C25777lo.InterfaceC25789l interfaceC25789l, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, C25777lo.InterfaceC25781d interfaceC25781d, Function1<? super InterfaceC52420yo2, Unit> function1, int i2, int i3, int i4) {
            super(2);
            this.f109307g = interfaceC41563gV2;
            this.f109308h = c32209Co2;
            this.f109309i = pd3;
            this.f109310j = z;
            this.f109311k = z2;
            this.f109312l = interfaceC39436cu1;
            this.f109313m = z3;
            this.f109314n = i;
            this.f109315o = interfaceC4362b;
            this.f109316p = interfaceC25789l;
            this.f109317q = interfaceC4363c;
            this.f109318r = interfaceC25781d;
            this.f109319s = function1;
            this.f109320t = i2;
            this.f109321u = i3;
            this.f109322v = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C48863so2.m13631a(this.f109307g, this.f109308h, this.f109309i, this.f109310j, this.f109311k, this.f109312l, this.f109313m, this.f109314n, this.f109315o, this.f109316p, this.f109317q, this.f109318r, this.f109319s, interfaceC32720Et0, C47127ps4.m18626a(this.f109320t | 1), C47127ps4.m18626a(this.f109321u), this.f109322v);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: so2$b */
    /* loaded from: classes.dex */
    public static final class C28405b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC47085po2 f109323g;

        /* renamed from: h */
        public final /* synthetic */ C32209Co2 f109324h;

        /* renamed from: i */
        public final /* synthetic */ int f109325i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28405b(InterfaceC47085po2 interfaceC47085po2, C32209Co2 c32209Co2, int i) {
            super(2);
            this.f109323g = interfaceC47085po2;
            this.f109324h = c32209Co2;
            this.f109325i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C48863so2.m13630b(this.f109323g, this.f109324h, interfaceC32720Et0, C47127ps4.m18626a(this.f109325i | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,334:1\n480#2,4:335\n485#2:344\n122#3,5:339\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n294#1:335,4\n294#1:344\n294#1:339,5\n*E\n"})
    /* renamed from: so2$c */
    /* loaded from: classes.dex */
    public static final class C28406c extends Lambda implements Function2<InterfaceC36646Vn2, C44228kz0, C50641vo2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f109326g;

        /* renamed from: h */
        public final /* synthetic */ PD3 f109327h;

        /* renamed from: i */
        public final /* synthetic */ boolean f109328i;

        /* renamed from: j */
        public final /* synthetic */ C32209Co2 f109329j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC47085po2 f109330k;

        /* renamed from: l */
        public final /* synthetic */ C25777lo.InterfaceC25789l f109331l;

        /* renamed from: m */
        public final /* synthetic */ C25777lo.InterfaceC25781d f109332m;

        /* renamed from: n */
        public final /* synthetic */ C45899no2 f109333n;

        /* renamed from: o */
        public final /* synthetic */ C42341ho2 f109334o;

        /* renamed from: p */
        public final /* synthetic */ int f109335p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4362b f109336q;

        /* renamed from: r */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4363c f109337r;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: so2$c$a */
        /* loaded from: classes.dex */
        public static final class C28407a extends Lambda implements Function3<Integer, Integer, Function1<? super OU3.AbstractC6015a, ? extends Unit>, InterfaceC52172yO2> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC36646Vn2 f109338g;

            /* renamed from: h */
            public final /* synthetic */ long f109339h;

            /* renamed from: i */
            public final /* synthetic */ int f109340i;

            /* renamed from: j */
            public final /* synthetic */ int f109341j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28407a(InterfaceC36646Vn2 interfaceC36646Vn2, long j, int i, int i2) {
                super(3);
                this.f109338g = interfaceC36646Vn2;
                this.f109339h = j;
                this.f109340i = i;
                this.f109341j = i2;
            }

            /* renamed from: a */
            public final InterfaceC52172yO2 m13626a(int i, int i2, Function1<? super OU3.AbstractC6015a, Unit> placement) {
                Map<AbstractC4750L9, Integer> emptyMap;
                Intrinsics.checkNotNullParameter(placement, "placement");
                InterfaceC36646Vn2 interfaceC36646Vn2 = this.f109338g;
                int m22037g = C46007nz0.m22037g(this.f109339h, i + this.f109340i);
                int m22038f = C46007nz0.m22038f(this.f109339h, i2 + this.f109341j);
                emptyMap = MapsKt__MapsKt.emptyMap();
                return interfaceC36646Vn2.mo1431O0(m22037g, m22038f, emptyMap, placement);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(Integer num, Integer num2, Function1<? super OU3.AbstractC6015a, ? extends Unit> function1) {
                return m13626a(num.intValue(), num2.intValue(), function1);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: so2$c$b */
        /* loaded from: classes.dex */
        public static final class C28408b implements CO2 {

            /* renamed from: a */
            public final /* synthetic */ int f109342a;

            /* renamed from: b */
            public final /* synthetic */ int f109343b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC36646Vn2 f109344c;

            /* renamed from: d */
            public final /* synthetic */ boolean f109345d;

            /* renamed from: e */
            public final /* synthetic */ InterfaceC4360K9.InterfaceC4362b f109346e;

            /* renamed from: f */
            public final /* synthetic */ InterfaceC4360K9.InterfaceC4363c f109347f;

            /* renamed from: g */
            public final /* synthetic */ boolean f109348g;

            /* renamed from: h */
            public final /* synthetic */ int f109349h;

            /* renamed from: i */
            public final /* synthetic */ int f109350i;

            /* renamed from: j */
            public final /* synthetic */ C45899no2 f109351j;

            /* renamed from: k */
            public final /* synthetic */ long f109352k;

            public C28408b(int i, int i2, InterfaceC36646Vn2 interfaceC36646Vn2, boolean z, InterfaceC4360K9.InterfaceC4362b interfaceC4362b, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, boolean z2, int i3, int i4, C45899no2 c45899no2, long j) {
                this.f109342a = i;
                this.f109343b = i2;
                this.f109344c = interfaceC36646Vn2;
                this.f109345d = z;
                this.f109346e = interfaceC4362b;
                this.f109347f = interfaceC4363c;
                this.f109348g = z2;
                this.f109349h = i3;
                this.f109350i = i4;
                this.f109351j = c45899no2;
                this.f109352k = j;
            }

            @Override // p000.CO2
            /* renamed from: a */
            public final C32677Eo2 mo13625a(int i, Object key, List<? extends OU3> placeables) {
                int i2;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                if (i == this.f109342a - 1) {
                    i2 = 0;
                } else {
                    i2 = this.f109343b;
                }
                int i3 = i2;
                return new C32677Eo2(i, placeables, this.f109345d, this.f109346e, this.f109347f, this.f109344c.getLayoutDirection(), this.f109348g, this.f109349h, this.f109350i, this.f109351j, i3, this.f109352k, key, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28406c(boolean z, PD3 pd3, boolean z2, C32209Co2 c32209Co2, InterfaceC47085po2 interfaceC47085po2, C25777lo.InterfaceC25789l interfaceC25789l, C25777lo.InterfaceC25781d interfaceC25781d, C45899no2 c45899no2, C42341ho2 c42341ho2, int i, InterfaceC4360K9.InterfaceC4362b interfaceC4362b, InterfaceC4360K9.InterfaceC4363c interfaceC4363c) {
            super(2);
            this.f109326g = z;
            this.f109327h = pd3;
            this.f109328i = z2;
            this.f109329j = c32209Co2;
            this.f109330k = interfaceC47085po2;
            this.f109331l = interfaceC25789l;
            this.f109332m = interfaceC25781d;
            this.f109333n = c45899no2;
            this.f109334o = c42341ho2;
            this.f109335p = i;
            this.f109336q = interfaceC4362b;
            this.f109337r = interfaceC4363c;
        }

        /* renamed from: a */
        public final C50641vo2 m13627a(InterfaceC36646Vn2 interfaceC36646Vn2, long j) {
            EnumC32768Ey3 enumC32768Ey3;
            int mo3416F0;
            int mo3416F02;
            int i;
            int i2;
            float mo26793a;
            int m28063n;
            long m114704a;
            Intrinsics.checkNotNullParameter(interfaceC36646Vn2, "$this$null");
            if (this.f109326g) {
                enumC32768Ey3 = EnumC32768Ey3.Vertical;
            } else {
                enumC32768Ey3 = EnumC32768Ey3.Horizontal;
            }
            C46430oi0.m20590a(j, enumC32768Ey3);
            if (this.f109326g) {
                mo3416F0 = interfaceC36646Vn2.mo3416F0(this.f109327h.mo88734b(interfaceC36646Vn2.getLayoutDirection()));
            } else {
                mo3416F0 = interfaceC36646Vn2.mo3416F0(ND3.m94186g(this.f109327h, interfaceC36646Vn2.getLayoutDirection()));
            }
            if (this.f109326g) {
                mo3416F02 = interfaceC36646Vn2.mo3416F0(this.f109327h.mo88733c(interfaceC36646Vn2.getLayoutDirection()));
            } else {
                mo3416F02 = interfaceC36646Vn2.mo3416F0(ND3.m94187f(this.f109327h, interfaceC36646Vn2.getLayoutDirection()));
            }
            int mo3416F03 = interfaceC36646Vn2.mo3416F0(this.f109327h.mo88732d());
            int mo3416F04 = interfaceC36646Vn2.mo3416F0(this.f109327h.mo88735a());
            int i3 = mo3416F03 + mo3416F04;
            int i4 = mo3416F0 + mo3416F02;
            boolean z = this.f109326g;
            if (z) {
                i = i3;
            } else {
                i = i4;
            }
            if (z && !this.f109328i) {
                i2 = mo3416F03;
            } else if (z && this.f109328i) {
                i2 = mo3416F04;
            } else if (!z && !this.f109328i) {
                i2 = mo3416F0;
            } else {
                i2 = mo3416F02;
            }
            int i5 = i - i2;
            long m22036h = C46007nz0.m22036h(j, -i4, -i3);
            this.f109329j.m111547K(this.f109330k);
            this.f109329j.m111552F(interfaceC36646Vn2);
            this.f109330k.mo15368e().m94840a(C44228kz0.m28063n(m22036h), C44228kz0.m28064m(m22036h));
            if (this.f109326g) {
                C25777lo.InterfaceC25789l interfaceC25789l = this.f109331l;
                if (interfaceC25789l != null) {
                    mo26793a = interfaceC25789l.mo26793a();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                C25777lo.InterfaceC25781d interfaceC25781d = this.f109332m;
                if (interfaceC25781d != null) {
                    mo26793a = interfaceC25781d.mo26793a();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            int mo3416F05 = interfaceC36646Vn2.mo3416F0(mo26793a);
            int itemCount = this.f109330k.getItemCount();
            if (this.f109326g) {
                m28063n = C44228kz0.m28064m(j) - i3;
            } else {
                m28063n = C44228kz0.m28063n(j) - i4;
            }
            int i6 = m28063n;
            if (this.f109328i && i6 <= 0) {
                boolean z2 = this.f109326g;
                if (!z2) {
                    mo3416F0 += i6;
                }
                if (z2) {
                    mo3416F03 += i6;
                }
                m114704a = B52.m114704a(mo3416F0, mo3416F03);
            } else {
                m114704a = B52.m114704a(mo3416F0, mo3416F03);
            }
            boolean z3 = this.f109326g;
            int i7 = i2;
            C33145Go2 c33145Go2 = new C33145Go2(m22036h, z3, this.f109330k, interfaceC36646Vn2, new C28408b(itemCount, mo3416F05, interfaceC36646Vn2, z3, this.f109336q, this.f109337r, this.f109328i, i7, i5, this.f109333n, m114704a), null);
            this.f109329j.m111550H(c33145Go2.m104710b());
            AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
            C32209Co2 c32209Co2 = this.f109329j;
            AbstractC48600sM5 m14281a = c28290a.m14281a();
            try {
                AbstractC48600sM5 m14295k = m14281a.m14295k();
                int m98880b = KS0.m98880b(c32209Co2.m111538o());
                int m111537p = c32209Co2.m111537p();
                Unit unit = Unit.INSTANCE;
                m14281a.m14288r(m14295k);
                m14281a.mo1848d();
                C50641vo2 m9720i = C50049uo2.m9720i(itemCount, this.f109330k, c33145Go2, i6, i2, i5, mo3416F05, m98880b, m111537p, this.f109329j.m111528y(), m22036h, this.f109326g, this.f109330k.mo15366h(), this.f109331l, this.f109332m, this.f109328i, interfaceC36646Vn2, this.f109333n, this.f109334o, this.f109335p, this.f109329j.m111534s(), new C28407a(interfaceC36646Vn2, j, i4, i3));
                this.f109329j.m111542k(m9720i);
                return m9720i;
            } catch (Throwable th) {
                m14281a.mo1848d();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C50641vo2 invoke(InterfaceC36646Vn2 interfaceC36646Vn2, C44228kz0 c44228kz0) {
            return m13627a(interfaceC36646Vn2, c44228kz0.m28058s());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13631a(InterfaceC41563gV2 modifier, C32209Co2 state, PD3 contentPadding, boolean z, boolean z2, InterfaceC39436cu1 flingBehavior, boolean z3, int i, InterfaceC4360K9.InterfaceC4362b interfaceC4362b, C25777lo.InterfaceC25789l interfaceC25789l, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, C25777lo.InterfaceC25781d interfaceC25781d, Function1<? super InterfaceC52420yo2, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        InterfaceC4360K9.InterfaceC4363c interfaceC4363c2;
        C25777lo.InterfaceC25781d interfaceC25781d2;
        Object mo89635G;
        InterfaceC32720Et0.C2012a c2012a;
        Object mo89635G2;
        boolean mo89539n;
        Object mo89635G3;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i14;
        InterfaceC4360K9.InterfaceC4362b interfaceC4362b2;
        C25777lo.InterfaceC25789l interfaceC25789l2;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(620764179);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (mo89518u.mo89539n(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= mo89518u.mo89539n(state) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= mo89518u.mo89539n(contentPadding) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i5 |= mo89518u.mo89536o(z) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i5 |= mo89518u.mo89536o(z2) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i6 = ImageMetadata.EDGE_MODE;
        } else {
            if ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 0) {
                i6 = mo89518u.mo89539n(flingBehavior) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
            }
            if ((i4 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                i5 |= mo89518u.mo89536o(z3) ? 1048576 : 524288;
                i7 = i4 & 128;
                if (i7 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= mo89518u.mo89527r(i) ? 8388608 : 4194304;
                }
                i8 = i4 & 256;
                if (i8 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= mo89518u.mo89539n(interfaceC4362b) ? 67108864 : 33554432;
                }
                i9 = i4 & 512;
                if (i9 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= mo89518u.mo89539n(interfaceC25789l) ? 536870912 : 268435456;
                }
                i10 = i4 & 1024;
                if (i10 != 0) {
                    i11 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i11 = i3 | (mo89518u.mo89539n(interfaceC4363c) ? 4 : 2);
                } else {
                    i11 = i3;
                }
                i12 = i4 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i3 & 112) == 0) {
                    i11 |= mo89518u.mo89539n(interfaceC25781d) ? 32 : 16;
                }
                i13 = i11;
                if ((i4 & 4096) != 0) {
                    i13 |= 384;
                } else if ((i3 & 896) == 0) {
                    i13 |= mo89518u.mo89629I(content) ? 256 : 128;
                }
                if ((1533916891 & i5) != 306783378 && (i13 & 731) == 146 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    i14 = i;
                    interfaceC4362b2 = interfaceC4362b;
                    interfaceC25789l2 = interfaceC25789l;
                    interfaceC4363c2 = interfaceC4363c;
                    interfaceC25781d2 = interfaceC25781d;
                    interfaceC32720Et02 = mo89518u;
                } else {
                    int i15 = i7 != 0 ? 0 : i;
                    InterfaceC4360K9.InterfaceC4362b interfaceC4362b3 = i8 != 0 ? null : interfaceC4362b;
                    C25777lo.InterfaceC25789l interfaceC25789l3 = i9 != 0 ? null : interfaceC25789l;
                    interfaceC4363c2 = i10 != 0 ? null : interfaceC4363c;
                    interfaceC25781d2 = i12 != 0 ? null : interfaceC25781d;
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(620764179, i5, i13, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:49)");
                    }
                    C37369Yp5 c37369Yp5 = C37369Yp5.f47422a;
                    DA3 m74176b = c37369Yp5.m74176b(mo89518u, 6);
                    int i16 = i5 >> 3;
                    int i17 = i16 & 14;
                    InterfaceC47085po2 m15372a = C48271ro2.m15372a(state, content, mo89518u, ((i13 >> 3) & 112) | i17);
                    InterfaceC39969do2 m113472a = C31975Bo2.m113472a(state, z2, mo89518u, i17 | ((i5 >> 9) & 112));
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    c2012a = InterfaceC32720Et0.f8257a;
                    if (mo89635G == c2012a.m108267a()) {
                        mo89635G = new C42341ho2();
                        mo89518u.mo89503z(mo89635G);
                    }
                    mo89518u.mo89605Q();
                    C42341ho2 c42341ho2 = (C42341ho2) mo89635G;
                    mo89518u.mo89638F(773894976);
                    mo89518u.mo89638F(-492369756);
                    mo89635G2 = mo89518u.mo89635G();
                    if (mo89635G2 == c2012a.m108267a()) {
                        C42992iu0 c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, mo89518u));
                        mo89518u.mo89503z(c42992iu0);
                        mo89635G2 = c42992iu0;
                    }
                    mo89518u.mo89605Q();
                    ZC0 m31665a = ((C42992iu0) mo89635G2).m31665a();
                    mo89518u.mo89605Q();
                    Boolean valueOf = Boolean.valueOf(z2);
                    mo89518u.mo89638F(511388516);
                    mo89539n = mo89518u.mo89539n(state) | mo89518u.mo89539n(valueOf);
                    mo89635G3 = mo89518u.mo89635G();
                    if (!mo89539n || mo89635G3 == c2012a.m108267a()) {
                        mo89635G3 = new C45899no2(m31665a, z2);
                        mo89518u.mo89503z(mo89635G3);
                    }
                    mo89518u.mo89605Q();
                    C45899no2 c45899no2 = (C45899no2) mo89635G3;
                    state.m111551G(c45899no2);
                    int i18 = i5 & 112;
                    int i19 = LX2.f21631e;
                    int i20 = i5 << 3;
                    int i21 = i13 << 24;
                    int i22 = i5;
                    Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m13628d = m13628d(m15372a, state, c42341ho2, contentPadding, z, z2, i15, interfaceC4362b3, interfaceC4363c2, interfaceC25781d2, interfaceC25789l3, c45899no2, mo89518u, (i16 & 29360128) | (i19 << 6) | i18 | (i20 & 7168) | (i20 & 57344) | (i20 & ImageMetadata.JPEG_GPS_COORDINATES) | (i16 & 3670016) | (234881024 & i21) | (i21 & 1879048192), ((i5 >> 27) & 14) | 64, 0);
                    interfaceC32720Et02 = mo89518u;
                    m13630b(m15372a, state, interfaceC32720Et02, i18);
                    EnumC32768Ey3 enumC32768Ey3 = z2 ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal;
                    C36412Un2.m80871a(m15372a, C37603Zp5.m72420j(EA3.m109331a(C42934io2.m31854a(C35915Sk0.m84932a(C41155fo2.m40806a(modifier.mo39266t0(state.m111529x()).mo39266t0(state.m111540m()), m15372a, m113472a, enumC32768Ey3, z3, z, interfaceC32720Et02, ((i22 >> 6) & 57344) | ((i22 << 6) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey3), state, c42341ho2, z, enumC32768Ey3, interfaceC32720Et02, (i19 << 6) | i18 | (i22 & 7168)), m74176b), state, enumC32768Ey3, m74176b, z3, c37369Yp5.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey3, z), flingBehavior, state.m111536q()), state.m111532u(), m13628d, interfaceC32720Et02, 0, 0);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    i14 = i15;
                    interfaceC4362b2 = interfaceC4362b3;
                    interfaceC25789l2 = interfaceC25789l3;
                }
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w == null) {
                    return;
                }
                mo89512w.mo20405a(new C28404a(modifier, state, contentPadding, z, z2, flingBehavior, z3, i14, interfaceC4362b2, interfaceC25789l2, interfaceC4363c2, interfaceC25781d2, content, i2, i3, i4));
                return;
            }
            i7 = i4 & 128;
            if (i7 != 0) {
            }
            i8 = i4 & 256;
            if (i8 != 0) {
            }
            i9 = i4 & 512;
            if (i9 != 0) {
            }
            i10 = i4 & 1024;
            if (i10 != 0) {
            }
            i12 = i4 & 2048;
            if (i12 != 0) {
            }
            i13 = i11;
            if ((i4 & 4096) != 0) {
            }
            if ((1533916891 & i5) != 306783378) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            C37369Yp5 c37369Yp52 = C37369Yp5.f47422a;
            DA3 m74176b2 = c37369Yp52.m74176b(mo89518u, 6);
            int i162 = i5 >> 3;
            int i172 = i162 & 14;
            InterfaceC47085po2 m15372a2 = C48271ro2.m15372a(state, content, mo89518u, ((i13 >> 3) & 112) | i172);
            InterfaceC39969do2 m113472a2 = C31975Bo2.m113472a(state, z2, mo89518u, i172 | ((i5 >> 9) & 112));
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            C42341ho2 c42341ho22 = (C42341ho2) mo89635G;
            mo89518u.mo89638F(773894976);
            mo89518u.mo89638F(-492369756);
            mo89635G2 = mo89518u.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
            }
            mo89518u.mo89605Q();
            ZC0 m31665a2 = ((C42992iu0) mo89635G2).m31665a();
            mo89518u.mo89605Q();
            Boolean valueOf2 = Boolean.valueOf(z2);
            mo89518u.mo89638F(511388516);
            mo89539n = mo89518u.mo89539n(state) | mo89518u.mo89539n(valueOf2);
            mo89635G3 = mo89518u.mo89635G();
            if (!mo89539n) {
            }
            mo89635G3 = new C45899no2(m31665a2, z2);
            mo89518u.mo89503z(mo89635G3);
            mo89518u.mo89605Q();
            C45899no2 c45899no22 = (C45899no2) mo89635G3;
            state.m111551G(c45899no22);
            int i182 = i5 & 112;
            int i192 = LX2.f21631e;
            int i202 = i5 << 3;
            int i212 = i13 << 24;
            int i222 = i5;
            Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m13628d2 = m13628d(m15372a2, state, c42341ho22, contentPadding, z, z2, i15, interfaceC4362b3, interfaceC4363c2, interfaceC25781d2, interfaceC25789l3, c45899no22, mo89518u, (i162 & 29360128) | (i192 << 6) | i182 | (i202 & 7168) | (i202 & 57344) | (i202 & ImageMetadata.JPEG_GPS_COORDINATES) | (i162 & 3670016) | (234881024 & i212) | (i212 & 1879048192), ((i5 >> 27) & 14) | 64, 0);
            interfaceC32720Et02 = mo89518u;
            m13630b(m15372a2, state, interfaceC32720Et02, i182);
            EnumC32768Ey3 enumC32768Ey32 = z2 ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal;
            C36412Un2.m80871a(m15372a2, C37603Zp5.m72420j(EA3.m109331a(C42934io2.m31854a(C35915Sk0.m84932a(C41155fo2.m40806a(modifier.mo39266t0(state.m111529x()).mo39266t0(state.m111540m()), m15372a2, m113472a2, enumC32768Ey32, z3, z, interfaceC32720Et02, ((i222 >> 6) & 57344) | ((i222 << 6) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey32), state, c42341ho22, z, enumC32768Ey32, interfaceC32720Et02, (i192 << 6) | i182 | (i222 & 7168)), m74176b2), state, enumC32768Ey32, m74176b2, z3, c37369Yp52.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey32, z), flingBehavior, state.m111536q()), state.m111532u(), m13628d2, interfaceC32720Et02, 0, 0);
            if (C35528Qt0.m87827O()) {
            }
            i14 = i15;
            interfaceC4362b2 = interfaceC4362b3;
            interfaceC25789l2 = interfaceC25789l3;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
            }
        }
        i5 |= i6;
        if ((i4 & 64) == 0) {
        }
        i7 = i4 & 128;
        if (i7 != 0) {
        }
        i8 = i4 & 256;
        if (i8 != 0) {
        }
        i9 = i4 & 512;
        if (i9 != 0) {
        }
        i10 = i4 & 1024;
        if (i10 != 0) {
        }
        i12 = i4 & 2048;
        if (i12 != 0) {
        }
        i13 = i11;
        if ((i4 & 4096) != 0) {
        }
        if ((1533916891 & i5) != 306783378) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        C37369Yp5 c37369Yp522 = C37369Yp5.f47422a;
        DA3 m74176b22 = c37369Yp522.m74176b(mo89518u, 6);
        int i1622 = i5 >> 3;
        int i1722 = i1622 & 14;
        InterfaceC47085po2 m15372a22 = C48271ro2.m15372a(state, content, mo89518u, ((i13 >> 3) & 112) | i1722);
        InterfaceC39969do2 m113472a22 = C31975Bo2.m113472a(state, z2, mo89518u, i1722 | ((i5 >> 9) & 112));
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        C42341ho2 c42341ho222 = (C42341ho2) mo89635G;
        mo89518u.mo89638F(773894976);
        mo89518u.mo89638F(-492369756);
        mo89635G2 = mo89518u.mo89635G();
        if (mo89635G2 == c2012a.m108267a()) {
        }
        mo89518u.mo89605Q();
        ZC0 m31665a22 = ((C42992iu0) mo89635G2).m31665a();
        mo89518u.mo89605Q();
        Boolean valueOf22 = Boolean.valueOf(z2);
        mo89518u.mo89638F(511388516);
        mo89539n = mo89518u.mo89539n(state) | mo89518u.mo89539n(valueOf22);
        mo89635G3 = mo89518u.mo89635G();
        if (!mo89539n) {
        }
        mo89635G3 = new C45899no2(m31665a22, z2);
        mo89518u.mo89503z(mo89635G3);
        mo89518u.mo89605Q();
        C45899no2 c45899no222 = (C45899no2) mo89635G3;
        state.m111551G(c45899no222);
        int i1822 = i5 & 112;
        int i1922 = LX2.f21631e;
        int i2022 = i5 << 3;
        int i2122 = i13 << 24;
        int i2222 = i5;
        Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m13628d22 = m13628d(m15372a22, state, c42341ho222, contentPadding, z, z2, i15, interfaceC4362b3, interfaceC4363c2, interfaceC25781d2, interfaceC25789l3, c45899no222, mo89518u, (i1622 & 29360128) | (i1922 << 6) | i1822 | (i2022 & 7168) | (i2022 & 57344) | (i2022 & ImageMetadata.JPEG_GPS_COORDINATES) | (i1622 & 3670016) | (234881024 & i2122) | (i2122 & 1879048192), ((i5 >> 27) & 14) | 64, 0);
        interfaceC32720Et02 = mo89518u;
        m13630b(m15372a22, state, interfaceC32720Et02, i1822);
        EnumC32768Ey3 enumC32768Ey322 = z2 ? EnumC32768Ey3.Vertical : EnumC32768Ey3.Horizontal;
        C36412Un2.m80871a(m15372a22, C37603Zp5.m72420j(EA3.m109331a(C42934io2.m31854a(C35915Sk0.m84932a(C41155fo2.m40806a(modifier.mo39266t0(state.m111529x()).mo39266t0(state.m111540m()), m15372a22, m113472a22, enumC32768Ey322, z3, z, interfaceC32720Et02, ((i2222 >> 6) & 57344) | ((i2222 << 6) & ImageMetadata.JPEG_GPS_COORDINATES)), enumC32768Ey322), state, c42341ho222, z, enumC32768Ey322, interfaceC32720Et02, (i1922 << 6) | i1822 | (i2222 & 7168)), m74176b22), state, enumC32768Ey322, m74176b22, z3, c37369Yp522.m74175c((EnumC47065pm2) interfaceC32720Et02.mo89572c(C42399hu0.m35607l()), enumC32768Ey322, z), flingBehavior, state.m111536q()), state.m111532u(), m13628d22, interfaceC32720Et02, 0, 0);
        if (C35528Qt0.m87827O()) {
        }
        i14 = i15;
        interfaceC4362b2 = interfaceC4362b3;
        interfaceC25789l2 = interfaceC25789l3;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }

    /* renamed from: b */
    public static final void m13630b(InterfaceC47085po2 interfaceC47085po2, C32209Co2 c32209Co2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(3173830);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC47085po2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(c32209Co2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(3173830, i, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:141)");
            }
            if (interfaceC47085po2.getItemCount() > 0) {
                c32209Co2.m111547K(interfaceC47085po2);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C28405b(interfaceC47085po2, c32209Co2, i));
        }
    }

    /* renamed from: d */
    public static final Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> m13628d(InterfaceC47085po2 interfaceC47085po2, C32209Co2 c32209Co2, C42341ho2 c42341ho2, PD3 pd3, boolean z, boolean z2, int i, InterfaceC4360K9.InterfaceC4362b interfaceC4362b, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, C25777lo.InterfaceC25781d interfaceC25781d, C25777lo.InterfaceC25789l interfaceC25789l, C45899no2 c45899no2, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3, int i4) {
        interfaceC32720Et0.mo89638F(-966179815);
        InterfaceC4360K9.InterfaceC4362b interfaceC4362b2 = (i4 & 128) != 0 ? null : interfaceC4362b;
        InterfaceC4360K9.InterfaceC4363c interfaceC4363c2 = (i4 & 256) != 0 ? null : interfaceC4363c;
        C25777lo.InterfaceC25781d interfaceC25781d2 = (i4 & 512) != 0 ? null : interfaceC25781d;
        C25777lo.InterfaceC25789l interfaceC25789l2 = (i4 & 1024) != 0 ? null : interfaceC25789l;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-966179815, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {c32209Co2, c42341ho2, pd3, Boolean.valueOf(z), Boolean.valueOf(z2), interfaceC4362b2, interfaceC4363c2, interfaceC25781d2, interfaceC25789l2, c45899no2};
        interfaceC32720Et0.mo89638F(-568225417);
        boolean z3 = false;
        for (int i5 = 0; i5 < 10; i5++) {
            z3 |= interfaceC32720Et0.mo89539n(objArr[i5]);
        }
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (z3 || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C28406c(z2, pd3, z, c32209Co2, interfaceC47085po2, interfaceC25789l2, interfaceC25781d2, c45899no2, c42341ho2, i, interfaceC4362b2, interfaceC4363c2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        Function2<InterfaceC36646Vn2, C44228kz0, InterfaceC52172yO2> function2 = (Function2) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return function2;
    }
}
