package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.birdplus.view.BirdPlusBannerView;
import co.bird.android.feature.ridepass.view.RidePassBannerView;
import co.bird.android.model.FlightBanner;
import co.bird.android.model.FlightBannerNode;
import co.bird.android.widget.CallToActionBanner;
import co.bird.android.widget.DealBannerView;
import co.bird.android.widget.ParkingBannerView;
import co.bird.android.widget.ParkingNestView;
import co.bird.android.widget.QuickStartSelectedBannerView;
import co.bird.android.widget.QuickStartUnselectedBannerView;
import co.bird.android.widget.ReservationBannerView;
import co.bird.android.widget.RideStartInBadAreaView;
import co.bird.android.widget.SelectedBirdRidePriceBannerView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23470e;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41194fs1;
import p000.C49387th3;
@Metadata(m28433d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001Bï\u0001\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010a\u001a\u00020^\u0012\u0006\u0010e\u001a\u00020b\u0012\b\b\u0001\u0010i\u001a\u00020f\u0012\b\b\u0001\u0010m\u001a\u00020j\u0012\b\b\u0001\u0010q\u001a\u00020n\u0012\b\b\u0001\u0010u\u001a\u00020r\u0012\b\b\u0001\u0010y\u001a\u00020v\u0012\b\b\u0001\u0010}\u001a\u00020z¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0004H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R$\u0010\u0085\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u0087\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008d\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008d\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008d\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008d\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u008d\u0001R\u0017\u0010\u009a\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008d\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u008d\u0001R\u0017\u0010\u009e\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008d\u0001R\u0017\u0010 \u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u008d\u0001R\u0017\u0010¢\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u008d\u0001R\u0017\u0010¤\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u008d\u0001R\u0017\u0010¦\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u008d\u0001R\u0017\u0010¨\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010\u008d\u0001R\u0017\u0010ª\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u008d\u0001R\u0017\u0010¬\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010\u008d\u0001R\u0017\u0010®\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u008d\u0001R\u0017\u0010°\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010\u008d\u0001R\u0017\u0010²\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010\u008d\u0001R\u0017\u0010´\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010\u008d\u0001R\u0017\u0010¶\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010\u008d\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010\u008d\u0001R\u0017\u0010º\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010\u008d\u0001R\u0017\u0010¼\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010\u008d\u0001R\u001e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R'\u0010Å\u0001\u001a\u0012\u0012\r\u0012\u000b Â\u0001*\u0004\u0018\u00010\u00050\u00050Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006È\u0001"}, m28432d2 = {"Lfs1;", "LZr1;", "", "l", "Lio/reactivex/Observable;", "LH2;", "K1", "f", "Lco/bird/android/model/FlightBannerNode$FlightBanner;", "banner", "M1", "N1", "", "show", "O1", "Lio/reactivex/c;", "P1", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/FlightBannerNode;", "L1", "LCT0;", C17296a.f69688o, "LCT0;", "dealBannerPresenterImplFactory", "LFD0;", "b", "LFD0;", "couponDisplayBannerPresenterImplFactory", "LnK4;", "c", "LnK4;", "reservationBannerPresenterImplFactory", "LLH3;", DateTokenConverter.CONVERTER_KEY, "LLH3;", "parkingSuccessBannerPresenterImplFactory", "Luh3;", "e", "Luh3;", "onboardingBannerPresenterImplFactory", "LXF3;", "LXF3;", "parkingNestBannerPresenterImplFactory", "Lc85;", "g", "Lc85;", "riderAreaWarningBannerPresenterImplFactory", "LMQ2;", "h", "LMQ2;", "merchantInfoBannerPresenterImplFactory", "LY55;", "i", "LY55;", "rideStartInBadAreaBannerPresenterImplFactory", "LJU4;", "j", "LJU4;", "ridePassBannerPresenterImplFactory", "LhP;", "k", "LhP;", "birdPlusBannerPresenterImplFactory", "Lo13;", "Lo13;", "nearParkingNestBannerPresenterImplFactory", "LLe4;", "m", "LLe4;", "quickStartUnselectedBannerPresenterImplFactory", "Lse4;", "n", "Lse4;", "quickStartSelectedBannerPresenterImplFactory", "LIr5;", "o", "LIr5;", "selectedBirdRidePriceBannerPresenterImplFactory", "LVf;", "p", "LVf;", "announcementBannerPresenterImplFactory", "Landroid/content/Context;", "q", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "r", "LTq4;", "reactiveConfig", "Lgl;", "s", "Lgl;", "preference", "Lue3;", "t", "Lue3;", "offerManager", "LEa;", "u", "LEa;", "analyticsManager", "Lco/bird/android/core/mvp/BaseActivity;", "v", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Le13;", "w", "Le13;", "navigator", "LsJ4;", "x", "LsJ4;", "requirementPresenter", "Lcom/uber/autodispose/ScopeProvider;", "y", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lks1;", "z", "Lks1;", "flightBannerUi", "Lco/bird/android/app/feature/map/ui/MapUi;", "A", "Lco/bird/android/app/feature/map/ui/MapUi;", "mapUi", "Ljava/util/PriorityQueue;", "B", "Ljava/util/PriorityQueue;", "priorityQueue", "LAG;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LAG;", "currentBannerRelay", "D", "priorityQueueHeadRelay", "Lco/bird/android/model/FlightBanner;", "E", "Lco/bird/android/model/FlightBanner;", "currentBannerPresenter", "F", "Lco/bird/android/model/FlightBannerNode;", "selectedBirdRidePriceNode", "G", "designatedParkingNode", "H", "parkingSuccessNode", "I", "parkingNestNode", "J", "dealNode", "K", "ridePassNode", "L", "birdPlusNode", "M", "couponDisplayNode", "N", "onboardingStartNode", "O", "onboardingInProgressNode", "P", "reservationBeforeNode", "Q", "reservationInProgressNode", "R", "quickStartUnselectedNode", "S", "quickStartSelectedNode", "T", "riderBarBluetoothDisabled", "U", "riderBarEndRideLockPhotoRequired", "V", "riderBarLocationServicesDisabled", "W", "merchantSiteNode", "X", "rideStartOutsideOperatingArea", "Y", "rideStartInNoRideArea", "Z", "birdPayPromoNode", "a0", "endRideInParkingSpotNode", "b0", "parkingNearToNestNode", "c0", "announcementBannerNode", "", "d0", "Ljava/util/List;", "nodes", "Lma4;", "kotlin.jvm.PlatformType", "e0", "Lma4;", "actionRelay", "<init>", "(LCT0;LFD0;LnK4;LLH3;Luh3;LXF3;Lc85;LMQ2;LY55;LJU4;LhP;Lo13;LLe4;Lse4;LIr5;LVf;Landroid/content/Context;LTq4;Lgl;Lue3;LEa;Lco/bird/android/core/mvp/BaseActivity;Le13;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lks1;Lco/bird/android/app/feature/map/ui/MapUi;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightBannerCoordinatorPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,498:1\n180#2:499\n180#2:500\n288#3,2:501\n288#3,2:503\n*S KotlinDebug\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl\n*L\n403#1:499\n443#1:500\n455#1:501,2\n463#1:503,2\n*E\n"})
/* renamed from: fs1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41194fs1 implements InterfaceC37617Zr1 {

    /* renamed from: A */
    public final MapUi f80867A;

    /* renamed from: B */
    public final PriorityQueue<FlightBannerNode> f80868B;

    /* renamed from: C */
    public final C0058AG<Optional<FlightBannerNode>> f80869C;

    /* renamed from: D */
    public final C0058AG<Optional<FlightBannerNode>> f80870D;

    /* renamed from: E */
    public FlightBanner f80871E;

    /* renamed from: F */
    public final FlightBannerNode f80872F;

    /* renamed from: G */
    public final FlightBannerNode f80873G;

    /* renamed from: H */
    public final FlightBannerNode f80874H;

    /* renamed from: I */
    public final FlightBannerNode f80875I;

    /* renamed from: J */
    public final FlightBannerNode f80876J;

    /* renamed from: K */
    public final FlightBannerNode f80877K;

    /* renamed from: L */
    public final FlightBannerNode f80878L;

    /* renamed from: M */
    public final FlightBannerNode f80879M;

    /* renamed from: N */
    public final FlightBannerNode f80880N;

    /* renamed from: O */
    public final FlightBannerNode f80881O;

    /* renamed from: P */
    public final FlightBannerNode f80882P;

    /* renamed from: Q */
    public final FlightBannerNode f80883Q;

    /* renamed from: R */
    public final FlightBannerNode f80884R;

    /* renamed from: S */
    public final FlightBannerNode f80885S;

    /* renamed from: T */
    public final FlightBannerNode f80886T;

    /* renamed from: U */
    public final FlightBannerNode f80887U;

    /* renamed from: V */
    public final FlightBannerNode f80888V;

    /* renamed from: W */
    public final FlightBannerNode f80889W;

    /* renamed from: X */
    public final FlightBannerNode f80890X;

    /* renamed from: Y */
    public final FlightBannerNode f80891Y;

    /* renamed from: Z */
    public final FlightBannerNode f80892Z;

    /* renamed from: a */
    public final CT0 f80893a;

    /* renamed from: a0 */
    public final FlightBannerNode f80894a0;

    /* renamed from: b */
    public final FD0 f80895b;

    /* renamed from: b0 */
    public final FlightBannerNode f80896b0;

    /* renamed from: c */
    public final InterfaceC45617nK4 f80897c;

    /* renamed from: c0 */
    public final FlightBannerNode f80898c0;

    /* renamed from: d */
    public final LH3 f80899d;

    /* renamed from: d0 */
    public final List<FlightBannerNode> f80900d0;

    /* renamed from: e */
    public final InterfaceC49980uh3 f80901e;

    /* renamed from: e0 */
    public final C45168ma4<EnumC3010H2> f80902e0;

    /* renamed from: f */
    public final XF3 f80903f;

    /* renamed from: g */
    public final InterfaceC38968c85 f80904g;

    /* renamed from: h */
    public final MQ2 f80905h;

    /* renamed from: i */
    public final Y55 f80906i;

    /* renamed from: j */
    public final JU4 f80907j;

    /* renamed from: k */
    public final InterfaceC22636hP f80908k;

    /* renamed from: l */
    public final InterfaceC46029o13 f80909l;

    /* renamed from: m */
    public final InterfaceC34227Le4 f80910m;

    /* renamed from: n */
    public final InterfaceC48765se4 f80911n;

    /* renamed from: o */
    public final InterfaceC33643Ir5 f80912o;

    /* renamed from: p */
    public final InterfaceC8716Vf f80913p;

    /* renamed from: q */
    public final Context f80914q;

    /* renamed from: r */
    public final C36207Tq4 f80915r;

    /* renamed from: s */
    public final C22454gl f80916s;

    /* renamed from: t */
    public final InterfaceC49950ue3 f80917t;

    /* renamed from: u */
    public final InterfaceC1880Ea f80918u;

    /* renamed from: v */
    public final BaseActivity f80919v;

    /* renamed from: w */
    public final InterfaceC40099e13 f80920w;

    /* renamed from: x */
    public final InterfaceC48572sJ4 f80921x;

    /* renamed from: y */
    public final ScopeProvider f80922y;

    /* renamed from: z */
    public final InterfaceC44159ks1 f80923z;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$A */
    /* loaded from: classes2.dex */
    public static final class C20562A extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20562A() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80903f.mo75295a(C41194fs1.this.f80920w, new C38447bG3((ParkingNestView) view), scopeProvider, C41194fs1.this.f80867A);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$B */
    /* loaded from: classes2.dex */
    public static final class C20563B extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20563B f80925g = new C20563B();

        public C20563B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.call_to_action_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.CallToActionBanner");
            ((CallToActionBanner) inflate).setCallToActionState(CallToActionBanner.EnumC16470a.f67212j);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…ARKING_SUCCESS)\n        }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "<anonymous parameter 1>", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$C */
    /* loaded from: classes2.dex */
    public static final class C20564C extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20564C() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            return C41194fs1.this.f80899d.mo95452a(new PH3(C41194fs1.this.f80914q, (CallToActionBanner) view));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$D */
    /* loaded from: classes2.dex */
    public static final class C20565D extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20565D f80927g = new C20565D();

        public C20565D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.quick_start_selected_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…lected_banner_view, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$E */
    /* loaded from: classes2.dex */
    public static final class C20566E extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20566E() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80911n.mo11981a(C41194fs1.this.f80921x, new C42836ie4((QuickStartSelectedBannerView) view, C41194fs1.this.f80919v), scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$F */
    /* loaded from: classes2.dex */
    public static final class C20567F extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20567F f80929g = new C20567F();

        public C20567F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.quick_start_unselected_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…lected_banner_view, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$G */
    /* loaded from: classes2.dex */
    public static final class C20568G extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20568G() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80910m.mo95089a(C41194fs1.this.f80921x, new C51136we4((QuickStartUnselectedBannerView) view, C41194fs1.this.f80919v), scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$H */
    /* loaded from: classes2.dex */
    public static final class C20569H extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20569H f80931g = new C20569H();

        public C20569H() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.reservation_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.ReservationBannerView");
            ((ReservationBannerView) inflate).setReservationState(ReservationBannerView.EnumC16574a.BEFORE);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…onState.BEFORE)\n        }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$I */
    /* loaded from: classes2.dex */
    public static final class C20570I extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20570I() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80897c.mo21341a(C41194fs1.this.f80921x, new C48581sK4((ReservationBannerView) view, C41194fs1.this.f80919v), scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$J */
    /* loaded from: classes2.dex */
    public static final class C20571J extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20571J f80933g = new C20571J();

        public C20571J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.reservation_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.ReservationBannerView");
            ((ReservationBannerView) inflate).setReservationState(ReservationBannerView.EnumC16574a.IN_PROGRESS);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…te.IN_PROGRESS)\n        }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$K */
    /* loaded from: classes2.dex */
    public static final class C20572K extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20572K() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80897c.mo21341a(C41194fs1.this.f80921x, new C48581sK4((ReservationBannerView) view, C41194fs1.this.f80919v), scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$L */
    /* loaded from: classes2.dex */
    public static final class C20573L extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20573L f80935g = new C20573L();

        public C20573L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.ridepass_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…depass_banner_view, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$M */
    /* loaded from: classes2.dex */
    public static final class C20574M extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20574M() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80907j.mo98836a(new NU4((RidePassBannerView) view), C41194fs1.this.f80920w, scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightBannerCoordinatorPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl$rideStartInNoRideArea$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
    /* renamed from: fs1$N */
    /* loaded from: classes2.dex */
    public static final class C20575N extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20575N f80937g = new C20575N();

        public C20575N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.ride_start_in_bad_area_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.RideStartInBadAreaView");
            ((RideStartInBadAreaView) inflate).setBadAreaType(RideStartInBadAreaView.EnumC16576a.IN_NO_RIDE_AREA);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…eaType.IN_NO_RIDE_AREA) }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "<anonymous parameter 1>", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$O */
    /* loaded from: classes2.dex */
    public static final class C20576O extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20576O() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            return C41194fs1.this.f80906i.mo73735a(new C38948c65((RideStartInBadAreaView) view, C41194fs1.this.f80919v));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightBannerCoordinatorPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl$rideStartOutsideOperatingArea$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
    /* renamed from: fs1$P */
    /* loaded from: classes2.dex */
    public static final class C20577P extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20577P f80939g = new C20577P();

        public C20577P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.ride_start_in_bad_area_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.RideStartInBadAreaView");
            ((RideStartInBadAreaView) inflate).setBadAreaType(RideStartInBadAreaView.EnumC16576a.OUTSIDE_OPERATING_AREA);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…OUTSIDE_OPERATING_AREA) }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "<anonymous parameter 1>", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$Q */
    /* loaded from: classes2.dex */
    public static final class C20578Q extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20578Q() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            return C41194fs1.this.f80906i.mo73735a(new C38948c65((RideStartInBadAreaView) view, C41194fs1.this.f80919v));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$R */
    /* loaded from: classes2.dex */
    public static final class C20579R extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20579R f80941g = new C20579R();

        public C20579R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C45268mk4.view_rider_bar, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(W.…out.view_rider_bar, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "<anonymous parameter 1>", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$S */
    /* loaded from: classes2.dex */
    public static final class C20580S extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20580S() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            return C41194fs1.this.f80904g.mo44582a(FlightBannerNode.RiderBarType.BLUETOOTH_DISABLED, view, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$T */
    /* loaded from: classes2.dex */
    public static final class C20581T extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20581T f80943g = new C20581T();

        public C20581T() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C45268mk4.view_rider_bar, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(W.…out.view_rider_bar, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "<anonymous parameter 1>", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$U */
    /* loaded from: classes2.dex */
    public static final class C20582U extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20582U() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            return C41194fs1.this.f80904g.mo44582a(FlightBannerNode.RiderBarType.END_RIDE_LOCK_PHOTO_REQUIRED, view, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$V */
    /* loaded from: classes2.dex */
    public static final class C20583V extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20583V f80945g = new C20583V();

        public C20583V() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C45268mk4.view_rider_bar, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(W.…out.view_rider_bar, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "<anonymous parameter 1>", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$W */
    /* loaded from: classes2.dex */
    public static final class C20584W extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20584W() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "<anonymous parameter 1>");
            return C41194fs1.this.f80904g.mo44582a(FlightBannerNode.RiderBarType.LOCATION_SERVICES_DISABLED, view, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$X */
    /* loaded from: classes2.dex */
    public static final class C20585X extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20585X f80947g = new C20585X();

        public C20585X() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.selected_bird_ride_price_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…_price_banner_view, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$Y */
    /* loaded from: classes2.dex */
    public static final class C20586Y extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20586Y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80912o.mo99623a(new C34579Mr5((SelectedBirdRidePriceBannerView) view, C41194fs1.this.f80919v), scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "it", "", C17296a.f69688o, "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$Z */
    /* loaded from: classes2.dex */
    public static final class C20587Z extends Lambda implements Function1<InterfaceC23470e, Unit> {
        public C20587Z() {
            super(1);
        }

        /* renamed from: a */
        public final void m40654a(InterfaceC23470e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41194fs1 c41194fs1 = C41194fs1.this;
            c41194fs1.mo40695M1(c41194fs1.f80898c0.getBanner());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m40654a(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$a */
    /* loaded from: classes2.dex */
    public static final class C20588a extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20588a f80950g = new C20588a();

        public C20588a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C45268mk4.view_announcement_banner, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(W.…nnouncement_banner, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$b */
    /* loaded from: classes2.dex */
    public static final class C20589b extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20589b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80913p.mo78046a(new C9883Yf(C41194fs1.this.f80919v, view), scopeProvider, C41194fs1.this.f80919v);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$c */
    /* loaded from: classes2.dex */
    public static final class C20590c extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20590c f80952g = new C20590c();

        public C20590c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C45268mk4.view_bird_pay_promo_banner, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(W.…d_pay_promo_banner, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$d */
    /* loaded from: classes2.dex */
    public static final class C20591d extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20591d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return new C20381fN(view, scopeProvider, C41194fs1.this.f80915r, C41194fs1.this.f80920w, C41194fs1.this.f80917t, C41194fs1.this.f80918u);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$e */
    /* loaded from: classes2.dex */
    public static final class C20592e extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20592e f80954g = new C20592e();

        public C20592e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.birdplus_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…rdplus_banner_view, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$f */
    /* loaded from: classes2.dex */
    public static final class C20593f extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20593f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80908k.mo34025a(new C25692lP((BirdPlusBannerView) view), C41194fs1.this.f80920w, scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$g */
    /* loaded from: classes2.dex */
    public static final class C20594g extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20594g f80956g = new C20594g();

        public C20594g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.view_coupon_display_banner, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…pon_display_banner, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$h */
    /* loaded from: classes2.dex */
    public static final class C20595h extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20595h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            C35273Pq6 m89704a = C35273Pq6.m89704a(view);
            Intrinsics.checkNotNullExpressionValue(m89704a, "bind(view)");
            return C41194fs1.this.f80895b.mo105645a(new JD0(C41194fs1.this.f80919v, m89704a), scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$i */
    /* loaded from: classes2.dex */
    public static final class C20596i extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20596i f80958g = new C20596i();

        public C20596i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.deal_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…t.deal_banner_view, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$j */
    /* loaded from: classes2.dex */
    public static final class C20597j extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20597j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80893a.mo110415a(new HT0((DealBannerView) view), C41194fs1.this.f80920w, scopeProvider);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$k */
    /* loaded from: classes2.dex */
    public static final class C20598k extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20598k f80960g = new C20598k();

        public C20598k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.parking_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.ParkingBannerView");
            ((ParkingBannerView) inflate).m54512a(EnumC42013hF3.DESIGNATED_PARKING);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…GNATED_PARKING)\n        }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$l */
    /* loaded from: classes2.dex */
    public static final class C20599l extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20599l f80961g = new C20599l();

        public C20599l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.call_to_action_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.CallToActionBanner");
            ((CallToActionBanner) inflate).setCallToActionState(CallToActionBanner.EnumC16470a.f67215m);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…_IN_PARKING_SPOT)\n      }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$m */
    /* loaded from: classes2.dex */
    public static final class C20600m extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20600m f80962g = new C20600m();

        public C20600m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C45268mk4.view_merchant_site_info, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(W.…merchant_site_info, null)");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$n */
    /* loaded from: classes2.dex */
    public static final class C20601n extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20601n() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80905h.mo93920a(new PQ2(view), scopeProvider, C41194fs1.this.f80920w, C41194fs1.this.f80915r);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/FlightBannerNode;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$o */
    /* loaded from: classes2.dex */
    public static final class C20602o extends Lambda implements Function1<Optional<FlightBannerNode>, Unit> {
        public C20602o() {
            super(1);
        }

        /* renamed from: a */
        public final void m40639a(Optional<FlightBannerNode> optional) {
            FlightBannerNode flightBannerNode;
            FlightBannerNode m59035e = optional.m59035e();
            Optional optional2 = (Optional) C41194fs1.this.f80869C.getValue();
            if (optional2 != null) {
                flightBannerNode = (FlightBannerNode) optional2.m59035e();
            } else {
                flightBannerNode = null;
            }
            if (!Intrinsics.areEqual(m59035e, flightBannerNode)) {
                if (flightBannerNode != null) {
                    C41194fs1.this.f80923z.mo26728rl();
                }
                if (m59035e != null) {
                    C41194fs1.this.f80869C.accept(Optional.f63040c.m59032c(m59035e));
                } else {
                    C41194fs1.this.f80869C.accept(Optional.f63040c.m59034a());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<FlightBannerNode> optional) {
            m40639a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a:\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0007*\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/FlightBannerNode;", "it", "Lkotlin/Triple;", "Lco/bird/android/model/FlightBannerNode$FlightBanner;", "Landroid/view/View;", "Lco/bird/android/model/FlightBanner;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightBannerCoordinatorPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl$onCreate$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,498:1\n41#2:499\n*S KotlinDebug\n*F\n+ 1 FlightBannerCoordinatorPresenterImpl.kt\nco/bird/android/app/feature/banners/presenter/FlightBannerCoordinatorPresenterImpl$onCreate$2\n*L\n426#1:499\n*E\n"})
    /* renamed from: fs1$p */
    /* loaded from: classes2.dex */
    public static final class C20603p extends Lambda implements Function1<Optional<FlightBannerNode>, Triple<? extends FlightBannerNode.FlightBanner, ? extends View, ? extends FlightBanner>> {
        public C20603p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<FlightBannerNode.FlightBanner, View, FlightBanner> invoke(Optional<FlightBannerNode> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m59037c()) {
                FlightBannerNode m59038b = it.m59038b();
                View invoke = m59038b.getView().invoke(C41194fs1.this.f80914q);
                Function2<View, ScopeProvider, FlightBanner> presenterFactory = m59038b.getPresenterFactory();
                ScopeProvider m45202a = ViewScopeProvider.m45202a(invoke);
                Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                return new Triple<>(m59038b.getBanner(), invoke, presenterFactory.invoke(invoke, m45202a));
            }
            return new Triple<>(null, null, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062>\u0010\u0005\u001a:\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/FlightBannerNode$FlightBanner;", "Landroid/view/View;", "Lco/bird/android/model/FlightBanner;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$q */
    /* loaded from: classes2.dex */
    public static final class C20604q extends Lambda implements Function1<Triple<? extends FlightBannerNode.FlightBanner, ? extends View, ? extends FlightBanner>, Unit> {
        public C20604q() {
            super(1);
        }

        /* renamed from: a */
        public final void m40637a(Triple<? extends FlightBannerNode.FlightBanner, ? extends View, ? extends FlightBanner> triple) {
            triple.component1();
            View component2 = triple.component2();
            FlightBanner component3 = triple.component3();
            if (component2 != null) {
                C41194fs1.this.f80923z.mo26727zg(component2);
            }
            C41194fs1.this.f80871E = component3;
            if (component3 != null) {
                component3.onBannerShown();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends FlightBannerNode.FlightBanner, ? extends View, ? extends FlightBanner> triple) {
            m40637a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001 \u0006*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/FlightBannerNode$FlightBanner;", "Landroid/view/View;", "Lco/bird/android/model/FlightBanner;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Triple;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$r */
    /* loaded from: classes2.dex */
    public static final class C20605r extends Lambda implements Function1<Triple<? extends FlightBannerNode.FlightBanner, ? extends View, ? extends FlightBanner>, InterfaceC23434B<? extends FlightBannerNode.FlightBanner>> {

        /* renamed from: g */
        public static final C20605r f80967g = new C20605r();

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Lco/bird/android/model/FlightBannerNode$FlightBanner;", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/FlightBannerNode$FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fs1$r$a */
        /* loaded from: classes2.dex */
        public static final class C20606a extends Lambda implements Function1<Unit, FlightBannerNode.FlightBanner> {

            /* renamed from: g */
            public final /* synthetic */ FlightBannerNode.FlightBanner f80968g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20606a(FlightBannerNode.FlightBanner flightBanner) {
                super(1);
                this.f80968g = flightBanner;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final FlightBannerNode.FlightBanner invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f80968g;
            }
        }

        public C20605r() {
            super(1);
        }

        /* renamed from: c */
        public static final FlightBannerNode.FlightBanner m40634c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (FlightBannerNode.FlightBanner) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends FlightBannerNode.FlightBanner> invoke(Triple<? extends FlightBannerNode.FlightBanner, ? extends View, ? extends FlightBanner> triple) {
            Observable<Unit> closeImmediately;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            FlightBannerNode.FlightBanner component1 = triple.component1();
            FlightBanner component3 = triple.component3();
            if (component3 != null && (closeImmediately = component3.closeImmediately()) != null) {
                final C20606a c20606a = new C20606a(component1);
                InterfaceC23434B map = closeImmediately.map(new InterfaceC23492o() { // from class: gs1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        FlightBannerNode.FlightBanner m40634c;
                        m40634c = C41194fs1.C20605r.m40634c(Function1.this, obj);
                        return m40634c;
                    }
                });
                if (map != null) {
                    return map;
                }
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/FlightBannerNode$FlightBanner;", "banner", "", C17296a.f69688o, "(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$s */
    /* loaded from: classes2.dex */
    public static final class C20607s extends Lambda implements Function1<FlightBannerNode.FlightBanner, Unit> {
        public C20607s() {
            super(1);
        }

        /* renamed from: a */
        public final void m40632a(FlightBannerNode.FlightBanner flightBanner) {
            if (flightBanner != null) {
                C41194fs1.this.mo40694N1(flightBanner);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlightBannerNode.FlightBanner flightBanner) {
            m40632a(flightBanner);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$t */
    /* loaded from: classes2.dex */
    public static final class C20608t extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20608t f80970g = new C20608t();

        public C20608t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.call_to_action_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.CallToActionBanner");
            ((CallToActionBanner) inflate).setCallToActionState(CallToActionBanner.EnumC16470a.f67211i);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…NG_IN_PROGRESS)\n        }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$u */
    /* loaded from: classes2.dex */
    public static final class C20609u extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20609u() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80901e.mo8252a(new C52351yh3((CallToActionBanner) view), C41194fs1.this.f80921x, scopeProvider, C49387th3.EnumC28800a.IN_PROGRESS);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$v */
    /* loaded from: classes2.dex */
    public static final class C20610v extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20610v f80972g = new C20610v();

        public C20610v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.call_to_action_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.CallToActionBanner");
            ((CallToActionBanner) inflate).setCallToActionState(CallToActionBanner.EnumC16470a.f67210h);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…BOARDING_START)\n        }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$w */
    /* loaded from: classes2.dex */
    public static final class C20611w extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20611w() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80901e.mo8252a(new C52351yh3((CallToActionBanner) view), C41194fs1.this.f80921x, scopeProvider, C49387th3.EnumC28800a.UNTOUCHED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$x */
    /* loaded from: classes2.dex */
    public static final class C20612x extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20612x f80974g = new C20612x();

        public C20612x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.call_to_action_banner_view, (ViewGroup) null);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type co.bird.android.widget.CallToActionBanner");
            ((CallToActionBanner) inflate).setCallToActionState(CallToActionBanner.EnumC16470a.f67216n);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…_IN_PARKING_SPOT)\n      }");
            return inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "view", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/FlightBanner;", C17296a.f69688o, "(Landroid/view/View;Lcom/uber/autodispose/ScopeProvider;)Lco/bird/android/model/FlightBanner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$y */
    /* loaded from: classes2.dex */
    public static final class C20613y extends Lambda implements Function2<View, ScopeProvider, FlightBanner> {
        public C20613y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final FlightBanner invoke(View view, ScopeProvider scopeProvider) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            return C41194fs1.this.f80909l.mo20147a(new C48400s13(C41194fs1.this.f80919v, (CallToActionBanner) view), scopeProvider, C41194fs1.this.f80902e0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", C17296a.f69688o, "(Landroid/content/Context;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fs1$z */
    /* loaded from: classes2.dex */
    public static final class C20614z extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public static final C20614z f80976g = new C20614z();

        public C20614z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            View inflate = LayoutInflater.from(context).inflate(C39311cj4.parking_nest_view, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.….parking_nest_view, null)");
            return inflate;
        }
    }

    public C41194fs1(CT0 dealBannerPresenterImplFactory, FD0 couponDisplayBannerPresenterImplFactory, InterfaceC45617nK4 reservationBannerPresenterImplFactory, LH3 parkingSuccessBannerPresenterImplFactory, InterfaceC49980uh3 onboardingBannerPresenterImplFactory, XF3 parkingNestBannerPresenterImplFactory, InterfaceC38968c85 riderAreaWarningBannerPresenterImplFactory, MQ2 merchantInfoBannerPresenterImplFactory, Y55 rideStartInBadAreaBannerPresenterImplFactory, JU4 ridePassBannerPresenterImplFactory, InterfaceC22636hP birdPlusBannerPresenterImplFactory, InterfaceC46029o13 nearParkingNestBannerPresenterImplFactory, InterfaceC34227Le4 quickStartUnselectedBannerPresenterImplFactory, InterfaceC48765se4 quickStartSelectedBannerPresenterImplFactory, InterfaceC33643Ir5 selectedBirdRidePriceBannerPresenterImplFactory, InterfaceC8716Vf announcementBannerPresenterImplFactory, Context context, C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC49950ue3 offerManager, InterfaceC1880Ea analyticsManager, BaseActivity activity, InterfaceC40099e13 navigator, InterfaceC48572sJ4 requirementPresenter, ScopeProvider scopeProvider, InterfaceC44159ks1 flightBannerUi, MapUi mapUi) {
        List<FlightBannerNode> listOf;
        Intrinsics.checkNotNullParameter(dealBannerPresenterImplFactory, "dealBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(couponDisplayBannerPresenterImplFactory, "couponDisplayBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(reservationBannerPresenterImplFactory, "reservationBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(parkingSuccessBannerPresenterImplFactory, "parkingSuccessBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(onboardingBannerPresenterImplFactory, "onboardingBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(parkingNestBannerPresenterImplFactory, "parkingNestBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(riderAreaWarningBannerPresenterImplFactory, "riderAreaWarningBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(merchantInfoBannerPresenterImplFactory, "merchantInfoBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(rideStartInBadAreaBannerPresenterImplFactory, "rideStartInBadAreaBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(ridePassBannerPresenterImplFactory, "ridePassBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(birdPlusBannerPresenterImplFactory, "birdPlusBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(nearParkingNestBannerPresenterImplFactory, "nearParkingNestBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(quickStartUnselectedBannerPresenterImplFactory, "quickStartUnselectedBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(quickStartSelectedBannerPresenterImplFactory, "quickStartSelectedBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(selectedBirdRidePriceBannerPresenterImplFactory, "selectedBirdRidePriceBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(announcementBannerPresenterImplFactory, "announcementBannerPresenterImplFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(offerManager, "offerManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(requirementPresenter, "requirementPresenter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(flightBannerUi, "flightBannerUi");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        this.f80893a = dealBannerPresenterImplFactory;
        this.f80895b = couponDisplayBannerPresenterImplFactory;
        this.f80897c = reservationBannerPresenterImplFactory;
        this.f80899d = parkingSuccessBannerPresenterImplFactory;
        this.f80901e = onboardingBannerPresenterImplFactory;
        this.f80903f = parkingNestBannerPresenterImplFactory;
        this.f80904g = riderAreaWarningBannerPresenterImplFactory;
        this.f80905h = merchantInfoBannerPresenterImplFactory;
        this.f80906i = rideStartInBadAreaBannerPresenterImplFactory;
        this.f80907j = ridePassBannerPresenterImplFactory;
        this.f80908k = birdPlusBannerPresenterImplFactory;
        this.f80909l = nearParkingNestBannerPresenterImplFactory;
        this.f80910m = quickStartUnselectedBannerPresenterImplFactory;
        this.f80911n = quickStartSelectedBannerPresenterImplFactory;
        this.f80912o = selectedBirdRidePriceBannerPresenterImplFactory;
        this.f80913p = announcementBannerPresenterImplFactory;
        this.f80914q = context;
        this.f80915r = reactiveConfig;
        this.f80916s = preference;
        this.f80917t = offerManager;
        this.f80918u = analyticsManager;
        this.f80919v = activity;
        this.f80920w = navigator;
        this.f80921x = requirementPresenter;
        this.f80922y = scopeProvider;
        this.f80923z = flightBannerUi;
        this.f80867A = mapUi;
        this.f80868B = new PriorityQueue<>();
        Optional.C14443a c14443a = Optional.f63040c;
        C0058AG<Optional<FlightBannerNode>> m115950h = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.absent())");
        this.f80869C = m115950h;
        C0058AG<Optional<FlightBannerNode>> m115950h2 = C0058AG.m115950h(c14443a.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault(Optional.absent())");
        this.f80870D = m115950h2;
        FlightBannerNode.FlightBanner flightBanner = FlightBannerNode.FlightBanner.SELECTED_BIRD_RIDE_PRICE;
        FlightBannerNode.BannerPriority bannerPriority = FlightBannerNode.BannerPriority.USER_INTERACTION_IN_SELECTED_STATE_BANNER;
        FlightBannerNode flightBannerNode = new FlightBannerNode(flightBanner, bannerPriority, C20585X.f80947g, new C20586Y());
        this.f80872F = flightBannerNode;
        FlightBannerNode.FlightBanner flightBanner2 = FlightBannerNode.FlightBanner.DESIGNATED_PARKING_AREA;
        FlightBannerNode.BannerPriority bannerPriority2 = FlightBannerNode.BannerPriority.PERSISTENT_LOCATION_BASED_BANNER;
        FlightBannerNode flightBannerNode2 = new FlightBannerNode(flightBanner2, bannerPriority2, C20598k.f80960g, null, 8, null);
        this.f80873G = flightBannerNode2;
        FlightBannerNode flightBannerNode3 = new FlightBannerNode(FlightBannerNode.FlightBanner.PARKING_SUCCESS, bannerPriority2, C20563B.f80925g, new C20564C());
        this.f80874H = flightBannerNode3;
        FlightBannerNode.FlightBanner flightBanner3 = FlightBannerNode.FlightBanner.PARKING_NEST;
        FlightBannerNode.BannerPriority bannerPriority3 = FlightBannerNode.BannerPriority.USER_INTERACTION_BANNER;
        FlightBannerNode flightBannerNode4 = new FlightBannerNode(flightBanner3, bannerPriority3, C20614z.f80976g, new C20562A());
        this.f80875I = flightBannerNode4;
        FlightBannerNode flightBannerNode5 = new FlightBannerNode(FlightBannerNode.FlightBanner.DEAL, FlightBannerNode.BannerPriority.PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER, C20596i.f80958g, new C20597j());
        this.f80876J = flightBannerNode5;
        FlightBannerNode flightBannerNode6 = new FlightBannerNode(FlightBannerNode.FlightBanner.RIDE_PASS, bannerPriority3, C20573L.f80935g, new C20574M());
        this.f80877K = flightBannerNode6;
        FlightBannerNode flightBannerNode7 = new FlightBannerNode(FlightBannerNode.FlightBanner.BIRD_PLUS, bannerPriority3, C20592e.f80954g, new C20593f());
        this.f80878L = flightBannerNode7;
        FlightBannerNode flightBannerNode8 = new FlightBannerNode(FlightBannerNode.FlightBanner.COUPON_DISPLAY, bannerPriority3, C20594g.f80956g, new C20595h());
        this.f80879M = flightBannerNode8;
        FlightBannerNode.FlightBanner flightBanner4 = FlightBannerNode.FlightBanner.ONBOARDING_START;
        FlightBannerNode.BannerPriority bannerPriority4 = FlightBannerNode.BannerPriority.NON_LOCATION_PERSISTENT_BANNER;
        FlightBannerNode flightBannerNode9 = new FlightBannerNode(flightBanner4, bannerPriority4, C20610v.f80972g, new C20611w());
        this.f80880N = flightBannerNode9;
        FlightBannerNode flightBannerNode10 = new FlightBannerNode(FlightBannerNode.FlightBanner.ONBOARDING_IN_PROGRESS, bannerPriority4, C20608t.f80970g, new C20609u());
        this.f80881O = flightBannerNode10;
        FlightBannerNode flightBannerNode11 = new FlightBannerNode(FlightBannerNode.FlightBanner.RESERVATION_BEFORE, bannerPriority, C20569H.f80931g, new C20570I());
        this.f80882P = flightBannerNode11;
        FlightBannerNode flightBannerNode12 = new FlightBannerNode(FlightBannerNode.FlightBanner.RESERVATION_IN_PROGRESS, bannerPriority, C20571J.f80933g, new C20572K());
        this.f80883Q = flightBannerNode12;
        FlightBannerNode flightBannerNode13 = new FlightBannerNode(FlightBannerNode.FlightBanner.QUICK_START_BIRD_UNSELECTED, bannerPriority3, C20567F.f80929g, new C20568G());
        this.f80884R = flightBannerNode13;
        FlightBannerNode flightBannerNode14 = new FlightBannerNode(FlightBannerNode.FlightBanner.QUICK_START_BIRD_SELECTED, bannerPriority, C20565D.f80927g, new C20566E());
        this.f80885S = flightBannerNode14;
        FlightBannerNode.FlightBanner flightBanner5 = FlightBannerNode.FlightBanner.RIDER_BAR_BLUETOOTH_DISABLED;
        FlightBannerNode.BannerPriority bannerPriority5 = FlightBannerNode.BannerPriority.SYSTEM_BANNER;
        FlightBannerNode flightBannerNode15 = new FlightBannerNode(flightBanner5, bannerPriority5, C20579R.f80941g, new C20580S());
        this.f80886T = flightBannerNode15;
        FlightBannerNode flightBannerNode16 = new FlightBannerNode(FlightBannerNode.FlightBanner.RIDER_BAR_END_RIDE_LOCK_PHOTO_REQUIRED, bannerPriority4, C20581T.f80943g, new C20582U());
        this.f80887U = flightBannerNode16;
        FlightBannerNode flightBannerNode17 = new FlightBannerNode(FlightBannerNode.FlightBanner.RIDER_BAR_LOCATION_SERVICES_DISABLED, bannerPriority5, C20583V.f80945g, new C20584W());
        this.f80888V = flightBannerNode17;
        FlightBannerNode flightBannerNode18 = new FlightBannerNode(FlightBannerNode.FlightBanner.MERCHANT_SITE_INFO, bannerPriority3, C20600m.f80962g, new C20601n());
        this.f80889W = flightBannerNode18;
        FlightBannerNode flightBannerNode19 = new FlightBannerNode(FlightBannerNode.FlightBanner.RIDE_START_OUTSIDE_OPERATING_AREA, bannerPriority2, C20577P.f80939g, new C20578Q());
        this.f80890X = flightBannerNode19;
        FlightBannerNode flightBannerNode20 = new FlightBannerNode(FlightBannerNode.FlightBanner.RIDE_START_IN_NO_RIDE_AREA, bannerPriority2, C20575N.f80937g, new C20576O());
        this.f80891Y = flightBannerNode20;
        FlightBannerNode flightBannerNode21 = new FlightBannerNode(FlightBannerNode.FlightBanner.BIRD_PAY_PROMO, FlightBannerNode.BannerPriority.DISMISSABLE_BANNER, C20590c.f80952g, new C20591d());
        this.f80892Z = flightBannerNode21;
        FlightBannerNode flightBannerNode22 = new FlightBannerNode(FlightBannerNode.FlightBanner.END_RIDE_IN_PARKING_NEST, bannerPriority2, C20599l.f80961g, null, 8, null);
        this.f80894a0 = flightBannerNode22;
        FlightBannerNode flightBannerNode23 = new FlightBannerNode(FlightBannerNode.FlightBanner.PARKING_CLOSE_TO_NEST, bannerPriority2, C20612x.f80974g, new C20613y());
        this.f80896b0 = flightBannerNode23;
        FlightBannerNode flightBannerNode24 = new FlightBannerNode(FlightBannerNode.FlightBanner.ANNOUNCEMENT, bannerPriority5, C20588a.f80950g, new C20589b());
        this.f80898c0 = flightBannerNode24;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FlightBannerNode[]{flightBannerNode24, flightBannerNode, flightBannerNode2, flightBannerNode3, flightBannerNode4, flightBannerNode5, flightBannerNode7, flightBannerNode6, flightBannerNode8, flightBannerNode18, flightBannerNode9, flightBannerNode10, flightBannerNode14, flightBannerNode13, flightBannerNode11, flightBannerNode12, flightBannerNode15, flightBannerNode16, flightBannerNode17, flightBannerNode19, flightBannerNode20, flightBannerNode21, flightBannerNode22, flightBannerNode23});
        this.f80900d0 = listOf;
        C45168ma4<EnumC3010H2> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<ActionName>()");
        this.f80902e0 = m25409g;
    }

    /* renamed from: g */
    public static final void m40685g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final Triple m40684h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m40683i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23434B m40682j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m40681k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37617Zr1
    /* renamed from: K1 */
    public Observable<EnumC3010H2> mo40697K1() {
        Observable<EnumC3010H2> hide = this.f80902e0.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "actionRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC37617Zr1
    /* renamed from: L1 */
    public Observable<Optional<FlightBannerNode>> mo40696L1() {
        Observable<Optional<FlightBannerNode>> hide = this.f80869C.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "currentBannerRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC37617Zr1
    /* renamed from: M1 */
    public void mo40695M1(FlightBannerNode.FlightBanner banner) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(banner, "banner");
        mo40694N1(banner);
        Iterator<T> it = this.f80900d0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((FlightBannerNode) obj).getBanner() == banner) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        FlightBannerNode flightBannerNode = (FlightBannerNode) obj;
        if (flightBannerNode != null) {
            this.f80868B.add(flightBannerNode);
            m40680l();
        }
    }

    @Override // p000.InterfaceC37617Zr1
    /* renamed from: N1 */
    public void mo40694N1(FlightBannerNode.FlightBanner banner) {
        FlightBannerNode.FlightBanner flightBanner;
        Object obj;
        FlightBanner flightBanner2;
        FlightBannerNode m59035e;
        boolean z;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Iterator<T> it = this.f80900d0.iterator();
        while (true) {
            flightBanner = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((FlightBannerNode) obj).getBanner() == banner) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        FlightBannerNode flightBannerNode = (FlightBannerNode) obj;
        if (flightBannerNode != null) {
            Optional<FlightBannerNode> value = this.f80869C.getValue();
            if (value != null && (m59035e = value.m59035e()) != null) {
                flightBanner = m59035e.getBanner();
            }
            if (flightBanner == flightBannerNode.getBanner() && (flightBanner2 = this.f80871E) != null) {
                flightBanner2.onBannerRemoved();
            }
            this.f80868B.remove(flightBannerNode);
            m40680l();
        }
    }

    @Override // p000.InterfaceC37617Zr1
    /* renamed from: O1 */
    public void mo40693O1(FlightBannerNode.FlightBanner banner, boolean z) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (z) {
            mo40695M1(banner);
        } else {
            mo40694N1(banner);
        }
    }

    @Override // p000.InterfaceC37617Zr1
    /* renamed from: P1 */
    public AbstractC23461c mo40692P1() {
        return C45832nh5.m23311e(new C20587Z());
    }

    /* renamed from: f */
    public void m40686f() {
        Observable<Optional<FlightBannerNode>> observeOn = this.f80870D.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "priorityQueueHeadRelay\n …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f80922y));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20602o c20602o = new C20602o();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: as1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41194fs1.m40685g(Function1.this, obj);
            }
        });
        C0058AG<Optional<FlightBannerNode>> c0058ag = this.f80869C;
        final C20603p c20603p = new C20603p();
        Observable<R> map = c0058ag.map(new InterfaceC23492o() { // from class: bs1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m40684h;
                m40684h = C41194fs1.m40684h(Function1.this, obj);
                return m40684h;
            }
        });
        final C20604q c20604q = new C20604q();
        Observable doOnNext = map.doOnNext(new InterfaceC23484g() { // from class: cs1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41194fs1.m40683i(Function1.this, obj);
            }
        });
        final C20605r c20605r = C20605r.f80967g;
        Observable switchMap = doOnNext.switchMap(new InterfaceC23492o() { // from class: ds1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m40682j;
                m40682j = C41194fs1.m40682j(Function1.this, obj);
                return m40682j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "override fun onCreate() …it)\n        }\n      }\n  }");
        Object m33094as2 = switchMap.m33094as(AutoDispose.m45239a(this.f80922y));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20607s c20607s = new C20607s();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: es1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41194fs1.m40681k(Function1.this, obj);
            }
        });
    }

    /* renamed from: l */
    public final void m40680l() {
        this.f80870D.accept(Optional.f63040c.m59033b(this.f80868B.peek()));
    }
}
