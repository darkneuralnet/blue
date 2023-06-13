.class public final LVB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LUB0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWB0;",
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
            "LWB0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVB0;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LVB0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LWB0;",
            ">;)",
            "LVB0;"
        }
    .end annotation

    new-instance v0, LVB0;

    invoke-direct {v0, p0}, LVB0;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LWB0;)LUB0;
    .locals 1

    new-instance v0, LUB0;

    invoke-direct {v0, p0}, LUB0;-><init>(LWB0;)V

    return-object v0
.end method


# virtual methods
.method public b()LUB0;
    .locals 1

    iget-object v0, p0, LVB0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LWB0;

    invoke-static {v0}, LVB0;->c(LWB0;)LUB0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVB0;->b()LUB0;

    move-result-object v0

    return-object v0
.end method
