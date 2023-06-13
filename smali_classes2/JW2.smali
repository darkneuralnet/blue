.class public final LJW2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJW2;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LJW2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;)",
            "LJW2;"
        }
    .end annotation

    new-instance v0, LJW2;

    invoke-direct {v0, p0}, LJW2;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Le13;Lcom/uber/autodispose/ScopeProvider;LKW2;)LGW2;
    .locals 1

    new-instance v0, LGW2;

    invoke-direct {v0, p0, p1, p2}, LGW2;-><init>(Le13;Lcom/uber/autodispose/ScopeProvider;LKW2;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LKW2;)LGW2;
    .locals 1

    iget-object v0, p0, LJW2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {v0, p1, p2}, LJW2;->c(Le13;Lcom/uber/autodispose/ScopeProvider;LKW2;)LGW2;

    move-result-object p1

    return-object p1
.end method
