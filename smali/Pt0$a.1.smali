.class public final LPt0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPv4;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPt0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000c\u001a\u00060\u0006R\u00020\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\u000c\u001a\u00060\u0006R\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "LPt0$a;",
        "LPv4;",
        "",
        "onRemembered",
        "onAbandoned",
        "onForgotten",
        "LPt0$b;",
        "LPt0;",
        "b",
        "LPt0$b;",
        "a",
        "()LPt0$b;",
        "ref",
        "<init>",
        "(LPt0$b;)V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LPt0$b;


# direct methods
.method public constructor <init>(LPt0$b;)V
    .locals 1

    const-string v0, "ref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPt0$a;->b:LPt0$b;

    return-void
.end method


# virtual methods
.method public final a()LPt0$b;
    .locals 1

    iget-object v0, p0, LPt0$a;->b:LPt0$b;

    return-object v0
.end method

.method public onAbandoned()V
    .locals 1

    iget-object v0, p0, LPt0$a;->b:LPt0$b;

    invoke-virtual {v0}, LPt0$b;->q()V

    return-void
.end method

.method public onForgotten()V
    .locals 1

    iget-object v0, p0, LPt0$a;->b:LPt0$b;

    invoke-virtual {v0}, LPt0$b;->q()V

    return-void
.end method

.method public onRemembered()V
    .locals 0

    return-void
.end method
