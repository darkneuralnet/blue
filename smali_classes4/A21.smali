.class public final LA21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lz21;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ll21;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ll21;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA21;->a:LY94;

    iput-object p2, p0, LA21;->b:LY94;

    iput-object p3, p0, LA21;->c:LY94;

    iput-object p4, p0, LA21;->d:LY94;

    iput-object p5, p0, LA21;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LA21;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Ll21;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "LA21;"
        }
    .end annotation

    new-instance v6, LA21;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LA21;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Lgl;Landroid/content/Context;Ll21;LTq4;LRh6;)Lz21;
    .locals 7

    new-instance v6, Lz21;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lz21;-><init>(Lgl;Landroid/content/Context;Ll21;LTq4;LRh6;)V

    return-object v6
.end method


# virtual methods
.method public b()Lz21;
    .locals 5

    iget-object v0, p0, LA21;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    iget-object v1, p0, LA21;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LA21;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll21;

    iget-object v3, p0, LA21;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    iget-object v4, p0, LA21;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LRh6;

    invoke-static {v0, v1, v2, v3, v4}, LA21;->c(Lgl;Landroid/content/Context;Ll21;LTq4;LRh6;)Lz21;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA21;->b()Lz21;

    move-result-object v0

    return-object v0
.end method
