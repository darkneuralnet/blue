package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\b\u001a\n\u0010\f\u001a\u00020\b*\u00020\b\"\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28432d2 = {"T", "Lio/reactivex/Observable;", "LXC;", "ui", "e", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "LaM5;", "", "", "f", "c", "i", "", "Lkotlin/reflect/KClass;", "Ljava/lang/RuntimeException;", C17296a.f69688o, "Ljava/util/List;", "NETWORK_EXCEPTIONS", "core-base_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/core/base/extensions/Rx_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* renamed from: bg5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38689bg5 {

    /* renamed from: a */
    public static final List<KClass<? extends RuntimeException>> f57861a;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bg5$a */
    /* loaded from: classes2.dex */
    public static final class C12471a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC9344XC f57862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12471a(AbstractC9344XC abstractC9344XC) {
            super(1);
            this.f57862g = abstractC9344XC;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            AbstractC9344XC abstractC9344XC = this.f57862g;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            C38689bg5.m64178c(abstractC9344XC, C38689bg5.m64172i(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bg5$b */
    /* loaded from: classes2.dex */
    public static final class C12472b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC9344XC f57863g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12472b(AbstractC9344XC abstractC9344XC) {
            super(1);
            this.f57863g = abstractC9344XC;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            AbstractC9344XC abstractC9344XC = this.f57863g;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            C38689bg5.m64178c(abstractC9344XC, C38689bg5.m64172i(e));
        }
    }

    static {
        List<KClass<? extends RuntimeException>> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(RetrofitException.class), Reflection.getOrCreateKotlinClass(HttpException.class)});
        f57861a = listOf;
    }

    /* renamed from: c */
    public static final void m64178c(AbstractC9344XC abstractC9344XC, Throwable e) {
        RetrofitException retrofitException;
        HttpException httpException;
        C49375tg1 c49375tg1;
        String m11932c;
        Intrinsics.checkNotNullParameter(abstractC9344XC, "<this>");
        Intrinsics.checkNotNullParameter(e, "e");
        Throwable m87362c = R36.m87362c(e);
        Unit unit = null;
        if (m87362c instanceof RetrofitException) {
            retrofitException = (RetrofitException) m87362c;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && (m11932c = c49375tg1.m11932c()) != null) {
            abstractC9344XC.error(m11932c);
            unit = Unit.INSTANCE;
        } else {
            if (m87362c instanceof HttpException) {
                httpException = (HttpException) m87362c;
            } else {
                httpException = null;
            }
            if (httpException != null) {
                abstractC9344XC.error(httpException);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            abstractC9344XC.errorGeneric();
        }
    }

    /* renamed from: d */
    public static final AbstractC23461c m64177d(AbstractC23461c abstractC23461c, AbstractC9344XC ui) {
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        Intrinsics.checkNotNullParameter(ui, "ui");
        AbstractC23461c m33070P = abstractC23461c.m33070P(C23454a.m33087a());
        final C12472b c12472b = new C12472b(ui);
        AbstractC23461c m33084B = m33070P.m33084B(new InterfaceC23484g() { // from class: Gf5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38689bg5.m64173h(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33084B, "ui: BaseRenderer): Compl…r(e.unwrapAndLog())\n    }");
        return m33084B;
    }

    /* renamed from: e */
    public static final <T> Observable<T> m64176e(Observable<T> observable, AbstractC9344XC ui) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Observable<T> observeOn = observable.observeOn(C23454a.m33087a());
        final C12471a c12471a = new C12471a(ui);
        Observable<T> doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: tf5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38689bg5.m64174g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "ui: BaseRenderer): Obser…r(e.unwrapAndLog())\n    }");
        return doOnError;
    }

    /* renamed from: f */
    public static final void m64175f(InterfaceC37910aM5 interfaceC37910aM5, Throwable e) {
        RetrofitException retrofitException;
        HttpException httpException;
        C49375tg1 c49375tg1;
        String m11932c;
        Intrinsics.checkNotNullParameter(interfaceC37910aM5, "<this>");
        Intrinsics.checkNotNullParameter(e, "e");
        Throwable m64172i = m64172i(e);
        Unit unit = null;
        if (m64172i instanceof RetrofitException) {
            retrofitException = (RetrofitException) m64172i;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && (m11932c = c49375tg1.m11932c()) != null) {
            interfaceC37910aM5.error(m11932c);
            unit = Unit.INSTANCE;
        } else {
            if (m64172i instanceof HttpException) {
                httpException = (HttpException) m64172i;
            } else {
                httpException = null;
            }
            if (httpException != null) {
                interfaceC37910aM5.error(httpException);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            interfaceC37910aM5.errorGeneric();
        }
    }

    /* renamed from: g */
    public static final void m64174g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m64173h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final Throwable m64172i(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Throwable m87362c = R36.m87362c(th);
        if (C10733aZ.m71221a(m87362c, f57861a)) {
            C41318g46.m40162b(th);
        } else {
            C41318g46.m40159e(th);
        }
        return m87362c;
    }
}
