package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireBatch;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24518b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C47338qE0;
import p000.InterfaceC20340fF;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"LqE0;", "LjE0;", "LfF;", "batchManager", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LvE0;", "ui", "<init>", "(LfF;Le13;Lcom/uber/autodispose/ScopeProvider;LvE0;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCreateBatchPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateBatchPresenter.kt\nco/bird/android/feature/servicecenter/batches/createbatch/CreateBatchPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,47:1\n161#2:48\n*S KotlinDebug\n*F\n+ 1 CreateBatchPresenter.kt\nco/bird/android/feature/servicecenter/batches/createbatch/CreateBatchPresenterImpl\n*L\n43#1:48\n*E\n"})
/* renamed from: qE0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47338qE0 implements InterfaceC43187jE0 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qE0$a */
    /* loaded from: classes3.dex */
    public static final class C27547a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50301vE0 f104939g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27547a(InterfaceC50301vE0 interfaceC50301vE0) {
            super(1);
            this.f104939g = interfaceC50301vE0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f104939g.hideKeyboard();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qE0$b */
    /* loaded from: classes3.dex */
    public static final class C27548b extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, Boolean> {

        /* renamed from: g */
        public static final C27548b f104940g = new C27548b();

        public C27548b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, String> pair) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String batchName = pair.component2();
            Intrinsics.checkNotNullExpressionValue(batchName, "batchName");
            isBlank = StringsKt__StringsJVMKt.isBlank(batchName);
            return Boolean.valueOf(!isBlank);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends String> pair) {
            return invoke2((Pair<Unit, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qE0$c */
    /* loaded from: classes3.dex */
    public static final class C27549c extends Lambda implements Function1<Pair<? extends Unit, ? extends String>, InterfaceC24574u<? extends String>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50301vE0 f104941g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "dialogResponse", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: qE0$c$a */
        /* loaded from: classes3.dex */
        public static final class C27550a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C27550a f104942g = new C27550a();

            public C27550a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse dialogResponse) {
                boolean z;
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                if (dialogResponse == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: qE0$c$b */
        /* loaded from: classes3.dex */
        public static final class C27551b extends Lambda implements Function1<DialogResponse, String> {

            /* renamed from: g */
            public final /* synthetic */ String f104943g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27551b(String str) {
                super(1);
                this.f104943g = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f104943g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27549c(InterfaceC50301vE0 interfaceC50301vE0) {
            super(1);
            this.f104941g = interfaceC50301vE0;
        }

        /* renamed from: d */
        public static final String m17879d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends String> invoke(Pair<Unit, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String batchName = pair.component2();
            InterfaceC50301vE0 interfaceC50301vE0 = this.f104941g;
            Intrinsics.checkNotNullExpressionValue(batchName, "batchName");
            AbstractC23442F<DialogResponse> dialog = interfaceC50301vE0.dialog(new C42001hE0(batchName), true, false);
            final C27550a c27550a = C27550a.f104942g;
            AbstractC24507p<DialogResponse> m33098z = dialog.m33098z(new InterfaceC23494q() { // from class: rE0
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C47338qE0.C27549c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C27551b c27551b = new C27551b(batchName);
            return m33098z.m32067H(new InterfaceC23492o() { // from class: sE0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m17879d;
                    m17879d = C47338qE0.C27549c.m17879d(Function1.this, obj);
                    return m17879d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "batchName", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qE0$d */
    /* loaded from: classes3.dex */
    public static final class C27552d extends Lambda implements Function1<String, InterfaceC23447K<? extends WireBatch>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC20340fF f104944g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC50301vE0 f104945h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: qE0$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C27553a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C27553a(Object obj) {
                super(1, obj, InterfaceC50301vE0.class, "error", "error(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((InterfaceC50301vE0) this.receiver).error(p0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27552d(InterfaceC20340fF interfaceC20340fF, InterfaceC50301vE0 interfaceC50301vE0) {
            super(1);
            this.f104944g = interfaceC20340fF;
            this.f104945h = interfaceC50301vE0;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireBatch> invoke(String batchName) {
            Intrinsics.checkNotNullParameter(batchName, "batchName");
            AbstractC23442F createBatch$default = InterfaceC20340fF.C20341a.createBatch$default(this.f104944g, batchName, null, 2, null);
            final C27553a c27553a = new C27553a(this.f104945h);
            return createBatch$default.m33106t(new InterfaceC23484g() { // from class: tE0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C47338qE0.C27552d.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBatch;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qE0$e */
    /* loaded from: classes3.dex */
    public static final class C27554e extends Lambda implements Function1<WireBatch, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC40099e13 f104946g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27554e(InterfaceC40099e13 interfaceC40099e13) {
            super(1);
            this.f104946g = interfaceC40099e13;
        }

        /* renamed from: a */
        public final void m17875a(WireBatch wireBatch) {
            this.f104946g.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBatch wireBatch) {
            m17875a(wireBatch);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qE0$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C27555f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C27555f f104947b = new C27555f();

        public C27555f() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    public C47338qE0(InterfaceC20340fF batchManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC50301vE0 ui) {
        Intrinsics.checkNotNullParameter(batchManager, "batchManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        AbstractC24490k<Unit> mo7211Z3 = ui.mo7211Z3();
        final C27547a c27547a = new C27547a(ui);
        AbstractC24490k<Unit> m32191K = mo7211Z3.m32191K(new InterfaceC23484g() { // from class: kE0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47338qE0.m17888g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "ui.createBatchClicks()\n …ext { ui.hideKeyboard() }");
        AbstractC24490k m31962a = C24518b.m31962a(m32191K, ui.mo7210g8());
        final C27548b c27548b = C27548b.f104940g;
        AbstractC24490k m32175S = m31962a.m32175S(new InterfaceC23494q() { // from class: lE0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m17887h;
                m17887h = C47338qE0.m17887h(Function1.this, obj);
                return m17887h;
            }
        });
        final C27549c c27549c = new C27549c(ui);
        AbstractC24490k m32154d0 = m32175S.m32154d0(new InterfaceC23492o() { // from class: mE0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m17886i;
                m17886i = C47338qE0.m17886i(Function1.this, obj);
                return m17886i;
            }
        });
        final C27552d c27552d = new C27552d(batchManager, ui);
        AbstractC24490k m32111s0 = m32154d0.m32149f0(new InterfaceC23492o() { // from class: nE0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m17885j;
                m17885j = C47338qE0.m17885j(Function1.this, obj);
                return m17885j;
            }
        }).m32192J0().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "ui.createBatchClicks()\n …dSchedulers.mainThread())");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27554e c27554e = new C27554e(navigator);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: oE0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47338qE0.m17884k(Function1.this, obj);
            }
        };
        final C27555f c27555f = C27555f.f104947b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: pE0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47338qE0.m17883l(Function1.this, obj);
            }
        });
    }

    /* renamed from: g */
    public static final void m17888g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final boolean m17887h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i */
    public static final InterfaceC24574u m17886i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23447K m17885j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m17884k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m17883l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
