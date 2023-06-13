.class public final LxK2$w;
.super LxK2$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "w"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LxK2$w$a;
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
        "LxK2$w<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public volatile c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;TK;I",
            "LxK2$w<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, LxK2$d;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, LxK2$w;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/ref/ReferenceQueue;LxK2$w;)LxK2$w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;",
            "LxK2$w<",
            "TK;TV;>;)",
            "LxK2$w<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LxK2$w;

    invoke-virtual {p0}, LxK2$d;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, LxK2$d;->a:I

    invoke-direct {v0, p1, v1, v2, p2}, LxK2$w;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILxK2$w;)V

    iget-object p1, p0, LxK2$w;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, LxK2$w;->e(Ljava/lang/Object;)V

    return-object v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iput-object p1, p0, LxK2$w;->c:Ljava/lang/Object;

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, LxK2$w;->c:Ljava/lang/Object;

    return-object v0
.end method
