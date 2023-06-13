package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001aO\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0005\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\"\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0005\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001a\u001c\u0010\u000e\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001a$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001aQ\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\"\u0010\u0006\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0005\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000b\u001a\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\tH\u0002\u001a\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001a$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¨\u0006\u0015"}, m28432d2 = {"", "T", "Lkotlin/reflect/KClass;", "LKj2;", "b", "", "args", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/reflect/KClass;[LKj2;)LKj2;", "Ljava/lang/Class;", "c", "(Ljava/lang/Class;[LKj2;)LKj2;", "", "i", "j", "g", "jClass", "h", C17296a.f69688o, "e", "f", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,149:1\n1#2:150\n3133#3,11:151\n3133#3,11:163\n3133#3,11:174\n26#4:162\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n*L\n53#1:151,11\n136#1:163,11\n141#1:174,11\n107#1:162\n*E\n"})
/* renamed from: AV3 */
/* loaded from: classes8.dex */
public final class AV3 {
    /* renamed from: a */
    public static final Object m115713a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final <T> InterfaceC34036Kj2<T> m115712b(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return m115710d(kClass, new InterfaceC34036Kj2[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> InterfaceC34036Kj2<T> m115711c(Class<T> cls, InterfaceC34036Kj2<Object>... args) {
        InterfaceC34036Kj2<T> interfaceC34036Kj2;
        Object obj;
        Field field;
        InterfaceC34036Kj2<T> m115707g;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && m115705i(cls)) {
            return m115709e(cls);
        }
        if (cls.isInterface() && (m115707g = m115707g(cls)) != null) {
            return m115707g;
        }
        InterfaceC34036Kj2<T> m115706h = m115706h(cls, (InterfaceC34036Kj2[]) Arrays.copyOf(args, args.length));
        if (m115706h != null) {
            return m115706h;
        }
        InterfaceC34036Kj2<T> m115708f = m115708f(cls);
        if (m115708f != null) {
            return m115708f;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "declaredClasses");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = declaredClasses[i];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                }
            }
            cls2 = null;
            Class<?> cls4 = cls2;
            if (cls4 != null && (field = cls4.getField("INSTANCE")) != null) {
                obj = field.get(null);
            } else {
                obj = null;
            }
        } catch (NoSuchFieldException unused) {
        }
        if (obj instanceof InterfaceC34036Kj2) {
            interfaceC34036Kj2 = (InterfaceC34036Kj2) obj;
            if (interfaceC34036Kj2 == null) {
                return interfaceC34036Kj2;
            }
            if (!m115704j(cls)) {
                return null;
            }
            return new QX3(JvmClassMappingKt.getKotlinClass(cls));
        }
        interfaceC34036Kj2 = null;
        if (interfaceC34036Kj2 == null) {
        }
    }

    /* renamed from: d */
    public static final <T> InterfaceC34036Kj2<T> m115710d(KClass<T> kClass, InterfaceC34036Kj2<Object>... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return m115711c(JvmClassMappingKt.getJavaClass((KClass) kClass), (InterfaceC34036Kj2[]) Arrays.copyOf(args, args.length));
    }

    /* renamed from: e */
    public static final <T> InterfaceC34036Kj2<T> m115709e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "canonicalName");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C44622lf1(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
        if (r5 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> InterfaceC34036Kj2<T> m115708f(Class<T> cls) {
        boolean z;
        boolean z2;
        boolean z3;
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        boolean z4 = false;
        while (true) {
            if (i < length) {
                Field field2 = declaredFields[i];
                if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    field = field2;
                }
                i++;
            }
        }
        field = null;
        Field field3 = field;
        if (field3 == null) {
            return null;
        }
        Object obj = field3.get(null);
        Method[] methods = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        int length2 = methods.length;
        Method method = null;
        int i2 = 0;
        boolean z5 = false;
        while (true) {
            if (i2 < length2) {
                Method method2 = methods[i2];
                if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && Intrinsics.areEqual(method2.getReturnType(), InterfaceC34036Kj2.class)) {
                        z = true;
                        if (z) {
                            if (z5) {
                                break;
                            }
                            z5 = true;
                            method = method2;
                        }
                        i2++;
                    }
                }
                z = false;
                if (z) {
                }
                i2++;
            }
        }
        Method method3 = method;
        if (method3 == null) {
            return null;
        }
        Object invoke = method3.invoke(obj, new Object[0]);
        if (!(invoke instanceof InterfaceC34036Kj2)) {
            return null;
        }
        return (InterfaceC34036Kj2) invoke;
    }

    /* renamed from: g */
    public static final <T> InterfaceC34036Kj2<T> m115707g(Class<T> cls) {
        InterfaceC36928Ws5 interfaceC36928Ws5 = (InterfaceC36928Ws5) cls.getAnnotation(InterfaceC36928Ws5.class);
        if (interfaceC36928Ws5 != null && !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(interfaceC36928Ws5.with()), Reflection.getOrCreateKotlinClass(QX3.class))) {
            return null;
        }
        return new QX3(JvmClassMappingKt.getKotlinClass(cls));
    }

    /* renamed from: h */
    public static final <T> InterfaceC34036Kj2<T> m115706h(Class<?> cls, InterfaceC34036Kj2<Object>... interfaceC34036Kj2Arr) {
        boolean z;
        Class[] clsArr;
        Object m115713a = m115713a(cls);
        if (m115713a == null) {
            return null;
        }
        try {
            if (interfaceC34036Kj2Arr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC34036Kj2Arr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC34036Kj2.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = m115713a.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(m115713a, Arrays.copyOf(interfaceC34036Kj2Arr, interfaceC34036Kj2Arr.length));
            if (!(invoke instanceof InterfaceC34036Kj2)) {
                return null;
            }
            return (InterfaceC34036Kj2) invoke;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    /* renamed from: i */
    public static final <T> boolean m115705i(Class<T> cls) {
        if (cls.getAnnotation(InterfaceC36928Ws5.class) == null && cls.getAnnotation(NX3.class) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final <T> boolean m115704j(Class<T> cls) {
        if (cls.getAnnotation(NX3.class) != null) {
            return true;
        }
        InterfaceC36928Ws5 interfaceC36928Ws5 = (InterfaceC36928Ws5) cls.getAnnotation(InterfaceC36928Ws5.class);
        if (interfaceC36928Ws5 != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(interfaceC36928Ws5.with()), Reflection.getOrCreateKotlinClass(QX3.class))) {
            return true;
        }
        return false;
    }
}
