package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¨\u0006\u0006"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "Lnm2;", "", "onGloballyPositioned", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnGloballyPositionedModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,92:1\n135#2:93\n*S KotlinDebug\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n*L\n47#1:93\n*E\n"})
/* renamed from: Tg3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36116Tg3 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n*L\n1#1,170:1\n48#2,3:171\n*E\n"})
    /* renamed from: Tg3$a */
    /* loaded from: classes.dex */
    public static final class C7911a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1 f35862g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7911a(Function1 function1) {
            super(1);
            this.f35862g = function1;
        }

        /* renamed from: a */
        public final void m83185a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("onGloballyPositioned");
            s42.m86038a().m104824a("onGloballyPositioned", this.f35862g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m83185a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m83186a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC45879nm2, Unit> onGloballyPositioned) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onGloballyPositioned, "onGloballyPositioned");
        if (K32.m99301c()) {
            m99303a = new C7911a(onGloballyPositioned);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new C35882Sg3(onGloballyPositioned, m99303a));
    }
}
