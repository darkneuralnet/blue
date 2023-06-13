package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LL16;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", C17296a.f69688o, "F", "b", "()F", "scaleX", "c", "skewX", "<init>", "(FF)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: L16 */
/* loaded from: classes.dex */
public final class L16 {

    /* renamed from: c */
    public static final C4691a f20613c = new C4691a(null);

    /* renamed from: d */
    public static final L16 f20614d = new L16(1.0f, 0.0f);

    /* renamed from: a */
    public final float f20615a;

    /* renamed from: b */
    public final float f20616b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LL16$a;", "", "LL16;", "None", "LL16;", C17296a.f69688o, "()LL16;", "getNone$ui_text_release$annotations", "()V", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: L16$a */
    /* loaded from: classes.dex */
    public static final class C4691a {
        public /* synthetic */ C4691a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final L16 m97918a() {
            return L16.f20614d;
        }

        private C4691a() {
        }
    }

    public L16() {
        this(0.0f, 0.0f, 3, null);
    }

    /* renamed from: b */
    public final float m97920b() {
        return this.f20615a;
    }

    /* renamed from: c */
    public final float m97919c() {
        return this.f20616b;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L16)) {
            return false;
        }
        L16 l16 = (L16) obj;
        if (this.f20615a == l16.f20615a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f20616b == l16.f20616b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f20615a) * 31) + Float.hashCode(this.f20616b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f20615a + ", skewX=" + this.f20616b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public L16(float f, float f2) {
        this.f20615a = f;
        this.f20616b = f2;
    }

    public /* synthetic */ L16(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
