package p000;

import ch.qos.logback.classic.spi.CallerData;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
/* renamed from: Ki6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34031Ki6 {

    /* renamed from: a */
    public static final Type[] f20082a = new Type[0];

    /* renamed from: Ki6$a */
    /* loaded from: classes8.dex */
    public static final class C4553a implements GenericArrayType {

        /* renamed from: b */
        public final Type f20083b;

        public C4553a(Type type) {
            this.f20083b = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C34031Ki6.m98480d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f20083b;
        }

        public int hashCode() {
            return this.f20083b.hashCode();
        }

        public String toString() {
            return C34031Ki6.m98464t(this.f20083b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: Ki6$b */
    /* loaded from: classes8.dex */
    public static final class C4554b implements ParameterizedType {

        /* renamed from: b */
        public final Type f20084b;

        /* renamed from: c */
        public final Type f20085c;

        /* renamed from: d */
        public final Type[] f20086d;

        public C4554b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C34031Ki6.m98482b(type3);
            }
            this.f20084b = type;
            this.f20085c = type2;
            this.f20086d = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C34031Ki6.m98480d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f20086d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f20084b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f20085c;
        }

        public int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f20086d) ^ this.f20085c.hashCode();
            Type type = this.f20084b;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public String toString() {
            Type[] typeArr = this.f20086d;
            if (typeArr.length == 0) {
                return C34031Ki6.m98464t(this.f20085c);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C34031Ki6.m98464t(this.f20085c));
            sb.append("<");
            sb.append(C34031Ki6.m98464t(this.f20086d[0]));
            for (int i = 1; i < this.f20086d.length; i++) {
                sb.append(", ");
                sb.append(C34031Ki6.m98464t(this.f20086d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: Ki6$c */
    /* loaded from: classes8.dex */
    public static final class C4555c implements WildcardType {

        /* renamed from: b */
        public final Type f20087b;

        /* renamed from: c */
        public final Type f20088c;

        public C4555c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Type type = typeArr2[0];
                        type.getClass();
                        C34031Ki6.m98482b(type);
                        if (typeArr[0] == Object.class) {
                            this.f20088c = typeArr2[0];
                            this.f20087b = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Type type2 = typeArr[0];
                    type2.getClass();
                    C34031Ki6.m98482b(type2);
                    this.f20088c = null;
                    this.f20087b = typeArr[0];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C34031Ki6.m98480d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f20088c;
            return type != null ? new Type[]{type} : C34031Ki6.f20082a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f20087b};
        }

        public int hashCode() {
            Type type = this.f20088c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f20087b.hashCode() + 31);
        }

        public String toString() {
            if (this.f20088c != null) {
                return "? super " + C34031Ki6.m98464t(this.f20088c);
            } else if (this.f20087b == Object.class) {
                return CallerData.f61059NA;
            } else {
                return "? extends " + C34031Ki6.m98464t(this.f20087b);
            }
        }
    }

    private C34031Ki6() {
    }

    /* renamed from: a */
    public static ResponseBody m98483a(ResponseBody responseBody) throws IOException {
        C42488i30 c42488i30 = new C42488i30();
        responseBody.source().mo21941Z2(c42488i30);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), c42488i30);
    }

    /* renamed from: b */
    public static void m98482b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class<?> m98481c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m98480d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m98480d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: e */
    public static Type m98479e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m98479e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m98479e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m98478f(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getLowerBounds()[0];
        }
        return type;
    }

    /* renamed from: g */
    public static Type m98477g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class<?> m98476h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m98476h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m98476h(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* renamed from: i */
    public static Type m98475i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m98467q(type, cls, m98479e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m98474j(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m98474j(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m98474j(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: k */
    public static int m98473k(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m98472l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static RuntimeException m98471m(Method method, String str, Object... objArr) {
        return m98470n(method, null, str, objArr);
    }

    /* renamed from: n */
    public static RuntimeException m98470n(Method method, Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + InstructionFileId.DOT + method.getName(), th);
    }

    /* renamed from: o */
    public static RuntimeException m98469o(Method method, int i, String str, Object... objArr) {
        return m98471m(method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: p */
    public static RuntimeException m98468p(Method method, Throwable th, int i, String str, Object... objArr) {
        return m98470n(method, th, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m98467q(Type type, Class<?> cls, Type type2) {
        Type type3;
        boolean z;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type m98466r = m98466r(type, cls, typeVariable);
            if (m98466r == typeVariable) {
                return m98466r;
            }
            type3 = m98466r;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type m98467q = m98467q(type, cls, componentType);
                if (componentType != m98467q) {
                    return new C4553a(m98467q);
                }
                return cls2;
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type m98467q2 = m98467q(type, cls, genericComponentType);
            if (genericComponentType != m98467q2) {
                return new C4553a(m98467q2);
            }
            return genericArrayType;
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type m98467q3 = m98467q(type, cls, ownerType);
            if (m98467q3 != ownerType) {
                z = true;
            } else {
                z = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type m98467q4 = m98467q(type, cls, actualTypeArguments[i]);
                if (m98467q4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = m98467q4;
                }
            }
            if (z) {
                return new C4554b(m98467q3, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        }
        boolean z2 = type3 instanceof WildcardType;
        WildcardType wildcardType = type3;
        if (z2) {
            WildcardType wildcardType2 = (WildcardType) type3;
            Type[] lowerBounds = wildcardType2.getLowerBounds();
            Type[] upperBounds = wildcardType2.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type m98467q5 = m98467q(type, cls, lowerBounds[0]);
                wildcardType = wildcardType2;
                if (m98467q5 != lowerBounds[0]) {
                    return new C4555c(new Type[]{Object.class}, new Type[]{m98467q5});
                }
            } else {
                wildcardType = wildcardType2;
                if (upperBounds.length == 1) {
                    Type m98467q6 = m98467q(type, cls, upperBounds[0]);
                    wildcardType = wildcardType2;
                    if (m98467q6 != upperBounds[0]) {
                        return new C4555c(new Type[]{m98467q6}, f20082a);
                    }
                }
            }
        }
        return wildcardType;
    }

    /* renamed from: r */
    public static Type m98466r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m98481c = m98481c(typeVariable);
        if (m98481c == null) {
            return typeVariable;
        }
        Type m98479e = m98479e(type, cls, m98481c);
        if (m98479e instanceof ParameterizedType) {
            return ((ParameterizedType) m98479e).getActualTypeArguments()[m98473k(m98481c.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* renamed from: s */
    public static void m98465s(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th);
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    /* renamed from: t */
    public static String m98464t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
