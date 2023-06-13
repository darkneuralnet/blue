package p000;

import androidx.lifecycle.LiveData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH&J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H&J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\tH&J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"LNN1;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "f", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "", "threshold", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "", "Lcom/chuckerteam/chucker/internal/data/entity/a;", C17296a.f69688o, "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "path", "e", "transactionId", "g", "b", "minTimestamp", "i", "(Ljava/lang/Long;)Ljava/util/List;", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NN1 */
/* loaded from: classes5.dex */
public interface NN1 {
    /* renamed from: a */
    LiveData<List<C17147a>> mo94010a();

    /* renamed from: b */
    Object mo94009b(Continuation<? super List<HttpTransaction>> continuation);

    /* renamed from: c */
    Object mo94008c(long j, Continuation<? super Unit> continuation);

    /* renamed from: d */
    Object mo94007d(HttpTransaction httpTransaction, Continuation<? super Integer> continuation);

    /* renamed from: e */
    LiveData<List<C17147a>> mo94006e(String str, String str2);

    /* renamed from: f */
    Object mo94005f(HttpTransaction httpTransaction, Continuation<? super Unit> continuation);

    /* renamed from: g */
    LiveData<HttpTransaction> mo94004g(long j);

    /* renamed from: h */
    Object mo94003h(Continuation<? super Unit> continuation);

    /* renamed from: i */
    List<HttpTransaction> mo94002i(Long l);
}
