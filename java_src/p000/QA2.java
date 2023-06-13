package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.CurrentRental;
import co.bird.android.model.DeliveryLocation;
import co.bird.android.model.DeliveryWindow;
import co.bird.android.model.RentalPeriod;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.constant.RentalKind;
import co.bird.android.model.constant.RentalStatus;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.configs.RentalConfig;
import co.bird.api.request.DeliveryLocationBody;
import co.bird.api.request.ScheduleLongTermRentalBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 \u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020)0 \u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020)0 \u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020)0 \u0012\u0014\b\u0002\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\n0 \u0012\u0014\b\u0002\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 \u0012\u0014\b\u0002\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0:09\u0012\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0014\b\u0002\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\n0 \u0012\u0014\b\u0002\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 \u0012\u0014\b\u0002\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 \u0012\u0014\b\u0002\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\n0 \u0012\u0014\b\u0002\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\n0 ¢\u0006\u0004\bL\u0010MJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\tJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\tJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR.\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0 8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020)0 8\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020)0 8\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\n0 8\u0006¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%R#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 8\u0006¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b4\u0010%R#\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0:098\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b7\u0010=R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b?\u0010%R#\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\n0 8\u0006¢\u0006\f\n\u0004\bA\u0010#\u001a\u0004\b;\u0010%R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 8\u0006¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\bC\u0010%R#\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0 8\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\bE\u0010%R#\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\n0 8\u0006¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\bH\u0010%R#\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\n0 8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\bA\u0010%¨\u0006N"}, m28432d2 = {"LQA2;", "", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "", "t", "Lco/bird/android/model/CurrentRental;", "currentRental", "A", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "B", "Lco/bird/android/model/DeliveryWindow;", "F", "Lco/bird/android/model/RentalPlan;", "D", "r", "Lco/bird/api/request/ScheduleLongTermRentalBody;", "H", "Lco/bird/android/model/constant/RentalKind;", C17296a.f69688o, "Lco/bird/android/model/constant/RentalKind;", "p", "()Lco/bird/android/model/constant/RentalKind;", "rentalKind", "Lco/bird/android/model/wire/configs/RentalConfig;", "b", "Lco/bird/android/model/wire/configs/RentalConfig;", "j", "()Lco/bird/android/model/wire/configs/RentalConfig;", "config", "LAG;", "", "c", "LAG;", "o", "()LAG;", "setRentalId", "(LAG;)V", "rentalId", "", DateTokenConverter.CONVERTER_KEY, "x", "isCancelable", "e", "y", "isEnded", "f", "z", "isStarted", "Lco/bird/android/model/wire/WireLocation;", "g", "m", "location", "h", PaymentMethod.BillingDetails.PARAM_ADDRESS, "La94;", "", "i", "La94;", "()La94;", "availablePlans", "n", "notes", "k", "birdCare", "l", "deliveryWindowId", "q", "rentalPlanId", "Lco/bird/android/model/constant/RentalStatus;", "s", "status", "Lco/bird/android/model/RentalPeriod;", "currentRentalPeriod", "<init>", "(Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/wire/configs/RentalConfig;LAG;LAG;LAG;LAG;LAG;LAG;La94;LAG;LAG;LAG;LAG;LAG;LAG;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n180#2:165\n180#2:166\n22#3,2:167\n22#3,2:169\n22#3,2:171\n288#4,2:173\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel\n*L\n62#1:165\n75#1:166\n112#1:167,2\n126#1:169,2\n136#1:171,2\n146#1:173,2\n*E\n"})
/* renamed from: QA2 */
/* loaded from: classes2.dex */
public final class QA2 {

    /* renamed from: a */
    public final RentalKind f29917a;

    /* renamed from: b */
    public final RentalConfig f29918b;

    /* renamed from: c */
    public C0058AG<Optional<String>> f29919c;

    /* renamed from: d */
    public final C0058AG<Boolean> f29920d;

    /* renamed from: e */
    public final C0058AG<Boolean> f29921e;

    /* renamed from: f */
    public final C0058AG<Boolean> f29922f;

    /* renamed from: g */
    public final C0058AG<Optional<WireLocation>> f29923g;

    /* renamed from: h */
    public final C0058AG<Optional<String>> f29924h;

    /* renamed from: i */
    public final C37791a94<List<RentalPlan>> f29925i;

    /* renamed from: j */
    public final C0058AG<String> f29926j;

    /* renamed from: k */
    public final C0058AG<Optional<Boolean>> f29927k;

    /* renamed from: l */
    public final C0058AG<Optional<String>> f29928l;

    /* renamed from: m */
    public final C0058AG<Optional<String>> f29929m;

    /* renamed from: n */
    public final C0058AG<Optional<RentalStatus>> f29930n;

    /* renamed from: o */
    public final C0058AG<Optional<RentalPeriod>> f29931o;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/RentalPlan;", "<anonymous parameter 0>", "plans", C17296a.f69688o, "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n766#2:165\n857#2,2:166\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$1\n*L\n42#1:165\n42#1:166,2\n*E\n"})
    /* renamed from: QA2$a */
    /* loaded from: classes2.dex */
    public static final class C6692a extends Lambda implements Function2<List<? extends RentalPlan>, List<? extends RentalPlan>, List<? extends RentalPlan>> {

        /* renamed from: g */
        public static final C6692a f29932g = new C6692a();

        public C6692a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<RentalPlan> invoke(List<RentalPlan> list, List<RentalPlan> plans) {
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(plans, "plans");
            ArrayList arrayList = new ArrayList();
            for (Object obj : plans) {
                if (!((RentalPlan) obj).getDeliveryWindows().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "it", "", "Lco/bird/android/model/DeliveryWindow;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QA2$b */
    /* loaded from: classes2.dex */
    public static final class C6693b extends Lambda implements Function1<Optional<RentalPlan>, List<? extends DeliveryWindow>> {

        /* renamed from: g */
        public static final C6693b f29933g = new C6693b();

        public C6693b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<DeliveryWindow> invoke(Optional<RentalPlan> it) {
            List<DeliveryWindow> emptyList;
            List<DeliveryWindow> deliveryWindows;
            Intrinsics.checkNotNullParameter(it, "it");
            RentalPlan m59035e = it.m59035e();
            if (m59035e == null || (deliveryWindows = m59035e.getDeliveryWindows()) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            return deliveryWindows;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "windows", "", "Lco/bird/android/model/DeliveryWindow;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$init$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n2624#2,3:165\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$init$2\n*L\n67#1:165,3\n*E\n"})
    /* renamed from: QA2$c */
    /* loaded from: classes2.dex */
    public static final class C6694c extends Lambda implements Function1<List<? extends DeliveryWindow>, Unit> {
        public C6694c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DeliveryWindow> list) {
            invoke2((List<DeliveryWindow>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<DeliveryWindow> windows) {
            Object first;
            if (windows.isEmpty()) {
                QA2.this.m88827l().accept(Optional.f63040c.m59034a());
                return;
            }
            boolean z = true;
            if (windows.size() != 1) {
                Intrinsics.checkNotNullExpressionValue(windows, "windows");
                List<DeliveryWindow> list = windows;
                QA2 qa2 = QA2.this;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DeliveryWindow deliveryWindow = (DeliveryWindow) it.next();
                        Optional<String> value = qa2.m88827l().getValue();
                        if (Intrinsics.areEqual(value != null ? value.m59035e() : null, deliveryWindow.getId())) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return;
                }
            }
            C0058AG<Optional<String>> m88827l = QA2.this.m88827l();
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(windows, "windows");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) windows);
            m88827l.accept(c14443a.m59032c(((DeliveryWindow) first).getId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "plans", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$init$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n2624#2,3:165\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$init$3\n*L\n80#1:165,3\n*E\n"})
    /* renamed from: QA2$d */
    /* loaded from: classes2.dex */
    public static final class C6695d extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C6695d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> plans) {
            Object first;
            if (plans.isEmpty()) {
                QA2.this.m88822q().accept(Optional.f63040c.m59034a());
                return;
            }
            boolean z = true;
            if (plans.size() != 1) {
                Intrinsics.checkNotNullExpressionValue(plans, "plans");
                List<RentalPlan> list = plans;
                QA2 qa2 = QA2.this;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RentalPlan rentalPlan = (RentalPlan) it.next();
                        Optional<String> value = qa2.m88822q().getValue();
                        if (Intrinsics.areEqual(value != null ? value.m59035e() : null, rentalPlan.getId())) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return;
                }
            }
            C0058AG<Optional<String>> m88822q = QA2.this.m88822q();
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(plans, "plans");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) plans);
            m88822q.accept(c14443a.m59032c(((RentalPlan) first).getId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel\n*L\n1#1,304:1\n115#2:305\n*E\n"})
    /* renamed from: QA2$e */
    /* loaded from: classes2.dex */
    public static final class C6696e<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            return (R) TuplesKt.m28425to(((Optional) t1).m59035e(), ((Optional) t2).m59035e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/DeliveryWindow;", "Lco/bird/android/model/RentalPeriod;", "<name for destructuring parameter 0>", "Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QA2$f */
    /* loaded from: classes2.dex */
    public static final class C6697f extends Lambda implements Function1<Pair<? extends DeliveryWindow, ? extends RentalPeriod>, Optional<DateTime>> {

        /* renamed from: g */
        public static final C6697f f29936g = new C6697f();

        public C6697f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<DateTime> invoke(Pair<DeliveryWindow, RentalPeriod> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            DeliveryWindow component1 = pair.component1();
            RentalPeriod component2 = pair.component2();
            if (component2 != null) {
                return Optional.f63040c.m59032c(component2.getServiceEndsAt());
            }
            if (component1 != null) {
                Optional.C14443a c14443a = Optional.f63040c;
                DateTime plus = component1.getEnd().plus(Duration.standardDays(component1.getRentalPeriodDays()));
                Intrinsics.checkNotNullExpressionValue(plus, "selectedWindow.end + Dur…entalPeriodDays.toLong())");
                return c14443a.m59032c(plus);
            }
            return Optional.f63040c.m59034a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel\n*L\n1#1,304:1\n139#2:305\n*E\n"})
    /* renamed from: QA2$g */
    /* loaded from: classes2.dex */
    public static final class C6698g<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            return (R) TuplesKt.m28425to((List) t1, ((Optional) t2).m59035e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$selectedPlan$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n288#2,2:165\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$selectedPlan$2\n*L\n141#1:165,2\n*E\n"})
    /* renamed from: QA2$h */
    /* loaded from: classes2.dex */
    public static final class C6699h extends Lambda implements Function1<Pair<? extends List<? extends RentalPlan>, ? extends String>, Optional<RentalPlan>> {

        /* renamed from: g */
        public static final C6699h f29937g = new C6699h();

        public C6699h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<RentalPlan> invoke(Pair<? extends List<RentalPlan>, String> pair) {
            Object obj;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<RentalPlan> plans = pair.component1();
            String component2 = pair.component2();
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(plans, "plans");
            Iterator<T> it = plans.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((RentalPlan) obj).getId(), component2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return c14443a.m59033b(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel\n*L\n1#1,304:1\n129#2:305\n*E\n"})
    /* renamed from: QA2$i */
    /* loaded from: classes2.dex */
    public static final class C6700i<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            return (R) TuplesKt.m28425to(((Optional) t1).m59035e(), ((Optional) t2).m59035e());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/RentalPlan;", "", "<name for destructuring parameter 0>", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/DeliveryWindow;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$selectedWindow$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,164:1\n288#2,2:165\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupModel.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupModel$selectedWindow$2\n*L\n131#1:165,2\n*E\n"})
    /* renamed from: QA2$j */
    /* loaded from: classes2.dex */
    public static final class C6701j extends Lambda implements Function1<Pair<? extends RentalPlan, ? extends String>, Optional<DeliveryWindow>> {

        /* renamed from: g */
        public static final C6701j f29938g = new C6701j();

        public C6701j() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<DeliveryWindow> invoke(Pair<RentalPlan, String> pair) {
            List<DeliveryWindow> deliveryWindows;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            RentalPlan component1 = pair.component1();
            String component2 = pair.component2();
            Optional.C14443a c14443a = Optional.f63040c;
            DeliveryWindow deliveryWindow = null;
            if (component1 != null && (deliveryWindows = component1.getDeliveryWindows()) != null) {
                Iterator<T> it = deliveryWindows.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((DeliveryWindow) next).getId(), component2)) {
                        deliveryWindow = next;
                        break;
                    }
                }
                deliveryWindow = deliveryWindow;
            }
            return c14443a.m59033b(deliveryWindow);
        }
    }

    public QA2(RentalKind rentalKind, RentalConfig config, C0058AG<Optional<String>> rentalId, C0058AG<Boolean> isCancelable, C0058AG<Boolean> isEnded, C0058AG<Boolean> isStarted, C0058AG<Optional<WireLocation>> location, C0058AG<Optional<String>> address, C37791a94<List<RentalPlan>> availablePlans, C0058AG<String> notes, C0058AG<Optional<Boolean>> birdCare, C0058AG<Optional<String>> deliveryWindowId, C0058AG<Optional<String>> rentalPlanId, C0058AG<Optional<RentalStatus>> status, C0058AG<Optional<RentalPeriod>> currentRentalPeriod) {
        Intrinsics.checkNotNullParameter(rentalKind, "rentalKind");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(rentalId, "rentalId");
        Intrinsics.checkNotNullParameter(isCancelable, "isCancelable");
        Intrinsics.checkNotNullParameter(isEnded, "isEnded");
        Intrinsics.checkNotNullParameter(isStarted, "isStarted");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(availablePlans, "availablePlans");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(birdCare, "birdCare");
        Intrinsics.checkNotNullParameter(deliveryWindowId, "deliveryWindowId");
        Intrinsics.checkNotNullParameter(rentalPlanId, "rentalPlanId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currentRentalPeriod, "currentRentalPeriod");
        this.f29917a = rentalKind;
        this.f29918b = config;
        this.f29919c = rentalId;
        this.f29920d = isCancelable;
        this.f29921e = isEnded;
        this.f29922f = isStarted;
        this.f29923g = location;
        this.f29924h = address;
        this.f29925i = availablePlans;
        this.f29926j = notes;
        this.f29927k = birdCare;
        this.f29928l = deliveryWindowId;
        this.f29929m = rentalPlanId;
        this.f29930n = status;
        this.f29931o = currentRentalPeriod;
    }

    /* renamed from: C */
    public static final Optional m88844C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final Optional m88842E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final Optional m88840G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final List m88818u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m88817v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m88816w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r2 == null) goto L81;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m88846A(CurrentRental currentRental) {
        RentalPlan rentalPlan;
        DeliveryWindow deliveryWindow;
        String str;
        boolean z;
        DateTime dateTime;
        boolean z2;
        RentalStatus rentalStatus;
        WireLocation wireLocation;
        String str2;
        String str3;
        String str4;
        List<RentalPlan> listOfNotNull;
        Boolean bool;
        RentalStatus rentalStatus2;
        RentalPlan plan;
        DeliveryLocation location;
        DeliveryLocation location2;
        DeliveryLocation location3;
        List<DeliveryWindow> deliveryWindows;
        Object firstOrNull;
        DeliveryWindow deliveryWindow2;
        List listOf;
        RentalPeriod rentalPeriod = null;
        if (currentRental != null && (deliveryWindow2 = currentRental.getDeliveryWindow()) != null) {
            RentalPlan plan2 = currentRental.getPlan();
            if (plan2 != null) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(deliveryWindow2);
                rentalPlan = plan2.copy((r39 & 1) != 0 ? plan2.f66620id : null, (r39 & 2) != 0 ? plan2.baseCost : 0L, (r39 & 4) != 0 ? plan2.baseTaxCost : 0L, (r39 & 8) != 0 ? plan2.birdCare : false, (r39 & 16) != 0 ? plan2.birdCareCost : 0L, (r39 & 32) != 0 ? plan2.birdCareTaxCost : 0L, (r39 & 64) != 0 ? plan2.currency : null, (r39 & 128) != 0 ? plan2.descriptionLabel : null, (r39 & 256) != 0 ? plan2.incentiveLabel : null, (r39 & 512) != 0 ? plan2.includedItems : null, (r39 & 1024) != 0 ? plan2.recurring : false, (r39 & 2048) != 0 ? plan2.deliveryWindows : listOf, (r39 & 4096) != 0 ? plan2.notes : null, (r39 & 8192) != 0 ? plan2.kind : null, (r39 & 16384) != 0 ? plan2.birdModel : null, (r39 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? plan2.birdModelDisplayName : null, (r39 & 65536) != 0 ? plan2.specsLink : null);
            } else {
                rentalPlan = null;
            }
        }
        if (currentRental != null) {
            rentalPlan = currentRental.getPlan();
        } else {
            rentalPlan = null;
        }
        if (rentalPlan != null && (deliveryWindows = rentalPlan.getDeliveryWindows()) != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) deliveryWindows);
            deliveryWindow = (DeliveryWindow) firstOrNull;
        } else {
            deliveryWindow = null;
        }
        C0058AG<Optional<String>> c0058ag = this.f29919c;
        Optional.C14443a c14443a = Optional.f63040c;
        if (currentRental != null) {
            str = currentRental.getId();
        } else {
            str = null;
        }
        c0058ag.accept(c14443a.m59033b(str));
        C0058AG<Boolean> c0058ag2 = this.f29920d;
        boolean z3 = false;
        if (currentRental != null) {
            z = currentRental.getCancelable();
        } else {
            z = false;
        }
        c0058ag2.accept(Boolean.valueOf(z));
        C0058AG<Boolean> c0058ag3 = this.f29921e;
        if (currentRental != null) {
            dateTime = currentRental.getEndedAt();
        } else {
            dateTime = null;
        }
        if (dateTime != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0058ag3.accept(Boolean.valueOf(z2));
        C0058AG<Boolean> c0058ag4 = this.f29922f;
        if (currentRental != null) {
            rentalStatus = currentRental.getStatus();
        } else {
            rentalStatus = null;
        }
        if (rentalStatus == RentalStatus.STARTED) {
            z3 = true;
        }
        c0058ag4.accept(Boolean.valueOf(z3));
        C0058AG<Optional<WireLocation>> c0058ag5 = this.f29923g;
        if (currentRental != null && (location3 = currentRental.getLocation()) != null) {
            wireLocation = location3.getLocation();
        } else {
            wireLocation = null;
        }
        c0058ag5.accept(c14443a.m59033b(wireLocation));
        C0058AG<Optional<String>> c0058ag6 = this.f29924h;
        if (currentRental != null && (location2 = currentRental.getLocation()) != null) {
            str2 = location2.getAddress();
        } else {
            str2 = null;
        }
        c0058ag6.accept(c14443a.m59033b(str2));
        C0058AG<Optional<String>> c0058ag7 = this.f29928l;
        if (deliveryWindow != null) {
            str3 = deliveryWindow.getId();
        } else {
            str3 = null;
        }
        c0058ag7.accept(c14443a.m59033b(str3));
        C0058AG<Optional<String>> c0058ag8 = this.f29929m;
        if (rentalPlan != null) {
            str4 = rentalPlan.getId();
        } else {
            str4 = null;
        }
        c0058ag8.accept(c14443a.m59033b(str4));
        C37791a94<List<RentalPlan>> c37791a94 = this.f29925i;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(rentalPlan);
        c37791a94.accept(listOfNotNull);
        this.f29926j.accept((currentRental == null || (location = currentRental.getLocation()) == null || (r3 = location.getNotes()) == null) ? "" : "");
        C0058AG<Optional<Boolean>> c0058ag9 = this.f29927k;
        if (currentRental != null && (plan = currentRental.getPlan()) != null) {
            bool = Boolean.valueOf(plan.getBirdCare());
        } else {
            bool = null;
        }
        c0058ag9.accept(c14443a.m59033b(bool));
        C0058AG<Optional<RentalStatus>> c0058ag10 = this.f29930n;
        if (currentRental != null) {
            rentalStatus2 = currentRental.getStatus();
        } else {
            rentalStatus2 = null;
        }
        c0058ag10.accept(c14443a.m59033b(rentalStatus2));
        C0058AG<Optional<RentalPeriod>> c0058ag11 = this.f29931o;
        if (currentRental != null) {
            rentalPeriod = currentRental.getCurrentRentalPeriod();
        }
        c0058ag11.accept(c14443a.m59033b(rentalPeriod));
    }

    /* renamed from: B */
    public final Observable<Optional<DateTime>> m88845B() {
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(m88841F(), this.f29931o, new C6696e());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        final C6697f c6697f = C6697f.f29936g;
        Observable<Optional<DateTime>> map = combineLatest.map(new InterfaceC23492o() { // from class: OA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m88844C;
                m88844C = QA2.m88844C(Function1.this, obj);
                return m88844C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates…bsent()\n        }\n      }");
        return map;
    }

    /* renamed from: D */
    public final Observable<Optional<RentalPlan>> m88843D() {
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(this.f29925i, this.f29929m, new C6698g());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        final C6699h c6699h = C6699h.f29937g;
        Observable<Optional<RentalPlan>> map = combineLatest.map(new InterfaceC23492o() { // from class: NA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m88842E;
                m88842E = QA2.m88842E(Function1.this, obj);
                return m88842E;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates…t.id == planId })\n      }");
        return map;
    }

    /* renamed from: F */
    public final Observable<Optional<DeliveryWindow>> m88841F() {
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(m88843D(), this.f29928l, new C6700i());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        final C6701j c6701j = C6701j.f29938g;
        Observable<Optional<DeliveryWindow>> map = combineLatest.map(new InterfaceC23492o() { // from class: PA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m88840G;
                m88840G = QA2.m88840G(Function1.this, obj);
                return m88840G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates…id == windowId })\n      }");
        return map;
    }

    /* renamed from: H */
    public final ScheduleLongTermRentalBody m88839H() {
        boolean z;
        Boolean m59035e;
        WireLocation m59035e2;
        String m59035e3;
        Optional<String> value = this.f29928l.getValue();
        String str = "";
        String str2 = (value == null || (str2 = value.m59035e()) == null) ? "" : "";
        Optional<String> value2 = this.f29929m.getValue();
        if (value2 != null && (m59035e3 = value2.m59035e()) != null) {
            str = m59035e3;
        }
        Optional<WireLocation> value3 = this.f29923g.getValue();
        DeliveryLocationBody deliveryLocationBody = null;
        String str3 = null;
        deliveryLocationBody = null;
        if (value3 != null && (m59035e2 = value3.m59035e()) != null) {
            String value4 = this.f29926j.getValue();
            Optional<String> value5 = this.f29924h.getValue();
            if (value5 != null) {
                str3 = value5.m59035e();
            }
            deliveryLocationBody = new DeliveryLocationBody(m59035e2, null, value4, str3, 2, null);
        }
        Optional<Boolean> value6 = this.f29927k.getValue();
        if (value6 != null && (m59035e = value6.m59035e()) != null) {
            z = m59035e.booleanValue();
        } else {
            z = false;
        }
        return new ScheduleLongTermRentalBody(str2, str, deliveryLocationBody, z);
    }

    /* renamed from: g */
    public final C0058AG<Optional<String>> m88832g() {
        return this.f29924h;
    }

    /* renamed from: h */
    public final C37791a94<List<RentalPlan>> m88831h() {
        return this.f29925i;
    }

    /* renamed from: i */
    public final C0058AG<Optional<Boolean>> m88830i() {
        return this.f29927k;
    }

    /* renamed from: j */
    public final RentalConfig m88829j() {
        return this.f29918b;
    }

    /* renamed from: k */
    public final C0058AG<Optional<RentalPeriod>> m88828k() {
        return this.f29931o;
    }

    /* renamed from: l */
    public final C0058AG<Optional<String>> m88827l() {
        return this.f29928l;
    }

    /* renamed from: m */
    public final C0058AG<Optional<WireLocation>> m88826m() {
        return this.f29923g;
    }

    /* renamed from: n */
    public final C0058AG<String> m88825n() {
        return this.f29926j;
    }

    /* renamed from: o */
    public final C0058AG<Optional<String>> m88824o() {
        return this.f29919c;
    }

    /* renamed from: p */
    public final RentalKind m88823p() {
        return this.f29917a;
    }

    /* renamed from: q */
    public final C0058AG<Optional<String>> m88822q() {
        return this.f29929m;
    }

    /* renamed from: r */
    public final RentalPlan m88821r() {
        Object obj;
        Iterator<T> it = this.f29925i.getValue().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((RentalPlan) next).getId();
            Optional<String> value = this.f29929m.getValue();
            if (value != null) {
                obj = (String) value.m59035e();
            }
            if (Intrinsics.areEqual(id, obj)) {
                obj = next;
                break;
            }
        }
        return (RentalPlan) obj;
    }

    /* renamed from: s */
    public final C0058AG<Optional<RentalStatus>> m88820s() {
        return this.f29930n;
    }

    /* renamed from: t */
    public final void m88819t(ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Observable<Optional<RentalPlan>> m88843D = m88843D();
        final C6693b c6693b = C6693b.f29933g;
        Observable<R> map = m88843D.map(new InterfaceC23492o() { // from class: KA2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m88818u;
                m88818u = QA2.m88818u(Function1.this, obj);
                return m88818u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "selectedPlan()\n      .ma…yWindows ?: emptyList() }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6694c c6694c = new C6694c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: LA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QA2.m88817v(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f29925i.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6695d c6695d = new C6695d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: MA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QA2.m88816w(Function1.this, obj);
            }
        });
    }

    /* renamed from: x */
    public final C0058AG<Boolean> m88815x() {
        return this.f29920d;
    }

    /* renamed from: y */
    public final C0058AG<Boolean> m88814y() {
        return this.f29921e;
    }

    /* renamed from: z */
    public final C0058AG<Boolean> m88813z() {
        return this.f29922f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ QA2(RentalKind rentalKind, RentalConfig rentalConfig, C0058AG c0058ag, C0058AG c0058ag2, C0058AG c0058ag3, C0058AG c0058ag4, C0058AG c0058ag5, C0058AG c0058ag6, C37791a94 c37791a94, C0058AG c0058ag7, C0058AG c0058ag8, C0058AG c0058ag9, C0058AG c0058ag10, C0058AG c0058ag11, C0058AG c0058ag12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rentalKind, rentalConfig, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
        C0058AG c0058ag13;
        C0058AG c0058ag14;
        C0058AG c0058ag15;
        C0058AG c0058ag16;
        C0058AG c0058ag17;
        C0058AG c0058ag18;
        C37791a94 c37791a942;
        C0058AG c0058ag19;
        C0058AG c0058ag20;
        C0058AG c0058ag21;
        C0058AG c0058ag22;
        C0058AG c0058ag23;
        C0058AG c0058ag24;
        List emptyList;
        if ((i & 4) != 0) {
            C0058AG m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.absent())");
            c0058ag13 = m115950h;
        } else {
            c0058ag13 = c0058ag;
        }
        if ((i & 8) != 0) {
            C0058AG m115950h2 = C0058AG.m115950h(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(m115950h2, "createDefault(false)");
            c0058ag14 = m115950h2;
        } else {
            c0058ag14 = c0058ag2;
        }
        if ((i & 16) != 0) {
            C0058AG m115950h3 = C0058AG.m115950h(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(m115950h3, "createDefault(false)");
            c0058ag15 = m115950h3;
        } else {
            c0058ag15 = c0058ag3;
        }
        if ((i & 32) != 0) {
            C0058AG m115950h4 = C0058AG.m115950h(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(m115950h4, "createDefault(false)");
            c0058ag16 = m115950h4;
        } else {
            c0058ag16 = c0058ag4;
        }
        if ((i & 64) != 0) {
            C0058AG m115950h5 = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h5, "createDefault(Optional.absent())");
            c0058ag17 = m115950h5;
        } else {
            c0058ag17 = c0058ag5;
        }
        if ((i & 128) != 0) {
            C0058AG m115950h6 = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h6, "createDefault(Optional.absent())");
            c0058ag18 = m115950h6;
        } else {
            c0058ag18 = c0058ag6;
        }
        if ((i & 256) != 0) {
            C37791a94.C10586a c10586a = C37791a94.f49908h;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            c37791a942 = c10586a.m71835a(emptyList, C6692a.f29932g);
        } else {
            c37791a942 = c37791a94;
        }
        if ((i & 512) != 0) {
            C0058AG m115950h7 = C0058AG.m115950h("");
            Intrinsics.checkNotNullExpressionValue(m115950h7, "createDefault(\"\")");
            c0058ag19 = m115950h7;
        } else {
            c0058ag19 = c0058ag7;
        }
        if ((i & 1024) != 0) {
            C0058AG m115950h8 = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h8, "createDefault(Optional.absent())");
            c0058ag20 = m115950h8;
        } else {
            c0058ag20 = c0058ag8;
        }
        if ((i & 2048) != 0) {
            C0058AG m115950h9 = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h9, "createDefault(Optional.absent())");
            c0058ag21 = m115950h9;
        } else {
            c0058ag21 = c0058ag9;
        }
        if ((i & 4096) != 0) {
            C0058AG m115950h10 = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h10, "createDefault(Optional.absent())");
            c0058ag22 = m115950h10;
        } else {
            c0058ag22 = c0058ag10;
        }
        if ((i & 8192) != 0) {
            C0058AG m115950h11 = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h11, "createDefault(Optional.absent())");
            c0058ag23 = m115950h11;
        } else {
            c0058ag23 = c0058ag11;
        }
        if ((i & 16384) != 0) {
            C0058AG m115950h12 = C0058AG.m115950h(Optional.f63040c.m59034a());
            Intrinsics.checkNotNullExpressionValue(m115950h12, "createDefault(Optional.absent())");
            c0058ag24 = m115950h12;
        } else {
            c0058ag24 = c0058ag12;
        }
    }
}
