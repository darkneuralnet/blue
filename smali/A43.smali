.class public final LA43;
.super LsM5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001e\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\t\u001a\u00020\u0004H\u0016J\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0010\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001a\u00a8\u0006\'"
    }
    d2 = {
        "LA43;",
        "LsM5;",
        "Lkotlin/Function1;",
        "",
        "",
        "readObserver",
        "B",
        "n",
        "()V",
        "d",
        "LFP5;",
        "state",
        "",
        "A",
        "(LFP5;)Ljava/lang/Void;",
        "snapshot",
        "z",
        "(LsM5;)Ljava/lang/Void;",
        "y",
        "g",
        "LsM5;",
        "getParent",
        "()LsM5;",
        "parent",
        "h",
        "Lkotlin/jvm/functions/Function1;",
        "()Lkotlin/jvm/functions/Function1;",
        "",
        "i",
        "()Z",
        "readOnly",
        "j",
        "writeObserver",
        "",
        "id",
        "LvM5;",
        "invalid",
        "<init>",
        "(ILvM5;Lkotlin/jvm/functions/Function1;LsM5;)V",
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
.field public final g:LsM5;

.field public final h:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILvM5;Lkotlin/jvm/functions/Function1;LsM5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LvM5;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;",
            "LsM5;",
            ")V"
        }
    .end annotation

    const-string v0, "invalid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LsM5;-><init>(ILvM5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p4, p0, LA43;->g:LsM5;

    invoke-virtual {p4, p0}, LsM5;->l(LsM5;)V

    if-eqz p3, :cond_0

    invoke-virtual {p4}, LsM5;->h()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, LA43$a;

    invoke-direct {p2, p3, p1}, LA43$a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    move-object p3, p2

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, LsM5;->h()Lkotlin/jvm/functions/Function1;

    move-result-object p3

    :cond_1
    :goto_0
    iput-object p3, p0, LA43;->h:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public A(LFP5;)Ljava/lang/Void;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LxM5;->q()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public B(Lkotlin/jvm/functions/Function1;)LA43;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)",
            "LA43;"
        }
    .end annotation

    new-instance v0, LA43;

    invoke-virtual {p0}, LsM5;->f()I

    move-result v1

    invoke-virtual {p0}, LsM5;->g()LvM5;

    move-result-object v2

    iget-object v3, p0, LA43;->g:LsM5;

    invoke-direct {v0, v1, v2, p1, v3}, LA43;-><init>(ILvM5;Lkotlin/jvm/functions/Function1;LsM5;)V

    return-object v0
.end method

.method public d()V
    .locals 2

    invoke-virtual {p0}, LsM5;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LsM5;->f()I

    move-result v0

    iget-object v1, p0, LA43;->g:LsM5;

    invoke-virtual {v1}, LsM5;->f()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LsM5;->b()V

    :cond_0
    iget-object v0, p0, LA43;->g:LsM5;

    invoke-virtual {v0, p0}, LsM5;->m(LsM5;)V

    invoke-super {p0}, LsM5;->d()V

    :cond_1
    return-void
.end method

.method public h()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LA43;->h:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic l(LsM5;)V
    .locals 0

    invoke-virtual {p0, p1}, LA43;->y(LsM5;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic m(LsM5;)V
    .locals 0

    invoke-virtual {p0, p1}, LA43;->z(LsM5;)Ljava/lang/Void;

    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method

.method public bridge synthetic o(LFP5;)V
    .locals 0

    invoke-virtual {p0, p1}, LA43;->A(LFP5;)Ljava/lang/Void;

    return-void
.end method

.method public bridge synthetic v(Lkotlin/jvm/functions/Function1;)LsM5;
    .locals 0

    invoke-virtual {p0, p1}, LA43;->B(Lkotlin/jvm/functions/Function1;)LA43;

    move-result-object p1

    return-object p1
.end method

.method public y(LsM5;)Ljava/lang/Void;
    .locals 1

    const-string v0, "snapshot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LPM5;->b()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public z(LsM5;)Ljava/lang/Void;
    .locals 1

    const-string v0, "snapshot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LPM5;->b()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method
