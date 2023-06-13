.class public LtI1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LEs0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEs0<",
            "*>;"
        }
    .end annotation

    new-instance v0, LtI1$a;

    invoke-direct {v0}, LtI1$a;-><init>()V

    const-class v1, LsI1;

    invoke-static {v0, v1}, LEs0;->l(Ljava/lang/Object;Ljava/lang/Class;)LEs0;

    move-result-object v0

    return-object v0
.end method
