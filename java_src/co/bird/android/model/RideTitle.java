package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/RideTitle;", "", Entry.TYPE_TEXT, "", "(Ljava/lang/String;II)V", "getText", "()I", "ONBOARD", "IN_PROGRESS", "MULTIPLE_IN_PROGRESS", "FIND_BIRD", "RIDE_END", "RESERVATION", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum RideTitle {
    ONBOARD(C45871nl4.ride_title_onboard),
    IN_PROGRESS(C45871nl4.ride_title_in_progress),
    MULTIPLE_IN_PROGRESS(C45871nl4.ride_title_multiple_in_progress),
    FIND_BIRD(C46464ol4.empty),
    RIDE_END(C45871nl4.ride_title_ride_end),
    RESERVATION(C45871nl4.reservation_title_reserved);
    
    private final int text;

    RideTitle(int i) {
        this.text = i;
    }

    public final int getText() {
        return this.text;
    }
}
