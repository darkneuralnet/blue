package p000;

import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import java.util.UUID;
/* renamed from: di0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39908di0 extends Pair<UUID, Integer> {
    public C39908di0(UUID uuid, Integer num) {
        super(uuid, num);
    }

    @Override // android.util.Pair
    public String toString() {
        return "CharacteristicNotificationId{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + CoreConstants.CURLY_RIGHT;
    }
}
