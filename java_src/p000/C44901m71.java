package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0003B%\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Lm71;", "", "", C17296a.f69688o, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "e", "()F", "LtX5;", "Lo71;", "LtX5;", "c", "()LtX5;", "swipeableState", "", DateTokenConverter.CONVERTER_KEY, "()Z", "isOpen", "b", "()Lo71;", "currentValue", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Lo71;Lkotlin/jvm/functions/Function1;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44901m71 {

    /* renamed from: b */
    public static final C25916a f97369b = new C25916a(null);

    /* renamed from: a */
    public final C49292tX5<EnumC46087o71> f97370a;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u000b"}, m28432d2 = {"Lm71$a;", "", "Lkotlin/Function1;", "Lo71;", "", "confirmStateChange", "LRi5;", "Lm71;", C17296a.f69688o, "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: m71$a */
    /* loaded from: classes.dex */
    public static final class C25916a {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "Lm71;", "it", "Lo71;", C17296a.f69688o, "(LTi5;Lm71;)Lo71;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: m71$a$a */
        /* loaded from: classes.dex */
        public static final class C25917a extends Lambda implements Function2<InterfaceC36136Ti5, C44901m71, EnumC46087o71> {

            /* renamed from: g */
            public static final C25917a f97371g = new C25917a();

            public C25917a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final EnumC46087o71 invoke(InterfaceC36136Ti5 Saver, C44901m71 it) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return it.m26325b();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lo71;", "it", "Lm71;", C17296a.f69688o, "(Lo71;)Lm71;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: m71$a$b */
        /* loaded from: classes.dex */
        public static final class C25918b extends Lambda implements Function1<EnumC46087o71, C44901m71> {

            /* renamed from: g */
            public final /* synthetic */ Function1<EnumC46087o71, Boolean> f97372g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C25918b(Function1<? super EnumC46087o71, Boolean> function1) {
                super(1);
                this.f97372g = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C44901m71 invoke(EnumC46087o71 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C44901m71(it, this.f97372g);
            }
        }

        public /* synthetic */ C25916a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC35668Ri5<C44901m71, EnumC46087o71> m26321a(Function1<? super EnumC46087o71, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return C35902Si5.m85006a(C25917a.f97371g, new C25918b(confirmStateChange));
        }

        private C25916a() {
        }
    }

    public C44901m71(EnumC46087o71 initialValue, Function1<? super EnumC46087o71, Boolean> confirmStateChange) {
        C49330tb6 c49330tb6;
        float f;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        c49330tb6 = C44308l71.f95512c;
        f = C44308l71.f95511b;
        this.f97370a = new C49292tX5<>(initialValue, c49330tb6, confirmStateChange, null, f, 8, null);
    }

    /* renamed from: a */
    public final Object m26326a(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m12129g = C49292tX5.m12129g(this.f97370a, EnumC46087o71.Closed, 0.0f, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m12129g == coroutine_suspended ? m12129g : Unit.INSTANCE;
    }

    /* renamed from: b */
    public final EnumC46087o71 m26325b() {
        return this.f97370a.m12122n();
    }

    /* renamed from: c */
    public final C49292tX5<EnumC46087o71> m26324c() {
        return this.f97370a;
    }

    /* renamed from: d */
    public final boolean m26323d() {
        return m26325b() == EnumC46087o71.Open;
    }

    /* renamed from: e */
    public final float m26322e() {
        return this.f97370a.m12112x();
    }
}
