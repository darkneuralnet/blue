package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JK\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0013\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0017\u001a\u00020\u0005H&J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m28432d2 = {"LhF5;", "", "", "LCF5;", "types", "", "macAddresses", "", "rssiThreshold", "Lio/reactivex/k;", "", "LsE5;", "e", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Integer;)Lio/reactivex/k;", "LjI5;", "T", "smartlock", "Lkotlin/time/Duration;", "timeout", "Lio/reactivex/F;", "Lcy0;", "c", "(LsE5;J)Lio/reactivex/F;", "macAddress", "LvE5;", DateTokenConverter.CONVERTER_KEY, "smartLock", "", "exception", "", "b", "LwE5;", "eventType", C17296a.f69688o, "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC42015hF5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hF5$a */
    /* loaded from: classes4.dex */
    public static final class C22603a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC24490k scan$default(InterfaceC42015hF5 interfaceC42015hF5, Set set, Set set2, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    set = null;
                }
                if ((i & 2) != 0) {
                    set2 = null;
                }
                if ((i & 4) != 0) {
                    num = null;
                }
                return interfaceC42015hF5.mo19727e(set, set2, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scan");
        }
    }

    /* renamed from: a */
    void mo19731a(C48528sE5 c48528sE5, EnumC50899wE5 enumC50899wE5);

    /* renamed from: b */
    void mo19730b(C48528sE5 c48528sE5, Throwable th);

    /* renamed from: c */
    <T extends InterfaceC43228jI5> AbstractC23442F<C39475cy0<T>> mo19729c(C48528sE5 c48528sE5, long j);

    /* renamed from: d */
    AbstractC24490k<C50306vE5> mo19728d(String str);

    /* renamed from: e */
    AbstractC24490k<List<C48528sE5>> mo19727e(Set<? extends CF5> set, Set<String> set2, Integer num);
}
