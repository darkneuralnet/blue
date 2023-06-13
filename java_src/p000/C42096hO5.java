package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0011J0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0002R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R*\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u001d\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"LhO5;", "", "", "lastDisplacement", "lastVelocity", "", "timeElapsed", "LMV2;", "g", "(FFJ)J", "", "c", C17296a.f69688o, "F", "getFinalPosition", "()F", "e", "(F)V", "finalPosition", "", "b", "D", "naturalFreq", "", "Z", "initialized", DateTokenConverter.CONVERTER_KEY, "gammaPlus", "gammaMinus", "f", "dampedFreq", "value", "dampingRatio", "stiffness", "<init>", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42096hO5 {

    /* renamed from: a */
    public float f85139a;

    /* renamed from: c */
    public boolean f85141c;

    /* renamed from: d */
    public double f85142d;

    /* renamed from: e */
    public double f85143e;

    /* renamed from: f */
    public double f85144f;

    /* renamed from: b */
    public double f85140b = Math.sqrt(50.0d);

    /* renamed from: g */
    public float f85145g = 1.0f;

    public C42096hO5(float f) {
        this.f85139a = f;
    }

    /* renamed from: a */
    public final float m36469a() {
        return this.f85145g;
    }

    /* renamed from: b */
    public final float m36468b() {
        double d = this.f85140b;
        return (float) (d * d);
    }

    /* renamed from: c */
    public final void m36467c() {
        boolean z;
        if (this.f85141c) {
            return;
        }
        if (this.f85139a == C42689iO5.m34029b()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float f = this.f85145g;
            double d = f * f;
            if (f > 1.0f) {
                double d2 = this.f85140b;
                double d3 = d - 1;
                this.f85142d = ((-f) * d2) + (d2 * Math.sqrt(d3));
                double d4 = this.f85140b;
                this.f85143e = ((-this.f85145g) * d4) - (d4 * Math.sqrt(d3));
            } else if (f >= 0.0f && f < 1.0f) {
                this.f85144f = this.f85140b * Math.sqrt(1 - d);
            }
            this.f85141c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: d */
    public final void m36466d(float f) {
        if (f >= 0.0f) {
            this.f85145g = f;
            this.f85141c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public final void m36465e(float f) {
        this.f85139a = f;
    }

    /* renamed from: f */
    public final void m36464f(float f) {
        if (m36468b() > 0.0f) {
            this.f85140b = Math.sqrt(f);
            this.f85141c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: g */
    public final long m36463g(float f, float f2, long j) {
        boolean z;
        float f3;
        double cos;
        double d;
        m36467c();
        float f4 = f - this.f85139a;
        double d2 = j / 1000.0d;
        float f5 = this.f85145g;
        if (f5 > 1.0f) {
            double d3 = f4;
            double d4 = this.f85143e;
            double d5 = f2;
            double d6 = this.f85142d;
            double d7 = d3 - (((d4 * d3) - d5) / (d4 - d6));
            double d8 = ((d3 * d4) - d5) / (d4 - d6);
            d = (Math.exp(d4 * d2) * d7) + (Math.exp(this.f85142d * d2) * d8);
            double d9 = this.f85143e;
            double exp = d7 * d9 * Math.exp(d9 * d2);
            double d10 = this.f85142d;
            cos = exp + (d8 * d10 * Math.exp(d10 * d2));
        } else {
            if (f5 == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                double d11 = this.f85140b;
                double d12 = f4;
                double d13 = f2 + (d11 * d12);
                double d14 = d12 + (d13 * d2);
                double exp2 = Math.exp((-d11) * d2) * d14;
                double exp3 = d14 * Math.exp((-this.f85140b) * d2);
                double d15 = this.f85140b;
                cos = (exp3 * (-d15)) + (d13 * Math.exp((-d15) * d2));
                d = exp2;
            } else {
                double d16 = this.f85140b;
                double d17 = f4;
                double d18 = (1 / this.f85144f) * ((f5 * d16 * d17) + f2);
                double exp4 = Math.exp((-f5) * d16 * d2) * ((Math.cos(this.f85144f * d2) * d17) + (Math.sin(this.f85144f * d2) * d18));
                double d19 = this.f85140b;
                double d20 = (-d19) * exp4 * this.f85145g;
                double exp5 = Math.exp((-f3) * d19 * d2);
                double d21 = this.f85144f;
                double sin = (-d21) * d17 * Math.sin(d21 * d2);
                double d22 = this.f85144f;
                cos = d20 + (exp5 * (sin + (d18 * d22 * Math.cos(d22 * d2))));
                d = exp4;
            }
        }
        return C42689iO5.m34030a((float) (d + this.f85139a), (float) cos);
    }
}
