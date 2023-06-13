package com.stripe.android.financialconnections.p041ui.components;

import com.stripe.android.financialconnections.p041ui.theme.ColorKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton;", "", "()V", "Size", "Type", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton */
/* loaded from: classes7.dex */
public final class FinancialConnectionsButton {
    public static final FinancialConnectionsButton INSTANCE = new FinancialConnectionsButton();

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\b\u001a\u00020\u00058&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\r\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;", "", "LPD3;", "paddingValues", "(LEt0;I)LPD3;", "Lk61;", "getRadius-D9Ej5fM", "()F", "radius", "<init>", "()V", "Pill", "Regular", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Size */
    /* loaded from: classes7.dex */
    public static abstract class Size {
        public static final int $stable = 0;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R#\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;", "LPD3;", "paddingValues", "(LEt0;I)LPD3;", "Lk61;", "radius", "F", "getRadius-D9Ej5fM", "()F", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,241:1\n154#2:242\n154#2:243\n154#2:244\n154#2:245\n154#2:246\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Pill\n*L\n168#1:242\n169#1:243\n170#1:244\n171#1:245\n164#1:246\n*E\n"})
        /* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Size$Pill */
        /* loaded from: classes7.dex */
        public static final class Pill extends Size {
            public static final int $stable = 0;
            public static final Pill INSTANCE = new Pill();
            private static final float radius = C43705k61.m29303g(4);

            private Pill() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Size
            /* renamed from: getRadius-D9Ej5fM */
            public float mo116430getRadiusD9Ej5fM() {
                return radius;
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Size
            public PD3 paddingValues(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                interfaceC32720Et0.mo89638F(1921224677);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(1921224677, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Size.Pill.paddingValues (Button.kt:166)");
                }
                float f = 8;
                float f2 = 4;
                PD3 m94189d = ND3.m94189d(C43705k61.m29303g(f), C43705k61.m29303g(f2), C43705k61.m29303g(f), C43705k61.m29303g(f2));
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return m94189d;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R#\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;", "LPD3;", "paddingValues", "(LEt0;I)LPD3;", "Lk61;", "radius", "F", "getRadius-D9Ej5fM", "()F", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,241:1\n154#2:242\n154#2:243\n154#2:244\n154#2:245\n154#2:246\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular\n*L\n180#1:242\n181#1:243\n182#1:244\n183#1:245\n176#1:246\n*E\n"})
        /* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Size$Regular */
        /* loaded from: classes7.dex */
        public static final class Regular extends Size {
            public static final int $stable = 0;
            public static final Regular INSTANCE = new Regular();
            private static final float radius = C43705k61.m29303g(12);

            private Regular() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Size
            /* renamed from: getRadius-D9Ej5fM */
            public float mo116430getRadiusD9Ej5fM() {
                return radius;
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Size
            public PD3 paddingValues(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                interfaceC32720Et0.mo89638F(-982635024);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-982635024, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Size.Regular.paddingValues (Button.kt:178)");
                }
                float f = 16;
                PD3 m94189d = ND3.m94189d(C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(f));
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return m94189d;
            }
        }

        public /* synthetic */ Size(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getRadius-D9Ej5fM  reason: not valid java name */
        public abstract float mo116430getRadiusD9Ej5fM();

        public abstract PD3 paddingValues(InterfaceC32720Et0 interfaceC32720Et0, int i);

        private Size() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000e\u000f\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "", "Lh70;", "buttonColors", "(LEt0;I)Lh70;", "Lpm0;", "rippleColor-0d7_KjU", "()J", "rippleColor", "<init>", "()V", "Critical", "Primary", "Secondary", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Critical;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type */
    /* loaded from: classes7.dex */
    public static abstract class Type {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Critical;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "Lh70;", "buttonColors", "(LEt0;I)Lh70;", "Lpm0;", "rippleColor-0d7_KjU", "()J", "rippleColor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Critical */
        /* loaded from: classes7.dex */
        public static final class Critical extends Type {
            public static final int $stable = 0;
            public static final Critical INSTANCE = new Critical();

            private Critical() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Type
            public InterfaceC41935h70 buttonColors(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                interfaceC32720Et0.mo89638F(-533923906);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-533923906, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Critical.buttonColors (Button.kt:143)");
                }
                C42528i70 c42528i70 = C42528i70.f86761a;
                FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                InterfaceC41935h70 m34439a = c42528i70.m34439a(financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116470getTextCritical0d7_KjU(), financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116476getTextWhite0d7_KjU(), C47063pm0.m18743m(financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116470getTextCritical0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), C47063pm0.m18743m(financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), interfaceC32720Et0, C42528i70.f86772l << 12, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return m34439a;
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Type
            /* renamed from: rippleColor-0d7_KjU */
            public long mo116431rippleColor0d7_KjU() {
                return ColorKt.getNeutral50();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "Lh70;", "buttonColors", "(LEt0;I)Lh70;", "Lpm0;", "rippleColor-0d7_KjU", "()J", "rippleColor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Primary */
        /* loaded from: classes7.dex */
        public static final class Primary extends Type {
            public static final int $stable = 0;
            public static final Primary INSTANCE = new Primary();

            private Primary() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Type
            public InterfaceC41935h70 buttonColors(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                interfaceC32720Et0.mo89638F(-585272451);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-585272451, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Primary.buttonColors (Button.kt:115)");
                }
                C42528i70 c42528i70 = C42528i70.f86761a;
                FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                InterfaceC41935h70 m34439a = c42528i70.m34439a(financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116469getTextBrand0d7_KjU(), financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116476getTextWhite0d7_KjU(), financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116469getTextBrand0d7_KjU(), C47063pm0.m18743m(financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116476getTextWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), interfaceC32720Et0, C42528i70.f86772l << 12, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return m34439a;
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Type
            /* renamed from: rippleColor-0d7_KjU */
            public long mo116431rippleColor0d7_KjU() {
                return ColorKt.getBrand400();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "Lh70;", "buttonColors", "(LEt0;I)Lh70;", "Lpm0;", "rippleColor-0d7_KjU", "()J", "rippleColor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary */
        /* loaded from: classes7.dex */
        public static final class Secondary extends Type {
            public static final int $stable = 0;
            public static final Secondary INSTANCE = new Secondary();

            private Secondary() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Type
            public InterfaceC41935h70 buttonColors(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                interfaceC32720Et0.mo89638F(-1339122933);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1339122933, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Secondary.buttonColors (Button.kt:129)");
                }
                C42528i70 c42528i70 = C42528i70.f86761a;
                FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                InterfaceC41935h70 m34439a = c42528i70.m34439a(financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116460getBackgroundContainer0d7_KjU(), financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU(), financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116460getBackgroundContainer0d7_KjU(), C47063pm0.m18743m(financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), interfaceC32720Et0, C42528i70.f86772l << 12, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                interfaceC32720Et0.mo89605Q();
                return m34439a;
            }

            @Override // com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton.Type
            /* renamed from: rippleColor-0d7_KjU */
            public long mo116431rippleColor0d7_KjU() {
                return ColorKt.getNeutral50();
            }
        }

        public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract InterfaceC41935h70 buttonColors(InterfaceC32720Et0 interfaceC32720Et0, int i);

        /* renamed from: rippleColor-0d7_KjU  reason: not valid java name */
        public abstract long mo116431rippleColor0d7_KjU();

        private Type() {
        }
    }

    private FinancialConnectionsButton() {
    }
}
