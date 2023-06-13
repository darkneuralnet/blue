.class public final Lgt6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgt6;->a:Landroid/view/View;

    return-void
.end method

.method public static a(Landroid/view/View;)Lgt6;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lgt6;

    invoke-direct {v0, p0}, Lgt6;-><init>(Landroid/view/View;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lgt6;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lcj4;->view_repair_damage:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lgt6;->a(Landroid/view/View;)Lgt6;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lgt6;->a:Landroid/view/View;

    return-object v0
.end method
