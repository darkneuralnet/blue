package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.coreinterface.manager.PairException;
import co.bird.android.model.BluetoothEncryptionPermissionStatus;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.User;
import co.bird.android.model.constant.OwnershipKind;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePrivateBird;
import co.bird.api.request.PairBody;
import co.bird.api.request.WireBirdActionPairRequest;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.WireBirdActionPairResponse;
import co.bird.api.response.WireBluetoothEncryptionPermissionResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C37791a94;
import p000.F54;
import p000.InterfaceC46663p54;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020@¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J2\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J2\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J2\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J2\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u001e\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00170\u00170\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010 \u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0017H\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070+0*H\u0016J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J2\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u0002000\r2\u0006\u0010/\u001a\u00020\u0015H\u0016R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010AR2\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0D0C8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b!\u0010E\u0012\u0004\bH\u0010I\u001a\u0004\bF\u0010GR,\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0D0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\b3\u0010MR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010ER&\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bP\u0010MR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010ER&\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010L\u001a\u0004\b:\u0010MR \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010ER&\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170+0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010L\u001a\u0004\bU\u0010MR\u0018\u0010Y\u001a\u00020\u001f*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010[\u001a\u00020\u001f*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010^\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]¨\u0006e"}, m28432d2 = {"LF54;", "Lq54;", "Lio/reactivex/c;", "kotlin.jvm.PlatformType", "R", "", "L", "Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/persistence/VehicleVersion;", "vehicleVersion", "", MessageExtension.FIELD_DATA, "Lio/reactivex/F;", "Lkotlin/Pair;", "W", "Z", "X", "Y", "S", "refresh", "", "birdId", "Lco/bird/android/model/wire/WireBird;", "r", "", "Lco/bird/android/model/constant/PartKind;", "parts", "Lco/bird/api/response/WireBirdActionPairResponse;", "m", DateTokenConverter.CONVERTER_KEY, "", "l", "f", "LTk5;", "scanResult", "birdModel", "k", "g", "wireBird", "j", "h", "Lio/reactivex/k;", "", "r0", "e", "n", "macAddress", "Lco/bird/android/model/BluetoothEncryptionPermissionStatus;", "b", "LGI3;", C17296a.f69688o, "LGI3;", "partnerManager", "Lp54;", "Lp54;", "privateBirdsApi", "LfH;", "c", "LfH;", "birdActionsApi", "LRR;", "LRR;", "birdRepository", "LTq4;", "LTq4;", "reactiveConfig", "La94;", "Lco/bird/android/buava/Optional;", "La94;", "N", "()La94;", "getAllPrivateBirdsSubject$ride_release$annotations", "()V", "allPrivateBirdsSubject", "LZ84;", "LZ84;", "()LZ84;", "privateBirds", "_ownedBirds", "i", "ownedBirds", "_rentedBirds", "rentedBirds", "_smartLockUnlockableBirds", "p", "smartLockUnlockableBirds", "P", "(Lco/bird/android/model/wire/WireBird;)Z", "isOwned", "Q", "isRented", "o", "()Z", "ownsBirds", "q", "rentsBirds", "LRh6;", "userStream", "<init>", "(LRh6;LGI3;Lp54;LfH;LRR;LTq4;)V", "ride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n180#2:262\n1#3:263\n288#4,2:264\n11345#5:266\n11680#5,3:267\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl\n*L\n92#1:262\n155#1:264,2\n252#1:266\n252#1:267,3\n*E\n"})
/* renamed from: F54 */
/* loaded from: classes4.dex */
public final class F54 implements InterfaceC47256q54 {

    /* renamed from: a */
    public final GI3 f8709a;

    /* renamed from: b */
    public final InterfaceC46663p54 f8710b;

    /* renamed from: c */
    public final InterfaceC20345fH f8711c;

    /* renamed from: d */
    public final InterfaceC7168RR f8712d;

    /* renamed from: e */
    public final C36207Tq4 f8713e;

    /* renamed from: f */
    public final C37791a94<Optional<List<WireBird>>> f8714f;

    /* renamed from: g */
    public final Z84<Optional<List<WireBird>>> f8715g;

    /* renamed from: h */
    public final C37791a94<List<WireBird>> f8716h;

    /* renamed from: i */
    public final Z84<List<WireBird>> f8717i;

    /* renamed from: j */
    public final C37791a94<List<WireBird>> f8718j;

    /* renamed from: k */
    public final Z84<List<WireBird>> f8719k;

    /* renamed from: l */
    public final C37791a94<List<WireBird>> f8720l;

    /* renamed from: m */
    public final Z84<List<WireBird>> f8721m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$a */
    /* loaded from: classes4.dex */
    public static final class C2137a extends Lambda implements Function1<User, Unit> {
        public C2137a() {
            super(1);
        }

        /* renamed from: a */
        public final void m107760a(User user) {
            F54.this.m107787L();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m107760a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$b */
    /* loaded from: classes4.dex */
    public static final class C2138b extends Lambda implements Function1<User, InterfaceC23496h> {
        public C2138b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40163a("calling refresh private-bird/all (from loginEvents callback)", new Object[0]);
            return F54.this.m107781R();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "allPrivateBirds", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$_ownedBirds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n766#2:262\n857#2,2:263\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$_ownedBirds$1\n*L\n60#1:262\n60#1:263,2\n*E\n"})
    /* renamed from: F54$c */
    /* loaded from: classes4.dex */
    public static final class C2139c extends Lambda implements Function1<Optional<List<? extends WireBird>>, List<? extends WireBird>> {
        public C2139c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(Optional<List<WireBird>> allPrivateBirds) {
            List<WireBird> emptyList;
            Intrinsics.checkNotNullParameter(allPrivateBirds, "allPrivateBirds");
            List<WireBird> m59035e = allPrivateBirds.m59035e();
            if (m59035e != null) {
                F54 f54 = F54.this;
                ArrayList arrayList = new ArrayList();
                for (Object obj : m59035e) {
                    if (f54.m107783P((WireBird) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "allPrivateBirds", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$_rentedBirds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n766#2:262\n857#2,2:263\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$_rentedBirds$1\n*L\n67#1:262\n67#1:263,2\n*E\n"})
    /* renamed from: F54$d */
    /* loaded from: classes4.dex */
    public static final class C2140d extends Lambda implements Function1<Optional<List<? extends WireBird>>, List<? extends WireBird>> {
        public C2140d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(Optional<List<WireBird>> allPrivateBirds) {
            List<WireBird> emptyList;
            Intrinsics.checkNotNullParameter(allPrivateBirds, "allPrivateBirds");
            List<WireBird> m59035e = allPrivateBirds.m59035e();
            if (m59035e != null) {
                F54 f54 = F54.this;
                ArrayList arrayList = new ArrayList();
                for (Object obj : m59035e) {
                    if (f54.m107782Q((WireBird) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "allPrivateBirds", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$_smartLockUnlockableBirds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n766#2:262\n857#2:263\n1747#2,3:264\n858#2:267\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$_smartLockUnlockableBirds$1\n*L\n75#1:262\n75#1:263\n79#1:264,3\n75#1:267\n*E\n"})
    /* renamed from: F54$e */
    /* loaded from: classes4.dex */
    public static final class C2141e extends Lambda implements Function1<Optional<List<? extends WireBird>>, List<? extends WireBird>> {
        public C2141e() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<WireBird> invoke(Optional<List<WireBird>> allPrivateBirds) {
            List<WireBird> emptyList;
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(allPrivateBirds, "allPrivateBirds");
            List<WireBird> m59035e = allPrivateBirds.m59035e();
            if (m59035e != null) {
                F54 f54 = F54.this;
                ArrayList arrayList = new ArrayList();
                for (Object obj : m59035e) {
                    WireBird wireBird = (WireBird) obj;
                    boolean z4 = false;
                    if (C36441Uq4.m80769c(f54.f8713e, wireBird).getPrivateBirdConfig().getScanForSmartlockInForeground()) {
                        List<WirePhysicalLock> physicalLocks = wireBird.getPhysicalLocks();
                        if (physicalLocks != null) {
                            List<WirePhysicalLock> list = physicalLocks;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (WirePhysicalLock wirePhysicalLock : list) {
                                    if (wirePhysicalLock.getSmartlock() != null) {
                                        z2 = true;
                                        continue;
                                    } else {
                                        z2 = false;
                                        continue;
                                    }
                                    if (z2) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            z3 = false;
                            if (z3) {
                                z = true;
                                if (z) {
                                    z4 = true;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    if (z4) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/wire/WireBird;", "privateBirds", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$doesOwnOrRentSingle$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
    /* renamed from: F54$f */
    /* loaded from: classes4.dex */
    public static final class C2142f extends Lambda implements Function1<Optional<List<? extends WireBird>>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f8727g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2142f(String str) {
            super(1);
            this.f8727g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<List<WireBird>> privateBirds) {
            boolean z;
            Intrinsics.checkNotNullParameter(privateBirds, "privateBirds");
            List<WireBird> m59035e = privateBirds.m59035e();
            Object obj = null;
            if (m59035e != null) {
                String str = this.f8727g;
                Iterator<T> it = m59035e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((WireBird) next).getId(), str)) {
                        obj = next;
                        break;
                    }
                }
                obj = (WireBird) obj;
            }
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireBluetoothEncryptionPermissionResponse;", "it", "Lco/bird/android/model/BluetoothEncryptionPermissionStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireBluetoothEncryptionPermissionResponse;)Lco/bird/android/model/BluetoothEncryptionPermissionStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$g */
    /* loaded from: classes4.dex */
    public static final class C2143g extends Lambda implements Function1<WireBluetoothEncryptionPermissionResponse, BluetoothEncryptionPermissionStatus> {

        /* renamed from: g */
        public static final C2143g f8728g = new C2143g();

        public C2143g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BluetoothEncryptionPermissionStatus invoke(WireBluetoothEncryptionPermissionResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPermission();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$h */
    /* loaded from: classes4.dex */
    public static final class C2144h extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends WireBird>> {

        /* renamed from: g */
        public static final C2144h f8729g = new C2144h();

        public C2144h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireBird> invoke(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return AbstractC23442F.m33100x(new PairException(throwable));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "pairedBird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$i */
    /* loaded from: classes4.dex */
    public static final class C2145i extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends WireBird>> {
        public C2145i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireBird> invoke(WireBird pairedBird) {
            Intrinsics.checkNotNullParameter(pairedBird, "pairedBird");
            return F54.this.refresh().m33042m(AbstractC23442F.m33158H(pairedBird));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireBirdActionPairResponse;", "pairedBird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireBirdActionPairResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$j */
    /* loaded from: classes4.dex */
    public static final class C2146j extends Lambda implements Function1<WireBirdActionPairResponse, InterfaceC23447K<? extends WireBirdActionPairResponse>> {
        public C2146j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireBirdActionPairResponse> invoke(WireBirdActionPairResponse pairedBird) {
            Intrinsics.checkNotNullParameter(pairedBird, "pairedBird");
            return F54.this.refresh().m33046j0(pairedBird);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireBird;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/CollectionResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$k */
    /* loaded from: classes4.dex */
    public static final class C2147k extends Lambda implements Function1<CollectionResponse<WireBird>, List<WireBird>> {

        /* renamed from: g */
        public static final C2147k f8732g = new C2147k();

        public C2147k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireBird> invoke(CollectionResponse<WireBird> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getItems();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birds", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F54$l */
    /* loaded from: classes4.dex */
    public static final class C2148l extends Lambda implements Function1<List<WireBird>, Unit> {
        public C2148l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<WireBird> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> birds) {
            C37791a94<Optional<List<WireBird>>> m107785N = F54.this.m107785N();
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(birds, "birds");
            m107785N.accept(c14443a.m59032c(birds));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$refresh$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1603#2,9:262\n1855#2:271\n1856#2:273\n1612#2:274\n1#3:272\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsManagerImpl.kt\nco/bird/android/manager/ride/PrivateBirdsManagerImpl$refresh$3\n*L\n115#1:262,9\n115#1:271\n115#1:273\n115#1:274\n115#1:272\n*E\n"})
    /* renamed from: F54$m */
    /* loaded from: classes4.dex */
    public static final class C2149m extends Lambda implements Function1<List<WireBird>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "partnerId", "Lio/reactivex/K;", "Lco/bird/android/model/MobilePartner;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: F54$m$a */
        /* loaded from: classes4.dex */
        public static final class C2150a extends Lambda implements Function1<String, InterfaceC23447K<? extends MobilePartner>> {

            /* renamed from: g */
            public final /* synthetic */ F54 f8735g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2150a(F54 f54) {
                super(1);
                this.f8735g = f54;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends MobilePartner> invoke(String partnerId) {
                Intrinsics.checkNotNullParameter(partnerId, "partnerId");
                return this.f8735g.f8709a.mo97362u(partnerId);
            }
        }

        public C2149m() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23447K m107748c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(List<WireBird> birds) {
            Intrinsics.checkNotNullParameter(birds, "birds");
            ArrayList arrayList = new ArrayList();
            for (WireBird wireBird : birds) {
                String partnerId = wireBird.getPartnerId();
                if (partnerId != null) {
                    arrayList.add(partnerId);
                }
            }
            Observable fromIterable = Observable.fromIterable(arrayList);
            final C2150a c2150a = new C2150a(F54.this);
            return fromIterable.flatMapSingle(new InterfaceC23492o() { // from class: G54
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m107748c;
                    m107748c = F54.C2149m.m107748c(Function1.this, obj);
                    return m107748c;
                }
            }).lastOrError().m33159G().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F54$n */
    /* loaded from: classes4.dex */
    public static final class C2151n extends Lambda implements Function1<WireBird, InterfaceC23496h> {
        public C2151n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return F54.this.refresh();
        }
    }

    public F54(InterfaceC35660Rh6 userStream, GI3 partnerManager, InterfaceC46663p54 privateBirdsApi, InterfaceC20345fH birdActionsApi, InterfaceC7168RR birdRepository, C36207Tq4 reactiveConfig) {
        List emptyList;
        List emptyList2;
        List emptyList3;
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(privateBirdsApi, "privateBirdsApi");
        Intrinsics.checkNotNullParameter(birdActionsApi, "birdActionsApi");
        Intrinsics.checkNotNullParameter(birdRepository, "birdRepository");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f8709a = partnerManager;
        this.f8710b = privateBirdsApi;
        this.f8711c = birdActionsApi;
        this.f8712d = birdRepository;
        this.f8713e = reactiveConfig;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        C37791a94<Optional<List<WireBird>>> create$default = C37791a94.C10586a.create$default(c10586a, Optional.f63040c.m59034a(), null, 2, null);
        this.f8714f = create$default;
        Z84.C10119a c10119a = Z84.f47888d;
        this.f8715g = c10119a.m73663b(create$default);
        Observable<Optional<List<WireBird>>> distinctUntilChanged = create$default.distinctUntilChanged();
        final C2139c c2139c = new C2139c();
        Observable<R> map = distinctUntilChanged.map(new InterfaceC23492o() { // from class: r54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m107790I;
                m107790I = F54.m107790I(Function1.this, obj);
                return m107790I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "allPrivateBirdsSubject.d…sOwned } ?: emptyList() }");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C37791a94<List<WireBird>> c37791a94 = (C37791a94) H54.m104424a(map, C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null));
        this.f8716h = c37791a94;
        this.f8717i = c10119a.m73663b(c37791a94);
        Observable<Optional<List<WireBird>>> distinctUntilChanged2 = create$default.distinctUntilChanged();
        final C2140d c2140d = new C2140d();
        Observable<R> map2 = distinctUntilChanged2.map(new InterfaceC23492o() { // from class: w54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m107789J;
                m107789J = F54.m107789J(Function1.this, obj);
                return m107789J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "allPrivateBirdsSubject.d…Rented } ?: emptyList() }");
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        C37791a94<List<WireBird>> c37791a942 = (C37791a94) H54.m104424a(map2, C37791a94.C10586a.create$default(c10586a, emptyList2, null, 2, null));
        this.f8718j = c37791a942;
        this.f8719k = c10119a.m73663b(c37791a942);
        Observable<Optional<List<WireBird>>> distinctUntilChanged3 = create$default.distinctUntilChanged();
        final C2141e c2141e = new C2141e();
        Observable<R> map3 = distinctUntilChanged3.map(new InterfaceC23492o() { // from class: x54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m107788K;
                m107788K = F54.m107788K(Function1.this, obj);
                return m107788K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "allPrivateBirdsSubject.d…   } ?: emptyList()\n    }");
        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
        C37791a94<List<WireBird>> c37791a943 = (C37791a94) H54.m104424a(map3, C37791a94.C10586a.create$default(c10586a, emptyList3, null, 2, null));
        this.f8720l = c37791a943;
        this.f8721m = c10119a.m73663b(c37791a943);
        Observable<User> mo76576i = userStream.mo76576i();
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = mo76576i.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2137a c2137a = new C2137a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: y54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F54.m107792G(Function1.this, obj);
            }
        });
        Observable<User> mo76582c = userStream.mo76582c();
        final C2138b c2138b = new C2138b();
        mo76582c.switchMapCompletable(new InterfaceC23492o() { // from class: z54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m107791H;
                m107791H = F54.m107791H(Function1.this, obj);
                return m107791H;
            }
        }).subscribe();
    }

    /* renamed from: G */
    public static final void m107792G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23496h m107791H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final List m107790I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final List m107789J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final List m107788K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final Boolean m107786M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final BluetoothEncryptionPermissionStatus m107784O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BluetoothEncryptionPermissionStatus) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m107779T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m107778U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23447K m107777V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final List m107772a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m107771b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23496h m107770c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23496h m107769d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    public static /* synthetic */ void getAllPrivateBirdsSubject$ride_release$annotations() {
    }

    /* renamed from: L */
    public final void m107787L() {
        this.f8714f.accept(Optional.f63040c.m59034a());
    }

    /* renamed from: N */
    public final C37791a94<Optional<List<WireBird>>> m107785N() {
        return this.f8714f;
    }

    /* renamed from: P */
    public final boolean m107783P(WireBird wireBird) {
        WirePrivateBird privateBird = wireBird.getPrivateBird();
        return (privateBird != null ? privateBird.getOwnershipKind() : null) == OwnershipKind.OWNER;
    }

    /* renamed from: Q */
    public final boolean m107782Q(WireBird wireBird) {
        WirePrivateBird privateBird = wireBird.getPrivateBird();
        return (privateBird != null ? privateBird.getOwnershipKind() : null) == OwnershipKind.RENTER;
    }

    /* renamed from: R */
    public final AbstractC23461c m107781R() {
        return refresh().m33065U(3L).m33069Q();
    }

    /* renamed from: S */
    public final void m107780S(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        C41318g46.m40157g("PrivateBirdsManager did not process BLE data: " + arrayList, new Object[0]);
    }

    /* renamed from: W */
    public final AbstractC23442F<Pair<Bird, VehicleVersion>> m107776W(Bird bird, VehicleVersion vehicleVersion, byte[] bArr) {
        Bird copy;
        if (bArr.length > 17) {
            copy = bird.copy((r88 & 1) != 0 ? bird.f66670id : null, (r88 & 2) != 0 ? bird.model : null, (r88 & 4) != 0 ? bird.taskId : null, (r88 & 8) != 0 ? bird.batteryLevel : UByte.m116801constructorimpl(bArr[17]) & UByte.MAX_VALUE, (r88 & 16) != 0 ? bird.estimatedRange : null, (r88 & 32) != 0 ? bird.distance : 0, (r88 & 64) != 0 ? bird.location : null, (r88 & 128) != 0 ? bird.code : null, (r88 & 256) != 0 ? bird.stickerId : null, (r88 & 512) != 0 ? bird.serialNumber : null, (r88 & 1024) != 0 ? bird.disconnected : false, (r88 & 2048) != 0 ? bird.collect : false, (r88 & 4096) != 0 ? bird.submerged : false, (r88 & 8192) != 0 ? bird.lost : false, (r88 & 16384) != 0 ? bird.locked : false, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r88 & 65536) != 0 ? bird.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r88 & 524288) != 0 ? bird.label : null, (r88 & 1048576) != 0 ? bird.actions : null, (r88 & 2097152) != 0 ? bird.bountyId : null, (r88 & 4194304) != 0 ? bird.bountyPrice : null, (r88 & 8388608) != 0 ? bird.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r88 & 33554432) != 0 ? bird.bountyOverdue : false, (r88 & 67108864) != 0 ? bird.bountyKind : null, (r88 & 134217728) != 0 ? bird.brandName : null, (r88 & 268435456) != 0 ? bird.taskKind : null, (r88 & 536870912) != 0 ? bird.gpsAt : null, (r88 & 1073741824) != 0 ? bird.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r89 & 1) != 0 ? bird.bluetooth : false, (r89 & 2) != 0 ? bird.cellular : false, (r89 & 4) != 0 ? bird.startedAt : null, (r89 & 8) != 0 ? bird.dueAt : null, (r89 & 16) != 0 ? bird.asleep : false, (r89 & 32) != 0 ? bird.imei : null, (r89 & 64) != 0 ? bird.boardProtocol : null, (r89 & 128) != 0 ? bird.physicalLock : null, (r89 & 256) != 0 ? bird.physicalLocks : null, (r89 & 512) != 0 ? bird.priorityCollect : false, (r89 & 1024) != 0 ? bird.down : false, (r89 & 2048) != 0 ? bird.needsInspection : false, (r89 & 4096) != 0 ? bird.partnerId : null, (r89 & 8192) != 0 ? bird.nestId : null, (r89 & 16384) != 0 ? bird.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.partnerBirdState : null, (r89 & 65536) != 0 ? bird.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.lifecycle : null, (r89 & 524288) != 0 ? bird.offline : false, (r89 & 1048576) != 0 ? bird.license : null, (r89 & 2097152) != 0 ? bird.areaKey : null, (r89 & 4194304) != 0 ? bird.nestPurpose : null, (r89 & 8388608) != 0 ? bird.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r89 & 33554432) != 0 ? bird.badgeType : null, (r89 & 67108864) != 0 ? bird.bountyReasons : null, (r89 & 134217728) != 0 ? bird.ephemeralId : null, (r89 & 268435456) != 0 ? bird.bleMacAddress : null, (r89 & 536870912) != 0 ? bird.hasHelmet : null, (r89 & 1073741824) != 0 ? bird.locationUpdatedAt : null);
            AbstractC23442F<Pair<Bird, VehicleVersion>> m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(copy, vehicleVersion));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      val battery = da… to vehicleVersion)\n    }");
            return m33158H;
        }
        AbstractC23442F<Pair<Bird, VehicleVersion>> m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* renamed from: X */
    public final AbstractC23442F<Pair<Bird, VehicleVersion>> m107775X(Bird bird, VehicleVersion vehicleVersion, byte[] bArr) {
        if (bArr.length > 6) {
            AbstractC23442F<Pair<Bird, VehicleVersion>> m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(bird, VehicleVersion.copy$default(vehicleVersion, null, null, String.valueOf((UByte.m116801constructorimpl(bArr[6]) & UByte.MAX_VALUE) * 0.01d), 0, null, null, 59, null)));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      val version = \"$…Version = version))\n    }");
            return m33158H;
        }
        AbstractC23442F<Pair<Bird, VehicleVersion>> m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* renamed from: Y */
    public final AbstractC23442F<Pair<Bird, VehicleVersion>> m107774Y(Bird bird, VehicleVersion vehicleVersion, byte[] bArr) {
        if (bArr.length > 10) {
            AbstractC23442F<Pair<Bird, VehicleVersion>> m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(bird, VehicleVersion.copy$default(vehicleVersion, null, null, null, 0, new String(new byte[]{bArr[6], bArr[7], bArr[8], bArr[10]}, Charsets.UTF_8), null, 47, null)));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      val version = St…Version = version))\n    }");
            return m33158H;
        }
        AbstractC23442F<Pair<Bird, VehicleVersion>> m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    /* renamed from: Z */
    public final AbstractC23442F<Pair<Bird, VehicleVersion>> m107773Z(Bird bird, VehicleVersion vehicleVersion, byte[] bArr) {
        Bird copy;
        if (bArr.length > 14) {
            copy = bird.copy((r88 & 1) != 0 ? bird.f66670id : null, (r88 & 2) != 0 ? bird.model : null, (r88 & 4) != 0 ? bird.taskId : null, (r88 & 8) != 0 ? bird.batteryLevel : 0, (r88 & 16) != 0 ? bird.estimatedRange : null, (r88 & 32) != 0 ? bird.distance : ((UByte.m116801constructorimpl(bArr[14]) & UByte.MAX_VALUE) | ((UByte.m116801constructorimpl(bArr[12]) & UByte.MAX_VALUE) << 16) | ((UByte.m116801constructorimpl(bArr[13]) & UByte.MAX_VALUE) << 8)) * 100, (r88 & 64) != 0 ? bird.location : null, (r88 & 128) != 0 ? bird.code : null, (r88 & 256) != 0 ? bird.stickerId : null, (r88 & 512) != 0 ? bird.serialNumber : null, (r88 & 1024) != 0 ? bird.disconnected : false, (r88 & 2048) != 0 ? bird.collect : false, (r88 & 4096) != 0 ? bird.submerged : false, (r88 & 8192) != 0 ? bird.lost : false, (r88 & 16384) != 0 ? bird.locked : false, (r88 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.ackLocked : false, (r88 & 65536) != 0 ? bird.captive : false, (r88 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.gpsFix : false, (r88 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.broken : false, (r88 & 524288) != 0 ? bird.label : null, (r88 & 1048576) != 0 ? bird.actions : null, (r88 & 2097152) != 0 ? bird.bountyId : null, (r88 & 4194304) != 0 ? bird.bountyPrice : null, (r88 & 8388608) != 0 ? bird.bountyCurrency : null, (r88 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.bountyLost : false, (r88 & 33554432) != 0 ? bird.bountyOverdue : false, (r88 & 67108864) != 0 ? bird.bountyKind : null, (r88 & 134217728) != 0 ? bird.brandName : null, (r88 & 268435456) != 0 ? bird.taskKind : null, (r88 & 536870912) != 0 ? bird.gpsAt : null, (r88 & 1073741824) != 0 ? bird.trackedAt : null, (r88 & Integer.MIN_VALUE) != 0 ? bird.token : null, (r89 & 1) != 0 ? bird.bluetooth : false, (r89 & 2) != 0 ? bird.cellular : false, (r89 & 4) != 0 ? bird.startedAt : null, (r89 & 8) != 0 ? bird.dueAt : null, (r89 & 16) != 0 ? bird.asleep : false, (r89 & 32) != 0 ? bird.imei : null, (r89 & 64) != 0 ? bird.boardProtocol : null, (r89 & 128) != 0 ? bird.physicalLock : null, (r89 & 256) != 0 ? bird.physicalLocks : null, (r89 & 512) != 0 ? bird.priorityCollect : false, (r89 & 1024) != 0 ? bird.down : false, (r89 & 2048) != 0 ? bird.needsInspection : false, (r89 & 4096) != 0 ? bird.partnerId : null, (r89 & 8192) != 0 ? bird.nestId : null, (r89 & 16384) != 0 ? bird.lastRideEndedAt : null, (r89 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? bird.partnerBirdState : null, (r89 & 65536) != 0 ? bird.peril : false, (r89 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? bird.deliverable : false, (r89 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? bird.lifecycle : null, (r89 & 524288) != 0 ? bird.offline : false, (r89 & 1048576) != 0 ? bird.license : null, (r89 & 2097152) != 0 ? bird.areaKey : null, (r89 & 4194304) != 0 ? bird.nestPurpose : null, (r89 & 8388608) != 0 ? bird.privateBird : null, (r89 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bird.scannedAt : null, (r89 & 33554432) != 0 ? bird.badgeType : null, (r89 & 67108864) != 0 ? bird.bountyReasons : null, (r89 & 134217728) != 0 ? bird.ephemeralId : null, (r89 & 268435456) != 0 ? bird.bleMacAddress : null, (r89 & 536870912) != 0 ? bird.hasHelmet : null, (r89 & 1073741824) != 0 ? bird.locationUpdatedAt : null);
            AbstractC23442F<Pair<Bird, VehicleVersion>> m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(copy, vehicleVersion));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      val odometerByte… to vehicleVersion)\n    }");
            return m33158H;
        }
        AbstractC23442F<Pair<Bird, VehicleVersion>> m33153M = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
        return m33153M;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: a */
    public Z84<Optional<List<WireBird>>> mo18213a() {
        return this.f8715g;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: b */
    public AbstractC23442F<BluetoothEncryptionPermissionStatus> mo18212b(String macAddress) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        AbstractC23442F<WireBluetoothEncryptionPermissionResponse> m19974b = this.f8710b.m19974b(macAddress);
        final C2143g c2143g = C2143g.f8728g;
        AbstractC23442F m33157I = m19974b.m33157I(new InterfaceC23492o() { // from class: s54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BluetoothEncryptionPermissionStatus m107784O;
                m107784O = F54.m107784O(Function1.this, obj);
                return m107784O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "privateBirdsApi.getBluet…ss).map { it.permission }");
        return m33157I;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: c */
    public Z84<List<WireBird>> mo18211c() {
        return this.f8719k;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: d */
    public AbstractC23461c mo18210d(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<WireBird> m41625i = this.f8711c.m41625i(new PairBody(birdId));
        final C2151n c2151n = new C2151n();
        AbstractC23461c m33164B = m41625i.m33164B(new InterfaceC23492o() { // from class: u54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m107769d0;
                m107769d0 = F54.m107769d0(Function1.this, obj);
                return m107769d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun unpair(bird…Completable { refresh() }");
        return m33164B;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: e */
    public AbstractC23461c mo18209e(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23461c m33063X = this.f8712d.mo39442U0(bird).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "birdRepository.updateBir…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: f */
    public AbstractC23442F<Boolean> mo18208f(String str) {
        AbstractC23442F m33157I;
        if (str == null) {
            m33157I = AbstractC23442F.m33158H(Boolean.FALSE);
        } else {
            AbstractC23442F<Optional<List<WireBird>>> firstOrError = this.f8714f.firstOrError();
            final C2142f c2142f = new C2142f(str);
            m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: t54
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m107786M;
                    m107786M = F54.m107786M(Function1.this, obj);
                    return m107786M;
                }
            });
        }
        AbstractC23442F<Boolean> m33142Y = m33157I.m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "birdId: String?\n  ): Sin…Schedulers.computation())");
        return m33142Y;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: g */
    public WireBird mo18207g(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return C10235ZK.m73298p(bird);
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: h */
    public AbstractC23461c mo18206h() {
        return this.f8712d.mo39424h();
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: i */
    public Z84<List<WireBird>> mo18205i() {
        return this.f8717i;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: j */
    public Bird mo18204j(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "wireBird");
        return C10235ZK.m73313a(wireBird);
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: k */
    public Bird mo18203k(C36154Tk5 scanResult, String birdModel) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        return C10235ZK.m73304j(scanResult, birdModel);
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: l */
    public boolean mo18202l(String str) {
        Object obj;
        Iterator<T> it = mo18205i().m73665a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((WireBird) obj).getId(), str)) {
                break;
            }
        }
        return obj != null;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: m */
    public AbstractC23442F<WireBirdActionPairResponse> mo18201m(String str, Map<PartKind, String> map) {
        AbstractC23442F<WireBirdActionPairResponse> m41633a = this.f8711c.m41633a(new WireBirdActionPairRequest(str, map));
        final C2146j c2146j = new C2146j();
        AbstractC23442F m33165A = m41633a.m33165A(new InterfaceC23492o() { // from class: v54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m107779T;
                m107779T = F54.m107779T(Function1.this, obj);
                return m107779T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun pair(birdId…ult(pairedBird)\n    }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: n */
    public AbstractC23442F<Pair<Bird, VehicleVersion>> mo18200n(Bird bird, VehicleVersion vehicleVersion, byte[] data) {
        List take;
        List listOf;
        List listOf2;
        List listOf3;
        List listOf4;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(vehicleVersion, "vehicleVersion");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length > 3) {
            take = ArraysKt___ArraysKt.take(data, 3);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{(byte) 58, (byte) 23, (byte) 0});
            if (!take.containsAll(listOf)) {
                listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{(byte) 58, (byte) 24, (byte) 32});
                if (!take.containsAll(listOf2)) {
                    listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{(byte) 43, (byte) 83, (byte) 86});
                    if (!take.containsAll(listOf3)) {
                        listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{(byte) 10, (byte) 58, (byte) 23});
                        if (take.containsAll(listOf4)) {
                            return m107774Y(bird, vehicleVersion, data);
                        }
                        m107780S(data);
                        AbstractC23442F<Pair<Bird, VehicleVersion>> m33153M = AbstractC23442F.m33153M();
                        Intrinsics.checkNotNullExpressionValue(m33153M, "{\n          logUnprocess… Single.never()\n        }");
                        return m33153M;
                    }
                    return m107775X(bird, vehicleVersion, data);
                }
                return m107776W(bird, vehicleVersion, data);
            }
            return m107773Z(bird, vehicleVersion, data);
        }
        m107780S(data);
        AbstractC23442F<Pair<Bird, VehicleVersion>> m33153M2 = AbstractC23442F.m33153M();
        Intrinsics.checkNotNullExpressionValue(m33153M2, "{\n      logUnprocessedDa…     Single.never()\n    }");
        return m33153M2;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: o */
    public boolean mo18199o() {
        return !this.f8716h.getValue().isEmpty();
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: p */
    public Z84<List<WireBird>> mo18198p() {
        return this.f8721m;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: q */
    public boolean mo18197q() {
        return !mo18211c().getValue().isEmpty();
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: r */
    public AbstractC23442F<WireBird> mo18196r(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<WireBird> m41631c = this.f8711c.m41631c(new PairBody(birdId));
        final C2144h c2144h = C2144h.f8729g;
        AbstractC23442F<WireBird> m33150P = m41631c.m33150P(new InterfaceC23492o() { // from class: D54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m107778U;
                m107778U = F54.m107778U(Function1.this, obj);
                return m107778U;
            }
        });
        final C2145i c2145i = new C2145i();
        AbstractC23442F m33165A = m33150P.m33165A(new InterfaceC23492o() { // from class: E54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m107777V;
                m107777V = F54.m107777V(Function1.this, obj);
                return m107777V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun pair(birdId…gle.just(pairedBird))\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC47256q54
    /* renamed from: r0 */
    public AbstractC24490k<List<Bird>> mo18195r0() {
        return this.f8712d.mo39411r0();
    }

    @Override // p000.InterfaceC47256q54
    public AbstractC23461c refresh() {
        AbstractC23442F m33146T = InterfaceC46663p54.C27139a.getPrivateBirds$default(this.f8710b, 0, 100, null, 4, null).m33146T(3L);
        final C2147k c2147k = C2147k.f8732g;
        AbstractC23442F m33157I = m33146T.m33157I(new InterfaceC23492o() { // from class: A54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m107772a0;
                m107772a0 = F54.m107772a0(Function1.this, obj);
                return m107772a0;
            }
        });
        final C2148l c2148l = new C2148l();
        AbstractC23442F m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: B54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                F54.m107771b0(Function1.this, obj);
            }
        });
        final C2149m c2149m = new C2149m();
        AbstractC23461c m33164B = m33101w.m33164B(new InterfaceC23492o() { // from class: C54
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m107770c0;
                m107770c0 = F54.m107770c0(Function1.this, obj);
                return m107770c0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun refresh(): … .onErrorComplete()\n    }");
        return m33164B;
    }
}
