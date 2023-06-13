.class public final LKe2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/EditText;

.field public final b:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKe2;->a:Landroid/widget/EditText;

    iput-object p2, p0, LKe2;->b:Landroid/widget/EditText;

    return-void
.end method

.method public static a(Landroid/view/View;)LKe2;
    .locals 1

    if-eqz p0, :cond_0

    check-cast p0, Landroid/widget/EditText;

    new-instance v0, LKe2;

    invoke-direct {v0, p0, p0}, LKe2;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, LKe2;->a:Landroid/widget/EditText;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LKe2;->b()Landroid/widget/EditText;

    move-result-object v0

    return-object v0
.end method
