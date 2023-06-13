package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0017\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u001d"}, m28432d2 = {"Lqk6;", "Lvf;", "V", "Lpk6;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLvf;Lvf;Lvf;)Lvf;", DateTokenConverter.CONVERTER_KEY, "c", "(Lvf;Lvf;Lvf;)Lvf;", "b", "(Lvf;Lvf;Lvf;)J", "Lxf;", C17296a.f69688o, "Lxf;", "anims", "Lvf;", "valueVector", "velocityVector", "endVelocityVector", "<init>", "(Lxf;)V", "Lju1;", "anim", "(Lju1;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n1855#2,2:814\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n804#1:814,2\n*E\n"})
/* renamed from: qk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47642qk6<V extends AbstractC29607vf> implements InterfaceC47049pk6<V> {

    /* renamed from: a */
    public final InterfaceC30265xf f105706a;

    /* renamed from: b */
    public V f105707b;

    /* renamed from: c */
    public V f105708c;

    /* renamed from: d */
    public V f105709d;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, m28432d2 = {"qk6$a", "Lxf;", "", "index", "Lju1;", "get", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qk6$a */
    /* loaded from: classes.dex */
    public static final class C27664a implements InterfaceC30265xf {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC43586ju1 f105710a;

        public C27664a(InterfaceC43586ju1 interfaceC43586ju1) {
            this.f105710a = interfaceC43586ju1;
        }

        @Override // p000.InterfaceC30265xf
        public InterfaceC43586ju1 get(int i) {
            return this.f105710a;
        }
    }

    public C47642qk6(InterfaceC30265xf anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.f105706a = anims;
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: b */
    public long mo8207b(V initialValue, V targetValue, V initialVelocity) {
        IntRange until;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        until = RangesKt___RangesKt.until(0, initialValue.mo8295b());
        Iterator<Integer> it = until.iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            j = Math.max(j, this.f105706a.get(nextInt).mo9536c(initialValue.mo8296a(nextInt), targetValue.mo8296a(nextInt), initialVelocity.mo8296a(nextInt)));
        }
        return j;
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: c */
    public V mo8206c(V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f105709d == null) {
            this.f105709d = (V) C29932wf.m6542d(initialVelocity);
        }
        V v = this.f105709d;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v = null;
        }
        int mo8295b = v.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            V v2 = this.f105709d;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                v2 = null;
            }
            v2.mo8292e(i, this.f105706a.get(i).mo11251d(initialValue.mo8296a(i), targetValue.mo8296a(i), initialVelocity.mo8296a(i)));
        }
        V v3 = this.f105709d;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            return null;
        }
        return v3;
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: d */
    public V mo6414d(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f105708c == null) {
            this.f105708c = (V) C29932wf.m6542d(initialVelocity);
        }
        V v = this.f105708c;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        int mo8295b = v.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            V v2 = this.f105708c;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v2 = null;
            }
            v2.mo8292e(i, this.f105706a.get(i).mo9537b(j, initialValue.mo8296a(i), targetValue.mo8296a(i), initialVelocity.mo8296a(i)));
        }
        V v3 = this.f105708c;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return v3;
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: e */
    public V mo6413e(long j, V initialValue, V targetValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f105707b == null) {
            this.f105707b = (V) C29932wf.m6542d(initialValue);
        }
        V v = this.f105707b;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v = null;
        }
        int mo8295b = v.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            V v2 = this.f105707b;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v2 = null;
            }
            v2.mo8292e(i, this.f105706a.get(i).mo9535e(j, initialValue.mo8296a(i), targetValue.mo8296a(i), initialVelocity.mo8296a(i)));
        }
        V v3 = this.f105707b;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        return v3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47642qk6(InterfaceC43586ju1 anim) {
        this(new C27664a(anim));
        Intrinsics.checkNotNullParameter(anim, "anim");
    }
}
