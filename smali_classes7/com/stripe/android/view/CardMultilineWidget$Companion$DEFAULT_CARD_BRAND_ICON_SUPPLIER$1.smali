.class final Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardMultilineWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "Lcom/stripe/android/model/CardBrand;",
        "cardBrand",
        "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;

    invoke-direct {v0}, Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;-><init>()V

    sput-object v0, Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;->INSTANCE:Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;
    .locals 1

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;

    invoke-virtual {p1}, Lcom/stripe/android/model/CardBrand;->getIcon()I

    move-result p1

    invoke-direct {v0, p1}, Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;-><init>(I)V

    return-object v0
.end method
