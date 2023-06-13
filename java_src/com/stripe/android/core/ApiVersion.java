package com.stripe.android.core;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÀ\u0003¢\u0006\u0002\b\u0012J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/core/ApiVersion;", "", "betas", "", "", "(Ljava/util/Set;)V", "version", "betaCodes", "(Ljava/lang/String;Ljava/util/Set;)V", "getBetaCodes$stripe_core_release", "()Ljava/util/Set;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "getCode", "()Ljava/lang/String;", "getVersion$stripe_core_release", "component1", "component1$stripe_core_release", "component2", "component2$stripe_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nApiVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiVersion.kt\ncom/stripe/android/core/ApiVersion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 ApiVersion.kt\ncom/stripe/android/core/ApiVersion\n*L\n27#1:44\n27#1:45,3\n*E\n"})
/* loaded from: classes6.dex */
public final class ApiVersion {
    private final Set<String> betaCodes;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final String API_VERSION_CODE = "2020-03-02";
    private static final ApiVersion INSTANCE = new ApiVersion(API_VERSION_CODE, null, 2, null);

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/core/ApiVersion$Companion;", "", "()V", "API_VERSION_CODE", "", "INSTANCE", "Lcom/stripe/android/core/ApiVersion;", "get", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ApiVersion get() {
            return ApiVersion.INSTANCE;
        }

        private Companion() {
        }
    }

    public ApiVersion(String version, Set<String> betaCodes) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(betaCodes, "betaCodes");
        this.version = version;
        this.betaCodes = betaCodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiVersion copy$default(ApiVersion apiVersion, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiVersion.version;
        }
        if ((i & 2) != 0) {
            set = apiVersion.betaCodes;
        }
        return apiVersion.copy(str, set);
    }

    public final String component1$stripe_core_release() {
        return this.version;
    }

    public final Set<String> component2$stripe_core_release() {
        return this.betaCodes;
    }

    public final ApiVersion copy(String version, Set<String> betaCodes) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(betaCodes, "betaCodes");
        return new ApiVersion(version, betaCodes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApiVersion) {
            ApiVersion apiVersion = (ApiVersion) obj;
            return Intrinsics.areEqual(this.version, apiVersion.version) && Intrinsics.areEqual(this.betaCodes, apiVersion.betaCodes);
        }
        return false;
    }

    public final Set<String> getBetaCodes$stripe_core_release() {
        return this.betaCodes;
    }

    public final String getCode() {
        List listOf;
        int collectionSizeOrDefault;
        List plus;
        String joinToString$default;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(this.version);
        List list = listOf;
        Set<String> set = this.betaCodes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : set) {
            arrayList.add(str);
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(plus, ";", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public final String getVersion$stripe_core_release() {
        return this.version;
    }

    public int hashCode() {
        return (this.version.hashCode() * 31) + this.betaCodes.hashCode();
    }

    public String toString() {
        String str = this.version;
        Set<String> set = this.betaCodes;
        return "ApiVersion(version=" + str + ", betaCodes=" + set + ")";
    }

    public /* synthetic */ ApiVersion(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiVersion(Set<String> betas) {
        this(API_VERSION_CODE, betas);
        Intrinsics.checkNotNullParameter(betas, "betas");
    }
}
