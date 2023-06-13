package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.CardUtils;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import net.danlew.android.joda.DateUtils;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0014{|}~z\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001Bù\u0001\b\u0000\u0012\n\u0010-\u001a\u00060\u001aj\u0002`!\u0012\u0006\u0010.\u001a\u00020%\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010+\u0012\u0016\b\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c\u0012\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019¢\u0006\u0004\bj\u0010kBí\u0001\b\u0010\u0012\u0006\u0010m\u001a\u00020l\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010+\u0012\u0016\b\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c\u0012\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019¢\u0006\u0004\bj\u0010nB1\b\u0012\u0012\u0006\u0010/\u001a\u00020)\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010oB1\b\u0012\u0012\u0006\u00100\u001a\u00020\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010pB1\b\u0012\u0012\u0006\u00101\u001a\u00020\u0005\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010qB1\b\u0012\u0012\u0006\u00102\u001a\u00020\u0007\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010rB/\b\u0012\u0012\u0006\u00103\u001a\u00020\t\u0012\u0006\u0010;\u001a\u00020+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010sB/\b\u0012\u0012\u0006\u00104\u001a\u00020\u000b\u0012\u0006\u0010;\u001a\u00020+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010tB1\b\u0012\u0012\u0006\u00105\u001a\u00020\r\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010uB1\b\u0012\u0012\u0006\u00106\u001a\u00020\u000f\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010vB1\b\u0012\u0012\u0006\u00107\u001a\u00020\u0011\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010wB1\b\u0012\u0012\u0006\u00108\u001a\u00020\u0013\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010xB1\b\u0012\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\b\u0010;\u001a\u0004\u0018\u00010+\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\bj\u0010yJ\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÂ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÂ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cHÂ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019HÂ\u0003J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e0\u0019H\u0016J\u0014\u0010$\u001a\u00060\u001aj\u0002`!HÀ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010(\u001a\u00020%HÀ\u0003¢\u0006\u0004\b&\u0010'J\u000b\u0010*\u001a\u0004\u0018\u00010)HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010+HÆ\u0003Jý\u0001\u0010?\u001a\u00020\u00002\f\b\u0002\u0010-\u001a\u00060\u001aj\u0002`!2\b\b\u0002\u0010.\u001a\u00020%2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010)2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010;\u001a\u0004\u0018\u00010+2\u0016\b\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019HÆ\u0001J\t\u0010@\u001a\u00020\u001aHÖ\u0001J\t\u0010B\u001a\u00020AHÖ\u0001J\u0013\u0010D\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010E\u001a\u00020AHÖ\u0001J\u0019\u0010J\u001a\u00020I2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020AHÖ\u0001R\u001e\u0010-\u001a\u00060\u001aj\u0002`!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010K\u001a\u0004\bL\u0010#R\u001a\u0010.\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010M\u001a\u0004\bN\u0010'R\u0019\u0010/\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b/\u0010O\u001a\u0004\bP\u0010QR\u0016\u00100\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010RR\u0016\u00101\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010SR\u0016\u00102\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010TR\u0016\u00103\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010UR\u0016\u00104\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010VR\u0016\u00105\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010WR\u0016\u00106\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010XR\u0016\u00107\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010YR\u0016\u00108\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010ZR\u0016\u00109\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010[R\u0016\u0010:\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\\R\u0019\u0010;\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b;\u0010]\u001a\u0004\b^\u0010_R\"\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010`R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010aR\"\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010`R \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010f\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\be\u0010#R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006\u0087\u0001"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "component4", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "component5", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "component6", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "component7", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "component8", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "component9", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "component10", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "component11", "Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;", "component12", "Lcom/stripe/android/model/PaymentMethodCreateParams$Link;", "component13", "Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;", "component14", "", "", "component16", "", "component17", "", "component18", "toParamMap", "Lcom/stripe/android/model/PaymentMethodCode;", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "", "component2$payments_core_release", "()Z", "component2", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "component3", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component15", PaymentMethodOptionsParams.Blik.PARAM_CODE, "requiresMandate", "card", "ideal", "fpx", "sepaDebit", "auBecsDebit", "bacsDebit", "sofort", "upi", "netbanking", "usBankAccount", "link", "cashAppPay", "billingDetails", PaymentMethodCreateParams.PARAM_METADATA, NamedConstantsKt.PRODUCT_USAGE, "overrideParamMap", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "getCode$payments_core_release", "Z", "getRequiresMandate$payments_core_release", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Link;", "Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Ljava/util/Map;", "Ljava/util/Set;", "getTypeParams", "()Ljava/util/Map;", "typeParams", "getTypeCode", "typeCode", "getAttribution$payments_core_release", "()Ljava/util/Set;", "attribution", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethodCreateParams$Link;Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "(Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethodCreateParams$Link;Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "Companion", "AuBecsDebit", "BacsDebit", "Card", "CashAppPay", "Fpx", "Ideal", "Link", "Netbanking", "SepaDebit", "Sofort", "USBankAccount", "Upi", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodCreateParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodCreateParams.kt\ncom/stripe/android/model/PaymentMethodCreateParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,987:1\n1#2:988\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodCreateParams implements StripeParamsModel, Parcelable {
    private static final String PARAM_BILLING_DETAILS = "billing_details";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_TYPE = "type";
    private final AuBecsDebit auBecsDebit;
    private final BacsDebit bacsDebit;
    private final PaymentMethod.BillingDetails billingDetails;
    private final Card card;
    private final CashAppPay cashAppPay;
    private final String code;
    private final Fpx fpx;
    private final Ideal ideal;
    private final Link link;
    private final Map<String, String> metadata;
    private final Netbanking netbanking;
    private final Map<String, Object> overrideParamMap;
    private final Set<String> productUsage;
    private final boolean requiresMandate;
    private final SepaDebit sepaDebit;
    private final Sofort sofort;
    private final Upi upi;
    private final USBankAccount usBankAccount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethodCreateParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "bsbNumber", "", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "getBsbNumber", "setBsbNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class AuBecsDebit implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_BSB_NUMBER = "bsb_number";
        private String accountNumber;
        private String bsbNumber;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit$Companion;", "", "()V", "PARAM_ACCOUNT_NUMBER", "", "PARAM_BSB_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<AuBecsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit[] newArray(int i) {
                return new AuBecsDebit[i];
            }
        }

        public AuBecsDebit(String bsbNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(bsbNumber, "bsbNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.bsbNumber = bsbNumber;
            this.accountNumber = accountNumber;
        }

        public static /* synthetic */ AuBecsDebit copy$default(AuBecsDebit auBecsDebit, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = auBecsDebit.bsbNumber;
            }
            if ((i & 2) != 0) {
                str2 = auBecsDebit.accountNumber;
            }
            return auBecsDebit.copy(str, str2);
        }

        public final String component1() {
            return this.bsbNumber;
        }

        public final String component2() {
            return this.accountNumber;
        }

        public final AuBecsDebit copy(String bsbNumber, String accountNumber) {
            Intrinsics.checkNotNullParameter(bsbNumber, "bsbNumber");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new AuBecsDebit(bsbNumber, accountNumber);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AuBecsDebit) {
                AuBecsDebit auBecsDebit = (AuBecsDebit) obj;
                return Intrinsics.areEqual(this.bsbNumber, auBecsDebit.bsbNumber) && Intrinsics.areEqual(this.accountNumber, auBecsDebit.accountNumber);
            }
            return false;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getBsbNumber() {
            return this.bsbNumber;
        }

        public int hashCode() {
            return (this.bsbNumber.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public final void setAccountNumber(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.accountNumber = str;
        }

        public final void setBsbNumber(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.bsbNumber = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> mapOf;
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_BSB_NUMBER, this.bsbNumber), TuplesKt.m28425to(PARAM_ACCOUNT_NUMBER, this.accountNumber));
            return mapOf;
        }

        public String toString() {
            String str = this.bsbNumber;
            String str2 = this.accountNumber;
            return "AuBecsDebit(bsbNumber=" + str + ", accountNumber=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bsbNumber);
            out.writeString(this.accountNumber);
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "accountNumber", "", "sortCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "getSortCode", "setSortCode", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class BacsDebit implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_SORT_CODE = "sort_code";
        private String accountNumber;
        private String sortCode;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit$Companion;", "", "()V", "PARAM_ACCOUNT_NUMBER", "", "PARAM_SORT_CODE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
            }
        }

        public BacsDebit(String accountNumber, String sortCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            this.accountNumber = accountNumber;
            this.sortCode = sortCode;
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bacsDebit.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = bacsDebit.sortCode;
            }
            return bacsDebit.copy(str, str2);
        }

        public final String component1() {
            return this.accountNumber;
        }

        public final String component2() {
            return this.sortCode;
        }

        public final BacsDebit copy(String accountNumber, String sortCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sortCode, "sortCode");
            return new BacsDebit(accountNumber, sortCode);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BacsDebit) {
                BacsDebit bacsDebit = (BacsDebit) obj;
                return Intrinsics.areEqual(this.accountNumber, bacsDebit.accountNumber) && Intrinsics.areEqual(this.sortCode, bacsDebit.sortCode);
            }
            return false;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSortCode() {
            return this.sortCode;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.sortCode.hashCode();
        }

        public final void setAccountNumber(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.accountNumber = str;
        }

        public final void setSortCode(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.sortCode = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> mapOf;
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_ACCOUNT_NUMBER, this.accountNumber), TuplesKt.m28425to(PARAM_SORT_CODE, this.sortCode));
            return mapOf;
        }

        public String toString() {
            String str = this.accountNumber;
            String str2 = this.sortCode;
            return "BacsDebit(accountNumber=" + str + ", sortCode=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.accountNumber);
            out.writeString(this.sortCode);
        }
    }

    @Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 92\u00020\u00012\u00020\u0002:\u000289BU\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0002\b#J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b&J\\\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\n\u0010.\u001a\u0004\u0018\u00010\u0004H\u0007J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\u0014\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020-01H\u0016J\t\u00102\u001a\u00020\u0004HÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Card.PARAM_NUMBER, "", "expiryMonth", "", "expiryYear", Card.PARAM_CVC, Card.PARAM_TOKEN, "attribution", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getAttribution$payments_core_release", "()Ljava/util/Set;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "getBrand$payments_core_release", "()Lcom/stripe/android/model/CardBrand;", "getCvc$payments_core_release", "()Ljava/lang/String;", "getExpiryMonth$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear$payments_core_release", "last4", "getLast4$payments_core_release", "getNumber$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component6", "component6$payments_core_release", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "getLast4", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentMethodCreateParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodCreateParams.kt\ncom/stripe/android/model/PaymentMethodCreateParams$Card\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,987:1\n1603#2,9:988\n1855#2:997\n1856#2:999\n1612#2:1000\n1#3:998\n*S KotlinDebug\n*F\n+ 1 PaymentMethodCreateParams.kt\ncom/stripe/android/model/PaymentMethodCreateParams$Card\n*L\n286#1:988,9\n286#1:997\n286#1:999\n286#1:1000\n286#1:998\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Card implements StripeParamsModel, Parcelable {
        private static final String PARAM_CVC = "cvc";
        private static final String PARAM_EXP_MONTH = "exp_month";
        private static final String PARAM_EXP_YEAR = "exp_year";
        private static final String PARAM_NUMBER = "number";
        private static final String PARAM_TOKEN = "token";
        private final Set<String> attribution;
        private final String cvc;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final String number;
        private final String token;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "()V", Card.PARAM_CVC, "", "expiryMonth", "", "Ljava/lang/Integer;", "expiryYear", Card.PARAM_NUMBER, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setCvc", "setExpiryMonth", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;", "setExpiryYear", "setNumber", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Builder implements ObjectBuilder<Card> {
            public static final int $stable = 8;
            private String cvc;
            private Integer expiryMonth;
            private Integer expiryYear;
            private String number;

            public final Builder setCvc(String str) {
                this.cvc = str;
                return this;
            }

            public final Builder setExpiryMonth(Integer num) {
                this.expiryMonth = num;
                return this;
            }

            public final Builder setExpiryYear(Integer num) {
                this.expiryYear = num;
                return this;
            }

            public final Builder setNumber(String str) {
                this.number = str;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Card build() {
                return new Card(this.number, this.expiryMonth, this.expiryYear, this.cvc, null, null, 48, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Companion;", "", "()V", "PARAM_CVC", "", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_NUMBER", "PARAM_TOKEN", "create", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", Card.PARAM_TOKEN, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Card create(String token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return new Card(null, null, null, null, token, null, 46, null);
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                LinkedHashSet linkedHashSet = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new Card(readString, valueOf, valueOf2, readString2, readString3, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card() {
            this(null, null, null, null, null, null, 63, null);
        }

        private final String component5() {
            return this.token;
        }

        public static /* synthetic */ Card copy$default(Card card, String str, Integer num, Integer num2, String str2, String str3, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = card.number;
            }
            if ((i & 2) != 0) {
                num = card.expiryMonth;
            }
            Integer num3 = num;
            if ((i & 4) != 0) {
                num2 = card.expiryYear;
            }
            Integer num4 = num2;
            if ((i & 8) != 0) {
                str2 = card.cvc;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                str3 = card.token;
            }
            String str5 = str3;
            Set<String> set2 = set;
            if ((i & 32) != 0) {
                set2 = card.attribution;
            }
            return card.copy(str, num3, num4, str4, str5, set2);
        }

        @JvmStatic
        public static final Card create(String str) {
            return Companion.create(str);
        }

        public final String component1$payments_core_release() {
            return this.number;
        }

        public final Integer component2$payments_core_release() {
            return this.expiryMonth;
        }

        public final Integer component3$payments_core_release() {
            return this.expiryYear;
        }

        public final String component4$payments_core_release() {
            return this.cvc;
        }

        public final Set<String> component6$payments_core_release() {
            return this.attribution;
        }

        public final Card copy(String str, Integer num, Integer num2, String str2, String str3, Set<String> set) {
            return new Card(str, num, num2, str2, str3, set);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return Intrinsics.areEqual(this.number, card.number) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && Intrinsics.areEqual(this.cvc, card.cvc) && Intrinsics.areEqual(this.token, card.token) && Intrinsics.areEqual(this.attribution, card.attribution);
            }
            return false;
        }

        public final Set<String> getAttribution$payments_core_release() {
            return this.attribution;
        }

        public final CardBrand getBrand$payments_core_release() {
            return CardUtils.getPossibleCardBrand(this.number);
        }

        public final String getCvc$payments_core_release() {
            return this.cvc;
        }

        public final Integer getExpiryMonth$payments_core_release() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear$payments_core_release() {
            return this.expiryYear;
        }

        public final String getLast4() {
            return getLast4$payments_core_release();
        }

        public final String getLast4$payments_core_release() {
            String takeLast;
            String str = this.number;
            if (str != null) {
                takeLast = StringsKt___StringsKt.takeLast(str, 4);
                return takeLast;
            }
            return null;
        }

        public final String getNumber$payments_core_release() {
            return this.number;
        }

        public int hashCode() {
            String str = this.number;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.expiryMonth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.cvc;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.token;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set<String> set = this.attribution;
            return hashCode5 + (set != null ? set.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair> listOf;
            Map<String, Object> map;
            Pair pair;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(PARAM_NUMBER, this.number), TuplesKt.m28425to(PARAM_EXP_MONTH, this.expiryMonth), TuplesKt.m28425to(PARAM_EXP_YEAR, this.expiryYear), TuplesKt.m28425to(PARAM_CVC, this.cvc), TuplesKt.m28425to(PARAM_TOKEN, this.token)});
            ArrayList arrayList = new ArrayList();
            for (Pair pair2 : listOf) {
                Object second = pair2.getSecond();
                if (second != null) {
                    pair = TuplesKt.m28425to(pair2.getFirst(), second);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            map = MapsKt__MapsKt.toMap(arrayList);
            return map;
        }

        public String toString() {
            String str = this.number;
            Integer num = this.expiryMonth;
            Integer num2 = this.expiryYear;
            String str2 = this.cvc;
            String str3 = this.token;
            Set<String> set = this.attribution;
            return "Card(number=" + str + ", expiryMonth=" + num + ", expiryYear=" + num2 + ", cvc=" + str2 + ", token=" + str3 + ", attribution=" + set + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.number);
            Integer num = this.expiryMonth;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.cvc);
            out.writeString(this.token);
            Set<String> set = this.attribution;
            if (set == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(set.size());
            for (String str : set) {
                out.writeString(str);
            }
        }

        public Card(String str, Integer num, Integer num2, String str2, String str3, Set<String> set) {
            this.number = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.cvc = str2;
            this.token = str3;
            this.attribution = set;
        }

        public /* synthetic */ Card(String str, Integer num, Integer num2, String str2, String str3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : set);
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005HÖ\u0001¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "()V", "describeContents", "", "toParamMap", "", "", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CashAppPay implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<CashAppPay> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<CashAppPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashAppPay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return new CashAppPay();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashAppPay[] newArray(int i) {
                return new CashAppPay[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> emptyMap;
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J(\u0010 \u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J(\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J(\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J(\u0010#\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J(\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J(\u0010%\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J \u0010&\u001a\u00020\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J \u0010'\u001a\u00020\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J,\u0010(\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0007J,\u0010,\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J,\u0010-\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J,\u0010.\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J,\u0010/\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J,\u00100\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J,\u00101\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J0\u00105\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u0007J@\u0010=\u001a\u00020\u00042\n\u00107\u001a\u00060\u000bj\u0002`62\u0006\u00109\u001a\u0002082\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0;H\u0007R\u0014\u0010>\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010?¨\u0006D"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;", "", "Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "card", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "", "", PaymentMethodCreateParams.PARAM_METADATA, "create", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "ideal", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "fpx", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "sofort", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "upi", "Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "netbanking", "createP24", "createBancontact", "createGiropay", "createGrabPay", "createEps", "createOxxo", "createAlipay", "createPayPal", "createAfterpayClearpay", "Lorg/json/JSONObject;", "googlePayPaymentData", "createFromGooglePay", "createBlik", "createWeChatPay", "createKlarna", "createAffirm", "createUSBankAccount", "createCashAppPay", "paymentDetailsId", "consumerSessionClientSecret", "extraParams", "createLink", "Lcom/stripe/android/model/PaymentMethodCode;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "requiresMandate", "overrideParamMap", "", NamedConstantsKt.PRODUCT_USAGE, "createWithOverride", "PARAM_BILLING_DETAILS", "Ljava/lang/String;", "PARAM_METADATA", "PARAM_TYPE", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Card card, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(card, billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createAffirm$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createAffirm(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createAfterpayClearpay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createAfterpayClearpay(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createAlipay$default(Companion companion, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = null;
            }
            return companion.createAlipay(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createBancontact$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createBancontact(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createBlik$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createBlik(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createCashAppPay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createCashAppPay(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createEps$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createEps(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createGiropay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createGiropay(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createGrabPay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createGrabPay(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createKlarna$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createKlarna(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createLink$default(Companion companion, String str, String str2, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.createLink(str, str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createOxxo$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createOxxo(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createP24$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createP24(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createPayPal$default(Companion companion, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = null;
            }
            return companion.createPayPal(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createUSBankAccount$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createUSBankAccount(billingDetails, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createWeChatPay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createWeChatPay(billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(auBecsDebit, "auBecsDebit");
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return create$default(this, auBecsDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAffirm() {
            return createAffirm$default(this, null, null, 3, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAfterpayClearpay() {
            return createAfterpayClearpay$default(this, null, null, 3, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAlipay() {
            return createAlipay$default(this, null, 1, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return createBancontact$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createBlik() {
            return createBlik$default(this, null, null, 3, null);
        }

        @JvmStatic
        public final PaymentMethodCreateParams createCard(CardParams cardParams) {
            Intrinsics.checkNotNullParameter(cardParams, "cardParams");
            return create(new Card(cardParams.getNumber$payments_core_release(), Integer.valueOf(cardParams.getExpMonth$payments_core_release()), Integer.valueOf(cardParams.getExpYear$payments_core_release()), cardParams.getCvc$payments_core_release(), null, cardParams.getAttribution(), 16, null), new PaymentMethod.BillingDetails(cardParams.getAddress(), null, cardParams.getName(), null, 10, null), cardParams.getMetadata());
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createCashAppPay() {
            return createCashAppPay$default(this, null, null, 3, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return createEps$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        public final PaymentMethodCreateParams createFromGooglePay(JSONObject googlePayPaymentData) throws JSONException {
            String str;
            Set ofNotNull;
            com.stripe.android.model.Card card;
            TokenizationMethod tokenizationMethod;
            Intrinsics.checkNotNullParameter(googlePayPaymentData, "googlePayPaymentData");
            GooglePayResult fromJson = GooglePayResult.Companion.fromJson(googlePayPaymentData);
            Token token = fromJson.getToken();
            String str2 = null;
            if (token != null) {
                str = token.getId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str3 = str;
            if (token != null && (card = token.getCard()) != null && (tokenizationMethod = card.getTokenizationMethod()) != null) {
                str2 = tokenizationMethod.toString();
            }
            ofNotNull = SetsKt__SetsKt.setOfNotNull(str2);
            return create$default(this, new Card(null, null, null, null, str3, ofNotNull, 15, null), new PaymentMethod.BillingDetails(fromJson.getAddress(), fromJson.getEmail(), fromJson.getName(), fromJson.getPhoneNumber()), (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return createGiropay$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return createGrabPay$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createKlarna() {
            return createKlarna$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createLink(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Link, null, null, null, null, null, null, null, null, null, null, new Link(paymentDetailsId, consumerSessionClientSecret, map), null, null, null, null, null, 129022, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return createOxxo$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return createP24$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createPayPal() {
            return createPayPal$default(this, null, 1, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createUSBankAccount() {
            return createUSBankAccount$default(this, null, null, 3, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createWeChatPay() {
            return createWeChatPay$default(this, null, null, 3, null);
        }

        public final PaymentMethodCreateParams createWithOverride(String code, boolean z, Map<String, ? extends Object> map, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return new PaymentMethodCreateParams(code, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, productUsage, map, 65532, null);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(ideal, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(bacsDebit, "bacsDebit");
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return create$default(this, bacsDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails) {
            return createAffirm$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails) {
            return createAfterpayClearpay$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAlipay(Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Alipay, null, null, null, null, null, null, null, null, null, null, null, null, null, map, null, null, 114686, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Bancontact, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails) {
            return createBlik$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createCashAppPay(PaymentMethod.BillingDetails billingDetails) {
            return createCashAppPay$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Eps, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Giropay, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.GrabPay, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails) {
            return createKlarna$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.Oxxo, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.Type.P24, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createPayPal(Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.PayPal, null, null, null, null, null, null, null, null, null, null, null, null, null, map, null, null, 114686, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails) {
            return createUSBankAccount$default(this, billingDetails, null, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails) {
            return createWeChatPay$default(this, billingDetails, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(fpx, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Card card) {
            Intrinsics.checkNotNullParameter(card, "card");
            return create$default(this, card, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Affirm, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.AfterpayClearpay, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Blik, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createCashAppPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(new CashAppPay(), billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.Klarna, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.USBankAccount, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(PaymentMethod.Type.WeChatPay, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106494, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(sepaDebit, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(card, "card");
            return create$default(this, card, billingDetails, (Map) null, 4, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(auBecsDebit, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Fpx fpx) {
            Intrinsics.checkNotNullParameter(fpx, "fpx");
            return create$default(this, fpx, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(bacsDebit, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(fpx, "fpx");
            return create$default(this, fpx, billingDetails, (Map) null, 4, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(sofort, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Ideal ideal) {
            Intrinsics.checkNotNullParameter(ideal, "ideal");
            return create$default(this, ideal, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Upi upi, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(upi, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(ideal, "ideal");
            return create$default(this, ideal, billingDetails, (Map) null, 4, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(uSBankAccount, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Netbanking netbanking) {
            Intrinsics.checkNotNullParameter(netbanking, "netbanking");
            return create$default(this, netbanking, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(netbanking, billingDetails, map);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(netbanking, "netbanking");
            return create$default(this, netbanking, billingDetails, (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(SepaDebit sepaDebit) {
            Intrinsics.checkNotNullParameter(sepaDebit, "sepaDebit");
            return create$default(this, sepaDebit, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(sepaDebit, "sepaDebit");
            return create$default(this, sepaDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Sofort sofort) {
            Intrinsics.checkNotNullParameter(sofort, "sofort");
            return create$default(this, sofort, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(sofort, "sofort");
            return create$default(this, sofort, billingDetails, (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(USBankAccount usBankAccount) {
            Intrinsics.checkNotNullParameter(usBankAccount, "usBankAccount");
            return create$default(this, usBankAccount, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(USBankAccount usBankAccount, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(usBankAccount, "usBankAccount");
            return create$default(this, usBankAccount, billingDetails, (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Upi upi) {
            Intrinsics.checkNotNullParameter(upi, "upi");
            return create$default(this, upi, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(upi, "upi");
            return create$default(this, upi, billingDetails, (Map) null, 4, (Object) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(card, "card");
            return new PaymentMethodCreateParams(card, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(ideal, "ideal");
            return new PaymentMethodCreateParams(ideal, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(fpx, "fpx");
            return new PaymentMethodCreateParams(fpx, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(sepaDebit, "sepaDebit");
            return new PaymentMethodCreateParams(sepaDebit, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(auBecsDebit, "auBecsDebit");
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(auBecsDebit, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(bacsDebit, "bacsDebit");
            Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(bacsDebit, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(sofort, "sofort");
            return new PaymentMethodCreateParams(sofort, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(upi, "upi");
            return new PaymentMethodCreateParams(upi, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(USBankAccount usBankAccount, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(usBankAccount, "usBankAccount");
            return new PaymentMethodCreateParams(usBankAccount, billingDetails, map, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(netbanking, "netbanking");
            return new PaymentMethodCreateParams(netbanking, billingDetails, map, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethodCreateParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodCreateParams createFromParcel(Parcel parcel) {
            Link link;
            USBankAccount uSBankAccount;
            LinkedHashMap linkedHashMap;
            LinkedHashSet linkedHashSet;
            LinkedHashMap linkedHashMap2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Card createFromParcel = parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel);
            Ideal createFromParcel2 = parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel);
            Fpx createFromParcel3 = parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel);
            SepaDebit createFromParcel4 = parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel);
            AuBecsDebit createFromParcel5 = parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel);
            BacsDebit createFromParcel6 = parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel);
            Sofort createFromParcel7 = parcel.readInt() == 0 ? null : Sofort.CREATOR.createFromParcel(parcel);
            Upi createFromParcel8 = parcel.readInt() == 0 ? null : Upi.CREATOR.createFromParcel(parcel);
            Netbanking createFromParcel9 = parcel.readInt() == 0 ? null : Netbanking.CREATOR.createFromParcel(parcel);
            USBankAccount createFromParcel10 = parcel.readInt() == 0 ? null : USBankAccount.CREATOR.createFromParcel(parcel);
            Link createFromParcel11 = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            CashAppPay createFromParcel12 = parcel.readInt() == 0 ? null : CashAppPay.CREATOR.createFromParcel(parcel);
            PaymentMethod.BillingDetails createFromParcel13 = parcel.readInt() == 0 ? null : PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                uSBankAccount = createFromParcel10;
                link = createFromParcel11;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                link = createFromParcel11;
                int i = 0;
                while (i != readInt) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                    i++;
                    readInt = readInt;
                    createFromParcel10 = createFromParcel10;
                }
                uSBankAccount = createFromParcel10;
                linkedHashMap = linkedHashMap3;
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashSet2.add(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    linkedHashMap4.put(parcel.readString(), parcel.readValue(PaymentMethodCreateParams.class.getClassLoader()));
                    i3++;
                    readInt3 = readInt3;
                    linkedHashSet2 = linkedHashSet2;
                }
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = linkedHashMap4;
            }
            return new PaymentMethodCreateParams(readString, z, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, uSBankAccount, link, createFromParcel12, createFromParcel13, linkedHashMap, linkedHashSet, linkedHashMap2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodCreateParams[] newArray(int i) {
            return new PaymentMethodCreateParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fHÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Fpx.PARAM_BANK, "", "(Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "setBank", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Fpx implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Fpx> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fpx(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx[] newArray(int i) {
                return new Fpx[i];
            }
        }

        public Fpx(String str) {
            this.bank = str;
        }

        public static /* synthetic */ Fpx copy$default(Fpx fpx, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fpx.bank;
            }
            return fpx.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Fpx copy(String str) {
            return new Fpx(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fpx) && Intrinsics.areEqual(this.bank, ((Fpx) obj).bank);
        }

        public final String getBank() {
            return this.bank;
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setBank(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> map;
            Map<String, Object> emptyMap;
            String str = this.bank;
            if (str != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_BANK, str));
            } else {
                map = null;
            }
            if (map == null) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                return emptyMap;
            }
            return map;
        }

        public String toString() {
            String str = this.bank;
            return "Fpx(bank=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bank);
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fHÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Ideal.PARAM_BANK, "", "(Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "setBank", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentMethodCreateParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodCreateParams.kt\ncom/stripe/android/model/PaymentMethodCreateParams$Ideal\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,987:1\n1#2:988\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Ideal implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Ideal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ideal(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal[] newArray(int i) {
                return new Ideal[i];
            }
        }

        public Ideal(String str) {
            this.bank = str;
        }

        public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideal.bank;
            }
            return ideal.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Ideal copy(String str) {
            return new Ideal(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ideal) && Intrinsics.areEqual(this.bank, ((Ideal) obj).bank);
        }

        public final String getBank() {
            return this.bank;
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setBank(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> emptyMap;
            String str = this.bank;
            Map<String, Object> mapOf = str != null ? MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_BANK, str)) : null;
            if (mapOf == null) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                return emptyMap;
            }
            return mapOf;
        }

        public String toString() {
            String str = this.bank;
            return "Ideal(bank=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bank);
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Netbanking.PARAM_BANK, "", "(Ljava/lang/String;)V", "getBank$payments_core_release", "()Ljava/lang/String;", "setBank$payments_core_release", "component1", "component1$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Netbanking implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking$Companion;", "", "()V", "PARAM_BANK", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Netbanking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking[] newArray(int i) {
                return new Netbanking[i];
            }
        }

        public Netbanking(String bank) {
            Intrinsics.checkNotNullParameter(bank, "bank");
            this.bank = bank;
        }

        public static /* synthetic */ Netbanking copy$default(Netbanking netbanking, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = netbanking.bank;
            }
            return netbanking.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.bank;
        }

        public final Netbanking copy(String bank) {
            Intrinsics.checkNotNullParameter(bank, "bank");
            return new Netbanking(bank);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Netbanking) && Intrinsics.areEqual(this.bank, ((Netbanking) obj).bank);
        }

        public final String getBank$payments_core_release() {
            return this.bank;
        }

        public int hashCode() {
            return this.bank.hashCode();
        }

        public final void setBank$payments_core_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.bank = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> mapOf;
            String lowerCase = this.bank.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_BANK, lowerCase));
            return mapOf;
        }

        public String toString() {
            String str = this.bank;
            return "Netbanking(bank=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.bank);
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fHÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", SepaDebit.PARAM_IBAN, "", "(Ljava/lang/String;)V", "getIban", "()Ljava/lang/String;", "setIban", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SepaDebit implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_IBAN = "iban";
        private String iban;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit$Companion;", "", "()V", "PARAM_IBAN", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDebit(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public SepaDebit(String str) {
            this.iban = str;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.iban;
            }
            return sepaDebit.copy(str);
        }

        public final String component1() {
            return this.iban;
        }

        public final SepaDebit copy(String str) {
            return new SepaDebit(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SepaDebit) && Intrinsics.areEqual(this.iban, ((SepaDebit) obj).iban);
        }

        public final String getIban() {
            return this.iban;
        }

        public int hashCode() {
            String str = this.iban;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final void setIban(String str) {
            this.iban = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> map;
            Map<String, Object> emptyMap;
            String str = this.iban;
            if (str != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_IBAN, str));
            } else {
                map = null;
            }
            if (map == null) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                return emptyMap;
            }
            return map;
        }

        public String toString() {
            String str = this.iban;
            return "SepaDebit(iban=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.iban);
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "country", "", "(Ljava/lang/String;)V", "getCountry$payments_core_release", "()Ljava/lang/String;", "setCountry$payments_core_release", "component1", "component1$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Sofort implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_COUNTRY = "country";
        private String country;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort$Companion;", "", "()V", "PARAM_COUNTRY", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Sofort> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort[] newArray(int i) {
                return new Sofort[i];
            }
        }

        public Sofort(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
        }

        public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sofort.country;
            }
            return sofort.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.country;
        }

        public final Sofort copy(String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            return new Sofort(country);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sofort) && Intrinsics.areEqual(this.country, ((Sofort) obj).country);
        }

        public final String getCountry$payments_core_release() {
            return this.country;
        }

        public int hashCode() {
            return this.country.hashCode();
        }

        public final void setCountry$payments_core_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.country = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> mapOf;
            String upperCase = this.country.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("country", upperCase));
            return mapOf;
        }

        public String toString() {
            String str = this.country;
            return "Sofort(country=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.country);
        }
    }

    @Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B'\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fBC\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0002\b J\u0010\u0010!\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b$J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b&JE\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020-00H\u0016J\t\u00101\u001a\u00020\u0004HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020)HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0005¨\u00068"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "linkAccountSessionId", "", "(Ljava/lang/String;)V", "accountNumber", "routingNumber", "accountType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "accountHolderType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V", "getAccountHolderType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "setAccountHolderType$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;)V", "getAccountNumber$payments_core_release", "()Ljava/lang/String;", "setAccountNumber$payments_core_release", "getAccountType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "setAccountType$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;)V", "getLinkAccountSessionId$payments_core_release", "setLinkAccountSessionId$payments_core_release", "getRoutingNumber$payments_core_release", "setRoutingNumber$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class USBankAccount implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_ACCOUNT_HOLDER_TYPE = "account_holder_type";
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_ACCOUNT_TYPE = "account_type";
        @Deprecated
        private static final String PARAM_LINKED_ACCOUNT_SESSION_ID = "link_account_session";
        @Deprecated
        private static final String PARAM_ROUTING_NUMBER = "routing_number";
        private PaymentMethod.USBankAccount.USBankAccountHolderType accountHolderType;
        private String accountNumber;
        private PaymentMethod.USBankAccount.USBankAccountType accountType;
        private String linkAccountSessionId;
        private String routingNumber;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount$Companion;", "", "()V", "PARAM_ACCOUNT_HOLDER_TYPE", "", "PARAM_ACCOUNT_NUMBER", "PARAM_ACCOUNT_TYPE", "PARAM_LINKED_ACCOUNT_SESSION_ID", "PARAM_ROUTING_NUMBER", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.USBankAccount.USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethod.USBankAccount.USBankAccountHolderType.CREATOR.createFromParcel(parcel) : null, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        public /* synthetic */ USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, uSBankAccountType, uSBankAccountHolderType);
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uSBankAccount.linkAccountSessionId;
            }
            if ((i & 2) != 0) {
                str2 = uSBankAccount.accountNumber;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = uSBankAccount.routingNumber;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                uSBankAccountType = uSBankAccount.accountType;
            }
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType2 = uSBankAccountType;
            if ((i & 16) != 0) {
                uSBankAccountHolderType = uSBankAccount.accountHolderType;
            }
            return uSBankAccount.copy(str, str4, str5, uSBankAccountType2, uSBankAccountHolderType);
        }

        public final String component1$payments_core_release() {
            return this.linkAccountSessionId;
        }

        public final String component2$payments_core_release() {
            return this.accountNumber;
        }

        public final String component3$payments_core_release() {
            return this.routingNumber;
        }

        public final PaymentMethod.USBankAccount.USBankAccountType component4$payments_core_release() {
            return this.accountType;
        }

        public final PaymentMethod.USBankAccount.USBankAccountHolderType component5$payments_core_release() {
            return this.accountHolderType;
        }

        public final USBankAccount copy(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
            return new USBankAccount(str, str2, str3, uSBankAccountType, uSBankAccountHolderType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof USBankAccount) {
                USBankAccount uSBankAccount = (USBankAccount) obj;
                return Intrinsics.areEqual(this.linkAccountSessionId, uSBankAccount.linkAccountSessionId) && Intrinsics.areEqual(this.accountNumber, uSBankAccount.accountNumber) && Intrinsics.areEqual(this.routingNumber, uSBankAccount.routingNumber) && this.accountType == uSBankAccount.accountType && this.accountHolderType == uSBankAccount.accountHolderType;
            }
            return false;
        }

        public final PaymentMethod.USBankAccount.USBankAccountHolderType getAccountHolderType$payments_core_release() {
            return this.accountHolderType;
        }

        public final String getAccountNumber$payments_core_release() {
            return this.accountNumber;
        }

        public final PaymentMethod.USBankAccount.USBankAccountType getAccountType$payments_core_release() {
            return this.accountType;
        }

        public final String getLinkAccountSessionId$payments_core_release() {
            return this.linkAccountSessionId;
        }

        public final String getRoutingNumber$payments_core_release() {
            return this.routingNumber;
        }

        public int hashCode() {
            String str = this.linkAccountSessionId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.routingNumber;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            int hashCode4 = (hashCode3 + (uSBankAccountType == null ? 0 : uSBankAccountType.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            return hashCode4 + (uSBankAccountHolderType != null ? uSBankAccountHolderType.hashCode() : 0);
        }

        public final void setAccountHolderType$payments_core_release(PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
            this.accountHolderType = uSBankAccountHolderType;
        }

        public final void setAccountNumber$payments_core_release(String str) {
            this.accountNumber = str;
        }

        public final void setAccountType$payments_core_release(PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType) {
            this.accountType = uSBankAccountType;
        }

        public final void setLinkAccountSessionId$payments_core_release(String str) {
            this.linkAccountSessionId = str;
        }

        public final void setRoutingNumber$payments_core_release(String str) {
            this.routingNumber = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> mapOf;
            Map<String, Object> mapOf2;
            String str = this.linkAccountSessionId;
            if (str != null) {
                Intrinsics.checkNotNull(str);
                mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_LINKED_ACCOUNT_SESSION_ID, str));
                return mapOf2;
            }
            String str2 = this.accountNumber;
            Intrinsics.checkNotNull(str2);
            String str3 = this.routingNumber;
            Intrinsics.checkNotNull(str3);
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            Intrinsics.checkNotNull(uSBankAccountType);
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            Intrinsics.checkNotNull(uSBankAccountHolderType);
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_ACCOUNT_NUMBER, str2), TuplesKt.m28425to(PARAM_ROUTING_NUMBER, str3), TuplesKt.m28425to(PARAM_ACCOUNT_TYPE, uSBankAccountType.getValue()), TuplesKt.m28425to(PARAM_ACCOUNT_HOLDER_TYPE, uSBankAccountHolderType.getValue()));
            return mapOf;
        }

        public String toString() {
            String str = this.linkAccountSessionId;
            String str2 = this.accountNumber;
            String str3 = this.routingNumber;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            return "USBankAccount(linkAccountSessionId=" + str + ", accountNumber=" + str2 + ", routingNumber=" + str3 + ", accountType=" + uSBankAccountType + ", accountHolderType=" + uSBankAccountHolderType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.linkAccountSessionId);
            out.writeString(this.accountNumber);
            out.writeString(this.routingNumber);
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            if (uSBankAccountType == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                uSBankAccountType.writeToParcel(out, i);
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            if (uSBankAccountHolderType == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            uSBankAccountHolderType.writeToParcel(out, i);
        }

        private USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
            this.linkAccountSessionId = str;
            this.accountNumber = str2;
            this.routingNumber = str3;
            this.accountType = uSBankAccountType;
            this.accountHolderType = uSBankAccountHolderType;
        }

        public /* synthetic */ USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType, PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : uSBankAccountType, (i & 16) != 0 ? null : uSBankAccountHolderType);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public USBankAccount(String linkAccountSessionId) {
            this(linkAccountSessionId, null, null, null, null);
            Intrinsics.checkNotNullParameter(linkAccountSessionId, "linkAccountSessionId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public USBankAccount(String accountNumber, String routingNumber, PaymentMethod.USBankAccount.USBankAccountType accountType, PaymentMethod.USBankAccount.USBankAccountHolderType accountHolderType) {
            this(null, accountNumber, routingNumber, accountType, accountHolderType);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tHÖ\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Upi.PARAM_VPA, "", "(Ljava/lang/String;)V", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Upi implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_VPA = "vpa";
        private final String vpa;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi$Companion;", "", "()V", "PARAM_VPA", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Upi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi[] newArray(int i) {
                return new Upi[i];
            }
        }

        public Upi(String str) {
            this.vpa = str;
        }

        private final String component1() {
            return this.vpa;
        }

        public static /* synthetic */ Upi copy$default(Upi upi, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upi.vpa;
            }
            return upi.copy(str);
        }

        public final Upi copy(String str) {
            return new Upi(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Upi) && Intrinsics.areEqual(this.vpa, ((Upi) obj).vpa);
        }

        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> map;
            Map<String, Object> emptyMap;
            String str = this.vpa;
            if (str != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_VPA, str));
            } else {
                map = null;
            }
            if (map == null) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                return emptyMap;
            }
            return map;
        }

        public String toString() {
            String str = this.vpa;
            return "Upi(vpa=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.vpa);
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(auBecsDebit, billingDetails, map);
    }

    private final Upi component10() {
        return this.upi;
    }

    private final Netbanking component11() {
        return this.netbanking;
    }

    private final USBankAccount component12() {
        return this.usBankAccount;
    }

    private final Link component13() {
        return this.link;
    }

    private final CashAppPay component14() {
        return this.cashAppPay;
    }

    private final Map<String, String> component16() {
        return this.metadata;
    }

    private final Set<String> component17() {
        return this.productUsage;
    }

    private final Map<String, Object> component18() {
        return this.overrideParamMap;
    }

    private final Ideal component4() {
        return this.ideal;
    }

    private final Fpx component5() {
        return this.fpx;
    }

    private final SepaDebit component6() {
        return this.sepaDebit;
    }

    private final AuBecsDebit component7() {
        return this.auBecsDebit;
    }

    private final BacsDebit component8() {
        return this.bacsDebit;
    }

    private final Sofort component9() {
        return this.sofort;
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(auBecsDebit, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAffirm() {
        return Companion.createAffirm();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAfterpayClearpay() {
        return Companion.createAfterpayClearpay();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAlipay() {
        return Companion.createAlipay();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createBancontact(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createBlik() {
        return Companion.createBlik();
    }

    @JvmStatic
    public static final PaymentMethodCreateParams createCard(CardParams cardParams) {
        return Companion.createCard(cardParams);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createCashAppPay() {
        return Companion.createCashAppPay();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createEps(billingDetails);
    }

    @JvmStatic
    public static final PaymentMethodCreateParams createFromGooglePay(JSONObject jSONObject) throws JSONException {
        return Companion.createFromGooglePay(jSONObject);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createGiropay(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createGrabPay(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createKlarna() {
        return Companion.createKlarna();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createOxxo(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createP24(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createPayPal() {
        return Companion.createPayPal();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createUSBankAccount() {
        return Companion.createUSBankAccount();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createWeChatPay() {
        return Companion.createWeChatPay();
    }

    private final Map<String, Object> getTypeParams() {
        Link link;
        Map<String, Object> paramMap;
        boolean z;
        Map<String, Object> emptyMap;
        String str = this.code;
        Map<String, Object> map = null;
        if (Intrinsics.areEqual(str, PaymentMethod.Type.Card.code)) {
            Card card = this.card;
            if (card != null) {
                paramMap = card.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Ideal.code)) {
            Ideal ideal = this.ideal;
            if (ideal != null) {
                paramMap = ideal.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Fpx.code)) {
            Fpx fpx = this.fpx;
            if (fpx != null) {
                paramMap = fpx.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.SepaDebit.code)) {
            SepaDebit sepaDebit = this.sepaDebit;
            if (sepaDebit != null) {
                paramMap = sepaDebit.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.AuBecsDebit.code)) {
            AuBecsDebit auBecsDebit = this.auBecsDebit;
            if (auBecsDebit != null) {
                paramMap = auBecsDebit.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.BacsDebit.code)) {
            BacsDebit bacsDebit = this.bacsDebit;
            if (bacsDebit != null) {
                paramMap = bacsDebit.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Sofort.code)) {
            Sofort sofort = this.sofort;
            if (sofort != null) {
                paramMap = sofort.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Upi.code)) {
            Upi upi = this.upi;
            if (upi != null) {
                paramMap = upi.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.Netbanking.code)) {
            Netbanking netbanking = this.netbanking;
            if (netbanking != null) {
                paramMap = netbanking.toParamMap();
            }
            paramMap = null;
        } else if (Intrinsics.areEqual(str, PaymentMethod.Type.USBankAccount.code)) {
            USBankAccount uSBankAccount = this.usBankAccount;
            if (uSBankAccount != null) {
                paramMap = uSBankAccount.toParamMap();
            }
            paramMap = null;
        } else {
            if (Intrinsics.areEqual(str, PaymentMethod.Type.Link.code) && (link = this.link) != null) {
                paramMap = link.toParamMap();
            }
            paramMap = null;
        }
        if (paramMap != null && !paramMap.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            paramMap = null;
        }
        if (paramMap != null) {
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(this.code, paramMap));
        }
        if (map == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        return map;
    }

    public final String component1$payments_core_release() {
        return this.code;
    }

    public final PaymentMethod.BillingDetails component15() {
        return this.billingDetails;
    }

    public final boolean component2$payments_core_release() {
        return this.requiresMandate;
    }

    public final Card component3() {
        return this.card;
    }

    public final PaymentMethodCreateParams copy(String code, boolean z, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, PaymentMethod.BillingDetails billingDetails, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        return new PaymentMethodCreateParams(code, z, card, ideal, fpx, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, uSBankAccount, link, cashAppPay, billingDetails, map, productUsage, map2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentMethodCreateParams) {
            PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) obj;
            return Intrinsics.areEqual(this.code, paymentMethodCreateParams.code) && this.requiresMandate == paymentMethodCreateParams.requiresMandate && Intrinsics.areEqual(this.card, paymentMethodCreateParams.card) && Intrinsics.areEqual(this.ideal, paymentMethodCreateParams.ideal) && Intrinsics.areEqual(this.fpx, paymentMethodCreateParams.fpx) && Intrinsics.areEqual(this.sepaDebit, paymentMethodCreateParams.sepaDebit) && Intrinsics.areEqual(this.auBecsDebit, paymentMethodCreateParams.auBecsDebit) && Intrinsics.areEqual(this.bacsDebit, paymentMethodCreateParams.bacsDebit) && Intrinsics.areEqual(this.sofort, paymentMethodCreateParams.sofort) && Intrinsics.areEqual(this.upi, paymentMethodCreateParams.upi) && Intrinsics.areEqual(this.netbanking, paymentMethodCreateParams.netbanking) && Intrinsics.areEqual(this.usBankAccount, paymentMethodCreateParams.usBankAccount) && Intrinsics.areEqual(this.link, paymentMethodCreateParams.link) && Intrinsics.areEqual(this.cashAppPay, paymentMethodCreateParams.cashAppPay) && Intrinsics.areEqual(this.billingDetails, paymentMethodCreateParams.billingDetails) && Intrinsics.areEqual(this.metadata, paymentMethodCreateParams.metadata) && Intrinsics.areEqual(this.productUsage, paymentMethodCreateParams.productUsage) && Intrinsics.areEqual(this.overrideParamMap, paymentMethodCreateParams.overrideParamMap);
        }
        return false;
    }

    public final /* synthetic */ Set getAttribution$payments_core_release() {
        Set<String> emptySet;
        Set plus;
        if (Intrinsics.areEqual(this.code, PaymentMethod.Type.Card.code)) {
            Card card = this.card;
            if (card == null || (emptySet = card.getAttribution$payments_core_release()) == null) {
                emptySet = SetsKt__SetsKt.emptySet();
            }
            plus = SetsKt___SetsKt.plus((Set) emptySet, (Iterable) this.productUsage);
            return plus;
        }
        return this.productUsage;
    }

    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final Card getCard() {
        return this.card;
    }

    public final String getCode$payments_core_release() {
        return this.code;
    }

    public final boolean getRequiresMandate$payments_core_release() {
        return this.requiresMandate;
    }

    public final String getTypeCode() {
        return this.code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.code.hashCode() * 31;
        boolean z = this.requiresMandate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Card card = this.card;
        int hashCode2 = (i2 + (card == null ? 0 : card.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int hashCode3 = (hashCode2 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int hashCode4 = (hashCode3 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int hashCode5 = (hashCode4 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int hashCode6 = (hashCode5 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int hashCode7 = (hashCode6 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int hashCode8 = (hashCode7 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int hashCode9 = (hashCode8 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int hashCode10 = (hashCode9 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int hashCode11 = (hashCode10 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        Link link = this.link;
        int hashCode12 = (hashCode11 + (link == null ? 0 : link.hashCode())) * 31;
        CashAppPay cashAppPay = this.cashAppPay;
        int hashCode13 = (hashCode12 + (cashAppPay == null ? 0 : cashAppPay.hashCode())) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        int hashCode14 = (hashCode13 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int hashCode15 = (((hashCode14 + (map == null ? 0 : map.hashCode())) * 31) + this.productUsage.hashCode()) * 31;
        Map<String, Object> map2 = this.overrideParamMap;
        return hashCode15 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapOf;
        Map map;
        Map plus;
        Map plus2;
        Map<String, Object> plus3;
        Map<String, Object> map2 = this.overrideParamMap;
        if (map2 == null) {
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("type", this.code));
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            Map map3 = null;
            if (billingDetails != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_BILLING_DETAILS, billingDetails.toParamMap()));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(mapOf, map);
            plus2 = MapsKt__MapsKt.plus(plus, getTypeParams());
            Map<String, String> map4 = this.metadata;
            if (map4 != null) {
                map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_METADATA, map4));
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus3 = MapsKt__MapsKt.plus(plus2, map3);
            return plus3;
        }
        return map2;
    }

    public String toString() {
        String str = this.code;
        boolean z = this.requiresMandate;
        Card card = this.card;
        Ideal ideal = this.ideal;
        Fpx fpx = this.fpx;
        SepaDebit sepaDebit = this.sepaDebit;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        BacsDebit bacsDebit = this.bacsDebit;
        Sofort sofort = this.sofort;
        Upi upi = this.upi;
        Netbanking netbanking = this.netbanking;
        USBankAccount uSBankAccount = this.usBankAccount;
        Link link = this.link;
        CashAppPay cashAppPay = this.cashAppPay;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        Map<String, String> map = this.metadata;
        Set<String> set = this.productUsage;
        Map<String, Object> map2 = this.overrideParamMap;
        return "PaymentMethodCreateParams(code=" + str + ", requiresMandate=" + z + ", card=" + card + ", ideal=" + ideal + ", fpx=" + fpx + ", sepaDebit=" + sepaDebit + ", auBecsDebit=" + auBecsDebit + ", bacsDebit=" + bacsDebit + ", sofort=" + sofort + ", upi=" + upi + ", netbanking=" + netbanking + ", usBankAccount=" + uSBankAccount + ", link=" + link + ", cashAppPay=" + cashAppPay + ", billingDetails=" + billingDetails + ", metadata=" + map + ", productUsage=" + set + ", overrideParamMap=" + map2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.code);
        out.writeInt(this.requiresMandate ? 1 : 0);
        Card card = this.card;
        if (card == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            card.writeToParcel(out, i);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ideal.writeToParcel(out, i);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            fpx.writeToParcel(out, i);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sepaDebit.writeToParcel(out, i);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            auBecsDebit.writeToParcel(out, i);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bacsDebit.writeToParcel(out, i);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sofort.writeToParcel(out, i);
        }
        Upi upi = this.upi;
        if (upi == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            upi.writeToParcel(out, i);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            netbanking.writeToParcel(out, i);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            uSBankAccount.writeToParcel(out, i);
        }
        Link link = this.link;
        if (link == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            link.writeToParcel(out, i);
        }
        CashAppPay cashAppPay = this.cashAppPay;
        if (cashAppPay == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cashAppPay.writeToParcel(out, i);
        }
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            billingDetails.writeToParcel(out, i);
        }
        Map<String, String> map = this.metadata;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        Set<String> set = this.productUsage;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
        Map<String, Object> map2 = this.overrideParamMap;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            out.writeString(entry2.getKey());
            out.writeValue(entry2.getValue());
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(bacsDebit, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(auBecsDebit, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createAffirm(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createAfterpayClearpay(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAlipay(Map<String, String> map) {
        return Companion.createAlipay(map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createBancontact(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createBlik(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createCashAppPay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createCashAppPay(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createEps(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createGiropay(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createGrabPay(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createKlarna(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createOxxo(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createP24(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createPayPal(Map<String, String> map) {
        return Companion.createPayPal(map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createUSBankAccount(billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails) {
        return Companion.createWeChatPay(billingDetails);
    }

    public /* synthetic */ PaymentMethodCreateParams(Card card, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(card, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(bacsDebit, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAffirm(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createAffirm(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createAfterpayClearpay(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createBlik(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createCashAppPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createCashAppPay(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createKlarna(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createKlarna(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createUSBankAccount(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createUSBankAccount(billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.createWeChatPay(billingDetails, map);
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B/\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b)\u0010*J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\n\u0010\bJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0014HÖ\u0001R\"\u0010\u000f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\"R\"\u0010\u0010\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\"R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010(¨\u0006,"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Link;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "component2$payments_core_release", "component2", "component3$payments_core_release", "()Ljava/util/Map;", "component3", "paymentDetailsId", "consumerSessionClientSecret", "extraParams", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "getPaymentDetailsId$payments_core_release", "setPaymentDetailsId$payments_core_release", "(Ljava/lang/String;)V", "getConsumerSessionClientSecret$payments_core_release", "setConsumerSessionClientSecret$payments_core_release", "Ljava/util/Map;", "getExtraParams$payments_core_release", "setExtraParams$payments_core_release", "(Ljava/util/Map;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Link implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_CONSUMER_SESSION_CLIENT_SECRET = "consumer_session_client_secret";
        @Deprecated
        private static final String PARAM_CREDENTIALS = "credentials";
        @Deprecated
        private static final String PARAM_PAYMENT_DETAILS_ID = "payment_details_id";
        private String consumerSessionClientSecret;
        private Map<String, ? extends Object> extraParams;
        private String paymentDetailsId;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Link> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Link$Companion;", "", "()V", "PARAM_CONSUMER_SESSION_CLIENT_SECRET", "", "PARAM_CREDENTIALS", "PARAM_PAYMENT_DETAILS_ID", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(Link.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Link(readString, readString2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.paymentDetailsId = paymentDetailsId;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.extraParams = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Link copy$default(Link link, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.paymentDetailsId;
            }
            if ((i & 2) != 0) {
                str2 = link.consumerSessionClientSecret;
            }
            if ((i & 4) != 0) {
                map = link.extraParams;
            }
            return link.copy(str, str2, map);
        }

        public final String component1$payments_core_release() {
            return this.paymentDetailsId;
        }

        public final String component2$payments_core_release() {
            return this.consumerSessionClientSecret;
        }

        public final Map<String, Object> component3$payments_core_release() {
            return this.extraParams;
        }

        public final Link copy(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            Intrinsics.checkNotNullParameter(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new Link(paymentDetailsId, consumerSessionClientSecret, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Link) {
                Link link = (Link) obj;
                return Intrinsics.areEqual(this.paymentDetailsId, link.paymentDetailsId) && Intrinsics.areEqual(this.consumerSessionClientSecret, link.consumerSessionClientSecret) && Intrinsics.areEqual(this.extraParams, link.extraParams);
            }
            return false;
        }

        public final String getConsumerSessionClientSecret$payments_core_release() {
            return this.consumerSessionClientSecret;
        }

        public final Map<String, Object> getExtraParams$payments_core_release() {
            return this.extraParams;
        }

        public final String getPaymentDetailsId$payments_core_release() {
            return this.paymentDetailsId;
        }

        public int hashCode() {
            int hashCode = ((this.paymentDetailsId.hashCode() * 31) + this.consumerSessionClientSecret.hashCode()) * 31;
            Map<String, ? extends Object> map = this.extraParams;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public final void setConsumerSessionClientSecret$payments_core_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.consumerSessionClientSecret = str;
        }

        public final void setExtraParams$payments_core_release(Map<String, ? extends Object> map) {
            this.extraParams = map;
        }

        public final void setPaymentDetailsId$payments_core_release(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.paymentDetailsId = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapOf;
            Map mapOf2;
            Map<String, Object> plus;
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CONSUMER_SESSION_CLIENT_SECRET, this.consumerSessionClientSecret));
            mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_PAYMENT_DETAILS_ID, this.paymentDetailsId), TuplesKt.m28425to(PARAM_CREDENTIALS, mapOf));
            Map<String, ? extends Object> map = this.extraParams;
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus = MapsKt__MapsKt.plus(mapOf2, map);
            return plus;
        }

        public String toString() {
            String str = this.paymentDetailsId;
            String str2 = this.consumerSessionClientSecret;
            Map<String, ? extends Object> map = this.extraParams;
            return "Link(paymentDetailsId=" + str + ", consumerSessionClientSecret=" + str2 + ", extraParams=" + map + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.paymentDetailsId);
            out.writeString(this.consumerSessionClientSecret);
            Map<String, ? extends Object> map = this.extraParams;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeValue(entry.getValue());
            }
        }

        public /* synthetic */ Link(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : map);
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(CashAppPay cashAppPay, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(cashAppPay, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(bacsDebit, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(fpx, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Card card) {
        return Companion.create(card);
    }

    public /* synthetic */ PaymentMethodCreateParams(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(ideal, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(card, billingDetails);
    }

    public /* synthetic */ PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(netbanking, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(card, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(sepaDebit, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Fpx fpx) {
        return Companion.create(fpx);
    }

    public /* synthetic */ PaymentMethodCreateParams(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(sofort, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(fpx, billingDetails);
    }

    public /* synthetic */ PaymentMethodCreateParams(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(uSBankAccount, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(fpx, billingDetails, map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Upi upi, PaymentMethod.BillingDetails billingDetails, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(upi, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Ideal ideal) {
        return Companion.create(ideal);
    }

    public PaymentMethodCreateParams(String code, boolean z, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, PaymentMethod.BillingDetails billingDetails, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        this.code = code;
        this.requiresMandate = z;
        this.card = card;
        this.ideal = ideal;
        this.fpx = fpx;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.link = link;
        this.cashAppPay = cashAppPay;
        this.billingDetails = billingDetails;
        this.metadata = map;
        this.productUsage = productUsage;
        this.overrideParamMap = map2;
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(ideal, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(ideal, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Netbanking netbanking) {
        return Companion.create(netbanking);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(netbanking, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(netbanking, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit) {
        return Companion.create(sepaDebit);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(sepaDebit, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(sepaDebit, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Sofort sofort) {
        return Companion.create(sofort);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(sofort, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(sofort, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(USBankAccount uSBankAccount) {
        return Companion.create(uSBankAccount);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(uSBankAccount, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(uSBankAccount, billingDetails, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Upi upi) {
        return Companion.create(upi);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails) {
        return Companion.create(upi, billingDetails);
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        return Companion.create(upi, billingDetails, map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PaymentMethodCreateParams(String str, boolean z, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, PaymentMethod.BillingDetails billingDetails, Map map, Set set, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : map2);
        Set set2;
        Set emptySet;
        Card card2 = (i & 4) != 0 ? null : card;
        Ideal ideal2 = (i & 8) != 0 ? null : ideal;
        Fpx fpx2 = (i & 16) != 0 ? null : fpx;
        SepaDebit sepaDebit2 = (i & 32) != 0 ? null : sepaDebit;
        AuBecsDebit auBecsDebit2 = (i & 64) != 0 ? null : auBecsDebit;
        BacsDebit bacsDebit2 = (i & 128) != 0 ? null : bacsDebit;
        Sofort sofort2 = (i & 256) != 0 ? null : sofort;
        Upi upi2 = (i & 512) != 0 ? null : upi;
        Netbanking netbanking2 = (i & 1024) != 0 ? null : netbanking;
        USBankAccount uSBankAccount2 = (i & 2048) != 0 ? null : uSBankAccount;
        Link link2 = (i & 4096) != 0 ? null : link;
        CashAppPay cashAppPay2 = (i & 8192) != 0 ? null : cashAppPay;
        PaymentMethod.BillingDetails billingDetails2 = (i & 16384) != 0 ? null : billingDetails;
        Map map3 = (32768 & i) != 0 ? null : map;
        if ((65536 & i) != 0) {
            emptySet = SetsKt__SetsKt.emptySet();
            set2 = emptySet;
        } else {
            set2 = set;
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(PaymentMethod.Type type, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, PaymentMethod.BillingDetails billingDetails, Map map, Set set, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? null : card, (i & 4) != 0 ? null : ideal, (i & 8) != 0 ? null : fpx, (i & 16) != 0 ? null : sepaDebit, (i & 32) != 0 ? null : auBecsDebit, (i & 64) != 0 ? null : bacsDebit, (i & 128) != 0 ? null : sofort, (i & 256) != 0 ? null : upi, (i & 512) != 0 ? null : netbanking, (i & 1024) != 0 ? null : uSBankAccount, (i & 2048) != 0 ? null : link, (i & 4096) != 0 ? null : cashAppPay, (i & 8192) != 0 ? null : billingDetails, (i & 16384) != 0 ? null : map, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 65536) == 0 ? map2 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodCreateParams(PaymentMethod.Type type, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, PaymentMethod.BillingDetails billingDetails, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        this(type.code, type.requiresMandate, card, ideal, fpx, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, uSBankAccount, link, cashAppPay, billingDetails, map, productUsage, map2);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
    }

    private PaymentMethodCreateParams(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Card, card, null, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106492, null);
    }

    private PaymentMethodCreateParams(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Ideal, null, ideal, null, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106490, null);
    }

    private PaymentMethodCreateParams(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Fpx, null, null, fpx, null, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106486, null);
    }

    private PaymentMethodCreateParams(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.SepaDebit, null, null, null, sepaDebit, null, null, null, null, null, null, null, null, billingDetails, map, null, null, 106478, null);
    }

    private PaymentMethodCreateParams(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.AuBecsDebit, null, null, null, null, auBecsDebit, null, null, null, null, null, null, null, billingDetails, map, null, null, 106462, null);
    }

    private PaymentMethodCreateParams(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.BacsDebit, null, null, null, null, null, bacsDebit, null, null, null, null, null, null, billingDetails, map, null, null, 106430, null);
    }

    private PaymentMethodCreateParams(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Sofort, null, null, null, null, null, null, sofort, null, null, null, null, null, billingDetails, map, null, null, 106366, null);
    }

    private PaymentMethodCreateParams(Upi upi, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Upi, null, null, null, null, null, null, null, upi, null, null, null, null, billingDetails, map, null, null, 106238, null);
    }

    private PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.Netbanking, null, null, null, null, null, null, null, null, netbanking, null, null, null, billingDetails, map, null, null, 105982, null);
    }

    private PaymentMethodCreateParams(USBankAccount uSBankAccount, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.USBankAccount, null, null, null, null, null, null, null, null, null, uSBankAccount, null, null, billingDetails, map, null, null, 105470, null);
    }

    private PaymentMethodCreateParams(CashAppPay cashAppPay, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
        this(PaymentMethod.Type.CashAppPay, null, null, null, null, null, null, null, null, null, null, null, cashAppPay, billingDetails, map, null, null, 102398, null);
    }
}
