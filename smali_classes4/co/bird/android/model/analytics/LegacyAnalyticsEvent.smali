.class public abstract Lco/bird/android/model/analytics/LegacyAnalyticsEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/analytics/AnalyticsEvent;
.implements Lco/bird/android/model/analytics/IncrementableEvent;
.implements Lco/bird/android/model/analytics/ChargeableEvent;
.implements Lco/bird/android/model/analytics/BrazeableEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/analytics/LegacyAnalyticsEvent$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0008\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0008\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0010\u000bJ\n\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016H\u0016J\u0006\u0010\u000c\u001a\u00020\tJ\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0086\u0002R\u0014\u0010\u000c\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0001\u00cd\u0001\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001\u00a0\u0001\u00a1\u0001\u00a2\u0001\u00a3\u0001\u00a4\u0001\u00a5\u0001\u00a6\u0001\u00a7\u0001\u00a8\u0001\u00a9\u0001\u00aa\u0001\u00ab\u0001\u00ac\u0001\u00ad\u0001\u00ae\u0001\u00af\u0001\u00b0\u0001\u00b1\u0001\u00b2\u0001\u00b3\u0001\u00a8\u0006\u00b4\u0001"
    }
    d2 = {
        "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;",
        "Lco/bird/android/model/analytics/AnalyticsEvent;",
        "Lco/bird/android/model/analytics/IncrementableEvent;",
        "Lco/bird/android/model/analytics/ChargeableEvent;",
        "Lco/bird/android/model/analytics/BrazeableEvent;",
        "type",
        "Lco/bird/android/model/analytics/Type;",
        "properties",
        "",
        "",
        "",
        "(Lco/bird/android/model/analytics/Type;Ljava/util/Map;)V",
        "name",
        "getName",
        "()Ljava/lang/String;",
        "getProperties",
        "()Ljava/util/Map;",
        "brazeKey",
        "charge",
        "",
        "()Ljava/lang/Double;",
        "increment",
        "",
        "set",
        "",
        "key",
        "value",
        "Lco/bird/android/model/analytics/AnnouncementShown;",
        "Lco/bird/android/model/analytics/AppOpenedWithMockLocationProvider;",
        "Lco/bird/android/model/analytics/BluetoothAutoReconnected;",
        "Lco/bird/android/model/analytics/BluetoothCommunicationError;",
        "Lco/bird/android/model/analytics/BluetoothConnectionError;",
        "Lco/bird/android/model/analytics/BonusDealBannerShown;",
        "Lco/bird/android/model/analytics/BonusDealPurchased;",
        "Lco/bird/android/model/analytics/BonusDealPushed;",
        "Lco/bird/android/model/analytics/BonusDealScreenClaimed;",
        "Lco/bird/android/model/analytics/BonusDealScreenClaimedWithDefaultCard;",
        "Lco/bird/android/model/analytics/BonusDealScreenClaimedWithGooglePay;",
        "Lco/bird/android/model/analytics/BonusDealScreenRejected;",
        "Lco/bird/android/model/analytics/BonusDealScreenShown;",
        "Lco/bird/android/model/analytics/BountyMapFilterButtonTapped;",
        "Lco/bird/android/model/analytics/BountyMapFilterParametersChanged;",
        "Lco/bird/android/model/analytics/CameraPermissionsRequested;",
        "Lco/bird/android/model/analytics/CameraPermissionsResponded;",
        "Lco/bird/android/model/analytics/ChargerAccountInfoEntered;",
        "Lco/bird/android/model/analytics/ChargerAddressConfirmationCompleted;",
        "Lco/bird/android/model/analytics/ChargerBasicInfoEntered;",
        "Lco/bird/android/model/analytics/ChargerBulkReportFraudSubmitted;",
        "Lco/bird/android/model/analytics/ChargerClickedReleaseRatingsMenuItem;",
        "Lco/bird/android/model/analytics/ChargerClickedReportFraud;",
        "Lco/bird/android/model/analytics/ChargerCompletedFirstTask;",
        "Lco/bird/android/model/analytics/ChargerCompletedFortiethTask;",
        "Lco/bird/android/model/analytics/ChargerCompletedSecondTask;",
        "Lco/bird/android/model/analytics/ChargerCompletedTenthTask;",
        "Lco/bird/android/model/analytics/ChargerCompletedThirdTask;",
        "Lco/bird/android/model/analytics/ChargerOnboardingCompleted;",
        "Lco/bird/android/model/analytics/ChargerOnboardingStepEvent;",
        "Lco/bird/android/model/analytics/ChargerPowerSuppliesDepositCompleted;",
        "Lco/bird/android/model/analytics/ChargerReportFraudSubmitted;",
        "Lco/bird/android/model/analytics/ChargerSnoozeButtonShown;",
        "Lco/bird/android/model/analytics/ChargerSnoozeButtonTapped;",
        "Lco/bird/android/model/analytics/ChargerSnoozeCancelButtonTapped;",
        "Lco/bird/android/model/analytics/ChargerSnoozeConfirmButtonTapped;",
        "Lco/bird/android/model/analytics/ChargerSnoozeConfirmed;",
        "Lco/bird/android/model/analytics/ChargerSnoozeDismissed;",
        "Lco/bird/android/model/analytics/ChargerSnoozeError;",
        "Lco/bird/android/model/analytics/ChargerTaskCompleted;",
        "Lco/bird/android/model/analytics/ChargerTaskListIndirectCancelTaskActionTapped;",
        "Lco/bird/android/model/analytics/ChargerTaskListIndirectCancelTaskRequestSubmitted;",
        "Lco/bird/android/model/analytics/ChargerTaxInfoEntered;",
        "Lco/bird/android/model/analytics/ChargerTutorialsCompleted;",
        "Lco/bird/android/model/analytics/ChargerViewedActiveBluetoothSweep;",
        "Lco/bird/android/model/analytics/ChargerViewedFindBirdsMap;",
        "Lco/bird/android/model/analytics/ChargerViewedReleaseBirdsMap;",
        "Lco/bird/android/model/analytics/ChargerViewedReleaseRatings;",
        "Lco/bird/android/model/analytics/ClickedBecomeChargerMenuItem;",
        "Lco/bird/android/model/analytics/ClickedChargerOnboardingBasicInfoCountryPicker;",
        "Lco/bird/android/model/analytics/ClickedRiderToChargerBanner;",
        "Lco/bird/android/model/analytics/CommunityModeAddressChanged;",
        "Lco/bird/android/model/analytics/CommunityModeBadParkingSubmitted;",
        "Lco/bird/android/model/analytics/CommunityModeBadRidingSubmitted;",
        "Lco/bird/android/model/analytics/CommunityModeDamageSubmitted;",
        "Lco/bird/android/model/analytics/CommunityModeMapIconClicked;",
        "Lco/bird/android/model/analytics/CommunityModePhotoAdded;",
        "Lco/bird/android/model/analytics/CommunityModeScanAdded;",
        "Lco/bird/android/model/analytics/CommunityModeSidebarIconClicked;",
        "Lco/bird/android/model/analytics/ContractorBasicFormCompleted;",
        "Lco/bird/android/model/analytics/ContractorConfirmedAddressCompleted;",
        "Lco/bird/android/model/analytics/ContractorCreated;",
        "Lco/bird/android/model/analytics/DropTargetClaimButtonTapped;",
        "Lco/bird/android/model/analytics/DropTargetDetailsViewed;",
        "Lco/bird/android/model/analytics/DropTargetPinTapped;",
        "Lco/bird/android/model/analytics/DropTargetReleaseBirdScanned;",
        "Lco/bird/android/model/analytics/DropTargetReleaseButtonTapped;",
        "Lco/bird/android/model/analytics/DropTargetReleaseCompleted;",
        "Lco/bird/android/model/analytics/DropTargetReleasePhotoTaken;",
        "Lco/bird/android/model/analytics/DropTargetReleaseScannerOpened;",
        "Lco/bird/android/model/analytics/EmailSubmitted;",
        "Lco/bird/android/model/analytics/EmailVerified;",
        "Lco/bird/android/model/analytics/FirstRide;",
        "Lco/bird/android/model/analytics/FreeRideCodeEntered;",
        "Lco/bird/android/model/analytics/FreeRideUsed;",
        "Lco/bird/android/model/analytics/GooglePayAuthSheetCanceled;",
        "Lco/bird/android/model/analytics/GooglePayAuthSheetError;",
        "Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;",
        "Lco/bird/android/model/analytics/GooglePayAuthSheetSuccess;",
        "Lco/bird/android/model/analytics/GooglePayButtonClicked;",
        "Lco/bird/android/model/analytics/HelpOpened;",
        "Lco/bird/android/model/analytics/IdBackScanned;",
        "Lco/bird/android/model/analytics/IdEnteredManually;",
        "Lco/bird/android/model/analytics/IdFrontScanned;",
        "Lco/bird/android/model/analytics/IdManualEntryScreenViewed;",
        "Lco/bird/android/model/analytics/IdScannerOpened;",
        "Lco/bird/android/model/analytics/IdStoreFailed;",
        "Lco/bird/android/model/analytics/IdSubmitted;",
        "Lco/bird/android/model/analytics/LocationPermissionsRequested;",
        "Lco/bird/android/model/analytics/LocationPermissionsResponded;",
        "Lco/bird/android/model/analytics/LockComplianceModalViewed;",
        "Lco/bird/android/model/analytics/LoginLocationRequestTimedOut;",
        "Lco/bird/android/model/analytics/MapViewed;",
        "Lco/bird/android/model/analytics/MarketingEmailsOptedIn;",
        "Lco/bird/android/model/analytics/MarketingEmailsOptedOut;",
        "Lco/bird/android/model/analytics/MenuReleaseBirdsTapped;",
        "Lco/bird/android/model/analytics/OnboardingLocationEnabled;",
        "Lco/bird/android/model/analytics/OnboardingTeaserShown;",
        "Lco/bird/android/model/analytics/PaymentMethodAdded;",
        "Lco/bird/android/model/analytics/PaymentOpened;",
        "Lco/bird/android/model/analytics/PhysicalLockSuccessfullyLocked;",
        "Lco/bird/android/model/analytics/PhysicalLockSuccessfullyUnlocked;",
        "Lco/bird/android/model/analytics/PhysicalLockTutorialViewed;",
        "Lco/bird/android/model/analytics/PriceChangeDetected;",
        "Lco/bird/android/model/analytics/PriceIncreaseModalShown;",
        "Lco/bird/android/model/analytics/RentalAgreementShown;",
        "Lco/bird/android/model/analytics/RentalCancelled;",
        "Lco/bird/android/model/analytics/RentalConfirmedShown;",
        "Lco/bird/android/model/analytics/RentalDeliveryNotesShown;",
        "Lco/bird/android/model/analytics/RentalEnded;",
        "Lco/bird/android/model/analytics/RentalLocationPlansAvailable;",
        "Lco/bird/android/model/analytics/RentalLocationScreenShown;",
        "Lco/bird/android/model/analytics/RentalPlansShown;",
        "Lco/bird/android/model/analytics/RentalSignedUp;",
        "Lco/bird/android/model/analytics/RentalSignupScreenShown;",
        "Lco/bird/android/model/analytics/RentalSummaryShown;",
        "Lco/bird/android/model/analytics/RentalWindowsShown;",
        "Lco/bird/android/model/analytics/RideButtonTapped;",
        "Lco/bird/android/model/analytics/RideCompleted;",
        "Lco/bird/android/model/analytics/RideEndFlow;",
        "Lco/bird/android/model/analytics/RideHistoryOpened;",
        "Lco/bird/android/model/analytics/RideLocked;",
        "Lco/bird/android/model/analytics/RideLockedFailed;",
        "Lco/bird/android/model/analytics/RideRated;",
        "Lco/bird/android/model/analytics/RideStartFailed;",
        "Lco/bird/android/model/analytics/RideUnlockedFailed;",
        "Lco/bird/android/model/analytics/RiderBulkReportFraudButtonClicked;",
        "Lco/bird/android/model/analytics/RiderBulkReportFraudSubmitted;",
        "Lco/bird/android/model/analytics/RiderFlightBarLocationServicesButtonTapped;",
        "Lco/bird/android/model/analytics/RiderFlightBarShown;",
        "Lco/bird/android/model/analytics/RiderPinTapped;",
        "Lco/bird/android/model/analytics/RiderReserveButtonTapped;",
        "Lco/bird/android/model/analytics/RiderReserveCancelButtonTapped;",
        "Lco/bird/android/model/analytics/RiderReserveCancelFeedbackSubmitted;",
        "Lco/bird/android/model/analytics/RiderReserveConfirmButtonTapped;",
        "Lco/bird/android/model/analytics/RiderReserveConfirmCancelButtonTapped;",
        "Lco/bird/android/model/analytics/SecondRide;",
        "Lco/bird/android/model/analytics/SmartlockLocked;",
        "Lco/bird/android/model/analytics/SmartlockUnlockClosed;",
        "Lco/bird/android/model/analytics/SmartlockUnlockError;",
        "Lco/bird/android/model/analytics/SmartlockUnlockViewed;",
        "Lco/bird/android/model/analytics/SmartlockUnlocked;",
        "Lco/bird/android/model/analytics/SplashScreenError;",
        "Lco/bird/android/model/analytics/SplashScreenNavigation;",
        "Lco/bird/android/model/analytics/SystemSettingsNavigated;",
        "Lco/bird/android/model/analytics/TenthRide;",
        "Lco/bird/android/model/analytics/ThirdRide;",
        "Lco/bird/android/model/analytics/TutorialClosed;",
        "Lco/bird/android/model/analytics/TutorialPageViewed;",
        "Lco/bird/android/model/analytics/TutorialStarted;",
        "Lco/bird/android/model/analytics/UserMarkedDispatchBirdMissing;",
        "Lco/bird/android/model/analytics/VerificationEmailResent;",
        "Lco/bird/android/model/analytics/ViewRiderMapFirstTime;",
        "model-analytics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final name:Ljava/lang/String;

.field private final properties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lco/bird/android/model/analytics/Type;


# direct methods
.method private constructor <init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/analytics/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->type:Lco/bird/android/model/analytics/Type;

    iput-object p2, p0, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->properties:Ljava/util/Map;

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->name()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->name:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;-><init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;-><init>(Lco/bird/android/model/analytics/Type;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public brazeKey()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public charge()Ljava/lang/Double;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->properties:Ljava/util/Map;

    return-object v0
.end method

.method public increment()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->type:Lco/bird/android/model/analytics/Type;

    sget-object v1, Lco/bird/android/model/analytics/LegacyAnalyticsEvent$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->name()Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->type:Lco/bird/android/model/analytics/Type;

    invoke-virtual {v0}, Lco/bird/android/model/analytics/Type;->key()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final set(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/analytics/LegacyAnalyticsEvent;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
