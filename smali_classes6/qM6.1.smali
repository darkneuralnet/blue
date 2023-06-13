.class public final LqM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LwM6<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(LwM6;LwM6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LwM6<",
            "TT;>;",
            "LwM6<",
            "TT;>;)V"
        }
    .end annotation

    invoke-static {p1}, LpL6;->j(Ljava/lang/Object;)V

    check-cast p0, LqM6;

    iget-object v0, p0, LqM6;->a:LwM6;

    if-nez v0, :cond_0

    iput-object p1, p0, LqM6;->a:LwM6;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LqM6;->a:LwM6;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
