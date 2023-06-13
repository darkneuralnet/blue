package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)JZ\u0010\r\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0019\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ³\u0001\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2#\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u001f\u0010\b\u001a\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\u0002\b\u00072#\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042,\u0010\u0015\u001a(\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0002\b\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"LCn2;", "LBn2;", "", "key", "Lkotlin/Function1;", "Ltn2;", "LdE1;", "Lkotlin/ExtensionFunctionType;", "span", "contentType", "Lrn2;", "", "content", C17296a.f69688o, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Function2;", "itemContent", "b", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "LtX2;", "Lkn2;", "LtX2;", "e", "()LtX2;", "intervals", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "hasCustomSpans", "c", "Lkotlin/jvm/functions/Function2;", "DefaultSpan", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* renamed from: Cn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32200Cn2 implements InterfaceC31966Bn2 {

    /* renamed from: b */
    public boolean f4663b;

    /* renamed from: a */
    public final C49289tX2<C44110kn2> f4662a = new C49289tX2<>();

    /* renamed from: c */
    public final Function2<InterfaceC49446tn2, Integer, C39631dE1> f4664c = C1172a.f4665g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltn2;", "", "it", "LdE1;", "invoke-_-orMbw", "(Ltn2;I)J", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cn2$a */
    /* loaded from: classes.dex */
    public static final class C1172a extends Lambda implements Function2<InterfaceC49446tn2, Integer, C39631dE1> {

        /* renamed from: g */
        public static final C1172a f4665g = new C1172a();

        public C1172a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C39631dE1 invoke(InterfaceC49446tn2 interfaceC49446tn2, Integer num) {
            return C39631dE1.m44518a(m116219invoke_orMbw(interfaceC49446tn2, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw  reason: not valid java name */
        public final long m116219invoke_orMbw(InterfaceC49446tn2 interfaceC49446tn2, int i) {
            Intrinsics.checkNotNullParameter(interfaceC49446tn2, "$this$null");
            return C32668En2.m108361a(1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cn2$b */
    /* loaded from: classes.dex */
    public static final class C1173b extends Lambda implements Function1<Integer, Object> {

        /* renamed from: g */
        public final /* synthetic */ Object f4666g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1173b(Object obj) {
            super(1);
            this.f4666g = obj;
        }

        public final Object invoke(int i) {
            return this.f4666g;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltn2;", "", "it", "LdE1;", "invoke-_-orMbw", "(Ltn2;I)J", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cn2$c */
    /* loaded from: classes.dex */
    public static final class C1174c extends Lambda implements Function2<InterfaceC49446tn2, Integer, C39631dE1> {

        /* renamed from: g */
        public final /* synthetic */ Function1<InterfaceC49446tn2, C39631dE1> f4667g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1174c(Function1<? super InterfaceC49446tn2, C39631dE1> function1) {
            super(2);
            this.f4667g = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C39631dE1 invoke(InterfaceC49446tn2 interfaceC49446tn2, Integer num) {
            return C39631dE1.m44518a(m116220invoke_orMbw(interfaceC49446tn2, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw  reason: not valid java name */
        public final long m116220invoke_orMbw(InterfaceC49446tn2 interfaceC49446tn2, int i) {
            Intrinsics.checkNotNullParameter(interfaceC49446tn2, "$this$null");
            return this.f4667g.invoke(interfaceC49446tn2).m44512g();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cn2$d */
    /* loaded from: classes.dex */
    public static final class C1175d extends Lambda implements Function1<Integer, Object> {

        /* renamed from: g */
        public final /* synthetic */ Object f4668g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1175d(Object obj) {
            super(1);
            this.f4668g = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i) {
            return this.f4668g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lrn2;", "", "it", "", "invoke", "(Lrn2;ILEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cn2$e */
    /* loaded from: classes.dex */
    public static final class C1176e extends Lambda implements Function4<InterfaceC48261rn2, Integer, InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<InterfaceC48261rn2, InterfaceC32720Et0, Integer, Unit> f4669g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1176e(Function3<? super InterfaceC48261rn2, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
            super(4);
            this.f4669g = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48261rn2 interfaceC48261rn2, Integer num, InterfaceC32720Et0 interfaceC32720Et0, Integer num2) {
            invoke(interfaceC48261rn2, num.intValue(), interfaceC32720Et0, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC48261rn2 $receiver, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            if ((i2 & 14) == 0) {
                i2 |= interfaceC32720Et0.mo89539n($receiver) ? 4 : 2;
            }
            if ((i2 & 651) == 130 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1504808184, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.<anonymous> (LazyGridScopeImpl.kt:42)");
            }
            this.f4669g.invoke($receiver, interfaceC32720Et0, Integer.valueOf(i2 & 14));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Override // p000.InterfaceC31966Bn2
    /* renamed from: a */
    public void mo111691a(Object obj, Function1<? super InterfaceC49446tn2, C39631dE1> function1, Object obj2, Function3<? super InterfaceC48261rn2, ? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        C1173b c1173b;
        Function2 function2;
        Intrinsics.checkNotNullParameter(content, "content");
        C49289tX2<C44110kn2> c49289tX2 = this.f4662a;
        if (obj != null) {
            c1173b = new C1173b(obj);
        } else {
            c1173b = null;
        }
        if (function1 != null) {
            function2 = new C1174c(function1);
        } else {
            function2 = this.f4664c;
        }
        c49289tX2.m12147c(1, new C44110kn2(c1173b, function2, new C1175d(obj2), C43575jt0.m29790c(-1504808184, true, new C1176e(content))));
        if (function1 != null) {
            this.f4663b = true;
        }
    }

    @Override // p000.InterfaceC31966Bn2
    /* renamed from: b */
    public void mo111690b(int i, Function1<? super Integer, ? extends Object> function1, Function2<? super InterfaceC49446tn2, ? super Integer, C39631dE1> function2, Function1<? super Integer, ? extends Object> contentType, Function4<? super InterfaceC48261rn2, ? super Integer, ? super InterfaceC32720Et0, ? super Integer, Unit> itemContent) {
        Function2<? super InterfaceC49446tn2, ? super Integer, C39631dE1> function22;
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        C49289tX2<C44110kn2> c49289tX2 = this.f4662a;
        if (function2 == null) {
            function22 = this.f4664c;
        } else {
            function22 = function2;
        }
        c49289tX2.m12147c(i, new C44110kn2(function1, function22, contentType, itemContent));
        if (function2 != null) {
            this.f4663b = true;
        }
    }

    /* renamed from: d */
    public final boolean m111689d() {
        return this.f4663b;
    }

    /* renamed from: e */
    public final C49289tX2<C44110kn2> m111688e() {
        return this.f4662a;
    }
}
