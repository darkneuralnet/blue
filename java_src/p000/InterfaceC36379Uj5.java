package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.transferorder.scanner.inbound.InboundScanActivity;
import co.bird.android.feature.transferorder.scanner.outbound.OutboundScanActivity;
import co.bird.android.feature.transferorder.scanner.outbound.scrap.ScrapOrderScanActivity;
import com.facebook.share.internal.C17296a;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class})
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, m28432d2 = {"LUj5;", "", "Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;", "activity", "", C17296a.f69688o, "Lco/bird/android/feature/transferorder/scanner/outbound/OutboundScanActivity;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanActivity;", "b", "Lb02;", "fragment", "c", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Uj5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC36379Uj5 {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"LUj5$a;", "", "LlG2;", "mainComponent", "LUj5;", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Uj5$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8430a {
        /* renamed from: a */
        InterfaceC36379Uj5 mo80956a(InterfaceC44393lG2 interfaceC44393lG2);
    }

    /* renamed from: a */
    void mo80960a(InboundScanActivity inboundScanActivity);

    /* renamed from: b */
    void mo80959b(ScrapOrderScanActivity scrapOrderScanActivity);

    /* renamed from: c */
    void mo80958c(C38292b02 c38292b02);

    /* renamed from: d */
    void mo80957d(OutboundScanActivity outboundScanActivity);
}
