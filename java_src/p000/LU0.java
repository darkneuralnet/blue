package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.nestdetails.NestDetailsActivity;
import co.bird.android.model.Balance;
import co.bird.android.model.Folder;
import co.bird.android.model.LastLockComplianceModel;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.RideState;
import co.bird.android.model.TaxInformationSource;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.SmartlockVendor;
import co.bird.android.model.constant.TutorialType;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.ItemLeaseMetadata;
import co.bird.android.model.wire.PhysicalLockKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import co.bird.android.model.wire.WireReceipt;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import co.bird.android.model.wire.configs.RideConfig;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.location.places.Place;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import p000.InterfaceC40099e13;
import p000.LU0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&R\u001f\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fj\u0002\b\u0007j\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8¨\u00069"}, m28432d2 = {"LLU0;", "", "Le13;", "navigator", "", "vararg", "", "c", "Ljava/lang/Class;", "Landroid/app/Activity;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/String;ILjava/lang/Class;)V", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "F", "G", "H", "I", "J", "K", "P", "Q", "R", "S", "T", "U", "W", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: LU0 */
/* loaded from: classes2.dex */
public abstract class LU0 {

    /* renamed from: b */
    public final Class<? extends Activity> f21518b;

    /* renamed from: c */
    public static final LU0 f21494c = new LU0("TRANSACTION_RECEIPT", 0) { // from class: LU0.K
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37191C0("d30ed3a1-10ca-4735-8095-bd14bcbe2595", "Bird+ Subscription", null);
        }
    };

    /* renamed from: d */
    public static final LU0 f21495d = new LU0("DISPUTE_CHARGE", 1) { // from class: LU0.h
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37061Z1(new WireRide("1234543", 0.0d, null, null, null, 0, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67108862, null), "You are eligible for a ride credit", "It looks like this time you had a bad ride. To\ncompensate for any incovenience caused we would like to issue you a ride credit that covers a full fare of this ride.\n\nA total of $x will be credited to your account balance as soon as you claim it.\n", null);
        }
    };

    /* renamed from: e */
    public static final LU0 f21496e = new LU0("REFUND_ACCOUNT_BALANCE", 2) { // from class: LU0.t
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36907z0(null);
        }
    };

    /* renamed from: f */
    public static final LU0 f21497f = new LU0("LOCALS_SURVEY", 3) { // from class: LU0.l
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36984m1(null);
        }
    };

    /* renamed from: g */
    public static final LU0 f21498g = new LU0("VPS_PARKING", 4) { // from class: LU0.O
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            YR4 yr4;
            WireRide wireRide;
            Z84<Optional<RideState>> mo75057R;
            Optional<RideState> m73665a;
            RideState m59035e;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (obj instanceof YR4) {
                yr4 = (YR4) obj;
            } else {
                yr4 = null;
            }
            if (yr4 == null || (mo75057R = yr4.mo75057R()) == null || (m73665a = mo75057R.m73665a()) == null || (m59035e = m73665a.m59035e()) == null || (wireRide = m59035e.getRide()) == null) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                wireRide = new WireRide(uuid, 0.0d, null, new WireBird("a8a7f9f2-08da-4a08-ba0b-cb99c1629b04", "eb100", null, 0, null, 0, null, "WB6HA", "ecd49dfb-0e35-47c0-aeb6-61a2507b12b1", null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -388, -1, 3, null), null, 0, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67108854, null);
            }
            InterfaceC40099e13.C19924a.goToVpsParking$default(navigator, wireRide, null, 2, null);
        }
    };

    /* renamed from: h */
    public static final LU0 f21499h = new LU0("VPS_RESOLVE", 5) { // from class: LU0.P
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            WireBird wireBird = new WireBird("a8a7f9f2-08da-4a08-ba0b-cb99c1629b04", "eb100", null, 0, null, 0, null, "WB6HA", "ecd49dfb-0e35-47c0-aeb6-61a2507b12b1", null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -388, -1, 3, null);
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            InterfaceC40099e13.C19924a.goToVpsResolve$default(navigator, wireBird, uuid, null, 4, null);
        }
    };

    /* renamed from: i */
    public static final LU0 f21500i = new LU0("FLEET_REPORT", 6) { // from class: LU0.i
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37060Z2();
        }
    };

    /* renamed from: j */
    public static final LU0 f21501j = new LU0("BIRD_PLUS_LANDING", 7) { // from class: LU0.d
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToBirdPlus$default(navigator, null, 1, null);
        }
    };

    /* renamed from: k */
    public static final LU0 f21502k = new LU0("BIRD_PLUS_DETAILS", 8) { // from class: LU0.c
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToBirdPlusDetails$default(navigator, null, null, "123", 3, null);
        }
    };

    /* renamed from: l */
    public static final LU0 f21503l = new LU0("RELEASE_ASSIGNMENT", 9) { // from class: LU0.u
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37036d3();
        }
    };

    /* renamed from: m */
    public static final LU0 f21504m = new LU0("SOBER_RIDE_START", 10) { // from class: LU0.H
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36997k0("birdId", 123);
        }
    };

    /* renamed from: n */
    public static final LU0 f21505n = new LU0("HELMET_LEASE_RETURN_SCAN", 11) { // from class: LU0.k
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            navigator.mo36979n0(new ItemLease("123", "123", null, null, null, now, now2, null, null, null, 0, 0, 0, null, null, null, new ItemLeaseMetadata("postal", null, 2, null), 65436, null), "debug_screen", 12345);
        }
    };

    /* renamed from: o */
    public static final LU0 f21506o = new LU0("HELMET_LEASE_ONBOARDING_PROMPT", 12) { // from class: LU0.j
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36986m(null, 12345);
        }
    };

    /* renamed from: p */
    public static final LU0 f21507p = new LU0("QUICK_PAYMENT", 13) { // from class: LU0.s
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36924w1(10042);
        }
    };

    /* renamed from: q */
    public static final LU0 f21508q = new LU0("PURCHASE_PAYMENT", 14) { // from class: LU0.r
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37140K3(C45871nl4.ride_pass_left_navigation_title, 10046, 400L, Source.USD, PaymentAddSource.RIDE_PASS_PURCHASE);
        }
    };

    /* renamed from: r */
    public static final LU0 f21509r = new LU0("RIDE_PASS_V4", 15) { // from class: LU0.C
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToRidePassV4$default(navigator, null, 1, null);
        }
    };

    /* renamed from: s */
    public static final LU0 f21510s = new LU0("RIDE_RATING", 16) { // from class: LU0.D
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToRideRating$default(navigator, new WireRide(null, 0.0d, null, null, null, 0, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67108863, null), 5.0f, null, 4, null);
        }
    };

    /* renamed from: t */
    public static final LU0 f21511t = new LU0("SERVICE_CENTER_STATUS", 17) { // from class: LU0.E
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36981m4();
        }
    };

    /* renamed from: u */
    public static final LU0 f21512u = new LU0("REPAIR_LIST_ACTIVITY", 18) { // from class: LU0.v
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            navigator.mo37101R1(new WireBird(uuid, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -2, -1, 3, null));
        }
    };

    /* renamed from: v */
    public static final LU0 f21513v = new LU0("BIRD_SHOP", 19) { // from class: LU0.e
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37110P3();
        }
    };

    /* renamed from: w */
    public static final LU0 f21514w = new LU0("AUTOPAY_V2", 20) { // from class: LU0.a
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            List listOf;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AutoPayPlanConfig[]{new AutoPayPlanConfig("test1", 1000, 0, 0, 8, null), new AutoPayPlanConfig("test2", CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, 0, 8, null), new AutoPayPlanConfig("test3", 5000, 400, 0, 8, null)});
            navigator.mo37102R0(new RideConfig(0L, 0L, 0L, null, 0L, 0L, null, 0, null, false, 0, 0, false, listOf, 0L, null, false, false, null, 0L, 0, null, null, false, false, false, false, false, 0.0d, 0.0d, false, 0, 0, false, null, null, null, false, false, false, false, false, false, 0, 0, false, false, 0, false, false, false, null, false, false, false, false, 0, 0, 0, null, false, false, false, false, false, 0, 0, false, false, false, 0, 0, null, null, null, false, false, 0.0f, false, false, null, null, null, null, 0, false, -12289, -1, 4194303, null), new Balance(null, null, 5000L, null, null, 5000, null, null, null, null, null, 2011, null), null, 0);
        }
    };

    /* renamed from: x */
    public static final LU0 f21515x = new LU0("RIDE_HISTORY", 21) { // from class: LU0.A
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToRideHistory$default(navigator, null, 1, null);
        }
    };

    /* renamed from: y */
    public static final LU0 f21516y = new LU0("UNLOCK_BIRD", 22) { // from class: LU0.M
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(navigator, new WirePhysicalLock("id", "bird_id", PhysicalLockKind.COMBINATION.name(), "8234", null, null, null, null, null, null, Place.TYPE_INTERSECTION, null), true, null, null, false, null, 60, null);
        }
    };

    /* renamed from: z */
    public static final LU0 f21517z = new LU0("LOCK_BIRD", 23) { // from class: LU0.m
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(navigator, new WirePhysicalLock("id", "bird_id", PhysicalLockKind.COMBINATION.name(), "43712", null, null, null, null, null, null, Place.TYPE_INTERSECTION, null), false, null, null, false, null, 60, null);
        }
    };

    /* renamed from: A */
    public static final LU0 f21475A = new LU0("RIDE_FEEDBACK", 24) { // from class: LU0.z
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToRideFeedback$default(navigator, new WireRide("Test", 0.0d, null, null, null, 12345, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67108830, null), 5.0f, null, 4, null);
        }
    };

    /* renamed from: B */
    public static final LU0 f21476B = new LU0("AUTO_PAY", 25) { // from class: LU0.b
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36959q2();
        }
    };

    /* renamed from: C */
    public static final LU0 f21477C = new LU0("REPLACE_PHYSICAL_LOCK", 26) { // from class: LU0.w
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37112P1("754a54e5-ba02-4f73-8d26-d7b703209abd");
        }
    };

    /* renamed from: D */
    public static final LU0 f21478D = new LU0("TUTORIAL_ACTIVITY", 27) { // from class: LU0.L
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToTutorial$default(navigator, TutorialType.RELEASE_LOCATION, null, 2, null);
        }
    };

    /* renamed from: E */
    public static final LU0 f21479E = new LU0("RIDE_LOCK_PHOTO", 28) { // from class: LU0.B
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToRideEndPhoto$default(navigator, new WireRideDetail(new WireRide(null, 0.0d, null, new WireBird(null, "eb100", null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, new WirePhysicalLock(null, null, PhysicalLockKind.EB100_CABLE_LOCK.toString(), null, null, null, null, null, null, PhysicalLockPurpose.LOCK_TO, 507, null), false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -3, -129, 3, null), null, 0, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 67108855, null), null, null, null, new WireReceipt(null, null, 0L, null, null, null, null, 0L, KotlinVersion.MAX_COMPONENT_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048558, null), false, true, 2, null);
        }
    };

    /* renamed from: F */
    public static final LU0 f21480F = new LU0("PHYSICAL_LOCK_TUTORIAL_ACTIVITY", 29) { // from class: LU0.q
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            List listOf;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            WirePhysicalLockTutorialStep wirePhysicalLockTutorialStep = new WirePhysicalLockTutorialStep("https://static.bird.co/physical_lock_tutorial_1_cable.json", "A new way to secure your ride", "We've added locks to keep sidewalks clear and make Birds easier to find for everyone");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new WirePhysicalLockTutorialStep[]{wirePhysicalLockTutorialStep, WirePhysicalLockTutorialStep.copy$default(wirePhysicalLockTutorialStep, null, "Step 2", null, 5, null), WirePhysicalLockTutorialStep.copy$default(wirePhysicalLockTutorialStep, null, "Step 3", null, 5, null)});
            InterfaceC40099e13.C19924a.goToPhysicalLockTutorial$default(navigator, new WirePhysicalLock("physicallock", "bird", "cable", null, null, null, listOf, null, null, null, 952, null), false, null, 6, null);
        }
    };

    /* renamed from: G */
    public static final LU0 f21481G = new LU0("SMARTLOCK_UNLOCK_ACTIVITY", 30) { // from class: LU0.G
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(navigator, new WirePhysicalLock("physicallock", "bird", "cable", null, null, null, null, null, new WireSmartlock("lock", null, "11:22:33:44:55:66", "token", null, SmartlockVendor.NOKELOCK_CHINA, 18, null), PhysicalLockPurpose.LOCK_TO, 248, null), true, null, null, false, null, 60, null);
        }
    };

    /* renamed from: H */
    public static final LU0 f21482H = new LU0("SMARTLOCK_LOCK_ACTIVITY", 31) { // from class: LU0.F
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(navigator, new WirePhysicalLock("physicallock", "bird", "cable", null, null, null, null, null, new WireSmartlock("lock", null, "11:22:33:44:55:66", "token", null, SmartlockVendor.NOKELOCK_CHINA, 18, null), PhysicalLockPurpose.LOCK_TO, 248, null), false, null, null, false, null, 60, null);
        }
    };

    /* renamed from: I */
    public static final LU0 f21483I = new LU0("LOCK_COMPLIANCE_ACTIVITY", 32) { // from class: LU0.n
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37076W1(new LastLockComplianceModel("ride", false, true, "cable"));
        }
    };

    /* renamed from: J */
    public static final LU0 f21484J = new LU0("RETAKEABLE_PHOTO_ACTIVITY_INFO_TEXT", 33) { // from class: LU0.x
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(navigator, new PhotoBannerViewModel(null, Integer.valueOf(C45871nl4.bird_of_interest_photo_guidance), null, null, null, null, null, null, null, 509, null), null, Folder.COMPLAINT_PHOTOS, null, null, false, 58, null);
        }
    };

    /* renamed from: K */
    public static final LU0 f21485K = new LU0("RETAKEABLE_PHOTO_ACTIVITY_INFO_VIEW", 34) { // from class: LU0.y
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(navigator, new PhotoBannerViewModel(null, null, Integer.valueOf(C48193rg4.ic_icon_badge), null, Integer.valueOf(C45871nl4.front_of_license), Integer.valueOf(C45871nl4.take_photo_front), null, Integer.valueOf(C45871nl4.photo_clear), Integer.valueOf(C45871nl4.must_be_legible), 75, null), null, Folder.ID_CARDS, null, null, false, 58, null);
        }
    };

    /* renamed from: P */
    public static final LU0 f21486P = new LU0("CASHPAY_ACTIVITY", 35) { // from class: LU0.f
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36912y1();
        }
    };

    /* renamed from: Q */
    public static final LU0 f21487Q = new LU0("TAX_INFORMATION_ACTIVITY", 36) { // from class: LU0.I
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37066Y1(TaxInformationSource.SIGNUP_FLOW);
        }
    };

    /* renamed from: R */
    public static final LU0 f21488R = new LU0("VEHICLE_TIPPED", 37) { // from class: LU0.N
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            DateTime now = DateTime.now();
            navigator.mo37022g("TEST_TIP_ID" + now);
        }
    };

    /* renamed from: S */
    public static final LU0 f21489S = new C4960o("NEST_DETAILS", 38);

    /* renamed from: T */
    public static final LU0 f21490T = new LU0("PARKING_RULES_ACTIVITY", 39) { // from class: LU0.p
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37089T3();
        }
    };

    /* renamed from: U */
    public static final LU0 f21491U = new LU0("DESTINATION_SEARCH", 40) { // from class: LU0.g
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37084U3(1234);
        }
    };

    /* renamed from: W */
    public static final LU0 f21492W = new LU0("TEST_CRASH", 41) { // from class: LU0.J
        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            throw new RuntimeException("Test crash... do not worry.");
        }
    };

    /* renamed from: X */
    public static final /* synthetic */ LU0[] f21493X = m96898a();

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"LLU0$o;", "LLU0;", "Le13;", "navigator", "", "vararg", "", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: LU0$o */
    /* loaded from: classes2.dex */
    public static final class C4960o extends LU0 {
        public C4960o(String str, int i) {
            super(str, i, NestDetailsActivity.class, null);
        }

        /* renamed from: e */
        public static final void m96895e(InterfaceC40099e13 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "$navigator");
            navigator.mo37067Y0();
        }

        @Override // p000.LU0
        /* renamed from: c */
        public void mo96894c(final InterfaceC40099e13 navigator, Object obj) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.close();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: MU0
                @Override // java.lang.Runnable
                public final void run() {
                    LU0.C4960o.m96895e(InterfaceC40099e13.this);
                }
            }, 1000L);
        }
    }

    public /* synthetic */ LU0(String str, int i, Class cls, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, cls);
    }

    /* renamed from: a */
    public static final /* synthetic */ LU0[] m96898a() {
        return new LU0[]{f21494c, f21495d, f21496e, f21497f, f21498g, f21499h, f21500i, f21501j, f21502k, f21503l, f21504m, f21505n, f21506o, f21507p, f21508q, f21509r, f21510s, f21511t, f21512u, f21513v, f21514w, f21515x, f21516y, f21517z, f21475A, f21476B, f21477C, f21478D, f21479E, f21480F, f21481G, f21482H, f21483I, f21484J, f21485K, f21486P, f21487Q, f21488R, f21489S, f21490T, f21491U, f21492W};
    }

    public static /* synthetic */ void go$default(LU0 lu0, InterfaceC40099e13 interfaceC40099e13, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: go");
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        lu0.mo96894c(interfaceC40099e13, obj);
    }

    public static LU0 valueOf(String str) {
        return (LU0) Enum.valueOf(LU0.class, str);
    }

    public static LU0[] values() {
        return (LU0[]) f21493X.clone();
    }

    /* renamed from: b */
    public final Class<? extends Activity> m96897b() {
        return this.f21518b;
    }

    /* renamed from: c */
    public abstract void mo96894c(InterfaceC40099e13 interfaceC40099e13, Object obj);

    public LU0(String str, int i, Class cls) {
        this.f21518b = cls;
    }
}
