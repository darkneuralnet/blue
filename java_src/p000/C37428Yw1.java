package p000;

import android.app.Notification;
import ch.qos.logback.core.CoreConstants;
/* renamed from: Yw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37428Yw1 {

    /* renamed from: a */
    public final int f47645a;

    /* renamed from: b */
    public final int f47646b;

    /* renamed from: c */
    public final Notification f47647c;

    public C37428Yw1(int i, Notification notification, int i2) {
        this.f47645a = i;
        this.f47647c = notification;
        this.f47646b = i2;
    }

    /* renamed from: a */
    public int m73973a() {
        return this.f47646b;
    }

    /* renamed from: b */
    public Notification m73972b() {
        return this.f47647c;
    }

    /* renamed from: c */
    public int m73971c() {
        return this.f47645a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37428Yw1.class != obj.getClass()) {
            return false;
        }
        C37428Yw1 c37428Yw1 = (C37428Yw1) obj;
        if (this.f47645a != c37428Yw1.f47645a || this.f47646b != c37428Yw1.f47646b) {
            return false;
        }
        return this.f47647c.equals(c37428Yw1.f47647c);
    }

    public int hashCode() {
        return (((this.f47645a * 31) + this.f47646b) * 31) + this.f47647c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f47645a + ", mForegroundServiceType=" + this.f47646b + ", mNotification=" + this.f47647c + CoreConstants.CURLY_RIGHT;
    }
}
