package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.TaskOrderData;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.persistence.FlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.TaskOrderInfo;
import co.bird.api.request.TaskOrderRequest;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006 "}, m28432d2 = {"LzZ5;", "LtZ5;", "", "birdId", "birdCode", "Lio/reactivex/c;", "b", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "refresh", "n", "Lom3;", "Lom3;", "operatorManager", "LsZ5;", "LsZ5;", "taskOrderClient", "La94;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/TaskOrderData;", "c", "La94;", "mutableTaskData", "Ljava/lang/String;", "taskOrderBirdId", "LZ84;", "e", "LZ84;", "()LZ84;", "taskOrderData", "<init>", "(Lom3;LsZ5;)V", "task-order_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zZ5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52867zZ5 implements InterfaceC49310tZ5 {

    /* renamed from: a */
    public final InterfaceC46473om3 f121528a;

    /* renamed from: b */
    public final InterfaceC48717sZ5 f121529b;

    /* renamed from: c */
    public final C37791a94<Optional<TaskOrderData>> f121530c;

    /* renamed from: d */
    public String f121531d;

    /* renamed from: e */
    public final Z84<Optional<TaskOrderData>> f121532e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zZ5$a */
    /* loaded from: classes4.dex */
    public static final class C31040a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C31040a f121533g = new C31040a();

        public C31040a() {
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
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zZ5$b */
    /* loaded from: classes4.dex */
    public static final class C31041b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C31041b f121534g = new C31041b();

        public C31041b() {
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
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FlightSheetDetails;", "kotlin.jvm.PlatformType", "flightSheetDetails", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/FlightSheetDetails;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zZ5$c */
    /* loaded from: classes4.dex */
    public static final class C31042c extends Lambda implements Function1<FlightSheetDetails, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f121536h;

        /* renamed from: i */
        public final /* synthetic */ String f121537i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31042c(String str, String str2) {
            super(1);
            this.f121536h = str;
            this.f121537i = str2;
        }

        /* renamed from: a */
        public final void m1094a(FlightSheetDetails flightSheetDetails) {
            Unit unit;
            C52867zZ5.this.f121531d = this.f121536h;
            TaskOrderInfo taskOrderInfo = flightSheetDetails.getTaskOrderInfo();
            if (taskOrderInfo != null) {
                C52867zZ5.this.f121530c.accept(Optional.f63040c.m59032c(new TaskOrderData(this.f121536h, this.f121537i, taskOrderInfo)));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C52867zZ5.this.f121530c.accept(Optional.f63040c.m59034a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlightSheetDetails flightSheetDetails) {
            m1094a(flightSheetDetails);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zZ5$d */
    /* loaded from: classes4.dex */
    public static final class C31043d extends Lambda implements Function1<Throwable, Unit> {
        public C31043d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C52867zZ5.this.f121531d = null;
            C52867zZ5.this.f121530c.accept(Optional.f63040c.m59034a());
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zZ5$e */
    /* loaded from: classes4.dex */
    public static final class C31044e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C31044e f121539g = new C31044e();

        public C31044e() {
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
        }
    }

    public C52867zZ5(InterfaceC46473om3 operatorManager, InterfaceC48717sZ5 taskOrderClient) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(taskOrderClient, "taskOrderClient");
        this.f121528a = operatorManager;
        this.f121529b = taskOrderClient;
        C37791a94<Optional<TaskOrderData>> create$default = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        this.f121530c = create$default;
        this.f121532e = Z84.f47888d.m73663b(create$default);
    }

    /* renamed from: j */
    public static final void m1100j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m1099k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m1098l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m1097m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m1095o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC49310tZ5
    /* renamed from: a */
    public AbstractC23461c mo1109a() {
        AbstractC23461c abstractC23461c;
        String str = this.f121531d;
        if (str != null) {
            AbstractC23461c m14001b = this.f121529b.m14001b(new TaskOrderRequest(str));
            final C31040a c31040a = C31040a.f121533g;
            abstractC23461c = m14001b.m33084B(new InterfaceC23484g() { // from class: xZ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52867zZ5.m1100j(Function1.this, obj);
                }
            }).m33069Q();
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c == null) {
            return m1096n();
        }
        return abstractC23461c;
    }

    @Override // p000.InterfaceC49310tZ5
    /* renamed from: b */
    public AbstractC23461c mo1108b(String birdId, String birdCode) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        AbstractC23442F<FlightSheetDetails> firstOrError = this.f121528a.mo8122Y(birdId, FlightSheetContext.STANDARD).firstOrError();
        final C31042c c31042c = new C31042c(birdId, birdCode);
        AbstractC23442F<FlightSheetDetails> m33101w = firstOrError.m33101w(new InterfaceC23484g() { // from class: uZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52867zZ5.m1098l(Function1.this, obj);
            }
        });
        final C31043d c31043d = new C31043d();
        AbstractC23461c m33159G = m33101w.m33106t(new InterfaceC23484g() { // from class: vZ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52867zZ5.m1097m(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun getTaskOrde…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC49310tZ5
    /* renamed from: c */
    public Z84<Optional<TaskOrderData>> mo1107c() {
        return this.f121532e;
    }

    @Override // p000.InterfaceC49310tZ5
    /* renamed from: d */
    public AbstractC23461c mo1106d() {
        AbstractC23461c abstractC23461c;
        String str = this.f121531d;
        if (str != null) {
            AbstractC23461c m14002a = this.f121529b.m14002a(new TaskOrderRequest(str));
            final C31041b c31041b = C31041b.f121534g;
            abstractC23461c = m14002a.m33084B(new InterfaceC23484g() { // from class: wZ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52867zZ5.m1099k(Function1.this, obj);
                }
            }).m33069Q();
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c == null) {
            return m1096n();
        }
        return abstractC23461c;
    }

    /* renamed from: n */
    public final AbstractC23461c m1096n() {
        RuntimeException runtimeException = new RuntimeException("Task Order bird id is null");
        C41318g46.m40159e(runtimeException);
        AbstractC23461c m33080F = AbstractC23461c.m33080F(runtimeException);
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(exception)");
        return m33080F;
    }

    @Override // p000.InterfaceC49310tZ5
    public AbstractC23461c refresh() {
        AbstractC23461c abstractC23461c;
        String str = this.f121531d;
        if (str != null) {
            AbstractC23461c mo8089n0 = this.f121528a.mo8089n0(str, FlightSheetContext.STANDARD);
            final C31044e c31044e = C31044e.f121539g;
            abstractC23461c = mo8089n0.m33084B(new InterfaceC23484g() { // from class: yZ5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C52867zZ5.m1095o(Function1.this, obj);
                }
            }).m33069Q();
        } else {
            abstractC23461c = null;
        }
        if (abstractC23461c == null) {
            return m1096n();
        }
        return abstractC23461c;
    }
}
