.class public final LM75$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM75;->Bl(Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/e;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/e;",
        "emitter",
        "",
        "a",
        "(Lio/reactivex/e;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LM75;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LM75;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LM75$e;->g:LM75;

    iput-object p2, p0, LM75$e;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/e;)V
    .locals 3

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM75$e;->g:LM75;

    invoke-virtual {v0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->v(Landroidx/fragment/app/FragmentActivity;)LUI4;

    move-result-object v0

    iget-object v1, p0, LM75$e;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object v0

    iget-object v1, p0, LM75$e;->g:LM75;

    const/4 v2, 0x0

    invoke-static {v1, v2}, LM75;->access$requestOptions(LM75;I)LYI4;

    move-result-object v1

    invoke-virtual {v0, v1}, LrI4;->G0(LLD;)LrI4;

    move-result-object v0

    new-instance v1, LM75$e$a;

    invoke-direct {v1, p1}, LM75$e$a;-><init>(Lio/reactivex/e;)V

    invoke-virtual {v0, v1}, LrI4;->T0(LTI4;)LrI4;

    move-result-object p1

    iget-object v0, p0, LM75$e;->g:LM75;

    invoke-static {v0}, LM75;->access$getBinding$p(LM75;)LR5;

    move-result-object v0

    iget-object v0, v0, LR5;->m:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    iget-object p1, p0, LM75$e;->g:LM75;

    invoke-static {p1}, LM75;->access$getBinding$p(LM75;)LR5;

    move-result-object p1

    iget-object p1, p1, LR5;->m:Landroid/widget/ImageView;

    const-string v0, "binding.imageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/e;

    invoke-virtual {p0, p1}, LM75$e;->a(Lio/reactivex/e;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
