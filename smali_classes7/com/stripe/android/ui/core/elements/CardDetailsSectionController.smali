.class public final Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019\u0012\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0008\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
        "cardDetailsElement",
        "Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
        "getCardDetailsElement$payments_ui_core_release",
        "()Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
        "",
        "isCardScanEnabled",
        "Z",
        "isCardScanEnabled$payments_ui_core_release",
        "()Z",
        "Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;",
        "isStripeCardScanAvailable",
        "Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;",
        "isStripeCardScanAvailable$payments_ui_core_release",
        "()Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;",
        "LEu1;",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "error",
        "LEu1;",
        "getError",
        "()LEu1;",
        "Landroid/content/Context;",
        "context",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "initialValues",
        "",
        "viewOnlyFields",
        "<init>",
        "(Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;)V",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final cardDetailsElement:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

.field private final error:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final isCardScanEnabled:Z

.field private final isStripeCardScanAvailable:Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewOnlyFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v2, "card_detail"

    invoke-virtual {v1, v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, v0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/ui/core/elements/CardDetailsController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->cardDetailsElement:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->isCardScanEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isCardScanEnabled:Z

    new-instance p1, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isStripeCardScanAvailable:Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getController()Lcom/stripe/android/ui/core/elements/CardDetailsController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getError()LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->error:LEu1;

    return-void
.end method


# virtual methods
.method public final getCardDetailsElement$payments_ui_core_release()Lcom/stripe/android/ui/core/elements/CardDetailsElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->cardDetailsElement:Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    return-object v0
.end method

.method public getError()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->error:LEu1;

    return-object v0
.end method

.method public final isCardScanEnabled$payments_ui_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isCardScanEnabled:Z

    return v0
.end method

.method public final isStripeCardScanAvailable$payments_ui_core_release()Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->isStripeCardScanAvailable:Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;

    return-object v0
.end method
