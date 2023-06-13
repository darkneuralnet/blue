.class public abstract LAT7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LAT7;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, LZP8;->z()LZP8;

    move-result-object v0

    invoke-static {}, Lsu9;->D()Lsu9;

    move-result-object v1

    new-instance v2, LrS7;

    invoke-direct {v2, v0, v1}, LrS7;-><init>(LZP8;Lsu9;)V

    sput-object v2, LAT7;->a:LAT7;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(LZP8;Lsu9;)LAT7;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZP8<",
            "LAu9;",
            ">;",
            "Lsu9;",
            ")",
            "LAT7;"
        }
    .end annotation

    new-instance v0, LrS7;

    invoke-direct {v0, p0, p1}, LrS7;-><init>(LZP8;Lsu9;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()LZP8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZP8<",
            "LAu9;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lsu9;
.end method
