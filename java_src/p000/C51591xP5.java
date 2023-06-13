package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\r\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, m28432d2 = {"LxP5;", "", "Ld62;", "interaction", "LZC0;", Action.SCOPE_ATTRIBUTE, "", "c", "LI61;", "Lk61;", "radius", "Lpm0;", "color", "b", "(LI61;FJ)V", "", C17296a.f69688o, "Z", "bounded", "LsP5;", "Lpb5;", "LsP5;", "rippleAlpha", "Lne;", "", "Lsf;", "Lne;", "animatedAlpha", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "interactions", "e", "Ld62;", "currentInteraction", "<init>", "(ZLsP5;)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,355:1\n138#2:356\n214#3,8:357\n261#3,11:365\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n304#1:356\n316#1:357,8\n316#1:365,11\n*E\n"})
/* renamed from: xP5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51591xP5 {

    /* renamed from: a */
    public final boolean f117573a;

    /* renamed from: b */
    public final InterfaceC48627sP5<C46958pb5> f117574b;

    /* renamed from: c */
    public final C26560ne<Float, C28366sf> f117575c;

    /* renamed from: d */
    public final List<InterfaceC39556d62> f117576d;

    /* renamed from: e */
    public InterfaceC39556d62 f117577e;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", m28418f = "Ripple.kt", m28417i = {}, m28416l = {290}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xP5$a */
    /* loaded from: classes.dex */
    public static final class C30166a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117578h;

        /* renamed from: j */
        public final /* synthetic */ float f117580j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC25753lf<Float> f117581k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30166a(float f, InterfaceC25753lf<Float> interfaceC25753lf, Continuation<? super C30166a> continuation) {
            super(2, continuation);
            this.f117580j = f;
            this.f117581k = interfaceC25753lf;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30166a(this.f117580j, this.f117581k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30166a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117578h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C26560ne c26560ne = C51591xP5.this.f117575c;
                Float boxFloat = Boxing.boxFloat(this.f117580j);
                InterfaceC25753lf<Float> interfaceC25753lf = this.f117581k;
                this.f117578h = 1;
                if (C26560ne.m23393f(c26560ne, boxFloat, interfaceC25753lf, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", m28418f = "Ripple.kt", m28417i = {}, m28416l = {296}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xP5$b */
    /* loaded from: classes.dex */
    public static final class C30167b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117582h;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC25753lf<Float> f117584j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30167b(InterfaceC25753lf<Float> interfaceC25753lf, Continuation<? super C30167b> continuation) {
            super(2, continuation);
            this.f117584j = interfaceC25753lf;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30167b(this.f117584j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30167b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117582h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C26560ne c26560ne = C51591xP5.this.f117575c;
                Float boxFloat = Boxing.boxFloat(0.0f);
                InterfaceC25753lf<Float> interfaceC25753lf = this.f117584j;
                this.f117582h = 1;
                if (C26560ne.m23393f(c26560ne, boxFloat, interfaceC25753lf, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public C51591xP5(boolean z, InterfaceC48627sP5<C46958pb5> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f117573a = z;
        this.f117574b = rippleAlpha;
        this.f117575c = C28794te.m11987b(0.0f, 0.0f, 2, null);
        this.f117576d = new ArrayList();
    }

    /* renamed from: b */
    public final void m5292b(I61 drawStateLayer, float f, long j) {
        float mo3411T0;
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        if (Float.isNaN(f)) {
            mo3411T0 = C48144rb5.m15716a(drawStateLayer, this.f117573a, drawStateLayer.mo96360h());
        } else {
            mo3411T0 = drawStateLayer.mo3411T0(f);
        }
        float f2 = mo3411T0;
        float floatValue = this.f117575c.m23385n().floatValue();
        if (floatValue > 0.0f) {
            long m18743m = C47063pm0.m18743m(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.f117573a) {
                float m5730i = C51465xB5.m5730i(drawStateLayer.mo96360h());
                float m5732g = C51465xB5.m5732g(drawStateLayer.mo96360h());
                int m86404b = C35681Rk0.f32493a.m86404b();
                C61 mo20750d0 = drawStateLayer.mo20750d0();
                long mo20721h = mo20750d0.mo20721h();
                mo20750d0.mo20724a().mo25245v();
                mo20750d0.mo20722c().mo19028a(0.0f, 0.0f, m5730i, m5732g, m86404b);
                I61.m102955J(drawStateLayer, m18743m, f2, 0L, 0.0f, null, null, 0, 124, null);
                mo20750d0.mo20724a().mo25251p();
                mo20750d0.mo20723b(mo20721h);
                return;
            }
            I61.m102955J(drawStateLayer, m18743m, f2, 0L, 0.0f, null, null, 0, 124, null);
        }
    }

    /* renamed from: c */
    public final void m5291c(InterfaceC39556d62 interaction, ZC0 scope) {
        Object lastOrNull;
        InterfaceC25753lf m6606d;
        float f;
        InterfaceC25753lf m6607c;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        boolean z = interaction instanceof C43269jN1;
        if (z) {
            this.f117576d.add(interaction);
        } else if (interaction instanceof C43862kN1) {
            this.f117576d.remove(((C43862kN1) interaction).m29037a());
        } else if (interaction instanceof C51896xv1) {
            this.f117576d.add(interaction);
        } else if (interaction instanceof C52489yv1) {
            this.f117576d.remove(((C52489yv1) interaction).m2262a());
        } else if (interaction instanceof C48448s61) {
            this.f117576d.add(interaction);
        } else if (interaction instanceof C49041t61) {
            this.f117576d.remove(((C49041t61) interaction).m13078a());
        } else if (interaction instanceof C47856r61) {
            this.f117576d.remove(((C47856r61) interaction).m16484a());
        } else {
            return;
        }
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f117576d);
        InterfaceC39556d62 interfaceC39556d62 = (InterfaceC39556d62) lastOrNull;
        if (!Intrinsics.areEqual(this.f117577e, interfaceC39556d62)) {
            if (interfaceC39556d62 != null) {
                if (z) {
                    f = this.f117574b.getValue().m19085c();
                } else if (interaction instanceof C51896xv1) {
                    f = this.f117574b.getValue().m19086b();
                } else if (interaction instanceof C48448s61) {
                    f = this.f117574b.getValue().m19087a();
                } else {
                    f = 0.0f;
                }
                m6607c = C51107wb5.m6607c(interfaceC39556d62);
                Z30.m73800d(scope, null, null, new C30166a(f, m6607c, null), 3, null);
            } else {
                m6606d = C51107wb5.m6606d(this.f117577e);
                Z30.m73800d(scope, null, null, new C30167b(m6606d, null), 3, null);
            }
            this.f117577e = interfaceC39556d62;
        }
    }
}
