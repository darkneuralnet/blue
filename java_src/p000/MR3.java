package p000;

import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"V", "Ljava/util/Locale;", "locale", "LAM4;", C17296a.f69688o, "(Ljava/util/Locale;)LAM4;"}, m28431k = 3, m28430mv = {1, 7, 1})
/* renamed from: MR3 */
/* loaded from: classes7.dex */
public final class MR3 extends Lambda implements Function1<Locale, AM4<Object>> {

    /* renamed from: g */
    public final /* synthetic */ Function1<Locale, InterfaceC36619Vk2<String, Object>> f23121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MR3(Function1<? super Locale, ? extends InterfaceC36619Vk2<String, Object>> function1) {
        super(1);
        this.f23121g = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final AM4<Object> invoke(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return new AM4<>(this.f23121g.invoke(locale));
    }
}
