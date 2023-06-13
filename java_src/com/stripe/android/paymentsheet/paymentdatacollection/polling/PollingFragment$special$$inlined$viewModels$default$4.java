package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.lifecycle.InterfaceC11718e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LFE0;", "invoke", "()LFE0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes7.dex */
public final class PollingFragment$special$$inlined$viewModels$default$4 extends Lambda implements Function0<FE0> {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ Lazy $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingFragment$special$$inlined$viewModels$default$4(Function0 function0, Lazy lazy) {
        super(0);
        this.$extrasProducer = function0;
        this.$owner$delegate = lazy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final FE0 invoke() {
        InterfaceC37154Xr6 m104544c;
        FE0 fe0;
        Function0 function0 = this.$extrasProducer;
        if (function0 == null || (fe0 = (FE0) function0.invoke()) == null) {
            m104544c = C33234Gy1.m104544c(this.$owner$delegate);
            InterfaceC11718e interfaceC11718e = m104544c instanceof InterfaceC11718e ? (InterfaceC11718e) m104544c : null;
            FE0 defaultViewModelCreationExtras = interfaceC11718e != null ? interfaceC11718e.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? FE0.C2209a.f9049b : defaultViewModelCreationExtras;
        }
        return fe0;
    }
}
