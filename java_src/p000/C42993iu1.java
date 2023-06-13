package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010#J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017¨\u0006$"}, m28432d2 = {"Liu1;", "", "", "index", "", "c", "", "h", "x", "y", "z", "w", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "F", "e", "()F", "setX", "(F)V", "b", "f", "setY", "g", "setZ", DateTokenConverter.CONVERTER_KEY, "setW", "<init>", "(FFFF)V", "Lhu1;", "v", "(Lhu1;F)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: iu1  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42993iu1 {

    /* renamed from: a */
    public float f91665a;

    /* renamed from: b */
    public float f91666b;

    /* renamed from: c */
    public float f91667c;

    /* renamed from: d */
    public float f91668d;

    public C42993iu1() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C42993iu1 m31663b(C42993iu1 c42993iu1, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = c42993iu1.f91665a;
        }
        if ((i & 2) != 0) {
            f2 = c42993iu1.f91666b;
        }
        if ((i & 4) != 0) {
            f3 = c42993iu1.f91667c;
        }
        if ((i & 8) != 0) {
            f4 = c42993iu1.f91668d;
        }
        return c42993iu1.m31664a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final C42993iu1 m31664a(float f, float f2, float f3, float f4) {
        return new C42993iu1(f, f2, f3, f4);
    }

    /* renamed from: c */
    public final float m31662c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f91668d;
                    }
                    throw new IllegalArgumentException("index must be in 0..3");
                }
                return this.f91667c;
            }
            return this.f91666b;
        }
        return this.f91665a;
    }

    /* renamed from: d */
    public final float m31661d() {
        return this.f91668d;
    }

    /* renamed from: e */
    public final float m31660e() {
        return this.f91665a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42993iu1) {
            C42993iu1 c42993iu1 = (C42993iu1) obj;
            return Float.compare(this.f91665a, c42993iu1.f91665a) == 0 && Float.compare(this.f91666b, c42993iu1.f91666b) == 0 && Float.compare(this.f91667c, c42993iu1.f91667c) == 0 && Float.compare(this.f91668d, c42993iu1.f91668d) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final float m31659f() {
        return this.f91666b;
    }

    /* renamed from: g */
    public final float m31658g() {
        return this.f91667c;
    }

    /* renamed from: h */
    public final float[] m31657h() {
        return new float[]{this.f91665a, this.f91666b, this.f91667c, this.f91668d};
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f91665a) * 31) + Float.hashCode(this.f91666b)) * 31) + Float.hashCode(this.f91667c)) * 31) + Float.hashCode(this.f91668d);
    }

    public String toString() {
        return "Float4(x=" + this.f91665a + ", y=" + this.f91666b + ", z=" + this.f91667c + ", w=" + this.f91668d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C42993iu1(float f, float f2, float f3, float f4) {
        this.f91665a = f;
        this.f91666b = f2;
        this.f91667c = f3;
        this.f91668d = f4;
    }

    public /* synthetic */ C42993iu1(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42993iu1(C42400hu1 v, float f) {
        this(v.m35576g(), v.m35575h(), v.m35574i(), f);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public /* synthetic */ C42993iu1(C42400hu1 c42400hu1, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c42400hu1, (i & 2) != 0 ? 0.0f : f);
    }
}
