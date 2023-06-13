package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\bB%\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004H\u0014J\u0010\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\t¨\u0006\u0015"}, m28432d2 = {"LZ84;", "T", "Lio/reactivex/Observable;", "LX84;", "Lio/reactivex/D;", "observer", "", "subscribeActual", C17296a.f69688o, "()Ljava/lang/Object;", "b", "LX84;", "property", "c", "Lio/reactivex/Observable;", "observable", "getValue", "value", "<init>", "(LX84;Lio/reactivex/Observable;)V", DateTokenConverter.CONVERTER_KEY, "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z84 */
/* loaded from: classes3.dex */
public final class Z84<T> extends Observable<T> implements X84<T> {

    /* renamed from: d */
    public static final C10119a f47888d = new C10119a(null);

    /* renamed from: b */
    public final X84<T> f47889b;

    /* renamed from: c */
    public final Observable<T> f47890c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\u0018\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00020\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LZ84$a;", "", "Lio/reactivex/Observable;", "LX84;", "R", "S", "propertyObservable", "LZ84;", "b", "(Lio/reactivex/Observable;)LZ84;", "observable", "defaultValue", "c", "(Lio/reactivex/Observable;Ljava/lang/Object;)LZ84;", "<init>", "()V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Z84$a */
    /* loaded from: classes3.dex */
    public static final class C10119a {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Z84$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10120a extends FunctionReferenceImpl implements Function1<S, Unit> {
            public C10120a(Object obj) {
                super(1, obj, C37791a94.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: a */
            public final void m73660a(S p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C37791a94) this.receiver).accept(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                m73660a(obj);
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ C10119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static final void m73661d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX WARN: Incorrect types in method signature: <R:Lio/reactivex/Observable<TS;>;:LX84<+TS;>;S:Ljava/lang/Object;>(TR;)LZ84<TS;>; */
        /* renamed from: b */
        public final Z84 m73663b(Observable propertyObservable) {
            Intrinsics.checkNotNullParameter(propertyObservable, "propertyObservable");
            return new Z84((X84) propertyObservable, propertyObservable, null);
        }

        /* renamed from: c */
        public final <S> Z84<S> m73662c(Observable<S> observable, S defaultValue) {
            Intrinsics.checkNotNullParameter(observable, "observable");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            C37791a94 create$default = C37791a94.C10586a.create$default(C37791a94.f49908h, defaultValue, null, 2, null);
            final C10120a c10120a = new C10120a(create$default);
            Observable<S> doOnNext = observable.doOnNext(new InterfaceC23484g() { // from class: Y84
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    Z84.C10119a.m73661d(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnNext, "observable\n          .doOnNext(relay::accept)");
            return new Z84<>(create$default, doOnNext, null);
        }

        private C10119a() {
        }
    }

    public /* synthetic */ Z84(X84 x84, Observable observable, DefaultConstructorMarker defaultConstructorMarker) {
        this(x84, observable);
    }

    /* renamed from: a */
    public final T m73665a() {
        return getValue();
    }

    @Override // p000.X84
    public T getValue() {
        return this.f47889b.getValue();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f47890c.subscribe(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z84(X84<? extends T> x84, Observable<T> observable) {
        this.f47889b = x84;
        this.f47890c = observable;
    }
}
