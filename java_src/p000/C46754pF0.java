package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C11512a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.KotlinVersion;
/* renamed from: pF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46754pF0 {

    /* renamed from: pF0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C27192a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f103314a;

        static {
            int[] iArr = new int[C11512a.EnumC11514b.values().length];
            f103314a = iArr;
            try {
                iArr[C11512a.EnumC11514b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f103314a[C11512a.EnumC11514b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f103314a[C11512a.EnumC11514b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f103314a[C11512a.EnumC11514b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f103314a[C11512a.EnumC11514b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f103314a[C11512a.EnumC11514b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f103314a[C11512a.EnumC11514b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    public static int m19739a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: b */
    public static void m19738b(C11512a c11512a, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + c11512a.m67859c();
        try {
            boolean z = true;
            switch (C27192a.f103314a[c11512a.m67858d().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int m19739a = m19739a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int m19739a2 = m19739a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((m19739a << 16) | (m19739a((int) (fArr[3] * 255.0f)) << 24) | (m19739a2 << 8) | m19739a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m19739a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m19739a((int) (fArr[3] * 255.0f)) << 24) | (m19739a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m19739a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + c11512a.m67859c());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            Log.e("CustomSupport", "cannot access method " + str + " on View \"" + FU0.m107117d(view) + "\"");
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            Log.e("CustomSupport", "no method " + str + " on View \"" + FU0.m107117d(view) + "\"");
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }
}
