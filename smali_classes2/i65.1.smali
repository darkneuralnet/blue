.class public final Li65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh65;


# instance fields
.field public final a:Lj65;


# direct methods
.method public constructor <init>(Lj65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li65;->a:Lj65;

    return-void
.end method

.method public static b(Lj65;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj65;",
            ")",
            "LY94<",
            "Lh65;",
            ">;"
        }
    .end annotation

    new-instance v0, Li65;

    invoke-direct {v0, p0}, Li65;-><init>(Lj65;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)Lg65;
    .locals 1

    iget-object v0, p0, Li65;->a:Lj65;

    invoke-virtual {v0, p1, p2, p3}, Lj65;->b(Lcom/uber/autodispose/ScopeProvider;LZr1;LP75;)Lg65;

    move-result-object p1

    return-object p1
.end method
