package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\b\u001a\u00028\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"LRN2;", "A", "LAN2;", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "repository1", "Lkotlin/Function1;", "block", C17296a.f69688o, "(LRN2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Vr6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36686Vr6 {
    /* renamed from: a */
    public static final <A extends RN2<B>, B extends AN2, C> C m79329a(A repository1, Function1<? super B, ? extends C> block) {
        Intrinsics.checkNotNullParameter(repository1, "repository1");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(repository1.getState$mvrx_release());
    }
}
