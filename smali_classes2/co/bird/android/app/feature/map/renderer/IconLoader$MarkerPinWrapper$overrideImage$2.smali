.class final Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$overrideImage$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;-><init>(Landroid/content/Context;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/widget/ImageView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Landroid/widget/ImageView;",
        "invoke"
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$overrideImage$2;->this$0:Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/widget/ImageView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$overrideImage$2;->this$0:Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, LAh4;->overrideImage:I

    invoke-static {v0, v1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$overrideImage$2;->invoke()Landroid/widget/ImageView;

    move-result-object v0

    return-object v0
.end method
