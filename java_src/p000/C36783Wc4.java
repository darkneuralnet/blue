package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u001a(\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a\u001e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0018\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u000f"}, m28432d2 = {"LUc4;", "q", "f", "c", C17296a.f69688o, "b", "", "t", "dotThreshold", "g", DateTokenConverter.CONVERTER_KEY, "e", "LVb5;", "order", "Lhu1;", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Wc4  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36783Wc4 {
    /* renamed from: a */
    public static final C42400hu1 m78137a(C36315Uc4 q, EnumC36541Vb5 order) {
        Intrinsics.checkNotNullParameter(q, "q");
        Intrinsics.checkNotNullParameter(order, "order");
        return C45642nN2.m23935a(C45642nN2.m23930f(q), order);
    }

    /* renamed from: b */
    public static /* synthetic */ C42400hu1 m78136b(C36315Uc4 c36315Uc4, EnumC36541Vb5 enumC36541Vb5, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC36541Vb5 = EnumC36541Vb5.f39327j;
        }
        return m78137a(c36315Uc4, enumC36541Vb5);
    }

    /* renamed from: c */
    public static final C36315Uc4 m78135c(C36315Uc4 q) {
        Intrinsics.checkNotNullParameter(q, "q");
        float m81261b = 1.0f / ((((q.m81261b() * q.m81261b()) + (q.m81260c() * q.m81260c())) + (q.m81259d() * q.m81259d())) + (q.m81262a() * q.m81262a()));
        return new C36315Uc4((-q.m81261b()) * m81261b, (-q.m81260c()) * m81261b, (-q.m81259d()) * m81261b, q.m81262a() * m81261b);
    }

    /* renamed from: d */
    public static final C36315Uc4 m78134d(C36315Uc4 a, C36315Uc4 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float f2 = 1.0f - f;
        C36315Uc4 c36315Uc4 = new C36315Uc4(a.m81261b() * f2, a.m81260c() * f2, a.m81259d() * f2, f2 * a.m81262a());
        C36315Uc4 c36315Uc42 = new C36315Uc4(b.m81261b() * f, b.m81260c() * f, b.m81259d() * f, f * b.m81262a());
        return new C36315Uc4(c36315Uc4.m81261b() + c36315Uc42.m81261b(), c36315Uc4.m81260c() + c36315Uc42.m81260c(), c36315Uc4.m81259d() + c36315Uc42.m81259d(), c36315Uc4.m81262a() + c36315Uc42.m81262a());
    }

    /* renamed from: e */
    public static final C36315Uc4 m78133e(C36315Uc4 a, C36315Uc4 b, float f) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return m78132f(m78134d(a, b, f));
    }

    /* renamed from: f */
    public static final C36315Uc4 m78132f(C36315Uc4 q) {
        Intrinsics.checkNotNullParameter(q, "q");
        float sqrt = 1.0f / ((float) Math.sqrt((((q.m81261b() * q.m81261b()) + (q.m81260c() * q.m81260c())) + (q.m81259d() * q.m81259d())) + (q.m81262a() * q.m81262a())));
        return new C36315Uc4(q.m81261b() * sqrt, q.m81260c() * sqrt, q.m81259d() * sqrt, q.m81262a() * sqrt);
    }

    /* renamed from: g */
    public static final C36315Uc4 m78131g(C36315Uc4 a, C36315Uc4 b, float f, float f2) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float m81261b = (a.m81261b() * b.m81261b()) + (a.m81260c() * b.m81260c()) + (a.m81259d() * b.m81259d()) + (a.m81262a() * b.m81262a());
        if (m81261b < 0.0f) {
            m81261b = -m81261b;
            b = b.m81257f();
        }
        if (m81261b < f2) {
            float acos = (float) Math.acos(m81261b);
            float sin = (float) Math.sin(acos);
            float sin2 = (float) Math.sin((1.0f - f) * acos);
            C36315Uc4 c36315Uc4 = new C36315Uc4(a.m81261b() * sin2, a.m81260c() * sin2, a.m81259d() * sin2, a.m81262a() * sin2);
            C36315Uc4 c36315Uc42 = new C36315Uc4(c36315Uc4.m81261b() / sin, c36315Uc4.m81260c() / sin, c36315Uc4.m81259d() / sin, c36315Uc4.m81262a() / sin);
            float sin3 = (float) Math.sin(f * acos);
            C36315Uc4 c36315Uc43 = new C36315Uc4(b.m81261b() * sin3, b.m81260c() * sin3, b.m81259d() * sin3, b.m81262a() * sin3);
            C36315Uc4 c36315Uc44 = new C36315Uc4(c36315Uc43.m81261b() / sin, c36315Uc43.m81260c() / sin, c36315Uc43.m81259d() / sin, c36315Uc43.m81262a() / sin);
            return new C36315Uc4(c36315Uc42.m81261b() + c36315Uc44.m81261b(), c36315Uc42.m81260c() + c36315Uc44.m81260c(), c36315Uc42.m81259d() + c36315Uc44.m81259d(), c36315Uc42.m81262a() + c36315Uc44.m81262a());
        }
        return m78133e(a, b, f);
    }

    /* renamed from: h */
    public static /* synthetic */ C36315Uc4 m78130h(C36315Uc4 c36315Uc4, C36315Uc4 c36315Uc42, float f, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            f2 = 0.9995f;
        }
        return m78131g(c36315Uc4, c36315Uc42, f, f2);
    }
}
