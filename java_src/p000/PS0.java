package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LPS0;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "J", "b", "()J", DateTokenConverter.CONVERTER_KEY, "(J)V", "time", "", "F", "()F", "c", "(F)V", "dataPoint", "<init>", "(JF)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PS0 */
/* loaded from: classes.dex */
public final class PS0 {

    /* renamed from: a */
    public long f28504a;

    /* renamed from: b */
    public float f28505b;

    public PS0(long j, float f) {
        this.f28504a = j;
        this.f28505b = f;
    }

    /* renamed from: a */
    public final float m90245a() {
        return this.f28505b;
    }

    /* renamed from: b */
    public final long m90244b() {
        return this.f28504a;
    }

    /* renamed from: c */
    public final void m90243c(float f) {
        this.f28505b = f;
    }

    /* renamed from: d */
    public final void m90242d(long j) {
        this.f28504a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PS0) {
            PS0 ps0 = (PS0) obj;
            return this.f28504a == ps0.f28504a && Float.compare(this.f28505b, ps0.f28505b) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f28504a) * 31) + Float.hashCode(this.f28505b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f28504a + ", dataPoint=" + this.f28505b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
