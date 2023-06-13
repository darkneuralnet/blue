.class public final Lbb2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbb2;->a:Landroid/widget/ImageView;

    iput-object p2, p0, Lbb2;->b:Landroid/widget/ImageView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lbb2;
    .locals 1

    if-eqz p0, :cond_0

    check-cast p0, Landroid/widget/ImageView;

    new-instance v0, Lbb2;

    invoke-direct {v0, p0, p0}, Lbb2;-><init>(Landroid/widget/ImageView;Landroid/widget/ImageView;)V

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

    iget-object v0, p0, Lbb2;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lbb2;->b()Landroid/widget/ImageView;

    move-result-object v0

    return-object v0
.end method
