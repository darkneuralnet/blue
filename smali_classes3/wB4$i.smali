.class public final LwB4$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwB4;->a(Lco/bird/android/model/wire/WireBird;)V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "e",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LwB4;


# direct methods
.method public constructor <init>(LwB4;)V
    .locals 0

    iput-object p1, p0, LwB4$i;->g:LwB4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LwB4$i;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Lco/bird/api/exception/HttpException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LwB4$i;->g:LwB4;

    invoke-static {v0}, LwB4;->access$getUi$p(LwB4;)LzB4;

    move-result-object v0

    invoke-interface {v0, p1}, LaM5;->error(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LwB4$i;->g:LwB4;

    invoke-static {v0}, LwB4;->access$getUi$p(LwB4;)LzB4;

    move-result-object v0

    sget v1, Lnl4;->error_generic_body:I

    invoke-interface {v0, v1}, LaM5;->error(I)V

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    :goto_0
    iget-object p1, p0, LwB4$i;->g:LwB4;

    invoke-static {p1}, LwB4;->access$getUi$p(LwB4;)LzB4;

    move-result-object p1

    invoke-interface {p1}, LH31;->dismissDialog()V

    return-void
.end method