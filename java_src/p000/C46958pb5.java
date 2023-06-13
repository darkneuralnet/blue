package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lpb5;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", C17296a.f69688o, "F", "()F", "draggedAlpha", "b", "focusedAlpha", "c", "hoveredAlpha", DateTokenConverter.CONVERTER_KEY, "pressedAlpha", "<init>", "(FFFF)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46958pb5 {

    /* renamed from: a */
    public final float f103833a;

    /* renamed from: b */
    public final float f103834b;

    /* renamed from: c */
    public final float f103835c;

    /* renamed from: d */
    public final float f103836d;

    public C46958pb5(float f, float f2, float f3, float f4) {
        this.f103833a = f;
        this.f103834b = f2;
        this.f103835c = f3;
        this.f103836d = f4;
    }

    /* renamed from: a */
    public final float m19087a() {
        return this.f103833a;
    }

    /* renamed from: b */
    public final float m19086b() {
        return this.f103834b;
    }

    /* renamed from: c */
    public final float m19085c() {
        return this.f103835c;
    }

    /* renamed from: d */
    public final float m19084d() {
        return this.f103836d;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46958pb5)) {
            return false;
        }
        C46958pb5 c46958pb5 = (C46958pb5) obj;
        if (this.f103833a == c46958pb5.f103833a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f103834b == c46958pb5.f103834b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f103835c == c46958pb5.f103835c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f103836d == c46958pb5.f103836d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f103833a) * 31) + Float.hashCode(this.f103834b)) * 31) + Float.hashCode(this.f103835c)) * 31) + Float.hashCode(this.f103836d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f103833a + ", focusedAlpha=" + this.f103834b + ", hoveredAlpha=" + this.f103835c + ", pressedAlpha=" + this.f103836d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
