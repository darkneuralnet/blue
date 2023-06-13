package co.bird.android.app.feature.operator.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "LuQ3;", C17296a.f69688o, "LuQ3;", "permissionDelegate", "Lio/reactivex/subjects/a;", "", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/a;", "locationEnabledSubject", "Lio/reactivex/Observable;", "c", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "locationEnabled", "<init>", "(LuQ3;)V", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LocationEnableChangeReceiver extends BroadcastReceiver {

    /* renamed from: d */
    public static final C13916a f61673d = new C13916a(null);

    /* renamed from: e */
    public static final int f61674e = 8;

    /* renamed from: f */
    public static final IntentFilter f61675f = new IntentFilter("android.location.MODE_CHANGED");

    /* renamed from: a */
    public final InterfaceC49820uQ3 f61676a;

    /* renamed from: b */
    public final C24552a<Boolean> f61677b;

    /* renamed from: c */
    public final Observable<Boolean> f61678c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver$a;", "", "Landroid/content/IntentFilter;", "filter", "Landroid/content/IntentFilter;", C17296a.f69688o, "()Landroid/content/IntentFilter;", "getFilter$annotations", "()V", "<init>", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.operator.activity.LocationEnableChangeReceiver$a */
    /* loaded from: classes2.dex */
    public static final class C13916a {
        public /* synthetic */ C13916a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getFilter$annotations() {
        }

        /* renamed from: a */
        public final IntentFilter m60327a() {
            return LocationEnableChangeReceiver.f61675f;
        }

        private C13916a() {
        }
    }

    public LocationEnableChangeReceiver(InterfaceC49820uQ3 permissionDelegate) {
        Intrinsics.checkNotNullParameter(permissionDelegate, "permissionDelegate");
        this.f61676a = permissionDelegate;
        C24552a<Boolean> m31921g = C24552a.m31921g(Boolean.valueOf(permissionDelegate.mo10337h()));
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(permissionDelegate.locationEnabled)");
        this.f61677b = m31921g;
        Observable<Boolean> distinctUntilChanged = m31921g.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "locationEnabledSubject.distinctUntilChanged()");
        this.f61678c = distinctUntilChanged;
    }

    /* renamed from: a */
    public final Observable<Boolean> m60328a() {
        return this.f61678c;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "android.location.MODE_CHANGED")) {
            this.f61677b.onNext(Boolean.valueOf(this.f61676a.mo10337h()));
        }
    }
}
