package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.itemlease.ItemLeaseExemption;
import co.bird.android.model.itemlease.LeaseItemAvailabilityResponse;
import co.bird.android.model.itemlease.LeaseReturnResponse;
import co.bird.android.model.itemlease.LeaseStartResponse;
import co.bird.android.model.itemlease.LeaseSubmitAssetResponse;
import co.bird.android.model.itemlease.p022enum.ItemLeaseAssetPurpose;
import co.bird.android.model.itemlease.p022enum.ItemLeaseType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.request.WirePaymentAuthRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
@Metadata(m28433d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J@\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH&JF\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u0010\u0012\u001a\u00020\u0004H&J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010%\u001a\u0004\u0018\u00010#2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010)\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010*\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010+\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010,\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J \u00101\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u00104\u001a\u00020(2\u0006\u00103\u001a\u000202H&J\u0018\u00105\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u00106\u001a\u00020(H&J6\u0010:\u001a\b\u0012\u0004\u0012\u0002090\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00182\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H&R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001a0;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a0;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R,\u0010C\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a0A0;8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010=R,\u0010E\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a0A0;8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0014\u0010H\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, m28432d2 = {"LMc2;", "", "Lio/reactivex/c;", "b", "", "partnerId", "Lco/bird/android/model/itemlease/enum/ItemLeaseType;", "leaseType", "leasedItemId", "associatedItemId", "Lco/bird/api/request/WirePaymentAuthRequest;", "paymentAuth", "Lio/reactivex/F;", "Lco/bird/android/model/itemlease/LeaseStartResponse;", "x", "Lco/bird/android/model/wire/WireBird;", "bird", "E", "leaseId", "Lco/bird/android/model/itemlease/enum/ItemLeaseAssetPurpose;", "purpose", "", "fileSize", "mimeType", "", "autoScanned", "", "autoScannedCodes", "Lco/bird/android/model/itemlease/LeaseSubmitAssetResponse;", "B", "Lco/bird/android/model/itemlease/LeaseReturnResponse;", "u", "l", "birdId", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lco/bird/android/model/itemlease/ItemLease;", "z", "p", "t", "n", "", "f", "q", "y", "j", "Lco/bird/android/model/wire/configs/Config;", "config", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "v", "Lco/bird/android/model/itemlease/ItemLeaseExemption;", "exemption", "A", "k", "e", "present", "itemId", "Lco/bird/android/model/itemlease/LeaseItemAvailabilityResponse;", "o", "LZ84;", "s", "()LZ84;", "activeLeases", DateTokenConverter.CONVERTER_KEY, "activeLeaseBirds", "", "D", "readyToLeaseBirds", "w", "readyToEndLeaseBirds", C17296a.f69688o, "()Ljava/lang/String;", "imageCacheDirectoryPath", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mc2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC34441Mc2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Mc2$a */
    /* loaded from: classes2.dex */
    public static final class C5320a {
        public static /* synthetic */ AbstractC23442F markLeaseItemAvailability$default(InterfaceC34441Mc2 interfaceC34441Mc2, ItemLeaseType itemLeaseType, boolean z, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = null;
                }
                if ((i & 8) != 0) {
                    str2 = null;
                }
                return interfaceC34441Mc2.mo55661o(itemLeaseType, z, str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markLeaseItemAvailability");
        }

        public static /* synthetic */ AbstractC23442F startLease$default(InterfaceC34441Mc2 interfaceC34441Mc2, String str, ItemLeaseType itemLeaseType, String str2, String str3, WirePaymentAuthRequest wirePaymentAuthRequest, int i, Object obj) {
            if (obj == null) {
                return interfaceC34441Mc2.mo55651x(str, itemLeaseType, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : wirePaymentAuthRequest);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLease");
        }

        public static /* synthetic */ AbstractC23442F submitLeaseAsset$default(InterfaceC34441Mc2 interfaceC34441Mc2, String str, ItemLeaseAssetPurpose itemLeaseAssetPurpose, long j, String str2, boolean z, List list, int i, Object obj) {
            List list2;
            List emptyList;
            if (obj == null) {
                if ((i & 32) != 0) {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    list2 = emptyList;
                } else {
                    list2 = list;
                }
                return interfaceC34441Mc2.mo55707B(str, itemLeaseAssetPurpose, j, str2, z, list2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitLeaseAsset");
        }
    }

    /* renamed from: A */
    void mo55708A(ItemLeaseExemption itemLeaseExemption);

    /* renamed from: B */
    AbstractC23442F<LeaseSubmitAssetResponse> mo55707B(String str, ItemLeaseAssetPurpose itemLeaseAssetPurpose, long j, String str2, boolean z, List<String> list);

    /* renamed from: C */
    boolean mo55706C(String str, ItemLeaseType itemLeaseType);

    /* renamed from: D */
    Z84<Map<ItemLeaseType, List<WireBird>>> mo55705D();

    /* renamed from: E */
    AbstractC23442F<LeaseStartResponse> mo55704E(WireBird wireBird);

    /* renamed from: a */
    String mo55684a();

    /* renamed from: b */
    AbstractC23461c mo55682b();

    /* renamed from: d */
    Z84<List<WireBird>> mo55679d();

    /* renamed from: e */
    void mo55677e();

    /* renamed from: f */
    void mo55675f(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: j */
    void mo55670j(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: k */
    boolean mo55668k(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: l */
    boolean mo55666l(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: n */
    boolean mo55663n(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: o */
    AbstractC23442F<LeaseItemAvailabilityResponse> mo55661o(ItemLeaseType itemLeaseType, boolean z, String str, String str2);

    /* renamed from: p */
    ItemLease mo55659p(String str, ItemLeaseType itemLeaseType);

    /* renamed from: q */
    void mo55657q(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: s */
    Z84<List<ItemLease>> mo55656s();

    /* renamed from: t */
    boolean mo55655t(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: u */
    AbstractC23442F<LeaseReturnResponse> mo55654u(String str);

    /* renamed from: v */
    boolean mo55653v(Config config, WirePhysicalLock wirePhysicalLock, ItemLeaseType itemLeaseType);

    /* renamed from: w */
    Z84<Map<ItemLeaseType, List<WireBird>>> mo55652w();

    /* renamed from: x */
    AbstractC23442F<LeaseStartResponse> mo55651x(String str, ItemLeaseType itemLeaseType, String str2, String str3, WirePaymentAuthRequest wirePaymentAuthRequest);

    /* renamed from: y */
    void mo55650y(WireBird wireBird, ItemLeaseType itemLeaseType);

    /* renamed from: z */
    ItemLease mo55649z(WireBird wireBird, ItemLeaseType itemLeaseType);
}
