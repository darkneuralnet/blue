package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b/\u00100J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00050*j\b\u0012\u0004\u0012\u00020\u0005`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, m28432d2 = {"LcB4;", "LNA4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "Lco/bird/android/model/LegacyRepairType;", "checkedRepairTypes", "", C17296a.f69688o, "Lio/reactivex/F;", "B", "v", "", "filterTerm", "x", "repairs", "LH6;", "w", "repairTypes", "A", "LaM;", "LaM;", "birdManager", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LeB4;", "c", "LeB4;", "ui", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "Lu7;", "e", "Lu7;", "converter", "", "f", "Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "checkedRepairs", "<init>", "(LaM;Lcom/uber/autodispose/ScopeProvider;LeB4;Le13;Lu7;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairLoggerAddPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairLoggerAddPresenter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n161#2:166\n180#2:167\n180#2:168\n199#2:169\n1360#3:170\n1446#3,5:171\n288#3,2:176\n1360#3:178\n1446#3,2:179\n1549#3:181\n1620#3,3:182\n1448#3,3:185\n*S KotlinDebug\n*F\n+ 1 RepairLoggerAddPresenter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/RepairLoggerAddPresenterImpl\n*L\n58#1:166\n62#1:167\n81#1:168\n96#1:169\n136#1:170\n136#1:171,5\n137#1:176,2\n150#1:178\n150#1:179,2\n153#1:181\n153#1:182,3\n150#1:185,3\n*E\n"})
/* renamed from: cB4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38996cB4 implements NA4 {

    /* renamed from: a */
    public final InterfaceC10636aM f60242a;

    /* renamed from: b */
    public final ScopeProvider f60243b;

    /* renamed from: c */
    public final InterfaceC40199eB4 f60244c;

    /* renamed from: d */
    public final InterfaceC40099e13 f60245d;

    /* renamed from: e */
    public final InterfaceC29058u7 f60246e;

    /* renamed from: f */
    public final List<LegacyRepairType> f60247f;

    /* renamed from: g */
    public final ArrayList<LegacyRepairType> f60248g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cB4$a */
    /* loaded from: classes3.dex */
    public static final class C13429a extends Lambda implements Function1<Unit, Unit> {
        public C13429a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38996cB4.this.m61770v();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/LegacyRepairType;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cB4$b */
    /* loaded from: classes3.dex */
    public static final class C13430b extends Lambda implements Function1<Pair<? extends LegacyRepairType, ? extends Boolean>, Unit> {
        public C13430b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends LegacyRepairType, ? extends Boolean> pair) {
            invoke2((Pair<LegacyRepairType, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<LegacyRepairType, Boolean> pair) {
            LegacyRepairType component1 = pair.component1();
            boolean booleanValue = pair.component2().booleanValue();
            if (booleanValue && !C38996cB4.this.f60248g.contains(component1)) {
                C38996cB4.this.f60248g.add(component1);
            } else if (!booleanValue) {
                C38996cB4.this.f60248g.remove(component1);
            }
            C38996cB4.this.f60244c.mo39896ph(C38996cB4.this.f60248g.size());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cB4$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13431c extends FunctionReferenceImpl implements Function1<String, AbstractC23442F<List<? extends LegacyRepairType>>> {
        public C13431c(Object obj) {
            super(1, obj, C38996cB4.class, "filterRepairs", "filterRepairs(Ljava/lang/String;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<LegacyRepairType>> invoke(String str) {
            return ((C38996cB4) this.receiver).m61768x(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/LegacyRepairType;", "repairs", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cB4$d */
    /* loaded from: classes3.dex */
    public static final class C13432d extends Lambda implements Function1<List<? extends LegacyRepairType>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C13432d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<LegacyRepairType> repairs) {
            Intrinsics.checkNotNullParameter(repairs, "repairs");
            return C38996cB4.this.m61769w(repairs);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cB4$e */
    /* loaded from: classes3.dex */
    public static final class C13433e extends Lambda implements Function1<Throwable, Unit> {
        public C13433e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C41318g46.m40159e(e);
            InterfaceC40199eB4 interfaceC40199eB4 = C38996cB4.this.f60244c;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            interfaceC40199eB4.error(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "sections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cB4$f */
    /* loaded from: classes3.dex */
    public static final class C13434f extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C13434f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> sections) {
            InterfaceC40199eB4 interfaceC40199eB4 = C38996cB4.this.f60244c;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            interfaceC40199eB4.mo39897T4(sections);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/LegacyRepairType;", "repairs", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cB4$g */
    /* loaded from: classes3.dex */
    public static final class C13435g extends Lambda implements Function1<List<LegacyRepairType>, InterfaceC23434B<? extends LegacyRepairType>> {

        /* renamed from: g */
        public static final C13435g f60254g = new C13435g();

        public C13435g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends LegacyRepairType> invoke(List<LegacyRepairType> repairs) {
            Intrinsics.checkNotNullParameter(repairs, "repairs");
            return Observable.fromIterable(repairs);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/LegacyRepairType;", "repair", "", C17296a.f69688o, "(Lco/bird/android/model/LegacyRepairType;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cB4$h */
    /* loaded from: classes3.dex */
    public static final class C13436h extends Lambda implements Function1<LegacyRepairType, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f60255g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13436h(String str) {
            super(1);
            this.f60255g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(LegacyRepairType repair) {
            boolean contains$default;
            Intrinsics.checkNotNullParameter(repair, "repair");
            String lowerCase = repair.getDisplay().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) this.f60255g, false, 2, (Object) null);
            return Boolean.valueOf(contains$default);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/LegacyRepairType;", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cB4$i */
    /* loaded from: classes3.dex */
    public static final class C13437i extends Lambda implements Function1<HM4<List<? extends LegacyRepairType>>, List<? extends LegacyRepairType>> {

        /* renamed from: g */
        public static final C13437i f60256g = new C13437i();

        public C13437i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<LegacyRepairType> invoke(HM4<List<LegacyRepairType>> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return response.m103944a();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cB4$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13438j extends FunctionReferenceImpl implements Function1<List<? extends LegacyRepairType>, List<? extends LegacyRepairType>> {
        public C13438j(Object obj) {
            super(1, obj, C38996cB4.class, "flattenRepairTypes", "flattenRepairTypes(Ljava/util/List;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<LegacyRepairType> invoke(List<LegacyRepairType> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C38996cB4) this.receiver).m61799A(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "repairTypes", "", "Lco/bird/android/model/LegacyRepairType;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cB4$k */
    /* loaded from: classes3.dex */
    public static final class C13439k extends Lambda implements Function1<List<? extends LegacyRepairType>, Unit> {
        public C13439k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends LegacyRepairType> list) {
            invoke2((List<LegacyRepairType>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<LegacyRepairType> repairTypes) {
            List list = C38996cB4.this.f60247f;
            Intrinsics.checkNotNullExpressionValue(repairTypes, "repairTypes");
            list.addAll(repairTypes);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/LegacyRepairType;", "repairTypes", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cB4$l */
    /* loaded from: classes3.dex */
    public static final class C13440l extends Lambda implements Function1<List<? extends LegacyRepairType>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f60259h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13440l(WireBird wireBird) {
            super(1);
            this.f60259h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<LegacyRepairType> repairTypes) {
            Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
            return C38996cB4.this.f60246e.mo7395a(this.f60259h, repairTypes, C38996cB4.this.f60248g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "adapterSections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cB4$m */
    /* loaded from: classes3.dex */
    public static final class C13441m extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C13441m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> adapterSections) {
            InterfaceC40199eB4 interfaceC40199eB4 = C38996cB4.this.f60244c;
            Intrinsics.checkNotNullExpressionValue(adapterSections, "adapterSections");
            interfaceC40199eB4.mo39897T4(adapterSections);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cB4$n */
    /* loaded from: classes3.dex */
    public static final class C13442n extends Lambda implements Function1<Throwable, Unit> {
        public C13442n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            InterfaceC40199eB4 interfaceC40199eB4 = C38996cB4.this.f60244c;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            interfaceC40199eB4.error(e);
            C41318g46.m40159e(e);
        }
    }

    public C38996cB4(InterfaceC10636aM birdManager, ScopeProvider scopeProvider, InterfaceC40199eB4 ui, InterfaceC40099e13 navigator, InterfaceC29058u7 converter) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f60242a = birdManager;
        this.f60243b = scopeProvider;
        this.f60244c = ui;
        this.f60245d = navigator;
        this.f60246e = converter;
        this.f60247f = new ArrayList();
        this.f60248g = new ArrayList<>();
        Object m32150f = ui.mo39898S5().m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13429a c13429a = new C13429a();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: ZA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38996cB4.m61776p(Function1.this, obj);
            }
        });
        Object m33094as = ui.repairItemChecks().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13430b c13430b = new C13430b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: aB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38996cB4.m61775q(Function1.this, obj);
            }
        });
        Observable<String> mo39902I1 = ui.mo39902I1();
        final C13431c c13431c = new C13431c(this);
        Observable<R> flatMapSingle = mo39902I1.flatMapSingle(new InterfaceC23492o() { // from class: bB4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61774r;
                m61774r = C38996cB4.m61774r(Function1.this, obj);
                return m61774r;
            }
        });
        final C13432d c13432d = new C13432d();
        Observable flatMapSingle2 = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: PA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61773s;
                m61773s = C38996cB4.m61773s(Function1.this, obj);
                return m61773s;
            }
        });
        final C13433e c13433e = new C13433e();
        Observable retry = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: QA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38996cB4.m61772t(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "ui.searchTermChanged()\n …e)\n      }\n      .retry()");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13434f c13434f = new C13434f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: RA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38996cB4.m61771u(Function1.this, obj);
            }
        });
    }

    /* renamed from: C */
    public static final List m61797C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m61796D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final List m61795E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m61794F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23447K m61793G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m61792H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m61776p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m61775q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m61774r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m61773s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m61772t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m61771u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23434B m61767y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final boolean m61766z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: A */
    public final List<LegacyRepairType> m61799A(List<LegacyRepairType> list) {
        List<LegacyRepairType> list2;
        boolean z;
        Collection listOf;
        int collectionSizeOrDefault;
        ArrayList arrayList = new ArrayList();
        for (LegacyRepairType legacyRepairType : list) {
            List<LegacyRepairType> subKeys = legacyRepairType.getSubKeys();
            List<LegacyRepairType> list3 = subKeys;
            if (list3 != null && !list3.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(legacyRepairType);
            } else {
                List<LegacyRepairType> list4 = subKeys;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
                listOf = new ArrayList(collectionSizeOrDefault);
                for (LegacyRepairType legacyRepairType2 : list4) {
                    legacyRepairType2.setParentKey(legacyRepairType.getKey());
                    legacyRepairType2.setParentDisplay(legacyRepairType.getDisplay());
                    listOf.add(legacyRepairType2);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
        }
        list2 = CollectionsKt___CollectionsKt.toList(arrayList);
        return list2;
    }

    /* renamed from: B */
    public AbstractC23442F<List<LegacyRepairType>> m61798B(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F<HM4<List<LegacyRepairType>>> mo71597L0 = this.f60242a.mo71597L0(ScanMode.SERVICE_CENTER, bird.getId());
        final C13437i c13437i = C13437i.f60256g;
        AbstractC23442F m33157I = mo71597L0.m33157I(new InterfaceC23492o() { // from class: SA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m61797C;
                m61797C = C38996cB4.m61797C(Function1.this, obj);
                return m61797C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "birdManager.getRepairOpt…onse -> response.body() }");
        return m33157I;
    }

    @Override // p000.NA4
    /* renamed from: a */
    public void mo61791a(WireBird bird, List<LegacyRepairType> checkedRepairTypes) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(checkedRepairTypes, "checkedRepairTypes");
        this.f60248g.addAll(checkedRepairTypes);
        this.f60244c.mo39896ph(this.f60248g.size());
        AbstractC23442F<List<LegacyRepairType>> m33142Y = m61798B(bird).m33142Y(C24542a.m31932c());
        final C13438j c13438j = new C13438j(this);
        AbstractC23442F<R> m33157I = m33142Y.m33157I(new InterfaceC23492o() { // from class: UA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m61795E;
                m61795E = C38996cB4.m61795E(Function1.this, obj);
                return m61795E;
            }
        });
        final C13439k c13439k = new C13439k();
        AbstractC23442F m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: VA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38996cB4.m61794F(Function1.this, obj);
            }
        });
        final C13440l c13440l = new C13440l(bird);
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: WA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m61793G;
                m61793G = C38996cB4.m61793G(Function1.this, obj);
                return m61793G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun onCreate(bi… Timber.e(e)\n      })\n  }");
        AbstractC23442F m33152N = C28237sD.progress$default(m33165A, this.f60244c, 0, 2, (Object) null).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onCreate(bi… Timber.e(e)\n      })\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f60243b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13441m c13441m = new C13441m();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: XA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38996cB4.m61792H(Function1.this, obj);
            }
        };
        final C13442n c13442n = new C13442n();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: YA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38996cB4.m61796D(Function1.this, obj);
            }
        });
    }

    /* renamed from: v */
    public void m61770v() {
        Intent putExtra = new Intent().putExtra("repair_options", this.f60248g);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras…_OPTIONS, checkedRepairs)");
        this.f60245d.mo37029e4(-1, putExtra);
    }

    /* renamed from: w */
    public final AbstractC23442F<List<C3023H6>> m61769w(List<LegacyRepairType> list) {
        WireBird wireBird;
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        for (C3023H6 c3023h6 : this.f60244c.mo39895q0()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, c3023h6.m104408e());
        }
        Iterator it = arrayList.iterator();
        while (true) {
            wireBird = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((C2637G6) obj).m105816c() instanceof WireBird) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C2637G6 c2637g6 = (C2637G6) obj;
        if (c2637g6 != null) {
            obj2 = c2637g6.m105816c();
        } else {
            obj2 = null;
        }
        if (obj2 instanceof WireBird) {
            wireBird = obj2;
        }
        if (wireBird != null) {
            return this.f60246e.mo7395a(wireBird, list, this.f60248g);
        }
        throw new NullPointerException("Bird not found in adapter!");
    }

    /* renamed from: x */
    public final AbstractC23442F<List<LegacyRepairType>> m61768x(String str) {
        boolean z;
        CharSequence trim;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AbstractC23442F<List<LegacyRepairType>> m33158H = AbstractC23442F.m33158H(this.f60247f);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(this.repairTypes)");
            return m33158H;
        }
        trim = StringsKt__StringsKt.trim((CharSequence) str);
        String obj = trim.toString();
        AbstractC23442F m33158H2 = AbstractC23442F.m33158H(this.f60247f);
        final C13435g c13435g = C13435g.f60254g;
        Observable m33162D = m33158H2.m33162D(new InterfaceC23492o() { // from class: OA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                InterfaceC23434B m61767y;
                m61767y = C38996cB4.m61767y(Function1.this, obj2);
                return m61767y;
            }
        });
        final C13436h c13436h = new C13436h(obj);
        AbstractC23442F<List<LegacyRepairType>> list = m33162D.filter(new InterfaceC23494q() { // from class: TA4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj2) {
                boolean m61766z;
                m61766z = C38996cB4.m61766z(Function1.this, obj2);
                return m61766z;
            }
        }).toList();
        Intrinsics.checkNotNullExpressionValue(list, "trimmedTerm = filterTerm…edTerm) }\n      .toList()");
        return list;
    }
}
