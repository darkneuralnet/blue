.class public final synthetic Lca6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lga6;

.field public final synthetic c:LL73;

.field public final synthetic d:Lim;


# direct methods
.method public synthetic constructor <init>(Lga6;LL73;Lim;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca6;->b:Lga6;

    iput-object p2, p0, Lca6;->c:LL73;

    iput-object p3, p0, Lca6;->d:Lim;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lca6;->b:Lga6;

    iget-object v1, p0, Lca6;->c:LL73;

    iget-object v2, p0, Lca6;->d:Lim;

    invoke-static {v0, v1, v2}, Lga6;->e(Lga6;LL73;Lim;)V

    return-void
.end method
