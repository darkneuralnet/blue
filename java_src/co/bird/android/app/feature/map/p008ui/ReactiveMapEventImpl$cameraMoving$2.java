package co.bird.android.app.feature.map.p008ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.ReactiveMapEventImpl$cameraMoving$2 */
/* loaded from: classes2.dex */
public final class ReactiveMapEventImpl$cameraMoving$2 extends Lambda implements Function0<Z84<Boolean>> {
    final /* synthetic */ ReactiveMapEventImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactiveMapEventImpl$cameraMoving$2(ReactiveMapEventImpl reactiveMapEventImpl) {
        super(0);
        this.this$0 = reactiveMapEventImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Z84<Boolean> invoke() {
        C37791a94 c37791a94;
        Z84.C10119a c10119a = Z84.f47888d;
        c37791a94 = this.this$0.mutableCameraMoving;
        return c10119a.m73663b(c37791a94);
    }
}
