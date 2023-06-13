package io.reactivex.internal.util;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23544b;
import java.io.Serializable;
/* renamed from: io.reactivex.internal.util.n */
/* loaded from: classes8.dex */
public enum EnumC24479n {
    COMPLETE;

    /* renamed from: io.reactivex.internal.util.n$a */
    /* loaded from: classes8.dex */
    public static final class C24480a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: b */
        public final InterfaceC23465c f91082b;

        public C24480a(InterfaceC23465c interfaceC23465c) {
            this.f91082b = interfaceC23465c;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f91082b + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.n$b */
    /* loaded from: classes8.dex */
    public static final class C24481b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: b */
        public final Throwable f91083b;

        public C24481b(Throwable th) {
            this.f91083b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C24481b) {
                return C23544b.m32925c(this.f91083b, ((C24481b) obj).f91083b);
            }
            return false;
        }

        public int hashCode() {
            return this.f91083b.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f91083b + "]";
        }
    }

    /* renamed from: io.reactivex.internal.util.n$c */
    /* loaded from: classes8.dex */
    public static final class C24482c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: b */
        public final InterfaceC46292oT5 f91084b;

        public C24482c(InterfaceC46292oT5 interfaceC46292oT5) {
            this.f91084b = interfaceC46292oT5;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f91084b + "]";
        }
    }

    /* renamed from: a */
    public static <T> boolean m32247a(Object obj, InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (obj == COMPLETE) {
            interfaceC42141hT5.onComplete();
            return true;
        } else if (obj instanceof C24481b) {
            interfaceC42141hT5.onError(((C24481b) obj).f91083b);
            return true;
        } else {
            interfaceC42141hT5.onNext(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static <T> boolean m32246b(Object obj, InterfaceC23436D<? super T> interfaceC23436D) {
        if (obj == COMPLETE) {
            interfaceC23436D.onComplete();
            return true;
        } else if (obj instanceof C24481b) {
            interfaceC23436D.onError(((C24481b) obj).f91083b);
            return true;
        } else {
            interfaceC23436D.onNext(obj);
            return false;
        }
    }

    /* renamed from: c */
    public static <T> boolean m32245c(Object obj, InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (obj == COMPLETE) {
            interfaceC42141hT5.onComplete();
            return true;
        } else if (obj instanceof C24481b) {
            interfaceC42141hT5.onError(((C24481b) obj).f91083b);
            return true;
        } else if (obj instanceof C24482c) {
            interfaceC42141hT5.mo31867a(((C24482c) obj).f91084b);
            return false;
        } else {
            interfaceC42141hT5.onNext(obj);
            return false;
        }
    }

    /* renamed from: d */
    public static <T> boolean m32244d(Object obj, InterfaceC23436D<? super T> interfaceC23436D) {
        if (obj == COMPLETE) {
            interfaceC23436D.onComplete();
            return true;
        } else if (obj instanceof C24481b) {
            interfaceC23436D.onError(((C24481b) obj).f91083b);
            return true;
        } else if (obj instanceof C24480a) {
            interfaceC23436D.onSubscribe(((C24480a) obj).f91082b);
            return false;
        } else {
            interfaceC23436D.onNext(obj);
            return false;
        }
    }

    /* renamed from: e */
    public static Object m32243e() {
        return COMPLETE;
    }

    /* renamed from: f */
    public static Object m32242f(InterfaceC23465c interfaceC23465c) {
        return new C24480a(interfaceC23465c);
    }

    /* renamed from: g */
    public static Object m32241g(Throwable th) {
        return new C24481b(th);
    }

    /* renamed from: h */
    public static Throwable m32240h(Object obj) {
        return ((C24481b) obj).f91083b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static <T> T m32239i(Object obj) {
        return obj;
    }

    /* renamed from: j */
    public static boolean m32238j(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: k */
    public static boolean m32237k(Object obj) {
        return obj instanceof C24481b;
    }

    /* renamed from: l */
    public static <T> Object m32236l(T t) {
        return t;
    }

    /* renamed from: m */
    public static Object m32235m(InterfaceC46292oT5 interfaceC46292oT5) {
        return new C24482c(interfaceC46292oT5);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
