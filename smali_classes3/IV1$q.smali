.class public final LIV1$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIV1;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lkotlin/Pair<",
        "+",
        "Landroid/net/Uri;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;+",
        "Lco/bird/android/model/RequirementsResult;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012J\u0010\u0002\u001aF\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0004\u0012\u0004\u0012\u00020\u0007 \u0008*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00030\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "Landroid/net/Uri;",
        "",
        "Lco/bird/android/model/RequirementsResult;",
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
.field public final synthetic g:LIV1;


# direct methods
.method public constructor <init>(LIV1;)V
    .locals 0

    iput-object p1, p0, LIV1$q;->g:LIV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LIV1$q;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Lkotlin/Pair<",
            "Landroid/net/Uri;",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Lco/bird/android/model/RequirementsResult;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/RequirementsResult;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, LIV1$q;->g:LIV1;

    invoke-static {v2}, LIV1;->access$getUi$p(LIV1;)LTV1;

    move-result-object v2

    invoke-virtual {v2, v0}, LTV1;->Ul(Landroid/net/Uri;)V

    iget-object v2, p0, LIV1$q;->g:LIV1;

    invoke-static {v2}, LIV1;->access$getUi$p(LIV1;)LTV1;

    move-result-object v2

    const-string v3, "descriptor"

    if-eqz v0, :cond_2

    iget-object v0, p0, LIV1$q;->g:LIV1;

    invoke-static {v0}, LIV1;->access$getDescriptor$p(LIV1;)Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v1, v4

    :goto_1
    invoke-static {v0, v1, p1}, LIV1;->access$getConfirmInstructions(LIV1;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/RequirementsResult;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_2
    iget-object v0, p0, LIV1$q;->g:LIV1;

    invoke-static {v0}, LIV1;->access$getDescriptor$p(LIV1;)Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    move-object v1, v4

    :goto_2
    invoke-static {v0, v1}, LIV1;->access$getInstructions(LIV1;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v2, v0}, LTV1;->am(Ljava/lang/String;)V

    iget-object v0, p0, LIV1$q;->g:LIV1;

    invoke-static {v0}, LIV1;->access$getUi$p(LIV1;)LTV1;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/RequirementsResult;->isSatisfied()Z

    move-result p1

    invoke-virtual {v0, p1}, LTV1;->Yl(Z)V

    return-void
.end method
