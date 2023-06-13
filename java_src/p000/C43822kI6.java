package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, m28432d2 = {"LgV2;", "", "zIndex", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZIndexModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,76:1\n135#2:77\n*S KotlinDebug\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n*L\n45#1:77\n*E\n"})
/* renamed from: kI6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43822kI6 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n*L\n1#1,170:1\n46#2,3:171\n*E\n"})
    /* renamed from: kI6$a */
    /* loaded from: classes.dex */
    public static final class C25135a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f94226g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25135a(float f) {
            super(1);
            this.f94226g = f;
        }

        /* renamed from: a */
        public final void m29083a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("zIndex");
            s42.m86036c(Float.valueOf(this.f94226g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m29083a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m29084a(InterfaceC41563gV2 interfaceC41563gV2, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (K32.m99301c()) {
            m99303a = new C25135a(f);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new C43229jI6(f, m99303a));
    }
}
