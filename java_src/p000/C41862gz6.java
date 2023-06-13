package p000;

import co.bird.android.model.persistence.WarehouseMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireWarehouseMarker;
import co.bird.api.request.OperatorMapWarehouseRequest;
import co.bird.api.response.OperatorMapWarehouseResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41862gz6;
import p000.InterfaceC39491cz6;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lgz6;", "Lcz6;", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "Lio/reactivex/c;", "H1", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/WarehouseMarker;", "p1", "clear", "LTk3;", C17296a.f69688o, "LTk3;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LWy6;", "b", "LWy6;", "warehouseMarkerDao", "<init>", "(LTk3;LWy6;)V", "warehouse-marker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseMarkerRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseMarkerRepositoryImpl.kt\nco/bird/android/repository/warehousemarker/WarehouseMarkerRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n*S KotlinDebug\n*F\n+ 1 WarehouseMarkerRepositoryImpl.kt\nco/bird/android/repository/warehousemarker/WarehouseMarkerRepositoryImpl\n*L\n29#1:56\n29#1:57,3\n*E\n"})
/* renamed from: gz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41862gz6 implements InterfaceC39491cz6 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f84575a;

    /* renamed from: b */
    public final AbstractC36983Wy6 f84576b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorMapWarehouseResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/api/response/OperatorMapWarehouseResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseMarkerRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseMarkerRepositoryImpl.kt\nco/bird/android/repository/warehousemarker/WarehouseMarkerRepositoryImpl$fetchWarehouseMarkers$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n1549#2:60\n1620#2,3:61\n*S KotlinDebug\n*F\n+ 1 WarehouseMarkerRepositoryImpl.kt\nco/bird/android/repository/warehousemarker/WarehouseMarkerRepositoryImpl$fetchWarehouseMarkers$2\n*L\n34#1:56\n34#1:57,3\n35#1:60\n35#1:61,3\n*E\n"})
    /* renamed from: gz6$a */
    /* loaded from: classes4.dex */
    public static final class C22526a extends Lambda implements Function1<OperatorMapWarehouseResponse, InterfaceC23496h> {
        public C22526a() {
            super(1);
        }

        /* renamed from: d */
        public static final Unit m37239d(C41862gz6 this$0, List warehouses) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(warehouses, "$warehouses");
            this$0.f84576b.mo75947i(warehouses);
            return Unit.INSTANCE;
        }

        /* renamed from: e */
        public static final Unit m37238e(C41862gz6 this$0, List warehouseIds) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(warehouseIds, "$warehouseIds");
            this$0.f84576b.mo75949g(warehouseIds);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(OperatorMapWarehouseResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireWarehouseMarker> warehouses = response.getWarehouses();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(warehouses, 10);
            final ArrayList<WarehouseMarker> arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireWarehouseMarker wireWarehouseMarker : warehouses) {
                arrayList.add(C36749Vy6.m79025a(wireWarehouseMarker));
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            final ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WarehouseMarker warehouseMarker : arrayList) {
                arrayList2.add(warehouseMarker.getId());
            }
            final C41862gz6 c41862gz6 = C41862gz6.this;
            final C41862gz6 c41862gz62 = C41862gz6.this;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{AbstractC23461c.m33078H(new Callable() { // from class: ez6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m37239d;
                    m37239d = C41862gz6.C22526a.m37239d(C41862gz6.this, arrayList);
                    return m37239d;
                }
            }), AbstractC23461c.m33078H(new Callable() { // from class: fz6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m37238e;
                    m37238e = C41862gz6.C22526a.m37238e(C41862gz6.this, arrayList2);
                    return m37238e;
                }
            })});
            AbstractC23461c m33063X = AbstractC23461c.m33074L(listOf).m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "merge(listOf(\n          …scribeOn(Schedulers.io())");
            return c41862gz6.m37245K1(m33063X);
        }
    }

    public C41862gz6(InterfaceC36152Tk3 client, AbstractC36983Wy6 warehouseMarkerDao) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(warehouseMarkerDao, "warehouseMarkerDao");
        this.f84575a = client;
        this.f84576b = warehouseMarkerDao;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m37244L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39491cz6
    /* renamed from: H1 */
    public AbstractC23461c mo37247H1(List<Geolocation> viewport, OperatorMapFilterBundle filters) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(filters, "filters");
        InterfaceC36152Tk3 interfaceC36152Tk3 = this.f84575a;
        List<Geolocation> list = viewport;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Geolocation geolocation : list) {
            arrayList.add(C47311qB0.m17960g(geolocation));
        }
        AbstractC23442F<OperatorMapWarehouseResponse> m83020w = interfaceC36152Tk3.m83020w(new OperatorMapWarehouseRequest(arrayList, C47311qB0.m17958i(filters)));
        final C22526a c22526a = new C22526a();
        AbstractC23461c m33164B = m83020w.m33164B(new InterfaceC23492o() { // from class: dz6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m37244L1;
                m37244L1 = C41862gz6.m37244L1(Function1.this, obj);
                return m37244L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchWareho…learOnError()\n      }\n  }");
        return m33164B;
    }

    /* renamed from: K1 */
    public AbstractC23461c m37245K1(AbstractC23461c abstractC23461c) {
        return InterfaceC39491cz6.C19648a.m44759a(this, abstractC23461c);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f84576b.mo75955a();
    }

    @Override // p000.InterfaceC39491cz6
    /* renamed from: p1 */
    public Observable<List<WarehouseMarker>> mo37243p1() {
        return this.f84576b.mo75946j();
    }
}
