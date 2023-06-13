package co.bird.android.model;

import co.bird.android.model.constant.UserRole;
import com.stripe.android.model.Source;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000*\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\u0002\u001a\f\u0010\u0011\u001a\u00020\u000b*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0012\u001a\u00020\u000b*\u00020\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0002\u001a\n\u0010\u0015\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0016"}, m28432d2 = {"balance", "", "Lco/bird/android/model/User;", "currency", "", "getFreeRides", "", "getRoles", "", "Lco/bird/android/model/UserRoleItem;", "isMerchant", "", "(Lco/bird/android/model/User;Ljava/lang/Boolean;)Ljava/util/List;", "hasOperatorRole", "isAdminDomain", "isCharger", "isContractor", "isInRegistration", "isOperator", "maybeMergeWith", "newUser", "missingInfoCount", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\nco/bird/android/model/UserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1855#2,2:208\n1#3:210\n*S KotlinDebug\n*F\n+ 1 User.kt\nco/bird/android/model/UserKt\n*L\n153#1:208,2\n*E\n"})
/* loaded from: classes4.dex */
public final class UserKt {
    public static final long balance(User user, String currency) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Map<String, Long> balances = user.getBalances();
        String lowerCase = currency.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        Long l = balances.get(lowerCase);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final int getFreeRides(User user, String currency) {
        boolean equals;
        Intrinsics.checkNotNullParameter(user, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (user.getFreeRidesByCurrency() != null) {
            Integer num = user.getFreeRidesByCurrency().get(currency);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        equals = StringsKt__StringsJVMKt.equals(currency, Source.USD, true);
        if (!equals) {
            return 0;
        }
        return user.getFreeRides();
    }

    public static final List<UserRoleItem> getRoles(User user, Boolean bool) {
        List<UserRoleItem> mutableListOf;
        Intrinsics.checkNotNullParameter(user, "<this>");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(UserRoleItemKt.toUserRoleItem(UserRole.RIDER));
        List<OperatorRole> operatorRoles = user.getOperatorRoles();
        if (operatorRoles != null) {
            for (OperatorRole operatorRole : operatorRoles) {
                mutableListOf.add(operatorRole.toUserRoleItem());
            }
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            mutableListOf.add(UserRoleItemKt.toUserRoleItem(UserRole.MERCHANT));
        }
        return mutableListOf;
    }

    public static /* synthetic */ List getRoles$default(User user, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return getRoles(user, bool);
    }

    public static final boolean hasOperatorRole(User user) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        List<OperatorRole> operatorRoles = user.getOperatorRoles();
        if (operatorRoles != null) {
            return !operatorRoles.isEmpty();
        }
        return false;
    }

    public static final boolean isAdminDomain(User user) {
        List split$default;
        int lastIndex;
        Intrinsics.checkNotNullParameter(user, "<this>");
        String email = user.getEmail();
        if (email != null) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) email, new String[]{"@"}, false, 0, 6, (Object) null);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(split$default);
            return Intrinsics.areEqual((String) split$default.get(lastIndex), "bird.co");
        }
        return false;
    }

    public static final boolean isCharger(User user) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        return Intrinsics.areEqual(user.getCanCharge(), Boolean.TRUE);
    }

    public static final boolean isContractor(User user) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        return Intrinsics.areEqual(user.getCanCharge(), Boolean.TRUE);
    }

    public static final boolean isInRegistration(User user) {
        return user == null || user.getRideCount() == 0;
    }

    public static final boolean isOperator(User user) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        List<OperatorRole> operatorRoles = user.getOperatorRoles();
        if (operatorRoles != null) {
            return !operatorRoles.isEmpty();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final User maybeMergeWith(User user, User newUser) {
        User user2;
        boolean z;
        int i;
        Map<String, Integer> freeRidesByCurrency;
        Map<String, Integer> map;
        String stripePublicKey;
        String str;
        boolean z2;
        User copy;
        boolean z3;
        Intrinsics.checkNotNullParameter(newUser, "newUser");
        String str2 = null;
        if (user != null && Intrinsics.areEqual(user.getId(), newUser.getId())) {
            user2 = user;
        } else {
            user2 = null;
        }
        Map<String, Long> balances = newUser.getBalances();
        if (!(!balances.isEmpty())) {
            balances = null;
        }
        if (balances == null) {
            if (user2 != null) {
                balances = user2.getBalances();
            } else {
                balances = null;
            }
            if (balances == null) {
                balances = MapsKt__MapsKt.emptyMap();
            }
        }
        Map<String, Long> map2 = balances;
        Integer valueOf = Integer.valueOf(newUser.getRideCount());
        if (valueOf.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            if (user2 != null) {
                valueOf = Integer.valueOf(user2.getRideCount());
            } else {
                valueOf = null;
            }
            if (valueOf == null) {
                i = 0;
                freeRidesByCurrency = newUser.getFreeRidesByCurrency();
                if (freeRidesByCurrency == null) {
                    if (user2 != null) {
                        freeRidesByCurrency = user2.getFreeRidesByCurrency();
                    } else {
                        map = null;
                        stripePublicKey = newUser.getStripePublicKey();
                        if (stripePublicKey == null) {
                            if (user2 != null) {
                                str2 = user2.getStripePublicKey();
                            }
                            str = str2;
                        } else {
                            str = stripePublicKey;
                        }
                        if (!newUser.getReceivedSignupCoupon()) {
                            if (user2 != null) {
                                z3 = user2.getReceivedSignupCoupon();
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                z2 = false;
                                copy = newUser.copy((r46 & 1) != 0 ? newUser.f66632id : null, (r46 & 2) != 0 ? newUser.name : null, (r46 & 4) != 0 ? newUser.email : null, (r46 & 8) != 0 ? newUser.phone : null, (r46 & 16) != 0 ? newUser.imageUrl : null, (r46 & 32) != 0 ? newUser.balance : 0, (r46 & 64) != 0 ? newUser.balances : map2, (r46 & 128) != 0 ? newUser.customerId : null, (r46 & 256) != 0 ? newUser.customerToken : null, (r46 & 512) != 0 ? newUser.freeRides : 0, (r46 & 1024) != 0 ? newUser.freeRidesByCurrency : map, (r46 & 2048) != 0 ? newUser.rideCount : i, (r46 & 4096) != 0 ? newUser.admin : false, (r46 & 8192) != 0 ? newUser.tester : false, (r46 & 16384) != 0 ? newUser.receivedSignupCoupon : z2, (r46 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? newUser.hasSignupCode : false, (r46 & 65536) != 0 ? newUser.createdAt : null, (r46 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? newUser.agreedAt : null, (r46 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? newUser.suspendedAt : null, (r46 & 524288) != 0 ? newUser.canCharge : null, (r46 & 1048576) != 0 ? newUser.canDeliver : null, (r46 & 2097152) != 0 ? newUser.isCashPay : null, (r46 & 4194304) != 0 ? newUser.birthdate : null, (r46 & 8388608) != 0 ? newUser.emailVerifiedAt : null, (r46 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? newUser.stripePublicKey : str, (r46 & 33554432) != 0 ? newUser.locale : null, (r46 & 67108864) != 0 ? newUser.warehouseId : null, (r46 & 134217728) != 0 ? newUser.operatorRoles : null);
                                return copy;
                            }
                        }
                        z2 = true;
                        copy = newUser.copy((r46 & 1) != 0 ? newUser.f66632id : null, (r46 & 2) != 0 ? newUser.name : null, (r46 & 4) != 0 ? newUser.email : null, (r46 & 8) != 0 ? newUser.phone : null, (r46 & 16) != 0 ? newUser.imageUrl : null, (r46 & 32) != 0 ? newUser.balance : 0, (r46 & 64) != 0 ? newUser.balances : map2, (r46 & 128) != 0 ? newUser.customerId : null, (r46 & 256) != 0 ? newUser.customerToken : null, (r46 & 512) != 0 ? newUser.freeRides : 0, (r46 & 1024) != 0 ? newUser.freeRidesByCurrency : map, (r46 & 2048) != 0 ? newUser.rideCount : i, (r46 & 4096) != 0 ? newUser.admin : false, (r46 & 8192) != 0 ? newUser.tester : false, (r46 & 16384) != 0 ? newUser.receivedSignupCoupon : z2, (r46 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? newUser.hasSignupCode : false, (r46 & 65536) != 0 ? newUser.createdAt : null, (r46 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? newUser.agreedAt : null, (r46 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? newUser.suspendedAt : null, (r46 & 524288) != 0 ? newUser.canCharge : null, (r46 & 1048576) != 0 ? newUser.canDeliver : null, (r46 & 2097152) != 0 ? newUser.isCashPay : null, (r46 & 4194304) != 0 ? newUser.birthdate : null, (r46 & 8388608) != 0 ? newUser.emailVerifiedAt : null, (r46 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? newUser.stripePublicKey : str, (r46 & 33554432) != 0 ? newUser.locale : null, (r46 & 67108864) != 0 ? newUser.warehouseId : null, (r46 & 134217728) != 0 ? newUser.operatorRoles : null);
                        return copy;
                    }
                }
                map = freeRidesByCurrency;
                stripePublicKey = newUser.getStripePublicKey();
                if (stripePublicKey == null) {
                }
                if (!newUser.getReceivedSignupCoupon()) {
                }
                z2 = true;
                copy = newUser.copy((r46 & 1) != 0 ? newUser.f66632id : null, (r46 & 2) != 0 ? newUser.name : null, (r46 & 4) != 0 ? newUser.email : null, (r46 & 8) != 0 ? newUser.phone : null, (r46 & 16) != 0 ? newUser.imageUrl : null, (r46 & 32) != 0 ? newUser.balance : 0, (r46 & 64) != 0 ? newUser.balances : map2, (r46 & 128) != 0 ? newUser.customerId : null, (r46 & 256) != 0 ? newUser.customerToken : null, (r46 & 512) != 0 ? newUser.freeRides : 0, (r46 & 1024) != 0 ? newUser.freeRidesByCurrency : map, (r46 & 2048) != 0 ? newUser.rideCount : i, (r46 & 4096) != 0 ? newUser.admin : false, (r46 & 8192) != 0 ? newUser.tester : false, (r46 & 16384) != 0 ? newUser.receivedSignupCoupon : z2, (r46 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? newUser.hasSignupCode : false, (r46 & 65536) != 0 ? newUser.createdAt : null, (r46 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? newUser.agreedAt : null, (r46 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? newUser.suspendedAt : null, (r46 & 524288) != 0 ? newUser.canCharge : null, (r46 & 1048576) != 0 ? newUser.canDeliver : null, (r46 & 2097152) != 0 ? newUser.isCashPay : null, (r46 & 4194304) != 0 ? newUser.birthdate : null, (r46 & 8388608) != 0 ? newUser.emailVerifiedAt : null, (r46 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? newUser.stripePublicKey : str, (r46 & 33554432) != 0 ? newUser.locale : null, (r46 & 67108864) != 0 ? newUser.warehouseId : null, (r46 & 134217728) != 0 ? newUser.operatorRoles : null);
                return copy;
            }
        }
        i = valueOf.intValue();
        freeRidesByCurrency = newUser.getFreeRidesByCurrency();
        if (freeRidesByCurrency == null) {
        }
        map = freeRidesByCurrency;
        stripePublicKey = newUser.getStripePublicKey();
        if (stripePublicKey == null) {
        }
        if (!newUser.getReceivedSignupCoupon()) {
        }
        z2 = true;
        copy = newUser.copy((r46 & 1) != 0 ? newUser.f66632id : null, (r46 & 2) != 0 ? newUser.name : null, (r46 & 4) != 0 ? newUser.email : null, (r46 & 8) != 0 ? newUser.phone : null, (r46 & 16) != 0 ? newUser.imageUrl : null, (r46 & 32) != 0 ? newUser.balance : 0, (r46 & 64) != 0 ? newUser.balances : map2, (r46 & 128) != 0 ? newUser.customerId : null, (r46 & 256) != 0 ? newUser.customerToken : null, (r46 & 512) != 0 ? newUser.freeRides : 0, (r46 & 1024) != 0 ? newUser.freeRidesByCurrency : map, (r46 & 2048) != 0 ? newUser.rideCount : i, (r46 & 4096) != 0 ? newUser.admin : false, (r46 & 8192) != 0 ? newUser.tester : false, (r46 & 16384) != 0 ? newUser.receivedSignupCoupon : z2, (r46 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? newUser.hasSignupCode : false, (r46 & 65536) != 0 ? newUser.createdAt : null, (r46 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? newUser.agreedAt : null, (r46 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? newUser.suspendedAt : null, (r46 & 524288) != 0 ? newUser.canCharge : null, (r46 & 1048576) != 0 ? newUser.canDeliver : null, (r46 & 2097152) != 0 ? newUser.isCashPay : null, (r46 & 4194304) != 0 ? newUser.birthdate : null, (r46 & 8388608) != 0 ? newUser.emailVerifiedAt : null, (r46 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? newUser.stripePublicKey : str, (r46 & 33554432) != 0 ? newUser.locale : null, (r46 & 67108864) != 0 ? newUser.warehouseId : null, (r46 & 134217728) != 0 ? newUser.operatorRoles : null);
        return copy;
    }

    public static final int missingInfoCount(User user) {
        int i;
        Intrinsics.checkNotNullParameter(user, "<this>");
        if (user.getEmailVerifiedAt() == null) {
            i = 1;
        } else {
            i = 0;
        }
        if (user.getPhone() == null) {
            i++;
        }
        if (user.getName() == null) {
            return i + 1;
        }
        return i;
    }
}
