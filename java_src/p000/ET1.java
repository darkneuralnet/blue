package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import co.bird.android.model.identification.IdentificationManualEntryFormField;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationManualEntryFormField;", "", "b", "Landroid/view/View;", "", C17296a.f69688o, "co.bird.android.feature.identification"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ET1 */
/* loaded from: classes3.dex */
public final class ET1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ET1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1838a {
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

    /* renamed from: a */
    public static final void m108944a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.requestFocus()) {
            Object systemService = view.getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }
    }

    /* renamed from: b */
    public static final int m108943b(IdentificationManualEntryFormField identificationManualEntryFormField) {
        Intrinsics.checkNotNullParameter(identificationManualEntryFormField, "<this>");
        switch (C1838a.$EnumSwitchMapping$0[identificationManualEntryFormField.ordinal()]) {
            case 1:
                return C49981uh4.form_field_doc_type;
            case 2:
                return C49981uh4.form_field_id_number;
            case 3:
                return C49981uh4.form_field_first_name;
            case 4:
                return C49981uh4.form_field_middle_name;
            case 5:
                return C49981uh4.form_field_last_name;
            case 6:
                return C49981uh4.form_field_issue_date;
            case 7:
                return C49981uh4.form_field_expiration;
            case 8:
                return C49981uh4.form_field_date_of_birth;
            case 9:
                return C49981uh4.form_field_gender;
            case 10:
                return C49981uh4.form_field_nationality;
            case 11:
                return C49981uh4.form_field_issuing_authority;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
