.class public final Lsa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lra;


# instance fields
.field public final a:Lta;


# direct methods
.method public constructor <init>(Lta;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsa;->a:Lta;

    return-void
.end method

.method public static b(Lta;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lta;",
            ")",
            "LY94<",
            "Lra;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsa;

    invoke-direct {v0, p0}, Lsa;-><init>(Lta;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Le13;Lua;)Lqa;
    .locals 1

    iget-object v0, p0, Lsa;->a:Lta;

    invoke-virtual {v0, p1, p2, p3}, Lta;->b(Lcom/uber/autodispose/ScopeProvider;Le13;Lua;)Lqa;

    move-result-object p1

    return-object p1
.end method
