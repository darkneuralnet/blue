package p000;

import java.util.Arrays;
/* renamed from: Tx7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36273Tx7 {

    /* renamed from: a */
    public Object[] f36501a = new Object[8];

    /* renamed from: b */
    public int f36502b = 0;

    /* renamed from: c */
    public C35328Pw7 f36503c;

    /* renamed from: a */
    public final C36273Tx7 m82216a(Object obj, Object obj2) {
        int i = this.f36502b + 1;
        int i2 = i + i;
        Object[] objArr = this.f36501a;
        int length = objArr.length;
        if (i2 > length) {
            this.f36501a = Arrays.copyOf(objArr, C42969ir7.m31747a(length, i2));
        }
        C31665Af7.m115391b(obj, obj2);
        Object[] objArr2 = this.f36501a;
        int i3 = this.f36502b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f36502b = i3 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC50746vy7 m82215b() {
        C35328Pw7 c35328Pw7 = this.f36503c;
        if (c35328Pw7 == null) {
            ML7 m95424h = ML7.m95424h(this.f36502b, this.f36501a, this);
            C35328Pw7 c35328Pw72 = this.f36503c;
            if (c35328Pw72 == null) {
                return m95424h;
            }
            throw c35328Pw72.m89292a();
        }
        throw c35328Pw7.m89292a();
    }
}
