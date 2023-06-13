.class final Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
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
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $colorFilter:Lsm0;

.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $contentScale:LBA0;

.field final synthetic $debugPainter:LnE3;

.field final synthetic $errorContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $loadingContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:LgV2;

.field final synthetic $url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Ljava/lang/String;",
            "LgV2;",
            "LBA0;",
            "Lsm0;",
            "LnE3;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$url:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$contentDescription:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$modifier:LgV2;

    iput-object p5, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$contentScale:LBA0;

    iput-object p6, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$colorFilter:Lsm0;

    iput-object p7, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$debugPainter:LnE3;

    iput-object p8, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$errorContent:Lkotlin/jvm/functions/Function3;

    iput-object p9, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$loadingContent:Lkotlin/jvm/functions/Function3;

    iput p10, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$$changed:I

    iput p11, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$$default:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$url:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-object v2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$contentDescription:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$modifier:LgV2;

    iget-object v4, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$contentScale:LBA0;

    iget-object v5, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$colorFilter:Lsm0;

    iget-object v6, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$debugPainter:LnE3;

    iget-object v7, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$errorContent:Lkotlin/jvm/functions/Function3;

    iget-object v8, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$loadingContent:Lkotlin/jvm/functions/Function3;

    iget p2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$$changed:I

    or-int/lit8 v10, p2, 0x1

    iget v11, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;->$$default:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    return-void
.end method
