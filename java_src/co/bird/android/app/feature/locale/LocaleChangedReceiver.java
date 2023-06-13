package co.bird.android.app.feature.locale;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/app/feature/locale/LocaleChangedReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "LQh2;", C17296a.f69688o, "LQh2;", "()LQh2;", "setJobProducer", "(LQh2;)V", "jobProducer", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocaleChangedReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public InterfaceC35422Qh2 f61537a;

    public LocaleChangedReceiver() {
        H22.f12748a.mo24053h0(this);
    }

    /* renamed from: a */
    public final InterfaceC35422Qh2 m60592a() {
        InterfaceC35422Qh2 interfaceC35422Qh2 = this.f61537a;
        if (interfaceC35422Qh2 != null) {
            return interfaceC35422Qh2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("jobProducer");
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "android.intent.action.LOCALE_CHANGED")) {
            m60592a().mo86442a(new LocaleChangedPayload(C32974Fv2.m106250a()), Reflection.getOrCreateKotlinClass(LocaleChangedJobConsumer.class));
        }
    }
}
