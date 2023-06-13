package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.identification.IdentificationAcceptableManualEntry;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationGender;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import co.bird.android.model.identification.IdentificationManualEntryFormField;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, m28432d2 = {"LmU1;", "", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "acceptableManualEntry", "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "currentFormData", "", "LH6;", C17296a.f69688o, "Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "formField", "c", "", "e", "Lco/bird/android/model/identification/IdentificationDocumentType;", "currentDocumentType", "b", "Ljava/util/Locale;", "currentLocale", "g", "Lco/bird/android/model/identification/IdentificationGender;", "currentGender", "f", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "LG6;", "item", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationManualEntryFormConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormConverter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
/* renamed from: mU1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45111mU1 {

    /* renamed from: a */
    public final Context f98086a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mU1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26105a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationManualEntryFormField.values().length];
            try {
                iArr[IdentificationManualEntryFormField.ID_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationManualEntryFormField.FIRST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationManualEntryFormField.MIDDLE_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationManualEntryFormField.LAST_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentificationManualEntryFormField.ISSUE_DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentificationManualEntryFormField.ISSUING_AUTHORITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdentificationManualEntryFormField.EXPIRATION_DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdentificationManualEntryFormField.DATE_OF_BIRTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdentificationManualEntryFormField.DOCUMENT_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdentificationManualEntryFormField.GENDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdentificationManualEntryFormField.NATIONALITY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LG6;", "b", "()LG6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mU1$b */
    /* loaded from: classes3.dex */
    public static final class C26106b extends Lambda implements Function0<C2637G6> {

        /* renamed from: g */
        public final /* synthetic */ IdentificationManualEntryFormField f98087g;

        /* renamed from: h */
        public final /* synthetic */ C45111mU1 f98088h;

        /* renamed from: i */
        public final /* synthetic */ IdentificationAcceptableManualEntry f98089i;

        /* renamed from: j */
        public final /* synthetic */ IdentificationManualEntryFormData f98090j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26106b(IdentificationManualEntryFormField identificationManualEntryFormField, C45111mU1 c45111mU1, IdentificationAcceptableManualEntry identificationAcceptableManualEntry, IdentificationManualEntryFormData identificationManualEntryFormData) {
            super(0);
            this.f98087g = identificationManualEntryFormField;
            this.f98088h = c45111mU1;
            this.f98089i = identificationAcceptableManualEntry;
            this.f98090j = identificationManualEntryFormData;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C2637G6 invoke() {
            IdentificationManualEntryFormField identificationManualEntryFormField = this.f98087g;
            String string = this.f98088h.f98086a.getString(this.f98087g.toStringResId());
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(formField.toStringResId())");
            return new C2637G6(new C44509lT1(identificationManualEntryFormField, string, this.f98088h.m25535e(this.f98089i, this.f98090j, this.f98087g), this.f98090j.getValueForField(this.f98087g), false, 16, null), C42293hj4.item_form_edit_text, false, 4, null);
        }
    }

    public C45111mU1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98086a = context;
    }

    /* renamed from: d */
    public static final C2637G6 m25536d(Lazy<C2637G6> lazy) {
        return lazy.getValue();
    }

    /* renamed from: a */
    public final List<C3023H6> m25539a(IdentificationAcceptableManualEntry acceptableManualEntry, IdentificationManualEntryFormData currentFormData) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(acceptableManualEntry, "acceptableManualEntry");
        Intrinsics.checkNotNullParameter(currentFormData, "currentFormData");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m25538b(acceptableManualEntry, currentFormData.getIdentificationDocumentType()), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.FIRST_NAME), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.MIDDLE_NAME), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.LAST_NAME), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.ID_NUMBER), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.ISSUING_AUTHORITY), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.ISSUE_DATE), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.EXPIRATION_DATE), m25537c(acceptableManualEntry, currentFormData, IdentificationManualEntryFormField.DATE_OF_BIRTH), m25534f(acceptableManualEntry, currentFormData.getGender()), m25533g(acceptableManualEntry, currentFormData.getNationality())});
        return listOfNotNull;
    }

    /* renamed from: b */
    public final C3023H6 m25538b(IdentificationAcceptableManualEntry identificationAcceptableManualEntry, IdentificationDocumentType identificationDocumentType) {
        List plus;
        boolean z;
        List mutableListOf;
        Object firstOrNull;
        Object firstOrNull2;
        String str = null;
        if (identificationDocumentType == null) {
            List<IdentificationDocumentType> allowedSpecialDocumentTypes = identificationAcceptableManualEntry.getAllowedSpecialDocumentTypes();
            if (allowedSpecialDocumentTypes != null) {
                firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) allowedSpecialDocumentTypes);
                identificationDocumentType = (IdentificationDocumentType) firstOrNull2;
            } else {
                identificationDocumentType = null;
            }
            if (identificationDocumentType == null) {
                List<IdentificationDocumentType> allowedDocumentTypes = identificationAcceptableManualEntry.getAllowedDocumentTypes();
                if (allowedDocumentTypes != null) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) allowedDocumentTypes);
                    identificationDocumentType = (IdentificationDocumentType) firstOrNull;
                } else {
                    identificationDocumentType = null;
                }
                if (identificationDocumentType == null) {
                    identificationDocumentType = IdentificationDocumentType.DRIVER_LICENSE;
                }
            }
        }
        IdentificationDocumentType identificationDocumentType2 = identificationDocumentType;
        List<IdentificationDocumentType> allowedSpecialDocumentTypes2 = identificationAcceptableManualEntry.getAllowedSpecialDocumentTypes();
        if (allowedSpecialDocumentTypes2 == null) {
            allowedSpecialDocumentTypes2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List<IdentificationDocumentType> list = allowedSpecialDocumentTypes2;
        List<IdentificationDocumentType> allowedDocumentTypes2 = identificationAcceptableManualEntry.getAllowedDocumentTypes();
        if (allowedDocumentTypes2 == null) {
            allowedDocumentTypes2 = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) allowedDocumentTypes2);
        if (!(!plus.isEmpty())) {
            plus = null;
        }
        if (plus != null && !plus.contains(identificationDocumentType2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = this.f98086a.getString(C45871nl4.identification_document_type_invalid_selection);
        }
        C2637G6 c2637g6 = new C2637G6(this.f98086a.getString(C45871nl4.identification_document_type_title), C42293hj4.item_selector_header, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C45704nU1(C33792Ji1.m99932d(identificationDocumentType2, this.f98086a), str, Integer.valueOf(C48193rg4.ic_chevron_right), identificationDocumentType2, IdentificationManualEntryFormField.DOCUMENT_TYPE), C42293hj4.item_manual_entry_selector, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public final C3023H6 m25537c(IdentificationAcceptableManualEntry identificationAcceptableManualEntry, IdentificationManualEntryFormData identificationManualEntryFormData, IdentificationManualEntryFormField identificationManualEntryFormField) {
        Lazy lazy;
        C2637G6 m25536d;
        List mutableListOf;
        lazy = LazyKt__LazyJVMKt.lazy(new C26106b(identificationManualEntryFormField, this, identificationAcceptableManualEntry, identificationManualEntryFormData));
        switch (C26105a.$EnumSwitchMapping$0[identificationManualEntryFormField.ordinal()]) {
            case 1:
                m25536d = m25536d(lazy);
                break;
            case 2:
            case 3:
            case 4:
                if (identificationAcceptableManualEntry.getRequireName()) {
                    m25536d = m25536d(lazy);
                    break;
                }
                m25536d = null;
                break;
            case 5:
                if (identificationAcceptableManualEntry.getRequireIssueDate()) {
                    m25536d = m25536d(lazy);
                    break;
                }
                m25536d = null;
                break;
            case 6:
                if (identificationManualEntryFormData.getIdentificationDocumentType() != IdentificationDocumentType.EMIRATES_ID) {
                    m25536d = m25536d(lazy);
                    break;
                }
                m25536d = null;
                break;
            case 7:
                if (identificationAcceptableManualEntry.getImplicitExpirationDays() == null) {
                    m25536d = m25536d(lazy);
                    break;
                }
                m25536d = null;
                break;
            case 8:
                if (identificationAcceptableManualEntry.getImplicitAgeYears() == null) {
                    m25536d = m25536d(lazy);
                    break;
                }
                m25536d = null;
                break;
            case 9:
            case 10:
            case 11:
                m25536d = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (m25536d == null) {
            return null;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(m25536d);
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r13 == false) goto L28;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m25535e(IdentificationAcceptableManualEntry identificationAcceptableManualEntry, IdentificationManualEntryFormData identificationManualEntryFormData, IdentificationManualEntryFormField identificationManualEntryFormField) {
        Regex regex;
        boolean isBlank;
        boolean isBlank2;
        boolean isBlank3;
        boolean z;
        String joinToString$default;
        boolean contains;
        boolean z2 = true;
        switch (C26105a.$EnumSwitchMapping$0[identificationManualEntryFormField.ordinal()]) {
            case 1:
                String requireIdNumberRegex = identificationAcceptableManualEntry.getRequireIdNumberRegex();
                if (requireIdNumberRegex != null) {
                    regex = new Regex(requireIdNumberRegex);
                } else {
                    regex = null;
                }
                String idNumber = identificationManualEntryFormData.getIdNumber();
                if (regex != null && idNumber != null && !regex.containsMatchIn(idNumber)) {
                    return this.f98086a.getString(C45871nl4.manual_entry_validation_invalid_id);
                }
                if (idNumber != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(idNumber);
                    if (!isBlank) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.required);
            case 2:
                String firstName = identificationManualEntryFormData.getFirstName();
                if (firstName != null) {
                    isBlank2 = StringsKt__StringsJVMKt.isBlank(firstName);
                    if (!isBlank2) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.required);
            case 3:
                return null;
            case 4:
                String lastName = identificationManualEntryFormData.getLastName();
                if (lastName != null) {
                    isBlank3 = StringsKt__StringsJVMKt.isBlank(lastName);
                    if (!isBlank3) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.required);
            case 5:
                DateTime issueDate = identificationManualEntryFormData.getIssueDate();
                if (issueDate == null || issueDate.isAfterNow()) {
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.manual_entry_validation_date_invalid);
            case 6:
                String issuingAuthority = identificationManualEntryFormData.getIssuingAuthority();
                List<String> requireIssuingAuthority = identificationAcceptableManualEntry.getRequireIssuingAuthority();
                if (issuingAuthority == null) {
                    return null;
                }
                if (requireIssuingAuthority != null && !requireIssuingAuthority.contains(issuingAuthority)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(requireIssuingAuthority, ", ", "[", "]", 0, null, null, 56, null);
                return this.f98086a.getString(C45871nl4.manual_entry_validation_valid_authorities_missing, joinToString$default);
            case 7:
                DateTime expirationDate = identificationManualEntryFormData.getExpirationDate();
                if (expirationDate == null || expirationDate.isBeforeNow()) {
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.manual_entry_validation_date_invalid);
            case 8:
                DateTime dateOfBirth = identificationManualEntryFormData.getDateOfBirth();
                if (dateOfBirth == null || dateOfBirth.isAfterNow()) {
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.manual_entry_validation_date_invalid);
            case 9:
                if (identificationManualEntryFormData.getIdentificationDocumentType() != IdentificationDocumentType.UNKNOWN) {
                    List<IdentificationDocumentType> allowedDocumentTypes = identificationAcceptableManualEntry.getAllowedDocumentTypes();
                    if (allowedDocumentTypes != null) {
                        contains = CollectionsKt___CollectionsKt.contains(allowedDocumentTypes, identificationManualEntryFormData.getIdentificationDocumentType());
                        break;
                    }
                    z2 = false;
                    if (!z2) {
                        return null;
                    }
                }
                return this.f98086a.getString(C45871nl4.identification_document_type_invalid_selection);
            case 10:
                if (identificationManualEntryFormData.getGender() != null || !identificationAcceptableManualEntry.getRequireGender()) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.manual_entry_validation_gender_required);
            case 11:
                if (identificationManualEntryFormData.getNationality() != null || !identificationAcceptableManualEntry.getRequireNationality()) {
                    return null;
                }
                return this.f98086a.getString(C45871nl4.manual_entry_validation_nationality_required);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    public final C3023H6 m25534f(IdentificationAcceptableManualEntry identificationAcceptableManualEntry, IdentificationGender identificationGender) {
        int i;
        List mutableListOf;
        String str = null;
        if (!identificationAcceptableManualEntry.getRequireGender()) {
            return null;
        }
        if (identificationGender == null) {
            str = this.f98086a.getString(C45871nl4.manual_entry_validation_gender_required);
        }
        String str2 = str;
        C2637G6[] c2637g6Arr = new C2637G6[1];
        Context context = this.f98086a;
        if (identificationGender != null) {
            i = identificationGender.toStringResId();
        } else {
            i = C45871nl4.manual_entry_gender;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …ntry_gender\n            )");
        c2637g6Arr[0] = new C2637G6(new C45704nU1(string, str2, Integer.valueOf(C48193rg4.ic_chevron_right), identificationGender, IdentificationManualEntryFormField.GENDER), C42293hj4.item_manual_entry_selector, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: g */
    public final C3023H6 m25533g(IdentificationAcceptableManualEntry identificationAcceptableManualEntry, Locale locale) {
        String str;
        List mutableListOf;
        String str2 = null;
        if (!identificationAcceptableManualEntry.getRequireNationality()) {
            return null;
        }
        if (locale == null) {
            str = this.f98086a.getString(C45871nl4.manual_entry_validation_nationality_required);
        } else {
            str = null;
        }
        C2637G6[] c2637g6Arr = new C2637G6[1];
        if (locale != null) {
            str2 = locale.getDisplayCountry();
        }
        if (str2 == null) {
            String string = this.f98086a.getString(C45871nl4.manual_entry_nationality);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…manual_entry_nationality)");
            str2 = string;
        }
        c2637g6Arr[0] = new C2637G6(new C45704nU1(str2, str, Integer.valueOf(C48193rg4.ic_chevron_right), locale, IdentificationManualEntryFormField.NATIONALITY), C42293hj4.item_manual_entry_selector, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
