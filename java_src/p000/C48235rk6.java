package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0017\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lrk6;", "Lvf;", "V", "Lnk6;", "", "playTimeNanos", "initialValue", "initialVelocity", "c", "(JLvf;Lvf;)Lvf;", "e", "(Lvf;Lvf;)J", "b", DateTokenConverter.CONVERTER_KEY, "(Lvf;Lvf;)Lvf;", "Lnu1;", C17296a.f69688o, "Lnu1;", "getFloatDecaySpec", "()Lnu1;", "floatDecaySpec", "Lvf;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "<init>", "(Lnu1;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48235rk6<V extends AbstractC29607vf> implements InterfaceC45863nk6<V> {

    /* renamed from: a */
    public final InterfaceC45958nu1 f107557a;

    /* renamed from: b */
    public V f107558b;

    /* renamed from: c */
    public V f107559c;

    /* renamed from: d */
    public V f107560d;

    /* renamed from: e */
    public final float f107561e;

    public C48235rk6(InterfaceC45958nu1 floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f107557a = floatDecaySpec;
        this.f107561e = floatDecaySpec.mo22215a();
    }

    @Override // p000.InterfaceC45863nk6
    /* renamed from: a */
    public float mo15474a() {
        return this.f107561e;
    }

    @Override // p000.InterfaceC45863nk6
    /* renamed from: b */
    public V mo15473b(long j, V initialValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f107559c == null) {
            this.f107559c = (V) C29932wf.m6542d(initialValue);
        }
        V v = this.f107559c;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        int mo8295b = v.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            V v2 = this.f107559c;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v2 = null;
            }
            v2.mo8292e(i, this.f107557a.mo22214b(j, initialValue.mo8296a(i), initialVelocity.mo8296a(i)));
        }
        V v3 = this.f107559c;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return v3;
    }

    @Override // p000.InterfaceC45863nk6
    /* renamed from: c */
    public V mo15472c(long j, V initialValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f107558b == null) {
            this.f107558b = (V) C29932wf.m6542d(initialValue);
        }
        V v = this.f107558b;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v = null;
        }
        int mo8295b = v.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            V v2 = this.f107558b;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v2 = null;
            }
            v2.mo8292e(i, this.f107557a.mo22211e(j, initialValue.mo8296a(i), initialVelocity.mo8296a(i)));
        }
        V v3 = this.f107558b;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        return v3;
    }

    @Override // p000.InterfaceC45863nk6
    /* renamed from: d */
    public V mo15471d(V initialValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f107560d == null) {
            this.f107560d = (V) C29932wf.m6542d(initialValue);
        }
        V v = this.f107560d;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v = null;
        }
        int mo8295b = v.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            V v2 = this.f107560d;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                v2 = null;
            }
            v2.mo8292e(i, this.f107557a.mo22212d(initialValue.mo8296a(i), initialVelocity.mo8296a(i)));
        }
        V v3 = this.f107560d;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            return null;
        }
        return v3;
    }

    @Override // p000.InterfaceC45863nk6
    /* renamed from: e */
    public long mo15470e(V initialValue, V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f107559c == null) {
            this.f107559c = (V) C29932wf.m6542d(initialValue);
        }
        V v = this.f107559c;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v = null;
        }
        int mo8295b = v.mo8295b();
        long j = 0;
        for (int i = 0; i < mo8295b; i++) {
            j = Math.max(j, this.f107557a.mo22213c(initialValue.mo8296a(i), initialVelocity.mo8296a(i)));
        }
        return j;
    }
}
