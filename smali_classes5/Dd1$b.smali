.class public LDd1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:LKC1;

.field public final b:LKC1;

.field public final c:LKC1;

.field public final d:LKC1;

.field public final e:LGd1;

.field public final f:LJd1$a;

.field public final g:LgY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgY3<",
            "LFd1<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LKC1;LKC1;LKC1;LKC1;LGd1;LJd1$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LDd1$b$a;

    invoke-direct {v0, p0}, LDd1$b$a;-><init>(LDd1$b;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, Luj1;->d(ILuj1$d;)LgY3;

    move-result-object v0

    iput-object v0, p0, LDd1$b;->g:LgY3;

    iput-object p1, p0, LDd1$b;->a:LKC1;

    iput-object p2, p0, LDd1$b;->b:LKC1;

    iput-object p3, p0, LDd1$b;->c:LKC1;

    iput-object p4, p0, LDd1$b;->d:LKC1;

    iput-object p5, p0, LDd1$b;->e:LGd1;

    iput-object p6, p0, LDd1$b;->f:LJd1$a;

    return-void
.end method


# virtual methods
.method public a(Lak2;ZZZZ)LFd1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lak2;",
            "ZZZZ)",
            "LFd1<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, LDd1$b;->g:LgY3;

    invoke-interface {v0}, LgY3;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFd1;

    invoke-static {v0}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LFd1;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, LFd1;->l(Lak2;ZZZZ)LFd1;

    move-result-object p1

    return-object p1
.end method
