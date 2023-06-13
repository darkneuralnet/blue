package p000;

import co.bird.android.buava.Optional;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0003\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0005\u001a2\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0003\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0003\u001a2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0005\u001a\u0014\u0010\r\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e¨\u0006\u0011"}, m28432d2 = {"T", "LHM4;", "R", "Lio/reactivex/F;", "l", "Lio/reactivex/Observable;", "k", "Lco/bird/android/buava/Optional;", "h", "g", "Lio/reactivex/c;", "", "retries", "f", "", "limit", "o", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ag5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38096ag5 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "LHM4;", "R", "response", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ag5$a */
    /* loaded from: classes3.dex */
    public static final class C10807a extends Lambda implements Function1<R, Optional<T>> {

        /* renamed from: g */
        public static final C10807a f50924g = new C10807a();

        public C10807a() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TR;)Lco/bird/android/buava/Optional<TT;>; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional invoke(HM4 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                return Optional.f63040c.m59033b(response.m103944a());
            }
            throw new HttpException(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "LHM4;", "R", "response", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ag5$b */
    /* loaded from: classes3.dex */
    public static final class C10808b extends Lambda implements Function1<R, Optional<T>> {

        /* renamed from: g */
        public static final C10808b f50925g = new C10808b();

        public C10808b() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TR;)Lco/bird/android/buava/Optional<TT;>; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional invoke(HM4 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                return Optional.f63040c.m59033b(response.m103944a());
            }
            throw new HttpException(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LHM4;", "R", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ag5$c */
    /* loaded from: classes3.dex */
    public static final class C10809c extends Lambda implements Function1<R, T> {

        /* renamed from: g */
        public static final C10809c f50926g = new C10809c();

        public C10809c() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TR;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(HM4 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Object m103944a = response.m103944a();
            if (m103944a != null) {
                return m103944a;
            }
            throw new HttpException(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LHM4;", "R", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ag5$d */
    /* loaded from: classes3.dex */
    public static final class C10810d extends Lambda implements Function1<R, T> {

        /* renamed from: g */
        public static final C10810d f50927g = new C10810d();

        public C10810d() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TR;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(HM4 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Object m103944a = response.m103944a();
            if (m103944a != null) {
                return m103944a;
            }
            throw new HttpException(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "", "count", "", "throwable", "", C17296a.f69688o, "(Ljava/lang/Integer;Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ag5$e */
    /* loaded from: classes3.dex */
    public static final class C10811e extends Lambda implements Function2<Integer, Throwable, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ int f50928g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10811e(int i) {
            super(2);
            this.f50928g = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            if (r4 != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
            if (r4.intValue() >= r3.f50928g) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
            r1 = false;
         */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Integer count, Throwable throwable) {
            boolean z;
            Intrinsics.checkNotNullParameter(count, "count");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            boolean z2 = true;
            if (throwable instanceof retrofit2.HttpException) {
                int m15616a = ((retrofit2.HttpException) throwable).m15616a();
                if (400 <= m15616a && m15616a < 500) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    public static /* synthetic */ AbstractC23461c completeAfterRetry$default(AbstractC23461c abstractC23461c, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1;
        }
        return m70889f(abstractC23461c, j);
    }

    /* renamed from: f */
    public static final AbstractC23461c m70889f(AbstractC23461c abstractC23461c, long j) {
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        AbstractC23461c m33069Q = abstractC23461c.m33065U(j).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "retry(retries).onErrorComplete()");
        return m33069Q;
    }

    /* renamed from: g */
    public static final <T, R extends HM4<T>> Observable<Optional<T>> m70888g(Observable<R> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        final C10808b c10808b = C10808b.f50925g;
        Observable<Optional<T>> observable2 = (Observable<Optional<T>>) observable.map(new InterfaceC23492o() { // from class: Qf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m70885j;
                m70885j = C38096ag5.m70885j(Function1.this, obj);
                return m70885j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "this.map { response ->\n …esponse.body())\n    }\n  }");
        return observable2;
    }

    /* renamed from: h */
    public static final <T, R extends HM4<T>> AbstractC23442F<Optional<T>> m70887h(AbstractC23442F<R> abstractC23442F) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        final C10807a c10807a = C10807a.f50924g;
        AbstractC23442F<Optional<T>> abstractC23442F2 = (AbstractC23442F<Optional<T>>) abstractC23442F.m33157I(new InterfaceC23492o() { // from class: Mf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m70886i;
                m70886i = C38096ag5.m70886i(Function1.this, obj);
                return m70886i;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC23442F2, "this.map { response ->\n …esponse.body())\n    }\n  }");
        return abstractC23442F2;
    }

    /* renamed from: i */
    public static final Optional m70886i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final Optional m70885j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final <T, R extends HM4<T>> Observable<T> m70884k(Observable<R> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        final C10810d c10810d = C10810d.f50927g;
        Observable<T> observable2 = (Observable<T>) observable.map(new InterfaceC23492o() { // from class: rf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m70881n;
                m70881n = C38096ag5.m70881n(Function1.this, obj);
                return m70881n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable2, "this.map { response -> r…HttpException(response) }");
        return observable2;
    }

    /* renamed from: l */
    public static final <T, R extends HM4<T>> AbstractC23442F<T> m70883l(AbstractC23442F<R> abstractC23442F) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        final C10809c c10809c = C10809c.f50926g;
        AbstractC23442F<T> abstractC23442F2 = (AbstractC23442F<T>) abstractC23442F.m33157I(new InterfaceC23492o() { // from class: xf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m70882m;
                m70882m = C38096ag5.m70882m(Function1.this, obj);
                return m70882m;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC23442F2, "this.map { response -> r…HttpException(response) }");
        return abstractC23442F2;
    }

    /* renamed from: m */
    public static final Object m70882m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    public static /* synthetic */ AbstractC23442F maybeRetry$default(AbstractC23442F abstractC23442F, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return m70880o(abstractC23442F, i);
    }

    /* renamed from: n */
    public static final Object m70881n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final <T> AbstractC23442F<T> m70880o(AbstractC23442F<T> abstractC23442F, int i) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        final C10811e c10811e = new C10811e(i);
        AbstractC23442F<T> m33145U = abstractC23442F.m33145U(new InterfaceC23481d() { // from class: Of5
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m70879p;
                m70879p = C38096ag5.m70879p(Function2.this, obj, obj2);
                return m70879p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33145U, "limit: Int = RETRY_LIMIT…   else -> true\n    }\n  }");
        return m33145U;
    }

    /* renamed from: p */
    public static final boolean m70879p(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }
}
