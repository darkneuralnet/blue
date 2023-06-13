package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AlarmType;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C32273Cv3;
import p000.InterfaceC27246pJ;
import p000.InterfaceC33443Hv3;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, m28432d2 = {"LCv3;", "Lfv3;", "", "S", "Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/Observable;", "J", "", "lock", "N", "G", "", "searchTerm", "", "tasks", "M", "Lom3;", C17296a.f69688o, "Lom3;", "operatorManager", "LpJ;", "b", "LpJ;", "bluetoothManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "e", "Le13;", "navigator", "LUu3;", "f", "LUu3;", "operatorTaskConverter", "LHv3;", "g", "LHv3;", "ui", "", "h", "Ljava/util/List;", "<init>", "(Lom3;LpJ;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;LUu3;LHv3;)V", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListPresenter.kt\nco/bird/android/feature/operator/tasklist/OperatorTaskListPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n180#2:187\n180#2:188\n180#2:189\n180#2:190\n199#2:191\n766#3:192\n857#3,2:193\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListPresenter.kt\nco/bird/android/feature/operator/tasklist/OperatorTaskListPresenterImpl\n*L\n57#1:187\n69#1:188\n89#1:189\n94#1:190\n107#1:191\n182#1:192\n182#1:193,2\n*E\n"})
/* renamed from: Cv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32273Cv3 implements InterfaceC41226fv3 {

    /* renamed from: a */
    public final InterfaceC46473om3 f4896a;

    /* renamed from: b */
    public final InterfaceC27246pJ f4897b;

    /* renamed from: c */
    public final C36207Tq4 f4898c;

    /* renamed from: d */
    public final ScopeProvider f4899d;

    /* renamed from: e */
    public final InterfaceC40099e13 f4900e;

    /* renamed from: f */
    public final InterfaceC36476Uu3 f4901f;

    /* renamed from: g */
    public final InterfaceC33443Hv3 f4902g;

    /* renamed from: h */
    public final List<WireBird> f4903h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1230a extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C1230a(Object obj) {
            super(1, obj, InterfaceC33443Hv3.class, "setTaskListCount", "setTaskListCount(I)V", 0);
        }

        /* renamed from: a */
        public final void m111292a(int i) {
            ((InterfaceC33443Hv3) this.receiver).mo101473td(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m111292a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "searchTerm", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$b */
    /* loaded from: classes3.dex */
    public static final class C1231b extends Lambda implements Function1<String, List<? extends WireBird>> {
        public C1231b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final List<WireBird> invoke(String searchTerm) {
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            C32273Cv3 c32273Cv3 = C32273Cv3.this;
            return c32273Cv3.m111329M(searchTerm, c32273Cv3.f4903h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1232c extends FunctionReferenceImpl implements Function1<List<? extends WireBird>, AbstractC23442F<List<? extends C3023H6>>> {
        public C1232c(Object obj) {
            super(1, obj, InterfaceC36476Uu3.class, "convertTasks", "convertTasks(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<C3023H6>> invoke(List<WireBird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC36476Uu3) this.receiver).mo77718a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1233d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C1233d(Object obj) {
            super(1, obj, InterfaceC33443Hv3.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC33443Hv3) this.receiver).mo101474b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1234e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1234e f4905b = new C1234e();

        public C1234e() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$f */
    /* loaded from: classes3.dex */
    public static final class C1235f extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends WireBird>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Cv3$f$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C1236a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C1236a(Object obj) {
                super(1, obj, InterfaceC33443Hv3.class, "error", "error(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((InterfaceC33443Hv3) this.receiver).error(p0);
            }
        }

        public C1235f() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends WireBird> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            Observable<HM4<WireBird>> m33123k0 = C32273Cv3.this.f4896a.mo8116b(bird.getId()).m33123k0();
            Intrinsics.checkNotNullExpressionValue(m33123k0, "operatorManager.getBirdB…d(bird.id).toObservable()");
            Observable progress$default = C28237sD.progress$default(C38096ag5.m70884k(m33123k0), C32273Cv3.this.f4902g, 0, 2, (Object) null);
            final C1236a c1236a = new C1236a(C32273Cv3.this.f4902g);
            return progress$default.doOnError(new InterfaceC23484g() { // from class: Dv3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C32273Cv3.C1235f.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$g */
    /* loaded from: classes3.dex */
    public static final class C1237g extends Lambda implements Function1<WireBird, Unit> {
        public C1237g() {
            super(1);
        }

        /* renamed from: a */
        public final void m111287a(WireBird bird) {
            InterfaceC33443Hv3 interfaceC33443Hv3 = C32273Cv3.this.f4902g;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            interfaceC33443Hv3.mo101478Hj(bird);
            InterfaceC33443Hv3.C3275a.showActionSheet$default(C32273Cv3.this.f4902g, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m111287a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1240i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C1240i(Object obj) {
            super(1, obj, InterfaceC33443Hv3.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC33443Hv3) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$j */
    /* loaded from: classes3.dex */
    public static final class C1241j extends Lambda implements Function1<WireBird, Unit> {
        public C1241j() {
            super(1);
        }

        /* renamed from: a */
        public final void m111286a(WireBird wireBird) {
            C32273Cv3.this.f4902g.mo101477Ob(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m111286a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/B;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$k */
    /* loaded from: classes3.dex */
    public static final class C1242k extends Lambda implements Function1<DialogResponse, InterfaceC23434B<? extends Pair<? extends DialogResponse, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Cv3$k$a */
        /* loaded from: classes3.dex */
        public static final class C1243a extends Lambda implements Function1<Boolean, Pair<? extends DialogResponse, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ DialogResponse f4911g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1243a(DialogResponse dialogResponse) {
                super(1);
                this.f4911g = dialogResponse;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<DialogResponse, Boolean> invoke(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f4911g, it);
            }
        }

        public C1242k() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends Pair<DialogResponse, Boolean>> invoke(DialogResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Observable<Boolean> m82626f5 = C32273Cv3.this.f4898c.m82626f5();
            final C1243a c1243a = new C1243a(response);
            return m82626f5.map(new InterfaceC23492o() { // from class: Ev3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C32273Cv3.C1242k.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$m */
    /* loaded from: classes3.dex */
    public static final class C1245m extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Boolean>> {
        public C1245m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Boolean> invoke(Vehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "vehicle");
            return C32273Cv3.this.f4897b.mo19557a(vehicle);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$n */
    /* loaded from: classes3.dex */
    public static final class C1246n extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f4915g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1246n(WireBird wireBird) {
            super(1);
            this.f4915g = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Observable.just(this.f4915g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicle", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$o */
    /* loaded from: classes3.dex */
    public static final class C1247o extends Lambda implements Function1<Vehicle, InterfaceC23434B<? extends Boolean>> {
        public C1247o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends Boolean> invoke(Vehicle vehicle) {
            Intrinsics.checkNotNullParameter(vehicle, "vehicle");
            return C32273Cv3.this.f4897b.mo19557a(vehicle);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$p */
    /* loaded from: classes3.dex */
    public static final class C1248p extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f4917g;

        /* renamed from: h */
        public final /* synthetic */ boolean f4918h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1248p(WireBird wireBird, boolean z) {
            super(1);
            this.f4917g = wireBird;
            this.f4918h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Boolean it) {
            WireBird copy;
            Intrinsics.checkNotNullParameter(it, "it");
            copy = r2.copy((r91 & 1) != 0 ? r2.f66717id : null, (r91 & 2) != 0 ? r2.model : null, (r91 & 4) != 0 ? r2.taskId : null, (r91 & 8) != 0 ? r2.batteryLevel : 0, (r91 & 16) != 0 ? r2.estimatedRange : null, (r91 & 32) != 0 ? r2.distance : 0, (r91 & 64) != 0 ? r2.location : null, (r91 & 128) != 0 ? r2.code : null, (r91 & 256) != 0 ? r2.stickerId : null, (r91 & 512) != 0 ? r2.serialNumber : null, (r91 & 1024) != 0 ? r2.disconnected : false, (r91 & 2048) != 0 ? r2.collect : false, (r91 & 4096) != 0 ? r2.submerged : false, (r91 & 8192) != 0 ? r2.lost : false, (r91 & 16384) != 0 ? r2.locked : this.f4918h, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.ackLocked : false, (r91 & 65536) != 0 ? r2.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r2.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r2.broken : false, (r91 & 524288) != 0 ? r2.label : null, (r91 & 1048576) != 0 ? r2.actions : null, (r91 & 2097152) != 0 ? r2.bountyId : null, (r91 & 4194304) != 0 ? r2.bountyPrice : null, (r91 & 8388608) != 0 ? r2.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r2.bountyLost : false, (r91 & 33554432) != 0 ? r2.bountyOverdue : false, (r91 & 67108864) != 0 ? r2.bountyKind : null, (r91 & 134217728) != 0 ? r2.brandName : null, (r91 & 268435456) != 0 ? r2.taskKind : null, (r91 & 536870912) != 0 ? r2.gpsAt : null, (r91 & 1073741824) != 0 ? r2.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r2.token : null, (r92 & 1) != 0 ? r2.bluetooth : false, (r92 & 2) != 0 ? r2.cellular : false, (r92 & 4) != 0 ? r2.startedAt : null, (r92 & 8) != 0 ? r2.dueAt : null, (r92 & 16) != 0 ? r2.asleep : false, (r92 & 32) != 0 ? r2.imei : null, (r92 & 64) != 0 ? r2.boardProtocol : null, (r92 & 128) != 0 ? r2.physicalLock : null, (r92 & 256) != 0 ? r2.priorityCollect : false, (r92 & 512) != 0 ? r2.down : false, (r92 & 1024) != 0 ? r2.needsInspection : false, (r92 & 2048) != 0 ? r2.partnerId : null, (r92 & 4096) != 0 ? r2.nestId : null, (r92 & 8192) != 0 ? r2.lastRideEndedAt : null, (r92 & 16384) != 0 ? r2.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r2.peril : false, (r92 & 65536) != 0 ? r2.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r2.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r2.offline : false, (r92 & 524288) != 0 ? r2.license : null, (r92 & 1048576) != 0 ? r2.areaKey : null, (r92 & 2097152) != 0 ? r2.fleetId : null, (r92 & 4194304) != 0 ? r2.nestPurpose : null, (r92 & 8388608) != 0 ? r2.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r2.scannedAt : null, (r92 & 33554432) != 0 ? r2.badgeType : null, (r92 & 67108864) != 0 ? r2.bountyReasons : null, (r92 & 134217728) != 0 ? r2.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r2.ephemeralId : null, (r92 & 536870912) != 0 ? r2.hasHelmet : false, (r92 & 1073741824) != 0 ? r2.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r2.bleMacAddress : null, (r93 & 1) != 0 ? r2.cellId : null, (r93 & 2) != 0 ? this.f4917g.externalFeedType : null);
            return Observable.just(copy);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$q */
    /* loaded from: classes3.dex */
    public static final class C1249q extends Lambda implements Function1<WireBird, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ Observable<WireBird> f4919g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1249q(Observable<WireBird> observable) {
            super(1);
            this.f4919g = observable;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WireBird> invoke(WireBird it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f4919g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "t", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$r */
    /* loaded from: classes3.dex */
    public static final class C1250r extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ Observable<WireBird> f4920g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1250r(Observable<WireBird> observable) {
            super(1);
            this.f4920g = observable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireBird> invoke(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (t instanceof BluetoothException) {
                return this.f4920g;
            }
            return Observable.error(t);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "tasks", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$s */
    /* loaded from: classes3.dex */
    public static final class C1251s extends Lambda implements Function1<List<WireBird>, Unit> {
        public C1251s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<WireBird> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireBird> tasks) {
            C32273Cv3.this.f4903h.clear();
            List list = C32273Cv3.this.f4903h;
            Intrinsics.checkNotNullExpressionValue(tasks, "tasks");
            list.addAll(tasks);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$t */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1252t extends FunctionReferenceImpl implements Function1<List<? extends WireBird>, AbstractC23442F<List<? extends C3023H6>>> {
        public C1252t(Object obj) {
            super(1, obj, InterfaceC36476Uu3.class, "convertTasks", "convertTasks(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<C3023H6>> invoke(List<WireBird> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC36476Uu3) this.receiver).mo77718a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1253u extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C1253u(Object obj) {
            super(1, obj, InterfaceC33443Hv3.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC33443Hv3) this.receiver).mo101474b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Cv3$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1254v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C1254v f4922b = new C1254v();

        public C1254v() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
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

    public C32273Cv3(InterfaceC46473om3 operatorManager, InterfaceC27246pJ bluetoothManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC36476Uu3 operatorTaskConverter, InterfaceC33443Hv3 ui) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(operatorTaskConverter, "operatorTaskConverter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f4896a = operatorManager;
        this.f4897b = bluetoothManager;
        this.f4898c = reactiveConfig;
        this.f4899d = scopeProvider;
        this.f4900e = navigator;
        this.f4901f = operatorTaskConverter;
        this.f4902g = ui;
        this.f4903h = new ArrayList();
        m111323S();
        Observable<String> mo101479H = ui.mo101479H();
        final C1231b c1231b = new C1231b();
        Observable<R> map = mo101479H.map(new InterfaceC23492o() { // from class: gv3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m111296w;
                m111296w = C32273Cv3.m111296w(Function1.this, obj);
                return m111296w;
            }
        });
        final C1232c c1232c = new C1232c(operatorTaskConverter);
        Observable observeOn = map.flatMapSingle(new InterfaceC23492o() { // from class: rv3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m111295x;
                m111295x = C32273Cv3.m111295x(Function1.this, obj);
                return m111295x;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.searchTermChanges()\n …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1233d c1233d = new C1233d(ui);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: uv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111294y(Function1.this, obj);
            }
        };
        final C1234e c1234e = C1234e.f4905b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: vv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111293z(Function1.this, obj);
            }
        });
        Observable<WireBird> mo101476Q0 = ui.mo101476Q0();
        final C1235f c1235f = new C1235f();
        Observable observeOn2 = mo101476Q0.flatMap(new InterfaceC23492o() { // from class: wv3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m111341A;
                m111341A = C32273Cv3.m111341A(Function1.this, obj);
                return m111341A;
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.taskClicks()\n      .f…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1237g c1237g = new C1237g();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: xv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111340B(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(ui.mo101475U0(), ui.mo101476Q0());
        final C1238h c1238h = new C1238h();
        Observable flatMap = m31950a.flatMap(new InterfaceC23492o() { // from class: yv3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m111339C;
                m111339C = C32273Cv3.m111339C(Function1.this, obj);
                return m111339C;
            }
        });
        final C1240i c1240i = new C1240i(ui);
        Observable observeOn3 = flatMap.doOnError(new InterfaceC23484g() { // from class: zv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111338D(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.actionsClicks()\n     …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1241j c1241j = new C1241j();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Av3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111337E(Function1.this, obj);
            }
        });
        Observable<Integer> observeOn4 = operatorManager.mo8099i1().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "operatorManager.countTas…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1230a c1230a = new C1230a(ui);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Bv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111336F(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final InterfaceC23434B m111341A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m111340B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23434B m111339C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m111338D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m111337E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m111336F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23434B m111334H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23434B m111333I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23434B m111331K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23434B m111330L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23434B m111327O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23434B m111326P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23434B m111325Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23434B m111324R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m111322T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m111321U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m111320V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m111319W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final List m111296w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23447K m111295x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m111294y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m111293z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public Observable<WireBird> m111335G(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F<DialogResponse> dialog = this.f4902g.dialog(C35609Rc0.f32300d, true, true);
        final C1242k c1242k = new C1242k();
        Observable<R> m33162D = dialog.m33162D(new InterfaceC23492o() { // from class: pv3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m111334H;
                m111334H = C32273Cv3.m111334H(Function1.this, obj);
                return m111334H;
            }
        });
        final C1244l c1244l = new C1244l(bird, this);
        Observable<WireBird> flatMap = m33162D.flatMap(new InterfaceC23492o() { // from class: qv3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m111333I;
                m111333I = C32273Cv3.m111333I(Function1.this, obj);
                return m111333I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "override fun cancelTask(…rd)\n        }\n      }\n  }");
        return flatMap;
    }

    /* renamed from: J */
    public Observable<WireBird> m111332J(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable<WireBird> progress$default = C28237sD.progress$default(this.f4896a.mo8119Z0(bird, AlarmCommand.CHIRP), this.f4902g, 0, 2, (Object) null);
        if (bird.getBluetooth()) {
            Observable progress$default2 = C28237sD.progress$default(InterfaceC27246pJ.C27247a.alarm$default(this.f4897b, bird, AlarmType.SHORT, true, false, 8, null), this.f4902g, 0, 2, (Object) null);
            final C1245m c1245m = new C1245m();
            Observable flatMap = progress$default2.flatMap(new InterfaceC23492o() { // from class: sv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m111331K;
                    m111331K = C32273Cv3.m111331K(Function1.this, obj);
                    return m111331K;
                }
            });
            final C1246n c1246n = new C1246n(bird);
            Observable<WireBird> onErrorResumeNext = flatMap.flatMap(new InterfaceC23492o() { // from class: tv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m111330L;
                    m111330L = C32273Cv3.m111330L(Function1.this, obj);
                    return m111330L;
                }
            }).onErrorResumeNext(progress$default);
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "override fun chirpAlarm(…   networkChirp\n    }\n  }");
            return onErrorResumeNext;
        }
        return progress$default;
    }

    /* renamed from: M */
    public List<WireBird> m111329M(String searchTerm, List<WireBird> tasks) {
        CharSequence trim;
        boolean isBlank;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        trim = StringsKt__StringsKt.trim((CharSequence) searchTerm);
        isBlank = StringsKt__StringsJVMKt.isBlank(trim.toString());
        if (!isBlank) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : tasks) {
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) ((WireBird) obj).getCode(), (CharSequence) searchTerm, false, 2, (Object) null);
                if (contains$default) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return tasks;
    }

    /* renamed from: N */
    public Observable<WireBird> m111328N(WireBird bird, boolean z) {
        Observable unlock$default;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Observable<WireBird> progress$default = C28237sD.progress$default(this.f4896a.mo8135R0(bird, z), this.f4902g, 0, 2, (Object) null);
        if (bird.getBluetooth()) {
            if (z) {
                unlock$default = InterfaceC27246pJ.C27247a.lock$default(this.f4897b, bird, false, true, false, null, 26, null);
            } else {
                unlock$default = InterfaceC27246pJ.C27247a.unlock$default(this.f4897b, bird, false, true, false, null, 26, null);
            }
            Observable progress$default2 = C28237sD.progress$default(unlock$default, this.f4902g, 0, 2, (Object) null);
            final C1247o c1247o = new C1247o();
            Observable flatMap = progress$default2.flatMap(new InterfaceC23492o() { // from class: hv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m111327O;
                    m111327O = C32273Cv3.m111327O(Function1.this, obj);
                    return m111327O;
                }
            });
            final C1248p c1248p = new C1248p(bird, z);
            Observable flatMap2 = flatMap.flatMap(new InterfaceC23492o() { // from class: iv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m111326P;
                    m111326P = C32273Cv3.m111326P(Function1.this, obj);
                    return m111326P;
                }
            });
            final C1249q c1249q = new C1249q(progress$default);
            Observable flatMap3 = flatMap2.flatMap(new InterfaceC23492o() { // from class: jv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m111325Q;
                    m111325Q = C32273Cv3.m111325Q(Function1.this, obj);
                    return m111325Q;
                }
            });
            final C1250r c1250r = new C1250r(progress$default);
            Observable<WireBird> onErrorResumeNext = flatMap3.onErrorResumeNext(new InterfaceC23492o() { // from class: kv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m111324R;
                    m111324R = C32273Cv3.m111324R(Function1.this, obj);
                    return m111324R;
                }
            });
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "override fun lockUnlock(…    networkLock\n    }\n  }");
            return onErrorResumeNext;
        }
        return progress$default;
    }

    /* renamed from: S */
    public void m111323S() {
        AbstractC23442F progress$default = C28237sD.progress$default(this.f4896a.mo8147I0(), this.f4902g, 0, 2, (Object) null);
        final C1251s c1251s = new C1251s();
        AbstractC23442F m33101w = progress$default.m33101w(new InterfaceC23484g() { // from class: lv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111322T(Function1.this, obj);
            }
        });
        final C1252t c1252t = new C1252t(this.f4901f);
        AbstractC23442F m33152N = m33101w.m33165A(new InterfaceC23492o() { // from class: mv3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m111321U;
                m111321U = C32273Cv3.m111321U(Function1.this, obj);
                return m111321U;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun refreshTask…teAdapter, Timber::e)\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f4899d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1253u c1253u = new C1253u(this.f4902g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: nv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111320V(Function1.this, obj);
            }
        };
        final C1254v c1254v = C1254v.f4922b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ov3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32273Cv3.m111319W(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/constant/BirdAction;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$h */
    /* loaded from: classes3.dex */
    public static final class C1238h extends Lambda implements Function1<Pair<? extends BirdAction, ? extends WireBird>, InterfaceC23434B<? extends WireBird>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Cv3$h$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C1239a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BirdAction.values().length];
                try {
                    iArr[BirdAction.ALARM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BirdAction.LOCK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BirdAction.UNLOCK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BirdAction.CANCEL_TASK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C1238h() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends WireBird> invoke2(Pair<? extends BirdAction, WireBird> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird bird = pair.component2();
            int i = C1239a.$EnumSwitchMapping$0[pair.component1().ordinal()];
            if (i == 1) {
                C32273Cv3 c32273Cv3 = C32273Cv3.this;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return c32273Cv3.m111332J(bird);
            } else if (i == 2) {
                C32273Cv3 c32273Cv32 = C32273Cv3.this;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return c32273Cv32.m111328N(bird, true);
            } else if (i == 3) {
                C32273Cv3 c32273Cv33 = C32273Cv3.this;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return c32273Cv33.m111328N(bird, false);
            } else if (i != 4) {
                Observable just = Observable.just(bird);
                Intrinsics.checkNotNullExpressionValue(just, "just(bird)");
                return just;
            } else {
                C32273Cv3 c32273Cv34 = C32273Cv3.this;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return c32273Cv34.m111335G(bird);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(Pair<? extends BirdAction, ? extends WireBird> pair) {
            return invoke2((Pair<? extends BirdAction, WireBird>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Cv3$l */
    /* loaded from: classes3.dex */
    public static final class C1244l extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Boolean>, InterfaceC23434B<? extends WireBird>> {

        /* renamed from: g */
        public final /* synthetic */ WireBird f4912g;

        /* renamed from: h */
        public final /* synthetic */ C32273Cv3 f4913h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1244l(WireBird wireBird, C32273Cv3 c32273Cv3) {
            super(1);
            this.f4912g = wireBird;
            this.f4913h = c32273Cv3;
        }

        /* renamed from: b */
        public static final void m111281b(C32273Cv3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m111323S();
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends WireBird> invoke2(Pair<? extends DialogResponse, Boolean> pair) {
            Observable<WireBird> observable;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            DialogResponse component1 = pair.component1();
            Boolean enableOperatorDirectTaskCancel = pair.component2();
            if (component1 == DialogResponse.OK) {
                String taskId = this.f4912g.getTaskId();
                if (taskId != null) {
                    final C32273Cv3 c32273Cv3 = this.f4913h;
                    WireBird wireBird = this.f4912g;
                    Intrinsics.checkNotNullExpressionValue(enableOperatorDirectTaskCancel, "enableOperatorDirectTaskCancel");
                    if (enableOperatorDirectTaskCancel.booleanValue()) {
                        observable = c32273Cv3.f4896a.mo8105f1(taskId).doOnComplete(new InterfaceC23478a() { // from class: Fv3
                            @Override // io.reactivex.functions.InterfaceC23478a
                            public final void run() {
                                C32273Cv3.C1244l.m111281b(C32273Cv3.this);
                            }
                        });
                    } else {
                        c32273Cv3.f4900e.mo36955r0(wireBird.getCode(), taskId);
                        observable = Observable.just(wireBird);
                    }
                } else {
                    observable = null;
                }
                if (observable == null) {
                    Observable just = Observable.just(this.f4912g);
                    Intrinsics.checkNotNullExpressionValue(just, "just(bird)");
                    return just;
                }
                return observable;
            }
            Observable just2 = Observable.just(this.f4912g);
            Intrinsics.checkNotNullExpressionValue(just2, "{\n          Observable.just(bird)\n        }");
            return just2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends WireBird> invoke(Pair<? extends DialogResponse, ? extends Boolean> pair) {
            return invoke2((Pair<? extends DialogResponse, Boolean>) pair);
        }
    }
}
