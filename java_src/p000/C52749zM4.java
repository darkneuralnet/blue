package p000;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
/* renamed from: zM4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52749zM4 {

    /* renamed from: a */
    public static Field f121126a;

    /* renamed from: b */
    public static boolean f121127b;

    /* renamed from: c */
    public static Class<?> f121128c;

    /* renamed from: d */
    public static boolean f121129d;

    /* renamed from: e */
    public static Field f121130e;

    /* renamed from: f */
    public static boolean f121131f;

    /* renamed from: g */
    public static Field f121132g;

    /* renamed from: h */
    public static boolean f121133h;

    /* renamed from: zM4$a */
    /* loaded from: classes.dex */
    public static class C30959a {
        private C30959a() {
        }

        /* renamed from: a */
        public static void m1510a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    private C52749zM4() {
    }

    /* renamed from: a */
    public static void m1513a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        m1512b(resources);
    }

    /* renamed from: b */
    public static void m1512b(Resources resources) {
        Object obj;
        if (!f121133h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f121132g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f121133h = true;
        }
        Field field = f121132g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f121127b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f121126a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f121127b = true;
        }
        Field field2 = f121126a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m1511c(obj2);
        }
    }

    /* renamed from: c */
    public static void m1511c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f121129d) {
            try {
                f121128c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f121129d = true;
        }
        Class<?> cls = f121128c;
        if (cls == null) {
            return;
        }
        if (!f121131f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f121130e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f121131f = true;
        }
        Field field = f121130e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            C30959a.m1510a(longSparseArray);
        }
    }
}
