package com.stripe.android.p049ui.core.elements;

import android.util.Log;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/LpmSerializer;", "", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", MessageExtension.FIELD_DATA, "Lxi2;", "serialize", "", "str", "Lkotlin/Result;", "deserialize-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "deserialize", "", "deserializeList", "Lbi2;", "format", "Lbi2;", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLpmSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmSerializer.kt\ncom/stripe/android/ui/core/elements/LpmSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
/* renamed from: com.stripe.android.ui.core.elements.LpmSerializer */
/* loaded from: classes7.dex */
public final class LpmSerializer {
    private final AbstractC38706bi2 format = C33793Ji2.m99925b(null, LpmSerializer$format$1.INSTANCE, 1, null);

    /* renamed from: deserialize-IoAF18A  reason: not valid java name */
    public final Object m116665deserializeIoAF18A(String str) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl((SharedDataSpec) this.format.m64105b(SharedDataSpec.Companion.serializer(), str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        return m116783constructorimpl;
    }

    public final List<SharedDataSpec> deserializeList(String str) {
        boolean z;
        List<SharedDataSpec> emptyList;
        List<SharedDataSpec> emptyList2;
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            return emptyList2;
        }
        try {
            return (List) this.format.m64105b(new C27999ro(SharedDataSpec$$serializer.INSTANCE), str);
        } catch (Exception e) {
            Log.w("STRIPE", "Error parsing LPMs", e);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
    }

    public final AbstractC51767xi2 serialize(SharedDataSpec data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return this.format.m64104c(SharedDataSpec.Companion.serializer(), data);
    }
}
