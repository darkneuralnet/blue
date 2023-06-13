.class public final LKq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnV5$c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0008\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "LKq;",
        "LnV5$c;",
        "LnV5$b;",
        "configuration",
        "LJq;",
        "b",
        "a",
        "LnV5$c;",
        "delegate",
        "LIq;",
        "LIq;",
        "autoCloser",
        "<init>",
        "(LnV5$c;LIq;)V",
        "room-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:LnV5$c;

.field public final b:LIq;


# direct methods
.method public constructor <init>(LnV5$c;LIq;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKq;->a:LnV5$c;

    iput-object p2, p0, LKq;->b:LIq;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LnV5$b;)LnV5;
    .locals 0

    invoke-virtual {p0, p1}, LKq;->b(LnV5$b;)LJq;

    move-result-object p1

    return-object p1
.end method

.method public b(LnV5$b;)LJq;
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJq;

    iget-object v1, p0, LKq;->a:LnV5$c;

    invoke-interface {v1, p1}, LnV5$c;->a(LnV5$b;)LnV5;

    move-result-object p1

    iget-object v1, p0, LKq;->b:LIq;

    invoke-direct {v0, p1, v1}, LJq;-><init>(LnV5;LIq;)V

    return-object v0
.end method
