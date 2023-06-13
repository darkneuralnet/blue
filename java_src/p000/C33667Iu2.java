package p000;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AssetTask;
import co.bird.android.model.AssetTaskKt;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.model.wire.WireAsset;
import co.bird.api.response.WireSignedUrl;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import p000.C33667Iu2;
import p000.C37791a94;
import p000.EnumC2939Gm;
import p000.InterfaceC41671gg5;
@Metadata(m28433d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB3\b\u0007\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010<\u001a\u00020:\u0012\u0006\u0010?\u001a\u00020=\u0012\b\b\u0001\u0010A\u001a\u00020\t¢\u0006\u0004\bL\u0010MJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J2\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00130\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010 \u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160!0\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016JT\u0010*\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010\u00112\b\u0010(\u001a\u0004\u0018\u00010\u00112\b\u0010)\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0!0\r2\u0006\u0010+\u001a\u00020\u0011H\u0016J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\bH\u0016R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010>R\u0014\u0010A\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010@R'\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140B8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010C\u001a\u0004\b7\u0010DR \u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010FR\"\u0010K\u001a\u0010\u0012\f\u0012\n I*\u0004\u0018\u00010\u000b0\u000b0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010J¨\u0006N"}, m28432d2 = {"LIu2;", "Lsu2;", "", "Lco/bird/android/model/AssetTask;", "tasks", "", "N", "([Lco/bird/android/model/AssetTask;)V", "Lco/bird/android/model/constant/AssetManagerType;", "LQo;", "K", "Lco/bird/android/model/LocalAsset;", "task", "Lio/reactivex/F;", "", "L", "managerType", "", "assetId", "Lkotlin/Pair;", "", "LIu2$a;", "Lco/bird/api/response/WireSignedUrl;", "B", "manager", "Lco/bird/android/model/constant/TaskPriority;", "priority", C17296a.f69688o, "assetIds", "Lorg/joda/time/DateTime;", "manifestDate", "Lio/reactivex/c;", "c", "LHM4;", DateTokenConverter.CONVERTER_KEY, "id", "", "fileSize", "mediaType", "filePath", "createdBy", "downloadedAt", "h", "dynamicUrl", "Lokhttp3/ResponseBody;", "f", "e", "g", "Ljava/io/File;", "file", "i", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "Lgg5;", "b", "Lgg5;", "s3Manager", "LLo;", "LLo;", "assetDao", "LWo;", "LWo;", "assetRepairManager", "LQo;", "webArchiveAssetManager", "Lio/reactivex/Observable;", "Lkotlin/Lazy;", "()Lio/reactivex/Observable;", "La94;", "La94;", "tasksSubject", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "localAssetSubject", "<init>", "(Landroid/content/Context;Lgg5;LLo;LWo;LQo;)V", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1#2:329\n*E\n"})
/* renamed from: Iu2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33667Iu2 implements InterfaceC48923su2 {

    /* renamed from: a */
    public final Context f16408a;

    /* renamed from: b */
    public final InterfaceC41671gg5 f16409b;

    /* renamed from: c */
    public final AbstractC5089Lo f16410c;

    /* renamed from: d */
    public final InterfaceC9184Wo f16411d;

    /* renamed from: e */
    public final InterfaceC6909Qo f16412e;

    /* renamed from: f */
    public final Lazy f16413f;

    /* renamed from: g */
    public final C37791a94<List<AssetTask>> f16414g;

    /* renamed from: h */
    public final C24558d<LocalAsset> f16415h;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"LIu2$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "local-asset_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$a */
    /* loaded from: classes4.dex */
    public enum EnumC3794a {
        HOSTED_URL_NO_DOWNLOAD
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Iu2$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C3795b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetManagerType.values().length];
            try {
                iArr[AssetManagerType.REPAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetManagerType.WEB_ARCHIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LNo;", "asset", "Lio/reactivex/u;", "Lco/bird/android/model/LocalAsset;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LNo;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$assetReady$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1#2:329\n*E\n"})
    /* renamed from: Iu2$c */
    /* loaded from: classes4.dex */
    public static final class C3796c extends Lambda implements Function1<C5698No, InterfaceC24574u<? extends LocalAsset>> {

        /* renamed from: g */
        public static final C3796c f16418g = new C3796c();

        public C3796c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends LocalAsset> invoke(C5698No asset) {
            LocalAsset m96207c;
            AbstractC24507p m32068G;
            Intrinsics.checkNotNullParameter(asset, "asset");
            m96207c = C34369Lu2.m96207c(asset);
            if (m96207c == null || (m32068G = AbstractC24507p.m32068G(m96207c)) == null) {
                return AbstractC24507p.m32024u();
            }
            return m32068G;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/LocalAsset;", "kotlin.jvm.PlatformType", "asset", "", C17296a.f69688o, "(Lco/bird/android/model/LocalAsset;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$assetReady$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n819#2:329\n847#2,2:330\n1#3:332\n*S KotlinDebug\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$assetReady$2\n*L\n180#1:329\n180#1:330,2\n*E\n"})
    /* renamed from: Iu2$d */
    /* loaded from: classes4.dex */
    public static final class C3797d extends Lambda implements Function1<LocalAsset, Unit> {
        public C3797d() {
            super(1);
        }

        /* renamed from: a */
        public final void m101507a(LocalAsset localAsset) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) C33667Iu2.this.f16414g.getValue()) {
                if (!Intrinsics.areEqual(((AssetTask) obj).getAssetId(), localAsset.getId())) {
                    arrayList.add(obj);
                }
            }
            C33667Iu2.this.f16414g.accept(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalAsset localAsset) {
            m101507a(localAsset);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Iu2$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C3798e extends FunctionReferenceImpl implements Function1<LocalAsset, Unit> {
        public C3798e(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m101506a(LocalAsset p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalAsset localAsset) {
            m101506a(localAsset);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a2\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/WireSignedUrl;", "response", "Lkotlin/Pair;", "", "LIu2$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$f */
    /* loaded from: classes4.dex */
    public static final class C3799f extends Lambda implements Function1<HM4<WireSignedUrl>, Pair<? extends List<? extends EnumC3794a>, ? extends WireSignedUrl>> {

        /* renamed from: g */
        public static final C3799f f16420g = new C3799f();

        public C3799f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<EnumC3794a>, WireSignedUrl> invoke(HM4<WireSignedUrl> response) {
            String str;
            List emptyList;
            List listOf;
            WireAsset asset;
            Intrinsics.checkNotNullParameter(response, "response");
            EnumC2939Gm.C2940a c2940a = EnumC2939Gm.f12396c;
            WireSignedUrl m103944a = response.m103944a();
            if (m103944a != null && (asset = m103944a.getAsset()) != null) {
                str = asset.getMediaType();
            } else {
                str = null;
            }
            if (c2940a.m104775a(str) == EnumC2939Gm.HOSTED) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(EnumC3794a.HOSTED_URL_NO_DOWNLOAD);
                return TuplesKt.m28425to(listOf, response.m103944a());
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return TuplesKt.m28425to(emptyList, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "LIu2$a;", "Lco/bird/api/response/WireSignedUrl;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "LNo;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$loadAsset$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1#2:329\n*E\n"})
    /* renamed from: Iu2$g */
    /* loaded from: classes4.dex */
    public static final class C3800g extends Lambda implements Function1<Pair<? extends List<? extends EnumC3794a>, ? extends WireSignedUrl>, InterfaceC24574u<? extends C5698No>> {

        /* renamed from: g */
        public final /* synthetic */ String f16421g;

        /* renamed from: h */
        public final /* synthetic */ AssetManagerType f16422h;

        /* renamed from: i */
        public final /* synthetic */ C33667Iu2 f16423i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3800g(String str, AssetManagerType assetManagerType, C33667Iu2 c33667Iu2) {
            super(1);
            this.f16421g = str;
            this.f16422h = assetManagerType;
            this.f16423i = c33667Iu2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C5698No> invoke(Pair<? extends List<? extends EnumC3794a>, WireSignedUrl> pair) {
            String str;
            String str2;
            C5698No m96209a;
            WireAsset asset;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSignedUrl component2 = pair.component2();
            if (pair.component1().contains(EnumC3794a.HOSTED_URL_NO_DOWNLOAD)) {
                String str3 = this.f16421g;
                AssetManagerType assetManagerType = this.f16422h;
                if (component2 != null) {
                    str = component2.getUrl();
                } else {
                    str = null;
                }
                if (component2 != null && (asset = component2.getAsset()) != null) {
                    str2 = asset.getMediaType();
                } else {
                    str2 = null;
                }
                m96209a = C34369Lu2.m96209a(str3, assetManagerType, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : str2, (r13 & 16) != 0 ? null : "", (r13 & 32) == 0 ? DateTime.now() : null);
                return this.f16423i.f16410c.mo94795c(m96209a).m33045k(AbstractC24507p.m32068G(m96209a)).m32060O(m96209a);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LNo;", "asset", "Lio/reactivex/u;", "Lco/bird/android/model/LocalAsset;", "kotlin.jvm.PlatformType", "b", "(LNo;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$h */
    /* loaded from: classes4.dex */
    public static final class C3801h extends Lambda implements Function1<C5698No, InterfaceC24574u<? extends LocalAsset>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "refreshNeeded", "Lio/reactivex/u;", "Lco/bird/android/model/LocalAsset;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$loadAsset$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1#2:329\n*E\n"})
        /* renamed from: Iu2$h$a */
        /* loaded from: classes4.dex */
        public static final class C3802a extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends LocalAsset>> {

            /* renamed from: g */
            public final /* synthetic */ LocalAsset f16425g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3802a(LocalAsset localAsset) {
                super(1);
                this.f16425g = localAsset;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends LocalAsset> invoke(Boolean refreshNeeded) {
                Intrinsics.checkNotNullParameter(refreshNeeded, "refreshNeeded");
                AbstractC24507p m32024u = AbstractC24507p.m32024u();
                if (!refreshNeeded.booleanValue()) {
                    m32024u = null;
                }
                if (m32024u == null) {
                    return AbstractC24507p.m32068G(this.f16425g);
                }
                return m32024u;
            }
        }

        public C3801h() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m101501c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends LocalAsset> invoke(C5698No asset) {
            LocalAsset m96207c;
            Intrinsics.checkNotNullParameter(asset, "asset");
            m96207c = C34369Lu2.m96207c(asset);
            if (m96207c != null) {
                AbstractC23442F m101532L = C33667Iu2.this.m101532L(m96207c);
                final C3802a c3802a = new C3802a(m96207c);
                AbstractC24507p m33163C = m101532L.m33163C(new InterfaceC23492o() { // from class: Ju2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m101501c;
                        m101501c = C33667Iu2.C3801h.m101501c(Function1.this, obj);
                        return m101501c;
                    }
                });
                if (m33163C != null) {
                    return m33163C;
                }
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/LocalAsset;", "localAsset", "", C17296a.f69688o, "(Lco/bird/android/model/LocalAsset;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$i */
    /* loaded from: classes4.dex */
    public static final class C3803i extends Lambda implements Function1<LocalAsset, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f16426g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3803i(String str) {
            super(1);
            this.f16426g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(LocalAsset localAsset) {
            Intrinsics.checkNotNullParameter(localAsset, "localAsset");
            return Boolean.valueOf(Intrinsics.areEqual(localAsset.getId(), this.f16426g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "assetId", "Lio/reactivex/u;", "LNo;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$j */
    /* loaded from: classes4.dex */
    public static final class C3804j extends Lambda implements Function1<String, InterfaceC24574u<? extends C5698No>> {
        public C3804j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends C5698No> invoke(String assetId) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            return C33667Iu2.this.f16410c.mo94797a(assetId).m32056T(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LNo;", "kotlin.jvm.PlatformType", "", "existingAssets", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$loadAssets$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n1549#2:329\n1620#2,3:330\n766#2:333\n857#2,2:334\n1549#2:336\n1620#2,3:337\n37#3,2:340\n*S KotlinDebug\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$loadAssets$2\n*L\n106#1:329\n106#1:330,3\n108#1:333\n108#1:334,2\n109#1:336\n109#1:337,3\n116#1:340,2\n*E\n"})
    /* renamed from: Iu2$k */
    /* loaded from: classes4.dex */
    public static final class C3805k extends Lambda implements Function1<List<C5698No>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<String> f16428g;

        /* renamed from: h */
        public final /* synthetic */ C33667Iu2 f16429h;

        /* renamed from: i */
        public final /* synthetic */ AssetManagerType f16430i;

        /* renamed from: j */
        public final /* synthetic */ TaskPriority f16431j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3805k(List<String> list, C33667Iu2 c33667Iu2, AssetManagerType assetManagerType, TaskPriority taskPriority) {
            super(1);
            this.f16428g = list;
            this.f16429h = c33667Iu2;
            this.f16430i = assetManagerType;
            this.f16431j = taskPriority;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<C5698No> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C5698No> existingAssets) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Intrinsics.checkNotNullExpressionValue(existingAssets, "existingAssets");
            List<C5698No> list = existingAssets;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (C5698No c5698No : list) {
                arrayList.add(c5698No.m93390g());
            }
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : this.f16428g) {
                if (!arrayList.contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            AssetManagerType assetManagerType = this.f16430i;
            TaskPriority taskPriority = this.f16431j;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (String str : arrayList2) {
                arrayList3.add(new AssetTask(str, assetManagerType, taskPriority, new DateTime(), null, 16, null));
            }
            C33667Iu2 c33667Iu2 = this.f16429h;
            AssetTask[] assetTaskArr = (AssetTask[]) arrayList3.toArray(new AssetTask[0]);
            c33667Iu2.m101530N((AssetTask[]) Arrays.copyOf(assetTaskArr, assetTaskArr.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LNo;", "kotlin.jvm.PlatformType", "", AssetTaskKt.ASSET_PATH, "Lio/reactivex/h;", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$loadAssets$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n1549#2:329\n1620#2,3:330\n819#2:333\n847#2,2:334\n766#2:336\n857#2,2:337\n1549#2:339\n1620#2,3:340\n1549#2:343\n1620#2,3:344\n1549#2:350\n1620#2,3:351\n1#3:347\n37#4,2:348\n37#4,2:354\n*S KotlinDebug\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImpl$loadAssets$3\n*L\n119#1:329\n119#1:330,3\n120#1:333\n120#1:334,2\n125#1:336\n125#1:337,2\n126#1:339\n126#1:340,3\n127#1:343\n127#1:344,3\n133#1:350\n133#1:351,3\n128#1:348,2\n135#1:354,2\n*E\n"})
    /* renamed from: Iu2$l */
    /* loaded from: classes4.dex */
    public static final class C3806l extends Lambda implements Function1<List<C5698No>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ List<String> f16432g;

        /* renamed from: h */
        public final /* synthetic */ DateTime f16433h;

        /* renamed from: i */
        public final /* synthetic */ AssetManagerType f16434i;

        /* renamed from: j */
        public final /* synthetic */ C33667Iu2 f16435j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3806l(List<String> list, DateTime dateTime, AssetManagerType assetManagerType, C33667Iu2 c33667Iu2) {
            super(1);
            this.f16432g = list;
            this.f16433h = dateTime;
            this.f16434i = assetManagerType;
            this.f16435j = c33667Iu2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<C5698No> assets) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List list;
            C5698No m96209a;
            int collectionSizeOrDefault3;
            int collectionSizeOrDefault4;
            List plus;
            C5698No m96209a2;
            C5698No m93396a;
            boolean z;
            Intrinsics.checkNotNullParameter(assets, "assets");
            List<C5698No> list2 = assets;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (C5698No c5698No : list2) {
                arrayList.add(c5698No.m93390g());
            }
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : this.f16432g) {
                if (!arrayList.contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            DateTime dateTime = this.f16433h;
            if (dateTime != null) {
                ArrayList<C5698No> arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    DateTime m93388i = ((C5698No) obj2).m93388i();
                    if (m93388i != null && !m93388i.isBefore(dateTime)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        arrayList3.add(obj2);
                    }
                }
                DateTime dateTime2 = this.f16433h;
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
                for (C5698No asset : arrayList3) {
                    Intrinsics.checkNotNullExpressionValue(asset, "asset");
                    m93396a = asset.m93396a((r20 & 1) != 0 ? asset.f25198a : null, (r20 & 2) != 0 ? asset.f25199b : null, (r20 & 4) != 0 ? asset.f25200c : null, (r20 & 8) != 0 ? asset.f25201d : null, (r20 & 16) != 0 ? asset.f25202e : null, (r20 & 32) != 0 ? asset.f25203f : null, (r20 & 64) != 0 ? asset.f25204g : null, (r20 & 128) != 0 ? asset.f25205h : dateTime2, (r20 & 256) != 0 ? asset.f25206i : null);
                    arrayList4.add(m93396a);
                }
                AssetManagerType assetManagerType = this.f16434i;
                DateTime dateTime3 = this.f16433h;
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault4);
                for (String str : arrayList2) {
                    m96209a2 = C34369Lu2.m96209a(str, assetManagerType, (r13 & 2) != 0 ? null : dateTime3, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null, (r13 & 32) == 0 ? null : null);
                    arrayList5.add(m96209a2);
                }
                plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5);
                AbstractC5089Lo abstractC5089Lo = this.f16435j.f16410c;
                C5698No[] c5698NoArr = (C5698No[]) plus.toArray(new C5698No[0]);
                return abstractC5089Lo.mo94795c((C5698No[]) Arrays.copyOf(c5698NoArr, c5698NoArr.length)).m33063X(C24542a.m31932c());
            } else if (!arrayList2.isEmpty()) {
                AssetManagerType assetManagerType2 = this.f16434i;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault2);
                for (String str2 : arrayList2) {
                    m96209a = C34369Lu2.m96209a(str2, assetManagerType2, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null, (r13 & 32) == 0 ? null : null);
                    arrayList6.add(m96209a);
                }
                list = CollectionsKt___CollectionsKt.toList(arrayList6);
                AbstractC5089Lo abstractC5089Lo2 = this.f16435j.f16410c;
                C5698No[] c5698NoArr2 = (C5698No[]) list.toArray(new C5698No[0]);
                return abstractC5089Lo2.mo94795c((C5698No[]) Arrays.copyOf(c5698NoArr2, c5698NoArr2.length)).m33063X(C24542a.m31932c());
            } else {
                return AbstractC23461c.m33039p();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/WireSignedUrl;", "response", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$m */
    /* loaded from: classes4.dex */
    public static final class C3807m extends Lambda implements Function1<HM4<WireSignedUrl>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ LocalAsset f16436g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3807m(LocalAsset localAsset) {
            super(1);
            this.f16436g = localAsset;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(HM4<WireSignedUrl> response) {
            String str;
            boolean z;
            WireAsset asset;
            Intrinsics.checkNotNullParameter(response, "response");
            WireSignedUrl m103944a = response.m103944a();
            String str2 = null;
            if (m103944a != null) {
                str = m103944a.getUrl();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, this.f16436g.getDownloadUrl())) {
                EnumC2939Gm.C2940a c2940a = EnumC2939Gm.f12396c;
                WireSignedUrl m103944a2 = response.m103944a();
                if (m103944a2 != null && (asset = m103944a2.getAsset()) != null) {
                    str2 = asset.getMediaType();
                }
                if (c2940a.m104775a(str2) == EnumC2939Gm.ARCHIVE) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/Observable;", "", "Lco/bird/android/model/AssetTask;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$n */
    /* loaded from: classes4.dex */
    public static final class C3808n extends Lambda implements Function0<Observable<List<? extends AssetTask>>> {
        public C3808n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<List<AssetTask>> invoke() {
            return C33667Iu2.this.f16414g.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LNo;", "asset", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LNo;)LNo;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$o */
    /* loaded from: classes4.dex */
    public static final class C3809o extends Lambda implements Function1<C5698No, C5698No> {

        /* renamed from: g */
        public final /* synthetic */ AssetManagerType f16438g;

        /* renamed from: h */
        public final /* synthetic */ long f16439h;

        /* renamed from: i */
        public final /* synthetic */ String f16440i;

        /* renamed from: j */
        public final /* synthetic */ String f16441j;

        /* renamed from: k */
        public final /* synthetic */ String f16442k;

        /* renamed from: l */
        public final /* synthetic */ DateTime f16443l;

        /* renamed from: m */
        public final /* synthetic */ DateTime f16444m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3809o(AssetManagerType assetManagerType, long j, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2) {
            super(1);
            this.f16438g = assetManagerType;
            this.f16439h = j;
            this.f16440i = str;
            this.f16441j = str2;
            this.f16442k = str3;
            this.f16443l = dateTime;
            this.f16444m = dateTime2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C5698No invoke(C5698No asset) {
            Long m93391f;
            C5698No m93396a;
            Intrinsics.checkNotNullParameter(asset, "asset");
            AssetManagerType assetManagerType = this.f16438g;
            if (assetManagerType == null) {
                assetManagerType = asset.m93389h();
            }
            AssetManagerType assetManagerType2 = assetManagerType;
            long j = this.f16439h;
            if (j > 0) {
                m93391f = Long.valueOf(j);
            } else {
                m93391f = asset.m93391f();
            }
            Long l = m93391f;
            String str = this.f16440i;
            if (str == null) {
                str = asset.m93387j();
            }
            String str2 = str;
            String str3 = this.f16441j;
            if (str3 == null) {
                str3 = asset.m93392e();
            }
            String str4 = str3;
            String str5 = this.f16442k;
            if (str5 == null) {
                str5 = asset.m93395b();
            }
            String str6 = str5;
            DateTime dateTime = this.f16443l;
            if (dateTime == null) {
                dateTime = asset.m93393d();
            }
            DateTime dateTime2 = dateTime;
            DateTime dateTime3 = this.f16444m;
            if (dateTime3 == null) {
                dateTime3 = asset.m93388i();
            }
            m93396a = asset.m93396a((r20 & 1) != 0 ? asset.f25198a : null, (r20 & 2) != 0 ? asset.f25199b : assetManagerType2, (r20 & 4) != 0 ? asset.f25200c : l, (r20 & 8) != 0 ? asset.f25201d : str2, (r20 & 16) != 0 ? asset.f25202e : str4, (r20 & 32) != 0 ? asset.f25203f : str6, (r20 & 64) != 0 ? asset.f25204g : dateTime2, (r20 & 128) != 0 ? asset.f25205h : dateTime3, (r20 & 256) != 0 ? asset.f25206i : null);
            return m93396a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LNo;", "asset", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LNo;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$p */
    /* loaded from: classes4.dex */
    public static final class C3810p extends Lambda implements Function1<C5698No, InterfaceC23496h> {
        public C3810p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C5698No asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            return C33667Iu2.this.f16410c.mo94795c(asset);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireSignedUrl;", "wireSignedUrl", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/WireSignedUrl;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Iu2$q */
    /* loaded from: classes4.dex */
    public static final class C3811q extends Lambda implements Function1<WireSignedUrl, InterfaceC23447K<? extends WireSignedUrl>> {

        /* renamed from: h */
        public final /* synthetic */ File f16447h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3811q(File file) {
            super(1);
            this.f16447h = file;
        }

        /* renamed from: c */
        public static final WireSignedUrl m101490c(WireSignedUrl wireSignedUrl) {
            Intrinsics.checkNotNullParameter(wireSignedUrl, "$wireSignedUrl");
            return wireSignedUrl;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WireSignedUrl> invoke(final WireSignedUrl wireSignedUrl) {
            Intrinsics.checkNotNullParameter(wireSignedUrl, "wireSignedUrl");
            return InterfaceC41671gg5.C22409a.upload$default(C33667Iu2.this.f16409b, wireSignedUrl.getUrl(), this.f16447h, null, 4, null).m33048i0(new Callable() { // from class: Ku2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    WireSignedUrl m101490c;
                    m101490c = C33667Iu2.C3811q.m101490c(WireSignedUrl.this);
                    return m101490c;
                }
            });
        }
    }

    public C33667Iu2(Context applicationContext, InterfaceC41671gg5 s3Manager, AbstractC5089Lo assetDao, InterfaceC9184Wo assetRepairManager, InterfaceC6909Qo webArchiveAssetManager) {
        Lazy lazy;
        List emptyList;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(s3Manager, "s3Manager");
        Intrinsics.checkNotNullParameter(assetDao, "assetDao");
        Intrinsics.checkNotNullParameter(assetRepairManager, "assetRepairManager");
        Intrinsics.checkNotNullParameter(webArchiveAssetManager, "webArchiveAssetManager");
        this.f16408a = applicationContext;
        this.f16409b = s3Manager;
        this.f16410c = assetDao;
        this.f16411d = assetRepairManager;
        this.f16412e = webArchiveAssetManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C3808n());
        this.f16413f = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f16414g = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        C24558d<LocalAsset> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<LocalAsset>()");
        this.f16415h = m31902e;
    }

    /* renamed from: A */
    public static final void m101543A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final Pair m101541C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC24574u m101540D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC24574u m101539E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m101538F(String assetId, AssetManagerType manager, TaskPriority priority, C33667Iu2 this$0) {
        C5698No m96209a;
        Intrinsics.checkNotNullParameter(assetId, "$assetId");
        Intrinsics.checkNotNullParameter(manager, "$manager");
        Intrinsics.checkNotNullParameter(priority, "$priority");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m96209a = C34369Lu2.m96209a(assetId, manager, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null, (r13 & 32) == 0 ? null : null);
        this$0.f16410c.mo94795c(m96209a).m33063X(C24542a.m31932c()).subscribe();
        this$0.m101530N(new AssetTask(assetId, manager, priority, new DateTime(), null, 16, null));
    }

    /* renamed from: G */
    public static final boolean m101537G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H */
    public static final InterfaceC24574u m101536H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m101535I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23496h m101534J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final Boolean m101531M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23496h m101529O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final C5698No m101528P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C5698No) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23447K m101527Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC24574u m101511y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m101510z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final AbstractC23442F<Pair<List<EnumC3794a>, WireSignedUrl>> m101542B(AssetManagerType assetManagerType, String str) {
        List emptyList;
        if (C3795b.$EnumSwitchMapping$0[assetManagerType.ordinal()] == 2) {
            AbstractC23442F<HM4<WireSignedUrl>> mo4278a = m101533K(assetManagerType).mo4278a(str);
            final C3799f c3799f = C3799f.f16420g;
            AbstractC23442F m33157I = mo4278a.m33157I(new InterfaceC23492o() { // from class: Gu2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m101541C;
                    m101541C = C33667Iu2.m101541C(Function1.this, obj);
                    return m101541C;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "managerType.manager().ge…  }\n          }\n        }");
            return m33157I;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC23442F<Pair<List<EnumC3794a>, WireSignedUrl>> m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(emptyList, null));
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(emptyList<AssetOverride>() to null)");
        return m33158H;
    }

    /* renamed from: K */
    public final InterfaceC6909Qo m101533K(AssetManagerType assetManagerType) {
        int i = C3795b.$EnumSwitchMapping$0[assetManagerType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f16412e;
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.f16411d;
    }

    /* renamed from: L */
    public final AbstractC23442F<Boolean> m101532L(LocalAsset localAsset) {
        if (C3795b.$EnumSwitchMapping$0[localAsset.getManager().ordinal()] == 2) {
            AbstractC23442F<HM4<WireSignedUrl>> mo4278a = m101533K(localAsset.getManager()).mo4278a(localAsset.getId());
            final C3807m c3807m = new C3807m(localAsset);
            AbstractC23442F<Boolean> m33148R = mo4278a.m33157I(new InterfaceC23492o() { // from class: Cu2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m101531M;
                    m101531M = C33667Iu2.m101531M(Function1.this, obj);
                    return m101531M;
                }
            }).m33148R(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(m33148R, "task: LocalAsset): Singl….onErrorReturnItem(false)");
            return m33148R;
        }
        AbstractC23442F<Boolean> m33158H = AbstractC23442F.m33158H(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(false)");
        return m33158H;
    }

    /* renamed from: N */
    public final void m101530N(AssetTask... assetTaskArr) {
        List<AssetTask> list;
        C37791a94<List<AssetTask>> c37791a94 = this.f16414g;
        list = ArraysKt___ArraysKt.toList(assetTaskArr);
        c37791a94.accept(list);
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: a */
    public AbstractC23442F<LocalAsset> mo13534a(final String assetId, final AssetManagerType manager, final TaskPriority priority) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(priority, "priority");
        AbstractC24507p<C5698No> mo94797a = this.f16410c.mo94797a(assetId);
        AbstractC23442F<Pair<List<EnumC3794a>, WireSignedUrl>> m33142Y = m101542B(manager, assetId).m33142Y(C24542a.m31932c());
        final C3800g c3800g = new C3800g(assetId, manager, this);
        AbstractC24507p<C5698No> m32056T = mo94797a.m32054V(m33142Y.m33163C(new InterfaceC23492o() { // from class: tu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m101540D;
                m101540D = C33667Iu2.m101540D(Function1.this, obj);
                return m101540D;
            }
        })).m32056T(C24542a.m31932c());
        final C3801h c3801h = new C3801h();
        AbstractC24507p m32031n = m32056T.m32021x(new InterfaceC23492o() { // from class: zu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m101539E;
                m101539E = C33667Iu2.m101539E(Function1.this, obj);
                return m101539E;
            }
        }).m32031n(new InterfaceC23478a() { // from class: Au2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C33667Iu2.m101538F(assetId, manager, priority, this);
            }
        });
        C24558d<LocalAsset> c24558d = this.f16415h;
        final C3803i c3803i = new C3803i(assetId);
        AbstractC23442F<LocalAsset> m32053W = m32031n.m32053W(c24558d.filter(new InterfaceC23494q() { // from class: Bu2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m101537G;
                m101537G = C33667Iu2.m101537G(Function1.this, obj);
                return m101537G;
            }
        }).firstOrError());
        Intrinsics.checkNotNullExpressionValue(m32053W, "override fun loadAsset(a…irstOrError()\n      )\n  }");
        return m32053W;
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: b */
    public Observable<List<AssetTask>> mo13533b() {
        Object value = this.f16413f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-tasks>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: c */
    public AbstractC23461c mo13532c(List<String> assetIds, AssetManagerType manager, TaskPriority priority, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Observable fromIterable = Observable.fromIterable(assetIds);
        final C3804j c3804j = new C3804j();
        AbstractC23442F list = fromIterable.flatMapMaybe(new InterfaceC23492o() { // from class: Du2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m101536H;
                m101536H = C33667Iu2.m101536H(Function1.this, obj);
                return m101536H;
            }
        }).toList();
        final C3805k c3805k = new C3805k(assetIds, this, manager, priority);
        AbstractC23442F m33101w = list.m33101w(new InterfaceC23484g() { // from class: Eu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33667Iu2.m101535I(Function1.this, obj);
            }
        });
        final C3806l c3806l = new C3806l(assetIds, dateTime, manager, this);
        AbstractC23461c m33164B = m33101w.m33164B(new InterfaceC23492o() { // from class: Fu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m101534J;
                m101534J = C33667Iu2.m101534J(Function1.this, obj);
                return m101534J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun loadAssets(…e()\n        }\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: d */
    public AbstractC23442F<HM4<WireSignedUrl>> mo13531d(AssetTask task) {
        Intrinsics.checkNotNullParameter(task, "task");
        int i = C3795b.$EnumSwitchMapping$0[task.getManager().ordinal()];
        if (i != 1 && i != 2) {
            AssetManagerType manager = task.getManager();
            String assetId = task.getAssetId();
            throw new UnsupportedOperationException("Unknown manager: " + manager + ". Cannot retrieve AssetResponse for this Asset: " + assetId);
        }
        return m101533K(task.getManager()).mo4278a(task.getAssetId());
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: e */
    public AbstractC23461c mo13530e(String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        AbstractC24507p<C5698No> m32056T = this.f16410c.mo94797a(assetId).m32056T(C24542a.m31932c());
        final C3796c c3796c = C3796c.f16418g;
        AbstractC24507p<R> m32021x = m32056T.m32021x(new InterfaceC23492o() { // from class: vu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m101511y;
                m101511y = C33667Iu2.m101511y(Function1.this, obj);
                return m101511y;
            }
        });
        final C3797d c3797d = new C3797d();
        AbstractC24507p m32026s = m32021x.m32026s(new InterfaceC23484g() { // from class: wu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33667Iu2.m101510z(Function1.this, obj);
            }
        });
        final C3798e c3798e = new C3798e(this.f16415h);
        AbstractC23461c m32069F = m32026s.m32026s(new InterfaceC23484g() { // from class: xu2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33667Iu2.m101543A(Function1.this, obj);
            }
        }).m32069F();
        Intrinsics.checkNotNullExpressionValue(m32069F, "override fun assetReady(…     .ignoreElement()\n  }");
        return m32069F;
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: f */
    public AbstractC23442F<HM4<ResponseBody>> mo13529f(String dynamicUrl) {
        Intrinsics.checkNotNullParameter(dynamicUrl, "dynamicUrl");
        AbstractC23442F<HM4<ResponseBody>> m33142Y = this.f16409b.mo30121a(dynamicUrl).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "s3Manager.download(dynam…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: g */
    public AbstractC23442F<DateTime> mo13528g(AssetManagerType manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        AbstractC23442F<DateTime> m33142Y = this.f16410c.mo94796b(manager).m32053W(AbstractC23442F.m33158H(new DateTime(0L))).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "assetDao.getLastDownload…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: h */
    public AbstractC23461c mo13527h(String id, AssetManagerType assetManagerType, long j, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        AbstractC24507p<C5698No> m32056T = this.f16410c.mo94797a(id).m32056T(C24542a.m31932c());
        final C3809o c3809o = new C3809o(assetManagerType, j, str, str2, str3, dateTime, dateTime2);
        AbstractC24507p<R> m32067H = m32056T.m32067H(new InterfaceC23492o() { // from class: Hu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C5698No m101528P;
                m101528P = C33667Iu2.m101528P(Function1.this, obj);
                return m101528P;
            }
        });
        final C3810p c3810p = new C3810p();
        AbstractC23461c m32074A = m32067H.m32074A(new InterfaceC23492o() { // from class: uu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m101529O;
                m101529O = C33667Iu2.m101529O(Function1.this, obj);
                return m101529O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "override fun updateAsset…insertAssets(asset) }\n  }");
        return m32074A;
    }

    @Override // p000.InterfaceC48923su2
    /* renamed from: i */
    public AbstractC23442F<WireSignedUrl> mo13526i(File file, AssetManagerType manager) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(manager, "manager");
        AbstractC23442F m33142Y = C38096ag5.m70883l(m101533K(manager).createAsset(file)).m33142Y(C24542a.m31932c());
        final C3811q c3811q = new C3811q(file);
        AbstractC23442F<WireSignedUrl> m33165A = m33142Y.m33165A(new InterfaceC23492o() { // from class: yu2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m101527Q;
                m101527Q = C33667Iu2.m101527Q(Function1.this, obj);
                return m101527Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun uploadAsset…reSignedUrl }\n      }\n  }");
        return m33165A;
    }
}
