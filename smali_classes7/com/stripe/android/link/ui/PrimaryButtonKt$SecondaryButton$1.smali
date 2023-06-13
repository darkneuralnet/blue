.class final Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/PrimaryButtonKt;->SecondaryButton(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LZc5;",
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
.field final synthetic $$dirty:I

.field final synthetic $enabled:Z

.field final synthetic $label:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;I)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;->$label:Ljava/lang/String;

    iput p3, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc5;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;->invoke(LZc5;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LZc5;LEt0;I)V
    .locals 3

    const-string v0, "$this$TextButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LEt0;->b()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.link.ui.SecondaryButton.<anonymous> (PrimaryButton.kt:193)"

    const v1, 0x44ce2871

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 p1, 0x1

    new-array p3, p1, [LW94;

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v0

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;->$enabled:Z

    if-eqz v1, :cond_3

    sget-object v1, LWz0;->a:LWz0;

    sget v2, LWz0;->b:I

    invoke-virtual {v1, p2, v2}, LWz0;->c(LEt0;I)F

    move-result v1

    goto :goto_1

    :cond_3
    sget-object v1, LWz0;->a:LWz0;

    sget v2, LWz0;->b:I

    invoke-virtual {v1, p2, v2}, LWz0;->b(LEt0;I)F

    move-result v1

    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p3, v1

    new-instance v0, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1$1;

    iget-object v1, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;->$label:Ljava/lang/String;

    iget v2, p0, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1;->$$dirty:I

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/ui/PrimaryButtonKt$SecondaryButton$1$1;-><init>(Ljava/lang/String;I)V

    const v1, -0x30ae12cf

    invoke-static {p2, v1, p1, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p1

    const/16 v0, 0x38

    invoke-static {p3, p1, p2, v0}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method
