package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/Spacing;", "", "Lk61;", "cardLeadingInnerPadding", "F", "getCardLeadingInnerPadding-D9Ej5fM", "()F", "carouselOuterPadding", "getCarouselOuterPadding-D9Ej5fM", "carouselInnerPadding", "getCarouselInnerPadding-D9Ej5fM", "iconSize", "getIconSize-D9Ej5fM", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/Spacing\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,274:1\n154#2:275\n154#2:276\n154#2:277\n154#2:278\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/Spacing\n*L\n43#1:275\n44#1:276\n45#1:277\n46#1:278\n*E\n"})
/* loaded from: classes7.dex */
final class Spacing {
    private static final float cardLeadingInnerPadding;
    private static final float carouselInnerPadding;
    public static final Spacing INSTANCE = new Spacing();
    private static final float carouselOuterPadding = C43705k61.m29303g(20);
    private static final float iconSize = C43705k61.m29303g(28);

    static {
        float f = 12;
        cardLeadingInnerPadding = C43705k61.m29303g(f);
        carouselInnerPadding = C43705k61.m29303g(f);
    }

    private Spacing() {
    }

    /* renamed from: getCardLeadingInnerPadding-D9Ej5fM  reason: not valid java name */
    public final float m116602getCardLeadingInnerPaddingD9Ej5fM() {
        return cardLeadingInnerPadding;
    }

    /* renamed from: getCarouselInnerPadding-D9Ej5fM  reason: not valid java name */
    public final float m116603getCarouselInnerPaddingD9Ej5fM() {
        return carouselInnerPadding;
    }

    /* renamed from: getCarouselOuterPadding-D9Ej5fM  reason: not valid java name */
    public final float m116604getCarouselOuterPaddingD9Ej5fM() {
        return carouselOuterPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m116605getIconSizeD9Ej5fM() {
        return iconSize;
    }
}
