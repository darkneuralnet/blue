package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/RideAction;", "", Entry.TYPE_TEXT, "", "(Ljava/lang/String;II)V", "getText", "()I", "LOCK", "UNLOCK", "SCAN_AFTER_RESERVATION", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum RideAction {
    LOCK(C45871nl4.ride_action_lock),
    UNLOCK(C45871nl4.ride_action_unlock),
    SCAN_AFTER_RESERVATION(C45871nl4.ride_action_ride_after_reservation);
    
    private final int text;

    RideAction(int i) {
        this.text = i;
    }

    public final int getText() {
        return this.text;
    }
}
