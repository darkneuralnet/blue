package p000;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
/* renamed from: Gd3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33047Gd3 {
    private C33047Gd3() {
    }

    /* renamed from: a */
    public static <T> ObjectAnimator m104943a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
