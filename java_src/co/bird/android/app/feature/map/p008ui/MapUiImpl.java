package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import android.view.View;
import android.widget.TextView;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.modelmanager.AreaModelManager;
import co.bird.android.app.feature.map.modelmanager.MerchantSiteModelManager;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.app.feature.map.p008ui.MapUiImpl;
import co.bird.android.app.feature.map.p008ui.renderer.AreaRenderer;
import co.bird.android.app.feature.map.p008ui.renderer.MerchantSiteRenderer;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Point;
import co.bird.android.model.Route;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireMerchantSite;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.gms.maps.model.VisibleRegion;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 Ó\u00012\u00020\u00012\u00020\u0002:\u0002Ó\u0001Bx\u0012\b\u0010Ï\u0001\u001a\u00030Î\u0001\u0012\t\u0010Ð\u0001\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010h\u001a\u00020g\u0012\b\u0010m\u001a\u0004\u0018\u00010l\u0012\u0006\u0010r\u001a\u00020q\u0012\u0006\u0010v\u001a\u00020J\u0012\u0006\u0010z\u001a\u00020J\u0012\u0006\u0010}\u001a\u00020|¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\rH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\rH\u0016J\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u00030\u00130\u0012J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0016J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0018\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0016J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\rH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\rH\u0016J\u0010\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0016J\u0016\u0010*\u001a\u00020\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0014H\u0016J(\u0010/\u001a\u00020\u00052\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020 H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020%0\r2\u0006\u0010\b\u001a\u00020%H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\u0016\u00105\u001a\u00020\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0014H\u0016J\u0016\u00108\u001a\u00020\u00052\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0014H\u0016J\u001e\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u0002092\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0014H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u0014\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030=0\rH\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u0002060\rH\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J \u0010B\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00032\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0016J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u000fH\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020E0\u0014H\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016J\b\u0010H\u001a\u00020GH\u0016J\u0010\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020\u000fH\u0016J\u0018\u0010O\u001a\u00020\u00052\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u000fH\u0004R\u001a\u0010Q\u001a\u00020P8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010V\u001a\u00020U8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010[\u001a\u00020Z8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\u00020_8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010#\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010d\u001a\u0004\be\u0010fR\u001a\u0010h\u001a\u00020g8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001c\u0010m\u001a\u0004\u0018\u00010l8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010r\u001a\u00020q8\u0004X\u0084\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001a\u0010z\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bz\u0010w\u001a\u0004\b{\u0010yR\u001b\u0010}\u001a\u00020|8\u0004X\u0084\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0083\u0001\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001R,\u0010\u0089\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030=0\u0088\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R0\u0010\u008d\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u00030\u00130\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008a\u0001R\u001a\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R'\u0010\u0093\u0001\u001a\u0012\u0012\r\u0012\u000b \u0092\u0001*\u0004\u0018\u00010%0%0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R%\u0010\u001d\u001a\u0012\u0012\r\u0012\u000b \u0092\u0001*\u0004\u0018\u00010\u001c0\u001c0\u0091\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0094\u0001R \u0010\u0095\u0001\u001a\u00030\u0081\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0083\u0001\u001a\u0006\b\u0096\u0001\u0010\u0085\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010 \u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R)\u0010©\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030=0¨\u00018\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R5\u0010\u00ad\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u00030\u00130¨\u00018\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010ª\u0001\u001a\u0006\b®\u0001\u0010¬\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001RR\u0010²\u0001\u001a5\u00121\u0012/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u0003 \u0092\u0001*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00130\u00130\r8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R:\u0010¶\u0001\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003 \u0092\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010=0=0\r8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b¶\u0001\u0010³\u0001\u001a\u0006\b·\u0001\u0010µ\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010À\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R!\u0010Æ\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R%\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÇ\u0001\u0010³\u0001\u001a\u0006\bÈ\u0001\u0010µ\u0001R\u0016\u0010Ê\u0001\u001a\u00020J8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010yR\u0017\u0010Í\u0001\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001¨\u0006Ô\u0001"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapUiImpl;", "LxE;", "Lco/bird/android/app/feature/map/ui/MapUi;", "", "getZoomLevelForMovingTo", "", "onDestroy", "Landroid/location/Location;", "location", "updateMyLocation", "direction", "updateLocationRotate", "removeRoute", "Lio/reactivex/Observable;", "mapClicks", "Lcom/google/android/gms/maps/model/LatLng;", "mapClicksLocation", "centerLocationChanged", "Lio/reactivex/k;", "Lkotlin/Pair;", "", "viewportChanged", "myLocationClicks", "zoomLevel", "zoomTo", "(Landroid/location/Location;Ljava/lang/Float;)V", "Lco/bird/android/model/Point;", "points", "Lcom/google/android/gms/maps/model/CameraPosition;", "cameraPosition", "moveTo", "clearBirds", "", "nearbyRadius", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "cameraPositionUpdates", "Lco/bird/android/model/wire/WireLocation;", "mapLongClicks", "myLocationLongClicks", "Lco/bird/android/model/wire/WireMerchantSite;", "sites", "setMerchantSites", "startLatitude", "startLongitude", "endLatitude", "endLongitude", "setDestination", "clearDestination", "showTeleportMarker", "removeTeleportMarker", "Lco/bird/android/model/persistence/Area;", "areas", "setAreas", "Lco/bird/android/model/persistence/ZonePolygonable;", "zones", "setZones", "", "key", "setAdditionalAreas", "setAreasCompleteChanges", "Lco/bird/android/buava/Optional;", "selectedAreaMarker", "zoneClicks", "hideInfoWindow", "viewport", "updateAreasUi", "point", "showInfoWindowForNonOperationalArea", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "latLngViewport", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "latlng", "", "viewportContains", "Lco/bird/android/model/Route;", "route", "includeLatLng", "drawRouteAndZoom", "Li66;", "traceProvider", "Li66;", "getTraceProvider", "()Li66;", "LTq4;", "reactiveConfig", "LTq4;", "getReactiveConfig", "()LTq4;", "LOh;", "appBuildConfig", "LOh;", "getAppBuildConfig", "()LOh;", "LcD1;", "map", "LcD1;", "getMap", "()LcD1;", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "getReactiveMapEvent", "()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lcom/google/android/gms/maps/MapView;", "getMapView", "()Lcom/google/android/gms/maps/MapView;", "Landroid/view/View;", "myLocationButton", "Landroid/view/View;", "getMyLocationButton", "()Landroid/view/View;", "Lco/bird/android/model/constant/MapMode;", "mode", "Lco/bird/android/model/constant/MapMode;", "getMode", "()Lco/bird/android/model/constant/MapMode;", "drawUserLocation", "Z", "getDrawUserLocation", "()Z", "userDirectionalArrow", "getUserDirectionalArrow", "Ldr4;", "locationManager", "Ldr4;", "getLocationManager", "()Ldr4;", "", "zoomPaddingPx", "I", "getZoomPaddingPx", "()I", "extraLargeZoomPaddingPx", "getExtraLargeZoomPaddingPx", "La94;", "mutableZoomLevelObservable", "La94;", "getMutableZoomLevelObservable", "()La94;", "mutableViewportChanges", "Landroid/widget/TextView;", "locationDebugText", "Landroid/widget/TextView;", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "mapLongClickSubject", "Lio/reactivex/subjects/d;", "pathColor", "getPathColor", "LMX3;", "currentRoute", "LMX3;", "getCurrentRoute", "()LMX3;", "setCurrentRoute", "(LMX3;)V", "LfM2;", "locationMarker", "LfM2;", "teleportMarker", "Lxj0;", "radiusCircle", "Lxj0;", "Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;", "areasUi", "Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;", "LZ84;", "zoomLevelObservable", "LZ84;", "getZoomLevelObservable", "()LZ84;", "viewportChangesObservable", "getViewportChangesObservable", "Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;", "areaModelManager", "Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;", "mapModelManagerViewportChangesObservable", "Lio/reactivex/Observable;", "getMapModelManagerViewportChangesObservable", "()Lio/reactivex/Observable;", "mapModelManagerZoomObservable", "getMapModelManagerZoomObservable", "Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;", "merchantSiteModelManager", "Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;", "", "LhF0;", "destinationCurves", "Ljava/util/List;", "LjF0;", "curveManager", "LjF0;", "destinationMarker$delegate", "Lkotlin/Lazy;", "getDestinationMarker", "()LfM2;", "destinationMarker", "destinationFlagClicks", "getDestinationFlagClicks", "getShowLocationDebugData", "showLocationDebugData", "getCenterLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "centerLocation", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "initialCameraPosition", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLdr4;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUi.kt\nco/bird/android/app/feature/map/ui/MapUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,538:1\n180#2:539\n161#2:540\n180#2:541\n180#2:542\n1855#3,2:543\n1855#3,2:545\n1855#3,2:547\n*S KotlinDebug\n*F\n+ 1 MapUi.kt\nco/bird/android/app/feature/map/ui/MapUiImpl\n*L\n226#1:539\n235#1:540\n241#1:541\n247#1:542\n337#1:543,2\n430#1:545,2\n513#1:547,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl */
/* loaded from: classes2.dex */
public class MapUiImpl extends AbstractC30071xE implements MapUi {
    public static final Companion Companion = new Companion(null);
    private static final long MAP_MODEL_MANAGER_ZOOM_THROTTLE_MS = 500;
    private final InterfaceC6097Oh appBuildConfig;
    private final AreaModelManager areaModelManager;
    private final MapAreasUiImpl areasUi;
    private final C24558d<CameraPosition> cameraPosition;
    private MX3 currentRoute;
    private final C43196jF0 curveManager;
    private final List<InterfaceC42010hF0> destinationCurves;
    private final Observable<Unit> destinationFlagClicks;
    private final Lazy destinationMarker$delegate;
    private final boolean drawUserLocation;
    private final int extraLargeZoomPaddingPx;
    private final TextView locationDebugText;
    private final InterfaceC40001dr4 locationManager;
    private C40889fM2 locationMarker;
    private final C39011cD1 map;
    private final C24558d<WireLocation> mapLongClickSubject;
    private final Observable<Pair<List<LatLng>, Float>> mapModelManagerViewportChangesObservable;
    private final Observable<Optional<Float>> mapModelManagerZoomObservable;
    private final MapView mapView;
    private final MerchantSiteModelManager merchantSiteModelManager;
    private final MapMode mode;
    private final C37791a94<Pair<List<LatLng>, Float>> mutableViewportChanges;
    private final C37791a94<Optional<Float>> mutableZoomLevelObservable;
    private final View myLocationButton;
    private final int pathColor;
    private C51775xj0 radiusCircle;
    private final C36207Tq4 reactiveConfig;
    private final ReactiveMapEvent reactiveMapEvent;
    private C40889fM2 teleportMarker;
    private final InterfaceC42524i66 traceProvider;
    private final boolean userDirectionalArrow;
    private final Z84<Pair<List<LatLng>, Float>> viewportChangesObservable;
    private final Z84<Optional<Float>> zoomLevelObservable;
    private final int zoomPaddingPx;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$1 */
    /* loaded from: classes2.dex */
    public static final class C138671 extends Lambda implements Function1<Unit, Unit> {
        public C138671() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            MapUiImpl.this.cameraPosition.onNext(MapUiImpl.this.getMap().m61679i());
            MapUiImpl.this.getMutableZoomLevelObservable().accept(Optional.f63040c.m59032c(Float.valueOf(MapUiImpl.this.getMap().m61679i().f71395c)));
            C40889fM2 c40889fM2 = MapUiImpl.this.teleportMarker;
            if (c40889fM2 != null) {
                c40889fM2.m41528f();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/google/android/gms/maps/model/LatLng;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$2 */
    /* loaded from: classes2.dex */
    public static final class C138682 extends Lambda implements Function1<Pair<? extends List<? extends LatLng>, ? extends Float>, Unit> {
        public C138682() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends LatLng>, ? extends Float> pair) {
            invoke2((Pair<? extends List<LatLng>, Float>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<LatLng>, Float> it) {
            C37791a94 c37791a94 = MapUiImpl.this.mutableViewportChanges;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37791a94.accept(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$3 */
    /* loaded from: classes2.dex */
    public static final class C138693 extends Lambda implements Function1<LatLng, Unit> {
        public C138693() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            invoke2(latLng);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LatLng latLng) {
            MapUiImpl.this.mapLongClickSubject.onNext(new WireLocation(latLng.f71430b, latLng.f71431c, null, null, null, null, false, null, null, 508, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$4 */
    /* loaded from: classes2.dex */
    public static final class C138704 extends Lambda implements Function1<LatLng, Unit> {
        public C138704() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            invoke2(latLng);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LatLng latLng) {
            MapUiImpl.this.removeTeleportMarker();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapUiImpl$Companion;", "", "()V", "MAP_MODEL_MANAGER_ZOOM_THROTTLE_MS", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapUiImpl$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUiImpl(BaseActivity activity, CameraPosition cameraPosition, InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mode, boolean z, boolean z2, InterfaceC40001dr4 locationManager) {
        super(activity);
        List emptyList;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.traceProvider = traceProvider;
        this.reactiveConfig = reactiveConfig;
        this.appBuildConfig = appBuildConfig;
        this.map = map;
        this.reactiveMapEvent = reactiveMapEvent;
        this.mapView = mapView;
        this.myLocationButton = view;
        this.mode = mode;
        this.drawUserLocation = z;
        this.userDirectionalArrow = z2;
        this.locationManager = locationManager;
        this.zoomPaddingPx = activity.getResources().getDimensionPixelSize(C37044Xf4.map_zoom_padding);
        this.extraLargeZoomPaddingPx = activity.getResources().getDimensionPixelSize(C37044Xf4.map_zoom_padding_xlarge);
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        C37791a94<Optional<Float>> create$default = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        this.mutableZoomLevelObservable = create$default;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C37791a94<Pair<List<LatLng>, Float>> create$default2 = C37791a94.C10586a.create$default(c10586a, TuplesKt.m28425to(emptyList, Float.valueOf(0.0f)), null, 2, null);
        this.mutableViewportChanges = create$default2;
        this.locationDebugText = (TextView) C40788fB0.m41758x(activity, C31680Ah4.locationDebugText);
        C24558d<WireLocation> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireLocation>()");
        this.mapLongClickSubject = m31902e;
        C24558d<CameraPosition> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<CameraPosition>()");
        this.cameraPosition = m31902e2;
        this.pathColor = C40788fB0.m41776f(activity, C32364Df4.extraGreen);
        MapAreasUiImpl mapAreasUiImpl = new MapAreasUiImpl(activity, map, reactiveMapEvent, reactiveConfig, appBuildConfig, locationManager);
        this.areasUi = mapAreasUiImpl;
        Z84.C10119a c10119a = Z84.f47888d;
        Z84<Optional<Float>> m73663b = c10119a.m73663b(create$default);
        this.zoomLevelObservable = m73663b;
        Z84<Pair<List<LatLng>, Float>> m73663b2 = c10119a.m73663b(create$default2);
        this.viewportChangesObservable = m73663b2;
        this.areaModelManager = new AreaModelManager(new AreaRenderer(new MapUiImpl$areaModelManager$1(mapAreasUiImpl)), traceProvider);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable<Pair<List<LatLng>, Float>> m32084i = m73663b2.throttleLatest(MAP_MODEL_MANAGER_ZOOM_THROTTLE_MS, timeUnit).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "viewportChangesObservabl…replay(1)\n    .refCount()");
        this.mapModelManagerViewportChangesObservable = m32084i;
        Observable<Optional<Float>> m32084i2 = m73663b.throttleLatest(MAP_MODEL_MANAGER_ZOOM_THROTTLE_MS, timeUnit).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i2, "zoomLevelObservable\n    …replay(1)\n    .refCount()");
        this.mapModelManagerZoomObservable = m32084i2;
        this.merchantSiteModelManager = new MerchantSiteModelManager(new MerchantSiteRenderer(activity, map), reactiveConfig, m32084i2);
        this.destinationCurves = new ArrayList();
        C43196jF0 c43196jF0 = new C43196jF0(map);
        c43196jF0.m30944h(new InterfaceC45810nf3() { // from class: QL2
            @Override // p000.InterfaceC45810nf3
            /* renamed from: a */
            public final void mo23343a(InterfaceC42010hF0 interfaceC42010hF0) {
                MapUiImpl.curveManager$lambda$1$lambda$0(MapUiImpl.this, interfaceC42010hF0);
            }
        });
        this.curveManager = c43196jF0;
        lazy = LazyKt__LazyJVMKt.lazy(new MapUiImpl$destinationMarker$2(this, activity));
        this.destinationMarker$delegate = lazy;
        map.m61673o(false);
        map.m61676l().m4916b(false);
        if (cameraPosition != null) {
            moveTo(cameraPosition);
        }
        Object m33094as = reactiveMapEvent.cameraMoves().m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138671 c138671 = new C138671();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: RL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapUiImpl._init_$lambda$2(Function1.this, obj);
            }
        });
        AbstractC24490k<Pair<List<LatLng>, Float>> m32111s0 = viewportChanged().m32111s0(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "viewportChanged()\n      …Schedulers.computation())");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138682 c138682 = new C138682();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: SL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapUiImpl._init_$lambda$3(Function1.this, obj);
            }
        });
        Object m33094as2 = reactiveMapEvent.mapLongClicks().m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138693 c138693 = new C138693();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: TL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapUiImpl._init_$lambda$4(Function1.this, obj);
            }
        });
        Object m33094as3 = reactiveMapEvent.mapClicks().m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138704 c138704 = new C138704();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: UL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapUiImpl._init_$lambda$5(Function1.this, obj);
            }
        });
        Observable<C40889fM2> markerClicks = reactiveMapEvent.markerClicks();
        final MapUiImpl$destinationFlagClicks$1 mapUiImpl$destinationFlagClicks$1 = new MapUiImpl$destinationFlagClicks$1(this);
        Observable<C40889fM2> filter = markerClicks.filter(new InterfaceC23494q() { // from class: VL2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean destinationFlagClicks$lambda$7;
                destinationFlagClicks$lambda$7 = MapUiImpl.destinationFlagClicks$lambda$7(Function1.this, obj);
                return destinationFlagClicks$lambda$7;
            }
        });
        final MapUiImpl$destinationFlagClicks$2 mapUiImpl$destinationFlagClicks$2 = MapUiImpl$destinationFlagClicks$2.INSTANCE;
        Observable map2 = filter.map(new InterfaceC23492o() { // from class: ML2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit destinationFlagClicks$lambda$8;
                destinationFlagClicks$lambda$8 = MapUiImpl.destinationFlagClicks$lambda$8(Function1.this, obj);
                return destinationFlagClicks$lambda$8;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "reactiveMapEvent.markerC…er.id }\n    .map { Unit }");
        this.destinationFlagClicks = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean centerLocationChanged$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LatLng centerLocationChanged$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LatLng) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void curveManager$lambda$1$lambda$0(MapUiImpl this$0, InterfaceC42010hF0 curve) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<InterfaceC42010hF0> list = this$0.destinationCurves;
        Intrinsics.checkNotNullExpressionValue(curve, "curve");
        list.add(curve);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean destinationFlagClicks$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destinationFlagClicks$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C40889fM2 getDestinationMarker() {
        return (C40889fM2) this.destinationMarker$delegate.getValue();
    }

    private final boolean getShowLocationDebugData() {
        return this.reactiveConfig.m82623f8().m73665a().getEnableLocationDebugInfoOnMapScreen();
    }

    private final float getZoomLevelForMovingTo() {
        Float m59035e = this.zoomLevelObservable.m73665a().m59035e();
        if (m59035e != null) {
            float floatValue = m59035e.floatValue();
            if (floatValue < 12.0f) {
                return 12.0f;
            }
            return floatValue;
        }
        return 17.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapClicks$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair viewportChanged$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<CameraPosition> cameraPositionUpdates() {
        Observable<CameraPosition> hide = this.cameraPosition.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "cameraPosition.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<LatLng> centerLocationChanged() {
        Observable<Unit> observeOn = this.reactiveMapEvent.cameraIdles().debounce(MAP_MODEL_MANAGER_ZOOM_THROTTLE_MS, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final MapUiImpl$centerLocationChanged$1 mapUiImpl$centerLocationChanged$1 = new MapUiImpl$centerLocationChanged$1(this);
        Observable<R> map = observeOn.map(new InterfaceC23492o() { // from class: NL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                LatLng centerLocationChanged$lambda$9;
                centerLocationChanged$lambda$9 = MapUiImpl.centerLocationChanged$lambda$9(Function1.this, obj);
                return centerLocationChanged$lambda$9;
            }
        });
        final MapUiImpl$centerLocationChanged$2 mapUiImpl$centerLocationChanged$2 = MapUiImpl$centerLocationChanged$2.INSTANCE;
        Observable<LatLng> filter = map.filter(new InterfaceC23494q() { // from class: OL2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean centerLocationChanged$lambda$10;
                centerLocationChanged$lambda$10 = MapUiImpl.centerLocationChanged$lambda$10(Function1.this, obj);
                return centerLocationChanged$lambda$10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "override fun centerLocat… { it.isProbablyValid() }");
        return filter;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void clearBirds() {
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void clearDestination() {
        getDestinationMarker().m41516r(false);
        for (InterfaceC42010hF0 interfaceC42010hF0 : this.destinationCurves) {
            interfaceC42010hF0.remove();
        }
        this.destinationCurves.clear();
    }

    public final void drawRouteAndZoom(Route route, LatLng includeLatLng) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(includeLatLng, "includeLatLng");
        MX3 mx3 = this.currentRoute;
        if (mx3 != null) {
            mx3.m95179a();
        }
        PolylineOptions m50611j1 = new PolylineOptions().m50622E(this.pathColor).m50610k1(new RoundCap()).m50620F(new RoundCap()).m50611j1(2);
        Intrinsics.checkNotNullExpressionValue(m50611j1, "PolylineOptions()\n      …ointType(JointType.ROUND)");
        LatLngBounds.C17620a m50670s = LatLngBounds.m50670s();
        Intrinsics.checkNotNullExpressionValue(m50670s, "builder()");
        for (LatLng latLng : route.getPoints()) {
            m50611j1.m50607s(latLng);
            m50670s.m50666b(latLng);
        }
        m50670s.m50666b(includeLatLng);
        this.currentRoute = this.map.m61683e(m50611j1);
        if (this.mode == MapMode.RIDER) {
            C39011cD1 c39011cD1 = this.map;
            LatLngBounds m50667a = m50670s.m50667a();
            Intrinsics.checkNotNullExpressionValue(m50667a, "latLngBounds.build()");
            MapUiKt.safeAnimateCamera$default(c39011cD1, m50667a, 100, null, 4, null);
        }
    }

    public final InterfaceC6097Oh getAppBuildConfig() {
        return this.appBuildConfig;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public LatLng getCenterLocation() {
        LatLng latLng = this.map.m61679i().f71394b;
        Intrinsics.checkNotNullExpressionValue(latLng, "map.cameraPosition.target");
        return latLng;
    }

    public final MX3 getCurrentRoute() {
        return this.currentRoute;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<Unit> getDestinationFlagClicks() {
        return this.destinationFlagClicks;
    }

    public final boolean getDrawUserLocation() {
        return this.drawUserLocation;
    }

    public final int getExtraLargeZoomPaddingPx() {
        return this.extraLargeZoomPaddingPx;
    }

    public final InterfaceC40001dr4 getLocationManager() {
        return this.locationManager;
    }

    public final C39011cD1 getMap() {
        return this.map;
    }

    public final Observable<Pair<List<LatLng>, Float>> getMapModelManagerViewportChangesObservable() {
        return this.mapModelManagerViewportChangesObservable;
    }

    public final Observable<Optional<Float>> getMapModelManagerZoomObservable() {
        return this.mapModelManagerZoomObservable;
    }

    public final MapView getMapView() {
        return this.mapView;
    }

    public final MapMode getMode() {
        return this.mode;
    }

    public final C37791a94<Optional<Float>> getMutableZoomLevelObservable() {
        return this.mutableZoomLevelObservable;
    }

    public final View getMyLocationButton() {
        return this.myLocationButton;
    }

    public final int getPathColor() {
        return this.pathColor;
    }

    public final C36207Tq4 getReactiveConfig() {
        return this.reactiveConfig;
    }

    public final ReactiveMapEvent getReactiveMapEvent() {
        return this.reactiveMapEvent;
    }

    public final InterfaceC42524i66 getTraceProvider() {
        return this.traceProvider;
    }

    public final boolean getUserDirectionalArrow() {
        return this.userDirectionalArrow;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public final Z84<Pair<List<LatLng>, Float>> getViewportChangesObservable() {
        return this.viewportChangesObservable;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public final Z84<Optional<Float>> getZoomLevelObservable() {
        return this.zoomLevelObservable;
    }

    public final int getZoomPaddingPx() {
        return this.zoomPaddingPx;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void hideInfoWindow() {
        this.areasUi.hideInfoWindow();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public LatLngBounds latLngBounds() {
        LatLngBounds latLngBounds = this.map.m61677k().m81934b().f71509f;
        Intrinsics.checkNotNullExpressionValue(latLngBounds, "map.projection.visibleRegion.latLngBounds");
        return latLngBounds;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public List<LatLng> latLngViewport() {
        List<LatLng> listOf;
        VisibleRegion m81934b = this.map.m61677k().m81934b();
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LatLng[]{m81934b.f71507d, m81934b.f71508e, m81934b.f71506c, m81934b.f71505b});
        return listOf;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<Unit> mapClicks() {
        Observable<LatLng> mapClicks = this.reactiveMapEvent.mapClicks();
        final MapUiImpl$mapClicks$1 mapUiImpl$mapClicks$1 = MapUiImpl$mapClicks$1.INSTANCE;
        Observable map = mapClicks.map(new InterfaceC23492o() { // from class: PL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit mapClicks$lambda$6;
                mapClicks$lambda$6 = MapUiImpl.mapClicks$lambda$6(Function1.this, obj);
                return mapClicks$lambda$6;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "reactiveMapEvent.mapClicks().map { Unit }");
        return map;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<LatLng> mapClicksLocation() {
        return this.reactiveMapEvent.mapClicks();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<WireLocation> mapLongClicks() {
        Observable<WireLocation> hide = this.mapLongClickSubject.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "mapLongClickSubject.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public final void moveTo(CameraPosition cameraPosition) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        LatLng latLng = cameraPosition.f71394b;
        this.map.m61675m(C48149rc0.m15705e(new LatLng(latLng.f71430b, latLng.f71431c), cameraPosition.f71395c));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<Unit> myLocationClicks() {
        View view = this.myLocationButton;
        if (view != null) {
            return C45219mf5.m25214a(view);
        }
        return null;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<Unit> myLocationLongClicks() {
        Observable<Unit> m19007b;
        View view = this.myLocationButton;
        if (view != null) {
            m19007b = C46998pf5.m19007b(view, null, 1, null);
            return m19007b;
        }
        return null;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public double nearbyRadius() {
        return GoogleMap_Kt.nearbyRadius(this.map);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void onDestroy() {
        this.curveManager.m30943i();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public ReactiveMapEvent reactiveMapEvent() {
        return this.reactiveMapEvent;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void removeRoute() {
        MX3 mx3 = this.currentRoute;
        if (mx3 != null) {
            mx3.m95179a();
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void removeTeleportMarker() {
        C40889fM2 c40889fM2 = this.teleportMarker;
        if (c40889fM2 != null) {
            c40889fM2.m41528f();
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Optional<Area>> selectedAreaMarker() {
        return this.areasUi.selectedAreaMarker();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void setAdditionalAreas(String key, List<Area> areas) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(areas, "areas");
        this.areasUi.setAdditionalAreas(key, areas);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void setAreas(List<Area> areas) {
        Intrinsics.checkNotNullParameter(areas, "areas");
        this.areaModelManager.setItems(areas);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Unit> setAreasCompleteChanges() {
        Observable<Unit> areasCompleteChanges = this.areasUi.setAreasCompleteChanges();
        Intrinsics.checkNotNullExpressionValue(areasCompleteChanges, "areasUi.setAreasCompleteChanges()");
        return areasCompleteChanges;
    }

    public final void setCurrentRoute(MX3 mx3) {
        this.currentRoute = mx3;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void setDestination(double d, double d2, double d3, double d4) {
        getDestinationMarker().m41521m(new LatLng(d3, d4));
        getDestinationMarker().m41516r(true);
        LatLng latLng = new LatLng(d, d2);
        LatLng m41532b = getDestinationMarker().m41532b();
        Intrinsics.checkNotNullExpressionValue(m41532b, "destinationMarker.position");
        C43789kF0 c43789kF0 = new C43789kF0();
        c43789kF0.m29151a(latLng, m41532b);
        c43789kF0.m29150b(false);
        c43789kF0.m29139m(150.0f);
        c43789kF0.m29140l(18.0f);
        c43789kF0.m29141k(new RoundCap());
        c43789kF0.m29148d(new RoundCap());
        c43789kF0.m29147e(false);
        c43789kF0.m29142j(0.5f);
        c43789kF0.m29149c(C40788fB0.m41776f(getActivity(), C32364Df4.destination_line));
        C43789kF0 c43789kF02 = new C43789kF0();
        c43789kF02.m29151a(latLng, m41532b);
        c43789kF02.m29150b(false);
        c43789kF02.m29139m(150.0f);
        c43789kF02.m29140l(18.0f);
        c43789kF02.m29141k(new RoundCap());
        c43789kF02.m29148d(new RoundCap());
        c43789kF02.m29142j(0.1f);
        c43789kF02.m29147e(false);
        c43789kF02.m29149c(C40788fB0.m41776f(getActivity(), C32364Df4.destination_line_shadow));
        this.curveManager.m30946f(c43789kF0);
        this.curveManager.m30946f(c43789kF02);
        C39011cD1 c39011cD1 = this.map;
        LatLngBounds m50667a = LatLngBounds.m50670s().m50666b(latLng).m50666b(m41532b).m50667a();
        Intrinsics.checkNotNullExpressionValue(m50667a, "builder().include(start).include(end).build()");
        MapUiKt.safeAnimateCamera$default(c39011cD1, m50667a, this.extraLargeZoomPaddingPx, null, 4, null);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void setMerchantSites(List<WireMerchantSite> sites) {
        Intrinsics.checkNotNullParameter(sites, "sites");
        this.merchantSiteModelManager.setItems(sites);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZonesUi
    public void setZones(List<ZonePolygonable> zones) {
        Intrinsics.checkNotNullParameter(zones, "zones");
        this.areasUi.setZones(zones);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForArea(Area area, LatLng latLng) {
        MapUi.DefaultImpls.showInfoWindowForArea(this, area, latLng);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForNonOperationalArea(LatLng point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.areasUi.showInfoWindowForNonOperationalArea(point);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public Observable<WireLocation> showTeleportMarker(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        C40889fM2 c40889fM2 = this.teleportMarker;
        if (c40889fM2 != null) {
            c40889fM2.m41528f();
        }
        C40889fM2 m61685c = this.map.m61685c(new MarkerOptions().m50643u1(GoogleMap_Kt.toLatLng(location)).m50644u(0.5f, 1.0f).m50657N0(C40788fB0.m41767o(getActivity(), C48193rg4.ic_location_dark, 36, 36)).m50658L1("Change location").m50661J1("Tap to change your location to this point"));
        this.teleportMarker = m61685c;
        if (m61685c != null) {
            m61685c.m41514t();
        }
        return C37279Yf5.m74575T(this.reactiveMapEvent.infoWindowClicks(), new MapUiImpl$showTeleportMarker$1(this));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void updateAreasUi(float f, List<LatLng> list) {
        this.areasUi.updateAreasUi(f, list);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void updateLocationRotate(float f) {
        C40889fM2 c40889fM2 = this.locationMarker;
        if (c40889fM2 != null) {
            c40889fM2.m41524j(true);
        }
        C40889fM2 c40889fM22 = this.locationMarker;
        if (c40889fM22 != null) {
            c40889fM22.m41520n(f);
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void updateMyLocation(Location location) {
        int i;
        TextView textView;
        Intrinsics.checkNotNullParameter(location, "location");
        if (getShowLocationDebugData() && (textView = this.locationDebugText) != null) {
            textView.setText(location.toString());
        }
        TextView textView2 = this.locationDebugText;
        if (textView2 != null) {
            C49520tu6.show$default(textView2, getShowLocationDebugData(), 0, 2, null);
        }
        if (!this.drawUserLocation) {
            return;
        }
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (this.userDirectionalArrow) {
            i = C48193rg4.ic_user_location_v2;
        } else {
            i = C48193rg4.ic_user_location;
        }
        int i2 = i;
        C40889fM2 c40889fM2 = this.locationMarker;
        if (c40889fM2 == null) {
            this.locationMarker = this.map.m61685c(new MarkerOptions().m50643u1(latLng).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.icon$default(getActivity(), i2, null, null, 6, null)).m50658L1(getActivity().getString(C45871nl4.map_my_location)).m50651Y1(100.0f).m50664E(true));
            C39011cD1 c39011cD1 = this.map;
            CircleOptions m50695m0 = new CircleOptions().m50693s(latLng).m50695m0(location.getAccuracy());
            int i3 = C32364Df4.birdBlue20;
            this.radiusCircle = c39011cD1.m61687a(m50695m0.m50692u(getColor(i3)).m50694p0(getColor(i3)).m50702E0(100.0f));
            return;
        }
        if (c40889fM2 != null) {
            c40889fM2.m41521m(latLng);
        }
        C51775xj0 c51775xj0 = this.radiusCircle;
        if (c51775xj0 != null) {
            c51775xj0.m4797a(latLng);
        }
        C51775xj0 c51775xj02 = this.radiusCircle;
        if (c51775xj02 != null) {
            c51775xj02.m4796b(location.getAccuracy());
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public List<Geolocation> viewport() {
        List<Geolocation> listOf;
        VisibleRegion m81934b = this.map.m61677k().m81934b();
        Intrinsics.checkNotNullExpressionValue(m81934b, "map.projection.visibleRegion");
        LatLng latLng = m81934b.f71507d;
        Intrinsics.checkNotNullExpressionValue(latLng, "visibleRegion.farLeft");
        LatLng latLng2 = m81934b.f71508e;
        Intrinsics.checkNotNullExpressionValue(latLng2, "visibleRegion.farRight");
        LatLng latLng3 = m81934b.f71506c;
        Intrinsics.checkNotNullExpressionValue(latLng3, "visibleRegion.nearRight");
        LatLng latLng4 = m81934b.f71505b;
        Intrinsics.checkNotNullExpressionValue(latLng4, "visibleRegion.nearLeft");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Geolocation[]{MapUiKt.toGeolocation(latLng), MapUiKt.toGeolocation(latLng2), MapUiKt.toGeolocation(latLng3), MapUiKt.toGeolocation(latLng4)});
        return listOf;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public final AbstractC24490k<Pair<List<LatLng>, Float>> viewportChanged() {
        Observable observeOn = Observable.merge(this.reactiveMapEvent.cameraIdles(), this.reactiveMapEvent.cameraMoveCancels()).observeOn(C23454a.m33087a());
        final MapUiImpl$viewportChanged$1 mapUiImpl$viewportChanged$1 = new MapUiImpl$viewportChanged$1(this);
        AbstractC24490k<Pair<List<LatLng>, Float>> flowable = observeOn.map(new InterfaceC23492o() { // from class: LL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair viewportChanged$lambda$11;
                viewportChanged$lambda$11 = MapUiImpl.viewportChanged$lambda$11(Function1.this, obj);
                return viewportChanged$lambda$11;
            }
        }).toFlowable(EnumC23460b.LATEST);
        Intrinsics.checkNotNullExpressionValue(flowable, "final override fun viewp…kpressureStrategy.LATEST)");
        return flowable;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public boolean viewportContains(LatLng latlng) {
        Intrinsics.checkNotNullParameter(latlng, "latlng");
        return GoogleMap_Kt.visibleRegionContains(this.map, latlng);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZonesUi
    public Observable<ZonePolygonable> zoneClicks() {
        return this.areasUi.zoneClicks();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void zoomTo(Location location, Float f) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.map.m61682f(C48149rc0.m15705e(new LatLng(location.getLatitude(), location.getLongitude()), f != null ? f.floatValue() : getZoomLevelForMovingTo()));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void moveTo(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.map.m61675m(C48149rc0.m15705e(new LatLng(location.getLatitude(), location.getLongitude()), getZoomLevelForMovingTo()));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapUi
    public void zoomTo(List<? extends Point> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        LatLngBounds.C17620a m50670s = LatLngBounds.m50670s();
        Intrinsics.checkNotNullExpressionValue(m50670s, "builder()");
        for (Point point : points) {
            m50670s.m50666b(new LatLng(point.f66612y, point.f66611x));
        }
        C39011cD1 c39011cD1 = this.map;
        LatLngBounds m50667a = m50670s.m50667a();
        Intrinsics.checkNotNullExpressionValue(m50667a, "latLngBoundsBuilder.build()");
        MapUiKt.safeAnimateCamera$default(c39011cD1, m50667a, this.zoomPaddingPx, null, 4, null);
    }
}
