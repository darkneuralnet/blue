.class public final synthetic LAg1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/Map$Entry;

.field public final synthetic c:Lxg1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lxg1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAg1;->b:Ljava/util/Map$Entry;

    iput-object p2, p0, LAg1;->c:Lxg1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LAg1;->b:Ljava/util/Map$Entry;

    iget-object v1, p0, LAg1;->c:Lxg1;

    invoke-static {v0, v1}, LCg1;->d(Ljava/util/Map$Entry;Lxg1;)V

    return-void
.end method
