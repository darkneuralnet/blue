.class public final Ldl3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcl3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTk3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwo3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAw3;",
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
            "LTk3;",
            ">;",
            "LY94<",
            "Lwo3;",
            ">;",
            "LY94<",
            "LAw3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldl3;->a:LY94;

    iput-object p2, p0, Ldl3;->b:LY94;

    iput-object p3, p0, Ldl3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Ldl3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "Lwo3;",
            ">;",
            "LY94<",
            "LAw3;",
            ">;)",
            "Ldl3;"
        }
    .end annotation

    new-instance v0, Ldl3;

    invoke-direct {v0, p0, p1, p2}, Ldl3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTk3;Lwo3;LAw3;)Lcl3;
    .locals 1

    new-instance v0, Lcl3;

    invoke-direct {v0, p0, p1, p2}, Lcl3;-><init>(LTk3;Lwo3;LAw3;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcl3;
    .locals 3

    iget-object v0, p0, Ldl3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTk3;

    iget-object v1, p0, Ldl3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwo3;

    iget-object v2, p0, Ldl3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAw3;

    invoke-static {v0, v1, v2}, Ldl3;->c(LTk3;Lwo3;LAw3;)Lcl3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldl3;->b()Lcl3;

    move-result-object v0

    return-object v0
.end method
