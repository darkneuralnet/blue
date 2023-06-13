.class public LXs5;
.super LCB;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LCB<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LzM2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzM2<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LCB;-><init>()V

    invoke-static {p1}, LSR5;->k(LXr5;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LXs5;->b:Ljava/lang/String;

    return-void
.end method

.method public static b(LzM2;)LzM2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LzM2<",
            "TT;>;)",
            "LzM2<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_1

    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LXs5;

    invoke-direct {v0, p0}, LXs5;-><init>(LzM2;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public a(Lw01;)V
    .locals 1

    iget-object v0, p0, LXs5;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Lw01;->a(Ljava/lang/String;)Lw01;

    return-void
.end method
