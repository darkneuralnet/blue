package io.reactivex.internal.operators.mixed;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.maybe.C23860L;
import io.reactivex.internal.operators.single.C24348F;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.mixed.m */
/* loaded from: classes6.dex */
public final class C23952m {
    private C23952m() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> boolean m32690a(Object obj, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, InterfaceC23476f interfaceC23476f) {
        InterfaceC23496h interfaceC23496h;
        if (obj instanceof Callable) {
            try {
                Object obj2 = (Object) ((Callable) obj).call();
                if (obj2 != 0) {
                    interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(interfaceC23492o.apply(obj2), "The mapper returned a null CompletableSource");
                } else {
                    interfaceC23496h = null;
                }
                if (interfaceC23496h == null) {
                    EnumC23502e.m32992a(interfaceC23476f);
                } else {
                    interfaceC23496h.mo33003g(interfaceC23476f);
                }
                return true;
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32989g(th, interfaceC23476f);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T, R> boolean m32689b(Object obj, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, InterfaceC23436D<? super R> interfaceC23436D) {
        InterfaceC24574u interfaceC24574u;
        if (obj instanceof Callable) {
            try {
                Object obj2 = (Object) ((Callable) obj).call();
                if (obj2 != 0) {
                    interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(interfaceC23492o.apply(obj2), "The mapper returned a null MaybeSource");
                } else {
                    interfaceC24574u = null;
                }
                if (interfaceC24574u == null) {
                    EnumC23502e.m32990d(interfaceC23436D);
                } else {
                    interfaceC24574u.mo31865a(C23860L.m32740a(interfaceC23436D));
                }
                return true;
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32987i(th, interfaceC23436D);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static <T, R> boolean m32688c(Object obj, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, InterfaceC23436D<? super R> interfaceC23436D) {
        InterfaceC23447K interfaceC23447K;
        if (obj instanceof Callable) {
            try {
                Object obj2 = (Object) ((Callable) obj).call();
                if (obj2 != 0) {
                    interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(interfaceC23492o.apply(obj2), "The mapper returned a null SingleSource");
                } else {
                    interfaceC23447K = null;
                }
                if (interfaceC23447K == null) {
                    EnumC23502e.m32990d(interfaceC23436D);
                } else {
                    interfaceC23447K.mo33096a(C24348F.m32402a(interfaceC23436D));
                }
                return true;
            } catch (Throwable th) {
                C23475a.m33009b(th);
                EnumC23502e.m32987i(th, interfaceC23436D);
                return true;
            }
        }
        return false;
    }
}
