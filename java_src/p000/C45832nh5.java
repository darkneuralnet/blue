package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23446J;
import io.reactivex.InterfaceC23470e;
import io.reactivex.InterfaceC23495g;
import io.reactivex.InterfaceC24516r;
import io.reactivex.InterfaceC24573t;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u001a;\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u001a;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00002'\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\r¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u001a)\u0010\u0012\u001a\u00020\u00112!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001¨\u0006\u0013"}, m28432d2 = {"T", "Lkotlin/Function1;", "Lio/reactivex/y;", "Lkotlin/ParameterName;", "name", "emitter", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lio/reactivex/Observable;", "i", "Lio/reactivex/H;", "Lio/reactivex/F;", "k", "Lio/reactivex/r;", "Lio/reactivex/p;", "g", "Lio/reactivex/e;", "Lio/reactivex/c;", "e", "rx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: nh5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45832nh5 {
    /* renamed from: e */
    public static final AbstractC23461c m23311e(final Function1<? super InterfaceC23470e, Unit> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23461c m33036s = AbstractC23461c.m33036s(new InterfaceC23495g() { // from class: kh5
            @Override // io.reactivex.InterfaceC23495g
            /* renamed from: a */
            public final void mo28635a(InterfaceC23470e interfaceC23470e) {
                C45832nh5.m23310f(Function1.this, interfaceC23470e);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33036s, "create { emitter ->\n    …tter.onError(t)\n    }\n  }");
        return m33036s;
    }

    /* renamed from: f */
    public static final void m23310f(Function1 source, InterfaceC23470e emitter) {
        Intrinsics.checkNotNullParameter(source, "$source");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            source.invoke(new C42867ih5(emitter));
        } catch (Throwable th) {
            emitter.onError(th);
        }
    }

    /* renamed from: g */
    public static final <T> AbstractC24507p<T> m23309g(final Function1<? super InterfaceC24516r<T>, Unit> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC24507p<T> m32037i = AbstractC24507p.m32037i(new InterfaceC24573t() { // from class: jh5
            @Override // io.reactivex.InterfaceC24573t
            /* renamed from: a */
            public final void mo30092a(InterfaceC24516r interfaceC24516r) {
                C45832nh5.m23308h(Function1.this, interfaceC24516r);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32037i, "create { emitter ->\n    …tter.onError(t)\n    }\n  }");
        return m32037i;
    }

    /* renamed from: h */
    public static final void m23308h(Function1 source, InterfaceC24516r emitter) {
        Intrinsics.checkNotNullParameter(source, "$source");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            source.invoke(new C48796sh5(emitter));
        } catch (Throwable th) {
            emitter.onError(th);
        }
    }

    /* renamed from: i */
    public static final <T> Observable<T> m23307i(final Function1<? super InterfaceC24578y<T>, Unit> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Observable<T> create = Observable.create(new InterfaceC24579z() { // from class: mh5
            @Override // io.reactivex.InterfaceC24579z
            public final void subscribe(InterfaceC24578y interfaceC24578y) {
                C45832nh5.m23306j(Function1.this, interfaceC24578y);
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "create { emitter ->\n    …tter.onError(t)\n    }\n  }");
        return create;
    }

    /* renamed from: j */
    public static final void m23306j(Function1 source, InterfaceC24578y emitter) {
        Intrinsics.checkNotNullParameter(source, "$source");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            source.invoke(new C49389th5(emitter));
        } catch (Throwable th) {
            emitter.onError(th);
        }
    }

    /* renamed from: k */
    public static final <T> AbstractC23442F<T> m23305k(final Function1<? super InterfaceC23444H<T>, Unit> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23442F<T> m33126j = AbstractC23442F.m33126j(new InterfaceC23446J() { // from class: lh5
            @Override // io.reactivex.InterfaceC23446J
            public final void subscribe(InterfaceC23444H interfaceC23444H) {
                C45832nh5.m23304l(Function1.this, interfaceC23444H);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33126j, "create { emitter ->\n    …tter.onError(t)\n    }\n  }");
        return m33126j;
    }

    /* renamed from: l */
    public static final void m23304l(Function1 source, InterfaceC23444H emitter) {
        Intrinsics.checkNotNullParameter(source, "$source");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            source.invoke(new C51760xh5(emitter));
        } catch (Throwable th) {
            emitter.onError(th);
        }
    }
}
