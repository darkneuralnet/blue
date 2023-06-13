.class public final Li54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh54;


# instance fields
.field public final a:Lj54;


# direct methods
.method public constructor <init>(Lj54;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li54;->a:Lj54;

    return-void
.end method

.method public static b(Lj54;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj54;",
            ")",
            "LY94<",
            "Lh54;",
            ">;"
        }
    .end annotation

    new-instance v0, Li54;

    invoke-direct {v0, p0}, Li54;-><init>(Lj54;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Ln54;)Lg54;
    .locals 1

    iget-object v0, p0, Li54;->a:Lj54;

    invoke-virtual {v0, p1, p2}, Lj54;->b(Lcom/uber/autodispose/ScopeProvider;Ln54;)Lg54;

    move-result-object p1

    return-object p1
.end method
