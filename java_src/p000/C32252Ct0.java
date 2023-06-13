package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\b\u0005\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m28432d2 = {"LCt0;", "LgV2$b;", "LT42;", "Lkotlin/Function1;", "LgV2;", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function3;", C17296a.f69688o, "()Lkotlin/jvm/functions/Function3;", "factory", "LS42;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ct0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32252Ct0 extends T42 implements InterfaceC41563gV2.InterfaceC20913b {

    /* renamed from: c */
    public final Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> f4854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32252Ct0(Function1<? super S42, Unit> inspectorInfo, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, ? extends InterfaceC41563gV2> factory) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f4854c = factory;
    }

    /* renamed from: a */
    public final Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> m111380a() {
        return this.f4854c;
    }
}
