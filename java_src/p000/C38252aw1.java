package p000;

import androidx.compose.p003ui.focus.C11298b;
import androidx.compose.p003ui.focus.C11301d;
import androidx.compose.p003ui.focus.C11308g;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.focus.C11312i;
import androidx.compose.p003ui.focus.InterfaceC11302e;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.RT3;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u001e\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, m28432d2 = {"LgV2;", "", "enabled", "LrX2;", "interactionSource", "b", C17296a.f69688o, "c", "LJ32;", "LJ32;", "focusGroupInspectorInfo", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,227:1\n135#2:228\n135#2:229\n135#2:230\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n63#1:228\n212#1:229\n225#1:230\n*E\n"})
/* renamed from: aw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38252aw1 {

    /* renamed from: a */
    public static final J32 f56583a;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroidx/compose/ui/focus/e;", "", "invoke", "(Landroidx/compose/ui/focus/e;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aw1$a */
    /* loaded from: classes.dex */
    public static final class C12228a extends Lambda implements Function1<InterfaceC11302e, Unit> {

        /* renamed from: g */
        public static final C12228a f56584g = new C12228a();

        public C12228a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11302e interfaceC11302e) {
            invoke2(interfaceC11302e);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC11302e focusProperties) {
            Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
            focusProperties.mo68792e(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n1#1,170:1\n64#2,4:171\n*E\n"})
    /* renamed from: aw1$b */
    /* loaded from: classes.dex */
    public static final class C12229b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f56585g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48104rX2 f56586h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12229b(boolean z, InterfaceC48104rX2 interfaceC48104rX2) {
            super(1);
            this.f56585g = z;
            this.f56586h = interfaceC48104rX2;
        }

        /* renamed from: a */
        public final void m65234a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("focusable");
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f56585g));
            s42.m86038a().m104824a("interactionSource", this.f56586h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m65234a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", "e", "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n474#2,4:228\n478#2,2:236\n482#2:242\n25#3:232\n25#3:243\n25#3:250\n25#3:257\n25#3:264\n50#3:271\n49#3:272\n25#3:279\n25#3:287\n67#3,3:294\n66#3:297\n50#3:304\n49#3:305\n1114#4,3:233\n1117#4,3:239\n1114#4,6:244\n1114#4,6:251\n1114#4,6:258\n1114#4,6:265\n1114#4,6:273\n1114#4,6:280\n1114#4,6:288\n1114#4,6:298\n1114#4,6:306\n474#5:238\n76#6:286\n76#7:312\n102#7,2:313\n76#7:315\n102#7,2:316\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2\n*L\n69#1:228,4\n69#1:236,2\n69#1:242\n69#1:232\n70#1:243\n71#1:250\n72#1:257\n84#1:264\n85#1:271\n85#1:272\n109#1:279\n118#1:287\n119#1:294,3\n119#1:297\n130#1:304\n130#1:305\n69#1:233,3\n69#1:239,3\n70#1:244,6\n71#1:251,6\n72#1:258,6\n84#1:265,6\n85#1:273,6\n109#1:280,6\n118#1:288,6\n119#1:298,6\n130#1:306,6\n69#1:238\n117#1:286\n71#1:312\n71#1:313,2\n118#1:315\n118#1:316,2\n*E\n"})
    /* renamed from: aw1$c */
    /* loaded from: classes.dex */
    public static final class C12230c extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC48104rX2 f56587g;

        /* renamed from: h */
        public final /* synthetic */ boolean f56588h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n*L\n86#1:228,5\n*E\n"})
        /* renamed from: aw1$c$a */
        /* loaded from: classes.dex */
        public static final class C12231a extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ EX2<C51896xv1> f56589g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC48104rX2 f56590h;

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"aw1$c$a$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n*L\n1#1,484:1\n87#2,6:485\n*E\n"})
            /* renamed from: aw1$c$a$a */
            /* loaded from: classes.dex */
            public static final class C12232a implements InterfaceC44288l51 {

                /* renamed from: a */
                public final /* synthetic */ EX2 f56591a;

                /* renamed from: b */
                public final /* synthetic */ InterfaceC48104rX2 f56592b;

                public C12232a(EX2 ex2, InterfaceC48104rX2 interfaceC48104rX2) {
                    this.f56591a = ex2;
                    this.f56592b = interfaceC48104rX2;
                }

                @Override // p000.InterfaceC44288l51
                public void dispose() {
                    C51896xv1 c51896xv1 = (C51896xv1) this.f56591a.getValue();
                    if (c51896xv1 != null) {
                        C52489yv1 c52489yv1 = new C52489yv1(c51896xv1);
                        InterfaceC48104rX2 interfaceC48104rX2 = this.f56592b;
                        if (interfaceC48104rX2 != null) {
                            interfaceC48104rX2.mo14090a(c52489yv1);
                        }
                        this.f56591a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12231a(EX2<C51896xv1> ex2, InterfaceC48104rX2 interfaceC48104rX2) {
                super(1);
                this.f56589g = ex2;
                this.f56590h = interfaceC48104rX2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                return new C12232a(this.f56589g, this.f56590h);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$2\n*L\n104#1:228,5\n*E\n"})
        /* renamed from: aw1$c$b */
        /* loaded from: classes.dex */
        public static final class C12233b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ boolean f56593g;

            /* renamed from: h */
            public final /* synthetic */ ZC0 f56594h;

            /* renamed from: i */
            public final /* synthetic */ EX2<C51896xv1> f56595i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC48104rX2 f56596j;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", m28418f = "Focusable.kt", m28417i = {}, m28416l = {99}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: aw1$c$b$a */
            /* loaded from: classes.dex */
            public static final class C12234a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public Object f56597h;

                /* renamed from: i */
                public int f56598i;

                /* renamed from: j */
                public final /* synthetic */ EX2<C51896xv1> f56599j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC48104rX2 f56600k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12234a(EX2<C51896xv1> ex2, InterfaceC48104rX2 interfaceC48104rX2, Continuation<? super C12234a> continuation) {
                    super(2, continuation);
                    this.f56599j = ex2;
                    this.f56600k = interfaceC48104rX2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C12234a(this.f56599j, this.f56600k, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C12234a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    EX2<C51896xv1> ex2;
                    EX2<C51896xv1> ex22;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f56598i;
                    if (i != 0) {
                        if (i == 1) {
                            ex22 = (EX2) this.f56597h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C51896xv1 value = this.f56599j.getValue();
                        if (value != null) {
                            InterfaceC48104rX2 interfaceC48104rX2 = this.f56600k;
                            ex2 = this.f56599j;
                            C52489yv1 c52489yv1 = new C52489yv1(value);
                            if (interfaceC48104rX2 != null) {
                                this.f56597h = ex2;
                                this.f56598i = 1;
                                if (interfaceC48104rX2.mo14088c(c52489yv1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ex22 = ex2;
                            }
                            ex2.setValue(null);
                        }
                        return Unit.INSTANCE;
                    }
                    ex2 = ex22;
                    ex2.setValue(null);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"aw1$c$b$b", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$2\n*L\n1#1,484:1\n104#2:485\n*E\n"})
            /* renamed from: aw1$c$b$b */
            /* loaded from: classes.dex */
            public static final class C12235b implements InterfaceC44288l51 {
                @Override // p000.InterfaceC44288l51
                public void dispose() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12233b(boolean z, ZC0 zc0, EX2<C51896xv1> ex2, InterfaceC48104rX2 interfaceC48104rX2) {
                super(1);
                this.f56593g = z;
                this.f56594h = zc0;
                this.f56595i = ex2;
                this.f56596j = interfaceC48104rX2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (!this.f56593g) {
                    Z30.m73800d(this.f56594h, null, null, new C12234a(this.f56595i, this.f56596j, null), 3, null);
                }
                return new C12235b();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n*L\n123#1:228,5\n*E\n"})
        /* renamed from: aw1$c$c */
        /* loaded from: classes.dex */
        public static final class C12236c extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

            /* renamed from: g */
            public final /* synthetic */ RT3 f56601g;

            /* renamed from: h */
            public final /* synthetic */ EX2<Boolean> f56602h;

            /* renamed from: i */
            public final /* synthetic */ EX2<RT3.InterfaceC7176a> f56603i;

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"aw1$c$c$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n*L\n1#1,484:1\n124#2,3:485\n*E\n"})
            /* renamed from: aw1$c$c$a */
            /* loaded from: classes.dex */
            public static final class C12237a implements InterfaceC44288l51 {

                /* renamed from: a */
                public final /* synthetic */ EX2 f56604a;

                public C12237a(EX2 ex2) {
                    this.f56604a = ex2;
                }

                @Override // p000.InterfaceC44288l51
                public void dispose() {
                    RT3.InterfaceC7176a m65225i = C12230c.m65225i(this.f56604a);
                    if (m65225i != null) {
                        m65225i.release();
                    }
                    C12230c.m65228f(this.f56604a, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12236c(RT3 rt3, EX2<Boolean> ex2, EX2<RT3.InterfaceC7176a> ex22) {
                super(1);
                this.f56601g = rt3;
                this.f56602h = ex2;
                this.f56603i = ex22;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (C12230c.m65227g(this.f56602h)) {
                    EX2<RT3.InterfaceC7176a> ex2 = this.f56603i;
                    RT3 rt3 = this.f56601g;
                    C12230c.m65228f(ex2, rt3 != null ? rt3.mo76327a() : null);
                }
                return new C12237a(this.f56603i);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aw1$c$d */
        /* loaded from: classes.dex */
        public static final class C12238d extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EX2<Boolean> f56605g;

            /* renamed from: h */
            public final /* synthetic */ C11309h f56606h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: aw1$c$d$a */
            /* loaded from: classes.dex */
            public static final class C12239a extends Lambda implements Function0<Boolean> {

                /* renamed from: g */
                public final /* synthetic */ C11309h f56607g;

                /* renamed from: h */
                public final /* synthetic */ EX2<Boolean> f56608h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12239a(C11309h c11309h, EX2<Boolean> ex2) {
                    super(0);
                    this.f56607g = c11309h;
                    this.f56608h = ex2;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    this.f56607g.m68779e();
                    return Boolean.valueOf(C12230c.m65227g(this.f56608h));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12238d(EX2<Boolean> ex2, C11309h c11309h) {
                super(1);
                this.f56605g = ex2;
                this.f56606h = c11309h;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C47128ps5.m18616J(semantics, C12230c.m65227g(this.f56605g));
                C47128ps5.m18625A(semantics, null, new C12239a(this.f56606h, this.f56605g), 1, null);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aw1$c$e */
        /* loaded from: classes.dex */
        public static final class C12240e extends Lambda implements Function1<InterfaceC36951Wv1, Unit> {

            /* renamed from: g */
            public final /* synthetic */ RT3 f56609g;

            /* renamed from: h */
            public final /* synthetic */ ZC0 f56610h;

            /* renamed from: i */
            public final /* synthetic */ EX2<Boolean> f56611i;

            /* renamed from: j */
            public final /* synthetic */ EX2<RT3.InterfaceC7176a> f56612j;

            /* renamed from: k */
            public final /* synthetic */ EX2<C51896xv1> f56613k;

            /* renamed from: l */
            public final /* synthetic */ InterfaceC48104rX2 f56614l;

            /* renamed from: m */
            public final /* synthetic */ E20 f56615m;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", m28418f = "Focusable.kt", m28417i = {1}, m28416l = {147, 151, 154}, m28415m = "invokeSuspend", m28414n = {"interaction"}, m28413s = {"L$0"})
            /* renamed from: aw1$c$e$a */
            /* loaded from: classes.dex */
            public static final class C12241a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public Object f56616h;

                /* renamed from: i */
                public int f56617i;

                /* renamed from: j */
                public final /* synthetic */ EX2<C51896xv1> f56618j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC48104rX2 f56619k;

                /* renamed from: l */
                public final /* synthetic */ E20 f56620l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12241a(EX2<C51896xv1> ex2, InterfaceC48104rX2 interfaceC48104rX2, E20 e20, Continuation<? super C12241a> continuation) {
                    super(2, continuation);
                    this.f56618j = ex2;
                    this.f56619k = interfaceC48104rX2;
                    this.f56620l = e20;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C12241a(this.f56618j, this.f56619k, this.f56620l, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C12241a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    EX2<C51896xv1> ex2;
                    EX2<C51896xv1> ex22;
                    C51896xv1 c51896xv1;
                    InterfaceC48104rX2 interfaceC48104rX2;
                    E20 e20;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f56617i;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c51896xv1 = (C51896xv1) this.f56616h;
                            ResultKt.throwOnFailure(obj);
                            this.f56618j.setValue(c51896xv1);
                            e20 = this.f56620l;
                            this.f56616h = null;
                            this.f56617i = 3;
                            if (E20.m109488a(e20, null, this, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        ex22 = (EX2) this.f56616h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C51896xv1 value = this.f56618j.getValue();
                        if (value != null) {
                            InterfaceC48104rX2 interfaceC48104rX22 = this.f56619k;
                            ex2 = this.f56618j;
                            C52489yv1 c52489yv1 = new C52489yv1(value);
                            if (interfaceC48104rX22 != null) {
                                this.f56616h = ex2;
                                this.f56617i = 1;
                                if (interfaceC48104rX22.mo14088c(c52489yv1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ex22 = ex2;
                            }
                            ex2.setValue(null);
                        }
                        c51896xv1 = new C51896xv1();
                        interfaceC48104rX2 = this.f56619k;
                        if (interfaceC48104rX2 != null) {
                            this.f56616h = c51896xv1;
                            this.f56617i = 2;
                            if (interfaceC48104rX2.mo14088c(c51896xv1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        this.f56618j.setValue(c51896xv1);
                        e20 = this.f56620l;
                        this.f56616h = null;
                        this.f56617i = 3;
                        if (E20.m109488a(e20, null, this, 1, null) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                    ex2 = ex22;
                    ex2.setValue(null);
                    c51896xv1 = new C51896xv1();
                    interfaceC48104rX2 = this.f56619k;
                    if (interfaceC48104rX2 != null) {
                    }
                    this.f56618j.setValue(c51896xv1);
                    e20 = this.f56620l;
                    this.f56616h = null;
                    this.f56617i = 3;
                    if (E20.m109488a(e20, null, this, 1, null) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", m28418f = "Focusable.kt", m28417i = {}, m28416l = {162}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: aw1$c$e$b */
            /* loaded from: classes.dex */
            public static final class C12242b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public Object f56621h;

                /* renamed from: i */
                public int f56622i;

                /* renamed from: j */
                public final /* synthetic */ EX2<C51896xv1> f56623j;

                /* renamed from: k */
                public final /* synthetic */ InterfaceC48104rX2 f56624k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C12242b(EX2<C51896xv1> ex2, InterfaceC48104rX2 interfaceC48104rX2, Continuation<? super C12242b> continuation) {
                    super(2, continuation);
                    this.f56623j = ex2;
                    this.f56624k = interfaceC48104rX2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C12242b(this.f56623j, this.f56624k, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C12242b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    EX2<C51896xv1> ex2;
                    EX2<C51896xv1> ex22;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f56622i;
                    if (i != 0) {
                        if (i == 1) {
                            ex22 = (EX2) this.f56621h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C51896xv1 value = this.f56623j.getValue();
                        if (value != null) {
                            InterfaceC48104rX2 interfaceC48104rX2 = this.f56624k;
                            ex2 = this.f56623j;
                            C52489yv1 c52489yv1 = new C52489yv1(value);
                            if (interfaceC48104rX2 != null) {
                                this.f56621h = ex2;
                                this.f56622i = 1;
                                if (interfaceC48104rX2.mo14088c(c52489yv1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ex22 = ex2;
                            }
                            ex2.setValue(null);
                        }
                        return Unit.INSTANCE;
                    }
                    ex2 = ex22;
                    ex2.setValue(null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12240e(RT3 rt3, ZC0 zc0, EX2<Boolean> ex2, EX2<RT3.InterfaceC7176a> ex22, EX2<C51896xv1> ex23, InterfaceC48104rX2 interfaceC48104rX2, E20 e20) {
                super(1);
                this.f56609g = rt3;
                this.f56610h = zc0;
                this.f56611i = ex2;
                this.f56612j = ex22;
                this.f56613k = ex23;
                this.f56614l = interfaceC48104rX2;
                this.f56615m = e20;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC36951Wv1 interfaceC36951Wv1) {
                invoke2(interfaceC36951Wv1);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC36951Wv1 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C12230c.m65226h(this.f56611i, it.mo76101a());
                if (C12230c.m65227g(this.f56611i)) {
                    EX2<RT3.InterfaceC7176a> ex2 = this.f56612j;
                    RT3 rt3 = this.f56609g;
                    C12230c.m65228f(ex2, rt3 != null ? rt3.mo76327a() : null);
                    Z30.m73800d(this.f56610h, null, null, new C12241a(this.f56613k, this.f56614l, this.f56615m, null), 3, null);
                    return;
                }
                RT3.InterfaceC7176a m65225i = C12230c.m65225i(this.f56612j);
                if (m65225i != null) {
                    m65225i.release();
                }
                C12230c.m65228f(this.f56612j, null);
                Z30.m73800d(this.f56610h, null, null, new C12242b(this.f56613k, this.f56614l, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12230c(InterfaceC48104rX2 interfaceC48104rX2, boolean z) {
            super(3);
            this.f56587g = interfaceC48104rX2;
            this.f56588h = z;
        }

        /* renamed from: f */
        public static final void m65228f(EX2<RT3.InterfaceC7176a> ex2, RT3.InterfaceC7176a interfaceC7176a) {
            ex2.setValue(interfaceC7176a);
        }

        /* renamed from: g */
        public static final boolean m65227g(EX2<Boolean> ex2) {
            return ex2.getValue().booleanValue();
        }

        /* renamed from: h */
        public static final void m65226h(EX2<Boolean> ex2, boolean z) {
            ex2.setValue(Boolean.valueOf(z));
        }

        /* renamed from: i */
        public static final RT3.InterfaceC7176a m65225i(EX2<RT3.InterfaceC7176a> ex2) {
            return ex2.getValue();
        }

        /* renamed from: e */
        public final InterfaceC41563gV2 m65229e(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            InterfaceC41563gV2 interfaceC41563gV2;
            InterfaceC41563gV2 interfaceC41563gV22;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(1871352361);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1871352361, i, -1, "androidx.compose.foundation.focusable.<anonymous> (Focusable.kt:67)");
            }
            interfaceC32720Et0.mo89638F(773894976);
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                Object c42992iu0 = new C42992iu0(Y91.m75529j(EmptyCoroutineContext.INSTANCE, interfaceC32720Et0));
                interfaceC32720Et0.mo89503z(c42992iu0);
                mo89635G = c42992iu0;
            }
            interfaceC32720Et0.mo89605Q();
            ZC0 m31665a = ((C42992iu0) mo89635G).m31665a();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = LM5.m97025e(null, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex2 = (EX2) mo89635G2;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G3 = interfaceC32720Et0.mo89635G();
            if (mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = LM5.m97025e(Boolean.FALSE, null, 2, null);
                interfaceC32720Et0.mo89503z(mo89635G3);
            }
            interfaceC32720Et0.mo89605Q();
            EX2 ex22 = (EX2) mo89635G3;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G4 = interfaceC32720Et0.mo89635G();
            if (mo89635G4 == c2012a.m108267a()) {
                mo89635G4 = new C11309h();
                interfaceC32720Et0.mo89503z(mo89635G4);
            }
            interfaceC32720Et0.mo89605Q();
            C11309h c11309h = (C11309h) mo89635G4;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G5 = interfaceC32720Et0.mo89635G();
            if (mo89635G5 == c2012a.m108267a()) {
                mo89635G5 = G20.m105945a();
                interfaceC32720Et0.mo89503z(mo89635G5);
            }
            interfaceC32720Et0.mo89605Q();
            E20 e20 = (E20) mo89635G5;
            InterfaceC48104rX2 interfaceC48104rX2 = this.f56587g;
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(ex2) | interfaceC32720Et0.mo89539n(interfaceC48104rX2);
            Object mo89635G6 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G6 == c2012a.m108267a()) {
                mo89635G6 = new C12231a(ex2, interfaceC48104rX2);
                interfaceC32720Et0.mo89503z(mo89635G6);
            }
            interfaceC32720Et0.mo89605Q();
            Y91.m75536c(interfaceC48104rX2, (Function1) mo89635G6, interfaceC32720Et0, 0);
            Y91.m75536c(Boolean.valueOf(this.f56588h), new C12233b(this.f56588h, m31665a, ex2, this.f56587g), interfaceC32720Et0, 0);
            if (this.f56588h) {
                interfaceC32720Et0.mo89638F(1407540673);
                if (m65227g(ex22)) {
                    interfaceC32720Et0.mo89638F(-492369756);
                    Object mo89635G7 = interfaceC32720Et0.mo89635G();
                    if (mo89635G7 == c2012a.m108267a()) {
                        mo89635G7 = new C39456cw1();
                        interfaceC32720Et0.mo89503z(mo89635G7);
                    }
                    interfaceC32720Et0.mo89605Q();
                    interfaceC41563gV22 = (InterfaceC41563gV2) mo89635G7;
                } else {
                    interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                }
                interfaceC32720Et0.mo89605Q();
                RT3 rt3 = (RT3) interfaceC32720Et0.mo89572c(ST3.m85377a());
                interfaceC32720Et0.mo89638F(-492369756);
                Object mo89635G8 = interfaceC32720Et0.mo89635G();
                if (mo89635G8 == c2012a.m108267a()) {
                    mo89635G8 = LM5.m97025e(null, null, 2, null);
                    interfaceC32720Et0.mo89503z(mo89635G8);
                }
                interfaceC32720Et0.mo89605Q();
                EX2 ex23 = (EX2) mo89635G8;
                interfaceC32720Et0.mo89638F(1618982084);
                boolean mo89539n2 = interfaceC32720Et0.mo89539n(ex22) | interfaceC32720Et0.mo89539n(ex23) | interfaceC32720Et0.mo89539n(rt3);
                Object mo89635G9 = interfaceC32720Et0.mo89635G();
                if (mo89539n2 || mo89635G9 == c2012a.m108267a()) {
                    mo89635G9 = new C12236c(rt3, ex22, ex23);
                    interfaceC32720Et0.mo89503z(mo89635G9);
                }
                interfaceC32720Et0.mo89605Q();
                Y91.m75536c(rt3, (Function1) mo89635G9, interfaceC32720Et0, 0);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                interfaceC32720Et0.mo89638F(511388516);
                boolean mo89539n3 = interfaceC32720Et0.mo89539n(ex22) | interfaceC32720Et0.mo89539n(c11309h);
                Object mo89635G10 = interfaceC32720Et0.mo89635G();
                if (mo89539n3 || mo89635G10 == c2012a.m108267a()) {
                    mo89635G10 = new C12238d(ex22, c11309h);
                    interfaceC32720Et0.mo89503z(mo89635G10);
                }
                interfaceC32720Et0.mo89605Q();
                interfaceC41563gV2 = C11301d.m68799a(C11298b.m68823a(C11312i.m68775a(G20.m105944b(C41198fs5.m40620b(c20912a, false, (Function1) mo89635G10, 1, null), e20), c11309h).mo39266t0(interfaceC41563gV22), new C12240e(rt3, m31665a, ex22, ex23, ex2, this.f56587g, e20)));
            } else {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return interfaceC41563gV2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m65229e(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n1#1,170:1\n213#2,4:171\n*E\n"})
    /* renamed from: aw1$d */
    /* loaded from: classes.dex */
    public static final class C12243d extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f56625g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48104rX2 f56626h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12243d(boolean z, InterfaceC48104rX2 interfaceC48104rX2) {
            super(1);
            this.f56625g = z;
            this.f56626h = interfaceC48104rX2;
        }

        /* renamed from: a */
        public final void m65224a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("focusableInNonTouchMode");
            s42.m86038a().m104824a("enabled", Boolean.valueOf(this.f56625g));
            s42.m86038a().m104824a("interactionSource", this.f56626h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m65224a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,227:1\n76#2:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusableInNonTouchMode$2\n*L\n218#1:228\n*E\n"})
    /* renamed from: aw1$e */
    /* loaded from: classes.dex */
    public static final class C12244e extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ boolean f56627g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48104rX2 f56628h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: aw1$e$a */
        /* loaded from: classes.dex */
        public static final class C12245a extends Lambda implements Function1<InterfaceC11302e, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC44862m32 f56629g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12245a(InterfaceC44862m32 interfaceC44862m32) {
                super(1);
                this.f56629g = interfaceC44862m32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11302e interfaceC11302e) {
                invoke2(interfaceC11302e);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC11302e focusProperties) {
                Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
                focusProperties.mo68792e(!C44269l32.m27987f(this.f56629g.mo24518a(), C44269l32.f95397b.m27982b()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12244e(boolean z, InterfaceC48104rX2 interfaceC48104rX2) {
            super(3);
            this.f56627g = z;
            this.f56628h = interfaceC48104rX2;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m65223a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(-618949501);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-618949501, i, -1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:216)");
            }
            InterfaceC41563gV2 m65236b = C38252aw1.m65236b(C11308g.m68784a(InterfaceC41563gV2.f82354b0, new C12245a((InterfaceC44862m32) interfaceC32720Et0.mo89572c(C42399hu0.m35608k()))), this.f56627g, this.f56628h);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m65236b;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m65223a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n1#1,170:1\n225#2:171\n*E\n"})
    /* renamed from: aw1$f */
    /* loaded from: classes.dex */
    public static final class C12246f extends Lambda implements Function1<S42, Unit> {
        public C12246f() {
            super(1);
        }

        /* renamed from: a */
        public final void m65222a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("focusGroup");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m65222a(s42);
            return Unit.INSTANCE;
        }
    }

    static {
        Function1 m99303a;
        if (K32.m99301c()) {
            m99303a = new C12246f();
        } else {
            m99303a = K32.m99303a();
        }
        f56583a = new J32(m99303a);
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m65237a(InterfaceC41563gV2 interfaceC41563gV2) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        return C11301d.m68799a(C11308g.m68784a(interfaceC41563gV2.mo39266t0(f56583a), C12228a.f56584g));
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m65236b(InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC48104rX2 interfaceC48104rX2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (K32.m99301c()) {
            m99303a = new C12229b(z, interfaceC48104rX2);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C12230c(interfaceC48104rX2, z));
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m65235c(InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC48104rX2 interfaceC48104rX2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (K32.m99301c()) {
            m99303a = new C12243d(z, interfaceC48104rX2);
        } else {
            m99303a = K32.m99303a();
        }
        return C32486Dt0.m109808a(interfaceC41563gV2, m99303a, new C12244e(z, interfaceC48104rX2));
    }
}
