.class public final Lco/bird/android/feature/ar/resolution/VpsResolveActivity$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/ar/resolution/VpsResolveActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZ84<",
        "Lco/bird/android/buava/Optional<",
        "Lcom/google/ar/core/Session;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "Lcom/google/ar/core/Session;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()LZ84;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/ar/resolution/VpsResolveActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$k;->g:Lco/bird/android/feature/ar/resolution/VpsResolveActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lcom/google/ar/core/Session;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$k;->g:Lco/bird/android/feature/ar/resolution/VpsResolveActivity;

    invoke-static {v0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->access$getVpsView$p(Lco/bird/android/feature/ar/resolution/VpsResolveActivity;)Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "vpsView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/feature/ar/view/VpsView;->X0()LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$k;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method
