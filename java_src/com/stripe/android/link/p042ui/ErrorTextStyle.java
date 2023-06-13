package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/link/ui/ErrorTextStyle;", "", "Lhy5;", "getShape", "()Lhy5;", "shape", "LgV2;", "getIconModifier", "()LgV2;", "iconModifier", "getTextModifier", "textModifier", "LG26;", "getTextStyle", "()LG26;", "textStyle", "<init>", "()V", "Medium", "Small", "Lcom/stripe/android/link/ui/ErrorTextStyle$Medium;", "Lcom/stripe/android/link/ui/ErrorTextStyle$Small;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.ErrorTextStyle */
/* loaded from: classes7.dex */
public abstract class ErrorTextStyle {

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/link/ui/ErrorTextStyle$Medium;", "Lcom/stripe/android/link/ui/ErrorTextStyle;", "Lbc5;", "shape", "Lbc5;", "getShape", "()Lbc5;", "LgV2;", "iconModifier", "LgV2;", "getIconModifier", "()LgV2;", "textModifier", "getTextModifier", "LG26;", "textStyle", "LG26;", "getTextStyle", "()LG26;", "<init>", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nErrorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Medium\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,95:1\n154#2:96\n154#2:97\n154#2:98\n154#2:99\n*S KotlinDebug\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Medium\n*L\n47#1:96\n49#1:97\n50#1:98\n52#1:99\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.ErrorTextStyle$Medium */
    /* loaded from: classes7.dex */
    public static final class Medium extends ErrorTextStyle {
        private static final InterfaceC41563gV2 iconModifier;
        private static final InterfaceC41563gV2 textModifier;
        private static final G26 textStyle;
        public static final Medium INSTANCE = new Medium();
        private static final C38649bc5 shape = C39242cc5.m61172d(C43705k61.m29303g(8));

        static {
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            float f = 12;
            iconModifier = BB5.m114246w(ND3.m94183j(c20912a, C43705k61.m29303g(10), C43705k61.m29303g(f)), C43705k61.m29303g(20));
            textModifier = ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(f), 1, null);
            textStyle = new G26(0L, N26.m94414f(14), C33918Jw1.f18784c.m99540d(), null, null, AbstractC44199kw1.f95230c.m28152a(), null, 0L, null, null, null, 0L, null, null, null, null, N26.m94414f(20), null, 196569, null);
        }

        private Medium() {
            super(null);
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public InterfaceC41563gV2 getIconModifier() {
            return iconModifier;
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public InterfaceC41563gV2 getTextModifier() {
            return textModifier;
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public G26 getTextStyle() {
            return textStyle;
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public C38649bc5 getShape() {
            return shape;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/link/ui/ErrorTextStyle$Small;", "Lcom/stripe/android/link/ui/ErrorTextStyle;", "Lbc5;", "shape", "Lbc5;", "getShape", "()Lbc5;", "LgV2;", "iconModifier", "LgV2;", "getIconModifier", "()LgV2;", "textModifier", "getTextModifier", "LG26;", "textStyle", "LG26;", "getTextStyle", "()LG26;", "<init>", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nErrorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Small\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,95:1\n154#2:96\n154#2:97\n154#2:98\n154#2:99\n*S KotlinDebug\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextStyle$Small\n*L\n32#1:96\n34#1:97\n35#1:98\n37#1:99\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.ErrorTextStyle$Small */
    /* loaded from: classes7.dex */
    public static final class Small extends ErrorTextStyle {
        public static final Small INSTANCE = new Small();
        private static final InterfaceC41563gV2 iconModifier;
        private static final C38649bc5 shape;
        private static final InterfaceC41563gV2 textModifier;
        private static final G26 textStyle;

        static {
            float f = 4;
            shape = C39242cc5.m61172d(C43705k61.m29303g(f));
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            iconModifier = BB5.m114246w(ND3.m94184i(c20912a, C43705k61.m29303g(f)), C43705k61.m29303g(12));
            float f2 = 2;
            textModifier = ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f2), C43705k61.m29303g(f), C43705k61.m29303g(f2), 1, null);
            textStyle = new G26(0L, N26.m94414f(12), C33918Jw1.f18784c.m99539e(), null, null, AbstractC44199kw1.f95230c.m28152a(), null, 0L, null, null, null, 0L, null, null, null, null, N26.m94414f(16), null, 196569, null);
        }

        private Small() {
            super(null);
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public InterfaceC41563gV2 getIconModifier() {
            return iconModifier;
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public InterfaceC41563gV2 getTextModifier() {
            return textModifier;
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public G26 getTextStyle() {
            return textStyle;
        }

        @Override // com.stripe.android.link.p042ui.ErrorTextStyle
        public C38649bc5 getShape() {
            return shape;
        }
    }

    public /* synthetic */ ErrorTextStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InterfaceC41563gV2 getIconModifier();

    public abstract InterfaceC42444hy5 getShape();

    public abstract InterfaceC41563gV2 getTextModifier();

    public abstract G26 getTextStyle();

    private ErrorTextStyle() {
    }
}
