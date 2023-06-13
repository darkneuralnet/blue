.class public final Lr65;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaT3;",
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
            "LaT3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr65;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lr65;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LaT3;",
            ">;)",
            "Lr65;"
        }
    .end annotation

    new-instance v0, Lr65;

    invoke-direct {v0, p0}, Lr65;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LaT3;Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)Lo65;
    .locals 7

    new-instance v6, Lo65;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo65;-><init>(LaT3;Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)V

    return-object v6
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)Lo65;
    .locals 1

    iget-object v0, p0, Lr65;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaT3;

    invoke-static {v0, p1, p2, p3, p4}, Lr65;->c(LaT3;Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)Lo65;

    move-result-object p1

    return-object p1
.end method
