package p000;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lva6;", "K", "V", "Lra6;", "", "l", "LtR3;", "e", "LtR3;", "parentIterator", "<init>", "(LtR3;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: va6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50505va6<K, V> extends AbstractC48135ra6<K, V, Map.Entry<K, V>> {

    /* renamed from: e */
    public final C49236tR3<K, V> f114302e;

    public C50505va6(C49236tR3<K, V> parentIterator) {
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.f114302e = parentIterator;
    }

    @Override // java.util.Iterator
    /* renamed from: l */
    public Map.Entry<K, V> next() {
        C49464tp0.m11730a(m15739e());
        m15733k(m15740d() + 2);
        return new C50474vX2(this.f114302e, m15741c()[m15740d() - 2], m15741c()[m15740d() - 1]);
    }
}
