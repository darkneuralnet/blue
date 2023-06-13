package p000;

import androidx.room.EmptyResultSetException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.User;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.constant.InventoryScanningErrorKt;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.persistence.HardCountEntity;
import co.bird.android.model.persistence.HardCountScan;
import co.bird.android.model.persistence.PendingScanEntity;
import co.bird.android.model.persistence.PendingScanEntityKt;
import co.bird.android.model.persistence.UnidentifiedScanEntity;
import co.bird.android.model.persistence.UnidentifiedScanEntityKt;
import co.bird.android.model.wire.WireHardCountBird;
import co.bird.api.request.HardCountCreateRequest;
import co.bird.api.response.HardCountResponse;
import co.bird.api.response.HardCountScanResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.C46171oG1;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010B\u001a\u00020@\u0012\u0006\u0010E\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020F\u0012\u0006\u0010K\u001a\u00020I\u0012\u0006\u0010N\u001a\u00020L¢\u0006\u0004\b\\\u0010]J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u001e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00020#H\u0016J6\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020#2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016J \u0010)\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0#2\u0006\u0010+\u001a\u00020*H\u0016J$\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0,0#2\u0006\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0,012\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u00103\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u00104\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0007H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a05H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020905H\u0016J\b\u0010;\u001a\u00020\u0012H\u0016J&\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020#2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0,052\u0006\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010>\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0007H\u0016J\u0016\u0010?\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010MR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0017R\u001c\u0010S\u001a\b\u0012\u0004\u0012\u0002090Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010RR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010TR\"\u0010X\u001a\u0010\u0012\f\u0012\n V*\u0004\u0018\u000106060U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010Z¨\u0006^"}, m28432d2 = {"LoG1;", "LXF1;", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "response", "Lco/bird/android/model/constant/InventoryScanningError;", "V", "", "rawString", "previousScanIdentifier", "Lco/bird/api/request/HardCountCreateRequest;", "request", "", "rawScan", "Lio/reactivex/c;", "b0", "Y", "e0", "", "W", "hardCountCreateRequest", "I", "scanErrorCode", "J", "Lco/bird/android/model/wire/WireHardCountBird;", "wireHardCountBird", "Lco/bird/android/model/persistence/HardCountScan;", "P", "O", "scanRequest", "X", "h", "Q", "hardCountSessionId", C17296a.f69688o, "Lio/reactivex/F;", "Lco/bird/api/response/HardCountResponse;", DateTokenConverter.CONVERTER_KEY, "hardCountId", "scanIdentifier", "o", "e", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "identifierCategory", "", "Lco/bird/android/model/persistence/HardCountEntity;", "q", "f", "sessionId", "Lio/reactivex/k;", "j", "r", "p", "Lio/reactivex/Observable;", "Lco/bird/android/model/HardCountStatus;", "n", "c", "", "l", "i", "m", "g", "b", "k", "Llh6;", "Llh6;", "userManager", "LdF1;", "LdF1;", "hardCountClient", "LiF1;", "LiF1;", "hardCountDao", "LlH1;", "LlH1;", "hardCountScanDao", "Lgl;", "Lgl;", "appPreference", "", "currentLapId", "La94;", "La94;", "currentLapScanCountRelay", "Ljava/lang/String;", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "hardCountStatusSubject", "", "Ljava/util/Set;", "hardCountScanQueued", "<init>", "(Llh6;LdF1;LiF1;LlH1;Lgl;)V", "co.bird.android.manager.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46171oG1 implements XF1 {

    /* renamed from: a */
    public final InterfaceC44647lh6 f101680a;

    /* renamed from: b */
    public final InterfaceC39640dF1 f101681b;

    /* renamed from: c */
    public final AbstractC42604iF1 f101682c;

    /* renamed from: d */
    public final AbstractC44401lH1 f101683d;

    /* renamed from: e */
    public final C22454gl f101684e;

    /* renamed from: f */
    public long f101685f;

    /* renamed from: g */
    public C37791a94<Integer> f101686g;

    /* renamed from: h */
    public String f101687h;

    /* renamed from: i */
    public final C24552a<HardCountStatus> f101688i;

    /* renamed from: j */
    public final Set<String> f101689j;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oG1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C26877a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InventoryScanningIdentifierCategory.values().length];
            try {
                iArr[InventoryScanningIdentifierCategory.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InventoryScanningIdentifierCategory.UNIDENTIFIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/PendingScanEntity;", "pendingScans", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountRequestByCategory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1549#2:441\n1620#2,3:442\n*S KotlinDebug\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountRequestByCategory$1\n*L\n279#1:441\n279#1:442,3\n*E\n"})
    /* renamed from: oG1$b */
    /* loaded from: classes4.dex */
    public static final class C26878b extends Lambda implements Function1<List<? extends PendingScanEntity>, List<? extends HardCountCreateRequest>> {

        /* renamed from: g */
        public static final C26878b f101690g = new C26878b();

        public C26878b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<HardCountCreateRequest> invoke(List<PendingScanEntity> pendingScans) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pendingScans, "pendingScans");
            List<PendingScanEntity> list = pendingScans;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (PendingScanEntity pendingScanEntity : list) {
                arrayList.add(new HardCountCreateRequest(pendingScanEntity.getHardCountId(), pendingScanEntity.getScanIdentifier(), pendingScanEntity.getPreviousScanIdentifier()));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/UnidentifiedScanEntity;", "unidentifiedScans", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountRequestByCategory$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1549#2:441\n1620#2,3:442\n*S KotlinDebug\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountRequestByCategory$2\n*L\n292#1:441\n292#1:442,3\n*E\n"})
    /* renamed from: oG1$c */
    /* loaded from: classes4.dex */
    public static final class C26879c extends Lambda implements Function1<List<? extends UnidentifiedScanEntity>, List<? extends HardCountCreateRequest>> {

        /* renamed from: g */
        public static final C26879c f101691g = new C26879c();

        public C26879c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<HardCountCreateRequest> invoke(List<UnidentifiedScanEntity> unidentifiedScans) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(unidentifiedScans, "unidentifiedScans");
            List<UnidentifiedScanEntity> list = unidentifiedScans;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (UnidentifiedScanEntity unidentifiedScanEntity : list) {
                arrayList.add(new HardCountCreateRequest(unidentifiedScanEntity.getHardCountId(), unidentifiedScanEntity.getScanIdentifier(), null, 4, null));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/PendingScanEntity;", "pendingScans", "Lco/bird/android/model/persistence/HardCountEntity;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountScans$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1549#2:441\n1620#2,3:442\n*S KotlinDebug\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountScans$1\n*L\n256#1:441\n256#1:442,3\n*E\n"})
    /* renamed from: oG1$d */
    /* loaded from: classes4.dex */
    public static final class C26880d extends Lambda implements Function1<List<? extends PendingScanEntity>, List<? extends HardCountEntity>> {

        /* renamed from: g */
        public static final C26880d f101692g = new C26880d();

        public C26880d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<HardCountEntity> invoke(List<PendingScanEntity> pendingScans) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pendingScans, "pendingScans");
            List<PendingScanEntity> list = pendingScans;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (PendingScanEntity pendingScanEntity : list) {
                arrayList.add(PendingScanEntityKt.toHardCountEntity(pendingScanEntity));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/UnidentifiedScanEntity;", "unidentifiedScans", "Lco/bird/android/model/persistence/HardCountEntity;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountScans$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1549#2:441\n1620#2,3:442\n*S KotlinDebug\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$cachedHardCountScans$2\n*L\n265#1:441\n265#1:442,3\n*E\n"})
    /* renamed from: oG1$e */
    /* loaded from: classes4.dex */
    public static final class C26881e extends Lambda implements Function1<List<? extends UnidentifiedScanEntity>, List<? extends HardCountEntity>> {

        /* renamed from: g */
        public static final C26881e f101693g = new C26881e();

        public C26881e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<HardCountEntity> invoke(List<UnidentifiedScanEntity> unidentifiedScans) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(unidentifiedScans, "unidentifiedScans");
            List<UnidentifiedScanEntity> list = unidentifiedScans;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (UnidentifiedScanEntity unidentifiedScanEntity : list) {
                arrayList.add(UnidentifiedScanEntityKt.toHardCountEntity(unidentifiedScanEntity));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/response/HardCountResponse;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oG1$f */
    /* loaded from: classes4.dex */
    public static final class C26882f extends Lambda implements Function1<User, InterfaceC23447K<? extends HM4<HardCountResponse>>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/HardCountResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: oG1$f$a */
        /* loaded from: classes4.dex */
        public static final class C26883a extends Lambda implements Function1<HM4<HardCountResponse>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C46171oG1 f101695g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26883a(C46171oG1 c46171oG1) {
                super(1);
                this.f101695g = c46171oG1;
            }

            /* renamed from: a */
            public final void m21429a(HM4<HardCountResponse> hm4) {
                HardCountResponse m103944a;
                if (hm4.m103939f() && hm4.m103943b() != 204 && (m103944a = hm4.m103944a()) != null) {
                    this.f101695g.f101688i.onNext(new HardCountStatus(m103944a.getFailureScans(), m103944a.getSuccessScans(), m103944a.getUserFailureScans(), m103944a.getUserSuccessScans()));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HM4<HardCountResponse> hm4) {
                m21429a(hm4);
                return Unit.INSTANCE;
            }
        }

        public C26882f() {
            super(1);
        }

        /* renamed from: c */
        public static final void m21430c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends HM4<HardCountResponse>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            String warehouseId = user.getWarehouseId();
            if (warehouseId != null) {
                C46171oG1 c46171oG1 = C46171oG1.this;
                AbstractC23442F<HM4<HardCountResponse>> m33142Y = c46171oG1.f101681b.m44480b(warehouseId).m33142Y(C24542a.m31932c());
                final C26883a c26883a = new C26883a(c46171oG1);
                AbstractC23442F<HM4<HardCountResponse>> m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: pG1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C46171oG1.C26882f.m21430c(Function1.this, obj);
                    }
                });
                if (m33101w != null) {
                    return m33101w;
                }
            }
            return AbstractC23442F.m33100x(new IllegalStateException("No warehouseId associated with current user."));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oG1$g */
    /* loaded from: classes4.dex */
    public static final class C26884g extends Lambda implements Function1<HM4<HardCountScanResponse>, Unit> {
        public C26884g() {
            super(1);
        }

        /* renamed from: a */
        public final void m21428a(HM4<HardCountScanResponse> hm4) {
            HardCountScanResponse m103944a = hm4.m103944a();
            if (m103944a != null) {
                C46171oG1.this.f101688i.onNext(new HardCountStatus(m103944a.getFailureScans(), m103944a.getSuccessScans(), m103944a.getUserFailureScans(), m103944a.getUserSuccessScans()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<HardCountScanResponse> hm4) {
            m21428a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oG1$h */
    /* loaded from: classes4.dex */
    public static final class C26885h extends Lambda implements Function1<HM4<HardCountScanResponse>, InterfaceC23447K<? extends HM4<HardCountScanResponse>>> {

        /* renamed from: h */
        public final /* synthetic */ HardCountCreateRequest f101698h;

        /* renamed from: i */
        public final /* synthetic */ String f101699i;

        /* renamed from: j */
        public final /* synthetic */ String f101700j;

        /* renamed from: k */
        public final /* synthetic */ boolean f101701k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26885h(HardCountCreateRequest hardCountCreateRequest, String str, String str2, boolean z) {
            super(1);
            this.f101698h = hardCountCreateRequest;
            this.f101699i = str;
            this.f101700j = str2;
            this.f101701k = z;
        }

        /* renamed from: c */
        public static final InterfaceC23496h m21425c(C46171oG1 this$0, String scanIdentifier, String str, HardCountCreateRequest request, HM4 response, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(scanIdentifier, "$scanIdentifier");
            Intrinsics.checkNotNullParameter(request, "$request");
            Intrinsics.checkNotNullParameter(response, "$response");
            return this$0.m21468b0(scanIdentifier, str, request, response, z);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends HM4<HardCountScanResponse>> invoke(final HM4<HardCountScanResponse> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            AbstractC23461c m21473Y = C46171oG1.this.m21473Y(this.f101698h, response);
            final C46171oG1 c46171oG1 = C46171oG1.this;
            final String str = this.f101699i;
            final String str2 = this.f101700j;
            final HardCountCreateRequest hardCountCreateRequest = this.f101698h;
            final boolean z = this.f101701k;
            return m21473Y.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: qG1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m21425c;
                    m21425c = C46171oG1.C26885h.m21425c(C46171oG1.this, str, str2, hardCountCreateRequest, response, z);
                    return m21425c;
                }
            })).m33042m(AbstractC23442F.m33158H(response));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "count", "invoke", "(I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oG1$i */
    /* loaded from: classes4.dex */
    public static final class C26886i extends Lambda implements Function1<Integer, Integer> {
        public C26886i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Integer invoke(int i) {
            int i2 = i + 1;
            C46171oG1.this.f101684e.m37685R1(i2);
            return Integer.valueOf(i2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/PendingScanEntity;", "pendingScans", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$streamCachedHardCountRequestByCategory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1549#2:441\n1620#2,3:442\n*S KotlinDebug\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$streamCachedHardCountRequestByCategory$1\n*L\n395#1:441\n395#1:442,3\n*E\n"})
    /* renamed from: oG1$j */
    /* loaded from: classes4.dex */
    public static final class C26887j extends Lambda implements Function1<List<? extends PendingScanEntity>, List<? extends HardCountCreateRequest>> {

        /* renamed from: g */
        public static final C26887j f101703g = new C26887j();

        public C26887j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<HardCountCreateRequest> invoke(List<PendingScanEntity> pendingScans) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pendingScans, "pendingScans");
            List<PendingScanEntity> list = pendingScans;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (PendingScanEntity pendingScanEntity : list) {
                arrayList.add(new HardCountCreateRequest(pendingScanEntity.getHardCountId(), pendingScanEntity.getScanIdentifier(), pendingScanEntity.getPreviousScanIdentifier()));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/UnidentifiedScanEntity;", "unidentifiedScans", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$streamCachedHardCountRequestByCategory$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,440:1\n1549#2:441\n1620#2,3:442\n*S KotlinDebug\n*F\n+ 1 HardCountManagerImpl.kt\nco/bird/android/manager/hardcount/HardCountManagerImpl$streamCachedHardCountRequestByCategory$2\n*L\n407#1:441\n407#1:442,3\n*E\n"})
    /* renamed from: oG1$k */
    /* loaded from: classes4.dex */
    public static final class C26888k extends Lambda implements Function1<List<? extends UnidentifiedScanEntity>, List<? extends HardCountCreateRequest>> {

        /* renamed from: g */
        public static final C26888k f101704g = new C26888k();

        public C26888k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<HardCountCreateRequest> invoke(List<UnidentifiedScanEntity> unidentifiedScans) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(unidentifiedScans, "unidentifiedScans");
            List<UnidentifiedScanEntity> list = unidentifiedScans;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (UnidentifiedScanEntity unidentifiedScanEntity : list) {
                arrayList.add(new HardCountCreateRequest(unidentifiedScanEntity.getHardCountId(), unidentifiedScanEntity.getScanIdentifier(), null, 4, null));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oG1$l */
    /* loaded from: classes4.dex */
    public static final class C26889l extends Lambda implements Function1<Throwable, InterfaceC24574u<? extends HardCountScan>> {

        /* renamed from: g */
        public final /* synthetic */ String f101705g;

        /* renamed from: h */
        public final /* synthetic */ C46171oG1 f101706h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26889l(String str, C46171oG1 c46171oG1) {
            super(1);
            this.f101705g = str;
            this.f101706h = c46171oG1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HardCountScan> invoke(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
            if (this.f101705g != null) {
                return this.f101706h.f101683d.mo25855c(this.f101706h.m21481Q(), this.f101705g);
            }
            return AbstractC24507p.m32023v(new EmptyResultSetException("No result returned for empty Bird id."));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oG1$m */
    /* loaded from: classes4.dex */
    public static final class C26890m extends Lambda implements Function1<Throwable, InterfaceC24574u<? extends HardCountScan>> {

        /* renamed from: g */
        public final /* synthetic */ String f101707g;

        /* renamed from: h */
        public final /* synthetic */ C46171oG1 f101708h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26890m(String str, C46171oG1 c46171oG1) {
            super(1);
            this.f101707g = str;
            this.f101708h = c46171oG1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HardCountScan> invoke(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
            if (this.f101707g != null) {
                return this.f101708h.f101683d.mo25854d(this.f101708h.m21481Q(), this.f101707g);
            }
            return AbstractC24507p.m32023v(new EmptyResultSetException("No result returned for empty Bird code."));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oG1$n */
    /* loaded from: classes4.dex */
    public static final class C26891n extends Lambda implements Function1<Throwable, Unit> {
        public C26891n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C46171oG1.this.m21475W();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/HardCountScan;", "hardCountScan", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oG1$o */
    /* loaded from: classes4.dex */
    public static final class C26892o extends Lambda implements Function1<HardCountScan, InterfaceC23496h> {
        public C26892o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(HardCountScan hardCountScan) {
            boolean z;
            HardCountScan copy;
            Intrinsics.checkNotNullParameter(hardCountScan, "hardCountScan");
            if (hardCountScan.getLapId() == C46171oG1.this.f101685f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C46171oG1.this.m21475W();
                AbstractC44401lH1 abstractC44401lH1 = C46171oG1.this.f101683d;
                copy = hardCountScan.copy((r22 & 1) != 0 ? hardCountScan.f66679id : 0, (r22 & 2) != 0 ? hardCountScan.birdId : null, (r22 & 4) != 0 ? hardCountScan.sessionId : null, (r22 & 8) != 0 ? hardCountScan.scanIdentifier : null, (r22 & 16) != 0 ? hardCountScan.model : null, (r22 & 32) != 0 ? hardCountScan.modelVersionTitle : null, (r22 & 64) != 0 ? hardCountScan.scannedAt : null, (r22 & 128) != 0 ? hardCountScan.lapId : C46171oG1.this.f101685f, (r22 & 256) != 0 ? hardCountScan.completed : false);
                return abstractC44401lH1.mo25853e(copy);
            }
            return AbstractC23461c.m33039p();
        }
    }

    public C46171oG1(InterfaceC44647lh6 userManager, InterfaceC39640dF1 hardCountClient, AbstractC42604iF1 hardCountDao, AbstractC44401lH1 hardCountScanDao, C22454gl appPreference) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(hardCountClient, "hardCountClient");
        Intrinsics.checkNotNullParameter(hardCountDao, "hardCountDao");
        Intrinsics.checkNotNullParameter(hardCountScanDao, "hardCountScanDao");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        this.f101680a = userManager;
        this.f101681b = hardCountClient;
        this.f101682c = hardCountDao;
        this.f101683d = hardCountScanDao;
        this.f101684e = appPreference;
        this.f101685f = appPreference.m37695P();
        this.f101686g = C37791a94.C10586a.create$default(C37791a94.f49908h, Integer.valueOf(appPreference.m37691Q()), null, 2, null);
        this.f101687h = "";
        C24552a<HardCountStatus> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<HardCountStatus>()");
        this.f101688i = m31922e;
        this.f101689j = new LinkedHashSet();
        if (this.f101685f < 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f101685f = currentTimeMillis;
            appPreference.m37689Q1(currentTimeMillis);
        }
    }

    /* renamed from: K */
    public static final List m21487K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final List m21486L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final List m21485M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final List m21484N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23447K m21480R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m21479S(C46171oG1 this$0, String scanIdentifier) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(scanIdentifier, "$scanIdentifier");
        this$0.f101689j.remove(scanIdentifier);
    }

    /* renamed from: T */
    public static final void m21478T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m21477U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final List m21472Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final List m21470a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23496h m21466c0(AbstractC23461c updatePreviousFailedScan) {
        Intrinsics.checkNotNullParameter(updatePreviousFailedScan, "$updatePreviousFailedScan");
        return updatePreviousFailedScan;
    }

    /* renamed from: d0 */
    public static final InterfaceC23496h m21464d0(AbstractC23461c abstractC23461c) {
        return abstractC23461c;
    }

    /* renamed from: f0 */
    public static final InterfaceC23496h m21460f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC24574u m21458g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final InterfaceC24574u m21456h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m21454i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public final AbstractC23461c m21489I(HardCountCreateRequest hardCountCreateRequest) {
        AbstractC23461c m33063X = this.f101682c.mo30938e(new PendingScanEntity(0, hardCountCreateRequest.getHardCountId(), hardCountCreateRequest.getScanIdentifier(), hardCountCreateRequest.getPrevScanIdentifier(), 1, null)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "hardCountDao.insertPendi…scribeOn(Schedulers.io())");
        return m33063X;
    }

    /* renamed from: J */
    public final AbstractC23461c m21488J(HardCountCreateRequest hardCountCreateRequest, InventoryScanningError inventoryScanningError) {
        AbstractC42604iF1 abstractC42604iF1 = this.f101682c;
        UnidentifiedScanEntity[] unidentifiedScanEntityArr = new UnidentifiedScanEntity[1];
        String hardCountId = hardCountCreateRequest.getHardCountId();
        String scanIdentifier = hardCountCreateRequest.getScanIdentifier();
        if (inventoryScanningError == null) {
            inventoryScanningError = InventoryScanningError.UNKNOWN;
        }
        unidentifiedScanEntityArr[0] = new UnidentifiedScanEntity(0, hardCountId, scanIdentifier, inventoryScanningError, 1, null);
        AbstractC23461c m33063X = abstractC42604iF1.mo30937f(unidentifiedScanEntityArr).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "hardCountDao.insertUnide…scribeOn(Schedulers.io())");
        return m33063X;
    }

    /* renamed from: O */
    public final HardCountScan m21483O(HardCountCreateRequest hardCountCreateRequest) {
        return new HardCountScan(0, null, hardCountCreateRequest.getHardCountId(), hardCountCreateRequest.getScanIdentifier(), null, null, null, this.f101685f, false, 115, null);
    }

    /* renamed from: P */
    public final HardCountScan m21482P(WireHardCountBird wireHardCountBird, String str) {
        String str2;
        String str3 = this.f101687h;
        String code = wireHardCountBird.getCode();
        if (code == null) {
            str2 = str;
        } else {
            str2 = code;
        }
        return new HardCountScan(0, null, str3, str2, wireHardCountBird.getModel(), wireHardCountBird.getModelVersionTitle(), null, this.f101685f, false, 323, null);
    }

    /* renamed from: Q */
    public String m21481Q() {
        return this.f101687h;
    }

    /* renamed from: V */
    public final InventoryScanningError m21476V(HM4<HardCountScanResponse> hm4) {
        HardCountScanResponse m103944a = hm4.m103944a();
        if (m103944a != null) {
            return m103944a.getErrorCode();
        }
        return null;
    }

    /* renamed from: W */
    public final void m21475W() {
        this.f101686g.m71837i(new C26886i());
    }

    /* renamed from: X */
    public final AbstractC23461c m21474X(HardCountCreateRequest hardCountCreateRequest, InventoryScanningError inventoryScanningError) {
        List listOfNotNull;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new AbstractC23461c[]{this.f101682c.mo30942a(hardCountCreateRequest.getScanIdentifier()), this.f101682c.mo30937f(new UnidentifiedScanEntity(0, this.f101687h, hardCountCreateRequest.getScanIdentifier(), inventoryScanningError, 1, null))});
        AbstractC23461c m33063X = AbstractC23461c.m33037r(listOfNotNull).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "concat(listOfNotNull(\n  …scribeOn(Schedulers.io())");
        return m33063X;
    }

    /* renamed from: Y */
    public final AbstractC23461c m21473Y(HardCountCreateRequest hardCountCreateRequest, HM4<HardCountScanResponse> hm4) {
        boolean z;
        HardCountScanResponse m103944a = hm4.m103944a();
        if (m103944a != null) {
            boolean z2 = true;
            if (m103944a.getErrorCode() == null && m103944a.getHardCountBird() != null) {
                z = true;
            } else {
                z = false;
            }
            if (m103944a.getErrorCode() != InventoryScanningError.DUPLICATE_SCAN) {
                z2 = false;
            }
            boolean isValidSerialNotInDB = InventoryScanningErrorKt.isValidSerialNotInDB(m103944a.getErrorCode());
            if (z || z2 || isValidSerialNotInDB) {
                return m21462e0(hardCountCreateRequest, hm4);
            }
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    @Override // p000.XF1
    /* renamed from: a */
    public AbstractC23461c mo21471a(String hardCountSessionId) {
        Intrinsics.checkNotNullParameter(hardCountSessionId, "hardCountSessionId");
        AbstractC23461c m33063X = this.f101683d.mo25857a(hardCountSessionId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "hardCountScanDao.deleteS…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.XF1
    /* renamed from: b */
    public void mo21469b(String hardCountId) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        this.f101687h = hardCountId;
    }

    /* renamed from: b0 */
    public final AbstractC23461c m21468b0(String str, String str2, HardCountCreateRequest hardCountCreateRequest, HM4<HardCountScanResponse> hm4, boolean z) {
        WireHardCountBird wireHardCountBird;
        boolean z2;
        final AbstractC23461c m33039p;
        AbstractC23461c m33039p2;
        AbstractC23461c mo25853e;
        HardCountScanResponse m103944a = hm4.m103944a();
        if (m103944a != null) {
            wireHardCountBird = m103944a.getHardCountBird();
        } else {
            wireHardCountBird = null;
        }
        InventoryScanningError m21476V = m21476V(hm4);
        boolean isDuplicateScan = InventoryScanningErrorKt.isDuplicateScan(m21476V);
        if ((z && (InventoryScanningErrorKt.isValidSerialNotInDB(m21476V) || InventoryScanningErrorKt.isValidQRNotInDB(m21476V))) || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (str2 != null && (InventoryScanningErrorKt.isValidSerialNotInDB(m21476V) || wireHardCountBird != null)) {
            m33039p = mo21447p(str2);
        } else {
            m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        }
        if (wireHardCountBird != null) {
            m33039p2 = mo21447p(hardCountCreateRequest.getScanIdentifier());
        } else if (m21476V != null && !isDuplicateScan && z2) {
            m33039p2 = m21474X(hardCountCreateRequest, m21476V);
        } else if (m21476V != null) {
            m33039p2 = mo21447p(hardCountCreateRequest.getScanIdentifier());
        } else {
            m33039p2 = AbstractC23461c.m33039p();
        }
        final AbstractC23461c m33049i = m33039p2.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: iG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m21466c0;
                m21466c0 = C46171oG1.m21466c0(AbstractC23461c.this);
                return m21466c0;
            }
        }));
        if (wireHardCountBird != null) {
            mo25853e = this.f101683d.mo25853e(m21482P(wireHardCountBird, str));
        } else {
            mo25853e = this.f101683d.mo25853e(m21483O(hardCountCreateRequest));
        }
        AbstractC23461c m33049i2 = mo25853e.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: jG1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m21464d0;
                m21464d0 = C46171oG1.m21464d0(AbstractC23461c.this);
                return m21464d0;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i2, "if (bird != null) {\n    …efer { cacheResultScan })");
        return m33049i2;
    }

    @Override // p000.XF1
    /* renamed from: c */
    public Observable<HardCountScan> mo21467c() {
        Observable<HardCountScan> subscribeOn = this.f101683d.mo25852f(this.f101687h).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "hardCountScanDao.mostRec…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.XF1
    /* renamed from: d */
    public AbstractC23442F<HM4<HardCountResponse>> mo21465d() {
        AbstractC23442F<User> user = this.f101680a.getUser();
        final C26882f c26882f = new C26882f();
        AbstractC23442F m33165A = user.m33165A(new InterfaceC23492o() { // from class: aG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m21480R;
                m21480R = C46171oG1.m21480R(Function1.this, obj);
                return m21480R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun getHardCoun…urrent user.\"))\n    }\n  }");
        return m33165A;
    }

    @Override // p000.XF1
    /* renamed from: e */
    public String mo21463e(String scanIdentifier, HM4<HardCountScanResponse> response) {
        InventoryScanningError inventoryScanningError;
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(response, "response");
        HardCountScanResponse m103944a = response.m103944a();
        if (m103944a != null) {
            inventoryScanningError = m103944a.getErrorCode();
        } else {
            inventoryScanningError = null;
        }
        if (!InventoryScanningErrorKt.isValidQRNotInDB(inventoryScanningError)) {
            return null;
        }
        return scanIdentifier;
    }

    /* renamed from: e0 */
    public final AbstractC23461c m21462e0(HardCountCreateRequest hardCountCreateRequest, HM4<HardCountScanResponse> hm4) {
        String str;
        WireHardCountBird hardCountBird;
        WireHardCountBird hardCountBird2;
        HardCountScanResponse m103944a = hm4.m103944a();
        String str2 = null;
        if (m103944a != null && (hardCountBird2 = m103944a.getHardCountBird()) != null) {
            str = hardCountBird2.getId();
        } else {
            str = null;
        }
        HardCountScanResponse m103944a2 = hm4.m103944a();
        if (m103944a2 != null && (hardCountBird = m103944a2.getHardCountBird()) != null) {
            str2 = hardCountBird.getCode();
        }
        String scanIdentifier = hardCountCreateRequest.getScanIdentifier();
        AbstractC24507p<HardCountScan> m32054V = this.f101683d.mo25854d(m21481Q(), scanIdentifier).m32054V(AbstractC24507p.m32023v(new EmptyResultSetException("No result returned for scan identifier: " + scanIdentifier)));
        final C26889l c26889l = new C26889l(str, this);
        AbstractC24507p<HardCountScan> m32054V2 = m32054V.m32062M(new InterfaceC23492o() { // from class: YF1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m21458g0;
                m21458g0 = C46171oG1.m21458g0(Function1.this, obj);
                return m21458g0;
            }
        }).m32054V(AbstractC24507p.m32023v(new EmptyResultSetException("No result returned for Bird id: " + str)));
        final C26890m c26890m = new C26890m(str2, this);
        AbstractC24507p<HardCountScan> m32054V3 = m32054V2.m32062M(new InterfaceC23492o() { // from class: fG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m21456h0;
                m21456h0 = C46171oG1.m21456h0(Function1.this, obj);
                return m21456h0;
            }
        }).m32054V(AbstractC24507p.m32023v(new EmptyResultSetException("No result returned for Bird code: " + str2)));
        final C26891n c26891n = new C26891n();
        AbstractC24507p<HardCountScan> m32065J = m32054V3.m32029p(new InterfaceC23484g() { // from class: gG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46171oG1.m21454i0(Function1.this, obj);
            }
        }).m32065J();
        final C26892o c26892o = new C26892o();
        AbstractC23461c m32074A = m32065J.m32074A(new InterfaceC23492o() { // from class: hG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m21460f0;
                m21460f0 = C46171oG1.m21460f0(Function1.this, obj);
                return m21460f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "private fun updateScanWi…e()\n        }\n      }\n  }");
        return m32074A;
    }

    @Override // p000.XF1
    /* renamed from: f */
    public AbstractC23442F<List<HardCountCreateRequest>> mo21461f(InventoryScanningIdentifierCategory identifierCategory, String hardCountSessionId) {
        Intrinsics.checkNotNullParameter(identifierCategory, "identifierCategory");
        Intrinsics.checkNotNullParameter(hardCountSessionId, "hardCountSessionId");
        int i = C26877a.$EnumSwitchMapping$0[identifierCategory.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AbstractC23442F<List<UnidentifiedScanEntity>> m33142Y = this.f101682c.mo30939d(hardCountSessionId).m33142Y(C24542a.m31932c());
                final C26879c c26879c = C26879c.f101691g;
                AbstractC23442F m33157I = m33142Y.m33157I(new InterfaceC23492o() { // from class: ZF1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m21486L;
                        m21486L = C46171oG1.m21486L(Function1.this, obj);
                        return m21486L;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "{\n        hardCountDao.g…    }\n          }\n      }");
                return m33157I;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC23442F<List<PendingScanEntity>> m33142Y2 = this.f101682c.mo30940c(hardCountSessionId).m33142Y(C24542a.m31932c());
        final C26878b c26878b = C26878b.f101690g;
        AbstractC23442F m33157I2 = m33142Y2.m33157I(new InterfaceC23492o() { // from class: nG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m21487K;
                m21487K = C46171oG1.m21487K(Function1.this, obj);
                return m21487K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I2, "{\n        hardCountDao.g…    }\n          }\n      }");
        return m33157I2;
    }

    @Override // p000.XF1
    /* renamed from: g */
    public Observable<List<HardCountCreateRequest>> mo21459g(InventoryScanningIdentifierCategory identifierCategory, String hardCountSessionId) {
        Observable map;
        Intrinsics.checkNotNullParameter(identifierCategory, "identifierCategory");
        Intrinsics.checkNotNullParameter(hardCountSessionId, "hardCountSessionId");
        int i = C26877a.$EnumSwitchMapping$0[identifierCategory.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Observable<List<UnidentifiedScanEntity>> mo30935h = this.f101682c.mo30935h(hardCountSessionId);
                final C26888k c26888k = C26888k.f101704g;
                map = mo30935h.map(new InterfaceC23492o() { // from class: eG1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m21470a0;
                        m21470a0 = C46171oG1.m21470a0(Function1.this, obj);
                        return m21470a0;
                    }
                });
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            Observable<List<PendingScanEntity>> mo30936g = this.f101682c.mo30936g(hardCountSessionId);
            final C26887j c26887j = C26887j.f101703g;
            map = mo30936g.map(new InterfaceC23492o() { // from class: dG1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m21472Z;
                    m21472Z = C46171oG1.m21472Z(Function1.this, obj);
                    return m21472Z;
                }
            });
        }
        Observable<List<HardCountCreateRequest>> subscribeOn = map.subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "when(identifierCategory)…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.XF1
    /* renamed from: h */
    public void mo21457h() {
        this.f101689j.clear();
    }

    @Override // p000.XF1
    /* renamed from: i */
    public void mo21455i() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f101685f = currentTimeMillis;
        this.f101684e.m37689Q1(currentTimeMillis);
        this.f101684e.m37685R1(0);
        this.f101686g.accept(0);
    }

    @Override // p000.XF1
    /* renamed from: j */
    public AbstractC24490k<List<HardCountScan>> mo21453j(String str) {
        AbstractC44401lH1 abstractC44401lH1 = this.f101683d;
        if (str == null) {
            str = this.f101687h;
        }
        AbstractC24490k<List<HardCountScan>> m32163Y0 = abstractC44401lH1.mo25856b(str).m32163Y0(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32163Y0, "hardCountScanDao.getComp…scribeOn(Schedulers.io())");
        return m32163Y0;
    }

    @Override // p000.XF1
    /* renamed from: k */
    public boolean mo21452k(HM4<HardCountScanResponse> response) {
        WireHardCountBird wireHardCountBird;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.m103939f() && response.m103943b() != 204) {
            HardCountScanResponse m103944a = response.m103944a();
            if (m103944a != null) {
                wireHardCountBird = m103944a.getHardCountBird();
            } else {
                wireHardCountBird = null;
            }
            if (wireHardCountBird != null && m21476V(response) == null) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.XF1
    /* renamed from: l */
    public Observable<Integer> mo21451l() {
        Observable<Integer> hide = this.f101686g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "currentLapScanCountRelay.hide()");
        return hide;
    }

    @Override // p000.XF1
    /* renamed from: m */
    public AbstractC23442F<HM4<HardCountScanResponse>> mo21450m(String rawString, String str) {
        Intrinsics.checkNotNullParameter(rawString, "rawString");
        return mo21448o(this.f101687h, rawString, true, str);
    }

    @Override // p000.XF1
    /* renamed from: n */
    public Observable<HardCountStatus> mo21449n() {
        Observable<HardCountStatus> hide = this.f101688i.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "hardCountStatusSubject.hide()");
        return hide;
    }

    @Override // p000.XF1
    /* renamed from: o */
    public AbstractC23442F<HM4<HardCountScanResponse>> mo21448o(String hardCountId, final String scanIdentifier, boolean z, String str) {
        Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        if (!this.f101689j.add(scanIdentifier)) {
            AbstractC23442F<HM4<HardCountScanResponse>> m33153M = AbstractC23442F.m33153M();
            Intrinsics.checkNotNullExpressionValue(m33153M, "never()");
            return m33153M;
        }
        HardCountCreateRequest hardCountCreateRequest = new HardCountCreateRequest(hardCountId, scanIdentifier, str);
        AbstractC23442F<HM4<HardCountScanResponse>> m33110r = this.f101681b.m44481a(hardCountCreateRequest).m33142Y(C24542a.m31932c()).m33110r(new InterfaceC23478a() { // from class: kG1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C46171oG1.m21479S(C46171oG1.this, scanIdentifier);
            }
        });
        final C26884g c26884g = new C26884g();
        AbstractC23442F<HM4<HardCountScanResponse>> m33101w = m33110r.m33101w(new InterfaceC23484g() { // from class: lG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C46171oG1.m21478T(Function1.this, obj);
            }
        });
        final C26885h c26885h = new C26885h(hardCountCreateRequest, scanIdentifier, str, z);
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: mG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m21477U;
                m21477U = C46171oG1.m21477U(Function1.this, obj);
                return m21477U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun hardCountSc…st(response))\n      }\n  }");
        return m33165A;
    }

    @Override // p000.XF1
    /* renamed from: p */
    public AbstractC23461c mo21447p(String scanIdentifier) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new AbstractC23461c[]{this.f101682c.mo30942a(scanIdentifier), this.f101682c.mo30941b(scanIdentifier)});
        AbstractC23461c m33063X = AbstractC23461c.m33037r(listOfNotNull).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "concat(listOfNotNull(\n  …scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.XF1
    /* renamed from: q */
    public AbstractC23442F<List<HardCountEntity>> mo21446q(InventoryScanningIdentifierCategory identifierCategory) {
        Intrinsics.checkNotNullParameter(identifierCategory, "identifierCategory");
        int i = C26877a.$EnumSwitchMapping$0[identifierCategory.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AbstractC23442F<List<UnidentifiedScanEntity>> m33142Y = this.f101682c.mo30939d(this.f101687h).m33142Y(C24542a.m31932c());
                final C26881e c26881e = C26881e.f101693g;
                AbstractC23442F m33157I = m33142Y.m33157I(new InterfaceC23492o() { // from class: cG1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        List m21484N;
                        m21484N = C46171oG1.m21484N(Function1.this, obj);
                        return m21484N;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "{\n        hardCountDao.g…    }\n          }\n      }");
                return m33157I;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC23442F<List<PendingScanEntity>> m33142Y2 = this.f101682c.mo30940c(this.f101687h).m33142Y(C24542a.m31932c());
        final C26880d c26880d = C26880d.f101692g;
        AbstractC23442F m33157I2 = m33142Y2.m33157I(new InterfaceC23492o() { // from class: bG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m21485M;
                m21485M = C46171oG1.m21485M(Function1.this, obj);
                return m21485M;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I2, "{\n        hardCountDao.g…    }\n          }\n      }");
        return m33157I2;
    }

    @Override // p000.XF1
    /* renamed from: r */
    public AbstractC23461c mo21445r(HardCountCreateRequest hardCountCreateRequest, InventoryScanningIdentifierCategory identifierCategory, InventoryScanningError inventoryScanningError) {
        Intrinsics.checkNotNullParameter(hardCountCreateRequest, "hardCountCreateRequest");
        Intrinsics.checkNotNullParameter(identifierCategory, "identifierCategory");
        int i = C26877a.$EnumSwitchMapping$0[identifierCategory.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return m21488J(hardCountCreateRequest, inventoryScanningError);
            }
            throw new NoWhenBranchMatchedException();
        }
        return m21489I(hardCountCreateRequest);
    }
}
