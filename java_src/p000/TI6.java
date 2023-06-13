package p000;

import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC46545ot5;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\u0007H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LTI6;", "LQI6;", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "h0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/ZonePolygonable;", "I", "Lco/bird/android/model/persistence/ZoneMarker;", "i", "", "zoneId", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "f0", "i0", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "g0", "Lot5;", C17296a.f69688o, "Lot5;", "serverDrivenFilterManager", "LWI6;", "b", "LWI6;", "repo", "<init>", "(Lot5;LWI6;)V", "zone_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TI6 */
/* loaded from: classes4.dex */
public final class TI6 implements QI6 {

    /* renamed from: a */
    public final InterfaceC46545ot5 f35219a;

    /* renamed from: b */
    public final WI6 f35220b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TI6$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C7766a extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, OperatorMapFilterBundle> {

        /* renamed from: b */
        public static final C7766a f35221b = new C7766a();

        public C7766a() {
            super(1, C52473yt5.class, "toOperatorMapRequest", "toOperatorMapRequest(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorMapFilterBundle invoke(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C52473yt5.m2323c(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TI6$b */
    /* loaded from: classes4.dex */
    public static final class C7767b extends Lambda implements Function1<OperatorMapFilterBundle, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ List<Geolocation> f35223h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7767b(List<Geolocation> list) {
            super(1);
            this.f35223h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(OperatorMapFilterBundle filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            return TI6.this.f35220b.mo39626Y0(this.f35223h, filters);
        }
    }

    public TI6(InterfaceC46545ot5 serverDrivenFilterManager, WI6 repo) {
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f35219a = serverDrivenFilterManager;
        this.f35220b = repo;
    }

    /* renamed from: c */
    public static final OperatorMapFilterBundle m83905c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OperatorMapFilterBundle) tmp0.invoke(obj);
    }

    /* renamed from: d */
    public static final InterfaceC23496h m83904d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.QI6
    /* renamed from: I */
    public Observable<List<ZonePolygonable>> mo83908I() {
        Observable<List<ZonePolygonable>> subscribeOn = this.f35220b.mo39643I().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamZonesToRender…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.QI6
    /* renamed from: f0 */
    public AbstractC23442F<ZoneOverlayAnalytics> mo83903f0(String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        AbstractC23442F<ZoneOverlayAnalytics> m33142Y = this.f35220b.mo39624f0(zoneId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "repo.getZoneOverlayAnaly…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.QI6
    /* renamed from: g0 */
    public Observable<ZoneFlightSheetDetails> mo83902g0(String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Observable<ZoneFlightSheetDetails> subscribeOn = this.f35220b.mo39622k1(zoneId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamZoneFlightShe…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.QI6
    /* renamed from: h0 */
    public AbstractC23461c mo83901h0(List<Geolocation> viewport) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        AbstractC23442F firstOrError = InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this.f35219a, false, 1, null).subscribeOn(C24542a.m31932c()).firstOrError();
        final C7766a c7766a = C7766a.f35221b;
        AbstractC23442F m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: RI6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                OperatorMapFilterBundle m83905c;
                m83905c = TI6.m83905c(Function1.this, obj);
                return m83905c;
            }
        });
        final C7767b c7767b = new C7767b(viewport);
        AbstractC23461c m33164B = m33157I.m33164B(new InterfaceC23492o() { // from class: SI6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m83904d;
                m83904d = TI6.m83904d(Function1.this, obj);
                return m83904d;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchZoneDa…ort, filters)\n      }\n  }");
        return m33164B;
    }

    @Override // p000.QI6
    /* renamed from: i */
    public Observable<List<ZoneMarker>> mo83900i() {
        Observable<List<ZoneMarker>> subscribeOn = this.f35220b.mo39623i().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamZonesToAnnota…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.QI6
    /* renamed from: i0 */
    public AbstractC23461c mo83899i0(String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        AbstractC23461c m33063X = this.f35220b.mo39633S0(zoneId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchZoneFlightShee…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
