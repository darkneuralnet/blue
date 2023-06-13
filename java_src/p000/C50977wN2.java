package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u001c\u0010\t\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Lkotlin/reflect/KClass;", "kClass", "", "allowFunctions", "", C17296a.f69688o, "Ljava/lang/Class;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;)Z", "isData", "mvrx-common"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: wN2 */
/* loaded from: classes2.dex */
public final class C50977wN2 {
    /* renamed from: a */
    public static final void m6961a(KClass<?> kClass, boolean z) {
        Object m116783constructorimpl;
        Object m116783constructorimpl2;
        Object m116783constructorimpl3;
        Object m116783constructorimpl4;
        Object m116783constructorimpl5;
        List listOfNotNull;
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        if (m6958d(JvmClassMappingKt.getJavaClass((KClass) kClass))) {
            Class[] clsArr = new Class[7];
            clsArr[0] = ArrayList.class;
            clsArr[1] = HashMap.class;
            try {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(Class.forName("android.util.SparseArray"));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                m116783constructorimpl = null;
            }
            clsArr[2] = (Class) m116783constructorimpl;
            try {
                Object obj2 = C46602oz2.f102858f;
                m116783constructorimpl2 = Result.m116783constructorimpl(C46602oz2.class);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl2 = Result.m116783constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl2)) {
                m116783constructorimpl2 = null;
            }
            clsArr[3] = (Class) m116783constructorimpl2;
            try {
                Object obj3 = LN5.f21355f;
                m116783constructorimpl3 = Result.m116783constructorimpl(LN5.class);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.Companion;
                m116783constructorimpl3 = Result.m116783constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl3)) {
                m116783constructorimpl3 = null;
            }
            clsArr[4] = (Class) m116783constructorimpl3;
            try {
                m116783constructorimpl4 = Result.m116783constructorimpl(C28385so.class);
            } catch (Throwable th4) {
                Result.Companion companion5 = Result.Companion;
                m116783constructorimpl4 = Result.m116783constructorimpl(ResultKt.createFailure(th4));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl4)) {
                m116783constructorimpl4 = null;
            }
            clsArr[5] = (Class) m116783constructorimpl4;
            try {
                m116783constructorimpl5 = Result.m116783constructorimpl(Class.forName("android.util.ArrayMap"));
            } catch (Throwable th5) {
                Result.Companion companion6 = Result.Companion;
                m116783constructorimpl5 = Result.m116783constructorimpl(ResultKt.createFailure(th5));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl5)) {
                m116783constructorimpl5 = null;
            }
            clsArr[6] = (Class) m116783constructorimpl5;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) clsArr);
            Field[] declaredFields = JvmClassMappingKt.getJavaClass((KClass) kClass).getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "kClass.java.declaredFields");
            ArrayList<Field> arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (!Modifier.isTransient(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            for (Field prop : arrayList) {
                Iterator it = listOfNotNull.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        Intrinsics.checkNotNullExpressionValue(prop, "prop");
                        if (m6959c(prop, JvmClassMappingKt.getKotlinClass((Class) obj))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Class cls = (Class) obj;
                if (!Modifier.isFinal(prop.getModifiers())) {
                    str = "State property " + prop.getName() + " must be a val, not a var.";
                    continue;
                } else if (cls != null) {
                    str = "You cannot use " + cls.getSimpleName() + " for " + prop.getName() + ".\nUse the immutable listOf(...) method instead. You can append it with `val newList = listA + listB`";
                    continue;
                } else {
                    if (!z) {
                        Intrinsics.checkNotNullExpressionValue(prop, "prop");
                        if (m6959c(prop, Reflection.getOrCreateKotlinClass(Function.class), Reflection.getOrCreateKotlinClass(KCallable.class))) {
                            str = "You cannot use functions inside Mavericks state. Only pure data should be represented: " + prop.getName();
                            continue;
                        }
                    }
                    str = null;
                    continue;
                }
                if (str != null) {
                    throw new IllegalArgumentException("Invalid property in state " + kClass.getSimpleName() + ": " + str);
                }
            }
            return;
        }
        throw new IllegalArgumentException(("Mavericks state must be a data class! - " + kClass.getSimpleName()).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ void m6960b(KClass kClass, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m6961a(kClass, z);
    }

    /* renamed from: c */
    public static final boolean m6959c(Field field, KClass<?>... kClassArr) {
        if (kClassArr.length <= 0) {
            return false;
        }
        KClass<?> kClass = kClassArr[0];
        Class<?> type = field.getType();
        if (type instanceof ParameterizedType) {
            Class javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass);
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            return javaClass.isAssignableFrom((Class) rawType);
        }
        return JvmClassMappingKt.getJavaClass((KClass) kClass).isAssignableFrom(type);
    }

    /* renamed from: d */
    public static final boolean m6958d(Class<?> cls) {
        boolean z;
        Method method;
        Method method2;
        Method method3;
        boolean startsWith$default;
        boolean z2;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Method method4 = declaredMethods[i];
                if (Intrinsics.areEqual(method4.getName(), "copy$default") && method4.isSynthetic()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        Method[] declaredMethods2 = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods2, "declaredMethods");
        int length2 = declaredMethods2.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 < length2) {
                method2 = declaredMethods2[i2];
                String name = method2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "it.name");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "component1", false, 2, null);
                if (startsWith$default) {
                    break;
                }
                i2++;
            } else {
                method2 = null;
                break;
            }
        }
        if (method2 == null) {
            return false;
        }
        Method[] declaredMethods3 = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods3, "declaredMethods");
        int length3 = declaredMethods3.length;
        int i3 = 0;
        while (true) {
            if (i3 < length3) {
                method3 = declaredMethods3[i3];
                if (Intrinsics.areEqual(method3.getName(), "equals")) {
                    break;
                }
                i3++;
            } else {
                method3 = null;
                break;
            }
        }
        if (method3 == null) {
            return false;
        }
        Method[] declaredMethods4 = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods4, "declaredMethods");
        int length4 = declaredMethods4.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length4) {
                break;
            }
            Method method5 = declaredMethods4[i4];
            if (Intrinsics.areEqual(method5.getName(), "hashCode")) {
                method = method5;
                break;
            }
            i4++;
        }
        if (method == null) {
            return false;
        }
        return true;
    }
}
