package p000;

import com.google.android.play.core.internal.C17963bi;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
/* renamed from: nL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45628nL6<T> {

    /* renamed from: a */
    public final Object f99779a;

    /* renamed from: b */
    public final Field f99780b;

    /* renamed from: c */
    public final Class<T> f99781c;

    public C45628nL6(Object obj, Field field, Class<T> cls) {
        this.f99779a = obj;
        this.f99780b = field;
        this.f99781c = cls;
    }

    /* renamed from: a */
    public final T m23956a() {
        try {
            return this.f99781c.cast(this.f99780b.get(this.f99779a));
        } catch (Exception e) {
            throw new C17963bi(String.format("Failed to get value of field %s of type %s on object of type %s", this.f99780b.getName(), this.f99779a.getClass().getName(), this.f99781c.getName()), e);
        }
    }

    /* renamed from: b */
    public final void m23955b(T t) {
        try {
            this.f99780b.set(this.f99779a, t);
        } catch (Exception e) {
            throw new C17963bi(String.format("Failed to set value of field %s of type %s on object of type %s", this.f99780b.getName(), this.f99779a.getClass().getName(), this.f99781c.getName()), e);
        }
    }

    /* renamed from: c */
    public final Field m23954c() {
        return this.f99780b;
    }

    /* renamed from: d */
    public void m23953d(Collection collection) {
        Object[] objArr = (Object[]) m23956a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(m23951f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        m23955b(objArr2);
    }

    /* renamed from: e */
    public void m23952e(Collection collection) {
        Object[] objArr = (Object[]) m23956a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(m23951f(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        m23955b(objArr2);
    }

    /* renamed from: f */
    public final Class m23951f() {
        return m23954c().getType().getComponentType();
    }

    public C45628nL6(Object obj, Field field, Class cls, byte[] bArr) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }
}
