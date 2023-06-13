.class public final synthetic LnT1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LAT1;

.field public final synthetic c:LoU1;


# direct methods
.method public synthetic constructor <init>(LAT1;LoU1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnT1;->b:LAT1;

    iput-object p2, p0, LnT1;->c:LoU1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LnT1;->b:LAT1;

    iget-object v1, p0, LnT1;->c:LoU1;

    invoke-static {v0, v1}, LAT1;->p(LAT1;LoU1;)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method
