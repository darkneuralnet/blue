.class public final LWH2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LgH;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTH;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LTH;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWH2;->a:LVH2;

    iput-object p2, p0, LWH2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LTH;)LgH;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->a(LTH;)LgH;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LgH;

    return-object p0
.end method

.method public static b(LVH2;LY94;)LWH2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LTH;",
            ">;)",
            "LWH2;"
        }
    .end annotation

    new-instance v0, LWH2;

    invoke-direct {v0, p0, p1}, LWH2;-><init>(LVH2;LY94;)V

    return-object v0
.end method


# virtual methods
.method public c()LgH;
    .locals 2

    iget-object v0, p0, LWH2;->a:LVH2;

    iget-object v1, p0, LWH2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTH;

    invoke-static {v0, v1}, LWH2;->a(LVH2;LTH;)LgH;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWH2;->c()LgH;

    move-result-object v0

    return-object v0
.end method
