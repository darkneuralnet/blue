.class public final LIV1$p$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIV1$p;->e(Lco/bird/android/buava/Optional;)Lio/reactivex/K;
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
        "Lco/bird/android/model/RequirementsResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LUS1$c;",
        "result",
        "Lco/bird/android/model/RequirementsResult;",
        "a",
        "(LUS1$c;)Lco/bird/android/model/RequirementsResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIV1;


# direct methods
.method public constructor <init>(LIV1;)V
    .locals 0

    iput-object p1, p0, LIV1$p$b;->g:LIV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LUS1$c;)Lco/bird/android/model/RequirementsResult;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIV1$p$b;->g:LIV1;

    invoke-static {v0}, LIV1;->access$getDescriptor$p(LIV1;)Lco/bird/android/model/identification/IdentificationDocumentDescriptor;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "descriptor"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, LIV1$p$b;->g:LIV1;

    invoke-static {v1}, LIV1;->access$getReactiveConfig$p(LIV1;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getIdentificationConfig()Lco/bird/android/model/wire/configs/IdentificationConfig;

    move-result-object v1

    invoke-static {p1, v0, v1}, LJi1;->f(LUS1$c;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/RequirementsResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUS1$c;

    invoke-virtual {p0, p1}, LIV1$p$b;->a(LUS1$c;)Lco/bird/android/model/RequirementsResult;

    move-result-object p1

    return-object p1
.end method
