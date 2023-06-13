package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44791lw0;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0010\"\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Low0;", "Llw0;", "Lio/reactivex/c;", "g", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "birdModel", "", "filterSeen", "Lio/reactivex/F;", "", "Lco/bird/android/model/persistence/Tutorial;", "i0", "Lio/reactivex/p;", "m0", "", "tutorialIds", "l0", "([Ljava/lang/String;)Lio/reactivex/F;", "tutorialId", "B", "LGw0;", C17296a.f69688o, "LGw0;", "repo", "<init>", "(LGw0;)V", "configurable-tutorial_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ow0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46570ow0 implements InterfaceC44791lw0 {

    /* renamed from: a */
    public final InterfaceC33215Gw0 f102785a;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Tutorial;", "tutorials", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialManagerImpl.kt\nco/bird/android/manager/configurabletutorial/ConfigurableTutorialManagerImpl$getTutorialIdsByContext$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialManagerImpl.kt\nco/bird/android/manager/configurabletutorial/ConfigurableTutorialManagerImpl$getTutorialIdsByContext$1\n*L\n33#1:51\n33#1:52,3\n*E\n"})
    /* renamed from: ow0$a */
    /* loaded from: classes4.dex */
    public static final class C27105a extends Lambda implements Function1<List<? extends Tutorial>, List<? extends String>> {

        /* renamed from: g */
        public static final C27105a f102786g = new C27105a();

        public C27105a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(List<Tutorial> tutorials) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(tutorials, "tutorials");
            List<Tutorial> list = tutorials;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Tutorial tutorial : list) {
                arrayList.add(tutorial.getId());
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "tutorialIds", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ow0$b */
    /* loaded from: classes4.dex */
    public static final class C27106b extends Lambda implements Function1<List<? extends String>, Boolean> {

        /* renamed from: g */
        public static final C27106b f102787g = new C27106b();

        public C27106b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<String> tutorialIds) {
            Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
            return Boolean.valueOf(!tutorialIds.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends String> list) {
            return invoke2((List<String>) list);
        }
    }

    public C46570ow0(InterfaceC33215Gw0 repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f102785a = repo;
    }

    /* renamed from: c */
    public static final List m20269c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: d */
    public static final boolean m20268d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: B */
    public AbstractC23461c mo20272B(String tutorialId) {
        Intrinsics.checkNotNullParameter(tutorialId, "tutorialId");
        AbstractC23461c m33063X = this.f102785a.mo101472B(tutorialId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.incrementTutorialSe…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: g */
    public AbstractC23461c mo20267g() {
        AbstractC23461c m33063X = this.f102785a.mo101466g().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchTutorials()\n  …scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: i0 */
    public AbstractC23442F<List<Tutorial>> mo20266i0(ConfigurableTutorialContext context, String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC23442F<List<Tutorial>> m33142Y = this.f102785a.mo101465i0(context, str, z).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "repo.getTutorialsByConte…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: j0 */
    public Boolean mo20265j0(ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, Function1<? super List<Tutorial>, Boolean> function1) {
        return InterfaceC44791lw0.C25816a.m26663d(this, configurableTutorialContext, str, z, function1);
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: k0 */
    public AbstractC23461c mo20264k0(long j) {
        return InterfaceC44791lw0.C25816a.m26665b(this, j);
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: l0 */
    public AbstractC23442F<List<Tutorial>> mo20263l0(String... tutorialIds) {
        Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
        AbstractC23442F<List<Tutorial>> m33142Y = this.f102785a.mo101467W0((String[]) Arrays.copyOf(tutorialIds, tutorialIds.length)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "repo.getTutorialsById(*t…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: m0 */
    public AbstractC24507p<List<String>> mo20262m0(ConfigurableTutorialContext context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        AbstractC23442F<List<Tutorial>> mo101465i0 = this.f102785a.mo101465i0(context, str, true);
        final C27105a c27105a = C27105a.f102786g;
        AbstractC23442F<R> m33157I = mo101465i0.m33157I(new InterfaceC23492o() { // from class: mw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m20269c;
                m20269c = C46570ow0.m20269c(Function1.this, obj);
                return m20269c;
            }
        });
        final C27106b c27106b = C27106b.f102787g;
        AbstractC24507p<List<String>> m32056T = m33157I.m33098z(new InterfaceC23494q() { // from class: nw0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m20268d;
                m20268d = C46570ow0.m20268d(Function1.this, obj);
                return m20268d;
            }
        }).m32056T(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m32056T, "repo.getTutorialsByConte…scribeOn(Schedulers.io())");
        return m32056T;
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: n0 */
    public AbstractC23442F<List<Tutorial>> mo20261n0(ConfigurableTutorialContext configurableTutorialContext, String str, boolean z) {
        return InterfaceC44791lw0.C25816a.m26662e(this, configurableTutorialContext, str, z);
    }

    @Override // p000.InterfaceC44791lw0
    /* renamed from: o0 */
    public boolean mo20260o0(InterfaceC40099e13 interfaceC40099e13, ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, Integer num, boolean z2) {
        return InterfaceC44791lw0.C25816a.m26664c(this, interfaceC40099e13, configurableTutorialContext, str, z, num, z2);
    }
}
