.class public final LZY1$b;
.super Lv12;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv12<",
        "LmX2$a<",
        "TE;>;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field public final synthetic d:LZY1;


# direct methods
.method public constructor <init>(LZY1;)V
    .locals 0

    iput-object p1, p0, LZY1$b;->d:LZY1;

    invoke-direct {p0}, Lv12;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LZY1;LZY1$a;)V
    .locals 0

    invoke-direct {p0, p1}, LZY1$b;-><init>(LZY1;)V

    return-void
.end method


# virtual methods
.method public H(I)LmX2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LmX2$a<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LZY1$b;->d:LZY1;

    invoke-virtual {v0, p1}, LZY1;->v(I)LmX2$a;

    move-result-object p1

    return-object p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LmX2$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, LmX2$a;

    invoke-interface {p1}, LmX2$a;->getCount()I

    move-result v0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LZY1$b;->d:LZY1;

    invoke-interface {p1}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, LmX2;->d3(Ljava/lang/Object;)I

    move-result v0

    invoke-interface {p1}, LmX2$a;->getCount()I

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZY1$b;->H(I)LmX2$a;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, LZY1$b;->d:LZY1;

    invoke-virtual {v0}, LQY1;->h()Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LZY1$b;->d:LZY1;

    invoke-virtual {v0}, LZY1;->hashCode()I

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LZY1$b;->d:LZY1;

    invoke-virtual {v0}, LZY1;->s()LbZ1;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, LZY1$c;

    iget-object v1, p0, LZY1$b;->d:LZY1;

    invoke-direct {v0, v1}, LZY1$c;-><init>(LZY1;)V

    return-object v0
.end method
