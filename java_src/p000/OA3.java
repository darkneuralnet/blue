package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdActionsAndSettings;
import co.bird.android.model.PrivateBirdAction;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.model.PaymentMethod;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006'"}, m28432d2 = {"LOA3;", "", "Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/persistence/VehicleVersion;", "vehicleVersion", "Lco/bird/android/model/BirdActionsAndSettings;", "actionSettings", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "LH6;", C17296a.f69688o, "", "distance", "b", "LG6;", DateTokenConverter.CONVERTER_KEY, "k", "g", "f", "h", "e", "j", "", "i", "(Lco/bird/android/model/persistence/Bird;)[LG6;", "c", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "LTq4;", "reactiveConfig", "LkI;", "LkI;", "birdAirManager", "<init>", "(Landroid/content/Context;LTq4;LkI;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOwnedBirdDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsConverter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,174:1\n1#2:175\n26#3:176\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsConverter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsConverter\n*L\n144#1:176\n*E\n"})
/* renamed from: OA3 */
/* loaded from: classes3.dex */
public final class OA3 {

    /* renamed from: a */
    public final Context f26087a;

    /* renamed from: b */
    public final C36207Tq4 f26088b;

    /* renamed from: c */
    public final InterfaceC25134kI f26089c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OA3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5912a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdModel.values().length];
            try {
                iArr[BirdModel.BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdModel.B2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BirdModel.B3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BirdModel.EB100.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BirdModel.ES400.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BirdModel.ES500.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BirdModel.BIRDBIKE_UNPAIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BirdModel.BIRDBIKE_PAIRABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OA3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5913b extends FunctionReferenceImpl implements Function1<Number, String> {
        public C5913b(Object obj) {
            super(1, obj, OA3.class, "formatDistance", "formatDistance(Ljava/lang/Number;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Number p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((OA3) this.receiver).m92685b(p0);
        }
    }

    public OA3(Context context, C36207Tq4 reactiveConfig, InterfaceC25134kI birdAirManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(birdAirManager, "birdAirManager");
        this.f26087a = context;
        this.f26088b = reactiveConfig;
        this.f26089c = birdAirManager;
    }

    /* renamed from: a */
    public final List<C3023H6> m92686a(Bird bird, VehicleVersion vehicleVersion, BirdActionsAndSettings actionSettings, String str) {
        List listOfNotNull;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(vehicleVersion, "vehicleVersion");
        Intrinsics.checkNotNullParameter(actionSettings, "actionSettings");
        SpreadBuilder spreadBuilder = new SpreadBuilder(9);
        spreadBuilder.add(m92683d(bird));
        spreadBuilder.add(m92676k(bird, actionSettings));
        spreadBuilder.add(m92679h(bird));
        spreadBuilder.add(m92682e(bird, vehicleVersion));
        spreadBuilder.add(m92680g(bird, str));
        spreadBuilder.add(m92681f(bird));
        spreadBuilder.add(m92677j(bird));
        spreadBuilder.addSpread(m92678i(bird));
        spreadBuilder.add(m92684c(bird, actionSettings));
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C2637G6[spreadBuilder.size()]));
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOfNotNull);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: b */
    public final String m92685b(Number distance) {
        Intrinsics.checkNotNullParameter(distance, "distance");
        return C51916xx1.distance$default(C51916xx1.f118396a, this.f26087a, distance.doubleValue(), 0.0d, false, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2637G6 m92684c(Bird bird, BirdActionsAndSettings birdActionsAndSettings) {
        String string;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean bool;
        boolean z5;
        boolean z6;
        String userId;
        boolean isBlank;
        if (Bird_Kt.isAsleep(bird)) {
            string = this.f26087a.getString(C45871nl4.owned_bird_details_wake_button);
        } else {
            string = this.f26087a.getString(C45871nl4.owned_bird_details_sleep_button);
        }
        String str = string;
        Intrinsics.checkNotNullExpressionValue(str, "if (bird.isAsleep()) {\n …tails_sleep_button)\n    }");
        if (!Bird_Kt.isRetailBird(bird) && birdActionsAndSettings.getActions().contains(PrivateBirdAction.SLEEP)) {
            z = true;
        } else {
            z = false;
        }
        String serialNumber = bird.getSerialNumber();
        if (this.f26088b.m82623f8().m73665a().getPrivateBirdConfig().getAdHocPairing().getAllowedModels().containsKey(bird.getModel()) && (!C0613BT.m114032a(bird).isEmpty())) {
            PrivateBird privateBird = bird.getPrivateBird();
            if (privateBird != null && (userId = privateBird.getUserId()) != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(userId);
                if (!isBlank) {
                    z6 = true;
                    if (!z6) {
                        z2 = true;
                        if (!Bird_Kt.isRetailBird(bird) && !Bird_Kt.isBirdBikePairable(bird) && !Bird_Kt.isES500(bird)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!Bird_Kt.isRetailBird(bird) && this.f26088b.m82623f8().m73665a().getPrivateBirdConfig().getEnableDiagnostics()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bool = (Boolean) this.f26088b.m82601h8().getValue().getTweak("enableSoftResetInPrivateBirds").m86599e();
                        if (bool == null) {
                            z5 = bool.booleanValue();
                        } else {
                            z5 = false;
                        }
                        return new C2637G6(new C19712dH(z, z2, z3, null, str, serialNumber, z4, z5), C31698Aj4.item_actions, false, 4, null);
                    }
                }
            }
            z6 = false;
            if (!z6) {
            }
        }
        z2 = false;
        if (!Bird_Kt.isRetailBird(bird)) {
        }
        z3 = true;
        if (!Bird_Kt.isRetailBird(bird)) {
        }
        z4 = false;
        bool = (Boolean) this.f26088b.m82601h8().getValue().getTweak("enableSoftResetInPrivateBirds").m86599e();
        if (bool == null) {
        }
        return new C2637G6(new C19712dH(z, z2, z3, null, str, serialNumber, z4, z5), C31698Aj4.item_actions, false, 4, null);
    }

    /* renamed from: d */
    public final C2637G6 m92683d(Bird bird) {
        int i;
        int i2;
        BirdModel fromString = BirdModel.Companion.fromString(bird.getModel());
        String model = bird.getModel();
        C41318g46.m40163a("generating bird details item for " + fromString + " derived from " + model, new Object[0]);
        if (Bird_Kt.isBirdAir(bird)) {
            i2 = C41077fg4.bird_air;
        } else {
            if (fromString == null) {
                i = -1;
            } else {
                i = C5912a.$EnumSwitchMapping$0[fromString.ordinal()];
            }
            switch (i) {
                case 1:
                    i2 = C41077fg4.bird_cruiser;
                    break;
                case 2:
                case 3:
                    i2 = C41077fg4.bird_two;
                    break;
                case 4:
                    i2 = C33309Hg4.illustration_bird_bike;
                    break;
                case 5:
                    i2 = C33309Hg4.illustration_bird_s;
                    break;
                case 6:
                    i2 = C33309Hg4.illustration_bird_flex;
                    break;
                case 7:
                case 8:
                    i2 = C33309Hg4.illustration_bird_bike_c1;
                    break;
                default:
                    i2 = C41077fg4.bird_one_black;
                    break;
            }
        }
        return new C2637G6(new C20006eL(fromString, NA0.m94299e(this.f26087a, i2), bird.getBatteryLevel(), bird.getDistance(), bird.getEstimatedRange(), new C5913b(this), bird.getCode()), C31698Aj4.item_bird_details, false, 4, null);
    }

    /* renamed from: e */
    public final C2637G6 m92682e(Bird bird, VehicleVersion vehicleVersion) {
        List listOfNotNull;
        Object first;
        Object first2;
        Object last;
        String str = null;
        if (Bird_Kt.isRetailBird(bird)) {
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{vehicleVersion.getDashVersion(), vehicleVersion.getPcmVersion()});
            int size = listOfNotNull.size();
            if (size != 0) {
                if (size != 1) {
                    Context context = this.f26087a;
                    int i = C45871nl4.owned_bird_details_bird_dash_pcm_firmware_versions_format;
                    first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) listOfNotNull);
                    last = CollectionsKt___CollectionsKt.last((List<? extends Object>) listOfNotNull);
                    str = context.getString(i, first2, last);
                } else {
                    Context context2 = this.f26087a;
                    int i2 = C45871nl4.owned_bird_details_bird_firmware_version_format;
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) listOfNotNull);
                    str = context2.getString(i2, first);
                }
            }
            return new C2637G6(new C4396KL(str, this.f26089c.mo29092l(vehicleVersion)), C31698Aj4.item_firmware_version, false, 4, null);
        }
        return null;
    }

    /* renamed from: f */
    public final C2637G6 m92681f(Bird bird) {
        String string;
        if (!Bird_Kt.isRetailBird(bird)) {
            DateTime lastRideEndedAt = bird.getLastRideEndedAt();
            if (lastRideEndedAt == null || (string = C51916xx1.f118396a.m4390v(lastRideEndedAt)) == null) {
                string = this.f26087a.getString(C45871nl4.owned_bird_details_last_located_unknown);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ils_last_located_unknown)");
            }
            return new C2637G6(string, C31698Aj4.item_last_ridden, false, 4, null);
        }
        return null;
    }

    /* renamed from: g */
    public final C2637G6 m92680g(Bird bird, String str) {
        String m4390v;
        if (!Bird_Kt.isRetailBird(bird)) {
            String string = this.f26087a.getString(C45871nl4.owned_bird_details_last_located_unknown);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ils_last_located_unknown)");
            if (str == null) {
                str = string;
            }
            DateTime gpsAt = bird.getGpsAt();
            if (gpsAt != null && (m4390v = C51916xx1.f118396a.m4390v(gpsAt)) != null) {
                string = m4390v;
            }
            return new C2637G6(new C10236ZL(str, string, new LatLng(bird.getLocation().getLatitude(), bird.getLocation().getLongitude())), C31698Aj4.item_location, false, 4, null);
        }
        return null;
    }

    /* renamed from: h */
    public final C2637G6 m92679h(Bird bird) {
        if (Bird_Kt.isBirdAir(bird)) {
            return new C2637G6(Bird_Kt.getPrivateIdentifier(bird), C31698Aj4.item_bird_nickname, false, 4, null);
        }
        return null;
    }

    /* renamed from: i */
    public final C2637G6[] m92678i(Bird bird) {
        return !Bird_Kt.isBirdBike(bird) ? new C2637G6[0] : new C2637G6[]{new C2637G6(null, C31698Aj4.item_reset_trip_odometer, false, 4, null), new C2637G6(null, C31698Aj4.item_reset_service_reminder, false, 4, null)};
    }

    /* renamed from: j */
    public final C2637G6 m92677j(Bird bird) {
        return new C2637G6(null, C31698Aj4.item_support, false, 4, null);
    }

    /* renamed from: k */
    public final C2637G6 m92676k(Bird bird, BirdActionsAndSettings birdActionsAndSettings) {
        if (!Bird_Kt.isRetailBird(bird) && birdActionsAndSettings.getActions().contains(PrivateBirdAction.TAMPER)) {
            return new C2637G6(Boolean.valueOf(birdActionsAndSettings.getSettings().getTamperAlarmEnabled()), C31698Aj4.item_tamper_alarm, false, 4, null);
        }
        return null;
    }
}
