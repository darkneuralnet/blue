.class public final Lyy4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxy4;


# instance fields
.field public final a:Lzy4;


# direct methods
.method public constructor <init>(Lzy4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyy4;->a:Lzy4;

    return-void
.end method

.method public static b(Lzy4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzy4;",
            ")",
            "LY94<",
            "Lxy4;",
            ">;"
        }
    .end annotation

    new-instance v0, Lyy4;

    invoke-direct {v0, p0}, Lyy4;-><init>(Lzy4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)Lwy4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQA2;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lpz2<",
            "LBx4;",
            ">;",
            "Le13;",
            ")",
            "Lwy4;"
        }
    .end annotation

    iget-object v0, p0, Lyy4;->a:Lzy4;

    invoke-virtual {v0, p1, p2, p3, p4}, Lzy4;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)Lwy4;

    move-result-object p1

    return-object p1
.end method
