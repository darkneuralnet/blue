package p000;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"LSg3;", "LRg3;", "LT42;", "Lnm2;", "coordinates", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "callback", "LS42;", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sg3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35882Sg3 extends T42 implements InterfaceC35648Rg3 {

    /* renamed from: c */
    public final Function1<InterfaceC45879nm2, Unit> f34045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C35882Sg3(Function1<? super InterfaceC45879nm2, Unit> callback, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f34045c = callback;
    }

    @Override // p000.InterfaceC35648Rg3
    /* renamed from: C */
    public void mo44810C(InterfaceC45879nm2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f34045c.invoke(coordinates);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35882Sg3)) {
            return false;
        }
        return Intrinsics.areEqual(this.f34045c, ((C35882Sg3) obj).f34045c);
    }

    public int hashCode() {
        return this.f34045c.hashCode();
    }
}
