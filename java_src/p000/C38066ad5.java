package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0014\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, m28432d2 = {"Lad5;", "LZc5;", "LgV2;", "", "weight", "", "fill", C17296a.f69688o, "LK9$c;", "alignment", "c", "<init>", "()V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,272:1\n1#2:273\n135#3:274\n135#3:275\n135#3:276\n135#3:277\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n227#1:274\n241#1:275\n252#1:276\n265#1:277\n*E\n"})
/* renamed from: ad5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38066ad5 implements InterfaceC37486Zc5 {

    /* renamed from: a */
    public static final C38066ad5 f50835a = new C38066ad5();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n1#1,170:1\n242#2,3:171\n*E\n"})
    /* renamed from: ad5$a */
    /* loaded from: classes.dex */
    public static final class C10778a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4363c f50836g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10778a(InterfaceC4360K9.InterfaceC4363c interfaceC4363c) {
            super(1);
            this.f50836g = interfaceC4363c;
        }

        /* renamed from: a */
        public final void m70991a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("align");
            s42.m86036c(this.f50836g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m70991a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n1#1,170:1\n228#2,5:171\n*E\n"})
    /* renamed from: ad5$b */
    /* loaded from: classes.dex */
    public static final class C10779b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f50837g;

        /* renamed from: h */
        public final /* synthetic */ boolean f50838h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10779b(float f, boolean z) {
            super(1);
            this.f50837g = f;
            this.f50838h = z;
        }

        /* renamed from: a */
        public final void m70990a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("weight");
            s42.m86036c(Float.valueOf(this.f50837g));
            s42.m86038a().m104824a("weight", Float.valueOf(this.f50837g));
            s42.m86038a().m104824a("fill", Boolean.valueOf(this.f50838h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m70990a(s42);
            return Unit.INSTANCE;
        }
    }

    private C38066ad5() {
    }

    @Override // p000.InterfaceC37486Zc5
    /* renamed from: a */
    public InterfaceC41563gV2 mo70993a(InterfaceC41563gV2 interfaceC41563gV2, float f, boolean z) {
        boolean z2;
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (f > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (K32.m99301c()) {
                m99303a = new C10779b(f, z);
            } else {
                m99303a = K32.m99303a();
            }
            return interfaceC41563gV2.mo39266t0(new C36637Vm2(f, z, m99303a));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Override // p000.InterfaceC37486Zc5
    /* renamed from: c */
    public InterfaceC41563gV2 mo70992c(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9.InterfaceC4363c alignment) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        if (K32.m99301c()) {
            m99303a = new C10778a(alignment);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new C33617Io6(alignment, m99303a));
    }
}
