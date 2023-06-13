package p000;

import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.UUID;
/* renamed from: ci0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39297ci0 extends C39908di0 {

    /* renamed from: a */
    public final byte[] f61088a;

    public C39297ci0(UUID uuid, Integer num, byte[] bArr) {
        super(uuid, num);
        this.f61088a = bArr;
    }

    @Override // android.util.Pair
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39297ci0)) {
            if ((obj instanceof C39908di0) && super.equals(obj)) {
                return true;
            }
            return false;
        } else if (!super.equals(obj)) {
            return false;
        } else {
            return Arrays.equals(this.f61088a, ((C39297ci0) obj).f61088a);
        }
    }

    @Override // android.util.Pair
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f61088a);
    }

    @Override // p000.C39908di0, android.util.Pair
    public String toString() {
        return "CharacteristicChangedEvent{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + ", data=" + Arrays.toString(this.f61088a) + CoreConstants.CURLY_RIGHT;
    }
}
