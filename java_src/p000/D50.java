package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.android.navigator.FailedBatchUpdateResult;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.D50;
import p000.H31;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R.\u0010-\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020) **\n\u0012\u0004\u0012\u00020)\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R.\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020) **\n\u0012\u0004\u0012\u00020)\u0018\u00010.0.0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m28432d2 = {"LD50;", "Ls50;", "", "sessionId", "", C17296a.f69688o, "", "requestCode", "", "resultOk", "Lco/bird/android/navigator/FailedBatchUpdateResult;", MessageExtension.FIELD_DATA, "b", "Lom3;", "Lom3;", "operatorManager", "LGt5;", "LGt5;", "serviceCenterManager", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LlE;", DateTokenConverter.CONVERTER_KEY, "LlE;", "ui", "Le13;", "e", "Le13;", "navigator", "Lo50;", "f", "Lo50;", "converter", "LTq4;", "g", "LTq4;", "reactiveConfig", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "selectedStatusSubject", "", "i", "statusesSubject", "j", "Ljava/lang/String;", "<init>", "(Lom3;LGt5;Lcom/uber/autodispose/ScopeProvider;LlE;Le13;Lo50;LTq4;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressUpdatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdatePresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,151:1\n52#2,2:152\n71#2,2:157\n180#3:154\n180#3:155\n180#3:156\n180#3:159\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdatePresenterImpl\n*L\n54#1:152,2\n103#1:157,2\n60#1:154\n90#1:155\n100#1:156\n111#1:159\n*E\n"})
/* renamed from: D50 */
/* loaded from: classes3.dex */
public final class D50 implements InterfaceC48437s50 {

    /* renamed from: a */
    public final InterfaceC46473om3 f5196a;

    /* renamed from: b */
    public final InterfaceC33193Gt5 f5197b;

    /* renamed from: c */
    public final ScopeProvider f5198c;

    /* renamed from: d */
    public final InterfaceC25660lE f5199d;

    /* renamed from: e */
    public final InterfaceC40099e13 f5200e;

    /* renamed from: f */
    public final InterfaceC46066o50 f5201f;

    /* renamed from: g */
    public final C36207Tq4 f5202g;

    /* renamed from: h */
    public final C24552a<Optional<WireServiceCenterStatus>> f5203h;

    /* renamed from: i */
    public final C24552a<List<WireServiceCenterStatus>> f5204i;

    /* renamed from: j */
    public String f5205j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D50$a */
    /* loaded from: classes3.dex */
    public static final class C1367a extends Lambda implements Function1<Throwable, Unit> {
        public C1367a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th instanceof HttpException) {
                D50.this.f5199d.error(th);
            } else {
                D50.this.f5199d.error(C45871nl4.error_generic_body);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D50$b */
    /* loaded from: classes3.dex */
    public static final class C1368b extends Lambda implements Function1<Pair<? extends List<? extends WireServiceCenterStatus>, ? extends Optional<WireServiceCenterStatus>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C1368b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<? extends List<WireServiceCenterStatus>, Optional<WireServiceCenterStatus>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireServiceCenterStatus> statuses = pair.component1();
            Intrinsics.checkNotNullExpressionValue(statuses, "statuses");
            return D50.this.f5201f.mo18227a(pair.component2().m59035e(), statuses);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D50$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1369c extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C1369c(Object obj) {
            super(1, obj, InterfaceC25660lE.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC25660lE) this.receiver).mo25930b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D50$d */
    /* loaded from: classes3.dex */
    public static final class C1370d extends Lambda implements Function1<Triple<? extends Unit, ? extends WireServiceCenterStatus, ? extends String>, Pair<? extends WireServiceCenterStatus, ? extends String>> {

        /* renamed from: g */
        public static final C1370d f5208g = new C1370d();

        public C1370d() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair<WireServiceCenterStatus, String> invoke(Triple<Unit, WireServiceCenterStatus, String> triple) {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            WireServiceCenterStatus component2 = triple.component2();
            String component3 = triple.component3();
            if (component2.getRequireNotes()) {
                if (component3 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(component3);
                    if (!isBlank) {
                        z = false;
                        if (z) {
                            throw new IllegalArgumentException("Note cannot be blank when requireNotes is true");
                        }
                    }
                }
                z = true;
                if (z) {
                }
            }
            return TuplesKt.m28425to(component2, component3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D50$e */
    /* loaded from: classes3.dex */
    public static final class C1371e extends Lambda implements Function1<Throwable, Unit> {
        public C1371e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th instanceof IllegalArgumentException) {
                D50.this.f5199d.mo25933C7();
                return;
            }
            C41318g46.m40159e(th);
            D50.this.f5199d.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u009f\u0002\u0012\u0087\u0001\b\u0001\u0012\u0082\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\t \u0002*@\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b \u0002*\u008e\u0001\u0012\u0087\u0001\b\u0001\u0012\u0082\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\t \u0002*@\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b\u0018\u00010\u00070\u00072f\u0010\u0006\u001ab\u0012D\u0012B\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "", "Lco/bird/android/model/persistence/Bird;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lwb4;", "Lco/bird/android/model/DialogResponse;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D50$f */
    /* loaded from: classes3.dex */
    public static final class C1372f extends Lambda implements Function1<Pair<? extends Pair<? extends WireServiceCenterStatus, ? extends String>, ? extends List<? extends Bird>>, InterfaceC23447K<? extends C51106wb4<? extends WireServiceCenterStatus, ? extends String, ? extends List<? extends Bird>, ? extends DialogResponse>>> {

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0082\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\u0000 \u0004*@\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lwb4;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "", "Lco/bird/android/model/persistence/Bird;", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: D50$f$a */
        /* loaded from: classes3.dex */
        public static final class C1373a extends Lambda implements Function1<DialogResponse, C51106wb4<? extends WireServiceCenterStatus, ? extends String, ? extends List<? extends Bird>, ? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ Pair<WireServiceCenterStatus, String> f5211g;

            /* renamed from: h */
            public final /* synthetic */ List<Bird> f5212h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1373a(Pair<WireServiceCenterStatus, String> pair, List<Bird> list) {
                super(1);
                this.f5211g = pair;
                this.f5212h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C51106wb4<WireServiceCenterStatus, String, List<Bird>, DialogResponse> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new C51106wb4<>(this.f5211g.getFirst(), this.f5211g.getSecond(), this.f5212h, response);
            }
        }

        public C1372f() {
            super(1);
        }

        /* renamed from: c */
        public static final C51106wb4 m110932c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C51106wb4) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C51106wb4<WireServiceCenterStatus, String, List<Bird>, DialogResponse>> invoke(Pair<Pair<WireServiceCenterStatus, String>, ? extends List<Bird>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<WireServiceCenterStatus, String> component1 = pair.component1();
            List<Bird> component2 = pair.component2();
            InterfaceC25660lE interfaceC25660lE = D50.this.f5199d;
            int size = component2.size();
            WireServiceCenterStatus first = component1.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "pair.first");
            AbstractC23442F dialog$default = H31.C3014a.dialog$default(interfaceC25660lE, new X60(size, first), false, false, 6, null);
            final C1373a c1373a = new C1373a(component1, component2);
            return dialog$default.m33157I(new InterfaceC23492o() { // from class: E50
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C51106wb4 m110932c;
                    m110932c = D50.C1372f.m110932c(Function1.this, obj);
                    return m110932c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0087\u0001\u0010\u0007\u001a\u0082\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0002*@\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lwb4;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/DialogResponse;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D50$g */
    /* loaded from: classes3.dex */
    public static final class C1374g extends Lambda implements Function1<C51106wb4<? extends WireServiceCenterStatus, ? extends String, ? extends List<? extends Bird>, ? extends DialogResponse>, Unit> {
        public C1374g() {
            super(1);
        }

        /* renamed from: a */
        public final void m110930a(C51106wb4<WireServiceCenterStatus, String, ? extends List<Bird>, ? extends DialogResponse> c51106wb4) {
            WireServiceCenterStatus status = c51106wb4.m6614a();
            String m6613b = c51106wb4.m6613b();
            c51106wb4.m6612c();
            if (c51106wb4.m6611d() == DialogResponse.OK) {
                InterfaceC40099e13 interfaceC40099e13 = D50.this.f5200e;
                Intrinsics.checkNotNullExpressionValue(status, "status");
                String str = null;
                if (!status.getRequireNotes()) {
                    m6613b = null;
                }
                String str2 = D50.this.f5205j;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sessionId");
                } else {
                    str = str2;
                }
                interfaceC40099e13.mo37152I3(status, m6613b, str);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends WireServiceCenterStatus, ? extends String, ? extends List<? extends Bird>, ? extends DialogResponse> c51106wb4) {
            m110930a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireServiceCenterStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D50$h */
    /* loaded from: classes3.dex */
    public static final class C1375h extends Lambda implements Function1<WireServiceCenterStatus, Unit> {
        public C1375h() {
            super(1);
        }

        /* renamed from: a */
        public final void m110929a(WireServiceCenterStatus wireServiceCenterStatus) {
            D50.this.f5199d.mo25928x(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireServiceCenterStatus wireServiceCenterStatus) {
            m110929a(wireServiceCenterStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireServiceCenterStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D50$i */
    /* loaded from: classes3.dex */
    public static final class C1376i extends Lambda implements Function1<WireServiceCenterStatus, Unit> {
        public C1376i() {
            super(1);
        }

        /* renamed from: a */
        public final void m110928a(WireServiceCenterStatus status) {
            C24552a c24552a = D50.this.f5203h;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            c24552a.onNext(c14443a.m59032c(status));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireServiceCenterStatus wireServiceCenterStatus) {
            m110928a(wireServiceCenterStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062f\u0010\u0005\u001ab\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0003*0\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkServiceProgressUpdatePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdatePresenterImpl$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n819#2:152\n847#2,2:153\n819#2:155\n847#2,2:156\n819#2:158\n847#2,2:159\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressUpdatePresenter.kt\nco/bird/android/feature/servicecenter/status/bulk/update/BulkServiceProgressUpdatePresenterImpl$9\n*L\n116#1:152\n116#1:153,2\n119#1:155\n119#1:156,2\n122#1:158\n122#1:159,2\n*E\n"})
    /* renamed from: D50$j */
    /* loaded from: classes3.dex */
    public static final class C1377j extends Lambda implements Function1<C51106wb4<? extends List<? extends WireServiceCenterStatus>, ? extends Boolean, ? extends Boolean, ? extends Boolean>, Unit> {
        public C1377j() {
            super(1);
        }

        /* renamed from: a */
        public final void m110927a(C51106wb4<? extends List<WireServiceCenterStatus>, Boolean, Boolean, Boolean> c51106wb4) {
            List<WireServiceCenterStatus> filteredStatuses = c51106wb4.m6614a();
            boolean booleanValue = c51106wb4.m6613b().booleanValue();
            boolean booleanValue2 = c51106wb4.m6612c().booleanValue();
            boolean booleanValue3 = c51106wb4.m6611d().booleanValue();
            if (!booleanValue) {
                Intrinsics.checkNotNullExpressionValue(filteredStatuses, "filteredStatuses");
                ArrayList arrayList = new ArrayList();
                for (Object obj : filteredStatuses) {
                    if (!((WireServiceCenterStatus) obj).getStatus().isHibernate()) {
                        arrayList.add(obj);
                    }
                }
                filteredStatuses = arrayList;
            }
            if (!booleanValue2) {
                Intrinsics.checkNotNullExpressionValue(filteredStatuses, "filteredStatuses");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : filteredStatuses) {
                    if (!((WireServiceCenterStatus) obj2).getStatus().isHibernateCreateBatch()) {
                        arrayList2.add(obj2);
                    }
                }
                filteredStatuses = arrayList2;
            }
            if (!booleanValue3) {
                Intrinsics.checkNotNullExpressionValue(filteredStatuses, "filteredStatuses");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : filteredStatuses) {
                    if (!((WireServiceCenterStatus) obj3).getStatus().isCharging()) {
                        arrayList3.add(obj3);
                    }
                }
                filteredStatuses = arrayList3;
            }
            D50.this.f5204i.onNext(filteredStatuses);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends List<? extends WireServiceCenterStatus>, ? extends Boolean, ? extends Boolean, ? extends Boolean> c51106wb4) {
            m110927a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: D50$k */
    /* loaded from: classes3.dex */
    public static final class C1378k<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C1378k<T1, T2, R> f5217a = new C1378k<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: D50$l */
    /* loaded from: classes3.dex */
    public static final class C1379l<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C1379l<T1, T2, T3, T4, R> f5218a = new C1379l<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    public D50(InterfaceC46473om3 operatorManager, InterfaceC33193Gt5 serviceCenterManager, ScopeProvider scopeProvider, InterfaceC25660lE ui, InterfaceC40099e13 navigator, InterfaceC46066o50 converter, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f5196a = operatorManager;
        this.f5197b = serviceCenterManager;
        this.f5198c = scopeProvider;
        this.f5199d = ui;
        this.f5200e = navigator;
        this.f5201f = converter;
        this.f5202g = reactiveConfig;
        C24552a<Optional<WireServiceCenterStatus>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Optional<WireServiceCenterStatus>>()");
        this.f5203h = m31922e;
        C24552a<List<WireServiceCenterStatus>> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<List<WireServiceCenterStatus>>()");
        this.f5204i = m31922e2;
        ui.mo25928x(false);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable<Optional<WireServiceCenterStatus>> startWith = m31922e.startWith((C24552a<Optional<WireServiceCenterStatus>>) Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(startWith, "selectedStatusSubject.startWith(Optional.absent())");
        Observable combineLatest = Observable.combineLatest(m31922e2, startWith, C1378k.f5217a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C1368b c1368b = new C1368b();
        Observable observeOn = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: t50
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m110946m;
                m110946m = D50.m110946m(Function1.this, obj);
                return m110946m;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1369c c1369c = new C1369c(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: u50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D50.m110945n(Function1.this, obj);
            }
        });
        Observable m31949b = C24527f.m31949b(ui.mo25929c(), ui.mo25932P(), ui.mo25927z());
        final C1370d c1370d = C1370d.f5208g;
        Observable map = m31949b.map(new InterfaceC23492o() { // from class: v50
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m110944o;
                m110944o = D50.m110944o(Function1.this, obj);
                return m110944o;
            }
        });
        final C1371e c1371e = new C1371e();
        Observable retry = map.doOnError(new InterfaceC23484g() { // from class: w50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D50.m110943p(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "ui.submitClicks()\n      … }\n      }\n      .retry()");
        Observable m31950a = C24527f.m31950a(retry, operatorManager.mo8093l1(BulkScanPurpose.SERVICE_CENTER));
        final C1372f c1372f = new C1372f();
        Observable observeOn2 = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: x50
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m110942q;
                m110942q = D50.m110942q(Function1.this, obj);
                return m110942q;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.submitClicks()\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1374g c1374g = new C1374g();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: y50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D50.m110941r(Function1.this, obj);
            }
        });
        Observable<WireServiceCenterStatus> observeOn3 = ui.mo25932P().observeOn(C23454a.m33087a());
        final C1375h c1375h = new C1375h();
        Observable<WireServiceCenterStatus> doOnNext = observeOn3.doOnNext(new InterfaceC23484g() { // from class: z50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D50.m110940s(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.statusSelects()\n     …{ ui.enableSubmit(true) }");
        Object m33094as3 = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1376i c1376i = new C1376i();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: A50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D50.m110939t(Function1.this, obj);
            }
        });
        Observable m33123k0 = C38096ag5.m70883l(serviceCenterManager.mo94628f()).m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "serviceCenterManager.get…onseBody().toObservable()");
        Observable combineLatest2 = Observable.combineLatest(m33123k0, reactiveConfig.m82580j7(), reactiveConfig.m82558l7(), reactiveConfig.m82602h7(), C1379l.f5218a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        Observable observeOn4 = C28237sD.progress$default(combineLatest2, ui, 0, 2, (Object) null).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1377j c1377j = new C1377j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: B50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D50.m110938u(Function1.this, obj);
            }
        };
        final C1367a c1367a = new C1367a();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: C50
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D50.m110937v(Function1.this, obj);
            }
        });
    }

    /* renamed from: m */
    public static final InterfaceC23447K m110946m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m110945n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final Pair m110944o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m110943p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m110942q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m110941r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m110940s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m110939t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m110938u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m110937v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48437s50
    /* renamed from: a */
    public void mo14799a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f5205j = sessionId;
    }

    @Override // p000.InterfaceC48437s50
    /* renamed from: b */
    public void mo14798b(int i, boolean z, FailedBatchUpdateResult failedBatchUpdateResult) {
        List<String> emptyList;
        if (i == 10008 && z) {
            InterfaceC40099e13 interfaceC40099e13 = this.f5200e;
            if (failedBatchUpdateResult == null || (emptyList = failedBatchUpdateResult.m55399b()) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            interfaceC40099e13.mo37029e4(-1, X52.m77424a(new FailedBatchUpdateResult(emptyList)));
        }
    }
}
