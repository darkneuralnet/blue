package io.card.payment.i18n;

import java.lang.Enum;
/* loaded from: classes7.dex */
public interface SupportedLocale<E extends Enum<?>> {
    String getAdaptedDisplay(E e, String str);

    String getName();
}
