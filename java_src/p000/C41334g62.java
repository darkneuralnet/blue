package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\"&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007\"\u0017\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0001\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LgV2;", "c", "LU94;", "", C17296a.f69688o, "LU94;", "b", "()LU94;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "getLocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement$annotations", "LocalMinimumTouchTargetEnforcement", "Lo61;", "J", "minimumInteractiveComponentSize", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,129:1\n135#2:130\n154#3:131\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n49#1:130\n128#1:131\n*E\n"})
/* renamed from: g62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41334g62 {

    /* renamed from: a */
    public static final U94<Boolean> f81603a;

    /* renamed from: b */
    public static final U94<Boolean> f81604b;

    /* renamed from: c */
    public static final long f81605c;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g62$a */
    /* loaded from: classes.dex */
    public static final class C20743a extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public static final C20743a f81606g = new C20743a();

        public C20743a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n1#1,170:1\n50#2,6:171\n*E\n"})
    /* renamed from: g62$b */
    /* loaded from: classes.dex */
    public static final class C20744b extends Lambda implements Function1<S42, Unit> {
        public C20744b() {
            super(1);
        }

        /* renamed from: a */
        public final void m40068a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("minimumInteractiveComponentSize");
            s42.m86038a().m104824a("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m40068a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,129:1\n76#2:130\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n*L\n57#1:130\n*E\n"})
    /* renamed from: g62$c */
    /* loaded from: classes.dex */
    public static final class C20745c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public static final C20745c f81607g = new C20745c();

        public C20745c() {
            super(3);
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m40067a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC41563gV2 interfaceC41563gV2;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1964721376);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1964721376, i, -1, "androidx.compose.material.minimumInteractiveComponentSize.<anonymous> (InteractiveComponentSize.kt:55)");
            }
            if (((Boolean) interfaceC32720Et0.mo89572c(C41334g62.m40070b())).booleanValue()) {
                interfaceC41563gV2 = new C47484qU2(C41334g62.f81605c, null);
            } else {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return interfaceC41563gV2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m40067a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    static {
        U94<Boolean> m37350d = C41806gu0.m37350d(C20743a.f81606g);
        f81603a = m37350d;
        f81604b = m37350d;
        float f = 48;
        f81605c = C44891m61.m26345b(C43705k61.m29303g(f), C43705k61.m29303g(f));
    }

    /* renamed from: b */
    public static final U94<Boolean> m40070b() {
        return f81603a;
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m40069c(InterfaceC41563gV2 interfaceC41563gV2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (K32.m99301c()) {
            m99303a = new C20744b();
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, C20745c.f81607g);
    }
}
