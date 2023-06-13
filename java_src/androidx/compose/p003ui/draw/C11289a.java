package androidx.compose.p003ui.draw;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a#\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\u0004\u001a#\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¨\u0006\r"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "LI61;", "", "Lkotlin/ExtensionFunctionType;", "onDraw", C17296a.f69688o, "Le80;", "LH61;", "onBuildDrawCache", "b", "LiA0;", "c", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,276:1\n135#2:277\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n*L\n137#1:277\n*E\n"})
/* renamed from: androidx.compose.ui.draw.a */
/* loaded from: classes.dex */
public final class C11289a {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n*L\n1#1,170:1\n138#2,3:171\n*E\n"})
    /* renamed from: androidx.compose.ui.draw.a$a */
    /* loaded from: classes.dex */
    public static final class C11290a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1 f52945g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11290a(Function1 function1) {
            super(1);
            this.f52945g = function1;
        }

        /* renamed from: a */
        public final void m68864a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("drawWithCache");
            s42.m86038a().m104824a("onBuildDrawCache", this.f52945g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m68864a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt$drawWithCache$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,276:1\n25#2:277\n1114#3,6:278\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt$drawWithCache$2\n*L\n142#1:277\n142#1:278,6\n*E\n"})
    /* renamed from: androidx.compose.ui.draw.a$b */
    /* loaded from: classes.dex */
    public static final class C11291b extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ Function1<C40166e80, H61> f52946g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11291b(Function1<? super C40166e80, H61> function1) {
            super(3);
            this.f52946g = function1;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m68863a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-1689569019);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1689569019, i, -1, "androidx.compose.ui.draw.drawWithCache.<anonymous> (DrawModifier.kt:140)");
            }
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C40166e80();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 mo39266t0 = composed.mo39266t0(new B61((C40166e80) mo89635G, this.f52946g));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return mo39266t0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m68863a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m68867a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super I61, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        return interfaceC41563gV2.mo39266t0(new DrawBehindElement(onDraw));
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m68866b(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super C40166e80, H61> onBuildDrawCache) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        if (K32.m99301c()) {
            m99303a = new C11290a(onBuildDrawCache);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C11291b(onBuildDrawCache));
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m68865c(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC42558iA0, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        return interfaceC41563gV2.mo39266t0(new DrawWithContentElement(onDraw));
    }
}
