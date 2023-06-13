package p000;

import android.location.Location;
import android.util.LruCache;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdLocations;
import co.bird.android.model.BirdScan;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.BleScannedVehicle;
import co.bird.android.model.InaccessibleReason;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LoggedRepair;
import co.bird.android.model.PropertyReportAction;
import co.bird.android.model.PropertyReportNextStep;
import co.bird.android.model.Route;
import co.bird.android.model.ZigZagPosition;
import co.bird.android.model.ZigZagVehicle;
import co.bird.android.model.ZigZagVehiclesResponse;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.MechanicalLockKind;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.api.request.AlarmBirdBody;
import co.bird.api.request.BirdIdBody;
import co.bird.api.request.BluetoothTrackBody;
import co.bird.api.request.CannotAccessReportRequest;
import co.bird.api.request.ChirpBirdBody;
import co.bird.api.request.MarkMissingBirdBody;
import co.bird.api.request.NearbyBirdsByIdsRequest;
import co.bird.api.request.PropertyReportBody;
import co.bird.api.request.RepairLogSubmitBody;
import co.bird.api.request.ScanBody;
import co.bird.api.request.TrackBirdBody;
import co.bird.api.request.UnlockCableBody;
import co.bird.api.request.UnlockHelmetLockBody;
import co.bird.api.request.UnlockMechanicalBody;
import co.bird.api.request.WireBirdByCellsRequest;
import co.bird.api.response.BirdCodeWithStatus;
import co.bird.api.response.BirdsResponse;
import co.bird.api.response.CannotAccessBirdReport;
import co.bird.api.response.CannotAccessReportResponse;
import co.bird.api.response.Distance;
import co.bird.api.response.Duration;
import co.bird.api.response.Leg;
import co.bird.api.response.MapDirectionResponse;
import co.bird.api.response.OverviewPolyLine;
import co.bird.api.response.PropertyReport;
import co.bird.api.response.Step;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C2029Ey;
import p000.C2793GM;
import p000.C37791a94;
import p000.InterfaceC10636aM;
import p000.InterfaceC31654Ae5;
import p000.InterfaceC51461xB1;
@Metadata(m28433d1 = {"\u0000 \u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 æ\u00012\u00020\u0001:\u0002\u0085\u0001B\u009f\u0001\b\u0007\u0012\b\u0010\u008e\u0001\u001a\u00030\u008b\u0001\u0012\b\u0010\u0092\u0001\u001a\u00030\u008f\u0001\u0012\b\u0010\u0096\u0001\u001a\u00030\u0093\u0001\u0012\b\u0010\u009a\u0001\u001a\u00030\u0097\u0001\u0012\b\u0010\u009e\u0001\u001a\u00030\u009b\u0001\u0012\b\u0010¢\u0001\u001a\u00030\u009f\u0001\u0012\b\u0010¦\u0001\u001a\u00030£\u0001\u0012\b\u0010â\u0001\u001a\u00030á\u0001\u0012\u0007\u0010©\u0001\u001a\u00020\n\u0012\u0007\u0010ã\u0001\u001a\u00020\n\u0012\b\u0010¬\u0001\u001a\u00030ª\u0001\u0012\b\u0010¯\u0001\u001a\u00030\u00ad\u0001\u0012\b\u0010²\u0001\u001a\u00030°\u0001\u0012\b\u0010¶\u0001\u001a\u00030³\u0001\u0012\b\u0010º\u0001\u001a\u00030·\u0001¢\u0006\u0006\bä\u0001\u0010å\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J6\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002J9\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J/\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b$\u0010%J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016J\u0018\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0.0\u00062\u0006\u0010+\u001a\u00020\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0016J*\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00062\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n0,2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u00103\u001a\u00020)2\u0006\u00102\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u000204H\u0016J\u0016\u00108\u001a\u0002042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J@\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0\u001f2\u0006\u00109\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010<\u001a\u00020\u001d2\b\u0010=\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u001f2\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\bH\u0016J\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020C0\u001f2\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0002H\u0016J\u0010\u0010G\u001a\u00020)2\u0006\u0010F\u001a\u00020\nH\u0016J\u0010\u0010H\u001a\u00020)2\u0006\u0010F\u001a\u00020\nH\u0016J\u0018\u0010K\u001a\u00020)2\u0006\u0010F\u001a\u00020\n2\u0006\u0010J\u001a\u00020IH\u0016J\u0010\u0010L\u001a\u00020)2\u0006\u0010F\u001a\u00020\nH\u0016J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010N\u001a\u00020MH\u0016J<\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0>0\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010P\u001a\u0004\u0018\u00010\n2\b\u0010Q\u001a\u0004\u0018\u00010\n2\b\u0010R\u001a\u0004\u0018\u00010\nH\u0016J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010F\u001a\u00020\nH\u0016J*\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\f0>0\u00062\u0006\u0010'\u001a\u00020V2\u0006\u0010F\u001a\u00020\nH\u0016JP\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040>0\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\f2\b\u0010\\\u001a\u0004\u0018\u00010\n2\b\u0010]\u001a\u0004\u0018\u00010V2\b\u0010^\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0>0\u00062\u0006\u0010F\u001a\u00020\nH\u0016J\u0083\u0001\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0>0\u00062\u0006\u0010F\u001a\u00020\n2\b\u0010b\u001a\u0004\u0018\u00010\n2\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020e2\b\u0010]\u001a\u0004\u0018\u00010\n2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\u0010h\u001a\u0004\u0018\u00010\n2\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\b\u0010j\u001a\u0004\u0018\u00010\n2\b\u0010k\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bm\u0010nJ\u001c\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0>0\u00062\u0006\u0010F\u001a\u00020\nH\u0016J\u001c\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\f0\u00062\u0006\u0010F\u001a\u00020\nH\u0016J8\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n2\u0006\u0010t\u001a\u00020s2\u0006\u0010v\u001a\u00020u2\b\u0010h\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010y\u001a\u0002042\u0006\u0010F\u001a\u00020\nH\u0016J\u001c\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0>0\u00062\u0006\u0010F\u001a\u00020\nH\u0016J\u0016\u0010|\u001a\u0002042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n0,H\u0016J\u0012\u0010}\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010~\u001a\u00020)2\u0006\u0010F\u001a\u00020\nH\u0016J\u0017\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\u001f2\u0006\u0010F\u001a\u00020\nH\u0016J\u0011\u0010\u0081\u0001\u001a\u00020)2\u0006\u0010F\u001a\u00020\nH\u0016J\u001a\u0010\u0083\u0001\u001a\u00020)2\u0006\u0010F\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020MH\u0016J\u001a\u0010\u0085\u0001\u001a\u00020)2\u0006\u0010F\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\u001dH\u0016J\u0011\u0010\u0086\u0001\u001a\u00020)2\u0006\u0010F\u001a\u00020\nH\u0016J\u001c\u0010\u0089\u0001\u001a\u00020C2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010©\u0001\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010¬\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010«\u0001R\u0017\u0010¯\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bq\u0010®\u0001R\u0017\u0010²\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010±\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010º\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0011\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010C0»\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010¼\u0001R\"\u0010Â\u0001\u001a\r ¿\u0001*\u0005\u0018\u00010¾\u00010¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R$\u0010Æ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0,0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R<\u0010Ì\u0001\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n ¿\u0001*\n\u0012\u0004\u0012\u00020\n\u0018\u00010,0,0Ç\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R$\u0010Î\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Å\u0001R<\u0010Ñ\u0001\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b ¿\u0001*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\f0Ç\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0001\u0010É\u0001\u001a\u0006\bÐ\u0001\u0010Ë\u0001R$\u0010Ó\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Å\u0001R<\u0010Ö\u0001\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b ¿\u0001*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\f0Ç\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010É\u0001\u001a\u0006\bÕ\u0001\u0010Ë\u0001R$\u0010Ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Å\u0001R<\u0010Û\u0001\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b ¿\u0001*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\f0Ç\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÙ\u0001\u0010É\u0001\u001a\u0006\bÚ\u0001\u0010Ë\u0001R$\u0010Ý\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0,0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Å\u0001R<\u0010à\u0001\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n ¿\u0001*\n\u0012\u0004\u0012\u00020\n\u0018\u00010,0,0Ç\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÞ\u0001\u0010É\u0001\u001a\u0006\bß\u0001\u0010Ë\u0001¨\u0006ç\u0001"}, m28432d2 = {"LGM;", "LaM;", "Landroid/location/Location;", "location", "", "radius", "Lio/reactivex/F;", "", "Lco/bird/android/model/wire/WireBird;", "v0", "", "url", "", "", "centerIds", "partnerId", "K1", "encoded", "Lcom/google/android/gms/maps/model/LatLng;", "h1", "resource", "E1", "serialNumber", "battery", "distance", "Lco/bird/api/request/BluetoothTrackBody;", "U0", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;", "bird", "", "alarm", "Lio/reactivex/Observable;", "D0", "Lco/bird/android/model/constant/AlarmCommand;", "command", "durationSeconds", "e1", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/AlarmCommand;Ljava/lang/Integer;)Lio/reactivex/Observable;", "Lco/bird/android/model/constant/MapMode;", "mode", "N0", "Lio/reactivex/c;", "J0", "center", "", "cellIds", "", "P0", "birdIds", "V0", "feedUrl", "Z0", "", "B0", "C0", "eligibleBirds", "H0", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lco/bird/android/model/constant/ScanIntention;", "intention", "isCameraScan", "rawQrCode", "LHM4;", "Lco/bird/android/model/BirdScan;", "W0", "from", "to", "Lco/bird/android/model/Route;", "X0", "I0", "birdId", "m1", "d1", "Lco/bird/android/model/constant/MechanicalLockKind;", "lockKind", "E0", "Y0", "LbE5;", "sleepStarted", "O0", "imei", "beaconHash", "proximityUUID", "Lco/bird/api/response/BirdCodeWithStatus;", "f1", "M0", "Lco/bird/android/model/constant/ScanMode;", "Lco/bird/android/model/LegacyRepairType;", "L0", "userId", "Lco/bird/android/model/LoggedRepair;", "repairs", "comment", "role", "warehouseId", "Q0", "Lco/bird/android/model/BirdSummaryBody;", "o", "bountyId", "Lco/bird/android/model/InaccessibleReason;", "reason", "Lco/bird/android/model/InaccessibleReportSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "nearbyIdentifiers", "notes", "photoUrls", "birdCount", "scanTimeInSeconds", "Lco/bird/api/response/CannotAccessBirdReport;", "a1", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/InaccessibleReason;Lco/bird/android/model/InaccessibleReportSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/F;", "Lco/bird/api/response/CannotAccessReportResponse;", "l", "k", "cannotAccessReportId", "Lco/bird/android/model/PropertyReportAction;", "action", "Lco/bird/android/model/PropertyReportNextStep;", "nextStep", "Lco/bird/api/response/PropertyReport;", "K0", "S0", "Lco/bird/android/model/BirdLocations;", "c1", "T0", "y0", "x0", "Lco/bird/android/model/persistence/Bird;", C17296a.f69688o, "F0", "event", "z0", "lock", "j", "G0", "Lco/bird/api/response/MapDirectionResponse;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "w1", "(Lco/bird/api/response/MapDirectionResponse;)Lco/bird/android/model/Route;", "LV74;", "b", "LV74;", "promoManager", "LOh;", "c", "LOh;", "buildConfig", "LVK;", DateTokenConverter.CONVERTER_KEY, "LVK;", "birdClient", "Llj5;", "e", "Llj5;", "scanClient", "LdD1;", "f", "LdD1;", "mapClient", "LEa;", "g", "LEa;", "analyticsManager", "Ljd0;", "h", "Ljd0;", "cannotAccessClient", "i", "Ljava/lang/String;", "googleMapClient", "Ldr4;", "Ldr4;", "locationManager", "LAe5;", "LAe5;", "rxBleVehicleManager", "LRR;", "LRR;", "birdRepo", "LVL1;", "m", "LVL1;", "hibernationRepo", "LxB1;", "n", "LxB1;", "genericNonBirdClient", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "routeCache", "", "kotlin.jvm.PlatformType", "p", "[B", "key", "La94;", "q", "La94;", "mutableBadBirdIds", "LZ84;", "r", "Lkotlin/Lazy;", "A0", "()LZ84;", "badBirdIds", "s", "mutableLatestApiOnlyNearbyBirds", "t", "b1", "latestApiOnlyNearbyBirds", "u", "mutableLatestZigZagVehicles", "v", "v1", "latestZigZagVehicles", "w", "mutableLatestNearbyBirds", "x", "R0", "latestNearbyBirds", "y", "mutableFraudBirdIds", "z", "u1", "fraudBirdIds", "Lq54;", "privateBirdsManager", "googleMapSecret", "<init>", "(LV74;LOh;LVK;Llj5;LdD1;LEa;Ljd0;Lq54;Ljava/lang/String;Ljava/lang/String;Ldr4;LAe5;LRR;LVL1;LxB1;)V", "A", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n71#2,2:705\n180#3:707\n237#3:708\n1549#4:709\n1620#4,3:710\n2333#4,14:713\n1360#4:727\n1446#4,5:728\n1360#4:733\n1446#4,5:734\n1855#4,2:739\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl\n*L\n131#1:705,2\n150#1:707\n187#1:708\n194#1:709\n194#1:710,3\n591#1:713,14\n635#1:727\n635#1:728,5\n638#1:733\n638#1:734,5\n643#1:739,2\n*E\n"})
/* renamed from: GM */
/* loaded from: classes2.dex */
public final class C2793GM implements InterfaceC10636aM {

    /* renamed from: A */
    public static final C2814j f11719A = new C2814j(null);

    /* renamed from: B */
    public static final int f11720B = 8;

    /* renamed from: b */
    public final V74 f11721b;

    /* renamed from: c */
    public final InterfaceC6097Oh f11722c;

    /* renamed from: d */
    public final InterfaceC8601VK f11723d;

    /* renamed from: e */
    public final InterfaceC44666lj5 f11724e;

    /* renamed from: f */
    public final InterfaceC39622dD1 f11725f;

    /* renamed from: g */
    public final InterfaceC1880Ea f11726g;

    /* renamed from: h */
    public final InterfaceC43415jd0 f11727h;

    /* renamed from: i */
    public final String f11728i;

    /* renamed from: j */
    public final InterfaceC40001dr4 f11729j;

    /* renamed from: k */
    public final InterfaceC31654Ae5 f11730k;

    /* renamed from: l */
    public final InterfaceC7168RR f11731l;

    /* renamed from: m */
    public final VL1 f11732m;

    /* renamed from: n */
    public final InterfaceC51461xB1 f11733n;

    /* renamed from: o */
    public final LruCache<String, Route> f11734o;

    /* renamed from: p */
    public final byte[] f11735p;

    /* renamed from: q */
    public final C37791a94<Set<String>> f11736q;

    /* renamed from: r */
    public final Lazy f11737r;

    /* renamed from: s */
    public final C37791a94<List<WireBird>> f11738s;

    /* renamed from: t */
    public final Lazy f11739t;

    /* renamed from: u */
    public final C37791a94<List<WireBird>> f11740u;

    /* renamed from: v */
    public final Lazy f11741v;

    /* renamed from: w */
    public final C37791a94<List<WireBird>> f11742w;

    /* renamed from: x */
    public final Lazy f11743x;

    /* renamed from: y */
    public final C37791a94<Set<String>> f11744y;

    /* renamed from: z */
    public final Lazy f11745z;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "", "it", C17296a.f69688o, "(Ljava/util/Set;)Ljava/util/Set;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$A */
    /* loaded from: classes2.dex */
    public static final class C2794A extends Lambda implements Function1<Set<? extends String>, Set<? extends String>> {

        /* renamed from: g */
        public final /* synthetic */ Set<String> f11746g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2794A(Set<String> set) {
            super(1);
            this.f11746g = set;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Set<String> invoke(Set<String> it) {
            Set<String> plus;
            Intrinsics.checkNotNullParameter(it, "it");
            plus = SetsKt___SetsKt.plus((Set) it, (Iterable) this.f11746g);
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/BirdScan;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$B */
    /* loaded from: classes2.dex */
    public static final class C2795B extends Lambda implements Function1<HM4<BirdScan>, Unit> {
        public C2795B() {
            super(1);
        }

        /* renamed from: a */
        public final void m105228a(HM4<BirdScan> hm4) {
            List<WireCoupon> list;
            boolean z;
            if (hm4.m103939f()) {
                BirdScan m103944a = hm4.m103944a();
                if (m103944a != null) {
                    list = m103944a.getCoupons();
                } else {
                    list = null;
                }
                List<WireCoupon> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C2793GM.this.f11721b.mo27795f();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BirdScan> hm4) {
            m105228a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$C */
    /* loaded from: classes2.dex */
    public static final class C2796C extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C38431bE5 f11749h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2796C(C38431bE5 c38431bE5) {
            super(1);
            this.f11749h = c38431bE5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C2793GM.this.f11726g.mo55905y(C39024cE5.toSleepEndedEvent$default(this.f11749h, false, null, 2, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: GM$D */
    /* loaded from: classes2.dex */
    public static final class C2797D<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C2797D<T1, T2, T3, T4, R> f11750a = new C2797D<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/PropertyReport;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$E */
    /* loaded from: classes2.dex */
    public static final class C2798E extends Lambda implements Function1<HM4<PropertyReport>, Unit> {

        /* renamed from: g */
        public static final C2798E f11751g = new C2798E();

        public C2798E() {
            super(1);
        }

        /* renamed from: a */
        public final void m105226a(HM4<PropertyReport> response) {
            String str;
            if (!response.m103939f() || response.m103944a() == null) {
                Intrinsics.checkNotNullExpressionValue(response, "response");
                C49375tg1 m94017d = NM4.m94017d(response);
                if (m94017d != null) {
                    str = "Error title '" + m94017d.m11931d() + ", code '" + m94017d.m11933b() + "', message: '" + m94017d.m11932c() + "' (thread: " + Thread.currentThread() + ")";
                } else {
                    str = null;
                }
                C41318g46.m40159e(new Exception(str));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<PropertyReport> hm4) {
            m105226a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$F */
    /* loaded from: classes2.dex */
    public static final class C2799F extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2799F f11752g = new C2799F();

        public C2799F() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/PropertyReport;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/api/response/PropertyReport;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$G */
    /* loaded from: classes2.dex */
    public static final class C2800G extends Lambda implements Function1<HM4<PropertyReport>, PropertyReport> {

        /* renamed from: g */
        public static final C2800G f11753g = new C2800G();

        public C2800G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final PropertyReport invoke(HM4<PropertyReport> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m103944a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$updateScanlessRideEligible$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n1549#2:705\n1620#2,3:706\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$updateScanlessRideEligible$1\n*L\n313#1:705\n313#1:706,3\n*E\n"})
    /* renamed from: GM$H */
    /* loaded from: classes2.dex */
    public static final class C2801H extends Lambda implements Function1<List<? extends WireBird>, List<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f11754g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2801H(WireBird wireBird) {
            super(1);
            this.f11754g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(List<WireBird> birds) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(birds, "birds");
            List<WireBird> list = birds;
            WireBird wireBird = this.f11754g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireBird wireBird2 : list) {
                if (Intrinsics.areEqual(wireBird2.getId(), wireBird.getId()) || Intrinsics.areEqual(wireBird2.getId(), wireBird.getEphemeralId())) {
                    wireBird2 = wireBird2.copy((r91 & 1) != 0 ? wireBird2.f66717id : null, (r91 & 2) != 0 ? wireBird2.model : null, (r91 & 4) != 0 ? wireBird2.taskId : null, (r91 & 8) != 0 ? wireBird2.batteryLevel : 0, (r91 & 16) != 0 ? wireBird2.estimatedRange : null, (r91 & 32) != 0 ? wireBird2.distance : 0, (r91 & 64) != 0 ? wireBird2.location : null, (r91 & 128) != 0 ? wireBird2.code : null, (r91 & 256) != 0 ? wireBird2.stickerId : null, (r91 & 512) != 0 ? wireBird2.serialNumber : null, (r91 & 1024) != 0 ? wireBird2.disconnected : false, (r91 & 2048) != 0 ? wireBird2.collect : false, (r91 & 4096) != 0 ? wireBird2.submerged : false, (r91 & 8192) != 0 ? wireBird2.lost : false, (r91 & 16384) != 0 ? wireBird2.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird2.ackLocked : false, (r91 & 65536) != 0 ? wireBird2.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird2.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird2.broken : false, (r91 & 524288) != 0 ? wireBird2.label : null, (r91 & 1048576) != 0 ? wireBird2.actions : null, (r91 & 2097152) != 0 ? wireBird2.bountyId : null, (r91 & 4194304) != 0 ? wireBird2.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird2.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird2.bountyLost : false, (r91 & 33554432) != 0 ? wireBird2.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird2.bountyKind : null, (r91 & 134217728) != 0 ? wireBird2.brandName : null, (r91 & 268435456) != 0 ? wireBird2.taskKind : null, (r91 & 536870912) != 0 ? wireBird2.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird2.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird2.token : null, (r92 & 1) != 0 ? wireBird2.bluetooth : false, (r92 & 2) != 0 ? wireBird2.cellular : false, (r92 & 4) != 0 ? wireBird2.startedAt : null, (r92 & 8) != 0 ? wireBird2.dueAt : null, (r92 & 16) != 0 ? wireBird2.asleep : false, (r92 & 32) != 0 ? wireBird2.imei : null, (r92 & 64) != 0 ? wireBird2.boardProtocol : null, (r92 & 128) != 0 ? wireBird2.physicalLock : null, (r92 & 256) != 0 ? wireBird2.priorityCollect : false, (r92 & 512) != 0 ? wireBird2.down : false, (r92 & 1024) != 0 ? wireBird2.needsInspection : false, (r92 & 2048) != 0 ? wireBird2.partnerId : null, (r92 & 4096) != 0 ? wireBird2.nestId : null, (r92 & 8192) != 0 ? wireBird2.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird2.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird2.peril : false, (r92 & 65536) != 0 ? wireBird2.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird2.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird2.offline : false, (r92 & 524288) != 0 ? wireBird2.license : null, (r92 & 1048576) != 0 ? wireBird2.areaKey : null, (r92 & 2097152) != 0 ? wireBird2.fleetId : null, (r92 & 4194304) != 0 ? wireBird2.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird2.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird2.scannedAt : null, (r92 & 33554432) != 0 ? wireBird2.badgeType : null, (r92 & 67108864) != 0 ? wireBird2.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird2.isScanlessRideEligible : true, (r92 & 268435456) != 0 ? wireBird2.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird2.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird2.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird2.bleMacAddress : null, (r93 & 1) != 0 ? wireBird2.cellId : null, (r93 & 2) != 0 ? wireBird2.externalFeedType : null);
                }
                arrayList.add(wireBird2);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/ZigZagVehiclesResponse;", "response", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/ZigZagVehiclesResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$zigZagVehiclesNearbySingle$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,704:1\n1603#2,9:705\n1855#2:714\n1856#2:716\n1612#2:717\n1655#2,8:718\n1#3:715\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$zigZagVehiclesNearbySingle$1\n*L\n340#1:705,9\n340#1:714\n340#1:716\n340#1:717\n359#1:718,8\n340#1:715\n*E\n"})
    /* renamed from: GM$I */
    /* loaded from: classes2.dex */
    public static final class C2802I extends Lambda implements Function1<ZigZagVehiclesResponse, List<WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ List<Integer> f11755g;

        /* renamed from: h */
        public final /* synthetic */ String f11756h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2802I(List<Integer> list, String str) {
            super(1);
            this.f11755g = list;
            this.f11756h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(ZigZagVehiclesResponse response) {
            List<WireBird> mutableList;
            boolean contains;
            ArrayList arrayList;
            String str;
            WireBird wireBird;
            String str2;
            double d;
            double d2;
            int i;
            int coerceIn;
            Intrinsics.checkNotNullParameter(response, "response");
            List<Integer> list = this.f11755g;
            String str3 = this.f11756h;
            ArrayList arrayList2 = new ArrayList();
            for (ZigZagVehicle zigZagVehicle : response.getVehicles()) {
                contains = CollectionsKt___CollectionsKt.contains(list, zigZagVehicle.getCenterId());
                if (contains) {
                    String id = zigZagVehicle.getId();
                    if (id == null) {
                        id = "";
                    }
                    String code = zigZagVehicle.getCode();
                    if (code == null) {
                        str2 = "";
                    } else {
                        str2 = code;
                    }
                    ZigZagPosition position = zigZagVehicle.getPosition();
                    if (position != null) {
                        d = position.getX();
                    } else {
                        d = 0.0d;
                    }
                    ZigZagPosition position2 = zigZagVehicle.getPosition();
                    if (position2 != null) {
                        d2 = position2.getY();
                    } else {
                        d2 = 0.0d;
                    }
                    WireLocation wireLocation = new WireLocation(d, d2, null, null, null, null, false, null, null, 508, null);
                    Integer fuelLevel = zigZagVehicle.getFuelLevel();
                    if (fuelLevel != null) {
                        coerceIn = RangesKt___RangesKt.coerceIn(fuelLevel.intValue(), (ClosedRange<Integer>) new IntRange(0, 100));
                        i = coerceIn;
                    } else {
                        i = 100;
                    }
                    arrayList = arrayList2;
                    str = str3;
                    wireBird = new WireBird(id, "m365", null, i, null, 10, wireLocation, str2, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, str, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, WireBird.ZIG_ZAG_EXTERNAL_FEED_TYPE, -236, -2049, 1, null);
                } else {
                    arrayList = arrayList2;
                    str = str3;
                    wireBird = null;
                }
                ArrayList arrayList3 = arrayList;
                if (wireBird != null) {
                    arrayList3.add(wireBird);
                }
                arrayList2 = arrayList3;
                str3 = str;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList2) {
                if (hashSet.add(((WireBird) obj).getId())) {
                    arrayList4.add(obj);
                }
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4);
            return mutableList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$b */
    /* loaded from: classes2.dex */
    public static final class C2805b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2805b f11761g = new C2805b();

        public C2805b() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$c */
    /* loaded from: classes2.dex */
    public static final class C2806c extends Lambda implements Function1<Optional<List<? extends WireBird>>, List<? extends WireBird>> {

        /* renamed from: g */
        public static final C2806c f11762g = new C2806c();

        public C2806c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(Optional<List<WireBird>> it) {
            List<WireBird> emptyList;
            Intrinsics.checkNotNullParameter(it, "it");
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return it.m59036d(emptyList);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072ß\u0001\u0010\u0006\u001aÚ\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0003*l\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lwb4;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$d */
    /* loaded from: classes2.dex */
    public static final class C2807d extends Lambda implements Function1<C51106wb4<? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends Set<? extends String>>, Unit> {

        /* renamed from: g */
        public static final C2807d f11763g = new C2807d();

        public C2807d() {
            super(1);
        }

        /* renamed from: a */
        public final void m105219a(C51106wb4<? extends List<WireBird>, ? extends List<WireBird>, ? extends List<WireBird>, ? extends Set<String>> c51106wb4) {
            int size = c51106wb4.m6614a().size();
            int size2 = c51106wb4.m6613b().size();
            int size3 = c51106wb4.m6612c().size();
            int size4 = c51106wb4.m6611d().size();
            C41318g46.m40163a("nearby birds updated nearby count = " + size + ", zig zags = " + size2 + ", private count = " + size3 + ", fraud count = " + size4, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends Set<? extends String>> c51106wb4) {
            m105219a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$e */
    /* loaded from: classes2.dex */
    public static final class C2808e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2808e f11764g = new C2808e();

        public C2808e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40163a("error init stream", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072ß\u0001\u0010\u0006\u001aÚ\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0003*l\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lwb4;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n819#2:705\n847#2,2:706\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$6\n*L\n152#1:705\n152#1:706,2\n*E\n"})
    /* renamed from: GM$f */
    /* loaded from: classes2.dex */
    public static final class C2809f extends Lambda implements Function1<C51106wb4<? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends Set<? extends String>>, Unit> {
        public C2809f() {
            super(1);
        }

        /* renamed from: a */
        public final void m105218a(C51106wb4<? extends List<WireBird>, ? extends List<WireBird>, ? extends List<WireBird>, ? extends Set<String>> c51106wb4) {
            List plus;
            List plus2;
            List<WireBird> apiBirdsNearby = c51106wb4.m6614a();
            List<WireBird> zigZagBirds = c51106wb4.m6613b();
            List<WireBird> privateBirds = c51106wb4.m6612c();
            Set<String> m6611d = c51106wb4.m6611d();
            C37791a94 c37791a94 = C2793GM.this.f11742w;
            Intrinsics.checkNotNullExpressionValue(apiBirdsNearby, "apiBirdsNearby");
            ArrayList arrayList = new ArrayList();
            for (Object obj : apiBirdsNearby) {
                if (!m6611d.contains(((WireBird) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            Intrinsics.checkNotNullExpressionValue(privateBirds, "privateBirds");
            plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) privateBirds);
            Intrinsics.checkNotNullExpressionValue(zigZagBirds, "zigZagBirds");
            plus2 = CollectionsKt___CollectionsKt.plus((Collection) plus, (Iterable) zigZagBirds);
            c37791a94.accept(plus2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends List<? extends WireBird>, ? extends Set<? extends String>> c51106wb4) {
            m105218a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2810g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C2810g f11766b = new C2810g();

        public C2810g() {
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

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "privateBirds", "Lio/reactivex/B;", "Lkotlin/Pair;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$h */
    /* loaded from: classes2.dex */
    public static final class C2811h extends Lambda implements Function1<List<? extends WireBird>, InterfaceC23434B<? extends Pair<? extends List<? extends WireBird>, ? extends Location>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireBird;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "it", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GM$h$a */
        /* loaded from: classes2.dex */
        public static final class C2812a extends Lambda implements Function1<Location, Pair<? extends List<? extends WireBird>, ? extends Location>> {

            /* renamed from: g */
            public final /* synthetic */ List<WireBird> f11768g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2812a(List<WireBird> list) {
                super(1);
                this.f11768g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<List<WireBird>, Location> invoke(Location it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair<>(this.f11768g, it);
            }
        }

        public C2811h() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<List<WireBird>, Location>> invoke(List<WireBird> privateBirds) {
            Intrinsics.checkNotNullParameter(privateBirds, "privateBirds");
            if (!privateBirds.isEmpty()) {
                Observable<Location> mo43625g = C2793GM.this.f11729j.mo43625g(10.0f, true);
                final C2812a c2812a = new C2812a(privateBirds);
                return mo43625g.map(new InterfaceC23492o() { // from class: HM
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C2793GM.C2811h.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\b\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000 \u0006**\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0006*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000\u0018\u00010\u00070\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireBird;", "Landroid/location/Location;", "<name for destructuring parameter 0>", "", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/lang/Iterable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n1549#2:705\n1620#2,3:706\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$9\n*L\n172#1:705\n172#1:706,3\n*E\n"})
    /* renamed from: GM$i */
    /* loaded from: classes2.dex */
    public static final class C2813i extends Lambda implements Function1<Pair<? extends List<? extends WireBird>, ? extends Location>, Iterable<? extends Pair<? extends WireBird, ? extends Location>>> {

        /* renamed from: g */
        public static final C2813i f11769g = new C2813i();

        public C2813i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Iterable<Pair<WireBird, Location>> invoke(Pair<? extends List<WireBird>, ? extends Location> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireBird> privateBirds = pair.component1();
            Location component2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(privateBirds, "privateBirds");
            List<WireBird> list = privateBirds;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireBird wireBird : list) {
                arrayList.add(TuplesKt.m28425to(wireBird, component2));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LGM$j;", "", "", "OWNED_BIRD_TRACK_USER_LOCATION_DISPLACEMENT", "F", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: GM$j */
    /* loaded from: classes2.dex */
    public static final class C2814j {
        public /* synthetic */ C2814j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2814j() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$k */
    /* loaded from: classes2.dex */
    public static final class C2815k extends Lambda implements Function0<Z84<Set<? extends String>>> {
        public C2815k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Set<? extends String>> invoke2() {
            return Z84.f47888d.m73663b(C2793GM.this.f11736q);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/BirdsResponse;", "response", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BirdsResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$l */
    /* loaded from: classes2.dex */
    public static final class C2816l extends Lambda implements Function1<BirdsResponse, List<WireBird>> {

        /* renamed from: g */
        public static final C2816l f11771g = new C2816l();

        public C2816l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(BirdsResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.getBirds();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/BirdsResponse;", "response", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BirdsResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$m */
    /* loaded from: classes2.dex */
    public static final class C2817m extends Lambda implements Function1<BirdsResponse, List<? extends WireBird>> {

        /* renamed from: g */
        public static final C2817m f11772g = new C2817m();

        public C2817m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(BirdsResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.getBirds();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/BirdsResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/BirdsResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$n */
    /* loaded from: classes2.dex */
    public static final class C2818n extends Lambda implements Function1<BirdsResponse, Unit> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "existingBirds", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$fetchNearbyBirds$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n1655#2,8:705\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$fetchNearbyBirds$1$1\n*L\n268#1:705,8\n*E\n"})
        /* renamed from: GM$n$a */
        /* loaded from: classes2.dex */
        public static final class C2819a extends Lambda implements Function1<List<? extends WireBird>, List<? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ BirdsResponse f11774g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2819a(BirdsResponse birdsResponse) {
                super(1);
                this.f11774g = birdsResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<WireBird> invoke(List<WireBird> existingBirds) {
                List plus;
                Intrinsics.checkNotNullParameter(existingBirds, "existingBirds");
                plus = CollectionsKt___CollectionsKt.plus((Collection) this.f11774g.getBirds(), (Iterable) existingBirds);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : plus) {
                    if (hashSet.add(((WireBird) obj).getId())) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }

        public C2818n() {
            super(1);
        }

        /* renamed from: a */
        public final void m105212a(BirdsResponse birdsResponse) {
            C2793GM.this.f11738s.m71837i(new C2819a(birdsResponse));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdsResponse birdsResponse) {
            m105212a(birdsResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/BirdsResponse;", "response", "", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BirdsResponse;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$fetchNearbyBirds$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n1855#2,2:705\n1855#2,2:707\n*S KotlinDebug\n*F\n+ 1 BirdManagerImpl.kt\nco/bird/android/app/manager/BirdManagerImpl$fetchNearbyBirds$2\n*L\n273#1:705,2\n276#1:707,2\n*E\n"})
    /* renamed from: GM$o */
    /* loaded from: classes2.dex */
    public static final class C2820o extends Lambda implements Function1<BirdsResponse, Map<String, ? extends Integer>> {

        /* renamed from: g */
        public static final C2820o f11775g = new C2820o();

        public C2820o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, Integer> invoke(BirdsResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> cellIds = response.getCellIds();
            if (cellIds != null) {
                for (String str : cellIds) {
                    linkedHashMap.put(str, 0);
                }
            }
            for (WireBird wireBird : response.getBirds()) {
                String cellId = wireBird.getCellId();
                if (cellId != null) {
                    linkedHashMap.put(cellId, Integer.valueOf(((Number) linkedHashMap.getOrDefault(cellId, 0)).intValue() + 1));
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$p */
    /* loaded from: classes2.dex */
    public static final class C2821p extends Lambda implements Function0<Z84<Set<? extends String>>> {
        public C2821p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Set<? extends String>> invoke2() {
            return Z84.f47888d.m73663b(C2793GM.this.f11744y);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/MapDirectionResponse;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/MapDirectionResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$q */
    /* loaded from: classes2.dex */
    public static final class C2822q extends Lambda implements Function1<MapDirectionResponse, InterfaceC23434B<? extends Route>> {
        public C2822q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Route> invoke(MapDirectionResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.just(C2793GM.this.m105236w1(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/Route;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Route;)Lco/bird/android/model/Route;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$r */
    /* loaded from: classes2.dex */
    public static final class C2823r extends Lambda implements Function1<Route, Route> {

        /* renamed from: h */
        public final /* synthetic */ String f11779h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2823r(String str) {
            super(1);
            this.f11779h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Route invoke(Route result) {
            Intrinsics.checkNotNullParameter(result, "result");
            C2793GM.this.f11734o.put(this.f11779h, result);
            return result;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/model/Route;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$s */
    /* loaded from: classes2.dex */
    public static final class C2824s extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends Route>> {

        /* renamed from: g */
        public static final C2824s f11780g = new C2824s();

        public C2824s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Route> invoke(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$t */
    /* loaded from: classes2.dex */
    public static final class C2825t extends Lambda implements Function0<Z84<List<? extends WireBird>>> {
        public C2825t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireBird>> invoke2() {
            return Z84.f47888d.m73663b(C2793GM.this.f11738s);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$u */
    /* loaded from: classes2.dex */
    public static final class C2826u extends Lambda implements Function0<Z84<List<? extends WireBird>>> {
        public C2826u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireBird>> invoke2() {
            return Z84.f47888d.m73663b(C2793GM.this.f11742w);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$v */
    /* loaded from: classes2.dex */
    public static final class C2827v extends Lambda implements Function0<Z84<List<? extends WireBird>>> {
        public C2827v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireBird>> invoke2() {
            return Z84.f47888d.m73663b(C2793GM.this.f11740u);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "", "it", C17296a.f69688o, "(Ljava/util/Set;)Ljava/util/Set;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$w */
    /* loaded from: classes2.dex */
    public static final class C2828w extends Lambda implements Function1<Set<? extends String>, Set<? extends String>> {

        /* renamed from: g */
        public final /* synthetic */ String f11784g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2828w(String str) {
            super(1);
            this.f11784g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Set<String> invoke(Set<String> it) {
            Set<String> plus;
            Intrinsics.checkNotNullParameter(it, "it");
            plus = SetsKt___SetsKt.plus(it, this.f11784g);
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$x */
    /* loaded from: classes2.dex */
    public static final class C2829x extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C38431bE5 f11786h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2829x(C38431bE5 c38431bE5) {
            super(1);
            this.f11786h = c38431bE5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C2793GM.this.f11726g.mo55905y(C39024cE5.toSleepEndedEvent$default(this.f11786h, false, null, 2, null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$y */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2830y extends FunctionReferenceImpl implements Function1<List<? extends WireBird>, Unit> {
        public C2830y(Object obj) {
            super(1, obj, C37791a94.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37791a94) this.receiver).accept(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GM$z */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2831z extends FunctionReferenceImpl implements Function1<List<? extends WireBird>, Unit> {
        public C2831z(Object obj) {
            super(1, obj, C37791a94.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireBird> list) {
            invoke2((List<WireBird>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37791a94) this.receiver).accept(p0);
        }
    }

    public C2793GM(V74 promoManager, InterfaceC6097Oh buildConfig, InterfaceC8601VK birdClient, InterfaceC44666lj5 scanClient, InterfaceC39622dD1 mapClient, InterfaceC1880Ea analyticsManager, InterfaceC43415jd0 cannotAccessClient, InterfaceC47256q54 privateBirdsManager, String googleMapClient, String googleMapSecret, InterfaceC40001dr4 locationManager, InterfaceC31654Ae5 rxBleVehicleManager, InterfaceC7168RR birdRepo, VL1 hibernationRepo, InterfaceC51461xB1 genericNonBirdClient) {
        String replace$default;
        String replace$default2;
        Set emptySet;
        Lazy lazy;
        List emptyList;
        Lazy lazy2;
        List emptyList2;
        Lazy lazy3;
        List emptyList3;
        Lazy lazy4;
        Set emptySet2;
        Lazy lazy5;
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        Intrinsics.checkNotNullParameter(scanClient, "scanClient");
        Intrinsics.checkNotNullParameter(mapClient, "mapClient");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(cannotAccessClient, "cannotAccessClient");
        Intrinsics.checkNotNullParameter(privateBirdsManager, "privateBirdsManager");
        Intrinsics.checkNotNullParameter(googleMapClient, "googleMapClient");
        Intrinsics.checkNotNullParameter(googleMapSecret, "googleMapSecret");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(rxBleVehicleManager, "rxBleVehicleManager");
        Intrinsics.checkNotNullParameter(birdRepo, "birdRepo");
        Intrinsics.checkNotNullParameter(hibernationRepo, "hibernationRepo");
        Intrinsics.checkNotNullParameter(genericNonBirdClient, "genericNonBirdClient");
        this.f11721b = promoManager;
        this.f11722c = buildConfig;
        this.f11723d = birdClient;
        this.f11724e = scanClient;
        this.f11725f = mapClient;
        this.f11726g = analyticsManager;
        this.f11727h = cannotAccessClient;
        this.f11728i = googleMapClient;
        this.f11729j = locationManager;
        this.f11730k = rxBleVehicleManager;
        this.f11731l = birdRepo;
        this.f11732m = hibernationRepo;
        this.f11733n = genericNonBirdClient;
        this.f11734o = new LruCache<>(20);
        C2029Ey.C2030a m108182a = C2029Ey.m108182a();
        replace$default = StringsKt__StringsJVMKt.replace$default(googleMapSecret, (char) CoreConstants.DASH_CHAR, '+', false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, '_', (char) JsonPointer.SEPARATOR, false, 4, (Object) null);
        this.f11735p = m108182a.m108180a(replace$default2);
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptySet = SetsKt__SetsKt.emptySet();
        this.f11736q = C37791a94.C10586a.create$default(c10586a, emptySet, null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C2815k());
        this.f11737r = lazy;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f11738s = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        lazy2 = LazyKt__LazyJVMKt.lazy(new C2825t());
        this.f11739t = lazy2;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        this.f11740u = C37791a94.C10586a.create$default(c10586a, emptyList2, null, 2, null);
        lazy3 = LazyKt__LazyJVMKt.lazy(new C2827v());
        this.f11741v = lazy3;
        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
        this.f11742w = C37791a94.C10586a.create$default(c10586a, emptyList3, null, 2, null);
        lazy4 = LazyKt__LazyJVMKt.lazy(new C2826u());
        this.f11743x = lazy4;
        emptySet2 = SetsKt__SetsKt.emptySet();
        this.f11744y = C37791a94.C10586a.create$default(c10586a, emptySet2, null, 2, null);
        lazy5 = LazyKt__LazyJVMKt.lazy(new C2821p());
        this.f11745z = lazy5;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Z84<List<WireBird>> mo71580b1 = mo71580b1();
        Z84<List<WireBird>> m105238v1 = m105238v1();
        Z84<Optional<List<WireBird>>> mo18213a = privateBirdsManager.mo18213a();
        final C2806c c2806c = C2806c.f11762g;
        Observable distinctUntilChanged = mo18213a.map(new InterfaceC23492o() { // from class: BM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m105267e0;
                m105267e0 = C2793GM.m105267e0(Function1.this, obj);
                return m105267e0;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "privateBirdsManager.priv…)}.distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(mo71580b1, m105238v1, distinctUntilChanged, m105241u1(), C2797D.f11750a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        final C2807d c2807d = C2807d.f11763g;
        Observable doOnComplete = combineLatest.doOnNext(new InterfaceC23484g() { // from class: EM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105265f0(Function1.this, obj);
            }
        }).doOnComplete(new InterfaceC23478a() { // from class: cM
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2793GM.m105256j0();
            }
        });
        final C2808e c2808e = C2808e.f11764g;
        Observable observeOn = doOnComplete.doOnError(new InterfaceC23484g() { // from class: dM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105255k0(Function1.this, obj);
            }
        }).doOnDispose(new InterfaceC23478a() { // from class: eM
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2793GM.m105252m0();
            }
        }).observeOn(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "BirdObservables.combineL…Schedulers.computation())");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2809f c2809f = new C2809f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: fM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105251n0(Function1.this, obj);
            }
        };
        final C2810g c2810g = C2810g.f11766b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: gM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105250o0(Function1.this, obj);
            }
        });
        Observable<List<WireBird>> distinctUntilChanged2 = privateBirdsManager.mo18205i().distinctUntilChanged();
        final C2811h c2811h = new C2811h();
        Observable<R> switchMap = distinctUntilChanged2.switchMap(new InterfaceC23492o() { // from class: hM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m105246s0;
                m105246s0 = C2793GM.m105246s0(Function1.this, obj);
                return m105246s0;
            }
        });
        final C2813i c2813i = C2813i.f11769g;
        Observable flatMapIterable = switchMap.flatMapIterable(new InterfaceC23492o() { // from class: iM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Iterable m105244t0;
                m105244t0 = C2793GM.m105244t0(Function1.this, obj);
                return m105244t0;
            }
        });
        final C2803a c2803a = new C2803a();
        AbstractC23461c flatMapCompletable = flatMapIterable.flatMapCompletable(new InterfaceC23492o() { // from class: jM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m105242u0;
                m105242u0 = C2793GM.m105242u0(Function1.this, obj);
                return m105242u0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "privateBirdsManager.owne…onErrorComplete()\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: CM
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2793GM.m105263g0();
            }
        };
        final C2805b c2805b = C2805b.f11761g;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: DM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105260h0(Function1.this, obj);
            }
        });
    }

    /* renamed from: A1 */
    public static final void m105298A1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B1 */
    public static final void m105297B1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F1 */
    public static final void m105290F1(C2793GM this$0, C38431bE5 event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        this$0.f11726g.mo55905y(C39024cE5.toSleepEndedEvent$default(event, true, null, 2, null));
    }

    /* renamed from: G1 */
    public static final void m105288G1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H1 */
    public static final void m105287H1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I1 */
    public static final void m105285I1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J1 */
    public static final PropertyReport m105283J1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PropertyReport) tmp0.invoke(obj);
    }

    /* renamed from: L1 */
    public static final List m105281L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final List m105267e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m105265f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m105263g0() {
    }

    /* renamed from: g1 */
    public static final List m105262g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m105260h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final List m105257i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m105256j0() {
        C41318g46.m40163a("completed init stream", new Object[0]);
    }

    /* renamed from: k0 */
    public static final void m105255k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m105254k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m105252m0() {
        C41318g46.m40163a("disposed init stream", new Object[0]);
    }

    /* renamed from: n0 */
    public static final void m105251n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m105250o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final Map m105249q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Map) tmp0.invoke(obj);
    }

    /* renamed from: r1 */
    public static final InterfaceC23434B m105247r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final InterfaceC23434B m105246s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final Route m105245s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Route) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final Iterable m105244t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final InterfaceC23434B m105243t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final InterfaceC23496h m105242u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final void m105234x1(C2793GM this$0, C38431bE5 sleepStarted) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sleepStarted, "$sleepStarted");
        this$0.f11726g.mo55905y(C39024cE5.toSleepEndedEvent$default(sleepStarted, true, null, 2, null));
    }

    /* renamed from: y1 */
    public static final void m105232y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z1 */
    public static final void m105230z1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: A0 */
    public Z84<Set<String>> mo71608A0() {
        return (Z84) this.f11737r.getValue();
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: B0 */
    public void mo71607B0() {
        this.f11738s.m71836j();
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: C0 */
    public void mo71606C0() {
        this.f11740u.m71836j();
    }

    /* renamed from: C1 */
    public <T> Observable<T> m105295C1(Observable<T> observable) {
        return InterfaceC10636aM.C10637a.m71563e(this, observable);
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: D0 */
    public Observable<WireBird> mo71605D0(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable<WireBird> m105295C1 = m105295C1(this.f11723d.m79980E(new ChirpBirdBody(bird.getId(), z)));
        Intrinsics.checkNotNullExpressionValue(m105295C1, "birdClient\n      .chirpB…arm))\n      .schedulers()");
        return m105295C1;
    }

    /* renamed from: D1 */
    public <T> AbstractC23442F<T> m105293D1(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC10636aM.C10637a.m71562f(this, abstractC23442F);
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: E0 */
    public AbstractC23461c mo71604E0(String birdId, MechanicalLockKind lockKind) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(lockKind, "lockKind");
        AbstractC23461c m33063X = this.f11723d.m79967p(new UnlockMechanicalBody(birdId, lockKind)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdClient.unlockMechani…scribeOn(Schedulers.io())");
        return m33063X;
    }

    /* renamed from: E1 */
    public final String m105292E1(String str) {
        String replace$default;
        String replace$default2;
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f11735p, Constants.HMAC_SHA1_ALGORITHM);
        Mac mac = Mac.getInstance(Constants.HMAC_SHA1_ALGORITHM);
        mac.init(secretKeySpec);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String m108172e = C2029Ey.m108181b().m108172e(mac.doFinal(bytes));
        Intrinsics.checkNotNullExpressionValue(m108172e, "getEncoder().encodeToString(sigBytes)");
        replace$default = StringsKt__StringsJVMKt.replace$default(m108172e, '+', (char) CoreConstants.DASH_CHAR, false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, (char) JsonPointer.SEPARATOR, '_', false, 4, (Object) null);
        return replace$default2;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: F0 */
    public AbstractC23461c mo71603F0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f11732m.mo73282l1(birdId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "hibernationRepo.hibernat…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: G0 */
    public AbstractC23461c mo71602G0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f11723d.m79970O(new UnlockHelmetLockBody(birdId));
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: H0 */
    public void mo71601H0(List<WireBird> eligibleBirds) {
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(eligibleBirds, "eligibleBirds");
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) eligibleBirds);
        WireBird wireBird = (WireBird) firstOrNull;
        if (wireBird == null) {
            return;
        }
        this.f11742w.m71837i(new C2801H(wireBird));
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: I0 */
    public Observable<Route> mo71600I0(Location from, Location to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        String str = from.getLatitude() + "," + from.getLongitude();
        String str2 = to.getLatitude() + "," + to.getLongitude();
        String str3 = str + str2;
        String str4 = this.f11728i;
        String str5 = "/maps/api/directions/json?origin=" + str + "&destination=" + str2 + "&sensor=false&mode=walking&client=" + str4;
        Route route = this.f11734o.get(str3);
        if (route == null) {
            Observable<MapDirectionResponse> m44535a = this.f11725f.m44535a(str, str2, false, "walking", str4, m105292E1(str5));
            final C2822q c2822q = new C2822q();
            Observable<R> flatMap = m44535a.flatMap(new InterfaceC23492o() { // from class: lM
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m105247r1;
                    m105247r1 = C2793GM.m105247r1(Function1.this, obj);
                    return m105247r1;
                }
            });
            final C2823r c2823r = new C2823r(str3);
            Observable map = flatMap.map(new InterfaceC23492o() { // from class: nM
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Route m105245s1;
                    m105245s1 = C2793GM.m105245s1(Function1.this, obj);
                    return m105245s1;
                }
            });
            final C2824s c2824s = C2824s.f11780g;
            Observable onErrorResumeNext = map.onErrorResumeNext(new InterfaceC23492o() { // from class: oM
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m105243t1;
                    m105243t1 = C2793GM.m105243t1(Function1.this, obj);
                    return m105243t1;
                }
            });
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "override fun getDirectio…ble.just(route)\n    }\n  }");
            Observable<Route> m105295C1 = m105295C1(onErrorResumeNext);
            Intrinsics.checkNotNullExpressionValue(m105295C1, "override fun getDirectio…ble.just(route)\n    }\n  }");
            return m105295C1;
        }
        Observable<Route> just = Observable.just(route);
        Intrinsics.checkNotNullExpressionValue(just, "{\n      Observable.just(route)\n    }");
        return just;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: J0 */
    public AbstractC23461c mo71599J0(Location location, double d) {
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<List<WireBird>> m105239v0 = m105239v0(location, d);
        final C2830y c2830y = new C2830y(this.f11738s);
        AbstractC23461c m33159G = m105239v0.m33101w(new InterfaceC23484g() { // from class: yM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105230z1(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "birdsNearbyClientSingle(…t)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: K0 */
    public AbstractC23442F<PropertyReport> mo71598K0(String birdId, String cannotAccessReportId, PropertyReportAction action, PropertyReportNextStep nextStep, String str) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(cannotAccessReportId, "cannotAccessReportId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        AbstractC23442F<HM4<PropertyReport>> m30195a = this.f11727h.m30195a(new PropertyReportBody(birdId, cannotAccessReportId, action, nextStep, str));
        final C2798E c2798e = C2798E.f11751g;
        AbstractC23442F<HM4<PropertyReport>> m33101w = m30195a.m33101w(new InterfaceC23484g() { // from class: bM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105287H1(Function1.this, obj);
            }
        });
        final C2799F c2799f = C2799F.f11752g;
        AbstractC23442F<HM4<PropertyReport>> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: mM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105285I1(Function1.this, obj);
            }
        });
        final C2800G c2800g = C2800G.f11753g;
        AbstractC23442F m33157I = m33106t.m33157I(new InterfaceC23492o() { // from class: xM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                PropertyReport m105283J1;
                m105283J1 = C2793GM.m105283J1(Function1.this, obj);
                return m105283J1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "cannotAccessClient.submi…\n      .map { it.body() }");
        return m33157I;
    }

    /* renamed from: K1 */
    public final AbstractC23442F<List<WireBird>> m105282K1(String str, List<Integer> list, String str2) {
        AbstractC23442F zigZagVehicles$default = InterfaceC51461xB1.C30058a.getZigZagVehicles$default(this.f11733n, str, null, 2, null);
        final C2802I c2802i = new C2802I(list, str2);
        AbstractC23442F<List<WireBird>> m33157I = zigZagVehicles$default.m33157I(new InterfaceC23492o() { // from class: pM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m105281L1;
                m105281L1 = C2793GM.m105281L1(Function1.this, obj);
                return m105281L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "centerIds: List<Int>, pa… .toMutableList()\n      }");
        return m33157I;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: L0 */
    public AbstractC23442F<HM4<List<LegacyRepairType>>> mo71597L0(ScanMode mode, String birdId) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<List<LegacyRepairType>>> m105293D1 = m105293D1(this.f11723d.m79981D(mode.toString(), birdId));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "birdClient.getRepairOpti…g(), birdId).schedulers()");
        return m105293D1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: M0 */
    public AbstractC23442F<WireBird> mo71596M0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<WireBird> m105293D1 = m105293D1(this.f11723d.m79969b(birdId));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "birdClient.getBirdById(b…Id = birdId).schedulers()");
        return m105293D1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: N0 */
    public Observable<WireBird> mo71595N0(WireBird bird, MapMode mode) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<WireBird> m105295C1 = m105295C1(this.f11723d.m79982C(new MarkMissingBirdBody(bird.getId(), mode.toScanMode())));
        Intrinsics.checkNotNullExpressionValue(m105295C1, "birdClient\n      .markMi…e()))\n      .schedulers()");
        return m105295C1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: O0 */
    public Observable<WireBird> mo71594O0(WireBird bird, final C38431bE5 sleepStarted) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(sleepStarted, "sleepStarted");
        this.f11726g.mo55905y(sleepStarted);
        Observable<WireBird> doOnComplete = this.f11723d.m79983B(new BirdIdBody(bird.getId())).doOnComplete(new InterfaceC23478a() { // from class: qM
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2793GM.m105234x1(C2793GM.this, sleepStarted);
            }
        });
        final C2829x c2829x = new C2829x(sleepStarted);
        Observable<WireBird> doOnError = doOnComplete.doOnError(new InterfaceC23484g() { // from class: rM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105232y1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun putBirdToSl…}\n      .schedulers()\n  }");
        Observable<WireBird> m105295C1 = m105295C1(doOnError);
        Intrinsics.checkNotNullExpressionValue(m105295C1, "override fun putBirdToSl…}\n      .schedulers()\n  }");
        return m105295C1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: P0 */
    public AbstractC23442F<Map<String, Integer>> mo71593P0(Location center, Set<String> cellIds) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(cellIds, "cellIds");
        InterfaceC8601VK interfaceC8601VK = this.f11723d;
        String provider = center.getProvider();
        if (provider == null) {
            provider = WireLocation.DEFAULT_SOURCE;
        }
        AbstractC23442F<BirdsResponse> m79979F = interfaceC8601VK.m79979F(new WireBirdByCellsRequest(WireLocationKt.toLocation(center, provider), cellIds));
        final C2818n c2818n = new C2818n();
        AbstractC23442F<BirdsResponse> m33101w = m79979F.m33101w(new InterfaceC23484g() { // from class: sM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105254k1(Function1.this, obj);
            }
        });
        final C2820o c2820o = C2820o.f11775g;
        AbstractC23442F m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: tM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Map m105249q1;
                m105249q1 = C2793GM.m105249q1(Function1.this, obj);
                return m105249q1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun fetchNearby…       result\n      }\n  }");
        return m33157I;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: Q0 */
    public AbstractC23442F<HM4<Unit>> mo71592Q0(String birdId, String userId, List<LoggedRepair> repairs, String str, ScanMode scanMode, String str2) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        AbstractC23442F<HM4<Unit>> m105293D1 = m105293D1(this.f11723d.m79975J(new RepairLogSubmitBody(birdId, userId, repairs, str, String.valueOf(scanMode), str2)));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "birdClient.submitLoggedR…     )\n    ).schedulers()");
        return m105293D1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: R0 */
    public Z84<List<WireBird>> mo71591R0() {
        return (Z84) this.f11743x.getValue();
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: S0 */
    public void mo71590S0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f11736q.m71837i(new C2828w(birdId));
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: T0 */
    public void mo71589T0(Set<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        this.f11744y.m71837i(new C2794A(birdIds));
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: U0 */
    public AbstractC23442F<BluetoothTrackBody> mo71588U0(String serialNumber, Integer num, Integer num2, Location location) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<BluetoothTrackBody> m105293D1 = m105293D1(this.f11723d.m79977H(new TrackBirdBody(serialNumber, num, num2, WireLocationKt.toLocation$default(location, null, 1, null))));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "birdClient\n      .trackB…   ))\n      .schedulers()");
        return m105293D1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: V0 */
    public AbstractC23442F<List<WireBird>> mo71587V0(Set<String> birdIds, Location location) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<BirdsResponse> m79962u = this.f11723d.m79962u(new NearbyBirdsByIdsRequest(birdIds, WireLocationKt.toLocation$default(location, null, 1, null)));
        final C2817m c2817m = C2817m.f11772g;
        AbstractC23442F m33157I = m79962u.m33157I(new InterfaceC23492o() { // from class: uM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m105257i1;
                m105257i1 = C2793GM.m105257i1(Function1.this, obj);
                return m105257i1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "birdClient\n      .getNea…   response.birds\n      }");
        return m33157I;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: W0 */
    public Observable<HM4<BirdScan>> mo71586W0(String code, MapMode mode, ScanIntention scanIntention, boolean z, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Observable<HM4<BirdScan>> m26905a = this.f11724e.m26905a(new ScanBody(code, mode.toScanMode(), scanIntention, Boolean.valueOf(z), str));
        final C2795B c2795b = new C2795B();
        Observable<HM4<BirdScan>> doOnNext = m26905a.doOnNext(new InterfaceC23484g() { // from class: zM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105297B1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun scanBird(co…}\n      .schedulers()\n  }");
        Observable<HM4<BirdScan>> m105295C1 = m105295C1(doOnNext);
        Intrinsics.checkNotNullExpressionValue(m105295C1, "override fun scanBird(co…}\n      .schedulers()\n  }");
        return m105295C1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: X0 */
    public Observable<Route> mo71585X0(Location from, WireBird to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        return mo71600I0(from, to.getLocation().fromLocation());
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: Y0 */
    public AbstractC23461c mo71584Y0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f11723d.m79966q(new UnlockCableBody(birdId));
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: Z0 */
    public AbstractC23461c mo71583Z0(String feedUrl, List<Integer> centerIds, String str) {
        Intrinsics.checkNotNullParameter(feedUrl, "feedUrl");
        Intrinsics.checkNotNullParameter(centerIds, "centerIds");
        AbstractC23442F<List<WireBird>> m105282K1 = m105282K1(feedUrl, centerIds, str);
        final C2831z c2831z = new C2831z(this.f11740u);
        AbstractC23461c m33159G = m105282K1.m33101w(new InterfaceC23484g() { // from class: AM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105298A1(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "zigZagVehiclesNearbySing…t)\n      .ignoreElement()");
        return m33159G;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: a */
    public Observable<Bird> mo71582a(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<Bird> subscribeOn = this.f11731l.mo39434a(birdId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "birdRepo.streamBird(bird…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: a1 */
    public AbstractC23442F<HM4<CannotAccessBirdReport>> mo71581a1(String birdId, String str, InaccessibleReason reason, InaccessibleReportSource source, String str2, List<String> nearbyIdentifiers, String str3, List<String> list, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(nearbyIdentifiers, "nearbyIdentifiers");
        return this.f11727h.m30194b(new CannotAccessReportRequest(birdId, str, reason, source, str2, nearbyIdentifiers, str3, list, str4, num));
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: b1 */
    public Z84<List<WireBird>> mo71580b1() {
        return (Z84) this.f11739t.getValue();
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: c1 */
    public AbstractC23442F<HM4<BirdLocations>> mo71579c1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<BirdLocations>> m105293D1 = m105293D1(this.f11723d.m79958y(birdId));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "birdClient.getLocations(birdId).schedulers()");
        return m105293D1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: d1 */
    public AbstractC23461c mo71578d1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f11723d.m79959x(new BirdIdBody(birdId)).ignoreElements().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdClient.markBirdAwake…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: e1 */
    public Observable<WireBird> mo71577e1(WireBird bird, AlarmCommand command, Integer num) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(command, "command");
        Observable<WireBird> m105295C1 = m105295C1(this.f11723d.m79963t(new AlarmBirdBody(bird.getId(), command, num)));
        Intrinsics.checkNotNullExpressionValue(m105295C1, "birdClient\n      .alarmB…nds))\n      .schedulers()");
        return m105295C1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: f1 */
    public AbstractC23442F<HM4<BirdCodeWithStatus>> mo71576f1(String str, String str2, String str3, String str4) {
        AbstractC23442F<HM4<BirdCodeWithStatus>> m105293D1 = m105293D1(this.f11723d.m79964s(str, str2, str3, str4));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "birdClient.getBirdByBlue…oximityUUID).schedulers()");
        return m105293D1;
    }

    /* renamed from: h1 */
    public final List<LatLng> m105259h1(String str) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i = i4 + 1;
                int charAt = str.charAt(i4) - '?';
                i7 |= (charAt & 31) << i8;
                i8 += 5;
                if (charAt < 32) {
                    break;
                }
                i4 = i;
            }
            if ((i7 & 1) != 0) {
                i2 = ~(i7 >> 1);
            } else {
                i2 = i7 >> 1;
            }
            int i9 = i2 + i5;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i3 = i + 1;
                int charAt2 = str.charAt(i) - '?';
                i10 |= (charAt2 & 31) << i11;
                i11 += 5;
                if (charAt2 < 32) {
                    break;
                }
                i = i3;
            }
            int i12 = i10 & 1;
            int i13 = i10 >> 1;
            if (i12 != 0) {
                i13 = ~i13;
            }
            i6 += i13;
            arrayList.add(new LatLng(i9 / 100000.0d, i6 / 100000.0d));
            i5 = i9;
            i4 = i3;
        }
        return arrayList;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: j */
    public AbstractC23461c mo71575j(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f11731l.mo39421j(birdId, z).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdRepo.lockBird(birdId…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: k */
    public AbstractC23442F<List<CannotAccessReportResponse>> mo71574k(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<List<CannotAccessReportResponse>> m33142Y = this.f11727h.m30193k(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "cannotAccessClient.canno…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: l */
    public AbstractC23442F<HM4<CannotAccessReportResponse>> mo71573l(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<CannotAccessReportResponse>> m105293D1 = m105293D1(this.f11727h.m30192l(birdId));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "cannotAccessClient.getLa…rdId)\n      .schedulers()");
        return m105293D1;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: m1 */
    public AbstractC23461c mo71572m1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f11723d.m79960w(new BirdIdBody(birdId)).ignoreElements().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdClient.markBirdAslee…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC10636aM.C10637a.m71565c(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC10636aM.C10637a.m71564d(this);
    }

    /* renamed from: u1 */
    public Z84<Set<String>> m105241u1() {
        return (Z84) this.f11745z.getValue();
    }

    /* renamed from: v0 */
    public final AbstractC23442F<List<WireBird>> m105239v0(Location location, double d) {
        AbstractC23442F<BirdsResponse> m79957z = this.f11723d.m79957z(location.getLatitude(), location.getLongitude(), d);
        final C2816l c2816l = C2816l.f11771g;
        AbstractC23442F m33157I = m79957z.m33157I(new InterfaceC23492o() { // from class: kM
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m105262g1;
                m105262g1 = C2793GM.m105262g1(Function1.this, obj);
                return m105262g1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "birdClient\n      .getNea…   response.birds\n      }");
        return m33157I;
    }

    /* renamed from: v1 */
    public Z84<List<WireBird>> m105238v1() {
        return (Z84) this.f11741v.getValue();
    }

    /* renamed from: w1 */
    public final Route m105236w1(MapDirectionResponse result) {
        String points;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(result, "result");
        ArrayList arrayList = new ArrayList();
        ArrayList<Leg> arrayList2 = new ArrayList();
        for (co.bird.api.response.Route route : result.getRoutes()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, route.getLegs());
        }
        ArrayList<Step> arrayList3 = new ArrayList();
        long j = 0;
        int i3 = 0;
        for (Leg leg : arrayList2) {
            Distance distance = leg.getDistance();
            if (distance != null) {
                i = distance.getValue();
            } else {
                i = 0;
            }
            i3 += i;
            Duration duration = leg.getDuration();
            if (duration != null) {
                i2 = duration.getValue();
            } else {
                i2 = 0;
            }
            j += i2;
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, leg.getSteps());
        }
        for (Step step : arrayList3) {
            OverviewPolyLine polyline = step.getPolyline();
            if (polyline != null && (points = polyline.getPoints()) != null) {
                arrayList.addAll(m105259h1(points));
            }
        }
        return new Route(arrayList, i3, j);
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: x0 */
    public AbstractC23461c mo71570x0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f11731l.mo39406x0(birdId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdRepo.fetchBirdById(b…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: y0 */
    public WireBird mo71569y0(Location location) {
        Object obj;
        Intrinsics.checkNotNullParameter(location, "location");
        List<WireBird> m73665a = mo71591R0().m73665a();
        Intrinsics.checkNotNullExpressionValue(m73665a, "latestNearbyBirds()");
        Iterator<T> it = m73665a.iterator();
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

    @Override // p000.InterfaceC10636aM
    /* renamed from: z0 */
    public AbstractC23461c mo71568z0(String birdId, final C38431bE5 event) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f11726g.mo55905y(event);
        AbstractC23461c m33029z = this.f11731l.mo39405y1(birdId).m33063X(C24542a.m31932c()).m33029z(new InterfaceC23478a() { // from class: vM
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C2793GM.m105290F1(C2793GM.this, event);
            }
        });
        final C2796C c2796c = new C2796C(event);
        AbstractC23461c m33063X = m33029z.m33084B(new InterfaceC23484g() { // from class: wM
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C2793GM.m105288G1(Function1.this, obj);
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "override fun sleepBird(b…beOn(Schedulers.io())\n  }");
        return m33063X;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC10636aM.C10637a.m71567a(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC10636aM.C10637a.m71566b(this);
    }

    @Override // p000.InterfaceC10636aM
    /* renamed from: o */
    public AbstractC23442F<HM4<BirdSummaryBody>> mo71571o(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<BirdSummaryBody>> m105293D1 = m105293D1(this.f11723d.m79968o(birdId));
        Intrinsics.checkNotNullExpressionValue(m105293D1, "birdClient.getBirdSummar…rdId)\n      .schedulers()");
        return m105293D1;
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Landroid/location/Location;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GM$a */
    /* loaded from: classes2.dex */
    public static final class C2803a extends Lambda implements Function1<Pair<? extends WireBird, ? extends Location>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BleScannedVehicle;", "vehicle", "Lio/reactivex/K;", "Lco/bird/api/request/BluetoothTrackBody;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GM$a$a */
        /* loaded from: classes2.dex */
        public static final class C2804a extends Lambda implements Function1<BleScannedVehicle, InterfaceC23447K<? extends BluetoothTrackBody>> {

            /* renamed from: g */
            public final /* synthetic */ C2793GM f11758g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f11759h;

            /* renamed from: i */
            public final /* synthetic */ Location f11760i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2804a(C2793GM c2793gm, WireBird wireBird, Location location) {
                super(1);
                this.f11758g = c2793gm;
                this.f11759h = wireBird;
                this.f11760i = location;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends BluetoothTrackBody> invoke(BleScannedVehicle vehicle) {
                Intrinsics.checkNotNullParameter(vehicle, "vehicle");
                C2793GM c2793gm = this.f11758g;
                String serialNumber = this.f11759h.getSerialNumber();
                Integer valueOf = Integer.valueOf(vehicle.getBattery());
                Integer valueOf2 = Integer.valueOf(vehicle.getDistance());
                Location location = this.f11760i;
                Intrinsics.checkNotNullExpressionValue(location, "location");
                return c2793gm.mo71588U0(serialNumber, valueOf, valueOf2, location);
            }
        }

        public C2803a() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<WireBird, ? extends Location> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird component1 = pair.component1();
            AbstractC23442F scan$default = InterfaceC31654Ae5.C0167a.scan$default(C2793GM.this.f11730k, C49697uC6.m10640b(component1), false, 2, null);
            final C2804a c2804a = new C2804a(C2793GM.this, component1, pair.component2());
            return scan$default.m33165A(new InterfaceC23492o() { // from class: FM
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C2793GM.C2803a.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).m33142Y(C24542a.m31932c()).m33159G().m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends WireBird, ? extends Location> pair) {
            return invoke2((Pair<WireBird, ? extends Location>) pair);
        }
    }
}
