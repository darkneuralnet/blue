package co.bird.android.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lke5;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdBikeBleScannedVehicle$connect$1 extends Lambda implements Function1<InterfaceC44023ke5, Unit> {
    public static final BirdBikeBleScannedVehicle$connect$1 INSTANCE = new BirdBikeBleScannedVehicle$connect$1();

    public BirdBikeBleScannedVehicle$connect$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC44023ke5 interfaceC44023ke5) {
        invoke2(interfaceC44023ke5);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC44023ke5 interfaceC44023ke5) {
        C41318g46.m40163a("Established connection with bike " + interfaceC44023ke5, new Object[0]);
    }
}
