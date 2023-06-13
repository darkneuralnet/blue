.class public final LvX1;
.super Landroidx/recyclerview/widget/RecyclerView$D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LvX1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "LvX1;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "Lco/bird/android/library/lightbox/LightboxImage;",
        "item",
        "",
        "a",
        "Landroid/widget/ImageView;",
        "b",
        "Landroid/widget/ImageView;",
        "image",
        "Landroid/widget/TextView;",
        "c",
        "Landroid/widget/TextView;",
        "attribution",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "d",
        "lightbox_release"
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
        "SMAP\nLightboxImageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightboxImageAdapter.kt\nco/bird/android/library/lightbox/ImageHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"
    }
.end annotation


# static fields
.field public static final d:LvX1$a;


# instance fields
.field public final b:Landroid/widget/ImageView;

.field public final c:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LvX1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LvX1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LvX1;->d:LvX1$a;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$D;-><init>(Landroid/view/View;)V

    sget v0, Lpi4;->image:I

    invoke-static {p1, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LvX1;->b:Landroid/widget/ImageView;

    sget v0, Lpi4;->attribution:I

    invoke-static {p1, v0}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, LvX1;->c:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/library/lightbox/LightboxImage;)V
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LvX1;->b:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {v0}, LUI4;->b()LrI4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/library/lightbox/LightboxImage;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LrI4;->a1(Ljava/lang/String;)LrI4;

    move-result-object v0

    invoke-static {}, LjU;->l()LjU;

    move-result-object v1

    invoke-virtual {v0, v1}, LrI4;->g1(LK96;)LrI4;

    move-result-object v0

    iget-object v1, p0, LvX1;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    iget-object v0, p0, LvX1;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/library/lightbox/LightboxImage;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LvX1;->c:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    iget-object v0, p0, LvX1;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/library/lightbox/LightboxImage;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
