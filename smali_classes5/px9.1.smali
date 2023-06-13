.class public final Lpx9;
.super Lry9;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    new-instance v0, LMn7;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, LMn7;-><init>(I)V

    invoke-direct {p0, v0}, Lry9;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static q()Lpx9;
    .locals 1

    new-instance v0, Lpx9;

    invoke-direct {v0}, Lpx9;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic c()Ljava/util/Collection;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method
