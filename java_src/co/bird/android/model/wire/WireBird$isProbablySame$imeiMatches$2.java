package co.bird.android.model.wire;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBird$isProbablySame$imeiMatches$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ WireBird $other;
    final /* synthetic */ WireBird this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WireBird$isProbablySame$imeiMatches$2(WireBird wireBird, WireBird wireBird2) {
        super(0);
        this.this$0 = wireBird;
        this.$other = wireBird2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.this$0.getImei(), r4.$other.getImei()) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke() {
        boolean z;
        boolean z2;
        String imei = this.this$0.getImei();
        boolean z3 = true;
        if (imei != null) {
            if (imei.length() > 0) {
                z = true;
                if (z) {
                    String imei2 = this.$other.getImei();
                    if (imei2 != null) {
                        if (imei2.length() > 0) {
                            z2 = true;
                            if (z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            }
        }
        z = false;
        if (z) {
        }
        z3 = false;
        return Boolean.valueOf(z3);
    }
}
