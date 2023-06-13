package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.coreinterface.manager.AckLockTimeoutException;
import co.bird.android.coreinterface.manager.RideNotPresentException;
import co.bird.android.model.BadAreaType;
import co.bird.android.model.CompleteRideResponse;
import co.bird.android.model.CompleteRideResponseError;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import co.bird.android.model.LastLockComplianceModel;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.PhysicalLockEvent;
import co.bird.android.model.PhysicalLockEventKind;
import co.bird.android.model.RideStartTimeConstraint;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateEvent;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStates;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.User;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.BirdStatus;
import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.RideStatusField;
import co.bird.android.model.constant.UploadKind;
import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.exception.LocationDisabledException;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdEvent;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireSafeStartValues;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.RideConfig;
import co.bird.api.request.DetectHelmetSelfieRequest;
import co.bird.api.request.DisputeRideCreateRequest;
import co.bird.api.request.DisputeRideFinalizeRequest;
import co.bird.api.request.ParkingEvaluationFeedbackBody;
import co.bird.api.request.RideEvaluatedParkingInfo;
import co.bird.api.request.RideIdBody;
import co.bird.api.request.RideStatusBody;
import co.bird.api.request.UpdateRidePhotoBody;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.DetectHelmetSelfieResponse;
import co.bird.api.response.DisputeRideCreateResponse;
import co.bird.api.response.DisputeRideFinalizeResponse;
import co.bird.api.response.DownloadRideReceiptResponse;
import co.bird.api.response.RideSummary;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
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
import io.reactivex.InterfaceC24574u;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24522d;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24560e;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.p053io.CloseableKt;
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.ble.AbstractC26684u0;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p000.C37791a94;
import p000.IT4;
import p000.InterfaceC27246pJ;
import p000.InterfaceC38798br4;
import p000.Z84;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000ì\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 k2\u00020\u00012\u00020\u0002:\u0002Ü\u0001B¡\u0001\b\u0007\u0012\b\u0010 \u0001\u001a\u00030\u009d\u0001\u0012\b\u0010£\u0001\u001a\u00030¡\u0001\u0012\b\u0010¦\u0001\u001a\u00030¤\u0001\u0012\b\u0010©\u0001\u001a\u00030§\u0001\u0012\b\u0010¬\u0001\u001a\u00030ª\u0001\u0012\b\u0010¯\u0001\u001a\u00030\u00ad\u0001\u0012\b\u0010²\u0001\u001a\u00030°\u0001\u0012\b\u0010µ\u0001\u001a\u00030³\u0001\u0012\b\u0010¹\u0001\u001a\u00030¶\u0001\u0012\b\u0010½\u0001\u001a\u00030º\u0001\u0012\b\u0010Á\u0001\u001a\u00030¾\u0001\u0012\b\u0010Å\u0001\u001a\u00030Â\u0001\u0012\b\u0010É\u0001\u001a\u00030Æ\u0001\u0012\b\u0010\u008e\u0002\u001a\u00030\u008d\u0002\u0012\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\r\u001a\u00020\fH\u0002J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J@\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0002J2\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0002J2\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0002J:\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010&\u001a\u00020\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010(\u001a\u00020 2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J,\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010&\u001a\u00020\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010+\u001a\u00020 H\u0002J,\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010&\u001a\u00020\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010+\u001a\u00020 H\u0002J8\u00103\u001a\b\u0012\u0004\u0012\u0002000\u00122\u0006\u0010&\u001a\u00020\u001d2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001c2\u0006\u00102\u001a\u00020 H\u0002J0\u00104\u001a\b\u0012\u0004\u0012\u0002000\u00122\u0006\u0010&\u001a\u00020\u001d2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001cH\u0002J0\u00105\u001a\b\u0012\u0004\u0012\u0002000\u00122\u0006\u0010&\u001a\u00020\u001d2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001cH\u0002J6\u00108\u001a\b\u0012\u0004\u0012\u0002070\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010+\u001a\u00020 2\f\u00106\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010&\u001a\u00020\u001dH\u0002J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001dH\u0002J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001dH\u0002J0\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0\t*\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010;\u001a\u00020 H\u0002J&\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010+\u001a\u00020 H\u0002J)\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001d2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001d2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\bA\u0010@J\u001c\u0010C\u001a\u0002002\u0006\u0010B\u001a\u00020\u000e2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001dH\u0002J(\u0010I\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u00072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010GH\u0002J2\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010D\u001a\u00020\u00072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010EH\u0002J2\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010D\u001a\u00020\u00072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010EH\u0002J\u0010\u0010L\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010M\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010N\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020 H\u0002J\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\f0\t*\u00020\u001d2\u0006\u0010Q\u001a\u00020PH\u0002J\f\u0010S\u001a\u00020 *\u00020\u001dH\u0002J\u000e\u0010T\u001a\u0004\u0018\u00010E*\u00020\u001dH\u0002J\u001e\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010D\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u0007H\u0016J\u0010\u0010Z\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020XH\u0007J\u0010\u0010\\\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0007H\u0016J\n\u0010]\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001d0\tH\u0016J$\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0012H\u0016J\u0012\u0010b\u001a\u00020a2\b\u0010`\u001a\u0004\u0018\u00010\fH\u0016J\u001e\u0010c\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020 H\u0016J \u0010d\u001a\b\u0012\u0004\u0012\u0002000\u00122\u0006\u0010&\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J\u0018\u0010f\u001a\u00020a2\u0006\u0010D\u001a\u00020\u00072\u0006\u0010e\u001a\u00020EH\u0016J\u0018\u0010g\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u00072\u0006\u0010e\u001a\u00020EH\u0016J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u00122\u0006\u0010&\u001a\u00020\u001dH\u0016J\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\u00122\u0006\u0010&\u001a\u00020\u001dH\u0016J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020l0\u00122\u0006\u0010D\u001a\u00020\u0007H\u0016J\b\u0010m\u001a\u00020\u0003H\u0016J\u0010\u0010n\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J3\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00112\u0006\u0010D\u001a\u00020\u00072\u0006\u0010o\u001a\u00028\u00002\u0006\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\bp\u0010qJ'\u0010r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001d2\b\u0010>\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\br\u0010@J'\u0010s\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001d2\b\u0010>\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\bs\u0010@J3\u0010u\u001a\b\u0012\u0004\u0012\u00020\f0\t*\u00020\u001d2\u0006\u0010+\u001a\u00020 2\b\u0010>\u001a\u0004\u0018\u00010\u00172\u0006\u0010t\u001a\u00020 H\u0000¢\u0006\u0004\bu\u0010vJ \u0010w\u001a\b\u0012\u0004\u0012\u0002000\u00122\u0006\u0010&\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J\u0014\u0010x\u001a\u0004\u0018\u00010\u00152\b\u0010D\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010y\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010{\u001a\u0004\u0018\u00010\u00152\u0006\u0010z\u001a\u00020\u0007H\u0016J\u0014\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0|0\tH\u0016J\u000e\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0016J\b\u0010\u007f\u001a\u00020\u0003H\u0016J)\u0010\u0084\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u00010\t2\u0007\u0010\u0080\u0001\u001a\u00020\u00172\u0007\u0010\u0081\u0001\u001a\u00020\u0017H\u0016J\u0018\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\t2\u0006\u0010D\u001a\u00020\u0007H\u0016J\u0016\u0010\u0088\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0|0\u0087\u0001H\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020 H\u0016J\u0017\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\u0006\u0010&\u001a\u00020\u001dH\u0016J)\u0010\u008e\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u00010\u00122\u0006\u0010z\u001a\u00020\u00072\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016J\u0017\u0010\u0090\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008f\u00010\u008c\u00010\u0012H\u0016J\u000b\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0007H\u0016J!\u0010\u0093\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0092\u00010\u008c\u00010\u00122\b\u0010z\u001a\u0004\u0018\u00010\u0007H\u0016J'\u0010\u0095\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020G0\u008c\u00010\u00122\u0006\u0010D\u001a\u00020\u00072\u0007\u0010\u0094\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u0096\u0001\u001a\u00020\u0003H\u0016J\u0010\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u0012H\u0016J,\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u00122\u0006\u0010V\u001a\u00020\u00072\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010D\u001a\u0004\u0018\u00010\u0007H\u0016R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010£\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010¢\u0001R\u0018\u0010¦\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010¥\u0001R\u0017\u0010©\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010¨\u0001R\u0018\u0010¬\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010«\u0001R\u0018\u0010¯\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010®\u0001R\u0018\u0010²\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010±\u0001R\u0018\u0010µ\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010´\u0001R\u0018\u0010¹\u0001\u001a\u00030¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010½\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010Á\u0001\u001a\u00030¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010É\u0001\u001a\u00030Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R.\u0010Ð\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00150Ë\u00010Ê\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R(\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010Ê\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Í\u0001\u001a\u0006\bÓ\u0001\u0010Ï\u0001R(\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010Ê\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÖ\u0001\u0010Í\u0001\u001a\u0006\b×\u0001\u0010Ï\u0001R.\u0010Ú\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00150Ë\u00010Ê\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b×\u0001\u0010Í\u0001\u001a\u0006\bÙ\u0001\u0010Ï\u0001R/\u0010Þ\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Û\u00010Ë\u00010Ê\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Í\u0001\u001a\u0006\bÝ\u0001\u0010Ï\u0001R'\u0010á\u0001\u001a\t\u0012\u0004\u0012\u00020 0Ê\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bß\u0001\u0010Í\u0001\u001a\u0006\bà\u0001\u0010Ï\u0001R@\u0010æ\u0001\u001a\"\u0012\u001d\u0012\u001b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020E0â\u0001j\u0003`ã\u00010Ë\u00010Ê\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bä\u0001\u0010Í\u0001\u001a\u0006\bå\u0001\u0010Ï\u0001R&\u0010ê\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010\t8VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\\\u0010Í\u0001\u001a\u0006\bè\u0001\u0010é\u0001R#\u0010í\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0ë\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bs\u0010ì\u0001R&\u0010ñ\u0001\u001a\u0012\u0012\r\u0012\u000b ï\u0001*\u0004\u0018\u00010\u001d0\u001d0î\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010ð\u0001R\u001e\u0010ô\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010ò\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bm\u0010ó\u0001R(\u0010õ\u0001\u001a\u0014\u0012\u000f\u0012\r ï\u0001*\u0005\u0018\u00010ç\u00010ç\u00010î\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b]\u0010ð\u0001R&\u0010÷\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Û\u00010Ë\u00010ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0001\u0010ó\u0001R\u001e\u0010ù\u0001\u001a\t\u0012\u0004\u0012\u00020 0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ó\u0001R7\u0010ú\u0001\u001a\"\u0012\u001d\u0012\u001b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020E0â\u0001j\u0003`ã\u00010Ë\u00010ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010ó\u0001R\"\u0010ý\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070û\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010ü\u0001R!\u0010\u0082\u0002\u001a\n\u0012\u0005\u0012\u00030ÿ\u00010þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R'\u0010\u0085\u0002\u001a\u0012\u0012\r\u0012\u000b ï\u0001*\u0004\u0018\u00010\u00030\u00030\u0083\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010\u0084\u0002R\u001d\u0010\u0086\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170î\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\br\u0010ð\u0001RV\u0010\u0089\u0002\u001aA\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001d ï\u0001*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010|0| ï\u0001*\u001f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001d ï\u0001*\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010|0|\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0017\u0010\u008c\u0002\u001a\u00020 8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002¨\u0006\u0093\u0002"}, m28432d2 = {"LIT4;", "LYR4;", "Lbr4;", "", "F4", "", "jpeg", "", "fileName", "Lio/reactivex/Observable;", "Ljava/io/File;", "w5", "Lco/bird/android/model/wire/WireBird;", "bird", "", "error", "L4", "T", "Lio/reactivex/F;", "C4", "A4", "Lco/bird/android/model/RideState;", "rideState", "", "maxRideDurationNoRideZone", "maxRideDurationOutsideOperatingArea", "Lorg/joda/time/DateTime;", "F3", "LvT3;", "Lco/bird/android/model/wire/WireRide;", "startRidePiggyback", "Lkotlin/Function0;", "", "isUnlocked", "startRideSingle", "g4", "l4", "i4", "ride", "lockRidePiggyback", "lock", "isCompleted", Bird_Kt.MODEL_BIRD_B4, "locked", "f4", "e4", "LbF0;", "parkingNest", "Lco/bird/android/model/CompleteRideResponse;", "completeRidePiggyback", "isBtOnly", "V3", "a4", "Y3", "completedExternally", "Lco/bird/android/model/Vehicle;", "o4", "G3", "M3", "setLocked", "y4", "l5", "distance", "g5", "(Lco/bird/android/model/wire/WireRide;Ljava/lang/Integer;)Lio/reactivex/Observable;", "u4", "e", "Q3", "rideId", "Lco/bird/android/model/RideState$Status;", "status", "", "modifiedObject", "G4", "t3", "u3", "k5", "N4", "Y4", "r3", "Lco/bird/api/request/RideStatusBody;", "body", "O4", "n4", "X4", AbstractC26684u0.f100690q, "imageUrl", "e0", "LYK;", "event", "onEvent", "scanId", "v", "z", "h1", "V", "wireBird", "Lio/reactivex/c;", "x", "k0", "k1", "requestedState", "v0", "g1", "Lco/bird/api/response/DisputeRideCreateResponse;", "c0", "Lco/bird/api/response/DisputeRideFinalizeResponse;", "I", "Lco/bird/api/response/DownloadRideReceiptResponse;", "y", "O", "obj", "o5", "(Ljava/lang/String;Ljava/lang/Object;Z)Lio/reactivex/Observable;", "G", "w", "locationRequired", "M4", "(Lco/bird/android/model/wire/WireRide;ZLjava/lang/Integer;Z)Lio/reactivex/Observable;", "a0", "i1", "g0", "birdId", "q1", "", "J", "t0", "Z", "offset", "limit", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/api/response/RideSummary;", "P", "Lco/bird/android/model/wire/WireRideDetail;", "g", "Lio/reactivex/p;", "i", "c", "Lco/bird/android/model/PhysicalLockEventKind;", "eventType", "LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "h0", "Lco/bird/android/model/LastLockComplianceModel;", "h", "n0", "LDG3;", "f", "notes", "j0", "f0", "Lco/bird/android/model/wire/WireSafeStartValues;", DateTokenConverter.CONVERTER_KEY, "", "minConfidence", "Lco/bird/api/response/DetectHelmetSelfieResponse;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LNP4;", "LNP4;", "rideClient", "LXW2;", "LXW2;", "multiRideClient", "Lef6;", "Lef6;", "uploadManager", "LKn6;", "LKn6;", "vehicleTrackerManager", "LpJ;", "LpJ;", "bluetoothManager", "LpM3;", "LpM3;", "paymentIntentManager", "LTq4;", "LTq4;", "reactiveConfig", "LUz1;", "j", "LUz1;", "frequentFlyerManager", "LpU4;", "k", "LpU4;", "rideMapStateManager", "LEa;", "l", "LEa;", "analyticsManager", "LTo0;", "m", "LTo0;", "commandManager", "LV74;", "n", "LV74;", "promoManager", "LZ84;", "Lco/bird/android/buava/Optional;", "o", "Lkotlin/Lazy;", "R", "()LZ84;", "primaryRideState", "Lco/bird/android/model/RideStates;", "p", "o0", "rideStates", "Lco/bird/android/model/wire/configs/Config;", "q", "r", "rideConfig", "m0", "focusedRideState", "Lco/bird/android/model/RideStartTimeConstraint;", "s", "F", "leaveBadAreaDeadline", "t", "D", "badAreaRideExpired", "Lkotlin/Pair;", "Lco/bird/android/coreinterface/manager/RideActionRequest;", "u", "s0", "rideActionRequests", "Lco/bird/android/model/RideStateEvent;", "Q", "()Lio/reactivex/Observable;", "rideStateEvents", "", "Ljava/util/Map;", "firstUnlockFlowRideStartTimes", "Lma4;", "kotlin.jvm.PlatformType", "Lma4;", "bluetoothRideUnlocksRelay", "La94;", "La94;", "mutableRideStates", "mutableRideStateEvents", "A", "mutableLeaveBadAreaDeadline", "B", "mutableBadAreaRideExpired", "mutableRideActionRequests", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "lastRideScanId", "Lio/reactivex/subjects/e;", "Lco/bird/android/model/wire/WireBirdEvent;", "E", "Lio/reactivex/subjects/e;", "eventSubject", "LAG;", "LAG;", "requestActiveRidesRefresh", "activeRideCountRelay", "H", "Lio/reactivex/Observable;", "sharedActiveRides", "N", "()Z", "inAnyActiveRides", "LEg1;", "eventBus", "LRh6;", "userStream", "<init>", "(Landroid/content/Context;LNP4;LXW2;Lef6;LKn6;LpJ;LpM3;LTq4;LUz1;LpU4;LEa;LTo0;LV74;LEg1;LRh6;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n180#2:1627\n180#2:1628\n180#2:1631\n180#2:1632\n180#2:1633\n52#3,2:1629\n52#3,2:1634\n2624#4,3:1636\n1747#4,3:1639\n288#4,2:1643\n2624#4,3:1645\n1#5:1642\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl\n*L\n239#1:1627\n254#1:1628\n278#1:1631\n300#1:1632\n359#1:1633\n258#1:1629,2\n376#1:1634,2\n610#1:1636,3\n791#1:1639,3\n1318#1:1643,2\n752#1:1645,3\n*E\n"})
/* renamed from: IT4 */
/* loaded from: classes4.dex */
public final class IT4 implements YR4, InterfaceC38798br4 {

    /* renamed from: I */
    public static final C3643s f15511I = new C3643s(null);

    /* renamed from: A */
    public final C37791a94<Optional<RideStartTimeConstraint>> f15512A;

    /* renamed from: B */
    public final C37791a94<Boolean> f15513B;

    /* renamed from: C */
    public final C37791a94<Optional<Pair<String, RideState.Status>>> f15514C;

    /* renamed from: D */
    public AtomicReference<String> f15515D;

    /* renamed from: E */
    public C24560e<WireBirdEvent> f15516E;

    /* renamed from: F */
    public final C0058AG<Unit> f15517F;

    /* renamed from: G */
    public final C45168ma4<Integer> f15518G;

    /* renamed from: H */
    public final Observable<List<WireRide>> f15519H;

    /* renamed from: b */
    public final Context f15520b;

    /* renamed from: c */
    public final NP4 f15521c;

    /* renamed from: d */
    public final XW2 f15522d;

    /* renamed from: e */
    public final InterfaceC40476ef6 f15523e;

    /* renamed from: f */
    public final InterfaceC34076Kn6 f15524f;

    /* renamed from: g */
    public final InterfaceC27246pJ f15525g;

    /* renamed from: h */
    public final InterfaceC46820pM3 f15526h;

    /* renamed from: i */
    public final C36207Tq4 f15527i;

    /* renamed from: j */
    public final C36519Uz1 f15528j;

    /* renamed from: k */
    public final InterfaceC46893pU4 f15529k;

    /* renamed from: l */
    public final InterfaceC1880Ea f15530l;

    /* renamed from: m */
    public final InterfaceC36185To0 f15531m;

    /* renamed from: n */
    public final V74 f15532n;

    /* renamed from: o */
    public final Lazy f15533o;

    /* renamed from: p */
    public final Lazy f15534p;

    /* renamed from: q */
    public final Lazy f15535q;

    /* renamed from: r */
    public final Lazy f15536r;

    /* renamed from: s */
    public final Lazy f15537s;

    /* renamed from: t */
    public final Lazy f15538t;

    /* renamed from: u */
    public final Lazy f15539u;

    /* renamed from: v */
    public final Lazy f15540v;

    /* renamed from: w */
    public final Map<String, DateTime> f15541w;

    /* renamed from: x */
    public final C45168ma4<WireRide> f15542x;

    /* renamed from: y */
    public final C37791a94<RideStates> f15543y;

    /* renamed from: z */
    public final C45168ma4<RideStateEvent> f15544z;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$A */
    /* loaded from: classes4.dex */
    public static final class C3536A extends Lambda implements Function1<Unit, InterfaceC23447K<? extends CompleteRideResponse>> {

        /* renamed from: h */
        public final /* synthetic */ Map<EnumC34767Nm4, AbstractC23442F<CompleteRideResponse>> f15546h;

        /* renamed from: i */
        public final /* synthetic */ WireRide f15547i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3536A(Map<EnumC34767Nm4, AbstractC23442F<CompleteRideResponse>> map, WireRide wireRide) {
            super(1);
            this.f15546h = map;
            this.f15547i = wireRide;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends CompleteRideResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            IT4 it4 = IT4.this;
            AbstractC23442F m33152N = C34533Mm4.m94858q(this.f15546h).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "setupRace(raceParticipan…dSchedulers.mainThread())");
            return it4.m102197u3(m33152N, this.f15547i.getId(), RideState.Status.ENDED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$A0 */
    /* loaded from: classes4.dex */
    public static final class C3537A0 extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Ref.BooleanRef f15548g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3537A0(Ref.BooleanRef booleanRef) {
            super(0);
            this.f15548g = booleanRef;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f15548g.element);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/wire/WireRideDetail;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$B */
    /* loaded from: classes4.dex */
    public static final class C3538B extends Lambda implements Function1<WireRideDetail, WireRideDetail> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f15549g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3538B(WireRide wireRide) {
            super(1);
            this.f15549g = wireRide;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireRideDetail invoke(WireRideDetail rideDetail) {
            WireRideDetail copy;
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            copy = rideDetail.copy((r38 & 1) != 0 ? rideDetail.ride : C40963fU4.m41293c(this.f15549g, rideDetail.getRide()), (r38 & 2) != 0 ? rideDetail.birdTracks : null, (r38 & 4) != 0 ? rideDetail.birdEvents : null, (r38 & 8) != 0 ? rideDetail.rating : null, (r38 & 16) != 0 ? rideDetail.receipt : null, (r38 & 32) != 0 ? rideDetail.rideEndRidePhotoParkingEvaluation : null, (r38 & 64) != 0 ? rideDetail.coupons : null, (r38 & 128) != 0 ? rideDetail.distance : null, (r38 & 256) != 0 ? rideDetail.duration : null, (r38 & 512) != 0 ? rideDetail.cost : null, (r38 & 1024) != 0 ? rideDetail.costWithoutCoupon : null, (r38 & 2048) != 0 ? rideDetail.subtext : null, (r38 & 4096) != 0 ? rideDetail.title : null, (r38 & 8192) != 0 ? rideDetail.detail : null, (r38 & 16384) != 0 ? rideDetail.imageUrl : null, (r38 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? rideDetail.costImageUrl : null, (r38 & 65536) != 0 ? rideDetail.frequentFlyerView : null, (r38 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? rideDetail.dispute : null, (r38 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? rideDetail.reportStatus : null, (r38 & 524288) != 0 ? rideDetail.report : null);
            return copy;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$B0 */
    /* loaded from: classes4.dex */
    public static final class C3539B0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<InterfaceC23465c> f15550g;

        /* renamed from: h */
        public final /* synthetic */ Map<EnumC34767Nm4, AbstractC23442F<WireRide>> f15551h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3539B0(Ref.ObjectRef<InterfaceC23465c> objectRef, Map<EnumC34767Nm4, AbstractC23442F<WireRide>> map) {
            super(1);
            this.f15550g = objectRef;
            this.f15551h = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m102170a(InterfaceC23465c interfaceC23465c) {
            T t;
            AbstractC23461c m33159G;
            AbstractC23461c m33069Q;
            AbstractC23461c m33063X;
            Ref.ObjectRef<InterfaceC23465c> objectRef = this.f15550g;
            AbstractC23442F<WireRide> abstractC23442F = this.f15551h.get(EnumC34767Nm4.BLUETOOTH);
            if (abstractC23442F != null && (m33159G = abstractC23442F.m33159G()) != null && (m33069Q = m33159G.m33069Q()) != null && (m33063X = m33069Q.m33063X(C24542a.m31932c())) != null) {
                t = m33063X.subscribe();
            } else {
                t = 0;
            }
            objectRef.element = t;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m102170a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$C */
    /* loaded from: classes4.dex */
    public static final class C3540C extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3540C f15552g = new C3540C();

        public C3540C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "error while completing ride internal: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$C0 */
    /* loaded from: classes4.dex */
    public static final class C3541C0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f15554h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3541C0(WireBird wireBird) {
            super(1);
            this.f15554h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            IT4.this.m102340L4(this.f15554h, th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "kotlin.jvm.PlatformType", "rideDetail", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$D */
    /* loaded from: classes4.dex */
    public static final class C3542D extends Lambda implements Function1<WireRideDetail, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15556h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3542D(WireRide wireRide) {
            super(1);
            this.f15556h = wireRide;
        }

        /* renamed from: a */
        public final void m102169a(WireRideDetail wireRideDetail) {
            WireRide copy;
            RideState rideState;
            IT4.this.f15528j.m80513g(wireRideDetail.getFrequentFlyerView());
            copy = r1.copy((r45 & 1) != 0 ? r1.f66754id : null, (r45 & 2) != 0 ? r1.distance : 0.0d, (r45 & 4) != 0 ? r1.birdId : null, (r45 & 8) != 0 ? r1.bird : null, (r45 & 16) != 0 ? r1.birdEphemeralId : null, (r45 & 32) != 0 ? r1.cost : 0, (r45 & 64) != 0 ? r1.currency : null, (r45 & 128) != 0 ? r1.startedAt : null, (r45 & 256) != 0 ? r1.deliveryUnlockedAt : null, (r45 & 512) != 0 ? r1.completedAt : null, (r45 & 1024) != 0 ? r1.continuedAt : null, (r45 & 2048) != 0 ? r1.canceledAt : null, (r45 & 4096) != 0 ? r1.delivery : false, (r45 & 8192) != 0 ? r1.payAsYouGo : false, (r45 & 16384) != 0 ? r1.successfulTest : null, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r1.type : null, (r45 & 65536) != 0 ? r1.partnerId : null, (r45 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r1.billedMinutes : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r1.privateBirdId : null, (r45 & 524288) != 0 ? r1.vehicleModel : null, (r45 & 1048576) != 0 ? r1.tipId : null, (r45 & 2097152) != 0 ? r1.startedInNoRideZone : false, (r45 & 4194304) != 0 ? r1.startedOutsideOperatingArea : false, (r45 & 8388608) != 0 ? r1.isBadAreaRideEnabled : false, (r45 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r1.userGuestId : null, (r45 & 33554432) != 0 ? wireRideDetail.getRide().rideDetail : wireRideDetail);
            RideState mo75038i1 = IT4.this.mo75038i1(this.f15556h.getId());
            if (mo75038i1 != null) {
                rideState = mo75038i1.copy(copy, RideState.Status.ENDED, IT4.this.mo75030r().m73665a(), RideUpdateState.NONE);
            } else {
                rideState = null;
            }
            if (rideState == null) {
                String id = this.f15556h.getId();
                C41318g46.m40160d("No existing ride state found for " + id + " to update in completeRide flow", new Object[0]);
                return;
            }
            IT4.this.m102240k5(rideState);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRideDetail wireRideDetail) {
            m102169a(wireRideDetail);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$D0 */
    /* loaded from: classes4.dex */
    public static final class C3543D0 extends Lambda implements Function1<WireRide, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.BooleanRef f15557g;

        /* renamed from: h */
        public final /* synthetic */ IT4 f15558h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f15559i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3543D0(Ref.BooleanRef booleanRef, IT4 it4, WireBird wireBird) {
            super(1);
            this.f15557g = booleanRef;
            this.f15558h = it4;
            this.f15559i = wireBird;
        }

        /* renamed from: a */
        public final void m102168a(WireRide wireRide) {
            this.f15557g.element = true;
            this.f15558h.m102340L4(this.f15559i, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m102168a(wireRide);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRideDetail;", "detail", "Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRideDetail;)Lco/bird/android/model/CompleteRideResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$E */
    /* loaded from: classes4.dex */
    public static final class C3544E extends Lambda implements Function1<WireRideDetail, CompleteRideResponse> {

        /* renamed from: g */
        public static final C3544E f15560g = new C3544E();

        public C3544E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CompleteRideResponse invoke(WireRideDetail detail) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new CompleteRideResponse(detail, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "ride", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$E0 */
    /* loaded from: classes4.dex */
    public static final class C3545E0 extends Lambda implements Function1<WireRide, Unit> {
        public C3545E0() {
            super(1);
        }

        /* renamed from: a */
        public final void m102166a(WireRide ride) {
            IT4 it4 = IT4.this;
            Intrinsics.checkNotNullExpressionValue(ride, "ride");
            it4.m102332N4(new RideState(ride, RideState.Status.STARTED, IT4.this.mo75030r().m73665a(), RideUpdateState.LOCKING));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m102166a(wireRide);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "e", "Lio/reactivex/K;", "Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$F */
    /* loaded from: classes4.dex */
    public static final class C3546F extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends CompleteRideResponse>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15563h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireRide;", "rides", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$completeRideInternal$7$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n288#2,2:1627\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$completeRideInternal$7$1\n*L\n1247#1:1627,2\n*E\n"})
        /* renamed from: IT4$F$a */
        /* loaded from: classes4.dex */
        public static final class C3547a extends Lambda implements Function1<List<? extends WireRide>, InterfaceC24574u<? extends WireRide>> {

            /* renamed from: g */
            public final /* synthetic */ WireRide f15564g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3547a(WireRide wireRide) {
                super(1);
                this.f15564g = wireRide;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends WireRide> invoke(List<WireRide> rides) {
                Object obj;
                Intrinsics.checkNotNullParameter(rides, "rides");
                WireRide wireRide = this.f15564g;
                Iterator<T> it = rides.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((WireRide) obj).getId(), wireRide.getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                WireRide wireRide2 = (WireRide) obj;
                if (wireRide2 != null) {
                    return AbstractC24507p.m32068G(wireRide2);
                }
                return AbstractC24507p.m32024u();
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "activeRide", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/wire/WireRide;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$F$b */
        /* loaded from: classes4.dex */
        public static final class C3548b extends Lambda implements Function1<WireRide, WireRide> {

            /* renamed from: g */
            public final /* synthetic */ WireRide f15565g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3548b(WireRide wireRide) {
                super(1);
                this.f15565g = wireRide;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireRide invoke(WireRide activeRide) {
                Intrinsics.checkNotNullParameter(activeRide, "activeRide");
                return C40963fU4.m41293c(this.f15565g, activeRide);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "activeRide", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$F$c */
        /* loaded from: classes4.dex */
        public static final class C3549c extends Lambda implements Function1<WireRide, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IT4 f15566g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3549c(IT4 it4) {
                super(1);
                this.f15566g = it4;
            }

            /* renamed from: a */
            public final void m102151a(WireRide activeRide) {
                RideState.Status status;
                String id = activeRide.getId();
                Intrinsics.checkNotNullExpressionValue(activeRide, "activeRide");
                boolean m41295a = C40963fU4.m41295a(activeRide);
                C41318g46.m40163a("active ride found, gonna set ride " + id + " to locked? " + m41295a, new Object[0]);
                IT4 it4 = this.f15566g;
                String id2 = activeRide.getId();
                if (C40963fU4.m41295a(activeRide)) {
                    status = RideState.Status.LOCKED;
                } else {
                    status = RideState.Status.UNLOCKED;
                }
                IT4.m102356H4(it4, id2, status, null, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
                m102151a(wireRide);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IT4$F$d */
        /* loaded from: classes4.dex */
        public static final class C3550d extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ WireRide f15567g;

            /* renamed from: h */
            public final /* synthetic */ IT4 f15568h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3550d(WireRide wireRide, IT4 it4) {
                super(1);
                this.f15567g = wireRide;
                this.f15568h = it4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                String id = this.f15567g.getId();
                boolean m41295a = C40963fU4.m41295a(this.f15567g);
                C41318g46.m40163a("error getting active rides, setting  " + id + " to locked? " + m41295a, new Object[0]);
                IT4.m102356H4(this.f15568h, this.f15567g.getId(), C40963fU4.m41295a(this.f15567g) ? RideState.Status.LOCKED : RideState.Status.UNLOCKED, null, 4, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "ride", "Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/CompleteRideResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$F$e */
        /* loaded from: classes4.dex */
        public static final class C3551e extends Lambda implements Function1<WireRide, CompleteRideResponse> {

            /* renamed from: g */
            public final /* synthetic */ IT4 f15569g;

            /* renamed from: h */
            public final /* synthetic */ Throwable f15570h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3551e(IT4 it4, Throwable th) {
                super(1);
                this.f15569g = it4;
                this.f15570h = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CompleteRideResponse invoke(WireRide ride) {
                Intrinsics.checkNotNullParameter(ride, "ride");
                return this.f15569g.m102321Q3(this.f15570h, ride);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3546F(WireRide wireRide) {
            super(1);
            this.f15563h = wireRide;
        }

        /* renamed from: g */
        public static final InterfaceC24574u m102159g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final WireRide m102158h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireRide) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final void m102157i(WireRide ride, IT4 this$0) {
            Intrinsics.checkNotNullParameter(ride, "$ride");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String id = ride.getId();
            C41318g46.m40163a("No active rides found, gonna set ride " + id + " to ended", new Object[0]);
            this$0.m102240k5(new RideState(ride, RideState.Status.ENDED, this$0.mo75030r().m73665a(), null, 8, null));
        }

        /* renamed from: j */
        public static final void m102156j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final void m102155k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final CompleteRideResponse m102154l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (CompleteRideResponse) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends CompleteRideResponse> invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C41318g46.m40158f(e, "Error while calling ride/complete, attempting to get active ride(s) to recover gracefully...", new Object[0]);
            AbstractC24507p<List<WireRide>> m76915i = IT4.this.f15522d.m76915i();
            final C3547a c3547a = new C3547a(this.f15563h);
            AbstractC24507p<R> m32021x = m76915i.m32021x(new InterfaceC23492o() { // from class: MT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m102159g;
                    m102159g = IT4.C3546F.m102159g(Function1.this, obj);
                    return m102159g;
                }
            });
            final C3548b c3548b = new C3548b(this.f15563h);
            AbstractC24507p m32067H = m32021x.m32067H(new InterfaceC23492o() { // from class: NT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireRide m102158h;
                    m102158h = IT4.C3546F.m102158h(Function1.this, obj);
                    return m102158h;
                }
            });
            final WireRide wireRide = this.f15563h;
            final IT4 it4 = IT4.this;
            AbstractC24507p m32031n = m32067H.m32031n(new InterfaceC23478a() { // from class: OT4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    IT4.C3546F.m102157i(WireRide.this, it4);
                }
            });
            final C3549c c3549c = new C3549c(IT4.this);
            AbstractC24507p m32026s = m32031n.m32026s(new InterfaceC23484g() { // from class: PT4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.C3546F.m102156j(Function1.this, obj);
                }
            });
            final C3550d c3550d = new C3550d(this.f15563h, IT4.this);
            AbstractC24507p m32029p = m32026s.m32029p(new InterfaceC23484g() { // from class: QT4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.C3546F.m102155k(Function1.this, obj);
                }
            });
            final C3551e c3551e = new C3551e(IT4.this, e);
            return m32029p.m32067H(new InterfaceC23492o() { // from class: RT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    CompleteRideResponse m102154l;
                    m102154l = IT4.C3546F.m102154l(Function1.this, obj);
                    return m102154l;
                }
            }).m32035j(IT4.m102317R3(IT4.this, e, null, 2, null)).m32060O(IT4.m102317R3(IT4.this, e, null, 2, null)).m32042f0(IT4.m102317R3(IT4.this, e, null, 2, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$F0 */
    /* loaded from: classes4.dex */
    public static final class C3552F0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C3552F0 f15571g = new C3552F0();

        public C3552F0() {
            super(1);
        }

        /* renamed from: a */
        public final void m102149a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("attempting to unlock cable lock via API", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m102149a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$G */
    /* loaded from: classes4.dex */
    public static final class C3553G extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f15573h;

        /* renamed from: i */
        public final /* synthetic */ WireRide f15574i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$G$a */
        /* loaded from: classes4.dex */
        public static final class C3554a extends Lambda implements Function1<Vehicle, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IT4 f15575g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f15576h;

            /* renamed from: i */
            public final /* synthetic */ WireRide f15577i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3554a(IT4 it4, WireBird wireBird, WireRide wireRide) {
                super(1);
                this.f15575g = it4;
                this.f15576h = wireBird;
                this.f15577i = wireRide;
            }

            /* renamed from: a */
            public final void m102147a(Vehicle vehicle) {
                InterfaceC1880Ea interfaceC1880Ea = this.f15575g.f15530l;
                String id = this.f15576h.getId();
                String model = this.f15576h.getModel();
                if (model == null) {
                    model = "unknown";
                }
                interfaceC1880Ea.mo55905y(new C1035CX(null, null, null, id, model, this.f15577i.getId(), Boolean.valueOf(this.f15577i.isPrimaryRide()), true, "ride_end", 7, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
                m102147a(vehicle);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3553G(WireBird wireBird, WireRide wireRide) {
            super(1);
            this.f15573h = wireBird;
            this.f15574i = wireRide;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Vehicle> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Observable lock$default = InterfaceC27246pJ.C27247a.lock$default(IT4.this.f15525g, this.f15573h, true, true, true, null, 16, null);
            final C3554a c3554a = new C3554a(IT4.this, this.f15573h, this.f15574i);
            return lock$default.doOnNext(new InterfaceC23484g() { // from class: ST4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.C3553G.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$G0 */
    /* loaded from: classes4.dex */
    public static final class C3555G0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3555G0 f15578g = new C3555G0();

        public C3555G0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while attempting to unlock cable lock via API", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$H */
    /* loaded from: classes4.dex */
    public static final class C3556H extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15580h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3556H(WireRide wireRide) {
            super(1);
            this.f15580h = wireRide;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WireBird> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IT4.this.m102212r3(this.f15580h, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$H0 */
    /* loaded from: classes4.dex */
    public static final class C3557H0 extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: g */
        public static final C3557H0 f15581g = new C3557H0();

        public C3557H0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23461c.m33071O();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$I */
    /* loaded from: classes4.dex */
    public static final class C3558I extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3558I f15582g = new C3558I();

        public C3558I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "error while attempting to lock bird in endBluetoothRide", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$I0 */
    /* loaded from: classes4.dex */
    public static final class C3559I0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C3559I0 f15583g = new C3559I0();

        public C3559I0() {
            super(1);
        }

        /* renamed from: a */
        public final void m102144a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40163a("attempting to unlock cable lock via BT", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m102144a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "error", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$J */
    /* loaded from: classes4.dex */
    public static final class C3560J extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f15584g;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IT4$J$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C3561a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BluetoothException.Reason.values().length];
                try {
                    iArr[BluetoothException.Reason.DISABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BluetoothException.Reason.TIMEOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BluetoothException.Reason.SCAN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BluetoothException.Reason.CONNECTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BluetoothException.Reason.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3560J(WireBird wireBird) {
            super(1);
            this.f15584g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            BluetoothException bluetoothException = error instanceof BluetoothException ? (BluetoothException) error : null;
            BluetoothException.Reason reason = bluetoothException != null ? bluetoothException.getReason() : null;
            int i = reason == null ? -1 : C3561a.$EnumSwitchMapping$0[reason.ordinal()];
            if (i == -1 || i == 1) {
                return Observable.error(error);
            }
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                return Observable.just(this.f15584g);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$J0 */
    /* loaded from: classes4.dex */
    public static final class C3562J0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3562J0 f15585g = new C3562J0();

        public C3562J0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while attempting to unlock cable lock via Bluetooth", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$K */
    /* loaded from: classes4.dex */
    public static final class C3563K extends Lambda implements Function1<Unit, WireBird> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f15586g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3563K(WireBird wireBird) {
            super(1);
            this.f15586g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBird invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f15586g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$K0 */
    /* loaded from: classes4.dex */
    public static final class C3564K0 extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: g */
        public static final C3564K0 f15587g = new C3564K0();

        public C3564K0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23461c.m33071O();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$L */
    /* loaded from: classes4.dex */
    public static final class C3565L extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3565L f15588g = new C3565L();

        public C3565L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "error while attempting to stop auto reconnecting bird in endCellularRide", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$L0 */
    /* loaded from: classes4.dex */
    public static final class C3566L0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3566L0 f15589g = new C3566L0();

        public C3566L0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Timeout Error while attempting to unlock cable lock, returning now", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$focusedRideState$2\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n52#2,2:1627\n1#3:1629\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$focusedRideState$2\n*L\n175#1:1627,2\n*E\n"})
    /* renamed from: IT4$M */
    /* loaded from: classes4.dex */
    public static final class C3567M extends Lambda implements Function0<Z84<Optional<RideState>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u00012 \u0010\u0005\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/android/model/RideState;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$focusedRideState$2$focusedRideStateObservable$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n1#2:1627\n*E\n"})
        /* renamed from: IT4$M$a */
        /* loaded from: classes4.dex */
        public static final class C3568a extends Lambda implements Function1<Pair<? extends Optional<WireBird>, ? extends RideStates>, Optional<RideState>> {

            /* renamed from: g */
            public static final C3568a f15591g = new C3568a();

            public C3568a() {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
                if (r0 == null) goto L14;
             */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Optional<RideState> invoke(Pair<Optional<WireBird>, RideStates> pair) {
                RideState firstActivePrimaryThenGuestOrNull;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                RideStates rideStates = pair.component2();
                Optional.C14443a c14443a = Optional.f63040c;
                WireBird m59035e = pair.component1().m59035e();
                if (m59035e != null) {
                    firstActivePrimaryThenGuestOrNull = rideStates.rideForBird(m59035e);
                    boolean z = false;
                    if (firstActivePrimaryThenGuestOrNull != null && RideStateKt.isInRide(firstActivePrimaryThenGuestOrNull)) {
                        z = true;
                    }
                    if (!z) {
                        firstActivePrimaryThenGuestOrNull = null;
                    }
                }
                Intrinsics.checkNotNullExpressionValue(rideStates, "rideStates");
                firstActivePrimaryThenGuestOrNull = RideStatesKt.firstActivePrimaryThenGuestOrNull(rideStates);
                return c14443a.m59033b(firstActivePrimaryThenGuestOrNull);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
        /* renamed from: IT4$M$b */
        /* loaded from: classes4.dex */
        public static final class C3569b<T1, T2, R> implements InterfaceC23480c {

            /* renamed from: a */
            public static final C3569b<T1, T2, R> f15592a = new C3569b<>();

            @Override // io.reactivex.functions.InterfaceC23480c
            /* renamed from: a */
            public final Pair<T1, T2> apply(T1 t1, T2 t2) {
                return TuplesKt.m28425to(t1, t2);
            }
        }

        public C3567M() {
            super(0);
        }

        /* renamed from: b */
        public static final Optional m102140b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
            if (r2 == null) goto L14;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Z84<Optional<RideState>> invoke() {
            RideState firstActivePrimaryThenGuestOrNull;
            C40463ee3 c40463ee3 = C40463ee3.f78649a;
            Observable combineLatest = Observable.combineLatest(IT4.this.f15529k.mo15900i(), IT4.this.f15543y, C3569b.f15592a);
            Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
            final C3568a c3568a = C3568a.f15591g;
            Observable focusedRideStateObservable = combineLatest.map(new InterfaceC23492o() { // from class: TT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m102140b;
                    m102140b = IT4.C3567M.m102140b(Function1.this, obj);
                    return m102140b;
                }
            });
            Optional.C14443a c14443a = Optional.f63040c;
            WireBird m59035e = IT4.this.f15529k.mo15900i().m73665a().m59035e();
            if (m59035e != null) {
                firstActivePrimaryThenGuestOrNull = IT4.this.mo75032o0().m73665a().rideForBird(m59035e);
                boolean z = false;
                if (firstActivePrimaryThenGuestOrNull != null && RideStateKt.isInRide(firstActivePrimaryThenGuestOrNull)) {
                    z = true;
                }
                if (!z) {
                    firstActivePrimaryThenGuestOrNull = null;
                }
            }
            firstActivePrimaryThenGuestOrNull = RideStatesKt.firstActivePrimaryThenGuestOrNull(IT4.this.mo75032o0().m73665a());
            Optional m59033b = c14443a.m59033b(firstActivePrimaryThenGuestOrNull);
            Z84.C10119a c10119a = Z84.f47888d;
            Intrinsics.checkNotNullExpressionValue(focusedRideStateObservable, "focusedRideStateObservable");
            return c10119a.m73662c(focusedRideStateObservable, m59033b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$M0 */
    /* loaded from: classes4.dex */
    public static final class C3570M0 extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C3570M0 f15593g = new C3570M0();

        public C3570M0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getRideConfig().getEnableLocationOptOut());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "rides", "", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$getActiveRides$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n1603#2,9:1627\n1855#2:1636\n1856#2:1638\n1612#2:1639\n1#3:1637\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$getActiveRides$1\n*L\n1463#1:1627,9\n1463#1:1636\n1463#1:1638\n1463#1:1639\n1463#1:1637\n*E\n"})
    /* renamed from: IT4$N */
    /* loaded from: classes4.dex */
    public static final class C3571N extends Lambda implements Function1<List<? extends WireRide>, Unit> {
        public C3571N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireRide> list) {
            invoke2((List<WireRide>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireRide> rides) {
            C41318g46.m40163a("rides returned from getActiveRides: " + rides, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(rides, "rides");
            IT4 it4 = IT4.this;
            ArrayList arrayList = new ArrayList();
            for (WireRide wireRide : rides) {
                RideState.Status m102292X4 = it4.m102292X4(wireRide);
                RideState rideState = m102292X4 != null ? new RideState(wireRide, m102292X4, it4.mo75030r().m73665a(), null, 8, null) : null;
                if (rideState != null) {
                    arrayList.add(rideState);
                }
            }
            IT4.this.f15543y.accept(new RideStates(arrayList));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$N0 */
    /* loaded from: classes4.dex */
    public static final class C3572N0 extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15596h;

        /* renamed from: i */
        public final /* synthetic */ Integer f15597i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3572N0(WireRide wireRide, Integer num) {
            super(1);
            this.f15596h = wireRide;
            this.f15597i = num;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IT4.this.m102336M4(this.f15596h, false, this.f15597i, !it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$O */
    /* loaded from: classes4.dex */
    public static final class C3573O extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3573O f15598g = new C3573O();

        public C3573O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String message = th.getMessage();
            C41318g46.m40160d("error in getActiveRides " + message, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "states", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideStates;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$updateExistingRideState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n1549#2:1627\n1620#2,3:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$updateExistingRideState$1\n*L\n1371#1:1627\n1371#1:1628,3\n*E\n"})
    /* renamed from: IT4$O0 */
    /* loaded from: classes4.dex */
    public static final class C3574O0 extends Lambda implements Function1<RideStates, RideStates> {

        /* renamed from: g */
        public final /* synthetic */ RideState f15599g;

        /* renamed from: h */
        public final /* synthetic */ Ref.BooleanRef f15600h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3574O0(RideState rideState, Ref.BooleanRef booleanRef) {
            super(1);
            this.f15599g = rideState;
            this.f15600h = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final RideStates invoke(RideStates states) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(states, "states");
            List<RideState> rideStates = states.getRideStates();
            RideState rideState = this.f15599g;
            Ref.BooleanRef booleanRef = this.f15600h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(rideStates, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (RideState rideState2 : rideStates) {
                if (Intrinsics.areEqual(rideState2.getRide().getId(), rideState.getRide().getId())) {
                    booleanRef.element = true;
                    rideState2 = rideState;
                }
                arrayList.add(rideState2);
            }
            return states.copy(arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$P */
    /* loaded from: classes4.dex */
    public static final class C3575P extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends CompleteRideResponse>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15602h;

        /* renamed from: i */
        public final /* synthetic */ C38435bF0 f15603i;

        /* renamed from: j */
        public final /* synthetic */ C50439vT3<CompleteRideResponse> f15604j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3575P(WireRide wireRide, C38435bF0 c38435bF0, C50439vT3<CompleteRideResponse> c50439vT3) {
            super(1);
            this.f15602h = wireRide;
            this.f15603i = c38435bF0;
            this.f15604j = c50439vT3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends CompleteRideResponse> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34533Mm4.m94861n(IT4.this.mo75053a0(this.f15602h, this.f15603i), this.f15604j).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/FileUploadReceipt;", "kotlin.jvm.PlatformType", "b", "(Ljava/io/File;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$P0 */
    /* loaded from: classes4.dex */
    public static final class C3576P0 extends Lambda implements Function1<File, InterfaceC23434B<? extends FileUploadReceipt>> {
        public C3576P0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends FileUploadReceipt> invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IT4.this.f15523e.mo28674h(it, ContentKind.PNG, UploadKind.RIDE_PHOTOS, Folder.RIDE_PHOTOS).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/CompleteRideResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/CompleteRideResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$Q */
    /* loaded from: classes4.dex */
    public static final class C3577Q extends Lambda implements Function1<CompleteRideResponse, InterfaceC23447K<? extends CompleteRideResponse>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15607h;

        /* renamed from: i */
        public final /* synthetic */ C50439vT3<CompleteRideResponse> f15608i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/CompleteRideResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$Q$a */
        /* loaded from: classes4.dex */
        public static final class C3578a extends Lambda implements Function1<WireBird, CompleteRideResponse> {

            /* renamed from: g */
            public final /* synthetic */ CompleteRideResponse f15609g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3578a(CompleteRideResponse completeRideResponse) {
                super(1);
                this.f15609g = completeRideResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CompleteRideResponse invoke(WireBird it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f15609g;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IT4$Q$b */
        /* loaded from: classes4.dex */
        public static final class C3579b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C3579b f15610g = new C3579b();

            public C3579b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while attempting best effort attempt to end bluetooth ride, falling back to complete/ride response", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3577Q(WireRide wireRide, C50439vT3<CompleteRideResponse> c50439vT3) {
            super(1);
            this.f15607h = wireRide;
            this.f15608i = c50439vT3;
        }

        /* renamed from: e */
        public static final CompleteRideResponse m102130e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (CompleteRideResponse) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m102129f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final CompleteRideResponse m102128g(CompleteRideResponse response, Throwable it) {
            Intrinsics.checkNotNullParameter(response, "$response");
            Intrinsics.checkNotNullParameter(it, "it");
            return response;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends CompleteRideResponse> invoke(final CompleteRideResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            AbstractC23442F firstOrError = IT4.this.m102361G3(this.f15607h).firstOrError();
            final C3578a c3578a = new C3578a(response);
            AbstractC23442F m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: UT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    CompleteRideResponse m102130e;
                    m102130e = IT4.C3577Q.m102130e(Function1.this, obj);
                    return m102130e;
                }
            });
            final C3579b c3579b = C3579b.f15610g;
            AbstractC23442F m33149Q = m33157I.m33106t(new InterfaceC23484g() { // from class: VT4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.C3577Q.m102129f(Function1.this, obj);
                }
            }).m33149Q(new InterfaceC23492o() { // from class: WT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    CompleteRideResponse m102128g;
                    m102128g = IT4.C3577Q.m102128g(CompleteRideResponse.this, (Throwable) obj);
                    return m102128g;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33149Q, "response ->\n          en…nErrorReturn { response }");
            return C34533Mm4.m94861n(m33149Q, this.f15608i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/FileUploadReceipt;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/FileUploadReceipt;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$Q0 */
    /* loaded from: classes4.dex */
    public static final class C3580Q0 extends Lambda implements Function1<FileUploadReceipt, InterfaceC23447K<? extends WireRide>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15612h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3580Q0(WireRide wireRide) {
            super(1);
            this.f15612h = wireRide;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireRide> invoke(FileUploadReceipt fileUploadReceipt) {
            Intrinsics.checkNotNullParameter(fileUploadReceipt, "<name for destructuring parameter 0>");
            return IT4.this.f15521c.m93923r(new UpdateRidePhotoBody(this.f15612h.getId(), fileUploadReceipt.component2()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/CompleteRideResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$R */
    /* loaded from: classes4.dex */
    public static final class C3581R extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends CompleteRideResponse>> {

        /* renamed from: h */
        public final /* synthetic */ WireRide f15614h;

        /* renamed from: i */
        public final /* synthetic */ C38435bF0 f15615i;

        /* renamed from: j */
        public final /* synthetic */ C50439vT3<CompleteRideResponse> f15616j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3581R(WireRide wireRide, C38435bF0 c38435bF0, C50439vT3<CompleteRideResponse> c50439vT3) {
            super(1);
            this.f15614h = wireRide;
            this.f15615i = c38435bF0;
            this.f15616j = c50439vT3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends CompleteRideResponse> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34533Mm4.m94861n(IT4.this.mo75053a0(this.f15614h, this.f15615i), this.f15616j).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "e", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$R0 */
    /* loaded from: classes4.dex */
    public static final class C3582R0 extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends T>> {

        /* renamed from: g */
        public static final C3582R0 f15617g = new C3582R0();

        public C3582R0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends T> invoke(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof TimeoutException) {
                return Observable.error(new AckLockTimeoutException());
            }
            return Observable.error(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$S */
    /* loaded from: classes4.dex */
    public static final class C3583S extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f15618g;

        /* renamed from: h */
        public final /* synthetic */ IT4 f15619h;

        /* renamed from: i */
        public final /* synthetic */ WireRide f15620i;

        /* renamed from: j */
        public final /* synthetic */ C50439vT3<WireBird> f15621j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3583S(boolean z, IT4 it4, WireRide wireRide, C50439vT3<WireBird> c50439vT3) {
            super(1);
            this.f15618g = z;
            this.f15619h = it4;
            this.f15620i = wireRide;
            this.f15621j = c50439vT3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WireBird> invoke(Vehicle vehicle) {
            Observable m102256g5;
            Intrinsics.checkNotNullParameter(vehicle, "vehicle");
            if (this.f15618g) {
                m102256g5 = this.f15619h.m102196u4(this.f15620i, Integer.valueOf(vehicle.getDistance()));
            } else {
                m102256g5 = this.f15619h.m102256g5(this.f15620i, Integer.valueOf(vehicle.getDistance()));
            }
            AbstractC23442F firstOrError = m102256g5.firstOrError();
            Intrinsics.checkNotNullExpressionValue(firstOrError, "if (lock) {\n          lo…          .firstOrError()");
            return C34533Mm4.m94861n(firstOrError, this.f15621j).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$S0 */
    /* loaded from: classes4.dex */
    public static final class C3584S0 extends Lambda implements Function1<T, T> {

        /* renamed from: g */
        public final /* synthetic */ T f15622g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3584S0(T t) {
            super(1);
            this.f15622g = t;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t) {
            return this.f15622g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$T */
    /* loaded from: classes4.dex */
    public static final class C3585T extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15623g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f15624h;

        /* renamed from: i */
        public final /* synthetic */ boolean f15625i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3585T(IT4 it4, WireRide wireRide, boolean z) {
            super(1);
            this.f15623g = it4;
            this.f15624h = wireRide;
            this.f15625i = z;
        }

        /* renamed from: a */
        public final InterfaceC23434B<? extends WireBird> m102123a(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f15623g.m102212r3(this.f15624h, this.f15625i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(WireBird wireBird) {
            return m102123a(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T", "", "it", "Lio/reactivex/u;", "", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$T0 */
    /* loaded from: classes4.dex */
    public static final class C3586T0 extends Lambda implements Function1<Long, InterfaceC24574u<? extends List<? extends WireRide>>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3586T0(IT4 it4) {
            super(1);
            this.f15626g = it4;
        }

        /* renamed from: a */
        public final InterfaceC24574u<? extends List<WireRide>> m102122a(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f15626g.mo75039i().m32065J();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC24574u<? extends List<? extends WireRide>> invoke(Long l) {
            return m102122a(l);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Lco/bird/android/model/wire/WireBird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$U */
    /* loaded from: classes4.dex */
    public static final class C3587U extends Lambda implements Function1<WireBird, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15627g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3587U(IT4 it4) {
            super(1);
            this.f15627g = it4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(WireBird wireBird) {
            return invoke2(wireBird);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(WireBird it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return Boolean.valueOf(WireBirdKt.canTreatAsBluetooth(it, C36441Uq4.m80769c(this.f15627g.f15527i, it)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "T", "rides", "", "Lco/bird/android/model/wire/WireRide;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$waitForNotificationAckLock$ackLockStatus$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n288#2,2:1627\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$waitForNotificationAckLock$ackLockStatus$2\n*L\n1140#1:1627,2\n*E\n"})
    /* renamed from: IT4$U0 */
    /* loaded from: classes4.dex */
    public static final class C3588U0 extends Lambda implements Function1<List<? extends WireRide>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f15628g;

        /* renamed from: h */
        public final /* synthetic */ boolean f15629h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3588U0(String str, boolean z) {
            super(1);
            this.f15628g = str;
            this.f15629h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends WireRide> list) {
            return invoke2((List<WireRide>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<WireRide> rides) {
            Object obj;
            WireBird bird;
            Intrinsics.checkNotNullParameter(rides, "rides");
            String str = this.f15628g;
            boolean z = this.f15629h;
            boolean z2 = false;
            C41318g46.m40163a("waitForNotificationAckLock get active rides received, checking for ride id: " + str + " with lock status " + z + " - " + rides, new Object[0]);
            String str2 = this.f15628g;
            Iterator<T> it = rides.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((WireRide) obj).getId(), str2)) {
                    break;
                }
            }
            WireRide wireRide = (WireRide) obj;
            if (wireRide != null && (bird = wireRide.getBird()) != null && bird.getAckLocked() == this.f15629h) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "Lio/reactivex/B;", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$V */
    /* loaded from: classes4.dex */
    public static final class C3589V extends Lambda implements Function1<WireBird, InterfaceC23434B<WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15630g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f15631h;

        /* renamed from: i */
        public final /* synthetic */ boolean f15632i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$V$a */
        /* loaded from: classes4.dex */
        public static final class C3590a extends Lambda implements Function1<WireBird, Unit> {

            /* renamed from: g */
            public final /* synthetic */ boolean f15633g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3590a(boolean z) {
                super(1);
                this.f15633g = z;
            }

            /* renamed from: a */
            public final void m102119a(WireBird wireBird) {
                boolean z = this.f15633g;
                C41318g46.m40163a("Received ack lock (value " + z + ") via notification, continuing...", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
                m102119a(wireBird);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3589V(IT4 it4, WireRide wireRide, boolean z) {
            super(1);
            this.f15630g = it4;
            this.f15631h = wireRide;
            this.f15632i = z;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final InterfaceC23434B<WireBird> m102120b(WireBird wireBird) {
            Observable m102223o5 = this.f15630g.m102223o5(this.f15631h.getId(), wireBird, this.f15632i);
            final C3590a c3590a = new C3590a(this.f15632i);
            Observable doOnNext = m102223o5.doOnNext(new InterfaceC23484g() { // from class: XT4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.C3589V.invoke$lambda$0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnNext, "locked: Boolean\n  ): Sin…ntinuing...\")\n          }");
            return doOnNext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<WireBird> invoke(WireBird wireBird) {
            return m102120b(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "Lco/bird/android/model/wire/WireRide;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$V0 */
    /* loaded from: classes4.dex */
    public static final class C3591V0 extends Lambda implements Function1<List<? extends WireRide>, T> {

        /* renamed from: g */
        public final /* synthetic */ T f15634g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3591V0(T t) {
            super(1);
            this.f15634g = t;
        }

        /* renamed from: a */
        public final T m102118a(List<WireRide> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f15634g;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(List<? extends WireRide> list) {
            return m102118a(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$W */
    /* loaded from: classes4.dex */
    public static final class C3592W extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends WireRide>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC23442F<WireRide> f15635g;

        /* renamed from: h */
        public final /* synthetic */ C50439vT3<WireRide> f15636h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3592W(AbstractC23442F<WireRide> abstractC23442F, C50439vT3<WireRide> c50439vT3) {
            super(1);
            this.f15635g = abstractC23442F;
            this.f15636h = c50439vT3;
        }

        /* renamed from: a */
        public final InterfaceC23434B<? extends WireRide> m102117a(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34533Mm4.m94861n(this.f15635g, this.f15636h).m33123k0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireRide> invoke(Vehicle vehicle) {
            return m102117a(vehicle);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/model/wire/WireBirdEvent;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBirdEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$W0 */
    /* loaded from: classes4.dex */
    public static final class C3593W0 extends Lambda implements Function1<WireBirdEvent, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f15637g;

        /* renamed from: h */
        public final /* synthetic */ boolean f15638h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3593W0(String str, boolean z) {
            super(1);
            this.f15637g = str;
            this.f15638h = z;
        }

        /* renamed from: a */
        public final Boolean m102116a(WireBirdEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f15637g;
            boolean z = this.f15638h;
            boolean z2 = false;
            C41318g46.m40163a("waitForNotificationAckLock push notification received, checking for ride id: " + str + " with lock status " + z + " - " + it, new Object[0]);
            if (Intrinsics.areEqual(it.getRideId(), this.f15637g) && it.getValue() == this.f15638h) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(WireBirdEvent wireBirdEvent) {
            return m102116a(wireBirdEvent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$X */
    /* loaded from: classes4.dex */
    public static final class C3594X extends Lambda implements Function1<WireRide, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15639g;

        /* renamed from: h */
        public final /* synthetic */ WireBird f15640h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3594X(IT4 it4, WireBird wireBird) {
            super(1);
            this.f15639g = it4;
            this.f15640h = wireBird;
        }

        /* renamed from: a */
        public final Boolean m102115a(WireRide wireRide) {
            return Boolean.valueOf(C36441Uq4.m80771a(this.f15639g.f15527i, this.f15640h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(WireRide wireRide) {
            return m102115a(wireRide);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lco/bird/android/model/wire/WireBirdEvent;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBirdEvent;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$X0 */
    /* loaded from: classes4.dex */
    public static final class C3595X0 extends Lambda implements Function1<WireBirdEvent, T> {

        /* renamed from: g */
        public final /* synthetic */ T f15641g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3595X0(T t) {
            super(1);
            this.f15641g = t;
        }

        /* renamed from: a */
        public final T m102114a(WireBirdEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f15641g;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(WireBirdEvent wireBirdEvent) {
            return m102114a(wireBirdEvent);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "ride", "Lio/reactivex/B;", "c", "(Lco/bird/android/model/wire/WireRide;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$Y */
    /* loaded from: classes4.dex */
    public static final class C3596Y extends Lambda implements Function1<WireRide, InterfaceC23434B<WireRide>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15642g;

        /* renamed from: h */
        public final /* synthetic */ WireBird f15643h;

        /* renamed from: i */
        public final /* synthetic */ Function0<Boolean> f15644i;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$Y$a */
        /* loaded from: classes4.dex */
        public static final class C3597a extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ IT4 f15645g;

            /* renamed from: h */
            public final /* synthetic */ WireRide f15646h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3597a(IT4 it4, WireRide wireRide) {
                super(1);
                this.f15645g = it4;
                this.f15646h = wireRide;
            }

            /* renamed from: a */
            public final InterfaceC23434B<? extends WireBird> m102108a(Vehicle it) {
                Intrinsics.checkNotNullParameter(it, "it");
                IT4 it4 = this.f15645g;
                WireRide ride = this.f15646h;
                Intrinsics.checkNotNullExpressionValue(ride, "ride");
                return it4.m102212r3(ride, false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(Vehicle vehicle) {
                return m102108a(vehicle);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireRide;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$Y$b */
        /* loaded from: classes4.dex */
        public static final class C3598b extends Lambda implements Function1<WireBird, WireRide> {

            /* renamed from: g */
            public final /* synthetic */ WireRide f15647g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3598b(WireRide wireRide) {
                super(1);
                this.f15647g = wireRide;
            }

            /* renamed from: a */
            public final WireRide m102107a(WireBird it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f15647g;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ WireRide invoke(WireBird wireBird) {
                return m102107a(wireBird);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3596Y(IT4 it4, WireBird wireBird, Function0<Boolean> function0) {
            super(1);
            this.f15642g = it4;
            this.f15643h = wireBird;
            this.f15644i = function0;
        }

        /* renamed from: d */
        public static final InterfaceC23434B m102110d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final WireRide m102109e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireRide) tmp0.invoke(obj);
        }

        /* renamed from: c */
        public final InterfaceC23434B<WireRide> m102111c(WireRide ride) {
            IT4 it4 = this.f15642g;
            WireBird wireBird = this.f15643h;
            Function0<Boolean> function0 = this.f15644i;
            Intrinsics.checkNotNullExpressionValue(ride, "ride");
            Observable m102224o4 = it4.m102224o4(wireBird, false, function0, ride);
            final C3597a c3597a = new C3597a(this.f15642g, ride);
            Observable flatMap = m102224o4.flatMap(new InterfaceC23492o() { // from class: YT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m102110d;
                    m102110d = IT4.C3596Y.m102110d(Function1.this, obj);
                    return m102110d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMap, "private fun getStartRide…      .firstOrError()\n  }");
            Observable m102176y4 = it4.m102176y4(flatMap, ride, this.f15643h, true);
            final C3598b c3598b = new C3598b(ride);
            Observable map = m102176y4.map(new InterfaceC23492o() { // from class: ZT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireRide m102109e;
                    m102109e = IT4.C3596Y.m102109e(Function1.this, obj);
                    return m102109e;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "private fun getStartRide…      .firstOrError()\n  }");
            return map;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<WireRide> invoke(WireRide wireRide) {
            return m102111c(wireRide);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "ride", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireRide;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$Z */
    /* loaded from: classes4.dex */
    public static final class C3599Z extends Lambda implements Function1<WireRide, InterfaceC23434B<? extends WireRide>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15648g;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$Z$a */
        /* loaded from: classes4.dex */
        public static final class C3600a extends Lambda implements Function1<WireRide, Unit> {

            /* renamed from: g */
            public static final C3600a f15649g = new C3600a();

            static {
            }

            public C3600a() {
                super(1);
            }

            /* renamed from: a */
            public final void m102104a(WireRide wireRide) {
                C41318g46.m40163a("Received ack lock via notification, continuing...", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
                m102104a(wireRide);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3599Z(IT4 it4) {
            super(1);
            this.f15648g = it4;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final InterfaceC23434B<? extends WireRide> m102105b(WireRide ride) {
            Intrinsics.checkNotNullParameter(ride, "ride");
            Observable m102223o5 = this.f15648g.m102223o5(ride.getId(), ride, false);
            final C3600a c3600a = C3600a.f15649g;
            return m102223o5.doOnNext(new InterfaceC23484g() { // from class: aU4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.C3599Z.invoke$lambda$0(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireRide> invoke(WireRide wireRide) {
            return m102105b(wireRide);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$a */
    /* loaded from: classes4.dex */
    public static final class C3601a extends Lambda implements Function1<Pair<? extends WireBird, ? extends Config>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15650g;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "ridesState", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideStates;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$10$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n1549#2:1627\n1620#2,3:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$10$1\n*L\n305#1:1627\n305#1:1628,3\n*E\n"})
        /* renamed from: IT4$a$a */
        /* loaded from: classes4.dex */
        public static final class C3602a extends Lambda implements Function1<RideStates, RideStates> {

            /* renamed from: g */
            public final /* synthetic */ Ref.IntRef f15651g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f15652h;

            /* renamed from: i */
            public final /* synthetic */ Config f15653i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3602a(Ref.IntRef intRef, WireBird wireBird, Config config) {
                super(1);
                this.f15651g = intRef;
                this.f15652h = wireBird;
                this.f15653i = config;
            }

            /* renamed from: a */
            public final RideStates m102103a(RideStates ridesState) {
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(ridesState, "ridesState");
                List<RideState> rideStates = ridesState.getRideStates();
                Ref.IntRef intRef = this.f15651g;
                WireBird wireBird = this.f15652h;
                Config config = this.f15653i;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(rideStates, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (RideState rideState : rideStates) {
                    boolean z = true;
                    if (RideStateKt.isInRide(rideState)) {
                        intRef.element++;
                    }
                    WireBird bird = rideState.getRide().getBird();
                    if ((bird == null || !bird.isProbablySame(wireBird)) ? false : false) {
                        Intrinsics.checkNotNullExpressionValue(config, "config");
                        rideState = RideState.copy$default(rideState, null, null, config, null, 11, null);
                    }
                    arrayList.add(rideState);
                }
                return ridesState.copy(arrayList);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ RideStates invoke(RideStates rideStates) {
                return m102103a(rideStates);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3601a(IT4 it4) {
            super(1);
            this.f15650g = it4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireBird, ? extends Config> pair) {
            invoke2((Pair<WireBird, Config>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireBird, Config> pair) {
            Ref.IntRef intRef = new Ref.IntRef();
            this.f15650g.f15543y.m71837i(new C3602a(intRef, pair.component1(), pair.component2()));
            this.f15650g.f15518G.accept(Integer.valueOf(intRef.element));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$a0 */
    /* loaded from: classes4.dex */
    public static final class C3603a0 extends Lambda implements Function1<WireRide, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f15654g;

        /* renamed from: h */
        public final /* synthetic */ IT4 f15655h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3603a0(WireBird wireBird, IT4 it4) {
            super(1);
            this.f15654g = wireBird;
            this.f15655h = it4;
        }

        /* renamed from: a */
        public final void m102102a(WireRide wireRide) {
            if (WireBirdKt.shouldConnectViaBTInRide(this.f15654g, C36441Uq4.m80769c(this.f15655h.f15527i, this.f15654g))) {
                this.f15655h.f15525g.mo19551g(this.f15654g, true);
                C41318g46.m40163a("Starting to track vehicle.", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m102102a(wireRide);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C3604b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3604b f15656b = new C3604b();

        static {
        }

        public C3604b() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$b0 */
    /* loaded from: classes4.dex */
    public static final class C3605b0 extends Lambda implements Function1<WireRide, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f15657g;

        /* renamed from: h */
        public final /* synthetic */ IT4 f15658h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3605b0(WireBird wireBird, IT4 it4) {
            super(1);
            this.f15657g = wireBird;
            this.f15658h = it4;
        }

        /* renamed from: a */
        public final void m102101a(WireRide wireRide) {
            if (WireBirdKt.shouldConnectViaBTInRide(this.f15657g, C36441Uq4.m80769c(this.f15658h.f15527i, this.f15657g))) {
                this.f15658h.f15525g.mo19551g(this.f15657g, true);
                C41318g46.m40163a("Starting to track scan-only vehicle.", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m102101a(wireRide);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u00012<\u0010\u0005\u001a8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lco/bird/android/model/RideStartTimeConstraint;", C17296a.f69688o, "(Lkotlin/Triple;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$c */
    /* loaded from: classes4.dex */
    public static final class C3606c extends Lambda implements Function1<Triple<? extends Optional<RideState>, ? extends Integer, ? extends Integer>, Optional<RideStartTimeConstraint>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15659g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3606c(IT4 it4) {
            super(1);
            this.f15659g = it4;
        }

        /* renamed from: a */
        public final Optional<RideStartTimeConstraint> m102100a(Triple<Optional<RideState>, Integer, Integer> triple) {
            BadAreaType badAreaType;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Integer maxRideDurationNoRideZone = triple.component2();
            Integer maxRideDurationOutsideOperatingArea = triple.component3();
            RideState m59035e = triple.component1().m59035e();
            if (m59035e == null) {
                return Optional.f63040c.m59034a();
            }
            if ((m59035e.getRide().getStartedInNoRideZone() || m59035e.getRide().getStartedOutsideOperatingArea()) && m59035e.getStatus() != RideState.Status.ENDED && m59035e.getRide().isBadAreaRideEnabled()) {
                IT4 it4 = this.f15659g;
                Intrinsics.checkNotNullExpressionValue(maxRideDurationNoRideZone, "maxRideDurationNoRideZone");
                int intValue = maxRideDurationNoRideZone.intValue();
                Intrinsics.checkNotNullExpressionValue(maxRideDurationOutsideOperatingArea, "maxRideDurationOutsideOperatingArea");
                DateTime m102365F3 = it4.m102365F3(m59035e, intValue, maxRideDurationOutsideOperatingArea.intValue());
                if (m59035e.getRide().getStartedOutsideOperatingArea()) {
                    badAreaType = BadAreaType.OUTSIDE_OPERATING_AREA;
                } else if (m59035e.getRide().getStartedInNoRideZone()) {
                    badAreaType = BadAreaType.IN_NO_RIDE_AREA;
                } else {
                    badAreaType = null;
                }
                if (m102365F3 != null && badAreaType != null && DateTime.now().compareTo((ReadableInstant) m102365F3) < 0) {
                    return Optional.f63040c.m59032c(new RideStartTimeConstraint(m102365F3, badAreaType));
                }
                return Optional.f63040c.m59034a();
            }
            return Optional.f63040c.m59034a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Optional<RideStartTimeConstraint> invoke(Triple<? extends Optional<RideState>, ? extends Integer, ? extends Integer> triple) {
            return m102100a(triple);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideStartTimeConstraint;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$c0 */
    /* loaded from: classes4.dex */
    public static final class C3607c0 extends Lambda implements Function0<Z84<Optional<RideStartTimeConstraint>>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15660g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3607c0(IT4 it4) {
            super(0);
            this.f15660g = it4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<RideStartTimeConstraint>> invoke() {
            return Z84.f47888d.m73663b(this.f15660g.f15512A);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Z84<Optional<RideStartTimeConstraint>> invoke() {
            return invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideStartTimeConstraint;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$d */
    /* loaded from: classes4.dex */
    public static final class C3608d extends Lambda implements Function1<Optional<RideStartTimeConstraint>, InterfaceC23434B<? extends Long>> {

        /* renamed from: g */
        public static final C3608d f15661g = new C3608d();

        static {
        }

        public C3608d() {
            super(1);
        }

        /* renamed from: a */
        public final InterfaceC23434B<? extends Long> m102099a(Optional<RideStartTimeConstraint> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m59037c()) {
                return Observable.timer(it.m59038b().secondsRemaining(), TimeUnit.SECONDS);
            }
            return Observable.empty();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Long> invoke(Optional<RideStartTimeConstraint> optional) {
            return m102099a(optional);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$d0 */
    /* loaded from: classes4.dex */
    public static final class C3609d0 extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f15662g;

        /* renamed from: h */
        public final /* synthetic */ IT4 f15663h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3609d0(WireRide wireRide, IT4 it4) {
            super(1);
            this.f15662g = wireRide;
            this.f15663h = it4;
        }

        /* renamed from: a */
        public final void m102098a(Vehicle vehicle) {
            String id = this.f15662g.getId();
            C41318g46.m40163a("btunlock: bt unlock operation complete for " + id, new Object[0]);
            this.f15663h.f15542x.accept(this.f15662g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m102098a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Long;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$e */
    /* loaded from: classes4.dex */
    public static final class C3610e extends Lambda implements Function1<Long, InterfaceC24574u<? extends List<? extends WireRide>>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15664g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3610e(IT4 it4) {
            super(1);
            this.f15664g = it4;
        }

        /* renamed from: c */
        public static final void m102095c(IT4 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f15513B.accept(Boolean.TRUE);
        }

        /* renamed from: b */
        public final InterfaceC24574u<? extends List<WireRide>> m102096b(Long it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC24507p<List<WireRide>> mo75039i = this.f15664g.mo75039i();
            final IT4 it4 = this.f15664g;
            return mo75039i.m32031n(new InterfaceC23478a() { // from class: JT4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    IT4.C3610e.m102095c(IT4.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC24574u<? extends List<? extends WireRide>> invoke(Long l) {
            return m102096b(l);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$e0 */
    /* loaded from: classes4.dex */
    public static final class C3611e0 extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15665g;

        /* renamed from: h */
        public final /* synthetic */ WireBird f15666h;

        /* renamed from: i */
        public final /* synthetic */ boolean f15667i;

        /* renamed from: j */
        public final /* synthetic */ RideUpdateState f15668j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3611e0(IT4 it4, WireBird wireBird, boolean z, RideUpdateState rideUpdateState) {
            super(1);
            this.f15665g = it4;
            this.f15666h = wireBird;
            this.f15667i = z;
            this.f15668j = rideUpdateState;
        }

        /* renamed from: a */
        public final void m102094a(Vehicle vehicle) {
            String str;
            Boolean bool;
            WireRide ride;
            WireRide ride2;
            RideState mo75044g0 = this.f15665g.mo75044g0(this.f15666h);
            InterfaceC1880Ea interfaceC1880Ea = this.f15665g.f15530l;
            String id = this.f15666h.getId();
            String model = this.f15666h.getModel();
            if (model == null) {
                model = "unknown";
            }
            String str2 = model;
            if (mo75044g0 != null && (ride2 = mo75044g0.getRide()) != null) {
                str = ride2.getId();
            } else {
                str = null;
            }
            if (mo75044g0 != null && (ride = mo75044g0.getRide()) != null) {
                bool = Boolean.valueOf(ride.isPrimaryRide());
            } else {
                bool = null;
            }
            interfaceC1880Ea.mo55905y(new C1035CX(null, null, null, id, str2, str, bool, this.f15667i, this.f15668j.toPhaseString(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m102094a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "it", "Lco/bird/android/model/RideState$Status;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/RideState$Status;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$f */
    /* loaded from: classes4.dex */
    public static final class C3612f extends Lambda implements Function1<Optional<RideState>, RideState.Status> {

        /* renamed from: g */
        public static final C3612f f15669g = new C3612f();

        static {
        }

        public C3612f() {
            super(1);
        }

        /* renamed from: a */
        public final RideState.Status m102093a(Optional<RideState> it) {
            RideState.Status status;
            Intrinsics.checkNotNullParameter(it, "it");
            RideState m59035e = it.m59035e();
            if (m59035e == null || (status = m59035e.getStatus()) == null) {
                return RideState.Status.ENDED;
            }
            return status;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ RideState.Status invoke(Optional<RideState> optional) {
            return m102093a(optional);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$f0 */
    /* loaded from: classes4.dex */
    public static final class C3613f0 extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Ref.BooleanRef f15670g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3613f0(Ref.BooleanRef booleanRef) {
            super(0);
            this.f15670g = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return invoke();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f15670g.element);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/RideState$Status;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideState$Status;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$g */
    /* loaded from: classes4.dex */
    public static final class C3614g extends Lambda implements Function1<RideState.Status, Boolean> {

        /* renamed from: g */
        public static final C3614g f15671g = new C3614g();

        static {
        }

        public C3614g() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m102092a(RideState.Status it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == RideState.Status.ENDED) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(RideState.Status status) {
            return m102092a(status);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$g0 */
    /* loaded from: classes4.dex */
    public static final class C3615g0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<InterfaceC23465c> f15672g;

        /* renamed from: h */
        public final /* synthetic */ Map<EnumC34767Nm4, AbstractC23442F<WireBird>> f15673h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3615g0(Ref.ObjectRef<InterfaceC23465c> objectRef, Map<EnumC34767Nm4, AbstractC23442F<WireBird>> map) {
            super(1);
            this.f15672g = objectRef;
            this.f15673h = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m102091a(InterfaceC23465c interfaceC23465c) {
            T t;
            AbstractC23461c m33159G;
            AbstractC23461c m33069Q;
            AbstractC23461c m33063X;
            Ref.ObjectRef<InterfaceC23465c> objectRef = this.f15672g;
            AbstractC23442F<WireBird> abstractC23442F = this.f15673h.get(EnumC34767Nm4.BLUETOOTH);
            if (abstractC23442F != null && (m33159G = abstractC23442F.m33159G()) != null && (m33069Q = m33159G.m33069Q()) != null && (m33063X = m33069Q.m33063X(C24542a.m31932c())) != null) {
                t = m33063X.subscribe();
            } else {
                t = 0;
            }
            objectRef.element = t;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m102091a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideState$Status;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideState$Status;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$h */
    /* loaded from: classes4.dex */
    public static final class C3616h extends Lambda implements Function1<RideState.Status, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15674g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3616h(IT4 it4) {
            super(1);
            this.f15674g = it4;
        }

        /* renamed from: a */
        public final InterfaceC23496h m102090a(RideState.Status it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f15674g.f15532n.mo27795f().m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(RideState.Status status) {
            return m102090a(status);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$h0 */
    /* loaded from: classes4.dex */
    public static final class C3617h0 extends Lambda implements Function1<WireBird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.BooleanRef f15675g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3617h0(Ref.BooleanRef booleanRef) {
            super(1);
            this.f15675g = booleanRef;
        }

        /* renamed from: a */
        public final void m102089a(WireBird wireBird) {
            this.f15675g.element = true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m102089a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/User;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$i */
    /* loaded from: classes4.dex */
    public static final class C3618i extends Lambda implements Function1<Pair<? extends User, ? extends Optional<RideState>>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15676g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3618i(IT4 it4) {
            super(1);
            this.f15676g = it4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends User, ? extends Optional<RideState>> pair) {
            return invoke2((Pair<User, Optional<RideState>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<User, Optional<RideState>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C36137Ti6.m83132a()) {
                return this.f15676g.f15532n.mo27763z().m33069Q().m33063X(C24542a.m31932c());
            }
            C41318g46.m40163a("App is not in foreground, canceling request to refresh coupon display views", new Object[0]);
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$i0 */
    /* loaded from: classes4.dex */
    public static final class C3619i0 extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C3619i0 f15677g = new C3619i0();

        static {
        }

        public C3619i0() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getRideConfig().getEnableLocationOptOut());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Config config) {
            return invoke2(config);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$j */
    /* loaded from: classes4.dex */
    public static final class C3620j extends Lambda implements Function1<User, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15678g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3620j(IT4 it4) {
            super(1);
            this.f15678g = it4;
        }

        /* renamed from: a */
        public final void m102088a(User user) {
            this.f15678g.m102364F4();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m102088a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$j0 */
    /* loaded from: classes4.dex */
    public static final class C3621j0 extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15679g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f15680h;

        /* renamed from: i */
        public final /* synthetic */ Integer f15681i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3621j0(IT4 it4, WireRide wireRide, Integer num) {
            super(1);
            this.f15679g = it4;
            this.f15680h = wireRide;
            this.f15681i = num;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends WireBird> invoke2(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f15679g.m102336M4(this.f15680h, true, this.f15681i, !it.booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(Boolean bool) {
            return invoke2(bool);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "error", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$k0 */
    /* loaded from: classes4.dex */
    public static final class C3623k0 extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15683g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f15684h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f15685i;

        /* renamed from: j */
        public final /* synthetic */ boolean f15686j;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$k0$a */
        /* loaded from: classes4.dex */
        public static final class C3624a extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f15687g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3624a(Throwable th) {
                super(1);
                this.f15687g = th;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23434B<? extends WireBird> invoke2(Throwable th) {
                Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
                return Observable.error(this.f15687g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(Throwable th) {
                return invoke2(th);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$k0$b */
        /* loaded from: classes4.dex */
        public static final class C3625b extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends WireBird>> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f15688g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3625b(Throwable th) {
                super(1);
                this.f15688g = th;
            }

            /* renamed from: a */
            public final InterfaceC23434B<? extends WireBird> m102083a(WireBird it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.error(this.f15688g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(WireBird wireBird) {
                return m102083a(wireBird);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3623k0(IT4 it4, WireRide wireRide, WireBird wireBird, boolean z) {
            super(1);
            this.f15683g = it4;
            this.f15684h = wireRide;
            this.f15685i = wireBird;
            this.f15686j = z;
        }

        /* renamed from: c */
        public static final InterfaceC23434B m102085c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final InterfaceC23434B m102084d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(Throwable th) {
            return invoke2(th);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends WireBird> invoke2(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (error instanceof BluetoothException) {
                Observable m33123k0 = this.f15683g.m102236l5(this.f15684h, this.f15685i, this.f15686j).m33123k0();
                final C3624a c3624a = new C3624a(error);
                Observable onErrorResumeNext = m33123k0.onErrorResumeNext(new InterfaceC23492o() { // from class: bU4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m102085c;
                        m102085c = IT4.C3623k0.m102085c(Function1.this, obj);
                        return m102085c;
                    }
                });
                final C3625b c3625b = new C3625b(error);
                return onErrorResumeNext.flatMap(new InterfaceC23492o() { // from class: cU4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m102084d;
                        m102084d = IT4.C3623k0.m102084d(Function1.this, obj);
                        return m102084d;
                    }
                });
            }
            return Observable.error(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "trackingAnyForRide", "Lio/reactivex/B;", "", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$l */
    /* loaded from: classes4.dex */
    public static final class C3626l extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends List<? extends WireRide>>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15689g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3626l(IT4 it4) {
            super(1);
            this.f15689g = it4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends List<? extends WireRide>> invoke(Boolean bool) {
            return invoke2(bool);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends List<WireRide>> invoke2(Boolean trackingAnyForRide) {
            Intrinsics.checkNotNullParameter(trackingAnyForRide, "trackingAnyForRide");
            C41318g46.m40163a("trackingAnyForRide - " + trackingAnyForRide, new Object[0]);
            if (trackingAnyForRide.booleanValue()) {
                return this.f15689g.f15519H;
            }
            return Observable.empty();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "item", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$l0 */
    /* loaded from: classes4.dex */
    public static final class C3627l0 extends Lambda implements Function1<T, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15690g;

        /* renamed from: h */
        public final /* synthetic */ WireBird f15691h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3627l0(IT4 it4, WireBird wireBird) {
            super(1);
            this.f15690g = it4;
            this.f15691h = wireBird;
        }

        /* renamed from: b */
        public final InterfaceC23447K<? extends T> m102082b(T t) {
            return this.f15690g.mo75023x(this.f15691h).m33069Q().m33042m(AbstractC23442F.m33158H(t));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m102082b(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000222\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/RideStates;", "", "Lk66;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n766#2:1627\n857#2,2:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$4\n*L\n266#1:1627\n266#1:1628,2\n*E\n"})
    /* renamed from: IT4$m */
    /* loaded from: classes4.dex */
    public static final class C3628m extends Lambda implements Function1<Pair<? extends RideStates, ? extends List<? extends C43710k66>>, List<? extends C43710k66>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15692g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3628m(IT4 it4) {
            super(1);
            this.f15692g = it4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends C43710k66> invoke(Pair<? extends RideStates, ? extends List<? extends C43710k66>> pair) {
            return invoke2((Pair<RideStates, ? extends List<C43710k66>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<C43710k66> invoke2(Pair<RideStates, ? extends List<C43710k66>> pair) {
            RideStates component1 = pair.component1();
            ArrayList arrayList = new ArrayList();
            for (Object obj : pair.component2()) {
                C43710k66 c43710k66 = (C43710k66) obj;
                boolean z = false;
                if (c43710k66.m29282f()) {
                    RideState rideForBird = component1.rideForBird(c43710k66.m29284d());
                    if (!(rideForBird != null && RideStateKt.isInRide(rideForBird))) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            if (component1.getActiveRideCount() == 0) {
                this.f15692g.f15524f.mo96351c();
                return null;
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "item", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Object;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$m0 */
    /* loaded from: classes4.dex */
    public static final class C3629m0 extends Lambda implements Function1<T, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15693g;

        /* renamed from: h */
        public final /* synthetic */ WireBird f15694h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3629m0(IT4 it4, WireBird wireBird) {
            super(1);
            this.f15693g = it4;
            this.f15694h = wireBird;
        }

        /* renamed from: b */
        public final InterfaceC23447K<? extends T> m102081b(T t) {
            return this.f15693g.mo75023x(this.f15694h).m33069Q().m33042m(AbstractC23442F.m33158H(t));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m102081b(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lk66;", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$n */
    /* loaded from: classes4.dex */
    public static final class C3630n extends Lambda implements Function1<List<? extends C43710k66>, Boolean> {

        /* renamed from: g */
        public static final C3630n f15695g = new C3630n();

        static {
        }

        public C3630n() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<C43710k66> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends C43710k66> list) {
            return invoke2((List<C43710k66>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$primaryRideState$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n288#2,2:1627\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$primaryRideState$2\n*L\n158#1:1627,2\n*E\n"})
    /* renamed from: IT4$n0 */
    /* loaded from: classes4.dex */
    public static final class C3631n0 extends Lambda implements Function0<Z84<Optional<RideState>>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15696g;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "states", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$primaryRideState$2$primaryRideObservable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n288#2,2:1627\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$primaryRideState$2$primaryRideObservable$1\n*L\n155#1:1627,2\n*E\n"})
        /* renamed from: IT4$n0$a */
        /* loaded from: classes4.dex */
        public static final class C3632a extends Lambda implements Function1<RideStates, Optional<RideState>> {

            /* renamed from: g */
            public static final C3632a f15697g = new C3632a();

            static {
            }

            public C3632a() {
                super(1);
            }

            /* renamed from: a */
            public final Optional<RideState> m102078a(RideStates states) {
                Object obj;
                Intrinsics.checkNotNullParameter(states, "states");
                Optional.C14443a c14443a = Optional.f63040c;
                Iterator<T> it = states.getRideStates().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (RideStatesKt.isPrimaryRide((RideState) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return c14443a.m59033b(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Optional<RideState> invoke(RideStates rideStates) {
                return m102078a(rideStates);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3631n0(IT4 it4) {
            super(0);
            this.f15696g = it4;
        }

        /* renamed from: b */
        public static final Optional m102079b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Z84<Optional<RideState>> invoke() {
            return invoke();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<RideState>> invoke() {
            Object obj;
            C37791a94 c37791a94 = this.f15696g.f15543y;
            final C3632a c3632a = C3632a.f15697g;
            Observable primaryRideObservable = c37791a94.map(new InterfaceC23492o() { // from class: dU4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    Optional m102079b;
                    m102079b = IT4.C3631n0.m102079b(Function1.this, obj2);
                    return m102079b;
                }
            }).distinctUntilChanged();
            Iterator<T> it = this.f15696g.mo75032o0().m73665a().getRideStates().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (RideStatesKt.isPrimaryRide((RideState) obj)) {
                    break;
                }
            }
            Z84.C10119a c10119a = Z84.f47888d;
            Intrinsics.checkNotNullExpressionValue(primaryRideObservable, "primaryRideObservable");
            return c10119a.m73662c(primaryRideObservable, Optional.f63040c.m59033b((RideState) obj));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lk66;", "kotlin.jvm.PlatformType", "trackingBirdsForRide", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n1855#2,2:1627\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$6\n*L\n280#1:1627,2\n*E\n"})
    /* renamed from: IT4$o */
    /* loaded from: classes4.dex */
    public static final class C3633o extends Lambda implements Function1<List<? extends C43710k66>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15698g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3633o(IT4 it4) {
            super(1);
            this.f15698g = it4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C43710k66> list) {
            invoke2((List<C43710k66>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C43710k66> trackingBirdsForRide) {
            Intrinsics.checkNotNullExpressionValue(trackingBirdsForRide, "trackingBirdsForRide");
            IT4 it4 = this.f15698g;
            for (C43710k66 c43710k66 : trackingBirdsForRide) {
                it4.f15524f.mo96352b(c43710k66.m29284d());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a<\u00128\u00126\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005 \u0006*\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lkotlin/Pair;", "", "Lco/bird/android/model/RideState$Status;", "Lco/bird/android/coreinterface/manager/RideActionRequest;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$o0 */
    /* loaded from: classes4.dex */
    public static final class C3634o0 extends Lambda implements Function0<Z84<Optional<Pair<? extends String, ? extends RideState.Status>>>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15699g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3634o0(IT4 it4) {
            super(0);
            this.f15699g = it4;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ Z84<Optional<Pair<? extends String, ? extends RideState.Status>>> invoke2() {
            return invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Pair<? extends String, ? extends RideState.Status>>> invoke() {
            return Z84.f47888d.m73663b(this.f15699g.f15514C);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$p */
    /* loaded from: classes4.dex */
    public static final class C3635p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3635p f15700g = new C3635p();

        static {
        }

        public C3635p() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$p0 */
    /* loaded from: classes4.dex */
    public static final class C3636p0 extends Lambda implements Function0<Z84<Config>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15701g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "states", "Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Lco/bird/android/model/wire/configs/Config;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$p0$a */
        /* loaded from: classes4.dex */
        public static final class C3637a extends Lambda implements Function1<RideStates, Config> {

            /* renamed from: g */
            public final /* synthetic */ IT4 f15702g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3637a(IT4 it4) {
                super(1);
                this.f15702g = it4;
            }

            /* renamed from: a */
            public final Config m102075a(RideStates states) {
                Config rideConfig;
                Intrinsics.checkNotNullParameter(states, "states");
                RideState primaryRideState = states.primaryRideState();
                if (primaryRideState == null || (rideConfig = primaryRideState.getRideConfig()) == null) {
                    return this.f15702g.f15527i.m82623f8().m73665a();
                }
                return rideConfig;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Config invoke(RideStates rideStates) {
                return m102075a(rideStates);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3636p0(IT4 it4) {
            super(0);
            this.f15701g = it4;
        }

        /* renamed from: b */
        public static final Config m102076b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Config) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Z84<Config> invoke() {
            return invoke();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Config> invoke() {
            C37791a94 c37791a94 = this.f15701g.f15543y;
            final C3637a c3637a = new C3637a(this.f15701g);
            Observable rideConfigObservable = c37791a94.map(new InterfaceC23492o() { // from class: eU4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Config m102076b;
                    m102076b = IT4.C3636p0.m102076b(Function1.this, obj);
                    return m102076b;
                }
            }).distinctUntilChanged();
            Z84.C10119a c10119a = Z84.f47888d;
            Intrinsics.checkNotNullExpressionValue(rideConfigObservable, "rideConfigObservable");
            return c10119a.m73662c(rideConfigObservable, this.f15701g.f15527i.m82623f8().m73665a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "it", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n1603#2,9:1627\n1855#2:1636\n1856#2:1638\n1612#2:1639\n1#3:1637\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$8\n*L\n289#1:1627,9\n289#1:1636\n289#1:1638\n289#1:1639\n289#1:1637\n*E\n"})
    /* renamed from: IT4$q */
    /* loaded from: classes4.dex */
    public static final class C3638q extends Lambda implements Function1<RideStates, List<? extends WireBird>> {

        /* renamed from: g */
        public static final C3638q f15703g = new C3638q();

        static {
        }

        public C3638q() {
            super(1);
        }

        /* renamed from: a */
        public final List<WireBird> m102074a(RideStates it) {
            List<WireBird> list;
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList();
            for (RideState rideState : it.getRideStates()) {
                WireBird bird = rideState.getRide().getBird();
                if (bird != null) {
                    arrayList.add(bird);
                }
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList);
            return list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends WireBird> invoke(RideStates rideStates) {
            return m102074a(rideStates);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/RideStateEvent;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$q0 */
    /* loaded from: classes4.dex */
    public static final class C3639q0 extends Lambda implements Function0<Observable<RideStateEvent>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15704g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3639q0(IT4 it4) {
            super(0);
            this.f15704g = it4;
        }

        /* renamed from: b */
        public final Observable<RideStateEvent> m102073b() {
            return this.f15704g.f15544z.hide();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Observable<RideStateEvent> invoke() {
            return m102073b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n1549#2:1627\n1620#2,3:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$9\n*L\n293#1:1627\n293#1:1628,3\n*E\n"})
    /* renamed from: IT4$r */
    /* loaded from: classes4.dex */
    public static final class C3640r extends Lambda implements Function1<List<? extends WireBird>, InterfaceC23434B<? extends Pair<? extends WireBird, ? extends Config>>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15705g;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/wire/configs/Config;", "kotlin.jvm.PlatformType", "config", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IT4$r$a */
        /* loaded from: classes4.dex */
        public static final class C3641a extends Lambda implements Function1<Config, Pair<? extends WireBird, ? extends Config>> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f15706g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3641a(WireBird wireBird) {
                super(1);
                this.f15706g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pair<? extends WireBird, ? extends Config> invoke(Config config) {
                return invoke2(config);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Pair<WireBird, Config> invoke2(Config config) {
                Intrinsics.checkNotNullParameter(config, "config");
                return TuplesKt.m28425to(this.f15706g, config);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3640r(IT4 it4) {
            super(1);
            this.f15705g = it4;
        }

        /* renamed from: c */
        public static final Pair m102070c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<WireBird, Config>> m102071b(List<WireBird> birds) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(birds, "birds");
            List<WireBird> list = birds;
            IT4 it4 = this.f15705g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireBird wireBird : list) {
                Observable<Config> m80768d = C36441Uq4.m80768d(it4.f15527i, wireBird);
                final C3641a c3641a = new C3641a(wireBird);
                arrayList.add(m80768d.map(new InterfaceC23492o() { // from class: KT4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m102070c;
                        m102070c = IT4.C3640r.m102070c(Function1.this, obj);
                        return m102070c;
                    }
                }));
            }
            return C24522d.m31958a(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Pair<? extends WireBird, ? extends Config>> invoke(List<? extends WireBird> list) {
            return m102071b(list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "Lco/bird/android/model/RideStates;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$r0 */
    /* loaded from: classes4.dex */
    public static final class C3642r0 extends Lambda implements Function0<Z84<RideStates>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3642r0(IT4 it4) {
            super(0);
            this.f15707g = it4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<RideStates> invoke() {
            return Z84.f47888d.m73663b(this.f15707g.f15543y);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Z84<RideStates> invoke() {
            return invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LIT4$s;", "", "", "UNLOCK_CABLE_TIMEOUT_SECONDS", "J", "<init>", "()V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IT4$s */
    /* loaded from: classes4.dex */
    public static final class C3643s {
        public /* synthetic */ C3643s(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3643s() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "status", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$rideStatusChanged$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n1#2:1627\n*E\n"})
    /* renamed from: IT4$s0 */
    /* loaded from: classes4.dex */
    public static final class C3644s0 extends Lambda implements Function1<Optional<RideState>, String> {

        /* renamed from: g */
        public static final C3644s0 f15708g = new C3644s0();

        static {
        }

        public C3644s0() {
            super(1);
        }

        /* renamed from: a */
        public final String m102069a(Optional<RideState> status) {
            WireRide ride;
            String id;
            Intrinsics.checkNotNullParameter(status, "status");
            RideState m59035e = status.m59035e();
            if (m59035e == null || (ride = m59035e.getRide()) == null || (id = ride.getId()) == null || !C42149hU4.m36358a(status)) {
                return null;
            }
            return id;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Optional<RideState> optional) {
            return m102069a(optional);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$t */
    /* loaded from: classes4.dex */
    public static final class C3645t extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15709g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f15710h;

        /* renamed from: i */
        public final /* synthetic */ boolean f15711i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: IT4$t$a */
        /* loaded from: classes4.dex */
        public static final class C3646a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IT4 f15712g;

            /* renamed from: h */
            public final /* synthetic */ WireRide f15713h;

            /* renamed from: i */
            public final /* synthetic */ boolean f15714i;

            /* renamed from: j */
            public final /* synthetic */ WireBird f15715j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3646a(IT4 it4, WireRide wireRide, boolean z, WireBird wireBird) {
                super(1);
                this.f15712g = it4;
                this.f15713h = wireRide;
                this.f15714i = z;
                this.f15715j = wireBird;
            }

            /* renamed from: a */
            public final void m102066a(InterfaceC23465c interfaceC23465c) {
                this.f15712g.m102360G4(this.f15713h.getId(), this.f15714i ? RideState.Status.LOCKED : RideState.Status.UNLOCKED, this.f15715j);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m102066a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3645t(IT4 it4, WireRide wireRide, boolean z) {
            super(1);
            this.f15709g = it4;
            this.f15710h = wireRide;
            this.f15711i = z;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final InterfaceC23434B<? extends WireBird> m102067b(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            if (!WireBirdKt.canTreatAsBluetooth(bird, C36441Uq4.m80769c(this.f15709g.f15527i, bird))) {
                return this.f15709g.m102223o5(this.f15710h.getId(), bird, this.f15711i);
            }
            Observable just = Observable.just(bird);
            final C3646a c3646a = new C3646a(this.f15709g, this.f15710h, this.f15711i, bird);
            return just.doOnSubscribe(new InterfaceC23484g() { // from class: LT4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.C3645t.invoke$lambda$0(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(WireBird wireBird) {
            return m102067b(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Lco/bird/android/model/wire/WireBird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$t0 */
    /* loaded from: classes4.dex */
    public static final class C3647t0 extends Lambda implements Function1<WireBird, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15716g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3647t0(IT4 it4) {
            super(1);
            this.f15716g = it4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(WireBird wireBird) {
            return invoke2(wireBird);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!WireBirdKt.canTreatAsBluetooth(it, C36441Uq4.m80769c(this.f15716g.f15527i, it)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$u */
    /* loaded from: classes4.dex */
    public static final class C3648u extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15717g;

        /* renamed from: h */
        public final /* synthetic */ String f15718h;

        /* renamed from: i */
        public final /* synthetic */ RideState.Status f15719i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3648u(IT4 it4, String str, RideState.Status status) {
            super(1);
            this.f15717g = it4;
            this.f15718h = str;
            this.f15719i = status;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C3648u) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            this.f15717g.m102360G4(this.f15718h, this.f15719i, t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/B;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$u0 */
    /* loaded from: classes4.dex */
    public static final class C3649u0 extends Lambda implements Function1<WireBird, InterfaceC23434B<WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15720g;

        /* renamed from: h */
        public final /* synthetic */ WireRide f15721h;

        /* renamed from: i */
        public final /* synthetic */ boolean f15722i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3649u0(IT4 it4, WireRide wireRide, boolean z) {
            super(1);
            this.f15720g = it4;
            this.f15721h = wireRide;
            this.f15722i = z;
        }

        /* renamed from: a */
        public final InterfaceC23434B<WireBird> m102065a(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return this.f15720g.m102223o5(this.f15721h.getId(), bird, this.f15722i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<WireBird> invoke(WireBird wireBird) {
            return m102065a(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$v */
    /* loaded from: classes4.dex */
    public static final class C3650v extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15723g;

        /* renamed from: h */
        public final /* synthetic */ String f15724h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3650v(IT4 it4, String str) {
            super(1);
            this.f15723g = it4;
            this.f15724h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            IT4.m102356H4(this.f15723g, this.f15724h, null, null, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "states", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideStates;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$setRideState$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1626:1\n1549#2:1627\n1620#2,3:1628\n1#3:1631\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$setRideState$1\n*L\n1394#1:1627\n1394#1:1628,3\n*E\n"})
    /* renamed from: IT4$v0 */
    /* loaded from: classes4.dex */
    public static final class C3651v0 extends Lambda implements Function1<RideStates, RideStates> {

        /* renamed from: g */
        public final /* synthetic */ RideState f15725g;

        /* renamed from: h */
        public final /* synthetic */ Ref.BooleanRef f15726h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3651v0(RideState rideState, Ref.BooleanRef booleanRef) {
            super(1);
            this.f15725g = rideState;
            this.f15726h = booleanRef;
        }

        /* renamed from: a */
        public final RideStates m102064a(RideStates states) {
            int collectionSizeOrDefault;
            List<RideState> list;
            Intrinsics.checkNotNullParameter(states, "states");
            List<RideState> rideStates = states.getRideStates();
            RideState rideState = this.f15725g;
            Ref.BooleanRef booleanRef = this.f15726h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(rideStates, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (RideState rideState2 : rideStates) {
                if (Intrinsics.areEqual(rideState2.getRide().getId(), rideState.getRide().getId())) {
                    booleanRef.element = true;
                    rideState2 = rideState;
                }
                arrayList.add(rideState2);
            }
            if (this.f15726h.element) {
                list = arrayList;
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt___CollectionsKt.plus((Collection<? extends RideState>) ((Collection<? extends Object>) arrayList), this.f15725g);
            }
            return states.copy(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ RideStates invoke(RideStates rideStates) {
            return m102064a(rideStates);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$w */
    /* loaded from: classes4.dex */
    public static final class C3652w extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15727g;

        /* renamed from: h */
        public final /* synthetic */ String f15728h;

        /* renamed from: i */
        public final /* synthetic */ RideState.Status f15729i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3652w(IT4 it4, String str, RideState.Status status) {
            super(1);
            this.f15727g = it4;
            this.f15728h = str;
            this.f15729i = status;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C3652w) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            this.f15727g.m102360G4(this.f15728h, this.f15729i, t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "newBird", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$w0 */
    /* loaded from: classes4.dex */
    public static final class C3653w0 extends Lambda implements Function1<WireBird, WireBird> {

        /* renamed from: g */
        public final /* synthetic */ WireRide f15730g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3653w0(WireRide wireRide) {
            super(1);
            this.f15730g = wireRide;
        }

        /* renamed from: a */
        public final WireBird m102063a(WireBird newBird) {
            WireBird m41294b;
            Intrinsics.checkNotNullParameter(newBird, "newBird");
            WireBird bird = this.f15730g.getBird();
            if (bird != null && (m41294b = C40963fU4.m41294b(bird, newBird)) != null) {
                return m41294b;
            }
            return newBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ WireBird invoke(WireBird wireBird) {
            return m102063a(wireBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$x */
    /* loaded from: classes4.dex */
    public static final class C3654x extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15731g;

        /* renamed from: h */
        public final /* synthetic */ String f15732h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3654x(IT4 it4, String str) {
            super(1);
            this.f15731g = it4;
            this.f15732h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            IT4.m102356H4(this.f15731g, this.f15732h, null, null, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IT4$x0 */
    /* loaded from: classes4.dex */
    public static final class C3655x0 extends Lambda implements Function1<List<? extends WireRide>, Unit> {

        /* renamed from: g */
        public static final C3655x0 f15733g = new C3655x0();

        static {
        }

        public C3655x0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireRide> list) {
            invoke2((List<WireRide>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireRide> list) {
            C41318g46.m40163a("received these rides in getActiveRides: " + list, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IT4$y */
    /* loaded from: classes4.dex */
    public static final class C3656y extends Lambda implements Function0<Z84<Boolean>> {

        /* renamed from: g */
        public final /* synthetic */ IT4 f15734g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3656y(IT4 it4) {
            super(0);
            this.f15734g = it4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Boolean> invoke() {
            return Z84.f47888d.m73663b(this.f15734g.f15513B);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Z84<Boolean> invoke() {
            return invoke();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: IT4$y0 */
    /* loaded from: classes4.dex */
    public static final class C3657y0<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C3657y0<T1, T2, R> f15735a = new C3657y0<>();

        static {
        }

        public C3657y0() {
        }

        /* renamed from: a */
        public final Pair<T1, T2> m102062a(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23480c
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return m102062a(obj, obj2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/model/RideStates;", "rideStates", C17296a.f69688o, "(Lco/bird/android/model/RideStates;)Lco/bird/android/model/RideStates;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$clearEndedRides$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n766#2:1627\n857#2,2:1628\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$clearEndedRides$2\n*L\n793#1:1627\n793#1:1628,2\n*E\n"})
    /* renamed from: IT4$z */
    /* loaded from: classes4.dex */
    public static final class C3658z extends Lambda implements Function1<RideStates, RideStates> {

        /* renamed from: g */
        public static final C3658z f15736g = new C3658z();

        static {
        }

        public C3658z() {
            super(1);
        }

        /* renamed from: a */
        public final RideStates m102061a(RideStates rideStates) {
            Intrinsics.checkNotNullParameter(rideStates, "rideStates");
            List<RideState> arrayList = new ArrayList<>();
            for (Object obj : rideStates.getRideStates()) {
                if (RideStateKt.isInRide((RideState) obj)) {
                    arrayList.add(obj);
                }
            }
            return rideStates.copy(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ RideStates invoke(RideStates rideStates) {
            return m102061a(rideStates);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: IT4$z0 */
    /* loaded from: classes4.dex */
    public static final class C3659z0<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C3659z0<T1, T2, R> f15737a = new C3659z0<>();

        static {
        }

        public C3659z0() {
        }

        /* renamed from: a */
        public final Pair<T1, T2> m102060a(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23480c
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return m102060a(obj, obj2);
        }
    }

    static {
    }

    public IT4(Context context, NP4 rideClient, XW2 multiRideClient, InterfaceC40476ef6 uploadManager, InterfaceC34076Kn6 vehicleTrackerManager, InterfaceC27246pJ bluetoothManager, InterfaceC46820pM3 paymentIntentManager, C36207Tq4 reactiveConfig, C36519Uz1 frequentFlyerManager, InterfaceC46893pU4 rideMapStateManager, InterfaceC1880Ea analyticsManager, InterfaceC36185To0 commandManager, V74 promoManager, InterfaceC32604Eg1 eventBus, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rideClient, "rideClient");
        Intrinsics.checkNotNullParameter(multiRideClient, "multiRideClient");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(vehicleTrackerManager, "vehicleTrackerManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(paymentIntentManager, "paymentIntentManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(frequentFlyerManager, "frequentFlyerManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(commandManager, "commandManager");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f15520b = context;
        this.f15521c = rideClient;
        this.f15522d = multiRideClient;
        this.f15523e = uploadManager;
        this.f15524f = vehicleTrackerManager;
        this.f15525g = bluetoothManager;
        this.f15526h = paymentIntentManager;
        this.f15527i = reactiveConfig;
        this.f15528j = frequentFlyerManager;
        this.f15529k = rideMapStateManager;
        this.f15530l = analyticsManager;
        this.f15531m = commandManager;
        this.f15532n = promoManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C3631n0(this));
        this.f15533o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C3642r0(this));
        this.f15534p = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C3636p0(this));
        this.f15535q = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C3567M());
        this.f15536r = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C3607c0(this));
        this.f15537s = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new C3656y(this));
        this.f15538t = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new C3634o0(this));
        this.f15539u = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new C3639q0(this));
        this.f15540v = lazy8;
        this.f15541w = new LinkedHashMap();
        C45168ma4<WireRide> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireRide>()");
        this.f15542x = m25409g;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        C37791a94<RideStates> create$default = C37791a94.C10586a.create$default(c10586a, new RideStates(null, 1, null), null, 2, null);
        this.f15543y = create$default;
        C45168ma4<RideStateEvent> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<RideStateEvent>()");
        this.f15544z = m25409g2;
        Optional.C14443a c14443a = Optional.f63040c;
        C37791a94<Optional<RideStartTimeConstraint>> create$default2 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f15512A = create$default2;
        this.f15513B = C37791a94.C10586a.create$default(c10586a, Boolean.FALSE, null, 2, null);
        this.f15514C = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f15515D = new AtomicReference<>(null);
        C0058AG<Unit> m115950h = C0058AG.m115950h(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Unit)");
        this.f15517F = m115950h;
        C45168ma4<Integer> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create()");
        this.f15518G = m25409g3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f15519H = Observable.merge(Observable.interval(0L, 30L, timeUnit), m115950h).toFlowable(EnumC23460b.LATEST).m32154d0(new InterfaceC23492o() { // from class: iS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m102320Q4;
                m102320Q4 = IT4.m102320Q4(IT4.this, obj);
                return m102320Q4;
            }
        }).m32163Y0(C24542a.m31932c()).m32113r1().share();
        C24560e<WireBirdEvent> m31895e = C24560e.m31895e();
        Intrinsics.checkNotNullExpressionValue(m31895e, "create()");
        this.f15516E = m31895e;
        eventBus.mo104917a(this);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3620j c3620j = new C3620j(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: tS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102246j3(Function1.this, obj);
            }
        });
        Observable<List<C43710k66>> observeOn = vehicleTrackerManager.mo96348f().observeOn(C24542a.m31932c());
        final C3622k c3622k = C3622k.f15682g;
        Observable<R> map = observeOn.map(new InterfaceC23492o() { // from class: uS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m102242k3;
                m102242k3 = IT4.m102242k3(Function1.this, obj);
                return m102242k3;
            }
        });
        final C3626l c3626l = new C3626l(this);
        Observable switchMap = map.switchMap(new InterfaceC23492o() { // from class: wS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102238l3;
                m102238l3 = IT4.m102238l3(Function1.this, obj);
                return m102238l3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "vehicleTrackerManager.tr…empty()\n        }\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = switchMap.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(mo75032o0(), vehicleTrackerManager.mo96348f(), C3657y0.f15735a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn2 = combineLatest.observeOn(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…Schedulers.computation())");
        Observable m74575T = C37279Yf5.m74575T(observeOn2, new C3628m(this));
        final C3630n c3630n = C3630n.f15695g;
        Observable filter = m74575T.filter(new InterfaceC23494q() { // from class: xS4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m102233m3;
                m102233m3 = IT4.m102233m3(Function1.this, obj);
                return m102233m3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "Observables.combineLates…ilter { it.isNotEmpty() }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as3 = filter.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3633o c3633o = new C3633o(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: yS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102229n3(Function1.this, obj);
            }
        };
        final C3635p c3635p = C3635p.f15700g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: zS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102225o3(Function1.this, obj);
            }
        });
        final C3638q c3638q = C3638q.f15703g;
        Observable distinctUntilChanged = create$default.map(new InterfaceC23492o() { // from class: AS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m102221p3;
                m102221p3 = IT4.m102221p3(Function1.this, obj);
                return m102221p3;
            }
        }).distinctUntilChanged();
        final C3640r c3640r = new C3640r(this);
        Observable distinctUntilChanged2 = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: BS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102217q3;
                m102217q3 = IT4.m102217q3(Function1.this, obj);
                return m102217q3;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "mutableRideStates\n      …  .distinctUntilChanged()");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as4 = distinctUntilChanged2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3601a c3601a = new C3601a(this);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: CS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102286Z2(Function1.this, obj);
            }
        };
        final C3604b c3604b = C3604b.f15656b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: jS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102282a3(Function1.this, obj);
            }
        });
        Observable<Optional<RideState>> distinctUntilChanged3 = mo75034m0().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "focusedRideState.distinctUntilChanged()");
        Observable m31949b = C24527f.m31949b(distinctUntilChanged3, reactiveConfig.m82502q8(), reactiveConfig.m82480s8());
        final C3606c c3606c = new C3606c(this);
        Observable doOnNext = m31949b.map(new InterfaceC23492o() { // from class: lS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m102278b3;
                m102278b3 = IT4.m102278b3(Function1.this, obj);
                return m102278b3;
            }
        }).doOnNext(create$default2);
        final C3608d c3608d = C3608d.f15661g;
        Observable throttleLatest = doOnNext.switchMap(new InterfaceC23492o() { // from class: mS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102274c3;
                m102274c3 = IT4.m102274c3(Function1.this, obj);
                return m102274c3;
            }
        }).throttleLatest(5L, timeUnit);
        final C3610e c3610e = new C3610e(this);
        Observable switchMapMaybe = throttleLatest.switchMapMaybe(new InterfaceC23492o() { // from class: nS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m102270d3;
                m102270d3 = IT4.m102270d3(Function1.this, obj);
                return m102270d3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapMaybe, "focusedRideState.distinc…ed.accept(true) }\n      }");
        Observable m74557f0 = C37279Yf5.m74557f0(switchMapMaybe, 5);
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as5 = m74557f0.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as5).subscribe();
        Z84<Optional<RideState>> mo75057R = mo75057R();
        final C3612f c3612f = C3612f.f15669g;
        Observable distinctUntilChanged4 = mo75057R.map(new InterfaceC23492o() { // from class: oS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                RideState.Status m102266e3;
                m102266e3 = IT4.m102266e3(Function1.this, obj);
                return m102266e3;
            }
        }).distinctUntilChanged();
        final C3614g c3614g = C3614g.f15671g;
        Observable filter2 = distinctUntilChanged4.filter(new InterfaceC23494q() { // from class: pS4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m102262f3;
                m102262f3 = IT4.m102262f3(Function1.this, obj);
                return m102262f3;
            }
        });
        final C3616h c3616h = new C3616h(this);
        filter2.flatMapCompletable(new InterfaceC23492o() { // from class: qS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102258g3;
                m102258g3 = IT4.m102258g3(Function1.this, obj);
                return m102258g3;
            }
        }).subscribe();
        Z84<Optional<RideState>> mo75057R2 = mo75057R();
        final C3644s0 c3644s0 = C3644s0.f15708g;
        Observable<Optional<RideState>> rideStatusChanged = mo75057R2.distinctUntilChanged(new InterfaceC23492o() { // from class: rS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m102254h3;
                m102254h3 = IT4.m102254h3(Function1.this, obj);
                return m102254h3;
            }
        });
        Observable<User> mo76579f = userStream.mo76579f();
        Intrinsics.checkNotNullExpressionValue(rideStatusChanged, "rideStatusChanged");
        Observable combineLatest2 = Observable.combineLatest(mo76579f, rideStatusChanged, C3659z0.f15737a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C3618i c3618i = new C3618i(this);
        combineLatest2.flatMapCompletable(new InterfaceC23492o() { // from class: sS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102250i3;
                m102250i3 = IT4.m102250i3(Function1.this, obj);
                return m102250i3;
            }
        }).subscribe();
    }

    /* renamed from: A3 */
    public static final WireRideDetail m102385A3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireRideDetail) tmp0.invoke(obj);
    }

    /* renamed from: B3 */
    public static final void m102381B3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B4 */
    public static final InterfaceC23447K m102380B4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C3 */
    public static final void m102377C3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D3 */
    public static final CompleteRideResponse m102373D3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CompleteRideResponse) tmp0.invoke(obj);
    }

    /* renamed from: D4 */
    public static final InterfaceC23447K m102372D4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E3 */
    public static final InterfaceC23447K m102369E3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E4 */
    public static final void m102368E4(IT4 this$0, String rideId, RideState.Status requestedState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rideId, "$rideId");
        Intrinsics.checkNotNullParameter(requestedState, "$requestedState");
        List<RideState> rideStates = this$0.mo75032o0().m73665a().getRideStates();
        boolean z = true;
        if (!(rideStates instanceof Collection) || !rideStates.isEmpty()) {
            Iterator<T> it = rideStates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.areEqual(((RideState) it.next()).getRide().getId(), rideId)) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            this$0.f15514C.accept(Optional.f63040c.m59032c(TuplesKt.m28425to(rideId, requestedState)));
            return;
        }
        throw new IllegalArgumentException("No ride state with " + rideId + " ride id found to act on.");
    }

    /* renamed from: H3 */
    public static final Unit m102357H3(IT4 this$0, WireBird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        this$0.f15525g.mo19549i(bird);
        return Unit.INSTANCE;
    }

    /* renamed from: H4 */
    public static /* synthetic */ void m102356H4(IT4 it4, String str, RideState.Status status, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            status = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        it4.m102360G4(str, status, obj);
    }

    /* renamed from: I3 */
    public static final InterfaceC23434B m102353I3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: J3 */
    public static final InterfaceC23434B m102349J3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K3 */
    public static final void m102345K3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L3 */
    public static final InterfaceC23434B m102341L3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: N3 */
    public static final Unit m102333N3(IT4 this$0, WireBird bird) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        this$0.f15525g.mo19549i(bird);
        return Unit.INSTANCE;
    }

    /* renamed from: O3 */
    public static final WireBird m102329O3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBird) tmp0.invoke(obj);
    }

    /* renamed from: P3 */
    public static final void m102325P3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P4 */
    public static final WireBird m102324P4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBird) tmp0.invoke(obj);
    }

    /* renamed from: Q4 */
    public static final InterfaceC24574u m102320Q4(IT4 this$0, Object it) {
        List<WireRide> emptyList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        C41318g46.m40163a("calling getActiveRides in sharedActiveRides stream", new Object[0]);
        AbstractC24507p<List<WireRide>> mo75039i = this$0.mo75039i();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC24507p<List<WireRide>> m32035j = mo75039i.m32035j(emptyList);
        final C3655x0 c3655x0 = C3655x0.f15733g;
        return m32035j.m32026s(new InterfaceC23484g() { // from class: OS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102316R4(Function1.this, obj);
            }
        }).m32065J();
    }

    /* renamed from: R3 */
    public static /* synthetic */ CompleteRideResponse m102317R3(IT4 it4, Throwable th, WireRide wireRide, int i, Object obj) {
        if ((i & 2) != 0) {
            wireRide = null;
        }
        return it4.m102321Q3(th, wireRide);
    }

    /* renamed from: R4 */
    public static final void m102316R4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S3 */
    public static final void m102313S3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S4 */
    public static final void m102312S4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T3 */
    public static final void m102309T3(IT4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("rides empty from getActiveRides", new Object[0]);
        this$0.f15543y.accept(new RideStates(null, 1, null));
    }

    /* renamed from: T4 */
    public static final void m102308T4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U3 */
    public static final void m102305U3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U4 */
    public static final void m102304U4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V4 */
    public static final void m102300V4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W3 */
    public static final InterfaceC23434B m102297W3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: W4 */
    public static final void m102296W4(Ref.ObjectRef bluetoothRaceDisposable) {
        Intrinsics.checkNotNullParameter(bluetoothRaceDisposable, "$bluetoothRaceDisposable");
        InterfaceC23465c interfaceC23465c = (InterfaceC23465c) bluetoothRaceDisposable.element;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
    }

    /* renamed from: X3 */
    public static final InterfaceC23447K m102293X3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z2 */
    public static final void m102286Z2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z3 */
    public static final InterfaceC23434B m102285Z3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Z4 */
    public static final void m102284Z4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a3 */
    public static final void m102282a3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a5 */
    public static final void m102280a5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b3 */
    public static final Optional m102278b3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: b5 */
    public static final InterfaceC23496h m102276b5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: c3 */
    public static final InterfaceC23434B m102274c3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: c4 */
    public static final InterfaceC23434B m102273c4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: c5 */
    public static final void m102272c5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d3 */
    public static final InterfaceC24574u m102270d3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: d4 */
    public static final InterfaceC23434B m102269d4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: d5 */
    public static final void m102268d5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e3 */
    public static final RideState.Status m102266e3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RideState.Status) tmp0.invoke(obj);
    }

    /* renamed from: e5 */
    public static final InterfaceC23496h m102264e5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f3 */
    public static final boolean m102262f3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: f5 */
    public static final void m102260f5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g3 */
    public static final InterfaceC23496h m102258g3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h3 */
    public static final String m102254h3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: h4 */
    public static final InterfaceC23434B m102253h4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: h5 */
    public static /* synthetic */ Observable m102252h5(IT4 it4, WireRide wireRide, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return it4.m102256g5(wireRide, num);
    }

    /* renamed from: i3 */
    public static final InterfaceC23496h m102250i3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: i5 */
    public static final Boolean m102248i5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: j3 */
    public static final void m102246j3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j4 */
    public static final InterfaceC23434B m102245j4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: j5 */
    public static final InterfaceC23434B m102244j5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k3 */
    public static final Boolean m102242k3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: k4 */
    public static final void m102241k4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l3 */
    public static final InterfaceC23434B m102238l3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: m3 */
    public static final boolean m102233m3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: m4 */
    public static final void m102232m4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m5 */
    public static final InterfaceC23434B m102231m5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: n3 */
    public static final void m102229n3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n5 */
    public static final InterfaceC23447K m102227n5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o3 */
    public static final void m102225o3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p3 */
    public static final List m102221p3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: p4 */
    public static final void m102220p4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p5 */
    public static final boolean m102219p5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q3 */
    public static final InterfaceC23434B m102217q3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: q4 */
    public static final void m102216q4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q5 */
    public static final Object m102215q5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: r4 */
    public static final void m102211r4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r5 */
    public static final InterfaceC24574u m102210r5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: s3 */
    public static final InterfaceC23434B m102207s3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: s4 */
    public static final void m102206s4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s5 */
    public static final boolean m102205s5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: t4 */
    public static final void m102201t4(Ref.ObjectRef bluetoothRaceDisposable) {
        Intrinsics.checkNotNullParameter(bluetoothRaceDisposable, "$bluetoothRaceDisposable");
        InterfaceC23465c interfaceC23465c = (InterfaceC23465c) bluetoothRaceDisposable.element;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
    }

    /* renamed from: t5 */
    public static final Object m102200t5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: u5 */
    public static final InterfaceC23434B m102195u5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: v3 */
    public static final void m102192v3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v4 */
    public static /* synthetic */ Observable m102191v4(IT4 it4, WireRide wireRide, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return it4.m102196u4(wireRide, num);
    }

    /* renamed from: v5 */
    public static final Object m102190v5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: w3 */
    public static final void m102187w3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w4 */
    public static final Boolean m102186w4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: x3 */
    public static final void m102182x3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x4 */
    public static final InterfaceC23434B m102181x4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x5 */
    public static final File m102180x5(byte[] jpeg, IT4 this$0, String fileName) {
        Intrinsics.checkNotNullParameter(jpeg, "$jpeg");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(jpeg, 0, jpeg.length, options);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.length, C27606qU.m17493a(options, 800));
        File file = new File(this$0.f15520b.getCacheDir().getAbsolutePath(), fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 65, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return file;
        } finally {
        }
    }

    /* renamed from: y3 */
    public static final void m102177y3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z3 */
    public static final InterfaceC23447K m102173z3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z4 */
    public static final InterfaceC23434B m102172z4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: A4 */
    public final <T> AbstractC23442F<T> m102384A4(AbstractC23442F<T> abstractC23442F, WireBird wireBird) {
        final C3627l0 c3627l0 = new C3627l0(this, wireBird);
        AbstractC23442F<T> abstractC23442F2 = (AbstractC23442F<T>) abstractC23442F.m33165A(new InterfaceC23492o() { // from class: CT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102380B4;
                m102380B4 = IT4.m102380B4(Function1.this, obj);
                return m102380B4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC23442F2, "private fun <T> Single<T…e.just(item))\n      }\n  }");
        return abstractC23442F2;
    }

    @Override // p000.YR4
    /* renamed from: C */
    public AbstractC23442F<DetectHelmetSelfieResponse> mo75067C(String imageUrl, float f, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return this.f15521c.m93925p(new DetectHelmetSelfieRequest(imageUrl, f, str));
    }

    /* renamed from: C4 */
    public final <T> AbstractC23442F<T> m102376C4(AbstractC23442F<T> abstractC23442F, WireBird wireBird) {
        final C3629m0 c3629m0 = new C3629m0(this, wireBird);
        AbstractC23442F<T> abstractC23442F2 = (AbstractC23442F<T>) abstractC23442F.m33165A(new InterfaceC23492o() { // from class: zT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102372D4;
                m102372D4 = IT4.m102372D4(Function1.this, obj);
                return m102372D4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC23442F2, "private fun <T> Single<T…e.just(item))\n      }\n  }");
        return abstractC23442F2;
    }

    @Override // p000.YR4
    /* renamed from: D */
    public Z84<Boolean> mo75066D() {
        return (Z84) this.f15538t.getValue();
    }

    @Override // p000.YR4
    /* renamed from: F */
    public Z84<Optional<RideStartTimeConstraint>> mo75065F() {
        return (Z84) this.f15537s.getValue();
    }

    /* renamed from: F3 */
    public final DateTime m102365F3(RideState rideState, int i, int i2) {
        Integer num;
        WireRide ride = rideState.getRide();
        if (ride.getStartedInNoRideZone()) {
            num = Integer.valueOf(i);
        } else if (ride.getStartedOutsideOperatingArea()) {
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        DateTime startedAt = ride.getStartedAt();
        if (startedAt == null) {
            return null;
        }
        return startedAt.plus(intValue * 1000);
    }

    /* renamed from: F4 */
    public final void m102364F4() {
        this.f15543y.m71836j();
        C24560e<WireBirdEvent> m31895e = C24560e.m31895e();
        Intrinsics.checkNotNullExpressionValue(m31895e, "create()");
        this.f15516E = m31895e;
        mo75046f0();
    }

    @Override // p000.YR4
    /* renamed from: G */
    public Observable<WireBird> mo75064G(WireRide ride, Integer num) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        return m102202t3(m102256g5(ride, num), ride.getId(), RideState.Status.UNLOCKED);
    }

    /* renamed from: G3 */
    public final Observable<WireBird> m102361G3(WireRide wireRide) {
        final WireBird bird = wireRide.getBird();
        Intrinsics.checkNotNull(bird);
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: ZR4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m102357H3;
                m102357H3 = IT4.m102357H3(IT4.this, bird);
                return m102357H3;
            }
        });
        final C3553G c3553g = new C3553G(bird, wireRide);
        Observable flatMap = fromCallable.flatMap(new InterfaceC23492o() { // from class: kS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102353I3;
                m102353I3 = IT4.m102353I3(Function1.this, obj);
                return m102353I3;
            }
        });
        final C3556H c3556h = new C3556H(wireRide);
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: vS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102349J3;
                m102349J3 = IT4.m102349J3(Function1.this, obj);
                return m102349J3;
            }
        });
        final C3558I c3558i = C3558I.f15582g;
        Observable doOnError = flatMap2.doOnError(new InterfaceC23484g() { // from class: GS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102345K3(Function1.this, obj);
            }
        });
        final C3560J c3560j = new C3560J(bird);
        Observable<WireBird> onErrorResumeNext = doOnError.onErrorResumeNext(new InterfaceC23492o() { // from class: RS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102341L3;
                m102341L3 = IT4.m102341L3(Function1.this, obj);
                return m102341L3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "private fun endBluetooth…rd)\n        }\n      }\n  }");
        return onErrorResumeNext;
    }

    /* renamed from: G4 */
    public final void m102360G4(String str, RideState.Status status, Object obj) {
        WireRide copy;
        C41318g46.m40163a("Resetting ride state for rideId " + str + " to state value " + status + " and updating status NONE", new Object[0]);
        RideState mo75038i1 = mo75038i1(str);
        if (mo75038i1 == null) {
            C41318g46.m40160d("No existing ride state found for " + str + " to update.", new Object[0]);
            return;
        }
        RideState.Status status2 = status == null ? mo75038i1.getStatus() : status;
        WireBird bird = mo75038i1.getRide().getBird();
        if (bird != null) {
            r1 = C40963fU4.m41294b(bird, obj instanceof WireBird ? (WireBird) obj : null);
        }
        WireBird wireBird = r1;
        if (obj instanceof WireRide) {
            copy = (WireRide) obj;
        } else if (obj instanceof CompleteRideResponse) {
            WireRideDetail rideDetail = ((CompleteRideResponse) obj).getRideDetail();
            if (rideDetail == null || (copy = rideDetail.getRide()) == null) {
                copy = r9.copy((r45 & 1) != 0 ? r9.f66754id : null, (r45 & 2) != 0 ? r9.distance : 0.0d, (r45 & 4) != 0 ? r9.birdId : null, (r45 & 8) != 0 ? r9.bird : wireBird, (r45 & 16) != 0 ? r9.birdEphemeralId : null, (r45 & 32) != 0 ? r9.cost : 0, (r45 & 64) != 0 ? r9.currency : null, (r45 & 128) != 0 ? r9.startedAt : null, (r45 & 256) != 0 ? r9.deliveryUnlockedAt : null, (r45 & 512) != 0 ? r9.completedAt : null, (r45 & 1024) != 0 ? r9.continuedAt : null, (r45 & 2048) != 0 ? r9.canceledAt : null, (r45 & 4096) != 0 ? r9.delivery : false, (r45 & 8192) != 0 ? r9.payAsYouGo : false, (r45 & 16384) != 0 ? r9.successfulTest : null, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r9.type : null, (r45 & 65536) != 0 ? r9.partnerId : null, (r45 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r9.billedMinutes : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r9.privateBirdId : null, (r45 & 524288) != 0 ? r9.vehicleModel : null, (r45 & 1048576) != 0 ? r9.tipId : null, (r45 & 2097152) != 0 ? r9.startedInNoRideZone : false, (r45 & 4194304) != 0 ? r9.startedOutsideOperatingArea : false, (r45 & 8388608) != 0 ? r9.isBadAreaRideEnabled : false, (r45 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r9.userGuestId : null, (r45 & 33554432) != 0 ? mo75038i1.getRide().rideDetail : null);
            }
        } else {
            copy = r9.copy((r45 & 1) != 0 ? r9.f66754id : null, (r45 & 2) != 0 ? r9.distance : 0.0d, (r45 & 4) != 0 ? r9.birdId : null, (r45 & 8) != 0 ? r9.bird : wireBird, (r45 & 16) != 0 ? r9.birdEphemeralId : null, (r45 & 32) != 0 ? r9.cost : 0, (r45 & 64) != 0 ? r9.currency : null, (r45 & 128) != 0 ? r9.startedAt : null, (r45 & 256) != 0 ? r9.deliveryUnlockedAt : null, (r45 & 512) != 0 ? r9.completedAt : null, (r45 & 1024) != 0 ? r9.continuedAt : null, (r45 & 2048) != 0 ? r9.canceledAt : null, (r45 & 4096) != 0 ? r9.delivery : false, (r45 & 8192) != 0 ? r9.payAsYouGo : false, (r45 & 16384) != 0 ? r9.successfulTest : null, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r9.type : null, (r45 & 65536) != 0 ? r9.partnerId : null, (r45 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r9.billedMinutes : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r9.privateBirdId : null, (r45 & 524288) != 0 ? r9.vehicleModel : null, (r45 & 1048576) != 0 ? r9.tipId : null, (r45 & 2097152) != 0 ? r9.startedInNoRideZone : false, (r45 & 4194304) != 0 ? r9.startedOutsideOperatingArea : false, (r45 & 8388608) != 0 ? r9.isBadAreaRideEnabled : false, (r45 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r9.userGuestId : null, (r45 & 33554432) != 0 ? mo75038i1.getRide().rideDetail : null);
        }
        m102240k5(RideState.copy$default(mo75038i1, copy, status2, null, RideUpdateState.NONE, 4, null));
    }

    @Override // p000.YR4
    /* renamed from: I */
    public AbstractC23442F<DisputeRideFinalizeResponse> mo75063I(WireRide ride) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        return this.f15521c.m93924q(new DisputeRideFinalizeRequest(ride.getId()));
    }

    /* renamed from: I4 */
    public <T> AbstractC24507p<T> m102352I4(AbstractC24507p<T> abstractC24507p) {
        return InterfaceC38798br4.C13315a.m62281n(this, abstractC24507p);
    }

    @Override // p000.YR4
    /* renamed from: J */
    public Observable<List<WireRide>> mo75062J() {
        Observable<List<WireRide>> observeOn = this.f15519H.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "sharedActiveRides\n      …dSchedulers.mainThread())");
        return observeOn;
    }

    /* renamed from: J4 */
    public <T> Observable<T> m102348J4(Observable<T> observable) {
        return InterfaceC38798br4.C13315a.m62280o(this, observable);
    }

    /* renamed from: K4 */
    public <T> AbstractC23442F<T> m102344K4(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    /* renamed from: L4 */
    public final void m102340L4(WireBird wireBird, Throwable th) {
        WireRide wireRide;
        RideConfig rideConfig;
        String str;
        boolean canTreatAsBluetooth;
        boolean cellular;
        String str2;
        WireBird bird;
        String id;
        String str3;
        boolean canTreatAsBluetooth2;
        boolean cellular2;
        String str4;
        WireBird bird2;
        String id2;
        Config rideConfig2;
        String id3 = wireBird.getId();
        DateTime dateTime = this.f15541w.get(id3);
        if (dateTime == null) {
            return;
        }
        this.f15541w.remove(id3);
        RideState mo75044g0 = mo75044g0(wireBird);
        if (mo75044g0 != null) {
            wireRide = mo75044g0.getRide();
        } else {
            wireRide = null;
        }
        if (mo75044g0 == null || (rideConfig2 = mo75044g0.getRideConfig()) == null || (rideConfig = rideConfig2.getRideConfig()) == null) {
            rideConfig = mo75030r().m73665a().getRideConfig();
        }
        boolean z = false;
        if (th != null) {
            InterfaceC1880Ea interfaceC1880Ea = this.f15530l;
            if (wireRide == null || (id2 = wireRide.getId()) == null) {
                str3 = "0";
            } else {
                str3 = id2;
            }
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            double m19253i = C46880pT0.m19253i(now, dateTime);
            if (wireRide != null) {
                canTreatAsBluetooth2 = m102228n4(wireRide);
            } else {
                canTreatAsBluetooth2 = WireBirdKt.canTreatAsBluetooth(wireBird, C36441Uq4.m80769c(this.f15527i, wireBird));
            }
            boolean z2 = canTreatAsBluetooth2;
            if (wireRide != null && (bird2 = wireRide.getBird()) != null) {
                cellular2 = bird2.getCellular();
            } else {
                cellular2 = wireBird.getCellular();
            }
            boolean z3 = cellular2;
            boolean m87363b = R36.m87363b(th);
            String model = wireBird.getModel();
            if (model == null) {
                str4 = "";
            } else {
                str4 = model;
            }
            String currency = rideConfig.getCurrency();
            long minimumRidePrice = rideConfig.getMinimumRidePrice();
            long minutePrice = rideConfig.getMinutePrice();
            long includedMinutes = rideConfig.getIncludedMinutes();
            String partnerId = wireBird.getPartnerId();
            boolean applyTax = rideConfig.getAdditionalFees().getApplyTax();
            long basePrice = rideConfig.getBasePrice();
            if (mo75044g0 != null && RideStatesKt.isPrimaryRide(mo75044g0)) {
                z = true;
            }
            interfaceC1880Ea.mo55905y(new C49830uR4(null, null, null, Boolean.valueOf(z2), Boolean.valueOf(z3), str4, currency, minimumRidePrice, minutePrice, includedMinutes, m19253i, partnerId, str3, applyTax, basePrice, dateTime, Boolean.valueOf(z), Long.valueOf(mo75032o0().m73665a().getActiveRideCount()), m87363b, 7, null));
            return;
        }
        InterfaceC1880Ea interfaceC1880Ea2 = this.f15530l;
        if (wireRide == null || (id = wireRide.getId()) == null) {
            str = "0";
        } else {
            str = id;
        }
        DateTime now2 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now2, "now()");
        double m19253i2 = C46880pT0.m19253i(now2, dateTime);
        if (wireRide != null) {
            canTreatAsBluetooth = m102228n4(wireRide);
        } else {
            canTreatAsBluetooth = WireBirdKt.canTreatAsBluetooth(wireBird, C36441Uq4.m80769c(this.f15527i, wireBird));
        }
        boolean z4 = canTreatAsBluetooth;
        if (wireRide != null && (bird = wireRide.getBird()) != null) {
            cellular = bird.getCellular();
        } else {
            cellular = wireBird.getCellular();
        }
        boolean z5 = cellular;
        String model2 = wireBird.getModel();
        if (model2 == null) {
            str2 = "";
        } else {
            str2 = model2;
        }
        String currency2 = rideConfig.getCurrency();
        long minimumRidePrice2 = rideConfig.getMinimumRidePrice();
        long minutePrice2 = rideConfig.getMinutePrice();
        long includedMinutes2 = rideConfig.getIncludedMinutes();
        String partnerId2 = wireBird.getPartnerId();
        boolean applyTax2 = rideConfig.getAdditionalFees().getApplyTax();
        long basePrice2 = rideConfig.getBasePrice();
        if (mo75044g0 != null && RideStatesKt.isPrimaryRide(mo75044g0)) {
            z = true;
        }
        interfaceC1880Ea2.mo55905y(new C49237tR4(null, null, null, Boolean.valueOf(z4), Boolean.valueOf(z5), str2, currency2, minimumRidePrice2, minutePrice2, includedMinutes2, m19253i2, partnerId2, str, applyTax2, basePrice2, dateTime, Boolean.valueOf(z), Long.valueOf(mo75032o0().m73665a().getActiveRideCount()), 7, null));
    }

    /* renamed from: M3 */
    public final Observable<WireBird> m102337M3(WireRide wireRide) {
        final WireBird bird = wireRide.getBird();
        Intrinsics.checkNotNull(bird);
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: vT4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m102333N3;
                m102333N3 = IT4.m102333N3(IT4.this, bird);
                return m102333N3;
            }
        });
        final C3563K c3563k = new C3563K(bird);
        Observable map = fromCallable.map(new InterfaceC23492o() { // from class: wT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBird m102329O3;
                m102329O3 = IT4.m102329O3(Function1.this, obj);
                return m102329O3;
            }
        });
        final C3565L c3565l = C3565L.f15588g;
        Observable<WireBird> doOnError = map.doOnError(new InterfaceC23484g() { // from class: xT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102325P3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "bird = ride.bird!!\n    r…rd in endCellularRide\") }");
        return doOnError;
    }

    /* renamed from: M4 */
    public final Observable<WireBird> m102336M4(WireRide wireRide, boolean z, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(wireRide, "<this>");
        if (z2 && !C40788fB0.m41760v(this.f15520b)) {
            Observable<WireBird> error = Observable.error(new LocationDisabledException());
            Intrinsics.checkNotNullExpressionValue(error, "error(LocationDisabledException())");
            return error;
        }
        C24560e<WireBirdEvent> m31895e = C24560e.m31895e();
        Intrinsics.checkNotNullExpressionValue(m31895e, "create()");
        this.f15516E = m31895e;
        Observable<WireBird> m102348J4 = m102348J4(C37279Yf5.m74589F(m102328O4(wireRide, new RideStatusBody(wireRide.getId(), RideStatusField.LOCKED, z, num, false, 16, null)), new C3647t0(this), new C3649u0(this, wireRide, z)));
        Intrinsics.checkNotNullExpressionValue(m102348J4, "internal fun WireRide.se…)\n      .schedulers()\n  }");
        return m102348J4;
    }

    @Override // p000.YR4
    /* renamed from: N */
    public boolean mo75061N() {
        return mo75032o0().m73665a().getActiveRideCount() > 0;
    }

    /* renamed from: N4 */
    public final void m102332N4(RideState rideState) {
        m102288Y4(rideState);
        this.f15543y.m71837i(new C3651v0(rideState, new Ref.BooleanRef()));
    }

    @Override // p000.YR4
    /* renamed from: O */
    public void mo75060O(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Map<String, DateTime> map = this.f15541w;
        String id = bird.getId();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        map.put(id, now);
    }

    /* renamed from: O4 */
    public final Observable<WireBird> m102328O4(WireRide wireRide, RideStatusBody rideStatusBody) {
        Observable<WireBird> m93929l = this.f15521c.m93929l(rideStatusBody);
        final C3653w0 c3653w0 = new C3653w0(wireRide);
        Observable map = m93929l.map(new InterfaceC23492o() { // from class: yT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBird m102324P4;
                m102324P4 = IT4.m102324P4(Function1.this, obj);
                return m102324P4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "WireRide.setRideStatus(b…wBird) ?: newBird\n      }");
        return map;
    }

    @Override // p000.YR4
    /* renamed from: P */
    public Observable<CollectionResponse<RideSummary>> mo75059P(int i, int i2) {
        Observable<CollectionResponse<RideSummary>> m102348J4 = m102348J4(this.f15521c.m93926o(i, i2));
        Intrinsics.checkNotNullExpressionValue(m102348J4, "rideClient\n      .getRid…imit)\n      .schedulers()");
        return m102348J4;
    }

    @Override // p000.YR4
    /* renamed from: Q */
    public Observable<RideStateEvent> mo75058Q() {
        Object value = this.f15540v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-rideStateEvents>(...)");
        return (Observable) value;
    }

    /* renamed from: Q3 */
    public final CompleteRideResponse m102321Q3(Throwable th, WireRide wireRide) {
        return new CompleteRideResponse(null, new CompleteRideResponseError(th, wireRide));
    }

    @Override // p000.YR4
    /* renamed from: R */
    public Z84<Optional<RideState>> mo75057R() {
        return (Z84) this.f15533o.getValue();
    }

    @Override // p000.YR4
    /* renamed from: T */
    public Observable<WireBird> mo75056T(WireRide ride, boolean z) {
        RideState.Status status;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Observable<WireBird> m102212r3 = m102212r3(ride, z);
        String id = ride.getId();
        if (z) {
            status = RideState.Status.LOCKED;
        } else {
            status = RideState.Status.UNLOCKED;
        }
        return m102202t3(m102212r3, id, status);
    }

    @Override // p000.YR4
    /* renamed from: V */
    public AbstractC23442F<WireRide> mo75055V(WireBird bird, AbstractC23442F<WireRide> startRideSingle) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(startRideSingle, "startRideSingle");
        C50439vT3<WireRide> c50439vT3 = new C50439vT3<>(null, null, 3, null);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final C3545E0 c3545e0 = new C3545E0();
        AbstractC23442F<WireRide> m33101w = startRideSingle.m33101w(new InterfaceC23484g() { // from class: gT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102312S4(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun startRideAn…ectsIfNecessary(bird)\n  }");
        if (WireBirdKt.birdModel(bird).isScanOnly()) {
            linkedHashMap.put(EnumC34767Nm4.SCAN_ONLY, m102237l4(bird, c50439vT3, m33101w));
        } else {
            if (WireBirdKt.canTreatAsBluetooth(bird, C36441Uq4.m80769c(this.f15527i, bird))) {
                EnumC34767Nm4 enumC34767Nm4 = EnumC34767Nm4.BLUETOOTH;
                AbstractC23442F<WireRide> m33130h = m102257g4(bird, c50439vT3, new C3537A0(booleanRef), m33101w).m33130h();
                Intrinsics.checkNotNullExpressionValue(m33130h, "isUnlocked = false\n    /…     )\n          .cache()");
                linkedHashMap.put(enumC34767Nm4, m33130h);
            }
            if (bird.getCellular()) {
                linkedHashMap.put(EnumC34767Nm4.CELLULAR, m102249i4(bird, c50439vT3, m33101w));
            }
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(linkedHashMap.keySet(), null, "\"", "\"", 0, null, null, 57, null);
        C41318g46.m40163a("race participants setup: " + joinToString$default, new Object[0]);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC23442F m94858q = C34533Mm4.m94858q(linkedHashMap);
        final C3539B0 c3539b0 = new C3539B0(objectRef, linkedHashMap);
        AbstractC23442F m33152N = m94858q.m33102v(new InterfaceC23484g() { // from class: hT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102308T4(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C3541C0 c3541c0 = new C3541C0(bird);
        AbstractC23442F m33106t = m33152N.m33106t(new InterfaceC23484g() { // from class: iT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102304U4(Function1.this, obj);
            }
        });
        final C3543D0 c3543d0 = new C3543D0(booleanRef, this, bird);
        AbstractC23442F m33108s = m33106t.m33101w(new InterfaceC23484g() { // from class: jT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102300V4(Function1.this, obj);
            }
        }).m33108s(new InterfaceC23478a() { // from class: kT4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                IT4.m102296W4(Ref.ObjectRef.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33108s, "override fun startRideAn…ectsIfNecessary(bird)\n  }");
        return m102376C4(m33108s, bird);
    }

    /* renamed from: V3 */
    public final AbstractC23442F<CompleteRideResponse> m102301V3(WireRide wireRide, C38435bF0 c38435bF0, C50439vT3<CompleteRideResponse> c50439vT3, boolean z) {
        if (!z && !this.f15527i.m82623f8().m73665a().getRideConfig().getAggressiveEndRideLock()) {
            AbstractC23442F<CompleteRideResponse> mo75053a0 = mo75053a0(wireRide, c38435bF0);
            final C3577Q c3577q = new C3577Q(wireRide, c50439vT3);
            AbstractC23442F m33165A = mo75053a0.m33165A(new InterfaceC23492o() { // from class: fT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m102293X3;
                    m102293X3 = IT4.m102293X3(Function1.this, obj);
                    return m102293X3;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33165A, "private fun getCompleteR…back)\n        }\n    }\n  }");
            return m33165A;
        }
        Observable<WireBird> m102361G3 = m102361G3(wireRide);
        final C3575P c3575p = new C3575P(wireRide, c38435bF0, c50439vT3);
        AbstractC23442F<CompleteRideResponse> firstOrError = m102361G3.flatMap(new InterfaceC23492o() { // from class: eT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102297W3;
                m102297W3 = IT4.m102297W3(Function1.this, obj);
                return m102297W3;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "private fun getCompleteR…back)\n        }\n    }\n  }");
        return firstOrError;
    }

    /* renamed from: X4 */
    public final RideState.Status m102292X4(WireRide wireRide) {
        if (C40963fU4.m41292d(wireRide)) {
            return RideState.Status.UNLOCKED;
        }
        if (C40963fU4.m41295a(wireRide)) {
            return RideState.Status.LOCKED;
        }
        return null;
    }

    /* renamed from: Y3 */
    public final AbstractC23442F<CompleteRideResponse> m102289Y3(WireRide wireRide, C38435bF0 c38435bF0, C50439vT3<CompleteRideResponse> c50439vT3) {
        Observable<WireBird> m102337M3 = m102337M3(wireRide);
        final C3581R c3581r = new C3581R(wireRide, c38435bF0, c50439vT3);
        AbstractC23442F<CompleteRideResponse> firstOrError = m102337M3.flatMap(new InterfaceC23492o() { // from class: ZS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102285Z3;
                m102285Z3 = IT4.m102285Z3(Function1.this, obj);
                return m102285Z3;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "private fun getCompleteR…      .firstOrError()\n  }");
        return firstOrError;
    }

    /* renamed from: Y4 */
    public final void m102288Y4(RideState rideState) {
        this.f15544z.accept(new RideStateEvent(rideState, rideState.getStatus()));
    }

    @Override // p000.YR4
    /* renamed from: Z */
    public void mo75054Z() {
        this.f15517F.accept(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r4 != false) goto L11;
     */
    @Override // p000.YR4
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC23442F<CompleteRideResponse> mo75053a0(WireRide ride, C38435bF0 c38435bF0) {
        ParkingNest m64762e;
        boolean z;
        Intrinsics.checkNotNullParameter(ride, "ride");
        NP4 np4 = this.f15521c;
        String id = ride.getId();
        RideEvaluatedParkingInfo rideEvaluatedParkingInfo = null;
        if (c38435bF0 != null && (m64762e = c38435bF0.m64762e()) != null && (r3 = m64762e.getId()) != null) {
            if (c38435bF0.m64761f() == EnumC44987mG3.INSIDE) {
                z = true;
            } else {
                z = false;
            }
        }
        String str = null;
        if (c38435bF0 != null) {
            rideEvaluatedParkingInfo = new RideEvaluatedParkingInfo(c38435bF0.m64764c(), c38435bF0.m64763d());
        }
        AbstractC23442F<WireRideDetail> m32053W = np4.m93930k(new RideIdBody(id, str, rideEvaluatedParkingInfo)).m32053W(AbstractC23442F.m33100x(new RideNotPresentException("ride " + ride.getId() + " not found, it was probably already completed.")));
        final C3538B c3538b = new C3538B(ride);
        AbstractC23442F<R> m33157I = m32053W.m33157I(new InterfaceC23492o() { // from class: lT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireRideDetail m102385A3;
                m102385A3 = IT4.m102385A3(Function1.this, obj);
                return m102385A3;
            }
        });
        final C3540C c3540c = C3540C.f15552g;
        AbstractC23442F m33106t = m33157I.m33106t(new InterfaceC23484g() { // from class: mT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102381B3(Function1.this, obj);
            }
        });
        final C3542D c3542d = new C3542D(ride);
        AbstractC23442F m33101w = m33106t.m33101w(new InterfaceC23484g() { // from class: oT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102377C3(Function1.this, obj);
            }
        });
        final C3544E c3544e = C3544E.f15560g;
        AbstractC23442F m33157I2 = m33101w.m33157I(new InterfaceC23492o() { // from class: pT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                CompleteRideResponse m102373D3;
                m102373D3 = IT4.m102373D3(Function1.this, obj);
                return m102373D3;
            }
        });
        final C3546F c3546f = new C3546F(ride);
        AbstractC23442F m33150P = m33157I2.m33150P(new InterfaceC23492o() { // from class: qT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102369E3;
                m102369E3 = IT4.m102369E3(Function1.this, obj);
                return m102369E3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "override fun completeRid…}\n      .schedulers()\n  }");
        AbstractC23442F<CompleteRideResponse> m102344K4 = m102344K4(m33150P);
        Intrinsics.checkNotNullExpressionValue(m102344K4, "override fun completeRid…}\n      .schedulers()\n  }");
        return m102344K4;
    }

    /* renamed from: a4 */
    public final AbstractC23442F<CompleteRideResponse> m102281a4(WireRide wireRide, C38435bF0 c38435bF0, C50439vT3<CompleteRideResponse> c50439vT3) {
        return C34533Mm4.m94861n(mo75053a0(wireRide, c38435bF0), c50439vT3);
    }

    /* renamed from: b4 */
    public final AbstractC23442F<WireBird> m102277b4(WireRide wireRide, C50439vT3<WireBird> c50439vT3, boolean z, Function0<Boolean> function0) {
        Observable<Vehicle> m102224o4 = m102224o4(wireRide.getBird(), z, function0, wireRide);
        final C3583S c3583s = new C3583S(z, this, wireRide, c50439vT3);
        Observable<R> flatMap = m102224o4.flatMap(new InterfaceC23492o() { // from class: ET4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102273c4;
                m102273c4 = IT4.m102273c4(Function1.this, obj);
                return m102273c4;
            }
        });
        final C3585T c3585t = new C3585T(this, wireRide, z);
        AbstractC23442F<WireBird> firstOrError = flatMap.flatMap(new InterfaceC23492o() { // from class: FT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102269d4;
                m102269d4 = IT4.m102269d4(Function1.this, obj);
                return m102269d4;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "private fun getLockRideR…      .firstOrError()\n  }");
        return firstOrError;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.YR4
    /* renamed from: c0 */
    public AbstractC23442F<DisputeRideCreateResponse> mo75051c0(WireRide ride) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        return this.f15521c.m93927n(new DisputeRideCreateRequest(ride.getId()));
    }

    @Override // p000.YR4
    /* renamed from: d */
    public AbstractC23442F<WireSafeStartValues> mo75050d() {
        return this.f15521c.m93937d();
    }

    @Override // p000.YR4
    /* renamed from: e */
    public AbstractC23442F<DownloadRideReceiptResponse> mo75049e(String rideId) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        return this.f15521c.m93936e(rideId);
    }

    @Override // p000.YR4
    /* renamed from: e0 */
    public AbstractC23442F<WireRide> mo75048e0(String rideId, String imageUrl) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return this.f15521c.m93923r(new UpdateRidePhotoBody(rideId, imageUrl));
    }

    /* renamed from: e4 */
    public final AbstractC23442F<WireBird> m102265e4(WireRide wireRide, C50439vT3<WireBird> c50439vT3, boolean z) {
        Observable m102252h5;
        WireBird bird = wireRide.getBird();
        if (bird != null && WireBirdKt.shouldConnectViaBTInRide(bird, C36441Uq4.m80769c(this.f15527i, bird))) {
            if (z) {
                this.f15525g.mo19556b(bird);
            } else {
                this.f15525g.mo19551g(bird, true);
            }
        }
        if (z) {
            m102252h5 = m102191v4(this, wireRide, null, 2, null);
        } else {
            m102252h5 = m102252h5(this, wireRide, null, 2, null);
        }
        AbstractC23442F firstOrError = m102252h5.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "if (locked) {\n      lock…  }\n      .firstOrError()");
        Observable m33123k0 = C34533Mm4.m94861n(firstOrError, c50439vT3).m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "if (locked) {\n      lock…ck)\n      .toObservable()");
        AbstractC23442F<WireBird> firstOrError2 = C37279Yf5.m74589F(m33123k0, new C3587U(this), new C3589V(this, wireRide, z)).observeOn(C23454a.m33087a()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError2, "private fun getLockRideR…      .firstOrError()\n  }");
        return firstOrError2;
    }

    @Override // p000.YR4
    /* renamed from: f */
    public AbstractC23442F<HM4<DG3>> mo75047f(String str) {
        AbstractC23442F<HM4<DG3>> m102344K4 = m102344K4(this.f15521c.m93935f(str));
        Intrinsics.checkNotNullExpressionValue(m102344K4, "rideClient.getParkingPho…ions(birdId).schedulers()");
        return m102344K4;
    }

    @Override // p000.YR4
    /* renamed from: f0 */
    public void mo75046f0() {
        this.f15513B.m71836j();
    }

    /* renamed from: f4 */
    public final AbstractC23442F<WireBird> m102261f4(WireRide wireRide, C50439vT3<WireBird> c50439vT3, boolean z) {
        WireBird bird = wireRide.getBird();
        if (bird != null && WireBirdKt.shouldConnectViaBTInRide(bird, C36441Uq4.m80769c(this.f15527i, bird))) {
            if (z) {
                this.f15525g.mo19556b(bird);
            } else {
                this.f15525g.mo19551g(bird, true);
            }
        }
        WireBird bird2 = wireRide.getBird();
        if (bird2 == null) {
            bird2 = new WireBird(null, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -1, -1, 3, null);
        }
        AbstractC23442F<WireBird> m33158H = AbstractC23442F.m33158H(bird2);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just((ride.bird ?: WireBird()))");
        return m33158H;
    }

    @Override // p000.YR4
    /* renamed from: g */
    public Observable<WireRideDetail> mo75045g(String rideId) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Observable<WireRideDetail> m102348J4 = m102348J4(this.f15521c.m93934g(rideId));
        Intrinsics.checkNotNullExpressionValue(m102348J4, "rideClient\n      .getRid…deId)\n      .schedulers()");
        return m102348J4;
    }

    @Override // p000.YR4
    /* renamed from: g0 */
    public RideState mo75044g0(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return mo75032o0().m73665a().rideForBird(bird);
    }

    @Override // p000.YR4
    /* renamed from: g1 */
    public void mo75043g1(String rideId, RideState.Status requestedState) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(requestedState, "requestedState");
        if (Intrinsics.areEqual(mo75029s0().m73665a().m59035e(), TuplesKt.m28425to(rideId, requestedState))) {
            this.f15514C.accept(Optional.f63040c.m59034a());
        }
    }

    /* renamed from: g4 */
    public final AbstractC23442F<WireRide> m102257g4(WireBird wireBird, C50439vT3<WireRide> c50439vT3, Function0<Boolean> function0, AbstractC23442F<WireRide> abstractC23442F) {
        Observable flatMap;
        if (!C40788fB0.m41760v(this.f15520b)) {
            flatMap = Observable.error(new LocationDisabledException());
        } else {
            Observable scan$default = InterfaceC27246pJ.C27247a.scan$default(this.f15525g, wireBird, false, 2, null);
            final C3592W c3592w = new C3592W(abstractC23442F, c50439vT3);
            flatMap = scan$default.flatMap(new InterfaceC23492o() { // from class: DT4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m102253h4;
                    m102253h4 = IT4.m102253h4(Function1.this, obj);
                    return m102253h4;
                }
            });
        }
        Intrinsics.checkNotNullExpressionValue(flatMap, "startRidePiggyback: Pigg…ervable()\n        }\n    }");
        AbstractC23442F<WireRide> firstOrError = C37279Yf5.m74589F(flatMap, new C3594X(this, wireBird), new C3596Y(this, wireBird, function0)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "private fun getStartRide…      .firstOrError()\n  }");
        return firstOrError;
    }

    /* renamed from: g5 */
    public final Observable<WireBird> m102256g5(WireRide wireRide, Integer num) {
        Observable<Config> m80768d = C36441Uq4.m80768d(this.f15527i, wireRide.getBird());
        final C3570M0 c3570m0 = C3570M0.f15593g;
        Observable take = m80768d.map(new InterfaceC23492o() { // from class: eS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m102248i5;
                m102248i5 = IT4.m102248i5(Function1.this, obj);
                return m102248i5;
            }
        }).take(1L);
        final C3572N0 c3572n0 = new C3572N0(wireRide, num);
        Observable<WireBird> flatMap = take.flatMap(new InterfaceC23492o() { // from class: fS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102244j5;
                m102244j5 = IT4.m102244j5(Function1.this, obj);
                return m102244j5;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun unlockRideIn…tionRequired = !it) }\n  }");
        return flatMap;
    }

    @Override // p000.YR4
    /* renamed from: h */
    public AbstractC23442F<HM4<LastLockComplianceModel>> mo75042h() {
        AbstractC23442F<HM4<LastLockComplianceModel>> m102344K4 = m102344K4(this.f15521c.m93933h());
        Intrinsics.checkNotNullExpressionValue(m102344K4, "rideClient.getLastLockCompliance().schedulers()");
        return m102344K4;
    }

    @Override // p000.YR4
    /* renamed from: h0 */
    public AbstractC23442F<HM4<PhysicalLockEvent>> mo75041h0(String birdId, PhysicalLockEventKind eventType) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        AbstractC23442F<HM4<PhysicalLockEvent>> m102344K4 = m102344K4(this.f15521c.m93928m(new PhysicalLockEvent(birdId, eventType)));
        Intrinsics.checkNotNullExpressionValue(m102344K4, "rideClient.logPhysicalLo… eventType)).schedulers()");
        return m102344K4;
    }

    @Override // p000.YR4
    /* renamed from: h1 */
    public Observable<WireRide> mo75040h1() {
        Observable<WireRide> hide = this.f15542x.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "bluetoothRideUnlocksRelay.hide()");
        return hide;
    }

    @Override // p000.YR4
    /* renamed from: i */
    public AbstractC24507p<List<WireRide>> mo75039i() {
        AbstractC24507p<List<WireRide>> m76915i = this.f15522d.m76915i();
        final C3571N c3571n = new C3571N();
        AbstractC24507p<List<WireRide>> m32031n = m76915i.m32026s(new InterfaceC23484g() { // from class: rT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102313S3(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: sT4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                IT4.m102309T3(IT4.this);
            }
        });
        final C3573O c3573o = C3573O.f15598g;
        AbstractC24507p<List<WireRide>> m32029p = m32031n.m32029p(new InterfaceC23484g() { // from class: tT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102305U3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32029p, "override fun getActiveRi…}\n      .schedulers()\n  }");
        AbstractC24507p<List<WireRide>> m102352I4 = m102352I4(m32029p);
        Intrinsics.checkNotNullExpressionValue(m102352I4, "override fun getActiveRi…}\n      .schedulers()\n  }");
        return m102352I4;
    }

    @Override // p000.YR4
    /* renamed from: i1 */
    public RideState mo75038i1(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = mo75032o0().m73665a().getRideStates().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((RideState) next).getRide().getId(), str)) {
                obj = next;
                break;
            }
        }
        return (RideState) obj;
    }

    /* renamed from: i4 */
    public final AbstractC23442F<WireRide> m102249i4(WireBird wireBird, C50439vT3<WireRide> c50439vT3, AbstractC23442F<WireRide> abstractC23442F) {
        Observable m33123k0 = C34533Mm4.m94861n(abstractC23442F, c50439vT3).m33123k0();
        final C3599Z c3599z = new C3599Z(this);
        Observable flatMap = m33123k0.flatMap(new InterfaceC23492o() { // from class: AT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102245j4;
                m102245j4 = IT4.m102245j4(Function1.this, obj);
                return m102245j4;
            }
        });
        final C3603a0 c3603a0 = new C3603a0(wireBird, this);
        AbstractC23442F<WireRide> firstOrError = flatMap.doOnNext(new InterfaceC23484g() { // from class: BT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102241k4(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "private fun getStartRide…      .firstOrError()\n  }");
        return firstOrError;
    }

    @Override // p000.YR4
    /* renamed from: j0 */
    public AbstractC23442F<HM4<Object>> mo75037j0(String rideId, String notes) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(notes, "notes");
        return this.f15521c.m93932i(new ParkingEvaluationFeedbackBody(rideId, notes));
    }

    @Override // p000.YR4
    /* renamed from: k0 */
    public AbstractC23442F<WireBird> mo75036k0(WireRide ride, boolean z) {
        boolean z2;
        String joinToString$default;
        RideState.Status status;
        BirdModel birdModel;
        Intrinsics.checkNotNullParameter(ride, "ride");
        RideState mo75038i1 = mo75038i1(ride.getId());
        if (mo75038i1 != null) {
            C41318g46.m40163a("lock Ride, updating ride update state for " + ride.getId() + " to LOCKING (" + z + ")", new Object[0]);
            m102240k5(RideState.copy$default(mo75038i1, null, null, null, RideUpdateState.LOCKING, 7, null));
        } else {
            C41318g46.m40160d("unable to update lock Ride, updating ride update state for " + ride.getId() + " to LOCKING (" + z + ")", new Object[0]);
        }
        C50439vT3<WireBird> c50439vT3 = new C50439vT3<>(null, null, 3, null);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WireBird bird = ride.getBird();
        boolean z3 = true;
        if (bird != null && (birdModel = WireBirdKt.birdModel(bird)) != null && birdModel.isScanOnly()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            linkedHashMap.put(EnumC34767Nm4.SCAN_ONLY, m102261f4(ride, c50439vT3, z));
        } else {
            if (m102228n4(ride)) {
                EnumC34767Nm4 enumC34767Nm4 = EnumC34767Nm4.BLUETOOTH;
                AbstractC23442F<WireBird> m33130h = m102277b4(ride, c50439vT3, z, new C3613f0(booleanRef)).m33130h();
                Intrinsics.checkNotNullExpressionValue(m33130h, "isCompleted = false\n    … { isCompleted }).cache()");
                linkedHashMap.put(enumC34767Nm4, m33130h);
            }
            WireBird bird2 = ride.getBird();
            if (bird2 == null || !bird2.getCellular()) {
                z3 = false;
            }
            if (z3) {
                linkedHashMap.put(EnumC34767Nm4.CELLULAR, m102265e4(ride, c50439vT3, z));
            }
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(linkedHashMap.keySet(), null, "\"", "\"", 0, null, null, 57, null);
        C41318g46.m40163a("race participants setup: " + joinToString$default, new Object[0]);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC23442F m94858q = C34533Mm4.m94858q(linkedHashMap);
        final C3615g0 c3615g0 = new C3615g0(objectRef, linkedHashMap);
        AbstractC23442F m33152N = m94858q.m33102v(new InterfaceC23484g() { // from class: aT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102211r4(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C3617h0 c3617h0 = new C3617h0(booleanRef);
        AbstractC23442F m33108s = m33152N.m33101w(new InterfaceC23484g() { // from class: bT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102206s4(Function1.this, obj);
            }
        }).m33108s(new InterfaceC23478a() { // from class: dT4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                IT4.m102201t4(Ref.ObjectRef.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33108s, "isCompleted = false\n    …osable?.dispose()\n      }");
        String id = ride.getId();
        if (z) {
            status = RideState.Status.LOCKED;
        } else {
            status = RideState.Status.UNLOCKED;
        }
        return m102384A4(m102197u3(m33108s, id, status), ride.getBird());
    }

    @Override // p000.YR4
    /* renamed from: k1 */
    public AbstractC23442F<CompleteRideResponse> mo75035k1(WireRide ride, C38435bF0 c38435bF0) {
        boolean z;
        boolean z2;
        String joinToString$default;
        BirdModel birdModel;
        Intrinsics.checkNotNullParameter(ride, "ride");
        RideState mo75038i1 = mo75038i1(ride.getId());
        if (mo75038i1 != null) {
            C41318g46.m40163a("complete Ride, updating ride update state for " + ride.getId() + " to ENDING", new Object[0]);
            m102240k5(RideState.copy$default(mo75038i1, null, null, null, RideUpdateState.ENDING, 7, null));
        } else {
            C41318g46.m40160d("complete Ride, could not ride update state for " + ride.getId() + " to ENDING, not found", new Object[0]);
        }
        C50439vT3<CompleteRideResponse> c50439vT3 = new C50439vT3<>(null, null, 3, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WireBird bird = ride.getBird();
        boolean z3 = true;
        if (bird != null && (birdModel = WireBirdKt.birdModel(bird)) != null && birdModel.isScanOnly()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            linkedHashMap.put(EnumC34767Nm4.SCAN_ONLY, m102281a4(ride, c38435bF0, c50439vT3));
        } else {
            if (m102228n4(ride)) {
                EnumC34767Nm4 enumC34767Nm4 = EnumC34767Nm4.BLUETOOTH;
                WireBird bird2 = ride.getBird();
                if (bird2 != null && bird2.getCellular()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                linkedHashMap.put(enumC34767Nm4, m102301V3(ride, c38435bF0, c50439vT3, !z2));
            }
            WireBird bird3 = ride.getBird();
            if (bird3 == null || !bird3.getCellular()) {
                z3 = false;
            }
            if (z3) {
                linkedHashMap.put(EnumC34767Nm4.CELLULAR, m102289Y3(ride, c38435bF0, c50439vT3));
            }
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(linkedHashMap.keySet(), null, "\"", "\"", 0, null, null, 57, null);
        C41318g46.m40163a("race participants setup: " + joinToString$default, new Object[0]);
        AbstractC23442F m33158H = AbstractC23442F.m33158H(Unit.INSTANCE);
        final C3536A c3536a = new C3536A(linkedHashMap, ride);
        AbstractC23442F<CompleteRideResponse> m33165A = m33158H.m33165A(new InterfaceC23492o() { // from class: PS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102173z3;
                m102173z3 = IT4.m102173z3(Function1.this, obj);
                return m102173z3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun completeRid…Status.ENDED)\n      }\n  }");
        return m33165A;
    }

    /* renamed from: k5 */
    public final boolean m102240k5(RideState rideState) {
        m102288Y4(rideState);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.f15543y.m71837i(new C3574O0(rideState, booleanRef));
        return booleanRef.element;
    }

    /* renamed from: l4 */
    public final AbstractC23442F<WireRide> m102237l4(WireBird wireBird, C50439vT3<WireRide> c50439vT3, AbstractC23442F<WireRide> abstractC23442F) {
        AbstractC23442F m94861n = C34533Mm4.m94861n(abstractC23442F, c50439vT3);
        final C3605b0 c3605b0 = new C3605b0(wireBird, this);
        AbstractC23442F<WireRide> m33152N = m94861n.m33101w(new InterfaceC23484g() { // from class: uT4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102232m4(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun getStartRide…edulers.mainThread())\n  }");
        return m33152N;
    }

    /* renamed from: l5 */
    public final AbstractC23442F<WireBird> m102236l5(WireRide wireRide, WireBird wireBird, boolean z) {
        RideState.Status status;
        if (!wireBird.getCellular()) {
            Observable<WireBird> m102328O4 = m102328O4(wireRide, new RideStatusBody(wireRide.getId(), RideStatusField.LOCKED, z, null, true, 8, null));
            String id = wireRide.getId();
            if (z) {
                status = RideState.Status.LOCKED;
            } else {
                status = RideState.Status.UNLOCKED;
            }
            AbstractC23442F<WireBird> firstOrError = m102202t3(m102328O4, id, status).firstOrError();
            Intrinsics.checkNotNullExpressionValue(firstOrError, "{ // Do not update the b…    .firstOrError()\n    }");
            return firstOrError;
        }
        AbstractC23442F<WireBird> m33158H = AbstractC23442F.m33158H(wireBird);
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      Single.just(bird)\n    }");
        return m33158H;
    }

    @Override // p000.YR4
    /* renamed from: m0 */
    public Z84<Optional<RideState>> mo75034m0() {
        return (Z84) this.f15536r.getValue();
    }

    @Override // p000.YR4
    /* renamed from: n0 */
    public String mo75033n0() {
        RideState m59035e = mo75034m0().m73665a().m59035e();
        if (m59035e == null || m59035e.getStatus() == RideState.Status.ENDED) {
            return null;
        }
        return m59035e.getRide().getId();
    }

    /* renamed from: n4 */
    public final boolean m102228n4(WireRide wireRide) {
        WireBird bird = wireRide.getBird();
        return bird != null && WireBirdKt.canTreatAsBluetooth(bird, C36441Uq4.m80769c(this.f15527i, wireRide.getBird()));
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.YR4
    /* renamed from: o0 */
    public Z84<RideStates> mo75032o0() {
        return (Z84) this.f15534p.getValue();
    }

    /* renamed from: o4 */
    public final Observable<Vehicle> m102224o4(WireBird wireBird, boolean z, Function0<Boolean> function0, WireRide wireRide) {
        RideUpdateState rideUpdateState;
        Observable doOnNext;
        if (wireBird == null) {
            Observable<Vehicle> never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
            return never;
        } else if (!C40788fB0.m41760v(this.f15520b)) {
            Observable<Vehicle> error = Observable.error(new LocationDisabledException());
            Intrinsics.checkNotNullExpressionValue(error, "error(LocationDisabledException())");
            return error;
        } else {
            RideState mo75044g0 = mo75044g0(wireBird);
            if (mo75044g0 == null || (rideUpdateState = mo75044g0.getUpdateState()) == null) {
                rideUpdateState = RideUpdateState.NONE;
            }
            if (rideUpdateState == RideUpdateState.NONE) {
                rideUpdateState = RideUpdateState.STARTING;
            }
            if (z) {
                doOnNext = InterfaceC27246pJ.C27247a.lock$default(this.f15525g, wireBird, true, false, false, function0, 12, null);
            } else {
                Observable unlock$default = InterfaceC27246pJ.C27247a.unlock$default(this.f15525g, wireBird, true, false, false, function0, 12, null);
                final C3609d0 c3609d0 = new C3609d0(wireRide, this);
                doOnNext = unlock$default.doOnNext(new InterfaceC23484g() { // from class: DS4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        IT4.m102220p4(Function1.this, obj);
                    }
                });
            }
            final C3611e0 c3611e0 = new C3611e0(this, wireBird, z, rideUpdateState);
            Observable<Vehicle> observeOn = doOnNext.doOnNext(new InterfaceC23484g() { // from class: ES4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IT4.m102216q4(Function1.this, obj);
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "private fun lockBluetoot…edulers.mainThread())\n  }");
            return observeOn;
        }
    }

    /* renamed from: o5 */
    public <T> Observable<T> m102223o5(String rideId, T t, boolean z) {
        Config m73665a;
        long roundToLong;
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        C24560e<WireBirdEvent> c24560e = this.f15516E;
        final C3593W0 c3593w0 = new C3593W0(rideId, z);
        Observable<WireBirdEvent> filter = c24560e.filter(new InterfaceC23494q() { // from class: FS4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m102219p5;
                m102219p5 = IT4.m102219p5(Function1.this, obj);
                return m102219p5;
            }
        });
        final C3595X0 c3595x0 = new C3595X0(t);
        InterfaceC23434B map = filter.map(new InterfaceC23492o() { // from class: HS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m102215q5;
                m102215q5 = IT4.m102215q5(Function1.this, obj);
                return m102215q5;
            }
        });
        RideState mo75038i1 = mo75038i1(rideId);
        if (mo75038i1 == null || (m73665a = mo75038i1.getRideConfig()) == null) {
            m73665a = this.f15527i.m82623f8().m73665a();
        }
        roundToLong = MathKt__MathJVMKt.roundToLong(m73665a.getRideConfig().getLockAckPollingIntervalSeconds() * 1000.0f);
        C41318g46.m40163a("waitForNotificationAckLock pollingAckLockIntervalMilliseconds: " + roundToLong, new Object[0]);
        AbstractC24490k<Long> m32095y0 = AbstractC24490k.m32132l0(0L, roundToLong, TimeUnit.MILLISECONDS).m32095y0();
        final C3586T0 c3586t0 = new C3586T0(this);
        AbstractC24490k<R> m32152e0 = m32095y0.m32152e0(new InterfaceC23492o() { // from class: IS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m102210r5;
                m102210r5 = IT4.m102210r5(Function1.this, obj);
                return m102210r5;
            }
        }, false, 1);
        final C3588U0 c3588u0 = new C3588U0(rideId, z);
        Observable<T> m32113r1 = m32152e0.m32175S(new InterfaceC23494q() { // from class: JS4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m102205s5;
                m102205s5 = IT4.m102205s5(Function1.this, obj);
                return m102205s5;
            }
        }).m32113r1();
        final C3591V0 c3591v0 = new C3591V0(t);
        Observable<T> timeout = Observable.merge(map, m32113r1.map(new InterfaceC23492o() { // from class: KS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m102200t5;
                m102200t5 = IT4.m102200t5(Function1.this, obj);
                return m102200t5;
            }
        })).take(1L).timeout(20L, TimeUnit.SECONDS);
        final C3582R0 c3582r0 = C3582R0.f15617g;
        Observable<T> observeOn = timeout.onErrorResumeNext(new InterfaceC23492o() { // from class: LS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102195u5;
                m102195u5 = IT4.m102195u5(Function1.this, obj);
                return m102195u5;
            }
        }).observeOn(C23454a.m33087a());
        final C3584S0 c3584s0 = new C3584S0(t);
        Observable<T> observable = (Observable<T>) observeOn.map(new InterfaceC23492o() { // from class: MS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m102190v5;
                m102190v5 = IT4.m102190v5(Function1.this, obj);
                return m102190v5;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "obj: T, locked: Boolean)…ead())\n      .map { obj }");
        return observable;
    }

    @InterfaceC40955fT5
    public final void onEvent(C9756YK event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.m75247b().getStatus() == BirdStatus.ACK_LOCKED) {
            boolean value = event.m75247b().getValue();
            C41318g46.m40163a("Received BirdCommandEvent - ACK_LOCKED - " + value, new Object[0]);
            this.f15516E.onNext(event.m75247b());
            this.f15516E.onComplete();
        }
    }

    @Override // p000.YR4
    /* renamed from: q1 */
    public RideState mo75031q1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return mo75032o0().m73665a().rideForBirdId(birdId);
    }

    @Override // p000.YR4
    /* renamed from: r */
    public Z84<Config> mo75030r() {
        return (Z84) this.f15535q.getValue();
    }

    /* renamed from: r3 */
    public final Observable<WireBird> m102212r3(WireRide wireRide, boolean z) {
        Observable<WireBird> m102328O4 = m102328O4(wireRide, new RideStatusBody(wireRide.getId(), RideStatusField.ACK_LOCKED, z, null, false, 24, null));
        final C3645t c3645t = new C3645t(this, wireRide, z);
        Object flatMap = m102328O4.flatMap(new InterfaceC23492o() { // from class: HT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102207s3;
                m102207s3 = IT4.m102207s3(Function1.this, obj);
                return m102207s3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun ackLockInter…}\n      .schedulers()\n  }");
        Observable<WireBird> m102348J4 = m102348J4(flatMap);
        Intrinsics.checkNotNullExpressionValue(m102348J4, "private fun ackLockInter…}\n      .schedulers()\n  }");
        return m102348J4;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    @Override // p000.YR4
    /* renamed from: s0 */
    public Z84<Optional<Pair<String, RideState.Status>>> mo75029s0() {
        return (Z84) this.f15539u.getValue();
    }

    @Override // p000.YR4
    /* renamed from: t0 */
    public Observable<Integer> mo75028t0() {
        Observable<Integer> distinctUntilChanged = this.f15518G.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "activeRideCountRelay.distinctUntilChanged()");
        return distinctUntilChanged;
    }

    /* renamed from: t3 */
    public final <T> Observable<T> m102202t3(Observable<T> observable, String str, RideState.Status status) {
        final C3648u c3648u = new C3648u(this, str, status);
        Observable<T> doOnNext = observable.doOnNext(new InterfaceC23484g() { // from class: cS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102192v3(Function1.this, obj);
            }
        });
        final C3650v c3650v = new C3650v(this, str);
        Observable<T> doOnError = doOnNext.doOnError(new InterfaceC23484g() { // from class: dS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102187w3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "private fun <T> Observab…tatus = null)\n      }\n  }");
        return doOnError;
    }

    @Override // p000.YR4
    /* renamed from: u0 */
    public AbstractC23442F<WireRide> mo75027u0(WireRide ride, byte[] jpeg) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(jpeg, "jpeg");
        Observable<File> observeOn = m102185w5(jpeg, "ride_photo.png").subscribeOn(C24542a.m31934a()).observeOn(C24542a.m31932c());
        final C3576P0 c3576p0 = new C3576P0();
        Observable observeOn2 = observeOn.flatMap(new InterfaceC23492o() { // from class: cT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102231m5;
                m102231m5 = IT4.m102231m5(Function1.this, obj);
                return m102231m5;
            }
        }).observeOn(C24542a.m31932c());
        final C3580Q0 c3580q0 = new C3580Q0(ride);
        AbstractC23442F<WireRide> firstOrError = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: nT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m102227n5;
                m102227n5 = IT4.m102227n5(Function1.this, obj);
                return m102227n5;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "override fun uploadRideP…      .firstOrError()\n  }");
        return firstOrError;
    }

    /* renamed from: u3 */
    public final <T> AbstractC23442F<T> m102197u3(AbstractC23442F<T> abstractC23442F, String str, RideState.Status status) {
        final C3652w c3652w = new C3652w(this, str, status);
        AbstractC23442F<T> m33101w = abstractC23442F.m33101w(new InterfaceC23484g() { // from class: aS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102182x3(Function1.this, obj);
            }
        });
        final C3654x c3654x = new C3654x(this, str);
        AbstractC23442F<T> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: bS4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IT4.m102177y3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "private fun <T> Single<T…tatus = null)\n      }\n  }");
        return m33106t;
    }

    /* renamed from: u4 */
    public final Observable<WireBird> m102196u4(WireRide wireRide, Integer num) {
        Observable<Config> m80768d = C36441Uq4.m80768d(this.f15527i, wireRide.getBird());
        final C3619i0 c3619i0 = C3619i0.f15677g;
        Observable take = m80768d.map(new InterfaceC23492o() { // from class: gS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m102186w4;
                m102186w4 = IT4.m102186w4(Function1.this, obj);
                return m102186w4;
            }
        }).take(1L);
        final C3621j0 c3621j0 = new C3621j0(this, wireRide, num);
        Observable<WireBird> flatMap = take.flatMap(new InterfaceC23492o() { // from class: hS4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102181x4;
                m102181x4 = IT4.m102181x4(Function1.this, obj);
                return m102181x4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun lockRideInte…tionRequired = !it) }\n  }");
        return flatMap;
    }

    @Override // p000.YR4
    /* renamed from: v */
    public void mo75026v(String scanId) {
        Intrinsics.checkNotNullParameter(scanId, "scanId");
        this.f15515D.set(scanId);
    }

    @Override // p000.YR4
    /* renamed from: v0 */
    public AbstractC23461c mo75025v0(final String rideId, final RideState.Status requestedState) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(requestedState, "requestedState");
        AbstractC23461c m33076J = AbstractC23461c.m33076J(new Runnable() { // from class: YS4
            @Override // java.lang.Runnable
            public final void run() {
                IT4.m102368E4(IT4.this, rideId, requestedState);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33076J, "fromRunnable {\n      if …to requestedState))\n    }");
        return m33076J;
    }

    @Override // p000.YR4
    /* renamed from: w */
    public Observable<WireBird> mo75024w(WireRide ride, Integer num) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        return m102202t3(m102196u4(ride, num), ride.getId(), RideState.Status.LOCKED);
    }

    /* renamed from: w5 */
    public final Observable<File> m102185w5(final byte[] bArr, final String str) {
        Observable<File> fromCallable = Observable.fromCallable(new Callable() { // from class: NS4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File m102180x5;
                m102180x5 = IT4.m102180x5(bArr, this, str);
                return m102180x5;
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromCallable, "fromCallable {\n        v…   }\n        file\n      }");
        return fromCallable;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    @Override // p000.YR4
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC23461c mo75023x(WireBird wireBird) {
        boolean z;
        String str;
        List<WirePhysicalLock> physicalLocks;
        boolean z2;
        if (wireBird != null && (physicalLocks = wireBird.getPhysicalLocks()) != null) {
            List<WirePhysicalLock> list = physicalLocks;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (WirePhysicalLock wirePhysicalLock : list) {
                    if (wirePhysicalLock.isEB100CableLock()) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (!z2) {
                z = true;
                if (z) {
                    if (wireBird != null) {
                        str = wireBird.getId();
                    } else {
                        str = null;
                    }
                    C41318g46.m40163a("no cable lock detected for bird " + str, new Object[0]);
                    AbstractC23461c m33080F = AbstractC23461c.m33080F(new NullPointerException("No EB100 physical lock was present for unlocking."));
                    Intrinsics.checkNotNullExpressionValue(m33080F, "error(NullPointerExcepti…present for unlocking.\"))");
                    return m33080F;
                } else if (!Intrinsics.areEqual(C36441Uq4.m80769c(this.f15527i, wireBird).getRideConfig().getSmartlockConfig().getEnableMechanicalCableLock(), Boolean.TRUE)) {
                    C41318g46.m40163a("unlock_mechanical_cable_in_ride config not enabled for this bird, returning now", new Object[0]);
                    AbstractC23461c m33080F2 = AbstractC23461c.m33080F(new IllegalStateException("Cannot unlock cable lock, enableMechanicalCableLock FF not enabled."));
                    Intrinsics.checkNotNullExpressionValue(m33080F2, "error(IllegalStateExcept…leLock FF not enabled.\"))");
                    return m33080F2;
                } else {
                    Bird m73313a = C10235ZK.m73313a(wireBird);
                    AbstractC23461c mo31812c = this.f15531m.mo31812c(m73313a, false);
                    final C3552F0 c3552f0 = C3552F0.f15571g;
                    AbstractC23461c m33081E = mo31812c.m33081E(new InterfaceC23484g() { // from class: QS4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IT4.m102284Z4(Function1.this, obj);
                        }
                    });
                    final C3555G0 c3555g0 = C3555G0.f15578g;
                    AbstractC23461c m33084B = m33081E.m33084B(new InterfaceC23484g() { // from class: SS4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IT4.m102280a5(Function1.this, obj);
                        }
                    });
                    final C3557H0 c3557h0 = C3557H0.f15581g;
                    AbstractC23461c mo31812c2 = this.f15531m.mo31812c(m73313a, true);
                    final C3559I0 c3559i0 = C3559I0.f15583g;
                    AbstractC23461c m33081E2 = mo31812c2.m33081E(new InterfaceC23484g() { // from class: US4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IT4.m102272c5(Function1.this, obj);
                        }
                    });
                    final C3562J0 c3562j0 = C3562J0.f15585g;
                    AbstractC23461c m33084B2 = m33081E2.m33084B(new InterfaceC23484g() { // from class: VS4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IT4.m102268d5(Function1.this, obj);
                        }
                    });
                    final C3564K0 c3564k0 = C3564K0.f15587g;
                    AbstractC23461c m33061Z = AbstractC23461c.m33051h(m33084B.m33067S(new InterfaceC23492o() { // from class: TS4
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h m102276b5;
                            m102276b5 = IT4.m102276b5(Function1.this, obj);
                            return m102276b5;
                        }
                    }), m33084B2.m33067S(new InterfaceC23492o() { // from class: WS4
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h m102264e5;
                            m102264e5 = IT4.m102264e5(Function1.this, obj);
                            return m102264e5;
                        }
                    })).m33061Z(10L, TimeUnit.SECONDS);
                    final C3566L0 c3566l0 = C3566L0.f15589g;
                    AbstractC23461c m33084B3 = m33061Z.m33084B(new InterfaceC23484g() { // from class: XS4
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            IT4.m102260f5(Function1.this, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(m33084B3, "ambArray(\n      commandM…e lock, returning now\") }");
                    return m33084B3;
                }
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // p000.YR4
    /* renamed from: y */
    public void mo75022y() {
        List<RideState> rideStates = this.f15543y.getValue().getRideStates();
        boolean z = false;
        if (!(rideStates instanceof Collection) || !rideStates.isEmpty()) {
            Iterator<T> it = rideStates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!RideStateKt.isInRide((RideState) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f15543y.m71837i(C3658z.f15736g);
        }
    }

    /* renamed from: y4 */
    public final Observable<WireBird> m102176y4(Observable<WireBird> observable, WireRide wireRide, WireBird wireBird, boolean z) {
        final C3623k0 c3623k0 = new C3623k0(this, wireRide, wireBird, z);
        Observable<WireBird> onErrorResumeNext = observable.onErrorResumeNext(new InterfaceC23492o() { // from class: GT4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m102172z4;
                m102172z4 = IT4.m102172z4(Function1.this, obj);
                return m102172z4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "private fun Observable<W…(error)\n      }\n    }\n  }");
        return onErrorResumeNext;
    }

    @Override // p000.YR4
    /* renamed from: z */
    public String mo75021z() {
        return this.f15515D.getAndSet(null);
    }

    @Override // p000.YR4
    /* renamed from: c */
    public Observable<WireRide> mo75052c(WireRide ride) {
        Intrinsics.checkNotNullParameter(ride, "ride");
        Observable<WireRide> m102348J4 = m102348J4(this.f15521c.m93931j(new RideIdBody(ride.getId(), null, null, 6, null)));
        Intrinsics.checkNotNullExpressionValue(m102348J4, "rideClient\n      .contin….id))\n      .schedulers()");
        return m102348J4;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lk66;", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1626:1\n1747#2,3:1627\n*S KotlinDebug\n*F\n+ 1 RideManagerImpl.kt\nco/bird/android/manager/ride/RideManagerImpl$2\n*L\n245#1:1627,3\n*E\n"})
    /* renamed from: IT4$k */
    /* loaded from: classes4.dex */
    public static final class C3622k extends Lambda implements Function1<List<? extends C43710k66>, Boolean> {

        /* renamed from: g */
        public static final C3622k f15682g = new C3622k();

        static {
        }

        public C3622k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<C43710k66> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List<C43710k66> list = it;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((C43710k66) it2.next()).m29282f()) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends C43710k66> list) {
            return invoke2((List<C43710k66>) list);
        }
    }
}
