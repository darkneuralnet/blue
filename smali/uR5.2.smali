.class public abstract LuR5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LuR5$a;
    }
.end annotation


# static fields
.field public static final a:LuR5;

.field public static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:LZd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZd3<",
            "LuR5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    sget-object v0, LuR5$a;->c:LuR5$a;

    const/4 v1, 0x0

    invoke-static {v1, v0}, LuR5;->c(ILuR5$a;)LuR5;

    move-result-object v0

    sput-object v0, LuR5;->a:LuR5;

    new-instance v0, Ljava/util/HashSet;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Integer;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LuR5;->b:Ljava/util/Set;

    sget-object v0, LuR5$a;->b:LuR5$a;

    invoke-static {v1, v0}, LuR5;->c(ILuR5$a;)LuR5;

    move-result-object v0

    invoke-static {v0}, LQy0;->f(Ljava/lang/Object;)LZd3;

    move-result-object v0

    sput-object v0, LuR5;->c:LZd3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(ILuR5$a;)LuR5;
    .locals 1

    new-instance v0, Lhu;

    invoke-direct {v0, p0, p1}, Lhu;-><init>(ILuR5$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()LuR5$a;
.end method
