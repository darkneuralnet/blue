package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.api.response.ReloadOption;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"Lzs;", "LXs;", "", "autoReloadToggled", "", "currency", "", "Lco/bird/api/response/ReloadOption;", "autoReloadOptions", "optionIdSelected", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "c", "()Z", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "e", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zs */
/* loaded from: classes3.dex */
public final class C31578zs implements InterfaceC9534Xs {

    /* renamed from: a */
    public final boolean f122400a;

    /* renamed from: b */
    public final String f122401b;

    /* renamed from: c */
    public final List<ReloadOption> f122402c;

    /* renamed from: d */
    public final String f122403d;

    public C31578zs(boolean z, String currency, List<ReloadOption> autoReloadOptions, String optionIdSelected) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoReloadOptions, "autoReloadOptions");
        Intrinsics.checkNotNullParameter(optionIdSelected, "optionIdSelected");
        this.f122400a = z;
        this.f122401b = currency;
        this.f122402c = autoReloadOptions;
        this.f122403d = optionIdSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31578zs copy$default(C31578zs c31578zs, boolean z, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c31578zs.f122400a;
        }
        if ((i & 2) != 0) {
            str = c31578zs.f122401b;
        }
        if ((i & 4) != 0) {
            list = c31578zs.f122402c;
        }
        if ((i & 8) != 0) {
            str2 = c31578zs.f122403d;
        }
        return c31578zs.m217a(z, str, list, str2);
    }

    /* renamed from: a */
    public final C31578zs m217a(boolean z, String currency, List<ReloadOption> autoReloadOptions, String optionIdSelected) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoReloadOptions, "autoReloadOptions");
        Intrinsics.checkNotNullParameter(optionIdSelected, "optionIdSelected");
        return new C31578zs(z, currency, autoReloadOptions, optionIdSelected);
    }

    /* renamed from: b */
    public final List<ReloadOption> m216b() {
        return this.f122402c;
    }

    /* renamed from: c */
    public final boolean m215c() {
        return this.f122400a;
    }

    /* renamed from: d */
    public final String m214d() {
        return this.f122401b;
    }

    /* renamed from: e */
    public final String m213e() {
        return this.f122403d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31578zs) {
            C31578zs c31578zs = (C31578zs) obj;
            return this.f122400a == c31578zs.f122400a && Intrinsics.areEqual(this.f122401b, c31578zs.f122401b) && Intrinsics.areEqual(this.f122402c, c31578zs.f122402c) && Intrinsics.areEqual(this.f122403d, c31578zs.f122403d);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.f122400a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((r0 * 31) + this.f122401b.hashCode()) * 31) + this.f122402c.hashCode()) * 31) + this.f122403d.hashCode();
    }

    public String toString() {
        boolean z = this.f122400a;
        String str = this.f122401b;
        List<ReloadOption> list = this.f122402c;
        String str2 = this.f122403d;
        return "AutoReloadOptionsAvailable(autoReloadToggled=" + z + ", currency=" + str + ", autoReloadOptions=" + list + ", optionIdSelected=" + str2 + ")";
    }
}
