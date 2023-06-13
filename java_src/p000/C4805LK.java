package p000;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.ParcelUuid;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AlarmType;
import co.bird.android.model.GattUuid;
import co.bird.android.model.ReleaseLocationDetailsKt;
import co.bird.android.model.Vehicle;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.VehicleKt;
import co.bird.android.model.analytics.BluetoothAutoReconnected;
import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.exception.BluetoothExceptionKt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.configs.Config;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
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
import net.danlew.android.joda.DateUtils;
import no.nordicsemi.android.support.v18.scanner.AbstractC26703a;
import no.nordicsemi.android.support.v18.scanner.ScanFilter;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import no.nordicsemi.android.support.v18.scanner.ScanSettings;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import p000.C4805LK;
import p000.InterfaceC27246pJ;
@Metadata(m28433d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 c2\u00020\u0001:\u0001QBI\b\u0007\u0012\u0006\u0010v\u001a\u00020t\u0012\u0006\u0010y\u001a\u00020w\u0012\u0006\u0010|\u001a\u00020z\u0012\u0006\u0010\u007f\u001a\u00020}\u0012\b\u0010\u0082\u0001\u001a\u00030\u0080\u0001\u0012\b\u0010\u0085\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0086\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0016J<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0016J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J6\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0016J'\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u0004H\u0000¢\u0006\u0004\b*\u0010+J.\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016JB\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0016JO\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0000¢\u0006\u0004\b3\u00104J/\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b6\u00107J/\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010;\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J1\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0007H\u0001¢\u0006\u0004\bB\u0010CJ\u001c\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070E0\u00062\u0006\u0010D\u001a\u00020\u0011H\u0016J\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004H\u0016J\u0017\u0010H\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0007H\u0000¢\u0006\u0004\bH\u0010CJ\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010%\u001a\u00020\u0007H\u0000¢\u0006\u0004\bI\u0010JJE\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010K\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u0004H\u0000¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0007H\u0000¢\u0006\u0004\bP\u0010CJ\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010%\u001a\u00020\u0007H\u0016J%\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010%\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u0004H\u0000¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J9\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010%\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\n2\u0006\u0010Z\u001a\u00020YH\u0000¢\u0006\u0004\b[\u0010\\J3\u0010`\u001a\u00020\n2\u0006\u0010Z\u001a\u00020Y2\u0010\b\u0002\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010E2\b\b\u0002\u0010_\u001a\u00020\u0011H\u0000¢\u0006\u0004\b`\u0010aJ\b\u0010b\u001a\u00020\nH\u0016J\b\u0010c\u001a\u00020\nH\u0016J\u000f\u0010d\u001a\u00020\u0004H\u0000¢\u0006\u0004\bd\u0010eJ\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00040fH\u0016J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00150f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010i\u001a\u00020\u0004H\u0000¢\u0006\u0004\bi\u0010eJG\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010j*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010l\u001a\u00020k2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u0004H\u0000¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\n2\u0006\u0010q\u001a\u00020\u0015H\u0000¢\u0006\u0004\br\u0010sR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010xR\u0014\u0010|\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010{R\u0014\u0010\u007f\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010\u0087\u0001R\u0016\u0010\u008a\u0001\u001a\u00020k8\u0002X\u0082D¢\u0006\u0007\n\u0005\b$\u0010\u0089\u0001R\u0019\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010\u008c\u0001R\u0019\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u008f\u0001R\u0017\u0010\u0093\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u0012\u0012\r\u0012\u000b \u0097\u0001*\u0004\u0018\u00010\u00020\u00020\u0096\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0098\u0001R)\u0010 \u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b.\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006£\u0001"}, m28432d2 = {"LLK;", "LpJ;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "onFailDisconnect", "Lio/reactivex/Observable;", "Lco/bird/android/model/Vehicle;", "y2", "n2", "", "L2", "enabled", "LKY;", "bluetoothWakeStarted", "LbE5;", "sleepStarted", "", "firmwareVersion", "h2", "(Lio/reactivex/Observable;ZLKY;LbE5;Ljava/lang/Integer;)Lio/reactivex/Observable;", "", "exceptionType", "m2", "(ZLKY;LbE5;Ljava/lang/Integer;Ljava/lang/String;)V", "forRide", "onSuccessDisconnect", "Lkotlin/Function0;", "unlockedExternally", "l", "lockedExternally", "e", "c", "minutes", "f", "m", "h", "vehicle", "failIfClosed", "timeout", "canTreatAsBluetoothOverride", "r", "v2", "(Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/Observable;", "Lco/bird/android/model/AlarmType;", "type", "n", "autoUpdateBirdState", DateTokenConverter.CONVERTER_KEY, "lock", "completedExternally", "Z1", "(Lco/bird/android/model/wire/WireBird;ZZZZLkotlin/jvm/functions/Function0;)Lio/reactivex/Observable;", "enableLights", "S1", "(Lco/bird/android/model/wire/WireBird;ZZ)Lio/reactivex/Observable;", "I1", "(Lco/bird/android/model/wire/WireBird;IZ)Lio/reactivex/Observable;", "g", "b", "Lorg/joda/time/DateTime;", "disconnectedAt", "W0", "(Lco/bird/android/model/Vehicle;ZLorg/joda/time/DateTime;)Lio/reactivex/Observable;", "A1", "(Lco/bird/android/model/wire/WireBird;)V", "z1", "(Lco/bird/android/model/Vehicle;)V", "timeoutSeconds", "", "j", "k", "K2", "f1", "(Lco/bird/android/model/Vehicle;)Lio/reactivex/Observable;", "startTracker", "R0", "(Lco/bird/android/model/Vehicle;ZLorg/joda/time/DateTime;ZZ)Lio/reactivex/Observable;", "G2", "(Lco/bird/android/model/Vehicle;Z)V", "I2", C17296a.f69688o, "locked", "l1", "(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/Observable;", "i", "token", "b1", "(Lco/bird/android/model/Vehicle;Ljava/lang/String;ZLorg/joda/time/DateTime;)Lio/reactivex/Observable;", "Ljj5;", "callback", "H2", "(Ljj5;)V", "Ljava/util/UUID;", "serviceUuids", "scanMode", "F2", "(Ljj5;Ljava/util/List;I)V", "release", "o", "H1", "()Z", "Lio/reactivex/F;", "q", "p", "R1", "T", "", "seconds", "Lco/bird/android/model/exception/BluetoothException$Reason;", "reason", "r1", "(Lio/reactivex/Observable;JLco/bird/android/model/exception/BluetoothException$Reason;Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/Observable;", "msg", "J2", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LkJ;", "LkJ;", "birdBluetoothApiManager", "Lsm6;", "Lsm6;", "vehicleManager", "LaY;", "LaY;", "scheduler", "LEa;", "LEa;", "analyticsManager", "LKn6;", "LKn6;", "vehicleTrackerManager", "LTq4;", "LTq4;", "reactiveConfig", "J", "connectRetryCount", "Landroid/bluetooth/BluetoothManager;", "Landroid/bluetooth/BluetoothManager;", "manager", "Landroid/bluetooth/BluetoothAdapter;", "Landroid/bluetooth/BluetoothAdapter;", "adapter", "Lno/nordicsemi/android/support/v18/scanner/a;", "Lno/nordicsemi/android/support/v18/scanner/a;", "scanner", "Z", "scanning", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "stopAutoReconnectingSubject", "LaM;", "LaM;", "P1", "()LaM;", "setBirdManager", "(LaM;)V", "birdManager", "<init>", "(Landroid/content/Context;LkJ;Lsm6;LaY;LEa;LKn6;LTq4;)V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,969:1\n1549#2:970\n1620#2,3:971\n1#3:974\n*S KotlinDebug\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl\n*L\n814#1:970\n814#1:971,3\n*E\n"})
/* renamed from: LK */
/* loaded from: classes4.dex */
public final class C4805LK implements InterfaceC27246pJ {

    /* renamed from: o */
    public static final C4833a f21102o = new C4833a(null);

    /* renamed from: p */
    public static final ConcurrentHashMap<VehicleDescriptor, Vehicle> f21103p = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final Context f21104a;

    /* renamed from: b */
    public final InterfaceC25136kJ f21105b;

    /* renamed from: c */
    public final InterfaceC48847sm6 f21106c;

    /* renamed from: d */
    public final InterfaceC10732aY f21107d;

    /* renamed from: e */
    public final InterfaceC1880Ea f21108e;

    /* renamed from: f */
    public final InterfaceC34076Kn6 f21109f;

    /* renamed from: g */
    public final C36207Tq4 f21110g;

    /* renamed from: h */
    public final long f21111h;

    /* renamed from: i */
    public final BluetoothManager f21112i;

    /* renamed from: j */
    public final BluetoothAdapter f21113j;

    /* renamed from: k */
    public final AbstractC26703a f21114k;

    /* renamed from: l */
    public volatile boolean f21115l;

    /* renamed from: m */
    public final C24558d<WireBird> f21116m;

    /* renamed from: n */
    public InterfaceC10636aM f21117n;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle$ConnectionState;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$A */
    /* loaded from: classes4.dex */
    public static final class C4806A extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Vehicle.ConnectionState>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21119h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4806A(Vehicle vehicle) {
            super(1);
            this.f21119h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Vehicle.ConnectionState> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13693e(this.f21119h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle$ConnectionState;", TransferTable.COLUMN_STATE, "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle$ConnectionState;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$B */
    /* loaded from: classes4.dex */
    public static final class C4807B extends Lambda implements Function1<Vehicle.ConnectionState, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21121h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21122i;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: LK$B$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C4808a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Vehicle.ConnectionState.values().length];
                try {
                    iArr[Vehicle.ConnectionState.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Vehicle.ConnectionState.DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4807B(Vehicle vehicle, boolean z) {
            super(1);
            this.f21121h = vehicle;
            this.f21122i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle.ConnectionState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21121h.getBird().getSerialNumber();
            c4805lk.m97293J2("connect: connection state=" + state + ", vehicle=" + serialNumber);
            int i = C4808a.$EnumSwitchMapping$0[state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (this.f21122i) {
                        Observable error = Observable.error(new BluetoothException(null, BluetoothException.Reason.CONNECTION, 1, null));
                        Intrinsics.checkNotNullExpressionValue(error, "{\n              // Canno…ONNECTION))\n            }");
                        return error;
                    }
                    return C4805LK.this.m97226f1(this.f21121h);
                }
                return C4805LK.this.m97226f1(this.f21121h);
            }
            Observable just = Observable.just(this.f21121h);
            Intrinsics.checkNotNullExpressionValue(just, "just(vehicle)");
            return just;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$C */
    /* loaded from: classes4.dex */
    public static final class C4809C extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21123g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21124h;

        /* renamed from: i */
        public final /* synthetic */ Vehicle f21125i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4809C(boolean z, C4805LK c4805lk, Vehicle vehicle) {
            super(1);
            this.f21123g = z;
            this.f21124h = c4805lk;
            this.f21125i = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String message = th.getMessage();
            C41318g46.m40160d("connect: error reached " + message, new Object[0]);
            if (this.f21123g) {
                this.f21124h.m97158z1(this.f21125i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$D */
    /* loaded from: classes4.dex */
    public static final class C4810D extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21127h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4810D(Vehicle vehicle) {
            super(1);
            this.f21127h = vehicle;
        }

        /* renamed from: a */
        public final void m97155a(InterfaceC23465c interfaceC23465c) {
            C4805LK.this.m97293J2("disconnect...");
            C4805LK.this.m97297I2(this.f21127h);
            C4805LK.this.m97293J2("disconnect: vehicle found, so disconnect");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97155a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$E */
    /* loaded from: classes4.dex */
    public static final class C4811E extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21129h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4811E(Vehicle vehicle) {
            super(1);
            this.f21129h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            Vehicle copy;
            C4805LK c4805lk = C4805LK.this;
            copy = r2.copy((r35 & 1) != 0 ? r2.device : null, (r35 & 2) != 0 ? r2.bird : null, (r35 & 4) != 0 ? r2.battery : 0, (r35 & 8) != 0 ? r2.distance : 0, (r35 & 16) != 0 ? r2.locked : false, (r35 & 32) != 0 ? r2.energyMode : null, (r35 & 64) != 0 ? r2.authenticated : false, (r35 & 128) != 0 ? r2.connected : false, (r35 & 256) != 0 ? r2.rxDevice : null, (r35 & 512) != 0 ? r2.rssi : null, (r35 & 1024) != 0 ? r2.beaconHash : null, (r35 & 2048) != 0 ? r2.proximityUUID : null, (r35 & 4096) != 0 ? r2.imei : null, (r35 & 8192) != 0 ? r2.serialNumber : null, (r35 & 16384) != 0 ? r2.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.fault : null, (r35 & 65536) != 0 ? this.f21129h.vehicleVersion : null);
            c4805lk.m97289K2(copy);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$F */
    /* loaded from: classes4.dex */
    public static final class C4812F extends Lambda implements Function1<Throwable, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21131h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4812F(Vehicle vehicle) {
            super(1);
            this.f21131h = vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21131h.getBird().getSerialNumber();
            c4805lk.m97293J2("disconnect error: " + it + " + " + serialNumber);
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$G */
    /* loaded from: classes4.dex */
    public static final class C4813G extends Lambda implements Function1<Boolean, Unit> {
        public C4813G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C4805LK.this.m97293J2("recover from failure, disconnect");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$H */
    /* loaded from: classes4.dex */
    public static final class C4814H extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C4814H f21133g = new C4814H();

        public C4814H() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$I */
    /* loaded from: classes4.dex */
    public static final class C4815I extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<Integer> f21134g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4815I(Ref.ObjectRef<Integer> objectRef) {
            super(1);
            this.f21134g = objectRef;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Integer] */
        /* renamed from: a */
        public final void m97153a(Vehicle vehicle) {
            this.f21134g.element = Integer.valueOf(vehicle.getVehicleVersion().getFirmwareVersion());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97153a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$J */
    /* loaded from: classes4.dex */
    public static final class C4816J extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21136h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21137i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4816J(WireBird wireBird, boolean z) {
            super(1);
            this.f21136h = wireBird;
            this.f21137i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            copy = it.copy((r35 & 1) != 0 ? it.device : null, (r35 & 2) != 0 ? it.bird : this.f21136h, (r35 & 4) != 0 ? it.battery : 0, (r35 & 8) != 0 ? it.distance : 0, (r35 & 16) != 0 ? it.locked : false, (r35 & 32) != 0 ? it.energyMode : null, (r35 & 64) != 0 ? it.authenticated : false, (r35 & 128) != 0 ? it.connected : false, (r35 & 256) != 0 ? it.rxDevice : null, (r35 & 512) != 0 ? it.rssi : null, (r35 & 1024) != 0 ? it.beaconHash : null, (r35 & 2048) != 0 ? it.proximityUUID : null, (r35 & 4096) != 0 ? it.imei : null, (r35 & 8192) != 0 ? it.serialNumber : null, (r35 & 16384) != 0 ? it.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.fault : null, (r35 & 65536) != 0 ? it.vehicleVersion : null);
            return InterfaceC27246pJ.C27247a.connect$default(c4805lk, copy, true, false, this.f21137i, false, 20, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$K */
    /* loaded from: classes4.dex */
    public static final class C4817K extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f21139h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4817K(boolean z) {
            super(1);
            this.f21139h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13685m(it, this.f21139h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$L */
    /* loaded from: classes4.dex */
    public static final class C4818L extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21140g;

        /* renamed from: h */
        public final /* synthetic */ boolean f21141h;

        /* renamed from: i */
        public final /* synthetic */ C4805LK f21142i;

        /* renamed from: j */
        public final /* synthetic */ WireBird f21143j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4818L(boolean z, boolean z2, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21140g = z;
            this.f21141h = z2;
            this.f21142i = c4805lk;
            this.f21143j = wireBird;
        }

        /* renamed from: d */
        public static final Vehicle m97147d(Vehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
            return vehicle;
        }

        /* renamed from: e */
        public static final Vehicle m97146e(Vehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
            return vehicle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Vehicle> invoke(final Vehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "vehicle");
            boolean z = this.f21140g;
            if (z && this.f21141h) {
                return this.f21142i.m97273P1().mo71572m1(this.f21143j.getId()).m33048i0(new Callable() { // from class: PK
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Vehicle m97147d;
                        m97147d = C4805LK.C4818L.m97147d(Vehicle.this);
                        return m97147d;
                    }
                });
            }
            if (z && !this.f21141h) {
                return this.f21142i.m97273P1().mo71578d1(this.f21143j.getId()).m33048i0(new Callable() { // from class: QK
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Vehicle m97146e;
                        m97146e = C4805LK.C4818L.m97146e(Vehicle.this);
                        return m97146e;
                    }
                });
            }
            return AbstractC23442F.m33158H(vehicle);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$M */
    /* loaded from: classes4.dex */
    public static final class C4819M extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21145h;

        /* renamed from: i */
        public final /* synthetic */ int f21146i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4819M(WireBird wireBird, int i) {
            super(1);
            this.f21145h = wireBird;
            this.f21146i = i;
        }

        /* renamed from: a */
        public final void m97145a(InterfaceC23465c interfaceC23465c) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21145h.getSerialNumber();
            int i = this.f21146i;
            c4805lk.m97293J2("flash lights: " + serialNumber + ", minutes=" + i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97145a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$N */
    /* loaded from: classes4.dex */
    public static final class C4820N extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21148h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4820N(WireBird wireBird) {
            super(1);
            this.f21148h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            copy = it.copy((r35 & 1) != 0 ? it.device : null, (r35 & 2) != 0 ? it.bird : this.f21148h, (r35 & 4) != 0 ? it.battery : 0, (r35 & 8) != 0 ? it.distance : 0, (r35 & 16) != 0 ? it.locked : false, (r35 & 32) != 0 ? it.energyMode : null, (r35 & 64) != 0 ? it.authenticated : false, (r35 & 128) != 0 ? it.connected : false, (r35 & 256) != 0 ? it.rxDevice : null, (r35 & 512) != 0 ? it.rssi : null, (r35 & 1024) != 0 ? it.beaconHash : null, (r35 & 2048) != 0 ? it.proximityUUID : null, (r35 & 4096) != 0 ? it.imei : null, (r35 & 8192) != 0 ? it.serialNumber : null, (r35 & 16384) != 0 ? it.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.fault : null, (r35 & 65536) != 0 ? it.vehicleVersion : null);
            return InterfaceC27246pJ.C27247a.connect$default(c4805lk, copy, false, false, false, false, 30, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$O */
    /* loaded from: classes4.dex */
    public static final class C4821O extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {
        public C4821O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.authenticate$bluetooth_release$default(C4805LK.this, it, false, null, false, false, 20, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$P */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C4822P extends FunctionReferenceImpl implements Function1<Vehicle, Unit> {
        public C4822P(Object obj) {
            super(1, obj, C4805LK.class, "update", "update$bluetooth_release(Lco/bird/android/model/Vehicle;)V", 0);
        }

        /* renamed from: a */
        public final void m97142a(Vehicle p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C4805LK) this.receiver).m97289K2(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97142a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$Q */
    /* loaded from: classes4.dex */
    public static final class C4823Q extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ int f21151h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4823Q(int i) {
            super(1);
            this.f21151h = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13684n(it, this.f21151h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$R */
    /* loaded from: classes4.dex */
    public static final class C4824R extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21152g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21153h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21154i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4824R(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21152g = z;
            this.f21153h = c4805lk;
            this.f21154i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f21152g) {
                this.f21153h.m97330A1(this.f21154i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$S */
    /* loaded from: classes4.dex */
    public static final class C4825S extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21156h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21157i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4825S(WireBird wireBird, boolean z) {
            super(1);
            this.f21156h = wireBird;
            this.f21157i = z;
        }

        /* renamed from: a */
        public final void m97140a(InterfaceC23465c interfaceC23465c) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21156h.getSerialNumber();
            boolean z = this.f21157i;
            c4805lk.m97293J2("lights on/off: " + serialNumber + "}, value=" + z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97140a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$T */
    /* loaded from: classes4.dex */
    public static final class C4826T extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21159h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4826T(WireBird wireBird) {
            super(1);
            this.f21159h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            copy = it.copy((r35 & 1) != 0 ? it.device : null, (r35 & 2) != 0 ? it.bird : this.f21159h, (r35 & 4) != 0 ? it.battery : 0, (r35 & 8) != 0 ? it.distance : 0, (r35 & 16) != 0 ? it.locked : false, (r35 & 32) != 0 ? it.energyMode : null, (r35 & 64) != 0 ? it.authenticated : false, (r35 & 128) != 0 ? it.connected : false, (r35 & 256) != 0 ? it.rxDevice : null, (r35 & 512) != 0 ? it.rssi : null, (r35 & 1024) != 0 ? it.beaconHash : null, (r35 & 2048) != 0 ? it.proximityUUID : null, (r35 & 4096) != 0 ? it.imei : null, (r35 & 8192) != 0 ? it.serialNumber : null, (r35 & 16384) != 0 ? it.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.fault : null, (r35 & 65536) != 0 ? it.vehicleVersion : null);
            return InterfaceC27246pJ.C27247a.connect$default(c4805lk, copy, false, false, false, false, 30, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$U */
    /* loaded from: classes4.dex */
    public static final class C4827U extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {
        public C4827U() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.authenticate$bluetooth_release$default(C4805LK.this, it, false, null, false, false, 20, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$V */
    /* loaded from: classes4.dex */
    public static final class C4828V extends Lambda implements Function1<Vehicle, Unit> {
        public C4828V() {
            super(1);
        }

        /* renamed from: a */
        public final void m97137a(Vehicle it) {
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c4805lk.m97289K2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97137a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$W */
    /* loaded from: classes4.dex */
    public static final class C4829W extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f21163h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4829W(boolean z) {
            super(1);
            this.f21163h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13681q(it, this.f21163h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$X */
    /* loaded from: classes4.dex */
    public static final class C4830X extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21164g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21165h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21166i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4830X(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21164g = z;
            this.f21165h = c4805lk;
            this.f21166i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f21164g) {
                this.f21165h.m97330A1(this.f21166i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$Y */
    /* loaded from: classes4.dex */
    public static final class C4831Y extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21168h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21169i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4831Y(WireBird wireBird, boolean z) {
            super(1);
            this.f21168h = wireBird;
            this.f21169i = z;
        }

        /* renamed from: a */
        public final void m97135a(InterfaceC23465c interfaceC23465c) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21168h.getSerialNumber();
            boolean z = this.f21169i;
            c4805lk.m97293J2("lock: " + serialNumber + "}, value=" + z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97135a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$Z */
    /* loaded from: classes4.dex */
    public static final class C4832Z extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21171h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4832Z(WireBird wireBird) {
            super(1);
            this.f21171h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            copy = it.copy((r35 & 1) != 0 ? it.device : null, (r35 & 2) != 0 ? it.bird : this.f21171h, (r35 & 4) != 0 ? it.battery : 0, (r35 & 8) != 0 ? it.distance : 0, (r35 & 16) != 0 ? it.locked : false, (r35 & 32) != 0 ? it.energyMode : null, (r35 & 64) != 0 ? it.authenticated : false, (r35 & 128) != 0 ? it.connected : false, (r35 & 256) != 0 ? it.rxDevice : null, (r35 & 512) != 0 ? it.rssi : null, (r35 & 1024) != 0 ? it.beaconHash : null, (r35 & 2048) != 0 ? it.proximityUUID : null, (r35 & 4096) != 0 ? it.imei : null, (r35 & 8192) != 0 ? it.serialNumber : null, (r35 & 16384) != 0 ? it.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.fault : null, (r35 & 65536) != 0 ? it.vehicleVersion : null);
            return InterfaceC27246pJ.C27247a.connect$default(c4805lk, copy, false, false, false, false, 30, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LLK$a;", "", "", "AUTO_RECONNECT_DELAY_SECONDS", "I", "", "DEFAULT_TIMEOUT_SECONDS", "J", "READ_INFO_TIMEOUT_SECONDS", "TOTAL_LOCK_TIMEOUT_SECONDS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lco/bird/android/model/VehicleDescriptor;", "Lco/bird/android/model/Vehicle;", "scannedVehicles", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: LK$a */
    /* loaded from: classes4.dex */
    public static final class C4833a {
        public /* synthetic */ C4833a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4833a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$a0 */
    /* loaded from: classes4.dex */
    public static final class C4834a0 extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f21173h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21174i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4834a0(boolean z, boolean z2) {
            super(1);
            this.f21173h = z;
            this.f21174i = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.authenticate$bluetooth_release$default(C4805LK.this, it, this.f21173h, null, !this.f21174i, false, 20, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$b */
    /* loaded from: classes4.dex */
    public static final class C4835b extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21176h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4835b(WireBird wireBird) {
            super(1);
            this.f21176h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            copy = it.copy((r35 & 1) != 0 ? it.device : null, (r35 & 2) != 0 ? it.bird : this.f21176h, (r35 & 4) != 0 ? it.battery : 0, (r35 & 8) != 0 ? it.distance : 0, (r35 & 16) != 0 ? it.locked : false, (r35 & 32) != 0 ? it.energyMode : null, (r35 & 64) != 0 ? it.authenticated : false, (r35 & 128) != 0 ? it.connected : false, (r35 & 256) != 0 ? it.rxDevice : null, (r35 & 512) != 0 ? it.rssi : null, (r35 & 1024) != 0 ? it.beaconHash : null, (r35 & 2048) != 0 ? it.proximityUUID : null, (r35 & 4096) != 0 ? it.imei : null, (r35 & 8192) != 0 ? it.serialNumber : null, (r35 & 16384) != 0 ? it.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.fault : null, (r35 & 65536) != 0 ? it.vehicleVersion : null);
            return InterfaceC27246pJ.C27247a.connect$default(c4805lk, copy, false, false, false, false, 30, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$b0 */
    /* loaded from: classes4.dex */
    public static final class C4836b0 extends Lambda implements Function1<Vehicle, Unit> {
        public C4836b0() {
            super(1);
        }

        /* renamed from: a */
        public final void m97131a(Vehicle it) {
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c4805lk.m97289K2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97131a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$c */
    /* loaded from: classes4.dex */
    public static final class C4837c extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ AlarmType f21179h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4837c(AlarmType alarmType) {
            super(1);
            this.f21179h = alarmType;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13690h(it, this.f21179h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$c0 */
    /* loaded from: classes4.dex */
    public static final class C4838c0 extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21180g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21181h;

        /* renamed from: i */
        public final /* synthetic */ Function0<Boolean> f21182i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4838c0(boolean z, C4805LK c4805lk, Function0<Boolean> function0) {
            super(1);
            this.f21180g = z;
            this.f21181h = c4805lk;
            this.f21182i = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "vehicle");
            if (this.f21180g == vehicle.getLocked()) {
                C4805LK c4805lk = this.f21181h;
                boolean z = this.f21180g;
                c4805lk.m97293J2("lock: already " + z);
                Observable just = Observable.just(vehicle);
                Intrinsics.checkNotNullExpressionValue(just, "{\n          trace(\"lock:…e.just(vehicle)\n        }");
                return just;
            } else if (this.f21182i.invoke().booleanValue()) {
                C4805LK c4805lk2 = this.f21181h;
                boolean z2 = this.f21180g;
                c4805lk2.m97293J2("lock: ble_lock already locked " + z2 + " externally");
                Observable just2 = Observable.just(vehicle);
                Intrinsics.checkNotNullExpressionValue(just2, "{\n          trace(\"lock:…e.just(vehicle)\n        }");
                return just2;
            } else {
                C4805LK c4805lk3 = this.f21181h;
                boolean z3 = this.f21180g;
                c4805lk3.m97293J2("lock: ble_lock " + z3);
                return this.f21181h.m97208l1(vehicle, this.f21180g);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$d */
    /* loaded from: classes4.dex */
    public static final class C4839d extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21183g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21184h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21185i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4839d(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21183g = z;
            this.f21184h = c4805lk;
            this.f21185i = wireBird;
        }

        /* renamed from: a */
        public final void m97128a(Vehicle vehicle) {
            if (this.f21183g) {
                this.f21184h.m97330A1(this.f21185i);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97128a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$d0 */
    /* loaded from: classes4.dex */
    public static final class C4840d0 extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21186g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21187h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21188i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4840d0(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21186g = z;
            this.f21187h = c4805lk;
            this.f21188i = wireBird;
        }

        /* renamed from: a */
        public final void m97127a(Vehicle vehicle) {
            if (this.f21186g) {
                this.f21187h.m97330A1(this.f21188i);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97127a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$e */
    /* loaded from: classes4.dex */
    public static final class C4841e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21189g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21190h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21191i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4841e(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21189g = z;
            this.f21190h = c4805lk;
            this.f21191i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f21189g) {
                this.f21190h.m97330A1(this.f21191i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$e0 */
    /* loaded from: classes4.dex */
    public static final class C4842e0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21192g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21193h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21194i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4842e0(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21192g = z;
            this.f21193h = c4805lk;
            this.f21194i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f21192g) {
                this.f21193h.m97330A1(this.f21194i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001az\u00126\b\u0001\u00122\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u0005 \u0004*\u0018\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0004*<\u00126\b\u0001\u00122\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u0005 \u0004*\u0018\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicleWithNewDistance", "Lio/reactivex/B;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$f */
    /* loaded from: classes4.dex */
    public static final class C4843f extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Pair<? extends Vehicle, ? extends String>>> {
        public C4843f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Pair<Vehicle, String>> invoke(Vehicle vehicleWithNewDistance) {
            Intrinsics.checkNotNullParameter(vehicleWithNewDistance, "vehicleWithNewDistance");
            C41318g46.m40163a("vehicle with new distance in authenticate : " + vehicleWithNewDistance, new Object[0]);
            C24523e c24523e = C24523e.f91168a;
            Observable just = Observable.just(vehicleWithNewDistance);
            Intrinsics.checkNotNullExpressionValue(just, "just(vehicleWithNewDistance)");
            return c24523e.m31956a(just, C4805LK.this.f21105b.mo21390Y(vehicleWithNewDistance.getBird().getSerialNumber(), vehicleWithNewDistance.getDistance()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$logDeepSleepEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,969:1\n1#2:970\n*E\n"})
    /* renamed from: LK$f0 */
    /* loaded from: classes4.dex */
    public static final class C4844f0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C4464KY f21196g;

        /* renamed from: h */
        public final /* synthetic */ C38431bE5 f21197h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21198i;

        /* renamed from: j */
        public final /* synthetic */ C4805LK f21199j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4844f0(C4464KY c4464ky, C38431bE5 c38431bE5, boolean z, C4805LK c4805lk) {
            super(1);
            this.f21196g = c4464ky;
            this.f21197h = c38431bE5;
            this.f21198i = z;
            this.f21199j = c4805lk;
        }

        /* renamed from: a */
        public final void m97125a(InterfaceC23465c interfaceC23465c) {
            C4464KY c4464ky = this.f21196g;
            if (c4464ky != null) {
                boolean z = this.f21198i;
                C4805LK c4805lk = this.f21199j;
                if (!z) {
                    c4805lk.f21108e.mo55905y(c4464ky);
                }
            }
            C38431bE5 c38431bE5 = this.f21197h;
            if (c38431bE5 != null) {
                boolean z2 = this.f21198i;
                C4805LK c4805lk2 = this.f21199j;
                if (z2) {
                    c4805lk2.f21108e.mo55905y(c38431bE5);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97125a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$g */
    /* loaded from: classes4.dex */
    public static final class C4845g extends Lambda implements Function1<Pair<? extends Vehicle, ? extends String>, Unit> {
        public C4845g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Vehicle, ? extends String> pair) {
            invoke2((Pair<Vehicle, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Vehicle, String> pair) {
            C4805LK c4805lk = C4805LK.this;
            c4805lk.m97293J2("authenticate: obtained vehicle token: " + pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$g0 */
    /* loaded from: classes4.dex */
    public static final class C4846g0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f21202h;

        /* renamed from: i */
        public final /* synthetic */ C4464KY f21203i;

        /* renamed from: j */
        public final /* synthetic */ C38431bE5 f21204j;

        /* renamed from: k */
        public final /* synthetic */ Integer f21205k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4846g0(boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, Integer num) {
            super(1);
            this.f21202h = z;
            this.f21203i = c4464ky;
            this.f21204j = c38431bE5;
            this.f21205k = num;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String name;
            if (th instanceof BluetoothException) {
                name = ((BluetoothException) th).getReason().name();
            } else {
                name = BluetoothException.Reason.UNKNOWN.name();
            }
            C4805LK.this.m97204m2(this.f21202h, this.f21203i, this.f21204j, this.f21205k, name);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$h */
    /* loaded from: classes4.dex */
    public static final class C4847h extends Lambda implements Function1<Pair<? extends Vehicle, ? extends String>, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f21207h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f21208i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4847h(boolean z, DateTime dateTime) {
            super(1);
            this.f21207h = z;
            this.f21208i = dateTime;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Vehicle> invoke2(Pair<Vehicle, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Vehicle vehicleWithNewDistance = pair.component1();
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(vehicleWithNewDistance, "vehicleWithNewDistance");
            return c4805lk.m97238b1(vehicleWithNewDistance, pair.component2(), this.f21207h, this.f21208i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Vehicle> invoke(Pair<? extends Vehicle, ? extends String> pair) {
            return invoke2((Pair<Vehicle, String>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$h0 */
    /* loaded from: classes4.dex */
    public static final class C4848h0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21210h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4848h0(WireBird wireBird) {
            super(1);
            this.f21210h = wireBird;
        }

        /* renamed from: a */
        public final void m97124a(InterfaceC23465c interfaceC23465c) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21210h.getSerialNumber();
            c4805lk.m97293J2("reading network status info: " + serialNumber);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97124a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$i */
    /* loaded from: classes4.dex */
    public static final class C4849i extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Vehicle f21211g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21212h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21213i;

        /* renamed from: j */
        public final /* synthetic */ boolean f21214j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4849i(Vehicle vehicle, C4805LK c4805lk, boolean z, boolean z2) {
            super(1);
            this.f21211g = vehicle;
            this.f21212h = c4805lk;
            this.f21213i = z;
            this.f21214j = z2;
        }

        /* renamed from: a */
        public final void m97123a(Vehicle vehicle) {
            WireBird bird = this.f21211g.getBird();
            Config m80769c = C36441Uq4.m80769c(this.f21212h.f21110g, bird);
            if (this.f21213i) {
                if ((this.f21214j && WireBirdKt.shouldTrackInRideBluetooth(bird, m80769c)) || WireBirdKt.shouldTrackOutOfRideBluetooth(bird, m80769c)) {
                    this.f21212h.m97305G2(this.f21211g, this.f21214j);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97123a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$i0 */
    /* loaded from: classes4.dex */
    public static final class C4850i0 extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21216h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4850i0(WireBird wireBird) {
            super(1);
            this.f21216h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            copy = it.copy((r35 & 1) != 0 ? it.device : null, (r35 & 2) != 0 ? it.bird : this.f21216h, (r35 & 4) != 0 ? it.battery : 0, (r35 & 8) != 0 ? it.distance : 0, (r35 & 16) != 0 ? it.locked : false, (r35 & 32) != 0 ? it.energyMode : null, (r35 & 64) != 0 ? it.authenticated : false, (r35 & 128) != 0 ? it.connected : false, (r35 & 256) != 0 ? it.rxDevice : null, (r35 & 512) != 0 ? it.rssi : null, (r35 & 1024) != 0 ? it.beaconHash : null, (r35 & 2048) != 0 ? it.proximityUUID : null, (r35 & 4096) != 0 ? it.imei : null, (r35 & 8192) != 0 ? it.serialNumber : null, (r35 & 16384) != 0 ? it.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.fault : null, (r35 & 65536) != 0 ? it.vehicleVersion : null);
            return InterfaceC27246pJ.C27247a.connect$default(c4805lk, copy, false, false, false, false, 30, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$j */
    /* loaded from: classes4.dex */
    public static final class C4851j extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public static final C4851j f21217g = new C4851j();

        public C4851j() {
            super(1);
        }

        /* renamed from: a */
        public final void m97121a(InterfaceC23465c interfaceC23465c) {
            C41318g46.m40151m("jstaahl: TRYING!", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97121a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$j0 */
    /* loaded from: classes4.dex */
    public static final class C4852j0 extends Lambda implements Function1<Vehicle, Unit> {
        public C4852j0() {
            super(1);
        }

        /* renamed from: a */
        public final void m97120a(Vehicle it) {
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c4805lk.m97289K2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97120a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$k */
    /* loaded from: classes4.dex */
    public static final class C4853k extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {
        public C4853k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InterfaceC27246pJ.C27247a.connect$default(C4805LK.this, it, false, true, false, false, 26, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$k0 */
    /* loaded from: classes4.dex */
    public static final class C4854k0 extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {
        public C4854k0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13680r(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$l */
    /* loaded from: classes4.dex */
    public static final class C4855l extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f21222h;

        /* renamed from: i */
        public final /* synthetic */ DateTime f21223i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4855l(boolean z, DateTime dateTime) {
            super(1);
            this.f21222h = z;
            this.f21223i = dateTime;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.authenticate$bluetooth_release$default(C4805LK.this, it, this.f21222h, this.f21223i, false, false, 24, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$l0 */
    /* loaded from: classes4.dex */
    public static final class C4856l0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21224g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21225h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21226i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4856l0(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21224g = z;
            this.f21225h = c4805lk;
            this.f21226i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f21224g) {
                this.f21225h.m97330A1(this.f21226i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$m */
    /* loaded from: classes4.dex */
    public static final class C4857m extends Lambda implements Function1<Vehicle, Unit> {
        public C4857m() {
            super(1);
        }

        /* renamed from: a */
        public final void m97116a(Vehicle it) {
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c4805lk.m97289K2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97116a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/y;", "Lco/bird/android/model/Vehicle;", "emitter", "", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$m0 */
    /* loaded from: classes4.dex */
    public static final class C4858m0 extends Lambda implements Function1<InterfaceC24578y<Vehicle>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21229h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21230i;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: LK$m0$a */
        /* loaded from: classes4.dex */
        public static final class C4859a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C4805LK f21231g;

            /* renamed from: h */
            public final /* synthetic */ C4860b f21232h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4859a(C4805LK c4805lk, C4860b c4860b) {
                super(0);
                this.f21231g = c4805lk;
                this.f21232h = c4860b;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f21231g.m97301H2(this.f21232h);
            }
        }

        @Metadata(m28433d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, m28432d2 = {"LK$m0$b", "Ljj5;", "", "errorCode", "", "b", "callbackType", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "c", "", "results", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scan$1$scanCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,969:1\n1855#2,2:970\n*S KotlinDebug\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scan$1$scanCallback$1\n*L\n570#1:970,2\n*E\n"})
        /* renamed from: LK$m0$b */
        /* loaded from: classes4.dex */
        public static final class C4860b extends AbstractC43480jj5 {

            /* renamed from: a */
            public final /* synthetic */ C4805LK f21233a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC24578y<Vehicle> f21234b;

            /* renamed from: c */
            public final /* synthetic */ WireBird f21235c;

            /* renamed from: d */
            public final /* synthetic */ boolean f21236d;

            /* renamed from: e */
            public final /* synthetic */ AtomicBoolean f21237e;

            public C4860b(C4805LK c4805lk, InterfaceC24578y<Vehicle> interfaceC24578y, WireBird wireBird, boolean z, AtomicBoolean atomicBoolean) {
                this.f21233a = c4805lk;
                this.f21234b = interfaceC24578y;
                this.f21235c = wireBird;
                this.f21236d = z;
                this.f21237e = atomicBoolean;
            }

            @Override // p000.AbstractC43480jj5
            /* renamed from: a */
            public void mo30024a(List<ScanResult> results) {
                Intrinsics.checkNotNullParameter(results, "results");
                super.mo30024a(results);
                for (ScanResult scanResult : results) {
                    m97112d(scanResult);
                }
            }

            @Override // p000.AbstractC43480jj5
            /* renamed from: b */
            public void mo30023b(int i) {
                super.mo30023b(i);
                this.f21233a.m97301H2(this);
                C4805LK.m97177u2(this.f21234b, this.f21233a, this.f21235c, this.f21236d, BluetoothException.Reason.SCAN);
            }

            @Override // p000.AbstractC43480jj5
            /* renamed from: c */
            public void mo30022c(int i, ScanResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                super.mo30022c(i, result);
                m97112d(result);
            }

            /* renamed from: d */
            public final void m97112d(ScanResult scanResult) {
                byte[] bArr;
                VehicleDescriptor m80925Z = C36388Uk5.m80925Z(scanResult);
                C4805LK c4805lk = this.f21233a;
                String address = scanResult.m22434a().getAddress();
                String m80921d = C36388Uk5.m80921d(scanResult);
                String imei = this.f21235c.getImei();
                String serialNumber = this.f21235c.getSerialNumber();
                c4805lk.m97293J2("handleScanResult via BleCompat: " + address + ", " + m80921d + " descriptor: " + m80925Z + " bird imei " + imei + " | serial number " + serialNumber);
                if (m80925Z.matchesBird(this.f21235c)) {
                    if (!this.f21237e.get()) {
                        C4805LK c4805lk2 = this.f21233a;
                        String serialNumber2 = this.f21235c.getSerialNumber();
                        c4805lk2.m97293J2("scan: found bird service: " + serialNumber2);
                        BluetoothDevice m22434a = scanResult.m22434a();
                        Intrinsics.checkNotNullExpressionValue(m22434a, "result.device");
                        Vehicle vehicle = new Vehicle(m22434a, this.f21235c, 0, 0, false, null, false, false, null, null, null, null, m80925Z.getImei(), m80925Z.getSerialNumber(), null, null, null, 118780, null);
                        C31942Bk5 m22432c = scanResult.m22432c();
                        if (m22432c != null) {
                            bArr = m22432c.m113539b();
                        } else {
                            bArr = null;
                        }
                        if (C7798TK.m83811a(vehicle, bArr)) {
                            C4805LK.f21103p.put(m80925Z, vehicle);
                            C4805LK c4805lk3 = this.f21233a;
                            String serialNumber3 = vehicle.getBird().getSerialNumber();
                            c4805lk3.m97293J2("scan: found a valid vehicle: " + serialNumber3);
                            this.f21237e.set(true);
                            this.f21233a.m97301H2(this);
                            this.f21233a.m97289K2(vehicle);
                            this.f21234b.onNext(vehicle);
                            this.f21234b.onComplete();
                            return;
                        }
                        C4805LK c4805lk4 = this.f21233a;
                        String serialNumber4 = vehicle.getBird().getSerialNumber();
                        c4805lk4.m97293J2("scan: found a junk vehicle: " + serialNumber4);
                        C4805LK.m97177u2(this.f21234b, this.f21233a, this.f21235c, this.f21236d, BluetoothException.Reason.SCAN);
                        return;
                    }
                    this.f21233a.m97301H2(this);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4858m0(WireBird wireBird, boolean z) {
            super(1);
            this.f21229h = wireBird;
            this.f21230i = z;
        }

        /* renamed from: c */
        public static final void m97113c(C4805LK this$0, C4860b scanCallback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(scanCallback, "$scanCallback");
            this$0.m97301H2(scanCallback);
        }

        /* renamed from: b */
        public final void m97114b(InterfaceC24578y<Vehicle> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21229h.getSerialNumber();
            c4805lk.m97293J2("scan: " + serialNumber);
            if (C4805LK.this.m97267R1()) {
                C4805LK.this.m97293J2("scan: bluetooth off");
                C4805LK.m97177u2(emitter, C4805LK.this, this.f21229h, this.f21230i, BluetoothException.Reason.DISABLED);
                return;
            }
            C4805LK.this.m97285L2(this.f21229h);
            Vehicle vehicle = (Vehicle) C4805LK.f21103p.get(C49697uC6.m10640b(this.f21229h));
            if (vehicle != null) {
                C4805LK.this.m97293J2("scan: found vehicle, just return");
                emitter.onNext(vehicle);
                emitter.onComplete();
            } else if (C4805LK.this.f21115l) {
                C4805LK.this.m97293J2("scan: scanning, ignore");
                emitter.onComplete();
            } else {
                final C4860b c4860b = new C4860b(C4805LK.this, emitter, this.f21229h, this.f21230i, new AtomicBoolean(false));
                final C4805LK c4805lk2 = C4805LK.this;
                emitter.mo11916a(new InterfaceC23483f() { // from class: RK
                    @Override // io.reactivex.functions.InterfaceC23483f
                    public final void cancel() {
                        C4805LK.C4858m0.m97113c(C4805LK.this, c4860b);
                    }
                });
                C4805LK c4805lk3 = C4805LK.this;
                C4805LK.startScanBle$bluetooth_release$default(c4805lk3, c4860b, c4805lk3.m97270Q1(this.f21229h), 0, 4, null);
                C4805LK.this.f21107d.mo44185c(new C4859a(C4805LK.this, c4860b), 10L);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<Vehicle> interfaceC24578y) {
            m97114b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003 \u0004*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicleWithNewToken", "Lio/reactivex/B;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$n */
    /* loaded from: classes4.dex */
    public static final class C4861n extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Pair<? extends Vehicle, ? extends Vehicle>>> {
        public C4861n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Pair<Vehicle, Vehicle>> invoke(Vehicle vehicleWithNewToken) {
            Intrinsics.checkNotNullParameter(vehicleWithNewToken, "vehicleWithNewToken");
            C24523e c24523e = C24523e.f91168a;
            Observable just = Observable.just(vehicleWithNewToken);
            Intrinsics.checkNotNullExpressionValue(just, "just(vehicleWithNewToken)");
            Observable<Vehicle> m33123k0 = C4805LK.this.f21106c.mo13688j(vehicleWithNewToken).m33123k0();
            Intrinsics.checkNotNullExpressionValue(m33123k0, "vehicleManager.authentic…hNewToken).toObservable()");
            return c24523e.m31956a(just, m33123k0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/y;", "", "Lco/bird/android/model/Vehicle;", "emitter", "", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$n0 */
    /* loaded from: classes4.dex */
    public static final class C4862n0 extends Lambda implements Function1<InterfaceC24578y<List<? extends Vehicle>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f21240h;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,969:1\n125#2:970\n152#2,3:971\n*S KotlinDebug\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$2\n*L\n509#1:970\n509#1:971,3\n*E\n"})
        /* renamed from: LK$n0$a */
        /* loaded from: classes4.dex */
        public static final class C4863a extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ C4805LK f21241g;

            /* renamed from: h */
            public final /* synthetic */ C4864b f21242h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC24578y<List<Vehicle>> f21243i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4863a(C4805LK c4805lk, C4864b c4864b, InterfaceC24578y<List<Vehicle>> interfaceC24578y) {
                super(0);
                this.f21241g = c4805lk;
                this.f21242h = c4864b;
                this.f21243i = interfaceC24578y;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List<Vehicle> list;
                this.f21241g.m97301H2(this.f21242h);
                InterfaceC24578y<List<Vehicle>> interfaceC24578y = this.f21243i;
                ConcurrentHashMap concurrentHashMap = C4805LK.f21103p;
                ArrayList arrayList = new ArrayList(concurrentHashMap.size());
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    arrayList.add((Vehicle) entry.getValue());
                }
                list = CollectionsKt___CollectionsKt.toList(arrayList);
                interfaceC24578y.onNext(list);
                this.f21243i.onComplete();
            }
        }

        @Metadata(m28433d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, m28432d2 = {"LK$n0$b", "Ljj5;", "", "errorCode", "", "b", "callbackType", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "c", "", "results", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$scanCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,969:1\n1855#2,2:970\n*S KotlinDebug\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$scanCallback$1\n*L\n477#1:970,2\n*E\n"})
        /* renamed from: LK$n0$b */
        /* loaded from: classes4.dex */
        public static final class C4864b extends AbstractC43480jj5 {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC24578y<List<Vehicle>> f21244a;

            /* renamed from: b */
            public final /* synthetic */ C4805LK f21245b;

            /* renamed from: c */
            public final /* synthetic */ Set<Vehicle> f21246c;

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: LK$n0$b$a */
            /* loaded from: classes4.dex */
            public static final class C4865a extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ ScanResult f21247g;

                /* renamed from: h */
                public final /* synthetic */ Set<Vehicle> f21248h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4865a(ScanResult scanResult, Set<Vehicle> set) {
                    super(0);
                    this.f21247g = scanResult;
                    this.f21248h = set;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    VehicleDescriptor m80925Z = C36388Uk5.m80925Z(this.f21247g);
                    if (m80925Z.isValid()) {
                        String serialNumber = m80925Z.getSerialNumber();
                        if (serialNumber == null) {
                            serialNumber = "";
                        }
                        String str = serialNumber;
                        BluetoothDevice device = this.f21247g.m22434a();
                        WireBird wireBird = new WireBird(null, null, null, 0, null, 0, null, null, null, str, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, m80925Z.getImei(), null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -513, -33, 3, null);
                        String imei = m80925Z.getImei();
                        Intrinsics.checkNotNullExpressionValue(device, "device");
                        Vehicle vehicle = new Vehicle(device, wireBird, 0, 0, false, null, false, false, null, null, null, null, imei, str, null, null, null, 118780, null);
                        if (this.f21248h.contains(vehicle)) {
                            return;
                        }
                        C31942Bk5 m22432c = this.f21247g.m22432c();
                        if (C7798TK.m83811a(vehicle, m22432c != null ? m22432c.m113539b() : null)) {
                            this.f21248h.add(vehicle);
                            C4805LK.f21103p.put(m80925Z, vehicle);
                        }
                    }
                }
            }

            public C4864b(InterfaceC24578y<List<Vehicle>> interfaceC24578y, C4805LK c4805lk, Set<Vehicle> set) {
                this.f21244a = interfaceC24578y;
                this.f21245b = c4805lk;
                this.f21246c = set;
            }

            @Override // p000.AbstractC43480jj5
            /* renamed from: a */
            public void mo30024a(List<ScanResult> results) {
                Intrinsics.checkNotNullParameter(results, "results");
                super.mo30024a(results);
                for (ScanResult scanResult : results) {
                    m97107d(scanResult);
                }
            }

            @Override // p000.AbstractC43480jj5
            /* renamed from: b */
            public void mo30023b(int i) {
                super.mo30023b(i);
                this.f21244a.onError(new BluetoothException(null, BluetoothException.Reason.SCAN, 1, null));
                this.f21245b.m97301H2(this);
            }

            @Override // p000.AbstractC43480jj5
            /* renamed from: c */
            public void mo30022c(int i, ScanResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                super.mo30022c(i, result);
                m97107d(result);
            }

            /* renamed from: d */
            public final void m97107d(ScanResult scanResult) {
                this.f21245b.f21107d.mo44186b(new C4865a(scanResult, this.f21246c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4862n0(int i) {
            super(1);
            this.f21240h = i;
        }

        /* renamed from: c */
        public static final void m97108c(C4805LK this$0, C4864b scanCallback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(scanCallback, "$scanCallback");
            this$0.m97301H2(scanCallback);
        }

        /* renamed from: b */
        public final void m97109b(InterfaceC24578y<List<Vehicle>> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C4805LK.this.m97293J2("scanBatch latest");
            if (C4805LK.this.m97267R1()) {
                C4805LK.this.m97293J2("scanBatch: bluetooth off");
                emitter.onError(new BluetoothException(null, BluetoothException.Reason.DISABLED, 1, null));
            } else if (C4805LK.this.f21115l) {
                C4805LK.this.m97293J2("scanBatch: scanning, ignore");
                emitter.onComplete();
            } else {
                final C4864b c4864b = new C4864b(emitter, C4805LK.this, Collections.synchronizedSet(new LinkedHashSet()));
                final C4805LK c4805lk = C4805LK.this;
                emitter.mo11916a(new InterfaceC23483f() { // from class: SK
                    @Override // io.reactivex.functions.InterfaceC23483f
                    public final void cancel() {
                        C4805LK.C4862n0.m97108c(C4805LK.this, c4864b);
                    }
                });
                C4805LK.startScanBle$bluetooth_release$default(C4805LK.this, c4864b, null, 0, 2, null);
                C4805LK.this.f21107d.mo44185c(new C4863a(C4805LK.this, c4864b, emitter), this.f21240h);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<List<? extends Vehicle>> interfaceC24578y) {
            m97109b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$o */
    /* loaded from: classes4.dex */
    public static final class C4866o extends Lambda implements Function1<Pair<? extends Vehicle, ? extends Vehicle>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ DateTime f21250h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21251i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LK$o$a */
        /* loaded from: classes4.dex */
        public static final class C4867a extends Lambda implements Function1<Unit, DateTime> {

            /* renamed from: g */
            public static final C4867a f21252g = new C4867a();

            public C4867a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final DateTime invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return DateTime.now();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lorg/joda/time/DateTime;", "disconnectedAt", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lorg/joda/time/DateTime;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: LK$o$b */
        /* loaded from: classes4.dex */
        public static final class C4868b extends Lambda implements Function1<DateTime, InterfaceC23434B<? extends Vehicle>> {

            /* renamed from: g */
            public final /* synthetic */ C4805LK f21253g;

            /* renamed from: h */
            public final /* synthetic */ Vehicle f21254h;

            /* renamed from: i */
            public final /* synthetic */ boolean f21255i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4868b(C4805LK c4805lk, Vehicle vehicle, boolean z) {
                super(1);
                this.f21253g = c4805lk;
                this.f21254h = vehicle;
                this.f21255i = z;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<? extends Vehicle> invoke(DateTime disconnectedAt) {
                Intrinsics.checkNotNullParameter(disconnectedAt, "disconnectedAt");
                C4805LK c4805lk = this.f21253g;
                Vehicle vehicleWithNewToken = this.f21254h;
                Intrinsics.checkNotNullExpressionValue(vehicleWithNewToken, "vehicleWithNewToken");
                return c4805lk.m97253W0(vehicleWithNewToken, this.f21255i, disconnectedAt);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Lco/bird/android/model/wire/WireBird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: LK$o$c */
        /* loaded from: classes4.dex */
        public static final class C4869c extends Lambda implements Function1<WireBird, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Vehicle f21256g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4869c(Vehicle vehicle) {
                super(1);
                this.f21256g = vehicle;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(WireBird it) {
                WireBird copy;
                Intrinsics.checkNotNullParameter(it, "it");
                WireBird bird = this.f21256g.getBird();
                Vehicle vehicle = this.f21256g;
                copy = bird.copy((r91 & 1) != 0 ? bird.f66717id : null, (r91 & 2) != 0 ? bird.model : null, (r91 & 4) != 0 ? bird.taskId : null, (r91 & 8) != 0 ? bird.batteryLevel : 0, (r91 & 16) != 0 ? bird.estimatedRange : null, (r91 & 32) != 0 ? bird.distance : 0, (r91 & 64) != 0 ? bird.location : null, (r91 & 128) != 0 ? bird.code : null, (r91 & 256) != 0 ? bird.stickerId : null, (r91 & 512) != 0 ? bird.serialNumber : null, (r91 & 1024) != 0 ? bird.disconnected : false, (r91 & 2048) != 0 ? bird.collect : false, (r91 & 4096) != 0 ? bird.submerged : false, (r91 & 8192) != 0 ? bird.lost : false, (r91 & 16384) != 0 ? bird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r91 & 65536) != 0 ? bird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r91 & 524288) != 0 ? bird.label : null, (r91 & 1048576) != 0 ? bird.actions : null, (r91 & 2097152) != 0 ? bird.bountyId : null, (r91 & 4194304) != 0 ? bird.bountyPrice : null, (r91 & 8388608) != 0 ? bird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r91 & 33554432) != 0 ? bird.bountyOverdue : false, (r91 & 67108864) != 0 ? bird.bountyKind : null, (r91 & 134217728) != 0 ? bird.brandName : null, (r91 & 268435456) != 0 ? bird.taskKind : null, (r91 & 536870912) != 0 ? bird.gpsAt : null, (r91 & 1073741824) != 0 ? bird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r92 & 1) != 0 ? bird.bluetooth : false, (r92 & 2) != 0 ? bird.cellular : false, (r92 & 4) != 0 ? bird.startedAt : null, (r92 & 8) != 0 ? bird.dueAt : null, (r92 & 16) != 0 ? bird.asleep : false, (r92 & 32) != 0 ? bird.imei : vehicle != null ? vehicle.getImei() : null, (r92 & 64) != 0 ? bird.boardProtocol : null, (r92 & 128) != 0 ? bird.physicalLock : null, (r92 & 256) != 0 ? bird.priorityCollect : false, (r92 & 512) != 0 ? bird.down : false, (r92 & 1024) != 0 ? bird.needsInspection : false, (r92 & 2048) != 0 ? bird.partnerId : null, (r92 & 4096) != 0 ? bird.nestId : null, (r92 & 8192) != 0 ? bird.lastRideEndedAt : null, (r92 & 16384) != 0 ? bird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.peril : false, (r92 & 65536) != 0 ? bird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.offline : false, (r92 & 524288) != 0 ? bird.license : null, (r92 & 1048576) != 0 ? bird.areaKey : null, (r92 & 2097152) != 0 ? bird.fleetId : null, (r92 & 4194304) != 0 ? bird.nestPurpose : null, (r92 & 8388608) != 0 ? bird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r92 & 33554432) != 0 ? bird.badgeType : null, (r92 & 67108864) != 0 ? bird.bountyReasons : null, (r92 & 134217728) != 0 ? bird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? bird.ephemeralId : null, (r92 & 536870912) != 0 ? bird.hasHelmet : false, (r92 & 1073741824) != 0 ? bird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? bird.bleMacAddress : null, (r93 & 1) != 0 ? bird.cellId : null, (r93 & 2) != 0 ? bird.externalFeedType : null);
                return Boolean.valueOf(it.isProbablySame(copy));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4866o(DateTime dateTime, boolean z) {
            super(1);
            this.f21250h = dateTime;
            this.f21251i = z;
        }

        /* renamed from: d */
        public static final DateTime m97103d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (DateTime) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final InterfaceC23434B m97102e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final boolean m97101f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Vehicle, ? extends Vehicle> pair) {
            invoke2((Pair<Vehicle, Vehicle>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Vehicle, Vehicle> pair) {
            Vehicle vehicleWithNewToken = pair.component1();
            C4805LK.this.mo19549i(vehicleWithNewToken.getBird());
            if (this.f21250h != null) {
                C4805LK.this.f21108e.mo55956N(new BluetoothAutoReconnected(DateTime.now().getMillis() - this.f21250h.getMillis()));
            }
            InterfaceC48847sm6 interfaceC48847sm6 = C4805LK.this.f21106c;
            Intrinsics.checkNotNullExpressionValue(vehicleWithNewToken, "vehicleWithNewToken");
            Observable<Unit> take = interfaceC48847sm6.mo13686l(vehicleWithNewToken).take(1L);
            final C4867a c4867a = C4867a.f21252g;
            Observable<R> map = take.map(new InterfaceC23492o() { // from class: MK
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    DateTime m97103d;
                    m97103d = C4805LK.C4866o.m97103d(Function1.this, obj);
                    return m97103d;
                }
            });
            final C4868b c4868b = new C4868b(C4805LK.this, vehicleWithNewToken, this.f21251i);
            Observable flatMap = map.flatMap(new InterfaceC23492o() { // from class: NK
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m97102e;
                    m97102e = C4805LK.C4866o.m97102e(Function1.this, obj);
                    return m97102e;
                }
            });
            C24558d c24558d = C4805LK.this.f21116m;
            final C4869c c4869c = new C4869c(vehicleWithNewToken);
            flatMap.takeUntil(Observable.merge(c24558d.filter(new InterfaceC23494q() { // from class: OK
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m97101f;
                    m97101f = C4805LK.C4866o.m97101f(Function1.this, obj);
                    return m97101f;
                }
            }), C4805LK.this.f21106c.mo13687k(vehicleWithNewToken))).subscribe();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "isBluetoothOff", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$o0 */
    /* loaded from: classes4.dex */
    public static final class C4870o0 extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21258h;

        /* renamed from: i */
        public final /* synthetic */ boolean f21259i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4870o0(WireBird wireBird, boolean z) {
            super(1);
            this.f21258h = wireBird;
            this.f21259i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Vehicle> invoke(Boolean isBluetoothOff) {
            Intrinsics.checkNotNullParameter(isBluetoothOff, "isBluetoothOff");
            if (isBluetoothOff.booleanValue()) {
                Observable error = Observable.error(new BluetoothException(null, BluetoothException.Reason.DISABLED, 1, null));
                Intrinsics.checkNotNullExpressionValue(error, "{\n          Observable.e…ason.DISABLED))\n        }");
                return error;
            }
            C4805LK.this.m97285L2(this.f21258h);
            Vehicle vehicle = (Vehicle) C4805LK.f21103p.get(C49697uC6.m10640b(this.f21258h));
            if (vehicle == null) {
                return C4805LK.this.mo19547k(this.f21258h, this.f21259i);
            }
            Observable just = Observable.just(vehicle);
            Intrinsics.checkNotNullExpressionValue(just, "{\n            Observable.just(vehicle)\n          }");
            return just;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/Vehicle;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$p */
    /* loaded from: classes4.dex */
    public static final class C4871p extends Lambda implements Function1<Pair<? extends Vehicle, ? extends Vehicle>, Vehicle> {

        /* renamed from: g */
        public static final C4871p f21260g = new C4871p();

        public C4871p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Vehicle invoke(Pair<Vehicle, Vehicle> pair) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Vehicle newTokenVehicle = pair.component1();
            Intrinsics.checkNotNullExpressionValue(newTokenVehicle, "newTokenVehicle");
            copy = newTokenVehicle.copy((r35 & 1) != 0 ? newTokenVehicle.device : null, (r35 & 2) != 0 ? newTokenVehicle.bird : null, (r35 & 4) != 0 ? newTokenVehicle.battery : 0, (r35 & 8) != 0 ? newTokenVehicle.distance : 0, (r35 & 16) != 0 ? newTokenVehicle.locked : false, (r35 & 32) != 0 ? newTokenVehicle.energyMode : null, (r35 & 64) != 0 ? newTokenVehicle.authenticated : true, (r35 & 128) != 0 ? newTokenVehicle.connected : false, (r35 & 256) != 0 ? newTokenVehicle.rxDevice : null, (r35 & 512) != 0 ? newTokenVehicle.rssi : null, (r35 & 1024) != 0 ? newTokenVehicle.beaconHash : null, (r35 & 2048) != 0 ? newTokenVehicle.proximityUUID : null, (r35 & 4096) != 0 ? newTokenVehicle.imei : null, (r35 & 8192) != 0 ? newTokenVehicle.serialNumber : null, (r35 & 16384) != 0 ? newTokenVehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? newTokenVehicle.fault : null, (r35 & 65536) != 0 ? newTokenVehicle.vehicleVersion : null);
            return copy;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$p0 */
    /* loaded from: classes4.dex */
    public static final class C4872p0 extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21262h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4872p0(WireBird wireBird) {
            super(1);
            this.f21262h = wireBird;
        }

        /* renamed from: a */
        public final void m97097a(InterfaceC23465c interfaceC23465c) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21262h.getSerialNumber();
            c4805lk.m97293J2("soft reset: " + serialNumber);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97097a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$q */
    /* loaded from: classes4.dex */
    public static final class C4873q extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C4873q() {
            super(1);
        }

        /* renamed from: a */
        public final void m97096a(InterfaceC23465c interfaceC23465c) {
            C4805LK.this.m97293J2("ble-connecting...");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97096a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$q0 */
    /* loaded from: classes4.dex */
    public static final class C4874q0 extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f21265h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4874q0(WireBird wireBird) {
            super(1);
            this.f21265h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Vehicle copy;
            Intrinsics.checkNotNullParameter(it, "it");
            C4805LK c4805lk = C4805LK.this;
            copy = it.copy((r35 & 1) != 0 ? it.device : null, (r35 & 2) != 0 ? it.bird : this.f21265h, (r35 & 4) != 0 ? it.battery : 0, (r35 & 8) != 0 ? it.distance : 0, (r35 & 16) != 0 ? it.locked : false, (r35 & 32) != 0 ? it.energyMode : null, (r35 & 64) != 0 ? it.authenticated : false, (r35 & 128) != 0 ? it.connected : false, (r35 & 256) != 0 ? it.rxDevice : null, (r35 & 512) != 0 ? it.rssi : null, (r35 & 1024) != 0 ? it.beaconHash : null, (r35 & 2048) != 0 ? it.proximityUUID : null, (r35 & 4096) != 0 ? it.imei : null, (r35 & 8192) != 0 ? it.serialNumber : null, (r35 & 16384) != 0 ? it.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? it.fault : null, (r35 & 65536) != 0 ? it.vehicleVersion : null);
            return InterfaceC27246pJ.C27247a.connect$default(c4805lk, copy, false, false, false, false, 30, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$r */
    /* loaded from: classes4.dex */
    public static final class C4875r extends Lambda implements Function1<Vehicle, Unit> {
        public C4875r() {
            super(1);
        }

        /* renamed from: a */
        public final void m97094a(Vehicle it) {
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c4805lk.m97289K2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97094a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$r0 */
    /* loaded from: classes4.dex */
    public static final class C4876r0 extends Lambda implements Function1<Vehicle, Unit> {
        public C4876r0() {
            super(1);
        }

        /* renamed from: a */
        public final void m97093a(Vehicle it) {
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c4805lk.m97289K2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97093a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$s */
    /* loaded from: classes4.dex */
    public static final class C4877s extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {
        public C4877s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13679s(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$s0 */
    /* loaded from: classes4.dex */
    public static final class C4878s0 extends Lambda implements Function1<Vehicle, InterfaceC23447K<? extends Vehicle>> {
        public C4878s0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C4805LK.this.f21106c.mo13692f(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$t */
    /* loaded from: classes4.dex */
    public static final class C4879t extends Lambda implements Function1<Vehicle, Unit> {
        public C4879t() {
            super(1);
        }

        /* renamed from: a */
        public final void m97090a(Vehicle it) {
            C4805LK c4805lk = C4805LK.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c4805lk.m97289K2(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97090a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: LK$t0 */
    /* loaded from: classes4.dex */
    public static final class C4880t0 extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21271g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21272h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f21273i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4880t0(boolean z, C4805LK c4805lk, WireBird wireBird) {
            super(1);
            this.f21271g = z;
            this.f21272h = c4805lk;
            this.f21273i = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f21271g) {
                this.f21272h.m97330A1(this.f21273i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$u */
    /* loaded from: classes4.dex */
    public static final class C4881u extends Lambda implements Function1<Vehicle, Unit> {
        public C4881u() {
            super(1);
        }

        /* renamed from: a */
        public final void m97089a(Vehicle vehicle) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = vehicle.getBird().getSerialNumber();
            c4805lk.m97293J2("ble-connected to vehicle: " + serialNumber);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97089a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$v */
    /* loaded from: classes4.dex */
    public static final class C4882v extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21276h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4882v(Vehicle vehicle) {
            super(1);
            this.f21276h = vehicle;
        }

        /* renamed from: a */
        public final void m97088a(InterfaceC23465c interfaceC23465c) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21276h.getBird().getSerialNumber();
            c4805lk.m97293J2("ble-locking: " + serialNumber);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97088a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$w */
    /* loaded from: classes4.dex */
    public static final class C4883w extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21278h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4883w(Vehicle vehicle) {
            super(1);
            this.f21278h = vehicle;
        }

        /* renamed from: a */
        public final void m97087a(InterfaceC23465c interfaceC23465c) {
            C4805LK c4805lk = C4805LK.this;
            String serialNumber = this.f21278h.getBird().getSerialNumber();
            c4805lk.m97293J2("ble-unlocking: " + serialNumber);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m97087a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$x */
    /* loaded from: classes4.dex */
    public static final class C4884x extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21279g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4884x(boolean z) {
            super(1);
            this.f21279g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Vehicle> invoke(Vehicle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f21279g == it.getLocked()) {
                return Observable.just(it);
            }
            boolean z = this.f21279g;
            return Observable.error(new RuntimeException("Lock " + z + " did not update!"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$y */
    /* loaded from: classes4.dex */
    public static final class C4885y extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Vehicle f21281h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4885y(Vehicle vehicle) {
            super(1);
            this.f21281h = vehicle;
        }

        /* renamed from: a */
        public final void m97085a(Vehicle vehicle) {
            if (WireBirdKt.isBdCompatible(vehicle.getBird())) {
                C4805LK.this.m97289K2(this.f21281h);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97085a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: LK$z */
    /* loaded from: classes4.dex */
    public static final class C4886z extends Lambda implements Function1<Vehicle, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f21282g;

        /* renamed from: h */
        public final /* synthetic */ C4805LK f21283h;

        /* renamed from: i */
        public final /* synthetic */ Vehicle f21284i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4886z(boolean z, C4805LK c4805lk, Vehicle vehicle) {
            super(1);
            this.f21282g = z;
            this.f21283h = c4805lk;
            this.f21284i = vehicle;
        }

        /* renamed from: a */
        public final void m97084a(Vehicle vehicle) {
            if (this.f21282g) {
                C4805LK c4805lk = this.f21283h;
                String serialNumber = this.f21284i.getBird().getSerialNumber();
                c4805lk.m97293J2("ble-locked vehicle: " + serialNumber);
                return;
            }
            C4805LK c4805lk2 = this.f21283h;
            String serialNumber2 = this.f21284i.getBird().getSerialNumber();
            c4805lk2.m97293J2("ble-unlocked vehicle: " + serialNumber2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m97084a(vehicle);
            return Unit.INSTANCE;
        }
    }

    public C4805LK(Context context, InterfaceC25136kJ birdBluetoothApiManager, InterfaceC48847sm6 vehicleManager, InterfaceC10732aY scheduler, InterfaceC1880Ea analyticsManager, InterfaceC34076Kn6 vehicleTrackerManager, C36207Tq4 reactiveConfig) {
        BluetoothAdapter bluetoothAdapter;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(birdBluetoothApiManager, "birdBluetoothApiManager");
        Intrinsics.checkNotNullParameter(vehicleManager, "vehicleManager");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(vehicleTrackerManager, "vehicleTrackerManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f21104a = context;
        this.f21105b = birdBluetoothApiManager;
        this.f21106c = vehicleManager;
        this.f21107d = scheduler;
        this.f21108e = analyticsManager;
        this.f21109f = vehicleTrackerManager;
        this.f21110g = reactiveConfig;
        this.f21111h = 2L;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.f21112i = bluetoothManager;
        if (bluetoothManager != null) {
            bluetoothAdapter = bluetoothManager.getAdapter();
        } else {
            bluetoothAdapter = null;
        }
        this.f21113j = bluetoothAdapter;
        AbstractC26703a m22396b = AbstractC26703a.m22396b();
        Intrinsics.checkNotNullExpressionValue(m22396b, "getScanner()");
        this.f21114k = m22396b;
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f21116m = m31902e;
    }

    /* renamed from: A2 */
    public static final void m97329A2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B1 */
    public static final void m97326B1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B2 */
    public static final InterfaceC23434B m97325B2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C1 */
    public static final void m97322C1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C2 */
    public static final void m97321C2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D1 */
    public static final void m97318D1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D2 */
    public static final InterfaceC23447K m97317D2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E1 */
    public static final InterfaceC23434B m97314E1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: E2 */
    public static final void m97313E2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F1 */
    public static final InterfaceC23447K m97310F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G1 */
    public static final InterfaceC23447K m97306G1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J1 */
    public static final void m97294J1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K1 */
    public static final InterfaceC23434B m97290K1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: L1 */
    public static final InterfaceC23434B m97286L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: M1 */
    public static final void m97282M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final InterfaceC23434B m97280N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final InterfaceC23447K m97279N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O0 */
    public static final InterfaceC23447K m97277O0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O1 */
    public static final void m97276O1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m97274P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final void m97271Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final InterfaceC23434B m97265S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final void m97262T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final void m97261T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final InterfaceC23434B m97259U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: U1 */
    public static final InterfaceC23434B m97258U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final void m97256V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V1 */
    public static final InterfaceC23434B m97255V1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final void m97252W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X0 */
    public static final void m97250X0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X1 */
    public static final InterfaceC23447K m97249X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y0 */
    public static final InterfaceC23434B m97247Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final void m97246Y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final InterfaceC23434B m97244Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m97241a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a2 */
    public static final void m97240a2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ Observable authenticate$bluetooth_release$default(C4805LK c4805lk, Vehicle vehicle, boolean z, DateTime dateTime, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            dateTime = null;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return c4805lk.m97268R0(vehicle, z, dateTime2, z4, z3);
    }

    public static /* synthetic */ Observable autoReconnectAndReAuth$bluetooth_release$default(C4805LK c4805lk, Vehicle vehicle, boolean z, DateTime dateTime, int i, Object obj) {
        if ((i & 4) != 0) {
            dateTime = null;
        }
        return c4805lk.m97253W0(vehicle, z, dateTime);
    }

    /* renamed from: b2 */
    public static final InterfaceC23434B m97237b2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    public static /* synthetic */ Observable bleAuthenticate$bluetooth_release$default(C4805LK c4805lk, Vehicle vehicle, String str, boolean z, DateTime dateTime, int i, Object obj) {
        if ((i & 8) != 0) {
            dateTime = null;
        }
        return c4805lk.m97238b1(vehicle, str, z, dateTime);
    }

    public static /* synthetic */ Observable bluetoothTimeout$bluetooth_release$default(C4805LK c4805lk, Observable observable, long j, BluetoothException.Reason reason, WireBird wireBird, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c4805lk.m97190r1(observable, j, reason, wireBird, z);
    }

    /* renamed from: c1 */
    public static final InterfaceC23434B m97235c1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: c2 */
    public static final InterfaceC23434B m97234c2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: d1 */
    public static final void m97232d1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d2 */
    public static final void m97231d2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e1 */
    public static final Vehicle m97229e1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Vehicle) tmp0.invoke(obj);
    }

    /* renamed from: e2 */
    public static final InterfaceC23434B m97228e2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: f2 */
    public static final void m97225f2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ Observable flash$bluetooth_release$default(C4805LK c4805lk, WireBird wireBird, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c4805lk.m97298I1(wireBird, i, z);
    }

    /* renamed from: g1 */
    public static final void m97223g1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g2 */
    public static final void m97222g2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h1 */
    public static final void m97220h1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i1 */
    public static final InterfaceC23447K m97217i1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i2 */
    public static final void m97216i2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j1 */
    public static final void m97214j1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j2 */
    public static final void m97213j2(boolean z, C38431bE5 c38431bE5, C4464KY c4464ky, C4805LK this$0, Integer num) {
        C4464KY m98792a;
        C38431bE5 m64783a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            if (c38431bE5 != null) {
                InterfaceC1880Ea interfaceC1880Ea = this$0.f21108e;
                m64783a = c38431bE5.m64783a((r24 & 1) != 0 ? c38431bE5.f57120a : null, (r24 & 2) != 0 ? c38431bE5.f57121b : null, (r24 & 4) != 0 ? c38431bE5.f57122c : null, (r24 & 8) != 0 ? c38431bE5.f57123d : null, (r24 & 16) != 0 ? c38431bE5.f57124e : null, (r24 & 32) != 0 ? c38431bE5.f57125f : null, (r24 & 64) != 0 ? c38431bE5.f57126g : null, (r24 & 128) != 0 ? c38431bE5.f57127h : null, (r24 & 256) != 0 ? c38431bE5.f57128i : null, (r24 & 512) != 0 ? c38431bE5.f57129j : null, (r24 & 1024) != 0 ? c38431bE5.f57130k : num);
                interfaceC1880Ea.mo55905y(C39024cE5.toSleepEndedEvent$default(m64783a, true, null, 2, null));
            }
        } else if (c4464ky != null) {
            InterfaceC1880Ea interfaceC1880Ea2 = this$0.f21108e;
            m98792a = c4464ky.m98792a((r24 & 1) != 0 ? c4464ky.f19728a : null, (r24 & 2) != 0 ? c4464ky.f19729b : null, (r24 & 4) != 0 ? c4464ky.f19730c : null, (r24 & 8) != 0 ? c4464ky.f19731d : null, (r24 & 16) != 0 ? c4464ky.f19732e : null, (r24 & 32) != 0 ? c4464ky.f19733f : null, (r24 & 64) != 0 ? c4464ky.f19734g : null, (r24 & 128) != 0 ? c4464ky.f19735h : null, (r24 & 256) != 0 ? c4464ky.f19736i : null, (r24 & 512) != 0 ? c4464ky.f19737j : num, (r24 & 1024) != 0 ? c4464ky.f19738k : null);
            interfaceC1880Ea2.mo55905y(C5024LY.toBluetoothWakeEndedEvent$default(m98792a, true, null, 2, null));
        }
    }

    /* renamed from: k1 */
    public static final void m97211k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k2 */
    public static final void m97210k2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l2 */
    public static final void m97207l2(C4805LK this$0, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m97204m2(z, c4464ky, c38431bE5, num, "abandoned");
    }

    public static /* synthetic */ Observable lights$bluetooth_release$default(C4805LK c4805lk, WireBird wireBird, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c4805lk.m97264S1(wireBird, z, z2);
    }

    /* renamed from: m1 */
    public static final void m97205m1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n1 */
    public static final void m97202n1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o1 */
    public static final InterfaceC23434B m97199o1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: o2 */
    public static /* synthetic */ Observable m97198o2(C4805LK c4805lk, WireBird wireBird, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c4805lk.m97201n2(wireBird, z);
    }

    /* renamed from: p1 */
    public static final void m97196p1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p2 */
    public static final void m97195p2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m97193q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q2 */
    public static final InterfaceC23434B m97192q2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: r2 */
    public static final void m97189r2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final Unit m97186s1(C4805LK this$0, Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicle, "$vehicle");
        String serialNumber = vehicle.getBird().getSerialNumber();
        this$0.m97293J2("connect: vehicle=" + serialNumber);
        if (!this$0.m97267R1()) {
            return Unit.INSTANCE;
        }
        this$0.m97293J2("connect: bluetooth off");
        throw new BluetoothException(null, BluetoothException.Reason.DISABLED, 1, null);
    }

    /* renamed from: s2 */
    public static final InterfaceC23447K m97185s2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    public static /* synthetic */ Observable scanOrGet$bluetooth_release$default(C4805LK c4805lk, WireBird wireBird, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c4805lk.m97173v2(wireBird, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startScanBle$bluetooth_release$default(C4805LK c4805lk, AbstractC43480jj5 abstractC43480jj5, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = CollectionsKt__CollectionsJVMKt.listOf(GattUuid.BIRD_SERVICE.getUuid());
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        c4805lk.m97309F2(abstractC43480jj5, list, i);
    }

    /* renamed from: t1 */
    public static final InterfaceC23434B m97182t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: t2 */
    public static final void m97181t2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final InterfaceC23434B m97178u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: u2 */
    public static final <T> void m97177u2(InterfaceC24578y<T> interfaceC24578y, C4805LK c4805lk, WireBird wireBird, boolean z, BluetoothException.Reason reason) {
        if (!WireBirdKt.canTreatAsBluetooth(wireBird, C36441Uq4.m80769c(c4805lk.f21110g, wireBird)) && !z) {
            interfaceC24578y.onComplete();
        } else {
            interfaceC24578y.onError(new BluetoothException(null, reason, 1, null));
        }
    }

    /* renamed from: v1 */
    public static final void m97174v1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w1 */
    public static final void m97170w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w2 */
    public static final Boolean m97169w2(C4805LK this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Boolean.valueOf(this$0.m97267R1());
    }

    /* renamed from: x1 */
    public static final void m97166x1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x2 */
    public static final InterfaceC23434B m97165x2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: y1 */
    public static final Boolean m97162y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: z2 */
    public static /* synthetic */ Observable m97157z2(C4805LK c4805lk, WireBird wireBird, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c4805lk.m97161y2(wireBird, z);
    }

    /* renamed from: A1 */
    public final void m97330A1(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Vehicle vehicle = f21103p.get(C49697uC6.m10640b(bird));
        if (vehicle != null) {
            m97158z1(vehicle);
        }
    }

    /* renamed from: F2 */
    public final void m97309F2(AbstractC43480jj5 callback, List<UUID> list, int i) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(callback, "callback");
        m97293J2("startScanBle via BleCompat");
        ScanSettings m22412a = new ScanSettings.C26702b().m22409d(false).m22403j(i).m22412a();
        Intrinsics.checkNotNullExpressionValue(m22412a, "Builder()\n      .setLega…(scanMode)\n      .build()");
        if (list != null) {
            List<UUID> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            for (UUID uuid : list2) {
                arrayList.add(new ScanFilter.C26699b().m22436h(new ParcelUuid(uuid)).m22443a());
            }
        } else {
            arrayList = null;
        }
        this.f21115l = true;
        this.f21114k.m22395c(arrayList, m22412a, callback);
    }

    /* renamed from: G2 */
    public final void m97305G2(Vehicle vehicle, boolean z) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        this.f21109f.mo96349e(vehicle.getBird(), vehicle.getDevice(), z);
    }

    /* renamed from: H1 */
    public final boolean m97302H1() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        int hour = ReleaseLocationDetailsKt.hour(calendar);
        Pair<Integer, Integer> lightOffWindow = this.f21110g.m82623f8().getValue().lightOffWindow();
        if (hour >= lightOffWindow.getFirst().intValue() && hour < lightOffWindow.getSecond().intValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: H2 */
    public final void m97301H2(AbstractC43480jj5 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        m97293J2("stopScanBle via BleCompat");
        boolean z = false;
        this.f21115l = false;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 12) {
            z = true;
        }
        if (z) {
            this.f21114k.m22394e(callback);
        }
    }

    /* renamed from: I1 */
    public final Observable<Vehicle> m97298I1(WireBird bird, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable scanOrGet$bluetooth_release$default = scanOrGet$bluetooth_release$default(this, bird, false, 2, null);
        final C4819M c4819m = new C4819M(bird, i);
        Observable doOnSubscribe = scanOrGet$bluetooth_release$default.doOnSubscribe(new InterfaceC23484g() { // from class: RJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97294J1(Function1.this, obj);
            }
        });
        final C4820N c4820n = new C4820N(bird);
        Observable flatMap = doOnSubscribe.flatMap(new InterfaceC23492o() { // from class: SJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97290K1;
                m97290K1 = C4805LK.m97290K1(Function1.this, obj);
                return m97290K1;
            }
        });
        final C4821O c4821o = new C4821O();
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: TJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97286L1;
                m97286L1 = C4805LK.m97286L1(Function1.this, obj);
                return m97286L1;
            }
        });
        final C4822P c4822p = new C4822P(this);
        Observable doOnNext = flatMap2.doOnNext(new InterfaceC23484g() { // from class: UJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97282M1(Function1.this, obj);
            }
        });
        final C4823Q c4823q = new C4823Q(i);
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: VJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97279N1;
                m97279N1 = C4805LK.m97279N1(Function1.this, obj);
                return m97279N1;
            }
        });
        final C4824R c4824r = new C4824R(z, this, bird);
        Observable<Vehicle> doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: WJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97276O1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "internal fun flash(bird:…rd)\n        }\n      }\n  }");
        return doOnError;
    }

    /* renamed from: I2 */
    public final void m97297I2(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        this.f21109f.mo96352b(vehicle.getBird());
    }

    /* renamed from: J2 */
    public final void m97293J2(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        String name = Thread.currentThread().getName();
        C41318g46.m40151m("Thread: " + name + ": " + msg, new Object[0]);
    }

    /* renamed from: K2 */
    public final void m97289K2(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        f21103p.put(VehicleKt.toVehicleDescriptor(vehicle), vehicle);
    }

    /* renamed from: L2 */
    public final void m97285L2(WireBird wireBird) {
        Vehicle copy;
        boolean locked = wireBird.getLocked();
        C41318g46.m40151m("updating bird lock state to " + locked, new Object[0]);
        ConcurrentHashMap<VehicleDescriptor, Vehicle> concurrentHashMap = f21103p;
        Vehicle vehicle = concurrentHashMap.get(C49697uC6.m10640b(wireBird));
        if (vehicle != null) {
            VehicleDescriptor m10640b = C49697uC6.m10640b(wireBird);
            copy = vehicle.copy((r35 & 1) != 0 ? vehicle.device : null, (r35 & 2) != 0 ? vehicle.bird : wireBird, (r35 & 4) != 0 ? vehicle.battery : 0, (r35 & 8) != 0 ? vehicle.distance : 0, (r35 & 16) != 0 ? vehicle.locked : wireBird.getLocked(), (r35 & 32) != 0 ? vehicle.energyMode : null, (r35 & 64) != 0 ? vehicle.authenticated : false, (r35 & 128) != 0 ? vehicle.connected : false, (r35 & 256) != 0 ? vehicle.rxDevice : null, (r35 & 512) != 0 ? vehicle.rssi : null, (r35 & 1024) != 0 ? vehicle.beaconHash : null, (r35 & 2048) != 0 ? vehicle.proximityUUID : null, (r35 & 4096) != 0 ? vehicle.imei : null, (r35 & 8192) != 0 ? vehicle.serialNumber : null, (r35 & 16384) != 0 ? vehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? vehicle.fault : null, (r35 & 65536) != 0 ? vehicle.vehicleVersion : null);
            concurrentHashMap.put(m10640b, copy);
        }
    }

    /* renamed from: P1 */
    public final InterfaceC10636aM m97273P1() {
        InterfaceC10636aM interfaceC10636aM = this.f21117n;
        if (interfaceC10636aM != null) {
            return interfaceC10636aM;
        }
        Intrinsics.throwUninitializedPropertyAccessException("birdManager");
        return null;
    }

    /* renamed from: Q1 */
    public List<UUID> m97270Q1(WireBird wireBird) {
        return InterfaceC27246pJ.C27247a.m19539a(this, wireBird);
    }

    /* renamed from: R0 */
    public final Observable<Vehicle> m97268R0(Vehicle vehicle, boolean z, DateTime dateTime, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Vehicle> m33123k0 = this.f21106c.mo13696b(vehicle).m33123k0();
        final C4843f c4843f = new C4843f();
        Observable<R> flatMap = m33123k0.flatMap(new InterfaceC23492o() { // from class: NJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97265S0;
                m97265S0 = C4805LK.m97265S0(Function1.this, obj);
                return m97265S0;
            }
        });
        final C4845g c4845g = new C4845g();
        Observable subscribeOn = flatMap.doOnNext(new InterfaceC23484g() { // from class: OJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97262T0(Function1.this, obj);
            }
        }).subscribeOn(this.f21107d.mo44187a());
        final C4847h c4847h = new C4847h(z, dateTime);
        Observable flatMap2 = subscribeOn.flatMap(new InterfaceC23492o() { // from class: PJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97259U0;
                m97259U0 = C4805LK.m97259U0(Function1.this, obj);
                return m97259U0;
            }
        });
        final C4849i c4849i = new C4849i(vehicle, this, z2, z);
        Observable doOnNext = flatMap2.doOnNext(new InterfaceC23484g() { // from class: QJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97256V0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "internal fun authenticat…tAsBluetoothOverride)\n  }");
        return m97190r1(doOnNext, 10L, BluetoothException.Reason.TIMEOUT, vehicle.getBird(), z3);
    }

    /* renamed from: R1 */
    public final boolean m97267R1() {
        BluetoothAdapter bluetoothAdapter = this.f21113j;
        return (bluetoothAdapter == null || bluetoothAdapter.isEnabled()) ? false : true;
    }

    /* renamed from: S1 */
    public final Observable<Vehicle> m97264S1(WireBird bird, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable scanOrGet$bluetooth_release$default = scanOrGet$bluetooth_release$default(this, bird, false, 2, null);
        final C4825S c4825s = new C4825S(bird, z);
        Observable doOnSubscribe = scanOrGet$bluetooth_release$default.doOnSubscribe(new InterfaceC23484g() { // from class: GJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97261T1(Function1.this, obj);
            }
        });
        final C4826T c4826t = new C4826T(bird);
        Observable flatMap = doOnSubscribe.flatMap(new InterfaceC23492o() { // from class: HJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97258U1;
                m97258U1 = C4805LK.m97258U1(Function1.this, obj);
                return m97258U1;
            }
        });
        final C4827U c4827u = new C4827U();
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: IJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97255V1;
                m97255V1 = C4805LK.m97255V1(Function1.this, obj);
                return m97255V1;
            }
        });
        final C4828V c4828v = new C4828V();
        Observable doOnNext = flatMap2.doOnNext(new InterfaceC23484g() { // from class: JJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97252W1(Function1.this, obj);
            }
        });
        final C4829W c4829w = new C4829W(z);
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: KJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97249X1;
                m97249X1 = C4805LK.m97249X1(Function1.this, obj);
                return m97249X1;
            }
        });
        final C4830X c4830x = new C4830X(z2, this, bird);
        Observable<Vehicle> doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: LJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97246Y1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "internal fun lights(bird…rd)\n        }\n      }\n  }");
        return doOnError;
    }

    /* renamed from: W0 */
    public final Observable<Vehicle> m97253W0(Vehicle vehicle, boolean z, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable scan$default = InterfaceC27246pJ.C27247a.scan$default(this, vehicle.getBird(), false, 2, null);
        final C4851j c4851j = C4851j.f21217g;
        Observable doOnSubscribe = scan$default.doOnSubscribe(new InterfaceC23484g() { // from class: uJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97250X0(Function1.this, obj);
            }
        });
        final C4853k c4853k = new C4853k();
        Observable flatMap = doOnSubscribe.flatMap(new InterfaceC23492o() { // from class: vJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97247Y0;
                m97247Y0 = C4805LK.m97247Y0(Function1.this, obj);
                return m97247Y0;
            }
        });
        final C4855l c4855l = new C4855l(z, dateTime);
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: wJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97244Z0;
                m97244Z0 = C4805LK.m97244Z0(Function1.this, obj);
                return m97244Z0;
            }
        });
        final C4857m c4857m = new C4857m();
        Observable doOnNext = flatMap2.doOnNext(new InterfaceC23484g() { // from class: xJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97241a1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "internal fun autoReconne…ONNECT_DELAY_SECONDS)\n  }");
        return C37279Yf5.m74557f0(doOnNext, 5);
    }

    /* renamed from: Z1 */
    public final Observable<Vehicle> m97243Z1(WireBird bird, boolean z, boolean z2, boolean z3, boolean z4, Function0<Boolean> completedExternally) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(completedExternally, "completedExternally");
        Observable scanOrGet$bluetooth_release$default = scanOrGet$bluetooth_release$default(this, bird, false, 2, null);
        final C4831Y c4831y = new C4831Y(bird, z);
        Observable doOnSubscribe = scanOrGet$bluetooth_release$default.doOnSubscribe(new InterfaceC23484g() { // from class: yJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97240a2(Function1.this, obj);
            }
        });
        final C4832Z c4832z = new C4832Z(bird);
        Observable flatMap = doOnSubscribe.flatMap(new InterfaceC23492o() { // from class: zJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97237b2;
                m97237b2 = C4805LK.m97237b2(Function1.this, obj);
                return m97237b2;
            }
        });
        final C4834a0 c4834a0 = new C4834a0(z2, z4);
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: AJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97234c2;
                m97234c2 = C4805LK.m97234c2(Function1.this, obj);
                return m97234c2;
            }
        });
        final C4836b0 c4836b0 = new C4836b0();
        Observable doOnNext = flatMap2.doOnNext(new InterfaceC23484g() { // from class: CJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97231d2(Function1.this, obj);
            }
        });
        final C4838c0 c4838c0 = new C4838c0(z, this, completedExternally);
        Observable flatMap3 = doOnNext.flatMap(new InterfaceC23492o() { // from class: DJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97228e2;
                m97228e2 = C4805LK.m97228e2(Function1.this, obj);
                return m97228e2;
            }
        });
        final C4840d0 c4840d0 = new C4840d0(z4, this, bird);
        Observable doOnNext2 = flatMap3.doOnNext(new InterfaceC23484g() { // from class: EJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97225f2(Function1.this, obj);
            }
        });
        final C4842e0 c4842e0 = new C4842e0(z3, this, bird);
        Observable<Vehicle> doOnError = doOnNext2.doOnError(new InterfaceC23484g() { // from class: FJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97222g2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "internal fun lock(\n    b…rd)\n        }\n      }\n  }");
        return doOnError;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: a */
    public Observable<Boolean> mo19557a(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Boolean> mo13697a = this.f21106c.mo13697a(vehicle);
        final C4810D c4810d = new C4810D(vehicle);
        Observable<Boolean> m33123k0 = mo13697a.m33102v(new InterfaceC23484g() { // from class: kK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97170w1(Function1.this, obj);
            }
        }).m33123k0();
        final C4811E c4811e = new C4811E(vehicle);
        Observable<Boolean> observeOn = m33123k0.doOnNext(new InterfaceC23484g() { // from class: lK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97166x1(Function1.this, obj);
            }
        }).subscribeOn(this.f21107d.mo44187a()).observeOn(C23454a.m33087a());
        final C4812F c4812f = new C4812F(vehicle);
        Observable<Boolean> onErrorReturn = observeOn.onErrorReturn(new InterfaceC23492o() { // from class: mK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m97162y1;
                m97162y1 = C4805LK.m97162y1(Function1.this, obj);
                return m97162y1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "override fun disconnect(…\n        true\n      }\n  }");
        return onErrorReturn;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: b */
    public void mo19556b(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f21109f.mo96352b(bird);
    }

    /* renamed from: b1 */
    public final Observable<Vehicle> m97238b1(Vehicle vehicle, String token, boolean z, DateTime dateTime) {
        WireBird copy;
        Vehicle copy2;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Intrinsics.checkNotNullParameter(token, "token");
        copy = r3.copy((r91 & 1) != 0 ? r3.f66717id : null, (r91 & 2) != 0 ? r3.model : null, (r91 & 4) != 0 ? r3.taskId : null, (r91 & 8) != 0 ? r3.batteryLevel : 0, (r91 & 16) != 0 ? r3.estimatedRange : null, (r91 & 32) != 0 ? r3.distance : 0, (r91 & 64) != 0 ? r3.location : null, (r91 & 128) != 0 ? r3.code : null, (r91 & 256) != 0 ? r3.stickerId : null, (r91 & 512) != 0 ? r3.serialNumber : null, (r91 & 1024) != 0 ? r3.disconnected : false, (r91 & 2048) != 0 ? r3.collect : false, (r91 & 4096) != 0 ? r3.submerged : false, (r91 & 8192) != 0 ? r3.lost : false, (r91 & 16384) != 0 ? r3.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.ackLocked : false, (r91 & 65536) != 0 ? r3.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.broken : false, (r91 & 524288) != 0 ? r3.label : null, (r91 & 1048576) != 0 ? r3.actions : null, (r91 & 2097152) != 0 ? r3.bountyId : null, (r91 & 4194304) != 0 ? r3.bountyPrice : null, (r91 & 8388608) != 0 ? r3.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.bountyLost : false, (r91 & 33554432) != 0 ? r3.bountyOverdue : false, (r91 & 67108864) != 0 ? r3.bountyKind : null, (r91 & 134217728) != 0 ? r3.brandName : null, (r91 & 268435456) != 0 ? r3.taskKind : null, (r91 & 536870912) != 0 ? r3.gpsAt : null, (r91 & 1073741824) != 0 ? r3.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r3.token : token, (r92 & 1) != 0 ? r3.bluetooth : false, (r92 & 2) != 0 ? r3.cellular : false, (r92 & 4) != 0 ? r3.startedAt : null, (r92 & 8) != 0 ? r3.dueAt : null, (r92 & 16) != 0 ? r3.asleep : false, (r92 & 32) != 0 ? r3.imei : null, (r92 & 64) != 0 ? r3.boardProtocol : null, (r92 & 128) != 0 ? r3.physicalLock : null, (r92 & 256) != 0 ? r3.priorityCollect : false, (r92 & 512) != 0 ? r3.down : false, (r92 & 1024) != 0 ? r3.needsInspection : false, (r92 & 2048) != 0 ? r3.partnerId : null, (r92 & 4096) != 0 ? r3.nestId : null, (r92 & 8192) != 0 ? r3.lastRideEndedAt : null, (r92 & 16384) != 0 ? r3.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.peril : false, (r92 & 65536) != 0 ? r3.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.offline : false, (r92 & 524288) != 0 ? r3.license : null, (r92 & 1048576) != 0 ? r3.areaKey : null, (r92 & 2097152) != 0 ? r3.fleetId : null, (r92 & 4194304) != 0 ? r3.nestPurpose : null, (r92 & 8388608) != 0 ? r3.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.scannedAt : null, (r92 & 33554432) != 0 ? r3.badgeType : null, (r92 & 67108864) != 0 ? r3.bountyReasons : null, (r92 & 134217728) != 0 ? r3.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r3.ephemeralId : null, (r92 & 536870912) != 0 ? r3.hasHelmet : false, (r92 & 1073741824) != 0 ? r3.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r3.bleMacAddress : null, (r93 & 1) != 0 ? r3.cellId : null, (r93 & 2) != 0 ? vehicle.getBird().externalFeedType : null);
        copy2 = vehicle.copy((r35 & 1) != 0 ? vehicle.device : null, (r35 & 2) != 0 ? vehicle.bird : copy, (r35 & 4) != 0 ? vehicle.battery : 0, (r35 & 8) != 0 ? vehicle.distance : 0, (r35 & 16) != 0 ? vehicle.locked : false, (r35 & 32) != 0 ? vehicle.energyMode : null, (r35 & 64) != 0 ? vehicle.authenticated : false, (r35 & 128) != 0 ? vehicle.connected : false, (r35 & 256) != 0 ? vehicle.rxDevice : null, (r35 & 512) != 0 ? vehicle.rssi : null, (r35 & 1024) != 0 ? vehicle.beaconHash : null, (r35 & 2048) != 0 ? vehicle.proximityUUID : null, (r35 & 4096) != 0 ? vehicle.imei : null, (r35 & 8192) != 0 ? vehicle.serialNumber : null, (r35 & 16384) != 0 ? vehicle.iccid : null, (r35 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? vehicle.fault : null, (r35 & 65536) != 0 ? vehicle.vehicleVersion : null);
        Observable just = Observable.just(copy2);
        final C4861n c4861n = new C4861n();
        Observable flatMap = just.flatMap(new InterfaceC23492o() { // from class: JK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97235c1;
                m97235c1 = C4805LK.m97235c1(Function1.this, obj);
                return m97235c1;
            }
        });
        final C4866o c4866o = new C4866o(dateTime, z);
        Observable doOnNext = flatMap.doOnNext(new InterfaceC23484g() { // from class: KK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97232d1(Function1.this, obj);
            }
        });
        final C4871p c4871p = C4871p.f21260g;
        Observable<Vehicle> map = doOnNext.map(new InterfaceC23492o() { // from class: rJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Vehicle m97229e1;
                m97229e1 = C4805LK.m97229e1(Function1.this, obj);
                return m97229e1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "internal fun bleAuthenti…thenticated = true) }\n  }");
        return map;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: c */
    public Observable<Vehicle> mo19555c(WireBird bird, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return bluetoothTimeout$bluetooth_release$default(this, m97264S1(bird, z, z2), 10L, BluetoothException.Reason.TIMEOUT, bird, false, 8, null);
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: d */
    public Observable<Vehicle> mo19554d(WireBird bird, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Observable scanOrGet$bluetooth_release$default = scanOrGet$bluetooth_release$default(this, bird, false, 2, null);
        final C4815I c4815i = new C4815I(objectRef);
        Observable doOnNext = scanOrGet$bluetooth_release$default.doOnNext(new InterfaceC23484g() { // from class: YJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97318D1(Function1.this, obj);
            }
        });
        final C4816J c4816j = new C4816J(bird, z2);
        Observable flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: ZJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97314E1;
                m97314E1 = C4805LK.m97314E1(Function1.this, obj);
                return m97314E1;
            }
        });
        final C4817K c4817k = new C4817K(z);
        Observable flatMapSingle = flatMap.flatMapSingle(new InterfaceC23492o() { // from class: aK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97310F1;
                m97310F1 = C4805LK.m97310F1(Function1.this, obj);
                return m97310F1;
            }
        });
        final C4818L c4818l = new C4818L(z3, z, this, bird);
        Observable<Vehicle> flatMapSingle2 = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: bK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97306G1;
                m97306G1 = C4805LK.m97306G1(Function1.this, obj);
                return m97306G1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun enableDeepS…   observable\n      }\n  }");
        Observable<Vehicle> m97219h2 = m97219h2(flatMapSingle2, z, c4464ky, c38431bE5, (Integer) objectRef.element);
        if (z2) {
            return bluetoothTimeout$bluetooth_release$default(this, m97219h2, 10L, BluetoothException.Reason.TIMEOUT, bird, false, 8, null);
        }
        return m97219h2;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: e */
    public Observable<Vehicle> mo19553e(WireBird bird, boolean z, boolean z2, boolean z3, Function0<Boolean> lockedExternally) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(lockedExternally, "lockedExternally");
        return bluetoothTimeout$bluetooth_release$default(this, m97243Z1(bird, true, z, z2, z3, lockedExternally), 20L, BluetoothException.Reason.TIMEOUT, bird, false, 8, null);
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: f */
    public Observable<Vehicle> mo19552f(WireBird bird, int i, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return m97298I1(bird, i, z);
    }

    /* renamed from: f1 */
    public final Observable<Vehicle> m97226f1(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        AbstractC23442F<Vehicle> mo13689i = this.f21106c.mo13689i(vehicle);
        final C4873q c4873q = new C4873q();
        AbstractC23442F<Vehicle> m33142Y = mo13689i.m33102v(new InterfaceC23484g() { // from class: xK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97223g1(Function1.this, obj);
            }
        }).m33146T(this.f21111h).m33142Y(this.f21107d.mo44187a());
        final C4875r c4875r = new C4875r();
        AbstractC23442F<Vehicle> m33112q = m33142Y.m33112q(new InterfaceC23484g() { // from class: yK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97220h1(Function1.this, obj);
            }
        });
        final C4877s c4877s = new C4877s();
        AbstractC23442F<R> m33165A = m33112q.m33165A(new InterfaceC23492o() { // from class: zK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97217i1;
                m97217i1 = C4805LK.m97217i1(Function1.this, obj);
                return m97217i1;
            }
        });
        final C4879t c4879t = new C4879t();
        AbstractC23442F m33112q2 = m33165A.m33112q(new InterfaceC23484g() { // from class: AK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97214j1(Function1.this, obj);
            }
        });
        final C4881u c4881u = new C4881u();
        Observable<Vehicle> m33123k0 = m33112q2.m33101w(new InterfaceC23484g() { // from class: BK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97211k1(Function1.this, obj);
            }
        }).m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "internal fun bleConnect(…      .toObservable()\n  }");
        return m33123k0;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: g */
    public void mo19551g(WireBird bird, boolean z) {
        BluetoothDevice bluetoothDevice;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Vehicle vehicle = f21103p.get(C49697uC6.m10640b(bird));
        if (vehicle != null) {
            bluetoothDevice = vehicle.getDevice();
        } else {
            bluetoothDevice = null;
        }
        C41318g46.m40163a("device in startTrackingBird = " + bluetoothDevice, new Object[0]);
        this.f21109f.mo96349e(bird, bluetoothDevice, z);
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: h */
    public Observable<Vehicle> mo19550h(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return bluetoothTimeout$bluetooth_release$default(this, m97198o2(this, bird, false, 2, null), 30L, BluetoothException.Reason.TIMEOUT, bird, false, 8, null);
    }

    /* renamed from: h2 */
    public final Observable<Vehicle> m97219h2(Observable<Vehicle> observable, final boolean z, final C4464KY c4464ky, final C38431bE5 c38431bE5, final Integer num) {
        final C4844f0 c4844f0 = new C4844f0(c4464ky, c38431bE5, z, this);
        Observable<Vehicle> doOnComplete = observable.doOnSubscribe(new InterfaceC23484g() { // from class: nK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97216i2(Function1.this, obj);
            }
        }).doOnComplete(new InterfaceC23478a() { // from class: oK
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C4805LK.m97213j2(z, c38431bE5, c4464ky, this, num);
            }
        });
        final C4846g0 c4846g0 = new C4846g0(z, c4464ky, c38431bE5, num);
        Observable<Vehicle> doOnDispose = doOnComplete.doOnError(new InterfaceC23484g() { // from class: pK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97210k2(Function1.this, obj);
            }
        }).doOnDispose(new InterfaceC23478a() { // from class: qK
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C4805LK.m97207l2(C4805LK.this, z, c4464ky, c38431bE5, num);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnDispose, "private fun Observable<V…CEPTION_TYPE)\n      }\n  }");
        return doOnDispose;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: i */
    public void mo19549i(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f21116m.onNext(bird);
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: j */
    public Observable<List<Vehicle>> mo19548j(int i) {
        Observable<List<Vehicle>> observeOn = C45832nh5.m23307i(new C4862n0(i)).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun scanBatch(t…edulers.mainThread())\n  }");
        return observeOn;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: k */
    public Observable<Vehicle> mo19547k(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return m97190r1(C45832nh5.m23307i(new C4858m0(bird, z)), 10L, BluetoothException.Reason.SCAN, bird, z);
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: l */
    public Observable<Vehicle> mo19546l(WireBird bird, boolean z, boolean z2, boolean z3, Function0<Boolean> unlockedExternally) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(unlockedExternally, "unlockedExternally");
        return bluetoothTimeout$bluetooth_release$default(this, m97243Z1(bird, false, z, z2, z3, unlockedExternally), 20L, BluetoothException.Reason.TIMEOUT, bird, false, 8, null);
    }

    /* renamed from: l1 */
    public final Observable<Vehicle> m97208l1(Vehicle vehicle, boolean z) {
        AbstractC23442F<Vehicle> m33102v;
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        if (z) {
            AbstractC23442F<Vehicle> mo13683o = this.f21106c.mo13683o(vehicle);
            final C4882v c4882v = new C4882v(vehicle);
            m33102v = mo13683o.m33102v(new InterfaceC23484g() { // from class: rK
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C4805LK.m97205m1(Function1.this, obj);
                }
            });
        } else {
            AbstractC23442F<Vehicle> mo13695c = this.f21106c.mo13695c(vehicle, m97302H1());
            final C4883w c4883w = new C4883w(vehicle);
            m33102v = mo13695c.m33102v(new InterfaceC23484g() { // from class: sK
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C4805LK.m97202n1(Function1.this, obj);
                }
            });
        }
        Observable<Vehicle> m33123k0 = m33102v.m33123k0();
        final C4884x c4884x = new C4884x(z);
        Observable<R> flatMap = m33123k0.flatMap(new InterfaceC23492o() { // from class: uK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97199o1;
                m97199o1 = C4805LK.m97199o1(Function1.this, obj);
                return m97199o1;
            }
        });
        final C4885y c4885y = new C4885y(vehicle);
        Observable retry = flatMap.doOnNext(new InterfaceC23484g() { // from class: vK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97196p1(Function1.this, obj);
            }
        }).retry(1L);
        final C4886z c4886z = new C4886z(z, this, vehicle);
        Observable<Vehicle> doAfterNext = retry.doAfterNext(new InterfaceC23484g() { // from class: wK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97193q1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "internal fun bleLock(veh…}\")\n        }\n      }\n  }");
        return doAfterNext;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: m */
    public Observable<Vehicle> mo19545m(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return bluetoothTimeout$bluetooth_release$default(this, m97157z2(this, bird, false, 2, null), 10L, BluetoothException.Reason.TIMEOUT, bird, false, 8, null);
    }

    /* renamed from: m2 */
    public final void m97204m2(boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, Integer num, String str) {
        C4464KY m98792a;
        C38431bE5 m64783a;
        if (z) {
            if (c38431bE5 != null) {
                InterfaceC1880Ea interfaceC1880Ea = this.f21108e;
                m64783a = c38431bE5.m64783a((r24 & 1) != 0 ? c38431bE5.f57120a : null, (r24 & 2) != 0 ? c38431bE5.f57121b : null, (r24 & 4) != 0 ? c38431bE5.f57122c : null, (r24 & 8) != 0 ? c38431bE5.f57123d : null, (r24 & 16) != 0 ? c38431bE5.f57124e : null, (r24 & 32) != 0 ? c38431bE5.f57125f : null, (r24 & 64) != 0 ? c38431bE5.f57126g : null, (r24 & 128) != 0 ? c38431bE5.f57127h : null, (r24 & 256) != 0 ? c38431bE5.f57128i : null, (r24 & 512) != 0 ? c38431bE5.f57129j : null, (r24 & 1024) != 0 ? c38431bE5.f57130k : num);
                interfaceC1880Ea.mo55905y(C39024cE5.m61649a(m64783a, false, str));
            }
        } else if (c4464ky != null) {
            InterfaceC1880Ea interfaceC1880Ea2 = this.f21108e;
            m98792a = c4464ky.m98792a((r24 & 1) != 0 ? c4464ky.f19728a : null, (r24 & 2) != 0 ? c4464ky.f19729b : null, (r24 & 4) != 0 ? c4464ky.f19730c : null, (r24 & 8) != 0 ? c4464ky.f19731d : null, (r24 & 16) != 0 ? c4464ky.f19732e : null, (r24 & 32) != 0 ? c4464ky.f19733f : null, (r24 & 64) != 0 ? c4464ky.f19734g : null, (r24 & 128) != 0 ? c4464ky.f19735h : null, (r24 & 256) != 0 ? c4464ky.f19736i : null, (r24 & 512) != 0 ? c4464ky.f19737j : num, (r24 & 1024) != 0 ? c4464ky.f19738k : null);
            interfaceC1880Ea2.mo55905y(C5024LY.m96660a(m98792a, false, str));
        }
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: n */
    public Observable<Vehicle> mo19544n(WireBird bird, AlarmType type, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(type, "type");
        Observable scanOrGet$bluetooth_release$default = scanOrGet$bluetooth_release$default(this, bird, false, 2, null);
        final C4835b c4835b = new C4835b(bird);
        Observable flatMap = scanOrGet$bluetooth_release$default.flatMap(new InterfaceC23492o() { // from class: iK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97280N0;
                m97280N0 = C4805LK.m97280N0(Function1.this, obj);
                return m97280N0;
            }
        });
        final C4837c c4837c = new C4837c(type);
        Observable flatMapSingle = flatMap.flatMapSingle(new InterfaceC23492o() { // from class: tK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97277O0;
                m97277O0 = C4805LK.m97277O0(Function1.this, obj);
                return m97277O0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun alarm(bird:…rd)\n        }\n      }\n  }");
        Observable bluetoothTimeout$bluetooth_release$default = bluetoothTimeout$bluetooth_release$default(this, flatMapSingle, 10L, BluetoothException.Reason.TIMEOUT, bird, false, 8, null);
        final C4839d c4839d = new C4839d(z2, this, bird);
        Observable doOnNext = bluetoothTimeout$bluetooth_release$default.doOnNext(new InterfaceC23484g() { // from class: EK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97274P0(Function1.this, obj);
            }
        });
        final C4841e c4841e = new C4841e(z, this, bird);
        Observable<Vehicle> doOnError = doOnNext.doOnError(new InterfaceC23484g() { // from class: IK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97271Q0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun alarm(bird:…rd)\n        }\n      }\n  }");
        return doOnError;
    }

    /* renamed from: n2 */
    public final Observable<Vehicle> m97201n2(WireBird wireBird, boolean z) {
        Observable scanOrGet$bluetooth_release$default = scanOrGet$bluetooth_release$default(this, wireBird, false, 2, null);
        final C4848h0 c4848h0 = new C4848h0(wireBird);
        Observable doOnSubscribe = scanOrGet$bluetooth_release$default.doOnSubscribe(new InterfaceC23484g() { // from class: CK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97195p2(Function1.this, obj);
            }
        });
        final C4850i0 c4850i0 = new C4850i0(wireBird);
        Observable flatMap = doOnSubscribe.flatMap(new InterfaceC23492o() { // from class: DK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97192q2;
                m97192q2 = C4805LK.m97192q2(Function1.this, obj);
                return m97192q2;
            }
        });
        final C4852j0 c4852j0 = new C4852j0();
        Observable doOnNext = flatMap.doOnNext(new InterfaceC23484g() { // from class: FK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97189r2(Function1.this, obj);
            }
        });
        final C4854k0 c4854k0 = new C4854k0();
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: GK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97185s2;
                m97185s2 = C4805LK.m97185s2(Function1.this, obj);
                return m97185s2;
            }
        });
        final C4856l0 c4856l0 = new C4856l0(z, this, wireBird);
        Observable<Vehicle> doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: HK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97181t2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "private fun readVehicleN…rd)\n        }\n      }\n  }");
        return doOnError;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: o */
    public void mo19543o() {
        if (this.f21109f.mo96354T0() == 0) {
            release();
        }
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: p */
    public AbstractC23442F<String> mo19542p(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        InterfaceC25136kJ interfaceC25136kJ = this.f21105b;
        int distance = bird.getDistance();
        return interfaceC25136kJ.mo21381q0(bird.getSerialNumber(), Integer.valueOf(distance), bird.getImei(), bird.getBleMacAddress());
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: q */
    public AbstractC23442F<Boolean> mo19541q() {
        BluetoothAdapter bluetoothAdapter = this.f21113j;
        boolean z = false;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            z = true;
        }
        AbstractC23442F<Boolean> m33158H = AbstractC23442F.m33158H(Boolean.valueOf(z));
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(adapter?.isEnabled == true)");
        return m33158H;
    }

    @Override // p000.InterfaceC27246pJ
    /* renamed from: r */
    public Observable<Vehicle> mo19540r(final Vehicle vehicle, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: qJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m97186s1;
                m97186s1 = C4805LK.m97186s1(C4805LK.this, vehicle);
                return m97186s1;
            }
        });
        final C4806A c4806a = new C4806A(vehicle);
        Observable flatMap = fromCallable.flatMap(new InterfaceC23492o() { // from class: BJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97182t1;
                m97182t1 = C4805LK.m97182t1(Function1.this, obj);
                return m97182t1;
            }
        });
        final C4807B c4807b = new C4807B(vehicle, z2);
        Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: MJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97178u1;
                m97178u1 = C4805LK.m97178u1(Function1.this, obj);
                return m97178u1;
            }
        });
        final C4809C c4809c = new C4809C(z, this, vehicle);
        Observable<Vehicle> observable = flatMap2.doOnError(new InterfaceC23484g() { // from class: XJ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97174v1(Function1.this, obj);
            }
        });
        if (z3) {
            Intrinsics.checkNotNullExpressionValue(observable, "observable");
            return m97190r1(observable, 10L, BluetoothException.Reason.CONNECTION, vehicle.getBird(), z4);
        }
        Intrinsics.checkNotNullExpressionValue(observable, "{\n      observable\n    }");
        return observable;
    }

    /* renamed from: r1 */
    public final <T> Observable<T> m97190r1(Observable<T> observable, long j, BluetoothException.Reason reason, WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (!WireBirdKt.canTreatAsBluetooth(bird, C36441Uq4.m80769c(this.f21110g, bird)) && !z) {
            C41318g46.m40162b(new NoSuchElementException("bluetoothTimeout returning empty observable since can't treat as bluetooth and predicate failed"));
            Observable<T> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "{\n      Timber.d(NoSuchE… Observable.empty()\n    }");
            return empty;
        }
        Observable<T> observeOn = observable.take(1L).timeout(j, TimeUnit.SECONDS, this.f21107d.mo44187a()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "take(1)\n        .timeout…dSchedulers.mainThread())");
        return BluetoothExceptionKt.onBluetoothErrorResume(observeOn, reason);
    }

    @Override // p000.InterfaceC27246pJ
    public void release() {
        this.f21109f.mo96353a();
        this.f21106c.release();
    }

    /* renamed from: v2 */
    public final Observable<Vehicle> m97173v2(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: sJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean m97169w2;
                m97169w2 = C4805LK.m97169w2(C4805LK.this);
                return m97169w2;
            }
        });
        final C4870o0 c4870o0 = new C4870o0(bird, z);
        Observable<Vehicle> flatMap = fromCallable.flatMap(new InterfaceC23492o() { // from class: tJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97165x2;
                m97165x2 = C4805LK.m97165x2(Function1.this, obj);
                return m97165x2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "internal fun scanOrGet(b…  }\n        }\n      }\n  }");
        return flatMap;
    }

    /* renamed from: y2 */
    public final Observable<Vehicle> m97161y2(WireBird wireBird, boolean z) {
        Observable scanOrGet$bluetooth_release$default = scanOrGet$bluetooth_release$default(this, wireBird, false, 2, null);
        final C4872p0 c4872p0 = new C4872p0(wireBird);
        Observable doOnSubscribe = scanOrGet$bluetooth_release$default.doOnSubscribe(new InterfaceC23484g() { // from class: eK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97329A2(Function1.this, obj);
            }
        });
        final C4874q0 c4874q0 = new C4874q0(wireBird);
        Observable flatMap = doOnSubscribe.flatMap(new InterfaceC23492o() { // from class: fK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m97325B2;
                m97325B2 = C4805LK.m97325B2(Function1.this, obj);
                return m97325B2;
            }
        });
        final C4876r0 c4876r0 = new C4876r0();
        Observable doOnNext = flatMap.doOnNext(new InterfaceC23484g() { // from class: gK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97321C2(Function1.this, obj);
            }
        });
        final C4878s0 c4878s0 = new C4878s0();
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: hK
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m97317D2;
                m97317D2 = C4805LK.m97317D2(Function1.this, obj);
                return m97317D2;
            }
        });
        final C4880t0 c4880t0 = new C4880t0(z, this, wireBird);
        Observable<Vehicle> doOnError = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: jK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97313E2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "private fun softResetBir…rd)\n        }\n      }\n  }");
        return doOnError;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: z1 */
    public final void m97158z1(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        Observable<Boolean> mo19557a = mo19557a(vehicle);
        final C4813G c4813g = new C4813G();
        InterfaceC23484g<? super Boolean> interfaceC23484g = new InterfaceC23484g() { // from class: cK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97326B1(Function1.this, obj);
            }
        };
        final C4814H c4814h = C4814H.f21133g;
        mo19557a.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: dK
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C4805LK.m97322C1(Function1.this, obj);
            }
        });
    }
}
