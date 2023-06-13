package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.p003ui.platform.C11411h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"LbW3;", "Lob5;", "Le62;", "interactionSource", "", "bounded", "Lk61;", "radius", "LsP5;", "Lpm0;", "color", "Lpb5;", "rippleAlpha", "Lvb5;", "b", "(Le62;ZFLsP5;LsP5;LEt0;I)Lvb5;", "Landroid/view/ViewGroup;", "c", "(LEt0;I)Landroid/view/ViewGroup;", "<init>", "(ZFLsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,253:1\n50#2:254\n49#2:255\n67#2,3:262\n66#2:265\n1057#3,6:256\n1057#3,6:266\n76#4:272\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n68#1:254\n68#1:255\n91#1:262,3\n91#1:265\n68#1:256,6\n91#1:266,6\n106#1:272\n*E\n"})
/* renamed from: bW3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38591bW3 extends AbstractC46365ob5 {
    public /* synthetic */ C38591bW3(boolean z, float f, InterfaceC48627sP5 interfaceC48627sP5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, interfaceC48627sP5);
    }

    @Override // p000.AbstractC46365ob5
    /* renamed from: b */
    public AbstractC50514vb5 mo20803b(InterfaceC40148e62 interactionSource, boolean z, float f, InterfaceC48627sP5<C47063pm0> color, InterfaceC48627sP5<C46958pb5> rippleAlpha, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        View view;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        interfaceC32720Et0.mo89638F(331259447);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(331259447, i, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:57)");
        }
        ViewGroup m64493c = m64493c(interfaceC32720Et0, (i >> 15) & 14);
        interfaceC32720Et0.mo89638F(1643267286);
        if (m64493c.isInEditMode()) {
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(interactionSource) | interfaceC32720Et0.mo89539n(this);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C31748Ap0(z, f, color, rippleAlpha, null);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            C31748Ap0 c31748Ap0 = (C31748Ap0) mo89635G;
            interfaceC32720Et0.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return c31748Ap0;
        }
        interfaceC32720Et0.mo89605Q();
        int childCount = m64493c.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 < childCount) {
                view = m64493c.getChildAt(i2);
                if (view instanceof RippleContainer) {
                    break;
                }
                i2++;
            } else {
                view = null;
                break;
            }
        }
        if (view == null) {
            Context context = m64493c.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            view = new RippleContainer(context);
            m64493c.addView(view);
        }
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(interactionSource) | interfaceC32720Et0.mo89539n(this) | interfaceC32720Et0.mo89539n(view);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C2364Fd(z, f, color, rippleAlpha, (RippleContainer) view, null);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        C2364Fd c2364Fd = (C2364Fd) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c2364Fd;
    }

    /* renamed from: c */
    public final ViewGroup m64493c(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-1737891121);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1737891121, i, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:104)");
        }
        Object mo89572c = interfaceC32720Et0.mo89572c(C11411h.m68320k());
        while (!(mo89572c instanceof ViewGroup)) {
            ViewParent parent = ((View) mo89572c).getParent();
            if (parent instanceof View) {
                Intrinsics.checkNotNullExpressionValue(parent, "parent");
                mo89572c = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + mo89572c + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) mo89572c;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return viewGroup;
    }

    public C38591bW3(boolean z, float f, InterfaceC48627sP5<C47063pm0> interfaceC48627sP5) {
        super(z, f, interfaceC48627sP5, null);
    }
}
