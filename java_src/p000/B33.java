package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireFlagNestReason;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%JD\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b\u0018\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LB33;", "", "", "Lco/bird/android/model/wire/WireFlagNestReason;", "reasons", "selectedReason", "", "comment", "", "suggestedCapacity", C17296a.f69688o, "(Ljava/util/List;Lco/bird/android/model/wire/WireFlagNestReason;Ljava/lang/String;Ljava/lang/Integer;)LB33;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "b", "Lco/bird/android/model/wire/WireFlagNestReason;", "e", "()Lco/bird/android/model/wire/WireFlagNestReason;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "g", "(Ljava/lang/Throwable;)V", "error", "<init>", "(Ljava/util/List;Lco/bird/android/model/wire/WireFlagNestReason;Ljava/lang/String;Ljava/lang/Integer;)V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B33 */
/* loaded from: classes3.dex */
public final class B33 {

    /* renamed from: a */
    public final List<WireFlagNestReason> f1577a;

    /* renamed from: b */
    public final WireFlagNestReason f1578b;

    /* renamed from: c */
    public final String f1579c;

    /* renamed from: d */
    public final Integer f1580d;

    /* renamed from: e */
    public Throwable f1581e;

    public B33() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ B33 copy$default(B33 b33, List list, WireFlagNestReason wireFlagNestReason, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = b33.f1577a;
        }
        if ((i & 2) != 0) {
            wireFlagNestReason = b33.f1578b;
        }
        if ((i & 4) != 0) {
            str = b33.f1579c;
        }
        if ((i & 8) != 0) {
            num = b33.f1580d;
        }
        return b33.m114768a(list, wireFlagNestReason, str, num);
    }

    /* renamed from: a */
    public final B33 m114768a(List<WireFlagNestReason> reasons, WireFlagNestReason wireFlagNestReason, String str, Integer num) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        return new B33(reasons, wireFlagNestReason, str, num);
    }

    /* renamed from: b */
    public final String m114767b() {
        return this.f1579c;
    }

    /* renamed from: c */
    public final Throwable m114766c() {
        return this.f1581e;
    }

    /* renamed from: d */
    public final List<WireFlagNestReason> m114765d() {
        return this.f1577a;
    }

    /* renamed from: e */
    public final WireFlagNestReason m114764e() {
        return this.f1578b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B33) {
            B33 b33 = (B33) obj;
            return Intrinsics.areEqual(this.f1577a, b33.f1577a) && Intrinsics.areEqual(this.f1578b, b33.f1578b) && Intrinsics.areEqual(this.f1579c, b33.f1579c) && Intrinsics.areEqual(this.f1580d, b33.f1580d);
        }
        return false;
    }

    /* renamed from: f */
    public final Integer m114763f() {
        return this.f1580d;
    }

    /* renamed from: g */
    public final void m114762g(Throwable th) {
        this.f1581e = th;
    }

    public int hashCode() {
        int hashCode = this.f1577a.hashCode() * 31;
        WireFlagNestReason wireFlagNestReason = this.f1578b;
        int hashCode2 = (hashCode + (wireFlagNestReason == null ? 0 : wireFlagNestReason.hashCode())) * 31;
        String str = this.f1579c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f1580d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        List<WireFlagNestReason> list = this.f1577a;
        WireFlagNestReason wireFlagNestReason = this.f1578b;
        String str = this.f1579c;
        Integer num = this.f1580d;
        return "NestFlaggingState(reasons=" + list + ", selectedReason=" + wireFlagNestReason + ", comment=" + str + ", suggestedCapacity=" + num + ")";
    }

    public B33(List<WireFlagNestReason> reasons, WireFlagNestReason wireFlagNestReason, String str, Integer num) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f1577a = reasons;
        this.f1578b = wireFlagNestReason;
        this.f1579c = str;
        this.f1580d = num;
    }

    public /* synthetic */ B33(List list, WireFlagNestReason wireFlagNestReason, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : wireFlagNestReason, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num);
    }
}
