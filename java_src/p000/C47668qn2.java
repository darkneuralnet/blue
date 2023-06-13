package p000;

import androidx.recyclerview.widget.C11925l;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"LGn2;", TransferTable.COLUMN_STATE, "Lkotlin/Function1;", "LBn2;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lon2;", C17296a.f69688o, "(LGn2;Lkotlin/jvm/functions/Function1;LEt0;I)Lon2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n36#2:121\n36#2:128\n1114#3,6:122\n1114#3,6:129\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n47#1:121\n54#1:128\n47#1:122,6\n54#1:129,6\n*E\n"})
/* renamed from: qn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47668qn2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qn2$a */
    /* loaded from: classes.dex */
    public static final class C27684a implements InterfaceC46482on2, InterfaceC35710Rn2 {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC35710Rn2 f105789a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC48627sP5<InterfaceC46482on2> f105790b;

        /* JADX WARN: Multi-variable type inference failed */
        public C27684a(InterfaceC48627sP5<? extends InterfaceC46482on2> interfaceC48627sP5) {
            this.f105790b = interfaceC48627sP5;
            this.f105789a = C35944Sn2.m84829a(interfaceC48627sP5);
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: a */
        public Object mo15371a(int i) {
            return this.f105789a.mo15371a(i);
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: b */
        public Map<Object, Integer> mo15370b() {
            return this.f105789a.mo15370b();
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: c */
        public Object mo15369c(int i) {
            return this.f105789a.mo15369c(i);
        }

        @Override // p000.InterfaceC46482on2
        /* renamed from: d */
        public boolean mo17076d() {
            return this.f105790b.getValue().mo17076d();
        }

        @Override // p000.InterfaceC35710Rn2
        /* renamed from: f */
        public void mo15367f(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
            interfaceC32720Et0.mo89638F(125380152);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(125380152, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider.<anonymous>.<no name provided>.Item (LazyGridItemProvider.kt:-1)");
            }
            this.f105789a.mo15367f(i, interfaceC32720Et0, i2 & 14);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
        }

        @Override // p000.InterfaceC46482on2
        /* renamed from: g */
        public long mo17075g(InterfaceC49446tn2 getSpan, int i) {
            Intrinsics.checkNotNullParameter(getSpan, "$this$getSpan");
            return this.f105790b.getValue().mo17075g(getSpan, i);
        }

        @Override // p000.InterfaceC35710Rn2
        public int getItemCount() {
            return this.f105789a.getItemCount();
        }

        @Override // p000.InterfaceC46482on2
        /* renamed from: i */
        public C32902Fn2 mo17074i() {
            return this.f105790b.getValue().mo17074i();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qn2$b */
    /* loaded from: classes.dex */
    public static final class C27685b extends Lambda implements Function0<C47075pn2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48627sP5<Function1<InterfaceC31966Bn2, Unit>> f105791g;

        /* renamed from: h */
        public final /* synthetic */ C33136Gn2 f105792h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC48627sP5<IntRange> f105793i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27685b(InterfaceC48627sP5<? extends Function1<? super InterfaceC31966Bn2, Unit>> interfaceC48627sP5, C33136Gn2 c33136Gn2, InterfaceC48627sP5<IntRange> interfaceC48627sP52) {
            super(0);
            this.f105791g = interfaceC48627sP5;
            this.f105792h = c33136Gn2;
            this.f105793i = interfaceC48627sP52;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C47075pn2 invoke() {
            C32200Cn2 c32200Cn2 = new C32200Cn2();
            this.f105791g.getValue().invoke(c32200Cn2);
            return new C47075pn2(c32200Cn2.m111688e(), c32200Cn2.m111689d(), this.f105792h, this.f105793i.getValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qn2$c */
    /* loaded from: classes.dex */
    public static final class C27686c extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public final /* synthetic */ C33136Gn2 f105794g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27686c(C33136Gn2 c33136Gn2) {
            super(0);
            this.f105794g = c33136Gn2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f105794g.m104738m());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qn2$d */
    /* loaded from: classes.dex */
    public static final class C27687d extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public static final C27687d f105795g = new C27687d();

        public C27687d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 90;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: qn2$e */
    /* loaded from: classes.dex */
    public static final class C27688e extends Lambda implements Function0<Integer> {

        /* renamed from: g */
        public static final C27688e f105796g = new C27688e();

        public C27688e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf((int) C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
        }
    }

    /* renamed from: a */
    public static final InterfaceC46482on2 m17077a(C33136Gn2 state, Function1<? super InterfaceC31966Bn2, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        interfaceC32720Et0.mo89638F(1831211759);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1831211759, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProvider (LazyGridItemProvider.kt:40)");
        }
        InterfaceC48627sP5 m105193n = GM5.m105193n(content, interfaceC32720Et0, (i >> 3) & 14);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(state);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C27686c(state);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC48627sP5<IntRange> m101701c = C33613Io2.m101701c((Function0) mo89635G, C27687d.f105795g, C27688e.f105796g, interfaceC32720Et0, 432);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(m101701c);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C27684a(GM5.m105204c(new C27685b(m105193n, state, m101701c)));
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        C27684a c27684a = (C27684a) mo89635G2;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c27684a;
    }
}
