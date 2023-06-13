package com.stripe.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J'\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e0\u000eH\u0000¢\u0006\u0002\b\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u001b\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0000¢\u0006\u0002\b\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\r\u0010\u001a\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0011HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/core/AppInfo;", "Landroid/os/Parcelable;", "name", "", "version", "url", "partnerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "createClientHeaders", "", "createClientHeaders$stripe_core_release", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "toParamMap$stripe_core_release", "toString", "toUserAgent", "toUserAgent$stripe_core_release", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppInfo.kt\ncom/stripe/android/core/AppInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/* loaded from: classes6.dex */
public final class AppInfo implements Parcelable {
    private final String name;
    private final String partnerId;
    private final String url;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppInfo> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/core/AppInfo$Companion;", "", "()V", "create", "Lcom/stripe/android/core/AppInfo;", "name", "", "version", "url", "partnerId", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AppInfo create$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            return companion.create(str, str2, str3, str4);
        }

        @JvmStatic
        @JvmOverloads
        public final AppInfo create(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return create$default(this, name, null, null, null, 14, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final AppInfo create(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            return create$default(this, name, str, null, null, 12, null);
        }

        @JvmStatic
        @JvmOverloads
        public final AppInfo create(String name, String str, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            return create$default(this, name, str, str2, null, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        public final AppInfo create(String name, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new AppInfo(name, str, str2, str3);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AppInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo[] newArray(int i) {
            return new AppInfo[i];
        }
    }

    public AppInfo(String name, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.version = str;
        this.url = str2;
        this.partnerId = str3;
    }

    private final String component1() {
        return this.name;
    }

    private final String component2() {
        return this.version;
    }

    private final String component3() {
        return this.url;
    }

    private final String component4() {
        return this.partnerId;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.version;
        }
        if ((i & 4) != 0) {
            str3 = appInfo.url;
        }
        if ((i & 8) != 0) {
            str4 = appInfo.partnerId;
        }
        return appInfo.copy(str, str2, str3, str4);
    }

    @JvmStatic
    @JvmOverloads
    public static final AppInfo create(String str) {
        return Companion.create(str);
    }

    public final AppInfo copy(String name, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AppInfo(name, str, str2, str3);
    }

    public final Map<String, Map<String, String>> createClientHeaders$stripe_core_release() {
        Map<String, Map<String, String>> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("application", toParamMap$stripe_core_release()));
        return mapOf;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppInfo) {
            AppInfo appInfo = (AppInfo) obj;
            return Intrinsics.areEqual(this.name, appInfo.name) && Intrinsics.areEqual(this.version, appInfo.version) && Intrinsics.areEqual(this.url, appInfo.url) && Intrinsics.areEqual(this.partnerId, appInfo.partnerId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.version;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Map<String, String> toParamMap$stripe_core_release() {
        Map<String, String> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("name", this.name), TuplesKt.m28425to("version", this.version), TuplesKt.m28425to("url", this.url), TuplesKt.m28425to("partner_id", this.partnerId));
        return mapOf;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.version;
        String str3 = this.url;
        String str4 = this.partnerId;
        return "AppInfo(name=" + str + ", version=" + str2 + ", url=" + str3 + ", partnerId=" + str4 + ")";
    }

    public final String toUserAgent$stripe_core_release() {
        String str;
        List listOfNotNull;
        String joinToString$default;
        String[] strArr = new String[3];
        strArr[0] = this.name;
        String str2 = this.version;
        String str3 = null;
        if (str2 != null) {
            str = "/" + str2;
        } else {
            str = null;
        }
        strArr[1] = str;
        String str4 = this.url;
        if (str4 != null) {
            str3 = " (" + str4 + ")";
        }
        strArr[2] = str3;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOfNotNull, "", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.version);
        out.writeString(this.url);
        out.writeString(this.partnerId);
    }

    @JvmStatic
    @JvmOverloads
    public static final AppInfo create(String str, String str2) {
        return Companion.create(str, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final AppInfo create(String str, String str2, String str3) {
        return Companion.create(str, str2, str3);
    }

    @JvmStatic
    @JvmOverloads
    public static final AppInfo create(String str, String str2, String str3, String str4) {
        return Companion.create(str, str2, str3, str4);
    }
}
