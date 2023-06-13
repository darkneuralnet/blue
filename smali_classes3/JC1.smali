.class public final LJC1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LIC1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LV74;",
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


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LV74;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJC1;->a:LY94;

    iput-object p2, p0, LJC1;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LJC1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LV74;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LJC1;"
        }
    .end annotation

    new-instance v0, LJC1;

    invoke-direct {v0, p0, p1}, LJC1;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(LV74;Le13;)LIC1;
    .locals 1

    new-instance v0, LIC1;

    invoke-direct {v0, p0, p1}, LIC1;-><init>(LV74;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b()LIC1;
    .locals 2

    iget-object v0, p0, LJC1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV74;

    iget-object v1, p0, LJC1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le13;

    invoke-static {v0, v1}, LJC1;->c(LV74;Le13;)LIC1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJC1;->b()LIC1;

    move-result-object v0

    return-object v0
.end method
