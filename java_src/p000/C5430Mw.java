package p000;

import androidx.compose.p003ui.layout.C11335a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001aK\u0010\b\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001d\u0010\u000e\u001a\u00020\n8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001d\u0010\u0011\u001a\u00020\n8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0017\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u0013\"\u001d\u0010\u0017\u001a\u00020\n8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u001d\u0010\u0019\u001a\u00020\n8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u001d\u0010\u001b\u001a\u00020\n8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"Lkotlin/Function1;", "Le10;", "", "Lkotlin/ExtensionFunctionType;", "badge", "LgV2;", "modifier", "content", C17296a.f69688o, "(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V", "Lk61;", "F", "c", "()F", "BadgeRadius", "b", "getBadgeWithContentRadius", "BadgeWithContentRadius", "LM26;", "J", "BadgeContentFontSize", DateTokenConverter.CONVERTER_KEY, "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalPadding", "e", "BadgeWithContentHorizontalOffset", "f", "BadgeHorizontalOffset", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,187:1\n74#2:188\n75#2,11:190\n75#2:217\n76#2,11:219\n89#2:247\n75#2:255\n76#2,11:257\n89#2:285\n88#2:290\n75#2:294\n76#2,11:296\n89#2:324\n76#3:189\n76#3:218\n76#3:256\n76#3:295\n456#4,11:201\n460#4,13:230\n473#4,3:244\n460#4,13:268\n473#4,3:282\n467#4,3:287\n460#4,13:307\n473#4,3:321\n68#5,5:212\n73#5:243\n77#5:248\n67#5,6:249\n73#5:281\n77#5:286\n92#6:291\n64#6:330\n64#6:332\n79#7,2:292\n81#7:320\n85#7:325\n154#8:326\n154#8:327\n154#8:328\n154#8:329\n154#8:331\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n*L\n64#1:188\n64#1:190,11\n66#1:217\n66#1:219,11\n66#1:247\n71#1:255\n71#1:257,11\n71#1:285\n64#1:290\n140#1:294\n140#1:296,11\n140#1:324\n64#1:189\n66#1:218\n71#1:256\n140#1:295\n64#1:201,11\n66#1:230,13\n66#1:244,3\n71#1:268,13\n71#1:282,3\n64#1:287,3\n140#1:307,13\n140#1:321,3\n66#1:212,5\n66#1:243\n66#1:248\n71#1:249,6\n71#1:281\n71#1:286\n142#1:291\n182#1:330\n186#1:332\n140#1:292,2\n140#1:320\n140#1:325\n169#1:326\n172#1:327\n178#1:328\n182#1:329\n186#1:331\n*E\n"})
/* renamed from: Mw */
/* loaded from: classes.dex */
public final class C5430Mw {

    /* renamed from: a */
    public static final float f23830a;

    /* renamed from: d */
    public static final float f23833d;

    /* renamed from: f */
    public static final float f23835f;

    /* renamed from: b */
    public static final float f23831b = C43705k61.m29303g(8);

    /* renamed from: c */
    public static final long f23832c = N26.m94414f(10);

    /* renamed from: e */
    public static final float f23834e = C43705k61.m29303g(-C43705k61.m29303g(6));

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n223#2,2:188\n223#2,2:190\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt$BadgedBox$2\n*L\n79#1:188,2\n85#1:190,2\n*E\n"})
    /* renamed from: Mw$a */
    /* loaded from: classes.dex */
    public static final class C5431a implements InterfaceC51579xO2 {

        /* renamed from: a */
        public static final C5431a f23836a = new C5431a();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Mw$a$a */
        /* loaded from: classes.dex */
        public static final class C5432a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ OU3 f23837g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC52765zO2 f23838h;

            /* renamed from: i */
            public final /* synthetic */ OU3 f23839i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5432a(OU3 ou3, InterfaceC52765zO2 interfaceC52765zO2, OU3 ou32) {
                super(1);
                this.f23837g = ou3;
                this.f23838h = interfaceC52765zO2;
                this.f23839i = ou32;
            }

            /* renamed from: a */
            public final void m94554a(OU3.AbstractC6015a layout) {
                boolean z;
                float m94557b;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                if (this.f23837g.m92226i1() > this.f23838h.mo3416F0(C5430Mw.m94556c()) * 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m94557b = C5430Mw.m94555d();
                } else {
                    m94557b = C5430Mw.m94557b();
                }
                OU3.AbstractC6015a.m92205r(layout, this.f23839i, 0, 0, 0.0f, 4, null);
                OU3.AbstractC6015a.m92205r(layout, this.f23837g, this.f23839i.m92226i1() + this.f23838h.mo3416F0(m94557b), (-this.f23837g.m92229d1()) / 2, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m94554a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> measurables, long j) {
            Map<AbstractC4750L9, Integer> mapOf;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            List<? extends InterfaceC50393vO2> list = measurables;
            for (InterfaceC50393vO2 interfaceC50393vO2 : list) {
                if (Intrinsics.areEqual(C11335a.m68615a(interfaceC50393vO2), "badge")) {
                    OU3 mo8763P0 = interfaceC50393vO2.mo8763P0(C44228kz0.m28072e(j, 0, 0, 0, 0, 11, null));
                    for (InterfaceC50393vO2 interfaceC50393vO22 : list) {
                        if (Intrinsics.areEqual(C11335a.m68615a(interfaceC50393vO22), "anchor")) {
                            OU3 mo8763P02 = interfaceC50393vO22.mo8763P0(j);
                            int mo35854v = mo8763P02.mo35854v(C5482N9.m94314a());
                            int mo35854v2 = mo8763P02.mo35854v(C5482N9.m94313b());
                            int m92226i1 = mo8763P02.m92226i1();
                            int m92229d1 = mo8763P02.m92229d1();
                            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(C5482N9.m94314a(), Integer.valueOf(mo35854v)), TuplesKt.m28425to(C5482N9.m94313b(), Integer.valueOf(mo35854v2)));
                            return Layout.mo1431O0(m92226i1, m92229d1, mapOf, new C5432a(mo8763P0, Layout, mo8763P02));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mw$b */
    /* loaded from: classes.dex */
    public static final class C5433b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<InterfaceC40096e10, InterfaceC32720Et0, Integer, Unit> f23840g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f23841h;

        /* renamed from: i */
        public final /* synthetic */ Function3<InterfaceC40096e10, InterfaceC32720Et0, Integer, Unit> f23842i;

        /* renamed from: j */
        public final /* synthetic */ int f23843j;

        /* renamed from: k */
        public final /* synthetic */ int f23844k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5433b(Function3<? super InterfaceC40096e10, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC40096e10, ? super InterfaceC32720Et0, ? super Integer, Unit> function32, int i, int i2) {
            super(2);
            this.f23840g = function3;
            this.f23841h = interfaceC41563gV2;
            this.f23842i = function32;
            this.f23843j = i;
            this.f23844k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C5430Mw.m94558a(this.f23840g, this.f23841h, this.f23842i, interfaceC32720Et0, C47127ps4.m18626a(this.f23843j | 1), this.f23844k);
        }
    }

    static {
        float f = 4;
        f23830a = C43705k61.m29303g(f);
        f23833d = C43705k61.m29303g(f);
        f23835f = C43705k61.m29303g(-C43705k61.m29303g(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m94558a(Function3<? super InterfaceC40096e10, ? super InterfaceC32720Et0, ? super Integer, Unit> badge, InterfaceC41563gV2 interfaceC41563gV2, Function3<? super InterfaceC40096e10, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        Object obj;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(859805272);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo89518u.mo89629I(badge) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            i3 |= mo89518u.mo89539n(obj) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= mo89518u.mo89629I(content) ? 256 : 128;
            }
            if ((i3 & 731) != 146 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC41563gV22 = obj;
            } else {
                InterfaceC41563gV2 interfaceC41563gV23 = i4 == 0 ? InterfaceC41563gV2.f82354b0 : obj;
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(859805272, i3, -1, "androidx.compose.material.BadgedBox (Badge.kt:58)");
                }
                C5431a c5431a = C5431a.f23836a;
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(interfaceC41563gV23);
                int i5 = (((i3 & 112) << 9) & 7168) | 6;
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a);
                } else {
                    mo89518u.mo89566e();
                }
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a, c5431a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i5 >> 3) & 112));
                mo89518u.mo89638F(2058660585);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC41563gV2 m68614b = C11335a.m68614b(c20912a, "anchor");
                InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
                InterfaceC4360K9 m99141e = c4361a.m99141e();
                int i6 = ((i3 << 3) & 7168) | 54;
                mo89518u.mo89638F(733328855);
                int i7 = i6 >> 3;
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, (i7 & 14) | (i7 & 112));
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                interfaceC41563gV22 = interfaceC41563gV23;
                Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m68614b);
                int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a2);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a2, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
                C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
                C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i8 >> 3) & 112));
                mo89518u.mo89638F(2058660585);
                C40689f10 c40689f10 = C40689f10.f79291a;
                content.invoke(c40689f10, mo89518u, Integer.valueOf(((i6 >> 6) & 112) | 6));
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                InterfaceC41563gV2 m68614b2 = C11335a.m68614b(c20912a, "badge");
                int i9 = ((i3 << 9) & 7168) | 6;
                mo89518u.mo89638F(733328855);
                int i10 = i9 >> 3;
                InterfaceC51579xO2 m44729h2 = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, (i10 & 112) | (i10 & 14));
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m68614b2);
                int i11 = ((((i9 << 3) & 112) << 9) & 7168) | 6;
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a3);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a3, m44729h2, c0757a.m113412d());
                C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
                C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
                C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i11 >> 3) & 112));
                mo89518u.mo89638F(2058660585);
                badge.invoke(c40689f10, mo89518u, Integer.valueOf(((i9 >> 6) & 112) | 6));
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                return;
            }
            mo89512w.mo20405a(new C5433b(badge, interfaceC41563gV22, content, i, i2));
            return;
        }
        obj = interfaceC41563gV2;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) != 146) {
        }
        if (i4 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        C5431a c5431a2 = C5431a.f23836a;
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g014 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq64 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a4 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a4 = C31723Am2.m115273a(interfaceC41563gV23);
        int i52 = (((i3 & 112) << 9) & 7168) | 6;
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        InterfaceC32720Et0 m64192a4 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a4, c5431a2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a4, interfaceC41273g014, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a4, enumC47065pm24, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a4, interfaceC33869Jq64, c0757a2.m113410f());
        m115273a4.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i52 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m68614b3 = C11335a.m68614b(c20912a2, "anchor");
        InterfaceC4360K9.C4361a c4361a2 = InterfaceC4360K9.f19170a;
        InterfaceC4360K9 m99141e2 = c4361a2.m99141e();
        int i62 = ((i3 << 3) & 7168) | 54;
        mo89518u.mo89638F(733328855);
        int i72 = i62 >> 3;
        InterfaceC51579xO2 m44729h3 = C39504d10.m44729h(m99141e2, false, mo89518u, (i72 & 14) | (i72 & 112));
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        interfaceC41563gV22 = interfaceC41563gV23;
        Function0<InterfaceC32018Bt0> m113415a22 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(m68614b3);
        int i82 = ((((i62 << 3) & 112) << 9) & 7168) | 6;
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22, m44729h3, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i82 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        C40689f10 c40689f102 = C40689f10.f79291a;
        content.invoke(c40689f102, mo89518u, Integer.valueOf(((i62 >> 6) & 112) | 6));
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        InterfaceC41563gV2 m68614b22 = C11335a.m68614b(c20912a2, "badge");
        int i92 = ((i3 << 9) & 7168) | 6;
        mo89518u.mo89638F(733328855);
        int i102 = i92 >> 3;
        InterfaceC51579xO2 m44729h22 = C39504d10.m44729h(c4361a2.m99132n(), false, mo89518u, (i102 & 112) | (i102 & 14));
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0132 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm232 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq632 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a32 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a32 = C31723Am2.m115273a(m68614b22);
        int i112 = ((((i92 << 3) & 112) << 9) & 7168) | 6;
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a32 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a32, m44729h22, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a32, interfaceC41273g0132, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a32, enumC47065pm232, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a32, interfaceC33869Jq632, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a32.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i112 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        badge.invoke(c40689f102, mo89518u, Integer.valueOf(((i92 >> 6) & 112) | 6));
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* renamed from: b */
    public static final float m94557b() {
        return f23835f;
    }

    /* renamed from: c */
    public static final float m94556c() {
        return f23830a;
    }

    /* renamed from: d */
    public static final float m94555d() {
        return f23834e;
    }
}
