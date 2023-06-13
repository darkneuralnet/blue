.class public final Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/renderer/RichLayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0014\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;",
        "",
        "",
        "zIndex",
        "",
        "top",
        "bottom",
        "left",
        "right",
        "padding",
        "Lco/bird/android/app/feature/map/renderer/RichLayer;",
        "build",
        "Landroid/view/View;",
        "view",
        "Landroid/view/View;",
        "LcD1;",
        "map",
        "LcD1;",
        "F",
        "paddingLeft",
        "I",
        "paddingTop",
        "paddingRight",
        "paddingBottom",
        "<init>",
        "(Landroid/view/View;LcD1;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final map:LcD1;

.field private paddingBottom:I

.field private paddingLeft:I

.field private paddingRight:I

.field private paddingTop:I

.field private final view:Landroid/view/View;

.field private zIndex:F


# direct methods
.method public constructor <init>(Landroid/view/View;LcD1;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->view:Landroid/view/View;

    iput-object p2, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->map:LcD1;

    return-void
.end method


# virtual methods
.method public final build()Lco/bird/android/app/feature/map/renderer/RichLayer;
    .locals 10

    new-instance v9, Lco/bird/android/app/feature/map/renderer/RichLayer;

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->view:Landroid/view/View;

    iget-object v2, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->map:LcD1;

    iget v3, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->zIndex:F

    iget v4, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingLeft:I

    iget v5, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingTop:I

    iget v6, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingRight:I

    iget v7, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingBottom:I

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lco/bird/android/app/feature/map/renderer/RichLayer;-><init>(Landroid/view/View;LcD1;FIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public final padding(IIII)Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;
    .locals 0

    iput p1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingTop:I

    iput p2, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingBottom:I

    iput p3, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingLeft:I

    iput p4, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->paddingRight:I

    return-object p0
.end method

.method public final zIndex(F)Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;
    .locals 0

    iput p1, p0, Lco/bird/android/app/feature/map/renderer/RichLayer$Builder;->zIndex:F

    return-object p0
.end method
