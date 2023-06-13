.class public Lzendesk/belvedere/KeyboardHelper$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/KeyboardHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final b:Landroid/app/Activity;

.field public final synthetic c:Lzendesk/belvedere/KeyboardHelper;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/KeyboardHelper;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lzendesk/belvedere/KeyboardHelper$b;->b:Landroid/app/Activity;

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/belvedere/KeyboardHelper;Landroid/app/Activity;Lzendesk/belvedere/KeyboardHelper$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/belvedere/KeyboardHelper$b;-><init>(Lzendesk/belvedere/KeyboardHelper;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper$b;->b:Landroid/app/Activity;

    invoke-static {v0, v1}, Lzendesk/belvedere/KeyboardHelper;->a(Lzendesk/belvedere/KeyboardHelper;Landroid/app/Activity;)I

    move-result v0

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    if-lez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1, v2}, Lzendesk/belvedere/KeyboardHelper;->b(Lzendesk/belvedere/KeyboardHelper;Z)Z

    if-lez v0, :cond_1

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-static {v1}, Lzendesk/belvedere/KeyboardHelper;->c(Lzendesk/belvedere/KeyboardHelper;)I

    move-result v1

    if-eq v1, v0, :cond_1

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-static {v1, v0}, Lzendesk/belvedere/KeyboardHelper;->d(Lzendesk/belvedere/KeyboardHelper;I)I

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-static {v1}, Lzendesk/belvedere/KeyboardHelper;->e(Lzendesk/belvedere/KeyboardHelper;)Lzendesk/belvedere/KeyboardHelper$d;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-static {v1}, Lzendesk/belvedere/KeyboardHelper;->e(Lzendesk/belvedere/KeyboardHelper;)Lzendesk/belvedere/KeyboardHelper$d;

    move-result-object v1

    invoke-interface {v1, v0}, Lzendesk/belvedere/KeyboardHelper$d;->a(I)V

    :cond_1
    iget-object v1, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-static {v1}, Lzendesk/belvedere/KeyboardHelper;->f(Lzendesk/belvedere/KeyboardHelper;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    if-lez v0, :cond_2

    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-static {v0}, Lzendesk/belvedere/KeyboardHelper;->g(Lzendesk/belvedere/KeyboardHelper;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lzendesk/belvedere/KeyboardHelper$b;->c:Lzendesk/belvedere/KeyboardHelper;

    invoke-static {v0}, Lzendesk/belvedere/KeyboardHelper;->h(Lzendesk/belvedere/KeyboardHelper;)V

    :goto_1
    return-void
.end method
