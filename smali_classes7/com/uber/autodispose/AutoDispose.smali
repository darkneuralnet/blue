.class public final Lcom/uber/autodispose/AutoDispose;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "No instances"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/uber/autodispose/ScopeProvider;",
            ")",
            "Lcom/uber/autodispose/AutoDisposeConverter<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "provider == null"

    invoke-static {p0, v0}, Lcom/uber/autodispose/AutoDisposeUtil;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lcom/uber/autodispose/Scopes;->b(Lcom/uber/autodispose/ScopeProvider;)Lio/reactivex/c;

    move-result-object p0

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->b(Lio/reactivex/h;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lio/reactivex/h;)Lcom/uber/autodispose/AutoDisposeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/h;",
            ")",
            "Lcom/uber/autodispose/AutoDisposeConverter<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scope == null"

    invoke-static {p0, v0}, Lcom/uber/autodispose/AutoDisposeUtil;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lcom/uber/autodispose/AutoDispose$1;

    invoke-direct {v0, p0}, Lcom/uber/autodispose/AutoDispose$1;-><init>(Lio/reactivex/h;)V

    return-object v0
.end method
