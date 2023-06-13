.class public final LGf2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Lco/bird/android/widget/EditTextBox;

.field public final c:Landroid/widget/RadioButton;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Lco/bird/android/widget/EditTextBox;Landroid/widget/RadioButton;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGf2;->a:Landroid/widget/LinearLayout;

    iput-object p2, p0, LGf2;->b:Lco/bird/android/widget/EditTextBox;

    iput-object p3, p0, LGf2;->c:Landroid/widget/RadioButton;

    return-void
.end method

.method public static a(Landroid/view/View;)LGf2;
    .locals 3

    sget v0, Lai4;->notes:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/EditTextBox;

    if-eqz v1, :cond_0

    sget v0, Lai4;->statusName:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    if-eqz v2, :cond_0

    new-instance v0, LGf2;

    check-cast p0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0, v1, v2}, LGf2;-><init>(Landroid/widget/LinearLayout;Lco/bird/android/widget/EditTextBox;Landroid/widget/RadioButton;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public b()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, LGf2;->a:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LGf2;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method
