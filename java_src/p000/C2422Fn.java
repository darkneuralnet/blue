package p000;

import android.location.Location;
import android.util.LruCache;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DemandAreaAnalyticsInfo;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LocationAreaState;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.ParkingType;
import co.bird.android.model.Point;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStates;
import co.bird.android.model.RiderAreaState;
import co.bird.android.model.analytics.RiderAreaStateComputation;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.filter.KeyBasedAreasFilter;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.MapGeocacheConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.joda.time.DateTime;
import p000.C2422Fn;
import p000.C37791a94;
import p000.InterfaceC1880Ea;
import p000.InterfaceC38798br4;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Á\u00012\u00020\u00012\u00020\u0002:\u0002lpB[\b\u0007\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010`\u001a\u00020^\u0012\u0006\u0010c\u001a\u00020a\u0012\u0006\u0010g\u001a\u00020d\u0012\u0006\u0010j\u001a\u00020h\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020o¢\u0006\u0006\b¿\u0001\u0010À\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007*\u00020\u0006H\u0002J\u001a\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J&\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0017H\u0002J0\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002J\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\u0015\u0010\"\u001a\u00020\u001c*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0082\u0002J\u0014\u0010%\u001a\u00020\u001c*\u00020\r2\u0006\u0010$\u001a\u00020#H\u0002J\f\u0010&\u001a\u00020#*\u00020\rH\u0002J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030+H\u0016J\u001e\u0010/\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J6\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\f05042\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u000208H\u0016J\b\u0010;\u001a\u00020\u0003H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0016J\b\u0010=\u001a\u00020\u001cH\u0016J\u0014\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000704H\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020@042\u0006\u0010?\u001a\u00020\u001cH\u0016J(\u0010F\u001a\u00020E2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u001cH\u0016J&\u0010J\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00062\f\u0010I\u001a\b\u0012\u0004\u0012\u0002020H2\u0006\u0010C\u001a\u00020BH\u0016J&\u0010M\u001a\u00020E2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\fH\u0016R\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010_R\u0014\u0010c\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR'\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR'\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\f0s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bM\u0010u\u001a\u0004\by\u0010wR'\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00070s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b{\u0010u\u001a\u0004\b|\u0010wR(\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b~\u0010u\u001a\u0004\b\u007f\u0010wR*\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070s8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010u\u001a\u0005\b\u0082\u0001\u0010wR)\u0010\u0085\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0s8VX\u0096\u0084\u0002¢\u0006\r\n\u0005\b\u0084\u0001\u0010u\u001a\u0004\b[\u0010wR)\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\bv\u0010\u0086\u0001\u001a\u0005\bW\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R2\u0010\u008f\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u00010s8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010u\u001a\u0005\b\u008e\u0001\u0010wR+\u0010\u0092\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070s8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010u\u001a\u0005\b\u0091\u0001\u0010wR+\u0010\u0095\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070s8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010u\u001a\u0005\b\u0094\u0001\u0010wR+\u0010\u0097\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070s8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010u\u001a\u0005\b\u0096\u0001\u0010wR+\u0010\u0099\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070s8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010u\u001a\u0005\b\u0098\u0001\u0010wR/\u0010\u009a\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00150\u008b\u00010s8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u007f\u0010u\u001a\u0004\be\u0010wR#\u0010\u009d\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\f0\u009b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010\u009c\u0001R#\u0010\u009e\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00070\u009b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u009c\u0001R$\u0010 \u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009c\u0001R$\u0010¢\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009c\u0001R$\u0010£\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u009c\u0001R,\u0010¤\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u00010\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u009c\u0001R%\u0010¦\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u009c\u0001R%\u0010§\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u009c\u0001R$\u0010¨\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070\u009b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010\u009c\u0001R%\u0010ª\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010\u00070\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010\u009c\u0001R*\u0010«\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00150\u008b\u00010\u009b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010\u009c\u0001R&\u0010¯\u0001\u001a\u0012\u0012\r\u0012\u000b \u00ad\u0001*\u0004\u0018\u00010(0(0¬\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010®\u0001R'\u0010±\u0001\u001a\u0012\u0012\r\u0012\u000b \u00ad\u0001*\u0004\u0018\u00010\u00030\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010®\u0001R&\u0010²\u0001\u001a\u0012\u0012\r\u0012\u000b \u00ad\u0001*\u0004\u0018\u00010\u00030\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010®\u0001R\u0017\u0010µ\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010´\u0001R#\u0010¸\u0001\u001a\u000f\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020#0¶\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010·\u0001R\u0018\u0010¼\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R%\u0010¾\u0001\u001a\u0011\u0012\r\u0012\u000b \u00ad\u0001*\u0004\u0018\u00010\u001f0\u001f0+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010½\u0001¨\u0006Â\u0001"}, m28432d2 = {"LFn;", "Lbn;", "Lbr4;", "", "X1", "Y1", "Landroid/location/Location;", "Lco/bird/android/buava/Optional;", "", "U1", "", "V1", "", "Lco/bird/android/model/persistence/Area;", "at", "Lco/bird/android/model/ParkingType;", "P1", "Lco/bird/android/model/wire/configs/Config;", "config", "location", "areas", "Lco/bird/android/model/LocationAreaState;", "L1", "Lco/bird/android/model/RideState;", "Lco/bird/android/model/filter/KeyBasedAreasFilter;", "Q1", "rideState", "clientLocation", "", "forceUseClientLocation", "M1", "Lco/bird/android/model/RiderAreaState;", "O1", "R1", AbstractC3831J1.f16564d, "LWB1;", "geometry", "K1", "W1", "i", "LNn;", "request", "a0", "Lio/reactivex/Observable;", "I", "T", "Q", "J", "", "radius", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/ParkingNest;", "f", "Lco/bird/android/model/ParkingNestData;", MessageExtension.FIELD_DATA, "G", "z", "g", "R", "N", "useLastLocation", "Lco/bird/android/model/DemandAreaAnalyticsInfo;", "y", "Lco/bird/android/model/constant/MapMode;", "mapMode", "includeMergedArea", "Lio/reactivex/c;", "Z", "center", "", "cellIds", "P", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "m", "LOn;", "b", "LOn;", "areaRepository", "LiF3;", "c", "LiF3;", "parkingClient", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "Ldr4;", "e", "Ldr4;", "reactiveLocationManager", "LYR4;", "LYR4;", "rideManager", "Lot5;", "Lot5;", "serverDrivenFilterManager", "LTL;", "h", "LTL;", "birdLocationManager", "Lgl;", "Lgl;", "preference", "LEa;", "j", "LEa;", "analyticsManager", "LaM;", "k", "LaM;", "birdManager", "LZ84;", "l", "Lkotlin/Lazy;", "r", "()LZ84;", "areasNearby", "V", "parkingNests", "n", "c0", "currentParkingNestData", "o", "x", "currentRiderBannerArea", "p", "v", "restrictedAreaUserIsIn", "q", "areasUserIsIn", "Lco/bird/android/model/RiderAreaState;", "()Lco/bird/android/model/RiderAreaState;", "m2", "(Lco/bird/android/model/RiderAreaState;)V", "currentRiderAreaState", "", "Lorg/joda/time/DateTime;", "s", "O", "currentAreasEntryTimes", "t", "D", "areasLastRefreshRequestDateTime", "u", "w", "areasLastRefreshDateTime", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "nestsLastRefreshRequestDateTime", "F", "nestsLastRefreshDateTime", "areaStatesByRideId", "La94;", "La94;", "mutableParkingNests", "mutableCurrentParkingNestData", "A", "mutableCurrentRiderBannerArea", "B", "mutableRestrictedAreaUserIsIn", "mutableAreasUserIsIn", "mutableAreaToEntryTime", "E", "mutableAreaLastRefreshDateTime", "mutableAreaLastRefreshRequestDateTime", "mutableNestLastRefreshDateTime", "H", "mutableNestLastRefreshRequestDateTime", "mutableAreaStatesByRideId", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "refreshRequests", "K", "refreshNestRequests", "areaStatesRefreshRequests", "Lcom/google/android/gms/location/LocationRequest;", "Lcom/google/android/gms/location/LocationRequest;", "sharedRiderAreaLocationUpdateRequest", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "areaJtsRegionCache", "Ljava/util/concurrent/atomic/AtomicBoolean;", "S", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracing", "Lio/reactivex/Observable;", "sharedRiderAreaState", "<init>", "(LOn;LiF3;LTq4;Ldr4;LYR4;Lot5;LTL;Lgl;LEa;LaM;)V", "U", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,642:1\n52#2,2:643\n180#3:645\n161#3:646\n199#3:647\n1747#4,3:648\n1054#4:651\n288#4,2:652\n766#4:654\n857#4,2:655\n288#4,2:657\n1549#4:659\n1620#4,3:660\n1549#4:663\n1620#4,3:664\n766#4:672\n857#4,2:673\n1194#4,2:675\n1222#4,4:677\n288#4,2:683\n1#5:667\n1229#6,2:668\n1229#6,2:670\n215#7,2:681\n215#7,2:685\n*S KotlinDebug\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl\n*L\n140#1:643,2\n196#1:645\n224#1:646\n248#1:647\n344#1:648,3\n416#1:651\n422#1:652,2\n428#1:654\n428#1:655,2\n429#1:657,2\n433#1:659\n433#1:660,3\n434#1:663\n434#1:664,3\n485#1:672\n485#1:673,2\n486#1:675,2\n486#1:677,4\n535#1:683,2\n465#1:668,2\n466#1:670,2\n493#1:681,2\n591#1:685,2\n*E\n"})
/* renamed from: Fn */
/* loaded from: classes4.dex */
public final class C2422Fn implements InterfaceC12495bn, InterfaceC38798br4 {

    /* renamed from: U */
    public static final C2458j f10113U = new C2458j(null);

    /* renamed from: A */
    public final C37791a94<Optional<Area>> f10114A;

    /* renamed from: B */
    public final C37791a94<Optional<Area>> f10115B;

    /* renamed from: C */
    public final C37791a94<List<Area>> f10116C;

    /* renamed from: D */
    public final C37791a94<Map<Area, DateTime>> f10117D;

    /* renamed from: E */
    public final C37791a94<Optional<DateTime>> f10118E;

    /* renamed from: F */
    public final C37791a94<Optional<DateTime>> f10119F;

    /* renamed from: G */
    public final C37791a94<Optional<DateTime>> f10120G;

    /* renamed from: H */
    public final C37791a94<Optional<DateTime>> f10121H;

    /* renamed from: I */
    public final C37791a94<Map<String, LocationAreaState>> f10122I;

    /* renamed from: J */
    public final C24558d<C5691Nn> f10123J;

    /* renamed from: K */
    public final C24558d<Unit> f10124K;

    /* renamed from: P */
    public final C24558d<Unit> f10125P;

    /* renamed from: Q */
    public final LocationRequest f10126Q;

    /* renamed from: R */
    public final LruCache<String, WB1> f10127R;

    /* renamed from: S */
    public final AtomicBoolean f10128S;

    /* renamed from: T */
    public final Observable<RiderAreaState> f10129T;

    /* renamed from: b */
    public final InterfaceC6137On f10130b;

    /* renamed from: c */
    public final InterfaceC42606iF3 f10131c;

    /* renamed from: d */
    public final C36207Tq4 f10132d;

    /* renamed from: e */
    public final InterfaceC40001dr4 f10133e;

    /* renamed from: f */
    public final YR4 f10134f;

    /* renamed from: g */
    public final InterfaceC46545ot5 f10135g;

    /* renamed from: h */
    public final InterfaceC7807TL f10136h;

    /* renamed from: i */
    public final C22454gl f10137i;

    /* renamed from: j */
    public final InterfaceC1880Ea f10138j;

    /* renamed from: k */
    public final InterfaceC10636aM f10139k;

    /* renamed from: l */
    public final Lazy f10140l;

    /* renamed from: m */
    public final Lazy f10141m;

    /* renamed from: n */
    public final Lazy f10142n;

    /* renamed from: o */
    public final Lazy f10143o;

    /* renamed from: p */
    public final Lazy f10144p;

    /* renamed from: q */
    public final Lazy f10145q;

    /* renamed from: r */
    public RiderAreaState f10146r;

    /* renamed from: s */
    public final Lazy f10147s;

    /* renamed from: t */
    public final Lazy f10148t;

    /* renamed from: u */
    public final Lazy f10149u;

    /* renamed from: v */
    public final Lazy f10150v;

    /* renamed from: w */
    public final Lazy f10151w;

    /* renamed from: x */
    public final Lazy f10152x;

    /* renamed from: y */
    public final C37791a94<List<ParkingNest>> f10153y;

    /* renamed from: z */
    public final C37791a94<Optional<ParkingNestData>> f10154z;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl\n*L\n1#1,328:1\n416#2:329\n*E\n"})
    /* renamed from: Fn$A */
    /* loaded from: classes4.dex */
    public static final class C2423A<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((Area) t2).getDemandLevel(), ((Area) t).getDemandLevel());
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/ParkingNest;", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)LHM4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$nearbyParkingNests$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,642:1\n1549#2:643\n1620#2,3:644\n*S KotlinDebug\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$nearbyParkingNests$1\n*L\n300#1:643\n300#1:644,3\n*E\n"})
    /* renamed from: Fn$B */
    /* loaded from: classes4.dex */
    public static final class C2424B extends Lambda implements Function1<HM4<List<? extends ParkingNest>>, HM4<List<? extends ParkingNest>>> {

        /* renamed from: g */
        public static final C2424B f10155g = new C2424B();

        public C2424B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final HM4<List<ParkingNest>> invoke(HM4<List<ParkingNest>> response) {
            ArrayList arrayList;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                int m103943b = response.m103943b();
                List<ParkingNest> m103944a = response.m103944a();
                if (m103944a != null) {
                    List<ParkingNest> list = m103944a;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault);
                    for (ParkingNest parkingNest : list) {
                        if (parkingNest.getShape().numPoints() == 0) {
                            parkingNest = parkingNest.copy((r30 & 1) != 0 ? parkingNest.f66609id : null, (r30 & 2) != 0 ? parkingNest.name : null, (r30 & 4) != 0 ? parkingNest.photos : null, (r30 & 8) != 0 ? parkingNest.notes : null, (r30 & 16) != 0 ? parkingNest.location : null, (r30 & 32) != 0 ? parkingNest.radius : 0.0d, (r30 & 64) != 0 ? parkingNest.shape : C32866Fj2.m106644b(parkingNest.getLocation().fromLocation(), parkingNest.getRadius()), (r30 & 128) != 0 ? parkingNest.arPolygons : null, (r30 & 256) != 0 ? parkingNest.parkingIncentiveValue : 0L, (r30 & 512) != 0 ? parkingNest.address : null, (r30 & 1024) != 0 ? parkingNest.showsInventoryToRiders : null, (r30 & 2048) != 0 ? parkingNest.availableParkingCapacity : null);
                        }
                        arrayList.add(parkingNest);
                    }
                } else {
                    arrayList = null;
                }
                return HM4.m103936i(m103943b, arrayList);
            }
            return response;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$C */
    /* loaded from: classes4.dex */
    public static final class C2425C extends Lambda implements Function1<HM4<List<? extends ParkingNest>>, Unit> {
        public C2425C() {
            super(1);
        }

        /* renamed from: a */
        public final void m106513a(HM4<List<ParkingNest>> hm4) {
            List<ParkingNest> m103944a = hm4.m103944a();
            if (m103944a != null) {
                C2422Fn.this.f10153y.accept(m103944a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends ParkingNest>> hm4) {
            m106513a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$D */
    /* loaded from: classes4.dex */
    public static final class C2426D extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C2426D() {
            super(1);
        }

        /* renamed from: a */
        public final void m106512a(InterfaceC23465c interfaceC23465c) {
            C37791a94 c37791a94 = C2422Fn.this.f10121H;
            Optional.C14443a c14443a = Optional.f63040c;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            c37791a94.accept(c14443a.m59032c(now));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m106512a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$E */
    /* loaded from: classes4.dex */
    public static final class C2427E extends Lambda implements Function1<HM4<List<? extends ParkingNest>>, Unit> {
        public C2427E() {
            super(1);
        }

        /* renamed from: a */
        public final void m106511a(HM4<List<ParkingNest>> hm4) {
            C37791a94 c37791a94 = C2422Fn.this.f10120G;
            Optional.C14443a c14443a = Optional.f63040c;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            c37791a94.accept(c14443a.m59032c(now));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends ParkingNest>> hm4) {
            m106511a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$F */
    /* loaded from: classes4.dex */
    public static final class C2428F extends Lambda implements Function0<Z84<Optional<DateTime>>> {
        public C2428F() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<DateTime>> invoke() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10120G);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$G */
    /* loaded from: classes4.dex */
    public static final class C2429G extends Lambda implements Function0<Z84<Optional<DateTime>>> {
        public C2429G() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<DateTime>> invoke() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10121H);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/ParkingNest;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$H */
    /* loaded from: classes4.dex */
    public static final class C2430H extends Lambda implements Function0<Z84<List<? extends ParkingNest>>> {
        public C2430H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends ParkingNest>> invoke2() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10153y);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$I */
    /* loaded from: classes4.dex */
    public static final class C2431I extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C2431I() {
            super(1);
        }

        /* renamed from: a */
        public final void m106510a(InterfaceC23465c interfaceC23465c) {
            C37791a94 c37791a94 = C2422Fn.this.f10119F;
            Optional.C14443a c14443a = Optional.f63040c;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            c37791a94.accept(c14443a.m59032c(now));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m106510a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$J */
    /* loaded from: classes4.dex */
    public static final class C2432J extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C2432J() {
            super(1);
        }

        /* renamed from: a */
        public final void m106509a(InterfaceC23465c interfaceC23465c) {
            C37791a94 c37791a94 = C2422Fn.this.f10119F;
            Optional.C14443a c14443a = Optional.f63040c;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            c37791a94.accept(c14443a.m59032c(now));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m106509a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$K */
    /* loaded from: classes4.dex */
    public static final class C2433K extends Lambda implements Function1<List<? extends OperatorFilter>, OperatorMapFilterBundle> {

        /* renamed from: g */
        public static final C2433K f10164g = new C2433K();

        public C2433K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OperatorMapFilterBundle invoke(List<? extends OperatorFilter> filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            return C52473yt5.m2323c(filters);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;", "filtersRequest", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$L */
    /* loaded from: classes4.dex */
    public static final class C2434L extends Lambda implements Function1<OperatorMapFilterBundle, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ Location f10166h;

        /* renamed from: i */
        public final /* synthetic */ double f10167i;

        /* renamed from: j */
        public final /* synthetic */ List<Geolocation> f10168j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2434L(Location location, double d, List<Geolocation> list) {
            super(1);
            this.f10166h = location;
            this.f10167i = d;
            this.f10168j = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(OperatorMapFilterBundle filtersRequest) {
            Intrinsics.checkNotNullParameter(filtersRequest, "filtersRequest");
            return C2422Fn.this.f10130b.mo74274G1(this.f10166h, this.f10167i, filtersRequest, this.f10168j).m33063X(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$M */
    /* loaded from: classes4.dex */
    public static final class C2435M extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C2435M() {
            super(1);
        }

        /* renamed from: a */
        public final void m106506a(InterfaceC23465c interfaceC23465c) {
            C37791a94 c37791a94 = C2422Fn.this.f10119F;
            Optional.C14443a c14443a = Optional.f63040c;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            c37791a94.accept(c14443a.m59032c(now));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m106506a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$N */
    /* loaded from: classes4.dex */
    public static final class C2436N extends Lambda implements Function0<Z84<Optional<Area>>> {
        public C2436N() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Area>> invoke() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10115B);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/RiderAreaState;", "kotlin.jvm.PlatformType", "observable", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$O */
    /* loaded from: classes4.dex */
    public static final class C2437O extends Lambda implements Function1<Observable<RiderAreaState>, InterfaceC23434B<RiderAreaState>> {

        /* renamed from: g */
        public static final C2437O f10171g = new C2437O();

        public C2437O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<RiderAreaState> invoke(Observable<RiderAreaState> observable) {
            Intrinsics.checkNotNullParameter(observable, "observable");
            return observable.subscribeOn(C24542a.m31934a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/location/Location;", "it", "", C17296a.f69688o, "(Landroid/location/Location;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$P */
    /* loaded from: classes4.dex */
    public static final class C2438P extends Lambda implements Function1<Location, Boolean> {

        /* renamed from: g */
        public static final C2438P f10172g = new C2438P();

        public C2438P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Location it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "key", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fn$Q */
    /* loaded from: classes4.dex */
    public static final class C2439Q extends Lambda implements Function1<Location, Pair<? extends Pair<? extends Double, ? extends Double>, ? extends Float>> {

        /* renamed from: g */
        public static final C2439Q f10173g = new C2439Q();

        public C2439Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<Pair<Double, Double>, Float> invoke(Location key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return TuplesKt.m28425to(TuplesKt.m28425to(Double.valueOf(key.getLatitude()), Double.valueOf(key.getLongitude())), Float.valueOf(key.getAccuracy()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/Area;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fn$R */
    /* loaded from: classes4.dex */
    public static final class C2440R extends Lambda implements Function1<Pair<? extends Location, ? extends List<? extends Area>>, Unit> {
        public C2440R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Location, ? extends List<? extends Area>> pair) {
            invoke2((Pair<? extends Location, ? extends List<Area>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Location, ? extends List<Area>> pair) {
            C2422Fn.this.m106564X1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062 \u0010\u0005\u001a\u001c\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/Area;", "<name for destructuring parameter 0>", "Lco/bird/android/model/RiderAreaState;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/RiderAreaState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$S */
    /* loaded from: classes4.dex */
    public static final class C2441S extends Lambda implements Function1<Pair<? extends Location, ? extends List<? extends Area>>, RiderAreaState> {
        public C2441S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RiderAreaState invoke(Pair<? extends Location, ? extends List<Area>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C2422Fn c2422Fn = C2422Fn.this;
            return c2422Fn.m106573O1(c2422Fn.f10133e.mo43616p().m73665a(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RiderAreaState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RiderAreaState;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$T */
    /* loaded from: classes4.dex */
    public static final class C2442T extends Lambda implements Function1<RiderAreaState, Unit> {
        public C2442T() {
            super(1);
        }

        /* renamed from: a */
        public final void m106503a(RiderAreaState riderAreaState) {
            C2422Fn.this.f10125P.onNext(Unit.INSTANCE);
            C2422Fn.this.m106537m2(riderAreaState);
            C2422Fn.this.m106563Y1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RiderAreaState riderAreaState) {
            m106503a(riderAreaState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Fn$U */
    /* loaded from: classes4.dex */
    public static final class C2443U<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C2443U<T1, T2, R> f10177a = new C2443U<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$a */
    /* loaded from: classes4.dex */
    public static final class C2444a extends Lambda implements Function1<Optional<List<? extends OperatorFilter>>, Unit> {
        public C2444a() {
            super(1);
        }

        /* renamed from: a */
        public final void m106501a(Optional<List<OperatorFilter>> optional) {
            C2422Fn.this.mo64004a0(new C5691Nn(null, null, 3, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<List<? extends OperatorFilter>> optional) {
            m106501a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/RideStates;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$b */
    /* loaded from: classes4.dex */
    public static final class C2445b extends Lambda implements Function1<Unit, RideStates> {
        public C2445b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RideStates invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C2422Fn.this.f10134f.mo75032o0().m73665a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "rideStates", "Lio/reactivex/K;", "", "", "Lco/bird/android/model/LocationAreaState;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/RideStates;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$c */
    /* loaded from: classes4.dex */
    public static final class C2446c extends Lambda implements Function1<RideStates, InterfaceC23447K<? extends Map<String, ? extends LocationAreaState>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/RideState;", "rideState", "Lkotlin/Pair;", "", "Lco/bird/android/model/LocationAreaState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideState;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fn$c$a */
        /* loaded from: classes4.dex */
        public static final class C2447a extends Lambda implements Function1<RideState, Pair<? extends String, ? extends LocationAreaState>> {

            /* renamed from: g */
            public final /* synthetic */ C2422Fn f10181g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2447a(C2422Fn c2422Fn) {
                super(1);
                this.f10181g = c2422Fn;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<String, LocationAreaState> invoke(RideState rideState) {
                Intrinsics.checkNotNullParameter(rideState, "rideState");
                String id = rideState.getRide().getId();
                C2422Fn c2422Fn = this.f10181g;
                return TuplesKt.m28425to(id, C2422Fn.m106574N1(c2422Fn, rideState, c2422Fn.f10133e.mo43616p().m73665a(), this.f10181g.mo63995r().m73665a(), false, 8, null));
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00070\u00072X\u0010\u0006\u001aT\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lkotlin/Pair;", "", "Lco/bird/android/model/LocationAreaState;", "kotlin.jvm.PlatformType", "", "pairs", "", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fn$c$b */
        /* loaded from: classes4.dex */
        public static final class C2448b extends Lambda implements Function1<List<Pair<? extends String, ? extends LocationAreaState>>, Map<String, ? extends LocationAreaState>> {

            /* renamed from: g */
            public static final C2448b f10182g = new C2448b();

            public C2448b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Map<String, LocationAreaState> invoke(List<Pair<String, LocationAreaState>> pairs) {
                Map<String, LocationAreaState> map;
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                map = MapsKt__MapsKt.toMap(pairs);
                return map;
            }
        }

        public C2446c() {
            super(1);
        }

        /* renamed from: d */
        public static final Map m106496d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Map) tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Map<String, LocationAreaState>> invoke(RideStates rideStates) {
            Intrinsics.checkNotNullParameter(rideStates, "rideStates");
            Observable observeOn = Observable.fromIterable(rideStates.getRideStates()).subscribeOn(C24542a.m31934a()).observeOn(C24542a.m31934a());
            final C2447a c2447a = new C2447a(C2422Fn.this);
            AbstractC23442F list = observeOn.map(new InterfaceC23492o() { // from class: Gn
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C2422Fn.C2446c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).toList();
            final C2448b c2448b = C2448b.f10182g;
            return list.m33157I(new InterfaceC23492o() { // from class: Hn
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Map m106496d;
                    m106496d = C2422Fn.C2446c.m106496d(Function1.this, obj);
                    return m106496d;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fn$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C2449d extends FunctionReferenceImpl implements Function1<Map<String, ? extends LocationAreaState>, Unit> {
        public C2449d(Object obj) {
            super(1, obj, C37791a94.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m106493a(Map<String, LocationAreaState> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37791a94) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends LocationAreaState> map) {
            m106493a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fn$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C2450e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2450e f10183b = new C2450e();

        public C2450e() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
    /* renamed from: Fn$f */
    /* loaded from: classes4.dex */
    public static final class C2451f extends Lambda implements Function1<Optional<DateTime>, DateTime> {
        public C2451f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DateTime invoke(Optional<DateTime> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            DateTime m59035e = it.m59035e();
            if (m59035e != null) {
                if (C2422Fn.this.f10137i.m37571t0() == MapMode.RIDER) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return m59035e;
                }
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lorg/joda/time/DateTime;", "firstRefreshTime", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "c", "(Lorg/joda/time/DateTime;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$g */
    /* loaded from: classes4.dex */
    public static final class C2452g extends Lambda implements Function1<DateTime, InterfaceC23447K<? extends Integer>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Fn$g$a */
        /* loaded from: classes4.dex */
        public static final class C2453a extends Lambda implements Function1<Config, Boolean> {

            /* renamed from: g */
            public static final C2453a f10186g = new C2453a();

            public C2453a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Config it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MapGeocacheConfig clientZoneGeocacheConfig = it.getRiderMapConfig().getClientZoneGeocacheConfig();
                return Boolean.valueOf(clientZoneGeocacheConfig != null ? Intrinsics.areEqual(clientZoneGeocacheConfig.getEnabled(), Boolean.TRUE) : false);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "cellBasedAreaLookupsEnabled", "Lorg/joda/time/DateTime;", C17296a.f69688o, "(Ljava/lang/Boolean;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$7$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
        /* renamed from: Fn$g$b */
        /* loaded from: classes4.dex */
        public static final class C2454b extends Lambda implements Function1<Boolean, DateTime> {

            /* renamed from: g */
            public final /* synthetic */ DateTime f10187g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2454b(DateTime dateTime) {
                super(1);
                this.f10187g = dateTime;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final DateTime invoke(Boolean cellBasedAreaLookupsEnabled) {
                DateTime dateTime = this.f10187g;
                Intrinsics.checkNotNullExpressionValue(cellBasedAreaLookupsEnabled, "cellBasedAreaLookupsEnabled");
                if (!cellBasedAreaLookupsEnabled.booleanValue()) {
                    dateTime = null;
                }
                if (dateTime != null) {
                    return dateTime.minusMinutes(20);
                }
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lorg/joda/time/DateTime;", "firstRefreshTime", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lorg/joda/time/DateTime;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fn$g$c */
        /* loaded from: classes4.dex */
        public static final class C2455c extends Lambda implements Function1<DateTime, InterfaceC23447K<? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ C2422Fn f10188g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2455c(C2422Fn c2422Fn) {
                super(1);
                this.f10188g = c2422Fn;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends Integer> invoke(DateTime firstRefreshTime) {
                Intrinsics.checkNotNullParameter(firstRefreshTime, "firstRefreshTime");
                return this.f10188g.f10130b.mo74251d1(MapMode.RIDER, firstRefreshTime);
            }
        }

        public C2452g() {
            super(1);
        }

        /* renamed from: d */
        public static final Boolean m106488d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final InterfaceC23447K m106487e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Integer> invoke(DateTime firstRefreshTime) {
            Intrinsics.checkNotNullParameter(firstRefreshTime, "firstRefreshTime");
            Z84<Config> m82623f8 = C2422Fn.this.f10132d.m82623f8();
            final C2453a c2453a = C2453a.f10186g;
            Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: In
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m106488d;
                    m106488d = C2422Fn.C2452g.m106488d(Function1.this, obj);
                    return m106488d;
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config.ma…  .distinctUntilChanged()");
            AbstractC24507p firstElement = C37279Yf5.m74575T(distinctUntilChanged, new C2454b(firstRefreshTime)).firstElement();
            final C2455c c2455c = new C2455c(C2422Fn.this);
            return firstElement.m32072C(new InterfaceC23492o() { // from class: Jn
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m106487e;
                    m106487e = C2422Fn.C2452g.m106487e(Function1.this, obj);
                    return m106487e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fn$h */
    /* loaded from: classes4.dex */
    public static final class C2456h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2456h f10189g = new C2456h();

        public C2456h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while trying to trim cell backed areas: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "deleted", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fn$i */
    /* loaded from: classes4.dex */
    public static final class C2457i extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public static final C2457i f10190g = new C2457i();

        public C2457i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            C41318g46.m40163a("Trimmed a total of " + num + " rows (-1 means error)", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LFn$j;", "", "", "AREA_REFRESH_THROTTLE_SECONDS", "J", "", "JTS_REGION_MAX_CACHE_SIZE", "I", "PROFILE_TRACE_THROTTLE_MILLIS", "<init>", "()V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fn$j */
    /* loaded from: classes4.dex */
    public static final class C2458j {
        public /* synthetic */ C2458j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2458j() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LFn$k;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/Point;", C17296a.f69688o, "Lco/bird/android/model/Point;", "()Lco/bird/android/model/Point;", "center", "Lco/bird/android/model/persistence/Area;", "b", "Lco/bird/android/model/persistence/Area;", "getArea", "()Lco/bird/android/model/persistence/Area;", "area", "<init>", "(Lco/bird/android/model/Point;Lco/bird/android/model/persistence/Area;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Fn$k */
    /* loaded from: classes4.dex */
    public static final class C2459k {

        /* renamed from: a */
        public final Point f10191a;

        /* renamed from: b */
        public final Area f10192b;

        public C2459k(Point center, Area area) {
            Intrinsics.checkNotNullParameter(center, "center");
            Intrinsics.checkNotNullParameter(area, "area");
            this.f10191a = center;
            this.f10192b = area;
        }

        /* renamed from: a */
        public final Point m106484a() {
            return this.f10191a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2459k) {
                C2459k c2459k = (C2459k) obj;
                return Intrinsics.areEqual(this.f10191a, c2459k.f10191a) && Intrinsics.areEqual(this.f10192b, c2459k.f10192b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f10191a.hashCode() * 31) + this.f10192b.hashCode();
        }

        public String toString() {
            Point point = this.f10191a;
            Area area = this.f10192b;
            return "DemandAreaCenter(center=" + point + ", area=" + area + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "", "", "Lco/bird/android/model/LocationAreaState;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$l */
    /* loaded from: classes4.dex */
    public static final class C2460l extends Lambda implements Function0<Z84<Map<String, ? extends LocationAreaState>>> {
        public C2460l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<String, ? extends LocationAreaState>> invoke2() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10122I);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$m */
    /* loaded from: classes4.dex */
    public static final class C2461m extends Lambda implements Function0<Z84<Optional<DateTime>>> {
        public C2461m() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<DateTime>> invoke() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10118E);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$n */
    /* loaded from: classes4.dex */
    public static final class C2462n extends Lambda implements Function0<Z84<Optional<DateTime>>> {
        public C2462n() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<DateTime>> invoke() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10119F);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/Area;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$o */
    /* loaded from: classes4.dex */
    public static final class C2463o extends Lambda implements Function0<Z84<List<? extends Area>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "role", "Lio/reactivex/B;", "", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fn$o$a */
        /* loaded from: classes4.dex */
        public static final class C2464a extends Lambda implements Function1<String, InterfaceC23434B<? extends List<? extends Area>>> {

            /* renamed from: g */
            public final /* synthetic */ C2422Fn f10197g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2464a(C2422Fn c2422Fn) {
                super(1);
                this.f10197g = c2422Fn;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23434B<? extends List<Area>> invoke(String role) {
                Intrinsics.checkNotNullParameter(role, "role");
                return this.f10197g.f10130b.mo74247z1(role).m32113r1();
            }
        }

        public C2463o() {
            super(0);
        }

        /* renamed from: b */
        public static final InterfaceC23434B m106482b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends Area>> invoke2() {
            List emptyList;
            Z84.C10119a c10119a = Z84.f47888d;
            Observable<String> m37746C0 = C2422Fn.this.f10137i.m37746C0();
            final C2464a c2464a = new C2464a(C2422Fn.this);
            Object switchMap = m37746C0.switchMap(new InterfaceC23492o() { // from class: Kn
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m106482b;
                    m106482b = C2422Fn.C2463o.m106482b(Function1.this, obj);
                    return m106482b;
                }
            });
            Intrinsics.checkNotNullExpressionValue(switchMap, "class AreaManagerImpl @I…e.put(id, region) }\n  }\n}");
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return c10119a.m73662c(switchMap, emptyList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$p */
    /* loaded from: classes4.dex */
    public static final class C2465p extends Lambda implements Function0<Z84<List<? extends Area>>> {
        public C2465p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends Area>> invoke2() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10116C);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/persistence/Area;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$q */
    /* loaded from: classes4.dex */
    public static final class C2466q extends Lambda implements Function0<Z84<Map<Area, ? extends DateTime>>> {
        public C2466q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<Area, ? extends DateTime>> invoke2() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10117D);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/ParkingNestData;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$r */
    /* loaded from: classes4.dex */
    public static final class C2467r extends Lambda implements Function0<Z84<Optional<ParkingNestData>>> {
        public C2467r() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<ParkingNestData>> invoke() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10154z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/Area;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$s */
    /* loaded from: classes4.dex */
    public static final class C2468s extends Lambda implements Function0<Z84<Optional<Area>>> {
        public C2468s() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Area>> invoke() {
            return Z84.f47888d.m73663b(C2422Fn.this.f10114A);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/Area;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$determineRiderAreaState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
    /* renamed from: Fn$t */
    /* loaded from: classes4.dex */
    public static final class C2469t extends Lambda implements Function1<Optional<Area>, Optional<Area>> {

        /* renamed from: g */
        public final /* synthetic */ LocationAreaState f10202g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2469t(LocationAreaState locationAreaState) {
            super(1);
            this.f10202g = locationAreaState;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Area> invoke(Optional<Area> it) {
            Object firstOrNull;
            Area area;
            Intrinsics.checkNotNullParameter(it, "it");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(this.f10202g.getRestrictedParkingAreas());
            String str = (String) firstOrNull;
            if (str != null) {
                area = this.f10202g.getAreasWithin().get(str);
            } else {
                area = null;
            }
            return Optional.f63040c.m59033b(area);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/Area;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$determineRiderAreaState$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
    /* renamed from: Fn$u */
    /* loaded from: classes4.dex */
    public static final class C2470u extends Lambda implements Function1<Optional<Area>, Optional<Area>> {

        /* renamed from: g */
        public final /* synthetic */ LocationAreaState f10203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2470u(LocationAreaState locationAreaState) {
            super(1);
            this.f10203g = locationAreaState;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Area> invoke(Optional<Area> it) {
            Object firstOrNull;
            Area area;
            Intrinsics.checkNotNullParameter(it, "it");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(this.f10203g.getWarningAreas());
            String str = (String) firstOrNull;
            if (str != null) {
                area = this.f10203g.getAreasWithin().get(str);
            } else {
                area = null;
            }
            return Optional.f63040c.m59033b(area);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Area;", "it", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$v */
    /* loaded from: classes4.dex */
    public static final class C2471v extends Lambda implements Function1<List<? extends Area>, List<? extends Area>> {

        /* renamed from: g */
        public final /* synthetic */ LocationAreaState f10204g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2471v(LocationAreaState locationAreaState) {
            super(1);
            this.f10204g = locationAreaState;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Area> invoke(List<Area> it) {
            List<Area> list;
            Intrinsics.checkNotNullParameter(it, "it");
            list = CollectionsKt___CollectionsKt.toList(this.f10204g.getAreasWithin().values());
            return list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Area;", "Lorg/joda/time/DateTime;", "it", C17296a.f69688o, "(Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAreaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$determineRiderAreaState$5\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,642:1\n467#2,7:643\n*S KotlinDebug\n*F\n+ 1 AreaManagerImpl.kt\nco/bird/android/manager/ride/AreaManagerImpl$determineRiderAreaState$5\n*L\n610#1:643,7\n*E\n"})
    /* renamed from: Fn$w */
    /* loaded from: classes4.dex */
    public static final class C2472w extends Lambda implements Function1<Map<Area, ? extends DateTime>, Map<Area, ? extends DateTime>> {

        /* renamed from: g */
        public final /* synthetic */ Map<Area, DateTime> f10205g;

        /* renamed from: h */
        public final /* synthetic */ LocationAreaState f10206h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2472w(Map<Area, DateTime> map, LocationAreaState locationAreaState) {
            super(1);
            this.f10205g = map;
            this.f10206h = locationAreaState;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<Area, DateTime> invoke(Map<Area, DateTime> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Map<Area, DateTime> map = this.f10205g;
            LocationAreaState locationAreaState = this.f10206h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Area, DateTime> entry : map.entrySet()) {
                if (locationAreaState.getAreasWithin().containsValue(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Area;", "area", "Lco/bird/android/model/ParkingType;", C17296a.f69688o, "(Lco/bird/android/model/persistence/Area;)Lco/bird/android/model/ParkingType;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$x */
    /* loaded from: classes4.dex */
    public static final class C2473x extends Lambda implements Function1<Area, ParkingType> {

        /* renamed from: h */
        public final /* synthetic */ Location f10208h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2473x(Location location) {
            super(1);
            this.f10208h = location;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ParkingType invoke(Area area) {
            Intrinsics.checkNotNullParameter(area, "area");
            if (C2422Fn.this.m106578J1(area, this.f10208h)) {
                if (area.getPreferredParking()) {
                    return ParkingType.PREFERRED_PARKING;
                }
                if (area.getNoParking()) {
                    return ParkingType.NO_PARKING;
                }
                return ParkingType.NONE;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/location/Location;", "location", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$y */
    /* loaded from: classes4.dex */
    public static final class C2474y extends Lambda implements Function1<Location, Optional<Integer>> {
        public C2474y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Integer> invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return C2422Fn.this.m106567U1(location);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/location/Location;", "location", "Lco/bird/android/model/DemandAreaAnalyticsInfo;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/location/Location;)Lco/bird/android/model/DemandAreaAnalyticsInfo;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fn$z */
    /* loaded from: classes4.dex */
    public static final class C2475z extends Lambda implements Function1<Location, DemandAreaAnalyticsInfo> {
        public C2475z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DemandAreaAnalyticsInfo invoke(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return new DemandAreaAnalyticsInfo(C2422Fn.this.m106567U1(location), C2422Fn.this.m106566V1(location));
        }
    }

    public C2422Fn(InterfaceC6137On areaRepository, InterfaceC42606iF3 parkingClient, C36207Tq4 reactiveConfig, InterfaceC40001dr4 reactiveLocationManager, YR4 rideManager, InterfaceC46545ot5 serverDrivenFilterManager, InterfaceC7807TL birdLocationManager, C22454gl preference, InterfaceC1880Ea analyticsManager, InterfaceC10636aM birdManager) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        Lazy lazy10;
        Lazy lazy11;
        Lazy lazy12;
        List emptyList;
        List emptyList2;
        Map emptyMap;
        Map emptyMap2;
        Intrinsics.checkNotNullParameter(areaRepository, "areaRepository");
        Intrinsics.checkNotNullParameter(parkingClient, "parkingClient");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(reactiveLocationManager, "reactiveLocationManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(birdLocationManager, "birdLocationManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        this.f10130b = areaRepository;
        this.f10131c = parkingClient;
        this.f10132d = reactiveConfig;
        this.f10133e = reactiveLocationManager;
        this.f10134f = rideManager;
        this.f10135g = serverDrivenFilterManager;
        this.f10136h = birdLocationManager;
        this.f10137i = preference;
        this.f10138j = analyticsManager;
        this.f10139k = birdManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C2463o());
        this.f10140l = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C2430H());
        this.f10141m = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C2467r());
        this.f10142n = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C2468s());
        this.f10143o = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C2436N());
        this.f10144p = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new C2465p());
        this.f10145q = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new C2466q());
        this.f10147s = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new C2462n());
        this.f10148t = lazy8;
        lazy9 = LazyKt__LazyJVMKt.lazy(new C2461m());
        this.f10149u = lazy9;
        lazy10 = LazyKt__LazyJVMKt.lazy(new C2429G());
        this.f10150v = lazy10;
        lazy11 = LazyKt__LazyJVMKt.lazy(new C2428F());
        this.f10151w = lazy11;
        lazy12 = LazyKt__LazyJVMKt.lazy(new C2460l());
        this.f10152x = lazy12;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f10153y = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        Optional.C14443a c14443a = Optional.f63040c;
        this.f10154z = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f10114A = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f10115B = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        this.f10116C = C37791a94.C10586a.create$default(c10586a, emptyList2, null, 2, null);
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f10117D = C37791a94.C10586a.create$default(c10586a, emptyMap, null, 2, null);
        this.f10118E = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f10119F = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f10120G = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f10121H = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        C37791a94<Map<String, LocationAreaState>> create$default = C37791a94.C10586a.create$default(c10586a, emptyMap2, null, 2, null);
        this.f10122I = create$default;
        C24558d<C5691Nn> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<AreaRefreshRequest>()");
        this.f10123J = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f10124K = m31902e2;
        C24558d<Unit> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Unit>()");
        this.f10125P = m31902e3;
        LocationRequest smallestDisplacement = LocationRequest.create().setPriority(100).setInterval(1000L).setFastestInterval(1000L).setSmallestDisplacement(0.0f);
        Intrinsics.checkNotNullExpressionValue(smallestDisplacement, "create()\n    .setPriorit…tSmallestDisplacement(0f)");
        this.f10126Q = smallestDisplacement;
        this.f10127R = new LruCache<>(500);
        this.f10128S = new AtomicBoolean(false);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Location> mo43610v = reactiveLocationManager.mo43610v(smallestDisplacement, true);
        final C2438P c2438p = C2438P.f10172g;
        Observable merge = Observable.merge(mo43610v.filter(new InterfaceC23494q() { // from class: Bn
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m106535n2;
                m106535n2 = C2422Fn.m106535n2(Function1.this, obj);
                return m106535n2;
            }
        }), reactiveLocationManager.mo43616p());
        final C2439Q c2439q = C2439Q.f10173g;
        Observable distinctUntilChanged = merge.distinctUntilChanged(new InterfaceC23492o() { // from class: en
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m106533o2;
                m106533o2 = C2422Fn.m106533o2(Function1.this, obj);
                return m106533o2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "merge(\n      reactiveLoc…ngitude to key.accuracy }");
        Observable combineLatest = Observable.combineLatest(distinctUntilChanged, mo63995r(), C2443U.f10177a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        EnumC23460b enumC23460b = EnumC23460b.LATEST;
        AbstractC24490k flowable = combineLatest.toFlowable(enumC23460b);
        final C2440R c2440r = new C2440R();
        AbstractC24490k m32111s0 = flowable.m32191K(new InterfaceC23484g() { // from class: fn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106532p2(Function1.this, obj);
            }
        }).m32111s0(C24542a.m31934a());
        final C2441S c2441s = new C2441S();
        AbstractC24490k m32203E = m32111s0.m32117q0(new InterfaceC23492o() { // from class: gn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RiderAreaState m106530q2;
                m106530q2 = C2422Fn.m106530q2(Function1.this, obj);
                return m106530q2;
            }
        }).m32203E(new InterfaceC23478a() { // from class: hn
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2422Fn.m106528r2(C2422Fn.this);
            }
        });
        final C2442T c2442t = new C2442T();
        Observable<RiderAreaState> m32084i = m32203E.m32191K(new InterfaceC23484g() { // from class: in
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106525s2(Function1.this, obj);
            }
        }).m32113r1().replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "Observables.combineLates…replay(1)\n    .refCount()");
        this.f10129T = m32084i;
        Observable<Optional<List<OperatorFilter>>> skip = serverDrivenFilterManager.mo6178e().skip(1L);
        Intrinsics.checkNotNullExpressionValue(skip, "serverDrivenFilterManage…torFilters\n      .skip(1)");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = skip.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2444a c2444a = new C2444a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: jn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106581G1(Function1.this, obj);
            }
        });
        AbstractC24490k<Unit> m32111s02 = m31902e3.toFlowable(enumC23460b).m32111s0(C24542a.m31934a());
        final C2445b c2445b = new C2445b();
        AbstractC24490k<R> m32117q0 = m32111s02.m32117q0(new InterfaceC23492o() { // from class: kn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RideStates m106580H1;
                m106580H1 = C2422Fn.m106580H1(Function1.this, obj);
                return m106580H1;
            }
        });
        final C2446c c2446c = new C2446c();
        AbstractC24490k m32149f0 = m32117q0.m32149f0(new InterfaceC23492o() { // from class: ln
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106579I1;
                m106579I1 = C2422Fn.m106579I1(Function1.this, obj);
                return m106579I1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32149f0, "areaStatesRefreshRequest…Map()\n          }\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m32150f = m32149f0.m32150f(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2449d c2449d = new C2449d(create$default);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: mn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106586B1(Function1.this, obj);
            }
        };
        final C2450e c2450e = C2450e.f10183b;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Cn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106585C1(Function1.this, obj);
            }
        });
        AbstractC24507p firstElement = C37279Yf5.m74575T(mo63993w(), new C2451f()).firstElement();
        final C2452g c2452g = new C2452g();
        AbstractC23442F m32072C = firstElement.m32072C(new InterfaceC23492o() { // from class: Dn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106584D1;
                m106584D1 = C2422Fn.m106584D1(Function1.this, obj);
                return m106584D1;
            }
        });
        final C2456h c2456h = C2456h.f10189g;
        AbstractC23442F m33148R = m32072C.m33106t(new InterfaceC23484g() { // from class: En
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106583E1(Function1.this, obj);
            }
        }).m33148R(-1);
        Intrinsics.checkNotNullExpressionValue(m33148R, "areasLastRefreshDateTime…   .onErrorReturnItem(-1)");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33135e = m33148R.m33135e(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2457i c2457i = C2457i.f10190g;
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: dn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106582F1(Function1.this, obj);
            }
        });
    }

    /* renamed from: B1 */
    public static final void m106586B1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C1 */
    public static final void m106585C1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D1 */
    public static final InterfaceC23447K m106584D1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E1 */
    public static final void m106583E1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F1 */
    public static final void m106582F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G1 */
    public static final void m106581G1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H1 */
    public static final RideStates m106580H1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RideStates) tmp0.invoke(obj);
    }

    /* renamed from: I1 */
    public static final InterfaceC23447K m106579I1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static /* synthetic */ LocationAreaState m106574N1(C2422Fn c2422Fn, RideState rideState, Location location, List list, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c2422Fn.m106575M1(rideState, location, list, z);
    }

    /* renamed from: S1 */
    public static final Optional m106569S1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final DemandAreaAnalyticsInfo m106568T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DemandAreaAnalyticsInfo) tmp0.invoke(obj);
    }

    /* renamed from: Z1 */
    public static final HM4 m106562Z1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (HM4) tmp0.invoke(obj);
    }

    /* renamed from: a2 */
    public static final void m106561a2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b2 */
    public static final void m106560b2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c2 */
    public static final void m106558c2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d2 */
    public static final void m106557d2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e2 */
    public static final void m106555e2(C2422Fn this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C37791a94<Optional<DateTime>> c37791a94 = this$0.f10118E;
        Optional.C14443a c14443a = Optional.f63040c;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        c37791a94.accept(c14443a.m59032c(now));
    }

    /* renamed from: f2 */
    public static final void m106553f2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g2 */
    public static final void m106550g2(C2422Fn this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C37791a94<Optional<DateTime>> c37791a94 = this$0.f10118E;
        Optional.C14443a c14443a = Optional.f63040c;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        c37791a94.accept(c14443a.m59032c(now));
    }

    /* renamed from: h2 */
    public static final OperatorMapFilterBundle m106547h2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OperatorMapFilterBundle) tmp0.invoke(obj);
    }

    /* renamed from: i2 */
    public static final InterfaceC23496h m106545i2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: j2 */
    public static final void m106543j2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k2 */
    public static final void m106540k2(C2422Fn this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C37791a94<Optional<DateTime>> c37791a94 = this$0.f10118E;
        Optional.C14443a c14443a = Optional.f63040c;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        c37791a94.accept(c14443a.m59032c(now));
    }

    /* renamed from: l2 */
    public static final InterfaceC23434B m106539l2(Function1 tmp0, Observable p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (InterfaceC23434B) tmp0.invoke(p0);
    }

    /* renamed from: n2 */
    public static final boolean m106535n2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o2 */
    public static final Pair m106533o2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: p2 */
    public static final void m106532p2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q2 */
    public static final RiderAreaState m106530q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RiderAreaState) tmp0.invoke(obj);
    }

    /* renamed from: r2 */
    public static final void m106528r2(C2422Fn this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m106563Y1();
    }

    /* renamed from: s2 */
    public static final void m106525s2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: C */
    public Z84<Optional<DateTime>> mo64018C() {
        return (Z84) this.f10150v.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: D */
    public Z84<Optional<DateTime>> mo64017D() {
        return (Z84) this.f10148t.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: F */
    public Z84<Optional<DateTime>> mo64016F() {
        return (Z84) this.f10151w.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: G */
    public void mo64015G(ParkingNestData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f10154z.accept(Optional.f63040c.m59032c(data));
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: I */
    public Observable<C5691Nn> mo64014I() {
        Observable<C5691Nn> hide = this.f10123J.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "refreshRequests.hide()");
        return hide;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: J */
    public ParkingType mo64013J(List<Area> areas, Location location) {
        Intrinsics.checkNotNullParameter(areas, "areas");
        Intrinsics.checkNotNullParameter(location, "location");
        return m106572P1(areas, location);
    }

    /* renamed from: J1 */
    public final boolean m106578J1(Area area, Location location) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        return m106565W1(area).m78751o(C32866Fj2.m106643c(location));
    }

    /* renamed from: K1 */
    public final boolean m106577K1(Area area, WB1 wb1) {
        return m106565W1(area).m78751o(wb1);
    }

    /* renamed from: L1 */
    public final LocationAreaState m106576L1(Config config, Location location, List<Area> list) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        if (list.isEmpty()) {
            return LocationAreaState.Companion.emptyLocationAreaState(C37195Xw2.m76040b(location));
        }
        FW3 m106643c = C32866Fj2.m106643c(location);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m106577K1((Area) obj, m106643c)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((Area) obj2).getId(), obj2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Area area = (Area) entry.getValue();
            if (area.getOperational()) {
                linkedHashSet.add(str);
            }
            if (area.getNoRides()) {
                linkedHashSet2.add(str);
            }
            if (config.getComplianceConfig().getEnableNoParkingAreaWarnings() && area.getNoParkingFineAlertTitle() != null && area.getNoParkingFineAlertMessage() != null) {
                linkedHashSet5.add(str);
            }
            if (area.getNoParking()) {
                linkedHashSet3.add(str);
            }
            if (area.getMaxSpeed() != null) {
                linkedHashSet4.add(str);
            }
            if (C23356io.m33480b(area)) {
                linkedHashSet6.add(str);
            }
        }
        return new LocationAreaState(C37195Xw2.m76040b(location), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, linkedHashSet5, linkedHashSet6);
    }

    /* renamed from: M1 */
    public final LocationAreaState m106575M1(RideState rideState, Location location, List<Area> list, boolean z) {
        WireBird bird;
        WireLocation mo78581a;
        Location fromLocation;
        KeyBasedAreasFilter m106571Q1 = m106571Q1(rideState);
        if (m106571Q1 != null) {
            list = C23356io.m33481a(list, m106571Q1);
        }
        if (!z && (bird = rideState.getRide().getBird()) != null && (mo78581a = this.f10136h.mo78581a(bird)) != null && (fromLocation = mo78581a.fromLocation()) != null) {
            location = fromLocation;
        }
        return m106576L1(rideState.getRideConfig(), location, list);
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: N */
    public AbstractC23442F<Optional<Integer>> mo64012N() {
        AbstractC23442F<Location> m33148R = this.f10133e.mo43627e(false).m33148R(this.f10133e.mo43616p().m73665a());
        final C2474y c2474y = new C2474y();
        AbstractC23442F m33157I = m33148R.m33157I(new InterfaceC23492o() { // from class: sn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m106569S1;
                m106569S1 = C2422Fn.m106569S1(Function1.this, obj);
                return m106569S1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun getCurrentD…DemandLevel()\n      }\n  }");
        return m33157I;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: O */
    public Z84<Map<Area, DateTime>> mo64011O() {
        return (Z84) this.f10147s.getValue();
    }

    /* renamed from: O1 */
    public final RiderAreaState m106573O1(Location location, List<Area> list) {
        KeyBasedAreasFilter keyBasedAreasFilter;
        Config m106570R1;
        Map mutableMap;
        WireRide ride;
        WireBird bird;
        WireLocation mo78581a;
        Location fromLocation;
        RideState m59035e = this.f10134f.mo75057R().m73665a().m59035e();
        if (m59035e != null) {
            keyBasedAreasFilter = m106571Q1(m59035e);
        } else {
            keyBasedAreasFilter = null;
        }
        if (keyBasedAreasFilter != null) {
            list = C23356io.m33481a(list, keyBasedAreasFilter);
        }
        RideState m59035e2 = this.f10134f.mo75057R().m73665a().m59035e();
        if (m59035e2 != null && (ride = m59035e2.getRide()) != null && (bird = ride.getBird()) != null && (mo78581a = this.f10136h.mo78581a(bird)) != null && (fromLocation = mo78581a.fromLocation()) != null) {
            location = fromLocation;
        }
        RideState m59035e3 = this.f10134f.mo75057R().m73665a().m59035e();
        if (m59035e3 == null || (m106570R1 = m59035e3.getRideConfig()) == null) {
            m106570R1 = m106570R1();
        }
        LocationAreaState m106576L1 = m106576L1(m106570R1, location, list);
        mutableMap = MapsKt__MapsKt.toMutableMap(this.f10117D.getValue());
        for (Map.Entry<String, Area> entry : m106576L1.getAreasWithin().entrySet()) {
            Area value = entry.getValue();
            if (!mutableMap.containsKey(value)) {
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                mutableMap.put(value, now);
            }
        }
        this.f10115B.m71837i(new C2469t(m106576L1));
        this.f10114A.m71837i(new C2470u(m106576L1));
        this.f10116C.m71837i(new C2471v(m106576L1));
        this.f10117D.m71837i(new C2472w(mutableMap, m106576L1));
        return m106576L1.toRiderAreaState();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: P */
    public AbstractC23461c mo64010P(Location center, Set<String> cellIds, MapMode mapMode) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(cellIds, "cellIds");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        AbstractC23461c m33063X = this.f10130b.mo74248r1(center, cellIds, mapMode).m33063X(C24542a.m31932c());
        final C2432J c2432j = new C2432J();
        AbstractC23461c m33029z = m33063X.m33081E(new InterfaceC23484g() { // from class: vn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106553f2(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: wn
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2422Fn.m106550g2(C2422Fn.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "override fun refreshNear…of(DateTime.now())) }\n  }");
        return m33029z;
    }

    /* renamed from: P1 */
    public final ParkingType m106572P1(List<Area> list, Location location) {
        Sequence asSequence;
        Sequence map;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        asSequence = CollectionsKt___CollectionsKt.asSequence(list);
        map = SequencesKt___SequencesKt.map(asSequence, new C2473x(location));
        Iterator it = map.iterator();
        while (true) {
            z = true;
            if (it.hasNext()) {
                if (((ParkingType) it.next()) == ParkingType.PREFERRED_PARKING) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return ParkingType.PREFERRED_PARKING;
        }
        Iterator it2 = map.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((ParkingType) it2.next()) == ParkingType.NO_PARKING) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return ParkingType.NO_PARKING;
        }
        return ParkingType.NONE;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: Q */
    public Observable<Unit> mo64009Q() {
        Observable<Unit> hide = this.f10124K.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "refreshNestRequests.hide()");
        return hide;
    }

    /* renamed from: Q1 */
    public final KeyBasedAreasFilter m106571Q1(RideState rideState) {
        String str;
        Object obj;
        if (!Intrinsics.areEqual(rideState.getRideConfig().getParkingConfig().getUseAreaKeys(), Boolean.TRUE)) {
            return null;
        }
        WireBird bird = rideState.getRide().getBird();
        if (bird == null || (str = bird.getAreaKey()) == null) {
            WireBird bird2 = rideState.getRide().getBird();
            if (bird2 != null) {
                str = C49697uC6.m10641a(bird2);
            } else {
                str = null;
            }
            if (str == null) {
                Iterator<T> it = this.f10139k.mo71580b1().m73665a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        WireBird wireBird = (WireBird) obj;
                        WireBird bird3 = rideState.getRide().getBird();
                        boolean z = false;
                        if (bird3 != null && bird3.isProbablySame(wireBird)) {
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
                WireBird wireBird2 = (WireBird) obj;
                if (wireBird2 != null) {
                    str = wireBird2.getAreaKey();
                } else {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        return new KeyBasedAreasFilter(true, str);
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: R */
    public boolean mo64008R() {
        List<Area> m73665a = mo63995r().m73665a();
        if ((m73665a instanceof Collection) && m73665a.isEmpty()) {
            return false;
        }
        for (Area area : m73665a) {
            if (area.isReleaseConstrained()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R1 */
    public final Config m106570R1() {
        WireRide ride;
        C36207Tq4 c36207Tq4 = this.f10132d;
        RideState m59035e = this.f10134f.mo75034m0().m73665a().m59035e();
        return C36441Uq4.m80769c(c36207Tq4, (m59035e == null || (ride = m59035e.getRide()) == null) ? null : ride.getBird());
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: T */
    public void mo64007T() {
        this.f10120G.accept(Optional.f63040c.m59034a());
        this.f10124K.onNext(Unit.INSTANCE);
    }

    /* renamed from: U1 */
    public final Optional<Integer> m106567U1(Location location) {
        List sortedWith;
        Object firstOrNull;
        Integer num;
        int i;
        Integer demandLevel;
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(mo63995r().m73665a(), new C2423A());
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) sortedWith);
        Area area = (Area) firstOrNull;
        Object obj = null;
        if (area != null) {
            num = area.getDemandLevel();
        } else {
            num = null;
        }
        if (num == null) {
            return Optional.f63040c.m59034a();
        }
        Iterator it = sortedWith.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m106578J1((Area) next, location)) {
                obj = next;
                break;
            }
        }
        Area area2 = (Area) obj;
        if (area2 != null && (demandLevel = area2.getDemandLevel()) != null) {
            i = demandLevel.intValue();
        } else {
            i = 0;
        }
        return Optional.f63040c.m59032c(Integer.valueOf(i));
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: V */
    public Z84<List<ParkingNest>> mo64006V() {
        return (Z84) this.f10141m.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
        if (r13 == null) goto L40;
     */
    /* renamed from: V1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Optional<Float> m106566V1(Location location) {
        Object obj;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Float m117230minOrNull;
        Optional<Float> m59034a;
        Optional<Float> m59032c;
        ArrayList<Area> arrayList = new ArrayList();
        for (Object obj2 : mo63995r().m73665a()) {
            if (((Area) obj2).isDemandArea()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (JX3.contains$default(((Area) obj).getRegion(), location, 0.0d, 0.0d, 6, null)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((Area) obj) == null || (m59032c = Optional.f63040c.m59032c(Float.valueOf(0.0f))) == null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList<C2459k> arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (Area area : arrayList) {
                arrayList2.add(new C2459k(JX3.m100298a(area.getRegion()), area));
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (C2459k c2459k : arrayList2) {
                arrayList3.add(Float.valueOf(C37429Yw2.f47648a.m73965f(C39339cm2.m60885d(location), new LatLng(c2459k.m106484a().f66612y, c2459k.m106484a().f66611x))));
            }
            m117230minOrNull = CollectionsKt___CollectionsKt.m117230minOrNull((Iterable<Float>) arrayList3);
            if (m117230minOrNull != null) {
                m59034a = Optional.f63040c.m59032c(Float.valueOf(m117230minOrNull.floatValue()));
            }
            m59034a = Optional.f63040c.m59034a();
            return m59034a;
        }
        return m59032c;
    }

    /* renamed from: W1 */
    public final WB1 m106565W1(Area area) {
        WB1 wb1 = this.f10127R.get(area.getId());
        if (wb1 == null) {
            CX3 jtsRegion = area.getJtsRegion();
            this.f10127R.put(area.getId(), jtsRegion);
            return jtsRegion;
        }
        return wb1;
    }

    /* renamed from: X1 */
    public final void m106564X1() {
        if (InterfaceC1880Ea.C1881a.startThrottledTrace$default(this.f10138j, new RiderAreaStateComputation(), null, 30000, 2, null)) {
            this.f10128S.set(true);
            C41318g46.m40163a("starting trace area rider state computation", new Object[0]);
        }
    }

    /* renamed from: Y1 */
    public final void m106563Y1() {
        if (this.f10128S.get()) {
            C41318g46.m40163a("completed trace area rider state computation\n", new Object[0]);
            InterfaceC1880Ea.C1881a.stopTrace$default(this.f10138j, new RiderAreaStateComputation(), null, null, null, 14, null);
            this.f10128S.set(false);
        }
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: Z */
    public AbstractC23461c mo64005Z(Location location, double d, MapMode mapMode, boolean z) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        AbstractC23461c m33063X = this.f10130b.mo74264R0(location, d, mapMode, z).m33063X(C24542a.m31932c());
        final C2431I c2431i = new C2431I();
        AbstractC23461c m33029z = m33063X.m33081E(new InterfaceC23484g() { // from class: zn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106557d2(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: An
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2422Fn.m106555e2(C2422Fn.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "override fun refreshArea…of(DateTime.now())) }\n  }");
        return m33029z;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: a0 */
    public void mo64004a0(C5691Nn request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f10118E.accept(Optional.f63040c.m59034a());
        this.f10123J.onNext(request);
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: c0 */
    public Z84<Optional<ParkingNestData>> mo64003c0() {
        return (Z84) this.f10142n.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: d */
    public RiderAreaState mo64002d() {
        return this.f10146r;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: e */
    public Z84<List<Area>> mo64001e() {
        return (Z84) this.f10145q.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: f */
    public AbstractC23442F<HM4<List<ParkingNest>>> mo64000f(double d, String str, Location location) {
        Double d2;
        Double d3;
        InterfaceC42606iF3 interfaceC42606iF3 = this.f10131c;
        if (location != null) {
            d2 = Double.valueOf(location.getLatitude());
        } else {
            d2 = null;
        }
        if (location != null) {
            d3 = Double.valueOf(location.getLongitude());
        } else {
            d3 = null;
        }
        AbstractC23442F<HM4<List<ParkingNest>>> m33152N = interfaceC42606iF3.m34277a(d, str, d2, d3).m33142Y(C24542a.m31932c()).m33152N(C24542a.m31934a());
        final C2424B c2424b = C2424B.f10155g;
        AbstractC23442F<R> m33157I = m33152N.m33157I(new InterfaceC23492o() { // from class: on
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                HM4 m106562Z1;
                m106562Z1 = C2422Fn.m106562Z1(Function1.this, obj);
                return m106562Z1;
            }
        });
        final C2425C c2425c = new C2425C();
        AbstractC23442F m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: pn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106561a2(Function1.this, obj);
            }
        });
        final C2426D c2426d = new C2426D();
        AbstractC23442F m33102v = m33101w.m33102v(new InterfaceC23484g() { // from class: qn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106560b2(Function1.this, obj);
            }
        });
        final C2427E c2427e = new C2427E();
        AbstractC23442F<HM4<List<ParkingNest>>> m33101w2 = m33102v.m33101w(new InterfaceC23484g() { // from class: rn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106558c2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w2, "override fun nearbyParki…of(DateTime.now())) }\n  }");
        return m33101w2;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: g */
    public Observable<RiderAreaState> mo63999g() {
        Observable<RiderAreaState> observable = this.f10129T;
        final C2437O c2437o = C2437O.f10171g;
        Observable compose = observable.compose(new InterfaceC23435C() { // from class: tn
            @Override // io.reactivex.InterfaceC23435C
            public final InterfaceC23434B apply(Observable observable2) {
                InterfaceC23434B m106539l2;
                m106539l2 = C2422Fn.m106539l2(Function1.this, observable2);
                return m106539l2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(compose, "sharedRiderAreaState\n   …lers.computation())\n    }");
        return compose;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: h */
    public Z84<Map<String, LocationAreaState>> mo63998h() {
        return (Z84) this.f10152x.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: i */
    public LocationAreaState mo63997i(RideState rideState, Location location) {
        Intrinsics.checkNotNullParameter(rideState, "rideState");
        Intrinsics.checkNotNullParameter(location, "location");
        return m106575M1(rideState, location, mo63995r().m73665a(), true);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    /* renamed from: m2 */
    public void m106537m2(RiderAreaState riderAreaState) {
        this.f10146r = riderAreaState;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: r */
    public Z84<List<Area>> mo63995r() {
        return (Z84) this.f10140l.getValue();
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: v */
    public Z84<Optional<Area>> mo63994v() {
        return (Z84) this.f10144p.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: w */
    public Z84<Optional<DateTime>> mo63993w() {
        return (Z84) this.f10149u.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: x */
    public Z84<Optional<Area>> mo63992x() {
        return (Z84) this.f10143o.getValue();
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: y */
    public AbstractC23442F<DemandAreaAnalyticsInfo> mo63991y(boolean z) {
        AbstractC23442F<Location> m33152N = this.f10133e.mo43627e(z).m33148R(this.f10133e.mo43616p().m73665a()).m33152N(C24542a.m31934a());
        final C2475z c2475z = new C2475z();
        AbstractC23442F m33157I = m33152N.m33157I(new InterfaceC23492o() { // from class: un
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DemandAreaAnalyticsInfo m106568T1;
                m106568T1 = C2422Fn.m106568T1(Function1.this, obj);
                return m106568T1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun getDemandAr…DemandArea())\n      }\n  }");
        return m33157I;
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: z */
    public void mo63990z() {
        this.f10154z.m71836j();
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.InterfaceC12495bn
    /* renamed from: m */
    public AbstractC23461c mo63996m(Location location, double d, List<Geolocation> viewport) {
        AbstractC23442F m33157I;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        List<OperatorFilter> m59035e = this.f10135g.mo6178e().getValue().m59035e();
        OperatorMapFilterBundle m2323c = m59035e != null ? C52473yt5.m2323c(m59035e) : null;
        if (m2323c != null) {
            m33157I = AbstractC23442F.m33158H(m2323c);
        } else {
            AbstractC23442F<List<OperatorFilter>> firstOrError = this.f10135g.mo6176g(true).firstOrError();
            final C2433K c2433k = C2433K.f10164g;
            m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: cn
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    OperatorMapFilterBundle m106547h2;
                    m106547h2 = C2422Fn.m106547h2(Function1.this, obj);
                    return m106547h2;
                }
            });
        }
        final C2434L c2434l = new C2434L(location, d, viewport);
        AbstractC23461c m33164B = m33157I.m33164B(new InterfaceC23492o() { // from class: nn
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m106545i2;
                m106545i2 = C2422Fn.m106545i2(Function1.this, obj);
                return m106545i2;
            }
        });
        final C2435M c2435m = new C2435M();
        AbstractC23461c m33029z = m33164B.m33081E(new InterfaceC23484g() { // from class: xn
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2422Fn.m106543j2(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: yn
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2422Fn.m106540k2(C2422Fn.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "override fun refreshServ…of(DateTime.now())) }\n  }");
        return m33029z;
    }
}
