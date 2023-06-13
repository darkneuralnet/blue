package p000;

import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018\u0012\u0006\u0010#\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R/\u0010+\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u00100\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001f\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0004078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00108\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m28432d2 = {"LFd;", "Lvb5;", "LPv4;", "LiA0;", "", C17296a.f69688o, "LQ14;", "interaction", "LZC0;", Action.SCOPE_ATTRIBUTE, "b", DateTokenConverter.CONVERTER_KEY, "onRemembered", "onForgotten", "onAbandoned", "k", "h", "", "c", "Z", "bounded", "Lk61;", "F", "radius", "LsP5;", "Lpm0;", "e", "LsP5;", "color", "Lpb5;", "f", "rippleAlpha", "Landroidx/compose/material/ripple/RippleContainer;", "g", "Landroidx/compose/material/ripple/RippleContainer;", "rippleContainer", "Landroidx/compose/material/ripple/RippleHostView;", "<set-?>", "LEX2;", "j", "()Landroidx/compose/material/ripple/RippleHostView;", "m", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView", "i", "()Z", "l", "(Z)V", "invalidateTick", "LxB5;", "J", "rippleSize", "", "I", "rippleRadius", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onInvalidateRipple", "<init>", "(ZFLsP5;LsP5;Landroidx/compose/material/ripple/RippleContainer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,253:1\n76#2:254\n102#2,2:255\n76#2:257\n102#2,2:258\n138#3:260\n245#4:261\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n139#1:254\n139#1:255,2\n147#1:257\n147#1:258,2\n172#1:260\n186#1:261\n*E\n"})
/* renamed from: Fd */
/* loaded from: classes.dex */
public final class C2364Fd extends AbstractC50514vb5 implements InterfaceC35316Pv4 {

    /* renamed from: c */
    public final boolean f9786c;

    /* renamed from: d */
    public final float f9787d;

    /* renamed from: e */
    public final InterfaceC48627sP5<C47063pm0> f9788e;

    /* renamed from: f */
    public final InterfaceC48627sP5<C46958pb5> f9789f;

    /* renamed from: g */
    public final RippleContainer f9790g;

    /* renamed from: h */
    public final EX2 f9791h;

    /* renamed from: i */
    public final EX2 f9792i;

    /* renamed from: j */
    public long f9793j;

    /* renamed from: k */
    public int f9794k;

    /* renamed from: l */
    public final Function0<Unit> f9795l;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fd$a */
    /* loaded from: classes.dex */
    public static final class C2365a extends Lambda implements Function0<Unit> {
        public C2365a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C2364Fd c2364Fd = C2364Fd.this;
            c2364Fd.m106876l(!c2364Fd.m106879i());
        }
    }

    public /* synthetic */ C2364Fd(boolean z, float f, InterfaceC48627sP5 interfaceC48627sP5, InterfaceC48627sP5 interfaceC48627sP52, RippleContainer rippleContainer, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, interfaceC48627sP5, interfaceC48627sP52, rippleContainer);
    }

    @Override // p000.InterfaceC52549z12
    /* renamed from: a */
    public void mo2014a(InterfaceC42558iA0 interfaceC42558iA0) {
        int mo3416F0;
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        this.f9793j = interfaceC42558iA0.mo96360h();
        if (Float.isNaN(this.f9787d)) {
            mo3416F0 = MathKt__MathJVMKt.roundToInt(C48144rb5.m15716a(interfaceC42558iA0, this.f9786c, interfaceC42558iA0.mo96360h()));
        } else {
            mo3416F0 = interfaceC42558iA0.mo3416F0(this.f9787d);
        }
        this.f9794k = mo3416F0;
        long m18733w = this.f9788e.getValue().m18733w();
        float m19084d = this.f9789f.getValue().m19084d();
        interfaceC42558iA0.mo34387n0();
        m8395c(interfaceC42558iA0, this.f9787d, m18733w);
        InterfaceC45204me0 mo20724a = interfaceC42558iA0.mo20750d0().mo20724a();
        m106879i();
        RippleHostView m106878j = m106878j();
        if (m106878j != null) {
            m106878j.m68877h(interfaceC42558iA0.mo96360h(), this.f9794k, m18733w, m19084d);
            m106878j.draw(C12455bc.m64279c(mo20724a));
        }
    }

    @Override // p000.AbstractC50514vb5
    /* renamed from: b */
    public void mo8396b(Q14 interaction, ZC0 scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        RippleHostView m68885b = this.f9790g.m68885b(this);
        m68885b.m68883b(interaction, this.f9786c, this.f9793j, this.f9794k, this.f9788e.getValue().m18733w(), this.f9789f.getValue().m19084d(), this.f9795l);
        m106875m(m68885b);
    }

    @Override // p000.AbstractC50514vb5
    /* renamed from: d */
    public void mo8394d(Q14 interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        RippleHostView m106878j = m106878j();
        if (m106878j != null) {
            m106878j.m68880e();
        }
    }

    /* renamed from: h */
    public final void m106880h() {
        this.f9790g.m68886a(this);
    }

    /* renamed from: i */
    public final boolean m106879i() {
        return ((Boolean) this.f9792i.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final RippleHostView m106878j() {
        return (RippleHostView) this.f9791h.getValue();
    }

    /* renamed from: k */
    public final void m106877k() {
        m106875m(null);
    }

    /* renamed from: l */
    public final void m106876l(boolean z) {
        this.f9792i.setValue(Boolean.valueOf(z));
    }

    /* renamed from: m */
    public final void m106875m(RippleHostView rippleHostView) {
        this.f9791h.setValue(rippleHostView);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
        m106880h();
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        m106880h();
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
    }

    public C2364Fd(boolean z, float f, InterfaceC48627sP5<C47063pm0> interfaceC48627sP5, InterfaceC48627sP5<C46958pb5> interfaceC48627sP52, RippleContainer rippleContainer) {
        super(z, interfaceC48627sP52);
        EX2 m97025e;
        EX2 m97025e2;
        this.f9786c = z;
        this.f9787d = f;
        this.f9788e = interfaceC48627sP5;
        this.f9789f = interfaceC48627sP52;
        this.f9790g = rippleContainer;
        m97025e = LM5.m97025e(null, null, 2, null);
        this.f9791h = m97025e;
        m97025e2 = LM5.m97025e(Boolean.TRUE, null, 2, null);
        this.f9792i = m97025e2;
        this.f9793j = C51465xB5.f117175b.m5723b();
        this.f9794k = -1;
        this.f9795l = new C2365a();
    }
}
