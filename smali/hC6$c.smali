.class public LhC6$c;
.super LhC6$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LhC6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LhC6$b;-><init>(Landroid/view/Window;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public c(Z)V
    .locals 1

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    const/high16 p1, 0x8000000

    invoke-virtual {p0, p1}, LhC6$a;->m(I)V

    const/high16 p1, -0x80000000

    invoke-virtual {p0, p1}, LhC6$a;->j(I)V

    invoke-virtual {p0, v0}, LhC6$a;->i(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LhC6$a;->l(I)V

    :goto_0
    return-void
.end method
