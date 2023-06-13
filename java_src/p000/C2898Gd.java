package p000;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0002\u0006\u0004B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0015"}, m28432d2 = {"LGd;", "", "", "LGd$b;", "b", "", C17296a.f69688o, "", "Z", "initialized", "Ljava/lang/Object;", "windowManagerObj", "Ljava/lang/reflect/Field;", "c", "Ljava/lang/reflect/Field;", "viewsField", DateTokenConverter.CONVERTER_KEY, "paramsField", "<init>", "()V", "f", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Gd */
/* loaded from: classes5.dex */
public final class C2898Gd {

    /* renamed from: e */
    public static final String f12166e;

    /* renamed from: f */
    public static final C2899a f12167f = new C2899a(null);

    /* renamed from: a */
    public boolean f12168a;

    /* renamed from: b */
    public Object f12169b;

    /* renamed from: c */
    public Field f12170c;

    /* renamed from: d */
    public Field f12171d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"LGd$a;", "", "", "GET_DEFAULT_IMPL", "Ljava/lang/String;", "GET_GLOBAL_INSTANCE", "TAG", "VIEWS_FIELD", "WINDOW_MANAGER_GLOBAL_CLAZZ", "WINDOW_MANAGER_IMPL_CLAZZ", "WINDOW_PARAMS_FIELD", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Gd$a */
    /* loaded from: classes5.dex */
    public static final class C2899a {
        private C2899a() {
        }

        public /* synthetic */ C2899a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, m28432d2 = {"LGd$b;", "", "Landroid/view/View;", C17296a.f69688o, "Landroid/view/View;", "b", "()Landroid/view/View;", "view", "Landroid/view/WindowManager$LayoutParams;", "Landroid/view/WindowManager$LayoutParams;", "()Landroid/view/WindowManager$LayoutParams;", "param", "<init>", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Gd$b */
    /* loaded from: classes5.dex */
    public static final class C2900b {

        /* renamed from: a */
        public final View f12172a;

        /* renamed from: b */
        public final WindowManager.LayoutParams f12173b;

        public C2900b(View view, WindowManager.LayoutParams param) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(param, "param");
            this.f12172a = view;
            this.f12173b = param;
        }

        /* renamed from: a */
        public final WindowManager.LayoutParams m104952a() {
            return this.f12173b;
        }

        /* renamed from: b */
        public final View m104951b() {
            return this.f12172a;
        }
    }

    static {
        String simpleName = C2898Gd.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "AndroidRootResolver::class.java.simpleName");
        f12166e = simpleName;
    }

    /* renamed from: a */
    public final void m104954a() {
        this.f12168a = true;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(accessClass)");
            Method method = cls.getMethod("getInstance", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "clazz.getMethod(instanceMethod)");
            this.f12169b = method.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mViews");
            this.f12170c = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = cls.getDeclaredField("mParams");
            this.f12171d = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (ClassNotFoundException e) {
            String str = f12166e;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("could not find class: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            Log.d(str, format, e);
        } catch (IllegalAccessException e2) {
            String str2 = f12166e;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            Log.d(str2, format2, e2);
        } catch (NoSuchFieldException e3) {
            String str3 = f12166e;
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String format3 = String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"}, 3));
            Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(format, *args)");
            Log.d(str3, format3, e3);
        } catch (NoSuchMethodException e4) {
            String str4 = f12166e;
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String format4 = String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2));
            Intrinsics.checkNotNullExpressionValue(format4, "java.lang.String.format(format, *args)");
            Log.d(str4, format4, e4);
        } catch (RuntimeException e5) {
            String str5 = f12166e;
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            String format5 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}, 3));
            Intrinsics.checkNotNullExpressionValue(format5, "java.lang.String.format(format, *args)");
            Log.d(str5, format5, e5);
        } catch (InvocationTargetException e6) {
            String str6 = f12166e;
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            String format6 = String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{"getInstance", "android.view.WindowManagerGlobal"}, 2));
            Intrinsics.checkNotNullExpressionValue(format6, "java.lang.String.format(format, *args)");
            Log.d(str6, format6, e6.getCause());
        }
    }

    /* renamed from: b */
    public final List<C2900b> m104953b() {
        Object obj;
        Object obj2;
        List<Pair> zip;
        if (!this.f12168a) {
            m104954a();
        }
        Object obj3 = this.f12169b;
        if (obj3 == null) {
            Log.d(f12166e, "No reflective access to windowmanager object.");
            return null;
        }
        Field field = this.f12170c;
        if (field == null) {
            Log.d(f12166e, "No reflective access to mViews");
            return null;
        } else if (this.f12171d == null) {
            Log.d(f12166e, "No reflective access to mPArams");
            return null;
        } else {
            if (field != null) {
                try {
                    obj = field.get(obj3);
                } catch (IllegalAccessException e) {
                    String str = f12166e;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f12170c, this.f12171d, this.f12169b}, 3));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    Log.d(str, format, e);
                    return null;
                } catch (RuntimeException e2) {
                    String str2 = f12166e;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.f12170c, this.f12171d, this.f12169b}, 3));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                    Log.d(str2, format2, e2);
                    return null;
                }
            } else {
                obj = null;
            }
            List list = (List) obj;
            Field field2 = this.f12171d;
            if (field2 != null) {
                obj2 = field2.get(this.f12169b);
            } else {
                obj2 = null;
            }
            List list2 = (List) obj2;
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            List list3 = list;
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            zip = CollectionsKt___CollectionsKt.zip(list3, list2);
            for (Pair pair : zip) {
                arrayList.add(new C2900b((View) pair.component1(), (WindowManager.LayoutParams) pair.component2()));
            }
            return arrayList;
        }
    }
}
