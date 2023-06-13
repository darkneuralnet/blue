package p000;

import androidx.lifecycle.LiveData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import com.stripe.android.networking.FraudDetectionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\ba\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J.\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H'J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00022\u0006\u0010\u0014\u001a\u00020\rH'J\u001b\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u001a\u001a\u00020\rH'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LKN1;", "", "Landroidx/lifecycle/LiveData;", "", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "c", "", "codeQuery", "pathQuery", "graphQlQuery", C17296a.f69688o, "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "f", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "h", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "g", "threshold", DateTokenConverter.CONVERTER_KEY, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", FraudDetectionData.KEY_TIMESTAMP, "b", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KN1 */
/* loaded from: classes5.dex */
public interface KN1 {
    /* renamed from: a */
    LiveData<List<C17147a>> mo97021a(String str, String str2, String str3);

    /* renamed from: b */
    List<HttpTransaction> mo97020b(long j);

    /* renamed from: c */
    LiveData<List<C17147a>> mo97019c();

    /* renamed from: d */
    Object mo97018d(long j, Continuation<? super Integer> continuation);

    /* renamed from: e */
    Object mo97017e(Continuation<? super List<HttpTransaction>> continuation);

    /* renamed from: f */
    Object mo97016f(HttpTransaction httpTransaction, Continuation<? super Long> continuation);

    /* renamed from: g */
    LiveData<HttpTransaction> mo97015g(long j);

    /* renamed from: h */
    Object mo97014h(HttpTransaction httpTransaction, Continuation<? super Integer> continuation);

    /* renamed from: i */
    Object mo97013i(Continuation<? super Integer> continuation);
}
