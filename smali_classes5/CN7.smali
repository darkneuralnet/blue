.class public final LCN7;
.super LIT7;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    invoke-direct {p0, p1}, LIT7;-><init>(Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method