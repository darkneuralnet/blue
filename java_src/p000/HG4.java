package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BatchBirdFraudReport;
import co.bird.android.model.BirdFraudReport;
import co.bird.android.model.analytics.ChargerReportFraudSubmitted;
import co.bird.android.model.analytics.RiderBulkReportFraudSubmitted;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR&\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001fj\b\u0012\u0004\u0012\u00020\u0007` 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006/"}, m28432d2 = {"LHG4;", "LxC;", "LEG4;", "Landroid/content/Intent;", "intent", "", "b", "", Entry.TYPE_TEXT, "g", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LIG4;", "c", "LIG4;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LEg1;", "e", "LEg1;", "eventBus", "LEa;", "f", "LEa;", "analyticsManager", "LjB0;", "LjB0;", "contractorManager", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "birdIds", "Lco/bird/android/model/constant/MapMode;", "i", "Lco/bird/android/model/constant/MapMode;", "mapMode", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "Lgl;", "preference", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LIG4;Le13;LEg1;LEa;LjB0;Lgl;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportFraudPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportFraudPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,88:1\n199#2:89\n*S KotlinDebug\n*F\n+ 1 ReportFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportFraudPresenterImpl\n*L\n72#1:89\n*E\n"})
/* renamed from: HG4 */
/* loaded from: classes2.dex */
public final class HG4 extends C30060xC implements EG4 {

    /* renamed from: c */
    public final IG4 f13159c;

    /* renamed from: d */
    public final InterfaceC40099e13 f13160d;

    /* renamed from: e */
    public final InterfaceC32604Eg1 f13161e;

    /* renamed from: f */
    public final InterfaceC1880Ea f13162f;

    /* renamed from: g */
    public final InterfaceC43160jB0 f13163g;

    /* renamed from: h */
    public ArrayList<String> f13164h;

    /* renamed from: i */
    public MapMode f13165i;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/BatchBirdFraudReport;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HG4$a */
    /* loaded from: classes2.dex */
    public static final class C3114a extends Lambda implements Function1<HM4<BatchBirdFraudReport>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: HG4$a$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C3115a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MapMode.values().length];
                try {
                    iArr[MapMode.RIDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C3114a() {
            super(1);
        }

        /* renamed from: a */
        public final void m104082a(HM4<BatchBirdFraudReport> hm4) {
            if (hm4.m103939f()) {
                if (C3115a.$EnumSwitchMapping$0[HG4.this.f13165i.ordinal()] == 1) {
                    HG4.this.f13162f.mo55956N(new RiderBulkReportFraudSubmitted());
                }
                InterfaceC40099e13 interfaceC40099e13 = HG4.this.f13160d;
                Intent intent = new Intent();
                ArrayList arrayList = HG4.this.f13164h;
                if (arrayList == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("birdIds");
                    arrayList = null;
                }
                Intent putExtra = intent.putExtra("bird_ids", arrayList);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras.BIRD_IDS, birdIds)");
                interfaceC40099e13.mo37029e4(-1, putExtra);
                return;
            }
            HG4.this.f13159c.error(C45871nl4.error_generic_body);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<BatchBirdFraudReport> hm4) {
            m104082a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HG4$b */
    /* loaded from: classes2.dex */
    public static final class C3116b extends Lambda implements Function1<Throwable, Unit> {
        public C3116b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            HG4.this.f13159c.error(C45871nl4.report_fraud_error);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/BirdFraudReport;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BirdFraudReport;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HG4$c */
    /* loaded from: classes2.dex */
    public static final class C3117c extends Lambda implements Function1<BirdFraudReport, Unit> {
        public C3117c() {
            super(1);
        }

        /* renamed from: a */
        public final void m104081a(BirdFraudReport it) {
            Intrinsics.checkNotNullParameter(it, "it");
            HG4.this.f13162f.mo55956N(new ChargerReportFraudSubmitted());
            HG4.this.f13161e.mo104915c(new C37680Zy1(it));
            InterfaceC40099e13 interfaceC40099e13 = HG4.this.f13160d;
            Intent intent = new Intent();
            ArrayList arrayList = HG4.this.f13164h;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("birdIds");
                arrayList = null;
            }
            Intent putExtra = intent.putExtra("bird_ids", arrayList);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras.BIRD_IDS, birdIds)");
            interfaceC40099e13.mo37029e4(-1, putExtra);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdFraudReport birdFraudReport) {
            m104081a(birdFraudReport);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HG4$d */
    /* loaded from: classes2.dex */
    public static final class C3118d extends Lambda implements Function1<Throwable, Unit> {
        public C3118d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            HG4.this.f13159c.error(C45871nl4.report_fraud_error);
            C41318g46.m40159e(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HG4(LifecycleScopeProvider<EnumC7097RE> scopeProvider, IG4 ui, InterfaceC40099e13 navigator, InterfaceC32604Eg1 eventBus, InterfaceC1880Ea analyticsManager, InterfaceC43160jB0 contractorManager, C22454gl preference) {
        super(scopeProvider);
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(contractorManager, "contractorManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f13159c = ui;
        this.f13160d = navigator;
        this.f13161e = eventBus;
        this.f13162f = analyticsManager;
        this.f13163g = contractorManager;
        this.f13165i = preference.m37571t0();
    }

    /* renamed from: A */
    public static final void m104090A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m104089B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final void m104088C(String str) {
        InterfaceC43160jB0 interfaceC43160jB0 = this.f13163g;
        ArrayList<String> arrayList = this.f13164h;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("birdIds");
            arrayList = null;
        }
        String str2 = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(str2, "birdIds[0]");
        m5716u(interfaceC43160jB0.mo27696f(str2, str), new C3117c(), new C3118d());
    }

    /* renamed from: b */
    public void m104087b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("bird_ids");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        this.f13164h = stringArrayListExtra;
        if (stringArrayListExtra.isEmpty()) {
            this.f13160d.close();
        }
    }

    @Override // p000.EG4
    /* renamed from: g */
    public void mo104086g(String text) {
        boolean z;
        Intrinsics.checkNotNullParameter(text, "text");
        ArrayList<String> arrayList = this.f13164h;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("birdIds");
            arrayList = null;
        }
        if (arrayList.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m104088C(text);
        } else if (!z) {
            m104083z(text);
        }
    }

    /* renamed from: z */
    public final void m104083z(String str) {
        InterfaceC43160jB0 interfaceC43160jB0 = this.f13163g;
        ArrayList<String> arrayList = this.f13164h;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("birdIds");
            arrayList = null;
        }
        AbstractC23442F<HM4<BatchBirdFraudReport>> mo27697e = interfaceC43160jB0.mo27697e(arrayList, str);
        final C3114a c3114a = new C3114a();
        AbstractC23442F<HM4<BatchBirdFraudReport>> m33101w = mo27697e.m33101w(new InterfaceC23484g() { // from class: FG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                HG4.m104090A(Function1.this, obj);
            }
        });
        final C3116b c3116b = new C3116b();
        AbstractC23442F<HM4<BatchBirdFraudReport>> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: GG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                HG4.m104089B(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "private fun reportBatch(…r)\n      .subscribe()\n  }");
        Object m33135e = m33106t.m33135e(AutoDispose.m45239a(m5717t()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe();
    }
}
