.class public final synthetic LlR1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LcR1;

.field public final synthetic c:Lco/bird/android/model/persistence/BrainSwapRecord;


# direct methods
.method public synthetic constructor <init>(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlR1;->b:LcR1;

    iput-object p2, p0, LlR1;->c:Lco/bird/android/model/persistence/BrainSwapRecord;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LlR1;->b:LcR1;

    iget-object v1, p0, LlR1;->c:Lco/bird/android/model/persistence/BrainSwapRecord;

    invoke-static {v0, v1}, LcR1$l;->b(LcR1;Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
