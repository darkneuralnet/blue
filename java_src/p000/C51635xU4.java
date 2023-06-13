package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.response.BeginnerModeRiderMapAction;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C51635xU4;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LxU4;", "LtU4;", "", C17296a.f69688o, "Le13;", "Le13;", "navigator", "Lfa5;", "b", "Lfa5;", "riderProfileManager", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "Lco/bird/api/response/BeginnerModeRiderMapAction;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "actions", "", "e", "Ljava/lang/String;", "selectedAccelerationLevel", "f", "activityLabel", "LBU4;", "g", "LBU4;", "ui", "<init>", "(Le13;Lfa5;Lcom/uber/autodispose/ScopeProvider;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LBU4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideModePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideModePresenter.kt\nco/bird/android/app/feature/settings/settings/RideModePresenterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,56:1\n1855#2,2:57\n237#3:59\n*S KotlinDebug\n*F\n+ 1 RideModePresenter.kt\nco/bird/android/app/feature/settings/settings/RideModePresenterImpl\n*L\n41#1:57,2\n52#1:59\n*E\n"})
/* renamed from: xU4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51635xU4 implements InterfaceC49264tU4 {

    /* renamed from: a */
    public final InterfaceC40099e13 f117702a;

    /* renamed from: b */
    public final InterfaceC41018fa5 f117703b;

    /* renamed from: c */
    public final ScopeProvider f117704c;

    /* renamed from: d */
    public final List<BeginnerModeRiderMapAction> f117705d;

    /* renamed from: e */
    public final String f117706e;

    /* renamed from: f */
    public final String f117707f;

    /* renamed from: g */
    public final BU4 f117708g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU4$a */
    /* loaded from: classes2.dex */
    public static final class C30211a extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xU4$a$a */
        /* loaded from: classes2.dex */
        public static final class C30212a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C51635xU4 f117710g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30212a(C51635xU4 c51635xU4) {
                super(1);
                this.f117710g = c51635xU4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f117710g.f117708g.error(C45871nl4.error_generic_body);
            }
        }

        public C30211a() {
            super(1);
        }

        /* renamed from: d */
        public static final void m5128d(C51635xU4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f117702a.close();
        }

        /* renamed from: e */
        public static final void m5127e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c progress$default = C28237sD.progress$default(C51635xU4.this.f117703b.mo30286e(it), C51635xU4.this.f117708g, 0, 2, (Object) null);
            final C51635xU4 c51635xU4 = C51635xU4.this;
            AbstractC23461c m33029z = progress$default.m33029z(new InterfaceC23478a() { // from class: vU4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C51635xU4.C30211a.m5128d(C51635xU4.this);
                }
            });
            final C30212a c30212a = new C30212a(C51635xU4.this);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: wU4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51635xU4.C30211a.m5127e(Function1.this, obj);
                }
            });
        }
    }

    public C51635xU4(InterfaceC40099e13 navigator, InterfaceC41018fa5 riderProfileManager, ScopeProvider scopeProvider, List<BeginnerModeRiderMapAction> actions, String selectedAccelerationLevel, String activityLabel, BU4 ui) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(riderProfileManager, "riderProfileManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(selectedAccelerationLevel, "selectedAccelerationLevel");
        Intrinsics.checkNotNullParameter(activityLabel, "activityLabel");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f117702a = navigator;
        this.f117703b = riderProfileManager;
        this.f117704c = scopeProvider;
        this.f117705d = actions;
        this.f117706e = selectedAccelerationLevel;
        this.f117707f = activityLabel;
        this.f117708g = ui;
    }

    /* renamed from: c */
    public static final InterfaceC23496h m5132c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC49264tU4
    /* renamed from: a */
    public void mo5134a() {
        this.f117708g.mo110361Cl(this.f117707f);
        for (BeginnerModeRiderMapAction beginnerModeRiderMapAction : this.f117705d) {
            this.f117708g.mo110357rk(beginnerModeRiderMapAction, Intrinsics.areEqual(beginnerModeRiderMapAction.getAccelerationLevel(), this.f117706e));
        }
        Observable<String> mo110360H9 = this.f117708g.mo110360H9();
        final C30211a c30211a = new C30211a();
        AbstractC23461c switchMapCompletable = mo110360H9.switchMapCompletable(new InterfaceC23492o() { // from class: uU4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m5132c;
                m5132c = C51635xU4.m5132c(Function1.this, obj);
                return m5132c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f117704c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
