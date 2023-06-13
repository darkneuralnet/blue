package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB)\b\u0016\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010 J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019¨\u0006!"}, m28432d2 = {"Lvk6;", "Lvf;", "V", "Lpk6;", "initialValue", "targetValue", "initialVelocity", "", "b", "(Lvf;Lvf;Lvf;)J", "c", "(Lvf;Lvf;Lvf;)Lvf;", "playTimeNanos", "e", "(JLvf;Lvf;Lvf;)Lvf;", DateTokenConverter.CONVERTER_KEY, "", C17296a.f69688o, "F", "getDampingRatio", "()F", "dampingRatio", "getStiffness", "stiffness", "", "()Z", "isInfinite", "Lxf;", "anims", "<init>", "(FFLxf;)V", "visibilityThreshold", "(FFLvf;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50605vk6<V extends AbstractC29607vf> implements InterfaceC47049pk6<V> {

    /* renamed from: a */
    public final float f114564a;

    /* renamed from: b */
    public final float f114565b;

    /* renamed from: c */
    public final /* synthetic */ C47642qk6<V> f114566c;

    public C50605vk6(float f, float f2, InterfaceC30265xf interfaceC30265xf) {
        this.f114564a = f;
        this.f114565b = f2;
        this.f114566c = new C47642qk6<>(interfaceC30265xf);
    }

    @Override // p000.InterfaceC47049pk6, p000.InterfaceC44677lk6
    /* renamed from: a */
    public boolean mo8208a() {
        return this.f114566c.mo8208a();
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: b */
    public long mo8207b(V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f114566c.mo8207b(initialValue, targetValue, initialVelocity);
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: c */
    public V mo8206c(V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f114566c.mo8206c(initialValue, targetValue, initialVelocity);
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: d */
    public V mo6414d(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f114566c.mo6414d(j, initialValue, targetValue, initialVelocity);
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: e */
    public V mo6413e(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f114566c.mo6413e(j, initialValue, targetValue, initialVelocity);
    }

    public C50605vk6(float f, float f2, V v) {
        this(f, f2, C45270mk6.m25118b(v, f, f2));
    }
}
