.class public final LxK2$x;
.super LxK2$n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "x"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LxK2$n<",
        "TK;TV;",
        "LxK2$w<",
        "TK;TV;>;",
        "LxK2$x<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final i:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LxK2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxK2<",
            "TK;TV;",
            "LxK2$w<",
            "TK;TV;>;",
            "LxK2$x<",
            "TK;TV;>;>;II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, LxK2$n;-><init>(LxK2;II)V

    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, LxK2$x;->i:Ljava/lang/ref/ReferenceQueue;

    return-void
.end method

.method public static synthetic H(LxK2$x;)Ljava/lang/ref/ReferenceQueue;
    .locals 0

    iget-object p0, p0, LxK2$x;->i:Ljava/lang/ref/ReferenceQueue;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic D()LxK2$n;
    .locals 1

    invoke-virtual {p0}, LxK2$x;->I()LxK2$x;

    move-result-object v0

    return-object v0
.end method

.method public I()LxK2$x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LxK2$x<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, LxK2$x;->i:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, LxK2$n;->b(Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, LxK2$x;->i:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, LxK2$n;->e(Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method
