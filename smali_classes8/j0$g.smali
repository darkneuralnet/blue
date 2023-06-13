.class public final Lj0$g;
.super Lbx2$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lbx2$d<",
        "Lxs5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0004\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\u0008\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0013"
    }
    d2 = {
        "Lj0$g;",
        "E",
        "Lbx2$d;",
        "Lxs5;",
        "Lkotlinx/coroutines/internal/RemoveFirstDesc;",
        "Lbx2;",
        "affected",
        "",
        "e",
        "Lbx2$c;",
        "Lkotlinx/coroutines/internal/PrepareOp;",
        "prepareOp",
        "j",
        "",
        "k",
        "LZw2;",
        "queue",
        "<init>",
        "(LZw2;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(LZw2;)V
    .locals 0

    invoke-direct {p0, p1}, Lbx2$d;-><init>(Lbx2;)V

    return-void
.end method


# virtual methods
.method public e(Lbx2;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LCl0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lxs5;

    if-nez p1, :cond_1

    sget-object p1, Lk0;->d:LuX5;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public j(Lbx2$c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p1, Lbx2$c;->a:Lbx2;

    check-cast v0, Lxs5;

    invoke-virtual {v0, p1}, Lxs5;->T(Lbx2$c;)LuX5;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lcx2;->a:Ljava/lang/Object;

    return-object p1

    :cond_0
    sget-object v0, Lqp;->b:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public k(Lbx2;)V
    .locals 0

    check-cast p1, Lxs5;

    invoke-virtual {p1}, Lxs5;->U()V

    return-void
.end method
