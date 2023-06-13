.class public final LLu1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLu1;->Tl()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/y<",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/y;",
        "",
        "emitter",
        "",
        "b",
        "(Lio/reactivex/y;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLu1;


# direct methods
.method public constructor <init>(LLu1;)V
    .locals 0

    iput-object p1, p0, LLu1$a;->g:LLu1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LLu1;Lio/reactivex/y;)V
    .locals 0

    invoke-static {p0, p1}, LLu1$a;->c(LLu1;Lio/reactivex/y;)V

    return-void
.end method

.method public static final c(LLu1;Lio/reactivex/y;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LLu1;->access$getFragmentManager$p(LLu1;)Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->t0()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    invoke-static {p0}, LLu1;->access$getFragmentManager$p(LLu1;)Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->s0(I)Landroidx/fragment/app/FragmentManager$j;

    move-result-object p0

    invoke-interface {p0}, Landroidx/fragment/app/FragmentManager$j;->getName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-interface {p1, p0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/y;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLu1$a;->g:LLu1;

    invoke-static {v0}, LLu1;->access$getFragmentManager$p(LLu1;)Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, LLu1$a;->g:LLu1;

    new-instance v2, LKu1;

    invoke-direct {v2, v1, p1}, LKu1;-><init>(LLu1;Lio/reactivex/y;)V

    invoke-virtual {v0, v2}, Landroidx/fragment/app/FragmentManager;->l(Landroidx/fragment/app/FragmentManager$n;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/y;

    invoke-virtual {p0, p1}, LLu1$a;->b(Lio/reactivex/y;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
