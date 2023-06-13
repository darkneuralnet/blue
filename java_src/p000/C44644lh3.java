package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0002\b\u0018ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000e8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001c"}, m28432d2 = {"Llh3;", "Lgh3;", "LT42;", "LG52;", "size", "", "A", "(J)V", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "getOnSizeChanged", "()Lkotlin/jvm/functions/Function1;", "onSizeChanged", DateTokenConverter.CONVERTER_KEY, "J", "previousSize", "LS42;", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44644lh3 extends T42 implements InterfaceC41679gh3 {

    /* renamed from: c */
    public final Function1<G52, Unit> f96559c;

    /* renamed from: d */
    public long f96560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C44644lh3(Function1<? super G52, Unit> onSizeChanged, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f96559c = onSizeChanged;
        this.f96560d = H52.m104430a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.InterfaceC41679gh3
    /* renamed from: A */
    public void mo26980A(long j) {
        if (!G52.m105831e(this.f96560d, j)) {
            this.f96559c.invoke(G52.m105834b(j));
            this.f96560d = j;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44644lh3)) {
            return false;
        }
        return Intrinsics.areEqual(this.f96559c, ((C44644lh3) obj).f96559c);
    }

    public int hashCode() {
        return this.f96559c.hashCode();
    }
}
