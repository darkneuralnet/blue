package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.persistence.Announcement;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u000f"}, m28432d2 = {"Ljg;", "LbI4;", "Lio/reactivex/c;", "p", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/Announcement;", "b0", "F", "", "announcementId", "q", "e1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jg */
/* loaded from: classes2.dex */
public interface InterfaceC24980jg extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jg$a */
    /* loaded from: classes2.dex */
    public static final class C24981a {
        /* renamed from: a */
        public static <T> Observable<T> m30126a(InterfaceC24980jg interfaceC24980jg, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC24980jg, receiver);
        }
    }

    /* renamed from: F */
    Observable<List<Announcement>> mo25199F();

    /* renamed from: b0 */
    Observable<List<Announcement>> mo25193b0(AnnouncementContext announcementContext);

    /* renamed from: e1 */
    AbstractC23461c mo25192e1();

    /* renamed from: p */
    AbstractC23461c mo25191p();

    /* renamed from: q */
    AbstractC23461c mo25190q(String str);
}
