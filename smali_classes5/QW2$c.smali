.class public LQW2$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQW2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;LgY3;)LPW2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "LWU2<",
            "TModel;TData;>;>;",
            "LgY3<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)",
            "LPW2<",
            "TModel;TData;>;"
        }
    .end annotation

    new-instance v0, LPW2;

    invoke-direct {v0, p1, p2}, LPW2;-><init>(Ljava/util/List;LgY3;)V

    return-object v0
.end method
