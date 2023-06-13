package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.SdkFlavor;
import com.facebook.share.internal.C17296a;
import java.util.EnumSet;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u0004H&R\u001e\u0010\f\u001a\u0004\u0018\u00010\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000bR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0007\u0010\u0015R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\t\u0010\u0010R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001e\u0010 \u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0007\u0010\u001fR\u001e\u0010%\u001a\u0004\u0018\u00010!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b\u0007\u0010$R\u001e\u0010(\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010R\u001e\u0010+\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R\u001e\u0010/\u001a\u0004\u0018\u00010,8&@&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010-\"\u0004\b\u0007\u0010.R\u001e\u00101\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001e\u00102\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u0007\u0010\u0010R\u001e\u00107\u001a\u0004\u0018\u0001038&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u00104\"\u0004\b5\u00106R*\u0010>\u001a\u0010\u0012\u0004\u0012\u000209\u0018\u000108j\u0004\u0018\u0001`:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b\u0007\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010DR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006GÀ\u0006\u0001"}, m28432d2 = {"Lbo/app/z1;", "Lbo/app/l2;", "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "", C17296a.f69688o, "Lbo/app/h0;", "f", "()Lbo/app/h0;", "(Lbo/app/h0;)V", "device", "getDeviceId", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "deviceId", "", "j", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "requestInitiationTime", "getApiKey", "apiKey", "getSdkVersion", "g", "sdkVersion", "Lcom/appboy/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/appboy/enums/SdkFlavor;", "(Lcom/appboy/enums/SdkFlavor;)V", "sdkFlavor", "Lbo/app/w3;", DateTokenConverter.CONVERTER_KEY, "()Lbo/app/w3;", "(Lbo/app/w3;)V", "outboundUser", "getHostAppVersion", "c", "hostAppVersion", "getHostAppSemanticVersionCode", "e", "hostAppSemanticVersionCode", "Lbo/app/k;", "()Lbo/app/k;", "(Lbo/app/k;)V", "customEvents", "k", "sdkAuthSignature", "userId", "Lbo/app/v3;", "()Lbo/app/v3;", "setOutboundRespondWith", "(Lbo/app/v3;)V", "outboundRespondWith", "Ljava/util/EnumSet;", "Lu20;", "Lcom/braze/enums/MetadataTags;", "i", "()Ljava/util/EnumSet;", "(Ljava/util/EnumSet;)V", "sdkMetadata", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "()Z", "containsNoNewData", "doesSendOptionalData", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.z1 */
/* loaded from: classes.dex */
public interface InterfaceC13280z1 extends InterfaceC12868l2 {
    /* renamed from: a */
    void mo62602a(C12697h0 c12697h0);

    /* renamed from: a */
    void mo62601a(C12810k c12810k);

    /* renamed from: a */
    void mo62600a(C13191w3 c13191w3);

    /* renamed from: a */
    void mo62599a(SdkFlavor sdkFlavor);

    /* renamed from: a */
    void mo62598a(Long l);

    /* renamed from: a */
    void mo62597a(String str);

    /* renamed from: a */
    void mo62596a(EnumSet<EnumC49593u20> enumSet);

    /* renamed from: a */
    void mo62595a(Map<String, String> map);

    /* renamed from: b */
    void mo62593b(String str);

    /* renamed from: b */
    boolean mo62594b();

    /* renamed from: c */
    C13176v3 mo62592c();

    /* renamed from: c */
    void mo62591c(String str);

    /* renamed from: d */
    C13191w3 mo62590d();

    /* renamed from: d */
    void mo62589d(String str);

    /* renamed from: e */
    C12810k mo62588e();

    /* renamed from: e */
    void mo62587e(String str);

    /* renamed from: f */
    C12697h0 mo62586f();

    /* renamed from: f */
    void mo62585f(String str);

    /* renamed from: g */
    void mo62583g(String str);

    /* renamed from: g */
    boolean mo62584g();

    /* renamed from: i */
    EnumSet<EnumC49593u20> mo62582i();

    /* renamed from: j */
    Long mo62581j();

    /* renamed from: l */
    JSONObject mo62580l();
}
