.class public abstract LB0;
.super Lre6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lre6<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:LB0$b;

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lre6;-><init>()V

    sget-object v0, LB0$b;->c:LB0$b;

    iput-object v0, p0, LB0;->b:LB0$b;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public final b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, LB0$b;->d:LB0$b;

    iput-object v0, p0, LB0;->b:LB0$b;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Z
    .locals 2

    sget-object v0, LB0$b;->e:LB0$b;

    iput-object v0, p0, LB0;->b:LB0$b;

    invoke-virtual {p0}, LB0;->a()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LB0;->c:Ljava/lang/Object;

    iget-object v0, p0, LB0;->b:LB0$b;

    sget-object v1, LB0$b;->d:LB0$b;

    if-eq v0, v1, :cond_0

    sget-object v0, LB0$b;->b:LB0$b;

    iput-object v0, p0, LB0;->b:LB0$b;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasNext()Z
    .locals 4

    iget-object v0, p0, LB0;->b:LB0$b;

    sget-object v1, LB0$b;->e:LB0$b;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, LEZ3;->t(Z)V

    sget-object v0, LB0$a;->a:[I

    iget-object v1, p0, LB0;->b:LB0$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v3, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, LB0;->c()Z

    move-result v0

    return v0

    :cond_1
    return v3

    :cond_2
    return v2
.end method

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LB0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LB0$b;->c:LB0$b;

    iput-object v0, p0, LB0;->b:LB0$b;

    iget-object v0, p0, LB0;->c:Ljava/lang/Object;

    invoke-static {v0}, Lrd3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, LB0;->c:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
