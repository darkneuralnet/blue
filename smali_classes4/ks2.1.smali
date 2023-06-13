.class public final synthetic Lks2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lls2;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lls2;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lks2;->b:Lls2;

    iput-object p2, p0, Lks2;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lks2;->b:Lls2;

    iget-object v1, p0, Lks2;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lls2;->b(Lls2;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
