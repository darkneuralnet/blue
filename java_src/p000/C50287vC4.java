package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LvC4;", "Lqi0;", "Lco/bird/android/model/RepairType;", "b", "Lco/bird/android/model/RepairType;", "e", "()Lco/bird/android/model/RepairType;", "repairType", "", "c", "Z", C17296a.f69688o, "()Z", "checked", DateTokenConverter.CONVERTER_KEY, "enabled", "", "Ljava/lang/String;", "()Ljava/lang/String;", "title", "f", "details", "<init>", "(Lco/bird/android/model/RepairType;ZZ)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vC4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50287vC4 extends AbstractC47616qi0 {

    /* renamed from: b */
    public final RepairType f113683b;

    /* renamed from: c */
    public final boolean f113684c;

    /* renamed from: d */
    public final boolean f113685d;

    /* renamed from: e */
    public final String f113686e;

    /* renamed from: f */
    public final String f113687f;

    public C50287vC4(RepairType repairType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        this.f113683b = repairType;
        this.f113684c = z;
        this.f113685d = z2;
        this.f113686e = repairType.getDisplay();
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: a */
    public boolean mo3250a() {
        return this.f113684c;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: b */
    public String mo3249b() {
        return this.f113687f;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: c */
    public boolean mo3248c() {
        return this.f113685d;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: d */
    public String mo3247d() {
        return this.f113686e;
    }

    /* renamed from: e */
    public final RepairType m9025e() {
        return this.f113683b;
    }
}
