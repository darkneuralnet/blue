package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.InterfaceC46544ot4;
/* loaded from: classes6.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC32096Cb6 {

    /* renamed from: b */
    public final C47193pz0 f74539b;

    /* renamed from: c */
    public final InterfaceC36852Wk1 f74540c;

    /* renamed from: d */
    public final Excluder f74541d;

    /* renamed from: e */
    public final JsonAdapterAnnotationTypeAdapterFactory f74542e;

    /* renamed from: f */
    public final List<InterfaceC46544ot4> f74543f;

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    /* loaded from: classes6.dex */
    public class C18402a extends AbstractC18404c {

        /* renamed from: f */
        public final /* synthetic */ boolean f74544f;

        /* renamed from: g */
        public final /* synthetic */ Method f74545g;

        /* renamed from: h */
        public final /* synthetic */ boolean f74546h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC31862Bb6 f74547i;

        /* renamed from: j */
        public final /* synthetic */ C46153oE1 f74548j;

        /* renamed from: k */
        public final /* synthetic */ C32798Fb6 f74549k;

        /* renamed from: l */
        public final /* synthetic */ boolean f74550l;

        /* renamed from: m */
        public final /* synthetic */ boolean f74551m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18402a(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, AbstractC31862Bb6 abstractC31862Bb6, C46153oE1 c46153oE1, C32798Fb6 c32798Fb6, boolean z5, boolean z6) {
            super(str, field, z, z2);
            this.f74544f = z3;
            this.f74545g = method;
            this.f74546h = z4;
            this.f74547i = abstractC31862Bb6;
            this.f74548j = c46153oE1;
            this.f74549k = c32798Fb6;
            this.f74550l = z5;
            this.f74551m = z6;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18404c
        /* renamed from: a */
        public void mo46852a(JsonReader jsonReader, int i, Object[] objArr) throws IOException, JsonParseException {
            Object read = this.f74547i.read(jsonReader);
            if (read == null && this.f74550l) {
                throw new JsonParseException("null is not allowed as value for record component '" + this.f74556c + "' of primitive type; at path " + jsonReader.getPath());
            }
            objArr[i] = read;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18404c
        /* renamed from: b */
        public void mo46851b(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            Object read = this.f74547i.read(jsonReader);
            if (read != null || !this.f74550l) {
                if (this.f74544f) {
                    ReflectiveTypeAdapterFactory.m46857b(obj, this.f74555b);
                } else if (this.f74551m) {
                    String m15126g = C48323rt4.m15126g(this.f74555b, false);
                    throw new JsonIOException("Cannot set value of 'static final' " + m15126g);
                }
                this.f74555b.set(obj, read);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18404c
        /* renamed from: c */
        public void mo46850c(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
            Object obj2;
            AbstractC31862Bb6 c18447a;
            if (!this.f74557d) {
                return;
            }
            if (this.f74544f) {
                Method method = this.f74545g;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.m46857b(obj, this.f74555b);
                } else {
                    ReflectiveTypeAdapterFactory.m46857b(obj, method);
                }
            }
            Method method2 = this.f74545g;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e) {
                    String m15126g = C48323rt4.m15126g(this.f74545g, false);
                    throw new JsonIOException("Accessor " + m15126g + " threw exception", e.getCause());
                }
            } else {
                obj2 = this.f74555b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            jsonWriter.name(this.f74554a);
            if (this.f74546h) {
                c18447a = this.f74547i;
            } else {
                c18447a = new C18447a(this.f74548j, this.f74547i, this.f74549k.getType());
            }
            c18447a.write(jsonWriter, obj2);
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18403b<T, A> extends AbstractC31862Bb6<T> {

        /* renamed from: a */
        public final Map<String, AbstractC18404c> f74553a;

        public AbstractC18403b(Map<String, AbstractC18404c> map) {
            this.f74553a = map;
        }

        /* renamed from: e */
        public abstract A mo46849e();

        /* renamed from: f */
        public abstract T mo46848f(A a);

        /* renamed from: g */
        public abstract void mo46847g(A a, JsonReader jsonReader, AbstractC18404c abstractC18404c) throws IllegalAccessException, IOException;

        @Override // p000.AbstractC31862Bb6
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A mo46849e = mo46849e();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AbstractC18404c abstractC18404c = this.f74553a.get(jsonReader.nextName());
                    if (abstractC18404c != null && abstractC18404c.f74558e) {
                        mo46847g(mo46849e, jsonReader, abstractC18404c);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return mo46848f(mo46849e);
            } catch (IllegalAccessException e) {
                throw C48323rt4.m15128e(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // p000.AbstractC31862Bb6
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (AbstractC18404c abstractC18404c : this.f74553a.values()) {
                    abstractC18404c.mo46850c(jsonWriter, t);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw C48323rt4.m15128e(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18404c {

        /* renamed from: a */
        public final String f74554a;

        /* renamed from: b */
        public final Field f74555b;

        /* renamed from: c */
        public final String f74556c;

        /* renamed from: d */
        public final boolean f74557d;

        /* renamed from: e */
        public final boolean f74558e;

        public AbstractC18404c(String str, Field field, boolean z, boolean z2) {
            this.f74554a = str;
            this.f74555b = field;
            this.f74556c = field.getName();
            this.f74557d = z;
            this.f74558e = z2;
        }

        /* renamed from: a */
        public abstract void mo46852a(JsonReader jsonReader, int i, Object[] objArr) throws IOException, JsonParseException;

        /* renamed from: b */
        public abstract void mo46851b(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        public abstract void mo46850c(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$d */
    /* loaded from: classes6.dex */
    public static final class C18405d<T> extends AbstractC18403b<T, T> {

        /* renamed from: b */
        public final InterfaceC33515Id3<T> f74559b;

        public C18405d(InterfaceC33515Id3<T> interfaceC33515Id3, Map<String, AbstractC18404c> map) {
            super(map);
            this.f74559b = interfaceC33515Id3;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18403b
        /* renamed from: e */
        public T mo46849e() {
            return this.f74559b.mo18357a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18403b
        /* renamed from: f */
        public T mo46848f(T t) {
            return t;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18403b
        /* renamed from: g */
        public void mo46847g(T t, JsonReader jsonReader, AbstractC18404c abstractC18404c) throws IllegalAccessException, IOException {
            abstractC18404c.mo46851b(jsonReader, t);
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$e */
    /* loaded from: classes6.dex */
    public static final class C18406e<T> extends AbstractC18403b<T, Object[]> {

        /* renamed from: e */
        public static final Map<Class<?>, Object> f74560e = m46844j();

        /* renamed from: b */
        public final Constructor<T> f74561b;

        /* renamed from: c */
        public final Object[] f74562c;

        /* renamed from: d */
        public final Map<String, Integer> f74563d;

        public C18406e(Class<T> cls, Map<String, AbstractC18404c> map, boolean z) {
            super(map);
            this.f74563d = new HashMap();
            Constructor<T> m15124i = C48323rt4.m15124i(cls);
            this.f74561b = m15124i;
            if (z) {
                ReflectiveTypeAdapterFactory.m46857b(null, m15124i);
            } else {
                C48323rt4.m15121l(m15124i);
            }
            String[] m15123j = C48323rt4.m15123j(cls);
            for (int i = 0; i < m15123j.length; i++) {
                this.f74563d.put(m15123j[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.f74561b.getParameterTypes();
            this.f74562c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.f74562c[i2] = f74560e.get(parameterTypes[i2]);
            }
        }

        /* renamed from: j */
        public static Map<Class<?>, Object> m46844j() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18403b
        /* renamed from: h */
        public Object[] mo46849e() {
            return (Object[]) this.f74562c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18403b
        /* renamed from: i */
        public T mo46848f(Object[] objArr) {
            try {
                return this.f74561b.newInstance(objArr);
            } catch (IllegalAccessException e) {
                throw C48323rt4.m15128e(e);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Failed to invoke constructor '" + C48323rt4.m15130c(this.f74561b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + C48323rt4.m15130c(this.f74561b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke constructor '" + C48323rt4.m15130c(this.f74561b) + "' with args " + Arrays.toString(objArr), e4.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC18403b
        /* renamed from: k */
        public void mo46847g(Object[] objArr, JsonReader jsonReader, AbstractC18404c abstractC18404c) throws IOException {
            Integer num = this.f74563d.get(abstractC18404c.f74556c);
            if (num != null) {
                abstractC18404c.mo46852a(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + C48323rt4.m15130c(this.f74561b) + "' for field with name '" + abstractC18404c.f74556c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(C47193pz0 c47193pz0, InterfaceC36852Wk1 interfaceC36852Wk1, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<InterfaceC46544ot4> list) {
        this.f74539b = c47193pz0;
        this.f74540c = interfaceC36852Wk1;
        this.f74541d = excluder;
        this.f74542e = jsonAdapterAnnotationTypeAdapterFactory;
        this.f74543f = list;
    }

    /* renamed from: b */
    public static <M extends AccessibleObject & Member> void m46857b(Object obj, M m) {
        if (Modifier.isStatic(m.getModifiers())) {
            obj = null;
        }
        if (C47137pt4.m18561a(m, obj)) {
            return;
        }
        String m15126g = C48323rt4.m15126g(m, true);
        throw new JsonIOException(m15126g + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    /* renamed from: c */
    public final AbstractC18404c m46856c(C46153oE1 c46153oE1, Field field, Method method, String str, C32798Fb6<?> c32798Fb6, boolean z, boolean z2, boolean z3) {
        boolean z4;
        AbstractC31862Bb6<?> abstractC31862Bb6;
        boolean z5;
        boolean m97906a = L24.m97906a(c32798Fb6.getRawType());
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z4 = true;
        } else {
            z4 = false;
        }
        InterfaceC39910di2 interfaceC39910di2 = (InterfaceC39910di2) field.getAnnotation(InterfaceC39910di2.class);
        if (interfaceC39910di2 != null) {
            abstractC31862Bb6 = this.f74542e.m46871a(this.f74539b, c46153oE1, c32798Fb6, interfaceC39910di2);
        } else {
            abstractC31862Bb6 = null;
        }
        if (abstractC31862Bb6 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (abstractC31862Bb6 == null) {
            abstractC31862Bb6 = c46153oE1.m21553p(c32798Fb6);
        }
        return new C18402a(str, field, z, z2, z3, method, z5, abstractC31862Bb6, c46153oE1, c32798Fb6, m97906a, z4);
    }

    @Override // p000.InterfaceC32096Cb6
    /* renamed from: d */
    public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
        boolean z;
        Class<? super T> rawType = c32798Fb6.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        InterfaceC46544ot4.EnumC27098a m18560b = C47137pt4.m18560b(this.f74543f, rawType);
        if (m18560b != InterfaceC46544ot4.EnumC27098a.BLOCK_ALL) {
            if (m18560b == InterfaceC46544ot4.EnumC27098a.BLOCK_INACCESSIBLE) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (C48323rt4.m15122k(rawType)) {
                return new C18406e(rawType, m46855e(c46153oE1, c32798Fb6, rawType, z2, true), z2);
            }
            return new C18405d(this.f74539b.m18362b(c32798Fb6), m46855e(c46153oE1, c32798Fb6, rawType, z2, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* renamed from: e */
    public final Map<String, AbstractC18404c> m46855e(C46153oE1 c46153oE1, C32798Fb6<?> c32798Fb6, Class<?> cls, boolean z, boolean z2) {
        boolean z3;
        Method method;
        AbstractC18404c abstractC18404c;
        int i;
        int i2;
        boolean z4;
        boolean z5;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        C32798Fb6<?> c32798Fb62 = c32798Fb6;
        boolean z6 = z;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z7 = true;
            boolean z8 = false;
            if (cls2 != cls && declaredFields.length > 0) {
                InterfaceC46544ot4.EnumC27098a m18560b = C47137pt4.m18560b(reflectiveTypeAdapterFactory.f74543f, cls2);
                if (m18560b != InterfaceC46544ot4.EnumC27098a.BLOCK_ALL) {
                    if (m18560b == InterfaceC46544ot4.EnumC27098a.BLOCK_INACCESSIBLE) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
            }
            boolean z9 = z6;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field = declaredFields[i3];
                boolean m46853g = reflectiveTypeAdapterFactory.m46853g(field, z7);
                boolean m46853g2 = reflectiveTypeAdapterFactory.m46853g(field, z8);
                if (!m46853g && !m46853g2) {
                    i = i3;
                    i2 = length;
                    z4 = z8;
                } else {
                    AbstractC18404c abstractC18404c2 = null;
                    if (z2) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            method = null;
                            z3 = z8;
                        } else {
                            Method m15125h = C48323rt4.m15125h(cls2, field);
                            if (!z9) {
                                C48323rt4.m15121l(m15125h);
                            }
                            if (m15125h.getAnnotation(InterfaceC41208ft5.class) != null && field.getAnnotation(InterfaceC41208ft5.class) == null) {
                                throw new JsonIOException("@SerializedName on " + C48323rt4.m15126g(m15125h, z8) + " is not supported");
                            }
                            z3 = m46853g2;
                            method = m15125h;
                        }
                    } else {
                        z3 = m46853g2;
                        method = null;
                    }
                    if (!z9 && method == null) {
                        C48323rt4.m15121l(field);
                    }
                    Type m65147o = C12259b.m65147o(c32798Fb62.getType(), cls2, field.getGenericType());
                    List<String> m46854f = reflectiveTypeAdapterFactory.m46854f(field);
                    int size = m46854f.size();
                    int i4 = z8;
                    while (i4 < size) {
                        String str = m46854f.get(i4);
                        if (i4 != 0) {
                            z5 = z8;
                        } else {
                            z5 = m46853g;
                        }
                        int i5 = i4;
                        AbstractC18404c abstractC18404c3 = abstractC18404c2;
                        int i6 = size;
                        List<String> list = m46854f;
                        Field field2 = field;
                        int i7 = i3;
                        int i8 = length;
                        boolean z10 = z8;
                        AbstractC18404c abstractC18404c4 = (AbstractC18404c) linkedHashMap.put(str, m46856c(c46153oE1, field, method, str, C32798Fb6.get(m65147o), z5, z3, z9));
                        if (abstractC18404c3 == null) {
                            abstractC18404c2 = abstractC18404c4;
                        } else {
                            abstractC18404c2 = abstractC18404c3;
                        }
                        m46853g = z5;
                        i3 = i7;
                        size = i6;
                        m46854f = list;
                        field = field2;
                        length = i8;
                        z8 = z10;
                        i4 = i5 + 1;
                    }
                    Field field3 = field;
                    i = i3;
                    i2 = length;
                    z4 = z8;
                    if (abstractC18404c2 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + abstractC18404c.f74554a + "'; conflict is caused by fields " + C48323rt4.m15127f(abstractC18404c.f74555b) + " and " + C48323rt4.m15127f(field3));
                    }
                }
                i3 = i + 1;
                z7 = true;
                reflectiveTypeAdapterFactory = this;
                length = i2;
                z8 = z4;
            }
            c32798Fb62 = C32798Fb6.get(C12259b.m65147o(c32798Fb62.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = c32798Fb62.getRawType();
            reflectiveTypeAdapterFactory = this;
            z6 = z9;
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    public final List<String> m46854f(Field field) {
        InterfaceC41208ft5 interfaceC41208ft5 = (InterfaceC41208ft5) field.getAnnotation(InterfaceC41208ft5.class);
        if (interfaceC41208ft5 == null) {
            return Collections.singletonList(this.f74540c.mo77895a(field));
        }
        String value = interfaceC41208ft5.value();
        String[] alternate = interfaceC41208ft5.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    /* renamed from: g */
    public final boolean m46853g(Field field, boolean z) {
        return (this.f74541d.m46888f(field.getType(), z) || this.f74541d.m46885j(field, z)) ? false : true;
    }
}
