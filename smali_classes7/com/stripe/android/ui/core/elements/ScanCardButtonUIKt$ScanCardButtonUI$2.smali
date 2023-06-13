.class final Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt;->ScanCardButtonUI(ZLkotlin/jvm/functions/Function1;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $cardScanLauncher:LTH2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTH2<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;


# direct methods
.method public constructor <init>(LTH2;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTH2<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;->$cardScanLauncher:LTH2;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;->$context:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;->$cardScanLauncher:LTH2;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/ScanCardButtonUIKt$ScanCardButtonUI$2;->$context:Landroid/content/Context;

    const-class v3, Lcom/stripe/android/ui/core/cardscan/CardScanActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method
