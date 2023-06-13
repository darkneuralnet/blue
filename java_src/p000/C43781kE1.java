package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"LkE1;", "LNa6;", "Le13;", "navigator", "LTq4;", "reactiveConfig", "<init>", "(Le13;LTq4;)V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kE1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43781kE1 extends AbstractC34661Na6 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C43781kE1(InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        super(new C22(r6), navigator);
        String str;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Long authChargeAmount = reactiveConfig.m82623f8().m73665a().getFraudConfig().getAuthChargeAmount();
        if (authChargeAmount != null) {
            str = C51916xx1.f118396a.m4408d(authChargeAmount.longValue(), C45097mS5.m25591o(reactiveConfig.m82623f8().getValue().getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
        } else {
            str = null;
        }
    }
}
