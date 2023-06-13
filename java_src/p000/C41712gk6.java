package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.AbstractC42898ik6;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000f\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000f\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00100\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Lk61;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Lpm0;", "tintColor", "LLW;", "tintBlendMode", "", "autoMirror", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "content", "Lfk6;", "c", "(FFFFLjava/lang/String;JIZLkotlin/jvm/functions/Function4;LEt0;II)Lfk6;", "LtY1;", Entry.TYPE_IMAGE, "b", "(LtY1;LEt0;I)Lfk6;", "Lbk6;", "group", "", "LWj6;", "configs", C17296a.f69688o, "(Lbk6;Ljava/util/Map;LEt0;II)V", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n1#3:422\n50#4:423\n49#4:424\n25#4:431\n1114#5,6:425\n1114#5,6:432\n173#6,6:438\n261#6,11:444\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n127#1:421\n134#1:423\n134#1:424\n142#1:431\n134#1:425,6\n142#1:432,6\n281#1:438,6\n281#1:444,11\n*E\n"})
/* renamed from: gk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41712gk6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gk6$a */
    /* loaded from: classes.dex */
    public static final class C22449a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC40526ek6 f84168g;

        /* renamed from: h */
        public final /* synthetic */ Map<String, InterfaceC36848Wj6> f84169h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22449a(AbstractC40526ek6 abstractC40526ek6, Map<String, ? extends InterfaceC36848Wj6> map) {
            super(2);
            this.f84168g = abstractC40526ek6;
            this.f84169h = map;
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
                C35528Qt0.m87816Z(1450046638, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
            }
            C41712gk6.m37759a((C38730bk6) this.f84168g, this.f84169h, interfaceC32720Et0, 64, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gk6$b */
    /* loaded from: classes.dex */
    public static final class C22450b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C38730bk6 f84170g;

        /* renamed from: h */
        public final /* synthetic */ Map<String, InterfaceC36848Wj6> f84171h;

        /* renamed from: i */
        public final /* synthetic */ int f84172i;

        /* renamed from: j */
        public final /* synthetic */ int f84173j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22450b(C38730bk6 c38730bk6, Map<String, ? extends InterfaceC36848Wj6> map, int i, int i2) {
            super(2);
            this.f84170g = c38730bk6;
            this.f84171h = map;
            this.f84172i = i;
            this.f84173j = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C41712gk6.m37759a(this.f84170g, this.f84171h, interfaceC32720Et0, C47127ps4.m18626a(this.f84172i | 1), this.f84173j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gk6$c */
    /* loaded from: classes.dex */
    public static final class C22451c implements InterfaceC36848Wj6 {
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gk6$d */
    /* loaded from: classes.dex */
    public static final class C22452d implements InterfaceC36848Wj6 {
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gk6$e */
    /* loaded from: classes.dex */
    public static final class C22453e extends Lambda implements Function4<Float, Float, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C49297tY1 f84174g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22453e(C49297tY1 c49297tY1) {
            super(4);
            this.f84174g = c49297tY1;
        }

        /* renamed from: a */
        public final void m37756a(float f, float f2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1873274766, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
            }
            C41712gk6.m37759a(this.f84174g.m12089e(), null, interfaceC32720Et0, 0, 2);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            m37756a(f.floatValue(), f2.floatValue(), interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final void m37759a(C38730bk6 group, Map<String, ? extends InterfaceC36848Wj6> map, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Map<String, ? extends InterfaceC36848Wj6> map2;
        Map<String, ? extends InterfaceC36848Wj6> map3;
        InterfaceC32720Et0 interfaceC32720Et02;
        Map<String, ? extends InterfaceC36848Wj6> map4;
        Map<String, ? extends InterfaceC36848Wj6> emptyMap;
        Intrinsics.checkNotNullParameter(group, "group");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-446179233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(group)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 16;
        }
        if (i5 == 2 && (i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            map3 = map;
            interfaceC32720Et02 = mo89518u;
        } else {
            if (i5 != 0) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                map2 = emptyMap;
            } else {
                map2 = map;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-446179233, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<AbstractC40526ek6> it = group.iterator();
            while (it.hasNext()) {
                AbstractC40526ek6 next = it.next();
                if (next instanceof C42305hk6) {
                    mo89518u.mo89638F(-326285735);
                    C42305hk6 c42305hk6 = (C42305hk6) next;
                    InterfaceC36848Wj6 interfaceC36848Wj6 = map2.get(c42305hk6.m35914c());
                    if (interfaceC36848Wj6 == null) {
                        interfaceC36848Wj6 = new C22451c();
                    }
                    InterfaceC36848Wj6 interfaceC36848Wj62 = interfaceC36848Wj6;
                    InterfaceC32720Et0 interfaceC32720Et03 = mo89518u;
                    C36614Vj6.m79519b((List) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23335c.f87810a, c42305hk6.m35913e()), c42305hk6.m35912f(), c42305hk6.m35914c(), (AbstractC37727a30) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23333a.f87808a, c42305hk6.m35916a()), ((Number) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23334b.f87809a, Float.valueOf(c42305hk6.m35915b()))).floatValue(), (AbstractC37727a30) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23341i.f87816a, c42305hk6.m35911h()), ((Number) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23342j.f87817a, Float.valueOf(c42305hk6.m35910j()))).floatValue(), ((Number) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23343k.f87818a, Float.valueOf(c42305hk6.m35906v()))).floatValue(), c42305hk6.m35909o(), c42305hk6.m35908s(), c42305hk6.m35907u(), ((Number) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23348p.f87823a, Float.valueOf(c42305hk6.m35903y()))).floatValue(), ((Number) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23346n.f87821a, Float.valueOf(c42305hk6.m35905w()))).floatValue(), ((Number) interfaceC36848Wj62.m77903a(AbstractC42898ik6.C23347o.f87822a, Float.valueOf(c42305hk6.m35904x()))).floatValue(), interfaceC32720Et03, 8, 0, 0);
                    interfaceC32720Et03.mo89605Q();
                    it = it;
                    map2 = map2;
                    mo89518u = interfaceC32720Et03;
                } else {
                    Iterator<AbstractC40526ek6> it2 = it;
                    Map<String, ? extends InterfaceC36848Wj6> map5 = map2;
                    InterfaceC32720Et0 interfaceC32720Et04 = mo89518u;
                    if (next instanceof C38730bk6) {
                        interfaceC32720Et04.mo89638F(-326283877);
                        C38730bk6 c38730bk6 = (C38730bk6) next;
                        map4 = map5;
                        InterfaceC36848Wj6 interfaceC36848Wj63 = map4.get(c38730bk6.m64052c());
                        if (interfaceC36848Wj63 == null) {
                            interfaceC36848Wj63 = new C22452d();
                        }
                        C36614Vj6.m79520a(c38730bk6.m64052c(), ((Number) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23338f.f87813a, Float.valueOf(c38730bk6.m64049h()))).floatValue(), ((Number) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23336d.f87811a, Float.valueOf(c38730bk6.m64051e()))).floatValue(), ((Number) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23337e.f87812a, Float.valueOf(c38730bk6.m64050f()))).floatValue(), ((Number) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23339g.f87814a, Float.valueOf(c38730bk6.m64048j()))).floatValue(), ((Number) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23340h.f87815a, Float.valueOf(c38730bk6.m64047o()))).floatValue(), ((Number) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23344l.f87819a, Float.valueOf(c38730bk6.m64046s()))).floatValue(), ((Number) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23345m.f87820a, Float.valueOf(c38730bk6.m64045u()))).floatValue(), (List) interfaceC36848Wj63.m77903a(AbstractC42898ik6.C23335c.f87810a, c38730bk6.m64053b()), C43575jt0.m29791b(interfaceC32720Et04, 1450046638, true, new C22449a(next, map4)), interfaceC32720Et04, 939524096, 0);
                        interfaceC32720Et04.mo89605Q();
                    } else {
                        map4 = map5;
                        interfaceC32720Et04.mo89638F(-326282407);
                        interfaceC32720Et04.mo89605Q();
                    }
                    mo89518u = interfaceC32720Et04;
                    map2 = map4;
                    it = it2;
                }
            }
            map3 = map2;
            interfaceC32720Et02 = mo89518u;
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C22450b(group, map3, i, i2));
        }
    }

    /* renamed from: b */
    public static final C41119fk6 m37758b(C49297tY1 image, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        interfaceC32720Et0.mo89638F(1413834416);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        C41119fk6 m37757c = m37757c(image.m12091c(), image.m12092b(), image.m12085i(), image.m12086h(), image.m12090d(), image.m12087g(), image.m12088f(), image.m12093a(), C43575jt0.m29791b(interfaceC32720Et0, 1873274766, true, new C22453e(image)), interfaceC32720Et0, 100663296, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m37757c;
    }

    /* renamed from: c */
    public static final C41119fk6 m37757c(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, Function4<? super Float, ? super Float, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC32720Et0.mo89638F(1068590786);
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? "VectorRootGroup" : str;
        long m18726g = (i3 & 32) != 0 ? C47063pm0.f104050b.m18726g() : j;
        int m96721z = (i3 & 64) != 0 ? C5016LW.f21593b.m96721z() : i;
        boolean z2 = (i3 & 128) != 0 ? false : z;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1068590786, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        float mo3411T0 = interfaceC41273g01.mo3411T0(f);
        float mo3411T02 = interfaceC41273g01.mo3411T0(f2);
        if (Float.isNaN(f5)) {
            f5 = mo3411T0;
        }
        if (Float.isNaN(f6)) {
            f6 = mo3411T02;
        }
        C47063pm0 m18747i = C47063pm0.m18747i(m18726g);
        C5016LW m96782D = C5016LW.m96782D(m96721z);
        int i4 = i2 >> 15;
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(m18747i) | interfaceC32720Et0.mo89539n(m96782D);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = !C47063pm0.m18741o(m18726g, C47063pm0.f104050b.m18726g()) ? C48841sm0.f109227b.m13700a(m18726g, m96721z) : null;
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C48841sm0 c48841sm0 = (C48841sm0) mo89635G;
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C41119fk6();
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        C41119fk6 c41119fk6 = (C41119fk6) mo89635G2;
        c41119fk6.m40920k(CB5.m112663a(mo3411T0, mo3411T02));
        c41119fk6.m40923h(z2);
        c41119fk6.m40921j(c48841sm0);
        c41119fk6.m40930a(str2, f5, f6, content, interfaceC32720Et0, ((i2 >> 12) & 14) | DateUtils.FORMAT_ABBREV_WEEKDAY | (i4 & 7168));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c41119fk6;
    }
}
