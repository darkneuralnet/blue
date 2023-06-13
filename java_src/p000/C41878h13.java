package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.autopay.AutoPayActivity;
import co.bird.android.app.feature.autopay.AutoPayV2Activity;
import co.bird.android.app.feature.birdpay.tutorial.BirdPayTutorialActivity;
import co.bird.android.app.feature.charger.activity.ReportFraudActivity;
import co.bird.android.app.feature.charger.activity.ReportMultipleBirdsFraudActivity;
import co.bird.android.app.feature.charger.activity.TaskCancelActivity;
import co.bird.android.app.feature.charger.presenter.TaskCancelMode;
import co.bird.android.app.feature.communitymode.activity.BadRidingActivity;
import co.bird.android.app.feature.communitymode.activity.ComplaintActivity;
import co.bird.android.app.feature.communitymode.activity.ComplaintLocationActivity;
import co.bird.android.app.feature.deals.DealActivity;
import co.bird.android.app.feature.debugmode.DebugListActivity;
import co.bird.android.app.feature.driver.license.p007v2.DriverLicenseScanV2Activity;
import co.bird.android.app.feature.flightsheet.FlightSheetActivity;
import co.bird.android.app.feature.freeride.FreeRideActivity;
import co.bird.android.app.feature.howtoride.HowToRideActivity;
import co.bird.android.app.feature.i18n.SelectCountryActivity;
import co.bird.android.app.feature.legacyrepair.certifyrepair.CertifyRepairActivity;
import co.bird.android.app.feature.legacyrepair.inspection.SafetyInspectionActivity;
import co.bird.android.app.feature.legacyrepair.photo.MechanicPhotoActivity;
import co.bird.android.app.feature.legacyrepair.reporteddamages.ReportedDamagesActivity;
import co.bird.android.app.feature.legacyrepair.startrepair.StartRepairActivity;
import co.bird.android.app.feature.longterm.LongTermRentalSetupActivity;
import co.bird.android.app.feature.lookupbird.LookupBirdActivity;
import co.bird.android.app.feature.magiclink.LoginActivity;
import co.bird.android.app.feature.magiclink.MagicLinkIntroActivity;
import co.bird.android.app.feature.main.MainActivity;
import co.bird.android.app.feature.merchant.MerchantLocationEditActivity;
import co.bird.android.app.feature.nearbybirds.NearbyBirdsActivity;
import co.bird.android.app.feature.nest.photo.PhotoViewActivity;
import co.bird.android.app.feature.operator.activity.OperatorActivity;
import co.bird.android.app.feature.operator.activity.OperatorSupplementMapActivity;
import co.bird.android.app.feature.parking.ParkingAnnouncementActivity;
import co.bird.android.app.feature.payment.CashpayActivity;
import co.bird.android.app.feature.payment.PaymentActivity;
import co.bird.android.app.feature.payment.PaypalSignOutActivity;
import co.bird.android.app.feature.physicallock.ChoosePhysicalLockTypeActivity;
import co.bird.android.app.feature.physicallock.PhysicalLockLastComplianceActivity;
import co.bird.android.app.feature.physicallock.PhysicalLockTutorialActivity;
import co.bird.android.app.feature.physicallock.ReplacePhysicalLockActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockAssociationV2Activity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockQrScanActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockStandaloneAssociationActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockTestActivity;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockToolsLauncherActivity;
import co.bird.android.app.feature.prepay.EnterCardActivity;
import co.bird.android.app.feature.prepay.PaymentMethodActivity;
import co.bird.android.app.feature.privatebirds.PrivateBirdSmartlockUnlockActivity;
import co.bird.android.app.feature.propertyreport.PropertyReportActivity;
import co.bird.android.app.feature.rentalagreement.RentalAgreementActivity;
import co.bird.android.app.feature.reportcomplaint.ReportActivity;
import co.bird.android.app.feature.reservation.activity.ReservationFeedbackActivity;
import co.bird.android.app.feature.ride.activity.RideActivity;
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
import co.bird.android.app.feature.settings.analytics.AnalyticsEventDebuggerActivity;
import co.bird.android.app.feature.settings.analytics.AnalyticsEventDetailDebuggerActivity;
import co.bird.android.app.feature.settings.auth.AuthTokensDebuggerActivity;
import co.bird.android.app.feature.settings.config.ConfigExplorerActivity;
import co.bird.android.app.feature.settings.operator.OperatorSettingsActivity;
import co.bird.android.app.feature.settings.settings.SettingsActivity;
import co.bird.android.app.feature.settings.tweaks.TweaksActivity;
import co.bird.android.app.feature.shop.ShopActivity;
import co.bird.android.app.feature.taxinformation.TaxInformationActivity;
import co.bird.android.app.feature.tip.VehicleTipActivity;
import co.bird.android.app.feature.transactionhistory.TransactionHistoryActivity;
import co.bird.android.app.feature.useragreement.UserAgreementActivity;
import co.bird.android.app.feature.wakebirds.WakeFlockProgressActivity;
import co.bird.android.app.feature.wakebirds.WakeSleepBirdsActivity;
import co.bird.android.app.feature.wakebirds.WakeVehiclesActivity;
import co.bird.android.feature.birdairdiagnostics.BirdAirScanActivity;
import co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity;
import co.bird.android.feature.birdplus.p011v1.list.BirdPlusLandingActivity;
import co.bird.android.feature.birdplus.p011v1.purchased.BirdPlusPurchasedActivity;
import co.bird.android.feature.birdratinghistory.BirdRatingHistoryActivity;
import co.bird.android.feature.bulkscanner.report.regular.BulkStatusReportActivity;
import co.bird.android.feature.bulkscanner.report.serviceprogress.BulkServiceCenterStatusReportActivity;
import co.bird.android.feature.bulkscanner.scan.capture.CaptureBulkScannerActivity;
import co.bird.android.feature.bulkscanner.scan.regular.DefaultBulkScannerActivity;
import co.bird.android.feature.bulkscanner.scan.serviceprogress.BulkServiceProgressScannerActivity;
import co.bird.android.feature.bulkscanner.update.BulkUpdateActivity;
import co.bird.android.feature.cannotaccess.report.CannotAccessActivity;
import co.bird.android.feature.commandcenter.commandcenter.CommandCenterActivity;
import co.bird.android.feature.commandcenter.commandcenter.LegacyCommandCenterActivity;
import co.bird.android.feature.commandcenter.landing.CommandCenterLandingActivity;
import co.bird.android.feature.commandcenter.routing.RoutingActivity;
import co.bird.android.feature.complaintresolution.ComplaintResolutionActivity;
import co.bird.android.feature.complaintresolution.scanner.VehicleInvolvedScanActivity;
import co.bird.android.feature.configurabletutorial.ConfigurableTutorialsActivity;
import co.bird.android.feature.configurabletutorial.viewer.ConfigurableTutorialViewerActivity;
import co.bird.android.feature.coreinventory.scan.CoreInventoryScanActivity;
import co.bird.android.feature.destination.rider.DestinationSearchActivity;
import co.bird.android.feature.fleetstatus.common.FleetActivity;
import co.bird.android.feature.fleetstatus.state.list.FleetListActivity;
import co.bird.android.feature.flocktogether.FlockTogetherActivity;
import co.bird.android.feature.frequentFlyer.FrequentFlyerActivity;
import co.bird.android.feature.hardcount.HardCountActivity;
import co.bird.android.feature.hardcount.details.HardCountDetailsActivity;
import co.bird.android.feature.hardcount.landing.HardCountLandingActivity;
import co.bird.android.feature.healthcheck.HealthCheckActivity;
import co.bird.android.feature.identification.IdentificationActivity;
import co.bird.android.feature.identification.IdentificationScannerActivity;
import co.bird.android.feature.identification.trampoline.IdentificationTrampolineActivity;
import co.bird.android.feature.itemlease.offboarding.HelmetLeaseReturnScannerActivity;
import co.bird.android.feature.itemlease.onboarding.HelmetLeasePromptActivity;
import co.bird.android.feature.itemlease.onboarding.HelmetLeaseUnlockTutorialActivity;
import co.bird.android.feature.itemlease.selfie.HelmetSelfieConfirmationActivity;
import co.bird.android.feature.itemlease.solebe.HelmetLeaseSolebeScannerActivity;
import co.bird.android.feature.localssurvey.LocalsSurveyActivity;
import co.bird.android.feature.maintenance.MaintenanceLandingActivity;
import co.bird.android.feature.merchant.activity.MerchantHistoryActivity;
import co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity;
import co.bird.android.feature.merchant.activity.MerchantLocationActivity;
import co.bird.android.feature.nestdetails.NestDetailsActivity;
import co.bird.android.feature.nestflagging.NestFlaggingActivity;
import co.bird.android.feature.notificationcenter.NotificationCenterActivity;
import co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity;
import co.bird.android.feature.operator.releaseassignment.ReleaseAssignmentActivity;
import co.bird.android.feature.operator.ridedetail.OperatorRideDetailActivity;
import co.bird.android.feature.operator.tasklist.OperatorTaskListActivity;
import co.bird.android.feature.operator.tasklistv2.OperatorTaskListV2Activity;
import co.bird.android.feature.operatorinventory.InventoryPartDetailsActivity;
import co.bird.android.feature.operatorinventory.InventoryPartSelectionActivity;
import co.bird.android.feature.ownedbirds.OwnedBirdDetailsActivity;
import co.bird.android.feature.ownedbirds.OwnedBirdsActivity;
import co.bird.android.feature.ownedbirds.PrivateBirdsOverviewActivity;
import co.bird.android.feature.p010ar.parking.VpsParkingActivity;
import co.bird.android.feature.p010ar.resolution.VpsResolveActivity;
import co.bird.android.feature.payment.bankredirect.AddBalanceActivity;
import co.bird.android.feature.payment.bankredirect.BankRedirectLaunchActivity;
import co.bird.android.feature.payment.preload.p013v2.autoreload.AutoReloadV2Activity;
import co.bird.android.feature.payment.preload.p013v2.landing.PreloadV2Activity;
import co.bird.android.feature.payment.preload.p013v2.landing.PreloadV2ActivityVersionB;
import co.bird.android.feature.payment.preload.p013v2.options.PreloadV2OptionsActivity;
import co.bird.android.feature.payment.quickpayment.QuickPaymentActivity;
import co.bird.android.feature.promotions.PromotionsCenterActivity;
import co.bird.android.feature.release.ReleaseScanActivity;
import co.bird.android.feature.repair.diagnostics.DiagnosticsActivity;
import co.bird.android.feature.repair.p014v1.issuestatus.IssueStatusActivity;
import co.bird.android.feature.repair.p014v1.overview.RepairOverviewActivity;
import co.bird.android.feature.repair.p014v1.search.RepairSearchActivity;
import co.bird.android.feature.repair.p014v1.selection.RepairSelectionActivity;
import co.bird.android.feature.repair.p015v2.overview.RepairV2Activity;
import co.bird.android.feature.repair.p015v2.subtypes.RepairIssueSubtypesActivity;
import co.bird.android.feature.repair.p016v3.issues.RepairV3IssueActivity;
import co.bird.android.feature.repair.p016v3.overview.RepairV3OverviewActivity;
import co.bird.android.feature.repair.p016v3.overview.nonrepair.NonRepairSurveyActivity;
import co.bird.android.feature.repair.pastrepairs.PastRepairsActivity;
import co.bird.android.feature.rideendsummary.DamageFeedbackActivity;
import co.bird.android.feature.rideendsummary.RideFeedbackActivity;
import co.bird.android.feature.rideendsummary.RideRatingActivity;
import co.bird.android.feature.rideendsummary.RideSummaryActivity;
import co.bird.android.feature.rideendsummary.ridereport.RideReportActivity;
import co.bird.android.feature.ridepass.p017v1.RidePassActivity;
import co.bird.android.feature.ridepass.p018v2.list.RidePassV2Activity;
import co.bird.android.feature.ridepass.p019v4.details.RidePassV4DetailsActivity;
import co.bird.android.feature.ridepass.p019v4.list.RidePassV4Activity;
import co.bird.android.feature.rider.birdpay.confirmation.PaymentConfirmationActivity;
import co.bird.android.feature.rider.birdpay.input.BirdPayInputActivity;
import co.bird.android.feature.rider.birdpay.place.PlaceInfoActivity;
import co.bird.android.feature.savemoney.SaveMoneyActivity;
import co.bird.android.feature.scrap.ScrapActivity;
import co.bird.android.feature.scrap.landing.ScrapLandingActivity;
import co.bird.android.feature.selfservepayment.dispute.DisputeChargeActivity;
import co.bird.android.feature.selfservepayment.receipt.TransactionReceiptActivity;
import co.bird.android.feature.selfservepayment.refund.RefundAccountBalanceActivity;
import co.bird.android.feature.servicecenter.BarcodeScannerActivity;
import co.bird.android.feature.servicecenter.SelectServiceCenterActivity;
import co.bird.android.feature.servicecenter.batches.addtobatch.AddToBatchActivity;
import co.bird.android.feature.servicecenter.batches.batchsearch.BatchSearchActivity;
import co.bird.android.feature.servicecenter.batches.createbatch.CreateBatchActivity;
import co.bird.android.feature.servicecenter.batches.landing.BatchLandingActivity;
import co.bird.android.feature.servicecenter.batches.vehiclesinbatch.VehiclesInBatchActivity;
import co.bird.android.feature.servicecenter.idtools.identify.associate.IdToolsIdentifyAssociateActivity;
import co.bird.android.feature.servicecenter.idtools.identify.dissociate.IdToolsIdentifyDissociateActivity;
import co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity;
import co.bird.android.feature.servicecenter.inventorycount.InventoryCountActivity;
import co.bird.android.feature.servicecenter.inventorycount.InventoryScanProxyActivity;
import co.bird.android.feature.servicecenter.inventorycount.excessinventory.ExcessInventoryActivity;
import co.bird.android.feature.servicecenter.qualitycontrol.landing.QualityControlLandingActivity;
import co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity;
import co.bird.android.feature.servicecenter.repairlogger.repairlist.RepairLoggerListActivity;
import co.bird.android.feature.servicecenter.repairlogger.scan.RepairLoggerScanActivity;
import co.bird.android.feature.servicecenter.repairs.landing.RepairsScanActivity;
import co.bird.android.feature.servicecenter.status.bulk.landing.BulkServiceProgressLandingActivity;
import co.bird.android.feature.servicecenter.status.bulk.update.BulkServiceProgressUpdateActivity;
import co.bird.android.feature.servicecenter.status.single.landing.ServiceProgressLandingActivity;
import co.bird.android.feature.servicecenter.status.single.update.ServiceProgressUpdateActivity;
import co.bird.android.feature.servicecenter.whitelist.WhitelistImeiLandingActivity;
import co.bird.android.feature.sober.SoberStartActivity;
import co.bird.android.feature.suggestanest.SuggestNestActivity;
import co.bird.android.feature.transferorder.container.ContainerDetailsActivity;
import co.bird.android.feature.transferorder.container.processing.ProcessContainerOrderActivity;
import co.bird.android.feature.transferorder.landing.TransferOrderLandingActivity;
import co.bird.android.feature.transferorder.operator.OperatorOrderActivity;
import co.bird.android.feature.transferorder.operatorallocationdetails.OperatorAllocationDetailsActivity;
import co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity;
import co.bird.android.feature.transferorder.scanner.outbound.OutboundScanActivity;
import co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity;
import co.bird.android.feature.transferorder.scrap.overview.ScrapOrderOverviewActivity;
import co.bird.android.feature.transferorder.sku.SkuDetailsActivity;
import co.bird.android.feature.transferorder.sku.scanner.SkuScannerActivity;
import co.bird.android.feature.transferorder.sku.scanner.details.SkuScannedDetailsActivity;
import co.bird.android.feature.transferorder.sku.vehicles.SkuOrderVehiclesActivity;
import co.bird.android.feature.tutorial.TutorialActivity;
import co.bird.android.feature.vehiclepricing.VehiclePricingActivity;
import co.bird.android.feature.webview.WebViewActivity;
import co.bird.android.feature.webview.WebViewArchiveActivity;
import co.bird.android.feature.workorders.details.WorkOrderDetailsActivity;
import co.bird.android.feature.workorders.inspection.WorkOrderInspectionActivity;
import co.bird.android.feature.workorders.issues.LegacyWorkOrderIssuesActivity;
import co.bird.android.feature.workorders.legacyinspection.LegacyWorkOrderInspectionActivity;
import co.bird.android.feature.workorders.p020v3.InspectionV3Activity;
import co.bird.android.lib.shaketoreport.BugReportActivity;
import co.bird.android.library.lightbox.LightboxActivity;
import co.bird.android.library.lightbox.LightboxImage;
import co.bird.android.library.purchasepayment.PurchasePaymentActivity;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.Balance;
import co.bird.android.model.BarcodeScanType;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.Contractor;
import co.bird.android.model.ContractorLevel;
import co.bird.android.model.Deal;
import co.bird.android.model.DestinationDeeplinkParams;
import co.bird.android.model.Folder;
import co.bird.android.model.GoBirdPlusDeepLinkParams;
import co.bird.android.model.GoDeepLinkParams;
import co.bird.android.model.GoMapDeeplinkParams;
import co.bird.android.model.GoOperatorMapDeeplinkParams;
import co.bird.android.model.GoRidePassDeepLinkParams;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueType;
import co.bird.android.model.IssueTypeLock;
import co.bird.android.model.LastLockComplianceModel;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LocationSelectionModel;
import co.bird.android.model.MechanicPhotoMode;
import co.bird.android.model.NonRepair;
import co.bird.android.model.OperatorScanIntent;
import co.bird.android.model.OperatorSupplementMapPurpose;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.model.Point;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.ReservationIssueOption;
import co.bird.android.model.ScanType;
import co.bird.android.model.SystemSettingsReason;
import co.bird.android.model.TaxInformationSource;
import co.bird.android.model.Trigger;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.VehiclePricingDetails;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.analytics.BirdPayOnboardingScreenViewedSource;
import co.bird.android.model.analytics.HelpOpened;
import co.bird.android.model.analytics.SystemSettingsNavigated;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.HealthStatus;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PurchasePaymentReason;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScannerMode;
import co.bird.android.model.constant.TutorialType;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.contractor.ContractorOnboardStep;
import co.bird.android.model.extra.RiderBirdScanExtra;
import co.bird.android.model.extra.ScanBarcodeExtra;
import co.bird.android.model.identification.IdentificationDocumentDescriptor;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.persistence.HardCountScan;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WirePartCategory;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockReplacementType;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.model.wire.configs.WebHelpCenterConfig;
import co.bird.android.qualitycontrol.list.ListQualityControlActivity;
import co.bird.android.qualitycontrol.result.QualityControlResultActivity;
import co.bird.android.qualitycontrol.swipe.SwipeQualityControlActivity;
import co.bird.android.retakeablephoto.RetakeablePhotoActivity;
import co.bird.android.vehiclescanner.servicecenter.code.EnterCodeActivity;
import co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity;
import co.bird.android.widget.cropper.CropImage;
import co.bird.android.widget.cropper.CropImageView;
import co.bird.api.response.BeginnerModeRiderMapAction;
import co.bird.api.response.OpsBatchJobActionKind;
import co.bird.api.response.WarehouseInventory;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.CameraPosition;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.card.payment.CardIOActivity;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.joda.time.DateTime;
import p000.InterfaceC40099e13;
import zendesk.support.guide.HelpCenterActivity;
import zendesk.support.guide.HelpCenterConfiguration;
import zendesk.support.guide.ViewArticleActivity;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestConfiguration;
@Metadata(m28433d1 = {"\u0000\u009a\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 Ë\u00032\u00020\u0001:\u0001[B=\b\u0007\u0012\b\u0010\u0098\u0005\u001a\u00030\u0096\u0005\u0012\b\u0010\u009b\u0005\u001a\u00030\u0099\u0005\u0012\b\u0010\u009e\u0005\u001a\u00030\u009c\u0005\u0012\b\u0010¡\u0005\u001a\u00030\u009f\u0005\u0012\b\u0010¤\u0005\u001a\u00030¢\u0005¢\u0006\u0006\b¯\u0005\u0010°\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u0012\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\nH\u0016J\u0012\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\nH\u0016J&\u0010*\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\n2\b\u0010(\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\nH\u0016J2\u00104\u001a\u00020\u00042\b\b\u0001\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0016J2\u00107\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0016J\b\u00108\u001a\u00020\u0004H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209H\u0017J\b\u0010<\u001a\u00020\u0004H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\u0016\u0010A\u001a\u00020\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\b\u0010B\u001a\u00020\u0004H\u0016J\u0016\u0010E\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0CH\u0016J\u0010\u0010G\u001a\u00020\u00042\u0006\u00106\u001a\u00020FH\u0016J\u0010\u0010H\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\u001a\u0010K\u001a\u00020\u00042\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010.\u001a\u00020,H\u0016J\u001a\u0010L\u001a\u00020\u00042\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010.\u001a\u00020,H\u0016J \u0010P\u001a\u00020\u00042\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\n2\u0006\u0010.\u001a\u00020,H\u0016J\"\u0010R\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020I2\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010.\u001a\u00020,H\u0016J2\u0010V\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010.\u001a\u00020,2\u0006\u0010S\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010\n2\u0006\u0010U\u001a\u00020\fH\u0016J\u0010\u0010W\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\u0018\u0010[\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0006\u0010.\u001a\u00020,H\u0016J#\u0010^\u001a\u00020\u00042\b\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b^\u0010_J\b\u0010`\u001a\u00020\u0004H\u0016J*\u0010g\u001a\u00020\u00042\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020c2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010.\u001a\u00020,H\u0016J\u0010\u0010i\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\fH\u0016J\u0010\u0010j\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J!\u0010l\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,2\u0006\u0010k\u001a\u00020\fH\u0016¢\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\bn\u0010oJ\u0019\u0010p\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\bp\u0010oJ>\u0010z\u001a\u00020\u00042\u0006\u0010r\u001a\u00020q2\b\u0010s\u001a\u0004\u0018\u00010\n2\b\u0010u\u001a\u0004\u0018\u00010t2\u0006\u0010v\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010y\u001a\u00020\fH\u0016J>\u0010{\u001a\u00020\u00042\u0006\u0010r\u001a\u00020q2\b\u0010s\u001a\u0004\u0018\u00010\n2\b\u0010u\u001a\u0004\u0018\u00010t2\u0006\u0010v\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010y\u001a\u00020\fH\u0016J\u0010\u0010}\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\nH\u0016J\"\u0010\u0081\u0001\u001a\u00020\u00042\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0\u000f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\nH\u0016J/\u0010\u0083\u0001\u001a\u00020\u00042\u0007\u0010\u0082\u0001\u001a\u00020w2\b\u0010s\u001a\u0004\u0018\u00010\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001JR\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010r\u001a\u00020q2\b\u0010s\u001a\u0004\u0018\u00010\n2\b\u0010u\u001a\u0004\u0018\u00010t2\u0006\u0010v\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010y\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001JH\u0010\u0088\u0001\u001a\u00020\u00042\u0006\u0010r\u001a\u00020q2\b\u0010s\u001a\u0004\u0018\u00010\n2\b\u0010u\u001a\u0004\u0018\u00010t2\u0006\u0010v\u001a\u00020\u00062\b\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010y\u001a\u00020\f2\u0007\u0010\u0087\u0001\u001a\u00020IH\u0016JI\u0010\u008b\u0001\u001a\u00020\u00042\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0\u000f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\n2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\n2\u0007\u0010\u008a\u0001\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008e\u0001\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0090\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\fH\u0016J'\u0010\u0094\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\f2\u0007\u0010\u0091\u0001\u001a\u00020\f2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0016J\t\u0010\u0095\u0001\u001a\u00020\u0004H\u0016J\u0013\u0010\u0096\u0001\u001a\u00020\u00042\b\u0010J\u001a\u0004\u0018\u00010IH\u0016J\u001e\u0010\u009a\u0001\u001a\u00020\u00042\u0007\u0010\u0097\u0001\u001a\u00020\n2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0016J\u0011\u0010\u009b\u0001\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\t\u0010\u009c\u0001\u001a\u00020\u0004H\u0016J8\u0010\u009f\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J#\u0010¡\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\"\u0010£\u0001\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010¢\u0001\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\t\u0010¤\u0001\u001a\u00020\u0004H\u0016J\u001b\u0010§\u0001\u001a\u00020\u00042\u0007\u0010¥\u0001\u001a\u00020/2\u0007\u0010¦\u0001\u001a\u00020\nH\u0016J\u0017\u0010¨\u0001\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\t\u0010©\u0001\u001a\u00020\u0004H\u0016J$\u0010«\u0001\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,2\u0007\u0010ª\u0001\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0016J\u0011\u0010¬\u0001\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J0\u0010±\u0001\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u00012\b\u0010°\u0001\u001a\u00030¯\u00012\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b±\u0001\u0010²\u0001J0\u0010³\u0001\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u00012\b\u0010°\u0001\u001a\u00030¯\u00012\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b³\u0001\u0010²\u0001J\u0011\u0010´\u0001\u001a\u00020\u00042\u0006\u0010:\u001a\u000209H\u0016J+\u0010¶\u0001\u001a\u00020\u00042\r\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0011\u0010¸\u0001\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\t\u0010¹\u0001\u001a\u00020\u0004H\u0016J\t\u0010º\u0001\u001a\u00020\u0004H\u0016J\t\u0010»\u0001\u001a\u00020\u0004H\u0016J\u0011\u0010¼\u0001\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\t\u0010½\u0001\u001a\u00020\u0004H\u0016J\t\u0010¾\u0001\u001a\u00020\u0004H\u0016J\u0014\u0010À\u0001\u001a\u00020\u00042\t\u0010¿\u0001\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010Â\u0001\u001a\u00020\u00042\u0007\u0010Á\u0001\u001a\u00020\nH\u0016J:\u0010Æ\u0001\u001a\u00020\u00042\u0007\u0010Á\u0001\u001a\u00020\n2\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\n2\t\u0010Ä\u0001\u001a\u0004\u0018\u00010,2\u0007\u0010Å\u0001\u001a\u00020\fH\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0012\u0010É\u0001\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\nH\u0016J\t\u0010Ê\u0001\u001a\u00020\u0004H\u0016J\u0011\u0010Ë\u0001\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010Ì\u0001\u001a\u00020\u00042\u0007\u0010\u0015\u001a\u00030\u0098\u0001H\u0016J\u0012\u0010Î\u0001\u001a\u00020\u00042\u0007\u0010\u0015\u001a\u00030Í\u0001H\u0016J\u0011\u0010Ï\u0001\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0012\u0010Ñ\u0001\u001a\u00020\u00042\u0007\u0010Ð\u0001\u001a\u00020\nH\u0016J\u0012\u0010Ò\u0001\u001a\u00020\u00042\u0007\u0010¥\u0001\u001a\u00020/H\u0016J#\u0010Õ\u0001\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0007\u0010Ó\u0001\u001a\u00020\u00142\u0007\u0010Ô\u0001\u001a\u00020\fH\u0016J#\u0010Ö\u0001\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0007\u0010Ó\u0001\u001a\u00020\u00142\u0007\u0010Ô\u0001\u001a\u00020\fH\u0016Jj\u0010Þ\u0001\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0007\u0010v\u001a\u00030×\u00012\u0007\u0010Ø\u0001\u001a\u00020\n2\u0007\u0010Ó\u0001\u001a\u00020\u00142\u001b\u0010Ü\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ú\u00010Ù\u0001j\n\u0012\u0005\u0012\u00030Ú\u0001`Û\u00012\u001f\u0010Ý\u0001\u001a\u001a\u0012\u0005\u0012\u00030Ú\u0001\u0018\u00010Ù\u0001j\f\u0012\u0005\u0012\u00030Ú\u0001\u0018\u0001`Û\u0001H\u0016J@\u0010á\u0001\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0007\u0010Ó\u0001\u001a\u00020\u00142\u0007\u0010ß\u0001\u001a\u00020\n2\u001b\u0010à\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ú\u00010Ù\u0001j\n\u0012\u0005\u0012\u00030Ú\u0001`Û\u0001H\u0016J#\u0010ã\u0001\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0007\u0010ß\u0001\u001a\u00020\n2\u0007\u0010â\u0001\u001a\u00020\fH\u0016JP\u0010ê\u0001\u001a\u00020\f2\n\u0010å\u0001\u001a\u0005\u0018\u00010ä\u00012\u0007\u0010æ\u0001\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010,2\t\u0010ç\u0001\u001a\u0004\u0018\u00010\n2\u0007\u0010è\u0001\u001a\u00020\f2\t\u0010é\u0001\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0006\bê\u0001\u0010ë\u0001J\t\u0010ì\u0001\u001a\u00020\u0004H\u0016J\t\u0010í\u0001\u001a\u00020\u0004H\u0016J0\u0010ñ\u0001\u001a\u00020\u00042\u0007\u0010\u008f\u0001\u001a\u00020\f2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010î\u00012\u0010\u0010ð\u0001\u001a\u000b\u0012\u0005\u0012\u00030ï\u0001\u0018\u00010\u000fH\u0016J%\u0010ó\u0001\u001a\u00020\u00042\u0007\u0010ò\u0001\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bó\u0001\u0010ô\u0001JV\u0010ú\u0001\u001a\u00020\u00042\b\u0010ö\u0001\u001a\u00030õ\u00012\u001b\u0010ø\u0001\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010Ù\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`Û\u00012\b\u0010T\u001a\u0004\u0018\u00010\n2\u0007\u0010ò\u0001\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010I2\u0007\u0010ù\u0001\u001a\u00020\fH\u0016JJ\u0010ý\u0001\u001a\u00020\u00042\n\u0010ö\u0001\u001a\u0005\u0018\u00010õ\u00012\u001f\u0010ø\u0001\u001a\u001a\u0012\u0005\u0012\u00030÷\u0001\u0018\u00010Ù\u0001j\f\u0012\u0005\u0012\u00030÷\u0001\u0018\u0001`Û\u00012\u0006\u0010.\u001a\u00020,2\n\u0010ü\u0001\u001a\u0005\u0018\u00010û\u0001H\u0016JS\u0010\u0085\u0002\u001a\u00020\u00042\n\u0010ÿ\u0001\u001a\u0005\u0018\u00010þ\u00012\t\u0010\u0080\u0002\u001a\u0004\u0018\u00010\n2\n\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0081\u00022\b\u0010.\u001a\u0004\u0018\u00010,2\t\u0010\u0083\u0002\u001a\u0004\u0018\u00010\f2\u0007\u0010\u0084\u0002\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\t\u0010\u0087\u0002\u001a\u00020\u0004H\u0016J\t\u0010\u0088\u0002\u001a\u00020\u0004H\u0016J/\u0010\u0089\u0002\u001a\u00020\u00042\u001b\u0010ø\u0001\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010Ù\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`Û\u00012\u0007\u0010ò\u0001\u001a\u00020\u0006H\u0016Ji\u0010\u0093\u0002\u001a\u00020\u00042\u0007\u0010\u008a\u0002\u001a\u00020\f2\t\u0010\u008b\u0002\u001a\u0004\u0018\u00010I2\t\u0010\u008c\u0002\u001a\u0004\u0018\u00010,2\t\u0010\u008d\u0002\u001a\u0004\u0018\u00010\n2\t\u0010\u008e\u0002\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0002\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0002\u001a\u0004\u0018\u00010\f2\n\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u0091\u0002H\u0016¢\u0006\u0006\b\u0093\u0002\u0010\u0094\u0002J\t\u0010\u0095\u0002\u001a\u00020\u0004H\u0016J&\u0010\u0098\u0002\u001a\u00020\u00042\b\u0010\u0097\u0002\u001a\u00030\u0096\u00022\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J0\u0010\u009c\u0002\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u00022\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J\u0012\u0010\u009f\u0002\u001a\u00020\u00042\u0007\u0010\u009e\u0002\u001a\u00020,H\u0016J\u001b\u0010¡\u0002\u001a\u00020\u00042\u0007\u0010\u009e\u0002\u001a\u00020,2\u0007\u0010 \u0002\u001a\u00020\u0002H\u0016J\u001d\u0010¢\u0002\u001a\u00020\u00042\u0007\u0010\u009e\u0002\u001a\u00020,2\t\u0010 \u0002\u001a\u0004\u0018\u00010\u0002H\u0016JH\u0010§\u0002\u001a\u00020\u00042\b\u0010¤\u0002\u001a\u00030£\u00022*\u0010 \u0002\u001a\u0016\u0012\u0011\b\u0001\u0012\r\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030¦\u00020¥\u0002\"\r\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030¦\u0002H\u0016¢\u0006\u0006\b§\u0002\u0010¨\u0002JH\u0010©\u0002\u001a\u00020\u00042\b\u0010¤\u0002\u001a\u00030£\u00022*\u0010 \u0002\u001a\u0016\u0012\u0011\b\u0001\u0012\r\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030¦\u00020¥\u0002\"\r\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030¦\u0002H\u0016¢\u0006\u0006\b©\u0002\u0010¨\u0002J\u001b\u0010«\u0002\u001a\u00020\u00042\u0007\u0010ª\u0002\u001a\u00020\n2\u0007\u0010ç\u0001\u001a\u00020\nH\u0016J\u0012\u0010\u00ad\u0002\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\nH\u0016J\"\u0010°\u0002\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\n2\u000e\u0010¯\u0002\u001a\t\u0012\u0005\u0012\u00030®\u00020\u000fH\u0016J#\u0010³\u0002\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0007\u0010±\u0002\u001a\u00020\f2\u0007\u0010²\u0002\u001a\u00020\fH\u0016J-\u0010´\u0002\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u00012\u0006\u0010.\u001a\u00020,2\u0007\u0010±\u0002\u001a\u00020\f2\u0007\u0010²\u0002\u001a\u00020\fH\u0016J/\u0010·\u0002\u001a\u00020\u00042\b\u0010µ\u0002\u001a\u00030ä\u00012\u0007\u0010¶\u0002\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b·\u0002\u0010¸\u0002J\t\u0010¹\u0002\u001a\u00020\u0004H\u0016J\t\u0010º\u0002\u001a\u00020\u0004H\u0016J\u0011\u0010»\u0002\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\u0013\u0010¾\u0002\u001a\u00020\u00042\b\u0010½\u0002\u001a\u00030¼\u0002H\u0016J!\u0010Á\u0002\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u000e\u0010À\u0002\u001a\t\u0012\u0005\u0012\u00030¿\u00020\u000fH\u0016J\t\u0010Â\u0002\u001a\u00020\u0004H\u0016J\t\u0010Ã\u0002\u001a\u00020\u0004H\u0016J\t\u0010Ä\u0002\u001a\u00020\u0004H\u0016J\u0014\u0010Æ\u0002\u001a\u00020\u00042\t\u0010Å\u0002\u001a\u0004\u0018\u00010\nH\u0016J\t\u0010Ç\u0002\u001a\u00020\u0004H\u0016J\t\u0010È\u0002\u001a\u00020\u0004H\u0016J&\u0010Ì\u0002\u001a\u00020\u00042\b\u0010Ê\u0002\u001a\u00030É\u00022\t\u0010Ë\u0002\u001a\u0004\u0018\u00010\n2\u0006\u0010S\u001a\u00020\nH\u0016J\u0011\u0010Í\u0002\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\t\u0010Î\u0002\u001a\u00020\u0004H\u0016J\t\u0010Ï\u0002\u001a\u00020\u0004H\u0016J'\u0010Ó\u0002\u001a\u00020\u00042\b\u0010Ñ\u0002\u001a\u00030Ð\u00022\t\u0010Ò\u0002\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bÓ\u0002\u0010Ô\u0002J*\u0010Ø\u0002\u001a\u00020\u00042\u000e\u0010Ö\u0002\u001a\t\u0012\u0005\u0012\u00030Õ\u00020\u000f2\u0007\u0010×\u0002\u001a\u00020\n2\u0006\u0010.\u001a\u00020,H\u0016J\t\u0010Ù\u0002\u001a\u00020\u0004H\u0016J\t\u0010Ú\u0002\u001a\u00020\u0004H\u0016J=\u0010à\u0002\u001a\u00020\u00042\b\u0010Ü\u0002\u001a\u00030Û\u00022\n\u0010Þ\u0002\u001a\u0005\u0018\u00010Ý\u00022\t\u0010ß\u0002\u001a\u0004\u0018\u00010\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bà\u0002\u0010á\u0002J\u001d\u0010ä\u0002\u001a\u00020\u00042\b\u0010Ü\u0002\u001a\u00030Û\u00022\b\u0010ã\u0002\u001a\u00030â\u0002H\u0016J\t\u0010å\u0002\u001a\u00020\u0004H\u0016J.\u0010æ\u0002\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,2\u0006\u0010S\u001a\u00020\n2\t\u0010ß\u0002\u001a\u0004\u0018\u00010\n2\b\u0010Þ\u0002\u001a\u00030Ý\u0002H\u0016J\u0019\u0010ç\u0002\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,2\u0006\u0010S\u001a\u00020\nH\u0016J8\u0010ê\u0002\u001a\u00020\u00042\b\u0010Ü\u0002\u001a\u00030Û\u00022\b\u0010é\u0002\u001a\u00030è\u00022\u0006\u0010.\u001a\u00020,2\u0006\u0010S\u001a\u00020\n2\t\u0010ß\u0002\u001a\u0004\u0018\u00010\nH\u0016J7\u0010ë\u0002\u001a\u00020\u00042\b\u0010Ü\u0002\u001a\u00030Û\u00022\b\u0010ã\u0002\u001a\u00030â\u00022\b\u0010é\u0002\u001a\u00030è\u00022\u0006\u0010.\u001a\u00020,2\u0006\u0010S\u001a\u00020\nH\u0016J%\u0010í\u0002\u001a\u00020\u00042\u0007\u0010ì\u0002\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bí\u0002\u0010î\u0002J\t\u0010ï\u0002\u001a\u00020\u0004H\u0016J\t\u0010ð\u0002\u001a\u00020\u0004H\u0016J\t\u0010ñ\u0002\u001a\u00020\u0004H\u0016J\t\u0010ò\u0002\u001a\u00020\u0004H\u0016J\t\u0010ó\u0002\u001a\u00020\u0004H\u0016J\t\u0010ô\u0002\u001a\u00020\u0004H\u0016J\t\u0010õ\u0002\u001a\u00020\u0004H\u0016J,\u0010ö\u0002\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\n2\u0007\u0010ç\u0001\u001a\u00020\n2\u0007\u0010æ\u0001\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0015\u0010ù\u0002\u001a\u00020\u00042\n\u0010ø\u0002\u001a\u0005\u0018\u00010÷\u0002H\u0016J\u001c\u0010û\u0002\u001a\u00020\u00042\b\u0010J\u001a\u0004\u0018\u00010I2\u0007\u0010ú\u0002\u001a\u00020\fH\u0016J&\u0010ÿ\u0002\u001a\u00020\u00042\b\u0010ý\u0002\u001a\u00030ü\u00022\b\u0010J\u001a\u0004\u0018\u00010I2\u0007\u0010þ\u0002\u001a\u00020\fH\u0016J\u001d\u0010\u0080\u0003\u001a\u00020\u00042\b\u0010ý\u0002\u001a\u00030ü\u00022\b\u0010J\u001a\u0004\u0018\u00010IH\u0016Je\u0010\u008d\u0003\u001a\u00020\u00042\n\u0010\u0082\u0003\u001a\u0005\u0018\u00010\u0081\u00032\u0010\u0010\u0084\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u0083\u0003\u0018\u00010\u000f2\n\u0010\u0086\u0003\u001a\u0005\u0018\u00010\u0085\u00032\n\u0010\u0088\u0003\u001a\u0005\u0018\u00010\u0087\u00032\u0007\u0010\u0089\u0003\u001a\u00020\f2\u0007\u0010\u008a\u0003\u001a\u00020\f2\u0007\u0010\u008b\u0003\u001a\u00020\f2\t\u0010\u008c\u0003\u001a\u0004\u0018\u00010\nH\u0016J'\u0010\u008e\u0003\u001a\u00020\u00042\u0010\u0010\u0084\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u0083\u0003\u0018\u00010\u000f2\n\u0010\u0086\u0003\u001a\u0005\u0018\u00010\u0085\u0003H\u0016J/\u0010\u0091\u0003\u001a\u00020\u00042\u0007\u0010\u008f\u0003\u001a\u0002092\u0007\u0010±\u0002\u001a\u00020\f2\u0007\u0010²\u0002\u001a\u00020\f2\t\u0010\u0090\u0003\u001a\u0004\u0018\u00010\nH\u0016J\t\u0010\u0092\u0003\u001a\u00020\u0004H\u0016J\t\u0010\u0093\u0003\u001a\u00020\u0004H\u0016J\u0011\u0010\u0094\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\u0011\u0010\u0095\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\u0011\u0010\u0096\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\t\u0010\u0097\u0003\u001a\u00020\u0004H\u0016J&\u0010\u009a\u0003\u001a\u00020\u00042\u0007\u0010\u0098\u0003\u001a\u00020\n2\t\u0010\u0099\u0003\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u009a\u0003\u0010î\u0002J8\u0010 \u0003\u001a\u00020\u00042\u0010\u0010\u009c\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u009b\u0003\u0018\u00010\u000f2\u000f\u0010\u009d\u0003\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\n\u0010\u009f\u0003\u001a\u0005\u0018\u00010\u009e\u0003H\u0016J\"\u0010¢\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010.\u001a\u00020,2\u0007\u00103\u001a\u00030¡\u0003H\u0016J\u001b\u0010¥\u0003\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\n2\b\u0010¤\u0003\u001a\u00030£\u0003H\u0016J\u001d\u0010¦\u0003\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\n2\n\u0010¤\u0003\u001a\u0005\u0018\u00010£\u0003H\u0016J&\u0010ª\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\n\u0010¨\u0003\u001a\u0005\u0018\u00010§\u00032\u0007\u0010©\u0003\u001a\u00020\fH\u0016J/\u0010¬\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\n\u0010¨\u0003\u001a\u0005\u0018\u00010§\u00032\u0007\u0010©\u0003\u001a\u00020\f2\u0007\u0010«\u0003\u001a\u00020\fH\u0016J2\u0010±\u0003\u001a\u00020\u00042\u0007\u0010\u009f\u0003\u001a\u00020\n2\u000e\u0010®\u0003\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00030\u000f2\u000e\u0010°\u0003\u001a\t\u0012\u0005\u0012\u00030¯\u00030\u000fH\u0016J\u001b\u0010²\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\b\u0010¨\u0003\u001a\u00030§\u0003H\u0016J\t\u0010³\u0003\u001a\u00020\u0004H\u0016J\u0011\u0010´\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J3\u0010º\u0003\u001a\u00020\u00042\b\u0010¶\u0003\u001a\u00030µ\u00032\u000e\u0010·\u0003\u001a\t\u0012\u0005\u0012\u00030\u0087\u00030\u000f2\u000e\u0010¹\u0003\u001a\t\u0012\u0005\u0012\u00030¸\u00030\u000fH\u0016J;\u0010½\u0003\u001a\u00020\u00042\u000e\u0010»\u0003\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00030\u000f2\u000e\u0010¼\u0003\u001a\t\u0012\u0005\u0012\u00030\u0087\u00030\u000f2\u0010\u0010¹\u0003\u001a\u000b\u0012\u0005\u0012\u00030¸\u0003\u0018\u00010\u000fH\u0016J\u0011\u0010¾\u0003\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J.\u0010Á\u0003\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\n2\u0006\u0010.\u001a\u00020,2\u0007\u0010¿\u0003\u001a\u00020\f2\t\u0010À\u0003\u001a\u0004\u0018\u00010\nH\u0016J\t\u0010Â\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010Ä\u0003\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\n2\u0007\u0010Ã\u0003\u001a\u00020\nH\u0016J\t\u0010Å\u0003\u001a\u00020\u0004H\u0016J+\u0010Ç\u0003\u001a\u00020\u00042\b\u0010¶\u0003\u001a\u00030µ\u00032\u000e\u0010Æ\u0003\u001a\t\u0012\u0005\u0012\u00030¸\u00030\u000f2\u0006\u0010.\u001a\u00020,H\u0016J&\u0010Ê\u0003\u001a\u00020\u00042\u0007\u0010È\u0003\u001a\u00020\n2\t\u0010É\u0003\u001a\u0004\u0018\u00010\n2\u0007\u0010Ã\u0001\u001a\u00020\nH\u0016J\t\u0010Ë\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010Í\u0003\u001a\u00020\u00042\u0007\u0010Ì\u0003\u001a\u00020\nH\u0016J\u0013\u0010Ð\u0003\u001a\u00020\u00042\b\u0010Ï\u0003\u001a\u00030Î\u0003H\u0016J\t\u0010Ñ\u0003\u001a\u00020\u0004H\u0016J\t\u0010Ò\u0003\u001a\u00020\u0004H\u0016J\t\u0010Ó\u0003\u001a\u00020\u0004H\u0016J\t\u0010Ô\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010Ö\u0003\u001a\u00020\u00042\u0007\u00103\u001a\u00030Õ\u0003H\u0016J\u0013\u0010×\u0003\u001a\u00020\u00042\b\u0010ã\u0002\u001a\u00030â\u0002H\u0016J\t\u0010Ø\u0003\u001a\u00020\u0004H\u0016J\t\u0010Ù\u0003\u001a\u00020\u0004H\u0016J\u001e\u0010Ý\u0003\u001a\u00020\u00042\n\u0010Û\u0003\u001a\u0005\u0018\u00010Ú\u00032\u0007\u0010Ü\u0003\u001a\u00020\fH\u0016J\u001b\u0010ß\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\b\u0010Ü\u0002\u001a\u00030Þ\u0003H\u0016J\t\u0010à\u0003\u001a\u00020\u0004H\u0016J\u001d\u0010á\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\n\u0010¨\u0003\u001a\u0005\u0018\u00010§\u0003H\u0016J\u001d\u0010â\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\n\u0010¨\u0003\u001a\u0005\u0018\u00010§\u0003H\u0016J1\u0010ç\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u000e\u0010ä\u0003\u001a\t\u0012\u0005\u0012\u00030ã\u00030\u000f2\u000e\u0010æ\u0003\u001a\t\u0012\u0005\u0012\u00030å\u00030\u000fH\u0016J\t\u0010è\u0003\u001a\u00020\u0004H\u0016J\t\u0010é\u0003\u001a\u00020\u0004H\u0016J\t\u0010ê\u0003\u001a\u00020\u0004H\u0016J\t\u0010ë\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010í\u0003\u001a\u00020\u00042\u0007\u0010ì\u0003\u001a\u00020,H\u0016J\t\u0010î\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010ð\u0003\u001a\u00020\u00042\u0007\u0010ï\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020,H\u0016J\u0012\u0010ò\u0003\u001a\u00020\u00042\u0007\u0010ñ\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010ó\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\t\u0010ô\u0003\u001a\u00020\u0004H\u0016J&\u0010ø\u0003\u001a\u00020\u00042\u0007\u0010õ\u0003\u001a\u00020\n2\t\u0010ö\u0003\u001a\u0004\u0018\u00010\n2\u0007\u0010÷\u0003\u001a\u00020\fH\u0016J\t\u0010ù\u0003\u001a\u00020\u0004H\u0016J\u0011\u0010ú\u0003\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J`\u0010\u0081\u0004\u001a\u00020\u00042\u0007\u0010û\u0003\u001a\u00020\n2\u0007\u0010õ\u0003\u001a\u00020\n2\u0007\u0010ü\u0003\u001a\u00020/2\t\u0010ý\u0003\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\n2\b\u0010ÿ\u0003\u001a\u00030þ\u00032\t\u0010ö\u0003\u001a\u0004\u0018\u00010\n2\t\u0010\u0080\u0004\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0006\b\u0081\u0004\u0010\u0082\u0004JU\u0010\u0084\u0004\u001a\u00020\u00042\u0007\u0010û\u0003\u001a\u00020\n2\u0007\u0010õ\u0003\u001a\u00020\n2\u0007\u0010\u0083\u0004\u001a\u00020/2\t\u0010ý\u0003\u001a\u0004\u0018\u00010/2\t\u0010\u0080\u0004\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\n2\b\u0010ÿ\u0003\u001a\u00030þ\u0003H\u0016¢\u0006\u0006\b\u0084\u0004\u0010\u0085\u0004J\t\u0010\u0086\u0004\u001a\u00020\u0004H\u0016J\t\u0010\u0087\u0004\u001a\u00020\u0004H\u0016J\u001d\u0010\u008a\u0004\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\n\u0010\u0089\u0004\u001a\u0005\u0018\u00010\u0088\u0004H\u0016J6\u0010\u008c\u0004\u001a\u00020\u00042\u0007\u0010û\u0003\u001a\u00020\n2\u0007\u0010ü\u0003\u001a\u00020/2\u0006\u00101\u001a\u00020\n2\b\u0010\u008b\u0004\u001a\u00030þ\u00032\u0007\u0010õ\u0003\u001a\u00020\nH\u0016J\u0011\u0010\u008d\u0004\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J;\u0010\u0090\u0004\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\b\u0010\u008e\u0004\u001a\u00030µ\u00032\u000e\u0010¹\u0003\u001a\t\u0012\u0005\u0012\u00030\u008f\u00040\u000f2\u000e\u0010¼\u0003\u001a\t\u0012\u0005\u0012\u00030\u0087\u00030\u000fH\u0016J\u001e\u0010\u0094\u0004\u001a\u00020\u00042\u0007\u0010\u0091\u0004\u001a\u00020\n2\n\u0010\u0093\u0004\u001a\u0005\u0018\u00010\u0092\u0004H\u0016J+\u0010\u0099\u0004\u001a\u00020\u00042\u000e\u0010\u0096\u0004\u001a\t\u0012\u0005\u0012\u00030\u0095\u00040\u000f2\u0007\u0010\u0097\u0004\u001a\u00020\n2\u0007\u0010\u0098\u0004\u001a\u00020\nH\u0016J\t\u0010\u009a\u0004\u001a\u00020\u0004H\u0016J%\u0010\u009c\u0004\u001a\u00020\u00042\u0007\u0010õ\u0003\u001a\u00020\n2\u0007\u0010\u009b\u0004\u001a\u00020\n2\b\u0010Ó\u0001\u001a\u00030\u0098\u0001H\u0016J\u0012\u0010\u009e\u0004\u001a\u00020\u00042\u0007\u00103\u001a\u00030\u009d\u0004H\u0016J\u0011\u0010\u009f\u0004\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\nH\u0016J0\u0010¢\u0004\u001a\u00020\u00042\u001c\u0010 \u0004\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0¦\u00020\u000f2\u0007\u0010¡\u0004\u001a\u00020,H\u0016J\u0012\u0010£\u0004\u001a\u00020\u00042\u0007\u0010Á\u0001\u001a\u00020\nH\u0016J\u0013\u0010¥\u0004\u001a\u00020\u00042\b\u0010 \u0002\u001a\u00030¤\u0004H\u0016J\u0015\u0010¨\u0004\u001a\u00020\u00042\n\u0010§\u0004\u001a\u0005\u0018\u00010¦\u0004H\u0016J/\u0010«\u0004\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\n2\b\u0010ª\u0004\u001a\u00030©\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b«\u0004\u0010¬\u0004J%\u0010\u00ad\u0004\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u00ad\u0004\u0010î\u0002J*\u0010°\u0004\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\n2\n\u0010\u009f\u0003\u001a\u0005\u0018\u00010®\u00042\n\u0010¶\u0003\u001a\u0005\u0018\u00010¯\u0004H\u0016J\u0011\u0010±\u0004\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\u0012\u0010²\u0004\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\nH\u0016J\u0011\u0010³\u0004\u001a\u00020\u00042\u0006\u0010J\u001a\u00020IH\u0016J\t\u0010´\u0004\u001a\u00020\u0004H\u0016J\t\u0010µ\u0004\u001a\u00020\u0004H\u0016J\u001b\u0010¸\u0004\u001a\u00020\u00042\u0007\u0010¶\u0004\u001a\u00020\n2\u0007\u0010·\u0004\u001a\u00020\nH\u0016J\u0018\u0010¹\u0004\u001a\u00020\u00042\r\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\t\u0010º\u0004\u001a\u00020\u0004H\u0016J\u0013\u0010¼\u0004\u001a\u00020\u00042\b\u0010\u009f\u0003\u001a\u00030»\u0004H\u0016J\u0013\u0010¿\u0004\u001a\u00020\u00042\b\u0010¾\u0004\u001a\u00030½\u0004H\u0016J\u001d\u0010Á\u0004\u001a\u00020\u00042\t\u0010\u009f\u0003\u001a\u0004\u0018\u00010\n2\u0007\u0010À\u0004\u001a\u00020\nH\u0016J\t\u0010Â\u0004\u001a\u00020\u0004H\u0016J\u0012\u0010Ä\u0004\u001a\u00020\u00042\u0007\u0010Ã\u0004\u001a\u00020\nH\u0016J\u0012\u0010Æ\u0004\u001a\u00020\u00042\u0007\u0010Å\u0004\u001a\u00020\nH\u0016J\u0012\u0010È\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\nH\u0016J\u0012\u0010Ê\u0004\u001a\u00020\u00042\u0007\u0010É\u0004\u001a\u00020\nH\u0016J%\u0010Ë\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bË\u0004\u0010î\u0002J\u001b\u0010Í\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\n2\u0007\u0010Ì\u0004\u001a\u00020\fH\u0016J%\u0010Î\u0004\u001a\u00020\u00042\u0007\u0010Å\u0004\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bÎ\u0004\u0010î\u0002JC\u0010Ò\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\n2\u0007\u0010Ï\u0004\u001a\u00020\f2\u0007\u0010Ì\u0004\u001a\u00020\f2\u0007\u0010Ð\u0004\u001a\u00020\f2\t\u0010Ñ\u0004\u001a\u0004\u0018\u00010\n2\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\nH\u0016J\t\u0010Ó\u0004\u001a\u00020\u0004H\u0016J\t\u0010Ô\u0004\u001a\u00020\u0004H\u0016J#\u0010Ö\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\n2\u0007\u0010Õ\u0004\u001a\u00020\f2\u0006\u0010.\u001a\u00020,H\u0016J#\u0010×\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\n2\u0007\u0010Õ\u0004\u001a\u00020\f2\u0006\u0010.\u001a\u00020,H\u0016J\u001a\u0010Ø\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\n2\u0006\u0010.\u001a\u00020,H\u0016J\u001a\u0010Ù\u0004\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\n2\u0006\u0010.\u001a\u00020,H\u0016J\u001b\u0010Ú\u0004\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0005\bÚ\u0004\u0010oJ4\u0010Ý\u0004\u001a\u00020\u00042\r\u0010Û\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010.\u001a\u0004\u0018\u00010,2\u0007\u0010Ü\u0004\u001a\u00020\fH\u0016¢\u0006\u0006\bÝ\u0004\u0010Þ\u0004J\t\u0010ß\u0004\u001a\u00020\u0004H\u0016J\u0012\u0010á\u0004\u001a\u00020\u00042\u0007\u0010u\u001a\u00030à\u0004H\u0016J\t\u0010â\u0004\u001a\u00020\u0004H\u0016J\t\u0010ã\u0004\u001a\u00020\u0004H\u0016J\u0012\u0010ä\u0004\u001a\u00020\u00042\u0007\u0010Ç\u0004\u001a\u00020\nH\u0016J\u0012\u0010å\u0004\u001a\u00020\u00042\u0007\u0010¬\u0002\u001a\u00020\nH\u0016J:\u0010ê\u0004\u001a\u00020\u00042\b\u0010ç\u0004\u001a\u00030æ\u00042\u0006\u0010.\u001a\u00020,2\t\u0010è\u0004\u001a\u0004\u0018\u00010/2\t\u0010é\u0004\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0006\bê\u0004\u0010ë\u0004J,\u0010ì\u0004\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010T\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bì\u0004\u0010í\u0004J&\u0010î\u0004\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u00012\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\bî\u0004\u0010ï\u0004J8\u0010ó\u0004\u001a\u00020\u00042\b\u0010ç\u0004\u001a\u00030æ\u00042\u0007\u0010ð\u0004\u001a\u00020\n2\u0007\u0010ñ\u0004\u001a\u00020\n2\t\u0010ò\u0004\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020,H\u0016J'\u0010õ\u0004\u001a\u00020\u00042\t\u0010ô\u0004\u001a\u0004\u0018\u00010\n2\t\u0010ì\u0002\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020,H\u0016J\u001b\u0010ö\u0004\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0005\bö\u0004\u0010oJ\u001b\u0010÷\u0004\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0005\b÷\u0004\u0010oJ9\u0010û\u0004\u001a\u00020\u00042\u0007\u0010ø\u0004\u001a\u00020\f2\u0007\u0010ù\u0004\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010,2\t\u0010ú\u0004\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0006\bû\u0004\u0010ü\u0004J\u001a\u0010ý\u0004\u001a\u00020\u00042\u0007\u0010ô\u0004\u001a\u00020\n2\u0006\u0010.\u001a\u00020,H\u0016J\u0011\u0010þ\u0004\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\u0018\u0010\u0080\u0005\u001a\u00020\u00042\r\u0010ÿ\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\u0011\u0010\u0081\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\u0011\u0010\u0082\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020,H\u0016J\u0011\u0010\u0083\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u00020\nH\u0016J\u001b\u0010\u0084\u0005\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0005\b\u0084\u0005\u0010oJ8\u0010\u0086\u0005\u001a\u00020\u00042\b\u0010®\u0001\u001a\u00030\u00ad\u00012\u0007\u0010Ã\u0001\u001a\u00020\n2\u0007\u0010\u0085\u0005\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u0086\u0005\u0010\u0087\u0005J\u001b\u0010\u0088\u0005\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0005\b\u0088\u0005\u0010oJ0\u0010\u008a\u0005\u001a\u00020\u00042\u0007\u0010\u0089\u0005\u001a\u00020\n2\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\n2\b\u0010.\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0006\b\u008a\u0005\u0010\u008b\u0005J\t\u0010\u008c\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u008e\u0005\u001a\u00020\u00042\t\u0010\u008d\u0005\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0090\u0005\u001a\u00020\u00042\u0007\u0010\u008f\u0005\u001a\u00020\nH\u0016J.\u0010\u0095\u0005\u001a\u00020\u00042\u0007\u0010\u0091\u0005\u001a\u00020\n2\b\u0010\u0092\u0005\u001a\u00030®\u00042\b\u0010\u0094\u0005\u001a\u00030\u0093\u00052\u0006\u0010.\u001a\u00020,H\u0016R\u0017\u0010\u0098\u0005\u001a\u00030\u0096\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0097\u0005R\u0018\u0010\u009b\u0005\u001a\u00030\u0099\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0003\u0010\u009a\u0005R\u0018\u0010\u009e\u0005\u001a\u00030\u009c\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0004\u0010\u009d\u0005R\u0018\u0010¡\u0005\u001a\u00030\u009f\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010 \u0005R\u0018\u0010¤\u0005\u001a\u00030¢\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0001\u0010£\u0005R\"\u0010§\u0005\u001a\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u00010¥\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0005\u0010¦\u0005R\u0017\u0010ª\u0005\u001a\u00030¨\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b}\u0010©\u0005R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0005\u0010¬\u0005R\u0014\u0010O\u001a\u00030¢\u00058F¢\u0006\b\u001a\u0006\b\u00ad\u0005\u0010®\u0005¨\u0006±\u0005"}, m28432d2 = {"Lh13;", "Le13;", "Landroid/content/Intent;", "intent", "", "O4", "Lco/bird/android/model/constant/MapMode;", "mapMode", "Ldx0;", "configuration", "", "zendeskArticleId", "", "showContactUsButton", "K4", "", "additionalTags", "Lzendesk/support/request/RequestConfiguration$Builder;", "I4", "navigateIntent", "Landroid/location/Location;", "destination", "N4", "Landroid/content/pm/ResolveInfo;", "info", "M4", "enclosingMethod", "Landroid/app/Activity;", "F4", "activity", "L1", "u3", "y0", "ridePassLinkCode", "T2", "linkCode", "I2", "j1", "userSubscriptionId", "T", "subscriptionPlanId", "codename", "X", "W2", "", "titleId", "requestCode", "", "price", "currency", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "K3", "Lco/bird/android/model/constant/PurchasePaymentReason;", "reason", "A2", "b0", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "C4", "v3", "email", "b2", "C2", "photos", "v", "p0", "", "countries", "Y2", "Lco/bird/android/model/SystemSettingsReason;", "h2", "B4", "Lco/bird/android/model/wire/WireBird;", "bird", "m", "s1", "Lco/bird/android/model/itemlease/ItemLease;", "itemLease", CoreConstants.CONTEXT_SCOPE_VALUE, "n0", "wireBird", "w", "sessionId", "rideId", "isPostRide", "o1", "i0", "c1", "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;", "descriptor", C17296a.f69688o, "Lco/bird/android/model/contractor/ContractorOnboardStep;", "step", "D0", "(Lco/bird/android/model/contractor/ContractorOnboardStep;Ljava/lang/Integer;)V", "q2", "Lco/bird/android/model/wire/configs/RideConfig;", "rideConfig", "Lco/bird/android/model/Balance;", "balance", "Lco/bird/android/model/BirdPayment;", "defaultCard", "R0", "skipTokenRefresh", "r", "y3", "setPaypalDefault", "A", "(Ljava/lang/Integer;Z)V", "p1", "(Ljava/lang/Integer;)V", "w1", "Lco/bird/android/model/ScanType;", "scanType", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/constant/BirdAction;", "action", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "damageStatusUpdate", "c4", "m3", "tipId", "g", "Lco/bird/android/model/AgreementRole;", "agreementRoles", "partnerId", "W", "scanIntention", "f4", "(Lco/bird/android/model/constant/ScanIntention;Ljava/lang/String;Ljava/lang/Integer;)V", "N3", "(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;ZLjava/lang/Integer;)V", "limitBird", "Z3", "userGuestId", "isAggressivelyTriggered", "a3", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "showRating", "N", "restart", "X0", "showComplaintsDialog", "Lco/bird/android/model/GoDeepLinkParams;", "goDeeplink", "f1", "R3", "o3", "rideHistoryItemId", "Lco/bird/android/model/wire/WireLocation;", "birdLocation", "s2", "U3", "Q0", "fallbackArticleId", "inAnyRides", "V2", "(Lco/bird/android/model/constant/MapMode;Ljava/lang/String;ZLjava/lang/Boolean;)V", "j0", "article", "E", "a2", "articleId", "userRidePassId", "d2", "W3", "i4", "saveCardWithoutCharge", "G1", "O1", "Lco/bird/android/model/wire/WireRide;", "ride", "", "rating", "D1", "(Lco/bird/android/model/wire/WireRide;FLjava/lang/Integer;)V", "I1", "c3", "birdIds", "P2", "(Ljava/util/List;Ljava/lang/Integer;)V", "F0", "close", "e3", "M2", "D2", "f3", "G2", "tutorialKindString", "t2", "url", "m2", "title", "titleStringRes", "zendeskRedirectUrl", "m0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "webArchive", "f0", "Z", "u2", "x3", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "H", Bird_Kt.MODEL_BIRD_B4, "locale", "z2", "w3", "location", "startOver", "k", "j2", "Lco/bird/android/model/MechanicPhotoMode;", "id", "Ljava/util/ArrayList;", "Lco/bird/android/model/BirdInspectionPoint;", "Lkotlin/collections/ArrayList;", "points", "unselectedPoints", "B1", "repairId", "inspectionPointList", "l4", "shouldEscalate", "z3", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "unlocking", "taskId", "showForPrivateBird", "isHelmetLock", "o0", "(Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/Boolean;)Z", "D3", "x2", "Lco/bird/android/model/GoOperatorMapDeeplinkParams;", "Lco/bird/android/model/Point;", "zoomToRegion", "H2", "role", "f2", "(Lco/bird/android/model/constant/MapMode;Ljava/lang/Integer;)V", "Lco/bird/android/model/ComplaintType;", "complaintType", "Lco/bird/android/model/ComplaintSection;", "sections", "fromTaskList", "e", "Lco/bird/android/model/LocationSelectionModel;", "initialLocation", "x4", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "photoStoragePath", "Lco/bird/android/model/Folder;", "destS3Folder", "overrideUploadViaSignedUrl", "useAssetId", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/PhotoBannerViewModel;Ljava/lang/String;Lco/bird/android/model/Folder;Ljava/lang/Integer;Ljava/lang/Boolean;Z)V", "l3", "S2", "q4", "expectingResult", "filterBird", "forceScanDuration", "pendingActionTitle", "shouldShowCaptureModalOnBirdFound", "shouldShowOptionsButton", "shouldShowAddButton", "Landroidx/fragment/app/Fragment;", "fragment", "i2", "(ZLco/bird/android/model/wire/WireBird;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroidx/fragment/app/Fragment;)V", "L0", "Lco/bird/android/model/constant/TutorialType;", "type", "R", "(Lco/bird/android/model/constant/TutorialType;Ljava/lang/Integer;)V", "Lcom/google/android/gms/maps/model/CameraPosition;", "cameraPosition", "Q1", "(Lco/bird/android/model/constant/MapMode;Lcom/google/android/gms/maps/model/CameraPosition;Ljava/lang/Integer;)V", "resultCode", "b1", MessageExtension.FIELD_DATA, "e4", "C1", "Le13$b;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "Lkotlin/Pair;", "W0", "(Le13$b;[Lkotlin/Pair;)V", "J", "birdCode", "r0", "birdId", "P1", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "lockTypes", "A3", "showParkingWarning", "hasPhysicalLock", "F", "q", "lock", "forceEndTutorial", "b3", "(Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;)V", "J2", "O", "R1", "Lco/bird/android/model/LastLockComplianceModel;", RequestHeadersFactory.MODEL, "W1", "Lco/bird/android/model/LegacyRepairType;", "checkedRepairTypes", "D", "s0", "P3", "h4", "batchId", "N1", "m4", "k4", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "status", "notes", "I3", "X3", "h3", "d1", "Lco/bird/android/model/BarcodeScanType;", "barcodeScanType", "activityTitle", "Y3", "(Lco/bird/android/model/BarcodeScanType;Ljava/lang/Integer;)V", "Lco/bird/android/model/ReservationIssueOption;", "issueOptions", "reservationId", "u4", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "v1", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "Lco/bird/android/model/OperatorScanIntent;", "scanIntent", "tripStopId", "l0", "(Lco/bird/android/model/constant/BulkScanPurpose;Lco/bird/android/model/OperatorScanIntent;Ljava/lang/String;Ljava/lang/Integer;)V", "Lco/bird/android/model/wire/WireBatch;", "batch", "F3", "S1", "p", "z1", "Lco/bird/api/response/OpsBatchJobActionKind;", "actionKind", "B2", "A4", "warehouseId", "r1", "(Ljava/lang/String;Ljava/lang/Integer;)V", "e0", "U1", "e1", "V", "v0", "u", "p3", "B3", "Lco/bird/android/model/Deal;", "deal", "g1", "returnRepair", "O2", "Lco/bird/android/model/IdToolOption;", "option", "scanFirst", "S0", "y", "Lco/bird/android/model/constant/ScannerMode;", "scannerMode", "Lco/bird/android/model/constant/BirdModel;", "models", "Lco/bird/android/model/constant/PartKind;", "kind", "Lco/bird/android/model/RepairType;", "repairType", "rawScan", "enablePeripheralScanner", "manualInput", "prevScanIdentifier", "Z0", "C3", "detail", "photoUri", "t", "s4", "l2", "L2", "h0", "s3", "I0", "hardCountSessionId", "expectedScans", AbstractC26684u0.f100690q, "Lco/bird/android/model/persistence/HardCountScan;", "scans", "identifiers", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "category", "M3", "Lco/bird/android/model/InaccessibleReportSource;", "K2", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "evaluation", "J3", "U0", "Lco/bird/android/model/WorkOrder;", "workOrder", "returnAddedIssues", "B0", "recordInspectionEvent", "S", "Lco/bird/android/model/IssueType;", "categoryIssues", "Lco/bird/android/model/IssueTypeLock;", "selectedIssues", "I", "o4", "F2", "j4", "Lco/bird/android/model/Issue;", "issue", "issueRepairTypes", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairs", "G0", "issueTypes", "repairTypes", "P", "c0", "justPaired", "birdModel", "j", "S3", "paymentMethodId", "n3", "U", "repairs", "T0", "textToSend", "subject", "k1", "h", "scanResult", "R2", "Lco/bird/api/response/WarehouseInventory;", "inventory", "r4", "g3", "X2", "M1", "g4", "Lco/bird/android/model/TaxInformationSource;", "Y1", "t3", "N2", "y1", "Lco/bird/android/model/VehiclePricingDetails;", "vehiclePricingDetails", "fromScan", "O0", "Lco/bird/android/model/OperatorSupplementMapPurpose;", "n", "p4", "E1", "M", "Lco/bird/android/model/QCInspection;", "qcInspections", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", "v4", "T3", "L", "w0", "B", "eventIndex", "n4", "i1", "googleSignInIntent", "V1", "updateAppIntent", "g2", "z4", "Y", "merchantSiteId", "placardId", "fromRideScan", "O3", "Y0", "b", "transactionId", "amount", "amountBilled", "Lorg/joda/time/DateTime;", "transactionDateTime", "tipAmount", "Q", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Long;)V", "preTipAmount", "V0", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "E2", "J0", "Lco/bird/android/model/VehicleScrapRequest;", "scrapRequest", "G3", "date", "P0", "E3", "supertype", "Lco/bird/android/model/LegacyRepair;", "h1", "siteId", "Lco/bird/android/model/Trigger;", "trigger", "w2", "Lco/bird/api/response/BeginnerModeRiderMapAction;", "actions", "selectedAccelerationLevel", "activityLabel", "K1", "Q2", "merchantId", "T1", "Lco/bird/android/model/analytics/BirdPayOnboardingScreenViewedSource;", "F1", "o2", "images", "currentIndex", "K0", "d4", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "a4", "Ljava/io/File;", "screenshotFile", "t4", "Lco/bird/android/model/constant/InspectionContext;", "inspectionContext", "y4", "(Ljava/lang/String;Lco/bird/android/model/constant/InspectionContext;Ljava/lang/Integer;)V", "l", "Lco/bird/android/model/RepairCategory;", "Lco/bird/android/model/RepairIssue;", "t0", "x", "K", "y2", "t1", "Z2", "fleetId", "list", "d0", "e2", "w4", "Lco/bird/android/model/wire/WirePartCategory;", "k3", "Lco/bird/android/model/constant/HealthStatus;", "healthStatus", "N0", "partSku", "n2", "H3", "deeplinkUrl", "g0", "containerOrderId", "x0", "skuOrderId", "V3", "content", "Q3", "k2", "outbound", "M0", "q3", "itemCheckedIn", "viewUnidentified", "skuModel", "L3", "x1", "o", "serviceCenterFlow", "j3", "a1", "s", "k0", "U2", "tutorialIds", "keepUnseen", "G", "(Ljava/util/List;Ljava/lang/Integer;Z)V", "c2", "Lco/bird/android/model/constant/VehicleInventoryAction;", "q1", "d3", "z", "A0", "n1", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "selectedAmount", "selectedCurrency", "q0", "(Lco/bird/android/model/constant/PaymentMethod;ILjava/lang/Long;Ljava/lang/String;)V", "p2", "(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/Integer;)V", "l1", "(Lco/bird/android/model/wire/WireRide;Ljava/lang/Integer;)V", "clientKey", "publishableKey", "bankName", "E0", "nestId", AbstractC3831J1.f16564d, "r3", "i3", "includePayPerRide", "includeAutoReloadSection", "contextForAnalytics", "r2", "(ZZLjava/lang/Integer;Ljava/lang/String;)V", "c", "a0", "complaintIds", "v2", "H0", "f", "u1", "m1", "description", "Z1", "(Lco/bird/android/model/wire/WireRide;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "z0", "receiptId", "C0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "X1", "groupId", "H1", "notificationId", "A1", "vehicleId", "repairCategory", "Lco/bird/android/model/NonRepair;", "nonRepair", "i", "Lgl;", "Lgl;", "preference", "LEa;", "LEa;", "analyticsManager", "LTq4;", "LTq4;", "reactiveConfig", "LOh;", "LOh;", "buildConfig", "Landroid/content/Context;", "Landroid/content/Context;", "appContext", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "weakRefActivity", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "E4", "()Landroid/app/Activity;", "H4", "()Landroid/content/Context;", "<init>", "(Lgl;LEa;LTq4;LOh;Landroid/content/Context;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigatorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorImpl.kt\nco/bird/android/app/core/NavigatorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3004:1\n1#2:3005\n30#3,2:3006\n32#3:3009\n61#3,26:3010\n33#3:3036\n34#3:3038\n30#3,2:3039\n32#3:3042\n61#3,26:3043\n33#3:3069\n34#3:3071\n30#3,2:3072\n32#3:3075\n61#3,26:3076\n33#3:3102\n34#3:3104\n30#3,2:3105\n32#3:3108\n61#3,26:3109\n33#3:3135\n34#3:3137\n30#3,2:3138\n32#3:3141\n61#3,26:3142\n33#3:3168\n34#3:3170\n30#3,2:3171\n32#3:3174\n61#3,26:3175\n33#3:3201\n34#3:3203\n30#3,2:3204\n32#3:3207\n61#3,26:3208\n33#3:3234\n34#3:3236\n30#3,2:3237\n32#3:3240\n61#3,26:3241\n33#3:3267\n34#3:3269\n30#3,2:3270\n32#3:3273\n61#3,26:3274\n33#3:3300\n34#3:3302\n30#3,2:3305\n32#3:3308\n61#3,26:3309\n33#3:3335\n34#3:3337\n30#3,2:3338\n32#3:3341\n61#3,26:3342\n33#3:3368\n34#3:3370\n30#3,2:3371\n32#3:3374\n61#3,26:3375\n33#3:3401\n34#3:3403\n30#3,2:3404\n32#3:3407\n61#3,26:3408\n33#3:3434\n34#3:3436\n30#3,2:3437\n32#3:3440\n61#3,26:3441\n33#3:3467\n34#3:3469\n30#3,2:3470\n32#3:3473\n61#3,26:3474\n33#3:3500\n34#3:3502\n30#3,2:3503\n32#3:3506\n61#3,26:3507\n33#3:3533\n34#3:3535\n30#3,2:3536\n32#3:3539\n61#3,26:3540\n33#3:3566\n34#3:3568\n30#3,2:3569\n32#3:3572\n61#3,26:3573\n33#3:3599\n34#3:3601\n30#3,2:3602\n32#3:3605\n61#3,26:3606\n33#3:3632\n34#3:3634\n30#3,2:3635\n32#3:3638\n61#3,26:3639\n33#3:3665\n34#3:3667\n30#3,2:3668\n32#3:3671\n61#3,26:3672\n33#3:3698\n34#3:3700\n30#3,2:3701\n32#3:3704\n61#3,26:3705\n33#3:3731\n34#3:3733\n30#3,2:3734\n32#3:3737\n61#3,26:3738\n33#3:3764\n34#3:3766\n30#3,2:3767\n32#3:3770\n61#3,26:3771\n33#3:3797\n34#3:3799\n30#3,2:3800\n32#3:3803\n61#3,26:3804\n33#3:3830\n34#3:3832\n30#3,2:3833\n32#3:3836\n61#3,26:3837\n33#3:3863\n34#3:3865\n30#3,2:3866\n32#3:3869\n61#3,26:3870\n33#3:3896\n34#3:3898\n30#3,2:3899\n32#3:3902\n61#3,26:3903\n33#3:3929\n34#3:3931\n30#3,2:3932\n32#3:3935\n61#3,26:3936\n33#3:3962\n34#3:3964\n30#3,2:3965\n32#3:3968\n61#3,26:3969\n33#3:3995\n34#3:3997\n30#3,2:3998\n32#3:4001\n61#3,26:4002\n33#3:4028\n34#3:4030\n30#3,2:4031\n32#3:4034\n61#3,26:4035\n33#3:4061\n34#3:4063\n30#3,2:4064\n32#3:4067\n61#3,26:4068\n33#3:4094\n34#3:4096\n30#3,2:4097\n32#3:4100\n61#3,26:4101\n33#3:4127\n34#3:4129\n30#3,2:4130\n32#3:4133\n61#3,26:4134\n33#3:4160\n34#3:4162\n30#3,2:4163\n32#3:4166\n61#3,26:4167\n33#3:4193\n34#3:4195\n30#3,2:4196\n32#3:4199\n61#3,26:4200\n33#3:4226\n34#3:4228\n30#3,2:4229\n32#3:4232\n61#3,26:4233\n33#3:4259\n34#3:4261\n30#3,2:4262\n32#3:4265\n61#3,26:4266\n33#3:4292\n34#3:4294\n30#3,2:4295\n32#3:4298\n61#3,26:4299\n33#3:4325\n34#3:4327\n30#3,2:4328\n32#3:4331\n61#3,26:4332\n33#3:4358\n34#3:4360\n30#3,2:4361\n32#3:4364\n61#3,26:4365\n33#3:4391\n34#3:4393\n30#3,2:4394\n32#3:4397\n61#3,26:4398\n33#3:4424\n34#3:4426\n30#3,2:4427\n32#3:4430\n61#3,26:4431\n33#3:4457\n34#3:4459\n30#3,2:4460\n32#3:4463\n61#3,26:4464\n33#3:4490\n34#3:4492\n30#3,2:4493\n32#3:4496\n61#3,26:4497\n33#3:4523\n34#3:4525\n30#3,2:4526\n32#3:4529\n61#3,26:4530\n33#3:4556\n34#3:4558\n30#3,2:4559\n32#3:4562\n61#3,26:4563\n33#3:4589\n34#3:4591\n30#3,2:4592\n32#3:4595\n61#3,26:4596\n33#3:4622\n34#3:4624\n30#3,2:4625\n32#3:4628\n61#3,26:4629\n33#3:4655\n34#3:4657\n30#3,2:4658\n32#3:4661\n61#3,26:4662\n33#3:4688\n34#3:4690\n30#3,2:4691\n32#3:4694\n61#3,26:4695\n33#3:4721\n34#3:4723\n30#3,2:4724\n32#3:4727\n61#3,26:4728\n33#3:4754\n34#3:4756\n30#3,2:4757\n32#3:4760\n61#3,26:4761\n33#3:4787\n34#3:4789\n30#3,2:4790\n32#3:4793\n61#3,26:4794\n33#3:4820\n34#3:4822\n30#3,2:4823\n32#3:4826\n61#3,26:4827\n33#3:4853\n34#3:4855\n30#3,2:4856\n32#3:4859\n61#3,26:4860\n33#3:4886\n34#3:4888\n30#3,2:4889\n32#3:4892\n61#3,26:4893\n33#3:4919\n34#3:4921\n30#3,2:4922\n32#3:4925\n61#3,26:4926\n33#3:4952\n34#3:4954\n30#3,2:4955\n32#3:4958\n61#3,26:4959\n33#3:4985\n34#3:4987\n30#3,2:4988\n32#3:4991\n61#3,26:4992\n33#3:5018\n34#3:5020\n30#3,2:5021\n32#3:5024\n61#3,26:5025\n33#3:5051\n34#3:5053\n30#3,2:5054\n32#3:5057\n61#3,26:5058\n33#3:5084\n34#3:5086\n30#3,2:5087\n32#3:5090\n61#3,26:5091\n33#3:5117\n34#3:5119\n30#3,2:5120\n32#3:5123\n61#3,26:5124\n33#3:5150\n34#3:5152\n30#3,2:5153\n32#3:5156\n61#3,26:5157\n33#3:5183\n34#3:5185\n30#3,2:5186\n32#3:5189\n61#3,26:5190\n33#3:5216\n34#3:5218\n30#3,2:5219\n32#3:5222\n61#3,26:5223\n33#3:5249\n34#3:5251\n30#3,2:5252\n32#3:5255\n61#3,26:5256\n33#3:5282\n34#3:5284\n30#3,2:5285\n32#3:5288\n61#3,26:5289\n33#3:5315\n34#3:5317\n30#3,2:5318\n32#3:5321\n61#3,26:5322\n33#3:5348\n34#3:5350\n30#3,2:5351\n32#3:5354\n61#3,26:5355\n33#3:5381\n34#3:5383\n30#3,2:5384\n32#3:5387\n61#3,26:5388\n33#3:5414\n34#3:5416\n61#3,26:5417\n30#3,2:5443\n32#3:5446\n61#3,26:5447\n33#3:5473\n34#3:5475\n30#3,2:5476\n32#3:5479\n61#3,26:5480\n33#3:5506\n34#3:5508\n30#3,2:5509\n32#3:5512\n61#3,26:5513\n33#3:5539\n34#3:5541\n30#3,2:5542\n32#3:5545\n61#3,26:5546\n33#3:5572\n34#3:5574\n30#3,2:5575\n32#3:5578\n61#3,26:5579\n33#3:5605\n34#3:5607\n30#3,2:5608\n32#3:5611\n61#3,26:5612\n33#3:5638\n34#3:5640\n30#3,2:5641\n32#3:5644\n61#3,26:5645\n33#3:5671\n34#3:5673\n30#3,2:5674\n32#3:5677\n61#3,26:5678\n33#3:5704\n34#3:5706\n30#3,2:5707\n32#3:5710\n61#3,26:5711\n33#3:5737\n34#3:5739\n30#3,2:5740\n32#3:5743\n61#3,26:5744\n33#3:5770\n34#3:5772\n30#3,2:5773\n32#3:5776\n61#3,26:5777\n33#3:5803\n34#3:5805\n30#3,2:5806\n32#3:5809\n61#3,26:5810\n33#3:5836\n34#3:5838\n30#3,2:5839\n32#3:5842\n61#3,26:5843\n33#3:5869\n34#3:5871\n30#3,2:5872\n32#3:5875\n61#3,26:5876\n33#3:5902\n34#3:5904\n30#3,2:5905\n32#3:5908\n61#3,26:5909\n33#3:5935\n34#3:5937\n30#3,2:5938\n32#3:5941\n61#3,26:5942\n33#3:5968\n34#3:5970\n30#3,2:5971\n32#3:5974\n61#3,26:5975\n33#3:6001\n34#3:6003\n30#3,2:6004\n32#3:6007\n61#3,26:6008\n33#3:6034\n34#3:6036\n30#3,2:6037\n32#3:6040\n61#3,26:6041\n33#3:6067\n34#3:6069\n30#3,2:6070\n32#3:6073\n61#3,26:6074\n33#3:6100\n34#3:6102\n30#3,2:6103\n32#3:6106\n61#3,26:6107\n33#3:6133\n34#3:6135\n30#3,2:6136\n32#3:6139\n61#3,26:6140\n33#3:6166\n34#3:6168\n30#3,2:6169\n32#3:6172\n61#3,26:6173\n33#3:6199\n34#3:6201\n30#3,2:6202\n32#3:6205\n61#3,26:6206\n33#3:6232\n34#3:6234\n30#3,2:6235\n32#3:6238\n61#3,26:6239\n33#3:6265\n34#3:6267\n30#3,2:6268\n32#3:6271\n61#3,26:6272\n33#3:6298\n34#3:6300\n30#3,2:6301\n32#3:6304\n61#3,26:6305\n33#3:6331\n34#3:6333\n30#3,2:6334\n32#3:6337\n61#3,26:6338\n33#3:6364\n34#3:6366\n30#3,2:6367\n32#3:6370\n61#3,26:6371\n33#3:6397\n34#3:6399\n30#3,2:6400\n32#3:6403\n61#3,26:6404\n33#3:6430\n34#3:6432\n30#3,2:6433\n32#3:6436\n61#3,26:6437\n33#3:6463\n34#3:6465\n30#3,2:6470\n32#3:6473\n61#3,26:6474\n33#3:6500\n34#3:6502\n30#3,2:6507\n32#3:6510\n61#3,26:6511\n33#3:6537\n34#3:6539\n30#3,2:6540\n32#3:6543\n61#3,26:6544\n33#3:6570\n34#3:6572\n30#3,2:6573\n32#3:6576\n61#3,26:6577\n33#3:6603\n34#3:6605\n30#3,2:6606\n32#3:6609\n61#3,26:6610\n33#3:6636\n34#3:6638\n30#3,2:6639\n32#3:6642\n61#3,26:6643\n33#3:6669\n34#3:6671\n30#3,2:6672\n32#3:6675\n61#3,26:6676\n33#3:6702\n34#3:6704\n30#3,2:6705\n32#3:6708\n61#3,26:6709\n33#3:6735\n34#3:6737\n30#3,2:6738\n32#3:6741\n61#3,26:6742\n33#3:6768\n34#3:6770\n30#3,2:6775\n32#3:6778\n61#3,26:6779\n33#3:6805\n34#3:6807\n30#3,2:6808\n32#3:6811\n61#3,26:6812\n33#3:6838\n34#3:6840\n30#3,2:6841\n32#3:6844\n61#3,26:6845\n33#3:6871\n34#3:6873\n30#3,2:6874\n32#3:6877\n61#3,26:6878\n33#3:6904\n34#3:6906\n30#3,2:6907\n32#3:6910\n61#3,26:6911\n33#3:6937\n34#3:6939\n30#3,2:6940\n32#3:6943\n61#3,26:6944\n33#3:6970\n34#3:6972\n30#3,2:6973\n32#3:6976\n61#3,26:6977\n33#3:7003\n34#3:7005\n30#3,2:7006\n32#3:7009\n61#3,26:7010\n33#3:7036\n34#3:7038\n30#3,2:7039\n32#3:7042\n61#3,26:7043\n33#3:7069\n34#3:7071\n30#3,2:7072\n32#3:7075\n61#3,26:7076\n33#3:7102\n34#3:7104\n30#3,2:7105\n32#3:7108\n61#3,26:7109\n33#3:7135\n34#3:7137\n30#3,2:7138\n32#3:7141\n61#3,26:7142\n33#3:7168\n34#3:7170\n30#3,2:7171\n32#3:7174\n61#3,26:7175\n33#3:7201\n34#3:7203\n30#3,2:7204\n32#3:7207\n61#3,26:7208\n33#3:7234\n34#3:7236\n30#3,2:7237\n32#3:7240\n61#3,26:7241\n33#3:7267\n34#3:7269\n30#3,2:7270\n32#3:7273\n61#3,26:7274\n33#3:7300\n34#3:7302\n30#3,2:7303\n32#3:7306\n61#3,26:7307\n33#3:7333\n34#3:7335\n30#3,2:7336\n32#3:7339\n61#3,26:7340\n33#3:7366\n34#3:7368\n30#3,2:7369\n32#3:7372\n61#3,26:7373\n33#3:7399\n34#3:7401\n30#3,2:7402\n32#3:7405\n61#3,26:7406\n33#3:7432\n34#3:7434\n30#3,2:7435\n32#3:7438\n61#3,26:7439\n33#3:7465\n34#3:7467\n30#3,2:7468\n32#3:7471\n61#3,26:7472\n33#3:7498\n34#3:7500\n30#3,2:7501\n32#3:7504\n61#3,26:7505\n33#3:7531\n34#3:7533\n30#3,2:7534\n32#3:7537\n61#3,26:7538\n33#3:7564\n34#3:7566\n30#3,2:7567\n32#3:7570\n61#3,26:7571\n33#3:7597\n34#3:7599\n30#3,2:7600\n32#3:7603\n61#3,26:7604\n33#3:7630\n34#3:7632\n30#3,2:7633\n32#3:7636\n61#3,26:7637\n33#3:7663\n34#3:7665\n30#3,2:7666\n32#3:7669\n61#3,26:7670\n33#3:7696\n34#3:7698\n30#3,2:7699\n32#3:7702\n61#3,26:7703\n33#3:7729\n34#3:7731\n30#3,2:7732\n32#3:7735\n61#3,26:7736\n33#3:7762\n34#3:7764\n30#3,2:7765\n32#3:7768\n61#3,26:7769\n33#3:7795\n34#3:7797\n30#3,2:7798\n32#3:7801\n61#3,26:7802\n33#3:7828\n34#3:7830\n30#3,2:7831\n32#3:7834\n61#3,26:7835\n33#3:7861\n34#3:7863\n30#3,2:7864\n32#3:7867\n61#3,26:7868\n33#3:7894\n34#3:7896\n30#3,2:7897\n32#3:7900\n61#3,26:7901\n33#3:7927\n34#3:7929\n30#3,2:7930\n32#3:7933\n61#3,26:7934\n33#3:7960\n34#3:7962\n30#3,2:7963\n32#3:7966\n61#3,26:7967\n33#3:7993\n34#3:7995\n30#3,2:7996\n32#3:7999\n61#3,26:8000\n33#3:8026\n34#3:8028\n30#3,2:8029\n32#3:8032\n61#3,26:8033\n33#3:8059\n34#3:8061\n30#3,2:8062\n32#3:8065\n61#3,26:8066\n33#3:8092\n34#3:8094\n30#3,2:8095\n32#3:8098\n61#3,26:8099\n33#3:8125\n34#3:8127\n30#3,2:8128\n32#3:8131\n61#3,26:8132\n33#3:8158\n34#3:8160\n30#3,2:8161\n32#3:8164\n61#3,26:8165\n33#3:8191\n34#3:8193\n30#3,2:8194\n32#3:8197\n61#3,26:8198\n33#3:8224\n34#3:8226\n30#3,2:8227\n32#3:8230\n61#3,26:8231\n33#3:8257\n34#3:8259\n30#3,2:8260\n32#3:8263\n61#3,26:8264\n33#3:8290\n34#3:8292\n30#3,2:8293\n32#3:8296\n61#3,26:8297\n33#3:8323\n34#3:8325\n30#3,2:8326\n32#3:8329\n61#3,26:8330\n33#3:8356\n34#3:8358\n30#3,2:8359\n32#3:8362\n61#3,26:8363\n33#3:8389\n34#3:8391\n30#3,2:8392\n32#3:8395\n61#3,26:8396\n33#3:8422\n34#3:8424\n30#3,2:8425\n32#3:8428\n61#3,26:8429\n33#3:8455\n34#3:8457\n30#3,2:8458\n32#3:8461\n61#3,26:8462\n33#3:8488\n34#3:8490\n30#3,2:8491\n32#3:8494\n61#3,26:8495\n33#3:8521\n34#3:8523\n30#3,2:8524\n32#3:8527\n61#3,26:8528\n33#3:8554\n34#3:8556\n30#3,2:8557\n32#3:8560\n61#3,26:8561\n33#3:8587\n34#3:8589\n30#3,2:8590\n32#3:8593\n61#3,26:8594\n33#3:8620\n34#3:8622\n30#3,2:8623\n32#3:8626\n61#3,26:8627\n33#3:8653\n34#3:8655\n30#3,2:8656\n32#3:8659\n61#3,26:8660\n33#3:8686\n34#3:8688\n30#3,2:8693\n32#3:8696\n61#3,26:8697\n33#3:8723\n34#3:8725\n30#3,2:8726\n32#3:8729\n61#3,26:8730\n33#3:8756\n34#3:8758\n30#3,2:8759\n32#3:8762\n61#3,26:8763\n33#3:8789\n34#3:8791\n30#3,2:8792\n32#3:8795\n61#3,26:8796\n33#3:8822\n34#3:8824\n30#3,2:8825\n32#3:8828\n61#3,26:8829\n33#3:8855\n34#3:8857\n30#3,2:8858\n32#3:8861\n61#3,26:8862\n33#3:8888\n34#3:8890\n30#3,2:8891\n32#3:8894\n61#3,26:8895\n33#3:8921\n34#3:8923\n30#3,2:8924\n32#3:8927\n61#3,26:8928\n33#3:8954\n34#3:8956\n30#3,2:8957\n32#3:8960\n61#3,26:8961\n33#3:8987\n34#3:8989\n30#3,2:8990\n32#3:8993\n61#3,26:8994\n33#3:9020\n34#3:9022\n30#3,2:9023\n32#3:9026\n61#3,26:9027\n33#3:9053\n34#3:9055\n30#3,2:9056\n32#3:9059\n61#3,26:9060\n33#3:9086\n34#3:9088\n30#3,2:9089\n32#3:9092\n61#3,26:9093\n33#3:9119\n34#3:9121\n30#3,2:9122\n32#3:9125\n61#3,26:9126\n33#3:9152\n34#3:9154\n30#3,2:9155\n32#3:9158\n61#3,26:9159\n33#3:9185\n34#3:9187\n30#3,2:9188\n32#3:9191\n61#3,26:9192\n33#3:9218\n34#3:9220\n30#3,2:9221\n32#3:9224\n61#3,26:9225\n33#3:9251\n34#3:9253\n30#3,2:9254\n32#3:9257\n61#3,26:9258\n33#3:9284\n34#3:9286\n30#3,2:9287\n32#3:9290\n61#3,26:9291\n33#3:9317\n34#3:9319\n30#3,2:9320\n32#3:9323\n61#3,26:9324\n33#3:9350\n34#3:9352\n30#3,2:9353\n32#3:9356\n61#3,26:9357\n33#3:9383\n34#3:9385\n30#3,2:9386\n32#3:9389\n61#3,26:9390\n33#3:9416\n34#3:9418\n30#3,2:9419\n32#3:9422\n61#3,26:9423\n33#3:9449\n34#3:9451\n30#3,2:9452\n32#3:9455\n61#3,26:9456\n33#3:9482\n34#3:9484\n30#3,2:9485\n32#3:9488\n61#3,26:9489\n33#3:9515\n34#3:9517\n30#3,2:9518\n32#3:9521\n61#3,26:9522\n33#3:9548\n34#3:9550\n30#3,2:9551\n32#3:9554\n61#3,26:9555\n33#3:9581\n34#3:9583\n30#3,2:9584\n32#3:9587\n61#3,26:9588\n33#3:9614\n34#3:9616\n30#3,2:9617\n32#3:9620\n61#3,26:9621\n33#3:9647\n34#3:9649\n30#3,2:9650\n32#3:9653\n61#3,26:9654\n33#3:9680\n34#3:9682\n30#3,2:9683\n32#3:9686\n61#3,26:9687\n33#3:9713\n34#3:9715\n30#3,2:9716\n32#3:9719\n61#3,26:9720\n33#3:9746\n34#3:9748\n30#3,2:9749\n32#3:9752\n61#3,26:9753\n33#3:9779\n34#3:9781\n30#3,2:9782\n32#3:9785\n61#3,26:9786\n33#3:9812\n34#3:9814\n30#3,2:9815\n32#3:9818\n61#3,26:9819\n33#3:9845\n34#3:9847\n30#3,2:9848\n32#3:9851\n61#3,26:9852\n33#3:9878\n34#3:9880\n30#3,2:9881\n32#3:9884\n61#3,26:9885\n33#3:9911\n34#3:9913\n30#3,2:9914\n32#3:9917\n61#3,26:9918\n33#3:9944\n34#3:9946\n30#3,2:9947\n32#3:9950\n61#3,26:9951\n33#3:9977\n34#3:9979\n30#3,2:9980\n32#3:9983\n61#3,26:9984\n33#3:10010\n34#3:10012\n30#3,2:10013\n32#3:10016\n61#3,26:10017\n33#3:10043\n34#3:10045\n30#3,2:10046\n32#3:10049\n61#3,26:10050\n33#3:10076\n34#3:10078\n30#3,2:10079\n32#3:10082\n61#3,26:10083\n33#3:10109\n34#3:10111\n30#3,2:10112\n32#3:10115\n61#3,26:10116\n33#3:10142\n34#3:10144\n30#3,2:10145\n32#3:10148\n61#3,26:10149\n33#3:10175\n34#3:10177\n30#3,2:10178\n32#3:10181\n61#3,26:10182\n33#3:10208\n34#3:10210\n30#3,2:10211\n32#3:10214\n61#3,26:10215\n33#3:10241\n34#3:10243\n30#3,2:10244\n32#3:10247\n61#3,26:10248\n33#3:10274\n34#3:10276\n30#3,2:10277\n32#3:10280\n61#3,26:10281\n33#3:10307\n34#3:10309\n30#3,2:10310\n32#3:10313\n61#3,26:10314\n33#3:10340\n34#3:10342\n30#3,2:10343\n32#3:10346\n61#3,26:10347\n33#3:10373\n34#3:10375\n30#3,2:10376\n32#3:10379\n61#3,26:10380\n33#3:10406\n34#3:10408\n30#3,2:10409\n32#3:10412\n61#3,26:10413\n33#3:10439\n34#3:10441\n30#3,2:10442\n32#3:10445\n61#3,26:10446\n33#3:10472\n34#3:10474\n30#3,2:10475\n32#3:10478\n61#3,26:10479\n33#3:10505\n34#3:10507\n30#3,2:10508\n32#3:10511\n61#3,26:10512\n33#3:10538\n34#3:10540\n30#3,2:10541\n32#3:10544\n61#3,26:10545\n33#3:10571\n34#3:10573\n30#3,2:10574\n32#3:10577\n61#3,26:10578\n33#3:10604\n34#3:10606\n30#3,2:10607\n32#3:10610\n61#3,26:10611\n33#3:10637\n34#3:10639\n30#3,2:10640\n32#3:10643\n61#3,26:10644\n33#3:10670\n34#3:10672\n30#3,2:10673\n32#3:10676\n61#3,26:10677\n33#3:10703\n34#3:10705\n13579#4:3008\n13580#4:3037\n13579#4:3041\n13580#4:3070\n13579#4:3074\n13580#4:3103\n13579#4:3107\n13580#4:3136\n13579#4:3140\n13580#4:3169\n13579#4:3173\n13580#4:3202\n13579#4:3206\n13580#4:3235\n13579#4:3239\n13580#4:3268\n13579#4:3272\n13580#4:3301\n13579#4:3307\n13580#4:3336\n13579#4:3340\n13580#4:3369\n13579#4:3373\n13580#4:3402\n13579#4:3406\n13580#4:3435\n13579#4:3439\n13580#4:3468\n13579#4:3472\n13580#4:3501\n13579#4:3505\n13580#4:3534\n13579#4:3538\n13580#4:3567\n13579#4:3571\n13580#4:3600\n13579#4:3604\n13580#4:3633\n13579#4:3637\n13580#4:3666\n13579#4:3670\n13580#4:3699\n13579#4:3703\n13580#4:3732\n13579#4:3736\n13580#4:3765\n13579#4:3769\n13580#4:3798\n13579#4:3802\n13580#4:3831\n13579#4:3835\n13580#4:3864\n13579#4:3868\n13580#4:3897\n13579#4:3901\n13580#4:3930\n13579#4:3934\n13580#4:3963\n13579#4:3967\n13580#4:3996\n13579#4:4000\n13580#4:4029\n13579#4:4033\n13580#4:4062\n13579#4:4066\n13580#4:4095\n13579#4:4099\n13580#4:4128\n13579#4:4132\n13580#4:4161\n13579#4:4165\n13580#4:4194\n13579#4:4198\n13580#4:4227\n13579#4:4231\n13580#4:4260\n13579#4:4264\n13580#4:4293\n13579#4:4297\n13580#4:4326\n13579#4:4330\n13580#4:4359\n13579#4:4363\n13580#4:4392\n13579#4:4396\n13580#4:4425\n13579#4:4429\n13580#4:4458\n13579#4:4462\n13580#4:4491\n13579#4:4495\n13580#4:4524\n13579#4:4528\n13580#4:4557\n13579#4:4561\n13580#4:4590\n13579#4:4594\n13580#4:4623\n13579#4:4627\n13580#4:4656\n13579#4:4660\n13580#4:4689\n13579#4:4693\n13580#4:4722\n13579#4:4726\n13580#4:4755\n13579#4:4759\n13580#4:4788\n13579#4:4792\n13580#4:4821\n13579#4:4825\n13580#4:4854\n13579#4:4858\n13580#4:4887\n13579#4:4891\n13580#4:4920\n13579#4:4924\n13580#4:4953\n13579#4:4957\n13580#4:4986\n13579#4:4990\n13580#4:5019\n13579#4:5023\n13580#4:5052\n13579#4:5056\n13580#4:5085\n13579#4:5089\n13580#4:5118\n13579#4:5122\n13580#4:5151\n13579#4:5155\n13580#4:5184\n13579#4:5188\n13580#4:5217\n13579#4:5221\n13580#4:5250\n13579#4:5254\n13580#4:5283\n13579#4:5287\n13580#4:5316\n13579#4:5320\n13580#4:5349\n13579#4:5353\n13580#4:5382\n13579#4:5386\n13580#4:5415\n13579#4:5445\n13580#4:5474\n13579#4:5478\n13580#4:5507\n13579#4:5511\n13580#4:5540\n13579#4:5544\n13580#4:5573\n13579#4:5577\n13580#4:5606\n13579#4:5610\n13580#4:5639\n13579#4:5643\n13580#4:5672\n13579#4:5676\n13580#4:5705\n13579#4:5709\n13580#4:5738\n13579#4:5742\n13580#4:5771\n13579#4:5775\n13580#4:5804\n13579#4:5808\n13580#4:5837\n13579#4:5841\n13580#4:5870\n13579#4:5874\n13580#4:5903\n13579#4:5907\n13580#4:5936\n13579#4:5940\n13580#4:5969\n13579#4:5973\n13580#4:6002\n13579#4:6006\n13580#4:6035\n13579#4:6039\n13580#4:6068\n13579#4:6072\n13580#4:6101\n13579#4:6105\n13580#4:6134\n13579#4:6138\n13580#4:6167\n13579#4:6171\n13580#4:6200\n13579#4:6204\n13580#4:6233\n13579#4:6237\n13580#4:6266\n13579#4:6270\n13580#4:6299\n13579#4:6303\n13580#4:6332\n13579#4:6336\n13580#4:6365\n13579#4:6369\n13580#4:6398\n13579#4:6402\n13580#4:6431\n13579#4:6435\n13580#4:6464\n13579#4:6472\n13580#4:6501\n13579#4:6509\n13580#4:6538\n13579#4:6542\n13580#4:6571\n13579#4:6575\n13580#4:6604\n13579#4:6608\n13580#4:6637\n13579#4:6641\n13580#4:6670\n13579#4:6674\n13580#4:6703\n13579#4:6707\n13580#4:6736\n13579#4:6740\n13580#4:6769\n13579#4:6777\n13580#4:6806\n13579#4:6810\n13580#4:6839\n13579#4:6843\n13580#4:6872\n13579#4:6876\n13580#4:6905\n13579#4:6909\n13580#4:6938\n13579#4:6942\n13580#4:6971\n13579#4:6975\n13580#4:7004\n13579#4:7008\n13580#4:7037\n13579#4:7041\n13580#4:7070\n13579#4:7074\n13580#4:7103\n13579#4:7107\n13580#4:7136\n13579#4:7140\n13580#4:7169\n13579#4:7173\n13580#4:7202\n13579#4:7206\n13580#4:7235\n13579#4:7239\n13580#4:7268\n13579#4:7272\n13580#4:7301\n13579#4:7305\n13580#4:7334\n13579#4:7338\n13580#4:7367\n13579#4:7371\n13580#4:7400\n13579#4:7404\n13580#4:7433\n13579#4:7437\n13580#4:7466\n13579#4:7470\n13580#4:7499\n13579#4:7503\n13580#4:7532\n13579#4:7536\n13580#4:7565\n13579#4:7569\n13580#4:7598\n13579#4:7602\n13580#4:7631\n13579#4:7635\n13580#4:7664\n13579#4:7668\n13580#4:7697\n13579#4:7701\n13580#4:7730\n13579#4:7734\n13580#4:7763\n13579#4:7767\n13580#4:7796\n13579#4:7800\n13580#4:7829\n13579#4:7833\n13580#4:7862\n13579#4:7866\n13580#4:7895\n13579#4:7899\n13580#4:7928\n13579#4:7932\n13580#4:7961\n13579#4:7965\n13580#4:7994\n13579#4:7998\n13580#4:8027\n13579#4:8031\n13580#4:8060\n13579#4:8064\n13580#4:8093\n13579#4:8097\n13580#4:8126\n13579#4:8130\n13580#4:8159\n13579#4:8163\n13580#4:8192\n13579#4:8196\n13580#4:8225\n13579#4:8229\n13580#4:8258\n13579#4:8262\n13580#4:8291\n13579#4:8295\n13580#4:8324\n13579#4:8328\n13580#4:8357\n13579#4:8361\n13580#4:8390\n13579#4:8394\n13580#4:8423\n13579#4:8427\n13580#4:8456\n13579#4:8460\n13580#4:8489\n13579#4:8493\n13580#4:8522\n13579#4:8526\n13580#4:8555\n13579#4:8559\n13580#4:8588\n13579#4:8592\n13580#4:8621\n13579#4:8625\n13580#4:8654\n13579#4:8658\n13580#4:8687\n13579#4:8695\n13580#4:8724\n13579#4:8728\n13580#4:8757\n13579#4:8761\n13580#4:8790\n13579#4:8794\n13580#4:8823\n13579#4:8827\n13580#4:8856\n13579#4:8860\n13580#4:8889\n13579#4:8893\n13580#4:8922\n13579#4:8926\n13580#4:8955\n13579#4:8959\n13580#4:8988\n13579#4:8992\n13580#4:9021\n13579#4:9025\n13580#4:9054\n13579#4:9058\n13580#4:9087\n13579#4:9091\n13580#4:9120\n13579#4:9124\n13580#4:9153\n13579#4:9157\n13580#4:9186\n13579#4:9190\n13580#4:9219\n13579#4:9223\n13580#4:9252\n13579#4:9256\n13580#4:9285\n13579#4:9289\n13580#4:9318\n13579#4:9322\n13580#4:9351\n13579#4:9355\n13580#4:9384\n13579#4:9388\n13580#4:9417\n13579#4:9421\n13580#4:9450\n13579#4:9454\n13580#4:9483\n13579#4:9487\n13580#4:9516\n13579#4:9520\n13580#4:9549\n13579#4:9553\n13580#4:9582\n13579#4:9586\n13580#4:9615\n13579#4:9619\n13580#4:9648\n13579#4:9652\n13580#4:9681\n13579#4:9685\n13580#4:9714\n13579#4:9718\n13580#4:9747\n13579#4:9751\n13580#4:9780\n13579#4:9784\n13580#4:9813\n13579#4:9817\n13580#4:9846\n13579#4:9850\n13580#4:9879\n13579#4:9883\n13580#4:9912\n13579#4:9916\n13580#4:9945\n13579#4:9949\n13580#4:9978\n13579#4:9982\n13580#4:10011\n13579#4:10015\n13580#4:10044\n13579#4:10048\n13580#4:10077\n13579#4:10081\n13580#4:10110\n13579#4:10114\n13580#4:10143\n13579#4:10147\n13580#4:10176\n13579#4:10180\n13580#4:10209\n13579#4:10213\n13580#4:10242\n13579#4:10246\n13580#4:10275\n13579#4:10279\n13580#4:10308\n13579#4:10312\n13580#4:10341\n13579#4:10345\n13580#4:10374\n13579#4:10378\n13580#4:10407\n13579#4:10411\n13580#4:10440\n13579#4:10444\n13580#4:10473\n13579#4:10477\n13580#4:10506\n13579#4:10510\n13580#4:10539\n13579#4:10543\n13580#4:10572\n13579#4:10576\n13580#4:10605\n13579#4:10609\n13580#4:10638\n13579#4:10642\n13580#4:10671\n13579#4:10675\n13580#4:10704\n37#5,2:3303\n37#5,2:10706\n1549#6:6466\n1620#6,3:6467\n1549#6:6503\n1620#6,3:6504\n1549#6:6771\n1620#6,3:6772\n1549#6:8689\n1620#6,3:8690\n*S KotlinDebug\n*F\n+ 1 NavigatorImpl.kt\nco/bird/android/app/core/NavigatorImpl\n*L\n416#1:3006,2\n416#1:3009\n416#1:3010,26\n416#1:3036\n416#1:3038\n422#1:3039,2\n422#1:3042\n422#1:3043,26\n422#1:3069\n422#1:3071\n428#1:3072,2\n428#1:3075\n428#1:3076,26\n428#1:3102\n428#1:3104\n434#1:3105,2\n434#1:3108\n434#1:3109,26\n434#1:3135\n434#1:3137\n442#1:3138,2\n442#1:3141\n442#1:3142,26\n442#1:3168\n442#1:3170\n454#1:3171,2\n454#1:3174\n454#1:3175,26\n454#1:3201\n454#1:3203\n468#1:3204,2\n468#1:3207\n468#1:3208,26\n468#1:3234\n468#1:3236\n477#1:3237,2\n477#1:3240\n477#1:3241,26\n477#1:3267\n477#1:3269\n488#1:3270,2\n488#1:3273\n488#1:3274,26\n488#1:3300\n488#1:3302\n540#1:3305,2\n540#1:3308\n540#1:3309,26\n540#1:3335\n540#1:3337\n546#1:3338,2\n546#1:3341\n546#1:3342,26\n546#1:3368\n546#1:3370\n592#1:3371,2\n592#1:3374\n592#1:3375,26\n592#1:3401\n592#1:3403\n599#1:3404,2\n599#1:3407\n599#1:3408,26\n599#1:3434\n599#1:3436\n607#1:3437,2\n607#1:3440\n607#1:3441,26\n607#1:3467\n607#1:3469\n620#1:3470,2\n620#1:3473\n620#1:3474,26\n620#1:3500\n620#1:3502\n635#1:3503,2\n635#1:3506\n635#1:3507,26\n635#1:3533\n635#1:3535\n645#1:3536,2\n645#1:3539\n645#1:3540,26\n645#1:3566\n645#1:3568\n650#1:3569,2\n650#1:3572\n650#1:3573,26\n650#1:3599\n650#1:3601\n655#1:3602,2\n655#1:3605\n655#1:3606,26\n655#1:3632\n655#1:3634\n674#1:3635,2\n674#1:3638\n674#1:3639,26\n674#1:3665\n674#1:3667\n682#1:3668,2\n682#1:3671\n682#1:3672,26\n682#1:3698\n682#1:3700\n720#1:3701,2\n720#1:3704\n720#1:3705,26\n720#1:3731\n720#1:3733\n737#1:3734,2\n737#1:3737\n737#1:3738,26\n737#1:3764\n737#1:3766\n753#1:3767,2\n753#1:3770\n753#1:3771,26\n753#1:3797\n753#1:3799\n763#1:3800,2\n763#1:3803\n763#1:3804,26\n763#1:3830\n763#1:3832\n768#1:3833,2\n768#1:3836\n768#1:3837,26\n768#1:3863\n768#1:3865\n775#1:3866,2\n775#1:3869\n775#1:3870,26\n775#1:3896\n775#1:3898\n792#1:3899,2\n792#1:3902\n792#1:3903,26\n792#1:3929\n792#1:3931\n806#1:3932,2\n806#1:3935\n806#1:3936,26\n806#1:3962\n806#1:3964\n823#1:3965,2\n823#1:3968\n823#1:3969,26\n823#1:3995\n823#1:3997\n847#1:3998,2\n847#1:4001\n847#1:4002,26\n847#1:4028\n847#1:4030\n899#1:4031,2\n899#1:4034\n899#1:4035,26\n899#1:4061\n899#1:4063\n910#1:4064,2\n910#1:4067\n910#1:4068,26\n910#1:4094\n910#1:4096\n916#1:4097,2\n916#1:4100\n916#1:4101,26\n916#1:4127\n916#1:4129\n931#1:4130,2\n931#1:4133\n931#1:4134,26\n931#1:4160\n931#1:4162\n1086#1:4163,2\n1086#1:4166\n1086#1:4167,26\n1086#1:4193\n1086#1:4195\n1088#1:4196,2\n1088#1:4199\n1088#1:4200,26\n1088#1:4226\n1088#1:4228\n1092#1:4229,2\n1092#1:4232\n1092#1:4233,26\n1092#1:4259\n1092#1:4261\n1100#1:4262,2\n1100#1:4265\n1100#1:4266,26\n1100#1:4292\n1100#1:4294\n1109#1:4295,2\n1109#1:4298\n1109#1:4299,26\n1109#1:4325\n1109#1:4327\n1155#1:4328,2\n1155#1:4331\n1155#1:4332,26\n1155#1:4358\n1155#1:4360\n1167#1:4361,2\n1167#1:4364\n1167#1:4365,26\n1167#1:4391\n1167#1:4393\n1173#1:4394,2\n1173#1:4397\n1173#1:4398,26\n1173#1:4424\n1173#1:4426\n1181#1:4427,2\n1181#1:4430\n1181#1:4431,26\n1181#1:4457\n1181#1:4459\n1188#1:4460,2\n1188#1:4463\n1188#1:4464,26\n1188#1:4490\n1188#1:4492\n1228#1:4493,2\n1228#1:4496\n1228#1:4497,26\n1228#1:4523\n1228#1:4525\n1238#1:4526,2\n1238#1:4529\n1238#1:4530,26\n1238#1:4556\n1238#1:4558\n1291#1:4559,2\n1291#1:4562\n1291#1:4563,26\n1291#1:4589\n1291#1:4591\n1297#1:4592,2\n1297#1:4595\n1297#1:4596,26\n1297#1:4622\n1297#1:4624\n1310#1:4625,2\n1310#1:4628\n1310#1:4629,26\n1310#1:4655\n1310#1:4657\n1315#1:4658,2\n1315#1:4661\n1315#1:4662,26\n1315#1:4688\n1315#1:4690\n1322#1:4691,2\n1322#1:4694\n1322#1:4695,26\n1322#1:4721\n1322#1:4723\n1371#1:4724,2\n1371#1:4727\n1371#1:4728,26\n1371#1:4754\n1371#1:4756\n1380#1:4757,2\n1380#1:4760\n1380#1:4761,26\n1380#1:4787\n1380#1:4789\n1410#1:4790,2\n1410#1:4793\n1410#1:4794,26\n1410#1:4820\n1410#1:4822\n1416#1:4823,2\n1416#1:4826\n1416#1:4827,26\n1416#1:4853\n1416#1:4855\n1418#1:4856,2\n1418#1:4859\n1418#1:4860,26\n1418#1:4886\n1418#1:4888\n1423#1:4889,2\n1423#1:4892\n1423#1:4893,26\n1423#1:4919\n1423#1:4921\n1464#1:4922,2\n1464#1:4925\n1464#1:4926,26\n1464#1:4952\n1464#1:4954\n1473#1:4955,2\n1473#1:4958\n1473#1:4959,26\n1473#1:4985\n1473#1:4987\n1481#1:4988,2\n1481#1:4991\n1481#1:4992,26\n1481#1:5018\n1481#1:5020\n1488#1:5021,2\n1488#1:5024\n1488#1:5025,26\n1488#1:5051\n1488#1:5053\n1496#1:5054,2\n1496#1:5057\n1496#1:5058,26\n1496#1:5084\n1496#1:5086\n1506#1:5087,2\n1506#1:5090\n1506#1:5091,26\n1506#1:5117\n1506#1:5119\n1516#1:5120,2\n1516#1:5123\n1516#1:5124,26\n1516#1:5150\n1516#1:5152\n1527#1:5153,2\n1527#1:5156\n1527#1:5157,26\n1527#1:5183\n1527#1:5185\n1531#1:5186,2\n1531#1:5189\n1531#1:5190,26\n1531#1:5216\n1531#1:5218\n1535#1:5219,2\n1535#1:5222\n1535#1:5223,26\n1535#1:5249\n1535#1:5251\n1540#1:5252,2\n1540#1:5255\n1540#1:5256,26\n1540#1:5282\n1540#1:5284\n1546#1:5285,2\n1546#1:5288\n1546#1:5289,26\n1546#1:5315\n1546#1:5317\n1559#1:5318,2\n1559#1:5321\n1559#1:5322,26\n1559#1:5348\n1559#1:5350\n1563#1:5351,2\n1563#1:5354\n1563#1:5355,26\n1563#1:5381\n1563#1:5383\n1567#1:5384,2\n1567#1:5387\n1567#1:5388,26\n1567#1:5414\n1567#1:5416\n1568#1:5417,26\n1573#1:5443,2\n1573#1:5446\n1573#1:5447,26\n1573#1:5473\n1573#1:5475\n1577#1:5476,2\n1577#1:5479\n1577#1:5480,26\n1577#1:5506\n1577#1:5508\n1582#1:5509,2\n1582#1:5512\n1582#1:5513,26\n1582#1:5539\n1582#1:5541\n1590#1:5542,2\n1590#1:5545\n1590#1:5546,26\n1590#1:5572\n1590#1:5574\n1597#1:5575,2\n1597#1:5578\n1597#1:5579,26\n1597#1:5605\n1597#1:5607\n1601#1:5608,2\n1601#1:5611\n1601#1:5612,26\n1601#1:5638\n1601#1:5640\n1605#1:5641,2\n1605#1:5644\n1605#1:5645,26\n1605#1:5671\n1605#1:5673\n1616#1:5674,2\n1616#1:5677\n1616#1:5678,26\n1616#1:5704\n1616#1:5706\n1641#1:5707,2\n1641#1:5710\n1641#1:5711,26\n1641#1:5737\n1641#1:5739\n1656#1:5740,2\n1656#1:5743\n1656#1:5744,26\n1656#1:5770\n1656#1:5772\n1665#1:5773,2\n1665#1:5776\n1665#1:5777,26\n1665#1:5803\n1665#1:5805\n1673#1:5806,2\n1673#1:5809\n1673#1:5810,26\n1673#1:5836\n1673#1:5838\n1683#1:5839,2\n1683#1:5842\n1683#1:5843,26\n1683#1:5869\n1683#1:5871\n1692#1:5872,2\n1692#1:5875\n1692#1:5876,26\n1692#1:5902\n1692#1:5904\n1703#1:5905,2\n1703#1:5908\n1703#1:5909,26\n1703#1:5935\n1703#1:5937\n1714#1:5938,2\n1714#1:5941\n1714#1:5942,26\n1714#1:5968\n1714#1:5970\n1728#1:5971,2\n1728#1:5974\n1728#1:5975,26\n1728#1:6001\n1728#1:6003\n1732#1:6004,2\n1732#1:6007\n1732#1:6008,26\n1732#1:6034\n1732#1:6036\n1736#1:6037,2\n1736#1:6040\n1736#1:6041,26\n1736#1:6067\n1736#1:6069\n1740#1:6070,2\n1740#1:6073\n1740#1:6074,26\n1740#1:6100\n1740#1:6102\n1745#1:6103,2\n1745#1:6106\n1745#1:6107,26\n1745#1:6133\n1745#1:6135\n1749#1:6136,2\n1749#1:6139\n1749#1:6140,26\n1749#1:6166\n1749#1:6168\n1753#1:6169,2\n1753#1:6172\n1753#1:6173,26\n1753#1:6199\n1753#1:6201\n1757#1:6202,2\n1757#1:6205\n1757#1:6206,26\n1757#1:6232\n1757#1:6234\n1764#1:6235,2\n1764#1:6238\n1764#1:6239,26\n1764#1:6265\n1764#1:6267\n1776#1:6268,2\n1776#1:6271\n1776#1:6272,26\n1776#1:6298\n1776#1:6300\n1779#1:6301,2\n1779#1:6304\n1779#1:6305,26\n1779#1:6331\n1779#1:6333\n1787#1:6334,2\n1787#1:6337\n1787#1:6338,26\n1787#1:6364\n1787#1:6366\n1791#1:6367,2\n1791#1:6370\n1791#1:6371,26\n1791#1:6397\n1791#1:6399\n1799#1:6400,2\n1799#1:6403\n1799#1:6404,26\n1799#1:6430\n1799#1:6432\n1808#1:6433,2\n1808#1:6436\n1808#1:6437,26\n1808#1:6463\n1808#1:6465\n1832#1:6470,2\n1832#1:6473\n1832#1:6474,26\n1832#1:6500\n1832#1:6502\n1857#1:6507,2\n1857#1:6510\n1857#1:6511,26\n1857#1:6537\n1857#1:6539\n1866#1:6540,2\n1866#1:6543\n1866#1:6544,26\n1866#1:6570\n1866#1:6572\n1904#1:6573,2\n1904#1:6576\n1904#1:6577,26\n1904#1:6603\n1904#1:6605\n1908#1:6606,2\n1908#1:6609\n1908#1:6610,26\n1908#1:6636\n1908#1:6638\n1914#1:6639,2\n1914#1:6642\n1914#1:6643,26\n1914#1:6669\n1914#1:6671\n1921#1:6672,2\n1921#1:6675\n1921#1:6676,26\n1921#1:6702\n1921#1:6704\n1927#1:6705,2\n1927#1:6708\n1927#1:6709,26\n1927#1:6735\n1927#1:6737\n1931#1:6738,2\n1931#1:6741\n1931#1:6742,26\n1931#1:6768\n1931#1:6770\n1939#1:6775,2\n1939#1:6778\n1939#1:6779,26\n1939#1:6805\n1939#1:6807\n1948#1:6808,2\n1948#1:6811\n1948#1:6812,26\n1948#1:6838\n1948#1:6840\n1955#1:6841,2\n1955#1:6844\n1955#1:6845,26\n1955#1:6871\n1955#1:6873\n1962#1:6874,2\n1962#1:6877\n1962#1:6878,26\n1962#1:6904\n1962#1:6906\n1969#1:6907,2\n1969#1:6910\n1969#1:6911,26\n1969#1:6937\n1969#1:6939\n1984#1:6940,2\n1984#1:6943\n1984#1:6944,26\n1984#1:6970\n1984#1:6972\n2001#1:6973,2\n2001#1:6976\n2001#1:6977,26\n2001#1:7003\n2001#1:7005\n2011#1:7006,2\n2011#1:7009\n2011#1:7010,26\n2011#1:7036\n2011#1:7038\n2018#1:7039,2\n2018#1:7042\n2018#1:7043,26\n2018#1:7069\n2018#1:7071\n2022#1:7072,2\n2022#1:7075\n2022#1:7076,26\n2022#1:7102\n2022#1:7104\n2029#1:7105,2\n2029#1:7108\n2029#1:7109,26\n2029#1:7135\n2029#1:7137\n2038#1:7138,2\n2038#1:7141\n2038#1:7142,26\n2038#1:7168\n2038#1:7170\n2047#1:7171,2\n2047#1:7174\n2047#1:7175,26\n2047#1:7201\n2047#1:7203\n2052#1:7204,2\n2052#1:7207\n2052#1:7208,26\n2052#1:7234\n2052#1:7236\n2060#1:7237,2\n2060#1:7240\n2060#1:7241,26\n2060#1:7267\n2060#1:7269\n2064#1:7270,2\n2064#1:7273\n2064#1:7274,26\n2064#1:7300\n2064#1:7302\n2071#1:7303,2\n2071#1:7306\n2071#1:7307,26\n2071#1:7333\n2071#1:7335\n2076#1:7336,2\n2076#1:7339\n2076#1:7340,26\n2076#1:7366\n2076#1:7368\n2095#1:7369,2\n2095#1:7372\n2095#1:7373,26\n2095#1:7399\n2095#1:7401\n2100#1:7402,2\n2100#1:7405\n2100#1:7406,26\n2100#1:7432\n2100#1:7434\n2107#1:7435,2\n2107#1:7438\n2107#1:7439,26\n2107#1:7465\n2107#1:7467\n2113#1:7468,2\n2113#1:7471\n2113#1:7472,26\n2113#1:7498\n2113#1:7500\n2117#1:7501,2\n2117#1:7504\n2117#1:7505,26\n2117#1:7531\n2117#1:7533\n2121#1:7534,2\n2121#1:7537\n2121#1:7538,26\n2121#1:7564\n2121#1:7566\n2125#1:7567,2\n2125#1:7570\n2125#1:7571,26\n2125#1:7597\n2125#1:7599\n2129#1:7600,2\n2129#1:7603\n2129#1:7604,26\n2129#1:7630\n2129#1:7632\n2140#1:7633,2\n2140#1:7636\n2140#1:7637,26\n2140#1:7663\n2140#1:7665\n2146#1:7666,2\n2146#1:7669\n2146#1:7670,26\n2146#1:7696\n2146#1:7698\n2150#1:7699,2\n2150#1:7702\n2150#1:7703,26\n2150#1:7729\n2150#1:7731\n2154#1:7732,2\n2154#1:7735\n2154#1:7736,26\n2154#1:7762\n2154#1:7764\n2162#1:7765,2\n2162#1:7768\n2162#1:7769,26\n2162#1:7795\n2162#1:7797\n2169#1:7798,2\n2169#1:7801\n2169#1:7802,26\n2169#1:7828\n2169#1:7830\n2173#1:7831,2\n2173#1:7834\n2173#1:7835,26\n2173#1:7861\n2173#1:7863\n2180#1:7864,2\n2180#1:7867\n2180#1:7868,26\n2180#1:7894\n2180#1:7896\n2187#1:7897,2\n2187#1:7900\n2187#1:7901,26\n2187#1:7927\n2187#1:7929\n2195#1:7930,2\n2195#1:7933\n2195#1:7934,26\n2195#1:7960\n2195#1:7962\n2199#1:7963,2\n2199#1:7966\n2199#1:7967,26\n2199#1:7993\n2199#1:7995\n2203#1:7996,2\n2203#1:7999\n2203#1:8000,26\n2203#1:8026\n2203#1:8028\n2207#1:8029,2\n2207#1:8032\n2207#1:8033,26\n2207#1:8059\n2207#1:8061\n2211#1:8062,2\n2211#1:8065\n2211#1:8066,26\n2211#1:8092\n2211#1:8094\n2217#1:8095,2\n2217#1:8098\n2217#1:8099,26\n2217#1:8125\n2217#1:8127\n2230#1:8128,2\n2230#1:8131\n2230#1:8132,26\n2230#1:8158\n2230#1:8160\n2236#1:8161,2\n2236#1:8164\n2236#1:8165,26\n2236#1:8191\n2236#1:8193\n2240#1:8194,2\n2240#1:8197\n2240#1:8198,26\n2240#1:8224\n2240#1:8226\n2248#1:8227,2\n2248#1:8230\n2248#1:8231,26\n2248#1:8257\n2248#1:8259\n2255#1:8260,2\n2255#1:8263\n2255#1:8264,26\n2255#1:8290\n2255#1:8292\n2261#1:8293,2\n2261#1:8296\n2261#1:8297,26\n2261#1:8323\n2261#1:8325\n2276#1:8326,2\n2276#1:8329\n2276#1:8330,26\n2276#1:8356\n2276#1:8358\n2290#1:8359,2\n2290#1:8362\n2290#1:8363,26\n2290#1:8389\n2290#1:8391\n2294#1:8392,2\n2294#1:8395\n2294#1:8396,26\n2294#1:8422\n2294#1:8424\n2298#1:8425,2\n2298#1:8428\n2298#1:8429,26\n2298#1:8455\n2298#1:8457\n2305#1:8458,2\n2305#1:8461\n2305#1:8462,26\n2305#1:8488\n2305#1:8490\n2315#1:8491,2\n2315#1:8494\n2315#1:8495,26\n2315#1:8521\n2315#1:8523\n2322#1:8524,2\n2322#1:8527\n2322#1:8528,26\n2322#1:8554\n2322#1:8556\n2337#1:8557,2\n2337#1:8560\n2337#1:8561,26\n2337#1:8587\n2337#1:8589\n2349#1:8590,2\n2349#1:8593\n2349#1:8594,26\n2349#1:8620\n2349#1:8622\n2357#1:8623,2\n2357#1:8626\n2357#1:8627,26\n2357#1:8653\n2357#1:8655\n2363#1:8656,2\n2363#1:8659\n2363#1:8660,26\n2363#1:8686\n2363#1:8688\n2385#1:8693,2\n2385#1:8696\n2385#1:8697,26\n2385#1:8723\n2385#1:8725\n2391#1:8726,2\n2391#1:8729\n2391#1:8730,26\n2391#1:8756\n2391#1:8758\n2401#1:8759,2\n2401#1:8762\n2401#1:8763,26\n2401#1:8789\n2401#1:8791\n2414#1:8792,2\n2414#1:8795\n2414#1:8796,26\n2414#1:8822\n2414#1:8824\n2427#1:8825,2\n2427#1:8828\n2427#1:8829,26\n2427#1:8855\n2427#1:8857\n2435#1:8858,2\n2435#1:8861\n2435#1:8862,26\n2435#1:8888\n2435#1:8890\n2441#1:8891,2\n2441#1:8894\n2441#1:8895,26\n2441#1:8921\n2441#1:8923\n2447#1:8924,2\n2447#1:8927\n2447#1:8928,26\n2447#1:8954\n2447#1:8956\n2453#1:8957,2\n2453#1:8960\n2453#1:8961,26\n2453#1:8987\n2453#1:8989\n2457#1:8990,2\n2457#1:8993\n2457#1:8994,26\n2457#1:9020\n2457#1:9022\n2463#1:9023,2\n2463#1:9026\n2463#1:9027,26\n2463#1:9053\n2463#1:9055\n2470#1:9056,2\n2470#1:9059\n2470#1:9060,26\n2470#1:9086\n2470#1:9088\n2476#1:9089,2\n2476#1:9092\n2476#1:9093,26\n2476#1:9119\n2476#1:9121\n2480#1:9122,2\n2480#1:9125\n2480#1:9126,26\n2480#1:9152\n2480#1:9154\n2486#1:9155,2\n2486#1:9158\n2486#1:9159,26\n2486#1:9185\n2486#1:9187\n2492#1:9188,2\n2492#1:9191\n2492#1:9192,26\n2492#1:9218\n2492#1:9220\n2499#1:9221,2\n2499#1:9224\n2499#1:9225,26\n2499#1:9251\n2499#1:9253\n2513#1:9254,2\n2513#1:9257\n2513#1:9258,26\n2513#1:9284\n2513#1:9286\n2518#1:9287,2\n2518#1:9290\n2518#1:9291,26\n2518#1:9317\n2518#1:9319\n2526#1:9320,2\n2526#1:9323\n2526#1:9324,26\n2526#1:9350\n2526#1:9352\n2548#1:9353,2\n2548#1:9356\n2548#1:9357,26\n2548#1:9383\n2548#1:9385\n2563#1:9386,2\n2563#1:9389\n2563#1:9390,26\n2563#1:9416\n2563#1:9418\n2570#1:9419,2\n2570#1:9422\n2570#1:9423,26\n2570#1:9449\n2570#1:9451\n2576#1:9452,2\n2576#1:9455\n2576#1:9456,26\n2576#1:9482\n2576#1:9484\n2591#1:9485,2\n2591#1:9488\n2591#1:9489,26\n2591#1:9515\n2591#1:9517\n2602#1:9518,2\n2602#1:9521\n2602#1:9522,26\n2602#1:9548\n2602#1:9550\n2606#1:9551,2\n2606#1:9554\n2606#1:9555,26\n2606#1:9581\n2606#1:9583\n2611#1:9584,2\n2611#1:9587\n2611#1:9588,26\n2611#1:9614\n2611#1:9616\n2619#1:9617,2\n2619#1:9620\n2619#1:9621,26\n2619#1:9647\n2619#1:9649\n2627#1:9650,2\n2627#1:9653\n2627#1:9654,26\n2627#1:9680\n2627#1:9682\n2636#1:9683,2\n2636#1:9686\n2636#1:9687,26\n2636#1:9713\n2636#1:9715\n2644#1:9716,2\n2644#1:9719\n2644#1:9720,26\n2644#1:9746\n2644#1:9748\n2658#1:9749,2\n2658#1:9752\n2658#1:9753,26\n2658#1:9779\n2658#1:9781\n2672#1:9782,2\n2672#1:9785\n2672#1:9786,26\n2672#1:9812\n2672#1:9814\n2678#1:9815,2\n2678#1:9818\n2678#1:9819,26\n2678#1:9845\n2678#1:9847\n2688#1:9848,2\n2688#1:9851\n2688#1:9852,26\n2688#1:9878\n2688#1:9880\n2696#1:9881,2\n2696#1:9884\n2696#1:9885,26\n2696#1:9911\n2696#1:9913\n2704#1:9914,2\n2704#1:9917\n2704#1:9918,26\n2704#1:9944\n2704#1:9946\n2711#1:9947,2\n2711#1:9950\n2711#1:9951,26\n2711#1:9977\n2711#1:9979\n2723#1:9980,2\n2723#1:9983\n2723#1:9984,26\n2723#1:10010\n2723#1:10012\n2732#1:10013,2\n2732#1:10016\n2732#1:10017,26\n2732#1:10043\n2732#1:10045\n2742#1:10046,2\n2742#1:10049\n2742#1:10050,26\n2742#1:10076\n2742#1:10078\n2757#1:10079,2\n2757#1:10082\n2757#1:10083,26\n2757#1:10109\n2757#1:10111\n2767#1:10112,2\n2767#1:10115\n2767#1:10116,26\n2767#1:10142\n2767#1:10144\n2776#1:10145,2\n2776#1:10148\n2776#1:10149,26\n2776#1:10175\n2776#1:10177\n2783#1:10178,2\n2783#1:10181\n2783#1:10182,26\n2783#1:10208\n2783#1:10210\n2795#1:10211,2\n2795#1:10214\n2795#1:10215,26\n2795#1:10241\n2795#1:10243\n2808#1:10244,2\n2808#1:10247\n2808#1:10248,26\n2808#1:10274\n2808#1:10276\n2817#1:10277,2\n2817#1:10280\n2817#1:10281,26\n2817#1:10307\n2817#1:10309\n2823#1:10310,2\n2823#1:10313\n2823#1:10314,26\n2823#1:10340\n2823#1:10342\n2831#1:10343,2\n2831#1:10346\n2831#1:10347,26\n2831#1:10373\n2831#1:10375\n2838#1:10376,2\n2838#1:10379\n2838#1:10380,26\n2838#1:10406\n2838#1:10408\n2844#1:10409,2\n2844#1:10412\n2844#1:10413,26\n2844#1:10439\n2844#1:10441\n2851#1:10442,2\n2851#1:10445\n2851#1:10446,26\n2851#1:10472\n2851#1:10474\n2868#1:10475,2\n2868#1:10478\n2868#1:10479,26\n2868#1:10505\n2868#1:10507\n2884#1:10508,2\n2884#1:10511\n2884#1:10512,26\n2884#1:10538\n2884#1:10540\n2896#1:10541,2\n2896#1:10544\n2896#1:10545,26\n2896#1:10571\n2896#1:10573\n2911#1:10574,2\n2911#1:10577\n2911#1:10578,26\n2911#1:10604\n2911#1:10606\n2915#1:10607,2\n2915#1:10610\n2915#1:10611,26\n2915#1:10637\n2915#1:10639\n2923#1:10640,2\n2923#1:10643\n2923#1:10644,26\n2923#1:10670\n2923#1:10672\n2935#1:10673,2\n2935#1:10676\n2935#1:10677,26\n2935#1:10703\n2935#1:10705\n416#1:3008\n416#1:3037\n422#1:3041\n422#1:3070\n428#1:3074\n428#1:3103\n434#1:3107\n434#1:3136\n442#1:3140\n442#1:3169\n454#1:3173\n454#1:3202\n468#1:3206\n468#1:3235\n477#1:3239\n477#1:3268\n488#1:3272\n488#1:3301\n540#1:3307\n540#1:3336\n546#1:3340\n546#1:3369\n592#1:3373\n592#1:3402\n599#1:3406\n599#1:3435\n607#1:3439\n607#1:3468\n620#1:3472\n620#1:3501\n635#1:3505\n635#1:3534\n645#1:3538\n645#1:3567\n650#1:3571\n650#1:3600\n655#1:3604\n655#1:3633\n674#1:3637\n674#1:3666\n682#1:3670\n682#1:3699\n720#1:3703\n720#1:3732\n737#1:3736\n737#1:3765\n753#1:3769\n753#1:3798\n763#1:3802\n763#1:3831\n768#1:3835\n768#1:3864\n775#1:3868\n775#1:3897\n792#1:3901\n792#1:3930\n806#1:3934\n806#1:3963\n823#1:3967\n823#1:3996\n847#1:4000\n847#1:4029\n899#1:4033\n899#1:4062\n910#1:4066\n910#1:4095\n916#1:4099\n916#1:4128\n931#1:4132\n931#1:4161\n1086#1:4165\n1086#1:4194\n1088#1:4198\n1088#1:4227\n1092#1:4231\n1092#1:4260\n1100#1:4264\n1100#1:4293\n1109#1:4297\n1109#1:4326\n1155#1:4330\n1155#1:4359\n1167#1:4363\n1167#1:4392\n1173#1:4396\n1173#1:4425\n1181#1:4429\n1181#1:4458\n1188#1:4462\n1188#1:4491\n1228#1:4495\n1228#1:4524\n1238#1:4528\n1238#1:4557\n1291#1:4561\n1291#1:4590\n1297#1:4594\n1297#1:4623\n1310#1:4627\n1310#1:4656\n1315#1:4660\n1315#1:4689\n1322#1:4693\n1322#1:4722\n1371#1:4726\n1371#1:4755\n1380#1:4759\n1380#1:4788\n1410#1:4792\n1410#1:4821\n1416#1:4825\n1416#1:4854\n1418#1:4858\n1418#1:4887\n1423#1:4891\n1423#1:4920\n1464#1:4924\n1464#1:4953\n1473#1:4957\n1473#1:4986\n1481#1:4990\n1481#1:5019\n1488#1:5023\n1488#1:5052\n1496#1:5056\n1496#1:5085\n1506#1:5089\n1506#1:5118\n1516#1:5122\n1516#1:5151\n1527#1:5155\n1527#1:5184\n1531#1:5188\n1531#1:5217\n1535#1:5221\n1535#1:5250\n1540#1:5254\n1540#1:5283\n1546#1:5287\n1546#1:5316\n1559#1:5320\n1559#1:5349\n1563#1:5353\n1563#1:5382\n1567#1:5386\n1567#1:5415\n1573#1:5445\n1573#1:5474\n1577#1:5478\n1577#1:5507\n1582#1:5511\n1582#1:5540\n1590#1:5544\n1590#1:5573\n1597#1:5577\n1597#1:5606\n1601#1:5610\n1601#1:5639\n1605#1:5643\n1605#1:5672\n1616#1:5676\n1616#1:5705\n1641#1:5709\n1641#1:5738\n1656#1:5742\n1656#1:5771\n1665#1:5775\n1665#1:5804\n1673#1:5808\n1673#1:5837\n1683#1:5841\n1683#1:5870\n1692#1:5874\n1692#1:5903\n1703#1:5907\n1703#1:5936\n1714#1:5940\n1714#1:5969\n1728#1:5973\n1728#1:6002\n1732#1:6006\n1732#1:6035\n1736#1:6039\n1736#1:6068\n1740#1:6072\n1740#1:6101\n1745#1:6105\n1745#1:6134\n1749#1:6138\n1749#1:6167\n1753#1:6171\n1753#1:6200\n1757#1:6204\n1757#1:6233\n1764#1:6237\n1764#1:6266\n1776#1:6270\n1776#1:6299\n1779#1:6303\n1779#1:6332\n1787#1:6336\n1787#1:6365\n1791#1:6369\n1791#1:6398\n1799#1:6402\n1799#1:6431\n1808#1:6435\n1808#1:6464\n1832#1:6472\n1832#1:6501\n1857#1:6509\n1857#1:6538\n1866#1:6542\n1866#1:6571\n1904#1:6575\n1904#1:6604\n1908#1:6608\n1908#1:6637\n1914#1:6641\n1914#1:6670\n1921#1:6674\n1921#1:6703\n1927#1:6707\n1927#1:6736\n1931#1:6740\n1931#1:6769\n1939#1:6777\n1939#1:6806\n1948#1:6810\n1948#1:6839\n1955#1:6843\n1955#1:6872\n1962#1:6876\n1962#1:6905\n1969#1:6909\n1969#1:6938\n1984#1:6942\n1984#1:6971\n2001#1:6975\n2001#1:7004\n2011#1:7008\n2011#1:7037\n2018#1:7041\n2018#1:7070\n2022#1:7074\n2022#1:7103\n2029#1:7107\n2029#1:7136\n2038#1:7140\n2038#1:7169\n2047#1:7173\n2047#1:7202\n2052#1:7206\n2052#1:7235\n2060#1:7239\n2060#1:7268\n2064#1:7272\n2064#1:7301\n2071#1:7305\n2071#1:7334\n2076#1:7338\n2076#1:7367\n2095#1:7371\n2095#1:7400\n2100#1:7404\n2100#1:7433\n2107#1:7437\n2107#1:7466\n2113#1:7470\n2113#1:7499\n2117#1:7503\n2117#1:7532\n2121#1:7536\n2121#1:7565\n2125#1:7569\n2125#1:7598\n2129#1:7602\n2129#1:7631\n2140#1:7635\n2140#1:7664\n2146#1:7668\n2146#1:7697\n2150#1:7701\n2150#1:7730\n2154#1:7734\n2154#1:7763\n2162#1:7767\n2162#1:7796\n2169#1:7800\n2169#1:7829\n2173#1:7833\n2173#1:7862\n2180#1:7866\n2180#1:7895\n2187#1:7899\n2187#1:7928\n2195#1:7932\n2195#1:7961\n2199#1:7965\n2199#1:7994\n2203#1:7998\n2203#1:8027\n2207#1:8031\n2207#1:8060\n2211#1:8064\n2211#1:8093\n2217#1:8097\n2217#1:8126\n2230#1:8130\n2230#1:8159\n2236#1:8163\n2236#1:8192\n2240#1:8196\n2240#1:8225\n2248#1:8229\n2248#1:8258\n2255#1:8262\n2255#1:8291\n2261#1:8295\n2261#1:8324\n2276#1:8328\n2276#1:8357\n2290#1:8361\n2290#1:8390\n2294#1:8394\n2294#1:8423\n2298#1:8427\n2298#1:8456\n2305#1:8460\n2305#1:8489\n2315#1:8493\n2315#1:8522\n2322#1:8526\n2322#1:8555\n2337#1:8559\n2337#1:8588\n2349#1:8592\n2349#1:8621\n2357#1:8625\n2357#1:8654\n2363#1:8658\n2363#1:8687\n2385#1:8695\n2385#1:8724\n2391#1:8728\n2391#1:8757\n2401#1:8761\n2401#1:8790\n2414#1:8794\n2414#1:8823\n2427#1:8827\n2427#1:8856\n2435#1:8860\n2435#1:8889\n2441#1:8893\n2441#1:8922\n2447#1:8926\n2447#1:8955\n2453#1:8959\n2453#1:8988\n2457#1:8992\n2457#1:9021\n2463#1:9025\n2463#1:9054\n2470#1:9058\n2470#1:9087\n2476#1:9091\n2476#1:9120\n2480#1:9124\n2480#1:9153\n2486#1:9157\n2486#1:9186\n2492#1:9190\n2492#1:9219\n2499#1:9223\n2499#1:9252\n2513#1:9256\n2513#1:9285\n2518#1:9289\n2518#1:9318\n2526#1:9322\n2526#1:9351\n2548#1:9355\n2548#1:9384\n2563#1:9388\n2563#1:9417\n2570#1:9421\n2570#1:9450\n2576#1:9454\n2576#1:9483\n2591#1:9487\n2591#1:9516\n2602#1:9520\n2602#1:9549\n2606#1:9553\n2606#1:9582\n2611#1:9586\n2611#1:9615\n2619#1:9619\n2619#1:9648\n2627#1:9652\n2627#1:9681\n2636#1:9685\n2636#1:9714\n2644#1:9718\n2644#1:9747\n2658#1:9751\n2658#1:9780\n2672#1:9784\n2672#1:9813\n2678#1:9817\n2678#1:9846\n2688#1:9850\n2688#1:9879\n2696#1:9883\n2696#1:9912\n2704#1:9916\n2704#1:9945\n2711#1:9949\n2711#1:9978\n2723#1:9982\n2723#1:10011\n2732#1:10015\n2732#1:10044\n2742#1:10048\n2742#1:10077\n2757#1:10081\n2757#1:10110\n2767#1:10114\n2767#1:10143\n2776#1:10147\n2776#1:10176\n2783#1:10180\n2783#1:10209\n2795#1:10213\n2795#1:10242\n2808#1:10246\n2808#1:10275\n2817#1:10279\n2817#1:10308\n2823#1:10312\n2823#1:10341\n2831#1:10345\n2831#1:10374\n2838#1:10378\n2838#1:10407\n2844#1:10411\n2844#1:10440\n2851#1:10444\n2851#1:10473\n2868#1:10477\n2868#1:10506\n2884#1:10510\n2884#1:10539\n2896#1:10543\n2896#1:10572\n2911#1:10576\n2911#1:10605\n2915#1:10609\n2915#1:10638\n2923#1:10642\n2923#1:10671\n2935#1:10675\n2935#1:10704\n532#1:3303,2\n2955#1:10706,2\n1834#1:6466\n1834#1:6467,3\n1858#1:6503\n1858#1:6504,3\n1938#1:6771\n1938#1:6772,3\n2373#1:8689\n2373#1:8690,3\n*E\n"})
/* renamed from: h13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41878h13 implements InterfaceC40099e13 {

    /* renamed from: h */
    public static final C22541a f84623h = new C22541a(null);

    /* renamed from: i */
    public static final int f84624i = 8;

    /* renamed from: j */
    public static final List<Long> f84625j;

    /* renamed from: a */
    public final C22454gl f84626a;

    /* renamed from: b */
    public final InterfaceC1880Ea f84627b;

    /* renamed from: c */
    public final C36207Tq4 f84628c;

    /* renamed from: d */
    public final InterfaceC6097Oh f84629d;

    /* renamed from: e */
    public final Context f84630e;

    /* renamed from: f */
    public WeakReference<Activity> f84631f;

    /* renamed from: g */
    public final Handler f84632g;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013"}, m28432d2 = {"Lh13$a;", "", "", "ACCESSIBILITY_RENTALS_ZENDESK_CATORY", "J", "ACCOUNT_ZENDESK_CATEGORY", "ANYTHING_ELSE_ZENDESK_CATEGORY", "MECHANIC_ZENDESK_CATEGORY", "MORE_QUESTIONS_ZENDESK_CATEGORY", "PAYMENT_ZENDESK_CATEGORY", "PERSONAL_RENTALS_ZENDESK_CATEGORY", "", "PREFIX_COORDINATE", "Ljava/lang/String;", "PREFIX_GOOGLE_NAVIGATE", "RIDES_ZENDESK_CATEGORY", "ZIG_ZAG_PACKAGE_NAME", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: h13$a */
    /* loaded from: classes2.dex */
    public static final class C22541a {
        public /* synthetic */ C22541a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22541a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: h13$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22542b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"h13$c", "", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: h13$c */
    /* loaded from: classes2.dex */
    public static final class C22543c {
    }

    static {
        List<Long> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{360001968851L, 360001964332L, 360001964632L, 360001972471L, 360001972531L, 360001964832L, 360001972651L});
        f84625j = listOf;
    }

    public C41878h13(C22454gl preference, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC6097Oh buildConfig, Context appContext) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f84626a = preference;
        this.f84627b = analyticsManager;
        this.f84628c = reactiveConfig;
        this.f84629d = buildConfig;
        this.f84630e = appContext;
        this.f84632g = new Handler(Looper.getMainLooper());
    }

    /* renamed from: G4 */
    public static /* synthetic */ Activity m37163G4(C41878h13 c41878h13, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                new C22543c();
                Method enclosingMethod = C22543c.class.getEnclosingMethod();
                str = enclosingMethod != null ? enclosingMethod.getName() : null;
            }
            return c41878h13.m37169F4(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActivityForResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J4 */
    public static /* synthetic */ RequestConfiguration.Builder m37145J4(C41878h13 c41878h13, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            return c41878h13.m37151I4(list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestActivityBuilder");
    }

    /* renamed from: L4 */
    public static /* synthetic */ void m37133L4(C41878h13 c41878h13, MapMode mapMode, InterfaceC40057dx0 interfaceC40057dx0, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToHelpInternal");
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        c41878h13.m37139K4(mapMode, interfaceC40057dx0, str, z);
    }

    /* renamed from: P4 */
    public static final void m37109P4(Intent intent, C41878h13 this$0) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        intent.setFlags(268468224);
        this$0.m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: A */
    public void mo37204A(Integer num, boolean z) {
        boolean z2;
        PaymentActivity.C14000a c14000a = PaymentActivity.f61948F;
        Context m37157H4 = m37157H4();
        if (num != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Intent m60197a = c14000a.m60197a(m37157H4, z2);
        m60197a.putExtra("co.bird.android.set_paypal_default", z);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(m60197a, num.intValue());
            return;
        }
        m37157H4().startActivity(m60197a);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: A0 */
    public void mo37203A0(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("sku_order_id", skuOrderId)};
        Intent intent = new Intent(m37163G4, SkuOrderVehiclesActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: A1 */
    public void mo37202A1(String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("notification_id", notificationId)};
        Intent intent = new Intent(m37157H42, NotificationDetailsActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: A2 */
    public void mo37201A2(PurchasePaymentReason purchasePaymentReason, int i, long j, String currency, PaymentAddSource source) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(source, "source");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = new Pair[4];
        if (purchasePaymentReason == null) {
            purchasePaymentReason = PurchasePaymentReason.PAYMENT;
        }
        pairArr[0] = TuplesKt.m28425to("purchase_payment_reason", purchasePaymentReason);
        pairArr[1] = TuplesKt.m28425to("transaction_amount", Long.valueOf(j));
        pairArr[2] = TuplesKt.m28425to("transaction_currency", currency);
        pairArr[3] = TuplesKt.m28425to("payment_add_source", source);
        Intent intent = new Intent(m37163G4, PurchasePaymentActivity.class);
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: A3 */
    public void mo37200A3(String birdId, List<WirePhysicalLockReplacementType> lockTypes) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(lockTypes, "lockTypes");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird_id", birdId), TuplesKt.m28425to("physical_lock_types", lockTypes)};
        Intent intent = new Intent(m37163G4, ChoosePhysicalLockTypeActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, C30906z6.m1823a(Reflection.getOrCreateKotlinClass(ChoosePhysicalLockTypeActivity.class)));
        m37163G4.overridePendingTransition(C39882df4.slide_right, C39882df4.slide_left);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: A4 */
    public void mo37199A4(BulkScanPurpose purpose, WireBatch batch, OpsBatchJobActionKind actionKind, int i, String sessionId) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(batch, "batch");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bulk_purpose", purpose), TuplesKt.m28425to("batch", batch), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, sessionId)};
        Intent intent = new Intent(m37157H4, BulkStatusReportActivity.class);
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        intent.putExtra("ops_batch_job_action_kind", actionKind);
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: B */
    public void mo37198B() {
        m37157H4().startActivity(new Intent(m37157H4(), BirdAirScanActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: B0 */
    public void mo37197B0(WireBird bird, WorkOrder workOrder, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("work_order", workOrder), TuplesKt.m28425to("return_added_issues", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H4, WorkOrderInspectionActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        if (z) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, 10019);
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: B1 */
    public void mo37196B1(WireBird bird, MechanicPhotoMode mode, String id, Location location, ArrayList<BirdInspectionPoint> points, ArrayList<BirdInspectionPoint> arrayList) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(points, "points");
        m37157H4().startActivity(MechanicPhotoActivity.f61493D.m60619a(m37157H4(), mode, bird, id, location, points, arrayList));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_right, C39882df4.slide_left);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: B2 */
    public void mo37195B2(BulkScanPurpose purpose, OpsBatchJobActionKind actionKind, int i, String sessionId, String str) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bulk_purpose", purpose), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, sessionId), TuplesKt.m28425to("co.bird.android.ops_batch_job_trip_stop_id", str)};
        Intent intent = new Intent(m37157H4, BulkStatusReportActivity.class);
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        intent.putExtra("ops_batch_job_action_kind", actionKind);
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: B3 */
    public void mo37194B3(String birdId, String taskId, boolean z, MapMode mapMode) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird_id", birdId), TuplesKt.m28425to("task_id", taskId), TuplesKt.m28425to("physical_lock_unlocking", Boolean.valueOf(z)), TuplesKt.m28425to("map_mode", mapMode)};
        Intent intent = new Intent(m37157H4, DamageFeedbackActivity.class);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4().startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: B4 */
    public void mo37193B4(int i) {
        Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: C */
    public void mo37192C() {
        try {
            m37157H4().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            mo37013h2(SystemSettingsReason.LOCATION_SERVICES);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: C0 */
    public void mo37191C0(String receiptId, String str, Integer num) {
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("co.bird.android.id", receiptId), TuplesKt.m28425to("title", str)};
        Intent intent = new Intent(m37157H4, TransactionReceiptActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, num.intValue());
                return;
            }
            return;
        }
        m37157H4().startActivity(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3 == null) goto L10;
     */
    @Override // p000.InterfaceC40099e13
    /* renamed from: C1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37190C1(int i, Intent intent) {
        Unit unit;
        if (intent != null) {
            Activity m37175E4 = m37175E4();
            if (m37175E4 != null) {
                m37175E4.setResult(i, intent);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        Activity m37175E42 = m37175E4();
        if (m37175E42 != null) {
            m37175E42.setResult(i);
            Unit unit2 = Unit.INSTANCE;
        }
        mo37030e3();
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: C2 */
    public void mo37189C2() {
        Intent intent = new Intent(m37157H4(), MagicLinkIntroActivity.class);
        intent.setFlags(65536);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(0, 0);
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: C3 */
    public void mo37188C3(List<? extends BirdModel> list, PartKind partKind) {
        int i;
        int collectionSizeOrDefault;
        if (partKind == null) {
            i = 10003;
        } else {
            i = 10004;
        }
        ArrayList arrayList = null;
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = new Pair[2];
        if (list != null) {
            List<? extends BirdModel> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (BirdModel birdModel : list2) {
                arrayList.add(birdModel.name());
            }
        }
        Pair m28425to = TuplesKt.m28425to("bird_model", arrayList);
        pairArr[0] = m28425to;
        pairArr[1] = TuplesKt.m28425to("part_kind", partKind);
        Intent intent = new Intent(m37163G4, EnterCodeActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    @Deprecated(message = "Use goToRideEndPhoto(physicalLockRequired = false)")
    /* renamed from: C4 */
    public void mo37187C4(WireRideDetail rideDetail) {
        Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
        m37157H4().startActivity(RidePhotoActivity.f62423I.m59544a(m37157H4(), rideDetail));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: D */
    public void mo37186D(WireBird bird, List<LegacyRepairType> checkedRepairTypes) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(checkedRepairTypes, "checkedRepairTypes");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("repair_options", checkedRepairTypes)};
        Intent intent = new Intent(m37163G4, RepairLoggerAddActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, C30906z6.m1823a(Reflection.getOrCreateKotlinClass(RepairLoggerAddActivity.class)));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: D0 */
    public void mo37185D0(ContractorOnboardStep contractorOnboardStep, Integer num) {
        Intent m60666a = DriverLicenseScanV2Activity.f61437D.m60666a(m37157H4(), contractorOnboardStep);
        Unit unit = null;
        if (num != null) {
            int intValue = num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(m60666a, intValue);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m37157H4().startActivity(m60666a);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: D1 */
    public void mo37184D1(WireRide ride, float f, Integer num) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intent m57492a = RideFeedbackActivity.f64686C.m57492a(m37157H4(), ride, f);
        Unit unit = null;
        if (num != null) {
            int intValue = num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(m57492a, intValue);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m37157H4().startActivity(m57492a);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: D2 */
    public void mo37183D2(int i) {
        try {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(C7241Rh.m86449a(this.f84629d))), i);
        } catch (ActivityNotFoundException unused) {
            Activity m37163G42 = m37163G4(this, null, 1, null);
            if (m37163G42 == null) {
                return;
            }
            m37163G42.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse(C7241Rh.m86448b(this.f84629d))), i);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: D3 */
    public void mo37182D3() {
        m37157H4().startActivity(new Intent(m37157H4(), PrivateBirdSmartlockUnlockActivity.class));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: E */
    public void mo37180E(MapMode mapMode, String article, boolean z) {
        boolean startsWith$default;
        String str;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        Intrinsics.checkNotNullParameter(article, "article");
        boolean z2 = false;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(article, "http", false, 2, null);
        if (startsWith$default) {
            str = article;
        } else {
            str = null;
        }
        longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(article);
        WebHelpCenterConfig webHelpCenter = this.f84628c.m82623f8().m73665a().getZendeskConfig().getWebHelpCenter();
        if (!((str == null || str.length() == 0) ? true : true)) {
            if (webHelpCenter.getLaunchInExternalBrowser()) {
                mo36983m2(str);
            } else {
                InterfaceC40099e13.C19924a.goToWebView$default(this, str, null, Integer.valueOf(C45871nl4.common_help), webHelpCenter.getEnabled(), 2, null);
            }
        } else if (longOrNull != null) {
            mo36922w3(longOrNull.longValue());
        } else {
            mo37003j0(mapMode, article, z);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: E0 */
    public void mo37179E0(PaymentMethod paymentMethod, String clientKey, String publishableKey, String str, int i) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("payment_method", paymentMethod), TuplesKt.m28425to("client_key", clientKey), TuplesKt.m28425to(AnalyticsFields.PUBLISHABLE_KEY, publishableKey), TuplesKt.m28425to("payment_info_bank_name", str)};
        Intent intent = new Intent(m37163G4, BankRedirectLaunchActivity.class);
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair = pairArr[i2];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: E1 */
    public void mo37178E1(WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("work_order", workOrder)};
        Intent intent = new Intent(m37157H42, SwipeQualityControlActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: E2 */
    public void mo37177E2() {
        m37157H4().startActivity(new Intent(m37157H4(), MerchantScanActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: E3 */
    public void mo37176E3(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, RepairV2Activity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    /* renamed from: E4 */
    public final Activity m37175E4() {
        Context m37157H4 = m37157H4();
        if (m37157H4 instanceof Activity) {
            return (Activity) m37157H4;
        }
        return null;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: F */
    public void mo37174F(WireRideDetail rideDetail, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_detail", rideDetail), TuplesKt.m28425to("ride_lock_photo_parking_warning", Boolean.valueOf(z)), TuplesKt.m28425to("has_physical_lock", Boolean.valueOf(z2)), TuplesKt.m28425to("ride_end_photo_required", Boolean.FALSE)};
        Intent intent = new Intent(m37157H42, RideEndPhotoActivity.class);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: F0 */
    public void mo37173F0(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, LongTermRentalSetupActivity.class), i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: F1 */
    public void mo37172F1(BirdPayOnboardingScreenViewedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird_pay_tutorial_presenter_source", source)};
        Intent intent = new Intent(m37157H42, BirdPayTutorialActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: F2 */
    public void mo37171F2() {
        m37157H4().startActivity(new Intent(m37157H4(), RepairsScanActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: F3 */
    public void mo37170F3(BulkScanPurpose purpose, WireBatch batch) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(batch, "batch");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bulk_purpose", purpose.name()), TuplesKt.m28425to("batch", batch)};
        Intent intent = new Intent(m37157H4, DefaultBulkScannerActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4().startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    /* renamed from: F4 */
    public final Activity m37169F4(String str) {
        Activity m37175E4 = m37175E4();
        if (m37175E4 == null) {
            if (str == null) {
                str = "unknown method";
            }
            C41318g46.m40160d("Attempted to start activity for result from " + str + " but no host activity available", new Object[0]);
            return null;
        }
        return m37175E4;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: G */
    public void mo37168G(List<String> tutorialIds, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
        Intent intent = new Intent(m37157H4(), ConfigurableTutorialsActivity.class);
        intent.putStringArrayListExtra("configurable_tutorial_id", C44691lm0.m26849a(tutorialIds));
        intent.putExtra("keep_unseen", z);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: G0 */
    public void mo37167G0(Issue issue, List<RepairType> issueRepairTypes, List<RepairTypeLock> selectedRepairs) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(issueRepairTypes, "issueRepairTypes");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("issue", issue), TuplesKt.m28425to("repairs", issueRepairTypes), TuplesKt.m28425to("previously_selected_repairs", selectedRepairs)};
        Intent intent = new Intent(m37163G4, RepairSelectionActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10011);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: G1 */
    public void mo37166G1(int i, boolean z, PaymentAddSource paymentAddSource) {
        Intent m59670a = EnterCardActivity.f62287D.m59670a(m37157H4(), z, paymentAddSource);
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(m59670a, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: G2 */
    public void mo37165G2() {
        m37157H4().startActivity(MultiModalRiderTutorialSelectionActivity.f62712C.m59418a(m37157H4()));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: G3 */
    public void mo37164G3(WireBird bird, VehicleScrapRequest vehicleScrapRequest) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("scrap_request", vehicleScrapRequest)};
        Intent intent = new Intent(m37157H42, ScrapActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: H */
    public void mo37162H(Geolocation destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        double latitude = destination.getLatitude();
        double longitude = destination.getLongitude();
        m37157H4().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + latitude + "," + longitude)));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: H0 */
    public void mo37161H0(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 != null) {
            m37163G4.startActivityForResult(new Intent(m37157H4(), VehicleInvolvedScanActivity.class), i);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: H1 */
    public void mo37160H1(String str) {
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("group_id", str)};
        Intent intent = new Intent(m37157H42, NotificationCenterActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        intent.addFlags(603979776);
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: H2 */
    public void mo37159H2(boolean z, GoOperatorMapDeeplinkParams goOperatorMapDeeplinkParams, List<? extends Point> list) {
        String bountyId;
        String birdCode;
        UserRoleItem m37579r0 = this.f84626a.m37579r0();
        if (m37579r0 != null) {
            this.f84626a.m37732F2(m37579r0);
        }
        this.f84626a.m37548z(MapMode.OPERATOR);
        if (goOperatorMapDeeplinkParams != null && (birdCode = goOperatorMapDeeplinkParams.getBirdCode()) != null) {
            this.f84626a.m37557w2(birdCode);
        }
        if (goOperatorMapDeeplinkParams != null && (bountyId = goOperatorMapDeeplinkParams.getBountyId()) != null) {
            this.f84626a.m37585p2(bountyId);
        }
        boolean z2 = false;
        if (goOperatorMapDeeplinkParams != null && goOperatorMapDeeplinkParams.getPromptBountyDesignationReaccept()) {
            z2 = true;
        }
        if (z2) {
            this.f84626a.m37554x1();
        }
        Intent intent = new Intent(m37157H4(), OperatorActivity.class);
        if (list != null) {
            intent.putExtra("zoom_include_region", (Serializable) list);
        }
        if (z) {
            m37115O4(new Intent(m37157H4(), MainActivity.class));
        } else {
            m37157H4().startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: H3 */
    public void mo37158H3() {
        m37157H4().startActivity(new Intent(m37157H4(), TransferOrderLandingActivity.class));
    }

    /* renamed from: H4 */
    public final Context m37157H4() {
        WeakReference<Activity> weakReference = this.f84631f;
        Activity activity = weakReference != null ? weakReference.get() : null;
        return activity == null ? this.f84630e : activity;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: I */
    public void mo37156I(String category, List<IssueType> categoryIssues, List<IssueTypeLock> selectedIssues) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(categoryIssues, "categoryIssues");
        Intrinsics.checkNotNullParameter(selectedIssues, "selectedIssues");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("category", category), TuplesKt.m28425to("issues", new ArrayList(categoryIssues)), TuplesKt.m28425to("selected_issues", new ArrayList(selectedIssues))};
        Intent intent = new Intent(m37163G4, LegacyWorkOrderIssuesActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10010);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: I0 */
    public void mo37155I0() {
        m37157H4().startActivity(new Intent(m37157H4(), HardCountLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: I1 */
    public void mo37154I1(WireRide ride, float f, Integer num) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Unit unit = null;
        if (num != null) {
            int intValue = num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            Pair[] pairArr = {TuplesKt.m28425to("ride", ride), TuplesKt.m28425to("rating", Float.valueOf(f))};
            Intent intent = new Intent(m37163G4, RideRatingActivity.class);
            int i = 0;
            for (int i2 = 2; i < i2; i2 = 2) {
                Pair pair = pairArr[i];
                String str = (String) pair.component1();
                Object component2 = pair.component2();
                Pair[] pairArr2 = pairArr;
                if (component2 instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
                } else if (component2 instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
                } else if (component2 instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
                } else if (component2 instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
                } else if (component2 instanceof Byte) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
                } else if (component2 instanceof Character) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
                } else if (component2 instanceof int[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof long[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof float[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof double[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof byte[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof char[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof String) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
                } else if (component2 instanceof Bundle) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
                } else if (component2 instanceof Parcelable) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
                } else if (component2 instanceof Enum) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
                } else if (component2 instanceof Serializable) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
                } else if (component2 instanceof CharSequence) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
                } else if (component2 != null) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                    throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
                }
                i++;
                pairArr = pairArr2;
            }
            m37163G4.startActivityForResult(intent, intValue);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Context m37157H4 = m37157H4();
            Context m37157H42 = m37157H4();
            Pair[] pairArr3 = {TuplesKt.m28425to("ride", ride), TuplesKt.m28425to("rating", Float.valueOf(f))};
            Intent intent2 = new Intent(m37157H42, RideRatingActivity.class);
            for (int i3 = 0; i3 < 2; i3++) {
                Pair pair2 = pairArr3[i3];
                String str2 = (String) pair2.component1();
                Object component22 = pair2.component2();
                if (component22 instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).intValue()), "putExtra(name, value)");
                } else if (component22 instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).longValue()), "putExtra(name, value)");
                } else if (component22 instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).floatValue()), "putExtra(name, value)");
                } else if (component22 instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).doubleValue()), "putExtra(name, value)");
                } else if (component22 instanceof Byte) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).byteValue()), "putExtra(name, value)");
                } else if (component22 instanceof Character) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Character) component22).charValue()), "putExtra(name, value)");
                } else if (component22 instanceof int[]) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) component22), "putExtra(name, value)");
                } else if (component22 instanceof long[]) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) component22), "putExtra(name, value)");
                } else if (component22 instanceof float[]) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) component22), "putExtra(name, value)");
                } else if (component22 instanceof double[]) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) component22), "putExtra(name, value)");
                } else if (component22 instanceof byte[]) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) component22), "putExtra(name, value)");
                } else if (component22 instanceof char[]) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) component22), "putExtra(name, value)");
                } else if (component22 instanceof String) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (String) component22), "putExtra(name, value)");
                } else if (component22 instanceof Bundle) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Bundle) component22), "putExtra(name, value)");
                } else if (component22 instanceof Parcelable) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Parcelable) component22), "putExtra(name, value)");
                } else if (component22 instanceof Enum) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Enum) component22).name()), "putExtra(name, value.name)");
                } else if (component22 instanceof Serializable) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Serializable) component22), "putExtra(name, value)");
                } else if (component22 instanceof CharSequence) {
                    Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (CharSequence) component22), "putExtra(name, value)");
                } else if (component22 != null) {
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
                    throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass2 + " is not supported.");
                }
            }
            m37157H4.startActivity(intent2);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: I2 */
    public void mo37153I2(String str) {
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_pass_link_code", str)};
        Intent intent = new Intent(m37157H42, RidePassV4Activity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: I3 */
    public void mo37152I3(WireServiceCenterStatus status, String str, String sessionId) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("service_center_status", status), TuplesKt.m28425to("notes", str), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, sessionId)};
        Intent intent = new Intent(m37163G4, BulkServiceCenterStatusReportActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10008);
    }

    /* renamed from: I4 */
    public final RequestConfiguration.Builder m37151I4(List<String> list) {
        String str;
        Contractor m37715K;
        List<String> mutableListOf;
        ContractorLevel contractorLevel;
        String name;
        String languageTag = Locale.getDefault().toLanguageTag();
        String[] strArr = new String[6];
        strArr[0] = "version_android:" + this.f84629d.mo89931a();
        String lowerCase = this.f84626a.m37571t0().name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        strArr[1] = "role:" + lowerCase;
        strArr[2] = "language:" + languageTag;
        String m37663X = this.f84626a.m37663X();
        String str2 = null;
        if (m37663X != null) {
            String lowerCase2 = m37663X.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase2 != null) {
                str = StringsKt__StringsJVMKt.replace$default(lowerCase2, " ", "_", false, 4, (Object) null);
                strArr[3] = "partner:" + str;
                strArr[4] = "app_name:" + this.f84629d.mo89926f();
                m37715K = this.f84626a.m37715K();
                if (m37715K != null && (contractorLevel = m37715K.getContractorLevel()) != null && (name = contractorLevel.name()) != null) {
                    str2 = name.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase()");
                }
                strArr[5] = "contractor_level:" + str2;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(strArr);
                mutableListOf.addAll(list);
                RequestConfiguration.Builder withTags = RequestActivity.builder().withTags(mutableListOf);
                Intrinsics.checkNotNullExpressionValue(withTags, "builder().withTags(tags)");
                return withTags;
            }
        }
        str = null;
        strArr[3] = "partner:" + str;
        strArr[4] = "app_name:" + this.f84629d.mo89926f();
        m37715K = this.f84626a.m37715K();
        if (m37715K != null) {
            str2 = name.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase()");
        }
        strArr[5] = "contractor_level:" + str2;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(strArr);
        mutableListOf.addAll(list);
        RequestConfiguration.Builder withTags2 = RequestActivity.builder().withTags(mutableListOf);
        Intrinsics.checkNotNullExpressionValue(withTags2, "builder().withTags(tags)");
        return withTags2;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: J */
    public void mo37150J(InterfaceC40099e13.EnumC19925b result, Pair<String, ?>... data) {
        boolean z;
        Intent intent;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            intent = X52.m77422c(new Intent(), (Pair[]) Arrays.copyOf(data, data.length));
        } else {
            intent = null;
        }
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.setResult(result.m43403b(), intent);
        }
        mo37030e3();
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: J0 */
    public void mo37149J0() {
        Context m37157H4 = m37157H4();
        m37157H4.startActivity(new Intent(m37157H4, ScrapLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: J1 */
    public void mo37148J1(String str, String str2, int i) {
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("nest_id", str), TuplesKt.m28425to("warehouse_id", str2)};
        Intent intent = new Intent(m37157H4, ReleaseScanActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str3 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 != null) {
            m37163G4.startActivityForResult(intent, i);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: J2 */
    public void mo37147J2() {
        m37157H4().startActivity(new Intent(m37157H4(), RideStartedTutorialsActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: J3 */
    public void mo37146J3(String rideId, WireEndRidePhotoParkingEvaluation evaluation) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(evaluation, "evaluation");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("parking_photo_evaluation", evaluation), TuplesKt.m28425to("ride_id", rideId)};
        Intent intent = new Intent(m37157H42, ParkingReviewActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: K */
    public void mo37144K(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", birdId)};
        Intent intent = new Intent(m37157H42, PastRepairsActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: K0 */
    public void mo37143K0(List<Pair<String, String>> images, int i) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(images, "images");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        LightboxActivity.C16039a c16039a = LightboxActivity.f66103C;
        List<Pair<String, String>> list = images;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new LightboxImage((String) pair.component1(), (String) pair.component2()));
        }
        m37163G4.startActivityForResult(c16039a.m56037a(m37163G4, C44691lm0.m26849a(arrayList), i), 10033);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: K1 */
    public void mo37142K1(List<BeginnerModeRiderMapAction> actions, String selectedAccelerationLevel, String activityLabel) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(selectedAccelerationLevel, "selectedAccelerationLevel");
        Intrinsics.checkNotNullParameter(activityLabel, "activityLabel");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("beginner_mode_actions", actions), TuplesKt.m28425to("selected_acceleration_level", selectedAccelerationLevel), TuplesKt.m28425to("ride_mode_activity_label", activityLabel)};
        Intent intent = new Intent(m37157H42, RideModeActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: K2 */
    public void mo37141K2(WireBird bird, int i, InaccessibleReportSource source) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(source, "source");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("co.bird.android.inaccessible_source", source)};
        Intent intent = new Intent(m37163G4, CannotAccessActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: K3 */
    public void mo37140K3(int i, int i2, long j, String currency, PaymentAddSource source) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(source, "source");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("activity_title_res_id", Integer.valueOf(i)), TuplesKt.m28425to("transaction_amount", Long.valueOf(j)), TuplesKt.m28425to("transaction_currency", currency), TuplesKt.m28425to("payment_add_source", source)};
        Intent intent = new Intent(m37163G4, PurchasePaymentActivity.class);
        for (int i3 = 0; i3 < 4; i3++) {
            Pair pair = pairArr[i3];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i2);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    /* renamed from: K4 */
    public final void m37139K4(MapMode mapMode, InterfaceC40057dx0 interfaceC40057dx0, String str, boolean z) {
        HelpCenterConfiguration.Builder builder = HelpCenterActivity.builder();
        if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "en")) {
            if (C22542b.$EnumSwitchMapping$0[mapMode.ordinal()] == 2) {
                if (str == null || builder.withArticlesForCategoryIds(Long.valueOf(Long.parseLong(str))) == null) {
                    builder.withArticlesForCategoryIds(360000579852L);
                }
            } else {
                builder.withArticlesForCategoryIds(f84625j);
            }
        }
        builder.withContactUsButtonVisible(z).show(m37157H4(), interfaceC40057dx0);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: L */
    public void mo37138L() {
        m37157H4().startActivity(new Intent(m37157H4(), PromotionsCenterActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: L0 */
    public void mo37137L0() {
        m37157H4().startActivity(TweaksActivity.f62824C.m59346a(m37157H4()));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: L1 */
    public void mo37136L1(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f84631f = new WeakReference<>(activity);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: L2 */
    public void mo37135L2(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, CommandCenterActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: L3 */
    public void mo37134L3(String skuOrderId, boolean z, boolean z2, boolean z3, String str, String str2) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("checked_in", Boolean.valueOf(z)), TuplesKt.m28425to("co.bird.android.transferorder.outbound", Boolean.valueOf(z2)), TuplesKt.m28425to("sku_order_id", skuOrderId), TuplesKt.m28425to("identifier_category", Boolean.valueOf(z3)), TuplesKt.m28425to("sku", str), TuplesKt.m28425to("activity_title", str2)};
        Intent intent = new Intent(m37157H42, SkuScannedDetailsActivity.class);
        for (int i = 0; i < 6; i++) {
            Pair pair = pairArr[i];
            String str3 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: M */
    public void mo37132M(WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("work_order", workOrder)};
        Intent intent = new Intent(m37157H42, ListQualityControlActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: M0 */
    public void mo37131M0(String skuOrderId, boolean z) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("sku_order_id", skuOrderId), TuplesKt.m28425to("co.bird.android.transferorder.outbound", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H42, SkuScannerActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: M1 */
    public void mo37130M1() {
        m37157H4().startActivity(new Intent(m37157H4(), AddToBatchActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: M2 */
    public void mo37129M2() {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        CropImage.m54220a().m54202d(CropImageView.EnumC16642c.OVAL).m54203c(1, 1).m54200f(500, 500).m54201e(2048, 2048).m54199g(m37163G4);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: M3 */
    public void mo37128M3(List<HardCountScan> list, List<String> list2, InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory) {
        int[] iArr;
        int collectionSizeOrDefault;
        if (list != null) {
            List<HardCountScan> list3 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (HardCountScan hardCountScan : list3) {
                arrayList.add(Integer.valueOf(hardCountScan.getId()));
            }
            iArr = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        } else {
            iArr = null;
        }
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("scan_ids", iArr), TuplesKt.m28425to("scan_identifiers", list2), TuplesKt.m28425to("identifier_category", inventoryScanningIdentifierCategory)};
        Intent intent = new Intent(m37157H42, HardCountDetailsActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    /* renamed from: M4 */
    public final Intent m37127M4(ResolveInfo resolveInfo, Intent intent, Location location) {
        String str;
        String str2 = location.getLatitude() + "," + location.getLongitude();
        boolean areEqual = Intrinsics.areEqual("com.google.android.apps.maps", resolveInfo.activityInfo.packageName);
        StringBuilder sb = new StringBuilder();
        if (areEqual) {
            str = "google.navigation:q=";
        } else {
            str = "geo:";
        }
        sb.append(str);
        sb.append(str2);
        Intent data = intent.setData(Uri.parse(sb.toString()));
        Intrinsics.checkNotNullExpressionValue(data, "navigateIntent.setData(Uri.parse(link.toString()))");
        return data;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: N */
    public void mo37126N(String rideId, boolean z) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        m37157H4().startActivity(RideDetailActivity.f62694E.m59456a(m37157H4(), rideId, z));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: N0 */
    public void mo37125N0(HealthStatus healthStatus) {
        Intrinsics.checkNotNullParameter(healthStatus, "healthStatus");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("health_status", healthStatus)};
        Intent intent = new Intent(m37157H42, InventoryPartSelectionActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: N1 */
    public void mo37124N1(String str) {
        Intent intent = new Intent(m37157H4(), WakeFlockProgressActivity.class);
        if (str != null) {
            if (str instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", ((Number) str).intValue()), "putExtra(name, value)");
            } else if (str instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", ((Number) str).longValue()), "putExtra(name, value)");
            } else if (str instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", ((Number) str).floatValue()), "putExtra(name, value)");
            } else if (str instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", ((Number) str).doubleValue()), "putExtra(name, value)");
            } else if (str instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", ((Number) str).byteValue()), "putExtra(name, value)");
            } else if (str instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", ((Character) str).charValue()), "putExtra(name, value)");
            } else if (str instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", (int[]) str), "putExtra(name, value)");
            } else if (str instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", (long[]) str), "putExtra(name, value)");
            } else if (str instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", (float[]) str), "putExtra(name, value)");
            } else if (str instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", (double[]) str), "putExtra(name, value)");
            } else if (str instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", (byte[]) str), "putExtra(name, value)");
            } else if (str instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", (char[]) str), "putExtra(name, value)");
            } else {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra("batch_id", str), "putExtra(name, value)");
            }
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: N2 */
    public void mo37123N2() {
        m37157H4().startActivity(new Intent(m37157H4(), BatchSearchActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: N3 */
    public void mo37122N3(ScanType scanType, String str, BirdAction birdAction, MapMode mode, ScanIntention scanIntention, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("scan_barcode", new ScanBarcodeExtra(scanType, str, birdAction, mode, scanIntention, z))};
        Intent intent = new Intent(m37157H4, BirdScanActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
        } else {
            m37157H4().startActivity(intent);
        }
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    /* renamed from: N4 */
    public final Intent m37121N4(Intent intent, Location location) {
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = m37157H4().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "context.packageManager.q…nager.MATCH_DEFAULT_ONLY)");
        for (ResolveInfo appInfo : queryIntentActivities) {
            Intent intent2 = new Intent("android.intent.action.VIEW").setPackage(appInfo.activityInfo.packageName);
            Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Intent.ACTION_VIEW).setPackage(packageName)");
            Intrinsics.checkNotNullExpressionValue(appInfo, "appInfo");
            arrayList.add(m37127M4(appInfo, intent2, location));
        }
        if (!arrayList.isEmpty()) {
            Intent putExtra = Intent.createChooser((Intent) arrayList.remove(0), m37157H4().getString(C45871nl4.navigator_intent_chooser_title)).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            Intrinsics.checkNotNullExpressionValue(putExtra, "{\n      Intent.createCho…rray<Parcelable>())\n    }");
            return putExtra;
        }
        Intent createChooser = Intent.createChooser(intent, m37157H4().getString(C45871nl4.navigator_intent_chooser_title));
        Intrinsics.checkNotNullExpressionValue(createChooser, "{\n      Intent.createCho…ent_chooser_title))\n    }");
        return createChooser;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: O */
    public void mo37120O() {
        m37157H4().startActivity(new Intent(m37157H4(), RepairLoggerScanActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: O0 */
    public void mo37119O0(VehiclePricingDetails vehiclePricingDetails, boolean z) {
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("vehicle_pricing_details", vehiclePricingDetails), TuplesKt.m28425to("vehicle_pricing_from_scan", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H42, VehiclePricingActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: O1 */
    public void mo37118O1(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(PaymentMethodActivity.f62291C.m59668a(m37163G4), i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: O2 */
    public void mo37117O2(WireBird wireBird, boolean z) {
        if (z) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            Pair[] pairArr = {TuplesKt.m28425to("bird", wireBird)};
            Intent intent = new Intent(m37163G4, IdToolsLandingActivity.class);
            Pair pair = pairArr[0];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
            m37163G4.startActivityForResult(intent, 10024);
            return;
        }
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr2 = {TuplesKt.m28425to("bird", wireBird)};
        Intent intent2 = new Intent(m37157H42, IdToolsLandingActivity.class);
        Pair pair2 = pairArr2[0];
        String str2 = (String) pair2.component1();
        Object component22 = pair2.component2();
        if (component22 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).intValue()), "putExtra(name, value)");
        } else if (component22 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).longValue()), "putExtra(name, value)");
        } else if (component22 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).floatValue()), "putExtra(name, value)");
        } else if (component22 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).doubleValue()), "putExtra(name, value)");
        } else if (component22 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).byteValue()), "putExtra(name, value)");
        } else if (component22 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Character) component22).charValue()), "putExtra(name, value)");
        } else if (component22 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (String) component22), "putExtra(name, value)");
        } else if (component22 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Bundle) component22), "putExtra(name, value)");
        } else if (component22 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Parcelable) component22), "putExtra(name, value)");
        } else if (component22 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Enum) component22).name()), "putExtra(name, value.name)");
        } else if (component22 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Serializable) component22), "putExtra(name, value)");
        } else if (component22 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (CharSequence) component22), "putExtra(name, value)");
        } else if (component22 != null) {
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass2 + " is not supported.");
        }
        m37157H4.startActivity(intent2);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: O3 */
    public void mo37116O3(String merchantSiteId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("merchant_site_id", merchantSiteId), TuplesKt.m28425to("merchant_placard_id", str), TuplesKt.m28425to("from_ride_scan", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H42, BirdPayInputActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    /* renamed from: O4 */
    public final void m37115O4(final Intent intent) {
        this.f84632g.postDelayed(new Runnable() { // from class: g13
            @Override // java.lang.Runnable
            public final void run() {
                C41878h13.m37109P4(intent, this);
            }
        }, 1000L);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: P */
    public void mo37114P(List<IssueType> issueTypes, List<RepairType> repairTypes, List<RepairTypeLock> list) {
        Intrinsics.checkNotNullParameter(issueTypes, "issueTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("issues", issueTypes), TuplesKt.m28425to("repairs", repairTypes), TuplesKt.m28425to("previously_selected_repairs", list)};
        Intent intent = new Intent(m37163G4, RepairSearchActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10012);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: P0 */
    public void mo37113P0(String transactionId, long j, String currency, DateTime date, String merchantSiteId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("transaction_id", transactionId), TuplesKt.m28425to("transaction_amount", Long.valueOf(j)), TuplesKt.m28425to("transaction_currency", currency), TuplesKt.m28425to("transaction_date_time", date), TuplesKt.m28425to("merchant_site_id", merchantSiteId)};
        Intent intent = new Intent(m37157H42, MerchantHistoryDetailsActivity.class);
        for (int i = 0; i < 5; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: P1 */
    public void mo37112P1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird_id", birdId)};
        Intent intent = new Intent(m37163G4, ReplacePhysicalLockActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10013);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: P2 */
    public void mo37111P2(List<String> birdIds, Integer num) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird_ids", birdIds)};
        Intent intent = new Intent(m37157H4, ReportFraudActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        Unit unit = null;
        if (num != null) {
            num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m37157H4().startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: P3 */
    public void mo37110P3() {
        m37157H4().startActivity(new Intent(m37157H4(), ShopActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Q */
    public void mo37108Q(String transactionId, String merchantSiteId, long j, Long l, String currency, DateTime transactionDateTime, String str, Long l2) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transactionDateTime, "transactionDateTime");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("new_transaction", Boolean.TRUE), TuplesKt.m28425to("transaction_id", transactionId), TuplesKt.m28425to("merchant_placard_id", str), TuplesKt.m28425to("merchant_site_id", merchantSiteId), TuplesKt.m28425to("transaction_date_time", transactionDateTime), TuplesKt.m28425to("transaction_amount", Long.valueOf(j)), TuplesKt.m28425to("transaction_amount_billed", l), TuplesKt.m28425to("transaction_currency", currency), TuplesKt.m28425to("transaction_tip_amount", l2)};
        Intent intent = new Intent(m37157H4, PaymentConfirmationActivity.class);
        for (int i = 0; i < 9; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Q0 */
    public void mo37107Q0() {
        m37157H4().startActivity(new Intent(m37157H4(), TransactionHistoryActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Q1 */
    public void mo37106Q1(MapMode mapMode, CameraPosition cameraPosition, Integer num) {
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("map_mode", mapMode)};
        Intent intent = new Intent(m37157H4, ReportMultipleBirdsFraudActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        if (cameraPosition != null) {
            intent.putExtra("camera_position", cameraPosition);
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Q2 */
    public void mo37105Q2() {
        MerchantLocationActivity.f64158E.m57974a(m37157H4());
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Q3 */
    public void mo37104Q3(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Context m37157H4 = m37157H4();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", content);
        intent.setType("text/plain");
        m37157H4.startActivity(Intent.createChooser(intent, m37157H4().getString(C45871nl4.fm_referral_share_text)));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: R */
    public void mo37103R(TutorialType type, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            Pair[] pairArr = {TuplesKt.m28425to("tutorial_type", type)};
            Intent intent = new Intent(m37163G4, TutorialActivity.class);
            Pair pair = pairArr[0];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
            m37163G4.startActivityForResult(intent, num.intValue());
            return;
        }
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr2 = {TuplesKt.m28425to("tutorial_type", type)};
        Intent intent2 = new Intent(m37157H42, TutorialActivity.class);
        Pair pair2 = pairArr2[0];
        String str2 = (String) pair2.component1();
        Object component22 = pair2.component2();
        if (component22 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).intValue()), "putExtra(name, value)");
        } else if (component22 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).longValue()), "putExtra(name, value)");
        } else if (component22 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).floatValue()), "putExtra(name, value)");
        } else if (component22 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).doubleValue()), "putExtra(name, value)");
        } else if (component22 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Number) component22).byteValue()), "putExtra(name, value)");
        } else if (component22 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Character) component22).charValue()), "putExtra(name, value)");
        } else if (component22 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (int[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (long[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (float[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (double[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (byte[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (char[]) component22), "putExtra(name, value)");
        } else if (component22 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (String) component22), "putExtra(name, value)");
        } else if (component22 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Bundle) component22), "putExtra(name, value)");
        } else if (component22 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Parcelable) component22), "putExtra(name, value)");
        } else if (component22 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, ((Enum) component22).name()), "putExtra(name, value.name)");
        } else if (component22 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (Serializable) component22), "putExtra(name, value)");
        } else if (component22 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str2, (CharSequence) component22), "putExtra(name, value)");
        } else if (component22 != null) {
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass2 + " is not supported.");
        }
        m37157H4.startActivity(intent2);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: R0 */
    public void mo37102R0(RideConfig rideConfig, Balance balance, BirdPayment birdPayment, int i) {
        Intrinsics.checkNotNullParameter(rideConfig, "rideConfig");
        Intrinsics.checkNotNullParameter(balance, "balance");
        boolean z = true;
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m28425to("ride_config", rideConfig);
        pairArr[1] = TuplesKt.m28425to("balance", balance);
        pairArr[2] = TuplesKt.m28425to("has_default_card", Boolean.valueOf((birdPayment == null || birdPayment.isEmpty()) ? false : false));
        Intent intent = new Intent(m37163G4, AutoPayV2Activity.class);
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                throw new IllegalArgumentException("<T> of type " + Reflection.getOrCreateKotlinClass(Object.class) + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: R1 */
    public void mo37101R1(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, RepairLoggerListActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: R2 */
    public void mo37100R2(String scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("raw_scan_result", scanResult)};
        Intent intent = new Intent(m37163G4, InventoryCountActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10017);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: R3 */
    public void mo37099R3() {
        m37157H4().startActivity(FreeRideActivity.f61449C.m60649a(m37157H4()));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: S */
    public void mo37098S(WireBird bird, WorkOrder workOrder, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("work_order", workOrder), TuplesKt.m28425to("return_added_issues", Boolean.valueOf(z)), TuplesKt.m28425to("record_inspection_event", Boolean.valueOf(z2))};
        Intent intent = new Intent(m37157H4, LegacyWorkOrderInspectionActivity.class);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        if (z) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, 10019);
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: S0 */
    public void mo37097S0(IdToolOption option, WireBird wireBird, boolean z) {
        Intrinsics.checkNotNullParameter(option, "option");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("id_tool_option", option), TuplesKt.m28425to("bird", wireBird), TuplesKt.m28425to("scan_first", Boolean.valueOf(z))};
        Intent intent = new Intent(m37163G4, IdToolsIdentifyAssociateActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10024);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: S1 */
    public void mo37096S1() {
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bulk_purpose", BulkScanPurpose.SERVICE_CENTER.name())};
        Intent intent = new Intent(m37157H4, BulkServiceProgressScannerActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4().startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: S2 */
    public void mo37095S2() {
        m37157H4().startActivity(new Intent(m37157H4(), AuthTokensDebuggerActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: S3 */
    public void mo37094S3() {
        m37157H4().startActivity(new Intent(m37157H4(), PrivateBirdsOverviewActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: T */
    public void mo37093T(String str) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird_plus_user_subscription_id", str)};
        Intent intent = new Intent(m37163G4, BirdPlusLandingActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10064);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: T0 */
    public void mo37092T0(Issue issue, List<RepairTypeLock> repairs, int i) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("issue", issue), TuplesKt.m28425to("repairs", repairs)};
        Intent intent = new Intent(m37163G4, IssueStatusActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: T1 */
    public void mo37091T1(String merchantSiteId, String merchantId, WireLocation location) {
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(location, "location");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("merchant_site_id", merchantSiteId), TuplesKt.m28425to("merchant_id", merchantId), TuplesKt.m28425to("location", location)};
        Intent intent = new Intent(m37157H42, MerchantLocationEditActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: T2 */
    public void mo37090T2(String str) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("ride_pass_link_code", str)};
        Intent intent = new Intent(m37163G4, RidePassV2Activity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10047);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: T3 */
    public void mo37089T3() {
        m37157H4().startActivity(new Intent(m37157H4(), ParkingRulesActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: U */
    public void mo37088U() {
        m37157H4().startActivity(new Intent(m37157H4(), ParkingAnnouncementActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: U0 */
    public void mo37087U0(String rideId, WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_id", rideId), TuplesKt.m28425to("parking_photo_evaluation", wireEndRidePhotoParkingEvaluation)};
        Intent intent = new Intent(m37157H42, ParkingPhotoHelpActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: U1 */
    public void mo37086U1() {
        m37157H4().startActivity(new Intent(m37157H4(), SmartlockAssociationActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: U2 */
    public void mo37085U2(Integer num) {
        Intent intent = new Intent(m37157H4(), FlockTogetherActivity.class);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: U3 */
    public void mo37084U3(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(DestinationSearchActivity.f63905E.m58233a(m37163G4), i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: V */
    public void mo37083V() {
        m37157H4().startActivity(new Intent(m37157H4(), SmartlockTestActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: V0 */
    public void mo37082V0(String transactionId, String merchantSiteId, long j, Long l, Long l2, String currency, DateTime transactionDateTime) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transactionDateTime, "transactionDateTime");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("new_transaction", Boolean.FALSE), TuplesKt.m28425to("transaction_id", transactionId), TuplesKt.m28425to("merchant_site_id", merchantSiteId), TuplesKt.m28425to("transaction_date_time", transactionDateTime), TuplesKt.m28425to("transaction_amount", Long.valueOf(j)), TuplesKt.m28425to("transaction_amount_billed", l), TuplesKt.m28425to("transaction_tip_amount", l2), TuplesKt.m28425to("transaction_currency", currency)};
        Intent intent = new Intent(m37157H4, PaymentConfirmationActivity.class);
        for (int i = 0; i < 8; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: V1 */
    public void mo37081V1(Intent googleSignInIntent, int i) {
        Intrinsics.checkNotNullParameter(googleSignInIntent, "googleSignInIntent");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(googleSignInIntent, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // p000.InterfaceC40099e13
    /* renamed from: V2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37080V2(MapMode mapMode, String str, boolean z, Boolean bool) {
        String riderHelpCenterUrl;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        WebHelpCenterConfig webHelpCenter = this.f84628c.m82623f8().m73665a().getZendeskConfig().getWebHelpCenter();
        int i = C22542b.$EnumSwitchMapping$0[mapMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                riderHelpCenterUrl = null;
            } else {
                riderHelpCenterUrl = webHelpCenter.getOperatorHelpCenterUrl();
            }
        } else {
            riderHelpCenterUrl = webHelpCenter.getRiderHelpCenterUrl();
        }
        InterfaceC1880Ea interfaceC1880Ea = this.f84627b;
        String name = this.f84626a.m37546z1().getUserRole().name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        boolean z7 = false;
        if (webHelpCenter.getEnabled()) {
            if (riderHelpCenterUrl != null && riderHelpCenterUrl.length() != 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z6 && !webHelpCenter.getLaunchInExternalBrowser()) {
                z2 = true;
                if (webHelpCenter.getEnabled()) {
                    if (riderHelpCenterUrl != null && riderHelpCenterUrl.length() != 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z5 && webHelpCenter.getLaunchInExternalBrowser()) {
                        z3 = true;
                        if (bool != null) {
                            z4 = bool.booleanValue();
                        } else {
                            z4 = false;
                        }
                        interfaceC1880Ea.mo55905y(new GL1(null, null, null, "side_menu", lowerCase, "zendesk", z2, z3, riderHelpCenterUrl, z4, 7, null));
                        if (webHelpCenter.getEnabled()) {
                            if (riderHelpCenterUrl == null || riderHelpCenterUrl.length() == 0) {
                                z7 = true;
                            }
                            if (!z7) {
                                if (webHelpCenter.getLaunchInExternalBrowser()) {
                                    mo36983m2(riderHelpCenterUrl);
                                    return;
                                }
                                InterfaceC40099e13.C19924a.goToWebView$default(this, riderHelpCenterUrl, null, Integer.valueOf(C45871nl4.common_help), !webHelpCenter.getGenericHelpUrls(), 2, null);
                                return;
                            }
                        }
                        mo37003j0(mapMode, str, z);
                    }
                }
                z3 = false;
                if (bool != null) {
                }
                interfaceC1880Ea.mo55905y(new GL1(null, null, null, "side_menu", lowerCase, "zendesk", z2, z3, riderHelpCenterUrl, z4, 7, null));
                if (webHelpCenter.getEnabled()) {
                }
                mo37003j0(mapMode, str, z);
            }
        }
        z2 = false;
        if (webHelpCenter.getEnabled()) {
        }
        z3 = false;
        if (bool != null) {
        }
        interfaceC1880Ea.mo55905y(new GL1(null, null, null, "side_menu", lowerCase, "zendesk", z2, z3, riderHelpCenterUrl, z4, 7, null));
        if (webHelpCenter.getEnabled()) {
        }
        mo37003j0(mapMode, str, z);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: V3 */
    public void mo37079V3(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("sku_order_id", skuOrderId)};
        Intent intent = new Intent(m37157H42, OperatorAllocationDetailsActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        intent.addFlags(67108864);
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: W */
    public void mo37078W(List<? extends AgreementRole> agreementRoles, String str) {
        Intrinsics.checkNotNullParameter(agreementRoles, "agreementRoles");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("agreement_roles", new ArrayList(agreementRoles)), TuplesKt.m28425to("partner_id", str)};
        Intent intent = new Intent(m37157H42, UserAgreementActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: W0 */
    public void mo37077W0(InterfaceC40099e13.EnumC19925b result, Pair<String, ?>... data) {
        boolean z;
        Intent intent;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            intent = X52.m77422c(new Intent(), (Pair[]) Arrays.copyOf(data, data.length));
        } else {
            intent = null;
        }
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.setResult(result.m43403b(), intent);
        }
        Activity m37175E42 = m37175E4();
        if (m37175E42 != null) {
            m37175E42.finish();
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: W1 */
    public void mo37076W1(LastLockComplianceModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("lock_compliance_model", model)};
        Intent intent = new Intent(m37157H42, PhysicalLockLastComplianceActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: W2 */
    public void mo37075W2(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird_plus_user_subscription_id", userSubscriptionId)};
        Intent intent = new Intent(m37163G4, BirdPlusPurchasedActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10065);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: W3 */
    public void mo37074W3(List<String> additionalTags) {
        Intrinsics.checkNotNullParameter(additionalTags, "additionalTags");
        MapMode mapMode = MapMode.RIDER;
        InterfaceC40057dx0 config = m37151I4(additionalTags).config();
        Intrinsics.checkNotNullExpressionValue(config, "getRequestActivityBuilder(additionalTags).config()");
        m37133L4(this, mapMode, config, null, false, 12, null);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: X */
    public void mo37073X(String str, String str2, String str3) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird_plus_user_subscription_id", str), TuplesKt.m28425to("bird_plus_subscription_plan_id", str2), TuplesKt.m28425to("bird_plus_codename", str3)};
        Intent intent = new Intent(m37163G4, BirdPlusDetailsActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str4 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str4, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10065);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: X0 */
    public void mo37072X0(boolean z) {
        this.f84626a.m37732F2(UserRoleItemKt.toUserRoleItem(UserRole.MERCHANT));
        this.f84626a.m37548z(MapMode.MERCHANT);
        if (z) {
            m37115O4(new Intent(m37157H4(), MainActivity.class));
        } else {
            MerchantHistoryActivity.f64152E.m57986a(m37157H4());
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: X1 */
    public void mo37071X1() {
        m37157H4().startActivity(new Intent(m37157H4(), SuggestNestActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: X2 */
    public void mo37070X2() {
        m37157H4().startActivity(new Intent(m37157H4(), CreateBatchActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: X3 */
    public void mo37069X3(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, ServiceProgressUpdateActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Y */
    public void mo37068Y() {
        m37157H4().startActivity(new Intent(m37157H4(), LookupBirdActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Y0 */
    public void mo37067Y0() {
        Intent intent = new Intent(m37157H4(), NestDetailsActivity.class);
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, 10023);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Y1 */
    public void mo37066Y1(TaxInformationSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intent putExtra = new Intent(m37157H4(), TaxInformationActivity.class).putExtra("co.bird.android.tax_information_source", (Parcelable) source);
        Intrinsics.checkNotNullExpressionValue(putExtra, "context.intent<TaxInform…CE, source as Parcelable)");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 != null) {
            m37163G4.startActivityForResult(putExtra, I35.TAX_INFORMATION_SIGNUP.ordinal());
        } else {
            m37157H4().startActivity(putExtra);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Y2 */
    public void mo37065Y2(Set<String> countries) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intent m60634a = SelectCountryActivity.f61470C.m60634a(m37157H4(), countries);
        int m1823a = C30906z6.m1823a(Reflection.getOrCreateKotlinClass(SelectCountryActivity.class));
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(m60634a, m1823a);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Y3 */
    public void mo37064Y3(BarcodeScanType barcodeScanType, Integer num) {
        Intrinsics.checkNotNullParameter(barcodeScanType, "barcodeScanType");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("barcode_scan_type", barcodeScanType), TuplesKt.m28425to("activity_title", num)};
        Intent intent = new Intent(m37157H4, BarcodeScannerActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, 10009);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Z */
    public void mo37063Z() {
        String safetyMenuUrl = this.f84628c.m82623f8().getValue().getSafetyMenuUrl();
        if (safetyMenuUrl == null) {
            safetyMenuUrl = "https://www.bird.co/safety-mobile";
        }
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("url", safetyMenuUrl)};
        Intent intent = new Intent(m37157H42, WebViewActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Z0 */
    public void mo37062Z0(ScannerMode scannerMode, List<? extends BirdModel> list, PartKind partKind, RepairType repairType, boolean z, boolean z2, boolean z3, String str) {
        int i;
        int collectionSizeOrDefault;
        if (partKind == null) {
            i = 10001;
        } else {
            i = 10002;
        }
        ArrayList arrayList = null;
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.m28425to("scanner_mode", scannerMode);
        if (list != null) {
            List<? extends BirdModel> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (BirdModel birdModel : list2) {
                arrayList.add(birdModel.name());
            }
        }
        pairArr[1] = TuplesKt.m28425to("bird_model", arrayList);
        pairArr[2] = TuplesKt.m28425to("part_kind", partKind);
        pairArr[3] = TuplesKt.m28425to("repairs", repairType);
        pairArr[4] = TuplesKt.m28425to("raw_scan_result", Boolean.valueOf(z));
        pairArr[5] = TuplesKt.m28425to("enable_peripheral_scanner", Boolean.valueOf(z2));
        pairArr[6] = TuplesKt.m28425to("manual_input", Boolean.valueOf(z3));
        pairArr[7] = TuplesKt.m28425to("previous_scan_identifier", str);
        Intent intent = new Intent(m37163G4, ScanCodeActivity.class);
        for (int i2 = 0; i2 < 8; i2++) {
            Pair pair = pairArr[i2];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Z1 */
    public void mo37061Z1(WireRide ride, String title, String description, Integer num) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride", ride), TuplesKt.m28425to("title", title), TuplesKt.m28425to("description", description)};
        Intent intent = new Intent(m37157H4, DisputeChargeActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, num.intValue());
                return;
            }
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Z2 */
    public void mo37060Z2() {
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("fleet_report", Boolean.TRUE)};
        Intent intent = new Intent(m37157H42, FleetActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: Z3 */
    public void mo37059Z3(ScanType scanType, String str, BirdAction birdAction, MapMode mode, ScanIntention scanIntention, boolean z, WireBird limitBird) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(limitBird, "limitBird");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("scan_barcode", new ScanBarcodeExtra(scanType, str, birdAction, mode, scanIntention, z)), TuplesKt.m28425to("bird", limitBird)};
        Intent intent = new Intent(m37157H4, BirdScanActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, 10006);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: a */
    public void mo37058a(IdentificationDocumentDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("co.bird.android.identification_descriptor", descriptor)};
        Intent intent = new Intent(m37163G4, IdentificationScannerActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: a0 */
    public void mo37057a0(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 != null) {
            m37163G4.startActivityForResult(new Intent(m37157H4(), AutoReloadV2Activity.class), i);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: a1 */
    public void mo37056a1(String skuOrderId, boolean z, int i) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("sku_order_id", skuOrderId), TuplesKt.m28425to("service_center_flow", Boolean.valueOf(z))};
        Intent intent = new Intent(m37163G4, OutboundScanActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: a2 */
    public void mo37055a2() {
        List<String> listOf;
        MapMode mapMode = MapMode.RIDER;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("cancel_rental");
        InterfaceC40057dx0 config = m37151I4(listOf).config();
        Intrinsics.checkNotNullExpressionValue(config, "getRequestActivityBuilde…cancel_rental\")).config()");
        m37133L4(this, mapMode, config, null, false, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.content.Context] */
    @Override // p000.InterfaceC40099e13
    /* renamed from: a3 */
    public void mo37054a3(List<? extends AgreementRole> agreementRoles, String str, String str2, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(agreementRoles, "agreementRoles");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("agreement_roles", new ArrayList(agreementRoles)), TuplesKt.m28425to("partner_id", str), TuplesKt.m28425to("co.bird.android.user_guest_id", str2), TuplesKt.m28425to("aggressively_triggered", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H4, RentalAgreementActivity.class);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            String str3 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        ?? m37163G4 = m37163G4(this, null, 1, null);
        if (num != null && m37163G4 != 0) {
            m37163G4.startActivityForResult(intent, num.intValue());
            return;
        }
        if (m37163G4 == 0) {
            m37163G4 = m37157H4();
        }
        m37163G4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: a4 */
    public void mo37053a4(WireFrequentFlyerView data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("frequent_flyer_data", data)};
        Intent intent = new Intent(m37157H42, FrequentFlyerActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: b */
    public void mo37052b(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, PropertyReportActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: b0 */
    public void mo37051b0() {
        m37157H4().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: b1 */
    public void mo37050b1(int i) {
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.setResult(i);
        }
        Activity m37175E42 = m37175E4();
        if (m37175E42 != null) {
            m37175E42.finish();
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: b2 */
    public void mo37049b2(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("email", email)};
        Intent intent = new Intent(m37157H42, LoginActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: b3 */
    public void mo37048b3(WirePhysicalLock lock, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f84626a.m37677T1(lock.getKind());
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("physical_lock", lock), TuplesKt.m28425to("force_end_tutorial", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H4, PhysicalLockTutorialActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        Unit unit = null;
        if (num != null) {
            int intValue = num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, intValue);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m37157H4().startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: b4 */
    public void mo37047b4(String destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        String replace = new Regex(" |\\n+").replace(destination, "+");
        m37157H4().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + replace)));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: c */
    public void mo37046c(String nestId, int i) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 != null) {
            Context m37157H4 = m37157H4();
            Pair[] pairArr = {TuplesKt.m28425to("nest_id", nestId)};
            Intent intent = new Intent(m37157H4, NestFlaggingActivity.class);
            Pair pair = pairArr[0];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
            m37163G4.startActivityForResult(intent, i);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: c0 */
    public void mo37045c0(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, OwnedBirdsActivity.class), i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: c1 */
    public void mo37044c1(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, IdentificationTrampolineActivity.class), i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: c2 */
    public void mo37043c2() {
        m37157H4().startActivity(new Intent(m37157H4(), ConfigurableTutorialViewerActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: c3 */
    public void mo37042c3(WireRideDetail rideDetail) {
        Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_detail", rideDetail)};
        Intent intent = new Intent(m37157H4, RideReportActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: c4 */
    public void mo37041c4(ScanType scanType, String str, BirdAction birdAction, MapMode mode, ScanIntention scanIntention, boolean z) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("scan_barcode", new ScanBarcodeExtra(scanType, str, birdAction, mode, scanIntention, z))};
        Intent intent = new Intent(m37157H4, LegacyBirdScanActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4().startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    public void close() {
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.finish();
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: d */
    public void mo37040d(PhotoBannerViewModel photoBannerViewModel, String str, Folder folder, Integer num, Boolean bool, boolean z) {
        int m1823a;
        Intent m54970a = RetakeablePhotoActivity.f66975C.m54970a(m37157H4(), photoBannerViewModel, str, folder, bool, z);
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        if (num != null) {
            m1823a = num.intValue();
        } else {
            m1823a = C30906z6.m1823a(Reflection.getOrCreateKotlinClass(RetakeablePhotoActivity.class));
        }
        m37163G4.startActivityForResult(m54970a, m1823a);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: d0 */
    public void mo37039d0(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("fleet_id", fleetId), TuplesKt.m28425to("fleet_list", list)};
        Intent intent = new Intent(m37157H42, FleetListActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: d1 */
    public void mo37038d1() {
        m37157H4().startActivity(new Intent(m37157H4(), OperatorTaskListActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: d2 */
    public void mo37037d2(long j, String userRidePassId) {
        List<String> listOf;
        Intrinsics.checkNotNullParameter(userRidePassId, "userRidePassId");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cancel_ride_pass", "ride_pass:" + userRidePassId});
        InterfaceC40057dx0 config = m37151I4(listOf).config();
        Intrinsics.checkNotNullExpressionValue(config, "getRequestActivityBuilde…serRidePassId\")).config()");
        ViewArticleActivity.builder(j).withContactUsButtonVisible(false).show(m37157H4(), config);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: d3 */
    public void mo37036d3() {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, ReleaseAssignmentActivity.class), 10056);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: d4 */
    public void mo37035d4(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC40099e13.C19924a.goToWebView$default(this, url, m37157H4().getString(C45871nl4.merchant_reports_activity_title), null, false, 12, null);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: e */
    public void mo37034e(ComplaintType complaintType, ArrayList<ComplaintSection> sections, String str, MapMode role, WireBird wireBird, boolean z) {
        Intrinsics.checkNotNullParameter(complaintType, "complaintType");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(role, "role");
        Intent intent = new Intent(m37157H4(), ReportActivity.class);
        intent.putExtra("complaint_type", complaintType);
        intent.putParcelableArrayListExtra("complaint_section", sections);
        intent.putExtra("ride_id", str);
        C38945c62.m61933a(intent, "map_mode", role);
        intent.putExtra("bird", wireBird);
        intent.putExtra("from_task_list", z);
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: e0 */
    public void mo37033e0() {
        m37157H4().startActivity(new Intent(m37157H4(), SmartlockToolsLauncherActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: e1 */
    public void mo37032e1() {
        m37157H4().startActivity(new Intent(m37157H4(), SmartlockAssociationV2Activity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: e2 */
    public void mo37031e2(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird_ids", birdIds)};
        Intent intent = new Intent(m37157H42, FleetListActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: e3 */
    public void mo37030e3() {
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.finish();
        }
        Activity m37175E42 = m37175E4();
        if (m37175E42 != null) {
            m37175E42.overridePendingTransition(C39882df4.slide_none, C39882df4.slide_down);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: e4 */
    public void mo37029e4(int i, Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.setResult(i, data);
        }
        Activity m37175E42 = m37175E4();
        if (m37175E42 != null) {
            m37175E42.finish();
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: f */
    public void mo37028f(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 != null) {
            m37163G4.startActivityForResult(new Intent(m37157H4(), CaptureBulkScannerActivity.class), i);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: f0 */
    public void mo37027f0(String webArchive) {
        Intrinsics.checkNotNullParameter(webArchive, "webArchive");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("co.bird.android.web_archive_name", webArchive)};
        Intent intent = new Intent(m37157H42, WebViewArchiveActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: f1 */
    public void mo37026f1(boolean z, boolean z2, GoDeepLinkParams goDeepLinkParams) {
        C22454gl c22454gl = this.f84626a;
        MapMode mapMode = MapMode.RIDER;
        c22454gl.m37548z(mapMode);
        this.f84626a.m37732F2(UserRoleItemKt.toUserRoleItem(mapMode.toDefaultUserRole()));
        Intent m59571a = RideActivity.f62350e1.m59571a(m37157H4());
        m59571a.putExtra("show_complaints_submitted_dialog", z2);
        if (z2) {
            m59571a.addFlags(335544320);
        } else if (goDeepLinkParams != null) {
            m59571a.addFlags(603979776);
        }
        if (goDeepLinkParams != null) {
            if (goDeepLinkParams instanceof GoMapDeeplinkParams) {
                GoMapDeeplinkParams goMapDeeplinkParams = (GoMapDeeplinkParams) goDeepLinkParams;
                m59571a.putExtra("rider_show_latitude", goMapDeeplinkParams.getLatitude());
                m59571a.putExtra("rider_show_longitude", goMapDeeplinkParams.getLongitude());
                if (goMapDeeplinkParams.getBird() != null) {
                    m59571a.putExtra("rider_select_bird", goMapDeeplinkParams.getBird());
                } else if (goMapDeeplinkParams.getBirdId() != null) {
                    m59571a.putExtra("rider_select_bird_id", goMapDeeplinkParams.getBirdId());
                }
            } else {
                boolean z3 = false;
                if (goDeepLinkParams instanceof GoRidePassDeepLinkParams) {
                    GoRidePassDeepLinkParams goRidePassDeepLinkParams = (GoRidePassDeepLinkParams) goDeepLinkParams;
                    if (goRidePassDeepLinkParams.getLinkCode() == null || Intrinsics.areEqual(goRidePassDeepLinkParams.getLinkCode(), "ride_pass_test")) {
                        z3 = true;
                    }
                    m59571a.putExtra("show_ride_pass_screen", z3);
                    String linkCode = goRidePassDeepLinkParams.getLinkCode();
                    if (!(!Intrinsics.areEqual(linkCode, "ride_pass_test"))) {
                        linkCode = null;
                    }
                    m59571a.putExtra("ride_pass_link_code", linkCode);
                } else if (goDeepLinkParams instanceof GoBirdPlusDeepLinkParams) {
                    GoBirdPlusDeepLinkParams goBirdPlusDeepLinkParams = (GoBirdPlusDeepLinkParams) goDeepLinkParams;
                    if (goBirdPlusDeepLinkParams.getSubscriptionPlanId() == null) {
                        z3 = true;
                    }
                    m59571a.putExtra("show_bird_plus_screen", z3);
                    m59571a.putExtra("bird_plus_subscription_plan_id", goBirdPlusDeepLinkParams.getSubscriptionPlanId());
                } else if (goDeepLinkParams instanceof DestinationDeeplinkParams) {
                    DestinationDeeplinkParams destinationDeeplinkParams = (DestinationDeeplinkParams) goDeepLinkParams;
                    m59571a.putExtra("destination_latitude", destinationDeeplinkParams.getLatitude());
                    m59571a.putExtra("destination_longitude", destinationDeeplinkParams.getLongitude());
                    m59571a.addFlags(335544320);
                } else if (goDeepLinkParams instanceof Parcelable) {
                    m59571a.putExtra("go_deeplink_params", (Parcelable) goDeepLinkParams);
                }
            }
        }
        if (z) {
            m37115O4(new Intent(m37157H4(), MainActivity.class));
        } else {
            m37157H4().startActivity(m59571a);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: f2 */
    public void mo37025f2(MapMode role, Integer num) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intent m61933a = C38945c62.m61933a(new Intent(m37157H4(), ComplaintActivity.class), "map_mode", role);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(m61933a, num.intValue());
            return;
        }
        m37157H4().startActivity(m61933a);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: f3 */
    public void mo37024f3() {
        m37157H4().startActivity(HowToRideActivity.f61467C.m60637a(m37157H4()));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: f4 */
    public void mo37023f4(ScanIntention scanIntention, String str, Integer num) {
        Intrinsics.checkNotNullParameter(scanIntention, "scanIntention");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("rider_bird_scan", new RiderBirdScanExtra(scanIntention, str))};
        Intent intent = new Intent(m37157H4, RiderBirdScanActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
        } else {
            m37157H4().startActivity(intent);
        }
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: g */
    public void mo37022g(String tipId) {
        Intrinsics.checkNotNullParameter(tipId, "tipId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("tip_id", tipId)};
        Intent intent = new Intent(m37157H4, VehicleTipActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: g0 */
    public void mo37021g0(String deeplinkUrl) {
        String replace$default;
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(deeplinkUrl));
        Intent launchIntentForPackage = m37157H4().getPackageManager().getLaunchIntentForPackage("it.zero11.app.zigzag");
        replace$default = StringsKt__StringsJVMKt.replace$default(deeplinkUrl, "zigzag://", "https://", false, 4, (Object) null);
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(replace$default));
        if (intent.resolveActivity(m37157H4().getPackageManager()) != null) {
            m37157H4().startActivity(intent);
        } else if (launchIntentForPackage != null) {
            m37157H4().startActivity(launchIntentForPackage);
        } else if (intent2.resolveActivity(m37157H4().getPackageManager()) != null) {
            m37157H4().startActivity(intent2);
        } else {
            Context m37157H4 = m37157H4();
            Context m37157H42 = m37157H4();
            Pair[] pairArr = {TuplesKt.m28425to("url", deeplinkUrl)};
            Intent intent3 = new Intent(m37157H42, WebViewActivity.class);
            Pair pair = pairArr[0];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent3.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
            m37157H4.startActivity(intent3);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: g1 */
    public void mo37020g1(Deal deal) {
        Intent intent;
        if (deal != null) {
            Context m37157H4 = m37157H4();
            Pair[] pairArr = {TuplesKt.m28425to("deal", deal)};
            intent = new Intent(m37157H4, DealActivity.class);
            Pair pair = pairArr[0];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        } else {
            intent = new Intent(m37157H4(), DealActivity.class);
        }
        m37157H4().startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: g2 */
    public void mo37019g2(Intent updateAppIntent) {
        Intrinsics.checkNotNullParameter(updateAppIntent, "updateAppIntent");
        m37157H4().startActivity(updateAppIntent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: g3 */
    public void mo37018g3() {
        m37157H4().startActivity(new Intent(m37157H4(), BatchLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: g4 */
    public void mo37017g4() {
        m37157H4().startActivity(new Intent(m37157H4(), WhitelistImeiLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: h */
    public void mo37016h() {
        m37157H4().startActivity(new Intent(m37157H4(), InventoryScanProxyActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: h0 */
    public void mo37015h0(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, LegacyCommandCenterActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: h1 */
    public void mo37014h1(WireBird bird, Issue supertype, List<LegacyRepair> selectedRepairs, List<RepairType> repairTypes) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("issue", supertype), TuplesKt.m28425to("previously_selected_repairs", selectedRepairs), TuplesKt.m28425to("repair_types", repairTypes)};
        Intent intent = new Intent(m37163G4, RepairIssueSubtypesActivity.class);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10028);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: h2 */
    public void mo37013h2(SystemSettingsReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f84627b.mo55956N(new SystemSettingsNavigated(reason));
        m37157H4().startActivity(new Intent("android.settings.SETTINGS"));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: h3 */
    public void mo37012h3() {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, SelectServiceCenterActivity.class), C30906z6.m1823a(Reflection.getOrCreateKotlinClass(SelectServiceCenterActivity.class)));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: h4 */
    public void mo37011h4() {
        m37157H4().startActivity(new Intent(m37157H4(), WakeSleepBirdsActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: i */
    public void mo37010i(String vehicleId, RepairCategory repairCategory, NonRepair nonRepair, int i) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(repairCategory, "repairCategory");
        Intrinsics.checkNotNullParameter(nonRepair, "nonRepair");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 != null) {
            Context m37157H4 = m37157H4();
            Pair[] pairArr = {TuplesKt.m28425to("bird_id", vehicleId), TuplesKt.m28425to("repair_category", repairCategory), TuplesKt.m28425to("non_repair", nonRepair)};
            Intent intent = new Intent(m37157H4, NonRepairSurveyActivity.class);
            for (int i2 = 0; i2 < 3; i2++) {
                Pair pair = pairArr[i2];
                String str = (String) pair.component1();
                Object component2 = pair.component2();
                if (component2 instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
                } else if (component2 instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
                } else if (component2 instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
                } else if (component2 instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
                } else if (component2 instanceof Byte) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
                } else if (component2 instanceof Character) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
                } else if (component2 instanceof int[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof long[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof float[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof double[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof byte[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof char[]) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
                } else if (component2 instanceof String) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
                } else if (component2 instanceof Bundle) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
                } else if (component2 instanceof Parcelable) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
                } else if (component2 instanceof Enum) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
                } else if (component2 instanceof Serializable) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
                } else if (component2 instanceof CharSequence) {
                    Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
                } else if (component2 != null) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                    throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
                }
            }
            m37163G4.startActivityForResult(intent, i);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: i0 */
    public void mo37009i0(int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, IdentificationActivity.class), i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: i1 */
    public void mo37008i1() {
        m37157H4().startActivity(new Intent(m37157H4(), ConfigExplorerActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: i2 */
    public void mo37007i2(boolean z, WireBird wireBird, Integer num, String str, Boolean bool, Boolean bool2, Boolean bool3, Fragment fragment) {
        Intent intent = new Intent(m37157H4(), NearbyBirdsActivity.class);
        if (wireBird != null) {
            intent.putExtra("co.bird.android.bird_finder_filter_bird", wireBird);
        }
        if (num != null) {
            intent.putExtra("co.bird.android.bird_finder_force_scan_duration_seconds", num.intValue());
        }
        if (str != null) {
            intent.putExtra("co.bird.android.bird_pending_action_title", str);
        }
        if (bool != null) {
            intent.putExtra("co.bird.android.bird_show_capture_on_bird_found", bool.booleanValue());
        }
        if (bool3 != null) {
            intent.putExtra("co.bird.android.bird_show_add_button", bool3.booleanValue());
        }
        if (bool2 != null) {
            intent.putExtra("co.bird.android.bird_show_options_button", bool2.booleanValue());
        }
        if (fragment != null) {
            if (z) {
                fragment.startActivityForResult(intent, 10000);
            } else {
                fragment.startActivity(intent);
            }
        } else if (z) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, 10000);
        } else {
            m37157H4().startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: i3 */
    public void mo37006i3(Integer num) {
        Intent intent = new Intent(m37157H4(), PreloadV2ActivityVersionB.class);
        Unit unit = null;
        if (num != null) {
            int intValue = num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, intValue);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            m37157H4().startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: i4 */
    public void mo37005i4() {
        m37157H4().startActivity(SettingsActivity.f62756F.m59380a(m37157H4()));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: j */
    public void mo37004j(String birdId, int i, boolean z, String str) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird_id", birdId), TuplesKt.m28425to("just_paired", Boolean.valueOf(z)), TuplesKt.m28425to("bird_model", str)};
        Intent intent = new Intent(m37163G4, OwnedBirdDetailsActivity.class);
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: j0 */
    public void mo37003j0(MapMode mapMode, String str, boolean z) {
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        this.f84627b.mo55956N(new HelpOpened());
        InterfaceC40057dx0 config = m37145J4(this, null, 1, null).config();
        Intrinsics.checkNotNullExpressionValue(config, "getRequestActivityBuilder().config()");
        m37139K4(mapMode, config, str, z);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: j1 */
    public void mo37002j1(String linkCode) {
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_pass_link_code", linkCode)};
        Intent intent = new Intent(m37157H42, RidePassV4DetailsActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: j2 */
    public void mo37001j2(WireBird bird, Location location, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(location, "location");
        m37157H4().startActivity(SafetyInspectionActivity.f61489D.m60620a(m37157H4(), bird, location, z));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.very_quick_fade_in, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: j3 */
    public void mo37000j3(String skuOrderId, boolean z, int i) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("sku_order_id", skuOrderId), TuplesKt.m28425to("service_center_flow", Boolean.valueOf(z))};
        Intent intent = new Intent(m37163G4, InboundScanActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: j4 */
    public void mo36999j4(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, RepairOverviewActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: k */
    public void mo36998k(WireBird bird, Location location, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(location, "location");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("location", location), TuplesKt.m28425to("inspection_start_over", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H4, ReportedDamagesActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        m37157H4().startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.very_quick_fade_in, C39882df4.very_quick_fade_out);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: k0 */
    public void mo36997k0(String birdId, int i) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird_id", birdId)};
        Intent intent = new Intent(m37163G4, SoberStartActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: k1 */
    public void mo36996k1(String textToSend, String str, String title) {
        Intrinsics.checkNotNullParameter(textToSend, "textToSend");
        Intrinsics.checkNotNullParameter(title, "title");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        intent.putExtra("android.intent.extra.TEXT", textToSend);
        m37157H4().startActivity(Intent.createChooser(intent, title));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: k2 */
    public void mo36995k2(String skuOrderId, Integer num) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("sku_order_id", skuOrderId)};
        Intent intent = new Intent(m37163G4, SkuDetailsActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        if (num != null) {
            m37163G4.startActivityForResult(intent, num.intValue());
        } else {
            m37163G4.startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: k3 */
    public void mo36994k3(WirePartCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("category", category)};
        Intent intent = new Intent(m37157H42, InventoryPartSelectionActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: k4 */
    public void mo36993k4() {
        m37157H4().startActivity(new Intent(m37157H4(), BulkServiceProgressLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: l */
    public void mo36992l(String birdId, Integer num) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", birdId)};
        Intent intent = new Intent(m37157H4, RepairV3OverviewActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, num.intValue());
                return;
            }
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: l0 */
    public void mo36991l0(BulkScanPurpose purpose, OperatorScanIntent operatorScanIntent, String str, Integer num) {
        String str2;
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m28425to("bulk_purpose", purpose.name());
        if (operatorScanIntent != null) {
            str2 = operatorScanIntent.name();
        } else {
            str2 = null;
        }
        pairArr[1] = TuplesKt.m28425to("bulk_scan_intent", str2);
        pairArr[2] = TuplesKt.m28425to("co.bird.android.ops_batch_job_trip_stop_id", str);
        Intent intent = new Intent(m37157H4, DefaultBulkScannerActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str3 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str3, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                throw new IllegalArgumentException("<T> of type " + Reflection.getOrCreateKotlinClass(Object.class) + " is not supported.");
            }
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
        } else {
            m37157H4().startActivity(intent);
        }
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: l1 */
    public void mo36990l1(WireRide ride, Integer num) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Unit unit = null;
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Intent intent = new Intent(m37163G4, VpsParkingActivity.class);
        intent.putExtra("ride", ride);
        if (num != null) {
            m37163G4.startActivityForResult(intent, num.intValue());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m37163G4.startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: l2 */
    public void mo36989l2() {
        m37157H4().startActivity(new Intent(m37157H4(), CommandCenterLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: l3 */
    public void mo36988l3() {
        m37157H4().startActivity(C43475jj0.m30041b(m37157H4()));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: l4 */
    public void mo36987l4(WireBird bird, Location location, String repairId, ArrayList<BirdInspectionPoint> inspectionPointList) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        Intrinsics.checkNotNullParameter(inspectionPointList, "inspectionPointList");
        m37157H4().startActivity(StartRepairActivity.f61511D.m60604a(m37157H4(), bird, location, repairId, inspectionPointList));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_right, C39882df4.slide_left);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: m */
    public void mo36986m(WireBird wireBird, int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", wireBird)};
        Intent intent = new Intent(m37163G4, HelmetLeasePromptActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: m0 */
    public void mo36985m0(String url, String str, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (str == null) {
            if (num != null) {
                str = m37157H4().getString(num.intValue());
            } else {
                str = null;
            }
        }
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("url", url), TuplesKt.m28425to("activity_title", str), TuplesKt.m28425to("zendesk_redirect_url", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H42, WebViewActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: m1 */
    public void mo36984m1(Integer num) {
        Intent intent = new Intent(m37157H4(), LocalsSurveyActivity.class);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, num.intValue());
                return;
            }
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: m2 */
    public void mo36983m2(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        if (intent.resolveActivity(m37157H4().getPackageManager()) != null) {
            m37157H4().startActivity(intent);
            return;
        }
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("url", url)};
        Intent intent2 = new Intent(m37157H42, WebViewActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent2.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent2);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: m3 */
    public void mo36982m3(ScanType scanType, String str, BirdAction birdAction, MapMode mode, ScanIntention scanIntention, boolean z) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("scan_barcode", new ScanBarcodeExtra(scanType, str, birdAction, mode, scanIntention, z))};
        Intent intent = new Intent(m37157H4, LegacyBirdScanActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, 10006);
        m37163G4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: m4 */
    public void mo36981m4() {
        m37157H4().startActivity(new Intent(m37157H4(), ServiceProgressLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: n */
    public void mo36980n(WireBird bird, OperatorSupplementMapPurpose purpose) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("operator_supplement_map_purpose", purpose.name())};
        Intent intent = new Intent(m37163G4, OperatorSupplementMapActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10018);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: n0 */
    public void mo36979n0(ItemLease itemLease, String context, int i) {
        Intrinsics.checkNotNullParameter(itemLease, "itemLease");
        Intrinsics.checkNotNullParameter(context, "context");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("item_lease", itemLease), TuplesKt.m28425to("co.bird.android.context", context)};
        Intent intent = new Intent(m37163G4, HelmetLeaseReturnScannerActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: n1 */
    public void mo36978n1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird_id", birdId)};
        Intent intent = new Intent(m37157H42, BirdRatingHistoryActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: n2 */
    public void mo36977n2(String str, String partSku) {
        Intrinsics.checkNotNullParameter(partSku, "partSku");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("category", str), TuplesKt.m28425to("sku", partSku)};
        Intent intent = new Intent(m37157H42, InventoryPartDetailsActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: n3 */
    public void mo36976n3(String email, String paymentMethodId) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("email", email), TuplesKt.m28425to("payment_id", paymentMethodId)};
        Intent intent = new Intent(m37157H42, PaypalSignOutActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: n4 */
    public void mo36975n4(int i) {
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("item_index", Integer.valueOf(i))};
        Intent intent = new Intent(m37157H42, AnalyticsEventDetailDebuggerActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: o */
    public void mo36974o() {
        m37157H4().startActivity(new Intent(m37157H4(), OperatorOrderActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: o0 */
    public boolean mo36973o0(WirePhysicalLock wirePhysicalLock, boolean z, Integer num, String str, boolean z2, Boolean bool) {
        Intent m12309a = C49245tS3.m12309a(m37157H4(), this.f84628c.m82623f8().getValue(), wirePhysicalLock, z, z2, bool);
        if (m12309a == null) {
            return false;
        }
        if (str != null) {
            m12309a.putExtra("task_id", str);
        }
        Unit unit = null;
        if (num != null) {
            num.intValue();
            m12309a.putExtra("request_code", num.intValue());
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(m12309a, num.intValue());
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                m37157H4().startActivity(m12309a);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m37157H4().startActivity(m12309a);
        }
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
        return true;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: o1 */
    public void mo36972o1(WireBird bird, int i, String sessionId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, sessionId), TuplesKt.m28425to("ride_id", str), TuplesKt.m28425to("is_post_ride", Boolean.valueOf(z))};
        Intent intent = new Intent(m37163G4, HelmetSelfieConfirmationActivity.class);
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair = pairArr[i2];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: o2 */
    public void mo36971o2(String ridePassLinkCode) {
        Intrinsics.checkNotNullParameter(ridePassLinkCode, "ridePassLinkCode");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_pass_link_code", ridePassLinkCode)};
        Intent intent = new Intent(m37157H42, RidePassActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: o3 */
    public void mo36970o3(WireBird wireBird) {
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", wireBird)};
        Intent intent = new Intent(m37157H42, RideHistoryActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: o4 */
    public void mo36969o4(WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(workOrder, "workOrder");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("work_order", workOrder)};
        Intent intent = new Intent(m37157H42, WorkOrderDetailsActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: p */
    public void mo36968p(int i, String sessionId, String str, OperatorScanIntent scanIntent) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIntent, "scanIntent");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to(AnalyticsFields.SESSION_ID, sessionId), TuplesKt.m28425to("co.bird.android.ops_batch_job_trip_stop_id", str), TuplesKt.m28425to("bulk_scan_intent", scanIntent.name())};
        Intent intent = new Intent(m37157H4, BulkUpdateActivity.class);
        for (int i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: p0 */
    public void mo36967p0() {
        m37157H4().startActivity(DebugListActivity.f61434C.m60668a(m37157H4()));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: p1 */
    public void mo36966p1(Integer num) {
        boolean z;
        PaymentActivity.C14000a c14000a = PaymentActivity.f61948F;
        Context m37157H4 = m37157H4();
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        Intent m60197a = c14000a.m60197a(m37157H4, z);
        m60197a.putExtra("go_to_add_money", true);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(m60197a, num.intValue());
            return;
        }
        m37157H4().startActivity(m60197a);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: p2 */
    public void mo36965p2(WireBird bird, String rideId, Integer num) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Unit unit = null;
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Intent intent = new Intent(m37163G4, VpsResolveActivity.class);
        intent.putExtra("bird", bird);
        intent.putExtra("ride_id", rideId);
        if (num != null) {
            m37163G4.startActivityForResult(intent, num.intValue());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m37163G4.startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: p3 */
    public void mo36964p3() {
        m37157H4().startActivity(new Intent(m37157H4(), WakeVehiclesActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: p4 */
    public void mo36963p4() {
        m37157H4().startActivity(new Intent(m37157H4(), QualityControlLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: q */
    public void mo36962q(WireRide ride, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("ride", ride), TuplesKt.m28425to("ride_lock_photo_parking_warning", Boolean.valueOf(z)), TuplesKt.m28425to("has_physical_lock", Boolean.valueOf(z2)), TuplesKt.m28425to("ride_end_photo_required", Boolean.TRUE)};
        Intent intent = new Intent(m37163G4, RideEndPhotoActivity.class);
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: q0 */
    public void mo36961q0(PaymentMethod paymentMethod, int i, Long l, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Intent intent = new Intent(m37163G4, AddBalanceActivity.class);
        C38945c62.m61933a(intent, "payment_method", paymentMethod);
        if (l != null) {
            intent.putExtra("transaction_amount", l.longValue());
        }
        if (str != null) {
            intent.putExtra("transaction_currency", str);
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: q1 */
    public void mo36960q1(VehicleInventoryAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("vehicle_inventory_action", action)};
        Intent intent = new Intent(m37163G4, CoreInventoryScanActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10055);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: q2 */
    public void mo36959q2() {
        m37157H4().startActivity(AutoPayActivity.f61274B.m60827a(m37157H4()));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: q3 */
    public void mo36958q3(String containerOrderId, Integer num) {
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("container_order_id", containerOrderId)};
        Intent intent = new Intent(m37157H4, ProcessContainerOrderActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: q4 */
    public void mo36957q4(ArrayList<ComplaintSection> sections, MapMode role) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(role, "role");
        m37157H4().startActivity(BadRidingActivity.f61376E.m60725a(m37157H4(), sections, role));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: r */
    public void mo36956r(boolean z) {
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("skip_auth_token_refresh", Boolean.valueOf(z))};
        Intent intent = new Intent(m37157H4, MainActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37115O4(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: r0 */
    public void mo36955r0(String birdCode, String taskId) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird_code", birdCode), TuplesKt.m28425to("task_id", taskId), TuplesKt.m28425to("task_cancel_mode", TaskCancelMode.INDIRECT)};
        Intent intent = new Intent(m37157H42, TaskCancelActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: r1 */
    public void mo36954r1(String warehouseId, Integer num) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bulk_purpose", BulkScanPurpose.PART_SCAN.name()), TuplesKt.m28425to("warehouse", warehouseId)};
        Intent intent = new Intent(m37157H4, DefaultBulkScannerActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
        } else {
            m37157H4().startActivity(intent);
        }
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: r2 */
    public void mo36953r2(boolean z, boolean z2, Integer num, String str) {
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("include_pay_per_ride_option", Boolean.valueOf(z)), TuplesKt.m28425to("include_auto_reload_section", Boolean.valueOf(z2)), TuplesKt.m28425to("co.bird.android.context", str)};
        Intent intent = new Intent(m37157H4, PreloadV2OptionsActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        Unit unit = null;
        if (num != null) {
            int intValue = num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, intValue);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            m37157H4().startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: r3 */
    public void mo36952r3(Integer num) {
        Intent intent = new Intent(m37157H4(), PreloadV2Activity.class);
        Unit unit = null;
        if (num != null) {
            int intValue = num.intValue();
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, intValue);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            m37157H4().startActivity(intent);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: r4 */
    public void mo36951r4(WarehouseInventory inventory) {
        Intrinsics.checkNotNullParameter(inventory, "inventory");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("inventory", inventory)};
        Intent intent = new Intent(m37163G4, ExcessInventoryActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10032);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: s */
    public void mo36950s(String skuOrderId, int i) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("sku_order_id", skuOrderId), TuplesKt.m28425to("service_center_flow", Boolean.TRUE)};
        Intent intent = new Intent(m37163G4, ScrapOrderScanActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: s0 */
    public void mo36949s0() {
        try {
            m37157H4().startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            mo37013h2(SystemSettingsReason.BLUETOOTH);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: s1 */
    public void mo36948s1(WireBird wireBird, int i) {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", wireBird)};
        Intent intent = new Intent(m37163G4, HelmetLeaseUnlockTutorialActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: s2 */
    public void mo36947s2(String rideHistoryItemId, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(rideHistoryItemId, "rideHistoryItemId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_id", rideHistoryItemId), TuplesKt.m28425to("location", wireLocation)};
        Intent intent = new Intent(m37157H42, OperatorRideDetailActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: s3 */
    public void mo36946s3(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37163G4, RoutingActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37163G4.startActivityForResult(intent, 10027);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: s4 */
    public void mo36945s4() {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", m37157H4().getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", m37157H4().getPackageName());
            intent.putExtra("app_uid", m37157H4().getApplicationInfo().uid);
        }
        try {
            m37157H4().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            mo37013h2(SystemSettingsReason.PUSH_NOTIFICATIONS);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: t */
    public void mo36944t(WireRideDetail detail, boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("ride_detail", detail), TuplesKt.m28425to("has_physical_lock", Boolean.valueOf(z2)), TuplesKt.m28425to("show_parking_warning", Boolean.valueOf(z)), TuplesKt.m28425to("ride_end_photo_uri", str)};
        Intent intent = new Intent(m37157H4, RideSummaryActivity.class);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            String str2 = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: t0 */
    public void mo36943t0(String birdId, RepairCategory repairCategory, RepairIssue repairIssue) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", birdId), TuplesKt.m28425to("category", repairCategory), TuplesKt.m28425to("issue", repairIssue)};
        Intent intent = new Intent(m37163G4, RepairV3IssueActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10037);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: t1 */
    public void mo36942t1() {
        m37157H4().startActivity(new Intent(m37157H4(), FleetActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: t2 */
    public void mo36941t2(String str) {
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("tutorial_type", str)};
        Intent intent = new Intent(m37157H4, RiderTutorialActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4().startActivity(intent);
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: t3 */
    public void mo36940t3(WireBatch batch) {
        Intrinsics.checkNotNullParameter(batch, "batch");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("batch", batch)};
        Intent intent = new Intent(m37157H42, VehiclesInBatchActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: t4 */
    public void mo36939t4(File file) {
        String str;
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = new Pair[1];
        if (file != null) {
            str = file.getAbsolutePath();
        } else {
            str = null;
        }
        pairArr[0] = TuplesKt.m28425to("screenshot", str);
        Intent intent = new Intent(m37157H42, BugReportActivity.class);
        Pair pair = pairArr[0];
        String str2 = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str2, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: u */
    public void mo36938u() {
        m37157H4().startActivity(new Intent(m37157H4(), SmartlockStandaloneAssociationActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: u0 */
    public void mo36937u0(String hardCountSessionId, Integer num) {
        Intrinsics.checkNotNullParameter(hardCountSessionId, "hardCountSessionId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("hard_count_expected_scans", num), TuplesKt.m28425to("hard_count_session_id", hardCountSessionId)};
        Intent intent = new Intent(m37157H42, HardCountActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: u1 */
    public void mo36936u1(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, source)};
        Intent intent = new Intent(m37157H4, SaveMoneyActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: u2 */
    public void mo36935u2(Location destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        double latitude = destination.getLatitude();
        double longitude = destination.getLongitude();
        m37157H4().startActivity(m37121N4(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + latitude + "," + longitude)), destination));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: u3 */
    public Activity mo36934u3() {
        Activity m37175E4 = m37175E4();
        if (m37175E4 == null || !(!m37175E4.isFinishing())) {
            return null;
        }
        return m37175E4;
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: u4 */
    public void mo36933u4(List<ReservationIssueOption> issueOptions, String reservationId, int i) {
        Intrinsics.checkNotNullParameter(issueOptions, "issueOptions");
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("reservation_feedback_issues", issueOptions), TuplesKt.m28425to("reservation_id", reservationId)};
        Intent intent = new Intent(m37163G4, ReservationFeedbackActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: v */
    public void mo36932v(List<String> photos) {
        Object first;
        Intrinsics.checkNotNullParameter(photos, "photos");
        PhotoViewActivity.C13913a c13913a = PhotoViewActivity.f61666B;
        Context m37157H4 = m37157H4();
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) photos);
        m37157H4().startActivity(c13913a.m60332a(m37157H4, (String) first));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: v0 */
    public void mo36931v0() {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, SmartlockQrScanActivity.class), C30906z6.m1823a(Reflection.getOrCreateKotlinClass(SmartlockQrScanActivity.class)));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: v1 */
    public void mo36930v1() {
        try {
            m37157H4().startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:co.bird.android")));
        } catch (ActivityNotFoundException unused) {
            mo37013h2(SystemSettingsReason.LOCATION_SERVICES);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: v2 */
    public void mo36929v2(List<String> complaintIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("complaint_id", complaintIds)};
        Intent intent = new Intent(m37157H4, ComplaintResolutionActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: v3 */
    public void mo36928v3() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        PackageManager packageManager = m37157H4().getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryInte…ctivities(emailIntent, 0)");
        if (queryIntentActivities.size() > 0) {
            Intent createChooser = Intent.createChooser(m37157H4().getPackageManager().getLaunchIntentForPackage(queryIntentActivities.get(0).activityInfo.packageName), "");
            ArrayList arrayList = new ArrayList();
            int size = queryIntentActivities.size();
            for (int i = 1; i < size; i++) {
                ResolveInfo resolveInfo = queryIntentActivities.get(i);
                String str = resolveInfo.activityInfo.packageName;
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
                if (launchIntentForPackage != null) {
                    arrayList.add(new LabeledIntent(launchIntentForPackage, str, resolveInfo.loadLabel(packageManager), resolveInfo.icon));
                }
            }
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (LabeledIntent[]) arrayList.toArray(new LabeledIntent[0]));
            m37157H4().startActivity(createChooser);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: v4 */
    public void mo36927v4(WireBird bird, List<QCInspection> qcInspections, List<QCAutoCheck> qcAutoChecks) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(qcInspections, "qcInspections");
        Intrinsics.checkNotNullParameter(qcAutoChecks, "qcAutoChecks");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird), TuplesKt.m28425to("quality_control_inspections", qcInspections), TuplesKt.m28425to("quality_control_auto_checks", qcAutoChecks)};
        Intent intent = new Intent(m37157H42, QualityControlResultActivity.class);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: w */
    public void mo36926w(WireBird wireBird, ItemLease itemLease, int i) {
        Intrinsics.checkNotNullParameter(wireBird, "wireBird");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("bird", wireBird), TuplesKt.m28425to("item_lease", itemLease)};
        Intent intent = new Intent(m37163G4, HelmetLeaseSolebeScannerActivity.class);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: w0 */
    public void mo36925w0() {
        m37157H4().startActivity(new Intent(m37157H4(), AnalyticsEventDebuggerActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: w1 */
    public void mo36924w1(Integer num) {
        Intent intent = new Intent(m37157H4(), QuickPaymentActivity.class);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 == null) {
                return;
            }
            m37163G4.startActivityForResult(intent, num.intValue());
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: w2 */
    public void mo36923w2(String siteId, Trigger trigger) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        PlaceInfoActivity.f65048G.m57116a(m37157H4(), siteId, trigger);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: w3 */
    public void mo36922w3(long j) {
        ViewArticleActivity.builder(j).withContactUsButtonVisible(false).show(m37157H4(), new InterfaceC40057dx0[0]);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: w4 */
    public void mo36921w4() {
        m37157H4().startActivity(new Intent(m37157H4(), MaintenanceLandingActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: x */
    public void mo36920x(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, HealthCheckActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: x0 */
    public void mo36919x0(String containerOrderId) {
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("container_order_id", containerOrderId)};
        Intent intent = new Intent(m37157H42, ContainerDetailsActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        intent.addFlags(67108864);
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: x1 */
    public void mo36918x1() {
        m37157H4().startActivity(new Intent(m37157H4(), OperatorSettingsActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: x2 */
    public void mo36917x2() {
        m37157H4().startActivity(new Intent(m37157H4(), SmartlockOperatorUnlockActivity.class));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_up, C39882df4.slide_none);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: x3 */
    public void mo36916x3(WireLocation destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        double latitude = destination.getLatitude();
        double longitude = destination.getLongitude();
        m37157H4().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/maps/search/?api=1&query=" + latitude + "," + longitude)));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: x4 */
    public void mo36915x4(ComplaintType complaintType, ArrayList<ComplaintSection> arrayList, int i, LocationSelectionModel locationSelectionModel) {
        Intent m60720a = ComplaintLocationActivity.f61383D.m60720a(m37157H4(), complaintType, arrayList, locationSelectionModel);
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(m60720a, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: y */
    public void mo36914y(IdToolOption option, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(option, "option");
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        Pair[] pairArr = {TuplesKt.m28425to("id_tool_option", option), TuplesKt.m28425to("bird", wireBird)};
        Intent intent = new Intent(m37163G4, IdToolsIdentifyDissociateActivity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        m37163G4.startActivityForResult(intent, 10024);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: y0 */
    public void mo36913y0() {
        m37157H4().startActivity(new Intent(m37157H4(), OperatorTaskListV2Activity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: y1 */
    public void mo36912y1() {
        m37157H4().startActivity(new Intent(m37157H4(), CashpayActivity.class));
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: y2 */
    public void mo36911y2(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, DiagnosticsActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: y3 */
    public void mo36910y3(int i) {
        Intent intent = new Intent(m37157H4(), CardIOActivity.class);
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true);
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, true);
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, false);
        intent.putExtra(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: y4 */
    public void mo36909y4(String birdId, InspectionContext inspectionContext, Integer num) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(inspectionContext, "inspectionContext");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", birdId), TuplesKt.m28425to("inspection_context", inspectionContext)};
        Intent intent = new Intent(m37157H4, InspectionV3Activity.class);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
            }
        }
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, num.intValue());
                return;
            }
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: z */
    public void mo36908z() {
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(new Intent(m37163G4, ScrapOrderOverviewActivity.class), 10057);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: z0 */
    public void mo36907z0(Integer num) {
        Intent intent = new Intent(m37157H4(), RefundAccountBalanceActivity.class);
        if (num != null) {
            Activity m37163G4 = m37163G4(this, null, 1, null);
            if (m37163G4 != null) {
                m37163G4.startActivityForResult(intent, num.intValue());
                return;
            }
            return;
        }
        m37157H4().startActivity(intent);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: z1 */
    public void mo36906z1(int i, String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Context m37157H4 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to(AnalyticsFields.SESSION_ID, sessionId)};
        Intent intent = new Intent(m37157H4, BulkServiceProgressUpdateActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        Activity m37163G4 = m37163G4(this, null, 1, null);
        if (m37163G4 == null) {
            return;
        }
        m37163G4.startActivityForResult(intent, i);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: z2 */
    public void mo36905z2(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        mo36983m2("https://bird.zendesk.com/hc/" + locale);
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: z3 */
    public void mo36904z3(WireBird bird, String repairId, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(repairId, "repairId");
        m37157H4().startActivity(CertifyRepairActivity.f61473C.m60632a(m37157H4(), bird, repairId, z));
        Activity m37175E4 = m37175E4();
        if (m37175E4 != null) {
            m37175E4.overridePendingTransition(C39882df4.slide_right, C39882df4.slide_left);
        }
    }

    @Override // p000.InterfaceC40099e13
    /* renamed from: z4 */
    public void mo36903z4(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Context m37157H4 = m37157H4();
        Context m37157H42 = m37157H4();
        Pair[] pairArr = {TuplesKt.m28425to("bird", bird)};
        Intent intent = new Intent(m37157H42, FlightSheetActivity.class);
        Pair pair = pairArr[0];
        String str = (String) pair.component1();
        Object component2 = pair.component2();
        if (component2 instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).intValue()), "putExtra(name, value)");
        } else if (component2 instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).longValue()), "putExtra(name, value)");
        } else if (component2 instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).floatValue()), "putExtra(name, value)");
        } else if (component2 instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).doubleValue()), "putExtra(name, value)");
        } else if (component2 instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Number) component2).byteValue()), "putExtra(name, value)");
        } else if (component2 instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Character) component2).charValue()), "putExtra(name, value)");
        } else if (component2 instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (int[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (long[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (float[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (double[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (byte[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (char[]) component2), "putExtra(name, value)");
        } else if (component2 instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (String) component2), "putExtra(name, value)");
        } else if (component2 instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Bundle) component2), "putExtra(name, value)");
        } else if (component2 instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Parcelable) component2), "putExtra(name, value)");
        } else if (component2 instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, ((Enum) component2).name()), "putExtra(name, value.name)");
        } else if (component2 instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (Serializable) component2), "putExtra(name, value)");
        } else if (component2 instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra(str, (CharSequence) component2), "putExtra(name, value)");
        } else if (component2 != null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        m37157H4.startActivity(intent);
    }
}
