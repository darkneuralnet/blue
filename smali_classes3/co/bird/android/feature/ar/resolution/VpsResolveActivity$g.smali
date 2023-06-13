.class public final Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->h0(LZv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/Config;",
        "Lcom/google/ar/core/Config;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/google/ar/core/Config;",
        "config",
        "a",
        "(Lcom/google/ar/core/Config;)Lcom/google/ar/core/Config;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;

    invoke-direct {v0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;-><init>()V

    sput-object v0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;->g:Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/Config;)Lcom/google/ar/core/Config;
    .locals 3

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Setting VPS AR Core session to geospatialMode enabled"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lcom/google/ar/core/Config$GeospatialMode;->ENABLED:Lcom/google/ar/core/Config$GeospatialMode;

    invoke-virtual {p1, v1}, Lcom/google/ar/core/Config;->setGeospatialMode(Lcom/google/ar/core/Config$GeospatialMode;)Lcom/google/ar/core/Config;

    sget-object v1, Lcom/google/ar/core/Config$FocusMode;->AUTO:Lcom/google/ar/core/Config$FocusMode;

    invoke-virtual {p1, v1}, Lcom/google/ar/core/Config;->setFocusMode(Lcom/google/ar/core/Config$FocusMode;)Lcom/google/ar/core/Config;

    sget-object v1, Lcom/google/ar/core/Config$PlaneFindingMode;->HORIZONTAL_AND_VERTICAL:Lcom/google/ar/core/Config$PlaneFindingMode;

    invoke-virtual {p1, v1}, Lcom/google/ar/core/Config;->setPlaneFindingMode(Lcom/google/ar/core/Config$PlaneFindingMode;)Lcom/google/ar/core/Config;

    const-string v1, "Set VPS AR Core session to geospatialMode enabled"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/Config;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$g;->a(Lcom/google/ar/core/Config;)Lcom/google/ar/core/Config;

    move-result-object p1

    return-object p1
.end method
