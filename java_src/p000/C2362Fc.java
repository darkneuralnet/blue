package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LFc;", "", "", "time", "LFc$a;", "b", "velocity", "friction", "", C17296a.f69688o, "", "[F", "SplinePositions", "c", "SplineTimes", "<init>", "()V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fc */
/* loaded from: classes.dex */
public final class C2362Fc {

    /* renamed from: a */
    public static final C2362Fc f9754a = new C2362Fc();

    /* renamed from: b */
    public static final float[] f9755b;

    /* renamed from: c */
    public static final float[] f9756c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, m28432d2 = {"LFc$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "()F", "distanceCoefficient", "b", "velocityCoefficient", "<init>", "(FF)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fc$a */
    /* loaded from: classes.dex */
    public static final class C2363a {

        /* renamed from: a */
        public final float f9757a;

        /* renamed from: b */
        public final float f9758b;

        public C2363a(float f, float f2) {
            this.f9757a = f;
            this.f9758b = f2;
        }

        /* renamed from: a */
        public final float m106911a() {
            return this.f9757a;
        }

        /* renamed from: b */
        public final float m106910b() {
            return this.f9758b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2363a) {
                C2363a c2363a = (C2363a) obj;
                return Float.compare(this.f9757a, c2363a.f9757a) == 0 && Float.compare(this.f9758b, c2363a.f9758b) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f9757a) * 31) + Float.hashCode(this.f9758b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f9757a + ", velocityCoefficient=" + this.f9758b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        float[] fArr = new float[101];
        f9755b = fArr;
        float[] fArr2 = new float[101];
        f9756c = fArr2;
        UN5.m81570b(fArr, fArr2, 100);
    }

    private C2362Fc() {
    }

    /* renamed from: a */
    public final double m106913a(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    /* renamed from: b */
    public final C2363a m106912b(float f) {
        float f2;
        float f3;
        float f4 = 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = f9755b;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new C2363a(f2, f3);
    }
}
