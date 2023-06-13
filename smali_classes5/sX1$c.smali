.class public final LsX1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LsX1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0017\u0010\u0015R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0012\u001a\u0004\u0008\u0003\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "LsX1$c;",
        "",
        "LCG6$b;",
        "a",
        "LCG6$b;",
        "b",
        "()LCG6$b;",
        "f",
        "(LCG6$b;)V",
        "workItem",
        "",
        "Z",
        "c",
        "()Z",
        "d",
        "(Z)V",
        "isCancelled",
        "LNX1;",
        "LNX1;",
        "()LNX1;",
        "e",
        "(LNX1;)V",
        "request",
        "<init>",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public a:LCG6$b;

.field public b:Z

.field public c:LNX1;


# direct methods
.method public constructor <init>(LNX1;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsX1$c;->c:LNX1;

    return-void
.end method


# virtual methods
.method public final a()LNX1;
    .locals 1

    iget-object v0, p0, LsX1$c;->c:LNX1;

    return-object v0
.end method

.method public final b()LCG6$b;
    .locals 1

    iget-object v0, p0, LsX1$c;->a:LCG6$b;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LsX1$c;->b:Z

    return v0
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, LsX1$c;->b:Z

    return-void
.end method

.method public final e(LNX1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LsX1$c;->c:LNX1;

    return-void
.end method

.method public final f(LCG6$b;)V
    .locals 0

    iput-object p1, p0, LsX1$c;->a:LCG6$b;

    return-void
.end method
