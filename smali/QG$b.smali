.class public final LQG$b;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQG;->b(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/card/CardConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.adyen.checkout.card.repository.BinLookupRepository"
    f = "BinLookupRepository.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x41
    }
    m = "fetch"
    n = {
        "this",
        "cardNumber"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LQG;

.field public l:I


# direct methods
.method public constructor <init>(LQG;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQG;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LQG$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LQG$b;->k:LQG;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LQG$b;->j:Ljava/lang/Object;

    iget p1, p0, LQG$b;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LQG$b;->l:I

    iget-object p1, p0, LQG$b;->k:LQG;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, LQG;->b(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/card/CardConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
