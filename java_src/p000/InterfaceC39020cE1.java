package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m28432d2 = {"LcE1;", "", "Lg01;", "", "availableSize", "spacing", "", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC39020cE1 {

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, m28432d2 = {"LcE1$a;", "LcE1;", "Lg01;", "", "availableSize", "spacing", "", C17296a.f69688o, "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "count", "<init>", "(I)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: cE1$a */
    /* loaded from: classes.dex */
    public static final class C13475a implements InterfaceC39020cE1 {

        /* renamed from: a */
        public final int f60316a;

        public C13475a(int i) {
            boolean z;
            this.f60316a = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // p000.InterfaceC39020cE1
        /* renamed from: a */
        public List<Integer> mo61652a(InterfaceC41273g01 interfaceC41273g01, int i, int i2) {
            List<Integer> m29927c;
            Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
            m29927c = C43517jn2.m29927c(i, this.f60316a, i2);
            return m29927c;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C13475a) && this.f60316a == ((C13475a) obj).f60316a;
        }

        public int hashCode() {
            return -this.f60316a;
        }
    }

    /* renamed from: a */
    List<Integer> mo61652a(InterfaceC41273g01 interfaceC41273g01, int i, int i2);
}
