package p000;

import co.bird.android.model.TransactionSummary;
import co.bird.android.model.TransactionSummaryAdhocCharge;
import co.bird.android.model.TransactionSummaryTransaction;
import co.bird.android.model.constant.IncomingTransactionSourceKind;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/TransactionSummary;", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: T66 */
/* loaded from: classes2.dex */
public final class T66 {
    /* renamed from: a */
    public static final boolean m84306a(TransactionSummary transactionSummary) {
        if (transactionSummary.getRide() == null) {
            TransactionSummaryTransaction transaction = transactionSummary.getTransaction();
            if ((transaction != null ? transaction.getSourceKind() : null) != IncomingTransactionSourceKind.MERCHANT) {
                TransactionSummaryAdhocCharge charge = transactionSummary.getCharge();
                if ((charge != null ? charge.getReceiptId() : null) == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
