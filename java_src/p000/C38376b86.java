package p000;

import androidx.lifecycle.C11759u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lb86;", "Landroidx/lifecycle/u$c;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "", "e", "J", "transactionId", "<init>", "(J)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionViewModel.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModelFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
/* renamed from: b86  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38376b86 extends C11759u.C11765c {

    /* renamed from: e */
    public final long f56975e;

    public C38376b86() {
        this(0L, 1, null);
    }

    @Override // androidx.lifecycle.C11759u.C11765c, androidx.lifecycle.C11759u.InterfaceC11763b
    public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (Intrinsics.areEqual(modelClass, C37783a86.class)) {
            return new C37783a86(this.f56975e);
        }
        throw new IllegalArgumentException(("Cannot create " + modelClass).toString());
    }

    public /* synthetic */ C38376b86(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }

    public C38376b86(long j) {
        this.f56975e = j;
    }
}
