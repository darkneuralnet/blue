.class public final Lkb2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb2;->a:Landroid/widget/ImageView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lkb2;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lkb2;

    check-cast p0, Landroid/widget/ImageView;

    invoke-direct {v0, p0}, Lkb2;-><init>(Landroid/widget/ImageView;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lkb2;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lkb2;->b()Landroid/widget/ImageView;

    move-result-object v0

    return-object v0
.end method
