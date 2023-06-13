.class public final LXA6$c;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXA6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u000c\u001a\u0006\u0012\u0002\u0008\u00030\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000f"
    }
    d2 = {
        "LXA6$c;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "LPA6;",
        "b",
        "LPA6;",
        "errorResponse",
        "",
        "getMessage",
        "()Ljava/lang/String;",
        "message",
        "LHM4;",
        "response",
        "<init>",
        "(LXA6;LHM4;)V",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LPA6;

.field public final synthetic c:LXA6;


# direct methods
.method public constructor <init>(LXA6;LHM4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LXA6$c;->c:LXA6;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    invoke-static {p1, p2}, LXA6;->access$getWhitelistErrorBody(LXA6;LHM4;)LPA6;

    move-result-object p1

    iput-object p1, p0, LXA6$c;->b:LPA6;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LXA6$c;->b:LPA6;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LPA6;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
