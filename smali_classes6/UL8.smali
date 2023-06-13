.class public abstract LUL8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LUL8;

.field public static final b:LUL8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LsM8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LsM8;-><init>(LNM8;)V

    sput-object v0, LUL8;->a:LUL8;

    new-instance v0, LbN8;

    invoke-direct {v0, v1}, LbN8;-><init>(LNM8;)V

    sput-object v0, LUL8;->b:LUL8;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LNM8;)V
    .locals 0

    invoke-direct {p0}, LUL8;-><init>()V

    return-void
.end method

.method public static b()LUL8;
    .locals 1

    sget-object v0, LUL8;->a:LUL8;

    return-object v0
.end method

.method public static d()LUL8;
    .locals 1

    sget-object v0, LUL8;->b:LUL8;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "T",
            "L;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/Object;Ljava/lang/Object;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/Object;J)V
.end method
