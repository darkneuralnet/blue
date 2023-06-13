package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LvX2;", "K", "V", "LpK2;", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "LtR3;", DateTokenConverter.CONVERTER_KEY, "LtR3;", "parentIterator", "e", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", C17296a.f69688o, "(Ljava/lang/Object;)V", "value", "key", "<init>", "(LtR3;Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vX2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50474vX2<K, V> extends C46801pK2<K, V> implements KMutableMap.Entry {

    /* renamed from: d */
    public final C49236tR3<K, V> f114222d;

    /* renamed from: e */
    public V f114223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50474vX2(C49236tR3<K, V> parentIterator, K k, V v) {
        super(k, v);
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.f114222d = parentIterator;
        this.f114223e = v;
    }

    /* renamed from: a */
    public void m8528a(V v) {
        this.f114223e = v;
    }

    @Override // p000.C46801pK2, java.util.Map.Entry
    public V getValue() {
        return this.f114223e;
    }

    @Override // p000.C46801pK2, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        m8528a(v);
        this.f114222d.m12379b(getKey(), v);
        return value;
    }
}
