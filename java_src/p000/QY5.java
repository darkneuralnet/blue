package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u001d\u001a\u00028\u0000\u0012\u0006\u0010\u001f\u001a\u00028\u0000\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b,\u0010-BG\b\u0016\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000.\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u001d\u001a\u00028\u0000\u0012\u0006\u0010\u001f\u001a\u00028\u0000\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b,\u0010/J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010#\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0019\u0010%R\u0014\u0010(\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010*¨\u00060"}, m28432d2 = {"LQY5;", "T", "Lvf;", "V", "Lef;", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Lvf;", "", "toString", "Llk6;", C17296a.f69688o, "Llk6;", "getAnimationSpec$animation_core_release", "()Llk6;", "animationSpec", "Lwb6;", "b", "Lwb6;", DateTokenConverter.CONVERTER_KEY, "()Lwb6;", "typeConverter", "c", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "initialValue", "f", "targetValue", "Lvf;", "initialValueVector", "targetValueVector", "initialVelocityVector", "J", "()J", "durationNanos", "i", "endVelocity", "", "()Z", "isInfinite", "<init>", "(Llk6;Lwb6;Ljava/lang/Object;Ljava/lang/Object;Lvf;)V", "Llf;", "(Llf;Lwb6;Ljava/lang/Object;Ljava/lang/Object;Lvf;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QY5 */
/* loaded from: classes.dex */
public final class QY5<T, V extends AbstractC29607vf> implements InterfaceC20082ef<T, V> {

    /* renamed from: a */
    public final InterfaceC44677lk6<V> f30506a;

    /* renamed from: b */
    public final InterfaceC51108wb6<T, V> f30507b;

    /* renamed from: c */
    public final T f30508c;

    /* renamed from: d */
    public final T f30509d;

    /* renamed from: e */
    public final V f30510e;

    /* renamed from: f */
    public final V f30511f;

    /* renamed from: g */
    public final V f30512g;

    /* renamed from: h */
    public final long f30513h;

    /* renamed from: i */
    public final V f30514i;

    public QY5(InterfaceC44677lk6<V> animationSpec, InterfaceC51108wb6<T, V> typeConverter, T t, T t2, V v) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.f30506a = animationSpec;
        this.f30507b = typeConverter;
        this.f30508c = t;
        this.f30509d = t2;
        V invoke = mo33858d().mo4960a().invoke(t);
        this.f30510e = invoke;
        V invoke2 = mo33858d().mo4960a().invoke(mo33856f());
        this.f30511f = invoke2;
        V v2 = (v == null || (v2 = (V) C29932wf.m6544b(v)) == null) ? (V) C29932wf.m6542d(mo33858d().mo4960a().invoke(t)) : v2;
        this.f30512g = v2;
        this.f30513h = animationSpec.mo8207b(invoke, invoke2, v2);
        this.f30514i = animationSpec.mo8206c(invoke, invoke2, v2);
    }

    @Override // p000.InterfaceC20082ef
    /* renamed from: a */
    public boolean mo33860a() {
        return this.f30506a.mo8208a();
    }

    @Override // p000.InterfaceC20082ef
    /* renamed from: c */
    public long mo33859c() {
        return this.f30513h;
    }

    @Override // p000.InterfaceC20082ef
    /* renamed from: d */
    public InterfaceC51108wb6<T, V> mo33858d() {
        return this.f30507b;
    }

    @Override // p000.InterfaceC20082ef
    /* renamed from: e */
    public T mo33857e(long j) {
        if (!m42661b(j)) {
            V mo6413e = this.f30506a.mo6413e(j, this.f30510e, this.f30511f, this.f30512g);
            int mo8295b = mo6413e.mo8295b();
            for (int i = 0; i < mo8295b; i++) {
                if (!(!Float.isNaN(mo6413e.mo8296a(i)))) {
                    throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + mo6413e + ". Animation: " + this + ", playTimeNanos: " + j).toString());
                }
            }
            return mo33858d().mo4959b().invoke(mo6413e);
        }
        return mo33856f();
    }

    @Override // p000.InterfaceC20082ef
    /* renamed from: f */
    public T mo33856f() {
        return this.f30509d;
    }

    @Override // p000.InterfaceC20082ef
    /* renamed from: g */
    public V mo33855g(long j) {
        if (!m42661b(j)) {
            return this.f30506a.mo6414d(j, this.f30510e, this.f30511f, this.f30512g);
        }
        return this.f30514i;
    }

    /* renamed from: h */
    public final T m88408h() {
        return this.f30508c;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f30508c + " -> " + mo33856f() + ",initial velocity: " + this.f30512g + ", duration: " + C22705hf.m36112b(this) + " ms,animationSpec: " + this.f30506a;
    }

    public /* synthetic */ QY5(InterfaceC25753lf interfaceC25753lf, InterfaceC51108wb6 interfaceC51108wb6, Object obj, Object obj2, AbstractC29607vf abstractC29607vf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25753lf, interfaceC51108wb6, obj, obj2, (i & 16) != 0 ? null : abstractC29607vf);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QY5(InterfaceC25753lf<T> animationSpec, InterfaceC51108wb6<T, V> typeConverter, T t, T t2, V v) {
        this(animationSpec.mo12016a(typeConverter), typeConverter, t, t2, v);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
