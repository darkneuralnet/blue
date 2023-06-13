package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"LCo2;", TransferTable.COLUMN_STATE, "Lkotlin/Function1;", "Lyo2;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lpo2;", C17296a.f69688o, "(LCo2;Lkotlin/jvm/functions/Function1;LEt0;I)Lpo2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n1114#3,6:105\n1114#3,6:113\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:104\n51#1:111\n51#1:112\n46#1:105,6\n51#1:113,6\n*E\n"})
/* renamed from: ro2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48271ro2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ro2$a */
    /* loaded from: classes.dex */
    public static final class C28000a implements InterfaceC47085po2, InterfaceC35710Rn2 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC35710Rn2 f107652a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC48627sP5<C47678qo2> f107653b;

        public C28000a(InterfaceC48627sP5<C47678qo2> interfaceC48627sP5) {
            this.f107653b = interfaceC48627sP5;
            this.f107652a = C35944Sn2.m84829a(interfaceC48627sP5);
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: a */
        public Object mo15371a(int i) {
            return this.f107652a.mo15371a(i);
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: b */
        public Map<Object, Integer> mo15370b() {
            return this.f107652a.mo15370b();
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: c */
        public Object mo15369c(int i) {
            return this.f107652a.mo15369c(i);
        }

        @Override // p000.InterfaceC47085po2
        /* renamed from: e */
        public C34540Mn2 mo15368e() {
            return this.f107653b.getValue().mo15368e();
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: f */
        public void mo15367f(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
            interfaceC32720Et0.mo89638F(-203667997);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-203667997, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider.<anonymous>.<no name provided>.Item (LazyListItemProvider.kt:-1)");
            }
            this.f107652a.mo15367f(i, interfaceC32720Et0, i2 & 14);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
        }

        @Override // p000.InterfaceC35710Rn2
        public int getItemCount() {
            return this.f107652a.getItemCount();
        }

        @Override // p000.InterfaceC47085po2
        /* renamed from: h */
        public List<Integer> mo15366h() {
            return this.f107653b.getValue().mo15366h();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ro2$b */
    /* loaded from: classes.dex */
    public static final class C28001b extends Lambda implements Function0<C47678qo2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<Function1<InterfaceC52420yo2, Unit>> f107654g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<IntRange> f107655h;

        /* renamed from: i */
        public final /* synthetic */ C34540Mn2 f107656i;

        /* renamed from: j */
        public final /* synthetic */ C32209Co2 f107657j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C28001b(InterfaceC48627sP5<? extends Function1<? super InterfaceC52420yo2, Unit>> interfaceC48627sP5, InterfaceC48627sP5<IntRange> interfaceC48627sP52, C34540Mn2 c34540Mn2, C32209Co2 c32209Co2) {
            super(0);
            this.f107654g = interfaceC48627sP5;
            this.f107655h = interfaceC48627sP52;
            this.f107656i = c34540Mn2;
            this.f107657j = c32209Co2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C47678qo2 invoke() {
            C53013zo2 c53013zo2 = new C53013zo2();
            this.f107654g.getValue().invoke(c53013zo2);
            return new C47678qo2(c53013zo2.m407e(), this.f107655h.getValue(), c53013zo2.m408d(), this.f107656i, this.f107657j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ro2$c */
    /* loaded from: classes.dex */
    public static final class C28002c extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public final /* synthetic */ C32209Co2 f107658g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28002c(C32209Co2 c32209Co2) {
            super(0);
            this.f107658g = c32209Co2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f107658g.m111538o());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ro2$d */
    /* loaded from: classes.dex */
    public static final class C28003d extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public static final C28003d f107659g = new C28003d();

        public C28003d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 30;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ro2$e */
    /* loaded from: classes.dex */
    public static final class C28004e extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public static final C28004e f107660g = new C28004e();

        public C28004e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 100;
        }
    }

    /* renamed from: a */
    public static final InterfaceC47085po2 m15372a(C32209Co2 state, Function1<? super InterfaceC52420yo2, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC32720Et0.mo89638F(1939491467);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1939491467, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProvider (LazyListItemProvider.kt:39)");
        }
        InterfaceC48627sP5 m105193n = GM5.m105193n(content, interfaceC32720Et0, (i >> 3) & 14);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(state);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C28002c(state);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC48627sP5<IntRange> m101701c = C33613Io2.m101701c((Function0) mo89635G, C28003d.f107659g, C28004e.f107660g, interfaceC32720Et0, 432);
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(m101701c) | interfaceC32720Et0.mo89539n(state);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C28000a(GM5.m105204c(new C28001b(m105193n, m101701c, new C34540Mn2(), state)));
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        C28000a c28000a = (C28000a) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c28000a;
    }
}
