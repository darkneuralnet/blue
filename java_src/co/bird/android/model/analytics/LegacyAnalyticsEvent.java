package co.bird.android.model.analytics;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000¨\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\n\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016H\u0016J\u0006\u0010\f\u001a\u00020\tJ\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0086\u0002R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001Í\u0001\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001¨\u0006´\u0001"}, m28432d2 = {"Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "Lco/bird/android/model/analytics/IncrementableEvent;", "Lco/bird/android/model/analytics/ChargeableEvent;", "Lco/bird/android/model/analytics/BrazeableEvent;", "type", "Lco/bird/android/model/analytics/Type;", "properties", "", "", "", "(Lco/bird/android/model/analytics/Type;Ljava/util/Map;)V", "name", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "brazeKey", "charge", "", "()Ljava/lang/Double;", "increment", "", "set", "", "key", "value", "Lco/bird/android/model/analytics/AnnouncementShown;", "Lco/bird/android/model/analytics/AppOpenedWithMockLocationProvider;", "Lco/bird/android/model/analytics/BluetoothAutoReconnected;", "Lco/bird/android/model/analytics/BluetoothCommunicationError;", "Lco/bird/android/model/analytics/BluetoothConnectionError;", "Lco/bird/android/model/analytics/BonusDealBannerShown;", "Lco/bird/android/model/analytics/BonusDealPurchased;", "Lco/bird/android/model/analytics/BonusDealPushed;", "Lco/bird/android/model/analytics/BonusDealScreenClaimed;", "Lco/bird/android/model/analytics/BonusDealScreenClaimedWithDefaultCard;", "Lco/bird/android/model/analytics/BonusDealScreenClaimedWithGooglePay;", "Lco/bird/android/model/analytics/BonusDealScreenRejected;", "Lco/bird/android/model/analytics/BonusDealScreenShown;", "Lco/bird/android/model/analytics/BountyMapFilterButtonTapped;", "Lco/bird/android/model/analytics/BountyMapFilterParametersChanged;", "Lco/bird/android/model/analytics/CameraPermissionsRequested;", "Lco/bird/android/model/analytics/CameraPermissionsResponded;", "Lco/bird/android/model/analytics/ChargerAccountInfoEntered;", "Lco/bird/android/model/analytics/ChargerAddressConfirmationCompleted;", "Lco/bird/android/model/analytics/ChargerBasicInfoEntered;", "Lco/bird/android/model/analytics/ChargerBulkReportFraudSubmitted;", "Lco/bird/android/model/analytics/ChargerClickedReleaseRatingsMenuItem;", "Lco/bird/android/model/analytics/ChargerClickedReportFraud;", "Lco/bird/android/model/analytics/ChargerCompletedFirstTask;", "Lco/bird/android/model/analytics/ChargerCompletedFortiethTask;", "Lco/bird/android/model/analytics/ChargerCompletedSecondTask;", "Lco/bird/android/model/analytics/ChargerCompletedTenthTask;", "Lco/bird/android/model/analytics/ChargerCompletedThirdTask;", "Lco/bird/android/model/analytics/ChargerOnboardingCompleted;", "Lco/bird/android/model/analytics/ChargerOnboardingStepEvent;", "Lco/bird/android/model/analytics/ChargerPowerSuppliesDepositCompleted;", "Lco/bird/android/model/analytics/ChargerReportFraudSubmitted;", "Lco/bird/android/model/analytics/ChargerSnoozeButtonShown;", "Lco/bird/android/model/analytics/ChargerSnoozeButtonTapped;", "Lco/bird/android/model/analytics/ChargerSnoozeCancelButtonTapped;", "Lco/bird/android/model/analytics/ChargerSnoozeConfirmButtonTapped;", "Lco/bird/android/model/analytics/ChargerSnoozeConfirmed;", "Lco/bird/android/model/analytics/ChargerSnoozeDismissed;", "Lco/bird/android/model/analytics/ChargerSnoozeError;", "Lco/bird/android/model/analytics/ChargerTaskCompleted;", "Lco/bird/android/model/analytics/ChargerTaskListIndirectCancelTaskActionTapped;", "Lco/bird/android/model/analytics/ChargerTaskListIndirectCancelTaskRequestSubmitted;", "Lco/bird/android/model/analytics/ChargerTaxInfoEntered;", "Lco/bird/android/model/analytics/ChargerTutorialsCompleted;", "Lco/bird/android/model/analytics/ChargerViewedActiveBluetoothSweep;", "Lco/bird/android/model/analytics/ChargerViewedFindBirdsMap;", "Lco/bird/android/model/analytics/ChargerViewedReleaseBirdsMap;", "Lco/bird/android/model/analytics/ChargerViewedReleaseRatings;", "Lco/bird/android/model/analytics/ClickedBecomeChargerMenuItem;", "Lco/bird/android/model/analytics/ClickedChargerOnboardingBasicInfoCountryPicker;", "Lco/bird/android/model/analytics/ClickedRiderToChargerBanner;", "Lco/bird/android/model/analytics/CommunityModeAddressChanged;", "Lco/bird/android/model/analytics/CommunityModeBadParkingSubmitted;", "Lco/bird/android/model/analytics/CommunityModeBadRidingSubmitted;", "Lco/bird/android/model/analytics/CommunityModeDamageSubmitted;", "Lco/bird/android/model/analytics/CommunityModeMapIconClicked;", "Lco/bird/android/model/analytics/CommunityModePhotoAdded;", "Lco/bird/android/model/analytics/CommunityModeScanAdded;", "Lco/bird/android/model/analytics/CommunityModeSidebarIconClicked;", "Lco/bird/android/model/analytics/ContractorBasicFormCompleted;", "Lco/bird/android/model/analytics/ContractorConfirmedAddressCompleted;", "Lco/bird/android/model/analytics/ContractorCreated;", "Lco/bird/android/model/analytics/DropTargetClaimButtonTapped;", "Lco/bird/android/model/analytics/DropTargetDetailsViewed;", "Lco/bird/android/model/analytics/DropTargetPinTapped;", "Lco/bird/android/model/analytics/DropTargetReleaseBirdScanned;", "Lco/bird/android/model/analytics/DropTargetReleaseButtonTapped;", "Lco/bird/android/model/analytics/DropTargetReleaseCompleted;", "Lco/bird/android/model/analytics/DropTargetReleasePhotoTaken;", "Lco/bird/android/model/analytics/DropTargetReleaseScannerOpened;", "Lco/bird/android/model/analytics/EmailSubmitted;", "Lco/bird/android/model/analytics/EmailVerified;", "Lco/bird/android/model/analytics/FirstRide;", "Lco/bird/android/model/analytics/FreeRideCodeEntered;", "Lco/bird/android/model/analytics/FreeRideUsed;", "Lco/bird/android/model/analytics/GooglePayAuthSheetCanceled;", "Lco/bird/android/model/analytics/GooglePayAuthSheetError;", "Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;", "Lco/bird/android/model/analytics/GooglePayAuthSheetSuccess;", "Lco/bird/android/model/analytics/GooglePayButtonClicked;", "Lco/bird/android/model/analytics/HelpOpened;", "Lco/bird/android/model/analytics/IdBackScanned;", "Lco/bird/android/model/analytics/IdEnteredManually;", "Lco/bird/android/model/analytics/IdFrontScanned;", "Lco/bird/android/model/analytics/IdManualEntryScreenViewed;", "Lco/bird/android/model/analytics/IdScannerOpened;", "Lco/bird/android/model/analytics/IdStoreFailed;", "Lco/bird/android/model/analytics/IdSubmitted;", "Lco/bird/android/model/analytics/LocationPermissionsRequested;", "Lco/bird/android/model/analytics/LocationPermissionsResponded;", "Lco/bird/android/model/analytics/LockComplianceModalViewed;", "Lco/bird/android/model/analytics/LoginLocationRequestTimedOut;", "Lco/bird/android/model/analytics/MapViewed;", "Lco/bird/android/model/analytics/MarketingEmailsOptedIn;", "Lco/bird/android/model/analytics/MarketingEmailsOptedOut;", "Lco/bird/android/model/analytics/MenuReleaseBirdsTapped;", "Lco/bird/android/model/analytics/OnboardingLocationEnabled;", "Lco/bird/android/model/analytics/OnboardingTeaserShown;", "Lco/bird/android/model/analytics/PaymentMethodAdded;", "Lco/bird/android/model/analytics/PaymentOpened;", "Lco/bird/android/model/analytics/PhysicalLockSuccessfullyLocked;", "Lco/bird/android/model/analytics/PhysicalLockSuccessfullyUnlocked;", "Lco/bird/android/model/analytics/PhysicalLockTutorialViewed;", "Lco/bird/android/model/analytics/PriceChangeDetected;", "Lco/bird/android/model/analytics/PriceIncreaseModalShown;", "Lco/bird/android/model/analytics/RentalAgreementShown;", "Lco/bird/android/model/analytics/RentalCancelled;", "Lco/bird/android/model/analytics/RentalConfirmedShown;", "Lco/bird/android/model/analytics/RentalDeliveryNotesShown;", "Lco/bird/android/model/analytics/RentalEnded;", "Lco/bird/android/model/analytics/RentalLocationPlansAvailable;", "Lco/bird/android/model/analytics/RentalLocationScreenShown;", "Lco/bird/android/model/analytics/RentalPlansShown;", "Lco/bird/android/model/analytics/RentalSignedUp;", "Lco/bird/android/model/analytics/RentalSignupScreenShown;", "Lco/bird/android/model/analytics/RentalSummaryShown;", "Lco/bird/android/model/analytics/RentalWindowsShown;", "Lco/bird/android/model/analytics/RideButtonTapped;", "Lco/bird/android/model/analytics/RideCompleted;", "Lco/bird/android/model/analytics/RideEndFlow;", "Lco/bird/android/model/analytics/RideHistoryOpened;", "Lco/bird/android/model/analytics/RideLocked;", "Lco/bird/android/model/analytics/RideLockedFailed;", "Lco/bird/android/model/analytics/RideRated;", "Lco/bird/android/model/analytics/RideStartFailed;", "Lco/bird/android/model/analytics/RideUnlockedFailed;", "Lco/bird/android/model/analytics/RiderBulkReportFraudButtonClicked;", "Lco/bird/android/model/analytics/RiderBulkReportFraudSubmitted;", "Lco/bird/android/model/analytics/RiderFlightBarLocationServicesButtonTapped;", "Lco/bird/android/model/analytics/RiderFlightBarShown;", "Lco/bird/android/model/analytics/RiderPinTapped;", "Lco/bird/android/model/analytics/RiderReserveButtonTapped;", "Lco/bird/android/model/analytics/RiderReserveCancelButtonTapped;", "Lco/bird/android/model/analytics/RiderReserveCancelFeedbackSubmitted;", "Lco/bird/android/model/analytics/RiderReserveConfirmButtonTapped;", "Lco/bird/android/model/analytics/RiderReserveConfirmCancelButtonTapped;", "Lco/bird/android/model/analytics/SecondRide;", "Lco/bird/android/model/analytics/SmartlockLocked;", "Lco/bird/android/model/analytics/SmartlockUnlockClosed;", "Lco/bird/android/model/analytics/SmartlockUnlockError;", "Lco/bird/android/model/analytics/SmartlockUnlockViewed;", "Lco/bird/android/model/analytics/SmartlockUnlocked;", "Lco/bird/android/model/analytics/SplashScreenError;", "Lco/bird/android/model/analytics/SplashScreenNavigation;", "Lco/bird/android/model/analytics/SystemSettingsNavigated;", "Lco/bird/android/model/analytics/TenthRide;", "Lco/bird/android/model/analytics/ThirdRide;", "Lco/bird/android/model/analytics/TutorialClosed;", "Lco/bird/android/model/analytics/TutorialPageViewed;", "Lco/bird/android/model/analytics/TutorialStarted;", "Lco/bird/android/model/analytics/UserMarkedDispatchBirdMissing;", "Lco/bird/android/model/analytics/VerificationEmailResent;", "Lco/bird/android/model/analytics/ViewRiderMapFirstTime;", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class LegacyAnalyticsEvent implements AnalyticsEvent, IncrementableEvent, ChargeableEvent, BrazeableEvent {
    private final String name;
    private final Map<String, Object> properties;
    private final Type type;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.APPLICATION_INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.APPLICATION_LAUNCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.APPLICATION_OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.RIDE_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.FREE_RIDE_CODE_ENTERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.FREE_RIDE_ACTIVATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Type.FREE_RIDE_USED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LegacyAnalyticsEvent(Type type, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, map);
    }

    public String brazeKey() {
        return null;
    }

    @Override // co.bird.android.model.analytics.ChargeableEvent
    public Double charge() {
        return null;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return this.name;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        return this.properties;
    }

    @Override // co.bird.android.model.analytics.IncrementableEvent
    public Map<String, Double> increment() {
        Map<String, Double> mapOf;
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(name(), Double.valueOf(1.0d)));
                return mapOf;
            default:
                return null;
        }
    }

    public final String name() {
        return this.type.key();
    }

    public final void set(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        getProperties().put(key, value);
    }

    private LegacyAnalyticsEvent(Type type, Map<String, Object> map) {
        this.type = type;
        this.properties = map;
        this.name = name();
    }

    public /* synthetic */ LegacyAnalyticsEvent(Type type, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? new HashMap() : map, null);
    }
}
