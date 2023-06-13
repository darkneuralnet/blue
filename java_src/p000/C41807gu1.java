package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, m28432d2 = {"Lgu1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "()F", "setX", "(F)V", "x", "b", "setY", "y", "<init>", "(FF)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: gu1  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41807gu1 {

    /* renamed from: a */
    public float f84420a;

    /* renamed from: b */
    public float f84421b;

    public C41807gu1() {
        this(0.0f, 0.0f, 3, null);
    }

    /* renamed from: a */
    public final float m37349a() {
        return this.f84420a;
    }

    /* renamed from: b */
    public final float m37348b() {
        return this.f84421b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41807gu1) {
            C41807gu1 c41807gu1 = (C41807gu1) obj;
            return Float.compare(this.f84420a, c41807gu1.f84420a) == 0 && Float.compare(this.f84421b, c41807gu1.f84421b) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f84420a) * 31) + Float.hashCode(this.f84421b);
    }

    public String toString() {
        return "Float2(x=" + this.f84420a + ", y=" + this.f84421b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C41807gu1(float f, float f2) {
        this.f84420a = f;
        this.f84421b = f2;
    }

    public /* synthetic */ C41807gu1(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
