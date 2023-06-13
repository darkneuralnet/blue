.class public final LX96;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR96;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LR96<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LT96;

.field public final b:Ljava/lang/String;

.field public final c:LPc1;

.field public final d:LC96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LC96<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field public final e:LZ96;


# direct methods
.method public constructor <init>(LT96;Ljava/lang/String;LPc1;LC96;LZ96;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LT96;",
            "Ljava/lang/String;",
            "LPc1;",
            "LC96<",
            "TT;[B>;",
            "LZ96;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX96;->a:LT96;

    iput-object p2, p0, LX96;->b:Ljava/lang/String;

    iput-object p3, p0, LX96;->c:LPc1;

    iput-object p4, p0, LX96;->d:LC96;

    iput-object p5, p0, LX96;->e:LZ96;

    return-void
.end method

.method public static synthetic c(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, LX96;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Lyg1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg1<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, LW96;

    invoke-direct {v0}, LW96;-><init>()V

    invoke-virtual {p0, p1, v0}, LX96;->b(Lyg1;Lla6;)V

    return-void
.end method

.method public b(Lyg1;Lla6;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg1<",
            "TT;>;",
            "Lla6;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LX96;->e:LZ96;

    invoke-static {}, LBs5;->a()LBs5$a;

    move-result-object v1

    iget-object v2, p0, LX96;->a:LT96;

    invoke-virtual {v1, v2}, LBs5$a;->e(LT96;)LBs5$a;

    move-result-object v1

    invoke-virtual {v1, p1}, LBs5$a;->c(Lyg1;)LBs5$a;

    move-result-object p1

    iget-object v1, p0, LX96;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, LBs5$a;->f(Ljava/lang/String;)LBs5$a;

    move-result-object p1

    iget-object v1, p0, LX96;->d:LC96;

    invoke-virtual {p1, v1}, LBs5$a;->d(LC96;)LBs5$a;

    move-result-object p1

    iget-object v1, p0, LX96;->c:LPc1;

    invoke-virtual {p1, v1}, LBs5$a;->b(LPc1;)LBs5$a;

    move-result-object p1

    invoke-virtual {p1}, LBs5$a;->a()LBs5;

    move-result-object p1

    invoke-interface {v0, p1, p2}, LZ96;->a(LBs5;Lla6;)V

    return-void
.end method

.method public d()LT96;
    .locals 1

    iget-object v0, p0, LX96;->a:LT96;

    return-object v0
.end method
