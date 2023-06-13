.class public Lcom/google/protobuf/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/z$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/protobuf/z$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$a<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/protobuf/P$b;Ljava/lang/Object;Lcom/google/protobuf/P$b;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/P$b;",
            "TK;",
            "Lcom/google/protobuf/P$b;",
            "TV;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/protobuf/z$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/P$b;Ljava/lang/Object;Lcom/google/protobuf/P$b;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/protobuf/z;->a:Lcom/google/protobuf/z$a;

    iput-object p2, p0, Lcom/google/protobuf/z;->b:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/protobuf/z;->c:Ljava/lang/Object;

    return-void
.end method

.method public static b(Lcom/google/protobuf/z$a;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/z$a<",
            "TK;TV;>;TK;TV;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/z$a;->a:Lcom/google/protobuf/P$b;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/google/protobuf/o;->d(Lcom/google/protobuf/P$b;ILjava/lang/Object;)I

    move-result p1

    iget-object p0, p0, Lcom/google/protobuf/z$a;->c:Lcom/google/protobuf/P$b;

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Lcom/google/protobuf/o;->d(Lcom/google/protobuf/P$b;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method public static d(Lcom/google/protobuf/P$b;Ljava/lang/Object;Lcom/google/protobuf/P$b;Ljava/lang/Object;)Lcom/google/protobuf/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/P$b;",
            "TK;",
            "Lcom/google/protobuf/P$b;",
            "TV;)",
            "Lcom/google/protobuf/z<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/protobuf/z;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/protobuf/z;-><init>(Lcom/google/protobuf/P$b;Ljava/lang/Object;Lcom/google/protobuf/P$b;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/z$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/CodedOutputStream;",
            "Lcom/google/protobuf/z$a<",
            "TK;TV;>;TK;TV;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p1, Lcom/google/protobuf/z$a;->a:Lcom/google/protobuf/P$b;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, Lcom/google/protobuf/o;->A(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/P$b;ILjava/lang/Object;)V

    iget-object p1, p1, Lcom/google/protobuf/z$a;->c:Lcom/google/protobuf/P$b;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/o;->A(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/P$b;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITK;TV;)I"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/protobuf/CodedOutputStream;->T(I)I

    move-result p1

    iget-object v0, p0, Lcom/google/protobuf/z;->a:Lcom/google/protobuf/z$a;

    invoke-static {v0, p2, p3}, Lcom/google/protobuf/z;->b(Lcom/google/protobuf/z$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Lcom/google/protobuf/CodedOutputStream;->C(I)I

    move-result p2

    add-int/2addr p1, p2

    return p1
.end method

.method public c()Lcom/google/protobuf/z$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/z$a<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/z;->a:Lcom/google/protobuf/z$a;

    return-object v0
.end method
