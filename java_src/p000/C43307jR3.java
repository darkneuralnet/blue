package p000;

import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a)\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\bH\u0002\u001a&\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0002\u001a+\u0010\u0017\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0001*\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001c\"\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m28432d2 = {"LAN2;", "T", TransferTable.COLUMN_STATE, "", "validation", "Landroid/os/Bundle;", "e", "(LAN2;Z)Landroid/os/Bundle;", "Ljava/lang/Class;", "Ljava/lang/reflect/Constructor;", "g", "", "componentIndex", "Ljava/lang/reflect/Method;", "c", "", "value", "", C17296a.f69688o, "item", "b", "", "key", "h", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)Landroid/os/Bundle;", "bundle", "initialState", "i", "(Landroid/os/Bundle;LAN2;Z)LAN2;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;)Ljava/lang/Object;", "defaultParameterValue", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: jR3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43307jR3 {
    /* renamed from: a */
    public static final void m30621a(Object obj) {
        List<Object> filterNotNull;
        if (obj instanceof Collection) {
            filterNotNull = CollectionsKt___CollectionsKt.filterNotNull((Iterable) obj);
            for (Object obj2 : filterNotNull) {
                m30620b(obj2);
            }
        } else if (obj instanceof Map) {
            ArrayList<Object> arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
            for (Object obj3 : arrayList) {
                m30620b(obj3);
            }
        }
    }

    /* renamed from: b */
    public static final void m30620b(Object obj) {
        if ((obj instanceof Serializable) || (obj instanceof Parcelable)) {
            return;
        }
        throw new IllegalStateException(("Cannot parcel " + obj.getClass().getSimpleName()).toString());
    }

    /* renamed from: c */
    public static final <T extends AN2> Method m30619c(Class<? extends T> cls, int i) {
        Method method;
        boolean startsWith$default;
        String str = "component" + (i + 1);
        try {
            method = cls.getDeclaredMethod(str, new Class[0]);
        } catch (NoSuchMethodException unused) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaredMethods");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    Method method2 = declaredMethods[i2];
                    String name = method2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, str + '$', false, 2, null);
                    if (startsWith$default) {
                        method = method2;
                        break;
                    }
                    i2++;
                } else {
                    method = null;
                    break;
                }
            }
        }
        if (method != null) {
            method.setAccessible(true);
            return method;
        }
        throw new IllegalStateException(("Unable to find function " + str + " in " + Reflection.getOrCreateKotlinClass(cls.getClass()).getSimpleName()).toString());
    }

    /* renamed from: d */
    public static final Object m30618d(Class<?> cls) {
        if (Intrinsics.areEqual(cls, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.areEqual(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.areEqual(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.areEqual(cls, Character.TYPE)) {
            return 'A';
        }
        if (Intrinsics.areEqual(cls, Byte.TYPE)) {
            return Byte.valueOf((byte) ByteCompanionObject.MIN_VALUE);
        }
        if (Intrinsics.areEqual(cls, Short.TYPE)) {
            return Short.valueOf((short) ShortCompanionObject.MIN_VALUE);
        }
        if (Intrinsics.areEqual(cls, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.areEqual(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends AN2> Bundle m30617e(T state, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(state, "state");
        Class<?> cls = state.getClass();
        Constructor<?> m30615g = m30615g(cls);
        if (m30615g == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        Annotation[][] parameterAnnotations = m30615g.getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "constructor.parameterAnnotations");
        int length = parameterAnnotations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            Annotation[] p = parameterAnnotations[i];
            Intrinsics.checkNotNullExpressionValue(p, "p");
            int length2 = p.length;
            int i4 = 0;
            while (true) {
                if (i4 < length2) {
                    if (p[i4] instanceof InterfaceC42714iR3) {
                        z2 = false;
                        break;
                    }
                    i4++;
                } else {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                Object invoke = m30619c(cls, i2).invoke(state, new Object[0]);
                if (z) {
                    m30621a(invoke);
                }
                m30614h(bundle, String.valueOf(i2), invoke);
            }
            i++;
            i2 = i3;
        }
        return bundle;
    }

    /* renamed from: f */
    public static /* synthetic */ Bundle m30616f(AN2 an2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m30617e(an2, z);
    }

    /* renamed from: g */
    public static final <T extends AN2> Constructor<?> m30615g(Class<? extends T> cls) {
        boolean z;
        boolean z2;
        Constructor<?>[] constructors = cls.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "constructors");
        for (Constructor<?> constructor : constructors) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "constructor.parameterAnnotations");
            int length = parameterAnnotations.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Annotation[] paramAnnotations = parameterAnnotations[i];
                    Intrinsics.checkNotNullExpressionValue(paramAnnotations, "paramAnnotations");
                    int length2 = paramAnnotations.length;
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 < length2) {
                            if (paramAnnotations[i2] instanceof InterfaceC42714iR3) {
                                z2 = true;
                                break;
                            }
                            i2++;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return constructor;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static final <T> Bundle m30614h(Bundle bundle, String str, T t) {
        if (t instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) t);
        } else if (t instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) t);
        } else if (t == null) {
            bundle.putString(str, null);
        } else {
            throw new IllegalStateException(("Cannot persist " + str + ". It must be null, Serializable, or Parcelable.").toString());
        }
        return bundle;
    }

    /* renamed from: i */
    public static final <T extends AN2> T m30613i(Bundle bundle, T initialState, boolean z) {
        Integer[] typedArray;
        boolean z2;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Class<?> cls = initialState.getClass();
        Constructor<?> m30615g = m30615g(cls);
        if (m30615g == null) {
            return initialState;
        }
        bundle.setClassLoader(cls.getClassLoader());
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "jvmClass.declaredMethods");
        for (Method method : declaredMethods) {
            if (Intrinsics.areEqual(method.getName(), "copy$default")) {
                int length = m30615g.getParameterTypes().length;
                int i = (length / 32) + 1;
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = 0;
                }
                Object[] objArr = new Object[length];
                objArr[0] = initialState;
                for (int i3 = 0; i3 < length; i3++) {
                    String valueOf = String.valueOf(i3);
                    if (bundle.containsKey(valueOf)) {
                        objArr[i3] = bundle.get(valueOf);
                    } else {
                        if (z) {
                            Annotation[] annotationArr = m30615g.getParameterAnnotations()[i3];
                            Intrinsics.checkNotNullExpressionValue(annotationArr, "constructor.parameterAnnotations[i]");
                            int length2 = annotationArr.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 < length2) {
                                    if (annotationArr[i4] instanceof InterfaceC42714iR3) {
                                        z2 = true;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z2) {
                                throw new IllegalStateException(("savedInstanceState bundle should have a key for state property at position " + i3 + " but it was missing.").toString());
                            }
                        }
                        int i5 = i3 / 32;
                        iArr[i5] = iArr[i5] | (1 << (i3 % 32));
                        Class<?> cls2 = method.getParameterTypes()[i3 + 1];
                        Intrinsics.checkNotNullExpressionValue(cls2, "copyFunction.parameterTypes[i + 1]");
                        objArr[i3] = m30618d(cls2);
                    }
                }
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.add(initialState);
                spreadBuilder.addSpread(objArr);
                typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
                spreadBuilder.addSpread(typedArray);
                spreadBuilder.add(null);
                Object invoke = method.invoke(null, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of com.airbnb.mvrx.PersistStateKt.restorePersistedMavericksState");
                return (T) invoke;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* renamed from: j */
    public static /* synthetic */ AN2 m30612j(Bundle bundle, AN2 an2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m30613i(bundle, an2, z);
    }
}
