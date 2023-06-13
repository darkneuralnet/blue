package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetMapButtonOverrides;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m28432d2 = {"LQk3;", "", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "LQk3$a;", "LQk3$b;", "LQk3$c;", "LQk3$d;", "LQk3$e;", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qk3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC35450Qk3 {

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LQk3$a;", "LQk3;", "", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetMapButtonOverrides;", "overrides", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qk3$a */
    /* loaded from: classes2.dex */
    public static final class C6851a implements InterfaceC35450Qk3 {

        /* renamed from: a */
        public final List<BountyFlightSheetMapButtonOverrides> f30816a;

        public C6851a(List<BountyFlightSheetMapButtonOverrides> overrides) {
            Intrinsics.checkNotNullParameter(overrides, "overrides");
            this.f30816a = overrides;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C6851a copy$default(C6851a c6851a, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = c6851a.f30816a;
            }
            return c6851a.m88099a(list);
        }

        /* renamed from: a */
        public final C6851a m88099a(List<BountyFlightSheetMapButtonOverrides> overrides) {
            Intrinsics.checkNotNullParameter(overrides, "overrides");
            return new C6851a(overrides);
        }

        /* renamed from: b */
        public final List<BountyFlightSheetMapButtonOverrides> m88098b() {
            return this.f30816a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6851a) && Intrinsics.areEqual(this.f30816a, ((C6851a) obj).f30816a);
        }

        public int hashCode() {
            return this.f30816a.hashCode();
        }

        public String toString() {
            List<BountyFlightSheetMapButtonOverrides> list = this.f30816a;
            return "Bounty(overrides=" + list + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LQk3$b;", "LQk3;", "", "claimed", "", "newClaimErrorMessage", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(ZLjava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qk3$b */
    /* loaded from: classes2.dex */
    public static final class C6852b implements InterfaceC35450Qk3 {

        /* renamed from: a */
        public final boolean f30817a;

        /* renamed from: b */
        public final String f30818b;

        public C6852b(boolean z, String str) {
            this.f30817a = z;
            this.f30818b = str;
        }

        public static /* synthetic */ C6852b copy$default(C6852b c6852b, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c6852b.f30817a;
            }
            if ((i & 2) != 0) {
                str = c6852b.f30818b;
            }
            return c6852b.m88097a(z, str);
        }

        /* renamed from: a */
        public final C6852b m88097a(boolean z, String str) {
            return new C6852b(z, str);
        }

        /* renamed from: b */
        public final boolean m88096b() {
            return this.f30817a;
        }

        /* renamed from: c */
        public final String m88095c() {
            return this.f30818b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C6852b) {
                C6852b c6852b = (C6852b) obj;
                return this.f30817a == c6852b.f30817a && Intrinsics.areEqual(this.f30818b, c6852b.f30818b);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.f30817a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.f30818b;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            boolean z = this.f30817a;
            String str = this.f30818b;
            return "Nest(claimed=" + z + ", newClaimErrorMessage=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LQk3$c;", "LQk3;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qk3$c */
    /* loaded from: classes2.dex */
    public static final class C6853c implements InterfaceC35450Qk3 {

        /* renamed from: a */
        public static final C6853c f30819a = new C6853c();

        private C6853c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LQk3$d;", "LQk3;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qk3$d */
    /* loaded from: classes2.dex */
    public static final class C6854d implements InterfaceC35450Qk3 {

        /* renamed from: a */
        public static final C6854d f30820a = new C6854d();

        private C6854d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LQk3$e;", "LQk3;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qk3$e */
    /* loaded from: classes2.dex */
    public static final class C6855e implements InterfaceC35450Qk3 {

        /* renamed from: a */
        public static final C6855e f30821a = new C6855e();

        private C6855e() {
        }
    }
}
