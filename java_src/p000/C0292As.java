package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LAs;", "", "", "toggled", "", "toggledOnString", "toggledOffString", C17296a.f69688o, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)LAs;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "c", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: As */
/* loaded from: classes3.dex */
public final class C0292As {

    /* renamed from: a */
    public final Boolean f1281a;

    /* renamed from: b */
    public final String f1282b;

    /* renamed from: c */
    public final String f1283c;

    public C0292As(Boolean bool, String toggledOnString, String toggledOffString) {
        Intrinsics.checkNotNullParameter(toggledOnString, "toggledOnString");
        Intrinsics.checkNotNullParameter(toggledOffString, "toggledOffString");
        this.f1281a = bool;
        this.f1282b = toggledOnString;
        this.f1283c = toggledOffString;
    }

    public static /* synthetic */ C0292As copy$default(C0292As c0292As, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c0292As.f1281a;
        }
        if ((i & 2) != 0) {
            str = c0292As.f1282b;
        }
        if ((i & 4) != 0) {
            str2 = c0292As.f1283c;
        }
        return c0292As.m115008a(bool, str, str2);
    }

    /* renamed from: a */
    public final C0292As m115008a(Boolean bool, String toggledOnString, String toggledOffString) {
        Intrinsics.checkNotNullParameter(toggledOnString, "toggledOnString");
        Intrinsics.checkNotNullParameter(toggledOffString, "toggledOffString");
        return new C0292As(bool, toggledOnString, toggledOffString);
    }

    /* renamed from: b */
    public final Boolean m115007b() {
        return this.f1281a;
    }

    /* renamed from: c */
    public final String m115006c() {
        return this.f1283c;
    }

    /* renamed from: d */
    public final String m115005d() {
        return this.f1282b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0292As) {
            C0292As c0292As = (C0292As) obj;
            return Intrinsics.areEqual(this.f1281a, c0292As.f1281a) && Intrinsics.areEqual(this.f1282b, c0292As.f1282b) && Intrinsics.areEqual(this.f1283c, c0292As.f1283c);
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.f1281a;
        return ((((bool == null ? 0 : bool.hashCode()) * 31) + this.f1282b.hashCode()) * 31) + this.f1283c.hashCode();
    }

    public String toString() {
        Boolean bool = this.f1281a;
        String str = this.f1282b;
        String str2 = this.f1283c;
        return "AutoReloadSectionViewModel(toggled=" + bool + ", toggledOnString=" + str + ", toggledOffString=" + str2 + ")";
    }

    public /* synthetic */ C0292As(Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, str, str2);
    }
}
