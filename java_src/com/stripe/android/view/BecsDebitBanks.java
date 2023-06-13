package com.stripe.android.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeJsonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitBanks;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "shouldIncludeTestBank", "", "(Landroid/content/Context;Z)V", "banks", "", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "(Ljava/util/List;Z)V", "getBanks$payments_core_release", "()Ljava/util/List;", "byPrefix", "bsb", "", "Bank", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBecsDebitBanks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitBanks.kt\ncom/stripe/android/view/BecsDebitBanks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1#2:63\n288#3,2:64\n*S KotlinDebug\n*F\n+ 1 BecsDebitBanks.kt\ncom/stripe/android/view/BecsDebitBanks\n*L\n27#1:64,2\n*E\n"})
/* loaded from: classes7.dex */
public final class BecsDebitBanks {
    private final List<Bank> banks;
    private final boolean shouldIncludeTestBank;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final Bank STRIPE_TEST_BANK = new Bank("00", "Stripe Test Bank");

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Bank;", "Landroid/os/Parcelable;", "prefix", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPrefix", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Bank implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Bank> CREATOR = new Creator();
        private final String name;
        private final String prefix;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Bank> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bank createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bank(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bank[] newArray(int i) {
                return new Bank[i];
            }
        }

        public Bank(String prefix, String name) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(name, "name");
            this.prefix = prefix;
            this.name = name;
        }

        public static /* synthetic */ Bank copy$default(Bank bank, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bank.prefix;
            }
            if ((i & 2) != 0) {
                str2 = bank.name;
            }
            return bank.copy(str, str2);
        }

        public final String component1() {
            return this.prefix;
        }

        public final String component2() {
            return this.name;
        }

        public final Bank copy(String prefix, String name) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Bank(prefix, name);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Bank) {
                Bank bank = (Bank) obj;
                return Intrinsics.areEqual(this.prefix, bank.prefix) && Intrinsics.areEqual(this.name, bank.name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public int hashCode() {
            return (this.prefix.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            String str = this.prefix;
            String str2 = this.name;
            return "Bank(prefix=" + str + ", name=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.prefix);
            out.writeString(this.name);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Companion;", "", "()V", "STRIPE_TEST_BANK", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "createBanksData", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "readFile", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBecsDebitBanks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitBanks.kt\ncom/stripe/android/view/BecsDebitBanks$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,62:1\n125#2:63\n152#2,3:64\n*S KotlinDebug\n*F\n+ 1 BecsDebitBanks.kt\ncom/stripe/android/view/BecsDebitBanks$Companion\n*L\n42#1:63\n42#1:64,3\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Bank> createBanksData(Context context) {
            Map jsonObjectToMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(new JSONObject(readFile(context)));
            if (jsonObjectToMap == null) {
                jsonObjectToMap = MapsKt__MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList(jsonObjectToMap.size());
            for (Map.Entry entry : jsonObjectToMap.entrySet()) {
                arrayList.add(new Bank((String) entry.getKey(), String.valueOf(entry.getValue())));
            }
            return arrayList;
        }

        private final String readFile(Context context) {
            String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            Intrinsics.checkNotNullExpressionValue(next, "Scanner(\n               …seDelimiter(\"\\\\A\").next()");
            return next;
        }

        private Companion() {
        }
    }

    public BecsDebitBanks(List<Bank> banks, boolean z) {
        Intrinsics.checkNotNullParameter(banks, "banks");
        this.banks = banks;
        this.shouldIncludeTestBank = z;
    }

    public final Bank byPrefix(String bsb) {
        List listOfNotNull;
        List plus;
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(bsb, "bsb");
        List<Bank> list = this.banks;
        Bank bank = STRIPE_TEST_BANK;
        Object obj = null;
        if (!this.shouldIncludeTestBank) {
            bank = null;
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(bank);
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) listOfNotNull);
        Iterator it = plus.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(bsb, ((Bank) next).getPrefix(), false, 2, null);
            if (startsWith$default) {
                obj = next;
                break;
            }
        }
        return (Bank) obj;
    }

    public final List<Bank> getBanks$payments_core_release() {
        return this.banks;
    }

    public /* synthetic */ BecsDebitBanks(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z);
    }

    public /* synthetic */ BecsDebitBanks(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBanks(Context context, boolean z) {
        this(Companion.createBanksData(context), z);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
