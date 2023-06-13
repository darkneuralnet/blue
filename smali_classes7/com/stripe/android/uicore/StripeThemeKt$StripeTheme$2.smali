.class final Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V
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

.field final synthetic $colors:Lcom/stripe/android/uicore/StripeColors;

.field final synthetic $content:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shapes:Lcom/stripe/android/uicore/StripeShapes;

.field final synthetic $typography:Lcom/stripe/android/uicore/StripeTypography;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/StripeColors;",
            "Lcom/stripe/android/uicore/StripeShapes;",
            "Lcom/stripe/android/uicore/StripeTypography;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$colors:Lcom/stripe/android/uicore/StripeColors;

    iput-object p2, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$shapes:Lcom/stripe/android/uicore/StripeShapes;

    iput-object p3, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$typography:Lcom/stripe/android/uicore/StripeTypography;

    iput-object p4, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$content:Lkotlin/jvm/functions/Function2;

    iput p5, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$$changed:I

    iput p6, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$colors:Lcom/stripe/android/uicore/StripeColors;

    iget-object v1, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$shapes:Lcom/stripe/android/uicore/StripeShapes;

    iget-object v2, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$typography:Lcom/stripe/android/uicore/StripeTypography;

    iget-object v3, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$content:Lkotlin/jvm/functions/Function2;

    iget p2, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$$changed:I

    or-int/lit8 v5, p2, 0x1

    iget v6, p0, Lcom/stripe/android/uicore/StripeThemeKt$StripeTheme$2;->$$default:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    return-void
.end method
