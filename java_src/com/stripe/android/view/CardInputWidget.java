package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.Cvc;
import com.stripe.android.databinding.CardInputWidgetBinding;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardInputWidget;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
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
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.internal.http2.Settings;
@Metadata(m28433d1 = {"\u0000\u009f\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001(\b\u0007\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u0002:\u001cÙ\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\u0092\u0001\u001a\u00030\u0093\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016J\u0018\u0010\u0095\u0001\u001a\u0002032\u0007\u0010\u0096\u0001\u001a\u00020\bH\u0001¢\u0006\u0003\b\u0097\u0001J\u001b\u0010\u0098\u0001\u001a\u00020\b2\u0007\u0010\u0099\u0001\u001a\u0002032\u0007\u0010\u009a\u0001\u001a\u00020\fH\u0002J\u001d\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002J\u0014\u0010\u009e\u0001\u001a\u00030\u0093\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\t\u0010\u009f\u0001\u001a\u00020VH\u0016J\t\u0010 \u0001\u001a\u00020VH\u0002J\n\u0010¡\u0001\u001a\u00030\u0093\u0001H\u0014J\u0013\u0010¢\u0001\u001a\u00020V2\b\u0010£\u0001\u001a\u00030¤\u0001H\u0016J7\u0010¥\u0001\u001a\u00030\u0093\u00012\u0007\u0010¦\u0001\u001a\u00020V2\u0007\u0010§\u0001\u001a\u00020\b2\u0007\u0010¨\u0001\u001a\u00020\b2\u0007\u0010©\u0001\u001a\u00020\b2\u0007\u0010ª\u0001\u001a\u00020\bH\u0014J\u0014\u0010«\u0001\u001a\u00030\u0093\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u0001H\u0014J\n\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0014J\n\u0010¯\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010°\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010±\u0001\u001a\u00030\u0093\u00012\u0007\u0010²\u0001\u001a\u000203H\u0016J\u0015\u0010³\u0001\u001a\u00030\u0093\u00012\t\u0010´\u0001\u001a\u0004\u0018\u00010\u001aH\u0016J\u0015\u0010µ\u0001\u001a\u00030\u0093\u00012\t\u0010¶\u0001\u001a\u0004\u0018\u000103H\u0016J\u0016\u0010·\u0001\u001a\u00030\u0093\u00012\n\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0016J\u0015\u0010º\u0001\u001a\u00030\u0093\u00012\t\u0010»\u0001\u001a\u0004\u0018\u00010&H\u0016J\u0015\u0010¼\u0001\u001a\u00030\u0093\u00012\t\u0010½\u0001\u001a\u0004\u0018\u000103H\u0016J\u0013\u0010¾\u0001\u001a\u00030\u0093\u00012\t\u0010¿\u0001\u001a\u0004\u0018\u000103J\u0016\u0010À\u0001\u001a\u00030\u0093\u00012\n\u0010Á\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0016J\u0013\u0010Â\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u009f\u0001\u001a\u00020VH\u0016J \u0010Ã\u0001\u001a\u00030\u0093\u00012\t\b\u0001\u0010Ä\u0001\u001a\u00020\b2\t\b\u0001\u0010Å\u0001\u001a\u00020\bH\u0016J\u0016\u0010Æ\u0001\u001a\u00030\u0093\u00012\n\u0010Ç\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0016J\u001b\u0010È\u0001\u001a\u00030\u0093\u00012\t\u0010É\u0001\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0003\bÊ\u0001J\u0016\u0010Ë\u0001\u001a\u00030\u0093\u00012\n\u0010Ì\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0016J\u001a\u0010Í\u0001\u001a\u00030\u0093\u00012\u000e\u0010Î\u0001\u001a\t\u0012\u0005\u0012\u00030Ï\u00010-H\u0002J\n\u0010Ð\u0001\u001a\u00030\u0093\u0001H\u0002J&\u0010Ñ\u0001\u001a\u00030\u0093\u00012\b\u0010Ò\u0001\u001a\u00030Ó\u00012\u0007\u0010Ô\u0001\u001a\u00020\b2\u0007\u0010Õ\u0001\u001a\u00020\bH\u0002J\n\u0010Ö\u0001\u001a\u00030\u0093\u0001H\u0002J,\u0010×\u0001\u001a\u00030\u0093\u00012\u0006\u0010U\u001a\u00020V2\b\b\u0002\u0010H\u001a\u00020\b2\b\b\u0002\u0010E\u001a\u00020\bH\u0001¢\u0006\u0003\bØ\u0001R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010,\u001a\b\u0012\u0004\u0012\u00020\f0-8@X\u0081\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00104\u001a\u0004\u0018\u0001058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u000209X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR \u0010J\u001a\b\u0012\u0004\u0012\u00020\b0KX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u000e\u0010[\u001a\u00020VX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\\\u001a\u00020]X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0016\u0010b\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010?R\u0014\u0010l\u001a\u00020mX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020qX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR+\u0010u\u001a\u00020V2\u0006\u0010t\u001a\u00020V8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bv\u0010X\"\u0004\bw\u0010ZR+\u0010z\u001a\u00020V2\u0006\u0010t\u001a\u00020V8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b}\u0010y\u001a\u0004\b{\u0010X\"\u0004\b|\u0010ZR\u0015\u0010~\u001a\u00020 X\u0080\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010?R&\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0084\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0001\u0010/\u001a\u0005\b\u0086\u0001\u0010TR1\u0010\u0088\u0001\u001a\u00020V2\u0007\u0010\u0087\u0001\u001a\u00020V8\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0089\u0001\u0010/\u001a\u0005\b\u008a\u0001\u0010X\"\u0005\b\u008b\u0001\u0010ZR/\u0010\u008c\u0001\u001a\u00020V2\u0006\u0010t\u001a\u00020V8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010y\u001a\u0005\b\u008d\u0001\u0010X\"\u0005\b\u008e\u0001\u0010ZR\u0010\u0010\u0090\u0001\u001a\u00030\u0091\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006ç\u0001"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardWidget;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allFields", "", "Lcom/stripe/android/view/StripeEditText;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "cardBrandView", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText$payments_core_release", "()Lcom/stripe/android/view/CardNumberEditText;", "cardNumberTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "com/stripe/android/view/CardInputWidget$cardValidTextWatcher$1", "Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;", "containerLayout", "Landroid/widget/FrameLayout;", "currentFields", "", "getCurrentFields$payments_core_release$annotations", "()V", "getCurrentFields$payments_core_release", "()Ljava/util/List;", "customCvcLabel", "", "cvc", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc", "()Lcom/stripe/android/cards/Cvc$Validated;", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText$payments_core_release", "()Lcom/stripe/android/view/CvcEditText;", "cvcNumberTextInputLayout", "cvcPlaceHolder", "getCvcPlaceHolder", "()Ljava/lang/String;", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText$payments_core_release", "()Lcom/stripe/android/view/ExpiryDateEditText;", "expiryDateTextInputLayout", "frameStart", "getFrameStart", "()I", "frameWidth", "getFrameWidth", "frameWidthSupplier", "Lkotlin/Function0;", "getFrameWidthSupplier$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setFrameWidthSupplier$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "hiddenCardText", "invalidFields", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields", "()Ljava/util/Set;", "isShowingFullCard", "", "isShowingFullCard$payments_core_release", "()Z", "setShowingFullCard$payments_core_release", "(Z)V", "isViewInitialized", "layoutWidthCalculator", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "getLayoutWidthCalculator$payments_core_release", "()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "setLayoutWidthCalculator$payments_core_release", "(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "peekCardText", "getPeekCardText", "placement", "Lcom/stripe/android/view/CardInputWidgetPlacement;", "getPlacement$payments_core_release", "()Lcom/stripe/android/view/CardInputWidgetPlacement;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "<set-?>", "postalCodeEnabled", "getPostalCodeEnabled", "setPostalCodeEnabled", "postalCodeEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "postalCodeRequired", "getPostalCodeRequired", "setPostalCodeRequired", "postalCodeRequired$delegate", "postalCodeTextInputLayout", "getPostalCodeTextInputLayout$payments_core_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "postalCodeValue", "getPostalCodeValue", "requiredFields", "", "getRequiredFields$payments_core_release$annotations", "getRequiredFields$payments_core_release", "value", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release$annotations", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon", "usZipCodeRequired", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired$delegate", "viewBinding", "Lcom/stripe/android/databinding/CardInputWidgetBinding;", "applyCardElementAttributes", "", "clear", "createHiddenCardText", "panLength", "createHiddenCardText$payments_core_release", "getDesiredWidthInPixels", Entry.TYPE_TEXT, "editText", "getFocusField", "Lcom/stripe/android/view/CardInputWidget$Field;", "touchX", "initView", "isEnabled", "isPostalRequired", "onFinishInflate", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onLayout", "changed", "l", "t", "r", "b", "onRestoreInstanceState", TransferTable.COLUMN_STATE, "Landroid/os/Parcelable;", "onSaveInstanceState", "scrollEnd", "scrollStart", "setCardHint", "cardHint", "setCardInputListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCardNumber", "cardNumber", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setCardValidCallback", "callback", "setCvcCode", "cvcCode", "setCvcLabel", "cvcLabel", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setEnabled", "setExpiryDate", "month", "year", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setPostalCode", "postalCode", "setPostalCode$payments_core_release", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "startSlideAnimation", "animations", "Landroid/view/animation/Animation;", "updateCvc", "updateFieldLayout", "view", "Landroid/view/View;", "newWidth", "newMarginStart", "updatePostalRequired", "updateSpaceSizes", "updateSpaceSizes$payments_core_release", "AnimationEndListener", "CardFieldAnimation", "CardNumberSlideEndAnimation", "CardNumberSlideStartAnimation", "Companion", "CvcSlideEndAnimation", "CvcSlideStartAnimation", "DefaultLayoutWidthCalculator", "ExpiryDateSlideEndAnimation", "ExpiryDateSlideStartAnimation", "Field", "LayoutWidthCalculator", "PostalCodeSlideEndAnimation", "PostalCodeSlideStartAnimation", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Context.kt\nandroidx/core/content/ContextKt\n+ 7 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,1266:1\n33#2,3:1267\n33#2,3:1270\n33#2,3:1273\n1#3:1276\n766#4:1277\n857#4,2:1278\n1855#4,2:1280\n1855#4,2:1282\n1855#4,2:1284\n1747#4,3:1286\n1855#4,2:1289\n1855#4,2:1291\n1726#4,3:1293\n1855#4,2:1309\n1855#4:1311\n1856#4:1338\n1855#4,2:1348\n329#5,4:1296\n52#6,9:1300\n52#6,9:1339\n58#7,23:1312\n93#7,3:1335\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n*L\n286#1:1267,3\n318#1:1270,3\n330#1:1273,3\n234#1:1277\n234#1:1278,2\n235#1:1280,2\n391#1:1282,2\n395#1:1284,2\n465#1:1286,3\n469#1:1289,2\n478#1:1291,2\n517#1:1293,3\n718#1:1309,2\n788#1:1311\n788#1:1338\n976#1:1348,2\n659#1:1296,4\n694#1:1300,9\n843#1:1339,9\n789#1:1312,23\n789#1:1335,3\n*E\n"})
/* loaded from: classes7.dex */
public final class CardInputWidget extends LinearLayout implements CardWidget {
    private static final String CVC_PLACEHOLDER_AMEX = "2345";
    private static final String CVC_PLACEHOLDER_COMMON = "CVC";
    private static final String FULL_SIZING_CARD_TEXT = "4242 4242 4242 4242 424";
    private static final String FULL_SIZING_DATE_TEXT = "MM/MM";
    private static final String FULL_SIZING_POSTAL_CODE_TEXT = "1234567890";
    public static final String LOGGING_TOKEN = "CardInputView";
    private static final String STATE_CARD_VIEWED = "state_card_viewed";
    private static final String STATE_POSTAL_CODE_ENABLED = "state_postal_code_enabled";
    private static final String STATE_SUPER_STATE = "state_super_state";
    private final Set<StripeEditText> allFields;
    private final /* synthetic */ CardBrandView cardBrandView;
    private CardInputListener cardInputListener;
    private final /* synthetic */ CardNumberEditText cardNumberEditText;
    private final TextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardInputWidget$cardValidTextWatcher$1 cardValidTextWatcher;
    private final FrameLayout containerLayout;
    private String customCvcLabel;
    private final /* synthetic */ CvcEditText cvcEditText;
    private final TextInputLayout cvcNumberTextInputLayout;
    private final /* synthetic */ ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryDateTextInputLayout;
    private /* synthetic */ Function0<Integer> frameWidthSupplier;
    private String hiddenCardText;
    private /* synthetic */ boolean isShowingFullCard;
    private boolean isViewInitialized;
    private /* synthetic */ LayoutWidthCalculator layoutWidthCalculator;
    private final CardInputWidgetPlacement placement;
    private final /* synthetic */ PostalCodeEditText postalCodeEditText;
    private final ReadWriteProperty postalCodeEnabled$delegate;
    private final ReadWriteProperty postalCodeRequired$delegate;
    private final TextInputLayout postalCodeTextInputLayout;
    private final /* synthetic */ Set<StripeEditText> requiredFields;
    private boolean shouldShowErrorIcon;
    private final ReadWriteProperty usZipCodeRequired$delegate;
    private final CardInputWidgetBinding viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "postalCodeEnabled", "getPostalCodeEnabled()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "postalCodeRequired", "getPostalCodeRequired()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DEFAULT_READER_ID = C18606R.C18608id.stripe_default_reader_id;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CardInputWidget$1 */
    /* loaded from: classes7.dex */
    public static final class C195041 extends Lambda implements Function0<Integer> {
        public C195041() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(CardInputWidget.this.containerLayout.getWidth());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$AnimationEndListener;", "Landroid/view/animation/Animation$AnimationListener;", "()V", "onAnimationRepeat", "", "animation", "Landroid/view/animation/Animation;", "onAnimationStart", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class AnimationEndListener implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "Landroid/view/animation/Animation;", "()V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class CardFieldAnimation extends Animation {
        @Deprecated
        private static final long ANIMATION_LENGTH = 150;
        private static final Companion Companion = new Companion(null);

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;", "", "()V", "ANIMATION_LENGTH", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public CardFieldAnimation() {
            setDuration(ANIMATION_LENGTH);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "hiddenCardWidth", "", "focusOnEndView", "(Landroid/view/View;ILandroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation\n*L\n1142#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class CardNumberSlideEndAnimation extends CardFieldAnimation {
        private final View focusOnEndView;
        private final int hiddenCardWidth;
        private final View view;

        public CardNumberSlideEndAnimation(View view, int i, View focusOnEndView) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(focusOnEndView, "focusOnEndView");
            this.view = view;
            this.hiddenCardWidth = i;
            this.focusOnEndView = focusOnEndView;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideEndAnimation.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    CardNumberSlideEndAnimation.this.focusOnEndView.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(f, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) (this.hiddenCardWidth * (-1.0f) * f));
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation\n*L\n1068#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class CardNumberSlideStartAnimation extends CardFieldAnimation {
        private final View view;

        public CardNumberSlideStartAnimation(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideStartAnimation.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    CardNumberSlideStartAnimation.this.view.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(f, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) (layoutParams2.getMarginStart() * (1 - f)));
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$Companion;", "", "()V", "CVC_PLACEHOLDER_AMEX", "", "CVC_PLACEHOLDER_COMMON", "DEFAULT_READER_ID", "", "FULL_SIZING_CARD_TEXT", "FULL_SIZING_DATE_TEXT", "FULL_SIZING_POSTAL_CODE_TEXT", "LOGGING_TOKEN", "STATE_CARD_VIEWED", "STATE_POSTAL_CODE_ENABLED", "STATE_SUPER_STATE", "shouldIconShowBrand", "", AccountRangeJsonParser.FIELD_BRAND, "Lcom/stripe/android/model/CardBrand;", "cvcHasFocus", "cvcText", "shouldIconShowBrand$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldIconShowBrand$payments_core_release(CardBrand brand, boolean z, String str) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            if (z && !brand.isMaxCvc(str)) {
                return false;
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation\n*L\n1170#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class CvcSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public CvcSlideEndAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(f, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * f) + ((1 - f) * this.startMargin)));
                layoutParams2.setMarginEnd(0);
                layoutParams2.width = this.newWidth;
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation\n*L\n1096#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class CvcSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public CvcSlideStartAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(f, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * f) + ((1 - f) * this.startPosition)));
                layoutParams2.setMarginEnd(0);
                layoutParams2.width = this.newWidth;
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "()V", "calculate", "", Entry.TYPE_TEXT, "", "paint", "Landroid/text/TextPaint;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultLayoutWidthCalculator implements LayoutWidthCalculator {
        @Override // com.stripe.android.view.CardInputWidget.LayoutWidthCalculator
        public int calculate(String text, TextPaint paint) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            return (int) Layout.getDesiredWidth(text, paint);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation\n*L\n1155#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class ExpiryDateSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startMargin;
        private final View view;

        public ExpiryDateSlideEndAnimation(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(f, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * f) + ((1 - f) * this.startMargin)));
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation\n*L\n1081#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class ExpiryDateSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startPosition;
        private final View view;

        public ExpiryDateSlideStartAnimation(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(f, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * f) + ((1 - f) * this.startPosition)));
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$Field;", "", "(Ljava/lang/String;I)V", "Number", "Expiry", "Cvc", "PostalCode", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Field {
        Number,
        Expiry,
        Cvc,
        PostalCode
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "", "calculate", "", Entry.TYPE_TEXT, "", "paint", "Landroid/text/TextPaint;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface LayoutWidthCalculator {
        int calculate(String str, TextPaint textPaint);
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation\n*L\n1187#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class PostalCodeSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public PostalCodeSlideEndAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(f, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * f) + ((1 - f) * this.startMargin)));
                layoutParams2.setMarginEnd(0);
                layoutParams2.width = this.newWidth;
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1266:1\n329#2,4:1267\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation\n*L\n1113#1:1267,4\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class PostalCodeSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public PostalCodeSlideStartAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * f) + ((1 - f) * this.startPosition)));
                layoutParams2.setMarginEnd(0);
                layoutParams2.width = this.newWidth;
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Field.values().length];
            try {
                iArr[Field.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Field.Expiry.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Field.Cvc.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Field.PostalCode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardInputWidget(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyCardElementAttributes(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int[] CardElement = C18606R.styleable.CardElement;
        Intrinsics.checkNotNullExpressionValue(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setPostalCodeEnabled(obtainStyledAttributes.getBoolean(C18606R.styleable.CardElement_shouldShowPostalCode, getPostalCodeEnabled()));
        setPostalCodeRequired(obtainStyledAttributes.getBoolean(C18606R.styleable.CardElement_shouldRequirePostalCode, getPostalCodeRequired()));
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(C18606R.styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        String postalCodeValue = getPostalCodeValue();
        if (postalCodeValue != null) {
            return new PaymentMethod.BillingDetails(new Address(null, null, null, null, postalCodeValue, null, 47, null), null, null, null, 14, null);
        }
        return null;
    }

    public static /* synthetic */ void getCurrentFields$payments_core_release$annotations() {
    }

    private final Cvc.Validated getCvc() {
        return this.cvcEditText.getCvc$payments_core_release();
    }

    private final String getCvcPlaceHolder() {
        return CardBrand.AmericanExpress == getBrand() ? CVC_PLACEHOLDER_AMEX : CVC_PLACEHOLDER_COMMON;
    }

    private final int getDesiredWidthInPixels(String str, StripeEditText stripeEditText) {
        LayoutWidthCalculator layoutWidthCalculator = this.layoutWidthCalculator;
        TextPaint paint = stripeEditText.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "editText.paint");
        return layoutWidthCalculator.calculate(str, paint);
    }

    private final Field getFocusField(int i, int i2) {
        return this.placement.getFocusField$payments_core_release(i, i2, this.isShowingFullCard, getPostalCodeEnabled());
    }

    private final int getFrameStart() {
        boolean z;
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.containerLayout.getLeft();
        }
        return this.containerLayout.getRight();
    }

    private final int getFrameWidth() {
        return this.frameWidthSupplier.invoke().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
        if (r2 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set<CardValidCallback.Fields> getInvalidFields() {
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
        if (this.cardNumberEditText.getValidatedCardNumber$payments_core_release() == null) {
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
        if (this.expiryDateEditText.getValidatedDate() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            fields3 = null;
        }
        fieldsArr[1] = fields3;
        CardValidCallback.Fields fields4 = CardValidCallback.Fields.Cvc;
        if (getCvc() == null) {
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

    private final String getPeekCardText() {
        int i;
        String repeat;
        int panLength$payments_core_release = this.cardNumberEditText.getPanLength$payments_core_release();
        if (panLength$payments_core_release != 14) {
            if (panLength$payments_core_release != 15) {
                if (panLength$payments_core_release != 19) {
                    i = 4;
                } else {
                    i = 3;
                }
            } else {
                i = 5;
            }
        } else {
            i = 2;
        }
        repeat = StringsKt__StringsJVMKt.repeat("0", i);
        return repeat;
    }

    private final String getPostalCodeValue() {
        if (getPostalCodeEnabled()) {
            return this.postalCodeEditText.getPostalCode$payments_core_release();
        }
        return null;
    }

    public static /* synthetic */ void getRequiredFields$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    private final void initView(AttributeSet attributeSet) {
        applyCardElementAttributes(attributeSet);
        C38790bq6.m62452v0(this.cardNumberEditText, new C5148M1() { // from class: com.stripe.android.view.CardInputWidget$initView$1
            @Override // p000.C5148M1
            public void onInitializeAccessibilityNodeInfo(View host, C27125p2 info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.m20054s0(null);
            }
        });
        this.isShowingFullCard = true;
        int defaultErrorColorInt = this.cardNumberEditText.getDefaultErrorColorInt();
        this.cardBrandView.setTintColorInt$payments_core_release(this.cardNumberEditText.getHintTextColors().getDefaultColor());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int[] CardInputView = C18606R.styleable.CardInputView;
        Intrinsics.checkNotNullExpressionValue(CardInputView, "CardInputView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardInputView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        CardBrandView cardBrandView = this.cardBrandView;
        cardBrandView.setTintColorInt$payments_core_release(obtainStyledAttributes.getColor(C18606R.styleable.CardInputView_cardTint, cardBrandView.getTintColorInt$payments_core_release()));
        int color = obtainStyledAttributes.getColor(C18606R.styleable.CardInputView_cardTextErrorColor, defaultErrorColorInt);
        String string = obtainStyledAttributes.getString(C18606R.styleable.CardInputView_cardHintText);
        boolean z = obtainStyledAttributes.getBoolean(C18606R.styleable.CardInputView_android_focusedByDefault, true);
        obtainStyledAttributes.recycle();
        if (string != null) {
            this.cardNumberEditText.setHint(string);
        }
        for (StripeEditText stripeEditText : getCurrentFields$payments_core_release()) {
            stripeEditText.setErrorColor(color);
        }
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: If0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$26(CardInputWidget.this, view, z2);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Jf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$27(CardInputWidget.this, view, z2);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Kf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$28(CardInputWidget.this, view, z2);
            }
        });
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: Lf0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$29(CardInputWidget.this, view, z2);
            }
        });
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$initView$9
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
                r2 = r1.this$0.cardInputListener;
             */
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onTextChanged(String text) {
                CardInputListener cardInputListener;
                Intrinsics.checkNotNullParameter(text, "text");
                if (CardInputWidget.this.getBrand().isMaxCvc(text) && cardInputListener != null) {
                    cardInputListener.onCvcComplete();
                }
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$initView$10
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
                r2 = r1.this$0.cardInputListener;
             */
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onTextChanged(String it) {
                CardInputListener cardInputListener;
                Intrinsics.checkNotNullParameter(it, "it");
                if (CardInputWidget.this.getPostalCodeEditText$payments_core_release().isEnabled() && CardInputWidget.this.getPostalCodeEditText$payments_core_release().hasValidPostal$payments_core_release() && cardInputListener != null) {
                    cardInputListener.onPostalCodeComplete();
                }
            }
        });
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$11(this));
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new CardInputWidget$initView$12(this));
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$13(this));
        this.cvcEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$14(this));
        for (StripeEditText stripeEditText2 : this.allFields) {
            stripeEditText2.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardInputWidget$initView$lambda$31$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    CardInputWidget.this.setShouldShowErrorIcon(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
        }
        if (z) {
            this.cardNumberEditText.requestFocus();
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new CardInputWidget$initView$16(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$26(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.scrollStart();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$27(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$28(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$29(CardInputWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cardBrandView.setShouldShowCvc(z);
        if (z) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
            }
        }
    }

    private final boolean isPostalRequired() {
        return (getPostalCodeRequired() || getUsZipCodeRequired()) && getPostalCodeEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollEnd() {
        PostalCodeSlideEndAnimation postalCodeSlideEndAnimation;
        List<? extends Animation> listOfNotNull;
        if (this.isShowingFullCard && this.isViewInitialized) {
            int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(true);
            updateSpaceSizes$payments_core_release$default(this, false, 0, 0, 6, null);
            CardNumberSlideEndAnimation cardNumberSlideEndAnimation = new CardNumberSlideEndAnimation(this.cardNumberTextInputLayout, this.placement.getHiddenCardWidth$payments_core_release(), this.expiryDateEditText);
            int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(false);
            ExpiryDateSlideEndAnimation expiryDateSlideEndAnimation = new ExpiryDateSlideEndAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
            int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
            int i = (dateStartMargin$payments_core_release - dateStartMargin$payments_core_release2) + cvcStartMargin$payments_core_release;
            CvcSlideEndAnimation cvcSlideEndAnimation = new CvcSlideEndAnimation(this.cvcNumberTextInputLayout, i, cvcStartMargin$payments_core_release, this.placement.getCvcWidth$payments_core_release());
            int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
            int i2 = (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release;
            if (getPostalCodeEnabled()) {
                postalCodeSlideEndAnimation = new PostalCodeSlideEndAnimation(this.postalCodeTextInputLayout, i2, postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth$payments_core_release());
            } else {
                postalCodeSlideEndAnimation = null;
            }
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new CardFieldAnimation[]{cardNumberSlideEndAnimation, expiryDateSlideEndAnimation, cvcSlideEndAnimation, postalCodeSlideEndAnimation});
            startSlideAnimation(listOfNotNull);
            this.isShowingFullCard = false;
        }
    }

    private final void scrollStart() {
        PostalCodeSlideStartAnimation postalCodeSlideStartAnimation;
        List<? extends Animation> listOfNotNull;
        if (!this.isShowingFullCard && this.isViewInitialized) {
            int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
            int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
            int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
            updateSpaceSizes$payments_core_release$default(this, true, 0, 0, 6, null);
            CardNumberSlideStartAnimation cardNumberSlideStartAnimation = new CardNumberSlideStartAnimation(this.cardNumberTextInputLayout);
            int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(true);
            ExpiryDateSlideStartAnimation expiryDateSlideStartAnimation = new ExpiryDateSlideStartAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
            int i = (dateStartMargin$payments_core_release2 - dateStartMargin$payments_core_release) + cvcStartMargin$payments_core_release;
            CvcSlideStartAnimation cvcSlideStartAnimation = new CvcSlideStartAnimation(this.cvcNumberTextInputLayout, cvcStartMargin$payments_core_release, i, this.placement.getCvcWidth$payments_core_release());
            int i2 = (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release;
            if (getPostalCodeEnabled()) {
                postalCodeSlideStartAnimation = new PostalCodeSlideStartAnimation(this.postalCodeTextInputLayout, postalCodeStartMargin$payments_core_release, i2, this.placement.getPostalCodeWidth$payments_core_release());
            } else {
                postalCodeSlideStartAnimation = null;
            }
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new CardFieldAnimation[]{cardNumberSlideStartAnimation, expiryDateSlideStartAnimation, cvcSlideStartAnimation, postalCodeSlideStartAnimation});
            startSlideAnimation(listOfNotNull);
            this.isShowingFullCard = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShouldShowErrorIcon(boolean z) {
        this.cardBrandView.setShouldShowErrorIcon(z);
        this.shouldShowErrorIcon = z;
    }

    private final void startSlideAnimation(List<? extends Animation> list) {
        AnimationSet animationSet = new AnimationSet(true);
        for (Animation animation : list) {
            animationSet.addAnimation(animation);
        }
        this.containerLayout.startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCvc() {
        CvcEditText.updateBrand$payments_core_release$default(this.cvcEditText, this.cardBrandView.getBrand(), this.customCvcLabel, null, null, 12, null);
    }

    private final void updateFieldLayout(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = i;
            layoutParams2.setMarginStart(i2);
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePostalRequired() {
        if (isPostalRequired()) {
            this.requiredFields.add(this.postalCodeEditText);
        } else {
            this.requiredFields.remove(this.postalCodeEditText);
        }
    }

    public static /* synthetic */ void updateSpaceSizes$payments_core_release$default(CardInputWidget cardInputWidget, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = cardInputWidget.getFrameWidth();
        }
        if ((i3 & 4) != 0) {
            i2 = cardInputWidget.getFrameStart();
        }
        cardInputWidget.updateSpaceSizes$payments_core_release(z, i, i2);
    }

    @Override // com.stripe.android.view.CardWidget
    public void clear() {
        List currentFields$payments_core_release = getCurrentFields$payments_core_release();
        boolean z = false;
        if (!(currentFields$payments_core_release instanceof Collection) || !currentFields$payments_core_release.isEmpty()) {
            Iterator it = currentFields$payments_core_release.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StripeEditText) it.next()).hasFocus()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z || hasFocus()) {
            this.cardNumberEditText.requestFocus();
        }
        for (StripeEditText stripeEditText : getCurrentFields$payments_core_release()) {
            stripeEditText.setText("");
        }
    }

    public final String createHiddenCardText$payments_core_release(int i) {
        String repeat;
        int lastIndexOf$default;
        String take;
        repeat = StringsKt__StringsJVMKt.repeat("0", i);
        String formatted = new CardNumber.Unvalidated(repeat).getFormatted(i);
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) formatted, ' ', 0, false, 6, (Object) null);
        take = StringsKt___StringsKt.take(formatted, lastIndexOf$default + 1);
        return take;
    }

    public final CardBrand getBrand() {
        return this.cardNumberEditText.getCardBrand();
    }

    public final CardBrandView getCardBrandView$payments_core_release() {
        return this.cardBrandView;
    }

    public final CardNumberEditText getCardNumberEditText$payments_core_release() {
        return this.cardNumberEditText;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    @Override // com.stripe.android.view.CardWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardParams getCardParams() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean isBlank;
        Set of;
        boolean isBlank2;
        CardNumber.Validated validatedCardNumber$payments_core_release = this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
        ExpirationDate.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        Cvc.Validated cvc = getCvc();
        CardNumberEditText cardNumberEditText = this.cardNumberEditText;
        boolean z6 = true;
        if (validatedCardNumber$payments_core_release == null) {
            z = true;
        } else {
            z = false;
        }
        cardNumberEditText.setShouldShowError(z);
        ExpiryDateEditText expiryDateEditText = this.expiryDateEditText;
        if (validatedDate == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        expiryDateEditText.setShouldShowError(z2);
        CvcEditText cvcEditText = this.cvcEditText;
        if (cvc == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        cvcEditText.setShouldShowError(z3);
        PostalCodeEditText postalCodeEditText = this.postalCodeEditText;
        if (getPostalCodeRequired() || getUsZipCodeRequired()) {
            String postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release();
            if (postalCode$payments_core_release != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(postalCode$payments_core_release);
                if (!isBlank) {
                    z4 = false;
                    if (z4) {
                        z5 = true;
                        postalCodeEditText.setShouldShowError(z5);
                        ArrayList<StripeEditText> arrayList = new ArrayList();
                        for (Object obj : getCurrentFields$payments_core_release()) {
                            if (((StripeEditText) obj).getShouldShowError()) {
                                arrayList.add(obj);
                            }
                        }
                        for (StripeEditText stripeEditText : arrayList) {
                            String errorMessage$payments_core_release = stripeEditText.getErrorMessage$payments_core_release();
                            if (errorMessage$payments_core_release != null) {
                                stripeEditText.announceForAccessibility(errorMessage$payments_core_release);
                            }
                        }
                        String str = null;
                        if (validatedCardNumber$payments_core_release != null) {
                            this.cardNumberEditText.requestFocus();
                        } else if (validatedDate == null) {
                            this.expiryDateEditText.requestFocus();
                        } else if (cvc == null) {
                            this.cvcEditText.requestFocus();
                        } else if (this.postalCodeEditText.getShouldShowError()) {
                            this.postalCodeEditText.requestFocus();
                        } else {
                            setShouldShowErrorIcon(false);
                            CardBrand brand = getBrand();
                            of = SetsKt__SetsJVMKt.setOf(LOGGING_TOKEN);
                            String value = validatedCardNumber$payments_core_release.getValue();
                            int month = validatedDate.getMonth();
                            int year = validatedDate.getYear();
                            String value$payments_core_release = cvc.getValue$payments_core_release();
                            Address.Builder builder = new Address.Builder();
                            String postalCodeValue = getPostalCodeValue();
                            if (postalCodeValue != null) {
                                isBlank2 = StringsKt__StringsJVMKt.isBlank(postalCodeValue);
                                if (!isBlank2) {
                                    z6 = false;
                                }
                            }
                            if (!z6) {
                                str = postalCodeValue;
                            }
                            return new CardParams(brand, of, value, month, year, value$payments_core_release, null, builder.setPostalCode(str).build(), null, null, 832, null);
                        }
                        setShouldShowErrorIcon(true);
                        return null;
                    }
                }
            }
            z4 = true;
            if (z4) {
            }
        }
        z5 = false;
        postalCodeEditText.setShouldShowError(z5);
        ArrayList<StripeEditText> arrayList2 = new ArrayList();
        while (r4.hasNext()) {
        }
        while (r4.hasNext()) {
        }
        String str2 = null;
        if (validatedCardNumber$payments_core_release != null) {
        }
        setShouldShowErrorIcon(true);
        return null;
    }

    public final /* synthetic */ List getCurrentFields$payments_core_release() {
        Set plus;
        List filterNotNull;
        Set<StripeEditText> set = this.requiredFields;
        PostalCodeEditText postalCodeEditText = this.postalCodeEditText;
        if (!getPostalCodeEnabled()) {
            postalCodeEditText = null;
        }
        plus = SetsKt___SetsKt.plus(set, postalCodeEditText);
        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(plus);
        return filterNotNull;
    }

    public final CvcEditText getCvcEditText$payments_core_release() {
        return this.cvcEditText;
    }

    public final ExpiryDateEditText getExpiryDateEditText$payments_core_release() {
        return this.expiryDateEditText;
    }

    public final Function0<Integer> getFrameWidthSupplier$payments_core_release() {
        return this.frameWidthSupplier;
    }

    public final LayoutWidthCalculator getLayoutWidthCalculator$payments_core_release() {
        return this.layoutWidthCalculator;
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
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, paymentMethodCard, getBillingDetails(), (Map) null, 4, (Object) null);
        }
        return null;
    }

    public final CardInputWidgetPlacement getPlacement$payments_core_release() {
        return this.placement;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.postalCodeEditText;
    }

    public final boolean getPostalCodeEnabled() {
        return ((Boolean) this.postalCodeEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getPostalCodeRequired() {
        return ((Boolean) this.postalCodeRequired$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final TextInputLayout getPostalCodeTextInputLayout$payments_core_release() {
        return this.postalCodeTextInputLayout;
    }

    public final Set<StripeEditText> getRequiredFields$payments_core_release() {
        return this.requiredFields;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.shouldShowErrorIcon;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        Set<StripeEditText> set = this.requiredFields;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (StripeEditText stripeEditText : set) {
            if (!stripeEditText.isEnabled()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isShowingFullCard$payments_core_release() {
        return this.isShowingFullCard;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        View view;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() != 0) {
            return super.onInterceptTouchEvent(ev);
        }
        Field focusField = getFocusField((int) ev.getX(), getFrameStart());
        if (focusField != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[focusField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            view = this.postalCodeEditText;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        view = this.cvcEditText;
                    }
                } else {
                    view = this.expiryDateEditText;
                }
            } else {
                view = this.cardNumberEditText;
            }
            view.requestFocus();
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int hiddenCardWidth$payments_core_release;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.isViewInitialized && getWidth() != 0) {
            this.isViewInitialized = true;
            this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
            updateSpaceSizes$payments_core_release$default(this, this.isShowingFullCard, 0, 0, 6, null);
            TextInputLayout textInputLayout = this.cardNumberTextInputLayout;
            int cardWidth$payments_core_release = this.placement.getCardWidth$payments_core_release();
            if (this.isShowingFullCard) {
                hiddenCardWidth$payments_core_release = 0;
            } else {
                hiddenCardWidth$payments_core_release = this.placement.getHiddenCardWidth$payments_core_release() * (-1);
            }
            updateFieldLayout(textInputLayout, cardWidth$payments_core_release, hiddenCardWidth$payments_core_release);
            updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth$payments_core_release(), this.placement.getDateStartMargin$payments_core_release(this.isShowingFullCard));
            updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth$payments_core_release(), this.placement.getCvcStartMargin$payments_core_release(this.isShowingFullCard));
            updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth$payments_core_release(), this.placement.getPostalCodeStartMargin$payments_core_release(this.isShowingFullCard));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        int cvcStartMargin$payments_core_release;
        int totalLengthInPixels$payments_core_release;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setPostalCodeEnabled(bundle.getBoolean(STATE_POSTAL_CODE_ENABLED, true));
            boolean z = bundle.getBoolean(STATE_CARD_VIEWED, true);
            this.isShowingFullCard = z;
            updateSpaceSizes$payments_core_release$default(this, z, 0, 0, 6, null);
            this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
            int i3 = 0;
            if (this.isShowingFullCard) {
                i = this.placement.getDateStartMargin$payments_core_release(true);
                cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(true);
                i2 = this.placement.getPostalCodeStartMargin$payments_core_release(true);
            } else {
                int hiddenCardWidth$payments_core_release = this.placement.getHiddenCardWidth$payments_core_release() * (-1);
                int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
                cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
                if (getPostalCodeEnabled()) {
                    totalLengthInPixels$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
                } else {
                    totalLengthInPixels$payments_core_release = this.placement.getTotalLengthInPixels$payments_core_release();
                }
                int i4 = totalLengthInPixels$payments_core_release;
                i3 = hiddenCardWidth$payments_core_release;
                i = dateStartMargin$payments_core_release;
                i2 = i4;
            }
            updateFieldLayout(this.cardNumberTextInputLayout, this.placement.getCardWidth$payments_core_release(), i3);
            updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth$payments_core_release(), i);
            updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth$payments_core_release(), cvcStartMargin$payments_core_release);
            updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth$payments_core_release(), i2);
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER_STATE));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return C39564d70.m44603a(TuplesKt.m28425to(STATE_SUPER_STATE, super.onSaveInstanceState()), TuplesKt.m28425to(STATE_CARD_VIEWED, Boolean.valueOf(this.isShowingFullCard)), TuplesKt.m28425to(STATE_POSTAL_CODE_ENABLED, Boolean.valueOf(getPostalCodeEnabled())));
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardHint(String cardHint) {
        Intrinsics.checkNotNullParameter(cardHint, "cardHint");
        this.cardNumberEditText.setHint(cardHint);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardInputListener(CardInputListener cardInputListener) {
        this.cardInputListener = cardInputListener;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumber(String str) {
        this.cardNumberEditText.setText(str);
        this.isShowingFullCard = !this.cardNumberEditText.isCardNumberValid();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.cardNumberEditText.addTextChangedListener(textWatcher);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardValidCallback(CardValidCallback cardValidCallback) {
        this.cardValidCallback = cardValidCallback;
        for (StripeEditText stripeEditText : this.requiredFields) {
            stripeEditText.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback != null) {
            for (StripeEditText stripeEditText2 : this.requiredFields) {
                stripeEditText2.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback2 = this.cardValidCallback;
        if (cardValidCallback2 != null) {
            cardValidCallback2.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcCode(String str) {
        this.cvcEditText.setText(str);
    }

    public final void setCvcLabel(String str) {
        this.customCvcLabel = str;
        updateCvc();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.cvcEditText.addTextChangedListener(textWatcher);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        for (StripeEditText stripeEditText : getCurrentFields$payments_core_release()) {
            stripeEditText.setEnabled(z);
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDate(int i, int i2) {
        this.expiryDateEditText.setText(new ExpirationDate.Unvalidated(i, i2).getDisplayString());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.expiryDateEditText.addTextChangedListener(textWatcher);
    }

    public final void setFrameWidthSupplier$payments_core_release(Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.frameWidthSupplier = function0;
    }

    public final void setLayoutWidthCalculator$payments_core_release(LayoutWidthCalculator layoutWidthCalculator) {
        Intrinsics.checkNotNullParameter(layoutWidthCalculator, "<set-?>");
        this.layoutWidthCalculator = layoutWidthCalculator;
    }

    public final /* synthetic */ void setPostalCode$payments_core_release(String str) {
        this.postalCodeEditText.setText(str);
    }

    public final void setPostalCodeEnabled(boolean z) {
        this.postalCodeEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setPostalCodeRequired(boolean z) {
        this.postalCodeRequired$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.stripe.android.view.CardWidget
    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.postalCodeEditText.addTextChangedListener(textWatcher);
    }

    public final void setShowingFullCard$payments_core_release(boolean z) {
        this.isShowingFullCard = z;
    }

    public final void setUsZipCodeRequired(boolean z) {
        this.usZipCodeRequired$delegate.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void updateSpaceSizes$payments_core_release(boolean z, int i, int i2) {
        if (i == 0) {
            return;
        }
        this.placement.setCardWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_CARD_TEXT, this.cardNumberEditText));
        this.placement.setDateWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_DATE_TEXT, this.expiryDateEditText));
        this.placement.setHiddenCardWidth$payments_core_release(getDesiredWidthInPixels(this.hiddenCardText, this.cardNumberEditText));
        this.placement.setCvcWidth$payments_core_release(getDesiredWidthInPixels(getCvcPlaceHolder(), this.cvcEditText));
        this.placement.setPostalCodeWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_POSTAL_CODE_TEXT, this.postalCodeEditText));
        this.placement.setPeekCardWidth$payments_core_release(getDesiredWidthInPixels(getPeekCardText(), this.cardNumberEditText));
        this.placement.updateSpacing$payments_core_release(z, getPostalCodeEnabled(), i2, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardInputWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardInputWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1] */
    @JvmOverloads
    public CardInputWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Set<StripeEditText> mutableSetOf;
        Set<StripeEditText> plus;
        Intrinsics.checkNotNullParameter(context, "context");
        CardInputWidgetBinding inflate = CardInputWidgetBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        FrameLayout frameLayout = inflate.container;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "viewBinding.container");
        this.containerLayout = frameLayout;
        CardBrandView cardBrandView = inflate.cardBrandView;
        Intrinsics.checkNotNullExpressionValue(cardBrandView, "viewBinding.cardBrandView");
        this.cardBrandView = cardBrandView;
        TextInputLayout textInputLayout = inflate.cardNumberTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewBinding.cardNumberTextInputLayout");
        this.cardNumberTextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = inflate.expiryDateTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "viewBinding.expiryDateTextInputLayout");
        this.expiryDateTextInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = inflate.cvcTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "viewBinding.cvcTextInputLayout");
        this.cvcNumberTextInputLayout = textInputLayout3;
        TextInputLayout textInputLayout4 = inflate.postalCodeTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "viewBinding.postalCodeTextInputLayout");
        this.postalCodeTextInputLayout = textInputLayout4;
        CardNumberEditText cardNumberEditText = inflate.cardNumberEditText;
        Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "viewBinding.cardNumberEditText");
        this.cardNumberEditText = cardNumberEditText;
        ExpiryDateEditText expiryDateEditText = inflate.expiryDateEditText;
        Intrinsics.checkNotNullExpressionValue(expiryDateEditText, "viewBinding.expiryDateEditText");
        this.expiryDateEditText = expiryDateEditText;
        CvcEditText cvcEditText = inflate.cvcEditText;
        Intrinsics.checkNotNullExpressionValue(cvcEditText, "viewBinding.cvcEditText");
        this.cvcEditText = cvcEditText;
        PostalCodeEditText postalCodeEditText = inflate.postalCodeEditText;
        Intrinsics.checkNotNullExpressionValue(postalCodeEditText, "viewBinding.postalCodeEditText");
        this.postalCodeEditText = postalCodeEditText;
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                CardValidCallback cardValidCallback;
                Set invalidFields;
                Set<? extends CardValidCallback.Fields> invalidFields2;
                super.afterTextChanged(editable);
                cardValidCallback = CardInputWidget.this.cardValidCallback;
                if (cardValidCallback != null) {
                    invalidFields = CardInputWidget.this.getInvalidFields();
                    boolean isEmpty = invalidFields.isEmpty();
                    invalidFields2 = CardInputWidget.this.getInvalidFields();
                    cardValidCallback.onInputChanged(isEmpty, invalidFields2);
                }
            }
        };
        this.isShowingFullCard = true;
        this.layoutWidthCalculator = new DefaultLayoutWidthCalculator();
        this.placement = new CardInputWidgetPlacement(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.TRUE;
        this.postalCodeEnabled$delegate = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool2, Boolean bool3) {
                CardInputWidget$cardValidTextWatcher$1 cardInputWidget$cardValidTextWatcher$1;
                CardInputWidget$cardValidTextWatcher$1 cardInputWidget$cardValidTextWatcher$12;
                CardInputWidget$cardValidTextWatcher$1 cardInputWidget$cardValidTextWatcher$13;
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                if (booleanValue) {
                    this.getPostalCodeEditText$payments_core_release().setEnabled(true);
                    this.getPostalCodeTextInputLayout$payments_core_release().setVisibility(0);
                    this.getCvcEditText$payments_core_release().setImeOptions(5);
                    PostalCodeEditText postalCodeEditText$payments_core_release = this.getPostalCodeEditText$payments_core_release();
                    cardInputWidget$cardValidTextWatcher$12 = this.cardValidTextWatcher;
                    postalCodeEditText$payments_core_release.removeTextChangedListener(cardInputWidget$cardValidTextWatcher$12);
                    PostalCodeEditText postalCodeEditText$payments_core_release2 = this.getPostalCodeEditText$payments_core_release();
                    cardInputWidget$cardValidTextWatcher$13 = this.cardValidTextWatcher;
                    postalCodeEditText$payments_core_release2.addTextChangedListener(cardInputWidget$cardValidTextWatcher$13);
                } else {
                    this.getPostalCodeEditText$payments_core_release().setEnabled(false);
                    this.getPostalCodeTextInputLayout$payments_core_release().setVisibility(8);
                    this.getCvcEditText$payments_core_release().setImeOptions(6);
                    PostalCodeEditText postalCodeEditText$payments_core_release3 = this.getPostalCodeEditText$payments_core_release();
                    cardInputWidget$cardValidTextWatcher$1 = this.cardValidTextWatcher;
                    postalCodeEditText$payments_core_release3.removeTextChangedListener(cardInputWidget$cardValidTextWatcher$1);
                }
                this.updatePostalRequired();
            }
        };
        final Boolean bool2 = Boolean.FALSE;
        this.postalCodeRequired$delegate = new ObservableProperty<Boolean>(bool2) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool3, Boolean bool4) {
                Intrinsics.checkNotNullParameter(property, "property");
                bool4.booleanValue();
                bool3.booleanValue();
                this.updatePostalRequired();
            }
        };
        this.usZipCodeRequired$delegate = new ObservableProperty<Boolean>(bool2) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool3, Boolean bool4) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = bool4.booleanValue();
                bool3.booleanValue();
                if (booleanValue) {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.US);
                } else {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.Global);
                }
                this.updatePostalRequired();
            }
        };
        if (getId() == -1) {
            setId(DEFAULT_READER_ID);
        }
        setOrientation(0);
        setMinimumWidth(getResources().getDimensionPixelSize(C18606R.dimen.stripe_card_widget_min_width));
        this.frameWidthSupplier = new C195041();
        mutableSetOf = SetsKt__SetsKt.mutableSetOf(cardNumberEditText, cvcEditText, expiryDateEditText);
        this.requiredFields = mutableSetOf;
        plus = SetsKt___SetsKt.plus(mutableSetOf, postalCodeEditText);
        this.allFields = plus;
        initView(attributeSet);
        this.hiddenCardText = createHiddenCardText$payments_core_release(cardNumberEditText.getPanLength$payments_core_release());
    }
}
