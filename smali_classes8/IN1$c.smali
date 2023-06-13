.class public final LIN1$c;
.super LIN1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIN1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        ">",
        "LIN1<",
        "TResponseT;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Ly80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly80<",
            "TResponseT;",
            "Lx80<",
            "TResponseT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LKI4;Lokhttp3/Call$Factory;LsB0;Ly80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKI4;",
            "Lokhttp3/Call$Factory;",
            "LsB0<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;",
            "Ly80<",
            "TResponseT;",
            "Lx80<",
            "TResponseT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, LIN1;-><init>(LKI4;Lokhttp3/Call$Factory;LsB0;)V

    iput-object p4, p0, LIN1$c;->d:Ly80;

    return-void
.end method


# virtual methods
.method public c(Lx80;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LIN1$c;->d:Ly80;

    invoke-interface {v0, p1}, Ly80;->b(Lx80;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx80;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Lkotlin/coroutines/Continuation;

    :try_start_0
    invoke-static {p1, p2}, LBl2;->c(Lx80;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1, p2}, LBl2;->d(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
