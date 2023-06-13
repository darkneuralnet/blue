.class public interface abstract Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;",
        "T",
        "",
        "marker",
        "Landroid/graphics/PointF;",
        "anchorPoint",
        "(Ljava/lang/Object;)Landroid/graphics/PointF;",
        "",
        "withIcon",
        "LPT;",
        "bitmapDescriptor",
        "(Ljava/lang/Object;Z)LPT;",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract anchorPoint(Ljava/lang/Object;)Landroid/graphics/PointF;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroid/graphics/PointF;"
        }
    .end annotation
.end method

.method public abstract bitmapDescriptor(Ljava/lang/Object;Z)LPT;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)",
            "LPT;"
        }
    .end annotation
.end method
