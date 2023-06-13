package androidx.compose.p003ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p003ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010%\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010$¨\u0006)"}, m28432d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "LXt0;", "Landroidx/lifecycle/i;", "Lkotlin/Function0;", "", "content", "f", "(Lkotlin/jvm/functions/Function2;)V", "dispose", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "onStateChanged", "Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Landroidx/compose/ui/platform/AndroidComposeView;", "D", "()Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "c", "LXt0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()LXt0;", "original", "", DateTokenConverter.CONVERTER_KEY, "Z", "disposed", "Landroidx/lifecycle/f;", "e", "Landroidx/lifecycle/f;", "addedToLifecycle", "Lkotlin/jvm/functions/Function2;", "lastContent", "w", "()Z", "hasInvalidations", "isDisposed", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;LXt0;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.WrappedComposition */
/* loaded from: classes.dex */
public final class WrappedComposition implements InterfaceC37166Xt0, InterfaceC11728i {

    /* renamed from: b */
    public final AndroidComposeView f53225b;

    /* renamed from: c */
    public final InterfaceC37166Xt0 f53226c;

    /* renamed from: d */
    public boolean f53227d;

    /* renamed from: e */
    public AbstractC11719f f53228e;

    /* renamed from: f */
    public Function2<? super InterfaceC32720Et0, ? super Integer, Unit> f53229f;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "", C17296a.f69688o, "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$a */
    /* loaded from: classes.dex */
    public static final class C11367a extends Lambda implements Function1<AndroidComposeView.C11339b, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f53231h;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a */
        /* loaded from: classes.dex */
        public static final class C11368a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ WrappedComposition f53232g;

            /* renamed from: h */
            public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f53233h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", m28418f = "Wrapper.android.kt", m28417i = {}, m28416l = {153}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a */
            /* loaded from: classes.dex */
            public static final class C11369a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f53234h;

                /* renamed from: i */
                public final /* synthetic */ WrappedComposition f53235i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11369a(WrappedComposition wrappedComposition, Continuation<? super C11369a> continuation) {
                    super(2, continuation);
                    this.f53235i = wrappedComposition;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C11369a(this.f53235i, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C11369a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f53234h;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        AndroidComposeView m68495D = this.f53235i.m68495D();
                        this.f53234h = 1;
                        if (m68495D.m68561n0(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            /* loaded from: classes.dex */
            public static final class C11370b extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ WrappedComposition f53236g;

                /* renamed from: h */
                public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f53237h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11370b(WrappedComposition wrappedComposition, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
                    super(2);
                    this.f53236g = wrappedComposition;
                    this.f53237h = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                    invoke(interfaceC32720Et0, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                    if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                        interfaceC32720Et0.mo89548k();
                        return;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-1193460702, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                    }
                    C11411h.m68330a(this.f53236g.m68495D(), this.f53237h, interfaceC32720Et0, 8);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11368a(WrappedComposition wrappedComposition, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
                super(2);
                this.f53232g = wrappedComposition;
                this.f53233h = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                }
                AndroidComposeView m68495D = this.f53232g.m68495D();
                int i2 = C46424oh4.inspection_slot_table_set;
                Object tag = m68495D.getTag(i2);
                Set<InterfaceC38231au0> set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
                if (set == null) {
                    ViewParent parent = this.f53232g.m68495D().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i2) : null;
                    set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC32720Et0.mo89632H());
                    interfaceC32720Et0.mo89647C();
                }
                Y91.m75533f(this.f53232g.m68495D(), new C11369a(this.f53232g, null), interfaceC32720Et0, 72);
                C41806gu0.m37353a(new W94[]{U32.m82034a().m81907c(set)}, C43575jt0.m29791b(interfaceC32720Et0, -1193460702, true, new C11370b(this.f53232g, this.f53233h)), interfaceC32720Et0, 56);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11367a(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
            super(1);
            this.f53231h = function2;
        }

        /* renamed from: a */
        public final void m68492a(AndroidComposeView.C11339b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!WrappedComposition.this.f53227d) {
                AbstractC11719f lifecycle = it.m68545a().getLifecycle();
                WrappedComposition.this.f53229f = this.f53231h;
                if (WrappedComposition.this.f53228e == null) {
                    WrappedComposition.this.f53228e = lifecycle;
                    lifecycle.mo67008a(WrappedComposition.this);
                } else if (lifecycle.mo67007b().m67013b(AbstractC11719f.EnumC11724b.CREATED)) {
                    WrappedComposition.this.m68496C().mo44876f(C43575jt0.m29790c(-2000640158, true, new C11368a(WrappedComposition.this, this.f53231h)));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.C11339b c11339b) {
            m68492a(c11339b);
            return Unit.INSTANCE;
        }
    }

    public WrappedComposition(AndroidComposeView owner, InterfaceC37166Xt0 original) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f53225b = owner;
        this.f53226c = original;
        this.f53229f = C51875xt0.f118300a.m4510a();
    }

    /* renamed from: C */
    public final InterfaceC37166Xt0 m68496C() {
        return this.f53226c;
    }

    /* renamed from: D */
    public final AndroidComposeView m68495D() {
        return this.f53225b;
    }

    @Override // p000.InterfaceC37166Xt0
    public void dispose() {
        if (!this.f53227d) {
            this.f53227d = true;
            this.f53225b.m68611B0().setTag(C46424oh4.wrapped_composition_tag, null);
            AbstractC11719f abstractC11719f = this.f53228e;
            if (abstractC11719f != null) {
                abstractC11719f.mo67006d(this);
            }
        }
        this.f53226c.dispose();
    }

    @Override // p000.InterfaceC37166Xt0
    /* renamed from: e */
    public boolean mo44877e() {
        return this.f53226c.mo44877e();
    }

    @Override // p000.InterfaceC37166Xt0
    /* renamed from: f */
    public void mo44876f(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f53225b.setOnViewTreeOwnersAvailable(new C11367a(content));
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC11719f.EnumC11720a.ON_DESTROY) {
            dispose();
        } else if (event == AbstractC11719f.EnumC11720a.ON_CREATE && !this.f53227d) {
            mo44876f(this.f53229f);
        }
    }

    @Override // p000.InterfaceC37166Xt0
    /* renamed from: w */
    public boolean mo44870w() {
        return this.f53226c.mo44870w();
    }
}
