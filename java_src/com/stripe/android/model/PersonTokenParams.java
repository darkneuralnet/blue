package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.Token;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0005Z[\\]^Bõ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003Jù\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\t\u0010N\u001a\u00020OHÖ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u000106HÖ\u0003J\t\u0010S\u001a\u00020OHÖ\u0001J\t\u0010T\u001a\u00020\nHÖ\u0001J\u0019\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020OHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002060\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00100R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006_"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams;", "Lcom/stripe/android/model/TokenParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", PersonTokenParams.PARAM_GENDER, "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", PersonTokenParams.PARAM_METADATA, "", "phone", PersonTokenParams.PARAM_RELATIONSHIP, "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "ssnLast4", PersonTokenParams.PARAM_VERIFICATION, "Lcom/stripe/android/model/PersonTokenParams$Verification;", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Relationship;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "getAddressKanji", "getDateOfBirth", "()Lcom/stripe/android/model/DateOfBirth;", "getEmail", "()Ljava/lang/String;", "getFirstName", "getFirstNameKana", "getFirstNameKanji", "getGender", "getIdNumber", "getLastName", "getLastNameKana", "getLastNameKanji", "getMaidenName", "getMetadata", "()Ljava/util/Map;", "getPhone", "getRelationship", "()Lcom/stripe/android/model/PersonTokenParams$Relationship;", "getSsnLast4", "typeDataParams", "", "getTypeDataParams", "getVerification", "()Lcom/stripe/android/model/PersonTokenParams$Verification;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "Document", "Relationship", "Verification", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPersonTokenParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1789#2,2:531\n1791#2:534\n1#3:533\n*S KotlinDebug\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams\n*L\n175#1:531,2\n175#1:534\n*E\n"})
/* loaded from: classes7.dex */
public final class PersonTokenParams extends TokenParams {
    @Deprecated
    private static final String PARAM_ADDRESS = "address";
    @Deprecated
    private static final String PARAM_ADDRESS_KANA = "address_kana";
    @Deprecated
    private static final String PARAM_ADDRESS_KANJI = "address_kanji";
    @Deprecated
    private static final String PARAM_DOB = "dob";
    @Deprecated
    private static final String PARAM_EMAIL = "email";
    @Deprecated
    private static final String PARAM_FIRST_NAME = "first_name";
    @Deprecated
    private static final String PARAM_FIRST_NAME_KANA = "first_name_kana";
    @Deprecated
    private static final String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
    @Deprecated
    private static final String PARAM_GENDER = "gender";
    @Deprecated
    private static final String PARAM_ID_NUMBER = "id_number";
    @Deprecated
    private static final String PARAM_LAST_NAME = "last_name";
    @Deprecated
    private static final String PARAM_LAST_NAME_KANA = "last_name_kana";
    @Deprecated
    private static final String PARAM_LAST_NAME_KANJI = "last_name_kanji";
    @Deprecated
    private static final String PARAM_MAIDEN_NAME = "maiden_name";
    @Deprecated
    private static final String PARAM_METADATA = "metadata";
    @Deprecated
    private static final String PARAM_PERSON = "person";
    @Deprecated
    private static final String PARAM_PHONE = "phone";
    @Deprecated
    private static final String PARAM_RELATIONSHIP = "relationship";
    @Deprecated
    private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
    @Deprecated
    private static final String PARAM_VERIFICATION = "verification";
    private final Address address;
    private final AddressJapanParams addressKana;
    private final AddressJapanParams addressKanji;
    private final DateOfBirth dateOfBirth;
    private final String email;
    private final String firstName;
    private final String firstNameKana;
    private final String firstNameKanji;
    private final String gender;
    private final String idNumber;
    private final String lastName;
    private final String lastNameKana;
    private final String lastNameKanji;
    private final String maidenName;
    private final Map<String, String> metadata;
    private final String phone;
    private final Relationship relationship;
    private final String ssnLast4;
    private final Verification verification;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PersonTokenParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010!\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001c\u0010-\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017J\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u00100\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\fJ\u0010\u00101\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PersonTokenParams;", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", PersonTokenParams.PARAM_GENDER, "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", PersonTokenParams.PARAM_METADATA, "", "phone", PersonTokenParams.PARAM_RELATIONSHIP, "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "ssnLast4", PersonTokenParams.PARAM_VERIFICATION, "Lcom/stripe/android/model/PersonTokenParams$Verification;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setAddress", "setAddressKana", "setAddressKanji", "setDateOfBirth", "setEmail", "setFirstName", "setFirstNameKana", "setFirstNameKanji", "setGender", "setIdNumber", "setLastName", "setLastNameKana", "setLastNameKanji", "setMaidenName", "setMetadata", "setPhone", "setRelationship", "setSsnLast4", "setVerification", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder implements ObjectBuilder<PersonTokenParams> {
        public static final int $stable = 8;
        private Address address;
        private AddressJapanParams addressKana;
        private AddressJapanParams addressKanji;
        private DateOfBirth dateOfBirth;
        private String email;
        private String firstName;
        private String firstNameKana;
        private String firstNameKanji;
        private String gender;
        private String idNumber;
        private String lastName;
        private String lastNameKana;
        private String lastNameKanji;
        private String maidenName;
        private Map<String, String> metadata;
        private String phone;
        private Relationship relationship;
        private String ssnLast4;
        private Verification verification;

        public final Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public final Builder setAddressKana(AddressJapanParams addressJapanParams) {
            this.addressKana = addressJapanParams;
            return this;
        }

        public final Builder setAddressKanji(AddressJapanParams addressJapanParams) {
            this.addressKanji = addressJapanParams;
            return this;
        }

        public final Builder setDateOfBirth(DateOfBirth dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public final Builder setEmail(String str) {
            this.email = str;
            return this;
        }

        public final Builder setFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public final Builder setFirstNameKana(String str) {
            this.firstNameKana = str;
            return this;
        }

        public final Builder setFirstNameKanji(String str) {
            this.firstNameKanji = str;
            return this;
        }

        public final Builder setGender(String str) {
            this.gender = str;
            return this;
        }

        public final Builder setIdNumber(String str) {
            this.idNumber = str;
            return this;
        }

        public final Builder setLastName(String str) {
            this.lastName = str;
            return this;
        }

        public final Builder setLastNameKana(String str) {
            this.lastNameKana = str;
            return this;
        }

        public final Builder setLastNameKanji(String str) {
            this.lastNameKanji = str;
            return this;
        }

        public final Builder setMaidenName(String str) {
            this.maidenName = str;
            return this;
        }

        public final Builder setMetadata(Map<String, String> map) {
            this.metadata = map;
            return this;
        }

        public final Builder setPhone(String str) {
            this.phone = str;
            return this;
        }

        public final Builder setRelationship(Relationship relationship) {
            this.relationship = relationship;
            return this;
        }

        public final Builder setSsnLast4(String str) {
            this.ssnLast4 = str;
            return this;
        }

        public final Builder setVerification(Verification verification) {
            this.verification = verification;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public PersonTokenParams build() {
            return new PersonTokenParams(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.relationship, this.ssnLast4, this.verification);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PERSON", "PARAM_PHONE", "PARAM_RELATIONSHIP", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PersonTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonTokenParams createFromParcel(Parcel parcel) {
            String str;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Address createFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            AddressJapanParams createFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
            AddressJapanParams createFromParcel3 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
            DateOfBirth createFromParcel4 = parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = readString8;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    i++;
                    readInt = readInt;
                    readString8 = readString8;
                }
                str = readString8;
                linkedHashMap = linkedHashMap2;
            }
            return new PersonTokenParams(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readString, readString2, readString3, readString4, readString5, readString6, readString7, str, readString9, readString10, linkedHashMap, parcel.readString(), parcel.readInt() == 0 ? null : Relationship.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Verification.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonTokenParams[] newArray(int i) {
            return new PersonTokenParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Document.PARAM_FRONT, "", Document.PARAM_BACK, "(Ljava/lang/String;Ljava/lang/String;)V", "getBack", "()Ljava/lang/String;", "getFront", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPersonTokenParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams$Document\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1789#2,2:531\n1791#2:534\n1#3:533\n*S KotlinDebug\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams$Document\n*L\n370#1:531,2\n370#1:534\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Document implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_BACK = "back";
        @Deprecated
        private static final String PARAM_FRONT = "front";
        private final String back;
        private final String front;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Document> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document$Companion;", "", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Document> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document[] newArray(int i) {
                return new Document[i];
            }
        }

        @JvmOverloads
        public Document() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = document.front;
            }
            if ((i & 2) != 0) {
                str2 = document.back;
            }
            return document.copy(str, str2);
        }

        public final String component1() {
            return this.front;
        }

        public final String component2() {
            return this.back;
        }

        public final Document copy(String str, String str2) {
            return new Document(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Document) {
                Document document = (Document) obj;
                return Intrinsics.areEqual(this.front, document.front) && Intrinsics.areEqual(this.back, document.back);
            }
            return false;
        }

        public final String getBack() {
            return this.back;
        }

        public final String getFront() {
            return this.front;
        }

        public int hashCode() {
            String str = this.front;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.back;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair> listOf;
            Map<String, Object> emptyMap;
            Map map;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_BACK, this.back), TuplesKt.m28425to(PARAM_FRONT, this.front)});
            emptyMap = MapsKt__MapsKt.emptyMap();
            for (Pair pair : listOf) {
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (str2 != null) {
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, str2));
                } else {
                    map = null;
                }
                if (map == null) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
            }
            return emptyMap;
        }

        public String toString() {
            String str = this.front;
            String str2 = this.back;
            return "Document(front=" + str + ", back=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.front);
            out.writeString(this.back);
        }

        @JvmOverloads
        public Document(String str) {
            this(str, null, 2, null);
        }

        @JvmOverloads
        public Document(String str, String str2) {
            this.front = str;
            this.back = str2;
        }

        public /* synthetic */ Document(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002-.BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\bHÖ\u0001J\u0013\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020#0&H\u0016J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Relationship.PARAM_DIRECTOR, "", Relationship.PARAM_EXECUTIVE, Relationship.PARAM_OWNER, "percentOwnership", "", Relationship.PARAM_REPRESENTATIVE, Relationship.PARAM_TITLE, "", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDirector", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExecutive", "getOwner", "getPercentOwnership", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRepresentative", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Relationship;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPersonTokenParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams$Relationship\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1789#2,2:531\n1791#2:534\n1#3:533\n*S KotlinDebug\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams$Relationship\n*L\n245#1:531,2\n245#1:534\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Relationship implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_DIRECTOR = "director";
        @Deprecated
        private static final String PARAM_EXECUTIVE = "executive";
        @Deprecated
        private static final String PARAM_OWNER = "owner";
        @Deprecated
        private static final String PARAM_PERCENT_OWNERSHIP = "percent_ownership";
        @Deprecated
        private static final String PARAM_REPRESENTATIVE = "representative";
        @Deprecated
        private static final String PARAM_TITLE = "title";
        private final Boolean director;
        private final Boolean executive;
        private final Boolean owner;
        private final Integer percentOwnership;
        private final Boolean representative;
        private final String title;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Relationship> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "()V", Relationship.PARAM_DIRECTOR, "", "Ljava/lang/Boolean;", Relationship.PARAM_EXECUTIVE, Relationship.PARAM_OWNER, "percentOwnership", "", "Ljava/lang/Integer;", Relationship.PARAM_REPRESENTATIVE, Relationship.PARAM_TITLE, "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setDirector", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "setExecutive", "setOwner", "setPercentOwnership", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "setRepresentative", "setTitle", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Builder implements ObjectBuilder<Relationship> {
            public static final int $stable = 8;
            private Boolean director;
            private Boolean executive;
            private Boolean owner;
            private Integer percentOwnership;
            private Boolean representative;
            private String title;

            public final Builder setDirector(Boolean bool) {
                this.director = bool;
                return this;
            }

            public final Builder setExecutive(Boolean bool) {
                this.executive = bool;
                return this;
            }

            public final Builder setOwner(Boolean bool) {
                this.owner = bool;
                return this;
            }

            public final Builder setPercentOwnership(Integer num) {
                this.percentOwnership = num;
                return this;
            }

            public final Builder setRepresentative(Boolean bool) {
                this.representative = bool;
                return this;
            }

            public final Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Relationship build() {
                return new Relationship(this.director, this.executive, this.owner, this.percentOwnership, this.representative, this.title);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Companion;", "", "()V", "PARAM_DIRECTOR", "", "PARAM_EXECUTIVE", "PARAM_OWNER", "PARAM_PERCENT_OWNERSHIP", "PARAM_REPRESENTATIVE", "PARAM_TITLE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Relationship> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Relationship createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Relationship(valueOf, valueOf2, valueOf3, valueOf5, valueOf4, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Relationship[] newArray(int i) {
                return new Relationship[i];
            }
        }

        public Relationship() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ Relationship copy$default(Relationship relationship, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = relationship.director;
            }
            if ((i & 2) != 0) {
                bool2 = relationship.executive;
            }
            Boolean bool5 = bool2;
            if ((i & 4) != 0) {
                bool3 = relationship.owner;
            }
            Boolean bool6 = bool3;
            if ((i & 8) != 0) {
                num = relationship.percentOwnership;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                bool4 = relationship.representative;
            }
            Boolean bool7 = bool4;
            if ((i & 32) != 0) {
                str = relationship.title;
            }
            return relationship.copy(bool, bool5, bool6, num2, bool7, str);
        }

        public final Boolean component1() {
            return this.director;
        }

        public final Boolean component2() {
            return this.executive;
        }

        public final Boolean component3() {
            return this.owner;
        }

        public final Integer component4() {
            return this.percentOwnership;
        }

        public final Boolean component5() {
            return this.representative;
        }

        public final String component6() {
            return this.title;
        }

        public final Relationship copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str) {
            return new Relationship(bool, bool2, bool3, num, bool4, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Relationship) {
                Relationship relationship = (Relationship) obj;
                return Intrinsics.areEqual(this.director, relationship.director) && Intrinsics.areEqual(this.executive, relationship.executive) && Intrinsics.areEqual(this.owner, relationship.owner) && Intrinsics.areEqual(this.percentOwnership, relationship.percentOwnership) && Intrinsics.areEqual(this.representative, relationship.representative) && Intrinsics.areEqual(this.title, relationship.title);
            }
            return false;
        }

        public final Boolean getDirector() {
            return this.director;
        }

        public final Boolean getExecutive() {
            return this.executive;
        }

        public final Boolean getOwner() {
            return this.owner;
        }

        public final Integer getPercentOwnership() {
            return this.percentOwnership;
        }

        public final Boolean getRepresentative() {
            return this.representative;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Boolean bool = this.director;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.executive;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.owner;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num = this.percentOwnership;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool4 = this.representative;
            int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str = this.title;
            return hashCode5 + (str != null ? str.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair> listOf;
            Map<String, Object> emptyMap;
            Map map;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_DIRECTOR, this.director), TuplesKt.m28425to(PARAM_EXECUTIVE, this.executive), TuplesKt.m28425to(PARAM_OWNER, this.owner), TuplesKt.m28425to(PARAM_PERCENT_OWNERSHIP, this.percentOwnership), TuplesKt.m28425to(PARAM_REPRESENTATIVE, this.representative), TuplesKt.m28425to(PARAM_TITLE, this.title)});
            emptyMap = MapsKt__MapsKt.emptyMap();
            for (Pair pair : listOf) {
                String str = (String) pair.component1();
                Object component2 = pair.component2();
                if (component2 != null) {
                    map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, component2));
                } else {
                    map = null;
                }
                if (map == null) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                emptyMap = MapsKt__MapsKt.plus(emptyMap, map);
            }
            return emptyMap;
        }

        public String toString() {
            Boolean bool = this.director;
            Boolean bool2 = this.executive;
            Boolean bool3 = this.owner;
            Integer num = this.percentOwnership;
            Boolean bool4 = this.representative;
            String str = this.title;
            return "Relationship(director=" + bool + ", executive=" + bool2 + ", owner=" + bool3 + ", percentOwnership=" + num + ", representative=" + bool4 + ", title=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Boolean bool = this.director;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.executive;
            if (bool2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.owner;
            if (bool3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Integer num = this.percentOwnership;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Boolean bool4 = this.representative;
            if (bool4 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            out.writeString(this.title);
        }

        public Relationship(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str) {
            this.director = bool;
            this.executive = bool2;
            this.owner = bool3;
            this.percentOwnership = num;
            this.representative = bool4;
            this.title = str;
        }

        public /* synthetic */ Relationship(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str);
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Verification.PARAM_DOCUMENT, "Lcom/stripe/android/model/PersonTokenParams$Document;", "additionalDocument", "(Lcom/stripe/android/model/PersonTokenParams$Document;Lcom/stripe/android/model/PersonTokenParams$Document;)V", "getAdditionalDocument", "()Lcom/stripe/android/model/PersonTokenParams$Document;", "getDocument", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPersonTokenParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams$Verification\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1789#2,2:531\n1791#2:534\n1#3:533\n*S KotlinDebug\n*F\n+ 1 PersonTokenParams.kt\ncom/stripe/android/model/PersonTokenParams$Verification\n*L\n331#1:531,2\n331#1:534\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Verification implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
        @Deprecated
        private static final String PARAM_DOCUMENT = "document";
        private final Document additionalDocument;
        private final Document document;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Verification> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification$Companion;", "", "()V", "PARAM_ADDITIONAL_DOCUMENT", "", "PARAM_DOCUMENT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Verification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Document.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification[] newArray(int i) {
                return new Verification[i];
            }
        }

        @JvmOverloads
        public Verification() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ Verification copy$default(Verification verification, Document document, Document document2, int i, Object obj) {
            if ((i & 1) != 0) {
                document = verification.document;
            }
            if ((i & 2) != 0) {
                document2 = verification.additionalDocument;
            }
            return verification.copy(document, document2);
        }

        public final Document component1() {
            return this.document;
        }

        public final Document component2() {
            return this.additionalDocument;
        }

        public final Verification copy(Document document, Document document2) {
            return new Verification(document, document2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Verification) {
                Verification verification = (Verification) obj;
                return Intrinsics.areEqual(this.document, verification.document) && Intrinsics.areEqual(this.additionalDocument, verification.additionalDocument);
            }
            return false;
        }

        public final Document getAdditionalDocument() {
            return this.additionalDocument;
        }

        public final Document getDocument() {
            return this.document;
        }

        public int hashCode() {
            Document document = this.document;
            int hashCode = (document == null ? 0 : document.hashCode()) * 31;
            Document document2 = this.additionalDocument;
            return hashCode + (document2 != null ? document2.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> map;
            Map<String, Object> map2;
            List<Pair> listOf;
            Map<String, Object> emptyMap;
            Map map3;
            Pair[] pairArr = new Pair[2];
            Document document = this.document;
            if (document != null) {
                map = document.toParamMap();
            } else {
                map = null;
            }
            pairArr[0] = TuplesKt.m28425to(PARAM_ADDITIONAL_DOCUMENT, map);
            Document document2 = this.additionalDocument;
            if (document2 != null) {
                map2 = document2.toParamMap();
            } else {
                map2 = null;
            }
            pairArr[1] = TuplesKt.m28425to(PARAM_DOCUMENT, map2);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
            emptyMap = MapsKt__MapsKt.emptyMap();
            for (Pair pair : listOf) {
                String str = (String) pair.component1();
                Map map4 = (Map) pair.component2();
                if (map4 != null) {
                    map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, map4));
                } else {
                    map3 = null;
                }
                if (map3 == null) {
                    map3 = MapsKt__MapsKt.emptyMap();
                }
                emptyMap = MapsKt__MapsKt.plus(emptyMap, map3);
            }
            return emptyMap;
        }

        public String toString() {
            Document document = this.document;
            Document document2 = this.additionalDocument;
            return "Verification(document=" + document + ", additionalDocument=" + document2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Document document = this.document;
            if (document == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                document.writeToParcel(out, i);
            }
            Document document2 = this.additionalDocument;
            if (document2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            document2.writeToParcel(out, i);
        }

        @JvmOverloads
        public Verification(Document document) {
            this(document, null, 2, null);
        }

        @JvmOverloads
        public Verification(Document document, Document document2) {
            this.document = document;
            this.additionalDocument = document2;
        }

        public /* synthetic */ Verification(Document document, Document document2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : document, (i & 2) != 0 ? null : document2);
        }
    }

    public PersonTokenParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public final Address component1() {
        return this.address;
    }

    public final String component10() {
        return this.idNumber;
    }

    public final String component11() {
        return this.lastName;
    }

    public final String component12() {
        return this.lastNameKana;
    }

    public final String component13() {
        return this.lastNameKanji;
    }

    public final String component14() {
        return this.maidenName;
    }

    public final Map<String, String> component15() {
        return this.metadata;
    }

    public final String component16() {
        return this.phone;
    }

    public final Relationship component17() {
        return this.relationship;
    }

    public final String component18() {
        return this.ssnLast4;
    }

    public final Verification component19() {
        return this.verification;
    }

    public final AddressJapanParams component2() {
        return this.addressKana;
    }

    public final AddressJapanParams component3() {
        return this.addressKanji;
    }

    public final DateOfBirth component4() {
        return this.dateOfBirth;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.firstName;
    }

    public final String component7() {
        return this.firstNameKana;
    }

    public final String component8() {
        return this.firstNameKanji;
    }

    public final String component9() {
        return this.gender;
    }

    public final PersonTokenParams copy(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, Relationship relationship, String str12, Verification verification) {
        return new PersonTokenParams(address, addressJapanParams, addressJapanParams2, dateOfBirth, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map, str11, relationship, str12, verification);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PersonTokenParams) {
            PersonTokenParams personTokenParams = (PersonTokenParams) obj;
            return Intrinsics.areEqual(this.address, personTokenParams.address) && Intrinsics.areEqual(this.addressKana, personTokenParams.addressKana) && Intrinsics.areEqual(this.addressKanji, personTokenParams.addressKanji) && Intrinsics.areEqual(this.dateOfBirth, personTokenParams.dateOfBirth) && Intrinsics.areEqual(this.email, personTokenParams.email) && Intrinsics.areEqual(this.firstName, personTokenParams.firstName) && Intrinsics.areEqual(this.firstNameKana, personTokenParams.firstNameKana) && Intrinsics.areEqual(this.firstNameKanji, personTokenParams.firstNameKanji) && Intrinsics.areEqual(this.gender, personTokenParams.gender) && Intrinsics.areEqual(this.idNumber, personTokenParams.idNumber) && Intrinsics.areEqual(this.lastName, personTokenParams.lastName) && Intrinsics.areEqual(this.lastNameKana, personTokenParams.lastNameKana) && Intrinsics.areEqual(this.lastNameKanji, personTokenParams.lastNameKanji) && Intrinsics.areEqual(this.maidenName, personTokenParams.maidenName) && Intrinsics.areEqual(this.metadata, personTokenParams.metadata) && Intrinsics.areEqual(this.phone, personTokenParams.phone) && Intrinsics.areEqual(this.relationship, personTokenParams.relationship) && Intrinsics.areEqual(this.ssnLast4, personTokenParams.ssnLast4) && Intrinsics.areEqual(this.verification, personTokenParams.verification);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final AddressJapanParams getAddressKana() {
        return this.addressKana;
    }

    public final AddressJapanParams getAddressKanji() {
        return this.addressKanji;
    }

    public final DateOfBirth getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFirstNameKana() {
        return this.firstNameKana;
    }

    public final String getFirstNameKanji() {
        return this.firstNameKanji;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIdNumber() {
        return this.idNumber;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLastNameKana() {
        return this.lastNameKana;
    }

    public final String getLastNameKanji() {
        return this.lastNameKanji;
    }

    public final String getMaidenName() {
        return this.maidenName;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Relationship getRelationship() {
        return this.relationship;
    }

    public final String getSsnLast4() {
        return this.ssnLast4;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Map<String, Object> map;
        Map<String, Object> map2;
        Map<String, Object> map3;
        Map<String, Object> map4;
        Map<String, Object> map5;
        Map<String, Object> map6;
        List<Pair> listOf;
        Map<String, Object> emptyMap;
        Map map7;
        Pair[] pairArr = new Pair[19];
        Address address = this.address;
        if (address != null) {
            map = address.toParamMap();
        } else {
            map = null;
        }
        pairArr[0] = TuplesKt.m28425to("address", map);
        AddressJapanParams addressJapanParams = this.addressKana;
        if (addressJapanParams != null) {
            map2 = addressJapanParams.toParamMap();
        } else {
            map2 = null;
        }
        pairArr[1] = TuplesKt.m28425to(PARAM_ADDRESS_KANA, map2);
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        if (addressJapanParams2 != null) {
            map3 = addressJapanParams2.toParamMap();
        } else {
            map3 = null;
        }
        pairArr[2] = TuplesKt.m28425to(PARAM_ADDRESS_KANJI, map3);
        DateOfBirth dateOfBirth = this.dateOfBirth;
        if (dateOfBirth != null) {
            map4 = dateOfBirth.toParamMap();
        } else {
            map4 = null;
        }
        pairArr[3] = TuplesKt.m28425to(PARAM_DOB, map4);
        pairArr[4] = TuplesKt.m28425to("email", this.email);
        pairArr[5] = TuplesKt.m28425to(PARAM_FIRST_NAME, this.firstName);
        pairArr[6] = TuplesKt.m28425to(PARAM_FIRST_NAME_KANA, this.firstNameKana);
        pairArr[7] = TuplesKt.m28425to(PARAM_FIRST_NAME_KANJI, this.firstNameKanji);
        pairArr[8] = TuplesKt.m28425to(PARAM_GENDER, this.gender);
        pairArr[9] = TuplesKt.m28425to(PARAM_ID_NUMBER, this.idNumber);
        pairArr[10] = TuplesKt.m28425to(PARAM_LAST_NAME, this.lastName);
        pairArr[11] = TuplesKt.m28425to(PARAM_LAST_NAME_KANA, this.lastNameKana);
        pairArr[12] = TuplesKt.m28425to(PARAM_LAST_NAME_KANJI, this.lastNameKanji);
        pairArr[13] = TuplesKt.m28425to(PARAM_MAIDEN_NAME, this.maidenName);
        pairArr[14] = TuplesKt.m28425to(PARAM_METADATA, this.metadata);
        pairArr[15] = TuplesKt.m28425to("phone", this.phone);
        Relationship relationship = this.relationship;
        if (relationship != null) {
            map5 = relationship.toParamMap();
        } else {
            map5 = null;
        }
        pairArr[16] = TuplesKt.m28425to(PARAM_RELATIONSHIP, map5);
        pairArr[17] = TuplesKt.m28425to(PARAM_SSN_LAST_4, this.ssnLast4);
        Verification verification = this.verification;
        if (verification != null) {
            map6 = verification.toParamMap();
        } else {
            map6 = null;
        }
        pairArr[18] = TuplesKt.m28425to(PARAM_VERIFICATION, map6);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) pairArr);
        emptyMap = MapsKt__MapsKt.emptyMap();
        for (Pair pair : listOf) {
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 != null) {
                map7 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(str, component2));
            } else {
                map7 = null;
            }
            if (map7 == null) {
                map7 = MapsKt__MapsKt.emptyMap();
            }
            emptyMap = MapsKt__MapsKt.plus(emptyMap, map7);
        }
        return emptyMap;
    }

    public final Verification getVerification() {
        return this.verification;
    }

    public int hashCode() {
        Address address = this.address;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        AddressJapanParams addressJapanParams = this.addressKana;
        int hashCode2 = (hashCode + (addressJapanParams == null ? 0 : addressJapanParams.hashCode())) * 31;
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        int hashCode3 = (hashCode2 + (addressJapanParams2 == null ? 0 : addressJapanParams2.hashCode())) * 31;
        DateOfBirth dateOfBirth = this.dateOfBirth;
        int hashCode4 = (hashCode3 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
        String str = this.email;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameKana;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameKanji;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gender;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.idNumber;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameKana;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameKanji;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maidenName;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        String str11 = this.phone;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Relationship relationship = this.relationship;
        int hashCode17 = (hashCode16 + (relationship == null ? 0 : relationship.hashCode())) * 31;
        String str12 = this.ssnLast4;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Verification verification = this.verification;
        return hashCode18 + (verification != null ? verification.hashCode() : 0);
    }

    public String toString() {
        Address address = this.address;
        AddressJapanParams addressJapanParams = this.addressKana;
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        DateOfBirth dateOfBirth = this.dateOfBirth;
        String str = this.email;
        String str2 = this.firstName;
        String str3 = this.firstNameKana;
        String str4 = this.firstNameKanji;
        String str5 = this.gender;
        String str6 = this.idNumber;
        String str7 = this.lastName;
        String str8 = this.lastNameKana;
        String str9 = this.lastNameKanji;
        String str10 = this.maidenName;
        Map<String, String> map = this.metadata;
        String str11 = this.phone;
        Relationship relationship = this.relationship;
        String str12 = this.ssnLast4;
        Verification verification = this.verification;
        return "PersonTokenParams(address=" + address + ", addressKana=" + addressJapanParams + ", addressKanji=" + addressJapanParams2 + ", dateOfBirth=" + dateOfBirth + ", email=" + str + ", firstName=" + str2 + ", firstNameKana=" + str3 + ", firstNameKanji=" + str4 + ", gender=" + str5 + ", idNumber=" + str6 + ", lastName=" + str7 + ", lastNameKana=" + str8 + ", lastNameKanji=" + str9 + ", maidenName=" + str10 + ", metadata=" + map + ", phone=" + str11 + ", relationship=" + relationship + ", ssnLast4=" + str12 + ", verification=" + verification + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        AddressJapanParams addressJapanParams = this.addressKana;
        if (addressJapanParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addressJapanParams.writeToParcel(out, i);
        }
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        if (addressJapanParams2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addressJapanParams2.writeToParcel(out, i);
        }
        DateOfBirth dateOfBirth = this.dateOfBirth;
        if (dateOfBirth == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dateOfBirth.writeToParcel(out, i);
        }
        out.writeString(this.email);
        out.writeString(this.firstName);
        out.writeString(this.firstNameKana);
        out.writeString(this.firstNameKanji);
        out.writeString(this.gender);
        out.writeString(this.idNumber);
        out.writeString(this.lastName);
        out.writeString(this.lastNameKana);
        out.writeString(this.lastNameKanji);
        out.writeString(this.maidenName);
        Map<String, String> map = this.metadata;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        out.writeString(this.phone);
        Relationship relationship = this.relationship;
        if (relationship == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            relationship.writeToParcel(out, i);
        }
        out.writeString(this.ssnLast4);
        Verification verification = this.verification;
        if (verification == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        verification.writeToParcel(out, i);
    }

    public /* synthetic */ PersonTokenParams(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, Relationship relationship, String str12, Verification verification, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : addressJapanParams, (i & 4) != 0 ? null : addressJapanParams2, (i & 8) != 0 ? null : dateOfBirth, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : map, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str11, (i & 65536) != 0 ? null : relationship, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : str12, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : verification);
    }

    public PersonTokenParams(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, Relationship relationship, String str12, Verification verification) {
        super(Token.Type.Person, null, 2, null);
        this.address = address;
        this.addressKana = addressJapanParams;
        this.addressKanji = addressJapanParams2;
        this.dateOfBirth = dateOfBirth;
        this.email = str;
        this.firstName = str2;
        this.firstNameKana = str3;
        this.firstNameKanji = str4;
        this.gender = str5;
        this.idNumber = str6;
        this.lastName = str7;
        this.lastNameKana = str8;
        this.lastNameKanji = str9;
        this.maidenName = str10;
        this.metadata = map;
        this.phone = str11;
        this.relationship = relationship;
        this.ssnLast4 = str12;
        this.verification = verification;
    }
}
