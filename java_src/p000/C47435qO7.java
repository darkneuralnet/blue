package p000;

import java.util.Arrays;
import java.util.Collection;
/* renamed from: qO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47435qO7 extends GO7 {

    /* renamed from: a */
    public Object[] f105259a = new Object[4];

    /* renamed from: b */
    public int f105260b = 0;

    /* renamed from: c */
    public boolean f105261c;

    public C47435qO7(int i) {
    }

    @Override // p000.GO7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ GO7 mo17546a(Object obj) {
        throw null;
    }

    /* renamed from: b */
    public final C47435qO7 m17545b(Object obj) {
        obj.getClass();
        m17543d(this.f105260b + 1);
        Object[] objArr = this.f105259a;
        int i = this.f105260b;
        this.f105260b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final GO7 m17544c(Iterable iterable) {
        if (iterable instanceof Collection) {
            m17543d(this.f105260b + iterable.size());
            if (iterable instanceof VO7) {
                this.f105260b = ((VO7) iterable).mo6713a(this.f105259a, this.f105260b);
                return this;
            }
        }
        for (Object obj : iterable) {
            mo17546a(obj);
        }
        return this;
    }

    /* renamed from: d */
    public final void m17543d(int i) {
        Object[] objArr = this.f105259a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f105259a = Arrays.copyOf(objArr, i2);
            this.f105261c = false;
        } else if (this.f105261c) {
            this.f105259a = (Object[]) objArr.clone();
            this.f105261c = false;
        }
    }
}
