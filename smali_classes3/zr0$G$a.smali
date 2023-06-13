.class public final Lzr0$G$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr0$G;->b(Lga2;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "repoData",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/android/model/persistence/ComplaintResolution;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lga2;

.field public final synthetic h:Lzr0;


# direct methods
.method public constructor <init>(Lga2;Lzr0;)V
    .locals 0

    iput-object p1, p0, Lzr0$G$a;->g:Lga2;

    iput-object p2, p0, Lzr0$G$a;->h:Lzr0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/android/model/persistence/ComplaintResolution;
    .locals 2

    const-string v0, "repoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ComplaintResolution;->getSituation()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lzr0$G$a;->g:Lga2;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lco/bird/android/model/persistence/ComplaintResolution;->Companion:Lco/bird/android/model/persistence/ComplaintResolution$Companion;

    iget-object v0, p0, Lzr0$G$a;->h:Lzr0;

    invoke-static {v0}, Lzr0;->access$getComplaintIds$p(Lzr0;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lzr0$G$a;->g:Lga2;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lco/bird/android/model/persistence/ComplaintResolution$Companion;->create(Ljava/util/List;Ljava/lang/String;)Lco/bird/android/model/persistence/ComplaintResolution;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ComplaintResolution;

    invoke-virtual {p0, p1}, Lzr0$G$a;->a(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/android/model/persistence/ComplaintResolution;

    move-result-object p1

    return-object p1
.end method
