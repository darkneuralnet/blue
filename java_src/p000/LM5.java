package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\u001a#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28432d2 = {"T", "value", "LEM5;", "policy", "LEX2;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;LEM5;)LEX2;", "LMM5;", C17296a.f69688o, "", "elements", "b", "([Ljava/lang/Object;)LMM5;", "K", "V", "LOM5;", "c", "newValue", "LsP5;", "f", "(Ljava/lang/Object;LEt0;I)LsP5;", "runtime_release"}, m28431k = 5, m28430mv = {1, 8, 0}, m28427xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,298:1\n1#2:299\n25#3:300\n1114#4,6:301\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n295#1:300\n295#1:301,6\n*E\n"})
/* renamed from: LM5 */
/* loaded from: classes.dex */
public final /* synthetic */ class LM5 {
    /* renamed from: a */
    public static final <T> MM5<T> m97029a() {
        return new MM5<>();
    }

    /* renamed from: b */
    public static final <T> MM5<T> m97028b(T... elements) {
        List list;
        Intrinsics.checkNotNullParameter(elements, "elements");
        MM5<T> mm5 = new MM5<>();
        list = ArraysKt___ArraysKt.toList(elements);
        mm5.addAll(list);
        return mm5;
    }

    /* renamed from: c */
    public static final <K, V> OM5<K, V> m97027c() {
        return new OM5<>();
    }

    /* renamed from: d */
    public static final <T> EX2<T> m97026d(T t, EM5<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        return C0030A6.m116100a(t, policy);
    }

    /* renamed from: e */
    public static /* synthetic */ EX2 m97025e(Object obj, EM5 em5, int i, Object obj2) {
        if ((i & 2) != 0) {
            em5 = GM5.m105191p();
        }
        return GM5.m105200g(obj, em5);
    }

    /* renamed from: f */
    public static final <T> InterfaceC48627sP5<T> m97024f(T t, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-1058319986);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:294)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = m97025e(t, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        ex2.setValue(t);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return ex2;
    }
}
