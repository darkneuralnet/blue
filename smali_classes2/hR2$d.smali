.class public final LhR2$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LhR2;->a(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LhR2;


# direct methods
.method public constructor <init>(LhR2;)V
    .locals 0

    iput-object p1, p0, LhR2$d;->g:LhR2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, LhR2$d;->g:LhR2;

    invoke-static {p1}, LhR2;->access$getUi$p(LhR2;)LvR2;

    move-result-object p1

    sget v0, Lnl4;->merchant_location_edit_success:I

    invoke-virtual {p1, v0}, LXC;->success(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, LHM4;->e()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LhR2$d;->g:LhR2;

    invoke-static {v0}, LhR2;->access$getUi$p(LhR2;)LvR2;

    move-result-object v0

    invoke-virtual {v0, p1}, LXC;->error(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    iget-object p1, p0, LhR2$d;->g:LhR2;

    invoke-static {p1}, LhR2;->access$getUi$p(LhR2;)LvR2;

    move-result-object p1

    sget v0, Lnl4;->error_generic_body:I

    invoke-virtual {p1, v0}, LXC;->error(I)V

    :cond_2
    :goto_1
    iget-object p1, p0, LhR2$d;->g:LhR2;

    invoke-static {p1}, LhR2;->access$getUi$p(LhR2;)LvR2;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LvR2;->enableDoneButton(Z)V

    iget-object p1, p0, LhR2$d;->g:LhR2;

    invoke-static {p1}, LhR2;->access$getUi$p(LhR2;)LvR2;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LhR2$d;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
