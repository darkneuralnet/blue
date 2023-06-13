package co.bird.android.model.identification;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "", "(Ljava/lang/String;I)V", "toStringResId", "", "DOCUMENT_TYPE", "ID_NUMBER", "FIRST_NAME", "MIDDLE_NAME", "LAST_NAME", "ISSUE_DATE", "EXPIRATION_DATE", "DATE_OF_BIRTH", "GENDER", "NATIONALITY", "ISSUING_AUTHORITY", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum IdentificationManualEntryFormField {
    DOCUMENT_TYPE,
    ID_NUMBER,
    FIRST_NAME,
    MIDDLE_NAME,
    LAST_NAME,
    ISSUE_DATE,
    EXPIRATION_DATE,
    DATE_OF_BIRTH,
    GENDER,
    NATIONALITY,
    ISSUING_AUTHORITY;

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

    public final int toStringResId() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return C45871nl4.identification_document_type_title;
            case 2:
                return C45871nl4.manual_entry_id_number;
            case 3:
                return C45871nl4.tax_information_field_first_name;
            case 4:
                return C45871nl4.manual_entry_middle_name;
            case 5:
                return C45871nl4.tax_information_field_last_name;
            case 6:
                return C45871nl4.manual_entry_issue_date;
            case 7:
                return C45871nl4.manual_entry_expiration_date;
            case 8:
                return C45871nl4.driver_license_form_birthdate_hint;
            case 9:
                return C45871nl4.manual_entry_gender;
            case 10:
                return C45871nl4.manual_entry_nationality;
            case 11:
                return C45871nl4.manual_entry_issuing_authority;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
