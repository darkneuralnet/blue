package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/OrderStatus;", "", "(Ljava/lang/String;I)V", "toString", "", "REQUESTED", "PENDING", "SUBMITTED", "SHIPPED", "DELIVERED", "CANCELED", "COMPLETED", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum OrderStatus {
    REQUESTED,
    PENDING,
    SUBMITTED,
    SHIPPED,
    DELIVERED,
    CANCELED,
    COMPLETED;
    
    public static final Companion Companion = new Companion(null);
    private static final OrderStatus[] all = values();

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\u0010\rR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/OrderStatus$Companion;", "", "()V", "all", "", "Lco/bird/android/model/OrderStatus;", "getAll", "()[Lco/bird/android/model/OrderStatus;", "[Lco/bird/android/model/OrderStatus;", "from", Entry.TYPE_TEXT, "", "strings", "()[Ljava/lang/String;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOrderStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderStatus.kt\nco/bird/android/model/OrderStatus$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,44:1\n11335#2:45\n11670#2,3:46\n1282#2,2:51\n37#3,2:49\n*S KotlinDebug\n*F\n+ 1 OrderStatus.kt\nco/bird/android/model/OrderStatus$Companion\n*L\n40#1:45\n40#1:46,3\n41#1:51,2\n40#1:49,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OrderStatus from(String str) {
            OrderStatus orderStatus;
            OrderStatus[] all = getAll();
            int length = all.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    orderStatus = all[i];
                    if (Intrinsics.areEqual(orderStatus.toString(), str)) {
                        break;
                    }
                    i++;
                } else {
                    orderStatus = null;
                    break;
                }
            }
            if (orderStatus == null) {
                return OrderStatus.PENDING;
            }
            return orderStatus;
        }

        public final OrderStatus[] getAll() {
            return OrderStatus.all;
        }

        public final String[] strings() {
            OrderStatus[] all = getAll();
            ArrayList arrayList = new ArrayList(all.length);
            for (OrderStatus orderStatus : all) {
                arrayList.add(orderStatus.toString());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        private Companion() {
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
