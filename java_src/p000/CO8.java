package p000;

import java.util.Arrays;
/* renamed from: CO8 */
/* loaded from: classes6.dex */
public class CO8<E> extends MO8<E> {

    /* renamed from: a */
    public Object[] f4028a = new Object[4];

    /* renamed from: b */
    public int f4029b = 0;

    /* renamed from: c */
    public boolean f4030c;

    public CO8(int i) {
    }

    /* renamed from: b */
    public final CO8<E> m112265b(E e) {
        e.getClass();
        m112264c(this.f4029b + 1);
        Object[] objArr = this.f4028a;
        int i = this.f4029b;
        this.f4029b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* renamed from: c */
    public final void m112264c(int i) {
        Object[] objArr = this.f4028a;
        int length = objArr.length;
        if (length < i) {
            this.f4028a = Arrays.copyOf(objArr, MO8.m95317a(length, i));
            this.f4030c = false;
        } else if (this.f4030c) {
            this.f4028a = (Object[]) objArr.clone();
            this.f4030c = false;
        }
    }
}
