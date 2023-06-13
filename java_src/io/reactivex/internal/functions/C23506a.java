package io.reactivex.internal.functions;

import io.reactivex.AbstractC23437E;
import io.reactivex.C24576w;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23482e;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23488k;
import io.reactivex.functions.InterfaceC23489l;
import io.reactivex.functions.InterfaceC23490m;
import io.reactivex.functions.InterfaceC23491n;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23493p;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.plugins.C24508a;
import io.reactivex.schedulers.C24551b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.functions.a */
/* loaded from: classes6.dex */
public final class C23506a {

    /* renamed from: a */
    public static final InterfaceC23492o<Object, Object> f88245a = new C23539v();

    /* renamed from: b */
    public static final Runnable f88246b = new RunnableC23534q();

    /* renamed from: c */
    public static final InterfaceC23478a f88247c = new C23531n();

    /* renamed from: d */
    public static final InterfaceC23484g<Object> f88248d = new C23532o();

    /* renamed from: e */
    public static final InterfaceC23484g<Throwable> f88249e = new C23536s();

    /* renamed from: f */
    public static final InterfaceC23484g<Throwable> f88250f = new C23512F();

    /* renamed from: g */
    public static final InterfaceC23493p f88251g = new C23533p();

    /* renamed from: h */
    public static final InterfaceC23494q<Object> f88252h = new C23517K();

    /* renamed from: i */
    public static final InterfaceC23494q<Object> f88253i = new C23537t();

    /* renamed from: j */
    public static final Callable<Object> f88254j = new CallableC23511E();

    /* renamed from: k */
    public static final Comparator<Object> f88255k = new C23507A();

    /* renamed from: l */
    public static final InterfaceC23484g<InterfaceC46292oT5> f88256l = new C23542y();

    /* renamed from: io.reactivex.internal.functions.a$A */
    /* loaded from: classes6.dex */
    public static final class C23507A implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$B */
    /* loaded from: classes6.dex */
    public static final class C23508B<T> implements InterfaceC23478a {

        /* renamed from: b */
        public final InterfaceC23484g<? super C24576w<T>> f88257b;

        public C23508B(InterfaceC23484g<? super C24576w<T>> interfaceC23484g) {
            this.f88257b = interfaceC23484g;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() throws Exception {
            this.f88257b.accept(C24576w.m31863a());
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$C */
    /* loaded from: classes6.dex */
    public static final class C23509C<T> implements InterfaceC23484g<Throwable> {

        /* renamed from: b */
        public final InterfaceC23484g<? super C24576w<T>> f88258b;

        public C23509C(InterfaceC23484g<? super C24576w<T>> interfaceC23484g) {
            this.f88258b = interfaceC23484g;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.f88258b.accept(C24576w.m31862b(th));
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$D */
    /* loaded from: classes6.dex */
    public static final class C23510D<T> implements InterfaceC23484g<T> {

        /* renamed from: b */
        public final InterfaceC23484g<? super C24576w<T>> f88259b;

        public C23510D(InterfaceC23484g<? super C24576w<T>> interfaceC23484g) {
            this.f88259b = interfaceC23484g;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        public void accept(T t) throws Exception {
            this.f88259b.accept(C24576w.m31861c(t));
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$E */
    /* loaded from: classes6.dex */
    public static final class CallableC23511E implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$F */
    /* loaded from: classes6.dex */
    public static final class C23512F implements InterfaceC23484g<Throwable> {
        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(Throwable th) {
            C24508a.m31988u(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$G */
    /* loaded from: classes6.dex */
    public static final class C23513G<T> implements InterfaceC23492o<T, C24551b<T>> {

        /* renamed from: b */
        public final TimeUnit f88260b;

        /* renamed from: c */
        public final AbstractC23437E f88261c;

        public C23513G(TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f88260b = timeUnit;
            this.f88261c = abstractC23437E;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public C24551b<T> apply(T t) throws Exception {
            return new C24551b<>(t, this.f88261c.m33168c(this.f88260b), this.f88260b);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$H */
    /* loaded from: classes6.dex */
    public static final class C23514H<K, T> implements InterfaceC23479b<Map<K, T>, T> {

        /* renamed from: a */
        public final InterfaceC23492o<? super T, ? extends K> f88262a;

        public C23514H(InterfaceC23492o<? super T, ? extends K> interfaceC23492o) {
            this.f88262a = interfaceC23492o;
        }

        @Override // io.reactivex.functions.InterfaceC23479b
        /* renamed from: a */
        public void accept(Map<K, T> map, T t) throws Exception {
            map.put(this.f88262a.apply(t), t);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$I */
    /* loaded from: classes6.dex */
    public static final class C23515I<K, V, T> implements InterfaceC23479b<Map<K, V>, T> {

        /* renamed from: a */
        public final InterfaceC23492o<? super T, ? extends V> f88263a;

        /* renamed from: b */
        public final InterfaceC23492o<? super T, ? extends K> f88264b;

        public C23515I(InterfaceC23492o<? super T, ? extends V> interfaceC23492o, InterfaceC23492o<? super T, ? extends K> interfaceC23492o2) {
            this.f88263a = interfaceC23492o;
            this.f88264b = interfaceC23492o2;
        }

        @Override // io.reactivex.functions.InterfaceC23479b
        /* renamed from: a */
        public void accept(Map<K, V> map, T t) throws Exception {
            map.put(this.f88264b.apply(t), this.f88263a.apply(t));
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$J */
    /* loaded from: classes6.dex */
    public static final class C23516J<K, V, T> implements InterfaceC23479b<Map<K, Collection<V>>, T> {

        /* renamed from: a */
        public final InterfaceC23492o<? super K, ? extends Collection<? super V>> f88265a;

        /* renamed from: b */
        public final InterfaceC23492o<? super T, ? extends V> f88266b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends K> f88267c;

        public C23516J(InterfaceC23492o<? super K, ? extends Collection<? super V>> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, InterfaceC23492o<? super T, ? extends K> interfaceC23492o3) {
            this.f88265a = interfaceC23492o;
            this.f88266b = interfaceC23492o2;
            this.f88267c = interfaceC23492o3;
        }

        @Override // io.reactivex.functions.InterfaceC23479b
        /* renamed from: a */
        public void accept(Map<K, Collection<V>> map, T t) throws Exception {
            K apply = this.f88267c.apply(t);
            Collection<? super V> collection = map.get(apply);
            if (collection == null) {
                collection = this.f88265a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f88266b.apply(t));
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$K */
    /* loaded from: classes6.dex */
    public static final class C23517K implements InterfaceC23494q<Object> {
        @Override // io.reactivex.functions.InterfaceC23494q
        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$a */
    /* loaded from: classes6.dex */
    public static final class C23518a<T> implements InterfaceC23484g<T> {

        /* renamed from: b */
        public final InterfaceC23478a f88268b;

        public C23518a(InterfaceC23478a interfaceC23478a) {
            this.f88268b = interfaceC23478a;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        public void accept(T t) throws Exception {
            this.f88268b.run();
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$b */
    /* loaded from: classes6.dex */
    public static final class C23519b<T1, T2, R> implements InterfaceC23492o<Object[], R> {

        /* renamed from: b */
        public final InterfaceC23480c<? super T1, ? super T2, ? extends R> f88269b;

        public C23519b(InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c) {
            this.f88269b = interfaceC23480c;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f88269b.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$c */
    /* loaded from: classes6.dex */
    public static final class C23520c<T1, T2, T3, R> implements InterfaceC23492o<Object[], R> {

        /* renamed from: b */
        public final InterfaceC23485h<T1, T2, T3, R> f88270b;

        public C23520c(InterfaceC23485h<T1, T2, T3, R> interfaceC23485h) {
            this.f88270b = interfaceC23485h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return (R) this.f88270b.apply(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$d */
    /* loaded from: classes6.dex */
    public static final class C23521d<T1, T2, T3, T4, R> implements InterfaceC23492o<Object[], R> {

        /* renamed from: b */
        public final InterfaceC23486i<T1, T2, T3, T4, R> f88271b;

        public C23521d(InterfaceC23486i<T1, T2, T3, T4, R> interfaceC23486i) {
            this.f88271b = interfaceC23486i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return (R) this.f88271b.apply(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$e */
    /* loaded from: classes6.dex */
    public static final class C23522e<T1, T2, T3, T4, T5, R> implements InterfaceC23492o<Object[], R> {

        /* renamed from: b */
        public final InterfaceC23487j<T1, T2, T3, T4, T5, R> f88272b;

        public C23522e(InterfaceC23487j<T1, T2, T3, T4, T5, R> interfaceC23487j) {
            this.f88272b = interfaceC23487j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return (R) this.f88272b.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$f */
    /* loaded from: classes6.dex */
    public static final class C23523f<T1, T2, T3, T4, T5, T6, R> implements InterfaceC23492o<Object[], R> {

        /* renamed from: b */
        public final InterfaceC23488k<T1, T2, T3, T4, T5, T6, R> f88273b;

        public C23523f(InterfaceC23488k<T1, T2, T3, T4, T5, T6, R> interfaceC23488k) {
            this.f88273b = interfaceC23488k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return (R) this.f88273b.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$g */
    /* loaded from: classes6.dex */
    public static final class C23524g<T1, T2, T3, T4, T5, T6, T7, R> implements InterfaceC23492o<Object[], R> {
        public C23524g(InterfaceC23489l<T1, T2, T3, T4, T5, T6, T7, R> interfaceC23489l) {
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
            Object obj6 = objArr[5];
            Object obj7 = objArr[6];
            throw null;
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$h */
    /* loaded from: classes6.dex */
    public static final class C23525h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements InterfaceC23492o<Object[], R> {

        /* renamed from: b */
        public final InterfaceC23490m<T1, T2, T3, T4, T5, T6, T7, T8, R> f88274b;

        public C23525h(InterfaceC23490m<T1, T2, T3, T4, T5, T6, T7, T8, R> interfaceC23490m) {
            this.f88274b = interfaceC23490m;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return (R) this.f88274b.apply(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$i */
    /* loaded from: classes6.dex */
    public static final class C23526i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements InterfaceC23492o<Object[], R> {

        /* renamed from: b */
        public final InterfaceC23491n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f88275b;

        public C23526i(InterfaceC23491n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> interfaceC23491n) {
            this.f88275b = interfaceC23491n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 9) {
                return (R) this.f88275b.mo33004a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$j */
    /* loaded from: classes6.dex */
    public static final class CallableC23527j<T> implements Callable<List<T>> {

        /* renamed from: b */
        public final int f88276b;

        public CallableC23527j(int i) {
            this.f88276b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<T> call() throws Exception {
            return new ArrayList(this.f88276b);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$k */
    /* loaded from: classes6.dex */
    public static final class C23528k<T> implements InterfaceC23494q<T> {

        /* renamed from: b */
        public final InterfaceC23482e f88277b;

        public C23528k(InterfaceC23482e interfaceC23482e) {
            this.f88277b = interfaceC23482e;
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        public boolean test(T t) throws Exception {
            return !this.f88277b.mo33005a();
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$l */
    /* loaded from: classes6.dex */
    public static final class C23529l<T, U> implements InterfaceC23492o<T, U> {

        /* renamed from: b */
        public final Class<U> f88278b;

        public C23529l(Class<U> cls) {
            this.f88278b = cls;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public U apply(T t) throws Exception {
            return this.f88278b.cast(t);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$m */
    /* loaded from: classes6.dex */
    public static final class C23530m<T, U> implements InterfaceC23494q<T> {

        /* renamed from: b */
        public final Class<U> f88279b;

        public C23530m(Class<U> cls) {
            this.f88279b = cls;
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        public boolean test(T t) throws Exception {
            return this.f88279b.isInstance(t);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$n */
    /* loaded from: classes6.dex */
    public static final class C23531n implements InterfaceC23478a {
        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$o */
    /* loaded from: classes6.dex */
    public static final class C23532o implements InterfaceC23484g<Object> {
        @Override // io.reactivex.functions.InterfaceC23484g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$p */
    /* loaded from: classes6.dex */
    public static final class C23533p implements InterfaceC23493p {
        @Override // io.reactivex.functions.InterfaceC23493p
        /* renamed from: a */
        public void mo32932a(long j) {
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$q */
    /* loaded from: classes6.dex */
    public static final class RunnableC23534q implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$r */
    /* loaded from: classes6.dex */
    public static final class C23535r<T> implements InterfaceC23494q<T> {

        /* renamed from: b */
        public final T f88280b;

        public C23535r(T t) {
            this.f88280b = t;
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        public boolean test(T t) throws Exception {
            return C23544b.m32925c(t, this.f88280b);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$s */
    /* loaded from: classes6.dex */
    public static final class C23536s implements InterfaceC23484g<Throwable> {
        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(Throwable th) {
            C24508a.m31988u(th);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$t */
    /* loaded from: classes6.dex */
    public static final class C23537t implements InterfaceC23494q<Object> {
        @Override // io.reactivex.functions.InterfaceC23494q
        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$u */
    /* loaded from: classes6.dex */
    public enum EnumC23538u implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$v */
    /* loaded from: classes6.dex */
    public static final class C23539v implements InterfaceC23492o<Object, Object> {
        @Override // io.reactivex.functions.InterfaceC23492o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$w */
    /* loaded from: classes6.dex */
    public static final class CallableC23540w<T, U> implements Callable<U>, InterfaceC23492o<T, U> {

        /* renamed from: b */
        public final U f88283b;

        public CallableC23540w(U u) {
            this.f88283b = u;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public U apply(T t) throws Exception {
            return this.f88283b;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f88283b;
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$x */
    /* loaded from: classes6.dex */
    public static final class C23541x<T> implements InterfaceC23492o<List<T>, List<T>> {

        /* renamed from: b */
        public final Comparator<? super T> f88284b;

        public C23541x(Comparator<? super T> comparator) {
            this.f88284b = comparator;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f88284b);
            return list;
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$y */
    /* loaded from: classes6.dex */
    public static final class C23542y implements InterfaceC23484g<InterfaceC46292oT5> {
        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(InterfaceC46292oT5 interfaceC46292oT5) throws Exception {
            interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
        }
    }

    /* renamed from: io.reactivex.internal.functions.a$z */
    /* loaded from: classes6.dex */
    public enum EnumC23543z implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    private C23506a() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: A */
    public static <T1, T2, T3, T4, T5, T6, T7, R> InterfaceC23492o<Object[], R> m32979A(InterfaceC23489l<T1, T2, T3, T4, T5, T6, T7, R> interfaceC23489l) {
        C23544b.m32923e(interfaceC23489l, "f is null");
        return new C23524g(interfaceC23489l);
    }

    /* renamed from: B */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> InterfaceC23492o<Object[], R> m32978B(InterfaceC23490m<T1, T2, T3, T4, T5, T6, T7, T8, R> interfaceC23490m) {
        C23544b.m32923e(interfaceC23490m, "f is null");
        return new C23525h(interfaceC23490m);
    }

    /* renamed from: C */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> InterfaceC23492o<Object[], R> m32977C(InterfaceC23491n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> interfaceC23491n) {
        C23544b.m32923e(interfaceC23491n, "f is null");
        return new C23526i(interfaceC23491n);
    }

    /* renamed from: D */
    public static <T, K> InterfaceC23479b<Map<K, T>, T> m32976D(InterfaceC23492o<? super T, ? extends K> interfaceC23492o) {
        return new C23514H(interfaceC23492o);
    }

    /* renamed from: E */
    public static <T, K, V> InterfaceC23479b<Map<K, V>, T> m32975E(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2) {
        return new C23515I(interfaceC23492o2, interfaceC23492o);
    }

    /* renamed from: F */
    public static <T, K, V> InterfaceC23479b<Map<K, Collection<V>>, T> m32974F(InterfaceC23492o<? super T, ? extends K> interfaceC23492o, InterfaceC23492o<? super T, ? extends V> interfaceC23492o2, InterfaceC23492o<? super K, ? extends Collection<? super V>> interfaceC23492o3) {
        return new C23516J(interfaceC23492o3, interfaceC23492o2, interfaceC23492o);
    }

    /* renamed from: a */
    public static <T> InterfaceC23484g<T> m32973a(InterfaceC23478a interfaceC23478a) {
        return new C23518a(interfaceC23478a);
    }

    /* renamed from: b */
    public static <T> InterfaceC23494q<T> m32972b() {
        return (InterfaceC23494q<T>) f88253i;
    }

    /* renamed from: c */
    public static <T> InterfaceC23494q<T> m32971c() {
        return (InterfaceC23494q<T>) f88252h;
    }

    /* renamed from: d */
    public static <T, U> InterfaceC23492o<T, U> m32970d(Class<U> cls) {
        return new C23529l(cls);
    }

    /* renamed from: e */
    public static <T> Callable<List<T>> m32969e(int i) {
        return new CallableC23527j(i);
    }

    /* renamed from: f */
    public static <T> Callable<Set<T>> m32968f() {
        return EnumC23538u.INSTANCE;
    }

    /* renamed from: g */
    public static <T> InterfaceC23484g<T> m32967g() {
        return (InterfaceC23484g<T>) f88248d;
    }

    /* renamed from: h */
    public static <T> InterfaceC23494q<T> m32966h(T t) {
        return new C23535r(t);
    }

    /* renamed from: i */
    public static <T> InterfaceC23492o<T, T> m32965i() {
        return (InterfaceC23492o<T, T>) f88245a;
    }

    /* renamed from: j */
    public static <T, U> InterfaceC23494q<T> m32964j(Class<U> cls) {
        return new C23530m(cls);
    }

    /* renamed from: k */
    public static <T> Callable<T> m32963k(T t) {
        return new CallableC23540w(t);
    }

    /* renamed from: l */
    public static <T, U> InterfaceC23492o<T, U> m32962l(U u) {
        return new CallableC23540w(u);
    }

    /* renamed from: m */
    public static <T> InterfaceC23492o<List<T>, List<T>> m32961m(Comparator<? super T> comparator) {
        return new C23541x(comparator);
    }

    /* renamed from: n */
    public static <T> Comparator<T> m32960n() {
        return EnumC23543z.INSTANCE;
    }

    /* renamed from: o */
    public static <T> Comparator<T> m32959o() {
        return (Comparator<T>) f88255k;
    }

    /* renamed from: p */
    public static <T> InterfaceC23478a m32958p(InterfaceC23484g<? super C24576w<T>> interfaceC23484g) {
        return new C23508B(interfaceC23484g);
    }

    /* renamed from: q */
    public static <T> InterfaceC23484g<Throwable> m32957q(InterfaceC23484g<? super C24576w<T>> interfaceC23484g) {
        return new C23509C(interfaceC23484g);
    }

    /* renamed from: r */
    public static <T> InterfaceC23484g<T> m32956r(InterfaceC23484g<? super C24576w<T>> interfaceC23484g) {
        return new C23510D(interfaceC23484g);
    }

    /* renamed from: s */
    public static <T> Callable<T> m32955s() {
        return (Callable<T>) f88254j;
    }

    /* renamed from: t */
    public static <T> InterfaceC23494q<T> m32954t(InterfaceC23482e interfaceC23482e) {
        return new C23528k(interfaceC23482e);
    }

    /* renamed from: u */
    public static <T> InterfaceC23492o<T, C24551b<T>> m32953u(TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        return new C23513G(timeUnit, abstractC23437E);
    }

    /* renamed from: v */
    public static <T1, T2, R> InterfaceC23492o<Object[], R> m32952v(InterfaceC23480c<? super T1, ? super T2, ? extends R> interfaceC23480c) {
        C23544b.m32923e(interfaceC23480c, "f is null");
        return new C23519b(interfaceC23480c);
    }

    /* renamed from: w */
    public static <T1, T2, T3, R> InterfaceC23492o<Object[], R> m32951w(InterfaceC23485h<T1, T2, T3, R> interfaceC23485h) {
        C23544b.m32923e(interfaceC23485h, "f is null");
        return new C23520c(interfaceC23485h);
    }

    /* renamed from: x */
    public static <T1, T2, T3, T4, R> InterfaceC23492o<Object[], R> m32950x(InterfaceC23486i<T1, T2, T3, T4, R> interfaceC23486i) {
        C23544b.m32923e(interfaceC23486i, "f is null");
        return new C23521d(interfaceC23486i);
    }

    /* renamed from: y */
    public static <T1, T2, T3, T4, T5, R> InterfaceC23492o<Object[], R> m32949y(InterfaceC23487j<T1, T2, T3, T4, T5, R> interfaceC23487j) {
        C23544b.m32923e(interfaceC23487j, "f is null");
        return new C23522e(interfaceC23487j);
    }

    /* renamed from: z */
    public static <T1, T2, T3, T4, T5, T6, R> InterfaceC23492o<Object[], R> m32948z(InterfaceC23488k<T1, T2, T3, T4, T5, T6, R> interfaceC23488k) {
        C23544b.m32923e(interfaceC23488k, "f is null");
        return new C23523f(interfaceC23488k);
    }
}
