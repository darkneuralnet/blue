.class public final LyW0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyW0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic b:LMM5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMM5<",
            "Ld62;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LMM5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMM5<",
            "Ld62;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LyW0$a$a;->b:LMM5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
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

    instance-of p2, p1, LjN1;

    if-eqz p2, :cond_0

    iget-object p2, p0, LyW0$a$a;->b:LMM5;

    invoke-virtual {p2, p1}, LMM5;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of p2, p1, LkN1;

    if-eqz p2, :cond_1

    iget-object p2, p0, LyW0$a$a;->b:LMM5;

    check-cast p1, LkN1;

    invoke-virtual {p1}, LkN1;->a()LjN1;

    move-result-object p1

    invoke-virtual {p2, p1}, LMM5;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lxv1;

    if-eqz p2, :cond_2

    iget-object p2, p0, LyW0$a$a;->b:LMM5;

    invoke-virtual {p2, p1}, LMM5;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lyv1;

    if-eqz p2, :cond_3

    iget-object p2, p0, LyW0$a$a;->b:LMM5;

    check-cast p1, Lyv1;

    invoke-virtual {p1}, Lyv1;->a()Lxv1;

    move-result-object p1

    invoke-virtual {p2, p1}, LMM5;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of p2, p1, LQ14;

    if-eqz p2, :cond_4

    iget-object p2, p0, LyW0$a$a;->b:LMM5;

    invoke-virtual {p2, p1}, LMM5;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of p2, p1, LR14;

    if-eqz p2, :cond_5

    iget-object p2, p0, LyW0$a$a;->b:LMM5;

    check-cast p1, LR14;

    invoke-virtual {p1}, LR14;->a()LQ14;

    move-result-object p1

    invoke-virtual {p2, p1}, LMM5;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    instance-of p2, p1, LP14;

    if-eqz p2, :cond_6

    iget-object p2, p0, LyW0$a$a;->b:LMM5;

    check-cast p1, LP14;

    invoke-virtual {p1}, LP14;->a()LQ14;

    move-result-object p1

    invoke-virtual {p2, p1}, LMM5;->remove(Ljava/lang/Object;)Z

    :cond_6
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ld62;

    invoke-virtual {p0, p1, p2}, LyW0$a$a;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
