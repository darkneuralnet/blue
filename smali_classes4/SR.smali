.class public final synthetic LSR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LgS;

.field public final synthetic c:Lco/bird/android/model/persistence/Bird;


# direct methods
.method public synthetic constructor <init>(LgS;Lco/bird/android/model/persistence/Bird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSR;->b:LgS;

    iput-object p2, p0, LSR;->c:Lco/bird/android/model/persistence/Bird;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LSR;->b:LgS;

    iget-object v1, p0, LSR;->c:Lco/bird/android/model/persistence/Bird;

    invoke-static {v0, v1}, LgS;->K1(LgS;Lco/bird/android/model/persistence/Bird;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
