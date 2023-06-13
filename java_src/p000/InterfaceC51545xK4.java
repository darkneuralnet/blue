package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Reservation;
import co.bird.api.request.CancelReservationBody;
import co.bird.api.request.CreateReservationWithIntentBody;
import co.bird.api.request.ReservationFeedbackBody;
import co.bird.api.response.CreateReservationWithIntentResponse;
import co.bird.api.response.ReservationCancelResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¨\u0006\u0012"}, m28432d2 = {"LxK4;", "", "Lco/bird/api/request/CreateReservationWithIntentBody;", "createReservationWithIntentBody", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/CreateReservationWithIntentResponse;", "g", "Lco/bird/api/request/CancelReservationBody;", "cancelReservationBody", "Lco/bird/api/response/ReservationCancelResponse;", "e", "Lio/reactivex/p;", "Lco/bird/android/model/Reservation;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/ReservationFeedbackBody;", "reservationFeedbackBody", "f", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xK4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC51545xK4 {
    @NA1("reservation/active")
    /* renamed from: d */
    AbstractC24507p<Reservation> m5442d();

    @AD3("reservation/cancel")
    /* renamed from: e */
    AbstractC23442F<HM4<ReservationCancelResponse>> m5441e(@InterfaceC6404PY CancelReservationBody cancelReservationBody);

    @AD3("reservation/feedback")
    /* renamed from: f */
    AbstractC23442F<HM4<Reservation>> m5440f(@InterfaceC6404PY ReservationFeedbackBody reservationFeedbackBody);

    @AD3("reservation/create/v2")
    /* renamed from: g */
    AbstractC23442F<HM4<CreateReservationWithIntentResponse>> m5439g(@InterfaceC6404PY CreateReservationWithIntentBody createReservationWithIntentBody);
}
