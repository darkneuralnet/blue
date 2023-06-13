.class public LDB6$k;
.super LDB6$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# static fields
.field public static final q:LDB6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LVB6;->a()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, LDB6;->y(Landroid/view/WindowInsets;)LDB6;

    move-result-object v0

    sput-object v0, LDB6$k;->q:LDB6;

    return-void
.end method

.method public constructor <init>(LDB6;LDB6$k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$j;-><init>(LDB6;LDB6$j;)V

    return-void
.end method

.method public constructor <init>(LDB6;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDB6$j;-><init>(LDB6;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public g(I)LD32;
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LDB6$n;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LXB6;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, LD32;->d(Landroid/graphics/Insets;)LD32;

    move-result-object p1

    return-object p1
.end method

.method public h(I)LD32;
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LDB6$n;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LWB6;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, LD32;->d(Landroid/graphics/Insets;)LD32;

    move-result-object p1

    return-object p1
.end method

.method public q(I)Z
    .locals 1

    iget-object v0, p0, LDB6$g;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LDB6$n;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LUB6;->a(Landroid/view/WindowInsets;I)Z

    move-result p1

    return p1
.end method
