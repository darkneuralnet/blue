package p000;

import java.lang.reflect.Field;
/* renamed from: Jj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C33800Jj0 {
    /* renamed from: a */
    public static <FIELD_TYPE> FIELD_TYPE m99916a(String str, String str2) {
        try {
            Field field = Class.forName(str).getField(str2);
            field.setAccessible(true);
            return (FIELD_TYPE) field.get(Object.class);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }
}
