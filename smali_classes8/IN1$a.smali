.class public final LIN1$a;
.super LIN1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIN1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "LIN1<",
        "TResponseT;TReturnT;>;"
    }
.end annotation


# instance fields
.field public final d:Ly80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly80<",
            "TResponseT;TReturnT;>;"
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
            "TResponseT;TReturnT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, LIN1;-><init>(LKI4;Lokhttp3/Call$Factory;LsB0;)V

    iput-object p4, p0, LIN1$a;->d:Ly80;

    return-void
.end method


# virtual methods
.method public c(Lx80;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    iget-object p2, p0, LIN1$a;->d:Ly80;

    invoke-interface {p2, p1}, Ly80;->b(Lx80;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
