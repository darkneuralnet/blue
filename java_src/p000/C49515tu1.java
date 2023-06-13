package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Ltu1;", "Lju1;", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "e", "b", DateTokenConverter.CONVERTER_KEY, "c", C17296a.f69688o, "F", "getDampingRatio", "()F", "dampingRatio", "getStiffness", "stiffness", "visibilityThreshold", "LhO5;", "LhO5;", "spring", "<init>", "(FFF)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49515tu1 implements InterfaceC43586ju1 {

    /* renamed from: a */
    public final float f111355a;

    /* renamed from: b */
    public final float f111356b;

    /* renamed from: c */
    public final float f111357c;

    /* renamed from: d */
    public final C42096hO5 f111358d;

    public C49515tu1() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // p000.InterfaceC43586ju1
    /* renamed from: b */
    public float mo9537b(long j, float f, float f2, float f3) {
        this.f111358d.m36465e(f2);
        return MV2.m95279c(this.f111358d.m36463g(f, f3, j / 1000000));
    }

    @Override // p000.InterfaceC43586ju1
    /* renamed from: c */
    public long mo9536c(float f, float f2, float f3) {
        float m36468b = this.f111358d.m36468b();
        float m36469a = this.f111358d.m36469a();
        float f4 = f - f2;
        float f5 = this.f111357c;
        return C40910fO5.m41452b(m36468b, m36469a, f3 / f5, f4 / f5, 1.0f) * 1000000;
    }

    @Override // p000.InterfaceC43586ju1
    /* renamed from: d */
    public float mo11251d(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // p000.InterfaceC43586ju1
    /* renamed from: e */
    public float mo9535e(long j, float f, float f2, float f3) {
        this.f111358d.m36465e(f2);
        return MV2.m95280b(this.f111358d.m36463g(f, f3, j / 1000000));
    }

    public C49515tu1(float f, float f2, float f3) {
        this.f111355a = f;
        this.f111356b = f2;
        this.f111357c = f3;
        C42096hO5 c42096hO5 = new C42096hO5(1.0f);
        c42096hO5.m36466d(f);
        c42096hO5.m36464f(f2);
        this.f111358d = c42096hO5;
    }

    public /* synthetic */ C49515tu1(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }
}
