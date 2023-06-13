.class final Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/renderer/IconLoader;-><init>(Landroid/content/Context;LBK2;LTq4;LOh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Map<",
        "Ljava/lang/Integer;",
        "+",
        "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "",
        "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;",
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
.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/IconLoader;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/IconLoader;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;->this$0:Lco/bird/android/app/feature/map/renderer/IconLoader;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;->invoke()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    sget v1, Lmj4;->marker_bird_riding:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;

    iget-object v4, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;->this$0:Lco/bird/android/app/feature/map/renderer/IconLoader;

    invoke-static {v4}, Lco/bird/android/app/feature/map/renderer/IconLoader;->access$getContext$p(Lco/bird/android/app/feature/map/renderer/IconLoader;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;-><init>(Landroid/content/Context;I)V

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lmj4;->marker_bird_selected:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;

    iget-object v4, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;->this$0:Lco/bird/android/app/feature/map/renderer/IconLoader;

    invoke-static {v4}, Lco/bird/android/app/feature/map/renderer/IconLoader;->access$getContext$p(Lco/bird/android/app/feature/map/renderer/IconLoader;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;-><init>(Landroid/content/Context;I)V

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lmj4;->marker_bird_unselected:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;

    iget-object v4, p0, Lco/bird/android/app/feature/map/renderer/IconLoader$markerPinViews$2;->this$0:Lco/bird/android/app/feature/map/renderer/IconLoader;

    invoke-static {v4}, Lco/bird/android/app/feature/map/renderer/IconLoader;->access$getContext$p(Lco/bird/android/app/feature/map/renderer/IconLoader;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;-><init>(Landroid/content/Context;I)V

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
