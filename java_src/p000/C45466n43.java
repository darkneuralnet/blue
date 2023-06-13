package p000;

import android.location.Location;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireNestMarker;
import co.bird.android.model.wire.WireOperatorMapFilterBundle;
import co.bird.api.request.OperatorMapRequest;
import co.bird.api.response.OperatorMapResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23496h;
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
import p000.C45466n43;
import p000.InterfaceC43094j43;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\rH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Ln43;", "Lj43;", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "r", "Lio/reactivex/k;", "Lco/bird/android/model/persistence/NestMarker;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "Le43;", "b", "Le43;", "nestMarkerDao", "<init>", "(LTk3;Le43;)V", "nest-marker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestMarkerRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerRepositoryImpl.kt\nco/bird/android/repository/nestmarker/NestMarkerRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n*S KotlinDebug\n*F\n+ 1 NestMarkerRepositoryImpl.kt\nco/bird/android/repository/nestmarker/NestMarkerRepositoryImpl\n*L\n37#1:63\n37#1:64,3\n*E\n"})
/* renamed from: n43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45466n43 implements InterfaceC43094j43 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f99297a;

    /* renamed from: b */
    public final AbstractC40129e43 f99298b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorMapResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/api/response/OperatorMapResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestMarkerRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerRepositoryImpl.kt\nco/bird/android/repository/nestmarker/NestMarkerRepositoryImpl$fetchNestMarkers$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n1549#2:67\n1620#2,3:68\n*S KotlinDebug\n*F\n+ 1 NestMarkerRepositoryImpl.kt\nco/bird/android/repository/nestmarker/NestMarkerRepositoryImpl$fetchNestMarkers$2\n*L\n41#1:63\n41#1:64,3\n42#1:67\n42#1:68,3\n*E\n"})
    /* renamed from: n43$a */
    /* loaded from: classes4.dex */
    public static final class C26357a extends Lambda implements Function1<OperatorMapResponse, InterfaceC23496h> {
        public C26357a() {
            super(1);
        }

        /* renamed from: d */
        public static final Unit m24493d(C45466n43 this$0, List retainedIds) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(retainedIds, "$retainedIds");
            this$0.f99298b.mo42201h(retainedIds);
            return Unit.INSTANCE;
        }

        /* renamed from: e */
        public static final Unit m24492e(C45466n43 this$0, List markers) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(markers, "$markers");
            this$0.f99298b.mo42199j(markers);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(OperatorMapResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireNestMarker> nests = response.getNests();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(nests, 10);
            final ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireNestMarker wireNestMarker : nests) {
                arrayList.add(wireNestMarker.getId());
            }
            List<WireNestMarker> nests2 = response.getNests();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(nests2, 10);
            final ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireNestMarker wireNestMarker2 : nests2) {
                arrayList2.add(C38926c43.m61968a(wireNestMarker2));
            }
            final C45466n43 c45466n43 = C45466n43.this;
            final C45466n43 c45466n432 = C45466n43.this;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{AbstractC23461c.m33078H(new Callable() { // from class: l43
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m24493d;
                    m24493d = C45466n43.C26357a.m24493d(C45466n43.this, arrayList);
                    return m24493d;
                }
            }), AbstractC23461c.m33078H(new Callable() { // from class: m43
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m24492e;
                    m24492e = C45466n43.C26357a.m24492e(C45466n43.this, arrayList2);
                    return m24492e;
                }
            })});
            AbstractC23461c m33063X = AbstractC23461c.m33037r(listOf).m33063X(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33063X, "concat(listOf(\n         …scribeOn(Schedulers.io())");
            return c45466n43.m24500K1(m33063X);
        }
    }

    public C45466n43(InterfaceC36152Tk3 operatorClient, AbstractC40129e43 nestMarkerDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(nestMarkerDao, "nestMarkerDao");
        this.f99297a = operatorClient;
        this.f99298b = nestMarkerDao;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m24498M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC43094j43
    /* renamed from: C */
    public AbstractC24490k<List<NestMarker>> mo24502C() {
        return m24499L1(this.f99298b.mo42205d());
    }

    /* renamed from: K1 */
    public AbstractC23461c m24500K1(AbstractC23461c abstractC23461c) {
        return InterfaceC43094j43.C24708a.m31159a(this, abstractC23461c);
    }

    /* renamed from: L1 */
    public <T> AbstractC24490k<T> m24499L1(AbstractC24490k<T> abstractC24490k) {
        return InterfaceC43094j43.C24708a.m31158b(this, abstractC24490k);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f99298b.mo42208a();
    }

    @Override // p000.InterfaceC43094j43
    /* renamed from: r */
    public AbstractC23461c mo24497r(Location location, double d, OperatorMapFilterBundle filters, List<Geolocation> viewport) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        InterfaceC36152Tk3 interfaceC36152Tk3 = this.f99297a;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        OperatorMapKind operatorMapKind = OperatorMapKind.NEST;
        WireOperatorMapFilterBundle m17958i = C47311qB0.m17958i(filters);
        List<Geolocation> list = viewport;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Geolocation geolocation : list) {
            arrayList.add(C47311qB0.m17960g(geolocation));
        }
        AbstractC23442F<OperatorMapResponse> m83017z = interfaceC36152Tk3.m83017z(new OperatorMapRequest(latitude, longitude, d, operatorMapKind, m17958i, null, null, arrayList, 96, null));
        final C26357a c26357a = new C26357a();
        AbstractC23461c m33164B = m83017z.m33164B(new InterfaceC23492o() { // from class: k43
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m24498M1;
                m24498M1 = C45466n43.m24498M1(Function1.this, obj);
                return m24498M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchNestMa…learOnError()\n      }\n  }");
        return m33164B;
    }
}
