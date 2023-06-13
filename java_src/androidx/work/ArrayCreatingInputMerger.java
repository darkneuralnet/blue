package androidx.work;

import androidx.work.C12124b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¨\u0006\u0012"}, m28432d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Lh32;", "", "Landroidx/work/b;", "inputs", "b", "", "array1", "array2", DateTokenConverter.CONVERTER_KEY, "array", "obj", "Ljava/lang/Class;", "valueClass", "c", "e", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC41897h32 {
    @Override // p000.AbstractC41897h32
    /* renamed from: b */
    public C12124b mo36877b(List<C12124b> inputs) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        C12124b.C12125a c12125a = new C12124b.C12125a();
        HashMap hashMap = new HashMap();
        for (C12124b c12124b : inputs) {
            Map<String, Object> m65586h = c12124b.m65586h();
            Intrinsics.checkNotNullExpressionValue(m65586h, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : m65586h.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    cls = value.getClass();
                } else {
                    cls = String.class;
                }
                Object obj = hashMap.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = m65623e(value, cls);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.areEqual(cls2, cls)) {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        value = m65624d(obj, value);
                    } else if (Intrinsics.areEqual(cls2.getComponentType(), cls)) {
                        value = m65625c(obj, value, cls);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        c12125a.m65578d(hashMap);
        C12124b m65581a = c12125a.m65581a();
        Intrinsics.checkNotNullExpressionValue(m65581a, "output.build()");
        return m65581a;
    }

    /* renamed from: c */
    public final Object m65625c(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newArray, 0, length);
        Array.set(newArray, length, obj2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    /* renamed from: d */
    public final Object m65624d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newArray, 0, length);
        System.arraycopy(obj2, 0, newArray, length, length2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    /* renamed from: e */
    public final Object m65623e(Object obj, Class<?> cls) {
        Object newArray = Array.newInstance(cls, 1);
        Array.set(newArray, 0, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }
}
