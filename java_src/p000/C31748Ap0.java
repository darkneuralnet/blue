package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bø\u0001\u0001¢\u0006\u0004\b%\u0010&J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J!\u0010\u0012\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, m28432d2 = {"LAp0;", "Lvb5;", "LPv4;", "LiA0;", "", C17296a.f69688o, "LQ14;", "interaction", "LZC0;", Action.SCOPE_ATTRIBUTE, "b", DateTokenConverter.CONVERTER_KEY, "onRemembered", "onForgotten", "onAbandoned", "LI61;", "Lpm0;", "color", "g", "(LI61;J)V", "", "c", "Z", "bounded", "Lk61;", "F", "radius", "LsP5;", "e", "LsP5;", "Lpb5;", "f", "rippleAlpha", "LOM5;", "Lqb5;", "LOM5;", "ripples", "<init>", "(ZFLsP5;LsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n215#2,2:120\n215#2,2:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n77#1:120,2\n99#1:122,2\n*E\n"})
/* renamed from: Ap0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31748Ap0 extends AbstractC50514vb5 implements InterfaceC35316Pv4 {

    /* renamed from: c */
    public final boolean f1168c;

    /* renamed from: d */
    public final float f1169d;

    /* renamed from: e */
    public final InterfaceC48627sP5<C47063pm0> f1170e;

    /* renamed from: f */
    public final InterfaceC48627sP5<C46958pb5> f1171f;

    /* renamed from: g */
    public final OM5<Q14, C47551qb5> f1172g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", m28418f = "CommonRipple.kt", m28417i = {}, m28416l = {87}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Ap0$a */
    /* loaded from: classes.dex */
    public static final class C0251a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f1173h;

        /* renamed from: i */
        public final /* synthetic */ C47551qb5 f1174i;

        /* renamed from: j */
        public final /* synthetic */ C31748Ap0 f1175j;

        /* renamed from: k */
        public final /* synthetic */ Q14 f1176k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0251a(C47551qb5 c47551qb5, C31748Ap0 c31748Ap0, Q14 q14, Continuation<? super C0251a> continuation) {
            super(2, continuation);
            this.f1174i = c47551qb5;
            this.f1175j = c31748Ap0;
            this.f1176k = q14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0251a(this.f1174i, this.f1175j, this.f1176k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C0251a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1173h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C47551qb5 c47551qb5 = this.f1174i;
                    this.f1173h = 1;
                    if (c47551qb5.m17345d(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f1175j.f1172g.remove(this.f1176k);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.f1175j.f1172g.remove(this.f1176k);
                throw th;
            }
        }
    }

    public /* synthetic */ C31748Ap0(boolean z, float f, InterfaceC48627sP5 interfaceC48627sP5, InterfaceC48627sP5 interfaceC48627sP52, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, interfaceC48627sP5, interfaceC48627sP52);
    }

    @Override // p000.InterfaceC52549z12
    /* renamed from: a */
    public void mo2014a(InterfaceC42558iA0 interfaceC42558iA0) {
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        long m18733w = this.f1170e.getValue().m18733w();
        interfaceC42558iA0.mo34387n0();
        m8395c(interfaceC42558iA0, this.f1169d, m18733w);
        m115139g(interfaceC42558iA0, m18733w);
    }

    @Override // p000.AbstractC50514vb5
    /* renamed from: b */
    public void mo8396b(Q14 interaction, ZC0 scope) {
        C32120Ce3 c32120Ce3;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        for (Map.Entry<Q14, C47551qb5> entry : this.f1172g.entrySet()) {
            entry.getValue().m17341h();
        }
        if (this.f1168c) {
            c32120Ce3 = C32120Ce3.m111955d(interaction.m89111a());
        } else {
            c32120Ce3 = null;
        }
        C47551qb5 c47551qb5 = new C47551qb5(c32120Ce3, this.f1169d, this.f1168c, null);
        this.f1172g.put(interaction, c47551qb5);
        Z30.m73800d(scope, null, null, new C0251a(c47551qb5, this, interaction, null), 3, null);
    }

    @Override // p000.AbstractC50514vb5
    /* renamed from: d */
    public void mo8394d(Q14 interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        C47551qb5 c47551qb5 = this.f1172g.get(interaction);
        if (c47551qb5 != null) {
            c47551qb5.m17341h();
        }
    }

    /* renamed from: g */
    public final void m115139g(I61 i61, long j) {
        boolean z;
        for (Map.Entry<Q14, C47551qb5> entry : this.f1172g.entrySet()) {
            C47551qb5 value = entry.getValue();
            float m19084d = this.f1171f.getValue().m19084d();
            if (m19084d == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                value.m17344e(i61, C47063pm0.m18743m(j, m19084d, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
        this.f1172g.clear();
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        this.f1172g.clear();
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
    }

    public C31748Ap0(boolean z, float f, InterfaceC48627sP5<C47063pm0> interfaceC48627sP5, InterfaceC48627sP5<C46958pb5> interfaceC48627sP52) {
        super(z, interfaceC48627sP52);
        this.f1168c = z;
        this.f1169d = f;
        this.f1170e = interfaceC48627sP5;
        this.f1171f = interfaceC48627sP52;
        this.f1172g = GM5.m105201f();
    }
}
