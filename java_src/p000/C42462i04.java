package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.api.response.ReloadOption;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#JT\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b!\u0010\u0016¨\u0006$"}, m28432d2 = {"Li04;", "LL14;", "", "currency", "", "Lco/bird/api/response/ReloadOption;", "preloadOptions", "", "includePayPerRide", "includeAutoReloadSection", "autoReloadMandatory", "optionIdSelected", C17296a.f69688o, "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)Li04;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "Z", "e", "()Z", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "f", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: i04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42462i04 implements L14 {

    /* renamed from: a */
    public final String f86268a;

    /* renamed from: b */
    public final List<ReloadOption> f86269b;

    /* renamed from: c */
    public final boolean f86270c;

    /* renamed from: d */
    public final boolean f86271d;

    /* renamed from: e */
    public final Boolean f86272e;

    /* renamed from: f */
    public final String f86273f;

    public C42462i04(String currency, List<ReloadOption> preloadOptions, boolean z, boolean z2, Boolean bool, String optionIdSelected) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(preloadOptions, "preloadOptions");
        Intrinsics.checkNotNullParameter(optionIdSelected, "optionIdSelected");
        this.f86268a = currency;
        this.f86269b = preloadOptions;
        this.f86270c = z;
        this.f86271d = z2;
        this.f86272e = bool;
        this.f86273f = optionIdSelected;
    }

    public static /* synthetic */ C42462i04 copy$default(C42462i04 c42462i04, String str, List list, boolean z, boolean z2, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c42462i04.f86268a;
        }
        List<ReloadOption> list2 = list;
        if ((i & 2) != 0) {
            list2 = c42462i04.f86269b;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            z = c42462i04.f86270c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c42462i04.f86271d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            bool = c42462i04.f86272e;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            str2 = c42462i04.f86273f;
        }
        return c42462i04.m35403a(str, list3, z3, z4, bool2, str2);
    }

    /* renamed from: a */
    public final C42462i04 m35403a(String currency, List<ReloadOption> preloadOptions, boolean z, boolean z2, Boolean bool, String optionIdSelected) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(preloadOptions, "preloadOptions");
        Intrinsics.checkNotNullParameter(optionIdSelected, "optionIdSelected");
        return new C42462i04(currency, preloadOptions, z, z2, bool, optionIdSelected);
    }

    /* renamed from: b */
    public final Boolean m35402b() {
        return this.f86272e;
    }

    /* renamed from: c */
    public final String m35401c() {
        return this.f86268a;
    }

    /* renamed from: d */
    public final boolean m35400d() {
        return this.f86271d;
    }

    /* renamed from: e */
    public final boolean m35399e() {
        return this.f86270c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42462i04) {
            C42462i04 c42462i04 = (C42462i04) obj;
            return Intrinsics.areEqual(this.f86268a, c42462i04.f86268a) && Intrinsics.areEqual(this.f86269b, c42462i04.f86269b) && this.f86270c == c42462i04.f86270c && this.f86271d == c42462i04.f86271d && Intrinsics.areEqual(this.f86272e, c42462i04.f86272e) && Intrinsics.areEqual(this.f86273f, c42462i04.f86273f);
        }
        return false;
    }

    /* renamed from: f */
    public final String m35398f() {
        return this.f86273f;
    }

    /* renamed from: g */
    public final List<ReloadOption> m35397g() {
        return this.f86269b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f86268a.hashCode() * 31) + this.f86269b.hashCode()) * 31;
        boolean z = this.f86270c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f86271d;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Boolean bool = this.f86272e;
        return ((i3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.f86273f.hashCode();
    }

    public String toString() {
        String str = this.f86268a;
        List<ReloadOption> list = this.f86269b;
        boolean z = this.f86270c;
        boolean z2 = this.f86271d;
        Boolean bool = this.f86272e;
        String str2 = this.f86273f;
        return "PreloadOptionsAvailable(currency=" + str + ", preloadOptions=" + list + ", includePayPerRide=" + z + ", includeAutoReloadSection=" + z2 + ", autoReloadMandatory=" + bool + ", optionIdSelected=" + str2 + ")";
    }
}
