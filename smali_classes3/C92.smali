.class public final LC92;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LB92;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LD92;",
            ">;"
        }
    .end annotation
.end field

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
            "Liy6;",
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
            "LD92;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Liy6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC92;->a:LY94;

    iput-object p2, p0, LC92;->b:LY94;

    iput-object p3, p0, LC92;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LC92;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LD92;",
            ">;",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Liy6;",
            ">;)",
            "LC92;"
        }
    .end annotation

    new-instance v0, LC92;

    invoke-direct {v0, p0, p1, p2}, LC92;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LD92;Le13;Liy6;)LB92;
    .locals 1

    new-instance v0, LB92;

    invoke-direct {v0, p0, p1, p2}, LB92;-><init>(LD92;Le13;Liy6;)V

    return-object v0
.end method


# virtual methods
.method public b()LB92;
    .locals 3

    iget-object v0, p0, LC92;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD92;

    iget-object v1, p0, LC92;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    iget-object v2, p0, LC92;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liy6;

    invoke-static {v0, v1, v2}, LC92;->c(LD92;Le13;Liy6;)LB92;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC92;->b()LB92;

    move-result-object v0

    return-object v0
.end method
