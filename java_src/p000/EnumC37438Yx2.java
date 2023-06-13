package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.InterfaceC16662d;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B+\b\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u0007j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m28432d2 = {"LYx2;", "", "Lco/bird/android/widget/d;", "", "b", "I", C17296a.f69688o, "()Ljava/lang/Integer;", Entry.TYPE_TEXT, "c", "Ljava/lang/Integer;", "i", "subText", DateTokenConverter.CONVERTER_KEY, "getIcon", "icon", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V", "e", "f", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC37438Yx2 implements InterfaceC16662d {
    AND(C45871nl4.and_capitalized, Integer.valueOf(C45871nl4.and_filter_description), Integer.valueOf(C48193rg4.ic_filter_and)),
    OR(C45871nl4.or_capitalized, Integer.valueOf(C45871nl4.or_filter_description), Integer.valueOf(C48193rg4.ic_filter_or));
    

    /* renamed from: b */
    public final int f47660b;

    /* renamed from: c */
    public final Integer f47661c;

    /* renamed from: d */
    public final Integer f47662d;

    EnumC37438Yx2(int i, Integer num, Integer num2) {
        this.f47660b = i;
        this.f47661c = num;
        this.f47662d = num2;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: a */
    public Integer mo13236a() {
        return Integer.valueOf(this.f47660b);
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
        return InterfaceC16662d.C16663a.m54043j(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: g */
    public String mo13230g() {
        return InterfaceC16662d.C16663a.m54045h(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getColor() {
        return InterfaceC16662d.C16663a.m54051b(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getIcon() {
        return this.f47662d;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: h */
    public Integer mo13229h() {
        return InterfaceC16662d.C16663a.m54049d(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: i */
    public Integer mo13228i() {
        return this.f47661c;
    }
}
