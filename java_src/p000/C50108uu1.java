package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Luu1;", "Lju1;", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "e", "c", "b", "playTime", "f", "", C17296a.f69688o, "I", "getDuration", "()I", "duration", "getDelay", "delay", "Lh91;", "Lh91;", "easing", "<init>", "(IILh91;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50108uu1 implements InterfaceC43586ju1 {

    /* renamed from: a */
    public final int f113175a;

    /* renamed from: b */
    public final int f113176b;

    /* renamed from: c */
    public final InterfaceC41956h91 f113177c;

    public C50108uu1() {
        this(0, 0, null, 7, null);
    }

    @Override // p000.InterfaceC43586ju1
    /* renamed from: b */
    public float mo9537b(long j, float f, float f2, float f3) {
        long m9534f = m9534f(j / 1000000);
        int i = (m9534f > 0L ? 1 : (m9534f == 0L ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (mo9535e(m9534f * 1000000, f, f2, f3) - mo9535e((m9534f - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // p000.InterfaceC43586ju1
    /* renamed from: c */
    public long mo9536c(float f, float f2, float f3) {
        return (this.f113176b + this.f113175a) * 1000000;
    }

    @Override // p000.InterfaceC43586ju1
    /* renamed from: e */
    public float mo9535e(long j, float f, float f2, float f3) {
        float f4;
        float coerceIn;
        long m9534f = m9534f(j / 1000000);
        int i = this.f113175a;
        if (i == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) m9534f) / i;
        }
        InterfaceC41956h91 interfaceC41956h91 = this.f113177c;
        coerceIn = RangesKt___RangesKt.coerceIn(f4, 0.0f, 1.0f);
        return C37082Xj6.m76514k(f, f2, interfaceC41956h91.mo34392a(coerceIn));
    }

    /* renamed from: f */
    public final long m9534f(long j) {
        long coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(j - this.f113176b, 0L, this.f113175a);
        return coerceIn;
    }

    public C50108uu1(int i, int i2, InterfaceC41956h91 easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.f113175a = i;
        this.f113176b = i2;
        this.f113177c = easing;
    }

    public /* synthetic */ C50108uu1(int i, int i2, InterfaceC41956h91 interfaceC41956h91, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C42549i91.m34395b() : interfaceC41956h91);
    }
}
