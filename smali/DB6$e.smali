.class public LDB6$e;
.super LDB6$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LDB6$d;-><init>()V

    return-void
.end method

.method public constructor <init>(LDB6;)V
    .locals 0

    invoke-direct {p0, p1}, LDB6$d;-><init>(LDB6;)V

    return-void
.end method


# virtual methods
.method public c(ILD32;)V
    .locals 1

    iget-object v0, p0, LDB6$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LDB6$n;->a(I)I

    move-result p1

    invoke-virtual {p2}, LD32;->e()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LNB6;->a(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
