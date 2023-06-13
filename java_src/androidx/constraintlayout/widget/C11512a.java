package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C11512a {

    /* renamed from: a */
    public boolean f54054a;

    /* renamed from: b */
    public String f54055b;

    /* renamed from: c */
    public EnumC11514b f54056c;

    /* renamed from: d */
    public int f54057d;

    /* renamed from: e */
    public float f54058e;

    /* renamed from: f */
    public String f54059f;

    /* renamed from: g */
    public boolean f54060g;

    /* renamed from: h */
    public int f54061h;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11513a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54062a;

        static {
            int[] iArr = new int[EnumC11514b.values().length];
            f54062a = iArr;
            try {
                iArr[EnumC11514b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54062a[EnumC11514b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54062a[EnumC11514b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54062a[EnumC11514b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54062a[EnumC11514b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54062a[EnumC11514b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54062a[EnumC11514b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54062a[EnumC11514b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: classes.dex */
    public enum EnumC11514b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C11512a(String str, EnumC11514b enumC11514b, Object obj, boolean z) {
        this.f54055b = str;
        this.f54056c = enumC11514b;
        this.f54054a = z;
        m67851k(obj);
    }

    /* renamed from: b */
    public static HashMap<String, C11512a> m67860b(HashMap<String, C11512a> hashMap, View view) {
        HashMap<String, C11512a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C11512a c11512a = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new C11512a(c11512a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new C11512a(c11512a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: i */
    public static void m67853i(Context context, XmlPullParser xmlPullParser, HashMap<String, C11512a> hashMap) {
        EnumC11514b enumC11514b;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC11514b enumC11514b2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C39341cm4.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C39341cm4.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == C39341cm4.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC11514b2 = EnumC11514b.BOOLEAN_TYPE;
            } else {
                if (index == C39341cm4.CustomAttribute_customColorValue) {
                    enumC11514b = EnumC11514b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C39341cm4.CustomAttribute_customColorDrawableValue) {
                    enumC11514b = EnumC11514b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C39341cm4.CustomAttribute_customPixelDimension) {
                    enumC11514b = EnumC11514b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C39341cm4.CustomAttribute_customDimension) {
                    enumC11514b = EnumC11514b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C39341cm4.CustomAttribute_customFloatValue) {
                    enumC11514b = EnumC11514b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C39341cm4.CustomAttribute_customIntegerValue) {
                    enumC11514b = EnumC11514b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C39341cm4.CustomAttribute_customStringValue) {
                    enumC11514b = EnumC11514b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == C39341cm4.CustomAttribute_customReference) {
                    enumC11514b = EnumC11514b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                enumC11514b2 = enumC11514b;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C11512a(str, enumC11514b2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    public static void m67852j(View view, HashMap<String, C11512a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            C11512a c11512a = hashMap.get(str2);
            if (!c11512a.f54054a) {
                str = "set" + str2;
            } else {
                str = str2;
            }
            try {
                switch (C11513a.f54062a[c11512a.f54056c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c11512a.f54057d));
                        break;
                    case 2:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(c11512a.f54060g));
                        break;
                    case 3:
                        cls.getMethod(str, CharSequence.class).invoke(view, c11512a.f54059f);
                        break;
                    case 4:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c11512a.f54061h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c11512a.f54061h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c11512a.f54057d));
                        break;
                    case 7:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(c11512a.f54058e));
                        break;
                    case 8:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(c11512a.f54058e));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m67861a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f54055b;
        if (!this.f54054a) {
            str = "set" + str2;
        } else {
            str = str2;
        }
        try {
            switch (C11513a.f54062a[this.f54056c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f54057d));
                    return;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f54060g));
                    return;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f54059f);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f54061h));
                    return;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f54061h);
                    method.invoke(view, colorDrawable);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f54058e));
                    return;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f54058e));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            Log.e("TransitionLayout", e2.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" must have a method ");
            sb.append(str);
            Log.e("TransitionLayout", sb.toString());
        } catch (InvocationTargetException e3) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e3.printStackTrace();
        }
    }

    /* renamed from: c */
    public String m67859c() {
        return this.f54055b;
    }

    /* renamed from: d */
    public EnumC11514b m67858d() {
        return this.f54056c;
    }

    /* renamed from: e */
    public float m67857e() {
        switch (C11513a.f54062a[this.f54056c.ordinal()]) {
            case 2:
                if (this.f54060g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f54057d;
            case 7:
                return this.f54058e;
            case 8:
                return this.f54058e;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: f */
    public void m67856f(float[] fArr) {
        float f;
        switch (C11513a.f54062a[this.f54056c.ordinal()]) {
            case 2:
                if (this.f54060g) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.f54061h;
                int i2 = (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i3 = (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i4 = (i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
                int i5 = i & KotlinVersion.MAX_COMPONENT_VALUE;
                float pow = (float) Math.pow(i3 / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(i4 / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow(i5 / 255.0f, 2.2d);
                fArr[3] = i2 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f54057d;
                return;
            case 7:
                fArr[0] = this.f54058e;
                return;
            case 8:
                fArr[0] = this.f54058e;
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public boolean m67855g() {
        int i = C11513a.f54062a[this.f54056c.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    /* renamed from: h */
    public int m67854h() {
        int i = C11513a.f54062a[this.f54056c.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    /* renamed from: k */
    public void m67851k(Object obj) {
        switch (C11513a.f54062a[this.f54056c.ordinal()]) {
            case 1:
            case 6:
                this.f54057d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f54060g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f54059f = (String) obj;
                return;
            case 4:
            case 5:
                this.f54061h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f54058e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f54058e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C11512a(C11512a c11512a, Object obj) {
        this.f54054a = false;
        this.f54055b = c11512a.f54055b;
        this.f54056c = c11512a.f54056c;
        m67851k(obj);
    }
}
