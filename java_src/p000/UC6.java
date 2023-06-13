package p000;

import androidx.work.C12124b;
import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* renamed from: UC6 */
/* loaded from: classes.dex */
public final class UC6 {

    /* renamed from: a */
    public UUID f36987a;

    /* renamed from: b */
    public EnumC8214a f36988b;

    /* renamed from: c */
    public C12124b f36989c;

    /* renamed from: d */
    public Set<String> f36990d;

    /* renamed from: e */
    public C12124b f36991e;

    /* renamed from: f */
    public int f36992f;

    /* renamed from: g */
    public final int f36993g;

    /* renamed from: UC6$a */
    /* loaded from: classes.dex */
    public enum EnumC8214a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: b */
        public boolean m81823b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public UC6(UUID uuid, EnumC8214a enumC8214a, C12124b c12124b, List<String> list, C12124b c12124b2, int i, int i2) {
        this.f36987a = uuid;
        this.f36988b = enumC8214a;
        this.f36989c = c12124b;
        this.f36990d = new HashSet(list);
        this.f36991e = c12124b2;
        this.f36992f = i;
        this.f36993g = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UC6.class != obj.getClass()) {
            return false;
        }
        UC6 uc6 = (UC6) obj;
        if (this.f36992f != uc6.f36992f || this.f36993g != uc6.f36993g || !this.f36987a.equals(uc6.f36987a) || this.f36988b != uc6.f36988b || !this.f36989c.equals(uc6.f36989c) || !this.f36990d.equals(uc6.f36990d)) {
            return false;
        }
        return this.f36991e.equals(uc6.f36991e);
    }

    public int hashCode() {
        return (((((((((((this.f36987a.hashCode() * 31) + this.f36988b.hashCode()) * 31) + this.f36989c.hashCode()) * 31) + this.f36990d.hashCode()) * 31) + this.f36991e.hashCode()) * 31) + this.f36992f) * 31) + this.f36993g;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f36987a + CoreConstants.SINGLE_QUOTE_CHAR + ", mState=" + this.f36988b + ", mOutputData=" + this.f36989c + ", mTags=" + this.f36990d + ", mProgress=" + this.f36991e + CoreConstants.CURLY_RIGHT;
    }
}
