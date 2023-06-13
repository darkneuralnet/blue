.class public abstract LXT7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LXT7;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, LvQ8;->c()LvQ8;

    move-result-object v0

    invoke-static {}, Lwu9;->y()Lwu9;

    move-result-object v1

    new-instance v2, LHS7;

    invoke-direct {v2, v0, v1}, LHS7;-><init>(LvQ8;Lwu9;)V

    sput-object v2, LXT7;->a:LXT7;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(LvQ8;Lwu9;)LXT7;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LvQ8<",
            "Ljava/lang/Integer;",
            "Lnh9;",
            ">;",
            "Lwu9;",
            ")",
            "LXT7;"
        }
    .end annotation

    new-instance v0, LHS7;

    invoke-direct {v0, p0, p1}, LHS7;-><init>(LvQ8;Lwu9;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()LvQ8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LvQ8<",
            "Ljava/lang/Integer;",
            "Lnh9;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lwu9;
.end method
