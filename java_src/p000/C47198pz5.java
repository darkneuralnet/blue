package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, m28432d2 = {"Lpz5;", "LN80;", "", "", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "b", "getUserId", "userId", "c", "getLegacyAuthToken", "legacyAuthToken", DateTokenConverter.CONVERTER_KEY, "getAuthHeader", "authHeader", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pz5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47198pz5 extends N80 {

    /* renamed from: a */
    public final String f104452a;

    /* renamed from: b */
    public final String f104453b;

    /* renamed from: c */
    public final String f104454c;

    /* renamed from: d */
    public final String f104455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47198pz5(String deviceId, String str, String str2, String str3) {
        super(null);
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.f104452a = deviceId;
        this.f104453b = str;
        this.f104454c = str2;
        this.f104455d = str3;
    }

    @Override // p000.N80
    /* renamed from: a */
    public Map<String, String> mo18351a() {
        Map<String, String> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("USER_ID", this.f104453b), TuplesKt.m28425to("AUTHORIZATION", this.f104454c), TuplesKt.m28425to("FULL_AUTH_HEADER", this.f104455d), TuplesKt.m28425to("PLATFORM", "android"), TuplesKt.m28425to("CLIENT_VERSION", "4.244.0.7"), TuplesKt.m28425to("SHOP_API_VERSION", "1.0.0"), TuplesKt.m28425to("DEVICE_ID", this.f104452a));
        return mapOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47198pz5) {
            C47198pz5 c47198pz5 = (C47198pz5) obj;
            return Intrinsics.areEqual(this.f104452a, c47198pz5.f104452a) && Intrinsics.areEqual(this.f104453b, c47198pz5.f104453b) && Intrinsics.areEqual(this.f104454c, c47198pz5.f104454c) && Intrinsics.areEqual(this.f104455d, c47198pz5.f104455d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f104452a.hashCode() * 31;
        String str = this.f104453b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104454c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104455d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f104452a;
        String str2 = this.f104453b;
        String str3 = this.f104454c;
        String str4 = this.f104455d;
        return "ShopContext(deviceId=" + str + ", userId=" + str2 + ", legacyAuthToken=" + str3 + ", authHeader=" + str4 + ")";
    }
}
