package p000;

import java.util.Arrays;
/* renamed from: jw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43612jw7 {

    /* renamed from: a */
    public Object[] f93577a = new Object[8];

    /* renamed from: b */
    public int f93578b = 0;

    /* renamed from: c */
    public C49531tv7 f93579c;

    /* renamed from: a */
    public final C43612jw7 m29681a(Object obj, Object obj2) {
        int i = this.f93578b + 1;
        Object[] objArr = this.f93577a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f93577a = Arrays.copyOf(objArr, C31764Aq7.m115116a(length, i2));
        }
        C41150fn7.m40817a(obj, obj2);
        Object[] objArr2 = this.f93577a;
        int i3 = this.f93578b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f93578b = i3 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC37434Yw7 m29680b() {
        C49531tv7 c49531tv7 = this.f93579c;
        if (c49531tv7 == null) {
            AE7 m115957g = AE7.m115957g(this.f93578b, this.f93577a, this);
            C49531tv7 c49531tv72 = this.f93579c;
            if (c49531tv72 == null) {
                return m115957g;
            }
            throw c49531tv72.m11200a();
        }
        throw c49531tv7.m11200a();
    }
}
