package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¨\u0006\b"}, m28432d2 = {"Lf10;", "Le10;", "LgV2;", "LK9;", "alignment", "c", "<init>", "()V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,287:1\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n243#1:288\n255#1:289\n*E\n"})
/* renamed from: f10  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40689f10 implements InterfaceC40096e10 {

    /* renamed from: a */
    public static final C40689f10 f79291a = new C40689f10();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n1#1,170:1\n244#2,3:171\n*E\n"})
    /* renamed from: f10$a */
    /* loaded from: classes.dex */
    public static final class C20172a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9 f79292g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20172a(InterfaceC4360K9 interfaceC4360K9) {
            super(1);
            this.f79292g = interfaceC4360K9;
        }

        /* renamed from: a */
        public final void m42275a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("align");
            s42.m86036c(this.f79292g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m42275a(s42);
            return Unit.INSTANCE;
        }
    }

    private C40689f10() {
    }

    @Override // p000.InterfaceC40096e10
    /* renamed from: c */
    public InterfaceC41563gV2 mo35388c(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 alignment) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        if (K32.m99301c()) {
            m99303a = new C20172a(alignment);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new C38893c10(alignment, false, m99303a));
    }
}
