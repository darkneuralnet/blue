package p000;

import android.location.Address;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.LocationRequest;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.joda.time.DateTimeUtils;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR$\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00030\u00030\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006\""}, m28432d2 = {"LHj1;", "Law2;", "Lio/reactivex/p;", "Landroid/location/Location;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "Lio/reactivex/Observable;", "b", "", "lat", "lng", "", "maxResults", "Lio/reactivex/F;", "", "Landroid/location/Address;", C17296a.f69688o, "", "locationName", "c", "", "acc", "", "f", "LEr4;", "LEr4;", "reactiveLocationProvider", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "locationSubject", "<init>", "(LEr4;)V", "co.bird.android.lib.location"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hj1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33333Hj1 implements InterfaceC38253aw2 {

    /* renamed from: a */
    public final C32706Er4 f13796a;

    /* renamed from: b */
    public C24552a<Location> f13797b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Landroid/location/Location;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hj1$a */
    /* loaded from: classes3.dex */
    public static final class C3214a extends Lambda implements Function1<Long, Location> {
        public C3214a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Location invoke(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object value = C33333Hj1.this.f13797b.getValue();
            Intrinsics.checkNotNull(value);
            return (Location) value;
        }
    }

    public C33333Hj1(C32706Er4 reactiveLocationProvider) {
        Intrinsics.checkNotNullParameter(reactiveLocationProvider, "reactiveLocationProvider");
        this.f13796a = reactiveLocationProvider;
        C24552a<Location> m31921g = C24552a.m31921g(C37068Xi1.f43709a.m76547a());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(Extras.defaultLocation())");
        this.f13797b = m31921g;
    }

    /* renamed from: g */
    public static final Location m103493g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Location) tmp0.invoke(obj);
    }

    public static /* synthetic */ void setLocation$default(C33333Hj1 c33333Hj1, double d, double d2, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        c33333Hj1.m103494f(d, d2, f);
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: a */
    public AbstractC23442F<List<Address>> mo65221a(double d, double d2, int i) {
        return this.f13796a.mo65221a(d, d2, i);
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: b */
    public Observable<Location> mo65220b(LocationRequest locationRequest) {
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        Observable<Location> hide = this.f13797b.hide();
        Observable<Long> interval = Observable.interval(0L, 1000L, TimeUnit.MILLISECONDS);
        final C3214a c3214a = new C3214a();
        Observable<Location> observeOn = Observable.merge(hide, interval.map(new InterfaceC23492o() { // from class: Gj1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Location m103493g;
                m103493g = C33333Hj1.m103493g(Function1.this, obj);
                return m103493g;
            }
        })).subscribeOn(C24542a.m31932c()).observeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(observeOn, "@RequiresPermission(anyO…veOn(Schedulers.io())\n  }");
        return observeOn;
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: c */
    public AbstractC23442F<List<Address>> mo65219c(String locationName, int i) {
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        return this.f13796a.mo65219c(locationName, i);
    }

    @Override // p000.InterfaceC38253aw2
    /* renamed from: d */
    public AbstractC24507p<Location> mo65218d() {
        Location value = this.f13797b.getValue();
        Intrinsics.checkNotNull(value);
        AbstractC24507p<Location> m32056T = AbstractC24507p.m32068G(value).m32056T(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32056T, "just(locationSubject.val…scribeOn(Schedulers.io())");
        return m32056T;
    }

    /* renamed from: f */
    public final void m103494f(double d, double d2, float f) {
        C24552a<Location> c24552a = this.f13797b;
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        location.setAccuracy(f);
        location.setTime(DateTimeUtils.currentTimeMillis());
        c24552a.onNext(location);
    }
}
