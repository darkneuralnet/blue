package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.identification.IdentificationAcceptableManualEntry;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationGender;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import co.bird.android.model.identification.IdentificationManualEntryFormField;
import com.facebook.share.internal.C17296a;
import com.google.android.material.datepicker.C17780c;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24516r;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p000.C40009ds2;
import p000.C41553gU1;
import p000.C51478xD0;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 D2\u00020\u0001:\u0003E\"*B\u0007¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u0013J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R.\u00107\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 4*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00140\u0014038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u0010@¨\u0006F"}, m28432d2 = {"LgU1;", "Lac5;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "currentFormData", "", "nc", "formData", "Na", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Da", "Landroid/content/DialogInterface;", "dialog", "onCancel", "onDismiss", "", "titleText", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lio/reactivex/p;", "Lorg/joda/time/DateTime;", "oc", "Le13;", "b", "Le13;", "La", "()Le13;", "setNavigator", "(Le13;)V", "navigator", "LDT1;", "c", "LDT1;", "adapter", "LmU1;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "Ga", "()LmU1;", "converter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "formSubmissionClicks", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "f", "Ea", "()Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "acceptableManualEntry", "", "g", "Ja", "()Z", "hasMoreAcceptableMethods", "<init>", "()V", "h", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationManualEntryFormBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/IdentificationManualEntryFormBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,346:1\n64#2:347\n44#2:348\n44#2:350\n44#2:352\n44#2:354\n44#2:356\n44#2:358\n44#2:360\n180#3:349\n180#3:351\n180#3:353\n180#3:355\n180#3:357\n180#3:359\n180#3:361\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/IdentificationManualEntryFormBottomSheet\n*L\n103#1:347\n139#1:348\n165#1:350\n191#1:352\n219#1:354\n227#1:356\n236#1:358\n253#1:360\n139#1:349\n165#1:351\n191#1:353\n219#1:355\n227#1:357\n236#1:359\n253#1:361\n*E\n"})
/* renamed from: gU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41553gU1 extends AbstractC38056ac5 {

    /* renamed from: h */
    public static final C20882a f82284h = new C20882a(null);

    /* renamed from: b */
    public InterfaceC40099e13 f82285b;

    /* renamed from: c */
    public DT1 f82286c;

    /* renamed from: d */
    public final Lazy f82287d;

    /* renamed from: e */
    public final C24558d<Optional<IdentificationManualEntryFormData>> f82288e;

    /* renamed from: f */
    public final Lazy f82289f;

    /* renamed from: g */
    public final Lazy f82290g;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052.\u0010\u0004\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LlT1;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$A */
    /* loaded from: classes3.dex */
    public static final class C20873A extends Lambda implements Function1<Pair<? extends C44509lT1<?>, ? extends DateTime>, Unit> {
        public C20873A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C44509lT1<?>, ? extends DateTime> pair) {
            invoke2((Pair<? extends C44509lT1<?>, DateTime>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends C44509lT1<?>, DateTime> pair) {
            C44509lT1<?> component1 = pair.component1();
            DateTime component2 = pair.component2();
            C41553gU1 c41553gU1 = C41553gU1.this;
            DT1 dt1 = c41553gU1.f82286c;
            if (dt1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                dt1 = null;
            }
            c41553gU1.m39313nc(dt1.m110413A().updateForm(component1.m27262c(), component2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$B */
    /* loaded from: classes3.dex */
    public static final class C20874B extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20874B f82292g = new C20874B();

        public C20874B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error handling form field click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052.\u0010\u0004\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LlT1;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$C */
    /* loaded from: classes3.dex */
    public static final class C20875C extends Lambda implements Function1<Pair<? extends C44509lT1<?>, ? extends DateTime>, Unit> {

        /* renamed from: g */
        public static final C20875C f82293g = new C20875C();

        public C20875C() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends C44509lT1<?>, DateTime> pair) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C44509lT1<?>, ? extends DateTime> pair) {
            invoke2((Pair<? extends C44509lT1<?>, DateTime>) pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$D */
    /* loaded from: classes3.dex */
    public static final class C20876D extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20876D f82294g = new C20876D();

        public C20876D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "error handling form field click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType;", "selected", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationDocumentType;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationManualEntryFormBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/IdentificationManualEntryFormBottomSheet$onViewCreated$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1#2:347\n*E\n"})
    /* renamed from: gU1$E */
    /* loaded from: classes3.dex */
    public static final class C20877E extends Lambda implements Function1<IdentificationDocumentType, InterfaceC24574u<? extends IdentificationDocumentType>> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f82296h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20877E(BaseActivity baseActivity) {
            super(1);
            this.f82296h = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends IdentificationDocumentType> invoke(IdentificationDocumentType selected) {
            List<IdentificationDocumentType> plus;
            Intrinsics.checkNotNullParameter(selected, "selected");
            C41318g46.m40163a("doc type clicked", new Object[0]);
            List<IdentificationDocumentType> allowedSpecialDocumentTypes = C41553gU1.this.m39351Ea().getAllowedSpecialDocumentTypes();
            if (allowedSpecialDocumentTypes == null) {
                allowedSpecialDocumentTypes = CollectionsKt__CollectionsKt.emptyList();
            }
            List<IdentificationDocumentType> list = allowedSpecialDocumentTypes;
            List<IdentificationDocumentType> allowedDocumentTypes = C41553gU1.this.m39351Ea().getAllowedDocumentTypes();
            if (allowedDocumentTypes == null) {
                allowedDocumentTypes = CollectionsKt__CollectionsKt.emptyList();
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) allowedDocumentTypes);
            if (!(!plus.isEmpty())) {
                plus = null;
            }
            if (plus == null) {
                plus = IdentificationDocumentType.Companion.selectableValues();
            }
            Q51 m88944a = Q51.f29811f.m88944a(plus, selected);
            m88944a.show(this.f82296h.getSupportFragmentManager(), "DocumentTypePickerBottomSheet");
            return m88944a.m88945a5();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType;", "kotlin.jvm.PlatformType", "docType", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationDocumentType;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$F */
    /* loaded from: classes3.dex */
    public static final class C20878F extends Lambda implements Function1<IdentificationDocumentType, Unit> {
        public C20878F() {
            super(1);
        }

        /* renamed from: a */
        public final void m39297a(IdentificationDocumentType identificationDocumentType) {
            C41318g46.m40163a("received new doc type " + identificationDocumentType, new Object[0]);
            C41553gU1 c41553gU1 = C41553gU1.this;
            DT1 dt1 = c41553gU1.f82286c;
            if (dt1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                dt1 = null;
            }
            c41553gU1.m39313nc(dt1.m110413A().updateForm(IdentificationManualEntryFormField.DOCUMENT_TYPE, identificationDocumentType));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationDocumentType identificationDocumentType) {
            m39297a(identificationDocumentType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$G */
    /* loaded from: classes3.dex */
    public static final class C20879G extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20879G f82298g = new C20879G();

        public C20879G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error selecting doc type", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/r;", "Lorg/joda/time/DateTime;", "emitter", "", "invoke", "(Lio/reactivex/r;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$H */
    /* loaded from: classes3.dex */
    public static final class C20880H extends Lambda implements Function1<InterfaceC24516r<DateTime>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f82299g;

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f82300h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "dateInstant", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gU1$H$a */
        /* loaded from: classes3.dex */
        public static final class C20881a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC24516r<DateTime> f82301g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20881a(InterfaceC24516r<DateTime> interfaceC24516r) {
                super(1);
                this.f82301g = interfaceC24516r;
            }

            /* renamed from: a */
            public final void m39290a(Long dateInstant) {
                long longValue;
                DateTimeZone dateTimeZone = DateTimeZone.getDefault();
                if (dateInstant == null) {
                    longValue = 0;
                } else {
                    longValue = dateInstant.longValue();
                }
                Intrinsics.checkNotNullExpressionValue(dateInstant, "dateInstant");
                this.f82301g.onSuccess(new DateTime(dateInstant.longValue(), DateTimeZone.getDefault()).plusMillis(-dateTimeZone.getOffset(longValue)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m39290a(l);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20880H(String str, BaseActivity baseActivity) {
            super(1);
            this.f82299g = str;
            this.f82300h = baseActivity;
        }

        /* renamed from: d */
        public static final void m39293d(InterfaceC24516r emitter, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onComplete();
        }

        /* renamed from: e */
        public static final void m39292e(InterfaceC24516r emitter, View view) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onComplete();
        }

        /* renamed from: f */
        public static final void m39291f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24516r<DateTime> interfaceC24516r) {
            invoke2(interfaceC24516r);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC24516r<DateTime> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C17780c<Long> m49620a = C17780c.C17787g.m49618c().m49615f(this.f82299g).m49620a();
            Intrinsics.checkNotNullExpressionValue(m49620a, "datePicker()\n        .se…tleText)\n        .build()");
            m49620a.m49640G9(new DialogInterface.OnCancelListener() { // from class: iU1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C41553gU1.C20880H.m39293d(InterfaceC24516r.this, dialogInterface);
                }
            });
            m49620a.m49639I9(new View.OnClickListener() { // from class: jU1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C41553gU1.C20880H.m39292e(InterfaceC24516r.this, view);
                }
            });
            final C20881a c20881a = new C20881a(emitter);
            m49620a.m49638J9(new MM2() { // from class: kU1
                @Override // p000.MM2
                /* renamed from: a */
                public final void mo28922a(Object obj) {
                    C41553gU1.C20880H.m39291f(Function1.this, obj);
                }
            });
            m49620a.show(this.f82300h.getSupportFragmentManager(), "MaterialDatePicker");
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, m28432d2 = {"LgU1$a;", "", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "manualEntry", "", "hasMoreAcceptableMethods", "LgU1;", C17296a.f69688o, "", "ACCEPTABLE_MANUAL_ENTRY", "Ljava/lang/String;", "HAS_MORE_ACCEPTABLE_METHODS", "MATERIAL_DATE_PICKER_TAG", "TAG", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gU1$a */
    /* loaded from: classes3.dex */
    public static final class C20882a {
        public /* synthetic */ C20882a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41553gU1 m39289a(IdentificationAcceptableManualEntry manualEntry, boolean z) {
            Intrinsics.checkNotNullParameter(manualEntry, "manualEntry");
            C41553gU1 c41553gU1 = new C41553gU1();
            Bundle bundle = new Bundle();
            bundle.putParcelable("acceptable_manual_entry", manualEntry);
            bundle.putBoolean("has_more_acceptable_methods", z);
            c41553gU1.setArguments(bundle);
            return c41553gU1;
        }

        private C20882a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LgU1$b;", "", "LgU1;", "activity", "", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC20885c.class})
    /* renamed from: gU1$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC20883b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u0014\b\u0001\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH&¨\u0006\u0010"}, m28432d2 = {"LgU1$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "formSubmissionClicks", "LgU1$b;", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: gU1$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC20884a {
            /* renamed from: a */
            InterfaceC20883b mo39287a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DialogInterface dialogInterface, @BindsInstance Observable<Optional<IdentificationManualEntryFormData>> observable);
        }

        /* renamed from: a */
        void mo39288a(C41553gU1 c41553gU1);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LgU1$c;", "", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: gU1$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC20885c {
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "b", "()Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$d */
    /* loaded from: classes3.dex */
    public static final class C20886d extends Lambda implements Function0<IdentificationAcceptableManualEntry> {
        public C20886d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final IdentificationAcceptableManualEntry invoke() {
            Bundle arguments = C41553gU1.this.getArguments();
            IdentificationAcceptableManualEntry identificationAcceptableManualEntry = arguments != null ? (IdentificationAcceptableManualEntry) arguments.getParcelable("acceptable_manual_entry") : null;
            Intrinsics.checkNotNull(identificationAcceptableManualEntry);
            return identificationAcceptableManualEntry;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LmU1;", "b", "()LmU1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$e */
    /* loaded from: classes3.dex */
    public static final class C20887e extends Lambda implements Function0<C45111mU1> {
        public C20887e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C45111mU1 invoke() {
            Context requireContext = C41553gU1.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            return new C45111mU1(requireContext);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$f */
    /* loaded from: classes3.dex */
    public static final class C20888f extends Lambda implements Function0<Boolean> {
        public C20888f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Bundle arguments = C41553gU1.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("has_more_acceptable_methods") : false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationDocumentType;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$g */
    /* loaded from: classes3.dex */
    public static final class C20889g extends Lambda implements Function1<IdentificationDocumentType, Unit> {

        /* renamed from: g */
        public static final C20889g f82305g = new C20889g();

        public C20889g() {
            super(1);
        }

        /* renamed from: a */
        public final void m39284a(IdentificationDocumentType identificationDocumentType) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationDocumentType identificationDocumentType) {
            m39284a(identificationDocumentType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$h */
    /* loaded from: classes3.dex */
    public static final class C20890h extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20890h f82306g = new C20890h();

        public C20890h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error selecting doc type", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/util/Locale;", "locale", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Locale;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$i */
    /* loaded from: classes3.dex */
    public static final class C20891i extends Lambda implements Function1<Locale, InterfaceC24574u<? extends Locale>> {

        /* renamed from: g */
        public final /* synthetic */ BaseActivity f82307g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20891i(BaseActivity baseActivity) {
            super(1);
            this.f82307g = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Locale> invoke(Locale locale) {
            List<Locale> list;
            Intrinsics.checkNotNullParameter(locale, "locale");
            C41318g46.m40163a("nationality clicked", new Object[0]);
            C51478xD0.C30064a c30064a = C51478xD0.f117213f;
            Locale[] availableLocales = Locale.getAvailableLocales();
            Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales()");
            list = ArraysKt___ArraysKt.toList(availableLocales);
            C51478xD0 m5662a = c30064a.m5662a(list, locale);
            m5662a.show(this.f82307g.getSupportFragmentManager(), "CountryPickerBottomSheet");
            return m5662a.m5674D9();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/util/Locale;", "kotlin.jvm.PlatformType", "locale", "", C17296a.f69688o, "(Ljava/util/Locale;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$j */
    /* loaded from: classes3.dex */
    public static final class C20892j extends Lambda implements Function1<Locale, Unit> {
        public C20892j() {
            super(1);
        }

        /* renamed from: a */
        public final void m39282a(Locale locale) {
            C41318g46.m40163a("received updated locale " + locale, new Object[0]);
            C41553gU1 c41553gU1 = C41553gU1.this;
            DT1 dt1 = c41553gU1.f82286c;
            if (dt1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                dt1 = null;
            }
            c41553gU1.m39313nc(dt1.m110413A().updateForm(IdentificationManualEntryFormField.NATIONALITY, locale));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Locale locale) {
            m39282a(locale);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$k */
    /* loaded from: classes3.dex */
    public static final class C20893k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20893k f82309g = new C20893k();

        public C20893k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error selecting nationality", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/util/Locale;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/util/Locale;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$l */
    /* loaded from: classes3.dex */
    public static final class C20894l extends Lambda implements Function1<Locale, Unit> {

        /* renamed from: g */
        public static final C20894l f82310g = new C20894l();

        public C20894l() {
            super(1);
        }

        /* renamed from: a */
        public final void m39281a(Locale locale) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Locale locale) {
            m39281a(locale);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$m */
    /* loaded from: classes3.dex */
    public static final class C20895m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20895m f82311g = new C20895m();

        public C20895m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error selecting nationality", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationGender;", "gender", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationGender;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$n */
    /* loaded from: classes3.dex */
    public static final class C20896n extends Lambda implements Function1<IdentificationGender, InterfaceC24574u<? extends IdentificationGender>> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f82313h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20896n(BaseActivity baseActivity) {
            super(1);
            this.f82313h = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends IdentificationGender> invoke(IdentificationGender gender) {
            Intrinsics.checkNotNullParameter(gender, "gender");
            C41318g46.m40163a("gender clicked", new Object[0]);
            C40009ds2.C19877a c19877a = C40009ds2.f77321e;
            List<IdentificationGender> selectableValues = IdentificationGender.Companion.selectableValues();
            Context context = C41553gU1.this.getContext();
            C40009ds2 m43578a = c19877a.m43578a(selectableValues, gender, (context == null || (r2 = context.getString(C45871nl4.manual_entry_gender)) == null) ? "" : "");
            m43578a.show(this.f82313h.getSupportFragmentManager(), "ListPickerBottomSheet");
            return m43578a.m43579a5();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationGender;", "kotlin.jvm.PlatformType", "gender", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationGender;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$o */
    /* loaded from: classes3.dex */
    public static final class C20897o extends Lambda implements Function1<IdentificationGender, Unit> {
        public C20897o() {
            super(1);
        }

        /* renamed from: a */
        public final void m39279a(IdentificationGender identificationGender) {
            C41553gU1 c41553gU1 = C41553gU1.this;
            DT1 dt1 = c41553gU1.f82286c;
            if (dt1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                dt1 = null;
            }
            c41553gU1.m39313nc(dt1.m110413A().updateForm(IdentificationManualEntryFormField.GENDER, identificationGender));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationGender identificationGender) {
            m39279a(identificationGender);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$p */
    /* loaded from: classes3.dex */
    public static final class C20898p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20898p f82315g = new C20898p();

        public C20898p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error selecting gender", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aj\u0012.\b\u0001\u0012*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*4\u0012.\b\u0001\u0012*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LlT1;", RequestHeadersFactory.MODEL, "Lio/reactivex/u;", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "b", "(LlT1;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$q */
    /* loaded from: classes3.dex */
    public static final class C20899q extends Lambda implements Function1<C44509lT1<?>, InterfaceC24574u<? extends Pair<? extends C44509lT1<?>, ? extends DateTime>>> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f82317h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lorg/joda/time/DateTime;", "it", "Lkotlin/Pair;", "LlT1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lorg/joda/time/DateTime;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gU1$q$a */
        /* loaded from: classes3.dex */
        public static final class C20900a extends Lambda implements Function1<DateTime, Pair<? extends C44509lT1<?>, ? extends DateTime>> {

            /* renamed from: g */
            public final /* synthetic */ C44509lT1<?> f82318g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20900a(C44509lT1<?> c44509lT1) {
                super(1);
                this.f82318g = c44509lT1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<C44509lT1<?>, DateTime> invoke(DateTime it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f82318g, it);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: gU1$q$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C20901b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdentificationManualEntryFormField.values().length];
                try {
                    iArr[IdentificationManualEntryFormField.ISSUE_DATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IdentificationManualEntryFormField.EXPIRATION_DATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IdentificationManualEntryFormField.DATE_OF_BIRTH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20899q(BaseActivity baseActivity) {
            super(1);
            this.f82317h = baseActivity;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<C44509lT1<?>, DateTime>> invoke(C44509lT1<?> model) {
            Intrinsics.checkNotNullParameter(model, "model");
            int i = C20901b.$EnumSwitchMapping$0[model.m27262c().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                return AbstractC24507p.m32024u();
            }
            AbstractC24507p<DateTime> m39311oc = C41553gU1.this.m39311oc(model.m27261d(), this.f82317h);
            final C20900a c20900a = new C20900a(model);
            return m39311oc.m32067H(new InterfaceC23492o() { // from class: hU1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C41553gU1.C20899q.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationGender;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationGender;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gU1$r */
    /* loaded from: classes3.dex */
    public static final class C20902r extends Lambda implements Function1<IdentificationGender, Unit> {

        /* renamed from: g */
        public static final C20902r f82319g = new C20902r();

        public C20902r() {
            super(1);
        }

        /* renamed from: a */
        public final void m39275a(IdentificationGender identificationGender) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationGender identificationGender) {
            m39275a(identificationGender);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$s */
    /* loaded from: classes3.dex */
    public static final class C20903s extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20903s f82320g = new C20903s();

        public C20903s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error selecting gender", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$t */
    /* loaded from: classes3.dex */
    public static final class C20904t extends Lambda implements Function1<Unit, Unit> {
        public C20904t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41553gU1.this.dismiss();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$u */
    /* loaded from: classes3.dex */
    public static final class C20905u extends Lambda implements Function1<Unit, Unit> {
        public C20905u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41553gU1.this.m39342La().mo37009i0(10041);
            C41553gU1.this.dismiss();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$v */
    /* loaded from: classes3.dex */
    public static final class C20906v extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20906v f82323g = new C20906v();

        public C20906v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while clicking use another id button", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$w */
    /* loaded from: classes3.dex */
    public static final class C20907w extends Lambda implements Function1<Unit, Unit> {
        public C20907w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41553gU1 c41553gU1 = C41553gU1.this;
            DT1 dt1 = c41553gU1.f82286c;
            if (dt1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                dt1 = null;
            }
            c41553gU1.m39340Na(dt1.m110413A());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$x */
    /* loaded from: classes3.dex */
    public static final class C20908x extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20908x f82325g = new C20908x();

        public C20908x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while clicking submit button", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$y */
    /* loaded from: classes3.dex */
    public static final class C20909y extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C20909y f82326g = new C20909y();

        public C20909y() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: gU1$z */
    /* loaded from: classes3.dex */
    public static final class C20910z extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20910z f82327g = new C20910z();

        public C20910z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while clicking submit button", new Object[0]);
        }
    }

    public C41553gU1() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        lazy = LazyKt__LazyJVMKt.lazy(new C20887e());
        this.f82287d = lazy;
        C24558d<Optional<IdentificationManualEntryFormData>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Optional<Identifi…onManualEntryFormData>>()");
        this.f82288e = m31902e;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C20886d());
        this.f82289f = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C20888f());
        this.f82290g = lazy3;
    }

    /* renamed from: Hb */
    public static final void m39348Hb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Ib */
    public static final void m39346Ib(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Jb */
    public static final void m39343Jb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Oa */
    public static final InterfaceC24574u m39339Oa(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Pa */
    public static final void m39337Pa(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Pb */
    public static final void m39336Pb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Qa */
    public static final InterfaceC24574u m39335Qa(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Ra */
    public static final void m39334Ra(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Ta */
    public static final void m39331Ta(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Wa */
    public static final void m39330Wa(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: cc */
    public static final void m39328cc(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: ec */
    public static final InterfaceC24574u m39325ec(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: fc */
    public static final void m39323fc(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: hb */
    public static final void m39321hb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: ib */
    public static final InterfaceC24574u m39319ib(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: jc */
    public static final void m39318jc(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: mb */
    public static final void m39315mb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: mc */
    public static final void m39314mc(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onViewCreated$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: pb */
    public static final void m39310pb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: qb */
    public static final void m39309qb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: rb */
    public static final void m39308rb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: sb */
    public static final void m39306sb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: tb */
    public static final void m39304tb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: ub */
    public static final void m39303ub(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: yb */
    public static final void m39300yb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: zb */
    public static final void m39299zb(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Da */
    public final Observable<Optional<IdentificationManualEntryFormData>> m39353Da() {
        Observable<Optional<IdentificationManualEntryFormData>> hide = this.f82288e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "formSubmissionClicks.hide()");
        return hide;
    }

    /* renamed from: Ea */
    public final IdentificationAcceptableManualEntry m39351Ea() {
        return (IdentificationAcceptableManualEntry) this.f82289f.getValue();
    }

    /* renamed from: Ga */
    public final C45111mU1 m39349Ga() {
        return (C45111mU1) this.f82287d.getValue();
    }

    /* renamed from: Ja */
    public final boolean m39344Ja() {
        return ((Boolean) this.f82290g.getValue()).booleanValue();
    }

    /* renamed from: La */
    public final InterfaceC40099e13 m39342La() {
        InterfaceC40099e13 interfaceC40099e13 = this.f82285b;
        if (interfaceC40099e13 != null) {
            return interfaceC40099e13;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: Na */
    public final void m39340Na(IdentificationManualEntryFormData identificationManualEntryFormData) {
        IdentificationAcceptableManualEntry acceptableManualEntry = m39351Ea();
        Intrinsics.checkNotNullExpressionValue(acceptableManualEntry, "acceptableManualEntry");
        if (identificationManualEntryFormData.isValid(acceptableManualEntry)) {
            C41318g46.m40163a("form data validated, attempting to submit now", new Object[0]);
            C24558d<Optional<IdentificationManualEntryFormData>> c24558d = this.f82288e;
            Optional.C14443a c14443a = Optional.f63040c;
            IdentificationAcceptableManualEntry acceptableManualEntry2 = m39351Ea();
            Intrinsics.checkNotNullExpressionValue(acceptableManualEntry2, "acceptableManualEntry");
            c24558d.onNext(c14443a.m59032c(identificationManualEntryFormData.formatForSubmission(acceptableManualEntry2)));
            return;
        }
        C41318g46.m40163a("form data was not valid, rendering errors", new Object[0]);
        m39313nc(identificationManualEntryFormData);
    }

    /* renamed from: nc */
    public final void m39313nc(IdentificationManualEntryFormData identificationManualEntryFormData) {
        DT1 dt1 = this.f82286c;
        if (dt1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dt1 = null;
        }
        C45111mU1 m39349Ga = m39349Ga();
        IdentificationAcceptableManualEntry acceptableManualEntry = m39351Ea();
        Intrinsics.checkNotNullExpressionValue(acceptableManualEntry, "acceptableManualEntry");
        dt1.mo24871u(m39349Ga.m25539a(acceptableManualEntry, identificationManualEntryFormData));
    }

    /* renamed from: oc */
    public final AbstractC24507p<DateTime> m39311oc(String titleText, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return C45832nh5.m23309g(new C20880H(titleText, activity));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f82288e.m31901g()) {
            this.f82288e.onNext(Optional.f63040c.m59034a());
        }
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C32184Cl4.BottomSheetDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C27615qZ.m17457c(inflater, viewGroup, false).getRoot();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f82288e.m31901g()) {
            this.f82288e.onNext(Optional.f63040c.m59034a());
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        List plus;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C27615qZ m17459a = C27615qZ.m17459a(view);
        Intrinsics.checkNotNullExpressionValue(m17459a, "bind(view)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mvp.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) activity;
        InterfaceC20883b.InterfaceC20884a m86956a = RK0.m86956a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m86956a.mo39287a(m21419a, baseActivity, m45195i, dialog, this.f82288e).mo39288a(this);
        this.f82286c = new DT1();
        RecyclerView recyclerView = m17459a.f105411h;
        recyclerView.setLayoutManager(new LinearLayoutManager(baseActivity));
        DT1 dt1 = this.f82286c;
        if (dt1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dt1 = null;
        }
        recyclerView.setAdapter(dt1);
        m17459a.f105413j.setText(C45871nl4.your_id_details_titlecased);
        DT1 dt12 = this.f82286c;
        if (dt12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dt12 = null;
        }
        Observable<C44509lT1<?>> observeOn = dt12.m110408x().observeOn(C23454a.m33087a());
        final C20899q c20899q = new C20899q(baseActivity);
        Observable<R> flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: FT1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m39339Oa;
                m39339Oa = C41553gU1.m39339Oa(Function1.this, obj);
                return m39339Oa;
            }
        });
        final C20873A c20873a = new C20873A();
        Observable doOnNext = flatMapMaybe.doOnNext(new InterfaceC23484g() { // from class: HT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.onViewCreated$lambda$2(Function1.this, obj);
            }
        });
        final C20874B c20874b = C20874B.f82292g;
        Observable retry = doOnNext.doOnError(new InterfaceC23484g() { // from class: PT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39343Jb(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onViewCreat…firstOrNull(),\n    ))\n  }");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20875C c20875c = C20875C.f82293g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: RT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39336Pb(Function1.this, obj);
            }
        };
        final C20876D c20876d = C20876D.f82294g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ST1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39328cc(Function1.this, obj);
            }
        });
        DT1 dt13 = this.f82286c;
        if (dt13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dt13 = null;
        }
        Observable<IdentificationDocumentType> observeOn2 = dt13.m110409w().observeOn(C23454a.m33087a());
        final C20877E c20877e = new C20877E(baseActivity);
        Observable<R> flatMapMaybe2 = observeOn2.flatMapMaybe(new InterfaceC23492o() { // from class: TT1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m39325ec;
                m39325ec = C41553gU1.m39325ec(Function1.this, obj);
                return m39325ec;
            }
        });
        final C20878F c20878f = new C20878F();
        Observable doOnNext2 = flatMapMaybe2.doOnNext(new InterfaceC23484g() { // from class: UT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39323fc(Function1.this, obj);
            }
        });
        final C20879G c20879g = C20879G.f82298g;
        Observable retry2 = doOnNext2.doOnError(new InterfaceC23484g() { // from class: VT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39318jc(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "override fun onViewCreat…firstOrNull(),\n    ))\n  }");
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as2 = retry2.m33094as(AutoDispose.m45239a(m45197b2));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20889g c20889g = C20889g.f82305g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: WT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39314mc(Function1.this, obj);
            }
        };
        final C20890h c20890h = C20890h.f82306g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: XT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39337Pa(Function1.this, obj);
            }
        });
        DT1 dt14 = this.f82286c;
        if (dt14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dt14 = null;
        }
        Observable<Locale> observeOn3 = dt14.m110410v().observeOn(C23454a.m33087a());
        final C20891i c20891i = new C20891i(baseActivity);
        Observable<R> flatMapMaybe3 = observeOn3.flatMapMaybe(new InterfaceC23492o() { // from class: QT1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m39335Qa;
                m39335Qa = C41553gU1.m39335Qa(Function1.this, obj);
                return m39335Qa;
            }
        });
        final C20892j c20892j = new C20892j();
        Observable doOnNext3 = flatMapMaybe3.doOnNext(new InterfaceC23484g() { // from class: YT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39334Ra(Function1.this, obj);
            }
        });
        final C20893k c20893k = C20893k.f82309g;
        Observable doOnError = doOnNext3.doOnError(new InterfaceC23484g() { // from class: ZT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39331Ta(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun onViewCreat…firstOrNull(),\n    ))\n  }");
        AndroidLifecycleScopeProvider m45197b3 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b3, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as3 = doOnError.m33094as(AutoDispose.m45239a(m45197b3));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20894l c20894l = C20894l.f82310g;
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: aU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39330Wa(Function1.this, obj);
            }
        };
        final C20895m c20895m = C20895m.f82311g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: bU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39321hb(Function1.this, obj);
            }
        });
        DT1 dt15 = this.f82286c;
        if (dt15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            dt15 = null;
        }
        Observable<IdentificationGender> observeOn4 = dt15.m110407y().observeOn(C23454a.m33087a());
        final C20896n c20896n = new C20896n(baseActivity);
        Observable observeOn5 = observeOn4.flatMapMaybe(new InterfaceC23492o() { // from class: cU1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m39319ib;
                m39319ib = C41553gU1.m39319ib(Function1.this, obj);
                return m39319ib;
            }
        }).observeOn(C23454a.m33087a());
        final C20897o c20897o = new C20897o();
        Observable doOnNext4 = observeOn5.doOnNext(new InterfaceC23484g() { // from class: dU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39315mb(Function1.this, obj);
            }
        });
        final C20898p c20898p = C20898p.f82315g;
        Observable retry3 = doOnNext4.doOnError(new InterfaceC23484g() { // from class: eU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39310pb(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry3, "override fun onViewCreat…firstOrNull(),\n    ))\n  }");
        AndroidLifecycleScopeProvider m45197b4 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b4, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as4 = retry3.m33094as(AutoDispose.m45239a(m45197b4));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20902r c20902r = C20902r.f82319g;
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: fU1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39309qb(Function1.this, obj);
            }
        };
        final C20903s c20903s = C20903s.f82320g;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: GT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39308rb(Function1.this, obj);
            }
        });
        ImageView imageView = m17459a.f105407d;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.closeButton");
        C49520tu6.show$default(imageView, m39351Ea().getOfferBeforeScan(), 0, 2, null);
        ImageView imageView2 = m17459a.f105407d;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.closeButton");
        Observable observeOn6 = C44626lf5.clicksThrottle$default(imageView2, 0L, 1, null).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "binding.closeButton.clic…dSchedulers.mainThread())");
        AndroidLifecycleScopeProvider m45197b5 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b5, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as5 = observeOn6.m33094as(AutoDispose.m45239a(m45197b5));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20904t c20904t = new C20904t();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: IT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39306sb(Function1.this, obj);
            }
        });
        Button button = m17459a.f105405b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.alternateIdButton");
        if (m39351Ea().getOfferBeforeScan() && m39344Ja()) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(button, z, 0, 2, null);
        Button button2 = m17459a.f105405b;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.alternateIdButton");
        Observable retry4 = C44626lf5.clicksThrottle$default(button2, 0L, 1, null).observeOn(C23454a.m33087a()).retry();
        Intrinsics.checkNotNullExpressionValue(retry4, "binding.alternateIdButto…nThread())\n      .retry()");
        AndroidLifecycleScopeProvider m45197b6 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b6, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as6 = retry4.m33094as(AutoDispose.m45239a(m45197b6));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20905u c20905u = new C20905u();
        InterfaceC23484g interfaceC23484g5 = new InterfaceC23484g() { // from class: JT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39304tb(Function1.this, obj);
            }
        };
        final C20906v c20906v = C20906v.f82323g;
        ((ObservableSubscribeProxy) m33094as6).subscribe(interfaceC23484g5, new InterfaceC23484g() { // from class: KT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39303ub(Function1.this, obj);
            }
        });
        Button button3 = m17459a.f105412i;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.submitButton");
        Observable observeOn7 = C44626lf5.clicksThrottle$default(button3, 0L, 1, null).observeOn(C23454a.m33087a());
        final C20907w c20907w = new C20907w();
        Observable doOnNext5 = observeOn7.doOnNext(new InterfaceC23484g() { // from class: LT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39300yb(Function1.this, obj);
            }
        });
        final C20908x c20908x = C20908x.f82325g;
        Observable retry5 = doOnNext5.doOnError(new InterfaceC23484g() { // from class: MT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39299zb(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry5, "override fun onViewCreat…firstOrNull(),\n    ))\n  }");
        AndroidLifecycleScopeProvider m45197b7 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b7, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as7 = retry5.m33094as(AutoDispose.m45239a(m45197b7));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20909y c20909y = C20909y.f82326g;
        InterfaceC23484g interfaceC23484g6 = new InterfaceC23484g() { // from class: NT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39348Hb(Function1.this, obj);
            }
        };
        final C20910z c20910z = C20910z.f82327g;
        ((ObservableSubscribeProxy) m33094as7).subscribe(interfaceC23484g6, new InterfaceC23484g() { // from class: OT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41553gU1.m39346Ib(Function1.this, obj);
            }
        });
        List<IdentificationDocumentType> allowedSpecialDocumentTypes = m39351Ea().getAllowedSpecialDocumentTypes();
        if (allowedSpecialDocumentTypes == null) {
            allowedSpecialDocumentTypes = CollectionsKt__CollectionsKt.emptyList();
        }
        List<IdentificationDocumentType> list = allowedSpecialDocumentTypes;
        List<IdentificationDocumentType> allowedDocumentTypes = m39351Ea().getAllowedDocumentTypes();
        if (allowedDocumentTypes == null) {
            allowedDocumentTypes = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) allowedDocumentTypes);
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) plus);
        m39313nc(new IdentificationManualEntryFormData((IdentificationDocumentType) firstOrNull, null, null, null, null, null, null, null, null, null, null, 2046, null));
    }
}
