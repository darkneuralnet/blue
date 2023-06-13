.class public final LEE0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LDE0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbl0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbl0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEE0;->a:LY94;

    iput-object p2, p0, LEE0;->b:LY94;

    iput-object p3, p0, LEE0;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LEE0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;)",
            "LEE0;"
        }
    .end annotation

    new-instance v0, LEE0;

    invoke-direct {v0, p0, p1, p2}, LEE0;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lbl0;Lbl0;)LDE0;
    .locals 1

    new-instance v0, LDE0;

    invoke-direct {v0, p0, p1, p2}, LDE0;-><init>(Landroid/content/Context;Lbl0;Lbl0;)V

    return-object v0
.end method


# virtual methods
.method public b()LDE0;
    .locals 3

    iget-object v0, p0, LEE0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LEE0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbl0;

    iget-object v2, p0, LEE0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbl0;

    invoke-static {v0, v1, v2}, LEE0;->c(Landroid/content/Context;Lbl0;Lbl0;)LDE0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LEE0;->b()LDE0;

    move-result-object v0

    return-object v0
.end method
