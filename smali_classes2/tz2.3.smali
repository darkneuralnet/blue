.class public final Ltz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsz2;


# instance fields
.field public final a:Luz2;


# direct methods
.method public constructor <init>(Luz2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltz2;->a:Luz2;

    return-void
.end method

.method public static b(Luz2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luz2;",
            ")",
            "LY94<",
            "Lsz2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltz2;

    invoke-direct {v0, p0}, Ltz2;-><init>(Luz2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;)Lrz2;
    .locals 1

    iget-object v0, p0, Ltz2;->a:Luz2;

    invoke-virtual {v0, p1}, Luz2;->b(Lcom/uber/autodispose/ScopeProvider;)Lrz2;

    move-result-object p1

    return-object p1
.end method
