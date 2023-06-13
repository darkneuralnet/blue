package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.VehicleHibernationCategory;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import co.bird.android.model.wire.WireHibernationSessionVehicle;
import co.bird.api.request.BirdIdBody;
import co.bird.api.request.HibernationStatusRequest;
import co.bird.api.response.HibernationResultResponse;
import co.bird.api.response.HibernationStatusResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.VL1;
import p000.ZL1;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LZL1;", "LVL1;", "", "birdId", "Lio/reactivex/c;", "l1", "", "birdIds", "s0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "N", "f", "clear", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LVK;", "b", "LVK;", "birdClient", "LTk3;", "c", "LTk3;", "operatorClient", "LSL1;", DateTokenConverter.CONVERTER_KEY, "LSL1;", "hibernationDao", "<init>", "(Landroid/content/Context;LVK;LTk3;LSL1;)V", "co.bird.android.repository.hibernation"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZL1 */
/* loaded from: classes4.dex */
public final class ZL1 implements VL1 {

    /* renamed from: a */
    public final Context f48339a;

    /* renamed from: b */
    public final InterfaceC8601VK f48340b;

    /* renamed from: c */
    public final InterfaceC36152Tk3 f48341c;

    /* renamed from: d */
    public final SL1 f48342d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/HibernationStatusResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/HibernationStatusResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHibernationRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationRepositoryImpl.kt\nco/bird/android/repository/hibernation/HibernationRepositoryImpl$fetchHibernationStatus$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1549#2:81\n1620#2,3:82\n1#3:85\n*S KotlinDebug\n*F\n+ 1 HibernationRepositoryImpl.kt\nco/bird/android/repository/hibernation/HibernationRepositoryImpl$fetchHibernationStatus$1\n*L\n60#1:81\n60#1:82,3\n*E\n"})
    /* renamed from: ZL1$a */
    /* loaded from: classes4.dex */
    public static final class C10237a extends Lambda implements Function1<HibernationStatusResponse, InterfaceC23496h> {
        public C10237a() {
            super(1);
        }

        /* renamed from: c */
        public static final Unit m73278c(HibernationStatusResponse response, ZL1 this$0) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(response, "$response");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            List<WireHibernationSessionVehicle> vehicles = response.getVehicles();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireHibernationSessionVehicle wireHibernationSessionVehicle : vehicles) {
                arrayList.add(QL1.m88651a(wireHibernationSessionVehicle));
            }
            this$0.f48342d.mo83763g(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final HibernationStatusResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            final ZL1 zl1 = ZL1.this;
            return AbstractC23461c.m33078H(new Callable() { // from class: YL1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m73278c;
                    m73278c = ZL1.C10237a.m73278c(HibernationStatusResponse.this, zl1);
                    return m73278c;
                }
            }).m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/HibernationResultResponse;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/HibernationResultResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZL1$b */
    /* loaded from: classes4.dex */
    public static final class C10238b extends Lambda implements Function1<HibernationResultResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f48345h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10238b(String str) {
            super(1);
            this.f48345h = str;
        }

        /* renamed from: c */
        public static final Unit m73275c(HibernationResultResponse result, ZL1 this$0, String birdId) {
            VehicleHibernationCategory vehicleHibernationCategory;
            String string;
            List<HibernationSessionVehicle> listOf;
            Intrinsics.checkNotNullParameter(result, "$result");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(birdId, "$birdId");
            if (result.getSuccess()) {
                vehicleHibernationCategory = VehicleHibernationCategory.PENDING;
                string = this$0.f48339a.getString(C45871nl4.hibernation_status_pending);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…bernation_status_pending)");
            } else {
                vehicleHibernationCategory = VehicleHibernationCategory.NOT_HIBERNATED;
                string = this$0.f48339a.getString(C45871nl4.hibernation_status_failed);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ibernation_status_failed)");
            }
            HibernationSessionVehicle hibernationSessionVehicle = new HibernationSessionVehicle(birdId, vehicleHibernationCategory, string, null, null);
            SL1 sl1 = this$0.f48342d;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(hibernationSessionVehicle);
            sl1.mo83763g(listOf);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final HibernationResultResponse result) {
            Intrinsics.checkNotNullParameter(result, "result");
            final ZL1 zl1 = ZL1.this;
            final String str = this.f48345h;
            return AbstractC23461c.m33078H(new Callable() { // from class: aM1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m73275c;
                    m73275c = ZL1.C10238b.m73275c(HibernationResultResponse.this, zl1, str);
                    return m73275c;
                }
            });
        }
    }

    public ZL1(Context context, InterfaceC8601VK birdClient, InterfaceC36152Tk3 operatorClient, SL1 hibernationDao) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(hibernationDao, "hibernationDao");
        this.f48339a = context;
        this.f48340b = birdClient;
        this.f48341c = operatorClient;
        this.f48342d = hibernationDao;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m73286M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final InterfaceC23496h m73284N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: L1 */
    public <T> Observable<T> m73287L1(Observable<T> observable) {
        return VL1.C8604a.m79951a(this, observable);
    }

    @Override // p000.VL1
    /* renamed from: N */
    public Observable<List<HibernationSessionVehicle>> mo73285N() {
        return m73287L1(this.f48342d.mo83767c());
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f48342d.mo83769a();
    }

    @Override // p000.VL1
    /* renamed from: f */
    public AbstractC23461c mo73283f() {
        return this.f48342d.mo83768b();
    }

    @Override // p000.VL1
    /* renamed from: l1 */
    public AbstractC23461c mo73282l1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HibernationResultResponse> m79972M = this.f48340b.m79972M(new BirdIdBody(birdId));
        final C10238b c10238b = new C10238b(birdId);
        AbstractC23461c m33164B = m79972M.m33164B(new InterfaceC23492o() { // from class: XL1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m73284N1;
                m73284N1 = ZL1.m73284N1(Function1.this, obj);
                return m73284N1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun hibernateVe…e))\n        }\n      }\n  }");
        return m33164B;
    }

    @Override // p000.VL1
    /* renamed from: s0 */
    public AbstractC23461c mo73281s0(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23442F<HibernationStatusResponse> m83019x = this.f48341c.m83019x(new HibernationStatusRequest(birdIds));
        final C10237a c10237a = new C10237a();
        AbstractC23461c m33164B = m83019x.m33164B(new InterfaceC23492o() { // from class: WL1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m73286M1;
                m73286M1 = ZL1.m73286M1(Function1.this, obj);
                return m73286M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchHibern…edulers.io())\n      }\n  }");
        return m33164B;
    }
}
