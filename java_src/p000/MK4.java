package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Reservation;
import co.bird.api.response.ReservationCancelResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&JF\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0010H&R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"LMK4;", "", "", "reservationId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/ReservationCancelResponse;", "m", "Lio/reactivex/p;", "Lco/bird/android/model/Reservation;", DateTokenConverter.CONVERTER_KEY, "", "issues", "feedback", "photoUrls", "c", "", "g", "h", "LZ84;", "Lco/bird/android/buava/Optional;", "e", "()LZ84;", "reservation", "", "f", "expired", "i", "reservationCancelResponse", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MK4 */
/* loaded from: classes2.dex */
public interface MK4 {
    /* renamed from: c */
    AbstractC23442F<HM4<Reservation>> mo83800c(String str, List<String> list, String str2, List<String> list2);

    /* renamed from: d */
    AbstractC24507p<Reservation> mo83799d();

    /* renamed from: e */
    Z84<Optional<Reservation>> mo83798e();

    /* renamed from: f */
    Z84<Boolean> mo83797f();

    /* renamed from: g */
    void mo83796g();

    /* renamed from: h */
    void mo83795h();

    /* renamed from: i */
    Z84<Optional<ReservationCancelResponse>> mo83794i();

    /* renamed from: m */
    AbstractC23442F<HM4<ReservationCancelResponse>> mo83793m(String str);
}
