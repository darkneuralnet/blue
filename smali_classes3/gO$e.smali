.class public final LgO$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgO;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "selectedIndex",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Integer;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdPayInputUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPayInputUi.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputUiImpl$selectedTip$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1864#2,3:270\n*S KotlinDebug\n*F\n+ 1 BirdPayInputUi.kt\nco/bird/android/feature/rider/birdpay/input/BirdPayInputUiImpl$selectedTip$2\n*L\n110#1:270,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgO;

.field public final synthetic h:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public constructor <init>(LgO;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    iput-object p1, p0, LgO$e;->g:LgO;

    iput-object p2, p0, LgO$e;->h:Lco/bird/android/core/mvp/BaseActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LgO$e;->invoke(Ljava/lang/Integer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Integer;)V
    .locals 6

    iget-object v0, p0, LgO$e;->g:LgO;

    invoke-static {v0}, LgO;->access$getTipContainers$p(LgO;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LgO$e;->h:Lco/bird/android/core/mvp/BaseActivity;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Landroid/widget/FrameLayout;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    :cond_2
    :goto_1
    if-nez v2, :cond_3

    sget v2, Lhg4;->bg_tip_deselected_left:I

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    :cond_3
    const/4 v5, 0x3

    if-ne v2, v5, :cond_4

    sget v2, Lhg4;->bg_tip_deselected_right:I

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    :cond_4
    sget v2, LDf4;->white:I

    invoke-static {v1, v2}, LfB0;->f(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_2
    move v2, v4

    goto :goto_0

    :cond_5
    return-void
.end method
