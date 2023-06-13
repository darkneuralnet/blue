package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.CurrentRental;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.RentalPlansResponse;
import co.bird.android.model.persistence.Area;
import co.bird.api.request.ScheduleLongTermRentalBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H&R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00070\u00190\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m28432d2 = {"LCx4;", "", "Landroid/location/Location;", "location", "", "radius", "Lio/reactivex/F;", "", "Lco/bird/android/model/persistence/Area;", "f", "LHM4;", "Lco/bird/android/model/RentalPlansResponse;", "b", "g", "Lio/reactivex/p;", "Ltg1;", "i", "Lco/bird/api/request/ScheduleLongTermRentalBody;", "body", C17296a.f69688o, "", "rentalId", "e", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "c", "()Lio/reactivex/Observable;", "onDemandPlan", "LZ84;", "Lco/bird/android/model/CurrentRental;", "h", "()LZ84;", "currentRentals", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cx4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC32292Cx4 {
    /* renamed from: a */
    AbstractC24507p<C49375tg1> mo87538a(ScheduleLongTermRentalBody scheduleLongTermRentalBody);

    /* renamed from: b */
    AbstractC23442F<HM4<RentalPlansResponse>> mo87537b(Location location);

    /* renamed from: c */
    Observable<Optional<RentalPlan>> mo87536c();

    /* renamed from: d */
    AbstractC24507p<C49375tg1> mo87535d(String str);

    /* renamed from: e */
    AbstractC24507p<C49375tg1> mo87534e(String str);

    /* renamed from: f */
    AbstractC23442F<List<Area>> mo87533f(Location location, double d);

    /* renamed from: g */
    AbstractC23442F<HM4<RentalPlansResponse>> mo87532g(Location location);

    /* renamed from: h */
    Z84<Optional<List<CurrentRental>>> mo87531h();

    /* renamed from: i */
    AbstractC24507p<C49375tg1> mo87530i();
}
