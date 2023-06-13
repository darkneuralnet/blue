package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u0011\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LRj6;", "", "", "i", "", C17296a.f69688o, "value", "", "c", DateTokenConverter.CONVERTER_KEY, "b", "I", "getLength", "()I", "length", "", "[Ljava/lang/Float;", "getElements", "()[Ljava/lang/Float;", "elements", "<init>", "(I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35678Rj6 {

    /* renamed from: a */
    public final int f32480a;

    /* renamed from: b */
    public final Float[] f32481b;

    public C35678Rj6(int i) {
        this.f32480a = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.f32481b = fArr;
    }

    /* renamed from: a */
    public final float m86416a(int i) {
        return this.f32481b[i].floatValue();
    }

    /* renamed from: b */
    public final float m86415b() {
        return (float) Math.sqrt(m86413d(this));
    }

    /* renamed from: c */
    public final void m86414c(int i, float f) {
        this.f32481b[i] = Float.valueOf(f);
    }

    /* renamed from: d */
    public final float m86413d(C35678Rj6 a) {
        Intrinsics.checkNotNullParameter(a, "a");
        int i = this.f32480a;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += m86416a(i2) * a.m86416a(i2);
        }
        return f;
    }
}
