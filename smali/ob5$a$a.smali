.class public final Lob5$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lob5$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Ld62;",
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
.field public final synthetic b:Lvb5;

.field public final synthetic c:LZC0;


# direct methods
.method public constructor <init>(Lvb5;LZC0;)V
    .locals 0

    iput-object p1, p0, Lob5$a$a;->b:Lvb5;

    iput-object p2, p0, Lob5$a$a;->c:LZC0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld62;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, LQ14;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lob5$a$a;->b:Lvb5;

    check-cast p1, LQ14;

    iget-object v0, p0, Lob5$a$a;->c:LZC0;

    invoke-virtual {p2, p1, v0}, Lvb5;->b(LQ14;LZC0;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, LR14;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lob5$a$a;->b:Lvb5;

    check-cast p1, LR14;

    invoke-virtual {p1}, LR14;->a()LQ14;

    move-result-object p1

    invoke-virtual {p2, p1}, Lvb5;->d(LQ14;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, LP14;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lob5$a$a;->b:Lvb5;

    check-cast p1, LP14;

    invoke-virtual {p1}, LP14;->a()LQ14;

    move-result-object p1

    invoke-virtual {p2, p1}, Lvb5;->d(LQ14;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lob5$a$a;->b:Lvb5;

    iget-object v0, p0, Lob5$a$a;->c:LZC0;

    invoke-virtual {p2, p1, v0}, Lvb5;->e(Ld62;LZC0;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ld62;

    invoke-virtual {p0, p1, p2}, Lob5$a$a;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
