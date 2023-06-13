package p000;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.identification.IdentificationAcceptableManualEntry;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationIngestionResult;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001@B\u0019\b\u0007\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u00106\u001a\u000204¢\u0006\u0004\b=\u0010>J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0015J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0015J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015J$\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0(2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\u0010'\u001a\u0004\u0018\u00010\u001aJ \u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+0(2\u0006\u0010&\u001a\u00020*J)\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010/2\u0006\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00028\u0000¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006A"}, m28432d2 = {"LgW1;", "LxE;", "LH31;", "", "LH6;", "sections", "", "b", "", "enabled", "bm", "show", "nm", "em", "im", "pm", "", Entry.TYPE_TEXT, "cm", "mm", "om", "Lio/reactivex/Observable;", "b0", "am", "r0", "qm", "Ljava/util/Locale;", "Tl", "Lco/bird/android/model/identification/IdentificationDocumentType;", "Zl", "", "Yl", "Ul", "", "Wl", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "Vl", "Xl", "options", "selectedLocale", "Lio/reactivex/p;", "dm", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "Lkotlin/Pair;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "LgU1;", "jm", "T", "titleRes", "currentValue", "fm", "(ILjava/lang/Object;)Lio/reactivex/p;", "LR3;", "LR3;", "binding", "LKS1;", "c", "LKS1;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LR3;)V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationUi.kt\nco/bird/android/feature/identification/IdentificationUi\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,207:1\n11335#2:208\n11670#2,3:209\n*S KotlinDebug\n*F\n+ 1 IdentificationUi.kt\nco/bird/android/feature/identification/IdentificationUi\n*L\n198#1:208\n198#1:209,3\n*E\n"})
/* renamed from: gW1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41571gW1 extends AbstractC30071xE {

    /* renamed from: d */
    public static final C20916a f82370d = new C20916a(null);

    /* renamed from: b */
    public final C7059R3 f82371b;

    /* renamed from: c */
    public final KS1 f82372c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LgW1$a;", "", "", "CLICK_THROTTLE_MILLISECONDS", "J", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gW1$a */
    /* loaded from: classes3.dex */
    public static final class C20916a {
        public /* synthetic */ C20916a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20916a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LH31$b;", "response", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LH31$b;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gW1$b */
    /* loaded from: classes3.dex */
    public static final class C20917b extends Lambda implements Function1<H31.AbstractC3016b, InterfaceC24574u<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ T f82373g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20917b(T t) {
            super(1);
            this.f82373g = t;
        }

        /* renamed from: a */
        public final InterfaceC24574u<? extends T> m39204a(H31.AbstractC3016b response) {
            boolean z;
            Object valueOf;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response instanceof H31.AbstractC3016b.C3019c) {
                if (this.f82373g instanceof Integer) {
                    valueOf = Integer.valueOf(Integer.parseInt(((H31.AbstractC3016b.C3019c) response).m104470b()));
                } else {
                    valueOf = Double.valueOf(Double.parseDouble(((H31.AbstractC3016b.C3019c) response).m104470b()));
                }
                return AbstractC24507p.m32068G(valueOf);
            }
            if (response instanceof H31.AbstractC3016b.C3017a) {
                z = true;
            } else {
                z = response instanceof H31.AbstractC3016b.C3018b;
            }
            if (z) {
                return AbstractC24507p.m32024u();
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(H31.AbstractC3016b abstractC3016b) {
            return m39204a(abstractC3016b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gW1$c */
    /* loaded from: classes3.dex */
    public static final class C20918c extends Lambda implements Function1<String, T> {

        /* renamed from: g */
        public static final C20918c f82374g = new C20918c();

        static {
        }

        public C20918c() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, co.bird.android.model.identification.IdentificationIngestionResult] */
        /* renamed from: b */
        public final T m39203b(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return IdentificationIngestionResult.Companion.fromWire(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(String str) {
            return m39203b(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/identification/IdentificationManualEntryFormData;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gW1$d */
    /* loaded from: classes3.dex */
    public static final class C20919d extends Lambda implements Function1<Optional<IdentificationManualEntryFormData>, IdentificationManualEntryFormData> {

        /* renamed from: g */
        public static final C20919d f82375g = new C20919d();

        static {
        }

        public C20919d() {
            super(1);
        }

        /* renamed from: a */
        public final IdentificationManualEntryFormData m39202a(Optional<IdentificationManualEntryFormData> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59035e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IdentificationManualEntryFormData invoke(Optional<IdentificationManualEntryFormData> optional) {
            return m39202a(optional);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "it", "Lkotlin/Pair;", "LgU1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationManualEntryFormData;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gW1$e */
    /* loaded from: classes3.dex */
    public static final class C20920e extends Lambda implements Function1<IdentificationManualEntryFormData, Pair<? extends IdentificationManualEntryFormData, ? extends C41553gU1>> {

        /* renamed from: g */
        public final /* synthetic */ C41553gU1 f82376g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20920e(C41553gU1 c41553gU1) {
            super(1);
            this.f82376g = c41553gU1;
        }

        /* renamed from: a */
        public final Pair<IdentificationManualEntryFormData, C41553gU1> m39201a(IdentificationManualEntryFormData it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TuplesKt.m28425to(it, this.f82376g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends IdentificationManualEntryFormData, ? extends C41553gU1> invoke(IdentificationManualEntryFormData identificationManualEntryFormData) {
            return m39201a(identificationManualEntryFormData);
        }
    }

    static {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41571gW1(BaseActivity activity, C7059R3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f82371b = binding;
        KS1 ks1 = new KS1();
        this.f82372c = ks1;
        RecyclerView recyclerView = binding.f31435k;
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(ks1);
    }

    /* renamed from: gm */
    public static final InterfaceC24574u m39216gm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: hm */
    public static final Object m39215hm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: km */
    public static final Pair m39212km(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: lm */
    public static final void m39211lm(C41553gU1 bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "$bottomSheet");
        bottomSheet.dismiss();
    }

    /* renamed from: Tl */
    public final Observable<Locale> m39231Tl() {
        Observable<Locale> throttleFirst = this.f82372c.m98871v().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.countryClicks()\n…S, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Ul */
    public final Observable<Integer> m39230Ul() {
        Observable<Integer> throttleFirst = this.f82372c.m98869x().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.expirationClicks…S, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Vl */
    public final Observable<IdentificationIngestionResult> m39229Vl() {
        Observable<IdentificationIngestionResult> throttleFirst = this.f82372c.m98868y().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.ingestionResults…S, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Wl */
    public final Observable<Double> m39228Wl() {
        Observable<Double> throttleFirst = this.f82372c.m98874A().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.scoreClicks()\n  …S, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Xl */
    public final Observable<Integer> m39227Xl() {
        Observable<Integer> throttleFirst = this.f82372c.m98873B().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.secondsToResultC…S, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Yl */
    public final Observable<Integer> m39226Yl() {
        Observable<Integer> throttleFirst = this.f82372c.m98872C().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.userAgeClicks()\n…S, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Zl */
    public final Observable<IdentificationDocumentType> m39225Zl() {
        Observable<IdentificationDocumentType> throttleFirst = this.f82372c.m98870w().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.documentTypeClic…S, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: am */
    public final Observable<Unit> m39224am() {
        Button button = this.f82371b.f31431g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.manualEntryButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: b */
    public final void m39223b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f82372c.mo24871u(sections);
    }

    /* renamed from: b0 */
    public final Observable<Unit> m39222b0() {
        Button button = this.f82371b.f31433i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.primaryButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: bm */
    public final void m39221bm(boolean z) {
        this.f82371b.f31433i.setEnabled(z);
    }

    /* renamed from: cm */
    public final void m39220cm(String str) {
        boolean z;
        this.f82371b.f31440p.setText(str);
        TextView textView = this.f82371b.f31440p;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.statusText");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: dm */
    public final AbstractC24507p<Locale> m39219dm(List<Locale> options, Locale locale) {
        Intrinsics.checkNotNullParameter(options, "options");
        C51478xD0 m5662a = C51478xD0.f117213f.m5662a(options, locale);
        m5662a.show(getActivity().getSupportFragmentManager(), "CountryPickerBottomSheet");
        return m5662a.m5674D9();
    }

    /* renamed from: em */
    public final void m39218em(boolean z) {
        Button button = this.f82371b.f31429e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: fm */
    public final <T> AbstractC24507p<T> m39217fm(int i, T t) {
        boolean z;
        int i2;
        if (t instanceof Integer) {
            z = true;
        } else {
            z = t instanceof Double;
        }
        if (z) {
            String string = getActivity().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(titleRes)");
            String obj = t.toString();
            if (t instanceof Integer) {
                i2 = 4098;
            } else {
                i2 = 8194;
            }
            AbstractC23442F<H31.AbstractC3016b> dialogWithInput = dialogWithInput(string, null, "", obj, Integer.valueOf(i2), null, null, false, false, true);
            final C20917b c20917b = new C20917b(t);
            AbstractC24507p<T> abstractC24507p = (AbstractC24507p<T>) dialogWithInput.m33163C(new InterfaceC23492o() { // from class: cW1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    InterfaceC24574u m39216gm;
                    m39216gm = C41571gW1.m39216gm(Function1.this, obj2);
                    return m39216gm;
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC24507p, "currentValue: T): Maybe<…empty()\n        }\n      }");
            return abstractC24507p;
        } else if (t instanceof IdentificationIngestionResult) {
            IdentificationIngestionResult[] values = IdentificationIngestionResult.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (IdentificationIngestionResult identificationIngestionResult : values) {
                arrayList.add(identificationIngestionResult.toString());
            }
            AbstractC24507p selectorDialog$default = H31.C3014a.selectorDialog$default(this, arrayList, false, null, 6, null);
            final C20918c c20918c = C20918c.f82374g;
            AbstractC24507p<T> m32067H = selectorDialog$default.m32067H(new InterfaceC23492o() { // from class: dW1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    Object m39215hm;
                    m39215hm = C41571gW1.m39215hm(Function1.this, obj2);
                    return m39215hm;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32067H, "selectorDialog(Identific…omWire(it) as T\n        }");
            return m32067H;
        } else {
            AbstractC24507p<T> m32023v = AbstractC24507p.m32023v(new IllegalArgumentException("Can't show dialog for value " + t));
            Intrinsics.checkNotNullExpressionValue(m32023v, "error(IllegalArgumentExc…or value $currentValue\"))");
            return m32023v;
        }
    }

    /* renamed from: im */
    public final void m39214im(boolean z) {
        Button button = this.f82371b.f31431g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.manualEntryButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: jm */
    public final AbstractC24507p<Pair<IdentificationManualEntryFormData, C41553gU1>> m39213jm(IdentificationAcceptableManualEntry options) {
        Intrinsics.checkNotNullParameter(options, "options");
        final C41553gU1 m39289a = C41553gU1.f82284h.m39289a(options, false);
        m39289a.show(getActivity().getSupportFragmentManager(), "ManualEntryFormBottomSheet");
        AbstractC24507p firstElement = C37279Yf5.m74575T(m39289a.m39353Da(), C20919d.f82375g).firstElement();
        final C20920e c20920e = new C20920e(m39289a);
        AbstractC24507p<Pair<IdentificationManualEntryFormData, C41553gU1>> m32030o = firstElement.m32067H(new InterfaceC23492o() { // from class: eW1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m39212km;
                m39212km = C41571gW1.m39212km(Function1.this, obj);
                return m39212km;
            }
        }).m32030o(new InterfaceC23478a() { // from class: fW1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C41571gW1.m39211lm(C41553gU1.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32030o, "bottomSheet = Identifica…omSheet.dismiss()\n      }");
        return m32030o;
    }

    /* renamed from: mm */
    public final void m39210mm(boolean z) {
        CircularProgressIndicator circularProgressIndicator = this.f82371b.f31434j;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progressSpinner");
        C49520tu6.show$default(circularProgressIndicator, z, 0, 2, null);
        ImageView imageView = this.f82371b.f31436l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.rejectedIcon");
        C49520tu6.show$default(imageView, false, 0, 2, null);
        Group group = this.f82371b.f31438n;
        Intrinsics.checkNotNullExpressionValue(group, "binding.statusGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
        this.f82371b.f31430f.m53539y();
        this.f82371b.f31441q.setText(C45871nl4.identity_check_in_progress);
        this.f82371b.f31437m.setText(C45871nl4.identity_check_in_progress_body);
    }

    /* renamed from: nm */
    public final void m39209nm(boolean z) {
        Button button = this.f82371b.f31433i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.primaryButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: om */
    public final void m39208om(boolean z) {
        CircularProgressIndicator circularProgressIndicator = this.f82371b.f31434j;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progressSpinner");
        C49520tu6.show$default(circularProgressIndicator, false, 0, 2, null);
        ImageView imageView = this.f82371b.f31436l;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.rejectedIcon");
        C49520tu6.show$default(imageView, z, 0, 2, null);
        Group group = this.f82371b.f31438n;
        Intrinsics.checkNotNullExpressionValue(group, "binding.statusGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
        this.f82371b.f31430f.m53540x();
        this.f82371b.f31430f.setProgress(0.5f);
        this.f82371b.f31441q.setText(C45871nl4.identity_verification_error);
        this.f82371b.f31437m.setText(C45871nl4.identity_verification_error_body);
    }

    /* renamed from: pm */
    public final void m39207pm(boolean z) {
        Button button = this.f82371b.f31443s;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tryAgainButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: qm */
    public final Observable<Unit> m39206qm() {
        Button button = this.f82371b.f31443s;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tryAgainButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: r0 */
    public final Observable<Unit> m39205r0() {
        Button button = this.f82371b.f31429e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.helpButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
