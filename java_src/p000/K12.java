package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ImageMetadata;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.J12;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28432d2 = {"", "label", "LJ12;", "f", "(Ljava/lang/String;LEt0;II)LJ12;", "T", "Lvf;", "V", "initialValue", "targetValue", "Lwb6;", "typeConverter", "LI12;", "animationSpec", "LsP5;", DateTokenConverter.CONVERTER_KEY, "(LJ12;Ljava/lang/Object;Ljava/lang/Object;Lwb6;LI12;Ljava/lang/String;LEt0;II)LsP5;", "", "b", "(LJ12;FFLI12;Ljava/lang/String;LEt0;II)LsP5;", "e", "(LEt0;I)LJ12;", "c", "(LJ12;Ljava/lang/Object;Ljava/lang/Object;Lwb6;LI12;LEt0;I)LsP5;", C17296a.f69688o, "(LJ12;FFLI12;LEt0;I)LsP5;", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n25#2:365\n25#2:372\n1057#3,6:366\n1057#3,6:373\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365\n263#1:372\n46#1:366,6\n263#1:373,6\n*E\n"})
/* renamed from: K12 */
/* loaded from: classes.dex */
public final class K12 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K12$a */
    /* loaded from: classes.dex */
    public static final class C4298a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ T f18927g;

        /* renamed from: h */
        public final /* synthetic */ J12.C3834a<T, V> f18928h;

        /* renamed from: i */
        public final /* synthetic */ T f18929i;

        /* renamed from: j */
        public final /* synthetic */ I12<T> f18930j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4298a(T t, J12.C3834a<T, V> c3834a, T t2, I12<T> i12) {
            super(0);
            this.f18927g = t;
            this.f18928h = c3834a;
            this.f18929i = t2;
            this.f18930j = i12;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            if (Intrinsics.areEqual(this.f18927g, this.f18928h.m101374c()) && Intrinsics.areEqual(this.f18929i, this.f18928h.m101373e())) {
                return;
            }
            this.f18928h.m101367l(this.f18927g, this.f18929i, this.f18930j);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,364:1\n62#2,5:365\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n*L\n283#1:365,5\n*E\n"})
    /* renamed from: K12$b */
    /* loaded from: classes.dex */
    public static final class C4299b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ J12 f18931g;

        /* renamed from: h */
        public final /* synthetic */ J12.C3834a<T, V> f18932h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"K12$b$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2\n*L\n1#1,483:1\n284#2,2:484\n*E\n"})
        /* renamed from: K12$b$a */
        /* loaded from: classes.dex */
        public static final class C4300a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ J12 f18933a;

            /* renamed from: b */
            public final /* synthetic */ J12.C3834a f18934b;

            public C4300a(J12 j12, J12.C3834a c3834a) {
                this.f18933a = j12;
                this.f18934b = c3834a;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f18933a.m101378j(this.f18934b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4299b(J12 j12, J12.C3834a<T, V> c3834a) {
            super(1);
            this.f18931g = j12;
            this.f18932h = c3834a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC44288l51 invoke(C44881m51 c44881m51) {
            return invoke2(c44881m51);
        }

        /* renamed from: invoke */
        public final InterfaceC44288l51 invoke2(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f18931g.m101382f(this.f18932h);
            return new C4300a(this.f18931g, this.f18932h);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    /* renamed from: a */
    public static final /* synthetic */ InterfaceC48627sP5 m99353a(J12 j12, float f, float f2, I12 animationSpec, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(j12, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        interfaceC32720Et0.mo89638F(469472752);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(469472752, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:352)");
        }
        InterfaceC48627sP5<Float> m99352b = m99352b(j12, f, f2, animationSpec, "FloatAnimation", interfaceC32720Et0, (i & 112) | 24584 | (i & 896) | (i & 7168), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m99352b;
    }

    /* renamed from: b */
    public static final InterfaceC48627sP5<Float> m99352b(J12 j12, float f, float f2, I12<Float> animationSpec, String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        String str2;
        Intrinsics.checkNotNullParameter(j12, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        interfaceC32720Et0.mo89638F(-644770905);
        if ((i2 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-644770905, i, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:310)");
        }
        int i3 = i << 3;
        InterfaceC48627sP5<Float> m99350d = m99350d(j12, Float.valueOf(f), Float.valueOf(f2), C37082Xj6.m76516i(FloatCompanionObject.INSTANCE), animationSpec, str2, interfaceC32720Et0, (i & 112) | 8 | (i & 896) | (57344 & i3) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m99350d;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    /* renamed from: c */
    public static final /* synthetic */ InterfaceC48627sP5 m99351c(J12 j12, Object obj, Object obj2, InterfaceC51108wb6 typeConverter, I12 animationSpec, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(j12, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        interfaceC32720Et0.mo89638F(-1695411770);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1695411770, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:332)");
        }
        int i2 = (i >> 3) & 8;
        InterfaceC48627sP5 m99350d = m99350d(j12, obj, obj2, typeConverter, animationSpec, "ValueAnimation", interfaceC32720Et0, (i2 << 6) | (i2 << 3) | 196616 | (i & 112) | (i & 896) | (i & 7168) | (i & 57344), 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m99350d;
    }

    /* renamed from: d */
    public static final <T, V extends AbstractC29607vf> InterfaceC48627sP5<T> m99350d(J12 j12, T t, T t2, InterfaceC51108wb6<T, V> typeConverter, I12<T> animationSpec, String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        String str2;
        Intrinsics.checkNotNullParameter(j12, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        interfaceC32720Et0.mo89638F(-1062847727);
        if ((i2 & 16) != 0) {
            str2 = "ValueAnimation";
        } else {
            str2 = str;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:254)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        Object obj = mo89635G;
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            J12.C3834a c3834a = new J12.C3834a(j12, t, t2, typeConverter, animationSpec, str2);
            interfaceC32720Et0.mo89503z(c3834a);
            obj = c3834a;
        }
        interfaceC32720Et0.mo89605Q();
        J12.C3834a c3834a2 = (J12.C3834a) obj;
        Y91.m75531h(new C4298a(t, c3834a2, t2, animationSpec), interfaceC32720Et0, 0);
        Y91.m75536c(c3834a2, new C4299b(j12, c3834a2), interfaceC32720Et0, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c3834a2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    /* renamed from: e */
    public static final /* synthetic */ J12 m99349e(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-840193660);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-840193660, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        J12 m99348f = m99348f("InfiniteTransition", interfaceC32720Et0, 6, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m99348f;
    }

    /* renamed from: f */
    public static final J12 m99348f(String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(1013651573);
        if ((i2 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1013651573, i, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new J12(str);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        J12 j12 = (J12) mo89635G;
        j12.m101377k(interfaceC32720Et0, 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return j12;
    }
}
