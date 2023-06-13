.class public final Ljj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LP10;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljj;->a:Lhj;

    iput-object p2, p0, Ljj;->b:LY94;

    iput-object p3, p0, Ljj;->c:LY94;

    return-void
.end method

.method public static a(Lhj;LOh;Lgl;)LP10;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lhj;->b(LOh;Lgl;)LP10;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP10;

    return-object p0
.end method

.method public static b(Lhj;LY94;LY94;)Ljj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "Ljj;"
        }
    .end annotation

    new-instance v0, Ljj;

    invoke-direct {v0, p0, p1, p2}, Ljj;-><init>(Lhj;LY94;LY94;)V

    return-object v0
.end method


# virtual methods
.method public c()LP10;
    .locals 3

    iget-object v0, p0, Ljj;->a:Lhj;

    iget-object v1, p0, Ljj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LOh;

    iget-object v2, p0, Ljj;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgl;

    invoke-static {v0, v1, v2}, Ljj;->a(Lhj;LOh;Lgl;)LP10;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljj;->c()LP10;

    move-result-object v0

    return-object v0
.end method
