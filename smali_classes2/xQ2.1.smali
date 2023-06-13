.class public final LxQ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwQ2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "LxQ2;",
        "LwQ2;",
        "Lco/bird/android/model/RideTitle;",
        "title",
        "",
        "quantity",
        "",
        "a",
        "(Lco/bird/android/model/RideTitle;Ljava/lang/Integer;)V",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Landroidx/appcompat/widget/Toolbar;",
        "b",
        "Landroidx/appcompat/widget/Toolbar;",
        "toolbar",
        "Landroid/widget/ImageView;",
        "c",
        "Landroid/widget/ImageView;",
        "actionBarLogo",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroid/widget/ImageView;)V",
        "app_birdRelease"
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
        "SMAP\nMenuUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuUi.kt\nco/bird/android/app/feature/ride/ui/MenuUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroidx/appcompat/widget/Toolbar;

.field public final c:Landroid/widget/ImageView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroid/widget/ImageView;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toolbar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionBarLogo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxQ2;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p2, p0, LxQ2;->b:Landroidx/appcompat/widget/Toolbar;

    iput-object p3, p0, LxQ2;->c:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/model/RideTitle;Ljava/lang/Integer;)V
    .locals 5

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object v2, p0, LxQ2;->a:Lco/bird/android/core/mvp/BaseActivity;

    invoke-virtual {p1}, Lco/bird/android/model/RideTitle;->getText()I

    move-result v3

    new-array v4, v0, [Ljava/lang/Object;

    aput-object p2, v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    iget-object p2, p0, LxQ2;->a:Lco/bird/android/core/mvp/BaseActivity;

    invoke-virtual {p1}, Lco/bird/android/model/RideTitle;->getText()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    const-string p1, "quantity?.let { activity\u2026ity.getString(title.text)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LxQ2;->c:Landroid/widget/ImageView;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object p1, p0, LxQ2;->b:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method
