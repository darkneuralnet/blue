package io.reactivex.schedulers;

import io.reactivex.AbstractC23437E;
import io.reactivex.internal.schedulers.C24411b;
import io.reactivex.internal.schedulers.C24416d;
import io.reactivex.internal.schedulers.C24424f;
import io.reactivex.internal.schedulers.C24428g;
import io.reactivex.internal.schedulers.C24439o;
import io.reactivex.internal.schedulers.C24441p;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* renamed from: io.reactivex.schedulers.a */
/* loaded from: classes8.dex */
public final class C24542a {

    /* renamed from: a */
    public static final AbstractC23437E f91186a = C24508a.m32000i(new CallableC24550h());

    /* renamed from: b */
    public static final AbstractC23437E f91187b = C24508a.m32003f(new CallableC24544b());

    /* renamed from: c */
    public static final AbstractC23437E f91188c = C24508a.m32002g(new CallableC24545c());

    /* renamed from: d */
    public static final AbstractC23437E f91189d = C24441p.m32322g();

    /* renamed from: e */
    public static final AbstractC23437E f91190e = C24508a.m32001h(new CallableC24548f());

    /* renamed from: io.reactivex.schedulers.a$a */
    /* loaded from: classes8.dex */
    public static final class C24543a {

        /* renamed from: a */
        public static final AbstractC23437E f91191a = new C24411b();
    }

    /* renamed from: io.reactivex.schedulers.a$b */
    /* loaded from: classes8.dex */
    public static final class CallableC24544b implements Callable<AbstractC23437E> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC23437E call() throws Exception {
            return C24543a.f91191a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$c */
    /* loaded from: classes8.dex */
    public static final class CallableC24545c implements Callable<AbstractC23437E> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC23437E call() throws Exception {
            return C24546d.f91192a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$d */
    /* loaded from: classes8.dex */
    public static final class C24546d {

        /* renamed from: a */
        public static final AbstractC23437E f91192a = new C24424f();
    }

    /* renamed from: io.reactivex.schedulers.a$e */
    /* loaded from: classes8.dex */
    public static final class C24547e {

        /* renamed from: a */
        public static final AbstractC23437E f91193a = new C24428g();
    }

    /* renamed from: io.reactivex.schedulers.a$f */
    /* loaded from: classes8.dex */
    public static final class CallableC24548f implements Callable<AbstractC23437E> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC23437E call() throws Exception {
            return C24547e.f91193a;
        }
    }

    /* renamed from: io.reactivex.schedulers.a$g */
    /* loaded from: classes8.dex */
    public static final class C24549g {

        /* renamed from: a */
        public static final AbstractC23437E f91194a = new C24439o();
    }

    /* renamed from: io.reactivex.schedulers.a$h */
    /* loaded from: classes8.dex */
    public static final class CallableC24550h implements Callable<AbstractC23437E> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC23437E call() throws Exception {
            return C24549g.f91194a;
        }
    }

    private C24542a() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static AbstractC23437E m31934a() {
        return C24508a.m31989t(f91187b);
    }

    /* renamed from: b */
    public static AbstractC23437E m31933b(Executor executor) {
        return new C24416d(executor, false);
    }

    /* renamed from: c */
    public static AbstractC23437E m31932c() {
        return C24508a.m31987v(f91188c);
    }

    /* renamed from: d */
    public static AbstractC23437E m31931d() {
        return C24508a.m31985x(f91186a);
    }

    /* renamed from: e */
    public static AbstractC23437E m31930e() {
        return f91189d;
    }
}
