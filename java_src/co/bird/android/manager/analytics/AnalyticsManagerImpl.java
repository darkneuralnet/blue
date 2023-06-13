package co.bird.android.manager.analytics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.util.LruCache;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.analytics.AnalyticsManagerImpl;
import co.bird.android.manager.analytics.persistence.AnalyticsDatabase;
import co.bird.android.manager.analytics.workers.AnalyticsSubmitWorker;
import co.bird.android.model.LegacyAnalyticsEventData;
import co.bird.android.model.PartnerUser;
import co.bird.android.model.PermissionStatusKt;
import co.bird.android.model.User;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.analytics.AnalyticsDebugEvent;
import co.bird.android.model.analytics.AnalyticsEvent;
import co.bird.android.model.analytics.AppName;
import co.bird.android.model.analytics.AppStart;
import co.bird.android.model.analytics.BluetoothState;
import co.bird.android.model.analytics.BrazeableEvent;
import co.bird.android.model.analytics.ColdAppStart;
import co.bird.android.model.analytics.LegacyAnalyticsEvent;
import co.bird.android.model.analytics.NetworkSubType;
import co.bird.android.model.analytics.NetworkType;
import co.bird.android.model.analytics.PersistentPropertyEntry;
import co.bird.android.model.analytics.RecurrentNthEvent;
import co.bird.android.model.analytics.RxBleState_Kt;
import co.bird.android.model.analytics.TraceKey;
import co.bird.android.model.analytics.UserPropertyProvider;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.identification.IdentificationStatus;
import co.bird.android.model.persistence.AnalyticsEntity;
import co.bird.android.model.wire.WireHabitatStatus;
import co.bird.android.model.wire.WireHabitatStatusContext;
import co.bird.android.model.wire.WireHabitatStatusDerivedContext;
import co.bird.android.model.wire.configs.LocalConfig;
import co.bird.api.request.CreateAnalyticsEventsBody;
import co.bird.api.request.LegacyCreateAnalyticsEventsBody;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p000.AbstractC39873de5;
import p000.C32849Fh3;
import p000.C37791a94;
import p000.C44821lz0;
import p000.InterfaceC1880Ea;
import p000.InterfaceC38798br4;
import p000.InterfaceC49820uQ3;
@Metadata(m28433d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ×\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002[_Bï\u0001\b\u0007\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010a\u001a\u00020^\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010h\u001a\u00020e\u0012\u0006\u0010k\u001a\u00020i\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p\u0012\b\b\u0001\u0010w\u001a\u00020t\u0012\u0006\u0010{\u001a\u00020x\u0012\u0006\u0010\u007f\u001a\u00020|\u0012\b\u0010\u0083\u0001\u001a\u00030\u0080\u0001\u0012\u0007\u0010\u0086\u0001\u001a\u00020+\u0012\b\u0010\u008a\u0001\u001a\u00030\u0087\u0001\u0012\b\u0010\u008e\u0001\u001a\u00030\u008b\u0001\u0012\b\u0010\u0092\u0001\u001a\u00030\u008f\u0001\u0012\b\u0010\u0096\u0001\u001a\u00030\u0093\u0001\u0012\b\u0010\u009a\u0001\u001a\u00030\u0097\u0001\u0012\b\u0010\u009e\u0001\u001a\u00030\u009b\u0001\u0012\b\u0010¢\u0001\u001a\u00030\u009f\u0001\u0012\b\u0010¦\u0001\u001a\u00030£\u0001\u0012\b\u0010©\u0001\u001a\u00030§\u0001\u0012\b\u0010¬\u0001\u001a\u00030ª\u0001\u0012\u000f\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010\u00ad\u0001\u0012\b\u0010³\u0001\u001a\u00030±\u0001¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0010H\u0002J\u001c\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016*\u00020\u0010H\u0002J\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\f\u0010\u001c\u001a\u00020\u0012*\u00020\u0014H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\u001e\u0010\u001f\u001a\u00020\u00062\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020 2\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0003J\b\u0010'\u001a\u00020\u0006H\u0003J(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016*\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002J(\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016*\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0002J\f\u0010*\u001a\u00020\u0014*\u00020\u0012H\u0002J\u000e\u0010,\u001a\u0004\u0018\u00010\u0014*\u00020+H\u0003J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002J\b\u0010.\u001a\u00020\u0012H\u0002J\u0011\u0010/\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u00020\u0012H\u0003¢\u0006\u0004\b2\u00103J\u0011\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b7\u00108J0\u0010>\u001a\u00020\u00062\u0006\u0010:\u001a\u0002092\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J8\u0010A\u001a\u00020\u00062\u0006\u0010:\u001a\u0002092\u0006\u0010?\u001a\u00020\u00142\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\b\u0010@\u001a\u0004\u0018\u00010<H\u0016J.\u0010C\u001a\u00020\u00122\u0006\u0010:\u001a\u0002092\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\u0006\u0010B\u001a\u00020!H\u0016J\u0010\u0010D\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010E\u001a\u00020\u00122\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010F\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J!\u0010H\u001a\u00020\u0006\"\b\b\u0000\u0010G*\u00020\u00102\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\bH\u0010IJ\b\u0010J\u001a\u00020\u000bH\u0016J\u0010\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020KH\u0016J\u0018\u0010Q\u001a\u00020\u00062\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020\u0012H\u0016J\u000f\u0010R\u001a\u00020\u0006H\u0000¢\u0006\u0004\bR\u0010SJ\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u00020\u0019H\u0016J\b\u0010V\u001a\u00020\u0006H\u0016J\b\u0010W\u001a\u00020\u0006H\u0016J\b\u0010X\u001a\u00020\u0006H\u0007J\b\u0010Y\u001a\u00020\u0006H\u0007R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010©\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010¨\u0001R\u0017\u0010¬\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010«\u0001R\u001e\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010\u00ad\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010¯\u0001R\u0017\u0010³\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010²\u0001R\u0017\u0010¶\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010µ\u0001R&\u0010¼\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¹\u00010¸\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010À\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Â\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010Á\u0001R\u0017\u0010Ã\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010DR$\u0010Ç\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020<0Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R,\u0010Í\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u0014\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ê\u00010É\u00010È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R%\u0010Î\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010<0È\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010Ì\u0001R?\u0010Ô\u0001\u001a\"\u0012\u001d\u0012\u001b\u0012\u0005\u0012\u00030¹\u0001 Ð\u0001*\f\u0012\u0005\u0012\u00030¹\u0001\u0018\u00010¸\u00010¸\u00010Ï\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0005\bf\u0010Ó\u0001¨\u0006Ø\u0001"}, m28432d2 = {"Lco/bird/android/manager/analytics/AnalyticsManagerImpl;", "LEa;", "Lbr4;", "LFq2;", "Lco/bird/android/model/User;", "user", "", "w1", "z1", "Lco/bird/android/model/persistence/AnalyticsEntity;", "event", "Lio/reactivex/c;", "s0", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "legacyEvent", "Q1", "Lco/bird/android/model/analytics/AnalyticsEvent;", "U1", "", "i1", "", "v0", "", "", "g1", "", "h1", "V1", "x1", "W1", "properties", "P1", "Lco/bird/android/model/analytics/RecurrentNthEvent;", "", "count", "O1", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "E1", "B1", "q1", "r1", "L1", "Landroid/net/ConnectivityManager;", "k1", "o0", "y1", "v1", "()Ljava/lang/Integer;", "accessCoarseLocationPermissionGranted", "s1", "(Z)Ljava/lang/Integer;", "", "u1", "()Ljava/lang/Double;", "t1", "()Ljava/lang/Long;", "Lco/bird/android/model/analytics/TraceKey;", "key", "attributes", "Lorg/joda/time/DateTime;", "startTimeOverride", "z", "keySuffix", "stopTimeOverride", "w", "throttleMillis", "G", "J", "v", "N", "T", "y", "(Lco/bird/android/model/analytics/AnalyticsEvent;)V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/analytics/PersistentPropertyEntry;", "entry", "x", "Landroid/app/Application;", Stripe3ds2AuthParams.FIELD_APP, "isDebug", DateTokenConverter.CONVERTER_KEY, "M1", "()V", "D", "f", "P", "O", "onAppForeground", "onAppBackground", "LOh;", "b", "LOh;", "buildConfig", "LZ9;", "c", "LZ9;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lab;", "Lab;", "unauthenticatedClient", "Lgl;", "e", "Lgl;", "preference", "Ll20;", "Ll20;", "brazeManager", "Lde5;", "g", "Lde5;", "rxBleClient", "LBc;", "h", "LBc;", "deviceManager", "LLifecycleOwner;", "i", "LLifecycleOwner;", "processLifecycleOwner", "LTq4;", "j", "LTq4;", "reactiveConfig", "LuQ3;", "k", "LuQ3;", "permissionDelegate", "LGI3;", "l", "LGI3;", "partnerManager", "m", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lo21;", "n", "Lo21;", "deviceCheckManager", "Landroid/app/admin/DevicePolicyManager;", "o", "Landroid/app/admin/DevicePolicyManager;", "devicePolicyManager", "Landroid/net/wifi/WifiManager;", "p", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/telephony/TelephonyManager;", "q", "Landroid/telephony/TelephonyManager;", "telephonyManager", "Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;", "r", "Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;", "analyticsDatabase", "Li66;", "s", "Li66;", "traceProvider", "LRh6;", "t", "LRh6;", "userStream", "Llj1;", "u", "Llj1;", "facebookManager", "Lwm1;", "Lwm1;", "firebaseAnalyticsManager", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "firebaseCrashlytics", "Ldagger/Lazy;", "LZC6;", "Ldagger/Lazy;", "workManager", "Ldr4;", "Ldr4;", "locationManager", "Lio/reactivex/disposables/b;", "Lio/reactivex/disposables/b;", "trash", "La94;", "", "Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "A", "La94;", "trackedEventsRelay", "Lda;", "B", "Lda;", "analyticsDao", "Z", "applicationLaunched", "lastResumedTime", "Landroid/util/LruCache;", "E", "Landroid/util/LruCache;", "brazeThrottleCache", "", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lf66;", "F", "Ljava/util/Map;", "traceKeyStacks", "traceKeyThrottleTimes", "LZ84;", "kotlin.jvm.PlatformType", "H", "Lkotlin/Lazy;", "()LZ84;", "trackedEventsObservable", "<init>", "(LOh;LZ9;Lab;Lgl;Ll20;Lde5;LBc;LLifecycleOwner;LTq4;LuQ3;LGI3;Landroid/net/ConnectivityManager;Lo21;Landroid/app/admin/DevicePolicyManager;Landroid/net/wifi/WifiManager;Landroid/telephony/TelephonyManager;Lco/bird/android/manager/analytics/persistence/AnalyticsDatabase;Li66;LRh6;Llj1;Lwm1;Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ldagger/Lazy;Ldr4;)V", "I", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,879:1\n180#2:880\n180#2:881\n1#3:882\n215#4,2:883\n215#4,2:888\n215#4,2:890\n2624#5,3:885\n1238#5,4:894\n1238#5,4:900\n288#5,2:904\n442#6:892\n392#6:893\n442#6:898\n392#6:899\n*S KotlinDebug\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl\n*L\n220#1:880\n243#1:881\n637#1:883,2\n659#1:888,2\n671#1:890,2\n651#1:885,3\n728#1:894,4\n738#1:900,4\n815#1:904,2\n728#1:892\n728#1:893\n738#1:898\n738#1:899\n*E\n"})
/* loaded from: classes4.dex */
public final class AnalyticsManagerImpl implements InterfaceC1880Ea, InterfaceC38798br4, InterfaceC32929Fq2 {

    /* renamed from: I */
    public static final C16068c f66150I = new C16068c(null);

    /* renamed from: J */
    public static final List<String> f66151J;

    /* renamed from: K */
    public static final int f66152K;

    /* renamed from: P */
    public static final int f66153P;

    /* renamed from: Q */
    public static final Set<String> f66154Q;

    /* renamed from: R */
    public static final Set<String> f66155R;

    /* renamed from: A */
    public final C37791a94<List<AnalyticsDebugEvent>> f66156A;

    /* renamed from: B */
    public final AbstractC19796da f66157B;

    /* renamed from: C */
    public boolean f66158C;

    /* renamed from: D */
    public long f66159D;

    /* renamed from: E */
    public final LruCache<String, DateTime> f66160E;

    /* renamed from: F */
    public final Map<String, ConcurrentLinkedDeque<C40745f66>> f66161F;

    /* renamed from: G */
    public final Map<String, DateTime> f66162G;

    /* renamed from: H */
    public final Lazy f66163H;

    /* renamed from: b */
    public final InterfaceC6097Oh f66164b;

    /* renamed from: c */
    public final InterfaceC10121Z9 f66165c;

    /* renamed from: d */
    public final InterfaceC10736ab f66166d;

    /* renamed from: e */
    public final C22454gl f66167e;

    /* renamed from: f */
    public final InterfaceC44257l20 f66168f;

    /* renamed from: g */
    public final AbstractC39873de5 f66169g;

    /* renamed from: h */
    public final InterfaceC0650Bc f66170h;

    /* renamed from: i */
    public final LifecycleOwner f66171i;

    /* renamed from: j */
    public final C36207Tq4 f66172j;

    /* renamed from: k */
    public final InterfaceC49820uQ3 f66173k;

    /* renamed from: l */
    public final GI3 f66174l;

    /* renamed from: m */
    public final ConnectivityManager f66175m;

    /* renamed from: n */
    public final InterfaceC46037o21 f66176n;

    /* renamed from: o */
    public final DevicePolicyManager f66177o;

    /* renamed from: p */
    public final WifiManager f66178p;

    /* renamed from: q */
    public final TelephonyManager f66179q;

    /* renamed from: r */
    public final AnalyticsDatabase f66180r;

    /* renamed from: s */
    public final InterfaceC42524i66 f66181s;

    /* renamed from: t */
    public final InterfaceC35660Rh6 f66182t;

    /* renamed from: u */
    public final InterfaceC44662lj1 f66183u;

    /* renamed from: v */
    public final InterfaceC51213wm1 f66184v;

    /* renamed from: w */
    public final FirebaseCrashlytics f66185w;

    /* renamed from: x */
    public final dagger.Lazy<ZC6> f66186x;

    /* renamed from: y */
    public final InterfaceC40001dr4 f66187y;

    /* renamed from: z */
    public final C23464b f66188z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$a */
    /* loaded from: classes4.dex */
    public static final class C16066a extends Lambda implements Function1<User, Unit> {
        public C16066a() {
            super(1);
        }

        /* renamed from: a */
        public final void m55901a(User it) {
            AnalyticsManagerImpl analyticsManagerImpl = AnalyticsManagerImpl.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            analyticsManagerImpl.m55908w1(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m55901a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bH\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/manager/analytics/AnalyticsManagerImpl$b;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "onActivityPaused", "onActivityResumed", "onActivityDestroyed", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityStarted", "onActivityStopped", "outState", "onActivitySaveInstanceState", "LEa;", "b", "LEa;", "analyticsManager", "<init>", "(LEa;)V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl$AnalyticsLifecycleCallbacks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$b */
    /* loaded from: classes4.dex */
    public static final class C16067b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        public final InterfaceC1880Ea f66190b;

        public C16067b(InterfaceC1880Ea analyticsManager) {
            Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
            this.f66190b = analyticsManager;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f66190b.mo55954O();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f66190b.mo55952P();
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
            if (r0 == null) goto L13;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onActivityResumed(Activity activity) {
            String str;
            boolean contains;
            String m25587s;
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f66190b.mo55969D();
            String simpleName = Reflection.getOrCreateKotlinClass(activity.getClass()).getSimpleName();
            if (simpleName != null && (m25587s = C45097mS5.m25587s(simpleName)) != null) {
                str = "_to_" + m25587s;
            }
            str = "";
            InterfaceC1880Ea.C1881a.stopTrace$default(this.f66190b, new ColdAppStart(), str, null, null, 12, null);
            contains = CollectionsKt___CollectionsKt.contains(AnalyticsManagerImpl.f66151J, Reflection.getOrCreateKotlinClass(activity.getClass()).getSimpleName());
            if (contains) {
                InterfaceC1880Ea.C1881a.stopTrace$default(this.f66190b, new AppStart(), str, null, null, 12, null);
                this.f66190b.mo55961J(new AppStart());
                this.f66190b.mo55961J(new ColdAppStart());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003*\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/manager/analytics/AnalyticsManagerImpl$c;", "", "Lwp0;", "", "", C17296a.f69688o, "", "AUTO_FLUSH_DURATION", "I", "", "COLD_START_FINAL_ACTIVITY_LIST", "Ljava/util/List;", "FACEBOOK_EVENT_NAME_MAX_LENGTH", "", "FACEBOOK_EXCLUDED_KEY_SEGMENTS", "Ljava/util/Set;", "FIREBASE_EVENT_NAME_MAX_LENGTH", "FIREBASE_EXCLUDED_KEYS", "MAX_PENDING_EVENTS", "<init>", "()V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,879:1\n467#2,7:880\n*S KotlinDebug\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl$Companion\n*L\n210#1:880,7\n*E\n"})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$c */
    /* loaded from: classes4.dex */
    public static final class C16068c {
        public /* synthetic */ C16068c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Map<String, Object> m55900a(C51242wp0 c51242wp0) {
            Map<String, Object> m6301a = c51242wp0.m6301a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : m6301a.entrySet()) {
                if (!AnalyticsManagerImpl.f66154Q.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }

        private C16068c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "it", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$d */
    /* loaded from: classes4.dex */
    public static final class C16069d extends Lambda implements Function1<List<? extends AnalyticsDebugEvent>, List<? extends AnalyticsDebugEvent>> {

        /* renamed from: g */
        public final /* synthetic */ AnalyticsEvent f66191g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16069d(AnalyticsEvent analyticsEvent) {
            super(1);
            this.f66191g = analyticsEvent;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<AnalyticsDebugEvent> invoke(List<AnalyticsDebugEvent> it) {
            List<AnalyticsDebugEvent> plus;
            Intrinsics.checkNotNullParameter(it, "it");
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends AnalyticsDebugEvent>) ((Collection<? extends Object>) it), new AnalyticsDebugEvent(System.currentTimeMillis(), this.f66191g));
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "count", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$e */
    /* loaded from: classes4.dex */
    public static final class C16070e extends Lambda implements Function1<Integer, Unit> {
        public C16070e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer count) {
            DateTime m37634d1 = AnalyticsManagerImpl.this.f66167e.m37634d1();
            int seconds = m37634d1 != null ? Seconds.secondsBetween(DateTime.now(), m37634d1).getSeconds() : Integer.MAX_VALUE;
            Intrinsics.checkNotNullExpressionValue(count, "count");
            if (count.intValue() > 10 || seconds > 180) {
                ((ZC6) AnalyticsManagerImpl.this.f66186x.get()).m73615f("analytics_worker", EnumC41094fi1.KEEP, new C32849Fh3.C2399a(AnalyticsSubmitWorker.class).m109252h(new C44821lz0.C25841a().m26573b(S73.CONNECTED).m26574a()).m109257a());
                C22454gl c22454gl = AnalyticsManagerImpl.this.f66167e;
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now()");
                c22454gl.m37665W1(now);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16071f extends FunctionReferenceImpl implements Function1<AnalyticsEvent, Unit> {
        public C16071f(Object obj) {
            super(1, obj, AnalyticsManagerImpl.class, "trackEvent", "trackEvent(Lco/bird/android/model/analytics/AnalyticsEvent;)V", 0);
        }

        /* renamed from: a */
        public final void m55898a(AnalyticsEvent analyticsEvent) {
            ((AnalyticsManagerImpl) this.receiver).mo55905y(analyticsEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnalyticsEvent analyticsEvent) {
            m55898a(analyticsEvent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lde5$a;", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(Lde5$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$g */
    /* loaded from: classes4.dex */
    public static final class C16072g extends Lambda implements Function1<AbstractC39873de5.EnumC19828a, Unit> {
        public C16072g() {
            super(1);
        }

        /* renamed from: a */
        public final void m55897a(AbstractC39873de5.EnumC19828a state) {
            Intrinsics.checkNotNullParameter(state, "state");
            AnalyticsManagerImpl.this.mo55907x(new BluetoothState(RxBleState_Kt.toSimpleState(state)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC39873de5.EnumC19828a enumC19828a) {
            m55897a(enumC19828a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$h */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16073h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16073h f66194b = new C16073h();

        public C16073h() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LBy0;", "kotlin.jvm.PlatformType", "connectivity", "", C17296a.f69688o, "(LBy0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl$registerNetworkListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,879:1\n1855#2,2:880\n*S KotlinDebug\n*F\n+ 1 AnalyticsManagerImpl.kt\nco/bird/android/manager/analytics/AnalyticsManagerImpl$registerNetworkListener$1\n*L\n690#1:880,2\n*E\n"})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$i */
    /* loaded from: classes4.dex */
    public static final class C16074i extends Lambda implements Function1<C32063By0, Unit> {
        public C16074i() {
            super(1);
        }

        /* renamed from: a */
        public final void m55896a(C32063By0 c32063By0) {
            List<PersistentPropertyEntry> listOf;
            String m113241k = c32063By0.m113241k();
            Intrinsics.checkNotNullExpressionValue(m113241k, "connectivity.typeName()");
            String m113243i = c32063By0.m113243i();
            Intrinsics.checkNotNullExpressionValue(m113243i, "connectivity.subTypeName()");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PersistentPropertyEntry[]{new NetworkType(m113241k), new NetworkSubType(m113243i)});
            AnalyticsManagerImpl analyticsManagerImpl = AnalyticsManagerImpl.this;
            for (PersistentPropertyEntry persistentPropertyEntry : listOf) {
                analyticsManagerImpl.mo55907x(persistentPropertyEntry);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32063By0 c32063By0) {
            m55896a(c32063By0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$j */
    /* loaded from: classes4.dex */
    public static final class C16075j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16075j f66196g = new C16075j();

        public C16075j() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/AnalyticsEntity;", "events", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$k */
    /* loaded from: classes4.dex */
    public static final class C16076k extends Lambda implements Function1<List<? extends AnalyticsEntity>, InterfaceC23447K<? extends List<? extends AnalyticsEntity>>> {
        public C16076k() {
            super(1);
        }

        /* renamed from: c */
        public static final List m55893c(List events, Object it) {
            Intrinsics.checkNotNullParameter(events, "$events");
            Intrinsics.checkNotNullParameter(it, "it");
            return events;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<AnalyticsEntity>> invoke(final List<AnalyticsEntity> events) {
            AbstractC23442F<Object> m71180a;
            Intrinsics.checkNotNullParameter(events, "events");
            CreateAnalyticsEventsBody createAnalyticsEventsBody = new CreateAnalyticsEventsBody(events);
            if (AnalyticsManagerImpl.this.f66182t.mo76578g()) {
                m71180a = AnalyticsManagerImpl.this.f66165c.m73649b(createAnalyticsEventsBody);
            } else {
                m71180a = AnalyticsManagerImpl.this.f66166d.m71180a(createAnalyticsEventsBody);
            }
            return m71180a.m33157I(new InterfaceC23492o() { // from class: Ta
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m55893c;
                    m55893c = AnalyticsManagerImpl.C16076k.m55893c(events, obj);
                    return m55893c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/AnalyticsEntity;", "events", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$l */
    /* loaded from: classes4.dex */
    public static final class C16077l extends Lambda implements Function1<List<? extends AnalyticsEntity>, InterfaceC23447K<? extends Integer>> {
        public C16077l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Integer> invoke(List<AnalyticsEntity> events) {
            Intrinsics.checkNotNullParameter(events, "events");
            return AnalyticsManagerImpl.this.f66157B.mo42756a(events);
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "T", "Lco/bird/android/model/analytics/AnalyticsEvent;", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$m */
    /* loaded from: classes4.dex */
    public static final class C16078m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AnalyticsEvent f66199g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public C16078m(AnalyticsEvent analyticsEvent) {
            super(1);
            this.f66199g = analyticsEvent;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String name = this.f66199g.getName();
            C41318g46.m40158f(th, "Could not log analytic event: " + name, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$n */
    /* loaded from: classes4.dex */
    public static final class C16079n extends Lambda implements Function0<Z84<List<? extends AnalyticsDebugEvent>>> {
        public C16079n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends AnalyticsDebugEvent>> invoke2() {
            return Z84.f47888d.m73663b(AnalyticsManagerImpl.this.f66156A);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$o */
    /* loaded from: classes4.dex */
    public static final class C16080o extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public static final C16080o f66201g = new C16080o();

        public C16080o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            C41318g46.m40163a("track legacyEvent: " + z, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.analytics.AnalyticsManagerImpl$p */
    /* loaded from: classes4.dex */
    public static final class C16081p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C16081p f66202g = new C16081p();

        public C16081p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40162b(th);
        }
    }

    static {
        List<String> listOf;
        Set<String> of;
        Set<String> of2;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"RideActivity", "MagicLinkIntroActivity", "OperatorActivity", "ChargerActivity"});
        f66151J = listOf;
        f66152K = 40;
        f66153P = 40;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"platform", AnalyticsFields.APP_VERSION, AnalyticsFields.OS_VERSION, "mobile_network_generation", "battery_level", "heading", "accuracy", AnalyticsFields.APP_NAME, "user_interface_style", "is_managed_device", "memory_usage", "max_memory_available", "device_id_str", "device_model", "app_build", "app_language"});
        f66154Q = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new String[]{"latitude", "longitude", "email"});
        f66155R = of2;
    }

    public AnalyticsManagerImpl(InterfaceC6097Oh buildConfig, InterfaceC10121Z9 client, InterfaceC10736ab unauthenticatedClient, C22454gl preference, InterfaceC44257l20 brazeManager, AbstractC39873de5 rxBleClient, InterfaceC0650Bc deviceManager, LifecycleOwner processLifecycleOwner, C36207Tq4 reactiveConfig, InterfaceC49820uQ3 permissionDelegate, GI3 partnerManager, ConnectivityManager connectivityManager, InterfaceC46037o21 deviceCheckManager, DevicePolicyManager devicePolicyManager, WifiManager wifiManager, TelephonyManager telephonyManager, AnalyticsDatabase analyticsDatabase, InterfaceC42524i66 traceProvider, InterfaceC35660Rh6 userStream, InterfaceC44662lj1 facebookManager, InterfaceC51213wm1 firebaseAnalyticsManager, FirebaseCrashlytics firebaseCrashlytics, dagger.Lazy<ZC6> workManager, InterfaceC40001dr4 locationManager) {
        List emptyList;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(unauthenticatedClient, "unauthenticatedClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(permissionDelegate, "permissionDelegate");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(deviceCheckManager, "deviceCheckManager");
        Intrinsics.checkNotNullParameter(devicePolicyManager, "devicePolicyManager");
        Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
        Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        Intrinsics.checkNotNullParameter(analyticsDatabase, "analyticsDatabase");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(facebookManager, "facebookManager");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsManager, "firebaseAnalyticsManager");
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "firebaseCrashlytics");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f66164b = buildConfig;
        this.f66165c = client;
        this.f66166d = unauthenticatedClient;
        this.f66167e = preference;
        this.f66168f = brazeManager;
        this.f66169g = rxBleClient;
        this.f66170h = deviceManager;
        this.f66171i = processLifecycleOwner;
        this.f66172j = reactiveConfig;
        this.f66173k = permissionDelegate;
        this.f66174l = partnerManager;
        this.f66175m = connectivityManager;
        this.f66176n = deviceCheckManager;
        this.f66177o = devicePolicyManager;
        this.f66178p = wifiManager;
        this.f66179q = telephonyManager;
        this.f66180r = analyticsDatabase;
        this.f66181s = traceProvider;
        this.f66182t = userStream;
        this.f66183u = facebookManager;
        this.f66184v = firebaseAnalyticsManager;
        this.f66185w = firebaseCrashlytics;
        this.f66186x = workManager;
        this.f66187y = locationManager;
        this.f66188z = new C23464b();
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f66156A = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        this.f66157B = analyticsDatabase.mo55866C();
        this.f66159D = System.currentTimeMillis();
        this.f66160E = new LruCache<>(100);
        this.f66161F = new LinkedHashMap();
        this.f66162G = new LinkedHashMap();
        mo55907x(new AppName(buildConfig.mo89926f()));
        Observable<User> mo76582c = userStream.mo76582c();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76582c.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16066a c16066a = new C16066a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ka
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55922n0(Function1.this, obj);
            }
        });
        m55902z1();
        lazy = LazyKt__LazyJVMKt.lazy(new C16079n());
        this.f66163H = lazy;
    }

    /* renamed from: A1 */
    public static final void m55973A1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C1 */
    public static final void m55970C1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D1 */
    public static final void m55968D1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F1 */
    public static final void m55966F1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G1 */
    public static final void m55964G1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J1 */
    public static final InterfaceC23447K m55960J1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K1 */
    public static final InterfaceC23447K m55959K1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final void m55955N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R1 */
    public static final Boolean m55947R1(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }

    /* renamed from: S1 */
    public static final void m55946S1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final void m55944T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m55922n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC23447K m55916t0(AnalyticsManagerImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f66157B.mo42755b();
    }

    /* renamed from: u0 */
    public static final void m55914u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: B1 */
    public final void m55972B1() {
        Observable<AbstractC39873de5.EnumC19828a> observeOn = this.f66169g.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) this.f66169g.mo33641c()).distinctUntilChanged().subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        final C16072g c16072g = new C16072g();
        InterfaceC23484g<? super AbstractC39873de5.EnumC19828a> interfaceC23484g = new InterfaceC23484g() { // from class: Ia
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55970C1(Function1.this, obj);
            }
        };
        final C16073h c16073h = C16073h.f66194b;
        observeOn.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ja
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55968D1(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: C */
    public AbstractC23461c mo55971C() {
        AbstractC23442F<List<AnalyticsEntity>> mo42754c = this.f66157B.mo42754c();
        final C16076k c16076k = new C16076k();
        AbstractC23442F<R> m33165A = mo42754c.m33165A(new InterfaceC23492o() { // from class: Ga
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55959K1;
                m55959K1 = AnalyticsManagerImpl.m55959K1(Function1.this, obj);
                return m55959K1;
            }
        });
        final C16077l c16077l = new C16077l();
        AbstractC23461c m33159G = m33165A.m33165A(new InterfaceC23492o() { // from class: Ha
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55960J1;
                m55960J1 = AnalyticsManagerImpl.m55960J1(Function1.this, obj);
                return m55960J1;
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun submitStore…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: D */
    public void mo55969D() {
        this.f66159D = System.currentTimeMillis();
    }

    @SuppressLint({"CheckResult, MissingPermission"})
    /* renamed from: E1 */
    public final void m55967E1(Context context) {
        Observable<C32063By0> observeOn = C35514Qr4.m87860d(context).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        final C16074i c16074i = new C16074i();
        InterfaceC23484g<? super C32063By0> interfaceC23484g = new InterfaceC23484g() { // from class: Ra
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55966F1(Function1.this, obj);
            }
        };
        final C16075j c16075j = C16075j.f66196g;
        observeOn.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Sa
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55964G1(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: G */
    public boolean mo55965G(TraceKey key, Map<String, String> map, int i) {
        Boolean bool;
        DateTime plusMillis;
        DateTime plusMillis2;
        Intrinsics.checkNotNullParameter(key, "key");
        DateTime dateTime = this.f66162G.get(key.getName());
        if (dateTime != null && (plusMillis2 = dateTime.plusMillis(i)) != null) {
            bool = Boolean.valueOf(plusMillis2.isAfterNow());
        } else {
            bool = null;
        }
        boolean z = false;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return false;
        }
        ConcurrentLinkedDeque<C40745f66> concurrentLinkedDeque = this.f66161F.get(key.getName());
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.peekFirst();
        }
        if (this.f66161F.get(key.getName()) == null) {
            this.f66161F.put(key.getName(), new ConcurrentLinkedDeque<>());
        }
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        C40745f66 c40745f66 = new C40745f66(now, this.f66181s.mo34441a(key.getName()), map);
        ConcurrentLinkedDeque<C40745f66> concurrentLinkedDeque2 = this.f66161F.get(key.getName());
        if (concurrentLinkedDeque2 != null) {
            concurrentLinkedDeque2.push(c40745f66);
        }
        c40745f66.m42022c().start();
        C41318g46.m40163a("Trace started for " + key.getName(), new Object[0]);
        if (dateTime != null && (plusMillis = dateTime.plusMillis(i)) != null && !plusMillis.isBeforeNow()) {
            z = true;
        }
        if (!z) {
            this.f66162G.put(key.getName(), DateTime.now());
        }
        return true;
    }

    /* renamed from: H1 */
    public AbstractC23461c m55963H1(AbstractC23461c abstractC23461c) {
        return InterfaceC38798br4.C13315a.m62282m(this, abstractC23461c);
    }

    /* renamed from: I1 */
    public <T> Observable<T> m55962I1(Observable<T> observable) {
        return InterfaceC38798br4.C13315a.m62280o(this, observable);
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: J */
    public void mo55961J(TraceKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f66161F.put(key.getName(), new ConcurrentLinkedDeque<>());
    }

    /* renamed from: L1 */
    public final String m55958L1(boolean z) {
        return z ? "authorized" : "denied";
    }

    /* renamed from: M1 */
    public final void m55957M1() {
        int m37563v0 = this.f66167e.m37563v0();
        this.f66167e.m37674U0();
        if (m37563v0 == 0) {
            mo55905y(new C20099em(null, null, null, 7, null));
        }
        mo55905y(new C22720hm(null, null, null, null, null, 31, null));
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: N */
    public void mo55956N(LegacyAnalyticsEvent legacyEvent) {
        PersistentPropertyEntry userProperty;
        Intrinsics.checkNotNullParameter(legacyEvent, "legacyEvent");
        if (legacyEvent instanceof RecurrentNthEvent) {
            m55953O1((RecurrentNthEvent) legacyEvent, this.f66167e.m37678T0(legacyEvent.name()));
        }
        if ((legacyEvent instanceof UserPropertyProvider) && (userProperty = ((UserPropertyProvider) legacyEvent).getUserProperty()) != null) {
            mo55907x(userProperty);
        }
        m55921o0(legacyEvent);
        m55949Q1(legacyEvent);
        m55943U1(legacyEvent);
        m55941V1(legacyEvent);
        m55940W1(legacyEvent);
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: O */
    public void mo55954O() {
        this.f66188z.dispose();
        this.f66188z.m33026d();
    }

    /* renamed from: O1 */
    public final void m55953O1(RecurrentNthEvent recurrentNthEvent, int i) {
        LegacyAnalyticsEvent nthEvent = recurrentNthEvent.nthEvent(i);
        if (nthEvent != null) {
            mo55956N(nthEvent);
        }
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: P */
    public void mo55952P() {
    }

    /* renamed from: P1 */
    public final void m55951P1(Map<String, ? extends Object> map) {
        for (Map.Entry<String, Object> entry : m55919r1(map).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                this.f66184v.mo4720b(key, value.toString());
                this.f66185w.setCustomKey(key, value.toString());
            }
        }
    }

    /* renamed from: Q1 */
    public final void m55949Q1(LegacyAnalyticsEvent legacyAnalyticsEvent) {
        List listOf;
        InterfaceC10121Z9 interfaceC10121Z9 = this.f66165c;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new LegacyAnalyticsEventData(null, legacyAnalyticsEvent.name(), legacyAnalyticsEvent.getProperties(), null, 9, null));
        Object map = interfaceC10121Z9.m73650a(new LegacyCreateAnalyticsEventsBody(listOf)).map(new InterfaceC23492o() { // from class: La
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m55947R1;
                m55947R1 = AnalyticsManagerImpl.m55947R1(obj);
                return m55947R1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "client\n      .trackLegac…s))))\n      .map { true }");
        Observable m55962I1 = m55962I1(map);
        final C16080o c16080o = C16080o.f66201g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ma
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55946S1(Function1.this, obj);
            }
        };
        final C16081p c16081p = C16081p.f66202g;
        m55962I1.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Na
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55944T1(Function1.this, obj);
            }
        });
    }

    /* renamed from: U1 */
    public final void m55943U1(AnalyticsEvent analyticsEvent) {
        String m55911v0;
        if ((m55928h1(analyticsEvent) < 1 || m55927i1(analyticsEvent)) && (m55911v0 = m55911v0(analyticsEvent)) != null) {
            this.f66168f.mo26465b(m55911v0, m55930g1(analyticsEvent));
        }
    }

    /* renamed from: V1 */
    public final void m55941V1(AnalyticsEvent analyticsEvent) {
        String substringAfterLast$default;
        String takeLast;
        substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(analyticsEvent.getName(), (char) CoreConstants.DOT, (String) null, 2, (Object) null);
        takeLast = StringsKt___StringsKt.takeLast(substringAfterLast$default, f66152K);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : analyticsEvent.getProperties().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (m55906x1(key)) {
                bundle.putString(key, (value == null || (r2 = value.toString()) == null) ? "" : "");
            }
        }
        this.f66183u.logEvent(takeLast, bundle);
    }

    /* renamed from: W1 */
    public final void m55940W1(AnalyticsEvent analyticsEvent) {
        String substringAfterLast$default;
        String takeLast;
        String str;
        substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(analyticsEvent.getName(), (char) CoreConstants.DOT, (String) null, 2, (Object) null);
        takeLast = StringsKt___StringsKt.takeLast(substringAfterLast$default, f66153P);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : analyticsEvent.getProperties().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (str = value.toString()) == null) {
                str = "";
            }
            bundle.putString(key, str);
        }
        this.f66184v.logEvent(takeLast, bundle);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: d */
    public void mo55936d(Application app, boolean z) {
        Intrinsics.checkNotNullParameter(app, "app");
        User m37750B0 = this.f66167e.m37750B0();
        if (m37750B0 != null) {
            m55908w1(m37750B0);
        }
        this.f66171i.getLifecycle().mo67008a(this);
        if (z) {
            C43664k20.m29427t(2);
        } else {
            C43664k20.m29427t(Integer.MAX_VALUE);
        }
        app.registerActivityLifecycleCallbacks(new C16067b(this));
        app.registerActivityLifecycleCallbacks(new T10(false, false, null, null, 15, null));
        m55967E1(app);
        m55972B1();
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: e */
    public Z84<List<AnalyticsDebugEvent>> mo55935e() {
        return (Z84) this.f66163H.getValue();
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: f */
    public long mo55933f() {
        return this.f66159D;
    }

    /* renamed from: g1 */
    public final Map<String, Object> m55930g1(AnalyticsEvent analyticsEvent) {
        Map<String, Object> mapOf;
        Map<String, Object> mapOf2;
        Map<String, Object> mapOf3;
        boolean z;
        Map<String, Object> mapOf4;
        Map<String, Object> mapOf5;
        if (analyticsEvent instanceof BrazeableEvent) {
            return null;
        }
        if (analyticsEvent instanceof L95) {
            mapOf5 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("distance", Double.valueOf(((L95) analyticsEvent).m97644b())));
            return mapOf5;
        } else if ((analyticsEvent instanceof GL1) || (analyticsEvent instanceof VU4)) {
            return null;
        } else {
            if (analyticsEvent instanceof C52785zQ4) {
                return analyticsEvent.getProperties();
            }
            if (analyticsEvent instanceof C44925m95) {
                Pair[] pairArr = new Pair[7];
                C44925m95 c44925m95 = (C44925m95) analyticsEvent;
                Boolean m26238i = c44925m95.m26238i();
                if (m26238i != null) {
                    z = m26238i.booleanValue();
                } else {
                    z = true;
                }
                pairArr[0] = TuplesKt.m28425to("is_primary_ride", Boolean.valueOf(z));
                Object m26243d = c44925m95.m26243d();
                if (m26243d == null) {
                    m26243d = Boolean.TRUE;
                }
                pairArr[1] = TuplesKt.m28425to("concurrent_ride_count", m26243d);
                pairArr[2] = TuplesKt.m28425to("area_id", c44925m95.m26245b());
                pairArr[3] = TuplesKt.m28425to("zone_id", c44925m95.m26240g());
                pairArr[4] = TuplesKt.m28425to("partner_id", c44925m95.m26242e());
                pairArr[5] = TuplesKt.m28425to("ride_id", c44925m95.m26241f());
                pairArr[6] = TuplesKt.m28425to("max_speed", c44925m95.m26244c());
                mapOf4 = MapsKt__MapsKt.mapOf(pairArr);
                return mapOf4;
            } else if (analyticsEvent instanceof CQ4) {
                CQ4 cq4 = (CQ4) analyticsEvent;
                mapOf3 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("ride_id", cq4.m112237e()), TuplesKt.m28425to("end_ride_attempt_id", cq4.m112240b()), TuplesKt.m28425to("last_visited_step", cq4.m112239c()), TuplesKt.m28425to("reason", cq4.m112238d()));
                return mapOf3;
            } else if (analyticsEvent instanceof AQ4) {
                AQ4 aq4 = (AQ4) analyticsEvent;
                mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("ride_id", aq4.m115796c()), TuplesKt.m28425to("end_ride_attempt_id", aq4.m115797b()), TuplesKt.m28425to("last_visited_step", "api_call"), TuplesKt.m28425to("reason", "api_error"));
                return mapOf2;
            } else if (!(analyticsEvent instanceof YP1)) {
                return null;
            } else {
                YP1 yp1 = (YP1) analyticsEvent;
                mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("document_type", yp1.m75111c()), TuplesKt.m28425to("entry_method", yp1.m75112b()), TuplesKt.m28425to("selfie_entry_method", yp1.m75110d()));
                return mapOf;
            }
        }
    }

    /* renamed from: h1 */
    public final long m55928h1(AnalyticsEvent analyticsEvent) {
        if (analyticsEvent instanceof BrazeableEvent) {
            return 0L;
        }
        if (analyticsEvent instanceof L95) {
            return this.f66172j.m82623f8().m73665a().getBrazeConfig().getProximityIncentive().getRateLimitSeconds();
        }
        if ((analyticsEvent instanceof GL1) || (analyticsEvent instanceof VU4)) {
            return 0L;
        }
        if (!(analyticsEvent instanceof C52785zQ4) && !(analyticsEvent instanceof C44925m95)) {
            return 0L;
        }
        return 3600L;
    }

    /* renamed from: i1 */
    public final boolean m55927i1(AnalyticsEvent analyticsEvent) {
        boolean z;
        DateTime plusSeconds;
        String m55911v0 = m55911v0(analyticsEvent);
        if (m55911v0 == null) {
            return false;
        }
        DateTime dateTime = this.f66160E.get(m55911v0);
        if (dateTime != null && (plusSeconds = dateTime.plusSeconds((int) m55928h1(analyticsEvent))) != null) {
            z = plusSeconds.isBeforeNow();
        } else {
            z = true;
        }
        this.f66160E.put(m55911v0, DateTime.now());
        return z;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: k1 */
    public final String m55924k1(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return null;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Exception e) {
            C41318g46.m40158f(e, "Exception while querying network capabilities, gracefully returning null in case the issue is caused by https://issuetracker.google.com/issues/175055271", new Object[0]);
            networkCapabilities = null;
        }
        if (networkCapabilities == null) {
            return null;
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (!networkCapabilities.hasTransport(0)) {
            return null;
        }
        return "cellular";
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    /* renamed from: o0 */
    public final void m55921o0(AnalyticsEvent analyticsEvent) {
        this.f66156A.m71837i(new C16069d(analyticsEvent));
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
    public final void onAppBackground() {
        mo55905y(new C12493bm(null, null, null, 7, null));
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public final void onAppForeground() {
        if (!this.f66158C) {
            mo55905y(new C20514fm(null, null, null, 7, null));
            this.f66158C = true;
        }
        m55957M1();
    }

    /* renamed from: q1 */
    public final Map<String, Object> m55920q1(Map<String, ? extends Object> map) {
        int mapCapacity;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof DateTime) {
                value = Long.valueOf(((DateTime) value).getMillis());
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    /* renamed from: r1 */
    public final Map<String, Object> m55919r1(Map<String, ? extends Object> map) {
        int mapCapacity;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof DateTime) {
                value = ((DateTime) value).toString();
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    /* renamed from: s0 */
    public final AbstractC23461c m55918s0(AnalyticsEntity analyticsEntity) {
        AbstractC23442F m33042m = this.f66157B.mo42753d(analyticsEntity).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Oa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m55916t0;
                m55916t0 = AnalyticsManagerImpl.m55916t0(AnalyticsManagerImpl.this);
                return m55916t0;
            }
        }));
        final C16070e c16070e = new C16070e();
        AbstractC23461c m33159G = m33042m.m33101w(new InterfaceC23484g() { // from class: Pa
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55914u0(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun batchEvent(e…)\n      .schedulers()\n  }");
        AbstractC23461c m55963H1 = m55963H1(m33159G);
        Intrinsics.checkNotNullExpressionValue(m55963H1, "private fun batchEvent(e…)\n      .schedulers()\n  }");
        return m55963H1;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: s1 */
    public final Integer m55917s1(boolean z) {
        CellInfo cellInfo;
        Object obj;
        if (!z) {
            return null;
        }
        List<CellInfo> allCellInfo = this.f66179q.getAllCellInfo();
        if (allCellInfo != null) {
            Iterator<T> it = allCellInfo.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((CellInfo) obj).isRegistered()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            cellInfo = (CellInfo) obj;
        } else {
            cellInfo = null;
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return Integer.valueOf(((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel());
        }
        if (cellInfo instanceof CellInfoLte) {
            return Integer.valueOf(((CellInfoLte) cellInfo).getCellSignalStrength().getLevel());
        }
        if (cellInfo instanceof CellInfoGsm) {
            return Integer.valueOf(((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel());
        }
        if (!(cellInfo instanceof CellInfoCdma)) {
            return null;
        }
        return Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel());
    }

    /* renamed from: t1 */
    public final Long m55915t1() {
        Runtime runtime = Runtime.getRuntime();
        if (runtime != null) {
            return Long.valueOf(runtime.maxMemory() / 1048576);
        }
        return null;
    }

    /* renamed from: u1 */
    public final Double m55913u1() {
        Runtime runtime = Runtime.getRuntime();
        if (runtime != null) {
            return Double.valueOf(runtime.freeMemory() / runtime.totalMemory());
        }
        return null;
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: v */
    public boolean mo55912v(TraceKey key) {
        C40745f66 c40745f66;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentLinkedDeque<C40745f66> concurrentLinkedDeque = this.f66161F.get(key.getName());
        if (concurrentLinkedDeque != null) {
            c40745f66 = concurrentLinkedDeque.peek();
        } else {
            c40745f66 = null;
        }
        if (c40745f66 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public final String m55911v0(AnalyticsEvent analyticsEvent) {
        boolean equals;
        if (analyticsEvent instanceof BrazeableEvent) {
            return ((BrazeableEvent) analyticsEvent).brazeKey();
        }
        if (analyticsEvent instanceof L95) {
            return "CLIENT_DISTANCE_TO_BIRD";
        }
        if (analyticsEvent instanceof GL1) {
            String m105382b = ((GL1) analyticsEvent).m105382b();
            String name = UserRole.RIDER.name();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(m105382b, lowerCase)) {
                return "RIDER_OPENED_HELP_CENTER";
            }
        }
        if ((analyticsEvent instanceof VU4) && Intrinsics.areEqual(((VU4) analyticsEvent).m79840b(), "alert")) {
            return "RIDE_PASS_OWNER_LOGGED_IN_ON_NEW_DEVICE";
        }
        if (analyticsEvent instanceof C52785zQ4) {
            return "RIDER_ATTEMPTED_BAD_PARKING";
        }
        if (analyticsEvent instanceof C44925m95) {
            C44925m95 c44925m95 = (C44925m95) analyticsEvent;
            if (c44925m95.m26244c() != null) {
                return "RIDER_ENTERED_SLOW_AREA";
            }
            if (c44925m95.m26239h()) {
                return "RIDER_ENTERED_NO_RIDE_AREA";
            }
        } else if (!(analyticsEvent instanceof CQ4) && !(analyticsEvent instanceof AQ4)) {
            if (analyticsEvent instanceof YP1) {
                equals = StringsKt__StringsJVMKt.equals(((YP1) analyticsEvent).m75109e(), IdentificationStatus.ACCEPTED.toString(), true);
                if (equals) {
                    return "ID_SUBMISSION_RESULT_SUCCESS";
                }
            }
        } else {
            return "RIDER_PARKING_ATTEMPT_NOT_COMPLETED";
        }
        return null;
    }

    /* renamed from: v1 */
    public final Integer m55910v1() {
        if (this.f66173k.mo10338f()) {
            return Integer.valueOf(WifiManager.calculateSignalLevel(this.f66178p.getConnectionInfo().getRssi(), 5));
        }
        return null;
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: w */
    public void mo55909w(TraceKey key, String keySuffix, Map<String, String> map, DateTime dateTime) {
        C40745f66 poll;
        Map<String, String> map2;
        Map plus;
        DateTime stopTime;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(keySuffix, "keySuffix");
        ConcurrentLinkedDeque<C40745f66> concurrentLinkedDeque = this.f66161F.get(key.getName());
        if (concurrentLinkedDeque != null && (poll = concurrentLinkedDeque.poll()) != null) {
            Map<String, String> m42023b = poll.m42023b();
            if (m42023b == null) {
                m42023b = MapsKt__MapsKt.emptyMap();
            }
            if (map == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            } else {
                map2 = map;
            }
            plus = MapsKt__MapsKt.plus(m42023b, map2);
            for (Map.Entry entry : plus.entrySet()) {
                poll.m42022c().mo64961b((String) entry.getKey(), (String) entry.getValue());
            }
            poll.m42022c().stop();
            if (dateTime == null) {
                stopTime = DateTime.now();
            } else {
                stopTime = dateTime;
            }
            DateTime m42021d = poll.m42021d();
            Intrinsics.checkNotNullExpressionValue(stopTime, "stopTime");
            mo55905y(new G74(null, null, null, key.getName() + keySuffix, plus, m42021d, stopTime, stopTime.getMillis() - poll.m42021d().getMillis(), 7, null));
            C41318g46.m40163a("Trace ended for " + poll, new Object[0]);
        }
    }

    /* renamed from: w1 */
    public final void m55908w1(User user) {
        String id = user.getId();
        this.f66184v.mo4721a(id);
        this.f66185w.setUserId(id);
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: x */
    public void mo55907x(PersistentPropertyEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f66184v.mo4720b(entry.name(), entry.value().toString());
    }

    /* renamed from: x1 */
    public final boolean m55906x1(String str) {
        boolean contains$default;
        Set<String> set = f66155R;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (String str2 : set) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null);
            if (contains$default) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: y */
    public <T extends AnalyticsEvent> void mo55905y(T event) {
        String code;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Map<String, ? extends Object> plus;
        List listOf;
        AbstractC23442F<Object> m71180a;
        WireHabitatStatusContext context;
        WireHabitatStatusDerivedContext derived;
        Intrinsics.checkNotNullParameter(event, "event");
        Location m73665a = this.f66187y.mo43616p().m73665a();
        Locale locale = Locale.getDefault();
        UserRoleItem m37575s0 = this.f66167e.m37575s0();
        if (m37575s0.getUserRole() == UserRole.OPERATOR) {
            code = UserRoleItemKt.getCode(m37575s0.getUserRole()) + ":" + m37575s0.getUserRoleCode();
        } else {
            code = UserRoleItemKt.getCode(m37575s0.getUserRole());
        }
        String str6 = code;
        String mo89931a = this.f66164b.mo89931a();
        String str7 = Build.VERSION.RELEASE;
        String m55924k1 = m55924k1(this.f66175m);
        String mo112055d = this.f66170h.mo112055d();
        String deviceId = this.f66170h.getDeviceId();
        String mo112057b = this.f66170h.mo112057b();
        String mo112058a = this.f66170h.mo112058a();
        double latitude = m73665a.getLatitude();
        double longitude = m73665a.getLongitude();
        double speed = m73665a.getSpeed();
        double altitude = m73665a.getAltitude();
        double accuracy = m73665a.getAccuracy();
        Boolean m76041a = C37195Xw2.m76041a(m73665a);
        User m37750B0 = this.f66167e.m37750B0();
        if (m37750B0 != null) {
            str = m37750B0.getId();
        } else {
            str = null;
        }
        User m37750B02 = this.f66167e.m37750B0();
        if (m37750B02 != null) {
            str2 = m37750B02.getWarehouseId();
        } else {
            str2 = null;
        }
        LocalConfig localConfig = this.f66172j.m82623f8().getValue().getLocalConfig();
        if (localConfig != null) {
            str3 = localConfig.getName();
        } else {
            str3 = null;
        }
        AbstractC39873de5.EnumC19828a mo33641c = this.f66169g.mo33641c();
        Intrinsics.checkNotNullExpressionValue(mo33641c, "rxBleClient.state");
        String simpleState = RxBleState_Kt.toSimpleState(mo33641c);
        InterfaceC49820uQ3 interfaceC49820uQ3 = this.f66173k;
        Permission permission = Permission.ACCESS_FINE_LOCATION;
        String metadataStr = PermissionStatusKt.toMetadataStr(interfaceC49820uQ3.mo10336j(permission), permission);
        String m55958L1 = m55958L1(this.f66173k.mo10339d());
        InterfaceC49820uQ3 interfaceC49820uQ32 = this.f66173k;
        Permission permission2 = Permission.CAMERA;
        String metadataStr2 = PermissionStatusKt.toMetadataStr(interfaceC49820uQ32.mo10336j(permission2), permission2);
        String id = TimeZone.getDefault().getID();
        String language = locale.getLanguage();
        String language2 = locale.getLanguage();
        String mo89926f = this.f66164b.mo89926f();
        String country = locale.getCountry();
        String mo89927e = this.f66164b.mo89927e();
        WireHabitatStatus habitatStatus = this.f66172j.m82623f8().getValue().getHabitatStatus();
        String str8 = (habitatStatus == null || (context = habitatStatus.getContext()) == null || (derived = context.getDerived()) == null || (r9 = derived.getHabitatId()) == null) ? "" : "";
        PartnerUser m59035e = this.f66174l.mo97364o1().getValue().m59035e();
        if (m59035e != null) {
            str4 = m59035e.getPartnerId();
        } else {
            str4 = null;
        }
        InterfaceC49820uQ3.EnumC29192a mo10331o = this.f66173k.mo10331o();
        if (mo10331o != null) {
            str5 = mo10331o.name();
        } else {
            str5 = null;
        }
        C51242wp0 c51242wp0 = new C51242wp0(mo89931a, str7, m55924k1, this.f66170h.mo112054e(), mo112055d, null, deviceId, mo112057b, "android", mo112058a, Double.valueOf(latitude), Double.valueOf(longitude), null, Double.valueOf(speed), Double.valueOf(altitude), Double.valueOf(accuracy), m76041a, str, str2, str3, simpleState, metadataStr, m55958L1, metadataStr2, null, str6, id, language, language2, mo89926f, country, mo89927e, str8, str4, str5, this.f66167e.m37738E0(), "light", Boolean.valueOf(m55904y1()), m55910v1(), m55917s1(this.f66173k.mo10332n()), m55913u1(), m55915t1(), Boolean.valueOf(this.f66172j.m82623f8().m73665a().getEnableMlKitBarcodeScanner()), null, 16777248, 2048, null);
        Map<String, Object> m6301a = c51242wp0.m6301a();
        m55951P1(f66150I.m55900a(c51242wp0));
        String name = event.getName();
        Map<String, Object> properties = event.getProperties();
        m55921o0(event);
        m55943U1(event);
        m55941V1(event);
        m55940W1(event);
        plus = MapsKt__MapsKt.plus(properties, m6301a);
        AnalyticsEntity analyticsEntity = new AnalyticsEntity(0, name, m55920q1(plus), 1, null);
        if (!this.f66172j.m82623f8().m73665a().getEnableOfflineAnalytics()) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(analyticsEntity);
            CreateAnalyticsEventsBody createAnalyticsEventsBody = new CreateAnalyticsEventsBody(listOf);
            if (this.f66182t.mo76578g()) {
                m71180a = this.f66165c.m73649b(createAnalyticsEventsBody);
            } else {
                m71180a = this.f66166d.m71180a(createAnalyticsEventsBody);
            }
            final C16078m c16078m = new C16078m(event);
            m71180a.m33106t(new InterfaceC23484g() { // from class: Fa
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    AnalyticsManagerImpl.m55955N1(Function1.this, obj);
                }
            }).m33159G().m33069Q().subscribe();
            return;
        }
        m55918s0(analyticsEntity).subscribe();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* renamed from: y1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m55904y1() {
        List<ComponentName> activeAdmins = this.f66177o.getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName componentName : activeAdmins) {
                String packageName = componentName.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "admin.packageName");
                if (this.f66177o.isProfileOwnerApp(packageName) || this.f66177o.isDeviceOwnerApp(packageName)) {
                    return true;
                }
                while (r0.hasNext()) {
                }
            }
            return false;
        }
        return false;
    }

    @Override // p000.InterfaceC1880Ea
    /* renamed from: z */
    public void mo55903z(TraceKey key, Map<String, String> map, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f66161F.get(key.getName()) == null) {
            this.f66161F.put(key.getName(), new ConcurrentLinkedDeque<>());
        }
        if (dateTime == null) {
            dateTime = DateTime.now();
        }
        Intrinsics.checkNotNullExpressionValue(dateTime, "startTimeOverride ?: DateTime.now()");
        C40745f66 c40745f66 = new C40745f66(dateTime, this.f66181s.mo34441a(key.getName()), map);
        ConcurrentLinkedDeque<C40745f66> concurrentLinkedDeque = this.f66161F.get(key.getName());
        if (concurrentLinkedDeque != null) {
            concurrentLinkedDeque.push(c40745f66);
        }
        c40745f66.m42022c().start();
    }

    /* renamed from: z1 */
    public final void m55902z1() {
        Observable<AnalyticsEvent> mo1965c = this.f66176n.mo1965c();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo1965c.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16071f c16071f = new C16071f(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Qa
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AnalyticsManagerImpl.m55973A1(Function1.this, obj);
            }
        });
    }
}
