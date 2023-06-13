package bo.app;

import android.app.Activity;
import bo.app.C13176v3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&J\u001e\u0010\f\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH&R\u001c\u0010\"\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b\f\u0010$R\u0016\u0010&\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, m28432d2 = {"Lbo/app/y1;", "", "", "c", "Landroid/app/Activity;", "activity", "openSession", "closeSession", DateTokenConverter.CONVERTER_KEY, "Lbo/app/u1;", "event", "", C17296a.f69688o, "", "throwable", "Lbo/app/v3$a;", "respondWithBuilder", "b", "Lbo/app/z1;", "request", "Lbo/app/x1;", "location", "geofenceEvent", "Lbo/app/s5;", "templatedTriggeredAction", "Lbo/app/t2;", "triggerEvent", "", "", "deviceLogs", "", "creationTime", "lastCardUpdatedAt", "lastFullSyncAt", "isOutboundNetworkRequestsOffline", "()Z", "(Z)V", "()Ljava/lang/String;", "userId", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.y1 */
/* loaded from: classes.dex */
public interface InterfaceC13231y1 {
    /* renamed from: a */
    String mo62760a();

    /* renamed from: a */
    void mo62759a(long j, long j2);

    /* renamed from: a */
    void mo62758a(C13117s5 c13117s5, InterfaceC13145t2 interfaceC13145t2);

    /* renamed from: a */
    void mo62757a(InterfaceC13145t2 interfaceC13145t2);

    /* renamed from: a */
    void mo62755a(C13176v3.C13177a c13177a);

    /* renamed from: a */
    void mo62754a(InterfaceC13200x1 interfaceC13200x1);

    /* renamed from: a */
    void mo62753a(InterfaceC13280z1 interfaceC13280z1);

    /* renamed from: a */
    void mo62752a(Throwable th);

    /* renamed from: a */
    void mo62751a(List<String> list, long j);

    /* renamed from: a */
    void mo62750a(boolean z);

    /* renamed from: a */
    boolean mo62756a(InterfaceC13160u1 interfaceC13160u1);

    /* renamed from: b */
    void mo62749b();

    /* renamed from: b */
    void mo62748b(InterfaceC13160u1 interfaceC13160u1);

    /* renamed from: c */
    void mo62747c();

    void closeSession(Activity activity);

    /* renamed from: d */
    void mo62746d();

    void openSession(Activity activity);
}
