package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0013H&R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00170\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m28432d2 = {"Lot5;", "", "Lio/reactivex/c;", "G", "", "includeNonPersisted", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "g", "Lot5$b;", "filterDiff", "b", "filters", "Lio/reactivex/F;", C17296a.f69688o, "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "option", "enabled", "", "f", DateTokenConverter.CONVERTER_KEY, "LZ84;", "Lco/bird/android/buava/Optional;", "e", "()LZ84;", "overriddenOperatorFilters", "c", "()Z", "isOverridden", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ot5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC46545ot5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ot5$a */
    /* loaded from: classes2.dex */
    public static final class C27099a {
        public static /* synthetic */ Observable streamOperatorFilters$default(InterfaceC46545ot5 interfaceC46545ot5, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return interfaceC46545ot5.mo6176g(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamOperatorFilters");
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lot5$b;", "", "", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "", "modifiedCount", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "c", "()I", "<init>", "(Ljava/util/List;I)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ot5$b */
    /* loaded from: classes2.dex */
    public static final class C27100b {

        /* renamed from: a */
        public final List<OperatorFilter> f102723a;

        /* renamed from: b */
        public final int f102724b;

        /* JADX WARN: Multi-variable type inference failed */
        public C27100b(List<? extends OperatorFilter> filters, int i) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f102723a = filters;
            this.f102724b = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C27100b copy$default(C27100b c27100b, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = c27100b.f102723a;
            }
            if ((i2 & 2) != 0) {
                i = c27100b.f102724b;
            }
            return c27100b.m20358a(list, i);
        }

        /* renamed from: a */
        public final C27100b m20358a(List<? extends OperatorFilter> filters, int i) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            return new C27100b(filters, i);
        }

        /* renamed from: b */
        public final List<OperatorFilter> m20357b() {
            return this.f102723a;
        }

        /* renamed from: c */
        public final int m20356c() {
            return this.f102724b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27100b) {
                C27100b c27100b = (C27100b) obj;
                return Intrinsics.areEqual(this.f102723a, c27100b.f102723a) && this.f102724b == c27100b.f102724b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f102723a.hashCode() * 31) + Integer.hashCode(this.f102724b);
        }

        public String toString() {
            List<OperatorFilter> list = this.f102723a;
            int i = this.f102724b;
            return "FilterDiff(filters=" + list + ", modifiedCount=" + i + ")";
        }
    }

    /* renamed from: G */
    AbstractC23461c mo6183G();

    /* renamed from: a */
    AbstractC23442F<C27100b> mo6182a(List<? extends OperatorFilter> list);

    /* renamed from: b */
    AbstractC23461c mo6181b(C27100b c27100b);

    /* renamed from: c */
    boolean mo6180c();

    /* renamed from: d */
    void mo6179d();

    /* renamed from: e */
    Z84<Optional<List<OperatorFilter>>> mo6178e();

    /* renamed from: f */
    void mo6177f(OperatorFilterOption operatorFilterOption, boolean z);

    /* renamed from: g */
    Observable<List<OperatorFilter>> mo6176g(boolean z);
}
