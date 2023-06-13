.class public final LYf5$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYf5;->L(Lio/reactivex/F;Landroid/widget/ImageView;Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/LocalAsset;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/LocalAsset;",
        "kotlin.jvm.PlatformType",
        "localAsset",
        "",
        "a",
        "(Lco/bird/android/model/LocalAsset;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, LYf5$i;->g:Landroid/widget/ImageView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/LocalAsset;)V
    .locals 2

    iget-object v0, p0, LYf5$i;->g:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {v0, p1}, LUI4;->i(Ljava/io/File;)LrI4;

    move-result-object p1

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    sget-object v1, LB41;->b:LB41;

    invoke-virtual {v0, v1}, LLD;->k(LB41;)LLD;

    move-result-object v0

    invoke-virtual {p1, v0}, LrI4;->G0(LLD;)LrI4;

    move-result-object p1

    iget-object v0, p0, LYf5$i;->g:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/LocalAsset;

    invoke-virtual {p0, p1}, LYf5$i;->a(Lco/bird/android/model/LocalAsset;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
