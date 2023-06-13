package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.analytics.AnalyticsEvent;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.H31;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b2\u00103J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J.\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u001a\u0010\u0018\u001a\u00020\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100¨\u00064"}, m28432d2 = {"LFE;", "LDE;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "", "returnAddedIssues", "", "c", "onBackPressed", "", "workOrderId", "", "numIssuesAdded", "", "Lco/bird/android/model/Issue;", "newDisputedIssues", "i", "Llh6;", C17296a.f69688o, "Llh6;", "getUserManager", "()Llh6;", "userManager", "LEa;", "b", "LEa;", "getAnalyticsManager", "()LEa;", "analyticsManager", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "g", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "f", "()Le13;", "navigator", "LH31;", "e", "LH31;", "dialogUi", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "sessionId", "<init>", "(Llh6;LEa;Lcom/uber/autodispose/ScopeProvider;Le13;LH31;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/base/BaseWorkOrderInspectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,80:1\n199#2:81\n1549#3:82\n1620#3,3:83\n1855#3,2:88\n37#4,2:86\n*S KotlinDebug\n*F\n+ 1 BaseWorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/base/BaseWorkOrderInspectionPresenterImpl\n*L\n51#1:81\n67#1:82\n67#1:83,3\n77#1:88,2\n77#1:86,2\n*E\n"})
/* renamed from: FE */
/* loaded from: classes3.dex */
public abstract class AbstractC2207FE implements InterfaceC1433DE {

    /* renamed from: a */
    public final InterfaceC44647lh6 f9041a;

    /* renamed from: b */
    public final InterfaceC1880Ea f9042b;

    /* renamed from: c */
    public final ScopeProvider f9043c;

    /* renamed from: d */
    public final InterfaceC40099e13 f9044d;

    /* renamed from: e */
    public final H31 f9045e;

    /* renamed from: f */
    public final String f9046f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: FE$a */
    /* loaded from: classes3.dex */
    public static final class C2208a extends Lambda implements Function1<DialogResponse, Unit> {
        public C2208a() {
            super(1);
        }

        /* renamed from: a */
        public final void m107426a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                AbstractC2207FE.this.m107430f().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m107426a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public AbstractC2207FE(InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, H31 dialogUi) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogUi, "dialogUi");
        this.f9041a = userManager;
        this.f9042b = analyticsManager;
        this.f9043c = scopeProvider;
        this.f9044d = navigator;
        this.f9045e = dialogUi;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f9046f = uuid;
    }

    /* renamed from: h */
    public static final void m107428h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC1433DE
    /* renamed from: c */
    public void mo75363c(WireBird bird, WorkOrder workOrder, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (!z) {
            this.f9042b.mo55905y(new C43202jF6(null, this.f9046f, null, null, bird.getId(), (workOrder == null || (r13 = workOrder.getId()) == null) ? "" : "", bird.getModel(), 13, null));
        }
    }

    /* renamed from: f */
    public final InterfaceC40099e13 m107430f() {
        return this.f9044d;
    }

    /* renamed from: g */
    public final ScopeProvider m107429g() {
        return this.f9043c;
    }

    /* renamed from: i */
    public final void m107427i(WireBird bird, String str, int i, List<Issue> newDisputedIssues) {
        String str2;
        int collectionSizeOrDefault;
        List<AnalyticsEvent> listOf;
        String str3;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(newDisputedIssues, "newDisputedIssues");
        String str4 = this.f9046f;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C40228eE6 c40228eE6 = new C40228eE6(null, str4, null, null, bird.getId(), str2, i, 13, null);
        List<Issue> list = newDisputedIssues;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Issue issue = (Issue) it.next();
            String str5 = this.f9046f;
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            String id = bird.getId();
            String id2 = issue.getId();
            if (issue.getSource() == IssueCreateSource.VEHICLE_FAULT_CODE) {
                z = true;
            }
            arrayList.add(new C50900wE6(null, str5, null, null, id, str3, id2, z, 13, null));
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(c40228eE6);
        spreadBuilder.addSpread(arrayList.toArray(new C50900wE6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new AnalyticsEvent[spreadBuilder.size()]));
        InterfaceC1880Ea interfaceC1880Ea = this.f9042b;
        for (AnalyticsEvent analyticsEvent : listOf) {
            interfaceC1880Ea.mo55905y(analyticsEvent);
        }
    }

    @Override // p000.InterfaceC1433DE
    public void onBackPressed() {
        Object m33135e = H31.C3014a.dialog$default(this.f9045e, C35719Ro2.f32625d, false, false, 6, null).m33135e(AutoDispose.m45239a(this.f9043c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2208a c2208a = new C2208a();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: EE
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC2207FE.m107428h(Function1.this, obj);
            }
        });
    }
}
