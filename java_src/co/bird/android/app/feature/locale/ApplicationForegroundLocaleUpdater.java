package co.bird.android.app.feature.locale;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import io.reactivex.AbstractC23461c;
import io.reactivex.rxkotlin.C24535i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;", "LFq2;", "", "onApplicationStart", "Llh6;", "b", "Llh6;", "userManager", "LRh6;", "c", "LRh6;", "userStream", "<init>", "(Llh6;LRh6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ApplicationForegroundLocaleUpdater implements InterfaceC32929Fq2 {

    /* renamed from: b */
    public final InterfaceC44647lh6 f61531b;

    /* renamed from: c */
    public final InterfaceC35660Rh6 f61532c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.locale.ApplicationForegroundLocaleUpdater$a */
    /* loaded from: classes2.dex */
    public static final class C13766a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C13766a f61533g = new C13766a();

        public C13766a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("Unsuccessfully updated user's locale", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.locale.ApplicationForegroundLocaleUpdater$b */
    /* loaded from: classes2.dex */
    public static final class C13767b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C13767b f61534g = new C13767b();

        public C13767b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C41318g46.m40163a("Successfully updated user's locale", new Object[0]);
        }
    }

    public ApplicationForegroundLocaleUpdater(InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f61531b = userManager;
        this.f61532c = userStream;
    }

    @SuppressLint({"CheckResult"})
    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public final void onApplicationStart() {
        if (this.f61532c.mo76578g() && !Intrinsics.areEqual(this.f61532c.mo76581d(), C32974Fv2.m106250a())) {
            C41318g46.m40163a("Updating user's locale on application start.", new Object[0]);
            AbstractC23461c m33069Q = this.f61531b.mo26974S(C32974Fv2.m106250a()).ignoreElements().m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "userManager.updateUserLo…\n      .onErrorComplete()");
            C24535i.m31937d(m33069Q, C13766a.f61533g, C13767b.f61534g);
        }
    }
}
