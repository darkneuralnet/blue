package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB \u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014ø\u0001\u0001¢\u0006\u0004\b/\u00100J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018RW\u0010&\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R/\u0010.\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b\u000f\u0010+\"\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m28432d2 = {"LyB5;", "LHm2;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "LG52;", "targetSize", C17296a.f69688o, "(J)J", "Llf;", "b", "Llf;", "g", "()Llf;", "animSpec", "LZC0;", "c", "LZC0;", "getScope", "()LZC0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startSize", "endSize", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "h", "()Lkotlin/jvm/functions/Function2;", "k", "(Lkotlin/jvm/functions/Function2;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LyB5$a;", "<set-?>", "e", "LEX2;", "()LyB5$a;", "j", "(LyB5$a;)V", "animData", "<init>", "(Llf;LZC0;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,162:1\n76#2:163\n102#2,2:164\n56#3,4:166\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n*L\n102#1:163\n102#1:164,2\n113#1:166,4\n*E\n"})
/* renamed from: yB5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52058yB5 extends AbstractC33361Hm2 {

    /* renamed from: b */
    public final InterfaceC25753lf<G52> f118935b;

    /* renamed from: c */
    public final ZC0 f118936c;

    /* renamed from: d */
    public Function2<? super G52, ? super G52, Unit> f118937d;

    /* renamed from: e */
    public final EX2 f118938e;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u0015\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR+\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m28432d2 = {"LyB5$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lne;", "LG52;", "Ltf;", C17296a.f69688o, "Lne;", "()Lne;", "anim", "b", "J", "()J", "c", "(J)V", "startSize", "<init>", "(Lne;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yB5$a */
    /* loaded from: classes.dex */
    public static final class C30473a {

        /* renamed from: a */
        public final C26560ne<G52, C28797tf> f118939a;

        /* renamed from: b */
        public long f118940b;

        public /* synthetic */ C30473a(C26560ne c26560ne, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(c26560ne, j);
        }

        /* renamed from: a */
        public final C26560ne<G52, C28797tf> m3866a() {
            return this.f118939a;
        }

        /* renamed from: b */
        public final long m3865b() {
            return this.f118940b;
        }

        /* renamed from: c */
        public final void m3864c(long j) {
            this.f118940b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C30473a) {
                C30473a c30473a = (C30473a) obj;
                return Intrinsics.areEqual(this.f118939a, c30473a.f118939a) && G52.m105831e(this.f118940b, c30473a.f118940b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f118939a.hashCode() * 31) + G52.m105828h(this.f118940b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f118939a + ", startSize=" + ((Object) G52.m105827i(this.f118940b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C30473a(C26560ne<G52, C28797tf> c26560ne, long j) {
            this.f118939a = c26560ne;
            this.f118940b = j;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", m28418f = "AnimationModifier.kt", m28417i = {}, m28416l = {124}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: yB5$b */
    /* loaded from: classes.dex */
    public static final class C30474b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f118941h;

        /* renamed from: i */
        public final /* synthetic */ C30473a f118942i;

        /* renamed from: j */
        public final /* synthetic */ long f118943j;

        /* renamed from: k */
        public final /* synthetic */ C52058yB5 f118944k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30474b(C30473a c30473a, long j, C52058yB5 c52058yB5, Continuation<? super C30474b> continuation) {
            super(2, continuation);
            this.f118942i = c30473a;
            this.f118943j = j;
            this.f118944k = c52058yB5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30474b(this.f118942i, this.f118943j, this.f118944k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30474b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Function2<G52, G52, Unit> m3869h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f118941h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C26560ne<G52, C28797tf> m3866a = this.f118942i.m3866a();
                G52 m105834b = G52.m105834b(this.f118943j);
                InterfaceC25753lf<G52> m3870g = this.f118944k.m3870g();
                this.f118941h = 1;
                obj = C26560ne.m23393f(m3866a, m105834b, m3870g, null, null, this, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C24979jf c24979jf = (C24979jf) obj;
            if (c24979jf.m30132a() == EnumC20481ff.Finished && (m3869h = this.f118944k.m3869h()) != null) {
                m3869h.invoke(G52.m105834b(this.f118942i.m3865b()), c24979jf.m30131b().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yB5$c */
    /* loaded from: classes.dex */
    public static final class C30475c extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f118945g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30475c(OU3 ou3) {
            super(1);
            this.f118945g = ou3;
        }

        /* renamed from: a */
        public final void m3863a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92205r(layout, this.f118945g, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m3863a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    public C52058yB5(InterfaceC25753lf<G52> animSpec, ZC0 scope) {
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(animSpec, "animSpec");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f118935b = animSpec;
        this.f118936c = scope;
        m97025e = LM5.m97025e(null, null, 2, null);
        this.f118938e = m97025e;
    }

    /* renamed from: a */
    public final long m3873a(long j) {
        C30473a m3872b = m3872b();
        if (m3872b != null) {
            if (!G52.m105831e(j, m3872b.m3866a().m23387l().m105826j())) {
                m3872b.m3864c(m3872b.m3866a().m23385n().m105826j());
                Z30.m73800d(this.f118936c, null, null, new C30474b(m3872b, j, this, null), 3, null);
            }
        } else {
            m3872b = new C30473a(new C26560ne(G52.m105834b(j), C37082Xj6.m76520e(G52.f10893b), G52.m105834b(H52.m104430a(1, 1)), null, 8, null), j, null);
        }
        m3868j(m3872b);
        return m3872b.m3866a().m23385n().m105826j();
    }

    /* renamed from: b */
    public final C30473a m3872b() {
        return (C30473a) this.f118938e.getValue();
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        OU3 mo8763P0 = measurable.mo8763P0(j);
        long m3873a = m3873a(H52.m104430a(mo8763P0.m92226i1(), mo8763P0.m92229d1()));
        return InterfaceC52765zO2.m1430Y(measure, G52.m105829g(m3873a), G52.m105830f(m3873a), null, new C30475c(mo8763P0), 4, null);
    }

    /* renamed from: g */
    public final InterfaceC25753lf<G52> m3870g() {
        return this.f118935b;
    }

    /* renamed from: h */
    public final Function2<G52, G52, Unit> m3869h() {
        return this.f118937d;
    }

    /* renamed from: j */
    public final void m3868j(C30473a c30473a) {
        this.f118938e.setValue(c30473a);
    }

    /* renamed from: k */
    public final void m3867k(Function2<? super G52, ? super G52, Unit> function2) {
        this.f118937d = function2;
    }
}
