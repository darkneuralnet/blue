package p000;

import java.lang.annotation.Annotation;
/* renamed from: LB5 */
/* loaded from: classes8.dex */
public final class LB5 implements KB5 {

    /* renamed from: a */
    public static final KB5 f20877a = new LB5();

    /* renamed from: a */
    public static Annotation[] m97606a(Annotation[] annotationArr) {
        if (C34031Ki6.m98472l(annotationArr, KB5.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f20877a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return KB5.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof KB5;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + KB5.class.getName() + "()";
    }
}
