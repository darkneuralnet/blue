package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.databinding.CardMultilineWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000ù\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b%*\u00017\b\u0007\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u0002:\u0006Ð\u0001Ñ\u0001Ò\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u0099\u0001\u001a\u00030\u0098\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u009a\u0001\u001a\u00030\u0098\u0001H\u0016J\n\u0010\u009b\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010\u009c\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010\u009d\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010\u009e\u0001\u001a\u00030\u0098\u0001H\u0002J\b\u0010a\u001a\u00020\nH\u0016J\t\u0010\u009f\u0001\u001a\u00020\nH\u0002J\n\u0010 \u0001\u001a\u00030\u0098\u0001H\u0014J\u0013\u0010¡\u0001\u001a\u00030\u0098\u00012\u0007\u0010¢\u0001\u001a\u00020\nH\u0016J\u0015\u0010£\u0001\u001a\u00030\u0098\u00012\t\u0010¤\u0001\u001a\u0004\u0018\u00010kH\u0007J\u0013\u0010¥\u0001\u001a\u00030\u0098\u00012\u0007\u0010¦\u0001\u001a\u00020:H\u0016J\u0015\u0010§\u0001\u001a\u00030\u0098\u00012\t\u0010¨\u0001\u001a\u0004\u0018\u00010 H\u0016J\u0015\u0010©\u0001\u001a\u00030\u0098\u00012\t\u0010ª\u0001\u001a\u0004\u0018\u00010:H\u0016J\u0013\u0010«\u0001\u001a\u00030\u0098\u00012\u0007\u0010¨\u0001\u001a\u00020%H\u0007J\u0016\u0010¬\u0001\u001a\u00030\u0098\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001H\u0016J\u0015\u0010¯\u0001\u001a\u00030\u0098\u00012\t\u0010°\u0001\u001a\u0004\u0018\u000105H\u0016J\u0015\u0010±\u0001\u001a\u00030\u0098\u00012\t\u0010²\u0001\u001a\u0004\u0018\u00010:H\u0016J\u0013\u0010³\u0001\u001a\u00030\u0098\u00012\u0007\u0010¨\u0001\u001a\u00020%H\u0007J\u001a\u0010´\u0001\u001a\u00030\u0098\u00012\t\u0010µ\u0001\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010TJ\u0013\u0010¶\u0001\u001a\u00030\u0098\u00012\t\u0010·\u0001\u001a\u0004\u0018\u00010:J\u0016\u0010¸\u0001\u001a\u00030\u0098\u00012\n\u0010¹\u0001\u001a\u0005\u0018\u00010®\u0001H\u0016J\u0015\u0010º\u0001\u001a\u00030\u0098\u00012\t\u0010»\u0001\u001a\u0004\u0018\u00010:H\u0007J\u0013\u0010¼\u0001\u001a\u00030\u0098\u00012\u0007\u0010½\u0001\u001a\u00020\nH\u0016J\u0013\u0010¾\u0001\u001a\u00030\u0098\u00012\u0007\u0010¨\u0001\u001a\u00020%H\u0007J\u001c\u0010¿\u0001\u001a\u00030\u0098\u00012\u000b\b\u0001\u0010µ\u0001\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010TJ \u0010À\u0001\u001a\u00030\u0098\u00012\t\b\u0001\u0010Á\u0001\u001a\u00020\b2\t\b\u0001\u0010Â\u0001\u001a\u00020\bH\u0016J\u0016\u0010Ã\u0001\u001a\u00030\u0098\u00012\n\u0010Ä\u0001\u001a\u0005\u0018\u00010®\u0001H\u0016J\u0015\u0010Å\u0001\u001a\u00030\u0098\u00012\t\u0010¨\u0001\u001a\u0004\u0018\u00010%H\u0007J\u0016\u0010Æ\u0001\u001a\u00030\u0098\u00012\n\u0010Ç\u0001\u001a\u0005\u0018\u00010®\u0001H\u0016J\u0010\u0010È\u0001\u001a\u00030\u0098\u00012\u0006\u0010\t\u001a\u00020\nJ\n\u0010É\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010Ê\u0001\u001a\u00030\u0098\u0001H\u0002J\u001e\u0010Ë\u0001\u001a\u00030\u0098\u00012\u0007\u0010Ì\u0001\u001a\u00020\u000e2\t\b\u0001\u0010Í\u0001\u001a\u00020\bH\u0002J\u0007\u0010Î\u0001\u001a\u00020\nJ\u0007\u0010Ï\u0001\u001a\u00020\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R+\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0004\n\u0002\u00108R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010<\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R+\u0010@\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u001e\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u0016\u0010D\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010H\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR+\u0010L\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\u001e\u001a\u0004\bM\u0010(\"\u0004\bN\u0010*R/\u0010P\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u001e\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020W8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010GR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u000e\u0010a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010b\u001a\u0004\u0018\u00010c8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010f\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010j\u001a\u0004\u0018\u00010k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010n\u001a\u0004\u0018\u00010o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020s8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR/\u0010v\u001a\u0004\u0018\u00010%2\b\u0010\u0016\u001a\u0004\u0018\u00010%8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\u001e\u001a\u0004\bw\u0010(\"\u0004\bx\u0010*R\u001a\u0010z\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0015\u0010\u007f\u001a\u00020EX\u0080\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010GR\u0019\u0010\u0081\u0001\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R2\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\n8\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0000\u0012\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010|\"\u0005\b\u0089\u0001\u0010~R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020E0\u008c\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010\u001e\u001a\u0005\b\u008e\u0001\u0010|\"\u0005\b\u008f\u0001\u0010~R\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0010\u0010\u0095\u0001\u001a\u00030\u0096\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Ó\u0001"}, m28432d2 = {"Lcom/stripe/android/view/CardMultilineWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardWidget;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "shouldShowPostalCode", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "allFields", "", "Lcom/stripe/android/view/StripeEditText;", "getAllFields", "()Ljava/util/Collection;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "cardBrand", "<set-?>", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "cardBrandIconSupplier", "getCardBrandIconSupplier$payments_core_release", "()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "setCardBrandIconSupplier$payments_core_release", "(Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;)V", "cardBrandIconSupplier$delegate", "Lkotlin/properties/ReadWriteProperty;", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText", "()Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release", "()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "setCardNumberErrorListener$payments_core_release", "(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V", "cardNumberErrorListener$delegate", "cardNumberTextInputLayout", "Lcom/stripe/android/view/CardNumberTextInputLayout;", "getCardNumberTextInputLayout", "()Lcom/stripe/android/view/CardNumberTextInputLayout;", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "com/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1", "Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;", "customCvcLabel", "", "customCvcPlaceholderText", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText", "()Lcom/stripe/android/view/CvcEditText;", "cvcErrorListener", "getCvcErrorListener$payments_core_release", "setCvcErrorListener$payments_core_release", "cvcErrorListener$delegate", "cvcInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getCvcInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "expirationDate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getExpirationDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release", "setExpirationDateErrorListener$payments_core_release", "expirationDateErrorListener$delegate", "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release", "()Ljava/lang/Integer;", "setExpirationDatePlaceholderRes$payments_core_release", "(Ljava/lang/Integer;)V", "expirationDatePlaceholderRes$delegate", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText", "()Lcom/stripe/android/view/ExpiryDateEditText;", "expiryTextInputLayout", "getExpiryTextInputLayout", "invalidFields", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields$payments_core_release", "()Ljava/util/Set;", "isEnabled", "paymentMethodBillingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getPaymentMethodBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentMethodBillingDetailsBuilder", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "getPaymentMethodBillingDetailsBuilder", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release", "setPostalCodeErrorListener$payments_core_release", "postalCodeErrorListener$delegate", "postalCodeRequired", "getPostalCodeRequired", "()Z", "setPostalCodeRequired", "(Z)V", "postalInputLayout", "getPostalInputLayout$payments_core_release", "secondRowLayout", "getSecondRowLayout", "()Landroid/widget/LinearLayout;", "value", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release$annotations", "()V", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon$payments_core_release", "showCvcIconInCvcField", "textInputLayouts", "", "usZipCodeRequired", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired$delegate", "validatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_release", "()Lcom/stripe/android/cards/CardNumber$Validated;", "viewBinding", "Lcom/stripe/android/databinding/CardMultilineWidgetBinding;", "adjustViewForPostalCodeAttribute", "", "checkAttributeSet", "clear", "flipToCvcIconIfNotFinished", "initDeleteEmptyListeners", "initFocusChangeListeners", "initTextInputLayoutErrorHandlers", "isPostalRequired", "onAttachedToWindow", "onWindowFocusChanged", "hasWindowFocus", "populate", "card", "setCardHint", "cardHint", "setCardInputListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCardNumber", "cardNumber", "setCardNumberErrorListener", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setCardValidCallback", "callback", "setCvcCode", "cvcCode", "setCvcErrorListener", "setCvcIcon", "resId", "setCvcLabel", "cvcLabel", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setCvcPlaceholderText", "cvcPlaceholderText", "setEnabled", "enabled", "setExpirationDateErrorListener", "setExpirationDatePlaceholderRes", "setExpiryDate", "month", "year", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setPostalCodeErrorListener", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "setShouldShowPostalCode", "updateBrandUi", "updateCvc", "updateEndIcon", "editText", "iconResourceId", "validateAllFields", "validateCardNumber", "CardBrandIcon", "CardBrandIconSupplier", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardMultilineWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardMultilineWidget.kt\ncom/stripe/android/view/CardMultilineWidget\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,778:1\n33#2,3:779\n33#2,3:782\n33#2,3:785\n33#2,3:788\n33#2,3:791\n33#2,3:794\n33#2,3:797\n1855#3,2:800\n1855#3:802\n1856#3:829\n1855#3,2:831\n1855#3,2:833\n288#3,2:835\n1855#3,2:837\n58#4,23:803\n93#4,3:826\n1#5:830\n329#6,4:839\n52#7,9:843\n*S KotlinDebug\n*F\n+ 1 CardMultilineWidget.kt\ncom/stripe/android/view/CardMultilineWidget\n*L\n142#1:779,3\n268#1:782,3\n283#1:785,3\n289#1:788,3\n300#1:791,3\n311#1:794,3\n322#1:797,3\n336#1:800,2\n389#1:802\n389#1:829\n435#1:831,2\n439#1:833,2\n478#1:835,2\n592#1:837,2\n390#1:803,23\n390#1:826,3\n629#1:839,4\n639#1:843,9\n*E\n"})
/* loaded from: classes7.dex */
public final class CardMultilineWidget extends LinearLayout implements CardWidget {
    @Deprecated
    private static final String CARD_MULTILINE_TOKEN = "CardMultilineView";
    private CardBrand cardBrand;
    private final ReadWriteProperty cardBrandIconSupplier$delegate;
    private CardInputListener cardInputListener;
    private final CardNumberEditText cardNumberEditText;
    private final ReadWriteProperty cardNumberErrorListener$delegate;
    private final CardNumberTextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardMultilineWidget$cardValidTextWatcher$1 cardValidTextWatcher;
    private String customCvcLabel;
    private String customCvcPlaceholderText;
    private final CvcEditText cvcEditText;
    private final ReadWriteProperty cvcErrorListener$delegate;
    private final TextInputLayout cvcInputLayout;
    private final ReadWriteProperty expirationDateErrorListener$delegate;
    private final ReadWriteProperty expirationDatePlaceholderRes$delegate;
    private final ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryTextInputLayout;
    private boolean isEnabled;
    private final PostalCodeEditText postalCodeEditText;
    private final ReadWriteProperty postalCodeErrorListener$delegate;
    private boolean postalCodeRequired;
    private final TextInputLayout postalInputLayout;
    private final LinearLayout secondRowLayout;
    private boolean shouldShowErrorIcon;
    private boolean shouldShowPostalCode;
    private boolean showCvcIconInCvcField;
    private final List<TextInputLayout> textInputLayouts;
    private final ReadWriteProperty usZipCodeRequired$delegate;
    private final CardMultilineWidgetBinding viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "cardBrandIconSupplier", "getCardBrandIconSupplier$payments_core_release()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final CardBrandIconSupplier DEFAULT_CARD_BRAND_ICON_SUPPLIER = CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1.INSTANCE;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CardMultilineWidget$2 */
    /* loaded from: classes7.dex */
    public static final class C195072 extends Lambda implements Function0<Unit> {
        public C195072() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
            CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onCardComplete();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CardMultilineWidget$3 */
    /* loaded from: classes7.dex */
    public static final class C195083 extends Lambda implements Function1<CardBrand, Unit> {
        public C195083() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) {
            invoke2(cardBrand);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(CardBrand brand) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            CardMultilineWidget.this.cardBrand = brand;
            CardMultilineWidget.this.updateBrandUi();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CardMultilineWidget$4 */
    /* loaded from: classes7.dex */
    public static final class C195094 extends Lambda implements Function0<Unit> {
        public C195094() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CardMultilineWidget.this.getCvcEditText().requestFocus();
            CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onExpirationComplete();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CardMultilineWidget$8 */
    /* loaded from: classes7.dex */
    public static final class C195128 extends Lambda implements Function1<Boolean, Unit> {
        public C195128() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "", "iconResourceId", "", "(I)V", "getIconResourceId", "()I", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CardBrandIcon {
        private final int iconResourceId;

        public CardBrandIcon(int i) {
            this.iconResourceId = i;
        }

        public static /* synthetic */ CardBrandIcon copy$default(CardBrandIcon cardBrandIcon, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cardBrandIcon.iconResourceId;
            }
            return cardBrandIcon.copy(i);
        }

        public final int component1() {
            return this.iconResourceId;
        }

        public final CardBrandIcon copy(int i) {
            return new CardBrandIcon(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardBrandIcon) && this.iconResourceId == ((CardBrandIcon) obj).iconResourceId;
        }

        public final int getIconResourceId() {
            return this.iconResourceId;
        }

        public int hashCode() {
            return Integer.hashCode(this.iconResourceId);
        }

        public String toString() {
            int i = this.iconResourceId;
            return "CardBrandIcon(iconResourceId=" + i + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "", "get", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface CardBrandIconSupplier {
        CardBrandIcon get(CardBrand cardBrand);
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/CardMultilineWidget$Companion;", "", "()V", "CARD_MULTILINE_TOKEN", "", "DEFAULT_CARD_BRAND_ICON_SUPPLIER", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardMultilineWidget(Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void adjustViewForPostalCodeAttribute(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            i = C18606R.string.expiry_label_short;
        } else {
            i = C18606R.string.acc_label_expiry_date;
        }
        this.expiryTextInputLayout.setHint(getResources().getString(i));
        if (z) {
            i2 = C18606R.C18608id.et_postal_code;
        } else {
            i2 = -1;
        }
        this.cvcEditText.setNextFocusForwardId(i2);
        this.cvcEditText.setNextFocusDownId(i2);
        int i5 = 0;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.postalInputLayout.setVisibility(i3);
        CvcEditText cvcEditText = this.cvcEditText;
        if (i3 == 8) {
            i4 = 6;
        } else {
            i4 = 5;
        }
        cvcEditText.setImeOptions(i4);
        TextInputLayout textInputLayout = this.cvcInputLayout;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z) {
                i5 = getResources().getDimensionPixelSize(C18606R.dimen.stripe_add_card_expiry_middle_margin);
            }
            layoutParams2.setMarginEnd(i5);
            textInputLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final void checkAttributeSet(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int[] CardElement = C18606R.styleable.CardElement;
        Intrinsics.checkNotNullExpressionValue(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.shouldShowPostalCode = obtainStyledAttributes.getBoolean(C18606R.styleable.CardElement_shouldShowPostalCode, this.shouldShowPostalCode);
        this.postalCodeRequired = obtainStyledAttributes.getBoolean(C18606R.styleable.CardElement_shouldRequirePostalCode, this.postalCodeRequired);
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(C18606R.styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flipToCvcIconIfNotFinished() {
        if (this.cardBrand.isMaxCvc(this.cvcEditText.getFieldText$payments_core_release())) {
            return;
        }
        if (this.shouldShowErrorIcon) {
            updateEndIcon(this.cardNumberEditText, this.cardBrand.getErrorIcon());
            return;
        }
        updateEndIcon(this.cardNumberEditText, this.cardBrand.getCvcIcon());
    }

    private final Collection<StripeEditText> getAllFields() {
        Set of;
        of = SetsKt__SetsKt.setOf((Object[]) new StripeEditText[]{this.cardNumberEditText, this.expiryDateEditText, this.cvcEditText, this.postalCodeEditText});
        return of;
    }

    private final ExpirationDate.Validated getExpirationDate() {
        return this.expiryDateEditText.getValidatedDate();
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    private final void initDeleteEmptyListeners() {
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
    }

    private final void initFocusChangeListeners() {
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Qf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$26(CardMultilineWidget.this, view, z);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Rf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$27(CardMultilineWidget.this, view, z);
            }
        });
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Sf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$28(CardMultilineWidget.this, view, z);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Tf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$29(CardMultilineWidget.this, view, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$26(CardMultilineWidget this$0, View view, boolean z) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z && (cardInputListener = this$0.cardInputListener) != null) {
            cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$27(CardMultilineWidget this$0, View view, boolean z) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z && (cardInputListener = this$0.cardInputListener) != null) {
            cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$28(CardMultilineWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            if (!this$0.showCvcIconInCvcField) {
                this$0.flipToCvcIconIfNotFinished();
            }
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
                return;
            }
            return;
        }
        this$0.updateBrandUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$29(CardMultilineWidget this$0, View view, boolean z) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.shouldShowPostalCode && z && (cardInputListener = this$0.cardInputListener) != null) {
            cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
        }
    }

    private final void initTextInputLayoutErrorHandlers() {
        this.cardNumberEditText.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.expiryDateEditText.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.cvcEditText.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.postalCodeEditText.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPostalRequired() {
        return (this.postalCodeRequired || getUsZipCodeRequired()) && this.shouldShowPostalCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBrandUi() {
        updateCvc();
        if (this.shouldShowErrorIcon) {
            updateEndIcon(this.cardNumberEditText, this.cardBrand.getErrorIcon());
            return;
        }
        updateEndIcon(this.cardNumberEditText, getCardBrandIconSupplier$payments_core_release().get(this.cardBrand).getIconResourceId());
    }

    private final void updateCvc() {
        this.cvcEditText.updateBrand$payments_core_release(this.cardBrand, this.customCvcLabel, this.customCvcPlaceholderText, this.cvcInputLayout);
    }

    private final void updateEndIcon(StripeEditText stripeEditText, int i) {
        Drawable m94299e = NA0.m94299e(getContext(), i);
        if (m94299e != null) {
            stripeEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m94299e, (Drawable) null);
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void clear() {
        this.cardNumberEditText.setText("");
        this.expiryDateEditText.setText("");
        this.cvcEditText.setText("");
        this.postalCodeEditText.setText("");
        this.cardNumberEditText.setShouldShowError(false);
        this.expiryDateEditText.setShouldShowError(false);
        this.cvcEditText.setShouldShowError(false);
        this.postalCodeEditText.setShouldShowError(false);
        this.cardBrand = CardBrand.Unknown;
        updateBrandUi();
    }

    public final /* synthetic */ CardBrand getBrand() {
        return this.cardBrand;
    }

    public final CardBrandIconSupplier getCardBrandIconSupplier$payments_core_release() {
        return (CardBrandIconSupplier) this.cardBrandIconSupplier$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    public final StripeEditText.ErrorMessageListener getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cardNumberErrorListener$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.cardNumberTextInputLayout;
    }

    @Override // com.stripe.android.view.CardWidget
    public CardParams getCardParams() {
        String str;
        String str2;
        Set of;
        String str3;
        boolean isBlank;
        boolean z = true;
        String str4 = null;
        if (!validateAllFields()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        ExpirationDate.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        if (validatedDate != null) {
            Editable text = this.cvcEditText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            Editable text2 = this.postalCodeEditText.getText();
            if (text2 != null) {
                str2 = text2.toString();
            } else {
                str2 = null;
            }
            if (!this.shouldShowPostalCode) {
                str2 = null;
            }
            CardBrand brand = getBrand();
            of = SetsKt__SetsJVMKt.setOf(CARD_MULTILINE_TOKEN);
            CardNumber.Validated validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
            if (validatedCardNumber$payments_core_release != null) {
                str3 = validatedCardNumber$payments_core_release.getValue();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            String str5 = str3;
            int month = validatedDate.getMonth();
            int year = validatedDate.getYear();
            Address.Builder builder = new Address.Builder();
            if (str2 != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                if (!isBlank) {
                    z = false;
                }
            }
            if (!z) {
                str4 = str2;
            }
            return new CardParams(brand, of, str5, month, year, str, null, builder.setPostalCode(str4).build(), null, null, 832, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    public final StripeEditText.ErrorMessageListener getCvcErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cvcErrorListener$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.cvcInputLayout;
    }

    public final StripeEditText.ErrorMessageListener getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.expirationDateErrorListener$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.expirationDatePlaceholderRes$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.expiryTextInputLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
        if (r2 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set<CardValidCallback.Fields> getInvalidFields$payments_core_release() {
        boolean z;
        boolean z2;
        boolean z3;
        List listOfNotNull;
        Set<CardValidCallback.Fields> set;
        boolean z4;
        boolean isBlank;
        CardValidCallback.Fields[] fieldsArr = new CardValidCallback.Fields[4];
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        boolean z5 = true;
        if (getValidatedCardNumber$payments_core_release() == null) {
            z = true;
        } else {
            z = false;
        }
        CardValidCallback.Fields fields2 = null;
        if (!z) {
            fields = null;
        }
        fieldsArr[0] = fields;
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        if (getExpirationDate() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            fields3 = null;
        }
        fieldsArr[1] = fields3;
        CardValidCallback.Fields fields4 = CardValidCallback.Fields.Cvc;
        if (this.cvcEditText.getCvc$payments_core_release() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            fields4 = null;
        }
        fieldsArr[2] = fields4;
        CardValidCallback.Fields fields5 = CardValidCallback.Fields.Postal;
        if (isPostalRequired()) {
            String postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release();
            if (postalCode$payments_core_release != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(postalCode$payments_core_release);
                if (!isBlank) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        z5 = false;
        if (z5) {
            fields2 = fields5;
        }
        fieldsArr[3] = fields2;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) fieldsArr);
        set = CollectionsKt___CollectionsKt.toSet(listOfNotNull);
        return set;
    }

    public final PaymentMethod.BillingDetails getPaymentMethodBillingDetails() {
        PaymentMethod.BillingDetails.Builder paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.build();
        }
        return null;
    }

    public final PaymentMethod.BillingDetails.Builder getPaymentMethodBillingDetailsBuilder() {
        if (this.shouldShowPostalCode && validateAllFields()) {
            return new PaymentMethod.BillingDetails.Builder().setAddress(new Address.Builder().setPostalCode(this.postalCodeEditText.getPostalCode$payments_core_release()).build());
        }
        return null;
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams != null) {
            String number$payments_core_release = cardParams.getNumber$payments_core_release();
            String cvc$payments_core_release = cardParams.getCvc$payments_core_release();
            int expMonth$payments_core_release = cardParams.getExpMonth$payments_core_release();
            int expYear$payments_core_release = cardParams.getExpYear$payments_core_release();
            return new PaymentMethodCreateParams.Card(number$payments_core_release, Integer.valueOf(expMonth$payments_core_release), Integer.valueOf(expYear$payments_core_release), cvc$payments_core_release, null, cardParams.getAttribution(), 16, null);
        }
        return null;
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, paymentMethodCard, getPaymentMethodBillingDetails(), (Map) null, 4, (Object) null);
        }
        return null;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.postalCodeEditText;
    }

    public final StripeEditText.ErrorMessageListener getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.postalCodeErrorListener$delegate.getValue(this, $$delegatedProperties[6]);
    }

    public final boolean getPostalCodeRequired() {
        return this.postalCodeRequired;
    }

    public final TextInputLayout getPostalInputLayout$payments_core_release() {
        return this.postalInputLayout;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.secondRowLayout;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.shouldShowErrorIcon;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cvcEditText.setHint((CharSequence) null);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            updateBrandUi();
        }
    }

    public final void populate(PaymentMethodCreateParams.Card card) {
        if (card != null) {
            View findFocus = findFocus();
            this.cardNumberEditText.setText(card.getNumber$payments_core_release());
            this.cvcEditText.setText(card.getCvc$payments_core_release());
            this.expiryDateEditText.setText$payments_core_release(card.getExpiryMonth$payments_core_release(), card.getExpiryYear$payments_core_release());
            if (findFocus != null) {
                findFocus.requestFocus();
                return;
            }
            View findFocus2 = findFocus();
            if (findFocus2 != null) {
                findFocus2.clearFocus();
            }
        }
    }

    public final void setCardBrandIconSupplier$payments_core_release(CardBrandIconSupplier cardBrandIconSupplier) {
        Intrinsics.checkNotNullParameter(cardBrandIconSupplier, "<set-?>");
        this.cardBrandIconSupplier$delegate.setValue(this, $$delegatedProperties[2], cardBrandIconSupplier);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardHint(String cardHint) {
        Intrinsics.checkNotNullParameter(cardHint, "cardHint");
        this.cardNumberTextInputLayout.setPlaceholderText(cardHint);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardInputListener(CardInputListener cardInputListener) {
        this.cardInputListener = cardInputListener;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumber(String str) {
        this.cardNumberEditText.setText(str);
    }

    public final void setCardNumberErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.cardNumberErrorListener$delegate.setValue(this, $$delegatedProperties[3], errorMessageListener);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.cardNumberEditText.addTextChangedListener(textWatcher);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardValidCallback(CardValidCallback cardValidCallback) {
        this.cardValidCallback = cardValidCallback;
        for (StripeEditText stripeEditText : getAllFields()) {
            stripeEditText.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback != null) {
            for (StripeEditText stripeEditText2 : getAllFields()) {
                stripeEditText2.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback2 = this.cardValidCallback;
        if (cardValidCallback2 != null) {
            cardValidCallback2.onInputChanged(getInvalidFields$payments_core_release().isEmpty(), getInvalidFields$payments_core_release());
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcCode(String str) {
        this.cvcEditText.setText(str);
    }

    public final void setCvcErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.cvcErrorListener$delegate.setValue(this, $$delegatedProperties[5], errorMessageListener);
    }

    public final /* synthetic */ void setCvcIcon(Integer num) {
        boolean z;
        if (num != null) {
            updateEndIcon(this.cvcEditText, num.intValue());
        }
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        this.showCvcIconInCvcField = z;
    }

    public final void setCvcLabel(String str) {
        this.customCvcLabel = str;
        updateCvc();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.cvcEditText.addTextChangedListener(textWatcher);
    }

    public final void setCvcPlaceholderText(String str) {
        this.customCvcPlaceholderText = str;
        updateCvc();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (TextInputLayout textInputLayout : this.textInputLayouts) {
            textInputLayout.setEnabled(z);
        }
        this.isEnabled = z;
    }

    public final void setExpirationDateErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.expirationDateErrorListener$delegate.setValue(this, $$delegatedProperties[4], errorMessageListener);
    }

    public final void setExpirationDatePlaceholderRes(Integer num) {
        setExpirationDatePlaceholderRes$payments_core_release(num);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.expirationDatePlaceholderRes$delegate.setValue(this, $$delegatedProperties[1], num);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDate(int i, int i2) {
        this.expiryDateEditText.setText(new ExpirationDate.Unvalidated(i, i2).getDisplayString());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.expiryDateEditText.addTextChangedListener(textWatcher);
    }

    public final void setPostalCodeErrorListener(StripeEditText.ErrorMessageListener errorMessageListener) {
        setPostalCodeErrorListener$payments_core_release(errorMessageListener);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        this.postalCodeErrorListener$delegate.setValue(this, $$delegatedProperties[6], errorMessageListener);
    }

    public final void setPostalCodeRequired(boolean z) {
        this.postalCodeRequired = z;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.postalCodeEditText.addTextChangedListener(textWatcher);
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z) {
        boolean z2;
        if (this.shouldShowErrorIcon != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.shouldShowErrorIcon = z;
        if (z2) {
            updateBrandUi();
        }
    }

    public final void setShouldShowPostalCode(boolean z) {
        this.shouldShowPostalCode = z;
        adjustViewForPostalCodeAttribute(z);
    }

    public final void setUsZipCodeRequired(boolean z) {
        this.usZipCodeRequired$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:666)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:524)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean validateAllFields() {
        /*
            r8 = this;
            com.stripe.android.cards.CardNumber$Validated r0 = r8.getValidatedCardNumber$payments_core_release()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            com.stripe.android.model.ExpirationDate$Validated r3 = r8.getExpirationDate()
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            com.stripe.android.view.CvcEditText r4 = r8.cvcEditText
            com.stripe.android.cards.Cvc$Validated r4 = r4.getCvc$payments_core_release()
            if (r4 == 0) goto L1e
            r4 = r2
            goto L1f
        L1e:
            r4 = r1
        L1f:
            com.stripe.android.view.CardNumberEditText r5 = r8.cardNumberEditText
            r6 = r0 ^ 1
            r5.setShouldShowError(r6)
            com.stripe.android.view.ExpiryDateEditText r5 = r8.expiryDateEditText
            r6 = r3 ^ 1
            r5.setShouldShowError(r6)
            com.stripe.android.view.CvcEditText r5 = r8.cvcEditText
            r6 = r4 ^ 1
            r5.setShouldShowError(r6)
            com.stripe.android.view.PostalCodeEditText r5 = r8.postalCodeEditText
            boolean r6 = r8.postalCodeRequired
            if (r6 != 0) goto L40
            boolean r6 = r8.getUsZipCodeRequired()
            if (r6 == 0) goto L56
        L40:
            com.stripe.android.view.PostalCodeEditText r6 = r8.postalCodeEditText
            java.lang.String r6 = r6.getPostalCode$payments_core_release()
            if (r6 == 0) goto L51
            boolean r6 = kotlin.text.StringsKt.isBlank(r6)
            if (r6 == 0) goto L4f
            goto L51
        L4f:
            r6 = r1
            goto L52
        L51:
            r6 = r2
        L52:
            if (r6 == 0) goto L56
            r6 = r2
            goto L57
        L56:
            r6 = r1
        L57:
            r5.setShouldShowError(r6)
            java.util.Collection r5 = r8.getAllFields()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.stripe.android.view.StripeEditText r7 = (com.stripe.android.view.StripeEditText) r7
            boolean r7 = r7.getShouldShowError()
            if (r7 == 0) goto L64
            goto L79
        L78:
            r6 = 0
        L79:
            com.stripe.android.view.StripeEditText r6 = (com.stripe.android.view.StripeEditText) r6
            if (r6 == 0) goto L80
            r6.requestFocus()
        L80:
            if (r0 == 0) goto L8f
            if (r3 == 0) goto L8f
            if (r4 == 0) goto L8f
            com.stripe.android.view.PostalCodeEditText r0 = r8.postalCodeEditText
            boolean r0 = r0.getShouldShowError()
            if (r0 != 0) goto L8f
            r1 = r2
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardMultilineWidget.validateAllFields():boolean");
    }

    public final boolean validateCardNumber() {
        boolean z;
        if (getValidatedCardNumber$payments_core_release() != null) {
            z = true;
        } else {
            z = false;
        }
        this.cardNumberEditText.setShouldShowError(!z);
        return z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1] */
    @JvmOverloads
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        List<TextInputLayout> listOf;
        Intrinsics.checkNotNullParameter(context, "context");
        this.shouldShowPostalCode = z;
        CardMultilineWidgetBinding inflate = CardMultilineWidgetBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        CardNumberEditText cardNumberEditText = inflate.etCardNumber;
        Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "viewBinding.etCardNumber");
        this.cardNumberEditText = cardNumberEditText;
        ExpiryDateEditText expiryDateEditText = inflate.etExpiry;
        Intrinsics.checkNotNullExpressionValue(expiryDateEditText, "viewBinding.etExpiry");
        this.expiryDateEditText = expiryDateEditText;
        CvcEditText cvcEditText = inflate.etCvc;
        Intrinsics.checkNotNullExpressionValue(cvcEditText, "viewBinding.etCvc");
        this.cvcEditText = cvcEditText;
        PostalCodeEditText postalCodeEditText = inflate.etPostalCode;
        Intrinsics.checkNotNullExpressionValue(postalCodeEditText, "viewBinding.etPostalCode");
        this.postalCodeEditText = postalCodeEditText;
        LinearLayout linearLayout = inflate.secondRowLayout;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewBinding.secondRowLayout");
        this.secondRowLayout = linearLayout;
        CardNumberTextInputLayout cardNumberTextInputLayout = inflate.tlCardNumber;
        Intrinsics.checkNotNullExpressionValue(cardNumberTextInputLayout, "viewBinding.tlCardNumber");
        this.cardNumberTextInputLayout = cardNumberTextInputLayout;
        TextInputLayout textInputLayout = inflate.tlExpiry;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewBinding.tlExpiry");
        this.expiryTextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = inflate.tlCvc;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "viewBinding.tlCvc");
        this.cvcInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = inflate.tlPostalCode;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "viewBinding.tlPostalCode");
        this.postalInputLayout = textInputLayout3;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TextInputLayout[]{cardNumberTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3});
        this.textInputLayouts = listOf;
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CardValidCallback cardValidCallback;
                super.afterTextChanged(editable);
                cardValidCallback = CardMultilineWidget.this.cardValidCallback;
                if (cardValidCallback != null) {
                    cardValidCallback.onInputChanged(CardMultilineWidget.this.getInvalidFields$payments_core_release().isEmpty(), CardMultilineWidget.this.getInvalidFields$payments_core_release());
                }
            }
        };
        this.cardBrand = CardBrand.Unknown;
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.usZipCodeRequired$delegate = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                if (booleanValue) {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.US);
                } else {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.Global);
                }
            }
        };
        final Integer valueOf = Integer.valueOf(C18606R.string.expiry_date_hint);
        this.expirationDatePlaceholderRes$delegate = new ObservableProperty<Integer>(valueOf) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Integer num, Integer num2) {
                String str;
                Intrinsics.checkNotNullParameter(property, "property");
                Integer num3 = num2;
                TextInputLayout expiryTextInputLayout = this.getExpiryTextInputLayout();
                if (num3 != null) {
                    str = this.getResources().getString(num3.intValue());
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                expiryTextInputLayout.setPlaceholderText(str);
            }
        };
        final CardBrandIconSupplier cardBrandIconSupplier = DEFAULT_CARD_BRAND_ICON_SUPPLIER;
        this.cardBrandIconSupplier$delegate = new ObservableProperty<CardBrandIconSupplier>(cardBrandIconSupplier) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, CardMultilineWidget.CardBrandIconSupplier cardBrandIconSupplier2, CardMultilineWidget.CardBrandIconSupplier cardBrandIconSupplier3) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.updateBrandUi();
            }
        };
        final ErrorListener errorListener = new ErrorListener(cardNumberTextInputLayout);
        this.cardNumberErrorListener$delegate = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$4
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getCardNumberEditText().setErrorMessageListener(errorMessageListener2);
            }
        };
        final ErrorListener errorListener2 = new ErrorListener(textInputLayout);
        this.expirationDateErrorListener$delegate = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener2) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$5
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getExpiryDateEditText().setErrorMessageListener(errorMessageListener2);
            }
        };
        final ErrorListener errorListener3 = new ErrorListener(textInputLayout2);
        this.cvcErrorListener$delegate = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener3) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$6
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getCvcEditText().setErrorMessageListener(errorMessageListener2);
            }
        };
        final ErrorListener errorListener4 = new ErrorListener(textInputLayout3);
        this.postalCodeErrorListener$delegate = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener4) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$7
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener errorMessageListener, StripeEditText.ErrorMessageListener errorMessageListener2) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getPostalCodeEditText$payments_core_release().setErrorMessageListener(errorMessageListener2);
            }
        };
        setOrientation(1);
        Iterator<T> it = listOf.iterator();
        while (true) {
            ColorStateList colorStateList = null;
            if (!it.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout4 = (TextInputLayout) it.next();
            EditText editText = textInputLayout4.getEditText();
            if (editText != null) {
                colorStateList = editText.getHintTextColors();
            }
            textInputLayout4.setPlaceholderTextColor(colorStateList);
        }
        checkAttributeSet(attributeSet);
        initTextInputLayoutErrorHandlers();
        initFocusChangeListeners();
        initDeleteEmptyListeners();
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new C195072());
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new C195083());
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new C195094());
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget.5
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                if (CardMultilineWidget.this.cardBrand.isMaxCvc(text)) {
                    CardMultilineWidget.this.updateBrandUi();
                    if (CardMultilineWidget.this.shouldShowPostalCode) {
                        CardMultilineWidget.this.getPostalCodeEditText$payments_core_release().requestFocus();
                    }
                    CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
                    if (cardInputListener != null) {
                        cardInputListener.onCvcComplete();
                    }
                } else if (!CardMultilineWidget.this.showCvcIconInCvcField) {
                    CardMultilineWidget.this.flipToCvcIconIfNotFinished();
                }
                CardMultilineWidget.this.getCvcEditText().setShouldShowError(false);
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget.6
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String it2) {
                CardInputListener cardInputListener;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (CardMultilineWidget.this.isPostalRequired() && CardMultilineWidget.this.getPostalCodeEditText$payments_core_release().hasValidPostal$payments_core_release() && (cardInputListener = CardMultilineWidget.this.cardInputListener) != null) {
                    cardInputListener.onPostalCodeComplete();
                }
            }
        });
        adjustViewForPostalCodeAttribute(this.shouldShowPostalCode);
        CardNumberEditText.updateLengthFilter$payments_core_release$default(this.cardNumberEditText, 0, 1, null);
        this.cardBrand = CardBrand.Unknown;
        updateBrandUi();
        for (StripeEditText stripeEditText : getAllFields()) {
            stripeEditText.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$_init_$lambda$18$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    CardMultilineWidget.this.setShouldShowErrorIcon$payments_core_release(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new C195128());
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
        this.isEnabled = true;
    }
}
