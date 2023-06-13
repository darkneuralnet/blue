.class public final Lco/bird/android/widget/actions/BirdActionsView$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/actions/BirdActionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/widget/actions/BirdActionsView;

.field public final synthetic c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/actions/BirdActionsView;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/actions/BirdActionsView$h;->b:Lco/bird/android/widget/actions/BirdActionsView;

    iput-object p2, p0, Lco/bird/android/widget/actions/BirdActionsView$h;->c:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/actions/BirdActionsView$h;->b:Lco/bird/android/widget/actions/BirdActionsView;

    iget-object v1, p0, Lco/bird/android/widget/actions/BirdActionsView$h;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/widget/actions/BirdActionsView;->access$setWakeDelayTimeLeft(Lco/bird/android/widget/actions/BirdActionsView;Ljava/lang/Integer;)V

    return-void
.end method
