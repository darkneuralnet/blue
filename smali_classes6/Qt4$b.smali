.class public final LQt4$b;
.super LbZ1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQt4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "LbZ1<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final transient d:LXY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LXY1<",
            "TK;*>;"
        }
    .end annotation
.end field

.field public final transient e:LVY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVY1<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LXY1;LVY1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXY1<",
            "TK;*>;",
            "LVY1<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LbZ1;-><init>()V

    iput-object p1, p0, LQt4$b;->d:LXY1;

    iput-object p2, p0, LQt4$b;->e:LVY1;

    return-void
.end method


# virtual methods
.method public a()LVY1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LVY1<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, LQt4$b;->e:LVY1;

    return-object v0
.end method

.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LQt4$b;->a()LVY1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LVY1;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LQt4$b;->d:LXY1;

    invoke-virtual {v0, p1}, LXY1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LQt4$b;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public j()Lre6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lre6<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, LQt4$b;->a()LVY1;

    move-result-object v0

    invoke-virtual {v0}, LVY1;->j()Lre6;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LQt4$b;->d:LXY1;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
