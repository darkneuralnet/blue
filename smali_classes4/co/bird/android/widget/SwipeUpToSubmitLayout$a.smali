.class public final Lco/bird/android/widget/SwipeUpToSubmitLayout$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/SwipeUpToSubmitLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "b",
        "()Ljava/lang/Float;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/SwipeUpToSubmitLayout;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/SwipeUpToSubmitLayout;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout$a;->g:Lco/bird/android/widget/SwipeUpToSubmitLayout;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/SwipeUpToSubmitLayout$a;->g:Lco/bird/android/widget/SwipeUpToSubmitLayout;

    sget v1, LYf4;->swipe_up_to_submit_content_elevation_normal:I

    invoke-static {v0, v1}, Ltu6;->k(Landroid/view/View;I)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/SwipeUpToSubmitLayout$a;->b()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
