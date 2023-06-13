package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0015"}, m28432d2 = {"LG32;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", C17296a.f69688o, "I", "b", "()I", "left", DateTokenConverter.CONVERTER_KEY, "top", "c", "right", "bottom", "<init>", "(IIII)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G32 */
/* loaded from: classes.dex */
public final class G32 {

    /* renamed from: a */
    public final int f10846a;

    /* renamed from: b */
    public final int f10847b;

    /* renamed from: c */
    public final int f10848c;

    /* renamed from: d */
    public final int f10849d;

    public G32(int i, int i2, int i3, int i4) {
        this.f10846a = i;
        this.f10847b = i2;
        this.f10848c = i3;
        this.f10849d = i4;
    }

    /* renamed from: a */
    public final int m105888a() {
        return this.f10849d;
    }

    /* renamed from: b */
    public final int m105887b() {
        return this.f10846a;
    }

    /* renamed from: c */
    public final int m105886c() {
        return this.f10848c;
    }

    /* renamed from: d */
    public final int m105885d() {
        return this.f10847b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G32)) {
            return false;
        }
        G32 g32 = (G32) obj;
        if (this.f10846a == g32.f10846a && this.f10847b == g32.f10847b && this.f10848c == g32.f10848c && this.f10849d == g32.f10849d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f10846a * 31) + this.f10847b) * 31) + this.f10848c) * 31) + this.f10849d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f10846a + ", top=" + this.f10847b + ", right=" + this.f10848c + ", bottom=" + this.f10849d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
