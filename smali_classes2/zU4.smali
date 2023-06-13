.class public final LzU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyU4;


# instance fields
.field public final a:LAU4;


# direct methods
.method public constructor <init>(LAU4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzU4;->a:LAU4;

    return-void
.end method

.method public static b(LAU4;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAU4;",
            ")",
            "LY94<",
            "LyU4;",
            ">;"
        }
    .end annotation

    new-instance v0, LzU4;

    invoke-direct {v0, p0}, LzU4;-><init>(LAU4;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LBU4;)LxU4;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Ljava/util/List<",
            "Lco/bird/api/response/BeginnerModeRiderMapAction;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LBU4;",
            ")",
            "LxU4;"
        }
    .end annotation

    iget-object v0, p0, LzU4;->a:LAU4;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LAU4;->b(Lcom/uber/autodispose/ScopeProvider;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LBU4;)LxU4;

    move-result-object p1

    return-object p1
.end method
