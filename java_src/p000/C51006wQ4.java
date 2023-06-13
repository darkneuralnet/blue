package p000;

import co.bird.android.model.wire.WireRideTransactionItem;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireRideTransactionItem;", "", "b", C17296a.f69688o, "c", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: wQ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51006wQ4 {
    /* renamed from: a */
    public static final boolean m6854a(List<WireRideTransactionItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() >= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m6853b(List<WireRideTransactionItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (2 > size || size >= 4) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m6852c(List<WireRideTransactionItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return true;
        }
        return false;
    }
}
