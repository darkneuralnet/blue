.class public final LxK2$z;
.super LxK2$n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxK2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "z"
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
        "LxK2$y<",
        "TK;TV;>;",
        "LxK2$z<",
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

.field public final j:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;"
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
            "LxK2$y<",
            "TK;TV;>;",
            "LxK2$z<",
            "TK;TV;>;>;II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, LxK2$n;-><init>(LxK2;II)V

    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, LxK2$z;->i:Ljava/lang/ref/ReferenceQueue;

    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, LxK2$z;->j:Ljava/lang/ref/ReferenceQueue;

    return-void
.end method

.method public static synthetic H(LxK2$z;)Ljava/lang/ref/ReferenceQueue;
    .locals 0

    iget-object p0, p0, LxK2$z;->i:Ljava/lang/ref/ReferenceQueue;

    return-object p0
.end method

.method public static synthetic I(LxK2$z;)Ljava/lang/ref/ReferenceQueue;
    .locals 0

    iget-object p0, p0, LxK2$z;->j:Ljava/lang/ref/ReferenceQueue;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic D()LxK2$n;
    .locals 1

    invoke-virtual {p0}, LxK2$z;->J()LxK2$z;

    move-result-object v0

    return-object v0
.end method

.method public J()LxK2$z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LxK2$z<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, LxK2$z;->i:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, LxK2$n;->b(Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, LxK2$z;->i:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, LxK2$n;->e(Ljava/lang/ref/ReferenceQueue;)V

    iget-object v0, p0, LxK2$z;->j:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p0, v0}, LxK2$n;->f(Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method
