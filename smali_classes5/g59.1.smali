.class public final Lg59;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:LD99;


# direct methods
.method public constructor <init>(Ljava/lang/String;LD99;)V
    .locals 2

    const-string p1, "internal.remoteConfig"

    invoke-direct {p0, p1}, Len7;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lg59;->d:LD99;

    iget-object p1, p0, Len7;->c:Ljava/util/Map;

    new-instance v0, LIZ8;

    const-string v1, "getValue"

    invoke-direct {v0, p0, v1, p2}, LIZ8;-><init>(Lg59;Ljava/lang/String;LD99;)V

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 0

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1
.end method
