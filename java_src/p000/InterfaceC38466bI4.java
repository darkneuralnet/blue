package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, m28432d2 = {"LbI4;", "", "Lio/reactivex/c;", "clear", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bI4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bI4$a */
    /* loaded from: classes2.dex */
    public static final class C12353a {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "t", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: bI4$a$a */
        /* loaded from: classes2.dex */
        public static final class C12354a extends Lambda implements Function1<Throwable, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC38466bI4 f57242g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12354a(InterfaceC38466bI4 interfaceC38466bI4) {
                super(1);
                this.f57242g = interfaceC38466bI4;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                C41318g46.m40159e(t);
                return this.f57242g.clear().m33049i(AbstractC23461c.m33080F(t));
            }
        }

        /* renamed from: f */
        public static AbstractC23461c m64706f(InterfaceC38466bI4 interfaceC38466bI4, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            final C12354a c12354a = new C12354a(interfaceC38466bI4);
            AbstractC23461c m33067S = receiver.m33067S(new InterfaceC23492o() { // from class: ZH4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m64697o;
                    m64697o = InterfaceC38466bI4.C12353a.m64697o(Function1.this, obj);
                    return m64697o;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33067S, "fun Completable.clearOnE…table.error(t))\n    }\n  }");
            return m33067S;
        }

        /* renamed from: g */
        public static <T> AbstractC24490k<T> m64705g(final InterfaceC38466bI4 interfaceC38466bI4, AbstractC24490k<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AbstractC24490k<T> m32210A0 = receiver.m32210A0(new InterfaceC23492o() { // from class: XH4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC45761na4 m64700l;
                    m64700l = InterfaceC38466bI4.C12353a.m64700l(InterfaceC38466bI4.this, (Throwable) obj);
                    return m64700l;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32210A0, "this.onErrorResumeNext(F…Flowable.error(t))\n    })");
            return m32210A0;
        }

        /* renamed from: h */
        public static <T> AbstractC24507p<T> m64704h(final InterfaceC38466bI4 interfaceC38466bI4, AbstractC24507p<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AbstractC24507p<T> m32062M = receiver.m32062M(new InterfaceC23492o() { // from class: aI4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m64698n;
                    m64698n = InterfaceC38466bI4.C12353a.m64698n(InterfaceC38466bI4.this, (Throwable) obj);
                    return m64698n;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32062M, "this.onErrorResumeNext(F…en(Maybe.error(t))\n    })");
            return m32062M;
        }

        /* renamed from: i */
        public static <T> Observable<T> m64703i(final InterfaceC38466bI4 interfaceC38466bI4, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Observable<T> onErrorResumeNext = receiver.onErrorResumeNext(new InterfaceC23492o() { // from class: YH4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m64701k;
                    m64701k = InterfaceC38466bI4.C12353a.m64701k(InterfaceC38466bI4.this, (Throwable) obj);
                    return m64701k;
                }
            });
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "this.onErrorResumeNext(F…servable.error(t))\n    })");
            return onErrorResumeNext;
        }

        /* renamed from: j */
        public static <T> AbstractC23442F<T> m64702j(final InterfaceC38466bI4 interfaceC38466bI4, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            AbstractC23442F<T> m33150P = receiver.m33150P(new InterfaceC23492o() { // from class: WH4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m64699m;
                    m64699m = InterfaceC38466bI4.C12353a.m64699m(InterfaceC38466bI4.this, (Throwable) obj);
                    return m64699m;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33150P, "this.onErrorResumeNext(F…n(Single.error(t))\n    })");
            return m33150P;
        }

        /* renamed from: k */
        public static InterfaceC23434B m64701k(InterfaceC38466bI4 this$0, Throwable t) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(t, "t");
            C41318g46.m40159e(t);
            return this$0.clear().m33043l(Observable.error(t));
        }

        /* renamed from: l */
        public static InterfaceC45761na4 m64700l(InterfaceC38466bI4 this$0, Throwable t) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(t, "t");
            C41318g46.m40159e(t);
            return this$0.clear().m33047j(AbstractC24490k.m32179Q(t));
        }

        /* renamed from: m */
        public static InterfaceC23447K m64699m(InterfaceC38466bI4 this$0, Throwable t) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(t, "t");
            C41318g46.m40159e(t);
            return this$0.clear().m33042m(AbstractC23442F.m33100x(t));
        }

        /* renamed from: n */
        public static InterfaceC24574u m64698n(InterfaceC38466bI4 this$0, Throwable t) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(t, "t");
            C41318g46.m40159e(t);
            return this$0.clear().m33045k(AbstractC24507p.m32023v(t));
        }

        /* renamed from: o */
        public static InterfaceC23496h m64697o(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }
    }

    AbstractC23461c clear();
}
