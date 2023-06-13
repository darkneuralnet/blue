.class public final Lah5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LZg5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbl0;",
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
            "LRg1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRm5;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
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
            "Lbl0;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;",
            "LY94<",
            "LRg1;",
            ">;",
            "LY94<",
            "LRm5;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lah5;->a:LY94;

    iput-object p2, p0, Lah5;->b:LY94;

    iput-object p3, p0, Lah5;->c:LY94;

    iput-object p4, p0, Lah5;->d:LY94;

    iput-object p5, p0, Lah5;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)Lah5;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbl0;",
            ">;",
            "LY94<",
            "Lbl0;",
            ">;",
            "LY94<",
            "LRg1;",
            ">;",
            "LY94<",
            "LRm5;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)",
            "Lah5;"
        }
    .end annotation

    new-instance v6, Lah5;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lah5;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Lbl0;Lbl0;Ljava/lang/Object;Ljava/lang/Object;LY94;)LZg5;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbl0;",
            "Lbl0;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)",
            "LZg5;"
        }
    .end annotation

    new-instance v6, LZg5;

    move-object v3, p2

    check-cast v3, LRg1;

    move-object v4, p3

    check-cast v4, LRm5;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LZg5;-><init>(Lbl0;Lbl0;LRg1;LRm5;LY94;)V

    return-object v6
.end method


# virtual methods
.method public b()LZg5;
    .locals 5

    iget-object v0, p0, Lah5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbl0;

    iget-object v1, p0, Lah5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbl0;

    iget-object v2, p0, Lah5;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lah5;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lah5;->e:LY94;

    invoke-static {v0, v1, v2, v3, v4}, Lah5;->c(Lbl0;Lbl0;Ljava/lang/Object;Ljava/lang/Object;LY94;)LZg5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lah5;->b()LZg5;

    move-result-object v0

    return-object v0
.end method
