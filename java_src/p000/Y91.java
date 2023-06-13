package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\u000b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aF\u0010\u0011\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0017\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0013¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u0019\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0013¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aY\u0010\u001b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0013¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aS\u0010\u001f\u001a\u00020\u00012\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u001d\"\u0004\u0018\u00010\u00052'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0013¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0018\u0010%\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001\"\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m28432d2 = {"Lkotlin/Function0;", "", "effect", "h", "(Lkotlin/jvm/functions/Function0;LEt0;I)V", "", "key1", "Lkotlin/Function1;", "Lm51;", "Ll51;", "Lkotlin/ExtensionFunctionType;", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V", "key3", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V", "Lkotlin/Function2;", "LZC0;", "Lkotlin/coroutines/Continuation;", "block", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V", "", UserMetadata.KEYDATA_FILENAME, "g", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "LEt0;", "composer", "j", "Lm51;", "InternalDisposableEffectScope", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n36#2:485\n50#2:492\n49#2:493\n67#2,3:500\n66#2:503\n83#2,3:510\n36#2:519\n50#2:526\n49#2:527\n67#2,3:534\n66#2:537\n83#2,3:544\n25#2:553\n1114#3,6:486\n1114#3,6:494\n1114#3,6:504\n1114#3,6:513\n1114#3,6:520\n1114#3,6:528\n1114#3,6:538\n1114#3,6:547\n1114#3,6:554\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n155#1:485\n195#1:492\n195#1:493\n236#1:500,3\n236#1:503\n276#1:510,3\n337#1:519\n360#1:526\n360#1:527\n384#1:534,3\n384#1:537\n407#1:544,3\n477#1:553\n155#1:486,6\n195#1:494,6\n236#1:504,6\n276#1:513,6\n337#1:520,6\n360#1:528,6\n384#1:538,6\n407#1:547,6\n477#1:554,6\n*E\n"})
/* renamed from: Y91 */
/* loaded from: classes.dex */
public final class Y91 {

    /* renamed from: a */
    public static final C44881m51 f44702a = new C44881m51();

    /* renamed from: a */
    public static final void m75538a(Object obj, Object obj2, Object obj3, Function1<? super C44881m51, ? extends InterfaceC44288l51> effect, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        interfaceC32720Et0.mo89638F(-1239538271);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:229)");
        }
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n = interfaceC32720Et0.mo89539n(obj) | interfaceC32720Et0.mo89539n(obj2) | interfaceC32720Et0.mo89539n(obj3);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            interfaceC32720Et0.mo89503z(new C43695k51(effect));
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    /* renamed from: b */
    public static final void m75537b(Object obj, Object obj2, Function1<? super C44881m51, ? extends InterfaceC44288l51> effect, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        interfaceC32720Et0.mo89638F(1429097729);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:189)");
        }
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(obj) | interfaceC32720Et0.mo89539n(obj2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            interfaceC32720Et0.mo89503z(new C43695k51(effect));
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    /* renamed from: c */
    public static final void m75536c(Object obj, Function1<? super C44881m51, ? extends InterfaceC44288l51> effect, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        interfaceC32720Et0.mo89638F(-1371986847);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:150)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(obj);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            interfaceC32720Et0.mo89503z(new C43695k51(effect));
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    /* renamed from: d */
    public static final void m75535d(Object obj, Object obj2, Object obj3, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(block, "block");
        interfaceC32720Et0.mo89638F(-54093371);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        CoroutineContext mo89506y = interfaceC32720Et0.mo89506y();
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n = interfaceC32720Et0.mo89539n(obj) | interfaceC32720Et0.mo89539n(obj2) | interfaceC32720Et0.mo89539n(obj3);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            interfaceC32720Et0.mo89503z(new C40542em2(mo89506y, block));
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    /* renamed from: e */
    public static final void m75534e(Object obj, Object obj2, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(block, "block");
        interfaceC32720Et0.mo89638F(590241125);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:353)");
        }
        CoroutineContext mo89506y = interfaceC32720Et0.mo89506y();
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(obj) | interfaceC32720Et0.mo89539n(obj2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            interfaceC32720Et0.mo89503z(new C40542em2(mo89506y, block));
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    /* renamed from: f */
    public static final void m75533f(Object obj, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(block, "block");
        interfaceC32720Et0.mo89638F(1179185413);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:331)");
        }
        CoroutineContext mo89506y = interfaceC32720Et0.mo89506y();
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(obj);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            interfaceC32720Et0.mo89503z(new C40542em2(mo89506y, block));
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    /* renamed from: g */
    public static final void m75532g(Object[] keys, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        interfaceC32720Et0.mo89638F(-139560008);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:401)");
        }
        CoroutineContext mo89506y = interfaceC32720Et0.mo89506y();
        Object[] copyOf = Arrays.copyOf(keys, keys.length);
        interfaceC32720Et0.mo89638F(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= interfaceC32720Et0.mo89539n(obj);
        }
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (z || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            interfaceC32720Et0.mo89503z(new C40542em2(mo89506y, block));
        }
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    /* renamed from: h */
    public static final void m75531h(Function0<Unit> effect, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        interfaceC32720Et0.mo89638F(-1288466761);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:44)");
        }
        interfaceC32720Et0.mo89560g(effect);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
    }

    @PublishedApi
    /* renamed from: j */
    public static final ZC0 m75529j(CoroutineContext coroutineContext, InterfaceC32720Et0 composer) {
        InterfaceC45344ms0 m95045b;
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(composer, "composer");
        InterfaceC52943zh2.C31479b c31479b = InterfaceC52943zh2.f122077a0;
        if (coroutineContext.get(c31479b) != null) {
            m95045b = C34486Mh2.m95045b(null, 1, null);
            m95045b.mo24839a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return C37824aD0.m71790a(m95045b);
        }
        CoroutineContext mo89506y = composer.mo89506y();
        return C37824aD0.m71790a(mo89506y.plus(C34018Kh2.m98511a((InterfaceC52943zh2) mo89506y.get(c31479b))).plus(coroutineContext));
    }
}
