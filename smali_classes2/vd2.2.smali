.class public final Lvd2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/appcompat/widget/AppCompatCheckBox;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatCheckBox;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd2;->a:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-void
.end method

.method public static a(Landroid/view/View;)Lvd2;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lvd2;

    check-cast p0, Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-direct {v0, p0}, Lvd2;-><init>(Landroidx/appcompat/widget/AppCompatCheckBox;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 1

    iget-object v0, p0, Lvd2;->a:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lvd2;->b()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v0

    return-object v0
.end method
