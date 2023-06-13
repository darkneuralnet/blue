package p000;

import java.util.Arrays;
/* renamed from: pq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47110pq7 extends C42969ir7 {

    /* renamed from: a */
    public Object[] f104161a = new Object[4];

    /* renamed from: b */
    public int f104162b = 0;

    /* renamed from: c */
    public boolean f104163c;

    public C47110pq7(int i) {
    }

    /* renamed from: b */
    public final C47110pq7 m18639b(Object obj) {
        obj.getClass();
        m18638c(this.f104162b + 1);
        Object[] objArr = this.f104161a;
        int i = this.f104162b;
        this.f104162b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: c */
    public final void m18638c(int i) {
        Object[] objArr = this.f104161a;
        int length = objArr.length;
        if (length < i) {
            this.f104161a = Arrays.copyOf(objArr, C42969ir7.m31747a(length, i));
            this.f104163c = false;
        } else if (this.f104163c) {
            this.f104161a = (Object[]) objArr.clone();
            this.f104163c = false;
        }
    }
}
