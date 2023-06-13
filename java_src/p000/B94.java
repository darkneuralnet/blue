package p000;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
/* renamed from: B94 */
/* loaded from: classes.dex */
public class B94 {
    private B94() {
    }

    /* renamed from: a */
    public static PropertyValuesHolder m114320a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
