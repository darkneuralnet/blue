package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.contractor.service.UserTrackerServicePlugin;
import co.bird.android.foregroundservice.ForegroundService;
import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007JX\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007JR\u0010'\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\b\b\u0001\u0010&\u001a\u00020%H\u0007¨\u0006*"}, m28432d2 = {"Lau5;", "", "Lfx1;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsu2;", "localAssetManager", "Landroid/content/Intent;", "mainActivityIntent", "Lqx1;", "c", "LKn6;", "tracker", "Lsm6;", "vehicleManager", "Ldr4;", "locationManager", "LkJ;", "birdManager", "LTq4;", "reactiveConfig", "LEg1;", "bus", "LEa;", "analyticsManager", "LYR4;", "rideManager", C17296a.f69688o, "Lom3;", "operatorManager", "LRh6;", "userStream", "Lde5;", "rxBleClient", "Lgl;", "preference", "LLifecycleOwner;", "processLifecycleOwner", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: au5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38236au5 {

    /* renamed from: a */
    public static final C38236au5 f56506a = new C38236au5();

    private C38236au5() {
    }

    @Provides
    @JvmStatic
    /* renamed from: a */
    public static final AbstractC47767qx1 m65294a(Context context, InterfaceC34076Kn6 tracker, InterfaceC48847sm6 vehicleManager, InterfaceC40001dr4 locationManager, InterfaceC25136kJ birdManager, C36207Tq4 reactiveConfig, InterfaceC32604Eg1 bus, Intent mainActivityIntent, InterfaceC1880Ea analyticsManager, YR4 rideManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(vehicleManager, "vehicleManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(bus, "bus");
        Intrinsics.checkNotNullParameter(mainActivityIntent, "mainActivityIntent");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        return new C0122AY(context, mainActivityIntent, tracker, vehicleManager, locationManager, birdManager, reactiveConfig, bus, analyticsManager, rideManager);
    }

    @Provides
    @JvmStatic
    /* renamed from: b */
    public static final InterfaceC41244fx1 m65293b() {
        return ForegroundService.f65999f;
    }

    @Provides
    @JvmStatic
    /* renamed from: c */
    public static final AbstractC47767qx1 m65292c(Context context, InterfaceC48923su2 localAssetManager, Intent mainActivityIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(mainActivityIntent, "mainActivityIntent");
        return new C42401hu2(context, mainActivityIntent, localAssetManager);
    }

    @Provides
    @JvmStatic
    /* renamed from: d */
    public static final AbstractC47767qx1 m65291d(Context context, InterfaceC46473om3 operatorManager, InterfaceC35660Rh6 userStream, InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig, AbstractC39873de5 rxBleClient, Intent mainActivityIntent, C22454gl preference, LifecycleOwner processLifecycleOwner) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(mainActivityIntent, "mainActivityIntent");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        return new UserTrackerServicePlugin(context, operatorManager, userStream, locationManager, reactiveConfig, rxBleClient, mainActivityIntent, preference, processLifecycleOwner);
    }
}
