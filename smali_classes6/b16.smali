.class public Lb16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb16$b;
    }
.end annotation


# instance fields
.field public final a:Landroid/text/TextPaint;

.field public final b:LP06;

.field public c:F

.field public d:Z

.field public e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lb16$b;",
            ">;"
        }
    .end annotation
.end field

.field public f:LN06;


# direct methods
.method public constructor <init>(Lb16$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lb16;->a:Landroid/text/TextPaint;

    new-instance v0, Lb16$a;

    invoke-direct {v0, p0}, Lb16$a;-><init>(Lb16;)V

    iput-object v0, p0, Lb16;->b:LP06;

    iput-boolean v1, p0, Lb16;->d:Z

    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb16;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, p1}, Lb16;->g(Lb16$b;)V

    return-void
.end method

.method public static synthetic a(Lb16;Z)Z
    .locals 0

    iput-boolean p1, p0, Lb16;->d:Z

    return p1
.end method

.method public static synthetic b(Lb16;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lb16;->e:Ljava/lang/ref/WeakReference;

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/CharSequence;)F
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lb16;->a:Landroid/text/TextPaint;

    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result p1

    return p1
.end method

.method public d()LN06;
    .locals 1

    iget-object v0, p0, Lb16;->f:LN06;

    return-object v0
.end method

.method public e()Landroid/text/TextPaint;
    .locals 1

    iget-object v0, p0, Lb16;->a:Landroid/text/TextPaint;

    return-object v0
.end method

.method public f(Ljava/lang/String;)F
    .locals 1

    iget-boolean v0, p0, Lb16;->d:Z

    if-nez v0, :cond_0

    iget p1, p0, Lb16;->c:F

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lb16;->c(Ljava/lang/CharSequence;)F

    move-result p1

    iput p1, p0, Lb16;->c:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb16;->d:Z

    return p1
.end method

.method public g(Lb16$b;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb16;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public h(LN06;Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lb16;->f:LN06;

    if-eq v0, p1, :cond_2

    iput-object p1, p0, Lb16;->f:LN06;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lb16;->a:Landroid/text/TextPaint;

    iget-object v1, p0, Lb16;->b:LP06;

    invoke-virtual {p1, p2, v0, v1}, LN06;->o(Landroid/content/Context;Landroid/text/TextPaint;LP06;)V

    iget-object v0, p0, Lb16;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb16$b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb16;->a:Landroid/text/TextPaint;

    invoke-interface {v0}, Lb16$b;->getState()[I

    move-result-object v0

    iput-object v0, v1, Landroid/text/TextPaint;->drawableState:[I

    :cond_0
    iget-object v0, p0, Lb16;->a:Landroid/text/TextPaint;

    iget-object v1, p0, Lb16;->b:LP06;

    invoke-virtual {p1, p2, v0, v1}, LN06;->n(Landroid/content/Context;Landroid/text/TextPaint;LP06;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb16;->d:Z

    :cond_1
    iget-object p1, p0, Lb16;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb16$b;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lb16$b;->a()V

    invoke-interface {p1}, Lb16$b;->getState()[I

    move-result-object p2

    invoke-interface {p1, p2}, Lb16$b;->onStateChange([I)Z

    :cond_2
    return-void
.end method

.method public i(Z)V
    .locals 0

    iput-boolean p1, p0, Lb16;->d:Z

    return-void
.end method

.method public j(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lb16;->f:LN06;

    iget-object v1, p0, Lb16;->a:Landroid/text/TextPaint;

    iget-object v2, p0, Lb16;->b:LP06;

    invoke-virtual {v0, p1, v1, v2}, LN06;->n(Landroid/content/Context;Landroid/text/TextPaint;LP06;)V

    return-void
.end method
