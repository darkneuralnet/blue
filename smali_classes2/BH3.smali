.class public final LBH3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LBH3;
    .locals 1

    new-instance v0, LBH3;

    invoke-direct {v0}, LBH3;-><init>()V

    return-object v0
.end method

.method public static c(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)LyH3;
    .locals 1

    new-instance v0, LyH3;

    invoke-direct {v0, p0, p1, p2}, LyH3;-><init>(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)LyH3;
    .locals 0

    invoke-static {p1, p2, p3}, LBH3;->c(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)LyH3;

    move-result-object p1

    return-object p1
.end method
