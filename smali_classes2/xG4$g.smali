.class public final LxG4$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LxG4;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "error",
        "",
        "a",
        "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LxG4;


# direct methods
.method public constructor <init>(LxG4;)V
    .locals 0

    iput-object p1, p0, LxG4$g;->g:LxG4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LxG4$a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LxG4$g;->g:LxG4;

    invoke-static {v0}, LxG4;->access$getUi$p(LxG4;)LzG4;

    move-result-object v0

    check-cast p1, LxG4$a;

    invoke-virtual {p1}, LxG4$a;->a()I

    move-result p1

    invoke-interface {v0, p1}, LaM5;->error(I)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lco/bird/api/error/RetrofitException;

    if-eqz v0, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    instance-of p1, p1, Ljava/io/IOException;

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p0, LxG4$g;->g:LxG4;

    invoke-static {p1}, LxG4;->access$getUi$p(LxG4;)LzG4;

    move-result-object p1

    sget v0, Lnl4;->error_network:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LxG4$g;->a(Ljava/lang/Throwable;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
