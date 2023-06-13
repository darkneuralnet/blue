package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"isBlank", "", "Lco/bird/android/model/TaxInformation;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaxInformationKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isBlank(TaxInformation taxInformation) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean isBlank;
        boolean isBlank2;
        boolean isBlank3;
        Intrinsics.checkNotNullParameter(taxInformation, "<this>");
        String firstName = taxInformation.getFirstName();
        if (firstName != null) {
            isBlank3 = StringsKt__StringsJVMKt.isBlank(firstName);
            if (!isBlank3) {
                z = false;
                if (!z) {
                    String lastName = taxInformation.getLastName();
                    if (lastName != null) {
                        isBlank2 = StringsKt__StringsJVMKt.isBlank(lastName);
                        if (!isBlank2) {
                            z2 = false;
                            if (!z2) {
                                String fiscalCode = taxInformation.getFiscalCode();
                                if (fiscalCode != null) {
                                    isBlank = StringsKt__StringsJVMKt.isBlank(fiscalCode);
                                    if (!isBlank) {
                                        z3 = false;
                                        if (!z3) {
                                            return false;
                                        }
                                    }
                                }
                                z3 = true;
                                if (!z3) {
                                }
                            }
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                }
                return true;
            }
        }
        z = true;
        if (!z) {
        }
        return true;
    }
}
