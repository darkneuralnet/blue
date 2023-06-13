package p000;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000.InterfaceC52024y80;
/* renamed from: Qe5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35398Qe5 extends InterfaceC52024y80.AbstractC30429a {

    /* renamed from: a */
    public final AbstractC23437E f30693a;

    /* renamed from: b */
    public final boolean f30694b;

    public C35398Qe5(AbstractC23437E abstractC23437E, boolean z) {
        this.f30693a = abstractC23437E;
        this.f30694b = z;
    }

    /* renamed from: d */
    public static C35398Qe5 m88274d(AbstractC23437E abstractC23437E) {
        if (abstractC23437E != null) {
            return new C35398Qe5(abstractC23437E, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // p000.InterfaceC52024y80.AbstractC30429a
    /* renamed from: a */
    public InterfaceC52024y80<?, ?> mo1288a(Type type, Annotation[] annotationArr, MN4 mn4) {
        boolean z;
        boolean z2;
        boolean z3;
        Type type2;
        boolean z4;
        boolean z5;
        String str;
        Class<?> m4083c = InterfaceC52024y80.AbstractC30429a.m4083c(type);
        if (m4083c == AbstractC23461c.class) {
            return new C35164Pe5(Void.class, this.f30693a, this.f30694b, false, true, false, false, false, true);
        }
        if (m4083c == AbstractC24490k.class) {
            z = true;
        } else {
            z = false;
        }
        if (m4083c == AbstractC23442F.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m4083c == AbstractC24507p.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (m4083c != Observable.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z) {
                if (!z2) {
                    if (z3) {
                        str = "Maybe";
                    } else {
                        str = "Observable";
                    }
                } else {
                    str = "Single";
                }
            } else {
                str = "Flowable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type m4084b = InterfaceC52024y80.AbstractC30429a.m4084b(0, (ParameterizedType) type);
        Class<?> m4083c2 = InterfaceC52024y80.AbstractC30429a.m4083c(m4084b);
        if (m4083c2 == HM4.class) {
            if (m4084b instanceof ParameterizedType) {
                type2 = InterfaceC52024y80.AbstractC30429a.m4084b(0, (ParameterizedType) m4084b);
                z5 = false;
                z4 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (m4083c2 == C39104cN4.class) {
            if (m4084b instanceof ParameterizedType) {
                type2 = InterfaceC52024y80.AbstractC30429a.m4084b(0, (ParameterizedType) m4084b);
                z5 = true;
                z4 = false;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            type2 = m4084b;
            z4 = true;
            z5 = false;
        }
        return new C35164Pe5(type2, this.f30693a, this.f30694b, z5, z4, z, z2, z3, false);
    }
}
