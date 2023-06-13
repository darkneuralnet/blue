package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0014\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, m28432d2 = {"LQm0;", "LPm0;", "LgV2;", "", "weight", "", "fill", C17296a.f69688o, "LK9$b;", "alignment", "c", "<init>", "()V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,250:1\n1#2:251\n135#3:252\n135#3:253\n135#3:254\n135#3:255\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n207#1:252\n221#1:253\n232#1:254\n243#1:255\n*E\n"})
/* renamed from: Qm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35465Qm0 implements InterfaceC35231Pm0 {

    /* renamed from: a */
    public static final C35465Qm0 f30887a = new C35465Qm0();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n1#1,170:1\n222#2,3:171\n*E\n"})
    /* renamed from: Qm0$a */
    /* loaded from: classes.dex */
    public static final class C6891a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4362b f30888g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6891a(InterfaceC4360K9.InterfaceC4362b interfaceC4362b) {
            super(1);
            this.f30888g = interfaceC4362b;
        }

        /* renamed from: a */
        public final void m87990a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("align");
            s42.m86036c(this.f30888g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m87990a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n1#1,170:1\n208#2,5:171\n*E\n"})
    /* renamed from: Qm0$b */
    /* loaded from: classes.dex */
    public static final class C6892b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f30889g;

        /* renamed from: h */
        public final /* synthetic */ boolean f30890h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6892b(float f, boolean z) {
            super(1);
            this.f30889g = f;
            this.f30890h = z;
        }

        /* renamed from: a */
        public final void m87989a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("weight");
            s42.m86036c(Float.valueOf(this.f30889g));
            s42.m86038a().m104824a("weight", Float.valueOf(this.f30889g));
            s42.m86038a().m104824a("fill", Boolean.valueOf(this.f30890h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m87989a(s42);
            return Unit.INSTANCE;
        }
    }

    private C35465Qm0() {
    }

    @Override // p000.InterfaceC35231Pm0
    /* renamed from: a */
    public InterfaceC41563gV2 mo87992a(InterfaceC41563gV2 interfaceC41563gV2, float f, boolean z) {
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
                m99303a = new C6892b(f, z);
            } else {
                m99303a = K32.m99303a();
            }
            return interfaceC41563gV2.mo39266t0(new C36637Vm2(f, z, m99303a));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Override // p000.InterfaceC35231Pm0
    /* renamed from: c */
    public InterfaceC41563gV2 mo87991c(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9.InterfaceC4362b alignment) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        if (K32.m99301c()) {
            m99303a = new C6891a(alignment);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new XM1(alignment, m99303a));
    }
}
