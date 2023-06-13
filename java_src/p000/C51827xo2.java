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
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u001d\u0012\u0006\u0010.\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b6\u00107J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010,\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u000fR\u0017\u00101\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b\u0019\u00100R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u0011R\u0018\u00105\u001a\u00020\u0002*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u00104\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, m28432d2 = {"Lxo2;", "Lmo2;", "", "index", "LA52;", "h", "(I)J", "f", "Ltm1;", "c", "LOU3$a;", Action.SCOPE_ATTRIBUTE, "", "j", C17296a.f69688o, "I", "b", "()I", "offset", "getIndex", "", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "key", DateTokenConverter.CONVERTER_KEY, "size", "minMainAxisOffset", "maxMainAxisOffset", "", "g", "Z", "isVertical", "", "Lwo2;", "Ljava/util/List;", "wrappers", "Lno2;", "i", "Lno2;", "placementAnimator", "J", "visualOffset", "k", "reverseLayout", "l", "mainAxisLayoutSize", "m", "()Z", "hasAnimations", "placeablesCount", "LOU3;", "(LOU3;)I", "mainAxisSize", "<init>", "(IILjava/lang/Object;IIIZLjava/util/List;Lno2;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,193:1\n186#1:194\n86#2:195\n86#2:196\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n*L\n170#1:194\n177#1:195\n179#1:196\n*E\n"})
/* renamed from: xo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51827xo2 implements InterfaceC45306mo2 {

    /* renamed from: a */
    public final int f118153a;

    /* renamed from: b */
    public final int f118154b;

    /* renamed from: c */
    public final Object f118155c;

    /* renamed from: d */
    public final int f118156d;

    /* renamed from: e */
    public final int f118157e;

    /* renamed from: f */
    public final int f118158f;

    /* renamed from: g */
    public final boolean f118159g;

    /* renamed from: h */
    public final List<C51234wo2> f118160h;

    /* renamed from: i */
    public final C45899no2 f118161i;

    /* renamed from: j */
    public final long f118162j;

    /* renamed from: k */
    public final boolean f118163k;

    /* renamed from: l */
    public final int f118164l;

    /* renamed from: m */
    public final boolean f118165m;

    public /* synthetic */ C51827xo2(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List list, C45899no2 c45899no2, long j, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, obj, i3, i4, i5, z, list, c45899no2, j, z2, i6);
    }

    @Override // p000.InterfaceC45306mo2
    /* renamed from: a */
    public int mo4640a() {
        return this.f118156d;
    }

    @Override // p000.InterfaceC45306mo2
    /* renamed from: b */
    public int mo4639b() {
        return this.f118153a;
    }

    /* renamed from: c */
    public final InterfaceC49435tm1<A52> m4638c(int i) {
        Object mo77401c = this.f118160h.get(i).m6309b().mo77401c();
        if (mo77401c instanceof InterfaceC49435tm1) {
            return (InterfaceC49435tm1) mo77401c;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m4637d() {
        return this.f118165m;
    }

    /* renamed from: e */
    public Object m4636e() {
        return this.f118155c;
    }

    /* renamed from: f */
    public final int m4635f(int i) {
        return m4634g(this.f118160h.get(i).m6309b());
    }

    /* renamed from: g */
    public final int m4634g(OU3 ou3) {
        return this.f118159g ? ou3.m92229d1() : ou3.m92226i1();
    }

    @Override // p000.InterfaceC45306mo2
    public int getIndex() {
        return this.f118154b;
    }

    /* renamed from: h */
    public final long m4633h(int i) {
        return this.f118160h.get(i).m6310a();
    }

    /* renamed from: i */
    public final int m4632i() {
        return this.f118160h.size();
    }

    /* renamed from: j */
    public final void m4631j(OU3.AbstractC6015a scope) {
        long m4633h;
        int m116111j;
        int m116110k;
        Intrinsics.checkNotNullParameter(scope, "scope");
        int m4632i = m4632i();
        for (int i = 0; i < m4632i; i++) {
            OU3 m6309b = this.f118160h.get(i).m6309b();
            int m4634g = this.f118157e - m4634g(m6309b);
            int i2 = this.f118158f;
            if (m4638c(i) != null) {
                m4633h = this.f118161i.m22353d(m4636e(), i, m4634g, i2, m4633h(i));
            } else {
                m4633h = m4633h(i);
            }
            if (this.f118163k) {
                if (this.f118159g) {
                    m116111j = A52.m116111j(m4633h);
                } else {
                    m116111j = (this.f118164l - A52.m116111j(m4633h)) - m4634g(m6309b);
                }
                if (this.f118159g) {
                    m116110k = (this.f118164l - A52.m116110k(m4633h)) - m4634g(m6309b);
                } else {
                    m116110k = A52.m116110k(m4633h);
                }
                m4633h = B52.m114704a(m116111j, m116110k);
            }
            if (this.f118159g) {
                long j = this.f118162j;
                OU3.AbstractC6015a.m92221B(scope, m6309b, B52.m114704a(A52.m116111j(m4633h) + A52.m116111j(j), A52.m116110k(m4633h) + A52.m116110k(j)), 0.0f, null, 6, null);
            } else {
                long j2 = this.f118162j;
                OU3.AbstractC6015a.m92199x(scope, m6309b, B52.m114704a(A52.m116111j(m4633h) + A52.m116111j(j2), A52.m116110k(m4633h) + A52.m116110k(j2)), 0.0f, null, 6, null);
            }
        }
    }

    public C51827xo2(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List<C51234wo2> list, C45899no2 c45899no2, long j, boolean z2, int i6) {
        this.f118153a = i;
        this.f118154b = i2;
        this.f118155c = obj;
        this.f118156d = i3;
        this.f118157e = i4;
        this.f118158f = i5;
        this.f118159g = z;
        this.f118160h = list;
        this.f118161i = c45899no2;
        this.f118162j = j;
        this.f118163k = z2;
        this.f118164l = i6;
        int m4632i = m4632i();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= m4632i) {
                break;
            } else if (m4638c(i7) != null) {
                z3 = true;
                break;
            } else {
                i7++;
            }
        }
        this.f118165m = z3;
    }
}
