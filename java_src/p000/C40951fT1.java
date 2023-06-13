package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationDebugResponse;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#JB\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J0\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J.\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 ¨\u0006$"}, m28432d2 = {"LfT1;", "", "LZV1;", "identificationStatusState", "Ljava/util/Locale;", "currentLocale", "Lco/bird/android/model/identification/IdentificationDocumentType;", "currentDocumentType", "Lco/bird/android/model/identification/IdentificationDebugResponse;", "currentDebugResponse", "", "documentTypes", "Lio/reactivex/F;", "", "LH6;", "b", "f", "currentCountryCode", "e", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LOh;", "LOh;", "appBuildConfig", "LRh6;", "c", "LRh6;", "userStream", "Lgl;", "Lgl;", "appPreference", "<init>", "(Landroid/content/Context;LOh;LRh6;Lgl;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationConverter.kt\nco/bird/android/feature/identification/adapters/IdentificationConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,186:1\n1549#2:187\n1620#2,3:188\n37#3,2:191\n*S KotlinDebug\n*F\n+ 1 IdentificationConverter.kt\nco/bird/android/feature/identification/adapters/IdentificationConverter\n*L\n103#1:187\n103#1:188,3\n114#1:191,2\n*E\n"})
/* renamed from: fT1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40951fT1 {

    /* renamed from: a */
    public final Context f80190a;

    /* renamed from: b */
    public final InterfaceC6097Oh f80191b;

    /* renamed from: c */
    public final InterfaceC35660Rh6 f80192c;

    /* renamed from: d */
    public final C22454gl f80193d;

    public C40951fT1(Context context, InterfaceC6097Oh appBuildConfig, InterfaceC35660Rh6 userStream, C22454gl appPreference) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        this.f80190a = context;
        this.f80191b = appBuildConfig;
        this.f80192c = userStream;
        this.f80193d = appPreference;
    }

    /* renamed from: c */
    public static final List m41301c(C40951fT1 this$0, ZV1 identificationStatusState, Locale currentLocale, IdentificationDocumentType currentDocumentType, Set documentTypes, IdentificationDebugResponse identificationDebugResponse) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(identificationStatusState, "$identificationStatusState");
        Intrinsics.checkNotNullParameter(currentLocale, "$currentLocale");
        Intrinsics.checkNotNullParameter(currentDocumentType, "$currentDocumentType");
        Intrinsics.checkNotNullParameter(documentTypes, "$documentTypes");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m41298f(identificationStatusState, currentLocale), this$0.m41299e(identificationStatusState, currentLocale, currentDocumentType, documentTypes), this$0.m41300d(identificationStatusState, currentLocale, currentDocumentType, identificationDebugResponse)});
        return listOfNotNull;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m41302b(final ZV1 identificationStatusState, final Locale currentLocale, final IdentificationDocumentType currentDocumentType, final IdentificationDebugResponse identificationDebugResponse, final Set<? extends IdentificationDocumentType> documentTypes) {
        Intrinsics.checkNotNullParameter(identificationStatusState, "identificationStatusState");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Intrinsics.checkNotNullParameter(currentDocumentType, "currentDocumentType");
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: eT1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m41301c;
                m41301c = C40951fT1.m41301c(C40951fT1.this, identificationStatusState, currentLocale, currentDocumentType, documentTypes, identificationDebugResponse);
                return m41301c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…ugResponse)\n      )\n    }");
        return m33161E;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3023H6 m41300d(ZV1 zv1, Locale locale, IdentificationDocumentType identificationDocumentType, IdentificationDebugResponse identificationDebugResponse) {
        User mo76584a;
        boolean z;
        List mutableListOf;
        String str;
        List<String> services;
        Object firstOrNull;
        if (zv1.m73012b().getStatus() == IdentificationStatus.PENDING || identificationDebugResponse == null || (mo76584a = this.f80192c.mo76584a()) == null) {
            return null;
        }
        IdentificationIntentPermissionStatus m73012b = zv1.m73012b();
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "currentCountryCode.country");
        IdentificationAcceptableMethod acceptableMethod = m73012b.acceptableMethod(country, identificationDocumentType, C43341jV1.f92777m.m30445a());
        if (C33792Ji1.m99933c(mo76584a, this.f80193d, this.f80191b)) {
            if (acceptableMethod != null && (services = acceptableMethod.getServices()) != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) services);
                str = (String) firstOrNull;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "bird_scan_test")) {
                z = true;
                if (z) {
                    return null;
                }
                C2637G6 c2637g6 = new C2637G6(this.f80190a.getString(C45871nl4.identification_test_description), C42293hj4.item_debug_header, false, 4, null);
                int i = C45871nl4.identification_test_user_age_years;
                int i2 = C48193rg4.ic_chevron_right;
                C42137hT1 c42137hT1 = new C42137hT1(i, i2, new C41672gg6(identificationDebugResponse.getUserAge()));
                int i3 = C42293hj4.item_debug;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(c42137hT1, i3, false, 4, null), new C2637G6(new C42137hT1(C45871nl4.identification_test_expiration_days, i2, new C49988ui1(identificationDebugResponse.getExpirationDays())), i3, false, 4, null), new C2637G6(new C42137hT1(C45871nl4.identification_test_score, i2, new C37342Ym5(identificationDebugResponse.getScore())), i3, false, 4, null), new C2637G6(new C42137hT1(C45871nl4.identification_test_ingestion_result, i2, new Y12(identificationDebugResponse.getIngestionResult())), i3, false, 4, null), new C2637G6(new C42137hT1(C45871nl4.identification_test_seconds_to_result, i2, new C34102Kq5(identificationDebugResponse.getSecondsToResult())), i3, false, 4, null));
                return new C3023H6(mutableListOf, c2637g6, null, 4, null);
            }
        }
        z = false;
        if (z) {
        }
    }

    /* renamed from: e */
    public final C3023H6 m41299e(ZV1 zv1, Locale locale, IdentificationDocumentType identificationDocumentType, Set<? extends IdentificationDocumentType> set) {
        int collectionSizeOrDefault;
        List mutableListOf;
        if (zv1.m73012b().getStatus() == IdentificationStatus.PENDING) {
            return null;
        }
        IdentificationIntentPermissionStatus m73012b = zv1.m73012b();
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "currentCountryCode.country");
        if (!m73012b.allowedDocumentTypes(country, C43341jV1.f92777m.m30445a()).contains(identificationDocumentType)) {
            this.f80190a.getString(C45871nl4.identification_document_type_invalid_selection);
        }
        C2637G6 c2637g6 = new C2637G6(this.f80190a.getString(C45871nl4.identification_document_type_title), C42293hj4.item_selector_header, false, 4, null);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = set.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                IdentificationDocumentType identificationDocumentType2 = (IdentificationDocumentType) it.next();
                String m99932d = C33792Ji1.m99932d(identificationDocumentType2, this.f80190a);
                if (identificationDocumentType2 == identificationDocumentType) {
                    z = true;
                }
                arrayList.add(new C2637G6(new C42164hW1(m99932d, null, 0, 0, TuplesKt.m28425to(identificationDocumentType2, Boolean.valueOf(z))), C42293hj4.item_document_type, false, 4, null));
            } else {
                C2637G6[] c2637g6Arr = (C2637G6[]) arrayList.toArray(new C2637G6[0]);
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(Arrays.copyOf(c2637g6Arr, c2637g6Arr.length));
                return new C3023H6(mutableListOf, c2637g6, null, 4, null);
            }
        }
    }

    /* renamed from: f */
    public final C3023H6 m41298f(ZV1 zv1, Locale locale) {
        boolean z;
        List mutableListOf;
        String str = null;
        if (zv1.m73012b().getStatus() == IdentificationStatus.PENDING) {
            return null;
        }
        Set<String> allowedCountryCodes = zv1.m73012b().allowedCountryCodes(C43341jV1.f92777m.m30445a());
        if (allowedCountryCodes != null && !allowedCountryCodes.contains(locale.getCountry())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = this.f80190a.getString(C45871nl4.identification_country_invalid_selection, locale.getDisplayCountry());
        }
        C2637G6 c2637g6 = new C2637G6(this.f80190a.getString(C45871nl4.identification_country_title), C42293hj4.item_selector_header, false, 4, null);
        String displayCountry = locale.getDisplayCountry();
        Intrinsics.checkNotNullExpressionValue(displayCountry, "currentLocale.displayCountry");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C42164hW1(displayCountry, str, C48193rg4.ic_location_pin, C48193rg4.ic_chevron_right, locale), C42293hj4.item_selector, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }
}
