package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.C19423R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants;", "", "()V", "Error", "Valid", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldStateConstants {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B%\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "Lcom/stripe/android/uicore/elements/TextFieldState;", "errorMessageResId", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)V", "getErrorMessageResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getError", "Lcom/stripe/android/uicore/elements/FieldError;", "isFull", "", "isValid", "Blank", "Incomplete", "Invalid", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Error implements TextFieldState {
        public static final int $stable = 8;
        private final int errorMessageResId;
        private final Object[] formatArgs;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "()V", "isBlank", "", "shouldShowError", "hasFocus", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Blank extends Error {
            public static final int $stable = 0;
            public static final Blank INSTANCE = new Blank();

            private Blank() {
                super(C19423R.string.blank_and_required, null, 2, null);
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                return true;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean z) {
                return false;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "errorMessageResId", "", "(I)V", "getErrorMessageResId", "()I", "isBlank", "", "shouldShowError", "hasFocus", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Incomplete extends Error {
            public static final int $stable = 0;
            private final int errorMessageResId;

            public Incomplete(int i) {
                super(i, null, 2, null);
                this.errorMessageResId = i;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldStateConstants.Error
            public int getErrorMessageResId() {
                return this.errorMessageResId;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean z) {
                return !z;
            }
        }

        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "errorMessageResId", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)V", "getErrorMessageResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "isBlank", "", "shouldShowError", "hasFocus", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Invalid extends Error {
            public static final int $stable = 8;
            private final int errorMessageResId;
            private final Object[] formatArgs;

            public /* synthetic */ Invalid(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : objArr);
            }

            @Override // com.stripe.android.uicore.elements.TextFieldStateConstants.Error
            public int getErrorMessageResId() {
                return this.errorMessageResId;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldStateConstants.Error
            public Object[] getFormatArgs() {
                return this.formatArgs;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean z) {
                return true;
            }

            public Invalid(int i, Object[] objArr) {
                super(i, objArr, null);
                this.errorMessageResId = i;
                this.formatArgs = objArr;
            }
        }

        public /* synthetic */ Error(int i, Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, objArr);
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public FieldError getError() {
            return new FieldError(getErrorMessageResId(), getFormatArgs());
        }

        public int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        public Object[] getFormatArgs() {
            return this.formatArgs;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean isFull() {
            return false;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean isValid() {
            return false;
        }

        private Error(int i, Object[] objArr) {
            this.errorMessageResId = i;
            this.formatArgs = objArr;
        }

        public /* synthetic */ Error(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : objArr, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;", "Lcom/stripe/android/uicore/elements/TextFieldState;", "()V", "getError", "Lcom/stripe/android/uicore/elements/FieldError;", "isBlank", "", "isValid", "shouldShowError", "hasFocus", "Full", "Limitless", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Valid implements TextFieldState {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;", "()V", "isFull", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Full extends Valid {
            public static final int $stable = 0;
            public static final Full INSTANCE = new Full();

            private Full() {
                super(null);
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isFull() {
                return true;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;", "()V", "isFull", "", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Limitless extends Valid {
            public static final int $stable = 0;
            public static final Limitless INSTANCE = new Limitless();

            private Limitless() {
                super(null);
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isFull() {
                return false;
            }
        }

        public /* synthetic */ Valid(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public FieldError getError() {
            return null;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean isBlank() {
            return false;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean isValid() {
            return true;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean shouldShowError(boolean z) {
            return false;
        }

        private Valid() {
        }
    }
}
