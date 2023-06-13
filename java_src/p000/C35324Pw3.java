package p000;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.operator.permission.p009ui.OperatorPermissionsRequiredActivity;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.AreaBottomSheetButton;
import co.bird.android.model.BountyFlightSheetButton;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.NestFlightSheetButton;
import co.bird.android.model.OperatorScanIntent;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.WarehouseFlightSheetButton;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.persistence.WarehouseFlightSheetDetails;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetAction;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetMapButtonOverrides;
import co.bird.android.model.wire.WireReleaseAssignmentMapBanner;
import co.bird.android.widget.NonRiderFlightView;
import co.bird.android.widget.OperatorMapFilterButtonView;
import co.bird.android.widget.ParkingNestView;
import co.bird.android.widget.behavior.ParallaxCollapseBehavior;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import p000.C53094zw3;
import p000.H31;
import p000.InterfaceC32282Cw3;
import p000.InterfaceC35450Qk3;
import p000.InterfaceC41921h56;
@Metadata(m28433d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B(\b\u0007\u0012\b\u0010©\u0001\u001a\u00030¨\u0001\u0012\u0007\u0010\u008b\u0001\u001a\u00020\u007f\u0012\b\u0010\u008f\u0001\u001a\u00030\u008c\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0004H\u0016J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020 H\u0016J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0(H\u0016J\u0010\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\fH\u0016J\u0010\u00103\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u00106\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\b\u00108\u001a\u00020\tH\u0016J\b\u00109\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020\tH\u0016J\u0010\u0010;\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010@\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u0010\u0010B\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u0016\u0010F\u001a\u00020\t2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0DH\u0016J\u0016\u0010G\u001a\u00020\t2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0DH\u0016J\u0010\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020HH\u0016J\u0010\u0010M\u001a\u00020\t2\u0006\u0010L\u001a\u00020KH\u0016J\u0010\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020NH\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0016J\b\u0010R\u001a\u00020\tH\u0016J\u001e\u0010V\u001a\b\u0012\u0004\u0012\u00020U0(2\u0006\u0010S\u001a\u00020*2\u0006\u0010T\u001a\u00020*H\u0016J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020U0(H\u0016J\b\u0010X\u001a\u00020\tH\u0016J\b\u0010Y\u001a\u00020\tH\u0016J\b\u0010Z\u001a\u00020\tH\u0016J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020$0\u0004H\u0016J\u000e\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u0004H\u0016J\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u0004H\u0016J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u0004H\u0016J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u0004H\u0016J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u0004H\u0016J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u0010\u0010i\u001a\u00020\t2\u0006\u0010h\u001a\u00020gH\u0016J\u0010\u0010l\u001a\u00020\t2\u0006\u0010k\u001a\u00020jH\u0016J-\u0010p\u001a\u00020\t2\b\u0010m\u001a\u0004\u0018\u00010\u00052\b\u0010n\u001a\u0004\u0018\u00010\u00052\b\u0010o\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bp\u0010qJ\u0010\u0010t\u001a\u00020\t2\u0006\u0010s\u001a\u00020rH\u0016J\u000e\u0010u\u001a\b\u0012\u0004\u0012\u00020U0(H\u0016J\b\u0010v\u001a\u00020\tH\u0016J\u0010\u0010w\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0016\u0010y\u001a\b\u0012\u0004\u0012\u00020U0(2\u0006\u0010x\u001a\u00020\fH\u0016J \u0010}\u001a\u00020\t2\u0006\u0010x\u001a\u00020\f2\u0006\u0010z\u001a\u00020\f2\u0006\u0010|\u001a\u00020{H\u0016J\u0010\u0010\u007f\u001a\u00020\t2\u0006\u0010~\u001a\u00020*H\u0016J\u0018\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020U0(2\u0007\u0010\u0080\u0001\u001a\u00020\fH\u0016J\u001e\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0D0(2\u0007\u0010\u0082\u0001\u001a\u00020*H\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\t2\u0007\u0010\u0084\u0001\u001a\u00020\fH\u0016J\t\u0010\u0086\u0001\u001a\u00020\tH\u0016J\u0012\u0010\u0088\u0001\u001a\u00020\t2\u0007\u0010\u0087\u0001\u001a\u00020*H\u0016R\u0017\u0010\u008b\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R'\u0010\u009c\u0001\u001a\u0012\u0012\r\u0012\u000b \u0099\u0001*\u0004\u0018\u00010$0$0\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R'\u0010\u009e\u0001\u001a\u0012\u0012\r\u0012\u000b \u0099\u0001*\u0004\u0018\u00010 0 0\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009b\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001¨\u0006¬\u0001"}, m28432d2 = {"LPw3;", "LxA;", "LCw3;", "Landroid/view/View;", "Lio/reactivex/Observable;", "", "im", "Lco/bird/android/model/wire/WireReleaseAssignmentMapBanner;", "mapBanner", "", "F3", "xg", "", "minutesSince", "H6", "(Ljava/lang/Integer;)V", "show", "G7", "visible", "kh", "enabled", "ce", "LQk3;", "mode", "xd", "Lco/bird/android/model/OperatorScanIntent;", "G2", "id", "Tg", "w3", "w5", "xl", "Lyu3;", "s2", "tab", "Be", "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "type", "rg", "Qc", "Lio/reactivex/F;", "Pd", "", "birdId", "K5", "e1", "fd", "i5", "re", "numFilters", "Z2", "zb", "wh", "e7", "ok", "P6", "Wb", "lk", "ik", "Wi", "Lco/bird/android/model/ParkingNest;", "parkingNest", "", "distance", "p9", "tj", "L7", "E7", "", "sections", "M5", "be", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "nestFlightSheetDetails", "ua", "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "warehouseFlightSheetDetails", "bi", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "zoneFlightSheetDetails", "Kj", "cb", "K4", "title", "body", "Lco/bird/android/model/DialogResponse;", "g3", "bc", "U2", "La", "q2", "jj", "Lco/bird/android/model/AreaBottomSheetButton;", "o2", "Lco/bird/android/model/BountyFlightSheetButton;", "gc", "Lco/bird/android/model/FlightSheetButton;", "O6", "Lco/bird/android/model/NestFlightSheetButton;", "h8", "Lco/bird/android/model/WarehouseFlightSheetButton;", "P5", "Fb", "LRm;", RequestHeadersFactory.MODEL, "n4", "Landroid/view/Menu;", "menu", "Z0", "showManualRefresh", "showNotificationCenter", "notificationCount", "xa", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Lco/bird/android/model/persistence/Bird;", "bird", "ui", "Qh", "v8", "mc", "spaces", "Pg", "totalDurationMinutes", "Lorg/joda/time/DateTime;", "expiresAt", "vd", "message", "u4", "cooldownMinutes", "lh", "nestId", "Qj", "count", "R0", "Ha", "newClaimErrorMessage", "nb", "c", "Lu4;", "binding", "LG33;", DateTokenConverter.CONVERTER_KEY, "LG33;", "nestFlightSheetConverter", "LKI6;", "e", "LKI6;", "zoneFlightSheetConverter", "LIy6;", "f", "LIy6;", "warehouseFlightSheetConverter", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "typeRelay", "h", "tabRelay", "i", "Z", "quickFilterEnabled", "j", "Landroid/view/Menu;", "LoA;", "getAdapter", "()LoA;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lu4;LG33;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorUi.kt\nco/bird/android/app/feature/operator/ui/OperatorUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,693:1\n1#2:694\n260#3:695\n260#3:696\n260#3:697\n368#3:713\n368#3:715\n641#4,2:698\n641#4,2:700\n641#4,2:702\n641#4,2:704\n641#4,2:706\n197#5,5:708\n1295#6:714\n1296#6:716\n*S KotlinDebug\n*F\n+ 1 OperatorUi.kt\nco/bird/android/app/feature/operator/ui/OperatorUiImpl\n*L\n289#1:695\n299#1:696\n309#1:697\n170#1:713\n193#1:715\n560#1:698,2\n563#1:700,2\n566#1:702,2\n569#1:704,2\n572#1:706,2\n640#1:708,5\n189#1:714\n189#1:716\n*E\n"})
/* renamed from: Pw3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35324Pw3 extends AbstractC30055xA implements InterfaceC32282Cw3 {

    /* renamed from: c */
    public final C29040u4 f29408c;

    /* renamed from: d */
    public final G33 f29409d;

    /* renamed from: e */
    public final KI6 f29410e;

    /* renamed from: f */
    public final C33707Iy6 f29411f;

    /* renamed from: g */
    public final C45168ma4<OperatorMapBottomSheet.EnumC14592a> f29412g;

    /* renamed from: h */
    public final C45168ma4<EnumC52481yu3> f29413h;

    /* renamed from: i */
    public boolean f29414i;

    /* renamed from: j */
    public Menu f29415j;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "child", "", C17296a.f69688o, "(Landroid/view/View;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$a */
    /* loaded from: classes2.dex */
    public static final class C6566a extends Lambda implements Function1<View, Boolean> {

        /* renamed from: g */
        public static final C6566a f29416g = new C6566a();

        public C6566a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(View child) {
            boolean z;
            Intrinsics.checkNotNullParameter(child, "child");
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams;
            if (c11529e.m67769f() != null && (c11529e.m67769f() instanceof ParallaxCollapseBehavior)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pw3$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6567b extends FunctionReferenceImpl implements Function1<OperatorMapBottomSheet.EnumC14592a, Unit> {
        public C6567b(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m89297a(OperatorMapBottomSheet.EnumC14592a p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorMapBottomSheet.EnumC14592a enumC14592a) {
            m89297a(enumC14592a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Pw3$c", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "", C17296a.f69688o, "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$c */
    /* loaded from: classes2.dex */
    public static final class C6568c implements TabLayout.InterfaceC17906d {
        public C6568c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: a */
        public void mo20905a(TabLayout.C17910g c17910g) {
            Integer num;
            EnumC52481yu3 enumC52481yu3;
            if (c17910g != null) {
                num = Integer.valueOf(c17910g.m48716g());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                enumC52481yu3 = EnumC52481yu3.ALL;
            } else if (num != null && num.intValue() == 1) {
                enumC52481yu3 = EnumC52481yu3.VEHICLES;
            } else if (num != null && num.intValue() == 2) {
                enumC52481yu3 = EnumC52481yu3.NESTS;
            } else {
                return;
            }
            C35324Pw3.this.f29413h.accept(enumC52481yu3);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: b */
        public void mo20904b(TabLayout.C17910g c17910g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: c */
        public void mo20903c(TabLayout.C17910g c17910g) {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$d */
    /* loaded from: classes2.dex */
    public static final class C6569d<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C6569d<T> f29418b = new C6569d<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof AreaBottomSheetButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$e */
    /* loaded from: classes2.dex */
    public static final class C6570e<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C6570e<T, R> f29419b = new C6570e<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final AreaBottomSheetButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (AreaBottomSheetButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "LOZ;", "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$f */
    /* loaded from: classes2.dex */
    public static final class C6571f extends Lambda implements Function1<Pair<? extends AbstractC6031OZ, ? extends OperatorMapBottomSheet.EnumC14592a>, Boolean> {

        /* renamed from: g */
        public static final C6571f f29420g = new C6571f();

        public C6571f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Pair<? extends AbstractC6031OZ, ? extends OperatorMapBottomSheet.EnumC14592a> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1() instanceof C43051j00);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LOZ;", "Lco/bird/android/feature/bottomsheets/map/OperatorMapBottomSheet$a;", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$g */
    /* loaded from: classes2.dex */
    public static final class C6572g extends Lambda implements Function1<Pair<? extends AbstractC6031OZ, ? extends OperatorMapBottomSheet.EnumC14592a>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ OperatorMapBottomSheet.EnumC14592a f29421g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6572g(OperatorMapBottomSheet.EnumC14592a enumC14592a) {
            super(1);
            this.f29421g = enumC14592a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Pair<? extends AbstractC6031OZ, ? extends OperatorMapBottomSheet.EnumC14592a> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AbstractC6031OZ component1 = pair.component1();
            OperatorMapBottomSheet.EnumC14592a component2 = pair.component2();
            Intrinsics.checkNotNull(component1, "null cannot be cast to non-null type co.bird.android.widget.extension.BottomSheetStateEvent");
            boolean z = false;
            if (C45423n00.m24596a(((C43051j00) component1).m31275c())) {
                OperatorMapBottomSheet.EnumC14592a enumC14592a = this.f29421g;
                if (enumC14592a == null || component2 == enumC14592a) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$h */
    /* loaded from: classes2.dex */
    public static final class C6573h extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Integer>> {

        /* renamed from: g */
        public static final C6573h f29422g = new C6573h();

        public C6573h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Integer> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.just(0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$i */
    /* loaded from: classes2.dex */
    public static final class C6574i extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Integer>> {

        /* renamed from: g */
        public static final C6574i f29423g = new C6574i();

        public C6574i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Integer> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.just(1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$j */
    /* loaded from: classes2.dex */
    public static final class C6575j<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C6575j<T> f29424b = new C6575j<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof BountyFlightSheetButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$k */
    /* loaded from: classes2.dex */
    public static final class C6576k<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C6576k<T, R> f29425b = new C6576k<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final BountyFlightSheetButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (BountyFlightSheetButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/OperatorScanIntent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/OperatorScanIntent;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$l */
    /* loaded from: classes2.dex */
    public static final class C6577l extends Lambda implements Function1<Unit, OperatorScanIntent> {

        /* renamed from: g */
        public static final C6577l f29426g = new C6577l();

        public C6577l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorScanIntent invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OperatorScanIntent.CAPTURE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pw3$m */
    /* loaded from: classes2.dex */
    public static final class C6578m extends Lambda implements Function1<Unit, Unit> {
        public C6578m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35324Pw3 c35324Pw3 = C35324Pw3.this;
            c35324Pw3.f29414i = !c35324Pw3.f29414i;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$n */
    /* loaded from: classes2.dex */
    public static final class C6579n extends Lambda implements Function1<Unit, Boolean> {
        public C6579n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C35324Pw3.this.f29414i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$o */
    /* loaded from: classes2.dex */
    public static final class C6580o<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C6580o<T> f29429b = new C6580o<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof FlightSheetButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$p */
    /* loaded from: classes2.dex */
    public static final class C6581p<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C6581p<T, R> f29430b = new C6581p<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final FlightSheetButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (FlightSheetButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$q */
    /* loaded from: classes2.dex */
    public static final class C6582q<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C6582q<T> f29431b = new C6582q<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof NestFlightSheetButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$r */
    /* loaded from: classes2.dex */
    public static final class C6583r<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C6583r<T, R> f29432b = new C6583r<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final NestFlightSheetButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (NestFlightSheetButton) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/OperatorScanIntent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/OperatorScanIntent;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Pw3$s */
    /* loaded from: classes2.dex */
    public static final class C6584s extends Lambda implements Function1<Unit, OperatorScanIntent> {

        /* renamed from: g */
        public static final C6584s f29433g = new C6584s();

        public C6584s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorScanIntent invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return OperatorScanIntent.RELEASE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$t */
    /* loaded from: classes2.dex */
    public static final class C6585t<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C6585t<T> f29434b = new C6585t<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof WarehouseFlightSheetButton;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: Pw3$u */
    /* loaded from: classes2.dex */
    public static final class C6586u<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C6586u<T, R> f29435b = new C6586u<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final WarehouseFlightSheetButton apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (WarehouseFlightSheetButton) item;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35324Pw3(BaseActivity activity, C29040u4 binding, G33 nestFlightSheetConverter) {
        super(activity);
        CoordinatorLayout.C11529e c11529e;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(nestFlightSheetConverter, "nestFlightSheetConverter");
        this.f29408c = binding;
        this.f29409d = nestFlightSheetConverter;
        this.f29410e = new KI6();
        this.f29411f = new C33707Iy6();
        C45168ma4<OperatorMapBottomSheet.EnumC14592a> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<OperatorMapBottomSheet.BottomSheetType>()");
        this.f29412g = m25409g;
        C45168ma4<EnumC52481yu3> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<OperatorTab>()");
        this.f29413h = m25409g2;
        BottomSheetBehavior m50133G = BottomSheetBehavior.m50133G(binding.f111647d);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(binding.bottomSheet)");
        m50133G.m50082p0(5);
        binding.f111647d.setPeekHeight(0);
        TypedValue typedValue = new TypedValue();
        m50133G.m50106d0((activity.getTheme().resolveAttribute(16843499, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics()) : 0) + ((int) C49347td3.m12002a(8, activity)));
        binding.f111639B.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Dw3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C35324Pw3.m89334bm(C35324Pw3.this);
            }
        });
        binding.f111647d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Gw3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C35324Pw3.m89332cm(C35324Pw3.this);
            }
        });
        ViewGroup.LayoutParams layoutParams = binding.f111660q.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C11529e) {
            c11529e = (CoordinatorLayout.C11529e) layoutParams;
        } else {
            c11529e = null;
        }
        if (c11529e != null) {
            c11529e.m67759p(binding.f111647d.getId());
        }
        ViewGroup.LayoutParams layoutParams2 = binding.f111659p.getLayoutParams();
        CoordinatorLayout.C11529e c11529e2 = layoutParams2 instanceof CoordinatorLayout.C11529e ? (CoordinatorLayout.C11529e) layoutParams2 : null;
        if (c11529e2 != null) {
            c11529e2.m67759p(binding.f111647d.getId());
        }
        binding.f111639B.getLayoutTransition().enableTransitionType(4);
        binding.f111647d.m58661a0(new C6567b(m25409g));
        binding.f111641D.m48782h(new C6568c());
    }

    /* renamed from: bm */
    public static final void m89334bm(final C35324Pw3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f29408c.f111639B.post(new Runnable() { // from class: Hw3
            @Override // java.lang.Runnable
            public final void run() {
                C35324Pw3.m89313lm(C35324Pw3.this);
            }
        });
    }

    /* renamed from: cm */
    public static final void m89332cm(final C35324Pw3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f29408c.f111647d.post(new Runnable() { // from class: Iw3
            @Override // java.lang.Runnable
            public final void run() {
                C35324Pw3.m89312mm(C35324Pw3.this);
            }
        });
    }

    /* renamed from: dm */
    public static final boolean m89331dm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: em */
    public static final Boolean m89328em(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: fm */
    public static final InterfaceC23434B m89326fm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: gm */
    public static final InterfaceC23434B m89323gm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: hm */
    public static final OperatorScanIntent m89322hm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OperatorScanIntent) tmp0.invoke(obj);
    }

    /* renamed from: jm */
    public static final void m89317jm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: km */
    public static final Boolean m89315km(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: lm */
    public static final void m89313lm(C35324Pw3 this$0) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int measuredHeight = this$0.f29408c.f111639B.getMeasuredHeight();
        OperatorMapBottomSheet operatorMapBottomSheet = this$0.f29408c.f111647d;
        Intrinsics.checkNotNullExpressionValue(operatorMapBottomSheet, "binding.bottomSheet");
        ViewGroup.LayoutParams layoutParams = operatorMapBottomSheet.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        if (i == measuredHeight) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this$0.f29408c.f111647d.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C11529e c11529e = (CoordinatorLayout.C11529e) layoutParams2;
        ((ViewGroup.MarginLayoutParams) c11529e).bottomMargin = measuredHeight;
        this$0.f29408c.f111647d.setLayoutParams(c11529e);
    }

    /* renamed from: mm */
    public static final void m89312mm(C35324Pw3 this$0) {
        Sequence<View> filter;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CoordinatorLayout coordinatorLayout = this$0.f29408c.f111652i;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "binding.coordinatorLayout");
        filter = SequencesKt___SequencesKt.filter(C41782gr6.m37379b(coordinatorLayout), C6566a.f29416g);
        for (View view : filter) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) layoutParams).m67769f();
            Intrinsics.checkNotNull(m67769f, "null cannot be cast to non-null type co.bird.android.widget.behavior.ParallaxCollapseBehavior<@[FlexibleNullability] android.view.View?>");
            ParallaxCollapseBehavior parallaxCollapseBehavior = (ParallaxCollapseBehavior) m67769f;
            OperatorMapBottomSheet operatorMapBottomSheet = this$0.f29408c.f111647d;
            Intrinsics.checkNotNullExpressionValue(operatorMapBottomSheet, "binding.bottomSheet");
            ViewGroup.LayoutParams layoutParams2 = operatorMapBottomSheet.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            parallaxCollapseBehavior.m54238b(i);
            CoordinatorLayout coordinatorLayout2 = this$0.f29408c.f111652i;
            Intrinsics.checkNotNullExpressionValue(coordinatorLayout2, "binding.coordinatorLayout");
            parallaxCollapseBehavior.m54239a(coordinatorLayout2, view);
        }
    }

    /* renamed from: nm */
    public static final OperatorScanIntent m89310nm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OperatorScanIntent) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: B */
    public Observable<VehicleCommand> mo17130B() {
        return InterfaceC32282Cw3.C1261a.m111264b(this);
    }

    @Override // p000.InterfaceC53074zu3
    /* renamed from: Be */
    public void mo147Be(EnumC52481yu3 tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        TabLayout tabLayout = this.f29408c.f111641D;
        tabLayout.m48798T(tabLayout.m48814D(tab.m2306b()));
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: E7 */
    public Observable<Unit> mo89360E7() {
        View findViewById = this.f29408c.f111666w.findViewById(C36585Vg4.image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "binding.parkingNestView.…iewById<View>(R.id.image)");
        return C44626lf5.clicksThrottle$default(findViewById, 0L, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // p000.InterfaceC36926Ws3
    /* renamed from: F3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo77765F3(WireReleaseAssignmentMapBanner wireReleaseAssignmentMapBanner) {
        boolean z;
        String str;
        boolean isBlank;
        Unit unit = null;
        if (wireReleaseAssignmentMapBanner != null) {
            NonRiderFlightView nonRiderFlightView = this.f29408c.f111657n;
            Intrinsics.checkNotNullExpressionValue(nonRiderFlightView, "binding.flightView");
            String title = wireReleaseAssignmentMapBanner.getTitle();
            String body = wireReleaseAssignmentMapBanner.getBody();
            if (body != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(body);
                if (!isBlank) {
                    z = false;
                    if (!(true ^ z)) {
                        str = body;
                    } else {
                        str = null;
                    }
                    nonRiderFlightView.m54525c((r13 & 1) != 0 ? null : null, (r13 & 2) != 0 ? null : title, (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : NA0.m94299e(getActivity(), C48193rg4.ic_arrow_down_purple), true);
                    unit = Unit.INSTANCE;
                }
            }
            z = true;
            if (!(true ^ z)) {
            }
            nonRiderFlightView.m54525c((r13 & 1) != 0 ? null : null, (r13 & 2) != 0 ? null : title, (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : NA0.m94299e(getActivity(), C48193rg4.ic_arrow_down_purple), true);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            NonRiderFlightView nonRiderFlightView2 = this.f29408c.f111657n;
            Intrinsics.checkNotNullExpressionValue(nonRiderFlightView2, "binding.flightView");
            nonRiderFlightView2.m54525c((r13 & 1) != 0 ? null : null, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, false);
        }
    }

    @Override // p000.InterfaceC47769qx3
    /* renamed from: Fb */
    public Observable<Unit> mo16730Fb() {
        Button button = this.f29408c.f111643F;
        Intrinsics.checkNotNullExpressionValue(button, "binding.warehouseRelease");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC36926Ws3
    /* renamed from: G2 */
    public Observable<OperatorScanIntent> mo77764G2() {
        Button button = this.f29408c.f111651h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.captureButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C6577l c6577l = C6577l.f29426g;
        Observable<OperatorScanIntent> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: Jw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                OperatorScanIntent m89322hm;
                m89322hm = C35324Pw3.m89322hm(Function1.this, obj);
                return m89322hm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.captureButton.cl…ratorScanIntent.CAPTURE }");
        return map;
    }

    @Override // p000.InterfaceC36926Ws3
    /* renamed from: G7 */
    public void mo77763G7(boolean z) {
        boolean z2;
        if (z) {
            C29040u4 c29040u4 = this.f29408c;
            c29040u4.f111638A.m67897h(c29040u4.f111668y);
            Button button = this.f29408c.f111668y;
            Intrinsics.checkNotNullExpressionValue(button, "binding.releaseButton");
            Group group = this.f29408c.f111638A;
            Intrinsics.checkNotNullExpressionValue(group, "binding.scanButtonGroup");
            if (group.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C49520tu6.show$default(button, z2, 0, 2, null);
            return;
        }
        C29040u4 c29040u42 = this.f29408c;
        c29040u42.f111638A.m67888s(c29040u42.f111668y);
        Button button2 = this.f29408c.f111668y;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.releaseButton");
        C49520tu6.show$default(button2, false, 0, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r3 == null) goto L10;
     */
    @Override // p000.InterfaceC32282Cw3
    /* renamed from: H6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo89359H6(Integer num) {
        String string;
        if (!getActivity().isFinishing()) {
            int i = C39311cj4.dialog_demand_area_refresh_info;
            int i2 = C36585Vg4.header;
            int i3 = C36585Vg4.mainText;
            if (num != null) {
                string = getActivity().getString(C45871nl4.last_updated_ago_pop_up, Integer.valueOf(num.intValue()));
            }
            string = getActivity().getString(C45871nl4.update_in_progress);
            H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(i3), (CharSequence) string, (CharSequence) getActivity().getString(C45871nl4.last_updated_dialog_main_text), C36585Vg4.confirmButton, (Integer) null, getActivity().getString(C45871nl4.refresh_info_confirm), (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 518206, (Object) null);
        }
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: Ha */
    public void mo18683Ha() {
        String string = getActivity().getString(C45871nl4.thank_you_for_flagging);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…g.thank_you_for_flagging)");
        InterfaceC41921h56.C22549a.topToast$default(this, string, (EnumC40735f56) null, 2, (Object) null);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Jd */
    public void mo17128Jd(VehicleCommand vehicleCommand) {
        InterfaceC32282Cw3.C1261a.m111263c(this, vehicleCommand);
    }

    @Override // p000.InterfaceC35216Pk3
    /* renamed from: K4 */
    public void mo89358K4() {
        this.f29408c.f111651h.performClick();
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: K5 */
    public void mo45097K5(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        C33512Id0.f15943l.m101879a(birdId).show(getActivity().getSupportFragmentManager(), "CannotAccessReportsBottomSheet");
    }

    @Override // p000.InterfaceC41256fy3
    /* renamed from: Kj */
    public void mo40398Kj(ZoneFlightSheetDetails zoneFlightSheetDetails) {
        Intrinsics.checkNotNullParameter(zoneFlightSheetDetails, "zoneFlightSheetDetails");
        this.f29408c.f111647d.m58655g0(this.f29410e.m99023a(zoneFlightSheetDetails));
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: L7 */
    public void mo89357L7(boolean z) {
        this.f29408c.f111666w.m54509t(z);
    }

    @Override // p000.InterfaceC33803Jj3
    /* renamed from: La */
    public void mo89356La() {
        this.f29408c.f111647d.m59058t(true);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: M3 */
    public void mo17126M3(VehicleCommand vehicleCommand) {
        InterfaceC32282Cw3.C1261a.m111260f(this, vehicleCommand);
    }

    @Override // p000.InterfaceC35216Pk3
    /* renamed from: M5 */
    public void mo89355M5(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f29408c.f111647d.m58659c0(sections);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: O6 */
    public Observable<FlightSheetButton> mo45096O6() {
        Observable map = this.f29408c.f111647d.m59059s().filter(C6580o.f29429b).map(C6581p.f29430b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        return map;
    }

    @Override // p000.InterfaceC47769qx3
    /* renamed from: P5 */
    public Observable<WarehouseFlightSheetButton> mo16729P5() {
        Observable map = this.f29408c.f111647d.m59059s().filter(C6585t.f29434b).map(C6586u.f29435b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        return map;
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: P6 */
    public Observable<Unit> mo89354P6() {
        ImageButton imageButton = this.f29408c.f111653j;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.directionsButton");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Pd */
    public AbstractC23442F<Unit> mo45095Pd() {
        C33882Js1 c33882Js1 = new C33882Js1();
        c33882Js1.show(getActivity().getSupportFragmentManager(), "FlightSheetQuickCaptureReadyFragment");
        return c33882Js1.m99617a5();
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: Pg */
    public AbstractC23442F<DialogResponse> mo18682Pg(int i) {
        return H31.C3014a.birdDialog$default(this, new C23(i), false, false, 6, null);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Qc */
    public Observable<Boolean> mo45093Qc() {
        return mo89305rg(OperatorMapBottomSheet.EnumC14592a.FLIGHT_SHEET);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: Qh */
    public AbstractC23442F<DialogResponse> mo45092Qh() {
        String string = getActivity().getString(C45871nl4.inspection_label);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.inspection_label)");
        return H31.C3014a.showBottomSheetAlert$default(this, new NI4(string), null, 2, null);
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: Qj */
    public AbstractC23442F<List<String>> mo18681Qj(String nestId) {
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        X23 m77521a = X23.f42551i.m77521a(nestId);
        m77521a.show(getActivity().getSupportFragmentManager(), "NestFavoritePartnerDialogFragment");
        return m77521a.m77522t8();
    }

    @Override // p000.InterfaceC36926Ws3, p000.InterfaceC47086po3
    /* renamed from: R0 */
    public void mo18680R0(int i) {
        String string = getActivity().getString(C45871nl4.count_vehicles_released, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…vehicles_released, count)");
        InterfaceC41921h56.C22549a.topToast$default(this, string, (EnumC40735f56) null, 2, (Object) null);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Sa */
    public AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list) {
        return InterfaceC32282Cw3.C1261a.m111261e(this, list);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: Tg */
    public boolean mo89349Tg() {
        return this.f29408c.f111651h.performClick();
    }

    @Override // p000.InterfaceC33803Jj3
    /* renamed from: U2 */
    public void mo89347U2() {
        this.f29408c.f111647d.m59082T();
        mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: Wb */
    public void mo89344Wb() {
        this.f29408c.f111653j.setVisibility(0);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: Wi */
    public void mo89343Wi(boolean z) {
        ParkingNestView parkingNestView = this.f29408c.f111666w;
        Intrinsics.checkNotNullExpressionValue(parkingNestView, "binding.parkingNestView");
        C49520tu6.show$default(parkingNestView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: Z0 */
    public void mo89339Z0(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.f29415j = menu;
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: Z2 */
    public void mo89338Z2(int i) {
        this.f29408c.f111656m.setNumFiltersApplied(i);
    }

    @Override // p000.InterfaceC35216Pk3
    /* renamed from: bc */
    public AbstractC23442F<DialogResponse> mo89335bc() {
        return H31.C3014a.birdDialog$default(this, C00.f3202d, false, false, 6, null);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: be */
    public void mo45079be(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f29408c.f111647d.m58658d0(sections);
    }

    @Override // p000.InterfaceC47769qx3
    /* renamed from: bi */
    public void mo16728bi(WarehouseFlightSheetDetails warehouseFlightSheetDetails) {
        Intrinsics.checkNotNullParameter(warehouseFlightSheetDetails, "warehouseFlightSheetDetails");
        this.f29408c.f111647d.m58656f0(this.f29411f.m101418a(warehouseFlightSheetDetails));
    }

    @Override // p000.InterfaceC35216Pk3
    /* renamed from: cb */
    public Observable<Integer> mo89333cb() {
        List listOf;
        Button button = this.f29408c.f111649f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.bountyPrimary");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C6573h c6573h = C6573h.f29422g;
        Button button2 = this.f29408c.f111650g;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.bountySecondary");
        Observable clicksThrottle$default2 = C44626lf5.clicksThrottle$default(button2, 0L, 1, null);
        final C6574i c6574i = C6574i.f29423g;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Observable[]{clicksThrottle$default.flatMap(new InterfaceC23492o() { // from class: Nw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m89326fm;
                m89326fm = C35324Pw3.m89326fm(Function1.this, obj);
                return m89326fm;
            }
        }), clicksThrottle$default2.flatMap(new InterfaceC23492o() { // from class: Ow3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m89323gm;
                m89323gm = C35324Pw3.m89323gm(Function1.this, obj);
                return m89323gm;
            }
        })});
        Observable<Integer> merge = Observable.merge(listOf);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      listOf(\n   ….just(1) },\n      )\n    )");
        return merge;
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: ce */
    public void mo18679ce(boolean z) {
        boolean z2;
        if (z) {
            C29040u4 c29040u4 = this.f29408c;
            c29040u4.f111663t.m67897h(c29040u4.f111664u);
            Button button = this.f29408c.f111664u;
            Intrinsics.checkNotNullExpressionValue(button, "binding.nestClaim");
            Group group = this.f29408c.f111663t;
            Intrinsics.checkNotNullExpressionValue(group, "binding.nestButtonGroup");
            if (group.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C49520tu6.show$default(button, z2, 0, 2, null);
            return;
        }
        C29040u4 c29040u42 = this.f29408c;
        c29040u42.f111663t.m67888s(c29040u42.f111664u);
        Button button2 = this.f29408c.f111664u;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.nestClaim");
        C49520tu6.show$default(button2, false, 0, 2, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: e1 */
    public Observable<Unit> mo89330e1() {
        OperatorMapFilterButtonView operatorMapFilterButtonView = this.f29408c.f111656m;
        Intrinsics.checkNotNullExpressionValue(operatorMapFilterButtonView, "binding.filterButton");
        return C44626lf5.clicksThrottle$default(operatorMapFilterButtonView, 0L, 1, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: e7 */
    public void mo89329e7(boolean z) {
        ImageView imageView = this.f29408c.f111669z;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.revenueMapButton");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: fd */
    public Observable<Boolean> mo89327fd() {
        ImageView imageView = this.f29408c.f111669z;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.revenueMapButton");
        return m89319im(imageView);
    }

    @Override // p000.InterfaceC35216Pk3
    /* renamed from: g3 */
    public AbstractC23442F<DialogResponse> mo89325g3(String title, String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return H31.C3014a.birdDialog$default(this, new C30268xh(title, body), false, false, 6, null);
    }

    @Override // p000.InterfaceC35216Pk3
    /* renamed from: gc */
    public Observable<BountyFlightSheetButton> mo89324gc() {
        Observable map = this.f29408c.f111647d.m59059s().filter(C6575j.f29424b).map(C6576k.f29425b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        return map;
    }

    @Override // p000.InterfaceC44721lp0
    public AbstractC26846oA getAdapter() {
        return this.f29408c.f111647d.m58662Z();
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: h8 */
    public Observable<NestFlightSheetButton> mo18678h8() {
        Observable map = this.f29408c.f111647d.m59059s().filter(C6582q.f29431b).map(C6583r.f29432b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        return map;
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: i5 */
    public Observable<Boolean> mo89321i5() {
        ImageView imageView = this.f29408c.f111655l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.feeAreaButton");
        return m89319im(imageView);
    }

    @Override // p000.InterfaceC36926Ws3
    /* renamed from: id */
    public Observable<OperatorScanIntent> mo77762id() {
        Button button = this.f29408c.f111668y;
        Intrinsics.checkNotNullExpressionValue(button, "binding.releaseButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C6584s c6584s = C6584s.f29433g;
        Observable<OperatorScanIntent> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: Kw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                OperatorScanIntent m89310nm;
                m89310nm = C35324Pw3.m89310nm(Function1.this, obj);
                return m89310nm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.releaseButton.cl…ratorScanIntent.RELEASE }");
        return map;
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: ik */
    public void mo89320ik() {
        getActivity().startActivity(new Intent(getActivity(), OperatorPermissionsRequiredActivity.class));
    }

    /* renamed from: im */
    public final Observable<Boolean> m89319im(View view) {
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(view, 0L, 1, null);
        final C6578m c6578m = new C6578m();
        Observable doOnNext = clicksThrottle$default.doOnNext(new InterfaceC23484g() { // from class: Ew3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35324Pw3.m89317jm(Function1.this, obj);
            }
        });
        final C6579n c6579n = new C6579n();
        Observable<Boolean> map = doOnNext.map(new InterfaceC23492o() { // from class: Fw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m89315km;
                m89315km = C35324Pw3.m89315km(Function1.this, obj);
                return m89315km;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun View.clicksT… quickFilterEnabled }\n  }");
        return map;
    }

    @Override // p000.InterfaceC33803Jj3
    /* renamed from: jj */
    public Observable<OperatorMapBottomSheet.EnumC14592a> mo89318jj() {
        Observable<OperatorMapBottomSheet.EnumC14592a> startWith = this.f29412g.hide().startWith((Observable<OperatorMapBottomSheet.EnumC14592a>) this.f29408c.f111647d.m58663Y());
        Intrinsics.checkNotNullExpressionValue(startWith, "typeRelay.hide()\n    .st…tomSheet.bottomSheetType)");
        return startWith;
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: kh */
    public void mo89316kh(boolean z) {
        boolean z2;
        if (z) {
            C29040u4 c29040u4 = this.f29408c;
            c29040u4.f111638A.m67897h(c29040u4.f111640C);
            Button button = this.f29408c.f111640C;
            Intrinsics.checkNotNullExpressionValue(button, "binding.swapBatteryButton");
            Group group = this.f29408c.f111638A;
            Intrinsics.checkNotNullExpressionValue(group, "binding.scanButtonGroup");
            if (group.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C49520tu6.show$default(button, z2, 0, 2, null);
            return;
        }
        C29040u4 c29040u42 = this.f29408c;
        c29040u42.f111638A.m67888s(c29040u42.f111640C);
        Button button2 = this.f29408c.f111640C;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.swapBatteryButton");
        C49520tu6.show$default(button2, false, 0, 2, null);
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: lh */
    public AbstractC23442F<DialogResponse> mo18677lh(int i) {
        return H31.C3014a.birdDialog$default(this, new C47245q43(i), false, false, 6, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: lk */
    public void mo89314lk() {
        this.f29408c.f111653j.setVisibility(8);
    }

    @Override // p000.InterfaceC53074zu3
    /* renamed from: mc */
    public void mo146mc(boolean z) {
        TabLayout tabLayout = this.f29408c.f111641D;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "binding.tabLayout");
        C49520tu6.show$default(tabLayout, z, 0, 2, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: n4 */
    public void mo89311n4(InterfaceC7269Rm model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f29408c.f111647d.m58654h0(model);
        this.f29408c.f111647d.m59080V();
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: nb */
    public void mo18676nb(String newClaimErrorMessage) {
        Intrinsics.checkNotNullParameter(newClaimErrorMessage, "newClaimErrorMessage");
        InterfaceC41921h56.C22549a.topToast$default(this, newClaimErrorMessage, (EnumC40735f56) null, 2, (Object) null);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: o */
    public void mo17123o(Collection<C3023H6> collection) {
        InterfaceC32282Cw3.C1261a.m111262d(this, collection);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: o2 */
    public Observable<AreaBottomSheetButton> mo89309o2() {
        Observable map = this.f29408c.f111647d.m59059s().filter(C6569d.f29418b).map(C6570e.f29419b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        return map;
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: ok */
    public void mo89308ok(boolean z) {
        ImageView imageView = this.f29408c.f111655l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.feeAreaButton");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: p9 */
    public void mo89307p9(ParkingNest parkingNest, float f) {
        Intrinsics.checkNotNullParameter(parkingNest, "parkingNest");
        this.f29408c.f111666w.setParkingNest(parkingNest, f);
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: q2 */
    public void mo45077q2() {
        mo89356La();
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: re */
    public void mo89306re(boolean z) {
        OperatorMapFilterButtonView operatorMapFilterButtonView = this.f29408c.f111656m;
        Intrinsics.checkNotNullExpressionValue(operatorMapFilterButtonView, "binding.filterButton");
        C49520tu6.show$default(operatorMapFilterButtonView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC33803Jj3
    /* renamed from: rg */
    public Observable<Boolean> mo89305rg(OperatorMapBottomSheet.EnumC14592a enumC14592a) {
        Observable<AbstractC6031OZ> empty;
        C24523e c24523e = C24523e.f91168a;
        BottomSheetBehavior<View> m59057u = this.f29408c.f111647d.m59057u();
        if (m59057u == null || (empty = C48927su6.m13412c(m59057u)) == null) {
            empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
        }
        Observable m31956a = c24523e.m31956a(empty, mo89318jj());
        final C6571f c6571f = C6571f.f29420g;
        Observable filter = m31956a.filter(new InterfaceC23494q() { // from class: Lw3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m89331dm;
                m89331dm = C35324Pw3.m89331dm(Function1.this, obj);
                return m89331dm;
            }
        });
        final C6572g c6572g = new C6572g(enumC14592a);
        Observable<Boolean> map = filter.map(new InterfaceC23492o() { // from class: Mw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m89328em;
                m89328em = C35324Pw3.m89328em(Function1.this, obj);
                return m89328em;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "type: OperatorMapBottomS…      } else true\n      }");
        return map;
    }

    @Override // p000.InterfaceC53074zu3
    /* renamed from: s2 */
    public Observable<EnumC52481yu3> mo145s2() {
        Observable<EnumC52481yu3> startWith = this.f29413h.hide().startWith((Observable<EnumC52481yu3>) EnumC52481yu3.values()[this.f29408c.f111641D.m48815C()]);
        Intrinsics.checkNotNullExpressionValue(startWith, "tabRelay.hide().startWit…out.selectedTabPosition])");
        return startWith;
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: t1 */
    public void mo17122t1() {
        InterfaceC32282Cw3.C1261a.m111265a(this);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: tj */
    public Observable<Unit> mo89304tj() {
        View findViewById = this.f29408c.f111666w.findViewById(C52955zi4.getDirectionsButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "binding.parkingNestView.…W.id.getDirectionsButton)");
        return C44626lf5.clicksThrottle$default(findViewById, 0L, 1, null);
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: u4 */
    public void mo18675u4(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Object m33135e = H31.C3014a.birdDialog$default(this, new D23(message), false, false, 6, null).m33135e(AutoDispose.m45239a(AndroidLifecycleScopeProvider.m45197b(getActivity())));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.au…er.from(lifecycleOwner)))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: ua */
    public void mo18674ua(NestFlightSheetDetails nestFlightSheetDetails) {
        Intrinsics.checkNotNullParameter(nestFlightSheetDetails, "nestFlightSheetDetails");
        this.f29408c.f111647d.m58657e0(this.f29409d.m105884a(nestFlightSheetDetails));
    }

    @Override // p000.InterfaceC36924Ws1
    /* renamed from: ui */
    public void mo45075ui(Bird bird) {
        String string;
        Intrinsics.checkNotNullParameter(bird, "bird");
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseCoreActivity activity = getActivity();
        if (C0613BT.m114031b(bird)) {
            string = getActivity().getString(C45871nl4.flight_sheet_toast_marked_damaged, bird.getCode());
        } else {
            string = getActivity().getString(C45871nl4.flight_sheet_toast_unmarked_damaged, bird.getCode());
        }
        String str = string;
        Intrinsics.checkNotNullExpressionValue(str, "if (bird.isDamaged()) {\n…maged, bird.code)\n      }");
        C53094zw3.C31593a.makeText$default(c31593a, activity, str, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: v8 */
    public void mo89303v8() {
        new C43498jl3().show(getActivity().getSupportFragmentManager(), "OperatorFilterV2BottomSheet");
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: v9 */
    public void mo17121v9(VehicleCommand vehicleCommand) {
        InterfaceC32282Cw3.C1261a.m111259g(this, vehicleCommand);
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: vd */
    public void mo18673vd(int i, int i2, DateTime expiresAt) {
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        F23.f8483c.m108086a(i, i2, expiresAt).show(getActivity().getSupportFragmentManager(), "NestClaimSuccessDialogFragment");
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: w3 */
    public Observable<Unit> mo89302w3() {
        Button button = this.f29408c.f111640C;
        Intrinsics.checkNotNullExpressionValue(button, "binding.swapBatteryButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: w5 */
    public Observable<Unit> mo18672w5() {
        Button button = this.f29408c.f111664u;
        Intrinsics.checkNotNullExpressionValue(button, "binding.nestClaim");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: wh */
    public void mo89301wh(boolean z) {
        this.f29408c.f111655l.setSelected(z);
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: xa */
    public void mo89300xa(Boolean bool, Boolean bool2, Integer num) {
        MenuItem findItem;
        MenuItem findItem2;
        Menu menu = this.f29415j;
        if (menu != null) {
            if (bool != null && (findItem2 = menu.findItem(C36585Vg4.areaRefresh)) != null) {
                Intrinsics.checkNotNullExpressionValue(findItem2, "findItem(R.id.areaRefresh)");
                C49520tu6.m11234q(findItem2, bool.booleanValue());
            }
            if (bool2 != null && (findItem = menu.findItem(C36585Vg4.notifications)) != null) {
                Intrinsics.checkNotNullExpressionValue(findItem, "findItem(R.id.notifications)");
                C49520tu6.m11234q(findItem, bool2.booleanValue());
            }
        }
    }

    @Override // p000.InterfaceC35684Rk3
    /* renamed from: xd */
    public void mo86401xd(InterfaceC35450Qk3 mode) {
        Object orNull;
        String str;
        Object orNull2;
        BountyFlightSheetAction bountyFlightSheetAction;
        boolean z;
        Object orNull3;
        String str2;
        Object orNull4;
        int m94301c;
        Drawable m94299e;
        int i;
        String str3;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Group group = this.f29408c.f111638A;
        Intrinsics.checkNotNullExpressionValue(group, "binding.scanButtonGroup");
        boolean z2 = false;
        BountyFlightSheetAction bountyFlightSheetAction2 = null;
        C49520tu6.show$default(group, false, 0, 2, null);
        Button button = this.f29408c.f111645b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.acceptTaskButton");
        C49520tu6.show$default(button, false, 0, 2, null);
        Group group2 = this.f29408c.f111648e;
        Intrinsics.checkNotNullExpressionValue(group2, "binding.bountyButtonGroup");
        C49520tu6.show$default(group2, false, 0, 2, null);
        Group group3 = this.f29408c.f111663t;
        Intrinsics.checkNotNullExpressionValue(group3, "binding.nestButtonGroup");
        C49520tu6.show$default(group3, false, 0, 2, null);
        Button button2 = this.f29408c.f111643F;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.warehouseRelease");
        C49520tu6.show$default(button2, false, 0, 2, null);
        ConstraintLayout constraintLayout = this.f29408c.f111639B;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.scanFrame");
        C49520tu6.m11233r(constraintLayout);
        if (mode instanceof InterfaceC35450Qk3.C6853c) {
            Group group4 = this.f29408c.f111638A;
            Intrinsics.checkNotNullExpressionValue(group4, "binding.scanButtonGroup");
            C49520tu6.m11233r(group4);
        } else if (mode instanceof InterfaceC35450Qk3.C6854d) {
            Button button3 = this.f29408c.f111645b;
            Intrinsics.checkNotNullExpressionValue(button3, "binding.acceptTaskButton");
            C49520tu6.m11233r(button3);
        } else if (mode instanceof InterfaceC35450Qk3.C6852b) {
            Group group5 = this.f29408c.f111663t;
            Intrinsics.checkNotNullExpressionValue(group5, "binding.nestButtonGroup");
            C49520tu6.m11233r(group5);
            InterfaceC35450Qk3.C6852b c6852b = (InterfaceC35450Qk3.C6852b) mode;
            if (c6852b.m88096b()) {
                str3 = getActivity().getString(C45871nl4.unclaim);
                Intrinsics.checkNotNullExpressionValue(str3, "activity.getString(L.string.unclaim)");
                i = NA0.m94301c(getActivity(), C32364Df4.birdRed);
                m94299e = NA0.m94299e(getActivity(), C33309Hg4.button_secondary_default);
            } else {
                String string = getActivity().getString(C45871nl4.option_sheet_claim);
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.string.option_sheet_claim)");
                if (c6852b.m88095c() != null) {
                    m94301c = NA0.m94301c(getActivity(), C32364Df4.birdWhite);
                    m94299e = NA0.m94299e(getActivity(), C33309Hg4.button_secondary_disabled);
                } else {
                    m94301c = NA0.m94301c(getActivity(), C32364Df4.primaryText);
                    m94299e = NA0.m94299e(getActivity(), C33309Hg4.button_secondary_default);
                }
                i = m94301c;
                str3 = string;
            }
            this.f29408c.f111664u.setText(str3);
            this.f29408c.f111664u.setTextColor(i);
            this.f29408c.f111664u.setBackground(m94299e);
        } else if (mode instanceof InterfaceC35450Qk3.C6851a) {
            Button button4 = this.f29408c.f111649f;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.bountyPrimary");
            InterfaceC35450Qk3.C6851a c6851a = (InterfaceC35450Qk3.C6851a) mode;
            orNull = CollectionsKt___CollectionsKt.getOrNull(c6851a.m88098b(), 0);
            BountyFlightSheetMapButtonOverrides bountyFlightSheetMapButtonOverrides = (BountyFlightSheetMapButtonOverrides) orNull;
            if (bountyFlightSheetMapButtonOverrides != null) {
                str = bountyFlightSheetMapButtonOverrides.getTitle();
            } else {
                str = null;
            }
            C49520tu6.setTextAndVisibility$default(button4, str, 0, 2, null);
            Button button5 = this.f29408c.f111649f;
            orNull2 = CollectionsKt___CollectionsKt.getOrNull(c6851a.m88098b(), 0);
            BountyFlightSheetMapButtonOverrides bountyFlightSheetMapButtonOverrides2 = (BountyFlightSheetMapButtonOverrides) orNull2;
            if (bountyFlightSheetMapButtonOverrides2 != null) {
                bountyFlightSheetAction = bountyFlightSheetMapButtonOverrides2.getAction();
            } else {
                bountyFlightSheetAction = null;
            }
            if (bountyFlightSheetAction != null) {
                z = true;
            } else {
                z = false;
            }
            button5.setEnabled(z);
            Button button6 = this.f29408c.f111650g;
            Intrinsics.checkNotNullExpressionValue(button6, "binding.bountySecondary");
            orNull3 = CollectionsKt___CollectionsKt.getOrNull(c6851a.m88098b(), 1);
            BountyFlightSheetMapButtonOverrides bountyFlightSheetMapButtonOverrides3 = (BountyFlightSheetMapButtonOverrides) orNull3;
            if (bountyFlightSheetMapButtonOverrides3 != null) {
                str2 = bountyFlightSheetMapButtonOverrides3.getTitle();
            } else {
                str2 = null;
            }
            C49520tu6.setTextAndVisibility$default(button6, str2, 0, 2, null);
            Button button7 = this.f29408c.f111650g;
            orNull4 = CollectionsKt___CollectionsKt.getOrNull(c6851a.m88098b(), 1);
            BountyFlightSheetMapButtonOverrides bountyFlightSheetMapButtonOverrides4 = (BountyFlightSheetMapButtonOverrides) orNull4;
            if (bountyFlightSheetMapButtonOverrides4 != null) {
                bountyFlightSheetAction2 = bountyFlightSheetMapButtonOverrides4.getAction();
            }
            if (bountyFlightSheetAction2 != null) {
                z2 = true;
            }
            button7.setEnabled(z2);
        } else if (mode instanceof InterfaceC35450Qk3.C6855e) {
            Button button8 = this.f29408c.f111643F;
            Intrinsics.checkNotNullExpressionValue(button8, "binding.warehouseRelease");
            C49520tu6.m11233r(button8);
        }
    }

    @Override // p000.InterfaceC32282Cw3
    /* renamed from: xg */
    public Observable<Unit> mo89299xg() {
        Button button = this.f29408c.f111645b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.acceptTaskButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC47086po3
    /* renamed from: xl */
    public Observable<Unit> mo18671xl() {
        Button button = this.f29408c.f111665v;
        Intrinsics.checkNotNullExpressionValue(button, "binding.nestRelease");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC36926Ws3
    /* renamed from: zb */
    public void mo77761zb(boolean z) {
        this.f29408c.f111669z.setSelected(z);
    }
}
