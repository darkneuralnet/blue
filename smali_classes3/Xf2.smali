.class public final LXf2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/Button;

.field public final b:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXf2;->a:Landroid/widget/Button;

    iput-object p2, p0, LXf2;->b:Landroid/widget/Button;

    return-void
.end method

.method public static a(Landroid/view/View;)LXf2;
    .locals 1

    if-eqz p0, :cond_0

    check-cast p0, Landroid/widget/Button;

    new-instance v0, LXf2;

    invoke-direct {v0, p0, p0}, LXf2;-><init>(Landroid/widget/Button;Landroid/widget/Button;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, LXf2;->a:Landroid/widget/Button;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LXf2;->b()Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method
