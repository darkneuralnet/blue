package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH'J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H'J\b\u0010\u0011\u001a\u00020\u0005H'¨\u0006\u0014"}, m28432d2 = {"LSp3;", "", "", "Lco/bird/android/model/persistence/OperatorOrderView;", "orders", "Lio/reactivex/c;", "b", "", "section", "Lio/reactivex/Observable;", DateTokenConverter.CONVERTER_KEY, "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "c", "ids", "e", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.operator-order-view.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sp3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC35963Sp3 {
    /* renamed from: a */
    public abstract AbstractC23461c mo82968a();

    /* renamed from: b */
    public abstract AbstractC23461c mo82967b(List<OperatorOrderView> list);

    /* renamed from: c */
    public abstract Observable<OperatorOrderView> mo82966c(String str, OperatorOrderViewType operatorOrderViewType);

    /* renamed from: d */
    public abstract Observable<List<OperatorOrderView>> mo82965d(String str);

    /* renamed from: e */
    public abstract AbstractC23461c mo82964e(List<String> list);
}
