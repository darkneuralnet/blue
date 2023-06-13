package io.reactivex.rxkotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.functions.C23506a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0012\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00030\bH\u0002\u001aX\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a2\u0010\u0012\u001a\u00020\u000f*\u00020\u00112\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007\" \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013\" \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, m28432d2 = {"", "T", "Lkotlin/Function1;", "", "Lio/reactivex/functions/g;", C17296a.f69688o, "", "c", "Lkotlin/Function0;", "Lio/reactivex/functions/a;", "b", "Lio/reactivex/Observable;", "onError", "onComplete", "onNext", "Lio/reactivex/disposables/c;", "e", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "onNextStub", "onErrorStub", "Lkotlin/jvm/functions/Function0;", "onCompleteStub", "rxkotlin"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.i */
/* loaded from: classes8.dex */
public final class C24535i {

    /* renamed from: a */
    public static final Function1<Object, Unit> f91178a = C24538c.f91183g;

    /* renamed from: b */
    public static final Function1<Throwable, Unit> f91179b = C24537b.f91182g;

    /* renamed from: c */
    public static final Function0<Unit> f91180c = C24536a.f91181g;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 1, 15})
    /* renamed from: io.reactivex.rxkotlin.i$a */
    /* loaded from: classes8.dex */
    public static final class C24536a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C24536a f91181g = new C24536a();

        public C24536a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 1, 15})
    /* renamed from: io.reactivex.rxkotlin.i$b */
    /* loaded from: classes8.dex */
    public static final class C24537b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C24537b f91182g = new C24537b();

        public C24537b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 1, 15})
    /* renamed from: io.reactivex.rxkotlin.i$c */
    /* loaded from: classes8.dex */
    public static final class C24538c extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public static final C24538c f91183g = new C24538c();

        public C24538c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.k] */
    /* renamed from: a */
    public static final <T> InterfaceC23484g<T> m31940a(Function1<? super T, Unit> function1) {
        if (function1 == f91178a) {
            InterfaceC23484g<T> m32967g = C23506a.m32967g();
            Intrinsics.checkExpressionValueIsNotNull(m32967g, "Functions.emptyConsumer()");
            return m32967g;
        }
        if (function1 != null) {
            function1 = new C24540k(function1);
        }
        return (InterfaceC23484g) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.j] */
    /* renamed from: b */
    public static final InterfaceC23478a m31939b(Function0<Unit> function0) {
        if (function0 == f91180c) {
            InterfaceC23478a interfaceC23478a = C23506a.f88247c;
            Intrinsics.checkExpressionValueIsNotNull(interfaceC23478a, "Functions.EMPTY_ACTION");
            return interfaceC23478a;
        }
        if (function0 != null) {
            function0 = new C24539j(function0);
        }
        return (InterfaceC23478a) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxkotlin.k] */
    /* renamed from: c */
    public static final InterfaceC23484g<Throwable> m31938c(Function1<? super Throwable, Unit> function1) {
        if (function1 == f91179b) {
            InterfaceC23484g<Throwable> interfaceC23484g = C23506a.f88250f;
            Intrinsics.checkExpressionValueIsNotNull(interfaceC23484g, "Functions.ON_ERROR_MISSING");
            return interfaceC23484g;
        }
        if (function1 != null) {
            function1 = new C24540k(function1);
        }
        return (InterfaceC23484g) function1;
    }

    /* renamed from: d */
    public static final InterfaceC23465c m31937d(AbstractC23461c abstractC23461c, Function1<? super Throwable, Unit> function1, Function0<Unit> function0) {
        Function1<Throwable, Unit> function12 = f91179b;
        if (function1 == function12 && function0 == f91180c) {
            InterfaceC23465c subscribe = abstractC23461c.subscribe();
            Intrinsics.checkExpressionValueIsNotNull(subscribe, "subscribe()");
            return subscribe;
        } else if (function1 == function12) {
            InterfaceC23465c m33059b = abstractC23461c.m33059b(new C24539j(function0));
            Intrinsics.checkExpressionValueIsNotNull(m33059b, "subscribe(onComplete)");
            return m33059b;
        } else {
            InterfaceC23465c m33055e = abstractC23461c.m33055e(m31939b(function0), new C24540k(function1));
            Intrinsics.checkExpressionValueIsNotNull(m33055e, "subscribe(onComplete.asO…ion(), Consumer(onError))");
            return m33055e;
        }
    }

    /* renamed from: e */
    public static final <T> InterfaceC23465c m31936e(Observable<T> observable, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        InterfaceC23465c subscribe = observable.subscribe(m31940a(function12), m31938c(function1), m31939b(function0));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return subscribe;
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC23465c m31935f(Observable observable, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = f91179b;
        }
        if ((i & 2) != 0) {
            function0 = f91180c;
        }
        if ((i & 4) != 0) {
            function12 = f91178a;
        }
        return m31936e(observable, function1, function0, function12);
    }
}
