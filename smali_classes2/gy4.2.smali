.class public final Lgy4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy4;


# instance fields
.field public final a:Lhy4;


# direct methods
.method public constructor <init>(Lhy4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgy4;->a:Lhy4;

    return-void
.end method

.method public static b(Lhy4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhy4;",
            ")",
            "LY94<",
            "Lfy4;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgy4;

    invoke-direct {v0, p0}, Lgy4;-><init>(Lhy4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;Liy4;)Ley4;
    .locals 1

    iget-object v0, p0, Lgy4;->a:Lhy4;

    invoke-virtual {v0, p1, p2, p3}, Lhy4;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;Liy4;)Ley4;

    move-result-object p1

    return-object p1
.end method
