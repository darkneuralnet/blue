.class public final LWv6$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/ArCoreApk$Availability;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lcom/google/ar/core/ArCoreApk$Availability;",
        "it",
        "Lio/reactivex/B;",
        "Lco/bird/android/buava/Optional;",
        "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lcom/google/ar/core/ArCoreApk$Availability;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LYv6;


# direct methods
.method public constructor <init>(LYv6;)V
    .locals 0

    iput-object p1, p0, LWv6$v;->g:LYv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/ArCoreApk$Availability;)Lio/reactivex/B;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/ar/core/ArCoreApk$Availability;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/ArCoreApk$InstallStatus;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LWv6$v;->g:LYv6;

    invoke-interface {p1}, LYv6;->getArCoreInstallStatus()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-virtual {p0, p1}, LWv6$v;->a(Lcom/google/ar/core/ArCoreApk$Availability;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
