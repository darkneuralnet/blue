.class public LDd1$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj1$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDd1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luj1$d<",
        "LFd1<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:LDd1$b;


# direct methods
.method public constructor <init>(LDd1$b;)V
    .locals 0

    iput-object p1, p0, LDd1$b$a;->a:LDd1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LFd1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LFd1<",
            "*>;"
        }
    .end annotation

    new-instance v8, LFd1;

    iget-object v0, p0, LDd1$b$a;->a:LDd1$b;

    iget-object v1, v0, LDd1$b;->a:LKC1;

    iget-object v2, v0, LDd1$b;->b:LKC1;

    iget-object v3, v0, LDd1$b;->c:LKC1;

    iget-object v4, v0, LDd1$b;->d:LKC1;

    iget-object v5, v0, LDd1$b;->e:LGd1;

    iget-object v6, v0, LDd1$b;->f:LJd1$a;

    iget-object v7, v0, LDd1$b;->g:LgY3;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LFd1;-><init>(LKC1;LKC1;LKC1;LKC1;LGd1;LJd1$a;LgY3;)V

    return-object v8
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDd1$b$a;->a()LFd1;

    move-result-object v0

    return-object v0
.end method
