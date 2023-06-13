.class public final LxK2$y;
.super LxK2$d;
.source "SourceFile"

# interfaces
.implements LxK2$A;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "y"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxK2$y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LxK2$d<",
        "TK;TV;",
        "LxK2$y<",
        "TK;TV;>;>;",
        "LxK2$A<",
        "TK;TV;",
        "LxK2$y<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public volatile c:LxK2$B;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LxK2$B<",
            "TK;TV;",
            "LxK2$y<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;TK;I",
            "LxK2$y<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, LxK2$d;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$i;)V

    invoke-static {}, LxK2;->l()LxK2$B;

    move-result-object p1

    iput-object p1, p0, LxK2$y;->c:LxK2$B;

    return-void
.end method


# virtual methods
.method public b()LxK2$B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LxK2$B<",
            "TK;TV;",
            "LxK2$y<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LxK2$y;->c:LxK2$B;

    return-object v0
.end method

.method public d(Ljava/lang/ref/ReferenceQueue;Ljava/lang/ref/ReferenceQueue;LxK2$y;)LxK2$y;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;",
            "LxK2$y<",
            "TK;TV;>;)",
            "LxK2$y<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$y;

    invoke-virtual {p0}, LxK2$d;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, LxK2$d;->a:I

    invoke-direct {v0, p1, v1, v2, p3}, LxK2$y;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$y;)V

    iget-object p1, p0, LxK2$y;->c:LxK2$B;

    invoke-interface {p1, p2, v0}, LxK2$B;->a(Ljava/lang/ref/ReferenceQueue;LxK2$i;)LxK2$B;

    move-result-object p1

    iput-object p1, v0, LxK2$y;->c:LxK2$B;

    return-object v0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, LxK2$y;->c:LxK2$B;

    new-instance v1, LxK2$C;

    invoke-direct {v1, p2, p1, p0}, LxK2$C;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;LxK2$i;)V

    iput-object v1, p0, LxK2$y;->c:LxK2$B;

    invoke-interface {v0}, LxK2$B;->clear()V

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, LxK2$y;->c:LxK2$B;

    invoke-interface {v0}, LxK2$B;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
