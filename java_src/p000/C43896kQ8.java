package p000;

import java.util.Arrays;
/* renamed from: kQ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43896kQ8<K, V> {

    /* renamed from: a */
    public Object[] f94372a = new Object[8];

    /* renamed from: b */
    public int f94373b = 0;

    /* renamed from: a */
    public final C43896kQ8<K, V> m28974a(K k, V v) {
        int i = this.f94373b + 1;
        int i2 = i + i;
        Object[] objArr = this.f94372a;
        int length = objArr.length;
        if (i2 > length) {
            this.f94372a = Arrays.copyOf(objArr, MO8.m95317a(length, i2));
        }
        C44462lN8.m27367a(k, v);
        Object[] objArr2 = this.f94372a;
        int i3 = this.f94373b;
        int i4 = i3 + i3;
        objArr2[i4] = k;
        objArr2[i4 + 1] = v;
        this.f94373b = i3 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC50417vQ8<K, V> m28973b() {
        return HS8.m103848g(this.f94373b, this.f94372a);
    }
}
