.class public final LUS1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUS1;->d(Landroidx/camera/core/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LUS1$c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LUS1$c;",
        "kotlin.jvm.PlatformType",
        "result",
        "",
        "a",
        "(LUS1$c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LUS1;

.field public final synthetic h:Landroidx/camera/core/i;


# direct methods
.method public constructor <init>(LUS1;Landroidx/camera/core/i;)V
    .locals 0

    iput-object p1, p0, LUS1$f;->g:LUS1;

    iput-object p2, p0, LUS1$f;->h:Landroidx/camera/core/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LUS1$c;)V
    .locals 6

    iget-object v0, p0, LUS1$f;->g:LUS1;

    invoke-static {v0}, LUS1;->access$getSatisfiesRequirementsPredicate$p(LUS1;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "result"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RequirementsResult;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/RequirementsResult;->isSatisfied()Z

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-eqz v4, :cond_2

    const-string v3, "satisfiesRequirementsPredicate met, attempting to parse bitmap"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v3, p0, LUS1$f;->h:Landroidx/camera/core/i;

    const/16 v4, 0x5a

    const/16 v5, 0x10

    invoke-static {v3, v1, v4, v5}, LlU;->a(Landroidx/camera/core/i;Landroid/graphics/Rect;II)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v3, p0, LUS1$f;->g:LUS1;

    invoke-static {v3}, LUS1;->access$getValidScanResults$p(LUS1;)Lma4;

    move-result-object v3

    new-instance v4, Lkotlin/Triple;

    invoke-direct {v4, p1, v0, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lma4;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string v0, "exception while parsing bitmap in identification analyzer, ignoring: "

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUS1$c;

    invoke-virtual {p0, p1}, LUS1$f;->a(LUS1$c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
