package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u008d\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u000207J\t\u00108\u001a\u000209HÖ\u0001J\u000e\u0010:\u001a\u0002002\u0006\u00103\u001a\u000204J\t\u0010;\u001a\u00020\u0005HÖ\u0001J\u0018\u0010<\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006>²\u0006\u0012\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010@X\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "", "identificationDocumentType", "Lco/bird/android/model/identification/IdentificationDocumentType;", "idNumber", "", "firstName", "middleName", "lastName", "issueDate", "Lorg/joda/time/DateTime;", "expirationDate", "dateOfBirth", "gender", "Lco/bird/android/model/identification/IdentificationGender;", "nationality", "Ljava/util/Locale;", "issuingAuthority", "(Lco/bird/android/model/identification/IdentificationDocumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/identification/IdentificationGender;Ljava/util/Locale;Ljava/lang/String;)V", "getDateOfBirth", "()Lorg/joda/time/DateTime;", "getExpirationDate", "getFirstName", "()Ljava/lang/String;", "getGender", "()Lco/bird/android/model/identification/IdentificationGender;", "getIdNumber", "getIdentificationDocumentType", "()Lco/bird/android/model/identification/IdentificationDocumentType;", "getIssueDate", "getIssuingAuthority", "getLastName", "getMiddleName", "getNationality", "()Ljava/util/Locale;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "formatForSubmission", "acceptableManualEntry", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "getValueForField", "field", "Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "hashCode", "", "isValid", "toString", "updateForm", "value", "model_release", "allowedIssuingAuthorities", ""}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIdentificationManualEntryFormData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormData.kt\nco/bird/android/model/identification/IdentificationManualEntryFormData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
/* loaded from: classes4.dex */
public final class IdentificationManualEntryFormData {
    @JsonProperty("date_of_birth")
    @InterfaceC41208ft5("date_of_birth")
    private final DateTime dateOfBirth;
    @JsonProperty("expiration")
    @InterfaceC41208ft5("expiration")
    private final DateTime expirationDate;
    @JsonProperty("first_name")
    @InterfaceC41208ft5("first_name")
    private final String firstName;
    @JsonProperty("gender")
    @InterfaceC41208ft5("gender")
    private final IdentificationGender gender;
    @JsonProperty("id_number")
    @InterfaceC41208ft5("id_number")
    private final String idNumber;
    @JsonProperty("document_type")
    @InterfaceC41208ft5("document_type")
    private final IdentificationDocumentType identificationDocumentType;
    @JsonProperty("issued_at")
    @InterfaceC41208ft5("issued_at")
    private final DateTime issueDate;
    @JsonProperty("issuing_authority")
    @InterfaceC41208ft5("issuing_authority")
    private final String issuingAuthority;
    @JsonProperty("last_name")
    @InterfaceC41208ft5("last_name")
    private final String lastName;
    @JsonProperty("middle_name")
    @InterfaceC41208ft5("middle_name")
    private final String middleName;
    @JsonProperty("nationality")
    @InterfaceC41208ft5("nationality")
    private final Locale nationality;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationManualEntryFormField.values().length];
            try {
                iArr[IdentificationManualEntryFormField.DOCUMENT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationManualEntryFormField.ID_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationManualEntryFormField.FIRST_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationManualEntryFormField.MIDDLE_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentificationManualEntryFormField.LAST_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentificationManualEntryFormField.ISSUE_DATE.ordinal()] = 6;
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
                iArr[IdentificationManualEntryFormField.GENDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdentificationManualEntryFormField.NATIONALITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdentificationManualEntryFormField.ISSUING_AUTHORITY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IdentificationManualEntryFormData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ IdentificationManualEntryFormData copy$default(IdentificationManualEntryFormData identificationManualEntryFormData, IdentificationDocumentType identificationDocumentType, String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, IdentificationGender identificationGender, Locale locale, String str5, int i, Object obj) {
        return identificationManualEntryFormData.copy((i & 1) != 0 ? identificationManualEntryFormData.identificationDocumentType : identificationDocumentType, (i & 2) != 0 ? identificationManualEntryFormData.idNumber : str, (i & 4) != 0 ? identificationManualEntryFormData.firstName : str2, (i & 8) != 0 ? identificationManualEntryFormData.middleName : str3, (i & 16) != 0 ? identificationManualEntryFormData.lastName : str4, (i & 32) != 0 ? identificationManualEntryFormData.issueDate : dateTime, (i & 64) != 0 ? identificationManualEntryFormData.expirationDate : dateTime2, (i & 128) != 0 ? identificationManualEntryFormData.dateOfBirth : dateTime3, (i & 256) != 0 ? identificationManualEntryFormData.gender : identificationGender, (i & 512) != 0 ? identificationManualEntryFormData.nationality : locale, (i & 1024) != 0 ? identificationManualEntryFormData.issuingAuthority : str5);
    }

    private static final List<String> isValid$lambda$11(Lazy<? extends List<String>> lazy) {
        return lazy.getValue();
    }

    public final IdentificationDocumentType component1() {
        return this.identificationDocumentType;
    }

    public final Locale component10() {
        return this.nationality;
    }

    public final String component11() {
        return this.issuingAuthority;
    }

    public final String component2() {
        return this.idNumber;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.middleName;
    }

    public final String component5() {
        return this.lastName;
    }

    public final DateTime component6() {
        return this.issueDate;
    }

    public final DateTime component7() {
        return this.expirationDate;
    }

    public final DateTime component8() {
        return this.dateOfBirth;
    }

    public final IdentificationGender component9() {
        return this.gender;
    }

    public final IdentificationManualEntryFormData copy(IdentificationDocumentType identificationDocumentType, String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, IdentificationGender identificationGender, Locale locale, String str5) {
        return new IdentificationManualEntryFormData(identificationDocumentType, str, str2, str3, str4, dateTime, dateTime2, dateTime3, identificationGender, locale, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationManualEntryFormData) {
            IdentificationManualEntryFormData identificationManualEntryFormData = (IdentificationManualEntryFormData) obj;
            return this.identificationDocumentType == identificationManualEntryFormData.identificationDocumentType && Intrinsics.areEqual(this.idNumber, identificationManualEntryFormData.idNumber) && Intrinsics.areEqual(this.firstName, identificationManualEntryFormData.firstName) && Intrinsics.areEqual(this.middleName, identificationManualEntryFormData.middleName) && Intrinsics.areEqual(this.lastName, identificationManualEntryFormData.lastName) && Intrinsics.areEqual(this.issueDate, identificationManualEntryFormData.issueDate) && Intrinsics.areEqual(this.expirationDate, identificationManualEntryFormData.expirationDate) && Intrinsics.areEqual(this.dateOfBirth, identificationManualEntryFormData.dateOfBirth) && this.gender == identificationManualEntryFormData.gender && Intrinsics.areEqual(this.nationality, identificationManualEntryFormData.nationality) && Intrinsics.areEqual(this.issuingAuthority, identificationManualEntryFormData.issuingAuthority);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentificationManualEntryFormData formatForSubmission(IdentificationAcceptableManualEntry acceptableManualEntry) {
        DateTime dateTime;
        DateTime dateTime2;
        DateTime dateTime3;
        String str;
        Intrinsics.checkNotNullParameter(acceptableManualEntry, "acceptableManualEntry");
        IdentificationDocumentType identificationDocumentType = this.identificationDocumentType;
        IdentificationDocumentType identificationDocumentType2 = IdentificationDocumentType.EMIRATES_ID;
        if (identificationDocumentType == identificationDocumentType2) {
            identificationDocumentType = IdentificationDocumentType.ID_CARD;
        }
        IdentificationDocumentType identificationDocumentType3 = identificationDocumentType;
        DateTime dateTime4 = this.dateOfBirth;
        if (dateTime4 == null) {
            Integer implicitAgeYears = acceptableManualEntry.getImplicitAgeYears();
            if (implicitAgeYears != null) {
                dateTime4 = DateTime.now().minusYears(implicitAgeYears.intValue());
            } else {
                dateTime = null;
                dateTime2 = this.expirationDate;
                if (dateTime2 == null) {
                    Integer implicitExpirationDays = acceptableManualEntry.getImplicitExpirationDays();
                    if (implicitExpirationDays != null) {
                        dateTime2 = DateTime.now().plusDays(implicitExpirationDays.intValue());
                    } else {
                        dateTime3 = null;
                        if (this.identificationDocumentType == identificationDocumentType2) {
                            str = "UAE";
                        } else {
                            str = this.issuingAuthority;
                        }
                        return copy$default(this, identificationDocumentType3, null, null, null, null, null, dateTime3, dateTime, null, null, str, 830, null);
                    }
                }
                dateTime3 = dateTime2;
                if (this.identificationDocumentType == identificationDocumentType2) {
                }
                return copy$default(this, identificationDocumentType3, null, null, null, null, null, dateTime3, dateTime, null, null, str, 830, null);
            }
        }
        dateTime = dateTime4;
        dateTime2 = this.expirationDate;
        if (dateTime2 == null) {
        }
        dateTime3 = dateTime2;
        if (this.identificationDocumentType == identificationDocumentType2) {
        }
        return copy$default(this, identificationDocumentType3, null, null, null, null, null, dateTime3, dateTime, null, null, str, 830, null);
    }

    public final DateTime getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final DateTime getExpirationDate() {
        return this.expirationDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final IdentificationGender getGender() {
        return this.gender;
    }

    public final String getIdNumber() {
        return this.idNumber;
    }

    public final IdentificationDocumentType getIdentificationDocumentType() {
        return this.identificationDocumentType;
    }

    public final DateTime getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final Locale getNationality() {
        return this.nationality;
    }

    public final Object getValueForField(IdentificationManualEntryFormField field) {
        Intrinsics.checkNotNullParameter(field, "field");
        switch (WhenMappings.$EnumSwitchMapping$0[field.ordinal()]) {
            case 1:
                return this.identificationDocumentType;
            case 2:
                return this.idNumber;
            case 3:
                return this.firstName;
            case 4:
                return this.middleName;
            case 5:
                return this.lastName;
            case 6:
                return this.issueDate;
            case 7:
                return this.expirationDate;
            case 8:
                return this.dateOfBirth;
            case 9:
                return this.gender;
            case 10:
                return this.nationality;
            case 11:
                return this.issuingAuthority;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public int hashCode() {
        IdentificationDocumentType identificationDocumentType = this.identificationDocumentType;
        int hashCode = (identificationDocumentType == null ? 0 : identificationDocumentType.hashCode()) * 31;
        String str = this.idNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.issueDate;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.expirationDate;
        int hashCode7 = (hashCode6 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.dateOfBirth;
        int hashCode8 = (hashCode7 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        IdentificationGender identificationGender = this.gender;
        int hashCode9 = (hashCode8 + (identificationGender == null ? 0 : identificationGender.hashCode())) * 31;
        Locale locale = this.nationality;
        int hashCode10 = (hashCode9 + (locale == null ? 0 : locale.hashCode())) * 31;
        String str5 = this.issuingAuthority;
        return hashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r2 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isValid(IdentificationAcceptableManualEntry acceptableManualEntry) {
        Regex regex;
        Lazy lazy;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean contains;
        boolean z8;
        boolean isBlank;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean isBlank2;
        boolean isBlank3;
        Intrinsics.checkNotNullParameter(acceptableManualEntry, "acceptableManualEntry");
        String requireIdNumberRegex = acceptableManualEntry.getRequireIdNumberRegex();
        if (requireIdNumberRegex != null) {
            regex = new Regex(requireIdNumberRegex);
        } else {
            regex = null;
        }
        lazy = LazyKt__LazyJVMKt.lazy(new C16255xfee7a1b7(acceptableManualEntry));
        if (acceptableManualEntry.getRequireName()) {
            String str2 = this.firstName;
            if (str2 != null) {
                isBlank3 = StringsKt__StringsJVMKt.isBlank(str2);
                if (!isBlank3) {
                    z12 = true;
                    if (z12) {
                        String str3 = this.lastName;
                        if (str3 != null) {
                            isBlank2 = StringsKt__StringsJVMKt.isBlank(str3);
                            if (!isBlank2) {
                                z13 = true;
                            }
                        }
                        z13 = false;
                    }
                    z = false;
                    if (acceptableManualEntry.getRequireIssueDate()) {
                        DateTime dateTime = this.issueDate;
                        if (dateTime != null && dateTime.isBeforeNow()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            z2 = false;
                            if (acceptableManualEntry.getImplicitExpirationDays() == null) {
                                DateTime dateTime2 = this.expirationDate;
                                if (dateTime2 != null && dateTime2.isAfterNow()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    z3 = false;
                                    if (acceptableManualEntry.getImplicitAgeYears() == null) {
                                        DateTime dateTime3 = this.dateOfBirth;
                                        if (dateTime3 != null && dateTime3.isBeforeNow()) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!z9) {
                                            z4 = false;
                                            str = this.idNumber;
                                            if (str != null) {
                                                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                                                if (!isBlank) {
                                                    z5 = true;
                                                    if (!z5 || !z || !z2 || !z3 || !z4) {
                                                        return false;
                                                    }
                                                    if (acceptableManualEntry.getRequireGender()) {
                                                        IdentificationGender identificationGender = this.gender;
                                                        if (identificationGender != null && !identificationGender.equals(IdentificationGender.UNKNOWN)) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        if (!z8) {
                                                            return false;
                                                        }
                                                    }
                                                    if (acceptableManualEntry.getRequireNationality() && this.nationality == null) {
                                                        return false;
                                                    }
                                                    List<String> isValid$lambda$11 = isValid$lambda$11(lazy);
                                                    if (isValid$lambda$11 != null && !isValid$lambda$11.isEmpty()) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    if (!z6) {
                                                        List<String> isValid$lambda$112 = isValid$lambda$11(lazy);
                                                        if (isValid$lambda$112 != null) {
                                                            contains = CollectionsKt___CollectionsKt.contains(isValid$lambda$112, this.issuingAuthority);
                                                            if (contains) {
                                                                z7 = true;
                                                                if (!z7) {
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                        z7 = false;
                                                        if (!z7) {
                                                        }
                                                    }
                                                    if (regex != null && !regex.containsMatchIn(this.idNumber)) {
                                                        return false;
                                                    }
                                                    return true;
                                                }
                                            }
                                            z5 = false;
                                            return !z5 ? false : false;
                                        }
                                    }
                                    z4 = true;
                                    str = this.idNumber;
                                    if (str != null) {
                                    }
                                    z5 = false;
                                    if (!z5) {
                                    }
                                }
                            }
                            z3 = true;
                            if (acceptableManualEntry.getImplicitAgeYears() == null) {
                            }
                            z4 = true;
                            str = this.idNumber;
                            if (str != null) {
                            }
                            z5 = false;
                            if (!z5) {
                            }
                        }
                    }
                    z2 = true;
                    if (acceptableManualEntry.getImplicitExpirationDays() == null) {
                    }
                    z3 = true;
                    if (acceptableManualEntry.getImplicitAgeYears() == null) {
                    }
                    z4 = true;
                    str = this.idNumber;
                    if (str != null) {
                    }
                    z5 = false;
                    if (!z5) {
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            z = false;
            if (acceptableManualEntry.getRequireIssueDate()) {
            }
            z2 = true;
            if (acceptableManualEntry.getImplicitExpirationDays() == null) {
            }
            z3 = true;
            if (acceptableManualEntry.getImplicitAgeYears() == null) {
            }
            z4 = true;
            str = this.idNumber;
            if (str != null) {
            }
            z5 = false;
            if (!z5) {
            }
        }
        z = true;
        if (acceptableManualEntry.getRequireIssueDate()) {
        }
        z2 = true;
        if (acceptableManualEntry.getImplicitExpirationDays() == null) {
        }
        z3 = true;
        if (acceptableManualEntry.getImplicitAgeYears() == null) {
        }
        z4 = true;
        str = this.idNumber;
        if (str != null) {
        }
        z5 = false;
        if (!z5) {
        }
    }

    public String toString() {
        IdentificationDocumentType identificationDocumentType = this.identificationDocumentType;
        String str = this.idNumber;
        String str2 = this.firstName;
        String str3 = this.middleName;
        String str4 = this.lastName;
        DateTime dateTime = this.issueDate;
        DateTime dateTime2 = this.expirationDate;
        DateTime dateTime3 = this.dateOfBirth;
        IdentificationGender identificationGender = this.gender;
        Locale locale = this.nationality;
        String str5 = this.issuingAuthority;
        return "IdentificationManualEntryFormData(identificationDocumentType=" + identificationDocumentType + ", idNumber=" + str + ", firstName=" + str2 + ", middleName=" + str3 + ", lastName=" + str4 + ", issueDate=" + dateTime + ", expirationDate=" + dateTime2 + ", dateOfBirth=" + dateTime3 + ", gender=" + identificationGender + ", nationality=" + locale + ", issuingAuthority=" + str5 + ")";
    }

    public final IdentificationManualEntryFormData updateForm(IdentificationManualEntryFormField field, Object obj) {
        Intrinsics.checkNotNullParameter(field, "field");
        switch (WhenMappings.$EnumSwitchMapping$0[field.ordinal()]) {
            case 1:
                if (obj != null ? obj instanceof IdentificationDocumentType : true) {
                    return copy$default(this, (IdentificationDocumentType) obj, null, null, null, null, null, null, null, null, null, null, 2046, null);
                }
                throw new IllegalArgumentException((obj + " should be a IdentificationDocumentType").toString());
            case 2:
                if (obj != null ? obj instanceof String : true) {
                    return copy$default(this, null, (String) obj, null, null, null, null, null, null, null, null, null, 2045, null);
                }
                throw new IllegalArgumentException((obj + " should be a String").toString());
            case 3:
                if (obj != null ? obj instanceof String : true) {
                    return copy$default(this, null, null, (String) obj, null, null, null, null, null, null, null, null, 2043, null);
                }
                throw new IllegalArgumentException((obj + " should be a String").toString());
            case 4:
                if (obj != null ? obj instanceof String : true) {
                    return copy$default(this, null, null, null, (String) obj, null, null, null, null, null, null, null, 2039, null);
                }
                throw new IllegalArgumentException((obj + " should be a String").toString());
            case 5:
                if (obj != null ? obj instanceof String : true) {
                    return copy$default(this, null, null, null, null, (String) obj, null, null, null, null, null, null, 2031, null);
                }
                throw new IllegalArgumentException((obj + " should be a String").toString());
            case 6:
                if (obj != null ? obj instanceof DateTime : true) {
                    return copy$default(this, null, null, null, null, null, (DateTime) obj, null, null, null, null, null, 2015, null);
                }
                throw new IllegalArgumentException((obj + " should be a DateTime").toString());
            case 7:
                if (obj != null ? obj instanceof DateTime : true) {
                    return copy$default(this, null, null, null, null, null, null, (DateTime) obj, null, null, null, null, 1983, null);
                }
                throw new IllegalArgumentException((obj + " should be a DateTime").toString());
            case 8:
                if (obj != null ? obj instanceof DateTime : true) {
                    return copy$default(this, null, null, null, null, null, null, null, (DateTime) obj, null, null, null, 1919, null);
                }
                throw new IllegalArgumentException((obj + " should be a DateTime").toString());
            case 9:
                if (obj != null ? obj instanceof IdentificationGender : true) {
                    return copy$default(this, null, null, null, null, null, null, null, null, (IdentificationGender) obj, null, null, 1791, null);
                }
                throw new IllegalArgumentException((obj + " should be a IdentificationGender").toString());
            case 10:
                if (obj != null ? obj instanceof Locale : true) {
                    return copy$default(this, null, null, null, null, null, null, null, null, null, (Locale) obj, null, 1535, null);
                }
                throw new IllegalArgumentException((obj + " should be a Locale").toString());
            case 11:
                if (obj != null ? obj instanceof String : true) {
                    return copy$default(this, null, null, null, null, null, null, null, null, null, null, (String) obj, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
                }
                throw new IllegalArgumentException((obj + " should be a String").toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public IdentificationManualEntryFormData(IdentificationDocumentType identificationDocumentType, String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, IdentificationGender identificationGender, Locale locale, String str5) {
        this.identificationDocumentType = identificationDocumentType;
        this.idNumber = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.issueDate = dateTime;
        this.expirationDate = dateTime2;
        this.dateOfBirth = dateTime3;
        this.gender = identificationGender;
        this.nationality = locale;
        this.issuingAuthority = str5;
    }

    public /* synthetic */ IdentificationManualEntryFormData(IdentificationDocumentType identificationDocumentType, String str, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, IdentificationGender identificationGender, Locale locale, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : identificationDocumentType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : dateTime, (i & 64) != 0 ? null : dateTime2, (i & 128) != 0 ? null : dateTime3, (i & 256) != 0 ? null : identificationGender, (i & 512) != 0 ? null : locale, (i & 1024) == 0 ? str5 : null);
    }
}
