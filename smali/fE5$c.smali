.class public final LfE5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfE5;-><init>(LF96$a;LsP5;LsP5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LF96$b<",
        "LXe1;",
        ">;",
        "Ltm1<",
        "LA52;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LF96$b;",
        "LXe1;",
        "Ltm1;",
        "LA52;",
        "a",
        "(LF96$b;)Ltm1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LfE5;


# direct methods
.method public constructor <init>(LfE5;)V
    .locals 0

    iput-object p1, p0, LfE5$c;->g:LfE5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF96$b;)Ltm1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96$b<",
            "LXe1;",
            ">;)",
            "Ltm1<",
            "LA52;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LXe1;->b:LXe1;

    sget-object v1, LXe1;->c:LXe1;

    invoke-interface {p1, v0, v1}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, LfE5$c;->g:LfE5;

    invoke-virtual {p1}, LfE5;->b()LsP5;

    move-result-object p1

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LdE5;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LdE5;->a()Ltm1;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_0
    invoke-static {}, LYe1;->e()LjO5;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, LXe1;->d:LXe1;

    invoke-interface {p1, v1, v0}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LfE5$c;->g:LfE5;

    invoke-virtual {p1}, LfE5;->g()LsP5;

    move-result-object p1

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LdE5;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LdE5;->a()Ltm1;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_2
    invoke-static {}, LYe1;->e()LjO5;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {}, LYe1;->e()LjO5;

    move-result-object p1

    :cond_4
    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF96$b;

    invoke-virtual {p0, p1}, LfE5$c;->a(LF96$b;)Ltm1;

    move-result-object p1

    return-object p1
.end method
