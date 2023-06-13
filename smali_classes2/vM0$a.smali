.class public final LvM0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU23$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LvM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LuM0;)V
    .locals 0

    invoke-direct {p0}, LvM0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lio/reactivex/subjects/g;)LU23;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lio/reactivex/subjects/g<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "LU23;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LvM0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LvM0$b;-><init>(LlG2;Lio/reactivex/subjects/g;LwM0;)V

    return-object v0
.end method
