package p000;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Countries;
import co.bird.android.model.Country;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC17707a;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24556c;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u00035\"&B\u0007¢\u0006\u0004\b2\u00103J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J \u0010\u001b\u001a\u00020\u001a2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00170\u001e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00110\u00110)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, m28432d2 = {"LxD0;", "Lac5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "onPause", "Lio/reactivex/p;", "Ljava/util/Locale;", "D9", "Landroid/content/DialogInterface;", "dialog", "onCancel", "onDismiss", "", "countries", "selected", "Lio/reactivex/disposables/c;", "S9", "option", "J9", "Lio/reactivex/Observable;", "Lco/bird/android/model/Country;", "E9", "LrD0;", "b", "LrD0;", "adapter", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;", "c", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;", "recyclerView", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/c;", "countryClicks", "Lio/reactivex/disposables/b;", "e", "Lio/reactivex/disposables/b;", "compositeDisposable", "<init>", "()V", "f", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCountryPickerBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/CountryPickerBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n64#2:208\n1549#3:209\n1620#3,3:210\n766#3:214\n857#3,2:215\n1549#3:217\n1620#3,3:218\n1655#3,8:221\n1#4:213\n*S KotlinDebug\n*F\n+ 1 CountryPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/CountryPickerBottomSheet\n*L\n80#1:208\n97#1:209\n97#1:210,3\n167#1:214\n167#1:215,2\n175#1:217\n175#1:218,3\n176#1:221,8\n*E\n"})
/* renamed from: xD0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51478xD0 extends AbstractC38056ac5 {

    /* renamed from: f */
    public static final C30064a f117213f = new C30064a(null);

    /* renamed from: b */
    public C47922rD0 f117214b;

    /* renamed from: c */
    public FastScrollRecyclerView f117215c;

    /* renamed from: d */
    public final C24556c<Locale> f117216d;

    /* renamed from: e */
    public final C23464b f117217e;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, m28432d2 = {"LxD0$a;", "", "", "Ljava/util/Locale;", "countries", "selectedLocale", "LxD0;", C17296a.f69688o, "", "COUNTRIES", "Ljava/lang/String;", "SELECTED_COUNTRY", "TAG", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCountryPickerBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/CountryPickerBottomSheet$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1549#2:208\n1620#2,3:209\n*S KotlinDebug\n*F\n+ 1 CountryPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/CountryPickerBottomSheet$Companion\n*L\n57#1:208\n57#1:209,3\n*E\n"})
    /* renamed from: xD0$a */
    /* loaded from: classes3.dex */
    public static final class C30064a {
        public /* synthetic */ C30064a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C51478xD0 m5662a(List<Locale> countries, Locale locale) {
            int collectionSizeOrDefault;
            String str;
            Intrinsics.checkNotNullParameter(countries, "countries");
            C51478xD0 c51478xD0 = new C51478xD0();
            Bundle bundle = new Bundle();
            List<Locale> list = countries;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Locale locale2 : list) {
                arrayList.add(locale2.toLanguageTag());
            }
            bundle.putStringArrayList("countries", C44691lm0.m26849a(arrayList));
            if (locale != null) {
                str = locale.toLanguageTag();
            } else {
                str = null;
            }
            bundle.putString("country", str);
            c51478xD0.setArguments(bundle);
            return c51478xD0;
        }

        private C30064a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LxD0$b;", "", "LxD0;", "activity", "", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC30067c.class})
    /* renamed from: xD0$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC30065b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\u000f"}, m28432d2 = {"LxD0$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/content/DialogInterface;", "dialog", "Lio/reactivex/p;", "Ljava/util/Locale;", "countryClicks", "LxD0$b;", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: xD0$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC30066a {
            /* renamed from: a */
            InterfaceC30065b mo5660a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance DialogInterface dialogInterface, @BindsInstance AbstractC24507p<Locale> abstractC24507p);
        }

        /* renamed from: a */
        void mo5661a(C51478xD0 c51478xD0);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LxD0$c;", "", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: xD0$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC30067c {
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lco/bird/android/model/Country;", "item", "", C17296a.f69688o, "(Landroid/view/View;ILco/bird/android/model/Country;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xD0$d */
    /* loaded from: classes3.dex */
    public static final class C30068d extends Lambda implements Function3<View, Integer, Country, Unit> {
        public C30068d() {
            super(3);
        }

        /* renamed from: a */
        public final void m5659a(View view, int i, Country item) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(item, "item");
            C51478xD0 c51478xD0 = C51478xD0.this;
            Locale locale = item.getLocale();
            if (locale == null) {
                locale = new Locale("", item.getCode());
            }
            c51478xD0.m5670J9(locale);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, Country country) {
            m5659a(view, num.intValue(), country);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "countries", "", "Lco/bird/android/model/Country;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCountryPickerBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/CountryPickerBottomSheet$setCountries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n350#2,7:208\n*S KotlinDebug\n*F\n+ 1 CountryPickerBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/CountryPickerBottomSheet$setCountries$1\n*L\n133#1:208,7\n*E\n"})
    /* renamed from: xD0$e */
    /* loaded from: classes3.dex */
    public static final class C30069e extends Lambda implements Function1<List<? extends Country>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Locale f117220h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30069e(Locale locale) {
            super(1);
            this.f117220h = locale;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Country> list) {
            invoke2((List<Country>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Country> countries) {
            FastScrollRecyclerView fastScrollRecyclerView;
            RecyclerView.AbstractC11855p layoutManager;
            C47922rD0 c47922rD0 = C51478xD0.this.f117214b;
            if (c47922rD0 != null) {
                Intrinsics.checkNotNullExpressionValue(countries, "countries");
                c47922rD0.m44899C(countries);
            }
            Locale locale = this.f117220h;
            if (locale == null || (fastScrollRecyclerView = C51478xD0.this.f117215c) == null || (layoutManager = fastScrollRecyclerView.getLayoutManager()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(countries, "countries");
            Iterator<Country> it = countries.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(locale.getCountry(), it.next().getCode())) {
                    break;
                } else {
                    i++;
                }
            }
            layoutManager.mo51857P1(i);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xD0$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30070f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C30070f f117221b = new C30070f();

        public C30070f() {
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

    public C51478xD0() {
        C24556c<Locale> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<Locale>()");
        this.f117216d = m31906k0;
        this.f117217e = new C23464b();
    }

    /* renamed from: G9 */
    public static final List m5672G9(List countryCodes) {
        int collectionSizeOrDefault;
        List sortedWith;
        Intrinsics.checkNotNullParameter(countryCodes, "$countryCodes");
        final Collator collator = Collator.getInstance();
        Comparator comparator = new Comparator() { // from class: wD0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m5671I9;
                m5671I9 = C51478xD0.m5671I9(collator, (Country) obj, (Country) obj2);
                return m5671I9;
            }
        };
        List<Locale> list = countryCodes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Locale locale : list) {
            arrayList.add(Country.Factory.create(locale));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((Country) obj).getCode())) {
                arrayList2.add(obj);
            }
        }
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, comparator);
        return sortedWith;
    }

    /* renamed from: I9 */
    public static final int m5671I9(Collator collator, Country country, Country country2) {
        return collator.compare(country.getName(), country2.getName());
    }

    /* renamed from: P9 */
    public static final void m5668P9(DialogInterface dialogInterface) {
        DialogC17707a dialogC17707a;
        FrameLayout frameLayout;
        if (dialogInterface instanceof DialogC17707a) {
            dialogC17707a = (DialogC17707a) dialogInterface;
        } else {
            dialogC17707a = null;
        }
        if (dialogC17707a != null && (frameLayout = (FrameLayout) dialogC17707a.findViewById(C33795Ji4.design_bottom_sheet)) != null) {
            try {
                BottomSheetBehavior.m50133G(frameLayout).m50082p0(3);
            } catch (Exception e) {
                C41318g46.m40158f(e, "could not get behavior for dialog view", new Object[0]);
            }
        }
    }

    /* renamed from: T9 */
    public static final void m5666T9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: da */
    public static final void m5664da(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D9 */
    public final AbstractC24507p<Locale> m5674D9() {
        AbstractC24507p<Locale> m32070E = this.f117216d.m32070E();
        Intrinsics.checkNotNullExpressionValue(m32070E, "countryClicks.hide()");
        return m32070E;
    }

    /* renamed from: E9 */
    public final Observable<List<Country>> m5673E9(List<Locale> list) {
        final ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Countries.ALL.getCountries().contains(((Locale) obj).getCountry())) {
                arrayList.add(obj);
            }
        }
        Observable<List<Country>> observeOn = Observable.fromCallable(new Callable() { // from class: vD0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m5672G9;
                m5672G9 = C51478xD0.m5672G9(arrayList);
                return m5672G9;
            }
        }).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fromCallable {\n      val…dSchedulers.mainThread())");
        return observeOn;
    }

    /* renamed from: J9 */
    public final void m5670J9(Locale locale) {
        this.f117216d.onSuccess(locale);
        dismiss();
    }

    /* renamed from: S9 */
    public final InterfaceC23465c m5667S9(List<Locale> list, Locale locale) {
        Observable<List<Country>> subscribeOn = m5673E9(list).observeOn(C23454a.m33087a()).subscribeOn(C24542a.m31934a());
        final C30069e c30069e = new C30069e(locale);
        InterfaceC23484g<? super List<Country>> interfaceC23484g = new InterfaceC23484g() { // from class: sD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51478xD0.m5666T9(Function1.this, obj);
            }
        };
        final C30070f c30070f = C30070f.f117221b;
        InterfaceC23465c subscribe = subscribeOn.subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: tD0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51478xD0.m5664da(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "private fun setCountries…  }\n      }, (Timber::e))");
        return subscribe;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f117216d.m31905l0()) {
            this.f117216d.onComplete();
        }
        super.onCancel(dialog);
    }

    @Override // p000.AbstractC38056ac5, com.google.android.material.bottomsheet.C17714b, p000.C26572ni, androidx.fragment.app.DialogInterface$OnCancelListenerC11663c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: uD0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C51478xD0.m5668P9(dialogInterface);
            }
        });
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C42293hj4.bottom_sheet_picker, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f117216d.m31905l0()) {
            this.f117216d.onComplete();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f117217e.m33026d();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        List<Locale> emptyList;
        String string;
        ArrayList<String> stringArrayList;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Locale locale = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC30065b.InterfaceC30066a m14479a = C48559sI0.m14479a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m14479a.mo5660a(m21419a, baseActivity, m45195i, dialog, this.f117216d).mo5661a(this);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f117214b = new C47922rD0(requireContext);
        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) C49520tu6.m11238m(view, C49981uh4.recyclerView);
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.setLayoutManager(new LinearLayoutManager(baseActivity));
            fastScrollRecyclerView.setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
            fastScrollRecyclerView.addItemDecoration(new FN5(baseActivity, C37044Xf4.card_spacing));
            fastScrollRecyclerView.setAdapter(this.f117214b);
        } else {
            fastScrollRecyclerView = null;
        }
        this.f117215c = fastScrollRecyclerView;
        C47922rD0 c47922rD0 = this.f117214b;
        if (c47922rD0 != null) {
            c47922rD0.m44888y(new C30068d());
        }
        Bundle arguments = getArguments();
        if (arguments != null && (stringArrayList = arguments.getStringArrayList("countries")) != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(stringArrayList, 10);
            emptyList = new ArrayList<>(collectionSizeOrDefault);
            for (String str : stringArrayList) {
                emptyList.add(Locale.forLanguageTag(str));
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("country")) != null) {
            locale = Locale.forLanguageTag(string);
        }
        C37279Yf5.m74523y(m5667S9(emptyList, locale), this.f117217e);
    }
}
