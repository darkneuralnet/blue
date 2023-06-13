package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC44199kw1;
import p000.C1577Df;
import p000.InterfaceC40641ew1;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Br\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205ø\u0001\u0000¢\u0006\u0004\b>\u0010?Bh\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205ø\u0001\u0000¢\u0006\u0004\b>\u0010@J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$R \u0010(\u001a\u00020&8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b'\u0010 R\u0017\u0010,\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\u0010\u0010+R\u0017\u00100\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b\u001d\u0010/R\u0017\u00104\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b\u0018\u00103R \u00108\u001a\u0002058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b\n\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m28432d2 = {"Lg26;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LDf;", C17296a.f69688o, "LDf;", "j", "()LDf;", Entry.TYPE_TEXT, "LG26;", "b", "LG26;", "i", "()LG26;", "style", "", "LDf$b;", "LTU3;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "placeholders", DateTokenConverter.CONVERTER_KEY, "I", "e", "()I", "maxLines", "Z", "h", "()Z", "softWrap", "Ln26;", "f", "overflow", "Lg01;", "Lg01;", "()Lg01;", "density", "Lpm2;", "Lpm2;", "()Lpm2;", "layoutDirection", "Lkw1$b;", "Lkw1$b;", "()Lkw1$b;", "fontFamilyResolver", "Lkz0;", "J", "()J", "constraints", "Lew1$b;", "k", "Lew1$b;", "_developerSuppliedResourceLoader", "resourceLoader", "<init>", "(LDf;LG26;Ljava/util/List;IZILg01;Lpm2;Lew1$b;Lkw1$b;J)V", "(LDf;LG26;Ljava/util/List;IZILg01;Lpm2;Lkw1$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41298g26 {

    /* renamed from: a */
    public final C1577Df f81427a;

    /* renamed from: b */
    public final G26 f81428b;

    /* renamed from: c */
    public final List<C1577Df.C1580b<TU3>> f81429c;

    /* renamed from: d */
    public final int f81430d;

    /* renamed from: e */
    public final boolean f81431e;

    /* renamed from: f */
    public final int f81432f;

    /* renamed from: g */
    public final InterfaceC41273g01 f81433g;

    /* renamed from: h */
    public final EnumC47065pm2 f81434h;

    /* renamed from: i */
    public final AbstractC44199kw1.InterfaceC25559b f81435i;

    /* renamed from: j */
    public final long f81436j;

    /* renamed from: k */
    public InterfaceC40641ew1.InterfaceC20148b f81437k;

    public /* synthetic */ C41298g26(C1577Df c1577Df, G26 g26, List list, int i, boolean z, int i2, InterfaceC41273g01 interfaceC41273g01, EnumC47065pm2 enumC47065pm2, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1577Df, g26, list, i, z, i2, interfaceC41273g01, enumC47065pm2, interfaceC25559b, j);
    }

    /* renamed from: a */
    public final long m40268a() {
        return this.f81436j;
    }

    /* renamed from: b */
    public final InterfaceC41273g01 m40267b() {
        return this.f81433g;
    }

    /* renamed from: c */
    public final AbstractC44199kw1.InterfaceC25559b m40266c() {
        return this.f81435i;
    }

    /* renamed from: d */
    public final EnumC47065pm2 m40265d() {
        return this.f81434h;
    }

    /* renamed from: e */
    public final int m40264e() {
        return this.f81430d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41298g26)) {
            return false;
        }
        C41298g26 c41298g26 = (C41298g26) obj;
        if (Intrinsics.areEqual(this.f81427a, c41298g26.f81427a) && Intrinsics.areEqual(this.f81428b, c41298g26.f81428b) && Intrinsics.areEqual(this.f81429c, c41298g26.f81429c) && this.f81430d == c41298g26.f81430d && this.f81431e == c41298g26.f81431e && C45449n26.m24543e(this.f81432f, c41298g26.f81432f) && Intrinsics.areEqual(this.f81433g, c41298g26.f81433g) && this.f81434h == c41298g26.f81434h && Intrinsics.areEqual(this.f81435i, c41298g26.f81435i) && C44228kz0.m28070g(this.f81436j, c41298g26.f81436j)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m40263f() {
        return this.f81432f;
    }

    /* renamed from: g */
    public final List<C1577Df.C1580b<TU3>> m40262g() {
        return this.f81429c;
    }

    /* renamed from: h */
    public final boolean m40261h() {
        return this.f81431e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f81427a.hashCode() * 31) + this.f81428b.hashCode()) * 31) + this.f81429c.hashCode()) * 31) + this.f81430d) * 31) + Boolean.hashCode(this.f81431e)) * 31) + C45449n26.m24542f(this.f81432f)) * 31) + this.f81433g.hashCode()) * 31) + this.f81434h.hashCode()) * 31) + this.f81435i.hashCode()) * 31) + C44228kz0.m28060q(this.f81436j);
    }

    /* renamed from: i */
    public final G26 m40260i() {
        return this.f81428b;
    }

    /* renamed from: j */
    public final C1577Df m40259j() {
        return this.f81427a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f81427a) + ", style=" + this.f81428b + ", placeholders=" + this.f81429c + ", maxLines=" + this.f81430d + ", softWrap=" + this.f81431e + ", overflow=" + ((Object) C45449n26.m24541g(this.f81432f)) + ", density=" + this.f81433g + ", layoutDirection=" + this.f81434h + ", fontFamilyResolver=" + this.f81435i + ", constraints=" + ((Object) C44228kz0.m28059r(this.f81436j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C41298g26(C1577Df c1577Df, G26 g26, List<C1577Df.C1580b<TU3>> list, int i, boolean z, int i2, InterfaceC41273g01 interfaceC41273g01, EnumC47065pm2 enumC47065pm2, InterfaceC40641ew1.InterfaceC20148b interfaceC20148b, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, long j) {
        this.f81427a = c1577Df;
        this.f81428b = g26;
        this.f81429c = list;
        this.f81430d = i;
        this.f81431e = z;
        this.f81432f = i2;
        this.f81433g = interfaceC41273g01;
        this.f81434h = enumC47065pm2;
        this.f81435i = interfaceC25559b;
        this.f81436j = j;
        this.f81437k = interfaceC20148b;
    }

    public C41298g26(C1577Df c1577Df, G26 g26, List<C1577Df.C1580b<TU3>> list, int i, boolean z, int i2, InterfaceC41273g01 interfaceC41273g01, EnumC47065pm2 enumC47065pm2, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, long j) {
        this(c1577Df, g26, list, i, z, i2, interfaceC41273g01, enumC47065pm2, (InterfaceC40641ew1.InterfaceC20148b) null, interfaceC25559b, j);
    }
}
