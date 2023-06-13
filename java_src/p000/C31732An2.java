package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0080\u0001\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020%\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00100\u001a\u00020\t\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bR#\u0010\u0013\u001a\u00020\t8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R#\u0010!\u001a\u00020 8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u001d\u00100\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010\u0010R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0015R\u0014\u00103\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0017\u00106\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b#\u00105R\u0011\u00107\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0018\u00109\u001a\u00020\u0002*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00108\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m28432d2 = {"LAn2;", "Lln2;", "", "index", "k", "j", "g", "f", "Ltm1;", "LA52;", "e", "LOU3$a;", Action.SCOPE_ATTRIBUTE, "", "n", C17296a.f69688o, "J", "c", "()J", "offset", "b", "I", "getIndex", "()I", "", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "key", DateTokenConverter.CONVERTER_KEY, "row", "column", "LG52;", "size", "minMainAxisOffset", "h", "maxMainAxisOffset", "", "Z", "isVertical", "", "LOU3;", "Ljava/util/List;", "placeables", "Lmn2;", "Lmn2;", "placementAnimator", "l", "visualOffset", "m", "mainAxisLayoutSize", "reverseLayout", "o", "()Z", "hasAnimations", "placeablesCount", "(LOU3;)I", "mainAxisSize", "<init>", "(JILjava/lang/Object;IIJIIZLjava/util/List;Lmn2;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,196:1\n194#1:197\n86#2:198\n86#2:199\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n*L\n178#1:197\n185#1:198\n187#1:199\n*E\n"})
/* renamed from: An2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31732An2 implements InterfaceC44703ln2 {

    /* renamed from: a */
    public final long f1069a;

    /* renamed from: b */
    public final int f1070b;

    /* renamed from: c */
    public final Object f1071c;

    /* renamed from: d */
    public final int f1072d;

    /* renamed from: e */
    public final int f1073e;

    /* renamed from: f */
    public final long f1074f;

    /* renamed from: g */
    public final int f1075g;

    /* renamed from: h */
    public final int f1076h;

    /* renamed from: i */
    public final boolean f1077i;

    /* renamed from: j */
    public final List<OU3> f1078j;

    /* renamed from: k */
    public final C45296mn2 f1079k;

    /* renamed from: l */
    public final long f1080l;

    /* renamed from: m */
    public final int f1081m;

    /* renamed from: n */
    public final boolean f1082n;

    /* renamed from: o */
    public final boolean f1083o;

    public /* synthetic */ C31732An2(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List list, C45296mn2 c45296mn2, long j3, int i6, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, obj, i2, i3, j2, i4, i5, z, list, c45296mn2, j3, i6, z2);
    }

    @Override // p000.InterfaceC44703ln2
    /* renamed from: a */
    public long mo26835a() {
        return this.f1074f;
    }

    @Override // p000.InterfaceC44703ln2
    /* renamed from: b */
    public int mo26834b() {
        return this.f1073e;
    }

    @Override // p000.InterfaceC44703ln2
    /* renamed from: c */
    public long mo26833c() {
        return this.f1069a;
    }

    @Override // p000.InterfaceC44703ln2
    /* renamed from: d */
    public int mo26832d() {
        return this.f1072d;
    }

    /* renamed from: e */
    public final InterfaceC49435tm1<A52> m115264e(int i) {
        Object mo77401c = this.f1078j.get(i).mo77401c();
        if (mo77401c instanceof InterfaceC49435tm1) {
            return (InterfaceC49435tm1) mo77401c;
        }
        return null;
    }

    /* renamed from: f */
    public final int m115263f() {
        return this.f1077i ? A52.m116111j(mo26833c()) : A52.m116110k(mo26833c());
    }

    /* renamed from: g */
    public final int m115262g() {
        return this.f1077i ? G52.m105829g(mo26835a()) : G52.m105830f(mo26835a());
    }

    @Override // p000.InterfaceC44703ln2
    public int getIndex() {
        return this.f1070b;
    }

    /* renamed from: h */
    public final boolean m115261h() {
        return this.f1083o;
    }

    /* renamed from: i */
    public Object m115260i() {
        return this.f1071c;
    }

    /* renamed from: j */
    public final int m115259j() {
        return this.f1077i ? G52.m105830f(mo26835a()) : G52.m105829g(mo26835a());
    }

    /* renamed from: k */
    public final int m115258k(int i) {
        return m115257l(this.f1078j.get(i));
    }

    /* renamed from: l */
    public final int m115257l(OU3 ou3) {
        return this.f1077i ? ou3.m92229d1() : ou3.m92226i1();
    }

    /* renamed from: m */
    public final int m115256m() {
        return this.f1078j.size();
    }

    /* renamed from: n */
    public final void m115255n(OU3.AbstractC6015a scope) {
        long mo26833c;
        int m116111j;
        int m116110k;
        Intrinsics.checkNotNullParameter(scope, "scope");
        int m115256m = m115256m();
        for (int i = 0; i < m115256m; i++) {
            OU3 ou3 = this.f1078j.get(i);
            int m115257l = this.f1075g - m115257l(ou3);
            int i2 = this.f1076h;
            if (m115264e(i) != null) {
                mo26833c = this.f1079k.m25003d(m115260i(), i, m115257l, i2, mo26833c());
            } else {
                mo26833c = mo26833c();
            }
            if (this.f1082n) {
                if (this.f1077i) {
                    m116111j = A52.m116111j(mo26833c);
                } else {
                    m116111j = (this.f1081m - A52.m116111j(mo26833c)) - m115257l(ou3);
                }
                if (this.f1077i) {
                    m116110k = (this.f1081m - A52.m116110k(mo26833c)) - m115257l(ou3);
                } else {
                    m116110k = A52.m116110k(mo26833c);
                }
                mo26833c = B52.m114704a(m116111j, m116110k);
            }
            if (this.f1077i) {
                long j = this.f1080l;
                OU3.AbstractC6015a.m92221B(scope, ou3, B52.m114704a(A52.m116111j(mo26833c) + A52.m116111j(j), A52.m116110k(mo26833c) + A52.m116110k(j)), 0.0f, null, 6, null);
            } else {
                long j2 = this.f1080l;
                OU3.AbstractC6015a.m92199x(scope, ou3, B52.m114704a(A52.m116111j(mo26833c) + A52.m116111j(j2), A52.m116110k(mo26833c) + A52.m116110k(j2)), 0.0f, null, 6, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31732An2(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List<? extends OU3> list, C45296mn2 c45296mn2, long j3, int i6, boolean z2) {
        this.f1069a = j;
        this.f1070b = i;
        this.f1071c = obj;
        this.f1072d = i2;
        this.f1073e = i3;
        this.f1074f = j2;
        this.f1075g = i4;
        this.f1076h = i5;
        this.f1077i = z;
        this.f1078j = list;
        this.f1079k = c45296mn2;
        this.f1080l = j3;
        this.f1081m = i6;
        this.f1082n = z2;
        int m115256m = m115256m();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= m115256m) {
                break;
            } else if (m115264e(i7) != null) {
                z3 = true;
                break;
            } else {
                i7++;
            }
        }
        this.f1083o = z3;
    }
}
