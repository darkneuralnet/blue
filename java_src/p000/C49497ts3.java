package p000;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.buava.Optional;
import co.bird.android.core.base.viewmodel.CoreInventorySuccess;
import co.bird.android.feature.bottomsheets.map.OperatorMapBottomSheet;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.IssueTypeAssetManifestItem;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.Point;
import co.bird.android.model.QCInspectionAssetManifestItem;
import co.bird.android.model.RepairTypeAssetManifestItem;
import co.bird.android.model.Route;
import co.bird.android.model.TaskOrderData;
import co.bird.android.model.User;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.BirdBadgeType;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.ServiceCenterConfig;
import co.bird.api.error.RetrofitException;
import co.bird.api.exception.HttpException;
import co.bird.api.request.BluetoothTrackBody;
import co.bird.api.response.WorkOrderAssetManifest;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
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
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.C41318g46;
import p000.C49497ts3;
import p000.H31;
import p000.InterfaceC27246pJ;
import p000.InterfaceC31776As1;
import p000.InterfaceC32282Cw3;
import p000.InterfaceC35450Qk3;
import p000.InterfaceC40099e13;
import p000.InterfaceC44637lg6;
import p000.InterfaceC46473om3;
import p000.InterfaceC46545ot5;
import p000.InterfaceC48923su2;
import p000.InterfaceC49820uQ3;
import p000.S74;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Ç\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002È\u0001B\u0081\u0002\b\u0007\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010U\u001a\u00020S\u0012\u0006\u0010X\u001a\u00020\u0003\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u0010d\u001a\u00020a\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010l\u001a\u00020i\u0012\u0006\u0010p\u001a\u00020m\u0012\u0006\u0010t\u001a\u00020q\u0012\u0006\u0010x\u001a\u00020u\u0012\b\b\u0001\u0010|\u001a\u00020y\u0012\u0011\b\u0001\u0010Ä\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010Â\u0001\u0012\t\b\u0001\u0010\u0080\u0001\u001a\u00020}\u0012\n\b\u0001\u0010\u0084\u0001\u001a\u00030\u0081\u0001\u0012\n\b\u0001\u0010\u0088\u0001\u001a\u00030\u0085\u0001\u0012\u000f\b\u0001\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\u000f\b\u0001\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\n\b\u0001\u0010\u0091\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0003J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0016H\u0002J\u0011\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0096\u0001J\u0018\u0010'\u001a\u00020\u00042\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001aH\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\"\u00100\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J\u001f\u00105\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010TR\u0014\u0010X\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001d\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001d\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001RZ\u0010\u0095\u0001\u001aE\u0012\u001b\u0012\u0019\u0012\u0005\u0012\u00030\u0092\u0001 \u0093\u0001*\u000b\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u001a0\u001a \u0093\u0001*!\u0012\u001b\u0012\u0019\u0012\u0005\u0012\u00030\u0092\u0001 \u0093\u0001*\u000b\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u001a0\u001a\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008a\u0001R3\u0010\u0099\u0001\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0007 \u0093\u0001*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u001a0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R%\u0010\u009e\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00160\u009b\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R'\u0010¥\u0001\u001a\u0012\u0012\r\u0012\u000b \u0093\u0001*\u0004\u0018\u00010\u00070\u00070¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010¨\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R'\u0010¬\u0001\u001a\u0012\u0012\r\u0012\u000b \u0093\u0001*\u0004\u0018\u00010\u00040\u00040©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R'\u0010®\u0001\u001a\u0012\u0012\r\u0012\u000b \u0093\u0001*\u0004\u0018\u00010\u00040\u00040©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010«\u0001R\u0018\u0010²\u0001\u001a\u00030¯\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u001c\u0010¶\u0001\u001a\u00020\t*\u00030³\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010¸\u0001\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bD\u0010·\u0001R\u0016\u0010¹\u0001\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bZ\u0010·\u0001R\u0016\u0010º\u0001\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b^\u0010·\u0001R\u0019\u0010½\u0001\u001a\u0005\u0018\u00010»\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bf\u0010¼\u0001R\u0016\u0010¾\u0001\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bb\u0010·\u0001R\u0016\u0010¿\u0001\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bV\u0010·\u0001R\u0016\u0010À\u0001\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bL\u0010·\u0001R\u0016\u0010Á\u0001\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b<\u0010·\u0001¨\u0006É\u0001"}, m28432d2 = {"Lts3;", "LxC;", "LJq3;", "LuQ3;", "", "g1", "r1", "Lco/bird/android/model/persistence/BirdMapMarker;", "marker", "", "selected", "zoomToBird", "G1", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaskOrderData;", "Z2", "birdMarker", "v1", "Lco/bird/android/model/wire/WireBird;", "bird", "y1", "", "birdId", "T2", "z1", "", "birdMarkers", "V2", "q1", "U2", "birdCode", "W2", "Lco/bird/android/model/constant/Permission;", "permission", "Lco/bird/android/model/PermissionStatus;", "j", "Lco/bird/android/model/Point;", "zoomIncludeRegion", "I1", "onResume", "onDestroy", "K2", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lco/bird/android/model/Vehicle;", "vehicle", "Landroid/location/Location;", "location", "e3", "(Lco/bird/android/model/Vehicle;Landroid/location/Location;)V", "Llg6;", "c", "Llg6;", "agreementManager", "LaM;", DateTokenConverter.CONVERTER_KEY, "LaM;", "birdManager", "LpJ;", "e", "LpJ;", "bluetoothManager", "Llh6;", "f", "Llh6;", "userManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "Lot5;", "h", "Lot5;", "serverDrivenFilterManager", "LyL;", "i", "LyL;", "birdFinderManager", "Lgl;", "Lgl;", "preference", "k", "LuQ3;", "permissionDelegate", "LEa;", "l", "LEa;", "analyticsManager", "LTl3;", "m", "LTl3;", "operatorFiltersAnalyticsManager", "Ldr4;", "n", "Ldr4;", "locationManager", "LaG6;", "o", "LaG6;", "workOrderManager", "Lsu2;", "p", "Lsu2;", "localAssetManager", "Lom3;", "q", "Lom3;", "operatorManager", "LtZ5;", "r", "LtZ5;", "taskOrderManager", "LDQ3;", "s", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;", "t", "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;", "mapScopeProvider", "LNm3;", "u", "LNm3;", "mapUi", "LCw3;", "v", "LCw3;", "ui", "Le13;", "w", "Le13;", "navigator", "x", "Lio/reactivex/Observable;", "locationEnableChange", "y", "bluetoothEnableChange", "LAs1;", "z", "LAs1;", "flightSheetDelegate", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "A", "operatorFiltersStream", "LZ84;", "B", "LZ84;", "nearbyBirdsStream", "La94;", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "La94;", "doNotShowBirds", "D", "Lco/bird/android/model/persistence/BirdMapMarker;", "selectedMarker", "Lio/reactivex/subjects/a;", "E", "Lio/reactivex/subjects/a;", "flightSheetBirdMarkerSubject", "F", "Z", "showPostConfirmationDialog", "Lma4;", "G", "Lma4;", "loadBirdsRelay", "H", "refreshFlightSheetIfOpen", "Lg46$b;", "t1", "()Lg46$b;", "logger", "Lyu3;", "u1", "(Lyu3;)Z", "showVehicles", "()Z", "accessWifiStatePermissionGranted", "bluetoothEnabled", "cameraPermissionGranted", "LuQ3$a;", "()LuQ3$a;", "dataSaverState", "fineLocationPermissionGranted", "hasCamera", "locationEnabled", "notificationsEnabled", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "<init>", "(Llg6;LaM;LpJ;Llh6;LTq4;Lot5;LyL;Lgl;LuQ3;LEa;LTl3;Ldr4;LaG6;Lsu2;Lom3;LtZ5;LDQ3;Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;LCw3;Le13;Lio/reactivex/Observable;Lio/reactivex/Observable;LAs1;)V", "I", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Observables.kt\nco/bird/android/library/rx/Observables\n+ 7 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 8 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 9 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n199#2:892\n180#2:893\n180#2:901\n180#2:904\n180#2:905\n237#2:906\n180#2:907\n180#2:908\n180#2:909\n180#2:910\n180#2:911\n180#2:912\n180#2:913\n180#2:914\n180#2:915\n180#2:916\n180#2:917\n237#2:918\n180#2:921\n180#2:924\n180#2:927\n237#2:929\n180#2:930\n180#2:931\n237#2:932\n237#2:934\n180#2:935\n180#2:936\n180#2:937\n199#2:946\n180#2:947\n237#2:950\n199#2:953\n199#2:954\n1#3:894\n1#3:939\n13#4,2:895\n15#4,2:899\n13#4,2:940\n15#4,2:944\n1109#5,2:897\n1109#5,2:942\n52#6,2:902\n22#7,2:919\n22#7,2:922\n22#7,2:925\n252#8:928\n252#8:933\n6#9:938\n288#10,2:948\n288#10,2:951\n*S KotlinDebug\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl\n*L\n188#1:892\n204#1:893\n219#1:901\n236#1:904\n273#1:905\n332#1:906\n338#1:907\n345#1:908\n352#1:909\n370#1:910\n377#1:911\n393#1:912\n410#1:913\n420#1:914\n438#1:915\n455#1:916\n460#1:917\n481#1:918\n491#1:921\n501#1:924\n514#1:927\n541#1:929\n549#1:930\n556#1:931\n590#1:932\n614#1:934\n646#1:935\n657#1:936\n674#1:937\n756#1:946\n780#1:947\n824#1:950\n852#1:953\n879#1:954\n749#1:939\n209#1:895,2\n209#1:899,2\n749#1:940,2\n749#1:944,2\n209#1:897,2\n749#1:942,2\n223#1:902,2\n486#1:919,2\n494#1:922,2\n504#1:925,2\n519#1:928\n605#1:933\n749#1:938\n795#1:948,2\n831#1:951,2\n*E\n"})
/* renamed from: ts3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49497ts3 extends C30060xC implements InterfaceC33866Jq3, InterfaceC49820uQ3 {

    /* renamed from: I */
    public static final C28897a f111177I = new C28897a(null);

    /* renamed from: J */
    public static final int f111178J = 8;

    /* renamed from: K */
    public static final Set<EnumC52481yu3> f111179K;

    /* renamed from: A */
    public final Observable<List<OperatorFilter>> f111180A;

    /* renamed from: B */
    public final Z84<List<BirdMapMarker>> f111181B;

    /* renamed from: C */
    public final C37791a94<Set<String>> f111182C;

    /* renamed from: D */
    public BirdMapMarker f111183D;

    /* renamed from: E */
    public final C24552a<BirdMapMarker> f111184E;

    /* renamed from: F */
    public boolean f111185F;

    /* renamed from: G */
    public final C45168ma4<Unit> f111186G;

    /* renamed from: H */
    public final C45168ma4<Unit> f111187H;

    /* renamed from: c */
    public final InterfaceC44637lg6 f111188c;

    /* renamed from: d */
    public final InterfaceC10636aM f111189d;

    /* renamed from: e */
    public final InterfaceC27246pJ f111190e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f111191f;

    /* renamed from: g */
    public final C36207Tq4 f111192g;

    /* renamed from: h */
    public final InterfaceC46545ot5 f111193h;

    /* renamed from: i */
    public final InterfaceC30556yL f111194i;

    /* renamed from: j */
    public final C22454gl f111195j;

    /* renamed from: k */
    public final InterfaceC49820uQ3 f111196k;

    /* renamed from: l */
    public final InterfaceC1880Ea f111197l;

    /* renamed from: m */
    public final InterfaceC36161Tl3 f111198m;

    /* renamed from: n */
    public final InterfaceC40001dr4 f111199n;

    /* renamed from: o */
    public final InterfaceC37857aG6 f111200o;

    /* renamed from: p */
    public final InterfaceC48923su2 f111201p;

    /* renamed from: q */
    public final InterfaceC46473om3 f111202q;

    /* renamed from: r */
    public final InterfaceC49310tZ5 f111203r;

    /* renamed from: s */
    public final DQ3 f111204s;

    /* renamed from: t */
    public final AndroidLifecycleScopeProvider f111205t;

    /* renamed from: u */
    public final InterfaceC34766Nm3 f111206u;

    /* renamed from: v */
    public final InterfaceC32282Cw3 f111207v;

    /* renamed from: w */
    public final InterfaceC40099e13 f111208w;

    /* renamed from: x */
    public final Observable<Boolean> f111209x;

    /* renamed from: y */
    public final Observable<Boolean> f111210y;

    /* renamed from: z */
    public final InterfaceC31776As1 f111211z;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00070\u0007 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/BirdMapMarker;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$15\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n288#2,2:892\n*S KotlinDebug\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$15\n*L\n250#1:892,2\n*E\n"})
    /* renamed from: ts3$A */
    /* loaded from: classes2.dex */
    public static final class C28852A extends Lambda implements Function1<Pair<? extends WireBird, ? extends List<? extends BirdMapMarker>>, InterfaceC23447K<? extends Optional<BirdMapMarker>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdMapMarker;", "updatedNearbyMarkers", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$15$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,891:1\n1#2:892\n*E\n"})
        /* renamed from: ts3$A$a */
        /* loaded from: classes2.dex */
        public static final class C28853a extends Lambda implements Function1<List<? extends BirdMapMarker>, Optional<BirdMapMarker>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f111213g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28853a(WireBird wireBird) {
                super(1);
                this.f111213g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<BirdMapMarker> invoke(List<BirdMapMarker> updatedNearbyMarkers) {
                Intrinsics.checkNotNullParameter(updatedNearbyMarkers, "updatedNearbyMarkers");
                WireBird wireBird = this.f111213g;
                Intrinsics.checkNotNullExpressionValue(wireBird, "wireBird");
                return Optional.f63040c.m59033b(C28852A.m11339g(updatedNearbyMarkers, wireBird));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts3$A$b */
        /* loaded from: classes2.dex */
        public static final class C28854b extends Lambda implements Function1<Optional<BirdMapMarker>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111214g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28854b(C49497ts3 c49497ts3) {
                super(1);
                this.f111214g = c49497ts3;
            }

            /* renamed from: a */
            public final void m11337a(Optional<BirdMapMarker> optional) {
                this.f111214g.f111202q.mo8107e1();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Optional<BirdMapMarker> optional) {
                m11337a(optional);
                return Unit.INSTANCE;
            }
        }

        public C28852A() {
            super(1);
        }

        /* renamed from: e */
        public static final Optional m11341e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m11340f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final BirdMapMarker m11339g(List<BirdMapMarker> list, WireBird wireBird) {
            Object obj;
            boolean z;
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    BirdMapMarker birdMapMarker = (BirdMapMarker) obj;
                    if (!Intrinsics.areEqual(birdMapMarker.getId(), wireBird.getId()) && !Intrinsics.areEqual(birdMapMarker.getCode(), wireBird.getCode())) {
                        z = false;
                        continue;
                    } else {
                        z = true;
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
            return (BirdMapMarker) obj;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends Optional<BirdMapMarker>> invoke(Pair<WireBird, ? extends List<BirdMapMarker>> pair) {
            AbstractC23442F m33157I;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird wireBird = pair.component1();
            List<BirdMapMarker> nearbyMarkers = pair.component2();
            Intrinsics.checkNotNullExpressionValue(nearbyMarkers, "nearbyMarkers");
            Intrinsics.checkNotNullExpressionValue(wireBird, "wireBird");
            BirdMapMarker m11339g = m11339g(nearbyMarkers, wireBird);
            if (m11339g != null) {
                m33157I = AbstractC23442F.m33158H(Optional.f63040c.m59032c(m11339g));
            } else {
                C49497ts3.this.f111186G.accept(Unit.INSTANCE);
                AbstractC23442F firstOrError = C49497ts3.this.f111181B.skip(1L).firstOrError();
                final C28853a c28853a = new C28853a(wireBird);
                m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: As3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m11341e;
                        m11341e = C49497ts3.C28852A.m11341e(Function1.this, obj);
                        return m11341e;
                    }
                });
            }
            final C28854b c28854b = new C28854b(C49497ts3.this);
            return m33157I.m33112q(new InterfaceC23484g() { // from class: Bs3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49497ts3.C28852A.m11340f(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lot5$b;", "diff", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lot5$b;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$A0 */
    /* loaded from: classes2.dex */
    public static final class C28855A0 extends Lambda implements Function1<InterfaceC46545ot5.C27100b, Integer> {

        /* renamed from: g */
        public static final C28855A0 f111215g = new C28855A0();

        public C28855A0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(InterfaceC46545ot5.C27100b diff) {
            Intrinsics.checkNotNullParameter(diff, "diff");
            return Integer.valueOf(diff.m20356c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "optional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$B */
    /* loaded from: classes2.dex */
    public static final class C28856B extends Lambda implements Function1<Optional<BirdMapMarker>, Unit> {
        public C28856B() {
            super(1);
        }

        /* renamed from: a */
        public final void m11335a(Optional<BirdMapMarker> optional) {
            if (optional.m59037c()) {
                return;
            }
            C49497ts3.this.f111207v.error(C45871nl4.operator_lookup_vehicle_not_found);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<BirdMapMarker> optional) {
            m11335a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$B0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28857B0 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C28857B0(Object obj) {
            super(1, obj, InterfaceC32282Cw3.class, "setNumFilters", "setNumFilters(I)V", 0);
        }

        /* renamed from: a */
        public final void m11334a(int i) {
            ((InterfaceC32282Cw3) this.receiver).mo89338Z2(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m11334a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "marker", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BirdMapMarker;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$C */
    /* loaded from: classes2.dex */
    public static final class C28858C extends Lambda implements Function1<BirdMapMarker, Unit> {
        public C28858C() {
            super(1);
        }

        /* renamed from: a */
        public final void m11333a(BirdMapMarker marker) {
            C49497ts3 c49497ts3 = C49497ts3.this;
            Intrinsics.checkNotNullExpressionValue(marker, "marker");
            c49497ts3.m11511G1(marker, false, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdMapMarker birdMapMarker) {
            m11333a(birdMapMarker);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$C0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28859C0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28859C0 f111218b = new C28859C0();

        public C28859C0() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaskOrderData;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$D */
    /* loaded from: classes2.dex */
    public static final class C28860D extends Lambda implements Function1<Unit, Optional<TaskOrderData>> {
        public C28860D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<TaskOrderData> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49497ts3.this.f111203r.mo1107c().m73665a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "", "doNotShowBirds", C17296a.f69688o, "(Ljava/util/Set;)Ljava/util/Set;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$removeBird$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,891:1\n1#2:892\n*E\n"})
    /* renamed from: ts3$D0 */
    /* loaded from: classes2.dex */
    public static final class C28861D0 extends Lambda implements Function1<Set<String>, Set<String>> {

        /* renamed from: g */
        public final /* synthetic */ String f111220g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28861D0(String str) {
            super(1);
            this.f111220g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Set<String> invoke(Set<String> doNotShowBirds) {
            Intrinsics.checkNotNullParameter(doNotShowBirds, "doNotShowBirds");
            doNotShowBirds.add(this.f111220g);
            return doNotShowBirds;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/TaskOrderData;", "taskOrderData", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/TaskOrderData;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$E */
    /* loaded from: classes2.dex */
    public static final class C28862E extends Lambda implements Function1<TaskOrderData, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts3$E$a */
        /* loaded from: classes2.dex */
        public static final class C28863a extends Lambda implements Function0<AbstractC23461c> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111222g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28863a(C49497ts3 c49497ts3) {
                super(0);
                this.f111222g = c49497ts3;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC23461c invoke() {
                this.f111222g.f111207v.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
                return C28862E.m11326e(this.f111222g.f111203r.mo1109a(), this.f111222g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts3$E$b */
        /* loaded from: classes2.dex */
        public static final class C28864b extends Lambda implements Function0<AbstractC23461c> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111223g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28864b(C49497ts3 c49497ts3) {
                super(0);
                this.f111223g = c49497ts3;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC23461c invoke() {
                this.f111223g.f111207v.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
                return C28862E.m11326e(this.f111223g.f111203r.mo1106d(), this.f111223g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts3$E$c */
        /* loaded from: classes2.dex */
        public static final class C28865c extends Lambda implements Function0<AbstractC23461c> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111224g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28865c(C49497ts3 c49497ts3) {
                super(0);
                this.f111224g = c49497ts3;
            }

            /* renamed from: b */
            public static final void m11322b(C49497ts3 this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.f111195j.m37660X2()) {
                    this$0.f111185F = true;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC23461c invoke() {
                AbstractC23461c m11326e = C28862E.m11326e(this.f111224g.f111203r.mo1109a(), this.f111224g);
                final C49497ts3 c49497ts3 = this.f111224g;
                AbstractC23461c m33029z = m11326e.m33029z(new InterfaceC23478a() { // from class: Es3
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C49497ts3.C28862E.C28865c.m11322b(C49497ts3.this);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33029z, "taskOrderManager.accept(…      }\n                }");
                return m33029z;
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts3$E$d */
        /* loaded from: classes2.dex */
        public static final class C28866d extends Lambda implements Function0<AbstractC23461c> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111225g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28866d(C49497ts3 c49497ts3) {
                super(0);
                this.f111225g = c49497ts3;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC23461c invoke() {
                this.f111225g.f111207v.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
                return C28862E.m11326e(this.f111225g.f111203r.mo1106d(), this.f111225g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts3$E$e */
        /* loaded from: classes2.dex */
        public static final class C28867e extends Lambda implements Function0<AbstractC23461c> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111226g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: ts3$E$e$a */
            /* loaded from: classes2.dex */
            public static final class C28868a extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C49497ts3 f111227g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28868a(C49497ts3 c49497ts3) {
                    super(0);
                    this.f111227g = c49497ts3;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f111227g.f111207v.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28867e(C49497ts3 c49497ts3) {
                super(0);
                this.f111226g = c49497ts3;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC23461c invoke() {
                if (this.f111226g.f111185F) {
                    H31.C3014a.showDialog$default(this.f111226g.f111207v, C38383b93.f56985d, false, false, new C28868a(this.f111226g), null, null, null, 118, null);
                    this.f111226g.f111185F = false;
                    this.f111226g.f111195j.m37716J2();
                }
                AbstractC23461c m33039p = AbstractC23461c.m33039p();
                Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
                return m33039p;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ts3$E$f */
        /* loaded from: classes2.dex */
        public static final class C28869f extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111228g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28869f(C49497ts3 c49497ts3) {
                super(1);
                this.f111228g = c49497ts3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f111228g.f111207v.errorGeneric();
            }
        }

        public C28862E() {
            super(1);
        }

        /* renamed from: e */
        public static final AbstractC23461c m11326e(AbstractC23461c abstractC23461c, final C49497ts3 c49497ts3) {
            AbstractC23461c m33049i = abstractC23461c.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: Cs3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m11325f;
                    m11325f = C49497ts3.C28862E.m11325f(C49497ts3.this);
                    return m11325f;
                }
            }));
            final C28869f c28869f = new C28869f(c49497ts3);
            AbstractC23461c m33084B = m33049i.m33084B(new InterfaceC23484g() { // from class: Ds3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49497ts3.C28862E.m11324g(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33084B, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
            return C28237sD.progress$default(m33084B, c49497ts3.f111207v, 0, 2, (Object) null);
        }

        /* renamed from: f */
        public static final InterfaceC23496h m11325f(C49497ts3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f111203r.refresh();
        }

        /* renamed from: g */
        public static final void m11324g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(TaskOrderData taskOrderData) {
            Intrinsics.checkNotNullParameter(taskOrderData, "taskOrderData");
            if (taskOrderData.getTaskOrderInfo().getCanOperate()) {
                return H31.C3014a.showDialogCompletable$default(C49497ts3.this.f111207v, new C43774kD3(taskOrderData.getBirdCode()), false, false, new C28863a(C49497ts3.this), new C28864b(C49497ts3.this), null, null, 102, null);
            }
            return H31.C3014a.showDialogCompletable$default(C49497ts3.this.f111207v, C37790a93.f49905d, false, false, new C28865c(C49497ts3.this), new C28866d(C49497ts3.this), new C28867e(C49497ts3.this), null, 70, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "wireBird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$E0 */
    /* loaded from: classes2.dex */
    public static final class C28870E0 extends Lambda implements Function1<WireBird, Unit> {
        public C28870E0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11321a(WireBird wireBird) {
            InterfaceC46473om3 interfaceC46473om3 = C49497ts3.this.f111202q;
            Intrinsics.checkNotNullExpressionValue(wireBird, "wireBird");
            interfaceC46473om3.mo8143L0(wireBird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m11321a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$F */
    /* loaded from: classes2.dex */
    public static final class C28871F extends Lambda implements Function1<Location, Unit> {
        public C28871F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            InterfaceC34766Nm3 interfaceC34766Nm3 = C49497ts3.this.f111206u;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            interfaceC34766Nm3.moveTo(location);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$F0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28872F0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28872F0 f111231b = new C28872F0();

        public C28872F0() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012f\u0010\u0002\u001ab\u0012\u0004\u0012\u00020\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*0\u0012\u0004\u0012\u00020\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdMapMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$G */
    /* loaded from: classes2.dex */
    public static final class C28873G extends Lambda implements Function1<Pair<? extends Unit, ? extends Pair<? extends BirdMapMarker, ? extends Boolean>>, Unit> {
        public C28873G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Pair<? extends BirdMapMarker, ? extends Boolean>> pair) {
            invoke2((Pair<Unit, Pair<BirdMapMarker, Boolean>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Pair<BirdMapMarker, Boolean>> pair) {
            C49497ts3.this.f111208w.mo36916x3(UB1.m81889c(pair.component2().getFirst().getLocation()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$G0 */
    /* loaded from: classes2.dex */
    public static final class C28874G0 extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C28874G0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11320a(InterfaceC23465c interfaceC23465c) {
            C49497ts3.this.f111207v.mo86401xd(InterfaceC35450Qk3.C6853c.f30819a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m11320a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$H */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28875H extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28875H f111234b = new C28875H();

        public C28875H() {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaskOrderData;", "kotlin.jvm.PlatformType", "optionalTaskOrderData", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$H0 */
    /* loaded from: classes2.dex */
    public static final class C28876H0 extends Lambda implements Function1<Optional<TaskOrderData>, Unit> {
        public C28876H0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11319a(Optional<TaskOrderData> optional) {
            if (optional.m59037c()) {
                C49497ts3.this.f111207v.mo86401xd(InterfaceC35450Qk3.C6854d.f30820a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<TaskOrderData> optional) {
            m11319a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdMapMarker;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$I */
    /* loaded from: classes2.dex */
    public static final class C28877I extends Lambda implements Function1<Pair<? extends BirdMapMarker, ? extends Boolean>, Unit> {
        public C28877I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BirdMapMarker, ? extends Boolean> pair) {
            invoke2((Pair<BirdMapMarker, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BirdMapMarker, Boolean> pair) {
            boolean booleanValue = pair.component2().booleanValue();
            C49497ts3.m11507H1(C49497ts3.this, pair.component1(), booleanValue, false, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/BluetoothTrackBody;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/api/request/BluetoothTrackBody;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$I0 */
    /* loaded from: classes2.dex */
    public static final class C28878I0 extends Lambda implements Function1<BluetoothTrackBody, Unit> {

        /* renamed from: g */
        public static final C28878I0 f111237g = new C28878I0();

        public C28878I0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11318a(BluetoothTrackBody bluetoothTrackBody) {
            Integer maxSpeed = bluetoothTrackBody.getMaxSpeed();
            C41318g46.m40151m("Track bluetooth bird: maxSpeed: " + maxSpeed, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BluetoothTrackBody bluetoothTrackBody) {
            m11318a(bluetoothTrackBody);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BirdMapMarker;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,891:1\n1#2:892\n*E\n"})
    /* renamed from: ts3$J */
    /* loaded from: classes2.dex */
    public static final class C28879J extends Lambda implements Function1<BirdMapMarker, Unit> {
        public C28879J() {
            super(1);
        }

        /* renamed from: a */
        public final void m11317a(BirdMapMarker birdMapMarker) {
            BirdMapMarker birdMapMarker2 = C49497ts3.this.f111183D;
            if (birdMapMarker2 != null) {
                C49497ts3.this.f111184E.onNext(birdMapMarker2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdMapMarker birdMapMarker) {
            m11317a(birdMapMarker);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$J0 */
    /* loaded from: classes2.dex */
    public static final class C28880J0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28880J0 f111239g = new C28880J0();

        public C28880J0() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$K */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28881K extends FunctionReferenceImpl implements Function1<WireBird, Unit> {
        public C28881K(Object obj) {
            super(1, obj, C49497ts3.class, "handleBirdRemoval", "handleBirdRemoval(Lco/bird/android/model/wire/WireBird;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            invoke2(wireBird);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireBird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C49497ts3) this.receiver).m11351y1(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$L */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28882L extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28882L(Object obj) {
            super(1, obj, C38689bg5.class, "logAndDisplayError", "logAndDisplayError(Lco/bird/android/core/base/ui/SnackUi;Ljava/lang/Throwable;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C38689bg5.m64175f((InterfaceC37910aM5) this.receiver, p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$M */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28883M extends FunctionReferenceImpl implements Function1<BirdMapMarker, Observable<Optional<TaskOrderData>>> {
        public C28883M(Object obj) {
            super(1, obj, C49497ts3.class, "showFlightSheet", "showFlightSheet(Lco/bird/android/model/persistence/BirdMapMarker;)Lio/reactivex/Observable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Observable<Optional<TaskOrderData>> invoke(BirdMapMarker p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C49497ts3) this.receiver).m11434Z2(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaskOrderData;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$N */
    /* loaded from: classes2.dex */
    public static final class C28884N extends Lambda implements Function1<Optional<TaskOrderData>, Unit> {

        /* renamed from: g */
        public static final C28884N f111240g = new C28884N();

        public C28884N() {
            super(1);
        }

        /* renamed from: a */
        public final void m11315a(Optional<TaskOrderData> optional) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<TaskOrderData> optional) {
            m11315a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$28\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,891:1\n1#2:892\n*E\n"})
    /* renamed from: ts3$O */
    /* loaded from: classes2.dex */
    public static final class C28885O extends Lambda implements Function1<Throwable, Unit> {
        public C28885O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C49375tg1 c49375tg1;
            String m11932c;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            Throwable m87362c = R36.m87362c(e);
            Unit unit = null;
            RetrofitException retrofitException = m87362c instanceof RetrofitException ? (RetrofitException) m87362c : null;
            if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && (m11932c = c49375tg1.m11932c()) != null) {
                C49497ts3.this.f111207v.error(m11932c);
                unit = Unit.INSTANCE;
            } else {
                HttpException httpException = m87362c instanceof HttpException ? (HttpException) m87362c : null;
                if (httpException != null) {
                    C49497ts3.this.f111207v.error(httpException);
                    unit = Unit.INSTANCE;
                }
            }
            if (unit == null) {
                C49497ts3.this.f111207v.errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$P */
    /* loaded from: classes2.dex */
    public static final class C28886P extends Lambda implements Function1<Pair<? extends Unit, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C28886P f111242g = new C28886P();

        public C28886P() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Unit, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean visible = pair.component2();
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            return visible;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends Boolean> pair) {
            return invoke2((Pair<Unit, Boolean>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lyu3;", "kotlin.jvm.PlatformType", "tab", "", C17296a.f69688o, "(Lyu3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$Q */
    /* loaded from: classes2.dex */
    public static final class C28887Q extends Lambda implements Function1<EnumC52481yu3, Unit> {
        public C28887Q() {
            super(1);
        }

        /* renamed from: a */
        public final void m11314a(EnumC52481yu3 enumC52481yu3) {
            C49497ts3.this.f111195j.m37713K1(enumC52481yu3.name());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC52481yu3 enumC52481yu3) {
            m11314a(enumC52481yu3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$R */
    /* loaded from: classes2.dex */
    public static final class C28888R extends Lambda implements Function1<Pair<? extends Unit, ? extends Boolean>, Unit> {
        public C28888R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Boolean> pair) {
            invoke2((Pair<Unit, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Boolean> pair) {
            C49497ts3.this.m11494K2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "Lyu3;", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$T */
    /* loaded from: classes2.dex */
    public static final class C28890T extends Lambda implements Function1<Pair<? extends LatLng, ? extends EnumC52481yu3>, Unit> {
        public C28890T() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends LatLng, ? extends EnumC52481yu3> pair) {
            invoke2((Pair<LatLng, ? extends EnumC52481yu3>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<LatLng, ? extends EnumC52481yu3> pair) {
            C49497ts3.this.f111186G.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "Lyu3;", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$U */
    /* loaded from: classes2.dex */
    public static final class C28891U extends Lambda implements Function1<Pair<? extends LatLng, ? extends EnumC52481yu3>, Unit> {

        /* renamed from: g */
        public static final C28891U f111247g = new C28891U();

        public C28891U() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<LatLng, ? extends EnumC52481yu3> pair) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends LatLng, ? extends EnumC52481yu3> pair) {
            invoke2((Pair<LatLng, ? extends EnumC52481yu3>) pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$V */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28892V extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28892V f111248b = new C28892V();

        public C28892V() {
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
    /* renamed from: ts3$W */
    /* loaded from: classes2.dex */
    public static final class C28893W extends Lambda implements Function1<Unit, Unit> {
        public C28893W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC36161Tl3 interfaceC36161Tl3 = C49497ts3.this.f111198m;
            C49497ts3 c49497ts3 = C49497ts3.this;
            interfaceC36161Tl3.mo80890c(C34118Ks3.m98214a(c49497ts3.f111206u.viewport()));
            interfaceC36161Tl3.mo80889d(((List) c49497ts3.f111181B.m73665a()).size());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$X */
    /* loaded from: classes2.dex */
    public static final class C28894X extends Lambda implements Function1<Unit, Unit> {
        public C28894X() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C49497ts3.this.f111207v.mo89303v8();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$Y */
    /* loaded from: classes2.dex */
    public static final class C28895Y extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28895Y f111251g = new C28895Y();

        public C28895Y() {
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

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "overriddenFilters", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$Z */
    /* loaded from: classes2.dex */
    public static final class C28896Z extends Lambda implements Function1<Optional<List<? extends OperatorFilter>>, Boolean> {

        /* renamed from: g */
        public static final C28896Z f111252g = new C28896Z();

        public C28896Z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<List<OperatorFilter>> overriddenFilters) {
            Intrinsics.checkNotNullParameter(overriddenFilters, "overriddenFilters");
            return Boolean.valueOf(overriddenFilters.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lts3$a;", "", "", "Lyu3;", "SHOW_VEHICLE_TABS", "Ljava/util/Set;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ts3$a */
    /* loaded from: classes2.dex */
    public static final class C28897a {
        public /* synthetic */ C28897a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28897a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lyu3;", "tab", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lyu3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$a0 */
    /* loaded from: classes2.dex */
    public static final class C28898a0 extends Lambda implements Function1<EnumC52481yu3, Boolean> {
        public C28898a0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC52481yu3 tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            return Boolean.valueOf(!C49497ts3.this.m11365u1(tab));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl\n*L\n1#1,304:1\n608#2:305\n*E\n"})
    /* renamed from: ts3$b */
    /* loaded from: classes2.dex */
    public static final class C28899b<T1, T2, T3, R> implements InterfaceC23485h<Unit, T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Unit unit, T1 t1, T2 t2) {
            return (R) TuplesKt.m28425to((Boolean) t1, (BirdMapMarker) t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$b0 */
    /* loaded from: classes2.dex */
    public static final class C28900b0 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C28900b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            C49497ts3.this.f111186G.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$c */
    /* loaded from: classes2.dex */
    public static final class C28901c extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C28901c f111255g = new C28901c();

        public C28901c() {
            super(1);
        }

        /* renamed from: a */
        public final void m11311a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m11311a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$c0 */
    /* loaded from: classes2.dex */
    public static final class C28902c0 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C28902c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            Boolean overrideBirds = pair.component1();
            Boolean nonVehicleTab = pair.component2();
            Intrinsics.checkNotNullExpressionValue(overrideBirds, "overrideBirds");
            if (!overrideBirds.booleanValue()) {
                Intrinsics.checkNotNullExpressionValue(nonVehicleTab, "nonVehicleTab");
                if (!nonVehicleTab.booleanValue()) {
                    return;
                }
            }
            C49497ts3.this.f111206u.clearBirdMarkers();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$d */
    /* loaded from: classes2.dex */
    public static final class C28903d extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C28903d f111257g = new C28903d();

        public C28903d() {
            super(1);
        }

        /* renamed from: a */
        public final void m11310a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post bluetooth connect permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m11310a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$d0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28904d0 extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, OperatorMapFilterBundle> {

        /* renamed from: b */
        public static final C28904d0 f111258b = new C28904d0();

        public C28904d0() {
            super(1, C52473yt5.class, "toOperatorMapRequest", "toOperatorMapRequest(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorMapFilterBundle invoke(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C52473yt5.m2323c(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$e */
    /* loaded from: classes2.dex */
    public static final class C28905e extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public static final C28905e f111259g = new C28905e();

        public C28905e() {
            super(1);
        }

        /* renamed from: a */
        public final void m11308a(FQ3 fq3) {
            if (!fq3.m107154a()) {
                C41318g46.m40151m("User denied post notification permission!", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m11308a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$e0 */
    /* loaded from: classes2.dex */
    public static final class C28906e0 extends Lambda implements Function1<OperatorMapFilterBundle, Unit> {
        public C28906e0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11307a(OperatorMapFilterBundle operatorMapFilterBundle) {
            C41318g46.AbstractC20723b m11368t1 = C49497ts3.this.m11368t1();
            m11368t1.mo7228a("Detected filters changed: " + operatorMapFilterBundle, new Object[0]);
            C49497ts3.this.f111186G.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorMapFilterBundle operatorMapFilterBundle) {
            m11307a(operatorMapFilterBundle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$f */
    /* loaded from: classes2.dex */
    public static final class C28907f extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28907f f111261g = new C28907f();

        public C28907f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while checking for required permissions", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$f0 */
    /* loaded from: classes2.dex */
    public static final class C28908f0 extends Lambda implements Function1<OperatorMapFilterBundle, Unit> {

        /* renamed from: g */
        public static final C28908f0 f111262g = new C28908f0();

        public C28908f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11306a(OperatorMapFilterBundle operatorMapFilterBundle) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorMapFilterBundle operatorMapFilterBundle) {
            m11306a(operatorMapFilterBundle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/BirdMapMarker;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$g */
    /* loaded from: classes2.dex */
    public static final class C28909g extends Lambda implements Function1<Pair<? extends Boolean, ? extends BirdMapMarker>, Boolean> {

        /* renamed from: g */
        public static final C28909g f111263g = new C28909g();

        public C28909g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, BirdMapMarker> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean visible = pair.component1();
            Intrinsics.checkNotNullExpressionValue(visible, "visible");
            return visible;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends BirdMapMarker> pair) {
            return invoke2((Pair<Boolean, BirdMapMarker>) pair);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$g0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28910g0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28910g0 f111264b = new C28910g0();

        public C28910g0() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LDX3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LDX3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$h0 */
    /* loaded from: classes2.dex */
    public static final class C28912h0 extends Lambda implements Function1<DX3, Unit> {
        public C28912h0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11305a(DX3 dx3) {
            C49497ts3.this.m11494K2();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DX3 dx3) {
            m11305a(dx3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$i */
    /* loaded from: classes2.dex */
    public static final class C28913i extends Lambda implements Function1<Unit, Unit> {
        public C28913i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToAssociateId$default(C49497ts3.this.f111208w, IdToolOption.BATTERY_SERIAL, null, false, 4, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$i0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28914i0 extends FunctionReferenceImpl implements Function1<DateTime, AbstractC23442F<HM4<WorkOrderAssetManifest>>> {
        public C28914i0(Object obj) {
            super(1, obj, InterfaceC37857aG6.class, "getAssetManifest", "getAssetManifest(Lorg/joda/time/DateTime;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<HM4<WorkOrderAssetManifest>> invoke(DateTime dateTime) {
            return ((InterfaceC37857aG6) this.receiver).mo19636q(dateTime);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", "route", "", C17296a.f69688o, "(Lco/bird/android/model/Route;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$j */
    /* loaded from: classes2.dex */
    public static final class C28915j extends Lambda implements Function1<Route, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BirdMapMarker f111269h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28915j(BirdMapMarker birdMapMarker) {
            super(1);
            this.f111269h = birdMapMarker;
        }

        /* renamed from: a */
        public final void m11303a(Route route) {
            InterfaceC34766Nm3 interfaceC34766Nm3 = C49497ts3.this.f111206u;
            Intrinsics.checkNotNullExpressionValue(route, "route");
            interfaceC34766Nm3.drawRouteAndZoom(route, this.f111269h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Route route) {
            m11303a(route);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WorkOrderAssetManifest;", "manifest", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WorkOrderAssetManifest;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$48\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,891:1\n1549#2:892\n1620#2,3:893\n1549#2:898\n1620#2,3:899\n1549#2:904\n1620#2,3:905\n37#3,2:896\n37#3,2:902\n37#3,2:908\n*S KotlinDebug\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$48\n*L\n470#1:892\n470#1:893,3\n471#1:898\n471#1:899,3\n472#1:904\n472#1:905,3\n470#1:896,2\n471#1:902,2\n472#1:908,2\n*E\n"})
    /* renamed from: ts3$j0 */
    /* loaded from: classes2.dex */
    public static final class C28916j0 extends Lambda implements Function1<WorkOrderAssetManifest, InterfaceC23496h> {
        public C28916j0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WorkOrderAssetManifest manifest) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            List listOfNotNull;
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            List<IssueTypeAssetManifestItem> issueTypes = manifest.getIssueTypes();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(issueTypes, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (IssueTypeAssetManifestItem issueTypeAssetManifestItem : issueTypes) {
                arrayList.add(issueTypeAssetManifestItem.getAssetId());
            }
            spreadBuilder.addSpread(arrayList.toArray(new String[0]));
            List<RepairTypeAssetManifestItem> repairTypes = manifest.getRepairTypes();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(repairTypes, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (RepairTypeAssetManifestItem repairTypeAssetManifestItem : repairTypes) {
                arrayList2.add(repairTypeAssetManifestItem.getAssetId());
            }
            spreadBuilder.addSpread(arrayList2.toArray(new String[0]));
            List<QCInspectionAssetManifestItem> qcInspectionTypes = manifest.getQcInspectionTypes();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(qcInspectionTypes, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
            for (QCInspectionAssetManifestItem qCInspectionAssetManifestItem : qcInspectionTypes) {
                arrayList3.add(qCInspectionAssetManifestItem.getAssetId());
            }
            spreadBuilder.addSpread(arrayList3.toArray(new String[0]));
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new String[spreadBuilder.size()]));
            return InterfaceC48923su2.C28429a.loadAssets$default(C49497ts3.this.f111201p, listOfNotNull, AssetManagerType.REPAIR, null, DateTime.now(), 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$k */
    /* loaded from: classes2.dex */
    public static final class C28917k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28917k f111271g = new C28917k();

        public C28917k() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "show", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$k0 */
    /* loaded from: classes2.dex */
    public static final class C28918k0 extends Lambda implements Function1<Boolean, Unit> {
        public C28918k0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean show) {
            Intrinsics.checkNotNullExpressionValue(show, "show");
            if (show.booleanValue()) {
                C49497ts3.this.f111207v.mo89320ik();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$l */
    /* loaded from: classes2.dex */
    public static final class C28919l extends Lambda implements Function1<Location, Unit> {
        public C28919l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Location location) {
            invoke2(location);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Location location) {
            C49497ts3.this.f111186G.accept(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "show", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$l0 */
    /* loaded from: classes2.dex */
    public static final class C28920l0 extends Lambda implements Function1<Boolean, Unit> {
        public C28920l0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean show) {
            Intrinsics.checkNotNullExpressionValue(show, "show");
            if (show.booleanValue()) {
                C49497ts3.this.f111207v.mo89320ik();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "askForPermissions", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$m0 */
    /* loaded from: classes2.dex */
    public static final class C28928m0 extends Lambda implements Function1<Boolean, Unit> {
        public C28928m0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean askForPermissions) {
            Intrinsics.checkNotNullExpressionValue(askForPermissions, "askForPermissions");
            if (askForPermissions.booleanValue()) {
                C49497ts3.this.f111207v.mo89320ik();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$n */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28929n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28929n f111286b = new C28929n();

        public C28929n() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$o */
    /* loaded from: classes2.dex */
    public static final class C28931o extends Lambda implements Function1<List<? extends OperatorFilter>, OperatorMapFilterBundle> {

        /* renamed from: g */
        public static final C28931o f111288g = new C28931o();

        public C28931o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorMapFilterBundle invoke(List<? extends OperatorFilter> filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            return C52473yt5.m2323c(filters);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$o0 */
    /* loaded from: classes2.dex */
    public static final class C28932o0 extends Lambda implements Function1<Throwable, Unit> {
        public C28932o0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C41318g46.m40159e(e);
            InterfaceC32282Cw3 interfaceC32282Cw3 = C49497ts3.this.f111207v;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            interfaceC32282Cw3.error(e);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$p */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28933p extends FunctionReferenceImpl implements Function1<OperatorMapFilterBundle, AbstractC24490k<List<? extends BirdMapMarker>>> {
        public C28933p(Object obj) {
            super(1, obj, InterfaceC46473om3.class, "streamOperatorMapNearby", "streamOperatorMapNearby(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/Flowable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC24490k<List<BirdMapMarker>> invoke(OperatorMapFilterBundle p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC46473om3) this.receiver).mo8079s(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$p0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28934p0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28934p0 f111290b = new C28934p0();

        public C28934p0() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ts3$q */
    /* loaded from: classes2.dex */
    public static final class C28935q<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C28935q<T1, T2, R> f111291a = new C28935q<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$q0 */
    /* loaded from: classes2.dex */
    public static final class C28936q0 extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C28936q0 f111292g = new C28936q0();

        public C28936q0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getOperatorConfig().getFeatures().getNotificationCenter().getEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl\n*L\n1#1,304:1\n489#2:305\n*E\n"})
    /* renamed from: ts3$r */
    /* loaded from: classes2.dex */
    public static final class C28937r<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            boolean booleanValue = ((Boolean) t2).booleanValue();
            if (((Boolean) t1).booleanValue() && !booleanValue) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "showNotificationCenter", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$r0 */
    /* loaded from: classes2.dex */
    public static final class C28938r0 extends Lambda implements Function1<Boolean, Unit> {
        public C28938r0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            InterfaceC32282Cw3.C1261a.configureMenu$default(C49497ts3.this.f111207v, null, bool, null, 5, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl\n*L\n1#1,304:1\n498#2:305\n*E\n"})
    /* renamed from: ts3$s */
    /* loaded from: classes2.dex */
    public static final class C28939s<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        public C28939s() {
        }

        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            boolean booleanValue = ((Boolean) t2).booleanValue();
            if (((Boolean) t1).booleanValue() && (!booleanValue || !C49497ts3.this.mo10332n())) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$s0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28940s0 extends AdaptedFunctionReference implements Function1<User, AbstractC24507p<AgreementRole>> {
        public C28940s0(Object obj) {
            super(1, obj, InterfaceC44637lg6.class, "maybeShouldShowAgreementRoleAs", "maybeShouldShowAgreementRoleAs(Lco/bird/android/model/User;Ljava/lang/String;)Lio/reactivex/Maybe;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final AbstractC24507p<AgreementRole> invoke(User p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return InterfaceC44637lg6.C25760a.maybeShouldShowAgreementRoleAs$default((InterfaceC44637lg6) this.receiver, p0, null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl\n*L\n1#1,304:1\n508#2,4:305\n*E\n"})
    /* renamed from: ts3$t */
    /* loaded from: classes2.dex */
    public static final class C28941t<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        public C28941t() {
        }

        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            boolean z2;
            boolean booleanValue = ((Boolean) t2).booleanValue();
            boolean z3 = true;
            if (((Boolean) t1).booleanValue() && !C49497ts3.this.mo10333m() && C49497ts3.this.mo10335k()) {
                z = true;
            } else {
                z = false;
            }
            if (booleanValue && !C49497ts3.this.mo10339d()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                z3 = false;
            }
            return (R) Boolean.valueOf(z3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/AgreementRole;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/AgreementRole;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$t0 */
    /* loaded from: classes2.dex */
    public static final class C28942t0 extends Lambda implements Function1<AgreementRole, Unit> {

        /* renamed from: g */
        public static final C28942t0 f111296g = new C28942t0();

        public C28942t0() {
            super(1);
        }

        /* renamed from: a */
        public final void m11281a(AgreementRole agreementRole) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AgreementRole agreementRole) {
            m11281a(agreementRole);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl\n*L\n1#1,304:1\n522#2:305\n*E\n"})
    /* renamed from: ts3$u */
    /* loaded from: classes2.dex */
    public static final class C28943u<T1, T2, T3, R> implements InterfaceC23485h<Unit, T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Unit unit, T1 t1, T2 t2) {
            return (R) TuplesKt.m28425to(C52473yt5.m2323c((List) t1), (LatLng) t2);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$u0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28944u0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28944u0 f111297b = new C28944u0();

        public C28944u0() {
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

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012:\u0010\u0004\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$10\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n819#2:892\n847#2,2:893\n*S KotlinDebug\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$onCreate$10\n*L\n229#1:892\n229#1:893,2\n*E\n"})
    /* renamed from: ts3$v */
    /* loaded from: classes2.dex */
    public static final class C28945v extends Lambda implements Function1<Pair<? extends List<? extends BirdMapMarker>, ? extends Set<String>>, List<? extends BirdMapMarker>> {

        /* renamed from: g */
        public static final C28945v f111298g = new C28945v();

        public C28945v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends BirdMapMarker> invoke(Pair<? extends List<? extends BirdMapMarker>, ? extends Set<String>> pair) {
            return invoke2((Pair<? extends List<BirdMapMarker>, ? extends Set<String>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<BirdMapMarker> invoke2(Pair<? extends List<BirdMapMarker>, ? extends Set<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<BirdMapMarker> birdMarkers = pair.component1();
            Set<String> component2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(birdMarkers, "birdMarkers");
            ArrayList arrayList = new ArrayList();
            for (Object obj : birdMarkers) {
                if (!component2.contains(((BirdMapMarker) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$v0 */
    /* loaded from: classes2.dex */
    public static final class C28946v0 extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C28946v0 f111299g = new C28946v0();

        public C28946v0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getOperatorConfig().getFeatures().getMap().getEnableServerDrivenFilters());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lyu3;", "tab", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lyu3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$w */
    /* loaded from: classes2.dex */
    public static final class C28947w extends Lambda implements Function1<EnumC52481yu3, Boolean> {
        public C28947w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC52481yu3 tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            return Boolean.valueOf(C49497ts3.this.m11365u1(tab));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "enabled", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$w0 */
    /* loaded from: classes2.dex */
    public static final class C28948w0 extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "filters", "", "Lco/bird/android/model/persistence/OperatorFilter;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ts3$w0$a */
        /* loaded from: classes2.dex */
        public static final class C28949a extends Lambda implements Function1<List<? extends OperatorFilter>, Boolean> {

            /* renamed from: g */
            public static final C28949a f111302g = new C28949a();

            public C28949a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<? extends OperatorFilter> filters) {
                Intrinsics.checkNotNullParameter(filters, "filters");
                return Boolean.valueOf(!filters.isEmpty());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ts3$w0$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C28950b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

            /* renamed from: b */
            public static final C28950b f111303b = new C28950b();

            public C28950b() {
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

        public C28948w0() {
            super(1);
        }

        /* renamed from: d */
        public static final Boolean m11276d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m11275e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Boolean> invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            if (enabled.booleanValue()) {
                AbstractC23442F m33042m = C49497ts3.this.f111193h.mo6183G().m33042m(InterfaceC46545ot5.C27099a.streamOperatorFilters$default(C49497ts3.this.f111193h, false, 1, null).firstOrError());
                final C28949a c28949a = C28949a.f111302g;
                AbstractC23442F m33157I = m33042m.m33157I(new InterfaceC23492o() { // from class: Fs3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Boolean m11276d;
                        m11276d = C49497ts3.C28948w0.m11276d(Function1.this, obj);
                        return m11276d;
                    }
                });
                final C28950b c28950b = C28950b.f111303b;
                return m33157I.m33106t(new InterfaceC23484g() { // from class: Gs3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C49497ts3.C28948w0.m11275e(Function1.this, obj);
                    }
                }).m33146T(3L).m33148R(Boolean.FALSE);
            }
            return AbstractC23442F.m33158H(enabled);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$x */
    /* loaded from: classes2.dex */
    public static final class C28951x extends Lambda implements Function1<Pair<? extends List<? extends BirdMapMarker>, ? extends Boolean>, Boolean> {
        public C28951x() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends List<BirdMapMarker>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean validVehicleTab = pair.component2();
            Intrinsics.checkNotNullExpressionValue(validVehicleTab, "validVehicleTab");
            return Boolean.valueOf(validVehicleTab.booleanValue() && !C49497ts3.this.f111193h.mo6178e().getValue().m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends List<? extends BirdMapMarker>, ? extends Boolean> pair) {
            return invoke2((Pair<? extends List<BirdMapMarker>, Boolean>) pair);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$x0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28952x0 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C28952x0(Object obj) {
            super(1, obj, InterfaceC32282Cw3.class, "showFilter", "showFilter(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC32282Cw3) this.receiver).mo89306re(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/BirdMapMarker;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$y */
    /* loaded from: classes2.dex */
    public static final class C28953y extends Lambda implements Function1<Pair<? extends List<? extends BirdMapMarker>, ? extends Boolean>, Unit> {
        public C28953y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends BirdMapMarker>, ? extends Boolean> pair) {
            invoke2((Pair<? extends List<BirdMapMarker>, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<BirdMapMarker>, Boolean> pair) {
            List<BirdMapMarker> birdMarkers = pair.component1();
            InterfaceC34766Nm3 interfaceC34766Nm3 = C49497ts3.this.f111206u;
            Intrinsics.checkNotNullExpressionValue(birdMarkers, "birdMarkers");
            interfaceC34766Nm3.setBirdMarkers(birdMarkers);
            C49497ts3.this.m11450V2(birdMarkers);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$y0 */
    /* loaded from: classes2.dex */
    public static final class C28954y0 extends Lambda implements Function1<Throwable, Unit> {
        public C28954y0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49497ts3.this.f111207v.mo89306re(false);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$z */
    /* loaded from: classes2.dex */
    public static final class C28955z extends Lambda implements Function1<WireBird, Unit> {
        public C28955z() {
            super(1);
        }

        /* renamed from: a */
        public final void m11274a(WireBird wireBird) {
            C49497ts3.this.f111207v.mo147Be(EnumC52481yu3.VEHICLES);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m11274a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ts3$z0 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C28956z0 extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, AbstractC23442F<InterfaceC46545ot5.C27100b>> {
        public C28956z0(Object obj) {
            super(1, obj, InterfaceC46545ot5.class, "calculateFilterDiff", "calculateFilterDiff(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<InterfaceC46545ot5.C27100b> invoke(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC46545ot5) this.receiver).mo6182a(p0);
        }
    }

    static {
        Set<EnumC52481yu3> of;
        of = SetsKt__SetsKt.setOf((Object[]) new EnumC52481yu3[]{EnumC52481yu3.ALL, EnumC52481yu3.VEHICLES});
        f111179K = of;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49497ts3(InterfaceC44637lg6 agreementManager, InterfaceC10636aM birdManager, InterfaceC27246pJ bluetoothManager, InterfaceC44647lh6 userManager, C36207Tq4 reactiveConfig, InterfaceC46545ot5 serverDrivenFilterManager, InterfaceC30556yL birdFinderManager, C22454gl preference, InterfaceC49820uQ3 permissionDelegate, InterfaceC1880Ea analyticsManager, InterfaceC36161Tl3 operatorFiltersAnalyticsManager, InterfaceC40001dr4 locationManager, InterfaceC37857aG6 workOrderManager, InterfaceC48923su2 localAssetManager, InterfaceC46473om3 operatorManager, InterfaceC49310tZ5 taskOrderManager, DQ3 permissionManager, AndroidLifecycleScopeProvider mapScopeProvider, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC34766Nm3 mapUi, InterfaceC32282Cw3 ui, InterfaceC40099e13 navigator, Observable<Boolean> locationEnableChange, Observable<Boolean> bluetoothEnableChange, InterfaceC31776As1 flightSheetDelegate) {
        super(scopeProvider);
        List emptyList;
        Intrinsics.checkNotNullParameter(agreementManager, "agreementManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(birdFinderManager, "birdFinderManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(permissionDelegate, "permissionDelegate");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(operatorFiltersAnalyticsManager, "operatorFiltersAnalyticsManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(taskOrderManager, "taskOrderManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(mapScopeProvider, "mapScopeProvider");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(mapUi, "mapUi");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(locationEnableChange, "locationEnableChange");
        Intrinsics.checkNotNullParameter(bluetoothEnableChange, "bluetoothEnableChange");
        Intrinsics.checkNotNullParameter(flightSheetDelegate, "flightSheetDelegate");
        this.f111188c = agreementManager;
        this.f111189d = birdManager;
        this.f111190e = bluetoothManager;
        this.f111191f = userManager;
        this.f111192g = reactiveConfig;
        this.f111193h = serverDrivenFilterManager;
        this.f111194i = birdFinderManager;
        this.f111195j = preference;
        this.f111196k = permissionDelegate;
        this.f111197l = analyticsManager;
        this.f111198m = operatorFiltersAnalyticsManager;
        this.f111199n = locationManager;
        this.f111200o = workOrderManager;
        this.f111201p = localAssetManager;
        this.f111202q = operatorManager;
        this.f111203r = taskOrderManager;
        this.f111204s = permissionManager;
        this.f111205t = mapScopeProvider;
        this.f111206u = mapUi;
        this.f111207v = ui;
        this.f111208w = navigator;
        this.f111209x = locationEnableChange;
        this.f111210y = bluetoothEnableChange;
        this.f111211z = flightSheetDelegate;
        this.f111180A = serverDrivenFilterManager.mo6176g(true).share();
        Z84.C10119a c10119a = Z84.f47888d;
        AbstractC24490k<List<OperatorFilter>> flowable = serverDrivenFilterManager.mo6176g(true).toFlowable(EnumC23460b.LATEST);
        final C28931o c28931o = C28931o.f111288g;
        AbstractC24490k<R> m32117q0 = flowable.m32117q0(new InterfaceC23492o() { // from class: Yr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                OperatorMapFilterBundle m11519E1;
                m11519E1 = C49497ts3.m11519E1(Function1.this, obj);
                return m11519E1;
            }
        });
        final C28933p c28933p = new C28933p(operatorManager);
        Observable share = m32117q0.m32157b1(new InterfaceC23492o() { // from class: js3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m11515F1;
                m11515F1 = C49497ts3.m11515F1(Function1.this, obj);
                return m11515F1;
            }
        }).m32113r1().share();
        Intrinsics.checkNotNullExpressionValue(share, "serverDrivenFilterManage…servable()\n      .share()");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f111181B = c10119a.m73662c(share, emptyList);
        this.f111182C = C37791a94.C10586a.create$default(C37791a94.f49908h, new LinkedHashSet(), null, 2, null);
        C24552a<BirdMapMarker> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<BirdMapMarker>()");
        this.f111184E = m31922e;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f111186G = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f111187H = m25409g2;
    }

    /* renamed from: A1 */
    public static final void m11535A1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A2 */
    public static final void m11534A2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B1 */
    public static final InterfaceC23496h m11531B1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: B2 */
    public static final InterfaceC23496h m11530B2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: C1 */
    public static final void m11527C1() {
    }

    /* renamed from: C2 */
    public static final void m11526C2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D1 */
    public static final void m11523D1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D2 */
    public static final void m11522D2() {
    }

    /* renamed from: E1 */
    public static final OperatorMapFilterBundle m11519E1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OperatorMapFilterBundle) tmp0.invoke(obj);
    }

    /* renamed from: E2 */
    public static final void m11518E2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F1 */
    public static final InterfaceC45761na4 m11515F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: F2 */
    public static final Boolean m11514F2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: G2 */
    public static final void m11510G2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H1 */
    public static /* synthetic */ void m11507H1(C49497ts3 c49497ts3, BirdMapMarker birdMapMarker, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        c49497ts3.m11511G1(birdMapMarker, z, z2);
    }

    /* renamed from: H2 */
    public static final InterfaceC24574u m11506H2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: I2 */
    public static final void m11502I2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J1 */
    public static final List m11499J1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: J2 */
    public static final void m11498J2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K1 */
    public static final Boolean m11495K1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: L1 */
    public static final boolean m11491L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: L2 */
    public static final Boolean m11490L2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: M1 */
    public static final void m11487M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M2 */
    public static final InterfaceC23447K m11486M2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final void m11483N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N2 */
    public static final void m11482N2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O1 */
    public static final InterfaceC23447K m11479O1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O2 */
    public static final void m11478O2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P1 */
    public static final void m11475P1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P2 */
    public static final InterfaceC23447K m11474P2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q1 */
    public static final void m11471Q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q2 */
    public static final Integer m11470Q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: R1 */
    public static final Optional m11467R1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: R2 */
    public static final void m11466R2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S1 */
    public static final InterfaceC23496h m11463S1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: S2 */
    public static final void m11462S2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final void m11459T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U1 */
    public static final void m11455U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V1 */
    public static final void m11451V1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final void m11447W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X1 */
    public static final void m11443X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X2 */
    public static final void m11442X2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final void m11439Y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y2 */
    public static final void m11438Y2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z1 */
    public static final void m11435Z1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a2 */
    public static final InterfaceC23434B m11431a2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: a3 */
    public static final void m11430a3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b2 */
    public static final void m11427b2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b3 */
    public static final InterfaceC23496h m11426b3(C49497ts3 this$0, BirdMapMarker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(marker, "$marker");
        return this$0.f111203r.mo1108b(marker.getId(), marker.getCode());
    }

    /* renamed from: c2 */
    public static final void m11423c2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c3 */
    public static final InterfaceC23434B m11422c3(C49497ts3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f111203r.mo1107c();
    }

    /* renamed from: d2 */
    public static final boolean m11419d2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: d3 */
    public static final void m11418d3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e2 */
    public static final void m11415e2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f2 */
    public static final void m11411f2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f3 */
    public static final void m11410f3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g2 */
    public static final boolean m11407g2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: g3 */
    public static final void m11406g3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final void m11404h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h2 */
    public static final void m11403h2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final InterfaceC23496h m11401i1(C49497ts3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required bluetooth connect permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f111204s.m110485l(Permission.BLUETOOTH_CONNECT);
        final C28903d c28903d = C28903d.f111257g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: is3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11398j1(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: i2 */
    public static final void m11400i2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static final void m11398j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j2 */
    public static final void m11397j2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final InterfaceC23496h m11395k1(C49497ts3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("checking for required notification permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this$0.f111204s.m110485l(Permission.POST_NOTIFICATION);
        final C28905e c28905e = C28905e.f111259g;
        return m110485l.m33101w(new InterfaceC23484g() { // from class: os3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11392l1(Function1.this, obj);
            }
        }).m33159G();
    }

    /* renamed from: k2 */
    public static final void m11394k2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l1 */
    public static final void m11392l1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l2 */
    public static final void m11391l2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m1 */
    public static final void m11389m1(C49497ts3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean requireNotifications = this$0.f111192g.m82623f8().getValue().getOperatorConfig().getPermissions().getRequireNotifications();
        boolean requireCamera = this$0.f111192g.m82623f8().getValue().getOperatorConfig().getPermissions().getRequireCamera();
        if ((requireNotifications && !this$0.mo10339d()) || ((requireCamera && !this$0.mo10333m() && this$0.mo10335k()) || !this$0.mo10335k())) {
            this$0.f111207v.mo89320ik();
        }
    }

    /* renamed from: m2 */
    public static final void m11388m2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m11386n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n2 */
    public static final Boolean m11385n2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: o1 */
    public static final boolean m11383o1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o2 */
    public static final Boolean m11382o2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: p1 */
    public static final InterfaceC23496h m11380p1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: p2 */
    public static final void m11379p2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q2 */
    public static final void m11376q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r2 */
    public static final OperatorMapFilterBundle m11373r2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OperatorMapFilterBundle) tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final void m11371s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s2 */
    public static final void m11370s2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t2 */
    public static final void m11367t2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u2 */
    public static final void m11364u2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v2 */
    public static final void m11361v2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w1 */
    public static final void m11359w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w2 */
    public static final InterfaceC23447K m11358w2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final void m11355x1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x2 */
    public static final InterfaceC23496h m11354x2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y2 */
    public static final void m11350y2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z2 */
    public static final void m11346z2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G1 */
    public final void m11511G1(BirdMapMarker birdMapMarker, boolean z, boolean z2) {
        m11362v1(birdMapMarker, z);
        this.f111207v.mo89344Wb();
        this.f111207v.mo89343Wi(false);
        this.f111184E.onNext(birdMapMarker);
        if (z2) {
            this.f111206u.zoomToMaxLevel(birdMapMarker);
        }
        this.f111197l.mo55905y(new C52401ym3(null, null, null, new C51808xm3(birdMapMarker.getId(), birdMapMarker.getCode(), birdMapMarker.getBatteryLevel(), "", "", BirdBadgeType.UNKNOWN.name()), 7, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0169  */
    /* renamed from: I1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m11503I1(List<? extends Point> list) {
        Enum r10;
        Unit unit;
        Object[] enumConstants;
        int i;
        boolean equals;
        ServiceCenterConfig serviceCenterConfig;
        this.f111195j.m37548z(MapMode.OPERATOR);
        if (list != null) {
            C41318g46.m40163a("Zooming to region including points: " + list, new Object[0]);
            if (list.size() == 1) {
                MapUi.DefaultImpls.zoomTo$default(this.f111206u, C37429Yw2.f47648a.m73962i(GoogleMap_Kt.toLatLng(list.get(0))), null, 2, null);
            } else {
                this.f111206u.zoomTo(list);
            }
        } else {
            AbstractC23442F<Location> m33152N = this.f111199n.mo43627e(true).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "locationManager.requestL…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C28871F c28871f = new C28871F();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: rs3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49497ts3.m11459T1(Function1.this, obj);
                }
            });
        }
        this.f111197l.mo55905y(new C35192Ph6(null, null, null, this.f111195j.m37575s0().getUserRoleCode(), this.f111195j.m37591o0().getUserRoleCode(), 7, null));
        Observable<EnumC52481yu3> observeOn = this.f111207v.mo145s2().observeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.tabSelected()\n      .observeOn(Schedulers.io())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28887Q c28887q = new C28887Q();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Uq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11415e2(Function1.this, obj);
            }
        });
        String m37574s1 = this.f111195j.m37574s1();
        if (m37574s1 != null) {
            try {
                enumConstants = EnumC52481yu3.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
            } catch (Exception unused) {
                Object[] enumConstants2 = EnumC52481yu3.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj : enumConstants2) {
                    r10 = (Enum) obj;
                    if (Intrinsics.areEqual(r10.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            for (Object obj2 : enumConstants) {
                equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), m37574s1, true);
                if (equals) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                    r10 = (Enum) obj2;
                    EnumC52481yu3 enumC52481yu3 = (EnumC52481yu3) r10;
                    if (enumC52481yu3 != null) {
                        C41318g46.m40153k("OperatorTab").mo7228a("Restoring tab: " + enumC52481yu3, new Object[0]);
                        this.f111207v.mo147Be(enumC52481yu3);
                        unit = Unit.INSTANCE;
                        if (unit == null) {
                            this.f111207v.mo147Be(EnumC52481yu3.ALL);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        m11408g1();
                        Observable<User> m33123k0 = this.f111191f.getUser().m33123k0();
                        final C28940s0 c28940s0 = new C28940s0(this.f111188c);
                        Observable<R> flatMapMaybe = m33123k0.flatMapMaybe(new InterfaceC23492o() { // from class: hr3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                InterfaceC24574u m11506H2;
                                m11506H2 = C49497ts3.m11506H2(Function1.this, obj3);
                                return m11506H2;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "userManager.getUser().to…houldShowAgreementRoleAs)");
                        Object m33094as2 = flatMapMaybe.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28942t0 c28942t0 = C28942t0.f111296g;
                        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: tr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11502I2(Function1.this, obj3);
                            }
                        };
                        final C28944u0 c28944u0 = C28944u0.f111297b;
                        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Fr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11498J2(Function1.this, obj3);
                            }
                        });
                        C40463ee3 c40463ee3 = C40463ee3.f78649a;
                        Observable combineLatest = Observable.combineLatest(this.f111181B, this.f111182C, C28935q.f111291a);
                        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
                        final C28945v c28945v = C28945v.f111298g;
                        Observable map = combineLatest.map(new InterfaceC23492o() { // from class: Jr3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                List m11499J1;
                                m11499J1 = C49497ts3.m11499J1(Function1.this, obj3);
                                return m11499J1;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates… doNotShowBirds }\n      }");
                        Observable<EnumC52481yu3> mo145s2 = this.f111207v.mo145s2();
                        final C28947w c28947w = new C28947w();
                        InterfaceC23434B map2 = mo145s2.map(new InterfaceC23492o() { // from class: Kr3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                Boolean m11495K1;
                                m11495K1 = C49497ts3.m11495K1(Function1.this, obj3);
                                return m11495K1;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map2, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Observable m31950a = C24527f.m31950a(map, map2);
                        final C28951x c28951x = new C28951x();
                        Observable distinctUntilChanged = m31950a.filter(new InterfaceC23494q() { // from class: Lr3
                            @Override // io.reactivex.functions.InterfaceC23494q
                            public final boolean test(Object obj3) {
                                boolean m11491L1;
                                m11491L1 = C49497ts3.m11491L1(Function1.this, obj3);
                                return m11491L1;
                            }
                        }).observeOn(C23454a.m33087a()).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33094as3 = distinctUntilChanged.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28953y c28953y = new C28953y();
                        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Mr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11487M1(Function1.this, obj3);
                            }
                        });
                        Observable observeOn2 = C37279Yf5.m74576S(this.f111202q.mo8127V0()).observeOn(C23454a.m33087a());
                        final C28955z c28955z = new C28955z();
                        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: Or3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11483N1(Function1.this, obj3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Observable m31950a2 = C24527f.m31950a(doOnNext, this.f111181B);
                        final C28852A c28852a = new C28852A();
                        Observable observeOn3 = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: ss3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                InterfaceC23447K m11479O1;
                                m11479O1 = C49497ts3.m11479O1(Function1.this, obj3);
                                return m11479O1;
                            }
                        }).observeOn(C23454a.m33087a());
                        final C28856B c28856b = new C28856B();
                        Observable doOnNext2 = observeOn3.doOnNext(new InterfaceC23484g() { // from class: Lq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11475P1(Function1.this, obj3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33094as4 = C37279Yf5.m74576S(doOnNext2).m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28858C c28858c = new C28858C();
                        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Mq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11471Q1(Function1.this, obj3);
                            }
                        });
                        m11374r1();
                        Observable<Unit> mo89299xg = this.f111207v.mo89299xg();
                        final C28860D c28860d = new C28860D();
                        Observable<R> map3 = mo89299xg.map(new InterfaceC23492o() { // from class: Nq3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                Optional m11467R1;
                                m11467R1 = C49497ts3.m11467R1(Function1.this, obj3);
                                return m11467R1;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map3, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Observable observeOn4 = C37279Yf5.m74576S(map3).observeOn(C23454a.m33087a());
                        final C28862E c28862e = new C28862E();
                        AbstractC23461c flatMapCompletable = observeOn4.flatMapCompletable(new InterfaceC23492o() { // from class: Oq3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                InterfaceC23496h m11463S1;
                                m11463S1 = C49497ts3.m11463S1(Function1.this, obj3);
                                return m11463S1;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                        ((CompletableSubscribeProxy) m33041n).subscribe();
                        Observable observeOn5 = C24527f.m31950a(this.f111207v.mo89354P6(), this.f111206u.birdMarkerClicks()).observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.directionsButtonClick…dSchedulers.mainThread())");
                        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28873G c28873g = new C28873G();
                        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Pq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11455U1(Function1.this, obj3);
                            }
                        };
                        final C28875H c28875h = C28875H.f111234b;
                        ((ObservableSubscribeProxy) m33094as5).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Qq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11451V1(Function1.this, obj3);
                            }
                        });
                        Observable<Pair<BirdMapMarker, Boolean>> observeOn6 = this.f111206u.birdMarkerClicks().observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn6, "mapUi.birdMarkerClicks()…dSchedulers.mainThread())");
                        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28877I c28877i = new C28877I();
                        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: Rq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11447W1(Function1.this, obj3);
                            }
                        });
                        Observable<BirdMapMarker> observeOn7 = this.f111206u.birdMarkerInfoItemClicks().observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn7, "mapUi.birdMarkerInfoItem…dSchedulers.mainThread())");
                        Object m33094as7 = observeOn7.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28879J c28879j = new C28879J();
                        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: Sq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11443X1(Function1.this, obj3);
                            }
                        });
                        Observable<WireBird> observeOn8 = this.f111211z.mo23172f().observeOn(C23454a.m33087a());
                        final C28881K c28881k = new C28881K(this);
                        Observable<WireBird> doOnNext3 = observeOn8.doOnNext(new InterfaceC23484g() { // from class: Tq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11439Y1(Function1.this, obj3);
                            }
                        });
                        final C28882L c28882l = new C28882L(this.f111207v);
                        Observable<WireBird> retry = doOnNext3.doOnError(new InterfaceC23484g() { // from class: Wq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11435Z1(Function1.this, obj3);
                            }
                        }).retry();
                        Intrinsics.checkNotNullExpressionValue(retry, "flightSheetDelegate.bird…playError)\n      .retry()");
                        Object m33094as8 = retry.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
                        ((ObservableSubscribeProxy) m33094as8).subscribe();
                        Observable<BirdMapMarker> observeOn9 = this.f111184E.observeOn(C23454a.m33087a());
                        final C28883M c28883m = new C28883M(this);
                        Observable<R> flatMap = observeOn9.flatMap(new InterfaceC23492o() { // from class: Xq3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                InterfaceC23434B m11431a2;
                                m11431a2 = C49497ts3.m11431a2(Function1.this, obj3);
                                return m11431a2;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(flatMap, "flightSheetBirdMarkerSub…latMap(::showFlightSheet)");
                        Object m33094as9 = flatMap.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28884N c28884n = C28884N.f111240g;
                        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: Yq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11427b2(Function1.this, obj3);
                            }
                        };
                        final C28885O c28885o = new C28885O();
                        ((ObservableSubscribeProxy) m33094as9).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: Zq3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11423c2(Function1.this, obj3);
                            }
                        });
                        Observable m31950a3 = C24527f.m31950a(this.f111206u.mapClicks(), this.f111207v.mo89305rg(OperatorMapBottomSheet.EnumC14592a.FLIGHT_SHEET));
                        final C28886P c28886p = C28886P.f111242g;
                        Observable observeOn10 = m31950a3.filter(new InterfaceC23494q() { // from class: ar3
                            @Override // io.reactivex.functions.InterfaceC23494q
                            public final boolean test(Object obj3) {
                                boolean m11419d2;
                                m11419d2 = C49497ts3.m11419d2(Function1.this, obj3);
                                return m11419d2;
                            }
                        }).observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn10, "mapUi.mapClicks()\n      …dSchedulers.mainThread())");
                        Object m33094as10 = observeOn10.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28888R c28888r = new C28888R();
                        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: br3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11411f2(Function1.this, obj3);
                            }
                        });
                        Observable<LatLng> throttleLast = this.f111206u.centerLocationChanged().throttleLast(2L, TimeUnit.SECONDS);
                        Intrinsics.checkNotNullExpressionValue(throttleLast, "mapUi.centerLocationChan…Last(2, TimeUnit.SECONDS)");
                        Observable m31950a4 = C24527f.m31950a(throttleLast, this.f111207v.mo145s2());
                        final C28889S c28889s = new C28889S();
                        Observable observeOn11 = m31950a4.filter(new InterfaceC23494q() { // from class: cr3
                            @Override // io.reactivex.functions.InterfaceC23494q
                            public final boolean test(Object obj3) {
                                boolean m11407g2;
                                m11407g2 = C49497ts3.m11407g2(Function1.this, obj3);
                                return m11407g2;
                            }
                        }).observeOn(C23454a.m33087a());
                        final C28890T c28890t = new C28890T();
                        Observable doOnNext4 = observeOn11.doOnNext(new InterfaceC23484g() { // from class: dr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11403h2(Function1.this, obj3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(doOnNext4, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33094as11 = doOnNext4.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as11, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28891U c28891u = C28891U.f111247g;
                        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: er3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11400i2(Function1.this, obj3);
                            }
                        };
                        final C28892V c28892v = C28892V.f111248b;
                        ((ObservableSubscribeProxy) m33094as11).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: fr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11397j2(Function1.this, obj3);
                            }
                        });
                        Observable<Unit> mo89330e1 = this.f111207v.mo89330e1();
                        final C28893W c28893w = new C28893W();
                        Observable<Unit> doOnNext5 = mo89330e1.doOnNext(new InterfaceC23484g() { // from class: ir3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11394k2(Function1.this, obj3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(doOnNext5, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33094as12 = doOnNext5.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as12, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28894X c28894x = new C28894X();
                        InterfaceC23484g interfaceC23484g5 = new InterfaceC23484g() { // from class: jr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11391l2(Function1.this, obj3);
                            }
                        };
                        final C28895Y c28895y = C28895Y.f111251g;
                        ((ObservableSubscribeProxy) m33094as12).subscribe(interfaceC23484g5, new InterfaceC23484g() { // from class: kr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11388m2(Function1.this, obj3);
                            }
                        });
                        C24523e c24523e = C24523e.f91168a;
                        Z84<Optional<List<OperatorFilter>>> mo6178e = this.f111193h.mo6178e();
                        final C28896Z c28896z = C28896Z.f111252g;
                        Object map4 = mo6178e.map(new InterfaceC23492o() { // from class: lr3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                Boolean m11385n2;
                                m11385n2 = C49497ts3.m11385n2(Function1.this, obj3);
                                return m11385n2;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map4, "serverDrivenFilterManage…riddenFilters.isPresent }");
                        Observable<EnumC52481yu3> mo145s22 = this.f111207v.mo145s2();
                        final C28898a0 c28898a0 = new C28898a0();
                        Object map5 = mo145s22.map(new InterfaceC23492o() { // from class: mr3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                Boolean m11382o2;
                                m11382o2 = C49497ts3.m11382o2(Function1.this, obj3);
                                return m11382o2;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map5, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Observable distinctUntilChanged2 = c24523e.m31956a(map4, map5).distinctUntilChanged();
                        final C28900b0 c28900b0 = new C28900b0();
                        Observable observeOn12 = distinctUntilChanged2.doOnNext(new InterfaceC23484g() { // from class: nr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11379p2(Function1.this, obj3);
                            }
                        }).observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn12, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33094as13 = observeOn12.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as13, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28902c0 c28902c0 = new C28902c0();
                        ((ObservableSubscribeProxy) m33094as13).subscribe(new InterfaceC23484g() { // from class: or3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11376q2(Function1.this, obj3);
                            }
                        });
                        Observable<List<OperatorFilter>> observable = this.f111180A;
                        final C28904d0 c28904d0 = C28904d0.f111258b;
                        Observable delay = observable.map(new InterfaceC23492o() { // from class: pr3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                OperatorMapFilterBundle m11373r2;
                                m11373r2 = C49497ts3.m11373r2(Function1.this, obj3);
                                return m11373r2;
                            }
                        }).distinctUntilChanged().delay(100L, TimeUnit.MILLISECONDS);
                        final C28906e0 c28906e0 = new C28906e0();
                        Observable doOnNext6 = delay.doOnNext(new InterfaceC23484g() { // from class: qr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11370s2(Function1.this, obj3);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(doOnNext6, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33094as14 = doOnNext6.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as14, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28908f0 c28908f0 = C28908f0.f111262g;
                        InterfaceC23484g interfaceC23484g6 = new InterfaceC23484g() { // from class: sr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11367t2(Function1.this, obj3);
                            }
                        };
                        final C28910g0 c28910g0 = C28910g0.f111264b;
                        ((ObservableSubscribeProxy) m33094as14).subscribe(interfaceC23484g6, new InterfaceC23484g() { // from class: ur3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11364u2(Function1.this, obj3);
                            }
                        });
                        Observable<DX3> observeOn13 = this.f111206u.reactiveMapEvent().polygonClicks().observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn13, "mapUi.reactiveMapEvent()…dSchedulers.mainThread())");
                        Object m33094as15 = observeOn13.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as15, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28912h0 c28912h0 = new C28912h0();
                        ((ObservableSubscribeProxy) m33094as15).subscribe(new InterfaceC23484g() { // from class: vr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11361v2(Function1.this, obj3);
                            }
                        });
                        serviceCenterConfig = this.f111192g.m82623f8().getValue().getServiceCenterConfig();
                        if (serviceCenterConfig.getEnableServiceCenterApp() && serviceCenterConfig.getDownloadAssets()) {
                            AbstractC23442F<DateTime> mo13528g = this.f111201p.mo13528g(AssetManagerType.REPAIR);
                            final C28914i0 c28914i0 = new C28914i0(this.f111200o);
                            AbstractC23442F<R> m33165A = mo13528g.m33165A(new InterfaceC23492o() { // from class: wr3
                                @Override // io.reactivex.functions.InterfaceC23492o
                                public final Object apply(Object obj3) {
                                    InterfaceC23447K m11358w2;
                                    m11358w2 = C49497ts3.m11358w2(Function1.this, obj3);
                                    return m11358w2;
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(m33165A, "localAssetManager.update…anager::getAssetManifest)");
                            AbstractC23442F m70883l = C38096ag5.m70883l(m33165A);
                            final C28916j0 c28916j0 = new C28916j0();
                            AbstractC23461c m33164B = m70883l.m33164B(new InterfaceC23492o() { // from class: xr3
                                @Override // io.reactivex.functions.InterfaceC23492o
                                public final Object apply(Object obj3) {
                                    InterfaceC23496h m11354x2;
                                    m11354x2 = C49497ts3.m11354x2(Function1.this, obj3);
                                    return m11354x2;
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(m33164B, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                            Object m33041n2 = m33164B.m33041n(AutoDispose.m45239a(m5717t()));
                            Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                            ((CompletableSubscribeProxy) m33041n2).subscribe();
                        }
                        Observable combineLatest2 = Observable.combineLatest(this.f111192g.m82669b6(), this.f111210y, new C28937r());
                        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Observable.combineLatest…ombineFunction(t1, t2) })");
                        Observable observeOn14 = combineLatest2.observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn14, "Observables.combineLates…dSchedulers.mainThread())");
                        Object m33094as16 = observeOn14.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as16, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28918k0 c28918k0 = new C28918k0();
                        ((ObservableSubscribeProxy) m33094as16).subscribe(new InterfaceC23484g() { // from class: yr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11350y2(Function1.this, obj3);
                            }
                        });
                        Observable combineLatest3 = Observable.combineLatest(this.f111192g.m82625f6(), this.f111209x, new C28939s());
                        Intrinsics.checkExpressionValueIsNotNull(combineLatest3, "Observable.combineLatest…ombineFunction(t1, t2) })");
                        Observable observeOn15 = combineLatest3.observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn15, "Observables.combineLates…dSchedulers.mainThread())");
                        Object m33094as17 = observeOn15.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as17, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28920l0 c28920l0 = new C28920l0();
                        ((ObservableSubscribeProxy) m33094as17).subscribe(new InterfaceC23484g() { // from class: zr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11346z2(Function1.this, obj3);
                            }
                        });
                        Observable combineLatest4 = Observable.combineLatest(this.f111192g.m82647d6(), this.f111192g.m82603h6(), new C28941t());
                        Intrinsics.checkExpressionValueIsNotNull(combineLatest4, "Observable.combineLatest…ombineFunction(t1, t2) })");
                        Observable observeOn16 = combineLatest4.observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn16, "Observables.combineLates…dSchedulers.mainThread())");
                        Object m33094as18 = observeOn16.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as18, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28928m0 c28928m0 = new C28928m0();
                        ((ObservableSubscribeProxy) m33094as18).subscribe(new InterfaceC23484g() { // from class: Ar3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11534A2(Function1.this, obj3);
                            }
                        });
                        C45168ma4<Unit> c45168ma4 = this.f111186G;
                        Observable<List<OperatorFilter>> operatorFiltersStream = this.f111180A;
                        Intrinsics.checkNotNullExpressionValue(operatorFiltersStream, "operatorFiltersStream");
                        Observable<R> withLatestFrom = c45168ma4.withLatestFrom(operatorFiltersStream, this.f111206u.centerLocationChanged(), new C28943u());
                        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
                        Observable observeOn17 = withLatestFrom.observeOn(C23454a.m33087a());
                        final C28930n0 c28930n0 = new C28930n0();
                        AbstractC23461c m33070P = observeOn17.flatMapCompletable(new InterfaceC23492o() { // from class: Br3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                InterfaceC23496h m11530B2;
                                m11530B2 = C49497ts3.m11530B2(Function1.this, obj3);
                                return m11530B2;
                            }
                        }).m33070P(C23454a.m33087a());
                        final C28932o0 c28932o0 = new C28932o0();
                        AbstractC23461c m33066T = m33070P.m33084B(new InterfaceC23484g() { // from class: Dr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11526C2(Function1.this, obj3);
                            }
                        }).m33066T();
                        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
                        Object m33041n3 = m33066T.m33041n(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Er3
                            @Override // io.reactivex.functions.InterfaceC23478a
                            public final void run() {
                                C49497ts3.m11522D2();
                            }
                        };
                        final C28934p0 c28934p0 = C28934p0.f111290b;
                        ((CompletableSubscribeProxy) m33041n3).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Gr3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11518E2(Function1.this, obj3);
                            }
                        });
                        Z84<Config> m82623f8 = this.f111192g.m82623f8();
                        final C28936q0 c28936q0 = C28936q0.f111292g;
                        Observable observeOn18 = m82623f8.map(new InterfaceC23492o() { // from class: Hr3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj3) {
                                Boolean m11514F2;
                                m11514F2 = C49497ts3.m11514F2(Function1.this, obj3);
                                return m11514F2;
                            }
                        }).distinctUntilChanged().observeOn(C23454a.m33087a());
                        Intrinsics.checkNotNullExpressionValue(observeOn18, "reactiveConfig.config.ma…dSchedulers.mainThread())");
                        Object m33094as19 = observeOn18.m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as19, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C28938r0 c28938r0 = new C28938r0();
                        ((ObservableSubscribeProxy) m33094as19).subscribe(new InterfaceC23484g() { // from class: Ir3
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj3) {
                                C49497ts3.m11510G2(Function1.this, obj3);
                            }
                        });
                        Object m33094as20 = this.f111211z.mo23177a().m33094as(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as20, "this.`as`(AutoDispose.autoDisposable(provider))");
                        ((ObservableSubscribeProxy) m33094as20).subscribe(this.f111186G);
                    }
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        unit = null;
        if (unit == null) {
        }
        m11408g1();
        Observable<User> m33123k02 = this.f111191f.getUser().m33123k0();
        final Function1 c28940s02 = new C28940s0(this.f111188c);
        Observable<R> flatMapMaybe2 = m33123k02.flatMapMaybe(new InterfaceC23492o() { // from class: hr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                InterfaceC24574u m11506H2;
                m11506H2 = C49497ts3.m11506H2(Function1.this, obj3);
                return m11506H2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe2, "userManager.getUser().to…houldShowAgreementRoleAs)");
        Object m33094as22 = flatMapMaybe2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as22, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28942t02 = C28942t0.f111296g;
        InterfaceC23484g interfaceC23484g7 = new InterfaceC23484g() { // from class: tr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11502I2(Function1.this, obj3);
            }
        };
        final Function1 c28944u02 = C28944u0.f111297b;
        ((ObservableSubscribeProxy) m33094as22).subscribe(interfaceC23484g7, new InterfaceC23484g() { // from class: Fr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11498J2(Function1.this, obj3);
            }
        });
        C40463ee3 c40463ee32 = C40463ee3.f78649a;
        Observable combineLatest5 = Observable.combineLatest(this.f111181B, this.f111182C, C28935q.f111291a);
        Intrinsics.checkNotNullExpressionValue(combineLatest5, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final Function1 c28945v2 = C28945v.f111298g;
        Observable map6 = combineLatest5.map(new InterfaceC23492o() { // from class: Jr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                List m11499J1;
                m11499J1 = C49497ts3.m11499J1(Function1.this, obj3);
                return m11499J1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "Observables.combineLates… doNotShowBirds }\n      }");
        Observable<EnumC52481yu3> mo145s23 = this.f111207v.mo145s2();
        final Function1 c28947w2 = new C28947w();
        InterfaceC23434B map22 = mo145s23.map(new InterfaceC23492o() { // from class: Kr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                Boolean m11495K1;
                m11495K1 = C49497ts3.m11495K1(Function1.this, obj3);
                return m11495K1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map22, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Observable m31950a5 = C24527f.m31950a(map6, map22);
        final Function1 c28951x2 = new C28951x();
        Observable distinctUntilChanged3 = m31950a5.filter(new InterfaceC23494q() { // from class: Lr3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj3) {
                boolean m11491L1;
                m11491L1 = C49497ts3.m11491L1(Function1.this, obj3);
                return m11491L1;
            }
        }).observeOn(C23454a.m33087a()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33094as32 = distinctUntilChanged3.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as32, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28953y2 = new C28953y();
        ((ObservableSubscribeProxy) m33094as32).subscribe(new InterfaceC23484g() { // from class: Mr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11487M1(Function1.this, obj3);
            }
        });
        Observable observeOn22 = C37279Yf5.m74576S(this.f111202q.mo8127V0()).observeOn(C23454a.m33087a());
        final Function1 c28955z2 = new C28955z();
        Observable doOnNext7 = observeOn22.doOnNext(new InterfaceC23484g() { // from class: Or3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11483N1(Function1.this, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext7, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Observable m31950a22 = C24527f.m31950a(doOnNext7, this.f111181B);
        final Function1 c28852a2 = new C28852A();
        Observable observeOn32 = m31950a22.flatMapSingle(new InterfaceC23492o() { // from class: ss3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                InterfaceC23447K m11479O1;
                m11479O1 = C49497ts3.m11479O1(Function1.this, obj3);
                return m11479O1;
            }
        }).observeOn(C23454a.m33087a());
        final Function1 c28856b2 = new C28856B();
        Observable doOnNext22 = observeOn32.doOnNext(new InterfaceC23484g() { // from class: Lq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11475P1(Function1.this, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext22, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33094as42 = C37279Yf5.m74576S(doOnNext22).m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as42, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28858c2 = new C28858C();
        ((ObservableSubscribeProxy) m33094as42).subscribe(new InterfaceC23484g() { // from class: Mq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11471Q1(Function1.this, obj3);
            }
        });
        m11374r1();
        Observable<Unit> mo89299xg2 = this.f111207v.mo89299xg();
        final Function1 c28860d2 = new C28860D();
        Observable<R> map32 = mo89299xg2.map(new InterfaceC23492o() { // from class: Nq3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                Optional m11467R1;
                m11467R1 = C49497ts3.m11467R1(Function1.this, obj3);
                return m11467R1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map32, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Observable observeOn42 = C37279Yf5.m74576S(map32).observeOn(C23454a.m33087a());
        final Function1 c28862e2 = new C28862E();
        AbstractC23461c flatMapCompletable2 = observeOn42.flatMapCompletable(new InterfaceC23492o() { // from class: Oq3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                InterfaceC23496h m11463S1;
                m11463S1 = C49497ts3.m11463S1(Function1.this, obj3);
                return m11463S1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33041n4 = flatMapCompletable2.m33041n(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n4).subscribe();
        Observable observeOn52 = C24527f.m31950a(this.f111207v.mo89354P6(), this.f111206u.birdMarkerClicks()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn52, "ui.directionsButtonClick…dSchedulers.mainThread())");
        Object m33094as52 = observeOn52.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as52, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28873g2 = new C28873G();
        InterfaceC23484g interfaceC23484g22 = new InterfaceC23484g() { // from class: Pq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11455U1(Function1.this, obj3);
            }
        };
        final Function1 c28875h2 = C28875H.f111234b;
        ((ObservableSubscribeProxy) m33094as52).subscribe(interfaceC23484g22, new InterfaceC23484g() { // from class: Qq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11451V1(Function1.this, obj3);
            }
        });
        Observable<Pair<BirdMapMarker, Boolean>> observeOn62 = this.f111206u.birdMarkerClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn62, "mapUi.birdMarkerClicks()…dSchedulers.mainThread())");
        Object m33094as62 = observeOn62.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as62, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28877i2 = new C28877I();
        ((ObservableSubscribeProxy) m33094as62).subscribe(new InterfaceC23484g() { // from class: Rq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11447W1(Function1.this, obj3);
            }
        });
        Observable<BirdMapMarker> observeOn72 = this.f111206u.birdMarkerInfoItemClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn72, "mapUi.birdMarkerInfoItem…dSchedulers.mainThread())");
        Object m33094as72 = observeOn72.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as72, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28879j2 = new C28879J();
        ((ObservableSubscribeProxy) m33094as72).subscribe(new InterfaceC23484g() { // from class: Sq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11443X1(Function1.this, obj3);
            }
        });
        Observable<WireBird> observeOn82 = this.f111211z.mo23172f().observeOn(C23454a.m33087a());
        final Function1 c28881k2 = new C28881K(this);
        Observable<WireBird> doOnNext32 = observeOn82.doOnNext(new InterfaceC23484g() { // from class: Tq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11439Y1(Function1.this, obj3);
            }
        });
        final Function1 c28882l2 = new C28882L(this.f111207v);
        Observable<WireBird> retry2 = doOnNext32.doOnError(new InterfaceC23484g() { // from class: Wq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11435Z1(Function1.this, obj3);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "flightSheetDelegate.bird…playError)\n      .retry()");
        Object m33094as82 = retry2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as82, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as82).subscribe();
        Observable<BirdMapMarker> observeOn92 = this.f111184E.observeOn(C23454a.m33087a());
        final Function1 c28883m2 = new C28883M(this);
        Observable<R> flatMap2 = observeOn92.flatMap(new InterfaceC23492o() { // from class: Xq3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                InterfaceC23434B m11431a2;
                m11431a2 = C49497ts3.m11431a2(Function1.this, obj3);
                return m11431a2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap2, "flightSheetBirdMarkerSub…latMap(::showFlightSheet)");
        Object m33094as92 = flatMap2.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as92, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28884n2 = C28884N.f111240g;
        InterfaceC23484g interfaceC23484g32 = new InterfaceC23484g() { // from class: Yq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11427b2(Function1.this, obj3);
            }
        };
        final Function1 c28885o2 = new C28885O();
        ((ObservableSubscribeProxy) m33094as92).subscribe(interfaceC23484g32, new InterfaceC23484g() { // from class: Zq3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11423c2(Function1.this, obj3);
            }
        });
        Observable m31950a32 = C24527f.m31950a(this.f111206u.mapClicks(), this.f111207v.mo89305rg(OperatorMapBottomSheet.EnumC14592a.FLIGHT_SHEET));
        final Function1 c28886p2 = C28886P.f111242g;
        Observable observeOn102 = m31950a32.filter(new InterfaceC23494q() { // from class: ar3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj3) {
                boolean m11419d2;
                m11419d2 = C49497ts3.m11419d2(Function1.this, obj3);
                return m11419d2;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn102, "mapUi.mapClicks()\n      …dSchedulers.mainThread())");
        Object m33094as102 = observeOn102.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as102, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28888r2 = new C28888R();
        ((ObservableSubscribeProxy) m33094as102).subscribe(new InterfaceC23484g() { // from class: br3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11411f2(Function1.this, obj3);
            }
        });
        Observable<LatLng> throttleLast2 = this.f111206u.centerLocationChanged().throttleLast(2L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleLast2, "mapUi.centerLocationChan…Last(2, TimeUnit.SECONDS)");
        Observable m31950a42 = C24527f.m31950a(throttleLast2, this.f111207v.mo145s2());
        final Function1 c28889s2 = new C28889S();
        Observable observeOn112 = m31950a42.filter(new InterfaceC23494q() { // from class: cr3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj3) {
                boolean m11407g2;
                m11407g2 = C49497ts3.m11407g2(Function1.this, obj3);
                return m11407g2;
            }
        }).observeOn(C23454a.m33087a());
        final Function1 c28890t2 = new C28890T();
        Observable doOnNext42 = observeOn112.doOnNext(new InterfaceC23484g() { // from class: dr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11403h2(Function1.this, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext42, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33094as112 = doOnNext42.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as112, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28891u2 = C28891U.f111247g;
        InterfaceC23484g interfaceC23484g42 = new InterfaceC23484g() { // from class: er3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11400i2(Function1.this, obj3);
            }
        };
        final Function1 c28892v2 = C28892V.f111248b;
        ((ObservableSubscribeProxy) m33094as112).subscribe(interfaceC23484g42, new InterfaceC23484g() { // from class: fr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11397j2(Function1.this, obj3);
            }
        });
        Observable<Unit> mo89330e12 = this.f111207v.mo89330e1();
        final Function1 c28893w2 = new C28893W();
        Observable<Unit> doOnNext52 = mo89330e12.doOnNext(new InterfaceC23484g() { // from class: ir3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11394k2(Function1.this, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext52, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33094as122 = doOnNext52.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as122, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28894x2 = new C28894X();
        InterfaceC23484g interfaceC23484g52 = new InterfaceC23484g() { // from class: jr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11391l2(Function1.this, obj3);
            }
        };
        final Function1 c28895y2 = C28895Y.f111251g;
        ((ObservableSubscribeProxy) m33094as122).subscribe(interfaceC23484g52, new InterfaceC23484g() { // from class: kr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11388m2(Function1.this, obj3);
            }
        });
        C24523e c24523e2 = C24523e.f91168a;
        Z84<Optional<List<OperatorFilter>>> mo6178e2 = this.f111193h.mo6178e();
        final Function1 c28896z2 = C28896Z.f111252g;
        Object map42 = mo6178e2.map(new InterfaceC23492o() { // from class: lr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                Boolean m11385n2;
                m11385n2 = C49497ts3.m11385n2(Function1.this, obj3);
                return m11385n2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map42, "serverDrivenFilterManage…riddenFilters.isPresent }");
        Observable<EnumC52481yu3> mo145s222 = this.f111207v.mo145s2();
        final Function1 c28898a02 = new C28898a0();
        Object map52 = mo145s222.map(new InterfaceC23492o() { // from class: mr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                Boolean m11382o2;
                m11382o2 = C49497ts3.m11382o2(Function1.this, obj3);
                return m11382o2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map52, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Observable distinctUntilChanged22 = c24523e2.m31956a(map42, map52).distinctUntilChanged();
        final Function1 c28900b02 = new C28900b0();
        Observable observeOn122 = distinctUntilChanged22.doOnNext(new InterfaceC23484g() { // from class: nr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11379p2(Function1.this, obj3);
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn122, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33094as132 = observeOn122.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as132, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28902c02 = new C28902c0();
        ((ObservableSubscribeProxy) m33094as132).subscribe(new InterfaceC23484g() { // from class: or3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11376q2(Function1.this, obj3);
            }
        });
        Observable<List<OperatorFilter>> observable2 = this.f111180A;
        final Function1 c28904d02 = C28904d0.f111258b;
        Observable delay2 = observable2.map(new InterfaceC23492o() { // from class: pr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                OperatorMapFilterBundle m11373r2;
                m11373r2 = C49497ts3.m11373r2(Function1.this, obj3);
                return m11373r2;
            }
        }).distinctUntilChanged().delay(100L, TimeUnit.MILLISECONDS);
        final Function1 c28906e02 = new C28906e0();
        Observable doOnNext62 = delay2.doOnNext(new InterfaceC23484g() { // from class: qr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11370s2(Function1.this, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext62, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33094as142 = doOnNext62.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as142, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28908f02 = C28908f0.f111262g;
        InterfaceC23484g interfaceC23484g62 = new InterfaceC23484g() { // from class: sr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11367t2(Function1.this, obj3);
            }
        };
        final Function1 c28910g02 = C28910g0.f111264b;
        ((ObservableSubscribeProxy) m33094as142).subscribe(interfaceC23484g62, new InterfaceC23484g() { // from class: ur3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11364u2(Function1.this, obj3);
            }
        });
        Observable<DX3> observeOn132 = this.f111206u.reactiveMapEvent().polygonClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn132, "mapUi.reactiveMapEvent()…dSchedulers.mainThread())");
        Object m33094as152 = observeOn132.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as152, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28912h02 = new C28912h0();
        ((ObservableSubscribeProxy) m33094as152).subscribe(new InterfaceC23484g() { // from class: vr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11361v2(Function1.this, obj3);
            }
        });
        serviceCenterConfig = this.f111192g.m82623f8().getValue().getServiceCenterConfig();
        if (serviceCenterConfig.getEnableServiceCenterApp()) {
            AbstractC23442F<DateTime> mo13528g2 = this.f111201p.mo13528g(AssetManagerType.REPAIR);
            final Function1 c28914i02 = new C28914i0(this.f111200o);
            AbstractC23442F<R> m33165A2 = mo13528g2.m33165A(new InterfaceC23492o() { // from class: wr3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC23447K m11358w2;
                    m11358w2 = C49497ts3.m11358w2(Function1.this, obj3);
                    return m11358w2;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33165A2, "localAssetManager.update…anager::getAssetManifest)");
            AbstractC23442F m70883l2 = C38096ag5.m70883l(m33165A2);
            final Function1 c28916j02 = new C28916j0();
            AbstractC23461c m33164B2 = m70883l2.m33164B(new InterfaceC23492o() { // from class: xr3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    InterfaceC23496h m11354x2;
                    m11354x2 = C49497ts3.m11354x2(Function1.this, obj3);
                    return m11354x2;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33164B2, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
            Object m33041n22 = m33164B2.m33041n(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33041n22, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n22).subscribe();
        }
        Observable combineLatest22 = Observable.combineLatest(this.f111192g.m82669b6(), this.f111210y, new C28937r());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest22, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observeOn142 = combineLatest22.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn142, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as162 = observeOn142.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as162, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28918k02 = new C28918k0();
        ((ObservableSubscribeProxy) m33094as162).subscribe(new InterfaceC23484g() { // from class: yr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11350y2(Function1.this, obj3);
            }
        });
        Observable combineLatest32 = Observable.combineLatest(this.f111192g.m82625f6(), this.f111209x, new C28939s());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest32, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observeOn152 = combineLatest32.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn152, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as172 = observeOn152.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as172, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28920l02 = new C28920l0();
        ((ObservableSubscribeProxy) m33094as172).subscribe(new InterfaceC23484g() { // from class: zr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11346z2(Function1.this, obj3);
            }
        });
        Observable combineLatest42 = Observable.combineLatest(this.f111192g.m82647d6(), this.f111192g.m82603h6(), new C28941t());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest42, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observeOn162 = combineLatest42.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn162, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as182 = observeOn162.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as182, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28928m02 = new C28928m0();
        ((ObservableSubscribeProxy) m33094as182).subscribe(new InterfaceC23484g() { // from class: Ar3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11534A2(Function1.this, obj3);
            }
        });
        C45168ma4<Unit> c45168ma42 = this.f111186G;
        Observable<List<OperatorFilter>> operatorFiltersStream2 = this.f111180A;
        Intrinsics.checkNotNullExpressionValue(operatorFiltersStream2, "operatorFiltersStream");
        Observable<R> withLatestFrom2 = c45168ma42.withLatestFrom(operatorFiltersStream2, this.f111206u.centerLocationChanged(), new C28943u());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom2, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        Observable observeOn172 = withLatestFrom2.observeOn(C23454a.m33087a());
        final Function1 c28930n02 = new C28930n0();
        AbstractC23461c m33070P2 = observeOn172.flatMapCompletable(new InterfaceC23492o() { // from class: Br3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                InterfaceC23496h m11530B2;
                m11530B2 = C49497ts3.m11530B2(Function1.this, obj3);
                return m11530B2;
            }
        }).m33070P(C23454a.m33087a());
        final Function1 c28932o02 = new C28932o0();
        AbstractC23461c m33066T2 = m33070P2.m33084B(new InterfaceC23484g() { // from class: Dr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11526C2(Function1.this, obj3);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "override fun onCreate(zo…cribe(loadBirdsRelay)\n  }");
        Object m33041n32 = m33066T2.m33041n(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n32, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a2 = new InterfaceC23478a() { // from class: Er3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49497ts3.m11522D2();
            }
        };
        final Function1 c28934p02 = C28934p0.f111290b;
        ((CompletableSubscribeProxy) m33041n32).mo45217e(interfaceC23478a2, new InterfaceC23484g() { // from class: Gr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11518E2(Function1.this, obj3);
            }
        });
        Z84<Config> m82623f82 = this.f111192g.m82623f8();
        final Function1 c28936q02 = C28936q0.f111292g;
        Observable observeOn182 = m82623f82.map(new InterfaceC23492o() { // from class: Hr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj3) {
                Boolean m11514F2;
                m11514F2 = C49497ts3.m11514F2(Function1.this, obj3);
                return m11514F2;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn182, "reactiveConfig.config.ma…dSchedulers.mainThread())");
        Object m33094as192 = observeOn182.m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as192, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c28938r02 = new C28938r0();
        ((ObservableSubscribeProxy) m33094as192).subscribe(new InterfaceC23484g() { // from class: Ir3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj3) {
                C49497ts3.m11510G2(Function1.this, obj3);
            }
        });
        Object m33094as202 = this.f111211z.mo23177a().m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as202, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as202).subscribe(this.f111186G);
    }

    /* renamed from: K2 */
    public void m11494K2() {
        m11377q1();
        this.f111207v.mo89314lk();
        this.f111207v.mo89343Wi(false);
        this.f111207v.mo89347U2();
    }

    /* renamed from: T2 */
    public final void m11458T2(String str) {
        Object obj;
        List<BirdMapMarker> m73665a = this.f111181B.m73665a();
        Intrinsics.checkNotNullExpressionValue(m73665a, "nearbyBirdsStream()");
        Iterator<T> it = m73665a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((BirdMapMarker) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BirdMapMarker birdMapMarker = (BirdMapMarker) obj;
        if (birdMapMarker != null) {
            this.f111182C.m71837i(new C28861D0(str));
            this.f111206u.removeBirdMarker(birdMapMarker);
        }
    }

    /* renamed from: U2 */
    public final void m11454U2(String str) {
        m11458T2(str);
        this.f111206u.removeRoute();
    }

    /* renamed from: V2 */
    public final void m11450V2(List<BirdMapMarker> list) {
        Unit unit;
        Object obj;
        BirdMapMarker birdMapMarker = this.f111183D;
        if (birdMapMarker != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                unit = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((BirdMapMarker) obj).getId(), birdMapMarker.getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BirdMapMarker birdMapMarker2 = (BirdMapMarker) obj;
            if (birdMapMarker2 != null) {
                this.f111206u.select(birdMapMarker2);
                this.f111183D = birdMapMarker2;
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                m11377q1();
            }
        }
    }

    /* renamed from: W2 */
    public final void m11446W2(String str) {
        AbstractC23442F<WireBird> m33152N = this.f111202q.mo8104g(str).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "operatorManager.validate…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28870E0 c28870e0 = new C28870E0();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gs3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11442X2(Function1.this, obj);
            }
        };
        final C28872F0 c28872f0 = C28872F0.f111231b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hs3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11438Y2(Function1.this, obj);
            }
        });
    }

    /* renamed from: Z2 */
    public final Observable<Optional<TaskOrderData>> m11434Z2(final BirdMapMarker birdMapMarker) {
        this.f111197l.mo55905y(new C35792Rw3(null, null, null, birdMapMarker.getId(), 7, null));
        AbstractC23461c m33070P = InterfaceC31776As1.C0293a.populateFlightSheet$default(this.f111211z, birdMapMarker.getId(), false, 2, null).m33070P(C23454a.m33087a());
        final C28874G0 c28874g0 = new C28874G0();
        Observable observeOn = m33070P.m33081E(new InterfaceC23484g() { // from class: gr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11430a3(Function1.this, obj);
            }
        }).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: rr3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m11426b3;
                m11426b3 = C49497ts3.m11426b3(C49497ts3.this, birdMapMarker);
                return m11426b3;
            }
        })).m33043l(Observable.defer(new Callable() { // from class: Cr3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m11422c3;
                m11422c3 = C49497ts3.m11422c3(C49497ts3.this);
                return m11422c3;
            }
        })).take(1L).observeOn(C23454a.m33087a());
        final C28876H0 c28876h0 = new C28876H0();
        Observable<Optional<TaskOrderData>> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: Nr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11418d3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun showFlightSh…sk)\n        }\n      }\n  }");
        return doOnNext;
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: d */
    public boolean mo10339d() {
        return this.f111196k.mo10339d();
    }

    /* renamed from: e3 */
    public final void m11414e3(Vehicle vehicle, Location location) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(location, "location");
        Object m33135e = this.f111189d.mo71588U0(vehicle.getBird().getSerialNumber(), Integer.valueOf(vehicle.getBattery()), Integer.valueOf(vehicle.getDistance()), location).m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28878I0 c28878i0 = C28878I0.f111237g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ps3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11410f3(Function1.this, obj);
            }
        };
        final C28880J0 c28880j0 = C28880J0.f111239g;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qs3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11406g3(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: f */
    public boolean mo10338f() {
        return this.f111196k.mo10338f();
    }

    /* renamed from: g1 */
    public final void m11408g1() {
        C41318g46.m40163a("checking for required bluetooth scan permission", new Object[0]);
        AbstractC23442F<FQ3> m110485l = this.f111204s.m110485l(Permission.BLUETOOTH_SCAN);
        final C28901c c28901c = C28901c.f111255g;
        AbstractC23461c m33070P = m110485l.m33101w(new InterfaceC23484g() { // from class: Zr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11404h1(Function1.this, obj);
            }
        }).m33159G().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: as3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m11401i1;
                m11401i1 = C49497ts3.m11401i1(C49497ts3.this);
                return m11401i1;
            }
        })).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: bs3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m11395k1;
                m11395k1 = C49497ts3.m11395k1(C49497ts3.this);
                return m11395k1;
            }
        })).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "permissionManager.reques…dSchedulers.mainThread())");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f111205t));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: cs3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49497ts3.m11389m1(C49497ts3.this);
            }
        };
        final C28907f c28907f = C28907f.f111261g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: ds3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11386n1(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = this.f111187H.withLatestFrom(this.f111207v.mo89305rg(OperatorMapBottomSheet.EnumC14592a.FLIGHT_SHEET), this.f111184E, new C28899b());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        final C28909g c28909g = C28909g.f111263g;
        Observable filter = withLatestFrom.filter(new InterfaceC23494q() { // from class: es3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m11383o1;
                m11383o1 = C49497ts3.m11383o1(Function1.this, obj);
                return m11383o1;
            }
        });
        final C28911h c28911h = new C28911h();
        AbstractC23461c flatMapCompletable = filter.flatMapCompletable(new InterfaceC23492o() { // from class: fs3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m11380p1;
                m11380p1 = C49497ts3.m11380p1(Function1.this, obj);
                return m11380p1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun checkForRequ…r)\n      .subscribe()\n  }");
        Object m33041n2 = flatMapCompletable.m33041n(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: h */
    public boolean mo10337h() {
        return this.f111196k.mo10337h();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: j */
    public PermissionStatus mo10336j(Permission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return this.f111196k.mo10336j(permission);
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: k */
    public boolean mo10335k() {
        return this.f111196k.mo10335k();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: l */
    public boolean mo10334l() {
        return this.f111196k.mo10334l();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: m */
    public boolean mo10333m() {
        return this.f111196k.mo10333m();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: n */
    public boolean mo10332n() {
        return this.f111196k.mo10332n();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: o */
    public InterfaceC49820uQ3.EnumC29192a mo10331o() {
        return this.f111196k.mo10331o();
    }

    @Override // p000.InterfaceC33866Jq3
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        Enum r8;
        boolean equals;
        if (i != 10018) {
            boolean z = true;
            if (i != 10029) {
                if (i == 10055 && i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("vehicle_inventory_action");
                    if (stringExtra != null) {
                        try {
                            Object[] enumConstants = VehicleInventoryAction.class.getEnumConstants();
                            Intrinsics.checkNotNull(enumConstants);
                            for (Object obj : enumConstants) {
                                equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                                if (equals) {
                                    Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                                    r8 = (Enum) obj;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        } catch (Exception unused) {
                            Object[] enumConstants2 = VehicleInventoryAction.class.getEnumConstants();
                            Intrinsics.checkNotNull(enumConstants2);
                            for (Object obj2 : enumConstants2) {
                                r8 = (Enum) obj2;
                                if (Intrinsics.areEqual(r8.name(), "UNKNOWN")) {
                                    Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    r8 = null;
                    VehicleInventoryAction vehicleInventoryAction = (VehicleInventoryAction) r8;
                    if (vehicleInventoryAction != null) {
                        Object m33135e = H31.C3014a.showBottomSheetAlert$default(this.f111207v, new CoreInventorySuccess(vehicleInventoryAction, intent.getStringExtra("warehouse")), null, 2, null).m33135e(AutoDispose.m45239a(m5717t()));
                        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                        ((SingleSubscribeProxy) m33135e).subscribe();
                        return;
                    }
                    return;
                }
                return;
            }
            S74.C7343a.showProgress$default(this.f111207v, false, 0, 2, null);
            if (i2 == -1) {
                if ((intent == null || !intent.getBooleanExtra("co.bird.android.bird_capture_action", false)) ? false : false) {
                    this.f111207v.mo89349Tg();
                }
            }
        } else if (i2 == -1 && intent != null && (wireBird = (WireBird) intent.getParcelableExtra("bird")) != null) {
            m11454U2(wireBird.getId());
            this.f111207v.mo89347U2();
        }
    }

    @Override // p000.C30060xC, p000.N95
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // p000.InterfaceC33866Jq3
    public void onResume() {
        this.f111211z.onResume();
        C45168ma4<Unit> c45168ma4 = this.f111186G;
        Unit unit = Unit.INSTANCE;
        c45168ma4.accept(unit);
        this.f111187H.accept(unit);
        Z84<Config> m82623f8 = this.f111192g.m82623f8();
        final C28946v0 c28946v0 = C28946v0.f111299g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: Pr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m11490L2;
                m11490L2 = C49497ts3.m11490L2(Function1.this, obj);
                return m11490L2;
            }
        }).distinctUntilChanged();
        final C28948w0 c28948w0 = new C28948w0();
        Observable observeOn = distinctUntilChanged.flatMapSingle(new InterfaceC23492o() { // from class: Qr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m11486M2;
                m11486M2 = C49497ts3.m11486M2(Function1.this, obj);
                return m11486M2;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onResume() ….let(::setLookupBird)\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f111205t));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28952x0 c28952x0 = new C28952x0(this.f111207v);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Rr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11482N2(Function1.this, obj);
            }
        };
        final C28954y0 c28954y0 = new C28954y0();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Sr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11478O2(Function1.this, obj);
            }
        });
        Observable streamOperatorFilters$default = InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this.f111193h, false, 1, null);
        final C28956z0 c28956z0 = new C28956z0(this.f111193h);
        Observable flatMapSingle = streamOperatorFilters$default.flatMapSingle(new InterfaceC23492o() { // from class: Tr3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m11474P2;
                m11474P2 = C49497ts3.m11474P2(Function1.this, obj);
                return m11474P2;
            }
        });
        final C28855A0 c28855a0 = C28855A0.f111215g;
        Observable observeOn2 = flatMapSingle.map(new InterfaceC23492o() { // from class: Ur3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m11470Q2;
                m11470Q2 = C49497ts3.m11470Q2(Function1.this, obj);
                return m11470Q2;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "serverDrivenFilterManage…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f111205t));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28857B0 c28857b0 = new C28857B0(this.f111207v);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Vr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11466R2(Function1.this, obj);
            }
        };
        final C28859C0 c28859c0 = C28859C0.f111218b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Wr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11462S2(Function1.this, obj);
            }
        });
        String m37607k0 = this.f111195j.m37607k0();
        if (m37607k0 != null) {
            m11446W2(m37607k0);
        }
    }

    /* renamed from: q1 */
    public final void m11377q1() {
        BirdMapMarker birdMapMarker = this.f111183D;
        if (birdMapMarker != null) {
            this.f111206u.deselect(birdMapMarker);
        }
        this.f111206u.removeRoute();
        this.f111183D = null;
    }

    /* renamed from: r1 */
    public final void m11374r1() {
        m11347z1();
        this.f111207v.mo89316kh(this.f111192g.m82623f8().m73665a().getOperatorConfig().getFeatures().getBatterySwap().getEnableBatterySwapMapButton());
        Object m33094as = this.f111207v.mo89302w3().m33094as(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28913i c28913i = new C28913i();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Xr3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11371s1(Function1.this, obj);
            }
        });
    }

    /* renamed from: t1 */
    public final C41318g46.AbstractC20723b m11368t1() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("Operator Filters");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"Operator Filters\")");
        return m40153k;
    }

    /* renamed from: u1 */
    public final boolean m11365u1(EnumC52481yu3 enumC52481yu3) {
        return f111179K.contains(enumC52481yu3);
    }

    /* renamed from: v1 */
    public final void m11362v1(BirdMapMarker birdMapMarker, boolean z) {
        m11377q1();
        if (!z) {
            this.f111183D = birdMapMarker;
            this.f111206u.select(birdMapMarker);
            Object m33094as = C28237sD.progress$default(this.f111189d.mo71600I0(this.f111199n.mo43616p().m73665a(), UB1.m81891a(birdMapMarker.getLocation())), this.f111207v, 0, 2, (Object) null).m33094as(AutoDispose.m45239a(m5717t()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C28915j c28915j = new C28915j(birdMapMarker);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Kq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49497ts3.m11359w1(Function1.this, obj);
                }
            };
            final C28917k c28917k = C28917k.f111271g;
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Vq3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49497ts3.m11355x1(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: y1 */
    public final void m11351y1(WireBird wireBird) {
        m11458T2(wireBird.getId());
        this.f111206u.removeRoute();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: z1 */
    public final void m11347z1() {
        AbstractC23442F<Location> m33152N = this.f111199n.mo43627e(true).m33152N(C23454a.m33087a());
        final C28919l c28919l = new C28919l();
        AbstractC23442F<Location> m33152N2 = m33152N.m33101w(new InterfaceC23484g() { // from class: ks3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11535A1(Function1.this, obj);
            }
        }).m33152N(C24542a.m31932c());
        final C28921m c28921m = new C28921m();
        AbstractC23461c m33164B = m33152N2.m33164B(new InterfaceC23492o() { // from class: ls3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m11531B1;
                m11531B1 = C49497ts3.m11531B1(Function1.this, obj);
                return m11531B1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "@SuppressLint(\"MissingPe…scribe({}, Timber::e)\n  }");
        Object m33041n = m33164B.m33041n(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: ms3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49497ts3.m11527C1();
            }
        };
        final C28929n c28929n = C28929n.f111286b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: ns3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49497ts3.m11523D1(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/BirdMapMarker;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$h */
    /* loaded from: classes2.dex */
    public static final class C28911h extends Lambda implements Function1<Pair<? extends Boolean, ? extends BirdMapMarker>, InterfaceC23496h> {
        public C28911h() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Boolean, BirdMapMarker> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C49497ts3.this.f111211z.mo23174d(pair.component2().getId(), true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Boolean, ? extends BirdMapMarker> pair) {
            return invoke2((Pair<Boolean, BirdMapMarker>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "Lyu3;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$S */
    /* loaded from: classes2.dex */
    public static final class C28889S extends Lambda implements Function1<Pair<? extends LatLng, ? extends EnumC52481yu3>, Boolean> {
        public C28889S() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<LatLng, ? extends EnumC52481yu3> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            EnumC52481yu3 tab = pair.component2();
            C49497ts3 c49497ts3 = C49497ts3.this;
            Intrinsics.checkNotNullExpressionValue(tab, "tab");
            return Boolean.valueOf(c49497ts3.m11365u1(tab) && !C49497ts3.this.f111193h.mo6178e().getValue().m59037c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends LatLng, ? extends EnumC52481yu3> pair) {
            return invoke2((Pair<LatLng, ? extends EnumC52481yu3>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "Lcom/google/android/gms/maps/model/LatLng;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$n0 */
    /* loaded from: classes2.dex */
    public static final class C28930n0 extends Lambda implements Function1<Pair<? extends OperatorMapFilterBundle, ? extends LatLng>, InterfaceC23496h> {
        public C28930n0() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<OperatorMapFilterBundle, LatLng> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            OperatorMapFilterBundle component1 = pair.component1();
            LatLng centerLocation = pair.component2();
            C41318g46.AbstractC20723b m11368t1 = C49497ts3.this.m11368t1();
            m11368t1.mo7228a("Loading Birds Nearby with filters: " + component1, new Object[0]);
            InterfaceC46473om3 interfaceC46473om3 = C49497ts3.this.f111202q;
            C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
            Intrinsics.checkNotNullExpressionValue(centerLocation, "centerLocation");
            return C28237sD.progress$default(InterfaceC46473om3.C27057a.fetchOperatorBirdNearby$default(interfaceC46473om3, c37429Yw2.m73962i(centerLocation), C49497ts3.this.f111206u.nearbyRadius(), null, component1, null, C49497ts3.this.f111206u.viewport(), 20, null), C49497ts3.this.f111207v, 0, 2, (Object) null).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends OperatorMapFilterBundle, ? extends LatLng> pair) {
            return invoke2((Pair<OperatorMapFilterBundle, LatLng>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "location", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Landroid/location/Location;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ts3$m */
    /* loaded from: classes2.dex */
    public static final class C28921m extends Lambda implements Function1<Location, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/Vehicle;", "it", "Lkotlin/Pair;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ts3$m$a */
        /* loaded from: classes2.dex */
        public static final class C28922a extends Lambda implements Function1<List<? extends Vehicle>, Pair<? extends Location, ? extends List<? extends Vehicle>>> {

            /* renamed from: g */
            public final /* synthetic */ Location f111276g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28922a(Location location) {
                super(1);
                this.f111276g = location;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Location, List<Vehicle>> invoke(List<Vehicle> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair<>(this.f111276g, it);
            }
        }

        public C28921m() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23434B m11298d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            Observable scanBatch$default = InterfaceC27246pJ.C27247a.scanBatch$default(C49497ts3.this.f111190e, 0, 1, null);
            final C28922a c28922a = new C28922a(location);
            Observable map = scanBatch$default.map(new InterfaceC23492o() { // from class: us3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C49497ts3.C28921m.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C28923b c28923b = new C28923b(C49497ts3.this);
            return map.flatMap(new InterfaceC23492o() { // from class: vs3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m11298d;
                    m11298d = C49497ts3.C28921m.m11298d(Function1.this, obj);
                    return m11298d;
                }
            }).ignoreElements().m33069Q();
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Landroid/location/Location;", "", "Lco/bird/android/model/Vehicle;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOperatorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$loadBirdsAndScanBluetooth$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,891:1\n1549#2:892\n1620#2,3:893\n*S KotlinDebug\n*F\n+ 1 OperatorPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorPresenterImpl$loadBirdsAndScanBluetooth$2$2\n*L\n811#1:892\n811#1:893,3\n*E\n"})
        /* renamed from: ts3$m$b */
        /* loaded from: classes2.dex */
        public static final class C28923b extends Lambda implements Function1<Pair<? extends Location, ? extends List<? extends Vehicle>>, InterfaceC23434B<? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ C49497ts3 f111277g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: ts3$m$b$a */
            /* loaded from: classes2.dex */
            public static final class C28924a extends Lambda implements Function1<Vehicle, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C49497ts3 f111278g;

                /* renamed from: h */
                public final /* synthetic */ Vehicle f111279h;

                /* renamed from: i */
                public final /* synthetic */ Location f111280i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28924a(C49497ts3 c49497ts3, Vehicle vehicle, Location location) {
                    super(1);
                    this.f111278g = c49497ts3;
                    this.f111279h = vehicle;
                    this.f111280i = location;
                }

                /* renamed from: a */
                public final void m11288a(Vehicle vehicle) {
                    C49497ts3 c49497ts3 = this.f111278g;
                    Vehicle vehicle2 = this.f111279h;
                    Location location = this.f111280i;
                    Intrinsics.checkNotNullExpressionValue(location, "location");
                    c49497ts3.m11414e3(vehicle2, location);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
                    m11288a(vehicle);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: ts3$m$b$b */
            /* loaded from: classes2.dex */
            public static final class C28925b extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Boolean>> {

                /* renamed from: g */
                public final /* synthetic */ C49497ts3 f111281g;

                /* renamed from: h */
                public final /* synthetic */ Vehicle f111282h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28925b(C49497ts3 c49497ts3, Vehicle vehicle) {
                    super(1);
                    this.f111281g = c49497ts3;
                    this.f111282h = vehicle;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23434B<? extends Boolean> invoke(Vehicle it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f111281g.f111190e.mo19557a(this.f111282h);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: ts3$m$b$c */
            /* loaded from: classes2.dex */
            public static final class C28926c extends Lambda implements Function1<Boolean, Unit> {

                /* renamed from: g */
                public final /* synthetic */ Vehicle f111283g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28926c(Vehicle vehicle) {
                    super(1);
                    this.f111283g = vehicle;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke2(bool);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    Vehicle vehicle = this.f111283g;
                    C41318g46.m40151m("Scanned and updated vehicle: " + bool + vehicle, new Object[0]);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: ts3$m$b$d */
            /* loaded from: classes2.dex */
            public static final class C28927d extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public static final C28927d f111284g = new C28927d();

                public C28927d() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    C41318g46.m40160d("Scanned and updated vehicle error: " + th + " ", new Object[0]);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28923b(C49497ts3 c49497ts3) {
                super(1);
                this.f111277g = c49497ts3;
            }

            /* renamed from: e */
            public static final void m11292e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: f */
            public static final InterfaceC23434B m11291f(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23434B) tmp0.invoke(obj);
            }

            /* renamed from: g */
            public static final void m11290g(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: h */
            public static final void m11289h(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23434B<? extends Boolean> invoke2(Pair<? extends Location, ? extends List<Vehicle>> pair) {
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Location component1 = pair.component1();
                List<Vehicle> vehicles = pair.component2();
                Intrinsics.checkNotNullExpressionValue(vehicles, "vehicles");
                List<Vehicle> list = vehicles;
                C49497ts3 c49497ts3 = this.f111277g;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Vehicle vehicle : list) {
                    Observable connect$default = InterfaceC27246pJ.C27247a.connect$default(c49497ts3.f111190e, vehicle, true, false, false, false, 28, null);
                    final C28924a c28924a = new C28924a(c49497ts3, vehicle, component1);
                    Observable doOnNext = connect$default.doOnNext(new InterfaceC23484g() { // from class: ws3
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C49497ts3.C28921m.C28923b.m11292e(Function1.this, obj);
                        }
                    });
                    final C28925b c28925b = new C28925b(c49497ts3, vehicle);
                    Observable flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: xs3
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23434B m11291f;
                            m11291f = C49497ts3.C28921m.C28923b.m11291f(Function1.this, obj);
                            return m11291f;
                        }
                    });
                    final C28926c c28926c = new C28926c(vehicle);
                    Observable doOnNext2 = flatMap.doOnNext(new InterfaceC23484g() { // from class: ys3
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C49497ts3.C28921m.C28923b.m11290g(Function1.this, obj);
                        }
                    });
                    final C28927d c28927d = C28927d.f111284g;
                    arrayList.add(doOnNext2.doOnError(new InterfaceC23484g() { // from class: zs3
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C49497ts3.C28921m.C28923b.m11289h(Function1.this, obj);
                        }
                    }).onErrorReturnItem(Boolean.FALSE));
                }
                return Observable.merge(arrayList);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Boolean> invoke(Pair<? extends Location, ? extends List<? extends Vehicle>> pair) {
                return invoke2((Pair<? extends Location, ? extends List<Vehicle>>) pair);
            }
        }
    }
}
