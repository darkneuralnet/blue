.class public final LBW2$b;
.super LTO1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBW2;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Lq72;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "BW2$b",
        "LTO1$a;",
        "",
        "",
        "tables",
        "",
        "G",
        "([Ljava/lang/String;)V",
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
.field public final synthetic a:LBW2;


# direct methods
.method public constructor <init>(LBW2;)V
    .locals 0

    iput-object p1, p0, LBW2$b;->a:LBW2;

    invoke-direct {p0}, LTO1$a;-><init>()V

    return-void
.end method

.method public static synthetic d5(LBW2;[Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LBW2$b;->e5(LBW2;[Ljava/lang/String;)V

    return-void
.end method

.method public static final e5(LBW2;[Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LBW2;->e()Lq72;

    move-result-object p0

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lq72;->m([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public G([Ljava/lang/String;)V
    .locals 3

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LBW2$b;->a:LBW2;

    invoke-virtual {v0}, LBW2;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, LBW2$b;->a:LBW2;

    new-instance v2, LCW2;

    invoke-direct {v2, v1, p1}, LCW2;-><init>(LBW2;[Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
