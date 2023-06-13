.class public final Lk1$b;
.super Lbx2$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1;->d(Lxs5;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "k1$b",
        "Lbx2$b;",
        "Lbx2;",
        "Lkotlinx/coroutines/internal/Node;",
        "affected",
        "",
        "k",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic d:Lk1;


# direct methods
.method public constructor <init>(Lbx2;Lk1;)V
    .locals 0

    iput-object p2, p0, Lk1$b;->d:Lk1;

    invoke-direct {p0, p1}, Lbx2$b;-><init>(Lbx2;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbx2;

    invoke-virtual {p0, p1}, Lk1$b;->k(Lbx2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(Lbx2;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lk1$b;->d:Lk1;

    invoke-virtual {p1}, Lk1;->u()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Lax2;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
