package co.bird.android.app.manager;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.manager.SmartlockManagerImpl;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PhysicalLockEvent;
import co.bird.android.model.PhysicalLockEventKind;
import co.bird.android.model.RideState;
import co.bird.android.model.analytics.SmartlockLocked;
import co.bird.android.model.analytics.SmartlockUnlockError;
import co.bird.android.model.analytics.SmartlockUnlocked;
import co.bird.android.model.constant.NokelockResponseType;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireNokelockResponseData;
import co.bird.android.model.wire.WireNokelockTokenResponseData;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.NokelockMessage;
import co.bird.api.response.NokelockResponse;
import co.bird.api.response.NokelockResponseKt;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.polidea.rxandroidble2.exceptions.BleAdapterDisabledException;
import com.polidea.rxandroidble2.exceptions.BleAlreadyConnectedException;
import com.polidea.rxandroidble2.exceptions.BleCharacteristicNotFoundException;
import com.polidea.rxandroidble2.exceptions.BleConflictingNotificationAlreadySetException;
import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import com.polidea.rxandroidble2.exceptions.BleGattCharacteristicException;
import com.polidea.rxandroidble2.exceptions.BleGattException;
import com.polidea.rxandroidble2.exceptions.BleScanException;
import com.polidea.rxandroidble2.exceptions.BleServiceNotFoundException;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23470e;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.AbstractC39873de5;
import p000.C22454gl;
import p000.C37791a94;
import p000.InterfaceC5225MD;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 ¸\u00012\u00020\u0001:\u0005?FE¹\u0001BY\u0012\u0006\u0010K\u001a\u00020I\u0012\u0006\u0010N\u001a\u00020L\u0012\u0006\u0010Q\u001a\u00020O\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010X\u001a\u00020V\u0012\u0006\u0010[\u001a\u00020Y\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010h\u001a\u00020e¢\u0006\u0006\b¶\u0001\u0010·\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u00122\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u000fH\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000fH\u0002J\f\u0010#\u001a\u00020\u0015*\u00020\u0017H\u0002J\f\u0010$\u001a\u00020\u0017*\u00020\u0015H\u0002J\u0018\u0010(\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020\tH\u0002J\b\u0010*\u001a\u00020\tH\u0002J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0002J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.J\u0010\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0016J\\\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0006\u001a\u00020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t0226\u00107\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t04H\u0016J \u0010<\u001a\u00020;2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0016J\u0018\u0010=\u001a\u00020;2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u000bH\u0016J\b\u0010@\u001a\u00020\tH\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u0014\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0BH\u0016J\b\u0010F\u001a\u00020\tH\u0016J\u0010\u0010H\u001a\u00020;2\u0006\u0010G\u001a\u00020,H\u0016R\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0C0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR&\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010m\u001a\u0004\bS\u0010nR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00170p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR \u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010|\u001a\u0010\u0012\f\u0012\n y*\u0004\u0018\u00010\t0\t0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R \u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010kR/\u0010\u0080\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020D y*\n\u0012\u0004\u0012\u00020D\u0018\u00010C0C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010mR$\u0010\u0082\u0001\u001a\u0010\u0012\f\u0012\n y*\u0004\u0018\u00010\t0\t0x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010{R$\u0010\u0084\u0001\u001a\u0010\u0012\f\u0012\n y*\u0004\u0018\u00010\t0\t0x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010{R/\u0010\u0087\u0001\u001a\u001b\u0012\u0017\u0012\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0085\u00010C0i8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010kR$\u0010\u0089\u0001\u001a\u0010\u0012\f\u0012\n y*\u0004\u0018\u00010\u00050\u00050x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010{R$\u0010\u008b\u0001\u001a\u0010\u0012\f\u0012\n y*\u0004\u0018\u00010\u00170\u00170x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010{R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0099\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009b\u0001R$\u0010¢\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002090\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R*\u0010ª\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0C0§\u00010\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R5\u0010¬\u0001\u001a\u001b\u0012\u0017\u0012\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0085\u00010C0B8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b«\u0001\u0010m\u001a\u0004\bf\u0010nR;\u0010¯\u0001\u001a&\u0012\f\u0012\n y*\u0004\u0018\u00010\u00070\u0007 y*\u0012\u0012\f\u0012\n y*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00120\u00128BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0016\u0010µ\u0001\u001a\u0002098VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bj\u0010´\u0001¨\u0006º\u0001"}, m28432d2 = {"Lco/bird/android/app/manager/SmartlockManagerImpl;", "LoI5;", "Lio/reactivex/disposables/c;", "F0", "a1", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "Lde5$a;", TransferTable.COLUMN_STATE, "", "r1", "LXl5;", "LTk5;", "scanResult", "L0", "Lco/bird/android/model/wire/WireSmartlock;", "Lio/reactivex/F;", "d1", "Lio/reactivex/Observable;", "Lke5;", "k0", "", "E0", "", "C0", "k1", "payload", "j1", "message", "Lco/bird/api/response/NokelockResponse;", "P0", "n0", "connection", "c1", "Q0", "A0", "z0", "smartlock", "", "error", "O0", "N0", "M0", "m1", "", "y0", "()Ljava/lang/Long;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "j", "Lkotlin/Function0;", "onBleReady", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "onBleNotReady", "c", "", "count", "Lio/reactivex/c;", "b", "m", "rideLock", "g", DateTokenConverter.CONVERTER_KEY, "f", "LZ84;", "Lco/bird/android/buava/Optional;", "Loe6;", "i", "h", "waitDelayMilliseconds", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lde5;", "Lde5;", "bleClient", "LhI5;", "LhI5;", "smartlockClient", "LMD;", "e", "LMD;", "baseBluetoothManager", "LEa;", "LEa;", "analyticsManager", "LYR4;", "LYR4;", "rideManager", "LTq4;", "LTq4;", "reactiveConfig", "Lgl;", "Lgl;", "preference", "LMc2;", "LMc2;", "itemLeaseManager", "LDX;", "k", "LDX;", "bluetoothManager", "La94;", "l", "La94;", "mutableCurrentlyAvailablePrimaryRideLock", "LZ84;", "()LZ84;", "currentlyAvailablePrimaryRideLock", "", "n", "Ljava/util/Set;", "scannedMacAddresses", "", "o", "Ljava/util/Map;", "connections", "Lma4;", "kotlin.jvm.PlatformType", "p", "Lma4;", "unlocksRelay", "q", "mutableUnlockErrors", "r", "unlockErrors", "s", "locksRelay", "t", "unlockOrLockingRelay", "Lkotlin/Pair;", "u", "lockScanNotificationRelay", "v", "rideEnds", "w", "tokenResponses", "x", "Lco/bird/android/model/wire/WirePhysicalLock;", "y", "Lio/reactivex/disposables/c;", "lockDisposable", "z", "Ljava/lang/Long;", "registeredTime", "Ljava/util/concurrent/atomic/AtomicInteger;", "A", "Ljava/util/concurrent/atomic/AtomicInteger;", "unlocksCount", "B", "locksCount", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ljava/lang/String;", "stateRequestToken", "D", "lockingRequestToken", "LvE2;", "E", "LvE2;", "currentTokenRequestIndexCache", "Lio/reactivex/disposables/b;", "F", "Lio/reactivex/disposables/b;", "disposables", "", "G", "Lio/reactivex/Observable;", "sharedUnlockingForRidesObservable", "H", "physicalLockScanResults", "B0", "()Lio/reactivex/Observable;", "bleState", "", "D0", "()Z", "smartLockV2Enabled", "()I", "ridePhysicalUnlockCount", "<init>", "(Landroid/content/Context;Lde5;LhI5;LMD;LEa;LYR4;LTq4;Lgl;LMc2;LDX;)V", "I", "NotConnected", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,959:1\n180#2:960\n180#2:961\n237#2:962\n180#2:963\n180#2:964\n180#2:966\n180#2:967\n237#2:968\n1#3:965\n52#4,2:969\n*S KotlinDebug\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl\n*L\n152#1:960\n161#1:961\n183#1:962\n189#1:963\n327#1:964\n348#1:966\n392#1:967\n666#1:968\n209#1:969,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SmartlockManagerImpl implements InterfaceC46193oI5 {

    /* renamed from: I */
    public static final C14383g f62870I = new C14383g(null);

    /* renamed from: J */
    public static final int f62871J = 8;

    /* renamed from: A */
    public AtomicInteger f62872A;

    /* renamed from: B */
    public AtomicInteger f62873B;

    /* renamed from: C */
    public String f62874C;

    /* renamed from: D */
    public String f62875D;

    /* renamed from: E */
    public final C50303vE2<String, Integer> f62876E;

    /* renamed from: F */
    public final C23464b f62877F;

    /* renamed from: G */
    public final Observable<List<Optional<C37099Xl5>>> f62878G;

    /* renamed from: H */
    public final Z84<Optional<Pair<C37099Xl5, C36154Tk5>>> f62879H;

    /* renamed from: b */
    public final Context f62880b;

    /* renamed from: c */
    public final AbstractC39873de5 f62881c;

    /* renamed from: d */
    public final InterfaceC42042hI5 f62882d;

    /* renamed from: e */
    public final InterfaceC5225MD f62883e;

    /* renamed from: f */
    public final InterfaceC1880Ea f62884f;

    /* renamed from: g */
    public final YR4 f62885g;

    /* renamed from: h */
    public final C36207Tq4 f62886h;

    /* renamed from: i */
    public final C22454gl f62887i;

    /* renamed from: j */
    public final InterfaceC34441Mc2 f62888j;

    /* renamed from: k */
    public final InterfaceC1510DX f62889k;

    /* renamed from: l */
    public final C37791a94<Optional<C37099Xl5>> f62890l;

    /* renamed from: m */
    public final Z84<Optional<C37099Xl5>> f62891m;

    /* renamed from: n */
    public final Set<String> f62892n;

    /* renamed from: o */
    public final Map<String, InterfaceC44023ke5> f62893o;

    /* renamed from: p */
    public final C45168ma4<Unit> f62894p;

    /* renamed from: q */
    public final C37791a94<Optional<C46396oe6>> f62895q;

    /* renamed from: r */
    public final Z84<Optional<C46396oe6>> f62896r;

    /* renamed from: s */
    public final C45168ma4<Unit> f62897s;

    /* renamed from: t */
    public final C45168ma4<Unit> f62898t;

    /* renamed from: u */
    public final C37791a94<Optional<Pair<C37099Xl5, C36154Tk5>>> f62899u;

    /* renamed from: v */
    public final C45168ma4<WirePhysicalLock> f62900v;

    /* renamed from: w */
    public final C45168ma4<String> f62901w;

    /* renamed from: x */
    public WirePhysicalLock f62902x;

    /* renamed from: y */
    public InterfaceC23465c f62903y;

    /* renamed from: z */
    public Long f62904z;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", C17296a.f69688o, "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$A */
    /* loaded from: classes2.dex */
    public static final class C14360A extends Lambda implements Function1<InterfaceC23470e, Unit> {
        public C14360A() {
            super(1);
        }

        /* renamed from: a */
        public final void m59207a(InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            if (!SmartlockManagerImpl.this.f62883e.mo73602e()) {
                C41318g46.m40163a("Attempt to disable bluetooth failed, perhaps bluetooth was already off? Continuing to attempt to enable", new Object[0]);
            }
            emitter.onComplete();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m59207a(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$B */
    /* loaded from: classes2.dex */
    public static final class C14361B extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14361B f62906g = new C14361B();

        public C14361B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while attempting to disable bluetooth during resetBluetooth call", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lde5$a;", "it", "", C17296a.f69688o, "(Lde5$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$C */
    /* loaded from: classes2.dex */
    public static final class C14362C extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Boolean> {

        /* renamed from: g */
        public static final C14362C f62907g = new C14362C();

        public C14362C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC39873de5.EnumC19828a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it != AbstractC39873de5.EnumC19828a.READY) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lde5$a;", "it", "", C17296a.f69688o, "(Lde5$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$D */
    /* loaded from: classes2.dex */
    public static final class C14363D extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Boolean> {

        /* renamed from: g */
        public static final C14363D f62908g = new C14363D();

        public C14363D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(AbstractC39873de5.EnumC19828a it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == AbstractC39873de5.EnumC19828a.READY) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$E */
    /* loaded from: classes2.dex */
    public static final class C14364E extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14364E f62909g = new C14364E();

        public C14364E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while attempting to reset bluetooth adapter.", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$F */
    /* loaded from: classes2.dex */
    public static final class C14365F extends Lambda implements Function1<Long, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C22454gl.C22456b f62911h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14365F(C22454gl.C22456b c22456b) {
            super(1);
            this.f62911h = c22456b;
        }

        /* renamed from: a */
        public final void m59204a(Long l) {
            WirePhysicalLock wirePhysicalLock;
            if (!C42149hU4.m36358a(SmartlockManagerImpl.this.f62885g.mo75057R().m73665a())) {
                C37099Xl5 m59035e = SmartlockManagerImpl.this.mo21402e().m73665a().m59035e();
                if (m59035e != null) {
                    wirePhysicalLock = m59035e.m76371b();
                } else {
                    wirePhysicalLock = null;
                }
                if (Intrinsics.areEqual(wirePhysicalLock, this.f62911h.m37542c())) {
                    String id = this.f62911h.m37542c().getId();
                    C41318g46.m40163a("clearing the last ride lock availability for lock id " + id, new Object[0]);
                    SmartlockManagerImpl.this.f62890l.accept(Optional.f63040c.m59034a());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m59204a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$G */
    /* loaded from: classes2.dex */
    public static final class C14366G extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public static final C14366G f62912g = new C14366G();

        public C14366G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C12325bE.m64814b(it) && !C12325bE.m64813c(it)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$H */
    /* loaded from: classes2.dex */
    public static final class C14367H extends Lambda implements Function1<C36154Tk5, Unit> {
        public C14367H() {
            super(1);
        }

        /* renamed from: a */
        public final void m59202a(C36154Tk5 c36154Tk5) {
            String mo17280e = c36154Tk5.m83016a().mo17280e();
            C41318g46.m40163a("smart lock result found: " + mo17280e, new Object[0]);
            Set set = SmartlockManagerImpl.this.f62892n;
            String mo17280e2 = c36154Tk5.m83016a().mo17280e();
            Intrinsics.checkNotNullExpressionValue(mo17280e2, "it.bleDevice.macAddress");
            set.add(mo17280e2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m59202a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$I */
    /* loaded from: classes2.dex */
    public static final class C14368I extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ WireSmartlock f62914g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14368I(WireSmartlock wireSmartlock) {
            super(1);
            this.f62914g = wireSmartlock;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.m83016a().mo17280e(), this.f62914g.getMacAddress()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LTk5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$J */
    /* loaded from: classes2.dex */
    public static final class C14369J extends Lambda implements Function1<C36154Tk5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ WireSmartlock f62915g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14369J(WireSmartlock wireSmartlock) {
            super(1);
            this.f62915g = wireSmartlock;
        }

        /* renamed from: a */
        public final void m59200a(C36154Tk5 c36154Tk5) {
            String id = this.f62915g.getId();
            C41318g46.m40163a("found matching scan result for lock id " + id, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36154Tk5 c36154Tk5) {
            m59200a(c36154Tk5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/buava/Optional;", "LXl5;", "kotlin.jvm.PlatformType", "list", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl$sharedUnlockingForRidesObservable$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$K */
    /* loaded from: classes2.dex */
    public static final class C14370K extends Lambda implements Function1<List<? extends Optional<C37099Xl5>>, Unit> {
        public C14370K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Optional<C37099Xl5>> list) {
            invoke2((List<Optional<C37099Xl5>>) list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 == null) goto L31;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(List<Optional<C37099Xl5>> list) {
            Object firstOrNull;
            Object lastOrNull;
            Intrinsics.checkNotNullExpressionValue(list, "list");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            Optional optional = (Optional) firstOrNull;
            if (optional != null) {
                if (!(list.size() == 2)) {
                    optional = null;
                }
            }
            optional = Optional.f63040c.m59034a();
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
            Optional optional2 = (Optional) lastOrNull;
            if (optional2 == null) {
                optional2 = Optional.f63040c.m59034a();
            }
            C41318g46.m40163a("startUnlockingForRides current list: " + list, new Object[0]);
            if (!optional2.m59037c()) {
                if (optional.m59037c()) {
                    SmartlockManagerImpl.this.f62900v.accept(((C37099Xl5) optional.m59038b()).m76371b());
                }
                C41318g46.m40163a("startUnlockingForRides: stopping unlock of " + SmartlockManagerImpl.this.f62902x + " with current lock optional being " + optional2, new Object[0]);
                SmartlockManagerImpl.this.mo21403d();
                return;
            }
            C41318g46.m40163a("startUnlockingForRides: inspecting if we have current lock available " + optional2, new Object[0]);
            Object m59038b = optional2.m59038b();
            C37099Xl5 c37099Xl5 = ((C37099Xl5) m59038b).m76371b().getSmartlock() != null ? m59038b : null;
            if (c37099Xl5 != null) {
                SmartlockManagerImpl smartlockManagerImpl = SmartlockManagerImpl.this;
                C41318g46.m40163a("startUnlockingForRides: starting unlocking of " + c37099Xl5, new Object[0]);
                smartlockManagerImpl.mo21400g(c37099Xl5);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lde5$a;", TransferTable.COLUMN_STATE, "Lio/reactivex/K;", "LTk5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lde5$a;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$L */
    /* loaded from: classes2.dex */
    public static final class C14371L extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, InterfaceC23447K<? extends C36154Tk5>> {

        /* renamed from: g */
        public final /* synthetic */ WirePhysicalLock f62917g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f62918h;

        /* renamed from: i */
        public final /* synthetic */ SmartlockManagerImpl f62919i;

        /* renamed from: j */
        public final /* synthetic */ WireSmartlock f62920j;

        /* renamed from: k */
        public final /* synthetic */ Function2<WirePhysicalLock, AbstractC39873de5.EnumC19828a, Unit> f62921k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14371L(WirePhysicalLock wirePhysicalLock, Function0<Unit> function0, SmartlockManagerImpl smartlockManagerImpl, WireSmartlock wireSmartlock, Function2<? super WirePhysicalLock, ? super AbstractC39873de5.EnumC19828a, Unit> function2) {
            super(1);
            this.f62917g = wirePhysicalLock;
            this.f62918h = function0;
            this.f62919i = smartlockManagerImpl;
            this.f62920j = wireSmartlock;
            this.f62921k = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends C36154Tk5> invoke(AbstractC39873de5.EnumC19828a state) {
            Intrinsics.checkNotNullParameter(state, "state");
            String id = this.f62917g.getId();
            AbstractC39873de5.EnumC19828a enumC19828a = AbstractC39873de5.EnumC19828a.READY;
            C41318g46.m40163a("reported blestate while attempting to listen for lock requests lock id " + id + " was " + state + ". Must be " + enumC19828a + " to proceed.", new Object[0]);
            if (state == enumC19828a) {
                C41318g46.m40163a("ble state is set to ready, we're scanning now", new Object[0]);
                this.f62918h.invoke();
                return this.f62919i.m59257d1(this.f62920j);
            }
            C41318g46.m40163a("ble state is not ready, applying side effects and waiting", new Object[0]);
            this.f62921k.invoke(this.f62917g, state);
            return AbstractC23442F.m33153M();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$M */
    /* loaded from: classes2.dex */
    public static final class C14372M extends Lambda implements Function0<Unit> {
        public C14372M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SmartlockManagerImpl.this.f62895q.accept(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "l", "Lde5$a;", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePhysicalLock;Lde5$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$N */
    /* loaded from: classes2.dex */
    public static final class C14373N extends Lambda implements Function2<WirePhysicalLock, AbstractC39873de5.EnumC19828a, Unit> {
        public C14373N() {
            super(2);
        }

        /* renamed from: a */
        public final void m59198a(WirePhysicalLock l, AbstractC39873de5.EnumC19828a state) {
            Intrinsics.checkNotNullParameter(l, "l");
            Intrinsics.checkNotNullParameter(state, "state");
            SmartlockManagerImpl.this.m59224r1(l, state);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(WirePhysicalLock wirePhysicalLock, AbstractC39873de5.EnumC19828a enumC19828a) {
            m59198a(wirePhysicalLock, enumC19828a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/manager/SmartlockManagerImpl$NotConnected;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class NotConnected extends Exception {

        /* renamed from: b */
        public static final NotConnected f62924b = new NotConnected();

        private NotConnected() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "scanResult", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(LTk5;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$O */
    /* loaded from: classes2.dex */
    public static final class C14374O extends Lambda implements Function1<C36154Tk5, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ C37099Xl5 f62925g;

        /* renamed from: h */
        public final /* synthetic */ SmartlockManagerImpl f62926h;

        /* renamed from: i */
        public final /* synthetic */ WirePhysicalLock f62927i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$O$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C14375a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UR4.values().length];
                try {
                    iArr[UR4.UNLOCK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UR4.NOTIFY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UR4.NO_OP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14374O(C37099Xl5 c37099Xl5, SmartlockManagerImpl smartlockManagerImpl, WirePhysicalLock wirePhysicalLock) {
            super(1);
            this.f62925g = c37099Xl5;
            this.f62926h = smartlockManagerImpl;
            this.f62927i = wirePhysicalLock;
        }

        /* renamed from: c */
        public static final void m59195c(SmartlockManagerImpl this$0, C37099Xl5 rideLock, C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(rideLock, "$rideLock");
            Intrinsics.checkNotNullParameter(scanResult, "$scanResult");
            this$0.m59293L0(rideLock, scanResult);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final C36154Tk5 scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            int i = C14375a.$EnumSwitchMapping$0[this.f62925g.m76370c().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return AbstractC23461c.m33039p();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC23461c m33039p = AbstractC23461c.m33039p();
                final SmartlockManagerImpl smartlockManagerImpl = this.f62926h;
                final C37099Xl5 c37099Xl5 = this.f62925g;
                return m33039p.m33029z(new InterfaceC23478a() { // from class: zJ5
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        SmartlockManagerImpl.C14374O.m59195c(SmartlockManagerImpl.this, c37099Xl5, scanResult);
                    }
                });
            }
            C41318g46.m40163a("continuing unlocking of " + scanResult, new Object[0]);
            return this.f62926h.mo21394m(scanResult, this.f62927i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$P */
    /* loaded from: classes2.dex */
    public static final class C14376P extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14376P f62928g = new C14376P();

        public C14376P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error in startUnlocking smart lock flow", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$a */
    /* loaded from: classes2.dex */
    public static final class C14377a extends Lambda implements Function1<Unit, InterfaceC24574u<? extends HM4<PhysicalLockEvent>>> {
        public C14377a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<PhysicalLockEvent>> invoke(Unit it) {
            String birdId;
            AbstractC24507p<HM4<PhysicalLockEvent>> m33125j0;
            Intrinsics.checkNotNullParameter(it, "it");
            WirePhysicalLock wirePhysicalLock = SmartlockManagerImpl.this.f62902x;
            if (wirePhysicalLock == null || (birdId = wirePhysicalLock.getBirdId()) == null || (m33125j0 = SmartlockManagerImpl.this.f62885g.mo75041h0(birdId, PhysicalLockEventKind.UNLOCKED).m33125j0()) == null) {
                return AbstractC24507p.m32024u();
            }
            return m33125j0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$b */
    /* loaded from: classes2.dex */
    public static final class C14378b extends Lambda implements Function1<Unit, InterfaceC24574u<? extends HM4<PhysicalLockEvent>>> {
        public C14378b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<PhysicalLockEvent>> invoke(Unit it) {
            String birdId;
            AbstractC24507p<HM4<PhysicalLockEvent>> m33125j0;
            Intrinsics.checkNotNullParameter(it, "it");
            WirePhysicalLock wirePhysicalLock = SmartlockManagerImpl.this.f62902x;
            if (wirePhysicalLock == null || (birdId = wirePhysicalLock.getBirdId()) == null || (m33125j0 = SmartlockManagerImpl.this.f62885g.mo75041h0(birdId, PhysicalLockEventKind.LOCKED).m33125j0()) == null) {
                return AbstractC24507p.m32024u();
            }
            return m33125j0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePhysicalLock;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$c */
    /* loaded from: classes2.dex */
    public static final class C14379c extends Lambda implements Function1<WirePhysicalLock, InterfaceC23496h> {
        public C14379c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WirePhysicalLock lock) {
            AbstractC23461c m33039p;
            AbstractC23461c m33039p2;
            Intrinsics.checkNotNullParameter(lock, "lock");
            String birdId = lock.getBirdId();
            if (birdId != null) {
                SmartlockManagerImpl smartlockManagerImpl = SmartlockManagerImpl.this;
                if (smartlockManagerImpl.f62872A.get() == 0) {
                    m33039p = smartlockManagerImpl.f62885g.mo75041h0(birdId, PhysicalLockEventKind.NOT_UNLOCKED).m33159G();
                } else {
                    m33039p = AbstractC23461c.m33039p();
                }
                if (smartlockManagerImpl.f62873B.get() == 0) {
                    m33039p2 = smartlockManagerImpl.f62885g.mo75041h0(birdId, PhysicalLockEventKind.NOT_LOCKED).m33159G();
                } else {
                    m33039p2 = AbstractC23461c.m33039p();
                }
                AbstractC23461c m33073M = AbstractC23461c.m33073M(m33039p, m33039p2);
                if (m33073M != null) {
                    return m33073M;
                }
            }
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$d */
    /* loaded from: classes2.dex */
    public static final class C14380d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14380d f62932g = new C14380d();

        public C14380d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while logging phyiscal lock event, ignoring....", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$e */
    /* loaded from: classes2.dex */
    public static final class C14381e extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C14381e f62933g = new C14381e();

        public C14381e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabledV2", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$f */
    /* loaded from: classes2.dex */
    public static final class C14382f extends Lambda implements Function1<Boolean, Unit> {
        public C14382f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabledV2) {
            Intrinsics.checkNotNullExpressionValue(enabledV2, "enabledV2");
            if (enabledV2.booleanValue()) {
                C41318g46.m40163a("disabling legacy smart lock manager flow", new Object[0]);
                SmartlockManagerImpl.this.f62877F.m33026d();
                return;
            }
            C41318g46.m40163a("enabling legacy smart lock manager flow", new Object[0]);
            SmartlockManagerImpl.this.m59263a1();
            SmartlockManagerImpl.this.m59305F0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"Lco/bird/android/app/manager/SmartlockManagerImpl$g;", "", "", "ENABLE_BLUETOOTH_TIMEOUT_MS", "J", "", "LEASE_DUE_BUFER_TTL_SECONDS", "I", "POST_SCAN_CONNECTION_DELAY_MS", "SECONDS_BETWEEN_UNLOCK_ATTEMPTS", "SMARTLOCK_TOKEN_REQUEST_TIMEOUT_SECONDS", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$g */
    /* loaded from: classes2.dex */
    public static final class C14383g {
        public /* synthetic */ C14383g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14383g() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/manager/SmartlockManagerImpl$h;", "", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$h */
    /* loaded from: classes2.dex */
    public static final class C14384h extends Throwable {

        /* renamed from: b */
        public static final C14384h f62935b = new C14384h();

        private C14384h() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum c uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/manager/SmartlockManagerImpl$i;", "", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "uuid", "<init>", "(Ljava/lang/String;ILjava/util/UUID;)V", "c", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$i */
    /* loaded from: classes2.dex */
    public static final class EnumC14385i {

        /* renamed from: c */
        public static final EnumC14385i f62936c;

        /* renamed from: d */
        public static final EnumC14385i f62937d;

        /* renamed from: e */
        public static final /* synthetic */ EnumC14385i[] f62938e;

        /* renamed from: b */
        public final UUID f62939b;

        static {
            UUID fromString = UUID.fromString("000036f5-0000-1000-8000-00805f9b34fb");
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(\"000036f5-0000-1000-8000-00805f9b34fb\")");
            f62936c = new EnumC14385i("WRITE", 0, fromString);
            UUID fromString2 = UUID.fromString("000036f6-0000-1000-8000-00805f9b34fb");
            Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(\"000036f6-0000-1000-8000-00805f9b34fb\")");
            f62937d = new EnumC14385i("NOTIFY", 1, fromString2);
            f62938e = m59191a();
        }

        public EnumC14385i(String str, int i, UUID uuid) {
            this.f62939b = uuid;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC14385i[] m59191a() {
            return new EnumC14385i[]{f62936c, f62937d};
        }

        public static EnumC14385i valueOf(String str) {
            return (EnumC14385i) Enum.valueOf(EnumC14385i.class, str);
        }

        public static EnumC14385i[] values() {
            return (EnumC14385i[]) f62938e.clone();
        }

        /* renamed from: b */
        public final UUID m59190b() {
            return this.f62939b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$j */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C14386j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC39873de5.EnumC19828a.values().length];
            try {
                iArr[AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC39873de5.EnumC19828a.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC39873de5.EnumC19828a.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lke5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$k */
    /* loaded from: classes2.dex */
    public static final class C14387k extends Lambda implements Function1<InterfaceC44023ke5, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireSmartlock f62941h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14387k(WireSmartlock wireSmartlock) {
            super(1);
            this.f62941h = wireSmartlock;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC44023ke5 interfaceC44023ke5) {
            invoke2(interfaceC44023ke5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC44023ke5 it) {
            SmartlockManagerImpl smartlockManagerImpl = SmartlockManagerImpl.this;
            WireSmartlock wireSmartlock = this.f62941h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            smartlockManagerImpl.m59259c1(wireSmartlock, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lke5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$l */
    /* loaded from: classes2.dex */
    public static final class C14388l extends Lambda implements Function1<InterfaceC44023ke5, Unit> {

        /* renamed from: g */
        public static final C14388l f62942g = new C14388l();

        public C14388l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC44023ke5 interfaceC44023ke5) {
            invoke2(interfaceC44023ke5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC44023ke5 interfaceC44023ke5) {
            C41318g46.m40163a("connected", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/B;", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke", "(Lke5;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$m */
    /* loaded from: classes2.dex */
    public static final class C14389m extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23434B<? extends Observable<byte[]>>> {

        /* renamed from: h */
        public final /* synthetic */ WireSmartlock f62944h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14389m(WireSmartlock wireSmartlock) {
            super(1);
            this.f62944h = wireSmartlock;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Observable<byte[]>> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SmartlockManagerImpl.this.m59307E0(this.f62944h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "notificationObservable", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n */
    /* loaded from: classes2.dex */
    public static final class C14390n extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends byte[]>> {

        /* renamed from: g */
        public final /* synthetic */ WireSmartlock f62945g;

        /* renamed from: h */
        public final /* synthetic */ SmartlockManagerImpl f62946h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n$a */
        /* loaded from: classes2.dex */
        public static final class C14391a extends Lambda implements Function1<byte[], InterfaceC23447K<? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockManagerImpl f62947g;

            /* renamed from: h */
            public final /* synthetic */ WireSmartlock f62948h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "smartlockId", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n$a$a */
            /* loaded from: classes2.dex */
            public static final class C14392a extends Lambda implements Function1<String, Boolean> {

                /* renamed from: g */
                public final /* synthetic */ WireSmartlock f62949g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14392a(WireSmartlock wireSmartlock) {
                    super(1);
                    this.f62949g = wireSmartlock;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(String smartlockId) {
                    Intrinsics.checkNotNullParameter(smartlockId, "smartlockId");
                    return Boolean.valueOf(Intrinsics.areEqual(smartlockId, this.f62949g.getId()));
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n$a$b */
            /* loaded from: classes2.dex */
            public static final class C14393b extends Lambda implements Function1<String, Unit> {

                /* renamed from: g */
                public static final C14393b f62950g = new C14393b();

                public C14393b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    C41318g46.m40163a("received response to token request", new Object[0]);
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n$a$c */
            /* loaded from: classes2.dex */
            public static final class C14394c extends Lambda implements Function1<Long, InterfaceC23434B<? extends String>> {

                /* renamed from: g */
                public static final C14394c f62951g = new C14394c();

                public C14394c() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final InterfaceC23434B<? extends String> invoke(Long it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    C41318g46.m40160d("did not receive a token response within timeout!", new Object[0]);
                    return Observable.error(new TimeoutException("did not receive a token response within timeout"));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14391a(SmartlockManagerImpl smartlockManagerImpl, WireSmartlock wireSmartlock) {
                super(1);
                this.f62947g = smartlockManagerImpl;
                this.f62948h = wireSmartlock;
            }

            /* renamed from: d */
            public static final void m59176d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: e */
            public static final InterfaceC23434B m59175e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23434B) tmp0.invoke(obj);
            }

            public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends String> invoke(byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C41318g46.m40163a("sent token request for lock...", new Object[0]);
                C45168ma4 c45168ma4 = this.f62947g.f62901w;
                final C14392a c14392a = new C14392a(this.f62948h);
                Observable<T> filter = c45168ma4.filter(new InterfaceC23494q() { // from class: lJ5
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean invoke$lambda$0;
                        invoke$lambda$0 = SmartlockManagerImpl.C14390n.C14391a.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                final C14393b c14393b = C14393b.f62950g;
                Observable doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: mJ5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        SmartlockManagerImpl.C14390n.C14391a.m59176d(Function1.this, obj);
                    }
                });
                Observable<Long> timer = Observable.timer(2L, TimeUnit.SECONDS);
                final C14394c c14394c = C14394c.f62951g;
                return Observable.merge(doOnNext, timer.flatMap(new InterfaceC23492o() { // from class: nJ5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m59175e;
                        m59175e = SmartlockManagerImpl.C14390n.C14391a.m59175e(Function1.this, obj);
                        return m59175e;
                    }
                })).firstOrError();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "exception", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSmartlockManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl$continueUnlocking$3$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n$b */
        /* loaded from: classes2.dex */
        public static final class C14395b extends Lambda implements Function1<Throwable, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ WireSmartlock f62952g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14395b(WireSmartlock wireSmartlock) {
                super(1);
                this.f62952g = wireSmartlock;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Throwable exception) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                boolean z3 = false;
                if (exception instanceof TimeoutException) {
                    List<String> tokenRequests = this.f62952g.getTokenRequests();
                    if (tokenRequests != null) {
                        if (tokenRequests.size() > 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            z = true;
                            if (z) {
                                z3 = true;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                return Boolean.valueOf(z3);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)[B"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n$c */
        /* loaded from: classes2.dex */
        public static final class C14396c extends Lambda implements Function1<String, byte[]> {

            /* renamed from: g */
            public static final C14396c f62953g = new C14396c();

            public C14396c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final byte[] invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new byte[0];
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "byteArray", "", C17296a.f69688o, "([B)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$n$d */
        /* loaded from: classes2.dex */
        public static final class C14397d extends Lambda implements Function1<byte[], Boolean> {

            /* renamed from: g */
            public static final C14397d f62954g = new C14397d();

            public C14397d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(byte[] byteArray) {
                boolean z;
                Intrinsics.checkNotNullParameter(byteArray, "byteArray");
                if (byteArray.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(!z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14390n(WireSmartlock wireSmartlock, SmartlockManagerImpl smartlockManagerImpl) {
            super(1);
            this.f62945g = wireSmartlock;
            this.f62946h = smartlockManagerImpl;
        }

        /* renamed from: f */
        public static final InterfaceC23434B m59184f(SmartlockManagerImpl this$0, WireSmartlock smartlock) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(smartlock, "$smartlock");
            C41318g46.m40163a("sending token request for lock now...", new Object[0]);
            return this$0.m59243k1(smartlock).m33123k0();
        }

        /* renamed from: g */
        public static final InterfaceC23447K m59183g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final boolean m59182h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: i */
        public static final byte[] m59181i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (byte[]) tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final boolean m59180j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends byte[]> invoke(Observable<byte[]> notificationObservable) {
            Intrinsics.checkNotNullParameter(notificationObservable, "notificationObservable");
            C41318g46.m40163a("notification listener set up", new Object[0]);
            final SmartlockManagerImpl smartlockManagerImpl = this.f62946h;
            final WireSmartlock wireSmartlock = this.f62945g;
            Observable defer = Observable.defer(new Callable() { // from class: gJ5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23434B m59184f;
                    m59184f = SmartlockManagerImpl.C14390n.m59184f(SmartlockManagerImpl.this, wireSmartlock);
                    return m59184f;
                }
            });
            final C14391a c14391a = new C14391a(this.f62946h, this.f62945g);
            Observable flatMapSingle = defer.flatMapSingle(new InterfaceC23492o() { // from class: hJ5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m59183g;
                    m59183g = SmartlockManagerImpl.C14390n.m59183g(Function1.this, obj);
                    return m59183g;
                }
            });
            List<String> tokenRequests = this.f62945g.getTokenRequests();
            long size = tokenRequests != null ? tokenRequests.size() - 1 : 0L;
            final C14395b c14395b = new C14395b(this.f62945g);
            Observable retry = flatMapSingle.retry(size, new InterfaceC23494q() { // from class: iJ5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m59182h;
                    m59182h = SmartlockManagerImpl.C14390n.m59182h(Function1.this, obj);
                    return m59182h;
                }
            });
            final C14396c c14396c = C14396c.f62953g;
            Observable merge = Observable.merge(retry.map(new InterfaceC23492o() { // from class: jJ5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    byte[] m59181i;
                    m59181i = SmartlockManagerImpl.C14390n.m59181i(Function1.this, obj);
                    return m59181i;
                }
            }).onErrorReturnItem(new byte[0]), notificationObservable);
            final C14397d c14397d = C14397d.f62954g;
            return merge.filter(new InterfaceC23494q() { // from class: kJ5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m59180j;
                    m59180j = SmartlockManagerImpl.C14390n.m59180j(Function1.this, obj);
                    return m59180j;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "message", "Lio/reactivex/K;", "Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$o */
    /* loaded from: classes2.dex */
    public static final class C14398o extends Lambda implements Function1<byte[], InterfaceC23447K<? extends NokelockResponse>> {

        /* renamed from: h */
        public final /* synthetic */ WireSmartlock f62956h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$o$a */
        /* loaded from: classes2.dex */
        public static final class C14399a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C14399a f62957g = new C14399a();

            public C14399a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40158f(th, "Error while attempting to parse smart lock message via API", new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14398o(WireSmartlock wireSmartlock) {
            super(1);
            this.f62956h = wireSmartlock;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends NokelockResponse> invoke(byte[] message) {
            Intrinsics.checkNotNullParameter(message, "message");
            SmartlockManagerImpl.this.f62901w.accept(this.f62956h.getId());
            C41318g46.m40163a("got a message from the lock " + message, new Object[0]);
            AbstractC23442F m59285P0 = SmartlockManagerImpl.this.m59285P0(this.f62956h, message);
            final C14399a c14399a = C14399a.f62957g;
            return m59285P0.m33106t(new InterfaceC23484g() { // from class: oJ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockManagerImpl.C14398o.invoke$lambda$0(Function1.this, obj);
                }
            }).m33140a0(30L, TimeUnit.SECONDS).m33146T(3L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/NokelockResponse;", "kotlin.jvm.PlatformType", "nokelockResponse", "", C17296a.f69688o, "(Lco/bird/api/response/NokelockResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$p */
    /* loaded from: classes2.dex */
    public static final class C14400p extends Lambda implements Function1<NokelockResponse, Unit> {
        public C14400p() {
            super(1);
        }

        /* renamed from: a */
        public final void m59170a(NokelockResponse nokelockResponse) {
            C41318g46.m40163a("nokelock response received: " + nokelockResponse, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(nokelockResponse, "nokelockResponse");
            if (NokelockResponseKt.isUnlockedOrLocking(nokelockResponse)) {
                C41318g46.m40163a("response was unlocked or locking type", new Object[0]);
                SmartlockManagerImpl.this.f62898t.accept(Unit.INSTANCE);
            } else {
                C41318g46.m40163a("response type unknown", new Object[0]);
            }
            if (NokelockResponseKt.isUnlocked(nokelockResponse)) {
                C41318g46.m40163a("response was unlocked type", new Object[0]);
                SmartlockManagerImpl.this.m59289N0();
            }
            if (NokelockResponseKt.isLocked(nokelockResponse)) {
                C41318g46.m40163a("response was locked type", new Object[0]);
                SmartlockManagerImpl.this.m59291M0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NokelockResponse nokelockResponse) {
            m59170a(nokelockResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/response/NokelockResponse;", "response", "", C17296a.f69688o, "(Lco/bird/api/response/NokelockResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$q */
    /* loaded from: classes2.dex */
    public static final class C14401q extends Lambda implements Function1<NokelockResponse, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ WirePhysicalLock f62959g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14401q(WirePhysicalLock wirePhysicalLock) {
            super(1);
            this.f62959g = wirePhysicalLock;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
            if (r5.getType() == co.bird.android.model.constant.NokelockResponseType.LOCKING_RESPONSE) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
            if (((co.bird.android.model.wire.WireNokelockStateData) r5).isLocked() != false) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(NokelockResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            boolean z = true;
            if (AJ5.m115918a(this.f62959g)) {
                if (response.getType() == NokelockResponseType.STATE_RESPONSE) {
                    WireNokelockResponseData data = response.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockStateData");
                }
                z = false;
            }
            C41318g46.m40163a("received a update that should trigger disconnection? " + z, new Object[0]);
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/NokelockResponse;", "response", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/NokelockResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$r */
    /* loaded from: classes2.dex */
    public static final class C14402r extends Lambda implements Function1<NokelockResponse, InterfaceC23447K<? extends Object>> {

        /* renamed from: h */
        public final /* synthetic */ WireSmartlock f62961h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14402r(WireSmartlock wireSmartlock) {
            super(1);
            this.f62961h = wireSmartlock;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Object> invoke(NokelockResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.getType() == NokelockResponseType.TOKEN_RESPONSE) {
                C41318g46.m40163a("token response received, sending unlock request", new Object[0]);
                WireNokelockResponseData data = response.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockTokenResponseData");
                WireNokelockTokenResponseData wireNokelockTokenResponseData = (WireNokelockTokenResponseData) data;
                SmartlockManagerImpl.this.f62874C = wireNokelockTokenResponseData.getStateRequest();
                SmartlockManagerImpl.this.f62875D = wireNokelockTokenResponseData.getLockingRequest();
                return SmartlockManagerImpl.this.m59245j1(this.f62961h, wireNokelockTokenResponseData.getUnlockRequest());
            }
            String str = null;
            if (response.getType() == NokelockResponseType.INSERTED_NOTIFICATION) {
                String str2 = SmartlockManagerImpl.this.f62874C;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stateRequestToken");
                    str2 = null;
                }
                C41318g46.m40163a("inserted notification response received, sending state request token " + str2, new Object[0]);
                SmartlockManagerImpl smartlockManagerImpl = SmartlockManagerImpl.this;
                WireSmartlock wireSmartlock = this.f62961h;
                String str3 = smartlockManagerImpl.f62874C;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stateRequestToken");
                } else {
                    str = str3;
                }
                return smartlockManagerImpl.m59245j1(wireSmartlock, str).m33118n(3L, TimeUnit.SECONDS);
            } else if (response.getType() == NokelockResponseType.STATE_RESPONSE && !NokelockResponseKt.isLocked(response)) {
                String str4 = SmartlockManagerImpl.this.f62875D;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lockingRequestToken");
                    str4 = null;
                }
                C41318g46.m40163a("state response received and unlocked, sending request to lock " + str4, new Object[0]);
                SmartlockManagerImpl smartlockManagerImpl2 = SmartlockManagerImpl.this;
                WireSmartlock wireSmartlock2 = this.f62961h;
                String str5 = smartlockManagerImpl2.f62875D;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lockingRequestToken");
                } else {
                    str = str5;
                }
                return smartlockManagerImpl2.m59245j1(wireSmartlock2, str);
            } else {
                C41318g46.m40163a("unknown response received, ignoring (" + response + ")", new Object[0]);
                return AbstractC23442F.m33158H(Unit.INSTANCE);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$s */
    /* loaded from: classes2.dex */
    public static final class C14403s extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireSmartlock f62963h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14403s(WireSmartlock wireSmartlock) {
            super(1);
            this.f62963h = wireSmartlock;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C41318g46.m40158f(it, "Error received while connected to smart lock", new Object[0]);
            SmartlockManagerImpl smartlockManagerImpl = SmartlockManagerImpl.this;
            WireSmartlock wireSmartlock = this.f62963h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            smartlockManagerImpl.m59287O0(wireSmartlock, it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/k;", "", "kotlin.jvm.PlatformType", "it", "Lna4;", "b", "(Lio/reactivex/k;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$t */
    /* loaded from: classes2.dex */
    public static final class C14404t extends Lambda implements Function1<AbstractC24490k<Throwable>, InterfaceC45761na4<?>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lna4;", "Lde5$a;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/Throwable;)Lna4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$t$a */
        /* loaded from: classes2.dex */
        public static final class C14405a extends Lambda implements Function1<Throwable, InterfaceC45761na4<? extends AbstractC39873de5.EnumC19828a>> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockManagerImpl f62965g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lde5$a;", "kotlin.jvm.PlatformType", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(Lde5$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$t$a$a */
            /* loaded from: classes2.dex */
            public static final class C14406a extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Unit> {

                /* renamed from: g */
                public static final C14406a f62966g = new C14406a();

                public C14406a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m59160a(AbstractC39873de5.EnumC19828a enumC19828a) {
                    C41318g46.m40163a("ble state is " + enumC19828a, new Object[0]);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbstractC39873de5.EnumC19828a enumC19828a) {
                    m59160a(enumC19828a);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lde5$a;", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(Lde5$a;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$t$a$b */
            /* loaded from: classes2.dex */
            public static final class C14407b extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Boolean> {

                /* renamed from: g */
                public static final C14407b f62967g = new C14407b();

                public C14407b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Boolean invoke(AbstractC39873de5.EnumC19828a state) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(state, "state");
                    if (state == AbstractC39873de5.EnumC19828a.READY) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14405a(SmartlockManagerImpl smartlockManagerImpl) {
                super(1);
                this.f62965g = smartlockManagerImpl;
            }

            /* renamed from: d */
            public static final boolean m59161d(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC45761na4<? extends AbstractC39873de5.EnumC19828a> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC39873de5.EnumC19828a mo33641c = this.f62965g.f62881c.mo33641c();
                AbstractC39873de5.EnumC19828a enumC19828a = AbstractC39873de5.EnumC19828a.READY;
                if (mo33641c == enumC19828a) {
                    return AbstractC24490k.m32123o0(enumC19828a);
                }
                Observable m59313B0 = this.f62965g.m59313B0();
                final C14406a c14406a = C14406a.f62966g;
                Observable doOnNext = m59313B0.doOnNext(new InterfaceC23484g() { // from class: qJ5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        SmartlockManagerImpl.C14404t.C14405a.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C14407b c14407b = C14407b.f62967g;
                return doOnNext.filter(new InterfaceC23494q() { // from class: rJ5
                    @Override // io.reactivex.functions.InterfaceC23494q
                    public final boolean test(Object obj) {
                        boolean m59161d;
                        m59161d = SmartlockManagerImpl.C14404t.C14405a.m59161d(Function1.this, obj);
                        return m59161d;
                    }
                }).toFlowable(EnumC23460b.LATEST);
            }
        }

        public C14404t() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC45761na4 m59165c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC45761na4) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC45761na4<?> invoke(AbstractC24490k<Throwable> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC24490k<Throwable> m32103v = it.m32103v(5L, TimeUnit.SECONDS);
            final C14405a c14405a = new C14405a(SmartlockManagerImpl.this);
            return m32103v.m32167W(new InterfaceC23492o() { // from class: pJ5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC45761na4 m59165c;
                    m59165c = SmartlockManagerImpl.C14404t.m59165c(Function1.this, obj);
                    return m59165c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "attempt", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$u */
    /* loaded from: classes2.dex */
    public static final class C14408u extends Lambda implements Function1<Long, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ C36154Tk5 f62968g;

        /* renamed from: h */
        public final /* synthetic */ SmartlockManagerImpl f62969h;

        /* renamed from: i */
        public final /* synthetic */ WirePhysicalLock f62970i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$u$a */
        /* loaded from: classes2.dex */
        public static final class C14409a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Long f62971g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14409a(Long l) {
                super(1);
                this.f62971g = l;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Long l = this.f62971g;
                C41318g46.m40161c(th, "Error while attempting to continue unlocking for attempt #" + l, new Object[0]);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14408u(C36154Tk5 c36154Tk5, SmartlockManagerImpl smartlockManagerImpl, WirePhysicalLock wirePhysicalLock) {
            super(1);
            this.f62968g = c36154Tk5;
            this.f62969h = smartlockManagerImpl;
            this.f62970i = wirePhysicalLock;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Long attempt) {
            Intrinsics.checkNotNullParameter(attempt, "attempt");
            String mo17280e = this.f62968g.m83016a().mo17280e();
            C41318g46.m40163a("attempting to continue unlocking " + mo17280e + " (attempt #" + attempt + ")", new Object[0]);
            AbstractC23461c m33061Z = this.f62969h.mo21394m(this.f62968g, this.f62970i).m33061Z(10L, TimeUnit.SECONDS);
            final C14409a c14409a = new C14409a(attempt);
            return m33061Z.m33084B(new InterfaceC23484g() { // from class: sJ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockManagerImpl.C14408u.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$v */
    /* loaded from: classes2.dex */
    public static final class C14410v extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14410v f62972g = new C14410v();

        public C14410v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40163a("failed to refresh active queries while initing listenForRideStateChanges", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "rideStateOptional", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$w */
    /* loaded from: classes2.dex */
    public static final class C14411w extends Lambda implements Function1<Optional<RideState>, Boolean> {

        /* renamed from: g */
        public static final C14411w f62973g = new C14411w();

        public C14411w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<RideState> rideStateOptional) {
            Intrinsics.checkNotNullParameter(rideStateOptional, "rideStateOptional");
            return Boolean.valueOf(C42149hU4.m36358a(rideStateOptional));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$y */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C14419y extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C14419y f62982b = new C14419y();

        public C14419y() {
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
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$z */
    /* loaded from: classes2.dex */
    public static final class C14420z<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C14420z<T1, T2, R> f62983a = new C14420z<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    public SmartlockManagerImpl(Context context, AbstractC39873de5 bleClient, InterfaceC42042hI5 smartlockClient, InterfaceC5225MD baseBluetoothManager, InterfaceC1880Ea analyticsManager, YR4 rideManager, C36207Tq4 reactiveConfig, C22454gl preference, InterfaceC34441Mc2 itemLeaseManager, InterfaceC1510DX bluetoothManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bleClient, "bleClient");
        Intrinsics.checkNotNullParameter(smartlockClient, "smartlockClient");
        Intrinsics.checkNotNullParameter(baseBluetoothManager, "baseBluetoothManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(itemLeaseManager, "itemLeaseManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        this.f62880b = context;
        this.f62881c = bleClient;
        this.f62882d = smartlockClient;
        this.f62883e = baseBluetoothManager;
        this.f62884f = analyticsManager;
        this.f62885g = rideManager;
        this.f62886h = reactiveConfig;
        this.f62887i = preference;
        this.f62888j = itemLeaseManager;
        this.f62889k = bluetoothManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        C37791a94<Optional<C37099Xl5>> create$default = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f62890l = create$default;
        Z84.C10119a c10119a = Z84.f47888d;
        this.f62891m = c10119a.m73663b(create$default);
        this.f62892n = new LinkedHashSet();
        this.f62893o = new LinkedHashMap();
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f62894p = m25409g;
        C37791a94<Optional<C46396oe6>> create$default2 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f62895q = create$default2;
        this.f62896r = c10119a.m73663b(create$default2);
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f62897s = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.f62898t = m25409g3;
        C37791a94<Optional<Pair<C37099Xl5, C36154Tk5>>> create$default3 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f62899u = create$default3;
        C45168ma4<WirePhysicalLock> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create<WirePhysicalLock>()");
        this.f62900v = m25409g4;
        C45168ma4<String> m25409g5 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g5, "create<String>()");
        this.f62901w = m25409g5;
        this.f62872A = new AtomicInteger(0);
        this.f62873B = new AtomicInteger(0);
        this.f62876E = new C50303vE2<>(5);
        this.f62877F = new C23464b();
        final C14377a c14377a = new C14377a();
        Observable<R> flatMapMaybe = m25409g.flatMapMaybe(new InterfaceC23492o() { // from class: cJ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m59256e0;
                m59256e0 = SmartlockManagerImpl.m59256e0(Function1.this, obj);
                return m59256e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "unlocksRelay\n      .flat… ?: Maybe.empty()\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = flatMapMaybe.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        final C14378b c14378b = new C14378b();
        Observable<R> flatMapMaybe2 = m25409g2.flatMapMaybe(new InterfaceC23492o() { // from class: dJ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m59254f0;
                m59254f0 = SmartlockManagerImpl.m59254f0(Function1.this, obj);
                return m59254f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe2, "locksRelay\n      .flatMa… ?: Maybe.empty()\n      }");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as2 = flatMapMaybe2.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        final C14379c c14379c = new C14379c();
        AbstractC23461c flatMapCompletable = m25409g4.flatMapCompletable(new InterfaceC23492o() { // from class: eJ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m59252g0;
                m59252g0 = SmartlockManagerImpl.m59252g0(Function1.this, obj);
                return m59252g0;
            }
        });
        final C14380d c14380d = C14380d.f62932g;
        AbstractC23461c m33069Q = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: fJ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59250h0(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "rideEnds\n      .flatMapC…\n      .onErrorComplete()");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Z84<Config> m82623f8 = reactiveConfig.m82623f8();
        final C14381e c14381e = C14381e.f62933g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: qI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m59248i0;
                m59248i0 = SmartlockManagerImpl.m59248i0(Function1.this, obj);
                return m59248i0;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "reactiveConfig.config\n  …  .distinctUntilChanged()");
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as3 = distinctUntilChanged.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14382f c14382f = new C14382f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: rI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59246j0(Function1.this, obj);
            }
        });
        Observable m74549j0 = C37279Yf5.m74549j0(mo21402e(), 2, true);
        final C14370K c14370k = new C14370K();
        Observable<List<Optional<C37099Xl5>>> share = m74549j0.doOnNext(new InterfaceC23484g() { // from class: sI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59241l1(Function1.this, obj);
            }
        }).share();
        Intrinsics.checkNotNullExpressionValue(share, "currentlyAvailablePrimar… }\n      }\n      .share()");
        this.f62878G = share;
        this.f62879H = c10119a.m73663b(create$default3);
    }

    /* renamed from: G0 */
    public static final void m59303G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m59301H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final InterfaceC23434B m59299I0(SmartlockManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Z84<Optional<RideState>> mo75057R = this$0.f62885g.mo75057R();
        final C14411w c14411w = C14411w.f62973g;
        Observable<Optional<RideState>> distinctUntilChanged = mo75057R.distinctUntilChanged(new InterfaceC23492o() { // from class: BI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m59297J0;
                m59297J0 = SmartlockManagerImpl.m59297J0(Function1.this, obj);
                return m59297J0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "rideManager.primaryRideS…tateOptional.isInRide() }");
        Observable combineLatest = Observable.combineLatest(distinctUntilChanged, this$0.f62888j.mo55656s(), C14420z.f62983a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        return combineLatest;
    }

    /* renamed from: J0 */
    public static final Boolean m59297J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final InterfaceC23434B m59295K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: R0 */
    public static final void m59281R0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final InterfaceC23496h m59279S0(SmartlockManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Observable<AbstractC39873de5.EnumC19828a> m59313B0 = this$0.m59313B0();
        final C14362C c14362c = C14362C.f62907g;
        return m59313B0.filter(new InterfaceC23494q() { // from class: ZI5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59277T0;
                m59277T0 = SmartlockManagerImpl.m59277T0(Function1.this, obj);
                return m59277T0;
            }
        }).firstOrError().m33159G().m33069Q();
    }

    /* renamed from: T0 */
    public static final boolean m59277T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: U0 */
    public static final InterfaceC23496h m59275U0(long j) {
        return AbstractC23461c.m33057c0(j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: V0 */
    public static final void m59273V0(SmartlockManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f62883e.mo73603d()) {
            C41318g46.m40160d("Attempt to enable bluetooth failed, perhaps bluetooth was already on or airplane mode is on?", new Object[0]);
        }
    }

    /* renamed from: W0 */
    public static final InterfaceC23496h m59271W0(SmartlockManagerImpl this$0, final long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Observable<AbstractC39873de5.EnumC19828a> m59313B0 = this$0.m59313B0();
        final C14363D c14363d = C14363D.f62908g;
        return m59313B0.filter(new InterfaceC23494q() { // from class: XI5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59269X0;
                m59269X0 = SmartlockManagerImpl.m59269X0(Function1.this, obj);
                return m59269X0;
            }
        }).firstOrError().m33159G().m33069Q().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: YI5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m59267Y0;
                m59267Y0 = SmartlockManagerImpl.m59267Y0(j);
                return m59267Y0;
            }
        })).m33061Z(5000L, TimeUnit.MILLISECONDS).m33069Q();
    }

    /* renamed from: X0 */
    public static final boolean m59269X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Y0 */
    public static final InterfaceC23496h m59267Y0(long j) {
        return AbstractC23461c.m33057c0(j * 2, TimeUnit.MILLISECONDS);
    }

    /* renamed from: Z0 */
    public static final void m59265Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b1 */
    public static final void m59261b1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC24574u m59256e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final boolean m59255e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: f0 */
    public static final InterfaceC24574u m59254f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: f1 */
    public static final void m59253f1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23496h m59252g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g1 */
    public static final void m59251g1() {
        C41318g46.m40163a("scan subscription dispose", new Object[0]);
    }

    /* renamed from: h0 */
    public static final void m59250h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final boolean m59249h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: i0 */
    public static final Boolean m59248i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final void m59247i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m59246j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m59242l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l1 */
    public static final void m59241l1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m59240m0(SmartlockManagerImpl this$0, WireSmartlock lock) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lock, "$lock");
        this$0.m59283Q0(lock);
    }

    /* renamed from: n1 */
    public static final InterfaceC23447K m59236n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m59234o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o1 */
    public static final InterfaceC23496h m59233o1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23434B m59231p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p1 */
    public static final void m59230p1() {
    }

    /* renamed from: q0 */
    public static final InterfaceC23434B m59228q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m59227q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final InterfaceC23447K m59225r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m59222s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final boolean m59220t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u0 */
    public static final InterfaceC23447K m59218u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m59216v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final InterfaceC45761na4 m59214w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC45761na4) tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final InterfaceC23496h m59212x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: A0 */
    public final byte[] m59315A0(String str) {
        byte[] m108180a = C2029Ey.m108182a().m108180a(str);
        Intrinsics.checkNotNullExpressionValue(m108180a, "getDecoder().decode(this)");
        return m108180a;
    }

    /* renamed from: B0 */
    public final Observable<AbstractC39873de5.EnumC19828a> m59313B0() {
        return this.f62881c.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) this.f62881c.mo33641c());
    }

    /* renamed from: C0 */
    public final String m59311C0(WireSmartlock wireSmartlock) {
        String str;
        if (!Intrinsics.areEqual(this.f62886h.m82623f8().m73665a().getEnableMultipleSmartlockKeys(), Boolean.TRUE) && wireSmartlock.getTokenRequest() != null) {
            str = wireSmartlock.getTokenRequest();
        } else {
            Integer m8993d = this.f62876E.m8993d(wireSmartlock.getId());
            if (m8993d == null) {
                m8993d = 0;
            }
            int intValue = m8993d.intValue();
            List<String> tokenRequests = wireSmartlock.getTokenRequests();
            if (tokenRequests != null) {
                this.f62876E.m8992e(wireSmartlock.getId(), Integer.valueOf(intValue + 1));
                str = tokenRequests.get(intValue % tokenRequests.size());
            } else {
                str = null;
            }
        }
        C41318g46.m40163a("Using " + str + " as the next token to try in a token request to lock", new Object[0]);
        return str;
    }

    /* renamed from: D0 */
    public final boolean m59309D0() {
        return Intrinsics.areEqual(this.f62886h.m82623f8().m73665a().getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE);
    }

    /* renamed from: E0 */
    public final Observable<Observable<byte[]>> m59307E0(WireSmartlock wireSmartlock) {
        InterfaceC44023ke5 m59237n0 = m59237n0(wireSmartlock);
        Observable<Observable<byte[]>> mo27055d = m59237n0 != null ? m59237n0.mo27055d(EnumC14385i.f62937d.m59190b()) : null;
        if (mo27055d == null) {
            Observable<Observable<byte[]>> error = Observable.error(NotConnected.f62924b);
            Intrinsics.checkNotNullExpressionValue(error, "error(NotConnected)");
            return error;
        }
        return mo27055d;
    }

    /* renamed from: F0 */
    public final InterfaceC23465c m59305F0() {
        AbstractC23461c mo55682b = this.f62888j.mo55682b();
        final C14410v c14410v = C14410v.f62972g;
        Observable m33043l = mo55682b.m33084B(new InterfaceC23484g() { // from class: tI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59301H0(Function1.this, obj);
            }
        }).m33069Q().m33043l(Observable.defer(new Callable() { // from class: uI5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m59299I0;
                m59299I0 = SmartlockManagerImpl.m59299I0(SmartlockManagerImpl.this);
                return m59299I0;
            }
        }));
        final C14412x c14412x = new C14412x();
        Observable switchMap = m33043l.switchMap(new InterfaceC23492o() { // from class: vI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m59295K0;
                m59295K0 = SmartlockManagerImpl.m59295K0(Function1.this, obj);
                return m59295K0;
            }
        });
        final C14419y c14419y = C14419y.f62982b;
        Observable onErrorReturnItem = switchMap.doOnError(new InterfaceC23484g() { // from class: wI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59303G0(Function1.this, obj);
            }
        }).onErrorReturnItem(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "private fun listenForRid…D)\n      .subscribe()\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = onErrorReturnItem.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        InterfaceC23465c subscribe = ((ObservableSubscribeProxy) m33094as).subscribe();
        Intrinsics.checkNotNullExpressionValue(subscribe, "private fun listenForRid…D)\n      .subscribe()\n  }");
        return subscribe;
    }

    /* renamed from: L0 */
    public final void m59293L0(C37099Xl5 c37099Xl5, C36154Tk5 c36154Tk5) {
        this.f62899u.accept(Optional.f63040c.m59032c(TuplesKt.m28425to(c37099Xl5, c36154Tk5)));
    }

    /* renamed from: M0 */
    public final void m59291M0() {
        C41318g46.m40163a("onLockLocked called", new Object[0]);
        this.f62897s.accept(Unit.INSTANCE);
        this.f62873B.incrementAndGet();
        InterfaceC1880Ea interfaceC1880Ea = this.f62884f;
        WirePhysicalLock wirePhysicalLock = this.f62902x;
        interfaceC1880Ea.mo55956N(new SmartlockLocked((wirePhysicalLock == null || (r1 = wirePhysicalLock.getKind()) == null) ? "unknown" : "unknown", m59210y0(), this.f62885g.mo75033n0(), this.f62873B.get()));
    }

    /* renamed from: N0 */
    public final void m59289N0() {
        String birdId;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        WireSmartlock smartlock;
        PhysicalLockPurpose purpose;
        WireRide ride;
        C41318g46.m40163a("onLockUnlocked called", new Object[0]);
        this.f62894p.accept(Unit.INSTANCE);
        this.f62872A.incrementAndGet();
        WirePhysicalLock wirePhysicalLock = this.f62902x;
        if (wirePhysicalLock != null && (birdId = wirePhysicalLock.getBirdId()) != null) {
            RideState mo75031q1 = this.f62885g.mo75031q1(birdId);
            InterfaceC1880Ea interfaceC1880Ea = this.f62884f;
            if (mo75031q1 != null) {
                str = "ride";
            } else {
                str = "private_bird";
            }
            String str7 = str;
            WirePhysicalLock wirePhysicalLock2 = this.f62902x;
            if (wirePhysicalLock2 != null) {
                str2 = wirePhysicalLock2.getId();
            } else {
                str2 = null;
            }
            WirePhysicalLock wirePhysicalLock3 = this.f62902x;
            if (wirePhysicalLock3 != null) {
                str3 = wirePhysicalLock3.getBirdId();
            } else {
                str3 = null;
            }
            if (mo75031q1 != null && (ride = mo75031q1.getRide()) != null) {
                str4 = ride.getId();
            } else {
                str4 = null;
            }
            WirePhysicalLock wirePhysicalLock4 = this.f62902x;
            if (wirePhysicalLock4 != null) {
                str5 = wirePhysicalLock4.getKind();
            } else {
                str5 = null;
            }
            WirePhysicalLock wirePhysicalLock5 = this.f62902x;
            if (wirePhysicalLock5 != null && (purpose = wirePhysicalLock5.getPurpose()) != null) {
                str6 = purpose.toString();
            } else {
                str6 = null;
            }
            WirePhysicalLock wirePhysicalLock6 = this.f62902x;
            interfaceC1880Ea.mo55905y(new RS3(null, null, null, str7, true, (wirePhysicalLock6 == null || (smartlock = wirePhysicalLock6.getSmartlock()) == null || (r1 = smartlock.getId()) == null) ? "" : "", str2, str3, str4, str5, str6, null, null, 6151, null));
        }
        InterfaceC1880Ea interfaceC1880Ea2 = this.f62884f;
        WirePhysicalLock wirePhysicalLock7 = this.f62902x;
        interfaceC1880Ea2.mo55956N(new SmartlockUnlocked((wirePhysicalLock7 == null || (r2 = wirePhysicalLock7.getKind()) == null) ? "unknown" : "unknown", m59210y0(), this.f62885g.mo75033n0(), this.f62872A.get()));
    }

    /* renamed from: O0 */
    public final void m59287O0(WireSmartlock wireSmartlock, Throwable th) {
        String str;
        long j;
        List list;
        Integer num;
        RideState rideState;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        WireSmartlock smartlock;
        String id;
        PhysicalLockPurpose purpose;
        WireRide ride;
        String birdId;
        String kind;
        if (this.f62902x != null) {
            if (this.f62872A.get() <= 0 || !(th instanceof TimeoutException)) {
                this.f62895q.accept(Optional.f63040c.m59032c(new C46396oe6(wireSmartlock, th)));
                InterfaceC1880Ea interfaceC1880Ea = this.f62884f;
                WirePhysicalLock wirePhysicalLock = this.f62902x;
                if (wirePhysicalLock == null || (kind = wirePhysicalLock.getKind()) == null) {
                    str = "";
                } else {
                    str = kind;
                }
                Long m59210y0 = m59210y0();
                if (m59210y0 != null) {
                    j = m59210y0.longValue();
                } else {
                    j = -1;
                }
                String m59239m1 = m59239m1(wireSmartlock, th);
                list = CollectionsKt___CollectionsKt.toList(this.f62892n);
                String str9 = null;
                if (th instanceof BleScanException) {
                    num = Integer.valueOf(((BleScanException) th).m45866b());
                } else {
                    num = null;
                }
                interfaceC1880Ea.mo55956N(new SmartlockUnlockError(str, j, m59239m1, list, num, th, this.f62885g.mo75033n0()));
                WirePhysicalLock wirePhysicalLock2 = this.f62902x;
                if (wirePhysicalLock2 != null && (birdId = wirePhysicalLock2.getBirdId()) != null) {
                    rideState = this.f62885g.mo75031q1(birdId);
                } else {
                    rideState = null;
                }
                String m59239m12 = m59239m1(wireSmartlock, th);
                if (!Intrinsics.areEqual(m59239m12, "cancelled")) {
                    InterfaceC1880Ea interfaceC1880Ea2 = this.f62884f;
                    if (rideState != null) {
                        str2 = "ride";
                    } else {
                        str2 = "private_bird";
                    }
                    String str10 = str2;
                    WirePhysicalLock wirePhysicalLock3 = this.f62902x;
                    if (wirePhysicalLock3 != null) {
                        str3 = wirePhysicalLock3.getId();
                    } else {
                        str3 = null;
                    }
                    WirePhysicalLock wirePhysicalLock4 = this.f62902x;
                    if (wirePhysicalLock4 != null) {
                        str4 = wirePhysicalLock4.getBirdId();
                    } else {
                        str4 = null;
                    }
                    if (rideState != null && (ride = rideState.getRide()) != null) {
                        str5 = ride.getId();
                    } else {
                        str5 = null;
                    }
                    WirePhysicalLock wirePhysicalLock5 = this.f62902x;
                    if (wirePhysicalLock5 != null) {
                        str6 = wirePhysicalLock5.getKind();
                    } else {
                        str6 = null;
                    }
                    WirePhysicalLock wirePhysicalLock6 = this.f62902x;
                    if (wirePhysicalLock6 != null && (purpose = wirePhysicalLock6.getPurpose()) != null) {
                        str7 = purpose.toString();
                    } else {
                        str7 = null;
                    }
                    WirePhysicalLock wirePhysicalLock7 = this.f62902x;
                    if (wirePhysicalLock7 == null || (smartlock = wirePhysicalLock7.getSmartlock()) == null || (id = smartlock.getId()) == null) {
                        str8 = "";
                    } else {
                        str8 = id;
                    }
                    String str11 = m59239m12 + " - " + th;
                    if (Intrinsics.areEqual(m59239m12, "network_failure")) {
                        str9 = th + " - " + th.getMessage();
                    }
                    interfaceC1880Ea2.mo55905y(new RS3(null, null, null, str10, false, str8, str3, str4, str5, str6, str7, str11, str9, 7, null));
                }
            }
        }
    }

    /* renamed from: P0 */
    public final AbstractC23442F<NokelockResponse> m59285P0(WireSmartlock wireSmartlock, byte[] bArr) {
        return this.f62882d.m36546e(new NokelockMessage(wireSmartlock.getId(), m59208z0(bArr)));
    }

    /* renamed from: Q0 */
    public final void m59283Q0(WireSmartlock wireSmartlock) {
        this.f62893o.remove(wireSmartlock.getMacAddress());
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: a */
    public AbstractC23461c mo21406a(final long j) {
        if (m59309D0()) {
            C41318g46.m40163a("ignoring attempt to resetBluetooth since smartLockV2Enabled", new Object[0]);
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        AbstractC23461c m23311e = C45832nh5.m23311e(new C14360A());
        final C14361B c14361b = C14361B.f62906g;
        AbstractC23461c m33049i = m23311e.m33084B(new InterfaceC23484g() { // from class: QI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59281R0(Function1.this, obj);
            }
        }).m33069Q().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: RI5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m59279S0;
                m59279S0 = SmartlockManagerImpl.m59279S0(SmartlockManagerImpl.this);
                return m59279S0;
            }
        })).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: SI5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m59275U0;
                m59275U0 = SmartlockManagerImpl.m59275U0(j);
                return m59275U0;
            }
        })).m33029z(new InterfaceC23478a() { // from class: TI5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                SmartlockManagerImpl.m59273V0(SmartlockManagerImpl.this);
            }
        }).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: UI5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m59271W0;
                m59271W0 = SmartlockManagerImpl.m59271W0(SmartlockManagerImpl.this, j);
                return m59271W0;
            }
        }));
        final C14364E c14364e = C14364E.f62909g;
        AbstractC23461c m33084B = m33049i.m33084B(new InterfaceC23484g() { // from class: VI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59265Z0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33084B, "override fun resetBlueto…bluetooth adapter.\")}\n  }");
        return m33084B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r2 != false) goto L11;
     */
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC23465c m59263a1() {
        boolean z;
        boolean z2;
        C22454gl.C22456b m37655Z = this.f62887i.m37655Z();
        if (m37655Z == null) {
            return null;
        }
        if (!C42149hU4.m36358a(this.f62885g.mo75057R().m73665a())) {
            DateTime m37543b = m37655Z.m37543b();
            z = true;
            if (m37543b != null && m37543b.isAfterNow()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        z = false;
        if (!z) {
            m37655Z = null;
        }
        if (m37655Z == null) {
            return null;
        }
        this.f62890l.accept(Optional.f63040c.m59032c(new C37099Xl5(m37655Z.m37542c(), UR4.UNLOCK, null, 4, null)));
        long abs = Math.abs(C46880pT0.m19254h(m37655Z.m37543b()));
        C41318g46.m40163a("restarted last ride lock availability for " + abs + " seconds with lock id " + m37655Z.m37542c().getId(), new Object[0]);
        Observable<Long> timer = Observable.timer(abs, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(timer, "timer(secondsRemaining, TimeUnit.SECONDS)");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = timer.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14365F c14365f = new C14365F(m37655Z);
        return ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: bJ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59261b1(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: b */
    public AbstractC23461c mo21405b(C36154Tk5 scanResult, WirePhysicalLock lock, int i) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(lock, "lock");
        if (m59309D0()) {
            C41318g46.m40163a("ignoring attempt to continueUnlockingWithForcedRetries since smartLockV2Enabled", new Object[0]);
            AbstractC23461c m33071O = AbstractC23461c.m33071O();
            Intrinsics.checkNotNullExpressionValue(m33071O, "never()");
            return m33071O;
        }
        C41318g46.m40163a("Starting attempt to continue unlocking for " + i + " times, 10 seconds apart", new Object[0]);
        Observable<Long> intervalRange = Observable.intervalRange(0L, (long) i, 0L, 10L, TimeUnit.SECONDS);
        final C14408u c14408u = new C14408u(scanResult, this, lock);
        AbstractC23461c switchMapCompletable = intervalRange.switchMapCompletable(new InterfaceC23492o() { // from class: CI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m59212x0;
                m59212x0 = SmartlockManagerImpl.m59212x0(Function1.this, obj);
                return m59212x0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun continueUnl…rorComplete()\n      }\n  }");
        return switchMapCompletable;
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: c */
    public AbstractC23442F<C36154Tk5> mo21404c(WirePhysicalLock lock, Function0<Unit> onBleReady, Function2<? super WirePhysicalLock, ? super AbstractC39873de5.EnumC19828a, Unit> onBleNotReady) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(onBleReady, "onBleReady");
        Intrinsics.checkNotNullParameter(onBleNotReady, "onBleNotReady");
        if (m59309D0()) {
            C41318g46.m40163a("ignoring attempt to start scanning since smartLockV2Enabled", new Object[0]);
            AbstractC23442F<C36154Tk5> m33153M = AbstractC23442F.m33153M();
            Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
            return m33153M;
        }
        WireSmartlock smartlock = lock.getSmartlock();
        if (smartlock == null) {
            AbstractC23442F<C36154Tk5> m33100x = AbstractC23442F.m33100x(new IllegalArgumentException(lock + " does not have a smartlock"));
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(IllegalArgumentExc…s not have a smartlock\"))");
            return m33100x;
        }
        Observable<AbstractC39873de5.EnumC19828a> m59313B0 = m59313B0();
        final C14371L c14371l = new C14371L(lock, onBleReady, this, smartlock, onBleNotReady);
        AbstractC23442F<C36154Tk5> firstOrError = m59313B0.switchMapSingle(new InterfaceC23492o() { // from class: DI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59236n1;
                m59236n1 = SmartlockManagerImpl.m59236n1(Function1.this, obj);
                return m59236n1;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "override fun startScanni…      .firstOrError()\n  }");
        return firstOrError;
    }

    /* renamed from: c1 */
    public final void m59259c1(WireSmartlock wireSmartlock, InterfaceC44023ke5 interfaceC44023ke5) {
        this.f62893o.put(wireSmartlock.getMacAddress(), interfaceC44023ke5);
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: d */
    public synchronized void mo21403d() {
        if (m59309D0()) {
            C41318g46.m40163a("ignoring attempt to stopUnlocking since smartLockV2Enabled", new Object[0]);
            return;
        }
        WirePhysicalLock wirePhysicalLock = this.f62902x;
        if (wirePhysicalLock != null) {
            C41318g46.m40163a("clearing out lock state for " + wirePhysicalLock, new Object[0]);
        }
        this.f62902x = null;
        InterfaceC23465c interfaceC23465c = this.f62903y;
        if (interfaceC23465c != null && !interfaceC23465c.mo1769e()) {
            C41318g46.m40163a("Disposing lock disposable now", new Object[0]);
            interfaceC23465c.dispose();
        }
    }

    /* renamed from: d1 */
    public final AbstractC23442F<C36154Tk5> m59257d1(WireSmartlock wireSmartlock) {
        String macAddress = wireSmartlock.getMacAddress();
        C41318g46.m40157g("trying to connect to lock " + macAddress, new Object[0]);
        this.f62892n.clear();
        Observable scanBleDevices$default = InterfaceC5225MD.C5226a.scanBleDevices$default(this.f62883e, 2, false, null, 6, null);
        final C14366G c14366g = C14366G.f62912g;
        Observable filter = scanBleDevices$default.filter(new InterfaceC23494q() { // from class: pI5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59255e1;
                m59255e1 = SmartlockManagerImpl.m59255e1(Function1.this, obj);
                return m59255e1;
            }
        });
        final C14367H c14367h = new C14367H();
        Observable doOnDispose = filter.doOnNext(new InterfaceC23484g() { // from class: AI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59253f1(Function1.this, obj);
            }
        }).doOnDispose(new InterfaceC23478a() { // from class: LI5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                SmartlockManagerImpl.m59251g1();
            }
        });
        final C14368I c14368i = new C14368I(wireSmartlock);
        AbstractC23442F firstOrError = doOnDispose.filter(new InterfaceC23494q() { // from class: WI5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59249h1;
                m59249h1 = SmartlockManagerImpl.m59249h1(Function1.this, obj);
                return m59249h1;
            }
        }).firstOrError();
        final C14369J c14369j = new C14369J(wireSmartlock);
        AbstractC23442F<C36154Tk5> m33101w = firstOrError.m33101w(new InterfaceC23484g() { // from class: aJ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59247i1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun scan(lock: W… ${lock.id}\")\n      }\n  }");
        return m33101w;
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: e */
    public Z84<Optional<C37099Xl5>> mo21402e() {
        return this.f62891m;
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: f */
    public Observable<Unit> mo21401f() {
        Observable<Unit> hide = this.f62894p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "unlocksRelay.hide()");
        return hide;
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: g */
    public synchronized void mo21400g(C37099Xl5 rideLock) {
        boolean z;
        Intrinsics.checkNotNullParameter(rideLock, "rideLock");
        if (m59309D0()) {
            C41318g46.m40163a("ignoring attempt to startUnlocking since smartLockV2Enabled", new Object[0]);
            return;
        }
        WirePhysicalLock m76371b = rideLock.m76371b();
        C41318g46.m40163a("attempting to listen for requests to unlock lock id " + m76371b.getId(), new Object[0]);
        WirePhysicalLock wirePhysicalLock = this.f62902x;
        boolean z2 = true;
        if (wirePhysicalLock != null && wirePhysicalLock.isSame(m76371b)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C41318g46.m40163a("Lock " + m76371b + " already unlocking", new Object[0]);
        } else if (m76371b.getSmartlock() == null) {
            C41318g46.m40160d(m76371b + " does not have a smartlock", new Object[0]);
        } else {
            if (this.f62902x != null) {
                InterfaceC23465c interfaceC23465c = this.f62903y;
                if (interfaceC23465c == null || interfaceC23465c.mo1769e()) {
                    z2 = false;
                }
                if (z2) {
                    C41318g46.m40163a("lock disposable disposing for lock " + this.f62902x, new Object[0]);
                    InterfaceC23465c interfaceC23465c2 = this.f62903y;
                    if (interfaceC23465c2 != null) {
                        interfaceC23465c2.dispose();
                    }
                }
            }
            this.f62902x = m76371b;
            if (m76371b.getSmartlock() == null) {
                return;
            }
            this.f62904z = Long.valueOf(System.currentTimeMillis());
            this.f62872A.set(0);
            this.f62873B.set(0);
            AbstractC39873de5.EnumC19828a mo33641c = this.f62881c.mo33641c();
            Intrinsics.checkNotNullExpressionValue(mo33641c, "bleClient.state");
            m59224r1(m76371b, mo33641c);
            AbstractC23442F<C36154Tk5> m33152N = mo21404c(m76371b, new C14372M(), new C14373N()).m33152N(C24542a.m31932c());
            final C14374O c14374o = new C14374O(rideLock, this, m76371b);
            AbstractC23461c m33070P = m33152N.m33164B(new InterfaceC23492o() { // from class: xI5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m59233o1;
                    m59233o1 = SmartlockManagerImpl.m59233o1(Function1.this, obj);
                    return m59233o1;
                }
            }).m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "@Synchronized\n  override… lock flow\")\n      })\n  }");
            ScopeProvider UNBOUND = ScopeProvider.f75557g0;
            Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
            Object m33041n = m33070P.m33041n(AutoDispose.m45239a(UNBOUND));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: yI5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    SmartlockManagerImpl.m59230p1();
                }
            };
            final C14376P c14376p = C14376P.f62928g;
            this.f62903y = ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: zI5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    SmartlockManagerImpl.m59227q1(Function1.this, obj);
                }
            });
        }
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: h */
    public void mo21399h() {
        this.f62899u.m71836j();
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: i */
    public Z84<Optional<C46396oe6>> mo21398i() {
        return this.f62896r;
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: j */
    public void mo21397j(ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        C41318g46.m40163a("start unlocking for rides called now", new Object[0]);
        if (m59309D0()) {
            C41318g46.m40163a("ignoring attempt to start unlocking for rides since smartLockV2Enabled", new Object[0]);
            return;
        }
        Object m33094as = this.f62878G.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }

    /* renamed from: j1 */
    public final AbstractC23442F<byte[]> m59245j1(WireSmartlock wireSmartlock, String str) {
        AbstractC23442F<byte[]> abstractC23442F;
        InterfaceC44023ke5 m59237n0 = m59237n0(wireSmartlock);
        if (m59237n0 != null) {
            abstractC23442F = m59237n0.mo27056c(EnumC14385i.f62936c.m59190b(), m59315A0(str));
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F<byte[]> m33100x = AbstractC23442F.m33100x(NotConnected.f62924b);
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotConnected)");
            return m33100x;
        }
        return abstractC23442F;
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: k */
    public Z84<Optional<Pair<C37099Xl5, C36154Tk5>>> mo21396k() {
        return this.f62879H;
    }

    /* renamed from: k0 */
    public final Observable<InterfaceC44023ke5> m59244k0(final WireSmartlock wireSmartlock, C36154Tk5 c36154Tk5) {
        Observable<InterfaceC44023ke5> mo17284a = c36154Tk5.m83016a().mo17284a(false);
        Intrinsics.checkNotNullExpressionValue(mo17284a, "scanResult.bleDevice.establishConnection(false)");
        Observable delaySubscription = C7866TX.m83468l(mo17284a, this.f62889k, EnumC38707bi3.CONNECT).delaySubscription(500L, TimeUnit.MILLISECONDS);
        final C14387k c14387k = new C14387k(wireSmartlock);
        Observable<InterfaceC44023ke5> doOnDispose = delaySubscription.doOnNext(new InterfaceC23484g() { // from class: OI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59242l0(Function1.this, obj);
            }
        }).doOnDispose(new InterfaceC23478a() { // from class: PI5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                SmartlockManagerImpl.m59240m0(SmartlockManagerImpl.this, wireSmartlock);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnDispose, "private fun connect(lock…oveConnection(lock) }\n  }");
        return doOnDispose;
    }

    /* renamed from: k1 */
    public final AbstractC23442F<byte[]> m59243k1(WireSmartlock wireSmartlock) {
        byte[] bArr;
        AbstractC23442F<byte[]> abstractC23442F;
        String m59311C0 = m59311C0(wireSmartlock);
        if (m59311C0 == null || (bArr = m59315A0(m59311C0)) == null) {
            bArr = new byte[0];
        }
        InterfaceC44023ke5 m59237n0 = m59237n0(wireSmartlock);
        if (m59237n0 != null) {
            abstractC23442F = m59237n0.mo27056c(EnumC14385i.f62936c.m59190b(), bArr);
        } else {
            abstractC23442F = null;
        }
        if (abstractC23442F == null) {
            AbstractC23442F<byte[]> m33100x = AbstractC23442F.m33100x(NotConnected.f62924b);
            Intrinsics.checkNotNullExpressionValue(m33100x, "error(NotConnected)");
            return m33100x;
        }
        return abstractC23442F;
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: l */
    public int mo21395l() {
        return this.f62872A.intValue();
    }

    @Override // p000.InterfaceC46193oI5
    /* renamed from: m */
    public AbstractC23461c mo21394m(C36154Tk5 scanResult, WirePhysicalLock lock) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(lock, "lock");
        if (m59309D0()) {
            C41318g46.m40163a("ignoring attempt to continueUnlocking since smartLockV2Enabled", new Object[0]);
            AbstractC23461c m33071O = AbstractC23461c.m33071O();
            Intrinsics.checkNotNullExpressionValue(m33071O, "never()");
            return m33071O;
        }
        String id = lock.getId();
        String mo17280e = scanResult.m83016a().mo17280e();
        C41318g46.m40163a("continuing unlock of lock id " + id + " for scan result with mac address " + mo17280e, new Object[0]);
        WireSmartlock smartlock = lock.getSmartlock();
        if (smartlock == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new IllegalArgumentException(lock + " does not have a smartlock"));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(IllegalArgumentExc…s not have a smartlock\"))");
            return m33080F;
        }
        C41318g46.m40163a("attempting to ble connect now", new Object[0]);
        Observable<InterfaceC44023ke5> m59244k0 = m59244k0(smartlock, scanResult);
        final C14388l c14388l = C14388l.f62942g;
        Observable<InterfaceC44023ke5> doOnNext = m59244k0.doOnNext(new InterfaceC23484g() { // from class: EI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59234o0(Function1.this, obj);
            }
        });
        final C14389m c14389m = new C14389m(smartlock);
        Observable<R> flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: FI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m59231p0;
                m59231p0 = SmartlockManagerImpl.m59231p0(Function1.this, obj);
                return m59231p0;
            }
        });
        final C14390n c14390n = new C14390n(smartlock, this);
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: GI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m59228q0;
                m59228q0 = SmartlockManagerImpl.m59228q0(Function1.this, obj);
                return m59228q0;
            }
        });
        final C14398o c14398o = new C14398o(smartlock);
        Observable flatMapSingle = flatMap2.flatMapSingle(new InterfaceC23492o() { // from class: HI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59225r0;
                m59225r0 = SmartlockManagerImpl.m59225r0(Function1.this, obj);
                return m59225r0;
            }
        });
        final C14400p c14400p = new C14400p();
        Observable doOnNext2 = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: II5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59222s0(Function1.this, obj);
            }
        });
        final C14401q c14401q = new C14401q(lock);
        Observable takeUntil = doOnNext2.takeUntil(new InterfaceC23494q() { // from class: JI5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m59220t0;
                m59220t0 = SmartlockManagerImpl.m59220t0(Function1.this, obj);
                return m59220t0;
            }
        });
        final C14402r c14402r = new C14402r(smartlock);
        AbstractC23461c ignoreElements = takeUntil.flatMapSingle(new InterfaceC23492o() { // from class: KI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59218u0;
                m59218u0 = SmartlockManagerImpl.m59218u0(Function1.this, obj);
                return m59218u0;
            }
        }).ignoreElements();
        final C14403s c14403s = new C14403s(smartlock);
        AbstractC23461c m33049i = ignoreElements.m33084B(new InterfaceC23484g() { // from class: MI5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                SmartlockManagerImpl.m59216v0(Function1.this, obj);
            }
        }).m33049i(AbstractC23461c.m33080F(C14384h.f62935b));
        final C14404t c14404t = new C14404t();
        AbstractC23461c m33064V = m33049i.m33064V(new InterfaceC23492o() { // from class: NI5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC45761na4 m59214w0;
                m59214w0 = SmartlockManagerImpl.m59214w0(Function1.this, obj);
                return m59214w0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33064V, "override fun continueUnl…}\n          }\n      }\n  }");
        return m33064V;
    }

    /* renamed from: m1 */
    public final String m59239m1(WireSmartlock wireSmartlock, Throwable th) {
        boolean z;
        if (th instanceof TimeoutException) {
            if (this.f62892n.contains(wireSmartlock.getMacAddress())) {
                return "connection_failure";
            }
            return "timed_out";
        } else if (th instanceof RetrofitException) {
            return "network_failure";
        } else {
            boolean z2 = true;
            if (th instanceof BleServiceNotFoundException) {
                z = true;
            } else {
                z = th instanceof BleCharacteristicNotFoundException;
            }
            if (z) {
                return "invalid_peripheral";
            }
            if (th instanceof BleAdapterDisabledException) {
                return "bluetooth_unavailable";
            }
            if (!(th instanceof BleAlreadyConnectedException)) {
                z2 = th instanceof BleConflictingNotificationAlreadySetException;
            }
            if (z2) {
                return "already_connected";
            }
            if (th instanceof BleDisconnectedException) {
                return "cancelled";
            }
            if (th instanceof BleScanException) {
                return "scan_failure";
            }
            if (th instanceof BleGattCharacteristicException) {
                return "request_write_failure";
            }
            if (th instanceof BleGattException) {
                return "other_ble_gatt_exception";
            }
            if (th instanceof BleException) {
                return "other_ble_exception";
            }
            return LegacyRepairType.OTHER_KEY;
        }
    }

    /* renamed from: n0 */
    public final InterfaceC44023ke5 m59237n0(WireSmartlock wireSmartlock) {
        return this.f62893o.get(wireSmartlock.getMacAddress());
    }

    /* renamed from: r1 */
    public final void m59224r1(WirePhysicalLock wirePhysicalLock, AbstractC39873de5.EnumC19828a enumC19828a) {
        Integer num;
        WireSmartlock smartlock = wirePhysicalLock.getSmartlock();
        if (smartlock != null && wirePhysicalLock.getPurpose() == PhysicalLockPurpose.LOCK_TO) {
            int i = C14386j.$EnumSwitchMapping$0[enumC19828a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            num = null;
                        } else {
                            num = 4;
                        }
                    } else {
                        num = 3;
                    }
                } else {
                    num = 1;
                }
            } else {
                num = 1;
            }
            if (num != null) {
                this.f62895q.accept(Optional.f63040c.m59032c(new C46396oe6(smartlock, new BleScanException(num.intValue()))));
            }
        }
    }

    /* renamed from: y0 */
    public final Long m59210y0() {
        Long l = this.f62904z;
        if (l != null) {
            return Long.valueOf(System.currentTimeMillis() - l.longValue());
        }
        return null;
    }

    /* renamed from: z0 */
    public final String m59208z0(byte[] bArr) {
        String m108172e = C2029Ey.m108181b().m108172e(bArr);
        Intrinsics.checkNotNullExpressionValue(m108172e, "getEncoder().encodeToString(this)");
        return m108172e;
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00070\u00072,\u0010\u0006\u001a(\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/itemlease/ItemLease;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl$listenForRideStateChanges$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n288#2,2:960\n1#3:962\n*S KotlinDebug\n*F\n+ 1 SmartlockManagerImpl.kt\nco/bird/android/app/manager/SmartlockManagerImpl$listenForRideStateChanges$3\n*L\n234#1:960,2\n*E\n"})
    /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$x */
    /* loaded from: classes2.dex */
    public static final class C14412x extends Lambda implements Function1<Pair<? extends Optional<RideState>, ? extends List<? extends ItemLease>>, InterfaceC23434B<? extends Optional<RideState>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$x$a */
        /* loaded from: classes2.dex */
        public static final class C14413a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockManagerImpl f62975g;

            /* renamed from: h */
            public final /* synthetic */ WirePhysicalLock f62976h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14413a(SmartlockManagerImpl smartlockManagerImpl, WirePhysicalLock wirePhysicalLock) {
                super(1);
                this.f62975g = smartlockManagerImpl;
                this.f62976h = wirePhysicalLock;
            }

            /* renamed from: a */
            public final void m59144a(InterfaceC23465c interfaceC23465c) {
                this.f62975g.f62890l.accept(Optional.f63040c.m59032c(new C37099Xl5(this.f62976h, UR4.UNLOCK, null, 4, null)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m59144a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$x$b */
        /* loaded from: classes2.dex */
        public static final class C14414b extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockManagerImpl f62977g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14414b(SmartlockManagerImpl smartlockManagerImpl) {
                super(1);
                this.f62977g = smartlockManagerImpl;
            }

            /* renamed from: a */
            public final void m59143a(Long l) {
                this.f62977g.f62890l.accept(Optional.f63040c.m59034a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m59143a(l);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$x$c */
        /* loaded from: classes2.dex */
        public static final class C14415c extends Lambda implements Function1<Long, Optional<RideState>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<RideState> f62978g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14415c(Optional<RideState> optional) {
                super(1);
                this.f62978g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<RideState> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f62978g;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$x$d */
        /* loaded from: classes2.dex */
        public static final class C14416d extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockManagerImpl f62979g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14416d(SmartlockManagerImpl smartlockManagerImpl) {
                super(1);
                this.f62979g = smartlockManagerImpl;
            }

            /* renamed from: a */
            public final void m59141a(Long l) {
                this.f62979g.f62890l.accept(Optional.f63040c.m59034a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m59141a(l);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$x$e */
        /* loaded from: classes2.dex */
        public static final class C14417e extends Lambda implements Function1<Long, Optional<RideState>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<RideState> f62980g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14417e(Optional<RideState> optional) {
                super(1);
                this.f62980g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<RideState> invoke(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f62980g;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.manager.SmartlockManagerImpl$x$f */
        /* loaded from: classes2.dex */
        public static final class C14418f extends Lambda implements Function1<Optional<RideState>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ SmartlockManagerImpl f62981g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14418f(SmartlockManagerImpl smartlockManagerImpl) {
                super(1);
                this.f62981g = smartlockManagerImpl;
            }

            /* renamed from: a */
            public final void m59139a(Optional<RideState> optional) {
                this.f62981g.f62890l.accept(Optional.f63040c.m59034a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Optional<RideState> optional) {
                m59139a(optional);
                return Unit.INSTANCE;
            }
        }

        public C14412x() {
            super(1);
        }

        /* renamed from: g */
        public static final Optional m59150g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final void m59149h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final void m59148i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final void m59147j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: k */
        public static final Optional m59146k(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: l */
        public static final void m59145l(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23434B<? extends Optional<RideState>> invoke2(Pair<Optional<RideState>, ? extends List<ItemLease>> pair) {
            WirePhysicalLock wirePhysicalLock;
            WirePhysicalLock m76371b;
            Boolean valueOf;
            int i;
            Object obj;
            WireRide ride;
            WireBird bird;
            String birdId;
            WireRide ride2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<RideState> rideStateOptional = pair.component1();
            pair.component2();
            boolean z = false;
            C41318g46.m40163a("computing smart lock state based off ride state and leases...", new Object[0]);
            RideState m59035e = rideStateOptional.m59035e();
            WireBird bird2 = (m59035e == null || (ride2 = m59035e.getRide()) == null) ? null : ride2.getBird();
            C41318g46.m40163a("current bird id = " + (bird2 != null ? bird2.getId() : null), new Object[0]);
            if (bird2 == null || (m76371b = bird2.getPhysicalLock()) == null) {
                C37099Xl5 c37099Xl5 = (C37099Xl5) ((Optional) SmartlockManagerImpl.this.f62890l.getValue()).m59035e();
                if (c37099Xl5 == null) {
                    wirePhysicalLock = null;
                    Config m80769c = C36441Uq4.m80769c(SmartlockManagerImpl.this.f62886h, bird2);
                    if (wirePhysicalLock == null) {
                        valueOf = Boolean.valueOf(SmartlockManagerImpl.this.f62888j.mo55653v(m80769c, wirePhysicalLock, ItemLeaseType.HELMET));
                    } else {
                        valueOf = bird2 != null ? Boolean.valueOf(SmartlockManagerImpl.this.f62888j.mo55655t(bird2, ItemLeaseType.HELMET)) : null;
                    }
                    boolean z2 = true;
                    if (!Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
                        C41318g46.m40163a("in lease supported market...", new Object[0]);
                        Iterator<T> it = SmartlockManagerImpl.this.f62888j.mo55656s().m73665a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            ItemLease itemLease = (ItemLease) obj;
                            if (bird2 == null || (birdId = bird2.getId()) == null) {
                                birdId = wirePhysicalLock != null ? wirePhysicalLock.getBirdId() : null;
                                Intrinsics.checkNotNull(birdId);
                            }
                            if (itemLease.isLeaseForBirdId(birdId, ItemLeaseType.HELMET)) {
                                break;
                            }
                        }
                        ItemLease itemLease2 = (ItemLease) obj;
                        if (itemLease2 == null || wirePhysicalLock == null) {
                            if (itemLease2 == null) {
                                C41318g46.m40163a("we don't have a lease, disallowing immediate unlocking but allowing notification on scan...", new Object[0]);
                                SmartlockManagerImpl.this.f62887i.m37608k();
                                C37791a94 c37791a94 = SmartlockManagerImpl.this.f62890l;
                                Optional.C14443a c14443a = Optional.f63040c;
                                if (wirePhysicalLock != null) {
                                    Intrinsics.checkNotNullExpressionValue(rideStateOptional, "rideStateOptional");
                                    if (C42149hU4.m36358a(rideStateOptional)) {
                                        RideState m59035e2 = rideStateOptional.m59035e();
                                        if (Intrinsics.areEqual((m59035e2 == null || (ride = m59035e2.getRide()) == null || (bird = ride.getBird()) == null) ? null : bird.getId(), wirePhysicalLock.getBirdId())) {
                                            z = true;
                                        }
                                    }
                                    if (!z) {
                                        wirePhysicalLock = null;
                                    }
                                    if (wirePhysicalLock != null) {
                                        r2 = new C37099Xl5(wirePhysicalLock, UR4.NOTIFY, rideStateOptional.m59035e());
                                    }
                                }
                                c37791a94.accept(c14443a.m59033b(r2));
                                return Observable.just(rideStateOptional);
                            }
                            C41318g46.m40163a("reached unknown state, not allowing unlock....", new Object[0]);
                            return Observable.just(rideStateOptional);
                        }
                        DateTime paddedExpirationDateTime = itemLease2.getDueAt().plusSeconds(3600);
                        Intrinsics.checkNotNullExpressionValue(paddedExpirationDateTime, "paddedExpirationDateTime");
                        int abs = Math.abs(C46880pT0.m19254h(paddedExpirationDateTime));
                        C41318g46.m40163a("have active lease for bird/lock, setting remaining seconds to " + abs, new Object[0]);
                        if (abs > 0) {
                            SmartlockManagerImpl.this.f62887i.m37609j2(wirePhysicalLock, paddedExpirationDateTime);
                            Observable<Long> timer = Observable.timer(abs, TimeUnit.SECONDS);
                            final C14413a c14413a = new C14413a(SmartlockManagerImpl.this, wirePhysicalLock);
                            Observable<Long> doOnSubscribe = timer.doOnSubscribe(new InterfaceC23484g() { // from class: tJ5
                                @Override // io.reactivex.functions.InterfaceC23484g
                                public final void accept(Object obj2) {
                                    SmartlockManagerImpl.C14412x.m59148i(Function1.this, obj2);
                                }
                            });
                            final C14414b c14414b = new C14414b(SmartlockManagerImpl.this);
                            Observable<Long> doOnNext = doOnSubscribe.doOnNext(new InterfaceC23484g() { // from class: uJ5
                                @Override // io.reactivex.functions.InterfaceC23484g
                                public final void accept(Object obj2) {
                                    SmartlockManagerImpl.C14412x.m59147j(Function1.this, obj2);
                                }
                            });
                            final C14415c c14415c = new C14415c(rideStateOptional);
                            return doOnNext.map(new InterfaceC23492o() { // from class: vJ5
                                @Override // io.reactivex.functions.InterfaceC23492o
                                public final Object apply(Object obj2) {
                                    Optional m59146k;
                                    m59146k = SmartlockManagerImpl.C14412x.m59146k(Function1.this, obj2);
                                    return m59146k;
                                }
                            });
                        }
                        SmartlockManagerImpl.this.f62887i.m37608k();
                        SmartlockManagerImpl.this.f62890l.accept(Optional.f63040c.m59034a());
                        return Observable.just(rideStateOptional);
                    }
                    Intrinsics.checkNotNullExpressionValue(rideStateOptional, "rideStateOptional");
                    if (C42149hU4.m36358a(rideStateOptional)) {
                        C41318g46.m40163a("We are in ride, allowing unlocking of lock id " + (wirePhysicalLock != null ? wirePhysicalLock.getId() : null), new Object[0]);
                        SmartlockManagerImpl.this.f62887i.m37608k();
                        SmartlockManagerImpl.this.f62890l.accept(Optional.f63040c.m59033b(wirePhysicalLock != null ? new C37099Xl5(wirePhysicalLock, null, null, 6, null) : null));
                        return Observable.just(rideStateOptional);
                    }
                    if (wirePhysicalLock == null || !wirePhysicalLock.shouldAllowPostRideLocking()) {
                        z2 = false;
                    }
                    if (z2 && SmartlockManagerImpl.this.f62872A.get() > 0) {
                        Map<String, Integer> unlockAvailablePostRideByPurposeSeconds = SmartlockManagerImpl.this.f62886h.m82623f8().m73665a().getRideConfig().getSmartlockConfig().getUnlockAvailablePostRideByPurposeSeconds();
                        if (unlockAvailablePostRideByPurposeSeconds != null) {
                            PhysicalLockPurpose purpose = wirePhysicalLock.getPurpose();
                            Integer num = unlockAvailablePostRideByPurposeSeconds.get((purpose == null || (r2 = purpose.toString()) == null) ? "" : "");
                            if (num != null) {
                                i = num.intValue();
                                C41318g46.m40163a("We are not in ride but meet the conditions for post ride unlocking, allowing unlock for " + i + " seconds", new Object[0]);
                                C22454gl c22454gl = SmartlockManagerImpl.this.f62887i;
                                DateTime plusSeconds = DateTime.now().plusSeconds(i);
                                Intrinsics.checkNotNullExpressionValue(plusSeconds, "now().plusSeconds(maxSeconds)");
                                c22454gl.m37609j2(wirePhysicalLock, plusSeconds);
                                Observable<Long> timer2 = Observable.timer(i, TimeUnit.SECONDS);
                                final C14416d c14416d = new C14416d(SmartlockManagerImpl.this);
                                Observable<Long> doOnNext2 = timer2.doOnNext(new InterfaceC23484g() { // from class: wJ5
                                    @Override // io.reactivex.functions.InterfaceC23484g
                                    public final void accept(Object obj2) {
                                        SmartlockManagerImpl.C14412x.m59145l(Function1.this, obj2);
                                    }
                                });
                                final C14417e c14417e = new C14417e(rideStateOptional);
                                return doOnNext2.map(new InterfaceC23492o() { // from class: xJ5
                                    @Override // io.reactivex.functions.InterfaceC23492o
                                    public final Object apply(Object obj2) {
                                        Optional m59150g;
                                        m59150g = SmartlockManagerImpl.C14412x.m59150g(Function1.this, obj2);
                                        return m59150g;
                                    }
                                });
                            }
                        }
                        i = 0;
                        C41318g46.m40163a("We are not in ride but meet the conditions for post ride unlocking, allowing unlock for " + i + " seconds", new Object[0]);
                        C22454gl c22454gl2 = SmartlockManagerImpl.this.f62887i;
                        DateTime plusSeconds2 = DateTime.now().plusSeconds(i);
                        Intrinsics.checkNotNullExpressionValue(plusSeconds2, "now().plusSeconds(maxSeconds)");
                        c22454gl2.m37609j2(wirePhysicalLock, plusSeconds2);
                        Observable<Long> timer22 = Observable.timer(i, TimeUnit.SECONDS);
                        final Function1 c14416d2 = new C14416d(SmartlockManagerImpl.this);
                        Observable<Long> doOnNext22 = timer22.doOnNext(new InterfaceC23484g() { // from class: wJ5
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj2) {
                                SmartlockManagerImpl.C14412x.m59145l(Function1.this, obj2);
                            }
                        });
                        final Function1 c14417e2 = new C14417e(rideStateOptional);
                        return doOnNext22.map(new InterfaceC23492o() { // from class: xJ5
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj2) {
                                Optional m59150g;
                                m59150g = SmartlockManagerImpl.C14412x.m59150g(Function1.this, obj2);
                                return m59150g;
                            }
                        });
                    }
                    C41318g46.m40163a("No condition found for allowing unlocking of smart locks", new Object[0]);
                    Observable just = Observable.just(rideStateOptional);
                    final C14418f c14418f = new C14418f(SmartlockManagerImpl.this);
                    return just.doOnNext(new InterfaceC23484g() { // from class: yJ5
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj2) {
                            SmartlockManagerImpl.C14412x.m59149h(Function1.this, obj2);
                        }
                    });
                }
                m76371b = c37099Xl5.m76371b();
            }
            wirePhysicalLock = m76371b;
            Config m80769c2 = C36441Uq4.m80769c(SmartlockManagerImpl.this.f62886h, bird2);
            if (wirePhysicalLock == null) {
            }
            boolean z22 = true;
            if (!Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Optional<RideState>> invoke(Pair<? extends Optional<RideState>, ? extends List<? extends ItemLease>> pair) {
            return invoke2((Pair<Optional<RideState>, ? extends List<ItemLease>>) pair);
        }
    }
}
