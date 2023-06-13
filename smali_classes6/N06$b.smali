.class public LN06$b;
.super LP06;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN06;->h(Landroid/content/Context;Landroid/text/TextPaint;LP06;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:LP06;

.field public final synthetic d:LN06;


# direct methods
.method public constructor <init>(LN06;Landroid/content/Context;Landroid/text/TextPaint;LP06;)V
    .locals 0

    iput-object p1, p0, LN06$b;->d:LN06;

    iput-object p2, p0, LN06$b;->a:Landroid/content/Context;

    iput-object p3, p0, LN06$b;->b:Landroid/text/TextPaint;

    iput-object p4, p0, LN06$b;->c:LP06;

    invoke-direct {p0}, LP06;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, LN06$b;->c:LP06;

    invoke-virtual {v0, p1}, LP06;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, LN06$b;->d:LN06;

    iget-object v1, p0, LN06$b;->a:Landroid/content/Context;

    iget-object v2, p0, LN06$b;->b:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, v2, p1}, LN06;->p(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, LN06$b;->c:LP06;

    invoke-virtual {v0, p1, p2}, LP06;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
