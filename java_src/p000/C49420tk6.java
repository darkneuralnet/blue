package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010 \u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010!\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u001f¨\u0006$"}, m28432d2 = {"Ltk6;", "Lvf;", "V", "Lok6;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLvf;Lvf;Lvf;)Lvf;", DateTokenConverter.CONVERTER_KEY, "value", "", "h", "(Lvf;)V", "", "", "Lkotlin/Pair;", "Lh91;", C17296a.f69688o, "Ljava/util/Map;", "keyframes", "b", "I", "g", "()I", "durationMillis", "c", "f", "delayMillis", "Lvf;", "valueVector", "velocityVector", "<init>", "(Ljava/util/Map;II)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49420tk6<V extends AbstractC29607vf> implements InterfaceC46456ok6<V> {

    /* renamed from: a */
    public final Map<Integer, Pair<V, InterfaceC41956h91>> f110962a;

    /* renamed from: b */
    public final int f110963b;

    /* renamed from: c */
    public final int f110964c;

    /* renamed from: d */
    public V f110965d;

    /* renamed from: e */
    public V f110966e;

    /* JADX WARN: Multi-variable type inference failed */
    public C49420tk6(Map<Integer, ? extends Pair<? extends V, ? extends InterfaceC41956h91>> keyframes, int i, int i2) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        this.f110962a = keyframes;
        this.f110963b = i;
        this.f110964c = i2;
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: d */
    public V mo6414d(long j, V initialValue, V targetValue, V initialVelocity) {
        long m25117c;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        m25117c = C45270mk6.m25117c(this, j / 1000000);
        if (m25117c <= 0) {
            return initialVelocity;
        }
        AbstractC29607vf m25115e = C45270mk6.m25115e(this, m25117c - 1, initialValue, targetValue, initialVelocity);
        AbstractC29607vf m25115e2 = C45270mk6.m25115e(this, m25117c, initialValue, targetValue, initialVelocity);
        m11819h(initialValue);
        int mo8295b = m25115e.mo8295b();
        int i = 0;
        while (true) {
            V v = null;
            if (i >= mo8295b) {
                break;
            }
            V v2 = this.f110966e;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            } else {
                v = v2;
            }
            v.mo8292e(i, (m25115e.mo8296a(i) - m25115e2.mo8296a(i)) * 1000.0f);
            i++;
        }
        V v3 = this.f110966e;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return v3;
    }

    @Override // p000.InterfaceC44677lk6
    /* renamed from: e */
    public V mo6413e(long j, V initialValue, V targetValue, V initialVelocity) {
        long m25117c;
        Object value;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        m25117c = C45270mk6.m25117c(this, j / 1000000);
        int i = (int) m25117c;
        if (this.f110962a.containsKey(Integer.valueOf(i))) {
            value = MapsKt__MapsKt.getValue(this.f110962a, Integer.valueOf(i));
            return (V) ((Pair) value).getFirst();
        } else if (i >= mo6411g()) {
            return targetValue;
        } else {
            if (i <= 0) {
                return initialValue;
            }
            int mo6411g = mo6411g();
            InterfaceC41956h91 m34394c = C42549i91.m34394c();
            int i2 = 0;
            V v = initialValue;
            int i3 = 0;
            for (Map.Entry<Integer, Pair<V, InterfaceC41956h91>> entry : this.f110962a.entrySet()) {
                int intValue = entry.getKey().intValue();
                Pair<V, InterfaceC41956h91> value2 = entry.getValue();
                if (i > intValue && intValue >= i3) {
                    v = value2.getFirst();
                    m34394c = value2.getSecond();
                    i3 = intValue;
                } else if (i < intValue && intValue <= mo6411g) {
                    targetValue = value2.getFirst();
                    mo6411g = intValue;
                }
            }
            float mo34392a = m34394c.mo34392a((i - i3) / (mo6411g - i3));
            m11819h(initialValue);
            int mo8295b = v.mo8295b();
            while (true) {
                V v2 = null;
                if (i2 >= mo8295b) {
                    break;
                }
                V v3 = this.f110965d;
                if (v3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                } else {
                    v2 = v3;
                }
                v2.mo8292e(i2, C37082Xj6.m76514k(v.mo8296a(i2), targetValue.mo8296a(i2), mo34392a));
                i2++;
            }
            V v4 = this.f110965d;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                return null;
            }
            return v4;
        }
    }

    @Override // p000.InterfaceC46456ok6
    /* renamed from: f */
    public int mo6412f() {
        return this.f110964c;
    }

    @Override // p000.InterfaceC46456ok6
    /* renamed from: g */
    public int mo6411g() {
        return this.f110963b;
    }

    /* renamed from: h */
    public final void m11819h(V v) {
        if (this.f110965d == null) {
            this.f110965d = (V) C29932wf.m6542d(v);
            this.f110966e = (V) C29932wf.m6542d(v);
        }
    }
}
