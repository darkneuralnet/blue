.class public final LIa6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LNa6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LHa6;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LHa6;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHa6;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIa6;->a:LHa6;

    iput-object p2, p0, LIa6;->b:LY94;

    iput-object p3, p0, LIa6;->c:LY94;

    return-void
.end method

.method public static a(LHa6;LY94;LY94;)LIa6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHa6;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LIa6;"
        }
    .end annotation

    new-instance v0, LIa6;

    invoke-direct {v0, p0, p1, p2}, LIa6;-><init>(LHa6;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LHa6;Le13;LTq4;)LNa6;
    .locals 0

    invoke-virtual {p0, p1, p2}, LHa6;->a(Le13;LTq4;)LNa6;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LNa6;

    return-object p0
.end method


# virtual methods
.method public b()LNa6;
    .locals 3

    iget-object v0, p0, LIa6;->a:LHa6;

    iget-object v1, p0, LIa6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LIa6;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTq4;

    invoke-static {v0, v1, v2}, LIa6;->c(LHa6;Le13;LTq4;)LNa6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIa6;->b()LNa6;

    move-result-object v0

    return-object v0
.end method
