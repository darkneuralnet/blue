package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a[\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LgV2;", "", "value", "enabled", "LCb5;", "role", "Lkotlin/Function1;", "", "onValueChange", "b", "(LgV2;ZZLCb5;Lkotlin/jvm/functions/Function1;)LgV2;", "LrX2;", "interactionSource", "Ly12;", "indication", C17296a.f69688o, "(LgV2;ZLrX2;Ly12;ZLCb5;Lkotlin/jvm/functions/Function1;)LgV2;", "Ln56;", TransferTable.COLUMN_STATE, "Lkotlin/Function0;", "onClick", "c", "(LgV2;Ln56;LrX2;Ly12;ZLCb5;Lkotlin/jvm/functions/Function0;)LgV2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,228:1\n135#2:229\n135#2:230\n146#2:231\n135#2:232\n135#2:233\n146#2:234\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n59#1:229\n108#1:230\n107#1:231\n156#1:232\n208#1:233\n207#1:234\n*E\n"})
/* renamed from: m56  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44886m56 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,228:1\n25#2:229\n1114#3,6:230\n76#4:236\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt$toggleable$2\n*L\n69#1:229\n69#1:230,6\n70#1:236\n*E\n"})
    /* renamed from: m56$a */
    /* loaded from: classes.dex */
    public static final class C25908a extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f97326g;

        /* renamed from: h */
        public final /* synthetic */ boolean f97327h;

        /* renamed from: i */
        public final /* synthetic */ C32095Cb5 f97328i;

        /* renamed from: j */
        public final /* synthetic */ Function1<Boolean, Unit> f97329j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25908a(boolean z, boolean z2, C32095Cb5 c32095Cb5, Function1<? super Boolean, Unit> function1) {
            super(3);
            this.f97326g = z;
            this.f97327h = z2;
            this.f97328i = c32095Cb5;
            this.f97329j = function1;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m26354a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(290332169);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(290332169, i, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:65)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            boolean z = this.f97326g;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = C40741f62.m42091a();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m26357a = C44886m56.m26357a(c20912a, z, (InterfaceC48104rX2) mo89635G, (InterfaceC51956y12) interfaceC32720Et0.mo89572c(A12.m116198a()), this.f97327h, this.f97328i, this.f97329j);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m26357a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m26354a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m56$b */
    /* loaded from: classes.dex */
    public static final class C25909b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Boolean, Unit> f97330g;

        /* renamed from: h */
        public final /* synthetic */ boolean f97331h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25909b(Function1<? super Boolean, Unit> function1, boolean z) {
            super(0);
            this.f97330g = function1;
            this.f97331h = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f97330g.invoke(Boolean.valueOf(!this.f97331h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n109#2,8:171\n*E\n"})
    /* renamed from: m56$c */
    /* loaded from: classes.dex */
    public static final class C25910c extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f97332g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48104rX2 f97333h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC51956y12 f97334i;

        /* renamed from: j */
        public final /* synthetic */ boolean f97335j;

        /* renamed from: k */
        public final /* synthetic */ C32095Cb5 f97336k;

        /* renamed from: l */
        public final /* synthetic */ Function1 f97337l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25910c(boolean z, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC51956y12 interfaceC51956y12, boolean z2, C32095Cb5 c32095Cb5, Function1 function1) {
            super(1);
            this.f97332g = z;
            this.f97333h = interfaceC48104rX2;
            this.f97334i = interfaceC51956y12;
            this.f97335j = z2;
            this.f97336k = c32095Cb5;
            this.f97337l = function1;
        }

        /* renamed from: a */
        public final void m26353a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("toggleable");
            s42.m86038a().m104824a("value", Boolean.valueOf(this.f97332g));
            s42.m86038a().m104824a("interactionSource", this.f97333h);
            s42.m86038a().m104824a("indication", this.f97334i);
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f97335j));
            s42.m86038a().m104824a("role", this.f97336k);
            s42.m86038a().m104824a("onValueChange", this.f97337l);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m26353a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n60#2,6:171\n*E\n"})
    /* renamed from: m56$d */
    /* loaded from: classes.dex */
    public static final class C25911d extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f97338g;

        /* renamed from: h */
        public final /* synthetic */ boolean f97339h;

        /* renamed from: i */
        public final /* synthetic */ C32095Cb5 f97340i;

        /* renamed from: j */
        public final /* synthetic */ Function1 f97341j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25911d(boolean z, boolean z2, C32095Cb5 c32095Cb5, Function1 function1) {
            super(1);
            this.f97338g = z;
            this.f97339h = z2;
            this.f97340i = c32095Cb5;
            this.f97341j = function1;
        }

        /* renamed from: a */
        public final void m26352a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("toggleable");
            s42.m86038a().m104824a("value", Boolean.valueOf(this.f97338g));
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f97339h));
            s42.m86038a().m104824a("role", this.f97340i);
            s42.m86038a().m104824a("onValueChange", this.f97341j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m26352a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lss5;", "", "invoke", "(Lss5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m56$e */
    /* loaded from: classes.dex */
    public static final class C25912e extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC45479n56 f97342g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25912e(EnumC45479n56 enumC45479n56) {
            super(1);
            this.f97342g = enumC45479n56;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18600Z(semantics, this.f97342g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,170:1\n209#2,8:171\n*E\n"})
    /* renamed from: m56$f */
    /* loaded from: classes.dex */
    public static final class C25913f extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC45479n56 f97343g;

        /* renamed from: h */
        public final /* synthetic */ boolean f97344h;

        /* renamed from: i */
        public final /* synthetic */ C32095Cb5 f97345i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC48104rX2 f97346j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC51956y12 f97347k;

        /* renamed from: l */
        public final /* synthetic */ Function0 f97348l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25913f(EnumC45479n56 enumC45479n56, boolean z, C32095Cb5 c32095Cb5, InterfaceC48104rX2 interfaceC48104rX2, InterfaceC51956y12 interfaceC51956y12, Function0 function0) {
            super(1);
            this.f97343g = enumC45479n56;
            this.f97344h = z;
            this.f97345i = c32095Cb5;
            this.f97346j = interfaceC48104rX2;
            this.f97347k = interfaceC51956y12;
            this.f97348l = function0;
        }

        /* renamed from: a */
        public final void m26351a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("triStateToggleable");
            s42.m86038a().m104824a(TransferTable.COLUMN_STATE, this.f97343g);
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f97344h));
            s42.m86038a().m104824a("role", this.f97345i);
            s42.m86038a().m104824a("interactionSource", this.f97346j);
            s42.m86038a().m104824a("indication", this.f97347k);
            s42.m86038a().m104824a("onClick", this.f97348l);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m26351a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m26357a(InterfaceC41563gV2 toggleable, boolean z, InterfaceC48104rX2 interactionSource, InterfaceC51956y12 interfaceC51956y12, boolean z2, C32095Cb5 c32095Cb5, Function1<? super Boolean, Unit> onValueChange) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(toggleable, "$this$toggleable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        if (K32.m99301c()) {
            m99303a = new C25910c(z, interactionSource, interfaceC51956y12, z2, c32095Cb5, onValueChange);
        } else {
            m99303a = K32.m99303a();
        }
        return K32.m99302b(toggleable, m99303a, m26355c(InterfaceC41563gV2.f82354b0, C46072o56.m21801a(z), interactionSource, interfaceC51956y12, z2, c32095Cb5, new C25909b(onValueChange, z)));
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m26356b(InterfaceC41563gV2 toggleable, boolean z, boolean z2, C32095Cb5 c32095Cb5, Function1<? super Boolean, Unit> onValueChange) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(toggleable, "$this$toggleable");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        if (K32.m99301c()) {
            m99303a = new C25911d(z, z2, c32095Cb5, onValueChange);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(toggleable, m99303a, new C25908a(z, z2, c32095Cb5, onValueChange));
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m26355c(InterfaceC41563gV2 triStateToggleable, EnumC45479n56 state, InterfaceC48104rX2 interactionSource, InterfaceC51956y12 interfaceC51956y12, boolean z, C32095Cb5 c32095Cb5, Function0<Unit> onClick) {
        Function1<S42, Unit> m99303a;
        Intrinsics.checkNotNullParameter(triStateToggleable, "$this$triStateToggleable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (K32.m99301c()) {
            m99303a = new C25913f(state, z, c32095Cb5, interactionSource, interfaceC51956y12, onClick);
        } else {
            m99303a = K32.m99303a();
        }
        return K32.m99302b(triStateToggleable, m99303a, C41198fs5.m40620b(C38131ak0.m70816c(InterfaceC41563gV2.f82354b0, interactionSource, interfaceC51956y12, z, null, c32095Cb5, onClick, 8, null), false, new C25912e(state), 1, null));
    }
}
