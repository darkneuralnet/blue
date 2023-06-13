package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\bR+\u0010\t\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR+\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LKX2;", "S", "", "<set-?>", C17296a.f69688o, "LEX2;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "currentState", "b", "e", "targetState", "", "isRunning$animation_core_release", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "isRunning", "initialState", "<init>", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n103#1:1156\n103#1:1157,2\n115#1:1159\n115#1:1160,2\n127#1:1162\n127#1:1163,2\n*E\n"})
/* renamed from: KX2 */
/* loaded from: classes.dex */
public final class KX2<S> {

    /* renamed from: d */
    public static final int f19719d = 0;

    /* renamed from: a */
    public final EX2 f19720a;

    /* renamed from: b */
    public final EX2 f19721b;

    /* renamed from: c */
    public final EX2 f19722c;

    public KX2(S s) {
        EX2 m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        m97025e = LM5.m97025e(s, null, 2, null);
        this.f19720a = m97025e;
        m97025e2 = LM5.m97025e(s, null, 2, null);
        this.f19721b = m97025e2;
        m97025e3 = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f19722c = m97025e3;
    }

    /* renamed from: a */
    public final S m98799a() {
        return (S) this.f19720a.getValue();
    }

    /* renamed from: b */
    public final S m98798b() {
        return (S) this.f19721b.getValue();
    }

    /* renamed from: c */
    public final void m98797c(S s) {
        this.f19720a.setValue(s);
    }

    /* renamed from: d */
    public final void m98796d(boolean z) {
        this.f19722c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void m98795e(S s) {
        this.f19721b.setValue(s);
    }
}
