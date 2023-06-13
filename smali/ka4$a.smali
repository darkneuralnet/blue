.class public final Lka4$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lka4;->a(Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.adyen.checkout.card.repository.PublicKeyRepository"
    f = "PublicKeyRepository.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x27
    }
    m = "fetchPublicKey"
    n = {
        "environment",
        "clientKey"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lka4;

.field public n:I


# direct methods
.method public constructor <init>(Lka4;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lka4;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lka4$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lka4$a;->m:Lka4;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lka4$a;->l:Ljava/lang/Object;

    iget p1, p0, Lka4$a;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lka4$a;->n:I

    iget-object p1, p0, Lka4$a;->m:Lka4;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lka4;->a(Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
