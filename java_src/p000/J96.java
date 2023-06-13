package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.F96;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001ac\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ao\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m28432d2 = {"T", "targetState", "", "label", "LF96;", "e", "(Ljava/lang/Object;Ljava/lang/String;LEt0;II)LF96;", "LKX2;", "transitionState", DateTokenConverter.CONVERTER_KEY, "(LKX2;Ljava/lang/String;LEt0;II)LF96;", "S", "Lvf;", "V", "Lwb6;", "typeConverter", "LF96$a;", "b", "(LF96;Lwb6;Ljava/lang/String;LEt0;II)LF96$a;", "initialState", "childLabel", C17296a.f69688o, "(LF96;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LEt0;I)LF96;", "initialValue", "targetValue", "Ltm1;", "animationSpec", "LsP5;", "c", "(LF96;Ljava/lang/Object;Ljava/lang/Object;Ltm1;Lwb6;Ljava/lang/String;LEt0;I)LsP5;", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1155:1\n857#1,5:1228\n857#1,5:1233\n857#1,5:1238\n857#1,5:1243\n857#1,5:1248\n857#1,5:1253\n857#1,5:1258\n857#1,5:1263\n25#2:1156\n36#2:1163\n36#2:1170\n36#2:1177\n36#2:1184\n36#2:1191\n36#2:1198\n50#2:1205\n49#2:1206\n36#2:1213\n50#2:1220\n49#2:1221\n1057#3,6:1157\n1057#3,6:1164\n1057#3,6:1171\n1057#3,6:1178\n1057#3,6:1185\n1057#3,6:1192\n1057#3,6:1199\n1057#3,6:1207\n1057#3,6:1214\n1057#3,6:1222\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n939#1:1228,5\n970#1:1233,5\n1001#1:1238,5\n1032#1:1243,5\n1063#1:1248,5\n1094#1:1253,5\n1124#1:1258,5\n1154#1:1263,5\n71#1:1156\n73#1:1163\n154#1:1170\n158#1:1177\n753#1:1184\n786#1:1191\n799#1:1198\n803#1:1205\n803#1:1206\n873#1:1213\n896#1:1220\n896#1:1221\n71#1:1157,6\n73#1:1164,6\n154#1:1171,6\n158#1:1178,6\n753#1:1185,6\n786#1:1192,6\n799#1:1199,6\n803#1:1207,6\n873#1:1214,6\n896#1:1222,6\n*E\n"})
/* renamed from: J96 */
/* loaded from: classes.dex */
public final class J96 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n805#1:1156,5\n*E\n"})
    /* renamed from: J96$a */
    /* loaded from: classes.dex */
    public static final class C3902a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f16913g;

        /* renamed from: h */
        public final /* synthetic */ F96<T> f16914h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"J96$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n1#1,483:1\n806#2,2:484\n*E\n"})
        /* renamed from: J96$a$a */
        /* loaded from: classes.dex */
        public static final class C3903a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ F96 f16915a;

            /* renamed from: b */
            public final /* synthetic */ F96 f16916b;

            public C3903a(F96 f96, F96 f962) {
                this.f16915a = f96;
                this.f16916b = f962;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f16915a.m107518x(this.f16916b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3902a(F96<S> f96, F96<T> f962) {
            super(1);
            this.f16913g = f96;
            this.f16914h = f962;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f16913g.m107537e(this.f16914h);
            return new C3903a(this.f16913g, this.f16914h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n755#1:1156,5\n*E\n"})
    /* renamed from: J96$b */
    /* loaded from: classes.dex */
    public static final class C3904b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f16917g;

        /* renamed from: h */
        public final /* synthetic */ F96<S>.C2187a<T, V> f16918h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"J96$b$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n1#1,483:1\n756#2,2:484\n*E\n"})
        /* renamed from: J96$b$a */
        /* loaded from: classes.dex */
        public static final class C3905a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ F96 f16919a;

            /* renamed from: b */
            public final /* synthetic */ F96.C2187a f16920b;

            public C3905a(F96 f96, F96.C2187a c2187a) {
                this.f16919a = f96;
                this.f16920b = c2187a;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f16919a.m107520v(this.f16920b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3904b(F96<S> f96, F96<S>.C2187a<T, V> c2187a) {
            super(1);
            this.f16917g = f96;
            this.f16918h = c2187a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C3905a(this.f16917g, this.f16918h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n898#1:1156,5\n*E\n"})
    /* renamed from: J96$c */
    /* loaded from: classes.dex */
    public static final class C3906c extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ F96<S> f16921g;

        /* renamed from: h */
        public final /* synthetic */ F96<S>.C2191d<T, V> f16922h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"J96$c$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n1#1,483:1\n899#2,2:484\n*E\n"})
        /* renamed from: J96$c$a */
        /* loaded from: classes.dex */
        public static final class C3907a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ F96 f16923a;

            /* renamed from: b */
            public final /* synthetic */ F96.C2191d f16924b;

            public C3907a(F96 f96, F96.C2191d c2191d) {
                this.f16923a = f96;
                this.f16924b = c2191d;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f16923a.m107519w(this.f16924b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3906c(F96<S> f96, F96<S>.C2191d<T, V> c2191d) {
            super(1);
            this.f16921g = f96;
            this.f16922h = c2191d;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f16921g.m107538d(this.f16922h);
            return new C3907a(this.f16921g, this.f16922h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n74#1:1156,5\n*E\n"})
    /* renamed from: J96$d */
    /* loaded from: classes.dex */
    public static final class C3908d extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ F96<T> f16925g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"J96$d$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n1#1,483:1\n77#2,2:484\n*E\n"})
        /* renamed from: J96$d$a */
        /* loaded from: classes.dex */
        public static final class C3909a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ F96 f16926a;

            public C3909a(F96 f96) {
                this.f16926a = f96;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f16926a.m107522t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3908d(F96<T> f96) {
            super(1);
            this.f16925g = f96;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C3909a(this.f16925g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1155:1\n62#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$2$1\n*L\n159#1:1156,5\n*E\n"})
    /* renamed from: J96$e */
    /* loaded from: classes.dex */
    public static final class C3910e extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ F96<T> f16927g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"J96$e$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$2$1\n*L\n1#1,483:1\n162#2,2:484\n*E\n"})
        /* renamed from: J96$e$a */
        /* loaded from: classes.dex */
        public static final class C3911a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ F96 f16928a;

            public C3911a(F96 f96) {
                this.f16928a = f96;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f16928a.m107522t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3910e(F96<T> f96) {
            super(1);
            this.f16927g = f96;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C3911a(this.f16927g);
        }
    }

    @PublishedApi
    /* renamed from: a */
    public static final <S, T> F96<T> m101075a(F96<S> f96, T t, T t2, String childLabel, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(f96, "<this>");
        Intrinsics.checkNotNullParameter(childLabel, "childLabel");
        interfaceC32720Et0.mo89638F(-198307638);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:793)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(f96);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            KX2 kx2 = new KX2(t);
            mo89635G = new F96(kx2, f96.m107534h() + " > " + childLabel);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        F96<T> f962 = (F96) mo89635G;
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(f96) | interfaceC32720Et0.mo89539n(f962);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C3902a(f96, f962);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75536c(f962, (Function1) mo89635G2, interfaceC32720Et0, 0);
        if (f96.m107525q()) {
            f962.m107517y(t, t2, f96.m107533i());
        } else {
            f962.m107542G(t2, interfaceC32720Et0, ((i >> 3) & 8) | ((i >> 6) & 14));
            f962.m107547B(false);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return f962;
    }

    /* renamed from: b */
    public static final <S, T, V extends AbstractC29607vf> F96<S>.C2187a<T, V> m101074b(F96<S> f96, InterfaceC51108wb6<T, V> typeConverter, String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(f96, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        interfaceC32720Et0.mo89638F(-1714122528);
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:748)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(f96);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new F96.C2187a(f96, typeConverter, str);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        F96<S>.C2187a<T, V> c2187a = (F96.C2187a) mo89635G;
        Y91.m75536c(c2187a, new C3904b(f96, c2187a), interfaceC32720Et0, 0);
        if (f96.m107525q()) {
            c2187a.m107512d();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c2187a;
    }

    @PublishedApi
    /* renamed from: c */
    public static final <S, T, V extends AbstractC29607vf> InterfaceC48627sP5<T> m101073c(F96<S> f96, T t, T t2, InterfaceC49435tm1<T> animationSpec, InterfaceC51108wb6<T, V> typeConverter, String label, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(f96, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(label, "label");
        interfaceC32720Et0.mo89638F(-304821198);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:865)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(f96);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new F96.C2191d(f96, t, C27022of.m20693g(typeConverter, t2), typeConverter, label);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        F96.C2191d c2191d = (F96.C2191d) mo89635G;
        if (f96.m107525q()) {
            c2191d.m107485x(t, t2, animationSpec);
        } else {
            c2191d.m107484y(t2, animationSpec);
        }
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(f96) | interfaceC32720Et0.mo89539n(c2191d);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C3906c(f96, c2191d);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75536c(c2191d, (Function1) mo89635G2, interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c2191d;
    }

    /* renamed from: d */
    public static final <T> F96<T> m101072d(KX2<T> transitionState, String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        interfaceC32720Et0.mo89638F(882913843);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:149)");
        }
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(transitionState);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new F96((KX2) transitionState, str);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        F96<T> f96 = (F96) mo89635G;
        f96.m107536f(transitionState.m98798b(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n2 = interfaceC32720Et0.mo89539n(f96);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C3910e(f96);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75536c(f96, (Function1) mo89635G2, interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return f96;
    }

    /* renamed from: e */
    public static final <T> F96<T> m101071e(T t, String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        interfaceC32720Et0.mo89638F(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:66)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = new F96(t, str);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        F96<T> f96 = (F96) mo89635G;
        f96.m107536f(t, interfaceC32720Et0, (i & 8) | 48 | (i & 14));
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(f96);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = new C3908d(f96);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75536c(f96, (Function1) mo89635G2, interfaceC32720Et0, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return f96;
    }
}
