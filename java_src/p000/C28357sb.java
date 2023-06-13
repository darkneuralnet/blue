package p000;

import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, m28432d2 = {"Ljava/util/HashMap;", "LRu;", "", "Lkotlin/collections/HashMap;", C17296a.f69688o, "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(LRu;)Ljava/lang/String;", "getAndroidType$annotations", "(LRu;)V", "androidType", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* renamed from: sb */
/* loaded from: classes.dex */
public final class C28357sb {

    /* renamed from: a */
    public static final HashMap<EnumC7283Ru, String> f109020a;

    static {
        HashMap<EnumC7283Ru, String> hashMapOf;
        hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m28425to(EnumC7283Ru.EmailAddress, "emailAddress"), TuplesKt.m28425to(EnumC7283Ru.Username, "username"), TuplesKt.m28425to(EnumC7283Ru.Password, "password"), TuplesKt.m28425to(EnumC7283Ru.NewUsername, "newUsername"), TuplesKt.m28425to(EnumC7283Ru.NewPassword, "newPassword"), TuplesKt.m28425to(EnumC7283Ru.PostalAddress, "postalAddress"), TuplesKt.m28425to(EnumC7283Ru.PostalCode, "postalCode"), TuplesKt.m28425to(EnumC7283Ru.CreditCardNumber, "creditCardNumber"), TuplesKt.m28425to(EnumC7283Ru.CreditCardSecurityCode, "creditCardSecurityCode"), TuplesKt.m28425to(EnumC7283Ru.CreditCardExpirationDate, "creditCardExpirationDate"), TuplesKt.m28425to(EnumC7283Ru.CreditCardExpirationMonth, "creditCardExpirationMonth"), TuplesKt.m28425to(EnumC7283Ru.CreditCardExpirationYear, "creditCardExpirationYear"), TuplesKt.m28425to(EnumC7283Ru.CreditCardExpirationDay, "creditCardExpirationDay"), TuplesKt.m28425to(EnumC7283Ru.AddressCountry, "addressCountry"), TuplesKt.m28425to(EnumC7283Ru.AddressRegion, "addressRegion"), TuplesKt.m28425to(EnumC7283Ru.AddressLocality, "addressLocality"), TuplesKt.m28425to(EnumC7283Ru.AddressStreet, "streetAddress"), TuplesKt.m28425to(EnumC7283Ru.AddressAuxiliaryDetails, "extendedAddress"), TuplesKt.m28425to(EnumC7283Ru.PostalCodeExtended, "extendedPostalCode"), TuplesKt.m28425to(EnumC7283Ru.PersonFullName, "personName"), TuplesKt.m28425to(EnumC7283Ru.PersonFirstName, "personGivenName"), TuplesKt.m28425to(EnumC7283Ru.PersonLastName, "personFamilyName"), TuplesKt.m28425to(EnumC7283Ru.PersonMiddleName, "personMiddleName"), TuplesKt.m28425to(EnumC7283Ru.PersonMiddleInitial, "personMiddleInitial"), TuplesKt.m28425to(EnumC7283Ru.PersonNamePrefix, "personNamePrefix"), TuplesKt.m28425to(EnumC7283Ru.PersonNameSuffix, "personNameSuffix"), TuplesKt.m28425to(EnumC7283Ru.PhoneNumber, "phoneNumber"), TuplesKt.m28425to(EnumC7283Ru.PhoneNumberDevice, "phoneNumberDevice"), TuplesKt.m28425to(EnumC7283Ru.PhoneCountryCode, "phoneCountryCode"), TuplesKt.m28425to(EnumC7283Ru.PhoneNumberNational, "phoneNational"), TuplesKt.m28425to(EnumC7283Ru.Gender, "gender"), TuplesKt.m28425to(EnumC7283Ru.BirthDateFull, "birthDateFull"), TuplesKt.m28425to(EnumC7283Ru.BirthDateDay, "birthDateDay"), TuplesKt.m28425to(EnumC7283Ru.BirthDateMonth, "birthDateMonth"), TuplesKt.m28425to(EnumC7283Ru.BirthDateYear, "birthDateYear"), TuplesKt.m28425to(EnumC7283Ru.SmsOtpCode, "smsOTPCode"));
        f109020a = hashMapOf;
    }

    /* renamed from: a */
    public static final String m13972a(EnumC7283Ru enumC7283Ru) {
        Intrinsics.checkNotNullParameter(enumC7283Ru, "<this>");
        String str = f109020a.get(enumC7283Ru);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}
