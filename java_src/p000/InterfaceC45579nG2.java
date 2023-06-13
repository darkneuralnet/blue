package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.App;
import co.bird.android.app.feature.autopay.AutoPayV2Activity;
import co.bird.android.app.feature.bluetooth.BluetoothDiscoveryReceiver;
import co.bird.android.app.feature.bluetooth.job.DeepSleepJobConsumer;
import co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker;
import co.bird.android.app.feature.charger.activity.ReportMultipleBirdsFraudActivity;
import co.bird.android.app.feature.communitymode.activity.BadRidingActivity;
import co.bird.android.app.feature.communitymode.activity.ComplaintActivity;
import co.bird.android.app.feature.communitymode.activity.ComplaintLocationActivity;
import co.bird.android.app.feature.deals.DealActivity;
import co.bird.android.app.feature.driver.license.p007v2.DriverLicenseScanV2Activity;
import co.bird.android.app.feature.i18n.SelectCountryActivity;
import co.bird.android.app.feature.legacyrepair.certifyrepair.CertifyRepairActivity;
import co.bird.android.app.feature.legacyrepair.reporteddamages.ReportedDamagesActivity;
import co.bird.android.app.feature.locale.LocaleChangedJobConsumer;
import co.bird.android.app.feature.locale.LocaleChangedReceiver;
import co.bird.android.app.feature.longterm.LongTermRentalSetupActivity;
import co.bird.android.app.feature.lookupbird.LookupBirdActivity;
import co.bird.android.app.feature.magiclink.LoginActivity;
import co.bird.android.app.feature.magiclink.MagicLinkIntroActivity;
import co.bird.android.app.feature.parking.ParkingAnnouncementActivity;
import co.bird.android.app.feature.payment.PaymentActivity;
import co.bird.android.app.feature.payment.PaypalSignOutActivity;
import co.bird.android.app.feature.physicallock.ChoosePhysicalLockTypeActivity;
import co.bird.android.app.feature.physicallock.PhysicalLockLastComplianceActivity;
import co.bird.android.app.feature.physicallock.PhysicalLockTutorialActivity;
import co.bird.android.app.feature.physicallock.ReplacePhysicalLockActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Activity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockStandaloneAssociationActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockToolsLauncherActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockUnlockActivity;
import co.bird.android.app.feature.prepay.EnterCardActivity;
import co.bird.android.app.feature.propertyreport.PropertyReportActivity;
import co.bird.android.app.feature.rentalagreement.RentalAgreementActivity;
import co.bird.android.app.feature.reportcomplaint.ReportActivity;
import co.bird.android.app.feature.reservation.activity.ReservationFeedbackActivity;
import co.bird.android.app.feature.ride.activity.RideEndPhotoActivity;
import co.bird.android.app.feature.ride.activity.RideModeActivity;
import co.bird.android.app.feature.ride.activity.RidePhotoActivity;
import co.bird.android.app.feature.ride.parking.ParkingRulesActivity;
import co.bird.android.app.feature.ride.tutorial.RideStartedTutorialsActivity;
import co.bird.android.app.feature.ridedetail.ParkingPhotoHelpActivity;
import co.bird.android.app.feature.ridedetail.ParkingReviewActivity;
import co.bird.android.app.feature.ridedetail.RideDetailActivity;
import co.bird.android.app.feature.ridehistory.RideHistoryActivity;
import co.bird.android.app.feature.ridertutorial.MultiModalRiderTutorialSelectionActivity;
import co.bird.android.app.feature.ridertutorial.RiderTutorialActivity;
import co.bird.android.app.feature.scanner.BirdScanActivity;
import co.bird.android.app.feature.scanner.LegacyBirdScanActivity;
import co.bird.android.app.feature.scanner.RiderBirdScanActivity;
import co.bird.android.app.feature.scanner.activity.MerchantScanActivity;
import co.bird.android.app.feature.searchbird.BirdSearchActivity;
import co.bird.android.app.feature.settings.analytics.AnalyticsEventDebuggerActivity;
import co.bird.android.app.feature.settings.analytics.AnalyticsEventDetailDebuggerActivity;
import co.bird.android.app.feature.settings.auth.AuthTokensDebuggerActivity;
import co.bird.android.app.feature.settings.config.ConfigExplorerActivity;
import co.bird.android.app.feature.shop.ShopActivity;
import co.bird.android.app.feature.taxinformation.TaxInformationActivity;
import co.bird.android.app.feature.testride.PotentialIssuesActivity;
import co.bird.android.app.feature.tip.VehicleTipActivity;
import co.bird.android.app.feature.transactionhistory.TransactionHistoryActivity;
import co.bird.android.app.feature.useragreement.UserAgreementActivity;
import co.bird.android.app.feature.wakebirds.WakeFlockProgressActivity;
import co.bird.android.app.feature.wakebirds.WakeVehiclesActivity;
import co.bird.android.app.push.MyFirebaseMessagingService;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import dagger.Component;
import kotlin.Metadata;
@Component(modules = {C34720Nh2.class, C22711hj.class, VH2.class, C43516jn1.class, AbstractC48291rq2.class, P43.class, C34425Ma4.class, C19865dq.class, C41448gI4.class, C38236au5.class, C41622gb6.class})
@Metadata(m28433d1 = {"\u0000¶\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0092\u0001J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH&J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0011H&J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0015H&J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0017H&J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001bH&J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001dH&J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001fH&J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020!H&J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020#H&J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020%H&J\u0010\u0010(\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020'H&J\u0010\u0010*\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020)H&J\u0010\u0010,\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020+H&J\u0010\u0010.\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020-H&J\u0010\u00100\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020/H&J\u0010\u00102\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000201H&J\u0010\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000203H&J\u0010\u00106\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000205H&J\u0010\u00108\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000207H&J\u0010\u0010:\u001a\u00020\b2\u0006\u0010\u000b\u001a\u000209H&J\u0010\u0010<\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020;H&J\u0010\u0010>\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020=H&J\u0010\u0010@\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020?H&J\u0010\u0010B\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020AH&J\u0010\u0010D\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020CH&J\u0010\u0010F\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020EH&J\u0010\u0010H\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020GH&J\u0010\u0010J\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020IH&J\u0010\u0010L\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020KH&J\u0010\u0010N\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020MH&J\u0010\u0010P\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020OH&J\u0010\u0010R\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020QH&J\u0010\u0010T\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020SH&J\u0010\u0010V\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020UH&J\u0010\u0010X\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020WH&J\u0010\u0010Z\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020YH&J\u0010\u0010\\\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020[H&J\u0010\u0010^\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020]H&J\u0010\u0010`\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020_H&J\u0010\u0010b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020aH&J\u0010\u0010d\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020cH&J\u0010\u0010f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020eH&J\u0010\u0010h\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020gH&J\u0010\u0010j\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020iH&J\u0010\u0010l\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020kH&J\u0010\u0010n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020mH&J\u0010\u0010p\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020oH&J\u0010\u0010r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020qH&J\u0010\u0010t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020sH&J\u0010\u0010v\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020uH&J\u0010\u0010x\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020wH&J\u0010\u0010z\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020yH&J\u0010\u0010|\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020{H&J\u0010\u0010~\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020}H&J\u0011\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u007fH&J\u0013\u0010\u0083\u0001\u001a\u00020\b2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H&J\u0013\u0010\u0086\u0001\u001a\u00020\b2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H&J\u0013\u0010\u0089\u0001\u001a\u00020\b2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H&J\u0013\u0010\u008c\u0001\u001a\u00020\b2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H&J\u0013\u0010\u008e\u0001\u001a\u00020\b2\b\u0010\u008b\u0001\u001a\u00030\u008d\u0001H&J\u0013\u0010\u0091\u0001\u001a\u00020\b2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H&¨\u0006\u0093\u0001"}, m28432d2 = {"LnG2;", "LlG2;", "Lcb;", "LmY1;", "LMe6;", "LQe6;", "Lco/bird/android/App;", "application", "", "G0", "Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;", "activity", "n1", "Lco/bird/android/app/feature/legacyrepair/certifyrepair/CertifyRepairActivity;", "I", "Lco/bird/android/app/feature/communitymode/activity/ComplaintActivity;", "V0", "Lco/bird/android/app/feature/payment/PaymentActivity;", "A2", "Lco/bird/android/app/feature/communitymode/activity/ComplaintLocationActivity;", "R2", "Lco/bird/android/app/feature/reportcomplaint/ReportActivity;", "E", "Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;", "u", "Lco/bird/android/app/feature/communitymode/activity/BadRidingActivity;", "M1", "Lco/bird/android/app/feature/settings/auth/AuthTokensDebuggerActivity;", "i3", "Lco/bird/android/app/feature/searchbird/BirdSearchActivity;", "T0", "Lco/bird/android/app/feature/legacyrepair/reporteddamages/ReportedDamagesActivity;", "Q0", "Lco/bird/android/app/feature/autopay/AutoPayV2Activity;", "a0", "Lco/bird/android/app/feature/tip/VehicleTipActivity;", "P", "Lco/bird/android/app/feature/charger/activity/ReportMultipleBirdsFraudActivity;", "T1", "Lco/bird/android/app/feature/testride/PotentialIssuesActivity;", "e2", "Lco/bird/android/app/feature/physicallock/ReplacePhysicalLockActivity;", "o0", "Lco/bird/android/app/feature/physicallock/ChoosePhysicalLockTypeActivity;", "L2", "Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;", "R", "Lco/bird/android/app/feature/useragreement/UserAgreementActivity;", "x2", "Lco/bird/android/app/feature/scanner/LegacyBirdScanActivity;", "t1", "Lco/bird/android/app/feature/ride/activity/RideEndPhotoActivity;", "n0", "Lco/bird/android/app/feature/physicallock/PhysicalLockTutorialActivity;", "T", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockActivity;", "w0", "Lco/bird/android/app/feature/ridedetail/RideDetailActivity;", "q0", "Lco/bird/android/app/feature/magiclink/LoginActivity;", "v0", "Lco/bird/android/app/feature/physicallock/PhysicalLockLastComplianceActivity;", "e1", "Lco/bird/android/app/feature/shop/ShopActivity;", "J", "Lco/bird/android/app/feature/prepay/EnterCardActivity;", "p0", "Lco/bird/android/app/feature/wakebirds/WakeFlockProgressActivity;", "G1", "Lco/bird/android/app/feature/reservation/activity/ReservationFeedbackActivity;", "q1", "Lco/bird/android/app/feature/transactionhistory/TransactionHistoryActivity;", "x0", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationActivity;", "v", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Activity;", "h3", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockToolsLauncherActivity;", "c3", "Lco/bird/android/app/feature/wakebirds/WakeVehiclesActivity;", "G", "Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;", "E0", "Lco/bird/android/app/feature/physicallock/smartlock/SmartlockStandaloneAssociationActivity;", "i1", "Lco/bird/android/app/feature/ridertutorial/RiderTutorialActivity;", "o1", "Lco/bird/android/app/feature/ridertutorial/MultiModalRiderTutorialSelectionActivity;", "Q", "Lco/bird/android/app/feature/ride/tutorial/RideStartedTutorialsActivity;", "I2", "Lco/bird/android/app/feature/deals/DealActivity;", "B0", "Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;", "u1", "Lco/bird/android/app/feature/ridedetail/ParkingPhotoHelpActivity;", "l2", "Lco/bird/android/app/feature/ridedetail/ParkingReviewActivity;", "d1", "Lco/bird/android/app/feature/payment/PaypalSignOutActivity;", "f1", "Lco/bird/android/app/feature/parking/ParkingAnnouncementActivity;", "a2", "Lco/bird/android/app/feature/scanner/BirdScanActivity;", "K1", "Lco/bird/android/app/feature/scanner/RiderBirdScanActivity;", "E2", "Lco/bird/android/app/feature/i18n/SelectCountryActivity;", "s0", "Lco/bird/android/app/feature/taxinformation/TaxInformationActivity;", "h2", "Lco/bird/android/app/feature/magiclink/MagicLinkIntroActivity;", "g2", "Lco/bird/android/app/feature/ride/parking/ParkingRulesActivity;", "D", "Lco/bird/android/app/feature/settings/analytics/AnalyticsEventDebuggerActivity;", "f3", "Lco/bird/android/app/feature/settings/analytics/AnalyticsEventDetailDebuggerActivity;", "W0", "Lco/bird/android/app/feature/settings/config/ConfigExplorerActivity;", "H2", "Lco/bird/android/app/feature/lookupbird/LookupBirdActivity;", "p2", "Lco/bird/android/app/feature/propertyreport/PropertyReportActivity;", "z0", "Lco/bird/android/app/feature/scanner/activity/MerchantScanActivity;", "S", "Lco/bird/android/app/feature/ride/activity/RideModeActivity;", "y", "Lco/bird/android/app/feature/bluetooth/job/DeepSleepJobConsumer;", "consumer", "O2", "Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;", "changedJobConsumer", "c2", "Lco/bird/android/app/push/MyFirebaseMessagingService;", "service", "s1", "Lco/bird/android/app/feature/locale/LocaleChangedReceiver;", "receiver", "h0", "Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;", "S2", "Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;", "worker", "O1", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nG2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC45579nG2 extends InterfaceC44393lG2, InterfaceC13603cb, InterfaceC45147mY1, InterfaceC34463Me6, InterfaceC35399Qe6 {

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0013"}, m28432d2 = {"LnG2$a;", "", "Lhj;", "appModule", "e", "LVH2;", "managerModule", C17296a.f69688o, "Ldq;", "authModule", DateTokenConverter.CONVERTER_KEY, "Lau5;", "serviceModule", "b", "LgI4;", "repositoryModule", "c", "LnG2;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component.Builder
    /* renamed from: nG2$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC26452a {
        /* renamed from: a */
        InterfaceC26452a mo24021a(VH2 vh2);

        /* renamed from: b */
        InterfaceC26452a mo24020b(C38236au5 c38236au5);

        InterfaceC45579nG2 build();

        /* renamed from: c */
        InterfaceC26452a mo24019c(C41448gI4 c41448gI4);

        /* renamed from: d */
        InterfaceC26452a mo24018d(C19865dq c19865dq);

        /* renamed from: e */
        InterfaceC26452a mo24017e(C22711hj c22711hj);
    }

    /* renamed from: A2 */
    void mo24100A2(PaymentActivity paymentActivity);

    /* renamed from: B0 */
    void mo24099B0(DealActivity dealActivity);

    /* renamed from: D */
    void mo24098D(ParkingRulesActivity parkingRulesActivity);

    /* renamed from: E */
    void mo24097E(ReportActivity reportActivity);

    /* renamed from: E0 */
    void mo24096E0(LongTermRentalSetupActivity longTermRentalSetupActivity);

    /* renamed from: E2 */
    void mo24095E2(RiderBirdScanActivity riderBirdScanActivity);

    /* renamed from: G */
    void mo24094G(WakeVehiclesActivity wakeVehiclesActivity);

    /* renamed from: G0 */
    void mo24093G0(App app);

    /* renamed from: G1 */
    void mo24092G1(WakeFlockProgressActivity wakeFlockProgressActivity);

    /* renamed from: H2 */
    void mo24091H2(ConfigExplorerActivity configExplorerActivity);

    /* renamed from: I */
    void mo24090I(CertifyRepairActivity certifyRepairActivity);

    /* renamed from: I2 */
    void mo24089I2(RideStartedTutorialsActivity rideStartedTutorialsActivity);

    /* renamed from: J */
    void mo24088J(ShopActivity shopActivity);

    /* renamed from: K1 */
    void mo24087K1(BirdScanActivity birdScanActivity);

    /* renamed from: L2 */
    void mo24086L2(ChoosePhysicalLockTypeActivity choosePhysicalLockTypeActivity);

    /* renamed from: M1 */
    void mo24085M1(BadRidingActivity badRidingActivity);

    /* renamed from: O1 */
    void mo24084O1(HeadlessSweepWorker headlessSweepWorker);

    /* renamed from: O2 */
    void mo24083O2(DeepSleepJobConsumer deepSleepJobConsumer);

    /* renamed from: P */
    void mo24082P(VehicleTipActivity vehicleTipActivity);

    /* renamed from: Q */
    void mo24081Q(MultiModalRiderTutorialSelectionActivity multiModalRiderTutorialSelectionActivity);

    /* renamed from: Q0 */
    void mo24080Q0(ReportedDamagesActivity reportedDamagesActivity);

    /* renamed from: R */
    void mo24079R(RentalAgreementActivity rentalAgreementActivity);

    /* renamed from: R2 */
    void mo24078R2(ComplaintLocationActivity complaintLocationActivity);

    /* renamed from: S */
    void mo24077S(MerchantScanActivity merchantScanActivity);

    /* renamed from: S2 */
    void mo24076S2(BluetoothDiscoveryReceiver bluetoothDiscoveryReceiver);

    /* renamed from: T */
    void mo24075T(PhysicalLockTutorialActivity physicalLockTutorialActivity);

    /* renamed from: T0 */
    void mo24074T0(BirdSearchActivity birdSearchActivity);

    /* renamed from: T1 */
    void mo24073T1(ReportMultipleBirdsFraudActivity reportMultipleBirdsFraudActivity);

    /* renamed from: V0 */
    void mo24072V0(ComplaintActivity complaintActivity);

    /* renamed from: W0 */
    void mo24071W0(AnalyticsEventDetailDebuggerActivity analyticsEventDetailDebuggerActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: a */
    /* synthetic */ String mo24070a();

    /* renamed from: a0 */
    void mo24069a0(AutoPayV2Activity autoPayV2Activity);

    /* renamed from: a2 */
    void mo24068a2(ParkingAnnouncementActivity parkingAnnouncementActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: b */
    /* synthetic */ Drawable mo24067b();

    @Override // p000.InterfaceC44393lG2
    /* renamed from: c */
    /* synthetic */ InterfaceC51298wu6 mo24066c();

    /* renamed from: c2 */
    void mo24065c2(LocaleChangedJobConsumer localeChangedJobConsumer);

    /* renamed from: c3 */
    void mo24064c3(SmartlockToolsLauncherActivity smartlockToolsLauncherActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: d */
    /* synthetic */ Drawable mo24063d();

    /* renamed from: d1 */
    void mo24062d1(ParkingReviewActivity parkingReviewActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: e */
    /* synthetic */ InterfaceC51298wu6 mo24061e();

    /* renamed from: e1 */
    void mo24060e1(PhysicalLockLastComplianceActivity physicalLockLastComplianceActivity);

    /* renamed from: e2 */
    void mo24059e2(PotentialIssuesActivity potentialIssuesActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: f */
    /* synthetic */ String mo24058f();

    /* renamed from: f1 */
    void mo24057f1(PaypalSignOutActivity paypalSignOutActivity);

    /* renamed from: f3 */
    void mo24056f3(AnalyticsEventDebuggerActivity analyticsEventDebuggerActivity);

    /* renamed from: g2 */
    void mo24055g2(MagicLinkIntroActivity magicLinkIntroActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: h */
    /* synthetic */ String mo24054h();

    /* renamed from: h0 */
    void mo24053h0(LocaleChangedReceiver localeChangedReceiver);

    /* renamed from: h2 */
    void mo24052h2(TaxInformationActivity taxInformationActivity);

    /* renamed from: h3 */
    void mo24051h3(SmartlockAssociationV2Activity smartlockAssociationV2Activity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: i */
    /* synthetic */ InterfaceC51298wu6 mo24050i();

    /* renamed from: i1 */
    void mo24049i1(SmartlockStandaloneAssociationActivity smartlockStandaloneAssociationActivity);

    /* renamed from: i3 */
    void mo24048i3(AuthTokensDebuggerActivity authTokensDebuggerActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: j */
    /* synthetic */ BK2 mo24047j();

    @Override // p000.InterfaceC44393lG2
    /* renamed from: k */
    /* synthetic */ InterfaceC51298wu6 mo24046k();

    @Override // p000.InterfaceC44393lG2
    /* renamed from: l */
    /* synthetic */ InterfaceC51298wu6 mo24045l();

    /* renamed from: l2 */
    void mo24044l2(ParkingPhotoHelpActivity parkingPhotoHelpActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: m */
    /* synthetic */ BK2 mo24043m();

    /* renamed from: n0 */
    void mo24042n0(RideEndPhotoActivity rideEndPhotoActivity);

    /* renamed from: n1 */
    void mo24041n1(RidePhotoActivity ridePhotoActivity);

    @Override // p000.InterfaceC44393lG2
    /* renamed from: o */
    /* synthetic */ InterfaceC51298wu6 mo24040o();

    /* renamed from: o0 */
    void mo24039o0(ReplacePhysicalLockActivity replacePhysicalLockActivity);

    /* renamed from: o1 */
    void mo24038o1(RiderTutorialActivity riderTutorialActivity);

    /* renamed from: p0 */
    void mo24037p0(EnterCardActivity enterCardActivity);

    /* renamed from: p2 */
    void mo24036p2(LookupBirdActivity lookupBirdActivity);

    /* renamed from: q0 */
    void mo24035q0(RideDetailActivity rideDetailActivity);

    /* renamed from: q1 */
    void mo24034q1(ReservationFeedbackActivity reservationFeedbackActivity);

    /* renamed from: s0 */
    void mo24033s0(SelectCountryActivity selectCountryActivity);

    /* renamed from: s1 */
    void mo24032s1(MyFirebaseMessagingService myFirebaseMessagingService);

    /* renamed from: t1 */
    void mo24031t1(LegacyBirdScanActivity legacyBirdScanActivity);

    /* renamed from: u */
    void mo24030u(RideHistoryActivity rideHistoryActivity);

    /* renamed from: u1 */
    void mo24029u1(DriverLicenseScanV2Activity driverLicenseScanV2Activity);

    /* renamed from: v */
    void mo24028v(SmartlockAssociationActivity smartlockAssociationActivity);

    /* renamed from: v0 */
    void mo24027v0(LoginActivity loginActivity);

    /* renamed from: w0 */
    void mo24026w0(SmartlockUnlockActivity smartlockUnlockActivity);

    /* renamed from: x0 */
    void mo24025x0(TransactionHistoryActivity transactionHistoryActivity);

    /* renamed from: x2 */
    void mo24024x2(UserAgreementActivity userAgreementActivity);

    /* renamed from: y */
    void mo24023y(RideModeActivity rideModeActivity);

    /* renamed from: z0 */
    void mo24022z0(PropertyReportActivity propertyReportActivity);
}
