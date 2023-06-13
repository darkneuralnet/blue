package p000;

import ch.qos.logback.core.spi.ComponentTracker;
import java.util.Random;
/* renamed from: Tx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36267Tx1 {

    /* renamed from: a */
    public String f36490a;

    /* renamed from: b */
    public long f36491b;

    public C36267Tx1() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f36490a == null) {
            this.f36491b = currentTimeMillis;
        }
        if (this.f36491b + ComponentTracker.DEFAULT_TIMEOUT > currentTimeMillis) {
            this.f36491b = currentTimeMillis + ComponentTracker.DEFAULT_TIMEOUT;
            Random random = new Random(this.f36491b);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                sb.append((char) ((Math.abs(random.nextInt()) % 10) + 48));
            }
            this.f36490a = sb.toString();
        }
    }

    /* renamed from: a */
    public boolean m82223a() {
        return this.f36491b > System.currentTimeMillis();
    }
}
