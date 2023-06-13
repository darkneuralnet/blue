.class public final LYY1$h;
.super LQY1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LQY1<",
        "TV;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field public final transient c:LYY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYY1<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYY1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYY1<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LQY1;-><init>()V

    iput-object p1, p0, LYY1$h;->c:LYY1;

    return-void
.end method


# virtual methods
.method public b([Ljava/lang/Object;I)I
    .locals 2

    iget-object v0, p0, LYY1$h;->c:LYY1;

    iget-object v0, v0, LYY1;->g:LXY1;

    invoke-virtual {v0}, LXY1;->i()LQY1;

    move-result-object v0

    invoke-virtual {v0}, LQY1;->j()Lre6;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQY1;

    invoke-virtual {v1, p1, p2}, LQY1;->b([Ljava/lang/Object;I)I

    move-result p2

    goto :goto_0

    :cond_0
    return p2
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYY1$h;->c:LYY1;

    invoke-virtual {v0, p1}, LYY1;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LYY1$h;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public j()Lre6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYY1$h;->c:LYY1;

    invoke-virtual {v0}, LYY1;->y()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LYY1$h;->c:LYY1;

    invoke-virtual {v0}, LYY1;->size()I

    move-result v0

    return v0
.end method
