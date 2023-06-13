package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LVN5;", "Lnu1;", "", "initialValue", "initialVelocity", DateTokenConverter.CONVERTER_KEY, "", "playTimeNanos", "e", "c", "b", "startVelocity", "f", "Ldu1;", C17296a.f69688o, "Ldu1;", "flingCalculator", "()F", "absVelocityThreshold", "Lg01;", "density", "<init>", "(Lg01;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VN5 */
/* loaded from: classes.dex */
public final class VN5 implements InterfaceC45958nu1 {

    /* renamed from: a */
    public final C40028du1 f39032a;

    public VN5(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f39032a = new C40028du1(WN5.m78508a(), density);
    }

    @Override // p000.InterfaceC45958nu1
    /* renamed from: a */
    public float mo22215a() {
        return 0.0f;
    }

    @Override // p000.InterfaceC45958nu1
    /* renamed from: b */
    public float mo22214b(long j, float f, float f2) {
        return this.f39032a.m43524d(f2).m43521b(j / 1000000);
    }

    @Override // p000.InterfaceC45958nu1
    /* renamed from: c */
    public long mo22213c(float f, float f2) {
        return this.f39032a.m43525c(f2) * 1000000;
    }

    @Override // p000.InterfaceC45958nu1
    /* renamed from: d */
    public float mo22212d(float f, float f2) {
        return f + m79909f(f2);
    }

    @Override // p000.InterfaceC45958nu1
    /* renamed from: e */
    public float mo22211e(long j, float f, float f2) {
        return f + this.f39032a.m43524d(f2).m43522a(j / 1000000);
    }

    /* renamed from: f */
    public final float m79909f(float f) {
        return this.f39032a.m43526b(f) * Math.signum(f);
    }
}
