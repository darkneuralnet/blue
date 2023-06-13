package co.bird.android.app.feature.charger.presenter;

import android.content.Intent;
import android.os.Parcelable;
import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.analytics.ChargerTaskListIndirectCancelTaskRequestSubmitted;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23470e;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.H31;
import zendesk.support.CreateRequest;
import zendesk.support.ProviderStore;
import zendesk.support.Request;
import zendesk.support.Support;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B5\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u00061"}, m28432d2 = {"Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;", "LxC;", "LYY5;", "Landroid/content/Intent;", "intent", "", "b", "Lzendesk/support/CreateRequest;", "request", "Lio/reactivex/c;", "E", "", "success", "", "reason", "O", "K", "F", "LrZ5;", "c", "LrZ5;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LjB0;", "e", "LjB0;", "contractorManager", "LEa;", "f", "LEa;", "analyticsManager", "g", "Ljava/lang/String;", "birdCode", "h", "taskId", "Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;", "i", "Lco/bird/android/app/feature/charger/presenter/TaskCancelMode;", "taskCancelMode", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LrZ5;Le13;LjB0;LEa;)V", "ZendeskCreateRequestError", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaskCancelPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskCancelPresenter.kt\nco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,153:1\n180#2:154\n237#2:155\n180#2:156\n*S KotlinDebug\n*F\n+ 1 TaskCancelPresenter.kt\nco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl\n*L\n62#1:154\n106#1:155\n119#1:156\n*E\n"})
/* loaded from: classes2.dex */
public final class TaskCancelPresenterImpl extends C30060xC implements YY5 {

    /* renamed from: c */
    public final C48125rZ5 f61357c;

    /* renamed from: d */
    public final InterfaceC40099e13 f61358d;

    /* renamed from: e */
    public final InterfaceC43160jB0 f61359e;

    /* renamed from: f */
    public final InterfaceC1880Ea f61360f;

    /* renamed from: g */
    public String f61361g;

    /* renamed from: h */
    public String f61362h;

    /* renamed from: i */
    public TaskCancelMode f61363i;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$ZendeskCreateRequestError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lsg1;", "b", "Lsg1;", "getError", "()Lsg1;", "error", "<init>", "(Lsg1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ZendeskCreateRequestError extends RuntimeException {

        /* renamed from: b */
        public final InterfaceC48782sg1 f61364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZendeskCreateRequestError(InterfaceC48782sg1 error) {
            super(error.mo9891c());
            Intrinsics.checkNotNullParameter(error, "error");
            this.f61364b = error;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", C17296a.f69688o, "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$a */
    /* loaded from: classes2.dex */
    public static final class C13701a extends Lambda implements Function1<InterfaceC23470e, Unit> {

        /* renamed from: g */
        public final /* synthetic */ CreateRequest f61365g;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"co/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$a$a", "LlI6;", "Lzendesk/support/Request;", "request", "", "onSuccess", "Lsg1;", "error", "onError", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$a$a */
        /* loaded from: classes2.dex */
        public static final class C13702a extends AbstractC44415lI6<Request> {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23470e f61366a;

            public C13702a(InterfaceC23470e interfaceC23470e) {
                this.f61366a = interfaceC23470e;
            }

            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f61366a.onError(new ZendeskCreateRequestError(error));
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(Request request) {
                Intrinsics.checkNotNullParameter(request, "request");
                this.f61366a.onComplete();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13701a(CreateRequest createRequest) {
            super(1);
            this.f61365g = createRequest;
        }

        /* renamed from: a */
        public final void m60734a(InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C13702a c13702a = new C13702a(emitter);
            ProviderStore provider = Support.INSTANCE.provider();
            Intrinsics.checkNotNull(provider);
            provider.requestProvider().createRequest(this.f61365g, c13702a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m60734a(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$b */
    /* loaded from: classes2.dex */
    public static final class C13703b extends Lambda implements Function1<Unit, Unit> {
        public C13703b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            TaskCancelPresenterImpl.this.f61360f.mo55956N(new ChargerTaskListIndirectCancelTaskRequestSubmitted());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$c */
    /* loaded from: classes2.dex */
    public static final class C13704c extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<WireBird>>> {
        public C13704c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<WireBird>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC43160jB0 interfaceC43160jB0 = TaskCancelPresenterImpl.this.f61359e;
            String str = TaskCancelPresenterImpl.this.f61362h;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskId");
                str = null;
            }
            return interfaceC43160jB0.mo27698d(str, TaskCancelPresenterImpl.this.f61357c.m15762Ql());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$d */
    /* loaded from: classes2.dex */
    public static final class C13705d extends Lambda implements Function1<HM4<WireBird>, Unit> {
        public C13705d() {
            super(1);
        }

        /* renamed from: a */
        public final void m60733a(HM4<WireBird> response) {
            TaskCancelPresenterImpl taskCancelPresenterImpl = TaskCancelPresenterImpl.this;
            boolean m103939f = response.m103939f();
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            taskCancelPresenterImpl.m60740O(m103939f, m94017d != null ? m94017d.m11932c() : null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<WireBird> hm4) {
            m60733a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$e */
    /* loaded from: classes2.dex */
    public static final class C13706e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C13706e f61370g = new C13706e();

        public C13706e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40150n(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$f */
    /* loaded from: classes2.dex */
    public static final class C13707f extends Lambda implements Function1<Unit, Unit> {
        public C13707f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            TaskCancelPresenterImpl.this.f61360f.mo55956N(new ChargerTaskListIndirectCancelTaskRequestSubmitted());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$g */
    /* loaded from: classes2.dex */
    public static final class C13708g extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$g$a */
        /* loaded from: classes2.dex */
        public static final class C13709a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ TaskCancelPresenterImpl f61373g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13709a(TaskCancelPresenterImpl taskCancelPresenterImpl) {
                super(1);
                this.f61373g = taskCancelPresenterImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f61373g.m60740O(false, th.getMessage());
            }
        }

        public C13708g() {
            super(1);
        }

        /* renamed from: d */
        public static final void m60729d(TaskCancelPresenterImpl this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            TaskCancelPresenterImpl.m60739P(this$0, true, null, 2, null);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String string = TaskCancelPresenterImpl.this.f61357c.getActivity().getString(C45871nl4.task_indirect_cancel_request_subject);
            Intrinsics.checkNotNullExpressionValue(string, "ui.activity.getString(L.…t_cancel_request_subject)");
            BaseActivity activity = TaskCancelPresenterImpl.this.f61357c.getActivity();
            int i = C45871nl4.task_indirect_cancel_request_description;
            Object[] objArr = new Object[3];
            String str = TaskCancelPresenterImpl.this.f61361g;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("birdCode");
                str = null;
            }
            objArr[0] = str;
            String str2 = TaskCancelPresenterImpl.this.f61362h;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskId");
                str2 = null;
            }
            objArr[1] = str2;
            objArr[2] = TaskCancelPresenterImpl.this.f61357c.m15762Ql();
            String string2 = activity.getString(i, objArr);
            Intrinsics.checkNotNullExpressionValue(string2, "ui.activity.getString(\n …ui.reasonText()\n        )");
            AbstractC23461c progress$default = C28237sD.progress$default(TaskCancelPresenterImpl.this.m60750E(C42788iZ5.m33804a(string, string2)), TaskCancelPresenterImpl.this.f61357c, 0, 2, (Object) null);
            final C13709a c13709a = new C13709a(TaskCancelPresenterImpl.this);
            AbstractC23461c m33084B = progress$default.m33084B(new InterfaceC23484g() { // from class: gZ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    TaskCancelPresenterImpl.C13708g.invoke$lambda$0(Function1.this, obj);
                }
            });
            final TaskCancelPresenterImpl taskCancelPresenterImpl = TaskCancelPresenterImpl.this;
            return m33084B.m33029z(new InterfaceC23478a() { // from class: hZ5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    TaskCancelPresenterImpl.C13708g.m60729d(TaskCancelPresenterImpl.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$h */
    /* loaded from: classes2.dex */
    public static final class C13710h extends Lambda implements Function1<String, Unit> {
        public C13710h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            CharSequence trim;
            Button m15763Pl = TaskCancelPresenterImpl.this.f61357c.m15763Pl();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            trim = StringsKt__StringsKt.trim((CharSequence) it);
            m15763Pl.setEnabled(trim.toString().length() > 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl$i */
    /* loaded from: classes2.dex */
    public static final class C13711i extends Lambda implements Function0<Unit> {
        public C13711i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TaskCancelPresenterImpl.this.f61358d.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskCancelPresenterImpl(LifecycleScopeProvider<EnumC7097RE> scopeProvider, C48125rZ5 ui, InterfaceC40099e13 navigator, InterfaceC43160jB0 contractorManager, InterfaceC1880Ea analyticsManager) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(contractorManager, "contractorManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f61357c = ui;
        this.f61358d = navigator;
        this.f61359e = contractorManager;
        this.f61360f = analyticsManager;
    }

    /* renamed from: G */
    public static final void m60748G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23447K m60747H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m60746I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m60745J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m60743L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23496h m60742M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m60741N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static /* synthetic */ void m60739P(TaskCancelPresenterImpl taskCancelPresenterImpl, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        taskCancelPresenterImpl.m60740O(z, str);
    }

    /* renamed from: E */
    public final AbstractC23461c m60750E(CreateRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return C45832nh5.m23311e(new C13701a(request));
    }

    /* renamed from: F */
    public final void m60749F() {
        Observable<Unit> m15760Sl = this.f61357c.m15760Sl();
        final C13703b c13703b = new C13703b();
        Observable<Unit> doOnNext = m15760Sl.doOnNext(new InterfaceC23484g() { // from class: aZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TaskCancelPresenterImpl.m60748G(Function1.this, obj);
            }
        });
        final C13704c c13704c = new C13704c();
        Observable observeOn = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: bZ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m60747H;
                m60747H = TaskCancelPresenterImpl.m60747H(Function1.this, obj);
                return m60747H;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun initSubmitAP…Timber.w(it)\n      })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13705d c13705d = new C13705d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: cZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TaskCancelPresenterImpl.m60746I(Function1.this, obj);
            }
        };
        final C13706e c13706e = C13706e.f61370g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: dZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TaskCancelPresenterImpl.m60745J(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public final void m60744K() {
        Observable<Unit> m15760Sl = this.f61357c.m15760Sl();
        final C13707f c13707f = new C13707f();
        Observable<Unit> doOnNext = m15760Sl.doOnNext(new InterfaceC23484g() { // from class: eZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TaskCancelPresenterImpl.m60743L(Function1.this, obj);
            }
        });
        final C13708g c13708g = new C13708g();
        AbstractC23461c m33066T = doOnNext.flatMapCompletable(new InterfaceC23492o() { // from class: fZ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m60742M;
                m60742M = TaskCancelPresenterImpl.m60742M(Function1.this, obj);
                return m60742M;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "private fun initSubmitIn…r)\n      .subscribe()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: O */
    public final void m60740O(boolean z, String str) {
        String str2;
        if (z) {
            C48125rZ5 c48125rZ5 = this.f61357c;
            String str3 = this.f61361g;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("birdCode");
                str3 = null;
            }
            H31.C3014a.showDialog$default(c48125rZ5, new C47532qZ5(str3), false, false, new C13711i(), null, null, null, 118, null);
            return;
        }
        C48125rZ5 c48125rZ52 = this.f61357c;
        String string = c48125rZ52.getActivity().getString(C45871nl4.task_indirect_cancel_error_dialog_title);
        if (str == null) {
            String string2 = this.f61357c.getActivity().getString(C45871nl4.error_generic_body);
            Intrinsics.checkNotNullExpressionValue(string2, "ui.activity.getString(L.string.error_generic_body)");
            str2 = string2;
        } else {
            str2 = str;
        }
        H31.C3014a.showDialog$default(c48125rZ52, string, str2, null, null, false, false, null, null, null, 508, null);
    }

    @Override // p000.YY5
    /* renamed from: b */
    public void mo60738b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("bird_code");
        Intrinsics.checkNotNull(stringExtra);
        this.f61361g = stringExtra;
        String stringExtra2 = intent.getStringExtra("task_id");
        Intrinsics.checkNotNull(stringExtra2);
        this.f61362h = stringExtra2;
        Observable<String> observeOn = this.f61357c.m15761Rl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.reasonTextChanged()\n …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13710h c13710h = new C13710h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZY5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TaskCancelPresenterImpl.m60741N(Function1.this, obj);
            }
        });
        Parcelable parcelableExtra = intent.getParcelableExtra("task_cancel_mode");
        Intrinsics.checkNotNull(parcelableExtra);
        TaskCancelMode taskCancelMode = (TaskCancelMode) parcelableExtra;
        this.f61363i = taskCancelMode;
        if (taskCancelMode == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskCancelMode");
            taskCancelMode = null;
        }
        if (taskCancelMode == TaskCancelMode.INDIRECT) {
            m60744K();
        } else {
            m60749F();
        }
    }
}
