.class public LN06$a;
.super LuM4$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN06;->g(Landroid/content/Context;LP06;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LP06;

.field public final synthetic b:LN06;


# direct methods
.method public constructor <init>(LN06;LP06;)V
    .locals 0

    iput-object p1, p0, LN06$a;->b:LN06;

    iput-object p2, p0, LN06$a;->a:LP06;

    invoke-direct {p0}, LuM4$e;-><init>()V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 2

    iget-object v0, p0, LN06$a;->b:LN06;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LN06;->c(LN06;Z)Z

    iget-object v0, p0, LN06$a;->a:LP06;

    invoke-virtual {v0, p1}, LP06;->a(I)V

    return-void
.end method

.method public i(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, LN06$a;->b:LN06;

    iget v1, v0, LN06;->e:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, LN06;->b(LN06;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, LN06$a;->b:LN06;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LN06;->c(LN06;Z)Z

    iget-object p1, p0, LN06$a;->a:LP06;

    iget-object v0, p0, LN06$a;->b:LN06;

    invoke-static {v0}, LN06;->a(LN06;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LP06;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
