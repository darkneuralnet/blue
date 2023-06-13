.class public final LUI6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LTI6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lot5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWI6;",
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
            "Lot5;",
            ">;",
            "LY94<",
            "LWI6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUI6;->a:LY94;

    iput-object p2, p0, LUI6;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LUI6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lot5;",
            ">;",
            "LY94<",
            "LWI6;",
            ">;)",
            "LUI6;"
        }
    .end annotation

    new-instance v0, LUI6;

    invoke-direct {v0, p0, p1}, LUI6;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lot5;LWI6;)LTI6;
    .locals 1

    new-instance v0, LTI6;

    invoke-direct {v0, p0, p1}, LTI6;-><init>(Lot5;LWI6;)V

    return-object v0
.end method


# virtual methods
.method public b()LTI6;
    .locals 2

    iget-object v0, p0, LUI6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lot5;

    iget-object v1, p0, LUI6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWI6;

    invoke-static {v0, v1}, LUI6;->c(Lot5;LWI6;)LTI6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUI6;->b()LTI6;

    move-result-object v0

    return-object v0
.end method
