package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.notificationcenter.NotificationCenterActivity;
import co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity;
import com.facebook.share.internal.C17296a;
import dagger.Component;
import kotlin.Metadata;
import p000.InterfaceC52874za3;
@Component(dependencies = {InterfaceC44393lG2.class}, modules = {C38657bd3.class})
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28432d2 = {"Lpa3;", "", "Lco/bird/android/feature/notificationcenter/NotificationCenterActivity;", "activity", "", C17296a.f69688o, "Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;", "c", "LAa3;", "b", "()LAa3;", "fragmentNavigator", "Lza3$a;", DateTokenConverter.CONVERTER_KEY, "()Lza3$a;", "notificationCenterFragment", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pa3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC46946pa3 {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lpa3$a;", "", "LlG2;", "mainComponent", "Lbd3;", "notificationModule", "Lpa3;", C17296a.f69688o, "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pa3$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC27318a {
        /* renamed from: a */
        InterfaceC46946pa3 mo19098a(InterfaceC44393lG2 interfaceC44393lG2, C38657bd3 c38657bd3);
    }

    /* renamed from: a */
    void mo19102a(NotificationCenterActivity notificationCenterActivity);

    /* renamed from: b */
    C31616Aa3 mo19101b();

    /* renamed from: c */
    void mo19100c(NotificationDetailsActivity notificationDetailsActivity);

    /* renamed from: d */
    InterfaceC52874za3.InterfaceC31046a mo19099d();
}
