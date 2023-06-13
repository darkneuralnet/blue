package p000;

import ch.qos.logback.classic.spi.CallerData;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;
import okhttp3.HttpUrl;
/* renamed from: b */
/* loaded from: classes6.dex */
public final class C12259b {

    /* renamed from: a */
    public static final Type[] f56760a = new Type[0];

    /* renamed from: b$a */
    /* loaded from: classes6.dex */
    public static final class C12260a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Type f56761b;

        public C12260a(Type type) {
            Objects.requireNonNull(type);
            this.f56761b = C12259b.m65160b(type);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && C12259b.m65156f(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f56761b;
        }

        public int hashCode() {
            return this.f56761b.hashCode();
        }

        public String toString() {
            return C12259b.m65142t(this.f56761b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: b$b */
    /* loaded from: classes6.dex */
    public static final class C12261b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Type f56762b;

        /* renamed from: c */
        public final Type f56763c;

        /* renamed from: d */
        public final Type[] f56764d;

        public C12261b(Type type, Type type2, Type... typeArr) {
            Type m65160b;
            boolean z;
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C10483a.m72139a(z2);
            }
            if (type == null) {
                m65160b = null;
            } else {
                m65160b = C12259b.m65160b(type);
            }
            this.f56762b = m65160b;
            this.f56763c = C12259b.m65160b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f56764d = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.f56764d[i]);
                C12259b.m65159c(this.f56764d[i]);
                Type[] typeArr3 = this.f56764d;
                typeArr3[i] = C12259b.m65160b(typeArr3[i]);
            }
        }

        /* renamed from: a */
        public static int m65141a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && C12259b.m65156f(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f56764d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f56762b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f56763c;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f56764d) ^ this.f56763c.hashCode()) ^ m65141a(this.f56762b);
        }

        public String toString() {
            int length = this.f56764d.length;
            if (length == 0) {
                return C12259b.m65142t(this.f56763c);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C12259b.m65142t(this.f56763c));
            sb.append("<");
            sb.append(C12259b.m65142t(this.f56764d[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C12259b.m65142t(this.f56764d[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: b$c */
    /* loaded from: classes6.dex */
    public static final class C12262c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Type f56765b;

        /* renamed from: c */
        public final Type f56766c;

        public C12262c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C10483a.m72139a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C10483a.m72139a(z2);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C12259b.m65159c(typeArr2[0]);
                C10483a.m72139a(typeArr[0] == Object.class);
                this.f56766c = C12259b.m65160b(typeArr2[0]);
                this.f56765b = Object.class;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            C12259b.m65159c(typeArr[0]);
            this.f56766c = null;
            this.f56765b = C12259b.m65160b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && C12259b.m65156f(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f56766c;
            return type != null ? new Type[]{type} : C12259b.f56760a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f56765b};
        }

        public int hashCode() {
            int i;
            Type type = this.f56766c;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f56765b.hashCode() + 31);
        }

        public String toString() {
            if (this.f56766c != null) {
                return "? super " + C12259b.m65142t(this.f56766c);
            } else if (this.f56765b == Object.class) {
                return CallerData.f61059NA;
            } else {
                return "? extends " + C12259b.m65142t(this.f56765b);
            }
        }
    }

    private C12259b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static GenericArrayType m65161a(Type type) {
        return new C12260a(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [b$a] */
    /* renamed from: b */
    public static Type m65160b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new C12260a(m65160b(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C12261b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C12260a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new C12262c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    /* renamed from: c */
    public static void m65159c(Type type) {
        C10483a.m72139a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    public static Class<?> m65158d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m65157e(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* renamed from: f */
    public static boolean m65156f(Type type, Type type2) {
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
            if (m65157e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m65156f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: g */
    public static Type m65155g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m65154h(Type type, Class<?> cls) {
        Type m65150l = m65150l(type, cls, Collection.class);
        if (m65150l instanceof ParameterizedType) {
            return ((ParameterizedType) m65150l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: i */
    public static Type m65153i(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m65153i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m65153i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m65152j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m65150l = m65150l(type, cls, Map.class);
        return m65150l instanceof ParameterizedType ? ((ParameterizedType) m65150l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m65151k(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C10483a.m72139a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m65151k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m65151k(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: l */
    public static Type m65150l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C10483a.m72139a(cls2.isAssignableFrom(cls));
        return m65147o(type, cls, m65153i(type, cls, cls2));
    }

    /* renamed from: m */
    public static int m65149m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: n */
    public static ParameterizedType m65148n(Type type, Type type2, Type... typeArr) {
        return new C12261b(type, type2, typeArr);
    }

    /* renamed from: o */
    public static Type m65147o(Type type, Class<?> cls, Type type2) {
        return m65146p(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00de, code lost:
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m65146p(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type m65146p;
        Type m65148n;
        TypeVariable typeVariable = null;
        ?? r11 = type2;
        while (true) {
            if (r11 instanceof TypeVariable) {
                TypeVariable typeVariable2 = r11;
                Type type3 = (Type) map.get(typeVariable2);
                if (type3 != null) {
                    if (type3 != Void.TYPE) {
                        return type3;
                    }
                    return r11;
                }
                map.put(typeVariable2, Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                r11 = m65145q(type, cls, typeVariable2);
                r11 = r11;
                if (r11 == typeVariable2) {
                    break;
                }
            } else {
                if (r11 instanceof Class) {
                    Class cls2 = r11;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type m65146p2 = m65146p(type, cls, componentType, map);
                        if (m65157e(componentType, m65146p2)) {
                            r11 = cls2;
                        } else {
                            m65148n = m65161a(m65146p2);
                            r11 = m65148n;
                        }
                    }
                }
                if (r11 instanceof GenericArrayType) {
                    r11 = (GenericArrayType) r11;
                    Type genericComponentType = r11.getGenericComponentType();
                    Type m65146p3 = m65146p(type, cls, genericComponentType, map);
                    if (!m65157e(genericComponentType, m65146p3)) {
                        m65148n = m65161a(m65146p3);
                        r11 = m65148n;
                    }
                } else {
                    if (r11 instanceof ParameterizedType) {
                        r11 = (ParameterizedType) r11;
                        Type ownerType = r11.getOwnerType();
                        Type m65146p4 = m65146p(type, cls, ownerType, map);
                        boolean z = !m65157e(m65146p4, ownerType);
                        Type[] actualTypeArguments = r11.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i = 0; i < length; i++) {
                            Type m65146p5 = m65146p(type, cls, actualTypeArguments[i], map);
                            if (!m65157e(m65146p5, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = m65146p5;
                            }
                        }
                        if (z) {
                            m65148n = m65148n(m65146p4, r11.getRawType(), actualTypeArguments);
                            r11 = m65148n;
                        }
                    } else if (r11 instanceof WildcardType) {
                        r11 = (WildcardType) r11;
                        Type[] lowerBounds = r11.getLowerBounds();
                        Type[] upperBounds = r11.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type m65146p6 = m65146p(type, cls, lowerBounds[0], map);
                            if (m65146p6 != lowerBounds[0]) {
                                r11 = m65143s(m65146p6);
                            }
                        } else if (upperBounds.length == 1 && (m65146p = m65146p(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            r11 = m65144r(m65146p);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public static Type m65145q(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m65158d = m65158d(typeVariable);
        if (m65158d == null) {
            return typeVariable;
        }
        Type m65153i = m65153i(type, cls, m65158d);
        if (m65153i instanceof ParameterizedType) {
            return ((ParameterizedType) m65153i).getActualTypeArguments()[m65149m(m65158d.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    /* renamed from: r */
    public static WildcardType m65144r(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C12262c(typeArr, f56760a);
    }

    /* renamed from: s */
    public static WildcardType m65143s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C12262c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: t */
    public static String m65142t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
