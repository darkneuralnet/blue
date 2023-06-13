package p000;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.C43497jl2;
@Metadata(m28433d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0019\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0007\u001aC\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, m28432d2 = {"T", "Lvf;", "V", "Lwb6;", MessageExtension.FIELD_DATA, "b", "(Lwb6;Ljava/lang/Object;)Lvf;", "", "durationMillis", "delayMillis", "Lh91;", "easing", "Ltb6;", "j", "", "dampingRatio", "stiffness", "visibilityThreshold", "LjO5;", "h", "(FFLjava/lang/Object;)LjO5;", "Lkotlin/Function1;", "Ljl2$b;", "", "Lkotlin/ExtensionFunctionType;", "init", "Ljl2;", "e", "Lh81;", "animation", "LeG4;", "repeatMode", "LKO5;", "initialStartOffset", "LI12;", "c", "(Lh81;LeG4;J)LI12;", "LnM5;", "f", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: mf */
/* loaded from: classes.dex */
public final class C26160mf {
    /* renamed from: b */
    public static final <T, V extends AbstractC29607vf> V m25228b(InterfaceC51108wb6<T, V> interfaceC51108wb6, T t) {
        if (t == null) {
            return null;
        }
        return interfaceC51108wb6.mo4960a().invoke(t);
    }

    /* renamed from: c */
    public static final <T> I12<T> m25227c(InterfaceC41946h81<T> animation, EnumC40244eG4 repeatMode, long j) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        return new I12<>(animation, repeatMode, j, null);
    }

    /* renamed from: d */
    public static /* synthetic */ I12 m25226d(InterfaceC41946h81 interfaceC41946h81, EnumC40244eG4 enumC40244eG4, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC40244eG4 = EnumC40244eG4.Restart;
        }
        if ((i & 4) != 0) {
            j = KO5.m98919c(0, 0, 2, null);
        }
        return m25227c(interfaceC41946h81, enumC40244eG4, j);
    }

    /* renamed from: e */
    public static final <T> C43497jl2<T> m25225e(Function1<? super C43497jl2.C25006b<T>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        C43497jl2.C25006b c25006b = new C43497jl2.C25006b();
        init.invoke(c25006b);
        return new C43497jl2<>(c25006b);
    }

    /* renamed from: f */
    public static final <T> C45636nM5<T> m25224f(int i) {
        return new C45636nM5<>(i);
    }

    /* renamed from: g */
    public static /* synthetic */ C45636nM5 m25223g(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m25224f(i);
    }

    /* renamed from: h */
    public static final <T> C43282jO5<T> m25222h(float f, float f2, T t) {
        return new C43282jO5<>(f, f2, t);
    }

    /* renamed from: i */
    public static /* synthetic */ C43282jO5 m25221i(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return m25222h(f, f2, obj);
    }

    /* renamed from: j */
    public static final <T> C49330tb6<T> m25220j(int i, int i2, InterfaceC41956h91 easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        return new C49330tb6<>(i, i2, easing);
    }

    /* renamed from: k */
    public static /* synthetic */ C49330tb6 m25219k(int i, int i2, InterfaceC41956h91 interfaceC41956h91, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            interfaceC41956h91 = C42549i91.m34395b();
        }
        return m25220j(i, i2, interfaceC41956h91);
    }
}
