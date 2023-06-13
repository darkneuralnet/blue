package co.bird.android.app.feature.operator.activity;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEventImpl;
import co.bird.android.app.feature.map.presenter.MapPresenter;
import co.bird.android.app.feature.map.presenter.MapPresenterImplFactory;
import co.bird.android.app.feature.operator.activity.OperatorActivity;
import co.bird.android.core.map.BaseMapActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.OperatorRole;
import co.bird.android.model.User;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.guness.widget.NavigationView;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C41707gk1;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 D2\u00020\u0001:\u0006ó\u0001ô\u0001õ\u0001B\t¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0014R\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\by\u0010s\u001a\u0004\bz\u0010u\"\u0004\b{\u0010wR'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R)\u0010\u0093\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u001a\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u001e\u0010·\u0001\u001a\u00020\u00158\u0014X\u0094\u0004¢\u0006\u000f\n\u0005\b´\u0001\u0010#\u001a\u0006\bµ\u0001\u0010¶\u0001R!\u0010½\u0001\u001a\u00030¸\u00018TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001c\u0010Å\u0001\u001a\u0005\u0018\u00010Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001c\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010Ì\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\n\u0010Ë\u0001R\u001c\u0010Ð\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001b\u0010Ó\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0003\u0010Ò\u0001R\u001c\u0010×\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001b\u0010Ú\u0001\u001a\u0005\u0018\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010Ù\u0001R\u001b\u0010Ý\u0001\u001a\u0005\u0018\u00010Û\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010Ü\u0001R\u001a\u0010á\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001a\u0010å\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001a\u0010é\u0001\u001a\u00030æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u001a\u0010í\u0001\u001a\u00030ê\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0019\u0010ð\u0001\u001a\u00030î\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b%\u0010ï\u0001¨\u0006ö\u0001"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorActivity;", "Lco/bird/android/core/map/BaseMapActivity;", "", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "LcD1;", "map", "onMapReady", "A0", "onPause", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "onPrepareOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "q0", "onDestroy", "LJy;", "H", "LJy;", "Q", "()LJy;", "kind", "LBK2;", "I", "LBK2;", "K0", "()LBK2;", "setMapMarkerOverridesManager", "(LBK2;)V", "mapMarkerOverridesManager", "LCw3;", "J", "LCw3;", "Y0", "()LCw3;", "setOperatorUi", "(LCw3;)V", "operatorUi", "LG03;", "K", "LG03;", "N0", "()LG03;", "setNavigationDrawerPresenterFactory", "(LG03;)V", "navigationDrawerPresenterFactory", "LPm3;", "P", "LPm3;", "M0", "()LPm3;", "setMapUiFactory", "(LPm3;)V", "mapUiFactory", "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "L0", "()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;", "setMapPresenterFactory", "(Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;)V", "mapPresenterFactory", "LHs3;", "R", "LHs3;", "V0", "()LHs3;", "setOperatorPresenterFactory", "(LHs3;)V", "operatorPresenterFactory", "Landroid/os/Handler;", "S", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "handler", "LuQ3;", "T", "LuQ3;", "h1", "()LuQ3;", "setPermissionDelegate", "(LuQ3;)V", "permissionDelegate", "LRh6;", "U", "LRh6;", "i1", "()LRh6;", "setUserStream", "(LRh6;)V", "userStream", "LAs1;", "W", "LAs1;", "F0", "()LAs1;", "setFlightSheetDelegate", "(LAs1;)V", "flightSheetDelegate", "Luk1;", "X", "Luk1;", "E0", "()Luk1;", "setBannerAnnouncementPresenterFactory", "(Luk1;)V", "bannerAnnouncementPresenterFactory", "Y", "Q0", "setOperatorAnnouncementPresenterFactory", "operatorAnnouncementPresenterFactory", "LSs3;", "Z", "LSs3;", "X0", "()LSs3;", "setOperatorReleasePresenter", "(LSs3;)V", "operatorReleasePresenter", "Lzq3;", "p0", "Lzq3;", "f1", "()Lzq3;", "setParkingNestPresenterFactory", "(Lzq3;)V", "parkingNestPresenterFactory", "LEj3;", "LEj3;", "R0", "()LEj3;", "setOperatorAreaPresenterFactory", "(LEj3;)V", "operatorAreaPresenterFactory", "LMk3;", "r0", "LMk3;", "S0", "()LMk3;", "setOperatorBountyPresenterFactory", "(LMk3;)V", "operatorBountyPresenterFactory", "LSm3;", "s0", "LSm3;", "U0", "()LSm3;", "setOperatorNestMarkerPresenterFactory", "(LSm3;)V", "operatorNestMarkerPresenterFactory", "Lnx3;", "t0", "Lnx3;", "Z0", "()Lnx3;", "setOperatorWarehousePresenterFactory", "(Lnx3;)V", "operatorWarehousePresenterFactory", "Lcy3;", AbstractC26684u0.f100690q, "Lcy3;", "a1", "()Lcy3;", "setOperatorZonePresenterFactory", "(Lcy3;)V", "operatorZonePresenterFactory", "v0", "o0", "()I", "layoutResource", "Lcom/google/android/gms/maps/MapView;", "w0", "Lkotlin/Lazy;", "n0", "()Lcom/google/android/gms/maps/MapView;", "googleMapView", "LJq3;", "x0", "LJq3;", "operatorPresenter", "Lyq3;", "y0", "Lyq3;", "parkingNestPresenter", "LEk3;", "z0", "LEk3;", "bountyPresenter", "Lco3;", "Lco3;", "nestPresenter", "Lmx3;", "B0", "Lmx3;", "warehousePresenter", "LZx3;", "LZx3;", "zonePresenter", "Lco/bird/android/app/feature/map/presenter/MapPresenter;", "D0", "Lco/bird/android/app/feature/map/presenter/MapPresenter;", "mapPresenter", "LaZ2;", "LaZ2;", "navigationDrawerPresenter", "LNm3;", "LNm3;", "mapUi", "LBj3;", "G0", "LBj3;", "operatorAreaPresenter", "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;", "H0", "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;", "locationEnableChangeReceiver", "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;", "I0", "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;", "bluetoothEnableChangeReceiver", "Lu4;", "J0", "Lu4;", "binding", "LCt6;", "LCt6;", "sideMenuBannerBinding", "<init>", "()V", C17296a.f69688o, "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorActivity.kt\nco/bird/android/app/feature/operator/activity/OperatorActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,436:1\n1#2:437\n44#3:438\n1549#4:439\n1620#4,3:440\n1855#4,2:443\n*S KotlinDebug\n*F\n+ 1 OperatorActivity.kt\nco/bird/android/app/feature/operator/activity/OperatorActivity\n*L\n157#1:438\n179#1:439\n179#1:440,3\n284#1:443,2\n*E\n"})
/* loaded from: classes2.dex */
public final class OperatorActivity extends BaseMapActivity {

    /* renamed from: L0 */
    public static final C13917a f61679L0 = new C13917a(null);

    /* renamed from: M0 */
    public static final int f61680M0 = 8;

    /* renamed from: N0 */
    public static final Set<Integer> f61681N0;

    /* renamed from: A0 */
    public C39360co3 f61682A0;

    /* renamed from: B0 */
    public C45397mx3 f61683B0;

    /* renamed from: C0 */
    public C37673Zx3 f61684C0;

    /* renamed from: D0 */
    public MapPresenter f61685D0;

    /* renamed from: E0 */
    public InterfaceC38024aZ2 f61686E0;

    /* renamed from: F0 */
    public InterfaceC34766Nm3 f61687F0;

    /* renamed from: G0 */
    public C31931Bj3 f61688G0;

    /* renamed from: H */
    public final EnumC4283Jy f61689H;

    /* renamed from: H0 */
    public LocationEnableChangeReceiver f61690H0;

    /* renamed from: I */
    public BK2 f61691I;

    /* renamed from: I0 */
    public BluetoothEnableChangeReceiver f61692I0;

    /* renamed from: J */
    public InterfaceC32282Cw3 f61693J;

    /* renamed from: J0 */
    public C29040u4 f61694J0;

    /* renamed from: K */
    public G03 f61695K;

    /* renamed from: K0 */
    public C32258Ct6 f61696K0;

    /* renamed from: P */
    public InterfaceC35234Pm3 f61697P;

    /* renamed from: Q */
    public MapPresenterImplFactory f61698Q;

    /* renamed from: R */
    public InterfaceC33416Hs3 f61699R;

    /* renamed from: S */
    public Handler f61700S;

    /* renamed from: T */
    public InterfaceC49820uQ3 f61701T;

    /* renamed from: U */
    public InterfaceC35660Rh6 f61702U;

    /* renamed from: W */
    public InterfaceC31776As1 f61703W;

    /* renamed from: X */
    public InterfaceC50008uk1 f61704X;

    /* renamed from: Y */
    public InterfaceC50008uk1 f61705Y;

    /* renamed from: Z */
    public C35990Ss3 f61706Z;

    /* renamed from: p0 */
    public InterfaceC53034zq3 f61707p0;

    /* renamed from: q0 */
    public InterfaceC32633Ej3 f61708q0;

    /* renamed from: r0 */
    public InterfaceC34514Mk3 f61709r0;

    /* renamed from: s0 */
    public InterfaceC35936Sm3 f61710s0;

    /* renamed from: t0 */
    public InterfaceC45990nx3 f61711t0;

    /* renamed from: u0 */
    public InterfaceC39478cy3 f61712u0;

    /* renamed from: v0 */
    public final int f61713v0;

    /* renamed from: w0 */
    public final Lazy f61714w0;

    /* renamed from: x0 */
    public InterfaceC33866Jq3 f61715x0;

    /* renamed from: y0 */
    public C52441yq3 f61716y0;

    /* renamed from: z0 */
    public C32642Ek3 f61717z0;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorActivity$a;", "", "", "", "REPAIR_LOOP_REQUEST_CODES", "Ljava/util/Set;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.operator.activity.OperatorActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13917a {
        public /* synthetic */ C13917a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13917a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;", "", "Lco/bird/android/app/feature/operator/activity/OperatorActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C13921c.class})
    /* renamed from: co.bird.android.app.feature.operator.activity.OperatorActivity$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC13918b {

        @Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0098\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH&¨\u0006!"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;", "operatorModule", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;", "mapScopeProvider", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "lifecycleScopeProvider", "Lcom/guness/widget/NavigationView;", "navigationView", "Lco/bird/android/model/constant/FlightSheetContext;", "flightSheetContext", "", "repairFlow", "Lu4;", "binding", "LCt6;", "sideMenuBannerBinding", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "LDQ3;", "permissionManager", "Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Component.Factory
        /* renamed from: co.bird.android.app.feature.operator.activity.OperatorActivity$b$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC13919a {

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.app.feature.operator.activity.OperatorActivity$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C13920a {
                public static /* synthetic */ InterfaceC13918b create$default(InterfaceC13919a interfaceC13919a, InterfaceC44393lG2 interfaceC44393lG2, C13921c c13921c, BaseActivity baseActivity, ScopeProvider scopeProvider, AndroidLifecycleScopeProvider androidLifecycleScopeProvider, LifecycleScopeProvider lifecycleScopeProvider, NavigationView navigationView, FlightSheetContext flightSheetContext, boolean z, C29040u4 c29040u4, C32258Ct6 c32258Ct6, FragmentManager fragmentManager, AbstractC11719f abstractC11719f, DQ3 dq3, int i, Object obj) {
                    FlightSheetContext flightSheetContext2;
                    boolean z2;
                    if (obj == null) {
                        if ((i & 128) != 0) {
                            flightSheetContext2 = FlightSheetContext.STANDARD;
                        } else {
                            flightSheetContext2 = flightSheetContext;
                        }
                        if ((i & 256) != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        return interfaceC13919a.mo60287a(interfaceC44393lG2, c13921c, baseActivity, scopeProvider, androidLifecycleScopeProvider, lifecycleScopeProvider, navigationView, flightSheetContext2, z2, c29040u4, c32258Ct6, fragmentManager, abstractC11719f, dq3);
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
                }
            }

            /* renamed from: a */
            InterfaceC13918b mo60287a(InterfaceC44393lG2 interfaceC44393lG2, C13921c c13921c, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance AndroidLifecycleScopeProvider androidLifecycleScopeProvider, @BindsInstance LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, @BindsInstance NavigationView navigationView, @BindsInstance FlightSheetContext flightSheetContext, @BindsInstance boolean z, @BindsInstance C29040u4 c29040u4, @BindsInstance C32258Ct6 c32258Ct6, @BindsInstance FragmentManager fragmentManager, @BindsInstance AbstractC11719f abstractC11719f, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo60286a(OperatorActivity operatorActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;", "", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "<init>", "(LTq4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC13922a.class})
    /* renamed from: co.bird.android.app.feature.operator.activity.OperatorActivity$c */
    /* loaded from: classes2.dex */
    public static final class C13921c {

        /* renamed from: a */
        public final C36207Tq4 f61718a;

        @Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\nH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\nH'J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH'J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH'¨\u0006#"}, m28432d2 = {"Lco/bird/android/app/feature/operator/activity/OperatorActivity$c$a;", "", "Led3;", "impl", "Ldd3;", DateTokenConverter.CONVERTER_KEY, "LAo0;", "Luo0;", C17296a.f69688o, "LPw3;", "LCw3;", "f", "operatorUi", "LWs1;", "l", "Llp0;", "k", "LWs3;", "e", "LPk3;", "g", "Lpo3;", "i", "Lqx3;", "c", "Lfy3;", "h", "LUk3;", "operatorAnnouncementUi", "Lxk1;", "j", "LQt1;", "delegate", "LAs1;", "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.app.feature.operator.activity.OperatorActivity$c$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC13922a {
            @Binds
            /* renamed from: a */
            InterfaceC50047uo0 m60305a(C31739Ao0 c31739Ao0);

            @Binds
            /* renamed from: b */
            InterfaceC31776As1 m60304b(C35529Qt1 c35529Qt1);

            @Binds
            /* renamed from: c */
            InterfaceC47769qx3 m60303c(C35324Pw3 c35324Pw3);

            @Binds
            /* renamed from: d */
            InterfaceC39861dd3 m60302d(C40453ed3 c40453ed3);

            @Binds
            /* renamed from: e */
            InterfaceC36926Ws3 m60301e(C35324Pw3 c35324Pw3);

            @Binds
            /* renamed from: f */
            InterfaceC32282Cw3 m60300f(C35324Pw3 c35324Pw3);

            @Binds
            /* renamed from: g */
            InterfaceC35216Pk3 m60299g(C35324Pw3 c35324Pw3);

            @Binds
            /* renamed from: h */
            InterfaceC41256fy3 m60298h(C35324Pw3 c35324Pw3);

            @Binds
            /* renamed from: i */
            InterfaceC47086po3 m60297i(C35324Pw3 c35324Pw3);

            @Binds
            /* renamed from: j */
            InterfaceC51786xk1 m60296j(C36386Uk3 c36386Uk3);

            @Binds
            /* renamed from: k */
            InterfaceC44721lp0 m60295k(InterfaceC32282Cw3 interfaceC32282Cw3);

            @Binds
            /* renamed from: l */
            InterfaceC36924Ws1 m60294l(InterfaceC32282Cw3 interfaceC32282Cw3);
        }

        public C13921c(C36207Tq4 reactiveConfig) {
            Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
            this.f61718a = reactiveConfig;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/android/gms/maps/MapView;", "kotlin.jvm.PlatformType", "b", "()Lcom/google/android/gms/maps/MapView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.operator.activity.OperatorActivity$d */
    /* loaded from: classes2.dex */
    public static final class C13923d extends Lambda implements Function0<MapView> {
        public C13923d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final MapView invoke() {
            return (MapView) OperatorActivity.this.findViewById(C36585Vg4.mapView);
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{10035, 10036});
        f61681N0 = of;
    }

    public OperatorActivity() {
        super(true);
        Lazy lazy;
        this.f61689H = EnumC4283Jy.OPERATOR;
        this.f61713v0 = C39311cj4.activity_operator;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C13923d());
        this.f61714w0 = lazy;
    }

    /* renamed from: j1 */
    public static final void m60306j1(OperatorActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC38024aZ2 interfaceC38024aZ2 = this$0.f61686E0;
        if (interfaceC38024aZ2 != null) {
            interfaceC38024aZ2.mo71218c(C50583vi4.nav_inspection);
        }
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: A0 */
    public void mo58947A0(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.mo58947A0(map);
        MapPresenter mapPresenter = this.f61685D0;
        if (mapPresenter != null) {
            mapPresenter.onResume(m58995p0());
        }
        InterfaceC33866Jq3 interfaceC33866Jq3 = this.f61715x0;
        if (interfaceC33866Jq3 != null) {
            interfaceC33866Jq3.onResume();
        }
        m60313X0().m84706m(m58995p0());
        C39360co3 c39360co3 = this.f61682A0;
        if (c39360co3 != null) {
            c39360co3.m53807p1();
        }
        C32642Ek3 c32642Ek3 = this.f61717z0;
        if (c32642Ek3 != null) {
            c32642Ek3.m108507O0();
        }
        InterfaceC38024aZ2 interfaceC38024aZ2 = this.f61686E0;
        if (interfaceC38024aZ2 != null) {
            interfaceC38024aZ2.onResume();
        }
    }

    /* renamed from: C0 */
    public final void m60325C0() {
        C29040u4 c29040u4 = this.f61694J0;
        C29040u4 c29040u42 = null;
        if (c29040u4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29040u4 = null;
        }
        Toolbar toolbar = c29040u4.f111642E;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        C29040u4 c29040u43 = this.f61694J0;
        if (c29040u43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29040u43 = null;
        }
        DrawerLayout drawerLayout = c29040u43.f111654k;
        Intrinsics.checkNotNullExpressionValue(drawerLayout, "binding.drawer");
        C29040u4 c29040u44 = this.f61694J0;
        if (c29040u44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c29040u42 = c29040u44;
        }
        NavigationView navigationView = c29040u42.f111662s;
        Intrinsics.checkNotNullExpressionValue(navigationView, "binding.navigationView");
        D03 mo103080a = m60319N0().mo103080a(m58963Z(), new T03(this, toolbar, drawerLayout, navigationView, m58965X(), mo58955y()), mo58957w(), mo58956x());
        this.f61686E0 = mo103080a;
        if (mo103080a != null) {
            mo103080a.mo71220a();
        }
    }

    /* renamed from: E0 */
    public final InterfaceC50008uk1 m60324E0() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f61704X;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bannerAnnouncementPresenterFactory");
        return null;
    }

    /* renamed from: F0 */
    public final InterfaceC31776As1 m60323F0() {
        InterfaceC31776As1 interfaceC31776As1 = this.f61703W;
        if (interfaceC31776As1 != null) {
            return interfaceC31776As1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flightSheetDelegate");
        return null;
    }

    /* renamed from: K0 */
    public final BK2 m60322K0() {
        BK2 bk2 = this.f61691I;
        if (bk2 != null) {
            return bk2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapMarkerOverridesManager");
        return null;
    }

    /* renamed from: L0 */
    public final MapPresenterImplFactory m60321L0() {
        MapPresenterImplFactory mapPresenterImplFactory = this.f61698Q;
        if (mapPresenterImplFactory != null) {
            return mapPresenterImplFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapPresenterFactory");
        return null;
    }

    /* renamed from: M0 */
    public final InterfaceC35234Pm3 m60320M0() {
        InterfaceC35234Pm3 interfaceC35234Pm3 = this.f61697P;
        if (interfaceC35234Pm3 != null) {
            return interfaceC35234Pm3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mapUiFactory");
        return null;
    }

    /* renamed from: N0 */
    public final G03 m60319N0() {
        G03 g03 = this.f61695K;
        if (g03 != null) {
            return g03;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationDrawerPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity
    /* renamed from: Q */
    public EnumC4283Jy mo58969Q() {
        return this.f61689H;
    }

    /* renamed from: Q0 */
    public final InterfaceC50008uk1 m60318Q0() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f61705Y;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorAnnouncementPresenterFactory");
        return null;
    }

    /* renamed from: R0 */
    public final InterfaceC32633Ej3 m60317R0() {
        InterfaceC32633Ej3 interfaceC32633Ej3 = this.f61708q0;
        if (interfaceC32633Ej3 != null) {
            return interfaceC32633Ej3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorAreaPresenterFactory");
        return null;
    }

    /* renamed from: S0 */
    public final InterfaceC34514Mk3 m60316S0() {
        InterfaceC34514Mk3 interfaceC34514Mk3 = this.f61709r0;
        if (interfaceC34514Mk3 != null) {
            return interfaceC34514Mk3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorBountyPresenterFactory");
        return null;
    }

    /* renamed from: U0 */
    public final InterfaceC35936Sm3 m60315U0() {
        InterfaceC35936Sm3 interfaceC35936Sm3 = this.f61710s0;
        if (interfaceC35936Sm3 != null) {
            return interfaceC35936Sm3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorNestMarkerPresenterFactory");
        return null;
    }

    /* renamed from: V0 */
    public final InterfaceC33416Hs3 m60314V0() {
        InterfaceC33416Hs3 interfaceC33416Hs3 = this.f61699R;
        if (interfaceC33416Hs3 != null) {
            return interfaceC33416Hs3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorPresenterFactory");
        return null;
    }

    /* renamed from: X0 */
    public final C35990Ss3 m60313X0() {
        C35990Ss3 c35990Ss3 = this.f61706Z;
        if (c35990Ss3 != null) {
            return c35990Ss3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorReleasePresenter");
        return null;
    }

    /* renamed from: Y0 */
    public final InterfaceC32282Cw3 m60312Y0() {
        InterfaceC32282Cw3 interfaceC32282Cw3 = this.f61693J;
        if (interfaceC32282Cw3 != null) {
            return interfaceC32282Cw3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorUi");
        return null;
    }

    /* renamed from: Z0 */
    public final InterfaceC45990nx3 m60311Z0() {
        InterfaceC45990nx3 interfaceC45990nx3 = this.f61711t0;
        if (interfaceC45990nx3 != null) {
            return interfaceC45990nx3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorWarehousePresenterFactory");
        return null;
    }

    /* renamed from: a1 */
    public final InterfaceC39478cy3 m60310a1() {
        InterfaceC39478cy3 interfaceC39478cy3 = this.f61712u0;
        if (interfaceC39478cy3 != null) {
            return interfaceC39478cy3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("operatorZonePresenterFactory");
        return null;
    }

    /* renamed from: f1 */
    public final InterfaceC53034zq3 m60309f1() {
        InterfaceC53034zq3 interfaceC53034zq3 = this.f61707p0;
        if (interfaceC53034zq3 != null) {
            return interfaceC53034zq3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parkingNestPresenterFactory");
        return null;
    }

    /* renamed from: h1 */
    public final InterfaceC49820uQ3 m60308h1() {
        InterfaceC49820uQ3 interfaceC49820uQ3 = this.f61701T;
        if (interfaceC49820uQ3 != null) {
            return interfaceC49820uQ3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("permissionDelegate");
        return null;
    }

    /* renamed from: i1 */
    public final InterfaceC35660Rh6 m60307i1() {
        InterfaceC35660Rh6 interfaceC35660Rh6 = this.f61702U;
        if (interfaceC35660Rh6 != null) {
            return interfaceC35660Rh6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStream");
        return null;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: n0 */
    public MapView mo58944n0() {
        Object value = this.f61714w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-googleMapView>(...)");
        return (MapView) value;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: o0 */
    public int mo58943o0() {
        return this.f61713v0;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C29040u4 c29040u4 = this.f61694J0;
        C29040u4 c29040u42 = null;
        if (c29040u4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29040u4 = null;
        }
        if (c29040u4.f111654k.m67611C(8388611)) {
            C29040u4 c29040u43 = this.f61694J0;
            if (c29040u43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c29040u42 = c29040u43;
            }
            c29040u42.f111654k.m67588d(8388611);
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C29040u4 c29040u4;
        C32258Ct6 c32258Ct6;
        ArrayList arrayList;
        List<OperatorRole> operatorRoles;
        int collectionSizeOrDefault;
        C36677Vq6 m79345a;
        setTheme(C32184Cl4.LightAppTheme_NoActionBar);
        super.onCreate(bundle);
        C29040u4 m10920a = C29040u4.m10920a(findViewById(C36585Vg4.drawer));
        Intrinsics.checkNotNullExpressionValue(m10920a, "bind(findViewById(R.id.drawer))");
        this.f61694J0 = m10920a;
        if (m10920a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m10920a = null;
        }
        View m45931u = m10920a.f111662s.m45931u();
        if (m45931u != null && (m79345a = C36677Vq6.m79345a(m45931u)) != null) {
            C32258Ct6 c32258Ct62 = m79345a.f39844c;
            Intrinsics.checkNotNullExpressionValue(c32258Ct62, "binding.sideMenuBanner");
            this.f61696K0 = c32258Ct62;
        }
        InterfaceC13918b.InterfaceC13919a m60288a = C13928a.m60288a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C13921c c13921c = new C13921c(mo58955y());
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        AndroidLifecycleScopeProvider m58995p0 = m58995p0();
        NavigationView navigationView = (NavigationView) findViewById(C36585Vg4.navigationView);
        C29040u4 c29040u42 = this.f61694J0;
        if (c29040u42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29040u4 = null;
        } else {
            c29040u4 = c29040u42;
        }
        C32258Ct6 c32258Ct63 = this.f61696K0;
        if (c32258Ct63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sideMenuBannerBinding");
            c32258Ct6 = null;
        } else {
            c32258Ct6 = c32258Ct63;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC11719f lifecycle = getLifecycle();
        DQ3 mo58956x = mo58956x();
        Intrinsics.checkNotNullExpressionValue(m60288a, "factory()");
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        InterfaceC13918b.InterfaceC13919a.C13920a.create$default(m60288a, m21419a, c13921c, this, m45197b, m58995p0, m58963Z, navigationView, null, false, c29040u4, c32258Ct6, supportFragmentManager, lifecycle, mo58956x, 384, null).mo60286a(this);
        C29040u4 c29040u43 = this.f61694J0;
        if (c29040u43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29040u43 = null;
        }
        c29040u43.f111642E.setTitle(getString(C45871nl4.contractor_activity_title));
        C29040u4 c29040u44 = this.f61694J0;
        if (c29040u44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29040u44 = null;
        }
        setSupportActionBar(c29040u44.f111642E);
        m60325C0();
        this.f61690H0 = new LocationEnableChangeReceiver(m60308h1());
        BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver = new BluetoothEnableChangeReceiver(m60308h1());
        this.f61692I0 = bluetoothEnableChangeReceiver;
        registerReceiver(bluetoothEnableChangeReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        BroadcastReceiver broadcastReceiver = this.f61690H0;
        if (broadcastReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationEnableChangeReceiver");
            broadcastReceiver = null;
        }
        registerReceiver(broadcastReceiver, new IntentFilter("android.location.MODE_CHANGED"));
        User mo76584a = m60307i1().mo76584a();
        if (mo76584a != null && (operatorRoles = mo76584a.getOperatorRoles()) != null) {
            List<OperatorRole> list = operatorRoles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorRole operatorRole : list) {
                arrayList.add(operatorRole.getRole());
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        m60324E0().mo8210a(null, AnnouncementContext.SIDE_MENU, new C41707gk1.C22436h(null, null, MapMode.OPERATOR.toString(), arrayList2, 3, null));
        m60318Q0().mo8210a(null, AnnouncementContext.OPERATOR_MAP, new C41707gk1.C22436h(null, null, null, arrayList2, 7, null));
        m60313X0().m84708k();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_operator_activity, menu);
        m60312Y0().mo89339Z0(menu);
        return true;
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        InterfaceC33866Jq3 interfaceC33866Jq3 = this.f61715x0;
        if (interfaceC33866Jq3 != null) {
            interfaceC33866Jq3.onDestroy();
        }
        InterfaceC34766Nm3 interfaceC34766Nm3 = this.f61687F0;
        if (interfaceC34766Nm3 != null) {
            interfaceC34766Nm3.onDestroy();
        }
        super.onDestroy();
        LocationEnableChangeReceiver locationEnableChangeReceiver = this.f61690H0;
        BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver = null;
        if (locationEnableChangeReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationEnableChangeReceiver");
            locationEnableChangeReceiver = null;
        }
        unregisterReceiver(locationEnableChangeReceiver);
        BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver2 = this.f61692I0;
        if (bluetoothEnableChangeReceiver2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bluetoothEnableChangeReceiver");
        } else {
            bluetoothEnableChangeReceiver = bluetoothEnableChangeReceiver2;
        }
        unregisterReceiver(bluetoothEnableChangeReceiver);
    }

    @Override // co.bird.android.core.map.BaseMapActivity, p000.InterfaceC36350Ug3
    public void onMapReady(C39011cD1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        super.onMapReady(map);
        map.m61676l().m4917a(true);
        boolean enableUserLocationV2 = mo58955y().m82623f8().m73665a().getRiderMapConfig().getEnableUserLocationV2();
        InterfaceC35234Pm3 m60320M0 = m60320M0();
        ReactiveMapEventImpl reactiveMapEventImpl = new ReactiveMapEventImpl(map);
        MapView mo58944n0 = mo58944n0();
        C29040u4 c29040u4 = this.f61694J0;
        ArrayList arrayList = null;
        if (c29040u4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c29040u4 = null;
        }
        C35000Om3 mo87948a = m60320M0.mo87948a(this, null, map, reactiveMapEventImpl, mo58944n0, c29040u4.f111661r, true, m60322K0(), enableUserLocationV2);
        this.f61687F0 = mo87948a;
        this.f61685D0 = m60321L0().create(m58995p0(), mo87948a, MapMode.OPERATOR, false);
        InterfaceC33416Hs3 m60314V0 = m60314V0();
        AndroidLifecycleScopeProvider m58995p0 = m58995p0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        InterfaceC32282Cw3 m60312Y0 = m60312Y0();
        InterfaceC40099e13 mo58957w = mo58957w();
        LocationEnableChangeReceiver locationEnableChangeReceiver = this.f61690H0;
        if (locationEnableChangeReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationEnableChangeReceiver");
            locationEnableChangeReceiver = null;
        }
        Observable<Boolean> m60328a = locationEnableChangeReceiver.m60328a();
        BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver = this.f61692I0;
        if (bluetoothEnableChangeReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bluetoothEnableChangeReceiver");
            bluetoothEnableChangeReceiver = null;
        }
        C49497ts3 mo101576a = m60314V0.mo101576a(m58995p0, m58963Z, mo87948a, m60312Y0, mo58957w, m60328a, bluetoothEnableChangeReceiver.m60330a(), m60323F0());
        Serializable serializableExtra = getIntent().getSerializableExtra("zoom_include_region");
        if (serializableExtra instanceof ArrayList) {
            arrayList = (ArrayList) serializableExtra;
        }
        mo101576a.m11503I1(arrayList);
        this.f61715x0 = mo101576a;
        C31931Bj3 mo106640a = m60317R0().mo106640a(m58963Z(), mo87948a);
        mo106640a.m113586y();
        this.f61688G0 = mo106640a;
        C39360co3 mo82979a = m60315U0().mo82979a(mo87948a, mo87948a);
        mo82979a.m53823k0();
        this.f61682A0 = mo82979a;
        C45397mx3 mo20237a = m60311Z0().mo20237a(mo87948a, mo87948a);
        mo20237a.m24638x();
        this.f61683B0 = mo20237a;
        C32642Ek3 mo93499a = m60316S0().mo93499a(mo87948a, m58963Z(), m60312Y0());
        mo93499a.m108491Z();
        this.f61717z0 = mo93499a;
        C52441yq3 mo386a = m60309f1().mo386a(mo87948a, m58963Z(), m60312Y0());
        mo386a.m2427v();
        this.f61716y0 = mo386a;
        C37673Zx3 mo43457a = m60310a1().mo43457a(mo87948a, mo87948a);
        mo43457a.m72270K();
        this.f61684C0 = mo43457a;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        C31931Bj3 c31931Bj3 = null;
        if (itemId == C36585Vg4.areaRefresh) {
            C31931Bj3 c31931Bj32 = this.f61688G0;
            if (c31931Bj32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("operatorAreaPresenter");
            } else {
                c31931Bj3 = c31931Bj32;
            }
            c31931Bj3.m113588w();
            return true;
        } else if (itemId == C36585Vg4.notifications) {
            InterfaceC40099e13.C19924a.goToNotificationCenter$default(mo58957w(), null, 1, null);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override // co.bird.android.core.map.BaseMapActivity, co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MapPresenter mapPresenter = this.f61685D0;
        if (mapPresenter != null) {
            mapPresenter.onPause();
        }
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IntRange until;
        Drawable mutate;
        super.onPrepareOptionsMenu(menu);
        if (menu == null) {
            return false;
        }
        until = RangesKt___RangesKt.until(0, menu.size());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            Drawable icon = menu.getItem(((IntIterator) it).nextInt()).getIcon();
            if (icon != null && (mutate = icon.mutate()) != null) {
                mutate.setTint(NA0.m94301c(this, C32364Df4.birdWhite));
            }
        }
        return true;
    }

    @Override // co.bird.android.core.map.BaseMapActivity
    /* renamed from: q0 */
    public void mo58942q0(int i, int i2, Intent intent, C39011cD1 map) {
        C39360co3 c39360co3;
        C39360co3 c39360co32;
        Intrinsics.checkNotNullParameter(map, "map");
        super.mo58942q0(i, i2, intent, map);
        if (f61681N0.contains(Integer.valueOf(i))) {
            if (i2 == -1) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ii3
                    @Override // java.lang.Runnable
                    public final void run() {
                        OperatorActivity.m60306j1(OperatorActivity.this);
                    }
                });
                return;
            }
            return;
        }
        int i3 = 0;
        if (i == 10067) {
            if (i2 == -1 && (c39360co32 = this.f61682A0) != null) {
                if (intent != null) {
                    i3 = intent.getIntExtra("nest_release_count", 0);
                }
                c39360co32.m53786w1(i3);
            }
        } else if (i == 10073) {
            if (i2 == -1) {
                C35990Ss3 m60313X0 = m60313X0();
                if (intent != null) {
                    i3 = intent.getIntExtra("nest_release_count", 0);
                }
                m60313X0.m84707l(i3);
            }
        } else if (i == 10068) {
            if (i2 == -1 && (c39360co3 = this.f61682A0) != null) {
                c39360co3.m53789v1();
            }
        } else {
            InterfaceC33866Jq3 interfaceC33866Jq3 = this.f61715x0;
            if (interfaceC33866Jq3 != null) {
                interfaceC33866Jq3.onActivityResult(i, i2, intent);
            }
            C31931Bj3 c31931Bj3 = this.f61688G0;
            if (c31931Bj3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("operatorAreaPresenter");
                c31931Bj3 = null;
            }
            c31931Bj3.m113587x(i, i2, intent);
        }
    }
}
