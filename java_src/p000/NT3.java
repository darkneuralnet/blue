package p000;

import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.PillButtonClickAction;
import co.bird.android.model.wire.configs.RentalConfig;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LNT3;", "", "LTq4;", "reactiveConfig", "Lgl;", "appPreferences", "LEa;", "analyticsManager", "LCx4;", "rentalManager", "Lqi1;", "experimentManager", "Le13;", "navigator", "LaM;", "birdManager", "Ldr4;", "locationManager", "LMT3;", C17296a.f69688o, "Lco/bird/android/model/wire/configs/Config;", "config", "", "b", "(Lco/bird/android/model/wire/configs/Config;)Z", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPillConfigurationFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillConfigurationFactory.kt\nco/bird/android/app/feature/pill/internal/PillConfigurationFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* renamed from: NT3 */
/* loaded from: classes2.dex */
public final class NT3 {

    /* renamed from: a */
    public static final NT3 f24625a = new NT3();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NT3$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5584a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PillButtonClickAction.values().length];
            try {
                iArr[PillButtonClickAction.ON_DEMAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private NT3() {
    }

    /* renamed from: a */
    public final MT3 m93864a(C36207Tq4 reactiveConfig, C22454gl appPreferences, InterfaceC1880Ea analyticsManager, InterfaceC32292Cx4 rentalManager, InterfaceC47617qi1 experimentManager, InterfaceC40099e13 navigator, InterfaceC10636aM birdManager, InterfaceC40001dr4 locationManager) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appPreferences, "appPreferences");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(experimentManager, "experimentManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Config m73665a = reactiveConfig.m82623f8().m73665a();
        if (m73665a.getPillButtonConfig().isNull()) {
            return C45210me6.f98508a;
        }
        if (f24625a.m93863b(m73665a)) {
            return new C34001Kf3(reactiveConfig, analyticsManager, experimentManager, rentalManager, navigator, appPreferences, birdManager, locationManager);
        }
        return C45210me6.f98508a;
    }

    /* renamed from: b */
    public final boolean m93863b(Config config) {
        int i;
        Intrinsics.checkNotNullParameter(config, "config");
        PillButtonClickAction action = config.getPillButtonConfig().getAction();
        if (action == null) {
            i = -1;
        } else {
            i = C5584a.$EnumSwitchMapping$0[action.ordinal()];
        }
        if (i != 1) {
            return false;
        }
        RentalConfig onDemandConfig = config.getRentalConfigs().getOnDemandConfig();
        if (!onDemandConfig.getEnabled() || onDemandConfig.getPillConfig().isNull()) {
            return false;
        }
        return true;
    }
}
