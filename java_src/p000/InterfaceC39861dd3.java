package p000;

import android.app.Notification;
import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.google.firebase.messaging.RemoteMessage;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import p000.C38054ac3;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J(\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0017"}, m28432d2 = {"Ldd3;", "", "Lcom/google/firebase/messaging/RemoteMessage$b;", "message", "Landroid/content/Intent;", "openIntent", "", "c", "Landroid/app/Notification;", TransferService.INTENT_KEY_NOTIFICATION, "", "notificationId", "e", "", "title", Entry.TYPE_TEXT, "", "delayMilliseconds", "f", "b", "requestCode", "Lac3$e;", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dd3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC39861dd3 {
    /* renamed from: b */
    void mo42699b(int i);

    /* renamed from: c */
    void mo42698c(RemoteMessage.C18353b c18353b, Intent intent);

    /* renamed from: d */
    C38054ac3.C10770e mo42697d(int i, Intent intent);

    /* renamed from: e */
    void mo42696e(Notification notification, int i);

    /* renamed from: f */
    void mo42695f(CharSequence charSequence, CharSequence charSequence2, int i, long j);
}
