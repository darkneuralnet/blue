package p000;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItem;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.app.feature.map.p008ui.MapAreasUi;
import co.bird.android.app.feature.map.p008ui.MapBirdUi;
import co.bird.android.app.feature.map.p008ui.MapUiKt;
import co.bird.android.app.feature.ride.presenter.PaymentIntentStatusException;
import co.bird.android.buava.Optional;
import co.bird.android.coreinterface.manager.AckLockTimeoutException;
import co.bird.android.coreinterface.manager.RideNotPresentException;
import co.bird.android.model.AlarmType;
import co.bird.android.model.Balance;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.BirdScan;
import co.bird.android.model.COMPLETE;
import co.bird.android.model.CompleteRideResponse;
import co.bird.android.model.CompleteRideResponseError;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.model.GoIdentificationDeepLinkParams;
import co.bird.android.model.GoPaymentDeepLinkParams;
import co.bird.android.model.GoTransactionDeepLinkParams;
import co.bird.android.model.IN_NO_PARKING_AREA;
import co.bird.android.model.IN_NO_RIDE_AREA;
import co.bird.android.model.IN_NO_RIDE_NO_PARK_AREA;
import co.bird.android.model.IN_RESTRICTED_PARKING_AREA;
import co.bird.android.model.IN_SERVICE_AREA;
import co.bird.android.model.IN_SLOW_AREA;
import co.bird.android.model.IN_SLOW_NO_PARK_AREA;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.IssueFlow;
import co.bird.android.model.IssueKind;
import co.bird.android.model.LastLockComplianceModel;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LocationAreaState;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.NonComplianceWarning;
import co.bird.android.model.NonComplianceWarningKind;
import co.bird.android.model.OUTSIDE_SERVICE_AREA;
import co.bird.android.model.ParceableGoDeepLinkParams;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingType;
import co.bird.android.model.Point;
import co.bird.android.model.Reservation;
import co.bird.android.model.RideMapState;
import co.bird.android.model.RideRequirement;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.RideStatusEndButton;
import co.bird.android.model.RideStatusLockButton;
import co.bird.android.model.RideStatusManageRidesButton;
import co.bird.android.model.RideStatusScanAfterReserveButton;
import co.bird.android.model.RideStatusUnlockButton;
import co.bird.android.model.RideTitle;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.RiderAreaState;
import co.bird.android.model.RiderAreaStateKt;
import co.bird.android.model.Route;
import co.bird.android.model.ScanlessRideItem;
import co.bird.android.model.UNKNOWN;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.analytics.BluetoothCommunicationError;
import co.bird.android.model.analytics.BluetoothConnectionError;
import co.bird.android.model.analytics.CommunityModeMapIconClicked;
import co.bird.android.model.analytics.FreeRideUsed;
import co.bird.android.model.analytics.MapViewed;
import co.bird.android.model.analytics.OnboardingTeaserShown;
import co.bird.android.model.analytics.RideButtonTapped;
import co.bird.android.model.analytics.RideCompleted;
import co.bird.android.model.analytics.RideEndFlow;
import co.bird.android.model.analytics.RideLocked;
import co.bird.android.model.analytics.RideLockedFailed;
import co.bird.android.model.analytics.RideStartFailed;
import co.bird.android.model.analytics.RideUnlockedFailed;
import co.bird.android.model.analytics.RiderFlightBarLocationServicesButtonTapped;
import co.bird.android.model.analytics.RiderFlightBarShown;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.CouponKind;
import co.bird.android.model.constant.CouponOrigin;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.constant.ScanButtonShape;
import co.bird.android.model.constant.ScanButtonStyle;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.TutorialType;
import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.exception.LocationDisabledException;
import co.bird.android.model.extra.RiderBirdScanExtra;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireCouponKt;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePrivateBird;
import co.bird.android.model.wire.WireReceipt;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.model.wire.WireRideTransaction;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.WireUserGuest;
import co.bird.android.model.wire.configs.BirdPlusConfig;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.model.wire.configs.RideWarningConfig;
import co.bird.android.model.wire.configs.RideWarningConfigKt;
import co.bird.android.model.wire.configs.WarningPresentationKind;
import co.bird.android.model.wire.configs.ZigZagConfig;
import co.bird.android.navigator.LongTermRentalSignUpResult;
import co.bird.android.navigator.MyBirdsResult;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.StartRideBodyWithIntent;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.AbstractC26684u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p000.AbstractC39873de5;
import p000.C37772a75;
import p000.C37791a94;
import p000.C41318g46;
import p000.C42483i25;
import p000.G95;
import p000.H31;
import p000.InterfaceC27246pJ;
import p000.InterfaceC36821Wg6;
import p000.InterfaceC40099e13;
import p000.InterfaceC41921h56;
import p000.InterfaceC42185hY4;
import p000.InterfaceC44791lw0;
import p000.InterfaceC46164oF3;
import p000.InterfaceC46193oI5;
import p000.InterfaceC46893pU4;
import p000.InterfaceC48572sJ4;
import p000.InterfaceC51004wQ2;
import p000.InterfaceC52458ys0;
import p000.J35;
import p000.L44;
import p000.O12;
import p000.P75;
@Metadata(m28433d1 = {"\u0000¶\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 ¤\u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0004©\u0001»\u0001B\u009b\u0004\b\u0007\u0012\b\u0010ð\u0001\u001a\u00030î\u0001\u0012\b\u0010ó\u0001\u001a\u00030ñ\u0001\u0012\b\u0010ö\u0001\u001a\u00030ô\u0001\u0012\b\u0010û\u0001\u001a\u00030÷\u0001\u0012\b\u0010\u0081\u0002\u001a\u00030ü\u0001\u0012\b\u0010\u0084\u0002\u001a\u00030\u0082\u0002\u0012\b\u0010\u0087\u0002\u001a\u00030\u0085\u0002\u0012\b\u0010\u008a\u0002\u001a\u00030\u0088\u0002\u0012\b\u0010\u008d\u0002\u001a\u00030\u008b\u0002\u0012\b\u0010\u0090\u0002\u001a\u00030\u008e\u0002\u0012\b\u0010\u0094\u0002\u001a\u00030\u0091\u0002\u0012\b\u0010\u0098\u0002\u001a\u00030\u0095\u0002\u0012\b\u0010\u009c\u0002\u001a\u00030\u0099\u0002\u0012\b\u0010 \u0002\u001a\u00030\u009d\u0002\u0012\b\u0010¤\u0002\u001a\u00030¡\u0002\u0012\b\u0010¨\u0002\u001a\u00030¥\u0002\u0012\b\u0010¬\u0002\u001a\u00030©\u0002\u0012\b\u0010°\u0002\u001a\u00030\u00ad\u0002\u0012\b\u0010´\u0002\u001a\u00030±\u0002\u0012\b\u0010¸\u0002\u001a\u00030µ\u0002\u0012\b\u0010¼\u0002\u001a\u00030¹\u0002\u0012\b\u0010À\u0002\u001a\u00030½\u0002\u0012\b\u0010Ä\u0002\u001a\u00030Á\u0002\u0012\b\u0010È\u0002\u001a\u00030Å\u0002\u0012\b\u0010Ì\u0002\u001a\u00030É\u0002\u0012\b\u0010Ð\u0002\u001a\u00030Í\u0002\u0012\b\u0010Ô\u0002\u001a\u00030Ñ\u0002\u0012\b\u0010Ø\u0002\u001a\u00030Õ\u0002\u0012\b\u0010Ü\u0002\u001a\u00030Ù\u0002\u0012\b\u0010à\u0002\u001a\u00030Ý\u0002\u0012\b\u0010ä\u0002\u001a\u00030á\u0002\u0012\b\u0010è\u0002\u001a\u00030å\u0002\u0012\b\u0010ì\u0002\u001a\u00030é\u0002\u0012\b\u0010ð\u0002\u001a\u00030í\u0002\u0012\b\u0010ô\u0002\u001a\u00030ñ\u0002\u0012\b\u0010ø\u0002\u001a\u00030õ\u0002\u0012\b\u0010ü\u0002\u001a\u00030ù\u0002\u0012\b\u0010\u0080\u0003\u001a\u00030ý\u0002\u0012\b\u0010\u0084\u0003\u001a\u00030\u0081\u0003\u0012\u0010\b\u0001\u0010,\u001a\n\u0012\u0005\u0012\u00030\u0086\u00030\u0085\u0003\u0012\n\b\u0001\u0010\u008c\u0003\u001a\u00030\u0089\u0003\u0012\n\b\u0001\u0010\u0090\u0003\u001a\u00030\u008d\u0003\u0012\n\b\u0001\u0010\u0094\u0003\u001a\u00030\u0091\u0003\u0012\n\b\u0001\u0010\u0098\u0003\u001a\u00030\u0095\u0003\u0012\n\b\u0001\u0010¡\u0001\u001a\u00030\u009e\u0001\u0012\n\b\u0001\u0010\u009e\u0003\u001a\u00030\u009b\u0003\u0012\n\b\u0001\u0010¢\u0003\u001a\u00030\u009f\u0003\u0012\n\b\u0001\u0010¦\u0003\u001a\u00030£\u0003\u0012\n\b\u0001\u0010ª\u0003\u001a\u00030§\u0003\u0012\n\b\u0001\u0010®\u0003\u001a\u00030«\u0003¢\u0006\u0006\b¢\u0004\u0010£\u0004J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0002J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u001a\u0010!\u001a\u00020 *\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\bH\u0002J\b\u0010#\u001a\u00020\bH\u0002J\b\u0010$\u001a\u00020\bH\u0002J\u0016\u0010'\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001bH\u0002J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0002J\b\u0010*\u001a\u00020\bH\u0002J\u0010\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020\bH\u0002J\b\u0010/\u001a\u00020\bH\u0002J\u001a\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u0006H\u0002J\b\u00103\u001a\u00020\bH\u0002J\b\u00105\u001a\u000204H\u0003J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0002J\b\u00109\u001a\u000204H\u0002J\u0010\u0010:\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\b\u0010;\u001a\u000204H\u0002J\u0010\u0010>\u001a\u0002042\u0006\u0010=\u001a\u00020<H\u0002J\b\u0010?\u001a\u000204H\u0002J\"\u0010C\u001a\u00020\b2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010AH\u0002J\u0018\u0010E\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0006H\u0002J\"\u0010L\u001a\u00020\b2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002J\b\u0010M\u001a\u00020\bH\u0002J\b\u0010N\u001a\u00020\bH\u0002J\b\u0010O\u001a\u00020\u0006H\u0002J\u0018\u0010P\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010S\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020QH\u0002J \u0010V\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010U\u001a\u00020TH\u0002J \u0010X\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010W\u001a\u00020Q2\u0006\u0010U\u001a\u00020TH\u0002J\u0010\u0010Y\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010Z\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010[\u001a\u00020\bH\u0002J\b\u0010\\\u001a\u00020\bH\u0002J\b\u0010]\u001a\u00020\u0006H\u0002JA\u0010c\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010^\u001a\u00020\u00062\n\b\u0002\u0010`\u001a\u0004\u0018\u00010_2\b\b\u0002\u0010a\u001a\u00020\u00062\b\b\u0002\u0010b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bc\u0010dJ3\u0010e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010^\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010b\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010fJ\u001c\u0010j\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010i\u001a\u0004\u0018\u00010gH\u0002J\u001c\u0010k\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010i\u001a\u0004\u0018\u00010gH\u0002J\u001c\u0010l\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010i\u001a\u0004\u0018\u00010gH\u0002J\u001a\u0010p\u001a\u00020\b2\u0006\u0010n\u001a\u00020m2\b\u0010o\u001a\u0004\u0018\u00010\u0004H\u0002J(\u0010s\u001a\u00020\b2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u001b2\u0006\u0010n\u001a\u00020m2\b\u0010o\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010t\u001a\u00020\b2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u001bH\u0002J\u0010\u0010u\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u0010v\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u0010w\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u0010x\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\b\u0010y\u001a\u00020\bH\u0002J\u0012\u0010z\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\f\u0010}\u001a\u00020|*\u00020{H\u0002J\b\u0010~\u001a\u00020\bH\u0002J\b\u0010\u007f\u001a\u00020\bH\u0002J\t\u0010\u0080\u0001\u001a\u00020\bH\u0002J\t\u0010\u0081\u0001\u001a\u00020\bH\u0002J\u001c\u0010\u0083\u0001\u001a\u00020\b2\u0006\u0010G\u001a\u00020F2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010JH\u0002J\u001f\u0010\u0084\u0001\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001bH\u0002J\t\u0010\u0085\u0001\u001a\u00020\u0006H\u0002J\u0011\u0010\u0086\u0001\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\u0011\u0010\u0087\u0001\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\u0011\u0010\u0088\u0001\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0002J\t\u0010\u0089\u0001\u001a\u00020\bH\u0002J\t\u0010\u008a\u0001\u001a\u00020\bH\u0002J\u0012\u0010\u008c\u0001\u001a\u00020\b2\u0007\u0010\u008b\u0001\u001a\u00020\u0006H\u0002J!\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u008e\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0007\u0010\u008d\u0001\u001a\u00020\u0006H\u0002J\u0015\u0010\u0092\u0001\u001a\u00030\u0091\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010AH\u0002J\n\u0010\u0093\u0001\u001a\u00030\u0091\u0001H\u0002J\u0014\u0010\u0094\u0001\u001a\u00030\u0091\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\t\u0010\u0095\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0096\u0001\u001a\u00020\bH\u0002J\t\u0010\u0097\u0001\u001a\u00020\bH\u0002J\t\u0010\u0098\u0001\u001a\u00020\bH\u0002J\u0013\u0010\u009b\u0001\u001a\u00020\b2\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0017J=\u0010£\u0001\u001a\u00020\b2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010v2'\u0010¢\u0001\u001a\"\u0012\u0017\u0012\u00150\u009e\u0001¢\u0006\u000f\b\u009f\u0001\u0012\n\b \u0001\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u00020\b0\u009d\u0001H\u0016J=\u0010¤\u0001\u001a\u00020\u00062\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010v2'\u0010¢\u0001\u001a\"\u0012\u0017\u0012\u00150\u009e\u0001¢\u0006\u000f\b\u009f\u0001\u0012\n\b \u0001\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u00020\u00060\u009d\u0001H\u0016J\t\u0010¥\u0001\u001a\u00020\bH\u0016J$\u0010§\u0001\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0007\u0010¦\u0001\u001a\u00020_2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0011\u0010¨\u0001\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0011\u0010©\u0001\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0017\u0010«\u0001\u001a\u00020\b*\u00030ª\u0001H\u0000¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0012\u0010\u00ad\u0001\u001a\u00020\bH\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\t\u0010¯\u0001\u001a\u00020\bH\u0016J\u0019\u0010°\u0001\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0006H\u0016J\u0011\u0010±\u0001\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010²\u0001\u001a\u00020\bH\u0016J\u001a\u0010³\u0001\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0014\u0010¶\u0001\u001a\u00020\b2\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010·\u0001\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001a\u0010¹\u0001\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0014\u0010»\u0001\u001a\u00020\b2\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010¼\u0001\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0006\b¼\u0001\u0010´\u0001J\"\u0010À\u0001\u001a\t\u0012\u0005\u0012\u00030¿\u0001062\b\u0010¾\u0001\u001a\u00030½\u00012\u0006\u0010K\u001a\u00020JH\u0016JZ\u0010È\u0001\u001a\u00020\b2\u0007\u0010Á\u0001\u001a\u00020A2\u0007\u0010Â\u0001\u001a\u00020A2\u000e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\b0Ã\u00012\u000e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\b0Ã\u00012\t\u0010Æ\u0001\u001a\u0004\u0018\u00010_2\t\u0010Ç\u0001\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0019\u0010Ê\u0001\u001a\u00020\b2\u000e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\b0Ã\u0001H\u0016J\t\u0010Ë\u0001\u001a\u00020\bH\u0016J&\u0010Î\u0001\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0010Í\u0001\u001a\u0005\u0018\u00010Ì\u0001H\u0016¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J!\u0010Ð\u0001\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010U\u001a\u00020TH\u0016J!\u0010Ñ\u0001\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010W\u001a\u00020Q2\u0006\u0010U\u001a\u00020TH\u0016J,\u0010Õ\u0001\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010Ó\u0001\u001a\u00030Ò\u00012\u0006\u0010U\u001a\u00020T2\u0007\u0010Ô\u0001\u001a\u00020\u0006H\u0016J!\u0010Ö\u0001\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010W\u001a\u00020Q2\u0006\u0010U\u001a\u00020TH\u0016J\u001e\u0010×\u0001\u001a\u00020\b2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010mH\u0000¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u001c\u0010Ù\u0001\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0014\u0010Û\u0001\u001a\u00020\b2\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0010H\u0016J\t\u0010Ü\u0001\u001a\u00020\bH\u0016J3\u0010Þ\u0001\u001a\u00020\b2\u0006\u0010W\u001a\u00020Q2\u000b\b\u0002\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u0011\u0010à\u0001\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0016J\t\u0010á\u0001\u001a\u00020\bH\u0016J\t\u0010â\u0001\u001a\u00020\u0006H\u0016J\u0013\u0010å\u0001\u001a\u00020\b2\b\u0010ä\u0001\u001a\u00030ã\u0001H\u0016J\u0013\u0010è\u0001\u001a\u00020\u00062\b\u0010ç\u0001\u001a\u00030æ\u0001H\u0016J\u0012\u0010é\u0001\u001a\u00020\bH\u0001¢\u0006\u0006\bé\u0001\u0010®\u0001J.\u0010ë\u0001\u001a\u00020\b2\u0007\u0010Ý\u0001\u001a\u00020\u00062\u0006\u0010W\u001a\u00020Q2\t\u0010ê\u0001\u001a\u0004\u0018\u00010AH\u0001¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u000b\u0010í\u0001\u001a\u00020\u0006*\u00020\u0010R\u0018\u0010ð\u0001\u001a\u00030î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ï\u0001R\u0018\u0010ó\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010ò\u0001R\u0018\u0010ö\u0001\u001a\u00030ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010õ\u0001R\u001d\u0010û\u0001\u001a\u00030÷\u00018\u0006¢\u0006\u0010\n\u0006\bå\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R \u0010\u0081\u0002\u001a\u00030ü\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u0018\u0010\u0084\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010\u0083\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010\u0086\u0002R\u0018\u0010\u008a\u0002\u001a\u00030\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u0089\u0002R\u0018\u0010\u008d\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u008c\u0002R\u0018\u0010\u0090\u0002\u001a\u00030\u008e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0018\u0010\u0098\u0002\u001a\u00030\u0095\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0018\u0010 \u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0018\u0010¤\u0002\u001a\u00030¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u0018\u0010¨\u0002\u001a\u00030¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0018\u0010¬\u0002\u001a\u00030©\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0002\u0010«\u0002R\u0018\u0010°\u0002\u001a\u00030\u00ad\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u0018\u0010´\u0002\u001a\u00030±\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R\u0018\u0010¸\u0002\u001a\u00030µ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u0018\u0010¼\u0002\u001a\u00030¹\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u0018\u0010À\u0002\u001a\u00030½\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0018\u0010Ä\u0002\u001a\u00030Á\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u0018\u0010È\u0002\u001a\u00030Å\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u0018\u0010Ì\u0002\u001a\u00030É\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R\u0018\u0010Ð\u0002\u001a\u00030Í\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0002\u0010Ï\u0002R\u0018\u0010Ô\u0002\u001a\u00030Ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0002\u0010Ó\u0002R\u0018\u0010Ø\u0002\u001a\u00030Õ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u0018\u0010Ü\u0002\u001a\u00030Ù\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R\u0018\u0010à\u0002\u001a\u00030Ý\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\u0018\u0010ä\u0002\u001a\u00030á\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0002\u0010ã\u0002R\u0018\u0010è\u0002\u001a\u00030å\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0002\u0010ç\u0002R\u0018\u0010ì\u0002\u001a\u00030é\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0002\u0010ë\u0002R\u0018\u0010ð\u0002\u001a\u00030í\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0002\u0010ï\u0002R\u0018\u0010ô\u0002\u001a\u00030ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0002\u0010ó\u0002R\u0018\u0010ø\u0002\u001a\u00030õ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0002\u0010÷\u0002R\u0018\u0010ü\u0002\u001a\u00030ù\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0002\u0010û\u0002R\u0018\u0010\u0080\u0003\u001a\u00030ý\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0002\u0010ÿ\u0002R\u0018\u0010\u0084\u0003\u001a\u00030\u0081\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0003\u0010\u0083\u0003R\u001e\u0010,\u001a\n\u0012\u0005\u0012\u00030\u0086\u00030\u0085\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0003\u0010\u0088\u0003R\u0018\u0010\u008c\u0003\u001a\u00030\u0089\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0003\u0010\u008b\u0003R\u0018\u0010\u0090\u0003\u001a\u00030\u008d\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0003\u0010\u008f\u0003R\u0018\u0010\u0094\u0003\u001a\u00030\u0091\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0003\u0010\u0093\u0003R\u0018\u0010\u0098\u0003\u001a\u00030\u0095\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0003\u0010\u0097\u0003R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0003\u0010\u009a\u0003R\u0018\u0010\u009e\u0003\u001a\u00030\u009b\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0003\u0010\u009d\u0003R\u0018\u0010¢\u0003\u001a\u00030\u009f\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0003\u0010¡\u0003R\u0018\u0010¦\u0003\u001a\u00030£\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0003\u0010¥\u0003R\u0018\u0010ª\u0003\u001a\u00030§\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0003\u0010©\u0003R\u0018\u0010®\u0003\u001a\u00030«\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0003\u0010\u00ad\u0003R0\u0010´\u0003\u001a\u0012\u0012\r\u0012\u000b °\u0003*\u0004\u0018\u00010\u00060\u00060¯\u00038VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0003\u0010²\u0003\u001a\u0006\bý\u0001\u0010³\u0003R\u001e\u0010¸\u0003\u001a\t\u0012\u0004\u0012\u00020\u00060µ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0003\u0010·\u0003R3\u0010¿\u0003\u001a\u0004\u0018\u00010m8\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\b¹\u0003\u0010º\u0003\u0012\u0006\b¾\u0003\u0010®\u0001\u001a\u0006\b»\u0003\u0010¼\u0003\"\u0006\b½\u0003\u0010Ø\u0001R4\u0010È\u0003\u001a\u0005\u0018\u00010À\u00038\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\bÁ\u0003\u0010Â\u0003\u0012\u0006\bÇ\u0003\u0010®\u0001\u001a\u0006\bÃ\u0003\u0010Ä\u0003\"\u0006\bÅ\u0003\u0010Æ\u0003R\u001c\u0010Ì\u0003\u001a\u0005\u0018\u00010É\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0003\u0010Ë\u0003R)\u0010Ð\u0003\u001a\u0014\u0012\u000f\u0012\r °\u0003*\u0005\u0018\u00010ª\u00010ª\u00010Í\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0003\u0010Ï\u0003R7\u0010Õ\u0003\u001a\u0012\u0012\r\u0012\u000b °\u0003*\u0004\u0018\u00010\u00060\u00060Í\u00038\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\bÑ\u0003\u0010Ï\u0003\u0012\u0006\bÔ\u0003\u0010®\u0001\u001a\u0006\bÒ\u0003\u0010Ó\u0003R\u0019\u0010×\u0003\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0003\u0010¶\u0003R)\u0010Ü\u0003\u001a\u0014\u0012\u000f\u0012\r °\u0003*\u0005\u0018\u00010Ù\u00030Ù\u00030Ø\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0003\u0010Û\u0003RA\u0010á\u0003\u001a,\u0012'\u0012%\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010 °\u0003*\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010\u0018\u00010Þ\u00030Þ\u00030Ý\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0003\u0010à\u0003R'\u0010ã\u0003\u001a\u0012\u0012\r\u0012\u000b °\u0003*\u0004\u0018\u00010\u00060\u00060Ý\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0003\u0010à\u0003R'\u0010å\u0003\u001a\u0012\u0012\r\u0012\u000b °\u0003*\u0004\u0018\u00010\b0\b0Ý\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0003\u0010à\u0003R\u0019\u0010ç\u0003\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0003\u0010¶\u0003R\u001b\u0010ê\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0003\u0010é\u0003R\u001b\u0010í\u0003\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0003\u0010ì\u0003R\u001c\u0010ñ\u0003\u001a\u0005\u0018\u00010î\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0003\u0010ð\u0003R&\u0010õ\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ó\u00030ò\u00030µ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0003\u0010·\u0003R!\u0010ú\u0003\u001a\u00030ö\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b÷\u0003\u0010²\u0003\u001a\u0006\bø\u0003\u0010ù\u0003R)\u0010\u0080\u0004\u001a\u000f\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020T0û\u00038\u0006¢\u0006\u0010\n\u0006\bü\u0003\u0010ý\u0003\u001a\u0006\bþ\u0003\u0010ÿ\u0003R\u0019\u0010\u0082\u0004\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0004\u0010¶\u0003R\u0019\u0010\u0084\u0004\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0004\u0010¶\u0003R\u001f\u0010\u0089\u0004\u001a\n\u0012\u0005\u0012\u00030\u0086\u00040\u0085\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0004\u0010\u0088\u0004R\u0018\u0010\u008d\u0004\u001a\u00030\u008a\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0004\u0010\u008c\u0004R\u0017\u0010\u0090\u0004\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0004\u0010\u008f\u0004R\u0017\u0010\u0092\u0004\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0004\u0010\u008f\u0004R\u0019\u0010\u0095\u0004\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0004\u0010\u0094\u0004R\u0019\u0010\u0098\u0004\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0004\u0010\u0097\u0004R\u0017\u0010\u009a\u0004\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0004\u0010\u008f\u0004R\u0017\u0010\u009c\u0004\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0004\u0010\u008f\u0004R\u0018\u0010\u009e\u0004\u001a\u00030\u008a\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0004\u0010\u008c\u0004R\u0017\u0010¡\u0004\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009f\u0004\u0010 \u0004¨\u0006¥\u0004"}, m28432d2 = {"Li25;", "LhY4;", "Lf13;", "LFU4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "paired", "", "y7", "startImmediately", "guestIntent", "M5", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "j4", "Lco/bird/android/model/wire/WireRide;", "ride", "locked", "g8", "intent", "O4", "l9", "k4", "L8", "v8", "T4", "", "S3", "Landroid/location/Location;", "location", "I3", "", "R3", "Q8", "u4", "x9", "Lco/bird/android/model/persistence/Area;", "areas", "x8", "u3", "P3", "R8", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "n8", "V7", "z4", "deeplinkedBird", "wasFallback", "R7", "q4", "Lio/reactivex/c;", "v3", "Lio/reactivex/F;", "Lco/bird/android/model/constant/ScanIntention;", "L3", "P4", "S8", "Q4", "Lcom/google/android/gms/maps/model/LatLngBounds;", "region", "I4", "M4", "birdsOnMap", "", "currentRideId", "s9", "selected", "P8", "Lco/bird/android/model/RideState;", "rideState", "LQM4;", "dialog", "Lco/bird/android/model/wire/configs/WarningPresentationKind;", "presentationKind", "M8", "K3", "b9", "q9", "n4", "", "error", "m4", "Lorg/joda/time/DateTime;", "operationStart", "p4", "throwable", "o4", "O5", "t8", "U7", "Y7", "s8", "isUnlocking", "", "requestCode", "forceShowForPrivateBird", "isRideEnding", "y8", "(Lco/bird/android/model/wire/WireBird;ZLjava/lang/Integer;ZZ)Z", "A8", "(Lco/bird/android/model/wire/WireBird;ZLjava/lang/Integer;Z)Z", "La75;", "previousModel", RequestHeadersFactory.MODEL, "w9", "B9", "A9", "Lco/bird/android/model/wire/WireRideDetail;", "detail", "currentBird", "K8", "Lco/bird/android/model/wire/WireCoupon;", "coupons", "w8", "u8", "j5", "A5", "s5", "b5", "c8", "z9", "LFH3;", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "r9", "h9", "c9", "D4", "F8", "foregroundWarningPresentationKind", "J3", "D9", "r3", "w5", "p5", "Z4", "O3", "N3", "show", "E8", "alarm", "Lio/reactivex/Observable;", "H3", "rideId", "Lco/bird/android/model/wire/configs/Config;", "V3", "U3", "T3", "l8", "d8", "f5", "U4", "LFk6;", "event", "onEvent", "activityResultDelegate", "Lkotlin/Function1;", "Le13;", "Lkotlin/ParameterName;", "name", "navigator", "delegatedNavigation", "h", "f", "i", "resultCode", "onActivityResult", "Q5", C17296a.f69688o, "Lco/bird/android/model/ParkingType;", "D8", "(Lco/bird/android/model/ParkingType;)V", "m8", "()V", "onDestroy", "J5", "I5", "L7", "K4", "(Lco/bird/android/model/wire/WireBird;)V", "rideOverride", "g", "t9", "(Lco/bird/android/model/wire/WireRide;)V", "N7", "(Z)V", "b", "U8", "Ln9;", "alertDialog", "Lco/bird/android/model/DialogResponse;", "l1", "title", "message", "Lkotlin/Function0;", "onPrimary", "onSecondary", "fee", "currency", "k1", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;)V", "N0", "removeRoute", "", "zoomLevel", "zoomTo", "(Landroid/location/Location;Ljava/lang/Float;)V", "p1", "n1", "Lco/bird/android/model/CompleteRideResponse;", "response", "usedOverride", "m1", "o1", "Z7", "(Lco/bird/android/model/wire/WireRideDetail;)V", "r8", "(Lco/bird/android/model/wire/WireBird;)Z", "j", "x7", "unlocking", "M7", "(Ljava/lang/Throwable;Ljava/lang/Boolean;Lco/bird/android/model/wire/WireBird;)V", "onResume", "onPause", "onBackPressed", "Landroid/view/Menu;", "menu", DateTokenConverter.CONVERTER_KEY, "Landroid/view/MenuItem;", "item", "c", "s3", "birdId", "j8", "(ZLjava/lang/Throwable;Ljava/lang/String;)V", "C4", "LTq4;", "LTq4;", "reactiveConfig", "Lbn;", "Lbn;", "areaManager", "LpJ;", "LpJ;", "bluetoothManager", "LYR4;", "LYR4;", "f4", "()LYR4;", "rideManager", "LXc1;", "e", "LXc1;", "X3", "()LXc1;", "endRideManager", "LaM;", "LaM;", "birdManager", "Lq54;", "Lq54;", "privateBirdsManager", "Ldr4;", "Ldr4;", "locationManager", "LGI3;", "LGI3;", "partnerManager", "Lla2;", "Lla2;", "issueManager", "LMK4;", "k", "LMK4;", "reservationManager", "Lys0;", "l", "Lys0;", "complianceManager", "LoI5;", "m", "LoI5;", "smartlockManager", "Lde5;", "n", "Lde5;", "rxBleClient", "LV74;", "o", "LV74;", "promoManager", "LBf1;", "p", "LBf1;", "ephemeralPromoManager", "LGl1;", "q", "LGl1;", "filterAreasManager", "LEg1;", "r", "LEg1;", "eventBus", "Landroid/os/Handler;", "s", "Landroid/os/Handler;", "handler", "Lgl;", "t", "Lgl;", "preference", "Llh6;", "u", "Llh6;", "userManager", "LEa;", "v", "LEa;", "analyticsManager", "LpM3;", "w", "LpM3;", "paymentIntentManager", "LXX4;", "x", "LXX4;", "ridepaymentIntentDelegateFactory", "LzN3;", "y", "LzN3;", "paymentMethodManager", "LWX2;", "z", "LWX2;", "myBirdsManager", "LpU4;", "A", "LpU4;", "rideMapStateManager", "LoF3;", "B", "LoF3;", "parkingManager", "LQz1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LQz1;", "frequentFlyerManager", "LBl5;", "D", "LBl5;", "scanlessRideManager", "LWg6;", "E", "LWg6;", "userGuestManager", "LTL;", "F", "LTL;", "birdLocationManager", "LWU4;", "G", "LWU4;", "ridePassManager", "LMc2;", "H", "LMc2;", "itemLeaseManager", "Lwi2;", "I", "Lwi2;", "jsonDeserializer", "Llw0;", "J", "Llw0;", "configurableTutorialManager", "Ltm;", "K", "Ltm;", "arManager", "LhW0;", "L", "LhW0;", "deeplinkManager", "Lq95;", "M", "Lq95;", "riderMapDataManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "N", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "Landroid/content/Context;", "O", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LG95;", "P", "LG95;", "mapUi", "LP75;", "Q", "LP75;", "rideUi", "LwQ2;", "R", "LwQ2;", "menuUi", "S", "Le13;", "LDQ3;", "T", "LDQ3;", "permissionManager", "LsJ4;", "U", "LsJ4;", "requirementPresenter", "Lbz1;", "V", "Lbz1;", "freeRideDelegate", "LZr1;", "W", "LZr1;", "flightBannerCoordinatorPresenter", "LL44;", "X", "LL44;", "privateBirdPresenter", "LZ84;", "kotlin.jvm.PlatformType", "Y", "Lkotlin/Lazy;", "()LZ84;", "requirementBannerShown", "La94;", "Z", "La94;", "mutableRequirementBannerShown", "a0", "Lco/bird/android/model/wire/WireRideDetail;", "getCurrentRideDetail$app_birdRelease", "()Lco/bird/android/model/wire/WireRideDetail;", "setCurrentRideDetail$app_birdRelease", "getCurrentRideDetail$app_birdRelease$annotations", "currentRideDetail", "LfM2;", "b0", "LfM2;", "getCurrentParkingMarker$app_birdRelease", "()LfM2;", "setCurrentParkingMarker$app_birdRelease", "(LfM2;)V", "getCurrentParkingMarker$app_birdRelease$annotations", "currentParkingMarker", "Lio/reactivex/disposables/c;", "c0", "Lio/reactivex/disposables/c;", "updateBirdDisposableDeprecated", "Lio/reactivex/subjects/a;", "d0", "Lio/reactivex/subjects/a;", "parkingTypeSubject", "e0", "getPhysicalLockSubject$app_birdRelease", "()Lio/reactivex/subjects/a;", "getPhysicalLockSubject$app_birdRelease$annotations", "physicalLockSubject", "f0", "shouldZoomMapIfOutsideArea", "LAG;", "LO12;", "g0", "LAG;", "infoButtonState", "Lma4;", "Lkotlin/Pair;", "h0", "Lma4;", "rideStartedRelay", "i0", "outsideServiceAreaComplianceLogRelay", "j0", "checkPreScanPermissionsRelay", "k0", "onboardingBottomSheetDismissed", "l0", "Lco/bird/android/model/wire/WireBird;", "deeplinkBird", "m0", "Ljava/lang/String;", "deeplinkBirdId", "Lcom/google/android/gms/maps/model/LatLng;", "n0", "Lcom/google/android/gms/maps/model/LatLng;", "deeplinkLatLng", "Lco/bird/android/buava/Optional;", "Li25$b;", "o0", "potentialDeeplinkBirdFallback", "LNX4;", "p0", "e4", "()LNX4;", "paymentIntentDelegate", "", "q0", "Ljava/util/Map;", "g4", "()Ljava/util/Map;", "rideStartDateTimeMap", "r0", "isResumed", "s0", "requestedBirdsNearbyAfterRideCountReset", "", "Lco/bird/android/model/wire/WireSmartlock;", "t0", "Ljava/util/Set;", "lockErrorAlreadyShown", "Lg46$b;", Bird_Kt.MODEL_BIRD_B4, "()Lg46$b;", "logger", "W3", "()Z", "enableGroupRides", "h4", "smartLockV2Enabled", "Z3", "()Lco/bird/android/model/RideState;", "focusedRideState", "Y3", "()Lco/bird/android/model/wire/WireRide;", "focusedRide", "d4", "onboardingCompleted", "a4", "inRequirementCheck", "c4", "onboardingBottomSheet", "i4", "()Landroid/location/Location;", "userLocation", "<init>", "(LTq4;Lbn;LpJ;LYR4;LXc1;LaM;Lq54;Ldr4;LGI3;Lla2;LMK4;Lys0;LoI5;Lde5;LV74;LBf1;LGl1;LEg1;Landroid/os/Handler;Lgl;Llh6;LEa;LpM3;LXX4;LzN3;LWX2;LpU4;LoF3;LQz1;LBl5;LWg6;LTL;LWU4;LMc2;Lwi2;Llw0;Ltm;LhW0;Lq95;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;LG95;LP75;LwQ2;Le13;LDQ3;LsJ4;Lbz1;LZr1;LL44;)V", AbstractC26684u0.f100690q, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 5 Observables.kt\nco/bird/android/library/rx/Observables\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,4445:1\n1#2:4446\n1#2:4531\n1#2:4559\n1#2:4637\n1#2:4705\n180#3:4447\n237#3:4448\n180#3:4449\n180#3:4450\n180#3:4451\n180#3:4452\n180#3:4453\n180#3:4454\n180#3:4455\n180#3:4456\n180#3:4457\n180#3:4458\n199#3:4459\n180#3:4460\n180#3:4463\n180#3:4464\n180#3:4465\n180#3:4466\n180#3:4467\n180#3:4468\n237#3:4469\n180#3:4470\n180#3:4471\n180#3:4472\n180#3:4473\n180#3:4474\n180#3:4475\n180#3:4476\n180#3:4479\n180#3:4480\n180#3:4481\n180#3:4482\n180#3:4483\n180#3:4484\n180#3:4485\n180#3:4486\n180#3:4487\n180#3:4488\n180#3:4489\n180#3:4490\n180#3:4491\n237#3:4492\n180#3:4493\n199#3:4494\n180#3:4513\n180#3:4514\n180#3:4515\n237#3:4516\n237#3:4540\n237#3:4541\n180#3:4542\n180#3:4543\n237#3:4544\n180#3:4566\n199#3:4567\n180#3:4576\n199#3:4577\n199#3:4578\n199#3:4579\n199#3:4580\n199#3:4581\n180#3:4588\n237#3:4605\n237#3:4614\n180#3:4618\n180#3:4619\n180#3:4620\n180#3:4623\n237#3:4669\n180#3:4670\n180#3:4671\n180#3:4672\n180#3:4673\n199#3:4674\n199#3:4675\n180#3:4676\n161#3:4677\n180#3:4678\n237#3:4679\n180#3:4689\n180#3:4690\n180#3:4691\n180#3:4692\n180#3:4693\n161#3:4694\n22#4,2:4461\n22#4,2:4621\n71#4,2:4687\n71#5,2:4477\n2333#6,14:4495\n1549#6:4509\n1620#6,3:4510\n1549#6:4517\n1620#6,3:4518\n1603#6,9:4521\n1855#6:4530\n1856#6:4532\n1612#6:4533\n1238#6,4:4536\n1549#6:4545\n1620#6,3:4546\n1603#6,9:4549\n1855#6:4558\n1856#6:4560\n1612#6:4561\n1549#6:4562\n1620#6,3:4563\n1549#6:4568\n1620#6,3:4569\n1549#6:4572\n1620#6,3:4573\n1747#6,3:4582\n1747#6,3:4585\n1549#6:4589\n1620#6,3:4590\n1549#6:4593\n1620#6,3:4594\n1549#6:4597\n1620#6,3:4598\n1549#6:4601\n1620#6,3:4602\n1549#6:4606\n1620#6,3:4607\n1549#6:4610\n1620#6,3:4611\n1726#6,3:4615\n766#6:4624\n857#6,2:4625\n1603#6,9:4627\n1855#6:4636\n1856#6:4638\n1612#6:4639\n1549#6:4640\n1620#6,3:4641\n1549#6:4644\n1620#6,3:4645\n1238#6,4:4650\n1747#6,3:4654\n1747#6,3:4657\n1747#6,3:4660\n1747#6,3:4663\n1747#6,3:4666\n766#6:4680\n857#6,2:4681\n1549#6:4683\n1620#6,3:4684\n1603#6,9:4695\n1855#6:4704\n1856#6:4706\n1612#6:4707\n1549#6:4708\n1620#6,3:4709\n1238#6,4:4714\n442#7:4534\n392#7:4535\n442#7:4648\n392#7:4649\n442#7:4712\n392#7:4713\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl\n*L\n1735#1:4531\n2179#1:4559\n3512#1:4637\n501#1:4705\n692#1:4447\n716#1:4448\n725#1:4449\n732#1:4450\n740#1:4451\n748#1:4452\n756#1:4453\n764#1:4454\n772#1:4455\n780#1:4456\n794#1:4457\n818#1:4458\n838#1:4459\n847#1:4460\n860#1:4463\n867#1:4464\n890#1:4465\n910#1:4466\n926#1:4467\n944#1:4468\n958#1:4469\n966#1:4470\n975#1:4471\n986#1:4472\n1032#1:4473\n1049#1:4474\n1058#1:4475\n1072#1:4476\n1118#1:4479\n1124#1:4480\n1132#1:4481\n1139#1:4482\n1150#1:4483\n1169#1:4484\n1195#1:4485\n1201#1:4486\n1225#1:4487\n1245#1:4488\n1258#1:4489\n1262#1:4490\n1288#1:4491\n1332#1:4492\n1425#1:4493\n1452#1:4494\n1560#1:4513\n1604#1:4514\n1673#1:4515\n1714#1:4516\n1792#1:4540\n1848#1:4541\n1863#1:4542\n1914#1:4543\n2103#1:4544\n2255#1:4566\n2317#1:4567\n2435#1:4576\n2467#1:4577\n2488#1:4578\n2550#1:4579\n2562#1:4580\n2574#1:4581\n2794#1:4588\n3080#1:4605\n3137#1:4614\n3335#1:4618\n3344#1:4619\n3361#1:4620\n3409#1:4623\n3694#1:4669\n3705#1:4670\n3726#1:4671\n3784#1:4672\n3797#1:4673\n3816#1:4674\n3856#1:4675\n3985#1:4676\n4016#1:4677\n4062#1:4678\n4094#1:4679\n4215#1:4689\n4240#1:4690\n4277#1:4691\n4358#1:4692\n4400#1:4693\n4426#1:4694\n852#1:4461,2\n3387#1:4621,2\n4143#1:4687,2\n1077#1:4477,2\n1509#1:4495,14\n1515#1:4509\n1515#1:4510,3\n1723#1:4517\n1723#1:4518,3\n1735#1:4521,9\n1735#1:4530\n1735#1:4532\n1735#1:4533\n1740#1:4536,4\n2164#1:4545\n2164#1:4546,3\n2179#1:4549,9\n2179#1:4558\n2179#1:4560\n2179#1:4561\n2218#1:4562\n2218#1:4563,3\n2400#1:4568\n2400#1:4569,3\n2402#1:4572\n2402#1:4573,3\n2684#1:4582,3\n2781#1:4585,3\n2844#1:4589\n2844#1:4590,3\n2922#1:4593\n2922#1:4594,3\n3055#1:4597\n3055#1:4598,3\n3056#1:4601\n3056#1:4602,3\n3098#1:4606\n3098#1:4607,3\n3099#1:4610\n3099#1:4611,3\n3229#1:4615,3\n3484#1:4624\n3484#1:4625,2\n3512#1:4627,9\n3512#1:4636\n3512#1:4638\n3512#1:4639\n3521#1:4640\n3521#1:4641,3\n3523#1:4644\n3523#1:4645,3\n3526#1:4650,4\n3547#1:4654,3\n3548#1:4657,3\n3573#1:4660,3\n3574#1:4663,3\n3575#1:4666,3\n4120#1:4680\n4120#1:4681,2\n4120#1:4683\n4120#1:4684,3\n501#1:4695,9\n501#1:4704\n501#1:4706\n501#1:4707\n502#1:4708\n502#1:4709,3\n506#1:4714,4\n1740#1:4534\n1740#1:4535\n3526#1:4648\n3526#1:4649\n506#1:4712\n506#1:4713\n*E\n"})
/* renamed from: i25  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42483i25 implements InterfaceC42185hY4, InterfaceC40692f13, FU4 {

    /* renamed from: u0 */
    public static final C22986a f86313u0 = new C22986a(null);

    /* renamed from: v0 */
    public static final int f86314v0 = 8;

    /* renamed from: A */
    public final InterfaceC46893pU4 f86315A;

    /* renamed from: B */
    public final InterfaceC46164oF3 f86316B;

    /* renamed from: C */
    public final InterfaceC35583Qz1 f86317C;

    /* renamed from: D */
    public final InterfaceC31951Bl5 f86318D;

    /* renamed from: E */
    public final InterfaceC36821Wg6 f86319E;

    /* renamed from: F */
    public final InterfaceC7807TL f86320F;

    /* renamed from: G */
    public final WU4 f86321G;

    /* renamed from: H */
    public final InterfaceC34441Mc2 f86322H;

    /* renamed from: I */
    public final C51174wi2 f86323I;

    /* renamed from: J */
    public final InterfaceC44791lw0 f86324J;

    /* renamed from: K */
    public final InterfaceC28816tm f86325K;

    /* renamed from: L */
    public final InterfaceC42163hW0 f86326L;

    /* renamed from: M */
    public final InterfaceC47297q95 f86327M;

    /* renamed from: N */
    public final LifecycleScopeProvider<EnumC7097RE> f86328N;

    /* renamed from: O */
    public final Context f86329O;

    /* renamed from: P */
    public final G95 f86330P;

    /* renamed from: Q */
    public final P75 f86331Q;

    /* renamed from: R */
    public final InterfaceC51004wQ2 f86332R;

    /* renamed from: S */
    public final InterfaceC40099e13 f86333S;

    /* renamed from: T */
    public final DQ3 f86334T;

    /* renamed from: U */
    public final InterfaceC48572sJ4 f86335U;

    /* renamed from: V */
    public final InterfaceC38875bz1 f86336V;

    /* renamed from: W */
    public final InterfaceC37617Zr1 f86337W;

    /* renamed from: X */
    public final L44 f86338X;

    /* renamed from: Y */
    public final Lazy f86339Y;

    /* renamed from: Z */
    public final C37791a94<Boolean> f86340Z;

    /* renamed from: a */
    public final C36207Tq4 f86341a;

    /* renamed from: a0 */
    public WireRideDetail f86342a0;

    /* renamed from: b */
    public final InterfaceC12495bn f86343b;

    /* renamed from: b0 */
    public C40889fM2 f86344b0;

    /* renamed from: c */
    public final InterfaceC27246pJ f86345c;

    /* renamed from: c0 */
    public InterfaceC23465c f86346c0;

    /* renamed from: d */
    public final YR4 f86347d;

    /* renamed from: d0 */
    public final C24552a<ParkingType> f86348d0;

    /* renamed from: e */
    public final InterfaceC37014Xc1 f86349e;

    /* renamed from: e0 */
    public final C24552a<Boolean> f86350e0;

    /* renamed from: f */
    public final InterfaceC10636aM f86351f;

    /* renamed from: f0 */
    public boolean f86352f0;

    /* renamed from: g */
    public final InterfaceC47256q54 f86353g;

    /* renamed from: g0 */
    public final C0058AG<O12> f86354g0;

    /* renamed from: h */
    public final InterfaceC40001dr4 f86355h;

    /* renamed from: h0 */
    public final C45168ma4<Pair<WireBird, WireRide>> f86356h0;

    /* renamed from: i */
    public final GI3 f86357i;

    /* renamed from: i0 */
    public final C45168ma4<Boolean> f86358i0;

    /* renamed from: j */
    public final InterfaceC44573la2 f86359j;

    /* renamed from: j0 */
    public final C45168ma4<Unit> f86360j0;

    /* renamed from: k */
    public final MK4 f86361k;

    /* renamed from: k0 */
    public boolean f86362k0;

    /* renamed from: l */
    public final InterfaceC52458ys0 f86363l;

    /* renamed from: l0 */
    public WireBird f86364l0;

    /* renamed from: m */
    public final InterfaceC46193oI5 f86365m;

    /* renamed from: m0 */
    public String f86366m0;

    /* renamed from: n */
    public final AbstractC39873de5 f86367n;

    /* renamed from: n0 */
    public LatLng f86368n0;

    /* renamed from: o */
    public final V74 f86369o;

    /* renamed from: o0 */
    public final C37791a94<Optional<C22991b>> f86370o0;

    /* renamed from: p */
    public final InterfaceC31893Bf1 f86371p;

    /* renamed from: p0 */
    public final Lazy f86372p0;

    /* renamed from: q */
    public final InterfaceC33117Gl1 f86373q;

    /* renamed from: q0 */
    public final Map<String, DateTime> f86374q0;

    /* renamed from: r */
    public final InterfaceC32604Eg1 f86375r;

    /* renamed from: r0 */
    public boolean f86376r0;

    /* renamed from: s */
    public final Handler f86377s;

    /* renamed from: s0 */
    public boolean f86378s0;

    /* renamed from: t */
    public final C22454gl f86379t;

    /* renamed from: t0 */
    public final Set<WireSmartlock> f86380t0;

    /* renamed from: u */
    public final InterfaceC44647lh6 f86381u;

    /* renamed from: v */
    public final InterfaceC1880Ea f86382v;

    /* renamed from: w */
    public final InterfaceC46820pM3 f86383w;

    /* renamed from: x */
    public final XX4 f86384x;

    /* renamed from: y */
    public final InterfaceC52757zN3 f86385y;

    /* renamed from: z */
    public final WX2 f86386z;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/NonComplianceWarning;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$A */
    /* loaded from: classes2.dex */
    public static final class C22865A extends Lambda implements Function1<HM4<NonComplianceWarning>, Unit> {

        /* renamed from: g */
        public static final C22865A f86387g = new C22865A();

        public C22865A() {
            super(1);
        }

        /* renamed from: a */
        public final void m34786a(HM4<NonComplianceWarning> hm4) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<NonComplianceWarning> hm4) {
            m34786a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStatusManageRidesButton;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusManageRidesButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$A1 */
    /* loaded from: classes2.dex */
    public static final class C22867A1 extends Lambda implements Function1<RideStatusManageRidesButton, Unit> {
        public C22867A1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34785a(RideStatusManageRidesButton rideStatusManageRidesButton) {
            C41318g46.m40163a("manage ride button clicked: " + rideStatusManageRidesButton, new Object[0]);
            C42483i25.this.m34811x7();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusManageRidesButton rideStatusManageRidesButton) {
            m34785a(rideStatusManageRidesButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$showPhysicalLockTutorialIfNeeded$hasLeaseOrNotRequired$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$A2 */
    /* loaded from: classes2.dex */
    public static final class C22868A2 extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f86390g;

        /* renamed from: h */
        public final /* synthetic */ C42483i25 f86391h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22868A2(WireBird wireBird, C42483i25 c42483i25) {
            super(0);
            this.f86390g = wireBird;
            this.f86391h = c42483i25;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            WireBird wireBird = this.f86390g;
            boolean z = false;
            if (wireBird != null) {
                C42483i25 c42483i25 = this.f86391h;
                InterfaceC34441Mc2 interfaceC34441Mc2 = c42483i25.f86322H;
                ItemLeaseType itemLeaseType = ItemLeaseType.HELMET;
                if (!(!interfaceC34441Mc2.mo55655t(wireBird, itemLeaseType) || c42483i25.f86322H.mo55666l(wireBird, itemLeaseType))) {
                    z = true;
                }
            }
            return Boolean.valueOf(!z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$B */
    /* loaded from: classes2.dex */
    public static final class C22869B extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22869B f86392g = new C22869B();

        public C22869B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while listening for outside of service area compliance events", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$B0 */
    /* loaded from: classes2.dex */
    public static final class C22870B0 extends Lambda implements Function1<Boolean, Unit> {
        public C22870B0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            InterfaceC37617Zr1 interfaceC37617Zr1 = C42483i25.this.f86337W;
            FlightBannerNode.FlightBanner flightBanner = FlightBannerNode.FlightBanner.SELECTED_BIRD_RIDE_PRICE;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC37617Zr1.mo40693O1(flightBanner, it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "isDestinationSelection", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$B1 */
    /* loaded from: classes2.dex */
    public static final class C22871B1 extends Lambda implements Function1<Boolean, Unit> {
        public C22871B1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean isDestinationSelection) {
            Intrinsics.checkNotNullExpressionValue(isDestinationSelection, "isDestinationSelection");
            boolean z = false;
            if (isDestinationSelection.booleanValue()) {
                C42483i25.this.m35228K3();
                C42483i25.this.f86331Q.mo75634R7(false);
                C42483i25.this.f86331Q.mo75625Xi(false);
                C42483i25.this.f86331Q.mo75612de(false);
                C42483i25.this.f86331Q.mo75642M6(false);
                C42483i25.this.f86331Q.mo75599n7();
                return;
            }
            C42483i25.this.f86331Q.mo75634R7(true);
            C42483i25.this.f86331Q.mo75625Xi(true);
            C42483i25.this.f86331Q.mo75612de(true);
            P75 p75 = C42483i25.this.f86331Q;
            if (C42483i25.this.f86353g.mo18199o() || C42483i25.this.f86353g.mo18197q()) {
                z = true;
            }
            p75.mo75642M6(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$B2 */
    /* loaded from: classes2.dex */
    public static final class C22872B2 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C22872B2 f86395g = new C22872B2();

        public C22872B2() {
            super(1);
        }

        /* renamed from: a */
        public final void m34784a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("timeout during location update wait in showRestrictedAreaDialogOnResumeIfNecessary, falling through", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m34784a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$C */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22873C extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22873C f86396b = new C22873C();

        public C22873C() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$C0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22874C0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22874C0 f86397b = new C22874C0();

        public C22874C0() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LH2;", "it", "", C17296a.f69688o, "(LH2;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$C1 */
    /* loaded from: classes2.dex */
    public static final class C22875C1 extends Lambda implements Function1<EnumC3010H2, Boolean> {

        /* renamed from: g */
        public static final C22875C1 f86398g = new C22875C1();

        public C22875C1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC3010H2 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == EnumC3010H2.PARKING_NEAR_TO_NEST_ACTION) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$C2 */
    /* loaded from: classes2.dex */
    public static final class C22876C2 extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C22876C2 f86399g = new C22876C2();

        public C22876C2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/Route;", "route", "", C17296a.f69688o, "(Lco/bird/android/model/Route;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$D */
    /* loaded from: classes2.dex */
    public static final class C22877D extends Lambda implements Function1<Route, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f86401h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22877D(WireBird wireBird) {
            super(1);
            this.f86401h = wireBird;
        }

        /* renamed from: a */
        public final void m34782a(Route route) {
            Intrinsics.checkNotNullParameter(route, "route");
            C42483i25.this.f86330P.drawRouteAndZoom(route, this.f86401h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Route route) {
            m34782a(route);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LH2;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LH2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$D1 */
    /* loaded from: classes2.dex */
    public static final class C22879D1 extends Lambda implements Function1<EnumC3010H2, Unit> {
        public C22879D1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34781a(EnumC3010H2 enumC3010H2) {
            WireRide wireRide;
            InterfaceC46164oF3 interfaceC46164oF3 = C42483i25.this.f86316B;
            C42483i25 c42483i25 = C42483i25.this;
            RideState m59035e = c42483i25.m35012f4().mo75057R().m73665a().m59035e();
            if (m59035e != null) {
                wireRide = m59035e.getRide();
            } else {
                wireRide = null;
            }
            interfaceC46164oF3.mo21504e(c42483i25, c42483i25, wireRide, true, true, true, C42483i25.this.f86328N);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC3010H2 enumC3010H2) {
            m34781a(enumC3010H2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$D2 */
    /* loaded from: classes2.dex */
    public static final class C22880D2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22880D2 f86404g = new C22880D2();

        public C22880D2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40163a("error while listening in stream showRestrictedAreaDialogOnResumeIfNecessary, ignoring", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$E0 */
    /* loaded from: classes2.dex */
    public static final class C22882E0 extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C22882E0 f86406g = new C22882E0();

        public C22882E0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/constant/ScanButtonStyle;", "Lco/bird/android/model/constant/ScanButtonShape;", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$E1 */
    /* loaded from: classes2.dex */
    public static final class C22883E1 extends Lambda implements Function1<Config, Pair<? extends ScanButtonStyle, ? extends ScanButtonShape>> {

        /* renamed from: g */
        public static final C22883E1 f86407g = new C22883E1();

        public C22883E1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<ScanButtonStyle, ScanButtonShape> invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return TuplesKt.m28425to(config.getRiderMapConfig().getScanButtonStyle(), config.getRiderMapConfig().getScanButtonShape());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$E2 */
    /* loaded from: classes2.dex */
    public static final class C22884E2 extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f86409h;

        /* renamed from: i */
        public final /* synthetic */ WireRideDetail f86410i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22884E2(WireBird wireBird, WireRideDetail wireRideDetail) {
            super(0);
            this.f86409h = wireBird;
            this.f86410i = wireRideDetail;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (C42483i25.this.m34854t8(this.f86409h)) {
                C42483i25.this.f86333S.mo37174F(this.f86410i, C42483i25.this.m34881r3(), true);
            } else {
                InterfaceC40099e13.C19924a.goToRideSummary$default(C42483i25.this.f86333S, this.f86410i, false, false, null, 8, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "rideState", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$F */
    /* loaded from: classes2.dex */
    public static final class C22885F extends Lambda implements Function1<Optional<RideState>, Optional<WireBird>> {

        /* renamed from: g */
        public static final C22885F f86411g = new C22885F();

        public C22885F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireBird> invoke(Optional<RideState> rideState) {
            WireBird wireBird;
            WireRide ride;
            Intrinsics.checkNotNullParameter(rideState, "rideState");
            Optional.C14443a c14443a = Optional.f63040c;
            RideState m59035e = rideState.m59035e();
            if (m59035e != null && (ride = m59035e.getRide()) != null) {
                wireBird = ride.getBird();
            } else {
                wireBird = null;
            }
            return c14443a.m59033b(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/RideMapState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lco/bird/android/model/RideMapState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$F0 */
    /* loaded from: classes2.dex */
    public static final class C22886F0 extends Lambda implements Function1<Boolean, RideMapState> {

        /* renamed from: g */
        public static final C22886F0 f86412g = new C22886F0();

        public C22886F0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RideMapState invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return RideMapState.RIDING;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/constant/ScanButtonStyle;", "Lco/bird/android/model/constant/ScanButtonShape;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$F1 */
    /* loaded from: classes2.dex */
    public static final class C22887F1 extends Lambda implements Function1<Pair<? extends ScanButtonStyle, ? extends ScanButtonShape>, Unit> {
        public C22887F1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends ScanButtonStyle, ? extends ScanButtonShape> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends ScanButtonStyle, ? extends ScanButtonShape> pair) {
            C42483i25.this.f86331Q.mo75610ic(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$showRideRestrictedWarningDialogWithAnalytics$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$F2 */
    /* loaded from: classes2.dex */
    public static final class C22888F2 extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ QM4 f86414g;

        /* renamed from: h */
        public final /* synthetic */ C42483i25 f86415h;

        /* renamed from: i */
        public final /* synthetic */ RideState f86416i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22888F2(QM4 qm4, C42483i25 c42483i25, RideState rideState) {
            super(1);
            this.f86414g = qm4;
            this.f86415h = c42483i25;
            this.f86416i = rideState;
        }

        /* renamed from: a */
        public final void m34778a(DialogResponse dialogResponse) {
            C49570tz6 c49570tz6;
            boolean z;
            if (C6598Py.m89229a(this.f86414g)) {
                FH3 mo21500j = this.f86415h.f86316B.mo21500j();
                Integer num = null;
                if (mo21500j instanceof C49570tz6) {
                    c49570tz6 = (C49570tz6) mo21500j;
                } else {
                    c49570tz6 = null;
                }
                if (c49570tz6 != null) {
                    num = c49570tz6.m11120g();
                }
                InterfaceC1880Ea interfaceC1880Ea = this.f86415h.f86382v;
                C42483i25 c42483i25 = this.f86415h;
                WireRide ride = this.f86416i.getRide();
                EnumC41529gR4 enumC41529gR4 = EnumC41529gR4.NO_PARKING;
                enumC41529gR4.mo39468a(num);
                Unit unit = Unit.INSTANCE;
                boolean m88637b = this.f86414g.m88637b();
                if (dialogResponse == DialogResponse.OTHER) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1880Ea.mo55905y(O25.m92983a(c42483i25, ride, enumC41529gR4, m88637b, z));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m34778a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "birdOptional", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$G */
    /* loaded from: classes2.dex */
    public static final class C22889G extends Lambda implements Function1<Optional<WireBird>, InterfaceC23434B<? extends WireBird>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "it", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$G$a */
        /* loaded from: classes2.dex */
        public static final class C22890a extends Lambda implements Function1<Location, WireBird> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WireBird> f86418g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22890a(Optional<WireBird> optional) {
                super(1);
                this.f86418g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireBird invoke(Location it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f86418g.m59038b();
            }
        }

        public C22889G() {
            super(1);
        }

        /* renamed from: c */
        public static final WireBird m34775c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireBird) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends WireBird> invoke(Optional<WireBird> birdOptional) {
            Intrinsics.checkNotNullParameter(birdOptional, "birdOptional");
            if (birdOptional.m59037c()) {
                Z84<Location> mo43616p = C42483i25.this.f86355h.mo43616p();
                final C22890a c22890a = new C22890a(birdOptional);
                return mo43616p.map(new InterfaceC23492o() { // from class: k25
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WireBird m34775c;
                        m34775c = C42483i25.C22889G.m34775c(Function1.this, obj);
                        return m34775c;
                    }
                });
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideMapState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideMapState;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$G0 */
    /* loaded from: classes2.dex */
    public static final class C22891G0 extends Lambda implements Function1<RideMapState, Unit> {
        public C22891G0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34773a(RideMapState it) {
            InterfaceC46893pU4 interfaceC46893pU4 = C42483i25.this.f86315A;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC46893pU4.mo15906c(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideMapState rideMapState) {
            m34773a(rideMapState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$G1 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22892G1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22892G1 f86420b = new C22892G1();

        public C22892G1() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$G2 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22893G2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22893G2 f86421b = new C22893G2();

        public C22893G2() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$H */
    /* loaded from: classes2.dex */
    public static final class C22894H extends Lambda implements Function1<WireBird, Unit> {
        public C22894H() {
            super(1);
        }

        /* renamed from: a */
        public final void m34772a(WireBird bird) {
            G95 g95 = C42483i25.this.f86330P;
            InterfaceC7807TL interfaceC7807TL = C42483i25.this.f86320F;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            G95.C2676a.updateLocation$default(g95, interfaceC7807TL.mo78580b(bird), null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m34772a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$H0 */
    /* loaded from: classes2.dex */
    public static final class C22895H0 extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C22895H0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("calling check pre scan permissions", new Object[0]);
            return C42483i25.this.m34837v3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$H1 */
    /* loaded from: classes2.dex */
    public static final class C22896H1 extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C22896H1 f86424g = new C22896H1();

        public C22896H1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getRiderMapConfig().getShowGroupRideButton() && config.getMultiRideConfig().getEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideUpdateState;", TransferTable.COLUMN_STATE, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/RideUpdateState;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$H2 */
    /* loaded from: classes2.dex */
    public static final class C22897H2 extends Lambda implements Function1<RideUpdateState, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireRide;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$H2$a */
        /* loaded from: classes2.dex */
        public static final class C22898a extends Lambda implements Function1<List<? extends WireRide>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86426g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22898a(C42483i25 c42483i25) {
                super(1);
                this.f86426g = c42483i25;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(List<WireRide> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f86426g.m35167Q4();
            }
        }

        public C22897H2() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m34768c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(RideUpdateState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state != RideUpdateState.NONE) {
                return AbstractC23461c.m33039p();
            }
            C41318g46.m40163a("startPollRide switch mapped to polling based off ride update state = NONE", new Object[0]);
            Observable<List<WireRide>> mo75062J = C42483i25.this.m35012f4().mo75062J();
            final C22898a c22898a = new C22898a(C42483i25.this);
            return mo75062J.flatMapCompletable(new InterfaceC23492o() { // from class: F25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m34768c;
                    m34768c = C42483i25.C22897H2.m34768c(Function1.this, obj);
                    return m34768c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$I */
    /* loaded from: classes2.dex */
    public static final class C22899I extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22899I f86427g = new C22899I();

        public C22899I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while observing bird pin location updates", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$I0 */
    /* loaded from: classes2.dex */
    public static final class C22900I0 extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C22900I0 f86428g = new C22900I0();

        public C22900I0() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "showGroupRidesButton", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$I1 */
    /* loaded from: classes2.dex */
    public static final class C22901I1 extends Lambda implements Function1<Boolean, Unit> {
        public C22901I1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean showGroupRidesButton) {
            P75 p75 = C42483i25.this.f86331Q;
            Intrinsics.checkNotNullExpressionValue(showGroupRidesButton, "showGroupRidesButton");
            p75.mo75621Z8(showGroupRidesButton.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$I2 */
    /* loaded from: classes2.dex */
    public static final class C22902I2 extends Lambda implements Function1<Pair<? extends WireBird, ? extends WireRide>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C23464b f86431h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22902I2(C23464b c23464b) {
            super(1);
            this.f86431h = c23464b;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends WireRide> pair) {
            invoke2((Pair<WireBird, WireRide>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, WireRide> pair) {
            C41318g46.m40163a("btunlock: calling handleStartRide success now", new Object[0]);
            C42483i25.this.m34924n4(pair.component1(), pair.component2());
            this.f86431h.dispose();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lde5$a;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RideMapState;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeBluetoothState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeBluetoothState$1\n*L\n4285#1:4446,3\n*E\n"})
    /* renamed from: i25$J */
    /* loaded from: classes2.dex */
    public static final class C22903J extends Lambda implements Function1<Pair<? extends AbstractC39873de5.EnumC19828a, ? extends RideMapState>, Unit> {
        public C22903J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends AbstractC39873de5.EnumC19828a, ? extends RideMapState> pair) {
            invoke2(pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends AbstractC39873de5.EnumC19828a, ? extends RideMapState> pair) {
            boolean z;
            WirePhysicalLock physicalLock;
            AbstractC39873de5.EnumC19828a component1 = pair.component1();
            RideMapState component2 = pair.component2();
            if (component1 == AbstractC39873de5.EnumC19828a.READY || component2 != RideMapState.RIDING) {
                C42483i25.this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.RIDER_BAR_LOCATION_SERVICES_DISABLED);
                C42483i25.this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.RIDER_BAR_BLUETOOTH_DISABLED);
            }
            List<RideState> rideStates = C42483i25.this.m35012f4().mo75032o0().m73665a().getRideStates();
            boolean z2 = false;
            if (!(rideStates instanceof Collection) || !rideStates.isEmpty()) {
                Iterator<T> it = rideStates.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WireBird bird = ((RideState) it.next()).getRide().getBird();
                    if (((bird == null || (physicalLock = bird.getPhysicalLock()) == null) ? null : physicalLock.getSmartlock()) != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (z2) {
                if (component1 == AbstractC39873de5.EnumC19828a.LOCATION_SERVICES_NOT_ENABLED) {
                    C42483i25.this.f86337W.mo40695M1(FlightBannerNode.FlightBanner.RIDER_BAR_LOCATION_SERVICES_DISABLED);
                } else if (component1 != AbstractC39873de5.EnumC19828a.READY) {
                    C42483i25.this.f86337W.mo40695M1(FlightBannerNode.FlightBanner.RIDER_BAR_BLUETOOTH_DISABLED);
                }
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$J0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22904J0 extends FunctionReferenceImpl implements Function1<Unit, Unit> {
        public C22904J0(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m34766a(Unit p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            m34766a(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$J1 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22905J1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22905J1 f86433b = new C22905J1();

        public C22905J1() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$J2 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22906J2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22906J2 f86434b = new C22906J2();

        public C22906J2() {
            super(1, C41318g46.class, DateTokenConverter.CONVERTER_KEY, "d(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40162b(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$K */
    /* loaded from: classes2.dex */
    public static final class C22907K extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C22907K f86435g = new C22907K();

        public C22907K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getMultiRideConfig().getEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2J\u0010\u0007\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireCoupon;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$K0 */
    /* loaded from: classes2.dex */
    public static final class C22908K0 extends Lambda implements Function1<Triple<? extends List<? extends WireCoupon>, ? extends Boolean, ? extends Optional<RideState>>, Unit> {
        public C22908K0() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
            if (p000.C42149hU4.m36358a(r4) == false) goto L7;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m34765a(Triple<? extends List<WireCoupon>, Boolean, Optional<RideState>> triple) {
            boolean z;
            List<WireCoupon> component1 = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            Optional<RideState> component3 = triple.component3();
            P75 p75 = C42483i25.this.f86331Q;
            if (booleanValue) {
                z = true;
                if (!component1.isEmpty()) {
                }
            }
            z = false;
            p75.mo75645J1(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends WireCoupon>, ? extends Boolean, ? extends Optional<RideState>> triple) {
            m34765a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$79\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1549#2:4446\n1620#2,3:4447\n1549#2:4450\n1620#2,3:4451\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$79\n*L\n1266#1:4446\n1266#1:4447,3\n1268#1:4450\n1268#1:4451,3\n*E\n"})
    /* renamed from: i25$K1 */
    /* loaded from: classes2.dex */
    public static final class C22909K1 extends Lambda implements Function1<Unit, Unit> {
        public C22909K1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            InterfaceC1880Ea interfaceC1880Ea = C42483i25.this.f86382v;
            List<Area> value = C42483i25.this.f86343b.mo64001e().getValue();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Area area : value) {
                arrayList.add(area.getId());
            }
            boolean isInRegistration = UserKt.isInRegistration(C42483i25.this.f86379t.m37750B0());
            List<Area> value2 = C42483i25.this.f86343b.mo64001e().getValue();
            C42483i25 c42483i25 = C42483i25.this;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(value2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (Area area2 : value2) {
                arrayList2.add(Double.valueOf(Seconds.secondsBetween(c42483i25.f86343b.mo64011O().getValue().get(area2), DateTime.now()).getSeconds()));
            }
            String lowerCase = C42483i25.this.f86341a.m82623f8().m73665a().getRiderMapConfig().getScanButtonShape().name().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            interfaceC1880Ea.mo55905y(new C32554Ea5(null, null, null, lowerCase, arrayList, arrayList2, null, null, null, null, null, null, null, Boolean.valueOf(isInRegistration), 8135, null));
            C42483i25.this.f86333S.mo37103R(TutorialType.GROUP_RIDES, 10049);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "ride", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$K2 */
    /* loaded from: classes2.dex */
    public static final class C22910K2 extends Lambda implements Function1<WireRide, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f86439h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22910K2(WireBird wireBird) {
            super(1);
            this.f86439h = wireBird;
        }

        /* renamed from: a */
        public final void m34764a(WireRide wireRide) {
            String id = wireRide.getId();
            boolean bypassLockAckForBluetooth = C42483i25.this.m35012f4().mo75030r().m73665a().getRideConfig().getBypassLockAckForBluetooth();
            C41318g46.m40163a("btunlock: bluetooth ride unlock event received for " + id + ", will handle start ride success if bypassLockAckForBluetooth is true (" + bypassLockAckForBluetooth + ")", new Object[0]);
            if (C42483i25.this.m35012f4().mo75030r().m73665a().getRideConfig().getBypassLockAckForBluetooth()) {
                C42483i25.this.f86356h0.accept(TuplesKt.m28425to(this.f86439h, wireRide));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m34764a(wireRide);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$L */
    /* loaded from: classes2.dex */
    public static final class C22911L extends Lambda implements Function1<Pair<? extends RideStates, ? extends Boolean>, Unit> {
        public C22911L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RideStates, ? extends Boolean> pair) {
            invoke2((Pair<RideStates, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
            if ((1 <= r2 && r2 < r1) != false) goto L8;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Pair<RideStates, Boolean> pair) {
            boolean z;
            RideStates component1 = pair.component1();
            Boolean groupRidesEnabled = pair.component2();
            int maxRideCount = C42483i25.this.f86341a.m82623f8().m73665a().getMultiRideConfig().getMaxRideCount();
            Intrinsics.checkNotNullExpressionValue(groupRidesEnabled, "groupRidesEnabled");
            if (groupRidesEnabled.booleanValue()) {
                int activeRideCount = component1.getActiveRideCount();
                z = true;
            }
            z = false;
            C41318g46.m40163a("maxRideCount: " + maxRideCount + " groupRidesEnabled: " + groupRidesEnabled + " activeRideCount " + component1.getActiveRideCount(), new Object[0]);
            C42483i25.this.f86331Q.mo75651Ff(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$L0 */
    /* loaded from: classes2.dex */
    public static final class C22912L0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22912L0 f86441g = new C22912L0();

        public C22912L0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while handling add ride button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStatusScanAfterReserveButton;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusScanAfterReserveButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$L1 */
    /* loaded from: classes2.dex */
    public static final class C22913L1 extends Lambda implements Function1<RideStatusScanAfterReserveButton, Unit> {
        public C22913L1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34763a(RideStatusScanAfterReserveButton rideStatusScanAfterReserveButton) {
            C41318g46.m40163a("scan after reserve button clicked: " + rideStatusScanAfterReserveButton, new Object[0]);
            C42483i25.this.m35214L7();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusScanAfterReserveButton rideStatusScanAfterReserveButton) {
            m34763a(rideStatusScanAfterReserveButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$L2 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22914L2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22914L2 f86443b = new C22914L2();

        public C22914L2() {
            super(1, C41318g46.class, DateTokenConverter.CONVERTER_KEY, "d(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40162b(th);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$M */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22915M extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22915M f86444b = new C22915M();

        public C22915M() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$M0 */
    /* loaded from: classes2.dex */
    public static final class C22916M0 extends Lambda implements Function1<J35.C3879a, Boolean> {

        /* renamed from: g */
        public static final C22916M0 f86445g = new C22916M0();

        public C22916M0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(J35.C3879a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m101226c() == RideRequirementReason.ONBOARDING_BANNER) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$80\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$M1 */
    /* loaded from: classes2.dex */
    public static final class C22917M1 extends Lambda implements Function1<Unit, Unit> {
        public C22917M1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            WireFrequentFlyerView m59035e = C42483i25.this.f86317C.getData().m73665a().m59035e();
            if (m59035e != null) {
                C42483i25.this.f86333S.mo37053a4(m59035e);
            }
            C42483i25.this.f86382v.mo55905y(new C46154oE2(null, null, null, m59035e != null ? m59035e.getMapStatus() : null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$M2 */
    /* loaded from: classes2.dex */
    public static final class C22918M2 extends Lambda implements Function1<WireRide, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C23464b f86447g;

        /* renamed from: h */
        public final /* synthetic */ C42483i25 f86448h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f86449i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22918M2(C23464b c23464b, C42483i25 c42483i25, WireBird wireBird) {
            super(1);
            this.f86447g = c23464b;
            this.f86448h = c42483i25;
            this.f86449i = wireBird;
        }

        /* renamed from: a */
        public final void m34761a(WireRide wireRide) {
            boolean mo1769e = this.f86447g.mo1769e();
            C41318g46.m40163a("btunlock: start ride succeeded, did ride unlocks already dispose? " + mo1769e, new Object[0]);
            this.f86448h.f86356h0.accept(TuplesKt.m28425to(this.f86449i, wireRide));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m34761a(wireRide);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$N0 */
    /* loaded from: classes2.dex */
    public static final class C22920N0 extends Lambda implements Function1<J35.C3879a, Unit> {

        /* renamed from: g */
        public static final C22920N0 f86451g = new C22920N0();

        public C22920N0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34760a(J35.C3879a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String m101221h = it.m101221h();
            C41318g46.m40163a("requirements met for scan context: " + m101221h, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(J35.C3879a c3879a) {
            m34760a(c3879a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lkotlin/Pair;", "LXl5;", "LTk5;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$N1 */
    /* loaded from: classes2.dex */
    public static final class C22921N1 extends Lambda implements Function2<Optional<Pair<? extends C37099Xl5, ? extends C36154Tk5>>, Optional<Pair<? extends C37099Xl5, ? extends C36154Tk5>>, Boolean> {

        /* renamed from: g */
        public static final C22921N1 f86452g = new C22921N1();

        public C22921N1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<Pair<C37099Xl5, C36154Tk5>> t1, Optional<Pair<C37099Xl5, C36154Tk5>> t2) {
            String str;
            C37099Xl5 first;
            WirePhysicalLock m76371b;
            C37099Xl5 first2;
            WirePhysicalLock m76371b2;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            Pair<C37099Xl5, C36154Tk5> m59035e = t1.m59035e();
            String str2 = null;
            if (m59035e != null && (first2 = m59035e.getFirst()) != null && (m76371b2 = first2.m76371b()) != null) {
                str = m76371b2.getId();
            } else {
                str = null;
            }
            Pair<C37099Xl5, C36154Tk5> m59035e2 = t2.m59035e();
            if (m59035e2 != null && (first = m59035e2.getFirst()) != null && (m76371b = first.m76371b()) != null) {
                str2 = m76371b.getId();
            }
            return Boolean.valueOf(Intrinsics.areEqual(str, str2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$N2 */
    /* loaded from: classes2.dex */
    public static final class C22922N2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C23464b f86453g;

        /* renamed from: h */
        public final /* synthetic */ C42483i25 f86454h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f86455i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22922N2(C23464b c23464b, C42483i25 c42483i25, WireBird wireBird) {
            super(1);
            this.f86453g = c23464b;
            this.f86454h = c42483i25;
            this.f86455i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            this.f86453g.dispose();
            C42483i25 c42483i25 = this.f86454h;
            WireBird wireBird = this.f86455i;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c42483i25.m34935m4(wireBird, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000 \u0005*D\u0012>\b\u0001\u0012:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "pair", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$O */
    /* loaded from: classes2.dex */
    public static final class C22923O extends Lambda implements Function1<Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>>, InterfaceC23434B<? extends Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireRide;", "rides", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$O$a */
        /* loaded from: classes2.dex */
        public static final class C22924a extends Lambda implements Function1<List<? extends WireRide>, Optional<List<? extends WireRide>>> {

            /* renamed from: g */
            public static final C22924a f86457g = new C22924a();

            public C22924a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<List<WireRide>> invoke(List<WireRide> rides) {
                Intrinsics.checkNotNullParameter(rides, "rides");
                return Optional.f63040c.m59032c(rides);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireRide;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$O$b */
        /* loaded from: classes2.dex */
        public static final class C22925b extends Lambda implements Function1<Optional<List<? extends WireRide>>, Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>>> {

            /* renamed from: g */
            public final /* synthetic */ Pair<Optional<WireCoupon>, Optional<WireCoupon>> f86458g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22925b(Pair<Optional<WireCoupon>, Optional<WireCoupon>> pair) {
                super(1);
                this.f86458g = pair;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Optional<WireCoupon>, Optional<WireCoupon>> invoke(Optional<List<WireRide>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f86458g;
            }
        }

        public C22923O() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m34756c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final Pair m34755d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>>> invoke(Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>> pair) {
            return invoke2((Pair<Optional<WireCoupon>, Optional<WireCoupon>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Pair<Optional<WireCoupon>, Optional<WireCoupon>>> invoke2(Pair<Optional<WireCoupon>, Optional<WireCoupon>> pair) {
            Intrinsics.checkNotNullParameter(pair, "pair");
            AbstractC24507p<List<WireRide>> mo75039i = C42483i25.this.m35012f4().mo75039i();
            final C22924a c22924a = C22924a.f86457g;
            Observable m32045d0 = mo75039i.m32067H(new InterfaceC23492o() { // from class: l25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m34756c;
                    m34756c = C42483i25.C22923O.m34756c(Function1.this, obj);
                    return m34756c;
                }
            }).m32035j(Optional.f63040c.m59034a()).m32045d0();
            final C22925b c22925b = new C22925b(pair);
            return m32045d0.map(new InterfaceC23492o() { // from class: m25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m34755d;
                    m34755d = C42483i25.C22923O.m34755d(Function1.this, obj);
                    return m34755d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$O0 */
    /* loaded from: classes2.dex */
    public static final class C22926O0 extends Lambda implements Function1<Unit, Unit> {
        public C22926O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42483i25.this.f86331Q.snackToast(C45871nl4.operator_on_duty_onboarding_all_set);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000122\u0010\u0005\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0004*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lkotlin/Pair;", "LXl5;", "LTk5;", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$O1 */
    /* loaded from: classes2.dex */
    public static final class C22927O1 extends Lambda implements Function1<Optional<Pair<? extends C37099Xl5, ? extends C36154Tk5>>, Pair<? extends C37099Xl5, ? extends C36154Tk5>> {

        /* renamed from: g */
        public static final C22927O1 f86460g = new C22927O1();

        public C22927O1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<C37099Xl5, C36154Tk5> invoke(Optional<Pair<C37099Xl5, C36154Tk5>> optional) {
            return optional.m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00050\u0007 \n*\"\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00050\u0007\u0018\u00010\u00050\u0005 \n*P\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00050\u0007 \n*\"\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00050\u0007\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"", "", "LFH3;", "parkingStatusesByRideId", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/RiderAreaState;", "", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderAreaState$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n135#2,9:4446\n215#2:4455\n216#2:4458\n144#2:4459\n1#3:4456\n1#3:4457\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderAreaState$1\n*L\n4005#1:4446,9\n4005#1:4455\n4005#1:4458\n4005#1:4459\n4005#1:4457\n*E\n"})
    /* renamed from: i25$O2 */
    /* loaded from: classes2.dex */
    public static final class C22928O2 extends Lambda implements Function1<Map<String, ? extends FH3>, InterfaceC23447K<? extends Pair<? extends RiderAreaState, ? extends List<? extends Pair<? extends WireBird, ? extends BirdClusterItemState>>>>> {
        public C22928O2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<RiderAreaState, List<Pair<WireBird, BirdClusterItemState>>>> invoke(Map<String, ? extends FH3> parkingStatusesByRideId) {
            RiderAreaState riderAreaState;
            Pair pair;
            WireRide ride;
            WireBird bird;
            Intrinsics.checkNotNullParameter(parkingStatusesByRideId, "parkingStatusesByRideId");
            C41318g46.m40163a("received parking status by ride id update, computing changes now", new Object[0]);
            if (C42483i25.this.m35012f4().mo75061N() && C42483i25.this.m34942l8()) {
                riderAreaState = C42483i25.this.f86343b.mo64002d();
                Intrinsics.checkNotNull(riderAreaState);
            } else {
                riderAreaState = IN_SERVICE_AREA.INSTANCE;
            }
            C42483i25 c42483i25 = C42483i25.this;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends FH3> entry : parkingStatusesByRideId.entrySet()) {
                String key = entry.getKey();
                FH3 value = entry.getValue();
                C41318g46.m40163a("computing state for ride id " + key + " with parking status " + value, new Object[0]);
                RideState mo75038i1 = c42483i25.m35012f4().mo75038i1(key);
                if (mo75038i1 == null || (ride = mo75038i1.getRide()) == null || (bird = ride.getBird()) == null || (pair = TuplesKt.m28425to(bird, c42483i25.m34875r9(value))) == null) {
                    C41318g46.m40163a("Could not find ride/bird for rideId " + key, new Object[0]);
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return AbstractC23442F.m33158H(TuplesKt.m28425to(riderAreaState, arrayList));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$P */
    /* loaded from: classes2.dex */
    public static final class C22929P extends Lambda implements Function1<Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>>, Unit> {
        public C22929P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>> pair) {
            invoke2((Pair<Optional<WireCoupon>, Optional<WireCoupon>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<WireCoupon>, Optional<WireCoupon>> pair) {
            List listOfNotNull;
            WireCoupon m59035e = pair.component1().m59035e();
            WireCoupon m59035e2 = pair.component2().m59035e();
            CouponOrigin origin = m59035e != null ? m59035e.getOrigin() : null;
            CouponOrigin couponOrigin = CouponOrigin.LOW_BATTERY_RIDE;
            if (origin != couponOrigin) {
                if ((m59035e2 != null ? m59035e2.getOrigin() : null) != couponOrigin) {
                    return;
                }
            }
            C42483i25 c42483i25 = C42483i25.this;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new WireCoupon[]{m59035e, m59035e2});
            c42483i25.m34843u8(listOfNotNull);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$P0 */
    /* loaded from: classes2.dex */
    public static final class C22930P0 extends Lambda implements Function1<J35.C3879a, Boolean> {

        /* renamed from: g */
        public static final C22930P0 f86463g = new C22930P0();

        public C22930P0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(J35.C3879a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m101226c() == RideRequirementReason.SCAN) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$P2 */
    /* loaded from: classes2.dex */
    public static final class C22932P2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22932P2 f86465g = new C22932P2();

        public C22932P2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while subscribed to rider area state events, retrying...", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideRequirement;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$Q */
    /* loaded from: classes2.dex */
    public static final class C22933Q extends Lambda implements Function1<RideRequirement, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f86466g;

        /* renamed from: h */
        public final /* synthetic */ C42483i25 f86467h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22933Q(boolean z, C42483i25 c42483i25) {
            super(1);
            this.f86466g = z;
            this.f86467h = c42483i25;
        }

        /* renamed from: a */
        public final void m34747a(RideRequirement rideRequirement) {
            if (this.f86466g) {
                return;
            }
            if (rideRequirement instanceof RideRequirement.AutoPayV2) {
                this.f86467h.f86337W.mo40695M1(FlightBannerNode.FlightBanner.ONBOARDING_START);
            } else if (rideRequirement instanceof RideRequirement.Payment) {
                this.f86467h.f86337W.mo40695M1(FlightBannerNode.FlightBanner.ONBOARDING_START);
            } else {
                this.f86467h.f86337W.mo40694N1(FlightBannerNode.FlightBanner.ONBOARDING_START);
                this.f86467h.f86337W.mo40695M1(FlightBannerNode.FlightBanner.ONBOARDING_IN_PROGRESS);
            }
            this.f86467h.f86382v.mo55956N(new OnboardingTeaserShown());
            this.f86467h.f86340Z.accept(Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideRequirement rideRequirement) {
            m34747a(rideRequirement);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$Q0 */
    /* loaded from: classes2.dex */
    public static final class C22934Q0 extends Lambda implements Function1<J35.C3879a, Unit> {

        /* renamed from: g */
        public static final C22934Q0 f86468g = new C22934Q0();

        public C22934Q0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34746a(J35.C3879a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String m101221h = it.m101221h();
            C41318g46.m40163a("requirements met for scan context: " + m101221h, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(J35.C3879a c3879a) {
            m34746a(c3879a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$Q1 */
    /* loaded from: classes2.dex */
    public static final class C22935Q1 extends Lambda implements Function1<Unit, Unit> {
        public C22935Q1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41318g46.m40163a("ride button clicked", new Object[0]);
            C42483i25.this.m35214L7();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012J\u0010\u0002\u001aF\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00030\u0005 \b*\"\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00030\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RiderAreaState;", "", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$Q2 */
    /* loaded from: classes2.dex */
    public static final class C22936Q2 extends Lambda implements Function1<Pair<? extends RiderAreaState, ? extends List<? extends Pair<? extends WireBird, ? extends BirdClusterItemState>>>, Unit> {
        public C22936Q2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RiderAreaState, ? extends List<? extends Pair<? extends WireBird, ? extends BirdClusterItemState>>> pair) {
            invoke2((Pair<? extends RiderAreaState, ? extends List<? extends Pair<WireBird, ? extends BirdClusterItemState>>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends RiderAreaState, ? extends List<? extends Pair<WireBird, ? extends BirdClusterItemState>>> pair) {
            boolean areEqual = Intrinsics.areEqual(pair.component1(), OUTSIDE_SERVICE_AREA.INSTANCE);
            C42483i25.this.f86358i0.accept(Boolean.valueOf(areEqual));
            for (Pair<WireBird, ? extends BirdClusterItemState> pair2 : pair.component2()) {
                WireBird component1 = pair2.component1();
                BirdClusterItemState component2 = pair2.component2();
                String code = component1.getCode();
                C41318g46.m40163a("setting state for " + code + " to " + component2, new Object[0]);
                C42483i25.this.f86330P.mo104254x3(component2, component1);
            }
            if (areEqual) {
                MapAreasUi.DefaultImpls.updateAreasUi$default(C42483i25.this.f86330P, 0.0f, null, 2, null);
                if (C42483i25.this.f86352f0) {
                    C42483i25 c42483i25 = C42483i25.this;
                    c42483i25.m35293D9(c42483i25.m34979i4(), C42483i25.this.f86343b.mo63995r().m73665a());
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/RideRequirement;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$R */
    /* loaded from: classes2.dex */
    public static final class C22937R extends Lambda implements Function1<RideRequirement, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ boolean f86471g;

        /* renamed from: h */
        public final /* synthetic */ C42483i25 f86472h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$R$a */
        /* loaded from: classes2.dex */
        public static final class C22938a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86473g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22938a(C42483i25 c42483i25) {
                super(1);
                this.f86473g = c42483i25;
            }

            /* renamed from: a */
            public final void m34738a(InterfaceC23465c interfaceC23465c) {
                this.f86473g.f86382v.mo55956N(new OnboardingTeaserShown());
                this.f86473g.f86340Z.accept(Boolean.TRUE);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m34738a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$R$b */
        /* loaded from: classes2.dex */
        public static final class C22939b extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86474g;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: i25$R$b$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C22940a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DialogResponse.values().length];
                    try {
                        iArr[DialogResponse.OK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DialogResponse.DISMISS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22939b(C42483i25 c42483i25) {
                super(1);
                this.f86474g = c42483i25;
            }

            /* renamed from: a */
            public final void m34737a(DialogResponse dialogResponse) {
                int i;
                if (dialogResponse == null) {
                    i = -1;
                } else {
                    i = C22940a.$EnumSwitchMapping$0[dialogResponse.ordinal()];
                }
                if (i != 1) {
                    if (i == 2) {
                        this.f86474g.f86362k0 = true;
                        return;
                    }
                    return;
                }
                this.f86474g.f86382v.mo55905y(new C34596Mt4(null, null, null, Boolean.valueOf(UserKt.isInRegistration(this.f86474g.f86379t.m37750B0())), null, "action_sheet", 7, null));
                InterfaceC48572sJ4.C28260a.checkRequirementsSilently$default(this.f86474g.f86335U, null, RideRequirementReason.ONBOARDING_BANNER, null, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m34737a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22937R(boolean z, C42483i25 c42483i25) {
            super(1);
            this.f86471g = z;
            this.f86472h = c42483i25;
        }

        /* renamed from: e */
        public static final Unit m34741e(C42483i25 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f86331Q.mo75626Xa();
            return Unit.INSTANCE;
        }

        /* renamed from: f */
        public static final void m34740f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m34739g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(RideRequirement it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f86471g && !this.f86472h.m35034d4() && !this.f86472h.m35067a4() && !this.f86472h.f86362k0) {
                this.f86472h.m35045c4().mo7228a("calling show one flow onboarding dialog now", new Object[0]);
                AbstractC23442F<DialogResponse> mo75659Ci = this.f86472h.f86331Q.mo75659Ci();
                final C22938a c22938a = new C22938a(this.f86472h);
                AbstractC23442F<DialogResponse> m33102v = mo75659Ci.m33102v(new InterfaceC23484g() { // from class: o25
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C42483i25.C22937R.m34740f(Function1.this, obj);
                    }
                });
                final C22939b c22939b = new C22939b(this.f86472h);
                return m33102v.m33101w(new InterfaceC23484g() { // from class: p25
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C42483i25.C22937R.m34739g(Function1.this, obj);
                    }
                }).m33159G();
            }
            C41318g46.AbstractC20723b m35045c4 = this.f86472h.m35045c4();
            boolean z = this.f86471g;
            boolean m35067a4 = this.f86472h.m35067a4();
            Object value = this.f86472h.f86340Z.getValue();
            m35045c4.mo7228a("calling dismiss one flow onboarding onboardingOneFlowBottomSheetEnabled=" + z + ", inRequirementCheck=" + m35067a4 + ", mutableRequirementBannerShown.value=" + value, new Object[0]);
            final C42483i25 c42483i25 = this.f86472h;
            return AbstractC23461c.m33078H(new Callable() { // from class: n25
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Unit m34741e;
                    m34741e = C42483i25.C22937R.m34741e(C42483i25.this);
                    return m34741e;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$R0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22941R0 extends FunctionReferenceImpl implements Function1<Unit, Unit> {
        public C22941R0(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m34736a(Unit p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            m34736a(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$R1 */
    /* loaded from: classes2.dex */
    public static final class C22942R1 extends Lambda implements Function1<Unit, Unit> {
        public C22942R1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            if (C42483i25.this.f86341a.m82623f8().m73665a().getPromoConfig().getEnablePromos()) {
                C42483i25.this.f86333S.mo37138L();
            } else {
                C42483i25.this.f86336V.mo44775a();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$R2 */
    /* loaded from: classes2.dex */
    public static final class C22943R2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22943R2 f86476g = new C22943R2();

        public C22943R2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while subscribed to rider area state events", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$S */
    /* loaded from: classes2.dex */
    public static final class C22944S extends Lambda implements Function1<Throwable, Unit> {
        public C22944S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C42483i25.this.m35045c4().mo7226d(th, "Error in onflow bottom sheet onboarding flow: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LJ35$a;", "it", "", C17296a.f69688o, "(LJ35$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$S0 */
    /* loaded from: classes2.dex */
    public static final class C22945S0 extends Lambda implements Function1<J35.C3879a, Boolean> {

        /* renamed from: g */
        public static final C22945S0 f86478g = new C22945S0();

        public C22945S0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(J35.C3879a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m101226c() == RideRequirementReason.RIDE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$S1 */
    /* loaded from: classes2.dex */
    public static final class C22946S1 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f86479g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22946S1(WireRide wireRide) {
            super(1);
            this.f86479g = wireRide;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            WireRide wireRide = this.f86479g;
            String str = (wireRide == null || (str = wireRide.getId()) == null) ? "???" : "???";
            C41318g46.m40158f(th, "Error while waiting for end ride conditions for ride " + str + ", ignoring and attempting to end ride now", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "rideState", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$S2 */
    /* loaded from: classes2.dex */
    public static final class C22947S2 extends Lambda implements Function1<Optional<RideState>, String> {

        /* renamed from: g */
        public static final C22947S2 f86480g = new C22947S2();

        public C22947S2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<RideState> rideState) {
            WireRide ride;
            Intrinsics.checkNotNullParameter(rideState, "rideState");
            RideState m59035e = rideState.m59035e();
            if (m59035e != null && (ride = m59035e.getRide()) != null) {
                return ride.getId();
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0004\u0018\u0001`\u00060\u0003j\u0002`\u0006H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/RideState$Status;", "Lco/bird/android/coreinterface/manager/RideActionRequest;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRideActionRequests$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$T */
    /* loaded from: classes2.dex */
    public static final class C22948T extends Lambda implements Function1<Pair<? extends String, ? extends RideState.Status>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: i25$T$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C22949a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RideState.Status.values().length];
                try {
                    iArr[RideState.Status.UNLOCKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RideState.Status.LOCKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RideState.Status.ENDED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C22948T() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends RideState.Status> pair) {
            invoke2((Pair<String, ? extends RideState.Status>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends RideState.Status> pair) {
            WireRide ride;
            String component1 = pair.component1();
            RideState.Status component2 = pair.component2();
            C42483i25.this.m35012f4().mo75043g1(component1, component2);
            RideState mo75038i1 = C42483i25.this.m35012f4().mo75038i1(component1);
            if (mo75038i1 == null || (ride = mo75038i1.getRide()) == null) {
                return;
            }
            WireBird bird = ride.getBird();
            if (bird != null) {
                InterfaceC46893pU4.C27310a.setFocusedBird$default(C42483i25.this.f86315A, bird, false, 2, null);
            }
            int i = C22949a.$EnumSwitchMapping$0[component2.ordinal()];
            if (i == 1) {
                C42483i25.this.mo35006g(ride);
            } else if (i == 2) {
                C42483i25.this.mo35061b(ride);
            } else if (i != 3) {
            } else {
                C42483i25.this.mo34973j(ride);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LJ35$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LJ35$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$T0 */
    /* loaded from: classes2.dex */
    public static final class C22950T0 extends Lambda implements Function1<J35.C3879a, Unit> {

        /* renamed from: g */
        public static final C22950T0 f86482g = new C22950T0();

        public C22950T0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34733a(J35.C3879a c3879a) {
            C41318g46.m40163a("requirement met for ride context ride now", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(J35.C3879a c3879a) {
            m34733a(c3879a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$T1 */
    /* loaded from: classes2.dex */
    public static final class C22951T1 extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C22951T1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34732a(InterfaceC23465c interfaceC23465c) {
            C42483i25.this.f86315A.mo15899j(RideUpdateState.ENDING);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m34732a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001ar\u00122\b\u0001\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005 \b*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u00040\u0004 \b*8\u00122\b\u0001\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005 \b*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "rideStateOptional", "Lio/reactivex/B;", "", "", "Lco/bird/android/model/persistence/Area;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$T2 */
    /* loaded from: classes2.dex */
    public static final class C22952T2 extends Lambda implements Function1<Optional<RideState>, InterfaceC23434B<? extends List<? extends Map<Area, ? extends DateTime>>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "list", "", "", "Lco/bird/android/model/persistence/Area;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,4445:1\n1#2:4446\n215#3,2:4447\n215#3,2:4449\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1\n*L\n3919#1:4447,2\n3949#1:4449,2\n*E\n"})
        /* renamed from: i25$T2$a */
        /* loaded from: classes2.dex */
        public static final class C22953a extends Lambda implements Function1<List<? extends Map<Area, ? extends DateTime>>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86485g;

            /* renamed from: h */
            public final /* synthetic */ RideState f86486h;

            @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1$currentAreaIds$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1549#2:4446\n1620#2,3:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1$currentAreaIds$2\n*L\n3918#1:4446\n3918#1:4447,3\n*E\n"})
            /* renamed from: i25$T2$a$a */
            /* loaded from: classes2.dex */
            public static final class C22954a extends Lambda implements Function0<List<? extends String>> {

                /* renamed from: g */
                public final /* synthetic */ Map<Area, DateTime> f86487g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C22954a(Map<Area, DateTime> map) {
                    super(0);
                    this.f86487g = map;
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends String> invoke() {
                    int collectionSizeOrDefault;
                    Set<Area> keySet = this.f86487g.keySet();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (Area area : keySet) {
                        arrayList.add(area.getId());
                    }
                    return arrayList;
                }
            }

            @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1$previousAreaIds$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1549#2:4446\n1620#2,3:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$subscribeToRiderEnteredArea$2$2$1$previousAreaIds$2\n*L\n3917#1:4446\n3917#1:4447,3\n*E\n"})
            /* renamed from: i25$T2$a$b */
            /* loaded from: classes2.dex */
            public static final class C22955b extends Lambda implements Function0<List<? extends String>> {

                /* renamed from: g */
                public final /* synthetic */ Map<Area, DateTime> f86488g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C22955b(Map<Area, DateTime> map) {
                    super(0);
                    this.f86488g = map;
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends String> invoke() {
                    int collectionSizeOrDefault;
                    Set<Area> keySet = this.f86488g.keySet();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (Area area : keySet) {
                        arrayList.add(area.getId());
                    }
                    return arrayList;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22953a(C42483i25 c42483i25, RideState rideState) {
                super(1);
                this.f86485g = c42483i25;
                this.f86486h = rideState;
            }

            /* renamed from: a */
            public static final List<String> m34728a(Lazy<? extends List<String>> lazy) {
                return lazy.getValue();
            }

            /* renamed from: b */
            public static final List<String> m34727b(Lazy<? extends List<String>> lazy) {
                return lazy.getValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Map<Area, ? extends DateTime>> list) {
                invoke2((List<? extends Map<Area, DateTime>>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends Map<Area, DateTime>> list) {
                Object first;
                Object last;
                Lazy lazy;
                Lazy lazy2;
                String str;
                String str2;
                Iterator it;
                C42483i25 c42483i25;
                Location location;
                RideState rideState;
                Iterator it2;
                Intrinsics.checkNotNullExpressionValue(list, "list");
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
                Map map = (Map) first;
                if (!(list.size() == 2)) {
                    first = null;
                }
                Map map2 = (Map) first;
                if (map2 == null) {
                    map2 = MapsKt__MapsKt.emptyMap();
                }
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
                Map map3 = (Map) last;
                Location m73665a = this.f86485g.f86355h.mo43616p().m73665a();
                lazy = LazyKt__LazyJVMKt.lazy(new C22955b(map2));
                lazy2 = LazyKt__LazyJVMKt.lazy(new C22954a(map3));
                C42483i25 c42483i252 = this.f86485g;
                RideState rideState2 = this.f86486h;
                Iterator it3 = map3.entrySet().iterator();
                while (true) {
                    str = "";
                    if (!it3.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it3.next();
                    Area area = (Area) entry.getKey();
                    DateTime dateTime = (DateTime) entry.getValue();
                    if (m34728a(lazy).contains(area.getId())) {
                        it2 = it3;
                    } else {
                        String id = area.getId();
                        String label = area.getLabel();
                        if (label == null) {
                            label = area.getTitle();
                        }
                        C41318g46.m40163a("tracking rider entered area " + id + " (title/label: " + label, new Object[0]);
                        InterfaceC1880Ea interfaceC1880Ea = c42483i252.f86382v;
                        String id2 = area.getId();
                        String id3 = rideState2.getRide().getId();
                        String label2 = area.getLabel();
                        String title = area.getTitle();
                        Integer maxSpeed = area.getMaxSpeed();
                        boolean noParking = area.getNoParking();
                        boolean noRides = area.getNoRides();
                        boolean operational = area.getOperational();
                        String partnerId = area.getPartnerId();
                        it2 = it3;
                        interfaceC1880Ea.mo55905y(new C44925m95(null, dateTime, null, id2, id3, label2, title, false, maxSpeed, noParking, noRides, operational, partnerId == null ? "" : partnerId, area.getPreferredParking(), area.getId(), Double.valueOf(m73665a.getLatitude()), Double.valueOf(m73665a.getLongitude()), null, Double.valueOf(m73665a.getSpeed()), Double.valueOf(m73665a.getAltitude()), Double.valueOf(m73665a.getAccuracy()), null, Boolean.TRUE, Long.valueOf(c42483i252.m35012f4().mo75032o0().m73665a().getActiveRideCount()), 5, null));
                    }
                    it3 = it2;
                }
                C42483i25 c42483i253 = this.f86485g;
                RideState rideState3 = this.f86486h;
                Iterator it4 = map2.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Area area2 = (Area) entry2.getKey();
                    DateTime dateTime2 = (DateTime) entry2.getValue();
                    if (m34727b(lazy2).contains(area2.getId())) {
                        it = it4;
                        c42483i25 = c42483i253;
                        location = m73665a;
                        rideState = rideState3;
                        str2 = str;
                    } else {
                        String id4 = area2.getId();
                        String label3 = area2.getLabel();
                        if (label3 == null) {
                            label3 = area2.getTitle();
                        }
                        C41318g46.m40163a("tracking rider exited area " + id4 + " (title/label: " + label3, new Object[0]);
                        InterfaceC1880Ea interfaceC1880Ea2 = c42483i253.f86382v;
                        String id5 = area2.getId();
                        String id6 = rideState3.getRide().getId();
                        String label4 = area2.getLabel();
                        String title2 = area2.getTitle();
                        Integer maxSpeed2 = area2.getMaxSpeed();
                        boolean noParking2 = area2.getNoParking();
                        boolean noRides2 = area2.getNoRides();
                        boolean operational2 = area2.getOperational();
                        String partnerId2 = area2.getPartnerId();
                        String str3 = partnerId2 == null ? str : partnerId2;
                        boolean preferredParking = area2.getPreferredParking();
                        String id7 = area2.getId();
                        double latitude = m73665a.getLatitude();
                        double longitude = m73665a.getLongitude();
                        str2 = str;
                        double accuracy = m73665a.getAccuracy();
                        double altitude = m73665a.getAltitude();
                        it = it4;
                        double speed = m73665a.getSpeed();
                        c42483i25 = c42483i253;
                        location = m73665a;
                        long activeRideCount = c42483i253.m35012f4().mo75032o0().m73665a().getActiveRideCount();
                        DateTime now = DateTime.now();
                        rideState = rideState3;
                        Intrinsics.checkNotNullExpressionValue(now, "now()");
                        interfaceC1880Ea2.mo55905y(new C46111o95(null, dateTime2, null, id5, id6, label4, title2, false, maxSpeed2, noParking2, noRides2, operational2, str3, preferredParking, id7, C46880pT0.m19253i(now, dateTime2), Double.valueOf(latitude), Double.valueOf(longitude), null, Double.valueOf(speed), Double.valueOf(altitude), Double.valueOf(accuracy), null, Boolean.TRUE, Long.valueOf(activeRideCount), 5, null));
                    }
                    str = str2;
                    it4 = it;
                    m73665a = location;
                    c42483i253 = c42483i25;
                    rideState3 = rideState;
                }
            }
        }

        public C22952T2() {
            super(1);
        }

        /* renamed from: c */
        public static final void m34729c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends List<Map<Area, DateTime>>> invoke(Optional<RideState> rideStateOptional) {
            Intrinsics.checkNotNullParameter(rideStateOptional, "rideStateOptional");
            RideState m59035e = rideStateOptional.m59035e();
            if (m59035e != null) {
                if (!RideStateKt.isInRide(m59035e)) {
                    m59035e = null;
                }
                if (m59035e != null) {
                    C42483i25 c42483i25 = C42483i25.this;
                    Observable m74549j0 = C37279Yf5.m74549j0(c42483i25.f86343b.mo64011O(), 2, true);
                    final C22953a c22953a = new C22953a(c42483i25, m59035e);
                    Observable doOnNext = m74549j0.doOnNext(new InterfaceC23484g() { // from class: G25
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C42483i25.C22952T2.m34729c(Function1.this, obj);
                        }
                    });
                    if (doOnNext != null) {
                        return doOnNext;
                    }
                }
            }
            return Observable.empty();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$U */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22956U extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C22956U f86489b = new C22956U();

        public C22956U() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LJ35$a;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LJ35$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$U0 */
    /* loaded from: classes2.dex */
    public static final class C22957U0 extends Lambda implements Function1<J35.C3879a, Unit> {

        /* renamed from: g */
        public static final C22957U0 f86490g = new C22957U0();

        public C22957U0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34726a(J35.C3879a c3879a) {
            C41318g46.m40163a("past throttle check for requirement met for ride context ride now", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(J35.C3879a c3879a) {
            m34726a(c3879a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n3391#2:305\n1#3:306\n*E\n"})
    /* renamed from: i25$U1 */
    /* loaded from: classes2.dex */
    public static final class C22958U1<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (java.lang.Boolean.valueOf(r4).booleanValue() != false) goto L8;
         */
        @Override // io.reactivex.functions.InterfaceC23480c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            RideMapState rideMapState = (RideMapState) t1;
            Optional.C14443a c14443a = Optional.f63040c;
            WireFrequentFlyerView wireFrequentFlyerView = (WireFrequentFlyerView) ((Optional) t2).m59035e();
            if (wireFrequentFlyerView != null) {
                if (rideMapState == RideMapState.NONE) {
                    z = true;
                } else {
                    z = false;
                }
            }
            wireFrequentFlyerView = null;
            return (R) c14443a.m59033b(wireFrequentFlyerView);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$U2 */
    /* loaded from: classes2.dex */
    public static final class C22959U2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22959U2 f86491g = new C22959U2();

        public C22959U2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Encountered error while listening for in ride area entry events, ignoring....", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "ridePasses", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "c", "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRidePassState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n288#2:4446\n289#2:4448\n1#3:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRidePassState$1\n*L\n3738#1:4446\n3738#1:4448\n*E\n"})
    /* renamed from: i25$V */
    /* loaded from: classes2.dex */
    public static final class C22960V extends Lambda implements Function1<List<? extends RidePassView>, InterfaceC24574u<? extends Pair<? extends RidePassView, ? extends DialogResponse>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$V$a */
        /* loaded from: classes2.dex */
        public static final class C22961a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86493g;

            /* renamed from: h */
            public final /* synthetic */ RidePassView f86494h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22961a(C42483i25 c42483i25, RidePassView ridePassView) {
                super(1);
                this.f86493g = c42483i25;
                this.f86494h = ridePassView;
            }

            /* renamed from: a */
            public final void m34720a(InterfaceC23465c interfaceC23465c) {
                InterfaceC1880Ea interfaceC1880Ea = this.f86493g.f86382v;
                String userRidePassId = this.f86494h.getUserRidePassId();
                if (userRidePassId == null) {
                    userRidePassId = "";
                }
                interfaceC1880Ea.mo55905y(new VU4(null, null, null, userRidePassId, this.f86494h.getLinkCode(), "alert", 7, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m34720a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "dialogResponse", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$V$b */
        /* loaded from: classes2.dex */
        public static final class C22962b extends Lambda implements Function1<DialogResponse, Pair<? extends RidePassView, ? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ RidePassView f86495g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22962b(RidePassView ridePassView) {
                super(1);
                this.f86495g = ridePassView;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<RidePassView, DialogResponse> invoke(DialogResponse dialogResponse) {
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                return TuplesKt.m28425to(this.f86495g, dialogResponse);
            }
        }

        public C22960V() {
            super(1);
        }

        /* renamed from: d */
        public static final void m34722d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final Pair m34721e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Pair<RidePassView, DialogResponse>> invoke(List<RidePassView> ridePasses) {
            RidePassView ridePassView;
            Object obj;
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(ridePasses, "ridePasses");
            C41318g46.m40163a("ineligible ride Passes: " + ridePasses, new Object[0]);
            C42483i25 c42483i25 = C42483i25.this;
            Iterator<T> it = ridePasses.iterator();
            while (true) {
                ridePassView = null;
                if (it.hasNext()) {
                    obj = it.next();
                    String userRidePassId = ((RidePassView) obj).getUserRidePassId();
                    if (userRidePassId != null && !c42483i25.f86379t.m37734F0(userRidePassId)) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RidePassView ridePassView2 = (RidePassView) obj;
            if (ridePassView2 != null) {
                if (ridePassView2.getUserRidePassId() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ridePassView = ridePassView2;
                }
            }
            C41318g46.m40163a("first unacked ride pass: " + ridePassView, new Object[0]);
            if (ridePassView != null) {
                C42483i25 c42483i252 = C42483i25.this;
                AbstractC23442F<DialogResponse> birdDialog = c42483i252.f86331Q.birdDialog(E12.f6851d, true, false);
                final C22961a c22961a = new C22961a(c42483i252, ridePassView);
                AbstractC23442F<DialogResponse> m33102v = birdDialog.m33102v(new InterfaceC23484g() { // from class: q25
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj2) {
                        C42483i25.C22960V.m34722d(Function1.this, obj2);
                    }
                });
                final C22962b c22962b = new C22962b(ridePassView);
                AbstractC24507p m33125j0 = m33102v.m33157I(new InterfaceC23492o() { // from class: r25
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj2) {
                        Pair m34721e;
                        m34721e = C42483i25.C22960V.m34721e(Function1.this, obj2);
                        return m34721e;
                    }
                }).m33125j0();
                if (m33125j0 != null) {
                    return m33125j0;
                }
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStatusUnlockButton;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusUnlockButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$V0 */
    /* loaded from: classes2.dex */
    public static final class C22963V0 extends Lambda implements Function1<RideStatusUnlockButton, Unit> {
        public C22963V0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34718a(RideStatusUnlockButton rideStatusUnlockButton) {
            C41318g46.m40163a("unlock button clicked: " + rideStatusUnlockButton, new Object[0]);
            InterfaceC42185hY4.C22678a.onUnlockClick$default(C42483i25.this, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusUnlockButton rideStatusUnlockButton) {
            m34718a(rideStatusUnlockButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LYz1;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$V1 */
    /* loaded from: classes2.dex */
    public static final class C22964V1 extends Lambda implements Function1<Optional<C37455Yz1>, Boolean> {

        /* renamed from: g */
        public static final C22964V1 f86497g = new C22964V1();

        public C22964V1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<C37455Yz1> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Loe6;", "kotlin.jvm.PlatformType", "error", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$V2 */
    /* loaded from: classes2.dex */
    public static final class C22965V2 extends Lambda implements Function1<Optional<C46396oe6>, Unit> {
        public C22965V2() {
            super(1);
        }

        /* renamed from: a */
        public final void m34716a(Optional<C46396oe6> optional) {
            if (!optional.m59037c()) {
                C41318g46.m40163a("No error present, attempting to dismiss unlock smartlock errors", new Object[0]);
                C42483i25.this.f86331Q.dismissIfCurrentDialogIsInstanceOf(Reflection.getOrCreateKotlinClass(C43255jL5.class), Reflection.getOrCreateKotlinClass(C44441lL5.class), Reflection.getOrCreateKotlinClass(C43848kL5.class), Reflection.getOrCreateKotlinClass(C42662iL5.class), Reflection.getOrCreateKotlinClass(VL5.class));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C46396oe6> optional) {
            m34716a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/RidePassView;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRidePassState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$W */
    /* loaded from: classes2.dex */
    public static final class C22966W extends Lambda implements Function1<Pair<? extends RidePassView, ? extends DialogResponse>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: i25$W$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C22967a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C22966W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RidePassView, ? extends DialogResponse> pair) {
            invoke2((Pair<RidePassView, ? extends DialogResponse>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<RidePassView, ? extends DialogResponse> pair) {
            RidePassView component1 = pair.component1();
            DialogResponse component2 = pair.component2();
            C41318g46.m40163a("ride pass ack dialog response " + component2, new Object[0]);
            String userRidePassId = component1.getUserRidePassId();
            if (userRidePassId != null) {
                C42483i25.this.f86379t.m37651a(userRidePassId);
            }
            InterfaceC1880Ea interfaceC1880Ea = C42483i25.this.f86382v;
            String userRidePassId2 = component1.getUserRidePassId();
            if (userRidePassId2 == null) {
                userRidePassId2 = "";
            }
            String str = userRidePassId2;
            String linkCode = component1.getLinkCode();
            int[] iArr = C22967a.$EnumSwitchMapping$0;
            int i = iArr[component2.ordinal()];
            interfaceC1880Ea.mo55905y(new UU4(null, null, null, str, linkCode, "alert", i != 1 ? i != 2 ? "ok" : "help" : "transfer", 7, null));
            int i2 = iArr[component2.ordinal()];
            if (i2 == 1) {
                InterfaceC40099e13.C19924a.goToRidePassV4$default(C42483i25.this.f86333S, null, 1, null);
            } else if (i2 != 2) {
            } else {
                C42483i25.this.f86333S.mo36922w3(Long.parseLong(component1.getZendeskArticleId()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032H\u0010\u0005\u001aD\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "LJ35$a;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$40\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$W0 */
    /* loaded from: classes2.dex */
    public static final class C22968W0 extends Lambda implements Function1<Triple<? extends J35.C3879a, ? extends Optional<WireBird>, ? extends Optional<WireBird>>, Optional<WireBird>> {
        public C22968W0() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Optional<WireBird> invoke(Triple<J35.C3879a, Optional<WireBird>, Optional<WireBird>> triple) {
            String str;
            String str2;
            WireBird wireBird;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            J35.C3879a component1 = triple.component1();
            Optional<WireBird> component2 = triple.component2();
            Optional<WireBird> component3 = triple.component3();
            boolean z = false;
            C41318g46.m40163a("requirements met for ride context: " + component1.m101221h(), new Object[0]);
            WireBird m59035e = component2.m59035e();
            if (m59035e == null && (m59035e = component3.m59035e()) == null) {
                m59035e = component1.m101227b();
            }
            WireBird wireBird2 = null;
            if (m59035e != null) {
                str = m59035e.getId();
            } else {
                str = null;
            }
            if (m59035e != null) {
                str2 = m59035e.getCode();
            } else {
                str2 = null;
            }
            C41318g46.m40163a("setting map bird to Bird(id=" + str + ", code=" + str2 + ")", new Object[0]);
            Reservation m59035e2 = C42483i25.this.f86361k.mo83798e().m73665a().m59035e();
            if (m59035e2 != null) {
                if (!(!m59035e2.isExpired())) {
                    m59035e2 = null;
                }
                if (m59035e2 != null) {
                    wireBird = m59035e2.getBird();
                    if (m59035e != null) {
                        if (wireBird != null && wireBird.isSame(m59035e)) {
                            z = true;
                        }
                        if (z) {
                            m59035e = wireBird;
                            return Optional.f63040c.m59033b(m59035e);
                        }
                    }
                    if (m59035e != null) {
                        if (!component2.m59037c()) {
                            wireBird2 = m59035e;
                        }
                        if (wireBird2 != null) {
                            C42483i25.this.f86315A.mo15908a(wireBird2, true);
                        }
                    }
                    return Optional.f63040c.m59033b(m59035e);
                }
            }
            wireBird = null;
            if (m59035e != null) {
            }
            if (m59035e != null) {
            }
            return Optional.f63040c.m59033b(m59035e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LYz1;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$W1 */
    /* loaded from: classes2.dex */
    public static final class C22969W1 extends Lambda implements Function1<Optional<C37455Yz1>, Unit> {
        public C22969W1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34714a(Optional<C37455Yz1> optional) {
            Unit unit;
            C37455Yz1 m59035e;
            if (optional != null && (m59035e = optional.m59035e()) != null) {
                C42483i25 c42483i25 = C42483i25.this;
                c42483i25.f86331Q.mo75623Y1(m59035e);
                c42483i25.f86382v.mo55905y(new C45561nE2(null, null, null, m59035e.m73941b(), 7, null));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                P75.C6268a.hideFrequentFlyerStatus$default(C42483i25.this.f86331Q, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C37455Yz1> optional) {
            m34714a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Loe6;", "kotlin.jvm.PlatformType", "error", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Loe6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$W2 */
    /* loaded from: classes2.dex */
    public static final class C22970W2 extends Lambda implements Function1<Optional<C46396oe6>, C46396oe6> {

        /* renamed from: g */
        public static final C22970W2 f86502g = new C22970W2();

        public C22970W2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C46396oe6 invoke(Optional<C46396oe6> optional) {
            return optional.m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$X */
    /* loaded from: classes2.dex */
    public static final class C22971X extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22971X f86503g = new C22971X();

        public C22971X() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while acking ineligible user ride pass id", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$X0 */
    /* loaded from: classes2.dex */
    public static final class C22972X0 extends Lambda implements Function1<Optional<WireBird>, Unit> {
        public C22972X0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34712a(Optional<WireBird> optional) {
            if (!optional.m59037c()) {
                C42483i25.this.f86315A.mo15899j(RideUpdateState.NONE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireBird> optional) {
            m34712a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onResume$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$X1 */
    /* loaded from: classes2.dex */
    public static final class C22973X1 extends Lambda implements Function1<Optional<View>, Unit> {
        public C22973X1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34711a(Optional<View> optional) {
            View m59035e = optional.m59035e();
            if (m59035e != null) {
                C42483i25.this.f86331Q.mo75580yk(m59035e);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<View> optional) {
            m34711a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Loe6;", "error", "Lkotlin/Pair;", "", "Ljava/io/Serializable;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Loe6;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$X2 */
    /* loaded from: classes2.dex */
    public static final class C22974X2 extends Lambda implements Function1<C46396oe6, Pair<? extends String, ? extends Serializable>> {

        /* renamed from: g */
        public static final C22974X2 f86506g = new C22974X2();

        public C22974X2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<String, Serializable> invoke(C46396oe6 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            String id = error.m20708c().getId();
            Object m20709b = error.m20709b();
            if (m20709b == null) {
                m20709b = error.m20707d();
            }
            return TuplesKt.m28425to(id, m20709b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u000e\u0010\u000e\u001a\u00028\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000\"\b\b\u0005\u0010\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "T5", "R", "t1", "t2", "t3", "t4", "t5", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$6\n+ 2 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl\n*L\n1#1,304:1\n4149#2:305\n*E\n"})
    /* renamed from: i25$Y */
    /* loaded from: classes2.dex */
    public static final class C22975Y<T1, T2, T3, T4, T5, R> implements InterfaceC23487j<T1, T2, T3, T4, T5, R> {
        @Override // io.reactivex.functions.InterfaceC23487j
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return (R) new C35631Re4((RideStates) t1, (Optional) t2, (Optional) t3, (RideUpdateState) t4, (FH3) t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "birdOptional", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$Y0 */
    /* loaded from: classes2.dex */
    public static final class C22976Y0 extends Lambda implements Function1<Optional<WireBird>, InterfaceC23434B<? extends WireBird>> {
        public C22976Y0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WireBird> invoke(Optional<WireBird> birdOptional) {
            Intrinsics.checkNotNullParameter(birdOptional, "birdOptional");
            if (birdOptional.m59037c()) {
                WireBird m59038b = birdOptional.m59038b();
                RideConfig rideConfig = C42483i25.this.m35012f4().mo75030r().m73665a().getRideConfig();
                if (C42483i25.this.f86361k.mo83798e().getValue().m59037c() && rideConfig.getEnableScanlessReservedRideStart() && rideConfig.getEnableChirpOnScanlessRideStart()) {
                    C42483i25 c42483i25 = C42483i25.this;
                    return c42483i25.m35258H3(m59038b, c42483i25.m35012f4().mo75030r().m73665a().getRideConfig().getPreferChirpAlarmOnScanlessRideStart());
                }
                Observable just = Observable.just(m59038b);
                Intrinsics.checkNotNullExpressionValue(just, "{\n            Observable.just(bird)\n          }");
                return just;
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birds", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$Y1 */
    /* loaded from: classes2.dex */
    public static final class C22977Y1 extends Lambda implements Function1<List<? extends WireBird>, Unit> {
        public C22977Y1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> birds) {
            WireRide ride;
            C42483i25 c42483i25 = C42483i25.this;
            G95 g95 = c42483i25.f86330P;
            Intrinsics.checkNotNullExpressionValue(birds, "birds");
            List<WireBird> mo104257ei = g95.mo104257ei(birds);
            RideState m59035e = C42483i25.this.m35012f4().mo75057R().getValue().m59035e();
            c42483i25.m34864s9(mo104257ei, (m59035e == null || (ride = m59035e.getRide()) == null) ? null : ride.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Loe6;", "error", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Loe6;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$Y2 */
    /* loaded from: classes2.dex */
    public static final class C22978Y2 extends Lambda implements Function1<C46396oe6, InterfaceC23447K<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "dialogResponse", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$Y2$a */
        /* loaded from: classes2.dex */
        public static final class C22979a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86510g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22979a(C42483i25 c42483i25) {
                super(1);
                this.f86510g = c42483i25;
            }

            /* renamed from: a */
            public final void m34702a(DialogResponse dialogResponse) {
                if (dialogResponse == DialogResponse.OK) {
                    this.f86510g.f86331Q.showIndeterminateDialog(PM4.f28348a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m34702a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "dialogResponse", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$Y2$b */
        /* loaded from: classes2.dex */
        public static final class C22980b extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86511g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22980b(C42483i25 c42483i25) {
                super(1);
                this.f86511g = c42483i25;
            }

            /* renamed from: c */
            public static final void m34699c(C42483i25 this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f86331Q.dismissDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23447K<? extends DialogResponse> invoke(DialogResponse dialogResponse) {
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                if (dialogResponse == DialogResponse.OK) {
                    AbstractC23442F m33152N = InterfaceC46193oI5.C26897b.resetBluetooth$default(this.f86511g.f86365m, 0L, 1, null).m33046j0(dialogResponse).m33152N(C23454a.m33087a());
                    final C42483i25 c42483i25 = this.f86511g;
                    return m33152N.m33110r(new InterfaceC23478a() { // from class: K25
                        @Override // io.reactivex.functions.InterfaceC23478a
                        public final void run() {
                            C42483i25.C22978Y2.C22980b.m34699c(C42483i25.this);
                        }
                    });
                }
                return AbstractC23442F.m33158H(dialogResponse);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: i25$Y2$c */
        /* loaded from: classes2.dex */
        public static final class C22981c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C22981c f86512g = new C22981c();

            public C22981c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40158f(th, "Error while attempting to reset bluetooth", new Object[0]);
            }
        }

        public C22978Y2() {
            super(1);
        }

        /* renamed from: e */
        public static final InterfaceC23447K m34704e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m34703f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends DialogResponse> invoke(C46396oe6 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (!error.m20704g() && !error.m20705f() && !error.m20703h()) {
                if (error.m20706e()) {
                    if (C42483i25.this.f86380t0.contains(error.m20708c())) {
                        return AbstractC23442F.m33158H(DialogResponse.OTHER);
                    }
                    C42483i25.this.f86380t0.add(error.m20708c());
                    AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(C42483i25.this.f86331Q, C42662iL5.f87186d, false, false, 4, null);
                    final C22979a c22979a = new C22979a(C42483i25.this);
                    AbstractC23442F m33152N = birdDialog$default.m33101w(new InterfaceC23484g() { // from class: H25
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C42483i25.C22978Y2.invoke$lambda$0(Function1.this, obj);
                        }
                    }).m33152N(C24542a.m31934a());
                    final C22980b c22980b = new C22980b(C42483i25.this);
                    AbstractC23442F m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: I25
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23447K m34704e;
                            m34704e = C42483i25.C22978Y2.m34704e(Function1.this, obj);
                            return m34704e;
                        }
                    });
                    final C22981c c22981c = C22981c.f86512g;
                    return m33165A.m33106t(new InterfaceC23484g() { // from class: J25
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C42483i25.C22978Y2.m34703f(Function1.this, obj);
                        }
                    });
                }
                return AbstractC23442F.m33158H(DialogResponse.OTHER);
            }
            return AbstractC23442F.m33158H(DialogResponse.OTHER);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00030\u00032d\u0010\b\u001a`\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/RideUpdateState;", "LFH3;", "<name for destructuring parameter 0>", "La75;", C17296a.f69688o, "(LRe4;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRideStates$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n288#2,2:4449\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRideStates$2\n*L\n4179#1:4446,3\n4188#1:4449,2\n*E\n"})
    /* renamed from: i25$Z */
    /* loaded from: classes2.dex */
    public static final class C22982Z extends Lambda implements Function1<C35631Re4<? extends RideStates, ? extends Optional<Reservation>, ? extends Optional<WireBird>, ? extends RideUpdateState, ? extends FH3>, Optional<C37772a75>> {
        public C22982Z() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<C37772a75> invoke(C35631Re4<RideStates, Optional<Reservation>, Optional<WireBird>, ? extends RideUpdateState, ? extends FH3> c35631Re4) {
            String str;
            boolean z;
            Object first;
            boolean z2;
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            RideStates m86500a = c35631Re4.m86500a();
            Optional<Reservation> m86499b = c35631Re4.m86499b();
            Optional<WireBird> m86498c = c35631Re4.m86498c();
            RideUpdateState rideUpdateState = c35631Re4.m86497d();
            FH3 parkingStatus = c35631Re4.m86496e();
            String loggableString = m86500a.toLoggableString();
            WireBird m59035e = m86498c.m59035e();
            C37772a75 c37772a75 = null;
            if (m59035e != null) {
                str = m59035e.getCode();
            } else {
                str = null;
            }
            C41318g46.m40163a("ride status observable:\nrideStates: " + loggableString + "\nreservation: " + m86499b + "\nfocusedBird: " + str + "\nrideUpdateState: " + rideUpdateState + "\nparkingStatus: " + parkingStatus, new Object[0]);
            WireBird m59035e2 = m86498c.m59035e();
            Optional.C14443a c14443a = Optional.f63040c;
            if (m59035e2 != null && rideUpdateState == RideUpdateState.STARTING) {
                C37772a75.C10573a c10573a = C37772a75.f49850h;
                Intrinsics.checkNotNullExpressionValue(rideUpdateState, "rideUpdateState");
                Intrinsics.checkNotNullExpressionValue(parkingStatus, "parkingStatus");
                c37772a75 = c10573a.m71867b(m59035e2, rideUpdateState, parkingStatus, C42483i25.this.f86341a.m82623f8().m73665a());
            } else {
                List<RideState> rideStates = m86500a.getRideStates();
                if (!(rideStates instanceof Collection) || !rideStates.isEmpty()) {
                    for (RideState rideState : rideStates) {
                        if (RideStateKt.isInRide(rideState)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z && m86499b.m59037c() && !m86499b.m59038b().isExpired()) {
                    Intrinsics.checkNotNullExpressionValue(rideUpdateState, "rideUpdateState");
                    Intrinsics.checkNotNullExpressionValue(parkingStatus, "parkingStatus");
                    c37772a75 = C37772a75.C10573a.invoke$default(C37772a75.f49850h, m86499b.m59038b(), (WireBird) null, rideUpdateState, parkingStatus, C42483i25.this.f86341a.m82623f8().m73665a(), 2, (Object) null);
                } else if (!m86500a.getRideStates().isEmpty()) {
                    if (m86498c.m59037c()) {
                        Iterator<T> it = m86500a.getRideStates().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            WireBird bird = ((RideState) next).getRide().getBird();
                            if (bird != null && bird.isSame(m86498c.m59038b())) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                c37772a75 = next;
                                break;
                            }
                        }
                        RideState rideState2 = (RideState) c37772a75;
                        if (rideState2 == null) {
                            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m86500a.getRideStates());
                            rideState2 = (RideState) first;
                        }
                        C37772a75.C10573a c10573a2 = C37772a75.f49850h;
                        List<RideState> rideStates2 = m86500a.getRideStates();
                        Intrinsics.checkNotNullExpressionValue(rideUpdateState, "rideUpdateState");
                        Intrinsics.checkNotNullExpressionValue(parkingStatus, "parkingStatus");
                        c37772a75 = C37772a75.C10573a.invoke$default(c10573a2, rideStates2, rideState2, null, rideUpdateState, parkingStatus, C42483i25.this.f86341a.m82623f8().m73665a(), 4, null);
                    } else {
                        C37772a75.C10573a c10573a3 = C37772a75.f49850h;
                        List<RideState> rideStates3 = m86500a.getRideStates();
                        Intrinsics.checkNotNullExpressionValue(rideUpdateState, "rideUpdateState");
                        Intrinsics.checkNotNullExpressionValue(parkingStatus, "parkingStatus");
                        c37772a75 = C37772a75.C10573a.invoke$default(c10573a3, rideStates3, (WireBird) null, rideUpdateState, parkingStatus, C42483i25.this.f86341a.m82623f8().m73665a(), 2, (Object) null);
                    }
                }
            }
            return c14443a.m59033b(c37772a75);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$Z0 */
    /* loaded from: classes2.dex */
    public static final class C22983Z0 extends Lambda implements Function1<WireBird, Unit> {
        public C22983Z0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34697a(WireBird bird) {
            C42483i25 c42483i25 = C42483i25.this;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            c42483i25.m35123U8(bird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m34697a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RideUpdateState;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideUpdateState;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$Z1 */
    /* loaded from: classes2.dex */
    public static final class C22984Z1 extends Lambda implements Function1<RideUpdateState, InterfaceC23434B<? extends RideStates>> {
        public C22984Z1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends RideStates> invoke(RideUpdateState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state != RideUpdateState.NONE) {
                return Observable.empty();
            }
            return C42483i25.this.m35012f4().mo75032o0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$Z2 */
    /* loaded from: classes2.dex */
    public static final class C22985Z2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22985Z2 f86516g = new C22985Z2();

        public C22985Z2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling unlock errors", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"Li25$a;", "", "", "BIRDS_NEARBY_POLL_INTERVAL_SECONDS", "J", "COMPLIANCE_WARNING_ON_AREA_UPDATE_THROTTLE_LIMIT_SECONDS", "DEEPLINK_FALLBACK_TIMEOUT_SECONDS", "FREE_RESERVE_BANNER_DURATION", "MANUAL_BIRDS_REFRESH_TIMEOUT_AFTER_ON_RESUME_MILLISECONDS", "PRIVATE_BIRDS_REFRESH_INTERVAL_MINUTES", "TIME_TO_WAIT_FOR_POSSIBLE_CAMERA_MOVEMENT", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: i25$a */
    /* loaded from: classes2.dex */
    public static final class C22986a {
        public /* synthetic */ C22986a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22986a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052B\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/buava/Optional;", "La75;", "kotlin.jvm.PlatformType", "list", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeRideStates$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$a0 */
    /* loaded from: classes2.dex */
    public static final class C22987a0 extends Lambda implements Function1<List<? extends Optional<C37772a75>>, Unit> {
        public C22987a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Optional<C37772a75>> list) {
            invoke2((List<Optional<C37772a75>>) list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(List<Optional<C37772a75>> list) {
            Object firstOrNull;
            C37772a75 c37772a75;
            Object lastOrNull;
            Intrinsics.checkNotNullExpressionValue(list, "list");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            Optional optional = (Optional) firstOrNull;
            if (optional != null) {
                if (!(list.size() == 2)) {
                    optional = null;
                }
                if (optional != null) {
                    c37772a75 = (C37772a75) optional.m59035e();
                    lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
                    Optional optional2 = (Optional) lastOrNull;
                    C37772a75 c37772a752 = optional2 != null ? (C37772a75) optional2.m59035e() : null;
                    C42483i25.this.f86331Q.mo75636Q2(c37772a752);
                    C42483i25.this.m34820w9(c37772a75, c37772a752);
                    C42483i25.this.m35315B9(c37772a75, c37772a752);
                    C42483i25.this.m35326A9(c37772a75, c37772a752);
                }
            }
            c37772a75 = null;
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
            Optional optional22 = (Optional) lastOrNull;
            if (optional22 != null) {
            }
            C42483i25.this.f86331Q.mo75636Q2(c37772a752);
            C42483i25.this.m34820w9(c37772a75, c37772a752);
            C42483i25.this.m35315B9(c37772a75, c37772a752);
            C42483i25.this.m35326A9(c37772a75, c37772a752);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$a1 */
    /* loaded from: classes2.dex */
    public static final class C22988a1 extends Lambda implements Function1<RideStates, Boolean> {

        /* renamed from: g */
        public static final C22988a1 f86518g = new C22988a1();

        public C22988a1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideStates it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getActiveRideCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "rideStates", "", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$a2 */
    /* loaded from: classes2.dex */
    public static final class C22989a2 extends Lambda implements Function1<RideStates, List<? extends RideState>> {

        /* renamed from: g */
        public static final C22989a2 f86519g = new C22989a2();

        public C22989a2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<RideState> invoke(RideStates rideStates) {
            Intrinsics.checkNotNullParameter(rideStates, "rideStates");
            return rideStates.getRideStates();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$a3 */
    /* loaded from: classes2.dex */
    public static final class C22990a3 extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f86521h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f86522i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22990a3(WireRide wireRide, DateTime dateTime) {
            super(1);
            this.f86521h = wireRide;
            this.f86522i = dateTime;
        }

        /* renamed from: a */
        public final void m34693a(WireBird it) {
            C42483i25 c42483i25 = C42483i25.this;
            WireRide wireRide = this.f86521h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            DateTime operationStart = this.f86522i;
            Intrinsics.checkNotNullExpressionValue(operationStart, "operationStart");
            c42483i25.m34902p4(wireRide, it, operationStart);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m34693a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Li25$b;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "Lco/bird/android/model/wire/WireBird;", "()Lco/bird/android/model/wire/WireBird;", "bird", "", "b", "F", "()F", "distanceFromDeeplinkLatLng", "<init>", "(Lco/bird/android/model/wire/WireBird;F)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: i25$b */
    /* loaded from: classes2.dex */
    public static final class C22991b {

        /* renamed from: a */
        public final WireBird f86523a;

        /* renamed from: b */
        public final float f86524b;

        public C22991b(WireBird bird, float f) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            this.f86523a = bird;
            this.f86524b = f;
        }

        /* renamed from: a */
        public final WireBird m34692a() {
            return this.f86523a;
        }

        /* renamed from: b */
        public final float m34691b() {
            return this.f86524b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C22991b) {
                C22991b c22991b = (C22991b) obj;
                return Intrinsics.areEqual(this.f86523a, c22991b.f86523a) && Float.compare(this.f86524b, c22991b.f86524b) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (this.f86523a.hashCode() * 31) + Float.hashCode(this.f86524b);
        }

        public String toString() {
            WireBird wireBird = this.f86523a;
            float f = this.f86524b;
            return "PotentialDeeplinkBird(bird=" + wireBird + ", distanceFromDeeplinkLatLng=" + f + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$b0 */
    /* loaded from: classes2.dex */
    public static final class C22992b0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C22992b0 f86525g = new C22992b0();

        public C22992b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "CRITICAL observeRideStates stream errored out!!", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$b1 */
    /* loaded from: classes2.dex */
    public static final class C22993b1 extends Lambda implements Function1<Triple<? extends Optional<Reservation>, ? extends Boolean, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public static final C22993b1 f86526g = new C22993b1();

        public C22993b1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34690a(Triple<Optional<Reservation>, Boolean, Boolean> triple) {
            triple.component1();
            triple.component3();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<Reservation>, ? extends Boolean, ? extends Boolean> triple) {
            m34690a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "rideStates", "", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1549#2:4446\n1620#2,3:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onResume$5\n*L\n3363#1:4446\n3363#1:4447,3\n*E\n"})
    /* renamed from: i25$b2 */
    /* loaded from: classes2.dex */
    public static final class C22994b2 extends Lambda implements Function1<List<? extends RideState>, Unit> {
        public C22994b2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RideState> list) {
            invoke2((List<RideState>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RideState> rideStates) {
            int collectionSizeOrDefault;
            String joinToString$default;
            Intrinsics.checkNotNullExpressionValue(rideStates, "rideStates");
            List<RideState> list = rideStates;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (RideState rideState : list) {
                arrayList.add(rideState.getRide().getId());
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, "rideIds: ", null, 0, null, null, 61, null);
            C41318g46.m40163a("setActiveRides being called on " + joinToString$default, new Object[0]);
            C42483i25.this.m34931m8();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$b3 */
    /* loaded from: classes2.dex */
    public static final class C22995b3 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f86529h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f86530i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22995b3(WireRide wireRide, DateTime dateTime) {
            super(1);
            this.f86529h = wireRide;
            this.f86530i = dateTime;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C42483i25 c42483i25 = C42483i25.this;
            WireRide wireRide = this.f86529h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            DateTime operationStart = this.f86530i;
            Intrinsics.checkNotNullExpressionValue(operationStart, "operationStart");
            c42483i25.m34913o4(wireRide, it, operationStart);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C22996c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LongTermRentalSignUpResult.EnumC16264b.values().length];
            try {
                iArr[LongTermRentalSignUpResult.EnumC16264b.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongTermRentalSignUpResult.EnumC16264b.SIGNED_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParkingType.values().length];
            try {
                iArr2[ParkingType.PREFERRED_PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0006*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0006*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeScanlessRideEligibleBirds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$observeScanlessRideEligibleBirds$1\n*L\n3708#1:4446,3\n*E\n"})
    /* renamed from: i25$c0 */
    /* loaded from: classes2.dex */
    public static final class C22997c0 extends Lambda implements Function1<Pair<? extends List<? extends ScanlessRideItem>, ? extends Optional<WireBird>>, Unit> {
        public C22997c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends ScanlessRideItem>, ? extends Optional<WireBird>> pair) {
            invoke2((Pair<? extends List<ScanlessRideItem>, Optional<WireBird>>) pair);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
            if (r6 == false) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Pair<? extends List<ScanlessRideItem>, Optional<WireBird>> pair) {
            boolean z;
            boolean z2;
            Object first;
            boolean z3;
            boolean z4;
            List<ScanlessRideItem> availableScanlessBirds = pair.component1();
            Optional<WireBird> component2 = pair.component2();
            WireBird m59035e = component2.m59035e();
            boolean z5 = false;
            if (m59035e != null) {
                if (!m59035e.isScanlessRideEligible()) {
                    Intrinsics.checkNotNullExpressionValue(availableScanlessBirds, "availableScanlessBirds");
                    List<ScanlessRideItem> list = availableScanlessBirds;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (ScanlessRideItem scanlessRideItem : list) {
                            if (Intrinsics.areEqual(scanlessRideItem.getBird().getId(), m59035e.getId()) || Intrinsics.areEqual(scanlessRideItem.getBird().getEphemeralId(), m59035e.getId())) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    boolean z6 = z4;
                }
            }
            m59035e = null;
            if (C42483i25.this.m35012f4().mo75032o0().m73665a().getActiveRideCount() == 0) {
                Intrinsics.checkNotNullExpressionValue(availableScanlessBirds, "availableScanlessBirds");
                if (!availableScanlessBirds.isEmpty()) {
                    z = true;
                    z2 = (z || component2.m59037c()) ? false : true;
                    if (z && m59035e != null) {
                        z5 = true;
                    }
                    C42483i25.this.f86337W.mo40693O1(FlightBannerNode.FlightBanner.QUICK_START_BIRD_UNSELECTED, z2);
                    C42483i25.this.f86337W.mo40693O1(FlightBannerNode.FlightBanner.QUICK_START_BIRD_SELECTED, z5);
                    if (z2) {
                        return;
                    }
                    G95 g95 = C42483i25.this.f86330P;
                    Intrinsics.checkNotNullExpressionValue(availableScanlessBirds, "availableScanlessBirds");
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) availableScanlessBirds);
                    g95.deselect(((ScanlessRideItem) first).getBird());
                    return;
                }
            }
            z = false;
            if (z) {
            }
            if (z) {
                z5 = true;
            }
            C42483i25.this.f86337W.mo40693O1(FlightBannerNode.FlightBanner.QUICK_START_BIRD_UNSELECTED, z2);
            C42483i25.this.f86337W.mo40693O1(FlightBannerNode.FlightBanner.QUICK_START_BIRD_SELECTED, z5);
            if (z2) {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0007\u001a\u00020\u00032.\u0010\u0005\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00002.\u0010\u0006\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "", "kotlin.jvm.PlatformType", "t1", "t2", C17296a.f69688o, "(Lkotlin/Triple;Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$c1 */
    /* loaded from: classes2.dex */
    public static final class C22998c1 extends Lambda implements Function2<Triple<? extends Optional<Reservation>, ? extends Boolean, ? extends Boolean>, Triple<? extends Optional<Reservation>, ? extends Boolean, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C22998c1 f86532g = new C22998c1();

        public C22998c1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Triple<Optional<Reservation>, Boolean, Boolean> t1, Triple<Optional<Reservation>, Boolean, Boolean> t2) {
            boolean z;
            WireBird wireBird;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            if (Intrinsics.areEqual(t1, t2)) {
                Reservation m59035e = t1.getFirst().m59035e();
                WireBird wireBird2 = null;
                if (m59035e != null) {
                    wireBird = m59035e.getBird();
                } else {
                    wireBird = null;
                }
                Reservation m59035e2 = t2.getFirst().m59035e();
                if (m59035e2 != null) {
                    wireBird2 = m59035e2.getBird();
                }
                if (Intrinsics.areEqual(wireBird, wireBird2)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "optionalView", "LYz1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onResume$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$c2 */
    /* loaded from: classes2.dex */
    public static final class C22999c2 extends Lambda implements Function1<Optional<WireFrequentFlyerView>, Optional<C37455Yz1>> {

        /* renamed from: g */
        public static final C22999c2 f86533g = new C22999c2();

        public C22999c2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<C37455Yz1> invoke(Optional<WireFrequentFlyerView> optionalView) {
            String mapStatus;
            boolean isBlank;
            Optional<C37455Yz1> m59032c;
            Intrinsics.checkNotNullParameter(optionalView, "optionalView");
            WireFrequentFlyerView m59035e = optionalView.m59035e();
            if (m59035e != null && (mapStatus = m59035e.getMapStatus()) != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(mapStatus);
                if (!(!isBlank)) {
                    mapStatus = null;
                }
                if (mapStatus != null && (m59032c = Optional.f63040c.m59032c(new C37455Yz1(mapStatus, m59035e.getProgress()))) != null) {
                    return m59032c;
                }
            }
            return Optional.f63040c.m59034a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062$\u0010\u0005\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/RideState;", "<name for destructuring parameter 0>", "LO12;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)LO12;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$c3 */
    /* loaded from: classes2.dex */
    public static final class C23000c3 extends Lambda implements Function1<Pair<? extends Optional<List<? extends WireBird>>, ? extends Optional<RideState>>, O12> {

        /* renamed from: g */
        public static final C23000c3 f86534g = new C23000c3();

        public C23000c3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final O12 invoke(Pair<Optional<List<WireBird>>, Optional<RideState>> pair) {
            boolean z;
            WireRide wireRide;
            WirePrivateBird wirePrivateBird;
            WireBird bird;
            List<WirePhysicalLock> physicalLocks;
            Object firstOrNull;
            WireBird bird2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<RideState> component2 = pair.component2();
            List<WireBird> m59035e = pair.component1().m59035e();
            boolean z2 = false;
            if (m59035e != null && !m59035e.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            boolean z3 = !z;
            WirePhysicalLock wirePhysicalLock = null;
            if (C42149hU4.m36358a(component2)) {
                wireRide = component2.m59038b().getRide();
            } else {
                wireRide = null;
            }
            if (wireRide != null && (bird2 = wireRide.getBird()) != null) {
                wirePrivateBird = bird2.getPrivateBird();
            } else {
                wirePrivateBird = null;
            }
            if (wirePrivateBird != null) {
                z2 = true;
            }
            if (wireRide != null && (bird = wireRide.getBird()) != null && (physicalLocks = bird.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                wirePhysicalLock = (WirePhysicalLock) firstOrNull;
            }
            if (wirePhysicalLock != null && !z2) {
                return new O12.C5811c(wirePhysicalLock);
            }
            if (wirePhysicalLock != null && z2) {
                return new O12.C5812d(wirePhysicalLock);
            }
            if (wireRide == null && z3) {
                return O12.C5813e.f25525a;
            }
            return O12.C5810b.f25522a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/LastLockComplianceModel;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$d */
    /* loaded from: classes2.dex */
    public static final class C23001d extends Lambda implements Function1<HM4<LastLockComplianceModel>, Unit> {
        public C23001d() {
            super(1);
        }

        /* renamed from: a */
        public final void m34686a(HM4<LastLockComplianceModel> hm4) {
            LastLockComplianceModel m103944a = hm4.m103944a();
            if (m103944a != null) {
                C42483i25 c42483i25 = C42483i25.this;
                Config m73665a = c42483i25.m35012f4().mo75030r().m73665a();
                String rideId = m103944a.getRideId();
                if (rideId != null && !Intrinsics.areEqual(rideId, c42483i25.f86379t.m37630e1())) {
                    if ((m103944a.getWarnNotCompliant() && m73665a.getShowPhysicalLockLastNonCompliantModal()) || (m103944a.getShowCompliant() && m73665a.getShowPhysicalLockLastCompliantModal())) {
                        c42483i25.f86379t.m37633d2(rideId);
                        c42483i25.f86333S.mo37076W1(m103944a);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<LastLockComplianceModel> hm4) {
            m34686a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$d0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23002d0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C23002d0 f86536b = new C23002d0();

        public C23002d0() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$d1 */
    /* loaded from: classes2.dex */
    public static final class C23003d1 extends Lambda implements Function1<Triple<? extends Optional<Reservation>, ? extends Boolean, ? extends Boolean>, Unit> {
        public C23003d1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34685a(Triple<Optional<Reservation>, Boolean, Boolean> triple) {
            Optional<Reservation> component1 = triple.component1();
            Boolean scanlessRideStartEnabled = triple.component3();
            if (component1.m59037c()) {
                Intrinsics.checkNotNullExpressionValue(scanlessRideStartEnabled, "scanlessRideStartEnabled");
                if (scanlessRideStartEnabled.booleanValue()) {
                    C42483i25.this.f86315A.mo15898k(component1.m59038b().getBird());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<Reservation>, ? extends Boolean, ? extends Boolean> triple) {
            m34685a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LYz1;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$d2 */
    /* loaded from: classes2.dex */
    public static final class C23004d2 extends Lambda implements Function1<Optional<C37455Yz1>, Boolean> {

        /* renamed from: g */
        public static final C23004d2 f86538g = new C23004d2();

        public C23004d2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<C37455Yz1> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"i25$e", "LCQ3;", "Lco/bird/android/model/constant/Permission;", "permission", "", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: i25$e */
    /* loaded from: classes2.dex */
    public static final class C23005e implements CQ3 {
        public C23005e() {
        }

        @Override // p000.CQ3
        /* renamed from: a */
        public void mo19266a(Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            C41318g46.m40151m("Great, we have location permission", new Object[0]);
        }

        @Override // p000.CQ3
        /* renamed from: b */
        public void mo19265b(Permission permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            C42483i25.this.f86333S.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ScanlessRideItem;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/ScanlessRideItem;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$e0 */
    /* loaded from: classes2.dex */
    public static final class C23006e0 extends Lambda implements Function1<Optional<ScanlessRideItem>, ScanlessRideItem> {

        /* renamed from: g */
        public static final C23006e0 f86540g = new C23006e0();

        public C23006e0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ScanlessRideItem invoke(Optional<ScanlessRideItem> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LfM2;", "it", "", "invoke", "(LfM2;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$e1 */
    /* loaded from: classes2.dex */
    public static final class C23007e1 extends Lambda implements Function1<C40889fM2, Boolean> {
        public C23007e1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(((it.m41531c() instanceof BirdClusterItem) || C42149hU4.m36358a(C42483i25.this.m35012f4().mo75057R().getValue()) || C42483i25.this.f86315A.mo15903f().getValue() != RideUpdateState.NONE) ? false : true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052 \u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "LYz1;", "kotlin.jvm.PlatformType", "items", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$e2 */
    /* loaded from: classes2.dex */
    public static final class C23008e2 extends Lambda implements Function1<Observable<Optional<C37455Yz1>>, InterfaceC23434B<Optional<C37455Yz1>>> {
        public C23008e2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<Optional<C37455Yz1>> invoke(Observable<Optional<C37455Yz1>> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return items.takeUntil(Observable.timer((long) C42483i25.this.f86341a.m82623f8().getValue().getFrequentFlyer().getMapPillDisplayTime(), TimeUnit.SECONDS).delaySubscription(items));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$f */
    /* loaded from: classes2.dex */
    public static final class C23009f extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C23009f f86543g = new C23009f();

        public C23009f() {
            super(1);
        }

        /* renamed from: a */
        public final void m34682a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied camera permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m34682a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ScanlessRideItem;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lco/bird/android/model/ScanlessRideItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$f0 */
    /* loaded from: classes2.dex */
    public static final class C23010f0 extends Lambda implements Function1<ScanlessRideItem, Unit> {
        public C23010f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34681a(ScanlessRideItem scanlessRideItem) {
            WireBird component1 = scanlessRideItem.component1();
            scanlessRideItem.component2();
            C42483i25.this.m35206M5(component1, true, false);
            C42483i25.this.f86318D.mo89853d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScanlessRideItem scanlessRideItem) {
            m34681a(scanlessRideItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LfM2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$f1 */
    /* loaded from: classes2.dex */
    public static final class C23011f1 extends Lambda implements Function1<C40889fM2, Unit> {
        public C23011f1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40889fM2 c40889fM2) {
            invoke2(c40889fM2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C40889fM2 c40889fM2) {
            C42483i25.this.m35228K3();
            C42483i25.this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.RESERVATION_BEFORE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$f2 */
    /* loaded from: classes2.dex */
    public static final class C23012f2 extends Lambda implements Function0<Unit> {
        public C23012f2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC40099e13.C19924a.goToPayment$default(C42483i25.this.f86333S, null, false, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "it", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$g */
    /* loaded from: classes2.dex */
    public static final class C23013g extends Lambda implements Function1<FQ3, Boolean> {

        /* renamed from: g */
        public static final C23013g f86547g = new C23013g();

        public C23013g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FQ3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            boolean m107154a = it.m107154a();
            C41318g46.m40163a("check pre scan permissions returned for camera: " + m107154a + ", only continuing on true", new Object[0]);
            return Boolean.valueOf(it.m107154a());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$g0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23014g0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C23014g0 f86548b = new C23014g0();

        public C23014g0() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStatusLockButton;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusLockButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$g1 */
    /* loaded from: classes2.dex */
    public static final class C23015g1 extends Lambda implements Function1<RideStatusLockButton, Unit> {
        public C23015g1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34679a(RideStatusLockButton rideStatusLockButton) {
            C41318g46.m40163a("lock button clicked: " + rideStatusLockButton, new Object[0]);
            InterfaceC42185hY4.C22678a.onLockClick$default(C42483i25.this, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusLockButton rideStatusLockButton) {
            m34679a(rideStatusLockButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$g2 */
    /* loaded from: classes2.dex */
    public static final class C23016g2 extends Lambda implements Function0<Unit> {
        public C23016g2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C42483i25.this.f86333S.mo37051b0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$h */
    /* loaded from: classes2.dex */
    public static final class C23017h extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C23017h f86551g = new C23017h();

        public C23017h() {
            super(1);
        }

        /* renamed from: a */
        public final void m34678a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth scan permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m34678a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$h0 */
    /* loaded from: classes2.dex */
    public static final class C23018h0 extends Lambda implements Function0<Unit> {
        public C23018h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C42483i25.this.f86331Q.success(C45871nl4.report_fraud_batch_confirmation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "rideStatus", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$h1 */
    /* loaded from: classes2.dex */
    public static final class C23019h1 extends Lambda implements Function1<Optional<RideState>, Optional<String>> {

        /* renamed from: g */
        public static final C23019h1 f86553g = new C23019h1();

        public C23019h1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<String> invoke(Optional<RideState> rideStatus) {
            String str;
            WireRide ride;
            Intrinsics.checkNotNullParameter(rideStatus, "rideStatus");
            Optional.C14443a c14443a = Optional.f63040c;
            RideState m59035e = rideStatus.m59035e();
            if (m59035e != null && (ride = m59035e.getRide()) != null) {
                str = ride.getTipId();
            } else {
                str = null;
            }
            return c14443a.m59033b(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$h2 */
    /* loaded from: classes2.dex */
    public static final class C23020h2 extends Lambda implements Function0<Unit> {
        public C23020h2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC40099e13.C19924a.goToPayment$default(C42483i25.this.f86333S, null, false, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$i */
    /* loaded from: classes2.dex */
    public static final class C23021i extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C23021i f86555g = new C23021i();

        public C23021i() {
            super(1);
        }

        /* renamed from: a */
        public final void m34676a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m34676a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$i0 */
    /* loaded from: classes2.dex */
    public static final class C23022i0 extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f86557h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23022i0(WireBird wireBird) {
            super(0);
            this.f86557h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (C42483i25.this.f86341a.m82623f8().getValue().getRiderTutorial() != null) {
                C42483i25.this.f86333S.mo36941t2(co.bird.android.app.feature.map.renderer.Bird_Kt.classTutorialKind(this.f86557h).name());
            } else {
                C42483i25.this.f86333S.mo37024f3();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$i1 */
    /* loaded from: classes2.dex */
    public static final class C23023i1 extends Lambda implements Function1<Optional<String>, Boolean> {
        public C23023i1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<String> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m59037c() && C42483i25.this.m35012f4().mo75030r().getValue().getRideConfig().getEnableVehicleTipUi()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireUserGuest;", "it", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireUserGuest;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$i2 */
    /* loaded from: classes2.dex */
    public static final class C23024i2 extends Lambda implements Function1<WireUserGuest, Optional<String>> {

        /* renamed from: g */
        public static final C23024i2 f86559g = new C23024i2();

        public C23024i2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<String> invoke(WireUserGuest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59033b(it.getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$j */
    /* loaded from: classes2.dex */
    public static final class C23025j extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C23025j f86560g = new C23025j();

        public C23025j() {
            super(1);
        }

        /* renamed from: a */
        public final void m34673a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post notification permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m34673a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<no name provided>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onBirdInfoItemClick$options$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,4445:1\n180#2:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onBirdInfoItemClick$options$1\n*L\n2355#1:4446\n*E\n"})
    /* renamed from: i25$j0 */
    /* loaded from: classes2.dex */
    public static final class C23026j0 extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f86562h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$j0$a */
        /* loaded from: classes2.dex */
        public static final class C23027a extends Lambda implements Function1<WireBird, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86563g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23027a(C42483i25 c42483i25) {
                super(1);
                this.f86563g = c42483i25;
            }

            /* renamed from: a */
            public final void m34671a(WireBird wireBird) {
                this.f86563g.f86331Q.success(C45871nl4.ride_chirp_alarm_message);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
                m34671a(wireBird);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23026j0(WireBird wireBird) {
            super(0);
            this.f86562h = wireBird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C42483i25.this.f86382v.mo55905y(new C35429Qi0(null, null, null, "rider_map_flight_bar_pin", 7, null));
            C42483i25 c42483i25 = C42483i25.this;
            Object m33094as = c42483i25.m35258H3(this.f86562h, c42483i25.f86341a.m82623f8().m73665a().getPreferChirpAlarmOverChirpCommand()).m33094as(AutoDispose.m45239a(C42483i25.this.f86328N));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23027a c23027a = new C23027a(C42483i25.this);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: s25
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.C23026j0.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$j1 */
    /* loaded from: classes2.dex */
    public static final class C23028j1 extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C23028j1 f86564g = new C23028j1();

        public C23028j1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "guestId", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$j2 */
    /* loaded from: classes2.dex */
    public static final class C23029j2 extends Lambda implements Function1<Optional<String>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f86566h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23029j2(WireBird wireBird) {
            super(1);
            this.f86566h = wireBird;
        }

        /* renamed from: a */
        public final void m34669a(Optional<String> optional) {
            C42483i25.this.f86379t.m37617h2(C32972Fv0.m106251a(C42483i25.this.m35128U3()));
            C42483i25.this.f86315A.mo15899j(RideUpdateState.RIDE_REQUIREMENTS);
            C42483i25.this.f86335U.mo14404a(this.f86566h, RideRequirementReason.RIDE, optional.m59035e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m34669a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/ScanIntention;", "kotlin.jvm.PlatformType", "scanIntention", "", C17296a.f69688o, "(Lco/bird/android/model/constant/ScanIntention;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$checkPreScanPermissions$7$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1549#2:4446\n1620#2,3:4447\n1549#2:4450\n1620#2,3:4451\n1#3:4454\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$checkPreScanPermissions$7$1\n*L\n2021#1:4446\n2021#1:4447,3\n2022#1:4450\n2022#1:4451,3\n*E\n"})
    /* renamed from: i25$k */
    /* loaded from: classes2.dex */
    public static final class C23030k extends Lambda implements Function1<ScanIntention, Unit> {
        public C23030k() {
            super(1);
        }

        /* renamed from: a */
        public final void m34668a(ScanIntention scanIntention) {
            String code;
            boolean z;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            C41318g46.m40163a("ride intent scan intention: " + scanIntention, new Object[0]);
            User m37750B0 = C42483i25.this.f86379t.m37750B0();
            if (m37750B0 == null) {
                C41318g46.m40160d("no user found to attempt to start ride in checkPreScanPermissions!!", new Object[0]);
                return;
            }
            if (scanIntention == ScanIntention.GUEST_RIDE) {
                InterfaceC1880Ea interfaceC1880Ea = C42483i25.this.f86382v;
                List<Area> value = C42483i25.this.f86343b.mo64001e().getValue();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Area area : value) {
                    arrayList.add(area.getId());
                }
                List<Area> value2 = C42483i25.this.f86343b.mo64001e().getValue();
                C42483i25 c42483i25 = C42483i25.this;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(value2, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (Area area2 : value2) {
                    arrayList2.add(Double.valueOf(Seconds.secondsBetween(c42483i25.f86343b.mo64011O().getValue().get(area2), DateTime.now()).getSeconds()));
                }
                interfaceC1880Ea.mo55905y(new C32320Da5(null, null, null, arrayList, arrayList2, null, null, null, null, null, null, null, Boolean.valueOf(C42483i25.this.m35012f4().mo75057R().m73665a().m59037c()), Long.valueOf(C42483i25.this.m35012f4().mo75032o0().m73665a().getActiveRideCount()), 4071, null));
            } else {
                C42483i25.this.f86382v.mo55956N(new RideButtonTapped());
            }
            WireBird m59035e = C42483i25.this.f86315A.mo15902g().m73665a().m59035e();
            String str = null;
            if (m59035e != null && (code = m59035e.getCode()) != null) {
                if (scanIntention == ScanIntention.RIDE && m37750B0.getAdmin()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = code;
                }
            }
            C41318g46.m40163a("going to scan bird with intention " + scanIntention, new Object[0]);
            InterfaceC40099e13 interfaceC40099e13 = C42483i25.this.f86333S;
            Intrinsics.checkNotNullExpressionValue(scanIntention, "scanIntention");
            interfaceC40099e13.mo37023f4(scanIntention, str, 10006);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScanIntention scanIntention) {
            m34668a(scanIntention);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<no name provided>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onBirdInfoItemClick$options$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,4445:1\n180#2:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onBirdInfoItemClick$options$2\n*L\n2367#1:4446\n*E\n"})
    /* renamed from: i25$k0 */
    /* loaded from: classes2.dex */
    public static final class C23031k0 extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f86569h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$k0$a */
        /* loaded from: classes2.dex */
        public static final class C23032a extends Lambda implements Function1<WireBird, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86570g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23032a(C42483i25 c42483i25) {
                super(1);
                this.f86570g = c42483i25;
            }

            /* renamed from: a */
            public final void m34666a(WireBird wireBird) {
                this.f86570g.f86331Q.success(C45871nl4.ride_report_lost_message);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
                m34666a(wireBird);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23031k0(WireBird wireBird) {
            super(0);
            this.f86569h = wireBird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (C36441Uq4.m80769c(C42483i25.this.f86341a, this.f86569h).getInaccessibleBirdConfig().getEnableRiderCannotAccess()) {
                C42483i25.this.f86333S.mo37141K2(this.f86569h, 10029, InaccessibleReportSource.RIDER);
                return;
            }
            Object m33094as = C42483i25.this.f86351f.mo71595N0(this.f86569h, MapMode.RIDER).m33094as(AutoDispose.m45239a(C42483i25.this.f86328N));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23032a c23032a = new C23032a(C42483i25.this);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: t25
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.C23031k0.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$k1 */
    /* loaded from: classes2.dex */
    public static final class C23033k1 extends Lambda implements Function1<Optional<String>, Unit> {
        public C23033k1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34665a(Optional<String> optional) {
            InterfaceC40099e13 interfaceC40099e13 = C42483i25.this.f86333S;
            String m59035e = optional.m59035e();
            Intrinsics.checkNotNull(m59035e);
            interfaceC40099e13.mo37022g(m59035e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m34665a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$k2 */
    /* loaded from: classes2.dex */
    public static final class C23034k2 extends Lambda implements Function1<Throwable, Unit> {
        public C23034k2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C42483i25.this.f86315A.mo15894o(RideMapState.SCANNED);
            C41318g46.m40159e(th);
            C42483i25.this.f86331Q.errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/android/model/constant/ScanIntention;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/constant/ScanIntention;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$l */
    /* loaded from: classes2.dex */
    public static final class C23035l extends Lambda implements Function1<DialogResponse, ScanIntention> {

        /* renamed from: g */
        public static final C23035l f86573g = new C23035l();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: i25$l$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C23036a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C23035l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ScanIntention invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("determineRideIntent dialog response " + it, new Object[0]);
            if (C23036a.$EnumSwitchMapping$0[it.ordinal()] == 1) {
                return ScanIntention.RIDE;
            }
            return ScanIntention.GUEST_RIDE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$l0 */
    /* loaded from: classes2.dex */
    public static final class C23037l0 extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public static final C23037l0 f86574g = new C23037l0();

        public C23037l0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34663a(WireBird wireBird) {
            C41318g46.m40151m("Chirp bird on select.", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m34663a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$l1 */
    /* loaded from: classes2.dex */
    public static final class C23038l1 extends Lambda implements Function1<List<? extends WireBird>, Boolean> {

        /* renamed from: g */
        public static final C23038l1 f86575g = new C23038l1();

        public C23038l1() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<WireBird> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends WireBird> list) {
            return invoke2((List<WireBird>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LVX4;", "b", "()LVX4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$l2 */
    /* loaded from: classes2.dex */
    public static final class C23039l2 extends Lambda implements Function0<VX4> {
        public C23039l2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final VX4 invoke() {
            XX4 xx4 = C42483i25.this.f86384x;
            C51174wi2 c51174wi2 = C42483i25.this.f86323I;
            LifecycleScopeProvider lifecycleScopeProvider = C42483i25.this.f86328N;
            Context context = C42483i25.this.f86329O;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return xx4.mo74930a(c51174wi2, lifecycleScopeProvider, (AppCompatActivity) context);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$m */
    /* loaded from: classes2.dex */
    public static final class C23040m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23040m f86577g = new C23040m();

        public C23040m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while fetching balance", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$m0 */
    /* loaded from: classes2.dex */
    public static final class C23041m0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23041m0 f86578g = new C23041m0();

        public C23041m0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C41318g46.m40159e(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\b0\b2F\u0010\u0007\u001aB\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RideMapState;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "b", "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$m1 */
    /* loaded from: classes2.dex */
    public static final class C23042m1 extends Lambda implements Function1<C51106wb4<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>, ? extends List<? extends WireBird>, ? extends RideMapState>, InterfaceC23447K<? extends List<? extends WireBird>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$m1$a */
        /* loaded from: classes2.dex */
        public static final class C23043a extends Lambda implements Function1<Long, List<? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ List<WireBird> f86580g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23043a(List<WireBird> list) {
                super(1);
                this.f86580g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<WireBird> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f86580g;
            }
        }

        public C23042m1() {
            super(1);
        }

        /* renamed from: c */
        public static final List m34659c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<WireBird>> invoke(C51106wb4<Optional<WireCoupon>, Optional<WireCoupon>, ? extends List<WireBird>, ? extends RideMapState> c51106wb4) {
            AbstractC23442F<Long> m33133f0;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Optional<WireCoupon> m6613b = c51106wb4.m6613b();
            List<WireBird> birds = c51106wb4.m6612c();
            RideMapState m6611d = c51106wb4.m6611d();
            if ((c51106wb4.m6614a().m59037c() || m6613b.m59037c()) && !C42483i25.this.f86361k.mo83798e().getValue().m59037c()) {
                Intrinsics.checkNotNullExpressionValue(birds, "birds");
                if ((!birds.isEmpty()) && m6611d == RideMapState.NONE) {
                    m33133f0 = AbstractC23442F.m33133f0(5L, TimeUnit.SECONDS);
                    final C23043a c23043a = new C23043a(birds);
                    return m33133f0.m33157I(new InterfaceC23492o() { // from class: u25
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            List m34659c;
                            m34659c = C42483i25.C23042m1.m34659c(Function1.this, obj);
                            return m34659c;
                        }
                    });
                }
            }
            m33133f0 = AbstractC23442F.m33153M();
            final Function1 c23043a2 = new C23043a(birds);
            return m33133f0.m33157I(new InterfaceC23492o() { // from class: u25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m34659c;
                    m34659c = C42483i25.C23042m1.m34659c(Function1.this, obj);
                    return m34659c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "navigated", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$n */
    /* loaded from: classes2.dex */
    public static final class C23045n extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C23045n f86582g = new C23045n();

        public C23045n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C41318g46.m40163a("navigation to identification verification was performed: " + bool, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$n0 */
    /* loaded from: classes2.dex */
    public static final class C23046n0 extends Lambda implements Function1<WireRide, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f86583g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23046n0(WireRide wireRide) {
            super(1);
            this.f86583g = wireRide;
        }

        /* renamed from: a */
        public final void m34657a(WireRide wireRide) {
            DateTime continuedAt = this.f86583g.getContinuedAt();
            C41318g46.m40151m("continue ride: " + continuedAt, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m34657a(wireRide);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "birds", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$56\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n766#2:4446\n857#2,2:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$56\n*L\n1102#1:4446\n1102#1:4447,2\n*E\n"})
    /* renamed from: i25$n1 */
    /* loaded from: classes2.dex */
    public static final class C23047n1 extends Lambda implements Function1<List<? extends WireBird>, WireBird> {
        public C23047n1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBird invoke(List<WireBird> birds) {
            if (C42483i25.this.f86361k.mo83798e().getValue().m59037c()) {
                return null;
            }
            C42483i25 c42483i25 = C42483i25.this;
            Intrinsics.checkNotNullExpressionValue(birds, "birds");
            C42483i25 c42483i252 = C42483i25.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : birds) {
                if (!c42483i252.f86351f.mo71608A0().getValue().contains(((WireBird) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            return c42483i25.m35148S3(arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "shouldPollBirdsNearby", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$n2 */
    /* loaded from: classes2.dex */
    public static final class C23048n2 extends Lambda implements Function1<Boolean, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "invoke", "(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: i25$n2$a */
        /* loaded from: classes2.dex */
        public static final class C23049a extends Lambda implements Function1<LatLng, Boolean> {

            /* renamed from: g */
            public static final C23049a f86586g = new C23049a();

            public C23049a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(LatLng it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(C39339cm2.m60887b(it));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062 \u0010\u0005\u001a\u001c\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/ScanlessRideItem;", "it", "Lcom/google/android/gms/maps/model/LatLngBounds;", C17296a.f69688o, "(Lkotlin/Pair;)Lcom/google/android/gms/maps/model/LatLngBounds;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$n2$b */
        /* loaded from: classes2.dex */
        public static final class C23050b extends Lambda implements Function1<Pair<? extends LatLng, ? extends List<? extends ScanlessRideItem>>, LatLngBounds> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86587g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23050b(C42483i25 c42483i25) {
                super(1);
                this.f86587g = c42483i25;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final LatLngBounds invoke(Pair<LatLng, ? extends List<ScanlessRideItem>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f86587g.f86330P.latLngBounds();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lcom/google/android/gms/maps/model/LatLngBounds;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$n2$c */
        /* loaded from: classes2.dex */
        public static final class C23051c extends Lambda implements Function1<LatLngBounds, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86588g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: i25$n2$c$a */
            /* loaded from: classes2.dex */
            public static final class C23052a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public static final C23052a f86589g = new C23052a();

                public C23052a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m34645a(InterfaceC23465c interfaceC23465c) {
                    C41318g46.m40163a("calling refresh private-bird/all (from pollBirdsNearby)", new Object[0]);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m34645a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: i25$n2$c$b */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C23053b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

                /* renamed from: b */
                public static final C23053b f86590b = new C23053b();

                public C23053b() {
                    super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    C41318g46.m40159e(th);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23051c(C42483i25 c42483i25) {
                super(1);
                this.f86588g = c42483i25;
            }

            /* renamed from: d */
            public static final void m34646d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23496h invoke(LatLngBounds latLngBounds) {
                List<WireBird> m59035e;
                boolean z;
                AbstractC23461c m33039p;
                Intrinsics.checkNotNullParameter(latLngBounds, "latLngBounds");
                if (this.f86588g.f86353g.mo18213a().m73665a().m59035e() != null && (!m59035e.isEmpty())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AbstractC23461c refresh = this.f86588g.f86353g.refresh();
                    final C23052a c23052a = C23052a.f86589g;
                    AbstractC23461c m33081E = refresh.m33081E(new InterfaceC23484g() { // from class: B25
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C42483i25.C23048n2.C23051c.invoke$lambda$0(Function1.this, obj);
                        }
                    });
                    final C23053b c23053b = C23053b.f86590b;
                    m33039p = m33081E.m33084B(new InterfaceC23484g() { // from class: C25
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C42483i25.C23048n2.C23051c.m34646d(Function1.this, obj);
                        }
                    }).m33069Q();
                } else {
                    m33039p = AbstractC23461c.m33039p();
                }
                C41318g46.m40157g("received trigger to start loadBirdsNearBy", new Object[0]);
                this.f86588g.f86378s0 = true;
                return this.f86588g.m35247I4(latLngBounds).m33049i(m33039p);
            }
        }

        public C23048n2() {
            super(1);
        }

        /* renamed from: d */
        public static final LatLngBounds m34652d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (LatLngBounds) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final InterfaceC23496h m34651e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean shouldPollBirdsNearby) {
            Intrinsics.checkNotNullParameter(shouldPollBirdsNearby, "shouldPollBirdsNearby");
            if (shouldPollBirdsNearby.booleanValue()) {
                C41318g46.m40157g("setting up stream to poll for birds nearby on center location change", new Object[0]);
                C24523e c24523e = C24523e.f91168a;
                Observable<LatLng> startWith = C42483i25.this.f86330P.centerLocationChanged().startWith((Observable<LatLng>) C42483i25.this.f86330P.getCenterLocation());
                final C23049a c23049a = C23049a.f86586g;
                Observable<LatLng> filter = startWith.filter(new InterfaceC23494q() { // from class: y25
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = C42483i25.C23048n2.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(filter, "mapUi.centerLocationChan… { it.isProbablyValid() }");
                Observable observeOn = c24523e.m31956a(filter, C42483i25.this.f86318D.mo89852e()).observeOn(C23454a.m33087a());
                final C23050b c23050b = new C23050b(C42483i25.this);
                Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: z25
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        LatLngBounds m34652d;
                        m34652d = C42483i25.C23048n2.m34652d(Function1.this, obj);
                        return m34652d;
                    }
                }).observeOn(C24542a.m31932c());
                final C23051c c23051c = new C23051c(C42483i25.this);
                return observeOn2.switchMapCompletable(new InterfaceC23492o() { // from class: A25
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m34651e;
                        m34651e = C42483i25.C23048n2.m34651e(Function1.this, obj);
                        return m34651e;
                    }
                });
            }
            RideMapState m73665a = C42483i25.this.f86315A.mo15897l().m73665a();
            boolean m59037c = C42483i25.this.f86361k.mo83798e().m73665a().m59037c();
            C41318g46.m40151m("did not set up stream to poll for birds nearby as conditions not met (rideMapState = " + m73665a + ", reservation present? = " + m59037c + ")", new Object[0]);
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/RideMapState;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initBirdsNearbyRenderStream$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$o */
    /* loaded from: classes2.dex */
    public static final class C23054o extends Lambda implements Function1<Triple<? extends RideMapState, ? extends Optional<Reservation>, ? extends List<? extends WireBird>>, List<? extends WireBird>> {

        /* renamed from: g */
        public static final C23054o f86591g = new C23054o();

        public C23054o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(Triple<? extends RideMapState, Optional<Reservation>, ? extends List<WireBird>> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            RideMapState component1 = triple.component1();
            Optional<Reservation> component2 = triple.component2();
            List<WireBird> component3 = triple.component3();
            if (component1 == RideMapState.NONE && !component2.m59037c()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            return component3;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl\n*L\n1#1,304:1\n856#2:305\n*E\n"})
    /* renamed from: i25$o0 */
    /* loaded from: classes2.dex */
    public static final class C23055o0<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            RideMapState rideMapState = (RideMapState) t2;
            List list = (List) ((Optional) t1).m59035e();
            boolean z = false;
            if (list != null && list.size() == 1) {
                z = true;
            }
            return (R) TuplesKt.m28425to(Boolean.valueOf(z), rideMapState);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "closestBird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$o1 */
    /* loaded from: classes2.dex */
    public static final class C23056o1 extends Lambda implements Function1<WireBird, Unit> {
        public C23056o1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34643a(WireBird closestBird) {
            C42483i25.this.m35228K3();
            InterfaceC46893pU4 interfaceC46893pU4 = C42483i25.this.f86315A;
            Intrinsics.checkNotNullExpressionValue(closestBird, "closestBird");
            interfaceC46893pU4.mo15898k(closestBird);
            C42483i25.this.f86330P.select(closestBird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m34643a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Li25$b;", "oldValue", "newValue", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$o2 */
    /* loaded from: classes2.dex */
    public static final class C23057o2 extends Lambda implements Function2<Optional<C22991b>, Optional<C22991b>, Optional<C22991b>> {

        /* renamed from: g */
        public static final C23057o2 f86593g = new C23057o2();

        public C23057o2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Optional<C22991b> invoke(Optional<C22991b> oldValue, Optional<C22991b> newValue) {
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            C22991b m59035e = oldValue.m59035e();
            C22991b m59035e2 = newValue.m59035e();
            if (m59035e == null || m59035e2 == null || m59035e2.m34691b() <= m59035e.m34691b()) {
                return newValue;
            }
            return oldValue;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birds", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$p */
    /* loaded from: classes2.dex */
    public static final class C23058p extends Lambda implements Function1<List<? extends WireBird>, Unit> {
        public C23058p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> list) {
            C41318g46.AbstractC20723b m35056b4 = C42483i25.this.m35056b4();
            int size = list.size();
            RideState m35078Z3 = C42483i25.this.m35078Z3();
            boolean z = m35078Z3 != null && RideStateKt.isInRide(m35078Z3);
            boolean z2 = C42483i25.this.f86376r0;
            StringBuilder sb = new StringBuilder();
            sb.append("Received ");
            sb.append(size);
            sb.append(" birds, focusedRide state = ");
            sb.append(!z);
            sb.append(" , resumed = ");
            sb.append(z2);
            m35056b4.mo7221o(sb.toString(), new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: i25$p0 */
    /* loaded from: classes2.dex */
    public static final class C23059p0<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C23059p0<T1, T2, T3, T4, R> f86595a = new C23059p0<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "closestBird", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$p1 */
    /* loaded from: classes2.dex */
    public static final class C23060p1 extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends Pair<? extends Route, ? extends WireBird>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Route;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Route;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$p1$a */
        /* loaded from: classes2.dex */
        public static final class C23061a extends Lambda implements Function1<Route, Pair<? extends Route, ? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f86597g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23061a(WireBird wireBird) {
                super(1);
                this.f86597g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Route, WireBird> invoke(Route it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f86597g);
            }
        }

        public C23060p1() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<Route, WireBird>> invoke(WireBird closestBird) {
            Intrinsics.checkNotNullParameter(closestBird, "closestBird");
            Observable<Route> mo71585X0 = C42483i25.this.f86351f.mo71585X0(C42483i25.this.m34979i4(), closestBird);
            final C23061a c23061a = new C23061a(closestBird);
            return mo71585X0.map(new InterfaceC23492o() { // from class: v25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C42483i25.C23060p1.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$p2 */
    /* loaded from: classes2.dex */
    public static final class C23062p2 extends Lambda implements Function0<Z84<Boolean>> {
        public C23062p2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Boolean> invoke() {
            return Z84.f47888d.m73663b(C42483i25.this.f86340Z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birds", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initBirdsNearbyRenderStream$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1#2:4446\n288#3,2:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initBirdsNearbyRenderStream$3\n*L\n1923#1:4447,2\n*E\n"})
    /* renamed from: i25$q */
    /* loaded from: classes2.dex */
    public static final class C23063q extends Lambda implements Function1<List<? extends WireBird>, Unit> {
        public C23063q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0113 A[EDGE_INSN: B:64:0x0113->B:34:0x0113 ?: BREAK  , SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(List<WireBird> birds) {
            boolean z;
            Object obj;
            C22991b c22991b;
            boolean z2;
            C42483i25.this.m35056b4().mo7221o("Attempting to show " + birds.size() + " birds to show on map", new Object[0]);
            G95 g95 = C42483i25.this.f86330P;
            Intrinsics.checkNotNullExpressionValue(birds, "birds");
            g95.setBirds(birds);
            WireBird m59035e = C42483i25.this.f86315A.mo15902g().m73665a().m59035e();
            if (m59035e != null) {
                C42483i25.this.f86330P.select(m59035e);
            }
            if (C42483i25.this.f86364l0 == null && C42483i25.this.f86366m0 == null) {
                return;
            }
            C42483i25 c42483i25 = C42483i25.this;
            Iterator<T> it = birds.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                WireBird wireBird = (WireBird) obj;
                WireBird wireBird2 = c42483i25.f86364l0;
                if (wireBird2 != null && wireBird2.isProbablySame(wireBird)) {
                    c42483i25.m35056b4().mo7221o("matched bird successfully from bird returned in bird/nearby-by-ids call", new Object[0]);
                    c42483i25.m35056b4().mo7221o("deeplinkBird = " + c42483i25.f86364l0, new Object[0]);
                    c42483i25.m35056b4().mo7221o("matched bird = " + wireBird, new Object[0]);
                } else if (c42483i25.f86366m0 == null || !(Intrinsics.areEqual(wireBird.getEphemeralId(), c42483i25.f86366m0) || Intrinsics.areEqual(wireBird.getId(), c42483i25.f86366m0) || Intrinsics.areEqual(wireBird.getCode(), c42483i25.f86366m0))) {
                    z2 = false;
                    continue;
                    if (z2) {
                        break;
                    }
                } else {
                    c42483i25.m35056b4().mo7221o("matched bird successfully via deeplink bird id", new Object[0]);
                }
                z2 = true;
                continue;
                if (z2) {
                }
            }
            WireBird wireBird3 = (WireBird) obj;
            LatLng latLng = C42483i25.this.f86368n0;
            WireBird mo71569y0 = latLng != null ? C42483i25.this.f86351f.mo71569y0(C37429Yw2.f47648a.m73962i(latLng)) : null;
            float distanceTo = mo71569y0 != null ? UB1.m81891a(MapUiKt.toGeolocation(C42483i25.this.f86330P.getCenterLocation())).distanceTo(mo71569y0.getLocation().fromLocation()) : Float.MAX_VALUE;
            if (mo71569y0 != null) {
                C42483i25 c42483i252 = C42483i25.this;
                LatLng latLng2 = c42483i252.f86368n0;
                if (!(latLng2 != null && c42483i252.f86330P.viewportContains(latLng2)) || distanceTo > ((float) c42483i252.f86330P.nearbyRadius()) * 2.0f) {
                    z = false;
                }
                if (!z) {
                    mo71569y0 = null;
                }
                if (mo71569y0 != null) {
                    c22991b = new C22991b(mo71569y0, distanceTo);
                    C41318g46.m40163a("Tracking potential deeplink fallback entry " + c22991b, new Object[0]);
                    C42483i25.this.f86370o0.accept(Optional.f63040c.m59033b(c22991b));
                    if (wireBird3 == null) {
                        C42483i25.m35144S7(C42483i25.this, wireBird3, false, 2, null);
                        return;
                    }
                    C42483i25.this.m35056b4().mo7221o("Unable to find the deeplinked bird: " + C42483i25.this.f86366m0 + " or any close by.", new Object[0]);
                    return;
                }
            }
            c22991b = null;
            C41318g46.m40163a("Tracking potential deeplink fallback entry " + c22991b, new Object[0]);
            C42483i25.this.f86370o0.accept(Optional.f63040c.m59033b(c22991b));
            if (wireBird3 == null) {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$q0 */
    /* loaded from: classes2.dex */
    public static final class C23064q0 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<RideState>>, Unit> {
        public C23064q0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<RideState>> pair) {
            invoke2((Pair<Boolean, Optional<RideState>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<RideState>> pair) {
            WireRide ride;
            WireBird bird;
            WirePhysicalLock physicalLock;
            boolean booleanValue = pair.component1().booleanValue();
            Optional<RideState> component2 = pair.component2();
            if (!C42483i25.this.m35128U3().getRideConfig().getEnableLocationOptOut()) {
                C42483i25.this.m34848u3();
                return;
            }
            if (booleanValue) {
                C42483i25.this.f86382v.mo55956N(new RiderFlightBarShown());
            }
            RideState m59035e = component2.m59035e();
            boolean z = true;
            boolean z2 = ((m59035e == null || (ride = m59035e.getRide()) == null || (bird = ride.getBird()) == null || (physicalLock = bird.getPhysicalLock()) == null) ? null : physicalLock.getSmartlock()) != null;
            C42483i25.this.f86331Q.mo75616ad(booleanValue && C40788fB0.m41759w(C42483i25.this.f86329O), z2);
            P75 p75 = C42483i25.this.f86331Q;
            if (!booleanValue || C40788fB0.m41759w(C42483i25.this.f86329O)) {
                z = false;
            }
            p75.mo75632Sd(z, z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Route;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$q1 */
    /* loaded from: classes2.dex */
    public static final class C23065q1 extends Lambda implements Function1<Pair<? extends Route, ? extends WireBird>, Unit> {
        public C23065q1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Route, ? extends WireBird> pair) {
            invoke2((Pair<Route, WireBird>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Route, WireBird> pair) {
            Route route = pair.component1();
            WireBird closestBird = pair.component2();
            G95 g95 = C42483i25.this.f86330P;
            Intrinsics.checkNotNullExpressionValue(route, "route");
            Intrinsics.checkNotNullExpressionValue(closestBird, "closestBird");
            g95.drawRouteAndZoom(route, closestBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireBird;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$q2 */
    /* loaded from: classes2.dex */
    public static final class C23066q2 extends Lambda implements Function1<Pair<? extends List<? extends WireBird>, ? extends Location>, Unit> {
        public C23066q2() {
            super(1);
        }

        /* renamed from: b */
        public static final void m34636b(C42483i25 this$0, WireBird privateBird, Location location) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(privateBird, "$privateBird");
            this$0.m35236J5(privateBird, false);
            this$0.f86330P.zoomTo(privateBird, location, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends WireBird>, ? extends Location> pair) {
            invoke2((Pair<? extends List<WireBird>, ? extends Location>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<WireBird>, ? extends Location> pair) {
            Object first;
            List<WireBird> component1 = pair.component1();
            final Location userLocation = pair.component2();
            if (component1.size() == 1) {
                C41318g46.m40163a("user has one private bird, attempting to auto select if close enough...", new Object[0]);
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) component1);
                final WireBird wireBird = (WireBird) first;
                Double maxDistanceToShowAnnotationMeters = C36441Uq4.m80769c(C42483i25.this.f86341a, wireBird).getPrivateBirdConfig().getMaxDistanceToShowAnnotationMeters();
                if (maxDistanceToShowAnnotationMeters != null) {
                    final C42483i25 c42483i25 = C42483i25.this;
                    double doubleValue = maxDistanceToShowAnnotationMeters.doubleValue();
                    C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
                    Intrinsics.checkNotNullExpressionValue(userLocation, "userLocation");
                    if (c37429Yw2.m73967d(userLocation, wireBird.getLocation()) <= doubleValue) {
                        C41318g46.m40163a("user is close enough to private bird, selecting now...", new Object[0]);
                        c42483i25.f86377s.postDelayed(new Runnable() { // from class: D25
                            @Override // java.lang.Runnable
                            public final void run() {
                                C42483i25.C23066q2.m34636b(C42483i25.this, wireBird, userLocation);
                            }
                        }, 1000L);
                    }
                }
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$r */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23067r extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C23067r f86603b = new C23067r();

        public C23067r() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$r0 */
    /* loaded from: classes2.dex */
    public static final class C23068r0 extends Lambda implements Function1<Unit, Unit> {
        public C23068r0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42483i25.this.f86382v.mo55956N(new RiderFlightBarLocationServicesButtonTapped());
            if (C40788fB0.m41759w(C42483i25.this.f86329O)) {
                C42483i25.this.f86333S.mo37192C();
            } else {
                C42483i25.this.f86333S.mo36930v1();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStatusEndButton;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusEndButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$r1 */
    /* loaded from: classes2.dex */
    public static final class C23069r1 extends Lambda implements Function1<RideStatusEndButton, Unit> {
        public C23069r1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34635a(RideStatusEndButton rideStatusEndButton) {
            C41318g46.m40163a("end ride button clicked: " + rideStatusEndButton, new Object[0]);
            InterfaceC42185hY4.C22678a.onEndRideClick$default(C42483i25.this, null, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusEndButton rideStatusEndButton) {
            m34635a(rideStatusEndButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$r2 */
    /* loaded from: classes2.dex */
    public static final class C23070r2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23070r2 f86606g = new C23070r2();

        public C23070r2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$1\n*L\n1557#1:4446,3\n*E\n"})
    /* renamed from: i25$s */
    /* loaded from: classes2.dex */
    public static final class C23071s extends Lambda implements Function1<RideStates, Boolean> {

        /* renamed from: g */
        public static final C23071s f86607g = new C23071s();

        public C23071s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideStates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List<RideState> activeRides = it.activeRides();
            boolean z = false;
            if (!(activeRides instanceof Collection) || !activeRides.isEmpty()) {
                Iterator<T> it2 = activeRides.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (RideStatesKt.isPrimaryRide((RideState) it2.next())) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$s0 */
    /* loaded from: classes2.dex */
    public static final class C23072s0 extends Lambda implements Function1<Location, Unit> {
        public C23072s0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            G95 g95 = C42483i25.this.f86330P;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            g95.moveTo(location);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$s1 */
    /* loaded from: classes2.dex */
    public static final class C23073s1 extends Lambda implements Function1<LatLng, Unit> {
        public C23073s1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            invoke2(latLng);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LatLng it) {
            InterfaceC46893pU4 interfaceC46893pU4 = C42483i25.this.f86315A;
            C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC46893pU4.mo15905d(c37429Yw2.m73962i(it));
            C42483i25.this.f86315A.mo15895n(Double.valueOf(C42483i25.this.f86330P.nearbyRadius()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$s2 */
    /* loaded from: classes2.dex */
    public static final class C23074s2 extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f86610g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23074s2(boolean z) {
            super(1);
            this.f86610g = z;
        }

        /* renamed from: a */
        public final void m34633a(WireBird wireBird) {
            boolean z = this.f86610g;
            C41318g46.m40151m("Send ACK_LOCKED: " + z, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m34633a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062B\u0010\u0005\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "LXl5;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$t */
    /* loaded from: classes2.dex */
    public static final class C23075t extends Lambda implements Function1<Pair<? extends Optional<C37099Xl5>, ? extends Boolean>, Unit> {
        public C23075t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<C37099Xl5>, ? extends Boolean> pair) {
            invoke2((Pair<Optional<C37099Xl5>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<C37099Xl5>, Boolean> pair) {
            boolean z;
            String id;
            WireRide ride;
            WireBird bird;
            WireRide ride2;
            WireBird bird2;
            Config m73665a;
            Boolean component2 = pair.component2();
            C37099Xl5 m59035e = pair.component1().m59035e();
            WirePhysicalLock m76371b = m59035e != null ? m59035e.m76371b() : null;
            if (m76371b != null) {
                C42483i25 c42483i25 = C42483i25.this;
                InterfaceC34441Mc2 interfaceC34441Mc2 = c42483i25.f86322H;
                RideState m59035e2 = c42483i25.m35012f4().mo75057R().m73665a().m59035e();
                if (m59035e2 == null || (m73665a = m59035e2.getRideConfig()) == null) {
                    m73665a = c42483i25.f86341a.m82623f8().m73665a();
                }
                Boolean valueOf = Boolean.valueOf(interfaceC34441Mc2.mo55653v(m73665a, m76371b, ItemLeaseType.HELMET));
                valueOf.booleanValue();
                if (!(m76371b.getPurpose() == PhysicalLockPurpose.HELMET)) {
                    valueOf = null;
                }
                z = Intrinsics.areEqual(valueOf, Boolean.TRUE);
            } else {
                z = false;
            }
            if (m76371b == null || (id = m76371b.getBirdId()) == null) {
                RideState m59035e3 = C42483i25.this.m35012f4().mo75057R().m73665a().m59035e();
                id = (m59035e3 == null || (ride = m59035e3.getRide()) == null || (bird = ride.getBird()) == null) ? null : bird.getId();
            }
            boolean z2 = m76371b != null && (!z || ((id != null && C42483i25.this.f86322H.mo55706C(id, ItemLeaseType.HELMET)) && !component2.booleanValue()));
            C42483i25.this.f86331Q.mo75605kc(z2, m76371b != null ? m76371b.getPurpose() : null);
            if ((m76371b != null ? m76371b.getPurpose() : null) == PhysicalLockPurpose.HELMET) {
                if (z2 && !C42483i25.this.f86379t.m37718J0()) {
                    C42483i25.this.f86379t.m37681S1();
                    C42483i25.this.f86331Q.mo75661Ce();
                }
                if (C42483i25.this.f86379t.m37706M0(m76371b.getKind()) || z) {
                    return;
                }
                C41318g46.m40163a("going to physical lock tutorial from initPhysicalLockButtonObservables", new Object[0]);
                InterfaceC44791lw0 interfaceC44791lw0 = C42483i25.this.f86324J;
                InterfaceC40099e13 interfaceC40099e13 = C42483i25.this.f86333S;
                ConfigurableTutorialContext tutorialContext = m76371b.toTutorialContext(true);
                RideState m59035e4 = C42483i25.this.m35012f4().mo75057R().m73665a().m59035e();
                if (InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(interfaceC44791lw0, interfaceC40099e13, tutorialContext, (m59035e4 == null || (ride2 = m59035e4.getRide()) == null || (bird2 = ride2.getBird()) == null) ? null : bird2.getModel(), false, null, false, 32, null)) {
                    return;
                }
                C42483i25.this.f86333S.mo37048b3(m76371b, false, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$t0 */
    /* loaded from: classes2.dex */
    public static final class C23076t0 extends Lambda implements Function1<Unit, Unit> {
        public C23076t0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42483i25.this.f86382v.mo55956N(new CommunityModeMapIconClicked());
            C42483i25.this.f86333S.mo37025f2(MapMode.RIDER, Integer.valueOf(I35.COMMUNITY_MODE.ordinal()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$t1 */
    /* loaded from: classes2.dex */
    public static final class C23077t1 extends Lambda implements Function1<Pair<? extends WireBird, ? extends Boolean>, Unit> {
        public C23077t1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends Boolean> pair) {
            invoke2((Pair<WireBird, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, Boolean> pair) {
            boolean booleanValue = pair.component2().booleanValue();
            C42483i25.this.m35236J5(pair.component1(), booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$t2 */
    /* loaded from: classes2.dex */
    public static final class C23078t2 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C23078t2 f86614g = new C23078t2();

        public C23078t2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C41318g46.m40159e(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n288#2,2:4446\n1#3:4448\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$3\n*L\n1607#1:4446,2\n*E\n"})
    /* renamed from: i25$u */
    /* loaded from: classes2.dex */
    public static final class C23079u extends Lambda implements Function1<Unit, Unit> {
        public C23079u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
            if (r5.isSolebe() == true) goto L37;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Unit unit) {
            WirePhysicalLock m76371b;
            Unit unit2;
            WireRide ride;
            WireBird bird;
            Object firstOrNull;
            List<WirePhysicalLock> physicalLocks;
            Object firstOrNull2;
            WireBird bird2;
            List<WirePhysicalLock> physicalLocks2;
            Object obj;
            boolean z = true;
            Unit unit3 = null;
            unit3 = null;
            r3 = null;
            r3 = null;
            String str = null;
            unit3 = null;
            if (C42483i25.this.m34990h4()) {
                WireRide m35088Y3 = C42483i25.this.m35088Y3();
                if (m35088Y3 != null && (bird2 = m35088Y3.getBird()) != null && (physicalLocks2 = bird2.getPhysicalLocks()) != null) {
                    Iterator<T> it = physicalLocks2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (!((WirePhysicalLock) obj).isBrainLock()) {
                            break;
                        }
                    }
                    m76371b = (WirePhysicalLock) obj;
                }
                m76371b = null;
            } else {
                C37099Xl5 m59035e = C42483i25.this.f86365m.mo21402e().m73665a().m59035e();
                if (m59035e != null) {
                    m76371b = m59035e.m76371b();
                }
                m76371b = null;
            }
            if (m76371b != null) {
                WirePhysicalLock wirePhysicalLock = (m76371b.getPurpose() == PhysicalLockPurpose.HELMET ? 1 : null) != null ? m76371b : null;
                if (wirePhysicalLock != null) {
                    C42483i25 c42483i25 = C42483i25.this;
                    if (c42483i25.f86322H.mo55653v(c42483i25.f86341a.m82623f8().m73665a(), wirePhysicalLock, ItemLeaseType.HELMET)) {
                        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c42483i25.f86322H.mo55656s().m73665a());
                        ItemLease itemLease = (ItemLease) firstOrNull;
                        if (itemLease != null) {
                            WireRide m35088Y32 = c42483i25.m35088Y3();
                            WireBird bird3 = m35088Y32 != null ? m35088Y32.getBird() : null;
                            if (bird3 != null && (physicalLocks = bird3.getPhysicalLocks()) != null) {
                                firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                                WirePhysicalLock wirePhysicalLock2 = (WirePhysicalLock) firstOrNull2;
                                if (wirePhysicalLock2 != null) {
                                }
                            }
                            z = false;
                            if (z) {
                                c42483i25.f86333S.mo36926w(bird3, itemLease, I35.HELMET_RETURN_SCAN.ordinal());
                            } else {
                                c42483i25.f86333S.mo36979n0(itemLease, "helmet_button", I35.HELMET_RETURN_SCAN.ordinal());
                            }
                            unit2 = Unit.INSTANCE;
                        }
                    } else {
                        C41318g46.m40163a("going to physical lock tutorial from physicalLockButtonClicks", new Object[0]);
                        InterfaceC44791lw0 interfaceC44791lw0 = c42483i25.f86324J;
                        InterfaceC40099e13 interfaceC40099e13 = c42483i25.f86333S;
                        ConfigurableTutorialContext tutorialContext = wirePhysicalLock.toTutorialContext(true);
                        RideState m59035e2 = c42483i25.m35012f4().mo75057R().m73665a().m59035e();
                        if (m59035e2 != null && (ride = m59035e2.getRide()) != null && (bird = ride.getBird()) != null) {
                            str = bird.getModel();
                        }
                        if (!InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(interfaceC44791lw0, interfaceC40099e13, tutorialContext, str, false, null, false, 32, null)) {
                            InterfaceC40099e13.C19924a.goToPhysicalLockTutorial$default(c42483i25.f86333S, wirePhysicalLock, false, null, 6, null);
                        }
                        unit2 = Unit.INSTANCE;
                    }
                    unit3 = unit2;
                }
            }
            if (unit3 == null) {
                C42483i25.this.m35163Q8();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/RideMapState;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$u0 */
    /* loaded from: classes2.dex */
    public static final class C23080u0 extends Lambda implements Function1<Pair<? extends Boolean, ? extends RideMapState>, Unit> {
        public C23080u0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends RideMapState> pair) {
            invoke2((Pair<Boolean, ? extends RideMapState>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, ? extends RideMapState> pair) {
            C42483i25.this.f86331Q.mo75642M6(pair.component1().booleanValue() && pair.component2() == RideMapState.NONE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$u1 */
    /* loaded from: classes2.dex */
    public static final class C23081u1 extends Lambda implements Function1<WireBird, Unit> {
        public C23081u1() {
            super(1);
        }

        /* renamed from: a */
        public final void m34632a(WireBird it) {
            C42483i25 c42483i25 = C42483i25.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c42483i25.m35246I5(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m34632a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", C17296a.f69688o, "(LHM4;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$u2 */
    /* loaded from: classes2.dex */
    public static final class C23082u2 extends Lambda implements Function2<HM4<Unit>, Throwable, Unit> {

        /* renamed from: g */
        public static final C23082u2 f86618g = new C23082u2();

        public C23082u2() {
            super(2);
        }

        /* renamed from: a */
        public final void m34631a(HM4<Unit> hm4, Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4, Throwable th) {
            m34631a(hm4, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "rideStateOptional", "LXl5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$lockObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n288#2,2:4446\n1#3:4448\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$initPhysicalLockButtonObservables$lockObservable$1\n*L\n1543#1:4446,2\n*E\n"})
    /* renamed from: i25$v */
    /* loaded from: classes2.dex */
    public static final class C23083v extends Lambda implements Function1<Optional<RideState>, Optional<C37099Xl5>> {

        /* renamed from: g */
        public static final C23083v f86619g = new C23083v();

        public C23083v() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
            if (co.bird.android.model.RideStateKt.isInRide(r3) != false) goto L19;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Optional<C37099Xl5> invoke(Optional<RideState> rideStateOptional) {
            WirePhysicalLock wirePhysicalLock;
            WireRide ride;
            WireBird bird;
            List<WirePhysicalLock> physicalLocks;
            Object obj;
            Intrinsics.checkNotNullParameter(rideStateOptional, "rideStateOptional");
            RideState m59035e = rideStateOptional.m59035e();
            C37099Xl5 c37099Xl5 = null;
            if (m59035e != null && (ride = m59035e.getRide()) != null && (bird = ride.getBird()) != null && (physicalLocks = bird.getPhysicalLocks()) != null) {
                Iterator<T> it = physicalLocks.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!((WirePhysicalLock) obj).isBrainLock()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                wirePhysicalLock = (WirePhysicalLock) obj;
                if (wirePhysicalLock != null) {
                }
            }
            wirePhysicalLock = null;
            Optional.C14443a c14443a = Optional.f63040c;
            if (wirePhysicalLock != null) {
                c37099Xl5 = new C37099Xl5(wirePhysicalLock, null, m59035e, 2, null);
            }
            return c14443a.m59033b(c37099Xl5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00012\u009b\u0001\u0010\u0006\u001a\u0096\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u00020\u0002 \u0004*J\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$v0 */
    /* loaded from: classes2.dex */
    public static final class C23084v0 extends Lambda implements Function1<Triple<? extends Unit, ? extends Optional<WireBird>, ? extends Optional<List<? extends WireBird>>>, Unit> {
        public C23084v0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34629a(Triple<Unit, Optional<WireBird>, Optional<List<WireBird>>> triple) {
            Object first;
            Optional<WireBird> component2 = triple.component2();
            Optional<List<WireBird>> component3 = triple.component3();
            if (component3.m59037c()) {
                boolean z = true;
                if (component3.m59038b().size() == 1) {
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) component3.m59038b());
                    WireBird wireBird = (WireBird) first;
                    C42483i25.this.m35236J5(wireBird, (component2.m59037c() && Intrinsics.areEqual(component2.m59038b().getId(), wireBird.getId())) ? false : false);
                    MapBirdUi.DefaultImpls.zoomTo$default(C42483i25.this.f86330P, wireBird, C42483i25.this.f86355h.mo43616p().m73665a(), false, 4, null);
                    return;
                }
            }
            if (C42483i25.this.f86341a.m82623f8().m73665a().getPrivateBirdConfig().getUseConsolidatedPrivateBirdList()) {
                C42483i25.this.f86333S.mo37094S3();
            } else {
                C42483i25.this.f86333S.mo37045c0(I35.MY_BIRDS.ordinal());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends Optional<WireBird>, ? extends Optional<List<? extends WireBird>>> triple) {
            m34629a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireCoupon;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$v1 */
    /* loaded from: classes2.dex */
    public static final class C23085v1 extends Lambda implements Function1<List<? extends WireCoupon>, Boolean> {

        /* renamed from: g */
        public static final C23085v1 f86621g = new C23085v1();

        public C23085v1() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<WireCoupon> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends WireCoupon> list) {
            return invoke2((List<WireCoupon>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "rideStates", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$v2 */
    /* loaded from: classes2.dex */
    public static final class C23086v2 extends Lambda implements Function1<RideStates, Integer> {

        /* renamed from: g */
        public static final C23086v2 f86622g = new C23086v2();

        public C23086v2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(RideStates rideStates) {
            Intrinsics.checkNotNullParameter(rideStates, "rideStates");
            return Integer.valueOf(rideStates.getActiveRideCount());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Li25$b;", "value", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$w */
    /* loaded from: classes2.dex */
    public static final class C23087w extends Lambda implements Function1<Optional<C22991b>, InterfaceC23434B<? extends C22991b>> {

        /* renamed from: g */
        public static final C23087w f86623g = new C23087w();

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Li25$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Li25$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$w$a */
        /* loaded from: classes2.dex */
        public static final class C23088a extends Lambda implements Function1<Long, C22991b> {

            /* renamed from: g */
            public final /* synthetic */ Optional<C22991b> f86624g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23088a(Optional<C22991b> optional) {
                super(1);
                this.f86624g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C22991b invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f86624g.m59038b();
            }
        }

        public C23087w() {
            super(1);
        }

        /* renamed from: c */
        public static final C22991b m34625c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C22991b) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends C22991b> invoke(Optional<C22991b> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value.m59037c()) {
                Observable<Long> timer = Observable.timer(3L, TimeUnit.SECONDS);
                final C23088a c23088a = new C23088a(value);
                return timer.map(new InterfaceC23492o() { // from class: j25
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        C42483i25.C22991b m34625c;
                        m34625c = C42483i25.C23087w.m34625c(Function1.this, obj);
                        return m34625c;
                    }
                });
            }
            return Observable.never();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$w0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23089w0 extends FunctionReferenceImpl implements Function1<List<? extends Area>, Unit> {
        public C23089w0(Object obj) {
            super(1, obj, C42483i25.class, "showCurrentParkingBanner", "showCurrentParkingBanner(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Area> list) {
            invoke2((List<Area>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Area> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C42483i25) this.receiver).m34810x8(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "coupons", "", "Lco/bird/android/model/wire/WireCoupon;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$66\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1747#2,3:4446\n1747#2,3:4449\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$66\n*L\n1173#1:4446,3\n1174#1:4449,3\n*E\n"})
    /* renamed from: i25$w1 */
    /* loaded from: classes2.dex */
    public static final class C23090w1 extends Lambda implements Function1<List<? extends WireCoupon>, Unit> {
        public C23090w1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireCoupon> list) {
            invoke2((List<WireCoupon>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireCoupon> coupons) {
            Object first;
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullExpressionValue(coupons, "coupons");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) coupons);
            WireCoupon wireCoupon = (WireCoupon) first;
            int abs = Math.abs(Seconds.secondsBetween(wireCoupon.getActivatedAt(), wireCoupon.getExpiresAt()).getSeconds()) / 60;
            List<WireCoupon> list = coupons;
            boolean z4 = list instanceof Collection;
            boolean z5 = true;
            if (!z4 || !list.isEmpty()) {
                for (WireCoupon wireCoupon2 : list) {
                    if (wireCoupon2.getKind() == CouponKind.FREE_RESERVE) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z4 || !list.isEmpty()) {
                for (WireCoupon wireCoupon3 : list) {
                    if (wireCoupon3.getKind() == CouponKind.FREE_UNLOCK) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            z5 = false;
            if (z2 && z5) {
                C42483i25.this.f86331Q.mo75619Zc(abs);
            } else if (z2) {
                C42483i25.this.f86331Q.mo75596od(abs);
            } else if (z5) {
                C42483i25.this.f86331Q.mo75644Jc(abs);
            }
            C42483i25.this.f86371p.mo90005c();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "rideCount", "", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$w2 */
    /* loaded from: classes2.dex */
    public static final class C23091w2 extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public static final C23091w2 f86626g = new C23091w2();

        public C23091w2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Integer rideCount) {
            boolean z;
            Intrinsics.checkNotNullParameter(rideCount, "rideCount");
            if (rideCount.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Li25$b;", "kotlin.jvm.PlatformType", "deeplinkFallback", "", C17296a.f69688o, "(Li25$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$x */
    /* loaded from: classes2.dex */
    public static final class C23092x extends Lambda implements Function1<C22991b, Unit> {
        public C23092x() {
            super(1);
        }

        /* renamed from: a */
        public final void m34622a(C22991b c22991b) {
            C42483i25.this.m35154R7(c22991b.m34692a(), true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C22991b c22991b) {
            m34622a(c22991b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "t1", "t2", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$x0 */
    /* loaded from: classes2.dex */
    public static final class C23093x0 extends Lambda implements Function2<Optional<WireBird>, Optional<WireBird>, Boolean> {

        /* renamed from: g */
        public static final C23093x0 f86628g = new C23093x0();

        public C23093x0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Optional<WireBird> t1, Optional<WireBird> t2) {
            String str;
            String str2;
            boolean z;
            String str3;
            Intrinsics.checkNotNullParameter(t1, "t1");
            Intrinsics.checkNotNullParameter(t2, "t2");
            WireBird m59035e = t1.m59035e();
            WireBird m59035e2 = t2.m59035e();
            String str4 = null;
            if (m59035e != null) {
                str = m59035e.getPartnerId();
            } else {
                str = null;
            }
            if (m59035e2 != null) {
                str2 = m59035e2.getPartnerId();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str, str2)) {
                if (m59035e != null) {
                    str3 = m59035e.getAreaKey();
                } else {
                    str3 = null;
                }
                if (m59035e2 != null) {
                    str4 = m59035e2.getAreaKey();
                }
                if (Intrinsics.areEqual(str3, str4)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "coupons", "", "Lco/bird/android/model/wire/WireCoupon;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$x1 */
    /* loaded from: classes2.dex */
    public static final class C23094x1 extends Lambda implements Function1<List<? extends WireCoupon>, Boolean> {

        /* renamed from: g */
        public static final C23094x1 f86629g = new C23094x1();

        public C23094x1() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<WireCoupon> coupons) {
            Intrinsics.checkNotNullParameter(coupons, "coupons");
            return Boolean.valueOf(!coupons.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends WireCoupon> list) {
            return invoke2((List<WireCoupon>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Integer;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$x2 */
    /* loaded from: classes2.dex */
    public static final class C23095x2 extends Lambda implements Function1<Integer, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$x2$a */
        /* loaded from: classes2.dex */
        public static final class C23096a extends Lambda implements Function1<Long, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C42483i25 f86631g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23096a(C42483i25 c42483i25) {
                super(1);
                this.f86631g = c42483i25;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23496h invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!this.f86631g.f86378s0 && this.f86631g.f86315A.mo15897l().m73665a() == RideMapState.NONE && !this.f86631g.f86361k.mo83798e().m73665a().m59037c()) {
                    C41318g46.m40157g("loading birds nearby from trigger since no birds have been received yet", new Object[0]);
                    C42483i25 c42483i25 = this.f86631g;
                    return c42483i25.m35247I4(c42483i25.f86330P.latLngBounds());
                }
                boolean z = this.f86631g.f86378s0;
                RideMapState m73665a = this.f86631g.f86315A.mo15897l().m73665a();
                boolean m59037c = this.f86631g.f86361k.mo83798e().m73665a().m59037c();
                C41318g46.m40157g("manual bird refresh not required as we've already attempted to load birds since resuming (or conditions were not met to attempt a refresh)requestedBirdsNearbyAfterRideCountReset = " + z + "rideMapState = " + m73665a + " reservation present = " + m59037c, new Object[0]);
                return AbstractC23461c.m33039p();
            }
        }

        public C23095x2() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m34618c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C42483i25.this.f86378s0 = false;
            C41318g46.m40157g("active ride count reset to 0, starting timer to wait for bird refreshes", new Object[0]);
            AbstractC23442F<Long> m33152N = AbstractC23442F.m33133f0(2000L, TimeUnit.MILLISECONDS).m33152N(C23454a.m33087a());
            final C23096a c23096a = new C23096a(C42483i25.this);
            return m33152N.m33164B(new InterfaceC23492o() { // from class: E25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m34618c;
                    m34618c = C42483i25.C23095x2.m34618c(Function1.this, obj);
                    return m34618c;
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "riderOutsideServiceArea", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$y */
    /* loaded from: classes2.dex */
    public static final class C23097y extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C23097y f86632g = new C23097y();

        public C23097y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean riderOutsideServiceArea) {
            Intrinsics.checkNotNullParameter(riderOutsideServiceArea, "riderOutsideServiceArea");
            return riderOutsideServiceArea;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$y0 */
    /* loaded from: classes2.dex */
    public static final class C23098y0 extends Lambda implements Function1<Optional<WireBird>, Unit> {
        public C23098y0() {
            super(1);
        }

        /* renamed from: a */
        public final void m34617a(Optional<WireBird> optional) {
            Unit unit;
            WireBird m59035e = optional.m59035e();
            C42483i25.this.m34787z9(m59035e);
            if (m59035e != null) {
                C42483i25.this.f86373q.mo103478a(m59035e.getAreaKey());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C42483i25.this.f86373q.mo103477b();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireBird> optional) {
            m34617a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00040\u0004 \u0006*,\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCoupon;", "it", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$y1 */
    /* loaded from: classes2.dex */
    public static final class C23099y1 extends Lambda implements Function1<List<? extends WireCoupon>, InterfaceC23434B<? extends Optional<List<? extends WireRide>>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireRide;", "rides", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: i25$y1$a */
        /* loaded from: classes2.dex */
        public static final class C23100a extends Lambda implements Function1<List<? extends WireRide>, Optional<List<? extends WireRide>>> {

            /* renamed from: g */
            public static final C23100a f86635g = new C23100a();

            public C23100a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<List<WireRide>> invoke(List<WireRide> rides) {
                Intrinsics.checkNotNullParameter(rides, "rides");
                return Optional.f63040c.m59032c(rides);
            }
        }

        public C23099y1() {
            super(1);
        }

        /* renamed from: c */
        public static final Optional m34614c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Optional<List<WireRide>>> invoke(List<WireCoupon> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC24507p<List<WireRide>> mo75039i = C42483i25.this.m35012f4().mo75039i();
            final C23100a c23100a = C23100a.f86635g;
            return mo75039i.m32067H(new InterfaceC23492o() { // from class: w25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m34614c;
                    m34614c = C42483i25.C23099y1.m34614c(Function1.this, obj);
                    return m34614c;
                }
            }).m32035j(Optional.f63040c.m59034a()).m32045d0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$showBatteryFreeReserveOrUnlockDialog$onDismiss$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4445:1\n1549#2:4446\n1620#2,3:4447\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$showBatteryFreeReserveOrUnlockDialog$onDismiss$1\n*L\n3582#1:4446\n3582#1:4447,3\n*E\n"})
    /* renamed from: i25$y2 */
    /* loaded from: classes2.dex */
    public static final class C23101y2 extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<WireCoupon> f86637h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23101y2(List<WireCoupon> list) {
            super(0);
            this.f86637h = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            int collectionSizeOrDefault;
            C22454gl c22454gl = C42483i25.this.f86379t;
            List<WireCoupon> list = this.f86637h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireCoupon wireCoupon : list) {
                arrayList.add(wireCoupon.getId());
            }
            c22454gl.m37729G1(arrayList);
            C42483i25.this.f86369o.mo27766w();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "LHM4;", "Lco/bird/android/model/NonComplianceWarning;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$z */
    /* loaded from: classes2.dex */
    public static final class C23102z extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends HM4<NonComplianceWarning>>> {
        public C23102z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<NonComplianceWarning>> invoke(Boolean it) {
            String str;
            WireRide ride;
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("listenForOutsideServiceAreaComplianceEvents compliance event triggered", new Object[0]);
            InterfaceC52458ys0 interfaceC52458ys0 = C42483i25.this.f86363l;
            NonComplianceWarningKind nonComplianceWarningKind = NonComplianceWarningKind.LEFT_OUTSIDE_SERVICE_AREA;
            RideState m59035e = C42483i25.this.m35012f4().mo75057R().m73665a().m59035e();
            if (m59035e != null && (ride = m59035e.getRide()) != null) {
                str = ride.getId();
            } else {
                str = null;
            }
            return InterfaceC52458ys0.C30762a.logWarningShown$default(interfaceC52458ys0, nonComplianceWarningKind, str, C42483i25.this.m35128U3().getRideConfig().getCurrency(), null, 8, null).m33125j0();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$z0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C23103z0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C23103z0 f86639b = new C23103z0();

        public C23103z0() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideMapState;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideMapState;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: i25$z1 */
    /* loaded from: classes2.dex */
    public static final class C23104z1 extends Lambda implements Function1<RideMapState, Boolean> {

        /* renamed from: g */
        public static final C23104z1 f86640g = new C23104z1();

        public C23104z1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RideMapState it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == RideMapState.DESTINATION_SELECTION) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "b", "()Lco/bird/android/model/wire/WirePhysicalLock;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$showPhysicalLockTutorialIfNeeded$eb100Lock$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n288#2,2:4446\n1#3:4448\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$showPhysicalLockTutorialIfNeeded$eb100Lock$2\n*L\n3281#1:4446,2\n*E\n"})
    /* renamed from: i25$z2 */
    /* loaded from: classes2.dex */
    public static final class C23105z2 extends Lambda implements Function0<WirePhysicalLock> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f86641g;

        /* renamed from: h */
        public final /* synthetic */ Lazy<Boolean> f86642h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23105z2(WireBird wireBird, Lazy<Boolean> lazy) {
            super(0);
            this.f86641g = wireBird;
            this.f86642h = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final WirePhysicalLock invoke() {
            List<WirePhysicalLock> physicalLocks;
            Object obj;
            WireBird wireBird = this.f86641g;
            if (wireBird == null || (physicalLocks = wireBird.getPhysicalLocks()) == null) {
                return null;
            }
            Iterator<T> it = physicalLocks.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((WirePhysicalLock) obj).isEB100CableLock()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) obj;
            if (wirePhysicalLock == null || !C42483i25.m35316B8(this.f86642h)) {
                return null;
            }
            return wirePhysicalLock;
        }
    }

    public C42483i25(C36207Tq4 reactiveConfig, InterfaceC12495bn areaManager, InterfaceC27246pJ bluetoothManager, YR4 rideManager, InterfaceC37014Xc1 endRideManager, InterfaceC10636aM birdManager, InterfaceC47256q54 privateBirdsManager, InterfaceC40001dr4 locationManager, GI3 partnerManager, InterfaceC44573la2 issueManager, MK4 reservationManager, InterfaceC52458ys0 complianceManager, InterfaceC46193oI5 smartlockManager, AbstractC39873de5 rxBleClient, V74 promoManager, InterfaceC31893Bf1 ephemeralPromoManager, InterfaceC33117Gl1 filterAreasManager, InterfaceC32604Eg1 eventBus, Handler handler, C22454gl preference, InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager, InterfaceC46820pM3 paymentIntentManager, XX4 ridepaymentIntentDelegateFactory, InterfaceC52757zN3 paymentMethodManager, WX2 myBirdsManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC46164oF3 parkingManager, InterfaceC35583Qz1 frequentFlyerManager, InterfaceC31951Bl5 scanlessRideManager, InterfaceC36821Wg6 userGuestManager, InterfaceC7807TL birdLocationManager, WU4 ridePassManager, InterfaceC34441Mc2 itemLeaseManager, C51174wi2 jsonDeserializer, InterfaceC44791lw0 configurableTutorialManager, InterfaceC28816tm arManager, InterfaceC42163hW0 deeplinkManager, InterfaceC47297q95 riderMapDataManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, Context context, G95 mapUi, P75 rideUi, InterfaceC51004wQ2 menuUi, InterfaceC40099e13 navigator, DQ3 permissionManager, InterfaceC48572sJ4 requirementPresenter, InterfaceC38875bz1 freeRideDelegate, InterfaceC37617Zr1 flightBannerCoordinatorPresenter, L44 privateBirdPresenter) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(issueManager, "issueManager");
        Intrinsics.checkNotNullParameter(reservationManager, "reservationManager");
        Intrinsics.checkNotNullParameter(complianceManager, "complianceManager");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(ephemeralPromoManager, "ephemeralPromoManager");
        Intrinsics.checkNotNullParameter(filterAreasManager, "filterAreasManager");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(paymentIntentManager, "paymentIntentManager");
        Intrinsics.checkNotNullParameter(ridepaymentIntentDelegateFactory, "ridepaymentIntentDelegateFactory");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(myBirdsManager, "myBirdsManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(parkingManager, "parkingManager");
        Intrinsics.checkNotNullParameter(frequentFlyerManager, "frequentFlyerManager");
        Intrinsics.checkNotNullParameter(scanlessRideManager, "scanlessRideManager");
        Intrinsics.checkNotNullParameter(userGuestManager, "userGuestManager");
        Intrinsics.checkNotNullParameter(birdLocationManager, "birdLocationManager");
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(arManager, "arManager");
        Intrinsics.checkNotNullParameter(deeplinkManager, "deeplinkManager");
        Intrinsics.checkNotNullParameter(riderMapDataManager, "riderMapDataManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(rideUi, "rideUi");
        Intrinsics.checkNotNullParameter(menuUi, "menuUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        Intrinsics.checkNotNullParameter(freeRideDelegate, "freeRideDelegate");
        Intrinsics.checkNotNullParameter(flightBannerCoordinatorPresenter, "flightBannerCoordinatorPresenter");
        Intrinsics.checkNotNullParameter(privateBirdPresenter, "privateBirdPresenter");
        this.f86341a = reactiveConfig;
        this.f86343b = areaManager;
        this.f86345c = bluetoothManager;
        this.f86347d = rideManager;
        this.f86349e = endRideManager;
        this.f86351f = birdManager;
        this.f86353g = privateBirdsManager;
        this.f86355h = locationManager;
        this.f86357i = partnerManager;
        this.f86359j = issueManager;
        this.f86361k = reservationManager;
        this.f86363l = complianceManager;
        this.f86365m = smartlockManager;
        this.f86367n = rxBleClient;
        this.f86369o = promoManager;
        this.f86371p = ephemeralPromoManager;
        this.f86373q = filterAreasManager;
        this.f86375r = eventBus;
        this.f86377s = handler;
        this.f86379t = preference;
        this.f86381u = userManager;
        this.f86382v = analyticsManager;
        this.f86383w = paymentIntentManager;
        this.f86384x = ridepaymentIntentDelegateFactory;
        this.f86385y = paymentMethodManager;
        this.f86386z = myBirdsManager;
        this.f86315A = rideMapStateManager;
        this.f86316B = parkingManager;
        this.f86317C = frequentFlyerManager;
        this.f86318D = scanlessRideManager;
        this.f86319E = userGuestManager;
        this.f86320F = birdLocationManager;
        this.f86321G = ridePassManager;
        this.f86322H = itemLeaseManager;
        this.f86323I = jsonDeserializer;
        this.f86324J = configurableTutorialManager;
        this.f86325K = arManager;
        this.f86326L = deeplinkManager;
        this.f86327M = riderMapDataManager;
        this.f86328N = scopeProvider;
        this.f86329O = context;
        this.f86330P = mapUi;
        this.f86331Q = rideUi;
        this.f86332R = menuUi;
        this.f86333S = navigator;
        this.f86334T = permissionManager;
        this.f86335U = requirementPresenter;
        this.f86336V = freeRideDelegate;
        this.f86337W = flightBannerCoordinatorPresenter;
        this.f86338X = privateBirdPresenter;
        lazy = LazyKt__LazyJVMKt.lazy(new C23062p2());
        this.f86339Y = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        this.f86340Z = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        C24552a<ParkingType> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<ParkingType>()");
        this.f86348d0 = m31922e;
        C24552a<Boolean> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Boolean>()");
        this.f86350e0 = m31922e2;
        this.f86352f0 = true;
        C0058AG<O12> m115950h = C0058AG.m115950h(O12.C5810b.f25522a);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<InfoButton…te>(InfoButtonState.None)");
        this.f86354g0 = m115950h;
        C45168ma4<Pair<WireBird, WireRide>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Pair<WireBird, WireRide>>()");
        this.f86356h0 = m25409g;
        C45168ma4<Boolean> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Boolean>()");
        this.f86358i0 = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.f86360j0 = m25409g3;
        this.f86370o0 = c10586a.m71835a(Optional.f63040c.m59034a(), C23057o2.f86593g);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C23039l2());
        this.f86372p0 = lazy2;
        this.f86374q0 = new LinkedHashMap();
        this.f86380t0 = new LinkedHashSet();
    }

    /* renamed from: A3 */
    public static final InterfaceC23496h m35332A3(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required bluetooth connect permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f86334T.m110485l(Permission.BLUETOOTH_CONNECT);
        final C23021i c23021i = C23021i.f86555g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: KY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35321B3(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: A4 */
    public static final InterfaceC23434B m35331A4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: A6 */
    public static final boolean m35329A6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: A7 */
    public static final void m35328A7(C42483i25 this$0, WireBird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        this$0.m35228K3();
        this$0.m35236J5(bird, false);
    }

    /* renamed from: B3 */
    public static final void m35321B3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B4 */
    public static final void m35320B4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B5 */
    public static final void m35319B5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B6 */
    public static final void m35318B6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B7 */
    public static final void m35317B7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B8 */
    public static final boolean m35316B8(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    /* renamed from: C3 */
    public static final InterfaceC23496h m35310C3(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required notification permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f86334T.m110485l(Permission.POST_NOTIFICATION);
        final C23025j c23025j = C23025j.f86560g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: JY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35299D3(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: C5 */
    public static final void m35308C5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C6 */
    public static final void m35307C6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C7 */
    public static final void m35306C7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C8 */
    public static final WirePhysicalLock m35305C8(Lazy<WirePhysicalLock> lazy) {
        return lazy.getValue();
    }

    /* renamed from: C9 */
    public static final void m35304C9(C42483i25 this$0, Location location, Float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(location, "$location");
        this$0.f86330P.zoomTo(location, f);
    }

    /* renamed from: D3 */
    public static final void m35299D3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D5 */
    public static final void m35297D5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D6 */
    public static final Optional m35296D6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: D7 */
    public static final InterfaceC23434B m35295D7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: E3 */
    public static final InterfaceC23496h m35288E3(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.m35177P4();
    }

    /* renamed from: E4 */
    public static final boolean m35287E4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: E5 */
    public static final void m35286E5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E6 */
    public static final void m35285E6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E7 */
    public static final List m35284E7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: F3 */
    public static final InterfaceC23496h m35278F3(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC23442F<ScanIntention> m35218L3 = this$0.m35218L3();
        final C23030k c23030k = new C23030k();
        return m35218L3.m33101w(new InterfaceC23484g() { // from class: CY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35268G3(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: F4 */
    public static final InterfaceC24574u m35277F4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F5 */
    public static final void m35276F5(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC41921h56.C22549a.topToast$default(this$0.f86331Q, C45871nl4.owned_bird_details_unpair_complete_toast, (EnumC40735f56) null, 2, (Object) null);
    }

    /* renamed from: F6 */
    public static final InterfaceC23434B m35275F6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F7 */
    public static final void m35274F7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G3 */
    public static final void m35268G3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G4 */
    public static final void m35267G4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G5 */
    public static final void m35266G5(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC41921h56.C22549a.topToast$default(this$0.f86331Q, C45871nl4.long_term_rental_canceled_toast, (EnumC40735f56) null, 2, (Object) null);
    }

    /* renamed from: G6 */
    public static final void m35265G6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G7 */
    public static final Optional m35264G7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: G8 */
    public static final void m35263G8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H4 */
    public static final void m35257H4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H5 */
    public static final void m35256H5(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC41921h56.C22549a.topToast$default(this$0.f86331Q, C45871nl4.long_term_rental_confirmed_toast, (EnumC40735f56) null, 2, (Object) null);
    }

    /* renamed from: H6 */
    public static final Boolean m35255H6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: H7 */
    public static final boolean m35254H7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H8 */
    public static final boolean m35253H8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: I6 */
    public static final void m35245I6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I7 */
    public static final InterfaceC23434B m35244I7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: I8 */
    public static final void m35243I8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J4 */
    public static final void m35237J4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J6 */
    public static final boolean m35235J6(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: J7 */
    public static final boolean m35234J7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: J8 */
    public static final void m35233J8(C42483i25 this$0, RideState rideState, WarningPresentationKind warningPresentationKind) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rideState, "$rideState");
        this$0.m35238J3(rideState, warningPresentationKind);
    }

    /* renamed from: K5 */
    public static final void m35226K5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K6 */
    public static final void m35225K6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K7 */
    public static final void m35224K7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L4 */
    public static final void m35217L4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L5 */
    public static final void m35216L5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L6 */
    public static final boolean m35215L6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: M3 */
    public static final ScanIntention m35208M3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ScanIntention) tmp0.invoke(obj);
    }

    /* renamed from: M6 */
    public static final void m35205M6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N4 */
    public static final void m35197N4(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f86351f.mo71606C0();
    }

    /* renamed from: N5 */
    public static final void m35196N5(C42483i25 this$0, WireBird bird, List rideStates) {
        List plus;
        int collectionSizeOrDefault;
        int mapCapacity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        Intrinsics.checkNotNullParameter(rideStates, "$rideStates");
        this$0.m35236J5(bird, false);
        this$0.f86331Q.mo75635Qd(C37772a75.f49850h.m71865d(rideStates, bird, this$0.f86315A.mo15903f().m73665a(), this$0.f86316B.mo21500j(), this$0.f86341a.m82623f8().m73665a()));
        ArrayList arrayList = new ArrayList();
        Iterator it = rideStates.iterator();
        while (it.hasNext()) {
            WireBird bird2 = ((RideState) it.next()).getRide().getBird();
            if (bird2 != null) {
                arrayList.add(bird2);
            }
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection<? extends WireBird>) ((Collection<? extends Object>) arrayList), bird);
        List<WireBird> list = plus;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (WireBird wireBird : list) {
            arrayList2.add(this$0.f86320F.mo78580b(wireBird));
        }
        G95 g95 = this$0.f86330P;
        WireBird mo78580b = this$0.f86320F.mo78580b(bird);
        Map<String, FH3> mo21508a = this$0.f86316B.mo21508a();
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(mo21508a.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it2 = mo21508a.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), this$0.m34875r9((FH3) entry.getValue()));
        }
        G95.C2676a.setRidingBirds$default(g95, arrayList2, mo78580b, false, linkedHashMap, 4, null);
        this$0.f86330P.mo104259Xg(this$0.f86355h.mo43616p().m73665a(), arrayList2);
    }

    /* renamed from: N6 */
    public static final Optional m35195N6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: N8 */
    public static final void m35193N8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O6 */
    public static final boolean m35185O6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: O7 */
    public static final Optional m35184O7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: O8 */
    public static final void m35183O8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P5 */
    public static final void m35176P5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P6 */
    public static final String m35175P6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: P7 */
    public static final void m35174P7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q3 */
    public static final void m35168Q3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q6 */
    public static final void m35165Q6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q7 */
    public static final void m35164Q7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R4 */
    public static final boolean m35157R4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: R5 */
    public static final void m35156R5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R6 */
    public static final boolean m35155R6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: S4 */
    public static final void m35147S4(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f86349e.mo55549f().m73665a().booleanValue()) {
            C41318g46.m40163a("requesting area refresh now post foreground in case we end ride with radius 500.0", new Object[0]);
            this$0.f86343b.mo64004a0(new C5691Nn(null, Double.valueOf(500.0d), 1, null));
        } else {
            C41318g46.m40163a("did not request area refresh due to areas already having been refreshed after foregrounding", new Object[0]);
        }
        if (!this$0.f86349e.mo55558a().m73665a().booleanValue()) {
            C41318g46.m40163a("requesting nest refresh now post foreground in case we end ride", new Object[0]);
            this$0.f86343b.mo64007T();
            return;
        }
        C41318g46.m40163a("did not request nest refresh due to nests already having been refreshed after foregrounding", new Object[0]);
    }

    /* renamed from: S5 */
    public static final void m35146S5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S6 */
    public static final InterfaceC23447K m35145S6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: S7 */
    public static /* synthetic */ void m35144S7(C42483i25 c42483i25, WireBird wireBird, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c42483i25.m35154R7(wireBird, z);
    }

    /* renamed from: T5 */
    public static final void m35136T5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T6 */
    public static final void m35135T6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T7 */
    public static final void m35134T7(C42483i25 this$0, boolean z, WireBird deeplinkedBird) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deeplinkedBird, "$deeplinkedBird");
        C41318g46.AbstractC20723b m35056b4 = this$0.m35056b4();
        if (z) {
            str = "from fallback";
        } else {
            str = "from detected bird";
        }
        String id = deeplinkedBird.getId();
        String ephemeralId = deeplinkedBird.getEphemeralId();
        String code = deeplinkedBird.getCode();
        WireLocation location = deeplinkedBird.getLocation();
        m35056b4.mo7221o("Selecting bird " + str + ": " + id + " || " + ephemeralId + " || " + code + " || " + location, new Object[0]);
        this$0.f86315A.mo15898k(deeplinkedBird);
        InterfaceC46893pU4.C27310a.setFocusedBird$default(this$0.f86315A, deeplinkedBird, false, 2, null);
        this$0.f86330P.select(deeplinkedBird);
    }

    /* renamed from: T8 */
    public static final InterfaceC23496h m35133T8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: U5 */
    public static final void m35126U5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U6 */
    public static final InterfaceC23434B m35125U6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: V4 */
    public static final Optional m35117V4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: V5 */
    public static final void m35116V5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V6 */
    public static final void m35115V6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V8 */
    public static final void m35113V8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W4 */
    public static final InterfaceC23434B m35107W4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: W5 */
    public static final void m35106W5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W6 */
    public static final void m35105W6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W7 */
    public static final Boolean m35104W7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: W8 */
    public static final void m35103W8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X4 */
    public static final void m35097X4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X5 */
    public static final void m35096X5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X6 */
    public static final void m35095X6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X7 */
    public static final InterfaceC23496h m35094X7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: X8 */
    public static final void m35093X8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y4 */
    public static final void m35087Y4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y5 */
    public static final void m35086Y5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y6 */
    public static final void m35085Y6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y8 */
    public static final void m35083Y8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z5 */
    public static final void m35076Z5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z6 */
    public static final boolean m35075Z6(C42483i25 this$0, Object it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.f86315A.mo15897l().m73665a() != RideMapState.DESTINATION_SELECTION) {
            return true;
        }
        return false;
    }

    /* renamed from: Z8 */
    public static final void m35073Z8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a5 */
    public static final void m35066a5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a6 */
    public static final void m35065a6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a7 */
    public static final void m35064a7(C42483i25 this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f86347d.mo75032o0().m73665a().hasGuestRide()) {
            this$0.f86315A.mo15904e();
        } else if (this$0.m35088Y3() == null && !this$0.f86361k.mo83798e().getValue().m59037c() && this$0.f86315A.mo15903f().getValue() == RideUpdateState.NONE) {
            this$0.m35228K3();
            if (!this$0.f86331Q.mo75590sf()) {
                P75.C6268a.showRideButton$default(this$0.f86331Q, false, 1, null);
            } else if (this$0.f86331Q.mo75613c4()) {
                this$0.m35041c8();
            }
        }
    }

    /* renamed from: a8 */
    public static final void m35063a8(C42483i25 this$0, List list, WireRideDetail wireRideDetail, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m34821w8(list, wireRideDetail, wireBird);
    }

    /* renamed from: a9 */
    public static final void m35062a9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b6 */
    public static final void m35054b6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b7 */
    public static final boolean m35053b7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: b8 */
    public static final void m35052b8(C42483i25 this$0, WireRideDetail wireRideDetail, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m35223K8(wireRideDetail, wireBird);
    }

    /* renamed from: c5 */
    public static final Boolean m35044c5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: c6 */
    public static final void m35043c6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c7 */
    public static final void m35042c7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d5 */
    public static final void m35033d5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d6 */
    public static final void m35032d6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d7 */
    public static final boolean m35031d7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: d9 */
    public static final InterfaceC23447K m35029d9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e5 */
    public static final void m35022e5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e6 */
    public static final void m35021e6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e7 */
    public static final InterfaceC23434B m35020e7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: e8 */
    public static final void m35019e8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e9 */
    public static final void m35018e9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f6 */
    public static final void m35010f6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f7 */
    public static final Boolean m35009f7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: f8 */
    public static final void m35008f8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f9 */
    public static final void m35007f9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g5 */
    public static final boolean m35000g5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: g6 */
    public static final void m34999g6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g7 */
    public static final boolean m34998g7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: g9 */
    public static final void m34996g9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getCurrentParkingMarker$app_birdRelease$annotations() {
    }

    public static /* synthetic */ void getCurrentRideDetail$app_birdRelease$annotations() {
    }

    public static /* synthetic */ void getPhysicalLockSubject$app_birdRelease$annotations() {
    }

    /* renamed from: h5 */
    public static final InterfaceC23434B m34989h5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: h6 */
    public static final boolean m34988h6(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: h7 */
    public static final void m34987h7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h8 */
    public static final void m34986h8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i5 */
    public static final void m34978i5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i6 */
    public static final void m34977i6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i7 */
    public static final Pair m34976i7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: i8 */
    public static final void m34975i8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i9 */
    public static final String m34974i9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: j6 */
    public static final Boolean m34966j6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: j7 */
    public static final void m34965j7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j9 */
    public static final InterfaceC23434B m34963j9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k5 */
    public static final void m34956k5(boolean z, C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            return;
        }
        this$0.f86337W.mo40694N1(FlightBannerNode.FlightBanner.ONBOARDING_IN_PROGRESS);
        this$0.f86337W.mo40694N1(FlightBannerNode.FlightBanner.ONBOARDING_START);
        this$0.f86340Z.accept(Boolean.FALSE);
    }

    /* renamed from: k6 */
    public static final void m34955k6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k7 */
    public static final void m34954k7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k8 */
    public static final void m34953k8(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    /* renamed from: k9 */
    public static final void m34952k9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l4 */
    public static final void m34946l4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l5 */
    public static final void m34945l5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l6 */
    public static final void m34944l6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l7 */
    public static final Boolean m34943l7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: m5 */
    public static final void m34934m5(boolean z, C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.m35045c4().mo7228a("calling dismiss one flow onboarding since no pending requirements", new Object[0]);
            this$0.f86331Q.mo75626Xa();
        }
    }

    /* renamed from: m6 */
    public static final Boolean m34933m6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: m7 */
    public static final void m34932m7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m9 */
    public static final void m34930m9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n5 */
    public static final InterfaceC23496h m34923n5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: n6 */
    public static final boolean m34922n6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: n7 */
    public static final void m34921n7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n9 */
    public static final Pair m34919n9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: o5 */
    public static final void m34912o5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o6 */
    public static final RideMapState m34911o6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RideMapState) tmp0.invoke(obj);
    }

    /* renamed from: o7 */
    public static final void m34910o7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o8 */
    public static final Integer m34909o8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: o9 */
    public static final InterfaceC23447K m34908o9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    public static /* synthetic */ void onRideError$app_birdRelease$default(C42483i25 c42483i25, Throwable th, Boolean bool, WireBird wireBird, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            wireBird = null;
        }
        c42483i25.m35204M7(th, bool, wireBird);
    }

    /* renamed from: p6 */
    public static final void m34900p6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p7 */
    public static final void m34899p7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p8 */
    public static final boolean m34898p8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p9 */
    public static final void m34897p9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q5 */
    public static final void m34890q5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q6 */
    public static final InterfaceC23496h m34889q6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: q7 */
    public static final boolean m34888q7(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj, obj2)).booleanValue();
    }

    /* renamed from: q8 */
    public static final InterfaceC23496h m34887q8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: r4 */
    public static final void m34880r4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r5 */
    public static final void m34879r5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r6 */
    public static final Unit m34878r6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: r7 */
    public static final InterfaceC23496h m34877r7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    public static /* synthetic */ void resetRide$app_birdRelease$default(C42483i25 c42483i25, WireRideDetail wireRideDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRideDetail = null;
        }
        c42483i25.m35074Z7(wireRideDetail);
    }

    /* renamed from: s4 */
    public static final void m34869s4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s6 */
    public static final void m34867s6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s7 */
    public static final void m34866s7() {
        C41318g46.m40163a("waitForEndRideConditions completed, performing side effects and then trying to park", new Object[0]);
    }

    /* renamed from: t3 */
    public static final void m34859t3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t4 */
    public static final void m34858t4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t5 */
    public static final InterfaceC24574u m34857t5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: t6 */
    public static final void m34856t6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t7 */
    public static final void m34855t7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u5 */
    public static final void m34846u5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u6 */
    public static final boolean m34845u6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u7 */
    public static final void m34844u7() {
        C41318g46.m40163a("disposed waitForEndRideConditions stream now", new Object[0]);
    }

    /* renamed from: u9 */
    public static final void m34842u9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v4 */
    public static final Optional m34836v4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: v5 */
    public static final void m34835v5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v6 */
    public static final Unit m34834v6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: v7 */
    public static final void m34833v7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v9 */
    public static final void m34831v9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w3 */
    public static final void m34826w3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w4 */
    public static final Boolean m34825w4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: w6 */
    public static final void m34823w6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w7 */
    public static final void m34822w7(C42483i25 this$0, WireRide wireRide) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f86315A.mo15899j(RideUpdateState.NONE);
        String str = (wireRide == null || (str = wireRide.getId()) == null) ? "unknown" : "unknown";
        C41318g46.m40163a("all end ride conditions were met or timed out, continuing to try and park for ride id: " + str, new Object[0]);
        InterfaceC46164oF3.C26875a.tryToPark$default(this$0.f86316B, this$0, this$0, wireRide, true, false, false, this$0.f86328N, 48, null);
    }

    /* renamed from: x3 */
    public static final boolean m34815x3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: x4 */
    public static final void m34814x4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x5 */
    public static final Optional m34813x5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: x6 */
    public static final boolean m34812x6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: y3 */
    public static final InterfaceC23496h m34804y3(C42483i25 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required bluetooth scan permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f86334T.m110485l(Permission.BLUETOOTH_SCAN);
        final C23017h c23017h = C23017h.f86551g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: ZY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34793z3(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: y4 */
    public static final void m34803y4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y5 */
    public static final void m34802y5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y6 */
    public static final Unit m34801y6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: y9 */
    public static final O12 m34798y9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (O12) tmp0.invoke(obj);
    }

    /* renamed from: z3 */
    public static final void m34793z3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z5 */
    public static final void m34791z5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z6 */
    public static final void m34790z6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z7 */
    public static final void m34789z7(C42483i25 this$0, WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        this$0.m35228K3();
        this$0.f86333S.mo37004j(bird.getId(), I35.MY_BIRD_DETAILS.ordinal(), z, bird.getModel());
    }

    /* renamed from: z8 */
    public static /* synthetic */ boolean m34788z8(C42483i25 c42483i25, WireBird wireBird, boolean z, Integer num, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return c42483i25.m34799y8(wireBird, z, num, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    /* renamed from: A5 */
    public final void m35330A5(ScopeProvider scopeProvider) {
        C24523e c24523e = C24523e.f91168a;
        Observable<List<ScanlessRideItem>> distinctUntilChanged = this.f86318D.mo89852e().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "scanlessRideManager.avai…es.distinctUntilChanged()");
        Observable<Optional<WireBird>> distinctUntilChanged2 = this.f86315A.mo15902g().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "rideMapStateManager.curr…rd.distinctUntilChanged()");
        Observable observeOn = c24523e.m31956a(distinctUntilChanged, distinctUntilChanged2).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22997c0 c22997c0 = new C22997c0();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: j05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35319B5(Function1.this, obj);
            }
        };
        final C23002d0 c23002d0 = C23002d0.f86536b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: k05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35308C5(Function1.this, obj);
            }
        });
        Observable observeOn2 = C37279Yf5.m74575T(this.f86318D.mo89855b(), C23006e0.f86540g).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "scanlessRideManager.curr…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23010f0 c23010f0 = new C23010f0();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: l05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35297D5(Function1.this, obj);
            }
        };
        final C23014g0 c23014g0 = C23014g0.f86548b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: m05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35286E5(Function1.this, obj);
            }
        });
    }

    /* renamed from: A8 */
    public final boolean m35327A8(WireBird wireBird, boolean z, Integer num, boolean z2) {
        Lazy lazy;
        Lazy lazy2;
        WirePhysicalLock m76371b;
        String birdId;
        WireRide ride;
        WireBird bird;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        WireBird bird2;
        List<WirePhysicalLock> physicalLocks;
        Object firstOrNull;
        lazy = LazyKt__LazyJVMKt.lazy(new C22868A2(wireBird, this));
        lazy2 = LazyKt__LazyJVMKt.lazy(new C23105z2(wireBird, lazy));
        if (m34990h4()) {
            WireRide m35088Y3 = m35088Y3();
            if (m35088Y3 != null && (bird2 = m35088Y3.getBird()) != null && (physicalLocks = bird2.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                m76371b = (WirePhysicalLock) firstOrNull;
            }
            m76371b = null;
        } else {
            C37099Xl5 m59035e = this.f86365m.mo21402e().m73665a().m59035e();
            if (m59035e != null) {
                m76371b = m59035e.m76371b();
            }
            m76371b = null;
        }
        if (m76371b == null) {
            m76371b = m35305C8(lazy2);
        }
        if (m76371b != null) {
            if ((wireBird == null || (birdId = wireBird.getId()) == null) && (birdId = m76371b.getBirdId()) == null) {
                RideState m59035e2 = this.f86347d.mo75057R().m73665a().m59035e();
                if (m59035e2 != null && (ride = m59035e2.getRide()) != null && (bird = ride.getBird()) != null) {
                    birdId = bird.getId();
                } else {
                    birdId = null;
                }
            }
            if (m76371b.getPurpose() == PhysicalLockPurpose.HELMET) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean m37706M0 = this.f86379t.m37706M0(m76371b.toTutorialContext(z).toString());
            if (this.f86365m.mo21395l() > 0 && !z2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (birdId != null && this.f86322H.mo55706C(birdId, ItemLeaseType.HELMET)) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean m35316B8 = m35316B8(lazy);
            StringBuilder sb = new StringBuilder();
            sb.append("taking lock if birdId=");
            sb.append(birdId);
            sb.append(" isHelmetPurposeLock=");
            sb.append(z3);
            sb.append(" AND (!hasSeenTutorialForKind=");
            sb.append(!m37706M0);
            sb.append(" and hasLeaseOrNotRequired=");
            sb.append(m35316B8);
            sb.append(") or hasUnlockedLockAndNotEnding=");
            sb.append(z4);
            sb.append(" or hasLeaseForBirdId=");
            sb.append(z5);
            C41318g46.m40163a(sb.toString(), new Object[0]);
            if (z3 && ((!m37706M0 && m35316B8(lazy)) || z4 || z5)) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                m76371b = null;
            }
            if (m76371b != null) {
                C41318g46.m40163a("going to physical lock tutorial from showPhysicalLockTutorialIfNeeded", new Object[0]);
                InterfaceC44791lw0 interfaceC44791lw0 = this.f86324J;
                InterfaceC40099e13 interfaceC40099e13 = this.f86333S;
                ConfigurableTutorialContext tutorialContext = m76371b.toTutorialContext(z);
                if (wireBird != null) {
                    str = wireBird.getModel();
                } else {
                    str = null;
                }
                if (InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(interfaceC44791lw0, interfaceC40099e13, tutorialContext, str, false, num, false, 32, null)) {
                    this.f86379t.m37677T1(m76371b.toTutorialContext(z).toString());
                } else {
                    this.f86379t.m37677T1(m76371b.toTutorialContext(z).toString());
                    C41318g46.m40163a("no tutorial v2 found for lock purpose/unlock (" + m76371b.getPurpose() + "/" + z + ") combo, falling back to legacy physical lock tutorial", new Object[0]);
                    this.f86333S.mo37048b3(m76371b, true, num);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: A9 */
    public final void m35326A9(C37772a75 c37772a75, C37772a75 c37772a752) {
        WireBird wireBird;
        List emptyList;
        List<RideState> m71872e;
        WireBird wireBird2;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int mapCapacity;
        List<RideState> m71872e2;
        Reservation m71873d;
        WireBird wireBird3 = null;
        if (c37772a752 != null && (m71873d = c37772a752.m71873d()) != null) {
            wireBird = m71873d.getBird();
        } else {
            wireBird = null;
        }
        if (wireBird != null) {
            emptyList = CollectionsKt__CollectionsJVMKt.listOf(wireBird);
        } else if (c37772a752 != null && (m71872e = c37772a752.m71872e()) != null) {
            ArrayList arrayList = new ArrayList();
            for (RideState rideState : m71872e) {
                if (RideStateKt.isInRide(rideState)) {
                    wireBird2 = rideState.getRide().getBird();
                } else {
                    wireBird2 = null;
                }
                if (wireBird2 != null) {
                    arrayList.add(wireBird2);
                }
            }
            emptyList = arrayList;
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List<WireBird> list = emptyList;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (WireBird wireBird4 : list) {
            arrayList2.add(wireBird4.getCode());
        }
        boolean z = false;
        C41318g46.m40163a("updateMapForModel called, setting riding birds to " + arrayList2, new Object[0]);
        G95 g95 = this.f86330P;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
        for (WireBird wireBird5 : list) {
            arrayList3.add(this.f86320F.mo78580b(wireBird5));
        }
        WireBird m59035e = this.f86315A.mo15900i().m73665a().m59035e();
        if (m59035e != null) {
            wireBird3 = this.f86320F.mo78580b(m59035e);
        }
        if (c37772a752 != null && (m71872e2 = c37772a752.m71872e()) != null && RideStateKt.anyStartedRides(m71872e2)) {
            z = true;
        }
        Map<String, FH3> mo21508a = this.f86316B.mo21508a();
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(mo21508a.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it = mo21508a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), m34875r9((FH3) entry.getValue()));
        }
        g95.mo104261C4(arrayList3, wireBird3, z, linkedHashMap);
    }

    /* renamed from: B9 */
    public final void m35315B9(C37772a75 c37772a75, C37772a75 c37772a752) {
        int i;
        List<RideState> m71872e;
        if (c37772a752 != null && (m71872e = c37772a752.m71872e()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : m71872e) {
                if (((RideState) obj).getRide().isActive()) {
                    arrayList.add(obj);
                }
            }
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (c37772a752 == null) {
            InterfaceC51004wQ2.C29876a.setTitle$default(this.f86332R, RideTitle.FIND_BIRD, null, 2, null);
        } else if (c37772a752.m71873d() != null) {
            InterfaceC51004wQ2.C29876a.setTitle$default(this.f86332R, RideTitle.RESERVATION, null, 2, null);
        } else if (i > 1) {
            this.f86332R.mo5281a(RideTitle.MULTIPLE_IN_PROGRESS, Integer.valueOf(i));
        } else if (i == 1) {
            if (c37772a752.m71871f() == RideUpdateState.ENDING) {
                InterfaceC51004wQ2.C29876a.setTitle$default(this.f86332R, RideTitle.RIDE_END, null, 2, null);
            } else {
                InterfaceC51004wQ2.C29876a.setTitle$default(this.f86332R, RideTitle.IN_PROGRESS, null, 2, null);
            }
        }
    }

    /* renamed from: C4 */
    public final boolean m35309C4(WireRide wireRide) {
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        WireBird bird = wireRide.getBird();
        if (bird == null || !WireBirdKt.canTreatAsBluetooth(bird, C36441Uq4.m80769c(this.f86341a, wireRide.getBird()))) {
            return false;
        }
        return true;
    }

    /* renamed from: D4 */
    public final void m35298D4() {
        Observable<Boolean> distinctUntilChanged = this.f86358i0.distinctUntilChanged();
        final C23097y c23097y = C23097y.f86632g;
        Observable<Boolean> throttleFirst = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: LY4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35287E4;
                m35287E4 = C42483i25.m35287E4(Function1.this, obj);
                return m35287E4;
            }
        }).throttleFirst(5L, TimeUnit.SECONDS);
        final C23102z c23102z = new C23102z();
        Observable<R> flatMapMaybe = throttleFirst.flatMapMaybe(new InterfaceC23492o() { // from class: MY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m35277F4;
                m35277F4 = C42483i25.m35277F4(Function1.this, obj);
                return m35277F4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun listenForOut…ce events\") }\n      )\n  }");
        Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22865A c22865a = C22865A.f86387g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: NY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35267G4(Function1.this, obj);
            }
        };
        final C22869B c22869b = C22869B.f86392g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: OY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35257H4(Function1.this, obj);
            }
        });
    }

    /* renamed from: D8 */
    public final void m35294D8(ParkingType parkingType) {
        Intrinsics.checkNotNullParameter(parkingType, "<this>");
        if (C22996c.$EnumSwitchMapping$1[parkingType.ordinal()] == 1) {
            this.f86337W.mo40695M1(FlightBannerNode.FlightBanner.DESIGNATED_PARKING_AREA);
        } else {
            this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.DESIGNATED_PARKING_AREA);
        }
    }

    /* renamed from: D9 */
    public final void m35293D9(Location location, List<Area> list) {
        int collectionSizeOrDefault;
        List<? extends Point> listOf;
        Point point = new Point(location.getLongitude(), location.getLatitude());
        ArrayList<Area> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Area) obj).getOperational()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Area area : arrayList) {
            arrayList2.add(area.getRegion());
        }
        Point findClosestPointInPolygons = point.findClosestPointInPolygons(arrayList2);
        if (findClosestPointInPolygons != null) {
            this.f86352f0 = false;
            Point point2 = new Point(findClosestPointInPolygons.f66611x - (point.f66611x - findClosestPointInPolygons.f66611x), findClosestPointInPolygons.f66612y - (point.f66612y - findClosestPointInPolygons.f66612y));
            G95 g95 = this.f86330P;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Point[]{findClosestPointInPolygons, point, point2});
            g95.zoomTo(listOf);
        }
    }

    /* renamed from: E8 */
    public final void m35283E8(boolean z) {
        if (z) {
            this.f86337W.mo40695M1(FlightBannerNode.FlightBanner.RIDER_BAR_END_RIDE_LOCK_PHOTO_REQUIRED);
            this.f86379t.m37724H2(false);
            return;
        }
        this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.RIDER_BAR_END_RIDE_LOCK_PHOTO_REQUIRED);
    }

    /* renamed from: F8 */
    public final void m35273F8() {
        final RideState m59035e = this.f86347d.mo75057R().m73665a().m59035e();
        if (m59035e == null) {
            return;
        }
        final WarningPresentationKind foregroundFocusWarningPresentationKind = m59035e.getRideConfig().getRideConfig().getWarningConfig().getForegroundFocusWarningPresentationKind();
        if (RideWarningConfigKt.isLegacyPresentationKind(foregroundFocusWarningPresentationKind)) {
            return;
        }
        if (this.f86349e.mo55556b(m59035e.getRide())) {
            Z84<Boolean> mo55541l = this.f86349e.mo55541l();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Observable just = Observable.just(Boolean.TRUE);
            final C22872B2 c22872b2 = C22872B2.f86395g;
            Observable<Boolean> timeout = mo55541l.timeout(10L, timeUnit, just.doOnSubscribe(new InterfaceC23484g() { // from class: QZ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m35263G8(Function1.this, obj);
                }
            }));
            final C22876C2 c22876c2 = C22876C2.f86399g;
            AbstractC23461c ignoreElements = timeout.filter(new InterfaceC23494q() { // from class: RZ4
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m35253H8;
                    m35253H8 = C42483i25.m35253H8(Function1.this, obj);
                    return m35253H8;
                }
            }).ignoreElements();
            final C22880D2 c22880d2 = C22880D2.f86404g;
            AbstractC23461c m33034u = ignoreElements.m33084B(new InterfaceC23484g() { // from class: TZ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m35243I8(Function1.this, obj);
                }
            }).m33069Q().m33034u(500L, TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(m33034u, "endRideManager.locationU…0, TimeUnit.MILLISECONDS)");
            Object m33041n = m33034u.m33041n(AutoDispose.m45239a(this.f86328N));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: UZ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42483i25.m35233J8(C42483i25.this, m59035e, foregroundFocusWarningPresentationKind);
                }
            });
            return;
        }
        m35238J3(m59035e, foregroundFocusWarningPresentationKind);
    }

    /* renamed from: H3 */
    public final Observable<WireBird> m35258H3(WireBird wireBird, boolean z) {
        AlarmType alarmType;
        if (z) {
            alarmType = AlarmType.SHORT;
        } else {
            alarmType = AlarmType.CHIRP;
        }
        Observable<WireBird> m33043l = AbstractC23461c.m33073M(this.f86351f.mo71605D0(wireBird, z).ignoreElements().m33069Q(), InterfaceC27246pJ.C27247a.alarm$default(this.f86345c, wireBird, alarmType, true, false, 8, null).ignoreElements().m33069Q()).m33043l(Observable.just(wireBird));
        Intrinsics.checkNotNullExpressionValue(m33043l, "mergeArray(\n      birdMa…en(Observable.just(bird))");
        return m33043l;
    }

    /* renamed from: I3 */
    public final WireBird m35248I3(List<WireBird> list, Location location) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                float m73968c = C37429Yw2.f47648a.m73968c(((WireBird) next).getLocation().fromLocation(), location);
                do {
                    Object next2 = it.next();
                    float m73968c2 = C37429Yw2.f47648a.m73968c(((WireBird) next2).getLocation().fromLocation(), location);
                    if (Float.compare(m73968c, m73968c2) > 0) {
                        next = next2;
                        m73968c = m73968c2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (WireBird) obj;
    }

    /* renamed from: I4 */
    public final AbstractC23461c m35247I4(LatLngBounds latLngBounds) {
        AbstractC23461c m33049i = C37279Yf5.m74561d0(this.f86327M.mo18057a(latLngBounds), 5, 3).m33049i(C37279Yf5.m74561d0(m35207M4(), 5, 3));
        final C22873C c22873c = C22873C.f86396b;
        AbstractC23461c m33069Q = m33049i.m33084B(new InterfaceC23484g() { // from class: T05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35237J4(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "riderMapDataManager.refr…\n      .onErrorComplete()");
        return m33069Q;
    }

    /* renamed from: I5 */
    public void m35246I5(WireBird bird) {
        MobilePartner mobilePartner;
        String string;
        String string2;
        int i;
        Map<CharSequence, Function0<Unit>> mutableMapOf;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Config m80769c = C36441Uq4.m80769c(this.f86341a, bird);
        if (Intrinsics.areEqual(bird.getExternalFeedType(), WireBird.ZIG_ZAG_EXTERNAL_FEED_TYPE) && m80769c.getZigzagConfig().getEnabled() && m80769c.getZigzagConfig().getDeeplinkUrl() != null) {
            String deeplinkUrl = m80769c.getZigzagConfig().getDeeplinkUrl();
            if (deeplinkUrl != null) {
                this.f86333S.mo37021g0(deeplinkUrl);
                return;
            }
            return;
        }
        String partnerId = bird.getPartnerId();
        String str = null;
        if (partnerId != null) {
            mobilePartner = this.f86357i.mo97372A().getValue().get(partnerId);
        } else {
            mobilePartner = null;
        }
        boolean enableDetailedVehicleInfo = this.f86341a.m82623f8().m73665a().getRideConfig().getEnableDetailedVehicleInfo();
        if (enableDetailedVehicleInfo) {
            Context context = this.f86329O;
            if (mobilePartner != null) {
                str = mobilePartner.getDisplayName();
            }
            string = WireBirdKt.getDisplayName(context, str, bird.getModel());
        } else {
            string = this.f86329O.getString(C45871nl4.missing_bird_dialog_title_updated);
            Intrinsics.checkNotNullExpressionValue(string, "{\n      context.getStrin…alog_title_updated)\n    }");
        }
        if (enableDetailedVehicleInfo) {
            string2 = C47819r24.f106320a.m16577c(this.f86329O, bird, C36441Uq4.m80769c(this.f86341a, bird));
        } else {
            string2 = this.f86329O.getString(C45871nl4.missing_bird_dialog_content);
            Intrinsics.checkNotNullExpressionValue(string2, "{\n      context.getStrin…ird_dialog_content)\n    }");
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.m28425to(this.f86329O.getText(C45871nl4.missing_bird_dialog_chirp_alarm), new C23026j0(bird));
        Context context2 = this.f86329O;
        if (C36441Uq4.m80769c(this.f86341a, bird).getInaccessibleBirdConfig().getEnableRiderCannotAccess()) {
            i = C45871nl4.missing_bird_dialog_cannot_capture;
        } else {
            i = C45871nl4.missing_bird_dialog_report_lost;
        }
        pairArr[1] = TuplesKt.m28425to(context2.getText(i), new C23031k0(bird));
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr);
        if (this.f86341a.m82623f8().m73665a().getRideConfig().getEnableMultiModalTutorialButton()) {
            mutableMapOf.put(this.f86329O.getText(C45871nl4.missing_bird_dialog_how_to_ride), new C23022i0(bird));
        }
        this.f86331Q.mo75649Gg(string, string2, mutableMapOf);
    }

    /* renamed from: J3 */
    public final void m35238J3(RideState rideState, WarningPresentationKind warningPresentationKind) {
        QM4 alertDialog$default = C6598Py.toAlertDialog$default(this.f86316B.mo21500j(), false, null, false, 4, null);
        if (alertDialog$default != null) {
            if (!C6598Py.m89227c(alertDialog$default)) {
                alertDialog$default = null;
            }
            if (alertDialog$default != null) {
                m35203M8(rideState, alertDialog$default, warningPresentationKind);
            }
        }
    }

    /* renamed from: J5 */
    public void m35236J5(WireBird bird, boolean z) {
        WireBird bird2;
        boolean z2;
        Integer estimatedRange;
        Long l;
        Intrinsics.checkNotNullParameter(bird, "bird");
        m35173P8(bird, z);
        boolean z3 = true;
        if (this.f86347d.mo75032o0().m73665a().getActiveRideCount() > 1) {
            m35228K3();
            this.f86315A.mo15908a(bird, !z);
        } else if (m35088Y3() == null && !this.f86361k.mo83798e().getValue().m59037c() && this.f86315A.mo15903f().getValue() == RideUpdateState.NONE) {
            if (bird.getPrivateBird() != null && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                P75.C6268a.showRideButton$default(this.f86331Q, false, 1, null);
                m35228K3();
            }
            this.f86315A.mo15908a(bird, !z);
            if (!z) {
                InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
                String id = bird.getId();
                boolean isInRegistration = UserKt.isInRegistration(this.f86379t.m37750B0());
                long m73967d = C37429Yw2.f47648a.m73967d(m34979i4(), bird.getLocation());
                long batteryLevel = bird.getBatteryLevel();
                if (bird.getEstimatedRange() != null) {
                    l = Long.valueOf(estimatedRange.intValue());
                } else {
                    l = null;
                }
                interfaceC1880Ea.mo55905y(new C43243jK2(null, null, null, Boolean.valueOf(isInRegistration), id, Long.valueOf(m73967d), null, null, Long.valueOf(batteryLevel), l, null, null, 3271, null));
                this.f86315A.mo15898k(bird);
                this.f86330P.select(bird);
                if (!WireBirdKt.canTreatAsBluetooth(bird, m35128U3()) || WireBirdKt.isBdCompatible(bird)) {
                    Object m33094as = this.f86351f.mo71605D0(bird, false).m33094as(AutoDispose.m45239a(this.f86328N));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C23037l0 c23037l0 = C23037l0.f86574g;
                    InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: HY4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C42483i25.m35226K5(Function1.this, obj);
                        }
                    };
                    final C23041m0 c23041m0 = C23041m0.f86578g;
                    ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: IY4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C42483i25.m35216L5(Function1.this, obj);
                        }
                    });
                }
                if (bird.getPrivateBird() != null) {
                    if (this.f86386z.mo72985b(bird.getId())) {
                        this.f86333S.mo37004j(bird.getId(), I35.MY_BIRD_DETAILS.ordinal(), false, bird.getModel());
                    } else if (C36441Uq4.m80769c(this.f86341a, bird).getPrivateBirdConfig().getUseBirdUserActions()) {
                        L44.C4731a.setPrivateBird$default(this.f86338X, bird, false, 2, null);
                    }
                }
            }
        } else {
            Reservation m59035e = this.f86361k.mo83798e().getValue().m59035e();
            if (m59035e == null || (bird2 = m59035e.getBird()) == null || !bird2.isProbablySame(bird)) {
                z3 = false;
            }
            if (z3) {
                if (!z) {
                    this.f86330P.select(bird);
                }
                this.f86330P.showInfoWindow();
            }
        }
    }

    /* renamed from: K3 */
    public final void m35228K3() {
        C41318g46.m40160d("deselectCurrentBird called!!", new Object[0]);
        WireBird m59035e = this.f86315A.mo15902g().m73665a().m59035e();
        if (m59035e != null) {
            this.f86330P.deselect(m59035e);
            this.f86330P.removeRoute();
            L44.C4731a.setPrivateBird$default(this.f86338X, null, false, 2, null);
        }
        this.f86315A.mo15907b();
        this.f86315A.mo15904e();
    }

    /* renamed from: K4 */
    public final void m35227K4(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Object m33094as = this.f86351f.mo71585X0(m34979i4(), bird).m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22877D c22877d = new C22877D(bird);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: x05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35217L4(Function1.this, obj);
            }
        });
    }

    /* renamed from: K8 */
    public final void m35223K8(WireRideDetail wireRideDetail, WireBird wireBird) {
        H31.C3014a.showDialog$default(this.f86331Q, MP4.f23110d, false, false, null, null, new C22884E2(wireBird, wireRideDetail), null, 94, null);
    }

    /* renamed from: L3 */
    public final AbstractC23442F<ScanIntention> m35218L3() {
        if (!this.f86347d.mo75061N()) {
            AbstractC23442F<ScanIntention> m33158H = AbstractC23442F.m33158H(ScanIntention.RIDE);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(ScanIntention.RIDE)");
            return m33158H;
        } else if (C42149hU4.m36358a(this.f86347d.mo75057R().m73665a())) {
            AbstractC23442F<ScanIntention> m33158H2 = AbstractC23442F.m33158H(ScanIntention.GUEST_RIDE);
            Intrinsics.checkNotNullExpressionValue(m33158H2, "just(ScanIntention.GUEST_RIDE)");
            return m33158H2;
        } else {
            AbstractC23442F<DialogResponse> dialog = this.f86331Q.dialog(TR4.f35469d, false, true);
            final C23035l c23035l = C23035l.f86573g;
            AbstractC23442F m33157I = dialog.m33157I(new InterfaceC23492o() { // from class: PZ4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ScanIntention m35208M3;
                    m35208M3 = C42483i25.m35208M3(Function1.this, obj);
                    return m35208M3;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "{\n        rideUi.dialog(…    }\n          }\n      }");
            return m33157I;
        }
    }

    /* renamed from: L7 */
    public void m35214L7() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        C41318g46.m40163a("onRideClick (rider tapped start ride button)", new Object[0]);
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        List<Area> value = this.f86343b.mo64001e().getValue();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : value) {
            arrayList.add(area.getId());
        }
        boolean isInRegistration = UserKt.isInRegistration(this.f86379t.m37750B0());
        List<Area> value2 = this.f86343b.mo64001e().getValue();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(value2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (Area area2 : value2) {
            arrayList2.add(Double.valueOf(Seconds.secondsBetween(this.f86343b.mo64011O().getValue().get(area2), DateTime.now()).getSeconds()));
        }
        interfaceC1880Ea.mo55905y(new C33256Ha5(null, null, null, arrayList, arrayList2, null, null, null, null, null, null, null, Boolean.valueOf(isInRegistration), 4071, null));
        m35051b9();
    }

    /* renamed from: L8 */
    public final void m35213L8(Intent intent) {
        if (intent.getBooleanExtra("show_ride_pass_screen", false)) {
            if (this.f86341a.m82623f8().m73665a().getRidePass().getEnabled()) {
                InterfaceC40099e13.C19924a.goToRidePassV4$default(this.f86333S, null, 1, null);
            } else if (this.f86341a.m82623f8().m73665a().getRidePass().getEnabledV2()) {
                InterfaceC40099e13.C19924a.goToRidePassV2$default(this.f86333S, null, 1, null);
            }
        }
    }

    /* renamed from: M4 */
    public final AbstractC23461c m35207M4() {
        ZigZagConfig zigzagConfig = this.f86341a.m82623f8().m73665a().getZigzagConfig();
        if (zigzagConfig.getEnabled()) {
            InterfaceC10636aM interfaceC10636aM = this.f86351f;
            String feedUrl = zigzagConfig.getFeedUrl();
            if (feedUrl == null) {
                feedUrl = "";
            }
            return interfaceC10636aM.mo71583Z0(feedUrl, zigzagConfig.getCenterIds(), zigzagConfig.getPartnerId());
        }
        AbstractC23461c m33029z = AbstractC23461c.m33039p().m33029z(new InterfaceC23478a() { // from class: bZ4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C42483i25.m35197N4(C42483i25.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "{\n      Completable.comp…ZagVehicleCache() }\n    }");
        return m33029z;
    }

    /* renamed from: M5 */
    public final void m35206M5(final WireBird wireBird, boolean z, boolean z2) {
        this.f86315A.mo15898k(wireBird);
        InterfaceC46893pU4.C27310a.setFocusedBird$default(this.f86315A, wireBird, false, 2, null);
        if (!this.f86347d.mo75061N()) {
            final List<RideState> rideStates = this.f86347d.mo75032o0().m73665a().getRideStates();
            this.f86315A.mo15906c(RideMapState.SCANNED);
            this.f86377s.post(new Runnable() { // from class: a25
                @Override // java.lang.Runnable
                public final void run() {
                    C42483i25.m35196N5(C42483i25.this, wireBird, rideStates);
                }
            });
        }
        if (!this.f86341a.m82623f8().m73665a().getRideConfig().getEnableAndroidScanToRide() && !z) {
            C41318g46.m40163a("not automatically starting ride from onBirdScanned", new Object[0]);
            return;
        }
        C41318g46.m40163a("starting ride from onBirdScanned", new Object[0]);
        m35194N7(z2);
    }

    /* renamed from: M7 */
    public final void m35204M7(Throwable th, Boolean bool, WireBird wireBird) {
        PaymentIntentStatusException paymentIntentStatusException;
        C49375tg1 c49375tg1;
        Throwable m59465a;
        Throwable throwable = th;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean z = false;
        C41318g46.m40158f(throwable, "handling error in onRideError", new Object[0]);
        String str = null;
        if (throwable instanceof PaymentIntentStatusException) {
            paymentIntentStatusException = (PaymentIntentStatusException) throwable;
        } else {
            paymentIntentStatusException = null;
        }
        if (paymentIntentStatusException != null && (m59465a = paymentIntentStatusException.m59465a()) != null) {
            throwable = m59465a;
        }
        if (this.f86331Q.mo75578zd()) {
            this.f86331Q.mo75633Sb();
        }
        if (throwable instanceof PaymentIntentStatusException) {
            PaymentIntentStatusException paymentIntentStatusException2 = (PaymentIntentStatusException) throwable;
            if (!(paymentIntentStatusException2.m59464b() instanceof UNKNOWN)) {
                if (Intrinsics.areEqual(paymentIntentStatusException2.m59464b(), COMPLETE.INSTANCE)) {
                    H31.C3014a.showDialog$default(this.f86331Q, EU4.f7538d, false, false, null, null, null, null, 126, null);
                    return;
                } else {
                    H31.C3014a.showDialog$default(this.f86331Q, C43873kO3.f94324d, true, false, null, new C23012f2(), null, null, 108, null);
                    return;
                }
            }
        }
        if (throwable instanceof BluetoothException) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (wireBird != null) {
                    str = wireBird.getId();
                }
                m34964j8(booleanValue, throwable, str);
            }
            H31.C3014a.showDialog$default(this.f86331Q, C24920jX.m30374a((BluetoothException) throwable, wireBird), false, false, null, null, null, null, 126, null);
        } else if (throwable instanceof AckLockTimeoutException) {
            H31.C3014a.showDialog$default(this.f86331Q, C30409y2.f118636d, false, false, null, null, null, null, 126, null);
        } else if (throwable instanceof LocationDisabledException) {
            H31.C3014a.showDialog$default(this.f86331Q, C36718Vv2.f39987d, false, false, new C23016g2(), null, null, null, 118, null);
        } else if (throwable instanceof RideNotPresentException) {
            H31.C3014a.showDialog$default(this.f86331Q, EU4.f7538d, false, false, null, null, null, null, 126, null);
        } else if (throwable instanceof RetrofitException) {
            if (((RetrofitException) throwable).m53928b() == RetrofitException.EnumC16708a.HTTP) {
                try {
                    c49375tg1 = (C49375tg1) ((RetrofitException) throwable).m53929a(C49375tg1.class);
                } catch (Exception unused) {
                    String string = this.f86329O.getString(C45871nl4.error_500);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.error_500)");
                    c49375tg1 = new C49375tg1(500, string, null, null, 12, null);
                }
                if (c49375tg1.m11933b() == 402) {
                    H31.C3014a.showDialog$default(this.f86331Q, C50385vN3.f113971d, true, false, new C23020h2(), null, null, null, 116, null);
                    return;
                } else if (c49375tg1.m11933b() == 409) {
                    H31.C3014a.showDialog$default(this.f86331Q, C30178xT.f117636d, false, false, null, null, null, null, 126, null);
                    return;
                } else {
                    int m11933b = c49375tg1.m11933b();
                    if (400 <= m11933b && m11933b < 499) {
                        z = true;
                    }
                    if (z) {
                        H31.C3014a.showDialog$default(this.f86331Q, this.f86329O.getString(C45871nl4.rider_error_title), c49375tg1.m11932c(), null, null, false, false, null, null, null, 508, null);
                        return;
                    } else {
                        this.f86331Q.error(throwable);
                        return;
                    }
                }
            }
            this.f86331Q.error(throwable);
        } else {
            P75 p75 = this.f86331Q;
            String message = throwable.getMessage();
            if (message == null) {
                message = this.f86329O.getString(C45871nl4.error_generic_body);
                Intrinsics.checkNotNullExpressionValue(message, "context.getString(L.string.error_generic_body)");
            }
            p75.error(message);
        }
    }

    /* renamed from: M8 */
    public final void m35203M8(RideState rideState, QM4 qm4, WarningPresentationKind warningPresentationKind) {
        if (C6598Py.m89229a(qm4)) {
            this.f86382v.mo55905y(O25.m92982b(this, rideState.getRide(), EnumC41529gR4.NO_PARKING, qm4.m88637b()));
        }
        P75 p75 = this.f86331Q;
        if (warningPresentationKind == null) {
            warningPresentationKind = WarningPresentationKind.LEGACY;
        }
        Object m33135e = p75.mo75658Ck(qm4, warningPresentationKind).m33135e(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22888F2 c22888f2 = new C22888F2(qm4, this, rideState);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: t05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35193N8(Function1.this, obj);
            }
        };
        final C22893G2 c22893g2 = C22893G2.f86421b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: u05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35183O8(Function1.this, obj);
            }
        });
    }

    @Override // p000.FU4
    /* renamed from: N0 */
    public void mo35201N0(Function0<Unit> onPrimary) {
        Intrinsics.checkNotNullParameter(onPrimary, "onPrimary");
        this.f86331Q.mo75641N0(onPrimary);
    }

    /* renamed from: N3 */
    public final void m35198N3() {
        this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.DESIGNATED_PARKING_AREA);
    }

    /* renamed from: N7 */
    public final void m35194N7(boolean z) {
        AbstractC23442F m33158H;
        mo34984i();
        WireBird m59035e = this.f86315A.mo15902g().m73665a().m59035e();
        InterfaceC23465c interfaceC23465c = null;
        if (m59035e != null) {
            String id = m59035e.getId();
            String code = m59035e.getCode();
            C41318g46.m40163a("Attempting to start ride on current bird " + id + " / " + code, new Object[0]);
            if (z) {
                AbstractC23442F createUserGuest$default = InterfaceC36821Wg6.C9147a.createUserGuest$default(this.f86319E, null, 1, null);
                final C23024i2 c23024i2 = C23024i2.f86559g;
                m33158H = createUserGuest$default.m33157I(new InterfaceC23492o() { // from class: TY4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m35184O7;
                        m35184O7 = C42483i25.m35184O7(Function1.this, obj);
                        return m35184O7;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n        userGuestManag…Nullable(it.id) }\n      }");
            } else {
                m33158H = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n        Single.just(Optional.absent())\n      }");
            }
            Object m33135e = m33158H.m33135e(AutoDispose.m45239a(this.f86328N));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23029j2 c23029j2 = new C23029j2(m59035e);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: UY4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m35174P7(Function1.this, obj);
                }
            };
            final C23034k2 c23034k2 = new C23034k2();
            interfaceC23465c = ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: VY4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m35164Q7(Function1.this, obj);
                }
            });
        }
        if (interfaceC23465c == null) {
            C41318g46.m40163a("no current bird found to start ride for in onStartRide, doing nothing but hiding this panel", new Object[0]);
            this.f86331Q.mo75599n7();
        }
    }

    /* renamed from: O3 */
    public final void m35188O3() {
        InterfaceC37617Zr1 interfaceC37617Zr1 = this.f86337W;
        interfaceC37617Zr1.mo40694N1(FlightBannerNode.FlightBanner.RIDER_BAR_BLUETOOTH_DISABLED);
        interfaceC37617Zr1.mo40694N1(FlightBannerNode.FlightBanner.RIDER_BAR_LOCATION_SERVICES_DISABLED);
    }

    /* renamed from: O4 */
    public final void m35187O4(Intent intent) {
        m35137T4(intent);
        m35213L8(intent);
        m34832v8(intent);
        m34957k4(intent);
    }

    /* renamed from: O5 */
    public final void m35186O5(WireRide wireRide) {
        Object m33094as = this.f86347d.mo75052c(wireRide).m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23046n0 c23046n0 = new C23046n0(wireRide);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: LZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35176P5(Function1.this, obj);
            }
        });
    }

    /* renamed from: P3 */
    public final void m35178P3() {
        AbstractC23461c m33159G = this.f86381u.mo26967i0(this.f86347d.mo75030r().m73665a().getRideConfig().getCurrency()).m33159G();
        final C23040m c23040m = C23040m.f86577g;
        AbstractC23461c m33069Q = m33159G.m33084B(new InterfaceC23484g() { // from class: fZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35168Q3(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "userManager\n      .fetch…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: P4 */
    public final AbstractC23461c m35177P4() {
        boolean z;
        WireBird wireBird;
        String str;
        boolean z2;
        boolean z3 = false;
        C41318g46.m40163a("maybeShowPreScanAreaSpecificWarning called", new Object[0]);
        RiderAreaState mo64002d = this.f86343b.mo64002d();
        if (mo64002d != null) {
            z = !Intrinsics.areEqual(mo64002d, OUTSIDE_SERVICE_AREA.INSTANCE);
        } else {
            z = false;
        }
        C36207Tq4 c36207Tq4 = this.f86341a;
        WireRide m35088Y3 = m35088Y3();
        String str2 = null;
        if (m35088Y3 != null) {
            wireBird = m35088Y3.getBird();
        } else {
            wireBird = null;
        }
        Config m80769c = C36441Uq4.m80769c(c36207Tq4, wireBird);
        Area m59035e = this.f86343b.mo63992x().getValue().m59035e();
        if (m59035e != null) {
            str = m59035e.getRiderBarNotInRideMessageTitle();
        } else {
            str = null;
        }
        if (m59035e != null) {
            str2 = m59035e.getRiderBarNotInRideMessageBody();
        }
        if (m80769c.getEnableAreaSpecificRiderBarMessages() && z && m59035e != null) {
            if (str != null && str.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (str2 == null || str2.length() == 0) {
                    z3 = true;
                }
                if (!z3) {
                    return this.f86331Q.mo75584vk(C10854an.m70749b(m59035e.getRiderBarNotInRideMessageIconType()), str, str2);
                }
            }
        }
        if (m80769c.getParkingConfig().getEnableOutsideServiceAreaRiderBarParkingFineMessage() && !z) {
            return this.f86331Q.mo75630V7();
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    /* renamed from: P8 */
    public final void m35173P8(WireBird wireBird, boolean z) {
        WarningPresentationKind warningPresentationKind;
        RideState mo75044g0;
        boolean z2;
        boolean z3;
        Config rideConfig;
        RideConfig rideConfig2;
        RideWarningConfig warningConfig;
        RideState mo75044g02 = this.f86347d.mo75044g0(wireBird);
        QM4 qm4 = null;
        if (mo75044g02 != null && (rideConfig = mo75044g02.getRideConfig()) != null && (rideConfig2 = rideConfig.getRideConfig()) != null && (warningConfig = rideConfig2.getWarningConfig()) != null) {
            warningPresentationKind = warningConfig.getPinTapWarningPresentationKind();
        } else {
            warningPresentationKind = null;
        }
        if (RideWarningConfigKt.isLegacyPresentationKind(warningPresentationKind) || this.f86347d.mo75032o0().m73665a().getActiveRideCount() <= 0 || z || (mo75044g0 = this.f86347d.mo75044g0(wireBird)) == null) {
            return;
        }
        FH3 mo21500j = this.f86316B.mo21500j();
        RideState mo75044g03 = this.f86347d.mo75044g0(wireBird);
        boolean z4 = true;
        if (mo75044g03 != null && RideStatesKt.isGuestRide(mo75044g03)) {
            z2 = true;
        } else {
            z2 = false;
        }
        QM4 alertDialog$default = C6598Py.toAlertDialog$default(mo21500j, z2, null, false, 4, null);
        if (alertDialog$default != null) {
            RideState mo75044g04 = this.f86347d.mo75044g0(wireBird);
            if (mo75044g04 != null && RideStatesKt.isPrimaryRide(mo75044g04)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || !C6598Py.m89228b(alertDialog$default)) {
                z4 = false;
            }
            if (z4) {
                qm4 = alertDialog$default;
            }
            if (qm4 != null) {
                m35203M8(mo75044g0, qm4, warningPresentationKind);
            }
        }
    }

    /* renamed from: Q4 */
    public final AbstractC23461c m35167Q4() {
        C41318g46.m40163a("maybeUpdateSurroundingAreasAndNests called", new Object[0]);
        if (this.f86347d.mo75032o0().m73665a().activeRides().isEmpty()) {
            C41318g46.m40163a("no active rides currently, not attempting to update surrounding areas or nests", new Object[0]);
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        } else if (this.f86349e.mo55549f().m73665a().booleanValue() && this.f86349e.mo55558a().m73665a().booleanValue()) {
            C41318g46.m40163a("areas and nests have already been refreshed post foregrounding, not attempting to update surrounding areas or nests again", new Object[0]);
            AbstractC23461c m33039p2 = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p2, "complete()");
            return m33039p2;
        } else {
            Observable m31956a = C24523e.f91168a.m31956a(this.f86349e.mo55541l(), this.f86349e.mo55553d());
            final C22881E c22881e = C22881E.f86405g;
            AbstractC23461c m33029z = m31956a.filter(new InterfaceC23494q() { // from class: PY4
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m35157R4;
                    m35157R4 = C42483i25.m35157R4(Function1.this, obj);
                    return m35157R4;
                }
            }).firstOrError().m33159G().m33069Q().m33029z(new InterfaceC23478a() { // from class: aZ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42483i25.m35147S4(C42483i25.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "Observables.combineLates…nding\")\n        }\n      }");
            return m33029z;
        }
    }

    /* renamed from: Q5 */
    public void m35166Q5(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f86375r.mo104917a(this);
        this.f86379t.m37604l();
        this.f86379t.m37548z(MapMode.RIDER);
        this.f86382v.mo55956N(new MapViewed());
        this.f86315A.reset();
        if (intent.getBooleanExtra("show_complaints_submitted_dialog", false)) {
            this.f86331Q.mo75620Z9();
        }
        C41318g46.m40163a("calling refresh private-bird/all (from onCreate)", new Object[0]);
        AbstractC23461c refresh = this.f86353g.refresh();
        final C23103z0 c23103z0 = C23103z0.f86639b;
        AbstractC23461c m33069Q = refresh.m33084B(new InterfaceC23484g() { // from class: lZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35156R5(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "privateBirdsManager.refr…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        C24523e c24523e = C24523e.f91168a;
        Observable observeOn = c24523e.m31955b(this.f86369o.mo27764y(), this.f86341a.m82833L3(), this.f86347d.mo75057R()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22908K0 c22908k0 = new C22908K0();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: D05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35146S5(Function1.this, obj);
            }
        });
        Observable<RideStatusUnlockButton> subscribeOn = this.f86331Q.mo75639Ok().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "rideUi.unlockButtonClick…dSchedulers.mainThread())");
        Object m33094as2 = subscribeOn.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22963V0 c22963v0 = new C22963V0();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: P05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35136T5(Function1.this, obj);
            }
        });
        Observable<RideStatusLockButton> subscribeOn2 = this.f86331Q.mo75587uh().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn2, "rideUi.lockButtonClicks(…dSchedulers.mainThread())");
        Object m33094as3 = subscribeOn2.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23015g1 c23015g1 = new C23015g1();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: b15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35126U5(Function1.this, obj);
            }
        });
        Observable<RideStatusEndButton> subscribeOn3 = this.f86331Q.mo75597o9().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn3, "rideUi.endRideButtonClic…dSchedulers.mainThread())");
        Object m33094as4 = subscribeOn3.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23069r1 c23069r1 = new C23069r1();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: n15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35116V5(Function1.this, obj);
            }
        });
        Observable<RideStatusManageRidesButton> subscribeOn4 = this.f86331Q.mo75602mi().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn4, "rideUi.manageRidesButton…dSchedulers.mainThread())");
        Object m33094as5 = subscribeOn4.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22867A1 c22867a1 = new C22867A1();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: z15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35106W5(Function1.this, obj);
            }
        });
        Observable<RideStatusScanAfterReserveButton> subscribeOn5 = this.f86331Q.mo75614b4().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn5, "rideUi.scanAfterReserveB…dSchedulers.mainThread())");
        Object m33094as6 = subscribeOn5.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22913L1 c22913l1 = new C22913L1();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: M15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35096X5(Function1.this, obj);
            }
        });
        Observable<Unit> subscribeOn6 = this.f86331Q.mo75618Zg().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn6, "rideUi.rideButtonClicks(…dSchedulers.mainThread())");
        Object m33094as7 = subscribeOn6.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22935Q1 c22935q1 = new C22935Q1();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: X15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35086Y5(Function1.this, obj);
            }
        });
        Observable<Unit> subscribeOn7 = this.f86331Q.mo75637Q().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn7, "rideUi.couponClicks()\n  …dSchedulers.mainThread())");
        Object m33094as8 = subscribeOn7.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22942R1 c22942r1 = new C22942R1();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: Y15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35076Z5(Function1.this, obj);
            }
        });
        Observable observeOn2 = c24523e.m31956a(this.f86355h.mo43609w(), this.f86347d.mo75057R()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as9 = observeOn2.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23064q0 c23064q0 = new C23064q0();
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: Z15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35065a6(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f86331Q.mo75653F().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "rideUi.turnOnClicks()\n  …dSchedulers.mainThread())");
        Object m33094as10 = observeOn3.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23068r0 c23068r0 = new C23068r0();
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: wZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35054b6(Function1.this, obj);
            }
        });
        m35178P3();
        this.f86331Q.mo75612de(this.f86347d.mo75030r().m73665a().getEnableCommunityMode());
        if (this.f86326L.mo30418a() != EnumC46314oW0.MAP) {
            AbstractC23442F<Location> m33152N = this.f86355h.mo43627e(true).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "locationManager.requestL…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f86328N));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23072s0 c23072s0 = new C23072s0();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: HZ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m35043c6(Function1.this, obj);
                }
            });
        } else {
            C41318g46.m40163a("preventing moving map center on ride map create due to deeplink of map type currently in progress", new Object[0]);
        }
        Object m33094as11 = this.f86331Q.mo75643Kb().m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23076t0 c23076t0 = new C23076t0();
        ((ObservableSubscribeProxy) m33094as11).subscribe(new InterfaceC23484g() { // from class: SZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35032d6(Function1.this, obj);
            }
        });
        Observable combineLatest = Observable.combineLatest(this.f86353g.mo18213a(), this.f86315A.mo15897l(), new C23055o0());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observeOn4 = combineLatest.distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as12 = observeOn4.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as12, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23080u0 c23080u0 = new C23080u0();
        ((ObservableSubscribeProxy) m33094as12).subscribe(new InterfaceC23484g() { // from class: d05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35021e6(Function1.this, obj);
            }
        });
        Observable observeOn5 = C24527f.m31949b(this.f86331Q.mo75640O7(), this.f86315A.mo15902g(), this.f86353g.mo18213a()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "rideUi.privateBirdButton…dSchedulers.mainThread())");
        Object m33094as13 = observeOn5.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as13, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23084v0 c23084v0 = new C23084v0();
        ((ObservableSubscribeProxy) m33094as13).subscribe(new InterfaceC23484g() { // from class: o05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35010f6(Function1.this, obj);
            }
        });
        if (m35128U3().getEnablePreferredParkingV0()) {
            Observable<List<Area>> observeOn6 = this.f86343b.mo63995r().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn6, "areaManager.areasNearby\n…dSchedulers.mainThread())");
            Object m33094as14 = observeOn6.m33094as(AutoDispose.m45239a(this.f86328N));
            Intrinsics.checkExpressionValueIsNotNull(m33094as14, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23089w0 c23089w0 = new C23089w0(this);
            ((ObservableSubscribeProxy) m33094as14).subscribe(new InterfaceC23484g() { // from class: y05
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m34999g6(Function1.this, obj);
                }
            });
        }
        Z84<Optional<WireBird>> mo15902g = this.f86315A.mo15902g();
        final C23093x0 c23093x0 = C23093x0.f86628g;
        Observable<Optional<WireBird>> distinctUntilChanged = mo15902g.distinctUntilChanged(new InterfaceC23481d() { // from class: z05
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m34988h6;
                m34988h6 = C42483i25.m34988h6(Function2.this, obj, obj2);
                return m34988h6;
            }
        });
        final C23098y0 c23098y0 = new C23098y0();
        Observable<Optional<WireBird>> doOnNext = distinctUntilChanged.doOnNext(new InterfaceC23484g() { // from class: A05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34977i6(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33094as15 = doOnNext.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as15, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as15).subscribe();
        Observable m31956a = c24523e.m31956a(this.f86315A.mo15902g(), this.f86347d.mo75032o0());
        final C22866A0 c22866a0 = new C22866A0();
        Observable observeOn7 = m31956a.map(new InterfaceC23492o() { // from class: B05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m34966j6;
                m34966j6 = C42483i25.m34966j6(Function1.this, obj);
                return m34966j6;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33094as16 = observeOn7.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as16, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22870B0 c22870b0 = new C22870B0();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: C05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34955k6(Function1.this, obj);
            }
        };
        final C22874C0 c22874c0 = C22874C0.f86397b;
        ((ObservableSubscribeProxy) m33094as16).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: E05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34944l6(Function1.this, obj);
            }
        });
        Z84<Optional<RideState>> mo75057R = this.f86347d.mo75057R();
        Observable<RideUpdateState> distinctUntilChanged2 = this.f86315A.mo15903f().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "rideMapStateManager.ride…ng.distinctUntilChanged()");
        Observable m31956a2 = c24523e.m31956a(mo75057R, distinctUntilChanged2);
        final C22878D0 c22878d0 = C22878D0.f86402g;
        Observable map = m31956a2.map(new InterfaceC23492o() { // from class: F05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m34933m6;
                m34933m6 = C42483i25.m34933m6(Function1.this, obj);
                return m34933m6;
            }
        });
        final C22882E0 c22882e0 = C22882E0.f86406g;
        Observable filter = map.filter(new InterfaceC23494q() { // from class: G05
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34922n6;
                m34922n6 = C42483i25.m34922n6(Function1.this, obj);
                return m34922n6;
            }
        });
        final C22886F0 c22886f0 = C22886F0.f86412g;
        Observable map2 = filter.map(new InterfaceC23492o() { // from class: H05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RideMapState m34911o6;
                m34911o6 = C42483i25.m34911o6(Function1.this, obj);
                return m34911o6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "Observables.combineLates…p { RideMapState.RIDING }");
        Object m33094as17 = map2.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as17, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22891G0 c22891g0 = new C22891G0();
        ((ObservableSubscribeProxy) m33094as17).subscribe(new InterfaceC23484g() { // from class: J05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34900p6(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn8 = this.f86360j0.observeOn(C23454a.m33087a());
        final C22895H0 c22895h0 = new C22895H0();
        AbstractC23461c switchMapCompletable = observeOn8.switchMapCompletable(new InterfaceC23492o() { // from class: K05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m34889q6;
                m34889q6 = C42483i25.m34889q6(Function1.this, obj);
                return m34889q6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33041n2 = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<Unit> mo75592ra = this.f86331Q.mo75592ra();
        final C22900I0 c22900i0 = C22900I0.f86428g;
        Observable<R> map3 = mo75592ra.map(new InterfaceC23492o() { // from class: L05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m34878r6;
                m34878r6 = C42483i25.m34878r6(Function1.this, obj);
                return m34878r6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "rideUi.addRideButtonClicks()\n      .map { }");
        Object m33094as18 = map3.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as18, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22904J0 c22904j0 = new C22904J0(this.f86360j0);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: M05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34867s6(Function1.this, obj);
            }
        };
        final C22912L0 c22912l0 = C22912L0.f86441g;
        ((ObservableSubscribeProxy) m33094as18).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: N05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34856t6(Function1.this, obj);
            }
        });
        Observable<J35.C3879a> mo14400e = this.f86335U.mo14400e();
        final C22916M0 c22916m0 = C22916M0.f86445g;
        Observable<J35.C3879a> filter2 = mo14400e.filter(new InterfaceC23494q() { // from class: O05
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34845u6;
                m34845u6 = C42483i25.m34845u6(Function1.this, obj);
                return m34845u6;
            }
        });
        final C22920N0 c22920n0 = C22920N0.f86451g;
        Observable observeOn9 = filter2.map(new InterfaceC23492o() { // from class: Q05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m34834v6;
                m34834v6 = C42483i25.m34834v6(Function1.this, obj);
                return m34834v6;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "requirementPresenter.req…dSchedulers.mainThread())");
        Object m33094as19 = observeOn9.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as19, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22926O0 c22926o0 = new C22926O0();
        ((ObservableSubscribeProxy) m33094as19).subscribe(new InterfaceC23484g() { // from class: R05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34823w6(Function1.this, obj);
            }
        });
        Observable<J35.C3879a> mo14400e2 = this.f86335U.mo14400e();
        final C22930P0 c22930p0 = C22930P0.f86463g;
        Observable<J35.C3879a> filter3 = mo14400e2.filter(new InterfaceC23494q() { // from class: S05
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34812x6;
                m34812x6 = C42483i25.m34812x6(Function1.this, obj);
                return m34812x6;
            }
        });
        final C22934Q0 c22934q0 = C22934Q0.f86468g;
        Observable<R> map4 = filter3.map(new InterfaceC23492o() { // from class: U05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m34801y6;
                m34801y6 = C42483i25.m34801y6(Function1.this, obj);
                return m34801y6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "requirementPresenter.req….toLogString()}\")\n      }");
        Object m33094as20 = map4.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as20, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22941R0 c22941r0 = new C22941R0(this.f86360j0);
        ((ObservableSubscribeProxy) m33094as20).subscribe(new InterfaceC23484g() { // from class: V05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34790z6(Function1.this, obj);
            }
        });
        Observable<J35.C3879a> mo14400e3 = this.f86335U.mo14400e();
        final C22945S0 c22945s0 = C22945S0.f86478g;
        Observable<J35.C3879a> filter4 = mo14400e3.filter(new InterfaceC23494q() { // from class: W05
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35329A6;
                m35329A6 = C42483i25.m35329A6(Function1.this, obj);
                return m35329A6;
            }
        });
        final C22950T0 c22950t0 = C22950T0.f86482g;
        Observable<J35.C3879a> throttleFirst = filter4.doOnNext(new InterfaceC23484g() { // from class: X05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35318B6(Function1.this, obj);
            }
        }).throttleFirst(1L, TimeUnit.SECONDS);
        final C22957U0 c22957u0 = C22957U0.f86490g;
        Observable<J35.C3879a> doOnNext2 = throttleFirst.doOnNext(new InterfaceC23484g() { // from class: Y05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35307C6(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "requirementPresenter.req…ride context ride now\") }");
        Observable m31949b = C24527f.m31949b(doOnNext2, this.f86315A.mo15900i(), this.f86315A.mo15902g());
        final C22968W0 c22968w0 = new C22968W0();
        Observable map5 = m31949b.map(new InterfaceC23492o() { // from class: Z05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m35296D6;
                m35296D6 = C42483i25.m35296D6(Function1.this, obj);
                return m35296D6;
            }
        });
        final C22972X0 c22972x0 = new C22972X0();
        Observable doOnNext3 = map5.doOnNext(new InterfaceC23484g() { // from class: a15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35285E6(Function1.this, obj);
            }
        });
        final C22976Y0 c22976y0 = new C22976Y0();
        Observable flatMap = doOnNext3.flatMap(new InterfaceC23492o() { // from class: c15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35275F6;
                m35275F6 = C42483i25.m35275F6(Function1.this, obj);
                return m35275F6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33094as21 = flatMap.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as21, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22983Z0 c22983z0 = new C22983Z0();
        ((ObservableSubscribeProxy) m33094as21).subscribe(new InterfaceC23484g() { // from class: d15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35265G6(Function1.this, obj);
            }
        });
        Z84<Optional<Reservation>> mo83798e = this.f86361k.mo83798e();
        Z84<RideStates> mo75032o0 = this.f86347d.mo75032o0();
        final C22988a1 c22988a1 = C22988a1.f86518g;
        InterfaceC23434B map6 = mo75032o0.map(new InterfaceC23492o() { // from class: f15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m35255H6;
                m35255H6 = C42483i25.m35255H6(Function1.this, obj);
                return m35255H6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "rideManager.rideStates.m… it.activeRideCount > 0 }");
        Observable observeOn10 = C24527f.m31949b(mo83798e, map6, this.f86341a.m82668b7()).observeOn(C23454a.m33087a());
        final C22993b1 c22993b1 = C22993b1.f86526g;
        Observable doOnNext4 = observeOn10.doOnNext(new InterfaceC23484g() { // from class: g15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35245I6(Function1.this, obj);
            }
        });
        final C22998c1 c22998c1 = C22998c1.f86532g;
        Observable distinctUntilChanged3 = doOnNext4.distinctUntilChanged(new InterfaceC23481d() { // from class: h15
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m35235J6;
                m35235J6 = C42483i25.m35235J6(Function2.this, obj, obj2);
                return m35235J6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "reservationManager.reser…t2.first.orNull()?.bird }");
        Object m33094as22 = distinctUntilChanged3.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as22, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23003d1 c23003d1 = new C23003d1();
        ((ObservableSubscribeProxy) m33094as22).subscribe(new InterfaceC23484g() { // from class: i15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35225K6(Function1.this, obj);
            }
        });
        Observable<C40889fM2> markerClicks = this.f86330P.reactiveMapEvent().markerClicks();
        final C23007e1 c23007e1 = new C23007e1();
        Observable<C40889fM2> filter5 = markerClicks.filter(new InterfaceC23494q() { // from class: j15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35215L6;
                m35215L6 = C42483i25.m35215L6(Function1.this, obj);
                return m35215L6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter5, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33094as23 = filter5.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as23, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23011f1 c23011f1 = new C23011f1();
        ((ObservableSubscribeProxy) m33094as23).subscribe(new InterfaceC23484g() { // from class: k15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35205M6(Function1.this, obj);
            }
        });
        Z84<Optional<RideState>> mo75057R2 = this.f86347d.mo75057R();
        final C23019h1 c23019h1 = C23019h1.f86553g;
        Observable<R> map7 = mo75057R2.map(new InterfaceC23492o() { // from class: l15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m35195N6;
                m35195N6 = C42483i25.m35195N6(Function1.this, obj);
                return m35195N6;
            }
        });
        final C23023i1 c23023i1 = new C23023i1();
        Observable filter6 = map7.filter(new InterfaceC23494q() { // from class: m15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35185O6;
                m35185O6 = C42483i25.m35185O6(Function1.this, obj);
                return m35185O6;
            }
        });
        final C23028j1 c23028j1 = C23028j1.f86564g;
        Observable observeOn11 = filter6.distinct(new InterfaceC23492o() { // from class: o15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m35175P6;
                m35175P6 = C42483i25.m35175P6(Function1.this, obj);
                return m35175P6;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn11, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33094as24 = observeOn11.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as24, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23033k1 c23033k1 = new C23033k1();
        ((ObservableSubscribeProxy) m33094as24).subscribe(new InterfaceC23484g() { // from class: q15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35165Q6(Function1.this, obj);
            }
        });
        m35011f5();
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Z84<Optional<WireCoupon>> mo90007a = this.f86371p.mo90007a();
        Z84<Optional<WireCoupon>> mo90002f = this.f86371p.mo90002f();
        Z84<List<WireBird>> mo71591R0 = this.f86351f.mo71591R0();
        final C23038l1 c23038l1 = C23038l1.f86575g;
        Observable<List<WireBird>> take = mo71591R0.filter(new InterfaceC23494q() { // from class: r15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35155R6;
                m35155R6 = C42483i25.m35155R6(Function1.this, obj);
                return m35155R6;
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(take, "birdManager.latestNearby…it.isNotEmpty() }.take(1)");
        Observable<RideMapState> distinctUntilChanged4 = this.f86315A.mo15897l().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged4, "rideMapStateManager.ride…te.distinctUntilChanged()");
        Observable combineLatest2 = Observable.combineLatest(mo90007a, mo90002f, take, distinctUntilChanged4, C23059p0.f86595a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        final C23042m1 c23042m1 = new C23042m1();
        Observable switchMapSingle = combineLatest2.switchMapSingle(new InterfaceC23492o() { // from class: s15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m35145S6;
                m35145S6 = C42483i25.m35145S6(Function1.this, obj);
                return m35145S6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Observable observeOn12 = C37279Yf5.m74575T(switchMapSingle, new C23047n1()).observeOn(C23454a.m33087a());
        final C23056o1 c23056o1 = new C23056o1();
        Observable doOnNext5 = observeOn12.doOnNext(new InterfaceC23484g() { // from class: t15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35135T6(Function1.this, obj);
            }
        });
        final C23060p1 c23060p1 = new C23060p1();
        Observable flatMap2 = doOnNext5.flatMap(new InterfaceC23492o() { // from class: u15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35125U6;
                m35125U6 = C42483i25.m35125U6(Function1.this, obj);
                return m35125U6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap2, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33094as25 = flatMap2.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as25, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23065q1 c23065q1 = new C23065q1();
        ((ObservableSubscribeProxy) m33094as25).subscribe(new InterfaceC23484g() { // from class: v15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35115V6(Function1.this, obj);
            }
        });
        Object m33094as26 = this.f86330P.centerLocationChanged().m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as26, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23073s1 c23073s1 = new C23073s1();
        ((ObservableSubscribeProxy) m33094as26).subscribe(new InterfaceC23484g() { // from class: w15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35105W6(Function1.this, obj);
            }
        });
        Observable<Pair<WireBird, Boolean>> observeOn13 = this.f86330P.birdItemClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn13, "mapUi.birdItemClicks()\n …dSchedulers.mainThread())");
        Object m33094as27 = observeOn13.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as27, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23077t1 c23077t1 = new C23077t1();
        ((ObservableSubscribeProxy) m33094as27).subscribe(new InterfaceC23484g() { // from class: x15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35095X6(Function1.this, obj);
            }
        });
        Observable<WireBird> observeOn14 = this.f86330P.birdInfoItemClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn14, "mapUi.birdInfoItemClicks…dSchedulers.mainThread())");
        Object m33094as28 = observeOn14.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as28, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23081u1 c23081u1 = new C23081u1();
        ((ObservableSubscribeProxy) m33094as28).subscribe(new InterfaceC23484g() { // from class: y15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35085Y6(Function1.this, obj);
            }
        });
        Observable filter7 = Observable.merge(this.f86330P.mapClicks(), this.f86330P.reactiveMapEvent().polygonClicks()).observeOn(C23454a.m33087a()).filter(new InterfaceC23494q() { // from class: B15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35075Z6;
                m35075Z6 = C42483i25.m35075Z6(C42483i25.this, obj);
                return m35075Z6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter7, "merge(\n      mapUi.mapCl…e.DESTINATION_SELECTION }");
        Object m33094as29 = filter7.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as29, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as29).subscribe(new InterfaceC23484g() { // from class: C15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35064a7(C42483i25.this, obj);
            }
        });
        Observable<List<WireCoupon>> distinctUntilChanged5 = this.f86371p.mo90004d().distinctUntilChanged();
        final C23085v1 c23085v1 = C23085v1.f86621g;
        Observable<List<WireCoupon>> observeOn15 = distinctUntilChanged5.filter(new InterfaceC23494q() { // from class: D15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35053b7;
                m35053b7 = C42483i25.m35053b7(Function1.this, obj);
                return m35053b7;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn15, "ephemeralPromoManager.co…dSchedulers.mainThread())");
        Object m33094as30 = observeOn15.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as30, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23090w1 c23090w1 = new C23090w1();
        ((ObservableSubscribeProxy) m33094as30).subscribe(new InterfaceC23484g() { // from class: E15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35042c7(Function1.this, obj);
            }
        });
        Z84<List<WireCoupon>> mo27790h = this.f86369o.mo27790h();
        final C23094x1 c23094x1 = C23094x1.f86629g;
        Observable<List<WireCoupon>> filter8 = mo27790h.filter(new InterfaceC23494q() { // from class: F15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35031d7;
                m35031d7 = C42483i25.m35031d7(Function1.this, obj);
                return m35031d7;
            }
        });
        final C23099y1 c23099y1 = new C23099y1();
        Observable retry = filter8.switchMap(new InterfaceC23492o() { // from class: G15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35020e7;
                m35020e7 = C42483i25.m35020e7(Function1.this, obj);
                return m35020e7;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33094as31 = retry.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as31, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as31).subscribe();
        Z84<RideMapState> mo15897l = this.f86315A.mo15897l();
        final C23104z1 c23104z1 = C23104z1.f86640g;
        Observable subscribeOn8 = mo15897l.map(new InterfaceC23492o() { // from class: H15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m35009f7;
                m35009f7 = C42483i25.m35009f7(Function1.this, obj);
                return m35009f7;
            }
        }).distinctUntilChanged().subscribeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn8, "rideMapStateManager.ride…dSchedulers.mainThread())");
        Object m33094as32 = subscribeOn8.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as32, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as32, null, null, new C22871B1(), 3, null);
        Observable<EnumC3010H2> mo40697K1 = this.f86337W.mo40697K1();
        final C22875C1 c22875c1 = C22875C1.f86398g;
        Observable<EnumC3010H2> observeOn16 = mo40697K1.filter(new InterfaceC23494q() { // from class: I15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34998g7;
                m34998g7 = C42483i25.m34998g7(Function1.this, obj);
                return m34998g7;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn16, "flightBannerCoordinatorP…dSchedulers.mainThread())");
        Object m33094as33 = observeOn16.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as33, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22879D1 c22879d1 = new C22879D1();
        ((ObservableSubscribeProxy) m33094as33).subscribe(new InterfaceC23484g() { // from class: J15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34987h7(Function1.this, obj);
            }
        });
        Observable<Config> subscribeOn9 = this.f86341a.m82623f8().subscribeOn(C24542a.m31932c());
        final C22883E1 c22883e1 = C22883E1.f86407g;
        Observable observeOn17 = subscribeOn9.map(new InterfaceC23492o() { // from class: K15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m34976i7;
                m34976i7 = C42483i25.m34976i7(Function1.this, obj);
                return m34976i7;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn17, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as34 = observeOn17.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as34, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22887F1 c22887f1 = new C22887F1();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: N15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34965j7(Function1.this, obj);
            }
        };
        final C22892G1 c22892g1 = C22892G1.f86420b;
        ((ObservableSubscribeProxy) m33094as34).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: O15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34954k7(Function1.this, obj);
            }
        });
        Observable<Config> subscribeOn10 = this.f86341a.m82623f8().subscribeOn(C24542a.m31932c());
        final C22896H1 c22896h1 = C22896H1.f86424g;
        Observable observeOn18 = subscribeOn10.map(new InterfaceC23492o() { // from class: P15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m34943l7;
                m34943l7 = C42483i25.m34943l7(Function1.this, obj);
                return m34943l7;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn18, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as35 = observeOn18.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as35, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22901I1 c22901i1 = new C22901I1();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: Q15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34932m7(Function1.this, obj);
            }
        };
        final C22905J1 c22905j1 = C22905J1.f86433b;
        ((ObservableSubscribeProxy) m33094as35).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: R15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34921n7(Function1.this, obj);
            }
        });
        Object m33094as36 = this.f86331Q.mo75615b3().m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as36, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22909K1 c22909k1 = new C22909K1();
        ((ObservableSubscribeProxy) m33094as36).subscribe(new InterfaceC23484g() { // from class: S15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34910o7(Function1.this, obj);
            }
        });
        m34891q4();
        m34792z4();
        m35114V7();
        m34870s3();
        m34809x9();
        m34847u4();
        m35298D4();
        m35040c9();
        m34985h9();
        Object m33094as37 = this.f86331Q.mo75629W9().m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as37, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22917M1 c22917m1 = new C22917M1();
        ((ObservableSubscribeProxy) m33094as37).subscribe(new InterfaceC23484g() { // from class: T15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34899p7(Function1.this, obj);
            }
        });
        this.f86365m.mo21397j(this.f86328N);
        Z84<Optional<Pair<C37099Xl5, C36154Tk5>>> mo21396k = this.f86365m.mo21396k();
        final C22921N1 c22921n1 = C22921N1.f86452g;
        Observable<Optional<Pair<C37099Xl5, C36154Tk5>>> distinctUntilChanged6 = mo21396k.distinctUntilChanged(new InterfaceC23481d() { // from class: U15
            @Override // io.reactivex.functions.InterfaceC23481d
            public final boolean test(Object obj, Object obj2) {
                boolean m34888q7;
                m34888q7 = C42483i25.m34888q7(Function2.this, obj, obj2);
                return m34888q7;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged6, "smartlockManager.physica…Null()?.first?.lock?.id }");
        Observable m74575T = C37279Yf5.m74575T(distinctUntilChanged6, C22927O1.f86460g);
        final C22931P1 c22931p1 = new C22931P1();
        AbstractC23461c flatMapCompletable = m74575T.flatMapCompletable(new InterfaceC23492o() { // from class: V15
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m34877r7;
                m34877r7 = C42483i25.m34877r7(Function1.this, obj);
                return m34877r7;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onCreate(in…andleDeeplink(intent)\n  }");
        Object m33041n3 = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
        m35030d8();
        this.f86382v.mo55905y(new C35192Ph6(null, null, null, null, null, 23, null));
        m35187O4(intent);
    }

    /* renamed from: Q8 */
    public final void m35163Q8() {
        Boolean bool;
        WireBird bird;
        O12 value = this.f86354g0.getValue();
        WireRide m35088Y3 = m35088Y3();
        if (m35088Y3 != null && (bird = m35088Y3.getBird()) != null) {
            bool = Boolean.valueOf(WireBirdKt.isCruiserModel(bird));
        } else {
            bool = null;
        }
        Boolean bool2 = bool;
        if (value instanceof O12.C5811c) {
            InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(this.f86333S, ((O12.C5811c) value).m92997a(), true, null, null, false, bool2, 28, null);
        } else if (value instanceof O12.C5812d) {
            InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(this.f86333S, ((O12.C5812d) value).m92996a(), false, null, null, true, null, 44, null);
        } else if (value instanceof O12.C5813e) {
            this.f86333S.mo37182D3();
        }
    }

    /* renamed from: R3 */
    public final double m35158R3(List<WireBird> list, Location location) {
        int collectionSizeOrDefault;
        Double m117229minOrNull;
        List<WireBird> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireBird wireBird : list2) {
            arrayList.add(Double.valueOf(C37429Yw2.f47648a.m73968c(wireBird.getLocation().fromLocation(), location)));
        }
        m117229minOrNull = CollectionsKt___CollectionsKt.m117229minOrNull((Iterable<Double>) arrayList);
        if (m117229minOrNull != null) {
            return m117229minOrNull.doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: R7 */
    public final void m35154R7(final WireBird wireBird, final boolean z) {
        if (z && this.f86368n0 == null) {
            C41318g46.AbstractC20723b m35056b4 = m35056b4();
            String id = wireBird.getId();
            m35056b4.mo7221o("fallback deep link timer expired but we already attempted to select deeplink, ignoring " + id, new Object[0]);
            return;
        }
        this.f86370o0.accept(Optional.f63040c.m59034a());
        this.f86364l0 = null;
        this.f86366m0 = null;
        this.f86368n0 = null;
        this.f86330P.moveTo(new CameraPosition(new LatLng(wireBird.getLocation().getLatitude(), wireBird.getLocation().getLongitude()), 20.0f, 0.0f, 0.0f));
        this.f86377s.post(new Runnable() { // from class: I05
            @Override // java.lang.Runnable
            public final void run() {
                C42483i25.m35134T7(C42483i25.this, z, wireBird);
            }
        });
    }

    /* renamed from: R8 */
    public final void m35153R8() {
        int collectionSizeOrDefault;
        WireBird wireBird;
        int mapCapacity;
        Object first;
        List<RideState> activeRides = this.f86347d.mo75032o0().m73665a().activeRides();
        List<RideState> list = activeRides;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RideState rideState : list) {
            arrayList.add(rideState.getRide());
        }
        boolean z = true;
        if (!arrayList.isEmpty()) {
            P75 p75 = this.f86331Q;
            C37772a75.C10573a c10573a = C37772a75.f49850h;
            RideState m35078Z3 = m35078Z3();
            if (m35078Z3 == null) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) activeRides);
                m35078Z3 = (RideState) first;
            }
            p75.mo75635Qd(C37772a75.C10573a.invoke$default(c10573a, activeRides, m35078Z3, null, this.f86315A.mo15903f().m73665a(), this.f86316B.mo21500j(), this.f86341a.m82623f8().m73665a(), 4, null));
        } else {
            this.f86331Q.mo75599n7();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            wireBird = null;
            if (!it.hasNext()) {
                break;
            }
            WireBird bird = ((WireRide) it.next()).getBird();
            if (bird != null) {
                wireBird = this.f86320F.mo78580b(bird);
            }
            if (wireBird != null) {
                arrayList2.add(wireBird);
            }
        }
        G95 g95 = this.f86330P;
        WireBird m59035e = this.f86315A.mo15900i().m73665a().m59035e();
        if (m59035e != null) {
            wireBird = this.f86320F.mo78580b(m59035e);
        }
        Map<String, FH3> mo21508a = this.f86316B.mo21508a();
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(mo21508a.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it2 = mo21508a.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), m34875r9((FH3) entry.getValue()));
        }
        g95.mo104261C4(arrayList2, wireBird, true, linkedHashMap);
        this.f86330P.mo104259Xg(this.f86355h.mo43616p().m73665a(), arrayList2);
        WireRide m35088Y3 = m35088Y3();
        if (m35088Y3 != null) {
            WireBird bird2 = m35088Y3.getBird();
            if ((bird2 == null || !bird2.getLocked()) ? false : false) {
                m35227K4(bird2);
            }
        }
    }

    /* renamed from: S3 */
    public final WireBird m35148S3(List<WireBird> list) {
        return m35248I3(list, this.f86355h.mo43616p().m73665a());
    }

    /* renamed from: S8 */
    public final void m35143S8(ScopeProvider scopeProvider) {
        Observable<RideUpdateState> distinctUntilChanged = this.f86315A.mo15903f().distinctUntilChanged();
        final C22897H2 c22897h2 = new C22897H2();
        AbstractC23461c switchMapCompletable = distinctUntilChanged.switchMapCompletable(new InterfaceC23492o() { // from class: sZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m35133T8;
                m35133T8 = C42483i25.m35133T8(Function1.this, obj);
                return m35133T8;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun startPollRid…tActiveRidesRefresh()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        C41318g46.m40163a("requesting active ride manual refresh within startPollRide", new Object[0]);
        this.f86347d.mo75054Z();
    }

    /* renamed from: T3 */
    public final Config m35138T3(WireBird wireBird) {
        return C36441Uq4.m80769c(this.f86341a, wireBird);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
        if (r10 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
        if (p000.C39339cm2.m60886c(r10) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
        r9.f86368n0 = r3;
        m35056b4().mo7221o("setting deeplink location to " + r9.f86368n0, new java.lang.Object[0]);
        r10 = r9.f86330P;
        r2 = r9.f86368n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
        r2 = co.bird.android.app.feature.map.p008ui.MapUiKt.toGeolocation(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
        r2 = p000.UB1.m81891a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
        r2 = p000.C37429Yw2.f47648a.m73963h(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
        r10.moveTo(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f0, code lost:
        return;
     */
    /* renamed from: T4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m35137T4(Intent intent) {
        LatLng latLng;
        WireLocation location;
        if (intent.hasExtra("rider_show_latitude") && intent.hasExtra("rider_show_longitude")) {
            double doubleExtra = intent.getDoubleExtra("rider_show_latitude", 0.0d);
            double doubleExtra2 = intent.getDoubleExtra("rider_show_longitude", 0.0d);
            m35056b4().mo7221o("Moving map to location due to deeplink(" + doubleExtra + ", " + doubleExtra2 + ")", new Object[0]);
            this.f86364l0 = (WireBird) intent.getParcelableExtra("rider_select_bird");
            m35056b4().mo7221o("setting deep link bird to " + this.f86364l0, new Object[0]);
            this.f86366m0 = intent.getStringExtra("rider_select_bird_id");
            m35056b4().mo7221o("setting deeplink bird id to " + this.f86366m0, new Object[0]);
            WireBird wireBird = this.f86364l0;
            LatLng latLng2 = null;
            if (wireBird != null && (location = wireBird.getLocation()) != null && (latLng = C37429Yw2.f47648a.m73960k(location)) != null) {
                if (!C39339cm2.m60886c(latLng)) {
                    latLng = null;
                }
            }
            latLng = new LatLng(doubleExtra, doubleExtra2);
        } else {
            m35056b4().mo7221o("The user was not deeplinked to a specific location on the map.", new Object[0]);
        }
    }

    /* renamed from: U3 */
    public final Config m35128U3() {
        return C36441Uq4.m80769c(this.f86341a, this.f86315A.mo15902g().getValue().m59035e());
    }

    /* renamed from: U4 */
    public final void m35127U4() {
        Z84<Optional<RideState>> mo75057R = this.f86347d.mo75057R();
        final C22885F c22885f = C22885F.f86411g;
        Observable<R> map = mo75057R.map(new InterfaceC23492o() { // from class: tZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m35117V4;
                m35117V4 = C42483i25.m35117V4(Function1.this, obj);
                return m35117V4;
            }
        });
        final C22889G c22889g = new C22889G();
        AbstractC24490k m32111s0 = map.switchMap(new InterfaceC23492o() { // from class: uZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35107W4;
                m35107W4 = C42483i25.m35107W4(Function1.this, obj);
                return m35107W4;
            }
        }).throttleLatest(250L, TimeUnit.MILLISECONDS, true).toFlowable(EnumC23460b.LATEST).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "private fun observeBirdP…on updates\")\n      })\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22894H c22894h = new C22894H();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: vZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35097X4(Function1.this, obj);
            }
        };
        final C22899I c22899i = C22899I.f86427g;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: xZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35087Y4(Function1.this, obj);
            }
        });
    }

    /* renamed from: U7 */
    public final void m35124U7() {
        String str;
        Object firstOrNull;
        long j;
        WireRideDetail wireRideDetail = this.f86342a0;
        if (wireRideDetail != null) {
            InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
            WireBird m59035e = this.f86315A.mo15902g().m73665a().m59035e();
            if (m59035e != null) {
                str = m59035e.getModel();
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55956N(new RideCompleted(str, m34979i4().getLatitude(), m34979i4().getLongitude(), wireRideDetail.getRide(), C32972Fv0.m106251a(m35128U3())));
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) wireRideDetail.getReceipt().getCoupons());
            WireCoupon wireCoupon = (WireCoupon) firstOrNull;
            if (wireCoupon != null) {
                InterfaceC1880Ea interfaceC1880Ea2 = this.f86382v;
                Integer redeemedAmount = wireCoupon.getRedeemedAmount();
                if (redeemedAmount != null) {
                    j = redeemedAmount.intValue();
                } else {
                    j = 0;
                }
                interfaceC1880Ea2.mo55956N(new FreeRideUsed(j / 100.0d));
            }
            this.f86342a0 = null;
        }
    }

    /* renamed from: U8 */
    public final void m35123U8(WireBird bird) {
        String str;
        String id;
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f86315A.mo15899j(RideUpdateState.STARTING);
        this.f86347d.mo75060O(bird);
        Map<String, DateTime> map = this.f86374q0;
        String id2 = bird.getId();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        map.put(id2, now);
        WireUserGuest mo64136c = this.f86319E.mo64136c();
        if (mo64136c != null && (id = mo64136c.getId()) != null && m35108W3()) {
            str = id;
        } else {
            str = null;
        }
        if (str != null) {
            this.f86319E.mo64138a(str);
        }
        if (!C36441Uq4.m80769c(this.f86341a, bird).getRideConfig().getEnableLocationOptOut() && !C40788fB0.m41760v(this.f86329O)) {
            m34935m4(bird, new LocationDisabledException());
            return;
        }
        AbstractC23442F<WireRide> mo79818b = m35023e4().mo79818b(new StartRideBodyWithIntent(bird.getId(), C36441Uq4.m80771a(this.f86341a, bird), null, null, null, str, this.f86347d.mo75021z(), 28, null));
        C41318g46.m40163a("btunlock: starting ride race stuff", new Object[0]);
        C23464b c23464b = new C23464b();
        AbstractC23442F<Pair<WireBird, WireRide>> firstOrError = this.f86356h0.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "rideStartedRelay\n      .firstOrError()");
        Object m33135e = firstOrError.m33135e(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22902I2 c22902i2 = new C22902I2(c23464b);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: mZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35113V8(Function1.this, obj);
            }
        };
        final C22906J2 c22906j2 = C22906J2.f86434b;
        c23464b.mo32983c(((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: nZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35103W8(Function1.this, obj);
            }
        }));
        AbstractC23442F<WireRide> firstOrError2 = this.f86347d.mo75040h1().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError2, "rideManager.bluetoothRid…s()\n      .firstOrError()");
        Object m33135e2 = firstOrError2.m33135e(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22910K2 c22910k2 = new C22910K2(bird);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: oZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35093X8(Function1.this, obj);
            }
        };
        final C22914L2 c22914l2 = C22914L2.f86443b;
        c23464b.mo32983c(((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: pZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35083Y8(Function1.this, obj);
            }
        }));
        AbstractC23442F<WireRide> m33152N = this.f86347d.mo75055V(bird, mo79818b).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "rideManager.startRideAnd…dSchedulers.mainThread())");
        Object m33135e3 = m33152N.m33135e(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33135e3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22918M2 c22918m2 = new C22918M2(c23464b, this, bird);
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: qZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35073Z8(Function1.this, obj);
            }
        };
        final C22922N2 c22922n2 = new C22922N2(c23464b, this, bird);
        ((SingleSubscribeProxy) m33135e3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: rZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35062a9(Function1.this, obj);
            }
        });
    }

    /* renamed from: V3 */
    public final Config m35118V3(String str) {
        WireRide ride;
        C36207Tq4 c36207Tq4 = this.f86341a;
        RideState mo75038i1 = this.f86347d.mo75038i1(str);
        return C36441Uq4.m80769c(c36207Tq4, (mo75038i1 == null || (ride = mo75038i1.getRide()) == null) ? null : ride.getBird());
    }

    /* renamed from: V7 */
    public final void m35114V7() {
        Observable m31956a = C24523e.f91168a.m31956a(this.f86315A.mo15897l(), this.f86361k.mo83798e());
        final C23044m2 c23044m2 = C23044m2.f86581g;
        Observable observeOn = m31956a.map(new InterfaceC23492o() { // from class: jZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m35104W7;
                m35104W7 = C42483i25.m35104W7(Function1.this, obj);
                return m35104W7;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        final C23048n2 c23048n2 = new C23048n2();
        AbstractC23461c switchMapCompletable = observeOn.switchMapCompletable(new InterfaceC23492o() { // from class: kZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m35094X7;
                m35094X7 = C42483i25.m35094X7(Function1.this, obj);
                return m35094X7;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun pollBirdsNea…r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: W3 */
    public final boolean m35108W3() {
        return this.f86347d.mo75030r().m73665a().getMultiRideConfig().getEnabled();
    }

    /* renamed from: X3 */
    public final InterfaceC37014Xc1 m35098X3() {
        return this.f86349e;
    }

    /* renamed from: Y3 */
    public final WireRide m35088Y3() {
        RideState m35078Z3 = m35078Z3();
        if (m35078Z3 != null) {
            return m35078Z3.getRide();
        }
        return null;
    }

    /* renamed from: Y7 */
    public final void m35084Y7() {
        AbstractC23461c m33069Q = this.f86381u.mo26963n1().ignoreElements().m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "userManager\n      .fetch…\n      .onErrorComplete()");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: Z3 */
    public final RideState m35078Z3() {
        return this.f86347d.mo75034m0().m73665a().m59035e();
    }

    /* renamed from: Z4 */
    public final void m35077Z4(ScopeProvider scopeProvider) {
        Observable<AbstractC39873de5.EnumC19828a> bleStateObservable = this.f86367n.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) this.f86367n.mo33641c()).distinctUntilChanged();
        C24523e c24523e = C24523e.f91168a;
        Intrinsics.checkNotNullExpressionValue(bleStateObservable, "bleStateObservable");
        Observable<RideMapState> distinctUntilChanged = this.f86315A.mo15897l().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "rideMapStateManager.ride…te.distinctUntilChanged()");
        Observable observeOn = c24523e.m31956a(bleStateObservable, distinctUntilChanged).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22903J c22903j = new C22903J();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: c05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35066a5(Function1.this, obj);
            }
        });
    }

    /* renamed from: Z7 */
    public final void m35074Z7(final WireRideDetail wireRideDetail) {
        Object firstOrNull;
        WireRide wireRide;
        boolean z;
        boolean z2;
        boolean z3;
        final WireBird m59035e = this.f86315A.mo15902g().m73665a().m59035e();
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.f86347d.mo75032o0().m73665a().endedRides());
        RideState rideState = (RideState) firstOrNull;
        if (rideState != null) {
            wireRide = rideState.getRide();
        } else {
            wireRide = null;
        }
        boolean z4 = true;
        if (wireRideDetail != null) {
            z = true;
        } else {
            z = false;
        }
        if (m59035e != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m35088Y3() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C41318g46.m40157g("resetRide called - ride detail present: " + z + ", current bird present: " + z2 + ", focused ride present: " + z3, new Object[0]);
        m35188O3();
        m35198N3();
        this.f86344b0 = null;
        if (m59035e != null) {
            this.f86345c.mo19549i(m59035e);
            if (wireRide != null) {
                this.f86330P.mo104260Ea(m59035e);
            }
        }
        if (!this.f86347d.mo75061N() && (m59035e == null || wireRide != null)) {
            this.f86315A.mo15906c(RideMapState.NONE);
        }
        if (wireRideDetail != null) {
            this.f86342a0 = wireRideDetail;
            if (!this.f86347d.mo75061N()) {
                this.f86331Q.mo75599n7();
                P75.C6268a.showRideButton$default(this.f86331Q, false, 1, null);
            }
            WireBird bird = wireRideDetail.getRide().getBird();
            if (bird != null) {
                bird.getModel();
            }
            if (!this.f86353g.mo18202l(wireRideDetail.getRide().getBirdId())) {
                if (wireRideDetail.getRide().getCost() < 1) {
                    if (this.f86331Q.mo75578zd()) {
                        this.f86331Q.mo75633Sb();
                    }
                    final List<WireCoupon> coupons = wireRideDetail.getCoupons();
                    List<WireCoupon> list = coupons;
                    if (list != null && !list.isEmpty()) {
                        z4 = false;
                    }
                    if (!z4) {
                        String birdEphemeralId = wireRideDetail.getRide().getBirdEphemeralId();
                        if (birdEphemeralId != null) {
                            this.f86351f.mo71590S0(birdEphemeralId);
                        }
                        this.f86377s.postDelayed(new Runnable() { // from class: iY4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C42483i25.m35063a8(C42483i25.this, coupons, wireRideDetail, m59035e);
                            }
                        }, 1000L);
                    } else {
                        this.f86377s.postDelayed(new Runnable() { // from class: p05
                            @Override // java.lang.Runnable
                            public final void run() {
                                C42483i25.m35052b8(C42483i25.this, wireRideDetail, m59035e);
                            }
                        }, 1000L);
                    }
                } else if (m34876r8(m59035e)) {
                    if (!this.f86347d.mo75030r().m73665a().getParkingConfig().getEnableRiderParkingReview() && !this.f86341a.m82623f8().m73665a().getParkingConfig().getEnableAndroidBackgroundRidePhotoUpload()) {
                        this.f86333S.mo37187C4(wireRideDetail);
                    } else {
                        InterfaceC40099e13.C19924a.goToRideEndPhoto$default(this.f86333S, wireRideDetail, false, false, 2, null);
                    }
                } else {
                    InterfaceC40099e13.C19924a.goToRideSummary$default(this.f86333S, wireRideDetail, false, false, null, 8, null);
                }
            }
        } else if (wireRide != null && !this.f86347d.mo75061N()) {
            this.f86315A.mo15907b();
            this.f86331Q.mo75599n7();
            P75.C6268a.showRideButton$default(this.f86331Q, false, 1, null);
        }
        m35084Y7();
    }

    @Override // p000.InterfaceC42185hY4
    /* renamed from: a */
    public void mo35072a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        m35187O4(intent);
    }

    /* renamed from: a4 */
    public final boolean m35067a4() {
        return this.f86335U.mo14402c();
    }

    @Override // p000.InterfaceC42185hY4
    /* renamed from: b */
    public void mo35061b(WireRide wireRide) {
        if (wireRide == null) {
            wireRide = m35088Y3();
        }
        InterfaceC46164oF3.C26875a.tryToPark$default(this.f86316B, this, this, wireRide, false, false, false, this.f86328N, 48, null);
    }

    /* renamed from: b4 */
    public final C41318g46.AbstractC20723b m35056b4() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("ride-presenter");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"ride-presenter\")");
        return m40153k;
    }

    /* renamed from: b5 */
    public final void m35055b5(ScopeProvider scopeProvider) {
        C24523e c24523e = C24523e.f91168a;
        Observable<RideStates> distinctUntilChanged = this.f86347d.mo75032o0().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "rideManager.rideStates.distinctUntilChanged()");
        Z84<Config> m82623f8 = this.f86341a.m82623f8();
        final C22907K c22907k = C22907K.f86435g;
        Observable distinctUntilChanged2 = m82623f8.map(new InterfaceC23492o() { // from class: VZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m35044c5;
                m35044c5 = C42483i25.m35044c5(Function1.this, obj);
                return m35044c5;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "reactiveConfig.config.ma… }.distinctUntilChanged()");
        Observable observeOn = c24523e.m31956a(distinctUntilChanged, distinctUntilChanged2).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22911L c22911l = new C22911L();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: WZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35033d5(Function1.this, obj);
            }
        };
        final C22915M c22915m = C22915M.f86444b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: XZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35022e5(Function1.this, obj);
            }
        });
    }

    /* renamed from: b9 */
    public final void m35051b9() {
        boolean enableOnboardingRideEntry;
        if (m34886q9()) {
            C41318g46.m40163a("startRideFlow: checking requirements for ride context", new Object[0]);
            this.f86315A.mo15899j(RideUpdateState.RIDE_REQUIREMENTS);
            InterfaceC48572sJ4.C28260a.checkRequirementsSilently$default(this.f86335U, this.f86315A.mo15902g().getValue().m59035e(), RideRequirementReason.RIDE, null, 4, null);
            return;
        }
        Config m73665a = this.f86347d.mo75030r().m73665a();
        Boolean enableRiderRideButtonEntry = m73665a.getOnboarding().getEnableRiderRideButtonEntry();
        if (enableRiderRideButtonEntry != null) {
            enableOnboardingRideEntry = enableRiderRideButtonEntry.booleanValue();
        } else {
            enableOnboardingRideEntry = m73665a.getEnableOnboardingRideEntry();
        }
        if (enableOnboardingRideEntry && (!enableOnboardingRideEntry || !this.f86361k.mo83798e().getValue().m59037c())) {
            C41318g46.m40163a("startRideFlow: checking requirements for scan context", new Object[0]);
            InterfaceC48572sJ4.C28260a.checkRequirementsSilently$default(this.f86335U, null, RideRequirementReason.SCAN, null, 4, null);
            return;
        }
        C41318g46.m40163a("startRideFlow: checking pre scan permissions", new Object[0]);
        this.f86360j0.accept(Unit.INSTANCE);
    }

    @Override // p000.InterfaceC42185hY4
    /* renamed from: c */
    public boolean mo35050c(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36585Vg4.saveMoneyMenuItem) {
            this.f86382v.mo55905y(new C45249mi5(null, null, null, "map", 7, null));
            this.f86333S.mo36936u1("map");
            return true;
        }
        return false;
    }

    /* renamed from: c4 */
    public final C41318g46.AbstractC20723b m35045c4() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("onboarding bottomsheet");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"onboarding bottomsheet\")");
        return m40153k;
    }

    /* renamed from: c8 */
    public final void m35041c8() {
        m35228K3();
        P75.C6268a.showRideButton$default(this.f86331Q, false, 1, null);
        this.f86315A.mo15906c(RideMapState.NONE);
    }

    /* renamed from: c9 */
    public final void m35040c9() {
        AbstractC24490k<Map<String, FH3>> m32111s0 = this.f86316B.mo21503f().toFlowable(EnumC23460b.LATEST).m32111s0(C24542a.m31934a());
        final C22928O2 c22928o2 = new C22928O2();
        AbstractC24490k<R> m32148f1 = m32111s0.m32148f1(new InterfaceC23492o() { // from class: vY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m35029d9;
                m35029d9 = C42483i25.m35029d9(Function1.this, obj);
                return m35029d9;
            }
        });
        final C22932P2 c22932p2 = C22932P2.f86465g;
        AbstractC24490k m32111s02 = m32148f1.m32195I(new InterfaceC23484g() { // from class: wY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35018e9(Function1.this, obj);
            }
        }).m32190K0(3L).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s02, "private fun subscribeToR…rea state events\") })\n  }");
        Object m32150f = m32111s02.m32150f(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22936Q2 c22936q2 = new C22936Q2();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: xY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35007f9(Function1.this, obj);
            }
        };
        final C22943R2 c22943r2 = C22943R2.f86476g;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: yY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34996g9(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC42185hY4
    /* renamed from: d */
    public void mo35039d(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem findItem = menu.findItem(C36585Vg4.saveMoneyMenuItem);
        boolean enabled = this.f86341a.m82623f8().m73665a().getSaveMoney().getEnabled();
        findItem.setVisible(enabled);
        if (enabled) {
            this.f86382v.mo55905y(new C45842ni5(null, null, null, 7, null));
        }
    }

    /* renamed from: d4 */
    public final boolean m35034d4() {
        return this.f86379t.m37582q1();
    }

    /* renamed from: d8 */
    public final void m35030d8() {
        C41318g46.m40163a("selectPrivateBirdIfNearby called, starting stream to check for private birds", new Object[0]);
        C24523e c24523e = C24523e.f91168a;
        Observable m74576S = C37279Yf5.m74576S(this.f86353g.mo18213a());
        Observable<Location> skip = this.f86355h.mo43616p().skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "locationManager.locationChanges.skip(1)");
        Observable observeOn = c24523e.m31954c(m74576S, skip).take(1L).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.zip(\n      p…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23066q2 c23066q2 = new C23066q2();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: dZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35019e8(Function1.this, obj);
            }
        };
        final C23070r2 c23070r2 = C23070r2.f86606g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: eZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35008f8(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC42185hY4
    /* renamed from: e */
    public Z84<Boolean> mo35028e() {
        return (Z84) this.f86339Y.getValue();
    }

    /* renamed from: e4 */
    public final NX4 m35023e4() {
        return (NX4) this.f86372p0.getValue();
    }

    @Override // p000.InterfaceC40692f13
    /* renamed from: f */
    public boolean mo35017f(InterfaceC0014A5 interfaceC0014A5, Function1<? super InterfaceC40099e13, Boolean> delegatedNavigation) {
        Intrinsics.checkNotNullParameter(delegatedNavigation, "delegatedNavigation");
        C41318g46.m40163a("navigateMaybe called activityResultDelegate=" + interfaceC0014A5, new Object[0]);
        Boolean invoke = delegatedNavigation.invoke(this.f86333S);
        if (invoke.booleanValue()) {
            this.f86316B.mo21505d().addLast(Optional.f63040c.m59033b(interfaceC0014A5));
        }
        return invoke.booleanValue();
    }

    /* renamed from: f4 */
    public final YR4 m35012f4() {
        return this.f86347d;
    }

    /* renamed from: f5 */
    public final void m35011f5() {
        Observable m31956a = C24523e.f91168a.m31956a(this.f86371p.mo90007a(), this.f86371p.mo90002f());
        final C22919N c22919n = C22919N.f86450g;
        Observable filter = m31956a.filter(new InterfaceC23494q() { // from class: zY4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35000g5;
                m35000g5 = C42483i25.m35000g5(Function1.this, obj);
                return m35000g5;
            }
        });
        final C22923O c22923o = new C22923O();
        Observable observeOn = filter.switchMap(new InterfaceC23492o() { // from class: AY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m34989h5;
                m34989h5 = C42483i25.m34989h5(Function1.this, obj);
                return m34989h5;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun observeLowBa…l))\n        }\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22929P c22929p = new C22929P();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: BY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34978i5(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC42185hY4
    /* renamed from: g */
    public void mo35006g(WireRide wireRide) {
        Unit unit;
        if (this.f86315A.mo15903f().getValue() == RideUpdateState.STARTING) {
            return;
        }
        if (wireRide == null) {
            wireRide = m35088Y3();
        }
        if (wireRide != null) {
            m34853t9(wireRide);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m35194N7(false);
        }
    }

    /* renamed from: g4 */
    public final Map<String, DateTime> m35001g4() {
        return this.f86374q0;
    }

    /* renamed from: g8 */
    public final void m34997g8(WireRide wireRide, boolean z) {
        Object m33094as = this.f86347d.mo75056T(wireRide, z).m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23074s2 c23074s2 = new C23074s2(z);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: b25
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34986h8(Function1.this, obj);
            }
        };
        final C23078t2 c23078t2 = C23078t2.f86614g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: c25
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34975i8(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC40692f13
    /* renamed from: h */
    public void mo34995h(InterfaceC0014A5 interfaceC0014A5, Function1<? super InterfaceC40099e13, Unit> delegatedNavigation) {
        Intrinsics.checkNotNullParameter(delegatedNavigation, "delegatedNavigation");
        C41318g46.m40163a("navigate called activityResultDelegate=" + interfaceC0014A5, new Object[0]);
        this.f86316B.mo21505d().addLast(Optional.f63040c.m59033b(interfaceC0014A5));
        delegatedNavigation.invoke(this.f86333S);
    }

    /* renamed from: h4 */
    public final boolean m34990h4() {
        return Intrinsics.areEqual(this.f86341a.m82623f8().m73665a().getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE);
    }

    /* renamed from: h9 */
    public final void m34985h9() {
        Z84<Optional<RideState>> mo75057R = this.f86347d.mo75057R();
        final C22947S2 c22947s2 = C22947S2.f86480g;
        Observable<Optional<RideState>> distinctUntilChanged = mo75057R.distinctUntilChanged(new InterfaceC23492o() { // from class: gZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m34974i9;
                m34974i9 = C42483i25.m34974i9(Function1.this, obj);
                return m34974i9;
            }
        });
        final C22952T2 c22952t2 = new C22952T2();
        Observable<R> switchMap = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: hZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m34963j9;
                m34963j9 = C42483i25.m34963j9(Function1.this, obj);
                return m34963j9;
            }
        });
        final C22959U2 c22959u2 = C22959U2.f86491g;
        Observable retry = switchMap.doOnError(new InterfaceC23484g() { // from class: iZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34952k9(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun subscribeToR…r)\n      .subscribe()\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    @Override // p000.InterfaceC40692f13
    /* renamed from: i */
    public void mo34984i() {
        C41318g46.m40163a("resetNavigatorState called", new Object[0]);
        this.f86316B.mo21505d().clear();
    }

    /* renamed from: i4 */
    public final Location m34979i4() {
        return this.f86355h.mo43616p().m73665a();
    }

    @Override // p000.InterfaceC42185hY4
    /* renamed from: j */
    public void mo34973j(WireRide wireRide) {
        final WireRide wireRide2;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        String str;
        String str2;
        if (wireRide == null) {
            wireRide2 = m35088Y3();
        } else {
            wireRide2 = wireRide;
        }
        Location m73665a = this.f86355h.mo43616p().m73665a();
        if (this.f86349e.mo55540n() != null) {
            this.f86316B.mo21507b(wireRide2, "unknown", "uncaught_end_ride_attempt");
        }
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        List<Area> m73665a2 = this.f86343b.mo64001e().m73665a();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m73665a2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : m73665a2) {
            arrayList.add(area.getId());
        }
        List<Area> value = this.f86343b.mo64001e().getValue();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (Area area2 : value) {
            arrayList2.add(Double.valueOf(Seconds.secondsBetween(this.f86343b.mo64011O().getValue().get(area2), DateTime.now()).getSeconds()));
        }
        double latitude = m73665a.getLatitude();
        double longitude = m73665a.getLongitude();
        double accuracy = m73665a.getAccuracy();
        double altitude = m73665a.getAltitude();
        double speed = m73665a.getSpeed();
        if (wireRide2 != null) {
            str = wireRide2.getId();
        } else {
            str = null;
        }
        interfaceC1880Ea.mo55905y(new C33022Ga5(null, null, null, this.f86349e.mo55542k(), str, arrayList, arrayList2, Double.valueOf(latitude), Double.valueOf(longitude), null, Double.valueOf(speed), Double.valueOf(altitude), Double.valueOf(accuracy), null, 7, null));
        if (wireRide2 != null) {
            str2 = wireRide2.getId();
        } else {
            str2 = null;
        }
        C41318g46.m40163a("waiting for any required end ride conditions to be met before attempting to end ride (id=" + str2 + ")", new Object[0]);
        AbstractC23461c m33029z = this.f86349e.mo55544j(wireRide2).m33029z(new InterfaceC23478a() { // from class: e05
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C42483i25.m34866s7();
            }
        });
        final C22946S1 c22946s1 = new C22946S1(wireRide2);
        AbstractC23461c m33070P = m33029z.m33084B(new InterfaceC23484g() { // from class: f05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34855t7(Function1.this, obj);
            }
        }).m33085A(new InterfaceC23478a() { // from class: g05
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C42483i25.m34844u7();
            }
        }).m33069Q().m33070P(C23454a.m33087a());
        final C22951T1 c22951t1 = new C22951T1();
        AbstractC23461c m33081E = m33070P.m33081E(new InterfaceC23484g() { // from class: h05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34833v7(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33081E, "override fun onEndRideCl…er,\n        )\n      }\n  }");
        Object m33041n = m33081E.m33041n(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: i05
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C42483i25.m34822w7(C42483i25.this, wireRide2);
            }
        });
    }

    /* renamed from: j4 */
    public final void m34968j4(Intent intent) {
        boolean z;
        BirdScan birdScan;
        boolean z2;
        C41318g46.m40163a("handleBirdScanResult called with data: " + intent, new Object[0]);
        if (intent != null && intent.getBooleanExtra("navigate_to_long_term_rental", false)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f86333S.mo37173F0(I35.LONG_TERM_RENTAL_SETUP.ordinal());
            return;
        }
        ScanIntention scanIntention = null;
        if (intent != null) {
            birdScan = (BirdScan) intent.getParcelableExtra("bird");
        } else {
            birdScan = null;
        }
        if (intent != null && intent.getBooleanExtra("start_ride_immediately", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (birdScan != null) {
            this.f86347d.mo75026v(birdScan.getId());
            WireBird bird = birdScan.getBird();
            if (bird != null) {
                boolean booleanExtra = intent.getBooleanExtra("paired", false);
                RiderBirdScanExtra riderBirdScanExtra = (RiderBirdScanExtra) intent.getParcelableExtra("rider_bird_scan");
                C41318g46.m40163a("riderBirdScanExtras = " + riderBirdScanExtra, new Object[0]);
                if (riderBirdScanExtra != null) {
                    scanIntention = riderBirdScanExtra.getScanIntention();
                }
                if (scanIntention == ScanIntention.GUEST_RIDE) {
                    C41318g46.m40163a("handleBirdScan Result as guest scan", new Object[0]);
                    m35206M5(bird, z2, true);
                } else if (this.f86386z.mo72985b(bird.getId())) {
                    m34800y7(bird, booleanExtra);
                } else if (C36441Uq4.m80769c(this.f86341a, bird).getPrivateBirdConfig().getUseBirdUserActions()) {
                    m34800y7(bird, booleanExtra);
                } else {
                    C41318g46.m40163a("handleBirdScan Result as primary scan", new Object[0]);
                    m35206M5(bird, z2, false);
                }
            }
        }
    }

    /* renamed from: j5 */
    public final void m34967j5(ScopeProvider scopeProvider) {
        boolean enableOnboardingBannerEntry;
        final boolean z;
        m35045c4().mo7228a("observeRequirements called", new Object[0]);
        Config m73665a = this.f86341a.m82623f8().m73665a();
        Boolean enableRiderBannerEntry = m73665a.getOnboarding().getEnableRiderBannerEntry();
        if (enableRiderBannerEntry != null) {
            enableOnboardingBannerEntry = enableRiderBannerEntry.booleanValue();
        } else {
            enableOnboardingBannerEntry = m73665a.getEnableOnboardingBannerEntry();
        }
        Boolean enableRiderOneFlow = this.f86341a.m82623f8().m73665a().getOnboarding().getEnableRiderOneFlow();
        if (enableRiderOneFlow != null) {
            z = enableRiderOneFlow.booleanValue();
        } else {
            z = false;
        }
        if (!m35034d4() && ((enableOnboardingBannerEntry || z) && !m35067a4())) {
            AbstractC24507p<RideRequirement> m32031n = this.f86335U.mo14397h().m32031n(new InterfaceC23478a() { // from class: FZ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42483i25.m34956k5(z, this);
                }
            });
            final C22933Q c22933q = new C22933Q(z, this);
            AbstractC24507p<RideRequirement> m32031n2 = m32031n.m32026s(new InterfaceC23484g() { // from class: GZ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m34945l5(Function1.this, obj);
                }
            }).m32066I(C23454a.m33087a()).m32031n(new InterfaceC23478a() { // from class: IZ4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C42483i25.m34934m5(z, this);
                }
            });
            final C22937R c22937r = new C22937R(z, this);
            AbstractC23461c m32074A = m32031n2.m32074A(new InterfaceC23492o() { // from class: JZ4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m34923n5;
                    m34923n5 = C42483i25.m34923n5(Function1.this, obj);
                    return m34923n5;
                }
            });
            final C22944S c22944s = new C22944S();
            AbstractC23461c m33069Q = m32074A.m33084B(new InterfaceC23484g() { // from class: KZ4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C42483i25.m34912o5(Function1.this, obj);
                }
            }).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun observeRequi…r)\n      .subscribe()\n  }");
            Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(scopeProvider));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
            return;
        }
        m35045c4().mo7228a("onboarding CTA disabled: onboardingCompleted=" + m35034d4() + ", onboardingBannerEnabled=" + enableOnboardingBannerEntry + ", onboadingOneFlowBottomSheetEnabled=" + z + ", inRequirementCheck=" + m35067a4(), new Object[0]);
        this.f86331Q.mo75626Xa();
        this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.ONBOARDING_IN_PROGRESS);
        this.f86337W.mo40694N1(FlightBannerNode.FlightBanner.ONBOARDING_START);
        this.f86340Z.accept(Boolean.FALSE);
    }

    /* renamed from: j8 */
    public final void m34964j8(boolean z, Throwable throwable, String str) {
        IssueFlow issueFlow;
        IssueKind issueKind;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof BluetoothException) && str != null) {
            if (z) {
                issueFlow = IssueFlow.RIDER_UNLOCK;
            } else {
                issueFlow = IssueFlow.RIDER_LOCK;
            }
            BluetoothException bluetoothException = (BluetoothException) throwable;
            BluetoothException.Reason reason = bluetoothException.getReason();
            BluetoothException.Reason reason2 = BluetoothException.Reason.CONNECTION;
            if (reason == reason2) {
                this.f86382v.mo55956N(new BluetoothConnectionError(issueFlow, bluetoothException.getReason().name()));
            } else {
                this.f86382v.mo55956N(new BluetoothCommunicationError(issueFlow, bluetoothException.getReason().name()));
            }
            InterfaceC44573la2 interfaceC44573la2 = this.f86359j;
            if (bluetoothException.getReason() == reason2) {
                issueKind = IssueKind.BLUETOOTH_CONNECTION;
            } else {
                issueKind = IssueKind.BLUETOOTH_COMMUNICATION;
            }
            Object m33135e = interfaceC44573la2.mo25422a(issueFlow, issueKind, bluetoothException.getReason().name(), str).m33135e(AutoDispose.m45239a(this.f86328N));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C23082u2 c23082u2 = C23082u2.f86618g;
            ((SingleSubscribeProxy) m33135e).mo45204b(new InterfaceC23479b() { // from class: EY4
                @Override // io.reactivex.functions.InterfaceC23479b
                public final void accept(Object obj, Object obj2) {
                    C42483i25.m34953k8(Function2.this, obj, obj2);
                }
            });
        }
    }

    @Override // p000.FU4
    /* renamed from: k1 */
    public void mo34960k1(String title, String message, Function0<Unit> onPrimary, Function0<Unit> onSecondary, Integer num, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onPrimary, "onPrimary");
        Intrinsics.checkNotNullParameter(onSecondary, "onSecondary");
        this.f86331Q.mo75607k1(title, message, onPrimary, onSecondary, num, str);
    }

    /* renamed from: k4 */
    public final void m34957k4(Intent intent) {
        ParceableGoDeepLinkParams parceableGoDeepLinkParams = (ParceableGoDeepLinkParams) intent.getParcelableExtra("go_deeplink_params");
        if (parceableGoDeepLinkParams instanceof GoTransactionDeepLinkParams) {
            GoTransactionDeepLinkParams goTransactionDeepLinkParams = (GoTransactionDeepLinkParams) parceableGoDeepLinkParams;
            String rideId = goTransactionDeepLinkParams.getRideId();
            String receiptId = goTransactionDeepLinkParams.getReceiptId();
            if (rideId != null) {
                C41318g46.m40163a("redirecting ", new Object[0]);
                InterfaceC40099e13.C19924a.goToRideDetail$default(this.f86333S, rideId, false, 2, null);
            } else if (receiptId != null) {
                InterfaceC40099e13.C19924a.goToTransactionReceipt$default(this.f86333S, receiptId, null, null, 6, null);
            }
        } else if (parceableGoDeepLinkParams instanceof GoPaymentDeepLinkParams) {
            C41318g46.m40163a("redirecting to payment and attempting to show add money screen", new Object[0]);
            if (((GoPaymentDeepLinkParams) parceableGoDeepLinkParams).getShowPreloadAddMoneyScreen()) {
                InterfaceC40099e13.C19924a.goToPaymentAndAddMoney$default(this.f86333S, null, 1, null);
            } else {
                InterfaceC40099e13.C19924a.goToPayment$default(this.f86333S, null, false, 3, null);
            }
        } else if (parceableGoDeepLinkParams instanceof GoIdentificationDeepLinkParams) {
            GoIdentificationDeepLinkParams goIdentificationDeepLinkParams = (GoIdentificationDeepLinkParams) parceableGoDeepLinkParams;
            boolean showIDVFlow = goIdentificationDeepLinkParams.getShowIDVFlow();
            C41318g46.m40163a("redirecting to identification verification if required: " + showIDVFlow, new Object[0]);
            if (goIdentificationDeepLinkParams.getShowIDVFlow()) {
                Object m33135e = this.f86335U.mo14398g(RideRequirement.SelectIdentificationMethod.INSTANCE).m33135e(AutoDispose.m45239a(this.f86328N));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C23045n c23045n = C23045n.f86582g;
                ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: d25
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C42483i25.m34946l4(Function1.this, obj);
                    }
                });
            }
        } else if (parceableGoDeepLinkParams != null) {
            C41318g46.m40163a("unable to forward deeplink for params " + parceableGoDeepLinkParams, new Object[0]);
        }
    }

    @Override // p000.FU4
    /* renamed from: l1 */
    public AbstractC23442F<DialogResponse> mo34949l1(InterfaceC26418n9 alertDialog, WarningPresentationKind presentationKind) {
        Intrinsics.checkNotNullParameter(alertDialog, "alertDialog");
        Intrinsics.checkNotNullParameter(presentationKind, "presentationKind");
        if (alertDialog instanceof QM4) {
            return this.f86331Q.mo75658Ck((QM4) alertDialog, presentationKind);
        }
        AbstractC23442F<DialogResponse> m33158H = AbstractC23442F.m33158H(DialogResponse.OK);
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      if (BuildConfig.…esponse.OK)\n      }\n    }");
        return m33158H;
    }

    /* renamed from: l8 */
    public final boolean m34942l8() {
        Config m35128U3 = m35128U3();
        if (!m35128U3.getEnableOutsideServiceAreaWarnings() && !m35128U3.getComplianceConfig().getEnableNoParkingAreaWarnings()) {
            return false;
        }
        return true;
    }

    /* renamed from: l9 */
    public final void m34941l9() {
        Observable<Optional<C46396oe6>> observeOn = this.f86365m.mo21398i().observeOn(C23454a.m33087a());
        final C22965V2 c22965v2 = new C22965V2();
        Observable<Optional<C46396oe6>> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: YZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34930m9(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun subscribeToS…r)\n      .subscribe()\n  }");
        Observable m74575T = C37279Yf5.m74575T(doOnNext, C22970W2.f86502g);
        final C22974X2 c22974x2 = C22974X2.f86506g;
        Observable distinctUntilChanged = m74575T.distinctUntilChanged(new InterfaceC23492o() { // from class: ZZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m34919n9;
                m34919n9 = C42483i25.m34919n9(Function1.this, obj);
                return m34919n9;
            }
        });
        final C22978Y2 c22978y2 = new C22978Y2();
        Observable flatMapSingle = distinctUntilChanged.flatMapSingle(new InterfaceC23492o() { // from class: a05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m34908o9;
                m34908o9 = C42483i25.m34908o9(Function1.this, obj);
                return m34908o9;
            }
        });
        final C22985Z2 c22985z2 = C22985Z2.f86516g;
        Observable retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: b05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34897p9(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun subscribeToS…r)\n      .subscribe()\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    @Override // p000.FU4
    /* renamed from: m1 */
    public void mo34938m1(WireRide ride, CompleteRideResponse response, DateTime operationStart, boolean z) {
        DateTime completedAt;
        int collectionSizeOrDefault;
        WireRideDetail wireRideDetail;
        long j;
        DateTime dateTime;
        ArrayList arrayList;
        Double d;
        WireRide copy;
        WireRideDetail copy2;
        EnumC44987mG3 m64761f;
        ParkingNest m64762e;
        DateTime startedAt;
        WireReceipt receipt;
        WireRideTransaction transaction;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(operationStart, "operationStart");
        if (z) {
            this.f86379t.m37690Q0();
        }
        WireBird bird = ride.getBird();
        Config m80769c = C36441Uq4.m80769c(this.f86341a, bird);
        WireRidePrice m106251a = C32972Fv0.m106251a(m80769c);
        WireRideDetail rideDetail = response.getRideDetail();
        WireRide ride2 = rideDetail != null ? rideDetail.getRide() : null;
        CompleteRideResponseError error = response.getError();
        WireLocation location = bird != null ? bird.getLocation() : null;
        Location mo43632A = this.f86355h.mo43632A(EnumC36493Uw2.VPS);
        Location mo43632A2 = this.f86355h.mo43632A(EnumC36493Uw2.GPS);
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        Boolean valueOf = bird != null ? Boolean.valueOf(WireBirdKt.canTreatAsBluetooth(bird, m80769c)) : null;
        Boolean valueOf2 = bird != null ? Boolean.valueOf(WireBirdKt.canTreatAsBluetooth(bird, m80769c)) : null;
        Boolean valueOf3 = bird != null ? Boolean.valueOf(bird.getCellular()) : null;
        Boolean valueOf4 = bird != null ? Boolean.valueOf(bird.getCellular()) : null;
        String str = (bird == null || (r12 = bird.getModel()) == null) ? "" : "";
        String currency = this.f86341a.m82623f8().m73665a().getRideConfig().getCurrency();
        long distance = (long) (ride2 != null ? ride2.getDistance() : ride.getDistance());
        double durationSeconds = ride2 != null ? ride2.durationSeconds() : ride.durationSeconds();
        if ((ride2 == null || (completedAt = ride2.getCompletedAt()) == null) && (completedAt = ride.getCompletedAt()) == null) {
            completedAt = DateTime.now();
        }
        long amount = (rideDetail == null || (receipt = rideDetail.getReceipt()) == null || (transaction = receipt.getTransaction()) == null) ? 0L : transaction.getAmount();
        long minimumPrice = m106251a.getMinimumPrice();
        long minimumPrice2 = m106251a.getMinimumPrice();
        long includedMinutes = m106251a.getIncludedMinutes();
        String partnerId = bird != null ? bird.getPartnerId() : null;
        String id = ride.getId();
        List<Area> value = this.f86343b.mo63995r().getValue();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Area area : value) {
            arrayList2.add(area.getId());
        }
        boolean salesTax = m106251a.getSalesTax();
        long basePrice = m106251a.getBasePrice();
        if (ride2 == null || (startedAt = ride2.getStartedAt()) == null) {
            DateTime startedAt2 = ride.getStartedAt();
            if (startedAt2 == null) {
                wireRideDetail = rideDetail;
                j = 0;
                startedAt2 = new DateTime(0L);
            } else {
                wireRideDetail = rideDetail;
                j = 0;
            }
            dateTime = startedAt2;
        } else {
            dateTime = startedAt;
            wireRideDetail = rideDetail;
            j = 0;
        }
        if (ride2 != null) {
            j = ride2.getCost();
        }
        long j2 = j;
        boolean z2 = this.f86316B.mo21500j() instanceof C32109Cd1;
        C38435bF0 mo21502g = this.f86316B.mo21502g();
        String id2 = (mo21502g == null || (m64762e = mo21502g.m64762e()) == null) ? null : m64762e.getId();
        C38435bF0 mo21502g2 = this.f86316B.mo21502g();
        String name = (mo21502g2 == null || (m64761f = mo21502g2.m64761f()) == null) ? null : m64761f.name();
        RideState mo75038i1 = this.f86347d.mo75038i1(ride.getId());
        boolean z3 = false;
        boolean z4 = mo75038i1 != null && RideStatesKt.isPrimaryRide(mo75038i1);
        long activeRideCount = this.f86347d.mo75032o0().m73665a().getActiveRideCount();
        WireRideDetail wireRideDetail2 = wireRideDetail;
        String mo55540n = this.f86349e.mo55540n();
        Double valueOf5 = location != null ? Double.valueOf(location.getLatitude()) : null;
        Double valueOf6 = location != null ? Double.valueOf(location.getLongitude()) : null;
        Double accuracy = location != null ? location.getAccuracy() : null;
        Boolean valueOf7 = location != null ? Boolean.valueOf(location.getMocked()) : null;
        Double valueOf8 = mo43632A != null ? Double.valueOf(mo43632A.getLatitude()) : null;
        Double valueOf9 = mo43632A != null ? Double.valueOf(mo43632A.getLongitude()) : null;
        if (mo43632A != null) {
            arrayList = arrayList2;
            d = Double.valueOf(mo43632A.getAccuracy());
        } else {
            arrayList = arrayList2;
            d = null;
        }
        Boolean m76041a = mo43632A != null ? C37195Xw2.m76041a(mo43632A) : null;
        Double valueOf10 = mo43632A2 != null ? Double.valueOf(mo43632A2.getLatitude()) : null;
        Double valueOf11 = mo43632A2 != null ? Double.valueOf(mo43632A2.getLongitude()) : null;
        Double valueOf12 = mo43632A2 != null ? Double.valueOf(mo43632A2.getAccuracy()) : null;
        Boolean m76041a2 = mo43632A2 != null ? C37195Xw2.m76041a(mo43632A2) : null;
        double nestSearchAccuracyRadiusLimit = m80769c.getNestSearchAccuracyRadiusLimit();
        Double riderNestAdditionalBufferMeters = m80769c.getParkingConfig().getRiderNestAdditionalBufferMeters();
        Intrinsics.checkNotNullExpressionValue(completedAt, "detailRide?.completedAt …letedAt ?: DateTime.now()");
        interfaceC1880Ea.mo55905y(new OP4(null, null, null, valueOf, valueOf2, valueOf3, valueOf4, str, currency, distance, durationSeconds, completedAt, amount, minimumPrice, minimumPrice2, includedMinutes, partnerId, id, salesTax, basePrice, dateTime, j2, arrayList, null, Boolean.valueOf(z2), id2, name, Boolean.valueOf(z4), Long.valueOf(activeRideCount), mo55540n, valueOf8, valueOf9, d, m76041a, valueOf5, valueOf6, accuracy, valueOf7, valueOf10, valueOf11, valueOf12, m76041a2, Double.valueOf(nestSearchAccuracyRadiusLimit), riderNestAdditionalBufferMeters, 8388615, 0, null));
        InterfaceC1880Ea interfaceC1880Ea2 = this.f86382v;
        WireRidePrice m106251a2 = C32972Fv0.m106251a(m35128U3());
        boolean m35309C4 = m35309C4(ride);
        WireBird bird2 = ride.getBird();
        boolean z5 = bird2 != null && bird2.getCellular();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        interfaceC1880Ea2.mo55956N(new RideEndFlow(ride, m106251a2, m35309C4, z5, C46880pT0.m19253i(now, operationStart)));
        this.f86349e.mo55551e();
        if (wireRideDetail2 != null) {
            copy = r7.copy((r45 & 1) != 0 ? r7.f66754id : null, (r45 & 2) != 0 ? r7.distance : 0.0d, (r45 & 4) != 0 ? r7.birdId : null, (r45 & 8) != 0 ? r7.bird : null, (r45 & 16) != 0 ? r7.birdEphemeralId : null, (r45 & 32) != 0 ? r7.cost : 0, (r45 & 64) != 0 ? r7.currency : null, (r45 & 128) != 0 ? r7.startedAt : null, (r45 & 256) != 0 ? r7.deliveryUnlockedAt : null, (r45 & 512) != 0 ? r7.completedAt : null, (r45 & 1024) != 0 ? r7.continuedAt : null, (r45 & 2048) != 0 ? r7.canceledAt : null, (r45 & 4096) != 0 ? r7.delivery : false, (r45 & 8192) != 0 ? r7.payAsYouGo : false, (r45 & 16384) != 0 ? r7.successfulTest : null, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r7.type : null, (r45 & 65536) != 0 ? r7.partnerId : null, (r45 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r7.billedMinutes : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r7.privateBirdId : null, (r45 & 524288) != 0 ? r7.vehicleModel : null, (r45 & 1048576) != 0 ? r7.tipId : null, (r45 & 2097152) != 0 ? r7.startedInNoRideZone : false, (r45 & 4194304) != 0 ? r7.startedOutsideOperatingArea : false, (r45 & 8388608) != 0 ? r7.isBadAreaRideEnabled : false, (r45 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r7.userGuestId : ride.getUserGuestId(), (r45 & 33554432) != 0 ? wireRideDetail2.getRide().rideDetail : null);
            copy2 = wireRideDetail2.copy((r38 & 1) != 0 ? wireRideDetail2.ride : copy, (r38 & 2) != 0 ? wireRideDetail2.birdTracks : null, (r38 & 4) != 0 ? wireRideDetail2.birdEvents : null, (r38 & 8) != 0 ? wireRideDetail2.rating : null, (r38 & 16) != 0 ? wireRideDetail2.receipt : null, (r38 & 32) != 0 ? wireRideDetail2.rideEndRidePhotoParkingEvaluation : null, (r38 & 64) != 0 ? wireRideDetail2.coupons : null, (r38 & 128) != 0 ? wireRideDetail2.distance : null, (r38 & 256) != 0 ? wireRideDetail2.duration : null, (r38 & 512) != 0 ? wireRideDetail2.cost : null, (r38 & 1024) != 0 ? wireRideDetail2.costWithoutCoupon : null, (r38 & 2048) != 0 ? wireRideDetail2.subtext : null, (r38 & 4096) != 0 ? wireRideDetail2.title : null, (r38 & 8192) != 0 ? wireRideDetail2.detail : null, (r38 & 16384) != 0 ? wireRideDetail2.imageUrl : null, (r38 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireRideDetail2.costImageUrl : null, (r38 & 65536) != 0 ? wireRideDetail2.frequentFlyerView : null, (r38 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireRideDetail2.dispute : null, (r38 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireRideDetail2.reportStatus : null, (r38 & 524288) != 0 ? wireRideDetail2.report : null);
            m35074Z7(copy2);
            Unit unit = Unit.INSTANCE;
        }
        if (error != null) {
            Throwable component1 = error.component1();
            WireRide component2 = error.component2();
            onRideError$app_birdRelease$default(this, component1, null, null, 6, null);
            if (component2 != null) {
                this.f86347d.mo75054Z();
                Unit unit2 = Unit.INSTANCE;
            }
        }
        if (bird != null) {
            WireBird m59035e = this.f86315A.mo15900i().m73665a().m59035e();
            z3 = m59035e != null && m59035e.isProbablySame(bird);
        }
        if (z3) {
            this.f86315A.mo15904e();
        }
        this.f86315A.mo15899j(RideUpdateState.NONE);
    }

    /* renamed from: m4 */
    public final void m34935m4(WireBird wireBird, Throwable th) {
        boolean z;
        Long l;
        String str;
        String str2;
        Boolean bool;
        m35204M7(th, Boolean.TRUE, wireBird);
        RideConfig rideConfig = this.f86347d.mo75030r().m73665a().getRideConfig();
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        boolean canTreatAsBluetooth = WireBirdKt.canTreatAsBluetooth(wireBird, C36441Uq4.m80769c(this.f86341a, wireBird));
        boolean cellular = wireBird.getCellular();
        if (wireBird.getPrivateBird() != null) {
            z = true;
        } else {
            z = false;
        }
        String id = wireBird.getId();
        String model = wireBird.getModel();
        if (model == null) {
            model = "";
        }
        String str3 = model;
        String partnerId = wireBird.getPartnerId();
        String m88990a = Q36.m88990a(th);
        long basePrice = rideConfig.getBasePrice();
        long minutePrice = rideConfig.getMinutePrice();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long includedMinutes = rideConfig.getIncludedMinutes();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        Balance m59035e = this.f86381u.mo26977K().getValue().m59035e();
        if (m59035e != null) {
            l = Long.valueOf(m59035e.getBalance());
        } else {
            l = null;
        }
        BirdPayment m59035e2 = this.f86385y.mo1484a().getValue().m59035e();
        if (m59035e2 != null) {
            str = m59035e2.vendor();
        } else {
            str = null;
        }
        BirdPayment m59035e3 = this.f86385y.mo1484a().getValue().m59035e();
        if (m59035e3 != null) {
            str2 = m59035e3.toString();
        } else {
            str2 = null;
        }
        Balance m59035e4 = this.f86381u.mo26977K().getValue().m59035e();
        if (m59035e4 != null) {
            bool = m59035e4.getAutoPayActive();
        } else {
            bool = null;
        }
        interfaceC1880Ea.mo55905y(new V55(null, null, null, canTreatAsBluetooth, cellular, z, id, str3, partnerId, m88990a, basePrice, minutePrice, minimumRidePrice, includedMinutes, applyTax, l, str, str2, bool, Boolean.valueOf(Q36.m88989b(th)), "start_ride", Boolean.valueOf(!this.f86347d.mo75061N()), Long.valueOf(this.f86347d.mo75032o0().m73665a().getActiveRideCount()), 7, null));
        InterfaceC1880Ea interfaceC1880Ea2 = this.f86382v;
        WireRidePrice m106251a = C32972Fv0.m106251a(m35128U3());
        boolean canTreatAsBluetooth2 = WireBirdKt.canTreatAsBluetooth(wireBird, C36441Uq4.m80769c(this.f86341a, wireBird));
        boolean cellular2 = wireBird.getCellular();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        DateTime dateTime = this.f86374q0.get(wireBird.getId());
        if (dateTime == null) {
            dateTime = new DateTime(0L);
        }
        interfaceC1880Ea2.mo55956N(new RideStartFailed(wireBird, m106251a, canTreatAsBluetooth2, cellular2, C46880pT0.m19253i(now, dateTime), th));
        this.f86318D.mo89854c(wireBird);
        this.f86315A.mo15899j(RideUpdateState.NONE);
    }

    /* renamed from: m8 */
    public final void m34931m8() {
        int collectionSizeOrDefault;
        Object firstOrNull;
        boolean z;
        List<RideState> activeRides = this.f86347d.mo75032o0().m73665a().activeRides();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(activeRides, 10);
        ArrayList<WireRide> arrayList = new ArrayList(collectionSizeOrDefault);
        for (RideState rideState : activeRides) {
            arrayList.add(rideState.getRide());
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.f86347d.mo75032o0().m73665a().endedRides());
        RideState rideState2 = (RideState) firstOrNull;
        boolean z2 = true;
        if (arrayList.isEmpty()) {
            boolean m59037c = this.f86361k.mo83798e().getValue().m59037c();
            if (m35088Y3() != null) {
                z = true;
            } else {
                z = false;
            }
            C41318g46.m40151m("setActiveRides called and returned empty result. will reset ride if neither of the following are present. reservation present: " + m59037c + ", focusedRide present: " + z, new Object[0]);
            if (!this.f86361k.mo83798e().getValue().m59037c()) {
                if (rideState2 != null) {
                    resetRide$app_birdRelease$default(this, null, 1, null);
                }
                this.f86315A.mo15894o(RideMapState.RIDING);
                return;
            }
            return;
        }
        if (m35088Y3() == null) {
            z2 = false;
        }
        InterfaceC46893pU4 interfaceC46893pU4 = this.f86315A;
        ArrayList arrayList2 = new ArrayList();
        for (WireRide wireRide : arrayList) {
            WireBird bird = wireRide.getBird();
            if (bird != null) {
                arrayList2.add(bird);
            }
        }
        interfaceC46893pU4.mo15896m(arrayList2);
        this.f86315A.mo15906c(RideMapState.RIDING);
        if (!z2) {
            m35153R8();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r1.getCellular() == true) goto L5;
     */
    @Override // p000.FU4
    /* renamed from: n1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo34927n1(WireRide ride, Throwable throwable, DateTime operationStart) {
        boolean z;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(operationStart, "operationStart");
        m35204M7(throwable, Boolean.FALSE, ride.getBird());
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        boolean m35309C4 = m35309C4(ride);
        WireBird bird = ride.getBird();
        if (bird != null) {
            z = true;
        }
        z = false;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        interfaceC1880Ea.mo55956N(new RideLockedFailed(ride, m35309C4, z, C46880pT0.m19253i(now, operationStart), throwable));
        this.f86315A.mo15899j(RideUpdateState.NONE);
    }

    /* renamed from: n4 */
    public final void m34924n4(WireBird wireBird, WireRide wireRide) {
        boolean z;
        boolean z2;
        C41318g46.m40163a("handleStartRideSuccess for bird " + wireBird.getId() + " called (ride: " + wireRide.getId() + ")", new Object[0]);
        this.f86315A.mo15899j(RideUpdateState.NONE);
        C41318g46.m40163a("handling parking manager stuff successfully", new Object[0]);
        RideConfig rideConfig = this.f86347d.mo75030r().m73665a().getRideConfig();
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        boolean m35309C4 = m35309C4(wireRide);
        WireBird bird = wireRide.getBird();
        if (bird != null && bird.getCellular()) {
            z = true;
        } else {
            z = false;
        }
        String model = wireBird.getModel();
        if (model == null) {
            model = "";
        }
        String str = model;
        String currency = rideConfig.getCurrency();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long minutePrice = rideConfig.getMinutePrice();
        long includedMinutes = rideConfig.getIncludedMinutes();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        DateTime dateTime = this.f86374q0.get(wireBird.getId());
        if (dateTime == null) {
            dateTime = new DateTime(0L);
        }
        double m19253i = C46880pT0.m19253i(now, dateTime);
        String partnerId = wireBird.getPartnerId();
        String id = wireRide.getId();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice = rideConfig.getBasePrice();
        DateTime startedAt = wireRide.getStartedAt();
        if (startedAt == null && (startedAt = this.f86374q0.get(wireBird.getId())) == null) {
            startedAt = new DateTime(0L);
        }
        DateTime dateTime2 = startedAt;
        Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(this.f86379t.m37750B0()));
        RideState mo75038i1 = this.f86347d.mo75038i1(wireRide.getId());
        if (mo75038i1 != null && RideStatesKt.isPrimaryRide(mo75038i1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        interfaceC1880Ea.mo55905y(new C43709k65(null, null, null, m35309C4, z, str, currency, minimumRidePrice, minutePrice, includedMinutes, m19253i, partnerId, id, applyTax, basePrice, dateTime2, valueOf, Boolean.valueOf(z2), Long.valueOf(this.f86347d.mo75032o0().m73665a().getActiveRideCount()), 7, null));
        m34810x8(this.f86343b.mo63995r().m73665a());
        m34788z8(this, wireRide.getBird(), true, null, false, false, 28, null);
        this.f86331Q.mo75635Qd(C37772a75.f49850h.m71865d(this.f86347d.mo75032o0().m73665a().getRideStates(), wireBird, this.f86315A.mo15903f().m73665a(), this.f86316B.mo21500j(), this.f86341a.m82623f8().m73665a()));
        this.f86322H.mo55677e();
    }

    /* renamed from: n8 */
    public final void m34920n8(ScopeProvider scopeProvider) {
        Z84<RideStates> mo75032o0 = this.f86347d.mo75032o0();
        final C23086v2 c23086v2 = C23086v2.f86622g;
        Observable distinctUntilChanged = mo75032o0.map(new InterfaceC23492o() { // from class: MZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m34909o8;
                m34909o8 = C42483i25.m34909o8(Function1.this, obj);
                return m34909o8;
            }
        }).distinctUntilChanged();
        final C23091w2 c23091w2 = C23091w2.f86626g;
        Observable filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: NZ4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34898p8;
                m34898p8 = C42483i25.m34898p8(Function1.this, obj);
                return m34898p8;
            }
        });
        final C23095x2 c23095x2 = new C23095x2();
        AbstractC23461c switchMapCompletable = filter.switchMapCompletable(new InterfaceC23492o() { // from class: OZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m34887q8;
                m34887q8 = C42483i25.m34887q8(Function1.this, obj);
                return m34887q8;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun setTimerToRe…r)\n      .subscribe()\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.FU4
    /* renamed from: o1 */
    public void mo34916o1(WireRide ride, Throwable throwable, DateTime operationStart) {
        WireLocation wireLocation;
        boolean z;
        String str;
        String str2;
        int collectionSizeOrDefault;
        boolean z2;
        Double d;
        Double d2;
        Double d3;
        Boolean bool;
        Double d4;
        Double d5;
        Double d6;
        Boolean bool2;
        Double d7;
        Double d8;
        Double d9;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(operationStart, "operationStart");
        WireBird bird = ride.getBird();
        if (bird != null) {
            wireLocation = bird.getLocation();
        } else {
            wireLocation = null;
        }
        Location mo43632A = this.f86355h.mo43632A(EnumC36493Uw2.VPS);
        Location mo43632A2 = this.f86355h.mo43632A(EnumC36493Uw2.GPS);
        Config m80769c = C36441Uq4.m80769c(this.f86341a, ride.getBird());
        onRideError$app_birdRelease$default(this, throwable, null, null, 6, null);
        RideConfig rideConfig = this.f86347d.mo75030r().m73665a().getRideConfig();
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        boolean m35309C4 = m35309C4(ride);
        WireBird bird2 = ride.getBird();
        if (bird2 != null && bird2.getCellular()) {
            z = true;
        } else {
            z = false;
        }
        WireBird bird3 = ride.getBird();
        if (bird3 != null) {
            str = bird3.getModel();
        } else {
            str = null;
        }
        String currency = rideConfig.getCurrency();
        long distance = (long) ride.getDistance();
        double durationSeconds = ride.durationSeconds();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long minutePrice = rideConfig.getMinutePrice();
        WireLocation wireLocation2 = wireLocation;
        long includedMinutes = rideConfig.getIncludedMinutes();
        WireBird bird4 = ride.getBird();
        if (bird4 != null) {
            str2 = bird4.getPartnerId();
        } else {
            str2 = null;
        }
        String id = ride.getId();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice = rideConfig.getBasePrice();
        DateTime startedAt = ride.getStartedAt();
        List<Area> value = this.f86343b.mo63995r().getValue();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : value) {
            arrayList.add(area.getId());
        }
        String m88990a = Q36.m88990a(throwable);
        boolean m88989b = Q36.m88989b(throwable);
        RideState mo75038i1 = this.f86347d.mo75038i1(ride.getId());
        if (mo75038i1 != null && RideStatesKt.isPrimaryRide(mo75038i1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        long activeRideCount = this.f86347d.mo75032o0().m73665a().getActiveRideCount();
        String mo55540n = this.f86349e.mo55540n();
        if (wireLocation2 != null) {
            d = Double.valueOf(wireLocation2.getLatitude());
        } else {
            d = null;
        }
        if (wireLocation2 != null) {
            d2 = Double.valueOf(wireLocation2.getLongitude());
        } else {
            d2 = null;
        }
        if (wireLocation2 != null) {
            d3 = wireLocation2.getAccuracy();
        } else {
            d3 = null;
        }
        if (wireLocation2 != null) {
            bool = Boolean.valueOf(wireLocation2.getMocked());
        } else {
            bool = null;
        }
        if (mo43632A != null) {
            d4 = Double.valueOf(mo43632A.getLatitude());
        } else {
            d4 = null;
        }
        if (mo43632A != null) {
            d5 = Double.valueOf(mo43632A.getLongitude());
        } else {
            d5 = null;
        }
        if (mo43632A != null) {
            d6 = Double.valueOf(mo43632A.getAccuracy());
        } else {
            d6 = null;
        }
        if (mo43632A != null) {
            bool2 = C37195Xw2.m76041a(mo43632A);
        } else {
            bool2 = null;
        }
        if (mo43632A2 != null) {
            d7 = Double.valueOf(mo43632A2.getLatitude());
        } else {
            d7 = null;
        }
        if (mo43632A2 != null) {
            d8 = Double.valueOf(mo43632A2.getLongitude());
        } else {
            d8 = null;
        }
        if (mo43632A2 != null) {
            d9 = Double.valueOf(mo43632A2.getAccuracy());
        } else {
            d9 = null;
        }
        if (mo43632A2 != null) {
            bool3 = C37195Xw2.m76041a(mo43632A2);
        } else {
            bool3 = null;
        }
        interfaceC1880Ea.mo55905y(new AQ4(null, null, null, m35309C4, z, str, currency, distance, Double.valueOf(durationSeconds), minimumRidePrice, minutePrice, includedMinutes, str2, id, applyTax, basePrice, startedAt, arrayList, null, m88990a, Boolean.valueOf(m88989b), Boolean.valueOf(z2), Long.valueOf(activeRideCount), mo55540n, d4, d5, d6, bool2, d, d2, d3, bool, d7, d8, d9, bool3, Double.valueOf(m80769c.getNestSearchAccuracyRadiusLimit()), m80769c.getParkingConfig().getRiderNestAdditionalBufferMeters(), 262151, 0, null));
        this.f86349e.mo55551e();
        this.f86315A.mo15899j(RideUpdateState.NONE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1.getCellular() == true) goto L5;
     */
    /* renamed from: o4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m34913o4(WireRide wireRide, Throwable th, DateTime dateTime) {
        boolean z;
        this.f86315A.mo15899j(RideUpdateState.NONE);
        m35204M7(th, Boolean.TRUE, wireRide.getBird());
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        boolean m35309C4 = m35309C4(wireRide);
        WireBird bird = wireRide.getBird();
        if (bird != null) {
            z = true;
        }
        z = false;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        interfaceC1880Ea.mo55956N(new RideUnlockedFailed(wireRide, m35309C4, z, C46880pT0.m19253i(now, dateTime), th));
    }

    @Override // p000.InterfaceC42185hY4
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC0014A5 interfaceC0014A5;
        Bundle extras;
        String string;
        ArrayList<String> stringArrayList;
        C41318g46.m40163a("ridePresenter onActivityResult: requestCode=" + i + ", resultCode=" + i2 + ", data=" + intent + ", activityResultStack size =" + this.f86316B.mo21505d().size(), new Object[0]);
        Optional<InterfaceC0014A5> removeLastOrNull = this.f86316B.mo21505d().removeLastOrNull();
        Enum r2 = null;
        if (removeLastOrNull != null) {
            interfaceC0014A5 = removeLastOrNull.m59035e();
        } else {
            interfaceC0014A5 = null;
        }
        if (interfaceC0014A5 != null) {
            C41318g46.m40163a("Delegated Activity Result found = " + interfaceC0014A5, new Object[0]);
            interfaceC0014A5.mo100855h(this, this, this.f86328N, i, i2, intent);
            return;
        }
        if (i2 == 0) {
            this.f86322H.mo55677e();
        }
        int i3 = -1;
        if (i == 10047) {
            if (i2 == -1) {
                this.f86331Q.success(C45871nl4.ride_pass_success_toast);
            }
        } else if (i == 10006) {
            C41318g46.m40163a("bird barcode scan returned when scanning to start ride", new Object[0]);
            if (i2 == -1) {
                m34968j4(intent);
            }
        } else if (i == I35.RESERVATION_ISSUE_SUBMITTED.ordinal()) {
            if (i2 == -1) {
                this.f86331Q.mo75631U1();
            }
        } else if (i == I35.END_RIDE_RATING.ordinal()) {
            m35124U7();
        } else if (i == I35.LONG_TERM_RENTAL_SETUP.ordinal()) {
            if (i2 == -1) {
                LongTermRentalSignUpResult longTermRentalSignUpResult = (LongTermRentalSignUpResult) X52.m77423b(intent);
                if (longTermRentalSignUpResult != null) {
                    r2 = longTermRentalSignUpResult.m55395b();
                }
                if (r2 != null) {
                    i3 = C22996c.$EnumSwitchMapping$0[r2.ordinal()];
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        this.f86377s.postDelayed(new Runnable() { // from class: RY4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C42483i25.m35256H5(C42483i25.this);
                            }
                        }, 500L);
                        return;
                    }
                    return;
                }
                this.f86377s.postDelayed(new Runnable() { // from class: QY4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C42483i25.m35266G5(C42483i25.this);
                    }
                }, 500L);
            }
        } else if (i == I35.MY_BIRDS.ordinal()) {
            if (i2 == -1) {
                MyBirdsResult myBirdsResult = (MyBirdsResult) X52.m77423b(intent);
                if (myBirdsResult != null) {
                    r2 = myBirdsResult.m55390b();
                }
                if (r2 == MyBirdsResult.EnumC16265a.UNPAIRED) {
                    this.f86377s.postDelayed(new Runnable() { // from class: SY4
                        @Override // java.lang.Runnable
                        public final void run() {
                            C42483i25.m35276F5(C42483i25.this);
                        }
                    }, 500L);
                }
            }
        } else if (i == 10029) {
            if (i2 == -1) {
                this.f86331Q.success(C45871nl4.cannot_access_submission_success);
            }
        } else if (i == I35.MY_BIRD_DETAILS.ordinal()) {
            if (i2 == 0) {
                m35228K3();
            }
        } else if (i == I35.COMMUNITY_MODE.ordinal()) {
            if (i2 == -1 && intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("complaint_type")) != null && (stringArrayList = extras.getStringArrayList("bird_ids")) != null && Intrinsics.areEqual(string, "REPORT_FRAUD") && (!stringArrayList.isEmpty())) {
                this.f86331Q.mo75599n7();
                H31.C3014a.showCustomDialog$default((H31) this.f86331Q, C39311cj4.dialog_report_fraud_batch_confirmation, (Integer) null, (Integer) null, false, false, false, (Integer) null, (Integer) null, (CharSequence) null, (CharSequence) null, C36585Vg4.btnOk, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) new C23018h0(), (Function0) null, false, 457726, (Object) null);
            }
        } else if (i == 10049) {
            if (i2 == -1) {
                this.f86382v.mo55905y(new C43993kb5(null, null, null, 7, null));
                m35051b9();
                return;
            }
            this.f86382v.mo55905y(new C44332l95(null, null, null, 7, null));
        } else {
            m35023e4().mo79819a(i, intent);
        }
    }

    @Override // p000.InterfaceC42185hY4
    public boolean onBackPressed() {
        if (this.f86315A.mo15897l().m73665a() == RideMapState.DESTINATION_SELECTION || !this.f86331Q.mo75613c4() || m35078Z3() != null || this.f86315A.mo15903f().m73665a() != RideUpdateState.NONE || this.f86361k.mo83798e().getValue().m59037c()) {
            return false;
        }
        m35124U7();
        this.f86331Q.mo75599n7();
        m35041c8();
        this.f86322H.mo55677e();
        return true;
    }

    @Override // p000.InterfaceC42185hY4
    public void onDestroy() {
        InterfaceC23465c interfaceC23465c = this.f86346c0;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
        this.f86345c.mo19543o();
        this.f86375r.mo104914d(this);
    }

    @InterfaceC40955fT5
    public void onEvent(C32879Fk6 event) {
        RideState mo75044g0;
        WireRide ride;
        Intrinsics.checkNotNullParameter(event, "event");
        WireBird bird = event.m106625b().getBird();
        if (!WireBirdKt.isBdCompatible(bird) && (mo75044g0 = this.f86347d.mo75044g0(bird)) != null && (ride = mo75044g0.getRide()) != null) {
            m34997g8(ride, event.m106625b().getLocked());
        }
    }

    @Override // p000.InterfaceC42185hY4
    public void onPause() {
        this.f86376r0 = false;
        this.f86366m0 = null;
        this.f86364l0 = null;
        this.f86368n0 = null;
    }

    @Override // p000.InterfaceC42185hY4
    public void onResume(ScopeProvider scopeProvider) {
        long j;
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        boolean z = true;
        this.f86376r0 = true;
        this.f86382v.mo55905y(new YL2(null, null, null, 7, null));
        m34824w5(scopeProvider);
        m34901p5(scopeProvider);
        m35127U4();
        Observable<Optional<View>> observeOn = this.f86331Q.mo75611di().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rideUi.tallestShowingBot…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22973X1 c22973x1 = new C22973X1();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35317B7(Function1.this, obj);
            }
        });
        Z84<List<WireBird>> mo71591R0 = this.f86351f.mo71591R0();
        if (!this.f86341a.m82623f8().m73665a().getPricingUiConfig().getEnabled()) {
            j = 4;
        } else {
            j = 0;
        }
        Observable<List<WireBird>> take = mo71591R0.delaySubscription(j, TimeUnit.SECONDS).observeOn(C23454a.m33087a()).take(1L);
        Intrinsics.checkNotNullExpressionValue(take, "birdManager.latestNearby…nThread())\n      .take(1)");
        Object m33094as2 = take.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22977Y1 c22977y1 = new C22977Y1();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: lY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35306C7(Function1.this, obj);
            }
        });
        Observable<RideUpdateState> distinctUntilChanged = this.f86315A.mo15903f().distinctUntilChanged();
        final C22984Z1 c22984z1 = new C22984Z1();
        Observable<R> switchMap = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: mY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35295D7;
                m35295D7 = C42483i25.m35295D7(Function1.this, obj);
                return m35295D7;
            }
        });
        final C22989a2 c22989a2 = C22989a2.f86519g;
        Observable observeOn2 = switchMap.map(new InterfaceC23492o() { // from class: nY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m35284E7;
                m35284E7 = C42483i25.m35284E7(Function1.this, obj);
                return m35284E7;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onResume(sc…requestNestsRefresh()\n  }");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22994b2 c22994b2 = new C22994b2();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: oY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35274F7(Function1.this, obj);
            }
        });
        m35143S8(scopeProvider);
        m35077Z4(scopeProvider);
        m34967j5(scopeProvider);
        m35330A5(scopeProvider);
        m35055b5(scopeProvider);
        m34868s5(scopeProvider);
        m34941l9();
        if (!C42149hU4.m36358a(this.f86347d.mo75057R().getValue()) || !Intrinsics.areEqual(this.f86343b.mo64002d(), IN_SERVICE_AREA.INSTANCE) || !this.f86347d.mo75030r().m73665a().getRequireRideEndPhotoToEndRide() || !this.f86379t.m37668V2()) {
            z = false;
        }
        m35283E8(z);
        this.f86331Q.mo75663Bi(false);
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(this.f86315A.mo15897l(), this.f86317C.getData(), new C22958U1());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable delaySubscription = combineLatest.delaySubscription(500L, TimeUnit.MILLISECONDS);
        final C22999c2 c22999c2 = C22999c2.f86533g;
        Observable map = delaySubscription.map(new InterfaceC23492o() { // from class: pY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m35264G7;
                m35264G7 = C42483i25.m35264G7(Function1.this, obj);
                return m35264G7;
            }
        });
        final C23004d2 c23004d2 = C23004d2.f86538g;
        Observable skipWhile = map.skipWhile(new InterfaceC23494q() { // from class: qY4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35254H7;
                m35254H7 = C42483i25.m35254H7(Function1.this, obj);
                return m35254H7;
            }
        });
        final C23008e2 c23008e2 = new C23008e2();
        Observable concatWith = skipWhile.publish(new InterfaceC23492o() { // from class: rY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35244I7;
                m35244I7 = C42483i25.m35244I7(Function1.this, obj);
                return m35244I7;
            }
        }).concatWith(Observable.just(Optional.f63040c.m59034a()));
        final C22964V1 c22964v1 = C22964V1.f86497g;
        Observable observeOn3 = concatWith.takeUntil(new InterfaceC23494q() { // from class: sY4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m35234J7;
                m35234J7 = C42483i25.m35234J7(Function1.this, obj);
                return m35234J7;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onResume(sc…requestNestsRefresh()\n  }");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22969W1 c22969w1 = new C22969W1();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: uY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35224K7(Function1.this, obj);
            }
        });
        m35273F8();
        m34920n8(scopeProvider);
        this.f86343b.mo64007T();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    @Override // p000.FU4
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo34905p1(WireRide ride, WireBird bird, DateTime operationStart) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        EnumC44987mG3 m64761f;
        ParkingNest m64762e;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(operationStart, "operationStart");
        Config m80769c = C36441Uq4.m80769c(this.f86341a, bird);
        WireRidePrice m106251a = C32972Fv0.m106251a(m80769c);
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        Boolean valueOf = Boolean.valueOf(WireBirdKt.canTreatAsBluetooth(bird, m80769c));
        Boolean valueOf2 = Boolean.valueOf(WireBirdKt.canTreatAsBluetooth(bird, m80769c));
        Boolean valueOf3 = Boolean.valueOf(bird.getCellular());
        Boolean valueOf4 = Boolean.valueOf(bird.getCellular());
        String model = bird.getModel();
        if (model == null) {
            model = "";
        }
        String str3 = model;
        String currency = this.f86341a.m82623f8().m73665a().getRideConfig().getCurrency();
        long minimumPrice = m106251a.getMinimumPrice();
        long minimumPrice2 = m106251a.getMinimumPrice();
        long includedMinutes = m106251a.getIncludedMinutes();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        double m19253i = C46880pT0.m19253i(now, operationStart);
        String partnerId = bird.getPartnerId();
        String id = ride.getId();
        boolean salesTax = m106251a.getSalesTax();
        long basePrice = m106251a.getBasePrice();
        DateTime startedAt = ride.getStartedAt();
        if (startedAt == null) {
            startedAt = new DateTime(0L);
        }
        DateTime dateTime = startedAt;
        Boolean valueOf5 = Boolean.valueOf(this.f86316B.mo21500j() instanceof C32109Cd1);
        C38435bF0 mo21502g = this.f86316B.mo21502g();
        if (mo21502g != null && (m64762e = mo21502g.m64762e()) != null) {
            str = m64762e.getId();
        } else {
            str = null;
        }
        C38435bF0 mo21502g2 = this.f86316B.mo21502g();
        if (mo21502g2 != null && (m64761f = mo21502g2.m64761f()) != null) {
            str2 = m64761f.name();
        } else {
            str2 = null;
        }
        RideState mo75038i1 = this.f86347d.mo75038i1(ride.getId());
        if (mo75038i1 != null && RideStatesKt.isPrimaryRide(mo75038i1)) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1880Ea.mo55905y(new XR4(null, null, null, valueOf, valueOf2, valueOf3, valueOf4, str3, currency, minimumPrice, minimumPrice2, includedMinutes, m19253i, partnerId, id, salesTax, basePrice, dateTime, valueOf5, str, str2, Boolean.valueOf(z), Long.valueOf(this.f86347d.mo75032o0().m73665a().getActiveRideCount()), 7, null));
        InterfaceC1880Ea interfaceC1880Ea2 = this.f86382v;
        String model2 = bird.getModel();
        double latitude = m34979i4().getLatitude();
        double longitude = m34979i4().getLongitude();
        WireRidePrice m106251a2 = C32972Fv0.m106251a(m35128U3());
        DateTime now2 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now2, "now()");
        double m19253i2 = C46880pT0.m19253i(now2, operationStart);
        boolean m35309C4 = m35309C4(ride);
        WireBird bird2 = ride.getBird();
        if (bird2 != null && bird2.getCellular()) {
            z2 = true;
        } else {
            z2 = false;
        }
        interfaceC1880Ea2.mo55956N(new RideLocked(model2, latitude, longitude, ride, m35309C4, z2, m106251a2, m19253i2));
        List<WirePhysicalLock> physicalLocks = bird.getPhysicalLocks();
        if (physicalLocks != null) {
            List<WirePhysicalLock> list = physicalLocks;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (WirePhysicalLock wirePhysicalLock : list) {
                    if (wirePhysicalLock.getPurpose() != PhysicalLockPurpose.HELMET) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        z5 = true;
                        z6 = true;
                        break;
                    }
                }
            }
            z5 = true;
            z6 = false;
            if (z6 == z5) {
                z3 = z5;
                if (z3) {
                    m34788z8(this, bird, false, null, false, false, 28, null);
                }
                if (ride.canEnd()) {
                    m35186O5(ride);
                }
                this.f86315A.mo15899j(RideUpdateState.NONE);
            }
        }
        z3 = false;
        if (z3) {
        }
        if (ride.canEnd()) {
        }
        this.f86315A.mo15899j(RideUpdateState.NONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0151  */
    /* renamed from: p4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m34902p4(WireRide wireRide, WireBird wireBird, DateTime dateTime) {
        boolean z;
        boolean z2;
        DateTime dateTime2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        wireRide.copy((r45 & 1) != 0 ? wireRide.f66754id : null, (r45 & 2) != 0 ? wireRide.distance : 0.0d, (r45 & 4) != 0 ? wireRide.birdId : null, (r45 & 8) != 0 ? wireRide.bird : wireBird, (r45 & 16) != 0 ? wireRide.birdEphemeralId : null, (r45 & 32) != 0 ? wireRide.cost : 0, (r45 & 64) != 0 ? wireRide.currency : null, (r45 & 128) != 0 ? wireRide.startedAt : null, (r45 & 256) != 0 ? wireRide.deliveryUnlockedAt : null, (r45 & 512) != 0 ? wireRide.completedAt : null, (r45 & 1024) != 0 ? wireRide.continuedAt : null, (r45 & 2048) != 0 ? wireRide.canceledAt : null, (r45 & 4096) != 0 ? wireRide.delivery : false, (r45 & 8192) != 0 ? wireRide.payAsYouGo : false, (r45 & 16384) != 0 ? wireRide.successfulTest : null, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireRide.type : null, (r45 & 65536) != 0 ? wireRide.partnerId : null, (r45 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireRide.billedMinutes : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireRide.privateBirdId : null, (r45 & 524288) != 0 ? wireRide.vehicleModel : null, (r45 & 1048576) != 0 ? wireRide.tipId : null, (r45 & 2097152) != 0 ? wireRide.startedInNoRideZone : false, (r45 & 4194304) != 0 ? wireRide.startedOutsideOperatingArea : false, (r45 & 8388608) != 0 ? wireRide.isBadAreaRideEnabled : false, (r45 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireRide.userGuestId : null, (r45 & 33554432) != 0 ? wireRide.rideDetail : null);
        RideConfig rideConfig = this.f86347d.mo75030r().m73665a().getRideConfig();
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        Boolean valueOf = Boolean.valueOf(m35309C4(wireRide));
        Boolean valueOf2 = Boolean.valueOf(m35309C4(wireRide));
        WireBird bird = wireRide.getBird();
        if (bird != null && bird.getCellular()) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf3 = Boolean.valueOf(z);
        WireBird bird2 = wireRide.getBird();
        if (bird2 != null && bird2.getCellular()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean valueOf4 = Boolean.valueOf(z2);
        String model = wireBird.getModel();
        if (model == null) {
            model = "";
        }
        String str = model;
        String currency = rideConfig.getCurrency();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long minutePrice = rideConfig.getMinutePrice();
        long includedMinutes = rideConfig.getIncludedMinutes();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        double m19253i = C46880pT0.m19253i(now, dateTime);
        String partnerId = wireBird.getPartnerId();
        String id = wireRide.getId();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice = rideConfig.getBasePrice();
        DateTime startedAt = wireRide.getStartedAt();
        if (startedAt == null) {
            dateTime2 = dateTime;
        } else {
            dateTime2 = startedAt;
        }
        RideState mo75038i1 = this.f86347d.mo75038i1(wireRide.getId());
        if (mo75038i1 != null && RideStatesKt.isPrimaryRide(mo75038i1)) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC1880Ea.mo55905y(new C37782a85(null, null, null, valueOf, valueOf2, valueOf3, valueOf4, str, currency, minimumRidePrice, minutePrice, includedMinutes, m19253i, partnerId, id, applyTax, basePrice, dateTime2, Boolean.valueOf(z3), Long.valueOf(this.f86347d.mo75032o0().m73665a().getActiveRideCount()), 7, null));
        this.f86330P.removeRoute();
        List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
        if (physicalLocks != null) {
            List<WirePhysicalLock> list = physicalLocks;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (WirePhysicalLock wirePhysicalLock : list) {
                    if (wirePhysicalLock.getPurpose() != PhysicalLockPurpose.HELMET) {
                        z5 = true;
                        continue;
                    } else {
                        z5 = false;
                        continue;
                    }
                    if (z5) {
                        z6 = true;
                        z7 = true;
                        break;
                    }
                }
            }
            z6 = true;
            z7 = false;
            if (z7 == z6) {
                z4 = z6;
                if (z4) {
                    m34788z8(this, wireBird, true, null, false, false, 28, null);
                }
                this.f86315A.mo15899j(RideUpdateState.NONE);
            }
        }
        z4 = false;
        if (z4) {
        }
        this.f86315A.mo15899j(RideUpdateState.NONE);
    }

    /* renamed from: p5 */
    public final void m34901p5(ScopeProvider scopeProvider) {
        Observable observeOn = C37279Yf5.m74576S(this.f86347d.mo75029s0()).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "rideManager.rideActionRe…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22948T c22948t = new C22948T();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: AZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34890q5(Function1.this, obj);
            }
        };
        final C22956U c22956u = C22956U.f86489b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: BZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34879r5(Function1.this, obj);
            }
        });
    }

    /* renamed from: q4 */
    public final void m34891q4() {
        Observable m74575T = C37279Yf5.m74575T(C24523e.f91168a.m31955b(this.f86315A.mo15897l(), this.f86361k.mo83798e(), this.f86351f.mo71591R0()), C23054o.f86591g);
        final C23058p c23058p = new C23058p();
        Observable observeOn = m74575T.doOnNext(new InterfaceC23484g() { // from class: DY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34880r4(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun initBirdsNea…      }, (Timber::e))\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23063q c23063q = new C23063q();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: FY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34869s4(Function1.this, obj);
            }
        };
        final C23067r c23067r = C23067r.f86603b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: GY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34858t4(Function1.this, obj);
            }
        });
    }

    /* renamed from: q9 */
    public final boolean m34886q9() {
        return this.f86361k.mo83798e().getValue().m59037c() && this.f86347d.mo75030r().m73665a().getRideConfig().getEnableScanlessReservedRideStart();
    }

    /* renamed from: r3 */
    public final boolean m34881r3() {
        return m35078Z3() != null && this.f86343b.mo63994v().getValue().m59037c() && (this.f86343b.mo64002d() instanceof IN_RESTRICTED_PARKING_AREA);
    }

    /* renamed from: r8 */
    public final boolean m34876r8(WireBird wireBird) {
        WirePrivateBird wirePrivateBird;
        if (wireBird != null) {
            wirePrivateBird = wireBird.getPrivateBird();
        } else {
            wirePrivateBird = null;
        }
        if (wirePrivateBird == null && Intrinsics.areEqual(C36441Uq4.m80769c(this.f86341a, wireBird).getRequestEndRidePhoto(), Boolean.TRUE) && !C36441Uq4.m80769c(this.f86341a, wireBird).getRequireRideEndPhotoToEndRide()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
        if (r11 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
        if (r13 == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    /* renamed from: r9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BirdClusterItemState m34875r9(FH3 fh3) {
        List listOf;
        LocationAreaState locationAreaState;
        Area m59035e;
        boolean z;
        String str;
        WireRide ride;
        C32109Cd1 c32109Cd1;
        boolean z2;
        boolean z3;
        EnumC44987mG3 enumC44987mG3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        AreaIconType areaIconType;
        boolean z10;
        ParkingNest m64762e;
        Integer availableParkingCapacity;
        Object firstOrNull;
        boolean enableAreaSpecificRiderBarMessages = m35118V3(fh3.mo11123d()).getEnableAreaSpecificRiderBarMessages();
        boolean areEqual = Intrinsics.areEqual(fh3.mo11122e(), IN_SLOW_AREA.INSTANCE);
        IN_NO_RIDE_NO_PARK_AREA in_no_ride_no_park_area = IN_NO_RIDE_NO_PARK_AREA.INSTANCE;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RiderAreaState[]{IN_NO_RIDE_AREA.INSTANCE, in_no_ride_no_park_area});
        boolean contains = listOf.contains(fh3.mo11122e());
        boolean areEqual2 = Intrinsics.areEqual(fh3.mo11122e(), OUTSIDE_SERVICE_AREA.INSTANCE);
        boolean areEqual3 = Intrinsics.areEqual(fh3.mo11122e(), in_no_ride_no_park_area);
        boolean areEqual4 = Intrinsics.areEqual(fh3.mo11122e(), IN_SLOW_NO_PARK_AREA.INSTANCE);
        boolean areEqual5 = Intrinsics.areEqual(fh3.mo11122e(), IN_NO_PARKING_AREA.INSTANCE);
        String mo11123d = fh3.mo11123d();
        AreaIconType areaIconType2 = null;
        if (mo11123d != null) {
            locationAreaState = this.f86343b.mo63998h().m73665a().get(mo11123d);
        } else {
            locationAreaState = null;
        }
        if (locationAreaState != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(locationAreaState.getWarningAreas());
            String str2 = (String) firstOrNull;
            if (str2 != null) {
                m59035e = locationAreaState.getAreasWithin().get(str2);
            } else {
                m59035e = null;
            }
        }
        m59035e = this.f86343b.mo63992x().getValue().m59035e();
        if (m59035e != null) {
            if (fh3.mo11123d() != null) {
                String mo11123d2 = fh3.mo11123d();
                RideState m59035e2 = this.f86347d.mo75057R().m73665a().m59035e();
                if (m59035e2 != null && (ride = m59035e2.getRide()) != null) {
                    str = ride.getId();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(mo11123d2, str)) {
                    z = false;
                }
            }
            z = true;
        }
        m59035e = null;
        if (fh3 instanceof C32109Cd1) {
            c32109Cd1 = (C32109Cd1) fh3;
        } else {
            c32109Cd1 = null;
        }
        if (c32109Cd1 != null && c32109Cd1.m111966i()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((fh3 instanceof C33971Kc0) && ((C33971Kc0) fh3).m98692g()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C38435bF0 mo11124c = fh3.mo11124c();
        if (mo11124c != null) {
            enumC44987mG3 = mo11124c.m64761f();
        } else {
            enumC44987mG3 = null;
        }
        if (enumC44987mG3 == EnumC44987mG3.CLOSE) {
            C38435bF0 mo11124c2 = fh3.mo11124c();
            if (mo11124c2 != null && (m64762e = mo11124c2.m64762e()) != null && (availableParkingCapacity = m64762e.getAvailableParkingCapacity()) != null && availableParkingCapacity.intValue() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z4 = true;
                if (m59035e == null && C23356io.m33480b(m59035e) && enableAreaSpecificRiderBarMessages) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (m59035e != null) {
                        areaIconType = m59035e.getRiderBarInRideMessageIconType();
                    } else {
                        areaIconType = null;
                    }
                    if (areaIconType == AreaIconType.WARNING_RED) {
                        z6 = true;
                        if (z5) {
                            if (m59035e != null) {
                                areaIconType2 = m59035e.getRiderBarInRideMessageIconType();
                            }
                            if (areaIconType2 == AreaIconType.WARNING_YELLOW) {
                                z7 = true;
                                if (areEqual5 && !m34865s8()) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (this.f86348d0.getValue() != ParkingType.PREFERRED_PARKING) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (!z2) {
                                    return BirdClusterItemState.ACTIVE_RIDE_IN_FULL_NEST;
                                }
                                if (z4) {
                                    return BirdClusterItemState.ACTIVE_RIDE_NEAR_PARKING_NEST;
                                }
                                if (z3) {
                                    return BirdClusterItemState.ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST;
                                }
                                if (areEqual3) {
                                    return BirdClusterItemState.ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA;
                                }
                                if (areEqual4) {
                                    return BirdClusterItemState.ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA;
                                }
                                if (z8) {
                                    return BirdClusterItemState.ACTIVE_RIDE_IN_NO_PARK_AREA;
                                }
                                if (!contains && !areEqual2) {
                                    if (areEqual) {
                                        return BirdClusterItemState.ACTIVE_RIDE_IN_SLOW_AREA;
                                    }
                                    if (z6) {
                                        return BirdClusterItemState.ACTIVE_RIDE_IN_WARNING_RED_AREA;
                                    }
                                    if (z7) {
                                        return BirdClusterItemState.ACTIVE_RIDE_IN_WARNING_YELLOW_AREA;
                                    }
                                    if (z9) {
                                        return BirdClusterItemState.ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST;
                                    }
                                    return BirdClusterItemState.ACTIVE_RIDE;
                                }
                                return BirdClusterItemState.ACTIVE_RIDE_IN_NO_RIDE_AREA;
                            }
                        }
                        z7 = false;
                        if (areEqual5) {
                        }
                        z8 = true;
                        if (this.f86348d0.getValue() != ParkingType.PREFERRED_PARKING) {
                        }
                        if (!z2) {
                        }
                    }
                }
                z6 = false;
                if (z5) {
                }
                z7 = false;
                if (areEqual5) {
                }
                z8 = true;
                if (this.f86348d0.getValue() != ParkingType.PREFERRED_PARKING) {
                }
                if (!z2) {
                }
            }
        }
        z4 = false;
        if (m59035e == null) {
        }
        z5 = false;
        if (z5) {
        }
        z6 = false;
        if (z5) {
        }
        z7 = false;
        if (areEqual5) {
        }
        z8 = true;
        if (this.f86348d0.getValue() != ParkingType.PREFERRED_PARKING) {
        }
        if (!z2) {
        }
    }

    @Override // p000.FU4
    public void removeRoute() {
        this.f86330P.removeRoute();
    }

    /* renamed from: s3 */
    public final void m34870s3() {
        Object m33135e = this.f86347d.mo75042h().m33135e(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23001d c23001d = new C23001d();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: WY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34859t3(Function1.this, obj);
            }
        });
    }

    /* renamed from: s5 */
    public final void m34868s5(ScopeProvider scopeProvider) {
        Observable<List<RidePassView>> observeOn = this.f86321G.mo55504D0().observeOn(C23454a.m33087a());
        final C22960V c22960v = new C22960V();
        Observable<R> flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: CZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m34857t5;
                m34857t5 = C42483i25.m34857t5(Function1.this, obj);
                return m34857t5;
            }
        });
        final C22966W c22966w = new C22966W();
        Observable doOnNext = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: DZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34846u5(Function1.this, obj);
            }
        });
        final C22971X c22971x = C22971X.f86503g;
        Observable retry = doOnNext.doOnError(new InterfaceC23484g() { // from class: EZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34835v5(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun observeRideP…r)\n      .subscribe()\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: s8 */
    public final boolean m34865s8() {
        boolean z;
        Config m73665a = this.f86347d.mo75030r().m73665a();
        if (!m73665a.getParkingConfig().getEnableRiderParkingNestAnnotation() || !m73665a.getEnforceNoParkingV0() || !m73665a.getParkingConfig().getEnableNoParkZoneNoEndRideButton() || !C42149hU4.m36358a(this.f86347d.mo75057R().getValue())) {
            return false;
        }
        RiderAreaState mo64002d = this.f86343b.mo64002d();
        if (mo64002d != null && RiderAreaStateKt.isInNoRideOrNoParkArea(mo64002d)) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f86316B.mo21502g() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: s9 */
    public final void m34864s9(List<WireBird> list, String str) {
        int collectionSizeOrDefault;
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        double m35158R3 = m35158R3(list, this.f86355h.mo43616p().m73665a());
        List<Area> value = this.f86343b.mo64001e().getValue();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : value) {
            arrayList.add(area.getId());
        }
        interfaceC1880Ea.mo55905y(new L95(null, null, null, m35158R3, null, null, null, arrayList, str, Boolean.valueOf(UserKt.isInRegistration(this.f86379t.m37750B0())), Long.valueOf(this.f86347d.mo75032o0().m73665a().getActiveRideCount()), 87, null));
    }

    /* renamed from: t8 */
    public final boolean m34854t8(WireBird wireBird) {
        WirePrivateBird wirePrivateBird;
        List<WirePhysicalLock> physicalLocks;
        Object firstOrNull;
        WirePhysicalLock wirePhysicalLock = null;
        if (wireBird != null) {
            wirePrivateBird = wireBird.getPrivateBird();
        } else {
            wirePrivateBird = null;
        }
        if (wirePrivateBird == null) {
            if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                wirePhysicalLock = (WirePhysicalLock) firstOrNull;
            }
            if (wirePhysicalLock != null && C36441Uq4.m80769c(this.f86341a, wireBird).getEnablePhysicalLockPhotoConfirmation() && !C36441Uq4.m80769c(this.f86341a, wireBird).getRequireRideEndPhotoToEndRide()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t9 */
    public final void m34853t9(WireRide ride) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        C41318g46.m40151m("ride: lock: false", new Object[0]);
        this.f86315A.mo15899j(RideUpdateState.LOCKING);
        DateTime now = DateTime.now();
        AbstractC23442F<WireBird> m33152N = this.f86347d.mo75036k0(ride, false).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "rideManager.lockRide(rid…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22990a3 c22990a3 = new C22990a3(ride, now);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: yZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34842u9(Function1.this, obj);
            }
        };
        final C22995b3 c22995b3 = new C22995b3(ride, now);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: zZ4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34831v9(Function1.this, obj);
            }
        });
    }

    /* renamed from: u3 */
    public final void m34848u3() {
        DQ3.request$default(this.f86334T, Permission.ACCESS_FINE_LOCATION, new C23005e(), null, 4, null);
    }

    /* renamed from: u4 */
    public final void m34847u4() {
        Object lockObservable;
        if (m34990h4()) {
            Z84<Optional<RideState>> mo75034m0 = this.f86347d.mo75034m0();
            final C23083v c23083v = C23083v.f86619g;
            lockObservable = mo75034m0.map(new InterfaceC23492o() { // from class: e25
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m34836v4;
                    m34836v4 = C42483i25.m34836v4(Function1.this, obj);
                    return m34836v4;
                }
            });
        } else {
            lockObservable = this.f86365m.mo21402e();
        }
        C24523e c24523e = C24523e.f91168a;
        Intrinsics.checkNotNullExpressionValue(lockObservable, "lockObservable");
        Z84<RideStates> mo75032o0 = this.f86347d.mo75032o0();
        final C23071s c23071s = C23071s.f86607g;
        Observable distinctUntilChanged = mo75032o0.map(new InterfaceC23492o() { // from class: f25
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m34825w4;
                m34825w4 = C42483i25.m34825w4(Function1.this, obj);
                return m34825w4;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "rideManager.rideStates.m… }.distinctUntilChanged()");
        Observable observeOn = c24523e.m31956a(lockObservable, distinctUntilChanged).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23075t c23075t = new C23075t();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: g25
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34814x4(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f86331Q.mo75652Fa().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "rideUi.physicalLockButto…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23079u c23079u = new C23079u();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: jY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34803y4(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r1 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: u8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m34843u8(List<WireCoupon> list) {
        boolean z;
        boolean z2;
        Object first;
        Integer remainingSeconds;
        int reservePromoOfferDuration;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Set<String> m37753A1 = this.f86379t.m37753A1();
        List<WireCoupon> list2 = list;
        boolean z7 = list2 instanceof Collection;
        boolean z8 = true;
        if (!z7 || !list2.isEmpty()) {
            for (WireCoupon wireCoupon : list2) {
                if (!m37753A1.contains(wireCoupon.getId())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            if (this.f86341a.m82623f8().m73665a().getReservationConfig().getEnableReservePromoOnLowBatteryCancelledRide()) {
                if (!z7 || !list2.isEmpty()) {
                    for (WireCoupon wireCoupon2 : list2) {
                        if (wireCoupon2.getKind() == CouponKind.FREE_RESERVE) {
                            z5 = true;
                            continue;
                        } else {
                            z5 = false;
                            continue;
                        }
                        if (z5) {
                            z6 = true;
                            break;
                        }
                    }
                }
                z6 = false;
                if (z6) {
                    z2 = true;
                    if (this.f86341a.m82623f8().m73665a().getRideConfig().getEnableFreeUnlockAfterLowBatteryRide()) {
                        if (!z7 || !list2.isEmpty()) {
                            for (WireCoupon wireCoupon3 : list2) {
                                if (wireCoupon3.getKind() == CouponKind.FREE_UNLOCK) {
                                    z3 = true;
                                    continue;
                                } else {
                                    z3 = false;
                                    continue;
                                }
                                if (z3) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                    }
                    z8 = false;
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
                    remainingSeconds = WireCouponKt.remainingSeconds((WireCoupon) first);
                    if (remainingSeconds == null) {
                        reservePromoOfferDuration = remainingSeconds.intValue();
                    } else {
                        reservePromoOfferDuration = this.f86341a.m82623f8().m73665a().getReservationConfig().getReservePromoOfferDuration();
                    }
                    if (reservePromoOfferDuration <= 0) {
                        String m4401k = C51916xx1.f118396a.m4401k(this.f86329O, this.f86341a.m82623f8().m73665a().getReservationConfig().getReservePromoOfferDuration() / 60, false);
                        C23101y2 c23101y2 = new C23101y2(list);
                        if (z2 && z8) {
                            this.f86331Q.mo75627X6(m4401k, c23101y2);
                            return;
                        } else if (z2) {
                            this.f86331Q.mo75638Pi(m4401k, c23101y2);
                            return;
                        } else if (z8) {
                            this.f86331Q.mo75600n3(m4401k, c23101y2);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
            }
            z2 = false;
            if (this.f86341a.m82623f8().m73665a().getRideConfig().getEnableFreeUnlockAfterLowBatteryRide()) {
            }
            z8 = false;
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
            remainingSeconds = WireCouponKt.remainingSeconds((WireCoupon) first);
            if (remainingSeconds == null) {
            }
            if (reservePromoOfferDuration <= 0) {
            }
        }
    }

    @Deprecated(message = "Please use the checkPreScanPermissionsRelay instead to trigger a call of this stream")
    /* renamed from: v3 */
    public final AbstractC23461c m34837v3() {
        AbstractC23442F<FQ3> m110485l = this.f86334T.m110485l(Permission.CAMERA);
        final C23009f c23009f = C23009f.f86543g;
        AbstractC23442F<FQ3> m33101w = m110485l.m33101w(new InterfaceC23484g() { // from class: e15
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34826w3(Function1.this, obj);
            }
        });
        final C23013g c23013g = C23013g.f86547g;
        AbstractC23461c m33049i = m33101w.m33098z(new InterfaceC23494q() { // from class: p15
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m34815x3;
                m34815x3 = C42483i25.m34815x3(Function1.this, obj);
                return m34815x3;
            }
        }).m32069F().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: A15
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m34804y3;
                m34804y3 = C42483i25.m34804y3(C42483i25.this);
                return m34804y3;
            }
        })).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: L15
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m35332A3;
                m35332A3 = C42483i25.m35332A3(C42483i25.this);
                return m35332A3;
            }
        })).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: W15
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m35310C3;
                m35310C3 = C42483i25.m35310C3(C42483i25.this);
                return m35310C3;
            }
        })).m33070P(C23454a.m33087a()).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: h25
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m35288E3;
                m35288E3 = C42483i25.m35288E3(C42483i25.this);
                return m35288E3;
            }
        })).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: tY4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m35278F3;
                m35278F3 = C42483i25.m35278F3(C42483i25.this);
                return m35278F3;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i, "permissionManager.reques….ignoreElement()\n      })");
        return m33049i;
    }

    /* renamed from: v8 */
    public final void m34832v8(Intent intent) {
        boolean z = false;
        if (intent.getBooleanExtra("show_bird_plus_screen", false)) {
            BirdPlusConfig birdPlus = this.f86341a.m82623f8().m73665a().getBirdPlus();
            if (birdPlus != null) {
                z = Intrinsics.areEqual(birdPlus.getEnabled(), Boolean.TRUE);
            }
            if (z) {
                String stringExtra = intent.getStringExtra("bird_plus_subscription_plan_id");
                if (stringExtra != null) {
                    InterfaceC40099e13.C19924a.goToBirdPlusDetails$default(this.f86333S, null, stringExtra, null, 5, null);
                } else {
                    InterfaceC40099e13.C19924a.goToBirdPlus$default(this.f86333S, null, 1, null);
                }
            }
        }
    }

    /* renamed from: w5 */
    public final void m34824w5(ScopeProvider scopeProvider) {
        C24523e c24523e = C24523e.f91168a;
        Observable<RideStates> startWith = this.f86347d.mo75032o0().startWith((Z84<RideStates>) this.f86347d.mo75032o0().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith, "rideManager.rideStates.s…rideManager.rideStates())");
        Observable<Optional<Reservation>> startWith2 = this.f86361k.mo83798e().startWith((Z84<Optional<Reservation>>) this.f86361k.mo83798e().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith2, "reservationManager.reser…ionManager.reservation())");
        Observable<Optional<WireBird>> startWith3 = this.f86315A.mo15900i().startWith((Z84<Optional<WireBird>>) this.f86315A.mo15900i().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith3, "rideMapStateManager.focu…ateManager.focusedBird())");
        Observable<RideUpdateState> startWith4 = this.f86315A.mo15903f().startWith((Z84<RideUpdateState>) this.f86315A.mo15903f().m73665a());
        Intrinsics.checkNotNullExpressionValue(startWith4, "rideMapStateManager.ride…ger.rideStatusUpdating())");
        Observable<FH3> startWith5 = this.f86316B.mo21501i().startWith((Observable<FH3>) this.f86316B.mo21500j());
        Intrinsics.checkNotNullExpressionValue(startWith5, "parkingManager.parkingSt…ger.currentParkingStatus)");
        Observable combineLatest = Observable.combineLatest(startWith, startWith2, startWith3, startWith4, startWith5, new C22975Y());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        Observable distinctUntilChanged = combineLatest.observeOn(C24542a.m31934a()).distinctUntilChanged();
        final C22982Z c22982z = new C22982Z();
        Observable distinctUntilChanged2 = distinctUntilChanged.map(new InterfaceC23492o() { // from class: q05
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m34813x5;
                m34813x5 = C42483i25.m34813x5(Function1.this, obj);
                return m34813x5;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "private fun observeRideS…ored out!!\")\n      })\n  }");
        Observable observeOn = C37279Yf5.m74549j0(distinctUntilChanged2, 2, true).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun observeRideS…ored out!!\")\n      })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22987a0 c22987a0 = new C22987a0();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: r05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34802y5(Function1.this, obj);
            }
        };
        final C22992b0 c22992b0 = C22992b0.f86525g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: s05
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m34791z5(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* renamed from: w8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m34821w8(List<WireCoupon> list, WireRideDetail wireRideDetail, WireBird wireBird) {
        boolean z;
        Object first;
        Integer remainingSeconds;
        int reservePromoOfferDuration;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (this.f86341a.m82623f8().m73665a().getReservationConfig().getEnableReservePromoOnCancelledRide()) {
            List<WireCoupon> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (WireCoupon wireCoupon : list2) {
                    if (wireCoupon.getKind() == CouponKind.FREE_RESERVE) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            if (z5) {
                z = true;
                if (this.f86341a.m82623f8().m73665a().getRideConfig().getEnableFreeUnlockAfterCancelledRide()) {
                    List<WireCoupon> list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (WireCoupon wireCoupon2 : list3) {
                            if (wireCoupon2.getKind() == CouponKind.FREE_UNLOCK) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                }
                z6 = false;
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
                remainingSeconds = WireCouponKt.remainingSeconds((WireCoupon) first);
                if (remainingSeconds == null) {
                    reservePromoOfferDuration = remainingSeconds.intValue();
                } else {
                    reservePromoOfferDuration = this.f86347d.mo75030r().m73665a().getReservationConfig().getReservePromoOfferDuration();
                }
                if (reservePromoOfferDuration <= 0) {
                    String m4401k = C51916xx1.f118396a.m4401k(this.f86329O, this.f86347d.mo75030r().m73665a().getReservationConfig().getReservePromoOfferDuration() / 60, false);
                    if (z && z6) {
                        this.f86331Q.mo75660Cg(m4401k);
                        return;
                    } else if (z) {
                        this.f86331Q.mo75655E2(m4401k);
                        return;
                    } else if (z6) {
                        this.f86331Q.mo75606k5(m4401k);
                        return;
                    } else {
                        m35223K8(wireRideDetail, wireBird);
                        return;
                    }
                }
                m35223K8(wireRideDetail, wireBird);
                return;
            }
        }
        z = false;
        if (this.f86341a.m82623f8().m73665a().getRideConfig().getEnableFreeUnlockAfterCancelledRide()) {
        }
        z6 = false;
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
        remainingSeconds = WireCouponKt.remainingSeconds((WireCoupon) first);
        if (remainingSeconds == null) {
        }
        if (reservePromoOfferDuration <= 0) {
        }
    }

    /* renamed from: w9 */
    public final void m34820w9(C37772a75 c37772a75, C37772a75 c37772a752) {
        String str;
        String str2;
        EnumC44987mG3 m64761f;
        ParkingNest m64762e;
        RideState m71870g;
        boolean z = false;
        if (c37772a752 != null && (m71870g = c37772a752.m71870g()) != null && RideStateKt.isInRide(m71870g)) {
            z = true;
        }
        if (z && c37772a75 != null && c37772a75.m71869h() != c37772a752.m71869h()) {
            C38435bF0 mo21502g = this.f86316B.mo21502g();
            InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
            boolean z2 = !c37772a752.m71869h();
            if (mo21502g != null && (m64762e = mo21502g.m64762e()) != null) {
                str = m64762e.getId();
            } else {
                str = null;
            }
            if (mo21502g != null && (m64761f = mo21502g.m64761f()) != null) {
                str2 = m64761f.name();
            } else {
                str2 = null;
            }
            interfaceC1880Ea.mo55905y(new C51599xQ4(null, null, null, z2, str, str2, 7, null));
        }
    }

    /* renamed from: x7 */
    public void m34811x7() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Location m73665a = this.f86355h.mo43616p().m73665a();
        InterfaceC1880Ea interfaceC1880Ea = this.f86382v;
        List<Area> m73665a2 = this.f86343b.mo64001e().m73665a();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m73665a2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : m73665a2) {
            arrayList.add(area.getId());
        }
        List<Area> value = this.f86343b.mo64001e().getValue();
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (Area area2 : value) {
            arrayList2.add(Double.valueOf(Seconds.secondsBetween(this.f86343b.mo64011O().getValue().get(area2), DateTime.now()).getSeconds()));
        }
        double latitude = m73665a.getLatitude();
        double longitude = m73665a.getLongitude();
        double accuracy = m73665a.getAccuracy();
        interfaceC1880Ea.mo55905y(new C32788Fa5(null, null, null, arrayList, arrayList2, Double.valueOf(latitude), Double.valueOf(longitude), null, Double.valueOf(m73665a.getSpeed()), Double.valueOf(m73665a.getAltitude()), Double.valueOf(accuracy), null, Boolean.valueOf(this.f86347d.mo75057R().m73665a().m59037c()), Long.valueOf(this.f86347d.mo75032o0().m73665a().getActiveRideCount()), 7, null));
        this.f86331Q.mo75585vg();
    }

    /* renamed from: x8 */
    public final void m34810x8(List<Area> list) {
        if (m35128U3().getEnablePreferredParkingV0()) {
            ParkingType mo64013J = this.f86343b.mo64013J(list, m34979i4());
            m35294D8(mo64013J);
            this.f86348d0.onNext(mo64013J);
        }
    }

    /* renamed from: x9 */
    public final void m34809x9() {
        Observable m31956a = C24523e.f91168a.m31956a(this.f86353g.mo18213a(), this.f86347d.mo75057R());
        final C23000c3 c23000c3 = C23000c3.f86534g;
        Observable map = m31956a.map(new InterfaceC23492o() { // from class: cZ4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                O12 m34798y9;
                m34798y9 = C42483i25.m34798y9(Function1.this, obj);
                return m34798y9;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates…te.None\n        }\n      }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f86354g0);
    }

    /* renamed from: y7 */
    public final void m34800y7(final WireBird wireBird, boolean z) {
        final boolean z2;
        m35056b4().mo7221o("onPrivateBirdScanned(" + wireBird + ")", new Object[0]);
        if (z && !WireBirdKt.isBirdBike(wireBird) && !WireBirdKt.isBirdFlex(wireBird)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f86386z.mo72985b(wireBird.getId())) {
            m35056b4().mo7221o("navigating to owned bird details", new Object[0]);
            this.f86377s.post(new Runnable() { // from class: v05
                @Override // java.lang.Runnable
                public final void run() {
                    C42483i25.m34789z7(C42483i25.this, wireBird, z2);
                }
            });
            return;
        }
        m35056b4().mo7221o("Navigating to private bird presenter", new Object[0]);
        this.f86338X.mo40105a(wireBird, true);
        this.f86377s.post(new Runnable() { // from class: w05
            @Override // java.lang.Runnable
            public final void run() {
                C42483i25.m35328A7(C42483i25.this, wireBird);
            }
        });
    }

    /* renamed from: y8 */
    public final boolean m34799y8(WireBird wireBird, boolean z, Integer num, boolean z2, boolean z3) {
        WirePhysicalLock wirePhysicalLock;
        List<WirePhysicalLock> physicalLocks;
        Object firstOrNull;
        List<WirePhysicalLock> physicalLocks2;
        Object firstOrNull2;
        WirePrivateBird wirePrivateBird;
        boolean z4;
        List<WirePhysicalLock> physicalLocks3;
        boolean z5;
        boolean z6 = false;
        if (z) {
            if (wireBird != null && (physicalLocks3 = wireBird.getPhysicalLocks()) != null) {
                List<WirePhysicalLock> list = physicalLocks3;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (WirePhysicalLock wirePhysicalLock2 : list) {
                        if (!wirePhysicalLock2.isOptional()) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                if (!z5) {
                    z4 = true;
                    if (!z4 && m35138T3(wireBird).getLeaseConfig().getLeaseTypes().getHelmet().getEnabled()) {
                        return false;
                    }
                }
            }
            z4 = false;
            if (!z4) {
                return false;
            }
        }
        Boolean bool = null;
        if (!z2) {
            if (wireBird != null) {
                wirePrivateBird = wireBird.getPrivateBird();
            } else {
                wirePrivateBird = null;
            }
            if (wirePrivateBird != null) {
                this.f86350e0.onNext(Boolean.FALSE);
                return m35327A8(wireBird, z, num, z3);
            }
        }
        if (wireBird != null && (physicalLocks2 = wireBird.getPhysicalLocks()) != null) {
            firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks2);
            WirePhysicalLock wirePhysicalLock3 = (WirePhysicalLock) firstOrNull2;
            if (wirePhysicalLock3 != null && wirePhysicalLock3.isOptional()) {
                z6 = true;
            }
        }
        if (z6) {
            return m35327A8(wireBird, z, num, z3);
        }
        InterfaceC40099e13 interfaceC40099e13 = this.f86333S;
        if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
            wirePhysicalLock = (WirePhysicalLock) firstOrNull;
        } else {
            wirePhysicalLock = null;
        }
        if (wireBird != null) {
            bool = Boolean.valueOf(WireBirdKt.isCruiserModel(wireBird));
        }
        boolean goToPhysicalLockIfEnabled$default = InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(interfaceC40099e13, wirePhysicalLock, z, num, null, z2, bool, 8, null);
        if (goToPhysicalLockIfEnabled$default) {
            this.f86350e0.onNext(Boolean.valueOf(!z));
        }
        return goToPhysicalLockIfEnabled$default;
    }

    /* renamed from: z4 */
    public final void m34792z4() {
        C37791a94<Optional<C22991b>> c37791a94 = this.f86370o0;
        final C23087w c23087w = C23087w.f86623g;
        Observable observeOn = c37791a94.switchMap(new InterfaceC23492o() { // from class: XY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m35331A4;
                m35331A4 = C42483i25.m35331A4(Function1.this, obj);
                return m35331A4;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "potentialDeeplinkBirdFal…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f86328N));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23092x c23092x = new C23092x();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42483i25.m35320B4(Function1.this, obj);
            }
        });
    }

    /* renamed from: z9 */
    public final void m34787z9(WireBird wireBird) {
        String partnerId;
        MobilePartner mobilePartner;
        Unit unit = null;
        if (wireBird != null && (partnerId = wireBird.getPartnerId()) != null && (mobilePartner = this.f86357i.mo97372A().getValue().get(partnerId)) != null) {
            this.f86379t.m37629e2(mobilePartner.getDisplayName());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f86379t.m37629e2("Bird");
        }
    }

    @Override // p000.FU4
    public void zoomTo(final Location location, final Float f) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f86377s.postDelayed(new Runnable() { // from class: n05
            @Override // java.lang.Runnable
            public final void run() {
                C42483i25.m35304C9(C42483i25.this, location, f);
            }
        }, 500L);
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012 \u0010\u0003\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00070\u00070\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "Lco/bird/android/model/RideUpdateState;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$D0 */
    /* loaded from: classes2.dex */
    public static final class C22878D0 extends Lambda implements Function1<Pair<? extends Optional<RideState>, ? extends RideUpdateState>, Boolean> {

        /* renamed from: g */
        public static final C22878D0 f86402g = new C22878D0();

        public C22878D0() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Optional<RideState>, ? extends RideUpdateState> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(C42149hU4.m36358a(pair.component1()) || pair.component2() != RideUpdateState.NONE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Optional<RideState>, ? extends RideUpdateState> pair) {
            return invoke2((Pair<Optional<RideState>, ? extends RideUpdateState>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireCoupon;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$N */
    /* loaded from: classes2.dex */
    public static final class C22919N extends Lambda implements Function1<Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>>, Boolean> {

        /* renamed from: g */
        public static final C22919N f86450g = new C22919N();

        public C22919N() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Optional<WireCoupon>, Optional<WireCoupon>> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<WireCoupon> component2 = pair.component2();
            WireCoupon m59035e = pair.component1().m59035e();
            CouponOrigin origin = m59035e != null ? m59035e.getOrigin() : null;
            CouponOrigin couponOrigin = CouponOrigin.LOW_BATTERY_RIDE;
            if (origin != couponOrigin) {
                WireCoupon m59035e2 = component2.m59035e();
                if ((m59035e2 != null ? m59035e2.getOrigin() : null) != couponOrigin) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Optional<WireCoupon>, ? extends Optional<WireCoupon>> pair) {
            return invoke2((Pair<Optional<WireCoupon>, Optional<WireCoupon>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$E */
    /* loaded from: classes2.dex */
    public static final class C22881E extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C22881E f86405g = new C22881E();

        public C22881E() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = pair.component1().booleanValue();
            boolean booleanValue2 = pair.component2().booleanValue();
            boolean z = false;
            C41318g46.m40163a("maybeUpdateSurroundingAreasAndNests will continue if " + booleanValue + " and " + booleanValue2, new Object[0]);
            if (booleanValue && booleanValue2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            return invoke2((Pair<Boolean, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/RideMapState;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Reservation;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$m2 */
    /* loaded from: classes2.dex */
    public static final class C23044m2 extends Lambda implements Function1<Pair<? extends RideMapState, ? extends Optional<Reservation>>, Boolean> {

        /* renamed from: g */
        public static final C23044m2 f86581g = new C23044m2();

        public C23044m2() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends RideMapState, Optional<Reservation>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            RideMapState component1 = pair.component1();
            Optional<Reservation> component2 = pair.component2();
            boolean z = false;
            C41318g46.m40157g("shouldPollBirdsNearby will be true if rideMapState is NONE (" + component1 + ") and reservation is not present (isPresent = " + component2.m59037c(), new Object[0]);
            if (component1 == RideMapState.NONE && !component2.m59037c()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends RideMapState, ? extends Optional<Reservation>> pair) {
            return invoke2((Pair<? extends RideMapState, Optional<Reservation>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/RideStates;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: i25$A0 */
    /* loaded from: classes2.dex */
    public static final class C22866A0 extends Lambda implements Function1<Pair<? extends Optional<WireBird>, ? extends RideStates>, Boolean> {
        public C22866A0() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Optional<WireBird>, RideStates> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            RideStates component2 = pair.component2();
            WireBird m59035e = pair.component1().m59035e();
            return Boolean.valueOf(C36441Uq4.m80769c(C42483i25.this.f86341a, m59035e).getPricingUiConfig().getFlightBarPricing().getShowRidePriceInBanners() && m59035e != null && component2.getActiveRideCount() == 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Optional<WireBird>, ? extends RideStates> pair) {
            return invoke2((Pair<Optional<WireBird>, RideStates>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LXl5;", "LTk5;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$83\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"})
    /* renamed from: i25$P1 */
    /* loaded from: classes2.dex */
    public static final class C22931P1 extends Lambda implements Function1<Pair<? extends C37099Xl5, ? extends C36154Tk5>, InterfaceC23496h> {
        public C22931P1() {
            super(1);
        }

        /* renamed from: b */
        public static final Unit m34748b(C42483i25 this$0, WireBird bird) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(bird, "$bird");
            this$0.f86335U.mo14403b(new RideRequirement.LeaseBasedHelmetPrompt(bird));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23496h invoke2(Pair<C37099Xl5, ? extends C36154Tk5> pair) {
            Config rideConfig;
            String str;
            WirePhysicalLock wirePhysicalLock;
            String str2;
            RideState mo75031q1;
            WireRide ride;
            WireRide ride2;
            WireBird bird;
            WireRide ride3;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C37099Xl5 component1 = pair.component1();
            C36154Tk5 component2 = pair.component2();
            WirePhysicalLock m76371b = component1.m76371b();
            RideState m76369d = component1.m76369d();
            if (m76369d == null || (rideConfig = m76369d.getRideConfig()) == null) {
                RideState m59035e = C42483i25.this.m35012f4().mo75057R().m73665a().m59035e();
                rideConfig = m59035e != null ? m59035e.getRideConfig() : C42483i25.this.f86341a.m82623f8().m73665a();
            }
            boolean z = m76371b.getPurpose() == PhysicalLockPurpose.HELMET && C42483i25.this.f86322H.mo55653v(rideConfig, m76371b, ItemLeaseType.HELMET);
            WireBird wireBird = null;
            final WireBird bird2 = (m76369d == null || (ride3 = m76369d.getRide()) == null) ? null : ride3.getBird();
            String birdId = m76371b.getBirdId();
            if (birdId == null) {
                birdId = bird2 != null ? bird2.getId() : null;
                if (birdId == null) {
                    RideState m59035e2 = C42483i25.this.m35012f4().mo75057R().m73665a().m59035e();
                    if (m59035e2 == null || (ride2 = m59035e2.getRide()) == null || (bird = ride2.getBird()) == null) {
                        str = null;
                        if (bird2 != null) {
                            if (str != null && (mo75031q1 = C42483i25.this.m35012f4().mo75031q1(str)) != null && (ride = mo75031q1.getRide()) != null) {
                                wireBird = ride.getBird();
                            }
                            if (wireBird == null) {
                                wirePhysicalLock = m76371b;
                                bird2 = new WireBird(str == null ? "" : str, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, wirePhysicalLock, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -2, -129, 3, null);
                                str2 = str;
                                boolean z2 = str2 == null && C42483i25.this.f86322H.mo55706C(str2, ItemLeaseType.HELMET);
                                if (z) {
                                    if (z2) {
                                        C41318g46.m40163a("received a lock scanned notification for a lock already in active lease, continuing to unlock now", new Object[0]);
                                        return C42483i25.this.f86365m.mo21394m(component2, wirePhysicalLock);
                                    }
                                    C41318g46.m40163a("received a lock scanned notification for a lock eligible for helmet lease, prompting to start lease", new Object[0]);
                                    final C42483i25 c42483i25 = C42483i25.this;
                                    AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: x25
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            Unit m34748b;
                                            m34748b = C42483i25.C22931P1.m34748b(C42483i25.this, bird2);
                                            return m34748b;
                                        }
                                    });
                                    Intrinsics.checkNotNullExpressionValue(m33078H, "{\n            Timber.d(\"…            }\n          }");
                                    return m33078H;
                                }
                                return AbstractC23461c.m33039p();
                            }
                            wirePhysicalLock = m76371b;
                            bird2 = wireBird;
                        } else {
                            wirePhysicalLock = m76371b;
                        }
                        str2 = str;
                        if (str2 == null) {
                        }
                        if (z) {
                        }
                    } else {
                        birdId = bird.getId();
                    }
                }
            }
            str = birdId;
            if (bird2 != null) {
            }
            str2 = str;
            if (str2 == null) {
            }
            if (z) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends C37099Xl5, ? extends C36154Tk5> pair) {
            return invoke2((Pair<C37099Xl5, ? extends C36154Tk5>) pair);
        }
    }
}
