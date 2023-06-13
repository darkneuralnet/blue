.class public final Lcom/chuckerteam/chucker/internal/ui/MainActivity$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/chuckerteam/chucker/internal/ui/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        "kotlin.jvm.PlatformType",
        "transactionTuples",
        "",
        "invoke",
        "(Ljava/util/List;)V",
        "<anonymous>"
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
        "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity$onCreate$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,249:1\n254#2,2:250\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity$onCreate$3\n*L\n95#1:250,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lcom/chuckerteam/chucker/internal/ui/MainActivity;


# direct methods
.method public constructor <init>(Lcom/chuckerteam/chucker/internal/ui/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$d;->g:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/chuckerteam/chucker/internal/ui/MainActivity$d;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/chuckerteam/chucker/internal/data/entity/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$d;->g:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    invoke-static {v0}, Lcom/chuckerteam/chucker/internal/ui/MainActivity;->D(Lcom/chuckerteam/chucker/internal/ui/MainActivity;)Lt66;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "transactionsAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/o;->submitList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/ui/MainActivity$d;->g:Lcom/chuckerteam/chucker/internal/ui/MainActivity;

    invoke-static {v0}, Lcom/chuckerteam/chucker/internal/ui/MainActivity;->C(Lcom/chuckerteam/chucker/internal/ui/MainActivity;)Lkj0;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "mainBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v0, v1, Lkj0;->f:Landroidx/constraintlayout/widget/Group;

    const-string v1, "mainBinding.tutorialGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const/16 p1, 0x8

    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
