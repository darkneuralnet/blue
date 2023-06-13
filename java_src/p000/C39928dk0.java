package p000;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p003ui.platform.C11411h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\f8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"Lkotlin/Function0;", "", DateTokenConverter.CONVERTER_KEY, "(LEt0;I)Lkotlin/jvm/functions/Function0;", "Landroid/view/View;", "f", "", C17296a.f69688o, "J", "b", "()J", "TapIndicationDelay", "Lik2;", "g", "(Landroid/view/KeyEvent;)Z", "isPress", "c", "isClick", "e", "isEnter", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClickable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,74:1\n76#2:75\n*S KotlinDebug\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n*L\n36#1:75\n*E\n"})
/* renamed from: dk0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39928dk0 {

    /* renamed from: a */
    public static final long f77145a = ViewConfiguration.getTapTimeout();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: dk0$a */
    /* loaded from: classes.dex */
    public static final class C19850a extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ View f77146g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19850a(View view) {
            super(0);
            this.f77146g = view;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C39928dk0.m43820f(this.f77146g));
        }
    }

    /* renamed from: b */
    public static final long m43824b() {
        return f77145a;
    }

    /* renamed from: c */
    public static final boolean m43823c(KeyEvent isClick) {
        Intrinsics.checkNotNullParameter(isClick, "$this$isClick");
        if (C44673lk2.m26890e(C45266mk2.m25124b(isClick), C44673lk2.f96650a.m26888b()) && m43821e(isClick)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final Function0<Boolean> m43822d(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-1990508712);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1990508712, i, -1, "androidx.compose.foundation.isComposeRootInScrollableContainer (Clickable.android.kt:34)");
        }
        C19850a c19850a = new C19850a((View) interfaceC32720Et0.mo89572c(C11411h.m68320k()));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c19850a;
    }

    /* renamed from: e */
    public static final boolean m43821e(KeyEvent keyEvent) {
        int m77893b = C36853Wk2.m77893b(C45266mk2.m25125a(keyEvent));
        return m77893b == 23 || m77893b == 66 || m77893b == 160;
    }

    /* renamed from: f */
    public static final boolean m43820f(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m43819g(KeyEvent isPress) {
        Intrinsics.checkNotNullParameter(isPress, "$this$isPress");
        if (C44673lk2.m26890e(C45266mk2.m25124b(isPress), C44673lk2.f96650a.m26889a()) && m43821e(isPress)) {
            return true;
        }
        return false;
    }
}
