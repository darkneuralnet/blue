package p000;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0000\u001a.\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0000\u001a.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0000\u001a.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0000\u001a\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¨\u0006\u001a"}, m28432d2 = {"", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "k", "(Ljava/lang/Integer;Landroid/content/Context;)Ljava/lang/String;", "T", "Lio/reactivex/F;", "LS74;", "ui", "hiddenState", "q", "Lio/reactivex/p;", "o", "Lio/reactivex/c;", "m", "Lio/reactivex/Observable;", "p", "Lio/reactivex/k;", "n", "", "e", "Landroid/content/res/Resources;", "resources", "Ltg1;", "l", "core-base_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: sD */
/* loaded from: classes2.dex */
public final class C28237sD {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sD$a */
    /* loaded from: classes2.dex */
    public static final class C28238a extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ S74 f108450g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28238a(S74 s74) {
            super(1);
            this.f108450g = s74;
        }

        /* renamed from: a */
        public final void m14534a(InterfaceC23465c interfaceC23465c) {
            this.f108450g.startProgress();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m14534a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sD$b */
    /* loaded from: classes2.dex */
    public static final class C28239b extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ S74 f108451g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28239b(S74 s74) {
            super(1);
            this.f108451g = s74;
        }

        /* renamed from: a */
        public final void m14533a(InterfaceC23465c interfaceC23465c) {
            this.f108451g.startProgress();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m14533a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sD$c */
    /* loaded from: classes2.dex */
    public static final class C28240c extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ S74 f108452g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28240c(S74 s74) {
            super(1);
            this.f108452g = s74;
        }

        /* renamed from: a */
        public final void m14532a(InterfaceC23465c interfaceC23465c) {
            this.f108452g.startProgress();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m14532a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sD$d */
    /* loaded from: classes2.dex */
    public static final class C28241d extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ S74 f108453g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28241d(S74 s74) {
            super(1);
            this.f108453g = s74;
        }

        /* renamed from: a */
        public final void m14531a(InterfaceC23465c interfaceC23465c) {
            this.f108453g.startProgress();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m14531a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LoT5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LoT5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: sD$e */
    /* loaded from: classes2.dex */
    public static final class C28242e extends Lambda implements Function1<InterfaceC46292oT5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ S74 f108454g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28242e(S74 s74) {
            super(1);
            this.f108454g = s74;
        }

        /* renamed from: a */
        public final void m14530a(InterfaceC46292oT5 interfaceC46292oT5) {
            this.f108454g.startProgress();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC46292oT5 interfaceC46292oT5) {
            m14530a(interfaceC46292oT5);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public static final void m14561A(S74 ui, int i) {
        Intrinsics.checkNotNullParameter(ui, "$ui");
        ui.stopProgress(i);
    }

    /* renamed from: k */
    public static final String m14550k(Integer num, Context context) {
        if (num != null && num.intValue() != 0) {
            return context.getString(num.intValue());
        }
        return null;
    }

    @Deprecated(message = "Please use standard retrofit response types to avoid exception parsing")
    /* renamed from: l */
    public static final C49375tg1 m14549l(Throwable e, Resources resources) {
        String str;
        C49375tg1 c49375tg1;
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (e instanceof RetrofitException) {
            if (((RetrofitException) e).m53928b() == RetrofitException.EnumC16708a.NETWORK) {
                String string = resources.getString(C45871nl4.error_network);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(L.string.error_network)");
                c49375tg1 = new C49375tg1(-1, string, null, null, 12, null);
            } else {
                try {
                    c49375tg1 = (C49375tg1) ((RetrofitException) e).m53929a(C49375tg1.class);
                } catch (Throwable th) {
                    String message = th.getMessage();
                    if (message == null) {
                        str = "";
                    } else {
                        str = message;
                    }
                    c49375tg1 = new C49375tg1(500, str, null, null, 12, null);
                }
            }
            Intrinsics.checkNotNullExpressionValue(c49375tg1, "{\n    if (e.kind == Retr… ?: \"\")\n      }\n    }\n  }");
            return c49375tg1;
        }
        String message2 = e.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        return new C49375tg1(500, message2, null, null, 12, null);
    }

    /* renamed from: m */
    public static final AbstractC23461c m14548m(AbstractC23461c abstractC23461c, final S74 ui, final int i) {
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        Intrinsics.checkNotNullParameter(ui, "ui");
        final C28240c c28240c = new C28240c(ui);
        AbstractC23461c m33030y = abstractC23461c.m33081E(new InterfaceC23484g() { // from class: qD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28237sD.m14539v(Function1.this, obj);
            }
        }).m33030y(new InterfaceC23478a() { // from class: rD
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C28237sD.m14538w(S74.this, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33030y, "ui: ProgressUi, hiddenSt…opProgress(hiddenState) }");
        return m33030y;
    }

    /* renamed from: n */
    public static final <T> AbstractC24490k<T> m14547n(AbstractC24490k<T> abstractC24490k, final S74 ui, final int i) {
        Intrinsics.checkNotNullParameter(abstractC24490k, "<this>");
        Intrinsics.checkNotNullParameter(ui, "ui");
        final C28242e c28242e = new C28242e(ui);
        AbstractC24490k<T> m32203E = abstractC24490k.m32189L(new InterfaceC23484g() { // from class: kD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28237sD.m14535z(Function1.this, obj);
            }
        }).m32203E(new InterfaceC23478a() { // from class: lD
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C28237sD.m14561A(S74.this, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32203E, "ui: ProgressUi, hiddenSt…opProgress(hiddenState) }");
        return m32203E;
    }

    /* renamed from: o */
    public static final <T> AbstractC24507p<T> m14546o(AbstractC24507p<T> abstractC24507p, final S74 ui, final int i) {
        Intrinsics.checkNotNullParameter(abstractC24507p, "<this>");
        Intrinsics.checkNotNullParameter(ui, "ui");
        final C28239b c28239b = new C28239b(ui);
        AbstractC24507p<T> m32032m = abstractC24507p.m32027r(new InterfaceC23484g() { // from class: iD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28237sD.m14541t(Function1.this, obj);
            }
        }).m32032m(new InterfaceC23478a() { // from class: jD
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C28237sD.m14540u(S74.this, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32032m, "ui: ProgressUi, hiddenSt…opProgress(hiddenState) }");
        return m32032m;
    }

    /* renamed from: p */
    public static final <T> Observable<T> m14545p(Observable<T> observable, final S74 ui, final int i) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(ui, "ui");
        final C28241d c28241d = new C28241d(ui);
        Observable<T> doFinally = observable.doOnSubscribe(new InterfaceC23484g() { // from class: mD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28237sD.m14537x(Function1.this, obj);
            }
        }).doFinally(new InterfaceC23478a() { // from class: nD
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C28237sD.m14536y(S74.this, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doFinally, "ui: ProgressUi, hiddenSt…opProgress(hiddenState) }");
        return doFinally;
    }

    public static /* synthetic */ AbstractC23442F progress$default(AbstractC23442F abstractC23442F, S74 s74, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return m14544q(abstractC23442F, s74, i);
    }

    /* renamed from: q */
    public static final <T> AbstractC23442F<T> m14544q(AbstractC23442F<T> abstractC23442F, final S74 ui, final int i) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(ui, "ui");
        final C28238a c28238a = new C28238a(ui);
        AbstractC23442F<T> m33110r = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: oD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C28237sD.m14543r(Function1.this, obj);
            }
        }).m33110r(new InterfaceC23478a() { // from class: pD
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C28237sD.m14542s(S74.this, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33110r, "ui: ProgressUi, hiddenSt…opProgress(hiddenState) }");
        return m33110r;
    }

    /* renamed from: r */
    public static final void m14543r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m14542s(S74 ui, int i) {
        Intrinsics.checkNotNullParameter(ui, "$ui");
        ui.stopProgress(i);
    }

    /* renamed from: t */
    public static final void m14541t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m14540u(S74 ui, int i) {
        Intrinsics.checkNotNullParameter(ui, "$ui");
        ui.stopProgress(i);
    }

    /* renamed from: v */
    public static final void m14539v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m14538w(S74 ui, int i) {
        Intrinsics.checkNotNullParameter(ui, "$ui");
        ui.stopProgress(i);
    }

    /* renamed from: x */
    public static final void m14537x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m14536y(S74 ui, int i) {
        Intrinsics.checkNotNullParameter(ui, "$ui");
        ui.stopProgress(i);
    }

    /* renamed from: z */
    public static final void m14535z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ AbstractC24507p progress$default(AbstractC24507p abstractC24507p, S74 s74, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return m14546o(abstractC24507p, s74, i);
    }

    public static /* synthetic */ AbstractC23461c progress$default(AbstractC23461c abstractC23461c, S74 s74, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return m14548m(abstractC23461c, s74, i);
    }

    public static /* synthetic */ Observable progress$default(Observable observable, S74 s74, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return m14545p(observable, s74, i);
    }

    public static /* synthetic */ AbstractC24490k progress$default(AbstractC24490k abstractC24490k, S74 s74, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return m14547n(abstractC24490k, s74, i);
    }
}
