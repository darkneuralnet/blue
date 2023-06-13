package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.DamageTrack;
import co.bird.android.model.wire.WireBird;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lk31;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "e", "", "j", "LTn0;", C17296a.f69688o, "LTn0;", "commandCenterManager", "Lf31;", "b", "Lf31;", "converter", "Ll31;", "c", "Ll31;", "ui", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LTn0;Lf31;Ll31;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDiagnosticsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticsPresenter.kt\nco/bird/android/feature/repair/diagnostics/DiagnosticsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n199#2:41\n1#3:42\n*S KotlinDebug\n*F\n+ 1 DiagnosticsPresenter.kt\nco/bird/android/feature/repair/diagnostics/DiagnosticsPresenter\n*L\n31#1:41\n*E\n"})
/* renamed from: k31  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43675k31 {

    /* renamed from: a */
    public final InterfaceC36176Tn0 f93819a;

    /* renamed from: b */
    public final C40710f31 f93820b;

    /* renamed from: c */
    public final C44268l31 f93821c;

    /* renamed from: d */
    public final ScopeProvider f93822d;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/CommandCenterBody;", "commandCenter", "", "Lco/bird/android/model/DamageTrack;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/CommandCenterBody;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: k31$a */
    /* loaded from: classes3.dex */
    public static final class C25088a extends Lambda implements Function1<CommandCenterBody, List<? extends DamageTrack>> {

        /* renamed from: g */
        public static final C25088a f93823g = new C25088a();

        public C25088a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<DamageTrack> invoke(CommandCenterBody commandCenter) {
            Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
            return commandCenter.getDamageTracks();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: k31$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25089b extends FunctionReferenceImpl implements Function1<List<? extends DamageTrack>, List<? extends C3023H6>> {
        public C25089b(Object obj) {
            super(1, obj, C40710f31.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<DamageTrack> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C40710f31) this.receiver).m42232a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: k31$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25090c extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C25090c(Object obj) {
            super(1, obj, C44268l31.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C44268l31) this.receiver).m27993b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: k31$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25091d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C25091d(Object obj) {
            super(1, obj, C43675k31.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C43675k31) this.receiver).m29399j(p0);
        }
    }

    public C43675k31(InterfaceC36176Tn0 commandCenterManager, C40710f31 converter, C44268l31 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(commandCenterManager, "commandCenterManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f93819a = commandCenterManager;
        this.f93820b = converter;
        this.f93821c = ui;
        this.f93822d = scopeProvider;
    }

    /* renamed from: f */
    public static final List m29403f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final List m29402g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m29401h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m29400i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final void m29404e(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F m70883l = C38096ag5.m70883l(C28237sD.progress$default(this.f93819a.mo80872b(bird.getId()), this.f93821c, 0, 2, (Object) null));
        final C25088a c25088a = C25088a.f93823g;
        AbstractC23442F m33152N = m70883l.m33157I(new InterfaceC23492o() { // from class: g31
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m29403f;
                m29403f = C43675k31.m29403f(Function1.this, obj);
                return m29403f;
            }
        }).m33152N(C24542a.m31934a());
        final C25089b c25089b = new C25089b(this.f93820b);
        AbstractC23442F m33152N2 = m33152N.m33157I(new InterfaceC23492o() { // from class: h31
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m29402g;
                m29402g = C43675k31.m29402g(Function1.this, obj);
                return m29402g;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "commandCenterManager.get…dSchedulers.mainThread())");
        Object m33135e = m33152N2.m33135e(AutoDispose.m45239a(this.f93822d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25090c c25090c = new C25090c(this.f93821c);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: i31
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43675k31.m29401h(Function1.this, obj);
            }
        };
        final C25091d c25091d = new C25091d(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: j31
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43675k31.m29400i(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public final void m29399j(Throwable th) {
        RetrofitException retrofitException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof RetrofitException) {
            retrofitException = (RetrofitException) th;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null) {
            this.f93821c.error(retrofitException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f93821c.errorGeneric();
        }
    }
}
