package io.card.payment;
/* loaded from: classes7.dex */
class MaxLengthValidator extends NonEmptyValidator {
    private int maxLength;

    public MaxLengthValidator(int i) {
        this.maxLength = i;
    }

    @Override // io.card.payment.NonEmptyValidator, io.card.payment.Validator
    public boolean isValid() {
        return super.isValid() && getValue().length() <= this.maxLength;
    }
}
