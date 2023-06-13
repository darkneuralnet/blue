.class public final LM31;
.super Landroidx/recyclerview/widget/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/h$f<",
        "Lco/bird/android/library/lightbox/LightboxImage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "LM31;",
        "Landroidx/recyclerview/widget/h$f;",
        "Lco/bird/android/library/lightbox/LightboxImage;",
        "oldItem",
        "newItem",
        "",
        "b",
        "a",
        "<init>",
        "()V",
        "lightbox_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LM31;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LM31;

    invoke-direct {v0}, LM31;-><init>()V

    sput-object v0, LM31;->a:LM31;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/h$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/library/lightbox/LightboxImage;Lco/bird/android/library/lightbox/LightboxImage;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/library/lightbox/LightboxImage;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/library/lightbox/LightboxImage;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lco/bird/android/library/lightbox/LightboxImage;

    check-cast p2, Lco/bird/android/library/lightbox/LightboxImage;

    invoke-virtual {p0, p1, p2}, LM31;->a(Lco/bird/android/library/lightbox/LightboxImage;Lco/bird/android/library/lightbox/LightboxImage;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lco/bird/android/library/lightbox/LightboxImage;

    check-cast p2, Lco/bird/android/library/lightbox/LightboxImage;

    invoke-virtual {p0, p1, p2}, LM31;->b(Lco/bird/android/library/lightbox/LightboxImage;Lco/bird/android/library/lightbox/LightboxImage;)Z

    move-result p1

    return p1
.end method

.method public b(Lco/bird/android/library/lightbox/LightboxImage;Lco/bird/android/library/lightbox/LightboxImage;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/library/lightbox/LightboxImage;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/library/lightbox/LightboxImage;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
