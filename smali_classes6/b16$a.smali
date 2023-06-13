.class public Lb16$a;
.super LP06;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb16;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb16;


# direct methods
.method public constructor <init>(Lb16;)V
    .locals 0

    iput-object p1, p0, Lb16$a;->a:Lb16;

    invoke-direct {p0}, LP06;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object p1, p0, Lb16$a;->a:Lb16;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lb16;->a(Lb16;Z)Z

    iget-object p1, p0, Lb16$a;->a:Lb16;

    invoke-static {p1}, Lb16;->b(Lb16;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb16$b;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lb16$b;->a()V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 0

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lb16$a;->a:Lb16;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lb16;->a(Lb16;Z)Z

    iget-object p1, p0, Lb16$a;->a:Lb16;

    invoke-static {p1}, Lb16;->b(Lb16;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb16$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lb16$b;->a()V

    :cond_1
    return-void
.end method
