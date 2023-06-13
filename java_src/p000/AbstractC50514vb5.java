package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lvb5;", "Lz12;", "LQ14;", "interaction", "LZC0;", Action.SCOPE_ATTRIBUTE, "", "b", DateTokenConverter.CONVERTER_KEY, "Ld62;", "e", "(Ld62;LZC0;)V", "LI61;", "Lk61;", "radius", "Lpm0;", "color", "c", "(LI61;FJ)V", "LxP5;", "LxP5;", "stateLayer", "", "bounded", "LsP5;", "Lpb5;", "rippleAlpha", "<init>", "(ZLsP5;)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50514vb5 implements InterfaceC52549z12 {

    /* renamed from: b */
    public final C51591xP5 f114380b;

    public AbstractC50514vb5(boolean z, InterfaceC48627sP5<C46958pb5> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f114380b = new C51591xP5(z, rippleAlpha);
    }

    /* renamed from: b */
    public abstract void mo8396b(Q14 q14, ZC0 zc0);

    /* renamed from: c */
    public final void m8395c(I61 drawStateLayer, float f, long j) {
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        this.f114380b.m5292b(drawStateLayer, f, j);
    }

    /* renamed from: d */
    public abstract void mo8394d(Q14 q14);

    /* renamed from: e */
    public final void m8393e(InterfaceC39556d62 interaction, ZC0 scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f114380b.m5291c(interaction, scope);
    }
}
