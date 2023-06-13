package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0012\u0010\u000b\u001a\u00020\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0000¨\u0006\f"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "factory", C17296a.f69688o, "(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;", "LEt0;", "modifier", "c", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Dt0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32486Dt0 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LgV2$b;", "it", "", C17296a.f69688o, "(LgV2$b;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dt0$a */
    /* loaded from: classes.dex */
    public static final class C1632a extends Lambda implements Function1<InterfaceC41563gV2.InterfaceC20913b, Boolean> {

        /* renamed from: g */
        public static final C1632a f6459g = new C1632a();

        public C1632a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC41563gV2.InterfaceC20913b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!(it instanceof C32252Ct0));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LgV2;", "acc", "LgV2$b;", "element", C17296a.f69688o, "(LgV2;LgV2$b;)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dt0$b */
    /* loaded from: classes.dex */
    public static final class C1633b extends Lambda implements Function2<InterfaceC41563gV2, InterfaceC41563gV2.InterfaceC20913b, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC32720Et0 f6460g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1633b(InterfaceC32720Et0 interfaceC32720Et0) {
            super(2);
            this.f6460g = interfaceC32720Et0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final InterfaceC41563gV2 invoke(InterfaceC41563gV2 acc, InterfaceC41563gV2.InterfaceC20913b element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            boolean z = element instanceof C32252Ct0;
            InterfaceC41563gV2.InterfaceC20913b interfaceC20913b = element;
            if (z) {
                Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> m111380a = ((C32252Ct0) element).m111380a();
                Intrinsics.checkNotNull(m111380a, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                interfaceC20913b = C32486Dt0.m109806c(this.f6460g, (InterfaceC41563gV2) ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(m111380a, 3)).invoke(InterfaceC41563gV2.f82354b0, this.f6460g, 0));
            }
            return acc.mo39266t0(interfaceC20913b);
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m109808a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super S42, Unit> inspectorInfo, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, ? extends InterfaceC41563gV2> factory) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return interfaceC41563gV2.mo39266t0(new C32252Ct0(inspectorInfo, factory));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m109807b(InterfaceC41563gV2 interfaceC41563gV2, Function1 function1, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = K32.m99303a();
        }
        return m109808a(interfaceC41563gV2, function1, function3);
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m109806c(InterfaceC32720Et0 interfaceC32720Et0, InterfaceC41563gV2 modifier) {
        Intrinsics.checkNotNullParameter(interfaceC32720Et0, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        if (modifier.mo39264o(C1632a.f6459g)) {
            return modifier;
        }
        interfaceC32720Et0.mo89638F(1219399079);
        InterfaceC41563gV2 interfaceC41563gV2 = (InterfaceC41563gV2) modifier.mo39265n(InterfaceC41563gV2.f82354b0, new C1633b(interfaceC32720Et0));
        interfaceC32720Et0.mo89605Q();
        return interfaceC41563gV2;
    }
}
