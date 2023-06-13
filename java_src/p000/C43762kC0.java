package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LkC0;", "", "", "count", "", "failedText", "buttonText", "", "enabled", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "I", "c", "()I", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kC0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43762kC0 {

    /* renamed from: a */
    public final int f94065a;

    /* renamed from: b */
    public final String f94066b;

    /* renamed from: c */
    public final String f94067c;

    /* renamed from: d */
    public final boolean f94068d;

    public C43762kC0(int i, String str, String buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f94065a = i;
        this.f94066b = str;
        this.f94067c = buttonText;
        this.f94068d = z;
    }

    public static /* synthetic */ C43762kC0 copy$default(C43762kC0 c43762kC0, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c43762kC0.f94065a;
        }
        if ((i2 & 2) != 0) {
            str = c43762kC0.f94066b;
        }
        if ((i2 & 4) != 0) {
            str2 = c43762kC0.f94067c;
        }
        if ((i2 & 8) != 0) {
            z = c43762kC0.f94068d;
        }
        return c43762kC0.m29198a(i, str, str2, z);
    }

    /* renamed from: a */
    public final C43762kC0 m29198a(int i, String str, String buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new C43762kC0(i, str, buttonText, z);
    }

    /* renamed from: b */
    public final String m29197b() {
        return this.f94067c;
    }

    /* renamed from: c */
    public final int m29196c() {
        return this.f94065a;
    }

    /* renamed from: d */
    public final boolean m29195d() {
        return this.f94068d;
    }

    /* renamed from: e */
    public final String m29194e() {
        return this.f94066b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43762kC0) {
            C43762kC0 c43762kC0 = (C43762kC0) obj;
            return this.f94065a == c43762kC0.f94065a && Intrinsics.areEqual(this.f94066b, c43762kC0.f94066b) && Intrinsics.areEqual(this.f94067c, c43762kC0.f94067c) && this.f94068d == c43762kC0.f94068d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f94065a) * 31;
        String str = this.f94066b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f94067c.hashCode()) * 31;
        boolean z = this.f94068d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        int i = this.f94065a;
        String str = this.f94066b;
        String str2 = this.f94067c;
        boolean z = this.f94068d;
        return "CoreInventoryScanHeaderViewModel(count=" + i + ", failedText=" + str + ", buttonText=" + str2 + ", enabled=" + z + ")";
    }
}
