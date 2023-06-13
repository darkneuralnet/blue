package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderItem;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderer;
import co.bird.android.buava.Optional;
import co.bird.android.core.base.viewmodel.C14451a;
import co.bird.android.core.base.viewmodel.C14452b;
import co.bird.android.feature.p010ar.view.ParkingStatusBottomSheetView;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.ParkingLocationSource;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.ParkingLocationVerificationConfig;
import co.bird.android.model.wire.configs.ParkingLocationVerificationMethod;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.gltfio.FilamentInstance;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p034ar.core.Anchor;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Earth;
import com.google.p034ar.core.GeospatialPose;
import com.google.p034ar.core.HitResult;
import com.google.p034ar.core.Pose;
import com.google.p034ar.core.VpsAvailability;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.github.sceneview.p052ar.arcore.ArSession;
import io.github.sceneview.p052ar.node.ArModelNode;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
import p000.C37791a94;
import p000.C41229fv6;
import p000.InterfaceC28816tm;
import p000.InterfaceC40099e13;
import p000.InterfaceC43018iw6;
import p000.SL4;
@Metadata(m28433d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0001\u000fB«\u0001\b\u0007\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010f\u001a\u00020d\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010n\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020o\u0012\u0006\u0010u\u001a\u00020s\u0012\u0006\u0010y\u001a\u00020v\u0012\u0006\u0010}\u001a\u00020z\u0012\u0007\u0010\u0081\u0001\u001a\u00020~\u0012\u0007\u0010\u0084\u0001\u001a\u00020\u0005\u0012\b\u0010\u0088\u0001\u001a\u00030\u0085\u0001\u0012\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001\u0012\b\u0010\u0090\u0001\u001a\u00030\u008d\u0001¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0014\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\b\u0010!\u001a\u00020\u0003H\u0002J\b\u0010\"\u001a\u00020\u0003H\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0002J&\u0010,\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020$H\u0002J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0002J\b\u0010.\u001a\u00020\u0003H\u0002J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u00103\u001a\u00020\u00032\u0006\u00102\u001a\u000201H\u0002J\u0010\u00104\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0002J\f\u00106\u001a\u000205*\u000205H\u0002J\b\u00107\u001a\u00020\u0003H\u0002J\u001c\u0010:\u001a\u00020\u0003*\u00020\u00052\u0006\u00109\u001a\u0002082\u0006\u0010\u0019\u001a\u000205H\u0002J\u001c\u0010=\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002050<2\u0006\u0010;\u001a\u000205H\u0002J\u001c\u0010?\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002050<2\u0006\u0010>\u001a\u000205H\u0002J\u0016\u0010@\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0018\u00010<H\u0002J\b\u0010A\u001a\u00020\u0003H\u0002J\b\u0010B\u001a\u00020\u0003H\u0002J\b\u0010C\u001a\u00020\u0003H\u0002J,\u0010G\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u00102\u001a\u0002012\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002R\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020$0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R\u0019\u0010\u0099\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R \u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0093\u0001R\u0018\u0010\u009d\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u00100R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¤\u0001\u001a\u00020$8B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u0098\u0001\u001a\u0006\b\u0097\u0001\u0010£\u0001R\u001d\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020$0¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010¦\u0001R\u001f\u0010ª\u0001\u001a\u000b ¨\u0001*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010©\u0001R&\u0010\u00ad\u0001\u001a\u0012\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010\u00130\u00130«\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010¬\u0001R\u0016\u0010\u0011\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010±\u0001R\u0017\u0010´\u0001\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010\u0098\u0001R\u0019\u0010·\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010¶\u0001R\u0019\u0010º\u0001\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001d\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020$0¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010¦\u0001R\u001e\u0010½\u0001\u001a\t\u0012\u0004\u0012\u0002010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¦\u0001R\u001d\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020$0¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010¦\u0001R\u001e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020'0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010¦\u0001R%\u0010Ã\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Á\u00010D0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010¦\u0001R$\u0010Å\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ä\u00010D0¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010¦\u0001R!\u0010Ê\u0001\u001a\u00030Æ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\b\u009f\u0001\u0010É\u0001R\u008b\u0001\u0010Î\u0001\u001an\u0012i\u0012g\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010$0$\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010101\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010$0$ ¨\u0001*2\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010$0$\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010101\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010$0$\u0018\u00010Ì\u00010Ì\u00010Ë\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b-\u0010È\u0001\u001a\u0006\b¢\u0001\u0010Í\u0001R\u001e\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Ï\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010¦\u0001R\u001b\u0010Ó\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\b\u0010Ò\u0001R\u001b\u0010Ö\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010Õ\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010×\u0001¨\u0006Ü\u0001²\u0006\u000e\u0010*\u001a\u0004\u0018\u00010)8\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020'8\nX\u008a\u0084\u0002²\u0006\r\u0010Û\u0001\u001a\u0002058\nX\u008a\u0084\u0002"}, m28432d2 = {"Lfv6;", "Landroid/hardware/SensorEventListener;", "Liw6;", "", "W", "LcD1;", "map", "Y", "X", "V", "Lio/github/sceneview/ar/arcore/ArSession;", "session", "m", "", "exception", C17296a.f69688o, "Lcom/google/ar/core/Config;", "config", "i", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "Lorg/joda/time/DateTime;", "startTime", "c0", "J", "H", "M", "P", "F", "k0", "", "parkingStatusCanPark", "j0", "LSL4;", "resolvedLocation", "LbF0;", "currentParkingNest", "viaSkipBirdFlow", "g0", "U", "d0", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "LFH3;", "parkingStatus", "s0", "p0", "", "E", "q0", "Lcom/google/android/gms/maps/model/LatLng;", "position", "r0", "earthAccuracy", "Lkotlin/Pair;", "t0", "gpsAccuracy", "B", "x", "S", "o0", "m0", "Lco/bird/android/buava/Optional;", "", "barcodes", "e0", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "handler", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lrv6;", "e", "Lrv6;", "ui", "Le13;", "f", "Le13;", "navigator", "Lgl;", "g", "Lgl;", "appPreference", "LTq4;", "h", "LTq4;", "reactiveConfig", "Ldr4;", "Ldr4;", "locationManager", "Landroid/hardware/SensorManager;", "j", "Landroid/hardware/SensorManager;", "sensorManager", "LEa;", "k", "LEa;", "analyticsManager", "LDQ3;", "l", "LDQ3;", "permissionManager", "LYR4;", "LYR4;", "rideManager", "LoF3;", "n", "LoF3;", "parkingManager", "Ltm;", "o", "Ltm;", "arManager", "Lbn;", "p", "Lbn;", "areaManager", "q", "LcD1;", "googleMap", "Lco/bird/android/model/wire/WireRide;", "r", "Lco/bird/android/model/wire/WireRide;", "ride", "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;", "s", "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;", "polygonableRenderer", "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;", "t", "Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;", "parkingNestRenderer", "Lcom/google/common/util/concurrent/SettableFuture;", "u", "Lcom/google/common/util/concurrent/SettableFuture;", "isArCoreAvailable", "v", "isGeospatialModeSupported", "w", "Z", "isGeospatialModeAvailableAtCurrentLocation", "Lcom/google/ar/core/VpsAvailability;", "geospatialAvailability", "y", "bestAccuracyMeters", "Lio/reactivex/disposables/c;", "z", "Lio/reactivex/disposables/c;", "timeoutTimerDisposable", "A", "()Z", "canSkipBirdScanOneTime", "La94;", "La94;", "useEarthPoseLocation", "kotlin.jvm.PlatformType", "Landroid/hardware/Sensor;", "sensorOrientation", "Lma4;", "Lma4;", "sensorEventRelay", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "parkingLocationVerificationConfig", "G", "resultRequired", "", "Ljava/lang/Long;", "timeoutSeconds", "I", "Ljava/lang/Boolean;", "skipBirdScan", "hasMetAccuracyRequirementRelay", "K", "parkingStateRelay", "hasScannedBarcodeRelay", "Q", "resolvedLocationRelay", "Lco/bird/android/model/wire/WireLocation;", "R", "currentNestAnchorLocationRelay", "Lcom/google/ar/core/Anchor;", "currentNestAnchorRelay", "Lio/github/sceneview/ar/node/ArModelNode;", "T", "Lkotlin/Lazy;", "()Lio/github/sceneview/ar/node/ArModelNode;", "nestArModelNode", "LZ84;", "Lkotlin/Triple;", "()LZ84;", "scanModePropertyObservable", "LEH3;", "scanModeStateRelay", "LfM2;", "LfM2;", "locationMarker", "Lxj0;", "Lxj0;", "radiusCircle", "Lorg/joda/time/DateTime;", "startScanningTime", "<init>", "(Landroid/content/Context;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;Lrv6;Le13;Lgl;LTq4;Ldr4;Landroid/hardware/SensorManager;LEa;LDQ3;LYR4;LoF3;Ltm;Lbn;LcD1;Lco/bird/android/model/wire/WireRide;Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V", "timeScanningSeconds", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1138:1\n180#2:1139\n180#2:1140\n237#2:1141\n180#2:1144\n180#2:1145\n180#2:1146\n180#2:1147\n218#2:1161\n199#2:1162\n52#3,2:1142\n1#4:1148\n1549#5:1149\n1620#5,3:1150\n1549#5:1153\n1620#5,3:1154\n1549#5:1157\n1620#5,3:1158\n*S KotlinDebug\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter\n*L\n315#1:1139\n361#1:1140\n509#1:1141\n520#1:1144\n549#1:1145\n555#1:1146\n599#1:1147\n1009#1:1161\n1035#1:1162\n514#1:1142,2\n899#1:1149\n899#1:1150,3\n907#1:1153\n907#1:1154,3\n913#1:1157\n913#1:1158,3\n*E\n"})
/* renamed from: fv6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41229fv6 implements SensorEventListener, InterfaceC43018iw6 {

    /* renamed from: p0 */
    public static final C20632a f81094p0 = new C20632a(null);

    /* renamed from: A */
    public boolean f81095A;

    /* renamed from: B */
    public final C37791a94<Boolean> f81096B;

    /* renamed from: C */
    public final Sensor f81097C;

    /* renamed from: D */
    public final C45168ma4<SensorEvent> f81098D;

    /* renamed from: E */
    public final Config f81099E;

    /* renamed from: F */
    public final ParkingLocationVerificationConfig f81100F;

    /* renamed from: G */
    public final boolean f81101G;

    /* renamed from: H */
    public final Long f81102H;

    /* renamed from: I */
    public final Boolean f81103I;

    /* renamed from: J */
    public final C37791a94<Boolean> f81104J;

    /* renamed from: K */
    public final C37791a94<FH3> f81105K;

    /* renamed from: P */
    public final C37791a94<Boolean> f81106P;

    /* renamed from: Q */
    public final C37791a94<SL4> f81107Q;

    /* renamed from: R */
    public final C37791a94<Optional<WireLocation>> f81108R;

    /* renamed from: S */
    public final C37791a94<Optional<Anchor>> f81109S;

    /* renamed from: T */
    public final Lazy f81110T;

    /* renamed from: U */
    public final Lazy f81111U;

    /* renamed from: W */
    public final C37791a94<EH3> f81112W;

    /* renamed from: X */
    public C40889fM2 f81113X;

    /* renamed from: Y */
    public C51775xj0 f81114Y;

    /* renamed from: Z */
    public DateTime f81115Z;

    /* renamed from: b */
    public final Context f81116b;

    /* renamed from: c */
    public final Handler f81117c;

    /* renamed from: d */
    public final ScopeProvider f81118d;

    /* renamed from: e */
    public final C48345rv6 f81119e;

    /* renamed from: f */
    public final InterfaceC40099e13 f81120f;

    /* renamed from: g */
    public final C22454gl f81121g;

    /* renamed from: h */
    public final C36207Tq4 f81122h;

    /* renamed from: i */
    public final InterfaceC40001dr4 f81123i;

    /* renamed from: j */
    public final SensorManager f81124j;

    /* renamed from: k */
    public final InterfaceC1880Ea f81125k;

    /* renamed from: l */
    public final DQ3 f81126l;

    /* renamed from: m */
    public final YR4 f81127m;

    /* renamed from: n */
    public final InterfaceC46164oF3 f81128n;

    /* renamed from: o */
    public final InterfaceC28816tm f81129o;

    /* renamed from: p */
    public final InterfaceC12495bn f81130p;

    /* renamed from: q */
    public final C39011cD1 f81131q;

    /* renamed from: r */
    public final WireRide f81132r;

    /* renamed from: s */
    public final MapPolygonableRenderer f81133s;

    /* renamed from: t */
    public final ParkingNestRenderer f81134t;

    /* renamed from: u */
    public SettableFuture<Boolean> f81135u;

    /* renamed from: v */
    public final SettableFuture<Boolean> f81136v;

    /* renamed from: w */
    public boolean f81137w;

    /* renamed from: x */
    public SettableFuture<VpsAvailability> f81138x;

    /* renamed from: y */
    public double f81139y;

    /* renamed from: z */
    public InterfaceC23465c f81140z;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Lfv6$a;", "", "", "CLOSE_DOWN_DELAY_MILLISECONDS", "J", "CLOSE_DOWN_VIA_SKIP_DELAY_MILLISECONDS", "", "DEFAULT_NODE_ALTITUDE_ABOVE_TERRAIN", "D", "FALLBACK_TIMEOUT", "", "MAP_TILT_DEGREES", "F", "MAP_ZOOM_LEVEL", "", "MAX_MAP_AREAS", "I", "MAX_MAP_NESTS", "MINIMUM_SCAN_TIME_SECONDS_FOR_UX", "<init>", "()V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: fv6$a */
    /* loaded from: classes3.dex */
    public static final class C20632a {
        public /* synthetic */ C20632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20632a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fv6$b */
    /* loaded from: classes3.dex */
    public static final class C20633b extends Lambda implements Function0<Double> {

        /* renamed from: g */
        public final /* synthetic */ DateTime f81141g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20633b(DateTime dateTime) {
            super(0);
            this.f81141g = dateTime;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            DateTime dateTime = this.f81141g;
            Intrinsics.checkNotNull(dateTime);
            return Double.valueOf(C46880pT0.m19253i(now, dateTime));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/VpsAvailability;", "vpsAvailability", "", C17296a.f69688o, "(Lcom/google/ar/core/VpsAvailability;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$c */
    /* loaded from: classes3.dex */
    public static final class C20634c extends Lambda implements Function1<VpsAvailability, Unit> {
        public C20634c() {
            super(1);
        }

        /* renamed from: a */
        public final void m40474a(VpsAvailability vpsAvailability) {
            Intrinsics.checkNotNullParameter(vpsAvailability, "vpsAvailability");
            boolean z = false;
            C41318g46.m40163a("vps availability returned " + vpsAvailability, new Object[0]);
            C41229fv6 c41229fv6 = C41229fv6.this;
            if (vpsAvailability == VpsAvailability.AVAILABLE) {
                z = true;
            }
            c41229fv6.f81137w = z;
            C41229fv6.this.f81138x.set(vpsAvailability);
            if (!C41229fv6.this.f81137w) {
                C41229fv6.this.f81129o.mo8192c(ParkingLocationVerificationMethod.GOOGLE_VPS_V2, C41229fv6.this.f81132r.getId(), C41229fv6.this.f81132r.getBirdId(), "api");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VpsAvailability vpsAvailability) {
            m40474a(vpsAvailability);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: fv6$d */
    /* loaded from: classes3.dex */
    public static final class C20635d<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C20635d<T1, T2, R> f81143a = new C20635d<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u008f\u0001\u0010\u0006\u001a\u008a\u0001\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001 \u0004*D\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "LBx;", "kotlin.jvm.PlatformType", "Lp06;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$listenForBarcodeUpdates$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1138:1\n1#2:1139\n288#3,2:1140\n*S KotlinDebug\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$listenForBarcodeUpdates$1\n*L\n525#1:1140,2\n*E\n"})
    /* renamed from: fv6$e */
    /* loaded from: classes3.dex */
    public static final class C20636e extends Lambda implements Function1<Pair<? extends Optional<List<? extends C0774Bx>>, ? extends Optional<C46615p06>>, Unit> {
        public C20636e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<List<? extends C0774Bx>>, ? extends Optional<C46615p06>> pair) {
            invoke2((Pair<Optional<List<C0774Bx>>, Optional<C46615p06>>) pair);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
            r1 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r1, null, null, null, 0, null, null, 63, null);
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x009c A[EDGE_INSN: B:60:0x009c->B:33:0x009c ?: BREAK  , SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Pair<Optional<List<C0774Bx>>, Optional<C46615p06>> pair) {
            C0774Bx c0774Bx;
            boolean z;
            String m20167a;
            String joinToString$default;
            String code;
            String m20167a2;
            boolean contains;
            Object obj;
            boolean z2;
            boolean z3;
            boolean contains$default;
            Optional<C46615p06> component2 = pair.component2();
            List<C0774Bx> m59035e = pair.component1().m59035e();
            Boolean bool = null;
            if (!((FH3) C41229fv6.this.f81105K.getValue()).mo11125b()) {
                m59035e = null;
            }
            List<C0774Bx> list = m59035e;
            C46615p06 m59035e2 = component2.m59035e();
            if (!((FH3) C41229fv6.this.f81105K.getValue()).mo11125b()) {
                m59035e2 = null;
            }
            C46615p06 c46615p06 = m59035e2;
            boolean z4 = true;
            if (list != null) {
                C41229fv6 c41229fv6 = C41229fv6.this;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String barcode = ((C0774Bx) obj).m113296e();
                    if (barcode != null) {
                        C33894Jt4 c33894Jt4 = C33894Jt4.f18402a;
                        Intrinsics.checkNotNullExpressionValue(barcode, "barcode");
                        if (c33894Jt4.m99597e(barcode) != null) {
                            WireBird bird = c41229fv6.f81132r.getBird();
                            String stickerId = bird != null ? bird.getStickerId() : null;
                            Intrinsics.checkNotNull(stickerId);
                            contains$default = StringsKt__StringsKt.contains$default((CharSequence) barcode, (CharSequence) stickerId, false, 2, (Object) null);
                            if (contains$default) {
                                z3 = true;
                                if (z3) {
                                    z2 = true;
                                    continue;
                                    if (z2) {
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                    z2 = false;
                    continue;
                    if (z2) {
                    }
                }
                c0774Bx = (C0774Bx) obj;
            } else {
                c0774Bx = null;
            }
            WireBird bird2 = C41229fv6.this.f81132r.getBird();
            if (bird2 == null || (code = bird2.getCode()) == null) {
                z = false;
            } else {
                if (c46615p06 != null && (m20167a2 = c46615p06.m20167a()) != null) {
                    contains = StringsKt__StringsKt.contains((CharSequence) m20167a2, (CharSequence) code, true);
                    bool = Boolean.valueOf(contains);
                }
                z = Intrinsics.areEqual(bool, Boolean.TRUE);
            }
            if (list != null && joinToString$default != null) {
                C41318g46.m40163a("barcodes parsed: " + joinToString$default + "\nmatchedBarcode:" + c0774Bx, new Object[0]);
            }
            if (c46615p06 != null && (m20167a = c46615p06.m20167a()) != null) {
                C41318g46.m40163a("text parsed: " + m20167a + "\nmatchedCode:" + z, new Object[0]);
            }
            C37791a94 c37791a94 = C41229fv6.this.f81106P;
            if (c0774Bx == null && !z) {
                z4 = false;
            }
            c37791a94.accept(Boolean.valueOf(z4));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "useEarthPoseLocation", "Lio/reactivex/B;", "Lkotlin/Pair;", "LSL4;", "LFH3;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$listenForLocationUpdates$1\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,1138:1\n61#2,2:1139\n*S KotlinDebug\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$listenForLocationUpdates$1\n*L\n421#1:1139,2\n*E\n"})
    /* renamed from: fv6$f */
    /* loaded from: classes3.dex */
    public static final class C20637f extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Pair<? extends SL4, ? extends FH3>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "event", "Landroid/hardware/SensorEvent;", "invoke", "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fv6$f$a */
        /* loaded from: classes3.dex */
        public static final class C20638a extends Lambda implements Function1<SensorEvent, Float> {

            /* renamed from: g */
            public static final C20638a f81146g = new C20638a();

            public C20638a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Float invoke(SensorEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return Float.valueOf(event.values[0]);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "degree", "", "invoke", "(Ljava/lang/Float;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fv6$f$b */
        /* loaded from: classes3.dex */
        public static final class C20639b extends Lambda implements Function1<Float, Boolean> {

            /* renamed from: g */
            public static final C20639b f81147g = new C20639b();

            public C20639b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Float degree) {
                Intrinsics.checkNotNullParameter(degree, "degree");
                return Boolean.valueOf(!Float.isNaN(degree.floatValue()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "degree", "invoke", "(Ljava/lang/Float;)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fv6$f$c */
        /* loaded from: classes3.dex */
        public static final class C20640c extends Lambda implements Function1<Float, Float> {

            /* renamed from: g */
            public final /* synthetic */ C41229fv6 f81148g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20640c(C41229fv6 c41229fv6) {
                super(1);
                this.f81148g = c41229fv6;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Float invoke(Float degree) {
                Intrinsics.checkNotNullParameter(degree, "degree");
                return Float.valueOf(degree.floatValue() + C47159pv6.m18426a(this.f81148g.f81124j, this.f81148g.f81123i.mo43616p().m73665a()).getDeclination());
            }
        }

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t \u0003*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/Earth;", "kotlin.jvm.PlatformType", "Landroid/location/Location;", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "LSL4;", "LFH3;", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$listenForLocationUpdates$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1138:1\n1#2:1139\n*E\n"})
        /* renamed from: fv6$f$d */
        /* loaded from: classes3.dex */
        public static final class C20641d extends Lambda implements Function1<Triple<? extends Optional<Earth>, ? extends Location, ? extends Float>, Pair<? extends SL4, ? extends FH3>> {

            /* renamed from: g */
            public final /* synthetic */ C41229fv6 f81149g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20641d(C41229fv6 c41229fv6) {
                super(1);
                this.f81149g = c41229fv6;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<SL4, FH3> invoke(Triple<Optional<Earth>, ? extends Location, Float> triple) {
                GeospatialPose geospatialPose;
                Pair m28425to;
                Double d;
                boolean z;
                Boolean bool;
                Boolean bool2;
                ParkingLocationSource parkingLocationSource;
                Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                Location component2 = triple.component2();
                Float component3 = triple.component3();
                Earth m59035e = triple.component1().m59035e();
                if (m59035e != null) {
                    geospatialPose = m59035e.getCameraGeospatialPose();
                } else {
                    geospatialPose = null;
                }
                if (geospatialPose == null || (m28425to = this.f81149g.m40481t0(geospatialPose.getHorizontalAccuracy())) == null) {
                    m28425to = TuplesKt.m28425to(Boolean.FALSE, Double.valueOf(0.0d));
                }
                boolean booleanValue = ((Boolean) m28425to.component1()).booleanValue();
                double doubleValue = ((Number) m28425to.component2()).doubleValue();
                Pair m40538B = this.f81149g.m40538B(component2.getAccuracy());
                boolean booleanValue2 = ((Boolean) m40538B.component1()).booleanValue();
                double doubleValue2 = ((Number) m40538B.component2()).doubleValue();
                if (geospatialPose != null) {
                    double heading = geospatialPose.getHeading();
                    if (heading < 0.0d) {
                        heading += 360.0d;
                    }
                    d = Double.valueOf(heading + C47159pv6.m18426a(this.f81149g.f81124j, component2).getDeclination());
                } else {
                    d = null;
                }
                SL4.C7379a c7379a = SL4.f33487p;
                Double valueOf = Double.valueOf(component3.floatValue());
                if (valueOf.doubleValue() > 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    valueOf = null;
                }
                boolean z2 = this.f81149g.f81137w;
                try {
                    bool = (Boolean) this.f81149g.f81136v.get();
                } catch (Throwable unused) {
                    bool = Boolean.FALSE;
                }
                Intrinsics.checkNotNullExpressionValue(bool, "try { isGeospatialModeSu…h(e: Throwable) { false }");
                boolean booleanValue3 = bool.booleanValue();
                try {
                    bool2 = (Boolean) this.f81149g.f81135u.get();
                } catch (Throwable unused2) {
                    bool2 = Boolean.FALSE;
                }
                Intrinsics.checkNotNullExpressionValue(bool2, "try { isArCoreAvailable.…h (e: Throwable) { false}");
                SL4 m85712a = c7379a.m85712a(geospatialPose, doubleValue, booleanValue, component2, doubleValue2, booleanValue2, d, valueOf, z2, booleanValue3, bool2.booleanValue());
                this.f81149g.m40519U(m85712a);
                InterfaceC46164oF3 interfaceC46164oF3 = this.f81149g.f81128n;
                String id = this.f81149g.f81132r.getId();
                Location m85714j = m85712a.m85714j();
                if (Intrinsics.areEqual(this.f81149g.f81103I, Boolean.TRUE)) {
                    parkingLocationSource = ParkingLocationSource.USER;
                } else {
                    parkingLocationSource = ParkingLocationSource.VEHICLE;
                }
                FH3 mo21506c = interfaceC46164oF3.mo21506c(id, m85714j, parkingLocationSource);
                if (mo21506c == null) {
                    mo21506c = new C44617le6(this.f81149g.f81132r.getId(), null, null, false, 6, null);
                }
                return TuplesKt.m28425to(m85712a, mo21506c);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LSL4;", "LFH3;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fv6$f$e */
        /* loaded from: classes3.dex */
        public static final class C20642e extends Lambda implements Function1<Pair<? extends SL4, ? extends FH3>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C41229fv6 f81150g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20642e(C41229fv6 c41229fv6) {
                super(1);
                this.f81150g = c41229fv6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends SL4, ? extends FH3> pair) {
                invoke2((Pair<SL4, ? extends FH3>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<SL4, ? extends FH3> pair) {
                SL4 component1 = pair.component1();
                FH3 component2 = pair.component2();
                this.f81150g.m40488p0(component1);
                this.f81150g.f81107Q.accept(component1);
                this.f81150g.f81104J.accept(Boolean.valueOf(component1.m85717g()));
                this.f81150g.m40483s0(component2);
                this.f81150g.f81105K.accept(component2);
                C41229fv6.m40505f0(this.f81150g, component1, component2, null, 4, null);
                if (component1.m85719e() < this.f81150g.f81139y) {
                    this.f81150g.f81139y = component1.m85719e();
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
        /* renamed from: fv6$f$f */
        /* loaded from: classes3.dex */
        public static final class C20643f<T1, T2, T3, R> implements InterfaceC23485h {

            /* renamed from: a */
            public static final C20643f<T1, T2, T3, R> f81151a = new C20643f<>();

            @Override // io.reactivex.functions.InterfaceC23485h
            /* renamed from: a */
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                return new Triple<>(t1, t2, t3);
            }
        }

        public C20637f() {
            super(1);
        }

        /* renamed from: f */
        public static final Float m40467f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Float) tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final boolean m40466g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: h */
        public static final Float m40465h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Float) tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final Pair m40464i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final void m40463j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<SL4, FH3>> invoke(Boolean useEarthPoseLocation) {
            Intrinsics.checkNotNullParameter(useEarthPoseLocation, "useEarthPoseLocation");
            if (!useEarthPoseLocation.booleanValue()) {
                C41318g46.m40163a("registering listener for orientation changes since earth pose location not enabled", new Object[0]);
                SensorManager sensorManager = C41229fv6.this.f81124j;
                C41229fv6 c41229fv6 = C41229fv6.this;
                sensorManager.registerListener(c41229fv6, c41229fv6.f81097C, 1);
            } else {
                C41318g46.m40163a("unregistering listener for orientation changes since earth pose location is enabled", new Object[0]);
                C41229fv6.this.f81124j.unregisterListener(C41229fv6.this);
            }
            C40463ee3 c40463ee3 = C40463ee3.f78649a;
            Z84<Optional<Earth>> m58850T0 = C41229fv6.this.f81119e.m15078Tl().m58850T0();
            Z84<Location> mo43616p = C41229fv6.this.f81123i.mo43616p();
            Observable<T> observeOn = C41229fv6.this.f81098D.observeOn(C24542a.m31934a());
            final C20638a c20638a = C20638a.f81146g;
            Observable map = observeOn.map(new InterfaceC23492o() { // from class: gv6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Float m40467f;
                    m40467f = C41229fv6.C20637f.m40467f(Function1.this, obj);
                    return m40467f;
                }
            });
            final C20639b c20639b = C20639b.f81147g;
            Observable filter = map.filter(new InterfaceC23494q() { // from class: hv6
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m40466g;
                    m40466g = C41229fv6.C20637f.m40466g(Function1.this, obj);
                    return m40466g;
                }
            });
            final C20640c c20640c = new C20640c(C41229fv6.this);
            Observable startWith = filter.map(new InterfaceC23492o() { // from class: iv6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Float m40465h;
                    m40465h = C41229fv6.C20637f.m40465h(Function1.this, obj);
                    return m40465h;
                }
            }).startWith((Observable) Float.valueOf(-1.0f));
            Intrinsics.checkNotNullExpressionValue(startWith, "private fun listenForLoc…r)\n      .subscribe()\n  }");
            Observable combineLatest = Observable.combineLatest(m58850T0, mo43616p, startWith, C20643f.f81151a);
            Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
            AbstractC24490k m32111s0 = combineLatest.toFlowable(EnumC23460b.LATEST).m32125n1(100L, TimeUnit.MILLISECONDS, true).m32111s0(C24542a.m31934a());
            final C20641d c20641d = new C20641d(C41229fv6.this);
            AbstractC24490k m32111s02 = m32111s0.m32117q0(new InterfaceC23492o() { // from class: jv6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m40464i;
                    m40464i = C41229fv6.C20637f.m40464i(Function1.this, obj);
                    return m40464i;
                }
            }).m32111s0(C23454a.m33087a());
            final C20642e c20642e = new C20642e(C41229fv6.this);
            return m32111s02.m32191K(new InterfaceC23484g() { // from class: kv6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41229fv6.C20637f.m40463j(Function1.this, obj);
                }
            }).m32113r1();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fv6$g */
    /* loaded from: classes3.dex */
    public static final class C20644g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20644g f81152g = new C20644g();

        public C20644g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Exception while setting location source in vps parking presenter: ", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LFH3;", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFH3;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$h */
    /* loaded from: classes3.dex */
    public static final class C20645h extends Lambda implements Function1<FH3, Optional<WireLocation>> {

        /* renamed from: g */
        public static final C20645h f81153g = new C20645h();

        public C20645h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireLocation> invoke(FH3 it) {
            WireLocation wireLocation;
            ParkingNest m64762e;
            Intrinsics.checkNotNullParameter(it, "it");
            Optional.C14443a c14443a = Optional.f63040c;
            C38435bF0 mo11124c = it.mo11124c();
            if (mo11124c != null && (m64762e = mo11124c.m64762e()) != null) {
                wireLocation = m64762e.getLocation();
            } else {
                wireLocation = null;
            }
            return c14443a.m59033b(wireLocation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "optionalNestLocation", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$i */
    /* loaded from: classes3.dex */
    public static final class C20646i extends Lambda implements Function1<Optional<WireLocation>, Unit> {
        public C20646i() {
            super(1);
        }

        /* renamed from: a */
        public final void m40459a(Optional<WireLocation> optional) {
            Anchor createAnchor;
            C37791a94 c37791a94 = C41229fv6.this.f81109S;
            Optional.C14443a c14443a = Optional.f63040c;
            WireLocation m59035e = optional.m59035e();
            Anchor anchor = null;
            if (m59035e != null) {
                C41229fv6 c41229fv6 = C41229fv6.this;
                C41318g46.m40163a("attempting to set nest anchor from loc=" + m59035e, new Object[0]);
                if (c41229fv6.f81137w) {
                    Earth m59035e2 = c41229fv6.f81119e.m15078Tl().m58850T0().getValue().m59035e();
                    if (m59035e2 != null) {
                        createAnchor = m59035e2.resolveAnchorOnTerrain(m59035e.getLatitude(), m59035e.getLongitude(), 2.0d, 1.0f, 0.0f, 0.0f, 0.0f);
                        anchor = createAnchor;
                    }
                } else {
                    Earth m59035e3 = c41229fv6.f81119e.m15078Tl().m58850T0().getValue().m59035e();
                    if (m59035e3 != null) {
                        createAnchor = m59035e3.createAnchor(m59035e.getLatitude(), m59035e.getLongitude(), 0.5d + m59035e3.getCameraGeospatialPose().getAltitude(), 1.0f, 0.0f, 0.0f, 0.0f);
                        anchor = createAnchor;
                    }
                }
            }
            c37791a94.accept(c14443a.m59033b(anchor));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireLocation> optional) {
            m40459a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/Anchor;", "optionalAnchor", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$j */
    /* loaded from: classes3.dex */
    public static final class C20647j extends Lambda implements Function1<Optional<Anchor>, InterfaceC23447K<? extends Optional<Anchor>>> {

        /* renamed from: g */
        public static final C20647j f81155g = new C20647j();

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fv6$j$a */
        /* loaded from: classes3.dex */
        public static final class C20648a extends Lambda implements Function1<Long, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Anchor f81156g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20648a(Anchor anchor) {
                super(1);
                this.f81156g = anchor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(this.f81156g.getTerrainAnchorState() == Anchor.TerrainAnchorState.SUCCESS || this.f81156g.getTerrainAnchorState() == Anchor.TerrainAnchorState.NONE);
            }
        }

        public C20647j() {
            super(1);
        }

        /* renamed from: d */
        public static final Optional m40455d(Anchor anchor) {
            Intrinsics.checkNotNullParameter(anchor, "$anchor");
            return Optional.f63040c.m59032c(anchor);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Optional<Anchor>> invoke(Optional<Anchor> optionalAnchor) {
            Intrinsics.checkNotNullParameter(optionalAnchor, "optionalAnchor");
            final Anchor m59035e = optionalAnchor.m59035e();
            if (m59035e == null) {
                return AbstractC23442F.m33158H(Optional.f63040c.m59034a());
            }
            Pose pose = m59035e.getPose();
            C41318g46.m40163a("currentNestAnchor=" + pose, new Object[0]);
            Observable<Long> interval = Observable.interval(200L, TimeUnit.MILLISECONDS, C24542a.m31932c());
            final C20648a c20648a = new C20648a(m59035e);
            return interval.takeUntil(new InterfaceC23494q() { // from class: lv6
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = C41229fv6.C20647j.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).ignoreElements().m33048i0(new Callable() { // from class: mv6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Optional m40455d;
                    m40455d = C41229fv6.C20647j.m40455d(Anchor.this);
                    return m40455d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/Anchor;", "kotlin.jvm.PlatformType", "optionalAnchor", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$k */
    /* loaded from: classes3.dex */
    public static final class C20649k extends Lambda implements Function1<Optional<Anchor>, Unit> {
        public C20649k() {
            super(1);
        }

        /* renamed from: a */
        public final void m40454a(Optional<Anchor> optional) {
            Anchor m59035e = optional.m59035e();
            if (m59035e == null) {
                C41318g46.m40163a("clearing node model and anchor now", new Object[0]);
                C41229fv6.this.m40475z().m33317s1(null);
                return;
            }
            C41318g46.m40163a("setting node model and anchor now", new Object[0]);
            C41229fv6.this.m40475z().m33317s1(m59035e);
            C41229fv6.this.f81119e.m15078Tl().setSelectedNode(C41229fv6.this.m40475z());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Anchor> optional) {
            m40454a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$l */
    /* loaded from: classes3.dex */
    public static final class C20650l extends Lambda implements Function1<Long, Unit> {
        public C20650l() {
            super(1);
        }

        /* renamed from: a */
        public final void m40453a(Long l) {
            C41229fv6.this.m40494m0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m40453a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/github/sceneview/ar/node/ArModelNode;", "b", "()Lio/github/sceneview/ar/node/ArModelNode;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$m */
    /* loaded from: classes3.dex */
    public static final class C20651m extends Lambda implements Function0<ArModelNode> {

        /* renamed from: g */
        public static final C20651m f81159g = new C20651m();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "", C17296a.f69688o, "(Ljava/lang/Exception;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fv6$m$a */
        /* loaded from: classes3.dex */
        public static final class C20652a extends Lambda implements Function1<Exception, Unit> {

            /* renamed from: g */
            public static final C20652a f81160g = new C20652a();

            public C20652a() {
                super(1);
            }

            /* renamed from: a */
            public final void m40451a(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C41318g46.m40161c(it, "error loading glb asset for nest ar model node", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                m40451a(exc);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/google/android/filament/gltfio/FilamentInstance;", "Lio/github/sceneview/model/ModelInstance;", RequestHeadersFactory.MODEL, "", C17296a.f69688o, "(Lcom/google/android/filament/gltfio/FilamentInstance;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fv6$m$b */
        /* loaded from: classes3.dex */
        public static final class C20653b extends Lambda implements Function1<FilamentInstance, Unit> {

            /* renamed from: g */
            public static final C20653b f81161g = new C20653b();

            public C20653b() {
                super(1);
            }

            /* renamed from: a */
            public final void m40450a(FilamentInstance model) {
                Intrinsics.checkNotNullParameter(model, "model");
                C41318g46.m40163a("loaded glb asset successfully for nest ar model node: " + model, new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FilamentInstance filamentInstance) {
                m40450a(filamentInstance);
                return Unit.INSTANCE;
            }
        }

        public C20651m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ArModelNode invoke() {
            C41318g46.m40163a("creating Ar Model Node", new Object[0]);
            ArModelNode arModelNode = new ArModelNode(YU3.BEST_AVAILABLE, (C42400hu1) null, false, false, 6, (DefaultConstructorMarker) null);
            arModelNode.m33316t1(true);
            arModelNode.m33313w1(false);
            arModelNode.m33285Z0("models/bird_sphere.glb", true, Float.valueOf(1.0f), new C42400hu1(0.0f, 0.0f, 0.0f, 5, null), C20652a.f81160g, C20653b.f81161g);
            return arModelNode;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aN\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u000020\u0010\u0004\u001a,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "LFH3;", "it", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$n */
    /* loaded from: classes3.dex */
    public static final class C20654n extends Lambda implements Function1<Triple<? extends Boolean, ? extends FH3, ? extends Boolean>, Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>> {

        /* renamed from: g */
        public static final C20654n f81162g = new C20654n();

        public C20654n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<Boolean, Boolean, Boolean> invoke(Triple<Boolean, ? extends FH3, Boolean> it) {
            C44617le6 c44617le6;
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            Boolean first = it.getFirst();
            boolean z2 = false;
            if (it.getSecond().mo11125b()) {
                FH3 second = it.getSecond();
                if (second instanceof C44617le6) {
                    c44617le6 = (C44617le6) second;
                } else {
                    c44617le6 = null;
                }
                if (c44617le6 != null && !c44617le6.m27047g()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = true;
                }
            }
            return new Triple<>(first, Boolean.valueOf(z2), it.getThird());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042R\u0010\u0003\u001aN\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$o */
    /* loaded from: classes3.dex */
    public static final class C20655o extends Lambda implements Function1<Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LbF0;", "b", "()LbF0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fv6$o$a */
        /* loaded from: classes3.dex */
        public static final class C20656a extends Lambda implements Function0<C38435bF0> {

            /* renamed from: g */
            public final /* synthetic */ C41229fv6 f81164g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20656a(C41229fv6 c41229fv6) {
                super(0);
                this.f81164g = c41229fv6;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final C38435bF0 invoke() {
                return ((FH3) this.f81164g.f81105K.getValue()).mo11124c();
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LSL4;", "b", "()LSL4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fv6$o$b */
        /* loaded from: classes3.dex */
        public static final class C20657b extends Lambda implements Function0<SL4> {

            /* renamed from: g */
            public final /* synthetic */ C41229fv6 f81165g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20657b(C41229fv6 c41229fv6) {
                super(0);
                this.f81165g = c41229fv6;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final SL4 invoke() {
                return (SL4) this.f81165g.f81107Q.getValue();
            }
        }

        public C20655o() {
            super(1);
        }

        /* renamed from: b */
        public static final C38435bF0 m40447b(Lazy<C38435bF0> lazy) {
            return lazy.getValue();
        }

        /* renamed from: c */
        public static final SL4 m40446c(Lazy<SL4> lazy) {
            return lazy.getValue();
        }

        /* renamed from: a */
        public final void m40448a(Triple<Boolean, Boolean, Boolean> triple) {
            Lazy lazy;
            Lazy lazy2;
            Boolean component1 = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            Boolean hasScannedBarcode = triple.component3();
            C41318g46.m40163a("hasMetAccuracy=" + component1 + ", hasScannedBarcode=" + hasScannedBarcode + ", parkingStatusCanPark=" + booleanValue, new Object[0]);
            lazy = LazyKt__LazyJVMKt.lazy(new C20656a(C41229fv6.this));
            lazy2 = LazyKt__LazyJVMKt.lazy(new C20657b(C41229fv6.this));
            if (!component1.booleanValue()) {
                C41229fv6.this.f81112W.accept(EH3.SURROUNDINGS);
                C41229fv6 c41229fv6 = C41229fv6.this;
                c41229fv6.f81095A = Intrinsics.areEqual(c41229fv6.f81103I, Boolean.TRUE);
                C41229fv6.this.m40497k0();
            } else if (C41229fv6.this.m40478w() && booleanValue) {
                C41318g46.m40163a("canSkipBirdScanOneTime was true when parkingStatusCanPark was, handling special case by delaying slightly longer before emitting", new Object[0]);
                C41229fv6.this.m40504g0(m40446c(lazy2), m40447b(lazy), true);
            } else {
                Intrinsics.checkNotNullExpressionValue(hasScannedBarcode, "hasScannedBarcode");
                if (hasScannedBarcode.booleanValue() && booleanValue) {
                    C41318g46.m40163a("emitting location and closing due to parkingStatusCanPark=true && hasScannedBarcode=true)", new Object[0]);
                    C41229fv6.m40502h0(C41229fv6.this, m40446c(lazy2), m40447b(lazy), false, 4, null);
                    return;
                }
                if (booleanValue) {
                    C41229fv6.this.f81112W.accept(EH3.ANCHOR);
                } else {
                    C41229fv6.this.f81112W.accept(EH3.FIND_PARKING);
                }
                C41229fv6.this.m40499j0(booleanValue);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Boolean, ? extends Boolean, ? extends Boolean> triple) {
            m40448a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LEH3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LEH3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$p */
    /* loaded from: classes3.dex */
    public static final class C20658p extends Lambda implements Function1<EH3, Unit> {
        public C20658p() {
            super(1);
        }

        /* renamed from: a */
        public final void m40443a(EH3 eh3) {
            boolean z;
            String str;
            ParkingNest parkingNest;
            ArModelNode m40475z = C41229fv6.this.m40475z();
            boolean z2 = true;
            if (eh3 == EH3.FIND_PARKING && Intrinsics.areEqual(C41229fv6.this.f81100F.getShowArMarker(), Boolean.TRUE)) {
                z = true;
            } else {
                z = false;
            }
            m40475z.m33252I0(z);
            C41229fv6.this.m40521S();
            InterfaceC28816tm interfaceC28816tm = C41229fv6.this.f81129o;
            ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS_V2;
            String m109246b = eh3.m109246b();
            String id = C41229fv6.this.f81132r.getId();
            WireBird bird = C41229fv6.this.f81132r.getBird();
            EnumC44987mG3 enumC44987mG3 = null;
            if (bird != null) {
                str = bird.getId();
            } else {
                str = null;
            }
            C38435bF0 mo21502g = C41229fv6.this.f81128n.mo21502g();
            if (mo21502g != null) {
                parkingNest = mo21502g.m64762e();
            } else {
                parkingNest = null;
            }
            C38435bF0 mo21502g2 = C41229fv6.this.f81128n.mo21502g();
            if (mo21502g2 != null) {
                enumC44987mG3 = mo21502g2.m64761f();
            }
            if (enumC44987mG3 != EnumC44987mG3.INSIDE) {
                z2 = false;
            }
            double d = C41229fv6.this.f81139y;
            double m85719e = ((SL4) C41229fv6.this.f81107Q.getValue()).m85719e();
            interfaceC28816tm.mo8188g(parkingLocationVerificationMethod, m109246b, id, str, parkingNest, Boolean.valueOf(z2), Double.valueOf(d), Double.valueOf(m85719e), C41229fv6.this.f81103I, ((SL4) C41229fv6.this.f81107Q.getValue()).m85716h().name());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EH3 eh3) {
            m40443a(eh3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ad\u0012`\u0012^\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*.\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "LFH3;", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVpsParkingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$scanModePropertyObservable$2\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,1138:1\n61#2,2:1139\n*S KotlinDebug\n*F\n+ 1 VpsParkingPresenter.kt\nco/bird/android/feature/ar/parking/VpsParkingPresenter$scanModePropertyObservable$2\n*L\n213#1:1139,2\n*E\n"})
    /* renamed from: fv6$q */
    /* loaded from: classes3.dex */
    public static final class C20659q extends Lambda implements Function0<Z84<Triple<? extends Boolean, ? extends FH3, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
        /* renamed from: fv6$q$a */
        /* loaded from: classes3.dex */
        public static final class C20660a<T1, T2, T3, R> implements InterfaceC23485h {

            /* renamed from: a */
            public static final C20660a<T1, T2, T3, R> f81168a = new C20660a<>();

            @Override // io.reactivex.functions.InterfaceC23485h
            /* renamed from: a */
            public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
                return new Triple<>(t1, t2, t3);
            }
        }

        public C20659q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Triple<? extends Boolean, ? extends FH3, ? extends Boolean>> invoke2() {
            C40463ee3 c40463ee3 = C40463ee3.f78649a;
            Observable combineLatest = Observable.combineLatest(C41229fv6.this.f81104J, C41229fv6.this.f81105K, C41229fv6.this.f81106P, C20660a.f81168a);
            Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
            return Z84.f47888d.m73662c(combineLatest, new Triple(C41229fv6.this.f81104J.getValue(), C41229fv6.this.f81105K.getValue(), C41229fv6.this.f81106P.getValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fv6$r */
    /* loaded from: classes3.dex */
    public static final class C20661r extends Lambda implements Function1<DialogResponse, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: fv6$r$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C20662a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogResponse.CANCEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C20661r() {
            super(1);
        }

        /* renamed from: a */
        public final void m40441a(DialogResponse dialogResponse) {
            ParkingNest parkingNest;
            C33971Kc0 c33971Kc0;
            Boolean bool;
            int i;
            FH3 fh3 = (FH3) C41229fv6.this.f81105K.getValue();
            C38435bF0 mo11124c = ((FH3) C41229fv6.this.f81105K.getValue()).mo11124c();
            String str = null;
            if (mo11124c != null) {
                parkingNest = mo11124c.m64762e();
            } else {
                parkingNest = null;
            }
            if (fh3 instanceof C33971Kc0) {
                c33971Kc0 = (C33971Kc0) fh3;
            } else {
                c33971Kc0 = null;
            }
            if (c33971Kc0 != null) {
                bool = Boolean.valueOf(c33971Kc0.m98692g());
            } else {
                bool = null;
            }
            if (dialogResponse == null) {
                i = -1;
            } else {
                i = C20662a.$EnumSwitchMapping$0[dialogResponse.ordinal()];
            }
            if (i != 1) {
                if (i == 2) {
                    if (C41229fv6.this.f81101G) {
                        InterfaceC28816tm interfaceC28816tm = C41229fv6.this.f81129o;
                        ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS_V2;
                        String id = C41229fv6.this.f81132r.getId();
                        WireBird bird = C41229fv6.this.f81132r.getBird();
                        if (bird != null) {
                            str = bird.getId();
                        }
                        interfaceC28816tm.mo8194a(parkingLocationVerificationMethod, id, str, parkingNest, bool, C41229fv6.this.f81102H + " seconds time out and continues to ride (result required)", Double.valueOf(C41229fv6.this.f81139y), Double.valueOf(((SL4) C41229fv6.this.f81107Q.getValue()).m85719e()), C41229fv6.this.f81103I, ((SL4) C41229fv6.this.f81107Q.getValue()).m85716h().name());
                        C41229fv6.this.m40509d0();
                        C41229fv6.this.f81120f.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_CANCELED, TuplesKt.m28425to("parking_verification_failed", Boolean.TRUE));
                        return;
                    }
                    InterfaceC28816tm interfaceC28816tm2 = C41229fv6.this.f81129o;
                    ParkingLocationVerificationMethod parkingLocationVerificationMethod2 = ParkingLocationVerificationMethod.GOOGLE_VPS_V2;
                    String id2 = C41229fv6.this.f81132r.getId();
                    WireBird bird2 = C41229fv6.this.f81132r.getBird();
                    if (bird2 != null) {
                        str = bird2.getId();
                    }
                    interfaceC28816tm2.mo8194a(parkingLocationVerificationMethod2, id2, str, parkingNest, bool, C41229fv6.this.f81102H + " seconds time out and ends ride (result not required)", Double.valueOf(C41229fv6.this.f81139y), Double.valueOf(((SL4) C41229fv6.this.f81107Q.getValue()).m85719e()), C41229fv6.this.f81103I, ((SL4) C41229fv6.this.f81107Q.getValue()).m85716h().name());
                    C41229fv6.this.f81120f.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("arcore_end_ride_regardless", Boolean.TRUE));
                    return;
                }
                return;
            }
            InterfaceC28816tm interfaceC28816tm3 = C41229fv6.this.f81129o;
            ParkingLocationVerificationMethod parkingLocationVerificationMethod3 = ParkingLocationVerificationMethod.GOOGLE_VPS_V2;
            String id3 = C41229fv6.this.f81132r.getId();
            WireBird bird3 = C41229fv6.this.f81132r.getBird();
            if (bird3 != null) {
                str = bird3.getId();
            }
            interfaceC28816tm3.mo8194a(parkingLocationVerificationMethod3, id3, str, parkingNest, bool, C41229fv6.this.f81102H + " seconds time out and keeps on trying", Double.valueOf(C41229fv6.this.f81139y), Double.valueOf(((SL4) C41229fv6.this.f81107Q.getValue()).m85719e()), C41229fv6.this.f81103I, ((SL4) C41229fv6.this.f81107Q.getValue()).m85716h().name());
            C41229fv6 c41229fv6 = C41229fv6.this;
            c41229fv6.m40511c0(c41229fv6.f81115Z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m40441a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C41229fv6(Context context, Handler handler, ScopeProvider scopeProvider, C48345rv6 ui, InterfaceC40099e13 navigator, C22454gl appPreference, C36207Tq4 reactiveConfig, InterfaceC40001dr4 locationManager, SensorManager sensorManager, InterfaceC1880Ea analyticsManager, DQ3 permissionManager, YR4 rideManager, InterfaceC46164oF3 parkingManager, InterfaceC28816tm arManager, InterfaceC12495bn areaManager, C39011cD1 googleMap, WireRide ride, MapPolygonableRenderer polygonableRenderer, ParkingNestRenderer parkingNestRenderer) {
        Long l;
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(parkingManager, "parkingManager");
        Intrinsics.checkNotNullParameter(arManager, "arManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(polygonableRenderer, "polygonableRenderer");
        Intrinsics.checkNotNullParameter(parkingNestRenderer, "parkingNestRenderer");
        this.f81116b = context;
        this.f81117c = handler;
        this.f81118d = scopeProvider;
        this.f81119e = ui;
        this.f81120f = navigator;
        this.f81121g = appPreference;
        this.f81122h = reactiveConfig;
        this.f81123i = locationManager;
        this.f81124j = sensorManager;
        this.f81125k = analyticsManager;
        this.f81126l = permissionManager;
        this.f81127m = rideManager;
        this.f81128n = parkingManager;
        this.f81129o = arManager;
        this.f81130p = areaManager;
        this.f81131q = googleMap;
        this.f81132r = ride;
        this.f81133s = polygonableRenderer;
        this.f81134t = parkingNestRenderer;
        SettableFuture<Boolean> create = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.f81135u = create;
        SettableFuture<Boolean> create2 = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create2, "create()");
        this.f81136v = create2;
        this.f81137w = true;
        SettableFuture<VpsAvailability> create3 = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create3, "create()");
        this.f81138x = create3;
        this.f81139y = Double.MAX_VALUE;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Boolean bool = Boolean.FALSE;
        this.f81096B = C37791a94.C10586a.create$default(c10586a, bool, null, 2, null);
        this.f81097C = sensorManager.getDefaultSensor(3);
        C45168ma4<SensorEvent> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<SensorEvent>()");
        this.f81098D = m25409g;
        Config m80769c = C36441Uq4.m80769c(reactiveConfig, ride.getBird());
        this.f81099E = m80769c;
        ParkingLocationVerificationConfig parkingLocationVerification = m80769c.getParkingConfig().getParkingLocationVerification();
        this.f81100F = parkingLocationVerification;
        boolean areEqual = Intrinsics.areEqual(parkingLocationVerification.getResultRequired(), Boolean.TRUE);
        this.f81101G = areEqual;
        Integer timeoutSeconds = parkingLocationVerification.getTimeoutSeconds();
        if (timeoutSeconds != null) {
            l = Long.valueOf(timeoutSeconds.intValue());
        } else {
            l = areEqual ? null : 15L;
        }
        this.f81102H = l;
        this.f81103I = parkingLocationVerification.getSkipBirdScan();
        this.f81104J = C37791a94.C10586a.create$default(c10586a, bool, null, 2, null);
        this.f81105K = C37791a94.C10586a.create$default(c10586a, new C44617le6(ride.getId(), null, null, false, 14, null), null, 2, null);
        this.f81106P = C37791a94.C10586a.create$default(c10586a, bool, null, 2, null);
        this.f81107Q = C37791a94.C10586a.create$default(c10586a, SL4.f33487p.m85712a(null, 0.0d, false, locationManager.mo43616p().m73665a(), 0.0d, false, null, null, false, false, false), null, 2, null);
        Optional.C14443a c14443a = Optional.f63040c;
        this.f81108R = C37791a94.C10586a.createNonRedundant$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f81109S = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(C20651m.f81159g);
        this.f81110T = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C20659q());
        this.f81111U = lazy2;
        this.f81112W = C37791a94.C10586a.create$default(c10586a, EH3.SURROUNDINGS, null, 2, null);
        ui.m15078Tl().setListener(this);
        ui.m15078Tl().setEnableOcrAnalysis(true);
        ui.m15078Tl().setEnableAnalysis(false);
    }

    /* renamed from: G */
    public static final void m40533G(C41229fv6 this$0) {
        Boolean useEarthPose;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            useEarthPose = (Boolean) this$0.f81136v.get();
        } catch (Throwable th) {
            C41318g46.m40161c(th, "Exception while checking if geospatial mode is supported, returning false: ", new Object[0]);
            useEarthPose = Boolean.FALSE;
        }
        C41318g46.m40163a("useEarthPose = " + useEarthPose, new Object[0]);
        C37791a94<Boolean> c37791a94 = this$0.f81096B;
        Intrinsics.checkNotNullExpressionValue(useEarthPose, "useEarthPose");
        c37791a94.accept(useEarthPose);
    }

    /* renamed from: I */
    public static final void m40531I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23434B m40529K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m40528L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final Optional m40526N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m40525O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m40523Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23447K m40522R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m40520T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final Triple m40514Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m40513a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m40512b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f0 */
    public static /* synthetic */ void m40505f0(C41229fv6 c41229fv6, SL4 sl4, FH3 fh3, Optional optional, int i, Object obj) {
        if ((i & 1) != 0) {
            sl4 = c41229fv6.f81107Q.getValue();
        }
        if ((i & 2) != 0) {
            fh3 = c41229fv6.f81105K.getValue();
        }
        if ((i & 4) != 0) {
            optional = Optional.f63040c.m59034a();
        }
        c41229fv6.m40507e0(sl4, fh3, optional);
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m40502h0(C41229fv6 c41229fv6, SL4 sl4, C38435bF0 c38435bF0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            c38435bF0 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c41229fv6.m40504g0(sl4, c38435bF0, z);
    }

    /* renamed from: i0 */
    public static final void m40501i0(C41229fv6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81120f.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: l0 */
    public static final void m40495l0(C41229fv6 this$0) {
        String str = "device";
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Boolean avail = (Boolean) this$0.f81135u.get();
            Intrinsics.checkNotNullExpressionValue(avail, "avail");
            if (avail.booleanValue()) {
                C41318g46.m40163a("arCore is available, transitioning to next step", new Object[0]);
                str = 0;
            } else {
                C41318g46.m40163a("arCore is not available currently", new Object[0]);
                this$0.f81129o.mo8192c(ParkingLocationVerificationMethod.GOOGLE_VPS_V2, this$0.f81132r.getId(), this$0.f81132r.getBirdId(), "device");
                str = Integer.valueOf(C45871nl4.scan_surroundings_unavailable_description);
            }
        } catch (Throwable th) {
            C41318g46.m40161c(th, "arCore availability exception: ", new Object[0]);
            this$0.f81129o.mo8192c(ParkingLocationVerificationMethod.GOOGLE_VPS_V2, this$0.f81132r.getId(), this$0.f81132r.getBirdId(), str);
            str = Integer.valueOf(C45871nl4.scan_surroundings_unavailable_description);
        }
        if (str != 0) {
            C41318g46.m40163a("updating message res id for scan surrounding bottom sheet to " + str, new Object[0]);
            this$0.f81119e.m15073Yl(str.intValue());
        }
    }

    /* renamed from: n0 */
    public static final void m40492n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final double m40476y(Lazy<Double> lazy) {
        return lazy.getValue().doubleValue();
    }

    /* renamed from: A */
    public final Z84<Triple<Boolean, FH3, Boolean>> m40539A() {
        return (Z84) this.f81111U.getValue();
    }

    /* renamed from: B */
    public final Pair<Boolean, Double> m40538B(double d) {
        boolean z;
        Pair<Double, Double> m40477x = m40477x();
        Double valueOf = Double.valueOf(0.0d);
        if (m40477x == null) {
            return TuplesKt.m28425to(Boolean.FALSE, valueOf);
        }
        double doubleValue = m40477x.component1().doubleValue();
        double doubleValue2 = m40477x.component2().doubleValue();
        Double allowDeviceLocationIfAccurateAfterSeconds = this.f81100F.getAllowDeviceLocationIfAccurateAfterSeconds();
        if (allowDeviceLocationIfAccurateAfterSeconds != null) {
            if (doubleValue2 >= allowDeviceLocationIfAccurateAfterSeconds.doubleValue() && d <= doubleValue) {
                z = true;
            } else {
                z = false;
            }
            return TuplesKt.m28425to(Boolean.valueOf(z), Double.valueOf(doubleValue));
        }
        return TuplesKt.m28425to(Boolean.FALSE, valueOf);
    }

    /* renamed from: C */
    public final void m40537C(ArSession arSession) {
        C41318g46.m40163a("ar session created", new Object[0]);
        this.f81135u.set(Boolean.TRUE);
        this.f81136v.set(Boolean.valueOf(arSession.isGeospatialModeSupported(Config.GeospatialMode.ENABLED)));
    }

    /* renamed from: D */
    public final void m40536D(Throwable th) {
        C41318g46.m40161c(th, "ar session failed: ", new Object[0]);
        this.f81135u.setException(th);
        this.f81136v.set(Boolean.FALSE);
        this.f81129o.mo8192c(ParkingLocationVerificationMethod.GOOGLE_VPS_V2, this.f81132r.getId(), this.f81132r.getBirdId(), "device");
    }

    /* renamed from: E */
    public final double m40535E(double d) {
        double d2 = 0.0d;
        if (!this.f81099E.getParkingConfig().getEnableHorizontalAccuracyLocation()) {
            return 0.0d;
        }
        double min = Double.min(Double.max(0.0d, d), this.f81099E.getNestSearchAccuracyRadiusLimit());
        Double riderNestAdditionalBufferMeters = this.f81099E.getParkingConfig().getRiderNestAdditionalBufferMeters();
        if (riderNestAdditionalBufferMeters != null) {
            d2 = riderNestAdditionalBufferMeters.doubleValue();
        }
        return min + d2;
    }

    /* renamed from: F */
    public final void m40534F() {
        if (this.f81138x.isDone()) {
            SettableFuture<VpsAvailability> create = SettableFuture.create();
            Intrinsics.checkNotNullExpressionValue(create, "create()");
            this.f81138x = create;
        }
        this.f81119e.m15078Tl().m58856N0(this.f81123i.mo43616p().m73665a(), new C20634c());
        this.f81136v.addListener(new Runnable() { // from class: ev6
            @Override // java.lang.Runnable
            public final void run() {
                C41229fv6.m40533G(C41229fv6.this);
            }
        }, NA0.m94296h(this.f81116b));
    }

    /* renamed from: H */
    public final void m40532H() {
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f81119e.m15078Tl().m58852R0(), this.f81119e.m15078Tl().m58853Q0(), C20635d.f81143a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn = combineLatest.observeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…bserveOn(Schedulers.io())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20636e c20636e = new C20636e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ru6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41229fv6.m40531I(Function1.this, obj);
            }
        });
    }

    /* renamed from: J */
    public final void m40530J() {
        Observable<Boolean> distinctUntilChanged = this.f81096B.distinctUntilChanged();
        final C20637f c20637f = new C20637f();
        AbstractC23461c ignoreElements = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: Su6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m40529K;
                m40529K = C41229fv6.m40529K(Function1.this, obj);
                return m40529K;
            }
        }).ignoreElements();
        final C20644g c20644g = C20644g.f81152g;
        AbstractC23461c m33065U = ignoreElements.m33084B(new InterfaceC23484g() { // from class: Tu6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41229fv6.m40528L(Function1.this, obj);
            }
        }).m33065U(10L);
        Intrinsics.checkNotNullExpressionValue(m33065U, "private fun listenForLoc…r)\n      .subscribe()\n  }");
        Object m33041n = m33065U.m33041n(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: M */
    public final void m40527M() {
        C41318g46.m40163a("listenForNestAnchorLocationUpdates called", new Object[0]);
        Observable<FH3> observeOn = this.f81105K.observeOn(C24542a.m31934a());
        final C20645h c20645h = C20645h.f81153g;
        Observable<R> map = observeOn.map(new InterfaceC23492o() { // from class: cv6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m40526N;
                m40526N = C41229fv6.m40526N(Function1.this, obj);
                return m40526N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "parkingStateRelay\n      ….parkingNest?.location) }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(this.f81108R);
        Observable<Optional<WireLocation>> observeOn2 = this.f81108R.observeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "currentNestAnchorLocatio…bserveOn(Schedulers.io())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20646i c20646i = new C20646i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: dv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41229fv6.m40525O(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public final void m40524P() {
        C41318g46.m40163a("listenForNestAnchorUpdates called", new Object[0]);
        Observable<Optional<Anchor>> distinctUntilChanged = this.f81109S.distinctUntilChanged();
        final C20647j c20647j = C20647j.f81155g;
        Observable observeOn = distinctUntilChanged.switchMapSingle(new InterfaceC23492o() { // from class: Uu6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m40522R;
                m40522R = C41229fv6.m40522R(Function1.this, obj);
                return m40522R;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "currentNestAnchorRelay\n …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20649k c20649k = new C20649k();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Vu6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41229fv6.m40523Q(Function1.this, obj);
            }
        });
    }

    /* renamed from: S */
    public final void m40521S() {
        Long l = this.f81102H;
        if (l != null) {
            long longValue = l.longValue();
            m40490o0();
            AbstractC24507p<Long> m32066I = AbstractC24507p.m32049a0(longValue, TimeUnit.SECONDS).m32066I(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m32066I, "timer(timeout, TimeUnit.…dSchedulers.mainThread())");
            Object m32048b = m32066I.m32048b(AutoDispose.m45239a(this.f81118d));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C20650l c20650l = new C20650l();
            this.f81140z = ((MaybeSubscribeProxy) m32048b).subscribe(new InterfaceC23484g() { // from class: Wu6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41229fv6.m40520T(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: U */
    public final void m40519U(SL4 sl4) {
        if (sl4.m85716h() == TL4.VPS) {
            InterfaceC40001dr4 interfaceC40001dr4 = this.f81123i;
            EnumC36493Uw2 enumC36493Uw2 = EnumC36493Uw2.VPS;
            Location location = new Location(enumC36493Uw2.name());
            location.setLatitude(sl4.m85718f().f71430b);
            location.setLongitude(sl4.m85718f().f71431c);
            location.setAccuracy((float) sl4.m85719e());
            location.setAltitude(sl4.m85722b());
            if (Build.VERSION.SDK_INT >= 26) {
                location.setVerticalAccuracyMeters((float) sl4.m85715i());
            }
            C36727Vw2 c36727Vw2 = new C36727Vw2(location, enumC36493Uw2);
            DateTime plusSeconds = DateTime.now().plusSeconds(30);
            Intrinsics.checkNotNullExpressionValue(plusSeconds, "now().plusSeconds(VpsRes…ATION_EXPIRATION_SECONDS)");
            interfaceC40001dr4.mo43620l(new C47831r36(c36727Vw2, null, plusSeconds, 2, null));
            return;
        }
        m40509d0();
    }

    /* renamed from: V */
    public final void m40518V() {
        String str;
        ParkingNest parkingNest;
        boolean z = false;
        C41318g46.m40163a("onBackPressed", new Object[0]);
        m40509d0();
        InterfaceC28816tm interfaceC28816tm = this.f81129o;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS_V2;
        String id = this.f81132r.getId();
        WireBird bird = this.f81132r.getBird();
        EnumC44987mG3 enumC44987mG3 = null;
        if (bird != null) {
            str = bird.getId();
        } else {
            str = null;
        }
        C38435bF0 mo21502g = this.f81128n.mo21502g();
        if (mo21502g != null) {
            parkingNest = mo21502g.m64762e();
        } else {
            parkingNest = null;
        }
        C38435bF0 mo21502g2 = this.f81128n.mo21502g();
        if (mo21502g2 != null) {
            enumC44987mG3 = mo21502g2.m64761f();
        }
        if (enumC44987mG3 == EnumC44987mG3.INSIDE) {
            z = true;
        }
        double d = this.f81139y;
        double m85719e = this.f81107Q.getValue().m85719e();
        interfaceC28816tm.mo8194a(parkingLocationVerificationMethod, id, str, parkingNest, Boolean.valueOf(z), "closed", Double.valueOf(d), Double.valueOf(m85719e), this.f81103I, this.f81107Q.getValue().m85716h().name());
    }

    /* renamed from: W */
    public final void m40517W() {
        C41318g46.m40163a("onCreateAfterMapReady called", new Object[0]);
        this.f81131q.m61674n(true);
    }

    /* renamed from: X */
    public final void m40516X() {
        this.f81124j.unregisterListener(this);
        m40475z().m33190y0(null);
        this.f81119e.m15078Tl().setSelectedNode(null);
        this.f81119e.m15078Tl().setEnableAnalysis(false);
        this.f81115Z = null;
    }

    /* renamed from: Y */
    public final void m40515Y(C39011cD1 map) {
        String str;
        ParkingNest m64762e;
        Intrinsics.checkNotNullParameter(map, "map");
        boolean z = false;
        C41318g46.m40163a("onResume called", new Object[0]);
        ArSession m33394s0 = this.f81119e.m15078Tl().m33394s0();
        if (m33394s0 != null) {
            m40537C(m33394s0);
        }
        m40511c0(DateTime.now());
        InterfaceC28816tm interfaceC28816tm = this.f81129o;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS_V2;
        String id = this.f81132r.getId();
        String birdId = this.f81132r.getBirdId();
        C38435bF0 mo21502g = this.f81128n.mo21502g();
        EnumC44987mG3 enumC44987mG3 = null;
        if (mo21502g != null && (m64762e = mo21502g.m64762e()) != null) {
            str = m64762e.getId();
        } else {
            str = null;
        }
        C38435bF0 mo21502g2 = this.f81128n.mo21502g();
        if (mo21502g2 != null) {
            enumC44987mG3 = mo21502g2.m64761f();
        }
        if (enumC44987mG3 == EnumC44987mG3.INSIDE) {
            z = true;
        }
        interfaceC28816tm.mo8187h(parkingLocationVerificationMethod, id, birdId, str, Boolean.valueOf(z), this.f81115Z, this.f81103I);
        m40530J();
        m40532H();
        m40527M();
        m40524P();
        m40534F();
        Z84<Triple<Boolean, FH3, Boolean>> m40539A = m40539A();
        final C20654n c20654n = C20654n.f81162g;
        Observable observeOn = m40539A.map(new InterfaceC23492o() { // from class: Zu6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m40514Z;
                m40514Z = C41229fv6.m40514Z(Function1.this, obj);
                return m40514Z;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "scanModePropertyObservab…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20655o c20655o = new C20655o();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: av6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41229fv6.m40513a0(Function1.this, obj);
            }
        });
        Observable<EH3> observeOn2 = this.f81112W.distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "scanModeStateRelay\n     …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20658p c20658p = new C20658p();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: bv6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41229fv6.m40512b0(Function1.this, obj);
            }
        });
        m40475z().m33190y0(this.f81119e.m15078Tl());
    }

    @Override // p000.InterfaceC43018iw6
    /* renamed from: a */
    public void mo31591a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        C41318g46.m40161c(exception, "onArSessionFailed called: ", new Object[0]);
        InterfaceC43018iw6.C24645a.m31581d(this, exception);
        m40536D(exception);
    }

    @Override // p000.InterfaceC43018iw6
    /* renamed from: b */
    public void mo31590b(HitResult hitResult, MotionEvent motionEvent) {
        InterfaceC43018iw6.C24645a.m31578g(this, hitResult, motionEvent);
    }

    @Override // p000.InterfaceC43018iw6
    /* renamed from: c */
    public void mo31589c(ArSession arSession) {
        InterfaceC43018iw6.C24645a.m31580e(this, arSession);
    }

    /* renamed from: c0 */
    public final void m40511c0(DateTime dateTime) {
        this.f81115Z = dateTime;
        m40486q0();
        this.f81107Q.m71836j();
        this.f81104J.m71836j();
        this.f81105K.m71836j();
        this.f81106P.m71836j();
        m40521S();
        m40475z().m33190y0(null);
        this.f81119e.m15078Tl().setSelectedNode(null);
        this.f81119e.m15078Tl().setEnableAnalysis(false);
    }

    /* renamed from: d0 */
    public final void m40509d0() {
        this.f81123i.mo43631a();
    }

    /* renamed from: e0 */
    public final void m40507e0(SL4 sl4, FH3 fh3, Optional<String> optional) {
        Integer num;
        Config.FocusMode focusMode;
        com.google.p034ar.core.Config config;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\nResolved Location:\n");
        stringBuffer.append(sl4.m85713k());
        stringBuffer.append("\nParking Status:\n");
        stringBuffer.append(fh3);
        stringBuffer.append("\nParking Verification Config:\n");
        stringBuffer.append(this.f81100F);
        stringBuffer.append("\nseconds since startScanningTime: ");
        DateTime dateTime = this.f81115Z;
        String str = null;
        if (dateTime != null) {
            num = Integer.valueOf(C46880pT0.m19254h(dateTime));
        } else {
            num = null;
        }
        stringBuffer.append(num);
        stringBuffer.append("\nfocus mode: ");
        ArSession m33394s0 = this.f81119e.m15078Tl().m33394s0();
        if (m33394s0 != null && (config = m33394s0.getConfig()) != null) {
            focusMode = config.getFocusMode();
        } else {
            focusMode = null;
        }
        stringBuffer.append(focusMode);
        if (optional.m59037c()) {
            stringBuffer.append("\nbarcodes: ");
            stringBuffer.append(optional.m59035e());
        }
        String stringBuffer2 = stringBuffer.toString();
        if (this.f81099E.getEnableLocationDebugInfoOnMapScreen()) {
            str = stringBuffer2;
        }
        this.f81119e.m15075Wl(str);
    }

    @Override // p000.InterfaceC43018iw6
    /* renamed from: g */
    public void mo31588g(C35340Py1 c35340Py1) {
        InterfaceC43018iw6.C24645a.m31579f(this, c35340Py1);
    }

    /* renamed from: g0 */
    public final void m40504g0(SL4 sl4, C38435bF0 c38435bF0, boolean z) {
        String str;
        ParkingNest parkingNest;
        boolean z2;
        long j;
        InterfaceC28816tm interfaceC28816tm = this.f81129o;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod = ParkingLocationVerificationMethod.GOOGLE_VPS_V2;
        String id = this.f81132r.getId();
        WireBird bird = this.f81132r.getBird();
        EnumC44987mG3 enumC44987mG3 = null;
        if (bird != null) {
            str = bird.getId();
        } else {
            str = null;
        }
        if (c38435bF0 != null) {
            parkingNest = c38435bF0.m64762e();
        } else {
            parkingNest = null;
        }
        if (c38435bF0 != null) {
            enumC44987mG3 = c38435bF0.m64761f();
        }
        if (enumC44987mG3 == EnumC44987mG3.INSIDE) {
            z2 = true;
        } else {
            z2 = false;
        }
        double d = this.f81139y;
        double m85719e = this.f81107Q.getValue().m85719e();
        ParkingNest parkingNest2 = parkingNest;
        InterfaceC28816tm.C28817a.trackResolutionResult$default(interfaceC28816tm, parkingLocationVerificationMethod, id, str, parkingNest2, Boolean.valueOf(z2), null, Double.valueOf(d), Double.valueOf(m85719e), this.f81103I, this.f81107Q.getValue().m85716h().name(), 32, null);
        if (z) {
            j = 1000;
        } else {
            j = 200;
        }
        m40519U(sl4);
        this.f81117c.postDelayed(new Runnable() { // from class: Xu6
            @Override // java.lang.Runnable
            public final void run() {
                C41229fv6.m40501i0(C41229fv6.this);
            }
        }, j);
    }

    @Override // p000.InterfaceC43018iw6
    /* renamed from: i */
    public void mo31587i(ArSession session, com.google.p034ar.core.Config config) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(config, "config");
        InterfaceC43018iw6.C24645a.m31583b(this, session, config);
        this.f81119e.m15078Tl().setInstantPlacementEnabled(false);
        if (session.isDepthModeSupported(Config.DepthMode.AUTOMATIC)) {
            C41318g46.m40163a("updating depth mode based off automatic support", new Object[0]);
            this.f81119e.m15078Tl().setDepthOcclusionEnabled(true);
            this.f81119e.m15078Tl().setDepthEnabled(true);
        } else if (session.isDepthModeSupported(Config.DepthMode.RAW_DEPTH_ONLY)) {
            C41318g46.m40163a("updating depth mode based off raw depth only support", new Object[0]);
            this.f81119e.m15078Tl().setDepthOcclusionEnabled(true);
            this.f81119e.m15078Tl().setDepthEnabled(true);
        } else {
            C41318g46.m40163a("updating depth mode based off no support", new Object[0]);
            this.f81119e.m15078Tl().setDepthOcclusionEnabled(false);
            this.f81119e.m15078Tl().setDepthEnabled(false);
        }
    }

    /* renamed from: j0 */
    public final void m40499j0(boolean z) {
        ParkingNest parkingNest;
        C41318g46.m40163a("showParkingMode called", new Object[0]);
        C38435bF0 mo11124c = this.f81105K.getValue().mo11124c();
        if (mo11124c != null) {
            parkingNest = mo11124c.m64762e();
        } else {
            parkingNest = null;
        }
        C41318g46.m40163a("setting parking mode with current parking nest = " + parkingNest, new Object[0]);
        this.f81119e.m15076Vl();
        this.f81119e.m15074Xl();
        C49520tu6.m11239l(this.f81119e.m15082Pl());
        if (z) {
            this.f81119e.m15078Tl().setEnableAnalysis(true);
            C49520tu6.m11233r(this.f81119e.m15080Rl());
            return;
        }
        this.f81119e.m15078Tl().setEnableAnalysis(false);
        C49520tu6.m11239l(this.f81119e.m15080Rl());
    }

    /* renamed from: k0 */
    public final void m40497k0() {
        C41318g46.m40163a("showScanSurroundingsUi called", new Object[0]);
        this.f81119e.m15077Ul();
        C48345rv6.showScanSurroundingBottomSheet$default(this.f81119e, 0, 1, null);
        this.f81119e.m15078Tl().setEnableAnalysis(false);
        this.f81135u.addListener(new Runnable() { // from class: Yu6
            @Override // java.lang.Runnable
            public final void run() {
                C41229fv6.m40495l0(C41229fv6.this);
            }
        }, NA0.m94296h(this.f81116b));
        C49520tu6.m11233r(this.f81119e.m15082Pl());
        C49520tu6.m11239l(this.f81119e.m15080Rl());
    }

    @Override // p000.InterfaceC43018iw6
    /* renamed from: m */
    public void mo31586m(ArSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        C41318g46.m40163a("onArSessionCreated called session=" + session, new Object[0]);
        InterfaceC43018iw6.C24645a.m31582c(this, session);
        m40537C(session);
    }

    /* renamed from: m0 */
    public final void m40494m0() {
        Integer num;
        if (!this.f81104J.getValue().booleanValue()) {
            num = Integer.valueOf(C45871nl4.scan_surroundings_timeout_description);
        } else if (this.f81105K.getValue().mo11125b()) {
            num = Integer.valueOf(C45871nl4.bird_scan_timeout_description);
        } else {
            num = null;
        }
        AbstractC23442F<DialogResponse> m33152N = this.f81119e.birdDialog(new UH3(this.f81101G, num), false, false).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "ui.birdDialog(\n      ale…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f81118d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20661r c20661r = new C20661r();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Qu6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41229fv6.m40492n0(Function1.this, obj);
            }
        });
    }

    /* renamed from: o0 */
    public final void m40490o0() {
        InterfaceC23465c interfaceC23465c = this.f81140z;
        if (interfaceC23465c != null) {
            interfaceC23465c.dispose();
        }
        this.f81140z = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            this.f81098D.accept(sensorEvent);
        }
    }

    /* renamed from: p0 */
    public final void m40488p0(SL4 sl4) {
        float f;
        LatLng m85718f = sl4.m85718f();
        double m40535E = m40535E(sl4.m85719e());
        Double m85720d = sl4.m85720d();
        CameraPosition.C17619a m50711u = CameraPosition.m50711u(this.f81131q.m61679i());
        if (m85720d != null) {
            f = (float) m85720d.doubleValue();
        } else {
            Float m85721c = sl4.m85721c();
            if (m85721c != null) {
                f = m85721c.floatValue();
            } else {
                f = 0.0f;
            }
        }
        CameraPosition m50708b = m50711u.m50709a(f).m50707c(m85718f).m50706d(60.0f).m50705e(20.0f).m50708b();
        Intrinsics.checkNotNullExpressionValue(m50708b, "builder(googleMap.camera…OOM_LEVEL)\n      .build()");
        this.f81131q.m61675m(C48149rc0.m15709a(m50708b));
        m40485r0(this.f81131q, m85718f, m40535E);
    }

    /* renamed from: q0 */
    public final void m40486q0() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Location m73665a = this.f81123i.mo43616p().m73665a();
        List<Area> m33475g = C23356io.m33475g(this.f81130p.mo63995r().m73665a(), m73665a, 20);
        List<Area> list = m33475g;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Area area : list) {
            arrayList.add(area.getId());
        }
        C41318g46.m40163a("updateMapAreas called with areasToRender=" + arrayList, new Object[0]);
        this.f81133s.setPolygonables(m33475g);
        List<ParkingNest> m21418a = C46173oG3.m21418a(this.f81130p.mo64006V().m73665a(), m73665a, 40);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(m21418a, 10);
        ArrayList<ParkingNestRenderItem> arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (ParkingNest parkingNest : m21418a) {
            arrayList2.add(new ParkingNestRenderItem(parkingNest, true));
        }
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
        for (ParkingNestRenderItem parkingNestRenderItem : arrayList2) {
            arrayList3.add(parkingNestRenderItem.getParkingNest().getId());
        }
        C41318g46.m40163a("updateMapAreas called with nestsToRender=" + arrayList3, new Object[0]);
        this.f81134t.render(arrayList2);
    }

    @Override // p000.InterfaceC43018iw6
    /* renamed from: r */
    public void mo31585r(C27991rm c27991rm) {
        InterfaceC43018iw6.C24645a.m31584a(this, c27991rm);
    }

    /* renamed from: r0 */
    public final void m40485r0(C39011cD1 c39011cD1, LatLng latLng, double d) {
        C40889fM2 c40889fM2 = this.f81113X;
        if (c40889fM2 == null) {
            this.f81113X = c39011cD1.m61685c(new MarkerOptions().m50643u1(latLng).m50644u(0.5f, 0.5f).m50657N0(C40788fB0.icon$default(this.f81116b, C48193rg4.ic_user_location_v2, null, null, 6, null)).m50641y1(0.0f).m50658L1(this.f81116b.getString(C45871nl4.map_my_location)).m50651Y1(100.0f).m50664E(false));
            CircleOptions m50695m0 = new CircleOptions().m50693s(latLng).m50695m0(d);
            Context context = this.f81116b;
            int i = C32364Df4.birdBlue20;
            this.f81114Y = c39011cD1.m61687a(m50695m0.m50692u(context.getColor(i)).m50694p0(this.f81116b.getColor(i)).m50702E0(100.0f));
            return;
        }
        if (c40889fM2 != null) {
            c40889fM2.m41521m(latLng);
        }
        C51775xj0 c51775xj0 = this.f81114Y;
        if (c51775xj0 != null) {
            c51775xj0.m4797a(latLng);
        }
        C51775xj0 c51775xj02 = this.f81114Y;
        if (c51775xj02 != null) {
            c51775xj02.m4796b(d);
        }
    }

    /* renamed from: s0 */
    public final void m40483s0(FH3 fh3) {
        boolean z;
        C33971Kc0 c33971Kc0;
        boolean z2;
        C33971Kc0 c33971Kc02;
        if (!Intrinsics.areEqual(fh3.mo11122e(), this.f81105K.getValue().mo11122e())) {
            C41318g46.m40163a("updateParkingStatusProperties with parkingStatus: " + fh3, new Object[0]);
        }
        boolean z3 = true;
        if (this.f81132r.getUserGuestId() != null) {
            z = true;
        } else {
            z = false;
        }
        QM4 m89225e = C6598Py.m89225e(fh3, z, Boolean.TRUE, false);
        if (m89225e == null) {
            boolean z4 = fh3 instanceof C33971Kc0;
            if (z4) {
                c33971Kc0 = (C33971Kc0) fh3;
            } else {
                c33971Kc0 = null;
            }
            if (c33971Kc0 != null && c33971Kc0.m98692g()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                m89225e = new C14452b(z, false, 2, null);
            } else {
                if (z4) {
                    c33971Kc02 = (C33971Kc0) fh3;
                } else {
                    c33971Kc02 = null;
                }
                if (c33971Kc02 == null || !c33971Kc02.mo11125b()) {
                    z3 = false;
                }
                if (z3) {
                    m89225e = new C14451a(z, false, 2, null);
                } else {
                    m89225e = new C44340lA3(z, null, false, 6, null);
                }
            }
        }
        ParkingStatusBottomSheetView m58880j = this.f81119e.m15081Ql().m58880j();
        m58880j.m58886g().setText(m89225e.mo27706e());
        TextView m58888e = m58880j.m58888e();
        Context context = m58880j.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        m58888e.setText(m89225e.message(context));
        m58880j.m58887f().setImageResource(m89225e.mo27705g());
        m58880j.setColor(m58880j.getContext().getColor(m89225e.mo27708c()));
    }

    /* renamed from: t0 */
    public final Pair<Boolean, Double> m40481t0(double d) {
        boolean z;
        Pair<Double, Double> m40477x = m40477x();
        if (m40477x == null) {
            return TuplesKt.m28425to(Boolean.FALSE, Double.valueOf(0.0d));
        }
        double doubleValue = m40477x.component1().doubleValue();
        if (d <= doubleValue) {
            z = true;
        } else {
            z = false;
        }
        return TuplesKt.m28425to(Boolean.valueOf(z), Double.valueOf(doubleValue));
    }

    /* renamed from: w */
    public final boolean m40478w() {
        boolean z = this.f81095A;
        this.f81095A = false;
        return z;
    }

    /* renamed from: x */
    public final Pair<Double, Double> m40477x() {
        Lazy lazy;
        double d;
        DateTime dateTime = this.f81115Z;
        lazy = LazyKt__LazyJVMKt.lazy(new C20633b(dateTime));
        if (dateTime == null || m40476y(lazy) < 2.0d) {
            return null;
        }
        double m40476y = m40476y(lazy) - 2;
        double requiredHorizontalAccuracyMeters = this.f81100F.getRequiredHorizontalAccuracyMeters();
        Double horizontalAccuracyAllowanceMetersPerSecond = this.f81100F.getHorizontalAccuracyAllowanceMetersPerSecond();
        if (horizontalAccuracyAllowanceMetersPerSecond != null) {
            d = horizontalAccuracyAllowanceMetersPerSecond.doubleValue() * m40476y;
        } else {
            d = 0.0d;
        }
        return TuplesKt.m28425to(Double.valueOf(requiredHorizontalAccuracyMeters + d), Double.valueOf(m40476y));
    }

    /* renamed from: z */
    public final ArModelNode m40475z() {
        return (ArModelNode) this.f81110T.getValue();
    }
}
