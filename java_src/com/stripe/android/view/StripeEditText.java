package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputEditText;
import com.stripe.android.C18606R;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0007*\u00016\b\u0017\u0018\u00002\u00020\u0001:\u0005defghB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010<H\u0016J\b\u0010@\u001a\u00020>H\u0002J\n\u0010A\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010B\u001a\n C*\u0004\u0018\u00010&0&H\u0007J\u0010\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020\u0007H\u0002J\b\u0010F\u001a\u00020>H\u0002J\b\u0010G\u001a\u00020>H\u0002J\u0012\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020>2\u0006\u0010M\u001a\u00020NH\u0016J\u0012\u0010O\u001a\u00020>2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010R\u001a\u00020QH\u0016J\u0012\u0010S\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010T\u001a\u00020>2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010U\u001a\u00020>2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010V\u001a\u00020>2\b\b\u0001\u0010W\u001a\u00020\u0007J\u0010\u0010X\u001a\u00020>2\b\u0010\u001c\u001a\u0004\u0018\u00010\nJ\u0010\u0010Y\u001a\u00020>2\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010Z\u001a\u00020>H\u0007J\u0010\u0010[\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010&J\u0012\u0010]\u001a\u00020>2\b\u0010^\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010]\u001a\u00020>2\u0006\u0010_\u001a\u00020\u0007H\u0016J\u0017\u0010`\u001a\u00020>2\b\u0010a\u001a\u0004\u0018\u00010bH\u0000¢\u0006\u0002\bcR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020&0*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R$\u0010-\u001a\u00020.8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0004\n\u0002\u00107R$\u00108\u001a\u00020.2\u0006\u00108\u001a\u00020.@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\u0016\u0010;\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006i"}, m28432d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "afterTextChangedListener", "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "<set-?>", "Landroid/content/res/ColorStateList;", "defaultColorStateList", "getDefaultColorStateList$payments_core_release", "()Landroid/content/res/ColorStateList;", "setDefaultColorStateList$payments_core_release", "(Landroid/content/res/ColorStateList;)V", "defaultErrorColor", "defaultErrorColorInt", "getDefaultErrorColorInt", "()I", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "errorMessage", "getErrorMessage$payments_core_release", "setErrorMessage$payments_core_release", "(Ljava/lang/String;)V", "errorMessageListener", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "externalColorStateList", "externalErrorColor", "Ljava/lang/Integer;", "externalFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "fieldText", "getFieldText$payments_core_release", "internalFocusChangeListeners", "", "getInternalFocusChangeListeners", "()Ljava/util/List;", "isLastKeyDelete", "", "isLastKeyDelete$payments_core_release$annotations", "()V", "isLastKeyDelete$payments_core_release", "()Z", "setLastKeyDelete$payments_core_release", "(Z)V", "isLastKeyDeleteTextWatcher", "com/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1", "Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;", "shouldShowError", "getShouldShowError", "setShouldShowError", "textWatchers", "Landroid/text/TextWatcher;", "addTextChangedListener", "", "watcher", "determineDefaultErrorColor", "getOnFocusChangeListener", "getParentOnFocusChangeListener", "kotlin.jvm.PlatformType", "isDeleteKey", "keyCode", "listenForDeleteEmpty", "listenForTextChanges", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "onRestoreInstanceState", TransferTable.COLUMN_STATE, "Landroid/os/Parcelable;", "onSaveInstanceState", "removeTextChangedListener", "setAfterTextChangedListener", "setDeleteEmptyListener", "setErrorColor", "errorColor", "setErrorMessage", "setErrorMessageListener", "setNumberOnlyInputType", "setOnFocusChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTextColor", "colors", "color", "setTextSilent", Entry.TYPE_TEXT, "", "setTextSilent$payments_core_release", "AfterTextChangedListener", "DeleteEmptyListener", "ErrorMessageListener", "SoftDeleteInputConnection", "StripeEditTextState", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeEditText.kt\ncom/stripe/android/view/StripeEditText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1#2:342\n58#3,23:343\n93#3,3:366\n1855#4,2:369\n1855#4,2:371\n1855#4,2:373\n*S KotlinDebug\n*F\n+ 1 StripeEditText.kt\ncom/stripe/android/view/StripeEditText\n*L\n200#1:343,23\n200#1:366,3\n317#1:369,2\n321#1:371,2\n277#1:373,2\n*E\n"})
/* loaded from: classes7.dex */
public class StripeEditText extends TextInputEditText {
    public static final int $stable = 8;
    private final String accessibilityText;
    private AfterTextChangedListener afterTextChangedListener;
    private ColorStateList defaultColorStateList;
    private int defaultErrorColor;
    private DeleteEmptyListener deleteEmptyListener;
    private String errorMessage;
    private ErrorMessageListener errorMessageListener;
    private ColorStateList externalColorStateList;
    private Integer externalErrorColor;
    private View.OnFocusChangeListener externalFocusChangeListener;
    private final List<View.OnFocusChangeListener> internalFocusChangeListeners;
    private boolean isLastKeyDelete;
    private final StripeEditText$isLastKeyDeleteTextWatcher$1 isLastKeyDeleteTextWatcher;
    private boolean shouldShowError;
    private List<TextWatcher> textWatchers;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "", "onTextChanged", "", Entry.TYPE_TEXT, "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface AfterTextChangedListener {
        void onTextChanged(String str);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "", "onDeleteEmpty", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface DeleteEmptyListener {
        void onDeleteEmpty();
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "", "displayErrorMessage", "", "message", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface ErrorMessageListener {
        void displayErrorMessage(String str);
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SoftDeleteInputConnection extends InputConnectionWrapper {
        private final DeleteEmptyListener deleteEmptyListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoftDeleteInputConnection(InputConnection target, boolean z, DeleteEmptyListener deleteEmptyListener) {
            super(target, z);
            Intrinsics.checkNotNullParameter(target, "target");
            this.deleteEmptyListener = deleteEmptyListener;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
            if (r2 == true) goto L7;
         */
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean deleteSurroundingText(int i, int i2) {
            DeleteEmptyListener deleteEmptyListener;
            boolean z;
            boolean z2 = true;
            CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
            if (textBeforeCursor != null) {
                if (textBeforeCursor.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            z2 = false;
            if (z2 && (deleteEmptyListener = this.deleteEmptyListener) != null) {
                deleteEmptyListener.onDeleteEmpty();
            }
            return super.deleteSurroundingText(i, i2);
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/view/StripeEditText$StripeEditTextState;", "Landroid/os/Parcelable;", "superState", "errorMessage", "", "shouldShowError", "", "(Landroid/os/Parcelable;Ljava/lang/String;Z)V", "getErrorMessage", "()Ljava/lang/String;", "getShouldShowError", "()Z", "getSuperState", "()Landroid/os/Parcelable;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class StripeEditTextState implements Parcelable {
        public static final Parcelable.Creator<StripeEditTextState> CREATOR = new Creator();
        private final String errorMessage;
        private final boolean shouldShowError;
        private final Parcelable superState;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<StripeEditTextState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StripeEditTextState(parcel.readParcelable(StripeEditTextState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState[] newArray(int i) {
                return new StripeEditTextState[i];
            }
        }

        public StripeEditTextState(Parcelable parcelable, String str, boolean z) {
            this.superState = parcelable;
            this.errorMessage = str;
            this.shouldShowError = z;
        }

        public static /* synthetic */ StripeEditTextState copy$default(StripeEditTextState stripeEditTextState, Parcelable parcelable, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = stripeEditTextState.superState;
            }
            if ((i & 2) != 0) {
                str = stripeEditTextState.errorMessage;
            }
            if ((i & 4) != 0) {
                z = stripeEditTextState.shouldShowError;
            }
            return stripeEditTextState.copy(parcelable, str, z);
        }

        public final Parcelable component1() {
            return this.superState;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final boolean component3() {
            return this.shouldShowError;
        }

        public final StripeEditTextState copy(Parcelable parcelable, String str, boolean z) {
            return new StripeEditTextState(parcelable, str, z);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StripeEditTextState) {
                StripeEditTextState stripeEditTextState = (StripeEditTextState) obj;
                return Intrinsics.areEqual(this.superState, stripeEditTextState.superState) && Intrinsics.areEqual(this.errorMessage, stripeEditTextState.errorMessage) && this.shouldShowError == stripeEditTextState.shouldShowError;
            }
            return false;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Parcelable parcelable = this.superState;
            int hashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.shouldShowError;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            Parcelable parcelable = this.superState;
            String str = this.errorMessage;
            boolean z = this.shouldShowError;
            return "StripeEditTextState(superState=" + parcelable + ", errorMessage=" + str + ", shouldShowError=" + z + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.superState, i);
            out.writeString(this.errorMessage);
            out.writeInt(this.shouldShowError ? 1 : 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void determineDefaultErrorColor() {
        int i;
        Context context = getContext();
        if (StripeColorUtils.Companion.isColorDark(this.defaultColorStateList.getDefaultColor())) {
            i = C18606R.color.stripe_error_text_light_theme;
        } else {
            i = C18606R.color.stripe_error_text_dark_theme;
        }
        this.defaultErrorColor = NA0.m94301c(context, i);
    }

    private final boolean isDeleteKey(int i) {
        return i == 67;
    }

    public static /* synthetic */ void isLastKeyDelete$payments_core_release$annotations() {
    }

    private final void listenForDeleteEmpty() {
        List<TextWatcher> list = this.textWatchers;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!list.contains(this.isLastKeyDeleteTextWatcher)) {
            addTextChangedListener(this.isLastKeyDeleteTextWatcher);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: wS5
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                boolean listenForDeleteEmpty$lambda$6;
                listenForDeleteEmpty$lambda$6 = StripeEditText.listenForDeleteEmpty$lambda$6(StripeEditText.this, view, i, keyEvent);
                return listenForDeleteEmpty$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listenForDeleteEmpty$lambda$6(StripeEditText this$0, View view, int i, KeyEvent keyEvent) {
        DeleteEmptyListener deleteEmptyListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (keyEvent.getAction() == 0) {
            boolean isDeleteKey = this$0.isDeleteKey(i);
            this$0.isLastKeyDelete = isDeleteKey;
            if (isDeleteKey && this$0.length() == 0 && (deleteEmptyListener = this$0.deleteEmptyListener) != null) {
                deleteEmptyListener.onDeleteEmpty();
                return false;
            }
            return false;
        }
        return false;
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                StripeEditText.AfterTextChangedListener afterTextChangedListener;
                afterTextChangedListener = StripeEditText.this.afterTextChangedListener;
                if (afterTextChangedListener != null) {
                    String obj = editable != null ? editable.toString() : null;
                    if (obj == null) {
                        obj = "";
                    }
                    afterTextChangedListener.onTextChanged(obj);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnFocusChangeListener$lambda$9(StripeEditText this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (View.OnFocusChangeListener onFocusChangeListener : this$0.internalFocusChangeListeners) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        View.OnFocusChangeListener onFocusChangeListener2 = this$0.externalFocusChangeListener;
        if (onFocusChangeListener2 != null) {
            onFocusChangeListener2.onFocusChange(view, z);
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        List<TextWatcher> list;
        super.addTextChangedListener(textWatcher);
        if (textWatcher != null && (list = this.textWatchers) != null) {
            list.add(textWatcher);
        }
    }

    public String getAccessibilityText() {
        return this.accessibilityText;
    }

    public final ColorStateList getDefaultColorStateList$payments_core_release() {
        return this.defaultColorStateList;
    }

    public final int getDefaultErrorColorInt() {
        determineDefaultErrorColor();
        return this.defaultErrorColor;
    }

    public final String getErrorMessage$payments_core_release() {
        return this.errorMessage;
    }

    public final String getFieldText$payments_core_release() {
        Editable text = getText();
        String obj = text != null ? text.toString() : null;
        return obj == null ? "" : obj;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.internalFocusChangeListeners;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.externalFocusChangeListener;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    public final boolean isLastKeyDelete$payments_core_release() {
        return this.isLastKeyDelete;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection != null) {
            return new SoftDeleteInputConnection(onCreateInputConnection, true, this.deleteEmptyListener);
        }
        return null;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.shouldShowError);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.errorMessage;
        if (!this.shouldShowError) {
            str = null;
        }
        info.setError(str);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState");
        StripeEditTextState stripeEditTextState = (StripeEditTextState) parcelable;
        super.onRestoreInstanceState(stripeEditTextState.getSuperState());
        this.errorMessage = stripeEditTextState.getErrorMessage();
        setShouldShowError(stripeEditTextState.getShouldShowError());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new StripeEditTextState(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        List<TextWatcher> list;
        super.removeTextChangedListener(textWatcher);
        if (textWatcher != null && (list = this.textWatchers) != null) {
            list.remove(textWatcher);
        }
    }

    public final void setAfterTextChangedListener(AfterTextChangedListener afterTextChangedListener) {
        this.afterTextChangedListener = afterTextChangedListener;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(colorStateList, "<set-?>");
        this.defaultColorStateList = colorStateList;
    }

    public final void setDeleteEmptyListener(DeleteEmptyListener deleteEmptyListener) {
        this.deleteEmptyListener = deleteEmptyListener;
    }

    public final void setErrorColor(int i) {
        this.externalErrorColor = Integer.valueOf(i);
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessageListener(ErrorMessageListener errorMessageListener) {
        this.errorMessageListener = errorMessageListener;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z) {
        this.isLastKeyDelete = z;
    }

    public final void setNumberOnlyInputType() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: vS5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                StripeEditText.setOnFocusChangeListener$lambda$9(StripeEditText.this, view, z);
            }
        });
        this.externalFocusChangeListener = onFocusChangeListener;
    }

    public final void setShouldShowError(boolean z) {
        int i;
        ErrorMessageListener errorMessageListener;
        String str = this.errorMessage;
        if (str != null && (errorMessageListener = this.errorMessageListener) != null) {
            if (!Boolean.valueOf(z).booleanValue()) {
                str = null;
            }
            errorMessageListener.displayErrorMessage(str);
        }
        if (this.shouldShowError != z) {
            if (z) {
                Integer num = this.externalErrorColor;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = this.defaultErrorColor;
                }
                super.setTextColor(i);
            } else {
                ColorStateList colorStateList = this.externalColorStateList;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.externalColorStateList = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence charSequence) {
        List<TextWatcher> list = this.textWatchers;
        if (list != null) {
            for (TextWatcher textWatcher : list) {
                super.removeTextChangedListener(textWatcher);
            }
        }
        setText(charSequence);
        List<TextWatcher> list2 = this.textWatchers;
        if (list2 != null) {
            for (TextWatcher textWatcher2 : list2) {
                super.addTextChangedListener(textWatcher2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C50553vf4.editTextStyle : i);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        setTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.stripe.android.view.StripeEditText$isLastKeyDeleteTextWatcher$1] */
    @JvmOverloads
    public StripeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isLastKeyDeleteTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.StripeEditText$isLastKeyDeleteTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                StripeEditText.this.setLastKeyDelete$payments_core_release(i4 == 0);
            }
        };
        this.textWatchers = new ArrayList();
        setMaxLines(1);
        listenForTextChanges();
        listenForDeleteEmpty();
        ColorStateList textColors = getTextColors();
        Intrinsics.checkNotNullExpressionValue(textColors, "textColors");
        this.defaultColorStateList = textColors;
        determineDefaultErrorColor();
        setOnFocusChangeListener(null);
        this.internalFocusChangeListeners = new ArrayList();
    }
}
