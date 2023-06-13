package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u00103\u001a\u00028\u0000\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u00104\u001a\u00028\u0001\u0012\u0006\u0010)\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u00101\u001a\u00020-\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0004\b5\u00106J\u0006\u0010\u0006\u001a\u00020\u0005R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R+\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010)\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00118F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00118F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0013\u001a\u0004\b\f\u0010\u0015\"\u0004\b+\u0010(R+\u00101\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020-8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b*\u0010.\"\u0004\b/\u00100R\u0011\u00102\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\u000f¨\u00067"}, m28432d2 = {"Lkf;", "T", "Lvf;", "V", "", "", C17296a.f69688o, "Lwb6;", "Lwb6;", "getTypeConverter", "()Lwb6;", "typeConverter", "b", "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", "targetValue", "", "c", "J", DateTokenConverter.CONVERTER_KEY, "()J", "startTimeNanos", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onCancel", "<set-?>", "e", "LEX2;", "l", "(Ljava/lang/Object;)V", "value", "f", "Lvf;", "g", "()Lvf;", "m", "(Lvf;)V", "velocityVector", "j", "(J)V", "lastFrameTimeNanos", "h", "i", "finishedTimeNanos", "", "()Z", "k", "(Z)V", "isRunning", "velocity", "initialValue", "initialVelocityVector", "<init>", "(Ljava/lang/Object;Lwb6;Lvf;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n76#2:344\n102#2,2:345\n76#2:347\n102#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
/* renamed from: kf */
/* loaded from: classes.dex */
public final class C25201kf<T, V extends AbstractC29607vf> {

    /* renamed from: a */
    public final InterfaceC51108wb6<T, V> f94712a;

    /* renamed from: b */
    public final T f94713b;

    /* renamed from: c */
    public final long f94714c;

    /* renamed from: d */
    public final Function0<Unit> f94715d;

    /* renamed from: e */
    public final EX2 f94716e;

    /* renamed from: f */
    public V f94717f;

    /* renamed from: g */
    public long f94718g;

    /* renamed from: h */
    public long f94719h;

    /* renamed from: i */
    public final EX2 f94720i;

    public C25201kf(T t, InterfaceC51108wb6<T, V> typeConverter, V initialVelocityVector, long j, T t2, long j2, boolean z, Function0<Unit> onCancel) {
        EX2 m97025e;
        EX2 m97025e2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.f94712a = typeConverter;
        this.f94713b = t2;
        this.f94714c = j2;
        this.f94715d = onCancel;
        m97025e = LM5.m97025e(t, null, 2, null);
        this.f94716e = m97025e;
        this.f94717f = (V) C29932wf.m6544b(initialVelocityVector);
        this.f94718g = j;
        this.f94719h = Long.MIN_VALUE;
        m97025e2 = LM5.m97025e(Boolean.valueOf(z), null, 2, null);
        this.f94720i = m97025e2;
    }

    /* renamed from: a */
    public final void m28701a() {
        m28691k(false);
        this.f94715d.invoke();
    }

    /* renamed from: b */
    public final long m28700b() {
        return this.f94719h;
    }

    /* renamed from: c */
    public final long m28699c() {
        return this.f94718g;
    }

    /* renamed from: d */
    public final long m28698d() {
        return this.f94714c;
    }

    /* renamed from: e */
    public final T m28697e() {
        return this.f94716e.getValue();
    }

    /* renamed from: f */
    public final T m28696f() {
        return this.f94712a.mo4959b().invoke(this.f94717f);
    }

    /* renamed from: g */
    public final V m28695g() {
        return this.f94717f;
    }

    /* renamed from: h */
    public final boolean m28694h() {
        return ((Boolean) this.f94720i.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final void m28693i(long j) {
        this.f94719h = j;
    }

    /* renamed from: j */
    public final void m28692j(long j) {
        this.f94718g = j;
    }

    /* renamed from: k */
    public final void m28691k(boolean z) {
        this.f94720i.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void m28690l(T t) {
        this.f94716e.setValue(t);
    }

    /* renamed from: m */
    public final void m28689m(V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.f94717f = v;
    }
}
