package co.bird.android.app.feature.map.p008ui;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.util.LruCache;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.infowindow.tag.PolygonTag;
import co.bird.android.app.feature.map.infowindow.tag.PolygonTagKt;
import co.bird.android.app.feature.map.p008ui.MapAreasUiImpl;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Detail;
import co.bird.android.model.Point;
import co.bird.android.model.Polygonable;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.constant.PopupInvocationMethod;
import co.bird.android.model.constant.PopupType;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.MobileMapConfigView;
import co.bird.android.model.wire.configs.OperatorConfig;
import co.bird.android.model.wire.configs.OperatorFeatureConfig;
import co.bird.android.model.wire.configs.OperatorMapConfig;
import co.bird.android.model.wire.configs.ZoneColorOverrideConfig;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008f\u0001BE\u0012\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001\u0012\u0006\u0010A\u001a\u00020!\u0012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J2\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0002J\u0014\u0010\u001b\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J7\u0010\u001f\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010$\u001a\u00020\u0007*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010)\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0002J\b\u0010*\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\u00020\u0007*\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\"H\u0002J\u0016\u0010-\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0'H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0016J\u0016\u00100\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0016J\u001e\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0016J,\u00104\u001a&\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00070\u0007 3*\u0012\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00070\u0007\u0018\u00010.0.H\u0016J\u0010\u00105\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016J\u001a\u00107\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\"H\u0016J\b\u00108\u001a\u00020\u0007H\u0016J \u0010:\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010'H\u0016J\u0014\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040;0.H\u0016J)\u0010?\u001a\u00020\u0004*\u00020\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u0004\u0018\u00010C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u00104\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00070\u00070L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010MR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00040N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR.\u0010S\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 3*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010;0;0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020Z0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010QR\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001b\u0010d\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010`R\u001b\u0010g\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010^\u001a\u0004\bf\u0010`R\u0016\u0010h\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00120j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020O0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010lRF\u0010s\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040' 3*\u0016\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'\u0018\u00010r0r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR.\u0010u\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 3*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'0'0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010MR\"\u0010v\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00040\u00040L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010MR\"\u0010w\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\n0\n0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010MR\u001b\u0010=\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010^\u001a\u0004\by\u0010zR\u001b\u0010>\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010^\u001a\u0004\b|\u0010zR\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010^\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0092\u0001²\u0006\u000e\u0010\u0091\u0001\u001a\u00030\u0090\u00018\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;", "LxE;", "Lco/bird/android/app/feature/map/ui/MapAreasUi;", "Lco/bird/android/app/feature/map/ui/MapZonesUi;", "Lco/bird/android/model/persistence/Area;", "area", "Lkotlin/Function0;", "", "showInfoWindow", "handleAreaClick", "Lco/bird/android/model/persistence/ZonePolygonable;", "zone", "handleZoneClick", "", "isDemandAreaWithSelectedOverlay", "", "zoomLevel", "maybeFlipAreaLabels", "LPT;", "bitmapDescriptor", "selected", "visible", "Lio/reactivex/p;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "getGroundOverlayOptions", "", "alpha", "updateAlpha", "", "iconRes", "color", "toBitmapDescriptor", "(Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)LPT;", "LcD1;", "Lcom/google/android/gms/maps/model/LatLng;", "point", "showInfoWindowForOutsideAreas", "toolTipMarkerIcon", "getCapZoneAreaMarkerIcon", "", "areas", "setAreaMarkers", "removeAllAreaMarkers", "at", "zones", "setZones", "Lio/reactivex/Observable;", "zoneClicks", "setAreas", "key", "setAdditionalAreas", "kotlin.jvm.PlatformType", "setAreasCompleteChanges", "showInfoWindowForNonOperationalArea", "closestTo", "showInfoWindowForArea", "hideInfoWindow", "viewport", "updateAreasUi", "Lco/bird/android/buava/Optional;", "selectedAreaMarker", "operationalAreaFillColorOverride", "operationalAreaBorderColorOverride", "flavorAdjustedArea", "(Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/persistence/Area;", "map", "LcD1;", "LTq4;", "reactiveConfig", "LTq4;", "LOh;", "appBuildConfig", "LOh;", "Ldr4;", "locationManager", "Ldr4;", "Lma4;", "Lma4;", "", "LfM2;", "areaMarkers", "Ljava/util/Map;", "Lio/reactivex/subjects/a;", "currentlySelectedMarkerArea", "Lio/reactivex/subjects/a;", "LDp6;", "areaMarkerView", "LDp6;", "invisibleInfoWindowMarker", "LfM2;", "LfE1;", "areaGroundOverlay", "Landroidx/appcompat/widget/AppCompatTextView;", "demandAreaLabelTextView$delegate", "Lkotlin/Lazy;", "getDemandAreaLabelTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "demandAreaLabelTextView", "areaLabelTextView$delegate", "getAreaLabelTextView", "areaLabelTextView", "rebalanceLabelTextView$delegate", "getRebalanceLabelTextView", "rebalanceLabelTextView", "labelsVisible", "Z", "Landroid/util/LruCache;", "bitmapCache", "Landroid/util/LruCache;", "", "areaLabelMarkers", "Ljava/util/List;", "groundOverlayOptionsCache", "LAG;", "", "additionalAreasToRender", "LAG;", "addLabelsToAreasRelay", "demandAreaClickRelay", "zonePolygonableClicks", "operationalAreaFillColorOverride$delegate", "getOperationalAreaFillColorOverride", "()I", "operationalAreaBorderColorOverride$delegate", "getOperationalAreaBorderColorOverride", "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;", "polygonableRenderer$delegate", "getPolygonableRenderer", "()Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;", "polygonableRenderer", "Lco/bird/android/model/wire/configs/MobileMapConfigView;", "getMapConfig", "()Lco/bird/android/model/wire/configs/MobileMapConfigView;", "mapConfig", "getEnableOptimizedMapRenderer", "()Ljava/lang/Boolean;", "enableOptimizedMapRenderer", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V", "Companion", "Landroid/location/Location;", "center", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapAreasUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,681:1\n180#2:682\n180#2:683\n180#2:684\n180#2:686\n237#2:687\n44#3:685\n1549#4:688\n1620#4,3:689\n1549#4:697\n1620#4,3:698\n1855#4,2:703\n766#4:705\n857#4,2:706\n1#5:692\n125#6:693\n152#6,3:694\n215#6,2:710\n1295#7,2:701\n1295#7,2:708\n*S KotlinDebug\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl\n*L\n160#1:682\n172#1:683\n177#1:684\n215#1:686\n275#1:687\n215#1:685\n309#1:688\n309#1:689,3\n334#1:697\n334#1:698,3\n407#1:703,2\n528#1:705\n528#1:706,2\n329#1:693\n329#1:694,3\n546#1:710,2\n397#1:701,2\n530#1:708,2\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl */
/* loaded from: classes2.dex */
public final class MapAreasUiImpl extends AbstractC30071xE implements MapAreasUi, MapZonesUi {
    private static final int ANIMATION_DURATION = 400;
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_AREA_FILL_ALPHA = 0.2f;
    private static final float DEMAND_AREA_LABEL_VISIBLE_ZOOM_LEVEL_THRESHOLD = 16.0f;
    private static final float VARIABLE_FEE_AREA_LABEL_VISIBLE_ZOOM_THRESHOLD = 13.0f;
    private final C45168ma4<List<Area>> addLabelsToAreasRelay;
    private final C0058AG<Map<String, List<Area>>> additionalAreasToRender;
    private final InterfaceC6097Oh appBuildConfig;
    private final Map<Area, C40816fE1> areaGroundOverlay;
    private final List<C40889fM2> areaLabelMarkers;
    private final Lazy areaLabelTextView$delegate;
    private C32456Dp6 areaMarkerView;
    private final Map<C40889fM2, Area> areaMarkers;
    private final LruCache<String, C6378PT> bitmapCache;
    private final C24552a<Optional<Area>> currentlySelectedMarkerArea;
    private final C45168ma4<Area> demandAreaClickRelay;
    private final Lazy demandAreaLabelTextView$delegate;
    private final LruCache<String, GroundOverlayOptions> groundOverlayOptionsCache;
    private C40889fM2 invisibleInfoWindowMarker;
    private boolean labelsVisible;
    private final InterfaceC40001dr4 locationManager;
    private final C39011cD1 map;
    private final Lazy operationalAreaBorderColorOverride$delegate;
    private final Lazy operationalAreaFillColorOverride$delegate;
    private final Lazy polygonableRenderer$delegate;
    private final C36207Tq4 reactiveConfig;
    private final Lazy rebalanceLabelTextView$delegate;
    private final C45168ma4<Unit> setAreasCompleteChanges;
    private final C45168ma4<ZonePolygonable> zonePolygonableClicks;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "kotlin.jvm.PlatformType", "marker", "", "invoke", "(LfM2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$1 */
    /* loaded from: classes2.dex */
    public static final class C138461 extends Lambda implements Function1<C40889fM2, Unit> {
        public C138461() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40889fM2 c40889fM2) {
            invoke2(c40889fM2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(C40889fM2 c40889fM2) {
            if (Intrinsics.areEqual(c40889fM2, MapAreasUiImpl.this.invisibleInfoWindowMarker)) {
                c40889fM2.m41528f();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001ab\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004 \u0006*0\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Area;", "areas", "Lna4;", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$10 */
    /* loaded from: classes2.dex */
    public static final class C1384710 extends Lambda implements Function1<List<? extends Area>, InterfaceC45761na4<? extends Pair<? extends Area, ? extends GroundOverlayOptions>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "area", "Lco/bird/android/model/persistence/Area;", "invoke", "(Lco/bird/android/model/persistence/Area;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$10$1 */
        /* loaded from: classes2.dex */
        public static final class C138481 extends Lambda implements Function1<Area, Boolean> {
            public static final C138481 INSTANCE = new C138481();

            public C138481() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Area area) {
                Intrinsics.checkNotNullParameter(area, "area");
                return Boolean.valueOf(area.getOverlayLabel() != null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001ab\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003 \u0005*0\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Area;", "area", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/model/persistence/Area;)Lio/reactivex/u;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$10$2 */
        /* loaded from: classes2.dex */
        public static final class C138492 extends Lambda implements Function1<Area, InterfaceC24574u<? extends Pair<? extends Area, ? extends GroundOverlayOptions>>> {
            final /* synthetic */ MapAreasUiImpl this$0;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Area;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "kotlin.jvm.PlatformType", "groundOverlay", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$10$2$1 */
            /* loaded from: classes2.dex */
            public static final class C138501 extends Lambda implements Function1<GroundOverlayOptions, Pair<? extends Area, ? extends GroundOverlayOptions>> {
                final /* synthetic */ Area $area;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C138501(Area area) {
                    super(1);
                    this.$area = area;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Pair<Area, GroundOverlayOptions> invoke(GroundOverlayOptions groundOverlay) {
                    Intrinsics.checkNotNullParameter(groundOverlay, "groundOverlay");
                    return TuplesKt.m28425to(this.$area, groundOverlay);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C138492(MapAreasUiImpl mapAreasUiImpl) {
                super(1);
                this.this$0 = mapAreasUiImpl;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC24574u<? extends Pair<Area, GroundOverlayOptions>> invoke(Area area) {
                Intrinsics.checkNotNullParameter(area, "area");
                if (area.isDemandArea()) {
                    MapAreasUiImpl mapAreasUiImpl = this.this$0;
                    AbstractC24507p groundOverlayOptions$default = MapAreasUiImpl.getGroundOverlayOptions$default(mapAreasUiImpl, area, MapAreasUiImpl.toBitmapDescriptor$default(mapAreasUiImpl, area.getOverlayLabel(), area, null, null, 6, null), false, false, 8, null);
                    final C138501 c138501 = new C138501(area);
                    AbstractC24507p m32067H = groundOverlayOptions$default.m32067H(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.ui.c
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair invoke$lambda$0;
                            invoke$lambda$0 = MapAreasUiImpl.C1384710.C138492.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(m32067H, "area ->\n            if (…ndOverlay }\n            }");
                    return m32067H;
                }
                AbstractC24507p m32068G = AbstractC24507p.m32068G(TuplesKt.m28425to(area, null));
                Intrinsics.checkNotNullExpressionValue(m32068G, "{\n              Maybe.ju…ea to null)\n            }");
                return m32068G;
            }
        }

        public C1384710() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC45761na4<? extends Pair<? extends Area, ? extends GroundOverlayOptions>> invoke(List<? extends Area> list) {
            return invoke2((List<Area>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC45761na4<? extends Pair<Area, GroundOverlayOptions>> invoke2(List<Area> areas) {
            Intrinsics.checkNotNullParameter(areas, "areas");
            AbstractC24490k m32141i0 = AbstractC24490k.m32141i0(areas);
            final C138481 c138481 = C138481.INSTANCE;
            AbstractC24490k m32175S = m32141i0.m32175S(new InterfaceC23494q() { // from class: co.bird.android.app.feature.map.ui.a
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = MapAreasUiImpl.C1384710.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C138492 c138492 = new C138492(MapAreasUiImpl.this);
            return m32175S.m32154d0(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.ui.b
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u invoke$lambda$1;
                    invoke$lambda$1 = MapAreasUiImpl.C1384710.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Area;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$11 */
    /* loaded from: classes2.dex */
    public static final class C1385111 extends Lambda implements Function1<Pair<? extends Area, ? extends GroundOverlayOptions>, Unit> {
        public C1385111() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Area, ? extends GroundOverlayOptions> pair) {
            invoke2((Pair<Area, GroundOverlayOptions>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Area, GroundOverlayOptions> pair) {
            Area area = pair.component1();
            GroundOverlayOptions component2 = pair.component2();
            if (component2 != null) {
                C40816fE1 m61686b = MapAreasUiImpl.this.map.m61686b(component2);
                if (m61686b != null) {
                    MapAreasUiImpl mapAreasUiImpl = MapAreasUiImpl.this;
                    m61686b.m41701h(0);
                    Map map = mapAreasUiImpl.areaGroundOverlay;
                    Intrinsics.checkNotNullExpressionValue(area, "area");
                    map.put(area, m61686b);
                    return;
                }
                return;
            }
            C39011cD1 c39011cD1 = MapAreasUiImpl.this.map;
            MarkerOptions m50643u1 = new MarkerOptions().m50643u1(GoogleMap_Kt.toLatLng(JX3.m100298a(area.getRegion())));
            MapAreasUiImpl mapAreasUiImpl2 = MapAreasUiImpl.this;
            String overlayLabel = area.getOverlayLabel();
            Intrinsics.checkNotNullExpressionValue(area, "area");
            AreaIconType overlayIcon = area.getOverlayIcon();
            C40889fM2 m61685c = c39011cD1.m61685c(m50643u1.m50657N0(mapAreasUiImpl2.toBitmapDescriptor(overlayLabel, area, overlayIcon != null ? C10854an.m70749b(overlayIcon) : null, Integer.valueOf(area.getBorderColor()))).m50651Y1(200.0f));
            if (m61685c == null) {
                return;
            }
            MapAreasUiImpl.this.areaLabelMarkers.add(m61685c);
            MapAreasUiImpl.this.areaMarkers.put(m61685c, area);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$12 */
    /* loaded from: classes2.dex */
    public static final class C1385212 extends Lambda implements Function1<Throwable, Unit> {
        public static final C1385212 INSTANCE = new C1385212();

        public C1385212() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while adding labels to areas, skipping this render request", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LfM2;", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/Area;", "invoke", "(LfM2;)Lco/bird/android/buava/Optional;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$2 */
    /* loaded from: classes2.dex */
    public static final class C138532 extends Lambda implements Function1<C40889fM2, Optional<Area>> {
        public C138532() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Optional<Area> invoke(C40889fM2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59033b(MapAreasUiImpl.this.areaMarkers.get(it));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$3 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138543 extends FunctionReferenceImpl implements Function1<Optional<Area>, Unit> {
        public C138543(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Area> optional) {
            invoke2(optional);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Optional<Area> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Polygonable;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$4 */
    /* loaded from: classes2.dex */
    public static final class C138554 extends Lambda implements Function1<Pair<? extends Polygonable, ? extends LatLng>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$4$1 */
        /* loaded from: classes2.dex */
        public static final class C138561 extends Lambda implements Function0<Unit> {
            final /* synthetic */ LatLng $latLng;
            final /* synthetic */ Polygonable $polygonable;
            final /* synthetic */ MapAreasUiImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C138561(Polygonable polygonable, MapAreasUiImpl mapAreasUiImpl, LatLng latLng) {
                super(0);
                this.$polygonable = polygonable;
                this.this$0 = mapAreasUiImpl;
                this.$latLng = latLng;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (((Area) this.$polygonable).toolTipTitle() != null) {
                    this.this$0.currentlySelectedMarkerArea.onNext(Optional.f63040c.m59034a());
                    MapAreasUiImpl mapAreasUiImpl = this.this$0;
                    mapAreasUiImpl.showInfoWindow(mapAreasUiImpl.map, (Area) this.$polygonable, this.$latLng);
                }
            }
        }

        public C138554() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Polygonable, ? extends LatLng> pair) {
            invoke2((Pair<? extends Polygonable, LatLng>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Polygonable, LatLng> pair) {
            Polygonable component1 = pair.component1();
            LatLng component2 = pair.component2();
            if (component1 instanceof Area) {
                MapAreasUiImpl mapAreasUiImpl = MapAreasUiImpl.this;
                mapAreasUiImpl.handleAreaClick((Area) component1, new C138561(component1, mapAreasUiImpl, component2));
            } else if (component1 instanceof ZonePolygonable) {
                MapAreasUiImpl.this.handleZoneClick((ZonePolygonable) component1);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/persistence/Area;", "invoke", "(Lco/bird/android/model/persistence/Area;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$5 */
    /* loaded from: classes2.dex */
    public static final class C138575 extends Lambda implements Function1<Area, Boolean> {
        public C138575() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Area it) {
            Z84<Config> m82623f8;
            Config value;
            OperatorConfig operatorConfig;
            OperatorFeatureConfig features;
            OperatorMapConfig map;
            Intrinsics.checkNotNullParameter(it, "it");
            C36207Tq4 c36207Tq4 = MapAreasUiImpl.this.reactiveConfig;
            boolean z = false;
            if (c36207Tq4 != null && (m82623f8 = c36207Tq4.m82623f8()) != null && (value = m82623f8.getValue()) != null && (operatorConfig = value.getOperatorConfig()) != null && (features = operatorConfig.getFeatures()) != null && (map = features.getMap()) != null && map.getShowRecommendedBirdsAfterTap()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "area", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$6 */
    /* loaded from: classes2.dex */
    public static final class C138586 extends Lambda implements Function1<Area, Unit> {
        public C138586() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Area area) {
            invoke2(area);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Area area) {
            C40816fE1 c40816fE1 = (C40816fE1) MapAreasUiImpl.this.areaGroundOverlay.get(area);
            if (c40816fE1 != null) {
                c40816fE1.m41706c();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/Area;", "area", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/model/persistence/Area;)Lio/reactivex/u;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$7 */
    /* loaded from: classes2.dex */
    public static final class C138597 extends Lambda implements Function1<Area, InterfaceC24574u<? extends Pair<? extends GroundOverlayOptions, ? extends Area>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "overlay", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$7$1 */
        /* loaded from: classes2.dex */
        public static final class C138601 extends Lambda implements Function1<GroundOverlayOptions, Pair<? extends GroundOverlayOptions, ? extends Area>> {
            final /* synthetic */ Area $area;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C138601(Area area) {
                super(1);
                this.$area = area;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<GroundOverlayOptions, Area> invoke(GroundOverlayOptions overlay) {
                Intrinsics.checkNotNullParameter(overlay, "overlay");
                return TuplesKt.m28425to(overlay, this.$area);
            }
        }

        public C138597() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC24574u<? extends Pair<GroundOverlayOptions, Area>> invoke(Area area) {
            C6378PT bitmapDescriptor$default;
            Intrinsics.checkNotNullParameter(area, "area");
            C40816fE1 c40816fE1 = (C40816fE1) MapAreasUiImpl.this.areaGroundOverlay.get(area);
            boolean areEqual = c40816fE1 != null ? Intrinsics.areEqual(c40816fE1.m41708a(), (Object) 1) : false;
            C40816fE1 c40816fE12 = (C40816fE1) MapAreasUiImpl.this.areaGroundOverlay.get(area);
            boolean m41707b = c40816fE12 != null ? c40816fE12.m41707b() : false;
            MapAreasUiImpl mapAreasUiImpl = MapAreasUiImpl.this;
            if (areEqual) {
                bitmapDescriptor$default = MapAreasUiImpl.toBitmapDescriptor$default(mapAreasUiImpl, area.getOverlayLabel(), area, null, null, 6, null);
            } else {
                bitmapDescriptor$default = MapAreasUiImpl.toBitmapDescriptor$default(mapAreasUiImpl, area.getSelectedOverlayLabel(), area, null, null, 6, null);
            }
            AbstractC24507p groundOverlayOptions = mapAreasUiImpl.getGroundOverlayOptions(area, bitmapDescriptor$default, !areEqual, m41707b);
            final C138601 c138601 = new C138601(area);
            return groundOverlayOptions.m32067H(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.ui.d
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = MapAreasUiImpl.C138597.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$8 */
    /* loaded from: classes2.dex */
    public static final class C138618 extends Lambda implements Function1<Pair<? extends GroundOverlayOptions, ? extends Area>, Unit> {
        public C138618() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends GroundOverlayOptions, ? extends Area> pair) {
            invoke2((Pair<GroundOverlayOptions, Area>) pair);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<GroundOverlayOptions, Area> pair) {
            GroundOverlayOptions component1 = pair.component1();
            Area area = pair.component2();
            C40816fE1 c40816fE1 = (C40816fE1) MapAreasUiImpl.this.areaGroundOverlay.get(area);
            int areEqual = c40816fE1 != null ? Intrinsics.areEqual(c40816fE1.m41708a(), (Object) 1) : 0;
            C40816fE1 it = MapAreasUiImpl.this.map.m61686b(component1);
            MapAreasUiImpl mapAreasUiImpl = MapAreasUiImpl.this;
            if (it != null) {
                it.m41701h(Integer.valueOf(areEqual ^ 1));
                Map map = mapAreasUiImpl.areaGroundOverlay;
                Intrinsics.checkNotNullExpressionValue(area, "area");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                map.put(area, it);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nMapAreasUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl$9\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,681:1\n1295#2,2:682\n*S KotlinDebug\n*F\n+ 1 MapAreasUi.kt\nco/bird/android/app/feature/map/ui/MapAreasUiImpl$9\n*L\n233#1:682,2\n*E\n"})
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$9 */
    /* loaded from: classes2.dex */
    public static final class C138629 extends Lambda implements Function1<List<? extends Area>, Unit> {
        public C138629() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Area> list) {
            invoke2((List<Area>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Area> list) {
            Sequence<Map.Entry> asSequence;
            asSequence = MapsKt___MapsKt.asSequence(MapAreasUiImpl.this.areaGroundOverlay);
            for (Map.Entry entry : asSequence) {
                ((C40816fE1) entry.getValue()).m41706c();
            }
            MapAreasUiImpl.this.labelsVisible = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$Companion;", "", "()V", "ANIMATION_DURATION", "", "DEFAULT_AREA_FILL_ALPHA", "", "DEMAND_AREA_LABEL_VISIBLE_ZOOM_LEVEL_THRESHOLD", "VARIABLE_FEE_AREA_LABEL_VISIBLE_ZOOM_THRESHOLD", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4283Jy.values().length];
            try {
                iArr[EnumC4283Jy.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4283Jy.CHARGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4283Jy.OPERATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ MapAreasUiImpl(BaseActivity baseActivity, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, InterfaceC40001dr4 interfaceC40001dr4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, c39011cD1, reactiveMapEvent, (i & 8) != 0 ? null : c36207Tq4, (i & 16) != 0 ? null : interfaceC6097Oh, interfaceC40001dr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC24574u _init_$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC45761na4 _init_$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ Area flavorAdjustedArea$default(MapAreasUiImpl mapAreasUiImpl, Area area, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        return mapAreasUiImpl.flavorAdjustedArea(area, num, num2);
    }

    private final AppCompatTextView getAreaLabelTextView() {
        return (AppCompatTextView) this.areaLabelTextView$delegate.getValue();
    }

    private final C6378PT getCapZoneAreaMarkerIcon(Area area) {
        Unit unit;
        Unit unit2;
        ColorStateList valueOf;
        ColorStateList valueOf2;
        C32456Dp6 c32456Dp6 = this.areaMarkerView;
        if (c32456Dp6 == null) {
            c32456Dp6 = C32456Dp6.m109873c(getActivity().getLayoutInflater());
            this.areaMarkerView = c32456Dp6;
            Intrinsics.checkNotNullExpressionValue(c32456Dp6, "inflate(activity.layoutI…areaMarkerView = it\n    }");
        }
        TextView textView = c32456Dp6.f6405b;
        Integer releaseCapacity = area.getReleaseCapacity();
        textView.setText((releaseCapacity == null || (r2 = releaseCapacity.toString()) == null) ? "" : "");
        Integer m33478d = C23356io.m33478d(area);
        if (m33478d != null) {
            ImageView imageView = c32456Dp6.f6406c;
            Intrinsics.checkNotNullExpressionValue(imageView, "view.icon");
            imageView.setImageResource(m33478d.intValue());
        }
        Integer m33477e = C23356io.m33477e(area, getActivity());
        if (m33477e != null && (valueOf2 = ColorStateList.valueOf(m33477e.intValue())) != null) {
            ImageView imageView2 = c32456Dp6.f6406c;
            Intrinsics.checkNotNullExpressionValue(imageView2, "view.icon");
            imageView2.setImageTintList(valueOf2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            c32456Dp6.f6406c.setImageTintList(null);
        }
        Integer m33479c = C23356io.m33479c(area, getActivity());
        if (m33479c != null && (valueOf = ColorStateList.valueOf(m33479c.intValue())) != null) {
            ImageView imageView3 = c32456Dp6.f6406c;
            Intrinsics.checkNotNullExpressionValue(imageView3, "view.icon");
            imageView3.setBackgroundTintList(valueOf);
            unit2 = Unit.INSTANCE;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            c32456Dp6.f6406c.setBackgroundTintList(null);
        }
        BaseActivity activity = getActivity();
        ConstraintLayout root = c32456Dp6.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "view.root");
        return C40788fB0.iconBitmapDescriptor$default(activity, root, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    private final AppCompatTextView getDemandAreaLabelTextView() {
        return (AppCompatTextView) this.demandAreaLabelTextView$delegate.getValue();
    }

    private final Boolean getEnableOptimizedMapRenderer() {
        Z84<Config> m82623f8;
        Config value;
        MobileMapConfigView riderMapConfig;
        Z84<Config> m82623f82;
        Config value2;
        OperatorConfig operatorConfig;
        OperatorFeatureConfig features;
        OperatorMapConfig map;
        int i = WhenMappings.$EnumSwitchMapping$0[getActivity().mo58969Q().ordinal()];
        if (i != 1) {
            if (i != 3) {
                return Boolean.FALSE;
            }
            C36207Tq4 c36207Tq4 = this.reactiveConfig;
            if (c36207Tq4 == null || (m82623f82 = c36207Tq4.m82623f8()) == null || (value2 = m82623f82.getValue()) == null || (operatorConfig = value2.getOperatorConfig()) == null || (features = operatorConfig.getFeatures()) == null || (map = features.getMap()) == null) {
                return null;
            }
            return Boolean.valueOf(map.getEnableOptimizedMapRenderer());
        }
        C36207Tq4 c36207Tq42 = this.reactiveConfig;
        if (c36207Tq42 == null || (m82623f8 = c36207Tq42.m82623f8()) == null || (value = m82623f8.getValue()) == null || (riderMapConfig = value.getRiderMapConfig()) == null) {
            return null;
        }
        return Boolean.valueOf(riderMapConfig.getEnableOptimizedMapRenderer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC24507p<GroundOverlayOptions> getGroundOverlayOptions(final Area area, final C6378PT c6378pt, final boolean z, final boolean z2) {
        AbstractC24507p<GroundOverlayOptions> m32056T = AbstractC24507p.m32071D(new Callable() { // from class: ZJ2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                GroundOverlayOptions groundOverlayOptions$lambda$21;
                groundOverlayOptions$lambda$21 = MapAreasUiImpl.getGroundOverlayOptions$lambda$21(C6378PT.this, area, z, z2, this);
                return groundOverlayOptions$lambda$21;
            }
        }).m32056T(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32056T, "fromCallable<GroundOverl…scribeOn(Schedulers.io())");
        return m32056T;
    }

    public static /* synthetic */ AbstractC24507p getGroundOverlayOptions$default(MapAreasUiImpl mapAreasUiImpl, Area area, C6378PT c6378pt, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return mapAreasUiImpl.getGroundOverlayOptions(area, c6378pt, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroundOverlayOptions getGroundOverlayOptions$lambda$21(C6378PT c6378pt, Area area, boolean z, boolean z2, MapAreasUiImpl this$0) {
        Intrinsics.checkNotNullParameter(area, "$area");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GroundOverlayOptions groundOverlayOptions = null;
        if (c6378pt == null) {
            return null;
        }
        String str = area.getId() + Detail.EMPTY_CHAR + c6378pt + Detail.EMPTY_CHAR + z + Detail.EMPTY_CHAR + z2;
        GroundOverlayOptions groundOverlayOptions2 = this$0.groundOverlayOptionsCache.get(str);
        if (groundOverlayOptions2 == null) {
            GroundOverlayOptions groundOverLayOptions = GoogleMap_Kt.groundOverLayOptions(area, c6378pt, z, z2);
            if (groundOverLayOptions != null) {
                this$0.groundOverlayOptionsCache.put(str, groundOverLayOptions);
                groundOverlayOptions = groundOverLayOptions;
            }
            return groundOverlayOptions;
        }
        return groundOverlayOptions2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MobileMapConfigView getMapConfig() {
        Z84<Config> m82623f8;
        Config value;
        C36207Tq4 c36207Tq4;
        Z84<Config> m82623f82;
        Config value2;
        int i = WhenMappings.$EnumSwitchMapping$0[getActivity().mo58969Q().ordinal()];
        if (i != 1) {
            if (i != 2 || (c36207Tq4 = this.reactiveConfig) == null || (m82623f82 = c36207Tq4.m82623f8()) == null || (value2 = m82623f82.getValue()) == null) {
                return null;
            }
            return value2.getChargerMapConfig();
        }
        C36207Tq4 c36207Tq42 = this.reactiveConfig;
        if (c36207Tq42 == null || (m82623f8 = c36207Tq42.m82623f8()) == null || (value = m82623f8.getValue()) == null) {
            return null;
        }
        return value.getRiderMapConfig();
    }

    private final int getOperationalAreaBorderColorOverride() {
        return ((Number) this.operationalAreaBorderColorOverride$delegate.getValue()).intValue();
    }

    private final int getOperationalAreaFillColorOverride() {
        return ((Number) this.operationalAreaFillColorOverride$delegate.getValue()).intValue();
    }

    private final MapPolygonableRenderer getPolygonableRenderer() {
        return (MapPolygonableRenderer) this.polygonableRenderer$delegate.getValue();
    }

    private final AppCompatTextView getRebalanceLabelTextView() {
        return (AppCompatTextView) this.rebalanceLabelTextView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAreaClick(Area area, Function0<Unit> function0) {
        if (isDemandAreaWithSelectedOverlay(area)) {
            this.demandAreaClickRelay.accept(area);
            this.currentlySelectedMarkerArea.onNext(Optional.f63040c.m59032c(area));
        } else if (MapAreasUiKt.access$canShowBottomSheetViaPolygonTap(area, this.reactiveConfig)) {
            this.currentlySelectedMarkerArea.onNext(Optional.f63040c.m59032c(area));
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleZoneClick(ZonePolygonable zonePolygonable) {
        if (zonePolygonable.getSelectability() == OperatorMapZoneSelectability.SELECTABLE_OVERLAY) {
            this.zonePolygonableClicks.accept(zonePolygonable);
        }
    }

    private final boolean isDemandAreaWithSelectedOverlay(Area area) {
        return (area != null && area.isDemandArea()) && area.getSelectedOverlayLabel() != null;
    }

    private final void maybeFlipAreaLabels(float f) {
        Sequence asSequence;
        boolean z;
        Integer overlayMinZoomLevel;
        Unit unit;
        boolean z2;
        asSequence = MapsKt___MapsKt.asSequence(this.areaGroundOverlay);
        Iterator it = asSequence.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Area area = (Area) entry.getKey();
            C40816fE1 c40816fE1 = (C40816fE1) entry.getValue();
            if (area.getOverlayMinZoomLevel() != null) {
                if (f > overlayMinZoomLevel.intValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c40816fE1.m41700i(z2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null && area.isDemandArea()) {
                if (f <= DEMAND_AREA_LABEL_VISIBLE_ZOOM_LEVEL_THRESHOLD) {
                    z3 = false;
                }
                c40816fE1.m41700i(z3);
            }
        }
        for (C40889fM2 c40889fM2 : this.areaLabelMarkers) {
            if (f > VARIABLE_FEE_AREA_LABEL_VISIBLE_ZOOM_THRESHOLD) {
                z = true;
            } else {
                z = false;
            }
            c40889fM2.m41516r(z);
        }
    }

    private final void removeAllAreaMarkers() {
        for (Map.Entry<C40889fM2, Area> entry : this.areaMarkers.entrySet()) {
            entry.getKey().m41528f();
        }
        this.areaMarkers.clear();
    }

    private final void setAreaMarkers(List<Area> list) {
        Sequence<Area> asSequence;
        LatLng latLng;
        boolean z;
        removeAllAreaMarkers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Area) obj).popupInvocationMethod() == PopupInvocationMethod.MAP_MARKER) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        asSequence = CollectionsKt___CollectionsKt.asSequence(arrayList);
        for (Area area : asSequence) {
            Geolocation centerPoint = area.getCenterPoint();
            if (centerPoint != null) {
                latLng = new LatLng(centerPoint.getLatitude(), centerPoint.getLongitude());
            } else {
                Point m100298a = JX3.m100298a(area.getRegion());
                latLng = new LatLng(m100298a.f66612y, m100298a.f66611x);
            }
            C40889fM2 m61685c = this.map.m61685c(new MarkerOptions().m50657N0(toolTipMarkerIcon(area)).m50644u(0.5f, 1.0f).m50643u1(latLng));
            if (m61685c != null) {
                m61685c.m41518p(area);
                this.areaMarkers.put(m61685c, area);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInfoWindow(C39011cD1 c39011cD1, Area area, LatLng latLng) {
        ZoneColorOverrideConfig zoneColorOverrideConfig;
        Z84<Config> m82623f8;
        Config m73665a;
        MobileMapConfigView riderMapConfig;
        C36207Tq4 c36207Tq4 = this.reactiveConfig;
        if (c36207Tq4 != null && (m82623f8 = c36207Tq4.m82623f8()) != null && (m73665a = m82623f8.m73665a()) != null && (riderMapConfig = m73665a.getRiderMapConfig()) != null) {
            zoneColorOverrideConfig = riderMapConfig.getZoneColorOverride();
        } else {
            zoneColorOverrideConfig = null;
        }
        PolygonTag polygonTag = PolygonTagKt.toPolygonTag(area, zoneColorOverrideConfig);
        C40889fM2 c40889fM2 = this.invisibleInfoWindowMarker;
        boolean z = false;
        if (c40889fM2 != null && c40889fM2.m41529e()) {
            z = true;
        }
        if (z) {
            hideInfoWindow();
            this.invisibleInfoWindowMarker = null;
            return;
        }
        C40889fM2 m61685c = c39011cD1.m61685c(new MarkerOptions().m50658L1(area.toolTipTitle()).m50661J1(area.getNotes()).m50657N0(C40788fB0.m41777e(getActivity(), C48193rg4.ic_hidden_marker)).m50643u1(latLng));
        if (m61685c != null) {
            m61685c.m41518p(polygonTag);
        }
        if (m61685c != null) {
            m61685c.m41514t();
        }
        this.map.m61681g(C48149rc0.m15708b(latLng), ANIMATION_DURATION, null);
        this.invisibleInfoWindowMarker = m61685c;
    }

    private final void showInfoWindowForOutsideAreas(C39011cD1 c39011cD1, LatLng latLng) {
        C40889fM2 c40889fM2 = this.invisibleInfoWindowMarker;
        boolean z = false;
        if (c40889fM2 != null && c40889fM2.m41529e()) {
            z = true;
        }
        if (z) {
            hideInfoWindow();
            this.invisibleInfoWindowMarker = null;
            return;
        }
        C6378PT m41777e = C40788fB0.m41777e(getActivity(), C48193rg4.ic_hidden_marker);
        MarkerOptions markerOptions = new MarkerOptions();
        BaseActivity activity = getActivity();
        int i = C45871nl4.outside_service_area_tooltip_title;
        MarkerOptions m50658L1 = markerOptions.m50658L1(activity.getString(i));
        BaseActivity activity2 = getActivity();
        int i2 = C45871nl4.outside_service_area_tooltip_body;
        C40889fM2 m61685c = c39011cD1.m61685c(m50658L1.m50661J1(activity2.getString(i2)).m50657N0(m41777e).m50643u1(latLng));
        PolygonTag polygonTag = new PolygonTag(getActivity().getString(i), getActivity().getString(i2), null, false, true, null, false, null, false, null, false, null, 4076, null);
        if (m61685c != null) {
            m61685c.m41518p(polygonTag);
        }
        if (m61685c != null) {
            m61685c.m41514t();
        }
        this.invisibleInfoWindowMarker = m61685c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6378PT toBitmapDescriptor(String str, Area area, Integer num, Integer num2) {
        boolean z;
        AppCompatTextView areaLabelTextView;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        boolean isDemandArea = area.isDemandArea();
        AreaIconType overlayIcon = area.getOverlayIcon();
        AreaIconType areaIconType = AreaIconType.REBALANCE;
        if (overlayIcon == areaIconType) {
            z2 = true;
        }
        String str2 = str + Detail.EMPTY_CHAR + isDemandArea + Detail.EMPTY_CHAR + z2 + Detail.EMPTY_CHAR + num + Detail.EMPTY_CHAR + num2;
        C6378PT c6378pt = this.bitmapCache.get(str2);
        if (c6378pt == null) {
            if (area.isDemandArea()) {
                areaLabelTextView = getDemandAreaLabelTextView();
                if (num2 != null) {
                    areaLabelTextView.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
                }
            } else if (area.getOverlayIcon() == areaIconType) {
                areaLabelTextView = getRebalanceLabelTextView();
            } else {
                areaLabelTextView = getAreaLabelTextView();
                if (num2 != null) {
                    areaLabelTextView.setBackgroundTintList(ColorStateList.valueOf(num2.intValue()));
                }
            }
            AppCompatTextView appCompatTextView = areaLabelTextView;
            appCompatTextView.setText(str);
            if (num != null) {
                appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(NA0.m94299e(appCompatTextView.getContext(), num.intValue()), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            C6378PT iconBitmapDescriptor$default = C40788fB0.iconBitmapDescriptor$default(getActivity(), appCompatTextView, (Drawable) null, (AP1) null, 4, (Object) null);
            this.bitmapCache.put(str2, iconBitmapDescriptor$default);
            return iconBitmapDescriptor$default;
        }
        return c6378pt;
    }

    public static /* synthetic */ C6378PT toBitmapDescriptor$default(MapAreasUiImpl mapAreasUiImpl, String str, Area area, Integer num, Integer num2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return mapAreasUiImpl.toBitmapDescriptor(str, area, num, num2);
    }

    private final C6378PT toolTipMarkerIcon(Area area) {
        if (area.isReleaseConstrained()) {
            return getCapZoneAreaMarkerIcon(area);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateAlpha(int i, float f) {
        return (i & 16777215) | (((int) (f * ((float) KotlinVersion.MAX_COMPONENT_VALUE))) << 24);
    }

    private static final Location updateAreasUi$lambda$14(Lazy<? extends Location> lazy) {
        return lazy.getValue();
    }

    public final Area flavorAdjustedArea(Area area, Integer num, Integer num2) {
        String str;
        int color;
        int borderColor;
        Area copy;
        Intrinsics.checkNotNullParameter(area, "<this>");
        InterfaceC6097Oh interfaceC6097Oh = this.appBuildConfig;
        if (interfaceC6097Oh != null) {
            str = interfaceC6097Oh.mo89926f();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, "bird") || area.isOperationalInverse() || !area.getOperational()) {
            return area;
        }
        if (num != null) {
            color = num.intValue();
        } else {
            color = area.getColor();
        }
        if (num2 != null) {
            borderColor = num2.intValue();
        } else {
            borderColor = area.getBorderColor();
        }
        copy = area.copy((r75 & 1) != 0 ? area.f66669id : null, (r75 & 2) != 0 ? area.title : null, (r75 & 4) != 0 ? area.label : null, (r75 & 8) != 0 ? area.notes : null, (r75 & 16) != 0 ? area.hideBirds : false, (r75 & 32) != 0 ? area.rejectDrops : false, (r75 & 64) != 0 ? area.noRides : false, (r75 & 128) != 0 ? area.noParking : false, (r75 & 256) != 0 ? area.preferredParking : false, (r75 & 512) != 0 ? area.delivery : false, (r75 & 1024) != 0 ? area.isReleaseConstrained : false, (r75 & 2048) != 0 ? area.isDemandArea : false, (r75 & 4096) != 0 ? area.feeModified : null, (r75 & 8192) != 0 ? area.demandLevel : null, (r75 & 16384) != 0 ? area.overlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? area.overlayIcon : null, (r75 & 65536) != 0 ? area.overlayMinZoomLevel : null, (r75 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? area.selectedOverlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? area.region : null, (r75 & 524288) != 0 ? area.color : color, (r75 & 1048576) != 0 ? area.colorDark : null, (r75 & 2097152) != 0 ? area.borderColor : borderColor, (r75 & 4194304) != 0 ? area.borderColorDark : null, (r75 & 8388608) != 0 ? area.titleColor : 0, (r75 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? area.titleColorDark : null, (r75 & 33554432) != 0 ? area.zoomBehavior : null, (r75 & 67108864) != 0 ? area.operational : false, (r75 & 134217728) != 0 ? area.maxSpeed : null, (r75 & 268435456) != 0 ? area.releaseCapacity : null, (r75 & 536870912) != 0 ? area.noParkingFineAlertTitle : null, (r75 & 1073741824) != 0 ? area.noParkingFineAlertMessage : null, (r75 & Integer.MIN_VALUE) != 0 ? area.riderBarInRideMessageTitle : null, (r76 & 1) != 0 ? area.riderBarInRideMessageBody : null, (r76 & 2) != 0 ? area.riderBarNotInRideMessageTitle : null, (r76 & 4) != 0 ? area.riderBarNotInRideMessageBody : null, (r76 & 8) != 0 ? area.riderBarInRideMessageIconType : null, (r76 & 16) != 0 ? area.riderBarNotInRideMessageIconType : null, (r76 & 32) != 0 ? area.areaReleaseCapacityIconType : null, (r76 & 64) != 0 ? area.partnerId : null, (r76 & 128) != 0 ? area.fleetIds : null, (r76 & 256) != 0 ? area.areaKeys : null, (r76 & 512) != 0 ? area.isUniversalArea : false, (r76 & 1024) != 0 ? area.noParkingFineCurrency : null, (r76 & 2048) != 0 ? area.noParkingWarningAlertTitle : null, (r76 & 4096) != 0 ? area.noParkingWarningAlertBody : null, (r76 & 8192) != 0 ? area.noParkingFineAmount : null, (r76 & 16384) != 0 ? area.areasMerged : null, (r76 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? area.centerPoint : null, (r76 & 65536) != 0 ? area.role : null, (r76 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? area.updatedAt : null, (r76 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? area.zoneId : null, (r76 & 524288) != 0 ? area.walkway : null);
        return copy;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void hideInfoWindow() {
        C40889fM2 c40889fM2 = this.invisibleInfoWindowMarker;
        if (c40889fM2 != null) {
            c40889fM2.m41530d();
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Optional<Area>> selectedAreaMarker() {
        Observable<Optional<Area>> hide = this.currentlySelectedMarkerArea.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "currentlySelectedMarkerArea.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void setAdditionalAreas(String key, List<Area> areas) {
        int collectionSizeOrDefault;
        Collection plus;
        Map<String, List<Area>> map;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(areas, "areas");
        if (Intrinsics.areEqual(getEnableOptimizedMapRenderer(), Boolean.TRUE)) {
            getPolygonableRenderer().setAdditionalPolygonable(key, areas);
            return;
        }
        Map<String, List<Area>> value = this.additionalAreasToRender.getValue();
        if (value == null) {
            value = MapsKt__MapsKt.emptyMap();
        }
        C0058AG<Map<String, List<Area>>> c0058ag = this.additionalAreasToRender;
        if (value.containsKey(key)) {
            plus = new ArrayList(value.size());
            for (Map.Entry<String, List<Area>> entry : value.entrySet()) {
                String key2 = entry.getKey();
                List<Area> value2 = entry.getValue();
                if (Intrinsics.areEqual(key, key2)) {
                    value2 = areas;
                }
                plus.add(TuplesKt.m28425to(key2, value2));
            }
        } else {
            Set<Map.Entry<String, List<Area>>> entrySet = value.entrySet();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                arrayList.add(TuplesKt.m28425to((String) entry2.getKey(), (List) entry2.getValue()));
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends Pair>) ((Collection<? extends Object>) arrayList), TuplesKt.m28425to(key, areas));
        }
        map = MapsKt__MapsKt.toMap(plus);
        c0058ag.accept(map);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public synchronized void setAreas(List<Area> areas) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(areas, "areas");
        int size = areas.size();
        C41318g46.m40163a("setAreas called for " + size + " areas", new Object[0]);
        List<Area> list = areas;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : list) {
            arrayList.add(flavorAdjustedArea(area, Integer.valueOf(getOperationalAreaFillColorOverride()), Integer.valueOf(getOperationalAreaBorderColorOverride())));
        }
        getPolygonableRenderer().setPolygonables(arrayList);
        setAreaMarkers(areas);
        this.addLabelsToAreasRelay.accept(areas);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public Observable<Unit> setAreasCompleteChanges() {
        return this.setAreasCompleteChanges.hide();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZonesUi
    public void setZones(List<ZonePolygonable> zones) {
        Intrinsics.checkNotNullParameter(zones, "zones");
        getPolygonableRenderer().setPolygonables(zones);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForArea(Area area, LatLng latLng) {
        Intrinsics.checkNotNullParameter(area, "area");
        if (area.popupType() == PopupType.BOTTOM_SHEET) {
            this.currentlySelectedMarkerArea.onNext(Optional.f63040c.m59032c(area));
        } else {
            this.currentlySelectedMarkerArea.onNext(Optional.f63040c.m59034a());
        }
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void showInfoWindowForNonOperationalArea(LatLng point) {
        Intrinsics.checkNotNullParameter(point, "point");
        showInfoWindowForOutsideAreas(this.map, point);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapAreasUi
    public void updateAreasUi(float f, List<LatLng> list) {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new MapAreasUiImpl$updateAreasUi$center$2(list));
        Location updateAreasUi$lambda$14 = updateAreasUi$lambda$14(lazy);
        C41318g46.m40163a("updateAreasUi with zoom level " + f + " and center " + updateAreasUi$lambda$14, new Object[0]);
        maybeFlipAreaLabels(f);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapZonesUi
    public Observable<ZonePolygonable> zoneClicks() {
        Observable<ZonePolygonable> hide = this.zonePolygonableClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "zonePolygonableClicks.hide()");
        return hide;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAreasUiImpl(BaseActivity activity, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, InterfaceC40001dr4 locationManager) {
        super(activity);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.map = map;
        this.reactiveConfig = c36207Tq4;
        this.appBuildConfig = interfaceC6097Oh;
        this.locationManager = locationManager;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.setAreasCompleteChanges = m25409g;
        this.areaMarkers = new LinkedHashMap();
        C24552a<Optional<Area>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Optional<Area>>()");
        this.currentlySelectedMarkerArea = m31922e;
        this.areaGroundOverlay = new LinkedHashMap();
        lazy = LazyKt__LazyJVMKt.lazy(new MapAreasUiImpl$demandAreaLabelTextView$2(activity));
        this.demandAreaLabelTextView$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new MapAreasUiImpl$areaLabelTextView$2(activity));
        this.areaLabelTextView$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new MapAreasUiImpl$rebalanceLabelTextView$2(activity));
        this.rebalanceLabelTextView$delegate = lazy3;
        this.bitmapCache = new LruCache<>(128);
        this.areaLabelMarkers = new ArrayList();
        this.groundOverlayOptionsCache = new LruCache<>(128);
        C0058AG<Map<String, List<Area>>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Map<String, List<Area>>>()");
        this.additionalAreasToRender = m115951g;
        C45168ma4<List<Area>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<List<Area>>()");
        this.addLabelsToAreasRelay = m25409g2;
        C45168ma4<Area> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Area>()");
        this.demandAreaClickRelay = m25409g3;
        C45168ma4<ZonePolygonable> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<ZonePolygonable>()");
        this.zonePolygonableClicks = m25409g4;
        lazy4 = LazyKt__LazyJVMKt.lazy(new MapAreasUiImpl$operationalAreaFillColorOverride$2(this, activity));
        this.operationalAreaFillColorOverride$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new MapAreasUiImpl$operationalAreaBorderColorOverride$2(activity));
        this.operationalAreaBorderColorOverride$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new MapAreasUiImpl$polygonableRenderer$2(this, reactiveMapEvent, activity));
        this.polygonableRenderer$delegate = lazy6;
        Object m33094as = reactiveMapEvent.infoWindowCloses().m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138461 c138461 = new C138461();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: XJ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$0(Function1.this, obj);
            }
        });
        Object m33094as2 = C37279Yf5.m74575T(reactiveMapEvent.markerClicks(), new C138532()).m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138543 c138543 = new C138543(m31922e);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: bK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$1(Function1.this, obj);
            }
        });
        Observable<Pair<Polygonable, LatLng>> observeOn = getPolygonableRenderer().polygonClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "polygonableRenderer.poly…dSchedulers.mainThread())");
        Object m33094as3 = observeOn.m33094as(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138554 c138554 = new C138554();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: cK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$2(Function1.this, obj);
            }
        });
        final C138575 c138575 = new C138575();
        Observable<Area> observeOn2 = m25409g3.filter(new InterfaceC23494q() { // from class: dK2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean _init_$lambda$3;
                _init_$lambda$3 = MapAreasUiImpl._init_$lambda$3(Function1.this, obj);
                return _init_$lambda$3;
            }
        }).observeOn(C23454a.m33087a());
        final C138586 c138586 = new C138586();
        Observable<Area> doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: eK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$4(Function1.this, obj);
            }
        });
        final C138597 c138597 = new C138597();
        Observable observeOn3 = doOnNext.flatMapMaybe(new InterfaceC23492o() { // from class: fK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u _init_$lambda$5;
                _init_$lambda$5 = MapAreasUiImpl._init_$lambda$5(Function1.this, obj);
                return _init_$lambda$5;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "demandAreaClickRelay\n   …dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(activity);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as4 = observeOn3.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C138618 c138618 = new C138618();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: gK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$6(Function1.this, obj);
            }
        });
        AbstractC24490k<List<Area>> m32111s0 = m25409g2.toFlowable(EnumC23460b.LATEST).m32111s0(C23454a.m33087a());
        final C138629 c138629 = new C138629();
        AbstractC24490k<List<Area>> m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: hK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$7(Function1.this, obj);
            }
        });
        final C1384710 c1384710 = new C1384710();
        AbstractC24490k m32111s02 = m32191K.m32167W(new InterfaceC23492o() { // from class: iK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 _init_$lambda$8;
                _init_$lambda$8 = MapAreasUiImpl._init_$lambda$8(Function1.this, obj);
                return _init_$lambda$8;
            }
        }).m32111s0(C23454a.m33087a());
        final C1385111 c1385111 = new C1385111();
        AbstractC23461c m32135k0 = m32111s02.m32191K(new InterfaceC23484g() { // from class: YJ2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$9(Function1.this, obj);
            }
        }).m32135k0();
        final C1385212 c1385212 = C1385212.INSTANCE;
        AbstractC23461c m33066T = m32135k0.m33084B(new InterfaceC23484g() { // from class: aK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapAreasUiImpl._init_$lambda$10(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "addLabelsToAreasRelay\n  …request\")}\n      .retry()");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(activity));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
