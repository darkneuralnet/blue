.class final Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkButtonViewKt;->LinkButton(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LgV2;LEt0;II)V
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
.field final synthetic $$dirty:I

.field final synthetic $email:Ljava/lang/String;

.field final synthetic $enabled:Z

.field final synthetic $modifier:LgV2;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;LgV2;ZILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "ZI",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$modifier:LgV2;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$enabled:Z

    iput p4, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$$dirty:I

    iput-object p5, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$email:Ljava/lang/String;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.LinkButton.<anonymous> (LinkButtonView.kt:71)"

    const v2, -0x504e570

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    new-instance p2, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;

    iget-object v4, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$onClick:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$modifier:LgV2;

    iget-boolean v6, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$enabled:Z

    iget v7, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$$dirty:I

    iget-object v8, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->$email:Ljava/lang/String;

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;-><init>(Lkotlin/jvm/functions/Function0;LgV2;ZILjava/lang/String;)V

    const v0, -0x2a28e4f4

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, p2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p2

    const/16 v0, 0x30

    const/4 v2, 0x0

    invoke-static {v2, p2, p1, v0, v1}, Lcom/stripe/android/link/theme/ThemeKt;->DefaultLinkTheme(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
