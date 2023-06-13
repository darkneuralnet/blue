package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0015\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b9\u0010:J6\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002R \u0010\u0010\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\rR\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00104\u001a\u0002018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\r\u001a\u0004\b\u001a\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m28432d2 = {"Lyn2;", "", "", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "LAn2;", "f", "Luc2;", C17296a.f69688o, "I", "b", "()I", "index", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "key", "", "Z", "isVertical", DateTokenConverter.CONVERTER_KEY, "crossAxisSize", "e", "getMainAxisSpacing", "mainAxisSpacing", "reverseLayout", "Lpm2;", "g", "Lpm2;", "layoutDirection", "h", "beforeContentPadding", "i", "afterContentPadding", "", "LOU3;", "j", "Ljava/util/List;", "getPlaceables", "()Ljava/util/List;", "placeables", "Lmn2;", "k", "Lmn2;", "placementAnimator", "LA52;", "l", "J", "visualOffset", "m", "mainAxisSize", "n", "mainAxisSizeWithSpacings", "<init>", "(ILjava/lang/Object;ZIIZLpm2;IILjava/util/List;Lmn2;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,196:1\n33#2,6:197\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n66#1:197,6\n*E\n"})
/* renamed from: yn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52410yn2 {

    /* renamed from: a */
    public final int f120174a;

    /* renamed from: b */
    public final Object f120175b;

    /* renamed from: c */
    public final boolean f120176c;

    /* renamed from: d */
    public final int f120177d;

    /* renamed from: e */
    public final int f120178e;

    /* renamed from: f */
    public final boolean f120179f;

    /* renamed from: g */
    public final EnumC47065pm2 f120180g;

    /* renamed from: h */
    public final int f120181h;

    /* renamed from: i */
    public final int f120182i;

    /* renamed from: j */
    public final List<OU3> f120183j;

    /* renamed from: k */
    public final C45296mn2 f120184k;

    /* renamed from: l */
    public final long f120185l;

    /* renamed from: m */
    public final int f120186m;

    /* renamed from: n */
    public final int f120187n;

    public /* synthetic */ C52410yn2(int i, Object obj, boolean z, int i2, int i3, boolean z2, EnumC47065pm2 enumC47065pm2, int i4, int i5, List list, C45296mn2 c45296mn2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, enumC47065pm2, i4, i5, list, c45296mn2, j);
    }

    /* renamed from: a */
    public final int m2587a() {
        return this.f120177d;
    }

    /* renamed from: b */
    public final int m2586b() {
        return this.f120174a;
    }

    /* renamed from: c */
    public final Object m2585c() {
        return this.f120175b;
    }

    /* renamed from: d */
    public final int m2584d() {
        return this.f120186m;
    }

    /* renamed from: e */
    public final int m2583e() {
        return this.f120187n;
    }

    /* renamed from: f */
    public final C31732An2 m2582f(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        long m114704a;
        long m104430a;
        boolean z = this.f120176c;
        if (z) {
            i7 = i4;
        } else {
            i7 = i3;
        }
        if (z) {
            i8 = i3;
        } else {
            i8 = i4;
        }
        if (z && this.f120180g == EnumC47065pm2.Rtl) {
            i9 = (i8 - i2) - this.f120177d;
        } else {
            i9 = i2;
        }
        if (z) {
            m114704a = B52.m114704a(i9, i);
        } else {
            m114704a = B52.m114704a(i, i9);
        }
        long j = m114704a;
        int i10 = this.f120174a;
        Object obj = this.f120175b;
        if (this.f120176c) {
            m104430a = H52.m104430a(this.f120177d, this.f120186m);
        } else {
            m104430a = H52.m104430a(this.f120186m, this.f120177d);
        }
        return new C31732An2(j, i10, obj, i5, i6, m104430a, -this.f120181h, i7 + this.f120182i, this.f120176c, this.f120183j, this.f120184k, this.f120185l, i7, this.f120179f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C52410yn2(int i, Object obj, boolean z, int i2, int i3, boolean z2, EnumC47065pm2 enumC47065pm2, int i4, int i5, List<? extends OU3> list, C45296mn2 c45296mn2, long j) {
        int coerceAtLeast;
        this.f120174a = i;
        this.f120175b = obj;
        this.f120176c = z;
        this.f120177d = i2;
        this.f120178e = i3;
        this.f120179f = z2;
        this.f120180g = enumC47065pm2;
        this.f120181h = i4;
        this.f120182i = i5;
        this.f120183j = list;
        this.f120184k = c45296mn2;
        this.f120185l = j;
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            OU3 ou3 = (OU3) list.get(i7);
            i6 = Math.max(i6, this.f120176c ? ou3.m92229d1() : ou3.m92226i1());
        }
        this.f120186m = i6;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i6 + this.f120178e, 0);
        this.f120187n = coerceAtLeast;
    }
}
