package co.bird.android.app.feature.operator.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "Lio/reactivex/subjects/a;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "Lio/reactivex/subjects/a;", "bluetoothEnabledSubject", "Lio/reactivex/Observable;", "b", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "bluetoothEnabled", "LuQ3;", "permissionDelegate", "<init>", "(LuQ3;)V", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BluetoothEnableChangeReceiver extends BroadcastReceiver {

    /* renamed from: c */
    public static final C13915a f61668c = new C13915a(null);

    /* renamed from: d */
    public static final int f61669d = 8;

    /* renamed from: e */
    public static final IntentFilter f61670e = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");

    /* renamed from: a */
    public final C24552a<Boolean> f61671a;

    /* renamed from: b */
    public final Observable<Boolean> f61672b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver$a;", "", "Landroid/content/IntentFilter;", "filter", "Landroid/content/IntentFilter;", C17296a.f69688o, "()Landroid/content/IntentFilter;", "getFilter$annotations", "()V", "<init>", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.operator.activity.BluetoothEnableChangeReceiver$a */
    /* loaded from: classes2.dex */
    public static final class C13915a {
        public /* synthetic */ C13915a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getFilter$annotations() {
        }

        /* renamed from: a */
        public final IntentFilter m60329a() {
            return BluetoothEnableChangeReceiver.f61670e;
        }

        private C13915a() {
        }
    }

    public BluetoothEnableChangeReceiver(InterfaceC49820uQ3 permissionDelegate) {
        Intrinsics.checkNotNullParameter(permissionDelegate, "permissionDelegate");
        C24552a<Boolean> m31921g = C24552a.m31921g(Boolean.valueOf(permissionDelegate.mo10334l()));
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(permissionDelegate.bluetoothEnabled)");
        this.f61671a = m31921g;
        Observable<Boolean> distinctUntilChanged = m31921g.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "bluetoothEnabledSubject.distinctUntilChanged()");
        this.f61672b = distinctUntilChanged;
    }

    /* renamed from: a */
    public final Observable<Boolean> m60330a() {
        return this.f61672b;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!Intrinsics.areEqual(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
        if (intExtra != 10) {
            if (intExtra == 12) {
                this.f61671a.onNext(Boolean.TRUE);
                return;
            }
            return;
        }
        this.f61671a.onNext(Boolean.FALSE);
    }
}
