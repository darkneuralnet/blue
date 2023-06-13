.class public final LLO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKO;


# instance fields
.field public final a:LMO;


# direct methods
.method public constructor <init>(LMO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLO;->a:LMO;

    return-void
.end method

.method public static b(LMO;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMO;",
            ")",
            "LY94<",
            "LKO;",
            ">;"
        }
    .end annotation

    new-instance v0, LLO;

    invoke-direct {v0, p0}, LLO;-><init>(LMO;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapBirdUi;LTq4;LZr1;)LJO;
    .locals 1

    iget-object v0, p0, LLO;->a:LMO;

    invoke-virtual {v0, p1, p2, p3, p4}, LMO;->b(Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/MapBirdUi;LTq4;LZr1;)LJO;

    move-result-object p1

    return-object p1
.end method
