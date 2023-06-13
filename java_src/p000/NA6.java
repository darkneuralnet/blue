package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LNA6;", "", "", "c", "()[F", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "()F", "x", "b", "y", "<init>", "(FF)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NA6 */
/* loaded from: classes.dex */
public final class NA6 {

    /* renamed from: a */
    public final float f24237a;

    /* renamed from: b */
    public final float f24238b;

    public NA6(float f, float f2) {
        this.f24237a = f;
        this.f24238b = f2;
    }

    /* renamed from: a */
    public final float m94262a() {
        return this.f24237a;
    }

    /* renamed from: b */
    public final float m94261b() {
        return this.f24238b;
    }

    /* renamed from: c */
    public final float[] m94260c() {
        float f = this.f24237a;
        float f2 = this.f24238b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NA6) {
            NA6 na6 = (NA6) obj;
            return Float.compare(this.f24237a, na6.f24237a) == 0 && Float.compare(this.f24238b, na6.f24238b) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f24237a) * 31) + Float.hashCode(this.f24238b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f24237a + ", y=" + this.f24238b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
