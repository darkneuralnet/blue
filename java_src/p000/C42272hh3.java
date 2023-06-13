package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "LG52;", "", "onSizeChanged", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnRemeasuredModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,96:1\n135#2:97\n*S KotlinDebug\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n*L\n50#1:97\n*E\n"})
/* renamed from: hh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42272hh3 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n*L\n1#1,170:1\n51#2,3:171\n*E\n"})
    /* renamed from: hh3$a */
    /* loaded from: classes.dex */
    public static final class C22708a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1 f85677g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22708a(Function1 function1) {
            super(1);
            this.f85677g = function1;
        }

        /* renamed from: a */
        public final void m36094a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("onSizeChanged");
            s42.m86038a().m104824a("onSizeChanged", this.f85677g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m36094a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m36095a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super G52, Unit> onSizeChanged) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        if (K32.m99301c()) {
            m99303a = new C22708a(onSizeChanged);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new C44644lh3(onSizeChanged, m99303a));
    }
}
