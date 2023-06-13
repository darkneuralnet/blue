package p000;

import android.location.Location;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lh43;", "Lg43;", "Landroid/location/Location;", "location", "", "radius", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filters", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "r", "Lio/reactivex/k;", "Lco/bird/android/model/persistence/NestMarker;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lj43;", C17296a.f69688o, "Lj43;", "nestMarkerRepository", "<init>", "(Lj43;)V", "nest-marker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: h43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41908h43 implements InterfaceC41315g43 {

    /* renamed from: a */
    public final InterfaceC43094j43 f84681a;

    public C41908h43(InterfaceC43094j43 nestMarkerRepository) {
        Intrinsics.checkNotNullParameter(nestMarkerRepository, "nestMarkerRepository");
        this.f84681a = nestMarkerRepository;
    }

    @Override // p000.InterfaceC41315g43
    /* renamed from: C */
    public AbstractC24490k<List<NestMarker>> mo36867C() {
        AbstractC24490k<List<NestMarker>> m32163Y0 = this.f84681a.mo24502C().m32163Y0(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32163Y0, "nestMarkerRepository.str…scribeOn(Schedulers.io())");
        return m32163Y0;
    }

    @Override // p000.InterfaceC41315g43
    /* renamed from: r */
    public AbstractC23461c mo36866r(Location location, double d, OperatorMapFilterBundle filters, List<Geolocation> viewport) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        AbstractC23461c m33063X = this.f84681a.mo24497r(location, d, filters, viewport).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "nestMarkerRepository.fet…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
