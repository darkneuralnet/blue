package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireServiceCenterCampaign;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m28432d2 = {"LHa2;", "", "Lco/bird/android/model/Issue;", C17296a.f69688o, "", "b", "LH6;", "c", "Lco/bird/android/model/wire/WireServiceCenterCampaign;", DateTokenConverter.CONVERTER_KEY, "issue", "locked", "subItemSection", "highestPriorityCampaign", "e", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/Issue;", "g", "()Lco/bird/android/model/Issue;", "Z", "getLocked", "()Z", "LH6;", "h", "()LH6;", "Lco/bird/android/model/wire/WireServiceCenterCampaign;", "f", "()Lco/bird/android/model/wire/WireServiceCenterCampaign;", "<init>", "(Lco/bird/android/model/Issue;ZLH6;Lco/bird/android/model/wire/WireServiceCenterCampaign;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ha2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33253Ha2 {

    /* renamed from: a */
    public final Issue f13562a;

    /* renamed from: b */
    public final boolean f13563b;

    /* renamed from: c */
    public final C3023H6 f13564c;

    /* renamed from: d */
    public final WireServiceCenterCampaign f13565d;

    public C33253Ha2(Issue issue, boolean z, C3023H6 subItemSection, WireServiceCenterCampaign wireServiceCenterCampaign) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(subItemSection, "subItemSection");
        this.f13562a = issue;
        this.f13563b = z;
        this.f13564c = subItemSection;
        this.f13565d = wireServiceCenterCampaign;
    }

    public static /* synthetic */ C33253Ha2 copy$default(C33253Ha2 c33253Ha2, Issue issue, boolean z, C3023H6 c3023h6, WireServiceCenterCampaign wireServiceCenterCampaign, int i, Object obj) {
        if ((i & 1) != 0) {
            issue = c33253Ha2.f13562a;
        }
        if ((i & 2) != 0) {
            z = c33253Ha2.f13563b;
        }
        if ((i & 4) != 0) {
            c3023h6 = c33253Ha2.f13564c;
        }
        if ((i & 8) != 0) {
            wireServiceCenterCampaign = c33253Ha2.f13565d;
        }
        return c33253Ha2.m103701e(issue, z, c3023h6, wireServiceCenterCampaign);
    }

    /* renamed from: a */
    public final Issue m103705a() {
        return this.f13562a;
    }

    /* renamed from: b */
    public final boolean m103704b() {
        return this.f13563b;
    }

    /* renamed from: c */
    public final C3023H6 m103703c() {
        return this.f13564c;
    }

    /* renamed from: d */
    public final WireServiceCenterCampaign m103702d() {
        return this.f13565d;
    }

    /* renamed from: e */
    public final C33253Ha2 m103701e(Issue issue, boolean z, C3023H6 subItemSection, WireServiceCenterCampaign wireServiceCenterCampaign) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(subItemSection, "subItemSection");
        return new C33253Ha2(issue, z, subItemSection, wireServiceCenterCampaign);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33253Ha2) {
            C33253Ha2 c33253Ha2 = (C33253Ha2) obj;
            return Intrinsics.areEqual(this.f13562a, c33253Ha2.f13562a) && this.f13563b == c33253Ha2.f13563b && Intrinsics.areEqual(this.f13564c, c33253Ha2.f13564c) && Intrinsics.areEqual(this.f13565d, c33253Ha2.f13565d);
        }
        return false;
    }

    /* renamed from: f */
    public final WireServiceCenterCampaign m103700f() {
        return this.f13565d;
    }

    /* renamed from: g */
    public final Issue m103699g() {
        return this.f13562a;
    }

    /* renamed from: h */
    public final C3023H6 m103698h() {
        return this.f13564c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f13562a.hashCode() * 31;
        boolean z = this.f13563b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.f13564c.hashCode()) * 31;
        WireServiceCenterCampaign wireServiceCenterCampaign = this.f13565d;
        return hashCode2 + (wireServiceCenterCampaign == null ? 0 : wireServiceCenterCampaign.hashCode());
    }

    public String toString() {
        Issue issue = this.f13562a;
        boolean z = this.f13563b;
        C3023H6 c3023h6 = this.f13564c;
        WireServiceCenterCampaign wireServiceCenterCampaign = this.f13565d;
        return "IssueViewModel(issue=" + issue + ", locked=" + z + ", subItemSection=" + c3023h6 + ", highestPriorityCampaign=" + wireServiceCenterCampaign + ")";
    }

    public /* synthetic */ C33253Ha2(Issue issue, boolean z, C3023H6 c3023h6, WireServiceCenterCampaign wireServiceCenterCampaign, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(issue, z, c3023h6, (i & 8) != 0 ? null : wireServiceCenterCampaign);
    }
}
