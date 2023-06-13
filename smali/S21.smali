.class public LS21;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LTe4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LTe4;

    invoke-static {}, LW21;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, LTe4;-><init>(Ljava/util/List;)V

    sput-object v0, LS21;->a:LTe4;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Class;)LSe4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LSe4;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, LS21;->a:LTe4;

    invoke-virtual {v0, p0}, LTe4;->b(Ljava/lang/Class;)LSe4;

    move-result-object p0

    return-object p0
.end method

.method public static b()LTe4;
    .locals 1

    sget-object v0, LS21;->a:LTe4;

    return-object v0
.end method
