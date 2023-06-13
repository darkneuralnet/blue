.class public final LAH3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzH3;


# instance fields
.field public final a:LBH3;


# direct methods
.method public constructor <init>(LBH3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAH3;->a:LBH3;

    return-void
.end method

.method public static b(LBH3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBH3;",
            ")",
            "LY94<",
            "LzH3;",
            ">;"
        }
    .end annotation

    new-instance v0, LAH3;

    invoke-direct {v0, p0}, LAH3;-><init>(LBH3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)LyH3;
    .locals 1

    iget-object v0, p0, LAH3;->a:LBH3;

    invoke-virtual {v0, p1, p2, p3}, LBH3;->b(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)LyH3;

    move-result-object p1

    return-object p1
.end method
