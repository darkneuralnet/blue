package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"B3\b\u0017\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÂ\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bHÇ\u0001J\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fJ\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u0012\u0004\b \u0010\u001f¨\u0006)"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "Landroid/os/Parcelable;", "", "component1", "component2", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "", "toParamMap", "clientSecret", "startingAfterAccountId", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/lang/String;", "getClientSecret$annotations", "()V", "getStartingAfterAccountId$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGetFinancialConnectionsAcccountsParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetFinancialConnectionsAcccountsParams.kt\ncom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1789#2,2:31\n1791#2:34\n1#3:33\n*S KotlinDebug\n*F\n+ 1 GetFinancialConnectionsAcccountsParams.kt\ncom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams\n*L\n18#1:31,2\n18#1:34\n*E\n"})
/* loaded from: classes7.dex */
public final class GetFinancialConnectionsAcccountsParams implements Parcelable {
    public static final int $stable = 0;
    @Deprecated
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String PARAM_STARTING_AFTER = "starting_after";
    private final String clientSecret;
    private final String startingAfterAccountId;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetFinancialConnectionsAcccountsParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "serializer", "", "PARAM_CLIENT_SECRET", "Ljava/lang/String;", "PARAM_STARTING_AFTER", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<GetFinancialConnectionsAcccountsParams> serializer() {
            return GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<GetFinancialConnectionsAcccountsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetFinancialConnectionsAcccountsParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GetFinancialConnectionsAcccountsParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetFinancialConnectionsAcccountsParams[] newArray(int i) {
            return new GetFinancialConnectionsAcccountsParams[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ GetFinancialConnectionsAcccountsParams(int i, @InterfaceC36694Vs5("client_secret") String str, @InterfaceC36694Vs5("starting_after") String str2, C38819bt5 c38819bt5) {
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = str;
        this.startingAfterAccountId = str2;
    }

    private final String component1() {
        return this.clientSecret;
    }

    private final String component2() {
        return this.startingAfterAccountId;
    }

    public static /* synthetic */ GetFinancialConnectionsAcccountsParams copy$default(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFinancialConnectionsAcccountsParams.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = getFinancialConnectionsAcccountsParams.startingAfterAccountId;
        }
        return getFinancialConnectionsAcccountsParams.copy(str, str2);
    }

    @InterfaceC36694Vs5("client_secret")
    private static /* synthetic */ void getClientSecret$annotations() {
    }

    @InterfaceC36694Vs5(PARAM_STARTING_AFTER)
    private static /* synthetic */ void getStartingAfterAccountId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(GetFinancialConnectionsAcccountsParams self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1128w(serialDesc, 0, self.clientSecret);
        output.mo1173E(serialDesc, 1, C41539gS5.f82260a, self.startingAfterAccountId);
    }

    public final GetFinancialConnectionsAcccountsParams copy(String clientSecret, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new GetFinancialConnectionsAcccountsParams(clientSecret, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetFinancialConnectionsAcccountsParams) {
            GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = (GetFinancialConnectionsAcccountsParams) obj;
            return Intrinsics.areEqual(this.clientSecret, getFinancialConnectionsAcccountsParams.clientSecret) && Intrinsics.areEqual(this.startingAfterAccountId, getFinancialConnectionsAcccountsParams.startingAfterAccountId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.clientSecret.hashCode() * 31;
        String str = this.startingAfterAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Map<String, Object> toParamMap() {
        List<Pair> listOf;
        Map<String, Object> emptyMap;
        Map map;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to("client_secret", this.clientSecret), TuplesKt.m28425to(PARAM_STARTING_AFTER, this.startingAfterAccountId)});
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
        String str = this.clientSecret;
        String str2 = this.startingAfterAccountId;
        return "GetFinancialConnectionsAcccountsParams(clientSecret=" + str + ", startingAfterAccountId=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.startingAfterAccountId);
    }

    public GetFinancialConnectionsAcccountsParams(String clientSecret, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.startingAfterAccountId = str;
    }
}
