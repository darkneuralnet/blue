.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;",
        "",
        "()V",
        "colorsDark",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;",
        "colorsLight",
        "primaryButton",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;",
        "shapes",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;",
        "typography",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;",
        "colors",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1086:1\n1#2:1087\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

.field private colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

.field private primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

.field private shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

.field private typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultLight()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;->getDefaultDark()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    return-void
.end method


# virtual methods
.method public final colorsDark(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;
    .locals 1

    const-string v0, "colors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->colorsDark:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object p0
.end method

.method public final colorsLight(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;
    .locals 1

    const-string v0, "colors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->colorsLight:Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    return-object p0
.end method

.method public final primaryButton(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;
    .locals 1

    const-string v0, "primaryButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->primaryButton:Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    return-object p0
.end method

.method public final shapes(Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;
    .locals 1

    const-string v0, "shapes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->shapes:Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    return-object p0
.end method

.method public final typography(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;
    .locals 1

    const-string v0, "typography"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;->typography:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    return-object p0
.end method
