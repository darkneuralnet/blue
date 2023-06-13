package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: Vb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36542Vb6 extends C36308Ub6 {
    @Override // p000.C36308Ub6
    /* renamed from: l */
    public Typeface mo79684l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f37641g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f37647m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.C36308Ub6
    /* renamed from: x */
    public Method mo79683x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
