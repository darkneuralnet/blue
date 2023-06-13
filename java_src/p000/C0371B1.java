package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.widget.InterfaceC16662d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJJ\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014¨\u0006\u001e"}, m28432d2 = {"LB1;", "Lco/bird/android/widget/d;", "", "textString", "subtitleStr", "iconUrl", "", "iconEnd", "accelerationLevel", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)LB1;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "g", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "j", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B1 */
/* loaded from: classes2.dex */
public final class C0371B1 implements InterfaceC16662d {

    /* renamed from: b */
    public final String f1530b;

    /* renamed from: c */
    public final String f1531c;

    /* renamed from: d */
    public final String f1532d;

    /* renamed from: e */
    public final Integer f1533e;

    /* renamed from: f */
    public final String f1534f;

    public C0371B1(String str, String str2, String str3, Integer num, String accelerationLevel) {
        Intrinsics.checkNotNullParameter(accelerationLevel, "accelerationLevel");
        this.f1530b = str;
        this.f1531c = str2;
        this.f1532d = str3;
        this.f1533e = num;
        this.f1534f = accelerationLevel;
    }

    public static /* synthetic */ C0371B1 copy$default(C0371B1 c0371b1, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0371b1.f1530b;
        }
        if ((i & 2) != 0) {
            str2 = c0371b1.f1531c;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c0371b1.f1532d;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = c0371b1.f1533e;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = c0371b1.f1534f;
        }
        return c0371b1.m114794f(str, str5, str6, num2, str4);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: a */
    public Integer mo13236a() {
        return InterfaceC16662d.C16663a.m54044i(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: b */
    public boolean mo13235b() {
        return InterfaceC16662d.C16663a.m54052a(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: c */
    public Integer mo13234c() {
        return InterfaceC16662d.C16663a.m54048e(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: d */
    public String mo13233d() {
        return this.f1532d;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: e */
    public String mo13232e() {
        return this.f1530b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0371B1) {
            C0371B1 c0371b1 = (C0371B1) obj;
            return Intrinsics.areEqual(this.f1530b, c0371b1.f1530b) && Intrinsics.areEqual(this.f1531c, c0371b1.f1531c) && Intrinsics.areEqual(this.f1532d, c0371b1.f1532d) && Intrinsics.areEqual(this.f1533e, c0371b1.f1533e) && Intrinsics.areEqual(this.f1534f, c0371b1.f1534f);
        }
        return false;
    }

    /* renamed from: f */
    public final C0371B1 m114794f(String str, String str2, String str3, Integer num, String accelerationLevel) {
        Intrinsics.checkNotNullParameter(accelerationLevel, "accelerationLevel");
        return new C0371B1(str, str2, str3, num, accelerationLevel);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: g */
    public String mo13230g() {
        return this.f1531c;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getColor() {
        return InterfaceC16662d.C16663a.m54051b(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getIcon() {
        return InterfaceC16662d.C16663a.m54050c(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: h */
    public Integer mo13229h() {
        return this.f1533e;
    }

    public int hashCode() {
        String str = this.f1530b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1531c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1532d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f1533e;
        return ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.f1534f.hashCode();
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: i */
    public Integer mo13228i() {
        return InterfaceC16662d.C16663a.m54046g(this);
    }

    /* renamed from: j */
    public final String m114793j() {
        return this.f1534f;
    }

    public String toString() {
        String str = this.f1530b;
        String str2 = this.f1531c;
        String str3 = this.f1532d;
        Integer num = this.f1533e;
        String str4 = this.f1534f;
        return "AccelerationProfileOption(textString=" + str + ", subtitleStr=" + str2 + ", iconUrl=" + str3 + ", iconEnd=" + num + ", accelerationLevel=" + str4 + ")";
    }

    public /* synthetic */ C0371B1(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num, str4);
    }
}
