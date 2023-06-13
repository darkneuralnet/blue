package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireFlagNestReason;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lz33;", "Lf1;", "LA33;", "LB33;", "renderer", "", "v", "Ls43;", "e", "Ls43;", "nestV3Manager", "Le13;", "f", "Le13;", "navigator", "<init>", "(Ls43;Le13;)V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlaggingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingPresenter.kt\nco/bird/android/feature/nestflagging/NestFlaggingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,76:1\n180#2:77\n180#2:78\n180#2:79\n180#2:80\n180#2:81\n*S KotlinDebug\n*F\n+ 1 NestFlaggingPresenter.kt\nco/bird/android/feature/nestflagging/NestFlaggingPresenter\n*L\n24#1:77\n30#1:78\n36#1:79\n42#1:80\n72#1:81\n*E\n"})
/* renamed from: z33  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52570z33 extends AbstractC20169f1<A33, B33> {

    /* renamed from: e */
    public final InterfaceC48430s43 f120690e;

    /* renamed from: f */
    public final InterfaceC40099e13 f120691f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z33$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30886a extends FunctionReferenceImpl implements Function1<String, AbstractC23442F<List<? extends WireFlagNestReason>>> {
        public C30886a(Object obj) {
            super(1, obj, InterfaceC48430s43.class, "getFlagNestReasons", "getFlagNestReasons(Ljava/lang/String;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<WireFlagNestReason>> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC48430s43) this.receiver).mo10889l(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "reasons", "", "Lco/bird/android/model/wire/WireFlagNestReason;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z33$b */
    /* loaded from: classes3.dex */
    public static final class C30887b extends Lambda implements Function1<List<? extends WireFlagNestReason>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LB33;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LB33;)LB33;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: z33$b$a */
        /* loaded from: classes3.dex */
        public static final class C30888a extends Lambda implements Function1<B33, B33> {

            /* renamed from: g */
            public final /* synthetic */ List<WireFlagNestReason> f120693g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30888a(List<WireFlagNestReason> list) {
                super(1);
                this.f120693g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final B33 invoke(B33 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<WireFlagNestReason> reasons = this.f120693g;
                Intrinsics.checkNotNullExpressionValue(reasons, "reasons");
                return B33.copy$default(state, reasons, null, null, null, 14, null);
            }
        }

        public C30887b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireFlagNestReason> list) {
            invoke2((List<WireFlagNestReason>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireFlagNestReason> list) {
            C52570z33.this.m42279i(new C30888a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlagNestReason;", "kotlin.jvm.PlatformType", "reason", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireFlagNestReason;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z33$c */
    /* loaded from: classes3.dex */
    public static final class C30889c extends Lambda implements Function1<WireFlagNestReason, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LB33;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LB33;)LB33;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: z33$c$a */
        /* loaded from: classes3.dex */
        public static final class C30890a extends Lambda implements Function1<B33, B33> {

            /* renamed from: g */
            public final /* synthetic */ WireFlagNestReason f120695g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30890a(WireFlagNestReason wireFlagNestReason) {
                super(1);
                this.f120695g = wireFlagNestReason;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final B33 invoke(B33 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return B33.copy$default(state, null, this.f120695g, null, null, 13, null);
            }
        }

        public C30889c() {
            super(1);
        }

        /* renamed from: a */
        public final void m1874a(WireFlagNestReason wireFlagNestReason) {
            C52570z33.this.m42279i(new C30890a(wireFlagNestReason));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireFlagNestReason wireFlagNestReason) {
            m1874a(wireFlagNestReason);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "comment", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z33$d */
    /* loaded from: classes3.dex */
    public static final class C30891d extends Lambda implements Function1<Optional<String>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LB33;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LB33;)LB33;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: z33$d$a */
        /* loaded from: classes3.dex */
        public static final class C30892a extends Lambda implements Function1<B33, B33> {

            /* renamed from: g */
            public final /* synthetic */ Optional<String> f120697g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30892a(Optional<String> optional) {
                super(1);
                this.f120697g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final B33 invoke(B33 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return B33.copy$default(state, null, null, this.f120697g.m59035e(), null, 11, null);
            }
        }

        public C30891d() {
            super(1);
        }

        /* renamed from: a */
        public final void m1872a(Optional<String> optional) {
            C52570z33.this.m42279i(new C30892a(optional));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m1872a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "suggestedCapacity", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z33$e */
    /* loaded from: classes3.dex */
    public static final class C30893e extends Lambda implements Function1<Optional<Integer>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LB33;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LB33;)LB33;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: z33$e$a */
        /* loaded from: classes3.dex */
        public static final class C30894a extends Lambda implements Function1<B33, B33> {

            /* renamed from: g */
            public final /* synthetic */ Optional<Integer> f120699g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30894a(Optional<Integer> optional) {
                super(1);
                this.f120699g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final B33 invoke(B33 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return B33.copy$default(state, null, null, null, this.f120699g.m59035e(), 7, null);
            }
        }

        public C30893e() {
            super(1);
        }

        /* renamed from: a */
        public final void m1870a(Optional<Integer> optional) {
            C52570z33.this.m42279i(new C30894a(optional));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Integer> optional) {
            m1870a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"", "<anonymous parameter 0>", "", "nestId", "Lco/bird/android/model/wire/WireFlagNestReason;", "selectedReason", "Lco/bird/android/buava/Optional;", "comment", "", "capacity", "Lwb4;", C17296a.f69688o, "(Lkotlin/Unit;Ljava/lang/String;Lco/bird/android/model/wire/WireFlagNestReason;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z33$f */
    /* loaded from: classes3.dex */
    public static final class C30895f extends Lambda implements Function5<Unit, String, WireFlagNestReason, Optional<String>, Optional<Integer>, C51106wb4<? extends String, ? extends String, ? extends String, ? extends Integer>> {

        /* renamed from: g */
        public static final C30895f f120700g = new C30895f();

        public C30895f() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* renamed from: a */
        public final C51106wb4<String, String, String, Integer> invoke(Unit unit, String nestId, WireFlagNestReason selectedReason, Optional<String> comment, Optional<Integer> capacity) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(nestId, "nestId");
            Intrinsics.checkNotNullParameter(selectedReason, "selectedReason");
            Intrinsics.checkNotNullParameter(comment, "comment");
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            return new C51106wb4<>(nestId, selectedReason.getCode(), comment.m59035e(), capacity.m59035e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: z33$g */
    /* loaded from: classes3.dex */
    public static final class C30896g extends Lambda implements Function1<C51106wb4<? extends String, ? extends String, ? extends String, ? extends Integer>, InterfaceC23447K<? extends Unit>> {
        public C30896g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Unit> invoke(C51106wb4<String, String, String, Integer> c51106wb4) {
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            String nestId = c51106wb4.m6614a();
            InterfaceC48430s43 interfaceC48430s43 = C52570z33.this.f120690e;
            Intrinsics.checkNotNullExpressionValue(nestId, "nestId");
            return interfaceC48430s43.mo10899b(nestId, c51106wb4.m6613b(), c51106wb4.m6612c(), c51106wb4.m6611d()).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z33$h */
    /* loaded from: classes3.dex */
    public static final class C30897h extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LB33;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LB33;)LB33;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nNestFlaggingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingPresenter.kt\nco/bird/android/feature/nestflagging/NestFlaggingPresenter$consume$8$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
        /* renamed from: z33$h$a */
        /* loaded from: classes3.dex */
        public static final class C30898a extends Lambda implements Function1<B33, B33> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f120703g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30898a(Throwable th) {
                super(1);
                this.f120703g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final B33 invoke(B33 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                B33 copy$default = B33.copy$default(state, null, null, null, null, 15, null);
                copy$default.m114762g(this.f120703g);
                return copy$default;
            }
        }

        public C30897h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C52570z33.this.m42279i(new C30898a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: z33$i */
    /* loaded from: classes3.dex */
    public static final class C30899i extends Lambda implements Function1<Unit, Unit> {
        public C30899i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C52570z33.this.f120691f.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52570z33(InterfaceC48430s43 nestV3Manager, InterfaceC40099e13 navigator) {
        super(new B33(null, null, null, null, 15, null));
        Intrinsics.checkNotNullParameter(nestV3Manager, "nestV3Manager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f120690e = nestV3Manager;
        this.f120691f = navigator;
    }

    /* renamed from: A */
    public static final C51106wb4 m1895A(Function5 tmp0, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C51106wb4) tmp0.invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: B */
    public static final InterfaceC23447K m1894B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m1893C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m1892D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m1891g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m1880w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m1879x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m1878y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m1877z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: v */
    public void consume(A33 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<String> mo57914N = renderer.mo57914N();
        final C30886a c30886a = new C30886a(this.f120690e);
        Observable<R> flatMapSingle = mo57914N.flatMapSingle(new InterfaceC23492o() { // from class: q33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1880w;
                m1880w = C52570z33.m1880w(Function1.this, obj);
                return m1880w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "renderer.nestId()\n      …ager::getFlagNestReasons)");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30887b c30887b = new C30887b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: r33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52570z33.m1891g(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo57910s().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30889c c30889c = new C30889c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: s33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52570z33.m1879x(Function1.this, obj);
            }
        });
        Object m33094as3 = renderer.mo57909y8().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30891d c30891d = new C30891d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: t33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52570z33.m1878y(Function1.this, obj);
            }
        });
        Object m33094as4 = renderer.mo57915E4().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30893e c30893e = new C30893e();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: u33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52570z33.m1877z(Function1.this, obj);
            }
        });
        Observable<Unit> mo57911c = renderer.mo57911c();
        Observable<String> mo57914N2 = renderer.mo57914N();
        Observable<WireFlagNestReason> mo57910s = renderer.mo57910s();
        Observable<Optional<String>> mo57909y8 = renderer.mo57909y8();
        Optional.C14443a c14443a = Optional.f63040c;
        Observable<Optional<String>> startWith = mo57909y8.startWith((Observable<Optional<String>>) c14443a.m59034a());
        Observable<Optional<Integer>> startWith2 = renderer.mo57915E4().startWith((Observable<Optional<Integer>>) c14443a.m59034a());
        final C30895f c30895f = C30895f.f120700g;
        Observable<R> withLatestFrom = mo57911c.withLatestFrom(mo57914N2, mo57910s, startWith, startWith2, new InterfaceC23487j() { // from class: v33
            @Override // io.reactivex.functions.InterfaceC23487j
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                C51106wb4 m1895A;
                m1895A = C52570z33.m1895A(Function5.this, obj, obj2, obj3, obj4, obj5);
                return m1895A;
            }
        });
        final C30896g c30896g = new C30896g();
        Observable observeOn = withLatestFrom.flatMapSingle(new InterfaceC23492o() { // from class: w33
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1894B;
                m1894B = C52570z33.m1894B(Function1.this, obj);
                return m1894B;
            }
        }).observeOn(C23454a.m33087a());
        final C30897h c30897h = new C30897h();
        Observable doOnError = observeOn.doOnError(new InterfaceC23484g() { // from class: x33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52570z33.m1893C(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun consume(ren…r.Result.RESULT_OK) }\n  }");
        Object m33094as5 = doOnError.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30899i c30899i = new C30899i();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: y33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52570z33.m1892D(Function1.this, obj);
            }
        });
    }
}
