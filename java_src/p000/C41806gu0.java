package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a9\u0010\r\u001a\u00020\u000b2\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"T", "LEM5;", "policy", "Lkotlin/Function0;", "defaultFactory", "LU94;", "b", DateTokenConverter.CONVERTER_KEY, "", "LW94;", "values", "", "content", C17296a.f69688o, "([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,255:1\n125#2:256\n152#2,3:257\n37#3,2:260\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n250#1:256\n250#1:257,3\n251#1:260,2\n*E\n"})
/* renamed from: gu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41806gu0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gu0$a */
    /* loaded from: classes.dex */
    public static final class C22504a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ W94<?>[] f84417g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f84418h;

        /* renamed from: i */
        public final /* synthetic */ int f84419i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22504a(W94<?>[] w94Arr, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f84417g = w94Arr;
            this.f84418h = function2;
            this.f84419i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            W94<?>[] w94Arr = this.f84417g;
            C41806gu0.m37353a((W94[]) Arrays.copyOf(w94Arr, w94Arr.length), this.f84418h, interfaceC32720Et0, C47127ps4.m18626a(this.f84419i | 1));
        }
    }

    /* renamed from: a */
    public static final void m37353a(W94<?>[] values, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1390796515);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        mo89518u.mo89653A(values);
        content.invoke(mo89518u, Integer.valueOf((i >> 3) & 14));
        mo89518u.mo89614N();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C22504a(values, content, i));
        }
    }

    /* renamed from: b */
    public static final <T> U94<T> m37352b(EM5<T> policy, Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new B81(policy, defaultFactory);
    }

    /* renamed from: c */
    public static /* synthetic */ U94 m37351c(EM5 em5, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            em5 = GM5.m105191p();
        }
        return m37352b(em5, function0);
    }

    /* renamed from: d */
    public static final <T> U94<T> m37350d(Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new C43300jQ5(defaultFactory);
    }
}
