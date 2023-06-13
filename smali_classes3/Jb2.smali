.class public final LJb2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lco/bird/android/widget/EditTextBox;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/EditTextBox;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJb2;->a:Lco/bird/android/widget/EditTextBox;

    return-void
.end method

.method public static a(Landroid/view/View;)LJb2;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, LJb2;

    check-cast p0, Lco/bird/android/widget/EditTextBox;

    invoke-direct {v0, p0}, LJb2;-><init>(Lco/bird/android/widget/EditTextBox;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Lco/bird/android/widget/EditTextBox;
    .locals 1

    iget-object v0, p0, LJb2;->a:Lco/bird/android/widget/EditTextBox;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LJb2;->b()Lco/bird/android/widget/EditTextBox;

    move-result-object v0

    return-object v0
.end method
