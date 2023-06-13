.class public LYY1$b;
.super Lre6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYY1;->y()Lre6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lre6<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+",
            "LQY1<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final synthetic d:LYY1;


# direct methods
.method public constructor <init>(LYY1;)V
    .locals 0

    iput-object p1, p0, LYY1$b;->d:LYY1;

    invoke-direct {p0}, Lre6;-><init>()V

    iget-object p1, p1, LYY1;->g:LXY1;

    invoke-virtual {p1}, LXY1;->i()LQY1;

    move-result-object p1

    invoke-virtual {p1}, LQY1;->j()Lre6;

    move-result-object p1

    iput-object p1, p0, LYY1$b;->b:Ljava/util/Iterator;

    invoke-static {}, Lzg2;->g()Lre6;

    move-result-object p1

    iput-object p1, p0, LYY1$b;->c:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LYY1$b;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYY1$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, LYY1$b;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYY1$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQY1;

    invoke-virtual {v0}, LQY1;->j()Lre6;

    move-result-object v0

    iput-object v0, p0, LYY1$b;->c:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, LYY1$b;->c:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
