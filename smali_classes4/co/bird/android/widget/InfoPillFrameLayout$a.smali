.class public final Lco/bird/android/widget/InfoPillFrameLayout$a;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/InfoPillFrameLayout;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "co/bird/android/widget/InfoPillFrameLayout$a",
        "Landroid/view/ViewOutlineProvider;",
        "Landroid/view/View;",
        "view",
        "Landroid/graphics/Outline;",
        "outline",
        "",
        "getOutline",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInfoPillFrameLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoPillFrameLayout.kt\nco/bird/android/widget/InfoPillFrameLayout$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lco/bird/android/widget/InfoPillFrameLayout;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/InfoPillFrameLayout;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/InfoPillFrameLayout$a;->a:Lco/bird/android/widget/InfoPillFrameLayout;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/InfoPillFrameLayout$a;->a:Lco/bird/android/widget/InfoPillFrameLayout;

    invoke-static {p1}, Lco/bird/android/widget/InfoPillFrameLayout;->access$getInfoPillDrawable$p(Lco/bird/android/widget/InfoPillFrameLayout;)LQ12;

    move-result-object p1

    invoke-virtual {p1, p2}, LQ12;->getOutline(Landroid/graphics/Outline;)V

    :cond_0
    return-void
.end method
