.class public final LFw9;
.super Len7;
.source "SourceFile"


# direct methods
.method public constructor <init>(LJx9;Ljava/lang/String;)V
    .locals 0

    const-string p1, "getVersion"

    invoke-direct {p0, p1}, Len7;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 2

    new-instance p1, Lkm7;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-direct {p1, p2}, Lkm7;-><init>(Ljava/lang/Double;)V

    return-object p1
.end method
