.class public final LkT3$a;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LkT3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/FutureTask<",
        "LWT;",
        ">;",
        "Ljava/lang/Comparable<",
        "LkT3$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:LWT;


# direct methods
.method public constructor <init>(LWT;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    iput-object p1, p0, LkT3$a;->b:LWT;

    return-void
.end method


# virtual methods
.method public a(LkT3$a;)I
    .locals 2

    iget-object v0, p0, LkT3$a;->b:LWT;

    invoke-virtual {v0}, LWT;->r()LiT3$f;

    move-result-object v0

    iget-object v1, p1, LkT3$a;->b:LWT;

    invoke-virtual {v1}, LWT;->r()LiT3$f;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LkT3$a;->b:LWT;

    iget v0, v0, LWT;->b:I

    iget-object p1, p1, LkT3$a;->b:LWT;

    iget p1, p1, LWT;->b:I

    sub-int/2addr v0, p1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sub-int v0, p1, v0

    :goto_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LkT3$a;

    invoke-virtual {p0, p1}, LkT3$a;->a(LkT3$a;)I

    move-result p1

    return p1
.end method
