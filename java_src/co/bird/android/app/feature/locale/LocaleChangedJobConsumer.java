package co.bird.android.app.feature.locale;

import co.bird.android.coreinterface.core.job.JobConsumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;", "Lco/bird/android/coreinterface/core/job/JobConsumer;", "Lco/bird/android/app/feature/locale/LocaleChangedPayload;", "", "onCreate", "payload", "k", "Llh6;", "Llh6;", "j", "()Llh6;", "setUserManager", "(Llh6;)V", "userManager", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocaleChangedJobConsumer extends JobConsumer<LocaleChangedPayload> {

    /* renamed from: k */
    public InterfaceC44647lh6 f61535k;

    /* renamed from: j */
    public final InterfaceC44647lh6 m60597j() {
        InterfaceC44647lh6 interfaceC44647lh6 = this.f61535k;
        if (interfaceC44647lh6 != null) {
            return interfaceC44647lh6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userManager");
        return null;
    }

    @Override // co.bird.android.coreinterface.core.job.JobConsumer
    /* renamed from: k */
    public void handle(LocaleChangedPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        m60597j().mo26974S(payload.getLocale()).ignoreElements().m33069Q().m33040o();
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        H22.f12748a.mo24065c2(this);
    }
}
