.class final Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt;->ResetContent(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
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

.field final synthetic $onCloseClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$payload:Ldp;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$onCloseClick:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 3

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$payload:Ldp;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$onCloseClick:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$3;->$$changed:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {p2, v0, v1, p1, v2}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt;->access$ResetContent(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method
