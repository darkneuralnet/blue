package co.bird.android.feature.bottomsheets.map;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.feature.nestflightsheet.NestFlightSheetBottomSheetAdapter;
import co.bird.android.model.BottomSheetButton;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0011\b\u0016\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105B\u0019\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b4\u00108B!\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b4\u0010;J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\u0012\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001a\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013J\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R(\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010)\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006="}, m28432d2 = {"Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet;", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "LwZ;", "A", "", "D", "LRm;", RequestHeadersFactory.MODEL, "", "h0", "", "LH6;", "sections", "d0", "c0", "e0", "f0", "g0", "Lkotlin/Function1;", "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a0", "type", "b0", "", "n", "Ljava/util/Map;", "bottomSheets", "LPm;", "o", "LPm;", "areaConverter", "p", "Lkotlin/jvm/functions/Function1;", "typeListener", "<set-?>", "q", "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "Y", "()Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "bottomSheetType", "Lg46$b;", "w", "()Lg46$b;", "logger", "LYs1;", "Z", "()LYs1;", "flightSheetAdapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class OperatorMapBottomSheet extends BaseBottomSheet<BottomSheetButton> {

    /* renamed from: n */
    public final Map<EnumC14592a, AbstractC29912wZ<? extends BottomSheetButton>> f63393n;

    /* renamed from: o */
    public final C6487Pm f63394o;

    /* renamed from: p */
    public Function1<? super EnumC14592a, Unit> f63395p;

    /* renamed from: q */
    public EnumC14592a f63396q;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet$a */
    /* loaded from: classes3.dex */
    public enum EnumC14592a {
        AREA,
        BOUNTY_FLIGHT_SHEET,
        FLIGHT_SHEET,
        NEST_FLIGHT_SHEET,
        WAREHOUSE_FLIGHT_SHEET,
        ZONE_FLIGHT_SHEET
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "it", "", C17296a.f69688o, "(Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet$b */
    /* loaded from: classes3.dex */
    public static final class C14593b extends Lambda implements Function1<EnumC14592a, Unit> {

        /* renamed from: g */
        public static final C14593b f63404g = new C14593b();

        public C14593b() {
            super(1);
        }

        /* renamed from: a */
        public final void m58651a(EnumC14592a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC14592a enumC14592a) {
            m58651a(enumC14592a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorMapBottomSheet(Context context) {
        super(context);
        Map<EnumC14592a, AbstractC29912wZ<? extends BottomSheetButton>> mutableMapOf;
        Intrinsics.checkNotNullParameter(context, "context");
        EnumC14592a enumC14592a = EnumC14592a.AREA;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        EnumC14592a enumC14592a2 = EnumC14592a.BOUNTY_FLIGHT_SHEET;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        EnumC14592a enumC14592a3 = EnumC14592a.FLIGHT_SHEET;
        AbstractC29912wZ<? extends BottomSheetButton> m59056v = m59056v();
        Intrinsics.checkNotNull(m59056v, "null cannot be cast to non-null type co.bird.android.flightsheet.FlightSheetBottomSheetAdapter");
        EnumC14592a enumC14592a4 = EnumC14592a.NEST_FLIGHT_SHEET;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        EnumC14592a enumC14592a5 = EnumC14592a.WAREHOUSE_FLIGHT_SHEET;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        EnumC14592a enumC14592a6 = EnumC14592a.ZONE_FLIGHT_SHEET;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m28425to(enumC14592a, new C5357Mm(context2)), TuplesKt.m28425to(enumC14592a2, new F00(context3)), TuplesKt.m28425to(enumC14592a3, (C47717qs1) m59056v), TuplesKt.m28425to(enumC14592a4, new NestFlightSheetBottomSheetAdapter(context4)), TuplesKt.m28425to(enumC14592a5, new C33239Gy6(context5)), TuplesKt.m28425to(enumC14592a6, new II6(context6)));
        this.f63393n = mutableMapOf;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        this.f63394o = new C6487Pm(context7);
        this.f63395p = C14593b.f63404g;
        this.f63396q = enumC14592a3;
    }

    /* renamed from: w */
    private final C41318g46.AbstractC20723b m58653w() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("BottomSheet");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"BottomSheet\")");
        return m40153k;
    }

    @Override // co.bird.android.bottomsheet.BaseBottomSheet
    /* renamed from: A */
    public AbstractC29912wZ<? extends BottomSheetButton> mo56204A() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return new C47717qs1(context);
    }

    @Override // co.bird.android.bottomsheet.BaseBottomSheet
    /* renamed from: D */
    public boolean mo56569D() {
        return this.f63396q == EnumC14592a.AREA;
    }

    /* renamed from: Y */
    public final EnumC14592a m58663Y() {
        return this.f63396q;
    }

    /* renamed from: Z */
    public final C37392Ys1 m58662Z() {
        AbstractC29912wZ<? extends BottomSheetButton> abstractC29912wZ = this.f63393n.get(EnumC14592a.FLIGHT_SHEET);
        Intrinsics.checkNotNull(abstractC29912wZ);
        AbstractC52206yS0 adapter = abstractC29912wZ.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type co.bird.android.flightsheet.v2.adapters.FlightSheetV2Adapter");
        return (C37392Ys1) adapter;
    }

    /* renamed from: a0 */
    public final void m58661a0(Function1<? super EnumC14592a, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f63395p = listener;
    }

    /* renamed from: b0 */
    public final void m58660b0(EnumC14592a enumC14592a, List<C3023H6> list) {
        C41318g46.AbstractC20723b m58653w = m58653w();
        int size = list.size();
        m58653w.mo7228a("Populating Adapter for " + enumC14592a + " with " + size + " sections", new Object[0]);
        this.f63396q = enumC14592a;
        AbstractC29912wZ<? extends BottomSheetButton> abstractC29912wZ = this.f63393n.get(enumC14592a);
        if (abstractC29912wZ != null) {
            m58653w().mo7228a("Adapter found!", new Object[0]);
            if (!Intrinsics.areEqual(m59056v(), abstractC29912wZ)) {
                m58653w().mo7228a("Setting adapter to BottomSheet", new Object[0]);
                setBottomSheetAdapter(abstractC29912wZ);
                this.f63395p.invoke(enumC14592a);
            }
            abstractC29912wZ.m6670c(list);
            if (m59098C()) {
                m58653w().mo7228a("Sliding bottom sheet up to become visible", new Object[0]);
                m59079W();
            }
        }
    }

    /* renamed from: c0 */
    public final void m58659c0(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m58660b0(EnumC14592a.BOUNTY_FLIGHT_SHEET, sections);
    }

    /* renamed from: d0 */
    public final void m58658d0(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m58660b0(EnumC14592a.FLIGHT_SHEET, sections);
    }

    /* renamed from: e0 */
    public final void m58657e0(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m58660b0(EnumC14592a.NEST_FLIGHT_SHEET, sections);
    }

    /* renamed from: f0 */
    public final void m58656f0(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m58660b0(EnumC14592a.WAREHOUSE_FLIGHT_SHEET, sections);
    }

    /* renamed from: g0 */
    public final void m58655g0(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m58660b0(EnumC14592a.ZONE_FLIGHT_SHEET, sections);
    }

    /* renamed from: h0 */
    public final void m58654h0(InterfaceC7269Rm model) {
        List<C3023H6> emptyList;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof C22473go) {
            emptyList = this.f63394o.m89807r((C22473go) model);
        } else if (model instanceof C5374Mn) {
            emptyList = this.f63394o.m89804u((C5374Mn) model);
        } else if (model instanceof C40087e01) {
            emptyList = this.f63394o.m89806s((C40087e01) model);
        } else if (model instanceof C34976Oj6) {
            emptyList = this.f63394o.m89803v((C34976Oj6) model);
        } else if (model instanceof C40011ds4) {
            emptyList = this.f63394o.m89805t((C40011ds4) model);
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        m58660b0(EnumC14592a.AREA, emptyList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorMapBottomSheet(Context context, AttributeSet attrs) {
        super(context, attrs);
        Map<EnumC14592a, AbstractC29912wZ<? extends BottomSheetButton>> mutableMapOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        EnumC14592a enumC14592a = EnumC14592a.AREA;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        EnumC14592a enumC14592a2 = EnumC14592a.BOUNTY_FLIGHT_SHEET;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        EnumC14592a enumC14592a3 = EnumC14592a.FLIGHT_SHEET;
        AbstractC29912wZ<? extends BottomSheetButton> m59056v = m59056v();
        Intrinsics.checkNotNull(m59056v, "null cannot be cast to non-null type co.bird.android.flightsheet.FlightSheetBottomSheetAdapter");
        EnumC14592a enumC14592a4 = EnumC14592a.NEST_FLIGHT_SHEET;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        EnumC14592a enumC14592a5 = EnumC14592a.WAREHOUSE_FLIGHT_SHEET;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        EnumC14592a enumC14592a6 = EnumC14592a.ZONE_FLIGHT_SHEET;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m28425to(enumC14592a, new C5357Mm(context2)), TuplesKt.m28425to(enumC14592a2, new F00(context3)), TuplesKt.m28425to(enumC14592a3, (C47717qs1) m59056v), TuplesKt.m28425to(enumC14592a4, new NestFlightSheetBottomSheetAdapter(context4)), TuplesKt.m28425to(enumC14592a5, new C33239Gy6(context5)), TuplesKt.m28425to(enumC14592a6, new II6(context6)));
        this.f63393n = mutableMapOf;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        this.f63394o = new C6487Pm(context7);
        this.f63395p = C14593b.f63404g;
        this.f63396q = enumC14592a3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorMapBottomSheet(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Map<EnumC14592a, AbstractC29912wZ<? extends BottomSheetButton>> mutableMapOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        EnumC14592a enumC14592a = EnumC14592a.AREA;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        EnumC14592a enumC14592a2 = EnumC14592a.BOUNTY_FLIGHT_SHEET;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        EnumC14592a enumC14592a3 = EnumC14592a.FLIGHT_SHEET;
        AbstractC29912wZ<? extends BottomSheetButton> m59056v = m59056v();
        Intrinsics.checkNotNull(m59056v, "null cannot be cast to non-null type co.bird.android.flightsheet.FlightSheetBottomSheetAdapter");
        EnumC14592a enumC14592a4 = EnumC14592a.NEST_FLIGHT_SHEET;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        EnumC14592a enumC14592a5 = EnumC14592a.WAREHOUSE_FLIGHT_SHEET;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        EnumC14592a enumC14592a6 = EnumC14592a.ZONE_FLIGHT_SHEET;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m28425to(enumC14592a, new C5357Mm(context2)), TuplesKt.m28425to(enumC14592a2, new F00(context3)), TuplesKt.m28425to(enumC14592a3, (C47717qs1) m59056v), TuplesKt.m28425to(enumC14592a4, new NestFlightSheetBottomSheetAdapter(context4)), TuplesKt.m28425to(enumC14592a5, new C33239Gy6(context5)), TuplesKt.m28425to(enumC14592a6, new II6(context6)));
        this.f63393n = mutableMapOf;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        this.f63394o = new C6487Pm(context7);
        this.f63395p = C14593b.f63404g;
        this.f63396q = enumC14592a3;
    }
}
