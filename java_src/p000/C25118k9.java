package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.widget.InterfaceC16662d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lk9;", "Lco/bird/android/widget/d;", "", "textString", "", "duration", "f", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "I", "j", "()I", DateTokenConverter.CONVERTER_KEY, "getColor", "()Ljava/lang/Integer;", "color", "<init>", "(Ljava/lang/String;I)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k9 */
/* loaded from: classes2.dex */
public final class C25118k9 implements InterfaceC16662d {

    /* renamed from: b */
    public final String f93999b;

    /* renamed from: c */
    public final int f94000c;

    /* renamed from: d */
    public final int f94001d = C32364Df4.primaryText;

    public C25118k9(String str, int i) {
        this.f93999b = str;
        this.f94000c = i;
    }

    public static /* synthetic */ C25118k9 copy$default(C25118k9 c25118k9, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c25118k9.f93999b;
        }
        if ((i2 & 2) != 0) {
            i = c25118k9.f94000c;
        }
        return c25118k9.m29241f(str, i);
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
        return InterfaceC16662d.C16663a.m54047f(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: e */
    public String mo13232e() {
        return this.f93999b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C25118k9) {
            C25118k9 c25118k9 = (C25118k9) obj;
            return Intrinsics.areEqual(this.f93999b, c25118k9.f93999b) && this.f94000c == c25118k9.f94000c;
        }
        return false;
    }

    /* renamed from: f */
    public final C25118k9 m29241f(String str, int i) {
        return new C25118k9(str, i);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: g */
    public String mo13230g() {
        return InterfaceC16662d.C16663a.m54045h(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getColor() {
        return Integer.valueOf(this.f94001d);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getIcon() {
        return InterfaceC16662d.C16663a.m54050c(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: h */
    public Integer mo13229h() {
        return InterfaceC16662d.C16663a.m54049d(this);
    }

    public int hashCode() {
        String str = this.f93999b;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f94000c);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: i */
    public Integer mo13228i() {
        return InterfaceC16662d.C16663a.m54046g(this);
    }

    /* renamed from: j */
    public final int m29240j() {
        return this.f94000c;
    }

    public String toString() {
        String str = this.f93999b;
        int i = this.f94000c;
        return "AlarmSheetOption(textString=" + str + ", duration=" + i + ")";
    }
}
