package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.provider.MediaStore;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.android.model.Folder;
import co.bird.android.model.Listing;
import co.bird.android.model.TransactionSummary;
import co.bird.android.model.User;
import co.bird.android.model.UserDeletionStatus;
import co.bird.android.model.Zone;
import co.bird.android.model.constant.ContentKind;
import co.bird.android.model.constant.UploadKind;
import co.bird.android.model.wire.WireLocation;
import co.bird.api.request.AutoPayBody;
import co.bird.api.request.AutoPayBodyPaymentIntent;
import co.bird.api.request.BalanceRefundRequest;
import co.bird.api.request.PushBody;
import co.bird.api.request.UpdateUserBody;
import co.bird.api.request.UserByIdsBody;
import co.bird.api.request.UserRequestBody;
import co.bird.api.request.UserUpdateHomeLocationRequest;
import co.bird.api.response.BalanceRefundResponse;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.UserDeleteResponse;
import co.bird.api.response.UserRequestResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
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
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24533h;
import io.reactivex.schedulers.C24542a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import p000.C33788Jh6;
import p000.C37791a94;
import p000.InterfaceC40476ef6;
import p000.InterfaceC44647lh6;
import p000.ZD3;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Zendesk;
@Metadata(m28433d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001OBc\b\u0007\u0012\u0006\u0010M\u001a\u00020K\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010a\u001a\u00020^\u0012\u0006\u0010e\u001a\u00020b\u0012\u0006\u0010i\u001a\u00020f\u0012\u0006\u0010m\u001a\u00020j\u0012\u0006\u0010q\u001a\u00020n\u0012\u0006\u0010u\u001a\u00020r¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005*\u00020\u0004H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007*\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\u000f\u001a\u00020\rH\u0016J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016ø\u0001\u0000J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u001c\u001a\u00020\rH\u0016J(\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0016J<\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\rH\u0016JJ\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\b\u0010'\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010\r2\b\u0010,\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010(\u001a\u00020\rH\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0007H\u0016J\u001e\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00072\u0006\u0010\u001c\u001a\u0002012\u0006\u00102\u001a\u00020\u001fH\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020/0\u0007H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\u0010*\u001a\u0004\u0018\u00010)J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010+\u001a\u00020\rH\u0016J$\u0010=\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010\r2\b\u0010<\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\f\u001a\u00020\u0010H\u0016J\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010?\u001a\u00020>J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00052\u0006\u0010\u0016\u001a\u00020AH\u0016J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004H\u0016J.\u0010J\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040I0H0\u00072\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0FH\u0016R\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tRA\u0010|\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\t w*\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\t\u0018\u00010I0I0v8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R5\u0010\u007f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t w*\n\u0012\u0004\u0012\u00020\t\u0018\u00010}0}0v8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010y\u001a\u0004\b~\u0010{R%\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010\u0086\u0001R)\u0010\u008a\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\t0I0\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0089\u0001R$\u0010\u008c\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0}0\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u001f\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0093\u0001"}, m28432d2 = {"LJh6;", "Llh6;", "", "t0", "Lco/bird/android/model/User;", "Lio/reactivex/Observable;", "j0", "Lio/reactivex/F;", "Z", "Lco/bird/android/model/Balance;", "i1", "", "n", "", "e0", "token", "Lio/reactivex/c;", "b0", "b", "r0", "email", "Lco/bird/android/model/wire/WireLocation;", "location", "Lqa1;", "s", "q", "n1", "getUser", "currency", "i0", "B", "", "autoPayActive", "fromPrompt", "autoPayPlan", "d0", "paymentIntentId", "paymentMethodId", "X", "name", PaymentMethod.BillingDetails.PARAM_PHONE, "Landroid/net/Uri;", "photoUri", "locale", "warehouseId", "W", "l1", "Lco/bird/android/model/UserDeletionStatus;", "p", "Ljava/util/Currency;", "requestRefund", "Lco/bird/api/response/BalanceRefundResponse;", "t", "n0", "u1", "j1", "H", "S", Stripe3ds2AuthParams.FIELD_SOURCE, "postalCode", "countryCode", "w0", "Lco/bird/api/request/UpdateUserBody;", "body", "r1", "Landroid/location/Location;", "Lco/bird/android/model/Zone;", "M", "user", "h1", "", "ids", "LHM4;", "", "p0", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTg6;", "c", "LTg6;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "LRp;", "e", "LRp;", "authManager", "Lef6;", "f", "Lef6;", "uploadManager", "Ll20;", "g", "Ll20;", "brazeManager", "Lm46;", "h", "Lm46;", "timeProvider", "Lwi2;", "i", "Lwi2;", "deserializer", "LRh6;", "j", "LRh6;", "userStream", "LTq4;", "k", "LTq4;", "reactiveConfig", "LOh;", "l", "LOh;", "appBuildConfig", "LZ84;", "kotlin.jvm.PlatformType", "m", "Lkotlin/Lazy;", "U", "()LZ84;", "balances", "Lco/bird/android/buava/Optional;", "K", "balance", "LtO4;", "Lco/bird/android/model/TransactionSummary;", "o", "LtO4;", "dataSourceFactory", "LZD3$d;", "LZD3$d;", "config", "La94;", "La94;", "mutableBalances", "r", "mutableBalance", "Lco/bird/android/model/Listing;", "L", "()Lco/bird/android/model/Listing;", "transactionHistory", "<init>", "(Landroid/content/Context;LTg6;Lgl;LRp;Lef6;Ll20;Lm46;Lwi2;LRh6;LTq4;LOh;)V", "user_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nUserManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,449:1\n37#2,2:450\n1549#3:452\n1620#3,3:453\n1#4:456\n*S KotlinDebug\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl\n*L\n369#1:450,2\n370#1:452\n370#1:453,3\n*E\n"})
/* renamed from: Jh6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33788Jh6 implements InterfaceC44647lh6 {

    /* renamed from: s */
    public static final C4186c f18009s = new C4186c(null);

    /* renamed from: b */
    public final Context f18010b;

    /* renamed from: c */
    public final InterfaceC36119Tg6 f18011c;

    /* renamed from: d */
    public final C22454gl f18012d;

    /* renamed from: e */
    public final InterfaceC7277Rp f18013e;

    /* renamed from: f */
    public final InterfaceC40476ef6 f18014f;

    /* renamed from: g */
    public final InterfaceC44257l20 f18015g;

    /* renamed from: h */
    public final InterfaceC44876m46 f18016h;

    /* renamed from: i */
    public final C51174wi2 f18017i;

    /* renamed from: j */
    public final InterfaceC35660Rh6 f18018j;

    /* renamed from: k */
    public final C36207Tq4 f18019k;

    /* renamed from: l */
    public final InterfaceC6097Oh f18020l;

    /* renamed from: m */
    public final Lazy f18021m;

    /* renamed from: n */
    public final Lazy f18022n;

    /* renamed from: o */
    public final C49210tO4<Unit, TransactionSummary> f18023o;

    /* renamed from: p */
    public final ZD3.C10145d f18024p;

    /* renamed from: q */
    public final C37791a94<Map<Currency, Balance>> f18025q;

    /* renamed from: r */
    public final C37791a94<Optional<Balance>> f18026r;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$a */
    /* loaded from: classes4.dex */
    public static final class C4183a extends Lambda implements Function1<User, Unit> {
        public C4183a() {
            super(1);
        }

        /* renamed from: a */
        public final void m99962a(User user) {
            C33788Jh6.this.m99976t0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m99962a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,449:1\n22#2,2:450\n*S KotlinDebug\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$2\n*L\n119#1:450,2\n*E\n"})
    /* renamed from: Jh6$b */
    /* loaded from: classes4.dex */
    public static final class C4184b extends Lambda implements Function1<User, InterfaceC23434B<? extends Optional<Balance>>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$2\n*L\n1#1,304:1\n122#2,2:305\n*E\n"})
        /* renamed from: Jh6$b$a */
        /* loaded from: classes4.dex */
        public static final class C4185a<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
            @Override // io.reactivex.functions.InterfaceC23480c
            public final R apply(T1 t1, T2 t2) {
                String str = (String) t1;
                Optional.C14443a c14443a = Optional.f63040c;
                Balance balance = (Balance) ((Map) t2).get(C45097mS5.m25591o(str));
                if (balance == null) {
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = str.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    balance = new Balance(null, null, 0L, lowerCase, null, null, null, null, null, null, null, 2039, null);
                }
                return (R) c14443a.m59032c(balance);
            }
        }

        public C4184b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Optional<Balance>> invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C24523e c24523e = C24523e.f91168a;
            Observable combineLatest = Observable.combineLatest(C33788Jh6.this.f18019k.m82698Y8(), C33788Jh6.this.mo26973U(), new C4185a());
            Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
            return combineLatest;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LJh6$c;", "", "", "RANDOM_STRING_LENGTH", "I", "<init>", "()V", "user_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$c */
    /* loaded from: classes4.dex */
    public static final class C4186c {
        public /* synthetic */ C4186c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4186c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$d */
    /* loaded from: classes4.dex */
    public static final class C4187d extends Lambda implements Function0<Z84<Optional<Balance>>> {
        public C4187d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Balance>> invoke() {
            return Z84.f47888d.m73663b(C33788Jh6.this.f18026r);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "", "Ljava/util/Currency;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$e */
    /* loaded from: classes4.dex */
    public static final class C4188e extends Lambda implements Function0<Z84<Map<Currency, ? extends Balance>>> {
        public C4188e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Map<Currency, ? extends Balance>> invoke2() {
            return Z84.f47888d.m73663b(C33788Jh6.this.f18025q);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/UserDeleteResponse;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/UserDeletionStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/UserDeleteResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$f */
    /* loaded from: classes4.dex */
    public static final class C4189f extends Lambda implements Function1<UserDeleteResponse, InterfaceC23447K<? extends UserDeletionStatus>> {
        public C4189f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends UserDeletionStatus> invoke(UserDeleteResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getStatus() != UserDeletionStatus.DELETED) {
                return C33788Jh6.this.m99983n0();
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(it.getStatus());
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(it.status)\n        }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/Balance;", "balanceResponse", "", "Ljava/util/Currency;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/CollectionResponse;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$fetchBalance$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,449:1\n1194#2,2:450\n1222#2,4:452\n*S KotlinDebug\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$fetchBalance$1\n*L\n236#1:450,2\n236#1:452,4\n*E\n"})
    /* renamed from: Jh6$g */
    /* loaded from: classes4.dex */
    public static final class C4190g extends Lambda implements Function1<CollectionResponse<Balance>, Map<Currency, ? extends Balance>> {

        /* renamed from: g */
        public static final C4190g f18032g = new C4190g();

        public C4190g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<Currency, Balance> invoke(CollectionResponse<Balance> balanceResponse) {
            int collectionSizeOrDefault;
            int mapCapacity;
            int coerceAtLeast;
            Intrinsics.checkNotNullParameter(balanceResponse, "balanceResponse");
            List<Balance> items = balanceResponse.getItems();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (Object obj : items) {
                linkedHashMap.put(C45097mS5.m25591o(((Balance) obj).getCurrency()), obj);
            }
            return linkedHashMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032:\u0010\u0006\u001a6\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Ljava/util/Currency;", "Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/Balance;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$h */
    /* loaded from: classes4.dex */
    public static final class C4191h extends Lambda implements Function1<Pair<? extends Map<Currency, ? extends Balance>, ? extends String>, Balance> {

        /* renamed from: g */
        public static final C4191h f18033g = new C4191h();

        public C4191h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Balance invoke(Pair<? extends Map<Currency, Balance>, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String currency = pair.component2();
            Intrinsics.checkNotNullExpressionValue(currency, "currency");
            Balance balance = pair.component1().get(C45097mS5.m25591o(currency));
            if (balance == null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = currency.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                return new Balance(null, null, 0L, lowerCase, null, null, null, null, null, null, null, 2039, null);
            }
            return balance;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$i */
    /* loaded from: classes4.dex */
    public static final class C4192i extends Lambda implements Function1<User, Unit> {
        public C4192i() {
            super(1);
        }

        /* renamed from: a */
        public final void m99957a(User it) {
            C33788Jh6 c33788Jh6 = C33788Jh6.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c33788Jh6.m99991h1(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m99957a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$j */
    /* loaded from: classes4.dex */
    public static final class C4193j extends Lambda implements Function1<User, InterfaceC23447K<? extends User>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Jh6$j$a */
        /* loaded from: classes4.dex */
        public static final class C4194a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C4194a f18036g = new C4194a();

            public C4194a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40158f(th, "Error registering for push notifications", new Object[0]);
            }
        }

        public C4193j() {
            super(1);
        }

        /* renamed from: d */
        public static final User m99953d(User it) {
            Intrinsics.checkNotNullParameter(it, "$it");
            return it;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends User> invoke(final User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c ignoreElements = C33788Jh6.this.m99988j0(it).ignoreElements();
            final C4194a c4194a = C4194a.f18036g;
            return ignoreElements.m33084B(new InterfaceC23484g() { // from class: Kh6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33788Jh6.C4193j.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q().m33048i0(new Callable() { // from class: Lh6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    User m99953d;
                    m99953d = C33788Jh6.C4193j.m99953d(User.this);
                    return m99953d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Ljava/util/Currency;", "Lco/bird/android/model/Balance;", "balances", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$getBalance$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,449:1\n1#2:450\n*E\n"})
    /* renamed from: Jh6$k */
    /* loaded from: classes4.dex */
    public static final class C4195k extends Lambda implements Function1<Map<Currency, ? extends Balance>, InterfaceC24574u<? extends Balance>> {

        /* renamed from: g */
        public final /* synthetic */ String f18037g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4195k(String str) {
            super(1);
            this.f18037g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Balance> invoke(Map<Currency, Balance> balances) {
            AbstractC24507p m32068G;
            Intrinsics.checkNotNullParameter(balances, "balances");
            Balance balance = balances.get(C45097mS5.m25591o(this.f18037g));
            if (balance == null || (m32068G = AbstractC24507p.m32068G(balance)) == null) {
                return AbstractC24507p.m32024u();
            }
            return m32068G;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$l */
    /* loaded from: classes4.dex */
    public static final class C4196l extends Lambda implements Function1<InterfaceC23444H<String>, Unit> {
        public C4196l() {
            super(1);
        }

        /* renamed from: b */
        public static final void m99950b(InterfaceC23444H emitter, C33788Jh6 this$0, Task task) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.isSuccessful()) {
                String str = (String) task.getResult();
                if (str != null) {
                    emitter.onSuccess(str);
                } else {
                    emitter.onError(new Throwable("null install id token returned"));
                }
            } else if (this$0.f18020l.mo89921k()) {
                emitter.onSuccess("");
            } else {
                Throwable exception = task.getException();
                if (exception == null) {
                    exception = new Throwable("Unknown error while querying install id");
                }
                emitter.onError(exception);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<String> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<String> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Task<String> token = FirebaseMessaging.getInstance().getToken();
            final C33788Jh6 c33788Jh6 = C33788Jh6.this;
            token.addOnCompleteListener(new OnCompleteListener() { // from class: Mh6
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C33788Jh6.C4196l.m99950b(InterfaceC23444H.this, c33788Jh6, task);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "token", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$m */
    /* loaded from: classes4.dex */
    public static final class C4197m extends Lambda implements Function1<String, InterfaceC23434B<? extends Boolean>> {
        public C4197m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Boolean> invoke(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            C33788Jh6.this.f18012d.m37748B2(token);
            C33788Jh6.this.f18015g.mo26464c(token);
            return C33788Jh6.this.mo26966j1(token);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lco/bird/android/model/User;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$n */
    /* loaded from: classes4.dex */
    public static final class C4198n extends Lambda implements Function1<Boolean, User> {

        /* renamed from: g */
        public final /* synthetic */ User f18040g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4198n(User user) {
            super(1);
            this.f18040g = user;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final User invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f18040g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Ljava/util/Currency;", "Lco/bird/android/model/Balance;", "oldBalances", "newBalances", C17296a.f69688o, "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$o */
    /* loaded from: classes4.dex */
    public static final class C4199o extends Lambda implements Function2<Map<Currency, ? extends Balance>, Map<Currency, ? extends Balance>, Map<Currency, ? extends Balance>> {

        /* renamed from: g */
        public static final C4199o f18041g = new C4199o();

        public C4199o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Map<Currency, Balance> invoke(Map<Currency, Balance> oldBalances, Map<Currency, Balance> newBalances) {
            Map<Currency, Balance> plus;
            Intrinsics.checkNotNullParameter(oldBalances, "oldBalances");
            Intrinsics.checkNotNullParameter(newBalances, "newBalances");
            plus = MapsKt__MapsKt.plus(oldBalances, newBalances);
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/UserDeleteResponse;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/UserDeletionStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/UserDeleteResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$p */
    /* loaded from: classes4.dex */
    public static final class C4200p extends Lambda implements Function1<UserDeleteResponse, InterfaceC23447K<? extends UserDeletionStatus>> {
        public C4200p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends UserDeletionStatus> invoke(UserDeleteResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getStatus() == UserDeletionStatus.IN_PROGRESS) {
                return C33788Jh6.this.m99983n0();
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(it.getStatus());
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(it.status)\n        }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$q */
    /* loaded from: classes4.dex */
    public static final class C4201q extends Lambda implements Function1<User, Boolean> {

        /* renamed from: g */
        public static final C4201q f18043g = new C4201q();

        public C4201q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$r */
    /* loaded from: classes4.dex */
    public static final class C4202r extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C4202r() {
            super(1);
        }

        /* renamed from: a */
        public final void m99944a(InterfaceC23465c interfaceC23465c) {
            User m37750B0 = C33788Jh6.this.f18012d.m37750B0();
            if (m37750B0 != null) {
                C33788Jh6.this.f18012d.m37590o1(m37750B0.getRideCount());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m99944a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "balance", "", C17296a.f69688o, "(Lco/bird/android/model/Balance;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$s */
    /* loaded from: classes4.dex */
    public static final class C4203s extends Lambda implements Function1<Balance, Unit> {
        public C4203s() {
            super(1);
        }

        /* renamed from: a */
        public final void m99943a(Balance balance) {
            Map mapOf;
            C37791a94 c37791a94 = C33788Jh6.this.f18025q;
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(C45097mS5.m25591o(balance.getCurrency()), balance));
            c37791a94.accept(mapOf);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balance balance) {
            m99943a(balance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "url", "Lio/reactivex/B;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$t */
    /* loaded from: classes4.dex */
    public static final class C4204t extends Lambda implements Function1<String, InterfaceC23434B<? extends User>> {

        /* renamed from: h */
        public final /* synthetic */ String f18047h;

        /* renamed from: i */
        public final /* synthetic */ String f18048i;

        /* renamed from: j */
        public final /* synthetic */ String f18049j;

        /* renamed from: k */
        public final /* synthetic */ String f18050k;

        /* renamed from: l */
        public final /* synthetic */ String f18051l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4204t(String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.f18047h = str;
            this.f18048i = str2;
            this.f18049j = str3;
            this.f18050k = str4;
            this.f18051l = str5;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends User> invoke(String url) {
            boolean z;
            Intrinsics.checkNotNullParameter(url, "url");
            C33788Jh6 c33788Jh6 = C33788Jh6.this;
            if (url.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                url = null;
            }
            return c33788Jh6.m99979r1(new UpdateUserBody(this.f18047h, this.f18048i, this.f18049j, url, null, null, this.f18050k, this.f18051l, 48, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lco/bird/android/model/User;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$u */
    /* loaded from: classes4.dex */
    public static final class C4205u extends Lambda implements Function1<User, User> {
        public C4205u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final User invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            return C33788Jh6.this.m99991h1(user);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/File;", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/io/File;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$v */
    /* loaded from: classes4.dex */
    public static final class C4206v extends Lambda implements Function1<File, InterfaceC23434B<? extends String>> {
        public C4206v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends String> invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            User m37750B0 = C33788Jh6.this.f18012d.m37750B0();
            Intrinsics.checkNotNull(m37750B0);
            InterfaceC40476ef6 interfaceC40476ef6 = C33788Jh6.this.f18014f;
            ContentKind contentKind = ContentKind.PNG;
            UploadKind uploadKind = UploadKind.USER_PHOTOS;
            Folder folder = Folder.PHOTOS;
            String id = m37750B0.getId();
            String m99999e0 = C33788Jh6.this.m99999e0(4);
            return InterfaceC40476ef6.C20086a.uploadContent$default(interfaceC40476ef6, it, contentKind, uploadKind, folder, id + m99999e0, false, false, 96, (Object) null).m33123k0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/UserRequestResponse;", "it", "Lio/reactivex/B;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/UserRequestResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$w */
    /* loaded from: classes4.dex */
    public static final class C4207w extends Lambda implements Function1<UserRequestResponse, InterfaceC23434B<? extends User>> {
        public C4207w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends User> invoke(UserRequestResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C33788Jh6.this.f18011c.m83180a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lco/bird/android/model/User;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jh6$x */
    /* loaded from: classes4.dex */
    public static final class C4208x extends Lambda implements Function1<User, User> {
        public C4208x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final User invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C33788Jh6.this.m99991h1(it);
        }
    }

    public C33788Jh6(Context context, InterfaceC36119Tg6 client, C22454gl preference, InterfaceC7277Rp authManager, InterfaceC40476ef6 uploadManager, InterfaceC44257l20 brazeManager, InterfaceC44876m46 timeProvider, C51174wi2 deserializer, InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig) {
        Lazy lazy;
        Lazy lazy2;
        Map emptyMap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(uploadManager, "uploadManager");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        this.f18010b = context;
        this.f18011c = client;
        this.f18012d = preference;
        this.f18013e = authManager;
        this.f18014f = uploadManager;
        this.f18015g = brazeManager;
        this.f18016h = timeProvider;
        this.f18017i = deserializer;
        this.f18018j = userStream;
        this.f18019k = reactiveConfig;
        this.f18020l = appBuildConfig;
        lazy = LazyKt__LazyJVMKt.lazy(new C4188e());
        this.f18021m = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C4187d());
        this.f18022n = lazy2;
        W66 w66 = new W66(client);
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        this.f18023o = new C49210tO4<>(w66, UNBOUND);
        this.f18024p = new ZD3.C10145d.C10146a().m73539c(50).m73540b(50).m73541a();
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f18025q = c10586a.m71835a(emptyMap, C4199o.f18041g);
        C37791a94<Optional<Balance>> create$default = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        this.f18026r = create$default;
        Observable<User> mo76576i = userStream.mo76576i();
        final C4183a c4183a = new C4183a();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: Dh6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33788Jh6.m100010P(Function1.this, obj);
            }
        });
        Observable<User> mo76582c = userStream.mo76582c();
        final C4184b c4184b = new C4184b();
        mo76582c.switchMap(new InterfaceC23492o() { // from class: Eh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m100009Q;
                m100009Q = C33788Jh6.m100009Q(Function1.this, obj);
                return m100009Q;
            }
        }).subscribe(create$default);
    }

    /* renamed from: P */
    public static final void m100010P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23434B m100009Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23447K m100008R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final Map m100007T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Map) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final Balance m100006V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Balance) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m100004a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m100002c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC24574u m99997f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final User m99995g0(C33788Jh6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f18012d.m37750B0();
    }

    /* renamed from: h0 */
    public static final void m99992h0(C33788Jh6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f18012d.m37670V0()) {
            this$0.f18012d.m37636d();
            this$0.f18012d.m37725H1(true);
        } else {
            this$0.f18012d.m37636d();
        }
        this$0.f18018j.mo76583b();
    }

    /* renamed from: k0 */
    public static final InterfaceC23434B m99987k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: k1 */
    public static final void m99986k1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final User m99984m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (User) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final InterfaceC23447K m99982o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q1 */
    public static final void m99981q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final Boolean m99978s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final InterfaceC23434B m99977s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final User m99975t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (User) tmp0.invoke(obj);
    }

    /* renamed from: v1 */
    public static final File m99970v1(C33788Jh6 this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bitmap bitmap = MediaStore.Images.Media.getBitmap(this$0.f18010b.getContentResolver(), uri);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        File file = new File(this$0.f18010b.getCacheDir().getAbsolutePath(), "photo.png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byteArrayOutputStream.writeTo(fileOutputStream);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return file;
        } finally {
        }
    }

    /* renamed from: w1 */
    public static final InterfaceC23434B m99968w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final InterfaceC23434B m99966x1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: y1 */
    public static final User m99964y1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (User) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: B */
    public AbstractC23442F<Balance> mo26979B(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        AbstractC23442F<Map<Currency, Balance>> firstOrError = mo26973U().firstOrError();
        final C4195k c4195k = new C4195k(currency);
        AbstractC23442F m32053W = firstOrError.m33163C(new InterfaceC23492o() { // from class: wh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m99997f0;
                m99997f0 = C33788Jh6.m99997f0(Function1.this, obj);
                return m99997f0;
            }
        }).m32053W(mo26967i0(currency));
        Intrinsics.checkNotNullExpressionValue(m32053W, "currency: String): Singl…y(fetchBalance(currency))");
        AbstractC23442F<Balance> m99994g1 = m99994g1(m32053W);
        Intrinsics.checkNotNullExpressionValue(m99994g1, "currency: String): Singl…ncy))\n      .schedulers()");
        return m99994g1;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: H */
    public Observable<User> mo26978H() {
        return m99979r1(new UpdateUserBody(null, null, null, null, this.f18016h.mo26386b(), null, null, null, 239, null));
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: K */
    public Z84<Optional<Balance>> mo26977K() {
        return (Z84) this.f18022n.getValue();
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: L */
    public Listing<TransactionSummary> mo26976L() {
        Observable m78052b;
        m78052b = C36802We5.m78052b(this.f18023o, this.f18024p, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        return new Listing<>(m78052b, this.f18023o.m12436h());
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: M */
    public Observable<Zone> mo26975M(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        Observable<Zone> m99971v0 = m99971v0(this.f18011c.getZone());
        Intrinsics.checkNotNullExpressionValue(m99971v0, "client\n      .getZone()\n      .schedulers()");
        return m99971v0;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: S */
    public Observable<User> mo26974S(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return m99979r1(new UpdateUserBody(null, null, null, null, null, null, locale, null, 191, null));
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: U */
    public Z84<Map<Currency, Balance>> mo26973U() {
        return (Z84) this.f18021m.getValue();
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: W */
    public Observable<User> mo26972W(String str, String str2, String str3, Uri uri, String str4, String str5) {
        Observable<String> observeOn = m99973u1(uri).subscribeOn(C24542a.m31932c()).observeOn(C24542a.m31932c());
        final C4204t c4204t = new C4204t(str2, str, str3, str4, str5);
        Observable flatMap = observeOn.flatMap(new InterfaceC23492o() { // from class: Hh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m99977s1;
                m99977s1 = C33788Jh6.m99977s1(Function1.this, obj);
                return m99977s1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun updateUser(…Id\n        ))\n      }\n  }");
        return flatMap;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: X */
    public AbstractC23442F<Balance> mo26971X(boolean z, boolean z2, String str, String str2, String str3) {
        AbstractC23442F<Balance> m99994g1 = m99994g1(m99989i1(this.f18011c.m83184A(new AutoPayBodyPaymentIntent(z2, z, str, str2, str3))));
        Intrinsics.checkNotNullExpressionValue(m99994g1, "client.updateAutoPayForP…cts()\n      .schedulers()");
        return m99994g1;
    }

    /* renamed from: Z */
    public final AbstractC23442F<User> m100005Z() {
        AbstractC23442F<User> user = this.f18011c.getUser();
        final C4192i c4192i = new C4192i();
        AbstractC23442F<User> m33101w = user.m33101w(new InterfaceC23484g() { // from class: sh6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33788Jh6.m100002c0(Function1.this, obj);
            }
        });
        final C4193j c4193j = new C4193j();
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: th6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m100004a0;
                m100004a0 = C33788Jh6.m100004a0(Function1.this, obj);
                return m100004a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun fetchUserAnd…Single { it }\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: b */
    public AbstractC23461c mo26970b() {
        AbstractC23461c m33029z = this.f18013e.mo72474b().m33029z(new InterfaceC23478a() { // from class: qh6
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C33788Jh6.m99992h0(C33788Jh6.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "authManager.logout()\n   …erStream.logout()\n      }");
        return m33029z;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: b0 */
    public AbstractC23461c mo26969b0(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        AbstractC23461c m33049i = this.f18013e.mo72456u(token).m33049i(m100005Z().m33159G());
        Intrinsics.checkNotNullExpressionValue(m33049i, "authManager.verifyMagicL…erPush().ignoreElement())");
        return m33049i;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: d0 */
    public AbstractC23442F<Balance> mo26968d0(boolean z, boolean z2, String str) {
        AbstractC23442F<Balance> m99994g1 = m99994g1(m99989i1(this.f18011c.m83182C(new AutoPayBody(z2, z, str))));
        Intrinsics.checkNotNullExpressionValue(m99994g1, "client.updateAutoPay(Aut…cts()\n      .schedulers()");
        return m99994g1;
    }

    /* renamed from: e0 */
    public final String m99999e0(int i) {
        List list;
        int collectionSizeOrDefault;
        String joinToString$default;
        Object random;
        list = CollectionsKt___CollectionsKt.toList(new CharRange('0', 'z'));
        Character[] chArr = (Character[]) list.toArray(new Character[0]);
        IntRange intRange = new IntRange(1, i);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            random = ArraysKt___ArraysKt.random(chArr, Random.Default);
            arrayList.add(Character.valueOf(((Character) random).charValue()));
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    /* renamed from: g1 */
    public <T> AbstractC23442F<T> m99994g1(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC44647lh6.C25764a.m26949g(this, abstractC23442F);
    }

    @Override // p000.InterfaceC44647lh6
    public AbstractC23442F<User> getUser() {
        AbstractC23442F m32053W = AbstractC24507p.m32071D(new Callable() { // from class: rh6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                User m99995g0;
                m99995g0 = C33788Jh6.m99995g0(C33788Jh6.this);
                return m99995g0;
            }
        }).m32053W(mo26963n1().singleOrError());
        Intrinsics.checkNotNullExpressionValue(m32053W, "fromCallable<User> {\n   …chUser().singleOrError())");
        AbstractC23442F<User> m99994g1 = m99994g1(m32053W);
        Intrinsics.checkNotNullExpressionValue(m99994g1, "fromCallable<User> {\n   …or())\n      .schedulers()");
        return m99994g1;
    }

    /* renamed from: h1 */
    public User m99991h1(User user) {
        String str;
        Intrinsics.checkNotNullParameter(user, "user");
        this.f18018j.mo76567q1(user);
        C43475jj0.f93239a.m30038e(C37298Yh6.m74461a(user, this.f18012d, this.f18020l));
        this.f18015g.mo26466a(user.getId());
        String email = user.getEmail();
        if (email != null) {
            str = new Regex("bird.co").replace(email, "birdapp.com");
        } else {
            str = null;
        }
        Zendesk.INSTANCE.setIdentity(new AnonymousIdentity.Builder().withNameIdentifier(user.getName()).withEmailIdentifier(str).build());
        this.f18012d.m37697O1();
        return this.f18012d.m37708L2(user);
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: i0 */
    public AbstractC23442F<Balance> mo26967i0(String str) {
        AbstractC23442F<CollectionResponse<Balance>> m83174t = this.f18011c.m83174t();
        final C4190g c4190g = C4190g.f18032g;
        AbstractC23442F m33101w = m83174t.m33157I(new InterfaceC23492o() { // from class: Fh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Map m100007T;
                m100007T = C33788Jh6.m100007T(Function1.this, obj);
                return m100007T;
            }
        }).m33101w(this.f18025q);
        Intrinsics.checkNotNullExpressionValue(m33101w, "client.balance()\n      .…nSuccess(mutableBalances)");
        AbstractC23442F m32053W = C37279Yf5.m74545l0(str).m32053W(this.f18019k.m82698Y8().firstOrError());
        Intrinsics.checkNotNullExpressionValue(m32053W, "currency.toMaybe().switc…urrency().firstOrError())");
        AbstractC23442F m31942a = C24533h.m31942a(m33101w, m32053W);
        final C4191h c4191h = C4191h.f18033g;
        AbstractC23442F m33157I = m31942a.m33157I(new InterfaceC23492o() { // from class: Gh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Balance m100006V;
                m100006V = C33788Jh6.m100006V(Function1.this, obj);
                return m100006V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "client.balance()\n      .…rCase(Locale.US))\n      }");
        AbstractC23442F<Balance> m99994g1 = m99994g1(m33157I);
        Intrinsics.checkNotNullExpressionValue(m99994g1, "client.balance()\n      .…    }\n      .schedulers()");
        return m99994g1;
    }

    /* renamed from: i1 */
    public final AbstractC23442F<Balance> m99989i1(AbstractC23442F<Balance> abstractC23442F) {
        final C4202r c4202r = new C4202r();
        AbstractC23442F<Balance> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: Bh6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33788Jh6.m99986k1(Function1.this, obj);
            }
        });
        final C4203s c4203s = new C4203s();
        AbstractC23442F<Balance> m33101w = m33102v.m33101w(new InterfaceC23484g() { // from class: Ch6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33788Jh6.m99981q1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun Single<Balan… to balance))\n      }\n  }");
        return m33101w;
    }

    /* renamed from: j0 */
    public final Observable<User> m99988j0(User user) {
        Observable<Boolean> m33162D;
        String m37587p0 = this.f18012d.m37587p0();
        if (m37587p0 == null || (m33162D = mo26966j1(m37587p0)) == null) {
            AbstractC23442F m33142Y = C45832nh5.m23305k(new C4196l()).m33142Y(C24542a.m31932c());
            final C4197m c4197m = new C4197m();
            m33162D = m33142Y.m33162D(new InterfaceC23492o() { // from class: nh6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m99987k0;
                    m99987k0 = C33788Jh6.m99987k0(Function1.this, obj);
                    return m99987k0;
                }
            });
        }
        final C4198n c4198n = new C4198n(user);
        Observable<User> observeOn = m33162D.map(new InterfaceC23492o() { // from class: yh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                User m99984m0;
                m99984m0 = C33788Jh6.m99984m0(Function1.this, obj);
                return m99984m0;
            }
        }).onErrorReturnItem(user).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "User.maybeRegisterPush()…dSchedulers.mainThread())");
        return observeOn;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: j1 */
    public Observable<Boolean> mo26966j1(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Observable<User> m83181D = this.f18011c.m83181D(new PushBody(token, null, this.f18020l.mo89921k(), 2, null));
        final C4201q c4201q = C4201q.f18043g;
        Object map = m83181D.map(new InterfaceC23492o() { // from class: xh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m99978s0;
                m99978s0 = C33788Jh6.m99978s0(Function1.this, obj);
                return m99978s0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "client\n      .registerPu…box))\n      .map { true }");
        Observable<Boolean> m99971v0 = m99971v0(map);
        Intrinsics.checkNotNullExpressionValue(m99971v0, "client\n      .registerPu…rue }\n      .schedulers()");
        return m99971v0;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: l1 */
    public Observable<User> mo26965l1(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Observable<User> observeOn = m99979r1(new UpdateUserBody(null, null, phone, null, null, null, null, null, 251, null)).observeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(observeOn, "updateUser(UpdateUserBod…bserveOn(Schedulers.io())");
        return observeOn;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: n */
    public AbstractC23461c mo26964n() {
        AbstractC23461c m99974u0 = m99974u0(this.f18011c.m83179n());
        Intrinsics.checkNotNullExpressionValue(m99974u0, "client.startSession()\n      .schedulers()");
        return m99974u0;
    }

    /* renamed from: n0 */
    public AbstractC23442F<UserDeletionStatus> m99983n0() {
        AbstractC23442F<UserDeleteResponse> m33122l = this.f18011c.m83176r().m33122l(1L, TimeUnit.SECONDS);
        final C4200p c4200p = new C4200p();
        AbstractC23442F m33165A = m33122l.m33165A(new InterfaceC23492o() { // from class: Ah6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m99982o0;
                m99982o0 = C33788Jh6.m99982o0(Function1.this, obj);
                return m99982o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun refreshDele…us)\n        }\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: n1 */
    public Observable<User> mo26963n1() {
        Observable<User> m33123k0 = m100005Z().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "fetchUserAndRegisterPush()\n      .toObservable()");
        Observable<User> m99971v0 = m99971v0(m33123k0);
        Intrinsics.checkNotNullExpressionValue(m99971v0, "fetchUserAndRegisterPush…ble()\n      .schedulers()");
        return m99971v0;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC44647lh6.C25764a.m26953c(this);
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: p */
    public AbstractC23442F<UserDeletionStatus> mo26962p() {
        AbstractC23442F<UserDeleteResponse> m33122l = this.f18011c.m83178p().m33122l(1L, TimeUnit.SECONDS);
        final C4189f c4189f = new C4189f();
        AbstractC23442F m33165A = m33122l.m33165A(new InterfaceC23492o() { // from class: zh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m100008R;
                m100008R = C33788Jh6.m100008R(Function1.this, obj);
                return m100008R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun deleteUser(…us)\n        }\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: p0 */
    public AbstractC23442F<HM4<Map<String, User>>> mo26961p0(List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        AbstractC23442F<HM4<Map<String, User>>> m33142Y = this.f18011c.m83183B(new UserByIdsBody(ids)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "client.getUsersByIds(Use…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: q */
    public AbstractC23461c mo26960q() {
        AbstractC23461c m99974u0 = m99974u0(this.f18011c.m83177q());
        Intrinsics.checkNotNullExpressionValue(m99974u0, "client.sendVerifyEmail().schedulers()");
        return m99974u0;
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: r0 */
    public Observable<User> mo26959r0(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Observable<UserRequestResponse> m83168z = this.f18011c.m83168z(new UserRequestBody(token));
        final C4207w c4207w = new C4207w();
        Observable<R> flatMap = m83168z.flatMap(new InterfaceC23492o() { // from class: oh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m99966x1;
                m99966x1 = C33788Jh6.m99966x1(Function1.this, obj);
                return m99966x1;
            }
        });
        final C4208x c4208x = new C4208x();
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: ph6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                User m99964y1;
                m99964y1 = C33788Jh6.m99964y1(Function1.this, obj);
                return m99964y1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun verifyEmail…}\n      .schedulers()\n  }");
        Observable<User> m99971v0 = m99971v0(map);
        Intrinsics.checkNotNullExpressionValue(m99971v0, "override fun verifyEmail…}\n      .schedulers()\n  }");
        return m99971v0;
    }

    /* renamed from: r1 */
    public final Observable<User> m99979r1(UpdateUserBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        Observable<User> m83172v = this.f18011c.m83172v(body);
        final C4205u c4205u = new C4205u();
        Object map = m83172v.map(new InterfaceC23492o() { // from class: Ih6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                User m99975t1;
                m99975t1 = C33788Jh6.m99975t1(Function1.this, obj);
                return m99975t1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun updateUser(body: Upd…}\n      .schedulers()\n  }");
        Observable<User> m99971v0 = m99971v0(map);
        Intrinsics.checkNotNullExpressionValue(m99971v0, "fun updateUser(body: Upd…}\n      .schedulers()\n  }");
        return m99971v0;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC44647lh6.C25764a.m26952d(this);
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: t */
    public AbstractC23442F<BalanceRefundResponse> mo26957t(Currency currency, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        InterfaceC36119Tg6 interfaceC36119Tg6 = this.f18011c;
        String currency2 = currency.toString();
        Intrinsics.checkNotNullExpressionValue(currency2, "currency.toString()");
        return interfaceC36119Tg6.m83175s(new BalanceRefundRequest(currency2, !z));
    }

    /* renamed from: t0 */
    public final void m99976t0() {
        this.f18025q.m71836j();
        this.f18026r.m71836j();
    }

    /* renamed from: u0 */
    public AbstractC23461c m99974u0(AbstractC23461c abstractC23461c) {
        return InterfaceC44647lh6.C25764a.m26951e(this, abstractC23461c);
    }

    /* renamed from: u1 */
    public final Observable<String> m99973u1(final Uri uri) {
        if (uri != null) {
            Observable fromCallable = Observable.fromCallable(new Callable() { // from class: uh6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    File m99970v1;
                    m99970v1 = C33788Jh6.m99970v1(C33788Jh6.this, uri);
                    return m99970v1;
                }
            });
            final C4206v c4206v = new C4206v();
            Observable<String> flatMap = fromCallable.flatMap(new InterfaceC23492o() { // from class: vh6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m99968w1;
                    m99968w1 = C33788Jh6.m99968w1(Function1.this, obj);
                    return m99968w1;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMap, "fun uploadPhoto(photoUri…rvable.just(\"\")\n    }\n  }");
            return flatMap;
        }
        Observable<String> just = Observable.just("");
        Intrinsics.checkNotNullExpressionValue(just, "{\n      Observable.just(\"\")\n    }");
        return just;
    }

    /* renamed from: v0 */
    public <T> Observable<T> m99971v0(Observable<T> observable) {
        return InterfaceC44647lh6.C25764a.m26950f(this, observable);
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: w0 */
    public AbstractC23461c mo26956w0(String source, String str, String str2) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23461c m99974u0 = m99974u0(this.f18011c.m83170x(new UserUpdateHomeLocationRequest(source, str, str2)));
        Intrinsics.checkNotNullExpressionValue(m99974u0, "client.updateHomeLocatio…    )\n      .schedulers()");
        return m99974u0;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC44647lh6.C25764a.m26955a(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC44647lh6.C25764a.m26954b(this);
    }

    @Override // p000.InterfaceC44647lh6
    /* renamed from: s */
    public AbstractC23442F<C47537qa1> mo26958s(String email, WireLocation wireLocation) {
        Intrinsics.checkNotNullParameter(email, "email");
        return this.f18013e.mo72458s(email, wireLocation);
    }
}
