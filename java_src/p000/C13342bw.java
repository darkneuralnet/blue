package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a&\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"LgV2;", "Lpm0;", "color", "Lhy5;", "shape", "c", "(LgV2;JLhy5;)LgV2;", "La30;", "brush", "", "alpha", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n49#1:148\n78#1:149\n*E\n"})
/* renamed from: bw */
/* loaded from: classes.dex */
public final class C13342bw {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,170:1\n79#2,5:171\n*E\n"})
    /* renamed from: bw$a */
    /* loaded from: classes.dex */
    public static final class C13343a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f59796g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC37727a30 f59797h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC42444hy5 f59798i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13343a(float f, AbstractC37727a30 abstractC37727a30, InterfaceC42444hy5 interfaceC42444hy5) {
            super(1);
            this.f59796g = f;
            this.f59797h = abstractC37727a30;
            this.f59798i = interfaceC42444hy5;
        }

        /* renamed from: a */
        public final void m62123a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("background");
            s42.m86038a().m104824a("alpha", Float.valueOf(this.f59796g));
            s42.m86038a().m104824a("brush", this.f59797h);
            s42.m86038a().m104824a("shape", this.f59798i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m62123a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,170:1\n50#2,5:171\n*E\n"})
    /* renamed from: bw$b */
    /* loaded from: classes.dex */
    public static final class C13344b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ long f59799g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC42444hy5 f59800h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13344b(long j, InterfaceC42444hy5 interfaceC42444hy5) {
            super(1);
            this.f59799g = j;
            this.f59800h = interfaceC42444hy5;
        }

        /* renamed from: a */
        public final void m62122a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("background");
            s42.m86036c(C47063pm0.m18747i(this.f59799g));
            s42.m86038a().m104824a("color", C47063pm0.m18747i(this.f59799g));
            s42.m86038a().m104824a("shape", this.f59800h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m62122a(s42);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m62127a(InterfaceC41563gV2 interfaceC41563gV2, AbstractC37727a30 brush, InterfaceC42444hy5 shape, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (K32.m99301c()) {
            m99303a = new C13343a(f, brush, shape);
        } else {
            m99303a = K32.m99303a();
        }
        return interfaceC41563gV2.mo39266t0(new C10430Zv(null, brush, f, shape, m99303a, 1, null));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC41563gV2 m62126b(InterfaceC41563gV2 interfaceC41563gV2, AbstractC37727a30 abstractC37727a30, InterfaceC42444hy5 interfaceC42444hy5, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC42444hy5 = C37629Zs4.m72365a();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return m62127a(interfaceC41563gV2, abstractC37727a30, interfaceC42444hy5, f);
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m62125c(InterfaceC41563gV2 background, long j, InterfaceC42444hy5 shape) {
        C13344b m99303a;
        Intrinsics.checkNotNullParameter(background, "$this$background");
        Intrinsics.checkNotNullParameter(shape, "shape");
        C47063pm0 m18747i = C47063pm0.m18747i(j);
        if (K32.m99301c()) {
            m99303a = new C13344b(j, shape);
        } else {
            m99303a = K32.m99303a();
        }
        return background.mo39266t0(new C10430Zv(m18747i, null, 0.0f, shape, m99303a, 6, null));
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC41563gV2 m62124d(InterfaceC41563gV2 interfaceC41563gV2, long j, InterfaceC42444hy5 interfaceC42444hy5, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC42444hy5 = C37629Zs4.m72365a();
        }
        return m62125c(interfaceC41563gV2, j, interfaceC42444hy5);
    }
}
