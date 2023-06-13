package co.bird.android.model;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"remainingSeconds", "", "Lco/bird/android/model/Reservation;", "(Lco/bird/android/model/Reservation;)Ljava/lang/Integer;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReservationKt {
    public static final Integer remainingSeconds(Reservation reservation) {
        Intrinsics.checkNotNullParameter(reservation, "<this>");
        if (reservation.getExpireAt() != null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long millis = reservation.getExpireAt().getMillis();
            DateTime now = DateTime.now();
            Intrinsics.checkNotNull(now);
            int seconds = (int) timeUnit.toSeconds(millis - now.getMillis());
            if (seconds < 0) {
                seconds = 0;
            }
            return Integer.valueOf(seconds);
        }
        return null;
    }
}
