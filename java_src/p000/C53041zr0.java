package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.Folder;
import co.bird.android.model.constant.ComplaintResolutionField;
import co.bird.android.model.persistence.ComplaintResolution;
import co.bird.android.model.persistence.ComplaintResolutionForm;
import co.bird.android.model.persistence.nestedstructures.ComplaintActionTakenRequiredField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C53041zr0;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u000f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006*"}, m28432d2 = {"Lzr0;", "Lf1;", "LXr0;", "Les0;", "Lco/bird/android/model/constant/ComplaintResolutionField;", "field", "", "checked", "", "E0", "", "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;", "Lco/bird/android/model/persistence/ComplaintResolution;", "repoData", "G0", "F0", "renderer", "V", "", "e", "Ljava/util/List;", "complaintIds", "Lom3;", "f", "Lom3;", "operatorManager", "LIq0;", "g", "LIq0;", "converter", "Le13;", "h", "Le13;", "navigator", "", "i", "Ljava/util/Map;", "requiredFieldMap", "j", "nonRequiredFieldMap", "<init>", "(Ljava/util/List;Lom3;LIq0;Le13;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComplaintResolutionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n199#2:382\n180#2:383\n180#2:384\n180#2:385\n180#2:386\n237#2:387\n237#2:388\n237#2:389\n180#2:390\n237#2:391\n180#2:392\n180#2:393\n180#2:394\n1726#3,3:395\n766#3:398\n857#3,2:399\n1549#3:401\n1620#3,3:402\n1855#3,2:405\n766#3:407\n857#3,2:408\n1549#3:410\n1620#3,3:411\n1855#3,2:414\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter\n*L\n48#1:382\n95#1:383\n128#1:384\n162#1:385\n167#1:386\n193#1:387\n204#1:388\n216#1:389\n250#1:390\n274#1:391\n279#1:392\n311#1:393\n345#1:394\n354#1:395,3\n361#1:398\n361#1:399,2\n361#1:401\n361#1:402,3\n361#1:405,2\n364#1:407\n364#1:408,2\n364#1:410\n364#1:411,3\n364#1:414,2\n*E\n"})
/* renamed from: zr0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53041zr0 extends AbstractC20169f1<InterfaceC37148Xr0, InterfaceC40600es0> {

    /* renamed from: e */
    public final List<String> f122322e;

    /* renamed from: f */
    public final InterfaceC46473om3 f122323f;

    /* renamed from: g */
    public final C33629Iq0 f122324g;

    /* renamed from: h */
    public final InterfaceC40099e13 f122325h;

    /* renamed from: i */
    public final Map<ComplaintResolutionField, Boolean> f122326i;

    /* renamed from: j */
    public final Map<ComplaintResolutionField, Boolean> f122327j;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/ComplaintResolution;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$A */
    /* loaded from: classes3.dex */
    public static final class C31524A extends Lambda implements Function1<Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C31524A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<ComplaintResolutionForm, ComplaintResolution> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ComplaintResolutionForm form = pair.component1();
            ComplaintResolution repoData = pair.component2();
            if (repoData.getSubmitted()) {
                C33629Iq0 c33629Iq0 = C53041zr0.this.f122324g;
                Intrinsics.checkNotNullExpressionValue(form, "form");
                Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
                return c33629Iq0.m101632j(form, repoData);
            }
            C33629Iq0 c33629Iq02 = C53041zr0.this.f122324g;
            Intrinsics.checkNotNullExpressionValue(form, "form");
            Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
            return c33629Iq02.m101629m(form, repoData);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$B */
    /* loaded from: classes3.dex */
    public static final class C31525B extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C31525B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C53041zr0 c53041zr0 = C53041zr0.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c53041zr0.m42280h(new C33059Ge6(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolutionForm;", "it", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$C */
    /* loaded from: classes3.dex */
    public static final class C31526C extends Lambda implements Function1<ComplaintResolutionForm, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C31526C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(ComplaintResolutionForm it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C53041zr0.this.f122324g.m101634h();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$D */
    /* loaded from: classes3.dex */
    public static final class C31527D extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C31527D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C53041zr0 c53041zr0 = C53041zr0.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c53041zr0.m42280h(new C33059Ge6(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$E */
    /* loaded from: classes3.dex */
    public static final class C31528E extends Lambda implements Function1<List<? extends C3023H6>, Unit> {

        /* renamed from: g */
        public static final C31528E f122332g = new C31528E();

        public C31528E() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr0$F */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C31529F extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C31529F f122333b = new C31529F();

        public C31529F() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lga2;", "category", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/ComplaintResolution;", "kotlin.jvm.PlatformType", "b", "(Lga2;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$G */
    /* loaded from: classes3.dex */
    public static final class C31530G extends Lambda implements Function1<EnumC41608ga2, InterfaceC23447K<? extends ComplaintResolution>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution;", "repoData", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/android/model/persistence/ComplaintResolution;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$G$a */
        /* loaded from: classes3.dex */
        public static final class C31531a extends Lambda implements Function1<ComplaintResolution, ComplaintResolution> {

            /* renamed from: g */
            public final /* synthetic */ EnumC41608ga2 f122335g;

            /* renamed from: h */
            public final /* synthetic */ C53041zr0 f122336h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31531a(EnumC41608ga2 enumC41608ga2, C53041zr0 c53041zr0) {
                super(1);
                this.f122335g = enumC41608ga2;
                this.f122336h = c53041zr0;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final ComplaintResolution invoke(ComplaintResolution repoData) {
                Intrinsics.checkNotNullParameter(repoData, "repoData");
                if (!Intrinsics.areEqual(repoData.getSituation(), this.f122335g.toString())) {
                    return ComplaintResolution.Companion.create(this.f122336h.f122322e, this.f122335g.toString());
                }
                return repoData;
            }
        }

        public C31530G() {
            super(1);
        }

        /* renamed from: c */
        public static final ComplaintResolution m301c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (ComplaintResolution) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends ComplaintResolution> invoke(EnumC41608ga2 category) {
            Intrinsics.checkNotNullParameter(category, "category");
            AbstractC23442F<ComplaintResolution> m32042f0 = C53041zr0.this.f122323f.mo8151E(C53041zr0.this.f122322e).m32042f0(ComplaintResolution.Companion.create(C53041zr0.this.f122322e, category.toString()));
            final C31531a c31531a = new C31531a(category, C53041zr0.this);
            return m32042f0.m33157I(new InterfaceC23492o() { // from class: Ur0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    ComplaintResolution m301c;
                    m301c = C53041zr0.C31530G.m301c(Function1.this, obj);
                    return m301c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution;", "repoData", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$H */
    /* loaded from: classes3.dex */
    public static final class C31532H extends Lambda implements Function1<ComplaintResolution, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolutionForm;", "kotlin.jvm.PlatformType", "form", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolutionForm;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$H$a */
        /* loaded from: classes3.dex */
        public static final class C31533a extends Lambda implements Function1<ComplaintResolutionForm, Unit> {

            /* renamed from: g */
            public final /* synthetic */ ComplaintResolution f122338g;

            /* renamed from: h */
            public final /* synthetic */ C53041zr0 f122339h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31533a(ComplaintResolution complaintResolution, C53041zr0 c53041zr0) {
                super(1);
                this.f122338g = complaintResolution;
                this.f122339h = c53041zr0;
            }

            /* renamed from: a */
            public final void m295a(ComplaintResolutionForm complaintResolutionForm) {
                if (Intrinsics.areEqual(this.f122338g.getSituation(), EnumC41608ga2.BIRDS_INVOLVED.toString())) {
                    C53041zr0 c53041zr0 = this.f122339h;
                    List<ComplaintActionTakenRequiredField> actionTakenRequiredFields = complaintResolutionForm.getActionTakenRequiredFields();
                    ComplaintResolution repoData = this.f122338g;
                    Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
                    c53041zr0.m366G0(actionTakenRequiredFields, repoData);
                    return;
                }
                C53041zr0 c53041zr02 = this.f122339h;
                List<ComplaintActionTakenRequiredField> noActionTakenRequiredFields = complaintResolutionForm.getNoActionTakenRequiredFields();
                ComplaintResolution repoData2 = this.f122338g;
                Intrinsics.checkNotNullExpressionValue(repoData2, "repoData");
                c53041zr02.m366G0(noActionTakenRequiredFields, repoData2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ComplaintResolutionForm complaintResolutionForm) {
                m295a(complaintResolutionForm);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolutionForm;", "form", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$H$b */
        /* loaded from: classes3.dex */
        public static final class C31534b extends Lambda implements Function1<ComplaintResolutionForm, InterfaceC23447K<? extends List<? extends C3023H6>>> {

            /* renamed from: g */
            public final /* synthetic */ C53041zr0 f122340g;

            /* renamed from: h */
            public final /* synthetic */ ComplaintResolution f122341h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31534b(C53041zr0 c53041zr0, ComplaintResolution complaintResolution) {
                super(1);
                this.f122340g = c53041zr0;
                this.f122341h = complaintResolution;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends List<C3023H6>> invoke(ComplaintResolutionForm form) {
                Intrinsics.checkNotNullParameter(form, "form");
                C33629Iq0 c33629Iq0 = this.f122340g.f122324g;
                ComplaintResolution repoData = this.f122341h;
                Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
                return c33629Iq0.m101629m(form, repoData);
            }
        }

        public C31532H() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23447K m296d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(ComplaintResolution repoData) {
            Intrinsics.checkNotNullParameter(repoData, "repoData");
            AbstractC23461c mo8069x = C53041zr0.this.f122323f.mo8069x(repoData);
            AbstractC23442F<ComplaintResolutionForm> mo8086o1 = C53041zr0.this.f122323f.mo8086o1();
            final C31533a c31533a = new C31533a(repoData, C53041zr0.this);
            AbstractC23442F<ComplaintResolutionForm> m33101w = mo8086o1.m33101w(new InterfaceC23484g() { // from class: Vr0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C53041zr0.C31532H.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C31534b c31534b = new C31534b(C53041zr0.this, repoData);
            return mo8069x.m33042m(m33101w.m33165A(new InterfaceC23492o() { // from class: Wr0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m296d;
                    m296d = C53041zr0.C31532H.m296d(Function1.this, obj);
                    return m296d;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1726#2,3:382\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$9\n*L\n93#1:382,3\n*E\n"})
    /* renamed from: zr0$I */
    /* loaded from: classes3.dex */
    public static final class C31535I extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C31535I() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C53041zr0 c53041zr0 = C53041zr0.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c53041zr0.m42280h(new C33059Ge6(it));
            boolean z = true;
            C53041zr0.this.m42280h(new C49085tA5(true));
            C53041zr0 c53041zr02 = C53041zr0.this;
            Collection values = c53041zr02.f122326i.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it2 = values.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((Boolean) it2.next()).booleanValue()) {
                        z = false;
                        break;
                    }
                }
            }
            c53041zr02.m42280h(new C38042ab1(z));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C31536a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComplaintResolutionField.values().length];
            try {
                iArr[ComplaintResolutionField.ISSUES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComplaintResolutionField.BEFORE_PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComplaintResolutionField.AFTER_PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComplaintResolutionField.ADDITIONAL_NOTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ComplaintResolutionField.VEHICLES_INVOLVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ComplaintResolutionField.ACTION_TAKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ComplaintResolutionField.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/constant/ComplaintResolutionField;", "Lco/bird/android/model/FileUploadReceipt;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/ComplaintResolution;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$b */
    /* loaded from: classes3.dex */
    public static final class C31537b extends Lambda implements Function1<Pair<? extends ComplaintResolutionField, ? extends FileUploadReceipt>, InterfaceC23447K<? extends ComplaintResolution>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zr0$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C31538a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ComplaintResolutionField.values().length];
                try {
                    iArr[ComplaintResolutionField.BEFORE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ComplaintResolutionField.AFTER_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C31537b() {
            super(1);
        }

        /* renamed from: d */
        public static final void m290d(C53041zr0 this$0, ComplaintResolutionField field) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(field, "$field");
            this$0.m370E0(field, true);
        }

        /* renamed from: e */
        public static final InterfaceC23447K m289e(C53041zr0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f122323f.mo8151E(this$0.f122322e).m32043e0();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends ComplaintResolution> invoke(Pair<? extends ComplaintResolutionField, FileUploadReceipt> pair) {
            AbstractC23461c mo8129U0;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final ComplaintResolutionField component1 = pair.component1();
            FileUploadReceipt component2 = pair.component2();
            int i = C31538a.$EnumSwitchMapping$0[component1.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    mo8129U0 = AbstractC23461c.m33039p();
                } else {
                    mo8129U0 = C53041zr0.this.f122323f.mo8138P0(C53041zr0.this.f122322e, component2);
                }
            } else {
                mo8129U0 = C53041zr0.this.f122323f.mo8129U0(C53041zr0.this.f122322e, component2);
            }
            final C53041zr0 c53041zr0 = C53041zr0.this;
            AbstractC23461c m33029z = mo8129U0.m33029z(new InterfaceC23478a() { // from class: Ar0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53041zr0.C31537b.m290d(C53041zr0.this, component1);
                }
            });
            final C53041zr0 c53041zr02 = C53041zr0.this;
            return m33029z.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Br0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m289e;
                    m289e = C53041zr0.C31537b.m289e(C53041zr0.this);
                    return m289e;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution;", "repoData", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$c */
    /* loaded from: classes3.dex */
    public static final class C31539c extends Lambda implements Function1<ComplaintResolution, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolutionForm;", "form", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$c$a */
        /* loaded from: classes3.dex */
        public static final class C31540a extends Lambda implements Function1<ComplaintResolutionForm, InterfaceC23447K<? extends List<? extends C3023H6>>> {

            /* renamed from: g */
            public final /* synthetic */ C53041zr0 f122345g;

            /* renamed from: h */
            public final /* synthetic */ ComplaintResolution f122346h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31540a(C53041zr0 c53041zr0, ComplaintResolution complaintResolution) {
                super(1);
                this.f122345g = c53041zr0;
                this.f122346h = complaintResolution;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends List<C3023H6>> invoke(ComplaintResolutionForm form) {
                Intrinsics.checkNotNullParameter(form, "form");
                C33629Iq0 c33629Iq0 = this.f122345g.f122324g;
                ComplaintResolution repoData = this.f122346h;
                Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
                return c33629Iq0.m101629m(form, repoData);
            }
        }

        public C31539c() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(ComplaintResolution repoData) {
            Intrinsics.checkNotNullParameter(repoData, "repoData");
            AbstractC23442F<ComplaintResolutionForm> mo8086o1 = C53041zr0.this.f122323f.mo8086o1();
            final C31540a c31540a = new C31540a(C53041zr0.this, repoData);
            return mo8086o1.m33165A(new InterfaceC23492o() { // from class: Cr0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C53041zr0.C31539c.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$d */
    /* loaded from: classes3.dex */
    public static final class C31541d extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C31541d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C53041zr0 c53041zr0 = C53041zr0.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c53041zr0.m42280h(new C33059Ge6(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/constant/ComplaintResolutionField;", "field", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "Lco/bird/android/model/persistence/ComplaintResolution;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/constant/ComplaintResolutionField;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$e */
    /* loaded from: classes3.dex */
    public static final class C31542e extends Lambda implements Function1<ComplaintResolutionField, InterfaceC23447K<? extends Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolutionForm;", "form", "Lco/bird/android/model/persistence/ComplaintResolution;", "repoData", "Lkotlin/Pair;", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolutionForm;Lco/bird/android/model/persistence/ComplaintResolution;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$e$a */
        /* loaded from: classes3.dex */
        public static final class C31543a extends Lambda implements Function2<ComplaintResolutionForm, ComplaintResolution, Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>> {

            /* renamed from: g */
            public static final C31543a f122349g = new C31543a();

            public C31543a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Pair<ComplaintResolutionForm, ComplaintResolution> invoke(ComplaintResolutionForm form, ComplaintResolution repoData) {
                Intrinsics.checkNotNullParameter(form, "form");
                Intrinsics.checkNotNullParameter(repoData, "repoData");
                return TuplesKt.m28425to(form, repoData);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zr0$e$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C31544b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ComplaintResolutionField.values().length];
                try {
                    iArr[ComplaintResolutionField.BEFORE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ComplaintResolutionField.AFTER_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C31542e() {
            super(1);
        }

        /* renamed from: e */
        public static final void m281e(C53041zr0 this$0, ComplaintResolutionField field) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(field, "$field");
            this$0.m370E0(field, false);
        }

        /* renamed from: f */
        public static final InterfaceC23447K m280f(C53041zr0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            AbstractC23442F<ComplaintResolutionForm> mo8086o1 = this$0.f122323f.mo8086o1();
            AbstractC23442F<ComplaintResolution> m32043e0 = this$0.f122323f.mo8151E(this$0.f122322e).m32043e0();
            final C31543a c31543a = C31543a.f122349g;
            return AbstractC23442F.m33109r0(mo8086o1, m32043e0, new InterfaceC23480c() { // from class: Fr0
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    Pair m279g;
                    m279g = C53041zr0.C31542e.m279g(Function2.this, obj, obj2);
                    return m279g;
                }
            });
        }

        /* renamed from: g */
        public static final Pair m279g(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends Pair<ComplaintResolutionForm, ComplaintResolution>> invoke(final ComplaintResolutionField field) {
            AbstractC23461c mo8129U0;
            Intrinsics.checkNotNullParameter(field, "field");
            int i = C31544b.$EnumSwitchMapping$0[field.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    mo8129U0 = AbstractC23461c.m33039p();
                } else {
                    mo8129U0 = C53041zr0.this.f122323f.mo8138P0(C53041zr0.this.f122322e, null);
                }
            } else {
                mo8129U0 = C53041zr0.this.f122323f.mo8129U0(C53041zr0.this.f122322e, null);
            }
            final C53041zr0 c53041zr0 = C53041zr0.this;
            AbstractC23461c m33029z = mo8129U0.m33029z(new InterfaceC23478a() { // from class: Dr0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53041zr0.C31542e.m281e(C53041zr0.this, field);
                }
            });
            final C53041zr0 c53041zr02 = C53041zr0.this;
            return m33029z.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Er0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m280f;
                    m280f = C53041zr0.C31542e.m280f(C53041zr0.this);
                    return m280f;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "Lco/bird/android/model/persistence/ComplaintResolution;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$f */
    /* loaded from: classes3.dex */
    public static final class C31545f extends Lambda implements Function1<Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C31545f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<ComplaintResolutionForm, ComplaintResolution> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ComplaintResolutionForm form = pair.component1();
            ComplaintResolution repoData = pair.component2();
            C33629Iq0 c33629Iq0 = C53041zr0.this.f122324g;
            Intrinsics.checkNotNullExpressionValue(form, "form");
            Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
            return c33629Iq0.m101629m(form, repoData);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$g */
    /* loaded from: classes3.dex */
    public static final class C31546g extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C31546g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C53041zr0 c53041zr0 = C53041zr0.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c53041zr0.m42280h(new C33059Ge6(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/ComplaintResolutionField;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/ComplaintResolutionField;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$h */
    /* loaded from: classes3.dex */
    public static final class C31547h extends Lambda implements Function1<ComplaintResolutionField, Unit> {
        public C31547h() {
            super(1);
        }

        /* renamed from: a */
        public final void m276a(ComplaintResolutionField complaintResolutionField) {
            int i;
            InterfaceC40099e13 interfaceC40099e13 = C53041zr0.this.f122325h;
            Folder folder = Folder.COMPLAINT_PHOTOS;
            if (complaintResolutionField == ComplaintResolutionField.BEFORE_PHOTO) {
                i = 10075;
            } else {
                i = 10076;
            }
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(interfaceC40099e13, null, null, folder, Integer.valueOf(i), null, true, 19, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ComplaintResolutionField complaintResolutionField) {
            m276a(complaintResolutionField);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\t\u001a\u008a\u0001\u0012>\b\u0001\u0012:\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \b*\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00050\u0005 \b*D\u0012>\b\u0001\u0012:\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \b*\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$i */
    /* loaded from: classes3.dex */
    public static final class C31548i extends Lambda implements Function1<Pair<? extends ComplaintIssueOption, ? extends Boolean>, InterfaceC24574u<? extends Triple<? extends ComplaintIssueOption, ? extends Boolean, ? extends List<? extends String>>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution;", "repoData", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolution;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$i$a */
        /* loaded from: classes3.dex */
        public static final class C31549a extends Lambda implements Function1<ComplaintResolution, List<? extends String>> {

            /* renamed from: g */
            public static final C31549a f122354g = new C31549a();

            public C31549a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<String> invoke(ComplaintResolution repoData) {
                List<String> emptyList;
                Intrinsics.checkNotNullParameter(repoData, "repoData");
                List<String> issues = repoData.getIssues();
                if (issues == null) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    return emptyList;
                }
                return issues;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a:\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "", "issues", "Lkotlin/Triple;", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$i$b */
        /* loaded from: classes3.dex */
        public static final class C31550b extends Lambda implements Function1<List<? extends String>, Triple<? extends ComplaintIssueOption, ? extends Boolean, ? extends List<? extends String>>> {

            /* renamed from: g */
            public final /* synthetic */ ComplaintIssueOption f122355g;

            /* renamed from: h */
            public final /* synthetic */ boolean f122356h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31550b(ComplaintIssueOption complaintIssueOption, boolean z) {
                super(1);
                this.f122355g = complaintIssueOption;
                this.f122356h = z;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<ComplaintIssueOption, Boolean, List<String>> invoke(List<String> issues) {
                Intrinsics.checkNotNullParameter(issues, "issues");
                return new Triple<>(this.f122355g, Boolean.valueOf(this.f122356h), issues);
            }
        }

        public C31548i() {
            super(1);
        }

        /* renamed from: d */
        public static final List m272d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final Triple m271e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Triple<ComplaintIssueOption, Boolean, List<String>>> invoke(Pair<ComplaintIssueOption, Boolean> pair) {
            List emptyList;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            boolean booleanValue = pair.component2().booleanValue();
            AbstractC24507p<ComplaintResolution> mo8151E = C53041zr0.this.f122323f.mo8151E(C53041zr0.this.f122322e);
            final C31549a c31549a = C31549a.f122354g;
            AbstractC24507p<R> m32067H = mo8151E.m32067H(new InterfaceC23492o() { // from class: Gr0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m272d;
                    m272d = C53041zr0.C31548i.m272d(Function1.this, obj);
                    return m272d;
                }
            });
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            AbstractC24507p m32035j = m32067H.m32035j(emptyList);
            final C31550b c31550b = new C31550b(pair.component1(), booleanValue);
            return m32035j.m32067H(new InterfaceC23492o() { // from class: Hr0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m271e;
                    m271e = C53041zr0.C31548i.m271e(Function1.this, obj);
                    return m271e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr0$k */
    /* loaded from: classes3.dex */
    public static final class C31553k extends Lambda implements Function1<String, Unit> {
        public C31553k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C53041zr0.this.m370E0(ComplaintResolutionField.ACTION_TAKEN, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "action", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$l */
    /* loaded from: classes3.dex */
    public static final class C31554l extends Lambda implements Function1<String, InterfaceC23496h> {
        public C31554l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return C53041zr0.this.f122323f.mo8087o(C53041zr0.this.f122322e, action);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr0$m */
    /* loaded from: classes3.dex */
    public static final class C31555m extends Lambda implements Function1<String, Unit> {
        public C31555m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C53041zr0.this.m370E0(ComplaintResolutionField.ADDITIONAL_NOTES, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "notes", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$n */
    /* loaded from: classes3.dex */
    public static final class C31556n extends Lambda implements Function1<String, InterfaceC23496h> {
        public C31556n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String notes) {
            Intrinsics.checkNotNullParameter(notes, "notes");
            return C53041zr0.this.f122323f.mo8108e0(C53041zr0.this.f122322e, notes);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr0$o */
    /* loaded from: classes3.dex */
    public static final class C31557o extends Lambda implements Function1<Unit, Unit> {
        public C31557o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C53041zr0.this.m42280h(new C44935mA5(true));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003 \u0005*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/ComplaintResolution;", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$p */
    /* loaded from: classes3.dex */
    public static final class C31558p extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zr0$p$a */
        /* loaded from: classes3.dex */
        public static final class C31559a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C53041zr0 f122365g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31559a(C53041zr0 c53041zr0) {
                super(1);
                this.f122365g = c53041zr0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f122365g.m42280h(C43161jB1.f92265a);
                this.f122365g.m42280h(new C44935mA5(false));
            }
        }

        public C31558p() {
            super(1);
        }

        /* renamed from: d */
        public static final void m259d(C53041zr0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m42280h(new C44935mA5(false));
        }

        /* renamed from: e */
        public static final void m258e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final InterfaceC23447K m257f(C53041zr0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C24530g c24530g = C24530g.f91174a;
            AbstractC23442F<ComplaintResolutionForm> mo8086o1 = this$0.f122323f.mo8086o1();
            AbstractC23442F<ComplaintResolution> m32043e0 = this$0.f122323f.mo8151E(this$0.f122322e).m32043e0();
            Intrinsics.checkNotNullExpressionValue(m32043e0, "operatorManager.resoluti…(complaintIds).toSingle()");
            return c24530g.m31946a(mo8086o1, m32043e0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<ComplaintResolutionForm, ComplaintResolution>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo8154A0 = C53041zr0.this.f122323f.mo8154A0(C53041zr0.this.f122322e);
            final C53041zr0 c53041zr0 = C53041zr0.this;
            AbstractC23461c m33065U = mo8154A0.m33029z(new InterfaceC23478a() { // from class: Kr0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53041zr0.C31558p.m259d(C53041zr0.this);
                }
            }).m33065U(1L);
            final C31559a c31559a = new C31559a(C53041zr0.this);
            AbstractC23461c m33084B = m33065U.m33084B(new InterfaceC23484g() { // from class: Lr0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C53041zr0.C31558p.m258e(Function1.this, obj);
                }
            });
            final C53041zr0 c53041zr02 = C53041zr0.this;
            return m33084B.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Mr0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m257f;
                    m257f = C53041zr0.C31558p.m257f(C53041zr0.this);
                    return m257f;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/ComplaintResolution;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$q */
    /* loaded from: classes3.dex */
    public static final class C31560q extends Lambda implements Function1<Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C31560q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<ComplaintResolutionForm, ComplaintResolution> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ComplaintResolutionForm form = pair.component1();
            ComplaintResolution repoData = pair.component2();
            AbstractC23461c mo8077s1 = C53041zr0.this.f122323f.mo8077s1(C53041zr0.this.f122322e);
            C33629Iq0 c33629Iq0 = C53041zr0.this.f122324g;
            Intrinsics.checkNotNullExpressionValue(form, "form");
            Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
            return mo8077s1.m33042m(c33629Iq0.m101632j(form, repoData));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$r */
    /* loaded from: classes3.dex */
    public static final class C31561r extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C31561r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (!it.isEmpty()) {
                C53041zr0.this.m42280h(new C33059Ge6(it));
                C53041zr0.this.m42280h(new C40191eA5(true));
                return;
            }
            C53041zr0.this.m42280h(C50270vA5.f113644a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$27\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1747#2,3:382\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$27\n*L\n256#1:382,3\n*E\n"})
    /* renamed from: zr0$s */
    /* loaded from: classes3.dex */
    public static final class C31562s extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zr0$s$a */
        /* loaded from: classes3.dex */
        public static final class C31563a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C53041zr0 f122369g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31563a(C53041zr0 c53041zr0) {
                super(1);
                this.f122369g = c53041zr0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f122369g.m42280h(C43161jB1.f92265a);
                this.f122369g.m42280h(new C44935mA5(false));
            }
        }

        public C31562s() {
            super(1);
        }

        /* renamed from: d */
        public static final void m252d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m251e(C53041zr0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m42280h(C50270vA5.f113644a);
            this$0.m42280h(new C44935mA5(false));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(Unit it) {
            AbstractC23461c m33039p;
            Intrinsics.checkNotNullParameter(it, "it");
            Collection values = C53041zr0.this.f122327j.values();
            boolean z = false;
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it2 = values.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((Boolean) it2.next()).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                C53041zr0.this.m42280h(new C44935mA5(true));
                AbstractC23461c m33065U = C53041zr0.this.f122323f.mo8154A0(C53041zr0.this.f122322e).m33065U(1L);
                final C31563a c31563a = new C31563a(C53041zr0.this);
                m33039p = m33065U.m33084B(new InterfaceC23484g() { // from class: Nr0
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C53041zr0.C31562s.m252d(Function1.this, obj);
                    }
                });
            } else {
                m33039p = AbstractC23461c.m33039p();
            }
            final C53041zr0 c53041zr0 = C53041zr0.this;
            return m33039p.m33029z(new InterfaceC23478a() { // from class: Or0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53041zr0.C31562s.m251e(C53041zr0.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr0$t */
    /* loaded from: classes3.dex */
    public static final class C31564t extends Lambda implements Function1<Unit, Unit> {
        public C31564t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C53041zr0.this.f122325h.mo37161H0(10077);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000 \u0003*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/ComplaintResolution;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$29\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n766#2:382\n857#2,2:383\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$29\n*L\n290#1:382\n290#1:383,2\n*E\n"})
    /* renamed from: zr0$u */
    /* loaded from: classes3.dex */
    public static final class C31565u extends Lambda implements Function1<Pair<? extends String, ? extends ComplaintResolution>, InterfaceC23447K<? extends Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>>> {
        public C31565u() {
            super(1);
        }

        /* renamed from: d */
        public static final void m247d(C53041zr0 this$0, List vehicleInvolvedIds) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(vehicleInvolvedIds, "$vehicleInvolvedIds");
            this$0.m370E0(ComplaintResolutionField.VEHICLES_INVOLVED, !vehicleInvolvedIds.isEmpty());
        }

        /* renamed from: e */
        public static final InterfaceC23447K m246e(C53041zr0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C24530g c24530g = C24530g.f91174a;
            AbstractC23442F<ComplaintResolutionForm> mo8086o1 = this$0.f122323f.mo8086o1();
            AbstractC23442F<ComplaintResolution> m32043e0 = this$0.f122323f.mo8151E(this$0.f122322e).m32043e0();
            Intrinsics.checkNotNullExpressionValue(m32043e0, "operatorManager.resoluti…(complaintIds).toSingle()");
            return c24530g.m31946a(mo8086o1, m32043e0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<ComplaintResolutionForm, ComplaintResolution>> invoke(Pair<String, ComplaintResolution> pair) {
            final List emptyList;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            List<String> vehicleIdsInvolved = pair.component2().getVehicleIdsInvolved();
            if (vehicleIdsInvolved != null) {
                emptyList = new ArrayList();
                for (Object obj : vehicleIdsInvolved) {
                    if (!Intrinsics.areEqual((String) obj, component1)) {
                        emptyList.add(obj);
                    }
                }
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            AbstractC23461c mo8068y = C53041zr0.this.f122323f.mo8068y(C53041zr0.this.f122322e, emptyList);
            final C53041zr0 c53041zr0 = C53041zr0.this;
            AbstractC23461c m33029z = mo8068y.m33029z(new InterfaceC23478a() { // from class: Pr0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53041zr0.C31565u.m247d(C53041zr0.this, emptyList);
                }
            });
            final C53041zr0 c53041zr02 = C53041zr0.this;
            return m33029z.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Qr0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m246e;
                    m246e = C53041zr0.C31565u.m246e(C53041zr0.this);
                    return m246e;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zr0$v */
    /* loaded from: classes3.dex */
    public static final class C31566v extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C31566v f122372g = new C31566v();

        public C31566v() {
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

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/ComplaintResolution;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$w */
    /* loaded from: classes3.dex */
    public static final class C31567w extends Lambda implements Function1<Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C31567w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<ComplaintResolutionForm, ComplaintResolution> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            ComplaintResolutionForm form = pair.component1();
            ComplaintResolution repoData = pair.component2();
            if (repoData.getSubmitted()) {
                C33629Iq0 c33629Iq0 = C53041zr0.this.f122324g;
                Intrinsics.checkNotNullExpressionValue(form, "form");
                Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
                return c33629Iq0.m101632j(form, repoData);
            }
            C33629Iq0 c33629Iq02 = C53041zr0.this.f122324g;
            Intrinsics.checkNotNullExpressionValue(form, "form");
            Intrinsics.checkNotNullExpressionValue(repoData, "repoData");
            return c33629Iq02.m101629m(form, repoData);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$x */
    /* loaded from: classes3.dex */
    public static final class C31568x extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C31568x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C53041zr0 c53041zr0 = C53041zr0.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c53041zr0.m42280h(new C33059Ge6(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "", "newScans", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/ComplaintResolution;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$y */
    /* loaded from: classes3.dex */
    public static final class C31569y extends Lambda implements Function1<List<? extends String>, InterfaceC24574u<? extends Pair<? extends List<? extends String>, ? extends ComplaintResolution>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution;", "repoData", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolution;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zr0$y$a */
        /* loaded from: classes3.dex */
        public static final class C31570a extends Lambda implements Function1<ComplaintResolution, Pair<? extends List<? extends String>, ? extends ComplaintResolution>> {

            /* renamed from: g */
            public final /* synthetic */ List<String> f122376g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31570a(List<String> list) {
                super(1);
                this.f122376g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<String>, ComplaintResolution> invoke(ComplaintResolution repoData) {
                Intrinsics.checkNotNullParameter(repoData, "repoData");
                return TuplesKt.m28425to(this.f122376g, repoData);
            }
        }

        public C31569y() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<List<String>, ComplaintResolution>> invoke(List<String> newScans) {
            Intrinsics.checkNotNullParameter(newScans, "newScans");
            AbstractC24507p<ComplaintResolution> mo8151E = C53041zr0.this.f122323f.mo8151E(C53041zr0.this.f122322e);
            final C31570a c31570a = new C31570a(newScans);
            return mo8151E.m32067H(new InterfaceC23492o() { // from class: Rr0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C53041zr0.C31569y.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000 \u0007*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/persistence/ComplaintResolution;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$33\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n766#2:382\n857#2,2:383\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionPresenter.kt\nco/bird/android/feature/complaintresolution/ComplaintResolutionPresenter$consume$33\n*L\n325#1:382\n325#1:383,2\n*E\n"})
    /* renamed from: zr0$z */
    /* loaded from: classes3.dex */
    public static final class C31571z extends Lambda implements Function1<Pair<? extends List<? extends String>, ? extends ComplaintResolution>, InterfaceC23447K<? extends Pair<? extends ComplaintResolutionForm, ? extends ComplaintResolution>>> {
        public C31571z() {
            super(1);
        }

        /* renamed from: d */
        public static final void m238d(C53041zr0 this$0, List vehicleInvolvedIds) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(vehicleInvolvedIds, "$vehicleInvolvedIds");
            this$0.m370E0(ComplaintResolutionField.VEHICLES_INVOLVED, !vehicleInvolvedIds.isEmpty());
        }

        /* renamed from: e */
        public static final InterfaceC23447K m237e(C53041zr0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C24530g c24530g = C24530g.f91174a;
            AbstractC23442F<ComplaintResolutionForm> mo8086o1 = this$0.f122323f.mo8086o1();
            AbstractC23442F<ComplaintResolution> m32043e0 = this$0.f122323f.mo8151E(this$0.f122322e).m32043e0();
            Intrinsics.checkNotNullExpressionValue(m32043e0, "operatorManager.resoluti…(complaintIds).toSingle()");
            return c24530g.m31946a(mo8086o1, m32043e0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<ComplaintResolutionForm, ComplaintResolution>> invoke(Pair<? extends List<String>, ComplaintResolution> pair) {
            final List<String> plus;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<String> newScans = pair.component1();
            List<String> vehicleIdsInvolved = pair.component2().getVehicleIdsInvolved();
            if (vehicleIdsInvolved == null) {
                vehicleIdsInvolved = CollectionsKt__CollectionsKt.emptyList();
            }
            List<String> list = vehicleIdsInvolved;
            Intrinsics.checkNotNullExpressionValue(newScans, "newScans");
            ArrayList arrayList = new ArrayList();
            for (Object obj : newScans) {
                if (!vehicleIdsInvolved.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList);
            AbstractC23461c mo8068y = C53041zr0.this.f122323f.mo8068y(C53041zr0.this.f122322e, plus);
            final C53041zr0 c53041zr0 = C53041zr0.this;
            AbstractC23461c m33029z = mo8068y.m33029z(new InterfaceC23478a() { // from class: Sr0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53041zr0.C31571z.m238d(C53041zr0.this, plus);
                }
            });
            final C53041zr0 c53041zr02 = C53041zr0.this;
            return m33029z.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: Tr0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m237e;
                    m237e = C53041zr0.C31571z.m237e(C53041zr0.this);
                    return m237e;
                }
            }));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53041zr0(List<String> complaintIds, InterfaceC46473om3 operatorManager, C33629Iq0 converter, InterfaceC40099e13 navigator) {
        super(C41887h22.f84638a);
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f122322e = complaintIds;
        this.f122323f = operatorManager;
        this.f122324g = converter;
        this.f122325h = navigator;
        this.f122326i = new LinkedHashMap();
        this.f122327j = new LinkedHashMap();
    }

    /* renamed from: A0 */
    public static final InterfaceC23447K m378A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final InterfaceC23447K m376B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m374C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final InterfaceC23447K m372D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23447K m350W(C53041zr0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f122323f.mo8086o1();
    }

    /* renamed from: X */
    public static final InterfaceC23447K m349X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m348Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m347Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m346a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m345b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m344c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC24574u m343d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23496h m342e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m341f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m340g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23496h m339g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final InterfaceC23447K m338h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m337i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23496h m336j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m335k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final InterfaceC23447K m334l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final InterfaceC23447K m332m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m330n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final InterfaceC23496h m328o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m326p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final InterfaceC23447K m324q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final InterfaceC23447K m322r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m320s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m318t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final InterfaceC24574u m316u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final InterfaceC23447K m314v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final InterfaceC23447K m312w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m310x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y0 */
    public static final void m308y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m306z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public final void m370E0(ComplaintResolutionField complaintResolutionField, boolean z) {
        if (this.f122326i.containsKey(complaintResolutionField)) {
            this.f122326i.put(complaintResolutionField, Boolean.valueOf(z));
            Collection<Boolean> values = this.f122326i.values();
            boolean z2 = true;
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!((Boolean) it.next()).booleanValue()) {
                        z2 = false;
                        break;
                    }
                }
            }
            m42280h(new C38042ab1(z2));
            return;
        }
        this.f122327j.put(complaintResolutionField, Boolean.valueOf(z));
    }

    /* renamed from: F0 */
    public final boolean m368F0(ComplaintResolutionField complaintResolutionField, ComplaintResolution complaintResolution) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        switch (C31536a.$EnumSwitchMapping$0[complaintResolutionField.ordinal()]) {
            case 1:
                List<String> issues = complaintResolution.getIssues();
                if (issues != null && !issues.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return false;
                }
                break;
            case 2:
                String beforePhotoUrl = complaintResolution.getBeforePhotoUrl();
                if (beforePhotoUrl != null && beforePhotoUrl.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return false;
                }
                break;
            case 3:
                String afterPhotoUrl = complaintResolution.getAfterPhotoUrl();
                if (afterPhotoUrl != null && afterPhotoUrl.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    return false;
                }
                break;
            case 4:
                String additionalNotes = complaintResolution.getAdditionalNotes();
                if (additionalNotes != null && additionalNotes.length() != 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    return false;
                }
                break;
            case 5:
                List<String> vehicleIdsInvolved = complaintResolution.getVehicleIdsInvolved();
                if (vehicleIdsInvolved != null && !vehicleIdsInvolved.isEmpty()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    return false;
                }
                break;
            case 6:
                String actionTaken = complaintResolution.getActionTaken();
                if (actionTaken != null && actionTaken.length() != 0) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z6) {
                    return false;
                }
                break;
            case 7:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    /* renamed from: G0 */
    public final void m366G0(List<ComplaintActionTakenRequiredField> list, ComplaintResolution complaintResolution) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List<ComplaintActionTakenRequiredField> list2 = list;
        ArrayList<ComplaintActionTakenRequiredField> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((ComplaintActionTakenRequiredField) obj).getRequired()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList<ComplaintResolutionField> arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (ComplaintActionTakenRequiredField complaintActionTakenRequiredField : arrayList) {
            arrayList2.add(complaintActionTakenRequiredField.getField());
        }
        for (ComplaintResolutionField complaintResolutionField : arrayList2) {
            this.f122326i.put(complaintResolutionField, Boolean.valueOf(m368F0(complaintResolutionField, complaintResolution)));
        }
        ArrayList<ComplaintActionTakenRequiredField> arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((ComplaintActionTakenRequiredField) obj2).getRequired()) {
                arrayList3.add(obj2);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList<ComplaintResolutionField> arrayList4 = new ArrayList(collectionSizeOrDefault2);
        for (ComplaintActionTakenRequiredField complaintActionTakenRequiredField2 : arrayList3) {
            arrayList4.add(complaintActionTakenRequiredField2.getField());
        }
        for (ComplaintResolutionField complaintResolutionField2 : arrayList4) {
            this.f122327j.put(complaintResolutionField2, Boolean.valueOf(m368F0(complaintResolutionField2, complaintResolution)));
        }
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: V */
    public void consume(InterfaceC37148Xr0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        AbstractC23461c m33069Q = this.f122323f.mo8155A().m33069Q();
        AbstractC23442F m33124k = AbstractC23442F.m33124k(new Callable() { // from class: Qq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m350W;
                m350W = C53041zr0.m350W(C53041zr0.this);
                return m350W;
            }
        });
        final C31566v c31566v = C31566v.f122372g;
        AbstractC23442F m33042m = m33069Q.m33042m(m33124k.m33106t(new InterfaceC23484g() { // from class: Sq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m340g(Function1.this, obj);
            }
        }));
        final C31526C c31526c = new C31526C();
        AbstractC23442F m33165A = m33042m.m33165A(new InterfaceC23492o() { // from class: er0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m338h0;
                m338h0 = C53041zr0.m338h0(Function1.this, obj);
                return m338h0;
            }
        });
        final C31527D c31527d = new C31527D();
        AbstractC23442F m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: kr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m320s0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33135e = m33101w.m33135e(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31528E c31528e = C31528E.f122332g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: lr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m308y0(Function1.this, obj);
            }
        };
        final C31529F c31529f = C31529F.f122333b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: nr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m306z0(Function1.this, obj);
            }
        });
        Observable<EnumC41608ga2> mo58439u8 = renderer.mo58439u8();
        final C31530G c31530g = new C31530G();
        Observable<R> flatMapSingle = mo58439u8.flatMapSingle(new InterfaceC23492o() { // from class: or0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m378A0;
                m378A0 = C53041zr0.m378A0(Function1.this, obj);
                return m378A0;
            }
        });
        final C31532H c31532h = new C31532H();
        Observable flatMapSingle2 = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: pr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m376B0;
                m376B0 = C53041zr0.m376B0(Function1.this, obj);
                return m376B0;
            }
        });
        final C31535I c31535i = new C31535I();
        Observable doOnNext = flatMapSingle2.doOnNext(new InterfaceC23484g() { // from class: qr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m374C0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        Observable<Pair<ComplaintResolutionField, FileUploadReceipt>> mo58437x3 = renderer.mo58437x3();
        final C31537b c31537b = new C31537b();
        Observable<R> flatMapSingle3 = mo58437x3.flatMapSingle(new InterfaceC23492o() { // from class: rr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m372D0;
                m372D0 = C53041zr0.m372D0(Function1.this, obj);
                return m372D0;
            }
        });
        final C31539c c31539c = new C31539c();
        Observable flatMapSingle4 = flatMapSingle3.flatMapSingle(new InterfaceC23492o() { // from class: br0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m349X;
                m349X = C53041zr0.m349X(Function1.this, obj);
                return m349X;
            }
        });
        final C31541d c31541d = new C31541d();
        Observable doOnNext2 = flatMapSingle4.doOnNext(new InterfaceC23484g() { // from class: mr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m348Y(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33094as2 = doOnNext2.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable<ComplaintResolutionField> mo58435z6 = renderer.mo58435z6();
        final C31542e c31542e = new C31542e();
        Observable<R> flatMapSingle5 = mo58435z6.flatMapSingle(new InterfaceC23492o() { // from class: sr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m347Z;
                m347Z = C53041zr0.m347Z(Function1.this, obj);
                return m347Z;
            }
        });
        final C31545f c31545f = new C31545f();
        Observable flatMapSingle6 = flatMapSingle5.flatMapSingle(new InterfaceC23492o() { // from class: tr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m346a0;
                m346a0 = C53041zr0.m346a0(Function1.this, obj);
                return m346a0;
            }
        });
        final C31546g c31546g = new C31546g();
        Observable doOnNext3 = flatMapSingle6.doOnNext(new InterfaceC23484g() { // from class: ur0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m345b0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext3, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33094as3 = doOnNext3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
        Object m33094as4 = renderer.mo58445Y8().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31547h c31547h = new C31547h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: vr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m344c0(Function1.this, obj);
            }
        });
        Observable<Pair<ComplaintIssueOption, Boolean>> mo58436y0 = renderer.mo58436y0();
        final C31548i c31548i = new C31548i();
        Observable<R> flatMapMaybe = mo58436y0.flatMapMaybe(new InterfaceC23492o() { // from class: wr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m343d0;
                m343d0 = C53041zr0.m343d0(Function1.this, obj);
                return m343d0;
            }
        });
        final C31551j c31551j = new C31551j();
        AbstractC23461c flatMapCompletable = flatMapMaybe.flatMapCompletable(new InterfaceC23492o() { // from class: xr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m342e0;
                m342e0 = C53041zr0.m342e0(Function1.this, obj);
                return m342e0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<String> mo58438v4 = renderer.mo58438v4();
        final C31553k c31553k = new C31553k();
        Observable<String> doOnNext4 = mo58438v4.doOnNext(new InterfaceC23484g() { // from class: yr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m341f0(Function1.this, obj);
            }
        });
        final C31554l c31554l = new C31554l();
        AbstractC23461c flatMapCompletable2 = doOnNext4.flatMapCompletable(new InterfaceC23492o() { // from class: Rq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m339g0;
                m339g0 = C53041zr0.m339g0(Function1.this, obj);
                return m339g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable2, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33041n2 = flatMapCompletable2.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<String> throttleLast = renderer.mo58447X2().throttleLast(500L, TimeUnit.MILLISECONDS);
        final C31555m c31555m = new C31555m();
        Observable<String> doOnNext5 = throttleLast.doOnNext(new InterfaceC23484g() { // from class: Tq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m337i0(Function1.this, obj);
            }
        });
        final C31556n c31556n = new C31556n();
        AbstractC23461c flatMapCompletable3 = doOnNext5.flatMapCompletable(new InterfaceC23492o() { // from class: Uq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m336j0;
                m336j0 = C53041zr0.m336j0(Function1.this, obj);
                return m336j0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable3, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33041n3 = flatMapCompletable3.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
        Observable<Unit> mo58442h9 = renderer.mo58442h9();
        final C31557o c31557o = new C31557o();
        Observable<Unit> doOnNext6 = mo58442h9.doOnNext(new InterfaceC23484g() { // from class: Vq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m335k0(Function1.this, obj);
            }
        });
        final C31558p c31558p = new C31558p();
        Observable<R> flatMapSingle7 = doOnNext6.flatMapSingle(new InterfaceC23492o() { // from class: Wq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m334l0;
                m334l0 = C53041zr0.m334l0(Function1.this, obj);
                return m334l0;
            }
        });
        final C31560q c31560q = new C31560q();
        Observable flatMapSingle8 = flatMapSingle7.flatMapSingle(new InterfaceC23492o() { // from class: Xq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m332m0;
                m332m0 = C53041zr0.m332m0(Function1.this, obj);
                return m332m0;
            }
        });
        final C31561r c31561r = new C31561r();
        Observable retry = flatMapSingle8.doOnNext(new InterfaceC23484g() { // from class: Yq0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m330n0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33094as5 = retry.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as5).subscribe();
        Observable<Unit> mo58440m9 = renderer.mo58440m9();
        final C31562s c31562s = new C31562s();
        AbstractC23461c m33066T = mo58440m9.flatMapCompletable(new InterfaceC23492o() { // from class: Zq0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m328o0;
                m328o0 = C53041zr0.m328o0(Function1.this, obj);
                return m328o0;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33041n4 = m33066T.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n4).subscribe();
        Object m33094as6 = renderer.mo58443b9().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31564t c31564t = new C31564t();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: ar0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m326p0(Function1.this, obj);
            }
        });
        Observable<String> mo58441j4 = renderer.mo58441j4();
        Observable<ComplaintResolution> m32045d0 = this.f122323f.mo8151E(this.f122322e).m32045d0();
        Intrinsics.checkNotNullExpressionValue(m32045d0, "operatorManager.resoluti…plaintIds).toObservable()");
        Observable m31950a = C24527f.m31950a(mo58441j4, m32045d0);
        final C31565u c31565u = new C31565u();
        Observable flatMapSingle9 = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: cr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m324q0;
                m324q0 = C53041zr0.m324q0(Function1.this, obj);
                return m324q0;
            }
        });
        final C31567w c31567w = new C31567w();
        Observable flatMapSingle10 = flatMapSingle9.flatMapSingle(new InterfaceC23492o() { // from class: dr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m322r0;
                m322r0 = C53041zr0.m322r0(Function1.this, obj);
                return m322r0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle10, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33094as7 = flatMapSingle10.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31568x c31568x = new C31568x();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: fr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m318t0(Function1.this, obj);
            }
        });
        Observable<List<String>> mo58444Z7 = renderer.mo58444Z7();
        final C31569y c31569y = new C31569y();
        Observable<R> flatMapMaybe2 = mo58444Z7.flatMapMaybe(new InterfaceC23492o() { // from class: gr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m316u0;
                m316u0 = C53041zr0.m316u0(Function1.this, obj);
                return m316u0;
            }
        });
        final C31571z c31571z = new C31571z();
        Observable flatMapSingle11 = flatMapMaybe2.flatMapSingle(new InterfaceC23492o() { // from class: hr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m314v0;
                m314v0 = C53041zr0.m314v0(Function1.this, obj);
                return m314v0;
            }
        });
        final C31524A c31524a = new C31524A();
        Observable flatMapSingle12 = flatMapSingle11.flatMapSingle(new InterfaceC23492o() { // from class: ir0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m312w0;
                m312w0 = C53041zr0.m312w0(Function1.this, obj);
                return m312w0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle12, "override fun consume(ren…mContent(it))\n      }\n  }");
        Object m33094as8 = flatMapSingle12.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31525B c31525b = new C31525B();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: jr0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53041zr0.m310x0(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zr0$j */
    /* loaded from: classes3.dex */
    public static final class C31551j extends Lambda implements Function1<Triple<? extends ComplaintIssueOption, ? extends Boolean, ? extends List<? extends String>>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zr0$j$a */
        /* loaded from: classes3.dex */
        public static final class C31552a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C31552a f122358g = new C31552a();

            public C31552a() {
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

        public C31551j() {
            super(1);
        }

        /* renamed from: c */
        public static final void m266c(C53041zr0 this$0, List updatedIssues) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(updatedIssues, "$updatedIssues");
            this$0.m370E0(ComplaintResolutionField.ISSUES, !updatedIssues.isEmpty());
        }

        /* renamed from: d */
        public static final void m265d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Triple<ComplaintIssueOption, Boolean, ? extends List<String>> triple) {
            final List<String> minus;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            ComplaintIssueOption component1 = triple.component1();
            boolean booleanValue = triple.component2().booleanValue();
            List<String> issues = triple.component3();
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            if (!booleanValue) {
                minus = CollectionsKt___CollectionsKt.minus(issues, component1.getValue());
            } else {
                minus = CollectionsKt___CollectionsKt.plus((Collection<? extends String>) ((Collection<? extends Object>) issues), component1.getValue());
            }
            AbstractC23461c mo8109e = C53041zr0.this.f122323f.mo8109e(C53041zr0.this.f122322e, minus);
            final C53041zr0 c53041zr0 = C53041zr0.this;
            AbstractC23461c m33029z = mo8109e.m33029z(new InterfaceC23478a() { // from class: Ir0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53041zr0.C31551j.m266c(C53041zr0.this, minus);
                }
            });
            final C31552a c31552a = C31552a.f122358g;
            return m33029z.m33084B(new InterfaceC23484g() { // from class: Jr0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C53041zr0.C31551j.m265d(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends ComplaintIssueOption, ? extends Boolean, ? extends List<? extends String>> triple) {
            return invoke2((Triple<ComplaintIssueOption, Boolean, ? extends List<String>>) triple);
        }
    }
}
