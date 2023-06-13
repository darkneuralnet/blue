.class final Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3;->invoke(LAY2;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/jvm/functions/Function3<",
        "-",
        "LPm0;",
        "-",
        "LEt0;",
        "-",
        "Ljava/lang/Integer;",
        "+",
        "Lkotlin/Unit;",
        ">;",
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
.field final synthetic $bottomSheetContent$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $coroutineScope:LZC0;

.field final synthetic $sheetState:LGU2;


# direct methods
.method public constructor <init>(LZC0;LGU2;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "LGU2;",
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->$coroutineScope:LZC0;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->$sheetState:LGU2;

    iput-object p3, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->$bottomSheetContent$delegate:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function3;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->invoke(Lkotlin/jvm/functions/Function3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function3;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->$coroutineScope:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1$1;

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->$sheetState:LGU2;

    iget-object v4, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->$bottomSheetContent$delegate:LEX2;

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1$1;-><init>(LGU2;LEX2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3$1$1;->$bottomSheetContent$delegate:LEX2;

    invoke-static {v0, p1}, Lcom/stripe/android/link/LinkActivity$onCreate$1;->access$invoke$lambda$2(LEX2;Lkotlin/jvm/functions/Function3;)V

    :goto_0
    return-void
.end method
