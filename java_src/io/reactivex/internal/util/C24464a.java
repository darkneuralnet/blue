package io.reactivex.internal.util;

import io.reactivex.InterfaceC23436D;
import io.reactivex.functions.InterfaceC23494q;
/* renamed from: io.reactivex.internal.util.a */
/* loaded from: classes8.dex */
public class C24464a<T> {

    /* renamed from: a */
    public final int f91063a;

    /* renamed from: b */
    public final Object[] f91064b;

    /* renamed from: c */
    public Object[] f91065c;

    /* renamed from: d */
    public int f91066d;

    /* renamed from: io.reactivex.internal.util.a$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC24465a<T> extends InterfaceC23494q<T> {
        @Override // io.reactivex.functions.InterfaceC23494q
        boolean test(T t);
    }

    public C24464a(int i) {
        this.f91063a = i;
        Object[] objArr = new Object[i + 1];
        this.f91064b = objArr;
        this.f91065c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean m32285a(InterfaceC42141hT5<? super U> interfaceC42141hT5) {
        Object[] objArr = this.f91064b;
        int i = this.f91063a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                } else if (EnumC24479n.m32245c(objArr2, interfaceC42141hT5)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean m32284b(InterfaceC23436D<? super U> interfaceC23436D) {
        Object[] objArr = this.f91064b;
        int i = this.f91063a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                } else if (EnumC24479n.m32244d(objArr2, interfaceC23436D)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: c */
    public void m32283c(T t) {
        int i = this.f91063a;
        int i2 = this.f91066d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.f91065c[i] = objArr;
            this.f91065c = objArr;
            i2 = 0;
        }
        this.f91065c[i2] = t;
        this.f91066d = i2 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
        continue;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m32282d(InterfaceC24465a<? super T> interfaceC24465a) {
        int i = this.f91063a;
        for (Object[] objArr = this.f91064b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else if (interfaceC24465a.test(obj)) {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public void m32281e(T t) {
        this.f91064b[0] = t;
    }
}
