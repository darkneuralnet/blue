.class public final LJ14$h$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ14$h;->a(LJ14$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lco/bird/api/response/ReloadOption;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lco/bird/api/response/ReloadOption;",
        "b",
        "()Lco/bird/api/response/ReloadOption;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPreloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4$option$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,489:1\n288#2,2:490\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPresenter$consume$4$option$2\n*L\n144#1:490,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LJ14;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:I


# direct methods
.method public constructor <init>(LJ14;Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJ14;",
            "Ljava/util/List<",
            "Lco/bird/api/response/ReloadOption;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, LJ14$h$a;->g:LJ14;

    iput-object p2, p0, LJ14$h$a;->h:Ljava/util/List;

    iput p3, p0, LJ14$h$a;->i:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lco/bird/api/response/ReloadOption;
    .locals 4

    iget-object v0, p0, LJ14$h$a;->g:LJ14;

    invoke-static {v0}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->n0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LJ14$h$a;->h:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/api/response/ReloadOption;

    invoke-virtual {v3}, Lco/bird/api/response/ReloadOption;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lco/bird/api/response/ReloadOption;

    if-nez v2, :cond_3

    :cond_2
    iget-object v0, p0, LJ14$h$a;->h:Ljava/util/List;

    iget v1, p0, LJ14$h$a;->i:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lco/bird/api/response/ReloadOption;

    :cond_3
    return-object v2
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ14$h$a;->b()Lco/bird/api/response/ReloadOption;

    move-result-object v0

    return-object v0
.end method
