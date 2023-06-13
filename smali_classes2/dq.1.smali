.class public final Ldq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        LKp;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Ldq;",
        "",
        "Lgl;",
        "appPreference",
        "LRh6;",
        "userStream",
        "LLp;",
        "authClient",
        "Lhq;",
        "b",
        "preference",
        "LMN4;",
        "retrofit",
        "a",
        "LVo2;",
        "c",
        "<init>",
        "()V",
        "auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgl;LMN4;)LLp;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrofit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LMN4;->d()LMN4$b;

    move-result-object p2

    invoke-virtual {p1}, Lgl;->O()Luf1;

    move-result-object p1

    invoke-static {p1}, LAf1;->a(Luf1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, LMN4$b;->c(Ljava/lang/String;)LMN4$b;

    move-result-object p1

    invoke-virtual {p1}, LMN4$b;->e()LMN4;

    move-result-object p1

    const-class p2, LLp;

    invoke-virtual {p1, p2}, LMN4;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "retrofit.newBuilder()\n  \u2026e(AuthClient::class.java)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LLp;

    return-object p1
.end method

.method public final b(Lgl;LRh6;LLp;)Lhq;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "appPreference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrq;

    invoke-direct {v0, p1, p2, p3}, Lrq;-><init>(Lgl;LRh6;LLp;)V

    return-object v0
.end method

.method public final c(LMN4;)LVo2;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    const-string v0, "retrofit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, LVo2;

    invoke-virtual {p1, v0}, LMN4;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "retrofit.create(LegacyAuthClient::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LVo2;

    return-object p1
.end method
