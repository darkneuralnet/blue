.class public final Lq65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp65;


# instance fields
.field public final a:Lr65;


# direct methods
.method public constructor <init>(Lr65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq65;->a:Lr65;

    return-void
.end method

.method public static b(Lr65;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr65;",
            ")",
            "LY94<",
            "Lp65;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq65;

    invoke-direct {v0, p0}, Lq65;-><init>(Lr65;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)Lo65;
    .locals 1

    iget-object v0, p0, Lq65;->a:Lr65;

    invoke-virtual {v0, p1, p2, p3, p4}, Lr65;->b(Lcom/uber/autodispose/ScopeProvider;Lt65;Le13;Lco/bird/android/model/wire/WirePhysicalLock;)Lo65;

    move-result-object p1

    return-object p1
.end method
