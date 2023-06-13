.class public final LJx9;
.super Len7;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "internal.platform"

    invoke-direct {p0, v0}, Len7;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Len7;->c:Ljava/util/Map;

    new-instance v1, LFw9;

    const-string v2, "getVersion"

    invoke-direct {v1, p0, v2}, LFw9;-><init>(LJx9;Ljava/lang/String;)V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 0

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1
.end method
