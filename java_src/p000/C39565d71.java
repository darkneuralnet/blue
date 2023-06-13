package p000;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: d71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39565d71 {

    /* renamed from: a */
    public static final int[] f76130a = {16842912};

    /* renamed from: b */
    public static final int[] f76131b = new int[0];

    /* renamed from: c */
    public static final Rect f76132c = new Rect();

    /* renamed from: d71$a */
    /* loaded from: classes.dex */
    public static class C19676a {

        /* renamed from: a */
        public static final boolean f76133a;

        /* renamed from: b */
        public static final Method f76134b;

        /* renamed from: c */
        public static final Field f76135c;

        /* renamed from: d */
        public static final Field f76136d;

        /* renamed from: e */
        public static final Field f76137e;

        /* renamed from: f */
        public static final Field f76138f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field3 = null;
                    }
                    try {
                        field4 = cls.getField("bottom");
                        z = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field4 = null;
                        z = false;
                        if (!z) {
                        }
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (!z) {
                }
            }
            if (!z) {
                f76134b = method;
                f76135c = field;
                f76136d = field2;
                f76137e = field3;
                f76138f = field4;
                f76133a = true;
                return;
            }
            f76134b = null;
            f76135c = null;
            f76136d = null;
            f76137e = null;
            f76138f = null;
            f76133a = false;
        }

        private C19676a() {
        }

        /* renamed from: a */
        public static Rect m44597a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f76133a) {
                try {
                    Object invoke = f76134b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f76135c.getInt(invoke), f76136d.getInt(invoke), f76137e.getInt(invoke), f76138f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C39565d71.f76132c;
        }
    }

    /* renamed from: d71$b */
    /* loaded from: classes.dex */
    public static class C19677b {
        private C19677b() {
        }

        /* renamed from: a */
        public static Insets m44596a(Drawable drawable) {
            Insets opticalInsets;
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
    }

    private C39565d71() {
    }

    /* renamed from: a */
    public static boolean m44602a(Drawable drawable) {
        return true;
    }

    /* renamed from: b */
    public static void m44601b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m44600c(drawable);
        }
    }

    /* renamed from: c */
    public static void m44600c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f76131b);
        } else {
            drawable.setState(f76130a);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m44599d(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets m44596a = C19677b.m44596a(drawable);
            i = m44596a.left;
            i2 = m44596a.top;
            i3 = m44596a.right;
            i4 = m44596a.bottom;
            return new Rect(i, i2, i3, i4);
        }
        return C19676a.m44597a(P61.m90835q(drawable));
    }

    /* renamed from: e */
    public static PorterDuff.Mode m44598e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
