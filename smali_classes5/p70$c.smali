.class public Lp70$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIS0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp70;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LIS0<",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final b:[B

.field public final c:Lp70$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70$b<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([BLp70$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lp70$b<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp70$c;->b:[B

    iput-object p2, p0, Lp70$c;->c:Lp70$b;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TData;>;"
        }
    .end annotation

    iget-object v0, p0, Lp70$c;->c:Lp70$b;

    invoke-interface {v0}, Lp70$b;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public b()LZS0;
    .locals 1

    sget-object v0, LZS0;->b:LZS0;

    return-object v0
.end method

.method public cancel()V
    .locals 0

    return-void
.end method

.method public cleanup()V
    .locals 0

    return-void
.end method

.method public e(LP24;LIS0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP24;",
            "LIS0$a<",
            "-TData;>;)V"
        }
    .end annotation

    iget-object p1, p0, Lp70$c;->c:Lp70$b;

    iget-object v0, p0, Lp70$c;->b:[B

    invoke-interface {p1, v0}, Lp70$b;->b([B)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, LIS0$a;->c(Ljava/lang/Object;)V

    return-void
.end method
