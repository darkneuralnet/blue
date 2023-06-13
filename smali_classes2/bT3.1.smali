.class public final LbT3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LaT3;


# instance fields
.field public final a:LcT3;


# direct methods
.method public constructor <init>(LcT3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbT3;->a:LcT3;

    return-void
.end method

.method public static b(LcT3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcT3;",
            ")",
            "LY94<",
            "LaT3;",
            ">;"
        }
    .end annotation

    new-instance v0, LbT3;

    invoke-direct {v0, p0}, LbT3;-><init>(LcT3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LdT3;)LZS3;
    .locals 1

    iget-object v0, p0, LbT3;->a:LcT3;

    invoke-virtual {v0, p1, p2}, LcT3;->b(Lcom/uber/autodispose/ScopeProvider;LdT3;)LZS3;

    move-result-object p1

    return-object p1
.end method
