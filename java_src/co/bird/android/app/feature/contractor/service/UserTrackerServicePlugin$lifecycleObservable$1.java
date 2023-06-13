package co.bird.android.app.feature.contractor.service;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin;
import co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$lifecycleObservable$1;
import io.reactivex.InterfaceC24578y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/y;", "Landroidx/lifecycle/f$a;", "emitter", "", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserTrackerServicePlugin$lifecycleObservable$1 extends Lambda implements Function1<InterfaceC24578y<AbstractC11719f.EnumC11720a>, Unit> {

    /* renamed from: g */
    public final /* synthetic */ UserTrackerServicePlugin f61430g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTrackerServicePlugin$lifecycleObservable$1(UserTrackerServicePlugin userTrackerServicePlugin) {
        super(1);
        this.f61430g = userTrackerServicePlugin;
    }

    /* renamed from: c */
    public static final void m60693c(UserTrackerServicePlugin this$0, final InterfaceC24578y emitter) {
        LifecycleOwner lifecycleOwner;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        lifecycleOwner = this$0.f61400o;
        lifecycleOwner.getLifecycle().mo67008a(new VX0() { // from class: co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin$lifecycleObservable$1$1$1
            @Override // p000.VX0
            public void onStart(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStart(owner);
                emitter.onNext(AbstractC11719f.EnumC11720a.ON_START);
            }

            @Override // p000.VX0
            public void onStop(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                emitter.onNext(AbstractC11719f.EnumC11720a.ON_STOP);
            }
        });
    }

    /* renamed from: b */
    public final void m60694b(final InterfaceC24578y<AbstractC11719f.EnumC11720a> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Handler handler = new Handler(Looper.getMainLooper());
        final UserTrackerServicePlugin userTrackerServicePlugin = this.f61430g;
        handler.post(new Runnable() { // from class: di6
            @Override // java.lang.Runnable
            public final void run() {
                UserTrackerServicePlugin$lifecycleObservable$1.m60693c(UserTrackerServicePlugin.this, emitter);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<AbstractC11719f.EnumC11720a> interfaceC24578y) {
        m60694b(interfaceC24578y);
        return Unit.INSTANCE;
    }
}
