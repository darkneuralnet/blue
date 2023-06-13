package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueType;
import co.bird.android.model.RepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\t\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LHF4;", "Lqi0;", "Lco/bird/android/model/RepairType;", "b", "Lco/bird/android/model/RepairType;", "e", "()Lco/bird/android/model/RepairType;", "repairType", "Lco/bird/android/model/IssueType;", "c", "Lco/bird/android/model/IssueType;", "getIssueType", "()Lco/bird/android/model/IssueType;", "issueType", "", DateTokenConverter.CONVERTER_KEY, "Z", C17296a.f69688o, "()Z", "checked", "enabled", "", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "title", "g", "details", "<init>", "(Lco/bird/android/model/RepairType;Lco/bird/android/model/IssueType;ZZ)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HF4 */
/* loaded from: classes3.dex */
public final class HF4 extends AbstractC47616qi0 {

    /* renamed from: b */
    public final RepairType f13147b;

    /* renamed from: c */
    public final IssueType f13148c;

    /* renamed from: d */
    public final boolean f13149d;

    /* renamed from: e */
    public final boolean f13150e;

    /* renamed from: f */
    public final String f13151f;

    /* renamed from: g */
    public final String f13152g;

    public /* synthetic */ HF4(RepairType repairType, IssueType issueType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(repairType, (i & 2) != 0 ? null : issueType, z, z2);
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: a */
    public boolean mo3250a() {
        return this.f13149d;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: b */
    public String mo3249b() {
        return this.f13152g;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: c */
    public boolean mo3248c() {
        return this.f13150e;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: d */
    public String mo3247d() {
        return this.f13151f;
    }

    /* renamed from: e */
    public final RepairType m104097e() {
        return this.f13147b;
    }

    public HF4(RepairType repairType, IssueType issueType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        this.f13147b = repairType;
        this.f13148c = issueType;
        this.f13149d = z;
        this.f13150e = z2;
        this.f13151f = issueType != null ? issueType.getDisplay() : null;
        this.f13152g = repairType.getDisplay();
    }
}
