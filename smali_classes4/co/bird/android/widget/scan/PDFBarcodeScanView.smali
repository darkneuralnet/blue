.class public final Lco/bird/android/widget/scan/PDFBarcodeScanView;
.super Lco/bird/android/widget/scan/BarcodeScanView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u001b\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\n\u0010\u000eB#\u0008\u0016\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\n\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/widget/scan/PDFBarcodeScanView;",
        "Lco/bird/android/widget/scan/BarcodeScanView;",
        "LPx;",
        "l",
        "LPx;",
        "w",
        "()LPx;",
        "analyzer",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
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
.field public final l:LPx;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/widget/scan/BarcodeScanView;-><init>(Landroid/content/Context;)V

    new-instance p1, LPx;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/16 v2, 0x800

    aput v2, v0, v1

    invoke-direct {p1, v0}, LPx;-><init>([I)V

    iput-object p1, p0, Lco/bird/android/widget/scan/PDFBarcodeScanView;->l:LPx;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/bird/android/widget/scan/BarcodeScanView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, LPx;

    const/4 p2, 0x1

    new-array p2, p2, [I

    const/4 v0, 0x0

    const/16 v1, 0x800

    aput v1, p2, v0

    invoke-direct {p1, p2}, LPx;-><init>([I)V

    iput-object p1, p0, Lco/bird/android/widget/scan/PDFBarcodeScanView;->l:LPx;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/widget/scan/BarcodeScanView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, LPx;

    const/4 p2, 0x1

    new-array p2, p2, [I

    const/4 p3, 0x0

    const/16 v0, 0x800

    aput v0, p2, p3

    invoke-direct {p1, p2}, LPx;-><init>([I)V

    iput-object p1, p0, Lco/bird/android/widget/scan/PDFBarcodeScanView;->l:LPx;

    return-void
.end method


# virtual methods
.method public w()LPx;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/scan/PDFBarcodeScanView;->l:LPx;

    return-object v0
.end method
