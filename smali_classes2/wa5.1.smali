.class public final Lwa5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lva5;


# instance fields
.field public final a:Lxa5;


# direct methods
.method public constructor <init>(Lxa5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwa5;->a:Lxa5;

    return-void
.end method

.method public static b(Lxa5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa5;",
            ")",
            "LY94<",
            "Lva5;",
            ">;"
        }
    .end annotation

    new-instance v0, Lwa5;

    invoke-direct {v0, p0}, Lwa5;-><init>(Lxa5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lya5;Lcom/uber/autodispose/ScopeProvider;)Lua5;
    .locals 1

    iget-object v0, p0, Lwa5;->a:Lxa5;

    invoke-virtual {v0, p1, p2}, Lxa5;->b(Lya5;Lcom/uber/autodispose/ScopeProvider;)Lua5;

    move-result-object p1

    return-object p1
.end method
