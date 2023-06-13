package p000;

import java.util.Arrays;
import java.util.function.BinaryOperator;
/* renamed from: pu0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47143pu0<T> {

    /* renamed from: a */
    public final T[] f104275a;

    public C47143pu0(T[] tArr) {
        this.f104275a = tArr;
    }

    /* renamed from: a */
    public static <T> C47143pu0<T> m18448a(T[] tArr) {
        return new C47143pu0<>(tArr);
    }

    /* renamed from: b */
    public T[] m18447b(int i) {
        T[] tArr = this.f104275a;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length - i);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            T[] tArr3 = this.f104275a;
            if (i2 < tArr3.length) {
                T t = tArr3[i2];
                if (t != null) {
                    tArr2[i3] = t;
                    i3++;
                }
                i2++;
            } else {
                return tArr2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public int m18446c(BinaryOperator<T> binaryOperator) {
        Object apply;
        int i = 0;
        if (this.f104275a.length < 2) {
            return 0;
        }
        int i2 = 1;
        while (true) {
            T[] tArr = this.f104275a;
            if (i2 < tArr.length) {
                int i3 = i2 - 1;
                T t = tArr[i3];
                if (t != null && (apply = binaryOperator.apply(t, tArr[i2])) != null) {
                    T[] tArr2 = this.f104275a;
                    tArr2[i3] = apply;
                    tArr2[i2] = 0;
                    i++;
                }
                i2++;
            } else {
                return i;
            }
        }
    }
}
