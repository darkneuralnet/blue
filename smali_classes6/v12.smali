.class public abstract Lv12;
.super LbZ1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LbZ1<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LbZ1;-><init>()V

    return-void
.end method


# virtual methods
.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LbZ1;->a()LVY1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LVY1;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public abstract get(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lv12;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public j()Lre6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, LbZ1;->a()LVY1;

    move-result-object v0

    invoke-virtual {v0}, LVY1;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public y()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lv12$a;

    invoke-direct {v0, p0}, Lv12$a;-><init>(Lv12;)V

    return-object v0
.end method
