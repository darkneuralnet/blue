package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\t"}, m28432d2 = {"LgV2;", "", "mergeDescendants", "Lkotlin/Function1;", "Lss5;", "", "Lkotlin/ExtensionFunctionType;", "properties", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n114#1:148\n142#1:149\n*E\n"})
/* renamed from: fs5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41198fs5 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n1#1,170:1\n115#2,4:171\n*E\n"})
    /* renamed from: fs5$a */
    /* loaded from: classes.dex */
    public static final class C20615a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f80980g;

        /* renamed from: h */
        public final /* synthetic */ Function1 f80981h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20615a(boolean z, Function1 function1) {
            super(1);
            this.f80980g = z;
            this.f80981h = function1;
        }

        /* renamed from: a */
        public final void m40619a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("semantics");
            s42.m86038a().m104824a("mergeDescendants", Boolean.valueOf(this.f80980g));
            s42.m86038a().m104824a("properties", this.f80981h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m40619a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m40621a(InterfaceC41563gV2 interfaceC41563gV2, boolean z, Function1<? super InterfaceC48906ss5, Unit> properties) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (K32.m99301c()) {
            m99303a = new C20615a(z, properties);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new C40605es5(z, false, properties, m99303a));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m40620b(InterfaceC41563gV2 interfaceC41563gV2, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m40621a(interfaceC41563gV2, z, function1);
    }
}
