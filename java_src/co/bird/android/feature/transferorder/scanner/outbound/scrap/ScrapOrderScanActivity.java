package co.bird.android.feature.transferorder.scanner.outbound.scrap;

import co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity;
import co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuScanItem;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0007H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\"\u0010\u0014\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R:\u0010\u0019\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b \u0016*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;", "Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;", "LYo5;", "LLz3;", TransferTable.COLUMN_STATE, "", "q0", "Lio/reactivex/Observable;", "I", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "", "r4", "o0", "y", "LYo5;", "F0", "()LYo5;", "L0", "(LYo5;)V", "presenter", "Lma4;", "kotlin.jvm.PlatformType", "z", "Lma4;", "scrapReasonSelectsRelay", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,57:1\n199#2:58\n*S KotlinDebug\n*F\n+ 1 ScrapOrderScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity\n*L\n30#1:58\n*E\n"})
/* loaded from: classes3.dex */
public final class ScrapOrderScanActivity extends BaseOutboundScanActivity<C37360Yo5> {

    /* renamed from: y */
    public C37360Yo5 f65771y;

    /* renamed from: z */
    public final C45168ma4<Pair<WireSkuScanItem, String>> f65772z;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "LLz3;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$completeClicks$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1774#2,4:58\n*S KotlinDebug\n*F\n+ 1 ScrapOrderScanActivity.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity$completeClicks$1\n*L\n41#1:58,4\n*E\n"})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15837a extends Lambda implements Function1<Pair<? extends TransferOrderDemandSource, ? extends C34415Lz3>, Integer> {

        /* renamed from: g */
        public static final C15837a f65773g = new C15837a();

        public C15837a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Pair<? extends TransferOrderDemandSource, C34415Lz3> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<PC5> m96035r = pair.component2().m96035r();
            int i = 0;
            if (!(m96035r instanceof Collection) || !m96035r.isEmpty()) {
                int i2 = 0;
                for (PC5 pc5 : m96035r) {
                    if (pc5.m90588b() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i = i2;
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "count", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Integer;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15838b extends Lambda implements Function1<Integer, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C15839a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C15839a f65775g = new C15839a();

            public C15839a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity$b$b */
        /* loaded from: classes3.dex */
        public static final class C15840b extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public static final C15840b f65776g = new C15840b();

            public C15840b() {
                super(1);
            }

            /* renamed from: a */
            public final void m56416a(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m56416a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        public C15838b() {
            super(1);
        }

        /* renamed from: d */
        public static final Unit m56418d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Unit) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Unit> invoke(Integer count) {
            Intrinsics.checkNotNullParameter(count, "count");
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(ScrapOrderScanActivity.this.m58990F(), new C41751go5(count.intValue()), false, false, 6, null);
            final C15839a c15839a = C15839a.f65775g;
            AbstractC24507p m33098z = birdDialog$default.m33098z(new InterfaceC23494q() { // from class: Ro5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = ScrapOrderScanActivity.C15838b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C15840b c15840b = C15840b.f65776g;
            return m33098z.m32067H(new InterfaceC23492o() { // from class: So5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Unit m56418d;
                    m56418d = ScrapOrderScanActivity.C15838b.m56418d(Function1.this, obj);
                    return m56418d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireItemScrapReason;", "kotlin.jvm.PlatformType", "reason", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireItemScrapReason;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15841c extends Lambda implements Function1<WireItemScrapReason, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C47307qA5 f65778h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15841c(C47307qA5 c47307qA5) {
            super(1);
            this.f65778h = c47307qA5;
        }

        /* renamed from: a */
        public final void m56415a(WireItemScrapReason wireItemScrapReason) {
            ScrapOrderScanActivity.this.f65772z.accept(TuplesKt.m28425to(this.f65778h.m17998c(), wireItemScrapReason.getCode()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireItemScrapReason wireItemScrapReason) {
            m56415a(wireItemScrapReason);
            return Unit.INSTANCE;
        }
    }

    public ScrapOrderScanActivity() {
        C45168ma4<Pair<WireSkuScanItem, String>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Pair<WireSkuScanItem, String>>()");
        this.f65772z = m25409g;
    }

    /* renamed from: C0 */
    public static final Integer m56432C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final InterfaceC24574u m56431E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m56428K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity
    /* renamed from: F0 */
    public C37360Yo5 getPresenter() {
        C37360Yo5 c37360Yo5 = this.f65771y;
        if (c37360Yo5 != null) {
            return c37360Yo5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity, p000.InterfaceC34181Kz3
    /* renamed from: I */
    public Observable<Unit> mo56429I() {
        Observable m31950a = C24527f.m31950a(m56467i0().m72166v(), getPresenter().m42276l());
        final C15837a c15837a = C15837a.f65773g;
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: Po5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m56432C0;
                m56432C0 = ScrapOrderScanActivity.m56432C0(Function1.this, obj);
                return m56432C0;
            }
        });
        final C15838b c15838b = new C15838b();
        Observable<Unit> flatMapMaybe = map.flatMapMaybe(new InterfaceC23492o() { // from class: Qo5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m56431E0;
                m56431E0 = ScrapOrderScanActivity.m56431E0(Function1.this, obj);
                return m56431E0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun completeCli…K }\n        .map {}\n    }");
        return flatMapMaybe;
    }

    /* renamed from: L0 */
    public void setPresenter(C37360Yo5 c37360Yo5) {
        Intrinsics.checkNotNullParameter(c37360Yo5, "<set-?>");
        this.f65771y = c37360Yo5;
    }

    @Override // co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity
    /* renamed from: o0 */
    public void mo56426o0() {
        SP0.m85511a().mo80956a(m58989H()).mo80959b(this);
    }

    @Override // co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity, co.bird.android.vehiclescanner.common.mrp.BaseVehicleScanActivity, p000.InterfaceC48362rx4
    /* renamed from: q0 */
    public void render(C34415Lz3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.render(state);
        C47307qA5 m96033t = state.m96033t();
        if (m96033t != null) {
            C33616Io5 m101682a = C33616Io5.f16235j.m101682a(m96033t.m17999b());
            m101682a.show(getSupportFragmentManager(), "ScrapOrderReasonBottomSheet");
            Object m33135e = m101682a.m101683t8().m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C15841c c15841c = new C15841c(m96033t);
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Oo5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    ScrapOrderScanActivity.m56428K0(Function1.this, obj);
                }
            });
        }
    }

    @Override // co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity, p000.InterfaceC34181Kz3
    /* renamed from: r4 */
    public Observable<Pair<WireSkuScanItem, String>> mo56424r4() {
        Observable<Pair<WireSkuScanItem, String>> hide = this.f65772z.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scrapReasonSelectsRelay.hide()");
        return hide;
    }
}
