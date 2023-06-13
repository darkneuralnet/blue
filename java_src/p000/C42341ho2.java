package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lho2;", "", "", "start", "end", "Lho2$a;", C17296a.f69688o, "interval", "", "e", "", DateTokenConverter.CONVERTER_KEY, "LLX2;", "LLX2;", "beyondBoundsItems", "c", "()I", "b", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,126:1\n1182#2:127\n1161#2,2:128\n460#3,11:130\n460#3,11:141\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:141,11\n*E\n"})
/* renamed from: ho2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42341ho2 {

    /* renamed from: a */
    public final LX2<C22728a> f85897a = new LX2<>(new C22728a[16], 0);

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lho2$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "I", "b", "()I", "start", "end", "<init>", "(II)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ho2$a */
    /* loaded from: classes.dex */
    public static final class C22728a {

        /* renamed from: a */
        public final int f85898a;

        /* renamed from: b */
        public final int f85899b;

        public C22728a(int i, int i2) {
            boolean z;
            this.f85898a = i;
            this.f85899b = i2;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 >= i) {
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        public final int m35848a() {
            return this.f85899b;
        }

        /* renamed from: b */
        public final int m35847b() {
            return this.f85898a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C22728a) {
                C22728a c22728a = (C22728a) obj;
                return this.f85898a == c22728a.f85898a && this.f85899b == c22728a.f85899b;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f85898a) * 31) + Integer.hashCode(this.f85899b);
        }

        public String toString() {
            return "Interval(start=" + this.f85898a + ", end=" + this.f85899b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* renamed from: a */
    public final C22728a m35853a(int i, int i2) {
        C22728a c22728a = new C22728a(i, i2);
        this.f85897a.m96701b(c22728a);
        return c22728a;
    }

    /* renamed from: b */
    public final int m35852b() {
        int m35848a = this.f85897a.m96692o().m35848a();
        LX2<C22728a> lx2 = this.f85897a;
        int m96690u = lx2.m96690u();
        if (m96690u > 0) {
            C22728a[] m96691s = lx2.m96691s();
            int i = 0;
            do {
                C22728a c22728a = m96691s[i];
                if (c22728a.m35848a() > m35848a) {
                    m35848a = c22728a.m35848a();
                }
                i++;
            } while (i < m96690u);
            return m35848a;
        }
        return m35848a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m35851c() {
        int m35847b = this.f85897a.m96692o().m35847b();
        LX2<C22728a> lx2 = this.f85897a;
        int m96690u = lx2.m96690u();
        boolean z = false;
        if (m96690u > 0) {
            C22728a[] m96691s = lx2.m96691s();
            int i = 0;
            do {
                C22728a c22728a = m96691s[i];
                if (c22728a.m35847b() < m35847b) {
                    m35847b = c22728a.m35847b();
                }
                i++;
            } while (i < m96690u);
            if (m35847b >= 0) {
                z = true;
            }
            if (!z) {
                return m35847b;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (m35847b >= 0) {
        }
        if (!z) {
        }
    }

    /* renamed from: d */
    public final boolean m35850d() {
        return this.f85897a.m96687x();
    }

    /* renamed from: e */
    public final void m35849e(C22728a interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f85897a.m96709A(interval);
    }
}
