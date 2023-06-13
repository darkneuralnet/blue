package p000;

import android.annotation.SuppressLint;
import androidx.room.EmptyResultSetException;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23446J;
import io.reactivex.InterfaceC24492m;
import io.reactivex.InterfaceC24493n;
import io.reactivex.InterfaceC24574u;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.disposables.C23466d;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p000.C47274q72;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: Ze5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37504Ze5 {

    /* renamed from: a */
    public static final Object f48881a = new Object();

    /* renamed from: Ze5$a */
    /* loaded from: classes.dex */
    public class C10312a implements InterfaceC24493n<Object> {

        /* renamed from: a */
        public final /* synthetic */ String[] f48882a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC32563Eb5 f48883b;

        /* renamed from: Ze5$a$a */
        /* loaded from: classes.dex */
        public class C10313a extends C47274q72.AbstractC27505c {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC24492m f48884b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10313a(String[] strArr, InterfaceC24492m interfaceC24492m) {
                super(strArr);
                this.f48884b = interfaceC24492m;
            }

            @Override // p000.C47274q72.AbstractC27505c
            /* renamed from: c */
            public void mo18111c(Set<String> set) {
                if (!this.f48884b.isCancelled()) {
                    this.f48884b.onNext(C37504Ze5.f48881a);
                }
            }
        }

        /* renamed from: Ze5$a$b */
        /* loaded from: classes.dex */
        public class C10314b implements InterfaceC23478a {

            /* renamed from: b */
            public final /* synthetic */ C47274q72.AbstractC27505c f48886b;

            public C10314b(C47274q72.AbstractC27505c abstractC27505c) {
                this.f48886b = abstractC27505c;
            }

            @Override // io.reactivex.functions.InterfaceC23478a
            public void run() throws Exception {
                C10312a.this.f48883b.m108725k().m18131p(this.f48886b);
            }
        }

        public C10312a(String[] strArr, AbstractC32563Eb5 abstractC32563Eb5) {
            this.f48882a = strArr;
            this.f48883b = abstractC32563Eb5;
        }

        @Override // io.reactivex.InterfaceC24493n
        /* renamed from: a */
        public void mo32090a(InterfaceC24492m<Object> interfaceC24492m) throws Exception {
            C10313a c10313a = new C10313a(this.f48882a, interfaceC24492m);
            if (!interfaceC24492m.isCancelled()) {
                this.f48883b.m108725k().m18144c(c10313a);
                interfaceC24492m.mo32091b(C23466d.m33021c(new C10314b(c10313a)));
            }
            if (!interfaceC24492m.isCancelled()) {
                interfaceC24492m.onNext(C37504Ze5.f48881a);
            }
        }
    }

    /* renamed from: Ze5$b */
    /* loaded from: classes.dex */
    public class C10315b implements InterfaceC23492o<Object, InterfaceC24574u<T>> {

        /* renamed from: b */
        public final /* synthetic */ AbstractC24507p f48888b;

        public C10315b(AbstractC24507p abstractC24507p) {
            this.f48888b = abstractC24507p;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC24574u<T> apply(Object obj) throws Exception {
            return this.f48888b;
        }
    }

    /* renamed from: Ze5$c */
    /* loaded from: classes.dex */
    public class C10316c implements InterfaceC24579z<Object> {

        /* renamed from: b */
        public final /* synthetic */ String[] f48889b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC32563Eb5 f48890c;

        /* renamed from: Ze5$c$a */
        /* loaded from: classes.dex */
        public class C10317a extends C47274q72.AbstractC27505c {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC24578y f48891b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10317a(String[] strArr, InterfaceC24578y interfaceC24578y) {
                super(strArr);
                this.f48891b = interfaceC24578y;
            }

            @Override // p000.C47274q72.AbstractC27505c
            /* renamed from: c */
            public void mo18111c(Set<String> set) {
                this.f48891b.onNext(C37504Ze5.f48881a);
            }
        }

        /* renamed from: Ze5$c$b */
        /* loaded from: classes.dex */
        public class C10318b implements InterfaceC23478a {

            /* renamed from: b */
            public final /* synthetic */ C47274q72.AbstractC27505c f48893b;

            public C10318b(C47274q72.AbstractC27505c abstractC27505c) {
                this.f48893b = abstractC27505c;
            }

            @Override // io.reactivex.functions.InterfaceC23478a
            public void run() throws Exception {
                C10316c.this.f48890c.m108725k().m18131p(this.f48893b);
            }
        }

        public C10316c(String[] strArr, AbstractC32563Eb5 abstractC32563Eb5) {
            this.f48889b = strArr;
            this.f48890c = abstractC32563Eb5;
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<Object> interfaceC24578y) throws Exception {
            C10317a c10317a = new C10317a(this.f48889b, interfaceC24578y);
            this.f48890c.m108725k().m18144c(c10317a);
            interfaceC24578y.mo11915b(C23466d.m33021c(new C10318b(c10317a)));
            interfaceC24578y.onNext(C37504Ze5.f48881a);
        }
    }

    /* renamed from: Ze5$d */
    /* loaded from: classes.dex */
    public class C10319d implements InterfaceC23492o<Object, InterfaceC24574u<T>> {

        /* renamed from: b */
        public final /* synthetic */ AbstractC24507p f48895b;

        public C10319d(AbstractC24507p abstractC24507p) {
            this.f48895b = abstractC24507p;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC24574u<T> apply(Object obj) throws Exception {
            return this.f48895b;
        }
    }

    /* renamed from: Ze5$e */
    /* loaded from: classes.dex */
    public class C10320e implements InterfaceC23446J<T> {

        /* renamed from: a */
        public final /* synthetic */ Callable f48896a;

        public C10320e(Callable callable) {
            this.f48896a = callable;
        }

        @Override // io.reactivex.InterfaceC23446J
        public void subscribe(InterfaceC23444H<T> interfaceC23444H) throws Exception {
            try {
                interfaceC23444H.onSuccess(this.f48896a.call());
            } catch (EmptyResultSetException e) {
                interfaceC23444H.mo4876c(e);
            }
        }
    }

    /* renamed from: a */
    public static <T> AbstractC24490k<T> m72810a(AbstractC32563Eb5 abstractC32563Eb5, boolean z, String[] strArr, Callable<T> callable) {
        AbstractC23437E m31933b = C24542a.m31933b(m72805f(abstractC32563Eb5, z));
        return (AbstractC24490k<T>) m72809b(abstractC32563Eb5, strArr).m32163Y0(m31933b).m32110s1(m31933b).m32111s0(m31933b).m32154d0(new C10315b(AbstractC24507p.m32071D(callable)));
    }

    /* renamed from: b */
    public static AbstractC24490k<Object> m72809b(AbstractC32563Eb5 abstractC32563Eb5, String... strArr) {
        return AbstractC24490k.m32109t(new C10312a(strArr, abstractC32563Eb5), EnumC23460b.LATEST);
    }

    /* renamed from: c */
    public static <T> Observable<T> m72808c(AbstractC32563Eb5 abstractC32563Eb5, boolean z, String[] strArr, Callable<T> callable) {
        AbstractC23437E m31933b = C24542a.m31933b(m72805f(abstractC32563Eb5, z));
        return (Observable<T>) m72807d(abstractC32563Eb5, strArr).subscribeOn(m31933b).unsubscribeOn(m31933b).observeOn(m31933b).flatMapMaybe(new C10319d(AbstractC24507p.m32071D(callable)));
    }

    /* renamed from: d */
    public static Observable<Object> m72807d(AbstractC32563Eb5 abstractC32563Eb5, String... strArr) {
        return Observable.create(new C10316c(strArr, abstractC32563Eb5));
    }

    /* renamed from: e */
    public static <T> AbstractC23442F<T> m72806e(Callable<T> callable) {
        return AbstractC23442F.m33126j(new C10320e(callable));
    }

    /* renamed from: f */
    public static Executor m72805f(AbstractC32563Eb5 abstractC32563Eb5, boolean z) {
        if (z) {
            return abstractC32563Eb5.m108722p();
        }
        return abstractC32563Eb5.m108723m();
    }
}
