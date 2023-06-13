package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44791lw0;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J2\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&J(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00112\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&J/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0013\"\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\tH&JI\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000b0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0016JK\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&¨\u0006'"}, m28432d2 = {"Llw0;", "", "Lio/reactivex/c;", "g", "", "seconds", "k0", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "birdModel", "", "filterSeen", "Lio/reactivex/F;", "", "Lco/bird/android/model/persistence/Tutorial;", "i0", "Lio/reactivex/p;", "m0", "", "tutorialIds", "l0", "([Ljava/lang/String;)Lio/reactivex/F;", "tutorialId", "B", "Lkotlin/Function1;", "action", "j0", "(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "n0", "Le13;", "navigator", "tutorialContext", RequestHeadersFactory.MODEL, "", "requestCode", "keepUnseen", "o0", "(Le13;Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;ZLjava/lang/Integer;Z)Z", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lw0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC44791lw0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lw0$a */
    /* loaded from: classes2.dex */
    public static final class C25816a {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "tutorials", "", "Lco/bird/android/model/persistence/Tutorial;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nConfigurableTutorialManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialManager.kt\nco/bird/android/coreinterface/manager/ConfigurableTutorialManager$maybeGoToConfigurableTutorials$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1549#2:93\n1620#2,3:94\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialManager.kt\nco/bird/android/coreinterface/manager/ConfigurableTutorialManager$maybeGoToConfigurableTutorials$1\n*L\n84#1:93\n84#1:94,3\n*E\n"})
        /* renamed from: lw0$a$a */
        /* loaded from: classes2.dex */
        public static final class C25817a extends Lambda implements Function1<List<? extends Tutorial>, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC40099e13 f96969g;

            /* renamed from: h */
            public final /* synthetic */ Integer f96970h;

            /* renamed from: i */
            public final /* synthetic */ boolean f96971i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25817a(InterfaceC40099e13 interfaceC40099e13, Integer num, boolean z) {
                super(1);
                this.f96969g = interfaceC40099e13;
                this.f96970h = num;
                this.f96971i = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(List<? extends Tutorial> list) {
                return invoke2((List<Tutorial>) list);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(List<Tutorial> tutorials) {
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(tutorials, "tutorials");
                InterfaceC40099e13 interfaceC40099e13 = this.f96969g;
                List<Tutorial> list = tutorials;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Tutorial tutorial : list) {
                    arrayList.add(tutorial.getId());
                }
                interfaceC40099e13.mo37168G(arrayList, this.f96970h, this.f96971i);
                return Boolean.TRUE;
            }
        }

        /* renamed from: b */
        public static AbstractC23461c m26665b(InterfaceC44791lw0 interfaceC44791lw0, long j) {
            AbstractC23461c m33069Q = interfaceC44791lw0.mo20267g().m33061Z(j, TimeUnit.SECONDS).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "fetchTutorials().timeout…ECONDS).onErrorComplete()");
            return m33069Q;
        }

        /* renamed from: c */
        public static boolean m26664c(InterfaceC44791lw0 interfaceC44791lw0, InterfaceC40099e13 navigator, ConfigurableTutorialContext tutorialContext, String str, boolean z, Integer num, boolean z2) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(tutorialContext, "tutorialContext");
            return Intrinsics.areEqual(interfaceC44791lw0.mo20265j0(tutorialContext, str, z, new C25817a(navigator, num, z2)), Boolean.TRUE);
        }

        /* renamed from: d */
        public static Boolean m26663d(InterfaceC44791lw0 interfaceC44791lw0, ConfigurableTutorialContext context, String str, boolean z, Function1<? super List<Tutorial>, Boolean> action) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            List<Tutorial> tutorials = interfaceC44791lw0.mo20261n0(context, str, z).m33132g();
            Intrinsics.checkNotNullExpressionValue(tutorials, "tutorials");
            if (!tutorials.isEmpty()) {
                return action.invoke(tutorials);
            }
            return null;
        }

        /* renamed from: e */
        public static AbstractC23442F<List<Tutorial>> m26662e(final InterfaceC44791lw0 interfaceC44791lw0, final ConfigurableTutorialContext context, final String str, final boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC23442F<List<Tutorial>> m33042m = interfaceC44791lw0.mo20264k0(5L).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: kw0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m26661f;
                    m26661f = InterfaceC44791lw0.C25816a.m26661f(InterfaceC44791lw0.this, context, str, z);
                    return m26661f;
                }
            }));
            Intrinsics.checkNotNullExpressionValue(m33042m, "fetchTutorialsOrTimeoutS…ilterSeen,\n      )\n    })");
            return m33042m;
        }

        /* renamed from: f */
        public static InterfaceC23447K m26661f(InterfaceC44791lw0 this$0, ConfigurableTutorialContext context, String str, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "$context");
            return this$0.mo20266i0(context, str, z);
        }

        public static /* synthetic */ AbstractC24507p getTutorialIdsByContext$default(InterfaceC44791lw0 interfaceC44791lw0, ConfigurableTutorialContext configurableTutorialContext, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return interfaceC44791lw0.mo20262m0(configurableTutorialContext, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTutorialIdsByContext");
        }

        public static /* synthetic */ AbstractC23442F getTutorialsByContext$default(InterfaceC44791lw0 interfaceC44791lw0, ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return interfaceC44791lw0.mo20266i0(configurableTutorialContext, str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTutorialsByContext");
        }

        public static /* synthetic */ boolean maybeGoToConfigurableTutorials$default(InterfaceC44791lw0 interfaceC44791lw0, InterfaceC40099e13 interfaceC40099e13, ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, Integer num, boolean z2, int i, Object obj) {
            if (obj == null) {
                return interfaceC44791lw0.mo20260o0(interfaceC40099e13, configurableTutorialContext, (i & 4) != 0 ? null : str, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : num, (i & 32) != 0 ? true : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: maybeGoToConfigurableTutorials");
        }

        public static /* synthetic */ Boolean performActionForTutorials$default(InterfaceC44791lw0 interfaceC44791lw0, ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return interfaceC44791lw0.mo20265j0(configurableTutorialContext, str, z, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performActionForTutorials");
        }

        public static /* synthetic */ AbstractC23442F refreshTutorialsAndGetByContext$default(InterfaceC44791lw0 interfaceC44791lw0, ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return interfaceC44791lw0.mo20261n0(configurableTutorialContext, str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshTutorialsAndGetByContext");
        }
    }

    /* renamed from: B */
    AbstractC23461c mo20272B(String str);

    /* renamed from: g */
    AbstractC23461c mo20267g();

    /* renamed from: i0 */
    AbstractC23442F<List<Tutorial>> mo20266i0(ConfigurableTutorialContext configurableTutorialContext, String str, boolean z);

    /* renamed from: j0 */
    Boolean mo20265j0(ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, Function1<? super List<Tutorial>, Boolean> function1);

    /* renamed from: k0 */
    AbstractC23461c mo20264k0(long j);

    /* renamed from: l0 */
    AbstractC23442F<List<Tutorial>> mo20263l0(String... strArr);

    /* renamed from: m0 */
    AbstractC24507p<List<String>> mo20262m0(ConfigurableTutorialContext configurableTutorialContext, String str);

    /* renamed from: n0 */
    AbstractC23442F<List<Tutorial>> mo20261n0(ConfigurableTutorialContext configurableTutorialContext, String str, boolean z);

    /* renamed from: o0 */
    boolean mo20260o0(InterfaceC40099e13 interfaceC40099e13, ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, Integer num, boolean z2);
}
