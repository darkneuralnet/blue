package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.api.response.WarehouseValidationResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.InterfaceC44647lh6;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LBy6;", "", "LTx6;", "renderer", "", "p", "Lkotlin/Function1;", "LUx6;", "reducer", "F", "Llh6;", C17296a.f69688o, "Llh6;", "userManager", "LSy6;", "b", "LSy6;", "warehouseManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lio/reactivex/subjects/a;", "e", "Lio/reactivex/subjects/a;", TransferTable.COLUMN_STATE, "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "<init>", "(Llh6;LSy6;LTq4;Le13;)V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseCheckerLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseCheckerLite.kt\nco/bird/android/warehousechecker/WarehouseCheckerLite\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,146:1\n180#2:147\n180#2:148\n180#2:149\n180#2:150\n*S KotlinDebug\n*F\n+ 1 WarehouseCheckerLite.kt\nco/bird/android/warehousechecker/WarehouseCheckerLite\n*L\n36#1:147\n91#1:148\n119#1:149\n134#1:150\n*E\n"})
/* renamed from: By6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32069By6 {

    /* renamed from: a */
    public final InterfaceC44647lh6 f3152a;

    /* renamed from: b */
    public final InterfaceC36047Sy6 f3153b;

    /* renamed from: c */
    public final C36207Tq4 f3154c;

    /* renamed from: d */
    public final InterfaceC40099e13 f3155d;

    /* renamed from: e */
    public final C24552a<C36506Ux6> f3156e;

    /* renamed from: f */
    public ScopeProvider f3157f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WarehouseValidationResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lco/bird/api/response/WarehouseValidationResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$a */
    /* loaded from: classes4.dex */
    public static final class C0786a extends Lambda implements Function1<WarehouseValidationResponse, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUx6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LUx6;)LUx6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: By6$a$a */
        /* loaded from: classes4.dex */
        public static final class C0787a extends Lambda implements Function1<C36506Ux6, C36506Ux6> {

            /* renamed from: g */
            public final /* synthetic */ Warehouse f3159g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0787a(Warehouse warehouse) {
                super(1);
                this.f3159g = warehouse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36506Ux6 invoke(C36506Ux6 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C36506Ux6.copy$default(state, null, null, this.f3159g, false, null, 11, null);
            }
        }

        public C0786a() {
            super(1);
        }

        /* renamed from: a */
        public final void m113176a(WarehouseValidationResponse warehouseValidationResponse) {
            boolean component1 = warehouseValidationResponse.component1();
            Warehouse component2 = warehouseValidationResponse.component2();
            if (!component1 && component2 != null) {
                C32069By6.this.m113203F(new C0787a(component2));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseValidationResponse warehouseValidationResponse) {
            m113176a(warehouseValidationResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: By6$b */
    /* loaded from: classes4.dex */
    public static final class C0788b extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUx6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LUx6;)LUx6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: By6$b$a */
        /* loaded from: classes4.dex */
        public static final class C0789a extends Lambda implements Function1<C36506Ux6, C36506Ux6> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f3161g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0789a(Throwable th) {
                super(1);
                this.f3161g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36506Ux6 invoke(C36506Ux6 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C36506Ux6.copy$default(state, null, null, null, false, this.f3161g, 15, null);
            }
        }

        public C0788b() {
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
            C32069By6.this.m113203F(new C0789a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$c */
    /* loaded from: classes4.dex */
    public static final class C0790c extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends User>> {
        public C0790c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends User> invoke(DialogResponse response) {
            String str;
            List split$default;
            Warehouse m80583d;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response == DialogResponse.OK) {
                C36506Ux6 c36506Ux6 = (C36506Ux6) C32069By6.this.f3156e.getValue();
                if (c36506Ux6 != null && (m80583d = c36506Ux6.m80583d()) != null) {
                    str = m80583d.getId();
                } else {
                    str = null;
                }
                String str2 = str;
                InterfaceC44647lh6 interfaceC44647lh6 = C32069By6.this.f3152a;
                String m7765i = C50711vv2.m7769e().m7765i();
                Intrinsics.checkNotNullExpressionValue(m7765i, "getDefault().toLanguageTags()");
                split$default = StringsKt__StringsKt.split$default((CharSequence) m7765i, new String[]{","}, false, 0, 6, (Object) null);
                return InterfaceC44647lh6.C25764a.updateUser$default(interfaceC44647lh6, null, null, null, null, (String) split$default.get(0), str2, 15, null).firstElement();
            }
            C32069By6.this.f3155d.mo37005i4();
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: By6$d */
    /* loaded from: classes4.dex */
    public static final class C0791d extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUx6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LUx6;)LUx6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: By6$d$a */
        /* loaded from: classes4.dex */
        public static final class C0792a extends Lambda implements Function1<C36506Ux6, C36506Ux6> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f3164g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0792a(Throwable th) {
                super(1);
                this.f3164g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36506Ux6 invoke(C36506Ux6 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C36506Ux6.copy$default(state, null, null, null, false, this.f3164g, 15, null);
            }
        }

        public C0791d() {
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
            C32069By6.this.m113203F(new C0792a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$e */
    /* loaded from: classes4.dex */
    public static final class C0793e extends Lambda implements Function1<User, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUx6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LUx6;)LUx6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: By6$e$a */
        /* loaded from: classes4.dex */
        public static final class C0794a extends Lambda implements Function1<C36506Ux6, C36506Ux6> {

            /* renamed from: g */
            public static final C0794a f3166g = new C0794a();

            public C0794a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36506Ux6 invoke(C36506Ux6 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C36506Ux6.copy$default(state, null, null, null, false, null, 11, null);
            }
        }

        public C0793e() {
            super(1);
        }

        /* renamed from: a */
        public final void m113171a(User user) {
            C32069By6.this.m113203F(C0794a.f3166g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m113171a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: By6$f */
    /* loaded from: classes4.dex */
    public static final class C0795f extends Lambda implements Function1<Unit, Unit> {
        public C0795f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C32069By6.this.f3155d.mo37005i4();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: By6$g */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0796g extends FunctionReferenceImpl implements Function1<C36506Ux6, Unit> {
        public C0796g(Object obj) {
            super(1, obj, InterfaceC36272Tx6.class, "renderWarehouseState", "renderWarehouseState(Lco/bird/android/warehousechecker/WarehouseCheckState;)V", 0);
        }

        /* renamed from: a */
        public final void m113169a(C36506Ux6 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC36272Tx6) this.receiver).mo56405e8(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36506Ux6 c36506Ux6) {
            m113169a(c36506Ux6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: By6$h */
    /* loaded from: classes4.dex */
    public static final class C0797h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC36272Tx6 f3168g;

        /* renamed from: h */
        public final /* synthetic */ C32069By6 f3169h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0797h(InterfaceC36272Tx6 interfaceC36272Tx6, C32069By6 c32069By6) {
            super(1);
            this.f3168g = interfaceC36272Tx6;
            this.f3169h = c32069By6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC36272Tx6 interfaceC36272Tx6 = this.f3168g;
            C24552a c24552a = this.f3169h.f3156e;
            C41318g46.m40158f(th, "render: " + interfaceC36272Tx6 + ", state: " + c24552a, new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$i */
    /* loaded from: classes4.dex */
    public static final class C0798i extends Lambda implements Function1<Unit, InterfaceC23447K<? extends User>> {
        public C0798i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends User> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C32069By6.this.f3152a.getUser();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$j */
    /* loaded from: classes4.dex */
    public static final class C0799j extends Lambda implements Function1<User, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUx6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LUx6;)LUx6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: By6$j$a */
        /* loaded from: classes4.dex */
        public static final class C0800a extends Lambda implements Function1<C36506Ux6, C36506Ux6> {

            /* renamed from: g */
            public final /* synthetic */ User f3172g;

            /* renamed from: h */
            public final /* synthetic */ C32069By6 f3173h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0800a(User user, C32069By6 c32069By6) {
                super(1);
                this.f3172g = user;
                this.f3173h = c32069By6;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36506Ux6 invoke(C36506Ux6 state) {
                boolean z;
                Intrinsics.checkNotNullParameter(state, "state");
                User user = this.f3172g;
                if (user.getWarehouseId() == null && this.f3173h.f3154c.m82623f8().m73665a().getServiceCenterConfig().getEnableEnterLocationModal()) {
                    z = true;
                } else {
                    z = false;
                }
                return C36506Ux6.copy$default(state, user, null, null, z, null, 6, null);
            }
        }

        public C0799j() {
            super(1);
        }

        /* renamed from: a */
        public final void m113168a(User user) {
            C32069By6 c32069By6 = C32069By6.this;
            c32069By6.m113203F(new C0800a(user, c32069By6));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m113168a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$k */
    /* loaded from: classes4.dex */
    public static final class C0801k extends Lambda implements Function1<User, Boolean> {

        /* renamed from: g */
        public static final C0801k f3174g = new C0801k();

        public C0801k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(User user) {
            boolean z;
            Intrinsics.checkNotNullParameter(user, "user");
            if (user.getWarehouseId() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseCheckerLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseCheckerLite.kt\nco/bird/android/warehousechecker/WarehouseCheckerLite$consume$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
    /* renamed from: By6$l */
    /* loaded from: classes4.dex */
    public static final class C0802l extends Lambda implements Function1<User, InterfaceC23447K<? extends Warehouse>> {
        public C0802l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Warehouse> invoke(User user) {
            AbstractC23442F<HM4<Warehouse>> mo82208a;
            Intrinsics.checkNotNullParameter(user, "user");
            String warehouseId = user.getWarehouseId();
            if (warehouseId != null && (mo82208a = C32069By6.this.f3153b.mo82208a(warehouseId)) != null) {
                return C38096ag5.m70883l(mo82208a);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "warehouse", "", C17296a.f69688o, "(Lco/bird/android/model/Warehouse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$m */
    /* loaded from: classes4.dex */
    public static final class C0803m extends Lambda implements Function1<Warehouse, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LUx6;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LUx6;)LUx6;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: By6$m$a */
        /* loaded from: classes4.dex */
        public static final class C0804a extends Lambda implements Function1<C36506Ux6, C36506Ux6> {

            /* renamed from: g */
            public final /* synthetic */ Warehouse f3177g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0804a(Warehouse warehouse) {
                super(1);
                this.f3177g = warehouse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C36506Ux6 invoke(C36506Ux6 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C36506Ux6.copy$default(state, null, this.f3177g, null, false, null, 13, null);
            }
        }

        public C0803m() {
            super(1);
        }

        /* renamed from: a */
        public final void m113164a(Warehouse warehouse) {
            C32069By6.this.m113203F(new C0804a(warehouse));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Warehouse warehouse) {
            m113164a(warehouse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/Warehouse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Warehouse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$n */
    /* loaded from: classes4.dex */
    public static final class C0805n extends Lambda implements Function1<Warehouse, Boolean> {
        public C0805n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Warehouse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C32069By6.this.f3154c.m82623f8().getValue().getServiceCenterConfig().getValidateWarehouse());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Warehouse;", "it", "Lio/reactivex/K;", "Lco/bird/api/response/WarehouseValidationResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Warehouse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: By6$o */
    /* loaded from: classes4.dex */
    public static final class C0806o extends Lambda implements Function1<Warehouse, InterfaceC23447K<? extends WarehouseValidationResponse>> {
        public C0806o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WarehouseValidationResponse> invoke(Warehouse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C38096ag5.m70883l(C32069By6.this.f3153b.mo82207b());
        }
    }

    public C32069By6(InterfaceC44647lh6 userManager, InterfaceC36047Sy6 warehouseManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(warehouseManager, "warehouseManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f3152a = userManager;
        this.f3153b = warehouseManager;
        this.f3154c = reactiveConfig;
        this.f3155d = navigator;
        C24552a<C36506Ux6> m31921g = C24552a.m31921g(new C36506Ux6(null, null, null, false, null, 31, null));
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(WarehouseCheckState())");
        this.f3156e = m31921g;
    }

    /* renamed from: A */
    public static final InterfaceC23447K m113208A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m113207B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m113206C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public static final InterfaceC23447K m113205D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m113204E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m113186q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m113185r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m113184s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC24574u m113183t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m113182u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m113181v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m113180w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23447K m113179x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m113178y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final boolean m113177z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: F */
    public final void m113203F(Function1<? super C36506Ux6, C36506Ux6> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        C36506Ux6 value = this.f3156e.getValue();
        if (value != null) {
            this.f3156e.onNext(reducer.invoke(value));
        }
    }

    /* renamed from: p */
    public final void m113187p(InterfaceC36272Tx6 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f3157f = renderer;
        Observable<C36506Ux6> observeOn = this.f3156e.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "state\n      .observeOn(A…dSchedulers.mainThread())");
        ScopeProvider scopeProvider = this.f3157f;
        ScopeProvider scopeProvider2 = null;
        if (scopeProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Action.SCOPE_ATTRIBUTE);
            scopeProvider = null;
        }
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0796g c0796g = new C0796g(renderer);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: my6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113186q(Function1.this, obj);
            }
        };
        final C0797h c0797h = new C0797h(renderer, this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: xy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113185r(Function1.this, obj);
            }
        });
        Observable<Unit> mo56409W7 = renderer.mo56409W7();
        final C0798i c0798i = new C0798i();
        Observable<R> flatMapSingle = mo56409W7.flatMapSingle(new InterfaceC23492o() { // from class: yy6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m113179x;
                m113179x = C32069By6.m113179x(Function1.this, obj);
                return m113179x;
            }
        });
        final C0799j c0799j = new C0799j();
        Observable doOnNext = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: zy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113178y(Function1.this, obj);
            }
        });
        final C0801k c0801k = C0801k.f3174g;
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: Ay6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m113177z;
                m113177z = C32069By6.m113177z(Function1.this, obj);
                return m113177z;
            }
        });
        final C0802l c0802l = new C0802l();
        Observable flatMapSingle2 = filter.flatMapSingle(new InterfaceC23492o() { // from class: ny6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m113208A;
                m113208A = C32069By6.m113208A(Function1.this, obj);
                return m113208A;
            }
        });
        final C0803m c0803m = new C0803m();
        Observable doOnNext2 = flatMapSingle2.doOnNext(new InterfaceC23484g() { // from class: oy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113207B(Function1.this, obj);
            }
        });
        final C0805n c0805n = new C0805n();
        Observable filter2 = doOnNext2.filter(new InterfaceC23494q() { // from class: py6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m113206C;
                m113206C = C32069By6.m113206C(Function1.this, obj);
                return m113206C;
            }
        });
        final C0806o c0806o = new C0806o();
        Observable flatMapSingle3 = filter2.flatMapSingle(new InterfaceC23492o() { // from class: qy6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m113205D;
                m113205D = C32069By6.m113205D(Function1.this, obj);
                return m113205D;
            }
        });
        final C0786a c0786a = new C0786a();
        Observable doOnNext3 = flatMapSingle3.doOnNext(new InterfaceC23484g() { // from class: ry6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113204E(Function1.this, obj);
            }
        });
        final C0788b c0788b = new C0788b();
        Observable subscribeOn = doOnNext3.doOnError(new InterfaceC23484g() { // from class: sy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113184s(Function1.this, obj);
            }
        }).retry().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "fun consume(renderer: Wa…ator.goToSettings() }\n  }");
        ScopeProvider scopeProvider3 = this.f3157f;
        if (scopeProvider3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Action.SCOPE_ATTRIBUTE);
            scopeProvider3 = null;
        }
        Object m33094as2 = subscribeOn.m33094as(AutoDispose.m45239a(scopeProvider3));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable<DialogResponse> mo56400z5 = renderer.mo56400z5();
        final C0790c c0790c = new C0790c();
        Observable<R> flatMapMaybe = mo56400z5.flatMapMaybe(new InterfaceC23492o() { // from class: ty6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m113183t;
                m113183t = C32069By6.m113183t(Function1.this, obj);
                return m113183t;
            }
        });
        final C0791d c0791d = new C0791d();
        Observable retry = flatMapMaybe.doOnError(new InterfaceC23484g() { // from class: uy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113182u(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun consume(renderer: Wa…ator.goToSettings() }\n  }");
        ScopeProvider scopeProvider4 = this.f3157f;
        if (scopeProvider4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Action.SCOPE_ATTRIBUTE);
            scopeProvider4 = null;
        }
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(scopeProvider4));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0793e c0793e = new C0793e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: vy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113181v(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(renderer.mo56402v1(), renderer.mo56414D0());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      renderer.op…ingSettingsClicks()\n    )");
        ScopeProvider scopeProvider5 = this.f3157f;
        if (scopeProvider5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Action.SCOPE_ATTRIBUTE);
        } else {
            scopeProvider2 = scopeProvider5;
        }
        Object m33094as4 = merge.m33094as(AutoDispose.m45239a(scopeProvider2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0795f c0795f = new C0795f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: wy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32069By6.m113180w(Function1.this, obj);
            }
        });
    }
}
