package p000;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.CompleteRideResponse;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.IN_NO_PARKING_AREA;
import co.bird.android.model.IN_NO_RIDE_AREA;
import co.bird.android.model.IN_NO_RIDE_NO_PARK_AREA;
import co.bird.android.model.IN_RESTRICTED_PARKING_AREA;
import co.bird.android.model.IN_SLOW_NO_PARK_AREA;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LocationAreaState;
import co.bird.android.model.NonComplianceWarning;
import co.bird.android.model.NonComplianceWarningKind;
import co.bird.android.model.OUTSIDE_SERVICE_AREA;
import co.bird.android.model.ParkingLocationSource;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.Polygon;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.RiderAreaState;
import co.bird.android.model.UNKNOWN_AREA;
import co.bird.android.model.analytics.ParkingStatusComputation;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePrivateBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.ParkingLocationVerificationMethod;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.android.model.wire.configs.RideWarningConfigKt;
import co.bird.android.model.wire.configs.WarningPresentationKind;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23491n;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p000.C37791a94;
import p000.FU4;
import p000.InterfaceC1880Ea;
import p000.InterfaceC40099e13;
import p000.InterfaceC44791lw0;
import p000.InterfaceC46164oF3;
import p000.JF3;
@Metadata(m28433d1 = {"\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ê\u00012\u00020\u00012\u00020\u0002:\u0003}\u0081\u0001B\u009f\u0001\b\u0007\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010q\u001a\u00020o\u0012\u0006\u0010t\u001a\u00020r\u0012\u0006\u0010x\u001a\u00020u\u0012\u0006\u0010{\u001a\u00020y\u0012\u0006\u0010\u007f\u001a\u00020|\u0012\b\u0010\u0083\u0001\u001a\u00030\u0080\u0001\u0012\b\u0010\u0086\u0001\u001a\u00030\u0084\u0001\u0012\b\u0010\u0089\u0001\u001a\u00030\u0087\u0001\u0012\b\u0010\u008d\u0001\u001a\u00030\u008a\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u008e\u0001\u0012\b\u0010\u0095\u0001\u001a\u00030\u0092\u0001\u0012\b\u0010\u0099\u0001\u001a\u00030\u0096\u0001\u0012\b\u0010\u009d\u0001\u001a\u00030\u009a\u0001\u0012\b\u0010¡\u0001\u001a\u00030\u009e\u0001\u0012\b\u0010¥\u0001\u001a\u00030¢\u0001¢\u0006\u0006\bè\u0001\u0010é\u0001J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\"\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016JB\u0010 \u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0016J$\u0010#\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010!\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016J'\u0010$\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b$\u0010%J9\u0010'\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020\u001cH\u0001¢\u0006\u0004\b'\u0010(J\n\u0010)\u001a\u00020\u001c*\u00020\u001aJ\u001a\u0010*\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J*\u0010/\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001cH\u0002J*\u00100\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001cH\u0002J:\u00104\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c02H\u0002J.\u00109\u001a\u0002082\u0006\u0010\u0016\u001a\u00020\u00152\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J:\u0010:\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0002J2\u0010;\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010&\u001a\u00020\u001cH\u0002J\u0018\u0010<\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J2\u0010=\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020\u001cH\u0002J\b\u0010>\u001a\u00020\u001cH\u0002J3\u0010C\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010\u00132\b\u0010B\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bC\u0010DJI\u0010J\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010G\u001a\u00020\u001c2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010H\u001a\u00020\u001c2\b\b\u0002\u0010I\u001a\u00020\u001cH\u0002¢\u0006\u0004\bJ\u0010KJ;\u0010L\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010G\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010I\u001a\u00020\u001cH\u0002¢\u0006\u0004\bL\u0010MJ.\u0010S\u001a\u00020\u0011*\u00020N2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\u0014\b\u0002\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002080QH\u0002J\b\u0010T\u001a\u00020\u000eH\u0002J\b\u0010U\u001a\u00020\u000eH\u0002J\f\u0010V\u001a\u00020\u001c*\u00020NH\u0002J\u0018\u0010Y\u001a\u00020\u00112\u0006\u0010W\u001a\u0002082\u0006\u0010X\u001a\u00020NH\u0002J\b\u0010Z\u001a\u00020\u001cH\u0002J(\u0010[\u001a\u0004\u0018\u0001062\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0002J(\u0010\\\u001a\u0004\u0018\u0001062\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0002J\f\u0010]\u001a\u00020\u001c*\u00020NH\u0002J\f\u0010^\u001a\u00020\u001c*\u00020NH\u0002J\f\u0010_\u001a\u00020\u001c*\u00020NH\u0002J\u0010\u0010a\u001a\u00020`2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010f\u001a\u00020e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u001cH\u0002J(\u0010j\u001a\u00020i2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010c\u001a\u00020b2\u0006\u0010g\u001a\u00020\u001c2\u0006\u0010h\u001a\u00020\u001cH\u0002R\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010pR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R)\u0010«\u0001\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b\u008b\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R*\u0010W\u001a\u0004\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b\u0081\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R2\u0010µ\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110Q0±\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b²\u0001\u0010³\u0001\u001a\u0005\b}\u0010´\u0001R*\u0010¹\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110Q0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R3\u0010¼\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002080Q0±\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bº\u0001\u0010³\u0001\u001a\u0006\b»\u0001\u0010´\u0001R,\u0010Â\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020¾\u00010½\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0005\bv\u0010Á\u0001R*\u0010Ä\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002080Q0¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010¸\u0001R'\u0010É\u0001\u001a\u0012\u0012\r\u0012\u000b Æ\u0001*\u0004\u0018\u00010\u000e0\u000e0Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R7\u0010Ñ\u0001\u001a\u0012\u0012\r\u0012\u000b Æ\u0001*\u0004\u0018\u00010\u001c0\u001c0Ê\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u0012\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R'\u0010Õ\u0001\u001a\u0012\u0012\r\u0012\u000b Æ\u0001*\u0004\u0018\u000108080Ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0018\u0010Ù\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R&\u0010Ü\u0001\u001a\u0011\u0012\r\u0012\u000b Æ\u0001*\u0004\u0018\u00010\u00110\u00110\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\"\u0010Þ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110Q8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bl\u0010Ý\u0001R\u0019\u0010á\u0001\u001a\u0004\u0018\u00010O8BX\u0082\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u0019\u0010ä\u0001\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0017\u0010ç\u0001\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001¨\u0006ï\u0001²\u0006\r\u0010ë\u0001\u001a\u00020\u001c8\nX\u008a\u0084\u0002²\u0006\u0010\u0010í\u0001\u001a\u0005\u0018\u00010ì\u00018\nX\u008a\u0084\u0002²\u0006\r\u0010î\u0001\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, m28432d2 = {"LJF3;", "LoF3;", "LA5;", "LFU4;", "rideParkingDelegate", "Lf13;", "navigatorDelegate", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", "h", "Lio/reactivex/Observable;", "LFH3;", "i", "", "rideId", "Landroid/location/Location;", "location", "Lco/bird/android/model/ParkingLocationSource;", "parkingLocationSource", "c", "Lco/bird/android/model/wire/WireRide;", "ride", "", "shouldEndRide", "skipEndRideTutorialStep", "skipThirdPartyLocationDetermination", "e", "lastVisitedStep", "reason", "b", "h0", "(LFU4;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/WireRide;)V", "usedOverride", "N", "(LFU4;Lf13;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/WireRide;Z)V", "a0", "r0", "l0", "Lco/bird/android/model/wire/configs/Config;", "config", "dueToOptionalPrompt", AbstractC26684u0.f100690q, "s0", "forceShow", "Lkotlin/Function2;", "action", "q0", "", "Lco/bird/android/model/ParkingNest;", "nests", "LbF0;", "O", "o0", "p0", "G0", "Q", "J", "Lco/bird/android/model/RiderAreaState;", "riderAreaState", "fineCurrency", "fineAmount", "i0", "(Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/RiderAreaState;Ljava/lang/String;Ljava/lang/Integer;)V", "Lco/bird/android/model/wire/WireBird;", "bird", "isUnlocking", "forceShowForPrivateBird", "isRideEnding", "F0", "(Lf13;Lco/bird/android/model/wire/WireBird;ZLjava/lang/Integer;ZZ)Z", "H0", "(Lf13;Lco/bird/android/model/wire/WireBird;ZLjava/lang/Integer;Z)Z", "LJF3$g;", "Lco/bird/android/model/RideState;", "rideState", "", "parkingNestsByRideId", "K0", "m0", "n0", "K", "currentParkingNest", "parkingState", "P", "e0", "W", "S", "b0", "c0", "d0", "LBQ4;", "N0", "LgR4;", "warning", "endRideAllowed", "LzQ4;", "M0", "endRideWasAllowed", "endRideChosen", "LyQ4;", "L0", "LTq4;", C17296a.f69688o, "LTq4;", "reactiveConfig", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgl;", "Lgl;", "appPreference", "Ldr4;", DateTokenConverter.CONVERTER_KEY, "Ldr4;", "reactiveLocationManager", "Lbn;", "Lbn;", "areaManager", "LEa;", "f", "LEa;", "analyticsManager", "LYR4;", "g", "LYR4;", "rideManager", "LTL;", "LTL;", "birdLocationManager", "Ltm;", "Ltm;", "arManager", "LXc1;", "j", "LXc1;", "endRideManager", "Llw0;", "k", "Llw0;", "configurableTutorialManager", "Lys0;", "l", "Lys0;", "complianceManager", "LpU4;", "m", "LpU4;", "rideMapStateManager", "LaM;", "n", "LaM;", "birdManager", "LMc2;", "o", "LMc2;", "itemLeaseManager", "LoI5;", "p", "LoI5;", "smartlockManager", "q", "LFH3;", "()LFH3;", "x0", "(LFH3;)V", "currentParkingStatus", "r", "LbF0;", "()LbF0;", "w0", "(LbF0;)V", "LZ84;", "s", "Lkotlin/Lazy;", "()LZ84;", "parkingStatusByRideId", "La94;", "t", "La94;", "mutableParkingStatusByRideId", "u", "X", "parkingNestByRideId", "Lkotlin/collections/ArrayDeque;", "Lco/bird/android/buava/Optional;", "v", "Lkotlin/collections/ArrayDeque;", "()Lkotlin/collections/ArrayDeque;", "activityResultStack", "w", "mutableParkingNestByRideId", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "x", "Lio/reactivex/subjects/d;", "parkingNestRefreshRequests", "Lio/reactivex/subjects/a;", "y", "Lio/reactivex/subjects/a;", "Y", "()Lio/reactivex/subjects/a;", "getPhysicalLockSubject$ride_release$annotations", "()V", "physicalLockSubject", "Lio/reactivex/k;", "z", "Lio/reactivex/k;", "sharedCurrentParkingNest", "Ljava/util/concurrent/atomic/AtomicBoolean;", "A", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracing", "B", "Lio/reactivex/Observable;", "sharedParkingStatus", "()Ljava/util/Map;", "parkingStatusByBirdId", "V", "()Lco/bird/android/model/RideState;", "focusedRideState", "U", "()Lco/bird/android/model/wire/WireRide;", "focusedRide", "Z", "()Z", "smartLockV2Enabled", "<init>", "(LTq4;Landroid/content/Context;Lgl;Ldr4;Lbn;LEa;LYR4;LTL;Ltm;LXc1;Llw0;Lys0;LpU4;LaM;LMc2;LoI5;)V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "hasLeaseOrNotRequired", "Lco/bird/android/model/wire/WirePhysicalLock;", "eb100Lock", "pointRadiusDistance", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n161#2:1467\n161#2:1468\n199#2:1478\n199#2:1482\n199#2:1491\n199#2:1492\n114#3,2:1469\n1179#4,2:1471\n1253#4,4:1473\n1747#4,3:1479\n288#4,2:1483\n1747#4,3:1485\n1747#4,3:1488\n1726#4,3:1493\n288#4,2:1496\n288#4,2:1498\n2333#4,14:1500\n1549#4:1514\n1620#4,3:1515\n1#5:1477\n*S KotlinDebug\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl\n*L\n162#1:1467\n185#1:1468\n444#1:1478\n809#1:1482\n936#1:1491\n969#1:1492\n1146#1:1469,2\n134#1:1471,2\n134#1:1473,4\n736#1:1479,3\n836#1:1483,2\n845#1:1485,3\n846#1:1488,3\n986#1:1493,3\n1313#1:1496,2\n1319#1:1498,2\n1328#1:1500,14\n1399#1:1514\n1399#1:1515,3\n*E\n"})
/* renamed from: JF3 */
/* loaded from: classes4.dex */
public final class JF3 implements InterfaceC46164oF3, InterfaceC0014A5 {

    /* renamed from: C */
    public static final C3967f f17093C = new C3967f(null);

    /* renamed from: A */
    public final AtomicBoolean f17094A;

    /* renamed from: B */
    public final Observable<FH3> f17095B;

    /* renamed from: a */
    public final C36207Tq4 f17096a;

    /* renamed from: b */
    public final Context f17097b;

    /* renamed from: c */
    public final C22454gl f17098c;

    /* renamed from: d */
    public final InterfaceC40001dr4 f17099d;

    /* renamed from: e */
    public final InterfaceC12495bn f17100e;

    /* renamed from: f */
    public final InterfaceC1880Ea f17101f;

    /* renamed from: g */
    public final YR4 f17102g;

    /* renamed from: h */
    public final InterfaceC7807TL f17103h;

    /* renamed from: i */
    public final InterfaceC28816tm f17104i;

    /* renamed from: j */
    public final InterfaceC37014Xc1 f17105j;

    /* renamed from: k */
    public final InterfaceC44791lw0 f17106k;

    /* renamed from: l */
    public final InterfaceC52458ys0 f17107l;

    /* renamed from: m */
    public final InterfaceC46893pU4 f17108m;

    /* renamed from: n */
    public final InterfaceC10636aM f17109n;

    /* renamed from: o */
    public final InterfaceC34441Mc2 f17110o;

    /* renamed from: p */
    public final InterfaceC46193oI5 f17111p;

    /* renamed from: q */
    public FH3 f17112q;

    /* renamed from: r */
    public C38435bF0 f17113r;

    /* renamed from: s */
    public final Lazy f17114s;

    /* renamed from: t */
    public final C37791a94<Map<String, FH3>> f17115t;

    /* renamed from: u */
    public final Lazy f17116u;

    /* renamed from: v */
    public final ArrayDeque<Optional<InterfaceC0014A5>> f17117v;

    /* renamed from: w */
    public final C37791a94<Map<String, C38435bF0>> f17118w;

    /* renamed from: x */
    public final C24558d<Unit> f17119x;

    /* renamed from: y */
    public final C24552a<Boolean> f17120y;

    /* renamed from: z */
    public final AbstractC24490k<C38435bF0> f17121z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LbF0;", "kotlin.jvm.PlatformType", "currNest", "", C17296a.f69688o, "(LbF0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$sharedCurrentParkingNest$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"})
    /* renamed from: JF3$A */
    /* loaded from: classes4.dex */
    public static final class C3941A extends Lambda implements Function1<C38435bF0, Unit> {
        public C3941A() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (r0 != r13.m64761f()) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
            if (r2 != false) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [p95] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m100819a(C38435bF0 c38435bF0) {
            ParkingNest parkingNest;
            String str;
            ParkingNest m64762e;
            ParkingNest m64762e2;
            boolean z;
            EnumC44987mG3 enumC44987mG3;
            C38435bF0 mo21502g = JF3.this.mo21502g();
            C45518n95 c45518n95 = null;
            r1 = null;
            String str2 = null;
            if (mo21502g != null) {
                parkingNest = mo21502g.m64762e();
            } else {
                parkingNest = null;
            }
            if (Intrinsics.areEqual(parkingNest, c38435bF0.m64762e())) {
                C38435bF0 mo21502g2 = JF3.this.mo21502g();
                if (mo21502g2 != null) {
                    enumC44987mG3 = mo21502g2.m64761f();
                } else {
                    enumC44987mG3 = null;
                }
            }
            ParkingNest m64762e3 = c38435bF0.m64762e();
            if (m64762e3 != null) {
                if (c38435bF0.m64761f() == EnumC44987mG3.INSIDE) {
                    z = true;
                } else {
                    z = false;
                }
            }
            m64762e3 = null;
            if (m64762e3 != null) {
                c45518n95 = new C45518n95(null, null, null, m64762e3.getId(), JF3.this.f17102g.mo75033n0(), null, Long.valueOf(JF3.this.f17102g.mo75032o0().m73665a().getActiveRideCount()), 39, null);
            } else {
                C38435bF0 mo21502g3 = JF3.this.mo21502g();
                if (mo21502g3 != null && (m64762e2 = mo21502g3.m64762e()) != null) {
                    str = m64762e2.getId();
                } else {
                    str = null;
                }
                if (str != null) {
                    C38435bF0 mo21502g4 = JF3.this.mo21502g();
                    if (mo21502g4 != null && (m64762e = mo21502g4.m64762e()) != null) {
                        str2 = m64762e.getId();
                    }
                    c45518n95 = new C46704p95(null, null, null, str2, JF3.this.f17102g.mo75033n0(), null, Long.valueOf(JF3.this.f17102g.mo75032o0().m73665a().getActiveRideCount()), 39, null);
                }
            }
            if (c45518n95 != null) {
                JF3.this.f17101f.mo55905y(c45518n95);
            }
            JF3.this.f17119x.onNext(Unit.INSTANCE);
            JF3.this.m100826w0(c38435bF0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C38435bF0 c38435bF0) {
            m100819a(c38435bF0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lco/bird/android/model/ParkingNest;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$B */
    /* loaded from: classes4.dex */
    public static final class C3942B extends Lambda implements Function1<List<? extends ParkingNest>, Boolean> {

        /* renamed from: g */
        public static final C3942B f17123g = new C3942B();

        public C3942B() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<ParkingNest> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends ParkingNest> list) {
            return invoke2((List<ParkingNest>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFH3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFH3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$D */
    /* loaded from: classes4.dex */
    public static final class C3945D extends Lambda implements Function1<FH3, Unit> {
        public C3945D() {
            super(1);
        }

        /* renamed from: a */
        public final void m100815a(FH3 it) {
            JF3 jf3 = JF3.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            jf3.m100824x0(it);
            JF3.this.m100844n0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FH3 fh3) {
            m100815a(fh3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$E */
    /* loaded from: classes4.dex */
    public static final class C3946E extends Lambda implements Function1<InterfaceC40099e13, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f17129g;

        /* renamed from: h */
        public final /* synthetic */ boolean f17130h;

        /* renamed from: i */
        public final /* synthetic */ Integer f17131i;

        /* renamed from: j */
        public final /* synthetic */ boolean f17132j;

        /* renamed from: k */
        public final /* synthetic */ JF3 f17133k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3946E(WireBird wireBird, boolean z, Integer num, boolean z2, JF3 jf3) {
            super(1);
            this.f17129g = wireBird;
            this.f17130h = z;
            this.f17131i = num;
            this.f17132j = z2;
            this.f17133k = jf3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC40099e13 navigator) {
            WirePhysicalLock wirePhysicalLock;
            List<WirePhysicalLock> physicalLocks;
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            WireBird wireBird = this.f17129g;
            Boolean bool = null;
            if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                wirePhysicalLock = (WirePhysicalLock) firstOrNull;
            } else {
                wirePhysicalLock = null;
            }
            boolean z = this.f17130h;
            Integer num = this.f17131i;
            boolean z2 = this.f17132j;
            WireBird wireBird2 = this.f17129g;
            if (wireBird2 != null) {
                bool = Boolean.valueOf(WireBirdKt.isCruiserModel(wireBird2));
            }
            Boolean valueOf = Boolean.valueOf(InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(navigator, wirePhysicalLock, z, num, null, z2, bool, 8, null));
            JF3 jf3 = this.f17133k;
            boolean z3 = this.f17130h;
            if (valueOf.booleanValue()) {
                jf3.m100864Y().onNext(Boolean.valueOf(!z3));
            }
            return valueOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$F */
    /* loaded from: classes4.dex */
    public static final class C3947F extends Lambda implements Function1<InterfaceC40099e13, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ItemLease f17134g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3947F(ItemLease itemLease) {
            super(1);
            this.f17134g = itemLease;
        }

        /* renamed from: a */
        public final void m100813a(InterfaceC40099e13 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            ItemLease itemLease = this.f17134g;
            Intrinsics.checkNotNull(itemLease);
            navigator.mo36979n0(itemLease, "end_ride", 10086);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100813a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$G */
    /* loaded from: classes4.dex */
    public static final class C3948G extends Lambda implements Function1<InterfaceC40099e13, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f17135g;

        /* renamed from: h */
        public final /* synthetic */ ItemLease f17136h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3948G(WireBird wireBird, ItemLease itemLease) {
            super(1);
            this.f17135g = wireBird;
            this.f17136h = itemLease;
        }

        /* renamed from: a */
        public final void m100812a(InterfaceC40099e13 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            WireBird wireBird = this.f17135g;
            Intrinsics.checkNotNull(wireBird);
            ItemLease itemLease = this.f17136h;
            Intrinsics.checkNotNull(itemLease);
            navigator.mo36926w(wireBird, itemLease, 10086);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100812a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$H */
    /* loaded from: classes4.dex */
    public static final class C3949H extends Lambda implements Function1<InterfaceC40099e13, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WirePhysicalLock f17137g;

        /* renamed from: h */
        public final /* synthetic */ Integer f17138h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3949H(WirePhysicalLock wirePhysicalLock, Integer num) {
            super(1);
            this.f17137g = wirePhysicalLock;
            this.f17138h = num;
        }

        /* renamed from: a */
        public final void m100811a(InterfaceC40099e13 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo37048b3(this.f17137g, true, this.f17138h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100811a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "b", "()Lco/bird/android/model/wire/WirePhysicalLock;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$showPhysicalLockTutorialIfNeeded$eb100Lock$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n288#2,2:1467\n1#3:1469\n*S KotlinDebug\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$showPhysicalLockTutorialIfNeeded$eb100Lock$2\n*L\n1041#1:1467,2\n*E\n"})
    /* renamed from: JF3$I */
    /* loaded from: classes4.dex */
    public static final class C3950I extends Lambda implements Function0<WirePhysicalLock> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f17139g;

        /* renamed from: h */
        public final /* synthetic */ Lazy<Boolean> f17140h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3950I(WireBird wireBird, Lazy<Boolean> lazy) {
            super(0);
            this.f17139g = wireBird;
            this.f17140h = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final WirePhysicalLock invoke() {
            List<WirePhysicalLock> physicalLocks;
            Object obj;
            WireBird wireBird = this.f17139g;
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
            if (wirePhysicalLock == null || !JF3.m100887I0(this.f17140h)) {
                return null;
            }
            return wirePhysicalLock;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$showPhysicalLockTutorialIfNeeded$hasLeaseOrNotRequired$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"})
    /* renamed from: JF3$J */
    /* loaded from: classes4.dex */
    public static final class C3951J extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f17141g;

        /* renamed from: h */
        public final /* synthetic */ JF3 f17142h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3951J(WireBird wireBird, JF3 jf3) {
            super(0);
            this.f17141g = wireBird;
            this.f17142h = jf3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            WireBird wireBird = this.f17141g;
            boolean z = false;
            if (wireBird != null) {
                JF3 jf3 = this.f17142h;
                InterfaceC34441Mc2 interfaceC34441Mc2 = jf3.f17110o;
                ItemLeaseType itemLeaseType = ItemLeaseType.HELMET;
                if (!(!interfaceC34441Mc2.mo55655t(wireBird, itemLeaseType) || jf3.f17110o.mo55666l(wireBird, itemLeaseType))) {
                    z = true;
                }
            }
            return Boolean.valueOf(!z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$K */
    /* loaded from: classes4.dex */
    public static final class C3952K extends Lambda implements Function1<InterfaceC40099e13, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ WirePhysicalLock f17144h;

        /* renamed from: i */
        public final /* synthetic */ boolean f17145i;

        /* renamed from: j */
        public final /* synthetic */ WireBird f17146j;

        /* renamed from: k */
        public final /* synthetic */ Integer f17147k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3952K(WirePhysicalLock wirePhysicalLock, boolean z, WireBird wireBird, Integer num) {
            super(1);
            this.f17144h = wirePhysicalLock;
            this.f17145i = z;
            this.f17146j = wireBird;
            this.f17147k = num;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC40099e13 navigator) {
            String str;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC44791lw0 interfaceC44791lw0 = JF3.this.f17106k;
            ConfigurableTutorialContext tutorialContext = this.f17144h.toTutorialContext(this.f17145i);
            WireBird wireBird = this.f17146j;
            if (wireBird != null) {
                str = wireBird.getModel();
            } else {
                str = null;
            }
            return Boolean.valueOf(InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(interfaceC44791lw0, navigator, tutorialContext, str, false, this.f17147k, false, 32, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0015\u0010\u0014\u001a\u00028\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000\"\b\b\u0005\u0010\u0006*\u00020\u0000\"\b\b\u0006\u0010\u0007*\u00020\u0000\"\b\b\u0007\u0010\b*\u00020\u0000\"\b\b\b\u0010\t*\u00020\u0000\"\b\b\t\u0010\n*\u00020\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00022\u0006\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u000f\u001a\u00028\u00042\u0006\u0010\u0010\u001a\u00028\u00052\u0006\u0010\u0011\u001a\u00028\u00062\u0006\u0010\u0012\u001a\u00028\u00072\u0006\u0010\u0013\u001a\u00028\bH\n¢\u0006\u0004\b\u0014\u0010\u0015"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "R", "t1", "t2", "t3", "t4", "t5", "t6", "t7", "t8", "t9", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$10\n+ 2 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl\n*L\n1#1,304:1\n1157#2,7:305\n*E\n"})
    /* renamed from: JF3$L */
    /* loaded from: classes4.dex */
    public static final class C3953L<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements InterfaceC23491n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {
        public C3953L() {
        }

        @Override // io.reactivex.functions.InterfaceC23491n
        /* renamed from: a */
        public final R mo33004a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
            String str;
            boolean z;
            WireRide ride;
            boolean booleanValue = ((Boolean) t9).booleanValue();
            RiderAreaState riderAreaState = (RiderAreaState) t8;
            ((Boolean) t7).booleanValue();
            ((Boolean) t6).booleanValue();
            ((Number) t5).intValue();
            ((Boolean) t4).booleanValue();
            ((Boolean) t3).booleanValue();
            ((Boolean) t2).booleanValue();
            ((Boolean) t1).booleanValue();
            RideState m59035e = JF3.this.f17102g.mo75057R().m73665a().m59035e();
            if (m59035e != null && (ride = m59035e.getRide()) != null) {
                str = ride.getId();
            } else {
                str = null;
            }
            if (!JF3.this.m100884K(new C3968g(str, JF3.this.f17096a.m82623f8().m73665a(), riderAreaState)) && !booleanValue) {
                z = false;
            } else {
                z = true;
            }
            return (R) new Triple(Boolean.valueOf(z), riderAreaState, str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$tryToPark$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"})
    /* renamed from: JF3$M */
    /* loaded from: classes4.dex */
    public static final class C3954M extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f17149g;

        /* renamed from: h */
        public final /* synthetic */ QM4 f17150h;

        /* renamed from: i */
        public final /* synthetic */ ParkingLocationVerificationMethod f17151i;

        /* renamed from: j */
        public final /* synthetic */ JF3 f17152j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC40692f13 f17153k;

        /* renamed from: l */
        public final /* synthetic */ Config f17154l;

        /* renamed from: m */
        public final /* synthetic */ FH3 f17155m;

        /* renamed from: n */
        public final /* synthetic */ FU4 f17156n;

        /* renamed from: o */
        public final /* synthetic */ ScopeProvider f17157o;

        /* renamed from: p */
        public final /* synthetic */ boolean f17158p;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: JF3$M$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C3955a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ParkingLocationVerificationMethod.values().length];
                try {
                    iArr[ParkingLocationVerificationMethod.GOOGLE_VPS_V2.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ParkingLocationVerificationMethod.GOOGLE_VPS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/ParkingNest;", "nest", "", C17296a.f69688o, "(Lco/bird/android/model/ParkingNest;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JF3$M$b */
        /* loaded from: classes4.dex */
        public static final class C3956b extends Lambda implements Function1<ParkingNest, Boolean> {

            /* renamed from: g */
            public static final C3956b f17159g = new C3956b();

            public C3956b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(ParkingNest nest) {
                boolean z;
                Intrinsics.checkNotNullParameter(nest, "nest");
                Integer availableParkingCapacity = nest.getAvailableParkingCapacity();
                if (availableParkingCapacity == null || availableParkingCapacity.intValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3954M(WireRide wireRide, QM4 qm4, ParkingLocationVerificationMethod parkingLocationVerificationMethod, JF3 jf3, InterfaceC40692f13 interfaceC40692f13, Config config, FH3 fh3, FU4 fu4, ScopeProvider scopeProvider, boolean z) {
            super(1);
            this.f17149g = wireRide;
            this.f17150h = qm4;
            this.f17151i = parkingLocationVerificationMethod;
            this.f17152j = jf3;
            this.f17153k = interfaceC40692f13;
            this.f17154l = config;
            this.f17155m = fh3;
            this.f17156n = fu4;
            this.f17157o = scopeProvider;
            this.f17158p = z;
        }

        /* renamed from: a */
        public final void m100808a(DialogResponse dialogResponse) {
            ParkingNest m64762e;
            WireLocation location;
            Location fromLocation;
            Object firstOrNull;
            int i;
            C49570tz6 c49570tz6;
            Integer num;
            EnumC41529gR4 enumC41529gR4;
            boolean z;
            WireRide wireRide = this.f17149g;
            if (wireRide != null) {
                FH3 fh3 = this.f17155m;
                JF3 jf3 = this.f17152j;
                QM4 qm4 = this.f17150h;
                if (fh3 instanceof C49570tz6) {
                    c49570tz6 = (C49570tz6) fh3;
                } else {
                    c49570tz6 = null;
                }
                if (c49570tz6 != null) {
                    num = c49570tz6.m11120g();
                } else {
                    num = null;
                }
                InterfaceC1880Ea interfaceC1880Ea = jf3.f17101f;
                if (num != null) {
                    num.intValue();
                    enumC41529gR4 = EnumC41529gR4.NO_PARKING;
                    enumC41529gR4.mo39468a(num);
                } else {
                    enumC41529gR4 = EnumC41529gR4.NO_PARKING;
                }
                boolean m88637b = qm4.m88637b();
                if (dialogResponse == DialogResponse.OTHER) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1880Ea.mo55905y(jf3.m100881L0(wireRide, enumC41529gR4, m88637b, z));
                jf3.mo21507b(wireRide, "client_issue_displayed", "no_parking");
            }
            if (dialogResponse == DialogResponse.OTHER) {
                QM4 qm42 = this.f17150h;
                if (qm42 instanceof RM4) {
                    ParkingLocationVerificationMethod parkingLocationVerificationMethod = this.f17151i;
                    if (parkingLocationVerificationMethod == null) {
                        i = -1;
                    } else {
                        i = C3955a.$EnumSwitchMapping$0[parkingLocationVerificationMethod.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            JF3 jf32 = this.f17152j;
                            InterfaceC40692f13 interfaceC40692f13 = this.f17153k;
                            Config config = this.f17154l;
                            WireRide wireRide2 = this.f17149g;
                            Intrinsics.checkNotNull(wireRide2);
                            jf32.m100834s0(interfaceC40692f13, config, wireRide2, true);
                            return;
                        }
                        JF3 jf33 = this.f17152j;
                        InterfaceC40692f13 interfaceC40692f132 = this.f17153k;
                        Config config2 = this.f17154l;
                        WireRide wireRide3 = this.f17149g;
                        Intrinsics.checkNotNull(wireRide3);
                        jf33.m100834s0(interfaceC40692f132, config2, wireRide3, true);
                        return;
                    }
                    JF3 jf34 = this.f17152j;
                    InterfaceC40692f13 interfaceC40692f133 = this.f17153k;
                    Config config3 = this.f17154l;
                    WireRide wireRide4 = this.f17149g;
                    Intrinsics.checkNotNull(wireRide4);
                    jf34.m100830u0(interfaceC40692f133, config3, wireRide4, true);
                } else if (qm42 instanceof TZ1) {
                    C38435bF0 mo11124c = this.f17155m.mo11124c();
                    if (mo11124c != null && (m64762e = mo11124c.m64762e()) != null && (location = m64762e.getLocation()) != null && (fromLocation = location.fromLocation()) != null) {
                        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) C46173oG3.m21417b(this.f17152j.f17100e.mo64006V().m73665a(), fromLocation, C3956b.f17159g, 1));
                        ParkingNest parkingNest = (ParkingNest) firstOrNull;
                        if (parkingNest == null) {
                            return;
                        }
                        Location m73665a = this.f17152j.f17099d.mo43616p().m73665a();
                        this.f17152j.f17100e.mo64015G(new ParkingNestData(parkingNest, C37429Yw2.f47648a.m73969b(m73665a.getLatitude(), m73665a.getLongitude(), parkingNest.getLocation().getLatitude(), parkingNest.getLocation().getLongitude())));
                        FU4.C2316a.zoomTo$default(this.f17156n, parkingNest.getLocation().fromLocation(), null, 2, null);
                    }
                } else {
                    this.f17152j.m100842o0(this.f17156n, this.f17153k, this.f17157o, this.f17149g, this.f17158p, false);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m100808a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$N */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C3957N extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3957N f17160b = new C3957N();

        public C3957N() {
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

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$tryToPark$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"})
    /* renamed from: JF3$O */
    /* loaded from: classes4.dex */
    public static final class C3958O extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f17161g;

        /* renamed from: h */
        public final /* synthetic */ JF3 f17162h;

        /* renamed from: i */
        public final /* synthetic */ Integer f17163i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3958O(WireRide wireRide, JF3 jf3, Integer num) {
            super(0);
            this.f17161g = wireRide;
            this.f17162h = jf3;
            this.f17163i = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EnumC41529gR4 enumC41529gR4;
            WireRide wireRide = this.f17161g;
            if (wireRide != null) {
                JF3 jf3 = this.f17162h;
                Integer num = this.f17163i;
                InterfaceC1880Ea interfaceC1880Ea = jf3.f17101f;
                if (num != null) {
                    num.intValue();
                    enumC41529gR4 = EnumC41529gR4.NO_PARKING;
                    enumC41529gR4.mo39468a(num);
                } else {
                    enumC41529gR4 = EnumC41529gR4.NO_PARKING;
                }
                interfaceC1880Ea.mo55905y(jf3.m100881L0(wireRide, enumC41529gR4, true, false));
                jf3.mo21507b(wireRide, "client_issue_displayed", "no_parking");
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$tryToPark$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"})
    /* renamed from: JF3$P */
    /* loaded from: classes4.dex */
    public static final class C3959P extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ FU4 f17165h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40692f13 f17166i;

        /* renamed from: j */
        public final /* synthetic */ ScopeProvider f17167j;

        /* renamed from: k */
        public final /* synthetic */ WireRide f17168k;

        /* renamed from: l */
        public final /* synthetic */ boolean f17169l;

        /* renamed from: m */
        public final /* synthetic */ Integer f17170m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3959P(FU4 fu4, InterfaceC40692f13 interfaceC40692f13, ScopeProvider scopeProvider, WireRide wireRide, boolean z, Integer num) {
            super(0);
            this.f17165h = fu4;
            this.f17166i = interfaceC40692f13;
            this.f17167j = scopeProvider;
            this.f17168k = wireRide;
            this.f17169l = z;
            this.f17170m = num;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EnumC41529gR4 enumC41529gR4;
            JF3.this.m100842o0(this.f17165h, this.f17166i, this.f17167j, this.f17168k, this.f17169l, false);
            WireRide wireRide = this.f17168k;
            if (wireRide != null) {
                JF3 jf3 = JF3.this;
                Integer num = this.f17170m;
                InterfaceC1880Ea interfaceC1880Ea = jf3.f17101f;
                if (num != null) {
                    int intValue = num.intValue();
                    enumC41529gR4 = EnumC41529gR4.NO_PARKING;
                    enumC41529gR4.mo39468a(Integer.valueOf(intValue));
                } else {
                    enumC41529gR4 = EnumC41529gR4.NO_PARKING;
                }
                interfaceC1880Ea.mo55905y(jf3.m100881L0(wireRide, enumC41529gR4, true, true));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$tryToPark$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"})
    /* renamed from: JF3$Q */
    /* loaded from: classes4.dex */
    public static final class C3960Q extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f17171g;

        /* renamed from: h */
        public final /* synthetic */ JF3 f17172h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3960Q(WireRide wireRide, JF3 jf3) {
            super(0);
            this.f17171g = wireRide;
            this.f17172h = jf3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WireRide wireRide = this.f17171g;
            if (wireRide != null) {
                JF3 jf3 = this.f17172h;
                jf3.f17101f.mo55905y(jf3.m100881L0(wireRide, EnumC41529gR4.NO_PARKING, false, false));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$tryToPark$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1#2:1467\n*E\n"})
    /* renamed from: JF3$R */
    /* loaded from: classes4.dex */
    public static final class C3961R extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f17173g;

        /* renamed from: h */
        public final /* synthetic */ JF3 f17174h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3961R(WireRide wireRide, JF3 jf3) {
            super(0);
            this.f17173g = wireRide;
            this.f17174h = jf3;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WireRide wireRide = this.f17173g;
            if (wireRide != null) {
                JF3 jf3 = this.f17174h;
                jf3.f17101f.mo55905y(jf3.m100881L0(wireRide, EnumC41529gR4.NO_PARKING, false, false));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072V\u0010\u0006\u001aR\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001 \u0005*(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/LocationAreaState;", "LbF0;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1466:1\n1179#2,2:1467\n1253#2,4:1469\n*S KotlinDebug\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$1\n*L\n165#1:1467,2\n165#1:1469,4\n*E\n"})
    /* renamed from: JF3$a */
    /* loaded from: classes4.dex */
    public static final class C3962a extends Lambda implements Function1<Pair<? extends Map<String, ? extends LocationAreaState>, ? extends Map<String, ? extends C38435bF0>>, Unit> {
        public C3962a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Map<String, ? extends LocationAreaState>, ? extends Map<String, ? extends C38435bF0>> pair) {
            invoke2((Pair<? extends Map<String, LocationAreaState>, ? extends Map<String, C38435bF0>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Map<String, LocationAreaState>, ? extends Map<String, C38435bF0>> pair) {
            int collectionSizeOrDefault;
            int mapCapacity;
            int coerceAtLeast;
            RiderAreaState riderAreaState;
            Map<String, LocationAreaState> component1 = pair.component1();
            Map<String, C38435bF0> component2 = pair.component2();
            C37791a94 c37791a94 = JF3.this.f17115t;
            List<RideState> rideStates = JF3.this.f17102g.mo75032o0().m73665a().getRideStates();
            JF3 jf3 = JF3.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(rideStates, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (RideState rideState : rideStates) {
                String id = rideState.getRide().getId();
                Config rideConfig = rideState.getRideConfig();
                LocationAreaState locationAreaState = component1.get(rideState.getRide().getId());
                if (locationAreaState == null || (riderAreaState = locationAreaState.toRiderAreaState()) == null) {
                    riderAreaState = UNKNOWN_AREA.INSTANCE;
                }
                Pair m28425to = TuplesKt.m28425to(rideState.getRide().getId(), jf3.m100883K0(new C3968g(id, rideConfig, riderAreaState), rideState, component2));
                linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
            }
            c37791a94.accept(linkedHashMap);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$b */
    /* loaded from: classes4.dex */
    public static final class C3963b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3963b f17176g = new C3963b();

        public C3963b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "CRITICAL error in ParkingManagerImpl init observable stream computing parking statuses by ride!!", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/RideStates;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$c */
    /* loaded from: classes4.dex */
    public static final class C3964c extends Lambda implements Function1<Unit, RideStates> {
        public C3964c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RideStates invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return JF3.this.f17102g.mo75032o0().m73665a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "rideStates", "", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nParkingManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1466:1\n1179#2,2:1467\n1253#2,2:1469\n1256#2:1472\n1#3:1471\n*S KotlinDebug\n*F\n+ 1 ParkingManagerImpl.kt\nco/bird/android/manager/ride/ParkingManagerImpl$4\n*L\n188#1:1467,2\n188#1:1469,2\n188#1:1472\n*E\n"})
    /* renamed from: JF3$d */
    /* loaded from: classes4.dex */
    public static final class C3965d extends Lambda implements Function1<RideStates, Unit> {
        public C3965d() {
            super(1);
        }

        /* renamed from: a */
        public final void m100805a(RideStates rideStates) {
            int collectionSizeOrDefault;
            int mapCapacity;
            int coerceAtLeast;
            Pair m28425to;
            WireLocation mo78581a;
            Location fromLocation;
            C37791a94 c37791a94 = JF3.this.f17118w;
            List<RideState> rideStates2 = rideStates.getRideStates();
            JF3 jf3 = JF3.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(rideStates2, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (RideState rideState : rideStates2) {
                WireBird bird = rideState.getRide().getBird();
                if (bird == null || (mo78581a = jf3.f17103h.mo78581a(bird)) == null || (fromLocation = mo78581a.fromLocation()) == null || (m28425to = TuplesKt.m28425to(fromLocation, ParkingLocationSource.VEHICLE)) == null) {
                    m28425to = TuplesKt.m28425to(jf3.f17099d.mo43616p().m73665a(), ParkingLocationSource.USER);
                }
                Pair m28425to2 = TuplesKt.m28425to(rideState.getRide().getId(), jf3.m100876O((Location) m28425to.component1(), jf3.f17100e.mo64006V().m73665a(), rideState.getRideConfig(), (ParkingLocationSource) m28425to.component2()));
                linkedHashMap.put(m28425to2.getFirst(), m28425to2.getSecond());
            }
            c37791a94.accept(linkedHashMap);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStates rideStates) {
            m100805a(rideStates);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$e */
    /* loaded from: classes4.dex */
    public static final class C3966e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3966e f17179g = new C3966e();

        public C3966e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "CRITICAL error in parking nest refresh request stream!!", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LJF3$f;", "", "", "PROFILE_TRACE_THROTTLE_MILLIS", "I", "<init>", "()V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: JF3$f */
    /* loaded from: classes4.dex */
    public static final class C3967f {
        public /* synthetic */ C3967f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3967f() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J)\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010#\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010$\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010(\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b)\u0010\u0011R\u0017\u0010+\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010,\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010-\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0012\u0010\u001d¨\u00060"}, m28432d2 = {"LJF3$g;", "", "", "rideId", "Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/RiderAreaState;", "riderAreaState", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "b", "Lco/bird/android/model/wire/configs/Config;", "getConfig", "()Lco/bird/android/model/wire/configs/Config;", "c", "Lco/bird/android/model/RiderAreaState;", "l", "()Lco/bird/android/model/RiderAreaState;", DateTokenConverter.CONVERTER_KEY, "Z", "h", "()Z", "mustParkInNest", "e", "g", "enforceNoParkingV0", "f", "enableOutsideServiceAreaParkingTicket", "enableOutsideServiceAreaParkingTicketAcceptFine", "I", "i", "()I", "outsideServiceAreaParkingTicketAmount", "j", "rideCurrency", "enableCloseToNestParking", "enableNoParkZoneNoEndRideButton", "allowLockInNoParking", "<init>", "(Ljava/lang/String;Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/RiderAreaState;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: JF3$g */
    /* loaded from: classes4.dex */
    public static final class C3968g {

        /* renamed from: a */
        public final String f17180a;

        /* renamed from: b */
        public final Config f17181b;

        /* renamed from: c */
        public final RiderAreaState f17182c;

        /* renamed from: d */
        public final boolean f17183d;

        /* renamed from: e */
        public final boolean f17184e;

        /* renamed from: f */
        public final boolean f17185f;

        /* renamed from: g */
        public final boolean f17186g;

        /* renamed from: h */
        public final int f17187h;

        /* renamed from: i */
        public final String f17188i;

        /* renamed from: j */
        public final boolean f17189j;

        /* renamed from: k */
        public final boolean f17190k;

        /* renamed from: l */
        public final boolean f17191l;

        public C3968g(String str, Config config, RiderAreaState riderAreaState) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(riderAreaState, "riderAreaState");
            this.f17180a = str;
            this.f17181b = config;
            this.f17182c = riderAreaState;
            this.f17183d = config.getRideConfig().getMustParkInNest();
            this.f17184e = config.getEnforceNoParkingV0();
            this.f17185f = config.getRideConfig().getEnableOutsideServiceAreaParkingTicket();
            this.f17186g = config.getRideConfig().getEnableOutsideServiceAreaParkingTicketAcceptFine();
            this.f17187h = config.getRideConfig().getOutsideServiceAreaParkingTicketAmount();
            this.f17188i = config.getRideConfig().getCurrency();
            this.f17189j = config.getParkingConfig().getEnableCloseToNestParking();
            this.f17190k = config.getParkingConfig().getEnableNoParkZoneNoEndRideButton();
            this.f17191l = config.getParkingConfig().getAllowLockInNoParking();
        }

        public static /* synthetic */ C3968g copy$default(C3968g c3968g, String str, Config config, RiderAreaState riderAreaState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c3968g.f17180a;
            }
            if ((i & 2) != 0) {
                config = c3968g.f17181b;
            }
            if ((i & 4) != 0) {
                riderAreaState = c3968g.f17182c;
            }
            return c3968g.m100804a(str, config, riderAreaState);
        }

        /* renamed from: a */
        public final C3968g m100804a(String str, Config config, RiderAreaState riderAreaState) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(riderAreaState, "riderAreaState");
            return new C3968g(str, config, riderAreaState);
        }

        /* renamed from: b */
        public final boolean m100803b() {
            return this.f17191l;
        }

        /* renamed from: c */
        public final boolean m100802c() {
            return this.f17189j;
        }

        /* renamed from: d */
        public final boolean m100801d() {
            return this.f17190k;
        }

        /* renamed from: e */
        public final boolean m100800e() {
            return this.f17185f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3968g) {
                C3968g c3968g = (C3968g) obj;
                return Intrinsics.areEqual(this.f17180a, c3968g.f17180a) && Intrinsics.areEqual(this.f17181b, c3968g.f17181b) && Intrinsics.areEqual(this.f17182c, c3968g.f17182c);
            }
            return false;
        }

        /* renamed from: f */
        public final boolean m100799f() {
            return this.f17186g;
        }

        /* renamed from: g */
        public final boolean m100798g() {
            return this.f17184e;
        }

        /* renamed from: h */
        public final boolean m100797h() {
            return this.f17183d;
        }

        public int hashCode() {
            String str = this.f17180a;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.f17181b.hashCode()) * 31) + this.f17182c.hashCode();
        }

        /* renamed from: i */
        public final int m100796i() {
            return this.f17187h;
        }

        /* renamed from: j */
        public final String m100795j() {
            return this.f17188i;
        }

        /* renamed from: k */
        public final String m100794k() {
            return this.f17180a;
        }

        /* renamed from: l */
        public final RiderAreaState m100793l() {
            return this.f17182c;
        }

        public String toString() {
            String str = this.f17180a;
            Config config = this.f17181b;
            RiderAreaState riderAreaState = this.f17182c;
            return "ParkingState(rideId=" + str + ", config=" + config + ", riderAreaState=" + riderAreaState + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/CompleteRideResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$h */
    /* loaded from: classes4.dex */
    public static final class C3969h extends Lambda implements Function1<CompleteRideResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f17192g;

        /* renamed from: h */
        public final /* synthetic */ FU4 f17193h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f17194i;

        /* renamed from: j */
        public final /* synthetic */ boolean f17195j;

        /* renamed from: k */
        public final /* synthetic */ JF3 f17196k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC40692f13 f17197l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3969h(WireRide wireRide, FU4 fu4, DateTime dateTime, boolean z, JF3 jf3, InterfaceC40692f13 interfaceC40692f13) {
            super(1);
            this.f17192g = wireRide;
            this.f17193h = fu4;
            this.f17194i = dateTime;
            this.f17195j = z;
            this.f17196k = jf3;
            this.f17197l = interfaceC40692f13;
        }

        /* renamed from: a */
        public final void m100792a(CompleteRideResponse it) {
            String id = this.f17192g.getId();
            C41318g46.m40163a("completeRide API succeeded for " + id, new Object[0]);
            FU4 fu4 = this.f17193h;
            WireRide wireRide = this.f17192g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            DateTime operationStart = this.f17194i;
            Intrinsics.checkNotNullExpressionValue(operationStart, "operationStart");
            fu4.mo34938m1(wireRide, it, operationStart, this.f17195j);
            this.f17196k.f17099d.mo43631a();
            this.f17197l.mo34984i();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CompleteRideResponse completeRideResponse) {
            m100792a(completeRideResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$i */
    /* loaded from: classes4.dex */
    public static final class C3970i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f17198g;

        /* renamed from: h */
        public final /* synthetic */ FU4 f17199h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f17200i;

        /* renamed from: j */
        public final /* synthetic */ JF3 f17201j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC40692f13 f17202k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3970i(WireRide wireRide, FU4 fu4, DateTime dateTime, JF3 jf3, InterfaceC40692f13 interfaceC40692f13) {
            super(1);
            this.f17198g = wireRide;
            this.f17199h = fu4;
            this.f17200i = dateTime;
            this.f17201j = jf3;
            this.f17202k = interfaceC40692f13;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            String id = this.f17198g.getId();
            C41318g46.m40163a("completeRide API failed for " + id + ", see RideEndFlowError analytic event for more detail", new Object[0]);
            FU4 fu4 = this.f17199h;
            WireRide wireRide = this.f17198g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            DateTime operationStart = this.f17200i;
            Intrinsics.checkNotNullExpressionValue(operationStart, "operationStart");
            fu4.mo34916o1(wireRide, it, operationStart);
            this.f17201j.f17099d.mo43631a();
            this.f17202k.mo34984i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$j */
    /* loaded from: classes4.dex */
    public static final class C3971j extends Lambda implements Function1<InterfaceC40099e13, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f17203g;

        /* renamed from: h */
        public final /* synthetic */ JF3 f17204h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3971j(WireRide wireRide, JF3 jf3) {
            super(1);
            this.f17203g = wireRide;
            this.f17204h = jf3;
        }

        /* renamed from: a */
        public final void m100791a(InterfaceC40099e13 navigator) {
            WirePhysicalLock wirePhysicalLock;
            boolean z;
            List<WirePhysicalLock> physicalLocks;
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            WireRide wireRide = this.f17203g;
            boolean m100886J = this.f17204h.m100886J();
            WireBird bird = this.f17203g.getBird();
            if (bird != null && (physicalLocks = bird.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                wirePhysicalLock = (WirePhysicalLock) firstOrNull;
            } else {
                wirePhysicalLock = null;
            }
            if (wirePhysicalLock != null) {
                z = true;
            } else {
                z = false;
            }
            navigator.mo36962q(wireRide, 10084, m100886J, z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100791a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$k */
    /* loaded from: classes4.dex */
    public static final class C3972k extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Location f17205g;

        /* renamed from: h */
        public final /* synthetic */ ParkingNest f17206h;

        /* renamed from: i */
        public final /* synthetic */ int f17207i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3972k(Location location, ParkingNest parkingNest, int i) {
            super(0);
            this.f17205g = location;
            this.f17206h = parkingNest;
            this.f17207i = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((double) C37429Yw2.f47648a.m73967d(this.f17205g, this.f17206h.getLocation())) - this.f17206h.getRadius() <= ((double) this.f17207i));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$l */
    /* loaded from: classes4.dex */
    public static final class C3973l extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ FU4 f17208g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f17209h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f17210i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3973l(FU4 fu4, WireRide wireRide, DateTime dateTime) {
            super(1);
            this.f17208g = fu4;
            this.f17209h = wireRide;
            this.f17210i = dateTime;
        }

        /* renamed from: a */
        public final void m100790a(WireBird it) {
            FU4 fu4 = this.f17208g;
            WireRide wireRide = this.f17209h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            DateTime operationStart = this.f17210i;
            Intrinsics.checkNotNullExpressionValue(operationStart, "operationStart");
            fu4.mo34905p1(wireRide, it, operationStart);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m100790a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$m */
    /* loaded from: classes4.dex */
    public static final class C3974m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ FU4 f17211g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f17212h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f17213i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3974m(FU4 fu4, WireRide wireRide, DateTime dateTime) {
            super(1);
            this.f17211g = fu4;
            this.f17212h = wireRide;
            this.f17213i = dateTime;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            FU4 fu4 = this.f17211g;
            WireRide wireRide = this.f17212h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            DateTime operationStart = this.f17213i;
            Intrinsics.checkNotNullExpressionValue(operationStart, "operationStart");
            fu4.mo34927n1(wireRide, it, operationStart);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/NonComplianceWarning;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$n */
    /* loaded from: classes4.dex */
    public static final class C3975n extends Lambda implements Function1<HM4<NonComplianceWarning>, Unit> {

        /* renamed from: g */
        public static final C3975n f17214g = new C3975n();

        public C3975n() {
            super(1);
        }

        /* renamed from: a */
        public final void m100789a(HM4<NonComplianceWarning> hm4) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<NonComplianceWarning> hm4) {
            m100789a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$o */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C3976o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3976o f17215b = new C3976o();

        public C3976o() {
            super(1, C41318g46.class, "w", "w(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40150n(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$p */
    /* loaded from: classes4.dex */
    public static final class C3977p extends Lambda implements Function1<InterfaceC40099e13, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f17216g;

        /* renamed from: h */
        public final /* synthetic */ JF3 f17217h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3977p(WireBird wireBird, JF3 jf3) {
            super(1);
            this.f17216g = wireBird;
            this.f17217h = jf3;
        }

        /* renamed from: a */
        public final void m100788a(InterfaceC40099e13 navigator) {
            String str;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            WireBird wireBird = this.f17216g;
            WireRide m100868U = this.f17217h.m100868U();
            if (m100868U != null) {
                str = m100868U.getId();
            } else {
                str = null;
            }
            Intrinsics.checkNotNull(str);
            navigator.mo36965p2(wireBird, str, 10083);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100788a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$q */
    /* loaded from: classes4.dex */
    public static final class C3978q extends Lambda implements Function1<InterfaceC40099e13, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f17218g;

        /* renamed from: h */
        public final /* synthetic */ ItemLease f17219h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3978q(WireBird wireBird, ItemLease itemLease) {
            super(1);
            this.f17218g = wireBird;
            this.f17219h = itemLease;
        }

        /* renamed from: a */
        public final void m100787a(InterfaceC40099e13 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36926w(this.f17218g, this.f17219h, 10086);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100787a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$r */
    /* loaded from: classes4.dex */
    public static final class C3979r extends Lambda implements Function1<InterfaceC40099e13, Unit> {

        /* renamed from: g */
        public final /* synthetic */ ItemLease f17220g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3979r(ItemLease itemLease) {
            super(1);
            this.f17220g = itemLease;
        }

        /* renamed from: a */
        public final void m100786a(InterfaceC40099e13 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            navigator.mo36979n0(this.f17220g, "end_ride", 10086);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100786a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$s */
    /* loaded from: classes4.dex */
    public static final class C3980s extends Lambda implements Function1<InterfaceC40099e13, Unit> {
        public C3980s() {
            super(1);
        }

        /* renamed from: a */
        public final void m100785a(InterfaceC40099e13 navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            WireRide m100868U = JF3.this.m100868U();
            Intrinsics.checkNotNull(m100868U);
            navigator.mo36990l1(m100868U, 10089);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
            m100785a(interfaceC40099e13);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "", "", "LbF0;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$t */
    /* loaded from: classes4.dex */
    public static final class C3981t extends Lambda implements Function0<Z84<Map<String, ? extends C38435bF0>>> {
        public C3981t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<String, ? extends C38435bF0>> invoke2() {
            return Z84.f47888d.m73663b(JF3.this.f17118w);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "", "", "LFH3;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$u */
    /* loaded from: classes4.dex */
    public static final class C3982u extends Lambda implements Function0<Z84<Map<String, ? extends FH3>>> {
        public C3982u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<String, ? extends FH3>> invoke2() {
            return Z84.f47888d.m73663b(JF3.this.f17115t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$v */
    /* loaded from: classes4.dex */
    public static final class C3983v extends Lambda implements Function1<InterfaceC40099e13, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f17225h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3983v(WireRide wireRide) {
            super(1);
            this.f17225h = wireRide;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC40099e13 navigator) {
            String str;
            WireBird bird;
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            InterfaceC44791lw0 interfaceC44791lw0 = JF3.this.f17106k;
            ConfigurableTutorialContext configurableTutorialContext = ConfigurableTutorialContext.RIDE_END;
            WireRide wireRide = this.f17225h;
            if (wireRide != null && (bird = wireRide.getBird()) != null) {
                str = bird.getModel();
            } else {
                str = null;
            }
            return Boolean.valueOf(InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(interfaceC44791lw0, navigator, configurableTutorialContext, str, false, 10081, false, 40, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/wire/WireRide;", "ride", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$w */
    /* loaded from: classes4.dex */
    public static final class C3984w extends Lambda implements Function2<Config, WireRide, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ boolean f17227h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40692f13 f17228i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JF3$w$a */
        /* loaded from: classes4.dex */
        public static final class C3985a extends Lambda implements Function1<InterfaceC40099e13, Unit> {

            /* renamed from: g */
            public final /* synthetic */ WireRide f17229g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3985a(WireRide wireRide) {
                super(1);
                this.f17229g = wireRide;
            }

            /* renamed from: a */
            public final void m100782a(InterfaceC40099e13 navigator) {
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                WireBird bird = this.f17229g.getBird();
                Intrinsics.checkNotNull(bird);
                navigator.mo36965p2(bird, this.f17229g.getId(), 10083);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
                m100782a(interfaceC40099e13);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JF3$w$b */
        /* loaded from: classes4.dex */
        public static final class C3986b extends Lambda implements Function1<InterfaceC40099e13, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ JF3 f17230g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3986b(JF3 jf3) {
                super(1);
                this.f17230g = jf3;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(InterfaceC40099e13 navigator) {
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                return Boolean.valueOf(InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(this.f17230g.f17106k, navigator, ConfigurableTutorialContext.GOOGLE_AR_PARKING_RESOLUTION, null, false, 10082, false, 12, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3984w(boolean z, InterfaceC40692f13 interfaceC40692f13) {
            super(2);
            this.f17227h = z;
            this.f17228i = interfaceC40692f13;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Config config, WireRide ride) {
            String str;
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(ride, "ride");
            InterfaceC28816tm interfaceC28816tm = JF3.this.f17104i;
            if (this.f17227h) {
                str = "optional_parking_dialog";
            } else {
                str = "mandatory";
            }
            interfaceC28816tm.mo8191d(str);
            InterfaceC40692f13 interfaceC40692f13 = this.f17228i;
            JF3 jf3 = JF3.this;
            if (!interfaceC40692f13.mo35017f(jf3, new C3986b(jf3))) {
                this.f17228i.mo34995h(JF3.this, new C3985a(ride));
            }
            return true;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/wire/WireRide;", "ride", "", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireRide;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$x */
    /* loaded from: classes4.dex */
    public static final class C3987x extends Lambda implements Function2<Config, WireRide, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ boolean f17232h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC40692f13 f17233i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JF3$x$a */
        /* loaded from: classes4.dex */
        public static final class C3988a extends Lambda implements Function1<InterfaceC40099e13, Unit> {

            /* renamed from: g */
            public final /* synthetic */ JF3 f17234g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3988a(JF3 jf3) {
                super(1);
                this.f17234g = jf3;
            }

            /* renamed from: a */
            public final void m100779a(InterfaceC40099e13 navigator) {
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                WireRide m100868U = this.f17234g.m100868U();
                Intrinsics.checkNotNull(m100868U);
                navigator.mo36990l1(m100868U, 10089);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40099e13 interfaceC40099e13) {
                m100779a(interfaceC40099e13);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Le13;", "navigator", "", C17296a.f69688o, "(Le13;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JF3$x$b */
        /* loaded from: classes4.dex */
        public static final class C3989b extends Lambda implements Function1<InterfaceC40099e13, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ JF3 f17235g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3989b(JF3 jf3) {
                super(1);
                this.f17235g = jf3;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(InterfaceC40099e13 navigator) {
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                return Boolean.valueOf(InterfaceC44791lw0.C25816a.maybeGoToConfigurableTutorials$default(this.f17235g.f17106k, navigator, ConfigurableTutorialContext.GOOGLE_AR_PARKING_RESOLUTION, null, false, 10088, false, 12, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3987x(boolean z, InterfaceC40692f13 interfaceC40692f13) {
            super(2);
            this.f17232h = z;
            this.f17233i = interfaceC40692f13;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Config config, WireRide ride) {
            String str;
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(ride, "ride");
            InterfaceC28816tm interfaceC28816tm = JF3.this.f17104i;
            if (this.f17232h) {
                str = "optional_parking_dialog";
            } else {
                str = "mandatory";
            }
            interfaceC28816tm.mo8191d(str);
            InterfaceC40692f13 interfaceC40692f13 = this.f17233i;
            JF3 jf3 = JF3.this;
            if (!interfaceC40692f13.mo35017f(jf3, new C3989b(jf3))) {
                InterfaceC40692f13 interfaceC40692f132 = this.f17233i;
                JF3 jf32 = JF3.this;
                interfaceC40692f132.mo34995h(jf32, new C3988a(jf32));
            }
            return true;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "key", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JF3$y */
    /* loaded from: classes4.dex */
    public static final class C3990y extends Lambda implements Function1<Location, Pair<? extends Pair<? extends Double, ? extends Double>, ? extends Float>> {

        /* renamed from: g */
        public static final C3990y f17236g = new C3990y();

        public C3990y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<Pair<Double, Double>, Float> invoke(Location key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return TuplesKt.m28425to(TuplesKt.m28425to(Double.valueOf(key.getLatitude()), Double.valueOf(key.getLongitude())), Float.valueOf(key.getAccuracy()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062 \u0010\u0005\u001a\u001c\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/ParkingNest;", "<name for destructuring parameter 0>", "LbF0;", C17296a.f69688o, "(Lkotlin/Pair;)LbF0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$z */
    /* loaded from: classes4.dex */
    public static final class C3991z extends Lambda implements Function1<Pair<? extends Location, ? extends List<? extends ParkingNest>>, C38435bF0> {
        public C3991z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C38435bF0 invoke(Pair<? extends Location, ? extends List<ParkingNest>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Location location = pair.component1();
            JF3 jf3 = JF3.this;
            Intrinsics.checkNotNullExpressionValue(location, "location");
            return jf3.m100876O(location, pair.component2(), JF3.this.f17096a.m82623f8().m73665a(), ParkingLocationSource.USER);
        }
    }

    public JF3(C36207Tq4 reactiveConfig, Context context, C22454gl appPreference, InterfaceC40001dr4 reactiveLocationManager, InterfaceC12495bn areaManager, InterfaceC1880Ea analyticsManager, YR4 rideManager, InterfaceC7807TL birdLocationManager, InterfaceC28816tm arManager, InterfaceC37014Xc1 endRideManager, InterfaceC44791lw0 configurableTutorialManager, InterfaceC52458ys0 complianceManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC10636aM birdManager, InterfaceC34441Mc2 itemLeaseManager, InterfaceC46193oI5 smartlockManager) {
        Lazy lazy;
        Map emptyMap;
        Lazy lazy2;
        Map emptyMap2;
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(birdLocationManager, "birdLocationManager");
        Intrinsics.checkNotNullParameter(arManager, "arManager");
        Intrinsics.checkNotNullParameter(endRideManager, "endRideManager");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(complianceManager, "complianceManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        this.f17096a = reactiveConfig;
        this.f17097b = context;
        this.f17098c = appPreference;
        this.f17099d = reactiveLocationManager;
        this.f17100e = areaManager;
        this.f17101f = analyticsManager;
        this.f17102g = rideManager;
        this.f17103h = birdLocationManager;
        this.f17104i = arManager;
        this.f17105j = endRideManager;
        this.f17106k = configurableTutorialManager;
        this.f17107l = complianceManager;
        this.f17108m = rideMapStateManager;
        this.f17109n = birdManager;
        this.f17110o = itemLeaseManager;
        this.f17111p = smartlockManager;
        this.f17112q = new C44617le6(null, null, null, false, 15, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C3982u());
        this.f17114s = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f17115t = C37791a94.C10586a.create$default(c10586a, emptyMap, null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C3981t());
        this.f17116u = lazy2;
        this.f17117v = new ArrayDeque<>();
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        this.f17118w = C37791a94.C10586a.create$default(c10586a, emptyMap2, null, 2, null);
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f17119x = m31902e;
        C24552a<Boolean> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Boolean>()");
        this.f17120y = m31922e;
        C24523e c24523e = C24523e.f91168a;
        Observable m31956a = c24523e.m31956a(areaManager.mo63998h(), m100865X());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable throttleLatest = m31956a.throttleLatest(250L, timeUnit, true);
        EnumC23460b enumC23460b = EnumC23460b.LATEST;
        AbstractC24490k m32190K0 = throttleLatest.toFlowable(enumC23460b).m32163Y0(C24542a.m31934a()).m32190K0(3L);
        Intrinsics.checkNotNullExpressionValue(m32190K0, "Observables.combineLates…tation())\n      .retry(3)");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m32150f = m32190K0.m32150f(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3962a c3962a = new C3962a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: pF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100896E(Function1.this, obj);
            }
        };
        final C3963b c3963b = C3963b.f17176g;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: CF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100894F(Function1.this, obj);
            }
        });
        AbstractC24490k<Unit> flowable = m31902e.toFlowable(enumC23460b);
        final C3964c c3964c = new C3964c();
        AbstractC24490k m32163Y0 = flowable.m32117q0(new InterfaceC23492o() { // from class: DF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RideStates m100892G;
                m100892G = JF3.m100892G(Function1.this, obj);
                return m100892G;
            }
        }).m32163Y0(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m32163Y0, "parkingNestRefreshReques…Schedulers.computation())");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m32150f2 = m32163Y0.m32150f(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m32150f2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3965d c3965d = new C3965d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: EF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100890H(Function1.this, obj);
            }
        };
        final C3966e c3966e = C3966e.f17179g;
        ((FlowableSubscribeProxy) m32150f2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: FF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100888I(Function1.this, obj);
            }
        });
        Observable<Location> throttleLatest2 = reactiveLocationManager.mo43616p().throttleLatest(100L, timeUnit);
        final C3990y c3990y = C3990y.f17236g;
        Observable<Location> distinctUntilChanged = throttleLatest2.distinctUntilChanged(new InterfaceC23492o() { // from class: GF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m100822y0;
                m100822y0 = JF3.m100822y0(Function1.this, obj);
                return m100822y0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveLocationManager.…ngitude to key.accuracy }");
        AbstractC24490k flowable2 = c24523e.m31956a(distinctUntilChanged, areaManager.mo64006V()).toFlowable(enumC23460b);
        final C3991z c3991z = new C3991z();
        AbstractC24490k m32117q0 = flowable2.m32117q0(new InterfaceC23492o() { // from class: HF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C38435bF0 m100820z0;
                m100820z0 = JF3.m100820z0(Function1.this, obj);
                return m100820z0;
            }
        });
        final C3941A c3941a = new C3941A();
        AbstractC24490k<C38435bF0> m33008A1 = m32117q0.m32191K(new InterfaceC23484g() { // from class: IF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100903A0(Function1.this, obj);
            }
        }).m32194I0(1).m33008A1();
        Intrinsics.checkNotNullExpressionValue(m33008A1, "Observables.combineLates…replay(1)\n    .refCount()");
        this.f17121z = m33008A1;
        this.f17094A = new AtomicBoolean(false);
        Observable<Boolean> m82898E8 = reactiveConfig.m82898E8();
        Observable<Boolean> m82667b8 = reactiveConfig.m82667b8();
        Observable<Boolean> m82850J6 = reactiveConfig.m82850J6();
        Observable<Boolean> m82830L6 = reactiveConfig.m82830L6();
        Observable<Integer> m82818M8 = reactiveConfig.m82818M8();
        Observable<Boolean> m82853J3 = reactiveConfig.m82853J3();
        Observable<Boolean> m82517p4 = reactiveConfig.m82517p4();
        Observable<RiderAreaState> mo63999g = areaManager.mo63999g();
        Z84<List<ParkingNest>> mo64006V = areaManager.mo64006V();
        final C3942B c3942b = C3942B.f17123g;
        Observable distinctUntilChanged2 = mo64006V.map(new InterfaceC23492o() { // from class: qF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m100901B0;
                m100901B0 = JF3.m100901B0(Function1.this, obj);
                return m100901B0;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "areaManager.parkingNests… }.distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(m82898E8, m82667b8, m82850J6, m82830L6, m82818M8, m82853J3, m82517p4, mo63999g, distinctUntilChanged2, new C3953L());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…4, t5, t6, t7, t8, t9) })");
        AbstractC24490k flowable3 = combineLatest.distinctUntilChanged().toFlowable(enumC23460b);
        final C3943C c3943c = new C3943C();
        AbstractC24490k m32203E = flowable3.m32157b1(new InterfaceC23492o() { // from class: rF3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m100899C0;
                m100899C0 = JF3.m100899C0(Function1.this, obj);
                return m100899C0;
            }
        }).m32203E(new InterfaceC23478a() { // from class: AF3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                JF3.m100897D0(JF3.this);
            }
        });
        final C3945D c3945d = new C3945D();
        Observable<FH3> m32084i = m32203E.m32191K(new InterfaceC23484g() { // from class: BF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100895E0(Function1.this, obj);
            }
        }).m32113r1().replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "Observables.combineLates…replay(1)\n    .refCount()");
        this.f17095B = m32084i;
    }

    /* renamed from: A0 */
    public static final void m100903A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final Boolean m100901B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final InterfaceC45761na4 m100899C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m100897D0(JF3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m100844n0();
    }

    /* renamed from: E */
    public static final void m100896E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m100895E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m100894F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final RideStates m100892G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RideStates) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m100890H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m100888I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final boolean m100887I0(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    /* renamed from: J0 */
    public static final WirePhysicalLock m100885J0(Lazy<WirePhysicalLock> lazy) {
        return lazy.getValue();
    }

    /* renamed from: L */
    public static final void m100882L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m100880M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final void m100875O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m100873P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static /* synthetic */ void m100871R(JF3 jf3, FU4 fu4, InterfaceC40692f13 interfaceC40692f13, ScopeProvider scopeProvider, WireRide wireRide, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        jf3.m100872Q(fu4, interfaceC40692f13, scopeProvider, wireRide, z);
    }

    /* renamed from: T */
    public static final boolean m100869T(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }

    public static /* synthetic */ void completeRide$ride_release$default(JF3 jf3, FU4 fu4, InterfaceC40692f13 interfaceC40692f13, ScopeProvider scopeProvider, WireRide wireRide, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        jf3.m100878N(fu4, interfaceC40692f13, scopeProvider, wireRide, z);
    }

    /* renamed from: f0 */
    public static final void m100857f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m100856g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getPhysicalLockSubject$ride_release$annotations() {
    }

    /* renamed from: j0 */
    public static final void m100852j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m100850k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static /* synthetic */ boolean m100832t0(JF3 jf3, InterfaceC40692f13 interfaceC40692f13, Config config, WireRide wireRide, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return jf3.m100834s0(interfaceC40692f13, config, wireRide, z);
    }

    /* renamed from: v0 */
    public static /* synthetic */ boolean m100828v0(JF3 jf3, InterfaceC40692f13 interfaceC40692f13, Config config, WireRide wireRide, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return jf3.m100830u0(interfaceC40692f13, config, wireRide, z);
    }

    /* renamed from: y0 */
    public static final Pair m100822y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final C38435bF0 m100820z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C38435bF0) tmp0.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        if (r2.isOptional() == true) goto L41;
     */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m100893F0(InterfaceC40692f13 interfaceC40692f13, WireBird wireBird, boolean z, Integer num, boolean z2, boolean z3) {
        List<WirePhysicalLock> physicalLocks;
        Object firstOrNull;
        WirePrivateBird wirePrivateBird;
        boolean z4;
        List<WirePhysicalLock> physicalLocks2;
        boolean z5;
        boolean z6 = true;
        if (z) {
            if (wireBird != null && (physicalLocks2 = wireBird.getPhysicalLocks()) != null) {
                List<WirePhysicalLock> list = physicalLocks2;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (WirePhysicalLock wirePhysicalLock : list) {
                        if (!wirePhysicalLock.isOptional()) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                if (!z5) {
                    z4 = true;
                    if (!z4 && C36441Uq4.m80769c(this.f17096a, wireBird).getLeaseConfig().getLeaseTypes().getHelmet().getEnabled()) {
                        return false;
                    }
                }
            }
            z4 = false;
            if (!z4) {
                return false;
            }
        }
        if (!z2) {
            if (wireBird != null) {
                wirePrivateBird = wireBird.getPrivateBird();
            } else {
                wirePrivateBird = null;
            }
            if (wirePrivateBird != null) {
                this.f17120y.onNext(Boolean.FALSE);
                return m100889H0(interfaceC40692f13, wireBird, z, num, z3);
            }
        }
        if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
            WirePhysicalLock wirePhysicalLock2 = (WirePhysicalLock) firstOrNull;
            if (wirePhysicalLock2 != null) {
            }
        }
        z6 = false;
        if (z6) {
            return m100889H0(interfaceC40692f13, wireBird, z, num, z3);
        }
        return interfaceC40692f13.mo35017f(this, new C3946E(wireBird, z, num, z2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m100891G0(InterfaceC40692f13 interfaceC40692f13, WireRide wireRide) {
        WirePrivateBird wirePrivateBird;
        Object obj;
        ItemLease itemLease;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<WirePhysicalLock> physicalLocks;
        List<WirePhysicalLock> list;
        boolean z5;
        List<WirePhysicalLock> physicalLocks2;
        boolean z6;
        String str;
        boolean z7;
        Iterator<T> it = this.f17109n.mo71591R0().m73665a().iterator();
        while (true) {
            wirePrivateBird = null;
            if (it.hasNext()) {
                obj = it.next();
                WireBird wireBird = (WireBird) obj;
                WireBird bird = wireRide.getBird();
                if (bird != null && bird.isProbablySame(wireBird)) {
                    z7 = true;
                    continue;
                } else {
                    z7 = false;
                    continue;
                }
                if (z7) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        WireBird wireBird2 = (WireBird) obj;
        if (wireBird2 == null) {
            WireBird m59035e = this.f17108m.mo15902g().m73665a().m59035e();
            if (m59035e != null) {
                String id = m59035e.getId();
                WireBird bird2 = wireRide.getBird();
                if (bird2 != null) {
                    str = bird2.getId();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(id, str)) {
                    m59035e = null;
                }
                wireBird2 = m59035e;
            } else {
                wireBird2 = null;
            }
            if (wireBird2 == null) {
                wireBird2 = wireRide.getBird();
            }
        }
        WireBird wireBird3 = wireBird2;
        C41318g46.m40163a("showPhysicalLockScreenAtEndRide called and using bird=" + wireBird3 + " with birdId=" + wireRide.getBirdId(), new Object[0]);
        List<ItemLease> m73665a = this.f17110o.mo55656s().m73665a();
        StringBuilder sb = new StringBuilder();
        sb.append("active leases are currently ");
        sb.append(m73665a);
        C41318g46.m40163a(sb.toString(), new Object[0]);
        String birdId = wireRide.getBirdId();
        if (birdId != null) {
            itemLease = this.f17110o.mo55659p(birdId, ItemLeaseType.HELMET);
        } else {
            itemLease = null;
        }
        if (itemLease != null) {
            z = true;
        } else {
            z = false;
        }
        if (wireBird3 != null && (physicalLocks2 = wireBird3.getPhysicalLocks()) != null) {
            List<WirePhysicalLock> list2 = physicalLocks2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (WirePhysicalLock wirePhysicalLock : list2) {
                    if (wirePhysicalLock.isBrainBasedBluetooth()) {
                        z6 = true;
                        break;
                    }
                }
            }
            z6 = false;
            if (z6) {
                z2 = true;
                if (wireBird3 != null && (physicalLocks = wireBird3.getPhysicalLocks()) != null) {
                    list = physicalLocks;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        for (WirePhysicalLock wirePhysicalLock2 : list) {
                            if (wirePhysicalLock2.isSolebe()) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                    z5 = false;
                    if (z5) {
                        z3 = true;
                        if (!z && z2) {
                            interfaceC40692f13.mo34995h(this, new C3947F(itemLease));
                            return true;
                        } else if (!z && z3) {
                            interfaceC40692f13.mo34995h(this, new C3948G(wireBird3, itemLease));
                            return true;
                        } else {
                            if (Intrinsics.areEqual(this.f17120y.getValue(), Boolean.TRUE) || z || z2) {
                                if (wireBird3 != null) {
                                    wirePrivateBird = wireBird3.getPrivateBird();
                                }
                                if (wirePrivateBird != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (m100893F0(interfaceC40692f13, wireBird3, false, 10085, z4, true)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
                z3 = false;
                if (!z) {
                }
                if (!z) {
                }
                if (Intrinsics.areEqual(this.f17120y.getValue(), Boolean.TRUE)) {
                }
                if (wireBird3 != null) {
                }
                if (wirePrivateBird != null) {
                }
                if (m100893F0(interfaceC40692f13, wireBird3, false, 10085, z4, true)) {
                }
                return false;
            }
        }
        z2 = false;
        if (wireBird3 != null) {
            list = physicalLocks;
            if (list instanceof Collection) {
            }
            while (r5.hasNext()) {
            }
            z5 = false;
            if (z5) {
            }
        }
        z3 = false;
        if (!z) {
        }
        if (!z) {
        }
        if (Intrinsics.areEqual(this.f17120y.getValue(), Boolean.TRUE)) {
        }
        if (wireBird3 != null) {
        }
        if (wirePrivateBird != null) {
        }
        if (m100893F0(interfaceC40692f13, wireBird3, false, 10085, z4, true)) {
        }
        return false;
    }

    /* renamed from: H0 */
    public final boolean m100889H0(InterfaceC40692f13 interfaceC40692f13, WireBird wireBird, boolean z, Integer num, boolean z2) {
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
        WirePhysicalLock wirePhysicalLock;
        WireBird bird2;
        List<WirePhysicalLock> physicalLocks;
        Object firstOrNull;
        lazy = LazyKt__LazyJVMKt.lazy(new C3951J(wireBird, this));
        lazy2 = LazyKt__LazyJVMKt.lazy(new C3950I(wireBird, lazy));
        if (m100863Z()) {
            WireRide m100868U = m100868U();
            if (m100868U != null && (bird2 = m100868U.getBird()) != null && (physicalLocks = bird2.getPhysicalLocks()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                m76371b = (WirePhysicalLock) firstOrNull;
            }
            m76371b = null;
        } else {
            C37099Xl5 m59035e = this.f17111p.mo21402e().m73665a().m59035e();
            if (m59035e != null) {
                m76371b = m59035e.m76371b();
            }
            m76371b = null;
        }
        if (m76371b == null) {
            m76371b = m100885J0(lazy2);
        }
        if (m76371b != null) {
            if ((wireBird == null || (birdId = wireBird.getId()) == null) && (birdId = m76371b.getBirdId()) == null) {
                RideState m59035e2 = this.f17102g.mo75057R().m73665a().m59035e();
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
            boolean m37706M0 = this.f17098c.m37706M0(m76371b.toTutorialContext(z).toString());
            if (this.f17111p.mo21395l() > 0 && !z2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (birdId != null && this.f17110o.mo55706C(birdId, ItemLeaseType.HELMET)) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean m100887I0 = m100887I0(lazy);
            StringBuilder sb = new StringBuilder();
            sb.append("taking lock if birdId=");
            sb.append(birdId);
            sb.append(" isHelmetPurposeLock=");
            sb.append(z3);
            sb.append(" AND (!hasSeenTutorialForKind=");
            sb.append(!m37706M0);
            sb.append(" and hasLeaseOrNotRequired=");
            sb.append(m100887I0);
            sb.append(") or hasUnlockedLockAndNotEnding=");
            sb.append(z4);
            sb.append(" or hasLeaseForBirdId=");
            sb.append(z5);
            C41318g46.m40163a(sb.toString(), new Object[0]);
            if (z3 && ((!m37706M0 && m100887I0(lazy)) || z4 || z5)) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                wirePhysicalLock = m76371b;
            } else {
                wirePhysicalLock = null;
            }
            if (wirePhysicalLock != null) {
                C41318g46.m40163a("going to physical lock tutorial from showPhysicalLockTutorialIfNeeded", new Object[0]);
                if (interfaceC40692f13.mo35017f(this, new C3952K(wirePhysicalLock, z, wireBird, num))) {
                    this.f17098c.m37677T1(wirePhysicalLock.toTutorialContext(z).toString());
                    return true;
                }
                this.f17098c.m37677T1(wirePhysicalLock.toTutorialContext(z).toString());
                C41318g46.m40163a("no tutorial v2 found for lock purpose/unlock (" + wirePhysicalLock.getPurpose() + "/" + z + ") combo, falling back to legacy physical lock tutorial", new Object[0]);
                interfaceC40692f13.mo34995h(this, new C3949H(wirePhysicalLock, num));
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m100886J() {
        return this.f17102g.mo75034m0().m73665a().m59035e() != null && this.f17100e.mo63994v().getValue().m59037c() && (this.f17100e.mo64002d() instanceof IN_RESTRICTED_PARKING_AREA);
    }

    /* renamed from: K */
    public final boolean m100884K(C3968g c3968g) {
        return m100861b0(c3968g) || m100860c0(c3968g) || m100859d0(c3968g) || c3968g.m100797h();
    }

    /* renamed from: K0 */
    public final FH3 m100883K0(C3968g c3968g, RideState rideState, Map<String, C38435bF0> map) {
        C38435bF0 mo21502g;
        WireRide ride;
        String id;
        if ((rideState == null || (ride = rideState.getRide()) == null || (id = ride.getId()) == null || (mo21502g = map.get(id)) == null) && (mo21502g = mo21502g()) == null) {
            mo21502g = new C38435bF0(EnumC44987mG3.FAR, null, null, WireLocationKt.toLocation$default(this.f17099d.mo43616p().m73665a(), null, 1, null), ParkingLocationSource.USER);
        }
        C38435bF0 c38435bF0 = mo21502g;
        if (!m100884K(c3968g) && c38435bF0.m64762e() == null) {
            return new C33971Kc0(null, c3968g.m100793l(), c38435bF0, false, 1, null);
        }
        return m100874P(c38435bF0, c3968g);
    }

    /* renamed from: L0 */
    public final C52192yQ4 m100881L0(WireRide wireRide, EnumC41529gR4 enumC41529gR4, boolean z, boolean z2) {
        boolean z3;
        String str;
        Integer m39470c;
        Long l;
        RideConfig rideConfig = this.f17102g.mo75030r().m73665a().getRideConfig();
        boolean m100862a0 = m100862a0(wireRide);
        WireBird bird = wireRide.getBird();
        boolean z4 = true;
        if (bird != null && bird.getCellular()) {
            z3 = true;
        } else {
            z3 = false;
        }
        WireBird bird2 = wireRide.getBird();
        String str2 = (bird2 == null || (r2 = bird2.getModel()) == null) ? "" : "";
        String currency = wireRide.getCurrency();
        long distance = (long) wireRide.getDistance();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long minutePrice = rideConfig.getMinutePrice();
        long includedMinutes = rideConfig.getIncludedMinutes();
        WireBird bird3 = wireRide.getBird();
        if (bird3 != null) {
            str = bird3.getPartnerId();
        } else {
            str = null;
        }
        String id = wireRide.getId();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice = rideConfig.getBasePrice();
        DateTime startedAt = wireRide.getStartedAt();
        RideState mo75038i1 = this.f17102g.mo75038i1(wireRide.getId());
        Boolean valueOf = Boolean.valueOf((mo75038i1 == null || !RideStatesKt.isPrimaryRide(mo75038i1)) ? false : false);
        Long valueOf2 = Long.valueOf(this.f17102g.mo75032o0().m73665a().getActiveRideCount());
        String enumC41529gR42 = enumC41529gR4.toString();
        if (enumC41529gR4.m39470c() != null) {
            l = Long.valueOf(m39470c.intValue());
        } else {
            l = null;
        }
        return new C52192yQ4(null, null, null, m100862a0, z3, str2, currency, distance, null, minimumRidePrice, minutePrice, includedMinutes, str, id, applyTax, basePrice, startedAt, null, null, valueOf, valueOf2, enumC41529gR42, l, z, z2, this.f17105j.mo55540n(), 393479, null);
    }

    /* renamed from: M0 */
    public final C52785zQ4 m100879M0(WireRide wireRide, EnumC41529gR4 enumC41529gR4, boolean z) {
        Config m73665a;
        Integer m39470c;
        RideState mo75038i1 = this.f17102g.mo75038i1(wireRide.getId());
        if (mo75038i1 == null || (m73665a = mo75038i1.getRideConfig()) == null) {
            m73665a = this.f17102g.mo75030r().m73665a();
        }
        RideConfig rideConfig = m73665a.getRideConfig();
        boolean m100862a0 = m100862a0(wireRide);
        WireBird bird = wireRide.getBird();
        boolean z2 = true;
        boolean z3 = bird != null && bird.getCellular();
        WireBird bird2 = wireRide.getBird();
        String str = (bird2 == null || (r3 = bird2.getModel()) == null) ? "" : "";
        String currency = wireRide.getCurrency();
        long distance = (long) wireRide.getDistance();
        long minimumRidePrice = rideConfig.getMinimumRidePrice();
        long minutePrice = rideConfig.getMinutePrice();
        long includedMinutes = rideConfig.getIncludedMinutes();
        WireBird bird3 = wireRide.getBird();
        String partnerId = bird3 != null ? bird3.getPartnerId() : null;
        String id = wireRide.getId();
        boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice = rideConfig.getBasePrice();
        DateTime startedAt = wireRide.getStartedAt();
        RideState mo75038i12 = this.f17102g.mo75038i1(wireRide.getId());
        return new C52785zQ4(null, null, null, m100862a0, z3, str, currency, distance, null, minimumRidePrice, minutePrice, includedMinutes, partnerId, id, applyTax, basePrice, startedAt, null, null, Boolean.valueOf((mo75038i12 == null || !RideStatesKt.isPrimaryRide(mo75038i12)) ? false : false), Long.valueOf(this.f17102g.mo75032o0().m73665a().getActiveRideCount()), enumC41529gR4.toString(), enumC41529gR4.m39470c() != null ? Long.valueOf(m39470c.intValue()) : null, z, this.f17105j.mo55540n(), Double.valueOf(m73665a.getNestSearchAccuracyRadiusLimit()), m73665a.getParkingConfig().getRiderNestAdditionalBufferMeters(), 393479, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
        if (r1 != null) goto L7;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m100878N(FU4 rideParkingDelegate, InterfaceC40692f13 navigatorDelegate, ScopeProvider scopeProvider, WireRide ride, boolean z) {
        Intrinsics.checkNotNullParameter(rideParkingDelegate, "rideParkingDelegate");
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ride, "ride");
        String id = ride.getId();
        C41318g46.m40163a("completeRide called for ride " + id + ", usedOverride=" + z, new Object[0]);
        this.f17108m.mo15899j(RideUpdateState.ENDING);
        rideParkingDelegate.removeRoute();
        DateTime now = DateTime.now();
        C38435bF0 c38435bF0 = m100865X().m73665a().get(ride.getId());
        if (c38435bF0 != null) {
            if (!(!this.f17099d.mo43608x().m80591b())) {
                c38435bF0 = null;
            }
        }
        c38435bF0 = mo21502g();
        AbstractC23442F<CompleteRideResponse> m33152N = this.f17102g.mo75035k1(ride, c38435bF0).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "rideManager.completeRide…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3969h c3969h = new C3969h(ride, rideParkingDelegate, now, z, this, navigatorDelegate);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: sF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100882L(Function1.this, obj);
            }
        };
        final C3970i c3970i = new C3970i(ride, rideParkingDelegate, now, this, navigatorDelegate);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: tF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100880M(Function1.this, obj);
            }
        });
    }

    /* renamed from: N0 */
    public final BQ4 m100877N0(WireRide wireRide) {
        boolean z;
        String str;
        boolean z2;
        int collectionSizeOrDefault;
        Config m73665a = this.f17102g.mo75030r().m73665a();
        boolean m100862a0 = m100862a0(wireRide);
        WireBird bird = wireRide.getBird();
        if (bird != null && bird.getCellular()) {
            z = true;
        } else {
            z = false;
        }
        WireBird bird2 = wireRide.getBird();
        String str2 = (bird2 == null || (r2 = bird2.getModel()) == null) ? "" : "";
        String currency = wireRide.getCurrency();
        long distance = (long) wireRide.getDistance();
        long minimumRidePrice = m73665a.getRideConfig().getMinimumRidePrice();
        long minutePrice = m73665a.getRideConfig().getMinutePrice();
        long includedMinutes = m73665a.getRideConfig().getIncludedMinutes();
        WireBird bird3 = wireRide.getBird();
        if (bird3 != null) {
            str = bird3.getPartnerId();
        } else {
            str = null;
        }
        String str3 = str;
        String id = wireRide.getId();
        boolean applyTax = m73665a.getRideConfig().getAdditionalFees().getApplyTax();
        long basePrice = m73665a.getRideConfig().getBasePrice();
        DateTime startedAt = wireRide.getStartedAt();
        RideState mo75038i1 = this.f17102g.mo75038i1(wireRide.getId());
        if (mo75038i1 != null && RideStatesKt.isPrimaryRide(mo75038i1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        long activeRideCount = this.f17102g.mo75032o0().m73665a().getActiveRideCount();
        boolean requireRideEndPhotoToEndRide = m73665a.getRequireRideEndPhotoToEndRide();
        String mo55540n = this.f17105j.mo55540n();
        List<Area> value = this.f17100e.mo63995r().getValue();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : value) {
            arrayList.add(area.getId());
        }
        return new BQ4(null, null, null, m100862a0, z, str2, currency, distance, null, minimumRidePrice, minutePrice, includedMinutes, str3, id, applyTax, basePrice, startedAt, arrayList, null, Boolean.valueOf(z2), Long.valueOf(activeRideCount), requireRideEndPhotoToEndRide, mo55540n, null, 8651015, null);
    }

    /* renamed from: O */
    public final C38435bF0 m100876O(Location location, List<ParkingNest> list, Config config, ParkingLocationSource parkingLocationSource) {
        C38435bF0 c38435bF0;
        ParkingNest m100866W = m100866W(list, location, config);
        String str = WireLocation.DEFAULT_SOURCE;
        if (m100866W != null) {
            EnumC44987mG3 enumC44987mG3 = EnumC44987mG3.INSIDE;
            Float valueOf = Float.valueOf(C37429Yw2.f47648a.m73967d(location, m100866W.getLocation()));
            String provider = location.getProvider();
            if (provider != null) {
                str = provider;
            }
            Intrinsics.checkNotNullExpressionValue(str, "location.provider ?: WireLocation.DEFAULT_SOURCE");
            c38435bF0 = new C38435bF0(enumC44987mG3, m100866W, valueOf, WireLocationKt.toLocation(location, str), parkingLocationSource);
        } else {
            ParkingNest m100870S = m100870S(list, location, config);
            if (m100870S != null) {
                EnumC44987mG3 enumC44987mG32 = EnumC44987mG3.CLOSE;
                Float valueOf2 = Float.valueOf(C37429Yw2.f47648a.m73967d(location, m100870S.getLocation()));
                String provider2 = location.getProvider();
                if (provider2 != null) {
                    str = provider2;
                }
                Intrinsics.checkNotNullExpressionValue(str, "location.provider ?: WireLocation.DEFAULT_SOURCE");
                c38435bF0 = new C38435bF0(enumC44987mG32, m100870S, valueOf2, WireLocationKt.toLocation(location, str), parkingLocationSource);
            } else {
                EnumC44987mG3 enumC44987mG33 = EnumC44987mG3.FAR;
                String provider3 = location.getProvider();
                if (provider3 != null) {
                    str = provider3;
                }
                c38435bF0 = new C38435bF0(enumC44987mG33, null, null, WireLocationKt.toLocation(location, str), parkingLocationSource);
            }
        }
        return c38435bF0;
    }

    /* renamed from: P */
    public final FH3 m100874P(C38435bF0 c38435bF0, C3968g c3968g) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Integer availableParkingCapacity;
        RiderAreaState m100793l = c3968g.m100793l();
        EnumC44987mG3 m64761f = c38435bF0.m64761f();
        ParkingNest m64762e = c38435bF0.m64762e();
        if (m64762e != null && (availableParkingCapacity = m64762e.getAvailableParkingCapacity()) != null && availableParkingCapacity.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (m64761f == EnumC44987mG3.INSIDE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean m100860c0 = m100860c0(c3968g);
        boolean m100859d0 = m100859d0(c3968g);
        boolean m100884K = m100884K(c3968g);
        if (!z3 && (m100884K || c3968g.m100797h() || z4)) {
            if (!c3968g.m100797h() && ((m100860c0 || m100859d0) && !z4)) {
                if (m100860c0) {
                    String m100794k = c3968g.m100794k();
                    OUTSIDE_SERVICE_AREA outside_service_area = OUTSIDE_SERVICE_AREA.INSTANCE;
                    Integer valueOf = Integer.valueOf(c3968g.m100796i());
                    String m100795j = c3968g.m100795j();
                    String string = this.f17097b.getString(C45871nl4.dialog_do_not_park_here_title);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…g_do_not_park_here_title)");
                    String string2 = this.f17097b.getString(C45871nl4.dialog_do_not_park_here_body);
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…og_do_not_park_here_body)");
                    return new C49570tz6(m100794k, outside_service_area, c38435bF0, valueOf, m100795j, string, string2);
                }
                Intrinsics.checkNotNull(m100793l, "null cannot be cast to non-null type co.bird.android.model.IN_RESTRICTED_PARKING_AREA");
                IN_RESTRICTED_PARKING_AREA in_restricted_parking_area = (IN_RESTRICTED_PARKING_AREA) m100793l;
                String m100794k2 = c3968g.m100794k();
                Integer parkingFineAmount = in_restricted_parking_area.getParkingFineAmount();
                String fineCurrency = in_restricted_parking_area.getFineCurrency();
                String noParkingFineAlertTitle = in_restricted_parking_area.getNoParkingFineAlertTitle();
                if (noParkingFineAlertTitle == null) {
                    noParkingFineAlertTitle = this.f17097b.getString(C45871nl4.dialog_do_not_park_here_title);
                    Intrinsics.checkNotNullExpressionValue(noParkingFineAlertTitle, "context.getString(L.stri…g_do_not_park_here_title)");
                }
                String noParkingFineAlertMessage = in_restricted_parking_area.getNoParkingFineAlertMessage();
                if (noParkingFineAlertMessage == null) {
                    noParkingFineAlertMessage = this.f17097b.getString(C45871nl4.dialog_do_not_park_here_body);
                    Intrinsics.checkNotNullExpressionValue(noParkingFineAlertMessage, "context.getString(L.stri…og_do_not_park_here_body)");
                }
                return new C49570tz6(m100794k2, m100793l, c38435bF0, parkingFineAmount, fineCurrency, noParkingFineAlertTitle, noParkingFineAlertMessage);
            }
            if (m64761f == EnumC44987mG3.CLOSE) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (c3968g.m100802c() && z5 && !m100858e0()) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = !c3968g.m100798g();
            if (!z6 && !z9) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!c3968g.m100797h() && !c3968g.m100801d()) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new C32109Cd1(c3968g.m100794k(), m100793l, c38435bF0, z7, z8, c3968g.m100797h(), z5, z4, c38435bF0.m64765b(), c3968g.m100803b());
        }
        return new C33971Kc0(c3968g.m100794k(), m100793l, c38435bF0, z3);
    }

    /* renamed from: Q */
    public final void m100872Q(FU4 fu4, InterfaceC40692f13 interfaceC40692f13, ScopeProvider scopeProvider, WireRide wireRide, boolean z) {
        WirePrivateBird wirePrivateBird;
        String id = wireRide.getId();
        C41318g46.m40163a("endRide called for ride " + id + ", usedOverride=" + z, new Object[0]);
        Config m80769c = C36441Uq4.m80769c(this.f17096a, wireRide.getBird());
        WireBird bird = wireRide.getBird();
        if (bird != null) {
            wirePrivateBird = bird.getPrivateBird();
        } else {
            wirePrivateBird = null;
        }
        if (wirePrivateBird == null && m80769c.getRequireRideEndPhotoToEndRide()) {
            interfaceC40692f13.mo34995h(this, new C3971j(wireRide, this));
        } else {
            m100878N(fu4, interfaceC40692f13, scopeProvider, wireRide, z);
        }
    }

    /* renamed from: S */
    public final ParkingNest m100870S(List<ParkingNest> list, Location location, Config config) {
        Object next;
        double d;
        Lazy lazy;
        boolean m100869T;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float m73967d = C37429Yw2.f47648a.m73967d(location, ((ParkingNest) next).getLocation());
                do {
                    Object next2 = it.next();
                    float m73967d2 = C37429Yw2.f47648a.m73967d(location, ((ParkingNest) next2).getLocation());
                    if (Float.compare(m73967d, m73967d2) > 0) {
                        next = next2;
                        m73967d = m73967d2;
                    }
                } while (it.hasNext());
            }
        }
        ParkingNest parkingNest = (ParkingNest) next;
        int maxMetersFromParkingNestToBeClose = config.getParkingConfig().getMaxMetersFromParkingNestToBeClose();
        Double riderNestAdditionalBufferMeters = config.getParkingConfig().getRiderNestAdditionalBufferMeters();
        if (riderNestAdditionalBufferMeters != null) {
            d = riderNestAdditionalBufferMeters.doubleValue();
        } else {
            d = 0.0d;
        }
        if (parkingNest != null) {
            lazy = LazyKt__LazyJVMKt.lazy(new C3972k(location, parkingNest, maxMetersFromParkingNestToBeClose));
            Boolean m100294e = JX3.m100294e(parkingNest.getShape(), maxMetersFromParkingNestToBeClose + d, location, config.getNestSearchAccuracyRadiusLimit());
            if (m100294e != null) {
                m100869T = m100294e.booleanValue();
            } else {
                m100869T = m100869T(lazy);
            }
            if (!m100869T) {
                return null;
            }
            return parkingNest;
        }
        return null;
    }

    /* renamed from: U */
    public final WireRide m100868U() {
        RideState m100867V = m100867V();
        if (m100867V != null) {
            return m100867V.getRide();
        }
        return null;
    }

    /* renamed from: V */
    public final RideState m100867V() {
        return this.f17102g.mo75034m0().m73665a().m59035e();
    }

    /* renamed from: W */
    public final ParkingNest m100866W(List<ParkingNest> list, Location location, Config config) {
        double d;
        Object obj = null;
        if (config.getParkingConfig().getEnableHorizontalAccuracyLocation()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Polygon shape = ((ParkingNest) next).getShape();
                double nestSearchAccuracyRadiusLimit = config.getNestSearchAccuracyRadiusLimit();
                Double riderNestAdditionalBufferMeters = config.getParkingConfig().getRiderNestAdditionalBufferMeters();
                if (riderNestAdditionalBufferMeters != null) {
                    d = riderNestAdditionalBufferMeters.doubleValue();
                } else {
                    d = 0.0d;
                }
                if (JX3.m100297b(shape, location, nestSearchAccuracyRadiusLimit, d)) {
                    obj = next;
                    break;
                }
            }
            return (ParkingNest) obj;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (JX3.m100296c(((ParkingNest) next2).getShape(), C39339cm2.m60885d(location))) {
                obj = next2;
                break;
            }
        }
        return (ParkingNest) obj;
    }

    /* renamed from: X */
    public Z84<Map<String, C38435bF0>> m100865X() {
        return (Z84) this.f17116u.getValue();
    }

    /* renamed from: Y */
    public final C24552a<Boolean> m100864Y() {
        return this.f17120y;
    }

    /* renamed from: Z */
    public final boolean m100863Z() {
        return Intrinsics.areEqual(this.f17096a.m82623f8().m73665a().getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE);
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: a */
    public Map<String, FH3> mo21508a() {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        String str;
        WireRide ride;
        Set<Map.Entry<String, FH3>> entrySet = mo21503f().m73665a().entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            RideState mo75038i1 = this.f17102g.mo75038i1((String) entry.getKey());
            if (mo75038i1 == null || (ride = mo75038i1.getRide()) == null || (str = ride.getBirdId()) == null) {
                str = "";
            }
            Pair m28425to = TuplesKt.m28425to(str, entry.getValue());
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: a0 */
    public final boolean m100862a0(WireRide wireRide) {
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        WireBird bird = wireRide.getBird();
        if (bird == null || !WireBirdKt.canTreatAsBluetooth(bird, C36441Uq4.m80769c(this.f17096a, wireRide.getBird()))) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: b */
    public void mo21507b(WireRide wireRide, String lastVisitedStep, String str) {
        Intrinsics.checkNotNullParameter(lastVisitedStep, "lastVisitedStep");
        boolean z = false;
        if (wireRide == null) {
            C41318g46.m40163a("trackRideAttemptStopped called but ride null, skipping.", new Object[0]);
            return;
        }
        String mo55540n = this.f17105j.mo55540n();
        WireBird bird = wireRide.getBird();
        WireLocation location = bird != null ? bird.getLocation() : null;
        Location mo43632A = this.f17099d.mo43632A(EnumC36493Uw2.VPS);
        Location mo43632A2 = this.f17099d.mo43632A(EnumC36493Uw2.GPS);
        InterfaceC1880Ea interfaceC1880Ea = this.f17101f;
        String id = wireRide.getId();
        RideState mo75038i1 = this.f17102g.mo75038i1(wireRide.getId());
        if (mo75038i1 != null && RideStatesKt.isPrimaryRide(mo75038i1)) {
            z = true;
        }
        interfaceC1880Ea.mo55905y(new CQ4(null, null, null, id, lastVisitedStep, str, Boolean.valueOf(z), Long.valueOf(this.f17102g.mo75032o0().m73665a().getActiveRideCount()), mo55540n, mo43632A != null ? Double.valueOf(mo43632A.getLatitude()) : null, mo43632A != null ? Double.valueOf(mo43632A.getLongitude()) : null, mo43632A != null ? Double.valueOf(mo43632A.getAccuracy()) : null, mo43632A != null ? C37195Xw2.m76041a(mo43632A) : null, location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null, location != null ? location.getAccuracy() : null, location != null ? Boolean.valueOf(location.getMocked()) : null, mo43632A2 != null ? Double.valueOf(mo43632A2.getLatitude()) : null, mo43632A2 != null ? Double.valueOf(mo43632A2.getLongitude()) : null, mo43632A2 != null ? Double.valueOf(mo43632A2.getAccuracy()) : null, mo43632A2 != null ? C37195Xw2.m76041a(mo43632A2) : null, 7, null));
    }

    /* renamed from: b0 */
    public final boolean m100861b0(C3968g c3968g) {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RiderAreaState[]{IN_NO_PARKING_AREA.INSTANCE, IN_NO_RIDE_NO_PARK_AREA.INSTANCE, IN_NO_RIDE_AREA.INSTANCE, OUTSIDE_SERVICE_AREA.INSTANCE, IN_SLOW_NO_PARK_AREA.INSTANCE});
        return listOf.contains(c3968g.m100793l());
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: c */
    public FH3 mo21506c(String rideId, Location location, ParkingLocationSource parkingLocationSource) {
        Map<String, C38435bF0> mapOf;
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(parkingLocationSource, "parkingLocationSource");
        RideState mo75038i1 = this.f17102g.mo75038i1(rideId);
        if (mo75038i1 != null) {
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(rideId, m100876O(location, this.f17100e.mo64006V().m73665a(), mo75038i1.getRideConfig(), parkingLocationSource)));
            return m100883K0(new C3968g(mo75038i1.getRide().getId(), mo75038i1.getRideConfig(), this.f17100e.mo63997i(mo75038i1, location).toRiderAreaState()), mo75038i1, mapOf);
        }
        return null;
    }

    /* renamed from: c0 */
    public final boolean m100860c0(C3968g c3968g) {
        return Intrinsics.areEqual(c3968g.m100793l(), OUTSIDE_SERVICE_AREA.INSTANCE) && c3968g.m100800e() && c3968g.m100799f();
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: d */
    public ArrayDeque<Optional<InterfaceC0014A5>> mo21505d() {
        return this.f17117v;
    }

    /* renamed from: d0 */
    public final boolean m100859d0(C3968g c3968g) {
        return (c3968g.m100793l() instanceof IN_RESTRICTED_PARKING_AREA) && !c3968g.m100798g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
        if (r1 != null) goto L31;
     */
    @Override // p000.InterfaceC46164oF3
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo21504e(FU4 rideParkingDelegate, InterfaceC40692f13 navigatorDelegate, WireRide wireRide, boolean z, boolean z2, boolean z3, ScopeProvider scopeProvider) {
        String str;
        WireBird wireBird;
        FH3 mo21500j;
        boolean z4;
        boolean z5;
        String id;
        Intrinsics.checkNotNullParameter(rideParkingDelegate, "rideParkingDelegate");
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        QM4 qm4 = null;
        if (wireRide != null) {
            str = wireRide.getId();
        } else {
            str = null;
        }
        C41318g46.m40163a("tryToPark called for ride " + str + ", shouldEndRide=" + z + ", skipEndRideTutorialStep=" + z2 + ", skipThirdPartyLocationDetermination=" + z3, new Object[0]);
        if (z && !z2 && m100836r0(navigatorDelegate, wireRide)) {
            C41318g46.m40163a("tryToPark prompted end ride tutorial", new Object[0]);
        } else if (z && !z3 && m100848l0(navigatorDelegate, wireRide)) {
            C41318g46.m40163a("tryToPark prompted third party location flow", new Object[0]);
        } else {
            C36207Tq4 c36207Tq4 = this.f17096a;
            if (wireRide != null) {
                wireBird = wireRide.getBird();
            } else {
                wireBird = null;
            }
            Config m80769c = C36441Uq4.m80769c(c36207Tq4, wireBird);
            WarningPresentationKind endRideWarningPresentationKind = m80769c.getRideConfig().getWarningConfig().getEndRideWarningPresentationKind();
            boolean z6 = true;
            if (wireRide != null && (id = wireRide.getId()) != null) {
                if (!(!this.f17099d.mo43608x().m80591b())) {
                    id = null;
                }
                if (id != null) {
                    mo21500j = mo21503f().m73665a().get(id);
                }
            }
            mo21500j = mo21500j();
            FH3 fh3 = mo21500j;
            C41318g46.m40163a("using the following rideParkingStatus to determine parking state = " + fh3, new Object[0]);
            ParkingLocationVerificationMethod methodBlockedRideDialog = m80769c.getParkingConfig().getParkingLocationVerification().getMethodBlockedRideDialog();
            if (methodBlockedRideDialog != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (wireRide != null && wireRide.isGuestRide()) {
                z5 = true;
            } else {
                z5 = false;
            }
            QM4 m89225e = C6598Py.m89225e(fh3, z5, Boolean.valueOf(z), z4);
            if (m89225e != null && C6598Py.m89229a(m89225e)) {
                qm4 = m89225e;
            }
            if (!RideWarningConfigKt.isLegacyPresentationKind(endRideWarningPresentationKind) && qm4 != null) {
                if (wireRide != null) {
                    this.f17101f.mo55905y(m100879M0(wireRide, EnumC41529gR4.NO_PARKING, qm4.m88637b()));
                }
                if (endRideWarningPresentationKind == null) {
                    endRideWarningPresentationKind = WarningPresentationKind.LEGACY;
                }
                Object m33135e = rideParkingDelegate.mo34949l1(qm4, endRideWarningPresentationKind).m33135e(AutoDispose.m45239a(scopeProvider));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                SingleSubscribeProxy singleSubscribeProxy = (SingleSubscribeProxy) m33135e;
                final C3954M c3954m = new C3954M(wireRide, qm4, methodBlockedRideDialog, this, navigatorDelegate, m80769c, fh3, rideParkingDelegate, scopeProvider, z);
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: uF3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        JF3.m100875O0(Function1.this, obj);
                    }
                };
                final C3957N c3957n = C3957N.f17160b;
                singleSubscribeProxy.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: vF3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        JF3.m100873P0(Function1.this, obj);
                    }
                });
            } else if (fh3 instanceof C33971Kc0) {
                m100842o0(rideParkingDelegate, navigatorDelegate, scopeProvider, wireRide, z, false);
            } else if (fh3 instanceof C49570tz6) {
                C49570tz6 c49570tz6 = (C49570tz6) fh3;
                Integer m11120g = c49570tz6.m11120g();
                String m11119h = c49570tz6.m11119h();
                rideParkingDelegate.mo34960k1(c49570tz6.m11117j(), c49570tz6.m11118i(), new C3958O(wireRide, this, m11120g), new C3959P(rideParkingDelegate, navigatorDelegate, scopeProvider, wireRide, z, m11120g), m11120g, m11119h);
                Unit unit = Unit.INSTANCE;
                if (wireRide != null) {
                    this.f17101f.mo55905y(m100879M0(wireRide, EnumC41529gR4.NO_PARKING, true));
                }
                m100853i0(scopeProvider, fh3.mo11122e(), m11119h, m11120g);
            } else if (fh3 instanceof C32109Cd1) {
                boolean mo11125b = fh3.mo11125b();
                if (!fh3.mo107359a() || z) {
                    z6 = false;
                }
                if (!mo11125b && !z6) {
                    rideParkingDelegate.mo35201N0(new C3960Q(wireRide, this));
                    Unit unit2 = Unit.INSTANCE;
                    if (wireRide != null) {
                        this.f17101f.mo55905y(m100879M0(wireRide, EnumC41529gR4.NO_PARKING, false));
                        mo21507b(wireRide, "client_issue_displayed", "no_parking");
                        return;
                    }
                    return;
                }
                m100842o0(rideParkingDelegate, navigatorDelegate, scopeProvider, wireRide, z, true);
            } else if (!this.f17096a.m82623f8().m73665a().getEnforceNoParkingV0()) {
                m100842o0(rideParkingDelegate, navigatorDelegate, scopeProvider, wireRide, z, false);
            } else {
                rideParkingDelegate.mo35201N0(new C3961R(wireRide, this));
                Unit unit3 = Unit.INSTANCE;
                if (wireRide != null) {
                    this.f17101f.mo55905y(m100879M0(wireRide, EnumC41529gR4.NO_PARKING, false));
                    mo21507b(wireRide, "client_issue_displayed", "no_parking");
                }
            }
        }
    }

    /* renamed from: e0 */
    public final boolean m100858e0() {
        if (Minutes.minutesBetween(this.f17098c.m37572t(), DateTime.now()).getMinutes() <= this.f17096a.m82623f8().m73665a().getParkingConfig().getCloseToNestParkingRateMinutes()) {
            if (this.f17098c.m37576s() < this.f17096a.m82623f8().m73665a().getParkingConfig().getCloseToNestParkingLimit()) {
                return false;
            }
            return true;
        }
        this.f17098c.m37624g();
        C22454gl c22454gl = this.f17098c;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        c22454gl.m37721I1(now);
        return false;
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: f */
    public Z84<Map<String, FH3>> mo21503f() {
        return (Z84) this.f17114s.getValue();
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: g */
    public C38435bF0 mo21502g() {
        return this.f17113r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        if (r3.isSolebe() == true) goto L60;
     */
    @Override // p000.InterfaceC0014A5
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo100855h(FU4 rideParkingDelegate, InterfaceC40692f13 navigatorDelegate, ScopeProvider scopeProvider, int i, int i2, Intent intent) {
        WireBird bird;
        WireBird wireBird;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(rideParkingDelegate, "rideParkingDelegate");
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        String str = "failed";
        boolean z = true;
        switch (i) {
            case 10081:
                if (i2 == -1) {
                    WireRide m100868U = m100868U();
                    if (m100868U != null) {
                        InterfaceC46164oF3.C26875a.tryToPark$default(this, rideParkingDelegate, navigatorDelegate, m100868U, true, true, false, scopeProvider, 32, null);
                        return;
                    }
                    return;
                }
                mo21507b(m100868U(), "end_ride_tutorial", "canceled");
                return;
            case 10082:
                if (i2 == -1) {
                    WireRide m100868U2 = m100868U();
                    if (m100868U2 != null && (bird = m100868U2.getBird()) != null) {
                        navigatorDelegate.mo34995h(this, new C3977p(bird, this));
                        return;
                    }
                    return;
                }
                mo21507b(m100868U(), "end_ride_tutorial", "canceled");
                return;
            case 10083:
                if (i2 == -1) {
                    if (intent == null || intent.getBooleanExtra("arcore_end_ride_regardless", false)) {
                        z = false;
                    }
                    if (!z) {
                        WireRide m100868U3 = m100868U();
                        if (m100868U3 != null) {
                            InterfaceC46164oF3.C26875a.tryToPark$default(this, rideParkingDelegate, navigatorDelegate, m100868U3, true, false, true, scopeProvider, 16, null);
                            return;
                        }
                        return;
                    }
                    WireRide m100868U4 = m100868U();
                    if (m100868U4 != null) {
                        InterfaceC46164oF3.C26875a.tryToPark$default(this, rideParkingDelegate, navigatorDelegate, m100868U4, true, false, false, scopeProvider, 48, null);
                        return;
                    }
                    return;
                }
                if (intent == null || !intent.getBooleanExtra("parking_verification_failed", false)) {
                    z = false;
                }
                if (!z) {
                    str = "canceled";
                }
                mo21507b(m100868U(), "parking_location_verification", str);
                return;
            case 10084:
                if (i2 == -1) {
                    WireRide m100868U5 = m100868U();
                    if (m100868U5 != null) {
                        completeRide$ride_release$default(this, rideParkingDelegate, navigatorDelegate, scopeProvider, m100868U5, false, 16, null);
                        return;
                    }
                    return;
                }
                mo21507b(m100868U(), "parking_photo", "canceled");
                return;
            case 10085:
                if (i2 == -1) {
                    WireRide m100868U6 = m100868U();
                    ItemLease itemLease = null;
                    if (m100868U6 != null) {
                        wireBird = m100868U6.getBird();
                    } else {
                        wireBird = null;
                    }
                    if (wireBird != null) {
                        itemLease = this.f17110o.mo55649z(wireBird, ItemLeaseType.HELMET);
                    }
                    if (itemLease != null) {
                        List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
                        if (physicalLocks != null) {
                            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) physicalLocks);
                            WirePhysicalLock wirePhysicalLock = (WirePhysicalLock) firstOrNull;
                            if (wirePhysicalLock != null) {
                                break;
                            }
                        }
                        z = false;
                        if (z) {
                            navigatorDelegate.mo34995h(this, new C3978q(wireBird, itemLease));
                            return;
                        } else {
                            navigatorDelegate.mo34995h(this, new C3979r(itemLease));
                            return;
                        }
                    }
                    WireRide m100868U7 = m100868U();
                    if (m100868U7 != null) {
                        m100871R(this, rideParkingDelegate, navigatorDelegate, scopeProvider, m100868U7, false, 16, null);
                        return;
                    }
                    return;
                }
                mo21507b(m100868U(), "physical_lock_tutorial", "canceled");
                return;
            case 10086:
                if (i2 == -1) {
                    WireRide m100868U8 = m100868U();
                    if (m100868U8 != null) {
                        m100871R(this, rideParkingDelegate, navigatorDelegate, scopeProvider, m100868U8, false, 16, null);
                        return;
                    }
                    return;
                }
                mo21507b(m100868U(), "helmet_lease_return", "canceled");
                return;
            case 10087:
            default:
                return;
            case 10088:
                if (i2 == -1) {
                    WireRide m100868U9 = m100868U();
                    if (m100868U9 != null && m100868U9.getBird() != null) {
                        navigatorDelegate.mo34995h(this, new C3980s());
                        return;
                    }
                    return;
                }
                mo21507b(m100868U(), "end_ride_tutorial", "canceled");
                return;
            case 10089:
                if (i2 == -1) {
                    if (intent == null || intent.getBooleanExtra("arcore_end_ride_regardless", false)) {
                        z = false;
                    }
                    if (!z) {
                        WireRide m100868U10 = m100868U();
                        if (m100868U10 != null) {
                            InterfaceC46164oF3.C26875a.tryToPark$default(this, rideParkingDelegate, navigatorDelegate, m100868U10, true, false, true, scopeProvider, 16, null);
                            return;
                        }
                        return;
                    }
                    WireRide m100868U11 = m100868U();
                    if (m100868U11 != null) {
                        InterfaceC46164oF3.C26875a.tryToPark$default(this, rideParkingDelegate, navigatorDelegate, m100868U11, true, false, false, scopeProvider, 48, null);
                        return;
                    }
                    return;
                }
                if (intent == null || !intent.getBooleanExtra("parking_verification_failed", false)) {
                    z = false;
                }
                if (!z) {
                    str = "canceled";
                }
                mo21507b(m100868U(), "parking_location_verification", str);
                return;
        }
    }

    /* renamed from: h0 */
    public final void m100854h0(FU4 rideParkingDelegate, ScopeProvider scopeProvider, WireRide ride) {
        Intrinsics.checkNotNullParameter(rideParkingDelegate, "rideParkingDelegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ride, "ride");
        C41318g46.m40151m("ride: lock: true", new Object[0]);
        this.f17108m.mo15899j(RideUpdateState.LOCKING);
        DateTime now = DateTime.now();
        AbstractC23442F<WireBird> m33152N = this.f17102g.mo75036k0(ride, true).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "rideManager.lockRide(rid…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3973l c3973l = new C3973l(rideParkingDelegate, ride, now);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: wF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100857f0(Function1.this, obj);
            }
        };
        final C3974m c3974m = new C3974m(rideParkingDelegate, ride, now);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: xF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100856g0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: i */
    public Observable<FH3> mo21501i() {
        return this.f17095B;
    }

    /* renamed from: i0 */
    public final void m100853i0(ScopeProvider scopeProvider, RiderAreaState riderAreaState, String str, Integer num) {
        NonComplianceWarningKind nonComplianceWarningKind;
        String str2;
        WireRide ride;
        if (Intrinsics.areEqual(riderAreaState, OUTSIDE_SERVICE_AREA.INSTANCE)) {
            nonComplianceWarningKind = NonComplianceWarningKind.LEFT_OUTSIDE_SERVICE_AREA;
        } else {
            nonComplianceWarningKind = NonComplianceWarningKind.LEFT_IN_NO_PARK_AREA;
        }
        InterfaceC52458ys0 interfaceC52458ys0 = this.f17107l;
        RideState m59035e = this.f17102g.mo75057R().m73665a().m59035e();
        if (m59035e != null && (ride = m59035e.getRide()) != null) {
            str2 = ride.getId();
        } else {
            str2 = null;
        }
        Object m33135e = interfaceC52458ys0.mo211c(nonComplianceWarningKind, str2, str, num).m33135e(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3975n c3975n = C3975n.f17214g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: yF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100852j0(Function1.this, obj);
            }
        };
        final C3976o c3976o = C3976o.f17215b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: zF3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                JF3.m100850k0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC46164oF3
    /* renamed from: j */
    public FH3 mo21500j() {
        return this.f17112q;
    }

    /* renamed from: l0 */
    public final boolean m100848l0(InterfaceC40692f13 interfaceC40692f13, WireRide wireRide) {
        WireBird wireBird;
        boolean z;
        C36207Tq4 c36207Tq4 = this.f17096a;
        if (wireRide != null) {
            wireBird = wireRide.getBird();
        } else {
            wireBird = null;
        }
        Config m80769c = C36441Uq4.m80769c(c36207Tq4, wireBird);
        if (!Intrinsics.areEqual(m80769c.getParkingConfig().getParkingLocationVerification().getEnabled(), Boolean.TRUE)) {
            return false;
        }
        boolean z2 = true;
        if (m80769c.getParkingConfig().getParkingLocationVerification().getMethod() == ParkingLocationVerificationMethod.GOOGLE_VPS && !this.f17104i.mo8189f().m73665a().booleanValue() && (!this.f17100e.mo64006V().m73665a().isEmpty()) && this.f17099d.mo43628d().m79220c() != EnumC36493Uw2.VPS) {
            z = true;
        } else {
            z = false;
        }
        if (m80769c.getParkingConfig().getParkingLocationVerification().getMethod() != ParkingLocationVerificationMethod.GOOGLE_VPS_V2 || this.f17099d.mo43628d().m79220c() == EnumC36493Uw2.VPS) {
            z2 = false;
        }
        if (z) {
            Intrinsics.checkNotNull(wireRide);
            return m100832t0(this, interfaceC40692f13, m80769c, wireRide, false, 8, null);
        } else if (!z2) {
            return false;
        } else {
            Intrinsics.checkNotNull(wireRide);
            return m100828v0(this, interfaceC40692f13, m80769c, wireRide, false, 8, null);
        }
    }

    /* renamed from: m0 */
    public final void m100846m0() {
        if (InterfaceC1880Ea.C1881a.startThrottledTrace$default(this.f17101f, new ParkingStatusComputation(), null, 30000, 2, null)) {
            this.f17094A.set(true);
            C41318g46.m40163a("starting trace parking status computation", new Object[0]);
        }
    }

    /* renamed from: n0 */
    public final void m100844n0() {
        if (this.f17094A.get()) {
            C41318g46.m40163a("completed trace parking status computation\n", new Object[0]);
            InterfaceC1880Ea.C1881a.stopTrace$default(this.f17101f, new ParkingStatusComputation(), null, null, null, 14, null);
            this.f17094A.set(false);
        }
    }

    /* renamed from: o0 */
    public final void m100842o0(FU4 fu4, InterfaceC40692f13 interfaceC40692f13, ScopeProvider scopeProvider, WireRide wireRide, boolean z, boolean z2) {
        String str;
        if (wireRide != null) {
            str = wireRide.getId();
        } else {
            str = null;
        }
        C41318g46.m40163a("park called for " + str + ", shouldEndRide=" + z + ", usedOverride=" + z2, new Object[0]);
        if (wireRide != null) {
            if (!z) {
                m100854h0(fu4, scopeProvider, wireRide);
            } else {
                m100840p0(fu4, interfaceC40692f13, scopeProvider, wireRide, z2);
            }
        }
    }

    /* renamed from: p0 */
    public final void m100840p0(FU4 fu4, InterfaceC40692f13 interfaceC40692f13, ScopeProvider scopeProvider, WireRide wireRide, boolean z) {
        String str;
        if (wireRide != null) {
            str = wireRide.getId();
        } else {
            str = null;
        }
        C41318g46.m40163a("performEndRide called for ride " + str + ", usedOverride=" + z, new Object[0]);
        if (wireRide != null && !m100891G0(interfaceC40692f13, wireRide)) {
            this.f17101f.mo55905y(m100877N0(wireRide));
            m100872Q(fu4, interfaceC40692f13, scopeProvider, wireRide, z);
        }
    }

    /* renamed from: q0 */
    public final boolean m100838q0(Config config, WireRide wireRide, boolean z, Function2<? super Config, ? super WireRide, Boolean> function2) {
        Location m73665a;
        boolean z2;
        boolean z3;
        if (z) {
            return function2.invoke(config, wireRide).booleanValue();
        }
        Double requiredProximityToNestMeters = config.getParkingConfig().getParkingLocationVerification().getRequiredProximityToNestMeters();
        if (requiredProximityToNestMeters != null) {
            double doubleValue = requiredProximityToNestMeters.doubleValue();
            float accuracy = this.f17099d.mo43616p().m73665a().getAccuracy();
            List<ParkingNest> m73665a2 = this.f17100e.mo64006V().m73665a();
            if (!(m73665a2 instanceof Collection) || !m73665a2.isEmpty()) {
                Iterator<T> it = m73665a2.iterator();
                while (it.hasNext()) {
                    z2 = true;
                    if (C37429Yw2.f47648a.m73967d(m73665a, ((ParkingNest) it.next()).getLocation()) - accuracy <= doubleValue) {
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
            z2 = false;
            if (!z2) {
                return false;
            }
            return function2.invoke(config, wireRide).booleanValue();
        }
        return function2.invoke(config, wireRide).booleanValue();
    }

    /* renamed from: r0 */
    public final boolean m100836r0(InterfaceC40692f13 interfaceC40692f13, WireRide wireRide) {
        return interfaceC40692f13.mo35017f(this, new C3983v(wireRide));
    }

    /* renamed from: s0 */
    public final boolean m100834s0(InterfaceC40692f13 interfaceC40692f13, Config config, WireRide wireRide, boolean z) {
        return m100838q0(config, wireRide, z, new C3984w(z, interfaceC40692f13));
    }

    /* renamed from: u0 */
    public final boolean m100830u0(InterfaceC40692f13 interfaceC40692f13, Config config, WireRide wireRide, boolean z) {
        return m100838q0(config, wireRide, z, new C3987x(z, interfaceC40692f13));
    }

    /* renamed from: w0 */
    public void m100826w0(C38435bF0 c38435bF0) {
        this.f17113r = c38435bF0;
    }

    /* renamed from: x0 */
    public void m100824x0(FH3 fh3) {
        Intrinsics.checkNotNullParameter(fh3, "<set-?>");
        this.f17112q = fh3;
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/RiderAreaState;", "", "<name for destructuring parameter 0>", "Lna4;", "LFH3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Triple;)Lna4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JF3$C */
    /* loaded from: classes4.dex */
    public static final class C3943C extends Lambda implements Function1<Triple<? extends Boolean, ? extends RiderAreaState, ? extends String>, InterfaceC45761na4<? extends FH3>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LbF0;", "currentParkingNest", "LFH3;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LbF0;)LFH3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JF3$C$a */
        /* loaded from: classes4.dex */
        public static final class C3944a extends Lambda implements Function1<C38435bF0, FH3> {

            /* renamed from: g */
            public final /* synthetic */ String f17125g;

            /* renamed from: h */
            public final /* synthetic */ JF3 f17126h;

            /* renamed from: i */
            public final /* synthetic */ RiderAreaState f17127i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3944a(String str, JF3 jf3, RiderAreaState riderAreaState) {
                super(1);
                this.f17125g = str;
                this.f17126h = jf3;
                this.f17127i = riderAreaState;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final FH3 invoke(C38435bF0 currentParkingNest) {
                Intrinsics.checkNotNullParameter(currentParkingNest, "currentParkingNest");
                C3968g c3968g = new C3968g(this.f17125g, this.f17126h.f17096a.m82623f8().m73665a(), this.f17127i);
                this.f17126h.m100846m0();
                return this.f17126h.m100874P(currentParkingNest, c3968g);
            }
        }

        public C3943C() {
            super(1);
        }

        /* renamed from: b */
        public static final FH3 m100817b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (FH3) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC45761na4<? extends FH3> invoke2(Triple<Boolean, ? extends RiderAreaState, String> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            boolean booleanValue = triple.component1().booleanValue();
            RiderAreaState component2 = triple.component2();
            String component3 = triple.component3();
            if (booleanValue) {
                AbstractC24490k abstractC24490k = JF3.this.f17121z;
                final C3944a c3944a = new C3944a(component3, JF3.this, component2);
                AbstractC24490k m32117q0 = abstractC24490k.m32117q0(new InterfaceC23492o() { // from class: KF3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        FH3 m100817b;
                        m100817b = JF3.C3943C.m100817b(Function1.this, obj);
                        return m100817b;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m32117q0, "class ParkingManagerImpl…etConfig(bird)) == true\n}");
                return m32117q0;
            }
            C3968g c3968g = new C3968g(component3, JF3.this.f17096a.m82623f8().m73665a(), component2);
            JF3.this.m100846m0();
            AbstractC24490k m32123o0 = AbstractC24490k.m32123o0(new C33971Kc0(c3968g.m100794k(), c3968g.m100793l(), JF3.this.mo21502g(), false));
            Intrinsics.checkNotNullExpressionValue(m32123o0, "{\n        val parkingSta…gNest,\n        ))\n      }");
            return m32123o0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC45761na4<? extends FH3> invoke(Triple<? extends Boolean, ? extends RiderAreaState, ? extends String> triple) {
            return invoke2((Triple<Boolean, ? extends RiderAreaState, String>) triple);
        }
    }
}
