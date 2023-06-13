package p000;

import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a$\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00000\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\b"}, m28432d2 = {"Ljava/net/HttpURLConnection;", "LWT2;", "method", "", C17296a.f69688o, "Ljava/lang/Class;", "clazz", "b", "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: Rw1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35790Rw1 {
    /* renamed from: a */
    public static final void m86191a(HttpURLConnection forceMethod, WT2 method) {
        Intrinsics.checkNotNullParameter(forceMethod, "$this$forceMethod");
        Intrinsics.checkNotNullParameter(method, "method");
        if (C35556Qw1.$EnumSwitchMapping$0[method.ordinal()] != 1) {
            forceMethod.setRequestMethod(method.m78343a());
            return;
        }
        try {
            Field declaredField = forceMethod.getClass().getDeclaredField("delegate");
            Intrinsics.checkNotNullExpressionValue(declaredField, "this");
            declaredField.setAccessible(true);
            HttpURLConnection httpURLConnection = (HttpURLConnection) declaredField.get(forceMethod);
            if (httpURLConnection != null) {
                m86191a(httpURLConnection, method);
            }
        } catch (NoSuchFieldException unused) {
        }
        m86190b(forceMethod, forceMethod.getClass(), method);
    }

    /* renamed from: b */
    public static final void m86190b(HttpURLConnection httpURLConnection, Class<? super HttpURLConnection> cls, WT2 wt2) {
        try {
            Field declaredField = cls.getDeclaredField("method");
            Intrinsics.checkNotNullExpressionValue(declaredField, "this");
            declaredField.setAccessible(true);
            declaredField.set(httpURLConnection, wt2.m78343a());
        } catch (NoSuchFieldException unused) {
            if (HttpURLConnection.class.isAssignableFrom(cls.getSuperclass())) {
                Class<? super Object> superclass = cls.getSuperclass();
                Intrinsics.checkNotNullExpressionValue(superclass, "clazz.superclass");
                m86190b(httpURLConnection, superclass, wt2);
            }
        }
    }
}
