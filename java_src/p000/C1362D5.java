package p000;

import androidx.activity.result.ActivityResultRegistry;
import com.facebook.share.internal.C17296a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"I", "O", "Lv5;", "contract", "Lkotlin/Function1;", "", "onResult", "LTH2;", C17296a.f69688o, "(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;", "activity-compose_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n25#2:162\n25#2:169\n955#3,6:163\n955#3,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162\n98#1:169\n97#1:163,6\n98#1:170,6\n*E\n"})
/* renamed from: D5 */
/* loaded from: classes.dex */
public final class C1362D5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n108#1:162,5\n*E\n"})
    /* renamed from: D5$a */
    /* loaded from: classes.dex */
    public static final class C1363a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ C0854C5<I> f5188g;

        /* renamed from: h */
        public final /* synthetic */ ActivityResultRegistry f5189h;

        /* renamed from: i */
        public final /* synthetic */ String f5190i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC29414v5<I, O> f5191j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC48627sP5<Function1<O, Unit>> f5192k;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: D5$a$a */
        /* loaded from: classes.dex */
        public static final class C1364a implements InterfaceC28515t5<O> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC48627sP5<Function1<O, Unit>> f5193b;

            /* JADX WARN: Multi-variable type inference failed */
            public C1364a(InterfaceC48627sP5<? extends Function1<? super O, Unit>> interfaceC48627sP5) {
                this.f5193b = interfaceC48627sP5;
            }

            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(O o) {
                ((Function1) this.f5193b.getValue()).invoke(o);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"D5$a$b", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n1#1,483:1\n109#2,2:484\n*E\n"})
        /* renamed from: D5$a$b */
        /* loaded from: classes.dex */
        public static final class C1365b implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ C0854C5 f5194a;

            public C1365b(C0854C5 c0854c5) {
                this.f5194a = c0854c5;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f5194a.m112902c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1363a(C0854C5<I> c0854c5, ActivityResultRegistry activityResultRegistry, String str, AbstractC29414v5<I, O> abstractC29414v5, InterfaceC48627sP5<? extends Function1<? super O, Unit>> interfaceC48627sP5) {
            super(1);
            this.f5188g = c0854c5;
            this.f5189h = activityResultRegistry;
            this.f5190i = str;
            this.f5191j = abstractC29414v5;
            this.f5192k = interfaceC48627sP5;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f5188g.m112903b(this.f5189h.m70473i(this.f5190i, this.f5191j, new C1364a(this.f5192k)));
            return new C1365b(this.f5188g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D5$b */
    /* loaded from: classes.dex */
    public static final class C1366b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1366b f5195g = new C1366b();

        public C1366b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* renamed from: a */
    public static final <I, O> TH2<I, O> m110957a(AbstractC29414v5<I, O> contract, Function1<? super O, Unit> onResult, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        interfaceC32720Et0.mo89638F(-1408504823);
        InterfaceC48627sP5 m105193n = GM5.m105193n(contract, interfaceC32720Et0, 8);
        InterfaceC48627sP5 m105193n2 = GM5.m105193n(onResult, interfaceC32720Et0, (i >> 3) & 14);
        Object m87571b = C35550Qv4.m87571b(new Object[0], null, null, C1366b.f5195g, interfaceC32720Et0, 3080, 6);
        Intrinsics.checkNotNullExpressionValue(m87571b, "rememberSaveable { UUID.randomUUID().toString() }");
        String str = (String) m87571b;
        InterfaceC1735E5 m91207a = C35062Ot2.f27528a.m91207a(interfaceC32720Et0, 6);
        if (m91207a != null) {
            ActivityResultRegistry activityResultRegistry = m91207a.getActivityResultRegistry();
            interfaceC32720Et0.mo89638F(-3687241);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = new C0854C5();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            C0854C5 c0854c5 = (C0854C5) mo89635G;
            interfaceC32720Et0.mo89638F(-3687241);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new TH2(c0854c5, m105193n);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            TH2<I, O> th2 = (TH2) mo89635G2;
            Y91.m75538a(activityResultRegistry, str, contract, new C1363a(c0854c5, activityResultRegistry, str, contract, m105193n2), interfaceC32720Et0, 520);
            interfaceC32720Et0.mo89605Q();
            return th2;
        }
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }
}
