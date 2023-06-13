package io.reactivex.internal.util;

import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.queue.C24409c;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.util.s */
/* loaded from: classes8.dex */
public final class C24487s {
    private C24487s() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, U> boolean m32216a(boolean z, boolean z2, InterfaceC42141hT5<?> interfaceC42141hT5, boolean z3, InterfaceC23555j<?> interfaceC23555j, InterfaceC24486r<T, U> interfaceC24486r) {
        if (interfaceC24486r.mo32221c()) {
            interfaceC23555j.clear();
            return true;
        } else if (z) {
            if (z3) {
                if (z2) {
                    Throwable mo32217j = interfaceC24486r.mo32217j();
                    if (mo32217j != null) {
                        interfaceC42141hT5.onError(mo32217j);
                    } else {
                        interfaceC42141hT5.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable mo32217j2 = interfaceC24486r.mo32217j();
            if (mo32217j2 != null) {
                interfaceC23555j.clear();
                interfaceC42141hT5.onError(mo32217j2);
                return true;
            } else if (z2) {
                interfaceC42141hT5.onComplete();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static <T, U> boolean m32215b(boolean z, boolean z2, InterfaceC23436D<?> interfaceC23436D, boolean z3, InterfaceC23555j<?> interfaceC23555j, InterfaceC23465c interfaceC23465c, InterfaceC24483o<T, U> interfaceC24483o) {
        if (interfaceC24483o.mo32233c()) {
            interfaceC23555j.clear();
            interfaceC23465c.dispose();
            return true;
        } else if (z) {
            if (z3) {
                if (z2) {
                    if (interfaceC23465c != null) {
                        interfaceC23465c.dispose();
                    }
                    Throwable mo32231j = interfaceC24483o.mo32231j();
                    if (mo32231j != null) {
                        interfaceC23436D.onError(mo32231j);
                    } else {
                        interfaceC23436D.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable mo32231j2 = interfaceC24483o.mo32231j();
            if (mo32231j2 != null) {
                interfaceC23555j.clear();
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                }
                interfaceC23436D.onError(mo32231j2);
                return true;
            } else if (z2) {
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                }
                interfaceC23436D.onComplete();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static <T> InterfaceC23555j<T> m32214c(int i) {
        if (i < 0) {
            return new C24409c(-i);
        }
        return new C24408b(i);
    }

    /* renamed from: d */
    public static <T, U> void m32213d(InterfaceC23554i<T> interfaceC23554i, InterfaceC23436D<? super U> interfaceC23436D, boolean z, InterfaceC23465c interfaceC23465c, InterfaceC24483o<T, U> interfaceC24483o) {
        boolean z2;
        int i = 1;
        while (!m32215b(interfaceC24483o.done(), interfaceC23554i.isEmpty(), interfaceC23436D, z, interfaceC23554i, interfaceC23465c, interfaceC24483o)) {
            while (true) {
                boolean done = interfaceC24483o.done();
                T poll = interfaceC23554i.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m32215b(done, z2, interfaceC23436D, z, interfaceC23554i, interfaceC23465c, interfaceC24483o)) {
                    return;
                }
                if (z2) {
                    i = interfaceC24483o.mo32234b(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    interfaceC24483o.mo32232d(interfaceC23436D, poll);
                }
            }
        }
    }

    /* renamed from: e */
    public static <T, U> void m32212e(InterfaceC23554i<T> interfaceC23554i, InterfaceC42141hT5<? super U> interfaceC42141hT5, boolean z, InterfaceC23465c interfaceC23465c, InterfaceC24486r<T, U> interfaceC24486r) {
        boolean z2;
        int i = 1;
        while (true) {
            boolean done = interfaceC24486r.done();
            T poll = interfaceC23554i.poll();
            if (poll == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (m32216a(done, z2, interfaceC42141hT5, z, interfaceC23554i, interfaceC24486r)) {
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                    return;
                }
                return;
            } else if (z2) {
                i = interfaceC24486r.mo32222b(-i);
                if (i == 0) {
                    return;
                }
            } else {
                long mo32219g = interfaceC24486r.mo32219g();
                if (mo32219g != 0) {
                    if (interfaceC24486r.mo32218i(interfaceC42141hT5, poll) && mo32219g != LongCompanionObject.MAX_VALUE) {
                        interfaceC24486r.mo32220d(1L);
                    }
                } else {
                    interfaceC23554i.clear();
                    if (interfaceC23465c != null) {
                        interfaceC23465c.dispose();
                    }
                    interfaceC42141hT5.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
            }
        }
    }
}
