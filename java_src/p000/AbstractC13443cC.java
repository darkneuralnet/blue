package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdScan;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.constant.ScanStatus;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC13443cC;
import p000.C24739jE;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0004J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, m28432d2 = {"LcC;", "LjE;", "T", "LiE;", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "", "resumeOnSuccess", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "w", "Lco/bird/android/model/persistence/Bird;", "B", "LTq4;", "c", "LTq4;", "v", "()LTq4;", "reactiveConfig", "Lom3;", DateTokenConverter.CONVERTER_KEY, "Lom3;", "u", "()Lom3;", "operatorManager", "Ldm5;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Ldm5;Lcom/uber/autodispose/ScopeProvider;LTq4;Lom3;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cC */
/* loaded from: classes4.dex */
public abstract class AbstractC13443cC<T extends C24739jE> extends AbstractC23170iE<T> {

    /* renamed from: c */
    public final C36207Tq4 f60269c;

    /* renamed from: d */
    public final InterfaceC46473om3 f60270d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjE;", "T", "", "raw", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Ljava/lang/String;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$a */
    /* loaded from: classes4.dex */
    public static final class C13444a extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C13444a f60271g = new C13444a();

        public C13444a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String m99597e = C33894Jt4.f18402a.m99597e(raw);
            return m99597e == null ? raw : m99597e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LjE;", "T", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$b */
    /* loaded from: classes4.dex */
    public static final class C13445b extends Lambda implements Function1<String, InterfaceC24574u<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC13443cC<T> f60272g;

        /* renamed from: h */
        public final /* synthetic */ ScanMode f60273h;

        /* renamed from: i */
        public final /* synthetic */ ScanIntention f60274i;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LjE;", "T", "Lco/bird/android/model/BirdScan;", "scan", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/BirdScan;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cC$b$a */
        /* loaded from: classes4.dex */
        public static final class C13446a extends Lambda implements Function1<BirdScan, InterfaceC24574u<? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC13443cC<T> f60275g;

            /* renamed from: h */
            public final /* synthetic */ ScanMode f60276h;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjE;", "T", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: cC$b$a$a */
            /* loaded from: classes4.dex */
            public static final class C13447a extends Lambda implements Function1<DialogResponse, Unit> {

                /* renamed from: g */
                public final /* synthetic */ AbstractC13443cC<T> f60277g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C13447a(AbstractC13443cC<T> abstractC13443cC) {
                    super(1);
                    this.f60277g = abstractC13443cC;
                }

                /* renamed from: a */
                public final void m61722a(DialogResponse dialogResponse) {
                    this.f60277g.getUi().m86370p3();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                    m61722a(dialogResponse);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LjE;", "T", "Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: cC$b$a$b */
            /* loaded from: classes4.dex */
            public static final class C13448b extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends WireBird>> {

                /* renamed from: g */
                public static final C13448b f60278g = new C13448b();

                public C13448b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC24574u<? extends WireBird> invoke(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return AbstractC24507p.m32024u();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13446a(AbstractC13443cC<T> abstractC13443cC, ScanMode scanMode) {
                super(1);
                this.f60275g = abstractC13443cC;
                this.f60276h = scanMode;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC24574u) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC24574u<? extends WireBird> invoke(BirdScan scan) {
                Intrinsics.checkNotNullParameter(scan, "scan");
                WireBird bird = scan.getBird();
                ScanStatus status = scan.getStatus();
                if (bird != null) {
                    return AbstractC24507p.m32068G(bird);
                }
                if (status != null) {
                    AbstractC23442F<DialogResponse> m86372nm = this.f60275g.getUi().m86372nm(this.f60276h, status, this.f60275g.m61733v());
                    final C13447a c13447a = new C13447a(this.f60275g);
                    AbstractC23442F<DialogResponse> m33101w = m86372nm.m33101w(new InterfaceC23484g() { // from class: eC
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            AbstractC13443cC.C13445b.C13446a.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                    final C13448b c13448b = C13448b.f60278g;
                    return m33101w.m33163C(new InterfaceC23492o() { // from class: fC
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u invoke$lambda$1;
                            invoke$lambda$1 = AbstractC13443cC.C13445b.C13446a.invoke$lambda$1(Function1.this, obj);
                            return invoke$lambda$1;
                        }
                    });
                }
                return AbstractC24507p.m32024u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13445b(AbstractC13443cC<T> abstractC13443cC, ScanMode scanMode, ScanIntention scanIntention) {
            super(1);
            this.f60272g = abstractC13443cC;
            this.f60273h = scanMode;
            this.f60274i = scanIntention;
        }

        /* renamed from: c */
        public static final InterfaceC24574u m61726c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends WireBird> invoke(String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            AbstractC23442F m33152N = C38096ag5.m70883l(C28237sD.progress$default(this.f60272g.m61734u().mo8146J0(result, this.f60273h, this.f60274i), this.f60272g.getUi(), 0, 2, (Object) null)).m33152N(C23454a.m33087a());
            final C13446a c13446a = new C13446a(this.f60272g, this.f60273h);
            return m33152N.m33163C(new InterfaceC23492o() { // from class: dC
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m61726c;
                    m61726c = AbstractC13443cC.C13445b.m61726c(Function1.this, obj);
                    return m61726c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjE;", "T", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$c */
    /* loaded from: classes4.dex */
    public static final class C13449c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC13443cC<T> f60279g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13449c(AbstractC13443cC<T> abstractC13443cC) {
            super(1);
            this.f60279g = abstractC13443cC;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f60279g.getUi().m86370p3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjE;", "T", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$d */
    /* loaded from: classes4.dex */
    public static final class C13450d extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f60280g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC13443cC<T> f60281h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13450d(boolean z, AbstractC13443cC<T> abstractC13443cC) {
            super(1);
            this.f60280g = z;
            this.f60281h = abstractC13443cC;
        }

        /* renamed from: a */
        public final void m61720a(WireBird wireBird) {
            if (this.f60280g) {
                this.f60281h.getUi().m86370p3();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m61720a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LjE;", "T", "", "raw", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Ljava/lang/String;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$e */
    /* loaded from: classes4.dex */
    public static final class C13451e extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C13451e f60282g = new C13451e();

        public C13451e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String m99597e = C33894Jt4.f18402a.m99597e(raw);
            return m99597e == null ? raw : m99597e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LjE;", "T", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/u;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$f */
    /* loaded from: classes4.dex */
    public static final class C13452f extends Lambda implements Function1<String, InterfaceC24574u<? extends Bird>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC13443cC<T> f60283g;

        /* renamed from: h */
        public final /* synthetic */ ScanMode f60284h;

        /* renamed from: i */
        public final /* synthetic */ ScanIntention f60285i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13452f(AbstractC13443cC<T> abstractC13443cC, ScanMode scanMode, ScanIntention scanIntention) {
            super(1);
            this.f60283g = abstractC13443cC;
            this.f60284h = scanMode;
            this.f60285i = scanIntention;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Bird> invoke(String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return this.f60283g.m61734u().mo8113c0(result, this.f60284h, this.f60285i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LjE;", "T", "", "e", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$g */
    /* loaded from: classes4.dex */
    public static final class C13453g extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Bird>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC13443cC<T> f60286g;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjE;", "T", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cC$g$a */
        /* loaded from: classes4.dex */
        public static final class C13454a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC13443cC<T> f60287g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13454a(AbstractC13443cC<T> abstractC13443cC) {
                super(1);
                this.f60287g = abstractC13443cC;
            }

            /* renamed from: a */
            public final void m61715a(DialogResponse dialogResponse) {
                this.f60287g.getUi().m86370p3();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m61715a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LjE;", "T", "Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cC$g$b */
        /* loaded from: classes4.dex */
        public static final class C13455b extends Lambda implements Function1<DialogResponse, InterfaceC23434B<? extends Bird>> {

            /* renamed from: g */
            public static final C13455b f60288g = new C13455b();

            public C13455b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<? extends Bird> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.empty();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13453g(AbstractC13443cC<T> abstractC13443cC) {
            super(1);
            this.f60286g = abstractC13443cC;
        }

        /* renamed from: c */
        public static final InterfaceC23434B m61716c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Bird> invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof C39933dk5) {
                C24739jE ui = this.f60286g.getUi();
                C39933dk5 c39933dk5 = (C39933dk5) e;
                ScanMode m43814c = c39933dk5.m43814c();
                ScanStatus m43813d = c39933dk5.m43813d();
                if (m43813d == null) {
                    m43813d = ScanStatus.UNKNOWN;
                }
                AbstractC23442F<DialogResponse> m33152N = ui.m86372nm(m43814c, m43813d, this.f60286g.m61733v()).m33152N(C23454a.m33087a());
                final C13454a c13454a = new C13454a(this.f60286g);
                AbstractC23442F<DialogResponse> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: gC
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        AbstractC13443cC.C13453g.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C13455b c13455b = C13455b.f60288g;
                return m33101w.m33162D(new InterfaceC23492o() { // from class: hC
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m61716c;
                        m61716c = AbstractC13443cC.C13453g.m61716c(Function1.this, obj);
                        return m61716c;
                    }
                });
            }
            throw e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjE;", "T", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$h */
    /* loaded from: classes4.dex */
    public static final class C13456h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC13443cC<T> f60289g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13456h(AbstractC13443cC<T> abstractC13443cC) {
            super(1);
            this.f60289g = abstractC13443cC;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f60289g.getUi().m86370p3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LjE;", "T", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cC$i */
    /* loaded from: classes4.dex */
    public static final class C13457i extends Lambda implements Function1<Bird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f60290g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC13443cC<T> f60291h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13457i(boolean z, AbstractC13443cC<T> abstractC13443cC) {
            super(1);
            this.f60290g = z;
            this.f60291h = abstractC13443cC;
        }

        /* renamed from: a */
        public final void m61713a(Bird bird) {
            if (this.f60290g) {
                this.f60291h.getUi().m86370p3();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m61713a(bird);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13443cC(InterfaceC39953dm5 navigator, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC46473om3 operatorManager) {
        super(navigator, scopeProvider);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        this.f60269c = reactiveConfig;
        this.f60270d = operatorManager;
    }

    /* renamed from: A */
    public static final void m61750A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final String m61748C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC24574u m61747D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC23434B m61746E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m61745F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m61744G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ Observable legacyOperatorScan$default(AbstractC13443cC abstractC13443cC, ScanMode scanMode, ScanIntention scanIntention, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            return abstractC13443cC.m61732w(scanMode, scanIntention, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: legacyOperatorScan");
    }

    public static /* synthetic */ Observable operatorScan$default(AbstractC13443cC abstractC13443cC, ScanMode scanMode, ScanIntention scanIntention, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            return abstractC13443cC.m61749B(scanMode, scanIntention, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: operatorScan");
    }

    /* renamed from: x */
    public static final String m61731x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC24574u m61730y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m61729z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final Observable<Bird> m61749B(ScanMode mode, ScanIntention scanIntention, boolean z) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<String> m86400Am = getUi().m86400Am();
        final C13451e c13451e = C13451e.f60282g;
        Observable<R> map = m86400Am.map(new InterfaceC23492o() { // from class: XB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m61748C;
                m61748C = AbstractC13443cC.m61748C(Function1.this, obj);
                return m61748C;
            }
        });
        final C13452f c13452f = new C13452f(this, mode, scanIntention);
        Observable flatMapMaybe = map.flatMapMaybe(new InterfaceC23492o() { // from class: YB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m61747D;
                m61747D = AbstractC13443cC.m61747D(Function1.this, obj);
                return m61747D;
            }
        });
        final C13453g c13453g = new C13453g(this);
        Observable observeOn = flatMapMaybe.onErrorResumeNext(new InterfaceC23492o() { // from class: ZB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m61746E;
                m61746E = AbstractC13443cC.m61746E(Function1.this, obj);
                return m61746E;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "protected fun operatorSc…ew() }\n      .retry()\n  }");
        Observable m64176e = C38689bg5.m64176e(observeOn, getUi());
        final C13456h c13456h = new C13456h(this);
        Observable doOnError = m64176e.doOnError(new InterfaceC23484g() { // from class: aC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC13443cC.m61745F(Function1.this, obj);
            }
        });
        final C13457i c13457i = new C13457i(z, this);
        Observable<Bird> retry = doOnError.doOnNext(new InterfaceC23484g() { // from class: bC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC13443cC.m61744G(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "protected fun operatorSc…ew() }\n      .retry()\n  }");
        return retry;
    }

    /* renamed from: u */
    public final InterfaceC46473om3 m61734u() {
        return this.f60270d;
    }

    /* renamed from: v */
    public final C36207Tq4 m61733v() {
        return this.f60269c;
    }

    /* renamed from: w */
    public final Observable<WireBird> m61732w(ScanMode mode, ScanIntention scanIntention, boolean z) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<String> m86400Am = getUi().m86400Am();
        final C13444a c13444a = C13444a.f60271g;
        Observable<R> map = m86400Am.map(new InterfaceC23492o() { // from class: TB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m61731x;
                m61731x = AbstractC13443cC.m61731x(Function1.this, obj);
                return m61731x;
            }
        });
        final C13445b c13445b = new C13445b(this, mode, scanIntention);
        Observable observeOn = map.flatMapMaybe(new InterfaceC23492o() { // from class: UB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m61730y;
                m61730y = AbstractC13443cC.m61730y(Function1.this, obj);
                return m61730y;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "protected fun legacyOper…ew() }\n      .retry()\n  }");
        Observable m64176e = C38689bg5.m64176e(observeOn, getUi());
        final C13449c c13449c = new C13449c(this);
        Observable doOnError = m64176e.doOnError(new InterfaceC23484g() { // from class: VB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC13443cC.m61729z(Function1.this, obj);
            }
        });
        final C13450d c13450d = new C13450d(z, this);
        Observable<WireBird> retry = doOnError.doOnNext(new InterfaceC23484g() { // from class: WB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC13443cC.m61750A(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "protected fun legacyOper…ew() }\n      .retry()\n  }");
        return retry;
    }
}
