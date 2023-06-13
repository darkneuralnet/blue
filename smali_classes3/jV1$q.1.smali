.class public final LjV1$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwb4<",
        "+",
        "LZV1;",
        "+",
        "Ljava/util/Locale;",
        "+",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/identification/IdentificationDebugResponse;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u000b\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u0002* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\u00080\u00082J\u0010\u0007\u001aF\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "Lwb4;",
        "LZV1;",
        "kotlin.jvm.PlatformType",
        "Ljava/util/Locale;",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/identification/IdentificationDebugResponse;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "",
        "LH6;",
        "a",
        "(Lwb4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LjV1;


# direct methods
.method public constructor <init>(LjV1;)V
    .locals 0

    iput-object p1, p0, LjV1$q;->g:LjV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwb4;)Lio/reactivex/K;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "LZV1;",
            "Ljava/util/Locale;",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/identification/IdentificationDebugResponse;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LZV1;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Locale;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LZV1;->b()Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    const-string v5, "currentLocale.country"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LjV1;->m:LjV1$a;

    invoke-virtual {v5}, LjV1$a;->a()Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v0, v1, v5}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->allowedDocumentTypes(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    move-object v6, v0

    iget-object v0, p0, LjV1$q;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getConverter$p(LjV1;)LfT1;

    move-result-object v1

    const-string v0, "identificationStatusState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentLocale"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentDocumentType"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lco/bird/android/model/identification/IdentificationDebugResponse;

    invoke-virtual/range {v1 .. v6}, LfT1;->b(LZV1;Ljava/util/Locale;Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationDebugResponse;Ljava/util/Set;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, LjV1$q;->a(Lwb4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
