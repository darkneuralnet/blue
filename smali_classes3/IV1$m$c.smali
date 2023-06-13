.class public final LIV1$m$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIV1$m;->d(Ljava/lang/Boolean;)Lio/reactivex/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "LUS1$c;",
        "+",
        "Lco/bird/android/model/RequirementsResult;",
        "+",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "LUS1$c;",
        "Lco/bird/android/model/RequirementsResult;",
        "Landroid/graphics/Bitmap;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "Landroid/net/Uri;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Triple;)Lio/reactivex/K;"
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

    iput-object p1, p0, LIV1$m$c;->g:LIV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Lio/reactivex/K;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "LUS1$c;",
            "Lco/bird/android/model/RequirementsResult;",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/graphics/Bitmap;

    iget-object p1, p0, LIV1$m$c;->g:LIV1;

    invoke-static {p1}, LIV1;->access$isAutoDetecting$p(LIV1;)La94;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, LIV1$m$c;->g:LIV1;

    invoke-static {p1}, LIV1;->access$getUi$p(LIV1;)LTV1;

    move-result-object v0

    iget-object p1, p0, LIV1$m$c;->g:LIV1;

    invoke-static {p1}, LIV1;->access$getIdentificationManager$p(LIV1;)LmT1;

    move-result-object p1

    invoke-interface {p1}, LmT1;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "cap"

    const-string v4, ".jpg"

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, LTV1;->saveBitmapToFile$default(LTV1;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LIV1$m$c;->a(Lkotlin/Triple;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
