.class public final Lzr0$H$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr0$H;->c(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "form",
        "Lio/reactivex/K;",
        "",
        "LH6;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lzr0;

.field public final synthetic h:Lco/bird/android/model/persistence/ComplaintResolution;


# direct methods
.method public constructor <init>(Lzr0;Lco/bird/android/model/persistence/ComplaintResolution;)V
    .locals 0

    iput-object p1, p0, Lzr0$H$b;->g:Lzr0;

    iput-object p2, p0, Lzr0$H$b;->h:Lco/bird/android/model/persistence/ComplaintResolution;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "form"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzr0$H$b;->g:Lzr0;

    invoke-static {v0}, Lzr0;->access$getConverter$p(Lzr0;)LIq0;

    move-result-object v0

    iget-object v1, p0, Lzr0$H$b;->h:Lco/bird/android/model/persistence/ComplaintResolution;

    const-string v2, "repoData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, LIq0;->m(Lco/bird/android/model/persistence/ComplaintResolutionForm;Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ComplaintResolutionForm;

    invoke-virtual {p0, p1}, Lzr0$H$b;->a(Lco/bird/android/model/persistence/ComplaintResolutionForm;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
