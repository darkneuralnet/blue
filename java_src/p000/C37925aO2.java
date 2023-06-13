package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AN2;
import p000.RN2;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u000f\u0012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0007\u001a\u00020\u0006H\u0014R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LaO2;", "LRN2;", "VM", "LAN2;", "S", "LOr6;", "", "onCleared", C17296a.f69688o, "LRN2;", "e", "()LRN2;", "viewModel", "<init>", "(LRN2;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: aO2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37925aO2<VM extends RN2<S>, S extends AN2> extends AbstractC35048Or6 {

    /* renamed from: a */
    public final VM f50385a;

    public C37925aO2(VM viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f50385a = viewModel;
    }

    /* renamed from: e */
    public final VM m71506e() {
        return this.f50385a;
    }

    @Override // p000.AbstractC35048Or6
    public void onCleared() {
        super.onCleared();
        this.f50385a.onCleared();
    }
}
