.class public abstract Lco/bird/android/widget/scan/GraphicOverlay$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/scan/GraphicOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/widget/scan/GraphicOverlay$a;",
        "",
        "Landroid/graphics/Canvas;",
        "canvas",
        "",
        "a",
        "b",
        "Lco/bird/android/widget/scan/GraphicOverlay;",
        "Lco/bird/android/widget/scan/GraphicOverlay;",
        "overlay",
        "<init>",
        "(Lco/bird/android/widget/scan/GraphicOverlay;)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/widget/scan/GraphicOverlay;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/scan/GraphicOverlay;)V
    .locals 1

    const-string v0, "overlay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/scan/GraphicOverlay$a;->a:Lco/bird/android/widget/scan/GraphicOverlay;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/graphics/Canvas;)V
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/scan/GraphicOverlay$a;->a:Lco/bird/android/widget/scan/GraphicOverlay;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
