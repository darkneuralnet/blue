package p000;

import io.reactivex.functions.InterfaceC23494q;
/* renamed from: am */
/* loaded from: classes6.dex */
public class C10852am<T> {

    /* renamed from: a */
    public final int f51197a;

    /* renamed from: b */
    public final Object[] f51198b;

    /* renamed from: c */
    public Object[] f51199c;

    /* renamed from: d */
    public int f51200d;

    /* renamed from: am$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC10853a<T> extends InterfaceC23494q<T> {
        @Override // io.reactivex.functions.InterfaceC23494q
        boolean test(T t);
    }

    public C10852am(int i) {
        this.f51197a = i;
        Object[] objArr = new Object[i + 1];
        this.f51198b = objArr;
        this.f51199c = objArr;
    }

    /* renamed from: a */
    public void m70773a(AbstractC37638Zt4<? super T> abstractC37638Zt4) {
        int i = this.f51197a;
        for (Object[] objArr = this.f51198b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                }
                abstractC37638Zt4.accept(obj);
            }
        }
    }

    /* renamed from: b */
    public void m70772b(T t) {
        int i = this.f51197a;
        int i2 = this.f51200d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f51199c[i] = objArr;
            this.f51199c = objArr;
            i2 = 0;
        }
        this.f51199c[i2] = t;
        this.f51200d = i2 + 1;
    }

    /* renamed from: c */
    public void m70771c(InterfaceC10853a<? super T> interfaceC10853a) {
        int i = this.f51197a;
        for (Object[] objArr = this.f51198b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj != null && !interfaceC10853a.test(obj)) {
                }
            }
        }
    }
}
