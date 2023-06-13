package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37927aO4;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B7\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u001c\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0017"}, m28432d2 = {"LaO4;", "Lio/reactivex/functions/o;", "Lio/reactivex/k;", "", "attempts", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/functions/q;", "b", "Lio/reactivex/functions/q;", "predicate", "", "c", "I", "maxAttempts", "delaySeconds", "Lio/reactivex/E;", "e", "Lio/reactivex/E;", "scheduler", "f", "retryCount", "<init>", "(Lio/reactivex/functions/q;IILio/reactivex/E;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aO4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37927aO4 implements InterfaceC23492o<AbstractC24490k<? extends Throwable>, AbstractC24490k<?>> {

    /* renamed from: b */
    public final InterfaceC23494q<? super Throwable> f50387b;

    /* renamed from: c */
    public final int f50388c;

    /* renamed from: d */
    public final int f50389d;

    /* renamed from: e */
    public final AbstractC23437E f50390e;

    /* renamed from: f */
    public int f50391f;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lna4;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Throwable;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aO4$a */
    /* loaded from: classes3.dex */
    public static final class C10667a extends Lambda implements Function1<Throwable, InterfaceC45761na4<? extends Object>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lna4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: aO4$a$a */
        /* loaded from: classes3.dex */
        public static final class C10668a extends Lambda implements Function1<Long, InterfaceC45761na4<? extends Object>> {

            /* renamed from: g */
            public final /* synthetic */ C37927aO4 f50393g;

            /* renamed from: h */
            public final /* synthetic */ Throwable f50394h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10668a(C37927aO4 c37927aO4, Throwable th) {
                super(1);
                this.f50393g = c37927aO4;
                this.f50394h = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC45761na4<? extends Object> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC23494q interfaceC23494q = this.f50393g.f50387b;
                Throwable throwable = this.f50394h;
                Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
                if (interfaceC23494q.test(throwable)) {
                    AbstractC24490k m32123o0 = AbstractC24490k.m32123o0(it);
                    Intrinsics.checkNotNullExpressionValue(m32123o0, "{\n                Flowab….just(it)\n              }");
                    return m32123o0;
                }
                AbstractC24490k m32179Q = AbstractC24490k.m32179Q(this.f50394h);
                Intrinsics.checkNotNullExpressionValue(m32179Q, "{\n                Flowab…hrowable)\n              }");
                return m32179Q;
            }
        }

        public C10667a() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC45761na4 m71498c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC45761na4) tmp0.invoke(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
            if (r0.f50391f < r4.f50392g.f50388c) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC45761na4<? extends Object> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (C37927aO4.this.f50387b.test(throwable)) {
                if (C37927aO4.this.f50388c >= 0) {
                    C37927aO4 c37927aO4 = C37927aO4.this;
                    c37927aO4.f50391f++;
                }
                AbstractC24490k<Long> m32119p1 = AbstractC24490k.m32119p1(C37927aO4.this.f50389d, TimeUnit.SECONDS, C37927aO4.this.f50390e);
                final C10668a c10668a = new C10668a(C37927aO4.this, throwable);
                return m32119p1.m32167W(new InterfaceC23492o() { // from class: ZN4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC45761na4 m71498c;
                        m71498c = C37927aO4.C10667a.m71498c(Function1.this, obj);
                        return m71498c;
                    }
                });
            }
            return AbstractC24490k.m32179Q(throwable);
        }
    }

    public C37927aO4() {
        this(null, 0, 0, null, 15, null);
    }

    /* renamed from: c */
    public static final boolean m71503c(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* renamed from: e */
    public static final InterfaceC45761na4 m71501e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    @Override // io.reactivex.functions.InterfaceC23492o
    /* renamed from: d */
    public AbstractC24490k<?> apply(AbstractC24490k<? extends Throwable> attempts) {
        Intrinsics.checkNotNullParameter(attempts, "attempts");
        final C10667a c10667a = new C10667a();
        AbstractC24490k m32167W = attempts.m32167W(new InterfaceC23492o() { // from class: XN4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m71501e;
                m71501e = C37927aO4.m71501e(Function1.this, obj);
                return m71501e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32167W, "override fun apply(attem…le)\n        }\n      }\n  }");
        return m32167W;
    }

    public C37927aO4(InterfaceC23494q<? super Throwable> predicate, int i, int i2, AbstractC23437E scheduler) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f50387b = predicate;
        this.f50388c = i;
        this.f50389d = i2;
        this.f50390e = scheduler;
        this.f50391f = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C37927aO4(InterfaceC23494q interfaceC23494q, int i, int i2, AbstractC23437E abstractC23437E, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC23494q, i, i2, abstractC23437E);
        interfaceC23494q = (i3 & 1) != 0 ? new InterfaceC23494q() { // from class: YN4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m71503c;
                m71503c = C37927aO4.m71503c((Throwable) obj);
                return m71503c;
            }
        } : interfaceC23494q;
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 4) != 0 ? 1 : i2;
        if ((i3 & 8) != 0) {
            abstractC23437E = C24542a.m31934a();
            Intrinsics.checkNotNullExpressionValue(abstractC23437E, "computation()");
        }
    }
}
