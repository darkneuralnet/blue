package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import p000.InterfaceC45139mX2;
/* renamed from: Zs5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37630Zs5 {

    /* renamed from: Zs5$b */
    /* loaded from: classes6.dex */
    public static final class C10426b<T> {

        /* renamed from: a */
        public final Field f49435a;

        /* renamed from: a */
        public void m72358a(T t, int i) {
            try {
                this.f49435a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public void m72357b(T t, Object obj) {
            try {
                this.f49435a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public C10426b(Field field) {
            this.f49435a = field;
            field.setAccessible(true);
        }
    }

    private C37630Zs5() {
    }

    /* renamed from: a */
    public static <T> C10426b<T> m72363a(Class<T> cls, String str) {
        try {
            return new C10426b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static <E> void m72362b(InterfaceC45139mX2<E> interfaceC45139mX2, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC45139mX2.mo20921H0(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: c */
    public static int m72361c(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* renamed from: d */
    public static <K, V> void m72360d(InterfaceC41581gX2<K, V> interfaceC41581gX2, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC41581gX2.mo24583f().size());
        for (Map.Entry<K, Collection<V>> entry : interfaceC41581gX2.mo24583f().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }

    /* renamed from: e */
    public static <E> void m72359e(InterfaceC45139mX2<E> interfaceC45139mX2, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC45139mX2.entrySet().size());
        for (InterfaceC45139mX2.InterfaceC26111a<E> interfaceC26111a : interfaceC45139mX2.entrySet()) {
            objectOutputStream.writeObject(interfaceC26111a.getElement());
            objectOutputStream.writeInt(interfaceC26111a.getCount());
        }
    }
}
