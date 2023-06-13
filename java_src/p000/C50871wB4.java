package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LoggedRepair;
import co.bird.android.model.User;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C45672nQ5;
import p000.C50871wB4;
import p000.FQ5;
import p000.H31;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00103\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R.\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n 0*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102¨\u00068"}, m28432d2 = {"LwB4;", "LjB4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "onBackPressed", "u", "b", "", "Lco/bird/android/model/LegacyRepairType;", "repairs", "c", "Lco/bird/android/model/LoggedRepair;", "z", "LaM;", "LaM;", "birdManager", "LTq4;", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LzB4;", DateTokenConverter.CONVERTER_KEY, "LzB4;", "ui", "Le13;", "e", "Le13;", "navigator", "LFA4;", "f", "LFA4;", "converter", "LrD4;", "g", "LrD4;", "statusConverter", "Lgl;", "h", "Lgl;", "preference", "i", "Lco/bird/android/model/wire/WireBird;", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/subjects/a;", "summarySubject", "k", "repairsSubject", "<init>", "(LaM;LTq4;Lcom/uber/autodispose/ScopeProvider;LzB4;Le13;LFA4;LrD4;Lgl;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairLoggerListPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairLoggerListPresenter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n161#2:215\n180#2:216\n180#2:219\n199#2:220\n199#2:234\n180#2:264\n199#2:265\n61#3,2:217\n1360#4:221\n1446#4,5:222\n766#4:227\n857#4,2:228\n1549#4:230\n1620#4,3:231\n1360#4:235\n1446#4,5:236\n766#4:241\n857#4,2:242\n1549#4:244\n1620#4,3:245\n1360#4:248\n1446#4,5:249\n1549#4:254\n1620#4,3:255\n1549#4:258\n1620#4,3:259\n288#4,2:262\n*S KotlinDebug\n*F\n+ 1 RepairLoggerListPresenter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListPresenterImpl\n*L\n70#1:215\n74#1:216\n86#1:219\n98#1:220\n120#1:234\n161#1:264\n196#1:265\n77#1:217,2\n111#1:221\n111#1:222,5\n112#1:227\n112#1:228,2\n113#1:230\n113#1:231,3\n130#1:235\n130#1:236,5\n131#1:241\n131#1:242,2\n132#1:244\n132#1:245,3\n138#1:248\n138#1:249,5\n140#1:254\n140#1:255,3\n142#1:258\n142#1:259,3\n151#1:262,2\n*E\n"})
/* renamed from: wB4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50871wB4 implements InterfaceC43164jB4 {

    /* renamed from: a */
    public final InterfaceC10636aM f115456a;

    /* renamed from: b */
    public final C36207Tq4 f115457b;

    /* renamed from: c */
    public final ScopeProvider f115458c;

    /* renamed from: d */
    public final InterfaceC52650zB4 f115459d;

    /* renamed from: e */
    public final InterfaceC40099e13 f115460e;

    /* renamed from: f */
    public final FA4 f115461f;

    /* renamed from: g */
    public final InterfaceC47926rD4 f115462g;

    /* renamed from: h */
    public final C22454gl f115463h;

    /* renamed from: i */
    public WireBird f115464i;

    /* renamed from: j */
    public final C24552a<BirdSummaryBody> f115465j;

    /* renamed from: k */
    public final C24552a<List<LegacyRepairType>> f115466k;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wB4$a */
    /* loaded from: classes3.dex */
    public static final class C29794a extends Lambda implements Function1<Unit, Unit> {
        public C29794a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C50871wB4.this.m7285u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wB4$b */
    /* loaded from: classes3.dex */
    public static final class C29795b extends Lambda implements Function1<WireBird, Unit> {
        public C29795b() {
            super(1);
        }

        /* renamed from: a */
        public final void m7279a(WireBird bird) {
            InterfaceC40099e13 interfaceC40099e13 = C50871wB4.this.f115460e;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            interfaceC40099e13.mo37135L2(bird);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m7279a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00030\u0003 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/LegacyRepairType;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wB4$c */
    /* loaded from: classes3.dex */
    public static final class C29796c extends Lambda implements Function1<Triple<? extends BirdSummaryBody, ? extends List<? extends LegacyRepairType>, ? extends Boolean>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C29796c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Triple<BirdSummaryBody, ? extends List<LegacyRepairType>, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            BirdSummaryBody birdSummary = triple.component1();
            List<LegacyRepairType> component2 = triple.component2();
            boolean booleanValue = triple.component3().booleanValue();
            FA4 fa4 = C50871wB4.this.f115461f;
            WireBird wireBird = C50871wB4.this.f115464i;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            Intrinsics.checkNotNullExpressionValue(birdSummary, "birdSummary");
            return fa4.mo104196b(wireBird, birdSummary, component2, booleanValue);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wB4$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29797d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C29797d(Object obj) {
            super(1, obj, InterfaceC52650zB4.class, "setAdapterItems", "setAdapterItems(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC52650zB4) this.receiver).mo1699Qb(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wB4$e */
    /* loaded from: classes3.dex */
    public static final class C29798e extends Lambda implements Function1<Throwable, Unit> {
        public C29798e() {
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
            C50871wB4.this.f115459d.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wB4$f */
    /* loaded from: classes3.dex */
    public static final class C29799f extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<LoggedRepair> f115472h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29799f(List<LoggedRepair> list) {
            super(1);
            this.f115472h = list;
        }

        /* renamed from: a */
        public final void m7277a(C45672nQ5.EnumC26504b enumC26504b) {
            if (enumC26504b == C45672nQ5.EnumC26504b.TRY_AGAIN) {
                C50871wB4.this.m7280z(this.f115472h);
            } else {
                C50871wB4.this.f115460e.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
            m7277a(enumC26504b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wB4$g */
    /* loaded from: classes3.dex */
    public static final class C29800g extends Lambda implements Function1<DialogResponse, Unit> {
        public C29800g() {
            super(1);
        }

        /* renamed from: a */
        public final void m7276a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                C50871wB4.this.f115460e.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m7276a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wB4$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29801h extends FunctionReferenceImpl implements Function1<BirdSummaryBody, Unit> {
        public C29801h(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m7275a(BirdSummaryBody p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdSummaryBody birdSummaryBody) {
            m7275a(birdSummaryBody);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wB4$i */
    /* loaded from: classes3.dex */
    public static final class C29802i extends Lambda implements Function1<Throwable, Unit> {
        public C29802i() {
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
                C50871wB4.this.f115459d.error(th);
            } else {
                C50871wB4.this.f115459d.error(C45871nl4.error_generic_body);
                C41318g46.m40159e(th);
            }
            C50871wB4.this.f115459d.dismissDialog();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: wB4$j */
    /* loaded from: classes3.dex */
    public static final class C29803j<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C29803j<T1, T2, T3, R> f115475a = new C29803j<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \b*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00040\u0004 \b*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \b*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LHM4;", "", "response", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "", "LH6;", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wB4$k */
    /* loaded from: classes3.dex */
    public static final class C29804k extends Lambda implements Function1<HM4<Unit>, InterfaceC23447K<? extends Pair<? extends Boolean, ? extends List<? extends C3023H6>>>> {

        /* renamed from: h */
        public final /* synthetic */ List<LoggedRepair> f115477h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "sections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: wB4$k$a */
        /* loaded from: classes3.dex */
        public static final class C29805a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends Boolean, ? extends List<? extends C3023H6>>> {

            /* renamed from: g */
            public final /* synthetic */ HM4<Unit> f115478g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29805a(HM4<Unit> hm4) {
                super(1);
                this.f115478g = hm4;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Boolean, List<C3023H6>> invoke(List<C3023H6> sections) {
                Intrinsics.checkNotNullParameter(sections, "sections");
                return TuplesKt.m28425to(Boolean.valueOf(this.f115478g.m103939f()), sections);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29804k(List<LoggedRepair> list) {
            super(1);
            this.f115477h = list;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Boolean, List<C3023H6>>> invoke(HM4<Unit> response) {
            AbstractC23442F<List<C3023H6>> mo10596f;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                InterfaceC47926rD4 interfaceC47926rD4 = C50871wB4.this.f115462g;
                int size = this.f115477h.size();
                WireBird wireBird = C50871wB4.this.f115464i;
                if (wireBird == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird = null;
                }
                mo10596f = interfaceC47926rD4.mo10597e(size, wireBird.getCode());
            } else {
                mo10596f = C50871wB4.this.f115462g.mo10596f();
            }
            final C29805a c29805a = new C29805a(response);
            return mo10596f.m33157I(new InterfaceC23492o() { // from class: xB4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C50871wB4.C29804k.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "LH6;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wB4$l */
    /* loaded from: classes3.dex */
    public static final class C29806l extends Lambda implements Function1<Pair<? extends Boolean, ? extends List<? extends C3023H6>>, Unit> {
        public C29806l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends List<? extends C3023H6>> pair) {
            invoke2((Pair<Boolean, ? extends List<C3023H6>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, ? extends List<C3023H6>> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            List<C3023H6> sections = pair.component2();
            if (booleanValue) {
                InterfaceC52650zB4 interfaceC52650zB4 = C50871wB4.this.f115459d;
                Intrinsics.checkNotNullExpressionValue(sections, "sections");
                interfaceC52650zB4.mo12610b1(sections);
                return;
            }
            InterfaceC52650zB4 interfaceC52650zB42 = C50871wB4.this.f115459d;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            interfaceC52650zB42.mo12607g1(sections);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wB4$m */
    /* loaded from: classes3.dex */
    public static final class C29807m extends Lambda implements Function1<Throwable, Unit> {
        public C29807m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            List<C3023H6> sections = C50871wB4.this.f115462g.mo10596f().m33132g();
            InterfaceC52650zB4 interfaceC52650zB4 = C50871wB4.this.f115459d;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            interfaceC52650zB4.mo12607g1(sections);
            C41318g46.m40159e(th);
        }
    }

    public C50871wB4(InterfaceC10636aM birdManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC52650zB4 ui, InterfaceC40099e13 navigator, FA4 converter, InterfaceC47926rD4 statusConverter, C22454gl preference) {
        List emptyList;
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(statusConverter, "statusConverter");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f115456a = birdManager;
        this.f115457b = reactiveConfig;
        this.f115458c = scopeProvider;
        this.f115459d = ui;
        this.f115460e = navigator;
        this.f115461f = converter;
        this.f115462g = statusConverter;
        this.f115463h = preference;
        C24552a<BirdSummaryBody> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<BirdSummaryBody>()");
        this.f115465j = m31922e;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<LegacyRepairType>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<LegacyRepairType>>(emptyList())");
        this.f115466k = m31921g;
        Object m32150f = ui.mo1701F1().m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29794a c29794a = new C29794a();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: nB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7290p(Function1.this, obj);
            }
        });
        Object m33094as = ui.mo1696j0().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29795b c29795b = new C29795b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: oB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7289q(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(m31922e, m31921g, reactiveConfig.m82648d5(), C29803j.f115475a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        final C29796c c29796c = new C29796c();
        Observable observeOn = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: pB4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m7288r;
                m7288r = C50871wB4.m7288r(Function1.this, obj);
                return m7288r;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29797d c29797d = new C29797d(ui);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: qB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7287s(Function1.this, obj);
            }
        };
        final C29798e c29798e = new C29798e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: rB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7286t(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final InterfaceC23447K m7308A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m7307B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m7306C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m7290p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m7289q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m7288r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m7287s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m7286t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m7284v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m7283w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m7282x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m7281y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC43164jB4
    /* renamed from: a */
    public void mo7305a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f115464i = bird;
        Object m33135e = C38096ag5.m70883l(this.f115456a.mo71571o(bird.getId())).m33135e(AutoDispose.m45239a(this.f115458c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29801h c29801h = new C29801h(this.f115465j);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: sB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7282x(Function1.this, obj);
            }
        };
        final C29802i c29802i = new C29802i();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: tB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7281y(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (r0 != false) goto L46;
     */
    @Override // p000.InterfaceC43164jB4
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo7304b() {
        int collectionSizeOrDefault;
        List filterIsInstance;
        int collectionSizeOrDefault2;
        boolean z;
        Object obj;
        boolean isBlank;
        boolean z2;
        LoggedRepair loggedRepair;
        ArrayList<C2637G6> arrayList = new ArrayList();
        for (C3023H6 c3023h6 : this.f115459d.mo1698Yj()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, c3023h6.m104408e());
        }
        User m37750B0 = this.f115463h.m37750B0();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (C2637G6 c2637g6 : arrayList) {
            arrayList2.add(c2637g6.m105816c());
        }
        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(arrayList2, LegacyRepairType.class);
        List<LegacyRepairType> list = filterIsInstance;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
        for (LegacyRepairType legacyRepairType : list) {
            if (legacyRepairType.getParentKey() == null) {
                loggedRepair = new LoggedRepair(legacyRepairType.getKey(), null, 2, null);
            } else {
                String parentKey = legacyRepairType.getParentKey();
                Intrinsics.checkNotNull(parentKey);
                loggedRepair = new LoggedRepair(parentKey, legacyRepairType.getKey());
            }
            arrayList3.add(loggedRepair);
        }
        if (m37750B0 != null && (!arrayList3.isEmpty())) {
            Iterator it = arrayList3.iterator();
            while (true) {
                z = false;
                if (it.hasNext()) {
                    obj = it.next();
                    LoggedRepair loggedRepair2 = (LoggedRepair) obj;
                    if (!Intrinsics.areEqual(loggedRepair2.getRepairType(), LegacyRepairType.OTHER_KEY) && !Intrinsics.areEqual(loggedRepair2.getSubType(), LegacyRepairType.OTHER_KEY)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (((LoggedRepair) obj) != null) {
                String mo1697b5 = this.f115459d.mo1697b5();
                if (mo1697b5 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(mo1697b5);
                }
                z = true;
                if (z) {
                    this.f115459d.mo1700G5();
                    return;
                }
            }
            Observable observeOn = FQ5.C2274a.showStatusDialog$default(this.f115459d, null, 1, null).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "ui.showStatusDialog()\n  …dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f115458c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C29799f c29799f = new C29799f(arrayList3);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: mB4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj2) {
                    C50871wB4.m7284v(Function1.this, obj2);
                }
            });
            m7280z(arrayList3);
        } else if (arrayList3.isEmpty()) {
            H31.C3014a.dialog$default(this.f115459d, LA4.f20840d, false, false, 6, null).subscribe();
        }
    }

    @Override // p000.InterfaceC43164jB4
    /* renamed from: c */
    public void mo7303c(List<LegacyRepairType> repairs) {
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        this.f115466k.onNext(repairs);
    }

    @Override // p000.InterfaceC43164jB4
    public void onBackPressed() {
        int collectionSizeOrDefault;
        ArrayList arrayList = new ArrayList();
        for (C3023H6 c3023h6 : this.f115459d.mo1698Yj()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, c3023h6.m104408e());
        }
        ArrayList<C2637G6> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C2637G6) obj).m105816c() instanceof LegacyRepairType) {
                arrayList2.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (C2637G6 c2637g6 : arrayList2) {
            Object m105816c = c2637g6.m105816c();
            Intrinsics.checkNotNull(m105816c, "null cannot be cast to non-null type co.bird.android.model.LegacyRepairType");
            arrayList3.add((LegacyRepairType) m105816c);
        }
        if (arrayList3.isEmpty()) {
            this.f115460e.close();
            return;
        }
        Object m33135e = H31.C3014a.dialog$default(this.f115459d, KA4.f19225d, false, false, 6, null).m33135e(AutoDispose.m45239a(this.f115458c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29800g c29800g = new C29800g();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: kB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C50871wB4.m7283w(Function1.this, obj2);
            }
        });
    }

    /* renamed from: u */
    public void m7285u() {
        int collectionSizeOrDefault;
        ArrayList arrayList = new ArrayList();
        for (C3023H6 c3023h6 : this.f115459d.mo1698Yj()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, c3023h6.m104408e());
        }
        ArrayList<C2637G6> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C2637G6) obj).m105816c() instanceof LegacyRepairType) {
                arrayList2.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (C2637G6 c2637g6 : arrayList2) {
            Object m105816c = c2637g6.m105816c();
            Intrinsics.checkNotNull(m105816c, "null cannot be cast to non-null type co.bird.android.model.LegacyRepairType");
            arrayList3.add((LegacyRepairType) m105816c);
        }
        InterfaceC40099e13 interfaceC40099e13 = this.f115460e;
        WireBird wireBird = this.f115464i;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        interfaceC40099e13.mo37186D(wireBird, arrayList3);
    }

    /* renamed from: z */
    public final void m7280z(List<LoggedRepair> list) {
        User m37750B0 = this.f115463h.m37750B0();
        if (m37750B0 == null) {
            return;
        }
        InterfaceC10636aM interfaceC10636aM = this.f115456a;
        WireBird wireBird = this.f115464i;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        AbstractC23442F<HM4<Unit>> mo71592Q0 = interfaceC10636aM.mo71592Q0(wireBird.getId(), m37750B0.getId(), list, this.f115459d.mo1697b5(), ScanMode.SERVICE_CENTER, m37750B0.getWarehouseId());
        S74 mo107152sh = this.f115459d.mo107152sh();
        if (mo107152sh == null) {
            mo107152sh = this.f115459d;
        }
        AbstractC23442F progress$default = C28237sD.progress$default(mo71592Q0, mo107152sh, 0, 2, (Object) null);
        final C29804k c29804k = new C29804k(list);
        AbstractC23442F m33152N = progress$default.m33165A(new InterfaceC23492o() { // from class: uB4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m7308A;
                m7308A = C50871wB4.m7308A(Function1.this, obj);
                return m7308A;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun submitRepair… Timber.e(e)\n      })\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f115458c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29806l c29806l = new C29806l();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: vB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7307B(Function1.this, obj);
            }
        };
        final C29807m c29807m = new C29807m();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: lB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50871wB4.m7306C(Function1.this, obj);
            }
        });
    }
}
